package sk.missa.calendar.celebration

/** The celebration data set, indexed for calendar lookups. */
class CelebrationCatalog(celebrations: Collection<Celebration>) {
    private val byId = celebrations.associateBy(Celebration::id)
    private val fixedByDate = celebrations.mapNotNull { celebration ->
        (celebration.date as? CelebrationDate.Fixed)?.let { it.monthDay to celebration }
    }.groupBy({ it.first }, { it.second })
    private val movableByKey = celebrations.mapNotNull { celebration ->
        (celebration.date as? CelebrationDate.Movable)?.let { it.key to celebration }
    }.groupBy({ it.first }, { it.second })

    init {
        require(byId.size == celebrations.size) { "Celebration IDs must be unique." }
    }

    fun findById(id: CelebrationId): Celebration? = byId[id]
    fun fixedOn(month: Int, day: Int): List<Celebration> = fixedByDate[MonthDay(month, day)].orEmpty()
    fun movable(key: MovableCelebration): List<Celebration> = movableByKey[key].orEmpty()

}
