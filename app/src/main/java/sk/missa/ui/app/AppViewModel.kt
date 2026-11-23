package sk.missa.ui.app

import sk.missa.ui.components.LiturgyAlternative

import sk.missa.ui.components.LiturgyControl

import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import java.util.Calendar
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import sk.missa.calendar.LiturgicalCalendar
import sk.missa.calendar.LiturgicalDate
import sk.missa.calendar.LiturgicalDay
import sk.missa.calendar.LiturgicalSeason
import sk.missa.calendar.LiturgicalYear
import sk.missa.calendar.celebration.DioceseId
import sk.missa.calendar.celebration.LiturgicalColor
import sk.missa.data.LiturgyRepository
import sk.missa.liturgy.document.LiturgyDocuments
import sk.missa.liturgy.mass.CalendarMassSelection
import sk.missa.liturgy.mass.GospelChoiceAvailability
import sk.missa.liturgy.mass.MassContentResolver
import sk.missa.liturgy.mass.SpecialMassAvailability
import sk.missa.settings.AppPreferences
import sk.missa.settings.AppSettings
import sk.missa.ui.calendar.CalendarPresentation
import sk.missa.ui.calendar.CalendarDayRow
import sk.missa.ui.calendar.CelebrationRow
import sk.missa.ui.navigation.AppDestination
import sk.missa.ui.navigation.Screen

/** Owns application screens, history and liturgical choices across Activity recreation. */
class AppViewModel(application: Application) : AndroidViewModel(application) {
    private val _state = MutableStateFlow(AppUiState())
    val state = _state.asStateFlow()
    private val controls = mutableListOf<LiturgyControl>()
    private var started = false
    private lateinit var documents: LiturgyDocuments
    private lateinit var calendar: LiturgicalCalendar
    private lateinit var selector: CalendarMassSelection
    private lateinit var resolver: MassContentResolver
    private lateinit var day: LiturgicalDay
    private var displayedDay: LiturgicalDay? = null
    private var restoreMassPreferences = true
    private var date = Calendar.getInstance().let { LiturgicalDate.of(it.get(Calendar.YEAR), it.get(Calendar.MONTH) + 1, it.get(Calendar.DAY_OF_MONTH)) }
    private var jurisdiction: String? = null
    private var locality: String? = null
    private var cathedral = false
    private var evening = false
    private var bells = false
    private var fontSize = 16
    private var nightMode = false
    private var boldText = false
    private var fullscreen = false
    private var serif = false
    private val preferences = AppPreferences(application)
    private var month = LiturgicalDate.of(date.year, date.month, 1)
    private var returnScreen = Screen.HOME
    private var openedOn = date
    // Null follows the calendar's primary celebration; an empty ID explicitly selects the feria.
    private var ownerId: String? = null
    private var resourceId: String? = null
    private var resourceInsertions: Map<String, String> = emptyMap()
    private var restoredChoices: Bundle? = null
    private var contextOptions = CalendarMassSelection.Options()
    private var ritualOptions = LiturgyDocuments.Options(prayerId = "ep002")
    private var selection: MassContentResolver.Selection? = null
    private var content: MassContentResolver.Content? = null
    private var work: Job? = null
    private data class Page(
        val state: AppUiState, val date: LiturgicalDate, val month: LiturgicalDate,
        val owner: String?, val resource: String?, val insertions: Map<String, String>,
        val context: CalendarMassSelection.Options, val ritual: LiturgyDocuments.Options,
        val selection: MassContentResolver.Selection?, val content: MassContentResolver.Content?,
        val returnScreen: Screen,
        val savedChoices: Bundle? = null,
        val evening: Boolean = false,
    )
    private companion object {
        const val MAX_HISTORY = 16
    }

    private val history = mutableListOf<Page>()

    private var selectedMass: Page? = null
    private var languageId: String? = null

    private fun currentPage() = Page(state.value.copy(drawerOpen = false, dialog = null, selectedDate = date, calendarMonth = month), date, month, ownerId,
        resourceId, resourceInsertions, contextOptions, ritualOptions, selection, content, returnScreen, evening = evening)

    private fun isMassReader() = state.value.screen == Screen.MASS &&
        (resourceId == null || documents.catalog[resourceId]?.dataset == "triduum-rites.json")

    private fun rememberPage() {
        val page = currentPage()
        if (history.lastOrNull() != page) {
            if (history.size == MAX_HISTORY) history.removeAt(0)
            history.add(page)
        }
        if (isMassReader()) selectedMass = page
    }

    fun showMass() {
        if (state.value.loading || isMassReader()) return
        val page = selectedMass ?: run { chooseMass(); return }
        if (history.lastOrNull() == page) history.removeAt(history.lastIndex)
        restorePage(page, state.value.languageMode)
    }

    fun chooseMass() {
        if (state.value.loading) return
        val date = today()
        val resolved = calendar.resolve(date, jurisdiction?.let(::DioceseId), locality, cathedral, evening)
        val celebrations = withGeneratedCelebrations(CalendarPresentation.day(calendar, date, settings), resolved).celebrations
        choose("Vybrať slávenie alebo omšu", celebrations.map { it.id to it.title }) { id -> openCelebration(date, id) }
    }

    fun showLanguage() {
        if (state.value.loading) return
        val id = languageId
        if (id == null) chooseLanguage()
        else if (resourceId != id || state.value.screen != Screen.MASS) openLanguage(id)
    }

    fun chooseLanguage() {
        if (state.value.loading) return
        choose("Odpovede v cudzích jazykoch", languageEntries().map { it.id to it.title }, languageId) { openLanguage(it) }
    }

    private fun openLanguage(id: String) {
        if (state.value.screen != Screen.MASS) rememberPage()
        if (isMassReader()) selectedMass = currentPage()
        languageId = id
        restoreMassPreferences = false
        resourceId = id
        resourceInsertions = emptyMap()
        _state.value = state.value.copy(languageMode = true, loading = true)
        navigate(Screen.MASS)
    }

    private fun restorePage(previous: Page, languageMode: Boolean = previous.state.languageMode) {
        date = previous.date; month = previous.month; ownerId = previous.owner; resourceId = previous.resource
        evening = previous.evening
        resourceInsertions = previous.insertions; contextOptions = previous.context
        ritualOptions = previous.ritual.copy(quietPrayers = settings.quietPrayers)
        selection = previous.selection; content = previous.content; returnScreen = previous.returnScreen
        restoredChoices = previous.savedChoices
        restoreMassPreferences = false
        _state.value = previous.state.copy(settings = settings, dialog = null, drawerOpen = false, loading = ::calendar.isInitialized,
            hasSelectedMass = selectedMass != null, languageId = languageId, languageMode = languageMode)
        if (::calendar.isInitialized) refresh(false)
    }

