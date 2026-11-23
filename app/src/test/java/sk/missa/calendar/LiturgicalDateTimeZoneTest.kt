package sk.missa.calendar

import java.util.TimeZone
import org.junit.Assert.assertEquals
import org.junit.Test

class LiturgicalDateTimeZoneTest {
    @Test
    fun calendarDatesRemainValidAcrossLocalMidnightTransitions() {
        val original = TimeZone.getDefault()
        try {
            TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"))
            val day = LiturgicalDate.of(2018, 11, 4)
            assertEquals(LiturgicalDate.of(2018, 11, 5), day.plusDays(1))
            assertEquals(LiturgicalDate.of(2018, 11, 3), day.minusDays(1))
            assertEquals(0, day.weekdayNumber())
        } finally {
            TimeZone.setDefault(original)
        }
    }
}
