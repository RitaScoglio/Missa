package sk.missa.interfaces;

/*
* nadpis_view, vypis_view, meno_view - ID k views z activity_jazyky, do ktorých sa v triede Jazyky vkladá uložený text
* každý jazyk má pole pre nadpisy a dvorozmerné pole pre text v cudzom jazyku, vo väčšine prípadov so slovenským prekladom
*/

import sk.missa.R;

public interface Language {

    Integer[] nadpis_view = {R.id.nadpis1, R.id.nadpis2, R.id.nadpis3, R.id.nadpis4, R.id.nadpis5, R.id.nadpis6,
            R.id.nadpis7, R.id.nadpis8, R.id.nadpis9, R.id.nadpis10, R.id.nadpis11, R.id.nadpis12};

    Integer[] vypis_view = {
            R.id.vypis1_1, R.id.vypis1_2, R.id.vypis1_3, R.id.vypis1_4, R.id.vypis1_5, R.id.vypis1_6, R.id.vypis1_7,
            R.id.vypis1_8, R.id.vypis1_9, R.id.vypis1_10, R.id.vypis1_11, R.id.vypis1_12, R.id.vypis1_13, R.id.vypis1_14,
            R.id.vypis2,
            R.id.vypis3_1, R.id.vypis3_2,
            R.id.vypis4_1, R.id.vypis4_2, R.id.vypis4_3, R.id.vypis4_4,
            R.id.vypis5_1, R.id.vypis5_2,
            R.id.vypis6,
            R.id.vypis7_1, R.id.vypis7_2, R.id.vypis7_3, R.id.vypis7_4, R.id.vypis7_5, R.id.vypis7_6,
            R.id.vypis8_1, R.id.vypis8_2, R.id.vypis8_3, R.id.vypis8_4, R.id.vypis8_5, R.id.vypis8_6, R.id.vypis8_7,
            R.id.vypis9_1, R.id.vypis9_2, R.id.vypis9_3, R.id.vypis9_4, R.id.vypis9_5, R.id.vypis9_6,
            R.id.vypis10_1, R.id.vypis10_2, R.id.vypis10_3, R.id.vypis10_4, R.id.vypis10_5, R.id.vypis10_6, R.id.vypis10_7,
            R.id.vypis10_8, R.id.vypis10_9,
            R.id.vypis11_1, R.id.vypis11_2, R.id.vypis11_3, R.id.vypis11_4, R.id.vypis11_5,
            R.id.vypis12_1, R.id.vypis12_2, R.id.vypis12_3, R.id.vypis12_4, R.id.vypis12_5, R.id.vypis12_6,
            R.id.bonusv9_1, R.id.bonusv9_2, R.id.bonusv9_3, R.id.bonusv9_4, R.id.bonusv9_5
    };

    Integer[] meno_view = {
            R.id.meno1_1, R.id.meno1_2, R.id.meno1_3, R.id.meno1_4, R.id.meno1_5, R.id.meno1_6, R.id.meno1_7,
            R.id.meno1_8, R.id.meno1_9, R.id.meno1_10, R.id.meno1_11, R.id.meno1_12, R.id.meno1_13, R.id.meno1_14,
            R.id.meno3_1, R.id.meno3_2, R.id.meno4_1, R.id.meno4_2, R.id.meno4_3, R.id.meno4_4,
            R.id.meno5_1, R.id.meno5_2, R.id.meno7_1, R.id.meno7_2, R.id.meno7_3, R.id.meno7_4, R.id.meno7_5, R.id.meno7_6,
            R.id.meno8_1, R.id.meno8_2, R.id.meno8_3, R.id.meno8_4, R.id.meno8_5, R.id.meno8_6, R.id.meno8_7,
            R.id.meno9_1, R.id.meno9_2, R.id.meno9_3, R.id.meno9_4, R.id.meno9_5, R.id.meno9_6,
            R.id.meno10_1, R.id.meno10_2, R.id.meno10_3, R.id.meno10_4, R.id.meno10_5, R.id.meno10_6, R.id.meno10_7,
            R.id.meno10_8, R.id.meno10_9, R.id.meno11_2, R.id.meno11_3, R.id.meno11_4, R.id.meno11_5,
            R.id.meno12_1, R.id.meno12_2, R.id.meno12_3, R.id.meno12_4, R.id.meno12_5, R.id.meno12_6,
            R.id.bonusm9_1, R.id.bonusm9_2, R.id.bonusm9_3, R.id.bonusm9_4, R.id.bonusm9_5
    };

    String[] Latin_nadpis = {
            "<b>RITUS INITIALES – ÚVODNÉ OBRADY</b><br><br>INTROITUS – ÚVODNÝ SPEV",
            "GLORIA – GLÓRIA",
            "COLLECTA – MODLIDBA DŇA<br><br><b>LITURGIAS VERBI – LITURGIA SLOVA</b><br><br>LECTIO – ČÍTANIE<br>Po prečítaní čítania:",
            "EVANGELIUM - EVANJELIUM",
            "Po prečítaní evanjelia:",
            "CREDO – VYZNANIE VIERY",
            "ORATIO UNIVERSALIS SEU ORATIO FIDELIUM – SPOLOČNÉ MODLITBY VERIACICH<br><br><b>LITURGIA EUCHARISTICA – LITURGIA EUCHARISTIE</b><br>",
            "ORATIO SUPER OBLATA – MODLITBA NAD OBETNÝMI DARMI.<br><br>PREFATIO – PREFÁCIA",
            "PREX EUCHARISTICA – EUCHARISTICKÁ MODLITBA<br>Po premenení:",
            "RITUS COMMUNIONIS – OBRAD PRIJÍMANIA",
            "AGNUS DEI – BARÁNOK BOŽÍ",
            "POSTCOMMUNIO – MODLITBA PO PRIJÍMANÍ<br><br><b>RITUS CONCLUSIONIS - ZÁVEREČNÉ OBRADY</b><br>"
    };

    String[][] Latin_vypis = {
            {"In nomine Patris et Filii et Spiritus Sancti.", "V mene Otca i Syna i Ducha Svätého."},
            {"Amen."},
            {"Dominus vobiscum.", "Pán s vami."},
            {"Et cum spiritu tuo.", "I s duchom Tvojím.\n"},
            {"Fratres, agnoscamus peccata nostra, ut apti simus ad sacra mysteria celebranda.",
                    "Bratia a sestry, uznajme svoje hriechy, aby sme mohli s čistým srdcom sláviť sväté tajomstvá."},
            {"Confiteor Deo omnipotenti\n" +
                    "et vobis, fratres, quia peccavi nimis\n" +
                    "cogitatione, verbo,\n" +
                    "opere et omissione:\n" +
                    "mea culpa, mea culpa,\n" +
                    "mea maxima culpa.\n" +
                    "Ideo precor beatam Mariam semper Virginem,\n" +
                    "omnes Angelos et Sanctos,\n" +
                    "et vos fratres, orare pro me\n" +
                    "ad Dominum Deum nostrum.",
                    "Vyznávam všemohúcemu Bohu i vám, bratia a sestry, že som veľa zhrešil myšlienkami, slovami, skutkami a zanedbávaním dobrého. Moja vina, moja vina, moja preveľká vina. Preto prosím blahoslavenú Máriu, vždy Pannu, všetkých anjelov a svätých, i vás, bratia a sestry, modlite sa za mňa k Pánu Bohu nášmu."},
            {"Misereatur nostri omnipotens Deus et, dimissis peccatis nostris, perducat nos ad vitam aeternam.",
                    "Nech sa zmiluje nad nami všemohúci Boh, nech nám hriechy odpustí a privedie nás do života večného."},
            {"Amen.\n"},
            {"Kyrie, eleison.", "Pane, zmiluj sa."},
            {"Kyrie, eleison.", "Pane, zmiluj sa."},
            {"Christe, eleison.", "Kriste, zmiluj sa."},
            {"Christe, eleison.", "Kriste, zmiluj sa."},
            {"Kyrie, eleison.", "Pane, zmiluj sa."},
            {"Kyrie, eleison.", "Pane, zmiluj sa.\n"},
            {"Gloria in excelsis Deo et in terra\n" +
                    "pax hominibus bonae voluntatis.\n" +
                    "Laudamus te, benedicimus te,\n" +
                    "adoramus te, glorificamus te,\n" +
                    "gratias agimus tibi\n" +
                    "propter magnam gloriam tuam,\n" +
                    "Domine Deus, Rex caelestis\n" +
                    "Deus Pater omnipotens,\n" +
                    "Domine Fili unigenite, Iesu Christe,\n" +
                    "Domine Deus, Agnus Dei,\n" +
                    "Filius Patris,\n" +
                    "qui tollis peccata mundi,\n" +
                    "miserere nobis;\n" +
                    "qui tollis peccata mundi,\n" +
                    "suscipe deprecationem nostram.\n" +
                    "Qui sedes ad dexteram Patris,\n" +
                    "miserere nobis.\n" +
                    "Quoniam tu solus Sanctus,\n" +
                    "tu solus Dominus,\n" +
                    "tu solus Altissimus, Iesu Christe,\n" +
                    "cum Sancto Spiritu: in gloria Dei Patris.\n" +
                    "Amen.\n"},
            {"Verbum Domini.", "Počuli sme Božie slovo."},
            {"Deo gratias.", "Bohu vďaka.\n"},
            {"Dóminus vobiscum.", "Pán s vami."},
            {"Et cum spiritu tuo.", "I s duchom tvojím."},
            {"Lectio sancti Evangelii secundum...", "Čítanie zo svätého evanjelia podľa..."},
            {"Gloria tibi, Domine.", "Sláva tebe, Pane.\n"},
            {"Verbum Domini.", "Počuli sme slovo Pánovo."},
            {"Laus tibi, Christe.", "Chvála tebe, Kriste.\n"},
            {"Credo in unum Deum,\n" +
                    "Patrem omnipotentem,\n" +
                    "factorem caeli et terrae,\n" +
                    "visibilium omnium et invisibilium.\n" +
                    "Et in unum Dominum Iesum\n" +
                    "Christum, Filium Dei unigenitum,\n" +
                    "et ex Patre natum ante omnia saecula.\n" +
                    "Deum de Deo, lumen de lumine,\n" +
                    "Deum verum de Deo vero,\n" +
                    "genitum, non factum,\n" +
                    "consubstantialem Patri:\n" +
                    "per quem omnia facta sunt.\n" +
                    "Qui propter nos homines et propter\n" +
                    "nostram salutem descendit de caelis.\n" +
                    "Et incarnatus est de Spiritu Sancto\n" +
                    "ex Maria Virgine,\n" +
                    "et homo factus est.\n" +
                    "Crucifixus etiam pro nobis\n" +
                    "sub Pontio Pilato;\n" +
                    "passus et sepultus est,\n" +
                    "et resurrexit tertia die,\n" +
                    "secundum Scripturas,\n" +
                    "et ascendit in caelum,\n" +
                    "sedet ad dexteram Patris.\n" +
                    "Et iterum venturus est cum gloria,\n" +
                    "iudicare vivos et mortuos,\n" +
                    "cuius regni non erit finis.\n" +
                    "Et in Spiritum Sanctum,\n" +
                    "Dominum et vivificantem:\n" +
                    "qui ex Patre Filioque procedit.\n" +
                    "Qui cum Patre et Filio\n" +
                    "simul adoratur et conglorificatur:\n" +
                    "qui locutus est per prophetas.\n" +
                    "Et unam, sanctam, catholicam\n" +
                    "et apostolicam Ecclesiam.\n" +
                    "Confiteor unum baptisma\n" +
                    "in remissionem peccatorum.\n" +
                    "Et expecto\n" +
                    "resurrectionem mortuorum\n" +
                    "et vitam venturi saeculi.\n" +
                    "Amen.\n"},
            {"Benedictus es, Domine, Deus universi, quia de tua largitate accepimus panem, quem tibi offerimus, fructum terrae et operis manuum hominum, ex quo nobis fiet panis vitae.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali tento chlieb. Obetujeme ho tebe ako plod zeme a práce ľudských rúk, aby sa nám stal chlebom života."},
            {"Benedictus Deus in saecula.", "Zvelebený Boh naveky!"},
            {"Benedictus es, Domine, Deus universi, quia de tua largitate accepimus vinum, quod tibi offerimus, fructum vitis et operis manuum hominum, ex quo nobis fiet potus spiritalis.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali toto víno. Obetujeme ho tebe ako plod viniča a práce ľudských rúk, aby sa nám stalo duchovným nápojom."},
            {"Benedictus Deus in saecula.", "Zvelebený Boh naveky!\n"},
            {"Orate, fratres, ut meum ac vestrum sacrificium acceptabile fiat apud Deum Patrem omnipotentem!",
                    "Modlite sa, bratia a sestry, aby sa moja i vaša obeta zaľúbila Bohu Otcu všemohúcemu."},
            {"Suscipiat Dominus sacrificium de manibus tuis ad laudem et gloriam nominis sui, ad utilitatem quoque nostram totiusque Ecclesiae suae sanctae.",
                    "Nech Pán prijeme obetu z tvojich rúk na chválu a slávu svojho mena, na úžitok nám i celej svätej Cirkvi.\n"},
            {"Dóminus vobiscum.", "Pán s vami."},
            {"Et cum spíritu tuo.", "I s duchom tvojím."},
            {"Sursun corda.", "Hore srdcia"},
            {"Habémus ad Dóminum.", "Máme ich u Pána."},
            {"Grátias agámus Dómino Deo nostro.", "Vzdávajme vďaky Pánovi, Bohu nášmu."},
            {"Dignum et iustum est.", "Je to dôstojné a správne.\n"},
            {"Sanctus, Sanctus, Sanctus\n" +
                    "Dominus Deus Sabaoth.\n" +
                    "Pleni sunt cæli et terra gloria tua.\n" +
                    "Hosanna in excelsis.\n" +
                    "Benedictus qui venit in nomine Domini.\n" +
                    "Hosanna in excelsis.\n"},
            {"Mysterium fidei.", "Hľa, tajomstvo viery."},
            {"Mortem tuam annuntiamus, Domine, et tuam resurrectionem confitemur, donec venias.",
                    "Smrť tvoju, Pane, zvestujeme a tvoje zmŕtvychvstanie vyznávame, kým neprídeš v sláve."},
            {""},
            {"Quotiescumque manducamus panem hunc et calicem bibimus, mortem tuam annuntiamus, Domine, donec venias.",
                    "Pane, keď jeme tento chlieb a pijeme z tohto kalicha, zvestujeme tvoju smrť, kým neprídeš v sláve."},
            {""},
            {"Salvator mundi, salva nos, qui per crucem et resurrectionem tuam liberasti nos.",
                    "Spasiteľ sveta, zachráň nás, veď ty si nás vykúpil svojím krížom a zmŕtvychvstaním.\n"},
            {"Praeceptis salutaribus moniti, et divina institutione formati, audemus dicere:",
                    "Na príkaz nášho spasiteľa a podľa jeho božského učenia osmeľujeme sa povedať:"},
            {"Pater noster, qui es in caelis,\n" +
                    "sanctificetur nomen tuum,\n" +
                    "adveniat regnum tuum,\n" +
                    "fiat voluntas tua,\n" +
                    "sicut in caelo et in terra.\n" +
                    "Panem nostrum cotidianum\n" +
                    "da nobis hodie,\n" +
                    "et dimitte nobis debita nostra,\n" +
                    "sicut et nos dimittimus\n" +
                    "debitoribus nostris,\n" +
                    "et ne nos inducas in tentationem,\n" +
                    "sed libera nos a malo.\n"},
            {"Libera nos, quaesumus, Domine, ab omnibus malis, da propitius pacem in diebus nostris, ut, ope misericordiae tuae adiuti, et a peccato simus semper liberi et ab omni perturbatione securi: exspectantes beatam spem et adventum Salvatoris nostri Iesu Christi."},
            {"Quia tuum est regnum et potestas et gloria in saecula.", "Lebo tvoje je kráľovstvo a moc i sláva naveky.\n"},
            {"Domine Iesu Christe, qui dixisti Apostolis tuis: Pacem relinquo vobis, pacem meam do vobis: ne respicias peccata nostra, sed fidem Ecclesiae tuae, eamque secundum voluntatem tuam pacificare et coadunare digneris. Qui vivis et regnas in saecula saeculorum."},
            {"Amen."},
            {"Pax Domini sit semper vobiscum.", "Pokoj Pánov nech je vždy s vami."},
            {"Et cum spiritu tuo.", "I s duchom tvojím."},
            {"Offerte vobis pacem.", "Dajte si znak pokoja.\n"},
            {"Agnus Dei, qui tollis peccata mundi: miserere nobis.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Agnus Dei, qui tollis peccata mundi: miserere nobis.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Agnus Dei, qui tollis peccata mundi: dona nobis pacem.",
                    "Baránok Boží, ty snímaš hriechy sveta: daruj nám pokoj."},
            {"Ecce Agnus Dei, ecce qui tollit peccata mundi. Beati qui ad cenam Agni vocati sunt.",
                    "Hľa, Baránok Boží, ktorý sníma hriechy sveta: daruj nám pokoj."},
            {"Domine, non sum dignus ut intres sub tectum meum, sed tantum dic verbo et sanabitur anima mea.",
                    "Pane, nie som hoden, aby si vošiel pod moju strechu, ale povedz iba slovo a duša mi ozdravie."},
            {"Corpus Christi.", "Telo Kristovo."},
            {"Amen.\n"},
            {"Dominus vobiscum.", "Pán s vami."},
            {"Et cum spiritu tuo.", "I s duchom tvojím."},
            {"Benedicat vos omnipotens Deus, Pater et Filius <font color='#B71C1C'>†</font> et Spiritus Sanctus.",
                    "Nech vás žehná všemohúci Boh, Otec i Syn † i Duch Svätý."},
            {"Amen."},
            {"Ite, missa est.", "Iďte v mene Božom."},
            {"Deo gratias.", "Bohu vďaka."}
    };


