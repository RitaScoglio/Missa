package sk.missa.calendar

import org.junit.Assert.assertEquals
import org.junit.Test

class EasterCalculatorTest {
    @Test
    fun calculatesGregorianEasterSunday() {
        assertEquals(LiturgicalDate.of(2026, 4, 5), EasterCalculator().easterSunday(2026))
        for (year in listOf(1981, 2076)) {
            assertEquals(LiturgicalDate.of(year, 4, 19), EasterCalculator().easterSunday(year))
        }
        assertEquals(LiturgicalDate.of(2100, 3, 28), EasterCalculator().easterSunday(2100))
    }
}
