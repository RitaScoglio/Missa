package sk.missa.liturgy.mass

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Test
import sk.missa.data.assets.DatasetIntegrity

class MassContentResolverTest {
    private val legacy = listOf(mapOf("file" to "fixture"))

    private fun item(file: String, id: String, vararg fields: Pair<String, Any?>) =
        DatasetIntegrity.Item(file, id, mapOf("legacy" to legacy) + fields)

    @Test
    fun gospelStoryDoesNotChangeAnOrdinaryScalarCommunionFixture() {
        val items = listOf(
            owner("seasonal-masses.json", "m001", "chantSetId" to "hs001"),
            item("chant-sets.json", "hs001", "communion" to "ordinary communion"),
        )
        val result = MassContentResolver(items).resolve(
            MassContentResolver.Selection("m001", gospelStory = MassContentResolver.GospelStory.OTHER),
        )
        assertEquals("ordinary communion", result.chants["communion"])
    }

    private fun owner(file: String, id: String, vararg fields: Pair<String, Any?>) =
        item(file, id, "mass" to mapOf(*fields), *if (file == "seasonal-masses.json") {
            arrayOf("liturgicalDay" to mapOf("season" to "LENT"))
        } else emptyArray())

    @Test
    fun resolvesSeparatePrayerIdsAndRespectsAProperCollectOverride() {
        val resolver = MassContentResolver(listOf(
            owner("seasonal-masses.json", "m001", "orationSetId" to "os012"),
            owner("formularies.json", "f002", "orationSetId" to "oc001", "collectPrayerIds" to listOf("pt012", "pt092")),
            owner("celebrations.json", "c001", "formularyId" to "f002"),
            owner("celebrations.json", "c002", "formularyId" to "f002", "orationSetId" to "op001"),
            item("oration-sets.json", "os012", "collect" to mapOf("html" to "seasonal")),
            item("oration-sets.json", "oc001", "overOfferings" to mapOf("html" to "offering")),
            item("oration-sets.json", "op001", "collect" to mapOf("html" to "proper")),
            item("prayer-texts.json", "pt012", "text" to mapOf("html" to "first")),
            item("prayer-texts.json", "pt092", "text" to mapOf("html" to "second")),
        ))
        val first = resolver.resolve(MassContentResolver.Selection("m001", properId = "c001"))
        val second = resolver.resolve(MassContentResolver.Selection("m001", properId = "c001", collectChoice = 1))
        assertEquals(listOf("pt012", "pt092"), first.mass["collectPrayerIds"])
        assertEquals("first", (first.orations["collect"] as Map<*, *>)["html"])
        assertEquals("second", (second.orations["collect"] as Map<*, *>)["html"])
        assertEquals(first.orations["overOfferings"], second.orations["overOfferings"])
        assertThrows(IllegalArgumentException::class.java) {
            resolver.resolve(MassContentResolver.Selection("m001", properId = "c001", collectChoice = 2))
        }
        val proper = resolver.resolve(MassContentResolver.Selection("m001", properId = "c002"))
        assertFalse(proper.mass.containsKey("collectPrayerIds"))
        assertEquals("proper", (proper.orations["collect"] as Map<*, *>)["html"])
    }