    String[] Croatia_nadpis = {
            "<b>UVODNI OBREDI – ÚVODNÉ OBRADY</b><br><br>ULAZNA PJESMA – ÚVODNÝ SPEV",
            "SLAVA BOGU – GLÓRIA",
            "ZBORNA MOLITVA – MODLIDBA DŇA<br><br><b>SLUŽBA RIJEČI – LITURGIA SLOVA</b><br><br>ČITANJE – ČÍTANIE<br>Po prečítaní čítania:",
            "EVANVANĐELJA - EVANJELIUM",
            "Po prečítaní evanjelia:",
            "NICEJSKO-CARIGRADSKO VJEROVANJE – VYZNANIE VIERY",
            "VJERNIČKA MOLITVA – SPOLOČNÉ MODLITBY VERIACICH<br><br><b>EUHARISTIJSKA SLUŽBA – LITURGIA EUCHARISTIE</b><br>",
            "DAROVNA MOLITVA – MODLITBA NAD OBETNÝMI DARMI.<br><br>PREFÁCIA",
            "EUHARISTIJSKA MOLITVA– EUCHARISTICKÁ MODLITBA<br>Po premenení:",
            "OBRED PRIČESTI – OBRAD PRIJÍMANIA",
            "JAGABJČE BOŽJI – BARÁNOK BOŽÍ",
            "Popričesna molitva– MODLITBA PO PRIJÍMANÍ<br><br><b>ZAVRŠNI OBRED - ZÁVEREČNÉ OBRADY</b><br>"
    };

    String[][] Croatia_vypis = {
            {"U ime Oca i Sina i Duha Svetoga.", "V mene Otca i Syna i Ducha Svätého."},
            {"Amen."},
            {"Mir vama.", "Pán s vami"},
            {"I s duhom tvojim.", "I s duchom Tvojím.\n"},
            {"Braćo i sestre, priznajmo svoje grijehe da mognemo proslaviti sveta otajstva.",
                    "Bratia a sestry, uznajme svoje hriechy, aby sme mohli s čistým srdcom sláviť sväté tajomstvá."},
            {"I spovijedam se Bogu svemogućemu\n" +
                    "i vama, braćo, da sagriješih vrlo mnogo\n" +
                    "mišlju, riječju,\n" +
                    "djelom i propustom:\n" +
                    "moj grijeh, moj grijeh,\n" +
                    "moj preveliki grijeh.\n" +
                    "zato molim blaženu Mariju vazda Djevicu,\n" +
                    "sve anđele i svete,\n" +
                    "i vas braćo, da se molite za me\n" +
                    "Gospodinu, Bogu našemu.",
                    "Vyznávam všemohúcemu Bohu i vám, bratia a sestry, že som veľa zhrešil myšlienkami, slovami, skutkami a zanedbávaním dobrého. Moja vina, moja vina, moja preveľká vina. Preto prosím blahoslavenú Máriu, vždy Pannu, všetkých anjelov a svätých, i vás, bratia a sestry, modlite sa za mňa k Pánu Bohu nášmu."},
            {"Smilovao nam se svemogući Bog, otpustio nam grijehe naše i priveo nas u život vječni.",
                    "Nech sa zmiluje nad nami všemohúci Boh, nech nám hriechy odpustí a privedie nás do života večného."},
            {"Amen.\n"},
            {"Gospodine, smiluj se.", "Pane, zmiluj sa."},
            {"Gospodine, smiluj se.", "Pane, zmiluj sa."},
            {"Kriste, smiluj se.", "Kriste, zmiluj sa."},
            {"Kriste, smiluj se.", "Kriste, zmiluj sa."},
            {"Gospodine, smiluj se.", "Pane, zmiluj sa."},
            {"Gospodine, smiluj se.", "Pane, zmiluj sa.\n"},
            {"Slava Bogu na visini.\n" +
                    "I na zemlji mir ljudima dobre volje.\n" +
                    "Hvalimo te. Blagoslivljamo te.\n" +
                    "Klanjamo ti se. Slavimo te.\n" +
                    "Zahvaljujemo ti radi velike slave tvoje.\n" +
                    "Gospodine Bože, Kralju nebeski,\n" +
                    "Bože Oče svemogući.\n" +
                    "Gospodine Sine jedinorođeni, Isuse Kriste.\n" +
                    "Gospodine Bože, Jaganjče Božji, Sine Očev.\n" +
                    "Koji oduzimaš grijehe svijeta, smiluj nam se.\n" +
                    "Koji oduzimaš grijehe svijeta, primi našu molitvu.\n" +
                    "Koji sjediš s desne Ocu, smiluj nam se.\n" +
                    "Jer ti si jedini svet.\n" +
                    "Ti si jedini Gospodin.\n" +
                    "Ti si jedini Svevišnji, Isuse Kriste.\n" +
                    "Sa Svetim Duhom, u slavi Boga Oca.\n" +
                    "Amen.\n"},
            {"Riječ Gospodnja.", "Počuli sme Božie slovo."},
            {"Bogu hvala.", "Bohu vďaka.\n"},
            {"Gospodin s vama.", "Pán s vami."},
            {"I s duhom tvojim.", "I s duchom tvojím."},
            {"Čitanje svetog evanđelja po...", "Čítanie zo svätého evanjelia podľa..."},
            {"Slava tebi, Gospodine.", "Sláva tebe, Pane.\n"},
            {"Riječ Gospodnja.", "Počuli sme slovo Pánovo."},
            {"Slava tebi, Kriste.", "Chvála tebe, Kriste.\n"},
            {"Veujem u jednoga Boga.\n" +
                    "Oca svemogućega, stvoritelja neba i zemlje,\n" +
                    "svega vidljivoga i nevidljivoga.\n" +
                    "I u jednoga Gospodina Isusa Krista,\n" +
                    "jedinorođenoga Sina Božjega.\n" +
                    "Rođenog od Oca prije svih vjekova.\n" +
                    "Boga od Boga, svjetlo od svjetla,\n" +
                    "pravoga Boga od pravoga Boga.\n" +
                    "Rođena , ne stvorena, istobitna s Ocem,\n" +
                    "po kome je sve stvoreno.\n" +
                    "Koji je radi nas ljudi i radi našega spasenja\n" +
                    "sišao s nebesa.\n" +
                    "I utjelovio se po Duhu Svetomu od Marije Djevice:\n" +
                    "i postao čovjekom.\n" +
                    "Raspet također za nas:\n" +
                    "Pod Poncijem Pilatom mučen i pokopan.\n" +
                    "I uskrsnuo treći dan po Svetom Pismu.\n" +
                    "I uzašao na nebo: sjedi s desna Ocu.\n" +
                    "I opet će doći u slavi suditi žive i mrtve,\n" +
                    "i njegovu kraljevstvu neće biti kraja.\n" +
                    "I u Duha Svetoga, Gospodina i životvorca;\n" +
                    "koji izlazi od Oca i Sina.\n" +
                    "Koji se s Ocem i Sinom skupa časti i zajedno slavi;\n" +
                    "koji je govorio po prorocima.\n" +
                    "I u jednu svetu katoličku i apostolsku Crkvu.\n" +
                    "Ispovijedam jedno krštenje za oproštenje grijeha.\n" +
                    "I isčekujem uskrsnuće mrtvih.\n" +
                    "I život budućega vijeka.\n" +
                    "Amen.\n"},
            {"Blagoslovljen si, Gospodine, Bože svega svijeta: od tvoje darežljivosti primismo kruh što ti ga prinosimo; ovaj plod zemlje i rada ruku čovječjih postat će nam kruhom života.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali tento chlieb. Obetujeme ho tebe ako plod zeme a práce ľudských rúk, aby sa nám stal chlebom života."},
            {"Blagoslovljen Bog u vijeke!", "Zvelebený Boh naveky!"},
            {"Blagoslovljen si, Gospodine, Bože svega svijeta: od tvoje darežljivosti primismo vino što ti ga prinosimo; ovaj plod trsa i rada ruku čovječjih postat će nam piće duhovno.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali toto víno. Obetujeme ho tebe ako plod viniča a práce ľudských rúk, aby sa nám stalo duchovným nápojom."},
            {"Blagoslovljen Bog u vijeke!", "Zvelebený Boh naveky!\n"},
            {"Molite, braćo i sestre, da moja i vaša žrtva bude ugodna Bogu Ocu svemogućemu.",
                    "Modlite sa, bratia a sestry, aby sa moja i vaša obeta zaľúbila Bohu Otcu všemohúcemu."},
            {"Primio Gospodin žrtvu iz tvojih ruku na hvalu i slavu svojega imena, i na korist nama i čitavoj svojoj svetoj Crkvi.",
                    "Nech Pán prijeme obetu z tvojich rúk na chválu a slávu svojho mena, na úžitok nám i celej svätej Cirkvi.\n"},
            {"Gospodin s vama.", "Pán s vami."},
            {"I s duhom tvojim.", "I s duchom tvojím."},
            {"Gore srca.", "Hore srdcia"},
            {"Imamo kod Gospodina.", "Máme ich u Pána."},
            {"Hvalu dajmo Gospodinu Bogu našemu.", "Vzdávajme vďaky Pánovi, Bohu nášmu."},
            {"Dostojno je i pravedno.", "Je to dôstojné a správne.\n"},
            {"Svet, svet, svet\n" +
                    "Gospodin Bog Sabaot.\n" +
                    "Puna su nebesa i zemlja tvoje slave.\n" +
                    "Hosana u visini.\n" +
                    "Blagoslovljen koji dolazi u ime Gospodnje.\n" +
                    "Hosana u visini.\n"},
            {"Tajna vjere:", "Hľa, tajomstvo viery."},
            {"Tvoju smrt, Gospodine, naviještamo, tvoje uskrsnuće slavimo, tvoj slavni dolazak iščekujemo.",
                    "Smrť tvoju, Pane, zvestujeme a tvoje zmŕtvychvstanie vyznávame, kým neprídeš v sláve."},
            {""},
            {"Kad god blagujemo ovaj kruh i pijemo kalež tvoju smrt, Gospodine, naviještamo, tvoj slavni dolazak iščekujemo. ",
                    "Pane, keď jeme tento chlieb a pijeme z tohto kalicha, zvestujeme tvoju smrť, kým neprídeš v sláve."},
            {""},
            {"Spasi nas. Spasitelju svijeta, koji si nas svojim križem i uskrsnućem oslobodio.",
                    "Spasiteľ sveta, zachráň nás, veď ty si nás vykúpil svojím krížom a zmŕtvychvstaním.\n"},
            {"Spasonosnim zapovijedima potaknuti i božanskim naukom poučeni usuđujemo se govoriti:",
                    "Na príkaz nášho spasiteľa a podľa jeho božského učenia osmeľujeme sa povedať:"},
            {"Oče naš, koji jesi na nebesima,\n" +
                    "sveti se ime tvoje,\n" +
                    "dođi kraljevstvo tvoje,\n" +
                    "budi volja tvoja, kako na nebu tako i na zemlji.\n" +
                    "Kruh naš svagdanji daj nam danas.\n" +
                    "I otpusti nam duge naše\n" +
                    "kako i mi otpuštamo dužnicima našim.\n" +
                    "I ne uvedi nas u napast,\n" +
                    "nego izbavi nas od zla.\n"},
            {"I zbavi nas, molimo, Gospodine, od svih zala, daj milostivo mir u naše dane, da s pomoću tvoga milosrđa budemo svagda i slobodni od grijeha i sigurni od sviju nereda: čekajući blaženu nadu: dolazak Spasitelja našega Isusa Krista."},
            {"Jer tvoje je kraljevstvo i slava i moć  u vjekove.", "Lebo tvoje je kráľovstvo a moc i sláva naveky.\n"},
            {"ospodine Isuse Kriste, ti si rekao svojim apostolima: mir vam ostavljam, mir vam svoj dajem; molimo, ne gledaj naše grijehe, nego vjeru svoje Crkve; daruj joj mir i jedinstvo kako je volja tvoja. Koji živiš i kraljuješ u vijeke vjekova."},
            {"Amen."},
            {"Mir Gospodnji bio vazda s vama.", "Pokoj Pánov nech je vždy s vami."},
            {"I s duhom tvojim.", "I s duchom tvojím."},
            {"Pružite mir jedni drugima.", "Dajte si znak pokoja.\n"},
            {"Jaganjče Božji, koji oduzimaš grijehe svijeta, smiluj nam se.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Jaganjče Božji, koji oduzimaš grijehe svijeta, smiluj nam se.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Jaganjče Božji, koji oduzimaš grijehe svijeta, daruj nam mir.",
                    "Baránok Boží, ty snímaš hriechy sveta: daruj nám pokoj."},
            {"Evo Jaganjca Božjeg, evo onoga koji oduzima grijehe svijeta. Blago onima koji su pozvani na gozbu Jaganjčevu.",
                    "Hľa, Baránok Boží, ktorý sníma hriechy sveta: daruj nám pokoj."},
            {"Gospodine, nisam dostojan da uniđeš pod krov moj, nego samo reci riječ   i ozdravit će duša moja.",
                    "Pane, nie som hoden, aby si vošiel pod moju strechu, ale povedz iba slovo a duša mi ozdravie."},
            {"Tijelo Kristovo.", "Telo Kristovo."},
            {"Amen.\n"},
            {"Gospodin s vama.", "Pán s vami."},
            {"I s duhom tvojim.", "I s duchom tvojím."},
            {"Blagoslovio vas Svemogući Bog, Otac i Sin i <font color='#B71C1C'>†</font> Duh Sveti.",
                    "Nech vás žehná všemohúci Boh, Otec i Syn † i Duch Svätý."},
            {"Amen."},
            {"Idite u miru.", "Iďte v mene Božom."},
            {"Bogu hvala.", "Bohu vďaka."}
    };
    String[] Polish_nadpis = {
            "<b>OBRZĘDY WSTĘPNE– ÚVODNÉ OBRADY</b><br><br>OBRZĘDY WSTĘPNE – ÚVODNÝ SPEV",
            "CHWAŁA– GLÓRIA",
            "MODLITWA DNIA – MODLIDBA DŇA<br><br><b>LITURGIA SŁOWA – LITURGIA SLOVA</b><br><br>CZYTANIE – ČÍTANIE<br>Po prečítaní čítania:",
            "EWANGELIĘ - EVANJELIUM",
            "Po prečítaní evanjelia:",
            "WYZNANIE WIARY– VYZNANIE VIERY",
            "MODLITWA POWSZECHNA – SPOLOČNÉ MODLITBY VERIACICH<br><br><b>LITURGIA EUCHARYSTYCZNA – LITURGIA EUCHARISTIE</b><br>",
            "MODLITWA NAD DARAMI – MODLITBA NAD OBETNÝMI DARMI.<br><br> PREFACJA – PREFÁCIA",
            "MODLITWA EUCHARYSTYCZNA – EUCHARISTICKÁ MODLITBA<br>Po premenení:",
            "OBRZĘDY KOMUNII – OBRAD PRIJÍMANIA",
            "BARANKU BOŽY – BARÁNOK BOŽÍ",
            "MODLITWA PO KOMUNII – MODLITBA PO PRIJÍMANÍ<br><br><b>OBRZĘDY ZAKOŃCZENIA - ZÁVEREČNÉ OBRADY</b><br>"
    };

