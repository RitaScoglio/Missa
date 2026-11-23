package sk.missa.liturgy

import android.content.Context
import android.graphics.Typeface
import android.text.Spanned
import android.text.style.StyleSpan
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
import sk.missa.data.assets.DatasetAssets
import sk.missa.liturgy.document.LanguageContentResolver
import sk.missa.liturgy.document.LiturgyDocuments
import sk.missa.liturgy.mass.CalendarMassSelection
import sk.missa.liturgy.mass.MassContentResolver
import sk.missa.ui.components.LiturgyBlockView

@RunWith(AndroidJUnit4::class)
class ProductionLiturgyTest {
    companion object {
        private val items by lazy { DatasetAssets.read(ApplicationProvider.getApplicationContext<Context>().assets) }
    }

    @Test
    fun calendarDrivenMassesResolveAcrossBothCyclesAndSpecialDates() {
        val calendar = LiturgicalCalendar(DatasetCelebrationCatalog.fromItems(items))
        val adapter = CalendarMassSelection(items)
        val resolver = MassContentResolver(items)
        val documents = LiturgyDocuments(items)
        var checked = 0
        for (year in 2022..2027) {
            var date = LiturgicalDate.of(year, 1, 1)
            val end = LiturgicalDate.of(year + 1, 1, 1)
            while (date < end) {
                val day = calendar.resolve(date)
                val anchors = sk.missa.calendar.LiturgicalYear.of(year)
                if (date !in anchors.easter.minusDays(3)..anchors.easter.minusDays(1)) {
                    val selection = adapter.select(day)
                    val content = resolver.resolveForSelectedGospel(selection)
                    for (field in listOf("collect", "overOfferings", "afterCommunion")) assertNotNull("$date/$field", content.orations[field])
                    for (field in listOf("entrance", "communion")) assertNotNull("$date/$field", content.chants[field])
                    val blocks = documents.mass(day, content, LiturgyDocuments.Options(prayerId = "ep003"))
                    assertTrue("$date", blocks.isNotEmpty())
                    assertFalse("$date", blocks.any { it["type"] in setOf("REFERENCE", "INSERTION", "CALENDAR_DATE") })
                    checked++
                }
                date = date.plusDays(1)
            }
        }
        assertTrue(checked > 2100)
    }

    @Test
    fun everyDocumentRiteLanguageAndAmendmentUsesTheProductionRenderer() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        assertSame(items, DatasetAssets.read(context.assets))
        assertThrows(UnsupportedOperationException::class.java) {
            @Suppress("UNCHECKED_CAST")
            (items.first().fields as MutableMap<String, Any?>)["name"] = "corrupted shared catalog"
        }
        val documents = LiturgyDocuments(items)
        val day = LiturgicalCalendar(DatasetCelebrationCatalog.fromItems(items)).resolve(LiturgicalDate.of(2026, 11, 4))
        val renderer = LiturgyBlockView(context, { documents.resource(it, day) }, { emptyList() })
        var checked = 0
        items.filter { it.dataset in setOf("ordinary-documents.json", "triduum-rites.json", "language-packs.json", "amendments.json", "eucharistic-prayers.json") }.forEach { item ->
            val blocks = documents.resource(item.id, day)
            InstrumentationRegistry.getInstrumentation().runOnMainSync {
                val column = LinearLayout(context)
                renderer.append(column, blocks)
                assertTrue(item.id, column.childCount > 0)
            }
            checked++
        }
        assertTrue(checked > 200)
    }

    @Test
    fun styledHtmlPlainTextAndTranslationSpansSurviveRendering() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        InstrumentationRegistry.getInstrumentation().runOnMainSync {
            val renderer = LiturgyBlockView(context, { emptyList() }, { emptyList() })
            val html = "<font color='#A32626'>Rubrika</font><br><b>Slovo</b><br>Druhý riadok"
            val block = mapOf("type" to "TEXT", "content" to mapOf("html" to html), "style" to mapOf("color" to "RED", "italic" to true, "alignment" to "CENTER", "size" to "SMALL"))
            val view = renderer.textView(block)
            assertTrue(view.text.toString().contains("Slovo\nDruhý riadok"))
            assertTrue((view.text as Spanned).getSpans(0, view.text.length, StyleSpan::class.java).any { it.style == Typeface.BOLD })
            assertTrue((view.text as Spanned).getSpans(0, view.text.length, android.text.style.ForegroundColorSpan::class.java).any { it.foregroundColor == android.graphics.Color.rgb(163, 38, 38) })
            assertTrue(view.typeface.isItalic)
            assertEquals(android.util.TypedValue.applyDimension(android.util.TypedValue.COMPLEX_UNIT_SP, 12f, context.resources.displayMetrics), view.textSize, 0.1f)
            assertEquals(android.view.Gravity.CENTER_HORIZONTAL, view.gravity and android.view.Gravity.HORIZONTAL_GRAVITY_MASK)
            val literal = renderer.textView(block + ("style" to mapOf("format" to "PLAIN_TEXT")))
            assertEquals(html, literal.text.toString())
            val night = LiturgyBlockView(context, { emptyList() }, { emptyList() }, nightMode = true, boldText = true)
            val nightView = night.textView(block)
            assertTrue(nightView.typeface.isBold && nightView.typeface.isItalic)
            val nightRubric = android.graphics.Color.rgb(242, 108, 99)
            assertTrue((nightView.text as Spanned).getSpans(0, nightView.text.length, android.text.style.ForegroundColorSpan::class.java).any { it.foregroundColor == nightRubric })
            assertEquals(android.graphics.Color.rgb(243, 239, 231), night.textView(LiturgyDocuments.plain("Slovo")).currentTextColor)
            val column = LinearLayout(context)
            renderer.append(column, listOf(mapOf("type" to "LANGUAGE_PARAGRAPH", "runs" to listOf(LanguageContentResolver.Run("Dominus", LanguageContentResolver.Format.PLAIN_TEXT, false), LanguageContentResolver.Run("\nPán", LanguageContentResolver.Format.PLAIN_TEXT, true)))))
            assertEquals("Dominus\nPán", (column.getChildAt(0) as TextView).text.toString())
            val separator = LinearLayout(context)
            renderer.append(separator, listOf(mapOf("type" to "SEPARATOR")))
            assertEquals(android.graphics.Color.rgb(163, 38, 38), (separator.getChildAt(0).background as android.graphics.drawable.ColorDrawable).color)
        }
    }
}