    @Test
    fun separateChantAndPrayerChoicesAreIndependentAndProperFieldsTakePrecedence() {
        val resolver = MassContentResolver(listOf(
            owner("seasonal-masses.json", "m001", "chantSetId" to "hs001", "orationSetId" to "os012"),
            owner("formularies.json", "f002", "entranceChantIds" to listOf("ct020", "ct021"),
                "communionChantIds" to listOf("ct022", "ct023"), "offeringPrayerIds" to listOf("pt012", "pt092"),
                "afterCommunionPrayerIds" to listOf("pt013", "pt014")),
            owner("celebrations.json", "c001", "formularyId" to "f002"),
            owner("celebrations.json", "c002", "formularyId" to "f002", "chantSetId" to "hp001", "orationSetId" to "op001"),
            item("chant-sets.json", "hs001", "entrance" to mapOf("citation" to "", "text" to mapOf("html" to "day"))),
            item("chant-sets.json", "hp001", "entrance" to mapOf("citation" to "", "text" to mapOf("html" to "proper"))),
            item("oration-sets.json", "os012", "overOfferings" to mapOf("html" to "day")),
            item("oration-sets.json", "op001", "overOfferings" to mapOf("html" to "proper")),
            item("chant-texts.json", "ct020", "citation" to "1", "text" to mapOf("html" to "entrance 1")),
            item("chant-texts.json", "ct021", "citation" to "2", "text" to mapOf("html" to "entrance 2")),
            item("chant-texts.json", "ct022", "citation" to "3", "text" to mapOf("html" to "communion 1")),
            item("chant-texts.json", "ct023", "citation" to "4", "text" to mapOf("html" to "communion 2")),
            item("prayer-texts.json", "pt012", "text" to mapOf("html" to "offering 1")),
            item("prayer-texts.json", "pt092", "text" to mapOf("html" to "offering 2")),
            item("prayer-texts.json", "pt013", "text" to mapOf("html" to "after 1")),
            item("prayer-texts.json", "pt014", "text" to mapOf("html" to "after 2")),
        ))
        val selected = resolver.resolve(MassContentResolver.Selection("m001", properId = "c001",
            entranceChoice = 1, communionChoice = 1, offeringChoice = 1, afterCommunionChoice = 1))
        assertEquals("entrance 2", ((selected.chants["entrance"] as Map<*, *>)["text"] as Map<*, *>)["html"])
        assertEquals("communion 2", ((selected.chants["communion"] as Map<*, *>)["text"] as Map<*, *>)["html"])
        assertEquals("offering 2", (selected.orations["overOfferings"] as Map<*, *>)["html"])
        assertEquals("after 2", (selected.orations["afterCommunion"] as Map<*, *>)["html"])
        val proper = resolver.resolve(MassContentResolver.Selection("m001", properId = "c002"))
        assertFalse(proper.mass.containsKey("entranceChantIds"))
        assertFalse(proper.mass.containsKey("offeringPrayerIds"))
        assertEquals("proper", ((proper.chants["entrance"] as Map<*, *>)["text"] as Map<*, *>)["html"])
        assertEquals("proper", (proper.orations["overOfferings"] as Map<*, *>)["html"])
        assertEquals(listOf("ct022", "ct023"), proper.mass["communionChantIds"])
    }

    @Test
    fun preservesExplicitIntrinsicPrefacePermissionAcrossLayersAndVariants() {
        val resolver = MassContentResolver(listOf(
            owner("seasonal-masses.json", "m001", "allowEucharisticPrayerTwoPreface" to true),
            item("seasonal-masses.json", "m002",
                "mass" to emptyMap<String, Any?>(),
                "liturgicalDay" to mapOf("season" to "ORDINARY_TIME", "week" to 1, "dayOfWeek" to "MONDAY", "lectionaryCycle" to "I"),
            ),
            owner("formularies.json", "f002", "allowEucharisticPrayerTwoPreface" to true),
            item("celebrations.json", "c001",
                "mass" to mapOf("formularyId" to "f002", "allowEucharisticPrayerTwoPreface" to false),
                "contentVariants" to listOf(mapOf(
                    "key" to "CONTEXT_ALLOWING_INTRINSIC_PREFACE",
                    "legacy" to legacy,
                    "mass" to mapOf("allowEucharisticPrayerTwoPreface" to true),
                )),
            ),
        ))
        assertEquals(true, resolver.resolve(MassContentResolver.Selection("m001")).mass["allowEucharisticPrayerTwoPreface"])
        assertEquals(false, resolver.resolve(MassContentResolver.Selection("m001", "c001")).mass["allowEucharisticPrayerTwoPreface"])
        assertEquals(true, resolver.resolve(MassContentResolver.Selection(
            "m001", "c001", properVariant = "CONTEXT_ALLOWING_INTRINSIC_PREFACE",
        )).mass["allowEucharisticPrayerTwoPreface"])
        assertFalse(resolver.resolve(MassContentResolver.Selection("m002")).mass.containsKey("allowEucharisticPrayerTwoPreface"))
    }

