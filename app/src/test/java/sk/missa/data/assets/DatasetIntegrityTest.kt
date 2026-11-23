package sk.missa.data.assets

import org.junit.Assert.assertThrows
import org.junit.Test

class DatasetIntegrityTest {
    private val chant = DatasetIntegrity.Item("chant-sets.json", "hc001", emptyMap())

    @Test
    fun setsRequireEveryOwnerToReferenceTheirChoices() {
        val partialSet = DatasetIntegrity.Item("chant-sets.json", "hc001", mapOf("requiredOwnerFields" to listOf("entrance")))
        val text = DatasetIntegrity.Item("chant-texts.json", "ct020", emptyMap())
        fun owner(id: String, references: Boolean) = DatasetIntegrity.Item("formularies.json", id, mapOf(
            "mass" to if (references) mapOf("chantSetId" to "hc001", "entranceChantIds" to listOf("ct020")) else mapOf("chantSetId" to "hc001"),
        ))
        DatasetIntegrity.validate(listOf(partialSet, text, owner("f002", true)))
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(partialSet, text, owner("f002", true), owner("f003", false))) }
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(partialSet, text)) }
    }

    @Test
    fun calendarAnnualAndWeekdayCyclesRemainIndependent() {
        fun mass(cycle: String, annual: String) = DatasetIntegrity.Item("seasonal-masses.json", "m001", mapOf(
            "liturgicalDay" to mapOf("season" to "ORDINARY_TIME", "week" to 18, "dayOfWeek" to "MONDAY", "lectionaryCycle" to cycle, "sundayCycle" to annual),
            "mass" to emptyMap<String, Any?>(),
        ))
        DatasetIntegrity.validate(listOf(mass("I", "A")))
        DatasetIntegrity.validate(listOf(mass("II", "C")))
        DatasetIntegrity.validate(listOf(mass("B", "B")))
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(mass("A", "B"))) }
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(mass("I", "II"))) }
    }

    @Test
    fun calendarDayCategoryAgreesWithOptionalDayOfWeek() {
        fun mass(category: String, day: String? = null): DatasetIntegrity.Item {
            val descriptor = mutableMapOf<String, Any?>("season" to "ADVENT", "month" to 12, "dayOfMonth" to 17, "dayCategory" to category)
            if (day != null) descriptor["dayOfWeek"] = day
            return DatasetIntegrity.Item("seasonal-masses.json", "m001", mapOf("liturgicalDay" to descriptor, "mass" to emptyMap<String, Any?>()))
        }
        DatasetIntegrity.validate(listOf(mass("WEEKDAY")))
        DatasetIntegrity.validate(listOf(mass("WEEKDAY", "SATURDAY")))
        DatasetIntegrity.validate(listOf(mass("SUNDAY", "SUNDAY")))
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(mass("WEEKDAY", "SUNDAY"))) }
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(mass("SUNDAY", "MONDAY"))) }
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(mass("FERIA"))) }
    }

    @Test
    fun resolvesTypedReferencesAndRejectsMissingOrWrongTypes() {
        fun formulary(reference: String) = DatasetIntegrity.Item("formularies.json", "f002", mapOf("mass" to mapOf("chantSetId" to reference)))
        DatasetIntegrity.validate(listOf(chant, formulary("hc001")))
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(chant, formulary("hc002"))) }
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(chant, formulary("f002"))) }
    }

    @Test
    fun rejectsDuplicateIdentityAndFormularyInheritance() {
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(chant, chant)) }
        val inherited = DatasetIntegrity.Item("formularies.json", "f002", mapOf("contentVariants" to listOf(mapOf("key" to "test", "mass" to mapOf("formularyId" to "f002")))))
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(inherited)) }
    }

    @Test
    fun rejectsUnmappedRitualMarkersBeforeRendering() {
        fun document(type: String) = DatasetIntegrity.Item("ordinary-documents.json", "od102", mapOf(
            "blocks" to listOf(mapOf("type" to type, "content" to mapOf("html" to "Source text"))),
        ))
        DatasetIntegrity.validate(listOf(document("RUBRIC")))
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(document("S"))) }
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(listOf(document("UNKNOWN"))) }
    }

    @Test
    fun emptyIntercessionChoicesKeepTheSingleFixedDefault() {
        val intercessions = DatasetIntegrity.Item("intercession-sets.json", "ic001", emptyMap())
        val formulary = DatasetIntegrity.Item("formularies.json", "f002", mapOf(
            "mass" to mapOf("intercessionsId" to "ic001", "intercessionChoices" to emptyList<Any>()),
        ))
        DatasetIntegrity.validate(listOf(intercessions, formulary))
    }

    @Test
    fun partialVariantsValidateTheirInheritedDefaultAfterMerging() {
        val readings = listOf("fr001", "fr002").map { DatasetIntegrity.Item("first-readings.json", it, emptyMap()) }
        fun owner(firstChoice: String) = DatasetIntegrity.Item("celebrations.json", "c001", mapOf(
            "mass" to mapOf("lectionary" to mapOf("firstReadingId" to "fr001")),
            "contentVariants" to listOf(mapOf("key" to "SUNDAY", "mass" to mapOf("lectionary" to mapOf(
                "choices" to mapOf("firstReading" to listOf(mapOf("firstReadingId" to firstChoice))),
            )))),
        ))
        DatasetIntegrity.validate(readings + owner("fr001"))
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(readings + owner("fr002")) }
    }

    @Test
    fun preservesIndependentChoicesWithDefaultFirst() {
        fun mass(options: List<String>) = DatasetIntegrity.Item("seasonal-masses.json", "m001", mapOf(
            "liturgicalDay" to mapOf("season" to "LENT", "week" to 1),
            "mass" to mapOf("lectionary" to mapOf("gospelId" to "g001", "choices" to mapOf("gospel" to options.map { mapOf("gospelId" to it) }))),
        ))
        val readings = listOf("g001", "g002").map { DatasetIntegrity.Item("gospels.json", it, emptyMap()) }
        DatasetIntegrity.validate(readings + mass(listOf("g001", "g002")))
        assertThrows(IllegalArgumentException::class.java) { DatasetIntegrity.validate(readings + mass(listOf("g002", "g001"))) }
    }
}
