package sk.missa.liturgy.mass

import sk.missa.calendar.SeasonalDayContext

/** Transfers calendar coordinates without reinterpreting source codes or calculating dates. */
object SeasonalCalendarAdapter {
    fun context(day: SeasonalDayContext): SeasonalMassSelector.Context =
        SeasonalMassSelector.Context(
            season = day.season,
            dayOfWeek = SeasonalMassSelector.DayOfWeek.entries[day.weekdayNumber],
            week = day.week,
            cycle = SeasonalMassSelector.Cycle.valueOf(day.sundayCycle),
            month = day.month,
            dayOfMonth = day.dayOfMonth,
        )
}
