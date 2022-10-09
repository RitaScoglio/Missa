package sk.missa

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Build
import androidx.core.content.ContextCompat
import android.text.Html
import android.text.Layout.JUSTIFICATION_MODE_INTER_WORD
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.*
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import sk.missa.Main.*
import java.util.*

class MassTextAdapter(private val textList: ArrayList<MassText>) :
    RecyclerView.Adapter<MassTextAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var parent: LinearLayout

        init {
            parent = view.findViewById(R.id.parent_linear_layout)
            view.tag = this
            view.setOnClickListener(mOnItemClickListener)
        }

        fun bind(massText: MassText) {
            parent.removeAllViews()
            if (massText.isBell && Main.zvoncek) {
                val image = ImageView(parent.context)
                image.setBackgroundResource(R.drawable.bell)
                val size = dpToPx(parent.context, sizeZ)
                val layoutParams = LinearLayout.LayoutParams(size, size)
                layoutParams.gravity = Gravity.END
                image.layoutParams = layoutParams
                image.setOnClickListener(View.OnClickListener {
                    val mMediaPlayer: MediaPlayer =
                        MediaPlayer.create(parent.context, R.raw.zvoncek)
                    mMediaPlayer.start()
                })
                parent.addView(image)
            } else if (massText.isDivider) {
                val view = View(parent.context)
                view.layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    dpToPx(parent.context, 1)
                )
                view.setBackgroundColor(
                    ContextCompat.getColor(
                        view.context,
                        R.color.primary
                    )
                )
                parent.addView(view)
            } else if (massText.isSpace) {
                parent.setPadding(0, 6, 0, 6)
            /*} else if (massText.isSpannable) {
                createSpannableTextView(massText.separateText, massText.appearance)*/
            } else if (massText.isSeparateViews) {
                parent.orientation = LinearLayout.HORIZONTAL
                for (i in 0 until massText.getSeparateTextLength()) {
                    var gravity = Gravity.START
                    if (i != 0)
                        gravity = Gravity.END
                    createNewTextView(
                        massText.separateText[i],
                        massText.getSeparateTextLength().toFloat(),
                        massText.isHTML,
                        massText.appearance,
                        gravity
                    )
                }
            } else {
                massText.text?.let {
                    createNewTextView(
                        it,
                        1f,
                        massText.isHTML,
                        massText.appearance,
                        Gravity.START
                    )
                }
            }
        }

        fun dpToPx(context: Context, dp: Int): Int {
            val density: Float = context.getResources()
                .getDisplayMetrics().density
            return Math.round(dp.toFloat() * density)
        }

        /*private fun createSpannableTextView(separateText: List<String>, appearance: List<String>) {
            val textView = TextView(parent.context)
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            textView.layoutParams = params
            setAppearanceFromMenu(textView)
            for (index in separateText.indices) {
                if (index % 2 == 0) {
                    val spannable = SpannableString(separateText[index])
                    spannable.setSpan(ForegroundColorSpan(farba_r), 0, spannable.length, 0)
                    textView.append(spannable)
                } else
                    textView.append(separateText[index])
            }
            setAppearance(textView,appearance)
            parent.addView(textView)
        }*/

        private fun createNewTextView(
            text: String,
            weight: Float,
            isHtml: Boolean,
            appearance: List<String>,
            gravity: Int
        ) {
            val textView = TextView(parent.context)
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT, weight
            )
            textView.layoutParams = params
            setAppearanceFromMenu(textView)
            if (isHtml)
                textView.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    Html.fromHtml(nahrad(text), Html.FROM_HTML_MODE_COMPACT)
                } else {
                    Html.fromHtml(nahrad(text))
                }
            else
                textView.text = text
            textView.textSize = sizeO.toFloat()
            textView.gravity = gravity
            setAppearance(textView, appearance)
            parent.addView(textView)
        }

        private fun setAppearanceFromMenu(textView: TextView) {
            if (nightMode)
                textView.setTextColor(
                    ContextCompat.getColor(
                        textView.context,
                        R.color.background
                    )
                )
            else
                textView.setTextColor(Color.BLACK)
            if (pismo)
                textView.typeface = typeBold
        }

        @SuppressLint("WrongConstant")
        private fun setAppearance(textView: TextView, appearance: List<String>) {
            for (appear in appearance) {
                when (appear) {
                    "red" -> {
                        if (nightMode)
                            textView.setTextColor(
                                ContextCompat.getColor(
                                    textView.context,
                                    R.color.primary_light
                                )
                            )
                        else
                            textView.setTextColor(
                                ContextCompat.getColor(
                                    textView.context,
                                    R.color.primary
                                )
                            )
                    }
                    "justify" -> {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            textView.justificationMode = JUSTIFICATION_MODE_INTER_WORD
                        }
                    }
                    "small" -> {
                        textView.textSize = (sizeO * 0.75).toFloat()
                    }
                    "bold" -> {
                        textView.typeface = typeBold
                    }
                    "center" -> {
                        textView.gravity = Gravity.CENTER
                    }
                    "italic" -> {
                        if (pismo)
                            textView.typeface = typeBoldItalic
                        else
                            textView.typeface = typeItalic
                    }
                    "bigPadding" -> {
                        textView.setPadding(0, 16, 0, 16)
                    }
                    "smallPadding" -> {
                        textView.setPadding(0, 8, 0, 8)
                    }
                }
            }
        }
    }

    fun setOnItemClickListener(itemClickListener: View.OnClickListener?) {
        mOnItemClickListener = itemClickListener
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.mass_text_view, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(textList[position])
    }

    override fun getItemCount(): Int {
        return textList.size
    }

    companion object {
        private var mOnItemClickListener: View.OnClickListener? = null
    }
}