    String[][] Polish_vypis = {
            {"W imię Ojca i Syna, i Ducha Świętego.", "V mene Otca i Syna i Ducha Svätého."},
            {"Amen."},
            {"Pan z wami.", "Pán s vami."},
            {"I z duchem twoim.", "I s duchom Tvojím.\n"},
            {"Przeprośmy Boga za nasze grzechy, abyśmy mogli godnie przyjąć słowo Boże i złożyć Najświętszą Ofiarę.",
                    "Bratia a sestry, uznajme svoje hriechy, aby sme mohli s čistým srdcom sláviť sväté tajomstvá."},
            {"Spowiadam się Bogu wszechmogącemu\n" +
                    "i wam bracia i siostry,\n" +
                    "że bardzo zgrzeszyłem\n" +
                    "myślą, mową, uczynkiem i zaniedbaniem:\n" +
                    "moja wina, moja wina,\n" +
                    "moja bardzo wielka wina.\n" +
                    "Przeto błagam Najświętszą Maryję,\n" +
                    "zawsze Dziewicę wszystkich\n" +
                    "Aniołów i Świętych\n" +
                    "i was, bracia i siostry, o modlitwę za mnie\n" +
                    "do Pana Boga naszego.",
                    "Vyznávam všemohúcemu Bohu i vám, bratia a sestry, že som veľa zhrešil myšlienkami, slovami, skutkami a zanedbávaním dobrého. Moja vina, moja vina, moja preveľká vina. Preto prosím blahoslavenú Máriu, vždy Pannu, všetkých anjelov a svätých, i vás, bratia a sestry, modlite sa za mňa k Pánu Bohu nášmu."},
            {"Niech się zmiłuje nad nami Bóg wszechmogący i odpuściwszy nam grzechy doprowadzi nas do życia wiecznego.",
                    "Nech sa zmiluje nad nami všemohúci Boh, nech nám hriechy odpustí a privedie nás do života večného."},
            {"Amen.\n"},
            {"Panie zmiłuj się nad nami.", "Pane, zmiluj sa."},
            {"Panie zmiłuj się nad nami.", "Pane, zmiluj sa."},
            {"Chryste zmiłuj się nad nami. ", "Kriste, zmiluj sa."},
            {"Chryste zmiłuj się nad nami. ", "Kriste, zmiluj sa."},
            {"Panie zmiłuj się nad nami.", "Pane, zmiluj sa."},
            {"Panie zmiłuj się nad nami.", "Pane, zmiluj sa.\n"},
            {"Chwała na wysokości Bogu\n" +
                    "a na ziemi pokój ludziom dobrej woli.\n" +
                    "Chwalimy Cię. Błogosławimy Cię,\n" +
                    "Wielbimy Cię. Wysławiamy Cię.\n" +
                    "Dzięki Ci składamy,\n" +
                    "bo wielka jest chwała Twoja.\n" +
                    "Panie Boże, Królu nieba,\n" +
                    "Boże Ojcze wszechmogący.\n" +
                    "Panie, Synu Jednorodzony, Jezu Chryste.\n" +
                    "Panie Boże, Baranku Boży, Synu Ojca.\n" +
                    "Który gładzisz grzechy świata,\n" +
                    "zmiłuj się nad nami.\n" +
                    "Który gładzisz grzechy świata,\n" +
                    "przyjm błaganie nasze.\n" +
                    "Który siedzisz po prawicy Ojca,\n" +
                    "zmiłuj się nad nami.\n" +
                    "Albowiem tylko Tyś jest święty.\n" +
                    "Tylko Tyś jest Panem.\n" +
                    "Tylko Tyś Najwyższy, Jezu Chryste.\n" +
                    "Z Duchem Świętym w chwale Boga Ojca.\n" +
                    "Amen.\n"},
            {"Oto słowo Boże.", "Počuli sme Božie slovo."},
            {"Bogu niech będą dzięki.", "Bohu vďaka.\n"},
            {"Pan z wami.", "Pán s vami."},
            {"I z duchem twoim.", "I s duchom tvojím."},
            {"Słowa Ewangelii według świętego...", "Čítanie zo svätého evanjelia podľa..."},
            {"Chwała Tobie, Panie.", "Sláva tebe, Pane.\n"},
            {"Oto słowo Pańskie.", "Počuli sme slovo Pánovo."},
            {"Chwała Tobie, Chryste.", "Chvála tebe, Kriste.\n"},
            {"Wierzę w jednego Boga,\n" +
                    "Ojca wszechmogącego,\n" +
                    "Stworzyciela nieba i ziemi,\n" +
                    "wszystkich rzeczy widzialnych i niewidzialnych.\n" +
                    "I w jednego Pana Jezusa Chrystusa,\n" +
                    "Syna Bożego Jednorodzonego,\n" +
                    "który z Ojca jest zrodzony\n" +
                    "przed wszystkimi wiekami.\n" +
                    "Bóg z Boga, Światłość ze Światłości,\n" +
                    "Bóg prawdziwy z Boga prawdziwego.\n" +
                    "Zrodzony a nie stworzony,\n" +
                    "współistotny Ojcu,\n" +
                    "a przez Niego wszystko się stało.\n" +
                    "On to dla nas ludzi i dla naszego zbawienia\n" +
                    "zstąpił z nieba.\n" +
                    "I za sprawą Ducha Świętego\n" +
                    "przyjął ciało z Maryi Dziewicy\n" +
                    "i stał się człowiekiem.\n" +
                    "Ukrzyżowany również za nas,\n" +
                    "pod Poncjuszem Piłatem\n" +
                    "został umęczony i pogrzebany.\n" +
                    "i zmartwychwstał trzeciego dnia,\n" +
                    "jak oznajmia Pismo.\n" +
                    "I wstąpił do nieba; siedzi po prawicy Ojca.\n" +
                    "I powtórnie przyjdzie w chwale\n" +
                    "sądzić żywych i umarłych,\n" +
                    "a Królestwu Jego nie będzie końca.\n" +
                    "Wierzę w Ducha Świętego, Pana i Ożywiciela,\n" +
                    "który od Ojca i Syna pochodzi.\n" +
                    "Który z Ojcem i Synem wspólnie\n" +
                    "odbiera uwielbienie i chwalę;\n" +
                    "który mówił przez Proroków\n" +
                    "Wierzę w jeden, święty,\n" +
                    "powszechny i apostolski Kościół.\n" +
                    "wyznaję jeden chrzest\n" +
                    "na odpuszczenie grzechów\n" +
                    "I oczekuję wskrzeszenia umarłych.\n" +
                    "I życia wiecznego w przyszłym świecie.\n" +
                    "Amen.\n"},
            {"Błogosławiony jesteś, Panie, Boże wszechświata, bo dzięki Twojej hojności otrzymaliśmy chleb, który jest owocem ziemi i pracy rąk ludzkich; Tobie go przynosimy, aby stał się dla nas chlebem życia.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali tento chlieb. Obetujeme ho tebe ako plod zeme a práce ľudských rúk, aby sa nám stal chlebom života."},
            {"Błogosławiony jesteś, Boże, teraz i na wieki.", "Zvelebený Boh naveky!"},
            {"Błogosławiony jesteś, Panie, Boże wszechświata, bo dzięki Twojej hojności otrzymaliśmy wino, które jest owocem winnego krzewu i pracy rąk ludzkich; Tobie je przynosimy, aby staro się dla nas napojem duchowym.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali toto víno. Obetujeme ho tebe ako plod viniča a práce ľudských rúk, aby sa nám stalo duchovným nápojom."},
            {"Błogosławiony jesteś, Boże, teraz i na wieki.", "Zvelebený Boh naveky!\n"},
            {"Módlcie się, aby moją i waszą Ofiarę przyjął Bóg, Ojciec wszechmogący.",
                    "Modlite sa, bratia a sestry, aby sa moja i vaša obeta zaľúbila Bohu Otcu všemohúcemu."},
            {"Niech Pan przyjmie Ofiarę z rąk twoich na cześć i chwałę swojego imienia, a także na pożytek nasz i całego Kościoła świętego.",
                    "Nech Pán prijeme obetu z tvojich rúk na chválu a slávu svojho mena, na úžitok nám i celej svätej Cirkvi.\n"},
            {"Pan z wami.", "Pán s vami."},
            {"I z duchem twoim.", "I s duchom tvojím."},
            {"W górę serca.", "Hore srdcia"},
            {"Wznosimy je do Pana.", "Máme ich u Pána."},
            {"Dzięki składajmy Panu Bogu naszemu.", "Vzdávajme vďaky Pánovi, Bohu nášmu."},
            {"Godne to i sprawiedliwe.", "Je to dôstojné a správne.\n"},
            {"Święty, Święty, Święty,\n" +
                    "Pan Bóg zastępów\n" +
                    "Pełne są niebiosa i ziemia chwały Twojej.\n" +
                    "Hosanna na wysokości.\n" +
                    "Błogosławiony, który idzie w imię Pańskie.\n" +
                    "Hosanna na wysokości.\n"},
            {"Oto wielka tajemnica wiary.", "Hľa, tajomstvo viery."},
            {"Głosimy śmierć Twoją, Panie Jezu, wyznajemy Twoje zmartwychwstanie i oczekujemy Twego przyjścia w chwale.",
                    "Smrť tvoju, Pane, zvestujeme a tvoje zmŕtvychvstanie vyznávame, kým neprídeš v sláve."},
            {""},
            {"Ile razy ten chleb spożywamy i pijemy z tego kielicha, głosimy śmierć Twoją, Panie, oczekując Twojego przyjścia w chwale.",
                    "Pane, keď jeme tento chlieb a pijeme z tohto kalicha, zvestujeme tvoju smrť, kým neprídeš v sláve."},
            {""},
            {"Panie, Ty nas wybawiłeś przez krzyż i zmartwychwstanie swoje, Ty jesteś Zbawicielem świata.",
                    "Spasiteľ sveta, zachráň nás, veď ty si nás vykúpil svojím krížom a zmŕtvychvstaním."},

            {"Pouczeni przez Zbawiciela i posłuszni Jego słowom, ośmielamy się mówić:",
                    "Na príkaz nášho spasiteľa a podľa jeho božského učenia osmeľujeme sa povedať:"},
            {"Ojcze nasz, któryś jest w niebie:\n" +
                    "święć się imię Twoje,\n" +
                    "przyjdź Królestwo Twoje,\n" +
                    "bądź wola Twoja\n" +
                    "jako w niebie, tak i na ziemi.\n" +
                    "Chleba naszego powszedniego\n" +
                    "daj nam dzisiaj.\n" +
                    "I odpuść nam nasze winy,\n" +
                    "jako i my odpuszczamy\n" +
                    "naszym winowajcom.\n" +
                    "I nie wódź nas na pokuszenie,\n" +
                    "ale nas zbaw ode złego.\n"},
            {"Wybaw nas, Panie, od zła wszelkiego i obdarz nasze czasy pokojem. Wspomóż nas w swoim miłosierdziu, abyśmy zawsze wolni od grzechu i bezpieczni od wszelkiego zamętu, pełni nadziei oczekiwali przyjścia naszego Zbawiciela, Jezusa Chrystusa."},
            {"Bo Twoje jest królestwo i potęga, i chwała na wieki.", "Lebo tvoje je kráľovstvo a moc i sláva naveky.\n"},
            {"Panie Jezu Chryste, Ty powiedziałeś swoim Apostołom: Pokój wam zostawiam, pokój mój wam daję. Prosimy Cię, nie zważaj na grzechy nasze, lecz na wiarę swojego Kościoła i zgodnie z Twoją wolą napełniaj go pokojem i doprowadź do pełnej jedności. Który żyjesz i królujesz na wieki wieków."},
            {"Amen."},
            {"Pokój Pański niech zawsze będzie z wami.", "Pokoj Pánov nech je vždy s vami."},
            {"I z duchem twoim.", "I s duchom tvojím."},
            {"Przekażcie sobie znak pokoju.", "Dajte si znak pokoja.\n"},
            {"Baranku Boży, który gładzisz grzechy świata, zmiłuj się nad nami.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Baranku Boży, który gładzisz grzechy świata, zmiłuj się nad nami.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Baranku Boży, który gładzisz grzechy świata, obdarz nas pokojem.",
                    "Baránok Boží, ty snímaš hriechy sveta: daruj nám pokoj."},
            {"Oto Baranek Boży, który gładzi grzechy świata. Błogosławieni, którzy zostali wezwani na Jego ucztę.",
                    "Hľa, Baránok Boží, ktorý sníma hriechy sveta: daruj nám pokoj."},
            {"Panie, nie jestem godzien, abyś przyszedł do mnie, ale powiedz tylko słowo, a będzie uzdrowiona dusza moja.",
                    "Pane, nie som hoden, aby si vošiel pod moju strechu, ale povedz iba slovo a duša mi ozdravie."},
            {"Ciało Chrystusa.", "Telo Kristovo."},
            {"Amen.\n"},
            {"Pan z wami.", "Pán s vami."},
            {"I z duchem twoim", "I s duchom tvojím."},
            {"Niech was błogosławi Bóg wszechmogący, Ojciec i Syn, <font color='#B71C1C'>†</font> i Duch Święty.",
                    "Nech vás žehná všemohúci Boh, Otec i Syn † i Duch Svätý."},
            {"Amen."},
            {"Idźcie w pokoju Chrystusa.", "Iďte v mene Božom."},
            {"Bogu niech będą dzięki.", "Bohu vďaka."},
            //Bonusove časti
            {"Wielka jest tajemnica naszej wiary", "Vyznajme Tajomstvo viery"},
            {"Uwielbiajmy tajemnicę wiary.", "Veľké je tajomstvo viery."},
            {""},
            {"Tajemnica wiary."},
            {"Chrystus umarł, Chrystus zmartwychwstał, Chrystus powróci\n"}
    };

    String[] Italy_nadpis = {
            "<b>RITI DI INTRODUZIONE – ÚVODNÉ OBRADY</b><br><br>CANTO D´INIGRESSO – ÚVODNÝ SPEV",
            "GLORIA – GLÓRIA",
            "ORAZIONE – MODLIDBA DŇA<br><br><b>LITURGIA DELLA PAROLA – LITURGIA SLOVA</b><br><br>LETTURA – ČÍTANIE<br>Po prečítaní čítania:",
            "VANGELO - EVANJELIUM",
            "Po prečítaní evanjelia:",
            "CREDO – VYZNANIE VIERY",
            "PREGHIERA DEI FEDELI – SPOLOČNÉ MODLITBY VERIACICH<br><br><b>LITURGIA EUCARISTICA – LITURGIA EUCHARISTIE</b><br>",
            "ORAZIONE SULLE OFFERTE – MODLITBA NAD OBETNÝMI DARMI.<br><br>PREFAZIO – PREFÁCIA",
            "PREGHIERA EUCARISTICA – EUCHARISTICKÁ MODLITBA<br>Po premenení:",
            "RITI DI COMUNIONE – OBRAD PRIJÍMANIA",
            "AGNELLO DI DIO – BARÁNOK BOŽÍ",
            "ORAZIONE DOPO LA COMUNIONE – MODLITBA PO PRIJÍMANÍ<br><br><b>RITI DI CONCLUSIONE - ZÁVEREČNÉ OBRADY</b><br>"
    };

