package sk.missa

import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.os.Bundle
import android.util.Pair
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import sk.missa.interfaces.Texty

class Options : Main() {

    private lateinit var optionIntent: Pair<String, String>

    override fun onResume() {
        if(optionIntent.first == null) {
            settings = applicationContext.getSharedPreferences("OptionsData", 0)
            optionIntent = Pair(settings.getString("type", ""), settings.getString("text", ""))
        }
        setAll()
        super.onResume()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                drawer = findViewById(R.id.drawer_layout)
                drawer.closeDrawer(GravityCompat.START)
                return true
            }

            R.id.menu_uvod -> {
                drawer = findViewById(R.id.drawer_layout)
                drawer.closeDrawer(GravityCompat.START)
                zIntent = true
                val uvod = Intent(this, Uvod::class.java)
                startActivity(uvod)
                return true
            }

            R.id.menu_omse -> {
                drawer = findViewById(R.id.drawer_layout)
                drawer.closeDrawer(GravityCompat.START)
                vyberOmsu(this)
                return true
            }

            R.id.menu_kalendar -> {
                drawer = findViewById(R.id.drawer_layout)
                drawer.closeDrawer(GravityCompat.START)
                zIntent = true
                val kalendar = Intent(this, Kalendar::class.java)
                startActivity(kalendar)
                return true
            }

            R.id.menu_odpovede -> {
                drawer = findViewById(R.id.drawer_layout)
                drawer.closeDrawer(GravityCompat.START)
                vyberJazyk(this)
                return true
            }

            R.id.menu_pozehnania -> {
                drawer = findViewById(R.id.drawer_layout)
                drawer.closeDrawer(GravityCompat.START)
                vyberPozehnania()
                return true
            }

            R.id.menu_font -> {
                drawer = findViewById(R.id.drawer_layout)
                drawer.closeDrawer(GravityCompat.START)
                vyberFont(this)
                return true
            }

            R.id.menu_fullscreen -> {
                switch_fullscreen.isChecked = !switch_fullscreen.isChecked
                fullscreen = switch_fullscreen.isChecked
                putFullscreen()
                setFullscreen()
                return true
            }

            R.id.menu_rezim -> {
                switch_rezim.isChecked = !switch_rezim.isChecked
                nightMode = switch_rezim.isChecked
                menuRezim()
                putRezim()
                vypis()
                return true
            }

            R.id.menu_pismo -> {
                switch_pismo.isChecked = !switch_pismo.isChecked
                pismo = switch_pismo.isChecked
                putPismo()
                vypis()
                return true
            }

            R.id.menu_zvoncek -> {
                switch_zvoncek.isChecked = !switch_zvoncek.isChecked
                zvoncek = switch_zvoncek.isChecked
                putZvoncek()
                return true
            }

            R.id.menu_tiche_modlitby -> {
                switch_ticheModlitby.isChecked = !switch_ticheModlitby.isChecked
                ticheModlitby = switch_ticheModlitby.isChecked
                putTicheModlitby()
                return true
            }

