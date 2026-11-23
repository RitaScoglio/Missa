package sk.missa.settings

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import sk.missa.calendar.LiturgicalDate
import sk.missa.data.LiturgyRepository
import sk.missa.ui.navigation.AppDestination
import sk.missa.ui.app.AppViewModel

@RunWith(AndroidJUnit4::class)
class AppPersistenceTest {
    private val application = ApplicationProvider.getApplicationContext<Application>()
    private val storedPreferences = application.getSharedPreferences("reader", Context.MODE_PRIVATE)
    private val legacy = application.getSharedPreferences("MySviatok", Context.MODE_PRIVATE)
    private lateinit var storedBackup: Map<String, *>
    private lateinit var legacyBackup: Map<String, *>
    private val stores = mutableListOf<ViewModelStore>()
    private val date = LiturgicalDate.of(2026, 11, 16)

    @Before
    fun isolatePreferences() {
        storedBackup = storedPreferences.all.toMap(); legacyBackup = legacy.all.toMap()
        storedPreferences.edit().clear().commit(); legacy.edit().clear().commit()
    }

    @After
    fun restorePreferences() {
        main { stores.forEach(ViewModelStore::clear) }
        restore(storedPreferences, storedBackup); restore(legacy, legacyBackup)
    }

    private fun restore(preferences: SharedPreferences, values: Map<String, *>) {
        val editor = preferences.edit().clear()
        for ((key, value) in values) when (value) {
            is Boolean -> editor.putBoolean(key, value)
            is Int -> editor.putInt(key, value)
            is Long -> editor.putLong(key, value)
            is Float -> editor.putFloat(key, value)
            is String -> editor.putString(key, value)
            is Set<*> -> editor.putStringSet(key, value.filterIsInstance<String>().toSet())
        }
        editor.commit()
    }

    @Test
    fun restoresMassWithAnUnavailableReadingChoice() {
        val original = newModel()
        main { original.openCelebration(date, "") }
        await(original)
        val snapshot = saved(original)
        requireNotNull(snapshot.getBundle("choices")).putBundle("readings", Bundle().apply {
            putInt("removedSlot", 100)
        })
        val restored = newModel(snapshot)
        assertNull(restored.state.value.error)
        assertTrue(restored.state.value.blocks.isNotEmpty())
        assertFalse(saved(restored).getBundle("choices")!!.getBundle("readings")!!.containsKey("removedSlot"))
    }

    @Test
    fun repeatedTodayDoesNotGrowHistoryAndForwardNavigationIsBounded() {
        val model = newModel()
        main { repeat(20) { model.destination(AppDestination.TODAY) } }
        assertEquals(0, saved(model).getParcelableArrayList<Bundle>("history")!!.size)
        main {
            repeat(12) {
                model.destination(AppDestination.LANGUAGES)
                model.destination(AppDestination.SPECIAL_MASSES)
            }
        }
        assertEquals(16, saved(model).getParcelableArrayList<Bundle>("history")!!.size)
    }
    @Test
    fun importsOldAppearanceOnceWithoutReplacingExistingNewPreferences() {
        legacy.edit().putBoolean("pismo", true).putBoolean("rezim", true).putBoolean("zvoncek", true)
            .putBoolean("fullscreen", true).putBoolean("ticheModlitby", true).putInt("sizeO", 28).putInt("pozicia_font", 1).commit()
        storedPreferences.edit().putInt("fontSize", 20).commit()
        val imported = AppPreferences(application).read(false)
        assertEquals(20, imported.fontSize)
        assertTrue(imported.boldText && imported.nightMode && imported.bells && imported.fullscreen && imported.serif && imported.quietPrayers)
        legacy.edit().putBoolean("rezim", false).putInt("pozicia_font", 0).commit()
        assertEquals(imported, AppPreferences(application).read(false))
        storedPreferences.edit().clear().commit()
        legacy.edit().clear().putString("sizeO", "broken old value").putBoolean("pismo", true).commit()
        val recovered = AppPreferences(application).read(false)
        assertEquals(16, recovered.fontSize)
        assertTrue(recovered.boldText)
    }

