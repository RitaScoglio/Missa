package sk.missa;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MisalSvatyRok extends Misal {

    static int pozicia_prosby = 0;



    @Override
    protected void onPause() {
        setPremenne();
        /*if (!zIntent)
            unsetZvuk();*/
        super.onPause();
    }

    @Override
    protected void onResume() {
        if(!zIntent){
            //zistí či je deň otvorenia rovnaký ako v omši
            settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
            setDate();
            if (den != settings.getInt("denOpen", 1) ||
                    m != settings.getInt("mOpen", 0) ||
                    rok != settings.getInt("rokOpen", 0)) {
                zIntent = true;
                Intent uvod = new Intent(this, Uvod.class);
                startActivity(uvod);
                finish();
            }}
        super.onResume();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        settings = getApplicationContext().getSharedPreferences("OptionsData", 0);
        SharedPreferences.Editor editor = settings.edit();
        switch (item.getItemId()) {
            //akcie po výbere položky z menu
            case android.R.id.home:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            case R.id.menu_uvod:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                zIntent = true;
                openNewActivity(new Intent(this, Uvod.class));
                return true;
            case R.id.menu_omse:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                editor.putString("type", "specialMass").apply();
                editor.putString("text", "").apply();
                openNewActivity(new Intent(getApplicationContext(), Options.class));
                return true;
            case R.id.menu_kalendar:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                zIntent = true;
                openNewActivity(new Intent(this, Kalendar.class));
                return true;
            case R.id.menu_odpovede:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                editor.putString("type", "language").apply();
                editor.putString("text", "").apply();
                openNewActivity(new Intent(getApplicationContext(), Options.class));
                return true;
            case R.id.menu_pozehnania:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                editor.putString("type", "bless").apply();
                editor.putString("text", "").apply();
                openNewActivity(new Intent(getApplicationContext(), Options.class));
                return true;
            case R.id.menu_font:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberFont(MisalSvatyRok.this);
                return true;
            case R.id.menu_fullscreen:
                switch_fullscreen.setChecked(!switch_fullscreen.isChecked());
                fullscreen = switch_fullscreen.isChecked();
                putFullscreen();
                setFullscreen();
                return true;
            case R.id.menu_rezim:
                switch_rezim.setChecked(!switch_rezim.isChecked());
                nightMode = switch_rezim.isChecked();
                nast_farbu = true;
                menuRezim();
                putRezim();
                pozicia_listview = getFirstVisiblePosition(recyclerView);
                vypis();
                return true;
            case R.id.menu_pismo:
                switch_pismo.setChecked(!switch_pismo.isChecked());
                pismo = switch_pismo.isChecked();
                putPismo();
                pozicia_listview = getFirstVisiblePosition(recyclerView);
                vypis();
                return true;
            case R.id.menu_zvoncek:
                switch_zvoncek.setChecked(!switch_zvoncek.isChecked());
                zvoncek = switch_zvoncek.isChecked();
                putZvoncek();
                pozicia_listview = getFirstVisiblePosition(recyclerView);
                vypis();
                return true;
            case R.id.menu_tiche_modlitby:
                switch_ticheModlitby.setChecked(!switch_ticheModlitby.isChecked());
                ticheModlitby = switch_ticheModlitby.isChecked();
                putTicheModlitby();
                pozicia_listview = getFirstVisiblePosition(recyclerView);
                vypis();
                return true;
            case R.id.menu_info:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                otvorDialog();
                return true;
        }
        return true;
    }

    private void openNewActivity(Intent intent) {
        startActivity(intent);
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //nastaví písmo v celej aplikácií - pätkové alebo bezpätkové
        getThemeStyle();
        setTheme(themeStyle);
        //nastaví layout
        setContentView(R.layout.activity_misal);

        pozicia_eucharistia = 1;
        pozicia_listview = 0;
        nast_farbu = spevO = modlitbaO = prosbyO = citanie1O = zalmO = alelujaO = evanjeliumO = false;

        //nastaví toolbar, fullscreen a režim v menu
        setToolbar("Omše na Svätý rok 2025");
        setFullscreen();
        menuRezim();

        //nastavenia v menu po stlačení switch tlačidla alebo obrazku pre priblíženie/oddialenie
        switch_fullscreen.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                fullscreen = isChecked;
                putFullscreen();
                setFullscreen();
            }
        });
        switch_pismo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                pismo = isChecked;
                putPismo();
                pozicia_listview = getFirstVisiblePosition(recyclerView);
                vypis();
            }
        });
        switch_rezim.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                nightMode = isChecked;
                menuRezim();
                putRezim();
                nast_farbu = true;
                pozicia_listview = getFirstVisiblePosition(recyclerView);
                vypis();
            }
        });
        switch_zvoncek.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                zvoncek = isChecked;
                putZvoncek();
                pozicia_listview = getFirstVisiblePosition(recyclerView);
                vypis();
            }
        });
        switch_ticheModlitby.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ticheModlitby = isChecked;
                putTicheModlitby();
                pozicia_listview = getFirstVisiblePosition(recyclerView);
                vypis();
            }
        });
        image_zoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomIn();
                putVelkost();
                pozicia_listview = getFirstVisiblePosition(recyclerView);
                vypis();
            }
        });
        image_zoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOut();
                putVelkost();
                pozicia_listview = getFirstVisiblePosition(recyclerView);
                vypis();
            }
        });

        //získa premenné ak je ID null
        if (ID == null)
            getPremenne();
        dnes.set(rok, m, den);
        dvt = (dnes.get(java.util.Calendar.DAY_OF_WEEK) - 1);

        ziskajObdobie();
        ziskajFormular();
        ziskajPrefaciu();
        ziskajEucharistiu();
        nadpis();
        spev();
        pozdrav();
        kajucnost();
        modlitba();
        gloria();
        prveCitanie();
        zalm();
        druheCitanie();
        sekvencia();
        aleluja();
        evanjelium();
        kredo();
        prosby();
        prefacia();
        slavnostnePozehnanie();
        vypis();
    }

    //získa uložené premenné
    private void getPremenne() {
        getSpecial();
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        pozicia_eucharistia = settings.getInt("poz_euch", 1);
        pozicia_formular = settings.getInt("poz_form", 0);
        pozicia_prefacia = settings.getInt("poz_pref", 0);
        pozicia_prosby = settings.getInt("poz_prosby", 0);
        nightMode = settings.getBoolean("rezim", false);
        pismo = settings.getBoolean("pismo", false);
        zvoncek = settings.getBoolean("zvoncek", false);
        sizeO = settings.getInt("sizeO", 16);
        sizeN = settings.getInt("sizeN", 24);
        m = settings.getInt("m", 0);
        rok = settings.getInt("rok", 0);
    }

    //uloží premenné do pamäte
    private void setPremenne() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        SharedPreferences.Editor editor = settings.edit();
        Calendar w = new Calendar(menoSvatca, slavenie, "", den, tyzden, ID, obdobie);
        Gson gson = new Gson();
        String json = gson.toJson(w);
        editor.putString("special-omsa", json).apply();
        editor.putInt("poz_form", pozicia_formular).apply();
        editor.putInt("poz_pref", pozicia_prefacia).apply();
        editor.putInt("poz_euch", pozicia_eucharistia).apply();
        editor.putInt("poz_prosby", pozicia_prosby).apply();
        editor.putInt("m", m).apply();
        editor.putInt("rok", rok).apply();
    }

    @Override
    public void nadpis(){
        nadpis = ("Omša na Svätý rok 2025");
    }

    @Override
    public void spev() {
        uvodny_spev = "Úvodný spev";
        prijimanie_spev = "Spev na prijímanie";
        index = indexFormular(spevFormular, formArray.get(pozicia_formular));
        uvodny_spev_vypis = spevFormular[index][3];
        uvodny_suradnice = spevFormular[index][4];
        prijimanie_vypis = spevFormular[index][5];
        prijimanie_suradnice = spevFormular[index][6];
    }

    @Override
    public void modlitba() {
        modlitba_dna = "Modlitba dňa";
        modlitba_dary = "Modlitba nad obetnými darmi";
        modlitba_prijimanie = "Modlitba po prijímaní";
        index = indexFormular(modlitbaFormular, formArray.get(pozicia_formular));
        modlitba_dna_vypis = modlitbaFormular[index][3];
        modlitba_dary_vypis = modlitbaFormular[index][4];
        modlitba_prijimanie_vypis = modlitbaFormular[index][5];
    }

    @Override
    public void prosby() {
        prosby = "Spoločné modlitby veriacich";
        index = indexIdText(prosbyFormular, "07");
        prosby_nadpis = prosbyFormular[index][2];
        prosby_uvod = prosbyFormular[index][3];
        prosby_zvolanie = prosbyFormular[index][4];
        prosby_vypis = prosbyFormular[index][5];
        prosby_zaver = prosbyFormular[index][6];
        aleboCitanie(prosbyFormular, index, 6);
    }

    //hľadá index podľa ID svätcov
    public int indexIdText(String[][] text, String hladaneID) {
        for (int a = 0; a < text.length; a++) {
            if (text[a][0].equals(hladaneID))
                return a;
        }
        return -1;
    }

    @Override
    public void prefacia() {
        prefacia = "Prefácia";
        index = indexOmsa(prefacie, prefaciaArray.get(pozicia_prefacia));
        prefacia_nadpis = (prefacie[index][2]);
        prefacia_vypis = prefacie[index][3];
    }

    List<String> forms = new ArrayList<>();
    //nastavi moznosti formularu
    @Override
    public void ziskajFormular() {
        formArray.clear();
        formArray.add(new String[]{"07a", "1", "Svätý rok 2025 1."});
        formArray.add(new String[]{"07b", "1", "Svätý rok 2025 2."});
        formArray.add(new String[]{"07c", "1", "Svätý rok 2025 3."});

        forms.add("Svätý rok 2025 1.");
        forms.add("Svätý rok 2025 2.");
        forms.add("Svätý rok 2025 3.");
    }

    //nastavi moznosti EM
    @Override
    public void ziskajEucharistiu() {
        eucharistiaArray.clear();
        eucharistiaArray.add("1. eucharistická modlitba");
        eucharistiaArray.add("2. eucharistická modlitba");
        eucharistiaArray.add("3. eucharistická modlitba");
    }

    //nastavi moznosti prefacie
    @Override
    public void ziskajPrefaciu() {
        prefaciaArray.clear();
        switch(pozicia_formular) {
            case 0:
                prefaciaArray.add("Vlastná prefácia - Svätý rok 2025 I");
                break;
            case 1:
                prefaciaArray.add("Vlastná prefácia - Svätý rok 2025 II");
                break;
            case 2:
                prefaciaArray.add("Vlastná prefácia - Svätý rok 2025 III");
                break;
        }
    }

    //výber, nastavenie a výpis spevov, modlitieb a prosieb podľa vybratého formulára
    @Override
    public void formular(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(Html.fromHtml("<font color='#9C0E0F'><b>Formulár</b></font>"));
        final CharSequence[] form = forms.toArray(new CharSequence[0]);
        builder.setSingleChoiceItems(form, pozicia_formular, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int i) {
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                int predtym = pozicia_formular;
                ListView lw = ((AlertDialog) dialogInterface).getListView();
                pozicia_formular = lw.getCheckedItemPosition();
                if (predtym != pozicia_formular) {
                    spev();
                    modlitba();
                    ziskajPrefaciu();
                    pozicia_listview = getFirstVisiblePosition(recyclerView);
                    vypis();
                }
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }
        });
        AlertDialog dialog = builder.create();
        dialog.getWindow().setBackgroundDrawableResource(R.color.background);
        dialog.show();
    }

    @Override
    public void pozehnanie(ArrayList<MassText> missas) {
        if(pozicia_formular == 0)
            missas.add(new MassText("Slávnostné požehnanie (otvoriť)", "red|bigPadding", 7));
        else
            missas.add(new MassText("Modlitba nad ľudom (otvoriť)", "red|bigPadding", 7));
    }

    @Override
    public void slavnostnePozehnanie() {
        slav_pozehnanie = -1;
    }

    @Override
    public void otvorenie(int dialog) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if(pozicia_formular == 0)
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Slávnostné požehnanie</b></font>")));
        else
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Modlitba nad ľudom</b></font>")));
        builder.setMessage("");

        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
        TextView text = alert.findViewById(android.R.id.message);
        text.setTextSize(sizeO);
        if (nightMode) {
            alert.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.background));
            alert.getWindow().setBackgroundDrawableResource(R.color.black);
            text.setTextColor(getResources().getColor(R.color.background));
        } else {
            alert.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.primary));
            alert.getWindow().setBackgroundDrawableResource(R.color.background);
            text.setTextColor(Color.BLACK);
        }
        if (pismo)
            text.setTypeface(typeBold);
        otvorExtra(text, new String[]{"", "Uvedené formuly slávnostných požehnaní môže kňaz použiť podľa vlastného uváženia na konci svätej omše alebo liturgie slova, na konci liturgie hodín alebo po vysluhovaní sviatostí.\n" +
                    "Diakon alebo, ak ho niet, sám kňaz, prednesie výzvu: ",
                    "<m>Skloňte sa na požehnanie. ",
                    "alebo: ",
                    "<m>Prijmite slávnostné požehnanie. ",
                    "Potom kňaz vystrie ruky nad ľud a prednesie formulu požehnania. Všetci odpovedia: ",
                    "<m>Amen.", "", "<br><br>" + svaty_rok_pozehnanie[pozicia_formular]});
    }

}