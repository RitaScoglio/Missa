package sk.missa.liturgy

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.data.assets.DatasetAssets

/** Acceptance guard: choices must have their own IDs, including qualified Alebo rubrics. */
@RunWith(AndroidJUnit4::class)
class NoEmbeddedChantOrPrayerAlternativesTest {
    @Test
    fun sourceChoicesAreNotEmbeddedInChantOrPrayerFields() {
        val items = DatasetAssets.read(ApplicationProvider.getApplicationContext<Context>().assets)
        val remaining = mutableListOf<String>()
        for (item in items) {
            val fields = when (item.dataset) {
                "chant-sets.json" -> listOf("entrance", "communion")
                "oration-sets.json" -> listOf("collect", "overOfferings", "afterCommunion")
                else -> continue
            }
            for (name in fields) {
                val field = item.fields[name] as? Map<*, *> ?: continue
                val text = if (item.dataset == "chant-sets.json") (field["text"] as? Map<*, *>)?.get("html")
                    else field["html"]
                if (field["alternatives"] != null || (text as? String)?.let { Regex(">\\s*Alebo\\b").containsMatchIn(it) } == true) {
                    remaining += "${item.id}.$name"
                }
            }
        }
        assertTrue("Chants or prayers still contain embedded choices: $remaining", remaining.isEmpty())
    }
}
