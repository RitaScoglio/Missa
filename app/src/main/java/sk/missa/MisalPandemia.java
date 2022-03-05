package sk.missa;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AlertDialog;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MisalPandemia extends Misal{

   /* @Override
    protected void onResume() {
        if (!zIntent)
            setZvuk();
        zIntent = false;
        super.onResume();
    }*/

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
                Intent uvod = new Intent(this, Uvod.class);
                startActivity(uvod);
                finish();
                return true;
            case R.id.menu_omse:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberOmsu(this);
                return true;
            case R.id.menu_kalendar:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                zIntent = true;
                Intent kalendar = new Intent(this, Kalendar.class);
                startActivity(kalendar);
                finish();
                return true;
            case R.id.menu_odpovede:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberJazyk(MisalPandemia.this);
                return true;
            case R.id.menu_pozehnania:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberPozehnania();
                return true;
            case R.id.menu_font:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberFont(MisalPandemia.this);
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
        setToolbar();
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
        //ziskajFormular();
        //ziskajPrefaciu();
        //ziskajEucharistiu();
        nadpis();
        spev();
        pozdrav();
        kajucnost();
        modlitba();
        //gloria();
        prveCitanie();
        zalm();
        //druheCitanie();
        //sekvencia();
        aleluja();
        evanjelium();
        //kredo();
        prosby();
        prefacia();
        //slavnostnePozehnanie();
        slav_pozehnanie = -1;
        //pozenanie nad ludom
        vypis();
    }

    //získa uložené premenné
    private void getPremenne() {
        getSpecial();
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        pozicia_eucharistia = settings.getInt("poz_euch", 1);
        pozicia_formular = settings.getInt("poz_form", 0);
        pozicia_prefacia = settings.getInt("poz_pref", 0);
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
        editor.putInt("m", m).apply();
        editor.putInt("rok", rok).apply();
    }

    @Override
    public void nadpis(){
        nadpis = ("Omša v čase pandémie");
    }

    @Override
    public void spev() {
        uvodny_spev = "Úvodný spev";
        prijimanie_spev = "Spev na prijímanie";
        uvodny_spev_vypis = pandemiaFormular[0][0];
        uvodny_suradnice = pandemiaFormular[0][1];
        prijimanie_vypis = pandemiaFormular[0][2];
        prijimanie_suradnice = pandemiaFormular[0][3];
    }

    @Override
    public void modlitba() {
        modlitba_dna = "Modlitba dňa";
        modlitba_dary = "Modlitba nad obetnými darmi";
        modlitba_prijimanie = "Modlitba po prijímaní";
        modlitba_dna_vypis = pandemiaFormular[1][0];
        modlitba_dary_vypis = pandemiaFormular[1][1];
        modlitba_prijimanie_vypis = pandemiaFormular[1][2];
    }

    @Override
    public void prveCitanie(){
        liturgia_slova = "Liturgia slova";
        prve_citanie = "Prvé čítanie";
        prve_citanie_suradnice = pandemiaFormular[3][0];
        prve_citanie_citat = pandemiaFormular[3][1];
        prve_citanie_vypis = pandemiaFormular[3][2];
        aleboCitanie1 = new String[2][3];
        aleboCitanie1[0] = new String[]{prve_citanie_suradnice, prve_citanie_citat, prve_citanie_vypis};
        aleboCitanie1[1] = new String[]{pandemiaFormular[3][4], pandemiaFormular[3][5], pandemiaFormular[3][6]};
    }

    @Override
    public void zalm(){
        zalm = "Responzóriový žalm";
        zalm_suradnice = pandemiaFormular[4][0];
        zalm_vypis = pandemiaFormular[4][1];
        aleboZalm = new String[2][2];
        aleboZalm[0] = new String[]{zalm_suradnice, zalm_vypis};
        aleboZalm[1] = new String[]{pandemiaFormular[4][3], pandemiaFormular[4][4]};
    }

    @Override
    public void aleluja(){
        if (P) {
            aleluja = "Verš pred evanjeliom";
            aleluja_vypis = pandemiaFormular[5][2];
        } else {
            aleluja = "Alelujový verš";
            aleluja_vypis = pandemiaFormular[5][1];
        }
        aleluja_suradnice = pandemiaFormular[5][0];
    }

    @Override
    public void evanjelium(){
        evanjelium = "Evanjelium";
        evanjelium_suradnice = pandemiaFormular[6][0];
        evanjelium_citat = pandemiaFormular[6][1];
        evanjelium_vypis = pandemiaFormular[6][2];
    }

    @Override
    public void prosby() {
        prosby = "Spoločné modlitby veriacich";
        prosby_uvod = pandemiaFormular[2][0];
        prosby_zvolanie = pandemiaFormular[2][1];
        prosby_vypis = pandemiaFormular[2][2];
        prosby_zaver =pandemiaFormular[2][3];
    }

    @Override
    public void prefacia(){
        prefacia = "Prefácia";
        prefacia_nadpis = pandemiaFormular[7][0];
        prefacia_vypis = pandemiaFormular[7][1];
    }

    @Override
    public void modlitbaEucharistia(ArrayList<MassText> missas) {
        missas.add(new MassText("Eucharistická modlitba".toUpperCase(), "red|bold"));
        for (int j = 0; j < pandemiaFormular[8].length; j++) {
            if (j % 2 == 0) {
                if (pandemiaFormular[8][j].equals("BAR")) {
                    missas.add(new MassText("divider"));
                } else if (pandemiaFormular[8][j].equals("SPACE")) {
                    missas.add(new MassText("space"));
                } else {
                    missas.add(new MassText(pandemiaFormular[8][j], "red|small"));
                }
            } else {
                if (pandemiaFormular[8][j].contains("VEZMITE")) {
                    missas.add(new MassText(pandemiaFormular[8][j], "center"));
                    missas.add(new MassText("bell"));
                } else {
                    missas.add(new MassText(pandemiaFormular[8][j], "html"));
                }
            }
        }
    }

    @Override
    public void otvorenie(int dialog) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MisalPandemia.this);
        if(dialog == 1){
            String ukon;
            /* ukon = ukonKajucnosti[5][1]; - zjavenie Pána
             *  ukon = ukonKajucnosti[6][1]; - nanebovstupenie Pana
             *  ukon = ukonKajucnosti[7][1]; - turíce
             *  ukon = ukonKajucnosti[8][1]; - marianske sviatky
             *  ukon = ukonKajucnosti[9][1]; - za zosnulých*/
            if (ID.equals("2gkp") || ID.equals("3gkp"))
                ukon = ukonKajucnosti[7][1];
            else if (ID.contains("m"))
                ukon = ukonKajucnosti[8][1];
            else if (ID.equals("6gkp"))
                ukon = ukonKajucnosti[6][1];
            else if (A)
                ukon = ukonKajucnosti[1][1];
            else if (V)
                ukon = ukonKajucnosti[2][1];
            else if (P)
                ukon = ukonKajucnosti[3][1];
            else if (VN)
                ukon = ukonKajucnosti[4][1];
            else //cezrok
                ukon = ukonKajucnosti[0][1];
            builder.setMessage(Html.fromHtml(nahrad(ukon)));
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Úkon kajúcnosti</b></font>")));
        } else if (dialog == 6) {
            builder.setMessage("");
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Modlitby nad ľudom</b></font>")));
        }
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
        TextView text = alert.findViewById(android.R.id.message);
        text.setTextSize(sizeO);
        if (nightMode) {
            alert.getWindow().setBackgroundDrawableResource(R.color.black);
            text.setTextColor(getResources().getColor(R.color.background));
        } else {
            alert.getWindow().setBackgroundDrawableResource(R.color.background);
            text.setTextColor(Color.BLACK);
        }
        if (pismo)
            text.setTypeface(typeBold);
        if(dialog == 6) {
            otvorExtra(text, pandemiaFormular[9]);
        }
    }

    //výber, nastavenie a výpis spevov, modlitieb a prosieb podľa vybratého formulára
    @Override
    public void formular(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(Html.fromHtml("<font color='#9C0E0F'><b>Formulár</b></font>"));
        final CharSequence[] form = new CharSequence[]{"V čase pandémie"};
        builder.setSingleChoiceItems(form, 0, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int i) {
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {

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

    //výber, nastavenie a výpis EM podľa výberu
    @Override
    public void eucharistickaModlitba(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(Html.fromHtml("<font color='#9C0E0F'><b>Eucharistická modlitba</b></font>"));
        final CharSequence[] eucharistia = new CharSequence[]{"Eucharistická modlitba v omšiach za rozličné potreby"};
        builder.setSingleChoiceItems(eucharistia, 0, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int i) {
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {

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

    //výber, nastavenie a výpis prefácie podľa výberu
    @Override
    public void prefacia(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(Html.fromHtml("<font color='#9C0E0F'><b>Prefácia</b></font>"));
        final CharSequence[] pref = new CharSequence[]{"Za rozličné potreby IV"};
        builder.setSingleChoiceItems(pref, 0, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int i) {
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
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

}
