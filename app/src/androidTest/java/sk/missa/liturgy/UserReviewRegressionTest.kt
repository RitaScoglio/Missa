package sk.missa.liturgy

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.calendar.LiturgicalCalendar
import sk.missa.calendar.LiturgicalDate
import sk.missa.calendar.celebration.CelebrationRank
import sk.missa.calendar.celebration.DatasetCelebrationCatalog
import sk.missa.data.assets.DatasetAssets
import sk.missa.liturgy.document.LanguageContentResolver
import sk.missa.liturgy.document.LiturgyDocuments
import sk.missa.liturgy.mass.CalendarMassSelection
import sk.missa.liturgy.mass.MassContentResolver

@RunWith(AndroidJUnit4::class)
class UserReviewRegressionTest {
    private val items by lazy { DatasetAssets.read(ApplicationProvider.getApplicationContext<Context>().assets) }
    private val calendar by lazy { LiturgicalCalendar(DatasetCelebrationCatalog.fromItems(items)) }

    @Test
    fun solemnitiesBlockEmberMassesAndSacredHeartBlocksTheBaptistVigil() {
        for (date in listOf(LiturgicalDate.of(2027, 9, 15), LiturgicalDate.of(2027, 12, 8))) {
            val day = calendar.resolve(date)
            assertEquals(date.toString(), CelebrationRank.SOLEMNITY, day.primaryCelebration?.rank)
            assertFalse(day.generatedObservances.any { it.id == "ember-days" })
        }
        assertTrue(calendar.resolve(LiturgicalDate.of(2027, 9, 17)).generatedObservances.any { it.id == "ember-days" })
        val sacredHeart = calendar.resolve(LiturgicalDate.of(2028, 6, 23), evening = true)
        assertEquals(CelebrationRank.SOLEMNITY, sacredHeart.primaryCelebration?.rank)
        assertFalse(sacredHeart.alternatives.any { it.rank == CelebrationRank.VIGIL })
        assertTrue(sacredHeart.suppressedCelebrations.any { it.rank == CelebrationRank.VIGIL })
        val apostles = calendar.resolve(LiturgicalDate.of(2029, 5, 3))
        assertEquals(CelebrationRank.FEAST, apostles.primaryCelebration?.rank)
        assertFalse(apostles.generatedObservances.any { it.id == "first-thursday" })
    }

    @Test
    fun reportedDatesResolveTheirOwnMassAndLentenBlessingWithoutPreviousDateState() {
        val adapter = CalendarMassSelection(items)
        val resolver = MassContentResolver(items)
        val documents = LiturgyDocuments(items)
        for ((date, expected) in listOf(19 to "od067", 20 to "od068", 21 to "od069")) {
            val day = calendar.resolve(LiturgicalDate.of(2027, 2, date))
            val content = resolver.resolveForSelectedGospel(adapter.select(day))
            assertEquals(expected, content.mass["blessingDocumentId"])
            assertTrue(documents.resource(expected, day).isNotEmpty())
            assertTrue(documents.mass(day, content).any { it["type"] == "POPUP" && it["contentId"] == expected })
        }
        val lentenBlessings = items.filter {
            it.dataset == "seasonal-masses.json" && (it.fields["liturgicalDay"] as? Map<*, *>)?.get("season") == "LENT"
        }.map { (it.fields["mass"] as Map<*, *>)["blessingDocumentId"] }
        assertEquals(55, lentenBlessings.size)
        assertFalse(lentenBlessings.contains(null))
        assertEquals(43, lentenBlessings.toSet().size)
        val joseph = calendar.resolve(LiturgicalDate.of(2027, 3, 19))
        val josephBlocks = documents.mass(joseph, resolver.resolveForSelectedGospel(adapter.select(joseph)))
        assertFalse(josephBlocks.any { items.singleOrNull { item -> item.id == it["contentId"] }?.fields?.get("category") == "LENT_PRAYER_OVER_PEOPLE" })
        for (date in 1..30) {
            val day = calendar.resolve(LiturgicalDate.of(2028, 11, date))
            assertTrue(documents.mass(day, resolver.resolveForSelectedGospel(adapter.select(day)), LiturgyDocuments.Options()).isNotEmpty())
        }
        val january = LiturgicalDate.of(2027, 1, 2)
        val saturday = calendar.resolve(january)
        assertTrue(saturday.generatedObservances.any { it.id == "marian-saturday" })
        val marianId = items.single {
            it.dataset == "optional-masses.json" && (it.fields["availability"] as? Map<*, *>)?.get("generatedObservanceKey") == "marian-saturday"
        }.id
        val first = resolver.resolveForSelectedGospel(adapter.select(saturday, marianId))
        calendar.resolve(LiturgicalDate.of(2026, 11, 16))
        val again = resolver.resolveForSelectedGospel(adapter.select(calendar.resolve(january), marianId))
        assertEquals(first, again)
        assertTrue(documents.mass(saturday, first, LiturgyDocuments.Options()).isNotEmpty())
    }

    @Test
    fun reportedLanguageDefectsRemainCorrected() {
        val runtime = LanguageContentResolver(items)
        for (pack in items.filter { it.dataset == "language-packs.json" }) {
            val sections = runtime.sections(pack.id)
            assertTrue(sections.single { it.key == "reading" }.title!!.contains("MODLITBA DŇA"))
            val text = sections.single { it.key == "communionReception" }.paragraphs.flatMap { it.runs }
            assertFalse(text.any { it.translation && it.text.startsWith("\nHľa, Baránok") && it.text.contains("daruj nám pokoj") })
            if (pack.id != "lp002") assertTrue(text.any { it.translation && it.text.contains("Blahoslavení tí, čo sú pozvaní na hostinu Baránkovu.") })
        }
        val german = runtime.sections("lp004").single { it.key == "gloria" }.paragraphs.toString()
        assertTrue(german.contains("denn groß ist deine Herrlichkeit"))
        val italian = runtime.sections("lp006").single { it.key == "preparationOfGifts" }.paragraphs.flatMap { it.runs }
        assertTrue(italian.any { !it.translation && it.text.contains("questo vino, frutto della vite e") })
        assertTrue(italian.any { !it.translation && it.text.contains("questo pane, frutto della terra e") })
    }
}
