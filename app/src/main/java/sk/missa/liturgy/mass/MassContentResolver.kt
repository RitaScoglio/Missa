package sk.missa.liturgy.mass

import sk.missa.data.assets.DatasetIntegrity

/** Resolves content after the calendar and the user have made their selections. */
class MassContentResolver(items: List<DatasetIntegrity.Item>) {
    private val catalog = items.associateBy { it.id }

    init {
        DatasetIntegrity.validate(items)
    }

    enum class OrationUse { STANDARD, PROPER_COLLECT_WITH_SEASONAL_REMAINDER }
    /** The calendar/caller supplies whether the old Ember and Rogation reading override applies. */
    enum class FormularyScriptureUse { FORMULARY, CURRENT_DAY }
    enum class GospelStory { SAMARITAN_WOMAN, BLIND_MAN, PRODIGAL_SON, LAZARUS, ADULTEROUS_WOMAN, OTHER }

    data class Selection(
        val seasonalMassId: String?,
        val properId: String? = null,
        val formularyId: String? = null,
        val seasonalVariant: String? = null,
        val properVariant: String? = null,
        val formularyVariant: String? = null,
        val orationUse: OrationUse = OrationUse.STANDARD,
        val communionChoice: Int = 0,
        val collectChoice: Int = 0,
        val readingChoices: Map<String, Int> = emptyMap(),
        val intercessionChoice: Int = 0,
        val gospelChoiceContext: GospelChoiceAvailability.Context = GospelChoiceAvailability.Context(),
        val entranceChoice: Int = 0,
        val gospelStory: GospelStory? = null,
        val offeringChoice: Int = 0,
        val afterCommunionChoice: Int = 0,
        val formularyScriptureUse: FormularyScriptureUse = FormularyScriptureUse.FORMULARY,
        // For the seasonal reconciliation option on a non-feria, use only the day's
        // own proper collect; a missing proper collect falls back to the seasonal one.
        val dayProperCollectOwnerId: String? = null,
    )

    data class Content(
        val mass: Map<String, Any?>,
        val chants: Map<String, Any?>,
        val orations: Map<String, Any?>,
        val communionFollowsGospel: Boolean = false,
    )

    fun definition(id: String, variant: String? = null): Map<String, Any?> =
        owner(id, variant, "seasonal-masses.json", "celebrations.json", "optional-masses.json", "formularies.json")

    /** Explicit target bindings for the actual selected Gospel, including short forms. */
    fun resolveForSelectedGospel(selection: Selection): Content {
        val content = resolve(selection)
        if ((content.chants["communion"] as? Map<*, *>)?.get("gospelChoices") == null) return content
        val gospel = (content.mass["lectionary"] as? Map<*, *>)?.get("gospelId")
        val story = when (gospel) {
            "g182", "g183" -> GospelStory.SAMARITAN_WOMAN
            "g192", "g193" -> GospelStory.BLIND_MAN
            "g201", "g202" -> GospelStory.LAZARUS
            "g181", "g485" -> GospelStory.PRODIGAL_SON
            "g204" -> GospelStory.ADULTEROUS_WOMAN
            else -> GospelStory.OTHER
        }
        return resolve(selection.copy(gospelStory = story))
    }

