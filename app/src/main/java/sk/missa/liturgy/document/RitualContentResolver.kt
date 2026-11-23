package sk.missa.liturgy.document

import sk.missa.data.assets.DatasetIntegrity

/** Applies explicit calendar-selected insertions without interpreting dates or legacy markers. */
class RitualContentResolver(items: List<DatasetIntegrity.Item>) {
    enum class CalendarDate { EASTER, ASH_WEDNESDAY, ASCENSION, PENTECOST, FIRST_ADVENT_SUNDAY }

    private val catalog = items.associateBy { it.id }

    init {
        DatasetIntegrity.validate(items)
    }

    fun segments(prayerId: String, insertions: Map<String, String> = emptyMap()): List<Map<String, Any?>> {
        val prayer = requireNotNull(catalog[prayerId]) { "Unknown Eucharistic prayer: $prayerId" }
        require(prayer.dataset == "eucharistic-prayers.json") { "Wrong ritual resource: $prayerId" }
        val segments = requireNotNull(prayer.fields["segments"] as? List<*>) { "Missing segments: $prayerId" }
        return resolve(segments, insertions, setOf(prayerId))
    }

    fun blocks(
        documentId: String,
        insertions: Map<String, String> = emptyMap(),
        calendarDates: Map<CalendarDate, String> = emptyMap(),
    ): List<Map<String, Any?>> {
        val usedDates = mutableSetOf<CalendarDate>()
        val blocks = resolve(documentBlocks(documentId), insertions, setOf(documentId)).map { block ->
            if (block["type"] != "CALENDAR_DATE") return@map block
            val day = CalendarDate.valueOf(requireNotNull(block["day"] as? String))
            val text = requireNotNull(calendarDates[day]) { "Missing calendar date: $day" }
            require(text.isNotBlank()) { "Blank calendar date: $day" }
            usedDates.add(day)
            buildMap<String, Any?> {
                put("type", "TEXT")
                put("content", mapOf("html" to text))
                put("style", mapOf("format" to "PLAIN_TEXT"))
            }
        }
        require(usedDates.containsAll(calendarDates.keys)) { "Calendar date does not belong to ritual" }
        return blocks
    }

    /** Resolves the selected blessing with the opening instructions recorded by its owner. */
    fun blessingBlocks(mass: Map<String, Any?>): List<Map<String, Any?>> {
        val orderId = requireNotNull(mass["blessingOrderDocumentId"] as? String) { "Missing blessing order" }
        val variantKey = requireNotNull(mass["blessingOrderVariant"] as? String) { "Missing blessing order variant" }
        val blessingId = requireNotNull(mass["blessingDocumentId"] as? String) { "Missing selected blessing" }
        val insertion = documentBlocks(orderId).map(::objectMap).single {
            it["type"] == "INSERTION" && it["slot"] == "SOLEMN_BLESSING"
        }
        val selected = (insertion["variants"] as List<*>).map(::objectMap).single { it["key"] == variantKey }
        require(selected["contentId"] == blessingId) { "Blessing order does not match selected blessing" }
        return blocks(orderId, mapOf("SOLEMN_BLESSING" to variantKey))
    }

    /** Keeps section order while expanding reusable documents; Mass parts remain explicit. */
    fun riteBlocks(riteId: String, insertions: Map<String, String> = emptyMap()): List<Map<String, Any?>> {
        val rite = requireNotNull(catalog[riteId]) { "Unknown rite: $riteId" }
        require(rite.dataset == "triduum-rites.json") { "Wrong rite resource: $riteId" }
        val sections = requireNotNull(rite.fields["sections"] as? List<*>) { "Missing rite sections: $riteId" }
        val ordered = sections.flatMap { section ->
            requireNotNull(objectMap(section)["blocks"] as? List<*>) { "Missing rite section blocks: $riteId" }
        }
        return resolve(ordered, insertions, setOf(riteId))
    }

