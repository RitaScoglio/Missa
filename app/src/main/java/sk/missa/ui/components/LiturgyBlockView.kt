package sk.missa.ui.components

import android.app.AlertDialog
import android.content.Context
import android.graphics.Typeface
import android.graphics.text.LineBreaker
import android.os.Build
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.core.text.HtmlCompat
import sk.missa.R
import sk.missa.liturgy.document.LanguageContentResolver
import sk.missa.settings.AppSettings

/** The same renderer is used by the Mass, documents, popups and special rites. */
class LiturgyBlockView(
    private val context: Context,
    private val resource: (String) -> List<Map<String, Any?>>,
    private val massPart: (String) -> List<Map<String, Any?>>,
    private val bell: () -> Unit = {},
    private val bellsEnabled: Boolean = false,
    private val textSizeSp: Float = 16f,
    private val nightMode: Boolean = false,
    private val boldText: Boolean = false,
    private val serif: Boolean = false,
) {
    private val palette = MissaStyle(context, nightMode)

    fun append(parent: LinearLayout, blocks: List<Map<String, Any?>>, controls: List<LiturgyControl> = emptyList()) {
        var pendingBell = false
        val bellIconSize = dp((22f * textSizeSp / 16f).toInt())
        val bellTouchSize = maxOf(dp(40), bellIconSize + dp(12))
        val bellPadding = (bellTouchSize - bellIconSize) / 2
        fun bellButton() = ImageButton(context).apply {
            setImageResource(R.drawable.ic_bell); contentDescription = "Zvonček"
            imageTintList = android.content.res.ColorStateList.valueOf(palette.rubric)
            background = null; scaleType = ImageView.ScaleType.FIT_CENTER
            setPadding(bellPadding, bellPadding, bellPadding, bellPadding)
            setOnClickListener { bell() }
        }
        fun addContent(view: View) {
            if (!pendingBell) {
                parent.addView(view)
                return
            }
            val row = LinearLayout(context).apply { gravity = Gravity.CENTER_VERTICAL }
            row.addView(view, LinearLayout.LayoutParams(0, -2, 1f))
            row.addView(bellButton(), LinearLayout.LayoutParams(bellTouchSize, bellTouchSize))
            parent.addView(row)
            pendingBell = false
        }
        val remaining = controls.toMutableList()
        val intercessionIds = setOf("od047", "od048", "od049", "od050", "od051")
        val intercessions = blocks.filter { it["type"] == "POPUP" && it["contentId"] in intercessionIds }
        blocks.forEachIndexed { index, block ->
            val type = block["type"]
            if (intercessions.size == 5 && block in intercessions) {
                if (block == intercessions.first()) {
                    val title = "Prosby za zosnulých a rozličné potreby"
                    parent.addView(textView(block + ("content" to mapOf("html" to "$title (otvoriť)"))).apply {
                        setOnClickListener {
                            val menu = LinearLayout(context).apply { orientation = LinearLayout.VERTICAL; setPadding(dp(8), 0, dp(8), dp(16)) }
                            intercessions.forEach { entry -> menu.addView(textView(entry).apply {
                                setOnClickListener { popup(text.toString(), resource(entry["contentId"] as String)) }
                            }) }
                            missaDialog(context, title, settings(), menu)
                        }
                    })
                }
                return@forEachIndexed
            }
            when (type) {
                "TEXT", "HEADING", "SUBHEADING", "RUBRIC" -> addContent(textView(block))
                "SEPARATOR" -> parent.addView(View(context).apply { setBackgroundColor(rubricColor()) }, LinearLayout.LayoutParams(-1, dp(1)))
                "SPACER" -> parent.addView(View(context), LinearLayout.LayoutParams(-1, 12))
                "BELL" -> if (bellsEnabled) {
                    val previous = blocks.getOrNull(index - 1)
                    val previousStyle = previous?.get("style") as? Map<*, *>
                    val previousText = ((previous?.get("content") as? Map<*, *>)?.get("html") as? String).orEmpty()
                    if (previousStyle?.get("alignment") == "CENTER" && previousText.any { it.isLetter() } && previousText == previousText.uppercase()) {
                        parent.addView(bellButton(), LinearLayout.LayoutParams(bellTouchSize, bellTouchSize).apply { gravity = Gravity.END })
                    } else {
                        pendingBell = true
                    }
                }
                "POPUP" -> addContent(textView(block).apply {
                    setOnClickListener {
                        @Suppress("UNCHECKED_CAST")
                        val content = block["popupBlocks"] as? List<Map<String, Any?>> ?: resource(block["contentId"] as String)
                        popup(text.toString(), content)
                    }
                })
                "PARALLEL" -> {
                    val row = LinearLayout(context).apply { orientation = LinearLayout.HORIZONTAL }
                    (block["cells"] as List<*>).forEachIndexed { index, cell ->
                        row.addView(textView(block + ("content" to cell)).apply { if (index > 0 && (block["style"] as? Map<*, *>)?.get("alignment") != "CENTER") gravity = Gravity.END }, LinearLayout.LayoutParams(0, -2, 1f))
                    }
                    addContent(row)
                }
                "LANGUAGE_PARAGRAPH" -> {
                    val value = SpannableStringBuilder()
                    (block["runs"] as List<*>).forEach { raw ->
                        val run = raw as LanguageContentResolver.Run
                        val start = value.length
                        value.append(if (run.format == LanguageContentResolver.Format.HTML) rich(run.text) else run.text)
                        if (run.translation) {
                            value.setSpan(ForegroundColorSpan(rubricColor()), start, value.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                            value.setSpan(RelativeSizeSpan(0.75f), start, value.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                        }
                    }
                    parent.addView(TextView(context).apply { text = keepWordsTogether(value); textSize = textSizeSp; setTextColor(bodyColor()); typeface = Typeface.create(if (serif) "serif" else "sans-serif", if (boldText) Typeface.BOLD else Typeface.NORMAL); setTextIsSelectable(true); setLineSpacing(dp(3).toFloat(), 1.18f); setPadding(0, dp(4), 0, dp(4)) })
                }
                "MASS_PART" -> parent.addView(Button(context).apply {
                    val part = block["part"] as String
                    text = when (part) { "PREFACE" -> "Prefácia"; "EUCHARISTIC_PRAYER" -> "Eucharistická modlitba"; "COMMUNION_RITE" -> "Obrad prijímania"; else -> error("Unknown Mass part: $part") }
                    isAllCaps = false; textSize = textSizeSp; setTextColor(palette.accent); gravity = Gravity.CENTER; includeFontPadding = false
                    stateListAnimator = null; elevation = 0f
                    background = palette.touch(palette.tint, 14); setPadding(dp(16), dp(8), dp(16), dp(8)); minimumHeight = dp(48)
                    setOnClickListener { popup(text.toString(), massPart(part)) }
                })
                else -> error("Unresolved display block: $type")
            }
            val heading = when (type) {
                "HEADING", "SUBHEADING" -> (block["content"] as? Map<*, *>)?.get("html") as? String
                "PARALLEL" -> ((block["cells"] as? List<*>)?.firstOrNull() as? Map<*, *>)?.get("html") as? String
                else -> null
            }
            val matching = remaining.filter { it.title.equals(heading, ignoreCase = true) ||
                it.title == "Žalm" && heading.equals("Responzóriový žalm", ignoreCase = true) ||
                it.title == "Vstupný spev" && heading.equals("Úvodný spev", ignoreCase = true) ||
                heading.equals("Liturgia slova", ignoreCase = true) && (it.title.startsWith("Čítania ") || it.title in setOf("Použiť druhé čítanie", "Vynechať druhé čítanie")) ||
                heading.equals("Evanjelium", ignoreCase = true) && it.title == "Evanjelium čítané minulú nedeľu" }
            matching.forEach { control ->
                val label = if (control.title.startsWith("Čítania ") || control.title in setOf("Použiť druhé čítanie", "Vynechať druhé čítanie", "Evanjelium čítané minulú nedeľu")) control.title else "Alebo (vybrať)"
                val alternatives = control.alternatives.ifEmpty { listOf(LiturgyAlternative(label, control.select)) }
                alternatives.forEach { alternative -> parent.addView(textView(mapOf("type" to "POPUP", "content" to mapOf("html" to if (control.alternatives.isEmpty()) label else "Alebo: ${alternative.title}"),
                    "style" to mapOf("color" to "RED", "padding" to "SMALL"))).apply {
                    contentDescription = "Vybrať: ${control.title}: ${alternative.title}"; setOnClickListener { alternative.select() }
                }) }
                remaining.remove(control)
            }
        }
        if (pendingBell) parent.addView(bellButton(), LinearLayout.LayoutParams(bellTouchSize, bellTouchSize).apply { gravity = Gravity.END })
        remaining.forEach { control -> parent.addView(textView(mapOf("type" to "TEXT", "content" to mapOf("html" to control.title),
            "style" to mapOf("color" to "RED", "padding" to "SMALL"))).apply { setOnClickListener { control.select() } }) }
    }

    fun textView(block: Map<String, Any?>): TextView {
        val style = block["style"] as? Map<*, *> ?: emptyMap<Any, Any>()
        val html = (block["content"] as Map<*, *>)["html"] as String
        return TextView(context).apply {
            text = keepWordsTogether(if (style["format"] == "PLAIN_TEXT") html else rich(html))
            textSize = if (style["size"] == "SMALL") textSizeSp * 0.75f else textSizeSp
            setTextColor(if (style["color"] == "RED") rubricColor() else bodyColor())
            val bold = boldText || (style["bold"] as? Boolean ?: (block["type"] == "HEADING"))
            val italic = style["italic"] as? Boolean ?: false
            val faceStyle = when { bold && italic -> Typeface.BOLD_ITALIC; bold -> Typeface.BOLD; italic -> Typeface.ITALIC; else -> Typeface.NORMAL }
            typeface = Typeface.create(if (serif) "serif" else "sans-serif", faceStyle)
            gravity = if (style["alignment"] == "CENTER") Gravity.CENTER else Gravity.START
            if (Build.VERSION.SDK_INT >= 26) justificationMode = if (style["alignment"] == "JUSTIFY") LineBreaker.JUSTIFICATION_MODE_INTER_WORD else LineBreaker.JUSTIFICATION_MODE_NONE
            includeFontPadding = false
            setLineSpacing(dp(3).toFloat(), 1.16f)
            val heading = block["type"] in setOf("HEADING", "SUBHEADING")
            val padding = when (style["padding"]) { "SMALL" -> 6; "BIG" -> 12; else -> 3 }
            setPadding(0, dp(if (heading) 24 else padding), 0, dp(if (heading) 10 else padding))
            if (block["type"] == "POPUP") {
                background = palette.touch(palette.tint, 12)
                gravity = Gravity.START or Gravity.CENTER_VERTICAL
                setPadding(dp(12), dp(8), dp(12), dp(8)); minimumHeight = dp(48)
                layoutParams = LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(4); bottomMargin = dp(4) }
            }
        }
    }

    private fun popup(title: String, blocks: List<Map<String, Any?>>) {
        val column = LinearLayout(context).apply { orientation = LinearLayout.VERTICAL; setPadding(dp(16), dp(8), dp(16), dp(8)) }
        column.setBackgroundColor(palette.surface)
        append(column, blocks)
        val heading = TextView(context).apply {
            text = title.removeSuffix(" (otvoriť)"); textSize = scaledTextSize(20f, textSizeSp); setTextColor(rubricColor())
            typeface = Typeface.create(if (serif) "serif" else "sans-serif", Typeface.BOLD)
            setPadding(dp(24), dp(20), dp(24), dp(12))
        }
        AlertDialog.Builder(context).setCustomTitle(heading).setView(ScrollView(context).apply { addView(column) })
            .setNegativeButton("Zrušiť", null).show().apply {
                window?.setBackgroundDrawable(palette.shape(palette.surface, 24))
                window?.setLayout(minOf(dp(560), context.resources.displayMetrics.widthPixels - dp(32)), -2)
                getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(if (nightMode) bodyColor() else rubricColor())
                getButton(AlertDialog.BUTTON_NEGATIVE).applyMissaTextSize(scaledTextSize(14f, textSizeSp))
            }
    }

    private fun settings() = AppSettings(fontSize = textSizeSp.toInt(), nightMode = nightMode, boldText = boldText, serif = serif)

    private fun dp(value: Int) = (value * context.resources.displayMetrics.density).toInt()
    private fun rich(value: String): Spanned {
        val rubric = Integer.toHexString(rubricColor()).takeLast(6)
        val html = if (nightMode) value.replace("<font color='#A32626'>", "<font color='#$rubric'>") else value
        return HtmlCompat.fromHtml(html, HtmlCompat.FROM_HTML_MODE_COMPACT)
    }
    private fun keepWordsTogether(text: CharSequence): CharSequence {
        val result = SpannableStringBuilder(text)
        val words = Regex("(?iu)(?<![\\p{L}\\p{N}])(?:[\\p{L}]|vo|zo|so|ku|na|do|od|po|za|zo|pre|pri|bez|cez|nad|pod|pred|medzi) +(?=[\\p{L}\\p{N}])")
        words.findAll(text).toList().asReversed().forEach { match ->
            val space = match.range.last
            result.replace(space, space + 1, "\u00a0")
        }
        return result
    }
    private fun rubricColor() = palette.rubric
    private fun bodyColor() = palette.ink
}
