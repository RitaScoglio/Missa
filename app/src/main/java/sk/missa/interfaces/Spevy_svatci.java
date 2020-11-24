package sk.missa.interfaces;

/*
 * Spevy na sviatky svätých uložené v dvojrozmerných poliach za každý mesiac: spev1, spev2, spev3...
 * {ID sviatku (podľa mesiacov v interface Svatci), úvodný spev - text, úvodný spev - súradnice, spev po prijímaní - text, spev po prijímaní - súradnice},
 * Spevy pre pohyblivé sviatky: spevPohyb
 * {ID sviatku (podľa interface Svatci), cirkevný rok (A/B/C), úvodný spev - text, úvodný spev - súradnice, spev po prijímaní - text, spev po prijímaní - súradnice},
 *
 * Keďže sú spevy v adventnom a vianočnom období viazané na deň, nachádzajú sa uložené v mesiaci, ktorému prislúchajú a s dňom ako ID
 */

public interface Spevy_svatci {
    String[][] spevPohyb = {
            {"6gkp", "", "Mužovia galilejskí, čo tak udivene hľadíte do neba?<br>" +
                    "Ježiš, ktorý vystúpil na nebesia,<br>" +
                    "príde raz tak, ako ste ho videli odchádzať. Aleluja.", "(Porov. Sk 1, 11)",
                    "Pán Ježiš povedal: Hľa, ja som s vami po všetky dni,<br>" +
                            "až do skončenia sveta. Aleluja.", "(Mt 28, 20)"},
            {"2gkp", "", "V našich srdciach sa rozlieva Božia láska<br>" +
                    "skrze Ducha Svätého, ktorý je nám daný. Aleluja.", "(Porov. Rim 5, 5; 8, 11)",
                    "V posledný, veľký deň sviatku<br>" +
                            "Ježiš vstal a zvolal: Ak je niekto smädný,<br>" +
                            "nech príde ku mne a nech pije. Aleluja.", "(Jn 7, 37)"},
            {"3gkp", "", "Duch Boží napĺňa celý svet;<br>" +
                    "on všetko udržiava<br>" +
                    "a pozná každú reč. Aleluja.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Rim 5, 5; 8, 11)</font><br>" +
                    "V našich srdciach sa rozlieva Božia láska<br>" +
                    "skrze Ducha Svätého, ktorý je nám daný. Aleluja.", "(Múd 1, 7)",
                    "Všetci boli naplnení Duchom Svätým<br>" +
                            "a začali ohlasovať veľké Božie skutky. Aleluja.", "(Sk 2, 4. 11)"},
            {"0gkp", "", "Hľa, toto je verný a spravodlivý služobník,<br>" +
                    "ktorého Pán ustanovil nad svojou rodinou.", "(Porov. Lk 12, 42)",
                    "Dobrý a verný služobník,<br>" +
                            "poď na radostnú hostinu svojho Pána.", "(Mt 25, 21)"},
            {"1gkp", "", "Keď Kristus prichádzal na tento svet, povedal svojmu Otcovi:<br>" +
                    "Bože, hľa, tu som, a chcem plniť tvoju vôľu.", "(Porov. Hebr 10, 5. 7)",
                    "Hľa, Panna počne a porodí Syna,<br>" +
                            "a dajú mu meno Emanuel, čo značí: Boh s nami.", "(Iz 7, 14)"},
            {"2p", "", "Všetci zotrvávali jednomyseľne v modlitbách<br>" +
                    "spolu s Máriou, Ježišovou matkou.", "(Porov. Sk 1, 14)",
                    "V Káne Galilejskej bola svadba. Bola tam aj Ježišova matka.<br>" +
                            "Vtedy urobil Ježiš prvý zázrak a zjavil svoju moc.<br>" +
                            "A jeho učeníci uverili v neho.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Jn 19, 26-27)</font><br>" +
                            "Pán Ježiš, pribitý na kríži,<br>" +
                            "povedal učeníkovi, ktorého miloval: Hľa, tvoja matka.", "(Porov. Jn 2, 1.11)"},
            {"3gp", "", "Kristus, prostredník novej zmluvy,<br>" +
                    "ktorý zostáva naveky,<br>" +
                    "má večné kňazstvo.", "(Porov. Hebr 7, 24; 9, 15)",
                    "Hľa, ja som s vami po všetky dni<br>" +
                            "až do skončenia sveta.", "(Mt 28, 20b)"},
            {"7gkp", "", "Nech je zvelebený Boh:<br>" +
                    "Otec, jeho jednorodený Syn i Duch Svätý,<br>" +
                    "lebo nám preukázal svoju milosrdnú lásku.", "",
                    "Pretože ste synovia, poslal nám Boh do sŕdc<br>" +
                            "Ducha svojho Syna, a ten volá: \"Abba, Otče!\"", "(Gal 4, 6)"},
            {"4gkp", "", "Boh živil svoj ľud pšeničným chlebom<br>" +
                    "a sýtil ho lesným medom.<br>" +
                    "<font color='#B71C1C'>Alebo: (Jn 6, 55)</font><br>" +
                    "Moje telo je pravý pokrm<br>" +
                    "a moja krv je pravý nápoj, hovorí Pán.", "(Porov. Ž 80, 17)",
                    "Pán Ježiš povedal:<br>" +
                            "Kto je moje telo a pije moju krv,<br>" +
                            "ostáva vo mne a ja v ňom.", "(Jn 6, 57)"},
            {"5gkp", "", "Pánove úmysly sú večné, zámery jeho srdca trvajú naveky.<br>" +
                    "Chráni svojich pred smrťou a nasycuje ich v čase hladu.<br>" +
                    "<font color='#B71C1C'>Alebo: (Ef 3, 19) </font><br>" +
                    "Spoznáte Kristovu lásku, presahujúcu všetko poznanie,<br>" +
                    "a naplní vás všetka plnosť Božia.", "(Porov. Ž 32, 11. 19)",
                    "Pán Ježiš hovorí: Ak je niekto smädný,<br>" +
                            "nech príde ku mne a nech pije.<br>" +
                            "A z vnútra toho, kto verí vo mňa, potečú prúdy živej vody.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 19, 34)</font><br>" +
                            "Jeden z vojakov prebodol kopijou Ježišovi bok,<br>" +
                            "a hneď vyšla krv a voda.", "(Jn 7, 37-38)"},
            {"4p", "", "Moje srdce sa teší z tvojej pomoci.<br>" +
                    "Spievať budem Pánovi, že ma zahŕňa dobrodeniami.", "(Ž 12, 6)",
                    "Mária všetky tieto udalosti chránila hlboko v srdci<br>" +
                            "a premýšľala o nich.", "(Lk 2, 19)"},
            {"8gkp", "", "Hoden je Baránok, ktorý bol zabitý,<br>" +
                    "prijať moc a bohatstvo, múdrosť a silu,<br>" +
                    "česť a slávu a chválu.<br>" +
                    "Jemu sláva a moc na večné veky.", "(Zjv 5, 12; 1. 6)",
                    "Pán tróni ako večný kráľ,<br>" +
                            "požehná svoj ľud pokojom.", "(Ž 28, 10-11)"},
            //8. decembra - NEPOŠKVRNENÉ POČATIE PANNY MÁRIE
            {"9gkp", "", "Radosťou oplývam v Pánovi a duša mi plesá v Bohu,<br>" +
                    "lebo ma obliekol do rúcha spásy<br>" +
                    "a priodial ma plášťom svätosti<br>" +
                    "ako nevestu ozdobenú šperkami.", "(Iz 61, 10)",
                    "Preslávne veci hovoria sa o tebe, Mária,<br>" +
                            "lebo z teba vyšlo Slnko spravodlivosti,<br>" +
                            "Kristus, náš Boh.", ""},
            //SVÄTEJ RODINY JEŽIŠA, MÁRIE A JOZEFA
           {"10gkp", "", "Pastieri sa poponáhľali<br>" +
                   "a našli Máriu a Jozefa i Nemluvňa uložené v jasliach.","(Lk 2, 16)",
                   "Náš Boh sa zjavil na zemi<br>" +
                           "a prebýval medzi nami.","(Bar 3, 38)"},
            //Nedeľa po 6. januári - KRST KRISTA PÁNA
            {"11gkp", "", "Keď bol Ježiš pokrstený, otvorili sa nebesia;<br>" +
                    "Duch Svätý sa vznášal nad nim v podobe holubice a zaznel Otcov hlas:<br>" +
                    "Toto je môj milovaný Syn, v ktorom mám zaľúbenie.", "(Porov. Mt 3, 16-17)",
                    "Toto je ten, o ktorom Ján povedal:<br>" +
                            "Videl som a dosvedčujem, že on je Syn Boží.", "(Jn 1, 32. 34)"},
    };

