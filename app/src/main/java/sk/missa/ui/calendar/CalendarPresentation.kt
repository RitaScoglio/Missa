package sk.missa.ui.calendar

import sk.missa.calendar.LiturgicalCalendar
import sk.missa.calendar.LiturgicalDate
import sk.missa.calendar.LiturgicalDay
import sk.missa.calendar.LiturgicalYear
import sk.missa.calendar.celebration.CelebrationRank
import sk.missa.calendar.celebration.DioceseId
import sk.missa.settings.AppSettings

/** Produces the same selectable observances for Today and the month list. */
object CalendarPresentation {
    fun rows(day: LiturgicalDay): List<CelebrationRow> = buildList {
        val triduum = day.date in LiturgicalYear.of(day.date.year).easter.minusDays(3)..LiturgicalYear.of(day.date.year).easter.minusDays(1)
        if (day.primaryCelebration == null) add(CelebrationRow("", day.base.title, if (day.base.isSunday || triduum) "" else "Féria", day.base.color))
        (listOfNotNull(day.primaryCelebration) + day.alternatives).forEach {
            val rank = when (it.rank) {
                CelebrationRank.SOLEMNITY -> "Slávnosť"
                CelebrationRank.FEAST -> "Sviatok"
                CelebrationRank.MEMORIAL -> "Spomienka"
                CelebrationRank.OPTIONAL_MEMORIAL -> "Ľubovoľná spomienka"
                CelebrationRank.VIGIL -> "Vigília"
                CelebrationRank.VOTIVE_MASS -> "Votívna omša"
            }
            add(CelebrationRow(it.id.value, it.title, rank, it.color))
        }
    }

    /** The old calendar lists both daytime celebrations and selectable evening vigils. */
    fun day(calendar: LiturgicalCalendar, date: LiturgicalDate, settings: AppSettings, decorate: (CalendarDayRow, LiturgicalDay) -> CalendarDayRow = { row, _ -> row }): CalendarDayRow {
        val morning = calendar.resolve(date, settings.jurisdiction?.let(::DioceseId), settings.locality, settings.cathedral, false)
        val general = if (settings.jurisdiction == null && settings.locality == null && !settings.cathedral) morning else calendar.resolve(date)
        val evening = calendar.resolve(date, settings.jurisdiction?.let(::DioceseId), settings.locality, settings.cathedral, true)
        val vigils = (listOfNotNull(evening.primaryCelebration) + evening.alternatives).filter { it.rank == CelebrationRank.VIGIL }
            .map { CelebrationRow(it.id.value, it.title, "Vigília", it.color) }
        val local = rows(morning.copy(primaryCelebration = null, alternatives = calendar.localCelebrations(date))).filter { it.id.isNotEmpty() }
        val tomorrow = date.plusDays(1)
        val nextDay = calendar.resolve(tomorrow, settings.jurisdiction?.let(::DioceseId), settings.locality, settings.cathedral)
        val nextCelebrations = (rows(nextDay) + rows(nextDay.copy(primaryCelebration = null, alternatives = calendar.localCelebrations(tomorrow)))).filter { it.detail == "Slávnosť" || nextDay.base.isSunday && it.id == (nextDay.primaryCelebration?.id?.value ?: "") }.distinctBy { it.id }
        val generatedVigils = if (vigils.isNotEmpty() || date == LiturgicalYear.of(date.year).easter.minusDays(1)) emptyList() else
            nextCelebrations.map { it.copy(id = "vigil:${it.id}", detail = "Vigília") }
        val row = CalendarDayRow(date, (rows(general) + rows(morning) + local + vigils + generatedVigils).distinctBy { it.id })
        return decorate(row, if (settings.evening) evening else morning)
    }

    fun month(calendar: LiturgicalCalendar, first: LiturgicalDate, settings: AppSettings, decorate: (CalendarDayRow, LiturgicalDay) -> CalendarDayRow = { row, _ -> row }): List<CalendarDayRow> = buildList {
        var date = LiturgicalDate.of(first.year, first.month, 1)
        while (date.month == first.month && date.year == first.year) {
            add(day(calendar, date, settings, decorate))
            date = date.plusDays(1)
        }
    }

    fun shiftMonth(first: LiturgicalDate, amount: Int): LiturgicalDate {
        val month = java.time.YearMonth.of(first.year, first.month).plusMonths(amount.toLong())
        return LiturgicalDate.of(month.year, month.monthValue, 1)
    }
}
