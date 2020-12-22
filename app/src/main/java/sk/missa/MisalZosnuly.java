package sk.missa;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AlertDialog;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MisalZosnuly extends Misal {

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
                vyberJazyk(MisalZosnuly.this);
                return true;
            case R.id.menu_font:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberFont(MisalZosnuly.this);
                return true;
            case R.id.menu_fullscreen:
                switch_fullscreen.setChecked(!switch_fullscreen.isChecked());
                fullscreen = switch_fullscreen.isChecked();
                putFullscreen();
                setFullscreen();
                return true;
            case R.id.menu_rezim:
                switch_rezim.setChecked(!switch_rezim.isChecked());
                rezim = switch_rezim.isChecked();
                nast_farbu = true;
                menuRezim();
                putRezim();
                pozicia_listview = listView.getFirstVisiblePosition();
                vypis();
                return true;
            case R.id.menu_pismo:
                switch_pismo.setChecked(!switch_pismo.isChecked());
                pismo = switch_pismo.isChecked();
                putPismo();
                pozicia_listview = listView.getFirstVisiblePosition();
                vypis();
                return true;
            case R.id.menu_zvoncek:
                switch_zvoncek.setChecked(!switch_zvoncek.isChecked());
                zvoncek = switch_zvoncek.isChecked();
                putZvoncek();
                pozicia_listview = listView.getFirstVisiblePosition();
                vypis();
                return true;
            case R.id.menu_tiche_modlitby:
                switch_ticheModlitby.setChecked(!switch_ticheModlitby.isChecked());
                ticheModlitby = switch_ticheModlitby.isChecked();
                putTicheModlitby();
                pozicia_listview = listView.getFirstVisiblePosition();
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
                pozicia_listview = listView.getFirstVisiblePosition();
                vypis();
            }
        });
        switch_rezim.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                rezim = isChecked;
                menuRezim();
                putRezim();
                nast_farbu = true;
                pozicia_listview = listView.getFirstVisiblePosition();
                vypis();
            }
        });
        switch_zvoncek.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                zvoncek = isChecked;
                putZvoncek();
                pozicia_listview = listView.getFirstVisiblePosition();
                vypis();
            }
        });
        switch_ticheModlitby.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ticheModlitby = isChecked;
                putTicheModlitby();
                pozicia_listview = listView.getFirstVisiblePosition();
                vypis();
            }
        });
        image_zoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomIn();
                putVelkost();
                pozicia_listview = listView.getFirstVisiblePosition();
                vypis();
            }
        });
        image_zoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOut();
                putVelkost();
                pozicia_listview = listView.getFirstVisiblePosition();
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
        rezim = settings.getBoolean("rezim", false);
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
        nadpis = ("Omša za zosnulých");
    }

    @Override
    public void spev() {
        uvodny_spev = "Úvodný spev";
        prijimanie_spev = "Spev na prijímanie";
        index = indexFormular(spevFormularZosnuly, formArray.get(pozicia_formular));
        uvodny_vypis = spevFormularZosnuly[index][3];
        uvodny_suradnice = spevFormularZosnuly[index][4];
        prijimanie_vypis = spevFormularZosnuly[index][5];
        prijimanie_suradnice = spevFormularZosnuly[index][6];
    }

    @Override
    public void modlitba() {
        modlitba_dna = "Modlitba dňa";
        modlitba_dary = "Modlitba nad obetnými darmi";
        modlitba_prijimanie = "Modlitba po prijímaní";
        index = indexFormular(modlitbaFormularZosnuly, formArray.get(pozicia_formular));
        modlitba_dna_vypis = modlitbaFormularZosnuly[index][3];
        modlitba_dary_vypis = modlitbaFormularZosnuly[index][4];
        modlitba_prijimanie_vypis = modlitbaFormularZosnuly[index][5];
    }

    @Override
    public void prosby() {
        prosby = "Spoločné modlitby veriacich";
        prosby_nadpis = prosbyZosnuly[0][2];
        prosby_uvod = prosbyZosnuly[0][3];
        prosby_zvolanie = prosbyZosnuly[0][4];
        prosby_vypis = prosbyZosnuly[0][5];
        prosby_zaver = prosbyZosnuly[0][6];
        aleboCitanie(prosbyZosnuly, 0, 5);
    }

    @Override
    public void prefacia() {
        prefacia = "Prefácia";
        index = indexOmsa(prefacie, prefaciaArray.get(pozicia_prefacia));
        prefacia_nadpis = (prefacie[index][2]);
        prefacia_vypis = prefacie[index][3];
    }

    //výber, nastavenie a výpis spevov, modlitieb a prosieb podľa vybratého formulára
    @Override
    public void formular(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(Html.fromHtml("<font color='#9C0E0F'><b>Formulár</b></font>"));
        final CharSequence[] form = formArraytoCharSequence();
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
                    pozicia_listview = listView.getFirstVisiblePosition();
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

    //výber, nastavenie a výpis EM podľa výberu
    @Override
    public void eucharistickaModlitba(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(Html.fromHtml("<font color='#9C0E0F'><b>Eucharistická modlitba</b></font>"));
        final CharSequence[] eucharistia = eucharistiaArray.toArray(new CharSequence[0]);
        builder.setSingleChoiceItems(eucharistia, pozicia_eucharistia, new DialogInterface.OnClickListener() {
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
        final CharSequence[] pref = prefaciaArray.toArray(new CharSequence[0]);
        builder.setSingleChoiceItems(pref, pozicia_prefacia, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int i) {
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                int predtym = pozicia_prefacia;
                ListView lw = ((AlertDialog) dialogInterface).getListView();
                pozicia_prefacia = lw.getCheckedItemPosition();
                if (predtym != pozicia_prefacia) {
                    prefacia();
                    pozicia_listview = listView.getFirstVisiblePosition();
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

    //nastavi moznosti formularu
    @Override
    public void ziskajFormular() {
        formArray.clear();
        formArray.add(new String[]{"1", "1", "Vo výročný deň I (mimo veľkonočného obdobia)"});
        formArray.add(new String[]{"1", "2", "Vo výročný deň II (mimo veľkonočného obdobia)"});
        formArray.add(new String[]{"2", "1", "Vo výročný deň I (vo veľkonočnom období)"});
        formArray.add(new String[]{"3", "1", "Vo výročný deň"});
        formArray.add(new String[]{"4", "1", "Vo výročný deň"});
        formArray.add(new String[]{"5", "1", "Pri rozličných spomienkach za jedného zosnulého I"});
        formArray.add(new String[]{"5", "2", "Pri rozličných spomienkach za jedného zosnulého II"});
        formArray.add(new String[]{"6", "1", "Pri rozličných spomienkach za viacerých zosnulých I"});
        formArray.add(new String[]{"6", "2", "Pri rozličných spomienkach za viacerých zosnulých II"});
        formArray.add(new String[]{"6", "3", "Pri rozličných spomienkach za viacerých zosnulých III"});
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
        prefaciaArray.add("O zosnulých I");
        prefaciaArray.add("O zosnulých II");
        prefaciaArray.add("O zosnulých III");
        prefaciaArray.add("O zosnulých IV");
        prefaciaArray.add("O zosnulých V");
    }

}