    String[][] spev1 = {
            {"01gk", "Zdravas, svätá Matka.<br>" +
                    "Ty si porodila Kráľa, ktorý večne riadi nebo i zem.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. lz 9, 2. 6; Lk 1, 33)</font><br>" +
                    "Dnes zažiarilo nad nami svetlo, lebo sa nám narodil Pán.<br>" +
                    "Bude sa volať: Mocný Boh, Knieža pokoja,<br>" +
                    "Otec budúceho veku. Jeho kráľovstvo sa nikdy neskončí.", "(Sedulius)",
                    "Ježiš Kristus je ten istý včera i dnes a naveky.", "(Hebr 13, 8)"},
            {"06gk", "Hla, prichádza Pán, náš Kráľ;<br>" +
                    "v jeho rukách je kráľovstvo, moc a sláva.", "(Porov. Mal 3, 1; 1 Krn 19, 12)",
                    "Videli sme jeho hviezdu na východe<br>" +
                            "a prišli sme s darmi klaňať sa Pánovi.", "(Porov. Mt 2, 2)"},
            {"17", "Spravodlivý sťa palma zakvitne<br>" +
                    "a vyrastie sťa céder z Libanonu.<br>" +
                    "Tí, čo sú zasadení v dome Pánovom,<br>" +
                    "v nádvoriach nášho Boha budú prekvitať.", "(Ž 91, 13-14)",
                    "Pán Ježiš hovorí: Ak chceš byť dokonalý, choď, predaj, čo máš,<br>" +
                            "rozdaj chudobným, a nasleduj ma.", "(Mt 19, 21)"},
            {"25g", "Viem, komu som uveril,<br>" +
                    "a som presvedčený, že Pán, spravodlivý Sudca,<br>" +
                    "dá mi odmenu v deň svojho príchodu.", "(Porov. 2 Tim 1, 12; 4, 8)",
                    "Žijem vo viere v Syna Božieho,<br>" +
                            "ktorý si ma zamiloval<br>" +
                            "a seba samého obetoval za mňa.", "(Gal 2,20)"},
    };

    String[][] spev2 = {
            {"02g", "Pripomíname si, Bože, tvoje milosrdenstvo<br>" +
                    "uprostred tvojho chrámu.<br>" +
                    "Ako tvoje meno, Bože, tak aj tvoja sláva<br>" +
                    "šíri sa až do končín zeme;<br>" +
                    "tvoja pravica je plná spravodlivosti.", "(Ž 47, 10-11)",
                    "Moje oči uvideli spásu,<br>" +
                            "ktorú si pripravil pred tvárou všetkých národov.", "(Lk 2, 30-31)"},
            {"14o", "Toto sú svätí, Boží priatelia.<br>" +
                    "slávni hlásatelia Božej pravdy.", "",
                    "Učeníci sa rozišli a hlásali evanjelium. <br>" +
                            "Pán im pomáhal a ich slová potvrdzoval znameniami,<br>" +
                            "ktoré ich sprevádzali.", "(Porov. Mk 16, 20)"},
            {"14g+", "Toto sú svätí, Boží priatelia.<br>" +
                    "slávni hlásatelia Božej pravdy.", "",
                    "Učeníci sa rozišli a hlásali evanjelium. <br>" +
                            "Pán im pomáhal a ich slová potvrdzoval znameniami,<br>" +
                            "ktoré ich sprevádzali.", "(Porov. Mk 16, 20)"},
            {"22g", "Pán Ježiš hovorí Šimonovi Petrovi:<br>" +
                    "Ja som prosil za teba, aby si neochabol vo viere;<br>" +
                    "a ty, keď sa raz obrátiš, posilňuj svojich bratov.", "(Lk 22, 32)",
                    "Peter povedal Ježišovi:<br>" +
                            "Ty si Kristus, Syn živého Boha.<br>" +
                            "Ježiš mu odpovedal:<br>" +
                            "Ty si Peter, a na tejto skale postavím svoju Cirkev.", "(Mt 16, 16.18)"},
    };

    String[][] spev3 = {};

    String[][] spev4 = {
            {"23", "Pán hovorí: Povolám si verného kňaza,<br>" +
                    "ktorý bude konať podľa môjho srdca<br>" +
                    "a podľa môjho zmýšľania. Aleluja.", "(1 Sam 2, 35)",
                    "Dostanete silu a budete mi svedkami<br>" +
                            "vo svojej vlasti aj na celom svete. Aleluja.", "(Porov. Sk 1, 8)"},
            {"25g", "Iďte do celého sveta<br>" +
                    "a ohlasujte evanjelium všetkému stvoreniu, aleluja.", "(Mk 16, 15)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ja som s vami po všetky dni<br>" +
                            "až do skončenia sveta. Aleluja.", "(Mt 28, 20)"},
            {"29g", "Dnes oslavujeme múdru a rozumnú pannu,<br>" +
                    "ktorá s horiacou lampou vyšla v ústrety Kristovi. Aleluja.", "",
                    "Ak žijeme vo svetle, ako Boh je vo svetle,<br>" +
                            "tvoríme spoločenstvo medzi sebou,<br>" +
                            "a krv Ježiša Krista, jeho Syna,<br>" +
                            "nás očisťuje od každého hriechu. Aleluja.", "(1 Jn 1, 7)"},
    };

