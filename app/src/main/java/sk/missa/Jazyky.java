package sk.missa;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.Arrays;

import sk.missa.interfaces.Language;

public class Jazyky extends Main implements Language {

    TextView txt;
    int dlzka_m, dlzka_v;
    TextView bonus;

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

    //zisti či je rovnaký deň ako pri otvorení aplikácie, ak nie, tak otvorí úvodnú stranu
    @Override
    protected void onResume() {
        if (!zIntent){
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        setDate();
        if(den != settings.getInt("denOpen", 1) ||
                m != settings.getInt("mOpen", 0) ||
                rok != settings.getInt("rokOpen", 0)){
            zIntent = true;
        Intent uvod = new Intent(this, Uvod.class);
        startActivity(uvod);
        finish();}}
            super.onResume();
    }

    //možnosti v menu
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
                vyber();
                return true;
            case R.id.menu_pozehnania:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberPozehnania();
                return true;
            case R.id.menu_font:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberFont(Jazyky.this);
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
                return true;
            case R.id.menu_tiche_modlitby:
                switch_ticheModlitby.setChecked(!switch_ticheModlitby.isChecked());
                ticheModlitby = switch_ticheModlitby.isChecked();
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
        //nastaví písmo v celej aplikácií - pätkové alebo bezpätkové
        getThemeStyle();
        setTheme(themeStyle);
        //nastaví layout
        setContentView(R.layout.activity_jazyky);

        //nastaví toolbar, fullscreen a režim v menu
        setToolbar("Odpovede v cudzích jazykoch");
        setFullscreen();
        menuRezim();