    val selectedDate get() = date
    val settings get() = AppSettings(jurisdiction, locality, cathedral, evening, bells, fontSize, nightMode, boldText, fullscreen, serif, ritualOptions.quietPrayers)
    fun start(savedInstanceState: Bundle?, systemNight: Boolean) {
        if (started) return
        started = true
        val stored = preferences.read(systemNight)
        jurisdiction = stored.jurisdiction; locality = stored.locality; cathedral = stored.cathedral; evening = stored.evening
        bells = stored.bells; fontSize = stored.fontSize; nightMode = stored.nightMode; boldText = stored.boldText
        fullscreen = stored.fullscreen; serif = stored.serif
        ritualOptions = ritualOptions.copy(quietPrayers = stored.quietPrayers)
        savedInstanceState?.takeIf { it.containsKey("year") && it.containsKey("month") && it.containsKey("day") }?.let {
            restoreMassPreferences = false
            date = LiturgicalDate.of(it.getInt("year"), it.getInt("month"), it.getInt("day"))
            jurisdiction = it.getString("jurisdiction"); locality = it.getString("locality")
            cathedral = it.getBoolean("cathedral"); evening = it.getBoolean("evening")
            bells = it.getBoolean("bells"); fontSize = it.getInt("fontSize", 16)
            nightMode = it.getBoolean("nightMode"); boldText = it.getBoolean("boldText")
            fullscreen = it.getBoolean("fullscreen", fullscreen); serif = it.getBoolean("serif", serif)
            ownerId = it.getString("owner"); resourceId = it.getString("resource")
            restoredChoices = it.getBundle("choices")
            resourceInsertions = it.getBundle("insertions")?.let { values -> values.keySet().associateWith { key -> requireNotNull(values.getString(key)) } } ?: emptyMap()
            contextOptions = contextOptions.copy(formularyId = it.getString("formulary"), withSecondReading = it.getBoolean("secondReading"), previousSundayGospelId = it.getString("previousSunday"), reconciliation = it.getString("reconciliation"))
            ritualOptions = ritualOptions.copy(prayerId = it.getString("prayer"), prefaceId = it.getString("preface"), replacingPrayerAvailable = it.getBoolean("fourthPrayer"))
            ritualOptions = ritualOptions.copy(quietPrayers = it.getBoolean("quietPrayers"))
            contextOptions = contextOptions.copy(currentDayScripture = it.getBoolean("currentDayScripture"), lentenReadingsFromCycleA = it.getBoolean("cycleA"))
            contextOptions = contextOptions.copy(dayCelebrationId = it.getString("dayCelebration"))
        }

        month = LiturgicalDate.of(savedInstanceState?.getInt("monthYear", date.year) ?: date.year, savedInstanceState?.getInt("monthNumber", date.month) ?: date.month, 1)
        returnScreen = Screen.entries.firstOrNull { it.name == savedInstanceState?.getString("returnScreen") } ?: Screen.HOME
        val screen = Screen.entries.firstOrNull { it.name == savedInstanceState?.getString("screen") } ?: Screen.HOME
        _state.value = state.value.copy(screen = screen, settings = settings, selectedDate = date, calendarMonth = month,
            massOptionsOpen = savedInstanceState?.getBoolean("massOptionsOpen") ?: true, sourceScreen = returnScreen,
            languageMode = savedInstanceState?.getBoolean("languageMode") ?: (screen == Screen.LANGUAGES || resourceId?.startsWith("lp") == true),
            blessingMenuId = savedInstanceState?.getString("blessingMenu") ?: "od024")
        @Suppress("DEPRECATION")
        val savedHistory = savedInstanceState?.getParcelableArrayList<Bundle>("history").orEmpty()
        history.addAll(savedHistory.takeLast(MAX_HISTORY).map(::readPage))
        selectedMass = savedInstanceState?.getBundle("selectedMass")?.let(::readPage)
        languageId = savedInstanceState?.getString("languageId")?.takeIf { id -> languageEntries().any { it.id == id } }
        _state.value = state.value.copy(hasSelectedMass = selectedMass != null, languageId = languageId)
        retry()
    }
    fun retry() {
        work?.cancel()
        work = viewModelScope.launch {
            _state.value = state.value.copy(loading = true, error = null)
            try {
                val repository = withContext(Dispatchers.IO) { LiturgyRepository.shared(getApplication<Application>()) }
                documents = repository.documents
                calendar = repository.calendar
                selector = repository.selector
                resolver = repository.resolver
                refresh()
            } catch (error: CancellationException) { throw error
            } catch (error: Exception) {
                Log.e("Missa", "Unable to load liturgy", error)
                _state.value = state.value.copy(loading = false, error = "Liturgické texty sa nepodarilo načítať.")
            }
        }
    }
    fun save(outState: Bundle) {
        outState.putInt("year", date.year); outState.putInt("month", date.month); outState.putInt("day", date.dayOfMonth)
        outState.putString("jurisdiction", jurisdiction); outState.putString("locality", locality)
        outState.putBoolean("cathedral", cathedral); outState.putBoolean("evening", evening)
        outState.putBoolean("bells", bells); outState.putInt("fontSize", fontSize)
        outState.putBoolean("nightMode", nightMode); outState.putBoolean("boldText", boldText)
        outState.putString("owner", ownerId); outState.putString("resource", resourceId)
        outState.putString("formulary", contextOptions.formularyId); outState.putBoolean("secondReading", contextOptions.withSecondReading)
        outState.putString("previousSunday", contextOptions.previousSundayGospelId); outState.putString("reconciliation", contextOptions.reconciliation)
        outState.putString("prayer", ritualOptions.prayerId); outState.putString("preface", ritualOptions.prefaceId); outState.putBoolean("fourthPrayer", ritualOptions.replacingPrayerAvailable)
        outState.putBoolean("quietPrayers", ritualOptions.quietPrayers)
        outState.putBoolean("currentDayScripture", contextOptions.currentDayScripture); outState.putBoolean("cycleA", contextOptions.lentenReadingsFromCycleA)
        outState.putString("dayCelebration", contextOptions.dayCelebrationId)
        outState.putBundle("insertions", Bundle().apply { resourceInsertions.forEach { (key, value) -> putString(key, value) } })
        selection?.let { choice -> outState.putBundle("choices", Bundle().apply {
            putInt("entrance", choice.entranceChoice); putInt("communion", choice.communionChoice); putInt("collect", choice.collectChoice)
            putInt("offering", choice.offeringChoice); putInt("afterCommunion", choice.afterCommunionChoice); putInt("intercession", choice.intercessionChoice)
            putBundle("readings", Bundle().apply { choice.readingChoices.forEach { (key, value) -> putInt(key, value) } })
        }) }
    
        outState.putString("screen", state.value.screen.name)
        outState.putString("returnScreen", returnScreen.name)
        outState.putInt("monthYear", month.year); outState.putInt("monthNumber", month.month)
        outState.putBoolean("massOptionsOpen", state.value.massOptionsOpen)
        outState.putBoolean("fullscreen", fullscreen); outState.putBoolean("serif", serif)
        outState.putString("blessingMenu", state.value.blessingMenuId)
        outState.putParcelableArrayList("history", ArrayList(history.map(::writePage)))
        selectedMass?.let { outState.putBundle("selectedMass", writePage(it)) }
        outState.putString("languageId", languageId)
        outState.putBoolean("languageMode", state.value.languageMode)
    }