    String[][] spev5 = {
            {"01", "Blažený každý, čo sa bojí Pána<br>" +
                    "a kráča po jeho cestách.<br>" +
                    "Budeš jesť z práce svojich rúk;<br>" +
                    "budeš šťastný a budeš sa mať dobre. Aleluja.", "(Ž 127, 1-2)",
                    "Čokoľvek hovoríte alebo konáte,<br>" +
                            "všetko robte v mene Pána Ježiša Krista<br>" +
                            "a skrze neho ďakujte Bohu Otcovi.", "(Kol 3, 17)"},
            {"03g", "Oslavujeme svätých apoštolov Filipa a Jakuba,<br>" +
                    "ktorých si Pán vo svojej nesmiernej láske vyvolil<br>" +
                    "a dal im večnú slávu. Aleluja.", "",
                    "Pane, ukáž nám Otca a to nám postačí.<br>" +
                            "Filip, kto mňa vidí, vidí aj Otca. Aleluja.", "(Jn 14, 8-9)"},
            {"14g", "Nie vy ste si vyvolili mňa, ale ja som si vyvolil vás,<br>" +
                    "aby ste šli a prinášali ovocie a vaše ovocie aby zostalo. Aleluja.", "(Jn 15, 16)",
                    "Pán Ježiš hovorí: Toto je moje prikázanie,<br>" +
                            "aby ste sa navzájom milovali, ako som ja miloval vás.", "(Jn 15, 12)"},
            {"16", "Oslavujme svätca, ktorý za Boží zákon položil svoj život<br>" +
                    "a nebál sa hrozieb bezbožných ľudí;<br>" +
                    "mal totiž základy na pevnej skale.", "",
                    "Ani smrť, ani život, ani nijaké stvorenie<br>" +
                            "nemôže nás odlúčiť od Kristovej lásky.", "(Porov. Rim 8, 38-39)"},
            {"16g", "Oslavujme svätca, ktorý za Boží zákon položil svoj život<br>" +
                    "a nebál sa hrozieb bezbožných ľudí;<br>" +
                    "mal totiž základy na pevnej skale.", "",
                    "Ani smrť, ani život, ani nijaké stvorenie<br>" +
                            "nemôže nás odlúčiť od Kristovej lásky.", "(Porov. Rim 8, 38-39)"},
    };

    String[][] spev6 = {
            {"01", "Pyšní mi rozprávali výmysly,<br>" +
                    "lebo nepoznajú tvoj zákon;<br>" +
                    "ja však o tvojej náuke budem svedčiť pred kráľmi<br>" +
                    "a nebudem sa hanbiť. (Aleluja.)", "(Porov. Ž 118, 85. 46)",
                    "Rozhodol som sa,<br>" +
                            "že nechcem medzi vami vedieť nič iné<br>" +
                            "okrem Ježiša Krista, a to ukrižovaného.", "(1 Kor 2, 2)"},
            {"11", "Barnabáš bol znamenitý muž, plný Ducha Svätého a viery;<br>" +
                    "je blažený, lebo si zaslúžil byť pripočítaný k apoštolom.", "(Porov. Sk 11, 24)",
                    "Už vás nenazývam sluhami,<br>" +
                            "lebo sluha nevie, čo robí jeho pán.<br>" +
                            "Nazval som vás priateľmi,<br>" +
                            "pretože som vám oznámil všetko, čo som počul od svojho Otca.", "(Jn 15, 15)"},
            {"21", "Ten, čo má ruky nevinné a srdce čisté, vystúpi na vrch Pánov<br>" +
                    "a bude stáť na jeho mieste posvätnom.", "(Porov. Ž 23, 4. 3)",
                    "Dal im chlieb z neba. Človek jedol chlieb anjelský.", "(Ž 77, 24-25)"},
            {"23gk", "Ján bude veľký pred Pánom<br>" +
                    "a ešte v lone svojej matky bude naplnený Duchom Svätým;<br>" +
                    "jeho narodenie mnohých poteší.", "(Porov. Lk 1, 15. 14)",
                    "Zvelebený Pán, Boh Izraela,<br>" +
                            "lebo zahliadol na svoj ľud a vykúpil ho.", "(Lk 1, 68)"},
            {"24gk", "Narodil sa človek, ktorého poslal Boh.<br>" +
                    "Volal sa Ján.<br>" +
                    "Prišiel ako svedok svedčiť o Svetle<br>" +
                    "a pripraviť Pánovi dokonalý ľud.", "(Jn l, 6-7; Lk l, 17)",
                    "Vďaka milosrdnej láske nášho Boha navštívilo nás Slnko z výsosti<br>" +
                            "- Ježiš Kristus, náš Pán.", "(Porov. Lk 1, 78)"},
            {"28gk", "Apoštol Peter a učiteľ národov Pavol<br>" +
                    "poučili nás, Pane, o tvojom zákone.", "",
                    "Šimon, syn Jánov, miluješ ma väčšmi ako títo?<br>" +
                            "Pane, ty všetko vieš, ty vieš, že ťa milujem.", "(Jn 21, 15. 17)"},
            {"29gk", "Oslavujeme apoštolov, ktorí položili základy Cirkvi<br>" +
                    "a zvlažili ich vlastnou krvou;<br>" +
                    "pili z kalicha Pánovho utrpenia<br>" +
                    "a stali sa Božími priateľmi.", "",
                    "Peter povedal Ježišovi:<br>" +
                            "Ty si Kristus, Syn živého Boha.<br>" +
                            "Ježiš mu povedal:<br>" +
                            "Ty si Peter, a na tejto Skale postavím svoju Cirkev.", "(Mt 16, 16. 18)",},
    };