    String[][] Italy_vypis = {
            {"Nel nome del Padre del Figlio e dello Spirito Santo.", "V mene Otca i Syna i Ducha Svätého."},
            {"Amen."},
            {"Il Signore sia con voi.", "Pán s vami."},
            {"E con il tuo spirito.", "I s duchom Tvojím.\n"},
            {"Fratelli, per celebrare degnamente i santi misteri, riconosciamo i nostri peccati.",
                    "Bratia a sestry, uznajme svoje hriechy, aby sme mohli s čistým srdcom sláviť sväté tajomstvá."},
            {"Confesso a Dio onnipotente\n" +
                    "e a voi, fratelli, \n" +
                    "che ho molto peccato\n" +
                    "in pensieri, parole, \n" +
                    "opere e omissioni, \n" +
                    "per mia colpa, mia colpa, \n" +
                    "mia grandissima colpa. \n" +
                    "E supplico\n" +
                    "la beata sempre vergine Maria, \n" +
                    "gli angeli, i santi\n" +
                    "e voi, fratelli, \n" +
                    "di pregare per me\n" +
                    "il Signore Dio nostro.",
                    "Vyznávam všemohúcemu Bohu i vám, bratia a sestry, že som veľa zhrešil myšlienkami, slovami, skutkami a zanedbávaním dobrého. Moja vina, moja vina, moja preveľká vina. Preto prosím blahoslavenú Máriu, vždy Pannu, všetkých anjelov a svätých, i vás, bratia a sestry, modlite sa za mňa k Pánu Bohu nášmu."},
            {"Dio onnipotente abbia misericordia di noi, perdoni i nostri peccati e ci conduca alla vita eterna.",
                    "Nech sa zmiluje nad nami všemohúci Boh, nech nám hriechy odpustí a privedie nás do života večného."},
            {"Amen.\n"},
            {"Signore, pietà.", "Pane, zmiluj sa."},
            {"Signore, pietà.", "Pane, zmiluj sa."},
            {"Cristo, pietà.", "Kriste, zmiluj sa."},
            {"Cristo, pietà.", "Kriste, zmiluj sa."},
            {"Signore, pietà.", "Pane, zmiluj sa."},
            {"Signore, pietà.", "Pane, zmiluj sa.\n"},
            {"Gloria a Dio nell'alto dei cieli\n" +
                    "e pace in terra agli uomini\n" +
                    "di buona volontà.\n" +
                    "Noi ti lodiamo, ti benediciamo,\n" +
                    "ti adoriamo, ti glorifichiamo,\n" +
                    "ti rendiamo grazie\n" +
                    "per la tua gloria immensa,\n" +
                    "Signore Dio, Re del cielo,\n" +
                    "Dio Padre onnipotente.\n" +
                    "Signore, Figlio unigenito,\n" +
                    "Gesù Cristo,\n" +
                    "Signore Dio, Agnello di Dio,\n" +
                    "Figlio del Padre;\n" +
                    "tu che togli i peccati del mondo,\n" +
                    "abbi pietà di noi;\n" +
                    "tu che togli i peccati del mondo,\n" +
                    "accogli la nostra supplica;\n" +
                    "tu che siedi alla destra del Padre,\n" +
                    "abbi pietà di noi.\n" +
                    "Perché tu solo il Santo,\n" +
                    "tu solo il Signore,\n" +
                    "tu solo l'Altissimo:\n" +
                    "Gesù Cristo, con lo Spirito Santo\n" +
                    "nella gloria di Dio Padre.\n" +
                    "Amen.\n"},
            {"Parola di Dio.", "Počuli sme Božie slovo."},
            {"Rendiamo grazie a Dio.", "Bohu vďaka.\n"},
            {"Il Signore sia con voi.", "Pán s vami."},
            {"E con il tuo spirito.", "I s duchom tvojím."},
            {"Dal Vangelo secondo...", "Čítanie zo svätého evanjelia podľa..."},
            {"Gloria a te, o Signore.", "Sláva tebe, Pane.\n"},
            {"Parola del Signore.", "Počuli sme slovo Pánovo."},
            {"Lode a te, o Cristo.", "Chvála tebe, Kriste.\n"},
            {"Credo in un solo Dio,\n" +
                    "Padre onnipotente,\n" +
                    "creatore del cielo e della terra,\n" +
                    "di tutte le cose visibili e invisibili.\n" +
                    "Credo in un solo Signore,\n" +
                    "Gesù Cristo,\n" +
                    "unigenito Figlio di Dio,\n" +
                    "nato dal Padre prima di tutti i secoli.\n" +
                    "Dio da Dio, Luce da Luce,\n" +
                    "Dio vero da Dio vero;\n" +
                    "generato, non creato;\n" +
                    "della stessa sostanza del Padre;\n" +
                    "per mezzo di lui\n" +
                    "tutte le cose sono state create.\n" +
                    "Per noi uomini e per la nostra\n" +
                    "salvezza discese dal cielo;\n" +
                    "e per opera dello Spirito Santo\n" +
                    "si é incarnato nel seno\n" +
                    "della Vergine Maria\n" +
                    "e si é fatto uomo.\n" +
                    "Fu crocifisso per noi\n" +
                    "sotto Ponzio Pilato,\n" +
                    "morì e fu sepolto.\n" +
                    "Il terzo giorno é risuscitato,\n" +
                    "secondo le Scritture;\n" +
                    "é salito al cielo,\n" +
                    "siede alla destra del Padre.\n" +
                    "E di nuovo verrà, nella gloria,\n" +
                    "per giudicare i vivi e i morti,\n" +
                    "e il suo regno non avrà fine.\n" +
                    "Credo nello Spirito Santo,\n" +
                    "che é Signore e da la vita,\n" +
                    "e procede dal Padre e dal Figlio\n" +
                    "e con il Padre e il Figlio\n" +
                    "é adorato e glorificato\n" +
                    "e ha parlato per mezzo dei profeti.\n" +
                    "Credo la Chiesa,\n" +
                    "una, santa, cattolica e apostolica.\n" +
                    "Professo un solo battesimo\n" +
                    "per il perdono dei peccati.\n" +
                    "Aspetto la risurrezione dei morti\n" +
                    "e la vita del mondo che verrà.\n" +
                    "Amen.\n"},
            {"Benedetto sei tu, Signore, Dio dell'universo: dalla tua bontà abbiamo ricevuto questo pane, frutto della terra e del lavoro dell'uomo; lo presentiamo a te, perché diventi per noi cibo di vita eterna.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali tento chlieb. Obetujeme ho tebe ako plod zeme a práce ľudských rúk, aby sa nám stal chlebom života."},
            {"Benedetto nei secoli il Signore.", "Zvelebený Boh naveky!"},
            {"Benedetto sei tu, Signore, Dio dell'universo: dalla tua bontà abbiamo ricevuto questo vino, frutto della terra, e del lavoro dell'uomo; lo presentiamo a te, perché diventi per noi bevanda di salvezza.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali toto víno. Obetujeme ho tebe ako plod viniča a práce ľudských rúk, aby sa nám stalo duchovným nápojom."},
            {"Benedetto nei secoli il Signore.", "Zvelebený Boh naveky!\n"},
            {"Pregate, fratelli, perché il mio e vostro sacrificio sia gradito a Dio, Padre onnipotente.",
                    "Modlite sa, bratia a sestry, aby sa moja i vaša obeta zaľúbila Bohu Otcu všemohúcemu."},
            {"Il Signore riceva dalle tue mani questo sacrificio a lode e gloria del suo nome, per il bene nostro e di tutta la sua santa Chiesa.",
                    "Nech Pán prijeme obetu z tvojich rúk na chválu a slávu svojho mena, na úžitok nám i celej svätej Cirkvi.\n"},
            {"Il Signore sia con voi.", "Pán s vami."},
            {"E con il tuo spirito.", "I s duchom tvojím."},
            {"In alto i nostri cuori.", "Hore srdcia"},
            {"Sono rivolti al Signore.", "Máme ich u Pána."},
            {"Rendiamo grazie al Signore, nostro Dio.", "Vzdávajme vďaky Pánovi, Bohu nášmu."},
            {"É cosa buona e giusta.", "Je to dôstojné a správne.\n"},
            {"Santo, Santo, Santo\n" +
                    "il Signore Dio dell'universo.\n" +
                    "I cieli e la terra\n" +
                    "sono pieni della tua gloria.\n" +
                    "Osanna nell'alto dei cieli.\n" +
                    "Benedetto colui che viene\n" +
                    "nel nome del Signore.\n" +
                    "Osanna nell'alto dei cieli.\n"},
            {"Mistero della fede.", "Hľa, tajomstvo viery."},
            {"Annunziamo la tua morte, Signore, proclamiamo la tua risurrezione, nell'attesa della tua venuta.",
                    "Smrť tvoju, Pane, zvestujeme a tvoje zmŕtvychvstanie vyznávame, kým neprídeš v sláve."},
            {""},
            {"Ogni volta che mangiamo di questo pane e beviamo a questo calice annunziamo la tua morte, Signore, nell'attesa della tua venuta.",
                    "Pane, keď jeme tento chlieb a pijeme z tohto kalicha, zvestujeme tvoju smrť, kým neprídeš v sláve."},
            {""},
            {"Tu ci hai redenti con la tua croce e la tua risurrezione: salvaci, o Salvatore del mondo.",
                    "Spasiteľ sveta, zachráň nás, veď ty si nás vykúpil svojím krížom a zmŕtvychvstaním.\n"},
            {"Obbedienti alla parola del Salvatore e formati al suo divino insegnamento, osiamo dire:",
                    "Na príkaz nášho spasiteľa a podľa jeho božského učenia osmeľujeme sa povedať:"},
            {"Padre nostro, che sei nei cieli,\n" +
                    "sia santificato il tuo nome,\n" +
                    "venga il tuo regno,\n" +
                    "sia fatta la tua volontà,\n" +
                    "come in cielo così in terra.\n" +
                    "Dacci oggi il nostro pane quotidiano,\n" +
                    "e rimetti a noi i nostri debiti come noi\n" +
                    "li rimettiamo ai nostri debitori,\n" +
                    "e non ci indurre in tentazione,\n" +
                    "ma liberaci dal male.\n"},
            {"Liberaci, o Signore, da tutti i mali, concedi la pace ai nostri giorni; e con l'aiuto della tua misericordia, vivremo sempre liberi dal peccato e sicuri da ogni turbamento, nell'attesa che si compia la beata speranza, e venga il nostro Salvatore Gesù Cristo."},
            {"Tuo é il regno, tua la potenza e la gloria nei secoli.", "Lebo tvoje je kráľovstvo a moc i sláva naveky.\n"},
            {"Signore Gesù Cristo, che hai detto ai tuoi apostoli: \"Vi lascio la pace, vi do la mia pace\", non guardare ai nostri peccati, ma alla fede della tua Chiesa, e donale unita e pace secondo la tua volontà. Tu che vivi e regni nei secoli dei secoli."},
            {"Amen."},
            {"La pace del Signore sia sempre con voi.", "Pokoj Pánov nech je vždy s vami."},
            {"E con il tuo spirito.", "I s duchom tvojím."},
            {"Scambiatevi un segno di pace.", "Dajte si znak pokoja.\n"},
            {"Agnello di Dio, che togli i peccati del mondo, abbi pietà di noi.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Agnello di Dio, che togli i peccati del mondo, abbi pietà di noi.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Agnello di Dio, che togli i peccati del mondo, dona a noi la pace.",
                    "Baránok Boží, ty snímaš hriechy sveta: daruj nám pokoj."},
            {"Beati gli invitati alla Cena del Signore. Ecco l'Agnello di Dio, che toglie i peccati del mondo.",
                    "Hľa, Baránok Boží, ktorý sníma hriechy sveta: daruj nám pokoj."},
            {"O Signore, non sono degno di partecipare alla tua mensa: ma di' soltanto una parola e io sarò salvato.",
                    "Pane, nie som hoden, aby si vošiel pod moju strechu, ale povedz iba slovo a duša mi ozdravie."},
            {"Il Corpo di Cristo.", "Telo Kristovo."},
            {"Amen.\n"},
            {"Il Signore sia con voi.", "Pán s vami."},
            {"E con il tuo spirito.", "I s duchom tvojím."},
            {"Vi benedica Dio onnipotente, Padre e Figlio <font color='#B71C1C'>†</font> e Spirito Santo.",
                    "Nech vás žehná všemohúci Boh, Otec i Syn † i Duch Svätý."},
            {"Amen."},
            {"La Messa é finita: andate in pace.", "Iďte v mene Božom."},
            {"Rendiamo grazie a Dio!", "Bohu vďaka."}
    };

    String[] Hungary_nadpis = {
            "<b>BEVEZETŐ SZERTARTÁS – ÚVODNÉ OBRADY</b><br><br> KEZDŐÉNEK – ÚVODNÝ SPEV",
            "DICSŐSÉG – GLÓRIA",
            "KŐNYŐRGÉS – MODLIDBA DŇA<br><br><b>AZ LGE LITURGIÁJA – LITURGIA SLOVA</b><br><br>OLVASMÁNY – ČÍTANIE<br>Po prečítaní čítania:",
            "EVANGÉLIUM - EVANJELIUM",
            "Po prečítaní evanjelia:",
            "HISZEKEGY – VYZNANIE VIERY",
            "EGYETEMES KŐNYŐRGÉSEK – SPOLOČNÉ MODLITBY VERIACICH<br><br><b>AZ EUKARISZTIA LITURGIÁJA – LITURGIA EUCHARISTIE</b><br>",
            "FELAJÁNIÓ KŐNYŐRGÉS – MODLITBA NAD OBETNÝMI DARMI.<br><br>PREFÁCIÓ – PREFÁCIA",
            "EUCHARISZTIKUS IMA – EUCHARISTICKÁ MODLITBA<br>Po premenení:",
            "AZ ÁLDOZÁS SZERTARTÁSA – OBRAD PRIJÍMANIA",
            "ISTEN BÁRÁNYA – BARÁNOK BOŽÍ",
            "ÁLDOZÁS UTÁNI KŐNYŐRGÉS – MODLITBA PO PRIJÍMANÍ<br><br><b> BEFEJZŐ RÉSZ - ZÁVEREČNÉ OBRADY</b><br>"
    };