    private fun writePage(page: Page) = Bundle().apply {
        putInt("year", page.date.year); putInt("month", page.date.month); putInt("day", page.date.dayOfMonth)
        putInt("monthYear", page.month.year); putInt("monthNumber", page.month.month)
        putString("screen", page.state.screen.name); putString("returnScreen", page.returnScreen.name)
        putString("sourceScreen", page.state.sourceScreen.name); putBoolean("massOptionsOpen", page.state.massOptionsOpen)
        putBoolean("languageMode", page.state.languageMode)
        putBoolean("evening", page.evening)
        putString("blessingMenu", page.state.blessingMenuId); putString("owner", page.owner); putString("resource", page.resource)
        putString("formulary", page.context.formularyId); putBoolean("secondReading", page.context.withSecondReading)
        putString("previousSunday", page.context.previousSundayGospelId); putString("reconciliation", page.context.reconciliation)
        putBoolean("currentDayScripture", page.context.currentDayScripture); putBoolean("cycleA", page.context.lentenReadingsFromCycleA)
        putString("dayCelebration", page.context.dayCelebrationId)
        putString("prayer", page.ritual.prayerId); putString("preface", page.ritual.prefaceId)
        putBoolean("fourthPrayer", page.ritual.replacingPrayerAvailable)
        putBundle("insertions", Bundle().apply { page.insertions.forEach { (key, value) -> putString(key, value) } })
        putBundle("choices", page.selection?.let { choice -> Bundle().apply {
            putInt("entrance", choice.entranceChoice); putInt("communion", choice.communionChoice); putInt("collect", choice.collectChoice)
            putInt("offering", choice.offeringChoice); putInt("afterCommunion", choice.afterCommunionChoice); putInt("intercession", choice.intercessionChoice)
            putBundle("readings", Bundle().apply { choice.readingChoices.forEach { (key, value) -> putInt(key, value) } })
        } } ?: page.savedChoices)
    }