        //nastavenie menu
        setBottomMenu(this);

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
                nastavPismo();
            }
        });
        switch_rezim.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                nightMode = isChecked;
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
            }
        });
        switch_ticheModlitby.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ticheModlitby = isChecked;
                putTicheModlitby();
            }
        });
        image_zoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomIn();
                putVelkost();
                nastavSize();
            }
        });
        image_zoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOut();
                putVelkost();
                nastavSize();
            }
        });
        //ak si nepamata jazyk (najcastejsie po znovuotvoreni aplikacie), ziska premenne z funkcie getPremenne
        if (jazyk == null)
            getPremenne();

        //nastavi kolko views je potrebnych pre jazyk
        if (jazyk == 6) {
            dlzka_m = meno_view.length;
            dlzka_v = vypis_view.length;
        } else if (jazyk == 0 || jazyk == 1 || jazyk == 4 || jazyk == 7) {
            dlzka_m = meno_view.length - 3;
            dlzka_v = vypis_view.length - 3;
            if (jazyk == 4)
            bonus = findViewById(R.id.bonus);
        } else {
            dlzka_m = meno_view.length - 5;
            dlzka_v = vypis_view.length - 5;
        }
        //nastavi farbu (podla rezimu), pismo (podla možnostý tučné písmo), veľkosť (podľa nastavenej veľkosti)
        nastavFarbu();
        nastavPismo();
        nastavSize();
        //vypíše text
        vypis();
    }

    //pri výbere jazyka v menu reštartuje aktivitu
    public void vyber() {
        new MissaDialog(this, "Odpovede v cudzích jazykoch", Arrays.asList(jazyky), "menu_language");
    }

    //nastaví uložené premenné
    private void getPremenne() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        den = settings.getInt("den", 1);
        m = settings.getInt("m", 0);
        rok = settings.getInt("rok", 0);
        jazyk = settings.getInt("jazyk", 0);
        nightMode = settings.getBoolean("rezim", false);
        pismo = settings.getBoolean("pismo", false);
        sizeO = settings.getInt("sizeO", 16);
        sizeN = settings.getInt("sizeN", 24);
    }

    //nastaví premenné pri onPause
    private void setPremenne() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("jazyk", jazyk).apply();
        editor.putInt("den", den).apply();
        editor.putInt("m", m).apply();
        editor.putInt("rok", rok).apply();
    }

    //vypíše text podľa vybratého jazyku
    private void vypis() {
        switch (jazyk) {
            case 0:
                vypisText(English_nadpis, English_vypis);
                break;
            case 1:
                vypisText(French_nadpis, French_vypis);
                break;
            case 2:
                vypisText(Croatia_nadpis, Croatia_vypis);
                break;
            case 3:
                vypisText(Latin_nadpis, Latin_vypis);
                break;
            case 4:
                vypisText(Hungary_nadpis, Hungary_vypis);
                break;
            case 5:
                vypisText(German_nadpis, German_vypis);
                break;
            case 6:
                vypisText(Polish_nadpis, Polish_vypis);
                break;
            case 7:
                vypisText(Spain_nadpis, Spain_vypis);
                break;
            case 8:
                vypisText(Italy_nadpis, Italy_vypis);
                break;
            default:
                break;
        }
    }

    //výpis textu
    private void vypisText(String[] nadpis, String[][] vypis) {
        for (int i = 0; i < nadpis_view.length; i++) {
            txt = findViewById(nadpis_view[i]);
            txt.setText(Html.fromHtml(nadpis[i]));
        }
        for (int i = 0; i < dlzka_v; i++) {
            txt = findViewById(vypis_view[i]);
            txt.setText("");
            for (int j = 0; j < vypis[i].length; j++) {
                if (j % 2 == 0) {
                    if (i == 59) { //cerveny krizik v texte
                        txt.append(Html.fromHtml(vypis[i][j]));
                    } else {
                        txt.append(vypis[i][j]);
                    }
                } else {
                    SpannableString s = new SpannableString("\n" + vypis[i][j]);
                    s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                    s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
                    txt.append(s);
                }
            }
        }
        //špeciálny text
        if (bonus != null) {
            bonus.setText("Legyen békesség köztünk mindenkor!");
            SpannableString s = new SpannableString("\nPokoj a bratská láska nech je medzi nami.");
            s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
            s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
            bonus.append(s);
        }
    }

    //nastaví veľkosť písma vo views
    private void nastavSize() {
        for (Integer aview : nadpis_view) {
            txt = findViewById(aview);
            txt.setTextSize(sizeO);
        }
        for (int i = 0; i < dlzka_m; i++) {
            txt = findViewById(meno_view[i]);
            txt.setTextSize(sizeO);
        }
        for (int i = 0; i < dlzka_v; i++) {
            txt = findViewById(vypis_view[i]);
            txt.setTextSize(sizeO);
        }
        if (bonus != null)
            bonus.setTextSize(sizeO);
    }

    //nastaví tučné alebo normálne písmo vo views
    private void nastavPismo() {
        Typeface typeface;
        if (pismo) {
            typeface = typeBold;
        } else {
            typeface = typeNormal;
        }
        for (Integer aview : nadpis_view) {
            txt = findViewById(aview);
            txt.setTypeface(typeface);
        }
        for (int i = 0; i < dlzka_m; i++) {
            txt = findViewById(meno_view[i]);
            txt.setTypeface(typeface);
        }
        for (int i = 0; i < dlzka_v; i++) {
            txt = findViewById(vypis_view[i]);
            txt.setTypeface(typeface);
        }
        if (bonus != null)
            bonus.setTypeface(typeface);
    }

    //nastaví farbu views v závislosti od režimu
    private void nastavFarbu() {
        if (nightMode) {
            drawer.setBackgroundColor(Color.BLACK);
            farba_b = getResources().getColor(R.color.background);
            farba_r = getResources().getColor(R.color.primary_light);
        } else {
            drawer.setBackgroundColor(getResources().getColor(R.color.background));
            farba_b = Color.BLACK;
            farba_r = getResources().getColor(R.color.primary);
        }
        for (Integer aNadpis : nadpis_view) {
            txt = findViewById(aNadpis);
            txt.setTextColor(farba_r);
        }
        for (int i = 0; i < dlzka_m; i++) {
            txt = findViewById(meno_view[i]);
            txt.setTextColor(farba_r);
        }
        for (int i = 0; i < dlzka_v; i++) {
            txt = findViewById(vypis_view[i]);
            txt.setTextColor(farba_b);
        }
        if (bonus != null)
            bonus.setTextColor(farba_b);
    }

    public void openToday(View view) {
        zIntent = true;
        Intent misal = new Intent(getApplicationContext(), Uvod.class);
        startActivity(misal);
    }

    public void openCalendar(View view) {
        Intent kalendar = new Intent(getApplicationContext(), Kalendar.class);
        startActivity(kalendar);
    }

    public void openSpecialMass(View view) {
        optionIntent = new Pair<>("specialMass", "");
        Intent options = new Intent(getApplicationContext(), Options.class);
        startActivity(options);
    }

    public void openBlessing(View view) {
        optionIntent = new Pair<>("bless", "");
        Intent options = new Intent(getApplicationContext(), Options.class);
        startActivity(options);
    }

    public void openLanguages(View view) {
        optionIntent = new Pair<>("language", "");
        Intent options = new Intent(getApplicationContext(), Options.class);
        startActivity(options);
    }
}
