package sk.missa.ui.app

import androidx.lifecycle.ViewModelProvider
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.GeneralSwipeAction
import androidx.test.espresso.action.Press
import androidx.test.espresso.action.Swipe
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.doubleClick
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.MainActivity
import sk.missa.R
import sk.missa.calendar.LiturgicalDate
import sk.missa.ui.calendar.CalendarPresentation
import sk.missa.ui.navigation.AppDestination
import sk.missa.ui.navigation.Screen

@RunWith(AndroidJUnit4::class)
class AppMenuInteractionTest {
    @Test
    fun readerStaysAwakeAndDoubleTapTogglesFullscreenWithoutChangingMass() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            await(scenario) { !it.loading }
            var fullscreen = false
            var fontSize = 16
            scenario.onActivity {
                val model = ViewModelProvider(it)[AppViewModel::class.java]
                fullscreen = model.settings.fullscreen
                fontSize = model.settings.fontSize
                model.selectDate(sk.missa.calendar.LiturgicalDate.of(2026, 11, 16))
                model.openCelebration(model.selectedDate, "")
            }
            await(scenario) { !it.loading && it.screen == Screen.MASS }
            try {
                scenario.onActivity { assertTrue(it.findViewById<android.view.ViewGroup>(android.R.id.content).getChildAt(0).keepScreenOn) }
                for (size in listOf(12, 24, 36)) {
                    scenario.onActivity {
                        val model = ViewModelProvider(it)[AppViewModel::class.java]
                        model.applySettings(model.settings.copy(fontSize = size))
                    }
                    await(scenario) { !it.loading && it.settings.fontSize == size }
                    onView(withContentDescription("Eucharistická modlitba")).check { view, error ->
                        if (error != null) throw error
                        val text = view as android.widget.TextView
                        val expectedSize = android.util.TypedValue.applyDimension(android.util.TypedValue.COMPLEX_UNIT_SP, size.toFloat(), text.resources.displayMetrics)
                        assertEquals(expectedSize, text.textSize, 0.1f)
                        assertTrue("Mass option is clipped at $size sp", text.layout.height <= text.height - text.compoundPaddingTop - text.compoundPaddingBottom)
                    }.perform(click())
                    await(scenario) { it.dialog != null }
                    pressBack()
                    await(scenario) { it.dialog == null }
                }
                scenario.onActivity {
                    val model = ViewModelProvider(it)[AppViewModel::class.java]
                    model.applySettings(model.settings.copy(fontSize = fontSize))
                }
                await(scenario) { !it.loading && it.settings.fontSize == fontSize }
                onView(withText("ÚVODNÝ SPEV")).perform(scrollTo(), doubleClick())
                await(scenario) { it.settings.fullscreen != fullscreen }
                scenario.recreate()
                await(scenario) { !it.loading && it.settings.fullscreen != fullscreen }
                scenario.onActivity {
                    val model = ViewModelProvider(it)[AppViewModel::class.java]
                    assertEquals(sk.missa.calendar.LiturgicalDate.of(2026, 11, 16), model.selectedDate)
                    model.destination(AppDestination.CALENDAR)
                }
                await(scenario) { !it.loading && it.screen == Screen.CALENDAR }
                scenario.onActivity { assertFalse(it.findViewById<android.view.ViewGroup>(android.R.id.content).getChildAt(0).keepScreenOn) }
            } finally {
                scenario.onActivity { val model = ViewModelProvider(it)[AppViewModel::class.java]; model.applySettings(model.settings.copy(fullscreen = fullscreen, fontSize = fontSize)) }
            }
        }
    }

    @Test
    fun bottomButtonsNavigateAndRightSwipeOpensDrawerWithoutLosingPage() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            await(scenario) { !it.loading }
            for (destination in AppDestination.entries) {
                onView(withContentDescription(destination.title)).perform(click())
                await(scenario) { !it.loading && it.screen == destination.screen }
            }
            onView(isRoot()).perform(GeneralSwipeAction(Swipe.FAST,
                { view -> intArrayOf(0, 0).let { view.getLocationOnScreen(it); floatArrayOf(it[0] + 2f, it[1] + view.height * 0.5f) } },
                { view -> intArrayOf(0, 0).let { view.getLocationOnScreen(it); floatArrayOf(it[0] + view.width * 0.8f, it[1] + view.height * 0.5f) } },
                Press.FINGER))
            await(scenario) { it.drawerOpen }
            onView(withText("Tiché modlitby kňaza")).perform(scrollTo())
            pressBack()
            await(scenario) { !it.drawerOpen }
            scenario.onActivity { assertEquals(Screen.LANGUAGES, ViewModelProvider(it)[AppViewModel::class.java].state.value.screen) }
        }
    }

    @Test
    fun calendarBodySwipesChangeMonthAndMenuButtonOpensDrawer() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            await(scenario) { !it.loading }
            onView(withContentDescription("Kalendár")).perform(click())
            await(scenario) { !it.loading && it.screen == Screen.CALENDAR }
            lateinit var first: sk.missa.calendar.LiturgicalDate
            scenario.onActivity { first = requireNotNull(ViewModelProvider(it)[AppViewModel::class.java].state.value.calendarMonth) }
            onView(isRoot()).perform(GeneralSwipeAction(Swipe.FAST,
                { view -> intArrayOf(0, 0).let { view.getLocationOnScreen(it); floatArrayOf(it[0] + view.width * 0.75f, it[1] + view.height * 0.5f) } },
                { view -> intArrayOf(0, 0).let { view.getLocationOnScreen(it); floatArrayOf(it[0] + view.width * 0.25f, it[1] + view.height * 0.5f) } },
                Press.FINGER))
            await(scenario) { !it.loading && it.calendarMonth == CalendarPresentation.shiftMonth(first, 1) }
            onView(withContentDescription("Predchádzajúci mesiac")).perform(click())
            await(scenario) { !it.loading && it.calendarMonth == first }
            onView(withContentDescription("Nasledujúci mesiac")).perform(click())
            await(scenario) { !it.loading && it.calendarMonth == CalendarPresentation.shiftMonth(first, 1) }
            onView(withContentDescription("Otvoriť menu")).perform(click())
            await(scenario) { it.drawerOpen }
            pressBack()
            await(scenario) { !it.drawerOpen }
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
        fail("Menu state did not become ready")
    }
}
