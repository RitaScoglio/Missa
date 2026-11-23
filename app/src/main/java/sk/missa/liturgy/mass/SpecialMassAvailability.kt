package sk.missa.liturgy.mass

import sk.missa.calendar.LiturgicalDay
import sk.missa.calendar.LiturgicalSeason
import sk.missa.calendar.LiturgicalYear
import sk.missa.calendar.celebration.CelebrationRank

/** Replaces the old mutable day-eligibility flag with a decision for the selected day. */
object SpecialMassAvailability {
    fun isAvailable(id: String, day: LiturgicalDay): Boolean {
        if (id == "om016") return day.season == LiturgicalSeason.LENT
        if (id !in setOf("om004", "om007")) return true
        if (id == "om004" && day.season == LiturgicalSeason.LENT && day.date.isSunday()) return false
        val rank = day.primaryCelebration?.rank
        if (rank in setOf(CelebrationRank.FEAST, CelebrationRank.SOLEMNITY, CelebrationRank.VIGIL)) return false
        val year = LiturgicalYear.of(day.date.year)
        val easterOctave = day.date in year.easter..year.easter.plusDays(7)
        val christmasOctave = day.date.month == 12 && day.date.dayOfMonth >= 25 || day.date.month == 1 && day.date.dayOfMonth == 1
        if (easterOctave || christmasOctave) return false
        return !day.date.isSunday() || day.season == LiturgicalSeason.LENT
    }
}
