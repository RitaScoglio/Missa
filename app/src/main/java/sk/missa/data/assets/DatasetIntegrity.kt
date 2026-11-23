package sk.missa.data.assets

import java.util.Collections
import sk.missa.liturgy.mass.MassContentResolver

/** Cross-file invariants that JSON Schema cannot express. Input must retain item order. */
object DatasetIntegrity {
    data class Item(
        val dataset: String,
        val id: String,
        val fields: Map<String, Any?>,
    )

    private val namespaces = mapOf(
        "seasonal-masses.json" to "m", "celebrations.json" to "c",
        "formularies.json" to "f", "optional-masses.json" to "om",
        "chant-sets.json" to "h[spc]", "chant-texts.json" to "ct", "oration-sets.json" to "o[spc]", "prayer-texts.json" to "pt",
        "intercession-sets.json" to "i[spc]", "first-readings.json" to "fr",
        "second-readings.json" to "sr", "psalms.json" to "ps",
        "acclamations.json" to "ac", "gospels.json" to "g",
        "prefaces.json" to "pf", "eucharistic-prayers.json" to "ep",
        "ordinary-documents.json" to "od", "triduum-rites.json" to "tr",
        "language-packs.json" to "lp", "amendments.json" to "am",
    )
    private val referenceTypes = mapOf(
        "formularyId" to "f", "chantSetId" to "h[spc]", "chantId" to "ct", "orationSetId" to "o[spc]", "collectPrayerIds" to "pt", "offeringPrayerIds" to "pt", "afterCommunionPrayerIds" to "pt", "entranceChantIds" to "ct", "communionChantIds" to "ct",
        "intercessionsId" to "i[spc]", "prefaceIds" to "pf", "firstReadingId" to "fr",
        "secondReadingId" to "sr", "psalmId" to "ps", "acclamationId" to "ac",
        "gospelId" to "g", "previousSundayGospelId" to "g", "sequenceDocumentId" to "od", "contentId" to "(fr|sr|ps|ac|g|pf|od|ep)",
        "defaultContentId" to "od", "documentId" to "od", "blessingDocumentId" to "od", "blessingOrderDocumentId" to "od",
    )
    private val namespacePatterns = namespaces.mapValues { (_, prefix) -> Regex("$prefix[0-9]{3,}") }
    private val referencePatterns = referenceTypes.mapValues { (_, prefix) -> Regex("$prefix[0-9]{3,}") }
    private val sequences = listOf("segments", "blocks")
    private val ownerSetKeys = listOf("chantSetId", "orationSetId")
    private val arrayReferences = setOf("prefaceIds", "collectPrayerIds", "offeringPrayerIds", "afterCommunionPrayerIds", "entranceChantIds", "communionChantIds")
    private val segmentTypes = setOf("TEXT", "SEPARATOR", "SPACER", "BELL", "INSERTION")
    private val blockTypes = segmentTypes + setOf("HEADING", "SUBHEADING", "RUBRIC", "POPUP", "PARALLEL", "MASS_PART", "REFERENCE", "CALENDAR_DATE")

    private class ValidatedCatalog(private val entries: List<Item>) : AbstractList<Item>() {
        override val size get() = entries.size
        override fun get(index: Int) = entries[index]
    }

    /** Only a fully validated, immutable snapshot can be reused by the independent resolvers. */
    internal fun runtimeCatalog(items: List<Item>): List<Item> {
        fun immutable(value: Any?): Any? = when (value) {
            is Map<*, *> -> {
                Collections.unmodifiableMap(value.entries.associate { it.key to immutable(it.value) })
            }
            is List<*> -> Collections.unmodifiableList(value.map(::immutable))
            else -> value
        }
        val snapshot = items.map { item ->
            @Suppress("UNCHECKED_CAST")
            item.copy(fields = immutable(item.fields) as Map<String, Any?>)
        }
        return parsedCatalog(snapshot)
    }

    /** Adopts the parser's recursively immutable tree; caller-owned input must use runtimeCatalog instead. */
    internal fun parsedCatalog(items: List<Item>): List<Item> {
        validate(items)
        return ValidatedCatalog(items.toList())
    }

    /** Only the private cache may restore an immutable snapshot after checking its APK revision and checksum. */
    internal fun cachedCatalog(items: List<Item>): List<Item> = ValidatedCatalog(items.toList())