    private fun readPage(saved: Bundle): Page {
        val date = LiturgicalDate.of(saved.getInt("year"), saved.getInt("month"), saved.getInt("day"))
        val month = LiturgicalDate.of(saved.getInt("monthYear"), saved.getInt("monthNumber"), 1)
        val source = Screen.valueOf(requireNotNull(saved.getString("sourceScreen")))
        val state = AppUiState(screen = Screen.valueOf(requireNotNull(saved.getString("screen"))),
            selectedDate = date, calendarMonth = month, sourceScreen = source,
            massOptionsOpen = saved.getBoolean("massOptionsOpen", true), blessingMenuId = saved.getString("blessingMenu") ?: "od024",
            resourceId = saved.getString("resource"), languageMode = saved.getBoolean("languageMode"))
        val context = CalendarMassSelection.Options(formularyId = saved.getString("formulary"), withSecondReading = saved.getBoolean("secondReading"),
            previousSundayGospelId = saved.getString("previousSunday"), reconciliation = saved.getString("reconciliation"),
            currentDayScripture = saved.getBoolean("currentDayScripture"), lentenReadingsFromCycleA = saved.getBoolean("cycleA"), dayCelebrationId = saved.getString("dayCelebration"))
        val ritual = LiturgyDocuments.Options(prayerId = saved.getString("prayer"), prefaceId = saved.getString("preface"), replacingPrayerAvailable = saved.getBoolean("fourthPrayer"))
        val insertions = saved.getBundle("insertions")?.let { values -> values.keySet().associateWith { requireNotNull(values.getString(it)) } }.orEmpty()
        return Page(state, date, month, saved.getString("owner"), saved.getString("resource"), insertions, context, ritual, null, null,
            Screen.valueOf(requireNotNull(saved.getString("returnScreen"))), saved.getBundle("choices"), saved.getBoolean("evening"))
    }
    fun navigate(screen: Screen) {
        if (screen == Screen.MASS && state.value.screen != Screen.MASS) returnScreen = state.value.screen
        _state.value = state.value.copy(screen = screen, drawerOpen = false, dialog = null, sourceScreen = returnScreen,
            loading = state.value.loading || ::calendar.isInitialized,
            languageMode = if (screen == Screen.MASS) state.value.languageMode else screen == Screen.LANGUAGES,
            hasSelectedMass = selectedMass != null, languageId = languageId)
        if (::calendar.isInitialized) refresh(false)
    }
    fun destination(destination: AppDestination) {
        if (destination.screen == state.value.screen && destination != AppDestination.TODAY) {
            drawer(false)
            return
        }
        if (destination != AppDestination.TODAY || state.value.screen != Screen.HOME || date != today()) rememberPage()
        if (destination == AppDestination.BLESSINGS) _state.value = state.value.copy(blessingMenuId = "od024")
        if (destination == AppDestination.TODAY) {
            restoreMassPreferences = true
            date = today()
            month = LiturgicalDate.of(date.year, date.month, 1)
            ownerId = null; resourceId = null; selection = null; content = null
            contextOptions = CalendarMassSelection.Options()
        }
        navigate(destination.screen)
    }
    fun back(): Boolean = when {
        state.value.dialog != null -> { dismissDialog(); true }
        state.value.drawerOpen -> { drawer(false); true }
        state.value.screen == Screen.MASS && resourceId?.startsWith("lp") == true && selectedMass != null && !state.value.loading -> {
            showMass(); true
        }
        history.isNotEmpty() -> {
            val previous = history.removeAt(history.lastIndex)
            restorePage(previous)
            true
        }
        state.value.screen == Screen.MASS -> { navigate(returnScreen); true }
        state.value.screen == Screen.BLESSINGS && state.value.blessingMenuId != "od024" -> {
            _state.value = state.value.copy(blessingMenuId = "od024")
            refresh(false)
            true
        }
        state.value.screen != Screen.HOME -> { destination(AppDestination.TODAY); true }
        else -> false
    }
    fun toggleMassOptions() { _state.value = state.value.copy(massOptionsOpen = !state.value.massOptionsOpen) }
    fun toggleFullscreen() { applySettings(settings.copy(fullscreen = !fullscreen)) }
    fun moveMonth(amount: Int) {
        month = CalendarPresentation.shiftMonth(month, amount)
        if (::calendar.isInitialized) refresh(false)
    }
    fun openCelebration(value: LiturgicalDate, id: String) {
        rememberPage()
        restoreMassPreferences = true
        val generatedVigil = id.startsWith("vigil:")
        val selectedId = if (generatedVigil) id.removePrefix("vigil:") else id
        date = if (generatedVigil) value.plusDays(1) else value
        restoredChoices = null
        resourceId = selectedId.takeIf { documents.catalog[it]?.dataset == "triduum-rites.json" }
        evening = if (resourceId != null) documents.catalog.getValue(id).fields["rite"] == "EASTER_VIGIL"
            else !generatedVigil && documents.catalog[selectedId]?.fields?.get("rank") == "VIGIL"
        ownerId = if (resourceId == null) selectedId else null
        selection = null; content = null; resourceInsertions = emptyMap()
        contextOptions = CalendarMassSelection.Options()
        ritualOptions = LiturgyDocuments.Options(prayerId = "ep002", quietPrayers = ritualOptions.quietPrayers)
        navigate(Screen.MASS)
    }
    private fun today() = Calendar.getInstance().let { LiturgicalDate.of(it.get(Calendar.YEAR), it.get(Calendar.MONTH) + 1, it.get(Calendar.DAY_OF_MONTH)) }
    fun resume() {
        val current = today()
        if (openedOn != current) {
            openedOn = current
            destination(AppDestination.TODAY)
        }
    }
    fun drawer(open: Boolean) { _state.value = state.value.copy(drawerOpen = open) }
    fun dismissDialog() { _state.value = state.value.copy(dialog = null) }
    fun chooseFont() {
        choose("Typ písma", listOf("sans" to "Bezpätkové", "serif" to "Pätkové"),
            if (settings.serif) "serif" else "sans", true) { value ->
            applySettings(settings.copy(serif = value == "serif"))
        }
    }
    fun selectDate(value: LiturgicalDate) { date = value; month = LiturgicalDate.of(value.year, value.month, 1); resetDay() }
    fun applySettings(value: AppSettings) {
        val changed = jurisdiction != value.jurisdiction || locality != value.locality || cathedral != value.cathedral || evening != value.evening
        jurisdiction = value.jurisdiction; locality = value.locality; cathedral = value.cathedral; evening = value.evening
        bells = value.bells; fontSize = value.fontSize.coerceIn(12, 36); nightMode = value.nightMode; boldText = value.boldText
        if (changed) { ownerId = null; selection = null; content = null; contextOptions = CalendarMassSelection.Options(); restoreMassPreferences = true }
        fullscreen = value.fullscreen; serif = value.serif
        ritualOptions = ritualOptions.copy(quietPrayers = value.quietPrayers)
        preferences.write(settings)
        _state.value = state.value.copy(settings = settings)
        if (::calendar.isInitialized) refresh(changed)
    }
    fun resource(id: String) = documents.resource(id, displayedDay ?: day)
    fun part(part: String): List<Map<String, Any?>> = if (part == "COMMUNION_RITE") documents.resource("od027", day)
        else content?.let { documents.eucharist(day, it, ritualOptions) } ?: listOf(LiturgyDocuments.plain("Vyberte eucharistickú modlitbu v možnostiach omše."))
    private fun button(title: String, alternatives: List<LiturgyAlternative> = emptyList(), action: () -> Unit) { controls.add(LiturgyControl(title, action, alternatives)) }
    private fun choose(title: String, values: List<Pair<String, String>>, selectedId: String? = null, confirm: Boolean = false, selected: (String) -> Unit) {
        _state.value = state.value.copy(dialog = ChoiceDialogState(title, values, { key -> dismissDialog(); selected(key) }, selectedId, confirm))
    }
    private fun refresh(resetChoices: Boolean = true) {
        work?.cancel()
        work = viewModelScope.launch {
            _state.value = state.value.copy(loading = true, dialog = null)
            try {
                day = resolveSelectedDay()
                displayedDay = day
                val days = if (state.value.screen == Screen.CALENDAR) {
                    val requestedMonth = month
                    val calendarSettings = settings
                    withContext(Dispatchers.Default) {
                        CalendarPresentation.month(calendar, requestedMonth, calendarSettings, ::withGeneratedCelebrations)
                    }
                } else {
                    listOf(withGeneratedCelebrations(CalendarPresentation.day(calendar, date, settings), day))
                }
                val entries = when (state.value.screen) {
                    Screen.SPECIAL_MASSES -> specialMassEntries()
                    Screen.LANGUAGES -> languageEntries()
                    Screen.BLESSINGS -> blessingEntries(state.value.blessingMenuId)
                    else -> emptyList()
                }
                _state.value = state.value.copy(settings = settings, selectedDate = date, calendarMonth = month, days = days, entries = entries)
                if (state.value.screen != Screen.MASS) {
                    _state.value = state.value.copy(loading = false, error = null, title = if (state.value.screen == Screen.BLESSINGS) name(state.value.blessingMenuId) else day.primaryCelebration?.title ?: day.base.title)
                    return@launch
                }
                val blocks = run {
                    if (resourceId != null) {
                        val id = requireNotNull(resourceId)
                        return@run if (documents.catalog.getValue(id).dataset == "triduum-rites.json") riteBlocks(id) else documents.resource(id, day, resourceInsertions)
                    }
                    val year = LiturgicalYear.of(date.year)
                    val rite = when (date) { year.easter.minusDays(3) -> "HOLY_THURSDAY"; year.easter.minusDays(2) -> "GOOD_FRIDAY"; year.easter.minusDays(1) -> if (evening) "EASTER_VIGIL" else "HOLY_SATURDAY_EXPOSITION"; else -> null }
                    if (rite != null && ownerId.isNullOrEmpty()) {
                        content = null; selection = null
                        return@run riteBlocks(documents.items.single { it.dataset == "triduum-rites.json" && it.fields["rite"] == rite }.id)
                    }
                    val owner = if (ownerId == "") null else ownerId ?: day.primaryCelebration?.id?.value
                    val remembered = if (restoreMassPreferences) preferences.massChoices(massPreferenceKey()) else null
                    val legacy = if (restoreMassPreferences && remembered == null) legacyChoicesForCelebration() else null
                    if (restoreMassPreferences) {
                        // Resolve the default first so stale or positional choices cannot select an unavailable formulary.
                        val baseline = selector.select(day, owner, contextOptions.copy(formularyId = null,
                            massTime = if (evening) GospelChoiceAvailability.MassTime.EVENING else GospelChoiceAvailability.MassTime.DAY))
                        val definitionId = baseline.properId ?: baseline.seasonalMassId
                        val definition = definitionId?.let { resolver.definition(it, if (baseline.properId != null) baseline.properVariant else baseline.seasonalVariant) }
                        val forms = (definition?.get("formularyChoices") as? List<*>)?.map { (it as Map<*, *>)["formularyId"] as String }.orEmpty()
                        val form = remembered?.formularyId?.takeIf { it in forms } ?: legacy?.let { forms.getOrNull(it.formularyIndex) }
                        contextOptions = contextOptions.copy(formularyId = form)
                        ritualOptions = ritualOptions.copy(prayerId = remembered?.prayerId ?: "ep002", prefaceId = remembered?.prefaceId)
                    }
                    if (resetChoices || selection == null || restoreMassPreferences) selection = selector.select(day, owner, contextOptions.copy(massTime = if (evening) GospelChoiceAvailability.MassTime.EVENING else GospelChoiceAvailability.MassTime.DAY))
                    val defaultSelection = selection
                    val restoringChoices = restoredChoices != null
                    restoredChoices?.let { saved ->
                        val readings = saved.getBundle("readings")
                        selection = requireNotNull(selection).copy(entranceChoice = saved.getInt("entrance"), communionChoice = saved.getInt("communion"), collectChoice = saved.getInt("collect"), offeringChoice = saved.getInt("offering"), afterCommunionChoice = saved.getInt("afterCommunion"), intercessionChoice = saved.getInt("intercession"), readingChoices = readings?.keySet()?.associateWith { readings.getInt(it) } ?: emptyMap())
                        restoredChoices = null
                    }
                    val resolved = try {
                        resolver.resolveForSelectedGospel(requireNotNull(selection))
                    } catch (error: IllegalArgumentException) {
                        if (!restoringChoices) throw error
                        selection = defaultSelection
                        resolver.resolveForSelectedGospel(requireNotNull(defaultSelection))
                    }
                    content = resolved
                    val prayers = documents.prayerChoices(day, requireNotNull(selection), resolved)
                    legacy?.let { saved ->
                        val prayer = prayers.firstOrNull { name(it) == saved.prayerName } ?: prayers.getOrNull(saved.prayerIndex)
                        ritualOptions = ritualOptions.copy(prayerId = prayer ?: "ep002", prefaceId = null)
                    }
                    if (ritualOptions.prayerId !in prayers) ritualOptions = ritualOptions.copy(prayerId = if ("ep002" in prayers) "ep002" else prayers.first(), prefaceId = null)
                    ritualOptions = ritualOptions.copy(replacingPrayerAvailable = "ep004" in prayers)
                    legacy?.let { ritualOptions = ritualOptions.copy(prefaceId = documents.prefaceChoices(resolved, ritualOptions).getOrNull(it.prefaceIndex)) }
                    if (ritualOptions.prefaceId !in documents.prefaceChoices(resolved, ritualOptions)) ritualOptions = ritualOptions.copy(prefaceId = null)
                    val dayOwner = if (documents.catalog[owner]?.dataset == "optional-masses.json") contextOptions.dayCelebrationId ?: day.primaryCelebration?.id?.value else owner
                    val selectedDay = day.copy(primaryCelebration = (listOfNotNull(day.primaryCelebration) + day.alternatives).singleOrNull { it.id.value == dayOwner })
                    val result = documents.mass(selectedDay, resolved, ritualOptions)
                    displayedDay = selectedDay
                    preferences.rememberMass(massPreferenceKey(), AppPreferences.MassChoices(contextOptions.formularyId, ritualOptions.prayerId, ritualOptions.prefaceId))
                    if (legacy != null) preferences.finishLegacyMassImport()
                    restoreMassPreferences = false
                    result
                }
                controls.clear()
                val title = resourceId?.let(::name) ?: when (ownerId) {
                    "om016" -> "Omša za zmierenie"
                    "om015" -> "Omša na Svätý rok 2025"
                    else -> ownerId?.takeIf { it.isNotEmpty() }?.let(::name) ?: day.primaryCelebration?.title ?: day.base.title
                }
                if (resourceId == null) massControls() else resourceControls(requireNotNull(resourceId))
                _state.value = state.value.copy(loading = false, title = title, blocks = blocks, controls = controls.toList(), resourceId = resourceId, error = null)
            } catch (error: IllegalArgumentException) {
                Log.e("Missa", "Unable to resolve $date/$ownerId/$resourceId", error)
                content = null
                controls.clear()
                if (::day.isInitialized) massControls()
                _state.value = state.value.copy(loading = false, controls = controls.toList(), error = "Vybraná kombinácia nie je dostupná.")
            }
        }
    }

