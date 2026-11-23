package sk.missa.data.assets

import android.util.JsonReader
import android.util.JsonToken
import java.io.Reader
import java.util.Collections

/** JSONObject overwrites repeated keys; dataset input must reject them before indexing. */
object StrictDatasetJson {
    fun read(source: Reader): Map<String, Any?> = JsonReader(source).use { reader ->
        reader.isLenient = false
        val document = readObject(reader, mutableListOf())
        require(reader.peek() == JsonToken.END_DOCUMENT) { "Trailing dataset content" }
        document
    }

    private fun readObject(reader: JsonReader, path: MutableList<Any>): Map<String, Any?> {
        reader.beginObject()
        val result = linkedMapOf<String, Any?>()
        while (reader.hasNext()) {
            val name = reader.nextName()
            require(name !in result) { "Duplicate JSON key: ${path.location()}/$name" }
            path.add(name)
            result[name] = readValue(reader, path)
            path.removeAt(path.lastIndex)
        }
        reader.endObject()
        return Collections.unmodifiableMap(result)
    }

    private fun readValue(reader: JsonReader, path: MutableList<Any>): Any? = when (reader.peek()) {
        JsonToken.BEGIN_OBJECT -> readObject(reader, path)
        JsonToken.BEGIN_ARRAY -> {
            reader.beginArray()
            val values = mutableListOf<Any?>()
            while (reader.hasNext()) {
                path.add(values.size)
                values.add(readValue(reader, path))
                path.removeAt(path.lastIndex)
            }
            reader.endArray()
            Collections.unmodifiableList(values)
        }
        JsonToken.STRING -> reader.nextString()
        JsonToken.BOOLEAN -> reader.nextBoolean()
        JsonToken.NULL -> { reader.nextNull(); null }
        JsonToken.NUMBER -> requireNotNull(reader.nextString().toLongOrNull()) { "Expected integer at ${path.location()}" }
        else -> error("Invalid dataset value at ${path.location()}")
    }

    private fun List<Any>.location() = joinToString("/", prefix = if (isEmpty()) "" else "/")
}
