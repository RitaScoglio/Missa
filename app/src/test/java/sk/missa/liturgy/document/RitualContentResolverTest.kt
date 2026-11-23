package sk.missa.liturgy.document

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test
import sk.missa.data.assets.DatasetIntegrity

class RitualContentResolverTest {
    @Test
    fun riteSectionsExpandInOrderAndLeaveSelectedMassPartsExplicit() {
        val legacy = listOf(mapOf("file" to "fixture"))
        val first = mapOf("type" to "TEXT", "content" to mapOf("html" to "first"))
        val part = mapOf("type" to "MASS_PART", "part" to "PREFACE")
        val document = DatasetIntegrity.Item("ordinary-documents.json", "od209", mapOf("legacy" to legacy, "blocks" to listOf(first)))
        val rite = DatasetIntegrity.Item("triduum-rites.json", "tr003", mapOf("legacy" to legacy, "sections" to listOf(
            mapOf("blocks" to listOf(mapOf("type" to "REFERENCE", "contentId" to "od209"))),
            mapOf("blocks" to listOf(part)),
        )))
        assertEquals(listOf(first, part), RitualContentResolver(listOf(document, rite)).riteBlocks("tr003"))
        assertThrows(IllegalArgumentException::class.java) { RitualContentResolver(listOf(document, rite)).riteBlocks("od209") }
    }

    @Test
    fun passionDocumentKeepsItsOrderAndStylesAndRejectsAmbiguousBodies() {
        val legacy = listOf(mapOf("file" to "fixture"))
        val blocks = listOf(
            mapOf("type" to "HEADING", "content" to mapOf("html" to "Passion")),
            mapOf("type" to "TEXT", "style" to mapOf("format" to "PLAIN_TEXT"), "content" to mapOf("html" to "Voice\nreply")),
        )
        val document = DatasetIntegrity.Item("ordinary-documents.json", "od226", mapOf("legacy" to legacy, "blocks" to blocks))
        val passion = DatasetIntegrity.Item("gospels.json", "g084", mapOf("legacy" to legacy, "documentId" to "od226"))
        val normal = DatasetIntegrity.Item("gospels.json", "g085", mapOf("legacy" to legacy, "body" to mapOf("html" to "<b>Gospel</b>")))
        val resolver = RitualContentResolver(listOf(document, passion, normal))
        assertEquals(blocks, resolver.gospelBlocks("g084"))
        assertEquals(mapOf("html" to "<b>Gospel</b>"), resolver.gospelBlocks("g085").single()["content"])
        assertThrows(IllegalArgumentException::class.java) {
            RitualContentResolver(listOf(document, passion.copy(fields = passion.fields + ("body" to mapOf("html" to "other")))))
        }
        assertThrows(IllegalArgumentException::class.java) { RitualContentResolver(listOf(passion)) }
    }

    private fun insertion(slot: String, continuation: String? = null): Map<String, Any?> = buildMap {
        put("type", "INSERTION")
        put("slot", slot)
        put("defaultContent", mapOf("html" to "ordinary,"))
        put("style", mapOf("format" to "PLAIN_TEXT"))
        put("variants", listOf(mapOf("key" to "HOLY_THURSDAY", "content" to mapOf("html" to "today,"))))
        continuation?.let { put("continuation", mapOf("html" to it)) }
    }

    private fun resolver(vararg segments: Map<String, Any?>) = RitualContentResolver(listOf(
        DatasetIntegrity.Item("eucharistic-prayers.json", "ep003", mapOf(
            "legacy" to listOf(mapOf("file" to "fixture")),
            "segments" to segments.toList(),
        )),
    ))

    @Test
    fun combinesDefaultPrefixAndContinuationWithoutAddingSpacing() {
        val resolved = resolver(insertion("COMMUNION_WITH_SAINTS", "and the saints")).segments("ep003")
        assertEquals(mapOf("html" to "ordinary,and the saints"), resolved.single()["content"])
        assertEquals("TEXT", resolved.single()["type"])
    }

