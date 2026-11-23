package sk.missa.data.assets

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import java.io.File
import java.io.RandomAccessFile
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ValidatedDatasetCacheTest {
    private val context get() = ApplicationProvider.getApplicationContext<Context>()

    @Test
    fun roundTripsImmutableValuesAndRetainsOrder() = withCache { file ->
        val original = DatasetIntegrity.runtimeCatalog(listOf(DatasetIntegrity.Item("chant-texts.json", "ct001", linkedMapOf(
            "text" to " Upevni, Bože.<br>\n\"Ž\"",
            "values" to listOf(1L, -2L, true, false, null, linkedMapOf("first" to "á", "second" to "ľ")),
        ))))
        val cache = ValidatedDatasetCache(file, 42)
        assertNull(cache.read())
        cache.write(original)
        val restored = requireNotNull(cache.read())
        assertEquals(original, restored)
        assertEquals(listOf("text", "values"), restored.single().fields.keys.toList())
        assertThrows(UnsupportedOperationException::class.java) { (restored.single().fields as MutableMap<*, *>).clear() }
        assertThrows(UnsupportedOperationException::class.java) { (restored.single().fields["values"] as MutableList<*>).clear() }
    }

    @Test
    fun rejectsUpdatesCorruptionAndInterruptedWrites() = withCache { file ->
        val cache = ValidatedDatasetCache(file, 42)
        val original = DatasetIntegrity.runtimeCatalog(listOf(DatasetIntegrity.Item("chant-texts.json", "ct001", emptyMap())))
        cache.write(original)
        assertNull(ValidatedDatasetCache(file, 43).read())
        assertEquals(original, cache.read())
        RandomAccessFile(file, "rw").use {
            val position = it.length() - 1
            it.seek(position)
            val value = it.read()
            it.seek(position)
            it.write(value xor 1)
        }
        assertNull(cache.read())
        file.writeBytes(byteArrayOf(1, 2, 3))
        assertNull(cache.read())
        cache.write(original)
        assertEquals(original, cache.read())
    }

    @Test
    fun roundTripsTheCompleteBundledCorpus() = withCache { file ->
        val original = DatasetAssets.read(context.assets)
        val cache = ValidatedDatasetCache(file, 42)
        cache.write(original)
        assertEquals(original, cache.read())
    }

    private fun withCache(check: (File) -> Unit) {
        val file = File.createTempFile("liturgy-cache-test-", ".bin", context.cacheDir)
        try {
            check(file)
        } finally {
            android.util.AtomicFile(file).delete()
        }
    }
}
