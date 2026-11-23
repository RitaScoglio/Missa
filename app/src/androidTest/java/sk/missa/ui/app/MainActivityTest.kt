package sk.missa.ui.app

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.MainActivity
import sk.missa.calendar.LiturgicalDate
import sk.missa.settings.AppPreferences
import sk.missa.settings.AppSettings
import sk.missa.ui.navigation.AppDestination
import sk.missa.ui.navigation.Screen

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    private lateinit var previousSettings: AppSettings

    @org.junit.Before
    fun isolatePreferences() {
        val context = ApplicationProvider.getApplicationContext<android.content.Context>()
        previousSettings = sk.missa.settings.AppPreferences(context).read(false)
        context.getSharedPreferences("reader", android.content.Context.MODE_PRIVATE).edit().clear().commit()
    }

    @org.junit.After
    fun restorePreferences() {
        sk.missa.settings.AppPreferences(ApplicationProvider.getApplicationContext()).write(previousSettings)
    }

    @Test
    fun todayOpensMassWithLabeledNavigationAndPrayerSelectionRequiresConfirmation() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            await(scenario) { !it.loading }
            scenario.onActivity { activity ->
                val model = ViewModelProvider(activity)[AppViewModel::class.java]
                model.selectDate(LiturgicalDate.of(2026, 11, 16))
            }
            await(scenario) { !it.loading && it.selectedDate == LiturgicalDate.of(2026, 11, 16) }
            scenario.onActivity { activity ->
                assertEquals(5, descendants(activity.window.decorView).count { it.isClickable && it.contentDescription in AppDestination.entries.map { destination -> destination.title } })
                assertTrue(descendants(activity.window.decorView).filterIsInstance<TextView>().any { it.text == "Kalendár" })
                val model = ViewModelProvider(activity)[AppViewModel::class.java]
                val first = model.state.value.days.first().celebrations.first()
                val views = arrayListOf<View>()
                activity.window.decorView.findViewsWithText(views, "16. 11. 2026: ${first.title}", View.FIND_VIEWS_WITH_CONTENT_DESCRIPTION)
                views.first().performClick()
            }
            await(scenario) { !it.loading && it.screen == Screen.MASS }
            onView(withContentDescription("Eucharistická modlitba")).perform(click())
            onView(withText("1. eucharistická modlitba")).perform(click())
            scenario.onActivity { activity ->
                val model = ViewModelProvider(activity)[AppViewModel::class.java]
                val saved = android.os.Bundle(); model.save(saved)
                assertEquals("ep002", saved.getString("prayer"))
                assertTrue(model.state.value.dialog!!.confirm)
            }
            onView(withText("Zrušiť")).perform(click())
            onView(withContentDescription("Eucharistická modlitba")).perform(click())
            onView(withText("1. eucharistická modlitba")).perform(click())
            onView(withText("OK")).perform(click())
            await(scenario) { !it.loading && it.dialog == null }
            scenario.recreate()
            await(scenario) { !it.loading && it.screen == Screen.MASS }
            scenario.onActivity { activity ->
                val saved = android.os.Bundle(); ViewModelProvider(activity)[AppViewModel::class.java].save(saved)
                assertEquals("ep003", saved.getString("prayer"))
                assertFalse(descendants(activity.window.decorView).any { it.contentDescription == "Dnes" })
            }
            onView(withContentDescription("Skryť možnosti omše")).perform(click())
            onView(withContentDescription("Zobraziť možnosti omše")).perform(click())
            pressBack()
            await(scenario) { !it.loading && it.screen == Screen.HOME }
        }
    }

    @Test
    fun drawerAndLabeledNavigationKeepLanguageWorkflowAndMassAvailability() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            await(scenario) { !it.loading }
            onView(withContentDescription("Otvoriť menu")).perform(click())
            onView(withText("Typ písma")).check(matches(isDisplayed()))
            scenario.onActivity { assertEquals(Screen.HOME, ViewModelProvider(it)[AppViewModel::class.java].state.value.screen) }
            pressBack()
            onView(withContentDescription("Jazyky")).perform(click())
            await(scenario) { !it.loading && it.screen == Screen.LANGUAGES }
            scenario.onActivity {
                assertEquals(listOf("Anglicky", "Francúzsky", "Chorvatsky", "Latinsky", "Maďarsky", "Nemecky", "Poľsky", "Španielsky", "Taliansky"), ViewModelProvider(it)[AppViewModel::class.java].state.value.entries.map { entry -> entry.title })
            }
            onView(withText("Anglicky")).check(androidx.test.espresso.assertion.ViewAssertions.doesNotExist())
            onView(withContentDescription("Zmeniť jazyk odpovedí")).perform(click())
            onView(withText("Anglicky")).perform(click())
            await(scenario) { !it.loading && it.screen == Screen.MASS }
            onView(withContentDescription("Jazyky")).check(androidx.test.espresso.assertion.ViewAssertions.doesNotExist())
            onView(withContentDescription("Späť na vybranú omšu")).check(matches(isDisplayed()))
            onView(withContentDescription("Zmeniť jazyk odpovedí")).perform(click())
            onView(withText("Francúzsky")).check(matches(isDisplayed()))
            scenario.onActivity { assertEquals(Screen.MASS, ViewModelProvider(it)[AppViewModel::class.java].state.value.screen) }
            pressBack()
            pressBack()
            await(scenario) { !it.loading && it.screen == Screen.LANGUAGES }
            pressBack()
            await(scenario) { !it.loading && it.screen == Screen.HOME }
            scenario.onActivity { ViewModelProvider(it)[AppViewModel::class.java].selectDate(LiturgicalDate.of(2026, 11, 15)) }
            await(scenario) { !it.loading }
            onView(withContentDescription("Špeciálne omše")).perform(click())
            await(scenario) { !it.loading && it.screen == Screen.SPECIAL_MASSES }
            onView(withText("Omša za zmierenie")).perform(click())
            scenario.onActivity {
                val model = ViewModelProvider(it)[AppViewModel::class.java]
                assertEquals(Screen.SPECIAL_MASSES, model.state.value.screen)
                assertFalse(model.entryAvailable("om004"))
                assertNull(model.state.value.error)
            }
            onView(withContentDescription("Špeciálne omše")).perform(click())
            await(scenario) { !it.loading && it.screen == Screen.SPECIAL_MASSES }
            scenario.onActivity {
                val entries = ViewModelProvider(it)[AppViewModel::class.java].state.value.entries
                assertEquals(6, entries.size)
                assertEquals("Omša za zmierenie", entries.first().title)
                assertEquals("Omše na Svätý rok 2025", entries.last().title)
            }
            pressBack()
            await(scenario) { !it.loading && it.screen == Screen.HOME }
        }
    }

    @Test
    fun blessingsOpenDirectlyAndSundayGloriaAndCreedRemainPopups() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            await(scenario) { !it.loading }
            onView(withContentDescription("Požehnania")).perform(click())
            await(scenario) { !it.loading && it.screen == Screen.BLESSINGS }
            onView(withText("Požehnanie detí")).perform(click())
            await(scenario) { !it.loading && it.screen == Screen.MASS }
            pressBack()
            await(scenario) { !it.loading && it.screen == Screen.BLESSINGS }
            scenario.onActivity { activity ->
                val model = ViewModelProvider(activity)[AppViewModel::class.java]
                assertTrue(model.state.value.entries.first().heading)
                model.openCelebration(LiturgicalDate.of(2026, 11, 15), "")
            }
            await(scenario) { !it.loading && it.screen == Screen.MASS }
            onView(withText("Glória (otvoriť)")).perform(scrollTo(), click())
            pressBack()
            onView(withText("Krédo (otvoriť)")).perform(scrollTo(), click())
            pressBack()
            scenario.onActivity { activity ->
                val blocks = ViewModelProvider(activity)[AppViewModel::class.java].state.value.blocks
                assertTrue(blocks.any { it["type"] == "POPUP" && it["contentId"] == "od103" })
                assertTrue(blocks.any { it["type"] == "POPUP" && it["contentId"] == "od104" })
                val model = ViewModelProvider(activity)[AppViewModel::class.java]
                model.destination(AppDestination.CALENDAR)
                model.selectDate(LiturgicalDate.of(2026, 4, 4))
            }
            await(scenario) { !it.loading && it.screen == Screen.CALENDAR && it.calendarMonth?.month == 4 }
            scenario.onActivity { activity ->
                val model = ViewModelProvider(activity)[AppViewModel::class.java]
                val day = model.state.value.days.single { it.date == LiturgicalDate.of(2026, 4, 4) }
                val vigil = day.celebrations.single { it.title == "Veľkonočná vigília" }
                assertTrue(day.celebrations.any { it.title.startsWith("Vyloženie Oltárnej sviatosti") })
                model.openCelebration(day.date, vigil.id)
            }
            await(scenario) { !it.loading && it.screen == Screen.MASS }
            scenario.onActivity { activity ->
                val model = ViewModelProvider(activity)[AppViewModel::class.java]
                assertNull(model.state.value.error)
                assertEquals("tr001", model.state.value.resourceId)
                assertTrue(model.settings.evening)
                model.back()
            }
            await(scenario) { !it.loading && it.screen == Screen.CALENDAR }
            scenario.onActivity { assertFalse(ViewModelProvider(it)[AppViewModel::class.java].settings.evening) }
        }
    }

    private fun descendants(view: View): List<View> = listOf(view) + if (view is ViewGroup) (0 until view.childCount).flatMap { descendants(view.getChildAt(it)) } else emptyList()

    private fun await(scenario: ActivityScenario<MainActivity>, ready: (AppUiState) -> Boolean) {
        val deadline = System.nanoTime() + 60_000_000_000L
        while (System.nanoTime() < deadline) {
            var done = false
            scenario.onActivity { done = ready(ViewModelProvider(it)[AppViewModel::class.java].state.value) }
            if (done) return
            Thread.sleep(100)
        }
        fail("Application did not reach the expected screen")
    }
}
