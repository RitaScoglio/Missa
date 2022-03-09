package sk.missa;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sk.missa.interfaces.Eucharistia;
import sk.missa.interfaces.Texty;
import sk.missa.interfaces.Trojdnie_text;

public class Trojdnie extends Misal implements Trojdnie_text, Eucharistia, Texty {

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
        if (!zIntent) {
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
                vyberJazyk(Trojdnie.this);
                return true;
            case R.id.menu_pozehnania:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberPozehnania();
                return true;
            case R.id.menu_font:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberFont(Trojdnie.this);
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
        getThemeStyle();
        setTheme(themeStyle);
        setContentView(R.layout.activity_misal);

        setToolbar();
        setFullscreen();
        menuRezim();

        pozicia_listview = 0;

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

        if (ID == null)
            getPremenne();
        switch (ID) {
            case "3dni4":
                prefaciaArray.add("O Eucharistii I");
                break;
            case "3dni6":
                prefaciaArray.add("Veľkonočná I");
                break;
            default:
                prefaciaArray.add("Žiadna prefácia");
                break;
        }
        if (!ID.equals("3dni5")) {
            eucharistiaArray.add("1. eucharistická modlitba");
        }
        nadpis();
        vypis();
    }

    private void getPremenne() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        ID = settings.getString("ID", "");
        tyzden = settings.getInt("tyzden", 0);
        pozicia_eucharistia = settings.getInt("poz_euch", 1);
        nightMode = settings.getBoolean("rezim", false);
        pismo = settings.getBoolean("pismo", false);
        zvoncek = settings.getBoolean("zvoncek", false);
        sizeO = settings.getInt("sizeO", 16);
        sizeN = settings.getInt("sizeN", 24);
        den = settings.getInt("den", 1);
        m = settings.getInt("m", 0);
        rok = settings.getInt("rok", 0);
    }

    private void setPremenne() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("ID", ID).apply();
        editor.putInt("tyzden", tyzden).apply();
        editor.putInt("poz_euch", pozicia_eucharistia).apply();
        editor.putInt("den", den).apply();
        editor.putInt("m", m).apply();
        editor.putInt("rok", rok).apply();
    }

    @Override
    public void vypis() {
        if (nightMode)
            drawer.setBackgroundColor(Color.BLACK);
        else
            drawer.setBackgroundColor(getResources().getColor(R.color.background));
        final ArrayList<MassText> missas = new ArrayList<>();

        String[][] obrad = {};
        switch (ID) {
            case "3dni4":
                obrad = stvrtok;
                break;
            case "3dni5":
                obrad = piatok;
                break;
            case "3dni6":
                obrad = sobota;
                break;
            default:
                break;
        }
        for (int i = 0; i < obrad.length; i++) {
            if(obrad[i][0].equals("insert")){
                switch (obrad[i][1]){
                    case "prefacia":
                        prefacia();
                        prefaciaOut(missas);
                        break;
                    case "obrad prijimania":
                        obradPrijimania(missas);
                        break;
                }
            } else if (obrad[i][0].equals("separated")){
                missas.add(new MassText(Arrays.asList(obrad[i]).subList(2, obrad[i].length), obrad[i][1]));
            } else {
                missas.add(new MassText(obrad[i][1], obrad[i][0]));
            }
        }

        MassTextAdapter adapter = new MassTextAdapter(missas);
        recyclerView = findViewById(R.id.vypis_misal);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.getLayoutManager().scrollToPosition(pozicia_listview);
        final long[] firstClick = new long[1];
        final long[] secondClick = new long[1];
         adapter.setOnItemClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double_click++;
                if (double_click == 2) {
                    secondClick[0] = System.currentTimeMillis();
                    float dif = (float) (secondClick[0] - firstClick[0]) / 1000;
                    // merac casu, ak rozdiel mensi ako 1s, tak double click = 0
                    if (dif < 1) {
                        double_click = 0;
                        fullscreen = !fullscreen;
                        putFullscreen();
                        setFullscreen();
                    } else {
                        firstClick[0] = secondClick[0];
                        double_click = 1;
                    }
                } else {
                    firstClick[0] = System.currentTimeMillis();
                }

                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag();
                int position = viewHolder.getAdapterPosition();
                MassText mText = missas.get(position);
                switch (mText.getOnClickOpen()) {
                    default:
                        break;
                }
            }
         });
    }

    @Override
    public void modlitbaEucharistia(ArrayList<MassText> missas) {
        switch (eucharistiaArray.get(pozicia_eucharistia)) {
            case "1. eucharistická modlitba":
                modlitbaEucharistiaVypis(eucharistia1, missas);
                break;
            case "2. eucharistická modlitba":
                modlitbaEucharistiaVypis(eucharistia2, missas);
                break;
            case "3. eucharistická modlitba":
                modlitbaEucharistiaVypis(eucharistia3, missas);
                break;
        }
    }

    //vypis eucharistickej modlitby
    @Override
    public void modlitbaEucharistiaVypis(String[] eucharistia, ArrayList<MassText> missas) {
       /* missas.add(new MassText("Eucharistická modlitba".toUpperCase(), null, null, false));
            for (int j = 0; j < eucharistia.length; j = j + 2) {

                if (j == 0 && eucharistia[j] != null) {
                    if (eucharistia[j].contains("Spomienka")) {
                        if (eucharistia[j + 1].length() > 6) {
                            if (eucharistia[j + 1].substring(0, 6).equals("VSUVKA")) {
                                if (ID.equals("3dni4"))
                                    missas.add(new MassText(null, eucharistia[j], vsuvkyTrojdnieEM[0][1], true));

                                else
                                    missas.add(new MassText(null, eucharistia[j], vsuvkyTrojdnieEM[1][1], true));
                            } else
                                missas.add(new MassText(null, eucharistia[j], eucharistia[j + 1], true));
                        } else
                            missas.add(new MassText(null, eucharistia[j], eucharistia[j + 1], true));
                    } else if (eucharistia[j].contains("VEZMITE")) {
                        missas.add(new MassText(null, eucharistia[j], null, false));
                        missas.add(new MassText(true));
                    } else
                        missas.add(new MassText(eucharistia[j], eucharistia[j + 1], true));
                } else if (eucharistia[j + 1].length() > 6) {
                    if (eucharistia[j + 1].substring(0, 7).equals("VSUVKA2")) {
                        if (ID.equals("3dni4")) {
                            missas.add(new MassText(eucharistia[j], vsuvkyTrojdnieEM[0][2], true));
                        } else {
                            missas.add(new MassText(eucharistia[j], vsuvkyTrojdnieEM[1][2], true));
                        }
                    } else if (eucharistia[j+1].substring(0, 8).equals("On večer")){
                        if (ID.equals("3dni4")) {
                            missas.add(new MassText(eucharistia[j], vsuvkyTrojdnieEM[0][3], true));
                        } else {
                            missas.add(new MassText(eucharistia[j], eucharistia[j + 1], true));
                        }
                    } else {
                        missas.add(new MassText(eucharistia[j], eucharistia[j + 1], true));
                    }
                } else
                    missas.add(new MassText(eucharistia[j], eucharistia[j + 1], true));
            }*/
        }

    @Override
    public void formular(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(Html.fromHtml("<font color='#80242B'><b>Formulár</b></font>"));
        final CharSequence[] form = formArray.toArray(new CharSequence[formArray.size()]);
        builder.setSingleChoiceItems(form, pozicia_formular, new DialogInterface.OnClickListener() {
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
        builder.setTitle(Html.fromHtml("<font color='#80242B'><b>Eucharistická modlitba</b></font>"));
        CharSequence[] eucharistia = eucharistiaArray.toArray(new CharSequence[eucharistiaArray.size()]);
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
        builder.setTitle(Html.fromHtml("<font color='#80242B'><b>Prefácia</b></font>"));
        final CharSequence[] pref = prefaciaArray.toArray(new CharSequence[prefaciaArray.size()]);
        builder.setSingleChoiceItems(pref, pozicia_prefacia, new DialogInterface.OnClickListener() {
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