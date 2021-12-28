package sk.missa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Kalendar extends Main {
    TextView dateView;
    int position, mm, rr;
    LinearLayout linear_kalendar;
    ListView listView;
    Animation slideInRight;
    Animation slideInLeft;

    /*@Override
    protected void onResume() {
        if(!zIntent)
            setZvuk();
        zIntent = false;
        super.onResume();
    }*/

    @Override
    protected void onPause() {
        super.onPause();
        setAll();
        /*if(!zIntent)
            unsetZvuk();*/
    }

    //zisti či je rovnaký deň ako pri otvorení aplikácie, ak nie, tak otvorí úvodnú stranu
    @Override
    protected void onResume() {
        super.onResume();
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
                vyberJazyk(Kalendar.this);
                return true;
            case R.id.menu_font:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberFont(Kalendar.this);
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
                sviatokMesiac();
                return true;
            case R.id.menu_pismo:
                switch_pismo.setChecked(!switch_pismo.isChecked());
                pismo = switch_pismo.isChecked();
                putPismo();
                sviatokMesiac();
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

    @SuppressLint("ClickableViewAccessibility")
    private void setAll(){

        //nastaví toolbar, fullscreen a režim v menu
        setToolbar();
        setFullscreen();
        menuRezim();

        //animácia posunu doprava/doľava
        slideInRight = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_in_right);
        slideInLeft = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_in_left);

        linear_kalendar = findViewById(R.id.linear_kalendar);
        linear_kalendar.setOnTouchListener(new OnSwipe(this) {
            @Override
            public void onSwipeLeft() {
                nasledujuci();
            }

            @Override
            public void onSwipeRight() {
                predchadzajuci();
            }
        });
        listView = findViewById(R.id.mesiac_sviatky);
        listView.setOnTouchListener(new OnSwipe(this) {
            @Override
            public void onSwipeLeft() {
                nasledujuci();
            }

            @Override
            public void onSwipeRight() {
                predchadzajuci();
            }
        });
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
                sviatokMesiac();
            }
        });
        switch_rezim.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                rezim = isChecked;
                menuRezim();
                putRezim();
                sviatokMesiac();
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
                sviatokMesiac();
            }
        });
        image_zoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOut();
                putVelkost();
                sviatokMesiac();
            }
        });

        //pri nezapamatanom roku, nastaví premenne z pamate
        if (rok == 0)
            getPremenne();
        //uloží aktuálny mesiac
        mm = m;
        rr = rok;
        //vypíše mesiac s rokom
        vypisDatumKalendar(mm, rr);
        //vypíše sviatky v mesiaci
        sviatokMesiac();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //nastaví písmo v celej aplikácií - pätkové alebo bezpätkové
        getThemeStyle();
        setTheme(themeStyle);
        //nastaví layout
        setContentView(R.layout.activity_kalendar);
        setAll();
    }

    private void getPremenne() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        den = settings.getInt("den", 1);
        m = settings.getInt("m", 0);
        rok = settings.getInt("rok", 0);
        sizeO = settings.getInt("sizeO", 16);
        sizeN = settings.getInt("sizeN", 24);
        rezim = settings.getBoolean("rezim", false);
    }

    //uloží premenne pri onPause
    private void setPremenne() {
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("den", den).apply();
        editor.putInt("m", m).apply();
        editor.putInt("rok", rok).apply();
    }

    //posun mesiaca o dozadu
    private void predchadzajuci() {
        if (mm == 0) {
            mm = 11;
            rr--;
            //dolezite pre vypocet tyzdna cezrok - posun (zalezi od krstu krista pana)
            posunObdobieCezrok(rr);
        //} else if(mm == 11){
            //obmedzenie kalendara
        } else {
            mm--;
            linear_kalendar.startAnimation(slideInLeft);
        }
        //pokial bude posuvanie aj medzi rokmi, tak treba spravit rok a r(podobne ako mm a m), aby si vzdy pamatalo aktualny rok
        vypisDatumKalendar(mm, rr);
        sviatokMesiac();
    }

    private void nasledujuci() {
        if (mm == 11) {
            mm = 0;
            rr++;
            //dolezite pre vypocet tyzdna cezrok - posun (zalezi od krstu krista pana)
            posunObdobieCezrok(rr);
        //} else if(mm == 0){
                        //obmedzenie kalendara
        } else {
            linear_kalendar.startAnimation(slideInRight);
            mm++;
        }
        vypisDatumKalendar(mm, rr);
        sviatokMesiac();
    }

    @SuppressLint("SetTextI18n")
    public void vypisDatumKalendar(int m, int rok) {
        dateView = findViewById(R.id.datumKalendar);
        char[] array = mesiac[m].toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        String pom = new String(array);
        dateView.setText(pom + " " + rok);
    }

    public void sviatokMesiac() {
        if (rezim) {
            drawer.setBackgroundColor(Color.BLACK);
            dateView.setTextColor(getResources().getColor(R.color.background));
        } else {
            drawer.setBackgroundColor(getResources().getColor(R.color.background));
            dateView.setTextColor(Color.BLACK);
        }
        dateView.setTextSize(sizeN);

        //dolezite pre vypocet tyzdna cezrok - posun (zalezi od krstu krista pana)
        posunObdobieCezrok(rr);
        
        switch (mm) {
            //ziskajPaVN a ziskajAaV sa rata iba v hranickych mesiacoch, kedze v uvode sa rata v ostatnych
            case 0:
                ziskajAaV(rr-1, rr);
                slavenieMesiac(32, month1);
                break;
            case 1:
                ziskajPaVN(); //zistí dátum popolcovej stredy a veľkej noci
                if (rr % 4 == 0)
                    slavenieMesiac(30, month2);
                else
                    slavenieMesiac(29, month2);
                break;
            case 2:
                ziskajPaVN();
                slavenieMesiac(32, month3);
                break;
            case 3:
                ziskajPaVN();
                slavenieMesiac(31, month4);
                break;
            case 4:
                ziskajPaVN();
                slavenieMesiac(32, month5);
                break;
            case 5:
                ziskajPaVN();
                slavenieMesiac(31, month6);
                break;
            case 6:
                slavenieMesiac(32, month7);
                break;
            case 7:
                slavenieMesiac(32, month8);
                break;
            case 8:
                slavenieMesiac(31, month9);
                break;
            case 9:
                slavenieMesiac(32, month10); //(počet dní v mesiaci+, mesiac obsahujúci sviatky)
                break;
            case 10:
                ziskajAaV(rr, rr+1);
                slavenieMesiac(31, month11);
                break;
            case 11:
                ziskajAaV(rr, rr+1);
                slavenieMesiac(32, month12);
            default:
                break;
        }
    }

    //vypis dna (datum) a následne sviatkov v tom dni
    private void slavenieMesiac(int pocet, String[][] month) {
        position = 0;
        final ArrayList<Calendar> words = new ArrayList<>();

        for (int d = 1; d < pocet; d++) {
            dnes.set(rr, mm, d);
            mD = new DateTime(rr, mm + 1, d, 12, 0, 0);
            dvt = (dnes.get(java.util.Calendar.DAY_OF_WEEK) - 1);
            words.add(new Calendar(d + ". " + dni[dvt].toUpperCase()));
            if (d == den && m == mm)
                position = words.size() - 1;

                //post
            if ((mD.isEqual(mP) || mD.isAfter(mP)) && mD.isBefore(mVN))
                postVypis(words, month, d);
                //velka noc
            else if ((mD.isEqual(mVN) || mD.isAfter(mVN)) && (mD.isEqual(mDS) || mD.isBefore(mDS)))
                velkanocVypis(words, month, d);
                //advent
            else if ((mD.isEqual(mZacA) || mD.isAfter(mZacA)) && mD.isBefore(mNP))
                adventVypis(words, month, d);
                //vianoce
            else if ((mD.isEqual(mNP) || mD.isAfter(mNP)) && (mD.isEqual(mKKP) || mD.isBefore(mKKP)))
                vianoceVypis(words, month, d);
                //cezrok
            else
                cezrokVypis(words, month, d, mm);

            adapter(words);
        }
    }

    //nastavenie premenných po kliknutí na sviatok spolu s triedou, ktorá sa má otvoriť
    private void adapter(final ArrayList<Calendar> words) {
        uvodLayout = false;
        CalendarAdapter adapter = new CalendarAdapter(this, words);
        listView.setAdapter(adapter);
        listView.setSelection(position);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Calendar word = words.get(position);
                if (word.getMenoSvatca() != null) {
                    ID = word.getID();
                    den = word.getDay();
                    tyzden = word.getTyzden();
                    pozicia_eucharistia = 1;
                    m = mm;
                    rok = rr;
                    if (ID.contains("3dni")) {
                        /*LayoutInflater inflater = getLayoutInflater();
                        View layout = inflater.inflate(R.layout.toast_layout,
                                (ViewGroup) findViewById(R.id.toast));
                        TextView txt = layout.findViewById(R.id.text);
                        txt.setText("Pripravuje sa.");
                        Toast toast = new Toast(getApplicationContext());
                        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                        toast.setDuration(Toast.LENGTH_LONG);
                        toast.setView(layout);
                        toast.show();*/
                        Intent misal = new Intent(Kalendar.this, Trojdnie.class);
                        startActivity(misal);
                    } else {
                        menoSvatca = word.getMenoSvatca();
                        slavenie = word.getSlavenie();
                        obdobie = word.getObdobie();
                        pozicia_formular = pozicia_prefacia = 0;
                        preface = false;
                        euchText = "";
                        C = A = V = P = VN = false;
                        zIntent = true;
                        Intent misal = new Intent(Kalendar.this, MisalNormal.class);
                        startActivity(misal);
                    }
                }
            }
        });
    }
}