    fun validate(items: List<Item>) {
        if (items is ValidatedCatalog) return
        val byId = items.associateBy(Item::id)
        require(byId.size == items.size) { "Duplicate dataset item ID" }
        val seasonalKeys = mutableSetOf<Pair<Any?, Any?>>()
        val path = mutableListOf<Any>()
        items.forEach { item ->
            val pattern = requireNotNull(namespacePatterns[item.dataset]) { "Unknown dataset: ${item.dataset}" }
            require(pattern.matches(item.id)) { "Wrong namespace: ${item.dataset}/${item.id}" }
            if (item.fields.containsKey("documentId")) {
                require(item.dataset == "gospels.json" && !item.fields.containsKey("body")) {
                    "Document reference requires a Gospel without a second body: ${item.id}"
                }
            }
            if (item.dataset == "seasonal-masses.json") {
                require(item.fields["liturgicalDay"] is Map<*, *>) { "Missing liturgical day: ${item.id}" }
                val day = item.fields["liturgicalDay"] as Map<*, *>
                if (day.containsKey("sundayCycle")) {
                    val sundayCycle = day["sundayCycle"]
                    require(sundayCycle in setOf("A", "B", "C")) { "Unknown Sunday cycle: ${item.id}" }
                    val cycle = day["lectionaryCycle"]
                    require(cycle !in setOf("A", "B", "C") || cycle == sundayCycle) {
                        "Conflicting annual lectionary cycles: ${item.id}"
                    }
                }
                if (day.containsKey("dayCategory")) {
                    val category = day["dayCategory"]
                    require(category == "WEEKDAY" || category == "SUNDAY") { "Unknown day category: ${item.id}" }
                    if (day.containsKey("dayOfWeek")) {
                        val weekdays = setOf("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY")
                        require(if (category == "SUNDAY") day["dayOfWeek"] == "SUNDAY" else day["dayOfWeek"] in weekdays) {
                            "Conflicting day category and day of week: ${item.id}"
                        }
                    }
                }
                require(seasonalKeys.add(item.fields["liturgicalDay"] to item.fields["variant"])) { "Duplicate seasonal selector: ${item.id}" }
            }
            path.add(item.id)
            validateFields(item.fields, path, byId, item.dataset == "formularies.json")
            path.clear()
        }
        // Index owners once instead of recursively rescanning the entire corpus for every set.
        val ownersBySet = mutableMapOf<Pair<String, String>, MutableList<Map<*, *>>>()
        fun indexOwners(value: Any?) {
            when (value) {
                is Map<*, *> -> {
                    for (key in ownerSetKeys) {
                        (value[key] as? String)?.let { id -> ownersBySet.getOrPut(key to id) { mutableListOf() }.add(value) }
                    }
                    value.values.forEach(::indexOwners)
                }
                is List<*> -> value.forEach(::indexOwners)
            }
        }
        items.forEach { indexOwners(it.fields) }
        items.filter { it.dataset in setOf("chant-sets.json", "oration-sets.json") && it.fields.containsKey("requiredOwnerFields") }.forEach { set ->
            val fields = if (set.dataset == "chant-sets.json") mapOf("entrance" to "entranceChantIds", "communion" to "communionChantIds")
                else mapOf("collect" to "collectPrayerIds", "overOfferings" to "offeringPrayerIds", "afterCommunion" to "afterCommunionPrayerIds")
            val required = set.fields["requiredOwnerFields"] as? List<*> ?: error("Invalid required owner fields: ${set.id}")
            require(required.isNotEmpty() && required.distinct().size == required.size &&
                required.all { it is String && fields.containsKey(it) && !set.fields.containsKey(it) }) {
                "Invalid required owner fields: ${set.id}"
            }
            val setKey = if (set.dataset == "chant-sets.json") "chantSetId" else "orationSetId"
            val owners = ownersBySet[setKey to set.id].orEmpty()
            require(owners.isNotEmpty() && owners.all { mass -> required.all { field ->
                (mass[fields[field as String]] as? List<*>)?.isNotEmpty() == true
            } }) { "Missing required choices on owner of ${set.id}" }
        }
        items.filter { it.dataset == "chant-sets.json" }.forEach { set ->
            val communion = set.fields["communion"] as? Map<*, *> ?: return@forEach
            val options = communion["gospelChoices"] as? List<*> ?: return@forEach
            val ids = options.map { (it as Map<*, *>)["chantId"] }
            val owners = ownersBySet["chantSetId" to set.id].orEmpty()
            require(owners.isNotEmpty() && owners.all { it["communionChantIds"] == ids }) {
                "Conditional Communion IDs do not match owners of ${set.id}"
            }
        }
    }