    String[][] Hungary_vypis = {
            {"Az Atya, a Fiú és a Szentlélek nevében.", "V mene Otca i Syna i Ducha Svätého."},
            {"Amen."},
            {"Az Úr legyen veletek.", "Pán s vami."},
            {"És a te lelkeddel.", "I s duchom Tvojím.\n"},
            {"Testvéreim! Vizsgáljuk meg lelkiismeretünket, és bánjuk meg bűneinket, hogy méltóképpen ünnepelhessük az Úr szent titkait!",
                    "Bratia a sestry, uznajme svoje hriechy, aby sme mohli s čistým srdcom sláviť sväté tajomstvá."},
            {"Gyónom a mindenható Istennek\n" +
                    "és nektek, testvéreim,\n" +
                    "hogy sokszor és sokat vétkeztem\n" +
                    "gondolattal, szóval,\n" +
                    "cselekedettel és mulasztással:\n" +
                    "én vétkem, én vétkem,\n" +
                    "én igen nagy vétkem.\n" +
                    "Kérem ezért a Boldogságos,\n" +
                    "mindenkor Szeplőtelen Szűz Máriát,\n" +
                    "az összes angyalokat és szenteket,\n" +
                    "és titeket, testvéreim,\n" +
                    "hogy imádkozzatok érettem\n" +
                    "Urunkhoz, Istenünkhöz.",
                    "Vyznávam všemohúcemu Bohu i vám, bratia a sestry, že som veľa zhrešil myšlienkami, slovami, skutkami a zanedbávaním dobrého. Moja vina, moja vina, moja preveľká vina. Preto prosím blahoslavenú Máriu, vždy Pannu, všetkých anjelov a svätých, i vás, bratia a sestry, modlite sa za mňa k Pánu Bohu nášmu."},
            {"Irgalmazzon nekünk a mindenható Isten, bocsássa meg bűneinket, és vezessen el az örök életre.",
                    "Nech sa zmiluje nad nami všemohúci Boh, nech nám hriechy odpustí a privedie nás do života večného."},
            {"Amen.\n"},
            {"Uram, irgalmazz!", "Pane, zmiluj sa."},
            {"Uram, irgalmazz!", "Pane, zmiluj sa."},
            {"Krisztus kegyelmezz!", "Kriste, zmiluj sa."},
            {"Krisztus kegyelmezz!", "Kriste, zmiluj sa."},
            {"Uram, irgalmazz!", "Pane, zmiluj sa."},
            {"Uram, irgalmazz!", "Pane, zmiluj sa.\n"},
            {"Dicsőség a magasságban Istennek,\n" +
                    "és a földön békesség\n" +
                    "a jóakaratú embereknek.\n" +
                    "Dicsőítünk téged, áldunk téged,\n" +
                    "imádunk téged, magasztalunk téged,\n" +
                    "hálát adunk neked nagy dicsőségedért,\n" +
                    "Urunk és Istenünk, mennyei Király,\n" +
                    "mindenható Atyaisten.\n" +
                    "Urunk, Jézus Krisztus, egyszülött Fiú,\n" +
                    "Urunk és Istenünk,\n" +
                    "Isten Báránya, az Atyának Fia,\n" +
                    "te elveszed a világ bűneit,\n" +
                    "irgalmazz nekünk;\n" +
                    "te elveszed a világ bűneit,\n" +
                    "hallgasd meg könyörgésünket.\n" +
                    "Te az Atya jobbján ülsz,\n" +
                    "irgalmazz nekünk.\n" +
                    "Mert egyedül te vagy a Szent,\n" +
                    "te vagy az Úr,\n" +
                    "te vagy az egyetlen Fölséd,\n" +
                    "Jézus Krisztus,\n" +
                    "a Szentlélekkel együtt,\n" +
                    "az Atyaisten dicsőségében.\n" +
                    "Amen.\n"},
            {"Ez az Isten igéje!", "Počuli sme Božie slovo."},
            {"Istennek legyen hála!", "Bohu vďaka.\n"},
            {"Az Úr legyen veletek.", "Pán s vami."},
            {"És a te lelkeddel.", "I s duchom tvojím."},
            {"Evangélium Szent ... könyvéből.", "Čítanie zo svätého evanjelia podľa..."},
            {"Dicsőség neked, Istenünk.", "Sláva tebe, Pane.\n"},
            {"Ezek az evangélium igéi.", "Počuli sme slovo Pánovo."},
            {"Áldunk téged, Krisztus.", "Chvála tebe, Kriste.\n"},
            {"Hiszek az egy Istenben,\n" +
                    "mindenható Atyában,\n" +
                    "mennynek és földnek,\n" +
                    "minden láthatónak\n" +
                    "és láthatatlannak Teremtőjében.\n" +
                    "Hiszek az egy Úrban, Jézus Krisztusban,\n" +
                    " Isten egyszülött Fiában,\n" +
                    "aki az Atyától született az idő kezdete előtt.\n" +
                    "Isten az Istentől,\n" +
                    "Világosság a Világosságtól,\n" +
                    "valóságos Isten a valóságos Istentől,\n" +
                    "született, de nem teremtmény,\n" +
                    "az Atyával egylényegű;\n" +
                    "és minden általa lett.\n" +
                    "Értünk, emberekért,\n" +
                    "a mi üdvösségünkért\n" +
                    "leszállott a mennyből.\n" +
                    "Megtestesült a Szentlélek erejéből,\n" +
                    "Szűz Máriától,\n" +
                    "és emberré lett.\n" +
                    "Poncius Pilátus alatt\n" +
                    "értünk keresztre feszítették,\n" +
                    "kínhalált szenvedett és eltemették.\n" +
                    "Harmadnapra feltámadott\n" +
                    "az írások szerint,\n" +
                    "fölment a mennybe,\n" +
                    "ott ül az Atyának jobbján,\n" +
                    "de újra eljön dicsőségben,\n" +
                    "ítélni élőket és holtakat,\n" +
                    "és országának nem lesz vége.\n" +
                    "Hiszek a Szentlélekben,\n" +
                    "Urunkban és éltetőnkben,\n" +
                    "aki az Atyától és a Fiútól származik;\n" +
                    "akit éppúgy imádunk és dicsőítünk,\n" +
                    "mint az Atyát és a Fiút.\n" +
                    "Ő szólt a próféták szavával.\n" +
                    "Hiszek az egy, szent, katolikus\n" +
                    "és apostoli Anyaszentegyházban,\n" +
                    "vallom az egy keresztséget\n" +
                    "a bűnök bocsánatára,\n" +
                    "várom a holtak feltámadását\n" +
                    "és az eljövendő örök életet.\n" +
                    "Amen.\n"},
            {"Áldott vagy, Urunk, mindenség Istene, mert a te bőkezűségedből kaptuk a kenyeret. Felajánljuk neked, mint a föld termését és az emberi munka gyümölcsét. Ebből lesz számunkra az élet kenyere.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali tento chlieb. Obetujeme ho tebe ako plod zeme a práce ľudských rúk, aby sa nám stal chlebom života."},
            {"Áldott legyen az Isten mindörökké.", "Zvelebený Boh naveky!"},
            {"Áldott vagy, Urunk, mindenség Istene, mert a te bőkezűségedből kaptuk a bort. Felajánljuk neked, mint a szőlőtő termését és az emberi munka gyümölcsét. Ebből lesz számunkra a lélek itala.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali toto víno. Obetujeme ho tebe ako plod viniča a práce ľudských rúk, aby sa nám stalo duchovným nápojom."},
            {"Áldott legyen az Isten mindörökké.", "Zvelebený Boh naveky!\n"},
            {"Imádkozzatok, testvéreim, hogy áldozatunk  kedves legyen  a mindenható Atyaisten előtt.",
                    "Modlite sa, bratia a sestry, aby sa moja i vaša obeta zaľúbila Bohu Otcu všemohúcemu."},
            {"Fogadja el az Úr  kezedből az áldozatot nevének dicséretére és dicsőségére, mindannyiunk  és az egész Anyaszentegyház javára.",
                    "Nech Pán prijeme obetu z tvojich rúk na chválu a slávu svojho mena, na úžitok nám i celej svätej Cirkvi.\n"},
            {"Az Úr legyen veletek.", "Pán s vami."},
            {"És a te lelkeddel.", "I s duchom tvojím."},
            {"Emeljük föl szívünket.", "Hore srdcia"},
            {"Fölemeltük az Úrhoz.", "Máme ich u Pána."},
            {"Adjunk hálát Urunknak, Istenünknek.", "Vzdávajme vďaky Pánovi, Bohu nášmu."},
            {"Méltó és igazságos.", "Je to dôstojné a správne.\n"},
            {"Szent vagy, szent vagy, szent vagy\n" +
                    "mindenség Ura, Istene!\n" +
                    "Dicsőséged betölti\n" +
                    "a mennyet és a földet.\n" +
                    "Hozsanna a magasságban!\n" +
                    "Áldott, aki jön\n" +
                    "az Úr nevében.\n" +
                    "Hozsanna a magasságban!\n"},
            {"Íme, hitünk szent titka:", "Hľa, tajomstvo viery."},
            {"Halálodat hirdetjük, Urunk, és hittel valljuk feltámadásodat, amíg el nem jössz.",
                    "Smrť tvoju, Pane, zvestujeme a tvoje zmŕtvychvstanie vyznávame, kým neprídeš v sláve."},
            {""},
            {"Valahányszor esszük ezt a kenyeret, és iszunk ebből a kehelyből, halálodat hirdetjük, Urunk, amíg el nem jössz.",
                    "Pane, keď jeme tento chlieb a pijeme z tohto kalicha, zvestujeme tvoju smrť, kým neprídeš v sláve."},
            {""},
            {"Üdvözíts bennünket, világ Megváltója, ki kereszted és feltámadásod által megmentettél minket.",
                    "Spasiteľ sveta, zachráň nás, veď ty si nás vykúpil svojím krížom a zmŕtvychvstaním.\n"},
            {"Üdvözítőnk parancsára és isteni tanítása szerint így imádkozunk:",
                    "Na príkaz nášho spasiteľa a podľa jeho božského učenia osmeľujeme sa povedať:"},
            {"Mi Atyánk, aki a mennyekben vagy,\n" +
                    "szenteltessék meg a te neved;\n" +
                    "jöjjön el a te országod;\n" +
                    "legyen meg a te akaratod,\n" +
                    "amint a mennyben, úgy a földön is.\n" +
                    "Mindennapi kenyerünket\n" +
                    "add meg nekünk ma;\n" +
                    "és bocsásd meg vétkeinket,\n" +
                    "miképpen mi is megbocsátunk\n" +
                    "az ellenünk vétkezőknek;\n" +
                    "és ne vígy minket kísértésbe;\n" +
                    "de szabadíts meg a gonosztól.\n"},
            {"Szabadíts meg, kérünk, Urunk, minden gonosztól; Adj kegyesen békét napjainkban, hogy irgalmadból mindenkor bűn és baj nélkül éljünk, míg reménykedve várjuk az örök boldogságot és üdvözítőnknek, Jézus Krisztusnak dicsőséges eljöttét."},
            {"Mert tied az ország,  a hatalom és a dicsőség mindörökké. Ámen.", "Lebo tvoje je kráľovstvo a moc i sláva naveky.\n"},
            {"Urunk, Jézus Krisztus, te azt mondottad apostolaidnak: Békességet hagyok rátok, az én békémet adom nektek. Ne vétkeinket nézzed, hanem Egyházad hitét, őrizd meg szándékod szerint  békében, és add meg teljes egységét. Aki élsz és uralkodol  mindörökkön-örökké."},
            {"Amen."},
            {"Az Úr békéje legyen veletek mindenkor.", "Pokoj Pánov nech je vždy s vami."},
            {"És a te lelkeddel.", "I s duchom tvojím."},
            {"Köszöntsétek egymást a béke jelével.", "Dajte si znak pokoja.\n"},
            {"Isten Báránya,  te elveszed a világ bűneit:  irgalmazz nekünk.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Isten Báránya,  te elveszed a világ bűneit:  irgalmazz nekünk.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Isten Báránya,  te elveszed a világ bűneit:  adj nekünk békét.",
                    "Baránok Boží, ty snímaš hriechy sveta: daruj nám pokoj."},
            {"Íme, az Isten Báránya,  íme, aki elveszi a világ bűneit. Boldogok, akiket meghív asztalához  Jézus, az Isten Báránya.",
                    "Hľa, Baránok Boží, ktorý sníma hriechy sveta: daruj nám pokoj."},
            {"Uram, nem vagyok méltó,  hogy hajlékomba jöjj, hanem csak egy szóval mondd,  és meggyógyul az én lelkem.",
                    "Pane, nie som hoden, aby si vošiel pod moju strechu, ale povedz iba slovo a duša mi ozdravie."},
            {"Krisztus Teste!", "Telo Kristovo."},
            {"Amen.\n"},
            {"Az Úr legyen veletek.", "Pán s vami."},
            {"És a te lelkeddel.", "I s duchom tvojím."},
            {"Áldjon meg benneteket a mindenható Isten: az Atya, a Fiú <font color='#B71C1C'>†</font> és a zentlélek.",
                    "Nech vás žehná všemohúci Boh, Otec i Syn † i Duch Svätý."},
            {"Amen."},
            {"A szentmise véget ért, menjetek békével!", "Iďte v mene Božom."},
            {"Istennek legyen hála.", "Bohu vďaka."},
            //bonusove + v Jazyky.class
            {"Íme, megváltásunk szent titka:"},
            {"Íme, üdvösségünk szent titka:"},
    };

    String[] German_nadpis = {
            "<b>ERÖLFNÜNG – ÚVODNÉ OBRADY</b><br><br>GESANG ZUR ERÖFFNUNG – ÚVODNÝ SPEV",
            "GLORIA – GLÓRIA",
            "TAGESGEBET – MODLIDBA DŇA<br><br><b>WORTGOTTESDIENST – LITURGIA SLOVA</b><br><br>LESUNG – ČÍTANIE<br>Po prečítaní čítania:",
            "EVANGELIUM - EVANJELIUM",
            "Po prečítaní evanjelia:",
            "GLAUBENSBEKENNTNIS – VYZNANIE VIERY",
            "ALLGEMEINES GEBET – SPOLOČNÉ MODLITBY VERIACICH<br><br><b>EUCHARISTIEFEIER – LITURGIA EUCHARISTIE</b><br>",
            "GEBENGEBET – MODLITBA NAD OBETNÝMI DARMI.<br><br>PRÄFATION – PREFÁCIA",
            "EUCHARISTISCHES HOCHGEBET – EUCHARISTICKÁ MODLITBA<br>Po premenení:",
            "KOMMUNION – OBRAD PRIJÍMANIA",
            "LAMM GOTTES – BARÁNOK BOŽÍ",
            "SCHLUSSGEBET – MODLITBA PO PRIJÍMANÍ<br><br><b>ENTLASSUNG - ZÁVEREČNÉ OBRADY</b><br>"
    };