    private fun withGeneratedCelebrations(row: CalendarDayRow, resolved: LiturgicalDay): CalendarDayRow {
        val celebrations = if (row.date == LiturgicalYear.of(row.date.year).easter.minusDays(1)) {
            val vigil = documents.items.single { it.dataset == "triduum-rites.json" && it.fields["rite"] == "EASTER_VIGIL" }
            row.celebrations.filterNot { it.id.isEmpty() || it.id == vigil.id } + generatedRows(resolved) +
                CelebrationRow(vigil.id, "Veľkonočná vigília", "Vigília", LiturgicalColor.WHITE)
        } else {
            val vigils = row.celebrations.filter { it.detail == "Vigília" }
            row.celebrations.filterNot { it.detail == "Vigília" } + generatedRows(resolved) + vigils
        }
        return row.copy(celebrations = celebrations)
    }

    private fun resolveSelectedDay(): LiturgicalDay {
        if (state.value.screen == Screen.MASS && ownerId == "") return calendar.resolve(date, evening = evening)
        val owner = ownerId?.takeIf { it.isNotEmpty() && state.value.screen == Screen.MASS }
        return if (owner != null) calendar.resolveCelebration(date, owner, jurisdiction?.let(::DioceseId), locality, cathedral, evening)
        else calendar.resolve(date, jurisdiction?.let(::DioceseId), locality, cathedral, evening)
    }

    private fun resetDay() {
        restoreMassPreferences = true
        restoredChoices = null
        ownerId = null; resourceId = null; selection = null; content = null
        contextOptions = CalendarMassSelection.Options(); ritualOptions = LiturgyDocuments.Options(prayerId = "ep002", quietPrayers = ritualOptions.quietPrayers); refresh()
    }

