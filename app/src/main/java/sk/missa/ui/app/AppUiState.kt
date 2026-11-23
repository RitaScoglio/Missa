package sk.missa.ui.app

import sk.missa.ui.components.LiturgyControl

import sk.missa.calendar.LiturgicalDate
import sk.missa.settings.AppSettings
import sk.missa.ui.calendar.CalendarDayRow
import sk.missa.ui.navigation.Screen

data class ContentEntry(val id: String, val title: String, val heading: Boolean = false)
data class ChoiceDialogState(
    val title: String,
    val values: List<Pair<String, String>>,
    val select: (String) -> Unit,
    val selectedId: String? = null,
    val confirm: Boolean = false,
)
data class AppUiState(
    val loading: Boolean = true,
    val title: String = "",
    val blocks: List<Map<String, Any?>> = emptyList(),
    val controls: List<LiturgyControl> = emptyList(),
    val error: String? = null,
    val screen: Screen = Screen.HOME,
    val drawerOpen: Boolean = false,
    val dialog: ChoiceDialogState? = null,
    val settings: AppSettings = AppSettings(),
    val selectedDate: LiturgicalDate? = null,
    val calendarMonth: LiturgicalDate? = null,
    val days: List<CalendarDayRow> = emptyList(),
    val entries: List<ContentEntry> = emptyList(),
    val sourceScreen: Screen = Screen.HOME,
    val massOptionsOpen: Boolean = true,
    val blessingMenuId: String = "od024",
    val resourceId: String? = null,
    val hasSelectedMass: Boolean = false,
    val languageId: String? = null,
    val languageMode: Boolean = false,
)

