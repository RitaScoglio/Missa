package sk.missa.ui.app

import android.app.Application
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.MainActivity
import sk.missa.calendar.LiturgicalDate
import sk.missa.settings.AppSettings
import sk.missa.ui.calendar.CelebrationRow
import sk.missa.ui.navigation.AppDestination
import sk.missa.ui.navigation.Screen

@RunWith(AndroidJUnit4::class)
class AppScreensTest {
    @Test
    fun monthSelectionOpensChosenCelebrationAndBackRetainsBrowsedMonth() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            await(scenario) { !it.loading }
            scenario.onActivity {
                val model = ViewModelProvider(it)[AppViewModel::class.java]
                model.selectDate(LiturgicalDate.of(2026, 12, 1))
                model.destination(AppDestination.CALENDAR)
                model.moveMonth(-1)
            }
            await(scenario) { !it.loading && it.days.size == 30 }
            lateinit var chosen: CelebrationRow
            scenario.onActivity {
                val model = ViewModelProvider(it)[AppViewModel::class.java]
                val day = model.state.value.days.first { row -> row.celebrations.any { celebration -> celebration.id.isNotEmpty() } }
                chosen = day.celebrations.first { celebration -> celebration.id.isNotEmpty() }
                model.openCelebration(day.date, chosen.id)
            }
            await(scenario) { !it.loading && it.screen == Screen.MASS }
            scenario.onActivity {
                val model = ViewModelProvider(it)[AppViewModel::class.java]
                assertNull(model.state.value.error)
                assertEquals(chosen.title, model.state.value.title)
                model.drawer(true)
                assertTrue(model.back())
                assertFalse(model.state.value.drawerOpen)
                assertEquals(Screen.MASS, model.state.value.screen)
                model.back()
            }
            await(scenario) { !it.loading && it.screen == Screen.CALENDAR }
            scenario.onActivity {
                assertEquals(LiturgicalDate.of(2026, 11, 1), ViewModelProvider(it)[AppViewModel::class.java].state.value.calendarMonth)
            }
        }
    }

    @Test
    fun allBottomDestinationsOpenTheirContentAndReturnFromReader() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            await(scenario) { !it.loading }
            for (destination in listOf(AppDestination.SPECIAL_MASSES, AppDestination.BLESSINGS, AppDestination.LANGUAGES)) {
                scenario.onActivity {
                    val model = ViewModelProvider(it)[AppViewModel::class.java]
                    model.selectDate(LiturgicalDate.of(2026, 11, 16))
                    model.destination(destination)
                }
                await(scenario) { !it.loading && it.screen == destination.screen }
                scenario.onActivity {
                    val model = ViewModelProvider(it)[AppViewModel::class.java]
                    assertTrue(model.state.value.entries.isNotEmpty())
                    model.openEntry(model.state.value.entries.first { entry -> !entry.heading }.id)
                }
                await(scenario) { !it.loading && it.screen == Screen.MASS }
                scenario.onActivity {
                    val model = ViewModelProvider(it)[AppViewModel::class.java]
                    assertNull(model.state.value.error)
                    assertTrue(model.state.value.blocks.isNotEmpty())
                    model.back()
                }
                await(scenario) { !it.loading && it.screen == destination.screen }
            }
        }
    }

    @Test
    fun preferencesSurviveFreshViewModelAndSavedStateRestoresMassChoices() {
        val application = ApplicationProvider.getApplicationContext<Application>()
        val store = ViewModelStore()
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            await(scenario) { !it.loading }
            lateinit var previous: AppSettings
            scenario.onActivity {
                val model = ViewModelProvider(it)[AppViewModel::class.java]
                previous = model.settings
                model.applySettings(previous.copy(serif = true, fontSize = 24, quietPrayers = true, boldText = true))
                model.selectDate(LiturgicalDate.of(2026, 4, 4))
                model.openCelebration(model.selectedDate, "tr001")
            }
            await(scenario) { !it.loading && it.screen == Screen.MASS }
            try {
                scenario.onActivity {
                    val model = ViewModelProvider(it)[AppViewModel::class.java]
                    assertNull(model.state.value.error)
                    val saved = Bundle()
                    model.save(saved)
                    val restored = ViewModelProvider(store, ViewModelProvider.AndroidViewModelFactory.getInstance(application))[AppViewModel::class.java]
                    restored.start(saved, false)
                    assertEquals(model.settings, restored.settings)
                    assertEquals(model.selectedDate, restored.selectedDate)
                    assertEquals(Screen.MASS, restored.state.value.screen)
                    val freshStore = ViewModelStore()
                    try {
                        val fresh = ViewModelProvider(freshStore, ViewModelProvider.AndroidViewModelFactory.getInstance(application))[AppViewModel::class.java]
                        fresh.start(null, false)
                        assertEquals(previous.copy(serif = true, fontSize = 24, quietPrayers = true, boldText = true), fresh.settings)
                    } finally { freshStore.clear() }
                }
            } finally {
                scenario.onActivity { ViewModelProvider(it)[AppViewModel::class.java].applySettings(previous); store.clear() }
            }
        }
    }

    private fun await(scenario: ActivityScenario<MainActivity>, ready: (AppUiState) -> Boolean) {
        val deadline = System.nanoTime() + 60_000_000_000L
        while (System.nanoTime() < deadline) {
            var done = false
            scenario.onActivity { done = ready(ViewModelProvider(it)[AppViewModel::class.java].state.value) }
            if (done) return
            Thread.sleep(100)
        }
        fail("Screen state did not become ready")
    }
}