    @Test
    fun selectsChantAndCollectAlternativesIndependentlyAfterFallback() {
        val items = listOf(
            owner("seasonal-masses.json", "m001", "chantSetId" to "hs001", "orationSetId" to "os012"),
            item("chant-sets.json", "hs001", "communion" to mapOf(
                "citation" to "first citation", "text" to mapOf("html" to "first chant"),
                "alternatives" to listOf(mapOf("label" to "Alebo:", "citation" to "second citation", "text" to mapOf("html" to "second chant"))),
            )),
            item("oration-sets.json", "os012", "collect" to mapOf(
                "html" to "first prayer", "alternatives" to listOf(mapOf("label" to "Alebo:", "html" to "second prayer")),
            )),
        )
        val resolver = MassContentResolver(items)
        val default = resolver.resolve(MassContentResolver.Selection("m001"))
        assertEquals("first prayer", (default.orations["collect"] as Map<*, *>)["html"])
        assertEquals("first chant", ((default.chants["communion"] as Map<*, *>)["text"] as Map<*, *>)["html"])
        val selected = resolver.resolve(MassContentResolver.Selection("m001", communionChoice = 1, collectChoice = 1))
        assertEquals("second prayer", (selected.orations["collect"] as Map<*, *>)["html"])
        assertEquals("second citation", (selected.chants["communion"] as Map<*, *>)["citation"])
        assertEquals("second chant", ((selected.chants["communion"] as Map<*, *>)["text"] as Map<*, *>)["html"])
        assertThrows(IllegalArgumentException::class.java) {
            resolver.resolve(MassContentResolver.Selection("m001", communionChoice = 2))
        }
        assertThrows(IllegalArgumentException::class.java) {
            resolver.resolve(MassContentResolver.Selection("m001", collectChoice = -1))
        }
    }

    @Test
    fun mergesEachChantAndPrayerIndependentlyAndKeepsIntercessionsWhole() {
        val items = listOf(
            owner("seasonal-masses.json", "m001", "chantSetId" to "hs001", "orationSetId" to "os012", "intercessionsId" to "is001"),
            owner("formularies.json", "f002", "chantSetId" to "hc001", "orationSetId" to "oc001", "intercessionsId" to "ic001"),
            owner("celebrations.json", "c001", "formularyId" to "f002", "chantSetId" to "hp001", "orationSetId" to "op001"),
            item("chant-sets.json", "hs001", "entrance" to "seasonal entrance", "communion" to "seasonal communion"),
            item("chant-sets.json", "hc001", "entrance" to "common entrance"),
            item("chant-sets.json", "hp001", "communion" to "proper communion"),
            item("oration-sets.json", "os012", "collect" to "seasonal collect", "overOfferings" to "seasonal offerings", "afterCommunion" to "seasonal ending"),
            item("oration-sets.json", "oc001", "overOfferings" to "common offerings"),
            item("oration-sets.json", "op001", "collect" to "proper collect"),
            item("intercession-sets.json", "is001"), item("intercession-sets.json", "ic001"),
        )
        val result = MassContentResolver(items).resolve(MassContentResolver.Selection("m001", "c001"))
        assertEquals(mapOf("entrance" to "common entrance", "communion" to "proper communion"), result.chants)
        assertEquals(mapOf("collect" to "proper collect", "overOfferings" to "common offerings", "afterCommunion" to "seasonal ending"), result.orations)
        assertEquals("ic001", result.mass["intercessionsId"])
    }

    @Test
    fun sourceProvenFormularyAbsenceDoesNotFallBackToSeasonalPrayers() {
        val items = listOf(
            owner("seasonal-masses.json", "m001", "orationSetId" to "os012"),
            owner("formularies.json", "f002", "orationSetId" to "oc001"),
            owner("celebrations.json", "c001", "formularyId" to "f002"),
            item("oration-sets.json", "os012", "collect" to "seasonal collect", "overOfferings" to "seasonal offerings", "afterCommunion" to "seasonal ending"),
            item("oration-sets.json", "oc001", "collect" to "source collect", "overOfferings" to null, "afterCommunion" to null),
        )
        val result = MassContentResolver(items).resolve(MassContentResolver.Selection("m001", "c001"))
        assertEquals("source collect", result.orations["collect"])
        assertTrue(result.orations.containsKey("overOfferings"))
        assertTrue(result.orations.containsKey("afterCommunion"))
        assertEquals(null, result.orations["overOfferings"])
        assertEquals(null, result.orations["afterCommunion"])
    }

    @Test
    fun collectOnlyContextUsesSeasonalRemainderEvenWithSelectedCommonFormulary() {
        val items = listOf(
            owner("seasonal-masses.json", "m001", "orationSetId" to "os012"),
            owner("formularies.json", "f002", "orationSetId" to "oc001"),
            owner("celebrations.json", "c001", "formularyId" to "f002", "orationSetId" to "op001"),
            item("oration-sets.json", "os012", "collect" to "seasonal collect", "overOfferings" to "seasonal offerings", "afterCommunion" to "seasonal ending"),
            item("oration-sets.json", "oc001", "collect" to "common collect", "overOfferings" to "common offerings", "afterCommunion" to "common ending"),
            item("oration-sets.json", "op001", "collect" to "proper collect", "overOfferings" to "proper offerings", "afterCommunion" to "proper ending"),
        )
        val result = MassContentResolver(items).resolve(MassContentResolver.Selection(
            "m001", "c001", orationUse = MassContentResolver.OrationUse.PROPER_COLLECT_WITH_SEASONAL_REMAINDER,
        ))
        assertEquals(mapOf("collect" to "proper collect", "overOfferings" to "seasonal offerings", "afterCommunion" to "seasonal ending"), result.orations)
    }

