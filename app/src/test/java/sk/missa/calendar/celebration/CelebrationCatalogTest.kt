package sk.missa.calendar.celebration

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class CelebrationCatalogTest {
    @Test
    fun indexesFixedAndMovableCelebrations() {
        val fixed = Celebration(
            id = CelebrationId("mary-mother-of-god"),
            title = "Slávnosť Panny Márie Bohorodičky",
            date = CelebrationDate.Fixed(MonthDay(1, 1)),
            rank = CelebrationRank.SOLEMNITY,
            color = LiturgicalColor.WHITE,
        )
        val movable = fixed.copy(
            id = CelebrationId("pentecost"),
            date = CelebrationDate.Movable(MovableCelebration.PENTECOST),
        )

        val catalog = CelebrationCatalog(listOf(fixed, movable))

        assertEquals(listOf(fixed), catalog.fixedOn(1, 1))
        assertEquals(listOf(movable), catalog.movable(MovableCelebration.PENTECOST))
    }

    @Test
    fun rejectsDuplicateCelebrationIds() {
        val celebration = Celebration(
            id = CelebrationId("cyril-and-methodius-vigil"),
            title = "Sv. Cyrila a Metoda",
            date = CelebrationDate.Fixed(MonthDay(7, 4)),
            rank = CelebrationRank.VIGIL,
            color = LiturgicalColor.WHITE,
        )

        assertThrows(IllegalArgumentException::class.java) {
            CelebrationCatalog(listOf(celebration, celebration))
        }
    }
}
