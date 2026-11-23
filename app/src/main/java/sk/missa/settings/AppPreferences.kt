package sk.missa.settings

import android.content.Context
import org.json.JSONObject
import sk.missa.calendar.LiturgicalDate

/** Preferences outlive the application session; dates and Mass choices belong to saved state. */
class AppPreferences(context: Context) {
    // Keep the existing storage name so installed users retain their saved preferences.
    private val preferences = context.getSharedPreferences("reader", Context.MODE_PRIVATE)
    private val legacy = context.getSharedPreferences("MySviatok", Context.MODE_PRIVATE)

    init {
        if (!preferences.getBoolean("legacyAppearanceImported", false)) {
            val previous = legacy.all
            val editor = preferences.edit()
            for ((old, current) in mapOf("pismo" to "boldText", "rezim" to "nightMode", "zvoncek" to "bells", "fullscreen" to "fullscreen", "ticheModlitby" to "quietPrayers")) {
                val value = previous[old] as? Boolean
                if (!preferences.contains(current) && value != null) editor.putBoolean(current, value)
            }
            (previous["sizeO"] as? Int)?.let { if (!preferences.contains("fontSize")) editor.putInt("fontSize", it.coerceIn(12, 36)) }
            (previous["pozicia_font"] as? Int)?.let { if (!preferences.contains("serif")) editor.putBoolean("serif", it == 1) }
            editor.putBoolean("legacyAppearanceImported", true).apply()
        }
    }

    data class MassChoices(val formularyId: String?, val prayerId: String?, val prefaceId: String?)
    data class LegacyMassChoices(val formularyIndex: Int, val prayerIndex: Int, val prefaceIndex: Int, val prayerName: String?)

    fun massChoices(key: String): MassChoices? = preferences.getString("mass.$key", null)?.let { encoded ->
        runCatching {
            val value = JSONObject(encoded)
            fun id(field: String) = value.optString(field).takeIf { it.isNotEmpty() }
            MassChoices(id("formulary"), id("prayer"), id("preface"))
        }.getOrNull()
    }

    fun rememberMass(key: String, value: MassChoices) {
        val encoded = JSONObject().put("formulary", value.formularyId).put("prayer", value.prayerId).put("preface", value.prefaceId).toString()
        if (preferences.getString("mass.$key", null) != encoded) preferences.edit().putString("mass.$key", encoded).apply()
    }

    /** Positional choices can be interpreted only against the same legacy day and celebration. */
    fun legacyMassChoices(date: LiturgicalDate, title: String): LegacyMassChoices? {
        if (preferences.getBoolean("legacyMassImported", false)) return null
        val previous = legacy.all
        if (previous["rok"] != date.year || previous["m"] != date.month - 1 || previous["den"] != date.dayOfMonth) return null
        fun normalized(value: String) = value.trim().replace(Regex("\\s+"), " ")
        val previousTitle = previous["menoSvatca"] as? String ?: return null
        if (!normalized(previousTitle).equals(normalized(title), ignoreCase = true)) return null
        if (listOf("poz_form", "poz_euch", "poz_pref").none(previous::containsKey)) return null
        return LegacyMassChoices(previous["poz_form"] as? Int ?: 0, previous["poz_euch"] as? Int ?: 1,
            previous["poz_pref"] as? Int ?: 0, (previous["euchText"] as? String)?.takeIf { it.isNotBlank() })
    }

    fun finishLegacyMassImport() { preferences.edit().putBoolean("legacyMassImported", true).apply() }

    fun read(systemNight: Boolean) = AppSettings(
        jurisdiction = preferences.getString("jurisdiction", null),
        locality = preferences.getString("locality", null),
        cathedral = preferences.getBoolean("cathedral", false),
        evening = preferences.getBoolean("evening", false),
        bells = preferences.getBoolean("bells", false),
        fontSize = preferences.getInt("fontSize", 16).coerceIn(12, 36),
        nightMode = preferences.getBoolean("nightMode", systemNight),
        boldText = preferences.getBoolean("boldText", false),
        fullscreen = preferences.getBoolean("fullscreen", false),
        serif = preferences.getBoolean("serif", false),
        quietPrayers = preferences.getBoolean("quietPrayers", false),
    )

    fun write(value: AppSettings) {
        preferences.edit().apply {
            putString("jurisdiction", value.jurisdiction)
            putString("locality", value.locality)
            putBoolean("cathedral", value.cathedral)
            putBoolean("evening", value.evening)
            putBoolean("bells", value.bells)
            putInt("fontSize", value.fontSize)
            putBoolean("nightMode", value.nightMode)
            putBoolean("boldText", value.boldText)
            putBoolean("fullscreen", value.fullscreen)
            putBoolean("serif", value.serif)
            putBoolean("quietPrayers", value.quietPrayers)
        }.apply()
    }
}