    /** A Passion retains its ordered document; ordinary Gospels remain one HTML body. */
    fun gospelBlocks(gospelId: String): List<Map<String, Any?>> {
        val gospel = requireNotNull(catalog[gospelId]) { "Unknown Gospel: $gospelId" }
        require(gospel.dataset == "gospels.json") { "Wrong Gospel resource: $gospelId" }
        val documentId = gospel.fields["documentId"]
        if (documentId != null) {
            require(documentId is String && !gospel.fields.containsKey("body")) { "Ambiguous Gospel: $gospelId" }
            return blocks(documentId)
        }
        val body = requireNotNull(gospel.fields["body"] as? Map<*, *>) { "Missing Gospel body: $gospelId" }
        require(body["html"] is String) { "Missing Gospel text: $gospelId" }
        return listOf(mapOf("type" to "TEXT", "style" to mapOf("format" to "HTML"), "content" to body))
    }

    private fun resolve(
        sequence: List<*>,
        insertions: Map<String, String>,
        active: Set<String>,
    ): List<Map<String, Any?>> {
        val usedSlots = mutableSetOf<String>()
        val resolved = resolveSequence(sequence, insertions, usedSlots, active)
        require(usedSlots.containsAll(insertions.keys)) { "Insertion does not belong to ritual" }
        return resolved
    }

    private fun resolveSequence(
        sequence: List<*>,
        insertions: Map<String, String>,
        usedSlots: MutableSet<String>,
        active: Set<String>,
    ): List<Map<String, Any?>> = sequence.flatMap { raw ->
            val segment = objectMap(raw)
            if (segment["type"] == "REFERENCE") {
                val id = segment["contentId"] as? String
                if (catalog[id]?.dataset == "ordinary-documents.json") {
                    return@flatMap expand(requireNotNull(id), insertions, usedSlots, active)
                }
            }
            if (segment["type"] != "INSERTION") return@flatMap listOf(segment)
            val slot = requireNotNull(segment["slot"] as? String) { "Missing insertion slot" }
            require(usedSlots.add(slot)) { "Repeated insertion slot: $slot" }
            val variants = requireNotNull(segment["variants"] as? List<*>).map(::objectMap)
            val keys = variants.map { requireNotNull(it["key"] as? String) }
            require(keys.toSet().size == keys.size) { "Repeated insertion variant: $slot" }
            val selected = insertions[slot]?.let { key ->
                requireNotNull(variants.singleOrNull { it["key"] == key }) { "Unknown insertion: $slot/$key" }
            }
            val reference = selected?.get("contentId") ?: if (selected == null) segment["defaultContentId"] else null
            if (reference != null) {
                require(reference is String && segment["continuation"] == null) { "Invalid document insertion: $slot" }
                return@flatMap expand(reference, insertions, usedSlots, active)
            }
            val content = selected?.get("content") ?: segment["defaultContent"]
            val text = html(content) + (segment["continuation"]?.let(::html) ?: "")
            listOf(buildMap<String, Any?> {
                put("type", "TEXT")
                put("content", mapOf("html" to text))
                segment["style"]?.let { put("style", it) }
            })
        }

    private fun expand(
        id: String,
        insertions: Map<String, String>,
        usedSlots: MutableSet<String>,
        active: Set<String>,
    ): List<Map<String, Any?>> {
        require(id !in active) { "Cyclic ritual reference: $id" }
        return resolveSequence(documentBlocks(id), insertions, usedSlots, active + id)
    }

    private fun documentBlocks(id: String): List<*> {
        val item = requireNotNull(catalog[id]) { "Unknown ritual document: $id" }
        require(item.dataset == "ordinary-documents.json") { "Wrong ritual document: $id" }
        return requireNotNull(item.fields["blocks"] as? List<*>) { "Missing ritual blocks: $id" }
    }

    private fun html(value: Any?): String = requireNotNull(objectMap(value)["html"] as? String) {
        "Missing ritual text"
    }

    private fun objectMap(value: Any?): Map<String, Any?> {
        require(value is Map<*, *> && value.keys.all { it is String }) { "Expected ritual object" }
        return value.entries.associate { (key, entry) -> key as String to entry }
    }
}