    String[][] spev7 = {
            {"02gm", "Poďte sem a počúvajte, všetci ctitelia Boží,<br>" +
                    "vyrozprávam vám, aké veľké veci mi urobil Pán.", "(Ž 65, 16)",
                    "Blahoslaviť ma budú všetky pokolenia,<br>" +
                            "lebo veľké veci mi urobil ten, ktorý je mocný<br>" +
                            "a sväté je jeho meno.", "(Lk 1, 48 – 49)"},
            {"03g", "Ty si môj Boh, vďaky ti vzdávam; <br>" +
                    "ty si môj Boh, velebím ťa.<br>" +
                    "Ďakujem ti, že si ma zachránil.", "(Ž 117, 28. 21)",
                    "Daj ruku a vlož ju do môjho boku a nebuď neveriaci, ale veriaci.", "(Porov. Jn 20, 27)"},
            {"05gk", "Čujte slovo, slovo Boha; <br>" +
                    "slovo, ktoré sýti ľudské duše;<br>" +
                    "slovo, ktoré posilňuje srdce i rozum; <br>" +
                    "slovo, ktoré učí poznávať Boha.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Radujme sa všetci v Pánovi<br>" +
                    "a slávme sviatok na počesť svätého Cyrila a Metoda.<br>" +
                    "Z ich oslávenia radujú sa anjeli <br>" +
                    "a spolu s nimi velebia Syna Božieho.", "(Proglas, 24 - 27)",
                    "Pánovo slovo sa šírilo po celom kraji.", "(Sk 13, 49)"},
            {"17", "Oslavujme svätých, ktorí dostali požehnanie od Pána<br>" +
                    "a odmenu od Boha, svojho Spasiteľa,<br>" +
                    "lebo sú z pokolenia, ktoré hľadá Boha.", "(Porov. Ž 23, 5 - 6)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ak chceš byť dokonalý, choď, predaj, čo máš,<br>" +
                            "rozdaj chudobným a nasleduj ma.", "(Mt 19, 21)"},
            {"17g", "Oslavujme svätých, ktorí dostali požehnanie od Pána<br>" +
                    "a odmenu od Boha, svojho Spasiteľa,<br>" +
                    "lebo sú z pokolenia, ktoré hľadá Boha.", "(Porov. Ž 23, 5 - 6)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ak chceš byť dokonalý, choď, predaj, čo máš,<br>" +
                            "rozdaj chudobným a nasleduj ma.", "(Mt 19, 21)"},
            {"17gk", "Oslavujme svätých, ktorí dostali požehnanie od Pána<br>" +
                    "a odmenu od Boha, svojho Spasiteľa,<br>" +
                    "lebo sú z pokolenia, ktoré hľadá Boha.", "(Porov. Ž 23, 5 - 6)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ak chceš byť dokonalý, choď, predaj, čo máš,<br>" +
                            "rozdaj chudobným a nasleduj ma.", "(Mt 19, 21)"},
            {"22g", "Zmŕtvychvstalý Pán Ježiš povedal Márii Magdaléne:<br>" +
                    "Choď k mojim bratom a povedz im:<br>" +
                    "Vystupujem k svojmu Otcovi a vášmu Otcovi,<br>" +
                    "k svojmu Bohu a vášmu Bohu.", "(Porov. Jn 20, 17)",
                    "Kristova láska nás roznecuje,<br>" +
                            "aby aj tí, čo žijú, už nežili pre seba,<br>" +
                            "ale pre toho, ktorý za nich zomrel a vstal z mŕtvych.", "(2 Kor 5, 14 – 15)"},
            {"23g", "Radujme sa všetci v Pánovi<br>" +
                    "a slávme sviatok na počesť svätej Brigity;<br>" +
                    "z jej oslávenia sa radujú anjeli a spolu s ňou velebia Božieho Syna.", "",
                    "Miluješ spravodlivosť a nenávidíš neprávosť,<br>" +
                            "preto ťa Boh, tvoj Boh,<br>" +
                            "pomazal olejom radosti viac ako tvojich druhov.", "(Ž 45, 8)"},
            {"25g", "Keď Ježiš išiel popri Galilejskom mori,<br>" +
                    "videl Jakuba, Zebedejovho syna,<br>" +
                    "a jeho brata Jána, ako si opravovali siete, a povolal ich.", "(Porov. Mt 4, 18. 21)",
                    "Pili z kalicha utrpenia Pánovho<br>" +
                            "a stali sa Božími priateľmi.", "(Porov. Mt 20, 22 – 23)"},
            {"26", "Oslavujme Joachima a Annu,<br>" +
                    "rodičov Matky Božej,<br>" +
                    "lebo prostredníctvom nich Pán požehnal všetky národy.", "",
                    "Prijali požehnanie od Pána<br>" +
                            "a milosrdenstvo od Boha, svojho Spasiteľa.", "(Porov. Ž 23, 5)"},
            {"27", "Oslavujme svätých, ktorí dostali požehnanie od Pána<br>" +
                    "a odmenu od Boha, svojho Spasiteľa,<br>" +
                    "lebo sú z pokolenia, ktoré hľadá Boha.<br>" +
                    "<font color='#B71C1C'>Alebo: (Jer 3, 15)</font><br>" +
                    "Dám vám pastierov podľa môjho srdca,<br>" +
                    "budú vás viesť rozumne a múdro.", "(Porov. Ž 23, 5 - 6)",
                    "Pán Ježiš hovorí:<br>" +
                            "Poďte ku mne všetci, ktorí sa namáhate a ste unavení, a ja vás posilním.", "(Mt 11, 28)"},
            {"29", "Ježiš vošiel do jednej dediny<br>" +
                    "a tam ho prijala do svojho domu istá žena menom Marta.", "(Lk 10, 38)",
                    "Marta povedala Ježišovi: Ty si Kristus, Syn Boží, ktorý má prísť na svet.", "(Jn 11, 27)"},
            {"31", "Nech sa na meno Ježiš zohne každé koleno v nebi, na zemi i v podsvetí<br>" +
                    "a každý jazyk nech vyzná na slávu Boha Otca: Ježiš Kristus je Pán.", "(Porov. Flp 2, 10 - 11)",
                    "Pán Ježiš hovorí: Oheň som prišiel vrhnúť na zem; a čo chcem?<br>" +
                            "Len aby už vzplanul.", "(Lk 12, 49)"},
    };

