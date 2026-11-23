package sk.missa.data.assets

import android.util.AtomicFile
import android.util.Log
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.File
import java.io.IOException
import java.security.MessageDigest
import java.util.Collections

/** Private, disposable cache of content already checked against this installed APK. */
internal class ValidatedDatasetCache(file: File, private val revision: Long) {
    private val file = AtomicFile(file)

    fun read(): List<DatasetIntegrity.Item>? {
        try {
            file.openRead().use { input ->
                require(input.channel.size() <= MAX_BYTES + 64) { "Oversized liturgy cache" }
                val data = DataInputStream(input.buffered())
                if (data.readInt() != MAGIC || data.readInt() != VERSION || data.readLong() != revision) return null
                val length = data.readInt()
                require(length in 0..MAX_BYTES) { "Invalid liturgy cache length" }
                val digest = ByteArray(32).also(data::readFully)
                val payload = ByteArray(length).also(data::readFully)
                require(data.read() == -1 && MessageDigest.isEqual(digest, hash(payload))) { "Damaged liturgy cache" }
                val items = Decoder(DataInputStream(ByteArrayInputStream(payload))).read()
                return DatasetIntegrity.cachedCatalog(items)
            }
        } catch (error: IOException) {
            // A missing or interrupted cache is normal; the bundled JSON remains authoritative.
            return null
        } catch (error: IllegalArgumentException) {
            Log.w("MissaStartup", "Ignoring invalid cached liturgy", error)
            file.delete()
            return null
        }
    }

    fun write(items: List<DatasetIntegrity.Item>) {
        DatasetIntegrity.validate(items)
        val payload = ByteArrayOutputStream().also { output ->
            DataOutputStream(output).use { Encoder(it).write(items) }
        }.toByteArray()
        require(payload.size <= MAX_BYTES) { "Oversized liturgy cache" }
        val output = file.startWrite()
        try {
            val data = DataOutputStream(output)
            data.writeInt(MAGIC)
            data.writeInt(VERSION)
            data.writeLong(revision)
            data.writeInt(payload.size)
            data.write(hash(payload))
            data.write(payload)
            data.flush()
            file.finishWrite(output)
        } catch (error: Exception) {
            file.failWrite(output)
            throw error
        }
    }

    private class Encoder(private val output: DataOutputStream) {
        private val strings = mutableMapOf<String, Int>()

        fun write(items: List<DatasetIntegrity.Item>) {
            output.writeInt(items.size)
            for (item in items) {
                string(item.dataset)
                string(item.id)
                value(item.fields)
            }
        }

        private fun string(value: String) {
            val index = strings[value]
            if (index != null) {
                output.writeInt(index)
            } else {
                val bytes = value.toByteArray(Charsets.UTF_8)
                strings[value] = strings.size
                output.writeInt(-bytes.size - 1)
                output.write(bytes)
            }
        }

        private fun value(value: Any?) {
            when (value) {
                null -> output.writeByte(NULL)
                is Map<*, *> -> {
                    output.writeByte(OBJECT)
                    output.writeInt(value.size)
                    for ((key, child) in value) {
                        string(key as String)
                        value(child)
                    }
                }
                is List<*> -> {
                    output.writeByte(ARRAY)
                    output.writeInt(value.size)
                    value.forEach(::value)
                }
                is String -> { output.writeByte(STRING); string(value) }
                is Long -> { output.writeByte(INTEGER); output.writeLong(value) }
                is Boolean -> output.writeByte(if (value) TRUE else FALSE)
                else -> error("Unsupported cached dataset value")
            }
        }
    }

    private class Decoder(private val input: DataInputStream) {
        private val strings = mutableListOf<String>()

        fun read(): List<DatasetIntegrity.Item> {
            val items = List(count()) {
                val dataset = string()
                val id = string()
                val fields = value(0)
                require(fields is Map<*, *>) { "Invalid cached item" }
                @Suppress("UNCHECKED_CAST")
                DatasetIntegrity.Item(dataset, id, fields as Map<String, Any?>)
            }
            require(items.isNotEmpty() && input.read() == -1) { "Invalid cached catalog" }
            return items
        }

        private fun count(): Int = input.readInt().also {
            require(it in 0..MAX_ENTRIES && it <= input.available()) { "Invalid cached collection size" }
        }

        private fun string(): String {
            val marker = input.readInt()
            if (marker >= 0) {
                require(marker < strings.size) { "Invalid cached string reference" }
                return strings[marker]
            }
            val length = -marker.toLong() - 1
            require(length <= MAX_BYTES && length <= input.available()) { "Invalid cached string length" }
            val text = String(ByteArray(length.toInt()).also(input::readFully), Charsets.UTF_8)
            strings.add(text)
            return text
        }

        private fun value(depth: Int): Any? {
            require(depth <= 64) { "Invalid cached nesting" }
            return when (input.readUnsignedByte()) {
                NULL -> null
                OBJECT -> {
                    val result = linkedMapOf<String, Any?>()
                    repeat(count()) {
                        val key = string()
                        require(!result.containsKey(key)) { "Duplicate cached key" }
                        result[key] = value(depth + 1)
                    }
                    Collections.unmodifiableMap(result)
                }
                ARRAY -> Collections.unmodifiableList(List(count()) { value(depth + 1) })
                STRING -> string()
                INTEGER -> input.readLong()
                FALSE -> false
                TRUE -> true
                else -> throw IllegalArgumentException("Invalid cached value type")
            }
        }
    }

    private companion object {
        const val MAGIC = 0x4D495353
        const val VERSION = 1
        const val MAX_BYTES = 32 * 1024 * 1024
        const val MAX_ENTRIES = 1_000_000
        const val NULL = 0
        const val OBJECT = 1
        const val ARRAY = 2
        const val STRING = 3
        const val INTEGER = 4
        const val FALSE = 5
        const val TRUE = 6
        fun hash(bytes: ByteArray) = MessageDigest.getInstance("SHA-256").digest(bytes)
    }
}
