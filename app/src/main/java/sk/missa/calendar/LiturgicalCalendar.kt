package sk.missa.calendar

import sk.missa.calendar.celebration.Celebration
import sk.missa.calendar.celebration.CelebrationCatalog
import sk.missa.calendar.celebration.CelebrationDate
import sk.missa.calendar.celebration.CelebrationId
import sk.missa.calendar.celebration.CelebrationProperty
import sk.missa.calendar.celebration.CelebrationRank
import sk.missa.calendar.celebration.CelebrationScope
import sk.missa.calendar.celebration.DioceseId
import sk.missa.calendar.celebration.LiturgicalColor
import sk.missa.calendar.celebration.LiturgicalElement
import sk.missa.calendar.celebration.MovableCelebration

/** Resolves the liturgy and optional observances for civil calendar dates. */
class LiturgicalCalendar(private val catalog: CelebrationCatalog) {
    fun resolve(date: LiturgicalDate, jurisdiction: DioceseId? = null, localityId: String? = null, inCathedral: Boolean = false, evening: Boolean = false): LiturgicalDay {
        val year = LiturgicalYear.of(date.year)
        val base = year.baseObservance(date)
        val candidates = celebrationsOn(date, year).filter { it.appliesTo(jurisdiction, localityId, inCathedral) }
            .filter { it.rank != CelebrationRank.VIGIL || evening }
        val selection = selectCelebrations(date, year, base, candidates)
        return LiturgicalDay(date, year.season(date), base, selection.primary, selection.alternatives, selection.suppressed, generatedObservances(date, year, selection.primary?.rank))
    }

    /** Local feasts remain browseable without changing the user's general calendar. */
    fun localCelebrations(date: LiturgicalDate): List<Celebration> {
        val year = LiturgicalYear.of(date.year)
        val base = year.baseObservance(date)
        return celebrationsOn(date, year).filter { it.scope != CelebrationScope.Universal && it.isAllowedOn(date, year, base) }
    }

    fun resolveCelebration(date: LiturgicalDate, id: String, jurisdiction: DioceseId? = null,
        localityId: String? = null, inCathedral: Boolean = false, evening: Boolean = false): LiturgicalDay {
        return when (val scope = catalog.findById(CelebrationId(id))?.scope) {
            is CelebrationScope.Dioceses -> resolve(date, jurisdiction?.takeIf { it in scope.ids } ?: scope.ids.first(), evening = evening)
            is CelebrationScope.Cathedral -> resolve(date, scope.diocese, inCathedral = true, evening = evening)
            is CelebrationScope.Locality -> resolve(date, scope.diocese, scope.localityId, evening = evening)
            else -> resolve(date, jurisdiction, localityId, inCathedral, evening)
        }
    }

    private fun celebrationsOn(date: LiturgicalDate, year: LiturgicalYear): List<Celebration> =
        fixedCelebrationsOn(date, year) + MovableCelebration.entries.flatMap { key -> catalog.movable(key).filter { year.dateOf(key) == date } }

    /** Slovakia moves John the Baptist to 23 June if Sacred Heart falls on 24 June. */
    private fun fixedCelebrationsOn(date: LiturgicalDate, year: LiturgicalYear): List<Celebration> {
        val johnBaptist = catalog.fixedOn(6, 24)
        val johnVigil = catalog.fixedOn(6, 23).filter { it.rank == CelebrationRank.VIGIL }
        val sacredHeartOnJune24 = year.dateOf(MovableCelebration.SACRED_HEART) == LiturgicalDate.of(date.year, 6, 24)
        return when {
            sacredHeartOnJune24 && date == LiturgicalDate.of(date.year, 6, 22) -> catalog.fixedOn(6, 22) + johnVigil
            sacredHeartOnJune24 && date == LiturgicalDate.of(date.year, 6, 23) -> (catalog.fixedOn(6, 23) - johnVigil.toSet()) + johnBaptist
            sacredHeartOnJune24 && date == LiturgicalDate.of(date.year, 6, 24) -> catalog.fixedOn(6, 24) - johnBaptist.toSet()
            else -> catalog.fixedOn(date.month, date.dayOfMonth)
        }
    }

    private fun selectCelebrations(date: LiturgicalDate, year: LiturgicalYear, base: BaseObservance, candidates: List<Celebration>): Selection {
        val allowed = candidates.filter { it.isAllowedOn(date, year, base) }.sortedByDescending { it.rank.precedence }
        val primary = allowed.firstOrNull { it.isPrimaryOver(date, year, base) }
        return Selection(primary, allowed.filterNot { it == primary }, candidates - allowed)
    }

