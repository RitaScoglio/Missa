package sk.missa.ui.components

import android.content.Context
import android.text.Spanned
import android.text.style.RelativeSizeSpan
import android.widget.LinearLayout
import android.widget.TextView
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.calendar.LiturgicalCalendar
import sk.missa.calendar.LiturgicalDate
import sk.missa.calendar.LiturgicalYear
import sk.missa.calendar.celebration.DatasetCelebrationCatalog
import sk.missa.calendar.celebration.MovableCelebration
import sk.missa.data.assets.DatasetAssets
import sk.missa.liturgy.document.LanguageContentResolver
import sk.missa.liturgy.document.LiturgyDocuments
import sk.missa.liturgy.mass.CalendarMassSelection
import sk.missa.liturgy.mass.MassContentResolver

@RunWith(AndroidJUnit4::class)
class LiturgyRenderingTest {
    private val context = ApplicationProvider.getApplicationContext<Context>()
    private val items = DatasetAssets.read(context.assets)
    private val documents = LiturgyDocuments(items)
    private val calendar = LiturgicalCalendar(DatasetCelebrationCatalog.fromItems(items))
    private val selector = CalendarMassSelection(items)
    private val resolver = MassContentResolver(items)

    private fun mass(date: LiturgicalDate): List<Map<String, Any?>> {
        val day = calendar.resolve(date)
        return documents.mass(day, resolver.resolveForSelectedGospel(selector.select(day)), LiturgyDocuments.Options(prayerId = "ep002"))
    }

    @Test
    fun dismissalClosesEveryOrdinaryMassAndUsesAlleluiaOnlyInEasterOctave() {
        val easter = LiturgicalYear.of(2026).easter
        for (date in listOf(LiturgicalDate.of(2026, 11, 16), easter.plusDays(8)) + (0..7).map(easter::plusDays)) {
            val expected = documents.resource(if (date in easter..easter.plusDays(7)) "od042" else "od041", calendar.resolve(date))
            assertEquals(date.toString(), expected, mass(date).takeLast(expected.size))
        }
        val sunday = calendar.resolve(LiturgicalDate.of(2026, 11, 15))
        for (id in listOf("om004", "om007")) assertThrows(IllegalArgumentException::class.java) { selector.select(sunday, id) }
    }

    @Test
    fun contextualRitesAndDevotionsAreReachableAtTheCorrectPointOfTheMass() {
        val year = LiturgicalYear.of(2026)
        val cases = mapOf(
            LiturgicalDate.of(2026, 2, 2) to setOf("od150", "od153"),
            year.easter.minusDays(7) to setOf("od110"),
            year.adventStart to setOf("od003"),
            LiturgicalDate.of(2026, 12, 25) to setOf("od101"),
            LiturgicalDate.of(2026, 1, 6) to setOf("od043", "od044"),
            LiturgicalDate.of(2026, 12, 31) to setOf("od045"),
            LiturgicalDate.of(2026, 1, 1) to setOf("od046"),
            year.dateOf(sk.missa.calendar.celebration.MovableCelebration.CHRIST_THE_KING) to setOf("od033"),
            year.dateOf(sk.missa.calendar.celebration.MovableCelebration.CORPUS_CHRISTI) to setOf("od040"),
        )
        for ((date, required) in cases) {
            val blocks = mass(date)
            val popups = blocks.filter { it["type"] == "POPUP" }.map { it["contentId"] as String }
            assertTrue("$date/$popups", popups.containsAll(required + setOf("od180", "od047", "od048", "od049", "od050", "od051")))
            popups.forEach { assertTrue(documents.resource(it, calendar.resolve(date)).isNotEmpty()) }
            assertEquals("BELL", blocks.first { it["type"] != "POPUP" }["type"])
        }
        val day = calendar.resolve(LiturgicalDate.of(2026, 1, 6))
        val expected = documents.resource("od172", day)
        assertEquals(expected, documents.resource("od165", day).takeLast(expected.size))
        assertFalse(mass(LiturgicalDate.of(2026, 1, 5)).any { it["type"] == "POPUP" && it["contentId"] == "od043" })
    }

    @Test
    fun allLanguageHeadingsRenderHtmlAndTranslationsRemainSmallerThanPrimaryText() {
        val day = calendar.resolve(LiturgicalDate.of(2026, 11, 16))
        val renderer = LiturgyBlockView(context, { documents.resource(it, day) }, { emptyList() })
        for (pack in items.filter { it.dataset == "language-packs.json" }) {
            val blocks = documents.resource(pack.id, day)
            InstrumentationRegistry.getInstrumentation().runOnMainSync {
                val column = LinearLayout(context)
                renderer.append(column, blocks)
                blocks.forEachIndexed { index, block ->
                    val view = column.getChildAt(index) as TextView
                    if (block["type"] == "HEADING") assertFalse("${pack.id}: ${view.text}", view.text.contains("<b>") || view.text.contains("<br>"))
                    else {
                        val runs = block["runs"] as List<*>
                        val translated = runs.any { (it as LanguageContentResolver.Run).translation }
                        val spans = view.text as Spanned
                        val sizes = spans.getSpans(0, spans.length, RelativeSizeSpan::class.java)
                        assertEquals(pack.id, translated, sizes.isNotEmpty())
                        sizes.forEach { assertEquals(0.75f, it.sizeChange, 0f) }
                    }
                }
            }
        }
    }
}
