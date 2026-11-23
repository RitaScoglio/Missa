package sk.missa.liturgy.document

import sk.missa.calendar.LiturgicalDay
import sk.missa.calendar.LiturgicalSeason
import sk.missa.calendar.LiturgicalYear
import sk.missa.calendar.celebration.CelebrationDate
import sk.missa.calendar.celebration.CelebrationRank
import sk.missa.calendar.celebration.LiturgicalElement
import sk.missa.calendar.celebration.MovableCelebration
import sk.missa.data.assets.DatasetIntegrity
import sk.missa.liturgy.mass.MassContentResolver
import sk.missa.liturgy.mass.PrefaceOptionsResolver

/** Produces ordered display blocks from typed references, never from legacy codes. */
class LiturgyDocuments(val items: List<DatasetIntegrity.Item>) {
    val catalog = items.associateBy { it.id }
    private val rituals = RitualContentResolver(items)
    private val languages = LanguageContentResolver(items)
    private val prefaces = PrefaceOptionsResolver(items)

    data class Options(
        val prayerId: String? = null,
        val prefaceId: String? = null,
        val replacingPrayerAvailable: Boolean = false,
        val insertions: Map<String, String> = emptyMap(),
        val quietPrayers: Boolean = false,
    )

    fun prefaceChoices(content: MassContentResolver.Content, options: Options): List<String> =
        prefaces.resolve(content.mass, options.prayerId, options.replacingPrayerAvailable)

    fun prayerChoices(day: LiturgicalDay, selection: MassContentResolver.Selection, content: MassContentResolver.Content): List<String> {
        if (selection.properId == "om007") return listOf("ep001")
        if (selection.properId in setOf("om004", "om016")) return listOf("ep005", "ep006")
        val year = LiturgicalYear.of(day.date.year)
        val rank = (listOfNotNull(day.primaryCelebration) + day.alternatives).singleOrNull { it.id.value == selection.properId }?.rank
        val feast = rank in setOf(CelebrationRank.FEAST, CelebrationRank.SOLEMNITY, CelebrationRank.VIGIL)
        val week = year.seasonalContext(day.date)?.week
        val specialConsumer = selection.properId in setOf("om006", "om015", "om002", "om003")
        val fourthExcluded = feast || selection.properId in setOf("om005", "om008", "om011", "om012", "om013", "om014", "om017") ||
            day.season == LiturgicalSeason.LENT && week == 6 ||
            day.season == LiturgicalSeason.ADVENT && day.base.isSunday ||
            day.season == LiturgicalSeason.CHRISTMAS && day.date.month == 12 && day.date.dayOfMonth > 24 ||
            content.mass["allowEucharisticPrayerTwoPreface"] == false
        return buildList {
            addAll(listOf("ep003", "ep002", "ep007"))
            if (!fourthExcluded && !specialConsumer) add("ep004")
            if (!specialConsumer && !feast && day.season == LiturgicalSeason.LENT && day.date != year.ashWednesday && week != 6) addAll(listOf("ep005", "ep006"))
        }
    }

