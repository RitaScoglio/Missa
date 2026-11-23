package sk.missa.calendar.celebration

import sk.missa.data.assets.DatasetIntegrity

/** Builds calendar entries from the content records after their references have been validated. */
object DatasetCelebrationCatalog {
    fun fromItems(items: List<DatasetIntegrity.Item>): CelebrationCatalog {
        DatasetIntegrity.validate(items)
        return CelebrationCatalog(items.filter { it.dataset == "celebrations.json" }.map(::celebration))
    }

    private fun celebration(item: DatasetIntegrity.Item): Celebration {
        val fields = item.fields
        val date = map(fields["date"])
        val scope = fields["scope"]?.let(::map)
        val mass = fields["mass"]?.let(::map)
        return Celebration(
            id = CelebrationId(item.id),
            title = fields["title"] as String,
            date = when (date["type"]) {
                "FIXED" -> CelebrationDate.Fixed(MonthDay(number(date, "month"), number(date, "day")))
                "MOVABLE" -> CelebrationDate.Movable(MovableCelebration.valueOf(date["movableKey"] as String))
                else -> error("Unknown date for " + item.id)
            },
            rank = CelebrationRank.valueOf(fields["rank"] as String),
            color = LiturgicalColor.valueOf(fields["color"] as String),
            scope = when {
                scope == null || scope["kind"] == "UNIVERSAL" -> CelebrationScope.Universal
                scope["kind"] == "DIOCESES" -> CelebrationScope.Dioceses(strings(scope["dioceses"]).map(::DioceseId).toSet())
                scope["kind"] == "CATHEDRAL" -> CelebrationScope.Cathedral(DioceseId(strings(scope["dioceses"]).single()))
                scope["kind"] == "LOCALITY" -> CelebrationScope.Locality(
                    DioceseId(strings(scope["dioceses"]).single()),
                    scope["localityId"] as String,
                )
                else -> error("Unknown scope for " + item.id)
            },
            properties = strings(fields["properties"]).map(CelebrationProperty::valueOf).toSet(),
            liturgicalElements = strings(fields["liturgicalElements"]).map(LiturgicalElement::valueOf).toSet(),
            formularyId = mass?.get("formularyId") as? String,
        )
    }

    private fun map(value: Any?): Map<*, *> = value as? Map<*, *> ?: error("Expected object")
    private fun number(value: Map<*, *>, key: String): Int = (value[key] as Number).toInt()
    private fun strings(value: Any?): List<String> {
        if (value == null) return emptyList()
        require(value is List<*>) { "Expected array" }
        return value.map { it as String }
    }
}
