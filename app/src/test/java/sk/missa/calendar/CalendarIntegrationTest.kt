package sk.missa.calendar

import org.junit.Assert.*
import org.junit.Test
import sk.missa.calendar.celebration.Celebration
import sk.missa.calendar.celebration.CelebrationCatalog
import sk.missa.calendar.celebration.CelebrationDate
import sk.missa.calendar.celebration.CelebrationId
import sk.missa.calendar.celebration.CelebrationRank
import sk.missa.calendar.celebration.CelebrationScope
import sk.missa.calendar.celebration.DioceseId
import sk.missa.calendar.celebration.LiturgicalColor
import sk.missa.calendar.celebration.MonthDay
import sk.missa.calendar.celebration.MovableCelebration

class CalendarIntegrationTest {
    private fun celebration(id: String, month: Int, day: Int, rank: CelebrationRank, scope: CelebrationScope = CelebrationScope.Universal) =
        Celebration(CelebrationId(id), id, CelebrationDate.Fixed(MonthDay(month, day)), rank, LiturgicalColor.WHITE, scope)

    @Test
    fun privilegedDaysSuppressConflictingCelebrationsAndGeneratedVotives() {
        val year = LiturgicalYear.of(2026)
        for (date in listOf(year.ashWednesday, year.easter.minusDays(5), year.easter.plusDays(2), year.adventStart)) {
            val feast = celebration("conflict", date.month, date.dayOfMonth, CelebrationRank.SOLEMNITY)
            val day = LiturgicalCalendar(CelebrationCatalog(listOf(feast))).resolve(date)
            assertNull("$date", day.primaryCelebration)
            assertEquals(listOf(feast), day.suppressedCelebrations)
            assertTrue(day.generatedObservances.none { it.id in setOf("first-friday", "first-thursday", "marian-saturday") })
        }
        val unitySunday = LiturgicalCalendar(CelebrationCatalog(emptyList())).resolve(LiturgicalDate.of(2026, 1, 18))
        assertTrue(unitySunday.generatedObservances.any { it.id == "christian-unity" })
    }

    @Test
    fun cathedralAndEveningRequireTheirActualContext() {
        val scope = CelebrationScope.Cathedral(DioceseId("kosice"))
        val cathedral = celebration("cathedral", 11, 17, CelebrationRank.SOLEMNITY, scope)
        val vigil = celebration("vigil", 12, 24, CelebrationRank.VIGIL)
        val calendar = LiturgicalCalendar(CelebrationCatalog(listOf(cathedral, vigil)))
        val date = LiturgicalDate.of(2026, 11, 17)
        assertNull(calendar.resolve(date, DioceseId("kosice")).primaryCelebration)
        assertEquals(cathedral, calendar.resolve(date, DioceseId("kosice"), inCathedral = true).primaryCelebration)
        val adventSunday = LiturgicalDate.of(2023, 12, 24)
        assertTrue(calendar.resolve(adventSunday).alternatives.isEmpty())
        assertEquals(listOf(vigil), calendar.resolve(adventSunday, evening = true).alternatives)
    }

    @Test
    fun transferredBaptistVigilMovesWithItsSolemnity() {
        val feast = celebration("john", 6, 24, CelebrationRank.SOLEMNITY)
        val vigil = celebration("john-vigil", 6, 23, CelebrationRank.VIGIL)
        val calendar = LiturgicalCalendar(CelebrationCatalog(listOf(feast, vigil)))
        assertEquals(listOf(vigil), calendar.resolve(LiturgicalDate.of(2022, 6, 22), evening = true).alternatives)
        val transferred = calendar.resolve(LiturgicalDate.of(2022, 6, 23), evening = true)
        assertEquals(feast, transferred.primaryCelebration)
        assertFalse(vigil in transferred.alternatives)
        assertEquals(2, LiturgicalDate.of(2024, 2, 28).daysUntil(LiturgicalDate.of(2024, 3, 1)))
        assertEquals(LiturgicalDate.of(2008, 3, 15), LiturgicalYear.of(2008).dateOf(MovableCelebration.SAINT_JOSEPH))
        assertEquals(LiturgicalDate.of(2008, 3, 31), LiturgicalYear.of(2008).dateOf(MovableCelebration.ANNUNCIATION))
        assertEquals(LiturgicalDate.of(2018, 4, 9), LiturgicalYear.of(2018).dateOf(MovableCelebration.ANNUNCIATION))
        assertEquals(LiturgicalDate.of(2035, 4, 2), LiturgicalYear.of(2035).dateOf(MovableCelebration.ANNUNCIATION))
    }
}