    fun mass(day: LiturgicalDay, content: MassContentResolver.Content, options: Options = Options()): List<Map<String, Any?>> = buildList {
        fun documentPopup(id: String) { add(popup(catalog.getValue(id).fields["title"] as String, id)) }
        fun part(title: String, value: Any?) { if (value != null) { add(heading(title)); add(text(value)) } }
        fun chant(field: String, title: String) {
            val value = content.chants[field] as? Map<*, *> ?: return
            require(value["gospelChoices"] == null) { "Identify the Gospel actually read before resolving Communion" }
            val citation = value["citation"] as? String
            if (citation.isNullOrEmpty()) add(heading(title)) else add(mapOf("type" to "PARALLEL", "cells" to listOf(mapOf("html" to title.uppercase()), mapOf("html" to citation)), "style" to mapOf("format" to "PLAIN_TEXT", "color" to "RED", "padding" to "SMALL")))
            add(text(requireNotNull(value["text"])) + ("style" to mapOf("format" to "HTML", "alignment" to "JUSTIFY")))
        }
        val year = LiturgicalYear.of(day.date.year)
        if (day.date.month == 2 && day.date.dayOfMonth == 2) {
            documentPopup("od150")
            documentPopup("od153")
        }
        add(mapOf("type" to "BELL"))
        if (day.date == year.easter.minusDays(7)) documentPopup("od110")
        if (day.primaryCelebration?.id?.value == "c254") documentPopup("od101")
        chant("entrance", "Úvodný spev")
        if (day.date == year.adventStart) documentPopup("od003")
        val epiphany = day.date.month == 1 && (day.date.dayOfMonth == 6 || day.date.dayOfMonth == 5 && day.primaryCelebration?.rank == CelebrationRank.VIGIL)
        if (epiphany) documentPopup("od044")
        add(popup("Formuly úvodného pozdravu celebranta", "od102"))
        if (day.date != year.ashWednesday) {
            val penitential = when (day.season) {
                LiturgicalSeason.ADVENT -> "od112"
                LiturgicalSeason.CHRISTMAS -> "od113"
                LiturgicalSeason.LENT -> "od114"
                LiturgicalSeason.EASTER -> "od115"
                LiturgicalSeason.ORDINARY_TIME -> "od111"
            }
            add(popup("Úkon kajúcnosti", penitential))
        }
        if (options.quietPrayers) addAll(resource("od154", day))
        val elements = day.liturgicalElements
        if (LiturgicalElement.GLORIA in elements) add(popup("Glória", "od103"))
        else if (day.base.isSunday && day.season in setOf(LiturgicalSeason.LENT, LiturgicalSeason.ADVENT)) add(plain("Oslavná pieseň sa vynechá.") + ("style" to mapOf("color" to "RED", "padding" to "SMALL")))
        part("Modlitba dňa", content.orations["collect"])
        add(heading("Liturgia slova"))
        val readings = content.mass["lectionary"] as? Map<*, *> ?: emptyMap<Any, Any>()
        for ((slot, title) in listOf("firstReading" to "Prvé čítanie", "psalm" to "Responzóriový žalm", "secondReading" to "Druhé čítanie", "acclamation" to "Verš pred evanjeliom", "gospel" to "Evanjelium")) {
            if (slot == "acclamation") (content.mass["sequenceDocumentId"] as? String)?.let { add(popup("Sekvencia", it)) }
            (readings["${slot}Id"] as? String)?.let { id ->
                if (slot == "gospel" && options.quietPrayers) addAll(resource("od155", day))
                val citation = catalog.getValue(id).fields["citation"] as? String
                if (citation.isNullOrEmpty()) add(heading(title)) else add(mapOf("type" to "PARALLEL", "cells" to listOf(mapOf("html" to title.uppercase()), mapOf("html" to citation)), "style" to mapOf("format" to "PLAIN_TEXT", "color" to "RED", "padding" to "SMALL")))
                addAll(resource(id, day).let { if (citation != null) it.drop(1) else it })
                if (slot == "gospel" && options.quietPrayers) addAll(resource("od156", day))
            }
        }
        if (epiphany) documentPopup("od043")
        if (LiturgicalElement.CREED in elements) add(popup("Krédo", "od104"))
        if (day.date == year.ashWednesday) add(popup("Požehnanie popola a značenie popolom", "od002"))
        (content.mass["intercessionsId"] as? String)?.let { id ->
            add(heading("Spoločné modlitby veriacich"))
            val fields = catalog.getValue(id).fields
            listOf("introduction", "response", "intentions").forEach { field -> fields[field]?.let {
                add(text(it) + ("style" to buildMap<String, Any> {
                    put("format", "HTML")
                    if (field in setOf("introduction", "intentions")) put("alignment", "JUSTIFY")
                    if (field == "response") put("italic", true)
                    if (field == "intentions") put("padding", "SMALL")
                }))
            } }
            documentPopup("od180")
            listOf("od047", "od048", "od049", "od050", "od051").forEach(::documentPopup)
            fields["conclusion"]?.let { add(text(it) + ("style" to mapOf("format" to "HTML"))) }
        }
        if (options.quietPrayers) addAll(resource("od157", day))
        part("Modlitba nad obetnými darmi", content.orations["overOfferings"])
        addAll(eucharist(day, content, options))
        addAll(resource("od027", day))
        if (options.quietPrayers) addAll(resource("od158", day))
        chant("communion", "Spev na prijímanie")
        if (options.quietPrayers) addAll(resource("od159", day))
        if (day.date.month == 12 && day.date.dayOfMonth == 31) documentPopup("od045")
        if (day.date.month == 1 && day.date.dayOfMonth == 1) documentPopup("od046")
        part("Modlitba po prijímaní", content.orations["afterCommunion"])
        if (day.date == year.dateOf(MovableCelebration.CHRIST_THE_KING)) documentPopup("od033")
        if (content.mass["blessingOrderDocumentId"] != null) {
            add(popup("Slávnostné požehnanie", content.mass["blessingOrderDocumentId"] as String) +
                ("popupBlocks" to rituals.blessingBlocks(content.mass)))
        } else (content.mass["blessingDocumentId"] as? String)?.takeUnless { id ->
            catalog[id]?.fields?.get("category") == "LENT_PRAYER_OVER_PEOPLE" && day.primaryCelebration?.rank == CelebrationRank.SOLEMNITY
        }?.let { id ->
            add(popup(if (day.season == LiturgicalSeason.LENT) "Modlitba nad ľudom" else "Slávnostné požehnanie", id))
        }
        if (day.date.month == 2 && day.date.dayOfMonth == 3) {
            add(heading(catalog.getValue("od160").fields["title"] as String))
            addAll(resource("od160", day))
        } else if (day.date == year.dateOf(MovableCelebration.CORPUS_CHRISTI)) documentPopup("od040")
        else if (content.mass["blessingDocumentId"] == null && !(day.season == LiturgicalSeason.LENT && day.primaryCelebration?.rank == CelebrationRank.SOLEMNITY)) documentPopup("od001")
        if (content.mass["blessingOrderDocumentId"] == null && solemnBlessingKey(day) != null) documentPopup("od165")
        val easterDismissal = day.date in year.easter..year.easter.plusDays(7)
        addAll(resource(if (easterDismissal) "od042" else "od041", day))
    }

