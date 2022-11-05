package sk.missa;

import static sk.missa.interfaces.Texty.pozehnania_menu;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import sk.missa.interfaces.Svatci;

abstract public class Main extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, Svatci {

    public static int den, m, rok;
    public static String menoSvatca, ID, slavenie, obdobie;
    public static int tyzden;
    public static int pozicia_formular, pozicia_eucharistia, pozicia_prefacia, pozicia_font;
    public static boolean preface;
    public static String euchText, prefText;
    public static int sizeN, sizeO, sizeZ;
    public static DateTime mP, mVN, mDS, mD, mSP, mNT, mTK, mNSJ, mSPM, msvJ, mZP, mJK, mvDS, mPM, mNP,
            mSR, mNNP, mZJ, mKKP, mZacA, mZJactual, mKKPactual, mNPactual, mZacAactual, mVNactual,
            mJanKrstitel, mJanKrstitelVigilia, mVyrocieNitra;
    public static boolean C, A, V, P, VN;
    public static boolean pismo, nightMode, zvoncek, fullscreen, ticheModlitby;
    public static int farba_b, farba_r;
    public static boolean uvodLayout;
    public static Integer jazyk, omsa, themeStyle;
    static Typeface typeNormal, typeBold, typeItalic, typeBoldItalic;
    public String[] jazyky = {"Anglicky", "Francúzsky", "Chorvatsky", "Latinsky", "Maďarsky", "Nemecky", "Poľsky", "Španielsky", "Taliansky"};
    public String[] omse = {"Omša za zmierenie", "Omša za zosnulých", "Omša v čase pandémie", "Omša o Najsvätejšom Srdci Ježišovom", "Spoločné omše preblahoslavenej Panny Márie"};
    public String[] upravy = {"Úpravy v omšovom poriadku", "Prvá eucharistická modlitba", "Druhá eucharistická modlitba", "Tretia eucharistická modlitba", "Štvrtá eucharistická modlitba"};
    public String[] fonty = {"bezpätkové", "pätkové"};
    public NavigationView navigationView;
    public SwitchCompat switch_pismo, switch_rezim, switch_zvoncek, switch_fullscreen, switch_ticheModlitby;
    public ImageButton image_zoomIn, image_zoomOut;
    public DrawerLayout drawer;
    public SharedPreferences settings;
    public static boolean zIntent;
    public static int zvuk;
    static int vnd, vnm, psd, psm, dsd, dsm, zacAd, zacAm, nvpm, nvpd;
    int index, dvt, cezrok, post, velkanoc, advent, vianoce;
    /**
     * @param pm - Panna Mária v sobotu
     * @param prvyPiatok - Najsvätejšie Srdce Ježišovo na prvý piatok
     */
    boolean pm, prvyPiatok, prvyStvrtok;
    String d;
    Calendar nedela, feria;
    Date datum = new Date();
    java.util.Calendar dnes = java.util.Calendar.getInstance();

    public static String nahrad(String text) {
        if (nightMode)
            return text.replace("B71C1C", "D20607");
        else
            return text.replace("B71C1C", "80242B"); //predtym - 9C0E0F
    }

    /*public void setZvuk() {
        amanager = (AudioManager) getSystemService(AUDIO_SERVICE);
        zvuk = amanager.getRingerMode();
        amanager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
    }

    public void unsetZvuk() {
        amanager = (AudioManager) getSystemService(AUDIO_SERVICE);
        amanager.setRingerMode(zvuk);
    }*/

    //vyber specialnej omse v menu
    public void vyberOmsu(final Context context) {
        new MissaDialog(this, "Špeciálne omše", Arrays.asList(omse), "menu_special_mass");
    }

    //Odpovede v cudzích jazykov - menu
    public void vyberJazyk(final Context context) {
        new MissaDialog(this, "Odpovede v cudzích jazykoch", Arrays.asList(jazyky), "menu_language");
    }

    //Požehnania - menu
    public void vyberPozehnania() {
        new MissaDialog(this, "Požehnania", new ArrayList<>(), "menu_blessTypes");
    }

    //Výber fontu pre aplikáciu - menu
    public void vyberFont(final Context context) {
        new MissaDialog(this, "Typ písma", Arrays.asList(fonty), "menu_font");
    }

    public static void setTypefaces(String typeface) {
        typeNormal = Typeface.create(typeface, Typeface.NORMAL);
        typeBold = Typeface.create(typeface, Typeface.BOLD);
        typeItalic = Typeface.create(typeface, Typeface.ITALIC);
        typeBoldItalic = Typeface.create(typeface, Typeface.BOLD_ITALIC);
    }


    //získa themeStyle, ak je táto premenná prázdna
    public void getThemeStyle() {
        if (themeStyle == null) {
            settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
            pozicia_font = settings.getInt("pozicia_font", 0);
            String typeface;
            switch (pozicia_font) {
                default:
                case 0:
                    themeStyle = R.style.SansSerifTheme;
                    typeface = "sans-serif";
                    break;
                case 1:
                    themeStyle = R.style.SerifTheme;
                    typeface = "serif";
                    break;
            }
            setTypefaces(typeface);
        }
    }

    //Otvorí dialógové okno s informáciami o aplikácii - menu
    public void otvorDialog() {
        new MissaDialog(this, "O aplikácii", Arrays.asList("Aplikácia nenahrádza platne vydané a schválené liturgické texty.<br>" +
                "Je určená iba pre prípravu, nie je určená na slávenie svätej omše.",
                "Texty sú prevzaté z Rímskeho misála, Výňatku z Rímskeho misála, Lekcionárov a Spoločných modlitieb veriacich.<br>" +
                        "Text © Konferencia biskupov slovenska (KBS).<br>" +
                        "Texty sú publikované s vedomím KBS ako pracovná verzia.",
                "Prosím, podeľte sa s nami o svoje skúsenosti a postrehy na adrese:<br>" +
                        "<a href=\"mailto:missa.svk@gmail.com\">missa.svk@gmail.com</a>.",
                "© 2013-" + rok + " Rita & Ing. Páter"), "about");
    }