    String[][] German_vypis = {
            {"Im Namen des Vaters und des Sohnes und des Heiligen Geistes.", "V mene Otca i Syna i Ducha Svätého."},
            {"Amen."},
            {"Der Herr sei mit Euch.", "Pán s vami."},
            {"Und mit Deinem Geiste.", "I s duchom Tvojím.\n"},
            {"Brüder und Schwestern, damit wir die heiligen Geheimnisse in rechter Weise feiern können, wollen wir bekennen daß wir gesündigt haben.",
                    "Bratia a sestry, uznajme svoje hriechy, aby sme mohli s čistým srdcom sláviť sväté tajomstvá."},
            {"Ich bekenne Gott, dem Allmächtigen,\n" +
                    "und allen Brüdern und Schwestern,\n" +
                    "das ich Gutes unterlassen und Böses getan habe\n" +
                    "ich habe gesündigt in Gedanken,\n" +
                    "Worten und Werken,\n" +
                    "durch meine Schuld,\n" +
                    "durch meine Schuld,\n" +
                    "durch meine grosse Schuld.\n" +
                    "Darum bitte ich die selige Jungfrau Maria,\n" +
                    "alle Engel und Heiligen und euch,\n" +
                    "Brüder und Schwestern,\n" +
                    "für mich zu beten bei Gott, unserem Herrn.",
                    "Vyznávam všemohúcemu Bohu i vám, bratia a sestry, že som veľa zhrešil myšlienkami, slovami, skutkami a zanedbávaním dobrého. Moja vina, moja vina, moja preveľká vina. Preto prosím blahoslavenú Máriu, vždy Pannu, všetkých anjelov a svätých, i vás, bratia a sestry, modlite sa za mňa k Pánu Bohu nášmu."},
            {"Der allmächtige Gott erbarme sich unser. Er lasse uns die Sünden nach und führe uns zum ewigen Leben.",
                    "Nech sa zmiluje nad nami všemohúci Boh, nech nám hriechy odpustí a privedie nás do života večného."},
            {"Amen.\n"},
            {"Herr, erbarme dich.", "Pane, zmiluj sa."},
            {"Herr, erbarme dich.", "Pane, zmiluj sa."},
            {"Christe, erbarme dich.", "Kriste, zmiluj sa."},
            {"Christe, erbarme dich.", "Kriste, zmiluj sa."},
            {"Herr, erbarme dich.", "Pane, zmiluj sa."},
            {"Herr, erbarme dich.", "Pane, zmiluj sa.\n"},
            {"Ehre sei Gott in der Höhe\n" +
                    "und Friede auf Erden\n" +
                    "den Menschen seiner Gnade.\n" +
                    "Wir loben dich, wir preisen dich,\n" +
                    "wir beten dich an,\n" +
                    "wir rühmen dich und danken dir,\n" +
                    "denn grob ist deine Herrlichkeit:\n" +
                    "Herr und Gott, König des Himmels,\n" +
                    "Gott und Vater,\n" +
                    "Herrscher über das All,\n" +
                    "Herr, eingeborener Sohn, Jesus Christus.\n" +
                    "Herr und Gott, Lamm Gottes, Sohn des Vaters,\n" +
                    "du nimmst hinweg die Sünde der Welt:\n" +
                    "erbarme dich unser;\n" +
                    "du nimmst hinweg die Sünde der Welt\n" +
                    "nimm an unser Gebet;\n" +
                    "du sitzest zur Rechten des Vaters:\n" +
                    "erbarme dich unser.\n" +
                    "Denn du allein bist der Heilige,\n" +
                    "du allein der Herr,\n" +
                    "du allein der Höchste,\n" +
                    "Jesus Christus,\n" +
                    "mit dem Heiligen Geist,\n" +
                    "zur Ehre Gottes des Vaters.\n" +
                    "Amen.\n"},
            {"Wort des lebendigen Gottes.", "Počuli sme Božie slovo."},
            {"Dank sei Gott.", "Bohu vďaka.\n"},
            {"Der Herr sei mit euch.", "Pán s vami."},
            {"Und mit deinem Geiste.", "I s duchom tvojím."},
            {"Aus dem heiligen Evangelium nach...", "Čítanie zo svätého evanjelia podľa..."},
            {"Ehre sei dir, o Herr.", "Sláva tebe, Pane.\n"},
            {"Evangelium unseres Herrn Jesus Christus.", "Počuli sme slovo Pánovo."},
            {"Lob sei dir, Christus.", "Chvála tebe, Kriste.\n"},
            {"Wir glauben an den einen Gott,\n" +
                    "den Vater, den Allmächtigen,\n" +
                    "der alles geschaffen hat,\n" +
                    "Himmel und Erde, die sichtbare\n" +
                    "und die unsichtbare Welt.\n" +
                    "Und an den einen Herrn Jesus Christus,\n" +
                    "Gottes eingeborenen Sohn,\n" +
                    "aus dem Vater geboren vor aller Zeit:\n" +
                    "Gott von Gott, Licht vom Licht,\n" +
                    "wahrer Gott vom wahren Gott,\n" +
                    "gezeugt, nicht geschaffen,\n" +
                    "eines Wesens mit dem Vater;\n" +
                    "durch ihn ist alles geschaffen.\n" +
                    "Für uns Menschen und zu unserem Heil,\n" +
                    "ist er vom Himmel gekommen,\n" +
                    "hat Fleisch angenommen\n" +
                    "durch den Heiligen Geist\n" +
                    "von der Jungfrau Maria\n" +
                    "und ist Mensch geworden.\n" +
                    "Er wurde für uns gekreuzigt\n" +
                    "unter Pontius Pilatus,\n" +
                    "hat gelitten und ist begraben worden,\n" +
                    "ist am dritten Tage auferstanden\n" +
                    "nach der Schrift\n" +
                    "und aufgefahren in den Himmel.\n" +
                    "Er sitzt zur Rechten des Vaters\n" +
                    "und wird wiederkommen in Herrlichkeit,\n" +
                    "zu richten die Lebenden und die Toten;\n" +
                    "seiner Herrschaft wird kein Ende sein.\n" +
                    "Wir glauben an den Heiligen Geist,\n" +
                    "der Herr ist und lebendig macht,\n" +
                    "der aus dem Vater und dem Sohn hervorgeht,\n" +
                    "der mit dem Vater und dem Sohn angebetet\n" +
                    "und verherrlicht wird,\n" +
                    "der gesprochen hat durch die Propheten;\n" +
                    "und die eine, heilige, katholische\n" +
                    "und apostolische Kirche.\n" +
                    "Wir bekennen die eine Taufe\n" +
                    "zur Vergebung der Sünden.\n" +
                    "Wir erwarten die Auferstehung der Toten,\n" +
                    "und das Leben der kommenden Welt.\n" +
                    "Amen.\n"},
            {"Gepriesen bist du, Herr, unser Gott, Schöpfer der Welt. Du schenkst uns das Brot, die Frucht der Erde und der menschlichen Arbeit. Wir bringen dieses Brot vor dein Angesicht, damit es uns das Brot des Lebens werde.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali tento chlieb. Obetujeme ho tebe ako plod zeme a práce ľudských rúk, aby sa nám stal chlebom života."},
            {"Gepriesen bist du in Ewigkeit, Herr, unser Gott.", "Zvelebený Boh naveky!"},
            {"Gepriesen bist du, Herr, unser Gott, Schöpfer der Welt. Du schenkst uns den Wein, die Frucht der Weinstocks und der menschlichen Arbeit. Wir bringen dieses Kelch vor dein Angesicht, damit es uns der Kelch des Heiles werde.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali toto víno. Obetujeme ho tebe ako plod viniča a práce ľudských rúk, aby sa nám stalo duchovným nápojom."},
            {"Gepriesen bist du in Ewigkeit, Herr, unser Gott.", "Zvelebený Boh naveky!\n"},
            {"Betet, Brüder und Schwestern, dass mein und euer Opfer Gott, dem allmächtigen Vater, gefalle.",
                    "Modlite sa, bratia a sestry, aby sa moja i vaša obeta zaľúbila Bohu Otcu všemohúcemu."},
            {"Der Herr nehme das Opfer an aus deinen Händen zum Lob und Ruhm seines Namens, zum Segen für uns und seine ganze heilige Kirche.",
                    "Nech Pán prijeme obetu z tvojich rúk na chválu a slávu svojho mena, na úžitok nám i celej svätej Cirkvi.\n"},
            {"Der Herr sei mit euch.", "Pán s vami."},
            {"Und mit deinem Geiste.", "I s duchom tvojím."},
            {"Erhebet die Herzen.", "Hore srdcia"},
            {"Wir haben sie beim Herrn.", "Máme ich u Pána."},
            {"Lasset uns danken dem Herrn, unserm Gott.", "Vzdávajme vďaky Pánovi, Bohu nášmu."},
            {"Das ist würdig und recht.", "Je to dôstojné a správne.\n"},
            {"Heilig, heilig, heilig Gott,\n" +
                    "Herr aller Mächte und Gewalten.\n" +
                    "Erfüllt sind Himmel und Erde\n" +
                    "von deiner Herrlichkeit.\n" +
                    "Hosanna in der Höhe.\n" +
                    "Hochgelobt sei,\n" +
                    "der da kommt im Namen des Herrn.\n" +
                    "Hosanna in der Höhe.\n"},
            {"Geheimnis des Glaubens.", "Hľa, tajomstvo viery."},
            {"Deinen Tod, o Herr, verkünden wir, und deine Auferstehung preisen wir, bis du kommst in Herrlichkeit.",
                    "Smrť tvoju, Pane, zvestujeme a tvoje zmŕtvychvstanie vyznávame, kým neprídeš v sláve."},
            {""},
            {"Quotiescumque manducamus panem hunc et calicem bibimus, mortem tuam annuntiamus, Domine, donec venias.",
                    "Pane, keď jeme tento chlieb a pijeme z tohto kalicha, zvestujeme tvoju smrť, kým neprídeš v sláve."},
            {""},
            {"Salvator mundi, salva nos, qui per crucem et resurrectionem tuam liberasti nos.",
                    "Spasiteľ sveta, zachráň nás, veď ty si nás vykúpil svojím krížom a zmŕtvychvstaním.\n"},
            {"Dem Wort unseres Herrn uns Erlösers gehorsam und getreu seiner Auftrag, wagen wir zu sprechen:",
                    "Na príkaz nášho spasiteľa a podľa jeho božského učenia osmeľujeme sa povedať:"},
            {"Vater unser im Himmel,\n" +
                    "Geheiligt werde dein Name.\n" +
                    "Dein Reich komme.\n" +
                    "Dein Wille geschehe, wie im Himmel so auf Erden.\n" +
                    "Unser tägliches Brot gib uns heute.\n" +
                    "Und vergib uns unsere Schuld,\n" +
                    "wie auch wir vergeben unsern Schuldigern.\n" +
                    "Und führe uns nicht in Versuchung,\n" +
                    "sondern erlöse uns von dem Bösen.\n"},
            {"Erlöse uns, Herr, allmächtiger Vater, von allem Bösen und gib Frieden in unseren Tagen. Komm uns zu Hilfe mit deinem Erbarmen und bewahre uns vor Verwirrung und Sünde, damit wir voll Zuversicht das Kommen unseres Erlösers Jesus Christus erwarten."},
            {"Denn dein ist das Reich und die Kraft und die Herrlichkeit in Ewigkeit. Amen.", "Lebo tvoje je kráľovstvo a moc i sláva naveky.\n"},
            {"Der Herr hat zu seinen Aposteln gesagt: \"Frieden hinterlasse ich euch, meinen Frieden gebe ich euch\". Deshalb bitten wir: Herr Jesus Christus, schau nicht auf unsere Sünden, sondern auf den Glauben deiner Kirche und schenke ihr nach deinem Willen Einheit und Frieden."},
            {"Amen."},
            {"Der Friede des Herrn sei allezeit mit euch.", "Pokoj Pánov nech je vždy s vami."},
            {"Und mit deinem Geiste.", "I s duchom tvojím."},
            {"Gebt einander ein Zeichen des Friedens und der Versöhnung.", "Dajte si znak pokoja.\n"},
            {"Lamm Gottes, du nimmst hinweg die Sünde der Welt, erbarme dich unser.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Lamm Gottes, du nimmst hinweg die Sünde der Welt, erbarme dich unser.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Lamm Gottes, du nimmst hinweg die Sünde der Welt, gib uns deinen Frieden.",
                    "Baránok Boží, ty snímaš hriechy sveta: daruj nám pokoj."},
            {"Seht das Lamm Gottes, das hinwegnimmt die Sünde der Welt.",
                    "Hľa, Baránok Boží, ktorý sníma hriechy sveta: daruj nám pokoj."},
            {"Herr, ich bin nicht würdig, dass Du eingehst unter mein Dach, aber sprich nur ein Wort, so wird meine Seele gesund.",
                    "Pane, nie som hoden, aby si vošiel pod moju strechu, ale povedz iba slovo a duša mi ozdravie."},
            {"Der Leib Christi.", "Telo Kristovo."},
            {"Amen.\n"},
            {"Der Herr sei mit Euch.", "Pán s vami."},
            {"Und mit Deinem Geiste.", "I s duchom tvojím."},
            {"Es segne Euch der allmächtige Gott, der Vater, der Sohn <font color='#B71C1C'>†</font> und der Heilige Geist.",
                    "Nech vás žehná všemohúci Boh, Otec i Syn † i Duch Svätý."},
            {"Amen."},
            {"Gehet hin in Frieden.", "Iďte v mene Božom."},
            {"Dank sei Gott dem Herrn.", "Bohu vďaka."}
    };

    String[] Spain_nadpis = {
            "<b>RITOS INICIALES – ÚVODNÉ OBRADY</b><br><br>ANTÍFONA DE ENTRADA – ÚVODNÝ SPEV",
            "GLORIA – GLÓRIA",
            "ORACIÓN COLECTA – MODLIDBA DŇA<br><br><b>LITURGIA DE LA PALABRA – LITURGIA SLOVA</b><br><br>LECTURA – ČÍTANIE<br>Po prečítaní čítania:",
            "EVANGELIO - EVANJELIUM",
            "Po prečítaní evanjelia:",
            "CREDO – VYZNANIE VIERY",
            "PROPUESTA PARA ORACIÓN DE LOS FIELES – SPOLOČNÉ MODLITBY VERIACICH<br><br><b>LITURGIA EUCARÍSTICA – LITURGIA EUCHARISTIE</b><br>",
            "ORACIÓN SOBRE LAS OFRENDAS – MODLITBA NAD OBETNÝMI DARMI.<br><br>PREFACIO – PREFÁCIA",
            "PLEGARIA EUCARÍSTICA – EUCHARISTICKÁ MODLITBA<br>Po premenení:",
            "RITO DE LA COMUNIÓN – OBRAD PRIJÍMANIA",
            "CORDERO DE DIOS – BARÁNOK BOŽÍ",
            "ORACIÓN PARA DESPUÉS DE LA COMUNIÓN – MODLITBA PO PRIJÍMANÍ<br><br><b>RITO DE CONCLUSIÓN - ZÁVEREČNÉ OBRADY</b><br>"
    };

    String[][] Spain_vypis = {
            {"En el nombre del Padre, y del Hijo, y del Espíritu Santo.", "V mene Otca i Syna i Ducha Svätého."},
            {"Amén."},
            {"El Señor esté con vosotros.", "Pán s vami."},
            {"Y con tu espíritu.", "I s duchom Tvojím.\n"},
            {"Hermanos: para celebrar dignamente estos sagrados misterios, reconozcamos nuestros pecados.",
                    "Bratia a sestry, uznajme svoje hriechy, aby sme mohli s čistým srdcom sláviť sväté tajomstvá."},
            {"Yo confieso ante Dios todopoderoso\n" +
                    "y ante vosotros, hermanos,\n" +
                    "que he pecado mucho de pensamiento,\n" +
                    "palabra, obra y omisión.\n" +
                    "Por mi culpa, por mi culpa,\n" +
                    "por mi gran culpa.\n" +
                    "Por eso ruego a santa María,\n" +
                    "siempre Virgen, a los ángeles,\n" +
                    "a los santos y a vosotros, hermanos,\n" +
                    "que intercedáis por mí ante Dios,\n" +
                    "nuestro Señor.",
                    "Vyznávam všemohúcemu Bohu i vám, bratia a sestry, že som veľa zhrešil myšlienkami, slovami, skutkami a zanedbávaním dobrého. Moja vina, moja vina, moja preveľká vina. Preto prosím blahoslavenú Máriu, vždy Pannu, všetkých anjelov a svätých, i vás, bratia a sestry, modlite sa za mňa k Pánu Bohu nášmu."},
            {"Dios todopoderoso tenga misericordia de nosotros, perdone nuestros pecados y nos lleve a la vida eterna.",
                    "Nech sa zmiluje nad nami všemohúci Boh, nech nám hriechy odpustí a privedie nás do života večného."},
            {"Amén.\n"},
            {"Señor, ten piedad.", "Pane, zmiluj sa."},
            {"Señor, ten piedad.", "Pane, zmiluj sa."},
            {"Cristo, ten piedad.", "Kriste, zmiluj sa."},
            {"Cristo, ten piedad.", "Kriste, zmiluj sa."},
            {"Señor, ten piedad.", "Pane, zmiluj sa."},
            {"Señor, ten piedad.", "Pane, zmiluj sa.\n"},
            {"Gloria a Dios en el cielo,\n" +
                    "y en la tierra paz a los hombres que ama el Señor.\n" +
                    "Por tu inmensa gloria te alabamos, te bendecimos, te adoramos, te glorificamos, te damos gracias, Señor Dios, Rey celestial, Dios Padre todopoderoso.\n" +
                    "Señor, Hijo único, Jesucristo, Señor Dios, Cordero de Dios, Hijo del Padre; \n" +
                    "tú que quitas el pecado del mundo, ten piedad de nosotros;\n" +
                    "tú que quitas el pecado del mundo, atiende nuestra súplica;\n" +
                    "tú que estás sentado a la derecha del Padre, ten piedad de nosotros. \n" +
                    "Porque sólo tú eres Santo, sólo tú Señor, sólo tú Altísimo, Jesucristo, con el espíritu Santo en la gloria de Dios Padre.\n" +
                    "Amén.\n"},
            {"Palabra de Dios.", "Počuli sme Božie slovo."},
            {"Te alabamos, Señor.", "Bohu vďaka.\n"},
            {"El Señor esté con vosotros.", "Pán s vami."},
            {"Y con tu espíritu.", "I s duchom tvojím."},
            {"Lectura del santo Evangelio según san...", "Čítanie zo svätého evanjelia podľa..."},
            {"Gloria a ti, Señor.", "Sláva tebe, Pane.\n"},
            {"Palabra del Señor.", "Počuli sme slovo Pánovo."},
            {"Gloria a Ti, Señor Jesús.", "Chvála tebe, Kriste.\n"},
            {"Creo en un solo Dios, Padre todopoderoso, Creador del cielo y de la tierra, de todo lo visible y lo invisible.\n" +
                    "Creo en un solo Señor, Jesucristo, Hijo único de Dios, nacido del Padre antes de todos los siglos:\n" +
                    "Dios de Dios, Luz de Luz, Dios verdadero de Dios verdadero, engendrado, no creado, de la misma naturaleza del Padre, por quien todo fue hecho;\n" +
                    "que por nosotros, los hombres, y por nuestra salvación bajó del cielo;\n" +
                    "y por obra del Espíritu Santo se encarnó de María, la Virgen, y se hizo hombre;\n" +
                    "y por nuestra causa fue crucificado en tiempos de Poncio Pilato;\n" +
                    "padeció y fue sepultado, y resucitó al tercer día, según las Escrituras, y subió al cielo, y está sentado a la derecha del Padre;\n" +
                    "y de nuevo vendrá con gloria para juzgar a vivos y muertos, y su reino no tendrá fin.\n" +
                    "Creo en el Espíritu Santo, Señor y dador de vida, que procede del Padre y del Hijo, que con el Padre y el Hijo recibe una misma adoración y gloria, y que habló por los profetas.\n" +
                    "Creo en la Iglesia, que es una, santa, católica y apostólica.\n" +
                    "Confieso que hay un solo bautismo para el perdón de los pecados.\n" +
                    "Espero la resurrección de los muertos y la vida del mundo futuro.\n" +
                    "Amén.\n"},
            {"Bendito seas, Señor, Dios del universo, por este pan, fruto de la tierra y del trabajo del hombre, que recibimos de tu generosidad y ahora te presentamos; él será para nosotros pan de vida.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali tento chlieb. Obetujeme ho tebe ako plod zeme a práce ľudských rúk, aby sa nám stal chlebom života."},
            {"Bendito seas por siempre, Señor.", "Zvelebený Boh naveky!"},
            {"Bendito seas, Señor, Dios del universo, por este vino, fruto de la vid y del trabajo del hombre, que recibimos de tu generosidad y ahora te presentamos; él será para nosotros bebida de salvación.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali toto víno. Obetujeme ho tebe ako plod viniča a práce ľudských rúk, aby sa nám stalo duchovným nápojom."},
            {"Bendito seas por siempre, Señor.", "Zvelebený Boh naveky!\n"},
            {"Orad, hermanos, para que este sacrificio, mío y vuestro, sea agradable a Dios, Padre todopoderoso.",
                    "Modlite sa, bratia a sestry, aby sa moja i vaša obeta zaľúbila Bohu Otcu všemohúcemu."},
            {"El Señor reciba de tus manos este sacrificio, para alabanza y gloria de su nombre, para nuestro bien y el de toda su santa Iglesia.",
                    "Nech Pán prijeme obetu z tvojich rúk na chválu a slávu svojho mena, na úžitok nám i celej svätej Cirkvi.\n"},
            {"El Señor esté con vosotros.", "Pán s vami."},
            {"Y con tu espíritu.", "I s duchom tvojím."},
            {"Levantemos el corazón.", "Hore srdcia"},
            {"Lo tenemos levantado hacia el Señor.", "Máme ich u Pána."},
            {"Demos gracias al Señor, nuestro Dios.", "Vzdávajme vďaky Pánovi, Bohu nášmu."},
            {"Es justo y necesario.", "Je to dôstojné a správne.\n"},
            {"Santo, Santo, Santo es el Señor, Dios del Universo.\n" +
                    "Llenos están el cielo y la tierra de su gloria.\n" +
                    "Hosanna en el cielo.\n" +
                    "Bendito el que viene en nombre del Señor.\n" +
                    "Hosanna en el cielo.\n"},
            {"Éste es el Sacramento de nuestra fe.", "Hľa, tajomstvo viery."},
            {"Anunciamos tu muerte, proclamamos tu resurrección. ¡Ven, Señor Jesús!",
                    "Smrť tvoju, Pane, zvestujeme a tvoje zmŕtvychvstanie vyznávame, kým neprídeš v sláve."},
            {""},
            {"Cada vez que comemos de este pan y bebemos de este cáliz, anunciamos tu muerte, Señor, hasta que vuelvas.",
                    "Pane, keď jeme tento chlieb a pijeme z tohto kalicha, zvestujeme tvoju smrť, kým neprídeš v sláve."},
            {""},
            {"Por tu cruz y resurrección nos has salvado, Señor.",
                    "Spasiteľ sveta, zachráň nás, veď ty si nás vykúpil svojím krížom a zmŕtvychvstaním.\n"},
            {"Fieles a la recomendación del Salvador y siguiendo su divina enseñanza, nos atrevemos a decir:",
                    "Na príkaz nášho spasiteľa a podľa jeho božského učenia osmeľujeme sa povedať:"},
            {"Padre nuestro, que estás en el cielo, santificado sea tu Nombre;\n" +
                    "venga a nosotros tu reino;\n" +
                    "hágase tu voluntad en la tierra como en el cielo.\n" +
                    "Danos hoy nuestro pan de cada día;\n" +
                    "perdona nuestras ofensas, como también nosotros perdonamos a los que nos ofenden;\n" +
                    "no nos dejes caer en la tentación, y líbranos del mal.\n"},
            {"Líbranos de todos los males, Señor, y concédenos la paz en nuestros días, para que, ayudados por tu misericordia, vivamos siempre libres de pecado y protegidos de toda perturbación, mientras esperamos la gloriosa venida de nuestro Salvador Jesucristo."},
            {"Tuyo es el reino, tuyo el poder y la gloria, por siempre, Señor.", "Lebo tvoje je kráľovstvo a moc i sláva naveky.\n"},
            {"Señor Jesucristo, que dijiste a tus apóstoles: \"La paz os dejo, mi paz os doy\"; no tengas en cuenta nuestros pecados, sino la fe de tu Iglesia y, conforme a tu palabra, concédele la paz y la unidad. Tú que vives y reinas por los siglos de los siglos."},
            {"Amén."},
            {"La paz del Señor esté siempre con vosotros.", "Pokoj Pánov nech je vždy s vami."},
            {"Y con tu espíritu.", "I s duchom tvojím."},
            {"Daos fraternalmente la paz.", "Dajte si znak pokoja.\n"},
            {"Cordero de Dios, que quitas el pecado del mundo, ten piedad de nosotros.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Cordero de Dios, que quitas el pecado del mundo, ten piedad de nosotros.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Cordero de Dios, que quitas el pecado del mundo, danos la paz.",
                    "Baránok Boží, ty snímaš hriechy sveta: daruj nám pokoj."},
            {"Éste es el Cordero de Dios, que quita el pecado del mundo. Dichosos los invitados a la cena del Señor.",
                    "Hľa, Baránok Boží, ktorý sníma hriechy sveta: daruj nám pokoj."},
            {"Señor, no soy digno de que entres en mi casa, pero una palabra tuya bastará para sanarme.",
                    "Pane, nie som hoden, aby si vošiel pod moju strechu, ale povedz iba slovo a duša mi ozdravie."},
            {"El Cuerpo de Cristo.", "Telo Kristovo."},
            {"Amén.\n"},
            {"El Señor esté con vosotros.", "Pán s vami."},
            {"Y con tu espíritu.", "I s duchom tvojím."},
            {"La bendición de Dios todopoderoso, Padre, <font color='#B71C1C'>†</font> Hijo y Espíritu Santo, descienda sobre vosotros.",
                    "Nech vás žehná všemohúci Boh, Otec i Syn † i Duch Svätý."},
            {"Amén."},
            {"Podéis ir en paz.", "Iďte v mene Božom."},
            {"Demos gracias a Dios.", "Bohu vďaka."},
            //Bonusove časti
            {"Aclamad el Misterio de la redención.", "Vyznajme Tajomstvo viery"},
            {"Cristo se entregó por nosotros.", "Veľké je tajomstvo viery."},
    };