    fun resolve(selection: Selection): Content {
        val seasonal = selection.seasonalMassId?.let { owner(it, selection.seasonalVariant, "seasonal-masses.json") } ?: emptyMap()
        require(selection.seasonalMassId != null || selection.seasonalVariant == null) { "Variant requires a seasonal owner" }
        require(selection.seasonalMassId != null || selection.properId != null) { "Mass requires an owner" }
        val proper = selection.properId?.let {
            owner(it, selection.properVariant, "celebrations.json", "optional-masses.json")
        } ?: emptyMap()
        require(selection.properId != null || selection.properVariant == null) { "Variant requires a proper owner" }
        val selectedFormulary = selection.formularyId
            ?: mass(proper)["formularyId"] as? String
            ?: mass(seasonal)["formularyId"] as? String
        if (selection.formularyId != null) {
            val choices = (proper["formularyChoices"] ?: seasonal["formularyChoices"]) as? List<*>
            require(choices != null && choices.any { objectMap(it)["formularyId"] == selectedFormulary }) {
                "Formulary is not an available choice: $selectedFormulary"
            }
        }
        require(selectedFormulary != null || selection.formularyVariant == null) { "Variant requires a formulary" }
        val formulary = selectedFormulary?.let {
            owner(it, selection.formularyVariant, "formularies.json")
        } ?: emptyMap()
        val formularyMass = mass(formulary).let {
            if (selection.formularyScriptureUse == FormularyScriptureUse.CURRENT_DAY) withoutFormularyScripture(it) else it
        }
        val layers = listOf(mass(seasonal), formularyMass, mass(proper))
        var resolved = emptyMap<String, Any?>()
        val chants = linkedMapOf<String, Any?>()
        val orations = linkedMapOf<String, Any?>()
        layers.forEach { layer ->
            resolved = mergeMass(resolved, layer)
            val oration = (layer["orationSetId"] as? String)?.let { catalog[it]?.fields }
            val chant = (layer["chantSetId"] as? String)?.let { catalog[it]?.fields }
            for ((field, ids) in listOf("collect" to "collectPrayerIds", "overOfferings" to "offeringPrayerIds", "afterCommunion" to "afterCommunionPrayerIds")) {
                if (oration?.containsKey(field) == true && !layer.containsKey(ids)) resolved = resolved - ids
            }
            for ((field, ids) in listOf("entrance" to "entranceChantIds", "communion" to "communionChantIds")) {
                if (chant?.containsKey(field) == true && !layer.containsKey(ids)) resolved = resolved - ids
            }
            mergeSet(chants, layer["chantSetId"] as? String)
            mergeSet(orations, layer["orationSetId"] as? String)
        }
        // Some source choices select a preface and blessing together with the formulary.
        val choices = (proper["formularyChoices"] ?: seasonal["formularyChoices"]) as? List<*>
        val selectedChoice = choices?.map(::objectMap)?.singleOrNull { it["formularyId"] == selectedFormulary }
        for (field in listOf("prefaceIds", "blessingDocumentId", "blessingLabel", "blessingOrderDocumentId", "blessingOrderVariant")) {
            if (selectedChoice?.containsKey(field) == true) resolved = resolved + (field to selectedChoice.getValue(field))
        }
        if (selection.orationUse == OrationUse.PROPER_COLLECT_WITH_SEASONAL_REMAINDER) {
            require(selection.properId != null) { "Collect-only context requires a proper owner" }
            val seasonalSet = layers.first()["orationSetId"] as? String
            val seasonalPrayers = seasonalSet?.let { catalog[it]?.fields } ?: emptyMap()
            for (field in listOf("overOfferings", "afterCommunion")) {
                val ids = if (field == "overOfferings") "offeringPrayerIds" else "afterCommunionPrayerIds"
                if (layers.first().containsKey(ids)) {
                    resolved = resolved + (ids to layers.first().getValue(ids))
                    orations.remove(field)
                } else {
                    orations[field] = requireNotNull(seasonalPrayers[field]) { "Missing seasonal prayer: $field" }
                    resolved = resolved - ids
                }
            }
        }
        selection.dayProperCollectOwnerId?.let { id ->
            val dayOwner = owner(id, null, "celebrations.json")
            val properPrayerId = mass(dayOwner)["orationSetId"] as? String
            val properCollect = properPrayerId?.let { catalog[it]?.fields?.get("collect") }
            val properCollectIds = mass(dayOwner)["collectPrayerIds"]
            if (properCollectIds != null) {
                resolved = resolved + ("collectPrayerIds" to properCollectIds)
                orations.remove("collect")
            } else if (properCollect != null) {
                orations["collect"] = properCollect
                resolved = resolved - "collectPrayerIds"
            }
        }
        if (!selectReferenced(resolved, chants, "entrance", "entranceChantIds", selection.entranceChoice, "chant-texts.json"))
            selectAlternative(chants, "entrance", selection.entranceChoice)
        val communionFollowsGospel = selectGospelConditionalCommunion(resolved, chants, selection.gospelStory, selection.communionChoice)
        if (!communionFollowsGospel &&
            !selectReferenced(resolved, chants, "communion", "communionChantIds", selection.communionChoice, "chant-texts.json")) {
            selectAlternative(chants, "communion", selection.communionChoice)
        }
        for ((field, ids, index) in listOf(
            Triple("collect", "collectPrayerIds", selection.collectChoice),
            Triple("overOfferings", "offeringPrayerIds", selection.offeringChoice),
            Triple("afterCommunion", "afterCommunionPrayerIds", selection.afterCommunionChoice),
        )) if (!selectReferenced(resolved, orations, field, ids, index, "prayer-texts.json")) selectAlternative(orations, field, index)
        resolved = selectMassChoices(resolved, selection)
        resolved = resolved - "formularyId"
        if (selectedFormulary != null) resolved = resolved + ("formularyId" to selectedFormulary)
        return Content(resolved, chants, orations, communionFollowsGospel)
    }

