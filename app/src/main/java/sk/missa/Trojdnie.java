package sk.missa;

/*
* táto trieda sa bude meniť a celé trojdnie a ešte bude upravovať
* */

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
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import sk.missa.interfaces.Texty;
import sk.missa.interfaces.Trojdnie_text;
import sk.missa.interfaces.Eucharistia;

public class Trojdnie extends Main implements Trojdnie_text, Eucharistia, Texty {

    TextView txt;
    Typeface typeface, typeface2;
    ImageView zvoncek_1;
    ImageView zvoncek_2;
    TextView euch1, euch2, euch3;
    List<String> eucharistiaArray = new ArrayList<>();
    List<String> prefaciaArray = new ArrayList<>();
    int lec;

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
                menuRezim();
                putRezim();
                nastavFarbu();
                vypis();
                return true;
            case R.id.menu_pismo:
                switch_pismo.setChecked(!switch_pismo.isChecked());
                pismo = switch_pismo.isChecked();
                putPismo();
                nastavPismo();
                return true;
            case R.id.menu_zvoncek:
                switch_zvoncek.setChecked(!switch_zvoncek.isChecked());
                zvoncek = switch_zvoncek.isChecked();
                putZvoncek();
                zvonceky();
                return true;
            case R.id.menu_tiche_modlitby:
                switch_tiche_modlitby.setChecked(!switch_tiche_modlitby.isChecked());
                tiche_modlitby = switch_tiche_modlitby.isChecked();
                putTicheModlitby();
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
        setContentView(R.layout.activity_trojdnie);

