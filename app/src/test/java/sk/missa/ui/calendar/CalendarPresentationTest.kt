package sk.missa.ui.calendar

import org.junit.Assert.*
import org.junit.Test
import sk.missa.calendar.LiturgicalCalendar
import sk.missa.calendar.LiturgicalDate
import sk.missa.calendar.celebration.Celebration
import sk.missa.calendar.celebration.CelebrationCatalog
import sk.missa.calendar.celebration.CelebrationDate
import sk.missa.calendar.celebration.CelebrationId
import sk.missa.calendar.celebration.CelebrationRank
import sk.missa.calendar.celebration.CelebrationScope
import sk.missa.calendar.celebration.DioceseId
import sk.missa.calendar.celebration.LiturgicalColor
import sk.missa.calendar.celebration.MonthDay
import sk.missa.settings.AppSettings

class CalendarPresentationTest {
    @Test
    fun monthBrowsingCrossesYearBoundaryAndIncludesLeapDay() {
        val calendar = LiturgicalCalendar(CelebrationCatalog(emptyList()))
        val january = LiturgicalDate.of(2024, 1, 1)
        assertEquals(LiturgicalDate.of(2023, 12, 1), CalendarPresentation.shiftMonth(january, -1))
        val february = CalendarPresentation.month(calendar, CalendarPresentation.shiftMonth(january, 1), AppSettings())
        assertEquals(29, february.size)
        assertEquals(LiturgicalDate.of(2024, 2, 29), february.last().date)
        val saturday = CalendarPresentation.day(calendar, LiturgicalDate.of(2026, 11, 14), AppSettings())
        assertEquals("vigil:", saturday.celebrations.last().id)
        assertEquals("Vigília", saturday.celebrations.last().detail)
        assertEquals(LiturgicalColor.GREEN, calendar.resolve(LiturgicalDate.of(2026, 4, 2)).base.color)
        assertEquals(LiturgicalColor.RED, calendar.resolve(LiturgicalDate.of(2026, 4, 3)).base.color)
    }

    @Test
    fun optionalMemorialKeepsWeekdaySelectableWhileObligatoryMemorialReplacesIt() {
        val optional = Celebration(CelebrationId("optional"), "Optional", CelebrationDate.Fixed(MonthDay(11, 16)), CelebrationRank.OPTIONAL_MEMORIAL, LiturgicalColor.WHITE)
        val date = LiturgicalDate.of(2026, 11, 16)
        val ordinary = LiturgicalCalendar(CelebrationCatalog(listOf(optional))).resolve(date)
        assertEquals(listOf("", "optional"), CalendarPresentation.rows(ordinary).map { it.id })
        val obligatory = LiturgicalCalendar(CelebrationCatalog(listOf(optional.copy(rank = CelebrationRank.MEMORIAL)))).resolve(date)
        assertEquals(listOf("optional"), CalendarPresentation.rows(obligatory).map { it.id })
        assertEquals("Spomienka", CalendarPresentation.rows(obligatory).single().detail)
        val vigil = optional.copy(id = CelebrationId("vigil"), title = "Evening vigil", rank = CelebrationRank.VIGIL)
        val withVigil = CalendarPresentation.day(LiturgicalCalendar(CelebrationCatalog(listOf(vigil))), date, AppSettings())
        assertEquals(listOf("", "vigil"), withVigil.celebrations.map { it.id })
        assertEquals("Féria", withVigil.celebrations.first().detail)
        assertEquals("Vigília", withVigil.celebrations.last().detail)
    }

    @Test
    fun localFeastsRemainBrowseableWithoutReplacingTheGeneralCalendar() {
        val feast = Celebration(CelebrationId("cathedral"), "Cathedral", CelebrationDate.Fixed(MonthDay(11, 16)), CelebrationRank.SOLEMNITY, LiturgicalColor.WHITE, CelebrationScope.Cathedral(DioceseId("nitra")))
        val calendar = LiturgicalCalendar(CelebrationCatalog(listOf(feast)))
        val first = LiturgicalDate.of(2026, 11, 1)
        val general = CalendarPresentation.month(calendar, first, AppSettings())
        assertEquals(listOf("", "cathedral"), general[15].celebrations.map { it.id })
        assertNull(calendar.resolve(LiturgicalDate.of(2026, 11, 16)).primaryCelebration)
        assertEquals("cathedral", calendar.resolveCelebration(LiturgicalDate.of(2026, 11, 16), "cathedral").primaryCelebration?.id?.value)
        val local = CalendarPresentation.month(calendar, first, AppSettings(jurisdiction = "nitra", cathedral = true))
        assertEquals(listOf("", "cathedral"), local[15].celebrations.map { it.id })
    }
}
