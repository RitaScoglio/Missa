package sk.missa.liturgy.mass

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.calendar.LiturgicalDate
import sk.missa.calendar.LiturgicalSeason
import sk.missa.calendar.LiturgicalYear
import sk.missa.data.assets.DatasetAssets
import sk.missa.liturgy.mass.SeasonalMassSelector.Cycle
import sk.missa.liturgy.mass.SeasonalMassSelector.DayOfWeek

@RunWith(AndroidJUnit4::class)
class SeasonalMassSelectorDatasetTest {
    @Test
    fun christmasDatesSelectReviewedMassesAcrossWeekdaysAndSundayCycles() {
        val selector = SeasonalMassSelector(DatasetAssets.read(ApplicationProvider.getApplicationContext<Context>().assets))
        // These source rows are date-specific; feast days and Sundays use their own proper.
        val december = mapOf(29 to "m040", 30 to "m041", 31 to "m042")
        val january = mapOf(2 to "m046", 3 to "m047", 4 to "m048", 5 to "m049",
            7 to "m050", 8 to "m051", 9 to "m052", 10 to "m053", 11 to "m054", 12 to "m055")
        val christmasSunday = mapOf("A" to "m043", "B" to "m044", "C" to "m045")
        for (year in 2022..2042) {
            val calendar = LiturgicalYear.of(year)
            for ((month, dates) in listOf(12 to december, 1 to january)) {
                for ((day, expected) in dates) {
                    val date = LiturgicalDate.of(year, month, day)
                    val context = calendar.seasonalContext(date) ?: continue
                    val actual = selector.find(SeasonalCalendarAdapter.context(context))
                    val expectedForDate = when {
                        date.isSunday() && month == 1 && day in 2..5 -> christmasSunday.getValue(context.sundayCycle)
                        date.isSunday() -> null
                        else -> expected
                    }
                    assertEquals("Incorrect Christmas selection for $date", expectedForDate, actual)
                }
            }
            val epiphany = LiturgicalDate.of(year, 1, 6)
            assertEquals(null, selector.find(SeasonalCalendarAdapter.context(requireNotNull(calendar.seasonalContext(epiphany)))))
        }
    }

    @Test
    fun calendarCoordinatesSelectSeasonalAssetsAcrossTheYearBoundary() {
        val selector = SeasonalMassSelector(DatasetAssets.read(ApplicationProvider.getApplicationContext<Context>().assets))
        val year = LiturgicalYear.of(2026)
        fun selected(month: Int, day: Int): String? =
            year.seasonalContext(LiturgicalDate.of(2026, month, day))
                ?.let { selector.find(SeasonalCalendarAdapter.context(it)) }
        assertEquals("m043", selected(1, 4))
        assertEquals("m056", selected(2, 18))
        assertEquals("m111", selected(4, 5))
        assertEquals("m005", selected(11, 30))
        assertEquals("m032", selected(12, 17))
        assertEquals(null, selected(12, 27))
        assertEquals(null, selected(1, 12))
        for (calendarYear in 2022..2027) {
            val calendar = LiturgicalYear.of(calendarYear)
            fun checkRange(start: LiturgicalDate, end: LiturgicalDate) {
                var date = start
                while (date <= end) {
                    val context = requireNotNull(calendar.seasonalContext(date))
                    requireNotNull(selector.find(SeasonalCalendarAdapter.context(context))) {
                        "Missing seasonal Mass for $date: $context"
                    }
                    date = date.plusDays(1)
                }
            }
            checkRange(calendar.ashWednesday, calendar.easter.minusDays(4))
            checkRange(calendar.easter, calendar.easter.plusDays(38))
            checkRange(calendar.easter.plusDays(40), calendar.easter.plusDays(48))
            val ascension = requireNotNull(calendar.seasonalContext(calendar.easter.plusDays(39)))
            assertEquals(null, selector.find(SeasonalCalendarAdapter.context(ascension)))
            checkRange(calendar.adventStart, LiturgicalDate.of(calendarYear, 12, 24))
        }
    }

    @Test
    fun reviewedSeasonalContextsSelectTheirActualAssets() {
        val selector = SeasonalMassSelector(DatasetAssets.read(ApplicationProvider.getApplicationContext<Context>().assets))
        // Citania_advent first Monday preserves the Sunday-year distinction, unlike later ferias.
        assertEquals("m004", selector.find(SeasonalMassSelector.Context(LiturgicalSeason.ADVENT, DayOfWeek.MONDAY, 1, Cycle.A)))
        assertEquals("m005", selector.find(SeasonalMassSelector.Context(LiturgicalSeason.ADVENT, DayOfWeek.MONDAY, 1, Cycle.B)))
        assertEquals("m006", selector.find(SeasonalMassSelector.Context(LiturgicalSeason.ADVENT, DayOfWeek.MONDAY, 1, Cycle.C)))
        // Misal !nedela exact-date branch overrides Advent weekly feria, never Sunday.
        assertEquals("m032", selector.find(SeasonalMassSelector.Context(LiturgicalSeason.ADVENT, DayOfWeek.MONDAY, 3, Cycle.B, 12, 17)))
        assertEquals("m022", selector.find(SeasonalMassSelector.Context(LiturgicalSeason.ADVENT, DayOfWeek.SUNDAY, 3, Cycle.B, 12, 17)))
        assertEquals("m039", selector.find(SeasonalMassSelector.Context(LiturgicalSeason.ADVENT, DayOfWeek.SATURDAY, 4, Cycle.A, 12, 24)))
        // Christmas Jan5 feria does not replace the second Christmas Sunday or select Epiphany vigil.
        assertEquals("m049", selector.find(SeasonalMassSelector.Context(LiturgicalSeason.CHRISTMAS, DayOfWeek.FRIDAY, month = 1, dayOfMonth = 5)))
        assertEquals("m043", selector.find(SeasonalMassSelector.Context(LiturgicalSeason.CHRISTMAS, DayOfWeek.SUNDAY, 2, Cycle.A, 1, 5)))
        assertEquals("m056", selector.find(SeasonalMassSelector.Context(LiturgicalSeason.LENT, DayOfWeek.WEDNESDAY, 0)))
        assertEquals("m105", selector.find(SeasonalMassSelector.Context(LiturgicalSeason.LENT, DayOfWeek.SUNDAY, 6, Cycle.A)))
        assertEquals("m106", selector.find(SeasonalMassSelector.Context(LiturgicalSeason.LENT, DayOfWeek.SUNDAY, 6, Cycle.B)))
        assertEquals("m107", selector.find(SeasonalMassSelector.Context(LiturgicalSeason.LENT, DayOfWeek.SUNDAY, 6, Cycle.C)))
        assertEquals("m113", selector.find(SeasonalMassSelector.Context(LiturgicalSeason.EASTER, DayOfWeek.SUNDAY, 1, Cycle.C)))
        // Ascension's Thursday belongs to the movable proper; there is no generic seasonal owner.
        assertEquals(null, selector.find(SeasonalMassSelector.Context(LiturgicalSeason.EASTER, DayOfWeek.THURSDAY, 6, Cycle.A)))
    }
}
