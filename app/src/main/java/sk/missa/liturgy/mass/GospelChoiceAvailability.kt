package sk.missa.liturgy.mass

/** Evaluates the specific source-stated restrictions on an optional Gospel. */
object GospelChoiceAvailability {
    enum class SundayCycle { A, B, C }
    enum class MassTime { DAY, EVENING }
    enum class Result { AVAILABLE, UNAVAILABLE, NEEDS_CONTEXT }

    data class Context(
        val sundayCycle: SundayCycle? = null,
        val previousSundayGospelId: String? = null,
        val massTime: MassTime? = null,
    )

    fun evaluate(choice: Map<String, Any?>, context: Context): Result {
        val raw = choice["availability"] ?: return Result.AVAILABLE
        require(raw is Map<*, *> && raw.keys.all { it in setOf("sundayCycle", "previousSundayGospelId", "massTime") }) {
            "Unsupported Gospel availability"
        }
        val requirements = listOf(
            "sundayCycle" to context.sundayCycle?.name,
            "previousSundayGospelId" to context.previousSundayGospelId,
            "massTime" to context.massTime?.name,
        )
        if (requirements.any { (key, actual) -> raw.containsKey(key) && actual != null && raw[key] != actual }) {
            return Result.UNAVAILABLE
        }
        if (requirements.any { (key, actual) -> raw.containsKey(key) && actual == null }) {
            return Result.NEEDS_CONTEXT
        }
        return Result.AVAILABLE
    }
}
