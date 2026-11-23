package sk.missa.liturgy.mass

import sk.missa.calendar.LiturgicalDay
import sk.missa.calendar.LiturgicalSeason
import sk.missa.calendar.LiturgicalYear
import sk.missa.calendar.celebration.Celebration
import sk.missa.calendar.celebration.CelebrationRank
import sk.missa.calendar.celebration.MovableCelebration
import sk.missa.data.assets.DatasetIntegrity

/**
 * Joins base calendar coordinates to content without consulting legacy provenance.
 * Context keys describe authored content; target IDs never encode calendar rules.
 */
class CalendarMassSelection(items: List<DatasetIntegrity.Item>) {
    private val ordinary = OrdinaryMassSelector(items)
    private val seasonal = SeasonalMassSelector(items)
    private val catalog = items.associateBy { it.id }

    data class Options(
        val massTime: GospelChoiceAvailability.MassTime = GospelChoiceAvailability.MassTime.DAY,
        val formularyId: String? = null,
        val withSecondReading: Boolean = false,
        val previousSundayGospelId: String? = null,
        val reconciliation: String? = null,
        val currentDayScripture: Boolean = false,
        val lentenReadingsFromCycleA: Boolean = false,
        val dayCelebrationId: String? = null,
    )

    fun select(day: LiturgicalDay, celebrationId: String? = day.primaryCelebration?.id?.value, options: Options = Options()): MassContentResolver.Selection {
        val year = LiturgicalYear.of(day.date.year)
        val sourceContext = year.seasonalContext(day.date)
        require(!options.lentenReadingsFromCycleA || day.date.isSunday() && day.season == LiturgicalSeason.LENT && sourceContext?.week in 3..5) { "Cycle A substitution is available only on Lent Sundays III–V" }
        val seasonalContext = sourceContext?.let { if (options.lentenReadingsFromCycleA) it.copy(sundayCycle = "A") else it }
        var seasonalId = year.ordinaryContext(day.date)?.let(ordinary::find)
            ?: seasonalContext?.let { seasonal.find(SeasonalCalendarAdapter.context(it)) }
        val celebration = celebrationId?.let { id ->
            val item = requireNotNull(catalog[id]) { "Unknown Mass: $id" }
            if (item.dataset == "optional-masses.json") {
                require(SpecialMassAvailability.isAvailable(id, day)) { "Optional Mass is unavailable on ${day.date}: $id" }
                require(id != "om016" || day.season == LiturgicalSeason.LENT) { "The seasonal reconciliation option requires Lent" }
                require(id != "om004" || day.season != LiturgicalSeason.LENT || !day.date.isSunday()) { "Lenten Sunday offers the seasonal reconciliation option only" }
                val availability = item.fields["availability"] as Map<*, *>
                require(availability["kind"] == "USER_SELECTABLE" || day.generatedObservances.any { it.id == availability["generatedObservanceKey"] }) {
                    "Generated observance is unavailable: $id"
                }
                null
            } else {
                requireNotNull((listOfNotNull(day.primaryCelebration) + day.alternatives).singleOrNull { it.id.value == id }) {
                    "Celebration is not available on ${day.date}: $id"
                }
            }
        }
        val christmasVigil = celebration?.rank == CelebrationRank.VIGIL && day.season == LiturgicalSeason.ADVENT && day.date.month == 12 && day.date.dayOfMonth == 24
        if (christmasVigil) seasonalId = seasonal.find(SeasonalCalendarAdapter.context(requireNotNull(sourceContext)).copy(useWeekdayDateContent = true))
        require(seasonalId != null || celebrationId != null) { "No Mass for ${day.date}; select the appropriate special rite" }
        val context = year.seasonalContext(day.date)
        val cycle = context?.sundayCycle ?: requireNotNull(year.ordinaryContext(day.date)).sundayCycle
        val week = context?.week
        val reconciliation = when (options.formularyId) {
            "f099", "f100" -> "FORGIVENESS"
            "f102" -> "CONCORD"
            "f103" -> "CROSS"
            "f104" -> "EUCHARIST"
            "f105" -> "PRECIOUS_BLOOD"
            else -> options.reconciliation
        }
        fun variant(id: String?): String? {
            val owner = catalog[id]?.fields ?: return null
            val keys = (owner["contentVariants"] as? List<*>)?.map { (it as Map<*, *>)["key"] } ?: return null
            val candidates = buildList {
                if (day.season == LiturgicalSeason.ADVENT && day.date.month == 12 && day.date.dayOfMonth >= 17) add("FROM_DECEMBER_17")
                when (options.formularyId) {
                    "f003" -> add("FORMULARY_F002")
                    "f004" -> add("FORMULARY_F003")
                    "f005" -> add("FORMULARY_F004")
                    "f023" -> add("FORMULARY_F022")
                    "f024" -> add("FORMULARY_F023")
                    "f025" -> add("FORMULARY_F024")
                }
                if (options.withSecondReading) add("WITH_SECOND_READING")
                if (day.date.isSunday()) { add("SUNDAY_$cycle"); add("SUNDAY_${week}"); add("SUNDAY") }
                else add("WEEKDAY_$cycle")
                add("CYCLE_$cycle")
                if (day.season == LiturgicalSeason.LENT) {
                    if (reconciliation != null && week in 5..6) add("LENT_WEEK_${week}_${reconciliation}")
                    if (reconciliation != null) add("LENT_${reconciliation}")
                    if (week in 5..6) add("LENT_WEEK_$week")
                    add("LENT_COLLECT_ONLY")
                    add("LENT")
                }
                if (day.season == LiturgicalSeason.EASTER) {
                    if (day.date > year.dateOf(sk.missa.calendar.celebration.MovableCelebration.ASCENSION)) add("EASTER_POST_ASCENSION")
                    add("EASTER")
                }
                if (day.season == LiturgicalSeason.ADVENT) {
                    if (day.date.month == 12 && day.date.dayOfMonth >= 17) add("FROM_DECEMBER_17")
                    add("ADVENT")
                }
                if (day.season == LiturgicalSeason.CHRISTMAS) {
                    if (day.date.month == 1 && day.date.dayOfMonth > 6) add("CHRISTMAS_AFTER_EPIPHANY")
                    add("CHRISTMAS")
                    if (!day.date.isSunday()) add(SeasonalMassSelector.DayOfWeek.entries[day.date.weekdayNumber()].name)
                }
                if (keys.contains("SPRING")) {
                    val season = when { day.season == LiturgicalSeason.LENT -> "SPRING"; day.season == LiturgicalSeason.ADVENT -> "WINTER"; day.date.month == 9 -> "AUTUMN"; else -> "SUMMER" }
                    when {
                        season == "SPRING" && options.formularyId in setOf("f077", "f078") -> add("SPRING_OTHER_FORMULARY")
                        season == "SUMMER" && options.formularyId in setOf("f082", "f083") -> add("SUMMER_VOCATIONS")
                        season == "AUTUMN" && options.formularyId == "f086" -> add("AUTUMN_HARVEST")
                    }
                    add(season)
                }
                reconciliation?.let(::add)
                if (day.season != LiturgicalSeason.ADVENT || day.date.month != 12 || day.date.dayOfMonth < 17) add("NON_PRIVILEGED_CONTEXT")
            }
            return candidates.firstOrNull { it in keys }
        }
        val collectOnly = christmasVigil || celebration?.rank in setOf(CelebrationRank.MEMORIAL, CelebrationRank.OPTIONAL_MEMORIAL) &&
            (day.season == LiturgicalSeason.LENT || day.date.month == 12 && day.date.dayOfMonth >= 17)
        val selectedFormulary = options.formularyId ?: (catalog[celebrationId]?.fields?.get("mass") as? Map<*, *>)?.get("formularyId") as? String
        val generatedKey = (catalog[celebrationId]?.fields?.get("availability") as? Map<*, *>)?.get("generatedObservanceKey")
        val dayCollectOwner = if (celebrationId == "om016") options.dayCelebrationId ?: day.primaryCelebration?.id?.value else null
        require(dayCollectOwner == null || (listOfNotNull(day.primaryCelebration) + day.alternatives).any { it.id.value == dayCollectOwner }) { "The day's collect owner is unavailable" }
        return MassContentResolver.Selection(
            seasonalMassId = seasonalId,
            properId = celebrationId,
            seasonalVariant = variant(seasonalId),
            properVariant = variant(celebrationId),
            formularyId = options.formularyId,
            formularyVariant = variant(selectedFormulary),
            orationUse = if (collectOnly) MassContentResolver.OrationUse.PROPER_COLLECT_WITH_SEASONAL_REMAINDER else MassContentResolver.OrationUse.STANDARD,
            gospelChoiceContext = GospelChoiceAvailability.Context(GospelChoiceAvailability.SundayCycle.valueOf(cycle), options.previousSundayGospelId, options.massTime),
            formularyScriptureUse = if (generatedKey in setOf("ember-days", "rogation-days") && options.currentDayScripture)
                MassContentResolver.FormularyScriptureUse.CURRENT_DAY else MassContentResolver.FormularyScriptureUse.FORMULARY,
            dayProperCollectOwnerId = dayCollectOwner,
        )
    }
}
