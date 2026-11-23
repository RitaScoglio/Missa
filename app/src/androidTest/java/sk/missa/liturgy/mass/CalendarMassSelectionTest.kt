package sk.missa.liturgy.mass

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.calendar.LiturgicalCalendar
import sk.missa.calendar.LiturgicalDate
import sk.missa.calendar.celebration.DatasetCelebrationCatalog
import sk.missa.data.assets.DatasetAssets

@RunWith(AndroidJUnit4::class)
class CalendarMassSelectionTest {
    private val items by lazy { DatasetAssets.read(ApplicationProvider.getApplicationContext<Context>().assets) }
    private val calendar by lazy { LiturgicalCalendar(DatasetCelebrationCatalog.fromItems(items)) }

    @Test
    fun calendarCoordinatesSelectBothCycleFamilies() {
        val selector = CalendarMassSelection(items)
        for (year in 2022..2027) {
            for (date in listOf(LiturgicalDate.of(year, 2, 1), LiturgicalDate.of(year, 12, 20))) {
                val selection = selector.select(calendar.resolve(date), celebrationId = null)
                val owner = items.single { it.id == selection.seasonalMassId }
                val descriptor = owner.fields["liturgicalDay"] as Map<*, *>
                assertEquals(calendar.resolve(date).season.name, descriptor["season"])
                MassContentResolver(items).resolve(selection)
            }
        }
    }

    @Test
    fun calendarAlternativesSelectLentenCollectAndSeasonalRemainder() {
        val adapter = CalendarMassSelection(items)
        val resolver = MassContentResolver(items)
        for ((year, variant) in listOf(2023 to "LENT", 2024 to "LENT_WEEK_5")) {
            val day = calendar.resolve(LiturgicalDate.of(year, 3, 23))
            val selection = adapter.select(day, "c042")
            assertEquals(variant, selection.properVariant)
            assertEquals(MassContentResolver.OrationUse.PROPER_COLLECT_WITH_SEASONAL_REMAINDER, selection.orationUse)
            val content = resolver.resolve(selection)
            val seasonal = resolver.resolve(selection.copy(properId = null, properVariant = null, orationUse = MassContentResolver.OrationUse.STANDARD))
            assertEquals(seasonal.orations["overOfferings"], content.orations["overOfferings"])
            assertEquals(seasonal.orations["afterCommunion"], content.orations["afterCommunion"])
        }
    }

    @Test
    fun unavailableCelebrationCannotBeInjectedIntoTheDay() {
        val day = calendar.resolve(LiturgicalDate.of(2026, 11, 4))
        assertThrows(IllegalArgumentException::class.java) { CalendarMassSelection(items).select(day, "c042") }
    }
}