    @Test
    fun combinesSelectedPrefixExactlyOnceAndPreservesPlainTextStyleAndBell() {
        val resolved = resolver(insertion("INSTITUTION_INTRODUCTION", "\nnext"), mapOf("type" to "BELL"))
            .segments("ep003", mapOf("INSTITUTION_INTRODUCTION" to "HOLY_THURSDAY"))
        assertEquals(mapOf("html" to "today,\nnext"), resolved.first()["content"])
        assertEquals(mapOf("format" to "PLAIN_TEXT"), resolved.first()["style"])
        assertEquals("BELL", resolved.last()["type"])
    }

    @Test
    fun rejectsUnknownChoicesAndSlotsRatherThanSilentlyFallingBack() {
        val resolver = resolver(insertion("COMMUNION_WITH_SAINTS"))
        assertThrows(IllegalArgumentException::class.java) {
            resolver.segments("ep003", mapOf("COMMUNION_WITH_SAINTS" to "UNKNOWN"))
        }
        assertThrows(IllegalArgumentException::class.java) {
            resolver.segments("ep003", mapOf("UNKNOWN" to "HOLY_THURSDAY"))
        }
    }

    @Test
    fun documentChoiceReplacesAnEntireAlternativeGroupAndKeepsItsStyles() {
        fun document(id: String, blocks: List<Map<String, Any?>>) = DatasetIntegrity.Item(
            "ordinary-documents.json", id,
            mapOf("legacy" to listOf(mapOf("file" to "fixture")), "blocks" to blocks),
        )
        val first = mapOf("type" to "TEXT", "content" to mapOf("html" to "ordinary first"))
        val second = mapOf("type" to "TEXT", "content" to mapOf("html" to "ordinary second"))
        val seasonal = mapOf("type" to "TEXT", "style" to mapOf("format" to "PLAIN_TEXT"), "content" to mapOf("html" to "seasonal"))
        val resolver = RitualContentResolver(listOf(
            document("od102", listOf(mapOf("type" to "INSERTION", "slot" to "INVITATION",
                "defaultContentId" to "od103", "variants" to listOf(mapOf("key" to "LENT", "contentId" to "od104"))))),
            document("od103", listOf(first, second)), document("od104", listOf(seasonal)),
        ))
        assertEquals(listOf(first, second), resolver.blocks("od102"))
        assertEquals(listOf(seasonal), resolver.blocks("od102", mapOf("INVITATION" to "LENT")))
    }

    @Test
    fun rejectsDocumentReferenceCycles() {
        val resolver = RitualContentResolver(listOf(DatasetIntegrity.Item(
            "ordinary-documents.json", "od102", mapOf(
                "legacy" to listOf(mapOf("file" to "fixture")),
                "blocks" to listOf(mapOf("type" to "REFERENCE", "contentId" to "od102")),
            ),
        )))
        assertThrows(IllegalArgumentException::class.java) { resolver.blocks("od102") }
    }

    @Test
    fun insertsCalendarSuppliedDatesAfterExpandingDocumentsAsPlainText() {
        fun document(id: String, blocks: List<Map<String, Any?>>) = DatasetIntegrity.Item(
            "ordinary-documents.json", id, mapOf("legacy" to listOf(mapOf("file" to "fixture")), "blocks" to blocks),
        )
        val resolver = RitualContentResolver(listOf(
            document("od102", listOf(mapOf("type" to "REFERENCE", "contentId" to "od103"))),
            document("od103", listOf(
                mapOf("type" to "TEXT", "content" to mapOf("html" to "this year ")),
                mapOf("type" to "CALENDAR_DATE", "day" to "EASTER"),
                mapOf("type" to "TEXT", "content" to mapOf("html" to ".")),
            )),
        ))
        val dates = mapOf(RitualContentResolver.CalendarDate.EASTER to "5. apríla")
        val blocks = resolver.blocks("od102", calendarDates = dates)
        assertEquals(listOf("this year ", "5. apríla", "."), blocks.map { (it["content"] as Map<*, *>)["html"] })
        assertEquals(mapOf("format" to "PLAIN_TEXT"), blocks[1]["style"])
        assertThrows(IllegalArgumentException::class.java) { resolver.blocks("od102") }
        assertThrows(IllegalArgumentException::class.java) {
            resolver.blocks("od102", calendarDates = dates + (RitualContentResolver.CalendarDate.ASCENSION to "14. mája"))
        }
    }
}
