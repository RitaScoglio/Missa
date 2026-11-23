package sk.missa.ui.components

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import android.view.ViewGroup
import android.view.Window
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import sk.missa.R
import sk.missa.settings.AppSettings

/** Shared surfaces for menus, information and document dialogs. */
fun missaDialog(context: Context, title: String, settings: AppSettings, content: LinearLayout): Dialog {
    fun dp(value: Int) = (value * context.resources.displayMetrics.density).toInt()
    val palette = MissaStyle(context, settings.nightMode)
    val panel = LinearLayout(context).apply {
        orientation = LinearLayout.VERTICAL
        background = palette.shape(palette.surface, 24)
        clipToOutline = true
    }
    panel.addView(TextView(context).apply {
        text = title; textSize = scaledTextSize(22f, settings.fontSize.toFloat()); setTextColor(palette.ink)
        typeface = Typeface.create(if (settings.serif) "serif" else "sans-serif", Typeface.BOLD)
        setPadding(dp(24), dp(24), dp(24), dp(20))
    }, LinearLayout.LayoutParams(-1, -2))
    panel.addView(ScrollView(context).apply { addView(content) }, LinearLayout.LayoutParams(-1, -2))
    return Dialog(context, R.style.Theme_Missa_Popup).apply {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(panel)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setCanceledOnTouchOutside(true)
        show()
        window?.setLayout(minOf(dp(560), context.resources.displayMetrics.widthPixels - dp(32)), ViewGroup.LayoutParams.WRAP_CONTENT)
        window?.setDimAmount(0.42f)
        if (context is LifecycleOwner) {
            val observer = object : DefaultLifecycleObserver {
                override fun onDestroy(owner: LifecycleOwner) { dismiss() }
            }
            context.lifecycle.addObserver(observer)
            setOnDismissListener { context.lifecycle.removeObserver(observer) }
        }
    }
}
