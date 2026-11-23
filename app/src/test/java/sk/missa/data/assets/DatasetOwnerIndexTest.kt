package sk.missa.data.assets

import org.junit.Assert.assertThrows
import org.junit.Test

class DatasetOwnerIndexTest {
    private val chant = DatasetIntegrity.Item("chant-texts.json", "ct001", emptyMap())
    private val set = DatasetIntegrity.Item("chant-sets.json", "hc001", mapOf("requiredOwnerFields" to listOf("entrance")))
    private val complete = mapOf("chantSetId" to "hc001", "entranceChantIds" to listOf("ct001"))

    @Test
    fun indexesNestedOwnersAndStillRejectsAnyOwnerMissingItsRequiredChoices() {
        val nested = DatasetIntegrity.Item("celebrations.json", "c001", mapOf("contentVariants" to
            listOf(mapOf("key" to "FEAST", "mass" to complete))))
        DatasetIntegrity.validate(listOf(chant, set, nested))
        val incomplete = DatasetIntegrity.Item("formularies.json", "f001", mapOf("mass" to mapOf("chantSetId" to "hc001")))
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(chant, set, nested, incomplete)) }
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(chant, set)) }
    }

    @Test
    fun indexesConditionalCommunionOwnersWithoutAcceptingDifferentChoiceOrder() {
        val second = chant.copy(id = "ct002")
        val conditional = set.copy(fields = mapOf("communion" to mapOf("gospelChoices" to
            listOf(mapOf("whenGospel" to "SAMARITAN_WOMAN", "chantId" to "ct001"), mapOf("whenGospel" to "OTHER", "chantId" to "ct002")))))
        fun owner(ids: List<String>) = DatasetIntegrity.Item("formularies.json", "f001", mapOf("mass" to
            mapOf("chantSetId" to "hc001", "communionChantIds" to ids)))
        DatasetIntegrity.validate(listOf(chant, second, conditional, owner(listOf("ct001", "ct002"))))
        assertThrows(IllegalArgumentException::class.java) {
            DatasetIntegrity.validate(listOf(chant, second, conditional, owner(listOf("ct002", "ct001"))))
        }
    }

    @Test
    fun reusableRuntimeCatalogIsValidatedAndCannotBeChangedThroughItsSourceOrViews() {
        val content = mutableMapOf<String, Any?>("html" to "Original")
        val source = chant.copy(fields = mapOf("text" to content))
        val catalog = DatasetIntegrity.runtimeCatalog(listOf(source))
        content["html"] = "Changed"
        org.junit.Assert.assertEquals("Original", (catalog.single().fields["text"] as Map<*, *>)["html"])
        DatasetIntegrity.validate(catalog)
        assertThrows(UnsupportedOperationException::class.java) { (catalog.single().fields as MutableMap<*, *>).clear() }
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.runtimeCatalog(listOf(set)) }
    }
}