            R.id.menu_info -> {
                drawer = findViewById(R.id.drawer_layout)
                drawer.closeDrawer(GravityCompat.START)
                otvorDialog()
                return true
            }
        }
        return true
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //nastaví písmo v celej aplikácií - pätkové alebo bezpätkové
        getThemeStyle()
        setTheme(themeStyle)
        setContentView(R.layout.activity_options)

        settings = applicationContext.getSharedPreferences("OptionsData", 0)
        optionIntent = Pair(settings.getString("type", ""), settings.getString("text", ""))

        //nastavenie menu
        setBottomMenu(this)

        setAll()

        vypis()

    }

    private fun setAll(){
        //nastaví toolbar, fullscreen a režim v menu
        val toolbarTitle = when(optionIntent.first){
            "bless" -> "Požehnania"
            "language" -> "Odpovede v cudzích jazykoch"
            "specialMass" -> "Špeciálne omše"
            else -> optionIntent.first
        }
        setToolbar(toolbarTitle)
        setFullscreen()
        menuRezim()

        //nastavenia v menu po stlačení switch tlačidla alebo obrazku pre priblíženie/oddialenie
        switch_fullscreen.setOnCheckedChangeListener { buttonView, isChecked ->
            fullscreen = isChecked
            putFullscreen()
            setFullscreen()
        }
        switch_pismo.setOnCheckedChangeListener { buttonView, isChecked ->
            pismo = isChecked
            putPismo()
            vypis()
        }
        switch_rezim.setOnCheckedChangeListener { buttonView, isChecked ->
            nightMode = isChecked
            menuRezim()
            putRezim()
            vypis()
        }
        switch_zvoncek.setOnCheckedChangeListener { buttonView, isChecked ->
            zvoncek = isChecked
            putZvoncek()
            vypis()
        }
        switch_ticheModlitby.setOnCheckedChangeListener { buttonView, isChecked ->
            ticheModlitby = isChecked
            putTicheModlitby()
            vypis()
        }
        image_zoomIn.setOnClickListener {
            zoomIn()
            putVelkost()
            vypis()
        }
        image_zoomOut.setOnClickListener {
            zoomOut()
            putVelkost()
            vypis()
        }
    }

    private fun vypis() {
        if (nightMode)
            drawer.setBackgroundColor(Color.BLACK)
        else
            drawer.setBackgroundColor(resources.getColor(R.color.background))
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val message = parseMessage()

        val adapter = MassTextAdapter(message)
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        recyclerView.setAdapter(adapter)
        adapter.setOnItemClickListener { view ->
            val viewHolder = view.tag as RecyclerView.ViewHolder
            val position = viewHolder.adapterPosition
            val massText = message.get(position)
            when (massText.onClickOpenDialog) {
                "bless" -> blessAction(massText.text!!, massText.nextLevelText[1])
                "language" -> languageAction(position)
                "specialMass" -> specialMassAction(position)
            }
        }
    }

    private fun parseMessage(): List<MassText> {
        val message: MutableList<MassText> = mutableListOf()
        when (optionIntent.first) {
            "bless" -> parseBless(message)
            "language" -> parseMenu(message, "language", jazyky)
            "specialMass" -> parseMenu(message, "specialMass", omse)
            else -> parseBlessing(message)
        }
        return message
    }

    private fun blessAction(title: String, text: String) {
        settings = applicationContext.getSharedPreferences("OptionsData", 0)
        val editor = settings.edit()
        editor.putString("type", title).apply()
        editor.putString("text", text).apply()
        newActivity(Intent(this, Options::class.java))
    }
    private fun specialMassAction(position: Int) {
        val settings = getSharedPreferences("MySviatok", 0)
        val zmierenie: Boolean = settings.getBoolean("zmierenie", false)
        getSavedMass(settings)
        when (position) {
            0 -> //Omša za zmierenie
                if (zmierenie) {
                    newActivity(Intent(this, MisalZmierenie::class.java))
                } else {
                    showToast()
                }
            1 -> //Omša za zosnulých
                newActivity(Intent(this, MisalZosnuly::class.java))
            2 -> //Omša v čase pandémie
                if (zmierenie) {
                    newActivity(Intent(this, MisalPandemia::class.java))
                } else {
                    showToast()
                }
            3 -> //Omša o najsätejšom Srdci Ježišovom
                newActivity(Intent(this, MisalSrdceJC::class.java))
            4 -> //Spoločné omše preblahoslavenej Panny Márie
                newActivity(Intent(this, MisalPM::class.java))
            else -> //Spoločné omše preblahoslavenej Panny Márie
                newActivity(Intent(this, MisalSvatyRok::class.java))
        }
    }

    private fun languageAction(position: Int) {
        jazyk = position
        newActivity(Intent(this, Jazyky::class.java))

    }

    private fun parseBless(message: MutableList<MassText>) {
        for (bless in Texty.pozehnania_menu) {
            if (bless.size == 1)
                message.add(MassText(bless[0], "center|red|bigPadding"))
            else
                message.add(MassText(bless[0], "smallPadding", bless.drop(0), "bless"))
        }
    }

    private fun parseBlessing(message: MutableList<MassText>) {
        message.add(MassText(optionIntent.second, "html"))
    }

    private fun parseMenu(message: MutableList<MassText>, type: String, list: Array<String>) {
        for (part in list) {
            message.add(MassText(part, "bigPadding", type))
        }
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

    private fun newActivity(intent: Intent) {
        startActivity(intent)
        //(context as Activity).finish()
    }

    fun showToast() {
        val inflater = LayoutInflater.from(this).inflate(R.layout.toast_layout, null, false).findViewById<View>(R.id.toast)
        val toast = Toast(this)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.duration = Toast.LENGTH_LONG
        toast.setView(inflater)
        toast.show()
    }

    fun openToday(view: View?) {
        zIntent = true
        val misal = Intent(applicationContext, Uvod::class.java)
        startActivity(misal)
    }

    fun openCalendar(view: View?) {
        val kalendar = Intent(applicationContext, Kalendar::class.java)
        startActivity(kalendar)
    }

    fun openSpecialMass(view: View?) {
        if(optionIntent.first != "specialMass") {
            settings = applicationContext.getSharedPreferences("OptionsData", 0)
            val editor = settings.edit()
            editor.putString("type", "specialMass").apply()
            editor.putString("text", "").apply()
            val options = Intent(applicationContext, Options::class.java)
            startActivity(options)
        }
    }

    fun openBlessing(view: View?) {
        if(optionIntent.first != "bless") {
            settings = applicationContext.getSharedPreferences("OptionsData", 0)
            val editor = settings.edit()
            editor.putString("type", "bless").apply()
            editor.putString("text", "").apply()
            val options = Intent(applicationContext, Options::class.java)
            startActivity(options)
        }
    }

    fun openLanguages(view: View?) {
        if(optionIntent.first != "language") {
            settings = applicationContext.getSharedPreferences("OptionsData", 0)
            val editor = settings.edit()
            editor.putString("type", "language").apply()
            editor.putString("text", "").apply()
            val options = Intent(applicationContext, Options::class.java)
            startActivity(options)
        }
    }
}