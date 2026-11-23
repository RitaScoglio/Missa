package sk.missa.ui.calendar

import sk.missa.calendar.LiturgicalDate
import sk.missa.calendar.celebration.LiturgicalColor

data class CelebrationRow(val id: String, val title: String, val detail: String, val color: LiturgicalColor)
data class CalendarDayRow(val date: LiturgicalDate, val celebrations: List<CelebrationRow>)