    String[][] spev8 = {
            {"06gn", "V žiarivom oblaku zjavil sa Duch Svätý a bolo počuť Otcov hlas:<br>" +
                    "Toto je môj milovaný Syn, v ktorom mám zaľúbenie. Počúvajte ho!", "(Porov. Mt 17, 5)",
                    "Keď sa zjaví Kristus, budeme mu podobní,<br>" +
                            "lebo ho budeme vidieť takého, aký je.", "(Porov. 1 Jn 3, 2)"},
            {"09g", "Ja sa nechcem chváliť ničím iným, iba krížom nášho Pána Ježiša Krista,<br>" +
                    "cez ktorý je svet ukrižovaný pre mňa a ja pre svet.", "(Gal 6, 14)",
                    "Keby som mal ísť uprostred tône smrti,<br>" +
                            "nebudem sa báť zlého,<br>" +
                            "lebo ty si so mnou.", "(Porov. Ž 23, 4 – 6)"},
            {"10g", "Oslavujeme svätého diakona Vavrinca,<br>" +
                    "ktorý ako služobník Cirkvi venoval svoj život chudobným;<br>" +
                    "získal si korunu mučeníctva a vošiel do radosti svojho Pána.", "",
                    "Pán Ježiš hovorí:<br>" +
                            "Ak mi niekto chce slúžiť, nech ma nasleduje;<br>" +
                            "a kde som ja, tam bude aj môj služobník.", "(Jn 12, 26)"},
            {"14", "Pán hovorí:<br>" +
                    "Poďte, požehnaní môjho Otca.<br>" +
                    "Veru, hovorím vám:<br>" +
                    "Čokoľvek ste urobili jednému z týchto mojich najmenších bratov,<br>" +
                    "mne ste urobili.", "(Mt 25, 34. 40)",
                    "Pán Ježiš hovorí:<br>" +
                            "Nik nemá väčšiu lásku ako ten,<br>" +
                            "kto položí svoj život za svojich priateľov.", "(Jn 15, 13)"},
            {"14gkm", "Cirkev ťa chváli a velebí, Mária;<br>" +
                    "veď dnes si bola vyvýšená nad zástupy anjelov<br>" +
                    "a s Kristom vládneš naveky.", "", "Blahoslavená si, Panna Mária,<br>" +
                    "lebo si nosila pod srdcom Syna večného Otca.", "(Porov. Lk 11, 27)"},
            {"15gkm", "Veľké znamenie sa ukázalo na nebi:<br>" +
                    "Žena odetá slnkom, s mesiacom pod nohami<br>" +
                    "a s korunou dvanástich hviezd na hlave.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Radujme sa všetci v Pánovi, lebo dnes je slávnosť Panny Márie.<br>" +
                    "Z jej nanebovzatia sa radujú anjeli a spolu s ňou oslavujú Syna Božieho.", "(Zjv 12, 1)",
                    "Blahoslaviť ma budú všetky pokolenia,<br>" +
                            "lebo veľké veci mi urobil ten, ktorý je mocný.", "(Lk l , 48 – 49)"},
            {"22m", "Po tvojej pravici stojí kráľovná, ozdobená zlatom z Ofíru.", "(Ž 44, 10)",
                    "Blahoslavená si, Mária,<br>" +
                            "lebo si uverila, že sa splní, čo ti Pán povedal.", "(Lk l, 54)"},
            {"24g", "Zvestujte Božiu spásu deň čo deň;<br>" +
                    "zvestujte jeho slávu pohanom.", "(Ž 95, 2. 3)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ja vám pripravujem kráľovstvo,<br>" +
                            "ako ho môj Otec pripravil mne,<br>" +
                            "aby ste mohli jesť a piť pri mojom stole v mojom kráľovstve.", "(Lk 22, 29 – 30)"},
            {"28", "Uprostred Božieho ľudu Pán mu dal prehovoriť;<br>" +
                    "naplnil ho duchom múdrosti a rozumu a zaodel ho rúchom slávy.", "(Ekl 15, 5)",
                    "Pán Ježiš hovorí: Iba jediného učiteľa máte, Krista; vy všetci ste bratia.", "(Mt 23, 10. 8)"},
            {"29", "O tvojej náuke, Pane, svedčil som pred kráľmi a nehanbil som sa.<br>" +
                    "Tešil som sa z tvojich predpisov, lebo som si ich obľúbil.", "(Ž 118, 46 - 47)",
                    "Svätý Ján Krstiteľ povedal:<br>" +
                            "On musí rásť, a ja sa musím umenšovať.", "(Jn 3, 27. 30)"},
    };

    String[][] spev9 = {
            {"07", "Zvelebujte Pána, jeho kňazi, chváľte Boha, svätí a pokorní srdcom.", "(Dan 3, 84. 87)",
                    "Pán Ježiš hovorí: Každého, kto ma vyzná pred ľuďmi,<br>" +
                            "aj ja vyznám pred svojím Otcom, ktorý je na nebesiach.", "(Mt 10, 32)"},
            {"08gm", "S radosťou slávime narodenie Preblahoslavenej Panny Márie,<br>" +
                    "lebo z nej vzišlo Slnko spravodlivosti, Kristus, náš Boh.", "",
                    "Hľa, Panna porodí Syna;<br>" +
                            "on vyslobodí svoj ľud z hriechov.", "(lz 7, 14; Mt 1, 21)"},
            {"12m", "Požehnaná si, Panna Mária, od Pána, Boha najvyššieho,<br>" +
                    "nad všetky ženy na svete;<br>" +
                    "lebo tvoje meno tak zvelebil,<br>" +
                    "že tvoja chvála nevymizne z úst ľudí.", "(Porov. Jdt 13, 18 - 20)",
                    "Blahoslaviť ma budú všetky pokolenia,<br>" +
                            "pretože Boh zhliadol na poníženú služobnicu.", "(Porov. Lk 1, 48)",},
            {"14gn", "Hľadajme slávu v kríži nášho Pána Ježiša Krista.<br>" +
                    "On je naša spása, náš život, naše vzkriesenie; on nás oslobodil a spasil.", "(Porov. Gal 6, 14)",
                    "Pán Ježiš povedal:<br>" +
                            "Keď budem vyzdvihnutý od zeme, všetkých pritiahnem k sebe.", "(Jn 12, 32)"},
            {"15gkm", "Pri kríži stála Ježišova matka.<br>" +
                    "Keď Ježiš uzrel matku a vedľa nej milovaného učeníka,<br>" +
                    "povedal matke: Žena, hľa, tvoj syn.<br>" +
                    "Potom povedal učeníkovi: Hľa, tvoja Matka.<br>" +
                    "<font color='#B71C1C'>Alebo: (JKS 394, 1)</font><br>" +
                    "Ó, Mária bolestivá, naša ochrana,<br>" +
                    "slovenský náš národ volá: Pros za nás Boha!<br>" +
                    "Ty si Mať dobrotivá, patrónka ľútostivá,<br>" +
                    "oroduj vždy za náš národ u svojho Syna!", "(Porov. Jn 19, 25 - 27)",
                    "Radujte sa, že máte účasť na Kristových utrpeniach,<br>" +
                            "aby ste sa mohli radovať a jasať, keď sa zjaví jeho sláva.", "(1 Pt 4, 13)"},
            {"20", "Svätí mučeníci vyliali krv pre Krista na tejto zemi,<br>" +
                    "preto dosiahli odmenu vo večnosti.", "",
                    "Každého, kto mňa vyzná pred ľuďmi,<br>" +
                            "aj ja vyznám pred svojím Otcom, ktorý je na nebesiach.", "(Mt 10, 32)"},
            {"21g", "Pán Ježiš hovorí:<br>" +
                    "Iďte, učte všetky národy, krstite ich<br>" +
                    "a na učte ich zachovávať všetko, čo som vám prikázal.", "(Mt 28, 19 - 20)",
                    "Pán Ježiš hovorí: Neprišiel som volať spravodlivých, ale hriešnikov.", "(Mt 9, 13)"},
            {"27", "Duch Pánov je nado mnou, pretože ma pomazal,<br>" +
                    "aby som hlásal blahozvesť chudobným<br>" +
                    "a uzdravoval skrúšených srdcom.", "(Lk 4, 18)",
                    "Nech oslavujú Pána za jeho milosrdenstvo<br>" +
                            "a za obdivuhodné skutky v prospech ľudí,<br>" +
                            "lebo smädného napojil a hladného nasýtil dobrými vecami.", "(Ž 106, 8 – 9)"},
            {"29g", "Dobrorečte Pánovi, všetci jeho anjeli,<br>" +
                    "udatní hrdinovia, čo počúvate na jeho slová a plníte jeho príkazy.", "(Ž 102, 20)",
                    "Chcem ťa, Pane, oslavovať celým srdcom,<br>" +
                            "budem ti hrať pred tvárou anjelov.", "(Ž 137, l)"},
            {"30", "Nech sa nevzďaľuje kniha Zákona od tvojich pier;<br>" +
                    "rozjímaj o nej vo dne i v noci,<br>" +
                    "aby si zachoval a konal všetko, čo je v nej napísané.<br>" +
                    "Vtedy budeš najlepšie usmerňovať svoju cestu a budeš mať úspech.", "(Joz 1, 18)",
                    "Našiel som tvoje slová a sýtil som sa nimi.<br>" +
                            "Tvoje slovo je mojím šťastím a radosťou môjho srdca,<br>" +
                            "lebo tvoje meno, Pane Bože, sa vzývalo nado mnou.", "(Porov. Jer 15, 16)"},
    };

