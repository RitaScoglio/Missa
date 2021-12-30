package sk.missa;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import sk.missa.interfaces.Citania_advent;
import sk.missa.interfaces.Citania_cezrok;
import sk.missa.interfaces.Citania_post;
import sk.missa.interfaces.Citania_svatci;
import sk.missa.interfaces.Citania_velkanoc;
import sk.missa.interfaces.Eucharistia;
import sk.missa.interfaces.Formular;
import sk.missa.interfaces.Modlitby_obdobia;
import sk.missa.interfaces.Modlitby_svatci;
import sk.missa.interfaces.Prefacia;
import sk.missa.interfaces.Prosby_advent;
import sk.missa.interfaces.Prosby_cezrok;
import sk.missa.interfaces.Prosby_post;
import sk.missa.interfaces.Prosby_svatci;
import sk.missa.interfaces.Prosby_velkanoc;
import sk.missa.interfaces.Spevy_obdobia;
import sk.missa.interfaces.Spevy_svatci;
import sk.missa.interfaces.Texty;
import sk.missa.interfaces.Zalmy_advent;
import sk.missa.interfaces.Zalmy_cezrok;
import sk.missa.interfaces.Zalmy_post;
import sk.missa.interfaces.Zalmy_svatci;
import sk.missa.interfaces.Zalmy_velkanoc;

