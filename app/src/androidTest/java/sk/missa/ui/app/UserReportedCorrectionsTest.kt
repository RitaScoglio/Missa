package sk.missa.ui.app

import android.content.Intent
import android.os.SystemClock
import androidx.lifecycle.ViewModelProvider
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.RootMatchers.isDialog
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.MainActivity
import sk.missa.calendar.LiturgicalDate
import sk.missa.data.assets.DatasetAssets
import sk.missa.settings.AppPreferences
import sk.missa.settings.AppSettings
import sk.missa.ui.navigation.AppDestination
import sk.missa.ui.navigation.Screen

@RunWith(AndroidJUnit4::class)
class UserReportedCorrectionsTest {
    private lateinit var previousSettings: AppSettings

    @org.junit.Before
    fun rememberSettings() {
        previousSettings = sk.missa.settings.AppPreferences(androidx.test.core.app.ApplicationProvider.getApplicationContext()).read(false)
    }

    @org.junit.After
    fun restoreSettings() {
        sk.missa.settings.AppPreferences(androidx.test.core.app.ApplicationProvider.getApplicationContext()).write(previousSettings)
    }

    @Test
    fun onlyMissaAppearsInTheLauncherAndFontChangesCanBeCancelled() {
        val started = SystemClock.elapsedRealtime()
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            await(scenario) { !it.loading }
            android.util.Log.i("MissaStartupTest", "Reader ready in ${SystemClock.elapsedRealtime() - started} ms")
            lateinit var previous: AppSettings
            scenario.onActivity { activity ->
                previous = ViewModelProvider(activity)[AppViewModel::class.java].settings
                val intent = Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_LAUNCHER).setPackage(activity.packageName)
                @Suppress("DEPRECATION")
                val launchers = activity.packageManager.queryIntentActivities(intent, 0)
                assertEquals(listOf(MainActivity::class.java.name), launchers.map { it.activityInfo.name })
                assertThrows(android.content.pm.PackageManager.NameNotFoundException::class.java) {
                    @Suppress("DEPRECATION")
                    activity.packageManager.getActivityInfo(android.content.ComponentName(activity.packageName, "sk.missa.DatasetBrowserActivity"), 0)
                }
            }
            try {
                onView(withContentDescription("Otvoriť menu")).perform(click())
                await(scenario) { it.drawerOpen }
                onView(withText("Typ písma")).perform(click())
                onView(withText("Zrušiť")).inRoot(isDialog()).check(matches(isDisplayed()))
                for ((label, family) in listOf("Pätkové" to "serif", "Bezpätkové" to "sans-serif")) {
                    onView(withText(label)).inRoot(isDialog()).check { view, error ->
                        if (error != null) throw error
                        val text = view as android.widget.TextView
                        assertEquals(android.graphics.Typeface.create(family, android.graphics.Typeface.NORMAL), text.typeface)
                        assertTrue("$label is clipped", text.layout.height <= text.height - text.compoundPaddingTop - text.compoundPaddingBottom)
                    }
                }
                onView(isRoot()).inRoot(isDialog()).check { view, error ->
                    if (error != null) throw error
                    val density = view.resources.displayMetrics.density
                    assertTrue(view.width >= minOf((320 * density).toInt(), view.resources.displayMetrics.widthPixels - (32 * density).toInt()))
                }
                onView(withText(if (previous.serif) "Bezpätkové" else "Pätkové")).inRoot(isDialog()).perform(click())
                onView(withText("Zrušiť")).inRoot(isDialog()).perform(click())
                scenario.onActivity { assertEquals(previous.serif, ViewModelProvider(it)[AppViewModel::class.java].settings.serif) }
                onView(withContentDescription("Otvoriť menu")).perform(click())
                await(scenario) { it.drawerOpen }
                onView(withText("Typ písma")).perform(click())
                onView(withText(if (previous.serif) "Bezpätkové" else "Pätkové")).inRoot(isDialog()).perform(click())
                onView(withText("OK")).inRoot(isDialog()).perform(click())
                await(scenario) { !it.loading && it.settings.serif != previous.serif }
                val family = if (previous.serif) "sans-serif" else "serif"
                val expected = android.graphics.Typeface.create(family, android.graphics.Typeface.BOLD)
                onView(withText("Missa")).check { view, error ->
                    if (error != null) throw error
                    assertEquals(expected, (view as android.widget.TextView).typeface)
                }
                scenario.recreate()
                await(scenario) { !it.loading && it.settings.serif != previous.serif }
                onView(withText("Missa")).check { view, error ->
                    if (error != null) throw error
                    assertEquals(expected, (view as android.widget.TextView).typeface)
                }
                scenario.onActivity {
                    ViewModelProvider(it)[AppViewModel::class.java].openCelebration(LiturgicalDate.of(2026, 11, 16), "")
                }
                await(scenario) { !it.loading && it.screen == Screen.MASS }
                onView(withText("MODLITBA DŇA")).check { view, error ->
                    if (error != null) throw error
                    assertEquals(expected, (view as android.widget.TextView).typeface)
                }
            } finally {
                scenario.onActivity { ViewModelProvider(it)[AppViewModel::class.java].applySettings(previous) }
            }
        }
    }

    @Test
    fun septemberDedicationAndTheOtherCelebrationsRemainIndependentlyOpenable() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            await(scenario) { !it.loading }
            val date = LiturgicalDate.of(2026, 9, 24)
            scenario.onActivity {
                val model = ViewModelProvider(it)[AppViewModel::class.java]
                model.applySettings(model.settings.copy(jurisdiction = "banska-bystrica", locality = null, cathedral = false))
                model.selectDate(date); model.destination(AppDestination.CALENDAR)
            }
            await(scenario) { !it.loading && it.screen == Screen.CALENDAR }
            scenario.onActivity {
                val model = ViewModelProvider(it)[AppViewModel::class.java]
                val rows = model.state.value.days.single { day -> day.date == date }.celebrations
                assertTrue(rows.any { row -> row.id == "" })
                assertTrue(rows.any { row -> row.id == "c178" })
                model.openCelebration(date, "c178")
            }
            await(scenario) { !it.loading && it.screen == Screen.MASS }
            scenario.onActivity {
                val model = ViewModelProvider(it)[AppViewModel::class.java]
                assertNull(model.state.value.error)
                assertTrue(model.state.value.title.startsWith("BANSKOBYSTRICKÁ"))
                assertTrue(model.state.value.blocks.toString().contains("podľa Jána"))
                assertFalse(model.state.value.blocks.toString().contains("podľa Jana"))
                model.back()
            }
            await(scenario) { !it.loading && it.screen == Screen.CALENDAR }
            scenario.onActivity { ViewModelProvider(it)[AppViewModel::class.java].openCelebration(date, "") }
            await(scenario) { !it.loading && it.screen == Screen.MASS }
            scenario.onActivity {
                val state = ViewModelProvider(it)[AppViewModel::class.java].state.value
                assertNull(state.error)
                assertFalse(state.title.startsWith("BANSKOBYSTRICKÁ"))
            }
        }
    }

    @Test
    fun autumnEmberGospelUsesTheReportedCorrectionForEveryFormulary() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            await(scenario) { !it.loading }
            scenario.onActivity { ViewModelProvider(it)[AppViewModel::class.java].openCelebration(LiturgicalDate.of(2026, 9, 18), "om013") }
            await(scenario) { !it.loading && it.screen == Screen.MASS }
            for (form in listOf("f084", "f085", "f086")) {
                scenario.onActivity {
                    val model = ViewModelProvider(it)[AppViewModel::class.java]
                    model.state.value.controls.first { control -> control.title == "Vybrať formulár" }.select()
                    requireNotNull(model.state.value.dialog).select(form)
                }
                await(scenario) { !it.loading && it.dialog == null }
                scenario.onActivity {
                    val state = ViewModelProvider(it)[AppViewModel::class.java].state.value
                    assertNull(state.error)
                    assertTrue(state.blocks.toString().contains("A čo si si nahromadil"))
                    assertFalse(state.blocks.toString().contains("A So si nahromadil"))
                }
            }
            scenario.onActivity {
                val audited = DatasetAssets.read(it.assets).associateBy { item -> item.id }
                for (id in listOf("g057", "g114")) assertTrue(audited.getValue(id).fields.toString().contains("podľa Jána"))
            }
        }
    }

    private fun await(scenario: ActivityScenario<MainActivity>, ready: (AppUiState) -> Boolean) {
        val deadline = SystemClock.elapsedRealtime() + 60_000
        while (SystemClock.elapsedRealtime() < deadline) {
            var done = false
            scenario.onActivity { done = ready(ViewModelProvider(it)[AppViewModel::class.java].state.value) }
            if (done) return
            Thread.sleep(50)
        }
        fail("Application did not reach the expected state")
    }
}
