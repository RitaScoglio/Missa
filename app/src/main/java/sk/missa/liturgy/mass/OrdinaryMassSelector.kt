package sk.missa.liturgy.mass

import sk.missa.calendar.OrdinaryContext
import sk.missa.data.assets.DatasetIntegrity

/** Finds a source-reviewed Ordinary Time context without interpreting dataset IDs. */
class OrdinaryMassSelector(items: List<DatasetIntegrity.Item>) {
    private val candidates = items.filter {
        it.dataset == "seasonal-masses.json" &&
            (it.fields["liturgicalDay"] as? Map<*, *>)?.get("season") == "ORDINARY_TIME"
    }

    fun find(context: OrdinaryContext): String? {
        val cycle = if (context.dayOfWeek == "SUNDAY") context.sundayCycle else context.weekdayCycle
        val matches = candidates.filter { item ->
            val day = item.fields["liturgicalDay"] as Map<*, *>
            (day["week"] as? Number)?.toInt() == context.week &&
                day["dayOfWeek"] == context.dayOfWeek &&
                day["lectionaryCycle"] == cycle &&
                (!day.containsKey("sundayCycle") || day["sundayCycle"] == context.sundayCycle)
        }
        require(matches.size <= 1) { "Ambiguous Ordinary Time context: $context" }
        return matches.singleOrNull()?.id
    }
}