abstract public class Misal extends Main implements Texty, Formular, Eucharistia, Prefacia,
        Spevy_obdobia, Spevy_svatci, Modlitby_obdobia, Modlitby_svatci,
        Prosby_cezrok, Prosby_advent, Prosby_post, Prosby_velkanoc, Prosby_svatci,
        Citania_cezrok, Citania_advent, Citania_post, Citania_velkanoc, Citania_svatci,
        Zalmy_cezrok, Zalmy_advent, Zalmy_post, Zalmy_velkanoc, Zalmy_svatci {
    public static int indexSpev, indexModlitba, indexProsba, indexCS, indexCM, indexPS, indexPM, indexVNS, indexVNM,
            indexAS, indexAM, indexVS, indexVM, cirkevRok, actualCirkevRok;
    public static boolean feria, nedela, pohyb;
    public static boolean nast_farbu, spevO, modlitbaO, prosbyO, citanie1O, zalmO, alelujaO, evanjeliumO;
    List<String[]> formArray = new ArrayList<>();
    List<String> eucharistiaArray = new ArrayList<>();
    List<String> prefaciaArray = new ArrayList<>();
    int pasie, pasie1_suradnice, pasie2_suradnice;
    int dvt;
    boolean sequence = false;
    boolean vlastnaPrefacia = false;
    int double_click;

    static String nadpis, uvodny_spev, uvodny_vypis, uvodny_suradnice, pozdrav, kajucnost, modlitba_dna, modlitba_dna_vypis,
            gloria, liturgia_slova, prve_citanie, prve_citanie_citat, prve_citanie_vypis, prve_citanie_suradnice,
            zalm, zalm_vypis, zalm_suradnice, druhe_citanie, druhe_citanie_citat, druhe_citanie_vypis, druhe_citanie_suradnice,
            sekvencia, aleluja, aleluja_vypis, aleluja_suradnice, evanjelium, evanjelium_citat, evanjelium_vypis,
            evanjelium_suradnice, kredo, prosby, prosby_nadpis, prosby_uvod, prosby_zvolanie, prosby_vypis, prosby_zaver,
            modlitba_dary, modlitba_dary_vypis, prefacia, prefacia_nadpis, prefacia_vypis,
            prijimanie_spev, prijimanie_vypis, prijimanie_suradnice, modlitba_prijimanie, modlitba_prijimanie_vypis;
    static int slav_pozehnanie, pozicia_listview;
    ListView listView;
    String[][] aleboCitanie1;
    String[][] aleboCitanie2;
    String[][] aleboEvanjelium;
    String[][] aleboZalm;
    String[][] aleboProsby;

    //získa obdobie v roku, slávenie (nedeľa, féria), cirkevný rok, či je sviatok pohyblivý alebo či obsahuje sekvenciu
    public void ziskajObdobie() {
        switch (obdobie) {
            case "c":
                C = true;
                break;
            case "a":
                A = true;
                break;
            case "v":
                V = true;
                break;
            case "p":
                P = true;
                break;
            case "n":
                VN = true;
                break;
            default:
                break;
        }
        nedela = slavenie.equals("");
        if (dvt == 0 && ID.equals("009"))
            nedela = true;
        feria = slavenie.equals("Féria");
        //kántrové dni, prosebné dni, týždeň modlitieb za jednotu kresťanov
        /*if(slavenie.equals(" ") && !ID.equals("003m")) {
            kantry = true;
        }*/
        if (!feria && (VN || V) && slavenie.equals("Oktáva"))
            feria = true;
        pohyb = ID.contains("p");
        if (A || (V && den > 23))
            cirkevRok = actualCirkevRok = (rok + 1) % 3;
        else
            cirkevRok = actualCirkevRok = rok % 3;
        if (menoSvatca.equals("Sedembolestnej Panny Márie, patrónky Slovenska") || (VN && (slavenie.equals("Oktáva") || ID.equals("10") || ID.equals("20"))) ||
                ID.equals("2gkp") || ID.equals("3gkp") || ID.equals("4gkp"))
            sequence = true;
    }

    public void ziskajIndex() {
        //získa index spevov, modlitieb v obdobiach
        if (C) {
            indexCS = indexCezrok(cezrokSpev);
            indexCM = indexCezrok(cezrokModlitby);
        } else if (P) {
            indexPS = indexTyzdenDen(postSpev);
            indexPM = indexTyzdenDen(postModlitby);
        } else if (VN) {
            indexVNS = indexTyzdenDen(velkanocSpev);
            indexVNM = indexTyzdenDen(velkanocModlitby);
        } else if (A) {
            if (den >= 17 && !nedela && m != 10) { //presny den
                indexAS = indexCislo(spev12, den);
                indexAM = indexCislo(modlitba12, den);
            } else {
                indexAS = indexTyzdenDen(adventSpev);
                indexAM = indexTyzdenDen(adventModlitby);
            }
        } else if (V) {
            if (den > 13) {//od narodenia Pana po novy rok
                indexVM = indexCislo(modlitba12, den);
                indexVS = indexCislo(spev12, den);
            } else if (den > 6) {//po Zjaveni Pana
                indexVM = indexCislo(vianoceModlitby, dvt + 10);
                indexVS = indexCislo(vianoceSpev, dvt);
            } else { //od Noveho roku po Zjavenie Pana
                indexVM = indexCislo(vianoceModlitby, dvt);
                indexVS = indexCislo(vianoceSpev, dvt);
            }
        }
        //ziska index spevov, modlitieb a prosieb podľa formuláru
        if (!formArray.get(0)[2].equals("Vlastný formulár")) {
            indexSpev = indexFormular(spevFormular, formArray.get(pozicia_formular));
            indexModlitba = indexFormular(modlitbaFormular, formArray.get(pozicia_formular));
            indexProsba = indexFormular(prosbyFormular, formArray.get(pozicia_formular));
        }
    }

    //uloží nadpis
    public void nadpis() {
        nadpis = (String.valueOf(menoSvatca));
        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView title = toolbar.findViewById(R.id.toolbar_title);
        title.setText(menoSvatca);
        title.setTypeface(typeBold);
    }

    public void spev() {
        uvodny_spev = "Úvodný spev";
        prijimanie_spev = "Spev na prijímanie";
        if (C && (feria || nedela || spevO)) {
            //cezrok
            uvodny_vypis = cezrokSpev[indexCS][1];
            uvodny_suradnice = cezrokSpev[indexCS][2];
            prijimanie_vypis = cezrokSpev[indexCS][3];
            prijimanie_suradnice = cezrokSpev[indexCS][4];
        } else if (P && !(slavenie.equals("Sviatok") || slavenie.equals("Slávnosť") || slavenie.equals("Vigília"))) {
            //post
            uvodny_vypis = postSpev[indexPS][1];
            uvodny_suradnice = postSpev[indexPS][2];
            prijimanie_vypis = postSpev[indexPS][3];
            prijimanie_suradnice = postSpev[indexPS][4];
        } else if (VN && (feria || nedela || spevO)) {
            //velka noc
            uvodny_vypis = velkanocSpev[indexVNS][1];
            uvodny_suradnice = velkanocSpev[indexVNS][2];
            prijimanie_vypis = velkanocSpev[indexVNS][3];
            prijimanie_suradnice = velkanocSpev[indexVNS][4];
        } else if (A && (feria || nedela || spevO)) {
            //advent
            if (den >= 17 && !nedela && m != 10) {
                uvodny_vypis = spev12[indexAS][1];
                uvodny_suradnice = spev12[indexAS][2];
                prijimanie_vypis = spev12[indexAS][3];
                prijimanie_suradnice = spev12[indexAS][4];
            } else {
                uvodny_vypis = adventSpev[indexAS][1];
                uvodny_suradnice = adventSpev[indexAS][2];
                prijimanie_vypis = adventSpev[indexAS][3];
                prijimanie_suradnice = adventSpev[indexAS][4];
            }
        } else if (V && (feria || nedela || spevO)) {
            //vianoce
            if (den > 13) {
                uvodny_vypis = spev12[indexVS][1];
                uvodny_suradnice = spev12[indexVS][2];
                prijimanie_vypis = spev12[indexVS][3];
                prijimanie_suradnice = spev12[indexVS][4];
            } else {
                uvodny_vypis = vianoceSpev[indexVS][1];
                uvodny_suradnice = vianoceSpev[indexVS][2];
                prijimanie_vypis = vianoceSpev[indexVS][3];
                prijimanie_suradnice = vianoceSpev[indexVS][4];
            }
        } else if (pohyb && !ID.equals("1op")) {
            //pohyblive sviatky
            int index = indexID(spevPohyb);
            if (spevPohyb[index][1].equals("A")) {
                if (cirkevRok == 2) {
                    index++;
                }
                if (cirkevRok == 0) {
                    index = index + 2;
                }
            }
            uvodny_vypis = spevPohyb[index][2];
            uvodny_suradnice = spevPohyb[index][3];
            prijimanie_vypis = spevPohyb[index][4];
            prijimanie_suradnice = spevPohyb[index][5];
        } else {
            //spevy podľa mesiacov
            switch (m) {
                case 0:
                    spevVypis(spev1, 1);
                    spevVypis(spev1, 3);
                    break;
                case 1:
                    spevVypis(spev2, 1);
                    spevVypis(spev2, 3);
                    break;
                case 2:
                    spevVypis(spev3, 1);
                    spevVypis(spev3, 3);
                    break;
                case 3:
                    spevVypis(spev4, 1);
                    spevVypis(spev4, 3);
                    break;
                case 4:
                    spevVypis(spev5, 1);
                    spevVypis(spev5, 3);
                    break;
                case 5:
                    spevVypis(spev6, 1);
                    spevVypis(spev6, 3);
                    break;
                case 6:
                    spevVypis(spev7, 1);
                    spevVypis(spev7, 3);
                    break;
                case 7:
                    spevVypis(spev8, 1);
                    spevVypis(spev8, 3);
                    break;
                case 8:
                    spevVypis(spev9, 1);
                    spevVypis(spev9, 3);
                    break;
                case 9:
                    spevVypis(spev10, 1);
                    spevVypis(spev10, 3);
                    break;
                case 10:
                    spevVypis(spev11, 1);
                    spevVypis(spev11, 3);
                    break;
                case 11:
                    if ((A && den >= 17) || (V && den > 28 && !slavenie.equals("Vigília"))) {
                        spevO = true;
                        spev();
                    } else {
                        spevVypis(spev12, 1);
                        spevVypis(spev12, 3);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public void spevVypis(String[][] spev, int i) {
        int index = indexID(spev);
        String vypis;
        String suradnice;
        if (index != -1 && !spev[index][i].equals("")) { //vlastne sviatky svatych
            vypis = spev[index][i];
            suradnice = spev[index][i + 1];
            spevPrint(i, vypis, suradnice);
        } else if (!formArray.get(0)[2].equals("Vlastný formulár")) { //formular
            vypis = spevFormular[indexSpev][i + 2];
            suradnice = spevFormular[indexSpev][i + 3];
            spevPrint(i, vypis, suradnice);
        } else {
            spevO = true;
            spev();
        }
    }

    //ulozí text spevov a súradnice
    private void spevPrint(int i, String vypis, String suradnice) {
        switch (i) {
            case 1:
                uvodny_vypis = vypis;
                uvodny_suradnice = suradnice;
                break;
            case 3:
                prijimanie_vypis = vypis;
                prijimanie_suradnice = suradnice;
                break;
        }
    }

    public void pozdrav() {
        pozdrav = "<font color='#B71C1C'>Formuly úvodného pozdravu celebranta (otvoriť)</font>";
    }

    public void kajucnost() {
        if (menoSvatca.equals("POPOLCOVÁ STREDA"))
            kajucnost = "<font color='#B71C1C'>Úkon kajúcnosti sa vynecháva. Nahrádza ho značenie popolom.</font>";
        else
            kajucnost = "<font color='#B71C1C'>Úkon kajúcnosti (otvoriť)</font>";
    }


    public void modlitba() {
        modlitba_dna = "Modlitba dňa";
        modlitba_dary = "Modlitba nad obetnými darmi";
        modlitba_prijimanie = "Modlitba po prijímaní";
        if (C && (feria || nedela || modlitbaO)) {
            //cezrok
            modlitba_dna_vypis = cezrokModlitby[indexCM][1];
            modlitba_dary_vypis = cezrokModlitby[indexCM][2];
            modlitba_prijimanie_vypis = cezrokModlitby[indexCM][3];
        } else if (P && (feria || nedela || modlitbaO)) {//post
            if (!feria && !nedela) {//ak je sviatok, modlitba dna ide z vlastnej casti na sviatky svatych
                modlitba_dary_vypis = postModlitby[indexPM][2];
                modlitba_prijimanie_vypis = postModlitby[indexPM][3];
            } else {
                modlitba_dna_vypis = postModlitby[indexPM][1];
                modlitba_dary_vypis = postModlitby[indexPM][2];
                modlitba_prijimanie_vypis = postModlitby[indexPM][3];
            }
        } else if (VN && (feria || nedela || modlitbaO)) { //velka noc
            modlitba_dna_vypis = velkanocModlitby[indexVNM][1];
            modlitba_dary_vypis = velkanocModlitby[indexVNM][2];
            modlitba_prijimanie_vypis = velkanocModlitby[indexVNM][3];
        } else if (A && (feria || nedela || modlitbaO)) { //advent
            String[][] text;
            if (den >= 17 && !nedela && m != 10)
                text = modlitba12;
            else
                text = adventModlitby;
            if (!feria && !nedela) {//ak je sviatok, modlitba dna ide z vlastnej casti na sviatky svatych
                modlitba_dary_vypis = text[indexAM][2];
                modlitba_prijimanie_vypis = text[indexAM][3];
            } else {
                modlitba_dna_vypis = text[indexAM][1];
                modlitba_dary_vypis = text[indexAM][2];
                modlitba_prijimanie_vypis = text[indexAM][3];
            }
        } else if (V && (feria || nedela || modlitbaO)) { //vianoce
            if (den > 28) {
                if (slavenie.equals("Sviatok"))
                    modlitba_dna_vypis = modlitba12[indexVM][1];
                modlitba_dary_vypis = modlitba12[indexVM][2];
                modlitba_prijimanie_vypis = modlitba12[indexVM][3];
            } else {
                modlitba_dna_vypis = vianoceModlitby[indexVM][1];
                modlitba_dary_vypis = vianoceModlitby[indexVM][2];
                modlitba_prijimanie_vypis = vianoceModlitby[indexVM][3];
            }
        } else if (pohyb && !ID.equals("1op")) {//pohyblive sviatky
            int index = indexID(modlitbaPohyb);
            if (modlitbaPohyb[index][1].equals("A")) {
                if (cirkevRok == 2) {
                    index++;
                }
                if (cirkevRok == 0) {
                    index = index + 2;
                }
            }
            modlitba_dna_vypis = modlitbaPohyb[index][2];
            modlitba_dary_vypis = modlitbaPohyb[index][3];
            modlitba_prijimanie_vypis = modlitbaPohyb[index][4];
        } else {
            switch (m) {//vlastna cast na sviatky svatych podla mesiacov
                case 0:
                    modlitba_dna_vypis = modlitbaVypis(modlitba1, 1);
                    modlitba_dary_vypis = modlitbaVypis(modlitba1, 2);
                    modlitba_prijimanie_vypis = modlitbaVypis(modlitba1, 3);
                    break;
                case 1:
                    modlitba_dna_vypis = modlitbaVypis(modlitba2, 1);
                    if (P && !(slavenie.equals("Sviatok") || slavenie.equals("Slávnosť") || slavenie.equals("Vigília"))) { //v prípade pôstu sú modlitby nad obetnými darmi a po prijímaní z pôstneho obdobia
                        modlitbaO = true;
                        modlitba();
                    } else {
                        modlitba_dary_vypis = modlitbaVypis(modlitba2, 2);
                        modlitba_prijimanie_vypis = modlitbaVypis(modlitba2, 3);
                    }
                    break;
                case 2:
                    modlitba_dna_vypis = modlitbaVypis(modlitba3, 1);
                    if (P && !(slavenie.equals("Sviatok") || slavenie.equals("Slávnosť") || slavenie.equals("Vigília"))) { //v prípade pôstu sú modlitby nad obetnými darmi a po prijímaní z pôstneho obdobia
                        modlitbaO = true;
                        modlitba();
                    } else {
                        modlitba_dary_vypis = modlitbaVypis(modlitba3, 2);
                        modlitba_prijimanie_vypis = modlitbaVypis(modlitba3, 3);
                    }
                    break;
                case 3:
                    modlitba_dna_vypis = modlitbaVypis(modlitba4, 1);
                    if (P && !(slavenie.equals("Sviatok") || slavenie.equals("Slávnosť") || slavenie.equals("Vigília"))) { //v prípade pôstu sú modlitby nad obetnými darmi a po prijímaní z pôstneho obdobia
                        modlitbaO = true;
                        modlitba();
                    } else {
                        modlitba_dary_vypis = modlitbaVypis(modlitba4, 2);
                        modlitba_prijimanie_vypis = modlitbaVypis(modlitba4, 3);
                    }
                    break;
                case 4:
                    modlitba_dna_vypis = modlitbaVypis(modlitba5, 1);
                    modlitba_dary_vypis = modlitbaVypis(modlitba5, 2);
                    modlitba_prijimanie_vypis = modlitbaVypis(modlitba5, 3);
                    break;
                case 5:
                    modlitba_dna_vypis = modlitbaVypis(modlitba6, 1);
                    modlitba_dary_vypis = modlitbaVypis(modlitba6, 2);
                    modlitba_prijimanie_vypis = modlitbaVypis(modlitba6, 3);
                    break;
                case 6:
                    modlitba_dna_vypis = modlitbaVypis(modlitba7, 1);
                    modlitba_dary_vypis = modlitbaVypis(modlitba7, 2);
                    modlitba_prijimanie_vypis = modlitbaVypis(modlitba7, 3);
                    break;
                case 7:
                    modlitba_dna_vypis = modlitbaVypis(modlitba8, 1);
                    modlitba_dary_vypis = modlitbaVypis(modlitba8, 2);
                    modlitba_prijimanie_vypis = modlitbaVypis(modlitba8, 3);
                    break;
                case 8:
                    modlitba_dna_vypis = modlitbaVypis(modlitba9, 1);
                    modlitba_dary_vypis = modlitbaVypis(modlitba9, 2);
                    modlitba_prijimanie_vypis = modlitbaVypis(modlitba9, 3);
                    break;
                case 9:
                    modlitba_dna_vypis = modlitbaVypis(modlitba10, 1);
                    modlitba_dary_vypis = modlitbaVypis(modlitba10, 2);
                    modlitba_prijimanie_vypis = modlitbaVypis(modlitba10, 3);
                    break;
                case 10:
                    modlitba_dna_vypis = modlitbaVypis(modlitba11, 1);
                    modlitba_dary_vypis = modlitbaVypis(modlitba11, 2);
                    modlitba_prijimanie_vypis = modlitbaVypis(modlitba11, 3);
                    break;
                case 11:
                    modlitba_dna_vypis = modlitbaVypis(modlitba12, 1);
                    if ((A && den >= 17 && m != 10) || (V && den > 28) && !slavenie.equals("Vigília")) { //v prípade adventu a oktavy sú modlitby nad obetnými darmi a po prijímaní z adventného/vianocneho obdobia
                        modlitbaO = true;
                        modlitba();
                    } else {
                        modlitba_dary_vypis = modlitbaVypis(modlitba12, 2);
                        modlitba_prijimanie_vypis = modlitbaVypis(modlitba12, 3);
                    }
                    break;
                default:
                    break;
            }
            if (modlitba_dna_vypis == null || modlitba_dary_vypis == null || modlitba_prijimanie_vypis == null) {
                modlitbaO = true;
                modlitba();
            }
        }
    }

    public String modlitbaVypis(String[][] modlitba, int i) {
        int index = indexID(modlitba);
        if (index != -1 && !modlitba[index][i].equals("")) {//vlastna cast na sviatky svatych
            return modlitba[index][i];
        } else if (!formArray.get(0)[2].equals("Vlastný formulár")) {//formular
            return modlitbaFormular[indexModlitba][i + 2];
        } else {
            return null;
        }
    }

    public void gloria() {
        if ((P && nedela && !slavenie.equals("Slávnosť")) || (A && nedela))
            gloria = "<font color='#B71C1C'>Oslavná pieseň sa vynechá.</font>";
        else if (ID.contains("g") || slavenie.equals("Oktáva") || nedela || (V && den > 24))
            gloria = "<font color='#B71C1C'>Glória (otvoriť)</font>";
        else gloria = null;
    }

    public void prveCitanie() {
        liturgia_slova = "Liturgia slova";
        prve_citanie = "Prvé čítanie";
        int index = 0;
        //nájde index cítania v danom obdobi
        if (C)
            index = indexCezrok(cezrokCitanie1);
        else if (P)
            index = indexTyzdenDen(postCitanie1);
        else if (VN)
            index = indexTyzdenDen(velkanocCitanie1);
        else if (A) {
            if (den >= 17 && !nedela && m != 10)
                index = indexCislo(citanie1_12, den);
            else
                index = indexTyzdenDen(adventCitanie1);
        } else if (V) {
            if (den > 13)
                index = indexCislo(citanie1_12, den);
            else
                index = indexCislo(citanie1_1, den);
        }
        if (pohyb) { //pohyblive sviatky
            index = indexID(citanie1Pohyb);
            if (citanie1Pohyb[index][1].equals("A")) {
                if (cirkevRok == 2) {
                    index++;
                }
                if (cirkevRok == 0) {
                    index = index + 2;
                }
            }
            prve_citanie_suradnice = citanie1Pohyb[index][3];
            prve_citanie_citat = citanie1Pohyb[index][4];
            prve_citanie_vypis = citanie1Pohyb[index][5];
            if (citanie1Pohyb[index].length > 6) {
                aleboCitanie(citanie1Pohyb, index, 1);
            }
        } else if (nedela) { //nedela
            if (cirkevRok == 2) {
                index++;
            }
            if (cirkevRok == 0) {
                index = index + 2;
            }
            if (C) {
                prve_citanie_suradnice = cezrokCitanie1[index][3];
                prve_citanie_citat = cezrokCitanie1[index][4];
                prve_citanie_vypis = cezrokCitanie1[index][5];
                if (cezrokCitanie1[index].length > 6) {
                    aleboCitanie(cezrokCitanie1, index, 1);
                }
            } else if (P) {
                prve_citanie_suradnice = postCitanie1[index][3];
                prve_citanie_citat = postCitanie1[index][4];
                prve_citanie_vypis = postCitanie1[index][5];
                if (postCitanie1[index].length > 6) {
                    aleboCitanie(postCitanie1, index, 1);
                }
            } else if (VN) {
                prve_citanie_suradnice = velkanocCitanie1[index][3];
                prve_citanie_citat = velkanocCitanie1[index][4];
                prve_citanie_vypis = velkanocCitanie1[index][5];
                if (velkanocCitanie1[index].length > 6) {
                    aleboCitanie(velkanocCitanie1, index, 1);
                }
            } else if (A) {
                prve_citanie_suradnice = adventCitanie1[index][3];
                prve_citanie_citat = adventCitanie1[index][4];
                prve_citanie_vypis = adventCitanie1[index][5];
                if (adventCitanie1[index].length > 6 && cirkevRok == 1) {
                    aleboCitanie(adventCitanie1, index, 1);
                }
            } else if (V) {
                prve_citanie_suradnice = citanie1_1[0][3];
                prve_citanie_citat = citanie1_1[0][4];
                prve_citanie_vypis = citanie1_1[0][5];
            }
        } else if (P && !(slavenie.equals("Sviatok") || slavenie.equals("Slávnosť") || slavenie.equals("Vigília"))) {
            prve_citanie_suradnice = postCitanie1[index][3];
            prve_citanie_citat = postCitanie1[index][4];
            prve_citanie_vypis = postCitanie1[index][5];
            if (postCitanie1[index].length > 6) {
                aleboCitanie(postCitanie1, index, 1);
            }
        } else if (A && den >= 17 && m != 10) {
            prve_citanie_suradnice = citanie1_12[index][3];
            prve_citanie_citat = citanie1_12[index][4];
            prve_citanie_vypis = citanie1_12[index][5];
            if (citanie1_12[index].length > 6 && cirkevRok == 2) {
                aleboCitanie(citanie1_12, index, 1);
            }
        } else if (feria || citanie1O) {//feria
            if (C) {
                index = index + 3;
                int cyklus = rok % 2;
                while (!cezrokCitanie1[index][1].equals(Integer.toString(dvt))) {
                    index = index + 2;
                }
                if (cyklus == 0) {
                    index++;
                }
                prve_citanie_suradnice = cezrokCitanie1[index][3];
                prve_citanie_citat = cezrokCitanie1[index][4];
                prve_citanie_vypis = cezrokCitanie1[index][5];
                if (cezrokCitanie1[index].length > 6) {
                    aleboCitanie(cezrokCitanie1, index, 1);
                }
            } else if (VN) {
                prve_citanie_suradnice = velkanocCitanie1[index][3];
                prve_citanie_citat = velkanocCitanie1[index][4];
                prve_citanie_vypis = velkanocCitanie1[index][5];
                if (velkanocCitanie1[index].length > 6) {
                    aleboCitanie(velkanocCitanie1, index, 1);
                }
            } else if (A) {
                prve_citanie_suradnice = adventCitanie1[index][3];
                prve_citanie_citat = adventCitanie1[index][4];
                prve_citanie_vypis = adventCitanie1[index][5];
                if (adventCitanie1[index].length > 6 && cirkevRok == 1) {
                    aleboCitanie(adventCitanie1, index, 1);
                }
            } else if (V) {
                if (den > 13) {
                    prve_citanie_suradnice = citanie1_12[index][3];
                    prve_citanie_citat = citanie1_12[index][4];
                    prve_citanie_vypis = citanie1_12[index][5];
                    if (citanie1_12[index].length > 6 && cirkevRok == 1) {
                        aleboCitanie(citanie1_12, index, 1);
                    }
                } else {
                    prve_citanie_suradnice = citanie1_1[index][3];
                    prve_citanie_citat = citanie1_1[index][4];
                    prve_citanie_vypis = citanie1_1[index][5];
                    if (citanie1_1[index].length > 6 && cirkevRok == 1) {
                        aleboCitanie(citanie1_1, index, 1);
                    }
                }
            }
        } else {
            switch (m) {//citania podla sviatkov
                case 0:
                    prveCitanieVypis(citanie1_1);
                    break;
                case 1:
                    prveCitanieVypis(citanie1_2);
                    break;
                case 2:
                    prveCitanieVypis(citanie1_3);
                    break;
                case 3:
                    prveCitanieVypis(citanie1_4);
                    break;
                case 4:
                    prveCitanieVypis(citanie1_5);
                    break;
                case 5:
                    prveCitanieVypis(citanie1_6);
                    break;
                case 6:
                    prveCitanieVypis(citanie1_7);
                    break;
                case 7:
                    prveCitanieVypis(citanie1_8);
                    break;
                case 8:
                    prveCitanieVypis(citanie1_9);
                    break;
                case 9:
                    prveCitanieVypis(citanie1_10);
                    break;
                case 10:
                    prveCitanieVypis(citanie1_11);
                    break;
                case 11:
                    if (V && den > 28 && !slavenie.equals("Vigília")) {
                        citanie1O = true;
                        prveCitanie();
                    } else {
                        prveCitanieVypis(citanie1_12);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public void prveCitanieVypis(String[][] citanie) {
        int index = indexID(citanie);
        if (ID.contains("v")) {//vyrocie
            prve_citanie_suradnice = vyrocie[0];
            prve_citanie_citat = vyrocie[1];
            prve_citanie_vypis = vyrocie[2];
            aleboCitanie1 = new String[2][3];
            aleboCitanie1[0] = new String[]{vyrocie[0], vyrocie[1], vyrocie[2]};
            aleboCitanie1[1] = new String[]{vyrocie[4], vyrocie[5], vyrocie[6]};
        } else if (index != -1) {//zo sviatkov
            prve_citanie_suradnice = citanie[index][3];
            prve_citanie_citat = citanie[index][4];
            prve_citanie_vypis = citanie[index][5];
        } else {
            citanie1O = true;
            prveCitanie();
        }
        //ak je na výber viac čítaní
        //Premenenie Pana - ak nie je v nedelu, druhe citanie je ako alternativa k prvemu
        if ((index != -1 && citanie[index].length > 6 && !(ID.equals("02g") && m == 1 && dvt == 0)) && !(ID.equals("06gn") && m == 7 && nedela)) {
            aleboCitanie(citanie, index, 1);
        }
    }

    public void zalm() {
        zalm = "Responzóriový žalm";
        int index = 0;
        if (C)
            index = indexCezrok(cezrokZalm);
        else if (P)
            index = indexTyzdenDen(postZalm);
        else if (VN)
            index = indexTyzdenDen(velkanocZalm);
        else if (A) {
            if (den >= 17 && !nedela && m != 10)
                index = indexCislo(zalm12, den);
            else
                index = indexTyzdenDen(adventZalm);
        } else if (V) {
            if (den > 13)
                index = indexCislo(zalm12, den);
            else
                index = indexCislo(zalm1, den);
        }
        if (pohyb) {
            index = indexID(zalmPohyb);
            if (zalmPohyb[index][1].equals("A")) {//pohyblive sviatky
                if (cirkevRok == 2) {
                    index++;
                }
                if (cirkevRok == 0) {
                    index = index + 2;
                }
            }
            zalm_suradnice = zalmPohyb[index][3];
            zalm_vypis = zalmPohyb[index][4];
            if (zalmPohyb[index].length > 5)
                aleboCitanie(zalmPohyb, index, 4);
        } else if (nedela) {//nedela
            if (cirkevRok == 2) {
                index++;
            }
            if (cirkevRok == 0) {
                index = index + 2;
            }
            if (C) {
                zalm_suradnice = cezrokZalm[index][3];
                zalm_vypis = cezrokZalm[index][4];
                if (cezrokZalm[index].length > 5)
                    aleboCitanie(cezrokZalm, index, 4);
            } else if (P) {
                zalm_suradnice = postZalm[index][3];
                zalm_vypis = postZalm[index][4];
                if (postZalm[index].length > 5)
                    aleboCitanie(postZalm, index, 4);
            } else if (VN) {
                zalm_suradnice = velkanocZalm[index][3];
                zalm_vypis = velkanocZalm[index][4];
            } else if (A) {
                zalm_suradnice = adventZalm[index][3];
                zalm_vypis = adventZalm[index][4];
            } else if (V) {
                zalm_suradnice = zalm1[0][3];
                zalm_vypis = zalm1[0][4];
            }
        } else if (P && !(slavenie.equals("Sviatok") || slavenie.equals("Slávnosť") || slavenie.equals("Vigília"))) {
            zalm_suradnice = postZalm[index][3];
            zalm_vypis = postZalm[index][4];
        } else if (A && den >= 17 && m != 10) {
            zalm_suradnice = zalm12[index][3];
            zalm_vypis = zalm12[index][4];
        } else if (feria || zalmO) {//feria
            if (C) {
                index = index + 3;
                int cyklus = rok % 2;
                while (!cezrokZalm[index][1].equals(Integer.toString(dvt))) {
                    index = index + 2;
                }
                if (cyklus == 0) {
                    index++;
                }
                zalm_suradnice = cezrokZalm[index][3];
                zalm_vypis = cezrokZalm[index][4];
            } else if (VN) {
                zalm_suradnice = velkanocZalm[index][3];
                zalm_vypis = velkanocZalm[index][4];
            } else if (A) {
                zalm_suradnice = adventZalm[index][3];
                zalm_vypis = adventZalm[index][4];
            } else if (V) {
                if (den > 13) {
                    zalm_suradnice = zalm12[index][3];
                    zalm_vypis = zalm12[index][4];
                } else {
                    zalm_suradnice = zalm1[index][3];
                    zalm_vypis = zalm1[index][4];
                }
            }
        } else {
            switch (m) {//podla sviatkov
                case 0:
                    zalmVypis(zalm1);
                    break;
                case 1:
                    zalmVypis(zalm2);
                    break;
                case 2:
                    zalmVypis(zalm3);
                    break;
                case 3:
                    zalmVypis(zalm4);
                    break;
                case 4:
                    zalmVypis(zalm5);
                    break;
                case 5:
                    zalmVypis(zalm6);
                    break;
                case 6:
                    zalmVypis(zalm7);
                    break;
                case 7:
                    zalmVypis(zalm8);
                    break;
                case 8:
                    zalmVypis(zalm9);
                    break;
                case 9:
                    zalmVypis(zalm10);
                    break;
                case 10:
                    zalmVypis(zalm11);
                    break;
                case 11:
                    if (V && den > 28 && !slavenie.equals("Vigília")) {
                        zalmO = true;
                        zalm();
                    } else {
                        zalmVypis(zalm12);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public void zalmVypis(String[][] zalm) {
        int index = indexID(zalm);
        if (ID.contains("v")) { //vyrocie
            zalm_suradnice = vyrocie[7];
            zalm_vypis = vyrocie[8];
        } else if (index != -1) { //svatci
            zalm_suradnice = zalm[index][3];
            zalm_vypis = zalm[index][4];
        } else {
            zalmO = true;
            zalm();
        }
    }


    public void druheCitanie() {
        druhe_citanie = null;
        //vynimka z "n" pre Premenenie Pána a Povýšenie sv. Kríža (v nedelu su dve citania v tyzdni sa druhe citanie dava ako alebo moznost k prvemu)
        boolean vynimka_n = (m == 7 && ID.equals("06gn")) || (m == 8 && ID.equals("14gn"));
        //zisti ci je druhe citanie v dany den
        if ((ID.contains("k") || (ID.contains("n") && (nedela || !vynimka_n)) || menoSvatca.equals("POPOLCOVÁ STREDA") ||
                nedela || (ID.equals("02g") && m == 1 && dvt == 0)) && !slavenie.equals("Oktáva")) {
            druhe_citanie = "Druhé čítanie";
            int index = 0;
            if (C)
                index = indexCezrok(cezrokCitanie2);
            else if (P)
                index = indexTyzdenDen(postCitanie2);
            else if (VN)
                index = indexTyzdenDen(velkanocCitanie2);
            else if (A) {
                if (den >= 17 && !nedela && m != 10)
                    index = indexCislo(citanie2_12, den);
                else
                    index = indexTyzdenDen(adventCitanie2);
            }

            if (pohyb) {//pohyblive sviatky
                index = indexID(citanie2Pohyb);
                if (citanie2Pohyb[index][1].equals("A")) {
                    if (cirkevRok == 2) {
                        index++;
                    }
                    if (cirkevRok == 0) {
                        index = index + 2;
                    }
                }
                druhe_citanie_suradnice = citanie2Pohyb[index][3];
                druhe_citanie_citat = citanie2Pohyb[index][4];
                druhe_citanie_vypis = citanie2Pohyb[index][5];
                if (citanie2Pohyb[index].length > 6) {
                    aleboCitanie(citanie2Pohyb, index, 2);
                }
            } else if (nedela) { //nedela
                if (cirkevRok == 2) {
                    index++;
                }
                if (cirkevRok == 0) {
                    index = index + 2;
                }
                if (C) {
                    druhe_citanie_suradnice = cezrokCitanie2[index][3];
                    druhe_citanie_citat = cezrokCitanie2[index][4];
                    druhe_citanie_vypis = cezrokCitanie2[index][5];
                    if (cezrokCitanie2[index].length > 6) {
                        aleboCitanie(cezrokCitanie2, index, 2);
                    }
                } else if (P) {
                    druhe_citanie_suradnice = postCitanie2[index][3];
                    druhe_citanie_citat = postCitanie2[index][4];
                    druhe_citanie_vypis = postCitanie2[index][5];
                    if (postCitanie2[index].length > 6) {
                        aleboCitanie(postCitanie2, index, 2);
                    }
                } else if (VN) {
                    druhe_citanie_suradnice = velkanocCitanie2[index][3];
                    druhe_citanie_citat = velkanocCitanie2[index][4];
                    druhe_citanie_vypis = velkanocCitanie2[index][5];
                    if (velkanocCitanie2[index].length > 6) {
                        aleboCitanie(velkanocCitanie2, index, 2);
                    }
                } else if (A) {
                    druhe_citanie_suradnice = adventCitanie2[index][3];
                    druhe_citanie_citat = adventCitanie2[index][4];
                    druhe_citanie_vypis = adventCitanie2[index][5];
                    if (adventCitanie2[index].length > 6) {
                        aleboCitanie(adventCitanie2, index, 2);
                    }
                } else if (V) {
                    druhe_citanie_suradnice = citanie2_1[0][3];
                    druhe_citanie_citat = citanie2_1[0][4];
                    druhe_citanie_vypis = citanie2_1[0][5];
                }
            } else if (menoSvatca.equals("POPOLCOVÁ STREDA")) {
                druhe_citanie_suradnice = postCitanie2[index][3];
                druhe_citanie_citat = postCitanie2[index][4];
                druhe_citanie_vypis = postCitanie2[index][5];
            } else {
                switch (m) { //sviatky
                    case 0:
                        druheCitanieVypis(citanie2_1);
                        break;
                    case 1:
                        druheCitanieVypis(citanie2_2);
                        break;
                    case 2:
                        druheCitanieVypis(citanie2_3);
                        break;
                    case 3:
                        druheCitanieVypis(citanie2_4);
                        break;
                    case 4:
                        druheCitanieVypis(citanie2_5);
                        break;
                    case 5:
                        druheCitanieVypis(citanie2_6);
                        break;
                    case 6:
                        druheCitanieVypis(citanie2_7);
                        break;
                    case 7:
                        druheCitanieVypis(citanie2_8);
                        break;
                    case 8:
                        druheCitanieVypis(citanie2_9);
                        break;
                    case 9:
                        druheCitanieVypis(citanie2_10);
                        break;
                    case 10:
                        druheCitanieVypis(citanie2_11);
                        break;
                    case 11:
                        druheCitanieVypis(citanie2_12);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public void druheCitanieVypis(String[][] citanie) {
        int index = indexID(citanie);
        druhe_citanie_suradnice = citanie[index][3];
        druhe_citanie_citat = citanie[index][4];
        druhe_citanie_vypis = citanie[index][5];
        //ak sú na výber dve cítania
        if (citanie[index].length > 6) {
            aleboCitanie(citanie, index, 2);
        }
    }

    public void sekvencia() {
        sekvencia = null;
        if (sequence) {
            sekvencia = "<font color='#B71C1C'>Sekvencia (otvoriť)</font>";
        }
    }

    public void aleluja() {
        if (P)
            aleluja = "Verš pred evanjeliom";
        else
            aleluja = "Alelujový verš";
        int index = 0;
        if (C)
            index = indexCezrok(cezrokAleluja);
        else if (P)
            index = indexTyzdenDen(postAleluja);
        else if (VN)
            index = indexTyzdenDen(velkanocAleluja);
        else if (A) {
            if (den >= 17 && !nedela && m != 10)
                index = indexCislo(aleluja12, den);
            else
                index = indexTyzdenDen(adventAleluja);
        } else if (V) {
            if (den > 13)
                index = indexCislo(aleluja12, den);
            else
                index = indexCislo(aleluja1, den);
        }
        if (pohyb) {
            index = indexID(alelujaPohyb);
            if (alelujaPohyb[index][1].equals("A")) {//pohyblive sviatky
                if (cirkevRok == 2) {
                    index++;
                }
                if (cirkevRok == 0) {
                    index = index + 2;
                }
            }
            aleluja_suradnice = alelujaPohyb[index][3];
            aleluja_vypis = alelujaPohyb[index][4];
        } else if (nedela) { //nedela
            if (cirkevRok == 2) {
                index++;
            }
            if (cirkevRok == 0) {
                index = index + 2;
            }
            if (C) {
                aleluja_suradnice = cezrokAleluja[index][3];
                aleluja_vypis = cezrokAleluja[index][4];
            } else if (P) {
                aleluja_suradnice = postAleluja[index][3];
                aleluja_vypis = postAleluja[index][4];
            } else if (VN) {
                aleluja_suradnice = velkanocAleluja[index][3];
                aleluja_vypis = velkanocAleluja[index][4];
            } else if (A) {
                aleluja_suradnice = adventAleluja[index][3];
                aleluja_vypis = adventAleluja[index][4];
            } else if (V) {
                aleluja_suradnice = aleluja1[0][3];
                aleluja_vypis = aleluja1[0][4];
            }
        } else if (P && !(slavenie.equals("Sviatok") || slavenie.equals("Slávnosť") || slavenie.equals("Vigília"))) {
            aleluja_suradnice = postAleluja[index][3];
            aleluja_vypis = postAleluja[index][4];
        } else if (A && den >= 17 && m != 10) {
            aleluja_suradnice = aleluja12[index][3];
            aleluja_vypis = aleluja12[index][4];
        } else if (feria || alelujaO) { //feria
            if (C) {
                index = index + 3;
                while (!cezrokAleluja[index][1].equals(Integer.toString(dvt))) {
                    index++;
                }
                aleluja_suradnice = cezrokAleluja[index][3];
                aleluja_vypis = cezrokAleluja[index][4];
            } else if (VN) {
                aleluja_suradnice = velkanocAleluja[index][3];
                aleluja_vypis = velkanocAleluja[index][4];
            } else if (A) {
                aleluja_suradnice = adventAleluja[index][3];
                aleluja_vypis = adventAleluja[index][4];
            } else if (V) {
                if (den > 13) {
                    aleluja_suradnice = aleluja12[index][3];
                    aleluja_vypis = aleluja12[index][4];
                } else {
                    aleluja_suradnice = aleluja1[index][3];
                    aleluja_vypis = aleluja1[index][4];
                }
            }
        } else {
            switch (m) { //sviatky
                case 0:
                    alelujaVypis(aleluja1);
                    break;
                case 1:
                    alelujaVypis(aleluja2);
                    break;
                case 2:
                    alelujaVypis(aleluja3);
                    break;
                case 3:
                    alelujaVypis(aleluja4);
                    break;
                case 4:
                    alelujaVypis(aleluja5);
                    break;
                case 5:
                    alelujaVypis(aleluja6);
                    break;
                case 6:
                    alelujaVypis(aleluja7);
                    break;
                case 7:
                    alelujaVypis(aleluja8);
                    break;
                case 8:
                    alelujaVypis(aleluja9);
                    break;
                case 9:
                    alelujaVypis(aleluja10);
                    break;
                case 10:
                    alelujaVypis(aleluja11);
                    break;
                case 11:
                    if (V && den > 28 && !slavenie.equals("Vigília")) {
                        alelujaO = true;
                        aleluja();
                    } else {
                        alelujaVypis(aleluja12);
                    }
                    break;
                default:
                    break;
            }
        }
    }


    public void alelujaVypis(String[][] aleluja) {
        int index = indexID(aleluja);
        if (ID.contains("v")) { //vyrocie
            aleluja_suradnice = vyrocie[9];
            aleluja_vypis = vyrocie[10];
        } else if (index != -1) { //svatci
            aleluja_suradnice = aleluja[index][3];
            aleluja_vypis = aleluja[index][4];
        } else {
            alelujaO = true;
            aleluja();
        }
    }


    public void evanjelium() {
        evanjelium = "Evanjelium";
        int index = 0;
        if (C)
            index = indexCezrok(cezrokEvanjelium);
        else if (P)
            index = indexTyzdenDen(postEvanjelium);
        else if (VN)
            index = indexTyzdenDen(velkanocEvanjelium);
        else if (A) {
            if (den >= 17 && !nedela && m != 10)
                index = indexCislo(evanjelium12, den);
            else
                index = indexTyzdenDen(adventEvanjelium);
        } else if (V) {
            if (den > 13)
                index = indexCislo(evanjelium12, den);
            else
                index = indexCislo(evanjelium1, den);
        }
        if (pohyb) {//pohyblive sviatky
            index = indexID(evanjeliumPohyb);
            if (evanjeliumPohyb[index][1].equals("A")) {
                if (cirkevRok == 2) {
                    index++;
                }
                if (cirkevRok == 0) {
                    index = index + 2;
                }
            }
            evanjelium_suradnice = evanjeliumPohyb[index][3];
            evanjelium_citat = evanjeliumPohyb[index][4];
            evanjelium_vypis = evanjeliumPohyb[index][5];
            if (evanjeliumPohyb[index].length > 6) {
                aleboCitanie(evanjeliumPohyb, index, 3);
            }
        } else if (nedela) { //nedela
            if (cirkevRok == 2) {
                index++;
            }
            if (cirkevRok == 0) {
                index = index + 2;
            }
            if (C) {
                evanjelium_suradnice = cezrokEvanjelium[index][3];
                evanjelium_citat = cezrokEvanjelium[index][4];
                evanjelium_vypis = cezrokEvanjelium[index][5];
                if (cezrokEvanjelium[index].length > 6) {
                    aleboCitanie(cezrokEvanjelium, index, 3);
                }
            } else if (P) {
                if (ID.equals("60")) {
                    evanjelium_vypis = "pasie";
                    pasie = index;
                    pasie1_suradnice = 2;
                    pasie2_suradnice = indexAleboPasie(pasie) + 1;
                } else {
                    evanjelium_suradnice = postEvanjelium[index][3];
                    evanjelium_citat = postEvanjelium[index][4];
                    evanjelium_vypis = postEvanjelium[index][5];
                    if (postEvanjelium[index].length > 6) {
                        aleboCitanie(postEvanjelium, index, 3);
                    }
                }
            } else if (VN) {
                evanjelium_suradnice = velkanocEvanjelium[index][3];
                evanjelium_citat = velkanocEvanjelium[index][4];
                evanjelium_vypis = velkanocEvanjelium[index][5];
                if (velkanocEvanjelium[index].length > 6) {
                    aleboCitanie(velkanocEvanjelium, index, 3);
                }
            } else if (A) {
                evanjelium_suradnice = adventEvanjelium[index][3];
                evanjelium_citat = adventEvanjelium[index][4];
                evanjelium_vypis = adventEvanjelium[index][5];
                if (adventEvanjelium[index].length > 6) {
                    aleboCitanie(adventEvanjelium, index, 3);
                }
            } else if (V) {
                evanjelium_suradnice = evanjelium1[0][3];
                evanjelium_citat = evanjelium1[0][4];
                evanjelium_vypis = evanjelium1[0][5];
                if (evanjelium1[0].length > 6) {
                    aleboCitanie(evanjelium1, 0, 3);
                }
            }
        } else if (P && !(slavenie.equals("Sviatok") || slavenie.equals("Slávnosť") || slavenie.equals("Vigília"))) {
            evanjelium_suradnice = postEvanjelium[index][3];
            evanjelium_citat = postEvanjelium[index][4];
            evanjelium_vypis = postEvanjelium[index][5];
            if (postEvanjelium[index].length > 6) {
                aleboCitanie(postEvanjelium, index, 3);
            }
        } else if (A && den >= 17 && m != 10) {
            evanjelium_suradnice = evanjelium12[index][3];
            evanjelium_citat = evanjelium12[index][4];
            evanjelium_vypis = evanjelium12[index][5];
            if (evanjelium12[index].length > 6) {
                aleboCitanie(evanjelium12, index, 3);
            }
        } else if (feria || evanjeliumO) { //feria
            if (C) {
                index = index + 3;
                while (!cezrokEvanjelium[index][1].equals(Integer.toString(dvt))) {
                    index++;
                }
                //vynimka v 18 tyzdni v pondelok a utorok v roku A
                if (tyzden == 18 && cirkevRok == 1 && (dvt == 1 || dvt == 2)) {
                    index++;
                }
                evanjelium_suradnice = cezrokEvanjelium[index][3];
                evanjelium_citat = cezrokEvanjelium[index][4];
                evanjelium_vypis = cezrokEvanjelium[index][5];
                if (cezrokEvanjelium[index].length > 6) {
                    aleboCitanie(cezrokEvanjelium, index, 3);
                }
            } else if (VN) {
                evanjelium_suradnice = velkanocEvanjelium[index][3];
                evanjelium_citat = velkanocEvanjelium[index][4];
                evanjelium_vypis = velkanocEvanjelium[index][5];
                if (velkanocEvanjelium[index].length > 6) {
                    aleboCitanie(velkanocEvanjelium, index, 3);
                }
            } else if (A) {
                evanjelium_suradnice = adventEvanjelium[index][3];
                evanjelium_citat = adventEvanjelium[index][4];
                evanjelium_vypis = adventEvanjelium[index][5];
                if (adventEvanjelium[index].length > 6) {
                    aleboCitanie(adventEvanjelium, index, 3);
                }
            } else if (V) {
                if (den > 13) {
                    evanjelium_suradnice = evanjelium12[index][3];
                    evanjelium_citat = evanjelium12[index][4];
                    evanjelium_vypis = evanjelium12[index][5];
                    if (evanjelium12[index].length > 6) {
                        aleboCitanie(evanjelium12, index, 3);
                    }
                } else {
                    evanjelium_suradnice = evanjelium1[index][3];
                    evanjelium_citat = evanjelium1[index][4];
                    evanjelium_vypis = evanjelium1[index][5];
                    if (evanjelium1[index].length > 6) {
                        aleboCitanie(evanjelium1, index, 3);
                    }
                }
            }
        } else {
            switch (m) {//sviatky
                case 0:
                    evanjeliumVypis(evanjelium1);
                    break;
                case 1:
                    evanjeliumVypis(evanjelium2);
                    break;
                case 2:
                    evanjeliumVypis(evanjelium3);
                    break;
                case 3:
                    evanjeliumVypis(evanjelium4);
                    break;
                case 4:
                    evanjeliumVypis(evanjelium5);
                    break;
                case 5:
                    evanjeliumVypis(evanjelium6);
                    break;
                case 6:
                    evanjeliumVypis(evanjelium7);
                    break;
                case 7:
                    evanjeliumVypis(evanjelium8);
                    break;
                case 8:
                    evanjeliumVypis(evanjelium9);
                    break;
                case 9:
                    evanjeliumVypis(evanjelium10);
                    break;
                case 10:
                    evanjeliumVypis(evanjelium11);
                    break;
                case 11:
                    if (V && den > 28 && !slavenie.equals("Vigília")) {
                        evanjeliumO = true;
                        evanjelium();
                    } else {
                        evanjeliumVypis(evanjelium12);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public void evanjeliumVypis(String[][] evanjelium) {
        int index = indexID(evanjelium);
        if (ID.contains("v")) { //vyrocie
            evanjelium_suradnice = vyrocie[11];
            evanjelium_citat = vyrocie[12];
            evanjelium_vypis = vyrocie[13];
        } else if (index != -1) {//svatci
            if (menoSvatca.equals("Premenenie Pána")) {
                if (cirkevRok == 2) {
                    index++;
                }
                if (cirkevRok == 0) {
                    index = index + 2;
                }
                evanjelium_suradnice = evanjelium[index][3];
                evanjelium_citat = evanjelium[index][4];
                evanjelium_vypis = evanjelium[index][5];
            } else {
                evanjelium_suradnice = evanjelium[index][3];
                evanjelium_citat = evanjelium[index][4];
                evanjelium_vypis = evanjelium[index][5];
            }
        } else {
            evanjeliumO = true;
            evanjelium();
        }
        //ak je na vyber viac citani
        if (index != -1 && evanjelium[index].length > 6) {
            aleboCitanie(evanjelium, index, 3);
        }
    }

    public void kredo() {
        kredo = null;
        if (ID.equals("26g") && m == 11) //Sv. Štefana
            kredo = "<font color='#B71C1C'>Pri slávnostných omšiach môže byť aj Krédo (otvoriť)</font>";
            //else if (ID.equals("10gkp") && dvt != 0)
        else if (menoSvatca.equals("POPOLCOVÁ STREDA"))
            kredo = "<font color='#B71C1C'>Požehnanie popola a značenie popolom</font>";
        else if (ID.contains("k") || nedela
                || (VN && ID.equals("11")) //Veľkonočný pondelok
                || (ID.equals("02g") && m == 1 && dvt == 0)) //Obetovanie Pána v nedeľu
        {
            kredo = "<font color='#B71C1C'>Krédo (otvoriť)</font>";
        }
    }

    public void prosby() {
        prosby = "Spoločné modlitby veriacich";
        int index = 0;
        if (C)
            index = indexCezrok(cezrokProsby);
        else if (P)
            index = indexTyzdenDen(postProsby);
        else if (VN)
            index = indexTyzdenDen(velkanocProsby);
        else if (A) {
            if (den >= 17 && !nedela && m != 10)
                index = indexCislo(prosby12, den);
            else
                index = indexTyzdenDen(adventProsby);
        } else if (V) {
            if (nedela) //druha nedela po Narodeni Pana
                index = 0;
            else if (den > 13)
                index = indexCislo(prosby12, den);
            else
                index = indexCislo(prosby1, den);
        }
        if (pohyb && !ID.equals("1op")) {//pohyblive sviatky
            index = indexID(prosbyPohyb);
            if (prosbyPohyb[index][1].equals("A")) {
                if (cirkevRok == 2) {
                    index++;
                }
                if (cirkevRok == 0) {
                    index = index + 2;
                }
            }
            prosby_uvod = prosbyPohyb[index][2];
            prosby_zvolanie = prosbyPohyb[index][3];
            prosby_vypis = prosbyPohyb[index][4];
            prosby_zaver = prosbyPohyb[index][5];
        } else if (nedela) {//nedela
            if (cirkevRok == 2) {
                index++;
            }
            if (cirkevRok == 0) {
                index = index + 2;
            }
            if (C) {
                prosby_uvod = cezrokProsby[index][2];
                prosby_zvolanie = cezrokProsby[index][3];
                prosby_vypis = cezrokProsby[index][4];
                prosby_zaver = cezrokProsby[index][5];
                if (cezrokProsby[index].length > 6) {
                    aleboProsby = new String[(cezrokProsby[index].length) / 5][5];
                    aleboProsby[0] = new String[]{"Prosby v roku " + cezrokProsby[index][1], prosby_uvod, prosby_zvolanie, prosby_vypis, prosby_zaver};
                    aleboProsby[1] = new String[]{"Prosby na nedeľu Božieho slova", cezrokProsby[index][7], cezrokProsby[index][8], cezrokProsby[index][9], cezrokProsby[index][10]};
                }
            } else if (P) {
                prosby_uvod = postProsby[index][2];
                prosby_zvolanie = postProsby[index][3];
                prosby_vypis = postProsby[index][4];
                prosby_zaver = postProsby[index][5];
            } else if (VN) {
                prosby_uvod = velkanocProsby[index][2];
                prosby_zvolanie = velkanocProsby[index][3];
                prosby_vypis = velkanocProsby[index][4];
                prosby_zaver = velkanocProsby[index][5];
            } else if (A) {
                prosby_uvod = adventProsby[index][2];
                prosby_zvolanie = adventProsby[index][3];
                prosby_vypis = adventProsby[index][4];
                prosby_zaver = adventProsby[index][5];
            } else if (V) {
                if (menoSvatca.equals("Zjavenie Pána"))
                    prosbyVypis(prosby1);
                else {
                    prosby_uvod = prosby1[index][1];
                    prosby_zvolanie = prosby1[index][2];
                    prosby_vypis = prosby1[index][3];
                    prosby_zaver = prosby1[index][4];
                }
            }
        } else if (P && !(slavenie.equals("Sviatok") || slavenie.equals("Slávnosť") || slavenie.equals("Vigília"))) {
            prosby_uvod = postProsby[index][2];
            prosby_zvolanie = postProsby[index][3];
            prosby_vypis = postProsby[index][4];
            prosby_zaver = postProsby[index][5];
        } else if (A && den >= 17 && m != 10) {
            prosby_uvod = prosby12[index][1];
            prosby_zvolanie = prosby12[index][2];
            prosby_vypis = prosby12[index][3];
            prosby_zaver = prosby12[index][4];
        } else if (feria || prosbyO) {//feria
            if (C) {
                index = index + 3;
                while (!cezrokProsby[index][1].equals(Integer.toString(dvt))) {
                    index++;
                }
                prosby_uvod = cezrokProsby[index][2];
                prosby_zvolanie = cezrokProsby[index][3];
                prosby_vypis = cezrokProsby[index][4];
                prosby_zaver = cezrokProsby[index][5];
            } else if (VN) {
                prosby_uvod = velkanocProsby[index][2];
                prosby_zvolanie = velkanocProsby[index][3];
                prosby_vypis = velkanocProsby[index][4];
                prosby_zaver = velkanocProsby[index][5];
            } else if (A) {
                prosby_uvod = adventProsby[index][2];
                prosby_zvolanie = adventProsby[index][3];
                prosby_vypis = adventProsby[index][4];
                prosby_zaver = adventProsby[index][5];
            } else if (V) {
                if (den > 13) {
                    prosby_uvod = prosby12[index][1];
                    prosby_zvolanie = prosby12[index][2];
                    prosby_vypis = prosby12[index][3];
                    prosby_zaver = prosby12[index][4];
                } else {
                    prosby_uvod = prosby1[index][1];
                    prosby_zvolanie = prosby1[index][2];
                    prosby_vypis = prosby1[index][3];
                    prosby_zaver = prosby1[index][4];
                }
            }
        } else {
            switch (m) {//sviatky
                case 0:
                    prosbyVypis(prosby1);
                    break;
                case 1:
                    prosbyVypis(prosby2);
                    break;
                case 2:
                    prosbyVypis(prosby3);
                    break;
                case 3:
                    prosbyVypis(prosby4);
                    break;
                case 4:
                    prosbyVypis(prosby5);
                    break;
                case 5:
                    prosbyVypis(prosby6);
                    break;
                case 6:
                    prosbyVypis(prosby7);
                    break;
                case 7:
                    prosbyVypis(prosby8);
                    break;
                case 8:
                    prosbyVypis(prosby9);
                    break;
                case 9:
                    prosbyVypis(prosby10);
                    break;
                case 10:
                    prosbyVypis(prosby11);
                    break;
                case 11:
                    if (V && den > 28 && !slavenie.equals("Vigília")) {
                        prosbyO = true;
                        prosby();
                    } else {
                        prosbyVypis(prosby12);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public void prosbyVypis(String[][] prosby) {
        int index = indexID(prosby);
        if (ID.equals("003m") && den < 7 && !A) {
            index = indexFormular(prosbyFormular, new String[]{"11", "3", "Omša k preblahoslavenej Panne Marií 3."});
            prosby_uvod = prosbyFormular[index][3];
            prosby_zvolanie = prosbyFormular[index][4];
            prosby_vypis = prosbyFormular[index][5];
            prosby_zaver = prosbyFormular[index][6];
        } else if (ID.equals("001")) {
            prosby_nadpis = prosbyPrvyPiatok[0][2];
            prosby_uvod = prosbyPrvyPiatok[0][3];
            prosby_zvolanie = prosbyPrvyPiatok[0][4];
            prosby_vypis = prosbyPrvyPiatok[0][5];
            prosby_zaver = prosbyPrvyPiatok[0][6];
            aleboCitanie(prosbyPrvyPiatok, 0, 5);
        } else if (index != -1) {//svatci
            if (menoSvatca.equals("Zjavenie Pána")) {
                if (cirkevRok == 2) {
                    index++;
                }
                if (cirkevRok == 0) {
                    index = index + 2;
                }
                prosby_uvod = prosby[index][1];
                prosby_zvolanie = prosby[index][2];
                prosby_vypis = prosby[index][3];
                prosby_zaver = prosby[index][4];
            } else {
                prosby_uvod = prosby[index][1];
                prosby_zvolanie = prosby[index][2];
                prosby_vypis = prosby[index][3];
                prosby_zaver = prosby[index][4];
            }
        } else if (!formArray.get(0)[2].equals("Vlastný formulár") && !prosbyFormular[indexProsba][3].equals("")) {//formular
            prosby_uvod = prosbyFormular[indexProsba][3];
            prosby_zvolanie = prosbyFormular[indexProsba][4];
            prosby_vypis = prosbyFormular[indexProsba][5];
            prosby_zaver = prosbyFormular[indexProsba][6];
            if (prosbyFormular[indexProsba].length > 7)
                aleboCitanie(prosbyFormular, indexProsba, 5);
        } else {
            prosbyO = true;
            prosby();
        }
    }

    public void prefacia() {
        prefacia = "Prefácia";
        int index;
        if (!preface) {  //nájde predvolenú prefáciu
            index = indexOmsa(prefacie, prefaciaArray.get(0));
            prefacia_nadpis = prefacie[index][2];
            prefacia_vypis = prefacie[index][3];
        } else {//nájde vybratú prefáciu
            index = indexOmsa(prefacie, prefText);
            prefacia_nadpis = prefacie[index][2];
            prefacia_vypis = prefacie[index][3];
        }
    }

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
            case "4. eucharistická modlitba":
                modlitbaEucharistiaVypis(eucharistia4, missas);
                break;
            case "1. eucharistická modlitba v omšiach za zmierenie":
                modlitbaEucharistiaVypis(eucharistiaZmierenie1, missas);
                break;
            case "2. eucharistická modlitba v omšiach za zmierenie":
                modlitbaEucharistiaVypis(eucharistiaZmierenie2, missas);
                break;
        }
    }

    //vypis eucharistickej modlitby
    public void modlitbaEucharistiaVypis(String[] eucharistia, ArrayList<Missa> missas) {
        missas.add(new Missa("Eucharistická modlitba".toUpperCase(), null, null, false));
        for (int j = 0; j < eucharistia.length; j = j + 2) {
            if (eucharistia[j + 1].contains("VSUVKA1")) {//vsuvky v EM na výnimočné sviatky
                if (V && den >= 24) {
                    //Na Narodenie Pána a cez oktávu
                    missas.add(new Missa(null, eucharistia[j], vsuvkaEM[0][1]+eucharistia[j+3], true));
                    //Na Zjavenie Pána
                } else if (V && ID.equals("06gk")) {
                    missas.add(new Missa(null, eucharistia[j], vsuvkaEM[1][1]+eucharistia[j+3], true));
                } else if (VN && (slavenie.equals("Oktáva") || ID.equals("10") || ID.equals("20"))) {
                    missas.add(new Missa(null, eucharistia[j], vsuvkaEM[2][1]+eucharistia[j+3], true));
                } else if (ID.equals("6gkp")) {
                    missas.add(new Missa(null, eucharistia[j], vsuvkaEM[3][1]+eucharistia[j+3], true));
                } else if (ID.equals("2gkp") || ID.equals("3gkp")) {
                    missas.add(new Missa(null, eucharistia[j], vsuvkaEM[4][1]+eucharistia[j+3], true));
                } else {
                    missas.add(new Missa(null, eucharistia[j], eucharistia[j + 1].replace("VSUVKA1", "")+eucharistia[j+3], true));
                }
                j+=2;
            } else if (eucharistia[j + 1].contains("VEZMITE")) {
                missas.add(new Missa(eucharistia[j], null, true));
                missas.add(new Missa(null, eucharistia[j + 1], null, false));
                missas.add(new Missa(true));
            } else if (eucharistia[j + 1].contains("VSUVKA2")) {//vsuvky na výnimočné sviatky
                if (VN && (slavenie.equals("Oktáva") || ID.equals("10") || ID.equals("20"))) {
                    missas.add(new Missa(eucharistia[j], vsuvkaEM[2][2], true));
                } else {
                    missas.add(new Missa(eucharistia[j], eucharistia[j + 1].replace("VSUVKA2", ""), true));
                }
            } else if (eucharistia[j].contains("Spomienka")) {
                missas.add(new Missa(null, eucharistia[j], eucharistia[j + 1], true));
            } else if (eucharistia[j].equals("BAR")) {
                missas.add(new Missa(5));
            } else {
                missas.add(new Missa(eucharistia[j], eucharistia[j + 1], true));
            }
        }
    }

    //vypis obradu prijimania
    public void obradPrijimania(ArrayList<Missa> missas) {
        missas.add(new Missa("Obrad prijímania".toUpperCase(), modlitba_pana_text[0], "", false));
        obradPrijimaniaVypis(modlitba_pana_text, missas, true);
        missas.add(new Missa(null, "\n" + obrad_pokoja_text[0], "", false));
        obradPrijimaniaVypis(obrad_pokoja_text, missas, false);
        missas.add(new Missa(null, "\n" + lamanie_chleba_text[0], "", false));
        obradPrijimaniaVypis(lamanie_chleba_text, missas, false);
    }

    public void obradPrijimaniaVypis(String[] obrad, ArrayList<Missa> missas, boolean nahrad) {
        for (int i = 1; i < obrad.length; i = i + 2) {
            if (i == 5 && nahrad) {
                String s = null;
                //výzvy na modlitbu "Otče náš" podľa obdobia
                if (A) {
                    s = "Boh nás tak miloval, že nám poslal svojho jednorodeného Syna za Spasiteľa; preto sa osmeľujeme povedať:";
                    i = i + 2;
                } else if (V) {
                    s = "Boh sa stal človekom, aby sme sa my mohli stať Božími deťmi; preto sa s vďačným srdcom modlime:";
                    i = i + 2;
                } else if (P) {
                    s = "Ak chceme volať Boha naším Otcom, musíme si navzájom odpustiť; buďme ako jedna rodina a spoločne sa modlime:";
                    i = i + 2;
                } else if (VN) {
                    s = "Voláme sa Božími deťmi a nimi aj sme; preto sa modlime s veľkou dôverou:";
                    i = i + 2;
                } else
                    s = obrad[6];
                missas.add(new Missa(obrad[5], s, false));
            } else if (obrad[i].equals("BAR")) {
                missas.add(new Missa(5));
            } else {
                missas.add(new Missa(obrad[i], obrad[i + 1], false));
            }
        }
    }

    public void pozehnanie(ArrayList<Missa> missas) {
        if (m == 1 && den == 3) {
            missas.add(new Missa("POŽEHNANIE HRDLA", null, null, false));
            for (int i = 0; i < pozehnanie_Blazej.length; i = i + 2) {
                missas.add(new Missa(pozehnanie_Blazej[i], pozehnanie_Blazej[i + 1], true));
            }
        } else if (ID.equals("4gkp")) {
            missas.add(new Missa("<font color='#B71C1C'>Eucharistická procesia (otvoriť)</font>", true, 6));
        } else {
            if (P)
                missas.add(new Missa("<font color='#B71C1C'>Modlitba nad ľudom (otvoriť)</font>", true, 7));
            else
                missas.add(new Missa("<font color='#B71C1C'>Modlitby nad ľudom (otvoriť)</font>", true, 7));
        }
    }

    //uloženie iných možností pre čítania
    public void aleboCitanie(String[][] citanie, int index, int pomCitanie) {
        int a = 1;
        int i = 6;
        switch (pomCitanie) {
            case 1:
                aleboCitanie1 = new String[citanie[index].length / 4][3];
                aleboCitanie1[0] = new String[]{prve_citanie_suradnice, prve_citanie_citat, prve_citanie_vypis};
                for (; i < citanie[index].length; i = i + 4, a++) {
                    aleboCitanie1[a] = new String[]{citanie[index][i + 1], citanie[index][i + 2], citanie[index][i + 3]};
                }
                break;
            case 2:
                aleboCitanie2 = new String[citanie[index].length / 4][3];
                aleboCitanie2[0] = new String[]{druhe_citanie_suradnice, druhe_citanie_citat, druhe_citanie_vypis};
                for (; i < citanie[index].length; i = i + 4, a++) {
                    aleboCitanie2[a] = new String[]{citanie[index][i + 1], citanie[index][i + 2], citanie[index][i + 3]};
                }
                break;
            case 3:
                aleboEvanjelium = new String[citanie[index].length / 4][3];
                aleboEvanjelium[0] = new String[]{evanjelium_suradnice, evanjelium_citat, evanjelium_vypis};
                for (; i < citanie[index].length; i = i + 4, a++) {
                    aleboEvanjelium[a] = new String[]{citanie[index][i + 1], citanie[index][i + 2], citanie[index][i + 3]};
                }
                break;
            case 4:
                aleboZalm = new String[(citanie[index].length - 2) / 3][2];
                aleboZalm[0] = new String[]{zalm_suradnice, zalm_vypis};
                for (; i < citanie[index].length; i = i + 3, a++) {
                    aleboZalm[a] = new String[]{citanie[index][i], citanie[index][i + 1]};
                }
                break;
            case 5:
                aleboProsby = new String[(citanie[index].length) / 6][5];
                aleboProsby[0] = new String[]{citanie[index][2], prosby_uvod, prosby_zvolanie, prosby_vypis, prosby_zaver};
                for (; i < citanie[index].length - 1; i = i + 6, a++) {
                    aleboProsby[a] = new String[]{citanie[index][i + 2], citanie[index][i + 3], citanie[index][i + 4], citanie[index][i + 5], citanie[index][i + 6]};
                }
                break;
        }
    }

    //používa sa iba pri hľadaní prefácie podľa jej názvu
    public int indexOmsa(String[][] omse, String txt) {
        for (int a = 0; a < omse.length; a++) {
            if (omse[a][1].equals(txt)) {
                return a;
            }
        }
        return -1;
    }

    //nájde index formuláru
    public int indexFormular(String[][] form, String[] num) {
        for (int a = 0; a < form.length; a++) {
            if (form[a][0].equals(num[0]) && form[a][1].equals(num[1])) {
                return a;
            }
        }
        return -1;
    }

    //nájde index podľa týždňa v období cezrok
    public int indexCezrok(String[][] cezrok) {
        for (int a = 0; a < cezrok.length; a++) {
            if (cezrok[a][0].equals(Integer.toString(tyzden)))
                return a;
        }
        return -1;
    }

    //nájde index podľa týždňa a dňa
    public int indexTyzdenDen(String[][] pole) {
        for (int a = 0; a < pole.length; a++) {
            if (pole[a][0].equals(Integer.toString(tyzden) + Integer.toString(dvt)))
                return a;
        }
        return -1;
    }

    //hľadá index podľa ID svätcov
    public int indexID(String[][] vynimka) {
        for (int a = 0; a < vynimka.length; a++) {
            if (vynimka[a][0].equals(ID))
                return a;
        }
        return -1;
    }

    //hľadá index podľa presneho cisla
    public int indexCislo(String[][] vynimka, int cislo) {
        for (int a = 0; a < vynimka.length; a++) {
            if (vynimka[a][0].equals(String.valueOf(cislo)))
                return a;
        }
        return -1;
    }

    public int indexAleboPasie(int pasie) {
        for (int a = 4; a < postEvanjelium[pasie].length; a++) {
            if (postEvanjelium[pasie][a].equals("Alebo kratšie:"))
                return a;
        }
        return -1;
    }

    CharSequence[] formArraytoCharSequence() {
        CharSequence[] toReturn = new CharSequence[formArray.size()];
        for (int i = 0; i < formArray.size(); i++) {
            toReturn[i] = formArray.get(i)[2];
        }
        return toReturn;
    }

    //výber, nastavenie a výpis spevov, modlitieb a prosieb podľa vybratého formulára
    public void formular(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(Html.fromHtml("<font color='#80242B'><b>Formulár</b></font>"));
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
                    ziskajIndex();
                    ziskajPrefaciu();
                    spevO = modlitbaO = prosbyO = false;
                    spev();
                    modlitba();
                    prosby();
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
                    euchText = lw.getAdapter().getItem(lw.getCheckedItemPosition()).toString();
                    //obdobie = true;
                    ziskajEucharistiu();
                    ziskajPrefaciu();
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

    //výber, nastavenie a výpis prefácie podľa výberu
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
                int predtym = pozicia_prefacia;
                ListView lw = ((AlertDialog) dialogInterface).getListView();
                pozicia_prefacia = lw.getCheckedItemPosition();
                if (predtym != pozicia_prefacia) {
                    prefText = lw.getAdapter().getItem(lw.getCheckedItemPosition()).toString();
                    preface = true;
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

    //nastaví formulár v ktorom hľadať daný sviatok
    public void ziskajFormular() {
        switch (m) {
            case 0:
                formularVypis(formular1);
                break;
            case 1:
                formularVypis(formular2);
                break;
            case 2:
                formularVypis(formular3);
                break;
            case 3:
                formularVypis(formular4);
                break;
            case 4:
                formularVypis(formular5);
                break;
            case 5:
                formularVypis(formular6);
                break;
            case 6:
                formularVypis(formular7);
                break;
            case 7:
                formularVypis(formular8);
                break;
            case 8:
                formularVypis(formular9);
                break;
            case 9:
                formularVypis(formular10);
                break;
            case 10:
                formularVypis(formular11);
                break;
            case 11:
                formularVypis(formular12);
                break;
            default:
                break;
        }
    }

    //vypíše možnosti formulára
    public void formularVypis(String[][] formular) {
        String omsa;
        int index = indexID(formular);
        if (index == -1 || feria || nedela) {
            if (ID.equals("003m")) {
                if (den < 8) {
                    formArray.add(new String[]{"11", "1", "Nepoškvrneného Srdca Panny Márie"});
                } else {
                    formArray.add(new String[]{"11", "1", "Omša k preblahoslavenej Panne Marií 1."});
                    formArray.add(new String[]{"11", "2", "Omša k preblahoslavenej Panne Marií 2."});
                    formArray.add(new String[]{"11", "3", "Omša k preblahoslavenej Panne Marií 3."});
                    formArray.add(new String[]{"11", "4", "Omša k preblahoslavenej Panne Marií 4."});
                    formArray.add(new String[]{"11", "5", "Omša k preblahoslavenej Panne Marií 5."});
                    formArray.add(new String[]{"11", "6", "Omša k preblahoslavenej Panne Marií 6."});
                    formArray.add(new String[]{"11", "7", "Omša k preblahoslavenej Panne Marií 7."});
                    formArray.add(new String[]{"11", "8", "Omša k preblahoslavenej Panne Marií 8."});
                }
            } else if (ID.equals("001")) {
                formArray.add(new String[]{"02", "1", "Najsvätejšieho Srdca Ježišovho"});
                formArray.add(new String[]{"03", "1", "Votívna omša o Najsvätejšom Srdci Ježišovom"});
            } else
                formArray.add(new String[]{"0", "0", "Vlastný formulár"});
        } else {
            for (int a = 1; a < formular[index].length; a++) {
                omsa = formular[index][a];
                if (A && den >= 17 && m != 10) {
                    formArray.add(new String[]{"0", "0", "Vlastný formulár"});
                    break;
                }
                if (P && nedela) {
                    formArray.add(new String[]{"0", "0", "Vlastný formulár"});
                    break;
                }
                if (VN) {
                    switch (omsa) {
                        case "22":
                            omsa = "24";
                            break;
                        case "11":
                            omsa = "14";
                            break;
                        case "21":
                            omsa = "23";
                            break;
                    }
                } for (int b = 0; b < spevFormular.length; b++) {
                    if (spevFormular[b][0].equals(omsa)) {
                        formArray.add(new String[]{spevFormular[b][0], spevFormular[b][1], spevFormular[b][2]});
                    }
                }
            }
        }
    }

    //vypíše možnosti prefácie
    public void ziskajPrefaciu() {
        prefaciaArray.clear();
        if (euchText.equals("4. eucharistická modlitba")) {
                prefaciaArray.add("Vlastná prefácia - 4. eucharistická modlitba");
        } else if (ID.equals("001")) {
            prefaciaArray.add("Vlastná prefácia - Najsvätejšieho Srdca Ježišovho");
        } else if (ID.equals("004") && formArray.get(pozicia_formular)[1].equals("1")) { //Jarné kántrové dni
            prefaciaArray.add("Nedeľná V");
        } else if (ID.equals("005") && formArray.get(pozicia_formular)[0].equals("72a")) { //Letné kántrové dni
            prefaciaArray.add("Vlastná prefácia - Za jednotu kresťanov");
        } else if (ID.equals("006") && (formArray.get(pozicia_formular)[1].equals("1")
                || formArray.get(pozicia_formular)[1].equals("2"))) { //Jesenné kántrové dni
            prefaciaArray.add("Spoločná IV");
        } else if (ID.equals("006") && formArray.get(pozicia_formular)[1].equals("3")) { //Jesenné kántrové dni
            prefaciaArray.add("Nedeľná V");
        } else if (ID.equals("008")) { //Prosebné dni
            prefaciaArray.add("Nedeľná V");
        } else if (ID.equals("009")) { //Za jednotu kresťanov
            prefaciaArray.add("Vlastná prefácia - Za jednotu kresťanov");
        } else if (pohyb) {
            int index = indexID(prefaciaPohyb);
            String p;
            if (ID.equals("1op")) {
                switch (formArray.get(pozicia_formular)[2]) {
                    case "Votívna omša 1.":
                        prefaciaArray.add("O Duchu Svätom I");
                        break;
                    case "Votívna omša 2.":
                        prefaciaArray.add("O Duchu Svätom II");
                        break;
                    case "Votívna omša 3.":
                        prefaciaArray.add("O Duchu Svätom I");
                        prefaciaArray.add("O Duchu Svätom II");
                        break;
                    default:
                        prefaciaArray.add("Vlastná prefácia - Zoslanie Ducha Svätého");
                        break;
                }
                vlastnaPrefacia = true;
            } else {
                for (int a = 1; a < prefaciaPohyb[index].length; a++) {
                    p = prefaciaPohyb[index][a];
                    if (Integer.parseInt(p) > 20) //ak je cislo prefacie vacsie ako 20, tak je to vlastna prefacia
                        vlastnaPrefacia = true;
                    for (int b = 0; b < prefacie.length; b++) {
                        if (prefacie[b][0].equals(p))
                            prefaciaArray.add(prefacie[b][1]);
                    }
                }
            }
        } else if (nedela) {
            if (C) {
                for (int b = 0; b < 8; b++) {
                    prefaciaArray.add(prefacie[b][1]);
                }
            } else if (P) {
                switch (ID) {
                    case "10":
                        prefaciaArray.add(prefacie[23][1]);
                        break;
                    case "20":
                        prefaciaArray.add(prefacie[24][1]);
                        break;
                    case "30":
                        if (cirkevRok == 1)
                            prefaciaArray.add(prefacie[25][1]);
                        else
                            for (int b = 14; b < 18; b++) {
                                prefaciaArray.add(prefacie[b][1]);
                            }
                        break;
                    case "40":
                        if (cirkevRok == 1)
                            prefaciaArray.add(prefacie[26][1]);
                        else
                            for (int b = 14; b < 18; b++) {
                                prefaciaArray.add(prefacie[b][1]);
                            }
                        break;
                    case "50":
                        if (cirkevRok == 1)
                            prefaciaArray.add(prefacie[27][1]);
                        else
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
                vlastnaPrefacia = true;
            } else if (VN) {
                if (tyzden == 1 || tyzden == 2) {
                    prefaciaArray.add(prefacie[18][1]);
                    vlastnaPrefacia = true;
                } else if (tyzden == 7) {
                    for (int b = 18; b < 23; b++) {
                        prefaciaArray.add(prefacie[b][1]);
                    }
                    prefaciaArray.add("O nanebovstúpení Pána I");
                    prefaciaArray.add("O nanebovstúpení Pána II");
                } else {
                    for (int b = 18; b < 23; b++) {
                        prefaciaArray.add(prefacie[b][1]);
                    }
                }
            } else if (A) {
                if (den < 17 || m == 10)
                    prefaciaArray.add(prefacie[31][1]);
                else
                    prefaciaArray.add(prefacie[32][1]);
            } else if (V) {
                vlastnaPrefacia = true;
                prefaciaArray.add(prefacie[33][1]);
                prefaciaArray.add(prefacie[34][1]);
                prefaciaArray.add(prefacie[35][1]);
            }
        } else if (feria) {
            if (C) {
                for (int b = 8; b < 14; b++) {
                    prefaciaArray.add(prefacie[b][1]);
                }
            } else if (P) {
                if (ID.equals("03")) {
                    prefaciaArray.add(prefacie[16][1]);
                    prefaciaArray.add(prefacie[17][1]);
                } else if (tyzden == 5) {
                    prefaciaArray.add(prefacie[29][1]);
                } else if (tyzden == 6) {
                    prefaciaArray.add(prefacie[30][1]);
                } else {
                    for (int b = 14; b < 18; b++) {
                        prefaciaArray.add(prefacie[b][1]);
                    }
                }
            } else if (VN) {
                if (tyzden == 1) {
                    prefaciaArray.add(prefacie[18][1]);
                    vlastnaPrefacia = true;
                } else if (Integer.parseInt(ID) > 64) {
                    for (int b = 18; b < 23; b++) {
                        prefaciaArray.add(prefacie[b][1]);
                    }
                    prefaciaArray.add("O nanebovstúpení Pána I");
                    prefaciaArray.add("O nanebovstúpení Pána II");
                } else {
                    for (int b = 18; b < 23; b++) {
                        prefaciaArray.add(prefacie[b][1]);
                    }
                }
            } else if (A) {
                if (den < 17 || m == 10)
                    prefaciaArray.add(prefacie[31][1]);
                else
                    prefaciaArray.add(prefacie[32][1]);
            } else if (V) {
                if (den > 6 && den < 13)
                    prefaciaArray.add("O zjavení Pána");
                prefaciaArray.add(prefacie[33][1]);
                prefaciaArray.add(prefacie[34][1]);
                prefaciaArray.add(prefacie[35][1]);
            }
        } else {
            switch (m) {
                case 0:
                    prefaciaVypis(prefacia1);
                    break;
                case 1:
                    prefaciaVypis(prefacia2);
                    break;
                case 2:
                    prefaciaVypis(prefacia3);
                    break;
                case 3:
                    prefaciaVypis(prefacia4);
                    break;
                case 4:
                    prefaciaVypis(prefacia5);
                    break;
                case 5:
                    prefaciaVypis(prefacia6);
                    break;
                case 6:
                    prefaciaVypis(prefacia7);
                    break;
                case 7:
                    prefaciaVypis(prefacia8);
                    break;
                case 8:
                    prefaciaVypis(prefacia9);
                    break;
                case 9:
                    prefaciaVypis(prefacia10);
                    break;
                case 10:
                    prefaciaVypis(prefacia11);
                    break;
                case 11:
                    prefaciaVypis(prefacia12);
                    break;
                default:
                    break;
            }
        }
        if (euchText.equals("2. eucharistická modlitba") && !vlastnaPrefacia)
            prefaciaArray.add("Vlastná prefácia - 2. eucharistická modlitba");
    }

    public void prefaciaVypis(String[][] prefacia) {
        int index;
        String p;
        index = indexID(prefacia);
        if (C) {
            for (int a = 1; a < prefacia[index].length; a++) {
                p = prefacia[index][a];
                if (Integer.parseInt(p) > 20) //ak je cislo prefacie vacsie ako 20
                    vlastnaPrefacia = true;
                for (int b = 0; b < prefacie.length; b++) {
                    if (prefacie[b][0].equals(p))
                        prefaciaArray.add(prefacie[b][1]);
                }
            }
            if ((m == 4 && ID.equals("14g") || ID.equals("16g")) || (m == 5 && ID.equals("11")))
                vlastnaPrefacia = true;
        } else if (P) {
            if (slavenie.equals("Ľubovoľná spomienka") || slavenie.equals("Spomienka")) {
                if (tyzden == 5)
                    prefaciaArray.add(prefacie[29][1]);
                else
                    for (int b = 14; b < 18; b++) {
                        prefaciaArray.add(prefacie[b][1]);
                    }
            } else {
                for (int a = 1; a < prefacia[index].length; a++) {
                    p = prefacia[index][a];
                    if (Integer.parseInt(p) > 20) //ak je cislo prefacie vacsie ako 20
                        vlastnaPrefacia = true;
                    if (p.equals("2"))
                        p = "12";
                    for (int b = 0; b < prefacie.length; b++) {
                        if (prefacie[b][0].equals(p))
                            prefaciaArray.add(prefacie[b][1]);
                    }
                }
            }
        } else if (VN) {
            for (int a = 1; a < prefacia[index].length; a++) {
                p = prefacia[index][a];
                if (Integer.parseInt(p) > 20) //ak je cislo prefacie vacsie ako 20
                    vlastnaPrefacia = true;
                if (p.equals("2"))
                    p = "13";
                for (int b = 0; b < prefacie.length; b++) {
                    if (prefacie[b][0].equals(p))
                        prefaciaArray.add(prefacie[b][1]);
                }
                if (p.equals("13") && ((tyzden == 6 && dvt > 5) || (tyzden == 7))) {
                    prefaciaArray.add("O nanebovstúpení Pána I");
                    prefaciaArray.add("O nanebovstúpení Pána II");
                }
            }
            if ((m == 4 && ID.equals("14g") || ID.equals("16g")) || (m == 5 && ID.equals("11")))
                vlastnaPrefacia = true;
        } else if (A) {
            if (den < 17 || m == 10) {
                if (ID.equals("003m")) {
                    switch (formArray.get(pozicia_formular)[2]) {
                        case "Preblahoslavená Panna Mária vyvolený potomok Izraela":
                            prefaciaArray.add("Vlastná prefácia - Preblahoslavená Panna Mária vyvolený potomok Izraela");
                            break;
                        case "Preblahoslavená Panna Mária pri Zvestovaní Pána":
                            prefaciaArray.add("Vlastná prefácia - Preblahoslavená Panna Mária pri Zvestovaní Pána");
                            break;
                        case "Navštívenie Preblahoslavenej Panny Márie":
                            prefaciaArray.add("Vlastná prefácia - Navštívenie Preblahoslavenej Panny Márie");
                            break;
                        default:
                            prefaciaArray.add("O preblahoslavenej Panne Marií I");
                            prefaciaArray.add("O preblahoslavenej Panne Marií II");
                            prefaciaArray.add(prefacie[31][1]);
                            break;
                    }
                } else {
                    if (!slavenie.equals("Sviatok") && !slavenie.equals("Slávnosť"))
                        prefaciaArray.add(prefacie[31][1]);
                    for (int a = 1; a < prefacia[index].length; a++) {
                        p = prefacia[index][a];
                        if (p.equals(""))
                            break;
                        else {
                            if (Integer.parseInt(p) > 20) //ak je cislo prefacie vacsie ako 20
                                vlastnaPrefacia = true;
                            for (int b = 0; b < prefacie.length; b++) {
                                if (prefacie[b][0].equals(p))
                                    prefaciaArray.add(prefacie[b][1]);
                            }
                        }
                    }
                }
            } else
                prefaciaArray.add(prefacie[32][1]);
        } else if (V) {
            if (den > 6 && m == 0)
                prefaciaArray.add("O zjavení Pána");
            for (int a = 1; a < prefacia[index].length; a++) {
                p = prefacia[index][a];
                if (Integer.parseInt(p) > 20) //ak je cislo prefacie vacsie ako 20
                    vlastnaPrefacia = true;
                for (int b = 0; b < prefacie.length; b++) {
                    if (prefacie[b][0].equals(p))
                        prefaciaArray.add(prefacie[b][1]);
                }
            }
        }

    }

    //vypíše možnosti EM
    public void ziskajEucharistiu() {
        eucharistiaArray.clear();
        if (vlastnaPrefacia || slavenie.equals("Vigília") || slavenie.equals("Slávnosť")
                || slavenie.equals("Sviatok")
                || ID.equals("003m") //Panna Mária v sobotu
                || ID.equals("001") //Prvý piatok
                || (P && tyzden == 6) //Veľký týždeň
                || (A && nedela) // nedeľa v advente
                || (V && den > 24) //vianocna oktava
                || ID.equals("004") //jarné kántrové dni
                || ID.equals("005") //letné kántrové dni
                || ID.equals("006") //jesenné kántrové dni
                || ID.equals("007") //zimné kántrové dni
                || ID.equals("008") //prosebné dni
                || ID.equals("009")) //za duchovné povolania
        {
            eucharistiaArray.add("1. eucharistická modlitba");
            eucharistiaArray.add("2. eucharistická modlitba");
            eucharistiaArray.add("3. eucharistická modlitba");
        } else {
            eucharistiaArray.add("1. eucharistická modlitba");
            eucharistiaArray.add("2. eucharistická modlitba");
            eucharistiaArray.add("3. eucharistická modlitba");
            eucharistiaArray.add("4. eucharistická modlitba");
        }
        if (P && !(slavenie.equals("Slávnosť") || slavenie.equals("Sviatok") || slavenie.equals("Vigília")
                || ID.equals("03") //Popolcová streda
                || tyzden == 6)) { //Veľký týždeň
            eucharistiaArray.add("1. eucharistická modlitba v omšiach za zmierenie");
            eucharistiaArray.add("2. eucharistická modlitba v omšiach za zmierenie");
        }
    }

    //sprievod na Kvetnu nedelu
    private void kvetnaNedelaDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog);
        ListView dialogListview = dialog.findViewById(R.id.vypis_misal);
        TextView dialogTextView = dialog.findViewById(R.id.dialog_title);
        Button dialogButton = dialog.findViewById(R.id.dialog_button);
        final ArrayList<Missa> dg = new ArrayList<>();

        if (rezim) {
            dialog.getWindow().setBackgroundDrawableResource(R.color.black);
            dialogTextView.setTextColor(getResources().getColor(R.color.background));
            dialogButton.setTextColor(getResources().getColor(R.color.background));
            dialogButton.setBackgroundColor(Color.BLACK);
        } else {
            dialog.getWindow().setBackgroundDrawableResource(R.color.background);
            dialogTextView.setTextColor(getResources().getColor(R.color.primary));
            dialogButton.setTextColor(getResources().getColor(R.color.primary));
            dialogButton.setBackgroundColor(getResources().getColor(R.color.background));
        }

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialogTextView.setText(kvetna_nedela[0]);
        dg.add(new Missa(null, kvetna_nedela[1], kvetna_nedela[2], null, kvetna_nedela[3], false, 0));
        dg.add(new Missa(kvetna_nedela[4], kvetna_nedela[5], false));
        dg.add(new Missa(kvetna_nedela[6], kvetna_nedela[7], true));
        dg.add(new Missa(kvetna_nedela[8], null, false));
        dg.add(new Missa(2));
        if (cirkevRok == 2) { //B
            dg.add(new Missa(null, "ČÍTANIE", kvetna_nedela[11], null, kvetna_nedela[12], true, 0));
            dg.add(new Missa(null, kvetna_nedela[13], kvetna_nedela[14], null, kvetna_nedela[15], true, 0));
        } else if (cirkevRok == 0) { //C
            dg.add(new Missa(null, "ČÍTANIE", kvetna_nedela[16], null, kvetna_nedela[17], true, 0));
        } else { //A
            dg.add(new Missa(null, "ČÍTANIE", kvetna_nedela[9], null, kvetna_nedela[10], true, 0));
        }
        dg.add(new Missa(2));
        dg.add(new Missa(kvetna_nedela[18], kvetna_nedela[19], false));
        dg.add(new Missa(kvetna_nedela[20], kvetna_nedela[21], true));
        dg.add(new Missa(kvetna_nedela[22], kvetna_nedela[23], true));
        dg.add(new Missa(kvetna_nedela[24], kvetna_nedela[25], false));
        dg.add(new Missa(kvetna_nedela[26], kvetna_nedela[27], true));
        dg.add(new Missa(kvetna_nedela[28], kvetna_nedela[29], true));
        dg.add(new Missa(kvetna_nedela[30], kvetna_nedela[31], true));
        dg.add(new Missa(2));

        MissaAdapter ada = new MissaAdapter(this, dg);
        dialogListview.setAdapter(ada);
        dialog.show();
    }


    //prosby za zosnulych a rozlicne potreby
    private void prosbyRozlicnePotreby() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog);
        ListView dialogListview = dialog.findViewById(R.id.vypis_misal);
        TextView dialogTextView = dialog.findViewById(R.id.dialog_title);
        Button dialogButton = dialog.findViewById(R.id.dialog_button);
        final ArrayList<Missa> dg = new ArrayList<>();

        if (rezim) {
            dialog.getWindow().setBackgroundDrawableResource(R.color.black);
            dialogTextView.setTextColor(getResources().getColor(R.color.background));
            dialogButton.setTextColor(getResources().getColor(R.color.background));
            dialogButton.setBackgroundColor(Color.BLACK);
        } else {
            dialog.getWindow().setBackgroundDrawableResource(R.color.background);
            dialogTextView.setTextColor(getResources().getColor(R.color.primary));
            dialogButton.setTextColor(getResources().getColor(R.color.primary));
            dialogButton.setBackgroundColor(getResources().getColor(R.color.background));
        }

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialogTextView.setText("Prosby za zosnulých a rozličné potreby");
        dg.add(new Missa("<font color='#B71C1C'>"+prosby_rozlicne[0][0]+"</font>", true, 1));
        dg.add(new Missa("<font color='#B71C1C'>"+prosby_rozlicne[1][0]+"</font>", true, 2));
        dg.add(new Missa("<font color='#B71C1C'>"+prosby_rozlicne[2][0]+"</font>", true, 3));
        dg.add(new Missa("<font color='#B71C1C'>"+prosby_rozlicne[3][0]+"</font>", true, 4));
        dg.add(new Missa("<font color='#B71C1C'>"+prosby_rozlicne[4][0]+"</font>", true, 5));

        MissaAdapter ada = new MissaAdapter(this, dg);
        dialogListview.setAdapter(ada);
        dialogListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Missa missa = dg.get(position);
                switch (missa.getOtvor()) {
                    case 1:
                        otvorenie(12);
                        break;
                    case 2:
                        otvorenie(13);
                        break;
                    case 3:
                        otvorenie(14);
                        break;
                    case 4:
                        otvorenie(15);
                        break;
                    case 5:
                        otvorenie(16);
                        break;
                    default:
                        break;
                }
            }
        });
        dialog.show();
    }

    //prosby za zosnulych a rozlicne potreby
    private void prosbyTriOblasti() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog);
        ListView dialogListview = dialog.findViewById(R.id.vypis_misal);
        TextView dialogTextView = dialog.findViewById(R.id.dialog_title);
        Button dialogButton = dialog.findViewById(R.id.dialog_button);
        final ArrayList<Missa> dg = new ArrayList<>();

        if (rezim) {
            dialog.getWindow().setBackgroundDrawableResource(R.color.black);
            dialogTextView.setTextColor(getResources().getColor(R.color.background));
            dialogButton.setTextColor(getResources().getColor(R.color.background));
            dialogButton.setBackgroundColor(Color.BLACK);
        } else {
            dialog.getWindow().setBackgroundDrawableResource(R.color.background);
            dialogTextView.setTextColor(getResources().getColor(R.color.primary));
            dialogButton.setTextColor(getResources().getColor(R.color.primary));
            dialogButton.setBackgroundColor(getResources().getColor(R.color.background));
        }

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialogTextView.setText("Prosby pred návštevou pápeža");
        dg.add(new Missa("<font color='#B71C1C'>"+tri_oblasti_modlitby_a_pripravy[0][0]+"</font>", true, 1));
        dg.add(new Missa("<font color='#B71C1C'>"+tri_oblasti_modlitby_a_pripravy[1][0]+"</font>", true, 2));
        dg.add(new Missa("<font color='#B71C1C'>"+tri_oblasti_modlitby_a_pripravy[2][0]+"</font>", true, 3));

        MissaAdapter ada = new MissaAdapter(this, dg);
        dialogListview.setAdapter(ada);
        dialogListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Missa missa = dg.get(position);
                switch (missa.getOtvor()) {
                    case 1:
                        otvorenie(17);
                        break;
                    case 2:
                        otvorenie(18);
                        break;
                    case 3:
                        otvorenie(19);
                        break;
                    default:
                        break;
                }
            }
        });
        dialog.show();
    }

    //podľa zavolania a premennej dialog otvorí dialógové okno
    public void otvorenie(int dialog) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Misal.this);
        if (dialog == 0) {//úvodný pozdrav celebranta
            builder.setMessage(Html.fromHtml(nahrad(uvodnyPozdrav)));
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Formuly úvodného pozdravu celebranta</b></font>")));
        } else if (dialog == 1) {//úkon kajúcnosti
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
        } else if (dialog == 2) {//gloria
            builder.setMessage(gloria_vypis);
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Glória</b></font>")));
        } else if (dialog == 3) {//sekvencia
            String sek = "";
            if (menoSvatca.equals("Sedembolestnej Panny Márie, patrónky Slovenska"))
                sek = sekvencia_vypis[0];
            else if ((slavenie.equals("Oktáva") || ID.equals("10") || ID.equals("20")) && VN)
                sek = sekvencia_vypis[1];
            else if (ID.equals("2gkp") || ID.equals("3gkp"))
                sek = sekvencia_vypis[2];
            else if (ID.equals("4gkp"))
                sek = sekvencia_vypis[3];
            builder.setMessage(Html.fromHtml(nahrad(sek)));
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Sekvencia</b></font>")));
        } else if (dialog == 4) {//kredo
            if (menoSvatca.equals("POPOLCOVÁ STREDA")) {
                builder.setMessage(Html.fromHtml(nahrad(popol)));
                builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Požehnanie popola a značenie popolom</b></font>")));
            } else {
                builder.setMessage(kredo_vypis);
                builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Krédo</b></font>")));
            }
        } else if (dialog == 5) {//eucharistická procesia
            builder.setMessage("");
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Eucharistická procesia</b></font>")));
        } else if (dialog == 6) {//modlitby nad ľudom
            builder.setMessage("");
            if (P) {
                builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Modlitba nad ľudom</b></font>")));
            } else {
                builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Modlitby nad ľudom</b></font>")));
            }
        } else if (dialog == 7) {//slávnosté požehnanie
            builder.setMessage("");
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Slávnostné požehnanie</b></font>")));
        } else if (dialog == 8) {//Teba, Bože, chválime - 31.12.
            builder.setMessage(teba_Boze_chvalime);
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Teba, Bože, chválime</b></font>")));
        } else if (dialog == 9) {//Príď, Duchu Svätý, tvorivý - 1.1.
            builder.setMessage(prid_Duchu_svaty_tvorivy);
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Príď, Duchu Svätý, tvorivý</b></font>")));
        } else if (dialog == 10) {
            builder.setMessage(Html.fromHtml(nahrad(modlitba_zasvatenia)));
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Zasvätenie ľudského pokolenia Božskému Srdcu</b></font>")));
        } else if (dialog == 11) { //ohlasenie Velkej noci
            builder.setMessage("");
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>Oznámenie dňa Veľkej noci</b></font>")));
        } else if (dialog == 12) { //rozličné prosby - prosby za zosnulých
        builder.setMessage(Html.fromHtml(nahrad(prosby_rozlicne[0][1])));
        builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>"+prosby_rozlicne[0][0]+"</b></font>")));
        } else if (dialog == 13) { //rozličné prosby - Prosby za zdravie a Božiu pomoc
            builder.setMessage(Html.fromHtml(nahrad(prosby_rozlicne[1][1])));
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>"+prosby_rozlicne[1][0]+"</b></font>")));
        } else if (dialog == 14) { //rozličné prosby - Prosby za poďakovanie
            builder.setMessage(Html.fromHtml(nahrad(prosby_rozlicne[2][1])));
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>"+prosby_rozlicne[2][0]+"</b></font>")));
        } else if (dialog == 15) { //rozličné prosby - Prosby za farnosť
            builder.setMessage(Html.fromHtml(nahrad(prosby_rozlicne[3][1])));
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>"+prosby_rozlicne[3][0]+"</b></font>")));
        } else if (dialog == 16) { //rozličné prosby - Prosby za duchovné povolania
            builder.setMessage(Html.fromHtml(nahrad(prosby_rozlicne[4][1])));
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>"+prosby_rozlicne[4][0]+"</b></font>")));
        } else if (dialog == 17) { //tri oblasti - pápež
            builder.setMessage(Html.fromHtml(nahrad(tri_oblasti_modlitby_a_pripravy[0][1])));
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>"+tri_oblasti_modlitby_a_pripravy[0][0]+"</b></font>")));
        } else if (dialog == 18) { //tri oblasti - Cirkev
            builder.setMessage(Html.fromHtml(nahrad(tri_oblasti_modlitby_a_pripravy[1][1])));
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>"+tri_oblasti_modlitby_a_pripravy[1][0]+"</b></font>")));
        } else if (dialog == 19) { //tri oblasti - ľudia
            builder.setMessage(Html.fromHtml(nahrad(tri_oblasti_modlitby_a_pripravy[2][1])));
            builder.setTitle(Html.fromHtml(nahrad("<font color='#B71C1C'><b>"+tri_oblasti_modlitby_a_pripravy[2][0]+"</b></font>")));
        }

        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
        TextView text = alert.findViewById(android.R.id.message);
        text.setTextSize(sizeO);
        if (rezim) {
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
        if (dialog == 5)
            otvorExtra(text, procesia);
        else if (dialog == 6)
            if (P) {
                int index = indexTyzdenDen(postne_pozehnania);
                otvorExtra(text, new String[]{postne_pozehnania[index][1]});
            } else
                otvorExtra(text, modlitby_nad_ludom);
        else if (dialog == 7)
            otvorExtra(text, new String[]{"", "Uvedené formuly slávnostných požehnaní môže kňaz použiť podľa vlastného uváženia na konci svätej omše alebo liturgie slova, na konci liturgie hodín alebo po vysluhovaní sviatostí.\n" +
                    "Diakon alebo, ak ho niet, sám kňaz, prednesie výzvu: ",
                    "<m>Skloňte sa na požehnanie. ",
                    "alebo: ",
                    "<m>Prijmite slávnostné požehnanie. ",
                    "Potom kňaz vystrie ruky nad ľud a prednesie formulu požehnania. Všetci odpovedia: ",
                    "<m>Amen.", "", "<br><br>" + slavnostne_pozehnanie[slav_pozehnanie][1]});
        else if (dialog == 11)
            otvorExtra(text, new String[]{"", "Na slávnosť Zjavenia Pána po evanjeliu diakon alebo sám kňaz, prípadne aj spevák môže ohlásiť deň Veľkej noci takto:\n",
                    "<br>" + ohlasenieVN[0] + vnd + ". " + mesiacG[vnm] + ohlasenieVN[1] + psd + ". " + mesiacG[psm] +
                            ohlasenieVN[2] + nvpd + ". " + mesiacG[nvpm] + ohlasenieVN[3] + dsd + ". " + mesiacG[dsm] +
                            ohlasenieVN[4] + zacAd + ". " + mesiacG[zacAm] + ohlasenieVN[5]});
    }

    //nastavenie režimu, písma, komentárov pri otvorení dialógového okna
    public void otvorExtra(TextView text, String[] vypis) {
        for (int i = 0; i < vypis.length; i++) {
            if (!vypis[i].equals("")) {
                if (i % 2 == 0) {
                    if (vypis[i].substring(0, 3).equals("<m>")) {
                        SpannableString s = new SpannableString(vypis[i].substring(3));
                        s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                        if (pismo)
                            s.setSpan(new StyleSpan(Typeface.BOLD_ITALIC), 0, s.length(), 0);
                        else
                            s.setSpan(new StyleSpan(Typeface.ITALIC), 0, s.length(), 0);
                        text.append(s);
                    } else
                        text.append(Html.fromHtml(nahrad(vypis[i])));
                } else {
                    SpannableString s = new SpannableString(vypis[i]);
                    s.setSpan(new RelativeSizeSpan(0.75f), 0, s.length(), 0);
                    s.setSpan(new ForegroundColorSpan(farba_r), 0, s.length(), 0);
                    text.append(s);
                }
            }
        }
    }

    public void slavnostnePozehnanie() {
        if (ID.equals("01gk") && m == 0) //Na začiatku roka - PM Bohorodičky
            slav_pozehnanie = 5;
        else if (ID.equals("06gk") && m == 0) //Zjavenie Pána
            slav_pozehnanie = 6;
        else if (ID.equals("6gkp")) //Nanebovstúpenie Pána
            slav_pozehnanie = 7;
        else if (ID.equals("3gkp")) //Zoslanie Ducha Svätého, Slávnosť
            slav_pozehnanie = 8;
        else if (ID.equals("2pm") || ID.equals("9gkp")) //Preblahoslavenej Panny Márie, Matky Cirkvi, Spomienka
            slav_pozehnanie = 9;
        else if ((ID.equals("28gk") || ID.equals("29gk")) && m == 5) //Sv. Petra a Pavla, apoštolov
            slav_pozehnanie = 10;
        else if (((ID.equals("03g") || ID.equals("14g")) && m == 4) || //Filip a Jakub - 3.5, Matej - 14.5
                (ID.equals("11") && m == 5) || //Barnabas - 11.6
                ((ID.equals("03g") || ID.equals("25g")) && m == 6) ||//Tomáš - 3.7, Jakub - 25.7
                (ID.equals("24g") && m == 7) ||//Bartolomej - 24.8
                (ID.equals("21g") && m == 8) ||//Matúš - 21.9
                (ID.equals("28g") && m == 9) ||//Šimon a Júda 28.10
                (ID.equals("30g") && m == 10))//Ondrej - 30.11
            slav_pozehnanie = 11;
        else if (ID.equals("01gk") && m == 10) //Všetkých svätých
            slav_pozehnanie = 12;
        else if ((ID.equals("02an") || ID.equals("02bn") || ID.equals("02cn")) && m == 10) //Spomienka na všetkých verných zosnulých
            slav_pozehnanie = 13;
        else if(P && slavenie.equals("Slávnosť"))
            slav_pozehnanie = 2;
        else if (nedela || slavenie.equals("Slávnosť") || slavenie.equals("Sviatok")
                || slavenie.equals("Oktáva") || slavenie.equals("Vigília")) {
            if (A)
                slav_pozehnanie = 0;
            else if (V)
                slav_pozehnanie = 1;
            else if (VN) {
                    slav_pozehnanie = 3;
            } else //cezrok
                slav_pozehnanie = 4;
        } else slav_pozehnanie = -1;
    }

    //výpis celej omše
    public void vypis() {
        if (rezim)
            drawer.setBackgroundColor(Color.BLACK);
        else
            drawer.setBackgroundColor(getResources().getColor(R.color.background));
        final ArrayList<Missa> missas = new ArrayList<>();
        missas.add(new Missa(true));
        if (ID.equals("60") && P) {
            missas.add(new Missa("<font color='#B71C1C'>" + kvetna_nedela[0] + " (otvoriť)</font>", true, 17));
            missas.add(new Missa(1));
        }
        missas.add(new Missa(null, uvodny_spev.toUpperCase(), uvodny_suradnice, null, uvodny_vypis, true, 0));
        missas.add(new Missa(1)); //medzera mala
        missas.add(new Missa(pozdrav, true, 1));
        missas.add(new Missa(1)); //medzera mala
        missas.add(new Missa(kajucnost, true, 2));
        if (ticheModlitby) {
            missas.add(new Missa(1)); //medzera mala
            missas.add(new Missa(tiche_modlitby[0][0], tiche_modlitby[0][1], tiche_modlitby[0][2]));
            missas.add(new Missa(null, tiche_modlitby[0][3], tiche_modlitby[0][4]));
        }
        if (gloria != null) {
            missas.add(new Missa(1)); //medzera mala
            missas.add(new Missa(gloria, true, 3));//vynimka v poste
        }
        missas.add(new Missa(2)); //medzera velka
        missas.add(new Missa(modlitba_dna.toUpperCase(), null, null, null, modlitba_dna_vypis, true, 0));
        missas.add(new Missa(2)); //medzera velka
        missas.add(new Missa(liturgia_slova.toUpperCase(), null, null, null, null, true, 0));
        if (P && (ID.equals("30") || ID.equals("40") || ID.equals("50")) && (actualCirkevRok == 2 || actualCirkevRok == 0)) { //3., 4., 5. pôstna nedeľa môžu mať cítania z roku B
            if (cirkevRok == 2 || cirkevRok == 0)
                missas.add(new Missa("<font color='#B71C1C'>Čítania z roku A</font>", true, 20));
            else
                missas.add(new Missa("<font color='#B71C1C'>Čítania z akuálneho roku</font>", true, 20));
        }
        if (aleboCitanie1 != null)
            vypisAlebo(missas, aleboCitanie1, 11);
        missas.add(new Missa(null, prve_citanie.toUpperCase(), prve_citanie_suradnice, prve_citanie_citat, prve_citanie_vypis, true, -2));
        missas.add(new Missa(1)); //medzera mala
        if (aleboZalm != null && !ID.equals("10gkp") && !ID.equals("11gkp") && !nadpis.equals("Omša v čase pandémie") && !(P && ID.equals("30")))
            vypisAlebo(missas, aleboZalm, 14);
        missas.add(new Missa(null, zalm.toUpperCase(), zalm_suradnice, null, zalm_vypis, true, 0));
        missas.add(new Missa(1)); //medzera mala
        if (druhe_citanie != null) {
            if (aleboCitanie2 != null && !(P && ID.equals("30")))
                vypisAlebo(missas, aleboCitanie2, 12);
            missas.add(new Missa(null, druhe_citanie.toUpperCase(), druhe_citanie_suradnice, druhe_citanie_citat, druhe_citanie_vypis, true, -2));
            missas.add(new Missa(1)); ////medzera mala
        }
        if (sekvencia != null) {
            missas.add(new Missa(sekvencia, true, 4));//vynimka
            missas.add(new Missa(1)); //medzera mala
        }
        missas.add(new Missa(null, aleluja.toUpperCase(), aleluja_suradnice, null, aleluja_vypis, true, 0));
        missas.add(new Missa(1)); //medzera mala
        if (aleboEvanjelium != null)
            vypisAlebo(missas, aleboEvanjelium, 13);
        if (evanjelium_vypis.equals("pasie")) {
            vypisAleboPasie(missas);
        } else if (ticheModlitby) {
            missas.add(new Missa(tiche_modlitby[1][0], null, tiche_modlitby[1][1]));
            missas.add(new Missa(1)); //medzera mala
            missas.add(new Missa(null, evanjelium.toUpperCase(), evanjelium_suradnice, evanjelium_citat, evanjelium_vypis, true, -2));
            missas.add(new Missa(1)); //medzera mala
            missas.add(new Missa(tiche_modlitby[2][0], null, tiche_modlitby[2][1]));
        } else
            missas.add(new Missa(null, evanjelium.toUpperCase(), evanjelium_suradnice, evanjelium_citat, evanjelium_vypis, true, -2));
        if ((ID.equals("06gk") || ID.equals("05gk")) && m == 0) { //zjavenie Pana
            missas.add(new Missa(1)); //medzera mala
            missas.add(new Missa("<font color='#B71C1C'>Oznámenie dňa Veľkej noci (otvoriť)</font>", true, 19));
        }
        if (kredo != null) {
            missas.add(new Missa(1)); //medzera mala
            missas.add(new Missa(kredo, true, 5));//vynimka

        }
        missas.add(new Missa(2)); //medzera velka
        if (aleboProsby != null)
            vypisAlebo(missas, aleboProsby, 15);
        missas.add(new Missa(prosby.toUpperCase(), prosby_uvod, prosby_zvolanie, "<br>" + prosby_vypis, true));
        //missas.add(new Missa("<font color='#B71C1C'>Prosby pred návštevou pápeža (otvoriť)</font>", true,  22));
        missas.add(new Missa("<font color='#B71C1C'>Prosby za zosnulých a rozličné potreby (otvoriť)</font>", true, 21));
        missas.add(new Missa(null, null, null, prosby_zaver, true));
        if (ticheModlitby) {
            missas.add(new Missa(1)); //medzera mala
            missas.add(new Missa(tiche_modlitby[3][0], tiche_modlitby[3][1], tiche_modlitby[3][2]));
            for (int i = 3; i < tiche_modlitby[3].length; i = i + 2) {
                missas.add(new Missa(null, tiche_modlitby[3][i], tiche_modlitby[3][i + 1]));
            }
        }
        missas.add(new Missa(1)); //medzera mala
        missas.add(new Missa(modlitba_dary.toUpperCase(), null, null, null, modlitba_dary_vypis, true, 0));
        missas.add(new Missa(2)); //medzera velka
        missas.add(new Missa(prefacia.toUpperCase(), prefacia_nadpis, prefacia_vypis, true));
        missas.add(new Missa(2)); //medzera velka
        modlitbaEucharistia(missas);
        missas.add(new Missa(2)); //medzera velka
        obradPrijimania(missas);
        missas.add(new Missa(1)); //medzera mala
        missas.add(new Missa(null, prijimanie_spev.toUpperCase(), prijimanie_suradnice, null, prijimanie_vypis, true, 0));
        if (ticheModlitby) {
            missas.add(new Missa(1)); //medzera mala
            missas.add(new Missa(null, tiche_modlitby[4][1], tiche_modlitby[4][2]));
        }
        if (menoSvatca.equals("Slávnosť Panny Márie Bohorodičky")) {//vyskakovacie po prijímaní (31.12.,1.1.)
            if (ID.equals("31gk")) {
                missas.add(new Missa(1)); //medzera mala
                missas.add(new Missa("<font color='#B71C1C'>Teba, Bože, chválime (otvoriť)</font>", true, 9));
            } else if (ID.equals("01gk")) {
                missas.add(new Missa(1)); //medzera mala
                missas.add(new Missa("<font color='#B71C1C'>Príď, Duchu Svätý, tvorivý (otvoriť)</font>", true, 10));
            }
        }
        missas.add(new Missa(1)); //medzera mala
        missas.add(new Missa(modlitba_prijimanie.toUpperCase(), null, null, null, modlitba_prijimanie_vypis, true, 0));
        if (ID.equals("8gkp")) { //nedela Krista Krala - modlitba zasvatenia
            missas.add(new Missa(1)); //medzera mala
            missas.add(new Missa("<font color='#B71C1C'>Zasvätenie ľudského pokolenia Božskému Srdcu (otvoriť)</font>", true, 18));
        }
        if(!P || !slavenie.equals("Slávnosť")) {
            missas.add(new Missa(1)); //medzera mala
            pozehnanie(missas); //otvor = 6, 7
        }
        if (slav_pozehnanie != -1) {
            missas.add(new Missa(1)); //medzera mala
            missas.add(new Missa("<font color='#B71C1C'>Slávnostné požehnanie (otvoriť)</font>", true, 8));
        }
        rozpustenieLudu(missas);
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
                switch (missa.getOtvor()) {
                    //-2 sa pouziva na zarovnanie do bloku
                    //-1 sa pouziva na vypisanie nadpisu v MissaAdapter
                    case 1:
                        otvorenie(0);
                        double_click = 0;
                        break;
                    case 2:
                        otvorenie(1);
                        double_click = 0;
                        break;
                    case 3:
                        otvorenie(2);
                        double_click = 0;
                        break;
                    case 4:
                        otvorenie(3);
                        double_click = 0;
                        break;
                    case 5:
                        otvorenie(4);
                        double_click = 0;
                        break;
                    case 6:
                        otvorenie(5);
                        double_click = 0;
                        break;
                    case 7:
                        otvorenie(6);
                        double_click = 0;
                        break;
                    case 8:
                        otvorenie(7);
                        double_click = 0;
                        break;
                    case 9:
                        otvorenie(8);
                        double_click = 0;
                        break;
                    case 10:
                        otvorenie(9);
                        double_click = 0;
                        break;
                    //aleboCitania
                    //prve citanie
                    case 11:
                        changeAleboCitanie(aleboCitanie1, missa.getIndexAlebo());
                        prve_citanie_suradnice = aleboCitanie1[0][0];
                        prve_citanie_citat = aleboCitanie1[0][1];
                        prve_citanie_vypis = aleboCitanie1[0][2];
                        if (nadpis.equals("Omša v čase pandémie") || ID.equals("11gkp")) {
                            changeAleboCitanie(aleboZalm, missa.getIndexAlebo());
                            zalm_suradnice = aleboZalm[0][0];
                            zalm_vypis = aleboZalm[0][1];
                        } else if (ID.equals("10gkp")) {
                            changeAleboCitanie(aleboZalm, missa.getIndexAlebo());
                            zalm_suradnice = aleboZalm[0][0];
                            zalm_vypis = aleboZalm[0][1];
                            changeAleboCitanie(aleboCitanie2, missa.getIndexAlebo());
                            druhe_citanie_suradnice = aleboCitanie2[0][0];
                            druhe_citanie_citat = aleboCitanie2[0][1];
                            druhe_citanie_vypis = aleboCitanie2[0][2];
                        } /*else if (P && ID.equals("30")) {
                            changeAleboCitanie(aleboZalm, missa.getIndexAlebo());
                            zalm_suradnice = aleboZalm[0][0];
                            zalm_vypis = aleboZalm[0][1];
                            changeAleboCitanie(aleboCitanie2, missa.getIndexAlebo());
                            druhe_citanie_suradnice = aleboCitanie2[0][0];
                            druhe_citanie_citat = aleboCitanie2[0][1];
                            druhe_citanie_vypis = aleboCitanie2[0][2];
                            changeAleboCitanie(aleboEvanjelium, missa.getIndexAlebo());
                            evanjelium_suradnice = aleboEvanjelium[0][0];
                            evanjelium_citat = aleboEvanjelium[0][1];
                            evanjelium_vypis = aleboEvanjelium[0][2];
                        }*/
                        pozicia_listview = position;
                        vypis();
                        break;
                    //druhe citanie
                    case 12:
                        changeAleboCitanie(aleboCitanie2, missa.getIndexAlebo());
                        druhe_citanie_suradnice = aleboCitanie2[0][0];
                        druhe_citanie_citat = aleboCitanie2[0][1];
                        druhe_citanie_vypis = aleboCitanie2[0][2];
                        if (ID.equals("10gkp")) {
                            changeAleboCitanie(aleboZalm, missa.getIndexAlebo());
                            zalm_suradnice = aleboZalm[0][0];
                            zalm_vypis = aleboZalm[0][1];
                            changeAleboCitanie(aleboCitanie1, missa.getIndexAlebo());
                            prve_citanie_suradnice = aleboCitanie1[0][0];
                            prve_citanie_citat = aleboCitanie1[0][1];
                            prve_citanie_vypis = aleboCitanie1[0][2];
                        }
                        pozicia_listview = position;
                        vypis();
                        break;
                    //evanjelium
                    case 13:
                        changeAleboCitanie(aleboEvanjelium, missa.getIndexAlebo());
                        evanjelium_suradnice = aleboEvanjelium[0][0];
                        evanjelium_citat = aleboEvanjelium[0][1];
                        evanjelium_vypis = aleboEvanjelium[0][2];
                        pozicia_listview = position;
                        vypis();
                        break;
                    //zalm
                    case 14:
                        changeAleboCitanie(aleboZalm, missa.getIndexAlebo());
                        zalm_suradnice = aleboZalm[0][0];
                        zalm_vypis = aleboZalm[0][1];
                        /*if (ID.equals("10gkp") || ID.equals("11gkp")) {
                            changeAleboCitanie(aleboCitanie1, missa.getIndexAlebo());
                            prve_citanie_suradnice = aleboCitanie1[0][0];
                            prve_citanie_citat = aleboCitanie1[0][1];
                            prve_citanie_vypis = aleboCitanie1[0][2];
                        }*/
                        pozicia_listview = position;
                        vypis();
                        break;
                    //prosby
                    case 15:
                        changeAleboCitanie(aleboProsby, missa.getIndexAlebo());
                        prosby_nadpis = aleboProsby[0][0];
                        prosby_uvod = aleboProsby[0][1];
                        prosby_zvolanie = aleboProsby[0][2];
                        prosby_vypis = aleboProsby[0][3];
                        prosby_zaver = aleboProsby[0][4];
                        pozicia_listview = position;
                        vypis();
                        break;
                    case 16:
                        changeAleboPasie();
                        pozicia_listview = position;
                        vypis();
                        break;
                    case 17:
                        kvetnaNedelaDialog();
                        break;
                    case 18:
                        otvorenie(10);
                        double_click = 0;
                        break;
                    case 19:
                        otvorenie(11);
                        double_click = 0;
                        break;
                    case 20: //zmena cirkevRoku kvoli citaniam
                        if (cirkevRok == 1)
                            cirkevRok = actualCirkevRok;
                        else
                            cirkevRok = 1;
                        prveCitanie();
                        zalm();
                        druheCitanie();
                        aleluja();
                        evanjelium();
                        ziskajPrefaciu();
                        prefacia();
                        pozicia_listview = position;
                        vypis();
                        break;
                    case 21:
                        prosbyRozlicnePotreby();
                        break;
                    case 22:
                        prosbyTriOblasti();
                        break;
                    default:
                        break;
                }
            }
        });
    }

    private void rozpustenieLudu(ArrayList<Missa> missas) {
        for (int i = 0; i < rozpustenie_ludu.length; i = i + 2) {
            missas.add(new Missa(rozpustenie_ludu[i], rozpustenie_ludu[i + 1], false));
        }
    }

    private void changeAleboPasie() {
        int a = pasie1_suradnice;
        pasie1_suradnice = pasie2_suradnice;
        pasie2_suradnice = a;
    }

    public void vypisAleboPasie(ArrayList<Missa> missas) {
        missas.add(new Missa("<font color='#B71C1C'>Alebo: " + postEvanjelium[pasie][pasie2_suradnice] + "</font>", true, 16, 0));
        missas.add(new Missa(null, evanjelium.toUpperCase(), postEvanjelium[pasie][pasie1_suradnice], null, postEvanjelium[pasie][3], true, -2));
        if (pasie1_suradnice < pasie2_suradnice)
            for (int i = 4; i < pasie2_suradnice - 1; i = i + 2) {
                missas.add(new Missa(null, null, null, postEvanjelium[pasie][i], postEvanjelium[pasie][i + 1], true, -2));
            }
        else
            for (int i = pasie1_suradnice + 1; i < postEvanjelium[pasie].length; i = i + 2) {
                missas.add(new Missa(null, null, null, postEvanjelium[pasie][i], postEvanjelium[pasie][i + 1], true, -2));
            }
    }

    public void vypisAlebo(ArrayList<Missa> missas, String[][] citanie, int otvor) {
        for (int i = 1; i < citanie.length; i++) {
            missas.add(new Missa("<font color='#B71C1C'>Zobraziť: " + citanie[i][0] + "</font>", true, otvor, i));
        }
    }

    public void changeAleboCitanie(String[][] citanie, int indexAlebo) {
        String[] original = citanie[0];
        citanie[0] = citanie[indexAlebo];
        citanie[indexAlebo] = original;
    }

    //schováva tlačidla pre výber formuláru, prefácie a EM
    public void less(View view) {
        LinearLayout buttons = findViewById(R.id.buttons);
        ImageButton more = findViewById(R.id.more);
        buttons.setVisibility(LinearLayout.GONE);
        more.setVisibility(ImageButton.VISIBLE);
        more.bringToFront();
    }

    //zobrazí tlačidla pre výber formuláru, prefácie a EM
    public void more(View view) {
        LinearLayout buttons = findViewById(R.id.buttons);
        ImageButton more = findViewById(R.id.more);
        buttons.setVisibility(LinearLayout.VISIBLE);
        more.setVisibility(ImageButton.GONE);
    }

}
/* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.misal_menu, menu);
        return true;
    }*/

  /*  public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    public void fileDownload() throws Exception {
        if (isExternalStorageWritable()) {
            Toast.makeText(this, "Vytvára sa...", Toast.LENGTH_SHORT).show();

            File a = new File(Environment.getExternalStorageDirectory(), "Missa");
            if (!a.exists())
                a.mkdirs();
            File b = new File(a, "omsa.doc");
            FileWriter writer = new FileWriter(b);
            writer.append("<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "<style>\n" +
                    "div.nadpis {\n" + "font-size: ").append(String.valueOf(sizeN)).append("px;\n").append("color: #000000;").append("font-weight: bold;").append("text-align: center;").append("}\n")
                    .append("div.sekcia {\n").append("font-size: ").append(String.valueOf(sizeO)).append("px;\n").append("color: #80242b;").append("font-weight: bold;").append("}\n")
                    .append("div.podnadpis {\n").append("font-size: ").append(String.valueOf(sizeO)).append("px;\n").append("color: #80242b;").append("}\n")
                    .append("div.citat {\n").append("font-size: ").append(String.valueOf(sizeO)).append("px;\n").append("color: #000000;").append("font-style: italic;").append("text-align: center;").append("}\n")
                    .append("div.text {\n").append("font-size: ").append(String.valueOf(sizeO)).append("px;\n").append("color: #000000;").append("}\n").append("</style>").append("</head>\n").append("<body>\n");

            writer.append("<div class=\"nadpis\">")
                    .append(nadpis.getText())
                    .append("</div>")
                    .append("<br>");
            writer.append("<div class=\"podnadpis\">")
                    .append(String.valueOf(uvodny_spev.getText()).toUpperCase())
                    .append(uvodny_suradnice.getText())
                    .append("</div>")
                    .append("<div class=\"text\">").append(uvodny_txt).append("</div>")
                    .append("<br>");
            writer.append("<div class=\"sekcia\">")
                    .append(modlitba_dna.getText().toString().toUpperCase())
                    .append("</div>")
                    .append("<div class=\"text\">")
                    .append(modlitba_dna_txt)
                    .append("</div>")
                    .append("<br>");
            writer.append("<div class=\"sekcia\">")
                    .append(liturgia_slova.getText().toString().toUpperCase())
                    .append("</div>");
            writer.append("<div class=\"podnadpis\">")
                    .append(String.valueOf(prve_citanie.getText()).toUpperCase()).append(" ").append(prve_citanie_suradnice.getText())
                    .append("</div>")
                    .append("<div class=\"citat\">")
                    .append(prve_citanie_citat.getText())
                    .append("</div>")
                    .append("<div class=\"text\">")
                    .append(prve_citanie_txt)
                    .append("</div>")
                    .append("<br>");
            writer.append("<div class=\"podnadpis\">")
                    .append(String.valueOf(zalm.getText()).toUpperCase()).append(" ").append(zalm_suradnice.getText())
                    .append("</div>")
                    .append("<div class=\"text\">")
                    .append(zalm_txt)
                    .append("</div>")
                    .append("<br>");
            if ((ID.contains("k") || menoSvatca.equals("POPOLCOVÁ STREDA") || nedela) && !slavenie.equals("Oktáva")) {
                writer.append("<div class=\"podnadpis\">")
                        .append(String.valueOf(druhe_citanie.getText())).append(" ").append(druhe_citanie_suradnice.getText())
                        .append("</div>")
                        .append("<div class=\"citat\">")
                        .append(druhe_citanie_citat.getText())
                        .append("</div>")
                        .append("<div class=\"text\">")
                        .append(druhe_citanie_vypis.getText())
                        .append("</div>")
                        .append("<br>");
            }
            writer.append("<div class=\"podnadpis\">")
                    .append(String.valueOf(aleluja.getText()).toUpperCase()).append(" ").append(aleluja_suradnice.getText())
                    .append("</div>")
                    .append("<div class=\"text\">")
                    .append(aleluja_txt)
                    .append("</div>")
                    .append("<br>");
            writer.append("<div class=\"podnadpis\">")
                    .append(String.valueOf(evanjelium.getText()).toUpperCase()).append(" ").append(evanjelium_suradnice.getText())
                    .append("</div>")
                    .append("<div class=\"citat\">")
                    .append(evanjelium_citat.getText())
                    .append("</div>")
                    .append("<div class=\"text\">")
                    .append(evanjelium_txt)
                    .append("</div>")
                    .append("<br>");
            writer.append("<div class=\"sekcia\">")
                    .append(prosby.getText().toString().toUpperCase())
                    .append("</div>")
                    .append("<div class=\"text\">")
                    .append(prosby_uvod.getText())
                    .append("</div>")
                    .append("<div class=\"citat\" style=\"text-align:left\">")
                    .append(prosby_zvolanie.getText())
                    .append("</div>")
                    .append("<div class=\"text\">")
                    .append(prosby_vypis_txt)
                    .append("</div>")
                    .append("<br>")
                    .append("<div class=\"text\">")
                    .append(prosby_zaver_txt)
                    .append("</div>")
                    .append("<br>");
            writer.append("<div class=\"sekcia\">")
                    .append(prefacia.getText().toString().toUpperCase())
                    .append("</div>")
                    .append("<div class=\"podnadpis\"  style=\"text-align:center\">")
                    .append(prefacia_nadpis.getText())
                    .append("</div>")
                    .append("<div class=\"text\">")
                    .append(prefacia_txt)
                    .append("</div>")
                    .append("<br>");
            writer.append("<div class=\"sekcia\">")
                    .append(modlitba_eucharistia.getText().toString().toUpperCase())
                    .append("</div>")
                    .append("<br>");
            writer.append("<div class=\"sekcia\">")
                    .append(obrad_prijimania.getText().toString().toUpperCase())
                    .append("</div>")
                    .append("<br>");
            writer.append("<div class=\"podnadpis\"  style=\"text-align:center\">")
                    .append(String.valueOf(prijimanie_spev.getText()).toUpperCase()).append(" ").append(prijimanie_suradnice.getText())
                    .append("</div>")
                    .append("<div class=\"text\">")
                    .append(prijimanie_txt)
                    .append("</div>")
                    .append("<br>");
            writer.append("<div class=\"sekcia\">")
                    .append(modlitba_prijimanie.getText().toString().toUpperCase())
                    .append("</div>")
                    .append("<div class=\"text\">")
                    .append(modlitba_prijimanie_txt)
                    .append("</div>");

            writer.append("</body>\n" +
                    "</html>");
            writer.flush();
            writer.close();

            Toast.makeText(this, a.getAbsolutePath(), Toast.LENGTH_SHORT).show();
        }
    }*/