    String[] French_nadpis = {
            "<b>OUVERTURE DE LA CÉLÉBRATION – ÚVODNÉ OBRADY</b><br><br>CHANT D´ENTRÈE – ÚVODNÝ SPEV",
            "GLOIRE – GLÓRIA",
            "PIERÈRE D´OUVERTURE – MODLIDBA DŇA<br><br><b>LITURGIE DE LA PAROLE – LITURGIA SLOVA</b><br><br>LECTURE – ČÍTANIE<br>Po prečítaní čítania:",
            "ÉVANGILE - EVANJELIUM",
            "Po prečítaní evanjelia:",
            "CREDO – VYZNANIE VIERY",
            "PIÈRE UNIVERSELLE – SPOLOČNÉ MODLITBY VERIACICH<br><br><b>LITURGIE EUCHARISTIQE – LITURGIA EUCHARISTIE</b><br>",
            "PIÈRE SUR LES OFFRANDES – MODLITBA NAD OBETNÝMI DARMI.<br><br>PREÉFACE – PREFÁCIA",
            "PEIÈRE EUCHARISTIQUE – EUCHARISTICKÁ MODLITBA<br>Po premenení:",
            "COMMUNION – OBRAD PRIJÍMANIA",
            "AGNEAU DE DIEU – BARÁNOK BOŽÍ",
            "PRIÈRE APRÈS LA COMMUNION – MODLITBA PO PRIJÍMANÍ<br><br><b>CONCLUSION ET ENVOI - ZÁVEREČNÉ OBRADY</b><br>"
    };

    String[][] French_vypis = {
            {"Au nom du Père, et du Fils, et du Saint-Esprit.", "V mene Otca i Syna i Ducha Svätého."},
            {"Amen."},
            {"Le Seigneur soit avec vous.", "Pán s vami"},
            {"Et avec votre esprit.", "I s duchom Tvojím.\n"},
            {"Préparons-nous à la célébration de l'Eucharistie en reconnaissant que nous sommes pécheurs.",
                    "Bratia a sestry, uznajme svoje hriechy, aby sme mohli s čistým srdcom sláviť sväté tajomstvá."},
            {"Je confesse à Dieu tout-puissant,\n" +
                    "je reconnais devant mes frères,\n" +
                    "que j'ai péché\n" +
                    "en pensée, en parole,\n" +
                    "par action et par omission,\n" +
                    "oui, j'ai vraiment péché.\n" +
                    "C'est pourquoi je supplie\n" +
                    "la Vierge Marie,\n" +
                    "les anges et tous les saints,\n" +
                    "et vous aussi, mes frères,\n" +
                    "de prier pour moi\n" +
                    "le Seigneur notre Dieu.",
                    "Vyznávam všemohúcemu Bohu i vám, bratia a sestry, že som veľa zhrešil myšlienkami, slovami, skutkami a zanedbávaním dobrého. Moja vina, moja vina, moja preveľká vina. Preto prosím blahoslavenú Máriu, vždy Pannu, všetkých anjelov a svätých, i vás, bratia a sestry, modlite sa za mňa k Pánu Bohu nášmu."},
            {"Que Dieu tout-puissant nous fasse miséricorde; qu'il nous pardonne nos péchés et nous conduise à la vie éternelle.",
                    "Nech sa zmiluje nad nami všemohúci Boh, nech nám hriechy odpustí a privedie nás do života večného."},
            {"Amen.\n"},
            {"Seigneur, prends pitié.", "Pane, zmiluj sa."},
            {"Seigneur, prends pitié.", "Pane, zmiluj sa."},
            {"Ô Christ, prends pitié.", "Kriste, zmiluj sa."},
            {"Ô Christ, prends pitié.", "Kriste, zmiluj sa."},
            {"Seigneur, prends pitié.", "Pane, zmiluj sa."},
            {"Seigneur, prends pitié.", "Pane, zmiluj sa.\n"},
            {"Gloire à Dieu,\n" +
                    "au plus haut des cieux,\n" +
                    "et paix sur la terre\n" +
                    "aux hommes qu'il aime.\n" +
                    "Nous te louons, nous te bénissons,\n" +
                    "nous t'adorons, nous te glorifions,\n" +
                    "nous te rendons grâce,\n" +
                    "pour ton immense gloire,\n" +
                    "Seigneur Dieu, Roi du ciel,\n" +
                    "Dieu le Père tout-puissant.\n" +
                    "Seigneur, Fils unique, Jésus Christ,\n" +
                    "Seigneur Dieu, Agneau de Dieu,\n" +
                    "le Fils du Père;\n" +
                    "toi qui enlèves le péché du monde,\n" +
                    "prends pitié de nous;\n" +
                    "toi qui enlèves le péché du monde,\n" +
                    "reçois notre prière;\n" +
                    "toi qui es assis à la droite du Père,\n" +
                    "prends pitié de nous.\n" +
                    "Car toi seul es saint,\n" +
                    "toi seul es Seigneur,\n" +
                    "toi seul es le Très-Haut:\n" +
                    "Jésus Christ, avec le Saint-Esprit\n" +
                    "dans la gloire de Dieu le Père.\n" +
                    "Amen.\n"},
            {"Parole du Seigneur.", "Počuli sme Božie slovo."},
            {"Nous rendons grâce à Dieu.", "Bohu vďaka.\n"},
            {"Le Seigneur soit avec vous.", "Pán s vami."},
            {"Et avec votre esprit.", "I s duchom tvojím."},
            {"Evangile de Jésus-Christ selon saint...", "Čítanie zo svätého evanjelia podľa..."},
            {"Gloire à toi, Seigneur.", "Sláva tebe, Pane.\n"},
            {"Acclamons la Parole de Dieu.", "Počuli sme slovo Pánovo."},
            {"Louange à toi, Seigneur Jésus.", "Chvála tebe, Kriste.\n"},
            {"Je crois en un seul Dieu,\n" +
                    "Le Père tout-puissant,\n" +
                    "créateur du ciel et de la terre,\n" +
                    "de l'univers visible et invisible.\n" +
                    "Je crois en un seul Seigneur,\n" +
                    "Jésus Christ, le Fils unique de Dieu,\n" +
                    "né du Père avant tous les siècles:\n" +
                    "Il est Dieu, né de Dieu,\n" +
                    "lumière, née de la lumière,\n" +
                    "vrai Dieu, né du vrai Dieu.\n" +
                    "Engendré, non pas créé,\n" +
                    "de même nature que le Père;\n" +
                    "et par lui tout a été fait.\n" +
                    "Pour nous les hommes, et pour\n" +
                    "notre salut, il descendit du ciel.\n" +
                    "Par l'Esprit Saint,\n" +
                    "il a pris chair de la Vierge Marie,\n" +
                    "et s'est fait homme.\n" +
                    "Crucifié pour nous\n" +
                    "sous Ponce Pilate,\n" +
                    "il souffrit sa Passion\n" +
                    "et fut mis au tombeau.\n" +
                    "Il ressuscita le troisième jour,\n" +
                    "conformément aux Écritures,\n" +
                    "et il monta au ciel;\n" +
                    "il est assis à la droite du Père.\n" +
                    "Il reviendra dans la gloire,\n" +
                    "pour juger les vivants et les morts;\n" +
                    "et son règne n'aura pas de fin.\n" +
                    "Je crois en l'Esprit Saint,\n" +
                    "qui est Seigneur et qui donne la vie;\n" +
                    "il procède du Père et du Fils;\n" +
                    "avec le Père et le Fils\n" +
                    "il reçoit même adoration\n" +
                    "et même gloire;\n" +
                    "il a parlé par les prophètes.\n" +
                    "Je crois en l'Eglise, une, sainte,\n" +
                    "catholique et apostolique.\n" +
                    "Je reconnais un seul baptême\n" +
                    "pour le pardon des péchés.\n" +
                    "J'attends la résurrection des morts,\n" +
                    "et la vie du monde à venir.\n" +
                    "Amen.\n"},
            {"Tu es béni, Dieu de l'univers, toi qui nous donnes ce pain, fruit de la terre et du travail des hommes; nous te le présentons: il deviendra le pain de la vie.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali tento chlieb. Obetujeme ho tebe ako plod zeme a práce ľudských rúk, aby sa nám stal chlebom života."},
            {"Béni soit Dieu, maintenant et toujours.", "Zvelebený Boh naveky!"},
            {"Tu es béni, Dieu de l’univers, toi qui nous donnes ce vin, fruit de la vigne et du travail des hommes; nous te le présentons: il deviendra le vin du Royaume éternel.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali toto víno. Obetujeme ho tebe ako plod viniča a práce ľudských rúk, aby sa nám stalo duchovným nápojom."},
            {"Béni soit Dieu, maintenant et toujours.", "Zvelebený Boh naveky!\n"},
            {"Prions ensemble, au moment d'offrir le sacrifice de toute l'Église.",
                    "Modlite sa, bratia a sestry, aby sa moja i vaša obeta zaľúbila Bohu Otcu všemohúcemu."},
            {"Pour la gloire de Dieu et le salut du monde.",
                    "Nech Pán prijeme obetu z tvojich rúk na chválu a slávu svojho mena, na úžitok nám i celej svätej Cirkvi.\n"},
            {"Le Seigneur soit avec vous.", "Pán s vami."},
            {"Et avec votre esprit.", "I s duchom tvojím."},
            {"Elevons notre coeur.", "Hore srdcia"},
            {"Nous le tournons vers le Seigneur.", "Máme ich u Pána."},
            {"Rendons grâce au Seigneur notre Dieu.", "Vzdávajme vďaky Pánovi, Bohu nášmu."},
            {"Cela est juste et bon.", "Je to dôstojné a správne.\n"},
            {"Saint, Saint, Saint\n" +
                    "le Seigneur, Dieu de l'univers.\n" +
                    "Le ciel et la terre sont remplis\n" +
                    "de ta gloire.\n" +
                    "Hosanna au plus haut des cieux.\n" +
                    "Béni soit celui qui vient\n" +
                    "au nom du Seigneur.\n" +
                    "Hosanna au plus haut des cieux.\n"},
            {"Il est grand le mystère de la foi.", "Hľa, tajomstvo viery."},
            {"Nous proclamons ta mort, Seigneur Jésus, nous célébrons ta résurrection, nous attendons ta venue dans la gloire.",
                    "Smrť tvoju, Pane, zvestujeme a tvoje zmŕtvychvstanie vyznávame, kým neprídeš v sláve."},
            {""},
            {"Nous rappelons ta mort, Seigneur ressuscité, et nous attendons que tu viennes.",
                    "Pane, keď jeme tento chlieb a pijeme z tohto kalicha, zvestujeme tvoju smrť, kým neprídeš v sláve."},
            {""},
            {"Gloire à toi qui étais mort, gloire à toi qui es vivant, notre Sauveur et notre Dieu: Viens, Seigneur Jésus!",
                    "Spasiteľ sveta, zachráň nás, veď ty si nás vykúpil svojím krížom a zmŕtvychvstaním.\n"},
            {"Comme nous l'avons appris du Sauveur et selon son commandement, nous osons dire:",
                    "Na príkaz nášho spasiteľa a podľa jeho božského učenia osmeľujeme sa povedať:"},
            {"Notre Père, qui es aux cieux, \n" +
                    "que ton nom soit sanctifié; \n" +
                    "que ton règne vienne, \n" +
                    "que ta volonté soit faite\n" +
                    "sur la terre comme au ciel. \n" +
                    "Donne-nous aujourd'hui\n" +
                    "notre pain de ce jour. \n" +
                    "Pardonne-nous nos offenses, \n" +
                    "comme nous pardonnons aussi\n" +
                    "à ceux qui nous ont offensés. \n" +
                    "Et ne nous soumets pas\n" +
                    "à la tentation, \n" +
                    "mais délivre-nous du Mal."},
            {"Délivre-nous de tout mal, Seigneur, et donne la paix à notre temps; par ta miséricorde, libère-nous du péché, rassure-nous devant les épreuves en cette vie où nous espérons le bonheur que tu promets et l'avènement de Jésus Christ, notre Sauveur."},
            {"Car c'est à toi qu'appartiennent le règne, la puissance et la gloire, pour les siècles des siècles.", "Lebo tvoje je kráľovstvo a moc i sláva naveky.\n"},
            {"Seigneur Jésus Christ, tu as dit à tes Apôtres: \"Je vous laisse la paix, je vous donne ma paix\"; ne regarde pas nos péchés mais la foi de ton Église; pour que ta volonté s’accomplisse, donne-lui toujours cette paix, et conduis-la vers l'unité parfaite, toi qui règnes pour les siècles des siècles."},
            {"Amen."},
            {"Que la paix du Seigneur soit toujours avec vous.", "Pokoj Pánov nech je vždy s vami."},
            {"Et avec votre esprit.", "I s duchom tvojím."},
            {"Frères et sœurs, dans la charité du Christ, donnez-vous la paix.", "Dajte si znak pokoja.\n"},
            {"Agneau de Dieu, qui enlèves le péché du monde, prends pitié de nous.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Agneau de Dieu, qui enlèves le péché du monde, prends pitié de nous.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Agneau de Dieu, qui enlèves le péché du monde, donne-nous la paix.",
                    "Baránok Boží, ty snímaš hriechy sveta: daruj nám pokoj."},
            {"Heureux les invités au repas du Seigneur! Voici l'Agneau de Dieu qui enlève le péché du monde.",
                    "Hľa, Baránok Boží, ktorý sníma hriechy sveta: daruj nám pokoj."},
            {"Seigneur, je ne suis pas digne de te recevoir; mais dis seulement une parole et je serai guéri.",
                    "Pane, nie som hoden, aby si vošiel pod moju strechu, ale povedz iba slovo a duša mi ozdravie."},
            {"Le corps du Christ.", "Telo Kristovo."},
            {"Amen.\n"},
            {"Le Seigneur soit avec vous.", "Pán s vami."},
            {"Et avec votre esprit.", "I s duchom tvojím."},
            {"Que Dieu tout-puissant vous bénisse, le Père, le Fils <font color='#B71C1C'>†</font> et le Saint-Esprit.",
                    "Nech vás žehná všemohúci Boh, Otec i Syn † i Duch Svätý."},
            {"Amen."},
            {"Allez, dans la paix du Christ.", "Iďte v mene Božom."},
            {"Nous rendons grâce à Dieu.", "Bohu vďaka."},
            //Bonusove časti
            {"Quand nous mangeons ce pain et buvons à cette coupe, nous célébrons le mystère de la foi.", "Vyznajme Tajomstvo viery"},
            {"Proclamons le mystère de la foi.", "Veľké je tajomstvo viery."},
    };

