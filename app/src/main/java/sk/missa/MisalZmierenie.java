package sk.missa;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MisalZmierenie extends Misal {

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

    String formText;

    @Override
    protected void onResume() {
        if (!zIntent) {
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
            }
        }
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
                vyberJazyk(MisalZmierenie.this);
                return true;
            case R.id.menu_pozehnania:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberPozehnania();
                return true;
            case R.id.menu_font:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberFont(MisalZmierenie.this);
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

        pozicia_listview = 0;
        pozicia_eucharistia = 0;
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
        ziskajFormular();
        ziskajIndex();
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
        pozicia_eucharistia = settings.getInt("poz_euch", 0);
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
        editor.putBoolean("zmierenie", true);
        editor.putString("zmierenie-omsa", json).apply();
        editor.putInt("poz_euch", pozicia_eucharistia).apply();
        editor.putInt("poz_form", pozicia_formular).apply();
        editor.putInt("poz_pref", pozicia_prefacia).apply();
        editor.putInt("m", m).apply();
        editor.putInt("rok", rok).apply();
    }

    @Override
    public void ziskajIndex() {
        if (P) {
            indexPS = indexTyzdenDen(postSpev);
            indexPM = indexTyzdenDen(postModlitby);
        }
    }

    @Override
    public void nadpis(){
        nadpis = ("Omša za zmierenie");
    }

    @Override
    public void spev() {
        uvodny_spev = "Úvodný spev";
        prijimanie_spev = "Spev na prijímanie";
        if (formText.equals("Pôstny")) {
            uvodny_spev_vypis = postSpev[indexPS][1];
            uvodny_suradnice = postSpev[indexPS][2];
            prijimanie_vypis = postSpev[indexPS][3];
            prijimanie_suradnice = postSpev[indexPS][4];
        } else {
            int poz = pozicia_formular;
            if (P)
                poz--;
            uvodny_spev_vypis = spevFormularZmierenie[poz][1];
            uvodny_suradnice = spevFormularZmierenie[poz][2];
            prijimanie_vypis = spevFormularZmierenie[poz][3];
            prijimanie_suradnice = spevFormularZmierenie[poz][4];
        }
    }

    @Override
    public void modlitba() {
        modlitba_dna = "Modlitba dňa";
        modlitba_dary = "Modlitba nad obetnými darmi";
        modlitba_prijimanie = "Modlitba po prijímaní";
        if (formText.equals("Pôstny")) {
            if (!feria) {
                String[][] modlitba = null;
                switch (m) {
                    case 1:
                        modlitba = modlitba2;
                        break;
                    case 2:
                        modlitba = modlitba3;
                        break;
                    case 3:
                        modlitba = modlitba4;
                        break;
                }
                int index = indexID(modlitba);
                assert modlitba != null;
                if (index != -1 && !modlitba[index][1].equals("")) {
                    modlitba_dna_vypis = modlitba[index][1];
                } else {
                    modlitba_dna_vypis = postModlitby[indexPM][1];
                }
                modlitba_dary_vypis = postModlitby[indexPM][2];
                modlitba_prijimanie_vypis = postModlitby[indexPM][3];
            } else {
                modlitba_dna_vypis = postModlitby[indexPM][1];
                modlitba_dary_vypis = postModlitby[indexPM][2];
                modlitba_prijimanie_vypis = postModlitby[indexPM][3];
            }
        } else {
            int poz = pozicia_formular;
            if (P)
                poz--;
            modlitba_dna_vypis = modlitbaFormularZmierenie[poz][1];
            modlitba_dary_vypis = modlitbaFormularZmierenie[poz][2];
            modlitba_prijimanie_vypis = modlitbaFormularZmierenie[poz][3];
        }
    }

    @Override
    public void prefacia() {
        prefacia = "Prefácia";
        if (prefText.equals("Vlastná prefácia")) {
            prefacia_nadpis = "";
            prefacia_vypis = prefacie_EM_zmierenie[pozicia_eucharistia];
        } else {
            index = indexOmsa(prefacie, prefText);
            prefacia_nadpis = prefacie[index][2];
            prefacia_vypis = prefacie[index][3];
        }
    }

    //výber, nastavenie a výpis spevov, modlitieb a prosieb podľa vybratého formulára
    @Override
    public void formular(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(Html.fromHtml("<font color='#9C0E0F'><b>Formulár</b></font>"));
        final CharSequence[] form = formArray.toArray(new CharSequence[0]);
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
                    formText = lw.getAdapter().getItem(lw.getCheckedItemPosition()).toString();
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

    //výber, nastavenie a výpis EM podľa výberu
    @Override
    public void eucharistickaModlitba(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(Html.fromHtml("<font color='#9C0E0F'><b>Eucharistická modlitba</b></font>"));
        CharSequence[] eucharistia = eucharistiaArray.toArray(new CharSequence[0]);
        builder.setSingleChoiceItems(eucharistia, pozicia_eucharistia, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int i) {
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                int predtym = pozicia_eucharistia;
                ListView lw = ((AlertDialog) dialogInterface).getListView();
                pozicia_eucharistia = lw.getCheckedItemPosition();
                if (predtym != pozicia_eucharistia) {
                    prefacia();
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
                    prefText = lw.getAdapter().getItem(lw.getCheckedItemPosition()).toString();
                    prefacia();
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

    //nastavi moznosti formularu
    List<String> formArray = new ArrayList<>();
    @Override
    public void ziskajFormular() {
        formArray.clear();
        if (P)
            formArray.add("Pôstny");
        if (!(nedela && P)) {
            formArray.add("Za zachovanie pokoja a spravodlivosti 1.");
            formArray.add("Za zachovanie pokoja a spravodlivosti 2.");
            formArray.add("Za zmierenie");
            formArray.add("V čase vojny a občianskych nepokojov");
            formArray.add("Za odpustenie hriechov");
            formArray.add("Za dar lásky");
            formArray.add("Za svornosť");
            formArray.add("O tajomstve svätého kríža");
            formArray.add("O najsvätejšej eucharistii");
            formArray.add("O predrahej krvi nášho Pána Ježiša Krista");
        }
        formText = formArray.get(pozicia_formular);
    }

    //nastavi moznosti EM
    @Override
    public void ziskajEucharistiu() {
        eucharistiaArray.clear();
        eucharistiaArray.add("1. eucharistická modlitba v omšiach za zmierenie");
        eucharistiaArray.add("2. eucharistická modlitba v omšiach za zmierenie");
    }

    //nastavi moznosti prefacie
    @Override
    public void ziskajPrefaciu() {
        prefaciaArray.clear();
        prefaciaArray.add("Vlastná prefácia");
        switch (formText) {
            case "Za svornosť":
                prefaciaArray.add("Za jednotu kresťanov");
                break;
            case "Za odpustenie hriechov":
                prefaciaArray.add("Nedeľná IV");
                break;
            case "O tajomstve svätého kríža":
                prefaciaArray.add("O víťazstve slávneho kríža");
                prefaciaArray.add("O umučení Pána I");
                break;
            case "O najsvätejšej eucharistii":
                prefaciaArray.add("O Eucharistii I");
                prefaciaArray.add("O Eucharistii II");
                break;
            case "O predrahej krvi nášho Pána Ježiša Krista":
                prefaciaArray.add("O umučení Pána I");
                break;
        }
        if (P) {
            if (nedela) {
                switch (ID) {
                    case "10":
                        prefaciaArray.add(prefacie[23][1]);
                        break;
                    case "20":
                        prefaciaArray.add(prefacie[24][1]);
                        break;
                    case "30":
                        prefaciaArray.add(prefacie[25][1]);
                        for (int b = 14; b < 18; b++) {
                            prefaciaArray.add(prefacie[b][1]);
                        }
                        break;
                    case "40":
                        prefaciaArray.add(prefacie[26][1]);
                        for (int b = 14; b < 18; b++) {
                            prefaciaArray.add(prefacie[b][1]);
                        }
                        break;
                    case "50":
                        prefaciaArray.add(prefacie[27][1]);
                        for (int b = 14; b < 18; b++) {
                            prefaciaArray.add(prefacie[b][1]);
                        }
                        break;
                    case "60":
                        prefaciaArray.add(prefacie[28][1]);
                        break;
                    default:
                        break;
                }
            } else {
                if (tyzden == 5 && !formText.equals("O tajomstve svätého kríža") && !formText.equals("O predrahej krvi nášho Pána Ježiša Krista")) {
                    prefaciaArray.add(prefacie[29][1]);
                } else if (tyzden == 6) {
                    prefaciaArray.add(prefacie[30][1]);
                } else {
                    for (int b = 14; b < 18; b++) {
                        prefaciaArray.add(prefacie[b][1]);
                    }
                }
            }
        }
        prefText = prefaciaArray.get(pozicia_prefacia);
    }
}