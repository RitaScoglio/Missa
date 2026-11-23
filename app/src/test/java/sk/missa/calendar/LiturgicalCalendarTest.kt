package sk.missa.calendar

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import sk.missa.calendar.celebration.Celebration
import sk.missa.calendar.celebration.CelebrationCatalog
import sk.missa.calendar.celebration.CelebrationDate
import sk.missa.calendar.celebration.CelebrationId
import sk.missa.calendar.celebration.CelebrationProperty
import sk.missa.calendar.celebration.CelebrationRank
import sk.missa.calendar.celebration.LiturgicalColor
import sk.missa.calendar.celebration.MonthDay
import sk.missa.calendar.celebration.MovableCelebration

class LiturgicalCalendarTest {
    @Test
    fun identifiesPentecostFromEasterRule() {
        val resolver = LiturgicalCalendar(CelebrationCatalog(emptyList()))

        val day = resolver.resolve(LiturgicalDate.of(2026, 5, 24))

        assertEquals(LiturgicalSeason.EASTER, day.season)
    }

    @Test
    fun resolvesEachDayOfLeapYear() {
        val resolver = LiturgicalCalendar(CelebrationCatalog(emptyList()))
        val first = LiturgicalDate.of(2024, 1, 1)
        val calendar = (0 until 366).map { resolver.resolve(first.plusDays(it)) }

        assertEquals(366, calendar.size)
        assertEquals(LiturgicalDate.of(2024, 1, 1), calendar.first().date)
        assertEquals(LiturgicalDate.of(2024, 12, 31), calendar.last().date)
    }

    @Test
    fun doesNotApplyEasterWeekObservancesOutsideEasterSeason() {
        val day = LiturgicalCalendar(CelebrationCatalog(emptyList())).resolve(LiturgicalDate.of(2026, 1, 12))

        assertEquals(emptyList<GeneratedObservance>(), day.generatedObservances)
    }

    @Test
    fun ordinaryTimeStartsAfterTheBaptismOfTheLord() {
        val year = LiturgicalYear.of(2026)
        assertEquals(LiturgicalDate.of(2026, 1, 11), year.baptismOfTheLord)
        assertEquals(LiturgicalSeason.CHRISTMAS, year.season(year.baptismOfTheLord))
        assertEquals(LiturgicalSeason.ORDINARY_TIME, year.season(year.baptismOfTheLord.plusDays(1)))
        assertTrue(year.baseObservance(LiturgicalDate.of(2026, 1, 18)).title.startsWith("2. nedeľa"))
    }

    @Test
    fun ordinaryWeekAfterPentecostUsesTheAdventBoundary() {
        val year = LiturgicalYear.of(2024)
        assertTrue(year.baseObservance(LiturgicalDate.of(2024, 5, 21)).title.contains("7. týždňa"))
        assertTrue(year.baseObservance(LiturgicalDate.of(2024, 5, 27)).title.contains("8. týždňa"))
        assertTrue(year.baseObservance(LiturgicalDate.of(2024, 11, 30)).title.contains("34. týždňa"))
        val leapYear = LiturgicalYear.of(2028)
        assertEquals(34, leapYear.ordinaryContext(LiturgicalDate.of(2028, 11, 26))?.week)
        for (day in 1..30) {
            assertTrue(leapYear.ordinaryContext(LiturgicalDate.of(2028, 11, day))!!.week in 1..34)
        }
    }

    @Test
    fun startsAdventOnTheFourthSundayBeforeChristmas() {
        val context = LiturgicalYear.of(2022)

        assertEquals(LiturgicalDate.of(2022, 11, 27), context.adventStart)
        assertEquals(LiturgicalColor.VIOLET, context.baseObservance(context.adventStart).color)
    }

    @Test
    fun suppressesMemorialOnSundayButKeepsSundayCelebration() {
        val memorial = celebration("memorial", CelebrationRank.MEMORIAL)
        val sundayFeast = celebration(
            "sunday-feast",
            CelebrationRank.FEAST,
            setOf(CelebrationProperty.CELEBRATED_ON_SUNDAY),
        )
        val resolver = LiturgicalCalendar(CelebrationCatalog(listOf(memorial, sundayFeast)))

        val day = resolver.resolve(LiturgicalDate.of(2026, 1, 4))

        assertEquals(sundayFeast, day.primaryCelebration)
        assertEquals(listOf(memorial), day.suppressedCelebrations)
        assertNull(day.alternatives.singleOrNull())
    }

    @Test
    fun exposesTriduumCompanionObservances() {
        val resolver = LiturgicalCalendar(CelebrationCatalog(emptyList()))

        val day = resolver.resolve(LiturgicalDate.of(2026, 4, 3))

        assertEquals("Piatok utrpenia Pána", day.base.title)
        assertEquals(true, day.generatedObservances.any { it.id == "altar-reservation" })
    }

    @Test
    fun movesNitraCathedralDedicationFromSundayToMonday() {
        val celebration = Celebration(
            id = CelebrationId("nitra-cathedral"),
            title = "Nitra cathedral dedication",
            date = CelebrationDate.Movable(MovableCelebration.NITRA_CATHEDRAL_DEDICATION),
            rank = CelebrationRank.FEAST,
            color = LiturgicalColor.WHITE,
        )
        val resolver = LiturgicalCalendar(CelebrationCatalog(listOf(celebration)))

        val sunday = resolver.resolve(LiturgicalDate.of(2022, 11, 20))
        val monday = resolver.resolve(LiturgicalDate.of(2022, 11, 21))

        assertNull(sunday.primaryCelebration)
        assertEquals(celebration, monday.primaryCelebration)
    }

    @Test
    fun keepsLentenMemorialAsAnAlternativeToTheFeria() {
        val memorial = celebration("lenten-memorial", CelebrationRank.MEMORIAL).copy(
            date = CelebrationDate.Fixed(MonthDay(3, 4)),
        )
        val resolver = LiturgicalCalendar(CelebrationCatalog(listOf(memorial)))

        val day = resolver.resolve(LiturgicalDate.of(2026, 3, 4))

        assertNull(day.primaryCelebration)
        assertEquals(listOf(memorial), day.alternatives)
    }

    private fun celebration(
        id: String,
        rank: CelebrationRank,
        properties: Set<CelebrationProperty> = emptySet(),
    ) = Celebration(
        id = CelebrationId(id),
        title = id,
        date = CelebrationDate.Fixed(MonthDay(1, 4)),
        rank = rank,
        color = LiturgicalColor.WHITE,
        properties = properties,
    )
}
