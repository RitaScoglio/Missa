package sk.missa.calendar

import sk.missa.calendar.celebration.LiturgicalColor
import sk.missa.calendar.celebration.MovableCelebration

/** Rules and anchor dates for one liturgical year. */
class LiturgicalYear private constructor(
    val year: Int,
    val easter: LiturgicalDate,
    val ashWednesday: LiturgicalDate,
    val adventStart: LiturgicalDate,
    val baptismOfTheLord: LiturgicalDate,
) {
    fun season(date: LiturgicalDate): LiturgicalSeason = when {
        date <= baptismOfTheLord || date >= LiturgicalDate.of(year, 12, 25) -> LiturgicalSeason.CHRISTMAS
        date >= adventStart -> LiturgicalSeason.ADVENT
        date >= ashWednesday && date < easter -> LiturgicalSeason.LENT
        date in easter..easter.plusDays(49) -> LiturgicalSeason.EASTER
        else -> LiturgicalSeason.ORDINARY_TIME
    }

    fun baseObservance(date: LiturgicalDate): BaseObservance = BaseObservance(baseTitle(date, season(date)), when (date) { easter.minusDays(3) -> LiturgicalColor.GREEN; easter.minusDays(2) -> LiturgicalColor.RED; else -> colorFor(season(date)) }, date.isSunday())

    /** Calendar-owned coordinates for the Ordinary Time content, when applicable. */
    fun ordinaryContext(date: LiturgicalDate): OrdinaryContext? {
        require(date.year == year) { "Date is outside this calendar year" }
        if (season(date) != LiturgicalSeason.ORDINARY_TIME) return null
        val sundayCycle = when (year % 3) { 1 -> "A"; 2 -> "B"; else -> "C" }
        val weekdayCycle = if (year % 2 == 0) "II" else "I"
        return OrdinaryContext(
            week = ordinaryWeek(date),
            dayOfWeek = listOf("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY")[date.weekdayNumber()],
            sundayCycle = sundayCycle,
            weekdayCycle = weekdayCycle,
        )
    }

    /** Calendar-owned coordinates for the non-Ordinary seasonal content. */
    fun seasonalContext(date: LiturgicalDate): SeasonalDayContext? {
        require(date.year == year) { "Date is outside this calendar year" }
        val season = season(date)
        if (season == LiturgicalSeason.ORDINARY_TIME) return null
        val week = when (season) {
            LiturgicalSeason.ADVENT -> weeksSince(adventStart, date)
            LiturgicalSeason.LENT -> (daysSince(ashWednesday, date) + 3) / 7
            LiturgicalSeason.EASTER -> weeksSince(easter, date)
            LiturgicalSeason.CHRISTMAS -> if (date.month == 1 && date.dayOfMonth in 2..5 && date.isSunday()) 2 else null
            LiturgicalSeason.ORDINARY_TIME -> null
        }
        val liturgicalYear = if (date >= adventStart) year + 1 else year
        val cycle = when (liturgicalYear % 3) { 1 -> "A"; 2 -> "B"; else -> "C" }
        return SeasonalDayContext(season, week, date.weekdayNumber(), cycle, date.month, date.dayOfMonth)
    }

    fun dateOf(celebration: MovableCelebration): LiturgicalDate = when (celebration) {
        MovableCelebration.SAINT_JOSEPH -> LiturgicalDate.of(year, 3, 19).let { date ->
            if (date in easter.minusDays(7)..easter.minusDays(1)) easter.minusDays(8) else nextMondayIfSunday(date)
        }
        MovableCelebration.ANNUNCIATION -> transferFromHolyWeek(LiturgicalDate.of(year, 3, 25))
        MovableCelebration.PENTECOST_VIGIL -> easter.plusDays(48)
        MovableCelebration.PENTECOST -> easter.plusDays(49)
        MovableCelebration.CORPUS_CHRISTI -> easter.plusDays(60)
        MovableCelebration.SACRED_HEART -> easter.plusDays(68)
        MovableCelebration.ASCENSION_VIGIL -> easter.plusDays(38)
        MovableCelebration.ASCENSION -> easter.plusDays(39)
        MovableCelebration.TRINITY_SUNDAY -> easter.plusDays(56)
        MovableCelebration.CHRIST_THE_KING -> adventStart.minusDays(7)
        MovableCelebration.IMMACULATE_CONCEPTION -> nextMondayIfSunday(LiturgicalDate.of(year, 12, 8))
        MovableCelebration.HOLY_FAMILY -> holyFamily()
        MovableCelebration.BAPTISM_OF_THE_LORD -> baptismOfTheLord
        MovableCelebration.PENTECOST_MONDAY_VOTIVE, MovableCelebration.MARY_MOTHER_OF_THE_CHURCH -> easter.plusDays(50)
        MovableCelebration.CHRIST_ETERNAL_HIGH_PRIEST -> easter.plusDays(53)
        MovableCelebration.IMMACULATE_HEART_OF_MARY -> easter.plusDays(69)
        MovableCelebration.NITRA_CATHEDRAL_DEDICATION -> nextMondayIfSunday(LiturgicalDate.of(year, 11, 20))
    }

    private fun baseTitle(date: LiturgicalDate, season: LiturgicalSeason): String = when {
        date == ashWednesday -> "Popolcová streda"
        date == easter -> "Veľkonočná nedeľa"
        date in easter.plusDays(1)..easter.plusDays(7) -> "${dayName(date)} vo Veľkonočnej oktáve"
        date == easter.minusDays(3) -> "Štvrtok Pánovej večere"
        date == easter.minusDays(2) -> "Piatok utrpenia Pána"
        date == easter.minusDays(1) -> "Biela sobota"
        season == LiturgicalSeason.ADVENT -> adventTitle(date)
        season == LiturgicalSeason.LENT -> lentTitle(date)
        season == LiturgicalSeason.EASTER -> easterTitle(date)
        season == LiturgicalSeason.CHRISTMAS -> christmasTitle(date)
        date.isSunday() -> "${ordinal(ordinaryWeek(date))} nedeľa v Cezročnom období"
        else -> "${dayName(date)} ${ordinal(ordinaryWeek(date))} týždňa v Cezročnom období"
    }

    private fun adventTitle(date: LiturgicalDate): String {
        val week = weeksSince(adventStart, date)
        return if (date.isSunday()) "${ordinal(week)} adventná nedeľa" + if (week == 3) " (Gaudete)" else "" else "${dayName(date)} ${ordinal(week)} týždňa v adventnom období"
    }
    private fun lentTitle(date: LiturgicalDate): String {
        val days = daysSince(ashWednesday, date)
        if (days in 1..3) return "${dayName(date)} po Popolcovej strede"
        val week = (days + 3) / 7
        return when {
            date.isSunday() && week == 6 -> "Palmová (Kvetná) nedeľa"
            date.isSunday() -> "${ordinal(week)} pôstna nedeľa" + if (week == 4) " (Laetare)" else ""
            else -> "${dayName(date)} po ${ordinal(week)} pôstnej nedeli"
        }
    }
    private fun easterTitle(date: LiturgicalDate): String {
        val week = weeksSince(easter, date)
        return if (date.isSunday()) "${ordinal(week)} veľkonočná nedeľa" + if (week == 2) " (Nedeľa Božieho milosrdenstva)" else "" else "${dayName(date)} po ${ordinal(week)} veľkonočnej nedeli"
    }
    private fun christmasTitle(date: LiturgicalDate): String {
        val christmas = LiturgicalDate.of(year, 12, 25)
        if (date in christmas.plusDays(1)..christmas.plusDays(7)) return "${ordinal(daysSince(christmas, date) + 1)} deň oktávy Narodenia Pána"
        return when {
            date.isSunday() -> "Nedeľa po Narodení Pána"
            date > LiturgicalDate.of(year, 1, 6) -> "${dayName(date)} po Zjavení Pána"
            else -> "${dayName(date)} vo Vianočnom období"
        }
    }

    private fun transferFromHolyWeek(date: LiturgicalDate): LiturgicalDate = when {
        date in easter.minusDays(7)..easter.plusDays(7) -> easter.plusDays(8)
        date.isSunday() && date in ashWednesday..easter.minusDays(1) -> date.plusDays(1)
        else -> date
    }
    private fun holyFamily(): LiturgicalDate {
        val christmas = LiturgicalDate.of(year, 12, 25)
        val sunday = christmas.plusDays(7 - christmas.weekdayNumber())
        return if (sunday.dayOfMonth in setOf(1, 25)) LiturgicalDate.of(year, 12, 30) else sunday
    }
    private fun ordinaryWeek(date: LiturgicalDate): Int {
        val firstOrdinaryMonday = baptismOfTheLord.plusDays(1)
        if (date < ashWednesday) {
            return 1 + daysSince(firstOrdinaryMonday, date) / 7 + if (date.isSunday()) 1 else 0
        }
        val nextSunday = date.plusDays((7 - date.weekdayNumber()) % 7)
        val weeksUntilAdvent = daysSince(nextSunday, adventStart) / 7
        return if (date.isSunday()) 35 - weeksUntilAdvent else 34 - weeksUntilAdvent
    }
    private fun weeksSince(start: LiturgicalDate, date: LiturgicalDate) = daysSince(start, date) / 7 + 1
    private fun daysSince(start: LiturgicalDate, end: LiturgicalDate) = start.daysUntil(end).coerceAtLeast(0)
    private fun nextMondayIfSunday(date: LiturgicalDate) = if (date.isSunday()) date.plusDays(1) else date
    private fun dayName(date: LiturgicalDate) = listOf("Nedeľa", "Pondelok", "Utorok", "Streda", "Štvrtok", "Piatok", "Sobota")[date.weekdayNumber()]
    private fun ordinal(value: Int) = "${value}."
    private fun colorFor(season: LiturgicalSeason) = when (season) {
        LiturgicalSeason.ADVENT, LiturgicalSeason.LENT -> LiturgicalColor.VIOLET
        LiturgicalSeason.CHRISTMAS, LiturgicalSeason.EASTER -> LiturgicalColor.WHITE
        LiturgicalSeason.ORDINARY_TIME -> LiturgicalColor.GREEN
    }

    companion object {
        fun of(year: Int): LiturgicalYear {
            val easter = EasterCalculator().easterSunday(year)
            val christmas = LiturgicalDate.of(year, 12, 25)
            val sundayOffset = christmas.weekdayNumber().takeIf { it != 0 } ?: 7
            val epiphany = LiturgicalDate.of(year, 1, 6)
            return LiturgicalYear(year, easter, easter.minusDays(46), christmas.minusDays(sundayOffset + 21), epiphany.plusDays(7 - epiphany.weekdayNumber()))
        }
    }
}

data class OrdinaryContext(
    val week: Int,
    val dayOfWeek: String,
    val sundayCycle: String,
    val weekdayCycle: String,
)

data class SeasonalDayContext(
    val season: LiturgicalSeason,
    val week: Int?,
    /** Sunday is zero, Monday is one. */
    val weekdayNumber: Int,
    val sundayCycle: String,
    val month: Int,
    val dayOfMonth: Int,
)