    private fun massControls() {
        button("Vybrať slávenie alebo omšu") {
            val celebrations = (listOfNotNull(day.primaryCelebration) + day.alternatives).map { it.id.value to it.title }
            val optional = availableMasses()
            val base = if (day.primaryCelebration == null) listOf("" to day.base.title) else emptyList()
            val year = LiturgicalYear.of(date.year)
            choose("Slávenie", base + celebrations + optional) { id ->
                val previousDay = celebrations.firstOrNull { it.first == selection?.properId }?.first ?: contextOptions.dayCelebrationId ?: day.primaryCelebration?.id?.value
                val dayOwner = if (id.isEmpty()) null else celebrations.firstOrNull { it.first == id }?.first ?: previousDay
                ownerId = if (id.isEmpty() && date in year.easter.minusDays(3)..year.easter.minusDays(1)) null else id
                restoreMassPreferences = true
                contextOptions = CalendarMassSelection.Options(dayCelebrationId = dayOwner)
                ritualOptions = LiturgyDocuments.Options(quietPrayers = ritualOptions.quietPrayers); selection = null; refresh()
            }
        }
        val year = LiturgicalYear.of(day.date.year)
        if (selection == null && date in year.easter.minusDays(3)..year.easter.minusDays(1)) {
            riteControls(when (date) {
                year.easter.minusDays(3) -> "HOLY_THURSDAY"
                year.easter.minusDays(2) -> "GOOD_FRIDAY"
                else -> if (evening) "EASTER_VIGIL" else "HOLY_SATURDAY_EXPOSITION"
            })
        }
        val current = selection ?: return
        val resolved = content ?: return
        val owner = current.properId ?: current.seasonalMassId
        val definition = owner?.let { resolver.definition(it, if (current.properId != null) current.properVariant else current.seasonalVariant) }
        val formularies = (definition?.get("formularyChoices") as? List<*>)?.map { it as Map<*, *> } ?: emptyList()
        if (formularies.isNotEmpty()) button("Vybrať formulár") { choose("Formulár", formularies.map { it["formularyId"] as String to (it["label"] as? String ?: name(it["formularyId"] as String)) }, contextOptions.formularyId ?: formularies.first()["formularyId"] as String, true) { id -> contextOptions = contextOptions.copy(formularyId = id); ritualOptions = ritualOptions.copy(prefaceId = null); refresh() } }
        else ownFormularyControl()
        for ((field, title) in listOf("entranceChantIds" to "Vstupný spev", "collectPrayerIds" to "Modlitba dňa", "offeringPrayerIds" to "Modlitba nad obetnými darmi", "communionChantIds" to "Spev na prijímanie", "afterCommunionPrayerIds" to "Modlitba po prijímaní")) {
            val ids = resolved.mass[field] as? List<*> ?: continue
            if (ids.size < 2 || field == "communionChantIds" && resolved.communionFollowsGospel) continue
            fun selectChant(n: Int) {
                selection = current.copy(entranceChoice = if (field == "entranceChantIds") n else current.entranceChoice, collectChoice = if (field == "collectPrayerIds") n else current.collectChoice, offeringChoice = if (field == "offeringPrayerIds") n else current.offeringChoice, communionChoice = if (field == "communionChantIds") n else current.communionChoice, afterCommunionChoice = if (field == "afterCommunionPrayerIds") n else current.afterCommunionChoice)
                refresh(false)
            }
            val selectedIndex = when (field) {
                "entranceChantIds" -> current.entranceChoice; "collectPrayerIds" -> current.collectChoice
                "offeringPrayerIds" -> current.offeringChoice; "communionChantIds" -> current.communionChoice
                else -> current.afterCommunionChoice
            }
            button(title, ids.mapIndexedNotNull { i, id -> if (i == selectedIndex) null else LiturgyAlternative(name(id as String)) { selectChant(i) } }) {
                choose(title, ids.mapIndexed { i, id -> i.toString() to name(id as String) }) { index -> selectChant(index.toInt()) }
            }
        }
        val readings = resolved.mass["lectionary"] as? Map<*, *>
        val choices = readings?.get("choices") as? Map<*, *> ?: emptyMap<Any, Any>()
        for ((slot, raw) in choices) {
            val available = (raw as List<*>).map { it as Map<*, *> }.withIndex().filter { slot != "gospel" || GospelChoiceAvailability.evaluate(it.value.entries.associate { e -> e.key as String to e.value }, current.gospelChoiceContext) == GospelChoiceAvailability.Result.AVAILABLE }
            if (available.size < 2) continue
            val title = when (slot) { "firstReading" -> "Prvé čítanie"; "secondReading" -> "Druhé čítanie"; "psalm" -> "Žalm"; "acclamation" -> "Verš pred evanjeliom"; else -> "Evanjelium" }
            fun label(option: Map<*, *>): String {
                val id = option["${slot}Id"] as String
                return (documents.catalog.getValue(id).fields["citation"] as? String)?.takeIf { it.isNotBlank() }
                    ?: option["label"] as? String ?: name(id)
            }
            fun selectReading(index: Int) {
                selection = current.copy(readingChoices = current.readingChoices + (slot as String to index), gospelStory = null)
                refresh(false)
            }
            button(title, available.filter { it.index != (current.readingChoices[slot] ?: 0) }.map { option -> LiturgyAlternative(label(option.value)) { selectReading(option.index) } }) {
                choose(title, available.map { it.index.toString() to label(it.value) }) { index -> selectReading(index.toInt()) }
            }
        }
        val intercessions = resolved.mass["intercessionChoices"] as? List<*>
        if (intercessions != null && intercessions.size > 1) button("Spoločné modlitby veriacich") { choose("Spoločné modlitby veriacich", intercessions.mapIndexed { i, value -> i.toString() to ((value as Map<*, *>)["label"] as? String ?: name(value["intercessionsId"] as String)) }) { index -> selection = current.copy(intercessionChoice = index.toInt()); refresh(false) } }
        button("Eucharistická modlitba") { choose("Eucharistická modlitba", documents.prayerChoices(day, current, resolved).map { it to name(it) }, ritualOptions.prayerId, true) { id -> ritualOptions = ritualOptions.copy(prayerId = id, prefaceId = null); refresh(false) } }
        val prefaces = documents.prefaceChoices(resolved, ritualOptions)
        if (prefaces.isNotEmpty()) button("Prefácia") { choose("Prefácia", prefaces.map { it to name(it) }, ritualOptions.prefaceId ?: prefaces.first(), true) { id -> ritualOptions = ritualOptions.copy(prefaceId = id); refresh(false) } }
        else button("Prefácia") { choose("Prefácia", listOf("none" to "Žiadna prefácia"), "none", true) {} }
        inlineReadingControls()
        button("Ďalšie možnosti omše") { extraOptions() }
    }

    private fun inlineReadingControls() {
        val selected = selection ?: return
        val resolved = content ?: return
        val week = LiturgicalYear.of(date.year).seasonalContext(date)?.week
        if (day.season == LiturgicalSeason.LENT && day.date.isSunday() && week in 3..5) {
            button(if (contextOptions.lentenReadingsFromCycleA) "Čítania z aktuálneho roku" else "Čítania z roku A") {
                contextOptions = contextOptions.copy(lentenReadingsFromCycleA = !contextOptions.lentenReadingsFromCycleA)
                refresh()
            }
        }
        val owners = listOfNotNull(selected.properId, resolved.mass["formularyId"] as? String)
        if (owners.any { id -> (documents.catalog.getValue(id).fields["contentVariants"] as? List<*>)?.any { (it as Map<*, *>)["key"] == "WITH_SECOND_READING" } == true }) {
            button(if (contextOptions.withSecondReading) "Vynechať druhé čítanie" else "Použiť druhé čítanie") {
                contextOptions = contextOptions.copy(withSecondReading = !contextOptions.withSecondReading); refresh()
            }
        }
        val generated = (documents.catalog[selected.properId]?.fields?.get("availability") as? Map<*, *>)?.get("generatedObservanceKey")
        if (generated in setOf("ember-days", "rogation-days")) {
            button(if (contextOptions.currentDayScripture) "Čítania kántrových alebo prosebných dní" else "Čítania dňa") {
                contextOptions = contextOptions.copy(currentDayScripture = !contextOptions.currentDayScripture); refresh()
            }
        }
        val choices = ((resolved.mass["lectionary"] as? Map<*, *>)?.get("choices") as? Map<*, *>)?.get("gospel") as? List<*> ?: emptyList<Any>()
        if (choices.any { ((it as Map<*, *>)["availability"] as? Map<*, *>)?.containsKey("previousSundayGospelId") == true }) {
            button("Evanjelium čítané minulú nedeľu") {
                choose("Evanjelium čítané minulú nedeľu", documents.items.filter { it.dataset == "gospels.json" }.map { it.id to name(it.id) }) { id ->
                    contextOptions = contextOptions.copy(previousSundayGospelId = id); refresh()
                }
            }
        }
    }

