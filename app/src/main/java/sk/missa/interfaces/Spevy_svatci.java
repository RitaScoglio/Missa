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
            {"60gkp", "", "Spievajte Bohu, zemské kráľovstvá, hrajte Pánovi, čo sa nesie na nebesiach;<br>" +
                    "jeho veleba a jeho moc až nad oblaky, aleluja.", "(Ž 68, 33. 35)",
                    "Kristus priniesol jedinú obetu za hriechy a navždy zasadol po pravici Boha, aleluja.", "(Porov. Hebr 10, 12)"},
            {"6gkp", "", "Mužovia galilejskí, čo stojíte a udivene hľadíte do neba? On príde tak, ako ste ho videli odchádzať, aleluja.", "(Sk 1, 11)",
                    "Hľa, ja som s vami po všetky dni až do skončenia sveta, aleluja.", "(Mt 28, 20)"},
            {"2gkp", "", "Božia láska je rozliata v našich srdciach skrze Ducha Svätého, ktorý v nás prebýva, aleluja.", "(Rim 5, 5; porov. 8, 11)",
                    "V posledný, veľký deň sviatkov Ježiš vstal a zvolal: Ak je niekto smädný, nech príde ku mne a nech pije, aleluja.", "(Jn 7, 37)"},
            {"3gkp", "", "Pánov duch napĺňa zemekruh a ten, čo udržuje všetko, pozná každý hlas, aleluja.<br>" +
                    "<font color='#B71C1C'>Alebo: (Rim 5, 5; porov. 8, 11)</font><br>" +
                    "Božia láska je rozliata v našich srdciach skrze Ducha Svätého, ktorý v nás prebýva, aleluja.", "(Múd 1, 7)",
                    "Všetkých naplnil Duch Svätý a začali hovoriť o veľkých Božích skutkoch, aleluja.", "(Sk 2, 4. 11)"},
            {"0gkp", "", "Hľa, verný a múdry služobník, ktorého Pán ustanovil nad svojou rodinou.", "(Porov. Lk 12, 42)",
                    "Správne, dobrý a verný sluha, vojdi do radosti svojho Pána.", "(Mt 25, 21)"},
            {"1gkp", "", "Keď Pán prichádzal na svet, povedal: Hľa prichádzam, aby som plnil tvoju vôľu, Bože.", "(Hebr 10, 5. 7)",
                    "Hľa, Panna počne a porodí Syna, a dá mu meno Emanuel.", "(Iz 7, 14)"},
            {"2mp", "", "Učeníci jednomyseľne zotrvávali na modlitbách s Máriou, Ježišovou matkou. ", "(Porov. Sk 1, 14)",
                    "V Káne Galilejskej bola svadba a bola tam aj Ježišova matka. Vtedy Ježiš urobil prvé zo znamení a zjavil svoju slávu. A jeho učeníci uverili v neho.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Jn 19, 26 – 27)</font><br>" +
                            "Pán Ježiš, pribitý na kríži, povedal učeníkovi, ktorého miloval: Hľa, tvoja matka.", "(Porov. Jn 2, 1. 11)"},
            {"3gp", "", "Kristus, prostredník novej zmluvy, ktorý zostáva naveky, má večné kňazstvo.", "(Porov. Hebr 7, 24; 9, 15)",
                    "Hľa, ja som s vami po všetky dni až do skončenia sveta.", "(Mt 28, 20b)"},
            {"7gkp", "", "Nech je zvelebený Boh Otec, jednorodený Boží Syn i Duch Svätý, lebo nám preukázal svoje milosrdenstvo.", "",
                    "Pretože ste synmi, poslal Boh do našich sŕdc Ducha svojho Syna, a on volá: Abba, Otče!", "(Gal 4, 6)"},
            {"4gkp", "", "Kŕmil ich jadrom pšeničným a sýtil medom zo skaly.", "(Porov. Ž 81, 17)",
                    "Kto je moje telo a pije moju krv, ostáva vo mne a ja v ňom, hovorí Pán.", "(Jn 6, 57)"},
            {"5gkp", "", "Myšlienky jeho Srdca z pokolenia na pokolenie, aby ich zachránil pred smrťou a v čase hladu nakŕmil.", "(Ž 33, 11. 19)",
                    "Pán hovorí: Ak je niekto smädný, nech príde ku mne a nech pije. A z vnútra toho, kto verí vo mňa, potečú prúdy živej vody.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 19, 34)</font><br>" +
                            "Jeden z vojakov mu kopijou prebodol bok, a hneď vyšla krv a voda.", "(Jn 7, 37 – 38)"},
            {"4mp", "", "Moje srdce sa teší z tvojej pomoci. Spievať budem Pánovi, že ma zahŕňa dobrodeniami.", "(Ž 13, 6)",
                    "Mária zachovávala všetky tieto slová vo svojom srdci a premýšľala o nich.", "(Lk 2, 19)"},
            {"8gkp", "", "Hoden je Baránok, ktorý bol zabitý, prijať moc, bohatstvo a múdrosť, silu a česť. Jemu sláva a vláda na veky vekov.", "(Zjv 5, 12; 1, 6)",
                    "Pán bude tróniť ako večný Kráľ, Pán požehná svoj ľud pokojom.", "(Ž 29, 10 – 11)"},
            //8. decembra - NEPOŠKVRNENÉ POČATIE PANNY MÁRIE
            {"9gkp", "", "Radosťou jasám v Pánovi, duša mi plesá v mojom Bohu, pretože ma zaodial rúchom spásy, zahalil ma plášťom spravodlivosti ako nevestu okrášlenú šperkami.", "(Iz 61, 10)",
                    "Slávne veci sa hovoria o tebe, Mária, lebo z teba vyšlo slnko spravodlivosti, Kristus, náš Boh.", ""},

            //SVÄTEJ RODINY JEŽIŠA, MÁRIE A JOZEFA
           {"10gkp", "", "Pastieri sa poponáhľali a našli Máriu a Jozefa i Dieťa uložené v jasliach.", "(Lk 2, 16)",
                   "Náš Boh sa zjavil na zemi a prebýval medzi ľuďmi.", "(Porov. Bar 3, 38) "},
            //Nedeľa po 6. januári - KRST KRISTA PÁNA
            {"11gkp", "", "Keď bol Pán pokrstený, otvorilo sa nebo, spočinul na ňom Duch Svätý ako holubica a zaznel Otcov hlas: Toto je môj milovaný Syn, v ktorom mám zaľúbenie.", "(Porov. Mt 3, 16 – 17)",
                    "Hľa, ten, o ktorom Ján povedal: Ja som to videl a vydávam svedectvo, že toto je Boží Syn.", "(Jn 1, 32. 34)"},
    };

    String[][] spev1 = {
            {"01gk", "Zdravas', svätá Matka! Ty si porodila Kráľa, ktorý večne riadi nebo i zem.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Iz 9, 1. 5; Lk 1, 33)</font><br>" +
                    "Dnes zažiarilo nad nami svetlo, lebo sa nám narodil Pán. Bude sa volať: Mocný Boh, Knieža pokoja, Otec budúceho veku, ktorého kráľovstvu nebude konca.", "(Sedulius)",
                    "Ježiš Kristus je ten istý včera i dnes a naveky.", "(Hebr 13, 8)"},
            {"02a", "O múdrosti svätých nech rozprávajú národy a ich chválu nech ohlasuje Cirkev; ich mená nech žijú naveky.", "(Porov. Sir 44, 15. 14)",
                    "My však ohlasujeme ukrižovaného Krista, Krista – Božiu moc a Božiu múdrosť.", "(Porov. 1 Kor 1, 23 – 24)"},
            {"03a", "Na meno Ježiš nech sa zohne každé koleno v nebi, na zemi i v podsvetí" +
                    "a každý jazyk nech vyznáva: Ježiš Kristus je Pán na slávu Boha Otca.", "(Flp 2, 10 – 11)",
                    "Pane, náš Vládca, aké vznešené je tvoje meno na celej zemi!", "(Ž 8, 2)"},
            {"05gk", "Povstaň, Jeruzalem, hľaď na východ a podívaj sa na svojich synov zhromaždených od východu slnka až po západ.", "(Porov. Bar 5, 5)",
                    "Božia sláva ožiarila sväté mesto Jeruzalem a v jeho svetle kráčali národy.", "(Porov. Zjv 21, 23)"},
            {"06gk", "Hľa, prichádza Vládca, Pán, a v jeho ruke je kráľovstvo, moc a vláda.", "(Porov. Mal 3, 1; 1 Krn 29, 12)",
                    "Videli sme jeho hviezdu na východe a prišli sme sa s darmi pokloniť Pánovi.", "(Porov. Mt 2, 2)"},
            {"17", "Spravodlivý sťa palma zakvitne a vyrastie sťa céder z Libanonu zasadený v dome Pánovom, v nádvoriach domu nášho Boha.", "(Porov. Ž 92, 13 – 14)",
                    "Ak chceš byť dokonalý, choď, predaj, čo máš, rozdaj chudobným, a nasleduj ma, hovorí Pán.", "(Porov. Mt 19, 21)"},
            {"25g", "Viem, komu som uveril, a som presvedčený, že spravodlivý Sudca má moc zachovať až do onoho dňa to, čo mi bolo zverené.", "(Porov. 2 Tim 1, 12; 4, 8)",
                    "Žijem vo viere v Božieho Syna, ktorý si ma zamiloval a vydal seba samého za mňa.", "(Porov. Gal 2, 20)"},
            {"26", "Zvestujte jeho slávu pohanom a jeho zázraky všetkým národom. Lebo veľký je Pán a hoden veľkej chvály.", "(Ž 96, 3 – 4)",
                    "Choďte do celého sveta a hlásajte evanjelium: ja som s vami po všetky dni, hovorí Pán.", "(Mk 16, 15; Mt 28, 20)"},
    };

    String[][] spev2 = {
            {"02g", "Spomíname, Bože, na tvoje milosrdenstvo uprostred tvojho chrámu. Ako tvoje meno, Bože," +
                    "tak aj tvoja sláva šíri sa až do končín zeme; tvoja pravica je plná spravodlivosti.", "(Porov. Ž 48, 10 – 11)",
                    "Moje oči uvideli tvoju spásu, ktorú si pripravil pred tvárou všetkých národov.", "(Lk 2, 30 – 31)"},
            {"14o", "Toto sú svätí, Boží priatelia, slávni hlásatelia Božej pravdy.", "",
                    "Učeníci sa rozišli a hlásali evanjelium. Pán im pomáhal a ich slová potvrdzoval znameniami, ktoré ich sprevádzali.", "(Porov. Mk 16, 20)"},
            {"14g+", "Toto sú svätí, Boží priatelia, slávni hlásatelia Božej pravdy.", "",
                    "Učeníci sa rozišli a hlásali evanjelium. Pán im pomáhal a ich slová potvrdzoval znameniami, ktoré ich sprevádzali.", "(Porov. Mk 16, 20)"},
            {"22g", "Pán hovorí Šimonovi Petrovi: ja som prosil za teba, aby neochabla tvoja viera; a ty, až sa raz obrátiš, posilňuj svojich bratov.", "(Lk 22, 32)",
                    "Peter povedal Ježišovi: Ty si Mesiáš, Syn živého Boha." +
                            "Ježiš mu odpovedal: Ty si Peter, a na tejto skale postavím svoju Cirkev.", "(Porov. Mt 16, 16. 18)"},
    };

    String[][] spev3 = {
            {"07", "Tešia sa v nebi duše svätých, ktorí kráčali v Kristových šľapajach, a pretože svoju krv preliali z lásky k nemu, teraz sa s ním bez prestania radujú.", "",
            "Vydávame sa na smrť pre Ježiša, aby sa aj Ježišov život zjavil na našom smrteľnom tele.", "(2 Kor 4, 11)"},
    };

    String[][] spev4 = {
            {"23", "Povolám si verného kňaza, ktorý bude konať podľa môjho srdca a podľa môjho zmýšľania, hovorí Pán, aleluja.", "(1 Sam 2, 35)",
                    "Dostanete silu a budete mi svedkami vo svojej vlasti aj na celom svete. Aleluja.", "(Porov. Sk 1, 8)"},
            {"25g", "Choďte do celého sveta a hlásajte evanjelium všetkému stvoreniu, aleluja.", "(Mk 16, 15)",
                    "Hľa, ja som s vami po všetky dni až do skončenia sveta, hovorí Pán, aleluja.", "(Mt 28, 20)"},
            {"29g", "Toto je múdra panna, jedna z tých rozumných, ktorá vyšla s horiacou lampou v ústrety Kristovi, aleluja.", "",
                    "Ak chodíme vo svetle, tak ako je Boh vo svetle, máme spoločenstvo medzi sebou a krv Ježiša Krista, jeho Syna, nás očisťuje od každého hriechu, aleluja.", "(Porov. 1 Jn 1, 7)"},
    };

    String[][] spev5 = {
            {"01", "Blažený každý, čo sa bojí Pána a kráča po jeho cestách. Budeš jesť z práce svojich rúk; budeš šťastný a budeš sa mať dobre, aleluja.", "(Ž 128, 1 – 2)",
                    "Všetko, čokoľvek hovoríte alebo konáte, všetko robte v mene Pána Ježiša a vzdávajte vďaky Bohu, aleluja.", "(Porov. Kol 3, 17)"},
            {"02", "Uprostred Cirkvi otvoril si mu ústa a Pán ho naplnil duchom múdrosti a rozumnosti a zaodial ho do rúcha slávy, aleluja.", "(Porov. Sir 15, 5)",
                    "Lebo nik nemôže položiť iný základ okrem toho, čo je už položený, a je ním Ježiš Kristus, aleluja.", "(1 Kor 3, 11)"},
            {"03g", "Toto sú svätí muži, ktorých si Pán vyvolil vo svojej opravdivej láske a dal im večnú slávu, aleluja.", "",
                    "Pane, ukáž nám Otca a to nám postačí. Filip, kto vidí mňa, vidí aj môjho Otca, aleluja.", "(Porov. Jn 14, 8 – 9)"},
            {"14g", "Nie vy ste si vyvolili mňa, ale ja som si vyvolil vás, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo (V.O. aleluja.)", "(Jn 15, 16)",
                    "Toto je moje prikázanie: Aby ste sa milovali navzájom, ako som ja miloval vás, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Jn 15, 12)"},
            {"16", "Oslavujme svätca, ktorý položil svoj život za Boží zákon a nebál sa hrozieb bezbožných ľudí; mal totiž základy na pevnej skale <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "",
                    "Ani smrť, ani život, ani nijaké stvorenie nás nemôže odlúčiť od Kristovej lásky <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Rim 8, 38 – 39)"},
            {"16g", "Oslavujme svätca, ktorý položil svoj život za Boží zákon a nebál sa hrozieb bezbožných ľudí; mal totiž základy na pevnej skale <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "",
                    "Ani smrť, ani život, ani nijaké stvorenie nás nemôže odlúčiť od Kristovej lásky <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Rim 8, 38 – 39)"},
            {"26", "Božia láska je rozliata v našich srdciach skrze Ducha Svätého, ktorého sme dostali <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Rim 5, 5; porov. 8, 11)",
                    "Ako mňa miluje Otec, tak ja milujem vás, hovorí Pán; ostaňte v mojej láske <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Jn 15, 9)"},
    };

    String[][] spev6 = {
            {"01", "Pyšní mi rozprávali výmysly, lebo nepoznajú tvoj zákon; ja však budem svedčiť o tvojej náuke pred kráľmi a nebudem sa hanbiť <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Ž 119 85. 46)",
                    "Rozhodol som sa, že nechcem medzi vami vedieť nič iné iba Ježiša Krista, a to ukrižovaného <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. 1 Kor 2, 2)"},
            {"03", "Pán vyskúšal vyvolených ako zlato v peci a prijal ich ako celopalnú žertvu; v deň ich súdu zažiaria, pretože Božím vyvoleným sa dostane milosti a pokoja <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Múd 3, 6 – 7. 9)",
                    "V Pánových očiach má veľkú cenu smrť jeho svätých <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Ž 116, 15)"},
            {"11", "Blažený je tento svätý muž, lebo si zaslúžil byť pripočítaný medzi apoštolov; veď on bol muž dobrý, plný Ducha Svätého a viery <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Sk 11, 24)",
                    "Už vás nenazývam sluhami, lebo sluha nevie, čo robí jeho pán. Nazval som vás priateľmi, pretože som vám oznámil všetko, čo som počul od svojho Otca <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Jn 15, 15)"},
            {"21", "Ten, čo má ruky nevinné a srdce čisté, vystúpi na vrch Pánov a bude stáť na jeho mieste posvätnom.", "(Porov. Ž 24, 4. 3)",
                    "Dal im chlieb z neba. Človek jedol chlieb anjelský.", "(Ž 78, 24 – 25)"},
            {"23gk", "On bude veľký pred Pánom a už v matkinom lone ho naplní Duch Svätý; jeho narodenie poteší mnohých.", "(Lk 1, 15. 14)",
                    "Zvelebený Pán, Boh Izraela, lebo navštívil a vykúpil svoj ľud.", "(Lk 1, 68)"},
            {"24gk", "Bol človek, ktorého poslal Boh, volal sa Ján. Prišiel ako svedok vydať svedectvo o svetle a pripraviť Pánovi dokonalý ľud.", "(Jn 1, 6 – 7; Lk 1, 17)",
                    "Z hĺbky milosrdenstva nášho Boha navštívil nás Vychádzajúci z výsosti.", "(Porov. Lk 1, 78)"},
            {"28", "Zákon pravdy bol v jeho ústach a na jeho perách sa nenašla neprávosť; v pokoji a úprimnosti chodil so mnou a mnohých odvrátil od hriechu.", "(Mal 2, 6)",
                    "Ostaňte vo mne a ja vo vás, hovorí Pán. Kto ostáva vo mne a ja v ňom, prináša veľa ovocia.", "(Jn 15, 4 – 5)"},
            {"28gk", "Apoštol Peter a učiteľ národov Pavol naučili nás tvoj zákon, Pane.", "",
                    "Šimon, syn Jánov, miluješ ma väčšmi ako títo? Pane, ty vieš všetko, ty dobre vieš, že ťa mám rád.", "(Porov. Jn 21, 15. 17)"},
            {"29gk", "Toto sú tí, ktorí počas svojho života zasadili Cirkev a zvlažili ju vlastnou krvou; pili z Pánovho kalicha a stali sa Božími priateľmi.", "",
                    "Peter povedal Ježišovi: Ty si Mesiáš, Syn živého Boha. Ježiš mu povedal: Ty si Peter, a na tejto skale postavím svoju Cirkev.", "(Porov. Mt 16, 16. 18)"},
    };

    String[][] spev7 = {
            {"02gm", "Poďte sem a počúvajte, všetci ctitelia Boží, vyrozprávam vám, aké veľké veci mi urobil Pán.", "(Porov. Ž 66, 16)",
                    "Blahoslaviť ma budú všetky pokolenia, lebo veľké veci mi urobil ten, ktorý je mocný, a sväté je jeho meno.", "(Lk 1, 48 – 49)"},
            {"03g", "Ty si môj Boh, a ja ťa vyznávam; ty si môj Boh, a ja ťa velebím; ďakujem ti, že si ma zachránil.", "(Porov. Ž 118, 28. 21)",
                    "Vystri ruku a dotkni sa rán po klincoch a nebuď neveriaci, ale veriaci.", "(Porov. Jn 20, 27)"},
            {"05gk", "Čujte slovo, slovo Boha; slovo, ktoré sýti ľudské duše; slovo, ktoré posilňuje srdce i rozum; " +
                    "slovo, ktoré učí poznávať Boha.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Radujme sa všetci v Pánovi a slávme sviatok na počesť svätých Cyrila a Metoda. Z ich oslávenia sa radujú anjeli a spolu s nimi velebia Božieho Syna.", "(Proglas, 24 – 27)",
                    "Pánovo slovo sa šírilo po celom kraji.", "(Sk 13, 49)"},
            {"11g", "Benedikt, milosťou ale i menom požehnaný, bol muž obdivuhodného života, ktorý zanechal dom a majetok, chcel sa páčiť iba Bohu a hľadal spôsob svätého života.", "",
                    "Verný a múdry správca, ktorého pán ustanoví nad svojou čeľaďou, aby jej načas dával určený pokrm.", "(Lk 12, 42)"},
            {"17", "Oslavujme svätých, ktorí dostali požehnanie od Pána a odmenu od Boha, svojho Spasiteľa, lebo sú z pokolenia tých, čo hľadajú Boha.", "(Porov. Ž 24, 5 – 6)",
                    "Ak chceš byť dokonalý, choď, predaj, čo máš, rozdaj chudobným a nasleduj ma, hovorí Pán.", "(Mt 19, 21)"},
            {"17gn", "Oslavujme svätých, ktorí dostali požehnanie od Pána a odmenu od Boha, svojho Spasiteľa, lebo sú z pokolenia tých, čo hľadajú Boha.", "(Porov. Ž 24, 5 – 6)",
                    "Ak chceš byť dokonalý, choď, predaj, čo máš, rozdaj chudobným a nasleduj ma, hovorí Pán.", "(Mt 19, 21)"},
            {"17gkn", "Oslavujme svätých, ktorí dostali požehnanie od Pána a odmenu od Boha, svojho Spasiteľa, lebo sú z pokolenia tých, čo hľadajú Boha.", "(Porov. Ž 24, 5 – 6)",
                    "Ak chceš byť dokonalý, choď, predaj, čo máš, rozdaj chudobným a nasleduj ma, hovorí Pán.", "(Mt 19, 21)"},
    {"22g", "Pán povedal Márii Magdaléne: Choď k mojim bratom a povedz im: Vystupujem k môjmu Otcovi a vášmu Otcovi, k môjmu Bohu a vášmu Bohu.", "(Jn 20, 17)",
            "Ženie nás Kristova láska, aby aj tí, čo žijú, už nežili pre seba, ale pre toho, ktorý za nich zomrel a vstal z mŕtvych.", "(2 Kor 5, 14. 15)"},
    {"23g", "Radujme sa všetci v Pánovi a slávme sviatok na počesť svätej Brigity; z jej oslávenia sa radujú anjeli a spolu s ňou velebia Božieho Syna.", "",
            "Miluješ spravodlivosť a nenávidíš neprávosť, preto ťa Boh, tvoj Boh, pomazal olejom radosti viac ako tvojich druhov.", "(Ž 45, 8)"},
    {"25g", "Keď Ježiš kráčal popri Galilejskom mori, videl Jakuba Zebedejovho, a jeho brata Jána, ako opravujú siete, a povolal ich.", "(Porov. Mt 4, 18. 21)",
            "Pili Pánov kalich a stali sa Božími priateľmi.", ""},
        {"26", "Oslavujme Joachima a Annu v ich pokolení, lebo im Pán daroval požehnanie všetkých národov.", "(Porov. Sir 44, 1. 25)",
                "Dostali požehnanie od Pána a milosrdenstvo od Boha, svojho Spasiteľa.", "(Porov. Ž 24, 5)"},
        {"27", "Oslavujme svätých, ktorí dostali požehnanie od Pána a odmenu od Boha, svojho Spasiteľa, lebo sú z pokolenia tých, čo hľadajú Boha.<br>" +
                "<font color='#B71C1C'>Alebo: (Jer 3, 15)</font><br>" +
                "Dám vám pastierov podľa môjho srdca, ktorí vás budú pásť rozumne a múdro.", "(Porov. Ž 24, 5 – 6)",
                "Poďte ku mne všetci, ktorí sa namáhate a ste preťažení, a ja vás posilním, hovorí Pán.", "(Mt 11, 28)"},
        {"29", "Ježiš vošiel do ktorejsi dediny, kde ho prijala do domu istá žena menom Marta.", "(Porov. Lk 10, 38)",
                "Marta povedala Ježišovi: Ty si Mesiáš, Boží Syn, ktorý mal prísť na svet.", "(Jn 11, 27)"},
        {"31", "Nech sa na meno Ježiš zohne každé koleno v nebi, na zemi i v podsvetí a každý jazyk nech vyznáva, že Ježiš Kristus je Pán na slávu Boha Otca.", "(Porov. Flp 2, 10 – 11)",
                "Pán hovorí: Oheň som prišiel vrhnúť na zem; a čo chcem? Len aby už vzplanul.", "(Porov. Lk 12, 49)"},
    };

    String[][] spev8 = {
            {"06gn", "V žiarivom oblaku sa zjavil Duch Svätý a bolo počuť Otcov hlas: Toto je môj milovaný Syn, v ktorom mám zaľúbenie: počúvajte ho!", "(Porov. Mt 17, 5)",
                    "Keď sa zjaví Kristus, budeme mu podobní, lebo ho budeme vidieť takého, aký je.", "(Porov. 1 Jn 3, 2)"},
            {"08", "Uprostred Božieho ľudu otvoril Pán jeho ústa a naplnil ho duchom múdrosti a rozumu, zaodel ho rúchom slávy.", "(Porov. Sir 15, 5)",
                    "Verný a múdry správca, ktorého pán ustanoví nad svojou čeľaďou, aby jej načas dával určený pokrm.", "(Lk 12, 42)"},
            {"09g", "Ja sa nechcem chváliť ničím iným, iba krížom nášho Pána Ježiša Krista, cez ktorý je svet ukrižovaný pre mňa a ja pre svet.", "(Gal 6, 14)",
                    "Keby som mal ísť uprostred tône smrti, nebudem sa báť zlého, lebo ty si so mnou.", "(Porov. Ž 23, 4 – 5)"},
            {"10g", "Toto je svätý Vavrinec, ktorý pre obohatenie Cirkvi obetoval seba samého; preto si zaslúžil korunu mučeníctva, aby s radosťou vystúpil k Ježišovi Kristovi, nášmu Pánovi.", "",
                    "Ak mi niekto slúži, nech ma nasleduje; a kde som ja, tam bude aj môj služobník, hovorí Pán.", "(Porov. Jn 12, 26)"},
            {"14", "Poďte, požehnaní môjho Otca, hovorí Pán. Veru, hovorím vám: Čokoľvek ste urobili jednému z týchto mojich najmenších bratov, mne ste urobili.", "(Mt 25, 34. 40)",
                    "Nik nemá väčšiu lásku ako ten, kto položí svoj život za svojich priateľov, hovorí Pán.", "(Porov. Jn 15, 13)"},
            {"14gkm", "Cirkev ťa chváli a velebí, Mária, veď dnes si bola vyvýšená nad chóry anjelov a s Kristom vládneš naveky.", "",
                    "Blahoslavená si, Panna Mária, lebo si nosila pod srdcom Syna večného Otca.", "(Porov. Lk 11, 27)"},
            {"15gkm", "Na nebi sa ukázalo veľké znamenie: Žena, odetá slnkom, pod jej nohami mesiac a na jej hlave veniec z dvanástich hviezd.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Radujme sa všetci v Pánovi, lebo v dnešný deň slávime sviatok na počesť Panny Márie. Z jej nanebovzatia sa radujú anjeli a spolu s ňou velebia Božieho Syna.", "(Porov. Zjv 12, 1)",
                    "Blahoslaviť ma budú všetky pokolenia, lebo veľké veci mi urobil ten, ktorý je mocný.", "(Lk 1, 48 – 49)"},
            {"20", "Pán naplnil svätého Bernarda duchom múdrosti a on odovzdával pravé učenie Božiemu ľudu.", "",
                    "Ako mňa miluje Otec, tak ja milujem vás, hovorí Pán. Ostaňte v mojej láske.", "(Jn 15, 9)"},
            {"22m", "Po tvojej pravici stojí kráľovná, ozdobená zlatom z Ofíru.", "(Porov. Ž 45, 10)",
                    "Blahoslavená si, lebo si uverila, že sa splní, čo ti povedal Pán.", "(Porov. Lk 1, 54)"},
            {"24g", "Zvestujte Božiu spásu deň čo deň; zvestujte jeho slávu pohanom.", "(Porov. Ž 96, 2 – 3)",
                    "Ja vám dám kráľovstvo, ako ho môj Otec dal mne, aby ste jedli a pili pri mojom stole v mojom kráľovstve, hovorí Pán.", "(Lk 22, 29 – 30)"},
            {"28", "Uprostred Božieho ľudu otvoril Pán jeho ústa a naplnil ho duchom múdrosti a rozumu; zaodel ho rúchom slávy.", "(Porov. Sir 15, 5)",
                    "Pán hovorí: Len jediný je váš učiteľ, Kristus; vy všetci ste bratia.", "(Mt 23, 10. 8)"},
            {"29", "O tvojej náuke, Pane, som svedčil pred kráľmi a nehanbil som sa. Tešil som sa z tvojich predpisov, lebo som si ich obľúbil.", "(Porov. Ž 119, 46 – 47)",
                    "Ján povedal: On musí rásť a mňa musí ubúdať.", "(Jn 3, 27. 30)"},
    };

    String[][] spev9 = {
            {"03", "Svätý Gregor, povýšený na Petrovu katedru, vždy hľadal Pánovu tvár a žil v sláve jeho lásky.", "",
                    "Verný a múdry správca, ktorého pán ustanoví nad svojou čeľaďou, aby jej načas dával určený pokrm.", "(Lk 12, 42)"},
            {"07", "Velebte Pána, vy, jeho kňazi, velebte Pána, svätí a pokorní srdcom.", "(Dan 3, 84. 87)",
                    "Každého, kto mňa vyzná pred ľuďmi, aj ja vyznám pred svojím Otcom, ktorý je na nebesiach, hovorí Pán.", "(Mt 10, 32)"},
            {"08gm", "S radosťou slávime narodenie preblahoslavenej Panny Márie, lebo z nej vzišlo slnko spravodlivosti, Kristus, náš Boh.", "",
                    "Hľa, panna porodí Syna; on vyslobodí svoj ľud z hriechov.", "(Iz 7, 14; Mt 1, 21)"},
            {"12m", "Požehnaná si, Panna Mária, od Pána, Boha najvyššieho, nad všetky ženy na svete; lebo tvoje meno tak zvelebil, že tvoja chvála nevymizne z úst ľudí.", "(Porov. Jdt 13, 18 – 20)",
                    "Blahoslaviť ma budú všetky pokolenia, pretože Boh zhliadol na poníženosť svojej služobnice.", "(Porov. Lk 1, 48)"},
            {"13", "Múdri sa budú skvieť ako jas oblohy a tí, čo mnohých priviedli k spravodlivosti, ako hviezdy na večné veky.", "(Porov. Dan 12, 3)",
                    "My ohlasujeme ukrižovaného Krista, Krista – Božiu moc a Božiu múdrosť.", "(Porov. 1 Kor 1, 23 – 24)"},
            {"14gn", "My sa máme chváliť krížom nášho Pána Ježiša Krista, v ktorom je spása, život a naše vzkriesenie; on nás oslobodil a spasil.", "(Porov. Gal 6, 14)",
                    "Ja, až budem vyzdvihnutý od zeme, všetkých pritiahnem k sebe, hovorí Pán.", "(Jn 12, 32)"},
            {"15gkm", "Pri Ježišovom kríži stála jeho matka. Keď Ježiš uzrel matku a pri nej učeníka, ktorého miloval, povedal matke: Žena, hľa, tvoj syn. Potom povedal učeníkovi: Hľa, tvoja matka.<br>" +
                    "<font color='#B71C1C'>Alebo: (JKS 394, 1)</font><br>" +
                    "Ó, Mária bolestivá, naša ochrana, slovenský náš národ volá: Pros za nás Boha. Ty si Mať dobrotivá, patrónka ľútostivá, oroduj vždy za náš národ u svojho Syna.", "(Porov. Jn 19, 25 – 27)",
                    "Radujte sa, keď máte účasť na Kristových utrpeniach, aby ste sa radovali a plesali aj vtedy, keď sa zjaví jeho sláva.", "(Porov. 1 Pt 4, 13)"},
            {"20", "Svätí mučeníci vyliali krv pre Krista na tejto zemi, preto dosiahli odmenu vo večnosti.", "",
                    "Každého, kto mňa vyzná pred ľuďmi, aj ja vyznám pred svojím Otcom, ktorý je na nebesiach.", "(Mt 10, 32)"},
            {"21g", "Choďte, učte všetky národy, krstite ich a naučte ich zachovávať všetko, čo som vám prikázal, hovorí Pán.", "(Mt 28, 19 – 20)",
                    "Neprišiel som volať spravodlivých, ale hriešnikov, hovorí Pán.", "(Mt 9, 13) "},
            {"27", "Duch Pána je nado mnou, lebo ma pomazal, aby som hlásal evanjelium chudobným a uzdravoval skrúšených srdcom.", "(Porov. Lk 4, 18)",
                    "Nech oslavujú Pána za jeho milosrdenstvo a za zázraky v prospech ľudí, lebo smädného napojil a hladného nakŕmil dobrotami.", "(Porov. Ž 107, 8 – 9)"},
            {"29g", "Dobrorečte Pánovi, všetci jeho anjeli, udatní hrdinovia, čo počúvate na jeho slová a plníte jeho príkazy.", "(Porov. Ž 103, 20)",
                    "Chcem ťa, Pane, oslavovať celým srdcom, budem ti hrať pred tvárou anjelov.", "(Ž 138, 1)"},
            {"30", "Blažený muž, čo o zákone Pánovom rozjíma dňom i nocou; prináša ovocie v pravý čas.", "(Porov. Ž 1, 2 – 3)",
                    "Našli sa tvoje reči a ja som ich zjedol. Tvoje slovo sa stalo radosťou a potešením môjho srdca, lebo nosím tvoje meno, Pane Bože.", "(Porov. Jer 15, 16)"},
    };

    String[][] spev10 = {
            {"01", "Pán sa jej ujal a dával na ňu pozor; strážil ju ako zrenicu svojho oka. Ako keď orol durí k letu svoje mláďatá a krúži nad nimi, tak rozprestiera svoje krídla a zachytáva ju a nesie ju na svojich perutiach. Pán sám bol jej vodcom.", "(Porov. Dt 32, 10 – 12)",
                    "Pán hovorí: Ak sa neobrátite a nebudete ako deti, nevojdete do nebeského kráľovstva.", "(Mt 18, 3)"},
            {"02", "Velebte Pána, všetci Pánovi anjeli, chváľte a vyvyšujte ho naveky.", "(Porov. Dan 3, 58)",
                    "Budem ti hrať pred tvárou anjelov, môj Bože.", "(Porov. Ž 138, 1)"},
            {"04", "Boží muž František opustil rodičovský dom, zriekol sa svojho dedičstva a stal sa biednym a chudobným; ale Pán ho prijal k sebe.", "",
                    "Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo.", "(Mt 5, 3)"},
            {"07m", "Zdravas', Mária, milosti plná, Pán s tebou: požehnaná si medzi ženami a požehnaný je plod tvojho života.", "(Porov. Lk 1, 28. 42)",
                    "Počneš a porodíš Syna a dáš mu meno Ježiš.", "(Lk 1, 31)"},
            {"15", "Ako jeleň dychtí za vodou z prameňa, tak moja duša, Bože, túži za tebou. Po Bohu žízni moja duša, po Bohu živom.", "(Porov. Ž 42, 2 – 3)",
                    "Pánovo milosrdenstvo chcem ospevovať naveky; po všetky pokolenia hlásať svojimi ústami tvoju vernosť.", "(Ž 89, 2)"},
            {"17", "S Kristom som pribitý na kríž; už nežijem ja, ale vo mne žije Kristus; žijem vo viere v Božieho Syna, ktorý ma miluje a vydal seba samého za mňa.", "(Porov. Gal 2, 19 – 20)",
                    "Som Kristovým pšeničným zrnom, nech ma rozomelú zuby šeliem, aby som sa stal čistým chlebom.", ""},
            {"18g", "Aké krásne sú na horách nohy posla, ktorý hlása pokoj, posla dobrej zvesti, ktorý ohlasuje spásu.", "(Iz 52, 7)",
                    "Pán poslal učeníkov, aby ohlasovali mestám: Priblížilo sa k vám Božie kráľovstvo.", "(Porov. Lk 10, 1. 9)"},
            {"19b", "Rozhodol som sa, že nechcem medzi vami vedieť nič iné, iba Ježiša Krista, a to ukrižovaného.", "(Porov. 1 Kor 2, 2)",
                    "My ohlasujeme ukrižovaného Krista, Krista – Božiu moc a Božiu múdrosť.", "(1 Kor 1, 23. 24)"},
            {"26gk+", "Vznešený je Boh vo svojej svätyni, Boh Izraela,<br>" +
                    "on sám dáva silu i statočnosť svojmu ľudu.<br>" +
                    "Nech je zvelebený Boh.", "(Ž 67, 36)",
                    "Vy ste chrámom Božím<br>" +
                            "a Duch Svätý prebýva vo vás.<br>" +
                            "Boží chrám je svätý,<br>" +
                            "a tým chrámom ste vy.", "(Porov. 1 Kor 3, 16-17)"},
            {"28g", "Toto sú svätí muži, ktorých si Pán vyvolil v úprimnej láske a dal im večnú slávu.", "",
                    "Kto ma miluje, bude zachovávať moje slovo, hovorí Pán; a môj Otec ho bude milovať, prídeme k nemu a urobíme si uňho príbytok.", "(Jn 14, 23)"},
            {"31gk", "Radujme sa všetci v Pánovi, lebo dnes slávime sviatok na počesť všetkých svätých. Z ich oslávenia sa radujú anjeli a spolu s nimi velebia Syna Božieho.", "",
                    "Blahoslavení čistého srdca, lebo oni uvidia Boha. Blahoslavení tí, čo šíria pokoj, lebo ich budú volať Božími synmi. Blahoslavení prenasledovaní pre spravodlivosť, lebo ich je nebeské kráľovstvo.", "(Mt 5, 8 – 10)"},
    };

    String[][] spev11 = {
            {"01gk", "Radujme sa všetci v Pánovi, lebo dnes slávime sviatok na počesť všetkých svätých. Z ich oslávenia sa radujú anjeli a spolu s nimi velebia Syna Božieho.", "",
                    "Blahoslavení čistého srdca, lebo oni uvidia Boha. Blahoslavení tí, čo šíria pokoj, lebo ich budú volať Božími synmi. Blahoslavení prenasledovaní pre spravodlivosť, lebo ich je nebeské kráľovstvo.", "(Mt 5, 8 – 10)"},
            {"02an", "Ako Ježiš zomrel a vstal z mŕtvych, tak Boh tých, čo zosnuli, skrze Ježiša privedie s ním. Lebo ako všetci umierajú v Adamovi, tak zasa všetci ožijú v Kristovi.", "(Porov. 1 Sol 4, 14; 1 Kor 15, 22)",
                    "Ja som vzkriesenie a život, hovorí Pán. Kto verí vo mňa, bude žiť, aj keď umrie. A nik, kto žije a verí vo mňa, neumrie naveky.", "(Porov. Jn 11, 25 – 26)"},
            {"02bn", "Odpočinutie večné daj im, Pane, a svetlo večné nech im svieti.", "(Porov. 4 Ezd 2, 34 – 35)",
                    "Svetlo večné nech im svieti, Pane, v spoločenstve tvojich svätých, veď si dobrotivý.", "(Porov. 4 Ezd 2, 35. 34)"},
            {"02cn", "Boh, ktorý vzkriesil Ježiša z mŕtvych, oživí aj naše smrteľné telá skrze svojho Ducha, ktorý prebýva v nás.", "(Porov. Rim 8, 11)",
                    "Očakávame Spasiteľa, nášho Pána Ježiša Krista; on pretvorí naše úbohé telo, aby sa stalo podobným jeho oslávenému telu.", "(Porov. Flp 3, 20 – 21)"},
            {"09g", "Videl som, ako z neba od Boha zostupuje sväté mesto, nový Jeruzalem, vystrojené ako nevesta, ozdobená pre svojho ženícha.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Zjv 21, 3)</font><br>" +
                    "Hľa, Boží stánok je medzi ľuďmi! A bude medzi nimi prebývať; oni budú jeho ľudom a sám Boh – ich Boh – bude s nimi.", "(Porov. Zjv 21, 2)",
                    "Dajte sa vbudovať aj vy ako živé kamene do duchovného domu, do svätého kňazstva.", "(Porov. 1 Pt 2, 5)"},
            {"10", "Pán uzavrel s ním zmluvu pokoja, postavil ho na čelo svojho ľudu a dal mu kňazskú hodnosť naveky.", "(Porov. Sir 45, 30)",
                    "Peter povedal Ježišovi: Ty si Mesiáš, Syn živého Boha. Ježiš mu odpovedal: Ty si Peter a na tejto skale postavím svoju Cirkev.", "(Mt 16, 16. 18)"},
            {"11", "Povolám si verného kňaza, ktorý bude konať podľa môjho srdca a podľa môjho zmýšľania, hovorí Pán.", "(Porov. 1 Sam 2, 35)",
                    "Veru, hovorím vám: Čokoľvek ste urobili jednému z týchto mojich najmenších bratov, mne ste urobili, hovorí Pán.", "(Porov. Mt 25, 40)"},
            {"11g", "Povolám si verného kňaza, ktorý bude konať podľa môjho srdca a podľa môjho zmýšľania, hovorí Pán.", "(Porov. 1 Sam 2, 35)",
                    "Veru, hovorím vám: Čokoľvek ste urobili jednému z týchto mojich najmenších bratov, mne ste urobili, hovorí Pán.", "(Porov. Mt 25, 40)"},
            {"12", "Kvôli zmluve Pána a zákonu Otcov vytrvali svätí Boží v bratskej láske; vládol medzi nimi jeden duch a jedna viera.", "",
                    "Kto stratí svoj život pre mňa, hovorí Pán, nájde ho naveky.", "(Mt 10, 39)"},
            {"18", "Urobíš ich kniežatami nad celou zemou. Na tvoje meno budú pamätať vo všetkých pokoleniach. Preto ťa národy budú velebiť navždy a na veky vekov.", "(Porov. Ž 45, 17 – 18)",
                    "Pane, ty máš slová večného života; a my sme uverili a spoznali, že ty si Mesiáš, Boží Syn.", "(Porov. Jn 6, 69. 70) "},
            {"24", "Nechceme sa chváliť ničím iným, iba krížom nášho Pána Ježiša Krista. Lebo slovo kríža je pre nás, čo sme na ceste spásy, Božou mocou.", "(Porov. Gal 6, 14; porov. 1 Kor 1, 18)",
                    "Blahoslavení prenasledovaní pre spravodlivosť, lebo ich je nebeské kráľovstvo.", "(Mt 5, 10)"},
            {"30g", "Pán videl pri Galilejskom mori dvoch bratov, Petra a Ondreja, a povolal ich: Poďte za mnou a urobím z vás rybárov ľudí.", "(Porov. Mt 4, 18 – 19)",
                    "Ondrej povedal svojmu bratovi Šimonovi: Našli sme Mesiáša, čo v preklade znamená Kristus. A priviedol ho k Ježišovi.", "(Porov. Jn 1, 41 – 42)"},
    };

    String[][] spev12 = {
            {"03", "Budem ťa, Pane, chváliť medzi národmi a hlásať tvoje meno svojim bratom.", "(Ž 18, 50; 22, 23)",
                    "Čo vám hovorím vo tme, hovorte na svetle, hovorí Pán, a čo počujete do ucha, rozhlasujte zo striech.", "(Mt 10, 27)"},
            {"07", "Uprostred Božieho ľudu otvoril Pán jeho ústa a naplnil ho duchom múdrosti a rozumu," +
                    "zaodel ho rúchom slávy.", "(Porov. Sir 15, 5)",
                    "Ten, čo o zákone Pánovom rozjíma dňom i nocou, prináša ovocie v pravý čas.", "(Porov. Ž 1, 2. 3)"},
            {"14", "Ja sa nechcem chváliť ničím iným, iba krížom nášho Pána Ježiša Krista, cez ktorý je svet ukrižovaný pre mňa a ja pre svet.", "(Gal 6, 14)",
                    "Kto chce ísť za mnou, nech zaprie sám seba, vezme svoj kríž a nasleduje ma, hovorí Pán.", "(Porov. Mt 16, 24)"},
            {"17", "Radujte sa, nebesia, a plesaj zem, lebo náš Pán príde a zľutuje sa nad svojimi biednymi.", "(Porov. Iz 49, 13)",
                    "Hľa, príde ten, po ktorom túžia všetky národy, a Pánov dom sa naplní slávou.", "(Porov. Ag 2, 7)"},
            {"18", "Príde Kristus, náš Kráľ; Ján o ňom povedal, že príde ako Baránok.", "",
                    "Dajú mu meno Emanuel, čo v preklade znamená: Boh s nami.", "(Mt 1, 23)"},
            {"19", "Ten, ktorý má prísť, príde, nebude meškať a na našej zemi už nebude úzkosť, lebo on je náš Spasiteľ.", "(Porov. Hebr 10, 37)",
                    "Navštívi nás Vychádzajúci z výsosti a naše kroky upriami na cestu pokoja.", "(Lk 1, 78 – 79)"},
            {"20", "Z kmeňa Jesseho vzíde ratolesť. Celá zem sa naplní Pánovou slávou a každé telo uvidí Božiu spásu.", "(Porov. Iz 11, 1; 40, 5; Lk 3, 6)",
                    "Anjel povedal Márii: Počneš a porodíš syna a dáš mu meno Ježiš.", "(Lk 1, 31)"},
            {"21", "Čoskoro príde Vládca, Pán; bude sa volať Emanuel, lebo s nami je Boh.", "(Porov. Iz 7, 14; 8, 10)",
                    "Blahoslavená je tá, ktorá uverila, že sa splní, čo jej povedal Pán.", "(Lk 1, 45)"},
            {"22", "Zdvihnite, brány, svoje hlavice a vyvýšte sa, brány prastaré, lebo má vstúpiť kráľ slávy.", "(Ž 24, 7)",
                    "Velebí moja duša Pána, lebo veľké veci mi urobil ten, ktorý je mocný.", "(Lk 1, 46. 49)"},
            {"23", "Chlapček sa nám narodí a bude sa volať Mocný Boh. V ňom budú požehnané všetky kmene zeme.", "(Porov. Iz 9, 6; Ž 71, 17)",
                    "Hľa, stojím pri dverách a klopem. Kto počúvne môj hlas a otvorí dvere, k tomu vojdem a budem s ním večerať a on so mnou.", "(Zjv 3, 20)"},
            {"24", "Hľa, už prišla plnosť času, v ktorom Boh poslal na zem svojho Syna.", "(Porov. Gal 4, 4)",
                    "Nech je zvelebený Pán, Boh Izraela, lebo navštívil a vykúpil svoj ľud.", "(Lk 1, 68)"},
            {"24gkn", "Dnes sa dozviete, že príde Pán a spasí nás, a ráno uvidíte jeho slávu.", "(Porov. Ex 16, 6 – 7)",
                    "Zjaví sa Pánova sláva a každé stvorenie uvidí Božiu spásu.", "(Porov. Iz 40, 5)"},
            {"25agkn", "Pán mi povedal: Ty si môj Syn, ja som ťa dnes splodil.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Radujme sa všetci v Pánovi, veď sa na svete narodil náš Spasiteľ. Dnes k nám z neba zostúpil pravý pokoj.", "(Ž 2, 7)",
                    "Slovo sa telom stalo a my sme uvideli jeho slávu.", "(Jn 1, 14)"},
            {"25bgkn", "Dnes zažiarilo nad nami svetlo, lebo sa nám narodil Pán. Bude sa volať: Mocný Boh, Knieža pokoja, Otec budúceho veku, ktorého kráľovstvu nebude konca.", "(Porov. Iz 9, 1. 5; Lk 1, 33)",
                    "Plesaj, dcéra sionská, jasaj, dcéra jeruzalemská! Hľa, tvoj Kráľ prichádza, Svätý, Spasiteľ sveta.", "(Porov. Zach 9, 9)"},
            {"25cgkn", "Chlapček sa nám narodil, daný nám je Syn. Na jeho pleciach spočíva vláda a volajú ho obdivuhodný Radca.", "(Iz 9, 5)",
                    "Uzreli všetky končiny zeme spásu nášho Boha.", "(Porov. Ž 98, 3)"},
            {"26g", "Svätému Štefanovi sa otvorili brány neba a ako prvý z veľkého počtu mučeníkov dosiahol veniec slávy.", "",
                    "Keď kameňovali Štefana, on sa modlil a volal: Pane Ježišu, prijmi môjho ducha!", "(Sk 7, 58)"},
            {"27g", "Toto je Ján, ktorý pri večeri sklonil hlavu na Pánovu hruď; svätý apoštol, ktorému Pán zjavil nebeské tajomstvá a on ohlasoval po celom svete slová života.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Sir 15, 5)</font><br>" +
                    "Uprostred zhromaždenia mu Pán otvoril ústa; naplnil ho duchom múdrosti a rozumu a zaodel ho rúchom slávy.", "",
                    "Slovo sa telom stalo a prebývalo medzi nami. A z jeho plnosti sme prijali všetci.", "(Jn 1, 14. 16)"},
            {"28g", "Nevinné deti, zabité pre Krista, nasledujú nepoškvrneného Baránka a ustavične volajú: Sláva tebe, Pane.", "",
                    "Oni sú vykúpení z ľudí ako prvotiny Bohu a Baránkovi; preto nasledujú Baránka, kamkoľvek ide.", "(Porov. Zjv 14, 4)"},
            {"29", "Boh tak miloval svet, že dal svojho jednorodeného Syna, aby nezahynul nik, kto v neho verí, ale aby mal večný život.", "(Jn 3, 16)",
                    "Z hĺbky milosrdenstva nášho Boha navštívil nás Vychádzajúci z výsosti.", "(Lk 1, 78)"},
            {"30", "Keď všade vládlo hlboké ticho a noc vo svojom behu prešla polovicu cesty, tvoje všemohúce slovo, Pane, zostúpilo z neba, z kráľovského trónu.", "(Múd 18, 14 – 15)",
                    "Z jeho plnosti sme my všetci dostali milosť za milosťou.", "(Jn 1, 16)"},
            {"31", "Chlapček sa nám narodil, daný nám je Syn. Na jeho pleciach spočíva vláda a volajú ho obdivuhodný Radca.", "(Iz 9, 6)",
                    "Boh poslal svojho jednorodeného Syna na svet, aby sme skrze neho mali život.", "(1 Jn 4, 9)"},
            {"31gk", "Zdravas', svätá Matka! Ty si porodila Kráľa, ktorý večne riadi nebo i zem.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Iz 9, 1. 5; Lk 1, 33)</font><br>" +
                    "Dnes zažiarilo nad nami svetlo, lebo sa nám narodil Pán. Bude sa volať: Mocný Boh, Knieža pokoja, Otec budúceho veku, ktorého kráľovstvu nebude konca.", "(Sedulius)",
                    "Ježiš Kristus je ten istý včera i dnes a naveky.", "(Hebr 13, 8)"},
    };

}


