package sk.missa.data.assets

import androidx.test.ext.junit.runners.AndroidJUnit4
import java.io.StringReader
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class StrictDatasetJsonTest {
    @Test
    fun rejectsDuplicateItemKeysBeforeTheyCanBeOverwritten() {
        assertThrows(IllegalArgumentException::class.java) {
            StrictDatasetJson.read(StringReader("""{"items":{"hc001":{},"hc001":{}}}"""))
        }
    }

    @Test
    fun rejectsDuplicateNestedTextPropertiesIncludingNullValues() {
        assertThrows(IllegalArgumentException::class.java) {
            StrictDatasetJson.read(StringReader("""{"items":{"hc001":{"text":null,"text":"replacement"}}}}"""))
        }
        val error = assertThrows(IllegalArgumentException::class.java) {
            StrictDatasetJson.read(StringReader("""{"items":[{"text":null,"text":"replacement"}]}"""))
        }
        org.junit.Assert.assertTrue(error.message.orEmpty().contains("/items/0/text"))
    }

    @Test
    fun preservesHtmlWhitespaceAndDecodedUnicode() {
        val result = StrictDatasetJson.read(StringReader("""{"html":" Upevni, Bože.<br>\n\"Ž\""}"""))
        assertEquals(" Upevni, Bože.<br>\n\"Ž\"", result["html"])
        val tree = StrictDatasetJson.read(StringReader("""{"nested":[{"value":1}]}"""))
        val nested = tree["nested"] as List<*>
        assertThrows(UnsupportedOperationException::class.java) { (tree as MutableMap<*, *>).clear() }
        assertThrows(UnsupportedOperationException::class.java) { (nested as MutableList<*>).clear() }
        assertThrows(UnsupportedOperationException::class.java) { (nested.single() as MutableMap<*, *>).clear() }
    }
}