    private fun extraOptions() {
        val selected = selection ?: return
        val resolved = content ?: return
        val week = LiturgicalYear.of(date.year).seasonalContext(date)?.week
        val variantOwners = listOfNotNull(selected.properId, resolved.mass["formularyId"] as? String)
        val hasSecondReading = variantOwners.any { id -> (documents.catalog.getValue(id).fields["contentVariants"] as? List<*>)?.any { (it as Map<*, *>)["key"] == "WITH_SECOND_READING" } == true }
        val generated = (documents.catalog[selected.properId]?.fields?.get("availability") as? Map<*, *>)?.get("generatedObservanceKey")
        val readingChoices = ((resolved.mass["lectionary"] as? Map<*, *>)?.get("choices") as? Map<*, *>)?.get("gospel") as? List<*> ?: emptyList<Any>()
        val previousSundayRequired = readingChoices.any { ((it as Map<*, *>)["availability"] as? Map<*, *>)?.containsKey("previousSundayGospelId") == true }
        val choices = buildList {
            if (hasSecondReading) add("second" to "Použiť druhé čítanie")
            add("quiet" to "Tiché modlitby")
            if (day.season == LiturgicalSeason.LENT && day.date.isSunday() && week in 3..5) add("cycleA" to "Čítania z roku A")
            if (generated in setOf("ember-days", "rogation-days")) add("current" to "Čítania dňa namiesto kántrových alebo prosebných")
            if (previousSundayRequired) add("previous" to "Evanjelium čítané minulú nedeľu")
        }
        choose("Možnosti", choices) { key -> when (key) {
            "second" -> { contextOptions = contextOptions.copy(withSecondReading = !contextOptions.withSecondReading); refresh() }
            "current" -> { contextOptions = contextOptions.copy(currentDayScripture = !contextOptions.currentDayScripture); refresh() }
            "cycleA" -> { contextOptions = contextOptions.copy(lentenReadingsFromCycleA = !contextOptions.lentenReadingsFromCycleA); refresh() }
            "quiet" -> applySettings(settings.copy(quietPrayers = !settings.quietPrayers))
            "previous" -> choose("Evanjelium čítané minulú nedeľu", documents.items.filter { it.dataset == "gospels.json" }.map { it.id to name(it.id) }) { id -> contextOptions = contextOptions.copy(previousSundayGospelId = id); refresh() }
        } }
    }

    private fun availableMasses(): List<Pair<String, String>> = documents.items.filter { item ->
        item.dataset == "optional-masses.json" &&
            SpecialMassAvailability.isAvailable(item.id, day) &&
            (item.id != "om016" || day.season == LiturgicalSeason.LENT) &&
            (item.id != "om004" || day.season != LiturgicalSeason.LENT || !day.date.isSunday()) &&
            ((item.fields["availability"] as Map<*, *>)["kind"] == "USER_SELECTABLE" || day.generatedObservances.any { it.id == (item.fields["availability"] as Map<*, *>)["generatedObservanceKey"] })
    }.map { it.id to name(it.id) }

    private fun generatedRows(value: LiturgicalDay): List<CelebrationRow> = value.generatedObservances.mapNotNull { observance ->
        val rite = when (observance.id) {
            "altar-reservation" -> "GOOD_FRIDAY_REPOSITION"
            "holy-saturday-exposition" -> "HOLY_SATURDAY_EXPOSITION"
            "holy-saturday-adoration-end" -> "HOLY_SATURDAY_CONCLUSION"
            "easter-procession" -> "EASTER_SUNDAY_PROCESSION"
            else -> null
        }
        val item = documents.items.firstOrNull {
            if (rite != null) it.dataset == "triduum-rites.json" && it.fields["rite"] == rite
            else it.dataset == "optional-masses.json" && (it.fields["availability"] as? Map<*, *>)?.get("generatedObservanceKey") == observance.id
        } ?: return@mapNotNull null
        CelebrationRow(item.id, observance.title, "", observance.color)
    }

    fun openEntry(id: String) {
        if (documents.catalog.getValue(id).fields["category"] == "BLESSING_MENU") {
            _state.value = state.value.copy(blessingMenuId = id)
            refresh(false)
            return
        }
        if (state.value.screen == Screen.SPECIAL_MASSES) {
            require(entryAvailable(id)) { "Optional Mass is unavailable on $date: $id" }
            rememberPage()
            restoreMassPreferences = true
            ownerId = menuMassId(id); resourceId = null; restoredChoices = null; selection = null; content = null
            contextOptions = CalendarMassSelection.Options(dayCelebrationId = day.primaryCelebration?.id?.value)
            ritualOptions = LiturgyDocuments.Options(prayerId = "ep002", quietPrayers = ritualOptions.quietPrayers)
            navigate(Screen.MASS)
        } else openResource(id)
    }

    fun menuEntries(screen: Screen): List<ContentEntry> = when (screen) {
        Screen.SPECIAL_MASSES -> specialMassEntries()
        Screen.LANGUAGES -> languageEntries()
        Screen.BLESSINGS -> blessingEntries("od024")
        else -> emptyList()
    }

    private fun menuMassId(id: String) = if (id == "om004" && day.season == LiturgicalSeason.LENT && date.isSunday()) "om016" else id

    fun entryAvailable(id: String): Boolean = SpecialMassAvailability.isAvailable(menuMassId(id), day)

    fun openMenuEntry(screen: Screen, id: String) {
        if (screen == Screen.SPECIAL_MASSES) {
            if (!entryAvailable(id)) return
            rememberPage()
            _state.value = state.value.copy(languageMode = false, loading = true)
            returnScreen = state.value.screen
            ownerId = menuMassId(id); resourceId = null; selection = null; content = null; restoredChoices = null
            restoreMassPreferences = true
            contextOptions = CalendarMassSelection.Options(dayCelebrationId = day.primaryCelebration?.id?.value)
            ritualOptions = LiturgyDocuments.Options(prayerId = "ep002", quietPrayers = ritualOptions.quietPrayers)
            navigate(Screen.MASS)
        } else openResource(id)
    }

    private fun specialMassEntries() = listOf(
        ContentEntry("om004", "Omša za zmierenie"), ContentEntry("om006", "Omša za zosnulých"),
        ContentEntry("om007", "Omša v čase pandémie"), ContentEntry("om002", "Omša o Najsvätejšom Srdci Ježišovom"),
        ContentEntry("om003", "Spoločné omše preblahoslavenej Panny Márie"), ContentEntry("om015", "Omše na Svätý rok 2025"),
    )

    private fun languageEntries() = listOf(
        "lp002" to "Anglicky", "lp003" to "Francúzsky", "lp001" to "Chorvatsky",
        "lp007" to "Latinsky", "lp005" to "Maďarsky", "lp004" to "Nemecky",
        "lp008" to "Poľsky", "lp009" to "Španielsky", "lp006" to "Taliansky",
    ).map { ContentEntry(it.first, it.second) }

    private fun blessingEntries(id: String): List<ContentEntry> =
        (documents.catalog.getValue(id).fields["blocks"] as List<*>).flatMap { raw ->
            val block = raw as Map<*, *>
            val target = block["contentId"] as? String
            when {
                block["type"] == "REFERENCE" && target != null -> blessingEntries(target)
                target != null -> listOf(ContentEntry(target, name(target)))
                block["type"] == "HEADING" -> listOf(ContentEntry("", ((block["content"] as Map<*, *>)["html"] as String), heading = true))
                else -> emptyList()
            }
        }

    private fun openResource(id: String) {
        if (languageEntries().any { it.id == id }) {
            openLanguage(id)
            return
        }
        rememberPage()
        restoreMassPreferences = true
        resourceId = id; resourceInsertions = emptyMap()
        _state.value = state.value.copy(languageMode = false, loading = true)
        if (documents.catalog.getValue(id).dataset == "triduum-rites.json") ritualOptions = ritualOptions.copy(prayerId = "ep002", prefaceId = null)
        navigate(Screen.MASS)
    }