    private fun solemnBlessingKey(day: LiturgicalDay): String? {
        val date = day.date
        val year = LiturgicalYear.of(date.year)
        val rank = day.primaryCelebration?.rank
        val movable = (day.primaryCelebration?.date as? CelebrationDate.Movable)?.key
        return when {
            date.month == 1 && date.dayOfMonth == 1 -> "NEW_YEAR"
            date.month == 1 && date.dayOfMonth == 6 -> "EPIPHANY"
            date == year.dateOf(MovableCelebration.ASCENSION) -> "ASCENSION"
            date == year.dateOf(MovableCelebration.PENTECOST) -> "HOLY_SPIRIT"
            movable in setOf(MovableCelebration.MARY_MOTHER_OF_THE_CHURCH, MovableCelebration.IMMACULATE_CONCEPTION) -> "MARY"
            date.month == 6 && (date.dayOfMonth == 29 || date.dayOfMonth == 28 && rank == CelebrationRank.VIGIL) -> "PETER_AND_PAUL"
            day.primaryCelebration != null && (date.month to date.dayOfMonth) in setOf(5 to 3, 5 to 14, 6 to 11, 7 to 3, 7 to 25, 8 to 24, 9 to 21, 10 to 28, 11 to 30) -> "APOSTLES"
            date.month == 11 && date.dayOfMonth == 1 -> "ALL_SAINTS"
            date.month == 11 && date.dayOfMonth == 2 -> "DECEASED"
            day.season == LiturgicalSeason.LENT -> if (rank == CelebrationRank.SOLEMNITY) "LENT" else null
            day.base.isSunday || rank in setOf(CelebrationRank.SOLEMNITY, CelebrationRank.FEAST, CelebrationRank.VIGIL) || date.month == 12 && date.dayOfMonth >= 25 || date in year.easter..year.easter.plusDays(7) -> day.season.name
            else -> null
        }
    }

    fun eucharist(day: LiturgicalDay, content: MassContentResolver.Content, options: Options): List<Map<String, Any?>> = buildList {
        val offered = prefaceChoices(content, options)
        val preface = options.prefaceId ?: offered.firstOrNull()
        require(options.prefaceId == null || options.prefaceId in offered) { "Unavailable preface" }
        if (preface != null) { add(heading("Prefácia")); addAll(resource(preface, day)) }
        options.prayerId?.let { id ->
            add(heading(catalog.getValue(id).fields["name"] as String))
            addAll(rituals.segments(id, prayerInsertions(day, id) + options.insertions))
        }
    }

