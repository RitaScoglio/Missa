package sk.missa.liturgy.mass

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test
import sk.missa.calendar.LiturgicalSeason
import sk.missa.data.assets.DatasetIntegrity
import sk.missa.liturgy.mass.SeasonalMassSelector.Context
import sk.missa.liturgy.mass.SeasonalMassSelector.Cycle
import sk.missa.liturgy.mass.SeasonalMassSelector.DayOfWeek

class SeasonalMassSelectorTest {
    private fun item(id: String, season: LiturgicalSeason, vararg fields: Pair<String, Any>) = DatasetIntegrity.Item(
        "seasonal-masses.json", id,
        mapOf("liturgicalDay" to mapOf("season" to season.name, *fields)),
    )

    @Test
    fun lateAdventDateOverridesWeeklyFeriaButNotSunday() {
        // Misal lines147/540: December17 onward uses the exact date only when !nedela.
        val selector = SeasonalMassSelector(listOf(
            item("weekly", LiturgicalSeason.ADVENT, "week" to 3, "dayOfWeek" to "MONDAY"),
            item("dated", LiturgicalSeason.ADVENT, "month" to 12, "dayOfMonth" to 17, "dayCategory" to "WEEKDAY"),
            item("sunday", LiturgicalSeason.ADVENT, "week" to 3, "dayOfWeek" to "SUNDAY", "lectionaryCycle" to "B"),
        ))
        assertEquals("dated", selector.find(Context(LiturgicalSeason.ADVENT, DayOfWeek.MONDAY, 3, Cycle.B, 12, 17)))
        assertEquals("weekly", selector.find(Context(LiturgicalSeason.ADVENT, DayOfWeek.MONDAY, 3, Cycle.B, 12, 16)))
        assertEquals("sunday", selector.find(Context(LiturgicalSeason.ADVENT, DayOfWeek.SUNDAY, 3, Cycle.B, 12, 17)))
        assertEquals("weekly", selector.find(Context(LiturgicalSeason.ADVENT, DayOfWeek.MONDAY, 3, Cycle.B, 11, 17)))
    }

    @Test
    fun adventFirstMondayUsesCalendarSuppliedSundayCycle() {
        val selector = SeasonalMassSelector(Cycle.entries.map { cycle ->
            item(cycle.name, LiturgicalSeason.ADVENT, "week" to 1, "dayOfWeek" to "MONDAY", "lectionaryCycle" to cycle.name)
        })
        Cycle.entries.forEach { cycle ->
            assertEquals(cycle.name, selector.find(Context(LiturgicalSeason.ADVENT, DayOfWeek.MONDAY, 1, cycle)))
        }
        assertEquals(null, selector.find(Context(LiturgicalSeason.ADVENT, DayOfWeek.MONDAY, 1)))
    }

    @Test
    fun cycleIndependentLentWeekZeroDoesNotAcquireAnInventedSunday() {
        val selector = SeasonalMassSelector(listOf(item("ash", LiturgicalSeason.LENT, "week" to 0, "dayOfWeek" to "WEDNESDAY")))
        Cycle.entries.forEach { cycle ->
            assertEquals("ash", selector.find(Context(LiturgicalSeason.LENT, DayOfWeek.WEDNESDAY, 0, cycle)))
        }
        assertEquals(null, selector.find(Context(LiturgicalSeason.LENT, DayOfWeek.SUNDAY, 0, Cycle.A)))
    }

    @Test
    fun christmasDateIsWeekdayOnlyAndDoesNotSelectProperVigil() {
        val selector = SeasonalMassSelector(listOf(item("feria", LiturgicalSeason.CHRISTMAS, "month" to 1, "dayOfMonth" to 5, "dayCategory" to "WEEKDAY")))
        assertEquals("feria", selector.find(Context(LiturgicalSeason.CHRISTMAS, DayOfWeek.FRIDAY, month = 1, dayOfMonth = 5)))
        assertEquals(null, selector.find(Context(LiturgicalSeason.CHRISTMAS, DayOfWeek.SUNDAY, month = 1, dayOfMonth = 5)))
        assertEquals(null, selector.find(Context(LiturgicalSeason.CHRISTMAS, DayOfWeek.FRIDAY, month = 12, dayOfMonth = 24)))
    }

    @Test
    fun missingAscensionThursdayIsNotReplacedByAnotherWeekday() {
        val selector = SeasonalMassSelector(listOf(item("friday", LiturgicalSeason.EASTER, "week" to 6, "dayOfWeek" to "FRIDAY")))
        assertEquals(null, selector.find(Context(LiturgicalSeason.EASTER, DayOfWeek.THURSDAY, 6, Cycle.C)))
    }

    @Test
    fun duplicatesFailEvenAtDatePrecedence() {
        val dated = item("first", LiturgicalSeason.ADVENT, "month" to 12, "dayOfMonth" to 17, "dayCategory" to "WEEKDAY")
        val selector = SeasonalMassSelector(listOf(dated, dated.copy(id = "second")))
        assertThrows(IllegalArgumentException::class.java) {
            selector.find(Context(LiturgicalSeason.ADVENT, DayOfWeek.MONDAY, 3, Cycle.A, 12, 17))
        }
    }
}