    private fun validateFields(fields: Map<*, *>, path: MutableList<Any>, byId: Map<String, Item>, formulary: Boolean, partialVariant: Boolean = false) {
        if (fields["type"] == "CALENDAR_DATE") {
            require(fields["day"] in setOf("EASTER", "ASH_WEDNESDAY", "ASCENSION", "PENTECOST", "FIRST_ADVENT_SUNDAY")) {
                "Unknown calendar date at ${path.location()}"
            }
        }
        for (sequence in sequences) {
            if (fields.containsKey(sequence)) {
                val children = fields[sequence]
                require(children is List<*>) { "Expected ordered $sequence at ${path.location()}" }
                val types = if (sequence == "segments") segmentTypes else blockTypes
                children.forEachIndexed { index, child ->
                    require(child is Map<*, *> && child["type"] in types) { "Unknown $sequence marker at ${path.location()}/$sequence/$index" }
                }
            }
        }
        fields.forEach { (key, value) ->
            require(key is String) { "Invalid field name at ${path.location()}" }
            path.add(key)
            if (key in referenceTypes) {
                require(!(formulary && key == "formularyId")) { "Formulary inheritance at ${path.location()}" }
                if (value == null) {
                    require(key == "secondReadingId" || key == "sequenceDocumentId") { "Invalid null reference at ${path.location()}" }
                } else {
                    val references = if (key in arrayReferences) {
                        require(value is List<*>) { "Expected reference array at ${path.location()}" }
                        if (key != "prefaceIds") require(value.isNotEmpty() && value.distinct().size == value.size) { "Invalid choices at ${path.location()}" }
                        value
                    } else listOf(value)
                    references.forEach { reference ->
                        require(reference is String && referencePatterns.getValue(key).matches(reference)) { "Wrong reference type at ${path.location()}: $reference" }
                        require(reference in byId) { "Unknown reference at ${path.location()}: $reference" }
                    }
                }
            } else when (value) {
                is Map<*, *> -> validateFields(value, path, byId, formulary, partialVariant)
                is List<*> -> value.forEachIndexed { index, child ->
                    if (child is Map<*, *>) {
                        path.add(index)
                        validateFields(child, path, byId, formulary, partialVariant || key == "contentVariants")
                        path.removeAt(path.lastIndex)
                    }
                }
            }
            path.removeAt(path.lastIndex)
        }
        (fields["contentVariants"] as? List<*>)?.let { variants ->
            val keys = variants.map { (it as? Map<*, *>)?.get("key") }
            require(keys.all { it is String } && keys.distinct().size == keys.size) { "Duplicate or missing variant key at ${path.location()}" }
            variants.forEach { raw ->
                val variant = raw as Map<*, *>
                val selected = fields.entries.associate { (key, value) -> key as String to value }.toMutableMap()
                selected.remove("contentVariants")
                if (variant.containsKey("mass")) {
                    fun mass(value: Any?) = (value as? Map<*, *>)?.entries
                        ?.associate { (key, entry) -> key as String to entry } ?: emptyMap()
                    selected["mass"] = MassContentResolver.mergeMass(mass(fields["mass"]), mass(variant["mass"]))
                }
                if (variant.containsKey("formularyChoices")) selected["formularyChoices"] = variant["formularyChoices"]
                path.add("selected")
                path.add(requireNotNull(variant["key"]))
                validateFields(selected, path, byId, formulary)
                path.removeAt(path.lastIndex)
                path.removeAt(path.lastIndex)
            }
        }
        (fields["formularyChoices"] as? List<*>)?.let { choices ->
            val ids = choices.map { (it as? Map<*, *>)?.get("formularyId") }
            require(ids.distinct().size == ids.size) { "Repeated formulary choice at ${path.location()}" }
            val selected = (fields["mass"] as? Map<*, *>)?.get("formularyId")
            require(selected == null || selected in ids) { "Default formulary missing from choices at ${path.location()}" }
        }
        (fields["intercessionChoices"] as? List<*>)?.let { choices ->
            val ids = choices.map { (it as? Map<*, *>)?.get("intercessionsId") }
            require(ids.distinct().size == ids.size) { "Repeated intercession choice at ${path.location()}" }
            val selected = fields["intercessionsId"]
            require(ids.isEmpty() || selected == null || ids.first() == selected) { "Default intercessions must be first at ${path.location()}" }
        }
        (fields["gospelChoices"] as? List<*>)?.let { choices ->
            require(!fields.containsKey("citation") && !fields.containsKey("text") && !fields.containsKey("alternatives")) {
                "Conditional Gospel chants cannot have an unconditional default at ${path.location()}"
            }
            val keys = choices.map { (it as? Map<*, *>)?.get("whenGospel") }
            val allowed = MassContentResolver.GospelStory.entries.map { it.name }.toSet()
            require(keys.size >= 2 && keys.all { it is String && it in allowed } &&
                keys.distinct().size == keys.size && keys.count { it == "OTHER" } == 1) {
                "Invalid Gospel-dependent chant choices at ${path.location()}"
            }
        }
        (fields["choices"] as? Map<*, *>)?.forEach { (slot, options) ->
            val key = "${slot}Id"
            require(options is List<*>) { "Invalid lectionary choices at ${path.location()}/$slot" }
            val ids = options.map { (it as? Map<*, *>)?.get(key) }
            require(ids.distinct().size == ids.size) { "Repeated reading choice at ${path.location()}/$slot" }
            if (options.isNotEmpty() && (!partialVariant || fields.containsKey(key))) {
                require(fields[key] == ids.first()) { "Default reading must be first at ${path.location()}/$slot" }
            }
        }
    }

    private fun List<Any>.location() = joinToString("/")
}
