package sk.missa.liturgy.mass

import org.junit.Assert.*
import org.junit.Test
import sk.missa.calendar.LiturgicalCalendar
import sk.missa.calendar.LiturgicalDate
import sk.missa.calendar.celebration.Celebration
import sk.missa.calendar.celebration.CelebrationCatalog
import sk.missa.calendar.celebration.CelebrationDate
import sk.missa.calendar.celebration.CelebrationId
import sk.missa.calendar.celebration.CelebrationRank
import sk.missa.calendar.celebration.LiturgicalColor
import sk.missa.calendar.celebration.MonthDay

class SpecialMassAvailabilityTest {
    private val calendar = LiturgicalCalendar(CelebrationCatalog(emptyList()))

    @Test
    fun weekdaysAndLentenSundaysRetainTheirDistinctReconciliationOptions() {
        val weekday = calendar.resolve(LiturgicalDate.of(2026, 11, 16))
        val sunday = calendar.resolve(LiturgicalDate.of(2026, 11, 15))
        val lent = calendar.resolve(LiturgicalDate.of(2026, 3, 8))
        for (id in listOf("om004", "om007")) {
            assertTrue(SpecialMassAvailability.isAvailable(id, weekday))
            assertFalse(SpecialMassAvailability.isAvailable(id, sunday))
        }
        assertFalse(SpecialMassAvailability.isAvailable("om004", lent))
        assertTrue(SpecialMassAvailability.isAvailable("om007", lent))
        assertTrue(SpecialMassAvailability.isAvailable("om016", lent))
        assertFalse(SpecialMassAvailability.isAvailable("om016", weekday))
    }

    @Test
    fun feastsSolemnitiesAndVigilsBlockRestrictedMassesWithoutLeakingIntoNextDay() {
        val date = LiturgicalDate.of(2026, 11, 16)
        for (rank in CelebrationRank.entries) {
            val celebration = Celebration(CelebrationId("celebration"), "Celebration", CelebrationDate.Fixed(MonthDay(11, 16)), rank, LiturgicalColor.WHITE)
            val resolved = calendar.resolve(date).copy(primaryCelebration = celebration)
            val available = rank !in setOf(CelebrationRank.FEAST, CelebrationRank.SOLEMNITY, CelebrationRank.VIGIL)
            assertEquals(rank.name, available, SpecialMassAvailability.isAvailable("om007", resolved))
            assertEquals(rank.name, available, SpecialMassAvailability.isAvailable("om004", resolved))
        }
        assertTrue(SpecialMassAvailability.isAvailable("om007", calendar.resolve(date.plusDays(1))))
    }

    @Test
    fun octavesBlockRestrictedMassesButLeaveOtherSpecialMassesAvailable() {
        for (date in listOf(LiturgicalDate.of(2026, 4, 6), LiturgicalDate.of(2026, 12, 28), LiturgicalDate.of(2026, 1, 1))) {
            val day = calendar.resolve(date)
            assertFalse(SpecialMassAvailability.isAvailable("om004", day))
            assertFalse(SpecialMassAvailability.isAvailable("om007", day))
            assertTrue(SpecialMassAvailability.isAvailable("om006", day))
        }
        assertTrue(SpecialMassAvailability.isAvailable("om004", calendar.resolve(LiturgicalDate.of(2026, 4, 13))))
    }
}
