package sk.missa.liturgy.document

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.data.assets.DatasetAssets

/** Exercises every source-backed Eucharistic Prayer I insertion, including its continuation. */
@RunWith(AndroidJUnit4::class)
class EucharisticInsertionsTest {
    @Test
    fun eachInsertionVariantReplacesOnlyItsOwnSlot() {
        val items = DatasetAssets.read(ApplicationProvider.getApplicationContext<Context>().assets)
        val prayer = items.single { it.id == "ep003" }.fields
        val source = (prayer["segments"] as List<*>).map { it as Map<*, *> }
        val resolver = RitualContentResolver(items)
        val defaults = resolver.segments("ep003")
        assertEquals(source.size, defaults.size)
        val slots = source.withIndex().filter { it.value["type"] == "INSERTION" }
        assertEquals(3, slots.size)
        var variantsChecked = 0
        for ((index, insertion) in slots) {
            val defaultText = (insertion["defaultContent"] as Map<*, *>)["html"] as String
            val continuation = (insertion["continuation"] as? Map<*, *>)?.get("html") as? String ?: ""
            assertEquals(defaultText + continuation, (defaults[index]["content"] as Map<*, *>)["html"])
            val slot = insertion["slot"] as String
            for (raw in insertion["variants"] as List<*>) {
                val variant = raw as Map<*, *>
                val key = variant["key"] as String
                val expected = ((variant["content"] as Map<*, *>)["html"] as String) + continuation
                val selected = resolver.segments("ep003", mapOf(slot to key))
                assertEquals("$slot/$key", expected, (selected[index]["content"] as Map<*, *>)["html"])
                assertEquals("$slot/$key", defaults.filterIndexed { i, _ -> i != index },
                    selected.filterIndexed { i, _ -> i != index })
                assertFalse(selected.any { it["type"] == "INSERTION" })
                variantsChecked++
            }
        }
        assertEquals(11, variantsChecked)
    }
}
