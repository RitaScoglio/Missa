package sk.missa.settings

data class AppSettings(
    val jurisdiction: String? = null,
    val locality: String? = null,
    val cathedral: Boolean = false,
    val evening: Boolean = false,
    val bells: Boolean = false,
    val fontSize: Int = 16,
    val nightMode: Boolean = false,
    val boldText: Boolean = false,
    val fullscreen: Boolean = false,
    val serif: Boolean = false,
    val quietPrayers: Boolean = false,
)
