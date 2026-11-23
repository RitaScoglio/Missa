package sk.missa.calendar.celebration

@JvmInline
value class CelebrationId(val value: String) {
    init { require(value.isNotBlank()) }
}

data class Celebration(
    val id: CelebrationId,
    val title: String,
    val date: CelebrationDate,
    val rank: CelebrationRank,
    val color: LiturgicalColor,
    val scope: CelebrationScope = CelebrationScope.Universal,
    val properties: Set<CelebrationProperty> = emptySet(),
    val liturgicalElements: Set<LiturgicalElement> = emptySet(),
    /** The formulary reference, when one is selected by default. */
    val formularyId: String? = null,
)

sealed interface CelebrationDate {
    data class Fixed(val monthDay: MonthDay) : CelebrationDate
    data class Movable(val key: MovableCelebration) : CelebrationDate
}

data class MonthDay(val month: Int, val day: Int) {
    init { require(month in 1..12 && day in 1..31) }
}

enum class MovableCelebration { SAINT_JOSEPH, ANNUNCIATION, PENTECOST_VIGIL, PENTECOST, CORPUS_CHRISTI, SACRED_HEART, ASCENSION_VIGIL, ASCENSION, TRINITY_SUNDAY, CHRIST_THE_KING, IMMACULATE_CONCEPTION, HOLY_FAMILY, BAPTISM_OF_THE_LORD, PENTECOST_MONDAY_VOTIVE, MARY_MOTHER_OF_THE_CHURCH, CHRIST_ETERNAL_HIGH_PRIEST, IMMACULATE_HEART_OF_MARY, NITRA_CATHEDRAL_DEDICATION }
enum class CelebrationRank { OPTIONAL_MEMORIAL, MEMORIAL, FEAST, SOLEMNITY, VIGIL, VOTIVE_MASS }
enum class LiturgicalColor { WHITE, RED, GREEN, VIOLET, ROSE, BLACK }
enum class CelebrationProperty { CELEBRATED_ON_SUNDAY, MARIAN, ENDS_PENANCE, ANNIVERSARY_OF_DEDICATION, CATHEDRAL_TITLE }
enum class LiturgicalElement { GLORIA, CREED }

sealed interface CelebrationScope {
    data object Universal : CelebrationScope
    data class Dioceses(val ids: Set<DioceseId>) : CelebrationScope
    data class Cathedral(val diocese: DioceseId) : CelebrationScope
    data class Locality(val diocese: DioceseId, val localityId: String) : CelebrationScope
}

@JvmInline
value class DioceseId(val value: String)
