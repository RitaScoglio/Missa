package sk.missa.liturgy.mass

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test
import sk.missa.calendar.OrdinaryContext
import sk.missa.data.assets.DatasetIntegrity

class OrdinaryMassSelectorTest {
    private fun item(id: String, sundayCycle: String) = DatasetIntegrity.Item(
        "seasonal-masses.json",
        id,
        mapOf(
            "liturgicalDay" to mapOf(
                "season" to "ORDINARY_TIME",
                "week" to 18,
                "dayOfWeek" to "MONDAY",
                "lectionaryCycle" to "II",
                "sundayCycle" to sundayCycle,
            ),
        ),
    )

    @Test
    fun bothCyclesAreMatchedIndependently() {
        val selector = OrdinaryMassSelector(listOf(item("m1", "A"), item("m2", "B")))
        assertEquals("m1", selector.find(OrdinaryContext(18, "MONDAY", "A", "II")))
        assertEquals("m2", selector.find(OrdinaryContext(18, "MONDAY", "B", "II")))
        assertEquals(null, selector.find(OrdinaryContext(18, "MONDAY", "A", "I")))
    }

    @Test
    fun ambiguousMatchesAreRejected() {
        val selector = OrdinaryMassSelector(listOf(item("m1", "A"), item("m2", "A")))
        assertThrows(IllegalArgumentException::class.java) {
            selector.find(OrdinaryContext(18, "MONDAY", "A", "II"))
        }
    }
}
