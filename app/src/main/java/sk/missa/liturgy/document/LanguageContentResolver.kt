package sk.missa.liturgy.document

import sk.missa.data.assets.DatasetIntegrity

/** Preserves explicit paragraph grouping and inline primary/translation order. */
class LanguageContentResolver(items: List<DatasetIntegrity.Item>) {
    enum class Format { PLAIN_TEXT, HTML }
    data class Run(val text: String, val format: Format, val translation: Boolean)
    data class Paragraph(val runs: List<Run>)
    data class Section(val key: String, val title: String?, val paragraphs: List<Paragraph>)

    private val packs = items.filter { it.dataset == "language-packs.json" }.associateBy { it.id }

    init {
        DatasetIntegrity.validate(items)
    }

    fun sections(packId: String): List<Section> {
        val pack = requireNotNull(packs[packId]) { "Unknown language pack: $packId" }
        val sections = requireNotNull(pack.fields["sections"] as? Map<*, *>) { "Missing language sections" }
        return sections.map { (key, rawSection) ->
            require(key is String && rawSection is Map<*, *>) { "Invalid language section" }
            val lines = requireNotNull(rawSection["lines"] as? List<*>) { "Missing language lines: $key" }
            val paragraphs = mutableListOf<MutableList<Run>>()
            lines.forEach { rawLine ->
                require(rawLine is Map<*, *>) { "Invalid language line: $key" }
                val join = rawLine["joinPrevious"] ?: false
                require(join is Boolean) { "Invalid language grouping: $key" }
                if (join) require(paragraphs.isNotEmpty()) { "First language line cannot join previous: $key" }
                else paragraphs.add(mutableListOf())
                val runs = paragraphs.last()
                val primary = requireNotNull(rawLine["primary"] as? String) { "Missing primary text: $key" }
                val format = Format.valueOf(rawLine["primaryFormat"] as? String ?: "PLAIN_TEXT")
                runs.add(Run(primary, format, translation = false))
                if (rawLine.containsKey("translation")) {
                    val translation = requireNotNull(rawLine["translation"] as? String) { "Invalid translation: $key" }
                    val prefix = rawLine["translationPrefix"] ?: "\n"
                    require(prefix == "" || prefix == "\n") { "Invalid translation prefix: $key" }
                    runs.add(Run(prefix.toString() + translation, Format.PLAIN_TEXT, translation = true))
                }
            }
            Section(key, rawSection["title"] as? String, paragraphs.map { Paragraph(it.toList()) })
        }
    }
}