    private fun Celebration.isAllowedOn(date: LiturgicalDate, year: LiturgicalYear, base: BaseObservance): Boolean {
        // Vigils reach this method only when the caller selected evening Mass.
        if (rank == CelebrationRank.VIGIL) return date != year.dateOf(MovableCelebration.SACRED_HEART)
        if ((this.date as? CelebrationDate.Movable)?.key == MovableCelebration.BAPTISM_OF_THE_LORD) return true
        if (date == year.ashWednesday || date in year.easter.minusDays(6)..year.easter.plusDays(7)) return false
        if (base.isSunday && year.season(date) in setOf(LiturgicalSeason.ADVENT, LiturgicalSeason.LENT)) return false
        if (base.isSunday && year.season(date) == LiturgicalSeason.EASTER) {
            return (this.date as? CelebrationDate.Movable)?.key == MovableCelebration.PENTECOST
        }
        return !(base.isSunday && rank != CelebrationRank.SOLEMNITY && CelebrationProperty.CELEBRATED_ON_SUNDAY !in properties)
    }

    private fun Celebration.isPrimaryOver(date: LiturgicalDate, year: LiturgicalYear, base: BaseObservance): Boolean = when {
        (this.date as? CelebrationDate.Movable)?.key == MovableCelebration.BAPTISM_OF_THE_LORD -> true
        year.season(date) == LiturgicalSeason.LENT && rank == CelebrationRank.MEMORIAL -> false
        date.month == 12 && date.dayOfMonth in 17..31 && rank == CelebrationRank.MEMORIAL -> false
        base.isSunday -> rank == CelebrationRank.SOLEMNITY || CelebrationProperty.CELEBRATED_ON_SUNDAY in properties
        else -> rank in setOf(CelebrationRank.SOLEMNITY, CelebrationRank.FEAST, CelebrationRank.MEMORIAL)
    }

    private fun generatedObservances(date: LiturgicalDate, year: LiturgicalYear, primaryRank: CelebrationRank?): List<GeneratedObservance> = buildList {
        val hasPrimaryCelebration = primaryRank != null
        val privileged = date == year.ashWednesday || date in year.easter.minusDays(6)..year.easter.plusDays(7)
        if (privileged) {
            addTriduumObservances(date, year)
            return@buildList
        }
        val allowsFirstWeekVotive = primaryRank !in setOf(CelebrationRank.FEAST, CelebrationRank.SOLEMNITY)
        if (allowsFirstWeekVotive && year.season(date) != LiturgicalSeason.LENT) addFirstWeekVotives(date, year)
        addSeasonalObservances(date, year, hasPrimaryCelebration)
        addEmberAndPrayerDays(date, year, primaryRank)
        addTriduumObservances(date, year)
    }

    private fun MutableList<GeneratedObservance>.addFirstWeekVotives(date: LiturgicalDate, year: LiturgicalYear) {
        if (date.dayOfMonth > 7) return
        when (date.weekdayNumber()) {
            4 -> add(GeneratedObservance("first-thursday", "Za duchovné povolania", colorFor(year.season(date)), CelebrationRank.VOTIVE_MASS))
            5 -> add(GeneratedObservance("first-friday", "O Najsvätejšom Srdci Ježišovom", LiturgicalColor.WHITE, CelebrationRank.VOTIVE_MASS))
            6 -> add(GeneratedObservance("marian-saturday", "O Nepoškvrnenom Srdci Panny Márie", LiturgicalColor.WHITE, CelebrationRank.OPTIONAL_MEMORIAL))
        }
    }

    private fun MutableList<GeneratedObservance>.addSeasonalObservances(date: LiturgicalDate, year: LiturgicalYear, hasPrimaryCelebration: Boolean) {
        val easterWeek = if (date in year.easter..year.easter.plusDays(49)) daysSince(year.easter, date) / 7 + 1 else null
        if (easterWeek == 3 && date.weekdayNumber() in 1..6 && !hasPrimaryCelebration && !isFirstThursday(date)) {
            add(GeneratedObservance("easter-vocations", "Za duchovné povolania", colorFor(year.season(date)), CelebrationRank.VOTIVE_MASS))
        }
        if (year.season(date) == LiturgicalSeason.ADVENT && !hasPrimaryCelebration && date.weekdayNumber() in 1..6 && (date.month == 11 || date.dayOfMonth < 17)) {
            add(GeneratedObservance("advent-marian", "Omša o Panne Márii v adventnom období", LiturgicalColor.WHITE, CelebrationRank.VOTIVE_MASS))
        }
    }

    private fun MutableList<GeneratedObservance>.addEmberAndPrayerDays(date: LiturgicalDate, year: LiturgicalYear, primaryRank: CelebrationRank?) {
        if (date.month == 1 && date.dayOfMonth in 18..24) add(GeneratedObservance("christian-unity", "Za jednotu kresťanov", LiturgicalColor.GREEN))
        if (date in year.easter.plusDays(36)..year.easter.plusDays(38)) add(GeneratedObservance("rogation-days", "Prosebné dni", LiturgicalColor.WHITE))
        if (isEmberDay(date, year) && primaryRank != CelebrationRank.SOLEMNITY) add(GeneratedObservance("ember-days", "Kántrové dni", colorFor(year.season(date))))
    }

