package sk.missa.calendar

/** Gregorian computus for Easter Sunday. */
class EasterCalculator {
    fun easterSunday(year: Int): LiturgicalDate {
        val goldenNumber = year % 19
        val century = year / 100
        val yearOfCentury = year % 100
        val leapCenturies = century / 4
        val centuryRemainder = century % 4
        val correction = (century + 8) / 25
        val epactCorrection = (century - correction + 1) / 3
        val epact = (19 * goldenNumber + century - leapCenturies - epactCorrection + 15) % 30
        val leapYears = yearOfCentury / 4
        val yearRemainder = yearOfCentury % 4
        val weekdayCorrection = (32 + 2 * centuryRemainder + 2 * leapYears - epact - yearRemainder) % 7
        val monthCorrection = (goldenNumber + 11 * epact + 22 * weekdayCorrection) / 451
        val dateValue = epact + weekdayCorrection - 7 * monthCorrection + 114
        return LiturgicalDate.of(year, dateValue / 31, dateValue % 31 + 1)
    }
}
