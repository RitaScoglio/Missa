package sk.missa.liturgy.document

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test
import sk.missa.data.assets.DatasetIntegrity

class LanguageContentResolverTest {
    private fun resolver(lines: List<Map<String, Any?>>) = LanguageContentResolver(listOf(
        DatasetIntegrity.Item("language-packs.json", "lp007", mapOf(
            "legacy" to listOf(mapOf("file" to "fixture")),
            "sections" to linkedMapOf("communionReception" to mapOf("title" to "Agnus", "lines" to lines)),
        )),
    ))

    @Test
    fun keepsThreeAgnusPairsInOneParagraphWithOriginalNewlinesAndStyles() {
        val sections = resolver(listOf(
            mapOf("primary" to "first", "translation" to "translation1\n"),
            mapOf("primary" to "second", "translation" to "translation2\n", "joinPrevious" to true),
            mapOf("primary" to "third", "translation" to "translation3", "joinPrevious" to true),
            mapOf("primary" to "next", "primaryFormat" to "HTML", "translation" to "next translation"),
        )).sections("lp007")
        val paragraphs = sections.single().paragraphs
        assertEquals(2, paragraphs.size)
        assertEquals("first\ntranslation1\nsecond\ntranslation2\nthird\ntranslation3", paragraphs[0].runs.joinToString("") { it.text })
        assertEquals(listOf(false, true, false, true, false, true), paragraphs[0].runs.map { it.translation })
        assertEquals(LanguageContentResolver.Format.HTML, paragraphs[1].runs[0].format)
        assertEquals(LanguageContentResolver.Format.PLAIN_TEXT, paragraphs[1].runs[1].format)
    }

    @Test
    fun preservesHungarianBonusNewlineWithoutAddingAnotherAndRejectsOrphanContinuation() {
        val run = resolver(listOf(mapOf("primary" to "peace", "translation" to "\npokoj", "translationPrefix" to "")))
            .sections("lp007").single().paragraphs.single().runs.last()
        assertEquals("\npokoj", run.text)
        assertThrows(IllegalArgumentException::class.java) {
            resolver(listOf(mapOf("primary" to "orphan", "joinPrevious" to true))).sections("lp007")
        }
    }
}