    String[][] spev10 = {
            {"01", "Pán ju viedol a učil;<br>" +
                    "ako zrenicu svojho oka ju chránil.<br>" +
                    "Ako orol rozprestrel krídla,<br>" +
                    "vzal ju a niesol na svojich perutiach.<br>" +
                    "Sám Pán jej bol vodcom.", "(Porov. Dt 32, 10-12)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ak sa neobrátite a nebudete ako deti,<br>" +
                            "nevojdete do nebeského kráľovstva.", "(Mt 18, 3)"},
            {"02", "Všetci Boží anjeli, dobrorečte Pánovi,<br>" +
                    "chváľte ho a oslavujte naveky.", "(Dan 3, 58)",
                    "Budem ti hrať a spievať pred anjelmi, môj Bože.", "(Ž 137, 1)"},
            {"04", "František, muž Boží, opustil rodičovský dom,<br>" +
                    "zriekol sa svojho dedičstva a žil ako chudobný;<br>" +
                    "no Pán ho povýšil a prijal k sebe.", "",
                    "Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo.", "(Mt 5, 3)"},
            {"07m", "Zdravas, Mária, milosti plná, Pán s tebou:<br>" +
                    "požehnaná si medzi ženami<br>" +
                    "a požehnaný je plod tvojho života.", "(Lk 1, 28. 42)",
                    "Počneš a porodíš Syna a dáš mu meno Ježiš.", "(Lk 1, 31)"},
            {"15", "Ako jeleň dychti za vodou z prameňa,<br>" +
                    "tak moja duša, Bože, túži za tebou.<br>" +
                    "Po Bohu žízní moja duša, po Bohu živom.", "",
                    "Pánovu dobrotu chcem ospevovať naveky,<br>" +
                            "po všetky pokolenia ohlasovať jeho vernosť<br>" +
                            "svojimi ústami.", "(Ž 88, 2)"},
            {"17", "S Kristom som ukrižovaný.<br>" +
                    "A nežijem už ja, ale žije vo mne Kristus.<br>" +
                    "No kým ešte žijem v tele, žijem vo viere v Syna Božieho,<br>" +
                    "ktorý si ma zamiloval a seba samého obetoval za mňa.", "(Gal 2, 19-20)",
                    "Som Kristovým pšeničným zrnom - hovorí svätý Ignác,<br>" +
                            "nech ma zomelú zuby šeliem, aby som sa stal čistým chlebom.", ""},
            {"18g", "Aké sú vítané na horách kroky posla, ktorý hlása pokoj,<br>" +
                    "posla dobrej zvesti, ktorý ohlasuje spásu.", "(Iz 52, 7)",
                    "Pán poslal učeníkov, aby všade ohlasovali :<br>" +
                            "Priblížilo sa k vám Božie kráľovstvo.", "(Porov. Lk 10, 1. 9)"},
            {"19b", "Rozhodol som sa,<br>" +
                    "že nechcem medzi vami vedieť nič iné<br>" +
                    "okrem Ježiša Krista,<br>" +
                    "a to ukrižovaného.", "(1 Kor 2, 2)",
                    "Ohlasujeme Ježiša Krista, Krista - Božiu moc a Božiu múdrosť.", "(1 Kor 1, 23 – 24)"},
            {"26gk+", "Vznešený je Boh vo svojej svätyni, Boh Izraela,<br>" +
                    "on sám dáva silu i statočnosť svojmu ľudu.<br>" +
                    "Nech je zvelebený Boh.", "(Ž 67, 36)",
                    "Vy ste chrámom Božím<br>" +
                            "a Duch Svätý prebýva vo vás.<br>" +
                            "Boží chrám je svätý,<br>" +
                            "a tým chrámom ste vy.", "(Porov. 1 Kor 3, 16-17)"},
            {"28g", "Pán vo svojej láske vyvolil svätého Šimona a Júdu<br>" +
                    "za apoštolov a dal im večnú slávu.", "",
                    "Pán Ježiš povedal:<br>" +
                            "Kto ma miluje, zachová moje slovo;<br>" +
                            "a môj Otec ho bude milovať,<br>" +
                            "prídeme k nemu a budeme uňho bývať.", "(Jn 14, 23)"},
            {"31gk", "Radujme sa všetci v Pánovi,<br>" +
                    "lebo dnes je slávnosť Všetkých svätých.<br>" +
                    "Z ich oslávenia radujú sa anjeli<br>" +
                    "a spolu s nimi velebia Syna Božieho.", "",
                    "Blahoslavení čistého srdca, lebo oni uvidia Boha.<br>" +
                            "Blahoslavení, čo šíria pokoj, lebo ich budú volať Božími synmi.<br>" +
                            "Blahoslavení, ktorých prenasledujú pre spravodlivosť,<br>" +
                            "lebo ich je nebeské kráľovstvo.", "(Mt 5, 8)"},
    };

