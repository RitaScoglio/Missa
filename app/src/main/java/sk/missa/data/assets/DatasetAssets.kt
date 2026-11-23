package sk.missa.data.assets

import android.content.res.AssetManager
import android.util.Log
import java.util.WeakHashMap

/** One root file per content type; IDs stay unique across the catalog. */
object DatasetAssets {
    private const val ROOT = "liturgy"
    private val catalogs = WeakHashMap<AssetManager, List<DatasetIntegrity.Item>>()

    @Synchronized
    fun read(assets: AssetManager): List<DatasetIntegrity.Item> = read(assets, null)

    @Synchronized
    internal fun read(assets: AssetManager, cache: ValidatedDatasetCache?): List<DatasetIntegrity.Item> {
        catalogs[assets]?.let { return it }
        val started = System.nanoTime()
        cache?.read()?.let { cached ->
            catalogs[assets] = cached
            Log.i("MissaStartup", "Validated dataset cache loaded in ${(System.nanoTime() - started) / 1_000_000} ms")
            return cached
        }
        val items = readDirectory(assets, ROOT)
        Log.i("MissaStartup", "Dataset JSON parsed in ${(System.nanoTime() - started) / 1_000_000} ms")
        require(items.isNotEmpty()) { "No liturgical content bundled" }
        val validating = System.nanoTime()
        return DatasetIntegrity.parsedCatalog(items).also {
            catalogs[assets] = it
            Log.i("MissaStartup", "Dataset snapshot validated in ${(System.nanoTime() - validating) / 1_000_000} ms")
            if (cache != null) {
                try {
                    cache.write(it)
                } catch (error: Exception) {
                    Log.w("MissaStartup", "Liturgy cache unavailable; using bundled content", error)
                }
            }
        }
    }

    private fun readDirectory(assets: AssetManager, directory: String): List<DatasetIntegrity.Item> =
        requireNotNull(assets.list(directory)) { "Missing asset directory: $directory" }.sorted().flatMap { name ->
            val path = "$directory/$name"
            require(name.endsWith(".json")) { "Expected a content-type dataset file: $path" }
            run {
                val document = StrictDatasetJson.read(assets.open(path).bufferedReader(Charsets.UTF_8))
                require(document.keys == setOf("schemaVersion", "items")) { "Invalid dataset envelope: $path" }
                require(document["schemaVersion"] == 1L) { "Unsupported dataset schema: $path" }
                val records = document["items"]
                require(records is Map<*, *>) { "Invalid items object: $path" }
                records.map { (id, value) ->
                    require(id is String && value is Map<*, *>) { "Invalid item in $path" }
                    // StrictDatasetJson creates string-keyed, recursively immutable objects.
                    @Suppress("UNCHECKED_CAST")
                    val fields = value as Map<String, Any?>
                    DatasetIntegrity.Item(name, id, fields)
                }
            }
        }

}