    private fun owner(id: String, variant: String?, vararg datasets: String): Map<String, Any?> {
        val item = requireNotNull(catalog[id]) { "Unknown owner: $id" }
        require(item.dataset in datasets) { "Wrong owner type: $id" }
        if (variant == null) return item.fields
        val variants = item.fields["contentVariants"] as? List<*> ?: emptyList<Any?>()
        val selected = variants.map(::objectMap).singleOrNull { it["key"] == variant }
        requireNotNull(selected) { "Unknown content variant: $id/$variant" }
        val result = item.fields.toMutableMap()
        if (selected.containsKey("mass")) result["mass"] = mergeMass(mass(item.fields), mass(selected))
        if (selected.containsKey("formularyChoices")) result["formularyChoices"] = selected["formularyChoices"]
        return result
    }

    companion object {
        /** The old kantry guard overrides these four slots, never the second reading. */
        private fun withoutFormularyScripture(mass: Map<String, Any?>): Map<String, Any?> {
            if (!mass.containsKey("lectionary")) return mass
            val readings = objectMap(mass["lectionary"]).toMutableMap()
            val slots = listOf("firstReading", "psalm", "acclamation", "gospel")
            slots.forEach { readings.remove("${it}Id") }
            val choices = objectMap(readings["choices"]).toMutableMap()
            slots.forEach { choices.remove(it) }
            if (choices.isEmpty()) readings.remove("choices") else readings["choices"] = choices
            return if (readings.isEmpty()) mass - "lectionary" else mass + ("lectionary" to readings)
        }

        internal fun mergeMass(base: Map<String, Any?>, overlay: Map<String, Any?>): Map<String, Any?> {
            val result = (base + overlay).toMutableMap()
            if (overlay.containsKey("lectionary")) {
                val lower = objectMap(base["lectionary"])
                val upper = objectMap(overlay["lectionary"])
                val choices = objectMap(lower["choices"]).toMutableMap()
                // A new default owns its alternatives; unrelated lower-layer choices cannot leak.
                listOf("firstReading", "secondReading", "psalm", "acclamation", "gospel").forEach { slot ->
                    if (upper.containsKey("${slot}Id")) choices.remove(slot)
                }
                choices.putAll(objectMap(upper["choices"]))
                val lectionary = (lower + upper).toMutableMap()
                if (choices.isEmpty()) lectionary.remove("choices") else lectionary["choices"] = choices
                result["lectionary"] = lectionary
            }
            if (overlay.containsKey("intercessionsId") && !overlay.containsKey("intercessionChoices")) {
                result.remove("intercessionChoices")
            }
            return result
        }

        private fun objectMap(value: Any?): Map<String, Any?> {
            if (value == null) return emptyMap()
            require(value is Map<*, *> && value.keys.all { it is String }) { "Expected content object" }
            return value.entries.associate { (key, entry) -> key as String to entry }
        }
    }

    private fun mergeSet(target: MutableMap<String, Any?>, id: String?) {
        if (id == null) return
        val item = requireNotNull(catalog[id])
        val fields = when (item.dataset) {
            "chant-sets.json" -> setOf("entrance", "communion")
            "oration-sets.json" -> setOf("collect", "overOfferings", "afterCommunion")
            else -> error("Not a chant or prayer set: $id")
        }
        target.putAll(item.fields.filterKeys { it in fields })
    }