    String[][] spev11 = {
            {"01gk", "Radujme sa všetci v Pánovi,<br>" +
                    "lebo dnes je slávnosť Všetkých svätých.<br>" +
                    "Z ich oslávenia radujú sa anjeli<br>" +
                    "a spolu s nimi velebia Syna Božieho.", "",
                    "Blahoslavení čistého srdca, lebo oni uvidia Boha.<br>" +
                            "Blahoslavení, čo šíria pokoj, lebo ich budú volať Božími synmi.<br>" +
                            "Blahoslavení, ktorých prenasledujú pre spravodlivosť,<br>" +
                            "lebo ich je nebeské kráľovstvo.", "(Mt 5, 8)"},
            {"02an", "Ako Ježiš zomrel a vstal z mŕtvych,<br>" +
                    "tak Boh tých,<br>" +
                    "čo zomreli v spojení s Ježišom, zjednotí s ním.<br>" +
                    "Ako všetci umierajú v Adamovi,<br>" +
                    "tak zasa všetci ožijú v Kristovi.", "(1 Sol 4, 14; 1 Kor 15, 22)",
                    "Pán Ježiš hovorí: Ja som vzkriesenie a život.<br>" +
                            "A nik, kto žije a verí vo mňa, nezomrie naveky.", "(Jn 11, 25-26)"},
            {"02bn", "Odpočinutie večné daj zosnulým, Pane,<br>" +
                    "a svetlo večné nech im svieti.", "(Porov. 4 Ezd 2, 34-35)",
                    "Svetlo večné nech svieti zosnulým, Pane,<br>" +
                            "v spoločenstve svätých, veď si dobrotivý.<br>" +
                            "Odpočinutie večné daj im, Pane,<br>" +
                            "a svetlo večné nech im svieti<br>" +
                            "v spoločenstve svätých, veď si dobrotivý.", "(Porov. 4 Ezd 2, 35. 34)"},
            {"02cn", "Boh, ktorý vzkriesil z mŕtvych Ježiša,<br>" +
                    "oživí aj naše smrteľné telo svojim Duchom,<br>" +
                    "ktorý prebýva v nás.", "(Porov. Rim 8, 11)",
                    "Očakávame Spasiteľa, nášho Pána Ježiša Krista;<br>" +
                            "on pretvorí naše úbohé telo,<br>" +
                            "aby sa stalo podobným jeho oslávenému telu.", "(Flp 3, 20-21)"},
            {"11", "Pán hovorí: Povolám si verného kňaza,<br>" +
                    "ktorý bude konať podľa môjho srdca a podľa môjho zmýšľania.<br>", "(1 Sam 2, 35)",
                    "Pán Ježiš povedal:<br>" +
                            "Čo ste urobili jednému z týchto mojich najmenších bratov,<br>" +
                            "mne ste urobili.", "(Mt 25, 40)"},
            {"11g", "Pán hovorí: Povolám si verného kňaza,<br>" +
                    "ktorý bude konať podľa môjho srdca a podľa môjho zmýšľania.<br>", "(1 Sam 2, 35)",
                    "Pán Ježiš povedal:<br>" +
                            "Čo ste urobili jednému z týchto mojich najmenších bratov,<br>" +
                            "mne ste urobili.", "(Mt 25, 40)"},
            {"18", "Urobíš ich kniežatami nad celou zemou.<br>" +
                    "Na tvoje meno budú pamätať vo všetkých pokoleniach.<br>" +
                    "Preto ťa národy budú velebiť vždy a naveky.", "(Ž 44, 17-18)",
                    "Pane, ty máš slová večného života;<br>" +
                            "a my sme uverili a poznali, že ty si Kristus, Syn Boží.", "(Jn 6, 69-70)"},
            {"24", "Nechceme sa chváliť ničím iným,<br>" +
                    "iba krížom nášho Pána Ježiša Krista.<br>" +
                    "Lebo slovo kríža je pre nás, čo srne na ceste spásy, Božou mocou.", "(Porov. Gal 6, 14a; l Kor 1, 18)",
                    "Blahoslavení prenasledovaní pre spravodlivosť,<br>" +
                            "lebo ich je nebeské kráľovstvo.", "(Mt 5, 10)"},
            {"30g", "Na brehu Galilejského mora<br>" +
                    "Pán uzrel dvoch bratov Petra a Ondreja.<br>" +
                    "I povedal im:<br>" +
                    "Poďte za mnou a ja z vás urobím rybárov ľudí.", "(Porov. Mt 4, 18-19)",
                    "Ondrej povedal svojmu bratovi Šimonovi:<br>" +
                            "Našli sme Mesiáša, to jest Krista.<br>" +
                            "I priviedol ho k Ježišovi.", "(Jn 1, 41-42)"},
    };