    @Test
    fun importsLegacyMassChoicesOnlyForTheMatchingDateAndCelebration() {
        val repository = LiturgyRepository(application.assets)
        val title = repository.calendar.resolve(date).base.title
        legacy.edit().putInt("rok", date.year).putInt("m", date.month - 1).putInt("den", date.dayOfMonth)
            .putString("menoSvatca", title.uppercase()).putInt("poz_euch", 0).putInt("poz_form", 0).putInt("poz_pref", 0).commit()
        val preferences = AppPreferences(application)
        assertNull(preferences.legacyMassChoices(date.plusDays(1), title))
        assertNull(preferences.legacyMassChoices(date, "Another celebration"))
        assertNotNull(preferences.legacyMassChoices(date, title))
        val model = newModel()
        main { model.selectDate(date); model.openCelebration(model.selectedDate, "") }
        await(model)
        assertNull(model.state.value.error)
        assertEquals("ep003", saved(model).getString("prayer"))
        assertNull(preferences.legacyMassChoices(date, title))
        val fresh = newModel()
        main { fresh.selectDate(date); fresh.openCelebration(fresh.selectedDate, "") }
        await(fresh)
        assertEquals("ep003", saved(fresh).getString("prayer"))
        val alternative = repository.calendar.resolve(date).alternatives.first()
        storedPreferences.edit().remove("legacyMassImported").commit()
        legacy.edit().putString("menoSvatca", alternative.title).commit()
        val memorial = newModel()
        main { memorial.openCelebration(date, alternative.id.value) }
        await(memorial)
        assertEquals("ep003", saved(memorial).getString("prayer"))
    }

    @Test
    fun remembersFormularyPrayerAndPrefaceAcrossFreshModelsWhileSavedStateTakesPriority() {
        val original = newModel()
        main { original.selectDate(date); original.destination(AppDestination.SPECIAL_MASSES); original.openEntry("om006") }
        await(original)
        choose(original, "Vybrať formulár") { it.last().first }
        choose(original, "Eucharistická modlitba") { "ep003" }
        choose(original, "Prefácia") { it.last().first }
        val first = saved(original)
        val fresh = newModel()
        main { fresh.selectDate(date); fresh.destination(AppDestination.SPECIAL_MASSES); fresh.openEntry("om006") }
        await(fresh)
        val reloaded = saved(fresh)
        for (key in listOf("formulary", "prayer", "preface")) assertEquals(key, first.getString(key), reloaded.getString(key))
        choose(fresh, "Eucharistická modlitba") { "ep002" }
        val restored = newModel(first)
        assertEquals("ep003", saved(restored).getString("prayer"))
        val nextDay = newModel()
        main { nextDay.selectDate(date.plusDays(1)); nextDay.destination(AppDestination.SPECIAL_MASSES); nextDay.openEntry("om006") }
        await(nextDay)
        assertNull(saved(nextDay).getString("formulary"))
        assertEquals("ep002", saved(nextDay).getString("prayer"))
        val holyThursday = LiturgicalDate.of(2026, 4, 2)
        val rite = newModel()
        main { rite.selectDate(holyThursday); rite.openCelebration(holyThursday, "") }
        await(rite)
        choose(rite, "Eucharistická modlitba") { "ep007" }
        val reopened = newModel()
        main { reopened.selectDate(holyThursday); reopened.openCelebration(holyThursday, "tr003") }
        await(reopened)
        assertEquals("ep007", saved(reopened).getString("prayer"))
    }

    private fun newModel(saved: Bundle? = null): AppViewModel {
        lateinit var model: AppViewModel
        main {
            val store = ViewModelStore().also(stores::add)
            model = ViewModelProvider(store, ViewModelProvider.AndroidViewModelFactory.getInstance(application))[AppViewModel::class.java]
            model.start(saved, false)
        }
        await(model)
        return model
    }
    private fun choose(model: AppViewModel, title: String, select: (List<Pair<String, String>>) -> String) {
        main {
            model.state.value.controls.first { it.title == title }.select()
            val dialog = requireNotNull(model.state.value.dialog)
            dialog.select(select(dialog.values))
        }
        await(model)
        assertNull(model.state.value.error)
    }
    private fun saved(model: AppViewModel) = Bundle().also { main { model.save(it) } }
    private fun main(action: () -> Unit) = InstrumentationRegistry.getInstrumentation().runOnMainSync(action)
    private fun await(model: AppViewModel) {
        val deadline = System.nanoTime() + 60_000_000_000L
        while (System.nanoTime() < deadline) {
            var ready = false
            main { ready = !model.state.value.loading }
            if (ready) return
            Thread.sleep(100)
        }
        fail("Application did not finish loading")
    }
}
