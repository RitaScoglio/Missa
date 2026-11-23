package sk.missa.ui.app

import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.matcher.RootMatchers.isDialog
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.allOf
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.MainActivity
import sk.missa.ui.navigation.AppDestination
import sk.missa.ui.navigation.Screen

@RunWith(AndroidJUnit4::class)
class GlobalTextSizeTest {
    @Test
    fun textSizeAppliesToTodayCalendarAndCollections() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            await(scenario) { !it.loading }
            lateinit var previous: sk.missa.settings.AppSettings
            scenario.onActivity { previous = model(it).settings }
            try {
                for (size in listOf(12, 24, 36)) {
                    scenario.onActivity {
                        model(it).applySettings(model(it).settings.copy(fontSize = size))
                        model(it).destination(AppDestination.TODAY)
                    }
                    await(scenario) { !it.loading && it.screen == Screen.HOME && it.settings.fontSize == size }
                    lateinit var title: String
                    scenario.onActivity { title = model(it).state.value.days.single().celebrations.first().title }
                    onView(withText(title)).check(textSize(size.toFloat()))
                    onView(withText("Missa")).check(textSize(size * 1.5f))
                    onView(withContentDescription("Kalendár")).perform(click())
                    await(scenario) { !it.loading && it.screen == Screen.CALENDAR }
                    lateinit var card: String
                    scenario.onActivity {
                        val day = model(it).state.value.days.first()
                        title = day.celebrations.first().title
                        card = "${day.date.dayOfMonth}. ${day.date.month}. ${day.date.year}: $title"
                    }
                    onView(allOf(withText(title), isDescendantOfA(withContentDescription(card))))
                        .check(textSize(size.toFloat()))
                    for (destination in listOf(AppDestination.SPECIAL_MASSES, AppDestination.BLESSINGS)) {
                        onView(withContentDescription(destination.title)).perform(click())
                        await(scenario) { !it.loading && it.screen == destination.screen }
                        scenario.onActivity { title = model(it).state.value.entries.first { entry -> !entry.heading }.title }
                        onView(withText(title)).check(textSize(size.toFloat()))
                    }
                }
            } finally {
                scenario.onActivity { model(it).applySettings(previous) }
            }
        }
    }

    @Test
    fun largeTextSurvivesRecreationAndFitsMenusAndDialogs() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            await(scenario) { !it.loading }
            lateinit var previous: sk.missa.settings.AppSettings
            scenario.onActivity {
                previous = model(it).settings
                model(it).applySettings(previous.copy(fontSize = 36))
            }
            try {
                await(scenario) { !it.loading && it.settings.fontSize == 36 }
                scenario.recreate()
                await(scenario) { !it.loading && it.settings.fontSize == 36 }
                onView(withContentDescription("Otvoriť menu")).perform(click())
                onView(withText("Typ písma")).check(textSize(33.75f)).perform(click())
                onView(withText("Pätkové")).inRoot(isDialog()).check(textSize(36f))
                onView(withText("Bezpätkové")).inRoot(isDialog()).check(textSize(36f))
                onView(withText("Zrušiť")).inRoot(isDialog()).check(textSize(31.5f)).perform(click())
                onView(withContentDescription("Otvoriť menu")).perform(click())
                onView(withText("O aplikacii")).perform(scrollTo(), click())
                onView(withText("O aplikácii")).inRoot(isDialog()).check(textSize(45f))
                onView(withText("Zrušiť")).inRoot(isDialog()).check(textSize(31.5f)).perform(click())
            } finally {
                scenario.onActivity { model(it).applySettings(previous) }
            }
        }
    }

    private fun model(activity: MainActivity) = ViewModelProvider(activity)[AppViewModel::class.java]

    private fun textSize(expectedSp: Float) = ViewAssertion { view, error ->
        if (error != null) throw error
        val text = view as TextView
        val pixels = android.util.TypedValue.applyDimension(android.util.TypedValue.COMPLEX_UNIT_SP, expectedSp, text.resources.displayMetrics)
        assertEquals(text.text.toString(), pixels, text.textSize, 0.1f)
        assertTrue("${text.text} is clipped", text.layout.height <= text.height - text.compoundPaddingTop - text.compoundPaddingBottom)
    }

    private fun await(scenario: ActivityScenario<MainActivity>, ready: (AppUiState) -> Boolean) {
        val deadline = System.nanoTime() + 60_000_000_000L
        while (System.nanoTime() < deadline) {
            var done = false
            scenario.onActivity { done = ready(model(it).state.value) }
            if (done) {
                androidx.test.platform.app.InstrumentationRegistry.getInstrumentation().waitForIdleSync()
                return
            }
            Thread.sleep(100)
        }
        fail("Screen did not become ready")
    }
}
