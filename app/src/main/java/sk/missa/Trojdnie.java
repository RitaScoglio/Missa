package sk.missa;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import sk.missa.interfaces.Texty;
import sk.missa.interfaces.Trojdnie_text;
import sk.missa.interfaces.Eucharistia;

public class Trojdnie extends Misal implements Trojdnie_text, Eucharistia, Texty {

    List<String> eucharistiaArray = new ArrayList<>();
    List<String> prefaciaArray = new ArrayList<>();

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
                return true;
            case R.id.menu_odpovede:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberJazyk(Trojdnie.this);
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
                switch_tiche_modlitby.setChecked(!switch_tiche_modlitby.isChecked());
                tiche_modlitby = switch_tiche_modlitby.isChecked();
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
        switch_tiche_modlitby.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                tiche_modlitby = isChecked;
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

        if (ID == null)
            getPremenne();
        switch (ID) {
            case "3dni4":
                prefaciaArray.add("O Eucharistii I.");
                break;
            case "3dni6":
                prefaciaArray.add("Veľkonočná I.");
                break;
            default:
                prefaciaArray.add("Žiadna prefácia");
                break;
        }
        if (!ID.equals("3dni5")) {
            eucharistiaArray.add("1. eucharistická modlitba");
            eucharistiaArray.add("2. eucharistická modlitba");
            eucharistiaArray.add("3. eucharistická modlitba");
        }
        vypis();
    }

    private void getPremenne() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        ID = settings.getString("ID", "");
        tyzden = settings.getInt("tyzden", 0);
        pozicia_eucharistia = settings.getInt("poz_euch", 1);
        rezim = settings.getBoolean("rezim", false);
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
        if (rezim)
            drawer.setBackgroundColor(Color.BLACK);
        else
            drawer.setBackgroundColor(getResources().getColor(R.color.background));
        final ArrayList<Missa> missas = new ArrayList<>();

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
            switch (obrad[i][0]) {
                case "S": //nadpis
                    missas.add(new Missa(obrad[i][1], null, null, null, null, false, -1));
                    break;
                case "N": //podnadpisy
                    missas.add(new Missa(obrad[i][1], null, null, null, null, false, -2));
                    break;
                case "K": //komentare
                    if (obrad[i].length > 2)
                        for (int j = 1; j < obrad[i].length; j += 2) {
                            missas.add(new Missa(obrad[i][j], obrad[i][j + 1], true));
                        }
                    else
                        missas.add(new Missa(obrad[i][1], null, true));
                    break;
                case "V": //vyskakovacie okna
                    if(obrad[i][2] == null)
                        missas.add(new Missa("<font color='#B71C1C'>" + obrad[i][1] + "</font>", null, null, true, i, 1));
                    else
                        missas.add(new Missa(null, obrad[i][1], obrad[i][2], false, i, 1));
                    break;
                case "E": //citania, evanjelia - -2, zalmy, spevy - 0 (otvor)
                    missas.add(new Missa(null, obrad[i][1], obrad[i][2], obrad[i][3], obrad[i][4], true, 0));
                    if (obrad[i].length > 5) { //pasie
                        for (int j = 5; j < obrad[i].length; j += 2) {
                            missas.add(new Missa(null, null, null, obrad[i][j], obrad[i][j + 1], true, -2));
                        }
                    }
                    break;
                case "A": //komentare a evajelium na bielu sobotu
                    int j = 0;
                    if (cirkevRok == 2) {
                        j++;
                    }
                    if (cirkevRok == 0) {
                        j += 2;
                    }
                    missas.add(new Missa(null, "EVANJELIUM", evanjeliumSobota[j][0], null, null, false, 0));
                    missas.add(new Missa(obrad[i][1], null, true));
                    missas.add(new Missa(null, null, null, evanjeliumSobota[j][1], evanjeliumSobota[j][2], true, 0));
                    missas.add(new Missa(obrad[i][2], null, true));
                    break;
                case "P": //prefacia
                    missas.add(new Missa("PREFÁCIA", obrad[i][1], obrad[i][2], true));
                    modlitbaEucharistia(missas);
                    break;
                case "O": //obrad prijimanie
                    obradPrijimania(missas);
                    break;
                case "":
                    missas.add(new Missa(2)); //medzera velka
                    break;
                default:
                    break;
            }
        }

        MissaAdapter adapter = new MissaAdapter(this, missas);
        listView = findViewById(R.id.vypis_misal);
        listView.setAdapter(adapter);
        listView.setSelection(pozicia_listview);
        final long[] firstClick = new long[1];
        final long[] secondClick = new long[1];
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
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
                Missa missa = missas.get(position);
                if (missa.getOtvor() == 1) {
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
                    final Dialog dialog = new Dialog(Trojdnie.this);
                    dialog.setContentView(R.layout.custom_dialog);
                    ListView dialogListview = dialog.findViewById(R.id.vypis_misal);
                    TextView dialogTextView = dialog.findViewById(R.id.dialog_title);
                    Button dialogButton = dialog.findViewById(R.id.dialog_button);
                    final ArrayList<Missa> dg = new ArrayList<>();

                    if (rezim) {
                        dialog.getWindow().setBackgroundDrawableResource(R.color.black);
                        dialogTextView.setTextColor(getResources().getColor(R.color.background));
                    } else {
                        dialog.getWindow().setBackgroundDrawableResource(R.color.background);
                        dialogTextView.setTextColor(getResources().getColor(R.color.primary));
                    }
                    dialogButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                        }
                    });

                    int index = missa.getIndex();
                    if (missa.getText() != null)
                        dialogTextView.setText(obrad[index][1]);
                    else
                        dialogTextView.setText(obrad[index][1]);
                    if (obrad[index][1].startsWith("Procesia")){
                        for (int j = 3; j < obrad[index].length; j += 2) {
                            dg.add(new Missa(obrad[index][j], obrad[index][j + 1], true));
                        }
                    } else {
                        for (int i = 3; i < obrad[index].length; i += 4) {
                            dg.add(new Missa(null, obrad[index][i], obrad[index][i + 1], obrad[index][i + 2], obrad[index][i + 3], true, 0));
                        }
                    }
                    dg.add(new Missa(2));
                    dg.add(new Missa(2));
                    MissaAdapter ada = new MissaAdapter(Trojdnie.this, dg);
                    dialogListview.setAdapter(ada);
                    dialog.show();
                }
            }
        });
    }

    @Override
    public void modlitbaEucharistia(ArrayList<Missa> missas) {
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
    public void modlitbaEucharistiaVypis(String[][] eucharistia, ArrayList<Missa> missas) {
        missas.add(new Missa("Eucharistická modlitba".toUpperCase(), null, null, false));
        for (int i = 0; i < eucharistia.length; i++) {
            for (int j = 0; j < eucharistia[i].length; j = j + 2) {

                if (j == 0 && eucharistia[i][j] != null) {
                    if (eucharistia[i][j].contains("Spomienka")) {
                        if (eucharistia[i][j + 1].length() > 6) {
                            if (eucharistia[i][j + 1].substring(0, 6).equals("VSUVKA")) {
                                if (ID.equals("3dni4"))
                                    missas.add(new Missa(null, eucharistia[i][j], vsuvkyTrojdnieEM[0][1], true));

                                else
                                    missas.add(new Missa(null, eucharistia[i][j], vsuvkyTrojdnieEM[1][1], true));
                            } else
                                missas.add(new Missa(null, eucharistia[i][j], eucharistia[i][j + 1], true));
                        } else
                            missas.add(new Missa(null, eucharistia[i][j], eucharistia[i][j + 1], true));
                    } else if (eucharistia[i][j].contains("VEZMITE")) {
                        missas.add(new Missa(null, eucharistia[i][j], null, false));
                        missas.add(new Missa(true));
                    } else
                        missas.add(new Missa(eucharistia[i][j], eucharistia[i][j + 1], true));
                } else if (eucharistia[i][j + 1].length() > 6) {
                    if (eucharistia[i][j + 1].substring(0, 7).equals("VSUVKA2")) {
                        if (ID.equals("3dni4")) {
                            missas.add(new Missa(eucharistia[i][j], vsuvkyTrojdnieEM[0][2], true));
                        } else {
                            missas.add(new Missa(eucharistia[i][j], vsuvkyTrojdnieEM[1][2], true));
                        }
                    } else if (eucharistia[i][j+1].substring(0, 8).equals("On večer")){
                        if (ID.equals("3dni4")) {
                            missas.add(new Missa(eucharistia[i][j], vsuvkyTrojdnieEM[0][3], true));
                        } else {
                            missas.add(new Missa(eucharistia[i][j], eucharistia[i][j + 1], true));
                        }
                    } else {
                        missas.add(new Missa(eucharistia[i][j], eucharistia[i][j + 1], true));
                    }
                } else
                    missas.add(new Missa(eucharistia[i][j], eucharistia[i][j + 1], true));
            }
        }
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