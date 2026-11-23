package sk.missa.liturgy.mass

import sk.missa.data.assets.DatasetIntegrity

/**
 * Applies the selected Eucharistic prayer's documented effect to the already
 * resolved Mass prefaces. The calendar/selection layer supplies availability.
 */
class PrefaceOptionsResolver(items: List<DatasetIntegrity.Item>) {
    private val prayers = items.filter { it.dataset == "eucharistic-prayers.json" }.associateBy { it.id }

    fun resolve(
        mass: Map<String, Any?>,
        prayerId: String? = null,
        replacingPrayerAvailable: Boolean? = null,
    ): List<String> {
        val options = ids(requireNotNull(mass["prefaceIds"]) { "Mass preface options are unresolved" })
        if (prayerId == null) {
            val offered = prayers.values.filter { it.fields["offerPrefaceWhenPrayerUnselected"] == true }
            if (offered.isEmpty()) return options
            val allowed = permission(mass)
            return if (allowed) options + offered.flatMap { ids(it.fields["prefaceIds"]) } else options
        }

        val prayer = requireNotNull(prayers[prayerId]) { "Unknown Eucharistic prayer: $prayerId" }.fields
        return when (val mode = prayer["prefaceUse"]) {
            null -> options
            "APPEND_WHEN_ALLOWED" -> if (permission(mass)) options + ids(prayer["prefaceIds"]) else options
            "PREPEND" -> ids(prayer["prefaceIds"]) + options
            "REPLACE_ALL" -> {
                require(replacingPrayerAvailable == true) { "Replacing prayer availability is not confirmed" }
                ids(prayer["prefaceIds"])
            }
            else -> error("Unknown preface use: $mode")
        }
    }

    private fun permission(mass: Map<String, Any?>): Boolean =
        mass["allowEucharisticPrayerTwoPreface"] as? Boolean
            ?: error("Eucharistic Prayer II preface permission is unresolved")

    private fun ids(value: Any?): List<String> {
        require(value is List<*> && value.all { it is String }) { "Expected ordered preface IDs" }
        return value.map { it as String }
    }
}