    private fun selectReferenced(mass: Map<String, Any?>, target: MutableMap<String, Any?>, field: String,
        key: String, index: Int, dataset: String): Boolean {
        val ids = mass[key] as? List<*> ?: return false
        require(index in ids.indices) { "Unavailable choice for $field: $index" }
        val item = requireNotNull(catalog[ids[index] as? String]) { "Unknown $field choice" }
        require(item.dataset == dataset) { "Wrong $field choice type" }
        target[field] = if (dataset == "chant-texts.json") {
            mapOf("citation" to requireNotNull(item.fields["citation"]), "text" to requireNotNull(item.fields["text"]))
        } else requireNotNull(item.fields["text"])
        return true
    }

    /** A conditional chant stays unresolved until the caller identifies the Gospel actually read. */
    private fun selectGospelConditionalCommunion(
        mass: Map<String, Any?>,
        target: MutableMap<String, Any?>,
        story: GospelStory?,
        index: Int,
    ): Boolean {
        val raw = target["communion"] as? Map<*, *> ?: return false
        val communion = objectMap(raw)
        val choices = communion["gospelChoices"] as? List<*> ?: return false
        val options = choices.map(::objectMap)
        if (mass["communionChantIds"] != options.map { it["chantId"] }) return false
        require(index == 0) { "Gospel-dependent Communion requires a Gospel story, not a numbered choice" }
        if (story == null) return true
        val selected = options.singleOrNull { it["whenGospel"] == story.name }
            ?: options.single { it["whenGospel"] == GospelStory.OTHER.name }
        val item = requireNotNull(catalog[selected["chantId"] as? String]) { "Unknown Gospel-dependent chant" }
        require(item.dataset == "chant-texts.json") { "Wrong Gospel-dependent chant type" }
        target["communion"] = mapOf("citation" to requireNotNull(item.fields["citation"]), "text" to requireNotNull(item.fields["text"]))
        return true
    }

    /** Index zero selects the primary text; subsequent indexes select ordered alternatives. */
    private fun selectAlternative(target: MutableMap<String, Any?>, field: String, index: Int) {
        require(index >= 0) { "Negative choice for $field" }
        if (index == 0) return
        val value = objectMap(target[field])
        val alternatives = value["alternatives"] as? List<*> ?: emptyList<Any?>()
        require(index <= alternatives.size) { "Unavailable choice for $field: $index" }
        val selected = objectMap(alternatives[index - 1]) - "label"
        target[field] = (value - "alternatives") + selected
    }

    private fun mass(owner: Map<String, Any?>) = objectMap(owner["mass"])

    private fun selectMassChoices(mass: Map<String, Any?>, selection: Selection): Map<String, Any?> {
        val slots = setOf("firstReading", "secondReading", "psalm", "acclamation", "gospel")
        require(selection.readingChoices.keys.all { it in slots }) { "Unknown reading choice slot" }
        val result = mass.toMutableMap()
        if (selection.readingChoices.isNotEmpty()) {
            val readings = objectMap(mass["lectionary"]).toMutableMap()
            val choices = objectMap(readings["choices"])
            selection.readingChoices.forEach { (slot, index) ->
                require(index >= 0) { "Negative choice for $slot" }
                if (index > 0) {
                    val alternatives = choices[slot] as? List<*> ?: emptyList<Any?>()
                    require(index < alternatives.size) { "Unavailable choice for $slot: $index" }
                    val key = slot + "Id"
                    val option = objectMap(alternatives[index])
                    if (slot == "gospel") {
                        require(GospelChoiceAvailability.evaluate(option, selection.gospelChoiceContext) ==
                            GospelChoiceAvailability.Result.AVAILABLE) { "Gospel choice unavailable or missing context" }
                    }
                    readings[key] = requireNotNull(option[key])
                }
            }
            result["lectionary"] = readings
        }
        require(selection.intercessionChoice >= 0) { "Negative intercession choice" }
        if (selection.intercessionChoice > 0) {
            val choices = mass["intercessionChoices"] as? List<*> ?: emptyList<Any?>()
            require(selection.intercessionChoice < choices.size) { "Unavailable intercession choice" }
            result["intercessionsId"] = requireNotNull(objectMap(choices[selection.intercessionChoice])["intercessionsId"])
        }
        return result
    }
}
