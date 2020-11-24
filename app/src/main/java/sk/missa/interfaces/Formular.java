package sk.missa.interfaces;

/*
Spevy, modlitby, prosby zo spoločných častí na sviatky svätých
- pohyblivy sviatok - 1op - v maji a juni - formular ID: 01

v dvojrozmerných poliach (formular1, formular2...) sa nachádzajú ID sviatkov, pri ktorých sa nachádzajú priradené ID spoločných častí podľa vzoru nižšie

spevFormular - {ID spoločnej časti, názov spoločnej časti, úvodný spev - text, úvodný spev - súradnice, spev po prijímaní - text, spev po prijímaní - súradnice},
modlitbaFormular - {ID spoločnej časti, názov spoločnej časti, modlitba dňa, modlitba nad obetnými darmi, modlitba po prijímaní},
prosbyFormular - {ID spoločnej časti, názov spoločnej časti, úvodná výzva, odpoveď ľudu, úmysly, záverečná modlitba},

SPOLOCNE OMSE PREBLAHOSLAVENEJ PANNY MÁRIE
11 – cez rok
12 - advent
13 - vianocne
14 - velkonocne
15 - mariánske formulare
16 - NEPOŠKVRNENÉHO SRDCA PANNY MÁRIE (Každý prvú sobotu okrem sviatku a slávnosti)
SPOLOCNE OMSE MUCENIKOV
21 - omsa viacerých muceníkov mimo velkonocneho obdobia
22 - omsa jedneho muceníka mimo velkonocneho obdobia
23 - omsa viacerých muceníkov vo velkonocnom obdobi
24 - omsa jedného muceníka vo velkonocnom obdobi
(Svätí mučeníci vyliali krv pre Krista na tejto zemi, preto dosiahli odmenu vo večnosti.)
25 - omsa o mucenikoch misionaroch
26 - omsa o panne mucenici
27 - omsa o svatej zene mucenici
SPOLOCNE OMSE DUCHOVNYCH PASTIEROV,
31 - omsa o papezoch alebo biskupov
32 - omsa o biskupoch
33 - omsa o duchovnych pastieroch
34 - omsa o zakladateloch miestych cirkvi
35 - omsa o misionaroch
SPOLOCNE OMSE UCITELOV CIRKVI
4 – omse ucitelov cirkvi
SPOLOCNE OMSE PANNIEN
51 – omsa o jednej panne
52 - omsa o viacerych pannach
SPOLOCNE OMSE SVATYCH MUZOV A SVATYCH ZIEN
61 - omse svatych muzov a svatych zien
62 - omsa o reholnikoch
63 - omsa o tych, co konali skutky milosrdensta
64 - omsa o vychovavateloch
65 - omsa o svatych zenach
SPECIALNE
71 - Jarné kántrové dni
72a - Za jednotu kresťanov - Letné kántrové dni
72b - Za kňazské/duchovné povolania - Letné kántrové dni
73 - Jesenné kántrové dni
74 - Zimné kántrové dni
75 - Prosebné dni
76 - Za jednotu kresťanov
VLASTNE FORMULARE
01 - Pondelok po zoslaní DS
02 - NAJSVÄTEJŠIEHO SRDCA JEŽIŠOVHO
03 - VOTÍVNA OMŠA O NAJSVÄTEJŠOM SRDCI JEŽIŠOVOM
04 - Výročie posviacky chrámu (slávenie mimo chrámu)
05 - V čase pandémie (+ za chorých II.)
   */

public interface Formular {

    String[][] formular1 = {
            {"002", "72b"},
            {"009", "76"},
            {"02a", "32", "4"},
            {"07", "33"},
            {"13", "32", "4"},
            {"20a", "22", "31"},
            {"20b", "22"},
            {"20g+", "22"},
            {"21", "22", "51"},
            {"22", "22"},
            {"24", "32", "4"},
            {"26", "32"},
            {"27", "51", "64"},
            {"28", "33", "4"},
            {"31", "33", "64"},
    };

    String[][] formular2 = {
            {"002", "72b"},
            {"004", "71"},
            {"03a", "21", "32"},
            {"03b", "35", "32"},
            {"05", "22", "51"},
            {"06", "21"},
            {"08a", "64"},
            {"08b", "51"},
            {"10", "51", "62"},
            {"11m", "11"},
            {"14", "62"},
            {"17", "62"},
            {"21", "4", "32"},
            {"23", "22"},
    };
    String[][] formular3 = {
            {"002", "72b"},
            {"004", "71"},
            {"04", "61"},
            {"07", "21", "65"},
            {"08", "62", "63"},
            {"09", "62"},
            {"10gv", "04"},
            {"17", "35", "32"},
            {"18", "32", "4"},
            {"23", "32"},
    };
    String[][] formular4 = {
            {"002", "72b"},
            {"005", "72a", "72b"},
            {"008", "75"},
            {"02", "62"},
            {"04", "32", "4"},
            {"05", "35"},
            {"07", "33", "64"},
            {"11", "24", "32"},
            {"13", "24", "31"},
            {"21", "32", "4"},
            {"24a", "24"},
            {"24b", "24", "33"},
            {"28a", "24", "35"},
            {"28b", "35"},
            {"30", "31"},
    };
    String[][] formular5 = {
            {"002", "72b"},
            {"005", "72a", "72b"},
            {"008", "75"},
            {"02", "32", "4"},
            {"04", "24"},
            {"11", "51", "22"},
            {"12a", "22"},
            {"12b", "22"},
            {"13m", "11"},
            {"18", "22"},
            {"20", "35"},
            {"21", "21"},
            {"22", "62"},
            {"25a", "4", "62"},
            {"25b", "31"},
            {"25c", "51", "62"},
            {"26", "33", "62"},
            {"27", "35", "32"},
            {"29", "31"},
            {"1op", "01a", "01b"},
    };
    String[][] formular6 = {
            {"002", "72b"},
            {"005", "72a", "72b"},
            {"008", "75"},
            {"02", "21"},
            {"03", "21"},
            {"05", "22", "35"},
            {"06", "32", "62"},
            {"09", "4"},
            {"13", "33", "4", "62"},
            {"13gv", "04"},
            {"16", "22"},
            {"19", "62"},
            {"22a", "32"},
            {"22b", "21"},
            {"27a", "61"},
            {"27b", "32", "4"},
            {"28", "22", "32"},
            {"30", "21"},
            {"1op", "01a", "01b"},
    };
    String[][] formular7 = {
            {"002", "72b"},
            {"04", "63"},
            {"06", "22", "51"},
            {"07", "33", "64", "62"},
            {"09", "33", "21"},
            {"12", "61"},
            {"11g", "62"},
            {"13", "61"},
            {"14", "63"},
            {"15", "32", "4"},
            {"16m", "11"},
            {"20", "32", "22"},
            {"21", "33", "4"},
            {"23g", "61"},
            {"24", "33"},
            {"30", "32", "4"},
            {"30b", "26", "51"},
    };
    String[][] formular8 = {
            {"002", "72b"},
            {"01", "32", "4"},
            {"02a", "32"},
            {"02b", "33", "62"},
            {"04", "33"},
            {"05", "11"},
            {"07a", "21"},
            {"07b", "33", "62"},
            {"08", "33", "62"},
            {"11", "51", "62"},
            {"12", "11", "62"},
            {"13", "21", "33"},
            {"16", "61"},
            {"18", "65"},
            {"19", "33", "62"},
            {"20", "4", "62"},
            {"23", "51", "62"},
            {"25a", "61"},
            {"25b", "33", "64"},
            {"27", "65"},
            {"30gv", "04"},
    };
    String[][] formular9 = {
            {"002", "72b"},
            {"006", "73"},
            {"03", "33", "4"},
            {"06gv", "04"},
            {"09", "33"},
            {"12m", "11"},
            {"13", "32", "4"},
            {"16", "21", "32"},
            {"17", "32", "4"},
            {"19", "22", "32"},
            {"22+", "22", "32"},
            {"23", "33", "62"},
            {"24gv", "04"},
            {"26", "21"},
            {"28a", "22"},
            {"28b", "21"},
    };
    String[][] formular10 = {
            {"002", "72b"},
            {"05", "51", "51", "61"},
            {"06", "33", "62"},
            {"09a", "21"},
            {"09b", "35", "63"},
            {"10gv", "04"},
            {"11", "31"},
            {"14", "22", "31"},
            {"16a", "62"},
            {"16b", "51", "62"},
            {"16c", "33"},
            {"19a", "21", "35"},
            {"22", "31"},
            {"23", "35"},
            {"24", "32", "35"},
            {"25", "32"},
            {"25gv", "04"},
            {"27gv", "04"},
    };
    String[][] formular11 = {
            {"002", "72b"},
            {"03", "62"},
            {"04", "32"},
            {"05", "61"},
            {"09g", "04"},
            {"10", "31", "4"},
            {"12", "22", "32"},
            {"15", "32", "4"},
            {"16a", "63"},
            {"16b", "51", "62"},
            {"17", "63"},
            {"20", "26", "51"},
            {"20gv", "04"},
            {"21m", "11"},
            {"22", "22", "51"},
            {"23a", "22", "31"},
            {"23b", "35", "62"},
            {"25", "22", "51"},
    };
    String[][] formular12 = {
            {"002", "72b"},
            {"003", "12", "15"},
            {"007", "74"},
            {"03", "35"},
            {"03g", "35"},
            {"04a", "33", "4"},
            {"04b", "26", "51"},
            {"06", "32"},
            {"07", "32", "4"},
            {"09", "61"},
            {"10m", "11"},
            {"11", "31"},
            {"12", "12"},
            {"13", "26", "51"},
            {"21a", "33", "4"},
            {"23a", "33", "63"},
            {"29a", "22", "32"},
            {"31a", "31"},
    };

    String[][] spevFormular = {
            {"01a", "1", "Votívna omša 1.", "Božia láska sa rozlieva v našich srdciach<br>" +
                    "skrze Ducha Svätého, ktorý v nás prebýva.", "(Porov. Rim 5, 5; 8, 11)",
                    "Upevni, Bože, čo si pre nás vykonal,<br>" +
                            "zo svojho svätého chrámu.", "(Porov. Ž 67, 29)"},
            {"01a", "2", "Votívna omša 2.", "Pán Ježiš hovorí: Keď príde Duch pravdy,<br>" +
                    "pripomenie vám všetko, čo som vám povedal.", "(Porov. Jn 14, 26; 15, 26)",
                    "Pán Ježiš hovorí:<br>" +
                            "Duch, ktorý vychádza z Otca, ma oslávi.", "(Jn 15, 26; 16, 14)"},
            {"01a", "3", "Votívna omša 3.", "Duch Pánov je nado mnou,<br>" +
                    "poslal ma hlásať blahozvesť chudobným, hovorí Pán.", "(Lk 4, 18)",
                    "Pane, zošli svojho Ducha, a všetko ožije,<br>" +
                            "a obnovíš tvárnosť zeme.", "(Porov. Ž 103, 30)"},
            {"01A", "1", "Zoslanie Ducha Svätého (rok A)", "Duch Boží napĺňa celý svet;<br>" +
                    "on všetko udržiava<br>" +
                    "a pozná každú reč. Aleluja.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Rim 5, 5; 8, 11)</font><br>" +
                    "V našich srdciach sa rozlieva Božia láska<br>" +
                    "skrze Ducha Svätého, ktorý je nám daný. Aleluja.", "(Múd 1, 7)",
                    "Všetci boli naplnení Duchom Svätým<br>" +
                            "a začali ohlasovať veľké Božie skutky. Aleluja.", "(Sk 2, 4. 11)"},
            {"01B", "1", "Zoslanie Ducha Svätého (rok B)", "Duch Boží napĺňa celý svet;<br>" +
                    "on všetko udržiava<br>" +
                    "a pozná každú reč. Aleluja.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Rim 5, 5; 8, 11)</font><br>" +
                    "V našich srdciach sa rozlieva Božia láska<br>" +
                    "skrze Ducha Svätého, ktorý je nám daný. Aleluja.", "(Múd 1, 7)",
                    "Všetci boli naplnení Duchom Svätým<br>" +
                            "a začali ohlasovať veľké Božie skutky. Aleluja.", "(Sk 2, 4. 11)"},
            {"01C", "1", "Zoslanie Ducha Svätého (rok C)", "Duch Boží napĺňa celý svet;<br>" +
                    "on všetko udržiava<br>" +
                    "a pozná každú reč. Aleluja.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Rim 5, 5; 8, 11)</font><br>" +
                    "V našich srdciach sa rozlieva Božia láska<br>" +
                    "skrze Ducha Svätého, ktorý je nám daný. Aleluja.", "(Múd 1, 7)",
                    "Všetci boli naplnení Duchom Svätým<br>" +
                            "a začali ohlasovať veľké Božie skutky. Aleluja.", "(Sk 2, 4. 11)"},
            {"02", "1", "Najsvätejšieho Srdca Ježišovho", "Pánove úmysly sú večné, zámery jeho srdca trvajú naveky.<br>" +
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
            {"03", "1", "Votívna omša o Najsvätejšom Srdci Ježišovom", "Pánov úmysel trvá naveky,<br>" +
                    "myšlienky jeho srdca z pokolenia na pokolenie:<br>" +
                    "zachráni nám život pred smrťou a v čase hladu nás nakŕmi.", "(Porov. Ž 32, 11. 19)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ak je niekto smädný,<br>" +
                            "nech príde ku mne a nech pije.<br>" +
                            "Kto verí vo mňa, o tom platí, čo hovorí Písmo:<br>" +
                            "Z jeho vnútra potečú prúdy živej vody.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 19, 34)</font><br>" +
                            "Jeden z vojakov kopijou prebodol Ježišovi bok,<br>" +
                            "a hneď vyšla krv a voda.", "(Jn 7, 37 – 38)"},
            {"04", "1", "Výročie posviacky chrámu (slávenie mimo chrámu)", "Videl som zostupovať z nebies od Boha<br>" +
                    "sväté mesto, nový Jeruzalem,<br>" +
                    "vystrojené ako nevestu,<br>" +
                    "ktorá sa vyzdobila pre svojho ženícha", "(Zjv 21, 2)",
                    "Aj vy, ako živé kamene,<br>" +
                            "budujete duchovný dom, sväté kňazstvo.", "(1 Pt 2, 5)",},

            // SPOLOCNE OMSE PREBLAHOSLAVENEJ PANNY MÁRIE
            {"11", "1", "Omša k preblahoslavenej Panne Marií 1.", "Zdravas, svätá Matka.<br>" +
                    "Ty si porodila Kráľa,<br>" +
                    "ktorý večne vládne nad nebom i zemou.", "(Sedulius)",
                    "Blahoslavená si, Panna Mária,<br>" +
                            "lebo si v živote nosila Syna večného Otca.", "(Porov. Lk 11, 27)"},
            {"11", "2", "Omša k preblahoslavenej Panne Marií 2.", "Blahoslavená si, Panna Mária, lebo si nosila Stvoriteľa sveta;<br>" +
                    "porodila si toho, čo ťa stvoril, a naveky ostávaš pannou.", "",
                    "Veľké veci mi urobil ten, ktorý je mocný,<br>" +
                            "a sväté je jeho meno.", "(Lk 1, 49)"},
            {"11", "3", "Omša k preblahoslavenej Panne Marií 3.", "Požehnaná si, Panna Mária, od Pána, Boha najvyššieho,<br>" +
                    "viac než všetky ženy na zemi;<br>" +
                    "natoľko preslávil tvoje meno,<br>" +
                    "že ľudia ťa nikdy neprestanú chváliť.", "(Porov. Jdt 13, 23. 25)",
                    "Blahoslaviť ma budú všetky pokolenia,<br>" +
                            "pretože Boh zhliadol na svoju poníženú služobnicu.", "(Porov. Lk 1, 48)"},
            // 4 – iba v adventnom obdobi
            {"12", "1", "Omša k preblahoslavenej Panne Marií", "Nebesia, roste z výsosti<br>" +
                    "a z oblakov nech k nám zostúpi Spravodlivý!<br>" +
                    "Otvor sa, zem, a zroď Spasiteľa! <br>" +
                    "<font color='#B71C1C'>Alebo: (Lk 1, 30-32)</font><br>" +
                    "Anjel povedal Panne Márii: Našla si milosť u Boha.<br>" +
                    "Počneš a porodíš syna a bude sa volať Synom Najvyššieho.", "(Iz 45, 8)",
                    "Hľa, panna počne a porodí syna a dá mu meno Emanuel.", "(Iz 7, 14)"},
            // 5 – iba v vianocnom obdobi
            {"13", "1", "Omša k preblahoslavenej Panne Marií", "Svätá Mária porodila Krista, večného Kráľa;<br>" +
                    "v nej sa spája panenská čistota s materskou radosťou;<br>" +
                    "je neporovnateľne veľká medzi ženami.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Svätá Panna a Matka,<br>" +
                    "Boh, ktorého nemôže obsiahnuť celý svet,<br>" +
                    "stal sa človekom v tvojom lone.", "",
                    "Slovo sa telom stalo <br>" +
                            "a prebývalo medzi nami,<br>" +
                            " plné milosti a pravdy.", "(Jn 1, 14)"},
            // 6 – iba vo velkonocnom obdobi
            {"14", "1", "Omša k preblahoslavenej Panne Marií", "Učeníci jednomyseľne zotrvávali v modlitbách<br>" +
                    "spolu s Ježišovou matkou Máriou. Aleluja.", "(Porov. Sk 1, 14)",
                    "Raduj sa, panenská Matka,<br>" +
                            "pretože tvoj Syn Ježiš Kristus vstal z mŕtvych. Aleluja.", ""},
            //marianske formulare
            {"15", "1", "Preblahoslavená Panna Mária vyvolený potomok Izraela", "Raduj sa a veseľ z plného srdca,<br>" +
                    "dcéra jeruzalemská!<br>" +
                    "Hľa, prichádza ten, po ktorom túžia všetky národy,<br>" +
                    "a Pánov dom sa naplní slávou.", "Porov. Sof. 3, 14; Ag 2, 8",
                    "Raduj sa a veseľ, šťastie patriarchov.<br>" +
                            "Raduj sa ty, čo si od anjela prijala radosť sveta.<br>" +
                            "Raduj sa ty, čo si nám priniesla chlieb života.", ""},
            {"15", "2", "Preblahoslavená Panna Mária pri Zvestovaní Pána", "Nebesia, roste z výsosti<br>" +
                    "a z oblakov nech k nám zostúpi Spravodlivý!<br>" +
                    "Otvor sa, zem, a zroď Spasiteľa!", "Porov. Iz 45, 8",
                    "Hľa, panna počne a porodí syna<br>" +
                            "a dá mu meno Emanuel.", "Iz 7, 14"},
            {"15", "3", "Navštívenie Preblahoslavenej Panny Márie", "Nech je zvelebený Pán, Boh Izraela,<br>" +
                    "lebo navštívil a vykúpil svoj ľud<br>" +
                    "a vzbudil nám mocného Spasiteľa,<br>" +
                    "ako odpradávna hovoril<br>" +
                    "ústami svojich svätých prorokov.", "Lk 1, 68",
                    "Zhliadol na poníženosť svojej služobnice.<br>" +
                            "Hľa, od tejto chvíle blahoslaviť ma budú všetky pokolenia.", "Lk 1, 48"},
            {"16", "1", "Nepoškvrneného Srdca Panny Márie", "Moje srdce sa teší z tvojej pomoci.<br>" +
                    "Spievať budem Pánovi, že ma zahŕňa dobrodeniami.", "(Ž 12, 6)",
                    "Mária všetky tieto udalosti chránila hlboko v srdci<br>" +
                            "a premýšľala o nich.", "(Lk 2, 19)"},
            // SPOLOCNE OMSE MUCENIKOV
            // omsa viacerých muceníkov mimo velkonocneho obdobia
            {"21", "1", "Omša za viacerých mučeníkov 1.", "V nebi sa radujú svätí, ktorí nasledovali Krista,<br>" +
                    "a keďže z lásky k nemu vyliali svoju krv,<br>" +
                    "s ním požívajú večné šťastie.", "",
                    "Pán Ježiš hovorí:<br>" +
                            "Vy ste so mnou vytrvali v mojich skúškach.<br>" +
                            "Ja vám pripravujem kráľovstvo, ako ho môj Otec pripravil mne,<br>" +
                            "aby ste mohli jesť a piť pri mojom stole v mojom kráľovstve.", "(Lk 22, 28-30)"},
            {"21", "2", "Omša za viacerých mučeníkov 2.", "Spravodliví majú utrpení veľa,<br>" +
                    "ale zo všetkých ich vyslobodí Pán.<br>" +
                    "On sa stará o všetkých, ktorí mu verne slúžia.", "(Porov. Ž 33, 20-21)",
                    "Pán Ježiš hovorí:<br>" +
                            "Nik nemiluje väčšmi ako ten,<br>" +
                            "kto položí život za svojich priateľov.", "(Jn 15, 13)"},
            {"21", "3", "Omša za viacerých mučeníkov 3.", "Spása spravodlivých prichádza od Pána,<br>" +
                    "on je ich ochrancom v čase súženia.", "(Ž 36, 39)",
                    "Pán Ježiš hovorí:<br>" +
                            "Kto stratí svoj život pre mňa a pre evanjelium, zachráni si ho.", "(Mk 8, 35)"},
            {"21", "4", "Omša za viacerých mučeníkov 4.", "Spravodliví volali a Pán ich vyslyšal<br>" +
                    "a vyslobodil ich zo všetkých tiesní.", "(Ž 33, 18)",
                    "Kým žijeme, sme ustavične vydávaní na smrť pre Ježiša,<br>" +
                            "aby sa Ježišov život zjavil aj na našom smrteľnom tele.", "(2 Kor 4, 11)"},
            {"21", "5", "Omša za viacerých mučeníkov 5.", "Svätí mučeníci vyliali krv pre Krista na tejto zemi,<br>" +
                    "preto dosiahli odmenu vo večnosti.", "",
                    "Ani smrť, ani život, ani nijaké stvorenie <br>" +
                            "nás nebude môcť odlúčiť od lásky ku Kristovi.", "(Porov. Rim 8, 38-39)"},
            // omsa jedneho muceníka mimo velkonocneho obdobia
            {"22", "1", "Omša za jedného mučeníka 1.", "Oslavujeme svätca, ktorý za Boží zákon<br>" +
                    "položil svoj život<br>" +
                    "a nebál sa hrozby bezbožných,<br>" +
                    "lebo mal základy na pevnej skale.", "",
                    "Pán Ježiš hovorí:<br>" +
                            "Kto chce ísť za mnou, nech zaprie sám seba,<br>" +
                            "vezme svoj kríž a nech ma nasleduje.", "(Mt 16, 24)"},
            {"22", "2", "Omša za jedného mučeníka 2.", "Oslavujeme svätého mučeníka <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorý sa nebál hrozieb sudcov,<br>" +
                    "pre Krista vylial svoju krv<br>" +
                    "a dostal sa do nebeského kráľovstva.", "",
                    "Pán Ježiš hovorí:<br>" +
                            "Ja som vinič, vy ste ratolesti.<br>" +
                            "Kto ostáva vo mne a ja v ňom, prináša veľa ovocia.", "(Jn 15, 5)"},
            // omsa viacerých muceníkov vo velkonocnom obdobi
            {"23", "1", "Omša za viacerých mučeníkov 1.", "Poďte, požehnaní môjho Otca,<br>" +
                    "zaujmite Kráľovstvo,<br>" +
                    "ktoré je pre vás pripravené od stvorenia sveta. Aleluja.", "",
                    "Kto zvíťazí, tomu dám jesť zo stromu života,<br>" +
                            "ktorý je v Božom raji. Aleluja.", "(Zjv 2, 7)"},
            {"23", "2", "Omša za viacerých mučeníkov 2.", "Oslavujeme svätých <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorí zvíťazili pre zásluhy krvi Baránkovej; <br>" +
                    "milovali Krista viac než svoj život,<br>" +
                    "preto s ním kraľujú naveky. Aleluja.", "(Porov. Zjv 12, 11)",
                    "Ak sme s Kristom zomreli, budeme s ním aj žiť.<br>" +
                            "Ak s ním vytrváme, s ním budeme aj kraľovať. Aleluja.", "(2 Tim 2, 11-12)"},
// omsa jedného muceníka vo velkonocnom obdobi
            {"24", "1", "Omša za jedného mučeníka", "Svetlo večné bude svietiť tvojim svätým, Pane,<br>" +
                    "na večné veky. Aleluja.", "(Porov. 4 Ezd 2, 35)",
                    "Ak pšeničné zrno nepadne do zeme a neodumrie, ostane samo;<br>" +
                            "ale ak odumrie, prinesie veľkú úrodu. Aleluja.", "(Jn 12, 24 - 25)"},
            // omsa o mucenikoch misionaroch
            {"25", "1", "Omša o mučeníkoch misionároch 1.", "V nebi sa radujú svätí, ktorí nasledovali Krista,<br>" +
                    "a keďže z lásky k nemu vyliali svoju krv,<br>" +
                    "s ním požívajú večné šťastie.", "",
                    "Pán Ježiš hovorí:<br>" +
                            "Vy ste so mnou vytrvali v mojich skúškach.<br>" +
                            "Ja vám pripravujem kráľovstvo, ako ho môj Otec pripravil mne,<br>" +
                            "aby ste mohli jesť a piť pri mojom stole v mojom kráľovstve.", "(Lk 22, 28-30)"},
            {"25", "2", "Omša o mučeníkoch misionároch 2.", "Spravodliví majú utrpení veľa,<br>" +
                    "ale zo všetkých ich vyslobodí Pán.<br>" +
                    "On sa stará o všetkých, ktorí mu verne slúžia.", "(Porov. Ž 33, 20-21)",
                    "Pán Ježiš hovorí:<br>" +
                            "Nik nemiluje väčšmi ako ten,<br>" +
                            "kto položí život za svojich priateľov.", "(Jn 15, 13)"},
            {"25", "3", "Omša o mučeníkoch misionároch 3.", "Spása spravodlivých prichádza od Pána,<br>" +
                    "on je ich ochrancom v čase súženia.", "(Ž 36, 39)",
                    "Pán Ježiš hovorí:<br>" +
                            "Kto stratí svoj život pre mňa a pre evanjelium, zachráni si ho.", "(Mk 8, 35)"},
            {"25", "4", "Omša o mučeníkoch misionároch 4.", "Spravodliví volali a Pán ich vyslyšal<br>" +
                    "a vyslobodil ich zo všetkých tiesní.", "(Ž 33, 18)",
                    "Kým žijeme, sme ustavične vydávaní na smrť pre Ježiša,<br>" +
                            "aby sa Ježišov život zjavil aj na našom smrteľnom tele.", "(2 Kor 4, 11)"},
            {"25", "5", "Omša o mučeníkoch misionároch 5.", "Svätí mučeníci vyliali krv pre Krista na tejto zemi,<br>" +
                    "preto dosiahli odmenu vo večnosti.", "",
                    "Ani smrť, ani život, ani nijaké stvorenie <br>" +
                            "nás nebude môcť odlúčiť od lásky ku Kristovi.", "(Porov. Rim 8, 38-39)"},
            // omsa o panne mucenici
            {"26", "1", "Omša o panne mučenici 1.", "Oslavujeme svätca, ktorý za Boží zákon<br>" +
                    "položil svoj život<br>" +
                    "a nebál sa hrozby bezbožných,<br>" +
                    "lebo mal základy na pevnej skale.", "",
                    "Pán Ježiš hovorí:<br>" +
                            "Kto chce ísť za mnou, nech zaprie sám seba,<br>" +
                            "vezme svoj kríž a nech ma nasleduje.", "(Mt 16, 24)"},
            {"26", "2", "Omša o panne mučenici 2.", "Oslavujeme svätého mučeníka <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorý sa nebál hrozieb sudcov,<br>" +
                    "pre Krista vylial svoju krv<br>" +
                    "a dostal sa do nebeského kráľovstva.", "",
                    "Pán Ježiš hovorí:<br>" +
                            "Ja som vinič, vy ste ratolesti.<br>" +
                            "Kto ostáva vo mne a ja v ňom, prináša veľa ovocia.", "(Jn 15, 5)"},
            // omsa o svatej zene mucenici
            {"27", "Omša o svätej žene mučenici 1.", "Oslavujeme svätca, ktorý za Boží zákon<br>" +
                    "položil svoj život<br>" +
                    "a nebál sa hrozby bezbožných,<br>" +
                    "lebo mal základy na pevnej skale.", "",
                    "Pán Ježiš hovorí:<br>" +
                            "Kto chce ísť za mnou, nech zaprie sám seba,<br>" +
                            "vezme svoj kríž a nech ma nasleduje.", "(Mt 16, 24)"},
            {"27", "1", "Omša o svätej žene mučenici 2.", "Oslavujeme svätého mučeníka <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorý sa nebál hrozieb sudcov,<br>" +
                    "pre Krista vylial svoju krv<br>" +
                    "a dostal sa do nebeského kráľovstva.", "",
                    "Pán Ježiš hovorí:<br>" +
                            "Ja som vinič, vy ste ratolesti.<br>" +
                            "Kto ostáva vo mne a ja v ňom, prináša veľa ovocia.", "(Jn 15, 5)"},
            // SPOLOCNE OMSE DUCHOVNYCH PASTIEROVSPOLOCNE OMSE DUCHOVNYCH PASTIEROV,
            // omsa o papezoch alebo biskupov
            {"31", "1", "Omša o pápežoch alebo biskupoch 1.", "Pán si vyvolil svätého <font color='#B71C1C'>M.</font> za veľkňaza,<br>" +
                    "otvoril mu svoje poklady<br>" +
                    "a zahrnul ho všetkými dobrami.", "",
                    "Dobrý pastier dal svoj život za svoje ovce.", "(Porov. Jn 10, 11)"},
            {"31", "2", "Omša o pápežoch alebo biskupoch 2.", "Pán uzavrel s ním zmluvu pokoja,<br>" +
                    "postavil ho na čelo svojho ľudu a dal mu kňazskú hodnosť naveky.", "(Porov. Ekl 45, 30)",
                    "Pane, ty vieš všetko, ty vieš, že ťa milujem.", "(Jn 21, 17)"},
            // omsa o biskupoch
            {"32", "1", "Omša o biskupoch 1.", "Pán hovorí:<br>" +
                    "Ja sa ujmem svojich oviec a ustanovím im pastiera,<br>" +
                    "čo ich bude vodiť na pastvu;<br>" +
                    "ale ja, Pán, budem im Bohom.", "(Ez 34, 11. 23-24)",
                    "Pán Ježiš hovorí:<br>" +
                            "Nie vy ste si vyvolili mňa,<br>" +
                            "ale ja som si vyvolil vás a ustanovil som vás,<br>" +
                            "aby ste šli a prinášali ovocie<br>" +
                            "a vaše ovocie aby zostalo.", "(Jn 15, 16)"},
            {"32", "2", "Omša o biskupoch 2.", "Pán hovorí: Povolám si verného kňaza,<br>" +
                    "ktorý bude konať podľa mojej vôle.", "(1 Sam 2, 35)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ja som prišiel, aby mali život<br>" +
                            "a mali ho v hojnosti.", "(Jn 10, 10)"},
            // omsa o duchovnych pastieroch
            {"33", "1", "Omša o duchovných pastieroch 1.", "Duch Pánov je nado mnou,<br>" +
                    "pretože ma pomazal, aby som hlásal blahozvesť chudobným<br>" +
                    "a uzdravoval skrúšených srdcom.", "(Lk 4, 18)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ja som s vami po všetky dni<br>" +
                            "až do skončenia sveta.", "(Mt 28, 20)"},
            {"33", "2", "Omša o duchovných pastieroch 2.", "Dám vám pastierov podľa môjho srdca<br>" +
                    "a budú vás múdro spravovať a poučovať.<br>" +
                    "<font color='#B71C1C'>Alebo: (Dan 3, 84. 87)</font><br>" +
                    "Dobrorečte Pánovi, všetci jeho kňazi,<br>" +
                    "svätí a pokorní srdcom, chváľte Pána.", "(Porov. Jer 3, 15)",
                    "Syn človeka neprišiel dať sa obsluhovať, ale slúžiť<br>" +
                            "a položiť svoj život ako výkupné za mnohých.", "(Mt 20, 28)"},
            {"33", "3", "Omša o duchovných pastieroch 3.", "Tvoji kňazi, Pane, nech sa odejú do spravodlivosti<br>" +
                    "a tvoji svätí nech plesajú.", "(Ž 131, 9)",
                    "Blahoslavený služobník,<br>" +
                            "ktorého Pán pri svojom príchode nájde bedliť.<br>" +
                            "Veru, hovorím vám, ustanoví ho nad celým svojím majetkom.", "(Mt 24, 46-47)"},
            // omsa o zakladateloch miestych cirkvi
            {"34", "1", "Omša o zakladateľoch miestnych cirkví 1.", "Pán hovorí: Moje slová, ktoré som ti vložil do úst,<br>" +
                    "budú vždy na tvojich perách<br>" +
                    "a tvoje dary na mojom oltári budú príjemné.", "(Porov. Iz 59, 21; 56, 7)",
                    "Syn človeka prišiel,<br>" +
                            "aby dal svoj život ako výkupné za mnohých.", "(Mk 10, 45)"},
            {"34", "2", "Omša o zakladateľoch miestnych cirkví 2.", "Oslavujeme svätých mužov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorých si Pán vyvolil v nesmiernej láske<br>" +
                    "a dal im večnú slávu;<br>" +
                    "ich náuka neprestajne žiari v Cirkvi.", "",
                    "Pán Ježiš hovorí: Už vás nenazývam sluhami,<br>" +
                            "lebo sluha nevie, čo robí jeho pán.<br>" +
                            "Nazval som vás priateľmi, pretože som vám oznámil všetko,<br>" +
                            "čo som počul od svojho Otca.", "(Jn 15, 15)"},
            // omsa o misionaroch
            {"35", "1", "Omša o misionároch 1.", "Oslavujeme svätého <font color='#B71C1C'>M.</font> a všetkých Božích priateľov,<br>" +
                    "ktorí sa preslávili hlásaním Božej pravdy.", "",
                    "Pán hovorí: Ja sám budem pásť svoje ovce,<br>" +
                            "ja im dám odpočinok.", "(Ez 34, 15)"},
            {"35", "2", "Omša o misionároch 2.", "Aké sú vítané na horách kroky posla,<br>" +
                    "ktorý hlása pokoj,<br>" +
                    "posla dobrej zvesti, ktorý ohlasuje spásu.", "(Iz 52, 7)",
                    "Pán Ježiš hovorí:<br>" +
                            "Iďte do celého sveta a ohlasujte evanjelium;<br>" +
                            "ja som s vami po všetky dni.", "(Mk 16, 15; Mt 28, 20)"},
            {"35", "3", "Omša o misionároch 3.", "Zvestujte Božiu slávu pohanom<br>" +
                    "a jeho zázraky všetkým národom,<br>" +
                    "lebo veľký je Pán a veľkej chvály hoden.", "(Ž 95, 3-4)",
                    "Pán poslal učeníkov, aby všade ohlasovali:<br>" +
                            "Priblížilo sa k vám Božie kráľovstvo.", "(Porov. Lk 10, 1. 9)"},
            // SPOLOCNE OMSE UCITELOV CIRKVI
            {"4", "1", "Omša o učiteľoch Cirkvi 1.", "Uprostred Božieho ľudu Pán mu dal prehovoriť;<br>" +
                    "naplnil ho duchom múdrosti a rozumu<br>" +
                    "a zaodel ho rúchom slávy.", "(Ekl 15, 5)",
                    "Verný a múdry služobník,<br>" +
                            "ktorého Pán ustanovil nad svojou čeľaďou,<br>" +
                            "aby jej načas rozdeľoval pokrm.", "(Lk 12, 42)"},
            {"4", "2", "Omša o učiteľoch Cirkvi 2.", "Rozumní sa budú skvieť ako jas oblohy<br>" +
                    "a ti, čo mnohých priviedli k spravodlivosti,<br>" +
                    "budú ako hviezdy na večné veky.", "(Dan 12, 3)",
                    "My ohlasujeme ukrižovaného Krista;<br>" +
                            "hlásame Krista, Božiu moc a Božiu múdrosť.", "(1 Kor 1, 23-24)"},
            // SPOLOCNE OMSE PANNIEN
            {"51", "1", "Omša o pannách 1.", "Oslavujeme dnes svätú <font color='#B71C1C'>M.</font>,<br>" +
                    "múdru a rozumnú pannu,<br>" +
                    "ktorá s horiacou lampou<br>" +
                    "vyšla v ústrety Kristovi.", "",
                    "Hľa, Ženích prichádza,<br>" +
                            "vyjdite v ústrety Kristu Pánovi.", "(Porov. Mt 25, 6)"},
            {"51", "2", "Omša o pannách 2.", "S radosťou oslavujme svätú <font color='#B71C1C'>M.</font>,<br>" +
                    "lebo Pán vesmíru si obľúbil túto svätú a slávnu pannu.", "",
                    "Päť múdrych panien si vzalo lampy, aj olej do nádob.<br>" +
                            "O polnoci sa strhol krik:<br>" +
                            "Hľa, Ženích prichádza, vyjdite v ústrety Kristu Pánovi.", "(Porov. Mt 25, 4. 6)"},
            {"51", "3", "Omša o pannách 3.", "Poď, nevesta Kristova, a prijmi veniec slávy,<br>" +
                    "ktorý ti Pán pripravil pre večnosť.", "",
                    "Svätá panna <font color='#B71C1C'>M.</font> si zvolila lepší podiel.<br>" +
                            "A ten jej nebude odňatý.", "(Porov. Lk 10, 42)"},
            // omsa o viacerych pannach
            {"52", "1", "Omša o viacerých pannách", "Panny nech chvália meno Pánovo,<br>" +
                    "lebo iba jeho meno je vznešené,<br>" +
                    "jeho veleba prevyšuje zem i nebesia.", "(Ž 148, 12-14)",
                    "Ženích prišiel, a panny, čo boli pripravené,<br>" +
                            "vošli s ním na svadbu.", "(Mt 25, 10)"},
            // SPOLOCNE OMSE SVATYCH MUZOV a SVATYCH ZIEN
            {"61", "1", "Omša o svätých mužoch a svätých ženách 1.", "Nech ťa oslavujú, Pane, všetky tvoje diela<br>" +
                    "a tvoji svätí nech ťa velebia.<br>" +
                    "Nech rozprávajú o sláve tvojho kráľovstva<br>" +
                    "a o tvojej moci nech hovoria.", "(Ž 144, 10-11)",
                    "Spravodliví nech sa tešia pred Božou tvárou<br>" +
                            "a v radosti nech sa veselia.", "(Porov. Ž 67, 4)"},
            {"61", "2", "Omša o svätých mužoch a svätých ženách 2.", "Spravodlivý sa teší v Pánovi<br>" +
                    "a spolieha sa na neho,<br>" +
                    "a jasajú všetci, čo majú srdce úprimné.", "(Ž 63, 11)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ak mi niekto chce slúžiť, nech ma nasleduje;<br>" +
                            "a kde som ja, tam bude aj môj služobník.", "(Jn 12, 26)"},
            {"61", "3", "Omša o svätých mužoch a svätých ženách 3.", "Pane, z tvojej sily sa spravodlivý raduje<br>" +
                    "a veľmi sa teší z tvojej pomoci;<br>" +
                    "vyplnil si túžbu jeho srdca.", "(Ž 20, 2-3)",
                    "Pán Ježiš hovorí:<br>" +
                            "Kto chce ísť za mnou, nech zaprie sám seba,<br>" +
                            "vezme svoj kríž a nech ma nasleduje.", "(Mt 16, 24)"},
            {"61", "4", "Omša o svätých mužoch a svätých ženách 4.", "Ústa svätého <font color='#B71C1C'>M.</font> podávali pravdivé učenie<br>" +
                    "a na jeho perách nebolo klamu;<br>" +
                    "pokojne a spravodlivo kráčal s Bohom<br>" +
                    "a mnohých odvrátil od hriechu.", "(Porov. Mal 2, 6)",
                    "Blahoslavení čistého srdca, lebo oni uvidia Boha;<br>" +
                            "blahoslavení, čo šíria pokoj,<br>" +
                            "lebo ich budú volať Božími synmi;<br>" +
                            "blahoslavení, ktorých prenasledujú pre spravodlivosť,<br>" +
                            "lebo ich je nebeské kráľovstvo.", "(Mt 5, 8-9)"},
            {"61", "5", "Omša o svätých mužoch a svätých ženách 5.", "Spravodlivý sťa palma zakvitne<br>" +
                    "a vyrastie sťa céder z Libanonu.<br>" +
                    "Tí, čo sú zasadení v dome Pánovom,<br>" +
                    "v nádvoriach nášho Boha budú prekvitať.", "(Ž 91, 13-14)",
                    "Pán Ježiš hovorí:<br>" +
                            "Poďte ku mne všetci, ktorí sa namáhate a ste unavení,<br>" +
                            "a ja vás posilním.", "(Mt 11, 28)"},
            {"61", "6", "Omša o svätých mužoch a svätých ženách 6.", "Požehnaný človek, čo dúfa v Pána,<br>" +
                    "ktorého oporou je Pán.<br>" +
                    "Je ako strom zasadený pri vode,<br>" +
                    "ktorý k potoku vystiera korene;<br>" +
                    "nestrachuje sa, keď prichádza horúčosť.", "(Jer 17, 7-8)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ako mňa miluje Otec, tak aj ja milujem vás.<br>" +
                            "Ostaňte v mojej láske.", "(Jn 15, 9)"},
            // omsa o reholnikoch
            {"62", "1", "Omša o rehoľníkoch 1.", "Ty, Pane, si môj podiel na dedičstve a na kalichu,<br>" +
                    "v tvojich rukách je môj osud.<br>" +
                    "Pripadol mi diel v kraji prekrásnom,<br>" +
                    "a je to pre mňa znamenité dedičstvo.", "(Ž 15, 5-6)",
                    "Veru, hovorím vám: Vy, čo ste opustili všetko<br>" +
                            "a nasledovali ste ma,<br>" +
                            "stonásobne viac dostanete<br>" +
                            "a dosiahnete večný život.", "(Porov. Mt 19, 27-29)"},
            {"62", "2", "Omša o rehoľníkoch 2.", "Oslavujeme svätých, ktorí dostali požehnanie od Pána<br>" +
                    "a odmenu od Boha, svojho Spasiteľa,<br>" +
                    "lebo sú z pokolenia, čo hľadá Boha.", "(Ž 23, 5-6)",
                    "Skúste a presvedčte sa, aký dobrý je Pán;<br>" +
                            "šťastný človek, čo sa utieka k nemu.", "(Ž 33, 9)"},
            // omsa o tych, co konali skutky milosrdensta
            {"63", "1", "Omša o tých, čo konali skutky milosrdenstva", "Pán Ježiš hovorí:<br>" +
                    "Poďte, požehnaní môjho Otca;<br>" +
                    "bol som chorý a navštívili ste ma.<br>" +
                    "Veru, hovorím vám, čo ste urobili jednému<br>" +
                    "z týchto mojich najmenších bratov, mne ste urobili.", "(Mt 25, 34. 36. 40)",
                    "Nik nemiluje väčšmi ako ten,<br>" +
                            "kto položí život za svojich priateľov.", "(Jn 13, 35)"},
            // omsa o vychovavateloch
            {"64", "1", "Omša o vychovávateľoch", "Pán Ježiš hovorí:<br>" +
                    "Nechajte deti prichádzať ku mne, nebráňte im,<br>" +
                    "lebo takým patrí Božie kráľovstvo.", "(Mk 10, 14)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ak sa neobrátite a nebudete ako deti,<br>" +
                            "nevojdete do nebeského kráľovstva.", "(Mt 18, 3)"},
            // omsa o svatych zenach
            {"65", "1", "Omša o svätých ženách 1.", "Bohabojná žena si zasluhuje chválu.<br>" +
                    "Jej synovia ju blahoslavia a jej muž ju vychvaľuje.", "(Porov. Prís 31, 30. 28)",
                    "Nebeské kráľovstvo sa podobá kupcovi,<br>" +
                            "ktorý hľadá vzácne perly.<br>" +
                            "Keď nájde veľmi cennú perlu,<br>" +
                            "ide, predá všetko, čo má, a kúpi ju.", "(Mt 13, 45-46)"},
            {"65", "2", "Omša o svätých ženách 2.", "Hľa, múdra žena, ktorá si usporiadala svoj dom;<br>" +
                    "ctila si Pána a čestne kráčala životom.", "(Porov. Prís 14, 1-2)",
                    "Pán Ježiš hovorí:<br>" +
                            "Každý, kto plní vôľu môjho Otca, ktorý je na nebesiach,<br>" +
                            "je môj brat, sestra i matka.", "(Mt 12, 50)"},
            {"71", "1", "Za odpustenie hriechov", "Pane, zmilúvaš sa nad všetkými<br>" +
                    "a nepohŕdaš ničím, čo si stvoril.<br>" +
                    "Zatváraš oči nad hriechmi ľudí, aby sa kajali<br>" +
                    "a šetríš ich, lebo ty si Pán, náš Boh.", "(Porov. Múd 11, 24. 25. 27)",
                    "Pán Ježiš hovorí:<br>" +
                            "Boží anjeli sa budú radovať z jedného hriešnika,<br>" +
                            "čo robí pokánie.", "(Lk 15,10)"},
            {"71", "2", "Za dar lásky", "Pán hovorí: Odstránim z vášho tela srdce kamenné<br>" +
                    "a dám vám srdce jemnocitné.<br>" +
                    "Vložím do vás svojho Ducha,<br>" +
                    "a budete mojím ľudom a ja budem vaším Bohom.", "(Porov. Ez 36, 26. 27. 28)",
                    "Teraz zostáva viera, nádej a láska, tieto tri,<br>" +
                            "no najväčšia z nich je láska.", "(1 Kor 13, 13)"},
            {"72a", "1", "Za jednotu kresťanov 1.", "Pán Ježiš hovorí: Ja som dobrý pastier,<br>" +
                    "poznám svoje ovce a moje ovce poznajú mňa,<br>" +
                    "ako mňa pozná Otec, a ja poznám Otca.<br>" +
                    "Aj svoj život položím za ovce.", "(Jn 10, 14-15)",
                            "Jeden je chlieb a jedno telo tvoríme všetci,<br>" +
                            "čo máme účasť na jednom chlebe a na jednom kalichu.",  "(Porov. 1 Kor 10, I7)"},
            {"72a", "2", "Za jednotu kresťanov 2.", "Zachráň nás, Pane, Bože náš,<br>" +
                    "a zhromaždi nás z krajín pohanských,<br>" +
                    "aby sme mohli velebiť tvoje sväté meno<br>" +
                    "a boli hrdí na to, že ťa môžeme oslavovať.", "(Ž 105, 47)",
                    "Nadovšetko zaodejte sa láskou.<br>" +
                            "Ona je dokonalým spojivom.<br>" +
                            "Vo vašich srdciach nech kraľuje pokoj Kristov.<br>" +
                            "V tom ste povolaní byť jedným telom.", "(Kol 3, 14-15)"},
            {"72a", "3", "Za jednotu kresťanov 3.", "Len jedno je telo, len jeden Duch,<br>" +
                    "ako je len jedna nádej, ku ktorej ste povolaní.<br>" +
                    "Len jeden je Pán, jedna viera, jeden krst.<br>" +
                    "Len jeden je Boh a Otec všetkých,<br>" +
                    "ktorý je nad všetkými, preniká všetko a je vo všetkých.", "(Ef 4, 4-6)",
                    "Pán Ježiš sa modlil:<br>" +
                            "Aby všetci jedno boli, ako si ty, Otče, vo mne a ja v tebe,<br>" +
                            "aby aj oni v nás jedno boli.<br>" +
                            "Ja v nich a ty vo mne, aby boli dokonale zjednotení.", "(Jn 17, 21. 23)"},
            {"72b", "4", "Za povolanie na kňazský stav", "Pán Ježiš povedal svojim učeníkom:<br>" +
                    "Proste Pána žatvy, aby poslal robotníkov na svoju žatvu.", "(Mt 9, 38)",
                    "V tom sme poznali Božiu lásku,<br>" +
                            "že Kristus svoj život položil za nás.<br>" +
                            "Aj my máme položiť život za bratov.", "(1 Jn 3, 16)"},
            {"72b", "5", "Za rehoľné povolania", "Ak chceš byť dokonalý, predaj, čo máš, a daj chudobným;<br>" +
                    "potom príď a nasleduj ma.", "(Mt 19, 21)",
                    "Veru, hovorím vám, že vy, čo ste opustili všetko<br>" +
                            "a ste ma nasledovali,<br>" +
                            "stonásobne viac dostanete a dosiahnete večný život.", "(Porov. Mt 19, 27. 28. 29)"},
            {"73", "1", "Na poďakovanie Pánu Bohu 1.", "Z hĺbky srdca spievajte Pánovi a oslavujte ho.<br>" +
                    "Ustavične vzdávajte vďaky Bohu Otcovi za všetko<br>" +
                    "v mene nášho Pána Ježiša Krista.", "(Porov. Ef 5, 19-20)",
                    "Chcem ťa, Pane, oslavovať celým srdcom,<br>" +
                            "že si vypočul slová mojich úst.<br>" +
                            "<font color='#B71C1C'>Alebo: (Ž 115, 12-13</font>)<br>" +
                            "Čím sa odvďačím Pánovi za všetko, čo mi dal?<br>" +
                            "Vezmem kalich spásy a budem vzývať meno Pánovo.", "(Ž 115, 12-13)"},
            {"73", "2", "Na poďakovanie Pánu Bohu 2.", "Z hĺbky srdca spievajte Pánovi a oslavujte ho.<br>" +
                    "Ustavične vzdávajte vďaky Bohu Otcovi za všetko<br>" +
                    "v mene nášho Pána Ježiša Krista.", "(Porov. Ef 5, 19-20)",
                    "Chcem ťa, Pane, oslavovať celým srdcom,<br>" +
                            "že si vypočul slová mojich úst.<br>" +
                            "<font color='#B71C1C'>Alebo: (Ž 115, 12-13)</font><br>" +
                            "Čím sa odvďačím Pánovi za všetko, čo mi dal?<br>" +
                            "Vezmem kalich spásy a budem vzývať meno Pánovo.", "(Ž 137, 1)"},
            {"73", "3", "Na poďakovanie za úrodu", "Zem vydala svoje plody;<br>" +
                    "nech nás požehná Boh, náš Pán.", "(Porov. Ž 66, 7-8)",
                    "Pane, plodmi svojich diel sýtiš zem.<br>" +
                            "Zo zeme vyvádzaš chlieb i víno, čo obveseľuje srdce človeka.", "(Ž 103, 13. 14. 15)"},
            {"74", "1", "Za zachovanie mieru a spravodlivosti 1.", "Pane, udeľ pokoj tým, čo dúfajú v teba.<br>" +
                    "Vypočuj prosby svojich služobníkov<br>" +
                    "a uveď nás na cestu spravodlivosti.", "(Porov. Ekl 36, 18-19)",
                    "Blahoslavení, čo šíria pokoj,<br>" +
                            "lebo ich budú volať Božími synmi.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 14, 27</font>)<br>" +
                            "Pán Ježiš hovorí: Pokoj vám zanechávam,<br>" +
                            "svoj pokoj vám dávam.", "(Mt 5, 9)"},
            {"74", "2", "Za zachovanie mieru a spravodlivosti 2.", "Pane, udeľ pokoj tým, čo dúfajú v teba.<br>" +
                    "Vypočuj prosby svojich služobníkov<br>" +
                    "a uveď nás na cestu spravodlivosti.", "(Porov. Ekl 36, 18-19)",
                    "Blahoslavení, čo šíria pokoj,<br>" +
                            "lebo ich budú volať Božími synmi.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 14, 27)</font><br>" +
                            "Pán Ježiš hovorí: Pokoj vám zanechávam,<br>" +
                            "svoj pokoj vám dávam.", "(Mt 5, 9)"},
            {"74", "3", "Za upevnenie rodín", "Cti svojho otca i svoju matku, to je prvé prikázanie s prísľubom:<br>" +
                    "aby sa ti dobre vodilo a aby si dlho žil na zemi.", "(Ef 6, 2-3)",
                    "Môže matka zabudnúť na svoje nemluvňa?<br>" +
                            "A keby ona aj zabudla, ja nezabudnem na teba,<br>" +
                            "hovorí Pán.", "(Iz 49, 15)"},
            {"75", "1", "V čase sejby 1.", "Nech je nad nami, Pane, tvoja dobrotivosť,<br>" +
                    "upevňuj dielo našich rúk.", "(Ž 89, 17)",
                    "Pán dá požehnanie, a naša zem vydá svoje plody.", "(Ž 84, 13)"},
            {"75", "2", "V čase sejby 2.", "Nech je nad nami, Pane, tvoja dobrotivosť,<br>" +
                    "upevňuj dielo našich rúk.", "(Ž 89, 17)",
                    "Pán dá požehnanie, a naša zem vydá svoje plody.", "(Ž 84, 13)"},
            {"76", "1", "Za jednotu kresťanov 1.", "Pán Ježiš hovorí: Ja som dobrý pastier,<br>" +
                    "poznám svoje ovce a moje ovce poznajú mňa,<br>" +
                    "ako mňa pozná Otec, a ja poznám Otca.<br>" +
                    "Aj svoj život položím za ovce.", "(Jn 10, 14-15)",
                    "Jeden je chlieb a jedno telo tvoríme všetci,<br>" +
                            "čo máme účasť na jednom chlebe a na jednom kalichu.", "(Porov. 1 Kor 10, 17)"},
            {"76", "2", "Za jednotu kresťanov 2.", "Zachráň nás, Pane, Bože náš,<br>" +
                    "a zhromaždi nás z krajín pohanských,<br>" +
                    "aby sme mohli velebiť tvoje sväté meno<br>" +
                    "a boli hrdí na to, že ťa môžeme oslavovať.", "( Ž 105, 47) ",
                    "Nadovšetko zaodejte sa láskou.<br>" +
                            "Ona je dokonalým spojivom.<br>" +
                            "Vo vašich srdciach nech kraľuje pokoj Kristov.<br>" +
                            "V tom ste povolaní byť jedným telom.", "(Kol 3, 14-15)"},
            {"76", "3", "Za jednotu kresťanov 3.", "Len jedno je telo, len jeden Duch,<br>" +
                    "ako je len jedna nádej, ku ktorej ste povolaní.<br>" +
                    "Len jeden je Pán, jedna viera, jeden krst.<br>" +
                    "Len jeden je Boh a Otec všetkých,<br>" +
                    "ktorý je nad všetkými, preniká všetko a je vo všetkých. ", "(Ef 4, 4-6)",
                    "Pán Ježiš sa modlil:<br>" +
                            "Aby všetci jedno boli, ako si ty, Otče, vo mne a ja v tebe,<br>" +
                            "aby aj oni v nás jedno boli.<br>" +
                            "Ja v nich a ty vo mne, aby boli dokonale zjednotení.", "(Jn 17, 21. 23)"},
    };

    String[][] modlitbaFormular = {
            {"01a", "1", "Votívna omša 1.", "Večný Bože,<br>" +
                    "ty osvecuješ srdcia veriacich<br>" +
                    "svetlom Ducha Svätého; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v tomto Duchu poznávali, čo je správne,<br>" +
                    "a vždy sa radovali z jeho útechy a posily.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "posväť tieto obetné dary <font color='#B71C1C'>—</font><br>" +
                    "a očisti naše srdcia ohňom Ducha Svätého.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Bože,<br>" +
                    "naplň nás Duchom Svätým, <font color='#B71C1C'>*</font><br>" +
                    "aby očistil naše srdcia <font color='#B71C1C'>—</font><br>" +
                    "a zúrodnil ich rosou svojej milosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"01a", "2", "Votívna omša 2.", "Prosíme ťa, Otče, <font color='#B71C1C'>*</font><br>" +
                    "nech Zástanca, Duch Svätý, ktorý vychádza z teba,<br>" +
                    "osvieti našu myseľ <font color='#B71C1C'>—</font><br>" +
                    "a nech nás privedie k plnej pravde,<br>" +
                    "ako nám to prisľúbil tvoj Syn,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Nekonečný Bože,<br>" +
                    "pred tebou nieto nijakej tajnosti,<br>" +
                    "lebo vidíš každému do srdca<br>" +
                    "a vieš o každom hnutí našej vôle; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, naplň nás Duchom Svätým<br>" +
                    "a očisti zmýšľanie nášho srdca, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ťa dokonale milovali a dôstojne oslavovali.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože, zhliadni na obetné dary,<br>" +
                    "ktoré sme ti so synovskou oddanosťou<br>" +
                    "priniesli na oltár; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, obnov nás na duchu<br>" +
                    "a daj nám veriace a ponížené srdce, <font color='#B71C1C'>—</font><br>" +
                    "aby sa ti naša obeta zapáčila.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "dobrotivo si nás nasýtil nebeským pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "naplň nám srdce radosťou Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                    "aby sviatosť, ktorú sme s vierou prijali,<br>" +
                    "bola nám zárukou večnej slávy.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"01a", "3", "Votívna omša 3.", "Bože Otče, ty posväcuješ svoju Cirkev<br>" +
                    "vo všetkých krajoch a národoch; <font color='#B71C1C'>*</font><br>" +
                    "naplň celý svet darmi Ducha Svätého <font color='#B71C1C'>—</font><br>" +
                    "a v srdciach svojich veriacich<br>" +
                    "obnovuj aj teraz veľké skutky svojej lásky,<br>" +
                    "ktoré si konal pri prvom hlásaní evanjelia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Všemohúci Bože, tvoj Duch nás vedie<br>" +
                    "a tvoja prozreteľnosť nás chráni; <font color='#B71C1C'>*</font><br>" +
                    "preukáž nám svoje milosrdenstvo<br>" +
                    "a vyslyš naše pokorné prosby, <font color='#B71C1C'>—</font><br>" +
                    "aby nás prejavy tvojej lásky<br>" +
                    "stále upevňovali vo viere v teba.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nebeský Otče,<br>" +
                    "priniesli sme obetné dary na tvoj oltár <font color='#B71C1C'>*</font><br>" +
                    "a vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "posväť ich ohňom Ducha Svätého,<br>" +
                    "ktorý zostúpil na apoštolov<br>" +
                    "a rozplamenil ich srdcia.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "vznešená sviatosť, ktorú sme prijali,<br>" +
                    "nech v nás ustavične udržiava<br>" +
                    "oheň Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                    "ktorého si zoslal na apoštolov.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"01A", "1", "Zoslanie Ducha Svätého (rok A)", "Všemohúci Bože,<br>" +
                    "tajomstvom dnešnej slávnosti<br>" +
                    "posväcuješ svoju Cirkev<br>" +
                    "vo všetkých krajinách a národoch; <font color='#B71C1C'>*</font><br>" +
                    "naplň celý svet darmi Ducha Svätého<br>" +
                    "a v srdciach svojich veriacich<br>" +
                    "obnovuj aj teraz veľké skutky svojej lásky, <font color='#B71C1C'>—</font><br>" +
                    "ktoré si konal pri prvom hlásaní evanjelia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, nebeský Otče, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nám Duch Svätý pomáhal<br>" +
                    "stále lepšie chápať tajomstvo tejto obety<br>" +
                    "a priviedol nás k plnému poznaniu pravdy <font color='#B71C1C'>—</font><br>" +
                    "podľa prisľúbenia Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov.", "Dobrotivý Otče,<br>" +
                    "ty štedro dávaš svojej Cirkvi nebeské dary; <font color='#B71C1C'>*</font><br>" +
                    "ochraňuj v nás svoju milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby dar Ducha Svätého ustavične pôsobil<br>" +
                    "v našich srdciach<br>" +
                    "a sviatostný pokrm zveľaďoval<br>" +
                    "v nás dielo večnej spásy.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"01B", "1", "Zoslanie Ducha Svätého (rok B)", "Všemohúci Bože,<br>" +
                    "tajomstvom dnešnej slávnosti<br>" +
                    "posväcuješ svoju Cirkev<br>" +
                    "vo všetkých krajinách a národoch; <font color='#B71C1C'>*</font><br>" +
                    "naplň celý svet darmi Ducha Svätého<br>" +
                    "a v srdciach svojich veriacich<br>" +
                    "obnovuj aj teraz veľké skutky svojej lásky, <font color='#B71C1C'>—</font><br>" +
                    "ktoré si konal pri prvom hlásaní evanjelia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, nebeský Otče, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nám Duch Svätý pomáhal<br>" +
                    "stále lepšie chápať tajomstvo tejto obety<br>" +
                    "a priviedol nás k plnému poznaniu pravdy <font color='#B71C1C'>—</font><br>" +
                    "podľa prisľúbenia Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov.", "Dobrotivý Otče,<br>" +
                    "ty štedro dávaš svojej Cirkvi nebeské dary; <font color='#B71C1C'>*</font><br>" +
                    "ochraňuj v nás svoju milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby dar Ducha Svätého ustavične pôsobil<br>" +
                    "v našich srdciach<br>" +
                    "a sviatostný pokrm zveľaďoval<br>" +
                    "v nás dielo večnej spásy.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"01C", "1", "Zoslanie Ducha Svätého (rok C)", "Všemohúci Bože,<br>" +
                    "tajomstvom dnešnej slávnosti<br>" +
                    "posväcuješ svoju Cirkev<br>" +
                    "vo všetkých krajinách a národoch; <font color='#B71C1C'>*</font><br>" +
                    "naplň celý svet darmi Ducha Svätého<br>" +
                    "a v srdciach svojich veriacich<br>" +
                    "obnovuj aj teraz veľké skutky svojej lásky, <font color='#B71C1C'>—</font><br>" +
                    "ktoré si konal pri prvom hlásaní evanjelia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, nebeský Otče, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nám Duch Svätý pomáhal<br>" +
                    "stále lepšie chápať tajomstvo tejto obety<br>" +
                    "a priviedol nás k plnému poznaniu pravdy <font color='#B71C1C'>—</font><br>" +
                    "podľa prisľúbenia Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov.", "Dobrotivý Otče,<br>" +
                    "ty štedro dávaš svojej Cirkvi nebeské dary; <font color='#B71C1C'>*</font><br>" +
                    "ochraňuj v nás svoju milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby dar Ducha Svätého ustavične pôsobil<br>" +
                    "v našich srdciach<br>" +
                    "a sviatostný pokrm zveľaďoval<br>" +
                    "v nás dielo večnej spásy.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"02", "1", "Najsvätejšieho Srdca Ježišovho", "Všemohúci Bože,<br>" +
                    "oslavujeme Srdce tvojho milovaného Syna<br>" +
                    "a pripomíname si veľké dobrodenia<br>" +
                    "jeho lásky k nám; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme z tohto prameňa milosti<br>" +
                    "čerpali prehojné nebeské dary.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Milosrdný Bože,<br>" +
                    "ty nám otváraš nekonečné poklady lásky<br>" +
                    "v Srdci svojho Syna,<br>" +
                    "ktoré bolo ranené našimi hriechmi ; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme mu slúžili s oddanou láskou,<br>" +
                    "a tak prinášali povinné zadosťučinenie za svoje viny.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Najláskavejší Otče, <font color='#B71C1C'>*</font><br>" +
                    "hľaď na Srdce svojho milovaného Syna,<br>" +
                    "prekypujúce nevýslovnou láskou, <font color='#B71C1C'>—</font><br>" +
                    "a prijmi obetu, ktorú ti prinášame<br>" +
                    "na zmierenie za naše hriechy.<br>" +
                    "Skrze Krista, nášho Pána.", "Milovaný Otče,<br>" +
                    "prijali sme sviatosť, ktorá je darom tvojej lásky; <font color='#B71C1C'>*</font><br>" +
                    "roznecuj v nás lásku k tvojmu Synovi, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ho vytrvalo nasledovali<br>" +
                    "a vedeli ho spoznať aj v našich bratoch.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"03", "1", "Votívna omša o Najsvätejšom Srdci Ježišovom", "Bože, láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám osvojiť si čnosti presvätého Srdca tvojho Syna<br>" +
                    "a zapáľ v nás oheň jeho lásky, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa stali podobnými jemu<br>" +
                    "a dosiahli účasť na večnej sláve vykúpených.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Otče,<br>"+
                    "ty si nás tak nesmierne miloval,<br>"+
                    "že si nám poslal svojho jednorodeného Syna; <font color='#B71C1C'>*</font><br>"+
                    "dopraj, prosíme, <font color='#B71C1C'>—</font><br>"+
                    "aby sme ti zjednotení s ním prinášali dôstojnú obetu.<br>"+
                    "Skrze Krista, nášho Pána.", "Milostivý Otče,<br>" +
                    "vo svojej nevýslovnej dobrote<br>" +
                    "dal si nám účasť na sviatosti tvojej lásky; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa na zemi stali podobnými Kristovi<br>" +
                    "a v nebi mali podiel na jeho sláve.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"04", "1", "Výročie posviacky chrámu (slávenie mimo chrámu)", "Vznešený Bože,<br>" +
                    "pripravuješ si z nás ako<br>" +
                    "zo živých a vybraných kameňov<br>" +
                    "duchovný chrám; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, zošli svojej Cirkvi Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                    "aby neprestajne pôsobil v tvojich veriacich<br>" +
                    "a budoval z nich nebeský Jeruzalem.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Všemohúci Bože,<br>" +
                    "ty povolávaš veriacich,<br>" +
                    "aby tvorili Cirkev, chrám Ducha Svätého; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby ľud zhromaždený v tvojom mene<br>" +
                    "tebe sa klaňal, teba miloval a nasledoval <font color='#B71C1C'>—</font><br>" +
                    "a pod tvojou ochranou dosiahol<br>" +
                    "prisľúbenú nebeskú blaženosť. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "prijmi naše obetné dary a dopraj, <font color='#B71C1C'>*</font><br>" +
                    "aby sme v tvojom svätom chráme<br>" +
                    "s úžitkom prijímali sviatosti <font color='#B71C1C'>—</font><br>" +
                    "a dosiahli milosti, o ktoré ťa prosíme.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože, ty si zo svojej Cirkvi na zemi urobil<br>" +
                    "obraz nebeského Jeruzalema; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "pôsobením sviatosti, ktorú sme prijali,<br>" +
                    "utváraj z nás živý chrám svojej milosti,<br>" +
                    "aby sme mohli vojsť do tvojej slávy.<br>" +
                    "Skrze Krista, nášho Pána."},

            // SPOLOCNE OMSE PREBLAHOSLAVENEJ PANNY MÁRIE
            {"11", "1", "Omša k preblahoslavenej Panne Marií 1.", "Pane a Bože náš,<br>" +
                    "daj nám tešiť sa stálemu zdraviu tela i duše <font color='#B71C1C'>*</font><br>" +
                    "a na mocný príhovor preblahoslavenej Panny Márie<br>" +
                    "ochraňuj nás v ťažkostiach tohto života <font color='#B71C1C'>—</font><br>" +
                    "a priveď nás do večnej radosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Prosíme ťa, milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "odpusť nám naše viny, <font color='#B71C1C'>—</font><br>" +
                    "a keďže sa nemôžeme spoliehať na vlastné zásluhy,<br>" +
                    "zachráň nás na orodovanie<br>" +
                    "Rodičky tvojho Syna<br>" +
                    "a nášho Pána Ježiša Krista,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Otče,<br>" +
                    "nech nám vždy pomáha tvoj láskavý Syn,<br>" +
                    "ktorý pri svojom narodení<br>" +
                    "neporušil panenstvo svojej matky, ale ho posvätil; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby posvätil aj nás,<br>" +
                    "aby nás uchránil od hriechov<br>" +
                    "a urobil ti príjemnou túto našu obetu.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.", "Najsvätejší Bože,<br>" +
                    "na sviatok Panny Márie<br>" +
                    "<font color='#B71C1C'>(</font>pri spomienke na Pannu Máriu<font color='#B71C1C'>)</font><br>" +
                    "s úprimnou radosťou sme prijali sviatostný pokrm;*<br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme nasledovali jej žiarivý príklad<br>" +
                    "a horlivo spolupracovali na diele nášho vykúpenia.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"11", "2", "Omša k preblahoslavenej Panne Marií 2.", "Milosrdný Otče,<br>" +
                    "nábožne slávime pamiatku<br>" +
                    "panenskej matky tvojho Syna<br>" +
                    "a prosíme ťa, <font color='#B71C1C'>*</font><br>" +
                    "poskytni nám slabým pomoc, <font color='#B71C1C'>—</font><br>" +
                    "aby sme na jej orodovanie<br>" +
                    "mohli povstať z hriechu k novému životu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Veľký a svätý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nám pomáha na životnej púti<br>" +
                    "mocné orodovanie slávnej Panny Márie, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pod jej ochranou<br>" +
                    "boli oslobodení od každého nebezpečenstva<br>" +
                    "a radovali sa z tvojho pokoja.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože, uctievame si pamiatku<br>" +
                    "panenskej matky tvojho Syna <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa o milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby svätá omša, ktorú slávime,<br>" +
                    "urobila z nás ustavičnú obetu pre teba.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "s pokornou vierou sme prijali sviatosť večnej spásy<br>" +
                    "v deň spomienky na matku tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ťa podľa príkladu Panny Márie<br>" +
                    "zvelebovali za milosti, ktoré nám dávaš,<br>" +
                    "a stále sa zdokonaľovali v kresťanskom živote.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"11", "3", "Omša k preblahoslavenej Panne Marií 3.", "Dobrotivý Bože,<br>" +
                    "dnes si s úctou spomíname na najsvätejšiu Pannu,<br>" +
                    "ktorú si zahrnul darmi svojej milosti; <font color='#B71C1C'>*</font><br>" +
                    "na jej orodovanie udeľ aj nám<br>" +
                    "z bohatstva svojej dobroty, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti cez celý život slúžili<br>" +
                    "s oddaným srdcom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Pane Ježišu,<br>" +
                    "ty si si vyvolil nepoškvrnenú Pannu Máriu;<br>" +
                    "za svoj príbytok <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "dožič nám s radosťou sláviť jej pamiatku<br>" +
                    "a na jej príhovor naplň náš každodenný život<br>" +
                    "svojou prítomnosťou.<br>" +
                    "Lebo ty si Boh a žiješ a kraľuješ s Bohom Otcom<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "s radosťou oslavujeme rodičku tvojho Syna<br>" +
                    "a prinášame ti obetu chvály; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sviatosť, na ktorú sa premenia naše dary,<br>" +
                    "rozmnožila v nás účinky vykúpenia.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "pri radostnej spomienke na Pannu Máriu<br>" +
                    "obživil si nás nebeským pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme mali účasť na večnej hostine<br>" +
                    "v spoločenstve so všetkými svätými.<br>" +
                    "Skrze Krista, nášho Pána."},
            // 4 – iba v adventnom obdobi
            {"12", "1", "Omša k preblahoslavenej Panne Marií", "Všemohúci Bože,<br>" +
                    "od večnosti si rozhodol, aby tvoj Syn<br>" +
                    "pri anjelovom zvestovaní prijal telo<br>" +
                    "z lona pre blahoslavenej Panny Márie; <font color='#B71C1C'>*</font><br>" +
                    "vyznávame, že ona je skutočne Božou Rodičkou,<br>" +
                    "a pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "dopraj nám čnostne žiť pod jej materskou ochranou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "tvoj Duch Svätý,<br>" +
                    "ktorý svojou mocou zatônil Pannu Máriu,<br>" +
                    "aby sa stala matkou tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "nech posvätí obetné dary, pripravené na tvojom oltári.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, sviatosť, ktorú sme prijali,<br>" +
                    "nech je nám stálym dôkazom<br>" +
                    "tvojej milosrdnej lásky; <font color='#B71C1C'>*</font><br>" +
                    "a keď s úprimným srdcom uctievame<br>" +
                    "panenskú matku tvojho Syna,<br>" +
                    "prosíme ťa o milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby nás jeho vtelenie priviedlo k spáse.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            // 5 – iba v vianocnom obdobi
            {"13", "1", "Všemohúci Bože,<br>" +
                    "ty si preblahoslavenú Pannu Máriu vyvolil<br>" +
                    "za matku Spasiteľa ľudského pokolenia; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme v nej mali mocnú orodovnicu,<br>" +
                    "veď skrze ňu sme prijali pôvodcu života,<br>" +
                    "tvojho Syna Ježiša Krista,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože,<br>" +
                    "prijmi dary, ktoré ti prinášame, <font color='#B71C1C'>*</font><br>" +
                    "a osvieť naše srdcia svetlom Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa príkladu Panny Márie<br>" +
                    "ochotne prijímali a v srdci zachovávali<br>" +
                    "každé slovo, čo pochádza od teba.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "pri dnešnej spomienke na Pannu Máriu<br>" +
                    "posilnil si nás telom a krvou<br>" +
                    "tvojho vteleného Slova; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme touto vznešenou sviatosťou<br>" +
                    "mali stále účasť na božskom živote tvojho Syna,<br>" +
                    "ktorý žije a kraľuje na veky vekov."},
            // 6 – iba v velkonocnom obdobi
            {"14", "1", "Omša k preblahoslavenej Panne Marií", "Bože,<br>" +
                    "ty si zmŕtvychvstaním tvojho Syna,<br>" +
                    "nášho Pána Ježiša Krista potešil celý svet; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme na príhovor jeho Rodičky Panny Márie<br>" +
                    "dosiahli radosti večného života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Dobrotivý Bože,<br>" +
                    "ty si zoslal Ducha Svätého apoštolom,<br>" +
                    "ktorí zotrvávali v modlitbách<br>" +
                    "s Ježišovou matkou Máriou; <font color='#B71C1C'>*</font><br>" +
                    "na jej orodovanie nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa horlivo venovali tvojej službe<br>" +
                    "a slovom i príkladom šírili slávu tvojho mena.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš,<br>" +
                    "prijmi dary, ktoré ti prinášame<br>" +
                    "pri oslave pre blahoslavenej Panny Márie; <font color='#B71C1C'>*</font><br>" +
                    "nech nám stále pomáha tvoj Syn,<br>" +
                    "ktorý sa stal človekom <font color='#B71C1C'>—</font><br>" +
                    "a obetoval sa ti na kríži ako obeť bez poškvrny.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.", "Prosíme ťa, dobrotivý Bože,<br>" +
                    "nech účasť na eucharistickej slávnosti<br>" +
                    "posilňuje v nás vieru v Ježiša Krista,<br>" +
                    "ktorý sa narodil z Panny Márie, <font color='#B71C1C'>*</font><br>" +
                    "aby sme vždy vyznávali,<br>" +
                    "že on je pravý Boh a pravý človek <font color='#B71C1C'>—</font><br>" +
                    "a aby sme mocou jeho zmŕtvychvstania<br>" +
                    "dosiahli večnú radosť.<br>" +
                    "Skrze Krista, nášho Pána."},
            //marianske formulare
            {"15", "1", "Preblahoslavená Panna Mária vyvolený potomok Izraela", "Vznešený Bože,<br>" +
                    "ty si preblahoslavenú Pannu Máriu,<br>" +
                    "ktorá vynikala medzi poníženými a chudobnými,<br>" +
                    "vyvolil za Matku Spasiteľa; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, nech ti podľa jej príkladu<br>" +
                    "osvedčujeme poslušnosť úprimnej viery<br>" +
                    "a do teda vkladáme všetku nádej na spásu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje v jednote<br>" +
                    "s Duchom Svätým po všetky veky vekov.<br>" +
                    "Alebo:<br>" +
                    "Dobrotivý Bože <font color='#B71C1C'>*</font><br>" +
                    "ty si si vyvolil vznešenú dcéru Siona,<br>" +
                    "blahoslavenú Pannu Máriu,<br>" +
                    "a tak si splnil sľuby dané otcom; <font color='#B71C1C'>—</font><br>" +
                    "daj, nech si berieme príklad z tej,<br>" +
                    "ktorá sa tebe zapáčila poníženosťou<br>" +
                    "a nám pomohla svojou poslušnosťou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje v jednote<br>" +
                    "s Duchom Svätým po všetky veky vekov.", "Prijmi, Bože, tieto obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a svojou mocou ich premeň na sviatosť spásy, <font color='#B71C1C'>—</font><br>" +
                    "v ktorej sa už neprinášajú predobrazné obety Otcov,<br>" +
                    "ktoré prestali,<br>" +
                    "ale obetuje sa v nej pravý Baránok, Ježiš Kristus, tvoj Syn,<br>" +
                    "nevýslovne narodený z nedotknutej Panny.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.", "Bože, prijali sme sviatosť života a vyznávame,<br>" +
                    "že si v Kristovi, narodenom z panenskej matky,<br>" +
                    "splnil sľuby dané Otcom; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme pri jeho druhom príchode<br>" +
                    "s radosťou dosiahli dary,<br>" +
                    "ktorých splnenie ešte očakávame.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"15", "2", "Preblahoslavená Panna Mária pri Zvestovaní Pána", "Všemohúci Bože,<br>" +
                    "od večnosti si rozhodol, aby tvoj Syn<br>" +
                    "pri anjelovom zvestovaní prijal telo<br>" +
                    "z lona preblahoslavenej Panny Márie; <font color='#B71C1C'>*</font><br>" +
                    "vyznávame, že ona je skutočne Božou Rodičkou,<br>" +
                    "a pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "dopraj nám čnostne žiť pod jej materskou ochranou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje v jednote<br>" +
                    "s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "tvoj Duch Svätý,<br>" +
                    "ktorý svojou mocou zatônil Pannu Máriu,<br>" +
                    "aby sa stala matkou tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "nech posvätí obetné dary,<br>" +
                    "pripravené na tvojom oltári.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, sviatosť ktorú sme prijali,<br>" +
                    "nech je nám stálym dôkazom tvojej milosrdnej lásky; <font color='#B71C1C'>*</font><br>" +
                    "a keď s úprimným srdcom uctievame<br>" +
                    "panenskú matku tvojho Syna <font color='#B71C1C'>—</font><br>" +
                    "prosíme ťa o milosť,<br>" +
                    "aby nás jeho vtelenie priviedlo k spáse.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"15", "3", "Navštívenie Preblahoslavenej Panny Márie", "Milosrdný Bože, Spasiteľ ľudstva,<br>" +
                    "ty si skrze preblahoslavenú Pannu Máriu,<br>" +
                    "archu novej zmluvy,<br>" +
                    "prinieslo do Alžbetinho domu spásu a radosť; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ochotne poslúchali vnuknutia Ducha Svätého,<br>" +
                    "a tak vedeli prinášať svojim blížnym Krista<br>" +
                    "a velebiť ťa chválospevmi i svätosťou života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje v jednote<br>" +
                    "s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech tieto naše dary posvätí ten Duch Svätý, <font color='#B71C1C'>—</font><br>" +
                    "ktorý z Panny Márie urobil nové stvorenie<br>" +
                    "a pokropil ju nebeskou rosou,<br>" +
                    "aby z nej vzišlo ovocie spásy,<br>" +
                    "tvoj Syn, Ježiš Kristus.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "nech sa tvoja Cirkev, vystrojená Božími tajomstvami<br>" +
                    "a naplnená Duchom Svätým,<br>" +
                    "s radosťou ponáhľa ku všetkým národom, <font color='#B71C1C'>—</font><br>" +
                    "aby počuli jej zvesť o spáse,<br>" +
                    "tešili sa z vykúpenia<br>" +
                    "a tvojho Syna Ježiša Krista uznali za Spasiteľa<br>" +
                    "všetkých ľudí.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"16", "1", "Nepoškvrneného Srdca Panny Márie", "Svätý Bože,<br>" +
                    "ty si pripravil v srdci<br>" +
                    "preblahoslavenej Panny Márie<br>" +
                    "dôstojný príbytok Duchu Svätému; <font color='#B71C1C'>*</font><br>" +
                    "na orodovanie nepoškvrnenej Panny<br>" +
                    "naplň aj naše srdcia svojou milosťou, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli tvojím svätým chrámom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi modlitby a obetné dary,<br>" +
                    "ktoré ti predkladáme pri spomienke<br>" +
                    "na Božiu Rodičku Máriu, <font color='#B71C1C'>—</font><br>" +
                    "a pre túto svätú obetu<br>" +
                    "zahrň nás svojím milosrdenstvom.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "s pokornou vierou sme prijali sviatosť večnej spásy;<font color='#B71C1C'>*</font><br>" +
                    "pomôž nám, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa príkladu Panny Márie<br>" +
                    "ochotne prijímali milosti, ktoré nám dávaš,<br>" +
                    "a stále sa zdokonaľovali v kresťanskom živote.<br>" +
                    "Skrze Krista, nášho Pána."},
            // SPOLOCNE OMSE MUCENIKOV
            // omsa viacerých muceníkov mimo velkonocneho obdobia
            {"21", "1", "Omša za viacerých mučeníkov 1.", "Všemohúci Bože,<br>" +
                    "dnes si s úctou pripomíname<br>" +
                    "víťaznú smrť svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "vyslyš naše modlitby a daj nám silu,<br>" +
                    "aby sme nasledovali ich vytrvalosť vo viere.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Najsvätejší Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi dary, ktoré ti prinášame<br>" +
                    "pri spomienke na svätých mučeníkov,<br>" +
                    "a pomáhaj aj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme neochvejne vyznávali tvoje sväté meno.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože a Otče náš,<br>" +
                    "ty si na svätých mučeníkoch <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "obdivuhodne ukázal tajomnú moc kríža; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám z tejto obety čerpať silu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme zostali pevne spojení s Kristom<br>" +
                    "a v Cirkvi pracovali na spáse všetkých ľudí.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"21", "2", "Omša za viacerých mučeníkov 2.", "Všemohúci a večný Bože,<br>" +
                    "svätým mučeníkom <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> si dal milosť,<br>" +
                    "že mohli trpieť pre Krista; <font color='#B71C1C'>*</font><br>" +
                    "ako im si dal odvahu podstúpiť smrť za teba,<br>" +
                    "tak aj nám slabým láskavo pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ťa neohrozene vyznávali svojím životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "na sviatok tvojich svätých mučeníkov<br>" +
                    "prijmi túto zmiernu obetu <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás očistila od hriechov<br>" +
                    "a urobila ti milými naše prosby.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "posilnil si nás nebeským chlebom<br>" +
                    "a v Kristovi si nás urobil jedným telom; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme sa podľa príkladu<br>" +
                    "svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "nikdy neodlúčili od tvojho Syna <font color='#B71C1C'>—</font><br>" +
                    "a z lásky k nemu premáhali všetky ťažkosti,<br>" +
                    "pretože nás nesmierne miloval.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"21", "3", "Omša za viacerých mučeníkov 3.", "Všemohúci Bože,<br>" +
                    "dávaš nám svätú radosť<br>" +
                    "z víťazstva tvojich mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "nech nás ich príklad posilňuje vo viere a v čnostiach<br>" +
                    "a ich mocné orodovanie nech nám dodáva odvahy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Všemohúci Bože, vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "nech nám orodovanie svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "získa tvoj u priazeň <font color='#B71C1C'>—</font><br>" +
                    "a vyprosí odvahu vyznávať vieru v teba.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "prijmi dary, ktoré ti tvoj ľud prináša<br>" +
                    "na pamiatku svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby Eucharistia,<br>" +
                    "ktorá bola pre nich zdrojom odvahy<br>" +
                    "v prenasledovaní, <font color='#B71C1C'>—</font><br>" +
                    "aj nám dodávala sily v protivenstvách.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "v deň spomienky na svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "uštedril si nám pri tejto obete<br>" +
                    "dary svojej milosti; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby v nás Oltárna sviatosť<br>" +
                    "upevnila vernosť k tebe<br>" +
                    "a priniesla nám pokoj a spásu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"21", "4", "Omša za viacerých mučeníkov 4.", "Láskavý Bože,<br>" +
                    "napĺňaš nás radosťou z oslavy víťaznej smrti<br>" +
                    "svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme nasledovali ich odvahu<br>" +
                    "v utrpení pre tvoje meno.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "ty si dal svätým <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> milosť<br>" +
                    "dosiahnuť víťaznú korunu mučeníkov;<br>" +
                    "na ich príhovor a pre ich zásluhy<br>" +
                    "odpusť nám hriechy<br>" +
                    "a pomôž nám čeliť všetkým protivenstvám.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, prinášame ti obetné dary<br>" +
                    "v deň spomienky na svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorým si pre ich hrdinskú vieru<br>" +
                    "dal svetlo večnej slávy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "odpusť nám hriechy a daruj nám svoj pokoj.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "vznešenou sviatosťou, ktorú sme prijali<br>" +
                    "pri oslave svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>,<br>" +
                    "rozmnožuj v nás svoju milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa z ich hrdinského zápasu<br>" +
                    "naučili trpezlivosti v protivenstvách<br>" +
                    "a dosiahli veniec víťazstva.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"21", "5", "Omša za viacerých mučeníkov 5.", "Milosrdný Bože,<br>" +
                    "tvoji svätí mučeníci <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "položili život za vieru v teba,<br>" +
                    "a tak dosiahli nehynúcu slávu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, rozmnož aj v nás vieru<br>" +
                    "a pomáhaj nám podľa nej žiť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ustavične rástli v láske k tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na tieto obetné dary<br>" +
                    "a pomôž nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa príkladu svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "nábožne prežívali tajomstvo umučenia tvojho Syna,<br>" +
                    "ktoré slávime touto svätou obetou.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "táto svätá obeta<br>" +
                    "v deň spomienky na svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "nech ustavične rozplameňuje naše srdcia<br>" +
                    "ohňom tvojej lásky, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dosiahli odmenu prisľúbenú tým,<br>" +
                    "čo ti zostanú verní až do konca.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "pri oslave svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "posilnil si nás predrahým telom<br>" +
                    "a krvou svojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme o vytrvalú lásku k tebe, <font color='#B71C1C'>—</font><br>" +
                    "aby sme žili v tvojej milosti<br>" +
                    "a odhodlane kráčali k tebe.<br>" +
                    "Skrze Krista, nášho Pána."},
            // omsa jedneho muceníka mimo velkonocneho obdobia
            {"22", "1", "Omša za jedného mučeníka 1.", "Všemohúci a milosrdný Bože,<br>" +
                    "oslavujeme víťaznú smrť svätého mučeníka <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorému si dal silu pretrpieť všetky muky; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my víťazne čelili všetkým<br>" +
                    "útokom nepriateľa.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "posväť tieto dary svojím mocným požehnaním<br>" +
                    "a zapáľ v nás oheň svojej lásky, <font color='#B71C1C'>—</font><br>" +
                    "ktorou svätý <font color='#B71C1C'>M.</font> prekonal všetky telesné muky<br>" +
                    "a získal veniec víťazstva.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi dary, ktoré ti prinášame<br>" +
                    "v deň spomienky na svätého mučeníka <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "aby ti boli také milé,<br>" +
                    "ako ti bola vzácna obeta jeho života.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože, prosíme ťa, <font color='#B71C1C'>*</font><br>" +
                    "nech nám toto sväté prijímanie<br>" +
                    "dá duchovnú silu, <font color='#B71C1C'>—</font><br>" +
                    "ktorá svätého mučeníka <font color='#B71C1C'>M.</font><br>" +
                    "urobila verným v tvojej službe<br>" +
                    "a víťazom v utrpení.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"22", "2", "Omša za jedného mučeníka 2.", "Všemohúci a večný Bože,<br>" +
                    "svätému <font color='#B71C1C'>M.</font> si dal milosť,<br>" +
                    "že za vieru a pravdu bojoval až na smrť; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme z lásky k tebe znášali všetky protivenstvá<br>" +
                    "a zo všetkých síl ponáhľali sa k tebe,<br>" +
                    "jedinému zdroju života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "zošli svoje požehnanie na tieto dary<br>" +
                    "a upevni nás vo viere, <font color='#B71C1C'>—</font><br>" +
                    "ktorú svätý <font color='#B71C1C'>M.</font> dosvedčil vyliatím svojej krvi.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože a Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "prinášame ti tieto obetné dary<br>" +
                    "pri spomienke na svätého mučeníka <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorého ani prenasledovanie ani smrť<br>" +
                    "neodlúčili od jednoty Kristovho tajomného tela; <font color='#B71C1C'>—</font><br>" +
                    "prosíme ťa, zachovaj aj nás v tejto jednote.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "posilnil si nás sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám<br>" +
                    "nasledovať obdivuhodnú vytrvalosť svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si zaslúžili večnú odmenu,<br>" +
                    "pripravenú tým, čo vytrvajú v dobrom až do konca.<br>" +
                    "Skrze Krista, nášho Pána."},
            // omsa viacerých muceníkov vo velkonocnom obdobi
            {"23", "1", "Omša za viacerých mučeníkov 1.", "Všemohúci Bože,<br>" +
                    "svätým mučeníkom <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> si dal milosť,<br>" +
                    "že za tvoje slovo a za vernosť Ježišovi<br>" +
                    "položili život; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj nám silu Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my ochotne prijímali pravdy viery<br>" +
                    "a smelo ich vyznávali.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Nekonečný Bože, ty dávaš svojim verným<br>" +
                    "stálosť vo viere a silu v slabosti; <font color='#B71C1C'>*</font><br>" +
                    "na príhovor mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> dopraj aj nám účasť<br>" +
                    "na smrti a zmŕtvychvstaní tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v spoločenstve s nimi<br>" +
                    "dosiahli dokonalú radosť u teba.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "v deň víťaznej smrti tvojich svätých mučeníkov<br>" +
                    "slávime pamiatku obety tvojho Syna<br>" +
                    "a vyznávame, <font color='#B71C1C'>—</font><br>" +
                    "že každé mučeníctvo má pôvod a silu<br>" +
                    "v tejto jedinej obete Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov.", "Dobrotivý Otče,<br>" +
                    "touto Eucharistiou sme oslávili<br>" +
                    "víťazstvo svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj duchovne zvíťaziť všetkým,<br>" +
                    "čo sa posilňujú chlebom života na pozemskej púti, <font color='#B71C1C'>—</font><br>" +
                    "aby boli hodni<br>" +
                    "jesť zo stromu života v nebeskej vlasti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"23", "2", "Omša za viacerých mučeníkov 2.", "Večný Bože,<br>" +
                    "oslavujeme svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorým si dal silu,<br>" +
                    "aby slovom a vlastnou krvou neohrozene ohlasovali<br>" +
                    "smrť a zmŕtvychvstanie tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, naplň nás radosťou z ich víťazstva <font color='#B71C1C'>—</font><br>" +
                    "a posilni v nás nádej na slávne vzkriesenie.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "zhliadni na tieto dary s otcovskou dobrotou<br>" +
                    "a posväť ich Duchom Svätým, <font color='#B71C1C'>—</font><br>" +
                    "aby v našich srdciach vzbudili takú lásku,<br>" +
                    "s akou <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> prekonali všetky útrapy mučeníctva.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "v deň spomienky na svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "jedli sme z toho istého Chleba; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "posilňuj v nás lásku k tebe<br>" +
                    "a ku všetkým ľuďom<br>" +
                    "a daj nám milosť žiť novým životom.<br>" +
                    "Skrze Krista, nášho Pána."},
            // omsa jedneho muceníka vo velkonocnom obdobi
            {"24", "1", "Omša za jedného mučeníka", "Všemohúci Bože,<br>" +
                    "na slávu svojej Cirkvi<br>" +
                    "si ozdobil svätého <font color='#B71C1C'>M.</font> mučeníckou korunou; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme podľa jeho príkladu<br>" +
                    "nasledovali trpiaceho Spasiteľa,<br>" +
                    "a tak si zaslúžili vojsť do večnej radosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "pri dnešnej spomienke na svätého mučeníka <font color='#B71C1C'>M.</font><br>" +
                    "prijmi túto obetu zmierenia a chvály, <font color='#B71C1C'>—</font><br>" +
                    "aby nám získala odpustenie<br>" +
                    "a zaslúžila milosť ustavične ti vzdávať vďaky.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože, na sviatok svätého mučeníka <font color='#B71C1C'>M.</font><br>" +
                    "slávením Eucharistie<br>" +
                    "sme zvestovali smrť tvojho Syna<br>" +
                    "a s radosťou sme prijali tvoje nebeské dary; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme so svätými mučeníkmi mali aj účasť<br>" +
                    "na jeho zmŕtvychvstaní a sláve.<br>" +
                    "Skrze Krista, nášho Pána."},
            // omsa o mucenikoch misionaroch
            {"25", "1", "Omša o mučeníkoch misionároch", "Všemohúci a milosrdný Bože,<br>" +
                    "kázaním a hrdinským svedectvom<br>" +
                    "svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "priviedol si národy<br>" +
                    "k poznaniu tvojho milovaného Syna; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "na ich orodovanie daj týmto národom<br>" +
                    "vytrvalosť vo viere.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš,<br>" +
                    "pri dnešnej spomienke na víťaznú smrť<br>" +
                    "tvojich svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "aby sme touto obetou<br>" +
                    "dôstojne zvestovali smrť tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "ktorý mučeníkov povzbudzuje svojim slovom<br>" +
                    "a posilňuje vlastným príkladom.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.", "Všemohúci Bože,<br>" +
                    "posilnil si nás eucharistickým chlebom; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme podľa príkladu<br>" +
                    "svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> ustavične pamätali<br>" +
                    "na lásku a umučenie tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli blažený pokoj v nebeskej vlasti.<br>" +
                    "Skrze Krista, nášho Pána."},
            // omsa o panne mucenici
            {"26", "1", "Omša o panne mučenici 1.", "Dobrotivý Bože,<br>" +
                    "v dnešný deň nám poskytuješ radosť<br>" +
                    "z výročnej spomienky na svätú <font color='#B71C1C'>M.</font><br>" +
                    "a kladieš nám za vzor jej panenskú čistotu<br>" +
                    "a mučenícku odvahu; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, na jej orodovanie daj nám silu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme odhodlane niesli svoj každodenný kríž.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "pri oslave svätej panny a mučenice <font color='#B71C1C'>M.</font><br>" +
                    "prinášame ti obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a prosíme, aby ti boli milé, <font color='#B71C1C'>—</font><br>" +
                    "ako sa ti páčila jej odvaha,<br>" +
                    "s ktorou za teba obetovala svoj život.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "v zástupe svätíc si ozdobil svätú <font color='#B71C1C'>M.</font><br>" +
                    "korunou panenstva i korunou mučeníctva; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme pôsobením prijatej sviatosti<br>" +
                    "statočne premáhali všetko zlo<br>" +
                    "a dosiahli nebeskú slávu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"26", "2", "Omša o panne mučenici 2.", "Dobrotivý Bože,<br>" +
                    "v dnešný deň nám poskytuješ radosť<br>" +
                    "z výročnej spomienky na svätú <font color='#B71C1C'>M.</font><br>" +
                    "a kladieš nám za vzor jej panenskú čistotu<br>" +
                    "a mučenícku odvahu; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, na jej orodovanie daj nám silu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme odhodlane niesli svoj každodenný kríž.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "pri oslave svätej panny a mučenice <font color='#B71C1C'>M.</font><br>" +
                    "prinášame ti obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a prosíme, aby ti boli milé, <font color='#B71C1C'>—</font><br>" +
                    "ako sa ti páčila jej odvaha,<br>" +
                    "s ktorou za teba obetovala svoj život.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "v zástupe svätíc si ozdobil svätú <font color='#B71C1C'>M.</font><br>" +
                    "korunou panenstva i korunou mučeníctva; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme pôsobením prijatej sviatosti<br>" +
                    "statočne premáhali všetko zlo<br>" +
                    "a dosiahli nebeskú slávu.<br>" +
                    "Skrze Krista, nášho Pána."},
            // omsa o svatej zene mucenici
            {"27", "1", "Omša o svätej žene mučenici 1.", "Dobrotivý Bože, s tvojou pomocou<br>" +
                    "aj slabý človek môže dosiahnuť hrdinskú odvahu; <font color='#B71C1C'>*</font><br>" +
                    "pri oslave svätej <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorej si dal silu k mučeníckej smrti,<br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám na jej orodovanie<br>" +
                    "prekonať všetky životné ťažkosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "s radosťou ti prinášame dnešnú obetu,<br>" +
                    "ktorou velebíme tvoje obdivuhodné skutky<br>" +
                    "pri oslave mučeníckej smrti svätej <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "a tešíme sa, že sme v nej dostali<br>" +
                    "mocnú orodovníčku u teba.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "sviatosť, ktorú sme prijali,<br>" +
                    "a oslava svätej <font color='#B71C1C'>M.</font><br>" +
                    "sú nám zdrojom ustavičnej radosti; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme horlivejšie žili v milosti,<br>" +
                    "ktorú si v nás zveľadil<br>" +
                    "pri slávení tejto obety.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"27", "2", "Omša o svätej žene mučenici 2.", "Dobrotivý Bože, s tvojou pomocou<br>" +
                    "aj slabý človek môže dosiahnuť hrdinskú odvahu; <font color='#B71C1C'>*</font><br>" +
                    "pri oslave svätej <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorej si dal silu k mučeníckej smrti,<br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám na jej orodovanie<br>" +
                    "prekonať všetky životné ťažkosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "s radosťou ti prinášame dnešnú obetu,<br>" +
                    "ktorou velebíme tvoje obdivuhodné skutky<br>" +
                    "pri oslave mučeníckej smrti svätej <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "a tešíme sa, že sme v nej dostali<br>" +
                    "mocnú orodovníčku u teba.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "sviatosť, ktorú sme prijali,<br>" +
                    "a oslava svätej <font color='#B71C1C'>M.</font><br>" +
                    "sú nám zdrojom ustavičnej radosti; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme horlivejšie žili v milosti,<br>" +
                    "ktorú si v nás zveľadil<br>" +
                    "pri slávení tejto obety.<br>" +
                    "Skrze Krista, nášho Pána."},
            // SPOLOCNE OMSE DUCHOVNYCH PASTIEROVSPOLOCNE OMSE DUCHOVNYCH PASTIEROV,
            // omsa o papezoch alebo biskupov
            {"31", "1", "Omša o pápežoch alebo biskupoch 1.", "<font color='#B71C1C'>(o pápežoch)</font><br>" +
                    "Všemohúci a večný Bože,<br>" +
                    "ty si povolal svätého pápeža <font color='#B71C1C'>M.</font>,<br>" +
                    "aby spravoval tvoj ľud<br>" +
                    "a slovom i príkladom sa staral o jeho dobro; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor ochraňuj pastierov svojej Cirkvi<br>" +
                    "i ľud, ktorý si im zveril, <font color='#B71C1C'>—</font><br>" +
                    "a všetkých veď po ceste spásy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo (o biskupoch): </font><br>" +
                    "Všemohúci Bože,<br>" +
                    "vo svätom biskupovi <font color='#B71C1C'>M.</font> si dal svojej Cirkvi<br>" +
                    "vzor dobrého pastiera; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, udeľ nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme na jeho príhovor<br>" +
                    "dosiahli radosti večného života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "pri oslave tvojich svätých prinášame ti obetu chvály<br>" +
                    "v synovskej dôvere, <font color='#B71C1C'>—</font><br>" +
                    "že pre jej zásluhy<br>" +
                    "od nás odvrátiš zlo prítomné i budúce.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "nech v nás sväté prijímanie roznecuje oheň tej lásky,<br>" +
                    "akou horel svätý <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "keď celý svoj život zasvätil Cirkvi.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"31", "2", "Omša o pápežoch alebo biskupoch 2.", "<font color='#B71C1C'>(o pápežoch)</font><br>" +
                    "Láskavý Bože,<br>" +
                    "uctievame si záslužné činy svätého <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorého si ustanovil za pastiera celej Cirkvi<br>" +
                    "a obdaril si ho<br>" +
                    "vynikajúcimi čnosťami a múdrosťou; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pred ľuďmi svietili svetlom dobrých skutkov<br>" +
                    "a horeli stále väčšou láskou k tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo (o biskupoch):</font><br>" +
                    "Všemohúci Bože,<br>" +
                    "daj nám dôstojne osláviť svätého biskupa <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorý slovom i príkladom slúžil veriacemu ľudu; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie nás ustavične ochraňuj <font color='#B71C1C'>—</font><br>" +
                    "a pošli nám duchovných pastierov<br>" +
                    "podľa svojho srdca.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "v deň oslavy svätého <font color='#B71C1C'>M.</font><br>" +
                    "prinášame ti dary na slávenie obety,<br>" +
                    "pre ktorú si svetu odpustil všetky hriechy;<br>" +
                    "milostivo zhliadni na nás <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nám táto svätá omša<br>" +
                    "priniesla požehnanie a spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "nech nám sviatosť, ktorú sme prijali<br>" +
                    "v deň oslavy svätého <font color='#B71C1C'>M.</font>,<br>" +
                    "poskytne pomoc v časnom živote <font color='#B71C1C'>—</font><br>" +
                    "a vedie nás k blaženej večnosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            // omsa o biskupoch
            {"32", "1", "Omša o biskupoch 1.", "Všemohúci a večný Bože,<br>" +
                    "ty si ustanovil svätého biskupa <font color='#B71C1C'>M.</font><br>" +
                    "za správcu tvojho svätého ľudu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme pre jeho zásluhy<br>" +
                    "cítili tvoju otcovskú dobrotu v každodennom živote.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na obetné dary,<br>" +
                    "ktoré na sviatok svätého biskupa <font color='#B71C1C'>M.</font><br>" +
                    "prinášame na tvoj oltár; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby nám získali odpustenie<br>" +
                    "a slúžili na slávu tvojho mena.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "na sviatok svätého biskupa <font color='#B71C1C'>M.</font><br>" +
                    "posilnil si nás sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme,<br>" +
                    "pomáhaj nám nasledovať jeho príklad, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vyznávali, čo veril, a uskutočňovali, čo učil.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"32", "2", "Omša o biskupoch 2.", "Dobrotivý Bože,<br>" +
                    "ty si k svätým pastierom pridružil biskupa <font color='#B71C1C'>M.</font>,<br>" +
                    "preniknutého ohňom lásky<br>" +
                    "a vierou, ktorá víťazí nad svetom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj nám na jeho príhovor<br>" +
                    "vytrvať vo viere a láske, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v spoločenstve s ním mali účasť<br>" +
                    "na tvojej sláve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary, ktoré ti tvoj ľud prináša<br>" +
                    "v deň oslavy svätého biskupa <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nám zaslúžili pomoc,<br>" +
                    "ktorú s dôverou očakávame od tvojej otcovskej lásky.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "posilnil si nás presvätým telom<br>" +
                    "a predrahou krvou tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby nám nábožné slávenie Eucharistie<br>" +
                    "zaistilo večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána."},
            // omsa o duchovnych pastieroch
            {"33", "1", "Omša o duchovných pastieroch 1.", "Bože, svetlo veriacich a pastier duší,<br>" +
                    "ty si dal Cirkvi svätého <font color='#B71C1C'>(</font>biskupa<font color='#B71C1C'>) M.</font>,<br>" +
                    "aby živil tvoj ľud Božím slovom<br>" +
                    "a poučoval ho vlastným príkladom; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si zachovali vieru, ktorú hlásal slovom,<br>" +
                    "a kráčali cestou, ktorú ukazoval skutkami.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary<br>" +
                    "v deň oslavy svätého <font color='#B71C1C'>M.</font> <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby vznešená obeta,<br>" +
                    "v ktorej sa prejavuje tvoja božská moc,<br>" +
                    "bola pre nás všetkých prameňom spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás prijatá sviatosť pripraví na večné radosti, <font color='#B71C1C'>—</font><br>" +
                    "ktoré si svätý <font color='#B71C1C'>M.</font> zaslúžil svojou vernou službou.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Všemohúci Bože,<br>" +
                    "posilnil si nás svätým pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám nasledovať príklad svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ťa uctievali s oddaným srdcom<br>" +
                    "a blížnemu slúžili s neúnavnou láskou.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"33", "2", "Omša o duchovných pastieroch 2.", "Večný Bože, ty si obdaril svätého <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "<font color='#B71C1C'>(</font>svätých biskupov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.)</font><br>" +
                    "duchom pravdy a lásky,<br>" +
                    "aby boli dobrými pastiermi tvojho ľudu; <font color='#B71C1C'>*</font><br>" +
                    "s úctou slávime ich sviatok a prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám ich príklad a orodovanie<br>" +
                    "pomáhali napredovať v kresťanskom živote.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi dary svojho ľudu<br>" +
                    "v deň spomienky na svätého <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby obeta, ktorú konáme,<br>" +
                    "tebe bola na slávu<br>" +
                    "a nám slúžila na večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Bože,<br>" +
                    "v deň spomienky na tvojich svätých <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "sme prijali Oltárnu sviatosť; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme raz vo večnej sláve<br>" +
                    "uzreli v plnom svetle tajomstvo, <font color='#B71C1C'>—</font><br>" +
                    "ktoré teraz slávime pod sviatostnými znakmi.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"33", "3", "Omša o duchovných pastieroch 3.", "Všemohúci Bože, pokorne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "na príhovor svätého <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "rozmnožuj v nás svoje dary <font color='#B71C1C'>—</font><br>" +
                    "a našim časom udeľ pravý pokoj.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože,<br>" +
                    "zhliadni na obetné dary,<br>" +
                    "ktoré sme priniesli na tvoj oltár<br>" +
                    "pri spomienke na svätých <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                    "a odpusť nám hriechy pre zásluhy svätej obety, <font color='#B71C1C'>—</font><br>" +
                    "ktorá im pomohla k nebeskej sláve.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech táto obetná hostina<br>" +
                    "upevní a rozmnoží v nás tvoju milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si zachovali neporušenú vieru<br>" +
                    "a kráčali cestou spásy,<br>" +
                    "ktorú nám svätí <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> ukázali svojím príkladom.<br>" +
                    "Skrze Krista, nášho Pána."},
            // omsa o zakladateloch miestych cirkvi
            {"34", "1", "Omša o zakladateľoch miestnych cirkví 1.", "Všemohúci a milosrdný Bože,<br>" +
                    "kázaním a svedectvom svätého <font color='#B71C1C'>M.</font><br>" +
                    "priviedol si našich otcov k svetlu pravdy; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme celým životom dosvedčovali<br>" +
                    "kresťanskú vieru,<br>" +
                    "ku ktorej sa hrdo hlásime.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Nebeský Otče, zhliadni na svoju rodinu,<br>" +
                    "ktorú svätý <font color='#B71C1C'>(</font>biskup<font color='#B71C1C'>) M.</font> zrodil slovom pravdy<br>" +
                    "a živil chlebom života; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "na jeho orodovanie daj horlivosť v láske všetkým,<br>" +
                    "ktorých si jeho službou priviedol k viere.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary,<br>" +
                    "ktoré ti prinášame pri oslave svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "a svojou božskou mocou ich premeň<br>" +
                    "na sviatosť našej spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "pri oslave svätého <font color='#B71C1C'>M.</font><br>" +
                    "s radosťou sme prijali záloh večnej spásy; <font color='#B71C1C'>—</font><br>" +
                    "nech nás táto sviatosť<br>" +
                    "posilňuje na pozemskej púti<br>" +
                    "a privedie do nebeskej vlasti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"34", "2", "Omša o zakladateľoch miestnych cirkví 2.", "Všemohúci Bože,<br>" +
                    "láskavo zhliadni na kresťanskú obec v <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorú si priviedol k viere<br>" +
                    "apoštolskou činnosťou svätého <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "na ich mocné orodovanie udržuj v nej<br>" +
                    "horlivý kresťanský život.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Večný Bože,<br>" +
                    "kázaním a svedectvom svätého <font color='#B71C1C'>(</font>biskupa<font color='#B71C1C'>) M.</font><br>" +
                    "povolal si našich predkov<br>" +
                    "k obdivuhodnému svetlu evanjelia; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "na jeho príhovor nám pomáhaj rásť v milosti<br>" +
                    "a v poznaní nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš,*<br>" +
                    "pri oslave svätého <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "láskavo prijmi naše dary<br>" +
                    "a spolu s nimi posväť aj naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa ti páčili celým svojím životom.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "na sviatok svätého <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "s vďačným srdcom oslavujeme počiatky našej viery <font color='#B71C1C'>*</font><br>" +
                    "a chválime ťa,<br>" +
                    "že obdivuhodne pôsobíš vo svojich svätých; <font color='#B71C1C'>—</font><br>" +
                    "daj nech nás naplní radosťou spasiteľný dar,<br>" +
                    "ktorý sme prijali z tvojho oltára.<br>" +
                    "Skrze Krista, nášho Pána."},
            // omsa o misionaroch
            {"35", "1", "Omša o misionároch 1.", "Večný Bože,<br>" +
                    "misijnou činnosťou svätého <font color='#B71C1C'>(</font>biskupa<font color='#B71C1C'>) M.</font><br>" +
                    "priviedol si mnohých ľudí<br>" +
                    "z temnôt k svetlu pravdy; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme zostali pevní vo viere<br>" +
                    "a neochvejne sa pridŕžali nádeje,<br>" +
                    "ktorú nám dáva evanjelium.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Všemohúci a večný Bože,<br>" +
                    "dnešný deň nám dávaš radosť<br>" +
                    "z nebeskej slávy svätého <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "milostivo nám pomáhaj zachovať<br>" +
                    "a skutkami vyznávať vieru, <font color='#B71C1C'>—</font><br>" +
                    "ktorú on horlivo a neúnavne šíril.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "pri oslave svätého <font color='#B71C1C'>M.</font> prinášame ti obetné dary; <font color='#B71C1C'>*</font><br>" +
                    "láskavo na ne zhliadni <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme vo svojom živote<br>" +
                    "napodobňovali obetu tvojho Syna na kríži,<br>" +
                    "ktorej pamiatku nábožne slávime.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "touto Eucharistiou upevni nás v pravej viere, <font color='#B71C1C'>*</font><br>" +
                    "aby sme ju všade vyznávali slovom i skutkom, <font color='#B71C1C'>—</font><br>" +
                    "ako ju neúnavne ohlasoval svätý <font color='#B71C1C'>M.</font><br>" +
                    "a jej šíreniu zasvätil celý svoj život.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"35", "2", "Omša o misionároch 2.", "Milosrdný Bože,<br>" +
                    "ty si zveľadil svoju Cirkev<br>" +
                    "horlivosťou za vieru<br>" +
                    "a apoštolskou činnosťou svätého <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor pomáhaj svojmu ľudu, <font color='#B71C1C'>—</font><br>" +
                    "aby ustavične rástol vo viere<br>" +
                    "a vzmáhal sa vo svätosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "vypočuj naše pokorné prosby<br>" +
                    "a osloboď nás od každej viny, <font color='#B71C1C'>—</font><br>" +
                    "aby nás stále posväcovala eucharistická obeta,<br>" +
                    "ktorú slávime s oddaným srdcom.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby prijatá sviatosť<br>" +
                    "posilňovala v nás vieru, ktorú hlásali apoštoli <font color='#B71C1C'>—</font><br>" +
                    "a ktorú svätý <font color='#B71C1C'>M.</font> starostlivo chránil<br>" +
                    "a horlivo rozširoval.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"35", "3", "Omša o misionároch 3.", "Milosrdný Bože,<br>" +
                    "ty si poslal svätého <font color='#B71C1C'>M.</font> ohlasovať<br>" +
                    "Kristovo nevyspytateľné bohatstvo ; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj<br>" +
                    "vždy lepšie ťa poznávať, <font color='#B71C1C'>—</font><br>" +
                    "aby sme verne žili podľa pravdy evanjelia<br>" +
                    "a prinášali ovocie dobrých skutkov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo (o mučeníkoch):</font><br>" +
                    "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme s oddanou láskou<br>" +
                    "nasledovali vieru svätého <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "ktorí za šírenie evanjelia položili život<br>" +
                    "a zaslúžili si veniec nehynúcej slávy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "požehnaj obetné dary,<br>" +
                    "ktoré ti prinášame pri oslave svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                    "a premeň ich na sviatosť našej spásy, <font color='#B71C1C'>—</font><br>" +
                    "aby nás pri svätom prijímaní<br>" +
                    "očistili od každej viny<br>" +
                    "a pomáhali nám dosiahnuť večný život v nebi.<br>" +
                    "Skrze Krista, nášho Pána.", "Večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "zveľaďuj náš duchovný život sviatosťou,<br>" +
                    "ktorú sme prijali v deň pamiatky na svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás príklad jeho apoštolských čností<br>" +
                    "povzbudil k dôslednému životu podľa evanjelia.<br>" +
                    "Skrze Krista, nášho Pána."},
            // SPOLOCNE OMSE UCITELOV CIRKVI
            {"4", "1", "Omša o učiteľoch Cirkvi 1.", "Všemohúci a večný Bože,<br>" +
                    "svätého <font color='#B71C1C'>(</font>biskupa<font color='#B71C1C'>) M.</font> dal si svojej Cirkvi<br>" +
                    "za učiteľa a ochrancu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa,<br>" +
                    "natrvalo upevni v našich srdciach náuku,<br>" +
                    "ktorú on z vnuknutia Ducha Svätého učil, <font color='#B71C1C'>—</font><br>" +
                    "a na jeho mocné orodovanie<br>" +
                    "preukazuj nám svoje milosrdenstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "nech sa ti zapáči obeta, <font color='#B71C1C'>*</font><br>" +
                    "ktorú s radosťou konáme pri oslave svätého <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>—</font><br>" +
                    "povzbudení jeho náukou a príkladom<br>" +
                    "aj my sa ti celkom oddávame a vďačne ťa chválime.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "tvoj Syn Ježiš Kristus je pre nás chlebom života; <font color='#B71C1C'>*</font><br>" +
                    "daj, nech je aj naším učiteľom, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa príkladu svätého <font color='#B71C1C'>M.</font><br>" +
                    "lepšie poznávali tvoju pravdu<br>" +
                    "a dosvedčovali ju bratskou láskou.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"4", "2", "Omša o učiteľoch Cirkvi 2.", "Večný Bože,<br>" +
                    "ty si dal svätému <font color='#B71C1C'>M.</font><br>" +
                    "hlboké poznanie tajomstiev viery; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa verne pridržiavali tvojej pravdy<br>" +
                    "a vyznávali ju svojím životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "pri slávení týchto vznešených tajomstiev<br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nás Duch Svätý osvietil svetlom viery,<br>" +
                    "ktorým ustavične osvecoval svätého <font color='#B71C1C'>M.</font><br>" +
                    "pri šírení tvojej slávy.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "s vierou sme prijali sviatostný pokrm<br>" +
                    "a pokorne ťa prosíme o milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme žili podľa príkladu svätého <font color='#B71C1C'>M.</font><br>" +
                    "a neprestajne ti ďakovali za tvoje dary.<br>" +
                    "Skrze Krista, nášho Pána."},
            // SPOLOCNE OMSE PANNIEN
            {"51", "1", "Omša o pannách 1.", "Bože, naša spása, <font color='#B71C1C'>*</font><br>" +
                    "pri oslave svätej panny <font color='#B71C1C'>M.</font> vyslyš naše prosby, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa od nej naučili<br>" +
                    "slúžiť ti s oddaným srdcom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "oslavujeme obdivuhodné účinky tvojej milosti<br>" +
                    "v živote svätej panny <font color='#B71C1C'>M.</font><br>" +
                    "a vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby ti bola príjemná naša obeta,<br>" +
                    "ako ti bolo milé svedectvo jej panenského života.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "posilnení sviatostným pokrmom<br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa príkladu svätej <font color='#B71C1C'>M.</font><br>" +
                    "nosili v našom smrteľnom tele Ježišovo utrpenie<br>" +
                    "a celou silou sa vinuli iba k tebe.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"51", "2", "Omša o pannách 2.", "Pane a Bože náš,<br>" +
                    "svätú pannu <font color='#B71C1C'>M.</font> si zahrnul nebeskými darmi; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme si v tomto živote<br>" +
                    "osvojovali jej čnosti<br>" +
                    "a v spoločenstve s ňou<br>" +
                    "tešili sa z večnej slávy v nebi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo (o panne, zakladateľke rehoľnej spoločnosti):</font><br>" +
                    "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "nech príklad tvojej vernej nevesty, svätej panny <font color='#B71C1C'>M.</font><br>" +
                    "roznieti v nás takú vrúcnu lásku k tebe, <font color='#B71C1C'>—</font><br>" +
                    "akú ona vštepovala do sŕdc iných panien<br>" +
                    "na večnú slávu tvojej Cirkvi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "prijmi naše obetné dary<br>" +
                    "a daj, aby sa na nás prejavili účinky obety,<br>" +
                    "ktorú konáme; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám podľa príkladu svätej <font color='#B71C1C'>M.</font><br>" +
                    "očisťovať sa od hriešnych náklonnosti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli napredovať v duchovnom živote.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "nech nás prijatie tela a krvi tvojho Syna<br>" +
                    "vedie k správnemu hodnoteniu<br>" +
                    "pominuteľných vecí, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti podľa príkladu svätej <font color='#B71C1C'>M.</font><br>" +
                    "s oddanou láskou slúžili<br>" +
                    "a v nebi sa tešili z večného pohľadu na teba.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"51", "3", "Omša o pannách 3.", "Dobrotivý Bože, ty nás uisťuješ,<br>" +
                    "že prebývaš v tých, čo sú spravodliví<br>" +
                    "a majú čisté srdce; <font color='#B71C1C'>*</font><br>" +
                    "na orodovanie svätej panny <font color='#B71C1C'>M.</font><br>" +
                    "pomáhaj nám tak žiť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli tvojím trvalým príbytkom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "vypočuj prosby svojej rodiny,<br>" +
                    "ktorá oslavuje čnosti svätej panny <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme vytrvali v tvojej láske<br>" +
                    "a rástli v nej až do konca nášho života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary, ktoré ti pokorne prinášame<br>" +
                    "v deň spomienky na svätú pannu <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme účinkom tejto nepoškvrnenej obety<br>" +
                    "ustavične horeli oddanou a svätou láskou k tebe.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "v deň radostnej oslavy svätej panny <font color='#B71C1C'>M.</font><br>" +
                    "posilnil si nás nebeským chlebom; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, odpusť nám hriechy <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme pri dobrom zdraví<br>" +
                    "rástli v tvojej milosti a dosiahli večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána."},
            // omsa o viacerych pannach
            {"52", "1", "Omša o viacerých pannách", "Večný Bože,<br>" +
                    "pri radostnej oslave svätých panien <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "preukáž nám svoje milosrdenstvo<br>" +
                    "a pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa spolu s nimi mohli tešiť<br>" +
                    "v tvojom večnom kráľovstve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nekonečný Bože,<br>" +
                    "pri oslave svätých panien <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorou velebíme teba, <font color='#B71C1C'>*</font><br>" +
                    "prinášame obetné dary a pokorne prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby ti naša obeta bola taká milá,<br>" +
                    "ako ti bol milý ich obetavý život.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "vznešená sviatosť, ktorú sme prijali<br>" +
                    "v deň oslavy svätých panien <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                    "nech je nám stálym prameňom sily a svetla, <font color='#B71C1C'>—</font><br>" +
                    "aby sme bedlivo očakávali príchod tvojho Syna<br>" +
                    "a dostali sa na svadobnú hostinu<br>" +
                    "v jeho kráľovstve.<br>" +
                    "Skrze Krista, nášho Pána."},
            // SPOLOCNE OMSE SVATYCH MUZOV a SVATYCH ZIEN
            {"61", "1", "Omša o svätých mužoch a svätých ženách 1.", "Všemohúci a večný Bože,<br>" +
                    "oslávením svojich svätých<br>" +
                    "nám dávaš stále nové dôkazy svojej lásky; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme na ich orodovanie<br>" +
                    "a podľa ich príkladu<br>" +
                    "verne nasledovali tvojho Syna Ježiša Krista,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo vypočuj naše prosby<br>" +
                    "a ochraňuj nás na orodovanie svojich svätých, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti pri oltári vzdávali dôstojnú úctu.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci a večný Bože,<br>" +
                    "darca pravej útechy a pokoja, <font color='#B71C1C'>*</font><br>" +
                    "dopraj svojmu ľudu,<br>" +
                    "ktorý sa na sviatok svätého <font color='#B71C1C'>M.</font><br>" +
                    "zišiel chváliť tvoje meno, <font color='#B71C1C'>—</font><br>" +
                    "aby prijatá sviatosť tvojho jednorodeného Syna<br>" +
                    "bola pre všetkých zálohom večnej spásy.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"61", "2", "Omša o svätých mužoch a svätých ženách 2.", "Pane a Bože náš, ty jediný si svätý<br>" +
                    "a bez tvojej pomoci nikto nemôže byť dobrý; <font color='#B71C1C'>*</font><br>" +
                    "dopraj nám na príhovor svätého <font color='#B71C1C'>M.</font><br>" +
                    "dôsledne žiť podľa tvojej vôle, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli vojsť do slávy,<br>" +
                    "ktorú si nám pripravil.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "dobrotivo prijmi tieto dary, <font color='#B71C1C'>*</font><br>" +
                    "ktoré ti s pokorou prinášame<br>" +
                    "v deň spomienky na tvojich svätých <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás táto svätá obeta<br>" +
                    "očistila a posvätila na tele i na duši.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "pri oslave blaženej smrti tvojich svätých<br>" +
                    "posilnil si nás sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme raz požívali večné dobrá, <font color='#B71C1C'>—</font><br>" +
                    "na ktorých nám už dávaš účasť touto sviatosťou.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"61", "3", "Omša o svätých mužoch a svätých ženách 3.", "Všemohúci Bože,<br>" +
                    "vo svojich svätých dávaš nám slabým vzor a ochranu,<br>" +
                    "aby si nám uľahčil cestu k spáse; <font color='#B71C1C'>*</font><br>" +
                    "pri oslave nebeských narodenín svätého <font color='#B71C1C'>M.</font><br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám kráčať k tebe podľa jeho príkladu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože,<br>" +
                    "prinášame ti obetné dary<br>" +
                    "pri spomienke na svätého <font color='#B71C1C'>M.</font> <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pre zásluhy tejto obety<br>" +
                    "udeľ nám dar jednoty a pokoja.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "Oltárna sviatosť, ktorú sme prijali<br>" +
                    "v deň oslavy svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                    "nech posvätí naše mysle a srdcia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme raz dosiahli plnú účasť<br>" +
                    "na tvojom božskom živote<br>" +
                    "v spoločenstve svätých v nebi.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"61", "4", "Omša o svätých mužoch a svätých ženách 4.", "Milosrdný Bože,<br>" +
                    "ty vieš, že sme krehkí a ľahko klesáme; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, zľutuj sa nad nami <font color='#B71C1C'>—</font><br>" +
                    "a príkladom svojich svätých<br>" +
                    "posilni v nás lásku k tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nekonečný Bože, <font color='#B71C1C'>*</font><br>" +
                    "na sviatok svätého <font color='#B71C1C'>M.</font> prinášame ti dary<br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "aby nás táto svätá obeta zmierila s tebou<br>" +
                    "a pomohla nám dosiahnuť spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože a Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "posilnení sviatostným pokrmom<br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám obeta, ktorú slávime na príkaz tvojho Syna,<br>" +
                    "stále pomáhala na ceste k spáse.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"61", "5", "Omša o svätých mužoch a svätých ženách 5.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nám svätý <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorých sviatok nábožne slávime,<br>" +
                    "vyprosia tvoju pomoc, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s nimi mali účasť na večnej sláve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "prinášame dary na tvoj oltár a prosíme ťa, <font color='#B71C1C'>*</font><br>" +
                    "daj nám vrúcnu oddanosť k tebe,<br>" +
                    "akou si obdaril svätého <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s čistou mysľou a s horlivým srdcom<br>" +
                    "slávili tebe milú a nám prospešnú obetu.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nám toto sväté prijímanie bolo na spásu<br>" +
                    "a utvrdilo nás v tvojej pravde, <font color='#B71C1C'>—</font><br>" +
                    "ktorá je nám svetlom na životnej púti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"61", "6", "Omša o svätých mužoch a svätých ženách 6.", "Všemohúci Bože,<br>" +
                    "príkladmi svojich svätých nás povzbudzuješ<br>" +
                    "k lepšiemu životu; <font color='#B71C1C'>*</font><br>" +
                    "preto ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám napodobňovať skutky svätého <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorého pamiatku dnes slávime.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "v deň oslavy tvojich svätých<br>" +
                    "kladieme na oltár obetné dary<br>" +
                    "a vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby táto obeta prispela k tvojej väčšej sláve<br>" +
                    "a nám získala hojnú milosť.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nám vznešené tajomstvá,<br>" +
                    "ktoré sme slávili<br>" +
                    "v deň pamiatky tvojich svätých, <font color='#B71C1C'>—</font><br>" +
                    "priniesli spásu a večný pokoj.<br>" +
                    "Skrze Krista, nášho Pána."},
            // omsa o reholnikoch
            {"62", "1", "Omša o rehoľníkoch 1.", "Bože a Otče náš,<br>" +
                    "s tvojou pomocou svätý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>) M.</font> vytrvalo nasledoval<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font><br>" +
                    "Ježiša Krista v chudobe a poníženosti; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám na jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> orodovanie<br>" +
                    "verne kráčať vo svojom povolaní, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dospeli k dokonalosti,<br>" +
                    "ktorej vzor si nám ukázal vo svojom Synovi.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo (o opátovi):</font><br>" +
                    "Všemohúci Bože,<br>" +
                    "vo svätom opátovi <font color='#B71C1C'>M.</font> dal si nám vzor<br>" +
                    "dokonalého života podľa evanjelia; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme uprostred pominuteľných vecí<br>" +
                    "celým srdcom túžili po nebeských dobrách.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milostivý Bože,<br>" +
                    "ty si vo svätom <font color='#B71C1C'>M. (</font>svätej <font color='#B71C1C'>M.)</font><br>" +
                    "pretvoril starého človeka na človeka nového<br>" +
                    "podľa svojho srdca; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pretvor aj nás na nových ľudí, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti mohli dôstojne priniesť<br>" +
                    "túto obetu zmierenia.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "touto sviatosťou nám poskytuješ pomoc a silu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, nauč nás, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa príkladu svätého <font color='#B71C1C'>M. (</font>svätej <font color='#B71C1C'>M.)</font><br>" +
                    "hľadali nadovšetko teba<br>" +
                    "a v tomto svete žili ako noví ľudia.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"62", "2", "Omša o rehoľníkoch 2.", "Večný Bože,<br>" +
                    "ty si svätého <font color='#B71C1C'>M. (</font>svätú <font color='#B71C1C'>M.)</font> povolal,<br>" +
                    "aby úsilím o dokonalú lásku<br>" +
                    "už na tomto svete hľadal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> tvoje kráľovstvo; <font color='#B71C1C'>*</font><br>" +
                    "na jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> príhovor nás posilňuj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s duchovnou radosťou<br>" +
                    "napredovali na ceste lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "láskavo prijmi naše skromné dary,<br>" +
                    "ktoré kladieme na oltár<br>" +
                    "v deň spomienky na svätého <font color='#B71C1C'>M. (</font>svätú <font color='#B71C1C'>M.)</font>; <font color='#B71C1C'>*</font><br>" +
                    "osloboď nás od všetkého,<br>" +
                    "čo nás oddeľuje od teba, <font color='#B71C1C'>—</font><br>" +
                    "aby si ty bol naším jediným pokladom.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.", "Prosíme ťa, Bože,<br>" +
                    "pôsobením tejto sviatosti<br>" +
                    "veď nás cestou svojej lásky,<br>" +
                    "ako si viedol svätého <font color='#B71C1C'>M. (</font>svätú <font color='#B71C1C'>M.)</font>, <font color='#B71C1C'>*</font><br>" +
                    "a dobré dielo, ktoré si v nás začal, <font color='#B71C1C'>—</font><br>" +
                    "priveď k zavŕšeniu v deň príchodu Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov."},
            // omsa o tych, co konali skutky milosrdensta
            {"63", "1", "Omša o tých, čo konali skutky milosrdenstva", "Večný Bože, ty si svoju Cirkev poučil,<br>" +
                    "že všetky tvoje prikázania<br>" +
                    "sú zahrnuté v láske k tebe a k blížnemu; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme podľa príkladu svätého <font color='#B71C1C'>M. (</font>svätej <font color='#B71C1C'>M.)</font><br>" +
                    "konali skutky milosrdenstva <font color='#B71C1C'>—</font><br>" +
                    "a boli raz pripočítaní k požehnaným<br>" +
                    "v tvojom kráľovstve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh, a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "v oltárnej obete oslavujeme<br>" +
                    "dielo nesmiernej lásky tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše obetné dary <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás príklady tvojich svätých<br>" +
                    "upevnili v láske k tebe a k blížnemu.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Bože,<br>" +
                    "posilnení sviatostným pokrmom vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám nasledovať<br>" +
                    "príklad svätého <font color='#B71C1C'>M. (</font>svätej <font color='#B71C1C'>M.)</font>, <font color='#B71C1C'>—</font><br>" +
                    "ktorý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>)</font> ti slúžil<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> s neúnavnou oddanosťou<br>" +
                    "a tvojmu ľudu sa venoval<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> s veľkou láskou.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Dobrotivý Otče,<br>" +
                    "spasiteľnou sviatosťou, ktorú sme prijali,<br>" +
                    "dávaš nám duchovnú radosť; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme nasledovali<br>" +
                    "svätého <font color='#B71C1C'>M. (</font>svätú <font color='#B71C1C'>M.)</font> v láske,<br>" +
                    "a tak si zaslúžili s ním <font color='#B71C1C'>(</font>s ňou<font color='#B71C1C'>)</font><br>" +
                    "účasť na večnej sláve.<br>" +
                    "Skrze Krista, nášho Pána."},
            // omsa o vychovavateloch
            {"64", "1", "Omša o vychovávateľoch", "Bože a Otče náš,<br>" +
                    "ty si vzbudil vo svojej Cirkvi svätého <font color='#B71C1C'>M. (</font>svätú <font color='#B71C1C'>M.)</font>,<br>" +
                    "aby mladým ľuďom ukazoval<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> cestu spásy; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám podľa jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> príkladu<br>" +
                    "verne nasledovať Krista, nášho Učiteľa a Pána, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli so svojimi bratmi a sestrami<br>" +
                    "dôjsť k tebe do večnej radosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "dobrotivo prijmi obetné dary svojho ľudu<br>" +
                    "v deň oslavy tvojich svätých; <font color='#B71C1C'>*</font><br>" +
                    "nech nás táto vznešená obeta posilňuje, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dobrými skutkami<br>" +
                    "vydávali pred svetom svedectvo o tvojej láske.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "nech nám sväté prijímanie dodáva silu,*<br>" +
                    "aby sme si podľa príkladu tvojich svätých<br>" +
                    "zachovali v srdci<br>" +
                    "svetlo tvojej pravdy a bratskú lásku <font color='#B71C1C'>—</font><br>" +
                    "a prejavovali ju aj skutkami.<br>" +
                    "Skrze Krista, nášho Pána."},
            // omsa o svatych zenach
            {"65", "1", "Omša o svätých ženách 1.", "Dobrotivý Bože,<br>" +
                    "pri výročnej oslave svätej <font color='#B71C1C'>M.</font><br>" +
                    "nás napĺňaš duchovnou radosťou; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám aj nasledovať<br>" +
                    "príklad jej svätého života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo (o viacerých ženách):</font><br>" +
                    "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "na príhovor svätej <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "udeľ nám svoju nebeskú pomoc <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby ich obdivuhodný život<br>" +
                    "bol pre nás spasiteľným príkladom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "v deň oslavy svätej <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font><br>" +
                    "prinášame dary na tvoj oltár<br>" +
                    "a pokorne prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám táto presvätá obeta<br>" +
                    "získala odpustenie a priniesla spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "osvecuj a oduševňuj nás vznešenou sviatosťou,<br>" +
                    "ktorú sme prijali v deň oslavy svätej <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "aby sme stále horeli túžbou po svätých veciach<br>" +
                    "a ochotne konali dobré skutky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"65", "2", "Omša o svätých ženách 2.", "Bože, sláva ponížených,<br>" +
                    "ty si obdaril svätú <font color='#B71C1C'>M.</font><br>" +
                    "vynikajúcou trpezlivosťou a láskou; <font color='#B71C1C'>*</font><br>" +
                    "pre jej zásluhy a na jej orodovanie daj nám silu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vytrvalo niesli svoj kríž<br>" +
                    "a milovali ťa celým srdcom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Milostivý Bože,<br>" +
                    "naplň nás duchom múdrosti a lásky,<br>" +
                    "ktorým si obdaril svoju služobníčku <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám verne ti slúžiť<br>" +
                    "podľa jej žiarivého príkladu, <font color='#B71C1C'>—</font><br>" +
                    "aby sa ti páčila naša viera i naše skutky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Zhliadni, Bože, na dary svojho ľudu,<br>" +
                    "ktorý slávi svätú obetu<br>" +
                    "v deň spomienky na tvojich svätých, <font color='#B71C1C'>*</font><br>" +
                    "a dopraj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme stále cítili tvoju pomoc na ceste spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože a Otče náš,<br>" +
                    "pri oslave svätej <font color='#B71C1C'>M.</font><br>" +
                    "zahrnul si nás svojimi darmi; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "nech sviatostná milosť zotrie naše viny<br>" +
                    "a posilní nás v životnom boji.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"71", "1", "Za odpustenie hriechov", "Milosrdný Bože, uznávame, že sme zhrešili; <font color='#B71C1C'>*</font><br>" +
                    "preto ťa prosíme,<br>" +
                    "zhliadni na našu pokoru a zľutuj sa nad nami, <font color='#B71C1C'>—</font><br>" +
                    "odpusť nám viny a obdaruj nás svojím pokojom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože Otče,<br>" +
                    "buď milostivý svojmu ľudu: <font color='#B71C1C'>*</font><br>" +
                    "osloboď nás od všetkých hriechov<br>" +
                    "a odpusť nám tresty, <font color='#B71C1C'>—</font><br>" +
                    "ktoré zasluhujeme za svoje previnenia.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože, milosrdný Otče, <font color='#B71C1C'>*</font><br>" +
                    "pre zásluhy zmiernej obety, ktorú slávime,<br>" +
                    "zmiluj sa nad nami, <font color='#B71C1C'>—</font><br>" +
                    "odpusť nám viny<br>" +
                    "a usmerňuj k sebe naše nestále srdcia.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "pre túto sviatostnú obetu nám odpúšťaš viny; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám svojou milosťou<br>" +
                    "chrániť sa ďalších hriechov, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti slúžili s čistým srdcom.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"71", "2", "Za dar lásky", "Všemohúci Bože, zošli nám Ducha Svätého <font color='#B71C1C'>*</font><br>" +
                    "a zapáľ naše srdcia ohňom svojej lásky, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy zmýšľali a konali, ako sa tebe páči,<br>" +
                    "a úprimne ťa milovali v našich bratoch a sestrách.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "milostivo posväť tieto obetné dary<br>" +
                    "a s nimi prijmi aj našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme tvojou láskou milovali všetkých ľudí.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "nasýtil si nás z toho istého Chleba,<br>" +
                    "ktorý v nás rozmnožuje božský život; <font color='#B71C1C'>—</font><br>" +
                    "naplň nás milosťou Ducha Svätého<br>" +
                    "a čistou radosťou, prameniacou z dokonalej lásky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"72a", "1", "Za jednotu kresťanov 1.", "Všemohúci a večný Bože,<br>" +
                    "ty zjednocuješ rozdelených<br>" +
                    "a zjednotených zachovávaš vo svornosti; <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na všetkých,<br>" +
                    "ktorí veria v tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a keďže nás posvätil ten istý krst,<br>" +
                    "nech nás spája aj pravá viera a vzájomná láska.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Prosíme ťa, Bože,<br>" +
                    "milujúci otec všetkých ľudí, <font color='#B71C1C'>*</font><br>" +
                    "vylej na nás hojnú milosť svojho Ducha<br>" +
                    "a pomôž nám dôsledne žiť podľa kresťanskej viery,<br>" +
                    "ku ktorej si nás povolal, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pred ľuďmi vyznávali tvoju pravdu<br>" +
                    "a vytrvalo sa usilovali o jednotu všetkých veriacich<br>" +
                    "vo zväzku pokoja.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nekonečný Bože,<br>" +
                    "jedinou obetou tvojho Syna<br>" +
                    "utvoril si z nás svoj vyvolený ľud; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "udeľ nám vo svojej Cirkvi dar jednoty a pokoja.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "toto sväté prijímanie,<br>" +
                    "ktoré je viditeľným znakom,<br>" +
                    "že tvoji veriaci sú spojení v tebe, <font color='#B71C1C'>—</font><br>" +
                    "nech pomáha dosiahnuť aj jednotu<br>" +
                    "všetkých kresťanov v tvojej Cirkvi.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"72a", "2", "Za jednotu kresťanov 2.", "Všemohúci Otče,<br>" +
                    "ty si zjednotil rôzne národy<br>" +
                    "vo vyznávaní tvojho mena; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám ochotne<br>" +
                    "a nehatene plniť tvoju vôľu, <font color='#B71C1C'>—</font><br>" +
                    "aby ľud, ktorý si povolal do svojho kráľovstva,<br>" +
                    "bol jednotný vo viere a v činorodej láske.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože a Otče náš,<br>" +
                    "milostivo vyslyš prosby svojho ľudu <font color='#B71C1C'>*</font><br>" +
                    "a spoj srdcia všetkých veriacich<br>" +
                    "v spoločnom pokání<br>" +
                    "a v spoločnej oslave tvojho mena, <font color='#B71C1C'>—</font><br>" +
                    "aby prestalo rozdelenie kresťanov<br>" +
                    "a aby sme mohli v dokonalej jednote<br>" +
                    "ísť v ústrety tvojmu večnému kráľovstvu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "nábožne slávime pamiatku našej spásy<br>" +
                    "a pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "premeň naše obetné dary na sviatosť,<br>" +
                    "ktorá je znamením jednoty a putom lásky.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "pôsobením sviatostnej obety,<br>" +
                    "na ktorej sme sa zúčastnili,<br>" +
                    "naplň nás svojím Duchom <font color='#B71C1C'>—</font><br>" +
                    "a zjednoť v láske srdcia i mysle všetkých,<br>" +
                    "čo veria v teba.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"72a", "3", "Za jednotu kresťanov 3.", "Nebeský Otče, <font color='#B71C1C'>*</font><br>" +
                    "milostivo zhliadni na svoj ľud<br>" +
                    "a zahrň ho darmi svojho Ducha, <font color='#B71C1C'>—</font><br>" +
                    "aby sme rástli v láske k pravde,<br>" +
                    "úprimne túžili po dokonalej jednote kresťanov<br>" +
                    "a účinne ju napomáhali.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Pane a Bože náš,<br>" +
                    "preukáž nám svoje milosrdenstvo<br>" +
                    "a mocou svojho Ducha odstráň<br>" +
                    "rozdelenie kresťanov, <font color='#B71C1C'>*</font><br>" +
                    "aby tvoja Cirkev jasnejšie žiarila ako viditeľný znak<br>" +
                    "tvojej prítomnosti medzi národmi <font color='#B71C1C'>—</font><br>" +
                    "a privádzala svet, osvietený Duchom Svätým,<br>" +
                    "k viere v Krista, ktorého si poslal.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "pôsobením tejto svätej obety<br>" +
                    "očisť nás od hriechov <font color='#B71C1C'>—</font><br>" +
                    "a zjednoť všetkých, ktorých spája jeden krst,<br>" +
                    "aby sme mohli spoločne sláviť Eucharistiu.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Otče,<br>" +
                    "prijali sme sviatosť tela a krvi tvojho Syna <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, obnov vo svojej Cirkvi dar svätosti, <font color='#B71C1C'>—</font><br>" +
                    "aby ti všetci, čo majú česť byť kresťanmi,<br>" +
                    "slúžili jednotní vo viere.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"72b", "4", "Za povolanie na kňazský stav", "Bože a Otče náš, ty sa staráš o svoj ľud<br>" +
                    "a posielaš mu duchovných pastierov; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa,<br>" +
                    "daruj svojej Cirkvi Ducha nábožnosti a sily, <font color='#B71C1C'>—</font><br>" +
                    "aby v nej vzbudzoval hodných<br>" +
                    "služobníkov tvojho oltára<br>" +
                    "a utváral z nich<br>" +
                    "odvážnych a pokorných hlásateľov tvojho evanjelia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože,<br>" +
                    "zhliadni na modlitby a dary svojho ľudu: <font color='#B71C1C'>*</font><br>" +
                    "rozmnož počet tých, čo vysluhujú tvoje tajomstvá, <font color='#B71C1C'>—</font><br>" +
                    "a zachovaj ich vo vernosti a v láske k tebe.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "pri sviatostnom stole posilnil si nás chlebom života;<font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, nech účinkom tejto sviatosti lásky<br>" +
                    "dozrievajú semená povolaní,<br>" +
                    "ktoré štedro rozsievaš na roli svojej Cirkvi, <font color='#B71C1C'>—</font><br>" +
                    "aby si mnohí vyvolili za svoje životné povolanie<br>" +
                    "slúžiť tebe vo svojich bratoch.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"72b", "5", "Za rehoľné povolania", "Nebeský Otče,<br>" +
                    "ty všetkých veriacich pozývaš k dokonalej láske<br>" +
                    "a mnohých povolávaš nasledovať tvojho Syna<br>" +
                    "osobitným spôsobom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, milostivo pomáhaj všetkým,<br>" +
                    "ktorých si vyvolil pre rehoľný život, <font color='#B71C1C'>—</font><br>" +
                    "aby boli Cirkvi a svetu<br>" +
                    "presvedčivým znamením tvojho kráľovstva.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo (v rehoľných komunitách):</font><br>" +
                    "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "milostivo zhliadni na našu rehoľnú rodinu<br>" +
                    "a zveľaďuj ju novým dorastom; -<br>" +
                    "daj, aby všetci členovia nášho spoločenstva<br>" +
                    "nažívali v dokonalej láske<br>" +
                    "a úspešne pracovali na spáse ľudí.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Presvätý Otče, <font color='#B71C1C'>*</font><br>" +
                    "milostivo prijmi naše obetné dary<br>" +
                    "a vyslyš naše prosby za tých,<br>" +
                    "čo chcú s radosťou nasledovať tvojho Syna<br>" +
                    "po úzkej ceste rehoľného života; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby v rehoľnom spoločenstve našli<br>" +
                    "úprimnú bratskú lásku<br>" +
                    "a opravdivú slobodu ducha.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "posilnení sviatostným pokrmom<br>" +
                    "prosíme ťa za všetkých rehoľníkov, <font color='#B71C1C'>—</font><br>" +
                    "aby verne žili podľa evanjeliovej dokonalosti,<br>" +
                    "a tak boli pred ľuďmi<br>" +
                    "živým obrazom tvojho Syna, Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo (v rehoľných komunitách):</font><br>" +
                    "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "touto vznešenou sviatosťou daruj nám silu<br>" +
                    "verne a oddane ti slúžiť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pred svetom svedčili o tvojej láske<br>" +
                    "a predovšetkým vyhľadávali nehynúce hodnoty.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"73", "1", "Na poďakovanie Pánu Bohu 1.", "Milosrdný Bože,<br>" +
                    "ty sa zľutúvaš nad svojimi služobníkmi,<br>" +
                    "keď sú v tiesni,<br>" +
                    "a vždy vyslyšíš ich prosby; <font color='#B71C1C'>*</font><br>" +
                    "ďakujeme ti za tvoje dobrodenia a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "chráň nás i naďalej od každého zla,<br>" +
                    "aby sme ti stále slúžili s radostným srdcom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože, dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "ty si poslal svojho Syna, aby nás oslobodil<br>" +
                    "od večnej smrti a od každého zla; <font color='#B71C1C'>—</font><br>" +
                    "prijmi obetu, ktorú ti prinášame na poďakovanie<br>" +
                    "za tvoju pomoc v našich súženiach.<br>" +
                    "     <font color='#B71C1C'>(</font>za uzdravenie nášho brata <font color='#B71C1C'>M. -</font> našej sestry <font color='#B71C1C'>M.)</font><br>" +
                    "     <font color='#B71C1C'>(</font>za tvoju pomoc v našich podujatiach.<font color='#B71C1C'>)<br>" +
                    "     <font color='#B71C1C'>(</font>za tvoju pomoc v uplynulom roku.<font color='#B71C1C'>)</font><br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "sviatostným chlebom života<br>" +
                    "nás vyslobodzuješ z pút hriechov<br>" +
                    "a obnovuješ v nás duchovnú silu; <font color='#B71C1C'>—</font><br>" +
                    "daj nám milosť,<br>" +
                    "aby v nás stále rástla nádej na večnú slávu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"73", "2", "Na poďakovanie Pánu Bohu 2.", "Bože, dobrotivý Otče,<br>" +
                    "od teba pochádza všetko, čo máme a čo sme; <font color='#B71C1C'>*</font><br>" +
                    "osvieť našu myseľ, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v každom dare videli tvoju otcovskú lásku,<br>" +
                    "ďakovali ti z celého srdca<br>" +
                    "a milovali ťa zo všetkých síl.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "prinášame ti obetu chvály a vďaky<br>" +
                    "za prijaté dobrodenia <font color='#B71C1C'>*</font><br>" +
                    "a pokorne prosíme, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme na tvoju slávu užívali všetko,<br>" +
                    "čo si nám udelil bez našich zásluh.<br>" +
                    "Skrze Krista, nášho Pána.", "Milostivý Bože,<br>" +
                    "sviatostným pokrmom dal si nám účasť<br>" +
                    "na spásonosnej obete tvojho Syna,<br>" +
                    "ktorú sme slávili na poďakovanie; <font color='#B71C1C'>*</font><br>" +
                    "naplň nás silou a radosťou,<br>" +
                    "ktoré vyvierajú z tejto sviatosti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti slúžili s väčšou oddanosťou<br>" +
                    "a dosiahli od teba ďalšie dobrodenia.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"73", "3", "Na poďakovanie za úrodu", "Bože, dobrotivý Otče,<br>" +
                    "vo svojej prozreteľnosti sa staráš o človeka<br>" +
                    "a zveril si mu zem s celým jej bohatstvom; <font color='#B71C1C'>*</font><br>" +
                    "ďakujeme ti za tohoročnú úrodu a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám užívať tvoje dary<br>" +
                    "na chválu tvojho mena,<br>" +
                    "na udržanie nášho života<br>" +
                    "a v prospech spoločného dobra.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Láskavý Bože,<br>" +
                    "ďakujeme ti za úrodu našich polí<br>" +
                    "a za tvoju starostlivosť o nás; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby aj v našich srdciach dozrelo semeno milosti<br>" +
                    "a prejavovalo sa skutkami lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš,<br>" +
                    "uštedril si nám zemské plody,<br>" +
                    "z ktorých ti s vďačným srdcom<br>" +
                    "prinášame na obetu chlieb a víno; <font color='#B71C1C'>*</font><br>" +
                    "posväť ich a daj nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby aj v našich srdciach dozrelo ovocie,<br>" +
                    "ktoré bude trvať naveky.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "slávením Eucharistie<br>" +
                    "ďakovali sme ti za tohoročnú úrodu; <font color='#B71C1C'>—</font><br>" +
                    "ako ovocie tejto svätej obety<br>" +
                    "daruj nám večné dobrá svojho kráľovstva.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"74", "1", "Za zachovanie mieru a spravodlivosti 1.", "Spravodlivý Bože, ty si zjavil,<br>" +
                    "že šíritelia pokoja sa budú volať tvojimi synmi; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy a všade uplatňovali spravodlivosť,<br>" +
                    "ktorá jediná môže zaručiť trvalý a pravý pokoj.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Láskavý Bože,<br>" +
                    "všetci ľudia pochádzajú od teba<br>" +
                    "a ty sa o nich otcovsky staráš; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby žili v pokoji ako jedna rodina,<br>" +
                    "spojená úprimnou bratskou láskou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Otče,<br>" +
                    "pod sviatostnými znakmi chleba a vína,<br>" +
                    "ktoré naznačujú pokoj a jednotu,<br>" +
                    "slávime spasiteľnú obetu tvojho Syna,<br>" +
                    "Kráľa pokoja; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "nech táto obeta upevňuje svornosť<br>" +
                    "medzi všetkými tvojimi deťmi.<br>" +
                    "Skrze Krista, nášho Pána.", "Nebeský Otče,<br>" +
                    "posilnil si nás telom a krvou<br>" +
                    "svojho jednorodeného Syna; <font color='#B71C1C'>*</font><br>" +
                    "naplň nás duchom svojej lásky, <font color='#B71C1C'>—</font><br>" +
                    "aby sme upevňovali medzi ľuďmi pokoj,<br>" +
                    "ktorý nám zanechal Ježiš Kristus, náš Pán.<br>" +
                    "On s tebou žije a kraľuje na veky vekov."},
            {"74", "2", "Za zachovanie mieru a spravodlivosti 2.", "Všemohúci Bože,<br>" +
                    "ty si stvoril vesmír<br>" +
                    "a podľa tvojej vôle sa odvíjajú dejiny sveta; <font color='#B71C1C'>*</font><br>" +
                    "vyslyš naše prosby<br>" +
                    "a daruj našim časom trvalý pokoj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s radostným srdcom<br>" +
                    "mohli chváliť tvoje milosrdenstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, milovník a pôvodca pokoja,<br>" +
                    "svárlivý duch ťa nemôže chápať<br>" +
                    "a srdce plné nenávisti sa zatvára pred tebou; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby všetci, čo žijú svorne, vytrvali v dobrom, <font color='#B71C1C'>—</font><br>" +
                    "a tí, čo žijú v nepriateľstve,<br>" +
                    "nech sa zmieria a zabudnú na krivdy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov."},
            {"74", "3", "Za upevnenie rodín", "Dobrotivý Bože, v tebe má rodinné spoločenstvo<br>" +
                    "svoj pôvod a pevný základ; <font color='#B71C1C'>*</font><br>" +
                    "láskavo vypočuj naše prosby<br>" +
                    "a pomáhaj nám rásť vo vzájomnej láske<br>" +
                    "a v rodinných čnostiach<br>" +
                    "podľa príkladu Svätej rodiny, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dosiahli večnú blaženosť<br>" +
                    "v nebeskom domove.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "prinášame ti zmiernu obetu<br>" +
                    "a vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby si upevňoval naše rodiny v tvojej milosti<br>" +
                    "a v tvojom pokoji.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "ty nás posilňuješ pri sviatostnom stole; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám vytrvalo nasledovať<br>" +
                    "príklad Svätej rodiny, <font color='#B71C1C'>—</font><br>" +
                    "aby sme po útrapách tohto života<br>" +
                    "dosiahli večnú blaženosť v jej spoločenstve.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"75", "1", "V čase sejby 1.", "Bože, Pán sejby a žatvy,<br>" +
                    "zverujeme zemi osivo s dôverou v tvoju pomoc, <font color='#B71C1C'>*</font><br>" +
                    "lebo uznávame, že naša práca sama nestačí<br>" +
                    "a že ty jedine dávaš vzrast všetkému; <font color='#B71C1C'>—</font><br>" +
                    "požehnaj a rozmnož zasiate semená<br>" +
                    "a štedro doplň, čo nie je v našich silách.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože, opravdivý pôvodca zemských plodov<br>" +
                    "a jediný darca duchovných darov, <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, požehnaj našu prácu,<br>" +
                    "daruj nám hojné plody zeme<br>" +
                    "a napomáhaj aj náš duchovný rast, <font color='#B71C1C'>—</font><br>" +
                    "aby všetky dary, ktoré majú v tebe pôvod,<br>" +
                    "slúžili na tvoju slávu.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "", "Milosrdný Bože,<br>" +
                    "ty nás posilňuješ pri sviatostnom stole; <font color='#B71C1C'>*</font><br>" +
                    "napomáhaj i prácu našich rúk<br>" +
                    "a požehnaj naše siatiny, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mali obživu z bohatej úrody,<br>" +
                    "veď v tebe žijeme, hýbeme sa a sme.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"75", "2", "V čase sejby 2.", "Pane a Bože náš, milostivo požehnaj svoj ľud<br>" +
                    "a obdaruj naše polia hojnou úrodou; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme tvoje dary<br>" +
                    "užívali na česť tvojho mena<br>" +
                    "a boli ti za ne vždy povďační.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Štedrý Bože,<br>" +
                    "prinášame ti chlieb pripravený zo zŕn pšenice,<br>" +
                    "aby si ho premenil na telo svojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "vyslyš naše prosby<br>" +
                    "a požehnaj zrno, ktoré zverujeme zemi, <font color='#B71C1C'>—</font><br>" +
                    "aby vzklíčilo a prinieslo bohatú úrodu.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "obdar nás v každý čas plodmi zeme,<br>" +
                    "ktoré potrebujeme pre svoj život, <font color='#B71C1C'>*</font><br>" +
                    "a podporuj aj náš duchovný vzrast, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vo večnosti dosiahli tie dobrá,<br>" +
                    "ktorých záloh sme prijali v Oltárnej sviatosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"76", "1", "Za jednotu kresťanov 1.", "Všemohúci a večný Bože,<br>" +
                    "ty zjednocuješ rozdelených<br>" +
                    "a zjednotených zachovávaš vo svornosti; <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na všetkých,<br>" +
                    "ktorí veria v tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a keďže nás posvätil ten istý krst,<br>" +
                    "nech nás spája aj pravá viera a vzájomná láska.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Prosíme ťa, Bože,<br>" +
                    "milujúci otec všetkých ľudí, <font color='#B71C1C'>*</font><br>" +
                    "vylej na nás hojnú milosť svojho Ducha<br>" +
                    "a pomôž nám dôsledne žiť podľa kresťanskej viery,<br>" +
                    "ku ktorej si nás povolal, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pred ľuďmi vyznávali tvoju pravdu<br>" +
                    "a vytrvalo sa usilovali o jednotu všetkých veriacich<br>" +
                    "vo zväzku pokoja.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nekonečný Bože,<br>" +
                    "jedinou obetou tvojho Syna<br>" +
                    "utvoril si z nás svoj vyvolený ľud; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "udeľ nám vo svojej Cirkvi dar jednoty a pokoja.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože, *<br>" +
                    "toto sväté prijímanie,<br>" +
                    "ktoré je viditeľným znakom,<br>" +
                    "že tvoji veriaci sú spojení v tebe,<br>" +
                    "nech pomáha dosiahnuť aj jednotu<br>" +
                    "všetkých kresťanov v tvojej Cirkvi.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"76", "2", "Za jednotu kresťanov 2.","Všemohúci Otče,<br>" +
                    "ty si zjednotil rôzne národy<br>" +
                    "vo vyznávaní tvojho mena; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám ochotne<br>" +
                    "a nehatene plniť tvoju vôľu, <font color='#B71C1C'>—</font><br>" +
                    "aby ľud, ktorý si povolal do svojho kráľovstva,<br>" +
                    "bol jednotný vo viere a v činorodej láske.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože a Otče náš,<br>" +
                    "milostivo vyslyš prosby svojho ľudu <font color='#B71C1C'>*</font><br>" +
                    "a spoj srdcia všetkých veriacich<br>" +
                    "v spoločnom pokání<br>" +
                    "a v spoločnej oslave tvojho mena, <font color='#B71C1C'>—</font><br>" +
                    "aby prestalo rozdelenie kresťanov<br>" +
                    "a aby sme mohli v dokonalej jednote<br>" +
                    "ísť v ústrety tvojmu večnému kráľovstvu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "nábožne slávime pamiatku našej spásy<br>" +
                    "a pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "premeň naše obetné dary na sviatosť,<br>" +
                    "ktorá je znamením jednoty a putom lásky.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "pôsobením sviatostnej obety,<br>" +
                    "na ktorej sme sa zúčastnili,<br>" +
                    "naplň nás svojím Duchom <font color='#B71C1C'>—</font><br>" +
                    "a zjednoť v láske srdcia i mysle všetkých,<br>" +
                    "čo veria v teba.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"76", "3", "Za jednotu kresťanov 3.", "Nebeský Otče, <font color='#B71C1C'>*</font><br>" +
                    "milostivo zhliadni na svoj ľud<br>" +
                    "a zahrň ho darmi svojho Ducha) <font color='#B71C1C'>—</font><br>" +
                    "aby sme rástli v láske k pravde,<br>" +
                    "úprimne túžili po dokonalej jednote kresťanov<br>" +
                    "a účinne ju napomáhali.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Pane a Bože náš,<br>" +
                    "preukáž nám svoje milosrdenstvo<br>" +
                    "a mocou svojho Ducha odstráň<br>" +
                    "rozdelenie kresťanov, <font color='#B71C1C'>*</font><br>" +
                    "aby tvoja Cirkev jasnejšie žiarila ako viditeľný znak<br>" +
                    "tvojej prítomnosti medzi národmi <font color='#B71C1C'>—</font><br>" +
                    "a privádzala svet, osvietený Duchom Svätým,<br>" +
                    "k viere v Krista, ktorého si poslal.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "pôsobením tejto svätej obety<br>" +
                    "očisť nás od hriechov <font color='#B71C1C'>—</font><br>" +
                    "a zjednoť všetkých, ktorých spája jeden krst,<br>" +
                    "aby sme mohli spoločne sláviť Eucharistiu.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Otče,<br>" +
                    "prijali sme sviatosť tela a krvi tvojho Syna <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, obnov vo svojej Cirkvi dar svätosti, <font color='#B71C1C'>—</font><br>" +
                    "aby ti všetci, čo majú česť byť kresťanmi,<br>" +
                    "slúžili jednotní vo viere.<br>" +
                    "Skrze Krista, nášho Pána."},
    };

    String[][] prosbyFormular = {
            {"01a", "1", "Votívna omša 1.", "Bratia a sestry, ovocie Ducha Svätého je láska, radosť a pokoj. Prosme Pána Ježiša, aby nás naplnil týmito darmi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, nech sa tvoja Cirkev v Duchu Svätom stále obnovuje a omladzuje.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, nech národy oslavujú teba, svojho Kráľa, a nech hovoria rečou lásky a sily tvojho Ducha.<br>" +
                            "<font color='#B71C1C'>3.</font> Odstráň z našej krajiny pohoršenia a všetko, čo škodí ľudu na tele i na duši.<br>" +
                            "<font color='#B71C1C'>4.</font> Ochraňuj všetky nenarodené deti, aby raz mohli uzrieť svetlo tohto sveta a prijať ťa za svojho Vykupiteľa a Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Zjednocuj rozpadávajúce sa rodiny a manželstvá, aby podľa príkladu jednoty Najsvätejšej Trojice túžili po spoločenstve lásky a pokoja.<br>" +
                            "<font color='#B71C1C'>6.</font> Daj, nech v nás prebýva Duch Svätý, aby nás neprestajne posväcoval a naše smrteľné telá pripravil na slávne vzkriesenie.<br>" +
                            "<font color='#B71C1C'>7.</font> Priveď našich zosnulých <font color='#B71C1C'>(M.)</font> do svojho nebeského kráľovstva.",
                    "Pane Ježišu, daj, nech nás vedie Boží Duch,<br>" +
                            "aby sme žili ako Boží synovia a dcéry<br>" +
                            "a skrze tvojho Ducha<br>" +
                            "čoraz lepšie poznali teba i Otca.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"01a", "2", "Votívna omša 2.", "Bratia a sestry, ovocie Ducha Svätého je láska, radosť a pokoj. Prosme Pána Ježiša, aby nás naplnil týmito darmi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, nech sa tvoja Cirkev v Duchu Svätom stále obnovuje a omladzuje.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, nech národy oslavujú teba, svojho Kráľa, a nech hovoria rečou lásky a sily tvojho Ducha.<br>" +
                            "<font color='#B71C1C'>3.</font> Odstráň z našej krajiny pohoršenia a všetko, čo škodí ľudu na tele i na duši.<br>" +
                            "<font color='#B71C1C'>4.</font> Ochraňuj všetky nenarodené deti, aby raz mohli uzrieť svetlo tohto sveta a prijať ťa za svojho Vykupiteľa a Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Zjednocuj rozpadávajúce sa rodiny a manželstvá, aby podľa príkladu jednoty Najsvätejšej Trojice túžili po spoločenstve lásky a pokoja.<br>" +
                            "<font color='#B71C1C'>6.</font> Daj, nech v nás prebýva Duch Svätý, aby nás neprestajne posväcoval a naše smrteľné telá pripravil na slávne vzkriesenie.<br>" +
                            "<font color='#B71C1C'>7.</font> Priveď našich zosnulých <font color='#B71C1C'>(M.)</font> do svojho nebeského kráľovstva.",
                    "Pane Ježišu, daj, nech nás vedie Boží Duch,<br>" +
                            "aby sme žili ako Boží synovia a dcéry<br>" +
                            "a skrze tvojho Ducha<br>" +
                            "čoraz lepšie poznali teba i Otca.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"01a", "3", "Votívna omša 3.", "Bratia a sestry, ovocie Ducha Svätého je láska, radosť a pokoj. Prosme Pána Ježiša, aby nás naplnil týmito darmi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, nech sa tvoja Cirkev v Duchu Svätom stále obnovuje a omladzuje.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, nech národy oslavujú teba, svojho Kráľa, a nech hovoria rečou lásky a sily tvojho Ducha.<br>" +
                            "<font color='#B71C1C'>3.</font> Odstráň z našej krajiny pohoršenia a všetko, čo škodí ľudu na tele i na duši.<br>" +
                            "<font color='#B71C1C'>4.</font> Ochraňuj všetky nenarodené deti, aby raz mohli uzrieť svetlo tohto sveta a prijať ťa za svojho Vykupiteľa a Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Zjednocuj rozpadávajúce sa rodiny a manželstvá, aby podľa príkladu jednoty Najsvätejšej Trojice túžili po spoločenstve lásky a pokoja.<br>" +
                            "<font color='#B71C1C'>6.</font> Daj, nech v nás prebýva Duch Svätý, aby nás neprestajne posväcoval a naše smrteľné telá pripravil na slávne vzkriesenie.<br>" +
                            "<font color='#B71C1C'>7.</font> Priveď našich zosnulých <font color='#B71C1C'>(M.)</font> do svojho nebeského kráľovstva.",
                    "Pane Ježišu, daj, nech nás vedie Boží Duch,<br>" +
                            "aby sme žili ako Boží synovia a dcéry<br>" +
                            "a skrze tvojho Ducha<br>" +
                            "čoraz lepšie poznali teba i Otca.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"01A", "1", "Zoslanie Ducha Svätého <font color='#B71C1C'>(</font>rok A<font color='#B71C1C'>)</font>", "Bratia a sestry, Pánov Duch, ktorého sme očakávali a vzývali, zostupuje dnes na Cirkev, aby aj v našich časoch urobil veľké divy Turíc. Prosme Pána, aby uštedril Cirkvi i celému svetu dary svojho Ducha.",
                    "<font color='#B71C1C'>(</font>Volajme: Obnov nás, Pane, a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, daruj Cirkvi misionárskeho ducha, ktorý posilňoval prvých kresťanov niesť evanjelium až do končín zeme.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, zjednoť svojím Duchom všetkých pokrstených a daj, aby všetci veriaci boli jedno srdce a jedna duša.<br>" +
                            "<font color='#B71C1C'>3.</font> Svetlom svojho Ducha osvieť všetkých ľudí, aby sa nenávisť zmenila na lásku, bolesť na radosť a vojny na vytúžený mier.<br>" +
                            "<font color='#B71C1C'>4.</font> Svojím Duchom posilňuj všetkých, ktorí milujú pravdu, trpia pre spravodlivosť a bojujú za slobodu a pokoj.<br>" +
                            "<font color='#B71C1C'>5.</font> Zošli na nás svojho Ducha, aby sme svojím kresťanským životom všade vydávali svedectvo o Kristovi.",
                    "Bože, ty si zoslal Ducha Svätého na odpustenie hriechov<br>" +
                            "a na udržanie a vzrast tvojho života v nás;<br>" +
                            "naplň naše srdcia darmi svojho Ducha<br>" +
                            "a zapáľ v nás oheň svojej lásky.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"01B", "1", "Zoslanie Ducha Svätého <font color='#B71C1C'>(</font>rok B<font color='#B71C1C'>)</font>", "Bratia a sestry, dobrorečme Otcovi, ktorý vylial na všetky národy milosť Ducha Svätého, a pokorne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, daj, aby Cirkev v sile Ducha Svätého vždy verne hlásala Božie kráľovstvo celému svetu.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, udeľ svoje požehnanie a vytrvalosť v povolaní bohoslovcom a diakonom, ktorí sa pripravujú na kňazstvo.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, daj, aby všetci veriaci boli otvorení pravde a darom, ktoré udeľuje Duch Svätý.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, zošli svojho Ducha, svetlo sŕdc, aby upevnil kolísavých vo viere.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, splň nádej zosnulých <font color='#B71C1C'>(M.)</font>, aby pri druhom Kristovom príchode dosiahli slávu vzkriesenia.",
                    "Nekonečný Bože,<br>" +
                            "oslávením Ježiša Krista a zoslaním Ducha Svätého<br>" +
                            "otvoril si nám bránu večného života;<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "aby nám prijatie tohto veľkého daru<br>" +
                            "pomáhalo rásť vo viere a oddane ti slúžiť.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"01C", "1", "Zoslanie Ducha Svätého <font color='#B71C1C'>(</font>rok C<font color='#B71C1C'>)</font>", "Bratia a sestry, dnes, keď sa završuje päťdesiatdňové Veľkonočné obdobie, nechajme sa viesť Božím Duchom a s dôverou prosme Pána.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, večná láska, prosíme ťa za pápeža <font color='#B71C1C'>M.</font> a zbor biskupov, odmeň ich vernosť apoštolskému učeniu.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, večná láska, prosíme ťa za všetkých pokrstených, daruj im pevnú vieru, nádej a lásku.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, večná láska, prosíme ťa za všetkých pobirmovaných, pomáhaj im svedčiť o zmŕtvychvstalom Kristovi.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, večná láska, prosíme ťa za celý svet, obnovuj a napĺňaj ho Duchom Svätým.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, večná láska, prosíme ťa za všetkých hľadajúcich, dávaj im odvahu nachádzať pravdu.<br>" +
                            "<font color='#B71C1C'>6.</font> Bože, večná láska, prosíme ťa za našu farskú rodinu, posilňuj nás vo vernosti evanjeliu.<br>" +
                            "<font color='#B71C1C'>7.</font> Bože, večná láska, prosíme ťa za našich zosnulých <font color='#B71C1C'>(M.)</font>, daruj im radosť vo svojom kráľovstve.",
                    "Bože, prameň všetkého dobra,<br>" +
                            "prenikni milosťou Ducha Svätého každé ľudské srdce<br>" +
                            "a obnov celú zem,<br>" +
                            "aby všetko tvorstvo chválilo teba, nášho Stvoriteľa.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"02", "1", "Najsvätejšieho Srdca Ježišovho", ""},
            {"03", "1", "Votívna omša o Najsvätejšom Srdci Ježišovom", ""},
            {"04", "1", "Výročie posviacky chrámu (slávenie mimo chrámu)", "Bratia a sestry, sme živými kameňmi chrámu, ktorým je Cirkev. V jednote a nádeji sa spoločne modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, postavenú zo živých kameňov, aby sa zveľaďovala vo viere a láske.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za kresťanov, aby nezabúdali, že plná účasť na omši sa dosahuje v obetnej hostine.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za všetkých ľudí, aby počuli hlas, ktorý ich volá do Pánovho domu, a vážili si duchovné hodnoty.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa, aby všetci spoznali, že chrám je domom modlitby.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa aj za seba, aby sme sa tešili, že chrám je domom Božím a bránou do neba.",
                    "Pane a Bože náš,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomáhaj nám budovať duchovný chrám,<br>" +
                            "ktorý je postavený na základoch dôvery v teba.<br>" +
                            "Skrze Krista, nášho Pána."},

            // SPOLOCNE OMSE PREBLAHOSLAVENEJ PANNY MÁRIE
            {"11", "1", "Omša k preblahoslavenej Panne Marií 1.", "Bratia a sestry, Panna Mária je veľkým vzorom nášho života v pokore, modlitbe a plnení Božej vôle. V tejto spoločnej modlitbe na jej orodovanie prosme nášho najmilostivejšieho Pána.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, požehnávaj Svätého Otca <font color='#B71C1C'>M.</font> a našich biskupov, kňazov a diakonov, aby tak ako Panna Mária vždy ochotne plnili tvoju vôľu.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, ochraňuj všetky národy a ich predstavených, aby tak ako Panna Mária vždy zotrvávali v tvojej prítomnosti a žili podľa tvojich príkazov.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, posilňuj všetkých trpiacich a núdznych, aby tak ako Panna Mária vedeli s pokorou znášať svoju bolesť a oddane ti slúžiť.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, veď všetkých kresťanov, aby tak ako Panna Mária ochotne počúvali Pánove slová a uchovávali ich vo svojich srdciach.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, zachovaj náš národ v jednote a svornosti, aby tak ako Panna Mária, naša patrónka, svorne kráčal v ústrety večnému nebeskému kráľovstvu.<br>" +
                            "<font color='#B71C1C'>6.</font> Otče, stoj pri všetkých umierajúcich, aby tak ako Panna Mária s čistou dušou raz predstúpili pred tvoju tvár.",
                    "Dobrotivý Otče, vypočuj naše prosby,<br>" +
                            "ktorými voláme k tebe<br>" +
                            "a utiekame sa pod ochranu Panny Márie,<br>" +
                            "aby sme sa stále zdokonaľovali na ceste života<br>" +
                            "a pripravovali sa na stretnutie s tebou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "2", "Omša k preblahoslavenej Panne Marií 2.", "Bratia a sestry, sme zhromaždení na slávení Eucharistie, kde je prítomný živý Kristus, ktorý nás miluje spolu so svojou Matkou. Ona nám ho pomáha bližšie spoznať ako Božieho Syna a nášho Pána. S radosťou sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, svoju matku si nekonečne miloval; daj, aby cirkevní predstavení celým srdcom milovali svojich veriacich a viedli ich k poznaniu pravej lásky.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, svoju matku si synovsky poslúchal; daj, aby zákonodarcovia tvorili zákony a nariadenia, ktoré budú slúžiť pre dobro a blaho všetkých.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, svoju matku si s úctou obdivoval; daj, aby deti prijímali svojich rodičov s rešpektom a vážili si ich rodičovskú obetavosť a výchovné rady.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, svoju matku si nikdy neopustil; daj, aby sme vždy pamätali na tvoje vykupiteľské dielo, ktoré si podstúpil pre našu spásu.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, svoju matku si vzal k sebe do neba; daj, aby sme sa raz stali hodni prežívať s tebou večnú blaženosť.",
                    "Prosíme ťa, Pane Ježišu,<br>" +
                            "nech naše modlitby plné vrúcnosti preniknú k tebe;<br>" +
                            "posilni nás vo vytrvalosti stále sa modliť,<br>" +
                            "ako sa modlila tvoja najdrahšia Matka.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"11", "3", "Omša k preblahoslavenej Panne Marií 3.", "Bratia a sestry, v nebi máme svoju Matku, ktorú vzývame ako kráľovnú a našu orodovníčku. S dôverou v jej príhovor sa pri spoločnej modlitbe obráťme na nebeského Otca. ",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Cirkev: aby prijala fatimskú výzvu na pokánie a odpovedala na ňu konkrétnymi skutkami.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za politikov na celom svete: aby pochopili, že pravý rozvoj krajín a národov je možný iba v mieri a úcte ku každému človeku.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za tvorcov zákonov v európskych krajinách: aby prijali skutočnosť, že Boh nás stvoril ako mužov a ženy, a aby podporovali rodiny posvätené sviatosťou manželstva.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za pútnikov, ktorí putujú do mariánskych svätýň, aby pocítili ochranu Panny Márie a túžili tak ako ona v pokore plniť Pánovu vôľu.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za seba samých, aby sme si každý deň našli primeraný čas na modlitbu, ktorou sa zverujeme Bohu a odovzdávame mu celý svoj život.",
                    "Všemohúci Bože, <br>" +
                            "tvoje Slovo naplnilo Máriino srdce<br>" +
                            "a bolo posilou jej svätého života;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme sa svojou vierou, pokorou a dôverou<br>" +
                            "podobali Panne Márii,<br>" +
                            "a tak zakúsili v živote veľké znamenia tvojej lásky.<br>" +
                            "Skrze Krista, nášho Pána."},
            // 4 – iba v adventnom obdobi
            {"12", "1", "Omša k preblahoslavenej Panne Marií", ""},
            // 5 – iba v vianocnom obdobi
            {"13", "1", "Omša k preblahoslavenej Panne Marií", ""},
            // 6 – iba v velkonocnom obdobi
            {"14", "1", "Nepoškvrneného Srdca Panny Márie", ""},
            //marianske formulare
            {"15", "1", "Preblahoslavená Panna Mária vyvolený potomok Izraela", ""},
            {"15", "2", "Preblahoslavená Panna Mária pri Zvestovaní Pána", ""},
            {"15", "3", "Navštívenie Preblahoslavenej Panny Márie", ""},
            {"16", "1", "Nepoškvrneného Srdca Panny Márie", ""},
            // SPOLOCNE OMSE MUCENIKOV
            // omsa viacerých muceníkov mimo velkonocneho obdobia
            {"21", "1", "Omša za viacerých mučeníkov 1.", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4. Na sviatky panny mučenice:</font> Za všetky dievčatá a panny: aby na príhovor svätej mučenice <font color='#B71C1C'>M.</font> chránili svoje panenstvo a odolávali pokušeniam klamlivých a konzumných trendov dnešnej doby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.<font color='#B71C1C'>)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "2", "Omša za viacerých mučeníkov 2.", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4. Na sviatky panny mučenice:</font> Za všetky dievčatá a panny: aby na príhovor svätej mučenice <font color='#B71C1C'>M.</font> chránili svoje panenstvo a odolávali pokušeniam klamlivých a konzumných trendov dnešnej doby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.<font color='#B71C1C'>)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "3", "Omša za viacerých mučeníkov 3.", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4. Na sviatky panny mučenice:</font> Za všetky dievčatá a panny: aby na príhovor svätej mučenice <font color='#B71C1C'>M.</font> chránili svoje panenstvo a odolávali pokušeniam klamlivých a konzumných trendov dnešnej doby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.<font color='#B71C1C'>)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "4", "Omša za viacerých mučeníkov 4.", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4. Na sviatky panny mučenice:</font> Za všetky dievčatá a panny: aby na príhovor svätej mučenice <font color='#B71C1C'>M.</font> chránili svoje panenstvo a odolávali pokušeniam klamlivých a konzumných trendov dnešnej doby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.<font color='#B71C1C'>)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "5", "Omša za viacerých mučeníkov 5.", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4. Na sviatky panny mučenice:</font> Za všetky dievčatá a panny: aby na príhovor svätej mučenice <font color='#B71C1C'>M.</font> chránili svoje panenstvo a odolávali pokušeniam klamlivých a konzumných trendov dnešnej doby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.<font color='#B71C1C'>)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa jedneho muceníka mimo velkonocneho obdobia
            {"22", "1", "Omša za jedného mučeníka 1.", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "2", "Omša za jedného mučeníka 2.", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.<font color='#B71C1C'>)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa viacerých muceníkov vo velkonocnom obdobi
            {"23", "1", "Omša za viacerých mučeníkov 1.", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4. Na sviatky panny mučenice:</font> Za všetky dievčatá a panny: aby na príhovor svätej mučenice <font color='#B71C1C'>M.</font> chránili svoje panenstvo a odolávali pokušeniam klamlivých a konzumných trendov dnešnej doby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.<font color='#B71C1C'>)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "2", "Omša za viacerých mučeníkov 2.", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4. Na sviatky panny mučenice:</font> Za všetky dievčatá a panny: aby na príhovor svätej mučenice <font color='#B71C1C'>M.</font> chránili svoje panenstvo a odolávali pokušeniam klamlivých a konzumných trendov dnešnej doby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.<font color='#B71C1C'>)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
// omsa jedného muceníka vo velkonocnom obdobi
            {"24", "1", "Omša za jedného mučeníka", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.<font color='#B71C1C'>)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o mucenikoch misionaroch
            {"25", "1", "Omša o mučeníkoch misionároch", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.<font color='#B71C1C'>)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o panne mucenici
            {"26", "1", "Omša o panne mučenici 1.", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za všetky dievčatá a panny: aby na príhovor svätej mučenice <font color='#B71C1C'>M.</font> chránili svoje panenstvo a odolávali pokušeniam klamlivých a konzumných trendov dnešnej doby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.<font color='#B71C1C'>)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"26", "2", "Omša o panne mučenici 2.", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za všetky dievčatá a panny: aby na príhovor svätej mučenice <font color='#B71C1C'>M.</font> chránili svoje panenstvo a odolávali pokušeniam klamlivých a konzumných trendov dnešnej doby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.<font color='#B71C1C'>)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o svatej zene mucenici
            {"27", "1", "Omša o svätej žene mučenici 1.", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.<font color='#B71C1C'>)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"27", "2", "Omša o svätej žene mučenici 2.", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.<font color='#B71C1C'>)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            // SPOLOCNE OMSE DUCHOVNYCH PASTIEROVSPOLOCNE OMSE DUCHOVNYCH PASTIEROV,
            // omsa o papezoch alebo biskupov
            {"31", "1", "Omša o pápežoch alebo biskupoch 1.", "Bratia a sestry, spolu s celou Cirkvou prednesme svoje prosby všemohúcemu Bohu, Pánovi neba i zeme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Svätého Otca <font color='#B71C1C'>M.</font>, aby s pomocou a vnuknutím Ducha Svätého viedol Cirkev horlivo a múdro.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za vedúcich predstaviteľov štátov, aby pri vykonávaní svojho úradu mali na zreteli, že ich úlohou je slúžiť ľuďom a viesť ich s rozvahou a svedomito.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za nadriadených v zamestnaní, aby s úctou pristupovali k svojim zamestnancom a boli im príkladom v plnení povinností.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za všetok kresťanský ľud, aby verne a s dôverou počúval radostnú zvesť evanjelia a modlitbami sa zapájal do života putujúcej Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za zosnulých <font color='#B71C1C'>(M.)</font>, aby mali účasť na večnom živote a na radosti v oslávenej Cirkvi.",
                    "Bože, na príhovor Petrovho nástupcu,<br>" +
                            "svätého pápeža <font color='#B71C1C'>M.</font>,<br>" +
                            "prijmi naše modlitby,<br>" +
                            "v ktorých prosíme o tvoje zmilovanie,<br>" +
                            "zhliadni na nás a posilňuj nás v našom živote.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "2", "Omša o pápežoch alebo biskupoch 2.", "Bratia a sestry, spolu s celou Cirkvou prednesme svoje prosby všemohúcemu Bohu, Pánovi neba i zeme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Svätého Otca <font color='#B71C1C'>M.</font>, aby s pomocou a vnuknutím Ducha Svätého viedol Cirkev horlivo a múdro.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za vedúcich predstaviteľov štátov, aby pri vykonávaní svojho úradu mali na zreteli, že ich úlohou je slúžiť ľuďom a viesť ich s rozvahou a svedomito.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za nadriadených v zamestnaní, aby s úctou pristupovali k svojim zamestnancom a boli im príkladom v plnení povinností.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za všetok kresťanský ľud, aby verne a s dôverou počúval radostnú zvesť evanjelia a modlitbami sa zapájal do života putujúcej Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za zosnulých <font color='#B71C1C'>(M.)</font>, aby mali účasť na večnom živote a na radosti v oslávenej Cirkvi.",
                    "Bože, na príhovor Petrovho nástupcu,<br>" +
                            "svätého pápeža <font color='#B71C1C'>M.</font>,<br>" +
                            "prijmi naše modlitby,<br>" +
                            "v ktorých prosíme o tvoje zmilovanie,<br>" +
                            "zhliadni na nás a posilňuj nás v našom živote.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o biskupoch
            {"32", "1", "Omša o biskupoch 1.", "Bratia a sestry, obráťme sa s prosbami na nášho nebeského Otca, ktorý nás nekonečne miluje.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Stvoriteľ sveta, zachovaj vo svojej milosti rímskeho biskupa, pápeža <font color='#B71C1C'>M.</font>, a všetkých biskupov, aby boli príkladom v nábožnosti a v konaní dobrých skutkov.<br>" +
                            "<font color='#B71C1C'>2.</font> Najmocnejší vládca, osvecuj mysle i srdcia všetkých, ktorí spravujú národy, aby boli svedomití vo vykonávaní povinností a vytrvalí v úsilí o dôstojnosť života.<br>" +
                            "<font color='#B71C1C'>3.</font> Tešiteľ núdznych, na príhovor svätého biskupa <font color='#B71C1C'>M.</font> ochraňuj všetkých, ktorí trpia na tele alebo na duši, aby vo svojich bratoch a sestrách našli hmotnú pomoc a duchovné zázemie.<br>" +
                            "<font color='#B71C1C'>4.</font> Nekonečná dobrota, zhromažďuj nás ako jednu rodinu v spoločenstve miestnej cirkvi, aby sa nik z nás necítil osamelý a opustený.<br>" +
                            "<font color='#B71C1C'>5.</font> Spravodlivý sudca, vezmi do svojej otcovskej náruče všetkých, ktorí už opustili tento svet, odpusť im viny a daruj im večnú radosť.",
                    "Bože, ty posielaš biskupov<br>" +
                            "ako pastierov svojho ľudu;<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a pomáhaj nám v jednote s naším biskupom<br>" +
                            "budovať svätú a apoštolskú Cirkev.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"32", "2", "Omša o biskupoch 2.", "Bratia a sestry, obráťme sa s prosbami na nášho nebeského Otca, ktorý nás nekonečne miluje.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Stvoriteľ sveta, zachovaj vo svojej milosti rímskeho biskupa, pápeža <font color='#B71C1C'>M.</font>, a všetkých biskupov, aby boli príkladom v nábožnosti a v konaní dobrých skutkov.<br>" +
                            "<font color='#B71C1C'>2.</font> Najmocnejší vládca, osvecuj mysle i srdcia všetkých, ktorí spravujú národy, aby boli svedomití vo vykonávaní povinností a vytrvalí v úsilí o dôstojnosť života.<br>" +
                            "<font color='#B71C1C'>3.</font> Tešiteľ núdznych, na príhovor svätého biskupa <font color='#B71C1C'>M.</font> ochraňuj všetkých, ktorí trpia na tele alebo na duši, aby vo svojich bratoch a sestrách našli hmotnú pomoc a duchovné zázemie.<br>" +
                            "<font color='#B71C1C'>4.</font> Nekonečná dobrota, zhromažďuj nás ako jednu rodinu v spoločenstve miestnej cirkvi, aby sa nik z nás necítil osamelý a opustený.<br>" +
                            "<font color='#B71C1C'>5.</font> Spravodlivý sudca, vezmi do svojej otcovskej náruče všetkých, ktorí už opustili tento svet, odpusť im viny a daruj im večnú radosť.",
                    "Bože, ty posielaš biskupov<br>" +
                            "ako pastierov svojho ľudu;<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a pomáhaj nám v jednote s naším biskupom<br>" +
                            "budovať svätú a apoštolskú Cirkev.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o duchovnych pastieroch
            {"33", "1", "Omša o duchovných pastieroch 1.", "Bratia a sestry, ďakujme Bohu, že posiela svojmu ľudu kňazov, služobníkov oltára, medzi ktorých patril aj svätý kňaz <font color='#B71C1C'>M.</font>, a s oddanosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa za kňazov, aby prostredníctvom nich veriaci vzrastali vo viere, nábožnosti a v hlbokom prežívaní tajomstva Eucharistie.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, prosíme ťa za svetských predstaviteľov, aby pamätali na spoločné dobro občanov a mali úprimný záujem o riešenie konfliktov a sporov.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, prosíme ťa za nedbalých a povrchných kresťanov, aby našli cestu k sviatosti zmierenia, ktorú vysluhujú kňazi vo farnostiach.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, prosíme ťa za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme mali vytrvalosť modliť sa za nášho duchovného otca a vyprosovali mu milosť a požehnanie pri plnení jeho povinností.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prosíme ťa za duše v očistci, zotri ich previnenia, ktorými ťa zarmucovali, odpusť im hriechy a obdaruj ich svojím otcovským prijatím.",
                    "Otče, na príhovor svätého kňaza <font color='#B71C1C'>M.</font><br>" +
                            "prijmi naše prosby a daj,<br>" +
                            "aby sme raz so srdcom naplneným láskou<br>" +
                            "uvideli v nebi večného veľkňaza, tvojho Syna Ježiša Krista,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"33", "2", "Omša o duchovných pastieroch 2.", "Bratia a sestry, ďakujme Bohu, že posiela svojmu ľudu kňazov, služobníkov oltára, medzi ktorých patril aj svätý kňaz <font color='#B71C1C'>M.</font>, a s oddanosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa za kňazov, aby prostredníctvom nich veriaci vzrastali vo viere, nábožnosti a v hlbokom prežívaní tajomstva Eucharistie.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, prosíme ťa za svetských predstaviteľov, aby pamätali na spoločné dobro občanov a mali úprimný záujem o riešenie konfliktov a sporov.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, prosíme ťa za nedbalých a povrchných kresťanov, aby našli cestu k sviatosti zmierenia, ktorú vysluhujú kňazi vo farnostiach.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, prosíme ťa za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme mali vytrvalosť modliť sa za nášho duchovného otca a vyprosovali mu milosť a požehnanie pri plnení jeho povinností.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prosíme ťa za duše v očistci, zotri ich previnenia, ktorými ťa zarmucovali, odpusť im hriechy a obdaruj ich svojím otcovským prijatím.",
                    "Otče, na príhovor svätého kňaza <font color='#B71C1C'>M.</font><br>" +
                            "prijmi naše prosby a daj,<br>" +
                            "aby sme raz so srdcom naplneným láskou<br>" +
                            "uvideli v nebi večného veľkňaza, tvojho Syna Ježiša Krista,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"33", "3", "Omša o duchovných pastieroch 3.", "Bratia a sestry, ďakujme Bohu, že posiela svojmu ľudu kňazov, služobníkov oltára, medzi ktorých patril aj svätý kňaz <font color='#B71C1C'>M.</font>, a s oddanosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa za kňazov, aby prostredníctvom nich veriaci vzrastali vo viere, nábožnosti a v hlbokom prežívaní tajomstva Eucharistie.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, prosíme ťa za svetských predstaviteľov, aby pamätali na spoločné dobro občanov a mali úprimný záujem o riešenie konfliktov a sporov.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, prosíme ťa za nedbalých a povrchných kresťanov, aby našli cestu k sviatosti zmierenia, ktorú vysluhujú kňazi vo farnostiach.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, prosíme ťa za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme mali vytrvalosť modliť sa za nášho duchovného otca a vyprosovali mu milosť a požehnanie pri plnení jeho povinností.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prosíme ťa za duše v očistci, zotri ich previnenia, ktorými ťa zarmucovali, odpusť im hriechy a obdaruj ich svojím otcovským prijatím.",
                    "Otče, na príhovor svätého kňaza <font color='#B71C1C'>M.</font><br>" +
                            "prijmi naše prosby a daj,<br>" +
                            "aby sme raz so srdcom naplneným láskou<br>" +
                            "uvideli v nebi večného veľkňaza, tvojho Syna Ježiša Krista,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            // omsa o zakladateloch miestych cirkvi
            {"34", "1", "Omša o zakladateľoch miestnych cirkví 1.", "Bratia a sestry, svätý <font color='#B71C1C'>(</font>svätá<font color='#B71C1C'>)</font> M.</font> nám svojím životom ukázal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font>, ako priniesť svedectvo o zmŕtvychvstalom Kristovi. Nasledujme ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> a obráťme sa s modlitbami k Bohu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za tých, ktorí spravujú Cirkev a rehoľné komunity, aby vzbudzovali v srdciach mladých ľudí túžbu po duchovnom povolaní.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za predstaviteľov štátnej moci, aby sa, posilnení duchom múdrosti, usilovali o zachovávanie mieru a dodržiavanie spravodlivosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za nezamestnaných, aby mali príležitosť nájsť si nové zamestnanie a s dôverou v Božiu pomoc hľadali možnosti svojho osobného a pracovného naplnenia.<br>" +
                            "<font color='#B71C1C'>4.</font> <font color='#B71C1C'>za rehole:</font> Prosme za rehoľu <font color='#B71C1C'>M.</font>, aby mala obetavých predstavených <font color='#B71C1C'>(</font>obetavé predstavené<font color='#B71C1C'>)</font>, ktorí <font color='#B71C1C'>(</font>ktoré<font color='#B71C1C'>)</font> počúvaním Božieho slova a konaním skutkov lásky privedú svojich spolubratov <font color='#B71C1C'>(</font>svoje spolusestry<font color='#B71C1C'>)</font> k hlbokej a úprimnej nábožnosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za zosnulých <font color='#B71C1C'>(M.)</font>, aby sa nové nebo a nová zem nebeského kráľovstva stali ich večným domovom.",
                    "Bože, ďakujeme za dielo, ktoré vykonal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> svätý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>)</font> M.</font>,<br>" +
                            "a prosíme ťa: vypočuj naše prosby,<br>" +
                            "povzbudzuj nás podľa jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> príkladu<br>" +
                            "stať sa novými ľuďmi, objavovať svetlo radosti<br>" +
                            "a rozdávať lásku všade, kde sa nachádzame.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"34", "2", "Omša o zakladateľoch miestnych cirkví 2.", "Bratia a sestry, svätý <font color='#B71C1C'>(</font>svätá<font color='#B71C1C'>)</font> M.</font> nám svojím životom ukázal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font>, ako priniesť svedectvo o zmŕtvychvstalom Kristovi. Nasledujme ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> a obráťme sa s modlitbami k Bohu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za tých, ktorí spravujú Cirkev a rehoľné komunity, aby vzbudzovali v srdciach mladých ľudí túžbu po duchovnom povolaní.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za predstaviteľov štátnej moci, aby sa, posilnení duchom múdrosti, usilovali o zachovávanie mieru a dodržiavanie spravodlivosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za nezamestnaných, aby mali príležitosť nájsť si nové zamestnanie a s dôverou v Božiu pomoc hľadali možnosti svojho osobného a pracovného naplnenia.<br>" +
                            "<font color='#B71C1C'>4.</font> <font color='#B71C1C'>za rehole:</font> Prosme za rehoľu <font color='#B71C1C'>M.</font>, aby mala obetavých predstavených <font color='#B71C1C'>(</font>obetavé predstavené<font color='#B71C1C'>)</font>, ktorí <font color='#B71C1C'>(</font>ktoré<font color='#B71C1C'>)</font> počúvaním Božieho slova a konaním skutkov lásky privedú svojich spolubratov <font color='#B71C1C'>(</font>svoje spolusestry<font color='#B71C1C'>)</font> k hlbokej a úprimnej nábožnosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za zosnulých <font color='#B71C1C'>(M.)</font>, aby sa nové nebo a nová zem nebeského kráľovstva stali ich večným domovom.",
                    "Bože, ďakujeme za dielo, ktoré vykonal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> svätý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>)</font> M.</font>,<br>" +
                            "a prosíme ťa: vypočuj naše prosby,<br>" +
                            "povzbudzuj nás podľa jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> príkladu<br>" +
                            "stať sa novými ľuďmi, objavovať svetlo radosti<br>" +
                            "a rozdávať lásku všade, kde sa nachádzame.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o misionaroch
            {"35", "1", "Omša o misionároch 1.", "Bratia a sestry, Kristovo učenie sa hlása po celom svete. Prednesme mu svoje prosby ako prejav prijatia jeho náuky a túžby po Božom kráľovstve.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, ty si s láskou viedol zástupy; pomáhaj biskupom a kňazom odvážne roznecovať vo veriacich túžbu po poznávaní tajomstiev viery.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, ty si dal apoštolom kľúče od nebeského kráľovstva; upevňuj predstaviteľov vládnej moci v ochote viesť národy k vzájomnému porozumeniu.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, ty si obdivuhodne a víťazne znášal utrpenie; povzbudzuj chorých a trpiacich sužovaných bolesťou, aby mali novú nádej a prísľub večnosti, kde niet trápenia ani zármutku.<br>" +
                            "<font color='#B71C1C'>4a.</font> Ježišu, ty si vzorom odvahy a obety; podľa príkladu svätého misionára <font color='#B71C1C'>M.</font> nám dodávaj silu šíriť tvoje evanjelium v našich rodinách a domovoch.<br>" +
                            "<font color='#B71C1C'>4b. mučeník misionár:</font> Ježišu, ty si svojou obetou na kríži ukázal svetu najväčší skutok lásky; na príhovor svätého misionára a mučeníka <font color='#B71C1C'>M.</font> dodávaj silu a odvahu všetkým trpiacim pre vieru.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, ty si zvíťazil nad smrťou; prijmi k sebe zosnulých <font color='#B71C1C'>(M.)</font>, ktorí úprimne velebili tvoje meno.",
                    "Pane Ježišu, láskavo vypočuj naše prosby<br>" +
                            "a posilňuj nás v ohlasovaní radostnej zvesti<br>" +
                            "v srdciach svojich blížnych.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"35", "2", "Omša o misionároch 2.", "Bratia a sestry, Kristovo učenie sa hlása po celom svete. Prednesme mu svoje prosby ako prejav prijatia jeho náuky a túžby po Božom kráľovstve.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, ty si s láskou viedol zástupy; pomáhaj biskupom a kňazom odvážne roznecovať vo veriacich túžbu po poznávaní tajomstiev viery.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, ty si dal apoštolom kľúče od nebeského kráľovstva; upevňuj predstaviteľov vládnej moci v ochote viesť národy k vzájomnému porozumeniu.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, ty si obdivuhodne a víťazne znášal utrpenie; povzbudzuj chorých a trpiacich sužovaných bolesťou, aby mali novú nádej a prísľub večnosti, kde niet trápenia ani zármutku.<br>" +
                            "4a. Ježišu, ty si vzorom odvahy a obety; podľa príkladu svätého misionára <font color='#B71C1C'>M.</font> nám dodávaj silu šíriť tvoje evanjelium v našich rodinách a domovoch.<br>" +
                            "4b. <font color='#B71C1C'>mučeník misionár:</font> Ježišu, ty si svojou obetou na kríži ukázal svetu najväčší skutok lásky; na príhovor svätého misionára a mučeníka <font color='#B71C1C'>M.</font> dodávaj silu a odvahu všetkým trpiacim pre vieru.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, ty si zvíťazil nad smrťou; prijmi k sebe zosnulých <font color='#B71C1C'>(M.)</font>, ktorí úprimne velebili tvoje meno.",
                    "Pane Ježišu, láskavo vypočuj naše prosby<br>" +
                            "a posilňuj nás v ohlasovaní radostnej zvesti<br>" +
                            "v srdciach svojich blížnych.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"35", "3", "Omša o misionároch 3.", "Bratia a sestry, Kristovo učenie sa hlása po celom svete. Prednesme mu svoje prosby ako prejav prijatia jeho náuky a túžby po Božom kráľovstve.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, ty si s láskou viedol zástupy; pomáhaj biskupom a kňazom odvážne roznecovať vo veriacich túžbu po poznávaní tajomstiev viery.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, ty si dal apoštolom kľúče od nebeského kráľovstva; upevňuj predstaviteľov vládnej moci v ochote viesť národy k vzájomnému porozumeniu.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, ty si obdivuhodne a víťazne znášal utrpenie; povzbudzuj chorých a trpiacich sužovaných bolesťou, aby mali novú nádej a prísľub večnosti, kde niet trápenia ani zármutku.<br>" +
                            "4a. Ježišu, ty si vzorom odvahy a obety; podľa príkladu svätého misionára <font color='#B71C1C'>M.</font> nám dodávaj silu šíriť tvoje evanjelium v našich rodinách a domovoch.<br>" +
                            "4b. <font color='#B71C1C'>mučeník misionár:</font> Ježišu, ty si svojou obetou na kríži ukázal svetu najväčší skutok lásky; na príhovor svätého misionára a mučeníka <font color='#B71C1C'>M.</font> dodávaj silu a odvahu všetkým trpiacim pre vieru.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, ty si zvíťazil nad smrťou; prijmi k sebe zosnulých <font color='#B71C1C'>(M.)</font>, ktorí úprimne velebili tvoje meno.",
                    "Pane Ježišu, láskavo vypočuj naše prosby<br>" +
                            "a posilňuj nás v ohlasovaní radostnej zvesti<br>" +
                            "v srdciach svojich blížnych.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            // SPOLOCNE OMSE UCITELOV CIRKVI
            {"4", "1", "Omša o učiteľoch Cirkvi 1.", "Bratia a sestry, s úctou prijímame učenie Cirkvi a čerpáme múdrosť z náuky významných svätcov, akým bol<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> aj svätý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>) M.</font> Prosme nebeského Otca, aby duch poznania stále viac prenikal do našich sŕdc.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa za celú Cirkev: aby prostredníctvom svojich oddaných služobníkov rástla na ceste poznania a hlbšie prenikala do tajomstiev viery.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, prosíme ťa za tých, ktorí tvoria svetské zákony: aby mali dostatočné vedomosti a životné skúsenosti a aj sami žili podľa zákonov, ktoré vytvárajú.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, prosíme ťa za učiteľov teológie: aby vzbudzovali vo svojich študentoch túžbu po hlbšom a osobnom poznaní teba.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, prosíme ťa za seba samých: aby sme sa stávali stále lepšími učeníkmi tvojho Syna, nášho najväčšieho učiteľa, a riadili sa jeho prikázaniami.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prosíme ťa za tých, ktorí už prekročili prah pozemského života: zjav sa im v plnosti svojej nádhery a obdaruj ich prežívaním večnej blaženosti.",
                    "Bože, tvoja všemohúcnosť preniká do hĺbky našich duší;<br>" +
                            "prosíme ťa, prijmi a vypočuj naše modlitby,<br>" +
                            "aby sme smerovali k naplneniu nášho života<br>" +
                            "v tvojom kráľovstve.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"4", "2", "Omša o učiteľoch Cirkvi 2.", "Bratia a sestry, s úctou prijímame učenie Cirkvi a čerpáme múdrosť z náuky významných svätcov, akým bol<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> aj svätý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>) M.</font> Prosme nebeského Otca, aby duch poznania stále viac prenikal do našich sŕdc.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa za celú Cirkev: aby prostredníctvom svojich oddaných služobníkov rástla na ceste poznania a hlbšie prenikala do tajomstiev viery.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, prosíme ťa za tých, ktorí tvoria svetské zákony: aby mali dostatočné vedomosti a životné skúsenosti a aj sami žili podľa zákonov, ktoré vytvárajú.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, prosíme ťa za učiteľov teológie: aby vzbudzovali vo svojich študentoch túžbu po hlbšom a osobnom poznaní teba.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, prosíme ťa za seba samých: aby sme sa stávali stále lepšími učeníkmi tvojho Syna, nášho najväčšieho učiteľa, a riadili sa jeho prikázaniami.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prosíme ťa za tých, ktorí už prekročili prah pozemského života: zjav sa im v plnosti svojej nádhery a obdaruj ich prežívaním večnej blaženosti.",
                    "Bože, tvoja všemohúcnosť preniká do hĺbky našich duší;<br>" +
                            "prosíme ťa, prijmi a vypočuj naše modlitby,<br>" +
                            "aby sme smerovali k naplneniu nášho života<br>" +
                            "v tvojom kráľovstve.<br>" +
                            "Skrze Krista, nášho Pána."},
            // SPOLOCNE OMSE PANNIEN
            {"51", "1", "Omša o pannách 1.", "Bratia a sestry, svätá <font color='#B71C1C'>M.</font> svojím panenstvom ukázala svetu príklad života v čistote duše i tela. S pokorou pozdvihnime k Bohu svoje prosby",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za spovedníkov: aby pri vysluhovaní sviatosti zmierenia povzbudzovali veriacich k premene života a k ochotnému nasledovaniu Kristovho príkladu lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za predstaviteľov štátov: aby ich srdcia neboli zasiahnuté zlobou tohto sveta, ale aby z nich vyžaroval vnútorný pokoj a morálna istota, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za týrané ženy: aby sa nedali zlomiť násilím a ponižovaním a aby sa v srdciach tých, ktorí im ubližujú, rozhorel oheň túžby po náprave spáchaných krívd a po očistení svojho vnútra, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za mladých: aby si chránili svoju čistotu a panenstvo ako vzácnu perlu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby v nebi uvideli najčistejšieho Božieho Baránka, prosme Pána.",
                    "Bože, na príklade života svätých panien nás učíš,<br>" +
                            "ako kráčať na ceste k večnosti;<br>" +
                            "vypočuj naše modlitby a daruj nám čisté srdcia,<br>" +
                            "aby sme boli hodni večnej blaženosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"51", "2", "Omša o pannách 2.", "Bratia a sestry, svätá <font color='#B71C1C'>M.</font> svojím panenstvom ukázala svetu príklad života v čistote duše i tela. S pokorou pozdvihnime k Bohu svoje prosby",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za spovedníkov: aby pri vysluhovaní sviatosti zmierenia povzbudzovali veriacich k premene života a k ochotnému nasledovaniu Kristovho príkladu lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za predstaviteľov štátov: aby ich srdcia neboli zasiahnuté zlobou tohto sveta, ale aby z nich vyžaroval vnútorný pokoj a morálna istota, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za týrané ženy: aby sa nedali zlomiť násilím a ponižovaním a aby sa v srdciach tých, ktorí im ubližujú, rozhorel oheň túžby po náprave spáchaných krívd a po očistení svojho vnútra, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za mladých: aby si chránili svoju čistotu a panenstvo ako vzácnu perlu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby v nebi uvideli najčistejšieho Božieho Baránka, prosme Pána.",
                    "Bože, na príklade života svätých panien nás učíš,<br>" +
                            "ako kráčať na ceste k večnosti;<br>" +
                            "vypočuj naše modlitby a daruj nám čisté srdcia,<br>" +
                            "aby sme boli hodni večnej blaženosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"51", "3", "Omša o pannách 3.", "Bratia a sestry, svätá <font color='#B71C1C'>M.</font> svojím panenstvom ukázala svetu príklad života v čistote duše i tela. S pokorou pozdvihnime k Bohu svoje prosby",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za spovedníkov: aby pri vysluhovaní sviatosti zmierenia povzbudzovali veriacich k premene života a k ochotnému nasledovaniu Kristovho príkladu lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za predstaviteľov štátov: aby ich srdcia neboli zasiahnuté zlobou tohto sveta, ale aby z nich vyžaroval vnútorný pokoj a morálna istota, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za týrané ženy: aby sa nedali zlomiť násilím a ponižovaním a aby sa v srdciach tých, ktorí im ubližujú, rozhorel oheň túžby po náprave spáchaných krívd a po očistení svojho vnútra, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za mladých: aby si chránili svoju čistotu a panenstvo ako vzácnu perlu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby v nebi uvideli najčistejšieho Božieho Baránka, prosme Pána.",
                    "Bože, na príklade života svätých panien nás učíš,<br>" +
                            "ako kráčať na ceste k večnosti;<br>" +
                            "vypočuj naše modlitby a daruj nám čisté srdcia,<br>" +
                            "aby sme boli hodni večnej blaženosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o viacerych pannach
            {"52", "1", "Omša o viacerých pannách", "Bratia a sestry, svätá <font color='#B71C1C'>M.</font> svojím panenstvom ukázala svetu príklad života v čistote duše i tela. S pokorou pozdvihnime k Bohu svoje prosby",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za spovedníkov: aby pri vysluhovaní sviatosti zmierenia povzbudzovali veriacich k premene života a k ochotnému nasledovaniu Kristovho príkladu lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za predstaviteľov štátov: aby ich srdcia neboli zasiahnuté zlobou tohto sveta, ale aby z nich vyžaroval vnútorný pokoj a morálna istota, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za týrané ženy: aby sa nedali zlomiť násilím a ponižovaním a aby sa v srdciach tých, ktorí im ubližujú, rozhorel oheň túžby po náprave spáchaných krívd a po očistení svojho vnútra, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za mladých: aby si chránili svoju čistotu a panenstvo ako vzácnu perlu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby v nebi uvideli najčistejšieho Božieho Baránka, prosme Pána.",
                    "Bože, na príklade života svätých panien nás učíš,<br>" +
                            "ako kráčať na ceste k večnosti;<br>" +
                            "vypočuj naše modlitby a daruj nám čisté srdcia,<br>" +
                            "aby sme boli hodni večnej blaženosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            // SPOLOCNE OMSE SVATYCH MUZOV a SVATYCH ZIEN
            {"61", "1", "Omša o svätých mužoch a svätých ženách 1.", "Bratia a sestry, Pán Ježiš je vzorom svätosti a mnohí ho s vierou nasledovali. Prosme ho, aby na príhovor svätého <font color='#B71C1C'>M.</font> vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, zachovaj cirkevných predstavených vo svojej milosti, aby boli neustále naplnení tvojím Svätým Duchom.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, zjav tým, ktorí spravujú štáty, že aj v takejto náročnej službe je možné kráčať cestou svätosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, pomáhaj všetkým otcom vytrvalo a ochotne plniť svoje otcovské povinnosti a s obetavou láskou sa starať o svoju rodinu.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, ochraňuj nás od nástrah zlého ducha a od svetských pokušení a pretváraj nás na obraz oddaných Božích detí.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, udeľ našim zosnulým <font color='#B71C1C'>(M.)</font> večné odpočinutie so všetkými svätými v tvojej nebeskej sláve.",
                    "Kriste, náš Pán a kráľ,<br>" +
                            "prijmi a vypočuj naše modlitby,<br>" +
                            "ktoré ti s pokorou predkladáme,<br>" +
                            "daruj nám duchovnú radosť a nadšenie<br>" +
                            "nasledovať tvojich verných a svätých služobníkov.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"61", "2", "Omša o svätých mužoch a svätých ženách 2.", "Bratia a sestry, Pán Ježiš je vzorom svätosti a mnohí ho s vierou nasledovali. Prosme ho, aby na príhovor svätého <font color='#B71C1C'>M.</font> vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, zachovaj cirkevných predstavených vo svojej milosti, aby boli neustále naplnení tvojím Svätým Duchom.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, zjav tým, ktorí spravujú štáty, že aj v takejto náročnej službe je možné kráčať cestou svätosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, pomáhaj všetkým otcom vytrvalo a ochotne plniť svoje otcovské povinnosti a s obetavou láskou sa starať o svoju rodinu.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, ochraňuj nás od nástrah zlého ducha a od svetských pokušení a pretváraj nás na obraz oddaných Božích detí.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, udeľ našim zosnulým <font color='#B71C1C'>(M.)</font> večné odpočinutie so všetkými svätými v tvojej nebeskej sláve.",
                    "Kriste, náš Pán a kráľ,<br>" +
                            "prijmi a vypočuj naše modlitby,<br>" +
                            "ktoré ti s pokorou predkladáme,<br>" +
                            "daruj nám duchovnú radosť a nadšenie<br>" +
                            "nasledovať tvojich verných a svätých služobníkov.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"61", "3", "Omša o svätých mužoch a svätých ženách 3.", "Bratia a sestry, Pán Ježiš je vzorom svätosti a mnohí ho s vierou nasledovali. Prosme ho, aby na príhovor svätého <font color='#B71C1C'>M.</font> vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, zachovaj cirkevných predstavených vo svojej milosti, aby boli neustále naplnení tvojím Svätým Duchom.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, zjav tým, ktorí spravujú štáty, že aj v takejto náročnej službe je možné kráčať cestou svätosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, pomáhaj všetkým otcom vytrvalo a ochotne plniť svoje otcovské povinnosti a s obetavou láskou sa starať o svoju rodinu.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, ochraňuj nás od nástrah zlého ducha a od svetských pokušení a pretváraj nás na obraz oddaných Božích detí.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, udeľ našim zosnulým <font color='#B71C1C'>(M.)</font> večné odpočinutie so všetkými svätými v tvojej nebeskej sláve.",
                    "Kriste, náš Pán a kráľ,<br>" +
                            "prijmi a vypočuj naše modlitby,<br>" +
                            "ktoré ti s pokorou predkladáme,<br>" +
                            "daruj nám duchovnú radosť a nadšenie<br>" +
                            "nasledovať tvojich verných a svätých služobníkov.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"61", "4", "Omša o svätých mužoch a svätých ženách 4.", "Bratia a sestry, Pán Ježiš je vzorom svätosti a mnohí ho s vierou nasledovali. Prosme ho, aby na príhovor svätého <font color='#B71C1C'>M.</font> vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, zachovaj cirkevných predstavených vo svojej milosti, aby boli neustále naplnení tvojím Svätým Duchom.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, zjav tým, ktorí spravujú štáty, že aj v takejto náročnej službe je možné kráčať cestou svätosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, pomáhaj všetkým otcom vytrvalo a ochotne plniť svoje otcovské povinnosti a s obetavou láskou sa starať o svoju rodinu.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, ochraňuj nás od nástrah zlého ducha a od svetských pokušení a pretváraj nás na obraz oddaných Božích detí.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, udeľ našim zosnulým <font color='#B71C1C'>(M.)</font> večné odpočinutie so všetkými svätými v tvojej nebeskej sláve.",
                    "Kriste, náš Pán a kráľ,<br>" +
                            "prijmi a vypočuj naše modlitby,<br>" +
                            "ktoré ti s pokorou predkladáme,<br>" +
                            "daruj nám duchovnú radosť a nadšenie<br>" +
                            "nasledovať tvojich verných a svätých služobníkov.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"61", "5", "Omša o svätých mužoch a svätých ženách 5.", "Bratia a sestry, Pán Ježiš je vzorom svätosti a mnohí ho s vierou nasledovali. Prosme ho, aby na príhovor svätého <font color='#B71C1C'>M.</font> vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, zachovaj cirkevných predstavených vo svojej milosti, aby boli neustále naplnení tvojím Svätým Duchom.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, zjav tým, ktorí spravujú štáty, že aj v takejto náročnej službe je možné kráčať cestou svätosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, pomáhaj všetkým otcom vytrvalo a ochotne plniť svoje otcovské povinnosti a s obetavou láskou sa starať o svoju rodinu.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, ochraňuj nás od nástrah zlého ducha a od svetských pokušení a pretváraj nás na obraz oddaných Božích detí.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, udeľ našim zosnulým <font color='#B71C1C'>(M.)</font> večné odpočinutie so všetkými svätými v tvojej nebeskej sláve.",
                    "Kriste, náš Pán a kráľ,<br>" +
                            "prijmi a vypočuj naše modlitby,<br>" +
                            "ktoré ti s pokorou predkladáme,<br>" +
                            "daruj nám duchovnú radosť a nadšenie<br>" +
                            "nasledovať tvojich verných a svätých služobníkov.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"61", "6", "Omša o svätých mužoch a svätých ženách 6.", "Bratia a sestry, Pán Ježiš je vzorom svätosti a mnohí ho s vierou nasledovali. Prosme ho, aby na príhovor svätého <font color='#B71C1C'>M.</font> vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, zachovaj cirkevných predstavených vo svojej milosti, aby boli neustále naplnení tvojím Svätým Duchom.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, zjav tým, ktorí spravujú štáty, že aj v takejto náročnej službe je možné kráčať cestou svätosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, pomáhaj všetkým otcom vytrvalo a ochotne plniť svoje otcovské povinnosti a s obetavou láskou sa starať o svoju rodinu.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, ochraňuj nás od nástrah zlého ducha a od svetských pokušení a pretváraj nás na obraz oddaných Božích detí.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, udeľ našim zosnulým <font color='#B71C1C'>(M.)</font> večné odpočinutie so všetkými svätými v tvojej nebeskej sláve.",
                    "Kriste, náš Pán a kráľ,<br>" +
                            "prijmi a vypočuj naše modlitby,<br>" +
                            "ktoré ti s pokorou predkladáme,<br>" +
                            "daruj nám duchovnú radosť a nadšenie<br>" +
                            "nasledovať tvojich verných a svätých služobníkov.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            // omsa o reholnikoch
            {"62", "1", "Omša o rehoľníkoch 1.", "Bratia a sestry, svätý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>) M.</font> získal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> korunu víťazstva za svoj príkladný život v rehoľnom spoločenstve. Na jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> príhovor prosme nášho dobrotivého Boha Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože Otče, milostivo sprevádzaj predstavených rehoľných spoločenstiev a všetkých biskupov, kňazov a diakonov, aby v sile Ducha Svätého prinášali svojim blížnym svetlo viery a nádej.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože Otče, starostlivo ochraňuj vedúcich predstaviteľov štátov, aby boli príkladom v zachovávaní zákonov a vážili si morálne hodnoty.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože Otče, láskavo obdaruj všetkých členov reholí svojou pomocou a milosťou, aby zvládli náročné životné poslanie v každodennom živote v rehoľnom spoločenstve.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože Otče, bedlivo stoj pri nás a posilňuj naše srdcia v modlitbách za rehoľníkov a rehoľníčky, aby sme sa inšpirovali svedectvom ich zasväteného života.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože Otče, prijmi k sebe zosnulých <font color='#B71C1C'>(M.)</font>, ktorí nás predišli do večnosti, a daruj im radosť a plnosť nebeského života.",
                    "Bože, prosíme ťa,<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a urob nás súcimi kráčať po ceste svätosti<br>" +
                            "v ústrety tebe a tvojmu Synovi,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"62", "2", "Omša o rehoľníkoch 2.", "Bratia a sestry, svätý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>) M.</font> získal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> korunu víťazstva za svoj príkladný život v rehoľnom spoločenstve. Na jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> príhovor prosme nášho dobrotivého Boha Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože Otče, milostivo sprevádzaj predstavených rehoľných spoločenstiev a všetkých biskupov, kňazov a diakonov, aby v sile Ducha Svätého prinášali svojim blížnym svetlo viery a nádej.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože Otče, starostlivo ochraňuj vedúcich predstaviteľov štátov, aby boli príkladom v zachovávaní zákonov a vážili si morálne hodnoty.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože Otče, láskavo obdaruj všetkých členov reholí svojou pomocou a milosťou, aby zvládli náročné životné poslanie v každodennom živote v rehoľnom spoločenstve.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože Otče, bedlivo stoj pri nás a posilňuj naše srdcia v modlitbách za rehoľníkov a rehoľníčky, aby sme sa inšpirovali svedectvom ich zasväteného života.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože Otče, prijmi k sebe zosnulých <font color='#B71C1C'>(M.)</font>, ktorí nás predišli do večnosti, a daruj im radosť a plnosť nebeského života.",
                    "Bože, prosíme ťa,<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a urob nás súcimi kráčať po ceste svätosti<br>" +
                            "v ústrety tebe a tvojmu Synovi,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            // omsa o tych, co konali skutky milosrdensta
            {"63", "1", "Omša o tých, čo konali skutky milosrdenstva", "Bratia a sestry, náš Boh osobitne miluje tých, ktorí konajú skutky milosrdenstva. Povzbudení príkladom svätého <font color='#B71C1C'>(</font>svätej<font color='#B71C1C'>) M.</font> prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa za nášho biskupa <font color='#B71C1C'>M.</font>, aby bol svojim veriacim vzorom starostlivosti o tých, ktorí najviac potrebujú pomoc blížnych.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, prosíme ťa za tých, ktorí spravujú štáty, aby pamätali na zodpovedné plnenie svojich úloh a zvláštnu pozornosť venovali chudobným, slabým a trpiacim.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, prosíme ťa za opatrovateľov a ošetrovateľov starých, nevládnych a chorých ľudí, aby im uľahčovali niesť bremeno utrpenia vo svetle Kristovho kríža.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, prosíme ťa za seba samých, aby sme sa ochotne vedeli zriekať hmotného bohatstva v prospech chudobných a núdznych.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, prosíme ťa za duše v očistci, aby dosiahli plnosť tvojho milosrdenstva a radosť nebeského príbytku.",
                    "Otče, náš láskavý stvoriteľ,<br>" +
                            "dovoľ nám čerpať z tvojej nekonečnej milosti;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomáhaj nám prostredníctvom konania dobrých skutkov<br>" +
                            "dôjsť k tvojej večnej a nehynúcej láske.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o vychovavateloch
            {"64", "1", "Omša o vychovávateľoch", "Bratia a sestry, vo svätom <font color='#B71C1C'>(</font>svätej<font color='#B71C1C'>) M.</font> vidíme nádherný príklad starostlivosti o výchovu detí <font color='#B71C1C'>(</font>a mládeže<font color='#B71C1C'>)</font>. Povzbudení jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> skutkami obráťme sa s prosbami k Božiemu Synovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, ty si dokonale naplnil Otcovu vôľu vykúpiť svet; stoj pri všetkých služobníkoch Cirkvi, aby viedli svojich veriacich k dobrote a poslušnosti príkazu lásky.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, ty si múdro a starostlivo učil zástupy; daj, aby tí, ktorí nás spravujú, mali na zreteli dobro celej spoločnosti a pamätali aj na ďalšie generácie.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, ty si osobitne miloval deti; roznecuj v pedagógoch a vychovávateľoch úsilie privádzať deti a mládež k poznaniu pravých hodnôt a k vzájomnej úcte.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, ty si nám zjavil mnohé pravdy v podobenstvách; daj, aby sme svojím životom vydávali svedectvo o tebe všetkým, ktorí sú nám zverení.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, ty si slávne vstal z mŕtvych; vysloboď našich zosnulých <font color='#B71C1C'>(M.)</font> z pút smrti, odpusť im viny a voveď ich do večného života.",
                    "Pane Ježišu, prijmi naše modlitby,<br>" +
                            "vychovávaj nás svojím slovom na ceste života,<br>" +
                            "aby sme raz ako Božie deti<br>" +
                            "stáli s čistým srdcom pred tebou, naším učiteľom.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            // omsa o svatych zenach
            {"65", "1", "Omša o svätých ženách 1.", "Bratia a sestry, Božia láska a vznešenosť sa prejavujú v mnohých skutkoch svätých žien, medzi ktorými si spomíname aj na svätú <font color='#B71C1C'>M.</font> Prosme Pána, aby vo svojej dobrote zhliadol na naše modlitby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, ty sa staráš o všetkých ľudí; ochraňuj Svätého Otca <font color='#B71C1C'>M.</font>, aby svojím životom a náukou viedol tvoj ľud k tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, ty si určil ženám poslanie napĺňať svet nežnou a materinskou láskou; daj, aby ženy, ktoré stoja na čele štátov, pamätali na túto obdivuhodnú úlohu.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, ty si najdokonalejšie zjavil podstatu materstva v Panne Márii; pomáhaj všetkým budúcim matkám priviesť na svet zdravé deti.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, ty riadiš všetko a starostlivo nás chrániš; vzbudzuj v nás úctu ku všetkým matkám, aby sme si uvedomili veľkú hodnotu života.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, ty si poslal svojho Syna, aby zvíťazil nad smrťou; uveď našich zosnulých <font color='#B71C1C'>(M.)</font> do večného a víťazného prebývania s tebou v nebi.",
                    "Láskavý Otče,<br>" +
                            "prosíme ťa, vypočuj naše prosby,<br>" +
                            "privádzaj nás na cestu lásky a obety,<br>" +
                            "aby sme svoje poslanie plnili<br>" +
                            "až do posledného dňa nášho pozemského života.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"65", "2", "Omša o svätých ženách 2.", "Bratia a sestry, Božia láska a vznešenosť sa prejavujú v mnohých skutkoch svätých žien, medzi ktorými si spomíname aj na svätú <font color='#B71C1C'>M.</font> Prosme Pána, aby vo svojej dobrote zhliadol na naše modlitby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, ty sa staráš o všetkých ľudí; ochraňuj Svätého Otca <font color='#B71C1C'>M.</font>, aby svojím životom a náukou viedol tvoj ľud k tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, ty si určil ženám poslanie napĺňať svet nežnou a materinskou láskou; daj, aby ženy, ktoré stoja na čele štátov, pamätali na túto obdivuhodnú úlohu.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, ty si najdokonalejšie zjavil podstatu materstva v Panne Márii; pomáhaj všetkým budúcim matkám priviesť na svet zdravé deti.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, ty riadiš všetko a starostlivo nás chrániš; vzbudzuj v nás úctu ku všetkým matkám, aby sme si uvedomili veľkú hodnotu života.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, ty si poslal svojho Syna, aby zvíťazil nad smrťou; uveď našich zosnulých <font color='#B71C1C'>(M.)</font> do večného a víťazného prebývania s tebou v nebi.",
                    "Láskavý Otče,<br>" +
                            "prosíme ťa, vypočuj naše prosby,<br>" +
                            "privádzaj nás na cestu lásky a obety,<br>" +
                            "aby sme svoje poslanie plnili<br>" +
                            "až do posledného dňa nášho pozemského života.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"71", "1", "Za odpustenie hriechov", "Bratia a sestry, Pán je milostivý a milosrdný, zhovievavý a veľmi láskavý. Pokorne ho prosme o dar pokánia pre seba i pre všetkých hriešnikov.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosíme ťa, Pane, za svätú Cirkev: veď Kristus, tvoj Syn, vydal za ňu seba samého, aby ju posvätil a očistil.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa, Bože, za všetkých zákonodarcov: daj, aby zákonmi upevňovali mravnosť vo svete a chránili dôstojnosť človeka, stvoreného na tvoj obraz.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa, nebeský Otče, za márnotratných synov a dcéry, ktorí sú pre svoje hriechy ďaleko od teba: daj, aby povstali z hriechov a vrátili sa k tebe, svojmu Otcovi.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa, Pane, aj za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: daj, aby modlitbou a pokáním prispela k svätosti celej Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosím ťa, Bože, za všetkých zosnulých, ktorí pre svoje hriechy nevidia tvoju tvár: vo svojej nekonečnej láske im odpusť a priveď ich k sebe.",
                    "Dobrotivý Bože,<br>" +
                            "daj, aby sme lepšie chápali,<br>" +
                            "že sviatosť zmierenia je prameňom milosrdenstva<br>" +
                            "a stretnutím s Ježišom Kristom,<br>" +
                            "ktorý nás svojou krvou vykúpil z hriechov.<br>" +
                            "On žije a kraľuje na veky vekov."},
            {"71", "2", "Za dar lásky", "Bratia a sestry, zhromaždení v mene Ježiša Krista prosme nebeského Otca, aby bolo na svete vždy viac dobročinnej lásky.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Nebeský Otče, v Kristovom tajomnom tele – Cirkvi sme všetci navzájom bratmi a sestrami; daj, aby sme si navzájom preukazovali bratskú lásku podľa rozličných darov, ktoré sme dostali.<br>" +
                            "<font color='#B71C1C'>2.</font> Nebeský Otče, daj, aby sa ľudské pokolenie stalo Božou rodinou, kde vládne láska.<br>" +
                            "<font color='#B71C1C'>3.</font> Nebeský Otče, daj, aby si národy sveta odpúšťali a žili v mieri a pokoji.<br>" +
                            "<font color='#B71C1C'>4.</font> Nebeský Otče, daj, aby sa všetci hriešnici zmierili s tebou aj s tvojou Cirkvou, ktorej ublížili svojimi hriechmi.<br>" +
                            "<font color='#B71C1C'>5.</font> Nebeský Otče, daj, aby sa rozhnevané rodiny zmierili a žili v kresťanskej láske.<br>" +
                            "<font color='#B71C1C'>6.</font> Nebeský Otče, daj, aby sme vo svojich blížnych vždy videli Ježiša Krista, tvojho Syna, a s radosťou im slúžili.",
                    "Nebeský Otče, pomáhaj nám<br>" +
                            "a naplň naše srdcia úprimnou láskou,<br>" +
                            "aby sme teba milovali nadovšetko<br>" +
                            "a svojich blížnych ako seba samých,<br>" +
                            "veď nám dal príklad tvoj Syn Ježiš Kristus,<br>" +
                            "ktorý sa obetoval za nás na kríži.<br>" +
                            "On žije a kraľuje na veky vekov."},
            {"72a", "1", "Za jednotu kresťanov 1.", "Bratia a sestry, Kristus chce všetkých ľudí priviesť k spáse. Preto ho úprimne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, zdokonaľuj vo svojej láske všetkých biskupov a kňazov a svojim veriacim pomáhaj zachovať jednotu ducha vo zväzku pokoja.<br>" +
                            "<font color='#B71C1C'>2.</font> Zjednoť všetkých kresťanov, aby svet uveril, že ty si Kristus, Boží Syn.<br>" +
                            "<font color='#B71C1C'>3.</font> Pošli robotníkov na svoju žatvu, aby tvoje meno oslavovali všetky národy.<br>" +
                            "<font color='#B71C1C'>4.</font> Posilňuj všetkých trpiacich, aby svoje utrpenie obetovali za jednotu Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás odpúšťať tým, ktorí nám ubližujú, a modliť sa za nich.<br>" +
                            "<font color='#B71C1C'>6.</font> Milostivo stoj pri nás v hodine našej smrti, aby sme ti zostali verní a odišli z tohto sveta v tvojom pokoji.",
                    "Pane Ježišu,<br>" +
                            "ty si pre spásu ľudí rozpäl ruky na kríži;<br>" +
                            "daj, aby sa ti naše skutky páčili<br>" +
                            "a aby sme pred svetom vydávali svedectvo o tvojom vykúpení.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"72a", "2", "Za jednotu kresťanov 2.", "Bratia a sestry, Kristus chce všetkých ľudí priviesť k spáse. Preto ho úprimne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, zdokonaľuj vo svojej láske všetkých biskupov a kňazov a svojim veriacim pomáhaj zachovať jednotu ducha vo zväzku pokoja.<br>" +
                            "<font color='#B71C1C'>2.</font> Zjednoť všetkých kresťanov, aby svet uveril, že ty si Kristus, Boží Syn.<br>" +
                            "<font color='#B71C1C'>3.</font> Pošli robotníkov na svoju žatvu, aby tvoje meno oslavovali všetky národy.<br>" +
                            "<font color='#B71C1C'>4.</font> Posilňuj všetkých trpiacich, aby svoje utrpenie obetovali za jednotu Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás odpúšťať tým, ktorí nám ubližujú, a modliť sa za nich.<br>" +
                            "<font color='#B71C1C'>6.</font> Milostivo stoj pri nás v hodine našej smrti, aby sme ti zostali verní a odišli z tohto sveta v tvojom pokoji.",
                    "Pane Ježišu,<br>" +
                            "ty si pre spásu ľudí rozpäl ruky na kríži;<br>" +
                            "daj, aby sa ti naše skutky páčili<br>" +
                            "a aby sme pred svetom vydávali svedectvo o tvojom vykúpení.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"72a", "3", "Za jednotu kresťanov 3.", "Bratia a sestry, Kristus chce všetkých ľudí priviesť k spáse. Preto ho úprimne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, zdokonaľuj vo svojej láske všetkých biskupov a kňazov a svojim veriacim pomáhaj zachovať jednotu ducha vo zväzku pokoja.<br>" +
                            "<font color='#B71C1C'>2.</font> Zjednoť všetkých kresťanov, aby svet uveril, že ty si Kristus, Boží Syn.<br>" +
                            "<font color='#B71C1C'>3.</font> Pošli robotníkov na svoju žatvu, aby tvoje meno oslavovali všetky národy.<br>" +
                            "<font color='#B71C1C'>4.</font> Posilňuj všetkých trpiacich, aby svoje utrpenie obetovali za jednotu Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás odpúšťať tým, ktorí nám ubližujú, a modliť sa za nich.<br>" +
                            "<font color='#B71C1C'>6.</font> Milostivo stoj pri nás v hodine našej smrti, aby sme ti zostali verní a odišli z tohto sveta v tvojom pokoji.",
                    "Pane Ježišu,<br>" +
                            "ty si pre spásu ľudí rozpäl ruky na kríži;<br>" +
                            "daj, aby sa ti naše skutky páčili<br>" +
                            "a aby sme pred svetom vydávali svedectvo o tvojom vykúpení.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"72b", "4", "Za kňazské povolania", "Bratia a sestry, Pán Ježiš je stále prítomný vo svojej Cirkvi a svoje kňazstvo uskutočňuje prostredníctvom tých, ktorým dal sviatostnú účasť na svojom kňazstve. Prosme ho za kňazské povolania.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, pošli svojej Cirkvi statočných služobníkov oltára a verných hlásateľov tvojho slova.<br>" +
                            "<font color='#B71C1C'>2.</font> Rozšír evanjelium lásky a pokoja po celej zemi.<br>" +
                            "<font color='#B71C1C'>3.</font> Pomocou svojich kňazov zachráň hriešnikov pred večným trestom.<br>" +
                            "<font color='#B71C1C'>4.</font> Vlož do sŕdc kresťanských matiek a otcov túžbu vychovať kňaza pre tvoju Cirkev.<br>" +
                            "<font color='#B71C1C'>5.</font> Vštep do sŕdc mladých mužov veľkú túžbu stať sa tvojím kňazom.<br>" +
                            "<font color='#B71C1C'>6.</font> Žehnaj rodiny, otcov i matky, ktorí vychovali kňaza pre Katolícku cirkev.",
                    "Pane Ježišu,<br>" +
                            "ty si ustanovil katolícke kňazstvo,<br>" +
                            "aby si nám dokázal svoju nekonečnú lásku<br>" +
                            "a aby si prebýval medzi nami;<br>" +
                            "prijmi naše prosby<br>" +
                            "a daj nám kňazov podľa svojho Srdca,<br>" +
                            "lebo ty žiješ a kraľuješ na veky vekov.",
            "Alebo:",
                    "Za nové kňazské povolania", "Bratia a sestry, kňazi nám prinášajú na oltár živého Krista, preto vďaka nim môžeme mať účasť na stretnutí s naším Pánom. Modlime sa za nové povolania na kňazstvo a za celú Cirkev.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, stoj pri všetkých kňazoch svojej Cirkvi, aby prostredníctvom živého spojenia s Kristom boli príkladom pre nové kňazské povolania.<br>" +
                    "<font color='#B71C1C'>2.</font> Otče, posilňuj všetkých kňazov, ktorí sú svetskými zákonmi prenasledovaní alebo utláčaní, aby mali dostatok odvahy vydávať svedectvo o tvojej nekonečnej láske a odpustení.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, zjavuj svoju dobrotu v srdciach mladých mužov, aby sa medzi nimi našli takí, ktorí ti zasvätia celý svoj život.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, nauč nás ochotne prijímať dar povolania ku kňazstvu u svojich bratov a nerobiť im prekážky na ceste nasledovania Krista.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, poteš večnou radosťou našich zosnulých kňazov, ktorí opustili tento svet, a priveď ich do večnej blaženosti.",
                    "Pane a Bože náš,<br>" +
                            "ty odmeňuješ osobitnou milosťou všetkých,<br>" +
                            "ktorí sa ti zasvätili celým srdcom;<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a osvecuj mysle našich bratov,<br>" +
                            "ktorí túžia spojiť svoj život s Cirkvou<br>" +
                            "a byť jej oddanými duchovnými pastiermi.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"72b", "5", "Za duchovné povolania", "Bratia a sestry, pokorne prosme nášho veľkňaza Ježiša Krista, aby poslal horlivých robotníkov na svoju žatvu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, Syn živého Boha, prosíme ťa za nášho pápeža <font color='#B71C1C'>M.</font> a za nášho biskupa <font color='#B71C1C'>M.</font>: ochraňuj ich, posilňuj a posväcuj.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, svetlo národov, prosíme ťa za predstaviteľov národov: obdaruj ich duchom spravodlivosti a pokoja.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, Dobrý pastier, prosíme ťa za nášho duchovného otca a za všetkých kňazov: eucharistickou obetou ich zjednocuj so sebou a navzájom.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, pravda a život, prosíme ťa za tých, ktorí počuli tvoj hlas a nasledujú ťa: pomáhaj im, aby sa vedomosťami a čnostným životom dobre pripravili na zasvätený život.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, pravé svetlo, prosíme ťa za mladých ľudí: vlož im do sŕdc oheň Ducha Svätého, ktorý si zoslal z neba, a obdaruj mnohých duchovným povolaním.",
                    "Ježišu Kriste, najvyšší a večný kňaz,<br>" +
                            "daj, nech tvár tvojej Cirkvi<br>" +
                            "zažiari svätosťou kňazov a biskupov<br>" +
                            "a obohať ju novými duchovnými povolaniami,<br>" +
                            "aby bol dostatok robotníkov na tvojej žatve<br>" +
                            "na tvoju česť a slávu a pre spásu ľudí,<br>" +
                            "lebo ty žiješ a kraľuješ na veky vekov.",
            "Alebo:",
                    "Za nové duchovné povolania 1.",
                    "Bratia a sestry, každý z nás plní v živote určité poslanie. Modlime sa, aby Boh daroval svojim vyvoleným milosť Ducha Svätého, v ktorej môžu spoznať povolanie na duchovný život.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, povolaj tých, v ktorých máš zaľúbenie.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, veď všetkých služobníkov Cirkvi i členov reholí, aby svojím životom boli príkladom pre tých, ktorí chcú nasledovať Krista.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby na celom svete kandidáti na duchovnú službu dostali dobré teologické vzdelanie a duchovnú formáciu.<br>" +
                            "<font color='#B71C1C'>3.</font> Povzbudzuj všetkých kresťanov, aby mali v úcte svojich duchovných pastierov, modlili sa za nich a ochotne im pomáhali v pastoračnej službe.<br>" +
                            "<font color='#B71C1C'>4.</font> Stoj pri všetkých, ktorých si obdaroval duchovným povolaním, aby s tvojou pomocou prekonávali všetky prekážky na ceste zasvätenia.<br>" +
                            "<font color='#B71C1C'>5.</font> Pomáhaj nám prijať a rešpektovať rozhodnutie našich bratov a sestier, ktorí sa ti chcú zasvätiť v duchovnom povolaní.",
                    "Pane a Bože náš,<br>" +
                            "všetci sme tvoje deti,<br>" +
                            "ale niektorých si zvlášť vyvolil na duchovné povolanie;<br>" +
                            "vyslyš naše prosby<br>" +
                            "za týchto našich bratov a sestry a daj,<br>" +
                            "aby svojím životom posväcovali svet, v ktorom žijeme.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Alebo:",
                    "Za nové duchovné povolania 2.",
                    "Bratia a sestry, Pán Ježiš si povoláva tých, ktorých sám chce. Prosme, aby čím viacerí odpovedali na jeho pozvanie: Poď a nasleduj ma. Spoločne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daruj všetkým biskupom, kňazom a diakonom odvahu vydávať svedectvo o tebe a byť príkladom pre tých, ktorých voláš do svojej služby.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, osvecuj predstaviteľov štátov a zákonodarcov, aby vytvárali vhodné spoločenské podmienky pre tých, ktorí v sebe počujú hlas tvojho volania.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, stoj pri všetkých, ktorí sa rozhodli nasledovať ťa s nerozdeleným srdcom, a pomáhaj im nadšene pracovať na diele spásy.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, sprevádzaj naše kroky, aby sme sa vrúcne modlili za tvojich vyvolených služobníkov.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, prijmi zosnulých biskupov, kňazov a diakonov do spoločenstva svätých, aby dosiahli večnú radosť vo svetle tvojej lásky.",
                    "Ježišu Kriste, náš Spasiteľ a Vykupiteľ,<br>" +
                            "vrúcne ťa prosíme,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a starostlivo bdej nad celým svetom,<br>" +
                            "aby sa v ňom neustále rodili nové povolania<br>" +
                            "k duchovnému životu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"73", "1", "Na poďakovanie Pánu Bohu 1.", "Bratia a sestry, tešíme sa a ďakujeme nášmu nebeskému Otcovi, že zem vydala svoje plody na našu obživu. Zároveň ho prosme, aby sme oplývali dobrými skutkami a boli štedrí voči všetkým.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, ty si Cirkev zasadil ako šľachetnú vinicu; daj, aby sme vždy zostávali v Kristovi, pravom viniči, ktorý dáva život a plodnosť ratolestiam. <br>" +
                            "<font color='#B71C1C'>2.</font> Ty si dal zem do užívania všetkým ľuďom; daj, nech majú všetci radostnú účasť na stvorených dobrách.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, ty svojou dobrotou napĺňaš celý rok; nech rozmanitosť plodov a krása tvojich diel privedú k tebe tých, čo ťa hľadajú.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, ty si stvoril svet a my sa oň máme starať; požehnávaj ľudí pracujúcich na poliach a v záhradách, aby odmenou ich práce bola bohatá úroda.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, teba uráža nevďak a ľahostajnosť voči tvojim dobrodeniam; naplň naše srdcia vďačnosťou za všetky tvoje dary.",
                    "Nebeský Otče, s radosťou ti ďakujeme <br>" +
                            "za všetky tvoje dobrodenia, <br>" +
                            "za chlieb, za úrodu viníc a stromov <br>" +
                            "i za všetku zemskú úrodu, <br>" +
                            "a prosíme ťa, <br>" +
                            "aby sme nezabúdali na duchovné bohatstvá, <br>" +
                            "ktoré nám ponúkaš ešte vo väčšej miere. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"73", "2", "Na poďakovanie Pánu Bohu 2.", "Bratia a sestry, tešíme sa a ďakujeme nášmu nebeskému Otcovi, že zem vydala svoje plody na našu obživu. Zároveň ho prosme, aby sme oplývali dobrými skutkami a boli štedrí voči všetkým.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, ty si Cirkev zasadil ako šľachetnú vinicu; daj, aby sme vždy zostávali v Kristovi, pravom viniči, ktorý dáva život a plodnosť ratolestiam. <br>" +
                            "<font color='#B71C1C'>2.</font> Ty si dal zem do užívania všetkým ľuďom; daj, nech majú všetci radostnú účasť na stvorených dobrách.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, ty svojou dobrotou napĺňaš celý rok; nech rozmanitosť plodov a krása tvojich diel privedú k tebe tých, čo ťa hľadajú.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, ty si stvoril svet a my sa oň máme starať; požehnávaj ľudí pracujúcich na poliach a v záhradách, aby odmenou ich práce bola bohatá úroda.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, teba uráža nevďak a ľahostajnosť voči tvojim dobrodeniam; naplň naše srdcia vďačnosťou za všetky tvoje dary.",
                    "Nebeský Otče, s radosťou ti ďakujeme <br>" +
                            "za všetky tvoje dobrodenia, <br>" +
                            "za chlieb, za úrodu viníc a stromov <br>" +
                            "i za všetku zemskú úrodu, <br>" +
                            "a prosíme ťa, <br>" +
                            "aby sme nezabúdali na duchovné bohatstvá, <br>" +
                            "ktoré nám ponúkaš ešte vo väčšej miere. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"73", "3", "Na poďakovanie za úrodu", "Bratia a sestry, tešíme sa a ďakujeme nášmu nebeskému Otcovi, že zem vydala svoje plody na našu obživu. Zároveň ho prosme, aby sme oplývali dobrými skutkami a boli štedrí voči všetkým.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, ty si Cirkev zasadil ako šľachetnú vinicu; daj, aby sme vždy zostávali v Kristovi, pravom viniči, ktorý dáva život a plodnosť ratolestiam. <br>" +
                            "<font color='#B71C1C'>2.</font> Ty si dal zem do užívania všetkým ľuďom; daj, nech majú všetci radostnú účasť na stvorených dobrách.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, ty svojou dobrotou napĺňaš celý rok; nech rozmanitosť plodov a krása tvojich diel privedú k tebe tých, čo ťa hľadajú.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, ty si stvoril svet a my sa oň máme starať; požehnávaj ľudí pracujúcich na poliach a v záhradách, aby odmenou ich práce bola bohatá úroda.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, teba uráža nevďak a ľahostajnosť voči tvojim dobrodeniam; naplň naše srdcia vďačnosťou za všetky tvoje dary.",
                    "Nebeský Otče, s radosťou ti ďakujeme <br>" +
                            "za všetky tvoje dobrodenia, <br>" +
                            "za chlieb, za úrodu viníc a stromov <br>" +
                            "i za všetku zemskú úrodu, <br>" +
                            "a prosíme ťa, <br>" +
                            "aby sme nezabúdali na duchovné bohatstvá, <br>" +
                            "ktoré nám ponúkaš ešte vo väčšej miere. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"74", "1", "Za zachovanie mieru a spravodlivosti 1.", "Bratia a sestry, spoločnou modlitbou sa obráťme k Bohu Otcovi, aby celá rodina národov žila v pravej bratskej láske.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, rozšírenú po celom svete, nech ju prenikne Kristovo slovo a príklad, aby bola znakom jednoty a pokoja medzi národmi.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za predstaviteľov všetkých národov, aby obhajovali ľudské práva a všetkými silami a prostriedkami prispievali k jednote ľudskej rodiny.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých, ktorí sú nespravodlivo utláčaní, aby sa všetkým ľuďom na svete priznali rovnaké práva a povinnosti.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa aj za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo zjednotené spoločnou vierou a modlitbou: aby sme zotrvali v Kristovej láske a pokoji.",
                    "Bože, vypočuj naše prosby a daj,<br>" +
                            "nech všetci ľudia žijú v pokoji,<br>" +
                            "ktorý je ovocím spravodlivosti a lásky<br>" +
                            "a ktorý dávaš ľuďom dobrej vôle.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"74", "2", "Za zachovanie mieru a spravodlivosti 2.", "Bratia a sestry, spoločnou modlitbou sa obráťme k Bohu Otcovi, aby celá rodina národov žila v pravej bratskej láske.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, rozšírenú po celom svete, nech ju prenikne Kristovo slovo a príklad, aby bola znakom jednoty a pokoja medzi národmi.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za predstaviteľov všetkých národov, aby obhajovali ľudské práva a všetkými silami a prostriedkami prispievali k jednote ľudskej rodiny.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých, ktorí sú nespravodlivo utláčaní, aby sa všetkým ľuďom na svete priznali rovnaké práva a povinnosti.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa aj za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo zjednotené spoločnou vierou a modlitbou: aby sme zotrvali v Kristovej láske a pokoji.",
                    "Bože, vypočuj naše prosby a daj,<br>" +
                            "nech všetci ľudia žijú v pokoji,<br>" +
                            "ktorý je ovocím spravodlivosti a lásky<br>" +
                            "a ktorý dávaš ľuďom dobrej vôle.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"74", "3", "Za upevnenie rodín", "Bratia a sestry, pokorne prosme Pána za obnovu našich rodín, aby sa život viery zveľaďoval a upevňoval v našich rodinných spoločenstvách.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, prameň lásky a pokoja, obnov vieru kresťanov vo vtelenie tvojho Syna, ktorý sa stal členom ľudskej rodiny.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, nech všetky národy spoznajú teba, jediného pravého Boha, i tvojho Syna Ježiša Krista, ktorého si poslal spasiť všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>3.</font> Preukáž svoju otcovskú dobrotu našim príbuzným a dobrodincom, žehnaj ich už tu na zemi a daj im večný život.<br>" +
                            "<font color='#B71C1C'>4.</font> Zhliadni vo svojej dobrote na ľudí bez prístrešia, aby našli miesto dôstojného bývania.<br>" +
                            "<font color='#B71C1C'>5.</font> Naplň nás duchom svornosti, aby v našich rodinách vládol pokoj a bratská láska.<br>" +
                            "<font color='#B71C1C'>6.</font> Udeľ hriešnikom milosť obrátiť sa a tým, ktorí odpadli od viery, silu vrátiť sa do tvojho domu.",
                    "Nebeský Otče,<br>" +
                            "žehnaj naše rodiny;<br>" +
                            "daj, aby rodičia boli prvými svedkami viery svojim deťom<br>" +
                            "a deti nech si ctia, milujú a poslúchajú svojich rodičov.<br>" +
                            "O to ťa prosíme skrze Krista, nášho Pána."},
            {"75", "1", "V čase sejby 1.", "Bratia a sestry, s veľkou dôverou vzývajme nášho nebeského Otca a prosme ho:",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, posilňuj vo svojich veriacich vedomie, že nás miluješ a že sa nielen voláme tvojimi deťmi, ale nimi aj sme.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby bohatšie národy podporovali rozvojové krajiny a aby každý videl v druhom človeku svojho brata a blížneho.<br>" +
                            "<font color='#B71C1C'>3.</font> Pomáhaj chorým, núdznym a trpiacim, upevni ich v dôvere v teba a nám daj otvorené srdce pre ich hmotné i duchovné potreby.<br>" +
                            "<font color='#B71C1C'>4.</font> Požehnaj našich roľníkov a robotníkov, ktorí nám svojou prácou dorábajú chlieb, a upevňuj ich vo vedomí, že sú spolupracovníkmi Boha, ktorý dáva vzrast a úrodu.<br>" +
                            "<font color='#B71C1C'>5.</font> Požehnaj naše polia, vinice a záhrady a daj nám dobrú úrodu.<br>" +
                            "<font color='#B71C1C'>6.</font> Obdaruj nás priaznivým počasím, aby nám zem priniesla hojnú úrodu.",
                    "Dobrotivý Bože,<br>" +
                            "v Duchu Svätom ťa nazývame Otcom;<br>" +
                            "pre obetu svojho Syna vyslyš naše prosby,<br>" +
                            "ktoré ti v tejto spoločnej modlitbe prednášame.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"75", "2", "V čase sejby 2.", "Bratia a sestry, s veľkou dôverou vzývajme nášho nebeského Otca a prosme ho:",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, posilňuj vo svojich veriacich vedomie, že nás miluješ a že sa nielen voláme tvojimi deťmi, ale nimi aj sme.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby bohatšie národy podporovali rozvojové krajiny a aby každý videl v druhom človeku svojho brata a blížneho.<br>" +
                            "<font color='#B71C1C'>3.</font> Pomáhaj chorým, núdznym a trpiacim, upevni ich v dôvere v teba a nám daj otvorené srdce pre ich hmotné i duchovné potreby.<br>" +
                            "<font color='#B71C1C'>4.</font> Požehnaj našich roľníkov a robotníkov, ktorí nám svojou prácou dorábajú chlieb, a upevňuj ich vo vedomí, že sú spolupracovníkmi Boha, ktorý dáva vzrast a úrodu.<br>" +
                            "<font color='#B71C1C'>5.</font> Požehnaj naše polia, vinice a záhrady a daj nám dobrú úrodu.<br>" +
                            "<font color='#B71C1C'>6.</font> Obdaruj nás priaznivým počasím, aby nám zem priniesla hojnú úrodu.",
                    "Dobrotivý Bože,<br>" +
                            "v Duchu Svätom ťa nazývame Otcom;<br>" +
                            "pre obetu svojho Syna vyslyš naše prosby,<br>" +
                            "ktoré ti v tejto spoločnej modlitbe prednášame.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"76", "1", "Za jednotu kresťanov 1.", "Bratia a sestry, spoločne prosme o jednotu Cirkvi, za ktorú sa sám Spasiteľ v predvečer svojej smrti modlil a prosil Otca, aby všetci boli jedno.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, daj, aby sme boli jedno srdce a jedna duša.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby sa všetci pokrstení raz zjednotili v jednej, svätej, katolíckej a apoštolskej Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, pomáhaj všetkým, ktorí spravujú národy, aby podľa tvojej vôle svorne uskutočňovali všeobecné dobro.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, zjednocuj všetkých kresťanov vo vyznávaní jednej viery a daj, aby pred svetom jednotne svedčili o láske, ktorú si nám predstavil ako najväčšiu životnú hodnotu.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, daj, aby sme poznali pravé kresťanské hodnoty prameniace zo spoločného dedičstva, ktoré sa nachádza v rôznych kresťanských spoločenstvách.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, požehnaj všetkých, ktorí sa usilujú prekonať každú nelásku i rozdelenie a obetujú sa za jednotu kresťanov po celom svete.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane, daj, aby sme pamätali na to, že jednotu kresťanov napomôžeme najlepšie tým, že budeme bezúhonne žiť podľa evanjelia.",
                    "Pane Ježišu,<br>" +
                            "prosíme ťa, daj,<br>" +
                            "nech je tvoja Cirkev jasným dôkazom,<br>" +
                            "že je jeden Boh a Otec všetkých,<br>" +
                            "ktorý je nad všetkými,<br>" +
                            "preniká všetkých a je vo všetkých.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"76", "2", "Za jednotu kresťanov 2.", "Bratia a sestry, krstom sme sa znovuzrodili pre nový život, stali sme sa členmi Kristovej Cirkvi a navzájom bratmi i sestrami. Vrúcne sa modlime za jednotu všetkých kresťanov.",
                    "<font color='#B71C1C'>(</font>Volajme: Nech sme jedno srdce na tvoju slávu, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, prosíme ťa za biskupov, kňazov a diakonov, aby v tvojej láske s radosťou prednášali modlitby za jednotu všetkých kresťanov.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za predstavených všetkých cirkví, aby s múdrosťou viedli svojich veriacich k pravému spoločenstvu medzi sebou.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za všetkých pokrstených, aby sa dokázali vzájomne obohatiť svojimi rozličnými tradíciami.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za všetkých kresťanov prenasledovaných pre vieru, aby v trpezlivosti niesli svoj kríž a obetovali ho za zjednotenie putujúcej Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa za nás samých, aby sme v odvahe a pokore vedeli prekonať všetko, čo nás rozdeľuje, a aby sme kráčali po ceste k jednote.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a urob nás pozornými na tvoju pravdu,<br>" +
                            "aby sme boli pripravení počúvať,<br>" +
                            "čo Duch hovorí cirkvám,<br>" +
                            "ohlasovali to celému svetu,<br>" +
                            "a tak napomáhali jednotu Cirkvi,<br>" +
                            "ktorá je tvojou milovanou nevestou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"76", "3", "Za jednotu kresťanov 3.", "Bratia a sestry, vrúcne prosme nebeského Otca, aby zjednotil všetky svoje deti zranené nejednotou, uzdravil všetky ich rany a daroval im pokoj na celom svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev na celom svete: aby ako milujúca matka vrúcne objímala všetkých, ktorí vyznávajú vieru v božstvo Ježiša Krista, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za kresťanov rozličných vyznaní: aby uprostred všetkých trápení tohto sveta mali svoj zrak upretý na Boha, ktorý je posilou v ťažkostiach, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za predstaviteľov štátov, ktorí veria v Krista: aby aj napriek rozdielnym tradíciám a bohatstvu svojich krajín napomáhali jednotu a svornosť medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za chorých a trpiacich: aby svojimi obetami a modlitbami zmierňovali bolesti a utrpenie Cirkvi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu prítomných: aby sme nepohŕdali kresťanmi iných vyznaní, ale vydávali pred svetom svedectvo o jednote viery, prosme Pána.",
                    "Bože Otče,<br>" +
                            "milostivo vypočuj prosby tejto svojej rodiny,<br>" +
                            "ktorú si zhromaždil okolo seba,<br>" +
                            "a priveď k sebe všetky svoje roztratené deti.<br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] spevFormularZmierenie = {
            {"Za zachovanie mieru a spravodlivosti I", "Pane, udeľ pokoj tým, čo dúfajú v teba.<br>" +
                    "Vypočuj prosby svojich služobníkov<br>" +
                    "a uveď nás na cestu spravodlivosti.", "(Porov. Ekl 36, 18-19)",
                    "Blahoslavení, čo šíria pokoj,<br>" +
                            "lebo ich budú volať Božími synmi.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 14, 27)</font><br>" +
                            "Pán Ježiš hovorí: Pokoj vám zanechávam,<br>" +
                            "svoj pokoj vám dávam.", "(Mt 5, 9)"},
            {"Za zachovanie mieru a spravodlivosti II", "Pane, udeľ pokoj tým, čo dúfajú v teba.<br>" +
                    "Vypočuj prosby svojich služobníkov<br>" +
                    "a uveď nás na cestu spravodlivosti.", "(Porov. Ekl 36, 18-19)",
                    "Blahoslavení, čo šíria pokoj,<br>" +
                            "lebo ich budú volať Božími synmi.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 14, 27)</font><br>" +
                            "Pán Ježiš hovorí: Pokoj vám zanechávam,<br>" +
                            "svoj pokoj vám dávam.", "(Mt 5, 9)"},
            {"Za zmierenie", "Ja som spása ľudu, hovorí Pán.<br>" +
                    "V akejkoľvek ťažkosti sa obráti na mňa,<br>" +
                    "vypočujem ho a budem mu ochrancom naveky.", "",
                    "Pán Ježiš hovorí: Poďte ku mne všetci,<br>" +
                            "čo sa namáhate a ste unavení, a ja vás posilním.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 16, 24)</font><br>" +
                            "Pán Ježiš hovorí: Proste a dostanete,<br>" +
                            "aby vaša radosť bola úplná.", "(Mt 11, 28)"},
            {"V čase vojny a občianskych rozvratov", "Pán hovorí:<br>" +
                    "Mojím úmyslom je priniesť vám blaho, a nie nešťastie.<br>" +
                    "Keď ma budete vzývať, vyslyším vás<br>" +
                    "a zhromaždím vás zo všetkých krajov,<br>" +
                    "kde žijete vo vyhnanstve.<br>" +
                    "<font color='#B71C1C'>Alebo: (Ž 17, 5-7)</font><br>" +
                    "Obkľúčilo ma smrtiace vlnobitie a vydesili zlostné prívaly.<br>" +
                    "V úzkosti som vzýval Pána, zo svojho chrámu vypočul môj hlas.", "(Jer 29, 11. 12. 14)",
                    "Pán Ježiš hovorí: Pokoj vám zanechávam, svoj pokoj vám dávam;<br>" +
                            "nie ako ho svet dáva, ja vám ho dávam.<br>" +
                            "Nech sa nevzrušuje vaše srdce a nestrachuje.", "(Jn 14, 27)"},
            {"Za odpustenie hriechov", "Pane, zmilúvaš sa nad všetkými<br>" +
                    "a nepohŕdaš ničím, čo si stvoril.<br>" +
                    "Zatváraš oči nad hriechmi ľudí, aby sa kajali<br>" +
                    "a šetríš ich, lebo ty si Pán, náš Boh.", "(Porov. Múd 11, 24. 25. 27)",
                    "Pán Ježiš hovorí:<br>" +
                            "Boží anjeli sa budú radovať z jedného hriešnika,<br>" +
                            "čo robí pokánie.", "(Lk 15, 10)"},
            {"Za dar lásky", "Pán hovorí: Odstránim z vášho tela srdce kamenné<br>" +
                    "a dám vám srdce jemnocitné.<br>" +
                    "Vložím do vás svojho Ducha,<br>" +
                    "a budete mojím ľudom a ja budem vaším Bohom.", "(Porov. Ez 36, 26. 27. 28)",
                    "Teraz zostáva viera, nádej a láska, tieto tri,<br>" +
                            "no najväčšia z nich je láska.", "(1 Kor 13, 13)"},
            {"Za svornosť", "Množstvo veriacich malo jedno srdce a jednu dušu.<br>" +
                    "Apoštoli s veľkou silou vydávali svedectvo<br>" +
                    "o zmŕtvychvstaní Pána Ježiša<br>" +
                    "a všetci sa tešili veľkej obľube. Aleluja.", "(Sk 4, 32. 33)",
                    "Pán Ježiš sa modlil:<br>" +
                            "Otče, prosím ťa aj za tých, čo uveria vo mňa,<br>" +
                            "aby aj oni v nás jedno boli,<br>" +
                            "aby svet uveril, že si ma ty poslal.", "(Porov. Jn 17, 20. 21)"},
            {"O tajomstve svätého kríža", "Hľadajme slávu v kríži nášho Pána Ježiša Krista.<br>" +
                    "On je naša spása, náš život, naše vzkriesenie; on nás oslobodil a spasil.", "(Porov. Gal 6, 14)",
                    "Pán Ježiš povedal:<br>" +
                            "Keď budem vyzdvihnutý od zeme, všetkých pritiahnem k sebe.", "(Jn 12, 32)"},
            {"O najsvätejšej eucharistii I", "Boh živil svoj ľud pšeničným chlebom<br>" +
                    "a sýtil ho lesným medom.<br>" +
                    "<font color='#B71C1C'>Alebo: (Jn 6, 55)</font><br>" +
                    "Moje telo je pravý pokrm<br>" +
                    "a moja krv je pravý nápoj, hovorí Pán.", "(Porov. Ž 80, 17)",
                    "Pán Ježiš povedal:<br>" +
                            "Kto je moje telo a pije moju krv,<br>" +
                            "ostáva vo mne a ja v ňom.", "(Jn 6, 57)"},
            {"O najsvätejšej eucharistii II", "Pán otvoril brány nebies,<br>" +
                    "zoslal im mannu za pokrm ako dážď,<br>" +
                    "dal im chlieb z neba.<br>" +
                    "Človek jedol chlieb anjelský.", "(Ž 77, 23-25)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ja som živý chlieb, ktorý zostúpil z neba.<br>" +
                            "Kto bude jesť z tohto chleba, bude žiť naveky.<br>" +
                            "A chlieb, ktorý ja dám, je moje telo,<br>" +
                            "ktoré obetujem za život sveta.", "(Jn 6, 51-52)"},
            {"O najsvätejšej eucharistii III", "Pán prisahal a nebude ľutovať:<br>" +
                    "\"Ty si kňaz naveky podľa radu Melchizedechovho.\"", "(Ž 109, 4)",
                    "Pán Ježiš hovorí:<br>" +
                            "Toto je moje telo, ktoré sa obetuje za vás;<br>" +
                            "tento kalich je nová zmluva, uzavretá mojou krvou.<br>" +
                            "Vždy, keď budete prijímať, robte to na moju pamiatku.", "(Porov. 1 Kor 11, 24-25)"},
            {"O predrahej krvi nášho Pána Ježiša Krista", "Vykúpil si nás svojou krvou, Pane,<br>" +
                    "z každého kmeňa, jazyka, ľudu a národa<br>" +
                    "a urobil si z nás kráľovstvo nášmu Bohu.", "(Zjv 5, 9-10)",
                    "Kalich dobrorečenia, nad ktorým dobrorečíme,<br>" +
                            "je účasťou na Kristovej krvi.<br>" +
                            "A chlieb, ktorý lámeme, je účasťou na Kristovom tele.", "(Porov. 1 Kor 10, 16)"},
    };

    String[][] modlitbaFormularZmierenie = {
            {"Za zachovanie mieru a spravodlivosti I", "Spravodlivý Bože, ty si zjavil,<br>" +
                    "že šíritelia pokoja sa budú volať tvojimi synmi; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy a všade uplatňovali spravodlivosť,<br>" +
                    "ktorá jediná môže zaručiť trvalý a pravý pokoj.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Láskavý Bože,<br>" +
                    "všetci ľudia pochádzajú od teba<br>" +
                    "a ty sa o nich otcovsky staráš; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby žili v pokoji ako jedna rodina,<br>" +
                    "spojená úprimnou bratskou láskou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Otče,<br>" +
                    "pod sviatostnými znakmi chleba a vína,<br>" +
                    "ktoré naznačujú pokoj a jednotu,<br>" +
                    "slávime spasiteľnú obetu tvojho Syna,<br>" +
                    "Kráľa pokoja; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "nech táto obeta upevňuje svornosť<br>" +
                    "medzi všetkými tvojimi deťmi.<br>" +
                    "Skrze Krista, nášho Pána.", "Nebeský Otče,<br>" +
                    "posilnil si nás telom a krvou<br>" +
                    "svojho jednorodeného Syna; <font color='#B71C1C'>*</font><br>" +
                    "naplň nás duchom svojej lásky, <font color='#B71C1C'>—</font><br>" +
                    "aby sme upevňovali medzi ľuďmi pokoj,<br>" +
                    "ktorý nám zanechal Ježiš Kristus, náš Pán.<br>" +
                    "On s tebou žije a kraľuje na veky vekov."},
            {"Za zachovanie mieru a spravodlivosti II", "Všemohúci Bože,<br>" +
                    "ty si stvoril vesmír<br>" +
                    "a podľa tvojej vôle sa odvíjajú dejiny sveta; <font color='#B71C1C'>*</font><br>" +
                    "vyslyš naše prosby<br>" +
                    "a daruj našim časom trvalý pokoj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s radostným srdcom<br>" +
                    "mohli chváliť tvoje milosrdenstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, milovník a pôvodca pokoja,<br>" +
                    "svárlivý duch ťa nemôže chápať<br>" +
                    "a srdce plné nenávisti sa zatvára pred tebou; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby všetci, čo žijú svorne, vytrvali v dobrom, <font color='#B71C1C'>—</font><br>" +
                    "a tí, čo žijú v nepriateľstve,<br>" +
                    "nech sa zmieria a zabudnú na krivdy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Otče,<br>" +
                    "pod sviatostnými znakmi chleba a vína,<br>" +
                    "ktoré naznačujú pokoj a jednotu,<br>" +
                    "slávime spasiteľnú obetu tvojho Syna,<br>" +
                    "Kráľa pokoja; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "nech táto obeta upevňuje svornosť<br>" +
                    "medzi všetkými tvojimi deťmi.<br>" +
                    "Skrze Krista, nášho Pána.", "Nebeský Otče,<br>" +
                    "posilnil si nás telom a krvou<br>" +
                    "svojho jednorodeného Syna; <font color='#B71C1C'>*</font><br>" +
                    "naplň nás duchom svojej lásky, <font color='#B71C1C'>—</font><br>" +
                    "aby sme upevňovali medzi ľuďmi pokoj,<br>" +
                    "ktorý nám zanechal Ježiš Kristus, náš Pán.<br>" +
                    "On s tebou žije a kraľuje na veky vekov."},
            {"Za zmierenie", "Bože, prameň lásky a zmierenia,<br>" +
                    "ty poskytuješ ľuďom mimoriadne dni spásy,<br>" +
                    "aby ťa uznali za Stvoriteľa a Otca všetkých; <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "<font color='#B71C1C'>(</font>v týchto mimoriadnych dňoch kajúcnosti <font color='#B71C1C'>-)</font><br>" +
                    "aby sme ochotne prijímali tvoje slovo pokoja<br>" +
                    "a zapojili sa do tvojho plánu<br>" +
                    "obnoviť všetko v Kristovi,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo (najmä vo veľkonočnom období):</font><br>" +
                    "Bože, pôvodca pravej slobody,<br>" +
                    "ty vyslobodzuješ ľudí z otroctva hriechu<br>" +
                    "a chceš z nich utvoriť jednu rodinu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa <font color='#B71C1C'>(</font>v tomto čase milosti a požehnania<font color='#B71C1C'>)</font>,<br>" +
                    "dopraj svojej Cirkvi, <font color='#B71C1C'>—</font><br>" +
                    "aby v plnej slobode žiarila pred svetom<br>" +
                    "ako znamenie spásy<br>" +
                    "a medzi ľuďmi ohlasovala a uskutočňovala<br>" +
                    "večný plán tvojej lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pamätaj, Otče,<br>" +
                    "že tvoj Syn svojou krvou zmyl hriechy sveta<br>" +
                    "a zaslúžil nám pokoj a zmierenie; <font color='#B71C1C'>*</font><br>" +
                    "zhliadni teda láskavo na dary svojej Cirkvi<br>" +
                    "a dopraj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme<br>" +
                    "<font color='#B71C1C'>(</font>radostným prežívaním tohto milostivého času<font color='#B71C1C'>)</font><br>" +
                    "dopomohli všetkým ľuďom k tej slobode,<br>" +
                    "čo nám priniesol Ježiš Kristus,<br>" +
                    "ktorý žije a kraľuje na veky vekov.", "Prosíme ťa, láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "nech sviatostný pokrm, ktorý sme prijali,<br>" +
                    "rozmnoží naše sily, <font color='#B71C1C'>—</font><br>" +
                    "aby sme z tejto sviatosti jednoty<br>" +
                    "čerpali účinnú lásku<br>" +
                    "a všade rozširovali tvoj pokoj.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"V čase vojny a občianskych rozvratov", "Milosrdný a mocný Bože,<br>" +
                    "ty odvraciaš vojny a pokoruješ spupnosť mocných; <font color='#B71C1C'>*</font><br>" +
                    "zmiluj sa nad nami,<br>" +
                    "vzdiaľ od nás hrôzy vojny, zotri nám slzy <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby všetci ľudia nažívali v pokoji<br>" +
                    "ako tvoje deti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, pôvodca a milovník pokoja,<br>" +
                    "kto pozná teba, má pravý život,<br>" +
                    "a kto slúži tebe, má účasť na tvojej vláde; <font color='#B71C1C'>*</font><br>" +
                    "chráň nás pred všetkými útokmi násilia<br>" +
                    "a daruj nám pokoj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa nemuseli báť nepriateľských zbraní.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pamätaj, Bože, že tvoj Syn je náš pokoj<br>" +
                    "a že svojou krvou premohol ľudskú nenávisť; <font color='#B71C1C'>*</font><br>" +
                    "pozri na naše trápenia <font color='#B71C1C'>—</font><br>" +
                    "a pre zásluhy jeho obety<br>" +
                    "daruj všetkým ľuďom pokoj a istotu.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "nasýtil si nás z toho istého Chleba,<br>" +
                    "ktorý posilňuje a oblažuje srdce človeka; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám šťastlivo prekonať hrôzy vojny <font color='#B71C1C'>—</font><br>" +
                    "a nauč nás verne zachovávať<br>" +
                    "tvoj zákon spravodlivosti a lásky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"Za odpustenie hriechov", "Milosrdný Bože, uznávame, že sme zhrešili; <font color='#B71C1C'>*</font><br>" +
                    "preto ťa prosíme,<br>" +
                    "zhliadni na našu pokoru a zľutuj sa nad nami, <font color='#B71C1C'>—</font><br>" +
                    "odpusť nám viny a obdaruj nás svojím pokojom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože Otče,<br>" +
                    "buď milostivý svojmu ľudu: <font color='#B71C1C'>*</font><br>" +
                    "osloboď nás od všetkých hriechov<br>" +
                    "a odpusť nám tresty, <font color='#B71C1C'>—</font><br>" +
                    "ktoré zasluhujeme za svoje previnenia.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože, milosrdný Otče, <font color='#B71C1C'>*</font><br>" +
                    "pre zásluhy zmiernej obety, ktorú slávime,<br>" +
                    "zmiluj sa nad nami, <font color='#B71C1C'>—</font><br>" +
                    "odpusť nám viny<br>" +
                    "a usmerňuj k sebe naše nestále srdcia.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "pre túto sviatostnú obetu nám odpúšťaš viny; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám svojou milosťou<br>" +
                    "chrániť sa ďalších hriechov, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti slúžili s čistým srdcom.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"Za dar lásky", "Všemohúci Bože, zošli nám Ducha Svätého <font color='#B71C1C'>*</font><br>" +
                    "a zapáľ naše srdcia ohňom svojej lásky, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy zmýšľali a konali, ako sa tebe páči,<br>" +
                    "a úprimne ťa milovali v našich bratoch a sestrách.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "milostivo posväť tieto obetné dary<br>" +
                    "a s nimi prijmi aj našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme tvojou láskou milovali všetkých ľudí.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "nasýtil si nás z toho istého Chleba,<br>" +
                    "ktorý v nás rozmnožuje božský život; <font color='#B71C1C'>—</font><br>" +
                    "naplň nás milosťou Ducha Svätého<br>" +
                    "a čistou radosťou, prameniacou z dokonalej lásky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"Za svornosť", "Bože, zvrchovaná jednota a pravá láska,<br>" +
                    "daj, aby tvoji veriaci boli<br>" +
                    "jedno srdce a jedna duša; <font color='#B71C1C'>*</font><br>" +
                    "svornosťou a láskou upevňuj svoju Cirkev,<br>" +
                    "ktorá spočíva na vyznávaní pravdy, <font color='#B71C1C'>—</font><br>" +
                    "aby sa rozvíjala v nerozbornej jednote.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nebeský Otče,<br>" +
                    "ty v nás zdokonaľuješ svoj obraz<br>" +
                    "svojím slovom a sviatosťami; <font color='#B71C1C'>*</font><br>" +
                    "milostivo veď naše kroky po tvojich cestách <font color='#B71C1C'>—</font><br>" +
                    "a pre túto svätú obetu<br>" +
                    "naplň naše srdcia láskou, ktorú očakávame od teba.<br>" +
                    "Skrze Krista, nášho Pána.", "Svätý Otče,<br>" +
                    "prijali sme sviatosť jednoty; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám žiť v tvojej Cirkvi svorne<br>" +
                    "ako bratia a sestry, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v srdci mali pokoj, ktorý iným žičíme,<br>" +
                    "a chránili si pokoj, ktorý od teba dostávame.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"O tajomstve svätého kríža", "Láskavý Otče,<br>" +
                    "ty si poslal na svet svojho milovaného Syna,<br>" +
                    "aby smrťou na kríži spasil všetkých ľudí; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme na zemi stále lepšie poznávali<br>" +
                    "tajomstvo jeho vykupiteľskej smrti<br>" +
                    "a dosiahli účasť na jeho sláve v nebi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás očistí od každej viny<br>" +
                    "obeta Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                    "ktorý na oltári kríža sňal hriechy celého sveta.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.", "Pane Ježišu Kriste,<br>" +
                    "na dreve kríža zaslúžil si nám nový život<br>" +
                    "a v tejto sviatosti nám dávaš za pokrm seba samého; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj nám účasť aj na sláve svojho zmŕtvychvstania.<br>" +
                    "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"O najsvätejšej eucharistii I", "Pane Ježišu,<br>" +
                    "vo vznešenej Oltárnej sviatosti<br>" +
                    "zanechal si nám pamiatku<br>" +
                    "svojho umučenia a zmŕtvychvstania; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám<br>" +
                    "uctievať tajomstvo tvojho tela a krvi<br>" +
                    "s takou vierou a láskou, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy pociťovali<br>" +
                    "účinky tvojho vykupiteľského diela.<br>" +
                    "Lebo ty žiješ a kraľuješ s Bohom Otcom<br>" +
                    "v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "Prosíme ťa, Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "udeľ svojej Cirkvi jednotu a pokoj, <font color='#B71C1C'>—</font><br>" +
                    "ktoré sú tajomne naznačené<br>" +
                    "týmito darmi chleba a vína.<br>" +
                    "Skrze Krista, nášho Pána.", "Dopraj nám, Pane Ježišu, <font color='#B71C1C'>*</font><br>" +
                    "aby sme vo večnosti dosiahli plnú radosť<br>" +
                    "z tvojho božského života, <font color='#B71C1C'>—</font><br>" +
                    "ktorú nám už teraz dávaš okúsiť<br>" +
                    "v prijímaní tvojho predrahého tela a krvi.<br>" +
                    "Ty žiješ a kraľuješ na veky vekov."},
            {"O najsvätejšej eucharistii II", "Bože, naša spása,<br>" +
                    "ty si zavŕšil dielo nášho vykúpenia<br>" +
                    "veľkonočným tajomstvom tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "keď sviatostnými znakmi zvestujeme<br>" +
                    "jeho smrť a zmŕtvychvstanie, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme mali vždy väčšiu účasť<br>" +
                    "na diele našej spásy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "slávime pamiatku nášho vykúpenia<br>" +
                    "a vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby táto sviatosť tvojej lásky<br>" +
                    "bola pre nás účinným znakom jednoty<br>" +
                    "a putom bratskej lásky.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože, milosrdný Otče, <font color='#B71C1C'>*</font><br>" +
                    "nech nás posvätí účasť na eucharistickej hostine, <font color='#B71C1C'>—</font><br>" +
                    "aby telo a krv nášho Pána Ježiša Krista<br>" +
                    "spojili nás všetkých v bratskej láske.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"O najsvätejšej eucharistii III", "Všemohúci a večný Bože,<br>" +
                    "na svoju slávu a na spásu ľudstva<br>" +
                    "ustanovil si Ježiša Krista<br>" +
                    "za najvyššieho a večného kňaza; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby ľud, ktorý ti on získal svojou krvou, <font color='#B71C1C'>—</font><br>" +
                    "z eucharistickej obety čerpal<br>" +
                    "spásonosnú silu jeho kríža a zmŕtvychvstania.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám nábožne sláviť<br>" +
                    "eucharistické tajomstvo, <font color='#B71C1C'>—</font><br>" +
                    "lebo vždy, keď slávime pamiatku Kristovej obety,<br>" +
                    "uskutočňuje sa v nás dielo vykúpenia.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože, dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "pre účasť na tej to o bete,<br>" +
                    "ktorú nám tvoj Syn prikázal sláviť<br>" +
                    "na svoju pamiatku, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme spolu s ním<br>" +
                    "aj my boli tebe milým darom.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"O predrahej krvi nášho Pána Ježiša Krista", "Milosrdný Bože,<br>" +
                    "ty si vykúpil všetkých ľudí<br>" +
                    "drahocennou krvou svojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "zachovaj v nás dielo svojho milosrdenstva, <font color='#B71C1C'>—</font><br>" +
                    "aby sme slávením týchto svätých tajomstiev<br>" +
                    "získali vždy hojnejšie ovocie nášho vykúpenia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože, dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše obetné dary<br>" +
                    "a daj, aby srne v spojení s Ježišom Kristom,<br>" +
                    "prostredníkom Novej zmluvy, <font color='#B71C1C'>—</font><br>" +
                    "sviatostným spôsobom sprítomnili<br>" +
                    "tajomstvo nášho vykúpenia jeho drahocennou krvou.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.", "Svätý Otče,<br>" +
                    "posilnil si nás chlebom života a kalichom spásy; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nás krv nášho Spasiteľa<br>" +
                    "neprestajne očisťovala od hriechov <font color='#B71C1C'>—</font><br>" +
                    "a bola nám trvalým prameňom večného života.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "posilnil si nás chlebom života a kalichom spásy;<br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "chráň v každom nebezpečenstve všetkých,<br>" +
                    "ktorých si vykúpil predrahou krvou<br>" +
                    "tvojho Syna Ježiša Krista,<br>" +
                    "ktorý žije a kraľuje na veky vekov."},
    };

    String[][] spevFormularZosnuly = {
            //mimo VN
            {"1", "1", "Vo výročný deň I (mimo veľkonočného obdobia)", "Boh im zotrie z očí každú slzu<br>" +
                    "a už nebude smrti ani zármutku,<br>" +
                    "ani náreku ani bolesti viac nebude,<br>" +
                    "lebo starý svet pominul.", "(Zjv 21, 4)",
                    "Pán Ježiš hovorí: Ja som vzkriesenie a život.<br>" +
                            "Kto verí vo mňa, má život večný a nepôjde na súd,<br>" +
                            "lebo už prešiel zo smrti do života.", "(Jn 11, 25; 3, 36; 5,24)"},
            {"1", "2", "Vo výročný deň II (mimo veľkonočného obdobia)", "Pane Ježišu, ty si vylial svoju krv za všetkých ľudí;<br>" +
                    "daj našim zosnulým večný život.", "",
                    "Pane, ty si odpočinkom po práci a životom aj po smrti:<br>" +
                            "daj našim zosnulým večné odpočinutie.", ""},
            //VN
            {"2", "1", "Vo výročný deň I (vo veľkonočnom období)", "Boh, ktorý vzkriesil z mŕtvych Ježiša,<br>" +
                    "oživí aj naše smrteľné telo svojím Duchom,<br>" +
                    "ktorý prebýva v nás. Aleluja.", "(Porov. Rim 8, 11)",
                    "Pán Ježiš hovorí: Ja som živý chlieb, ktorý zostúpil z neba.<br>" +
                            "Kto je z tohto chleba, bude žiť naveky.<br>" +
                            "A chlieb, ktorý ja dám, je moje telo,<br>" +
                            "ktoré obetujem za život sveta. Aleluja.", "(Jn 6, 51-52)"},
            //iné
            {"3", "1", "Vo výročný deň", "Boh im zotrie z očí každú slzu<br>" +
                    "a už nebude smrti ani zármutku,<br>" +
                    "ani náreku ani bolesti viac nebude,<br>" +
                    "lebo starý svet pominul.", "(Zjv 21, 4)",
                    "Pán Ježiš hovorí: Ja som vzkriesenie a život.<br>" +
                            "Kto verí vo mňa, má život večný a nepôjde na súd,<br>" +
                            "lebo už prešiel zo smrti do života.", "(Jn 11, 25; 3, 36; 5,24"},
            {"4", "1", "Vo výročný deň", "Boh im zotrie z očí každú slzu<br>" +
                    "a už nebude smrti ani zármutku,<br>" +
                    "ani náreku ani bolesti viac nebude,<br>" +
                    "lebo starý svet pominul.", "(Zjv 21, 4)",
                    "Pán Ježiš hovorí: Ja som vzkriesenie a život.<br>" +
                            "Kto verí vo mňa, má život večný a nepôjde na súd,<br>" +
                            "lebo už prešiel zo smrti do života.", "(Jn 11, 25; 3, 36; 5,24)",},
            {"5", "1", "Pri rozličných spomienkach za jedného zosnulého I", "Kiež mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> Pán otvorí bránu raja<br>" +
                    "a vovedie ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> do večného domova,<br>" +
                    "kde už niet smrti, ale len večná radosť.", "",
                    "Pán Ježiš hovorí:<br>" +
                            "Všetko, čo mi dáva Otec, príde ku mne.<br>" +
                            "A toho, kto prichádza ku mne, neodoženiem.", "(Jn 6, 37)"},
            {"5", "2", "Pri rozličných spomienkach za jedného zosnulého II", "Viem, že môj Vykupiteľ žije<br>" +
                    "a že ma vzkriesi v posledný deň<br>" +
                    "a vo svojom tele budem vidieť Boha.", "(Porov. Jób 19, 25. 26)",
                    "Pán Ježiš hovorí:<br>" +
                            "Toto je chlieb, ktorý zostupuje z neba,<br>" +
                            "a kto bude z neho jesť, neumrie.", "(Porov. Jn 6, 50)"},
            {"6", "1", "Pri rozličných spomienkach za viacerých zosnulých I", "Odpočinutie večné daj zosnulým, Pane,<br>" +
                    "a prijmi ich do vlasti svetla a pokoja.", "",
                    "Boh poslal na svet svojho jednorodeného Syna,<br>" +
                            "aby sme skrze neho mali život.", "(1 Jn 4, 9)<br>"},
            {"6", "2", "Pri rozličných spomienkach za viacerých zosnulých II", "Boh tak miloval svet,<br>" +
                    "že dal svojho jednorodeného Syna,<br>" +
                    "aby nezahynul nik, čo verí v neho,<br>" +
                    "ale aby mal život večný.", "(Jn 3, 16)",
                    "Očakávame Spasiteľa,<br>" +
                            "Pána Ježiša Krista;<br>" +
                            "on pretvorí naše úbohé telo,<br>" +
                            "aby sa stalo podobným jeho oslávenému telu.", "(Flp 3, 20-21)"},
            {"6", "3", "Pri rozličných spomienkach za viacerých zosnulých III", "Blažení ti, čo umierajú v Pánovi;<br>" +
                    "nech si odpočinú od námah,<br>" +
                    "veď ich skutky idú s nimi.", "(Zjv 14, 13)",
                    "Bože, daj večný odpočinok tým,<br>" +
                            "na ktorých si spomíname,<br>" +
                            "keď prijímame Kristovo telo a krv.", ""},
    };
    String[][] modlitbaFormularZosnuly = {
            //mimo VN
            {"1", "1", "Vo výročný deň I (mimo veľkonočného obdobia)", "Pane a Bože náš,<br>" +
                    "svetlo veriacich a život spravodlivých,<br>" +
                    "ty si nás vykúpil smrťou<br>" +
                    "a zmŕtvychvstaním svojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "buď milostivý svojmu služobníkovi <font color='#B71C1C'>M.</font>,<br>" +
                    "<font color='#B71C1C'>(</font>svojej služobnici <font color='#B71C1C'>M.</font>,<font color='#B71C1C'>)</font><br>" +
                    "ktorý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>)</font> veril<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> v tajomstvo nášho vzkriesenia,<br>" +
                    "a daj mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> radosti večného života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče, prinášame ti obetné dary<br>" +
                    "za tvojho služobníka <font color='#B71C1C'>M. (</font>za tvoju služobnicu <font color='#B71C1C'>M.)</font>; <font color='#B71C1C'>*</font><br>" +
                    "očisti ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> touto presvätou obetou <font color='#B71C1C'>—</font><br>" +
                    "a daruj mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> blažený život v tvojej sláve.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "touto eucharistickou o betou<br>" +
                    "posilnil si nás v nad prirodzenom živote; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa za nášho zosnulého brata <font color='#B71C1C'>M.</font>: <font color='#B71C1C'>—</font><br>" +
                    "<font color='#B71C1C'>(</font>za našu zosnulú sestru <font color='#B71C1C'>M.</font>: <font color='#B71C1C'>—)</font><br>" +
                    "očisti ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> od každej viny,<br>" +
                    "aby bol<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> hoden <font color='#B71C1C'>(</font>hodna<font color='#B71C1C'>)</font> slávneho vzkriesenia.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"1", "2", "Vo výročný deň II (mimo veľkonočného obdobia)", "Milosrdný Bože,<br>" +
                    "prosíme ťa za tvojho služobníka <font color='#B71C1C'>M.</font><br>" +
                    "<font color='#B71C1C'>(</font>za tvoju služobnicu <font color='#B71C1C'>M.)</font><br>" +
                    "vo výročný deň jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> smrti <font color='#B71C1C'>(</font>pohrebu<font color='#B71C1C'>)</font>; <font color='#B71C1C'>*</font><br>" +
                    "zahrň ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> svojou milosrdnou láskou <font color='#B71C1C'>—</font><br>" +
                    "a voveď ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> do rodiny tvojich svätých.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, vyslyš naše modlitby,<br>" +
                    "ktoré ti prednášame za tvojho služobníka <font color='#B71C1C'>M.</font><br>" +
                    "<font color='#B71C1C'>(</font>za tvoju služobnicu <font color='#B71C1C'>M.)</font><br>" +
                    "vo výročný deň jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> smrti <font color='#B71C1C'>(</font>pohrebu<font color='#B71C1C'>)</font>; <font color='#B71C1C'>*</font><br>" +
                    "pre nekonečnú cenu tejto svätej obety <font color='#B71C1C'>—</font><br>" +
                    "pridruž ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> k blaženému zástupu tvojich svätých.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "priniesli sme ti eucharistickú obetu<br>" +
                    "za nášho zosnulého brata <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "(za našu zosnulú sestru <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*)</font><br>" +
                    "pre tvoju milosrdnú lásku<br>" +
                    "očisti ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> od každej poškvrny <font color='#B71C1C'>—</font><br>" +
                    "a voveď ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> do večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            //VN
            {"2", "1", "Vo výročný deň I (vo veľkonočnom období)", "Všemohúci a milosrdný Bože,<br>" +
                    "tvoj Syn dobrovoľne zomrel za nás na kríži<br>" +
                    "a tretieho dňa vstal z mŕtvych; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "zmiluj sa nad naším zosnulým bratom <font color='#B71C1C'>M.</font><br>" +
                    "<font color='#B71C1C'>(</font>našou zosnulou sestrou <font color='#B71C1C'>M.)</font><br>" +
                    "a daj mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> účasť<br>" +
                    "na víťaznom zmŕtvychvstaní Ježiša Krista,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci a milosrdný Bože,<br>" +
                    "vo sviatosti krstu si dal svojmu služobníkovi <font color='#B71C1C'>M.</font><br>" +
                    "<font color='#B71C1C'>(</font>svojej služobnici <font color='#B71C1C'>M.)</font><br>" +
                    "nový život; <font color='#B71C1C'>*</font><br>" +
                    "očisti ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> od každej viny<br>" +
                    "predrahou Kristovou krvou <font color='#B71C1C'>—</font><br>" +
                    "a milosrdne ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> voveď do večného života.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "v tejto sviatosti sme prijali Ježiša Krista,<br>" +
                    "ktorý za nás umrel a slávne vstal z mŕtvych; <font color='#B71C1C'>*</font><br>" +
                    "pôsobením tohto veľkonočného tajomstva<br>" +
                    "očisti svojho služobníka <font color='#B71C1C'>M. (</font>svoju služobníčku <font color='#B71C1C'>M.)</font><br>" +
                    "od každej viny <font color='#B71C1C'>—</font><br>" +
                    "a daj mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> účasť na slávnom vzkriesení.<br>" +
                    "Skrze Krista, nášho Pána."},
            //iné
            {"3", "1", "Vo výročný deň", "Večný Bože, pre spásonosné utrpenie tvojho Syna<br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "udeľ svojmu služobníkovi <font color='#B71C1C'>(</font>svojej služobnici<font color='#B71C1C'>) M.</font><br>" +
                    "odpustenie, po ktorom vždy túžil<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font>, <font color='#B71C1C'>—</font><br>" +
                    "aby mohol <font color='#B71C1C'>(</font>mohla<font color='#B71C1C'>)</font> vidieť tvoju tvár<br>" +
                    "a naveky sa tešiť z blaženého spoločenstva s tebou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nekonečný Bože,<br>" +
                    "pokorne ti prinášame túto obetu<br>" +
                    "za tvojho služobníka <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>(</font>tvoju služobnicu <font color='#B71C1C'>M.,)</font><br>" +
                    "ktorému <font color='#B71C1C'>(</font>ktorej<font color='#B71C1C'>)</font> si dožičil,<br>" +
                    "aby ťa poznal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> svetlom viery, <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, priveď ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> do nebeskej slávy, <font color='#B71C1C'>—</font><br>" +
                    "aby mohol (mohla) naveky žiť spojený<font color='#B71C1C'>(</font>á<font color='#B71C1C'>)</font> s tebou.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "prijali sme sviatostný pokrm,<br>" +
                    "ktorý nás uzdravuje a posilňuje; <font color='#B71C1C'>*</font><br>" +
                    "pôsobením tejto sviatosti<br>" +
                    "očisti nášho brata <font color='#B71C1C'>(</font>našu sestru<font color='#B71C1C'>)</font><br>" +
                    "od všetkých hriechov, <font color='#B71C1C'>—</font><br>" +
                    "aby mohol <font color='#B71C1C'>(</font>mohla<font color='#B71C1C'>)</font><br>" +
                    "prejsť do nebeského spoločenstva.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"4", "1", "Vo výročný deň", "Nekonečne milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "vo výročný deň smrti <font color='#B71C1C'>(</font>pohrebu<font color='#B71C1C'>)</font><br>" +
                    "tvojho služobníka <font color='#B71C1C'>M. (</font>tvojej služobnice <font color='#B71C1C'>M.)</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> večné odpočinutie, blažený pokoj<br>" +
                    "a svetlo tvojej slávy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše prosby a obetné dary,<br>" +
                    "ktoré ti prinášame<br>" +
                    "za tvojho služobníka <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>(</font>tvoju služobnicu <font color='#B71C1C'>M.</font>;<font color='#B71C1C'>) —</font><br>" +
                    "pre zásluhy tejto obety<br>" +
                    "daj mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> plnosť vykúpenia.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "priniesli sme ti obetu<br>" +
                    "za tvojho služobníka <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>(</font>tvoju služobnicu <font color='#B71C1C'>M.</font>;<font color='#B71C1C'>) *</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "očisť ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> týmto tajomstvom od všetkých hriechov<br>" +
                    "a milosrdne ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font><br>" +
                    "prijmi do svetla večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"5", "1", "Pri rozličných spomienkach za jedného zosnulého I", "Bože, všemohúci Otče, <font color='#B71C1C'>*</font><br>" +
                    "tajomstvom kríža si nám dal záruku spásy<br>" +
                    "a zmŕtvychvstaním tvojho Syna<br>" +
                    "dal si nám aj nádej na vzkriesenie; <font color='#B71C1C'>—</font><br>" +
                    "milostivo zbav pút smrti<br>" +
                    "svojho služobníka <font color='#B71C1C'>M. (</font>svoju služobnicu <font color='#B71C1C'>M.)</font><br>" +
                    "a pridruž ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> k spoločenstvu svojich vyvolených.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Dobrotivý Bože,<br>" +
                    "vyslyš naše pokorné prosby,<br>" +
                    "ktorými vzývame tvoje milosrdenstvo<br>" +
                    "pre nášho brata <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>(</font>našu sestru <font color='#B71C1C'>M.</font>,<font color='#B71C1C'>)</font><br>" +
                    "ktorý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>)</font> na svete patril<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> k tvojmu ľudu; <font color='#B71C1C'>*</font><br>" +
                    "voveď ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> do kráľovstva pokoja a svetla <font color='#B71C1C'>—</font><br>" +
                    "a daj mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> účasť na večnej blaženosti<br>" +
                    "v spoločenstve tvojich svätých.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, prosíme ťa, <font color='#B71C1C'>*</font><br>" +
                    "buď milosrdný voči svojmu služobníkovi <font color='#B71C1C'>M.</font>,<br>" +
                    "<font color='#B71C1C'>(</font>svojej služobnici <font color='#B71C1C'>M.</font>,<font color='#B71C1C'>)</font><br>" +
                    "za ktorého (ktorú) ti prinášame<br>" +
                    "obetu chvály a zmierenia, <font color='#B71C1C'>—</font><br>" +
                    "a priveď ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> k slávnemu vzkrieseniu.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "posilnení životodarnou sviatosťou<br>" +
                    "prosíme ťa za nášho brata <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>(</font>našu sestru <font color='#B71C1C'>M.</font>,<font color='#B71C1C'>)</font><br>" +
                    "ktorého <font color='#B71C1C'>(</font>ktorú<font color='#B71C1C'>)</font> si pridružil k ľudu Novej zmluvy; <font color='#B71C1C'>*</font><br>" +
                    "očisť ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> touto svätou obetou, <font color='#B71C1C'>—</font><br>" +
                    "aby naveky žil<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> s Kristom v nebeskej blaženosti.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"5", "2", "Pri rozličných spomienkach za jedného zosnulého II", "Večný Bože,<br>" +
                    "osloboď svojho služobníka <font color='#B71C1C'>M. (</font>svoju služobnicu <font color='#B71C1C'>M.)</font><br>" +
                    "od všetkých pút hriechov; <font color='#B71C1C'>*</font><br>" +
                    "a keďže si ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> vo sviatosti krstu<br>" +
                    "urobil podobným (podobnou) Kristovi, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby pri slávnom vzkriesení<br>" +
                    "dosiahol <font color='#B71C1C'>(</font>dosiahla<font color='#B71C1C'>)</font> večnú blaženosť<br>" +
                    "v spoločenstve tvojich svätých.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "prinášame ti dary na slávenie obety,<br>" +
                    "ktorou si sňal hriechy sveta; <font color='#B71C1C'>*</font><br>" +
                    "zhliadni milostivo na svojho služobníka <font color='#B71C1C'>M.<br>" +
                    "(</font>na svoju služobnicu <font color='#B71C1C'>M.)</font><br>" +
                    "a daj, aby mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> osožila táto svätá omša.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "nech obeta tvojej Cirkvi osoží<br>" +
                    "nášmu bratovi <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>(</font>našej sestre <font color='#B71C1C'>M.</font>,<font color='#B71C1C'>)</font> <font color='#B71C1C'>—</font><br>" +
                    "aby spolu so všetkými svätými<br>" +
                    "žil<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> v spoločenstve s Kristom, ktorého prijímal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font><br>" +
                    "v tejto sviatosti lásky a milosrdenstva.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"6", "1", "Pri rozličných spomienkach za viacerých zosnulých I", "Všemohúci Bože,<br>" +
                    "ty si povýšil do nebeskej slávy<br>" +
                    "svojho Syna, víťaza nad smrťou; <font color='#B71C1C'>*</font><br>" +
                    "daj našim zosnulým bratom a sestrám <font color='#B71C1C'>(M.</font> a <font color='#B71C1C'>M.)</font><br>" +
                    "účasť na Kristovom víťazstve nad smrťou, <font color='#B71C1C'>—</font><br>" +
                    "aby mobil večne vidieť z tváre do tváre teba,<br>" +
                    "svojho Stvoriteľa a Záchrancu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, Stvoriteľ a Záchranca všetkých ľudí, <font color='#B71C1C'>*</font><br>" +
                    "vyslyš naše prosby<br>" +
                    "za tvojich služobníkov <font color='#B71C1C'>(M.</font> a <font color='#B71C1C'>M.)</font> <font color='#B71C1C'>—</font><br>" +
                    "a udeľ im odpustenie, po ktorom vždy túžili.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "láskavo zhliadni na obetné dary,<br>" +
                    "ktoré ti prinášame na obetu<br>" +
                    "za tvojich služobníkov; <font color='#B71C1C'>*</font><br>" +
                    "a keďže si im dal milosť kresťanskej viery, <font color='#B71C1C'>—</font><br>" +
                    "udeľ im aj odmenu za to, že podľa nej žili.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "zmiluj sa nad svojimi zosnulými služobníkmi,<br>" +
                    "za ktorých sme slávili tebe milú obetu, <font color='#B71C1C'>*</font><br>" +
                    "a pretože si ich vo sviatosti krstu<br>" +
                    "prijal do svojej rodiny, <font color='#B71C1C'>—</font><br>" +
                    "daj im prisľúbené dedičstvo v nebi.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Dobrotivý Otče,<br>" +
                    "nech tvojim zosnulým služobníkom<br>" +
                    "osoží naša modlitba; <font color='#B71C1C'>*</font><br>" +
                    "pre túto obetu očisť ich od všetkých hriechov <font color='#B71C1C'>—</font><br>" +
                    "a daj im účasť na večnej spáse.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"6", "2", "Pri rozličných spomienkach za viacerých zosnulých II", "Všemohúci a večný Bože,<br>" +
                    "ty si život smrteľných ľudí<br>" +
                    "a radosť oslávených v nebi; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme<br>" +
                    "za tvojich služobníkov <font color='#B71C1C'>(M.</font> a <font color='#B71C1C'>M.)</font>: <font color='#B71C1C'>—</font><br>" +
                    "zbav ich pút smrti<br>" +
                    "a voveď do slávy tvojho večného kráľovstva.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Všemohúci Bože,<br>" +
                    "ty si Pán živých i mŕtvych; <font color='#B71C1C'>*</font><br>" +
                    "preto ťa pokorne prosíme za našich zosnulých: <font color='#B71C1C'>—</font><br>" +
                    "láskavo im udeľ odpustenie,<br>" +
                    "aby v tebe našli plnú radosť<br>" +
                    "a chválili ťa cez celú večnosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary<br>" +
                    "za všetkých našich bratov a sestry,<br>" +
                    "čo zosnuli v spojení s Kristom, <font color='#B71C1C'>—</font><br>" +
                    "a pre túto vznešenú obetu<br>" +
                    "vysloboď ich z moci smrti<br>" +
                    "a voveď do večného života.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "Eucharistia, ktorú sme slávili,<br>" +
                    "nech slúži nám živým na posvätenie <font color='#B71C1C'>—</font><br>" +
                    "a našim zosnulým bratom a sestrám,<br>" +
                    "pre ktorých prosíme tvoje milosrdenstvo,<br>" +
                    "nech prinesie odpustenie a pokoj.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"6", "3", "Pri rozličných spomienkach za viacerých zosnulých III", "Všemohúci a večný Bože,<br>" +
                    "ty si život smrteľných ľudí<br>" +
                    "a radosť oslávených v nebi; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme<br>" +
                    "za tvojich služobníkov <font color='#B71C1C'>(M.</font> a <font color='#B71C1C'>M.)</font>: <font color='#B71C1C'>—</font><br>" +
                    "zbav ich pút smrti<br>" +
                    "a voveď do slávy tvojho večného kráľovstva.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Všemohúci Bože,<br>" +
                    "ty si Pán živých i mŕtvych; <font color='#B71C1C'>*</font><br>" +
                    "preto ťa pokorne prosíme za našich zosnulých: <font color='#B71C1C'>—</font><br>" +
                    "láskavo im udeľ odpustenie,<br>" +
                    "aby v tebe našli plnú radosť<br>" +
                    "a chválili ťa cez celú večnosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary<br>" +
                    "za všetkých našich bratov a sestry,<br>" +
                    "čo zosnuli v spojení s Kristom, <font color='#B71C1C'>—</font><br>" +
                    "a pre túto vznešenú obetu<br>" +
                    "vysloboď ich z moci smrti<br>" +
                    "a voveď do večného života.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "Eucharistia, ktorú sme slávili,<br>" +
                    "nech slúži nám živým na posvätenie <font color='#B71C1C'>—</font><br>" +
                    "a našim zosnulým bratom a sestrám,<br>" +
                    "pre ktorých prosíme tvoje milosrdenstvo,<br>" +
                    "nech prinesie odpustenie a pokoj.<br>" +
                    "Skrze Krista, nášho Pána."},
    };

    String[][] prosbyZosnuly = {
            {"", "V omšiach za zosnulých I.", "Bratia a sestry, s dôverou vzývajme všemohúceho Boha a prosme ho za spásu živých i mŕtvych, veď on vzkriesil svojho Syna Ježiša Krista.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, nášmu zosnulému bratovi <font color='#B71C1C'>M. (</font>našej zosnulej sestre <font color='#B71C1C'>M.)</font> si v krste otvoril bránu večného života; dobrotivo mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> udeľ večné spoločenstvo so svätými.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, náš zosnulý brat (naša zosnulá sestra) prijal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> Kristovo telo, chlieb večného života; vzkries jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> telo v posledný deň na večnú slávu.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, prosíme ťa za našich zomrelých bratov a sestry, príbuzných a dobrodincov; daj im odmenu za dobro, ktoré nám preukázali.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za všetkých, ktorí zosnuli v nádeji na vzkriesenie; prijmi ich do svojho svetla a ukáž im svoju tvár.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa za nás všetkých, ktorí sme sa tu zišli s vierou a láskou; zhromaždi nás raz vo svojom kráľovstve.",
                    "Bože Otče,<br>" +
                            "vypočuj naše pokorné prosby<br>" +
                            "za spásu našich bratov a sestier;<br>" +
                            "odpusť im hriechy a daj im účasť na večnej spáse.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Alebo:",
                    "V omšiach za zosnulých II.", "Bratia a sestry, s dôverou prosme Pána Ježiša, víťaza nad smrťou, za spásu živých i mŕtvych.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, pomáhaj pastierom Cirkvi pri ohlasovaní evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilni vo všetkých ľuďoch túžbu po večnom, nesmrteľnom živote.<br>" +
                            "<font color='#B71C1C'>3.</font> Zachráň nás od náhlej a nekajúcej smrti.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, nášmu bratovi <font color='#B71C1C'>M. (</font>našej sestre <font color='#B71C1C'>M.)</font> si v krste otvoril bránu večného života, preto vzkries jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> telo pre večný život.<br>" +
                            "<font color='#B71C1C'>5.</font> Poteš smútiacich príbuzných tohto zosnulého <font color='#B71C1C'>(</font>tejto zosnulej<font color='#B71C1C'>)</font> nádejou na stretnutie v nebeskom domove.",
                    "Milosrdný Spasiteľ, Ježišu Kriste,<br>" +
                            "zmiluj sa nad našimi<br>" +
                            "zosnulými bratmi a sestrami<br>" +
                            "a otvor im bránu nebeského kráľovstva,<br>" +
                            "aby ťa tam spolu<br>" +
                            "s preblahoslavenou Pannou Máriou,<br>" +
                            "s anjelmi a so všetkými svätými<br>" +
                            "oslavovali na veky vekov.",
                    "Alebo:",
            "V omšiach za zosnulých III.", "Bratia a sestry, Pán Ježiš nám bol podobný vo všetkom okrem hriechu. Niesol aj údel našich bolestí, umierania a smrti. Obráťme sa naňho so srdcom plným nádeje.",
                    "<font color='#B71C1C'>(</font>Volajme: Kyrie, eleison.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, náš Spasiteľ, ty ponúkaš večný život všetkým, ktorí v teba uverili; daj, nech táto viera prenikne naše srdcia, aby sme obstáli v živote i vo smrti.<br>" +
                    "<font color='#B71C1C'>2.</font> Prijmi dušu i telo nášho zosnulého brata <font color='#B71C1C'>M. (</font>našej zosnulej sestry <font color='#B71C1C'>M.)</font>, nech je smrť pre neho <font color='#B71C1C'>(</font>ňu<font color='#B71C1C'>)</font> vstupom do nového života.<br>" +
                    "<font color='#B71C1C'>3.</font> Prijmi dobré ovocie jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> života a premeň ho na požehnanie pre tých, ktorí sú zarmútení jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> odchodom.<br>" +
                    "<font color='#B71C1C'>4.</font> Odpusť nášmu zosnulému bratovi <font color='#B71C1C'>M. (</font>našej zosnulej sestre <font color='#B71C1C'>M.)</font> všetky hriechy a slabosti života.<br>" +
                    "<font color='#B71C1C'>5.</font> Zbav nás strachu zo smrti a nauč nás denne sa odovzdávať do tvojej vôle.",
                    "Pane Ježišu Kriste,<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "nech nás každé lúčenie<br>" +
                            "s našimi blízkymi<br>" +
                            "pevnejšie spája s tebou,<br>" +
                            "veď v nikom inom nemáme nádej na večnosť.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov.",
                    "Alebo:",
            "Na výročie smrti I.", "Bratia a sestry, pri výročnej spomienke na nášho zosnulého brata <font color='#B71C1C'>M. (</font>našu zosnulú sestru <font color='#B71C1C'>M.)</font> obráťme sa na nebeského Otca, ktorý dáva nový život bez konca.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, vo svojom milosrdenstve uveď nášho zosnulého brata <font color='#B71C1C'>M. (</font>našu zosnulú sestru <font color='#B71C1C'>M.)</font> do plnosti večného života, po ktorom túžil<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> počas svojej pozemskej púte.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, zhliadni na svojho služobníka <font color='#B71C1C'>M. (</font>na svoju služobnicu <font color='#B71C1C'>M.)</font>, ktorý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>)</font> prijímal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> telo tvojho Syna ako pokrm večného života, a daj mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> účasť na večnej Baránkovej hostine.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, pamätaj na tých, ktorí zomreli ako obete násilia a vojny, a uveď ich do večného pokoja.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, daj, nech biskupi a kňazi presvedčivo ohlasujú, že Pán príde súdiť živých i mŕtvych.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, daj, nech nám eucharistický pokrm, ktorý prijmeme v tejto svätej omši, slúži na spásu tela a duše.",
                    "Vypočuj, Otče, naše prosby<br>" +
                            "ako hlas silnej nádeje<br>" +
                            "a daj našim zosnulým radostný večný život.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Alebo:",
            "Na výročie smrti II.", "Bratia a sestry, Boh tak miloval svet, že dal svojho jednorodeného Syna, aby nezahynul nik, kto v neho verí, ale aby mal večný život. Preto s dôverou prosme nášho Spasiteľa, ktorý za nás zomrel a vstal z mŕtvych.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, odporúčame ti nášho zosnulého brata <font color='#B71C1C'>M. (</font>našu zosnulú sestru <font color='#B71C1C'>M.)</font>; priveď ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> do radosti svojho kráľovstva.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, daj, nech biskupi a kňazi Cirkvi ochotne vysluhujú sviatosti chorých a veriaci nech s radosťou prijímajú pokrm na cestu do večnosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, osvieť všetkých ľudí svojím Duchom, aby sa pod zorným uhlom večnosti usilovali chrániť život a dbali na dôstojnosť ľudskej osoby.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, prosíme ťa za tých, ktorí zomreli pri živelných pohromách, buď im milosrdný a prijmi ich do svojho kráľovstva.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, náš život a naše vzkriesenie, chráň nás od náhlej smrti a daj, aby sme boli vždy pripravení predstúpiť pred teba.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane Ježišu, daj, aby sme s veľkou úctou a láskou prijímali chlieb života, ktorý je zárukou, že budeme žiť naveky.",
                    "Pane Ježišu, prijmi naše prosby<br>" +
                            "a pre svoju smrť na kríži buď milosrdný<br>" +
                            "našim zosnulým bratom a sestrám a daj,<br>" +
                            "aby sme sa všetci stretli u teba v priateľskej láske.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov.",
                    "Alebo:",
            "Za zosnulého kňaza", "Bratia a sestry, s vierou prosme Boha za zomrelého kňaza <font color='#B71C1C'>M.</font>, aby mu blaženosť večného života bola odmenou za jeho kňazskú službu.",
                    "<font color='#B71C1C'>(</font>Volajme: Milosrdný Bože, vypočuj naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, udeľ večnú spásu zomrelému kňazovi <font color='#B71C1C'>M.</font><br>" +
                    "<font color='#B71C1C'>2.</font> Daruj Cirkvi svätých kňazov, ktorí žijú pre službu tebe a blížnym.<br>" +
                    "<font color='#B71C1C'>3.</font> Priveď svet k uznaniu duchovného prínosu služby kňazov.<br>" +
                    "<font color='#B71C1C'>4.</font> Veď rodičov k tomu, aby prebúdzali v deťoch zmysel pre obetu.<br>" +
                    "<font color='#B71C1C'>5.</font> Posilňuj chorých kňazov, obzvlášť tých, ktorí sú vyčerpaní službou Božiemu ľudu.<br>" +
                    "<font color='#B71C1C'>6.</font> Pre Ježišovo víťazstvo nad smrťou uveď svojho zosnulého služobníka kňaza <font color='#B71C1C'>M.</font> do večnej slávy.<br>" +
                    "<font color='#B71C1C'>7.</font> Nahraď miesta zomrelých kňazov novými kňazskými povolaniami.<br>" +
                    "<font color='#B71C1C'>8.</font> Pripoj k spoločenstvu svätých v nebi všetkých, ktorých si na tomto svete obdaroval milosťou svätého kňazstva.",
                    "Všemohúci Bože, ty si Pánom a darcom života;<br>" +
                            "daruj večný život vo svojom kráľovstve<br>" +
                            "zosnulému kňazovi <font color='#B71C1C'>M.</font>,<br>" +
                            "aby ťa so všetkými svätými chválil<br>" +
                            "a oslavoval v nebi naveky.<br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] prosbyPrvyPiatok = {
            //NA PRVÝ PIATOK MESIACA I.
            {"", "", "Na prvý piatok mesiaca I.", "Bratia a sestry, Pán Ježiš nás vyzýva: Učte sa odo mňa, lebo som tichý a pokorný srdcom. Prosme ho o silu nasledovať čnosti jeho Najsvätejšieho Srdca:",
                                        "<font color='#B71C1C'>(</font>Volajme: Srdce Ježišovo, zmiluj sa nad nami.<font color='#B71C1C'>)</font>",
                                        "<font color='#B71C1C'>1.</font> Pane Ježišu, pomáhaj Cirkvi žiť z tvojej svätosti, múdrosti a lásky.<br>" +
                                                "<font color='#B71C1C'>2.</font> Pane Ježišu, nauč ľudí chápať, že veľké veci môžu poznávať len pokorným srdcom.<br>" +
                                                "<font color='#B71C1C'>3.</font> Pane Ježišu, posilňuj kresťanov, aby premieňali dary tvojej milosti na obetavú a milosrdnú lásku k svojim blížnym.<br>" +
                                                "<font color='#B71C1C'>4.</font> Pane Ježišu, uč nás svojím slovom a obetou stále viac ťa milovať a horlivejšie nasledovať.<br>" +
                                                "<font color='#B71C1C'>5.</font> Pane Ježišu, dopraj milosť ľútosti v poslednej chvíli tým umierajúcim, ktorí nie sú pripravení na stretnutie s tebou.",
                                        "Ježišu, tichý a pokorný srdcom,<br>" +
                                                "ty nepohŕdaš nikým a neopustíš žiadneho človeka;<br>" +
                                                "vypočuj naše prosby<br>" +
                                                "a daj, nech vždy čerpáme z veľkosti tvojej lásky<br>" +
                                                "a vydávame o nej svedectvo vo svete.<br>" +
                                                "Lebo ty žiješ a kraľuješ na veky vekov.",
                                //NA PRVÝ PIATOK MESIACA II.
                            "Alebo:",
                    "Na prvý piatok mesiaca II.", "Bratia a sestry, Boh nám zjavuje lásku vo svojom Synovi Ježišovi Kristovi. Jeho srdce je zdrojom bohatstva a nesmiernej veľkosti tejto lásky. Prosme s dôverou, nech máme čo najväčší podiel na jeho svätosti a pokore.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                            "<font color='#B71C1C'>1.</font> Bože, urob biskupov a kňazov spoľahlivými nástrojmi tvojich zámerov.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, vychovávaj svoj ľud, aby žil životom zasväteným tebe a usiloval sa o jednotu vo viere a láske.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, daj svetu poznať tajomstvo svojej lásky, ktorá zachraňuje ľudstvo pred hriechom a skazou.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, upevni v ľuďoch túžbu žiť hlbokým duchovným životom.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, uč nás poznávať cenu tichosti a pokory v osobnom i spoločenskom živote.<br>" +
                            "<font color='#B71C1C'>6.</font> Bože, buď nádejou všetkých, ktorí v tebe zomierajú.",
                    "Bože Otče, v srdci tvojho milovaného Syna<br>" +
                            "nachádzame všetko,<br>" +
                            "čo potrebujeme na jeho nasledovanie;<br>" +
                            "daj, nech tak prijímame tieto milosti,<br>" +
                            "aby sme ti zostali verní až do večnosti.<br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] pandemiaFormular = {
            //spevy
            {"On niesol naše neduhy,<br>" +
                    "vzal na seba naše bolesti.", "Iz 53, 4",
                    "Poďte ku mne všetci, ktorí sa namáhate<br>" +
                            "a ste preťažení, a ja vás posilním.", "Mt 11, 28"},
            //modlitby
            {"Všemohúci a večný Bože,<br>" +
                    "ty si osobitným útočiskom v každom nebezpečenstve<br>" +
                    "a vždy nás vypočuješ, keď sa k tebe v trápení s vierou utiekame; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, milostivo na nás zhliadni<br>" +
                    "a udeľ večné odpočinutie zomrelým, útechu plačúcim,<br>" +
                    "zdravie chorým, pokoj zomierajúcim,<br>" +
                    "silu zdravotníkom,<br>" +
                    "ducha múdrosti verejným predstaviteľom<br>" +
                    "a odvahu pristupovať ku všetkým s láskou, <font color='#B71C1C'>–</font><br>" +
                    "aby sme mohli spoločne oslavovať tvoje sväté meno.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "Pane, prijmi dary, ktoré ti predkladáme<br>" +
                    "v tomto čase ohrozenia, <font color='#B71C1C'>*</font><br>" +
                    "a dopraj, prosíme, <font color='#B71C1C'>–</font><br>" +
                    "aby sa z tvojej moci stali pre nás<br>" +
                    "prameňom uzdravenia a pokoja.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože, z tvojich rúk sme prijali<br>" +
                    "liek večného života; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, <font color='#B71C1C'>–</font><br>" +
                    "aby sme skrze túto sviatosť<br>" +
                    "dosiahli plnosť nebeských milostí.<br>" +
                    "Skrze Krista nášho Pána."},
            //prosby (za chorých II.)
            {"Bratia a sestry, pamätajme vo svojich modlitbách na tých, ktorí pre chorobu trpia na tele alebo na duši. Modlime sa za nich i za seba a volajme:",
                    "<font color='#B71C1C'>(</font>Ježišu, uzdrav naše duše.<font color='#B71C1C'>)</font>",
                    "1. Pane, daj, aby Cirkev vedená Duchom Svätým <br>" +
                            "vždy kráčala po ceste pravdy <br>" +
                            "a pevne sa pridŕžala zásad evanjelia. <br>" +
                            "2. Pomôž lekárom vo svete účinne a nezištne <br>" +
                            "hľadať lieky proti chorobám dnešnej civilizácie. <br>" +
                            "3. Vzbudzuj v chorých a trpiacich <br>" +
                            "odhodlanie obetovať svoju chorobu tebe <br>" +
                            "a modlitbou čeliť bolesti a súženiu. <br>" +
                            "4. Ochraňuj nás od chorôb ducha, <br>" +
                            "aby sme si zachovali čistú myseľ <br>" +
                            "a nedali sa manipulovať zlým duchom. <br>" +
                            "5. Vylieč duše našich zosnulých zo všetkých previnení <br>" +
                            "a dovoľ im prebývať v tvojej blaženosti.",
                    "Pane Ježišu, <br>" +
                            "ty si najlepším lekárom; <br>" +
                            "vyslyš naše prosby a posilni tých, <br>" +
                            "ktorí ochotne znášajú bremeno bolesti, <br>" +
                            "aby nám boli príkladom v utrpení, <br>" +
                            "ktoré spájajú s tvojím krížom. <br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            //prve citanie
            {"Nár 3, 17–26", "Dobre je v tichosti očakávať Pánovu záchranu",
                    "Čítanie z Knihy Náreky" +
                            "Moja duša je zbavená pokoja,<br>" +
                            "zabudol som, čo je blaho.<br>" +
                            "Povedal som: „Zanikla moja sláva<br>" +
                            "aj to, čo som dúfal od Pána.“<br>" +
                            "Spomeň si na moju chudobu a na moje blúdenie,<br>" +
                            "na palinu a jed.<br>" +
                            "Stále na to myslí<br>" +
                            "a chradne moja duša vo mne.<br>" +
                            "O tomto budem uvažovať vo svojom srdci,<br>" +
                            "preto budem dúfať.<br>" +
                            "Je Pánovo milosrdenstvo, že sme nevyhynuli,<br>" +
                            "že neprestalo jeho zľutovanie.<br>" +
                            "Každé ráno je nové;<br>" +
                            "veľká je tvoja vernosť.<br>" +
                            "„Pán je môj podiel, hovorí moja duša,<br>" +
                            "preto ho budem očakávať.“<br>" +
                            "Pán je dobrý k tým, čo v neho dúfajú,<br>" +
                            "k človeku, ktorý ho hľadá.<br>" +
                            "Dobre je v tichosti očakávať<br>" +
                            "Pánovu záchranu.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Rim 8, 31b–39",
                    "Ani smrť ani život nás nebude môcť odlúčiť od Božej lásky",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, ak je Boh za nás, kto je proti nám? Keď on vlastného Syna neušetril, ale vydal ho za nás všetkých, akože by nám s ním nedaroval všetko?!<br>" +
                            "Kto obžaluje Božích vyvolencov? Boh, ktorý ospravedlňuje? A kto ich odsúdi? Kristus Ježiš, ktorý zomrel, ba viac – ktorý bol vzkriesený, je po pravici Boha a prihovára sa za nás?<br>" +
                            "Kto nás odlúči od Kristovej lásky? Azda súženie, úzkosť alebo prenasledovanie, hlad alebo nahota, nebezpečenstvo alebo meč? Ako je napísané:<br>" +
                            "„Pre teba nás usmrcujú deň čo deň,<br>" +
                            "pokladajú nás za ovce na zabitie.“<br>" +
                            "Ale v tomto všetkom slávne víťazíme skrze toho, ktorý nás miluje. <br>" +
                            "A som si istý, že ani smrť, ani život, ani anjeli, ani kniežatstvá, ani prítomnosť, ani budúcnosť, ani mocnosti, ani výška, ani hĺbka, ani nijaké iné stvorenie nás nebude môcť odlúčiť od Božej lásky, ktorá je v Kristovi Ježišovi, našom Pánovi."},
            //zalm
            {"Ž 80, 2ac+3b. 5–7", "<font color='#B71C1C'>R.:</font> Rozjasni, Pane, svoju tvár a budeme spasení.<br><br>" +
                    "Pastier Izraela, počúvaj! <font color='#B71C1C'>*</font><br>" +
                    "Ty, čo tróniš nad cherubmi, zaskvej sa!<br>" +
                    "Vzbuď svoju moc <font color='#B71C1C'>*</font><br>" +
                    "a príď nás zachrániť. <font color='#B71C1C'>– R.</font><br>" +
                    "Pane, Bože zástupov, <font color='#B71C1C'>*</font><br>" +
                    "dokedy sa budeš hnevať na modlitby svojho ľudu?<br>" +
                    "Kŕmil si nás ako chlebom slzami <font color='#B71C1C'>*</font><br>" +
                    "slzami si nás napájal v hojnosti.<br>" +
                    "Dopustil si, že sa pre nás svária naši susedia <font color='#B71C1C'>*</font><br>" +
                    "a naši nepriatelia si z nás robia posmech. <font color='#B71C1C'>– R.</font>",
                    "Alebo:",
                    "Ž 123, 1–2a. 2bcd",
                    "<font color='#B71C1C'>R.:</font> Zmiluj sa, Pane, nad nami, zmiluj sa nad nami.<br><br>" +
                            "Oči dvíham k tebe, <font color='#B71C1C'>*</font><br>" +
                            "čo na nebesiach prebývaš.<br>" +
                            "Ako oči sluhov hľadia <font color='#B71C1C'>*</font><br>" +
                            "na ruky svojich pánov, <font color='#B71C1C'>– R.</font><br>" +
                            "ako oči služobníc hľadia <font color='#B71C1C'>*</font><br>" +
                            "na ruky svojej panej,<br>" +
                            "tak hľadia naše oči na Pána, nášho Boha, <font color='#B71C1C'>*</font><br>" +
                            "kým sa nezmiluje nad nami. <font color='#B71C1C'>– R.</font>"},
            //alelujovy vers
            {"2 Kor 1, 3b–4a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nech je zvelebený Otec milosrdenstva a Boh všetkej útechy! On nás potešuje v každom našom súžení. <font color='#B71C1C'>– R.</font> Aleluja.",
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy. <br>" +
                            " Nech je zvelebený Otec milosrdenstva a Boh všetkej útechy! On nás potešuje v každom našom súžení." +
                            "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            //evanjelium
            {"Mk 4, 35–41",
                    "Kto je to, že ho i vietor i more poslúchajú",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého Evanjelia podľa Marka<br>" +
                            "Keď sa zvečerilo, povedal Ježiš svojim učeníkom: „Prejdime na druhý breh.“ I opustili zástup, a vzali ho so sebou tak, ako bol, na lodi. Boli s ním aj iné lode. <br>" +
                            "Tu sa strhla veľká víchrica a vlny sa valili na loď, takže sa loď už napĺňala. On bol v zadnej časti lode a spal na poduške. Zobudili ho a povedali mu: „Učiteľ, nedbáš o to, že hynieme?“ On vstal, pohrozil vetru a povedal moru: „Mlč, utíš sa!“ Vietor prestal a nastalo veľké ticho. <br>" +
                            "A im povedal: „Čo sa tak bojíte?! Ešte stále nemáte vieru?“ <br>" +
                            "Zmocnil sa ich veľký strach a jeden druhému hovorili: „Čo myslíš, kto je to, že ho i vietor, i more poslúchajú!“<br>" +
                            "Počuli sme slovo Pánovo."},
            //prefacia
            {"Ježiš, kade chodil, dobre robil",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                    "Je naozaj dôstojné a správne,<br>" +
                    "dobré a spásonosné<br>" +
                    "vzdávať vďaky vždy a všade tebe,<br>" +
                    "milosrdný Otče a verný Bože.<br>" +
                    "Lebo ty si nám daroval Ježiša Krista,<br>" +
                    "svojho Syna, za Pána a Vykupiteľa.<br>" +
                    "On sa vždy prejavoval ako milosrdný<br>" +
                    "voči malým a chudobným, <br>" +
                    "slabým a hriešnym,<br>" +
                    "stal sa blížny utláčaným a zarmúteným.<br>" +
                    "Slovom a príkladom zvestoval svetu,<br>" +
                    "že si Otec<br>" +
                    "a staráš sa o všetky svoje deti.<br>" +
                    "A preto ťa s anjelmi a so všetkými svätými<br>" +
                    "oslavujeme a chválime,<br>" +
                    "spievame pieseň na tvoju slávu<br>" +
                    "a bez prestania voláme:<br>" +
                            "<br>" +
                    "Svätý, svätý, svätý Pán Boh všetkých svetov.<br>" +
                    "Plné sú nebesia i zem tvojej slávy.<br>" +
                    "Hosanna na výsostiach!<br>" +
                    "Požehnaný, ktorý prichádza v mene Pánovom.<br>" +
                    "Hosanna na výsostiach!"},
            //EM
            {"", "<font color='#B71C1C'>HI</font> Naozaj si svätý a hoden chvály,<br>" +
                    "Bože, ty miluješ všetkých ľudí<br>" +
                    "a vždy si s nimi na ceste života.<br>" +
                    "Naozaj zvelebený je tvoj Syn<br>" +
                    "prítomný uprostred nás,<br>" +
                    "keď nás jeho láska zhromažďuje,<br>" +
                    "a ako kedysi učeníkom<br>" +
                    "otvára nám Písma a láme chlieb.",
                    "Zopne ruky, vystrie ich nad obetné dary a hovorí:",
                    "<font color='#B71C1C'>Vš</font> Prosíme ťa teda, najláskavejší Otče,<br>" +
                    "zošli svojho Svätého Ducha,<br>" +
                    "nech posvätí tieto dary chleba a vína,",
                    "Zopne ruky, urobí znak kríža nad chlebom a kalichom a hovorí:",
                    "aby sa nám stali telom a <font color='#B71C1C'>+</font> krvou<br>" +
                    "nášho Pána, Ježiša Krista.",
                    "Zopne ruky.<br>" +
                    "V nasledujúcich formulách treba predniesť Pánove slová jasne a zrozumiteľne, ako to ich povaha vyžaduje.",
                    "On pred svojím umučením <br>" +
                    "pri Poslednej večeri",
                    "vezme chlieb<br>" +
                    "drží ho trochu pozdvihnutý nad oltárom a pokračuje:",
                    "vzal chlieb, dobrorečil, lámal ho<br>" +
                    "a dával svojim učeníkom, hovoriac:",
                    "trocha sa skloní",
                    "VEZMITE\n" +
                    "A JEDZTE Z NEHO VŠETCI:\n" +
                    "TOTO JE MOJE TELO,\n" +
                    "KTORÉ SA OBETUJE ZA VÁS.",
                    "Ukáže konsekrovanú hostiu ľudu, znova ju položí na paténu a pokľaknutím adoruje.",
                    "Podobne po večeri",
                    "vezme kalich<br>" +
                    "drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
                    "vzal kalich,<br>" +
                    "vzdával ti vďaky<br>" +
                    "a dal ho svojim učeníkom, hovoriac:",
                    "trocha sa skloní",
                    "VEZMITE\n" +
                    "A PITE Z NEHO VŠETCI:\n" +
                    "TOTO JE KALICH MOJEJ KRVI,\n" +
                    "KTORÁ SA VYLIEVA ZA VÁS\n" +
                    "I ZA VŠETKÝCH\n" +
                    "NA ODPUSTENIE HRIECHOV.\n" +
                    "JE TO KRV\n" +
                    "NOVEJ A VEČNEJ ZMLUVY.\n" +
                    "TOTO ROBTE NA MOJU PAMIATKU.",
                    "Ukáže konsekrovanú hostiu ľudu, znova ju položí na paténu a pokľaknutím adoruje.<br>" +
                    "Potom povie:",
                    "<font color='#B71C1C'>HI</font> Hľa, tajomstvo viery.",
                    "Ľud odpovie zvolaním:",
                    "Smrť tvoju, Pane, zvestujeme a tvoje zmŕtvychvstanie vyznávame, kým neprídeš v sláve.",
                    "BAR", "",
                    "Druhá formula:",
                    "<font color='#B71C1C'>HI</font> Vyznajme tajomstvo viery.<br>" +
                    "Pane, keď jeme tento chlieb a pijeme z tohto kalicha, zvestujeme tvoju smrť, kým neprídeš v sláve.",
                    "Tretia formula:",
                    "<font color='#B71C1C'>HI</font> Veľké je tajomstvo viery.<br>" +
                    "Spasiteľ sveta, zachráň nás, veď ty si nás vykúpil svojím krížom a zmŕtvychvstaním.",
                    "BAR", "",
                    "Potom kňaz s rozopätými rukami hovorí:",
                    "<font color='#B71C1C'>Vš</font> Preto aj my, svätý Otče,<br>" +
                    "slávime pamiatku Krista,<br>" +
                    "tvojho Syna, nášho Spasiteľa,<br>" +
                    "ktorého si skrze umučenie a smrť na kríži<br>" +
                    "priviedol k sláve vzkriesenia<br>" +
                    "a posadil si ho po svojej pravici.<br>" +
                    "Ohlasujeme dielo tvojej lásky,<br>" +
                    "kým sám nepríde,<br>" +
                    "a obetujeme ti chlieb života<br>" +
                    "a kalich dobrorečenia.<br>" +
                    "<br>" +
                    "Láskavo zhliadni na dar svojej Cirkvi;<br>" +
                    "v ňom prinášame<br>" +
                    "veľkonočnú Kristovu obetu,<br>" +
                    "ktorú nám on odovzdal,<br>" +
                    "a udeľ, aby sme mocou Ducha tvojej lásky<br>" +
                    "boli pripočítaní teraz i v deň večnosti<br>" +
                    "k údom tvojho Syna,<br>" +
                    "ktorého telo a krv prijímame.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>1.k</font> Pane, milostivo zdokonaľuj svoju Cirkev<br>" +
                    "vo viere a láske<br>" +
                    "v jednote s naším pápežom <font color='#B71C1C'>M.</font>,<br>" +
                    "s naším biskupom <font color='#B71C1C'>M.</font>,<br>" +
                    "so všetkými biskupmi,<br>" +
                    "presbytermi a diakonmi<br>" +
                    "a so všetkým tvojím získaným ľudom.<br>" +
                    "Otvor naše oči,<br>" +
                    "aby sme poznali potreby bratov a sestier,<br>" +
                    "vnukni nám slová a skutky,<br>" +
                    "aby sme posilnili tých,<br>" +
                    "ktorí sa namáhajú a sú preťažení,<br>" +
                    "a daj, aby sme im nezištne slúžili<br>" +
                    "podľa Kristovho príkladu a jeho príkazu.<br>" +
                    "Nech je tvoja Cirkev živým svedectvom<br>" +
                    "pravdy a slobody,<br>" +
                    "pokoja a spravodlivosti,<br>" +
                    "aby všetci ľudia povstali k novej nádeji.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>2.k</font> Pamätaj na našich bratov a sestry <font color='#B71C1C'>(M.</font> a <font color='#B71C1C'>M.)</font>,<br>" +
                    "ktorí odpočívajú v Kristovom pokoji,<br>" +
                    "a na všetkých zosnulých,<br>" +
                    "ktorých vieru iba ty si poznal:<br>" +
                    "dovoľ im tešiť sa zo svetla tvojej tváre<br>" +
                    "a daruj im vo vzkriesení plnosť života.<br>" +
                    "Aj nám dožič,<br>" +
                    "aby sme po skončení pozemského putovania<br>" +
                    "prišli do večného príbytku,<br>" +
                    "kde budeme navždy žiť s tebou<br>" +
                    "a v spoločenstve s preblahoslavenou Pannou,<br>" +
                    "Bohorodičkou Máriou,<br>" +
                    "s apoštolmi a mučeníkmi<br>" +
                    "<font color='#B71C1C'>(</font>so svätým <font color='#B71C1C'>M., svätcom dňa alebo patrónom)</font><br>" +
                    "a so všetkými svätými ťa budeme<br>" +
                    "chváliť a oslavovať",
                    "Zopne ruky:",
                    "skrze Ježiša Krista, tvojho Syna.",
                    "Vezme paténu s hostiou a kalich, pozdvihne ich a hovorí:",
                    "<font color='#B71C1C'>Vš</font> Skrze Krista, s Kristom a v Kristovi<br>" +
                    "máš ty, Bože Otče všemohúci,<br>" +
                    "v jednote s Duchom Svätým<br>" +
                    "všetku úctu a slávu<br>" +
                    "po všetky veky vekov.",
                    "Ľud zvolá:",
                    "Amen.",},
            //modlitby nad ľudom
            {"", "Diakon (alebo ak ho niet, sám kňaz) obráti sa na veriacich týmito alebo podobnými slovami: ",
                    "<m>Prijmite slávnostné požehnanie. ",
                    "Potom kňaz vystrie ruky nad ľud a prednesie modlitbu. Všetci odpovedia: ",
                    "<m>Amen. ",
                    "Po modlitbe kňaz vždy dodá: ",
                    "<m>Nech vás žehná všemohúci Boh, Otec i Syn ", "+ ", "<m>i Duch Svätý. ",
                    "Ľud odpovie: ",
                    "<m>Amen.\n", "",
                    "<br>Bože, ochranca všetkých, čo v teba dúfajú,<br>" +
                    "požehnaj, spas a ochraňuj svoj ľud,<br>" +
                    "aby oslobodený od hriechov a chránený pred nepriateľom spásy<br>" +
                    "neprestajne kráčal v tvojej láske.<br>" +
                    "Skrze Krista, nášho Pána."},

    };
}