    String[] English_nadpis = {
            "<b>THE INTRODUCTORY RITES – ÚVODNÉ OBRADY</b><br><br>THE ENTRANCE SONG – ÚVODNÝ SPEV",
            "THE GLORIA – GLÓRIA",
            "THE COLLECT – MODLIDBA DŇA<br><br><b>THE LITURGY OF THE WORD – LITURGIA SLOVA</b><br><br>READING – ČÍTANIE<br>Po prečítaní čítania:",
            "GOSPEL - EVANJELIUM",
            "Po prečítaní evanjelia:",
            "THE CREED – VYZNANIE VIERY",
            "THE PRAYER OF THE FAITHFUL – SPOLOČNÉ MODLITBY VERIACICH<br><br><b>THE LITURGY OF THE EUCHARIST – LITURGIA EUCHARISTIE</b><br>",
            "THE PLAYER OVER THE GIFTS – MODLITBA NAD OBETNÝMI DARMI.<br><br>PREFACE – PREFÁCIA",
            "THE EUCHARISTIC PLAYER – EUCHARISTICKÁ MODLITBA<br>Po premenení:",
            "THE COMMUNION RITE – OBRAD PRIJÍMANIA",
            "THE LAMB OF GOD – BARÁNOK BOŽÍ",
            "THE PLAYER AFTER COMMUNION – MODLITBA PO PRIJÍMANÍ<br><br><b>THE CONCLUDING RITE - ZÁVEREČNÉ OBRADY</b><br>"
    };

    String[][] English_vypis = {
            {"In the name of the Father, and of the Son, and of the Holy Spirit.", "V mene Otca i Syna i Ducha Svätého."},
            {"Amen."},
            {"The Lord be with you.", "Pán s vami."},
            {"And with your spirit.", "I s duchom Tvojím.\n"},
            {"My brothers and sisters, to prepare ourselves to celebrate the sacred mysteries, let us call to mind our sins.",
                    "Bratia a sestry, uznajme svoje hriechy, aby sme mohli s čistým srdcom sláviť sväté tajomstvá."},
            {"I confess to almighty God,\n" +
                    "and to you, my brothers and sisters,\n" +
                    "that I have greatly sinned,\n" +
                    "in my thoughts and in my words,\n" +
                    "in what I have done and in what I have failed to do,\n" +
                    "through my fault, through my fault,\n"+
                    "through my most grievous fault;\n"+
                    "therefore I ask blessed Mary ever-Virgin,\n" +
                    "all the Angels and Saints,\n" +
                    "and you, my brothers and sisters,\n" +
                    "to pray for me to the Lord our God.",
                    "Vyznávam všemohúcemu Bohu i vám, bratia a sestry, že som veľa zhrešil myšlienkami, slovami, skutkami a zanedbávaním dobrého. Moja vina, moja vina, moja preveľká vina. Preto prosím blahoslavenú Máriu, vždy Pannu, všetkých anjelov a svätých, i vás, bratia a sestry, modlite sa za mňa k Pánu Bohu nášmu."},
            {"May almighty God have mercy on us, forgive us our sins, and bring us to everlasting life.",
                    "Nech sa zmiluje nad nami všemohúci Boh, nech nám hriechy odpustí a privedie nás do života večného."},
            {"Amen.\n"},
            {"Lord, have mercy.", "Pane, zmiluj sa."},
            {"Lord, have mercy.", "Pane, zmiluj sa."},
            {"Christ, have mercy.", "Kriste, zmiluj sa."},
            {"Christ, have mercy.", "Kriste, zmiluj sa."},
            {"Lord, have mercy.", "Pane, zmiluj sa."},
            {"Lord, have mercy.", "Pane, zmiluj sa.\n"},
            {"Glory to God in the highest,\n" +
                    "and on earth peace to people\n" +
                    "of good will.\n" +
                    "We praise you,\n" +
                    "we bless you,\n" +
                    "we adore you,\n" +
                    "we glorify you,\n" +
                    "we give you thanks for your great glory,\n" +
                    "Lord God, heavenly King,\n" +
                    "O God, almighty Father.\n" +
                    "Lord Jesus Christ, Only Begotten Son,\n" +
                    "Lord God, Lamb of God,\n" +
                    "Son of the Father,\n" +
                    "you take away the sins of the world,\n" +
                    "have mercy on us;\n" +
                    "you take away the sins of the world,\n" +
                    "receive our prayer;\n" +
                    "you are seated at the right hand \n" +
                    "of the Father,\n" +
                    "have mercy on us.\n" +
                    "For you alone are the Holy One,\n" +
                    "you alone are the Lord,\n" +
                    "you alone are the Most High,\n" +
                    "Jesus Christ, with the Holy Spirit,\n" +
                    "in the glory of God the Father.\n" +
                    "Amen.\n"},
            {"The Word of the Lord.", "Počuli sme Božie slovo."},
            {"Thanks be to God.", "Bohu vďaka.\n"},
            {"The Lord be with you.", "Pán s vami."},
            {"And with your spirit.", "I s duchom tvojím."},
            {"A reading from the holy Gospel according to...", "Čítanie zo svätého evanjelia podľa..."},
            {"Glory to you, O Lord.", "Sláva tebe, Pane.\n"},
            {"The Gospel of the Lord.", "Počuli sme slovo Pánovo."},
            {"Praise to you, Lord Jesus Christ.", "Chvála tebe, Kriste.\n"},
            {"I believe in one God,\n" +
                    "the Father almighty,\n" +
                    "maker of heaven and earth,\n" +
                    "of all things visible and invisible.\n" +
                    "I believe in one Lord Jesus Christ,\n" +
                    "the Only Begotten Son of God,\n" +
                    "born before of the Father before all ages.\n" +
                    "God from God, Light from Light,\n" +
                    "true God from true God,\n" +
                    "begotten, not made,\n" +
                    "consubstantial with the Father;\n" +
                    "through him all things were made.\n" +
                    "For us men and for our salvation\n" +
                    "he came down from heaven,\n" +
                    "and by the Holy Spirit was incarnate\n" +
                    "of the Virgin Mary,\n" +
                    "and became man.\n" +
                    "For our sake he was crucified\n" +
                    "under Pontius Pilate,\n" +
                    "he suffered death and was buried,\n" +
                    "and rose again on the third day\n" +
                    "in accordance with the Scriptures.\n" +
                    "He ascended into heaven\n" +
                    "and is seated at the right hand\n" +
                    "of the Father.\n" +
                    "He will come again in glory\n" +
                    "to judge the living and the dead\n" +
                    "and his kingdom will have no end.\n" +
                    "I believe in the Holy Spirit,\n" +
                    "the Lord, the giver of life,\n" +
                    "who proceeds from the Father\n" +
                    "and the Son,\n" +
                    "who with the Father and the Son\n" +
                    "is adored and glorified,\n" +
                    "who has spoken through the prophets.\n" +
                    "I believe in one, holy, catholic\n" +
                    "and apostolic Church.\n" +
                    "I confess one Baptism\n" +
                    "for the forgiveness of sins\n" +
                    "and I look forward to the resurrection\n" +
                    "of the dead and the life of the world to come.\n" +
                    "Amen.\n"},
            {"Blessed are you, Lord God of all creation,\n" +
                    "for through your goodness we have received\n" +
                    "the bread we offer you:\n" +
                    "fruit of the earth and work of human hands,\n" +
                    "it will become for us the bread of life.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali tento chlieb. Obetujeme ho tebe ako plod zeme a práce ľudských rúk, aby sa nám stal chlebom života."},
            {"Blessed be God for ever.", "Zvelebený Boh naveky!"},
            {"Blessed are you, Lord God of all creation,\n" +
                    "for through your goodness we have received\n" +
                    "the wine we offer you:\n" +
                    "fruit of the vine and work of human hands\n" +
                    "it will become our spiritual drink.",
                    "Dobrorečíme ti, Bože, Pane svetov, že sme z tvojej štedrosti prijali toto víno. Obetujeme ho tebe ako plod viniča a práce ľudských rúk, aby sa nám stalo duchovným nápojom."},
            {"Blessed be God for ever.", "Zvelebený Boh naveky!\n"},
            {"Pray, brethren (brothers and sisters), that my sacrifice may be acceptable to God, the almighty Father.",
                    "Modlite sa, bratia a sestry, aby sa moja i vaša obeta zaľúbila Bohu Otcu všemohúcemu."},
            {"May the Lord accept the sacrifice at your hands for the praise and glory of his name, for our good and the good of all his holy Church.",
                    "Nech Pán prijeme obetu z tvojich rúk na chválu a slávu svojho mena, na úžitok nám i celej svätej Cirkvi.\n"},
            {"The Lord be with you.", "Pán s vami."},
            {"And with your spirit.", "I s duchom tvojím."},
            {"Lift up your hearts.", "Hore srdcia"},
            {"We lift them up to the Lord.", "Máme ich u Pána."},
            {"Let us give thanks to the Lord our God.", "Vzdávajme vďaky Pánovi, Bohu nášmu."},
            {"It is right and just.", "Je to dôstojné a správne.\n"},
            {"Holy, Holy, Holy Lord God of hosts.\n" +
                    "Heaven and earth are full of your glory.\n" +
                    "Hosanna in the highest.\n" +
                    "Blessed is he who comes\n" +
                    "in the name of the Lord.\n" +
                    "Hosanna in the highest.\n"},
            {"The mystery of faith.", "Hľa, tajomstvo viery."},
            {"We proclaim your Death, O Lord, and profess your Resurrection until you come again."},
            {""},
            {"When we eat this Bread and drink this Cup, we proclaim your Death, O Lord, until you come again.",
                    "Pane, keď jeme tento chlieb a pijeme z tohto kalicha, zvestujeme tvoju smrť, kým neprídeš v sláve."},
            {""},
            {"Save us, Saviour of the world, for by your Cross and Resurrection you have set us free.",
                    "Spasiteľ sveta, zachráň nás, veď ty si nás vykúpil svojím krížom a zmŕtvychvstaním.\n"},
            {"At the Saviour's command and formed by divine teaching, we dare to say:",
                    "Na príkaz nášho spasiteľa a podľa jeho božského učenia osmeľujeme sa povedať:"},
            {"Our Father, who art in heaven,\n" +
                    "hallowed be thy name;\n" +
                    "thy kingdom come;\n" +
                    "thy will be done\n" +
                    "on earth as it is in heaven.\n" +
                    "Give us this day our daily bread,\n" +
                    "and forgive us our trespasses,\n" +
                    "as we forgive those who trespass\n" +
                    "against us;\n" +
                    "and lead us not into temptation,\n" +
                    "but deliver us from evil.\n"},
            {"Deliver us, Lord, we pray, from every evil, graciously grant peace in our days, that, by the help of your mercy, we may be always free from sin and safe from all distress, as we await the blessed hope and the coming of our Saviour, Jesus Christ."},
            {"For the kingdom, the power and the glory are yours now and for ever.", "Lebo tvoje je kráľovstvo a moc i sláva naveky.\n"},
            {"Lord Jesus Christ, who said to your Apostles, Peace I leave you, my peace I give you, Look not on our sins, but on the faith of your Church, and graciously grant her peace and unity in accordance with your will. Who live and reign forever and ever."},
            {"Amen."},
            {"The Peace of the Lord be with you always.", "Pokoj Pánov nech je vždy s vami."},
            {"And with your spirit.", "I s duchom tvojím."},
            {"Let us offer each other the sign of peace.", "Dajte si znak pokoja.\n"},
            {"Lamb of God, you take away the sins of the world, have mercy on us.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Lamb of God, you take away the sins of the world, have mercy on us.",
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n",
                    "Lamb of God, you take away the sins of the world, grant us peace.",
                    "Baránok Boží, ty snímaš hriechy sveta: daruj nám pokoj."},
            {"Behold the Lamb of God, behold him who takes away the sins of the world. Blessed are those called to the supper of the Lamb.",
                    "Hľa, Baránok Boží, ktorý sníma hriechy sveta: daruj nám pokoj."},
            {"Lord, I am not worthy you that you should enter under my roof, but only say the word and my soul shall be healed.",
                    "Pane, nie som hoden, aby si vošiel pod moju strechu, ale povedz iba slovo a duša mi ozdravie."},
            {"The Body (Blood) of Christ.", "Telo Kristovo."},
            {"Amen.\n"},
            {"The Lord be with you.", "Pán s vami."},
            {"And with your spirit.", "I s duchom tvojím."},
            {"May almighty God bless you, the Father, and the Son, <font color='#B71C1C'>†</font> and the Holy Spirit.",
                    "Nech vás žehná všemohúci Boh, Otec i Syn † i Duch Svätý."},
            {"Amen."},
            {"Go forth, the Mass is ended. Go and announce the Gospel of the Lord. Go in peace, glorifying the Lord by your life. Go in peace.", "Iďte v mene Božom."},
            {"Thanks be to God.", "Bohu vďaka."},
            //Bonusove časti
            {"The mystery of faith.", "Hľa tajomstvo viery."},
            {"The mystery of faith.", "Hľa tajomstvo viery."},
    };
}
