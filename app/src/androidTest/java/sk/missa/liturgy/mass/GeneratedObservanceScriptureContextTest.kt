package sk.missa.liturgy.mass

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.data.assets.DatasetAssets

/** Misal.ziskajIndex and the four reading renderers apply the kantry guard independently. */
@RunWith(AndroidJUnit4::class)
class GeneratedObservanceScriptureContextTest {
    @Test
    fun currentDayContextDoesNotApplyEmberOrRogationScripture() {
        val items = DatasetAssets.read(ApplicationProvider.getApplicationContext<Context>().assets)
        val resolver = MassContentResolver(items)
        val seasonal = resolver.resolve(MassContentResolver.Selection("m631"))
        val dayReadings = seasonal.mass["lectionary"] as Map<*, *>
        val cases = listOf(
            Triple("om012", null, "f090"),
            Triple("om013", "SPRING", "f076"),
            Triple("om013", "SUMMER", "f082"),
            Triple("om013", "AUTUMN", "f084"),
            Triple("om013", "WINTER", "f089"),
        )
        for ((owner, variant, formulary) in cases) {
            val base = MassContentResolver.Selection("m631", properId = owner,
                properVariant = variant, formularyId = formulary)
            val normal = resolver.resolve(base)
            val fallback = resolver.resolve(base.copy(
                formularyScriptureUse = MassContentResolver.FormularyScriptureUse.CURRENT_DAY,
            ))
            val normalReadings = normal.mass["lectionary"] as Map<*, *>
            val fallbackReadings = fallback.mass["lectionary"] as Map<*, *>
            assertNotEquals("$owner/$variant formulary must have distinct reading", dayReadings["firstReadingId"], normalReadings["firstReadingId"])
            for (slot in listOf("firstReadingId", "psalmId", "acclamationId", "gospelId")) {
                assertEquals("$owner/$variant/$slot", dayReadings[slot], fallbackReadings[slot])
            }
            assertEquals(dayReadings["choices"], fallbackReadings["choices"])
            assertEquals(normal.chants, fallback.chants)
            assertEquals(normal.orations, fallback.orations)
            assertEquals(formulary, fallback.mass["formularyId"])
            assertEquals(normal.mass["intercessionsId"], fallback.mass["intercessionsId"])
        }
    }

    @Test
    fun explicitlySelectedSecondReadingVariantRemainsIndependentOfTheFourSlotGuard() {
        val resolver = MassContentResolver(DatasetAssets.read(ApplicationProvider.getApplicationContext<Context>().assets))
        val selected = resolver.resolve(MassContentResolver.Selection("m631", properId = "om013",
            properVariant = "WINTER", formularyId = "f089", formularyVariant = "WITH_SECOND_READING",
            formularyScriptureUse = MassContentResolver.FormularyScriptureUse.CURRENT_DAY))
        val readings = selected.mass["lectionary"] as Map<*, *>
        assertEquals("sr056", readings["secondReadingId"])
        val choices = readings["choices"] as Map<*, *>
        assertEquals(listOf("sr056", "sr057", "sr058"),
            (choices["secondReading"] as List<*>).map { (it as Map<*, *>)["secondReadingId"] })
    }
}