    private fun isEmberDay(date: LiturgicalDate, year: LiturgicalYear): Boolean {
        val weekdays = setOf(3, 5, 6)
        return when {
            date in year.easter.plusDays(42)..year.easter.plusDays(48) -> date.weekdayNumber() in weekdays
            date.month == 9 -> (date.weekdayNumber() == 3 && date.dayOfMonth in 15..21) || (date.weekdayNumber() == 5 && date.dayOfMonth in 17..23) || (date.weekdayNumber() == 6 && date.dayOfMonth in 18..24)
            date in year.ashWednesday.plusDays(7)..year.ashWednesday.plusDays(10) -> date.weekdayNumber() in weekdays
            date in year.adventStart.plusDays(7)..year.adventStart.plusDays(13) -> date.weekdayNumber() in weekdays
            else -> false
        }
    }

    private fun MutableList<GeneratedObservance>.addTriduumObservances(date: LiturgicalDate, year: LiturgicalYear) {
        when (date) {
            year.easter.minusDays(2) -> add(GeneratedObservance("altar-reservation", "Uloženie Oltárnej sviatosti", LiturgicalColor.RED))
            year.easter.minusDays(1) -> {
                add(GeneratedObservance("holy-saturday-exposition", "Vyloženie Oltárnej sviatosti na Bielu sobotu ráno", LiturgicalColor.WHITE))
                add(GeneratedObservance("holy-saturday-adoration-end", "Ukončenie poklony v Božom hrobe", LiturgicalColor.WHITE))
            }
            year.easter -> add(GeneratedObservance("easter-procession", "Eucharistická procesia na oslavu vzkrieseného Pána", LiturgicalColor.WHITE))
        }
    }

    private fun Celebration.appliesTo(jurisdiction: DioceseId?, localityId: String?, inCathedral: Boolean) = when (val value = scope) {
        CelebrationScope.Universal -> true
        is CelebrationScope.Dioceses -> jurisdiction in value.ids
        is CelebrationScope.Cathedral -> jurisdiction == value.diocese && inCathedral
        is CelebrationScope.Locality -> jurisdiction == value.diocese && localityId == value.localityId
    }

    private fun isFirstThursday(date: LiturgicalDate) = date.dayOfMonth <= 7 && date.weekdayNumber() == 4
    private fun daysSince(start: LiturgicalDate, end: LiturgicalDate) = start.daysUntil(end).coerceAtLeast(0)
    private fun colorFor(season: LiturgicalSeason) = when (season) {
        LiturgicalSeason.ADVENT, LiturgicalSeason.LENT -> LiturgicalColor.VIOLET
        LiturgicalSeason.CHRISTMAS, LiturgicalSeason.EASTER -> LiturgicalColor.WHITE
        LiturgicalSeason.ORDINARY_TIME -> LiturgicalColor.GREEN
    }
}

data class LiturgicalDay(val date: LiturgicalDate, val season: LiturgicalSeason, val base: BaseObservance, val primaryCelebration: Celebration?, val alternatives: List<Celebration>, val suppressedCelebrations: List<Celebration>, val generatedObservances: List<GeneratedObservance>) {
    val liturgicalElements: Set<LiturgicalElement> get() = buildSet {
        addAll(primaryCelebration?.liturgicalElements.orEmpty())
        val year = LiturgicalYear.of(date.year)
        if (base.isSunday) {
            add(LiturgicalElement.CREED)
            if (season !in setOf(LiturgicalSeason.ADVENT, LiturgicalSeason.LENT)) add(LiturgicalElement.GLORIA)
        }
        if (date in year.easter..year.easter.plusDays(6) || season == LiturgicalSeason.CHRISTMAS && date.month == 12 && date.dayOfMonth >= 25) add(LiturgicalElement.GLORIA)
        if (date == year.easter.plusDays(1)) add(LiturgicalElement.CREED)
    }
}
data class BaseObservance(val title: String, val color: LiturgicalColor, val isSunday: Boolean)
data class GeneratedObservance(val id: String, val title: String, val color: LiturgicalColor, val rank: CelebrationRank? = null)
private data class Selection(val primary: Celebration?, val alternatives: List<Celebration>, val suppressed: List<Celebration>)
private val CelebrationRank.precedence: Int get() = when (this) {
    CelebrationRank.SOLEMNITY -> 5
    CelebrationRank.FEAST -> 4
    CelebrationRank.MEMORIAL -> 3
    CelebrationRank.OPTIONAL_MEMORIAL -> 2
    CelebrationRank.VIGIL -> 1
    CelebrationRank.VOTIVE_MASS -> 0
}
enum class LiturgicalSeason { ADVENT, CHRISTMAS, ORDINARY_TIME, LENT, EASTER }
