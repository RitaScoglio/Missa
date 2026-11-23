package sk.missa.liturgy.mass

import org.junit.Assert.assertEquals
import org.junit.Test
import sk.missa.liturgy.mass.GospelChoiceAvailability.Context
import sk.missa.liturgy.mass.GospelChoiceAvailability.MassTime
import sk.missa.liturgy.mass.GospelChoiceAvailability.Result
import sk.missa.liturgy.mass.GospelChoiceAvailability.SundayCycle

class GospelChoiceAvailabilityTest {
    @Test
    fun lentRequiresBothCycleCAndTheActualPreviousReading() {
        val choice = mapOf("availability" to mapOf("sundayCycle" to "C", "previousSundayGospelId" to "g204"))
        assertEquals(Result.NEEDS_CONTEXT, GospelChoiceAvailability.evaluate(choice, Context(sundayCycle = SundayCycle.C)))
        assertEquals(Result.UNAVAILABLE, GospelChoiceAvailability.evaluate(choice, Context(sundayCycle = SundayCycle.B)))
        assertEquals(Result.UNAVAILABLE, GospelChoiceAvailability.evaluate(choice, Context(
            sundayCycle = SundayCycle.C, previousSundayGospelId = "g201",
        )))
        assertEquals(Result.AVAILABLE, GospelChoiceAvailability.evaluate(choice, Context(
            sundayCycle = SundayCycle.C, previousSundayGospelId = "g204",
        )))
    }

    @Test
    fun eveningChoiceRequiresTheMassTime() {
        val choice = mapOf("availability" to mapOf("massTime" to "EVENING"))
        assertEquals(Result.NEEDS_CONTEXT, GospelChoiceAvailability.evaluate(choice, Context()))
        assertEquals(Result.UNAVAILABLE, GospelChoiceAvailability.evaluate(choice, Context(massTime = MassTime.DAY)))
        assertEquals(Result.AVAILABLE, GospelChoiceAvailability.evaluate(choice, Context(massTime = MassTime.EVENING)))
        assertEquals(Result.AVAILABLE, GospelChoiceAvailability.evaluate(emptyMap(), Context()))
    }
}
