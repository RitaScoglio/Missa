package sk.missa.ui.navigation

enum class Screen { HOME, CALENDAR, MASS, SPECIAL_MASSES, BLESSINGS, LANGUAGES }

enum class AppDestination(val title: String, val screen: Screen) {
    TODAY("Dnes", Screen.HOME), CALENDAR("Kalendár", Screen.CALENDAR),
    SPECIAL_MASSES("Špeciálne omše", Screen.SPECIAL_MASSES),
    BLESSINGS("Požehnania", Screen.BLESSINGS), LANGUAGES("Jazyky", Screen.LANGUAGES)
}