        setToolbar();
        setFullscreen();
        menuRezim();

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
                nastavPismo();
            }
        });
        switch_rezim.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                rezim = isChecked;
                menuRezim();
                putRezim();
                nastavFarbu();
                vypis();
            }
        });
        switch_zvoncek.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                zvoncek = isChecked;
                putZvoncek();
                zvonceky();
            }
        });
        switch_tiche_modlitby.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                tiche_modlitby = isChecked;
                putTicheModlitby();
            }
        });
        image_zoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomIn();
                putVelkost();
                setSize();
            }
        });
        image_zoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOut();
                putVelkost();
                setSize();
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
        zvoncek_1 = findViewById(R.id.zvoncek_1);
        zvoncek_2 = findViewById(R.id.zvoncek_2);
        euch1 = findViewById(R.id.eucharistia1);
        euch2 = findViewById(R.id.eucharistia2);
        euch3 = findViewById(R.id.eucharistia3);
        setSize();
        nastavFarbu();
        nastavPismo();
        vypis();
        vypisEucharistia();
    }

    private void zvonceky() {
        if (zvoncek && !ID.equals("3dni5")) {
            zvoncek_1.setBackgroundResource(R.drawable.bell);
            zvoncek_2.setBackgroundResource(R.drawable.bell);
            zvoncek_1.getLayoutParams().height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, sizeZ, getResources().getDisplayMetrics());
            zvoncek_1.getLayoutParams().width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, sizeZ, getResources().getDisplayMetrics());
            zvoncek_2.getLayoutParams().height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, sizeZ, getResources().getDisplayMetrics());
            zvoncek_2.getLayoutParams().width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, sizeZ, getResources().getDisplayMetrics());
            zvoncek_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MediaPlayer mMediaPlayer = MediaPlayer.create(Trojdnie.this, R.raw.zvoncek);
                    mMediaPlayer.start();
                }
            });
            zvoncek_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MediaPlayer mMediaPlayer = MediaPlayer.create(Trojdnie.this, R.raw.zvoncek);
                    mMediaPlayer.start();
                }
            });
        } else {
            zvoncek_1.setBackgroundResource(0);
            zvoncek_2.setBackgroundResource(0);
            zvoncek_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                }
            });
            zvoncek_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                }
            });
        }
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

    private void vypis() {
        if (ID.equals("3dni4"))
            lec = 0;
        else if (ID.equals("3dni5"))
            lec = 1;
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
        for (int i = 0; i < view.length; i++) {
            txt = findViewById(view[i]);
            txt.setText("");
            switch (obrad[i][0]) {
                case "N": //nadpisy
                    vypisNadpis(obrad, i);
                    break;
                case "K": //komentare
                    vypisKomentar(obrad, i);
                    break;
                case "V": //vyskakovacie okna
                    vypisVyskakovacie(obrad, i);
                    break;
                case "E": //citania, evanjelia, zalmy
                    vypisEvanjelium(obrad, i);
                    break;
                case "A": //epistola a evanjelium sobota
                    vypisA(obrad, i);
                    break;
                case "P": //prefacia
                    vypisPrefacia(obrad, i);
                    break;
                case "O": //obrad prijimanie
                    vypisObradPrijimania();
                    break;
                case "C": //specialne komentare
                    vypisC(obrad, i);
                    break;
                case "":
                    txt.setText(obrad[i][1]);
                    break;
                default:
                    break;
            }
        }
    }

    private void vypisC(String[][] obrad, int i) {
        for (int j = 1; j < obrad[i].length; j++) {
            if (!obrad[i][j].equals("")) {
                SpannableString s = new SpannableString(obrad[i][j]);
                s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                if (j % 2 == 0) {
                    if (obrad[i][j].substring(0, 3).equals("<i>")) {
                        s = new SpannableString(obrad[i][j].substring(3));
                        s.setSpan(new StyleSpan(typeface2.getStyle()), 0, s.length(), 0);
                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                    }
                } else {
                    s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
                }
                txt.append(s);
            }

        }
    }

    private void vypisObradPrijimania() {
        txt.setText(Html.fromHtml(nahrad("<br><font color='#B71C1C'><b>obrad prijímania</b></font><br>").toUpperCase()));
        obradPrijimania(modlitba_pana_text);
        obradPrijimania(obrad_pokoja_text);
        lamanieChleba();
    }

    private void lamanieChleba() {
        /*SpannableString s = new SpannableString("Lámanie chleba\n");
        s.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s.length(), 0);
        s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
        txt.append(s);
        for (int i = 0; i < Texty.lamanie_chleba_text.length; i++) {
            for (int j = 0; j < Texty.lamanie_chleba_text[i].length; i++) {
                s = new SpannableString(Texty.lamanie_chleba_text[i][j]);
                if (i % 2 == 1) {
                    s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                    s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
                }
                txt.append(s);
            }
            if (i == Texty.lamanie_chleba_text.length - 1)
                txt.append("\n");
        }*/
    }

    private void obradPrijimania(String[] obrad) {
        SpannableString s = new SpannableString(obrad[0] + "\n");
        s.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s.length(), 0);
        s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
        txt.append(s);
        for (int i = 1; i < obrad.length; i++) {
            s = new SpannableString(obrad[i]);
            if (i % 2 == 1) {
                s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
            } else {
                if (i == 6 && ID.equals("3dni6")) {
                    s = new SpannableString("\nVoláme sa Božími deťmi a nimi aj sme; preto sa modlime s veľkou dôverou:\n");
                    s.setSpan(new ForegroundColorSpan(farba_b), 0, s.length(), 0);
                    i = i + 2;
                } else if (i == 6 && ID.equals("3dni4")) {
                    s = new SpannableString("\nAk chceme volať Boha naším Otcom, musíme si navzájom odpustiť; buďme ako jedna rodina a spoločne sa modlime:\n");
                    s.setSpan(new ForegroundColorSpan(farba_b), 0, s.length(), 0);
                    i = i + 2;
                } else
                    s.setSpan(new ForegroundColorSpan(farba_b), 0, s.length(), 0);
            }
            txt.append(s);
            if (i == obrad.length - 1)
                txt.append("\n");
        }
    }

    private void vypisPrefacia(String[][] obrad, int i) {
        txt.append(Html.fromHtml(nahrad("<font color='#B71C1C'><b>prefácia</b></font><br>").toUpperCase()));
        SpannableString s = new SpannableString(obrad[i][1]);
        s.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s.length(), 0);
        s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
        txt.append(s);
        txt.append(Html.fromHtml(nahrad(obrad[i][2])));
    }

    private void vypisEucharistia() {
        if (pozicia_eucharistia == 0) {
            modlitbaEucharistia(eucharistia1);
        }
        if (pozicia_eucharistia == 1) {
            modlitbaEucharistia(eucharistia2);
        }
        if (pozicia_eucharistia == 2) {
            modlitbaEucharistia(eucharistia3);
        }
    }

    private void modlitbaEucharistia(String[][] eucharistia) {
        TextView txt = null;
        for (int i = 0; i < eucharistia.length; i++) {
            switch (i) {
                case 0:
                    txt = euch1;
                    break;
                case 1:
                    txt = euch2;
                    break;
                case 2:
                    txt = euch3;
                    break;
                default:
                    break;
            }
            txt.setText("");
            if (i == 0) {
                txt.setText(Html.fromHtml(nahrad("<br><font color='#B71C1C'><b>eucharistická modlitba</b></font><br>").toUpperCase()));
            }
            for (int j = 0; j < eucharistia[i].length; j++) {
                SpannableString s = new SpannableString(eucharistia[i][j]);
                if (j % 2 == 0) {
                    s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                    s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
                    txt.append(s);
                } else {
                    if (eucharistia[i][j].length() > 6) {
                        if (eucharistia[i][j].substring(0, 7).equals("VSUVKA2")) {
                            if (ID.equals("3dni4"))
                                txt.append(Html.fromHtml(nahrad(vsuvkyEM[0][2])));
                            else if (ID.equals("3dni6"))
                                txt.append(Html.fromHtml(nahrad(vsuvkyEM[1][2])));
                        } else if (eucharistia[i][j].substring(0, 6).equals("VSUVKA")) {
                            if (ID.equals("3dni4"))
                                txt.append(Html.fromHtml(nahrad(vsuvkyEM[0][1])));
                            else if (ID.equals("3dni6"))
                                txt.append(Html.fromHtml(nahrad(vsuvkyEM[1][1])));
                        } else if (eucharistia[i][j].contains("On večer")) {
                            if (ID.equals("3dni4")) {
                                txt.append(Html.fromHtml(nahrad(vsuvkyEM[0][3])));
                            } else
                                txt.append(Html.fromHtml(nahrad(eucharistia[i][j])));
                        } else if (eucharistia[i][j].contains("VEZMITE")) {
                            s.setSpan(new ForegroundColorSpan(farba_b), 0, s.length(), 0);
                            s.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s.length(), 0);
                            txt.append(s);
                        } else if (eucharistia[i][j].contains("Spomienka")) {
                            s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
                            s.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s.length(), 0);
                            txt.append(s);
                        } else
                            txt.append(Html.fromHtml(nahrad(eucharistia[i][j])));
                    } else
                        txt.append(Html.fromHtml(nahrad(eucharistia[i][j])));
                }
            }
        }
    }


    private void vypisA(String[][] obrad, int i) {
        if (rok % 3 == 2)
            index = 3;
        else if (rok % 3 == 0)
            index = 6;
        else
            index = 0;
        for (int j = 1; j < obrad[i].length; j++) {
            if (!obrad[i][j].equals("")) {
                if (j % 2 == 1) {
                    if (j == 3 || j == 11 || j == 13 || j == 15) {
                        SpannableString s = new SpannableString(obrad[i][j]);
                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                        s.setSpan(new ForegroundColorSpan(farba_b), 0, s.length(), 0);
                        txt.append(s);
                    } else if (j == 19) {
                        txt.append(Html.fromHtml(nahrad("<font color='#B71C1C'>EVANJELIUM " + evanjeliumSobota[index] + "<font color='#B71C1C'><br>")));
                    } else if (j == 23)
                        txt.append(Html.fromHtml(nahrad(evanjeliumSobota[index + 2])));
                    else
                        txt.append(Html.fromHtml(nahrad(obrad[i][j])));
                } else {
                    SpannableString s;
                    if (j == 8) {
                        s = new SpannableString(obrad[i][j]);
                        s.setSpan(new StyleSpan(typeface2.getStyle()), 0, s.length(), 0);
                        s.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s.length(), 0);
                    } else if (j == 22) {
                        s = new SpannableString(evanjeliumSobota[index + 1]);
                        s.setSpan(new StyleSpan(typeface2.getStyle()), 0, s.length(), 0);
                        s.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s.length(), 0);
                    } else if (obrad[i][j].charAt(2) == '.') {
                        s = new SpannableString(obrad[i][j]);
                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                        s.setSpan(new ForegroundColorSpan(farba_r), 3, s.length(), 0);
                    } else {
                        s = new SpannableString(obrad[i][j]);
                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                        s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
                    }
                    txt.append(s);
                }
            }
        }
    }

    private void vypisEvanjelium(String[][] obrad, int i) {
        if (!obrad[i][1].equals("")) {
            TextView t1 = findViewById(lection[lec * 2]);
            t1.setText(obrad[i][1]);
            TextView t2 = findViewById(lection[lec * 2 + 1]);
            t2.setText(obrad[i][2]);
            lec++;
        }
        for (int j = 3; j < obrad[i].length; j++) {
            if (j % 2 == 1 && !obrad[i][j].equals("")) {
                SpannableString s = new SpannableString(obrad[i][j]);
                s.setSpan(new StyleSpan(typeface2.getStyle()), 0, s.length(), 0);
                s.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s.length(), 0);
                txt.append(s);
            } else {
                txt.append(Html.fromHtml(nahrad(obrad[i][j])));
            }
        }
    }

    private void vypisVyskakovacie(final String[][] obrad, final int i) {
        if (obrad[i][1].contains("KRATŠÍ"))
            txt.setText(Html.fromHtml(nahrad(obrad[i][1] + " <font color='#B71C1C'>(otvoriť)</font><br>")));
        else
            txt.setText(Html.fromHtml(nahrad(obrad[i][1] + " <font color='#B71C1C'>(otvoriť)</font>")));
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertBuilder(obrad, i);
            }
        });
    }

    private void alertBuilder(String[][] obrad, int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(Html.fromHtml(nahrad(obrad[i][1])))
                .setMessage(Html.fromHtml(nahrad(obrad[i][2])))
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
        TextView text = dialog.findViewById(android.R.id.message);
        assert text != null;
        text.setTextSize(sizeO);
        if (rezim) {
            dialog.getWindow().setBackgroundDrawableResource(R.color.black);
            text.setTextColor(farba_b);
        } else {
            dialog.getWindow().setBackgroundDrawableResource(R.color.background);
            text.setTextColor(farba_b);
        }
        if (obrad[i].length > 3) {
            text.setText("");
            if (ID.equals("3dni6") && i == obrad.length - 1) {
                for (int j = 2; j < obrad[i].length; j++) {
                    if (!obrad[i][j].equals("")) {
                        if (j % 2 == 1) {
                            text.append(Html.fromHtml(nahrad(obrad[i][j])));
                        } else {
                            SpannableString s = new SpannableString(obrad[i][j]);
                            if (obrad[i][j].charAt(2) == '.') {
                                switch (obrad[i][j].substring(0, 3)) {
                                    case "64.":
                                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                        s.setSpan(new ForegroundColorSpan(farba_r), 3, s.length(), 0);
                                        text.append(s);
                                        j++;
                                        s = new SpannableString(obrad[i][j]);
                                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                        s.setSpan(new ForegroundColorSpan(farba_b), 0, s.length(), 0);
                                        break;
                                    case "65.":
                                    case "69.":
                                    case "70.":
                                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                        s.setSpan(new ForegroundColorSpan(farba_r), 3, s.length(), 0);
                                        text.append(s);
                                        j++;
                                        s = new SpannableString(obrad[i][j]);
                                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                        s.setSpan(new ForegroundColorSpan(farba_b), 0, s.length(), 0);
                                        s.setSpan(new StyleSpan(typeface2.getStyle()), 0, s.length(), 0);
                                        break;
                                    case "66.":
                                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                        s.setSpan(new ForegroundColorSpan(farba_r), 3, s.length(), 0);
                                        text.append(s);
                                        j++;
                                        s = new SpannableString(obrad[i][j]);
                                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                        s.setSpan(new ForegroundColorSpan(farba_b), 0, s.length(), 0);
                                        s.setSpan(new StyleSpan(typeface2.getStyle()), 0, s.length(), 0);
                                        text.append(s);
                                        j++;
                                        s = new SpannableString(obrad[i][j]);
                                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                        s.setSpan(new ForegroundColorSpan(farba_r), 3, s.length(), 0);
                                        text.append(s);
                                        j++;
                                        s = new SpannableString(obrad[i][j]);
                                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                        s.setSpan(new ForegroundColorSpan(farba_b), 0, s.length(), 0);
                                        s.setSpan(new StyleSpan(typeface2.getStyle()), 0, s.length(), 0);
                                        break;
                                    default:
                                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                        s.setSpan(new ForegroundColorSpan(farba_r), 3, s.length(), 0);
                                        break;
                                }
                            } else {
                                s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
                            }
                            text.append(s);
                        }
                    }
                }
            } else {
                for (int j = 2; j < obrad[i].length; j++) {
                    switch (obrad[i][j].substring(0, 3)) {
                        case "<i>": {
                            SpannableString s = new SpannableString(obrad[i][j].substring(3));
                            s.setSpan(new StyleSpan(typeface2.getStyle()), 0, s.length(), 0);
                            s.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s.length(), 0);
                            text.append(s);
                            break;
                        }
                        case "<c>": {
                            SpannableString s = new SpannableString(obrad[i][j].substring(3));
                            s.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s.length(), 0);
                            s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
                            text.append(s);
                            break;
                        }
                        default:
                            text.append(Html.fromHtml(nahrad(obrad[i][j])));
                            break;
                    }
                }
            }
        }
    }

    private void vypisNadpis(String[][] obrad, int i) {
        if (i != 0) {
            txt.setText(Html.fromHtml(obrad[i][1]));
            txt.setGravity(Gravity.CENTER);
        } else
            txt.setText(obrad[i][1]);
    }

    private void vypisKomentar(String[][] obrad, int i) {
        for (int j = 1; j < obrad[i].length; j++) {
            if (!obrad[i][j].equals("")) {
                if (j % 2 == 0) {
                    txt.append(Html.fromHtml(nahrad(obrad[i][j])));
                } else {
                    SpannableString s = new SpannableString(obrad[i][j]);
                    if (ID.equals("3dni6")) {
                        if (obrad[i][j].charAt(1) == '.') {
                            s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                            s.setSpan(new ForegroundColorSpan(farba_r), 2, s.length(), 0);
                        } else if (obrad[i][j].charAt(2) == '.') {
                            switch (obrad[i][j].substring(0, 3)) {
                                case "47.":
                                case "49.":
                                    s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                    s.setSpan(new ForegroundColorSpan(farba_r), 3, s.length(), 0);
                                    txt.append(s);
                                    j++;
                                    s = new SpannableString(obrad[i][j]);
                                    s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                    s.setSpan(new ForegroundColorSpan(farba_b), 0, s.length(), 0);
                                    break;
                                case "17.":
                                case "56.":
                                    s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                    s.setSpan(new ForegroundColorSpan(farba_r), 3, s.length(), 0);
                                    txt.append(s);
                                    j++;
                                    txt.append(Html.fromHtml(nahrad(obrad[i][j])));
                                    for (int a = 0; a < 2; a++) {
                                        j++;
                                        s = new SpannableString(obrad[i][j]);
                                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                        s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
                                        txt.append(s);
                                        j++;
                                        s = new SpannableString(obrad[i][j]);
                                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                        s.setSpan(new ForegroundColorSpan(farba_b), 0, s.length(), 0);
                                        if (a == 0)
                                            txt.append(s);
                                    }
                                    break;
                                default:
                                    s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                                    s.setSpan(new ForegroundColorSpan(farba_r), 3, s.length(), 0);

                                    break;
                            }
                        } else {
                            s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                            s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
                        }
                    } else {
                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                        s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
                    }
                    txt.append(s);
                }
            }
        }
    }

    private void nastavPismo() {
        if (pismo) {
            typeface = typeBold;
            typeface2 = typeBoldItalic;
        } else {
            typeface = typeNormal;
            typeface2 = typeItalic;
        }
        for (int i = 1; i < view.length; i++) {
            txt = findViewById(view[i]);
            txt.setTypeface(typeface);
        }
        if (!ID.equals("3dni5")) {
            euch1.setTypeface(typeface);
            euch2.setTypeface(typeface);
            euch3.setTypeface(typeface);
        }
        if (!ID.equals("3dni6"))
            for (Integer aLection : lection) {
                txt = findViewById(aLection);
                txt.setTypeface(typeface);
            }
    }

    private void nastavFarbu() {
        if (rezim) {
            drawer.setBackgroundColor(Color.BLACK);
            farba_b = getResources().getColor(R.color.background);
            farba_r = getResources().getColor(R.color.primary_light);
        } else {
            drawer.setBackgroundColor(getResources().getColor(R.color.background));
            farba_b = Color.BLACK;
            farba_r = getResources().getColor(R.color.primary);

        }
        for (Integer aView : view) {
            txt = findViewById(aView);
            txt.setTextColor(farba_b);
        }
        if (!ID.equals("3dni5")) {
            euch1.setTextColor(farba_b);
            euch2.setTextColor(farba_b);
            euch3.setTextColor(farba_b);
        }
        if (!ID.equals("3dni6"))
            for (Integer aLection : lection) {
                txt = findViewById(aLection);
                txt.setTextColor(farba_r);
            }
    }

    private void setSize() {
        txt = findViewById(view[0]);
        txt.setTextSize(sizeN);
        for (int i = 1; i < view.length; i++) {
            txt = findViewById(view[i]);
            txt.setTextSize(sizeO);
        }
        if (!ID.equals("3dni5")) {
            euch1.setTextSize(sizeO);
            euch2.setTextSize(sizeO);
            euch3.setTextSize(sizeO);
        }
        if (!ID.equals("3dni6"))
            for (Integer aLection : lection) {
                txt = findViewById(aLection);
                txt.setTextSize(sizeO);
            }
        if (zvoncek) {
            zvoncek_1.getLayoutParams().height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, sizeZ, getResources().getDisplayMetrics());
            zvoncek_1.getLayoutParams().width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, sizeZ, getResources().getDisplayMetrics());
            zvoncek_2.getLayoutParams().height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, sizeZ, getResources().getDisplayMetrics());
            zvoncek_2.getLayoutParams().width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, sizeZ, getResources().getDisplayMetrics());
        }
    }

    public void formular(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(Html.fromHtml("<font color='#9C0E0F'><b>Formulár</b></font>"));
        final CharSequence[] form = {"Vlastný formulár"};
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
                if (predtym != pozicia_eucharistia)
                    vypisEucharistia();
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
