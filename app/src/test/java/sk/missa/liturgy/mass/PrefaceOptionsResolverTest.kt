package sk.missa.liturgy.mass

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test
import sk.missa.data.assets.DatasetIntegrity

class PrefaceOptionsResolverTest {
    private val resolver = PrefaceOptionsResolver(
        listOf(
            prayer("ep003"),
            prayer("ep002", "APPEND_WHEN_ALLOWED", "pf035", true),
            prayer("ep004", "REPLACE_ALL", "pf031"),
            prayer("ep005", "PREPEND", "pf084"),
            prayer("ep006", "PREPEND", "pf085"),
        ),
    )
    private val allowed = mapOf("prefaceIds" to listOf("pf039", "pf040"), "allowEucharisticPrayerTwoPreface" to true)
    private val disallowed = allowed + ("allowEucharisticPrayerTwoPreface" to false)

    @Test
    fun unselectedAndSecondPrayerAppendOnlyWhenAllowed() {
        assertEquals(listOf("pf039", "pf040", "pf035"), resolver.resolve(allowed))
        assertEquals(listOf("pf039", "pf040", "pf035"), resolver.resolve(allowed, "ep002"))
        assertEquals(listOf("pf039", "pf040"), resolver.resolve(disallowed))
        assertEquals(listOf("pf039", "pf040"), resolver.resolve(disallowed, "ep002"))
        assertEquals(listOf("pf039", "pf040"), resolver.resolve(allowed, "ep003"))
    }

    @Test
    fun reconciliationPrecedesTheMassOptionsAndFourthPrayerReplacesThem() {
        assertEquals(listOf("pf084", "pf039", "pf040"), resolver.resolve(disallowed, "ep005"))
        assertEquals(listOf("pf085", "pf039", "pf040"), resolver.resolve(disallowed, "ep006"))
        assertEquals(listOf("pf031"), resolver.resolve(disallowed, "ep004", true))
        assertThrows(IllegalArgumentException::class.java) { resolver.resolve(disallowed, "ep004", false) }
        assertThrows(IllegalArgumentException::class.java) { resolver.resolve(disallowed, "ep004") }
    }

    @Test
    fun unknownPermissionsAndOptionsAreNotAssumed() {
        assertThrows(IllegalStateException::class.java) { resolver.resolve(mapOf("prefaceIds" to emptyList<String>())) }
        assertThrows(IllegalArgumentException::class.java) { resolver.resolve(emptyMap()) }
        assertThrows(IllegalArgumentException::class.java) { resolver.resolve(allowed, "ep999") }
    }

    private fun prayer(id: String, mode: String? = null, preface: String? = null, unselected: Boolean = false) =
        DatasetIntegrity.Item(
            "eucharistic-prayers.json",
            id,
            if (mode == null) emptyMap() else mapOf(
                "prefaceUse" to mode,
                "prefaceIds" to listOf(preface),
                "offerPrefaceWhenPrayerUnselected" to unselected,
            ),
        )
}
