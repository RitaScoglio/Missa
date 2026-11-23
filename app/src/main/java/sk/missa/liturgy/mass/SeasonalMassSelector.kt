package sk.missa.liturgy.mass

import sk.missa.calendar.LiturgicalSeason
import sk.missa.data.assets.DatasetIntegrity

/** Matches explicit calendar descriptors; it neither calculates dates nor selects a proper celebration. */
class SeasonalMassSelector(items: List<DatasetIntegrity.Item>) {
    enum class DayOfWeek { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
    enum class Cycle { A, B, C }

    data class Context(
        val season: LiturgicalSeason,
        val dayOfWeek: DayOfWeek,
        val week: Int? = null,
        val cycle: Cycle? = null,
        val month: Int? = null,
        val dayOfMonth: Int? = null,
        val useWeekdayDateContent: Boolean = false,
    ) {
        init {
            require(season != LiturgicalSeason.ORDINARY_TIME) { "Use OrdinaryMassSelector for Ordinary Time" }
            require(week == null || week >= 0) { "Invalid seasonal week" }
            require((month == null) == (dayOfMonth == null)) { "Supply month and day together" }
            require(month == null || month in 1..12) { "Invalid month" }
            require(dayOfMonth == null || dayOfMonth in 1..31) { "Invalid day of month" }
        }
    }

    private val candidates = items.filter {
        it.dataset == "seasonal-masses.json" &&
            (it.fields["liturgicalDay"] as? Map<*, *>)?.get("season") in
            setOf("ADVENT", "CHRISTMAS", "LENT", "EASTER")
    }

    /** Date-specific weekdays take precedence over weekly ferias; Sundays retain their cycle. */
    fun find(context: Context): String? {
        val matches = candidates.filter { matches(it.fields["liturgicalDay"] as Map<*, *>, context) }
        val dated = matches.filter { (it.fields["liturgicalDay"] as Map<*, *>).containsKey("dayOfMonth") }
        val selected = dated.ifEmpty { matches }
        require(selected.size <= 1) { "Ambiguous seasonal Mass context: $context" }
        return selected.singleOrNull()?.id
    }

    private fun matches(day: Map<*, *>, context: Context): Boolean {
        require(day.keys.all { it in setOf("season", "week", "dayOfWeek", "lectionaryCycle", "month", "dayOfMonth", "dayCategory") }) {
            "Unsupported seasonal descriptor: $day"
        }
        if (day["season"] != context.season.name) return false
        if (day.containsKey("week") && (day["week"] as Number).toInt() != context.week) return false
        if (day.containsKey("dayOfWeek") && day["dayOfWeek"] != context.dayOfWeek.name) return false
        if (day.containsKey("lectionaryCycle") && day["lectionaryCycle"] != context.cycle?.name) return false
        if (day.containsKey("month") && (day["month"] as Number).toInt() != context.month) return false
        if (day.containsKey("dayOfMonth") && (day["dayOfMonth"] as Number).toInt() != context.dayOfMonth) return false
        if (day.containsKey("dayCategory")) {
            require(day["dayCategory"] == "WEEKDAY") { "Unsupported seasonal day category: $day" }
            if (context.dayOfWeek == DayOfWeek.SUNDAY && !context.useWeekdayDateContent) return false
        }
        return true
    }
}
