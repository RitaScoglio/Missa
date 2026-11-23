package sk.missa.ui.app

import androidx.lifecycle.ViewModelProvider
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.MainActivity
import sk.missa.calendar.LiturgicalDate
import sk.missa.ui.navigation.AppDestination
import sk.missa.ui.navigation.Screen

@RunWith(AndroidJUnit4::class)
class AppNavigationTest {
    @Test
    fun languageShortcutRetainsMassChoicesScrollAndSavedSession() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            fun model(activity: MainActivity) = ViewModelProvider(activity)[AppViewModel::class.java]
            fun await(ready: (AppUiState) -> Boolean) {
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
                fail("Reader switch did not become ready")
            }
            fun scroll(view: android.view.View): android.widget.ScrollView? {
                if (view is android.widget.ScrollView) return view
                if (view is android.view.ViewGroup) for (index in 0 until view.childCount) {
                    scroll(view.getChildAt(index))?.let { return it }
                }
                return null
            }
            fun click(description: String) {
                androidx.test.espresso.Espresso.onView(androidx.test.espresso.matcher.ViewMatchers.withContentDescription(description))
                    .perform(androidx.test.espresso.action.ViewActions.click())
            }
            await { !it.loading }
            androidx.test.espresso.Espresso.onView(androidx.test.espresso.matcher.ViewMatchers.withContentDescription("Späť na vybranú omšu"))
                .check(androidx.test.espresso.assertion.ViewAssertions.doesNotExist())
            lateinit var todayCelebrations: List<Pair<String, String>>
            scenario.onActivity {
                todayCelebrations = model(it).state.value.days.single().celebrations.map { row -> row.id to row.title }
                model(it).destination(AppDestination.LANGUAGES)
            }
            await { !it.loading && it.screen == Screen.LANGUAGES }
            androidx.test.espresso.Espresso.onView(androidx.test.espresso.matcher.ViewMatchers.withContentDescription("Dnes"))
                .check(androidx.test.espresso.assertion.ViewAssertions.doesNotExist())
            androidx.test.espresso.Espresso.onView(androidx.test.espresso.matcher.ViewMatchers.withText("Anglicky"))
                .check(androidx.test.espresso.assertion.ViewAssertions.doesNotExist())
            click("Vybrať slávenie alebo omšu")
            scenario.onActivity {
                val choice = requireNotNull(model(it).state.value.dialog)
                assertEquals(todayCelebrations, choice.values)
                choice.select(choice.values.first().first)
            }
            await { !it.loading && it.screen == Screen.MASS }
            scenario.onActivity {
                assertTrue(model(it).state.value.languageMode)
                model(it).destination(AppDestination.TODAY)
            }
            await { !it.loading && it.screen == Screen.HOME }
            scenario.onActivity { model(it).openCelebration(LiturgicalDate.of(2026, 11, 16), "") }
            await { !it.loading && it.screen == Screen.MASS }
            androidx.test.espresso.Espresso.onView(androidx.test.espresso.matcher.ViewMatchers.withContentDescription("Späť na vybranú omšu"))
                .check(androidx.test.espresso.assertion.ViewAssertions.doesNotExist())
            scenario.onActivity {
                val vm = model(it)
                vm.state.value.controls.single { control -> control.title == "Eucharistická modlitba" }.select()
                val choice = requireNotNull(vm.state.value.dialog)
                choice.select(choice.values.first { value -> value.first != choice.selectedId }.first)
            }
            await { !it.loading && it.dialog == null }
            val mass = android.os.Bundle()
            lateinit var blocks: List<Map<String, Any?>>
            scenario.onActivity {
                model(it).save(mass)
                blocks = model(it).state.value.blocks
                scroll(it.findViewById(android.R.id.content))!!.scrollTo(0, 600)
            }
            scenario.onActivity { model(it).destination(AppDestination.LANGUAGES) }
            await { !it.loading && it.screen == Screen.LANGUAGES }
            click("Zmeniť jazyk odpovedí")
            androidx.test.espresso.Espresso.onView(androidx.test.espresso.matcher.ViewMatchers.withText("Anglicky"))
                .perform(androidx.test.espresso.action.ViewActions.click())
            await { !it.loading && it.resourceId == "lp002" }
            scenario.onActivity { scroll(it.findViewById(android.R.id.content))!!.scrollTo(0, 300) }
            repeat(2) {
                click("Späť na vybranú omšu")
                await { !it.loading && it.resourceId == null }
                scenario.onActivity {
                    val saved = android.os.Bundle().also(model(it)::save)
                    assertEquals(mass.getString("prayer"), saved.getString("prayer"))
                    assertEquals(blocks, model(it).state.value.blocks)
                    assertEquals(600, scroll(it.findViewById(android.R.id.content))!!.scrollY)
                }
                click("Zobraziť odpovede v cudzom jazyku")
                await { !it.loading && it.resourceId == "lp002" }
                scenario.onActivity { assertEquals(300, scroll(it.findViewById(android.R.id.content))!!.scrollY) }
            }
            scenario.recreate()
            await { !it.loading && it.resourceId == "lp002" }
            val store = androidx.lifecycle.ViewModelStore()
            lateinit var restored: AppViewModel
            try {
                scenario.onActivity {
                    val saved = android.os.Bundle().also(model(it)::save)
                    restored = ViewModelProvider(store, ViewModelProvider.AndroidViewModelFactory.getInstance(it.application))[AppViewModel::class.java]
                    restored.start(saved, false)
                }
                val deadline = System.nanoTime() + 60_000_000_000L
                while (restored.state.value.loading && System.nanoTime() < deadline) Thread.sleep(100)
                scenario.onActivity { restored.showMass() }
                while (restored.state.value.loading && System.nanoTime() < deadline) Thread.sleep(100)
                scenario.onActivity {
                    assertNull(restored.state.value.error)
                    assertTrue(restored.state.value.languageMode)
                    assertEquals(blocks, restored.state.value.blocks)
                    assertEquals("lp002", restored.state.value.languageId)
                    val saved = android.os.Bundle().also(restored::save)
                    assertEquals(mass.getString("prayer"), saved.getString("prayer"))
                    assertEquals(mass.getInt("day"), saved.getInt("day"))
                    assertEquals(mass.getInt("month"), saved.getInt("month"))
                }
            } finally {
                scenario.onActivity { store.clear() }
            }
        }
    }

    @Test
    fun navigationClosesDrawerAndRetainsReaderAcrossRecreation() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            lateinit var original: AppViewModel
            scenario.onActivity {
                original = ViewModelProvider(it)[AppViewModel::class.java]
                original.drawer(true)
                original.navigate(Screen.CALENDAR)
                assertFalse(original.state.value.drawerOpen)
                assertEquals(Screen.CALENDAR, original.state.value.screen)
            }
            scenario.recreate()
            scenario.onActivity {
                val retained = ViewModelProvider(it)[AppViewModel::class.java]
                assertSame(original, retained)
                assertEquals(Screen.CALENDAR, retained.state.value.screen)
                assertEquals(original.selectedDate, retained.selectedDate)
            }
        }
    }

    @Test
    fun restoresScreenDateAndBackHistoryFromSavedState() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            scenario.onActivity {
                val model = ViewModelProvider(it)[AppViewModel::class.java]
                model.destination(AppDestination.CALENDAR)
                model.moveMonth(-1)
                model.destination(AppDestination.LANGUAGES)
                val saved = android.os.Bundle()
                model.save(saved)
                assertEquals("LANGUAGES", saved.getString("screen"))
                assertEquals(model.selectedDate.year, saved.getInt("year"))
                val store = androidx.lifecycle.ViewModelStore()
                try {
                    val restored = ViewModelProvider(store, ViewModelProvider.AndroidViewModelFactory.getInstance(it.application))[AppViewModel::class.java]
                    restored.start(saved, false)
                    assertEquals(Screen.LANGUAGES, restored.state.value.screen)
                    assertEquals(model.selectedDate, restored.selectedDate)
                    val browsedMonth = sk.missa.calendar.LiturgicalDate.of(saved.getInt("monthYear"), saved.getInt("monthNumber"), 1)
                    assertTrue(restored.back())
                    assertEquals(Screen.CALENDAR, restored.state.value.screen)
                    assertEquals(browsedMonth, restored.state.value.calendarMonth)
                    assertTrue(restored.back())
                    assertEquals(Screen.HOME, restored.state.value.screen)
                } finally {
                    store.clear()
                }
            }
        }
    }
}