    String[][] spev12 = {
            {"14", "Nech mi ani len nenapadne chváliť sa niečím iným<br>" +
                    "ako krížom nášho Pána Ježiša Krista,<br>" +
                    "v ktorom je svet ukrižovaný pre mňa a ja pre svet.", "(Gal 6, 14)",
                    "Pán Ježiš hovorí:<br>" +
                            "Kto chce ísť za mnou, nech zaprie sám seba,<br>" +
                            "vezme svoj kríž a nech ma nasleduje.", "(Mt 16, 24)"},
            {"17", "Radujte sa, nebesia, a plesaj zem,<br>" +
                    "lebo náš Pán príde<br>" +
                    "a zmiluje sa nad nami úbohými.", "(Porov. lz 49, 13)",
                    "Hľa, príde ten, po ktorom túžia všetky národy,<br>" +
                            "a Pánov dom sa naplní slávou.", "(Porov. Ag 2, 8)"},
            {"18", "Príde Kristus, náš Kráľ, Baránok Boží,<br>" +
                    "ktorého ohlasoval Ján.", "",
                    "Dajú mu meno Emanuel,<br>" +
                            "čo v preklade znamená: Boh s nami.", "(Mt 1, 23)"},
            {"19", "Pán príde, nenechá na seba čakať.<br>" +
                    "A na našej zemi už nebude úzkosť, lebo on je náš Spasiteľ.", "(Porov. Hebr 10, 37)",
                    "Navštívi nás Vychádzajúci z výsosti<br>" +
                            "a upraví nám kroky na cestu pokoja.", "(Lk 1, 78-79)"},
            {"20", "Z Jesseho koreňa vyrastie ratolesť.<br>" +
                    "Celá zem sa naplní Pánovou slávou a každý človek uvidí Božiu spásu.", "(Porov. Iz 11, 1; 40, 5; Lk 3, 6)",
                    "Anjel povedal Márii:<br>" +
                            "Počneš a porodíš Syna a dáš mu meno Ježiš.", "(Lk 1, 31)"},
            {"21", "Čoskoro príde Pán a Vládca;<br>" +
                    "bude sa volať Emanuel, čo znamená: Boh je s nami.", "(Porov. Iz 7, 14; 8, 10)",
                    "Blahoslavená si, lebo si uverila,<br>" +
                            "že sa splní, čo ti Pán povedal.", "(Lk 1, 45)"},
            {"22", "Zdvihnite, brány, svoje hlavice,<br>" +
                    "a vyvýšte sa, brány prastaré,<br>" +
                    "lebo má vstúpiť Král slávy.", "(Ž 23, 7)",
                    "Velebí moja duša Pána,<br>" +
                            "lebo veľké veci mi urobil ten, ktorý je mocný.", "(Lk 1, 46. 49)"},
            {"23", "Chlapček sa nám narodí,<br>" +
                    "bude sa volať Mocný Boh.<br>" +
                    "V ňom budú požehnané všetky národy zeme.", "(Porov. Iz 9, 6; Ž 71, 17)",
                    "Stojím predo dvermi a klopem.<br>" +
                            "Kto počúvne môj hlas a otvorí mi dvere,<br>" +
                            "vojdem k nemu a budeme spolu stolovať.", "(Zjv 3, 20)"},
            {"24", "Hľa, nadišla plnosť času:<br>" +
                    "Boh poslal na svet svojho Syna.", "(Porov. Gal 4, 4)",
                    "Požehnaný Pán, Boh Izraela,<br>" +
                            "lebo navštívil a vykúpil svoj ľud.", "(Lk 1, 68)"},
            {"24gkn", "Dnes sa dozviete, že Pán nás príde spasiť,<br>" +
                    "a ráno uvidíte jeho slávu.", "(Porov. Ex 16, 6-7)",
                    "Zjaví sa Pánova sláva<br>" +
                            "a každý človek uvidí Božiu spásu.", "(Porov. Iz 40, 5)"},
            {"25agkn", "Radujme sa všetci v Pánovi,<br>" +
                    "veď prišiel na svet náš Spasiteľ.<br>" +
                    "Dnes k nám z neba zostúpil pravý pokoj.<br>" +
                    "<font color='#B71C1C'>Alebo: (Ž 2, 7)</font><br>" +
                    "Pán mi povedal: Ty si môj Syn,<br>" +
                    "ja som ťa dnes splodil.", "",
                    "Slovo sa telom stalo, a my sme uvideli jeho slávu.", "(Jn 1, 14)"},
            {"25bgkn", "Dnes zažiarilo nad nami svetlo,<br>" +
                    "lebo sa nám narodil Pán.<br>" +
                    "Bude sa volať: Mocný Boh, Knieža pokoja,<br>" +
                    "Otec budúceho veku.<br>" +
                    "Jeho kráľovstvo sa nikdy neskončí.", "(Porov. Iz 9, 2. 6; Lk 1, 33)",
                    "Plesaj, dcéra sionská, jasaj, dcéra jeruzalemská,<br>" +
                            "hla, prichádza tvoj Král, Svätý, Spasiteľ sveta.", "(Porov. Zach 9, 9)"},
            {"25cgkn", "Chlapček sa nám narodil,<br>" +
                    "daný nám je Syn.<br>" +
                    "Na jeho pleciach spočíva vláda.", "(Iz 9, 6)",
                    "Všetky končiny zeme<br>" +
                            "uzreli spásu nášho Boha.", "(Ž 97, 3)"},
            {"26g", "Svätému Štefanovi sa otvorili brány neba.<br>" +
                    "Ako prvý z veľkého počtu mučeníkov<br>" +
                    "dosiahol veniec slávy.", "",
                    "Keď kameňovali Štefana, on sa modlil a volal:<br>" +
                            "Pane Ježišu, prijmi môjho ducha!", "(Sk 7, 58)"},
            {"27g", "Oslavujme svätého apoštola Jána,<br>" +
                    "ktorý pri Poslednej večeri<br>" +
                    "sklonil hlavu na Pánovu hruď.<br>" +
                    "Jemu Pán zjavil nebeské tajomstvá<br>" +
                    "a on po celom svete ohlasoval slová života.<br>" +
                    "<font color='#B71C1C'>Alebo: (Ekl 15, 5)</font><br>" +
                    "Uprostred Božieho ľudu Pán mu dal prehovoriť;<br>" +
                    "naplnil ho duchom múdrosti a rozumu<br>" +
                    "a zaodel ho rúchom slávy.", "",
                    "Slovo sa telom stalo a prebývalo medzi nami.<br>" +
                            "A z jeho plnosti sme prijali všetci.", "(Jn 1, 14-16)"},
            {"28g", "Nevinné deti,<br>" +
                    "zabité pre Krista,<br>" +
                    "v nebi nasledujú nepoškvrneného Baránka<br>" +
                    "a ustavične volajú: Sláva tebe, Pane.", "",
                    "Betlehemské deti boli vykúpené spomedzi ľudí<br>" +
                            "ako prvotiny Bohu a Baránkovi,<br>" +
                            "preto nasledujú Baránka, kamkoľvek ide.", "(Porov. Zjv 14, 4)"},
            {"29", "Boh tak miloval svet, že dal svojho jednorodeného Syna,<br>" +
                    "aby nezahynul nik, čo v neho verí,<br>" +
                    "ale aby mal večný život.", "(Jn 3, 16)",
                    "Z milosrdnej lásky nášho Boha<br>" +
                            "navštívil nás Vychádzajúci z výsosti.", "(Lk 1, 78)"},
            {"30", "Keď sa všetko pohrúžilo do hlbokého mlčania<br>" +
                    "a noc došla do polovice svojej cesty,<br>" +
                    "tvoje všemohúce Slovo, Pane,<br>" +
                    "zostúpilo z neba, z kráľovského trónu.", "(Múd 18, 14-15)",
                    "Z Kristovej plnosti sme prijali všetci milosť za milosťou.", "(Jn 1, 16)"},
            {"31", "Chlapček sa nám narodil,<br>" +
                    "daný je nám Syn.<br>" +
                    "Na jeho pleciach spočíva vláda.", "(Iz 9, 6)",
                    "Boh poslal na svet svojho jednorodeného Syna,<br>" +
                            "aby sme skrze neho mali život.", "(1 Jn 4, 9)"},
            {"31gk", "Zdravas, svätá Matka.<br>" +
                    "Ty si porodila Kráľa, ktorý večne riadi nebo i zem.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. lz 9, 2. 6; Lk 1, 33)</font><br>" +
                    "Dnes zažiarilo nad nami svetlo, lebo sa nám narodil Pán.<br>" +
                    "Bude sa volať: Mocný Boh, Knieža pokoja,<br>" +
                    "Otec budúceho veku. Jeho kráľovstvo sa nikdy neskončí.", "(Sedulius)",
                    "Ježiš Kristus je ten istý včera i dnes a naveky.", "(Hebr 13, 8)"},
    };

}


