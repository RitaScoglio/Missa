package sk.missa.calendar

import java.util.Calendar
import java.util.GregorianCalendar
import java.util.TimeZone

data class LiturgicalDate(
    val year: Int,
    val month: Int,
    val dayOfMonth: Int,
) : Comparable<LiturgicalDate> {
    init {
        calendar().time
    }

    fun plusDays(days: Int): LiturgicalDate = shiftedBy(days)

    fun minusDays(days: Int): LiturgicalDate = shiftedBy(-days)

    fun isSunday(): Boolean = calendar().get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY

    fun weekdayNumber(): Int = calendar().get(Calendar.DAY_OF_WEEK) - Calendar.SUNDAY

    fun daysUntil(other: LiturgicalDate): Int =
        ((other.calendar().timeInMillis - calendar().timeInMillis) / 86_400_000L).toInt()

    override fun compareTo(other: LiturgicalDate): Int = calendar().compareTo(other.calendar())

    private fun shiftedBy(days: Int): LiturgicalDate = calendar().apply {
        add(Calendar.DAY_OF_YEAR, days)
    }.let { of(it.get(Calendar.YEAR), it.get(Calendar.MONTH) + 1, it.get(Calendar.DAY_OF_MONTH)) }

    private fun calendar(): GregorianCalendar = GregorianCalendar(TimeZone.getTimeZone("UTC")).apply {
        clear()
        isLenient = false
        set(year, month - 1, dayOfMonth)
    }

    companion object {
        fun of(year: Int, month: Int, dayOfMonth: Int) = LiturgicalDate(year, month, dayOfMonth)
    }
}
