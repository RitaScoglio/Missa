package sk.missa;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AlertDialog;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;

import sk.missa.interfaces.Upravy_misal;

public class Upravy_Misal extends Main implements Upravy_misal {

    TextView uprava, info, uprava1, uprava2, uprava3, uprava4, uprava5;

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
                vyberJazyk(this);
                return true;
            case R.id.menu_font:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberFont(Upravy_Misal.this);
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
                return true;
            case R.id.menu_pismo:
                switch_pismo.setChecked(!switch_pismo.isChecked());
                pismo = switch_pismo.isChecked();
                putPismo();
                return true;
            case R.id.menu_zvoncek:
                switch_zvoncek.setChecked(!switch_zvoncek.isChecked());
                zvoncek = switch_zvoncek.isChecked();
                putZvoncek();
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
        //nastaví písmo v celej aplikácií - pätkové alebo bezpätkové
        getThemeStyle();
        setTheme(themeStyle);
        //nastaví layout
        setContentView(R.layout.activity_upravy_misal);

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
            }
        });
        switch_rezim.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                rezim = isChecked;
                menuRezim();
                putRezim();
                nastavFarbu();
            }
        });
        switch_zvoncek.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                zvoncek = isChecked;
                putZvoncek();
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

        uprava = findViewById(R.id.uprava);
        info = findViewById(R.id.info);
        uprava1 = findViewById(R.id.uprava1);
        uprava2 = findViewById(R.id.uprava2);
        uprava3 = findViewById(R.id.uprava3);
        uprava4 = findViewById(R.id.uprava4);
        uprava5 = findViewById(R.id.uprava5);

        nastavFarbu();
        nastavSize();
    }

    public void upravy(View view){
        switch(view.getId())
                //po kliknutí na nadpis za zobrazí dialógové okno
        {
            case R.id.uprava1:
                vypis(0);
                break;
            case R.id.uprava2:
                vypis(1);
                break;
            case R.id.uprava3:
                vypis(2);
                break;
            case R.id.uprava4:
                vypis(3);
                break;
            case R.id.uprava5:
                vypis(4);
                break;
        }
    }

    //otvorenie dialógového okna
    private void vypis(int uprava) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(Html.fromHtml("<font color='#9C0E0F'><b>" + upravy[uprava] + "</b></font>"))
                    .setMessage(Html.fromHtml(omsa_upravy[uprava]))
                    .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                        }
                    });
            AlertDialog dialog = builder.create();
            dialog.getWindow().setBackgroundDrawableResource(R.color.background);
            dialog.show();
        TextView text = dialog.findViewById(android.R.id.message);
        assert text != null;
        text.setMovementMethod(LinkMovementMethod.getInstance());
        text.setTextSize(sizeO);
        if (rezim) {
            dialog.getWindow().setBackgroundDrawableResource(R.color.black);
            text.setTextColor(getResources().getColor(R.color.background));
        } else {
            dialog.getWindow().setBackgroundDrawableResource(R.color.background);
            text.setTextColor(Color.BLACK);
        }
    }

    //nastaví veľkosť písma
    private void nastavSize() {
        uprava.setTextSize(sizeN);
        info.setTextSize(sizeO);
        uprava1.setTextSize(sizeO);
        uprava2.setTextSize(sizeO);
        uprava3.setTextSize(sizeO);
        uprava4.setTextSize(sizeO);
        uprava5.setTextSize(sizeO);
    }

    //nastaví farbu písma
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
        uprava.setTextColor(farba_r);
        info.setTextColor(farba_r);
        uprava1.setTextColor(farba_b);
        uprava2.setTextColor(farba_b);
        uprava3.setTextColor(farba_b);
        uprava4.setTextColor(farba_b);
        uprava5.setTextColor(farba_b);
    }
}
