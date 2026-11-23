package sk.missa.calendar.celebration

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test
import sk.missa.calendar.LiturgicalCalendar
import sk.missa.calendar.LiturgicalDate
import sk.missa.data.assets.DatasetIntegrity

class DatasetCelebrationCatalogTest {
    @Test
    fun formularyAndLocalityArePreservedForCalendarSelection() {
        val entries = listOf(
            DatasetIntegrity.Item("formularies.json", "f002", emptyMap()),
            DatasetIntegrity.Item("celebrations.json", "c001", mapOf(
                "title" to "Local feast",
                "date" to mapOf("type" to "FIXED", "month" to 5L, "day" to 5L),
                "rank" to "FEAST", "color" to "WHITE",
                "scope" to mapOf("kind" to "LOCALITY", "dioceses" to listOf("nitra"), "localityId" to "nitra-city"),
                "mass" to mapOf("formularyId" to "f002"),
            )),
        )
        val catalog = DatasetCelebrationCatalog.fromItems(entries)
        assertEquals("f002", catalog.findById(CelebrationId("c001"))?.formularyId)
        val calendar = LiturgicalCalendar(catalog)
        val date = LiturgicalDate.of(2026, 5, 5)
        assertNull(calendar.resolve(date, DioceseId("nitra")).primaryCelebration)
        assertNull(calendar.resolve(date, DioceseId("other"), "nitra-city").primaryCelebration)
        assertEquals(CelebrationId("c001"), calendar.resolve(date, DioceseId("nitra"), "nitra-city").primaryCelebration?.id)
    }
}
