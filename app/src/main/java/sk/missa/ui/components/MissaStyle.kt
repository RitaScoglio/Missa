package sk.missa.ui.components

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.RippleDrawable
import android.view.ViewGroup
import android.widget.Button

fun scaledTextSize(baseSizeSp: Float, selectedSizeSp: Float) = baseSizeSp * selectedSizeSp / 16f

fun Button.applyMissaTextSize(sizeSp: Float) {
    textSize = sizeSp
    includeFontPadding = true
    isSingleLine = false
    layoutParams = layoutParams.apply { height = ViewGroup.LayoutParams.WRAP_CONTENT }
    minimumHeight = (48 * resources.displayMetrics.density).toInt()
    val verticalPadding = (8 * resources.displayMetrics.density).toInt()
    setPadding(paddingLeft, verticalPadding, paddingRight, verticalPadding)
}

/** Shared surfaces and contrast for application chrome and liturgical reading. */
class MissaStyle(private val context: Context, val dark: Boolean) {
    val canvas = Color.parseColor(if (dark) "#000000" else "#F6EFDF")
    val surface = Color.parseColor(if (dark) "#1B1B1B" else "#FFFAF0")
    val chrome = Color.parseColor(if (dark) "#57191E" else "#80242B")
    val chromeInk = Color.parseColor("#FFF4DF")
    val chromeMuted = Color.parseColor("#EAD2BF")
    val ink = Color.parseColor(if (dark) "#F3EFE7" else "#24211F")
    val muted = Color.parseColor(if (dark) "#C1B8BD" else "#75685A")
    val accent = Color.parseColor(if (dark) "#F3E7CF" else "#80242B")
    val switchOn = Color.parseColor(if (dark) "#FF9C86" else "#80242B")
    val switchOff = Color.parseColor(if (dark) "#A9A3A6" else "#75685A")
    val rubric = Color.parseColor(if (dark) "#F26C63" else "#A32626")
    val tint = Color.parseColor(if (dark) "#39262D" else "#F4E8D2")
    val line = Color.parseColor(if (dark) "#494046" else "#DDD5B2")
    fun dp(value: Int) = (value * context.resources.displayMetrics.density).toInt()
    fun shape(color: Int = surface, radius: Int = 20, outlined: Boolean = false) = GradientDrawable().apply {
        setColor(color)
        cornerRadius = dp(radius).toFloat()
        if (outlined) setStroke(dp(1), line)
    }
    fun touch(color: Int = surface, radius: Int = 16) = RippleDrawable(
        ColorStateList.valueOf(if (dark || color == chrome) 0x22FFFFFF else 0x1480242B), shape(color, radius), shape(Color.WHITE, radius))
}
