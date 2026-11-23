package sk.missa.liturgy.mass

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.data.assets.DatasetAssets

/** Exercises every authored owner and variant, including independent user choices. */
@RunWith(AndroidJUnit4::class)
class CelebrationResolutionAcceptanceTest {
    @Test
    fun everyCelebrationVariantAndItsAvailableChoicesResolve() {
        val items = DatasetAssets.read(ApplicationProvider.getApplicationContext<Context>().assets)
        val resolver = MassContentResolver(items)
        val owners = items.filter { it.dataset == "celebrations.json" }
        assertEquals(283, owners.size)
        var variantsChecked = 0
        var choicesChecked = 0
        for (owner in owners) {
            val variants = (owner.fields["contentVariants"] as? List<*>)
                ?.map { (it as Map<*, *>)["key"] as String } ?: emptyList()
            for (variant in listOf(null) + variants) {
                val selection = MassContentResolver.Selection("m631", properId = owner.id, properVariant = variant)
                val result = resolver.resolve(selection)
                val readings = result.mass["lectionary"] as Map<*, *>
                for (slot in listOf("firstReadingId", "psalmId", "acclamationId", "gospelId")) {
                    assertNotNull("${owner.id}/$variant/$slot", readings[slot])
                }
                for (field in listOf("entrance", "communion")) assertNotNull("${owner.id}/$variant/$field", result.chants[field])
                for (field in listOf("collect", "overOfferings", "afterCommunion")) assertNotNull("${owner.id}/$variant/$field", result.orations[field])

                val variantFields = (owner.fields["contentVariants"] as? List<*>)
                    ?.map { it as Map<*, *> }?.singleOrNull { it["key"] == variant }
                val formularies = (variantFields?.get("formularyChoices") ?: owner.fields["formularyChoices"]) as? List<*> ?: emptyList<Any?>()
                for (choice in formularies) {
                    val id = (choice as Map<*, *>)["formularyId"] as String
                    assertEquals("${owner.id}/$variant", id, resolver.resolve(selection.copy(formularyId = id)).mass["formularyId"])
                    choicesChecked++
                }
                val readingChoices = readings["choices"] as? Map<*, *> ?: emptyMap<Any?, Any?>()
                for ((slot, raw) in readingChoices) {
                    val name = slot as String
                    val options = raw as List<*>
                    for (index in 1 until options.size) {
                        val option = options[index] as Map<*, *>
                        if (option.containsKey("availability")) continue // Context-specific alternatives have separate availability tests.
                        val selected = resolver.resolve(selection.copy(readingChoices = mapOf(name to index)))
                        assertEquals("${owner.id}/$variant/$name/$index", option["${name}Id"],
                            (selected.mass["lectionary"] as Map<*, *>)["${name}Id"])
                        choicesChecked++
                    }
                }
                val intercessions = result.mass["intercessionChoices"] as? List<*> ?: emptyList<Any?>()
                for (index in 1 until intercessions.size) {
                    val expected = (intercessions[index] as Map<*, *>)["intercessionsId"]
                    assertEquals("${owner.id}/$variant/intercessions/$index", expected,
                        resolver.resolve(selection.copy(intercessionChoice = index)).mass["intercessionsId"])
                    choicesChecked++
                }
                variantsChecked++
            }
        }
        assertTrue(variantsChecked >= owners.size)
        assertTrue(choicesChecked > 0)
    }
}
