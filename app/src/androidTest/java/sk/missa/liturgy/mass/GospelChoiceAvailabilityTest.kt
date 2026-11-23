package sk.missa.liturgy.mass

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.data.assets.DatasetAssets
import sk.missa.data.assets.DatasetIntegrity

@RunWith(AndroidJUnit4::class)
class GospelChoiceAvailabilityTest {
    @Test
    fun restrictedChoicesRequireTheActualContext() {
        val resolver = MassContentResolver(DatasetAssets.read(ApplicationProvider.getApplicationContext<Context>().assets))
        val lent = MassContentResolver.Selection("m099", readingChoices = mapOf("gospel" to 1))
        assertThrows(IllegalArgumentException::class.java) { resolver.resolve(lent) }
        assertThrows(IllegalArgumentException::class.java) {
            resolver.resolve(lent.copy(gospelChoiceContext = GospelChoiceAvailability.Context(
                sundayCycle = GospelChoiceAvailability.SundayCycle.C, previousSundayGospelId = "g201",
            )))
        }
        val selectedLent = resolver.resolve(lent.copy(gospelChoiceContext = GospelChoiceAvailability.Context(
            sundayCycle = GospelChoiceAvailability.SundayCycle.C, previousSundayGospelId = "g204",
        ))).mass
        assertEquals("g205", (selectedLent["lectionary"] as Map<*, *>)["gospelId"])

        val easter = MassContentResolver.Selection("m113", readingChoices = mapOf("gospel" to 2))
        assertThrows(IllegalArgumentException::class.java) {
            resolver.resolve(easter.copy(gospelChoiceContext = GospelChoiceAvailability.Context(
                massTime = GospelChoiceAvailability.MassTime.DAY,
            )))
        }
        val selectedEaster = resolver.resolve(easter.copy(gospelChoiceContext = GospelChoiceAvailability.Context(
            massTime = GospelChoiceAvailability.MassTime.EVENING,
        ))).mass
        assertEquals("g225", (selectedEaster["lectionary"] as Map<*, *>)["gospelId"])
    }

    @Test
    fun sourceLabelsHaveExplicitConditionsAndPreserveChoiceOrder() {
        val items = DatasetAssets.read(ApplicationProvider.getApplicationContext<Context>().assets)
        DatasetIntegrity.validate(items)
        fun options(id: String): List<Map<*, *>> {
            val mass = items.first { it.id == id }.fields["mass"] as Map<*, *>
            val lectionary = mass["lectionary"] as Map<*, *>
            val choices = lectionary["choices"] as Map<*, *>
            return (choices["gospel"] as List<*>).map { it as Map<*, *> }
        }
        val lent = options("m099")
        assertEquals(listOf("g204", "g205"), lent.map { it["gospelId"] })
        assertNull(lent[0]["availability"])
        assertEquals(
            "Alebo v\u00a0roku C, keď sa toto čítanie čítalo na\u00a0Piatu pôstnu nedeľu:",
            lent[1]["label"]
        )
        assertEquals(mapOf("sundayCycle" to "C", "previousSundayGospelId" to "g204"), lent[1]["availability"])

        for ((id, expected) in mapOf("m111" to "g222", "m112" to "g222", "m113" to "g225")) {
            val easter = options(id)
            assertEquals(expected, easter[2]["gospelId"])
            assertEquals("Alebo(pri večernej omši dnes):", easter[2]["label"])
            assertEquals(mapOf("massTime" to "EVENING"), easter[2]["availability"])
            assertNull(easter[0]["availability"])
            assertNull(easter[1]["availability"])
        }
    }
}