    @Test
    fun explicitAbsenceAndIndependentReadingChoicesStopLowerLayerInheritance() {
        val items = listOf(
            owner("seasonal-masses.json", "m001", "lectionary" to mapOf(
                "secondReadingId" to "sr001", "gospelId" to "g001", "firstReadingId" to "fr001",
                "choices" to mapOf("gospel" to listOf(mapOf("gospelId" to "g001"), mapOf("gospelId" to "g002")),
                    "firstReading" to listOf(mapOf("firstReadingId" to "fr001"), mapOf("firstReadingId" to "fr002"))),
            ), "intercessionsId" to "is001", "intercessionChoices" to listOf(mapOf("intercessionsId" to "is001"), mapOf("intercessionsId" to "is002")), "prefaceIds" to listOf("pf061")),
            owner("celebrations.json", "c001", "lectionary" to mapOf("secondReadingId" to null, "gospelId" to "g003"), "intercessionsId" to "ip001", "prefaceIds" to emptyList<String>()),
            *listOf("fr001", "fr002").map { item("first-readings.json", it) }.toTypedArray(),
            *listOf("g001", "g002", "g003").map { item("gospels.json", it) }.toTypedArray(),
            item("second-readings.json", "sr001"), item("prefaces.json", "pf061"),
            item("intercession-sets.json", "is001"), item("intercession-sets.json", "is002"), item("intercession-sets.json", "ip001"),
        )
        val resolver = MassContentResolver(items)
        val result = resolver.resolve(MassContentResolver.Selection("m001", "c001")).mass
        val readings = result["lectionary"] as Map<*, *>
        assertEquals(null, readings["secondReadingId"])
        assertEquals("g003", readings["gospelId"])
        assertEquals(setOf("firstReading"), (readings["choices"] as Map<*, *>).keys)
        assertFalse(result.containsKey("intercessionChoices"))
        assertEquals(emptyList<String>(), result["prefaceIds"])
        val selected = resolver.resolve(MassContentResolver.Selection(
            "m001", readingChoices = mapOf("firstReading" to 1, "gospel" to 1), intercessionChoice = 1,
        )).mass
        val selectedReadings = selected["lectionary"] as Map<*, *>
        assertEquals("fr002", selectedReadings["firstReadingId"])
        assertEquals("g002", selectedReadings["gospelId"])
        assertEquals("is002", selected["intercessionsId"])
        assertThrows(IllegalArgumentException::class.java) {
            resolver.resolve(MassContentResolver.Selection("m001", "c001", readingChoices = mapOf("gospel" to 1)))
        }
        assertThrows(IllegalArgumentException::class.java) {
            resolver.resolve(MassContentResolver.Selection("m001", intercessionChoice = 2))
        }
    }

    @Test
    fun appliesOneNamedVariantAndAcceptsOnlyOfferedFormularies() {
        val items = listOf(
            owner("seasonal-masses.json", "m001"),
            item("celebrations.json", "c001", "mass" to mapOf("formularyId" to "f002"),
                "formularyChoices" to listOf(mapOf("formularyId" to "f002"), mapOf("formularyId" to "f003")),
                "contentVariants" to listOf(mapOf("key" to "easter", "legacy" to legacy, "mass" to mapOf("prefaceIds" to listOf("pf061"))))),
            owner("formularies.json", "f002"), owner("formularies.json", "f003"), owner("formularies.json", "f004"),
            item("prefaces.json", "pf061"),
        )
        val resolver = MassContentResolver(items)
        val selection = MassContentResolver.Selection("m001", "c001", "f003", properVariant = "easter")
        val result = resolver.resolve(selection).mass
        assertEquals("f003", result["formularyId"])
        assertEquals(listOf("pf061"), result["prefaceIds"])
        assertThrows(IllegalArgumentException::class.java) { resolver.resolve(selection.copy(formularyId = "f004")) }
        assertThrows(IllegalArgumentException::class.java) { resolver.resolve(selection.copy(properVariant = "missing")) }
    }
}