    fun prayerInsertions(day: LiturgicalDay, prayerId: String): Map<String, String> {
        val year = LiturgicalYear.of(day.date.year)
        val key = when {
            day.date == year.easter.minusDays(3) -> "HOLY_THURSDAY"
            day.date == year.easter.minusDays(1) -> "EASTER_VIGIL"
            day.season == LiturgicalSeason.CHRISTMAS && day.date.month == 12 && day.date.dayOfMonth >= 24 -> "CHRISTMAS_OCTAVE"
            day.date.month == 1 && day.date.dayOfMonth == 6 -> "EPIPHANY"
            day.date in year.easter..year.easter.plusDays(7) -> "EASTER_OCTAVE"
            day.date == year.dateOf(MovableCelebration.ASCENSION) -> "ASCENSION"
            day.date == year.dateOf(MovableCelebration.PENTECOST) -> "PENTECOST"
            else -> return emptyMap()
        }
        val segments = catalog.getValue(prayerId).fields["segments"] as List<*>
        return segments.mapNotNull { raw ->
            val segment = raw as Map<*, *>
            val variants = segment["variants"] as? List<*> ?: return@mapNotNull null
            if (variants.any { (it as Map<*, *>)["key"] == key }) (segment["slot"] as String) to key else null
        }.toMap()
    }

    fun rite(id: String, day: LiturgicalDay, options: Options = Options(), insertions: Map<String, String> = emptyMap()): List<Map<String, Any?>> {
        val rite = catalog.getValue(id).fields["rite"]
        val prayer = options.prayerId ?: "ep002"
        require(prayer in setOf("ep003", "ep002", "ep007")) { "The Triduum consumer offers Eucharistic Prayers I–III" }
        val year = LiturgicalYear.of(day.date.year)
        val context = when (rite) {
            "HOLY_THURSDAY" -> day.copy(date = year.easter.minusDays(3), season = LiturgicalSeason.LENT)
            "EASTER_VIGIL" -> day.copy(date = year.easter.minusDays(1), season = LiturgicalSeason.EASTER)
            else -> day
        }
        return expandReferences(rituals.riteBlocks(id, insertions), context).flatMap { block ->
            if (block["type"] != "MASS_PART") listOf(block) else when (block["part"]) {
                "PREFACE" -> resource(if (rite == "HOLY_THURSDAY") "pf029" else "pf022", context)
                "EUCHARISTIC_PRAYER" -> resource(prayer, context, options.insertions)
                "COMMUNION_RITE" -> resource("od027", context)
                else -> error("Unknown rite Mass part")
            }
        }
    }

    fun resource(id: String, day: LiturgicalDay, insertions: Map<String, String> = emptyMap()): List<Map<String, Any?>> {
        val item = requireNotNull(catalog[id]) { "Unknown resource: $id" }
        return when (item.dataset) {
            "ordinary-documents.json" -> {
                val dates = calendarDates(id, day)
                val selectedInsertions = if (id == "od165") mapOf("SOLEMN_BLESSING" to (solemnBlessingKey(day) ?: day.season.name)) + insertions else insertions
                val raw = rituals.blocks(id, selectedInsertions, dates)
                expandReferences(if (dates.isEmpty()) raw else joinCalendarFragments(raw), day)
            }
            "triduum-rites.json" -> expandReferences(rituals.riteBlocks(id, insertions), day)
            "eucharistic-prayers.json" -> rituals.segments(id, prayerInsertions(day, id) + insertions)
            "gospels.json" -> listOfNotNull((item.fields["citation"] as? String)?.let(::plain), (item.fields["title"] as? String)?.let(::readingTitle)) + expandReferences(rituals.gospelBlocks(id), day).map { block ->
                if (item.fields["documentId"] == null) block + ("style" to mapOf("format" to "HTML", "alignment" to "JUSTIFY")) else block
            }
            "language-packs.json" -> languages.sections(id).flatMap { section ->
                listOfNotNull(section.title?.let { heading(it) + ("style" to mapOf("format" to "HTML", "bold" to true, "color" to "RED", "padding" to "BIG")) }) + section.paragraphs.map { mapOf("type" to "LANGUAGE_PARAGRAPH", "runs" to it.runs) }
            }
            "amendments.json" -> listOfNotNull(heading(item.fields["title"] as String), text(requireNotNull(item.fields["revisedText"])), item.fields["explanation"]?.let(::text))
            else -> listOfNotNull(
                (item.fields["citation"] as? String)?.let(::plain),
                (item.fields["title"] as? String)?.let(::readingTitle),
                (item.fields["body"] ?: item.fields["text"])?.let { text(it) + ("style" to if (item.dataset in setOf("first-readings.json", "second-readings.json", "prefaces.json")) mapOf("format" to "HTML", "alignment" to "JUSTIFY") else mapOf("format" to "HTML")) },
            )
        }
    }

