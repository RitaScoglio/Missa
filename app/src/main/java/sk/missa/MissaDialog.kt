package sk.missa

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import sk.missa.interfaces.Texty

class MissaDialog internal constructor(var context: Context, var title: String, var text: List<String>, var type: String) {

    init {
        createDialog()
    }

    fun createDialog() {
        val dialog: Dialog = Dialog(context)
        dialog.setContentView(R.layout.custom_dialog)
        val dialogTitle: TextView = dialog.findViewById<TextView>(R.id.dialog_title)
        val dialogText: RecyclerView = dialog.findViewById<RecyclerView>(R.id.dialog_text)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        if (Main.nightMode) {
            dialog.findViewById<LinearLayout>(R.id.dialog_layout).setBackgroundResource(R.drawable.dialog_background_night)
        } else {
            dialog.findViewById<LinearLayout>(R.id.dialog_layout).setBackgroundResource(R.drawable.dialog_background_day)
        }

        dialogTitle.text = title

        val message = parseMessage()

        val adapter = MassTextAdapter(message)
        dialogText.setLayoutManager(LinearLayoutManager(context))
        dialogText.setAdapter(adapter)
        adapter.setOnItemClickListener { view ->
            val viewHolder = view.tag as RecyclerView.ViewHolder
            val position = viewHolder.adapterPosition
            val massText = message.get(position)
            when (massText.onClickOpenDialog) {
                "bless" -> MissaDialog(context, massText.text!!, massText.nextLevelText, "bless")
                "language" -> languageAction(position)
                "specialMass" -> specialMassAction(position)
                "font" -> fontAction(position)
        }
        }

        dialog.show()
    }

    private fun parseMessage(): List<MassText> {
        val message: MutableList<MassText> = mutableListOf()
        when (type) {
            "menu_blessTypes" -> parseBlessingsType(message)
            "bless" -> parseBlessing(message)
            "menu_language" -> parseMenu(message, "language")
            "menu_special_mass" -> parseMenu(message, "specialMass")
            "menu_font" -> parseMenu(message, "font")
            "about" -> parseAbout(message)
        }
        return message
    }

    private fun fontAction(position: Int) {
        var typeface = ""
        when(position){
            0 -> {
                Main.themeStyle = R.style.SansSerifTheme
                typeface = "sans-serif";}
            1 -> {
                Main.themeStyle = R.style.SerifTheme
                typeface = "serif" }
        }
        putFont()
        Main.setTypefaces(typeface)
        (context as Activity).recreate()

    }

    private fun specialMassAction(position: Int) {
        val settings = context.getSharedPreferences("MySviatok", 0)
        val zmierenie: Boolean = settings.getBoolean("zmierenie", false)
        getSavedMass(settings)
        when (position) {
            0 -> //Omša za zmierenie
                if (zmierenie) {
                    newActivity(Intent(context, MisalZmierenie::class.java))
                } else {
                    showToast()
                }
            1 -> //Omša za zosnulých
                newActivity(Intent(context, MisalZosnuly::class.java))
            2 -> //Omša v čase pandémie
                if (zmierenie) {
                    newActivity(Intent(context, MisalPandemia::class.java))
                } else {
                    showToast()
                }
            3 -> //Omša o najsätejšom Srdci Ježišovom
                newActivity(Intent(context, MisalSrdceJC::class.java))
            4 -> //Spoločné omše preblahoslavenej Panny Márie
                newActivity(Intent(context, MisalPM::class.java))
            else -> //Spoločné omše preblahoslavenej Panny Márie
                newActivity(Intent(context, MisalSvatyRok::class.java))
        }
    }

    private fun languageAction(position: Int) {
        Main.jazyk = position
        newActivity(Intent(context, Jazyky::class.java))

    }

    private fun parseMenu(message: MutableList<MassText>, type: String) {
        for (part in text) {
            message.add(MassText(part, "bigPadding", type))
        }
    }

    private fun parseAbout(message: MutableList<MassText>) {
        for (part in text) {
            message.add(MassText(part, "bigPadding|html"))
        }
    }

    private fun parseBlessingsType(message: MutableList<MassText>) {
        for (bless in Texty.pozehnania_menu) {
            if (bless.size == 1)
                message.add(MassText(bless[0], "center|red|bigPadding"))
            else
                message.add(MassText(bless[0], "smallPadding", bless.drop(0), "bless"))
        }
    }

    private fun parseBlessing(message: MutableList<MassText>) {
        message.add(MassText(text[1], "html"))
    }

    fun getSavedMass(settings: SharedPreferences) {
        val gson = Gson()
        val json: String = settings.getString("special-omsa", "")!!
        val w = gson.fromJson(json, Calendar::class.java)
        Main.ID = w.id
        Main.den = w.day
        Main.tyzden = w.tyzden
        Main.pozicia_eucharistia = 1
        Main.menoSvatca = w.menoSvatca
        Main.slavenie = w.slavenie
        Main.obdobie = w.obdobie
        Main.pozicia_formular = 0.also { Main.pozicia_prefacia = it }
        Main.preface = false
        Main.euchText = ""
        Main.C = false.also { Main.VN = it }.also { Main.P = it }.also { Main.V = it }.also { Main.A = it }
    }

fun putFont() {
    val settings = context.getSharedPreferences("MySviatok", 0)
    val editor: SharedPreferences.Editor = settings.edit()
    editor.putInt("pozicia_font", Main.pozicia_font).apply()
}

    private fun newActivity(intent: Intent) {
        context.startActivity(intent)
        //(context as Activity).finish()
    }

    fun showToast() {
        val inflater = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false).findViewById<View>(R.id.toast)
        val toast = Toast(context)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.duration = Toast.LENGTH_LONG
        toast.setView(inflater)
        toast.show()
    }
}