    private fun massPreferenceKey(riteId: String? = null): String {
        val owner = riteId ?: ownerId?.takeIf { it.isNotEmpty() } ?: day.primaryCelebration?.id?.value ?: "day"
        return "${date.year}-${date.month}-${date.dayOfMonth}|$owner|$jurisdiction|$locality|$cathedral|$evening"
    }

    private fun legacyChoicesForCelebration(): AppPreferences.LegacyMassChoices? {
        val owner = if (ownerId == "") null else ownerId ?: day.primaryCelebration?.id?.value
        val celebration = (listOfNotNull(day.primaryCelebration) + day.alternatives).firstOrNull { it.id.value == owner }
        // The old shared positions do not identify which optional Mass last wrote them.
        if (owner != null && celebration == null) return null
        return preferences.legacyMassChoices(date, celebration?.title ?: day.base.title)
    }

    private fun riteBlocks(id: String): List<Map<String, Any?>> {
        val hasPrayer = documents.catalog.getValue(id).fields["rite"] in setOf("HOLY_THURSDAY", "EASTER_VIGIL")
        val prayers = listOf("ep003", "ep002", "ep007")
        val remembered = if (hasPrayer && restoreMassPreferences) preferences.massChoices(massPreferenceKey(id)) else null
        val legacy = if (hasPrayer && restoreMassPreferences && remembered == null) legacyChoicesForCelebration() else null
        if (restoreMassPreferences) {
            val prayer = remembered?.prayerId ?: legacy?.let { saved -> prayers.firstOrNull { name(it) == saved.prayerName } ?: prayers.getOrNull(saved.prayerIndex) }
            ritualOptions = ritualOptions.copy(prayerId = prayer?.takeIf { it in prayers } ?: "ep002", prefaceId = null)
        }
        if (ritualOptions.prayerId !in prayers) ritualOptions = ritualOptions.copy(prayerId = "ep002", prefaceId = null)
        val blocks = documents.rite(id, day, ritualOptions, resourceInsertions)
        if (hasPrayer) {
            preferences.rememberMass(massPreferenceKey(id), AppPreferences.MassChoices(null, ritualOptions.prayerId, null))
            if (legacy != null) preferences.finishLegacyMassImport()
        }
        restoreMassPreferences = false
        return blocks
    }

    private fun ownFormularyControl() {
        button("Vybrať formulár") { choose("Formulár", listOf("own" to "Vlastný formulár"), "own", true) {} }
    }

    private fun riteControls(rite: String) {
        ownFormularyControl()
        val prayers = if (rite in setOf("HOLY_THURSDAY", "EASTER_VIGIL")) listOf("ep003", "ep002", "ep007") else emptyList()
        button("Eucharistická modlitba") {
            choose("Eucharistická modlitba", prayers.map { it to name(it) }, ritualOptions.prayerId, true) { prayer ->
                ritualOptions = ritualOptions.copy(prayerId = prayer); refresh(false)
            }
        }
        val preface = when (rite) { "HOLY_THURSDAY" -> "pf029"; "EASTER_VIGIL" -> "pf022"; else -> null }
        button("Prefácia") { choose("Prefácia", listOf((preface ?: "none") to (preface?.let(::name) ?: "Žiadna prefácia")), preface ?: "none", true) {} }
    }

    private fun resourceControls(id: String) {
        (documents.catalog.getValue(id).fields["rite"] as? String)?.let(::riteControls)
        val slots = linkedMapOf<String, List<Map<*, *>>>()
        val visited = mutableSetOf<String>()
        fun inspect(value: Any?) {
            when (value) {
                is Map<*, *> -> {
                    if (value["type"] == "INSERTION") slots[value["slot"] as String] = (value["variants"] as List<*>).map { it as Map<*, *> }
                    if (value["type"] == "REFERENCE") {
                        val reference = value["contentId"] as String
                        if (visited.add(reference)) inspect(documents.catalog.getValue(reference).fields)
                    }
                    value.values.forEach(::inspect)
                }
                is List<*> -> value.forEach(::inspect)
            }
        }
        inspect(documents.catalog.getValue(id).fields)
        slots.forEach { (slot, variants) ->
            button("Vybrať text") {
                choose("Možnosti textu", listOf("" to "Základný text") + variants.map { variant ->
                    val reference = variant["contentId"] as? String
                    val html = (variant["content"] as? Map<*, *>)?.get("html") as? String
                    (variant["key"] as String) to (reference?.let(::name) ?: html?.let { androidx.core.text.HtmlCompat.fromHtml(it, 0).toString().take(120) } ?: "Text")
                }) { key -> resourceInsertions = if (key.isEmpty()) resourceInsertions - slot else resourceInsertions + (slot to key); refresh() }
            }
        }
    }

    private fun name(id: String): String {
        val fields = documents.catalog.getValue(id).fields
        val rich = (fields["text"] ?: fields["body"]) as? Map<*, *>
        val first = ((fields["blocks"] as? List<*>)?.firstOrNull() as? Map<*, *>)?.get("content") as? Map<*, *>
        return (fields["name"] ?: fields["title"] ?: fields["citation"] ?: rich?.get("html") ?: first?.get("html") ?: sourceOpening(id) ?: when (fields["rite"]) {
            "HOLY_THURSDAY" -> "Štvrtok Pánovej večere"; "GOOD_FRIDAY" -> "Piatok utrpenia Pána"; "EASTER_VIGIL" -> "Veľkonočná vigília"; "EASTER_SUNDAY_PROCESSION" -> "Procesia na oslavu vzkrieseného Pána"; "GOOD_FRIDAY_REPOSITION" -> "Uloženie Oltárnej sviatosti"; "HOLY_SATURDAY_EXPOSITION" -> "Vyloženie Oltárnej sviatosti"; "HOLY_SATURDAY_CONCLUSION" -> "Ukončenie poklony v Božom hrobe"; else -> "Liturgický text"
        }).toString().let { androidx.core.text.HtmlCompat.fromHtml(it, androidx.core.text.HtmlCompat.FROM_HTML_MODE_LEGACY).toString().take(120) }
    }

    private fun sourceOpening(id: String, visited: MutableSet<String> = mutableSetOf()): String? {
        if (!visited.add(id)) return null
        val item = documents.catalog.getValue(id)
        for (field in listOf("name", "title", "citation")) (item.fields[field] as? String)?.takeIf { it.isNotBlank() }?.let { return it }
        ((item.fields["body"] ?: item.fields["text"]) as? Map<*, *>)?.get("html")?.let { return it as String }
        if (item.dataset != "ordinary-documents.json") return null
        return (item.fields["blocks"] as List<*>).firstNotNullOfOrNull { raw ->
            val block = raw as Map<*, *>
            val html = (block["content"] as? Map<*, *>)?.get("html") as? String
            html?.takeIf { androidx.core.text.HtmlCompat.fromHtml(it, 0).toString().isNotBlank() }
                ?: (block["contentId"] as? String)?.let { sourceOpening(it, visited) }
        }
    }

}