    private fun expandReferences(blocks: List<Map<String, Any?>>, day: LiturgicalDay): List<Map<String, Any?>> =
        blocks.flatMap { block -> if (block["type"] == "REFERENCE") resource(block["contentId"] as String, day) else listOf(block) }

    private fun calendarDates(id: String, day: LiturgicalDay): Map<RitualContentResolver.CalendarDate, String> {
        val year = LiturgicalYear.of(day.date.year)
        val dates = mapOf(
            "EASTER" to year.easter, "ASH_WEDNESDAY" to year.ashWednesday,
            "ASCENSION" to year.dateOf(MovableCelebration.ASCENSION), "PENTECOST" to year.dateOf(MovableCelebration.PENTECOST),
            "FIRST_ADVENT_SUNDAY" to year.adventStart,
        )
        val blocks = catalog.getValue(id).fields["blocks"] as List<*>
        val months = listOf("januára", "februára", "marca", "apríla", "mája", "júna", "júla", "augusta", "septembera", "októbra", "novembra", "decembra")
        return blocks.mapNotNull { raw ->
            val block = raw as Map<*, *>
            if (block["type"] != "CALENDAR_DATE") null else {
                val key = block["day"] as String
                val date = dates.getValue(key)
                RitualContentResolver.CalendarDate.valueOf(key) to "${date.dayOfMonth}. ${months[date.month - 1]}"
            }
        }.toMap()
    }

    /** The proclamation consumer concatenates its text and date tokens in one paragraph. */
    private fun joinCalendarFragments(blocks: List<Map<String, Any?>>): List<Map<String, Any?>> = buildList {
        val paragraph = StringBuilder()
        fun flush() {
            if (paragraph.isNotEmpty()) {
                add(text(mapOf("html" to paragraph.toString())) + ("style" to mapOf("format" to "HTML")))
                paragraph.setLength(0)
            }
        }
        blocks.forEach { block ->
            val style = block["style"] as? Map<*, *> ?: emptyMap<Any, Any>()
            if (block["type"] == "TEXT" && style.keys.all { it == "format" }) {
                val value = (block["content"] as Map<*, *>)["html"] as String
                paragraph.append(if (style["format"] == "PLAIN_TEXT") value.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;") else value)
            } else { flush(); add(block) }
        }
        flush()
    }

    companion object {
        fun text(content: Any) = mapOf("type" to "TEXT", "content" to content)
        fun plain(value: String) = mapOf("type" to "TEXT", "content" to mapOf("html" to value), "style" to mapOf("format" to "PLAIN_TEXT"))
        fun heading(value: String) = mapOf("type" to "HEADING", "content" to mapOf("html" to value.uppercase()), "style" to mapOf("format" to "PLAIN_TEXT", "bold" to true, "color" to "RED", "padding" to "BIG"))
        private fun popup(label: String, id: String) = mapOf("type" to "POPUP", "content" to mapOf("html" to "$label (otvoriť)"), "contentId" to id, "style" to mapOf("format" to "PLAIN_TEXT", "color" to "RED", "padding" to "SMALL"))
        private fun readingTitle(value: String) = plain(value) + ("style" to mapOf("format" to "PLAIN_TEXT", "alignment" to "CENTER", "italic" to true))
    }
}