    //zväčší písmo
    public void zoomIn() {
        sizeN = sizeN + 2;
        sizeO = sizeO + 2;
        sizeZ = sizeZ + 5;
    }

    //zmenší písmo
    public void zoomOut() {
        sizeN = sizeN - 2;
        sizeO = sizeO - 2;
        sizeZ = sizeZ - 5;
    }

    //nastaví dátum a uloží do premenných
    public void setDate() {
        dnes.setTime(datum);
        den = dnes.get(java.util.Calendar.DAY_OF_MONTH);
        m = dnes.get(java.util.Calendar.MONTH);
        rok = dnes.get(java.util.Calendar.YEAR);
    }

    //uloží dátum otorenia aplikácie
    public void setOpenDate() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("denOpen", den).apply();
        editor.putInt("mOpen", m).apply();
        editor.putInt("rokOpen", rok).apply();
    }

    //nastaví premenné po otvorení na základe uložených informácii
    public void setSetting() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        boolean firstOpen = settings.getBoolean("firstOpen", true);
        try {
            pismo = settings.getBoolean("pismo", false);
            nightMode = settings.getBoolean("rezim", false);
            zvoncek = settings.getBoolean("zvoncek", false);
            fullscreen = settings.getBoolean("fullscreen", false);
            ticheModlitby = settings.getBoolean("ticheModlitby", false);
            sizeO = settings.getInt("sizeO", 16);
            sizeN = settings.getInt("sizeN", 24);
            sizeZ = settings.getInt("sizeZ", 35);
        } catch (ClassCastException ignored) {
            SharedPreferences.Editor editor = settings.edit();
            editor.clear().apply();
            pismo = settings.getBoolean("pismo", false);
            nightMode = settings.getBoolean("rezim", false);
            zvoncek = settings.getBoolean("zvoncek", false);
            fullscreen = settings.getBoolean("fullscreen", false);
            ticheModlitby = settings.getBoolean("ticheModlitby", false);
            sizeO = settings.getInt("sizeO", 16);
            sizeN = settings.getInt("sizeN", 24);
            sizeZ = settings.getInt("sizeZ", 35);
        }
        if (firstOpen) {
            int s = (sizeO - 16) / 2 * 5;
            sizeZ = 35 + s;
            firstOpen = false;
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean("firstOpen", firstOpen).apply();
            editor.putInt("sizeZ", sizeZ).apply();
        }
        int s = (sizeO - 16) / 2 * 5;
        sizeZ = 35 + s;
    }

    //uloží fullscreen
    public void putFullscreen() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("fullscreen", fullscreen).apply();
    }

    //uloží tučné písmo
    public void putPismo() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("pismo", pismo).apply();
    }

    //ulozí nočný režim
    public void putRezim() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("rezim", nightMode).apply();
    }

    //uloží zobrazovanie zvončekov
    public void putZvoncek() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("zvoncek", zvoncek).apply();
    }

    //uloží zobrazovanie tichých modlitieb
    public void putTicheModlitby() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("ticheModlitby", ticheModlitby).apply();
    }

    //uloží veľkosť písma
    public void putVelkost() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("sizeO", sizeO).apply();
        editor.putInt("sizeN", sizeN).apply();
        editor.putInt("sizeZ", sizeZ).apply();
    }

    //zisti, ci bola po aktualizacii prvykrat otvorena app
    //ak je aplikácia otvorena prvykrat po aktualizacii - po zavolani funkcie v uvode nasladne ukaze dialogove okno s informaciou, ze aplikacia obsahuje novy misal
    public boolean showActualisationDialog() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        boolean firstOpenNewMisal = settings.getBoolean("firstOpenNewMisal", true);
        if (firstOpenNewMisal) {
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean("firstOpenNewMisal", false).apply();
        }
        return firstOpenNewMisal;
    }

    //získa premenné z uloženej omše v prípade výberu špecialnej omše v menu
    public void getSpecial() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        Gson gson = new Gson();
        String json = settings.getString("special-omsa", "");
        Calendar w = gson.fromJson(json, Calendar.class);
        ID = w.getID();
        den = w.getDay();
        tyzden = w.getTyzden();
        pozicia_eucharistia = 1;
        menoSvatca = w.getMenoSvatca();
        slavenie = w.getSlavenie();
        obdobie = w.getObdobie();
        pozicia_formular = pozicia_prefacia = 0;
        preface = false;
        euchText = "";
        C = A = V = P = VN = false;
        //zIntent = true;
    }

    //nastaví fullscreen
    public void setFullscreen() {
        //ActionBar m_myActionBar = getSupportActionBar();
        if (fullscreen) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            //assert m_myActionBar != null;
            //m_myActionBar.hide();
        } else {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
            //assert m_myActionBar != null;
            //m_myActionBar.show();
        }
    }

    //nastaví režim v menu
    public void menuRezim() {
        if (nightMode) {
            navigationView.setBackgroundColor(getResources().getColor(R.color.menu_background));
            navigationView.setItemTextColor(ColorStateList.valueOf(getResources().getColor(R.color.background)));
            image_zoomIn.setBackgroundColor(getResources().getColor(R.color.menu_background));
            image_zoomOut.setBackgroundColor(getResources().getColor(R.color.menu_background));
            farba_b = getResources().getColor(R.color.background);
            farba_r = getResources().getColor(R.color.primary_light);
        } else {
            navigationView.setBackgroundColor(getResources().getColor(R.color.background));
            navigationView.setItemTextColor(ColorStateList.valueOf(Color.BLACK));
            image_zoomIn.setBackgroundColor(getResources().getColor(R.color.background));
            image_zoomOut.setBackgroundColor(getResources().getColor(R.color.background));
            farba_b = Color.BLACK;
            farba_r = getResources().getColor(R.color.primary);
        }
    }

    //nastaví jednotlivé položky v menu
    public void setToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView title = toolbar.findViewById(R.id.toolbar_title);
        title.setTypeface(typeBold);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.open, R.string.open);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView = findViewById(R.id.menu_view);
        NavigationMenuView navigationMenuView = (NavigationMenuView) navigationView.getChildAt(0);
        if (navigationMenuView != null) {
            navigationMenuView.setVerticalScrollBarEnabled(false);
        }
        Menu menu = navigationView.getMenu();

        navigationView.setNavigationItemSelectedListener(this);
        switch_fullscreen = menu.findItem(R.id.menu_fullscreen).getActionView().findViewById(R.id.switcher);
        switch_fullscreen.setChecked(fullscreen);
        switch_pismo = menu.findItem(R.id.menu_pismo).getActionView().findViewById(R.id.switcher);
        switch_pismo.setChecked(pismo);
        switch_rezim = menu.findItem(R.id.menu_rezim).getActionView().findViewById(R.id.switcher);
        switch_rezim.setChecked(nightMode);
        switch_zvoncek = menu.findItem(R.id.menu_zvoncek).getActionView().findViewById(R.id.switcher);
        switch_zvoncek.setChecked(zvoncek);
        switch_ticheModlitby = menu.findItem(R.id.menu_tiche_modlitby).getActionView().findViewById(R.id.switcher);
        switch_ticheModlitby.setChecked(ticheModlitby);
        image_zoomIn = menu.findItem(R.id.velkost).getActionView().findViewById(R.id.menu_zoomIn);
        image_zoomOut = menu.findItem(R.id.velkost).getActionView().findViewById(R.id.menu_zoomOut);
    }

    //na stlačenie tlačídla späť zavrie menu
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    //nájde index sviatku v aktuálny deň podľa month1, month2...
    public int najdiIndex(String[][] month, String d) {
        for (int a = 0; a < month.length; a++) {
            if (month[a][0].contains(d))
                return a;
        }
        return -1;
    }

    //výpis kalendára v období cezrok
    public void cezrokVypis(final ArrayList<Calendar> words, String[][] month, int day, int mes) {
        if (day < 10)
            d = "0" + day;
        else
            d = Integer.toString(day);

        Calendar vigilia = null;
        pm = prvyPiatok = prvyStvrtok = false;
        index = najdiIndex(month, d);
        dnes.setFirstDayOfWeek(java.util.Calendar.SUNDAY);
        dnes.setMinimalDaysInFirstWeek(1);

        //vypocet tyzdna v cezrocnom obdobi
        //v niektorych rokoch posun v tyzdnoch od klasiky => v januari musi byt cezrok vzdy 1, preto specialne pocitanie
        if (mes == 0 || mes == 1 || mes == 2) {
            int days = Days.daysBetween(mKKPactual, mD).getDays();
            cezrok = (days / 7) + 1;
        } else { //zistim cezrok normalne
            cezrok = dnes.get(java.util.Calendar.WEEK_OF_YEAR);
            cezrok = cezrok - 14;
        }

        //nedela
        nedela = new Calendar((cisla_z[cezrok - 1] + " nedeľa v cezročnom období").toUpperCase(), "", "(zelená)", day, (cezrok), "gk", "c");
        //feria
        feria = new Calendar((dni[dvt] + " " + cezrok + ". týždňa v Cezročnom období"), "Féria", "(zelená)", day, cezrok, "", "c");

        //svatodusny pondelok + preblahoslavenej panny marie
        if (mD.isEqual(mSP)) {
            words.add(new Calendar("Preblahoslavenej Panny Márie, Matky Cirkvi", "Spomienka", "(biela)", day, cezrok, "2mp", "c"));
            words.add(new Calendar("Votívna omša o Duchu Svätom", "Votívna omša", "(červená)", day, cezrok, "1op", "c"));
        } //Nášho Pána Ježiša Krista
        else if (mD.isEqual(mJK))
            words.add(new Calendar("Nášho Pána Ježiša Krista, najvyššieho a večného kňaza", "Sviatok", "(biela)", day, cezrok, "3gp", "c"));
            //najsvatejsej trojice
        else if (mD.isEqual(mNT))
            words.add(new Calendar("Najsvätejšej Trojice", "Slávnosť", "(biela)", day, cezrok, "7gkp", "c"));
            //najsvatejsieho kristovho tela a krvi
        else if (mD.isEqual(mTK))
            words.add(new Calendar("Najsvätejšieho Kristovho Tela a Krvi", "Slávnosť", "(biela)", day, cezrok, "4gkp", "c"));
            //Jan Krstitel
        else if (mD.isEqual(mJanKrstitel)) {
            if (mJanKrstitel.getDayOfMonth() == 23) {
                words.add(new Calendar("Narodenie sv. Jána Krstiteľa", "Slávnosť", "(biela)", day, cezrok, "24gk", "c"));
                feria.setMenoSvatca("Trnavská arcidiecéza: ".toUpperCase() + feria.getMenoSvatca());
                words.add(feria);
                vigilia = new Calendar("Trnavská arcidiecéza: ".toUpperCase() + "Narodenie sv. Jána Krstiteľa", "Vigília", "(biela)", day, cezrok, "23gk", "c");
            } else
                words.add(new Calendar("Narodenie sv. Jána Krstiteľa \n(TRNAVA: Hlavný patrón arcidiecézy a titul katedrály)", "Slávnosť", "(biela)", day, cezrok, "24gk", "c"));
            //najsvatejsie srdca jezisovho
        } else if (mD.isEqual(mNSJ))
            if (mJanKrstitel.getDayOfMonth() == 23) {
                words.add(new Calendar("Najsvätejšieho Srdca Ježišovho", "Slávnosť", "(biela)", day, cezrok, "5gkp", "c"));
                words.add(new Calendar("Trnavská arcidiecéza: ".toUpperCase() + "Narodenie sv. Jána Krstiteľa", "Slávnosť", "(biela)", day, cezrok, "24gk", "c"));
            } else
                words.add(new Calendar("Najsvätejšieho Srdca Ježišovho", "Slávnosť", "(biela)", day, cezrok, "5gkp", "c"));
            //obetovanie Pána
        else if (day == 2 && mes == 1)
            words.add(new Calendar("Obetovanie Pána", "Sviatok", "(biela)", day, cezrok, "02g", "c"));

            //nedela
        else if (dvt == 0) {
            if (index != -1) {
                if (month[index][2].equals("Slávnosť") || month[index][0].contains("n")) {
                    while (month[index][0].contains(d)) {
                        words.add(new Calendar(month[index][1], month[index][2], month[index][3], day, cezrok, month[index][0], "c"));
                        index++;
                    }
                } else if (cezrok == 34)
                    words.add(new Calendar((cisla_z[cezrok - 1] + " nedeľa v cezročnom období - Nášho Pána Ježiša Krista, Kráľa neba i zeme").toUpperCase(), "Slávnosť", "(biela)", day, 34, "8gkp", "c"));
                else {
                    words.add(nedela);
                    do {
                        if (month[index][2].equals("Vigília")) {
                            if (month[index][0].contains("*"))
                                vigilia = new Calendar(month[index][1], month[index][2], month[index][3], day, cezrok, month[index + 1][0], "c");
                            else
                                vigilia = new Calendar(month[index][1], month[index][2], month[index][3], day, cezrok, month[index][0], "c");
                        } else if (month[index][0].contains("n")) {
                            words.add(new Calendar(month[index][1], month[index][2], month[index][3], day, cezrok, month[index][0], "c"));
                        }
                        index++;
                    } while (index < month.length && month[index][0].contains(d));
                }
            } else if (cezrok == 34)
                words.add(new Calendar((cisla_z[cezrok - 1] + " nedeľa v cezročnom období - Krista Kráľa").toUpperCase(), "Slávnosť", "(biela)", day, 34, "8gkp", "c"));
            else
                words.add(nedela);
            //ak nie je nedeľa a nájde sviatok
        } else if (index != -1) {
            if (month[index][2].equals("Ľubovoľná spomienka") || month[index][2].equals("Vigília") ||
                    month[index][0].contains("v") || month[index][0].contains("+") ||
                    month[index][0].contains("o")) {
                pm = true;
                words.add(feria);
            }
            //obcas pohyblive ak je nedela v ozajstny den slavenia
            if (mD.equals(mVyrocieNitra))
                words.add(new Calendar("NITRIANSKA DIECÉZA: Výročie posviacky katedrálneho chrámu svätého Emeráma", "Sviatok", "(biela)", day, cezrok, "20gv", "c"));

            if (!month[index][2].equals("Sviatok") && !month[index][2].equals("Slávnosť"))
                prvyPiatok = prvyStvrtok = true;
            if (month[index][2].equals("Spomienka") || month[index][1].equals("Najsvätejšieho mena Panny Márie"))
                pm = true;
            if (!month[index][2].equals("Slávnosť") && mD.isEqual(mSPM)) //neposkvrneneho srdca panny marie
                words.add(new Calendar("Nepoškvrnené Srdce preblahoslavenej Panny Márie", "Spomienka", "(biela)", day, cezrok, "4mp", "c"));
            do {
                if (month[index][2].equals("Vigília")) {
                    if (month[index][0].contains("*"))
                        vigilia = new Calendar(month[index][1], month[index][2], month[index][3], day, (cezrok + 1), month[index + 1][0], "c");
                    else
                        vigilia = new Calendar(month[index][1], month[index][2], month[index][3], day, cezrok, month[index][0], "c");
                } else
                    words.add(new Calendar(month[index][1], month[index][2], month[index][3], day, cezrok, month[index][0], "c"));
                index++;
            } while (index < month.length && month[index][0].contains(d));
        } else { //ak nie je nedeľa a ani sviatok
            pm = true;
            prvyPiatok = prvyStvrtok = true;
            if (mD.isEqual(mSPM)) {
                pm = false;
                words.add(new Calendar("Nepoškvrnené Srdce preblahoslavenej Panny Márie", "Spomienka", "(biela)", day, cezrok, "4mp", "c"));
            } else {
                words.add(feria);
            }
        }
        //vypisovanie Panny Márie v sobotu
        if (dvt == 6 && pm) {
            if (day < 8)
                words.add(new Calendar("O Nepoškvrnenom Srdci Panny Márie", maria[2], maria[3], day, cezrok, "003m", "c"));
            else
                words.add(new Calendar(maria[1], maria[2], maria[3], day, cezrok, "003m", "c"));
        }
        if (dvt == 5 && prvyPiatok && day < 8)
            words.add(new Calendar("O Najsvätejšom Srdci Ježišovom", "Votívna omša", "(biela)", day, cezrok, "001", "c"));
        if (dvt == 4 && prvyStvrtok && day < 8)
            words.add(new Calendar("Za duchovné povolania", "Votívna omša", "(farba dňa)", day, cezrok, "002", "c"));
        if (mD.isEqual(mJanKrstitelVigilia))
            vigilia = new Calendar("Narodenie sv. Jána Krstiteľa", "Vigília", "(biela)", day, cezrok, "23gk", "c");
        if (vigilia != null)
            words.add(vigilia);

        //kantrove dni
        if (mes == 8 && ((14 < day && day < 22 && dvt == 3) ||
                (16 < day && day < 24 && dvt == 5) ||
                (17 < day && day < 25 && dvt == 6)))
            words.add(new Calendar("Jesenné kántrové dni", " ", "(zelená)", day, cezrok, "006", "c"));
        //tyzden modlitieb za jednotu krestanov
        if (mes == 0 && 17 < day && day < 25)
            words.add(new Calendar("Za jednotu kresťanov", " ", "(zelená)", day, cezrok, "009", "c"));
    }


    //výpis kalendára v pôstnom období
    public void postVypis(final ArrayList<Calendar> words, String[][] month, int day) {
        int days = Days.daysBetween(mP, mD).getDays();
        post = (days + 3) / 7; //vypocet tyzdna v postnom období

        if (mD.isEqual(mP))
            words.add(new Calendar("Popolcová streda".toUpperCase(), "Féria", "(fialová)", day, post, Integer.toString(post) + dvt, "p"));
        else if (mD.isEqual(msvJ))
            words.add(new Calendar("Svätého Jozefa, ženícha Panny Márie", "Slávnosť", "(biela)", day, post, "0gkp", "p"));
        else if (mD.isEqual(mZP))
            words.add(new Calendar("Zvestovanie Pána", "Slávnosť", "(biela)", day, post, "1gkp", "p"));

        else if (days > 39) //velky tyzday
            if (dvt == 4)
                words.add(new Calendar("Štvrtok Pánovej večere", "", "(biela)", day, post, "3dni4", "p"));
            else if (dvt == 5) {
                words.add(new Calendar("Piatok utrpenia Pána", "", "(červená)", day, post, "3dni5", "p"));
                words.add(new Calendar("Uloženie Oltárnej sviatosti", "", "(červená)", day, post, "3dni5p", "p"));
            } else if (dvt == 6) {
                words.add(new Calendar("Vyloženie Oltárnej sviatosti na Bielu sobotu ráno", "", "(biela)", day, post, "3dni6p1", "n"));
                words.add(new Calendar("Ukončenie poklony v Božom hrobe", "", "(biela)", day, post, "3dni6p2", "n"));
                words.add(new Calendar("Veľkonočná nedeľa Pánovho zmŕtvychvstania", "", "(biela)", day, post, "3dni6", "n"));
            } else
                words.add(new Calendar((dni[dvt] + " Veľkého týždňa"), "Féria", "(fialová)", day, post, Integer.toString(post) + dvt, "p"));
        else if (dvt == 0) {//postne nedele
            if (post == 6)
                words.add(new Calendar("PALMOVÁ (KVETNÁ) NEDEĽA", "", "(červená)", day, post, Integer.toString(post) + dvt, "p"));
            else if (post == 4)
                words.add(new Calendar((cisla_z[post - 1] + " pôstna nedeľa (nedeľa Laetare)").toUpperCase(), "", "(fialová alebo ružová)", day, post, Integer.toString(post) + dvt, "p"));
            else
                words.add(new Calendar((cisla_z[post - 1] + " pôstna nedeľa").toUpperCase(), "", "(fialová)", day, post, Integer.toString(post) + dvt, "p"));

        } else {
            if (day < 10)
                d = "0" + day;
            else
                d = Integer.toString(day);
            index = najdiIndex(month, d);

            if (0 < days && days < 4) //tyzden po Popolcovej strede
                feria = new Calendar((dni[dvt] + " po Popolcovej strede"), "Féria", "(fialová)", day, post, Integer.toString(post) + dvt, "p");
            else
                feria = new Calendar((dni[dvt] + " po " + post + ". pôstnej nedeli"), "Féria", "(fialová)", day, post, Integer.toString(post) + dvt, "p");

            if (index != -1) {
                if (month[index][2].equals("Ľubovoľná spomienka") || month[index][2].equals("Spomienka")
                        || month[index][2].equals("Vigília") || month[index][0].contains("v"))
                    words.add(feria);
                do {
                    if (month[index][2].equals("Ľubovoľná spomienka") || month[index][2].equals("Spomienka"))
                        words.add(new Calendar(month[index][1], "Ľubovoľná spomienka", "(fialová)", day, post, month[index][0], "p"));
                    else if (month[index][2].equals("Sviatok") || month[index][2].equals("Slávnosť"))
                        words.add(new Calendar(month[index][1], month[index][2], month[index][3], day, post, month[index][0], "p"));
                    else
                        words.add(new Calendar(month[index][1], month[index][2], "(fialová)", day, post, month[index][0], "p"));
                    index++;
                } while (index < month.length && month[index][0].contains(d));
            } else
                words.add(feria);

            //kantrove dni
            if (post == 1 && (dvt == 3 || dvt == 5 || dvt == 6))
                words.add(new Calendar("Jarné kántrové dni", " ", "(fialová)", day, post, "004", "p"));
        }
    }

    //výpis kalendáru vo veľkonočnom období
    public void velkanocVypis(final ArrayList<Calendar> words, String[][] month, int day) {
        int days = Days.daysBetween(mVN, mD).getDays();
        velkanoc = (days / 7) + 1; //vypocet tyzdna vo velkonocnom obdobi
        prvyPiatok = prvyStvrtok = false;

        if (mD.isEqual(mVN)) {
            words.add(new Calendar("Veľkonočná nedeľa".toUpperCase(), "", "(biela)", day, velkanoc, Integer.toString(velkanoc) + dvt, "n"));
            words.add(new Calendar("Eucharistická procesia na oslavu vzkrieseného Pána", "", "(biela)", day, velkanoc, "3dni0p", "n"));
        } else if (mD.isEqual(mZP))
            words.add(new Calendar("Zvestovanie Pána", "Slávnosť", "(biela)", day, velkanoc, "1gkp", "n"));
        else if (mD.isEqual(mDS))
            words.add(new Calendar("Zoslanie Ducha Svätého".toUpperCase(), "Slávnosť", "(červená)", day, velkanoc, "3gkp", "n"));

        else if (0 < days && days < 7) //oktava po Veľkonočnej nedeli
            words.add(new Calendar(VNdni[dvt], "Oktáva", "(biela)", day, velkanoc, Integer.toString(velkanoc) + dvt, "n"));
        else if (dvt == 0) { //nedele
            if (velkanoc == 2)
                words.add(new Calendar((cisla_z[velkanoc - 1] + " Veľkonočná nedeľa (Nedeľa Božieho Milosrdenstva)").toUpperCase(), "", "(biela)", day, 2, "20", "n"));
            else
                words.add(new Calendar((cisla_z[velkanoc - 1] + " Veľkonočná nedeľa").toUpperCase(), "", "(biela)", day, velkanoc, velkanoc + "0", "n"));
        } else if (dvt == 4 && velkanoc == 6) {
            words.add(new Calendar("Nanebovstúpenie Pána", "Slávnosť", "(biela)", day, velkanoc, "6gkp", "n"));
        } else { //bežné dni a sviatky
            if (day < 10)
                d = "0" + day;
            else
                d = Integer.toString(day);
            index = najdiIndex(month, d);

            if (index != -1) { //nájde slávenie
                if (month[index][2].equals("Ľubovoľná spomienka") || month[index][2].equals("Vigília") || month[index][0].contains("v") || month[index][0].contains("+")) {
                    words.add(new Calendar((dni[dvt] + " po " + velkanoc + ". Veľkonočnej nedeli"), "Féria", "(biela)", day, velkanoc, Integer.toString(velkanoc) + dvt, "n"));
                }
                if (!month[index][2].equals("Sviatok") || !month[index][2].equals("Slávnosť"))
                    prvyPiatok = prvyStvrtok = true;
                do {
                    words.add(new Calendar(month[index][1], month[index][2], month[index][3], day, velkanoc, month[index][0], "n"));
                    index++;
                } while (index < month.length && month[index][0].contains(d));
            } else {
                prvyPiatok = prvyStvrtok = true;
                words.add(new Calendar((dni[dvt] + " po " + velkanoc + ". Veľkonočnej nedeli"), "Féria", "(biela)", day, velkanoc, Integer.toString(velkanoc) + dvt, "n"));
            }
            if (mD.isEqual(mvDS))
                words.add(new Calendar("Zoslanie Ducha Svätého", "Vigília", "(červená)", day, velkanoc, "2gkp", "n"));
            if (dvt == 6 && day < 8)
                words.add(new Calendar("O Nepoškvrnenom Srdci Panny Márie", maria[2], maria[3], day, velkanoc, "003m", "n"));
            if (dvt == 5 && prvyPiatok && day < 8)
                words.add(new Calendar("O Najsvätejšom Srdci Ježišovom", "Votívna omša", "(biela)", day, velkanoc, "001", "n"));
            if (dvt == 4 && prvyStvrtok && day < 8)
                words.add(new Calendar("Za duchovné povolania", "Votívna omša", "(farba dňa)", day, velkanoc, "002", "n"));
        }
        if (dvt == 3 && velkanoc == 6)
            words.add(new Calendar("Nanebovstúpenie Pána", "Vigília", "(biela)", day, velkanoc, "60gkp", "n"));

        //za duchovne povolania v 3.tyzdni (pondelok - sobota), mimo prveho stvrtka
        if (velkanoc == 3 && dvt > 0 && !(dvt == 4 && prvyStvrtok && day < 8))
            words.add(new Calendar("Za duchovné povolania", "Votívna omša", "(farba dňa)", day, velkanoc, "002", "n"));
        //prosebne dni
        if (velkanoc == 6 && (dvt == 1 || dvt == 2 || dvt == 3))
            words.add(new Calendar("Prosebné dni", " ", "(biela)", day, velkanoc, "008", "n"));
        //kantrove dni
        if (velkanoc == 7 && (dvt == 3 || dvt == 5 || dvt == 6))
            words.add(new Calendar("Letné kántrové dni", " ", "(biela)", day, velkanoc, "005", "n"));
    }

    //vypis kalendára v adventnom období
    public void adventVypis(final ArrayList<Calendar> words, String[][] month, int day) {
        int days = Days.daysBetween(mZacA, mD).getDays();
        advent = (days / 7) + 1; //vypočet týzdna v adventnom období
        boolean slavnost = false;
        prvyPiatok = prvyStvrtok = pm = false;

        if (mD.isEqual(mPM))
            words.add(new Calendar("Nepoškvrnené počatie preblahoslavenej Panny Márie", "Slávnosť", "(biela)", day, advent, "9gkp", "a"));

        else if (dvt == 0) { //nedele
            if (advent == 3)
                words.add(new Calendar((cisla_z[advent - 1] + " adventná nedeľa (nedeľa Gaudete)").toUpperCase(), "", "(fialová alebo ružová)", day, advent, advent + "0", "a"));
            else
                words.add(new Calendar((cisla_z[advent - 1] + " adventná nedeľa").toUpperCase(), "", "(fialová)", day, advent, advent + "0", "a"));
        } else if (day == 24) {
            words.add(new Calendar((dni[dvt] + " " + advent + ". týždňa v adventnom období"), "Féria", "(fialová)", day, advent, Integer.toString(advent) + dvt, "a"));
            words.add(new Calendar("Narodenie Pána", "Vigília", "(biela)", day, 1, "24gkn", "v"));
        } else {
            if (day < 10)
                d = "0" + day;
            else
                d = Integer.toString(day);
            index = najdiIndex(month, d);

            if (mD.equals(mVyrocieNitra))
                words.add(new Calendar("NITRIANSKA DIECÉZA: Výročie posviacky katedrálneho chrámu svätého Emeráma", "Sviatok", "(biela)", day, advent, "20gv", "a"));

            if (index != -1) {
                if (month[index][2].equals("Ľubovoľná spomienka") || month[index][2].equals("Vigília") || month[index][0].contains("v") || month[index][0].contains("+")) {
                    words.add(new Calendar((dni[dvt] + " " + advent + ". týždňa v adventnom období"), "Féria", "(fialová)", day, advent, Integer.toString(advent) + dvt, "a"));
                }
                if (!month[index][2].equals("Sviatok") || !month[index][2].equals("Slávnosť"))
                    prvyPiatok = prvyStvrtok = true;
                if (!month[index][2].equals("Slávnosť"))
                    slavnost = true;
                do {
                    if (day < 17 || m == 10)
                        words.add(new Calendar(month[index][1], month[index][2], month[index][3], day, advent, month[index][0], "a"));
                    else
                        words.add(new Calendar(month[index][1], month[index][2], "(fialová)", day, advent, month[index][0], "a"));
                    index++;
                } while (index < month.length && month[index][0].contains(d));
                if (!month[index - 1][2].equals("Sviatok") && !month[index - 1][2].equals("Slávnosť") && !month[index - 1][2].equals("Spomienka") && day < 17)
                    pm = true;
            } else {
                prvyPiatok = prvyStvrtok = true;
                words.add(new Calendar((dni[dvt] + " " + advent + ". týždňa v adventnom období"), "Féria", "(fialová)", day, advent, Integer.toString(advent) + dvt, "a"));
                if (day < 17 || m == 10)
                    pm = true;
            }
            if (dvt == 5 && prvyPiatok && day < 8)
                words.add(new Calendar("O Najsvätejšom Srdci Ježišovom", "Votívna omša", "(biela)", day, advent, "001", "a"));
            if (dvt == 4 && prvyStvrtok && day < 8)
                words.add(new Calendar("Za duchovné povolania", "Votívna omša", "(farba dňa)", day, advent, "002", "a"));
        }

        if (pm) {
            if (dvt == 6 && day < 8)
                words.add(new Calendar("O Nepoškvrnenom Srdci Panny Márie", maria[2], maria[3], day, advent, "003m", "a"));
            else
                words.add(new Calendar("Omša o Panne Márii v adventnom období", " ", "(biela)", day, advent, "003m", "a"));
        }
        //kantrove dni
        if (advent == 2 && (dvt == 3 || dvt == 5 || dvt == 6) && !slavnost)
            words.add(new Calendar("Zimné kántrové dni", " ", "(fialová)", day, advent, "007", "a"));
    }

    //vypis kalendára vo vianočnom období
    public void vianoceVypis(final ArrayList<Calendar> words, String[][] month, int day) {
        int days = Days.daysBetween(mNP, mD).getDays();
        vianoce = (days / 7) + 1; //vypocet tyzdna vo vianočnom období
        pm = prvyPiatok = prvyStvrtok = false;

        if (mD.isEqual(mSR))
            words.add(new Calendar("Svätej rodiny Ježiša, Márie a Jozefa", "Slávnosť", "(biela)", day, vianoce, "10gkp", "v"));
        else if (mD.isEqual(mZJ)) {
            vypocetPreOhlasenieVN();
            words.add(new Calendar("Zjavenie Pána", "Slávnosť", "(biela)", day, vianoce, "06gk", "v"));
        }
        //} else if (mD.isEqual(mNNP))
        //    words.add(new Calendar(("Druhá nedeľa po Narodení Pána").toUpperCase(), "", "(biela)", day, vianoce, vianoce + "0", "v"));
        else if (mD.isEqual(mKKP))
            words.add(new Calendar("Krst Pána".toUpperCase(), "Slávnosť", "(biela)", day, vianoce, "11gkp", "v"));

        else if (dvt == 0 && day != 1 && day != 25) { //nedele okrem 1.1. a 25.12.
            words.add(new Calendar((vianoce + ". nedeľa po Narodení Pána").toUpperCase(), "", "(biela)", day, vianoce, vianoce + "0", "v"));
        } else {
            if (day < 10)
                d = "0" + day;
            else
                d = Integer.toString(day);
            index = najdiIndex(month, d);

            if (index != -1) {
                if (month[index][2].equals("Ľubovoľná spomienka") || month[index][2].equals("Vigília") || month[index][0].contains("v") || month[index][0].contains("+")) {
                    if (days < 7)
                        words.add(new Calendar((cisla_m[days] + " deň oktávy Narodenia Pána"), "Sviatok", "(biela)", day, vianoce, String.valueOf(day), "v"));
                    else if (mD.isAfter(mZJ)) //po Zjavení Pána
                        words.add(new Calendar((dni[dvt] + " po Zjavení Pána"), "Féria", "(biela)", day, vianoce, Integer.toString(vianoce) + dvt, "v"));
                    else
                        words.add(new Calendar((dni[dvt] + " vo Vianočnom období"), "Féria", "(biela)", day, vianoce, Integer.toString(vianoce) + dvt, "v"));
                }
                if (!month[index][2].equals("Sviatok") && !month[index][2].equals("Slávnosť"))
                    prvyPiatok = pm = prvyStvrtok = true;
                do {
                    words.add(new Calendar(month[index][1], month[index][2], month[index][3], day, vianoce, month[index][0], "v"));
                    index++;
                } while (index < month.length && month[index][0].contains(d));
            } else if (days < 7)
                words.add(new Calendar((cisla_m[days] + " deň oktávy Narodenia Pána"), "Sviatok", "(biela)", day, vianoce, String.valueOf(day), "v"));
            else if (mD.isAfter(mZJ)) //po Zjavení Pána
                words.add(new Calendar((dni[dvt] + " po Zjavení Pána"), "Féria", "(biela)", day, vianoce, Integer.toString(vianoce) + dvt, "v"));
            else {
                prvyPiatok = pm = prvyStvrtok = true;
                words.add(new Calendar((dni[dvt] + " vo Vianočnom období"), "Féria", "(biela)", day, vianoce, Integer.toString(vianoce) + dvt, "v"));
            }
            if (dvt == 6 && pm && day < 8)
                words.add(new Calendar("O Nepoškvrnenom Srdci Panny Márie", maria[2], maria[3], day, cezrok, "003m", "v"));
            if (dvt == 5 && prvyPiatok && day < 8)
                words.add(new Calendar("O Najsvätejšom Srdci Ježišovom", "Votívna omša", "(biela)", day, vianoce, "001", "v"));
            if (dvt == 4 && prvyStvrtok && day < 8)
                words.add(new Calendar("Za duchovné povolania", "Votívna omša", "(farba dňa)", day, vianoce, "002", "v"));
        }
    }

    public void vypocetPreOhlasenieVN() {
        vypocetVN(rok);
        //nanebovstupenie Pana
        mVNactual = new DateTime(rok, vnm + 1, vnd, 12, 0, 0);
        DateTime mNVP = mVNactual.plusDays(39);
        nvpm = mNVP.getMonthOfYear() - 1;
        nvpd = mNVP.getDayOfMonth();
        //advent
        mNPactual = new DateTime(rok, 12, 25, 12, 0, 0);
        int dayNP = mNPactual.getDayOfWeek();
        mZacAactual = mNPactual.minusDays(dayNP).minusWeeks(3);
        zacAm = mZacAactual.getMonthOfYear() - 1;
        zacAd = mZacAactual.getDayOfMonth();
    }

    public void vypocetVN(int rok) {
        int a, b, c, d, e;
        a = rok % 19;
        b = rok % 4;
        c = rok % 7;
        d = (19 * a + 24) % 30;
        e = (2 * b + 4 * c + 6 * d + 5) % 7;
        vnd = 22 + d + e;
        psd = vnd - 46;
        dsd = vnd - 12; //+49-61(za mesiace marec a april)
        //velka noc
        if (vnd > 31) {
            vnd = vnd - 31;
            vnm = 3;
        } else vnm = 2;
        //post
        if (psd < 1) {
            if (rok % 4 == 0)
                psd = 29 + psd;
            else
                psd = 28 + psd;
            psm = 1;
        } else psm = 2;
        //zoslanie ducha svateho
        if (dsd > 31) {
            dsd = dsd - 31;
            dsm = 5;
        } else dsm = 4;
        //skorsia velka noc
        if (vnm == 3 && vnd == 25 && d == 28 && a > 10) {
            vnd = vnd - 7;
            psd = psd - 7;
            dsd = dsd - 7;
        }
    }

    //vypočíta dátum Popolcovej stredy, Veľkej noci a pohyblivých sviatkov
    public void ziskajPaVN(int rok) {
        vypocetVN(rok);
        int dayJ, dayZP;
        mP = new DateTime(rok, psm + 1, psd, 12, 0, 0);
        mVN = new DateTime(rok, vnm + 1, vnd, 12, 0, 0);
        mDS = new DateTime(rok, dsm + 1, dsd, 12, 0, 0);

        //svaty jozef
        msvJ = new DateTime(rok, 3, 19, 12, 0, 0);
        dayJ = msvJ.getDayOfWeek();
        if (dayJ == 7 && msvJ.isAfter(mP) && msvJ.isBefore(mVN))
            msvJ = msvJ.plusDays(1);
        //zvestovanie pana
        mZP = new DateTime(rok, 3, 25, 12, 0, 0);
        dayZP = mZP.getDayOfWeek();
        if (dayZP == 7 && msvJ.isAfter(mP) && msvJ.isBefore(mVN))
            mZP = mZP.plusDays(1);
        if (mZP.isBefore(mVN) && mZP.isAfter(mVN.minusDays(7)))
            mZP = mVN.plusDays(8);
        //vigilia ducha svateho
        mvDS = mDS.minusDays(1);
        //svatodusny pondelok + preblahoslavenej panny marie
        mSP = mDS.plusDays(1);
        //Nášho Pána Ježiša Krista
        mJK = mDS.plusDays(4);
        //najsvatejsej trojice
        mNT = mDS.plusWeeks(1);
        //najsvatejsieho kristovho tela a krvi
        mTK = mDS.plusDays(11);
        //najsvatejsieho srdca jezisovho
        mNSJ = mDS.plusDays(19);
        //Jan Krstitel - 24. 6. alebo 23.6, ked sa prelina s mNSJ
        if (mNSJ.getDayOfMonth() == 24 && mNSJ.getMonthOfYear() == 6) {
            mJanKrstitel = new DateTime(rok, 6, 23, 12, 0, 0);
            mJanKrstitelVigilia = new DateTime(rok, 6, 22, 12, 0, 0);
        } else {
            mJanKrstitel = new DateTime(rok, 6, 24, 12, 0, 0);
            mJanKrstitelVigilia = new DateTime(rok, 6, 23, 12, 0, 0);
        }
        //neposkvrneneho srdca panny marie
        mSPM = mDS.plusDays(20);
    }

    public void pohybliveSviatky(int rok) {
        //20.11.
        mVyrocieNitra = new DateTime(rok, 11, 20, 12, 0, 0);
        if (mVyrocieNitra.getDayOfWeek() == 7)
            mVyrocieNitra = mVyrocieNitra.plusDays(1);
    }

    /**
     * @param decrok - rok v decembri, pre ktorý počítam dané sviatky
     * @param janrok - rok v januari, pre ktorý počítam dané sviatky
     */
    public void ziskajAaV(int decrok, int janrok) {
        int dayPM, dayNP, dayKKP;
        //Nepoškvrnené počatie Panny Márie
        mPM = new DateTime(decrok, 12, 8, 12, 0, 0);
        dayPM = mPM.getDayOfWeek();
        if (dayPM == 7)
            mPM = mPM.plusDays(1);
        //Narodenie Pána
        mNP = new DateTime(decrok, 12, 25, 12, 0, 0);
        dayNP = mNP.getDayOfWeek();
        //Nedeľa po Narodení Pána - Svätej rodiny
        mSR = mNP.plusDays(7 - dayNP);
        if (mSR.getDayOfMonth() == 1 || mSR.getDayOfMonth() == 25) //ak je to 1.1 alebo 25.12
            mSR = new DateTime(decrok, 12, 30, 12, 0, 0);
        //druhá nedeľa po Narodení Pána (po novom roku)
        mNNP = mNP.plusDays(14 - dayNP);
        //Zjavenie Pána - 6.1.
        mZJ = new DateTime(janrok, 1, 6, 12, 0, 0);
        //Nedeľa po 6.januári - Krst Krista Pána (po novom roku)
        dayKKP = mZJ.getDayOfWeek();
        if (dayKKP == 7)
            dayKKP = 0;
        mKKP = mZJ.plusDays(7 - dayKKP);
        //Začiatok adventného obdobia
        mZacA = mNP.minusDays(dayNP).minusWeeks(3);
    }

    void posunObdobieCezrok(int rok) {
        int dayKKP;
        //Zjavenie Pána - 6.1.
        mZJactual = new DateTime(rok, 1, 6, 12, 0, 0);
        //Nedeľa po 6.januári - Krst Krista Pána (po novom roku)
        dayKKP = mZJactual.getDayOfWeek();
        if (dayKKP == 7)
            dayKKP = 0;
        mKKPactual = mZJactual.plusDays(7 - dayKKP);
    }
}

