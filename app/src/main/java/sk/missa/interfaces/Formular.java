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
25 - omsa o mucenikoch misionaroch (viacerych)
28 - omsa o mucenikoch misionaroch (jedneho)
26 - omsa o panne mucenici
27 - omsa o svatej zene mucenici
SPOLOCNE OMSE DUCHOVNYCH PASTIEROV,
31 - omsa o papezoch alebo biskupov (papez)
36 - omsa o papezoch alebo biskupov (biskup)
32 - omsa o biskupoch
33 - omsa o duchovnych pastieroch (viacerych)
37 - omsa o duchovnych pastieroch (jedneho)
34 - omsa o zakladateloch miestych cirkvi (jedneho)
38 - omsa o zakladateloch miestych cirkvi (viacerych)
35 - omsa o misionaroch
SPOLOCNE OMSE UCITELOV CIRKVI
4 – omse ucitelov cirkvi
SPOLOCNE OMSE PANNIEN
51 – omsa o jednej panne
52 - omsa o viacerych pannach
SPOLOCNE OMSE SVATYCH MUZOV A SVATYCH ZIEN
61 - omse svatych muzov a svatych zien
60 - omse svatych muzov a svatych zien (jedneho)
62 - omsa o mnichoch a reholnikoch (opat)
66 - omsa o mnichoch a reholnikoch (mnich)
67 - omsa o mnichoch a reholnikoch (mniska)
68 - omsa o mnichoch a reholnikoch (reholnik)
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
            {"03a", "22", "32"},
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
            {"27", "4", "62"},
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
            {"10", "4", "33"},
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
            {"1op", "01a", "01"},
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
            {"1op", "01a", "01"},
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
            {"12", "62"},
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
            {"17a", "32", "4"},
            {"17b", "4", "62"},
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
            {"01a", "1", "Votívna omša 1.", "Božia láska je rozliata v našich srdciach skrze Ducha Svätého, ktorý v nás prebýva.", "(Rim 5, 5; porov. 8, 11)",
                    " Upevni, Bože, čo si v nás vykonal, zo svojho svätého chrámu v Jeruzaleme.", "(Porov. Ž 68, 29 – 30)"},
            {"01a", "2", "Votívna omša 2.", "Keď príde Duch pravdy, naučí vás celú pravdu, hovorí Pán.", "(Porov. Jn 14, 26; 15, 26)",
                    "Duch, ktorý vychádza od Otca, on ma oslávi, hovorí Pán.", "(Jn 15, 26; 16, 14)"},
            {"01a", "3", "Votívna omša 3.", "Duch Pána je nado mnou, poslal ma hlásať evanjelium chudobným, hovorí Pán.", "(Lk 4, 18)",
                    "Keď zošleš svojho Ducha, sú stvorené, a obnovuješ tvárnosť zeme.", "(Porov. Ž 104, 30)"},
            {"01", "1", "Zoslanie Ducha Svätého", "Pánov duch napĺňa zemekruh a ten, čo udržuje všetko, pozná každý hlas, aleluja.<br>" +
                    "<font color='#B71C1C'>Alebo: (Rim 5, 5; porov. 8, 11)</font><br>" +
                    "Božia láska je rozliata v našich srdciach skrze Ducha Svätého, ktorý v nás prebýva, aleluja.", "(Múd 1, 7)",
                    "Všetkých naplnil Duch Svätý a začali hovoriť o veľkých Božích skutkoch, aleluja.", "(Sk 2, 4. 11)"},
            {"02", "1", "Najsvätejšieho Srdca Ježišovho", "Myšlienky jeho Srdca z pokolenia na pokolenie, aby ich zachránil pred smrťou a v čase hladu nakŕmil.", "(Ž 33, 11. 19)",
                    "Pán hovorí: Ak je niekto smädný, nech príde ku mne a nech pije. A z vnútra toho, kto verí vo mňa, potečú prúdy živej vody.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 19, 34)</font><br>" +
                            "Jeden z vojakov mu kopijou prebodol bok, a hneď vyšla krv a voda.", "(Jn 7, 37 – 38)"},
            {"03", "1", "Votívna omša o Najsvätejšom Srdci Ježišovom", "Myšlienky jeho srdca trvajú z pokolenia na pokolenie: aby ich zachránil pred smrťou a v čase hladu nakŕmil.", "(Ž 33, 11. 19)",
                    "Pán hovorí: Ak je niekto smädný a verí vo mňa, nech príde ku mne a nech pije. Z jeho vnútra potečú prúdy živej vody.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 19, 34)</font><br>" +
                            "Jeden z vojakov mu kopijou prebodol bok, a hneď vyšla krv a voda.", "(Jn 7, 37 – 38)"},
            {"04", "1", "Výročie posviacky chrámu (slávenie mimo chrámu)", "Videl som, ako z neba od Boha zostupuje sväté mesto, nový Jeruzalem,<br>" +
            "vystrojené ako nevesta, ozdobená pre svojho ženícha <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Zjv 21, 3)</font><br>" +
                    "Hľa, Boží stánok je medzi ľuďmi! A bude medzi nimi prebývať; oni budú jeho ľudom a sám Boh – ich Boh – bude s nimi <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Zjv 21, 2)",
            "Dajte sa vbudovať aj vy ako živé kamene do duchovného domu, do svätého kňazstva <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Mt 21, 13; Lk 11, 10)</font><br>" +
                    "Môj dom sa bude volať domom modlitby, hovorí Pán. V ňom každý, kto prosí, dostane, a kto hľadá, nájde, a kto klope, tomu otvoria <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. 1 Pt 2, 5)"},

            // SPOLOCNE OMSE PREBLAHOSLAVENEJ PANNY MÁRIE
            {"11", "1", "Omša k preblahoslavenej Panne Marií 1.", "Zdravas', svätá Matka. Ty si porodila Kráľa, ktorý večne vládne nad nebom i zemou.", "(Sedulius)",
                    "Blahoslavená si, Panna Mária, lebo si nosila Syna večného Otca.", "(Porov. Lk 11, 27)"},
            {"11", "2", "Omša k preblahoslavenej Panne Marií 2.", "Blahoslavená si, Panna Mária, lebo si nosila Stvoriteľa sveta; porodila si toho, ktorý ťa stvoril, a naveky ostávaš pannou.", "",
                    "Veľké veci mi urobil ten, ktorý je mocný, a sväté je jeho meno.", "(Lk 1, 49)"},
            {"11", "3", "Omša k preblahoslavenej Panne Marií 3.", "Požehnaná si, Panna Mária, od Pána, Boha najvyššieho, viac než všetky ženy na zemi, lebo tak preslávil tvoje meno, že ťa ľudia nikdy neprestanú chváliť.", "(Porov. Jdt 13, 18 – 19)",
                    "Blahoslaviť ma budú všetky pokolenia, lebo Boh zhliadol na poníženú služobnicu.", "(Porov. Lk 1, 48)"},
            {"11", "4", "Omša k preblahoslavenej Panne Marií 4.", "O tvoju priazeň sa budú uchádzať veľmoži národa. V pestrom rúchu ju vedú ku kráľovi. Sprevádza ich jasot radostný, tak vstupujú do kráľovského paláca.", "(Porov. Ž 45, 13. 15. 16)",
                    "Chváľte Pána, nášho Boha, ktorý v Márii, svojej služobnici, splnil svoje milosrdenstvo, ktoré sľúbil Izraelovmu domu.", ""},
            {"11", "5", "Omša k preblahoslavenej Panne Marií 5.", "Zdravas', Mária, milosti plná, Pán s tebou; požehnaná si medzi ženami a požehnaný je plod tvojho života.", "(Porov. Lk 1, 28. 42)",
                    "Slávne veci sa hovoria o tebe, Panna Mária, lebo veľké veci ti urobil ten, ktorý je mocný.", "(Porov. Ž 87, 3; Lk 1, 49)"},
            {"11", "6", "Omša k preblahoslavenej Panne Marií 6.", "Jesseho ratolesť rozkvitla; Panna zrodila Boha a človeka. Boh obnovil pokoj, všetko zmieril so sebou.", "",
                    "Z tvojich perí plynie milota: preto ťa Boh požehnal naveky.", "(Ž 45, 3)"},
            {"11", "7", "Omša k preblahoslavenej Panne Marií 7.", "Mária povedala: Môj duch jasá v Bohu, mojom Spasiteľovi, lebo zhliadol na poníženosť svojej služobnice.", "(Porov. Lk 1, 47 – 48)",
                    "Mária zachovávala všetky tieto slová vo svojom srdci.", "(Lk 2, 19)"},
            {"11", "8", "Omša k preblahoslavenej Panne Marií 8.", "Blahoslavená si, svätá Panna Mária, a všetkej chvály najhodnejšia: lebo z teba vzišlo slnko spravodlivosti, Kristus, náš Boh, skrze ktorého sme spasení a vykúpení.", "",
                    "Pán zhliadol na poníženosť svojej služobnice, hľa, od tejto chvíle blahoslaviť ma budú všetky pokolenia.", "(Porov. Lk 1, 48)"},
            // 4 – iba v adventnom obdobi
            {"12", "1", "Omša k preblahoslavenej Panne Marií", "Roste, nebesia, z výsosti, z oblakov nech prší spravodlivosť. Nech sa otvorí zem a zrodí Spasiteľa! <br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Lk 1, 30 – 32)</font><br>" +
                    "Anjel povedal Márii: Našla si milosť u Boha. Počneš a porodíš syna a bude sa volať Synom Najvyššieho.", "(Porov. Iz 45, 8)",
                    "Hľa, panna počne a porodí syna a dá mu meno Emanuel.", "(Porov. Iz 7, 14)"},
            // 5 – iba v vianocnom obdobi
            {"13", "1", "Omša k preblahoslavenej Panne Marií", "Svätá Mária porodila Krista, večného Kráľa; v nej sa spája panenská čistota s materskou radosťou; je neporovnateľne veľká medzi ženami.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Svätá Panna a Matka, Boh, ktorého nemôže obsiahnuť celý svet, stal sa človekom v tvojom lone.", "",
                    "Blahoslavená si Panna Mária, lebo si nosila Syna večného Otca.", "(Porov. Lk 11, 27)"},
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
            {"16", "1", "Nepoškvrneného Srdca Panny Márie", "Moje srdce sa teší z tvojej pomoci. Spievať budem Pánovi, že ma zahŕňa dobrodeniami.", "(Ž 13, 6)",
                    "Mária zachovávala všetky tieto slová vo svojom srdci a premýšľala o nich.", "(Lk 2, 19)"},
            // SPOLOCNE OMSE MUCENIKOV
            // omsa viacerých muceníkov mimo velkonocneho obdobia
            {"21", "1", "Omša za viacerých mučeníkov 1.", "V nebi sa radujú duše svätých, ktorí nasledovali Krista; a pretože z lásky k nemu vyliali svoju krv, s Kristom požívajú šťastie bez konca.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Svätí muži preliali slávnu krv pre Pána, milovali Krista vo svojom živote, pripodobnili sa mu vo svojej smrti, a preto si zaslúžili korunu víťazstva.", "",
                    "Vy ste vytrvali so mnou v mojich skúškach a ja vám dávam kráľovstvo, hovorí Pán,<br>" +
                            "aby ste jedli a pili pri mojom stole v mojom kráľovstve.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> <br>" +
                            "Hľa, odmena svätých je bohatá u Boha: tí, čo umreli pre Krista, budú žiť naveky.", "(Lk 22, 28 – 30)"},
            {"21", "2", "Omša za viacerých mučeníkov 2.", "Spravodliví majú utrpení veľa, ale Pán ich vyslobodil zo všetkých. Pán im ochraňuje všetky kosti, ani jedna sa im nezlomí.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Zjv 7, 14; Dan 3, 95)</font><br>" +
                    "To sú tí, čo prišli z veľkého súženia a oprali si rúcha v Baránkovej krvi. Obetovali svoje telá kvôli Bohu a zaslúžili si večnú korunu.", "(Porov. Ž 34, 20 – 21)",
                    "Nik nemá väčšiu lásku ako ten, kto položí život za svojich priateľov, hovorí Pán.<br>" +
                            "<font color='#B71C1C'>Alebo: (Lk 12, 4)</font><br>" +
                            "Vám, svojim priateľom, hovorím: Nebojte sa tých, ktorí vás prenasledujú!", "(Porov. Jn 15, 13)"},
            {"21", "3", "Omša za viacerých mučeníkov 3.", "Spása spravodlivých prichádza od Pána, on je ich ochrancom v čase súženia.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Múd 3, 6 – 7. 9)</font><br>" +
                    "Pán ich vyskúšal ako zlato v peci a prijal ich ako celopalnú žertvu. Skvieť sa budú v čase svojho navštívenia: lebo pre Božích vyvolených je pripravená odmena.", "(Porov. Ž 37, 39)",
                    "Kto stratí svoj život pre mňa a pre evanjelium, zachráni si ho, hovorí Pán.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Múd 3, 4)</font><br>" +
                            "I keď podľa mienky ľudí pretrpeli muky, nádej vyvolených je plná nesmrteľnosti.", "(Porov. Mk 8, 35)"},
            {"21", "4", "Omša za viacerých mučeníkov 4.", "Spravodliví volali a Pán ich vyslyšal a vyslobodil ich zo všetkých tiesní.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Kvôli zmluve Pána a zákonu Otcov vytrvali svätí Boží v bratskej láske; vládol medzi nimi jeden duch a jedna viera.", "(Porov. Ž 34, 18)",
                    "Ustavične sa vydávame na smrť pre Ježiša, aby sa aj Ježišov život zjavil na našom smrteľnom tele.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 10, 28)</font><br>" +
                            "Nebojte sa tých, čo zabíjajú telo, ale dušu zabiť nemôžu, hovorí Pán.", "(2 Kor 4, 11)"},
            {"21", "5", "Omša za viacerých mučeníkov 5.", "Svätí mučeníci vyliali krv pre Krista na tejto zemi, preto dosiahli večnú odmenu.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Múd 3, 1 – 2. 3)</font><br>" +
                    "Duše spravodlivých sú v Božích rukách, muka smrti sa ich nedotkne. Nemúdri sa nazdávali, že sú mŕtvi, ale oni sú v pokoji.", "",
                    "Ani smrť, ani život, ani nijaké stvorenie nás nemôže odlúčiť od Kristovej lásky. <br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 10, 30. 31)</font><br>" +
                            "Aj všetky vlasy máte na hlave spočítané. Nebojte sa teda, vy ste cennejší ako mnoho vrabcov.", "(Porov. Rim 8, 38 – 39)"},
            // omsa jedneho muceníka mimo velkonocneho obdobia
            {"22", "1", "Omša za jedného mučeníka 1.", "Tento svätec bojoval za Boží zákon až na smrť a nebál sa hrozieb bezbožných; lebo mal základy na pevnej skale.<br>" +
            "<font color='#B71C1C'>Alebo: (Porov. Múd 10, 12)</font><br>" +
            "V ťažkom boji mu Pán pomáhal k víťazstvu, aby poznal, že bohabojnosť je mocnejšia ako všetko ostatné.", "",
            "Kto chce ísť za mnou, nech zaprie sám seba, vezme svoj kríž a nasleduje ma, hovorí Pán.<br>" +
            "<font color='#B71C1C'>Alebo: (Mt 10, 39)</font><br>" +
            "Kto stratí svoj život pre mňa, hovorí Pán, nájde ho naveky.", "(Porov. Mt 16, 24)"},
        {"22", "2", "Omša za jedného mučeníka 2.", "Toto je vskutku mučeník, ktorý sa nebál hrozieb sudcov, vylial pre Kristovo meno svoju krv<br>" +
                "a dostal sa do nebeského kráľovstva.<br>" +
                "<font color='#B71C1C'>Alebo: (Porov. Fil 3, 8. 10)</font><br>" +
                "Všetko pokladám za stratu pre vznešenosť poznania Krista Ježiša, môjho Pána, a účasť na jeho utrpení tým, že sa mu pripodobním v smrti.", "",
                "Ja som vinič, vy ste ratolesti, hovorí Pán. Kto ostáva vo mne a ja v ňom, prináša veľa ovocia.<br>" +
                        "<font color='#B71C1C'>Alebo: (Jn 8, 12)</font><br>" +
                        "Kto mňa nasleduje, nebude chodiť vo tmách, ale bude mať svetlo života, hovorí Pán.", "(Porov. Jn 15, 1. 5)"},
            // omsa viacerých muceníkov vo velkonocnom obdobi
            {"23", "1", "Omša za viacerých mučeníkov 1.", "Poďte, požehnaní môjho Otca, zaujmite kráľovstvo, ktoré je pre vás pripravené od počiatku sveta, aleluja.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Zjv 7, 13 – 14)</font><br>" +
                    "Tí, čo sú oblečení do bieleho rúcha, prichádzajú z veľkého súženia: oprali si rúcha a zbielili ich v Baránkovej krvi, aleluja.", "(Porov. Mt 25, 34)",
                    "Tomu, kto zvíťazí, dám jesť zo stromu života, ktorý je v Božom raji, aleluja.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Ž 33, 1)</font><br>" +
                            "Plesajte, spravodliví, v Pánovi; statočným sluší spievať pieseň chvály, aleluja.", "(Porov. Zjv 2, 7)"},
                    {"23", "2", "Omša za viacerých mučeníkov 2.", "Títo svätí zvíťazili pre Baránkovu krv; Krista milovali viac než svoj život, preto s ním kraľujú naveky, aleluja.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Mt 25, 34)</font><br>" +
                            "Radujte sa, svätí, pred Baránkovým pohľadom; je pre vás pripravené kráľovstvo od stvorenia sveta, aleluja.", "(Porov. Zjv 12, 11)",
                            "Ak sme zomreli s Kristom, s ním budeme aj žiť. Ak vytrváme, s ním budeme aj kraľovať, aleluja.<br>" +
                                    "<font color='#B71C1C'>Alebo: (Porov. Mt 5, 12)</font><br>" +
                                    "Radujte sa a jasajte, lebo máte hojnú odmenu v nebi, aleluja.", "(Porov. 2 Tim 2, 11 – 12)"},
// omsa jedného muceníka vo velkonocnom obdobi
            {"24", "1", "Omša za jedného mučeníka", "Večné svetlo bude svietiť tvojim svätým, Pane, na veky vekov, aleluja.<br>" +
                    "<font color='#B71C1C'>Alebo:</font> <br>" +
                    "Toto je muž, ktorého Boh neopustil v deň skúšky; teraz nosí víťaznú korunu, lebo verne zachovával Pánove prikázania, aleluja.", "(Porov. 4 Ezd 2, 35)",
                    "Ak pšeničné zrno nepadne do zeme a neodumrie, ostane samo; ale ak odumrie, prinesie veľkú úrodu, aleluja.<br>" +
                            "<font color='#B71C1C'>Alebo: (Ž 116, 15)</font><br>" +
                            "V Pánových očiach má veľkú cenu smrť jeho svätých, aleluja.", "(Jn 12, 24)"},
            // omsa o mucenikoch misionaroch
            {"25", "1", "Omša za viacerých mučeníkov misionárov", "Nechceme sa chváliť ničím iným, iba krížom nášho Pána Ježiša Krista. Slovo kríža je Božou mocou pre tých, čo sú na ceste spásy <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Gal 6, 14; 1 Kor 1, 18)",
                    "Blahoslavení prenasledovaní pre spravodlivosť, lebo ich je nebeské kráľovstvo <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 10, 32)</font><br>" +
                            "Kto mňa vyzná pred ľuďmi, toho aj ja vyznám pred svojím Otcom, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Mt 5, 10)"},
            {"28", "1", "Omša za jedného mučeníka misionára", "Tento svätý sa pre Kristovo dielo priblížil až k smrti a svoj život vystavil nebezpečenstvu <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Fil 2, 30)",
                    "Kto stratí svoj život pre mňa a pre evanjelium, zachráni si ho, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Mk 8, 35)"},
            // omsa o panne mucenici
            {"26", "1", "Omša o panne mučenici", "Hľa, udatná panna ako obeta nevinnosti a čistoty nasleduje Baránka, ktorý bol pre nás ukrižovaný <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo:</font> <br>" +
                    "Blahoslavená panna, ktorá zaprela samu seba a vzala svoj kríž, pripodobnila sa Pánovi, panenskému ženíchovi a kráľovi mučeníkov <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "",
                    "Baránok, čo je v strede pred trónom, privedie ich k prameňom vôd života <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Zjv 7, 17)"},
            // omsa o svatej zene mucenici
            {"27", "1", "Omša o svätej žene mučenici", "Nebeské kráľovstvo patrí tým, ktorí pohrdli životom sveta, dosiahli kráľovskú odmenu a oprali si svoje rúcha v Baránkovej krvi <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "",
                    "Nemilovali svoj život až na smrť. Preto radujte sa, nebesia, aj vy, čo v nich bývate <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Zjv 12, 11 – 12)"},
            // SPOLOCNE OMSE DUCHOVNYCH PASTIEROVSPOLOCNE OMSE DUCHOVNYCH PASTIEROV,
            // omsa o papezoch
            {"31", "1", "Omša o pápežoch alebo biskupoch 1.", "Pán si ho vyvolil za veľkňaza, otvoril mu svoju pokladnicu a zahrnul ho všetkými dobrami <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Sir 50, 1; 44, 16. 22)</font><br>" +
                    "Hľa, veľký kňaz, ktorý vo svojich dňoch potešil Boha; podľa prísľubu vzrastal uprostred Pánovho ľudu <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "",
                    "Dobrý pastier položil svoj život za svoje ovce <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Jn 10, 11)"},
            {"31", "2", "Omša o pápežoch alebo biskupoch 2.", "Pán uzavrel s ním zmluvu pokoja, postavil ho na čelo svojho ľudu a dal mu kňazskú hodnosť naveky <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Sir 45, 30)",
                    "Pane, ty vieš všetko, ty dobre vieš, že ťa mám rád <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Jn 21, 17)"},
            // omsa o biskupoch
            {"36", "1", "Omša o pápežoch alebo biskupoch 1.", "Pán si ho vyvolil za veľkňaza, otvoril mu svoju pokladnicu a zahrnul ho všetkými dobrami <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Sir 50, 1; 44, 16. 22)</font><br>" +
                    "Hľa, veľký kňaz, ktorý vo svojich dňoch potešil Boha; podľa prísľubu vzrastal uprostred Pánovho ľudu <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "",
                    "Dobrý pastier položil svoj život za svoje ovce <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Jn 10, 11)"},
            {"36", "2", "Omša o pápežoch alebo biskupoch 2.", "Pán uzavrel s ním zmluvu pokoja, postavil ho na čelo svojho ľudu a dal mu kňazskú hodnosť naveky <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Sir 45, 30)",
                    "Pane, ty vieš všetko, ty dobre vieš, že ťa mám rád <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Jn 21, 17)"},
            // omsa o biskupoch
            {"32", "1", "Omša o biskupoch 1.", "Ujmem sa svojich oviec, hovorí Pán, a ustanovím pastiera, ktorý ich bude pásť; a ja, Pán, budem ich Bohom <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
            "<font color='#B71C1C'>Alebo: (Porov. Lk 12, 42)</font><br>" +
            "Toto je verný a múdry správca, ktorého pán ustanovil nad svojou čeľaďou, aby jej načas dával určený pokrm <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Ez 34, 11. 23 – 24)",
            "Nie vy ste si vyvolili mňa, hovorí Pán, ale ja som si vyvolil vás a ustanovil som vás, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
            "<font color='#B71C1C'>Alebo: (Porov. Lk 12, 36 – 37)</font><br>" +
            "Blahoslavený sluha, ktorého Pán nájde bdieť, keď sa vráti a zaklope <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Jn 15, 16)"},
        {"32", "2", "Omša o biskupoch 2.", "Povolám si verného kňaza, ktorý bude konať podľa môjho srdca a podľa môjho zmýšľania, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                "<font color='#B71C1C'>Alebo: (Porov. Lk 12, 42)</font><br>" +
                "Verný a múdry správca, ktorého pán ustanovil nad svojou čeľaďou, aby jej načas dával určený pokrm <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. 1 Sam 2, 35)",
                "Ja som prišiel, aby mali život, a aby ho mali hojnejšie, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                        "<font color='#B71C1C'>Alebo: (Mk 16, 17 – 18)</font><br>" +
                        "Tých, čo uveria, budú sprevádzať tieto znamenia: budú vyháňať zlých duchov, na chorých budú vkladať ruky a tí ozdravejú <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Jn 10, 10)"},
            // omsa o duchovnych pastieroch
            {"33", "1", "Omša o duchovných pastieroch", "Dám vám pastierov podľa môjho srdca, ktorí vás budú pásť rozumne a múdro <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>. <br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Dan 3, 84. 87)</font><br>" +
                    "Velebte Pána, vy, jeho kňazi, velebte Pána, svätí a pokorní srdcom <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Jer 3, 15)",
                    "Syn človeka neprišiel dať sa obsluhovať, ale slúžiť a položiť svoj život ako výkupné za mnohých <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Mt 20, 28)"},
            {"37", "1", "Omša o duchovnom pastierovi 1.", "Tvoji kňazi, Pane, nech sa odejú do spravodlivosti a tvoji svätí nech plesajú <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Ž 132, 9)",
                    "Blahoslavený sluha, ktorého Pán pri svojom príchode nájde bdieť. Veru, hovorím vám, ustanoví ho nad celým svojím majetkom <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Lk 12, 42)</font><br>" +
                            "Verný a múdry správca, ktorého Pán ustanovil nad svojou čeľaďou, aby jej načas dával určený pokrm <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Mt 24, 46 – 47)"},
            {"37", "2", "Omša o duchovnom pastierovi 2.", "Duch Pána je nado mnou, lebo ma pomazal, aby som hlásal evanjelium chudobným a uzdravoval skrúšených srdcom <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
            "<font color='#B71C1C'>Alebo: (Porov. Sir 45, 20)</font><br>" +
            "Pán si ho vyvolil za kňaza, aby prinášal Bohu obetu chvály <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Lk 4, 18)",
            "Hľa, ja som s vami po všetky dni až do skončenia sveta, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Mt 28, 20)"},
        // omsa o zakladateloch miestych cirkvi
            {"34", "1", "Omša o zakladateľovi miestnej cirkvi", "Pán hovorí: Moje slová, ktoré som ti dal do úst, nezmiznú z tvojich úst a tvoje dary mi budú potešením na mojom oltári <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Iz 59, 21; 56, 7)",
                    "Syn človeka prišiel, aby položil svoj život ako výkupné za mnohých <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (1 Kor 3, 11)</font><br>" +
                            "Nik nemôže položiť iný základ okrem toho, čo je už položený, a je ním Ježiš Kristus <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Mk 10, 45)"},
            {"38", "1", "Omša o zakladateľoch miestnych cirkví", "Toto sú svätí muži, ktorých si Pán vyvolil v úprimnej láske a dal im večnú slávu; ich náuka neprestajne žiari v Cirkvi <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "",
                    "Už vás nenazývam sluhami, lebo sluha nevie, čo robí jeho pán, hovorí Pán. Nazval som vás priateľmi, pretože som vám oznámil všetko, čo som počul od svojho Otca <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (1 Petr 2, 9)</font><br>" +
                            "Vy ste vyvolený ľud, aby ste zvestovali slávne skutky toho, ktorý vás z tmy povolal do svojho obdivuhodného svetla <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Jn 15, 15)"},
            // omsa o misionaroch
            {"35", "1", "Omša o misionároch 1.", "Toto sú svätí, Boží priatelia, ktorí sa preslávili hlásaním Božej pravdy <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo: (Ž 18, 50; 22, 23)</font><br>" +
                    "Budem ťa, Pane, chváliť medzi národmi a hlásať tvoje meno svojim bratom <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "",
                    "Ja budem pásť svoje ovce, ja im dám odpočinok, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 10, 27)</font><br>" +
                            "Čo vám hovorím vo tme, hovorte na svetle, hovorí Pán, a čo počujete do ucha, rozhlasujte zo striech <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Ez 34, 15)"},
            {"35", "2", "Omša o misionároch 2.", "Aké krásne sú na horách nohy posla, ktorý hlása pokoj, posla dobrej zvesti, ktorý ohlasuje spásu <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Iz 52, 7)",
                    "Choďte do celého sveta a hlásajte evanjelium; ja som s vami po všetky dni, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 15, 4 – 5)</font><br>" +
                            "Ostaňte vo mne a ja vo vás, hovorí Pán; kto ostáva vo mne a ja v ňom, prináša veľa ovocia <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Mk 16, 15; Mt 28, 20)"},
            {"35", "3", "Omša o misionároch 3.", "Zvestujte jeho slávu pohanom a jeho zázraky všetkým národom, lebo veľký je Pán a veľkej chvály hoden <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Ž 96, 3 – 4)",
                    "Pán poslal učeníkov, aby ohlasovali mestám: Priblížilo sa k vám Božie kráľovstvo <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Mt 13, 8. 23)</font><br>" +
                            "Semeno, ktoré padlo do dobrej zeme, to sú tí, ktorí v dobrom srdci trpezlivo prinášajú úrodu <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Lk 10, 1. 9)"},
            // SPOLOCNE OMSE UCITELOV CIRKVI
            {"4", "1", "Omša o učiteľoch Cirkvi 1.", "Uprostred Božieho ľudu otvoril Pán jeho ústa a naplnil ho duchom múdrosti a rozumu, zaodel ho rúchom slávy <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo: (Ž 37, 30 – 31)</font><br>" +
                    "Z úst spravodlivého zaznieva múdrosť a jeho jazyk hovorí, čo je správne; v jeho srdci je zákon Boží <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Sir 15, 5)",
                    "Verný a múdry správca, ktorého Pán ustanovil nad svojou čeľaďou, aby jej načas dával určený pokrm <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Ž 1, 2 – 3)</font><br>" +
                            "Ten, čo o zákone Pánovom rozjíma dňom i nocou, prináša ovocie v pravý čas <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Lk 12, 42)"},
            {"4", "2", "Omša o učiteľoch Cirkvi 2.", "Múdri sa budú skvieť ako jas oblohy a tí, čo mnohých priviedli k spravodlivosti, ako hviezdy na večné veky <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Sir 44, 15. 14)</font><br>" +
                    "O múdrosti svätých budú rozprávať národy, a Cirkev bude zvestovať ich slávu; ich mená budú živé na večné veky <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Dan 12, 3)",
                    "My ohlasujeme ukrižovaného Krista; Krista, Božiu moc a Božiu múdrosť <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. 1 Kor 1, 23 – 24)"},
            // SPOLOCNE OMSE PANNIEN
            {"51", "1", "Omša o pannách 1.", "Toto je múdra panna, jedna z rozumných, ktorá vyšla so zažatou lampou v ústrety Kristovi <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo:</font> <br>" +
                    "Ó, aká krásna je Kristova panna, ktorá si zaslúžila prijať Pánovu korunu, korunu večného panenstva <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "",
                    "Hľa, Ženích prichádza, vyjdite v ústrety Kristu Pánovi <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Ž 27, 4)</font><br>" +
                            "O jedno prosím Pána a za tým túžim, aby som mohol bývať v dome Pánovom po všetky dni svojho života <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Mt 25, 6)"},
            {"51", "2", "Omša o pannách 2.", "Radujme sa a plesajme, lebo Pán celého stvorenia miluje túto svätú a slávnu pannu <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo:</font> <br>" +
                    "Toto je múdra panna, ktorú Pán našiel bdieť; ona vzala lampu spolu s olejom, a keď prišiel Pán, vošla s ním na svadbu <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "",
                    "Päť múdrych panien si vzalo s lampami olej do svojich nádob. O polnoci sa strhol krik: Ženích prichádza, vyjdite v ústrety Kristu Pánovi <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Mt 25, 4. 6)"},
            {"51", "3", "Omša o pannách 3.", "Poď, Kristova nevesta, prijmi korunu, ktorú ti Pán pripravil pre večnosť <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo:</font> <br>" +
                    "Kráľovstvá sveta a celý svet si málo vážila pre lásku Pána Ježiša Krista <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "",
                    "Múdra panna si vybrala lepši podiel, ktorý sa jej neodníme <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 25, 6)</font><br>" +
                            "O polnoci sa strhol krik: Ženích prichádza, vyjdite mu v ústrety <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>!", "(Porov. Lk 10, 42)"},
            // omsa o viacerych pannach
            {"52", "1", "Omša o viacerých pannách", "Panny nech chvália meno Pánovo, lebo iba jeho meno je vznešené, jeho veleba prevyšuje zem i nebesia <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Ž 45, 16)</font><br>" +
                    "Sprevádza ich jasot radostný, tak vstupujú do kráľovského paláca <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Ž 149, 12 – 14)",
                    "Prišiel Ženích, a panny, ktoré boli pripravené, vošli s ním na svadbu <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 14, 21. 23)</font><br>" +
                            "Kto miluje mňa, toho bude milovať môj Otec, prídeme k nemu a urobíme si uňho príbytok.", "(Porov. Mt 25, 10)"},
                    // SPOLOCNE OMSE SVATYCH MUZOV a SVATYCH ZIEN
            {"61", "1", "Omša o svätých mužoch a svätých ženách 1.", "Nech ťa oslavujú, Pane, všetky tvoje diela a tvoji svätí nech ťa velebia. Nech rozprávajú o sláve tvojho kráľovstva a o tvojej moci nech hovoria <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Ž 145, 10 – 11)",
                    "Spravodliví sa môžu tešiť a jasať pred Božou tvárou a v radosti sa veseliť <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Lk 12, 37)</font><br>" +
                            "Blahoslavení sluhovia, ktorých pán pri svojom príchode nájde bdieť; veru, hovorím vám: Opáše sa, posadí ich k stolu, a bude ich obsluhovať <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Ž 68, 4)"},
            {"61", "2", "Omša o svätých mužoch a svätých ženách 2.","Spravodlivý sa teší v Pánovi a spolieha sa na neho, a jasajú všetci, čo majú srdce úprimné <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Ž 64, 11)",
                    "Ak mi niekto slúži, nech ma nasleduje, hovorí Pán; a kde som ja, tam bude aj môj služobník <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Jn 12, 26)"},
            {"61", "3", "Omša o svätých mužoch a svätých ženách 3.", "Spravodlivý sťa palma zakvitne a vyrastie sťa céder z Libanonu. Tí, čo vyrastajú v dome Pánovom, v nádvoriach nášho Boha budú prekvitať <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Ž 92, 13 – 14)",
            "Poďte ku mne všetci, ktorí sa namáhate a ste preťažení, a ja vás posilním, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Mt 11, 28)"},
        {"61", "4", "Omša o svätých mužoch a svätých ženách 4.", "Požehnaný človek, čo dúfa v Pána, Pán bude jeho oporou. Bude ako strom zasadený pri vode,<br>" +
                "ktorý k potoku vystiera korene; nebude sa báť, keď príde horúčosť <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Jer 17, 7 – 8)",
                "Ako mňa miluje Otec, tak ja milujem vás, hovorí Pán. Ostaňte v mojej láske <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Jn 15, 9)"},
            {"60", "1", "Omša o svätých mužoch a svätých ženách 5.", "Pane, z tvojej sily sa spravodlivý raduje a veľmi sa teší z tvojej spásy; vyplnil si túžbu jeho srdca <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Ž 21, 2 – 3)",
                    "Kto chce ísť za mnou, nech zaprie sám seba, vezme svoj kríž a nasleduje ma, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo pre tých, čo zastávali verejný úrad: </font><br>" +
                            "(Mt 6, 33)<br>" +
                            "Hľadajte najprv Božie kráľovstvo a toto všetko dostanete navyše, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Mt 16, 24)"},
            {"60", "2", "Omša o svätých mužoch a svätých ženách 6.", "Zákon pravdy bol v jeho ústach a na jeho perách sa nenašla neprávosť; pokojne a spravodlivo kráčal s Bohom a mnohých odvrátil od hriechu <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Mal 2, 6)",
                    "Blahoslavení čistého srdca, lebo oni uvidia Boha; blahoslavení tí, čo šíria pokoj, lebo ich budú volať Božími synmi <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Mt 5, 8 – 9)"},
            // omsa o reholnikoch (opat)
            {"62", "1", "Omša o rehoľníkoch 1.", "Spravodlivý sťa palma zakvitne a vyrastie sťa céder z Libanonu. Tí, čo vyrastajú v dome Pánovom, v nádvoriach nášho Boha budú prekvitať <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo: (Ž 37, 30 – 31)</font><br>" +
                    "Z úst spravodlivého zaznieva múdrosť a jeho jazyk hovorí, čo je správne; v jeho srdci je zákon Boží <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Ž 92, 13 – 14)",
                    "Verný a múdry správca, ktorého pán ustanovil nad svojou čeľaďou, aby jej načas dával určený pokrm <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 23, 11)</font><br>" +
                            "Kto je medzi vami najväčší, bude vaším služobníkom, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Lk 12, 42)"},
            //mnich
            {"66", "1", "Omša o rehoľníkoch 2.", "Tam, kde bratia spolu oslavujú Boha, tam Pán dá požehnanie <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Ž 71, 8. 23)</font><br>" +
                    "Nech sa mi ústa naplnia tvojou oslavou, aby som ťa mohol velebiť; jasať budú moje pery, keď ti zaspievam <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "",
                    "Tí, čo počúvajú Božie slovo a zachovávajú ho v dobrom a šľachetnom srdci, s vytrvalosťou prinášajú úrodu <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Ž 84, 5)</font><br>" +
                            "Blažení tí, čo bývajú v tvojom dome, Pane, bez prestania ťa budú velebiť <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Lk 8, 15)"},
            //mniska
            {"67", "1", "Omša o rehoľníkoch 3.", "Ja som však ako zelená oliva v Božom dome. Úfam v Božie milosrdenstvo navždy a naveky <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo:</font> <br>" +
                    "Zavrhujem kráľovstvá sveta a všetky krásy života pre lásku môjho Pána Ježiša Krista, ktorého som videla, ktorého som milovala a v ktorého som uverila <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Ž 52, 10)",
                    "Moje srdce prekypuje krásnymi slovami, svoje verše venujem kráľovi <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Lk 10, 42)</font><br>" +
                            "Potrebné je len jedno; vybrala si lepší podiel, ktorý sa jej neodníme <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Ž 45, 2)"},
            //reholnik
            {"68", "1", "Omša o rehoľníkoch 4.", "Ty, Pane, si môj podiel na dedičstve a na kalichu, ty mi dávaš znamenité dedičstvo <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo o rehoľníčke: (Porov. Oz 2, 21 – 22)</font><br>" +
                    "Pán si ju zasnúbil naveky, vo viere a milosrdenstve <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Ž 16, 5)",
                    "Veru, hovorím vám: Vy, čo ste opustili všetko a išli ste za mnou, stonásobne viac dostanete a budete dedičmi večného života <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo o rehoľníčke: (Porov. Nár 3, 24 – 25)</font><br>" +
                            "Pán je môj podiel; dobrý je k človeku, ktorý ho hľadá <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Mt 19, 27 – 29)"},
            {"68", "2", "Omša o rehoľníkoch 5.", "Toto sú svätí, ktorí dostali požehnanie od Pána a odmenu od Boha, svojho Spasiteľa, lebo toto je pokolenie tých, čo hľadajú Pána <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Ž 105, 3 – 4)</font><br>" +
                    "Nech sa radujú srdcia tých, čo hľadajú Pána. Hľadajte Pána a jeho moc, hľadajte vždy jeho tvár <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Ž 24, 5 – 6)",
                    "Skúste a presvedčte sa, aký dobrý je Pán; šťastný človek, čo sa utieka k nemu <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 5, 3)</font><br>" +
                            "Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Ž 34, 9)"},
            // omsa o tych, co konali skutky milosrdensta
            {"63", "1", "Omša o tých, čo konali skutky milosrdenstva", "Poďte, požehnaní môjho Otca, hovorí Pán; bol som chorý a navštívili ste ma. Veru, hovorím vám, čokoľvek ste urobili jednému z týchto mojich najmenších bratov, mne ste urobili <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo: (Ž 112, 9)</font><br>" +
                    "Rozdeľuje a dáva chudobným; jeho dobročinnosť potrvá naveky a jeho moc a sláva budú stále rásť <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Mt 25, 34. 36. 40)",
                    "Nik nemá väčšiu lásku ako ten, kto položí svoj život za svojich priateľov <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Jn 13, 35)</font><br>" +
                            "Podľa toho spoznajú všetci, že ste moji učeníci, ak sa budete navzájom milovať, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Jn 15, 13)"},
            // omsa o vychovavateloch
            {"64", "1", "Omša o vychovávateľoch", "Nechajte deti prichádzať ku mne, nebráňte im, lebo takým patrí Božie kráľovstvo, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Mt 5, 19)</font><br>" +
                    "Kto zachová prikázania a tak bude aj učiť, ten bude v nebeskom kráľovstve veľký, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Mk 10, 14)",
                    "Ak sa neobrátite a nebudete ako deti, nevojdete do nebeského kráľovstva, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 8, 12)</font><br>" +
                            "Kto mňa nasleduje, nebude chodiť vo tmách, ale bude mať svetlo života, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Mt 18, 3)"},
            // omsa o svatych zenach
            {"65", "1", "Omša o svätých ženách 1.", "Žena, čo sa bojí Pána, zaslúži si chválu. Jej deti vstávajú a dobrorečia jej a jej muž ju chváli <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Prís 31, 20. 27)</font><br>" +
                    "Bedárovi svoje dlane otvára a k chudobnému ruky vystiera; neje z chleba lenivosti <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Prís 31, 30. 28)",
                    "Nebeské kráľovstvo sa podobá kupcovi, ktorý hľadá vzácne perly. Keď nájde veľmi cennú perlu, ide, predá všetko, čo má, a kúpi ju <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Mt 13, 45 – 46)"},
            {"65", "2", "Omša o svätých ženách 2.","Hľa, múdra žena, ktorá si usporiadala dom; bála sa Pána a kráčala správnou cestou <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Porov. Prís 14, 1 – 2)",
                    "Každý, kto plní vôľu môjho Otca, ktorý je na nebesiach, je môj brat i sestra, i matka, hovorí Pán <font color='#B71C1C'>(V.O.</font> aleluja<font color='#B71C1C'>)</font>.", "(Mt 12, 50)"},
            {"71", "1", "Za odpustenie hriechov 1.", "Pane, zmilúvaš sa nad všetkými a nepohŕdaš ničím, čo si vytvoril. Prehliadaš hriechy ľudí, aby sa kajali, a šetríš ich, lebo ty si Pán, náš Boh.", "(Porov. Mud 11, 23. 24. 26)",
                    "Boží anjeli majú radosť z jedného hriešnika, ktorý robí pokánie.", "(Lk 15, 10)"},
            {"71", "2", "Za odpustenie hriechov 2.", "Pane, zmilúvaš sa nad všetkými a nepohŕdaš ničím, čo si vytvoril. Prehliadaš hriechy ľudí, aby sa kajali, a šetríš ich, lebo ty si Pán, náš Boh.", "(Porov. Mud 11, 23. 24. 26)",
                    "Boží anjeli majú radosť z jedného hriešnika, ktorý robí pokánie.", "(Lk 15, 10)"},
            {"71", "3", "Za dar lásky", "Pán hovorí: Odstránim z vášho tela srdce kamenné a dám vám srdce z mäsa. Vložím do vás svojho ducha a budete mojím ľudom a ja budem vaším Bohom.", "(Ez 36, 26 – 28)",
                    "Teraz ostáva viera, nádej, láska, tieto tri, no najväčšia z nich je láska.", "(1 Kor 13, 13)"},
            {"72a", "1", "Za jednotu kresťanov 1.", "Ja som dobrý pastier, poznám svoje ovce a moje poznajú mňa, hovorí Pán. Ako mňa pozná Otec a ja poznám Otca; aj svoj život položím za ovce.", "(Jn 10, 14 – 15)",
                    "Jeden je chlieb a my mnohí sme jedno telo, všetci, čo máme podiel na jednom chlebe a na jednom kalichu.", "(Porov. 1 Kor 10, 17)"},
            {"72a", "2", "Za jednotu kresťanov 2.", "Zachráň nás, Pane, Bože náš, a zhromaždi nás z krajín pohanských, aby sme mohli tvoje sväté meno velebiť a tvojou slávou sa honosiť.", "(Ž 106, 47)",
                    "Nadovšetko majte lásku, ktorá je zväzkom dokonalosti. A vo vašich srdciach nech vládne Kristov pokoj. Preň ste aj povolaní v jednom tele.", "(Kol 3, 14 – 15)"},
            {"72a", "3", "Za jednotu kresťanov 3.", "Jedno je telo a jeden Duch, ako ste aj povolaní v jednej nádeji svojho povolania. Jeden je Pán, jedna viera, jeden krst. Jeden je Boh a Otec všetkých, ktorý je nad všetkými, preniká všetkých a je vo všetkých.", "(Ef 4, 4 – 6)",
                    "Aby všetci boli jedno, ako ty, Otče, vo mne a ja v tebe, aby aj oni boli v nás jedno. Ja v nich a ty vo mne, nech sú tak dokonale jedno.", "(Jn 17, 21. 23)"},
        {"72b", "4", "Za povolanie na kňazský stav", "Proste Pána žatvy, aby poslal robotníkov na svoju žatvu, hovorí Ježiš svojim učeníkom.", "(Mt 9, 38)",
                "Čo je láska, poznali sme z toho, že on položil za nás svoj život. Aj my sme povinní dávať život za bratov.", "(1 Jn 3, 16)"},
            {"72b", "5", "Za rehoľné povolania", "Ak chceš byť dokonalý, choď, predaj čo máš, a rozdaj chudobným; potom príď a nasleduj ma, hovorí Pán.", "(Mt 19, 21)",
                    "Veru, hovorím vám, že vy, čo ste opustili všetko a nasledovali ste ma, stonásobne viac dostanete a dosiahnete večný život, hovorí Pán.", "(Porov. Mt 19, 27 – 29)"},
        {"73", "1", "Na poďakovanie Pánu Bohu 1.", "Vo svojich srdciach spievajte Pánovi a oslavujte ho. Ustavične vzdávajte vďaky za všetko Bohu a Otcovi v mene nášho Pána Ježiša Krista.", "(Porov. Ef 5, 19 – 20)",
            "Chcem ťa, Pane, oslavovať celým srdcom, že si vypočul slová mojich úst.<br>" +
            "<font color='#B71C1C'>Alebo: (Ž 116, 12 – 13)</font><br>" +
            "Čím sa odvďačím Pánovi za všetko, čo mi dal? Vezmem kalich spásy a budem vzývať meno Pánovo.", "(Ž 138, 1)"},
        {"73", "2", "Na poďakovanie Pánu Bohu 2.", "Vo svojich srdciach spievajte Pánovi a oslavujte ho. Ustavične vzdávajte vďaky za všetko Bohu a Otcovi v mene nášho Pána Ježiša Krista.", "(Porov. Ef 5, 19 – 20)",
                "Chcem ťa, Pane, oslavovať celým srdcom, že si vypočul slová mojich úst.<br>" +
                        "<font color='#B71C1C'>Alebo: (Ž 116, 12 – 13)</font><br>" +
                        "Čím sa odvďačím Pánovi za všetko, čo mi dal? Vezmem kalich spásy a budem vzývať meno Pánovo.", "(Ž 138, 1)"},
            {"73", "3", "Na poďakovanie za úrodu", "Zem vydala svoj plod; nech nás požehná Boh, náš Boh.", "(Ž 67, 7)",
                    "Pane, plodmi svojich diel sýtiš zem. Zo zeme vyvádzaš chlieb i víno, čo obveseľuje srdce človeka.", "(Porov. Ž 104, 13 – 15)"},
            {"74", "1", "Za zachovanie pokoja a spravodlivosti 1.", "Daruj, Pane, pokoj tým, čo sa spoliehajú na teba, vypočuj prosby svojich služobníkov a veď nás na cestu spravodlivosti.", "(Porov. Sir 36, 18 – 19)",
                    "Blahoslavení tí, čo šíria pokoj, lebo ich budú volať Božími synmi.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 14, 27)</font><br>" +
                            "Pokoj vám zanechávam, svoj pokoj vám dávam, hovorí Pán.", "(Mt 5, 9)"},
            {"74", "2", "Za zachovanie pokoja a spravodlivosti 2.", "Daruj, Pane, pokoj tým, čo sa spoliehajú na teba, vypočuj prosby svojich služobníkov a veď nás na cestu spravodlivosti.", "(Porov. Sir 36, 18 – 19)",
                    "Blahoslavení tí, čo šíria pokoj, lebo ich budú volať Božími synmi.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 14, 27)</font><br>" +
                            "Pokoj vám zanechávam, svoj pokoj vám dávam, hovorí Pán.", "(Mt 5, 9)"},
            {"74", "3", "Za rodinu", "Cti svojho otca i matku, to je prvé prikázanie s prisľúbením: Aby ti dobre bolo a aby si dlho žil na zemi.", "(Ef 6, 2 – 3)",
                    "Môže matka zabudnúť na svoje nemluvňa? A keby aj ona zabudla, ja na teba nezabudnem, hovorí Pán.", "(Iz 49, 15)"},
            {"75", "1", "V čase sejby 1.", "Nech je nad nami tvoja dobrotivosť, Pane, a upevňuj dielo našich rúk.", "(Porov. Ž 90, 17)",
                    "Veď Pán dá požehnanie a svoje plody vydá naša zem.", "(Ž 85, 13)"},
            {"75", "2", "V čase sejby 2.", "Nech je nad nami tvoja dobrotivosť, Pane, a upevňuj dielo našich rúk.", "(Porov. Ž 90, 17)",
                    "Veď Pán dá požehnanie a svoje plody vydá naša zem.", "(Ž 85, 13)"},
            {"76", "1", "Za jednotu kresťanov 1.", "Ja som dobrý pastier, poznám svoje ovce a moje poznajú mňa, hovorí Pán. Ako mňa pozná Otec a ja poznám Otca; aj svoj život položím za ovce.", "(Jn 10, 14 – 15)",
                    "Jeden je chlieb a my mnohí sme jedno telo, všetci, čo máme podiel na jednom chlebe a na jednom kalichu.", "(Porov. 1 Kor 10, 17)"},
            {"76", "2", "Za jednotu kresťanov 2.", "Zachráň nás, Pane, Bože náš, a zhromaždi nás z krajín pohanských, aby sme mohli tvoje sväté meno velebiť a tvojou slávou sa honosiť.", "(Ž 106, 47)",
                    "Nadovšetko majte lásku, ktorá je zväzkom dokonalosti. A vo vašich srdciach nech vládne Kristov pokoj. Preň ste aj povolaní v jednom tele.", "(Kol 3, 14 – 15)"},
            {"76", "3", "Za jednotu kresťanov 3.", "Jedno je telo a jeden Duch, ako ste aj povolaní v jednej nádeji svojho povolania. Jeden je Pán, jedna viera, jeden krst. Jeden je Boh a Otec všetkých, ktorý je nad všetkými, preniká všetkých a je vo všetkých.", "(Ef 4, 4 – 6)",
                    "Aby všetci boli jedno, ako ty, Otče, vo mne a ja v tebe, aby aj oni boli v nás jedno. Ja v nich a ty vo mne, nech sú tak dokonale jedno.", "(Jn 17, 21. 23)"},
        };

    String[][] modlitbaFormular = {
            {"01a", "1", "Votívna omša 1.", "Bože, ty osvecuješ<br>" +
                    "srdcia veriacich svetlom Ducha Svätého; * <br>" +
                    "daj, prosíme, aby sme v tomto Duchu <br>" +
                    "poznávali, čo je správne, <font color='#B71C1C'>—</font><br>" +
                    "a vždy sa radovali z jeho útechy a posily.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "posväť tieto obetné dary <font color='#B71C1C'>—</font><br>" +
                            "a očisti naše srdcia ohňom Ducha Svätého. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane,<br>" +
                            "naplň nás Duchom Svätým, <font color='#B71C1C'>*</font><br>" +
                            "aby očistil naše srdcia <font color='#B71C1C'>—</font><br>" +
                            "a zúrodnil ich rosou svojej milosti. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"01a", "2", "Votívna omša 2.", "Prosíme ťa, Pane,<br>" +
                    "nech Obhajca Duch Svätý, <br>" +
                    "ktorý vychádza z teba,<br>" +
                    "osvecuje naše mysle <font color='#B71C1C'>*</font><br>" +
                    "a nech nás uvedie do plnej pravdy, <font color='#B71C1C'>—</font><br>" +
                    "ako to prisľúbil tvoj Syn.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, pred tebou niet nijakej tajnosti,<br>" +
                    "lebo vidíš každému do srdca<br>" +
                    "a vieš o každom hnutí našej vôle; * <br>" +
                    "prosíme ťa, naplň nás Duchom Svätým<br>" +
                    "a očisti zmýšľanie nášho srdca, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ťa dokonale milovali a dôstojne oslavovali.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane,<br>" +
                            "zhliadni na duchovnú obetu, ktorú sme ti<br>" +
                            "so synovskou oddanosťou priniesli na oltár, <font color='#B71C1C'>*</font><br>" +
                            "a obnov nás na duchu, <font color='#B71C1C'>—</font><br>" +
                            "aby si pre našu vieru a poníženosť<br>" +
                            "našiel zaľúbenie v týchto daroch. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš,<br>" +
                            "dobrotivo si nás nasýtil nebeským pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "naplň nám srdce radosťou Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                            "aby sa nám sviatosť,<br>" +
                            "ktorú sme prijali v časnom živote,<br>" +
                            "stala zárukou večnosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"01a", "3", "Votívna omša 3.", "Bože, ty posväcuješ svoju Cirkev<br>" +
                    "vo všetkých krajinách a národoch; <font color='#B71C1C'>*</font><br>" +
                    "naplň celý svet darmi Ducha Svätého<br>" +
                    "a v srdciach svojich veriacich<br>" +
                    "obnovuj aj teraz veľké skutky svojej lásky, <font color='#B71C1C'>—</font><br>" +
                    "ktoré si konal pri prvom hlásaní evanjelia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, tvoj Duch nás vedie<br>" +
                    "a tvoja prozreteľnosť nás chráni; <font color='#B71C1C'>*</font><br>" +
                    "preukáž nám svoje milosrdenstvo <br>" +
                    "a vypočuj naše pokorné prosby, <font color='#B71C1C'>—</font><br>" +
                    "aby nás prejavy tvojej lásky<br>" +
                    "stále upevňovali vo viere v teba.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, priniesli sme obetné dary<br>" +
                            "na tvoj oltár a vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "posväť ich ohňom Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                            "ktorý zapálil srdcia učeníkov tvojho Syna. <br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Pane, nech nám<br>" +
                            "prijaté sviatostné dary pomáhajú, <font color='#B71C1C'>*</font><br>" +
                            "aby sme ustavične planuli Duchom Svätým, <font color='#B71C1C'>—</font><br>" +
                            "ktorým si zázračne naplnil svojich apoštolov. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"01", "1", "Zoslanie Ducha Svätého", "Bože, ty si na svoju slávu <br>" +
                    "a na spásu ľudského pokolenia <br>" +
                    "ustanovil svojho jednorodeného Syna <br>" +
                    "za najvyššieho a večného kňaza; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby tí, ktorých si vyvolil <br>" +
                    "za vysluhovateľov a správcov tvojich tajomstiev, <font color='#B71C1C'>—</font><br>" +
                    "boli v sile Ducha Svätého verní vo vykonávaní prijatej služby.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Náš prostredník Ježiš Kristus <font color='#B71C1C'>*</font><br>" +
                            "nech urobí tieto dary príjemnými tebe, Pane, <font color='#B71C1C'>—</font><br>" +
                            "a nech nás zároveň so sebou prinesie <br>" +
                            "ako tebe milú obetu.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech nás oživuje božská obeta, <br>" +
                            "ktorú sme priniesli a prijali, <font color='#B71C1C'>*</font><br>" +
                            "aby sme boli večnou láskou spojení s tebou <font color='#B71C1C'>—</font><br>" +
                            "a prinášali ovocie trvajúce naveky.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"02", "1", "Najsvätejšieho Srdca Ježišovho", "Všemohúci Bože, <br>" +
                    "oslavujeme Srdce tvojho milovaného Syna <br>" +
                    "a pripomíname si veľké dobrodenia jeho lásky k nám; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme z tohto prameňa nebeských darov <br>" +
                    "mohli čerpať prehojné milosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, ty nám milosrdne otváraš <br>" +
                    "nekonečné poklady lásky v Srdci svojho Syna, <br>" +
                    "ktoré bolo ranené našimi hriechmi; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme mu slúžili s oddanou láskou, <font color='#B71C1C'>—</font><br>" +
                    "a tak prinášali dôstojné zadosťučinenie.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "zhliadni na Srdce svojho milovaného Syna, <br>" +
                            "prekypujúce nevýslovnou láskou, <font color='#B71C1C'>—</font><br>" +
                            "a prijmi obetu, ktorú ti prinášame <br>" +
                            "na zmierenie za naše hriechy.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, sviatosť lásky nech v nás <br>" +
                            "prehlbuje úctu k tvojmu Synovi, <font color='#B71C1C'>*</font><br>" +
                            "aby sme ho vytrvalo nasledovali <font color='#B71C1C'>—</font><br>" +
                            "a vedeli ho spoznať aj v našich bratoch.<br>" +
                            "Lebo on žije a kreľuje na veky vekov."},
            {"03", "1", "Votívna omša o Najsvätejšom Srdci Ježišovom", "Pane a Bože náš, pomôž nám<br>" +
                    "osvojiť si čnosti presvätého Srdca tvojho Syna<br>" +
                    "a zapáľ v nás oheň jeho lásky, <font color='#B71C1C'>*</font><br>" +
                    "aby sme sa stali podobnými jemu <font color='#B71C1C'>—</font><br>" +
                    "a dosiahli účasť na večnej sláve vykúpených.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Bože, Otec milosrdenstva,<br>" +
                            "ty si nás tak nesmierne miloval,<br>" +
                            "že si nám poslal svojho jednorodeného Syna; <font color='#B71C1C'>*</font><br>" +
                            "dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ti zjednotení s ním<br>" +
                            "prinášali dôstojnú obetu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, vo svojej nevýslovnej dobrote<br>" +
                            "dal si nám účasť na sviatosti svojej lásky; <font color='#B71C1C'>*</font><br>" +
                            "dopraj, prosíme,<br>" +
                            "aby sme sa na zemi stali podobnými Kristovi <font color='#B71C1C'>—</font><br>" +
                            "a v nebi mali podiel na jeho sláve.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
                    {"04", "1", "Výročie posviacky chrámu (slávenie mimo chrámu)", "Bože, zo živých a vybraných kameňov <br>" +
                    "si pripravuješ svoj večný príbytok; <font color='#B71C1C'>*</font><br>" +
                    "rozmnož vo svojej Cirkvi ducha milosti, <br>" +
                    "ktorého si jej poslal, <font color='#B71C1C'>—</font><br>" +
                    "aby sa vzrastom tvojho veriaceho ľudu <br>" +
                    "budoval nebeský Jeruzalem.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, ty Cirkev nazývaš svojou nevestou; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby ľud slúžiaci tvojmu menu <br>" +
                    "tebe sa klaňal, teba miloval a nasledoval <font color='#B71C1C'>—</font><br>" +
                    "a pod tvojím vedením dosiahol <br>" +
                    "prisľúbenú nebeskú blaženosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi naše obetné dary a dopraj, <font color='#B71C1C'>*</font><br>" +
                            "aby sme v tvojom svätom chráme <br>" +
                            "s úžitkom prijímali sviatosti <font color='#B71C1C'>—</font><br>" +
                            "a dosiahli milosti, o ktoré ťa prosíme.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, ty si zo svojej Cirkvi na zemi <br>" +
                            "urobil obraz nebeského Jeruzalema; <font color='#B71C1C'>*</font><br>" +
                            "vrúcne ťa prosíme, <br>" +
                            "pôsobením sviatosti, ktorú sme prijali, <br>" +
                            "utváraj z nás živý chrám svojej milosti, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli vojsť do príbytku tvojej slávy.<br>" +
                            "Skrze Krista, nášho Pána."},

            // SPOLOCNE OMSE PREBLAHOSLAVENEJ PANNY MÁRIE
            {"11", "1", "Omša k preblahoslavenej Panne Marií 1.", "Pane a Bože náš, <br>" +
                    "dopraj nám tešiť sa <br>" +
                    "zo stáleho zdravia tela i duše <font color='#B71C1C'>*</font><br>" +
                    "a na mocný príhovor <br>" +
                    "preblahoslavenej Panny Márie <br>" +
                    "ochraňuj nás v ťažkostiach tohto života <font color='#B71C1C'>—</font><br>" +
                    "a priveď nás do večnej radosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "vypočuj naše prosby, ktoré ti <br>" +
                            "predkladáme spolu s obetnými darmi, <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby na príhovor preblahoslavenej <br>" +
                            "Panny Márie, matky tvojho Syna, <br>" +
                            "žiadna prosba nebola márna <font color='#B71C1C'>—</font><br>" +
                            "a každá modlitba bola vypočutá.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font><br>" +
                            "Pane, nech nám vždy pomáha <br>" +
                            "tvoj jednorodený Syn, ktorý pri svojom <br>" +
                            "narodení neporušil panenstvo <br>" +
                            "svojej matky, ale ho posvätil; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby posvätil aj nás, <br>" +
                            "aby nás uchránil od hriechov <font color='#B71C1C'>—</font><br>" +
                            "a urobil ti príjemnou túto našu obetu.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Pane, pri radostnej oslave <br>" +
                            "preblahoslavenej Panny Márie <br>" +
                            "sme prijali sviatostný pokrm; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sme nasledovali <br>" +
                            "jej žiarivý príklad <font color='#B71C1C'>—</font><br>" +
                            "a horlivo spolupracovali <br>" +
                            "na diele nášho vykúpenia.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "2", "Omša k preblahoslavenej Panne Marií 2.", "Milosrdný Bože, <br>" +
                    "buď nám ochranou v našej slabosti, <font color='#B71C1C'>*</font><br>" +
                    "a keď slávime spomienku <br>" +
                    "na nepoškvrnenú Božiu Rodičku, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme na jej príhovor <br>" +
                    "dokázali povstať z našich neprávostí.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, uctievame si pamiatku <br>" +
                            "panenskej matky tvojho Syna <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa o milosť, <br>" +
                            "aby svätá omša, ktorú slávime, <font color='#B71C1C'>—</font><br>" +
                            "urobila z nás ustavičnú obetu pre teba.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme sviatosť večnej spásy <br>" +
                            "pri spomienke na matku tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <br>" +
                            "aby sme sa tešili z plnosti tvojej milosti <font color='#B71C1C'>—</font><br>" +
                            "a pociťovali spásne účinky.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "3", "Omša k preblahoslavenej Panne Marií 3.", "Pane, dnes si s úctou spomíname <br>" +
                    "na najsvätejšiu Pannu Máriu; <font color='#B71C1C'>*</font><br>" +
                    "na jej orodovanie ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "dopraj, aby sme mohli mať účasť <br>" +
                    "na plnosti tvojej milosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, s radosťou oslavujeme <br>" +
                            "matku tvojho Syna <br>" +
                            "a prinášame ti obetu chvály; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sviatosť, <br>" +
                            "na ktorú sa premenia naše dary, <font color='#B71C1C'>—</font><br>" +
                            "rozmnožila v nás účinky vykúpenia.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás nebeským pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <br>" +
                            "daj, aby sme slovom i životom <br>" +
                            "vyznávali tvojho Syna, <br>" +
                            "narodeného z Panny Márie, <font color='#B71C1C'>—</font><br>" +
                            "ktorého sme v sviatosti prijali.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"11", "4", "Omša k preblahoslavenej Panne Marií 4.","Prosíme ťa, Pane, <br>" +
                    "odpusť viny svojim služobníkom, <font color='#B71C1C'>*</font><br>" +
                    "a keďže sa ti nemôžeme <br>" +
                    "zapáčiť svojimi skutkami, <font color='#B71C1C'>—</font><br>" +
                    "zachráň nás na orodovanie <br>" +
                    "matky tvojho Syna a nášho Pána.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi dary, ktoré ti predkladáme, <br>" +
                            "a osvieť naše srdcia svetlom Ducha Svätého, <font color='#B71C1C'>*</font><br>" +
                            "aby sme podľa príkladu <br>" +
                            "preblahoslavenej Panny Márie ochotne prijímali <br>" +
                            "a v srdci zachovávali každé slovo, <font color='#B71C1C'>—</font><br>" +
                            "čo pochádza od teba.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme sviatosť spásy a viery <br>" +
                            "a pokorne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby sme nábožne uctievali <br>" +
                            "preblahoslavenú Pannu Máriu, <font color='#B71C1C'>—</font><br>" +
                            "a tak si zaslúžili mať s ňou <br>" +
                            "účasť na nebeskej sláve.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "5", "Omša k preblahoslavenej Panne Marií 5.","Bože, ty si vyvolil <br>" +
                    "preblahoslavenú Pannu Máriu <br>" +
                    "spomedzi chudobných a pokorných <br>" +
                    "za matku Vykupiteľa; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme nasledovali jej príklad <font color='#B71C1C'>—</font><br>" +
                    "a s úprimnou vierou vkladali <br>" +
                    "do teba nádej na večnú spásu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše dary, keď slávime <br>" +
                    "nevýslovné dielo lásky tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme podľa príkladu <br>" +
                    "preblahoslavenej Panny Márie napredovali <br>" +
                    "v láske k tebe a k blížnemu.<br>" +
                    "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "dopraj, aby tvoja Cirkev posilnená <br>" +
                            "touto sviatosťou kráčala cestou evanjelia <br>" +
                            "do blaženej vlasti pokoja, <font color='#B71C1C'>—</font><br>" +
                            "kde sa Panna Mária, tvoja pokorná služobnica, <br>" +
                            "už raduje vo večnej sláve.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "6", "Omša k preblahoslavenej Panne Marií 6.","Prosíme ťa, Pane, <br>" +
                    "nech nám pomáha vznešený príhovor <br>" +
                    "preblahoslavenej Márie, vždy Panny, <font color='#B71C1C'>*</font><br>" +
                    "aby sme boli vyslobodení <br>" +
                    "zo všetkých nebezpečenstiev <font color='#B71C1C'>—</font><br>" +
                    "a mohli sa radovať v tvojom pokoji.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prinášame ti obetu zmierenia <br>" +
                            "a chvály a pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby sme nasledovali príklad <br>" +
                            "preblahoslavenej Panny Márie <font color='#B71C1C'>—</font><br>" +
                            "a seba samých obetovali <br>" +
                            "ako svätú a tebe milú obetu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás nebeským pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "daj, nech ti podľa príkladu <br>" +
                            "preblahoslavenej Panny Márie <br>" +
                            "slúžime čistým životom <font color='#B71C1C'>—</font><br>" +
                            "a nech ťa spolu s ňou <br>" +
                            "velebíme úprimnými chválami.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "7", "Omša k preblahoslavenej Panne Marií 7.","Bože, ty si vyvolil panenské lono <br>" +
                    "preblahoslavenej Panny Márie, <br>" +
                    "aby v ňom prebývalo tvoje Slovo; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pod jej ochranou <br>" +
                    "mohli radostne sláviť jej spomienku.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, nech sú ti ľúbezné naše dary, <br>" +
                            "ktoré ti prinášame pri spomienke <br>" +
                            "na preblahoslavenú Pannu Máriu; <font color='#B71C1C'>*</font><br>" +
                            "veď ona ti v panenstve bola milá <font color='#B71C1C'>—</font><br>" +
                            "a v pokore počala Ježiša Krista, <br>" +
                            "tvojho Syna a nášho Pána.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Pane a Bože náš, dal si nám <br>" +
                            "účasť na duchovnom pokrme; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sme vytrvalo <br>" +
                            "nasledovali preblahoslavenú Pannu Máriu, <font color='#B71C1C'>—</font><br>" +
                            "čoraz pozornejšie slúžili Cirkvi <br>" +
                            "a zakúsili radosť z tejto služby.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "8", "Omša k preblahoslavenej Panne Marií 8.","Všemohúci Bože, tvoji veriaci sa tešia <br>" +
                    "z ochrany presvätej Panny Márie; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jej láskavé orodovanie <br>" +
                    "nás osloboď od všetkého zla na zemi <font color='#B71C1C'>—</font><br>" +
                    "a pomôž nám dosiahnuť večnú radosť v nebi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, zhliadni na modlitby a dary <br>" +
                            "svojich veriacich, ktoré ti prinášame <br>" +
                            "pri spomienke na preblahoslavenú Bohorodičku Máriu; <font color='#B71C1C'>*</font><br>" +
                            "daj, nech ti je milá naša obeta <font color='#B71C1C'>—</font><br>" +
                            "a nech nám prinesie tvoju pomoc a milosrdenstvo.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, pri oslave preblahoslavenej <br>" +
                            "Bohorodičky Panny Márie <br>" +
                            "posilnil si nás sviatosťou spásy; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "daj, aby sme vo večnosti <br>" +
                            "mali podiel na ovocí vykúpenia.<br>" +
                            "Skrze Krista, nášho Pána."},
            // 4 – iba v adventnom obdobi
            {"12", "1", "Omša k preblahoslavenej Panne Marií", "Bože, ty si chcel, aby tvoj Syn <br>" +
                    "pri anjelovom zvestovaní prijal telo <br>" +
                    "z lona preblahoslavenej Panny Márie; <font color='#B71C1C'>*</font><br>" +
                    "vyznávame, že ona je skutočne <br>" +
                    "Božou Rodičkou, a pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám vždy pomáhal jej mocný príhovor.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, ty si splnil sľub daný našim otcom <br>" +
                    "a vyvolil si preblahoslavenú Pannu Máriu <br>" +
                    "za matku Spasiteľa; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám nasledovať jej príklad pokory, <br>" +
                    "ktorá ti je milá, <font color='#B71C1C'>—</font><br>" +
                    "a poslušnosti, ktorá nám priniesla spásu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, prijmi tieto dary <br>" +
                            "a premeň ich na sviatosť našej spásy, <br>" +
                            "ktorej predobrazom boli obety našich otcov <font color='#B71C1C'>*</font><br>" +
                            "a v ktorej sa obetuje pravý Baránok, <br>" +
                            "tvoj Syn Ježiš Kristus, <font color='#B71C1C'>—</font><br>" +
                            "podivuhodne narodený z Panny.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Pane a Bože náš, <br>" +
                            "sviatosť, ktorú sme prijali, nech je nám <br>" +
                            "stálym dôkazom tvojej milosrdnej lásky; <font color='#B71C1C'>*</font><br>" +
                            "a keď s úprimným srdcom uctievame <br>" +
                            "matku tvojho Syna, prosíme ťa o milosť, <font color='#B71C1C'>—</font><br>" +
                            "aby nás jeho vtelenie priviedlo k spáse.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            // 5 – iba v vianocnom obdobi
            {"13", "1", "Omša k preblahoslavenej Panne Marií", "Bože, narodením tvojho Syna <br>" +
                    "z preblahoslavenej Panny Márie <br>" +
                    "poskytol si ľuďom večnú spásu; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme vždy <br>" +
                    "pociťovali účinky jej orodovania, <font color='#B71C1C'>—</font><br>" +
                    "veď skrze ňu sme dostali Pôvodcu života, <br>" +
                    "Ježiša Krista, tvojho Syna a nášho Pána.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, ty si chcel, aby panenská matka <br>" +
                    "priviedla na svet tvoje večné Slovo; <font color='#B71C1C'>*</font><br>" +
                    "na príhovor preblahoslavenej Panny Márie dopraj, <br>" +
                    "aby Kristus svojím jasom ožiaril naše temnoty <font color='#B71C1C'>—</font><br>" +
                    "a zo svojej plnosti nám daroval radosť a pokoj.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, slávime požehnané dni narodenia <br>" +
                            "tvojho jednorodeného Syna <br>" +
                            "z preblahoslavenej Panny Márie; <font color='#B71C1C'>*</font><br>" +
                            "dopraj, prosíme, aby nás táto obeta posvätila <font color='#B71C1C'>—</font><br>" +
                            "a priviedla nás k znovuzrodeniu v Kristovi.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Pane, pri dnešnej spomienke <br>" +
                            "na preblahoslavenú Pannu Máriu <font color='#B71C1C'>*</font><br>" +
                            "posilnil si nás Telom a Krvou <br>" +
                            "tvojho vteleného Slova; <font color='#B71C1C'>—</font><br>" +
                            "daj, aby sme touto vznešenou sviatosťou <br>" +
                            "mali stále účasť na božskom živote tvojho Syna.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            // 6 – iba v velkonocnom obdobi
            {"14", "1", "Omša k preblahoslavenej Panne Marií", "Bože, ty si zmŕtvychvstaním svojho Syna, <br>" +
                    "nášho Pána Ježiša Krista, potešil celý svet; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme na príhovor jeho Rodičky <br>" +
                    "Panny Márie dosiahli radosti večného života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Svätý Otče, prijmi našu pokornú obetu, <br>" +
                            "ktorú ti s radosťou prinášame <br>" +
                            "pri oslave preblahoslavenej Panny Márie; <font color='#B71C1C'>*</font><br>" +
                            "a keďže sa pripájame ku Kristovej obete, <font color='#B71C1C'>—</font><br>" +
                            "dopraj, aby nám bola na zemi posilou <br>" +
                            "a v nebi zárukou večnej spásy.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, pri oslave matky tvojho Syna <br>" +
                            "nasýtil si nás veľkonočnou sviatosťou;<font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme svojím životom oslavovali Krista.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
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
            {"16", "1", "Nepoškvrneného Srdca Panny Márie","Bože, ty si pripravil v srdci <br>" +
                    "preblahoslavenej Panny Márie <br>" +
                    "dôstojný príbytok Duchu Svätému; <font color='#B71C1C'>*</font><br>" +
                    "na orodovanie nepoškvrnenej Panny láskavo dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa stali dôstojným chrámom tvojej milosti. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, zhliadni na modlitby <br>" +
                            "a dary svojich veriacich, <br>" +
                            "ktoré ti prinášame pri spomienke <br>" +
                            "na preblahoslavenú Bohorodičku Máriu; <font color='#B71C1C'>*</font><br>" +
                            "daj, nech ti je milá naša obeta <font color='#B71C1C'>—</font><br>" +
                            "a nám nech prinesie tvoju pomoc a milosrdenstvo. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, pri spomienke na Matku tvojho Syna <br>" +
                            "sme prijali sviatosť večnej spásy; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sme pociťovali jej spásne účinky <font color='#B71C1C'>—</font><br>" +
                            "a tešili sa z plnosti tvojej milosti. <br>" +
                            "Skrze Krista, nášho Pána."},
            // SPOLOCNE OMSE MUCENIKOV
            // omsa viacerých muceníkov mimo velkonocneho obdobia
            {"21", "1", "Omša za viacerých mučeníkov 1.", "Pane, dnes si s úctou pripomíname <br>" +
                    "víťaznú smrť svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, vypočuj naše modlitby <br>" +
                    "a daj nám silu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme nasledovali ich vytrvalosť vo viere.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Svätý Otče, prijmi dary, ktoré ti prinášame <br>" +
                            "pri spomienke na svätých mučeníkov, <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj aj nám, <font color='#B71C1C'>—</font><br>" +
                            "aby sme neochvejne vyznávali <br>" +
                            "tvoje sväté meno.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, v živote svätých mučeníkov <br>" +
                            "si nám obdivuhodne priblížil tajomstvo kríža; <font color='#B71C1C'>*</font><br>" +
                            "láskavo dopraj, aby sme sa posilnení <br>" +
                            "touto obetou verne pridŕžali Krista <font color='#B71C1C'>—</font><br>" +
                            "a v Cirkvi pracovali na spáse všetkých ľudí.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "2", "Omša za viacerých mučeníkov 2.", "Všemohúci a večný Bože, <br>" +
                    "svätým mučeníkom <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> si dal milosť, <br>" +
                    "že mohli trpieť pre Krista; <font color='#B71C1C'>*</font><br>" +
                    "ako si im dal odvahu podstúpiť smrť za teba, <br>" +
                    "tak aj nám slabým láskavo pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ťa neohrozene <br>" +
                    "vyznávali svojím životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "na sviatok tvojich svätých mučeníkov <br>" +
                            "prijmi túto zmiernu obetu <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby nás očistila od hriechov <font color='#B71C1C'>—</font><br>" +
                            "a urobila ti milými naše prosby.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, posilnil si nás nebeským chlebom <br>" +
                            "a v Kristovi si nás urobil jedným telom; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme sa podľa príkladu <br>" +
                            "svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> <br>" +
                            "nikdy neodlúčili od tvojho Syna <font color='#B71C1C'>—</font><br>" +
                            "a z lásky k nemu premáhali všetky ťažkosti, <br>" +
                            "pretože nás nesmierne miloval.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"21", "3", "Omša za viacerých mučeníkov 3.", "Pane, dávaš nám svätú radosť <br>" +
                    "z víťazstva tvojich mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, nech nás ich príklad <br>" +
                    "posilňuje vo viere a v čnostiach <font color='#B71C1C'>—</font><br>" +
                    "a ich mocné orodovanie <br>" +
                    "nech nám dodáva odvahy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "nech nám orodovanie svätých <br>" +
                    "mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> získa tvoju priazeň <font color='#B71C1C'>—</font><br>" +
                    "a posilní nás vo vyznávaní tvojej pravdy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi obetné dary, <br>" +
                            "ktoré ti prinášame pri oslave <br>" +
                            "mučeníckej smrti svätých <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby nám eucharistická obeta <br>" +
                            "dala silu prekonávať životné ťažkosti, <font color='#B71C1C'>—</font><br>" +
                            "ako týmto mučeníkom <br>" +
                            "dala vytrvalosť v protivenstvách.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, zachovaj v nás svoje dary, <font color='#B71C1C'>*</font><br>" +
                            "a čo sme v deň spomienky <br>" +
                            "na svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> <br>" +
                            "prijali z tvojej štedrosti, <font color='#B71C1C'>—</font><br>" +
                            "nech nám prinesie pokoj a spásu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "4", "Omša za viacerých mučeníkov 4.", "Bože, napĺňaš nás radosťou z oslavy <br>" +
                    "víťaznej smrti svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme nasledovali ich odvahu <br>" +
                    "v utrpení pre tvoje meno.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, ty si dal svätým <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> milosť <br>" +
                    "dosiahnuť víťaznú korunu mučeníkov; <font color='#B71C1C'>*</font><br>" +
                    "na ich príhovor a pre ich zásluhy <br>" +
                    "odpusť nám hriechy <font color='#B71C1C'>—</font><br>" +
                    "a osloboď nás od všetkých protivenstiev.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prinášame ti obetné dary v deň <br>" +
                            "spomienky na svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <br>" +
                            "ktorým si pre ich hrdinskú vieru <br>" +
                            "dal svetlo večnej slávy; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, odpusť nám hriechy <font color='#B71C1C'>—</font><br>" +
                            "a daruj nám svoj pokoj.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, vznešenou sviatosťou, <br>" +
                            "ktorú sme prijali pri oslave <br>" +
                            "svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <br>" +
                            "rozmnožuj v nás svoju milosť, <font color='#B71C1C'>*</font><br>" +
                            "aby sme sa z ich hrdinského zápasu <br>" +
                            "naučili trpezlivosti v protivenstvách <font color='#B71C1C'>—</font><br>" +
                            "a dosiahli veniec víťazstva.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "5", "Omša za viacerých mučeníkov 5.", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "rozmnož v nás vieru, <br>" +
                    "ktorou si oslávil svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <br>" +
                    "keď ju vyznávali až po vyliatie krvi, <font color='#B71C1C'>—</font><br>" +
                    "a daj, nech nás nasledovanie tejto viery <br>" +
                    "urobí spravodlivými pred tvojím pohľadom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "zhliadni na tieto obetné dary, <font color='#B71C1C'>—</font><br>" +
                            "aby sme podľa príkladu svätých <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> <br>" +
                            "slávili a uctievali tajomstvo umučenia <br>" +
                            "tvojho Syna s úprimnou zbožnosťou.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font><br>" +
                            "Všemohúci Bože, <br>" +
                            "táto svätá obeta v deň spomienky <br>" +
                            "na víťazstvo svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> <br>" +
                            "nech ustavične rozohňuje naše srdcia <br>" +
                            "ohňom tvojej lásky, <font color='#B71C1C'>*</font><br>" +
                            "aby sme dosiahli odmenu prisľúbenú tým, <font color='#B71C1C'>—</font><br>" +
                            "čo ti zostanú verní až do konca.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, pri oslave svätých <br>" +
                            "mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> posilnil si nás predrahým <br>" +
                            "Telom a Krvou svojho jednorodeného Syna; <font color='#B71C1C'>*</font><br>" +
                            "vrúcne ťa prosíme o vytrvalú lásku k tebe, <font color='#B71C1C'>—</font><br>" +
                            "aby sme žili v tvojej milosti <br>" +
                            "a odhodlane kráčali k tebe.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa jedneho muceníka mimo velkonocneho obdobia
            {"22", "1", "Omša za jedného mučeníka 1.", "Všemohúci a milosrdný Bože, <br>" +
                    "oslavujeme víťaznú smrť svätého mučeníka <font color='#B71C1C'>M.</font>, <br>" +
                    "ktorému si dal silu pretrpieť všetky muky; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my víťazne čelili <br>" +
                    "všetkým útokom nepriateľa.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "posväť tieto dary svojím mocným požehnaním <font color='#B71C1C'>*</font><br>" +
                            "a zapáľ v nás oheň svojej lásky, <font color='#B71C1C'>—</font><br>" +
                            "ktorou svätý <font color='#B71C1C'>M.</font> prekonal všetky telesné muky.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font><br>" +
                            "Prosíme ťa, Pane, prijmi dary, <br>" +
                            "ktoré ti prinášame v deň spomienky <br>" +
                            "na svätého mučeníka <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                            "a dopraj, aby ti boli také milé, <font color='#B71C1C'>—</font><br>" +
                            "ako ti bola vzácna obeta jeho života.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech nám sviatosť, ktorú sme prijali, <br>" +
                            "dá silu ducha, <font color='#B71C1C'>*</font><br>" +
                            "ktorá svätého mučeníka <font color='#B71C1C'>M.</font> <br>" +
                            "urobila verným v tvojej službe <font color='#B71C1C'>—</font><br>" +
                            "a víťazom v utrpení.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "2", "Omša za jedného mučeníka 2.", "Všemohúci a večný Bože, <br>" +
                    "svätému <font color='#B71C1C'>M.</font> si dal milosť, <br>" +
                    "že za pravdu bojoval až na smrť; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, <br>" +
                    "aby sme z lásky k tebe <br>" +
                    "znášali všetky protivenstvá <font color='#B71C1C'>—</font><br>" +
                    "a zo všetkých síl sa ponáhľali k tebe, <br>" +
                    "jedinému zdroju života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Dobrotivý Bože, <br>" +
                            "svojím požehnaním posväť tieto dary <font color='#B71C1C'>*</font><br>" +
                            "a posilni nás vo viere, <font color='#B71C1C'>—</font><br>" +
                            "ktorú svätý <font color='#B71C1C'>M.</font> dosvedčil svojou krvou.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font><br>" +
                            "Pane, prinášame ti tieto obetné dary <br>" +
                            "pri spomienke na svätého mučeníka <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                            "ktorého žiadne pokušenie nemohlo odlúčiť <font color='#B71C1C'>—</font><br>" +
                            "od jednoty Kristovho tajomného tela.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Pane, posilnil si nás sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pomáhaj nám nasledovať <br>" +
                            "obdivuhodnú vytrvalosť svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                            "aby sme si zaslúžili večnú odmenu <br>" +
                            "pripravenú tým, čo vytrvajú <br>" +
                            "v dobrom až do konca.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa viacerých muceníkov vo velkonocnom obdobi
            {"23", "1", "Omša za viacerých mučeníkov 1.", "Všemohúci Bože, svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> <br>" +
                    "si obdaril silou, že za tvoje slovo <br>" +
                    "a za Ježiša Krista položili život; <font color='#B71C1C'>*</font><br>" +
                    "aj nás posilňuj Duchom Svätým, <br>" +
                    "aby sme verne počúvali tvoje posolstvo <font color='#B71C1C'>—</font><br>" +
                    "a statočne vyznávali svoju vieru.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, ty dávaš svojim verným <br>" +
                    "stálosť vo viere a silu v slabosti; <font color='#B71C1C'>*</font><br>" +
                    "na príhovor mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> dopraj <br>" +
                    "aj nám účasť na smrti a zmŕtvychvstaní <br>" +
                    "tvojho jednorodeného Syna, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v spoločenstve s nimi <br>" +
                    "dosiahli u teba dokonalú radosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, v deň víťaznej smrti <br>" +
                            "tvojich svätých mučeníkov <br>" +
                            "ti prinášame obetu, <font color='#B71C1C'>*</font><br>" +
                            "v ktorej má pôvod a silu <br>" +
                            "každé mučeníctvo.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, touto Eucharistiou sme oslávili <br>" +
                            "víťazstvo svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pomáhaj duchovne zvíťaziť všetkým, <br>" +
                            "čo sa posilňujú chlebom života na pozemskej púti, <font color='#B71C1C'>—</font><br>" +
                            "aby raz mohli jesť zo stromu života v nebeskej vlasti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "2", "Omša za viacerých mučeníkov 2.", "Prosíme ťa, Pane, <br>" +
                    "nech s radosťou oslavujeme <br>" +
                    "svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                    "ktorí neohrozene vyznávali umučenie <br>" +
                    "a zmŕtvychvstanie tvojho jednorodeného Syna, <font color='#B71C1C'>—</font><br>" +
                    "a svoje svedectvo potvrdili vyliatím vlastnej krvi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "milostivo zhliadni na tieto dary <br>" +
                            "a posväť ich Duchom Svätým, <font color='#B71C1C'>*</font><br>" +
                            "aby v našich srdciach vzbudili takú lásku, <font color='#B71C1C'>—</font><br>" +
                            "s akou <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> prekonali <br>" +
                            "všetky útrapy mučeníctva.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, v deň spomienky <br>" +
                            "na svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> <br>" +
                            "jedli sme z toho istého chleba; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, posilňuj v nás <br>" +
                            "lásku k tebe a k všetkým ľuďom <font color='#B71C1C'>—</font><br>" +
                            "a daj nám milosť žiť novým životom.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa jedneho muceníka vo velkonocnom obdobi
            {"24", "1", "Omša za jedného mučeníka", "Bože, na slávu svojej Cirkvi si ozdobil <br>" +
                    "svätého <font color='#B71C1C'>M.</font> korunou mučeníctva; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme podľa jeho príkladu <br>" +
                    "nasledovali trpiaceho Spasiteľa, <font color='#B71C1C'>—</font><br>" +
                    "a tak si zaslúžili vojsť do večnej radosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, pri dnešnej spomienke <br>" +
                            "na svätého mučeníka <font color='#B71C1C'>M.</font> <br>" +
                            "prijmi túto obetu zmierenia a chvály, <font color='#B71C1C'>*</font><br>" +
                            "aby nám získala odpustenie <font color='#B71C1C'>—</font><br>" +
                            "a zaslúžila milosť ustavične ti <br>" +
                            "vzdávať vďaky.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, na sviatok svätého mučeníka <font color='#B71C1C'>M.</font> <br>" +
                            "sme s radosťou prijali tvoje nebeské dary <br>" +
                            "a slávením Eucharistie <br>" +
                            "sme zvestovali smrť tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme so svätými mučeníkmi <br>" +
                            "mali aj účasť na jeho <br>" +
                            "zmŕtvychvstaní a sláve.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o mucenikoch misionaroch
            {"25", "1", "Omša za viacerých mučeníkov misionárov", "Všemohúci a milosrdný Bože, <br>" +
                    "kázaním svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> <br>" +
                    "priviedol si národy k poznaniu <br>" +
                    "tvojho jednorodeného Syna; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "na ich orodovanie <br>" +
                    "daj týmto národom vytrvalosť vo viere.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, pri spomienke na víťaznú smrť <br>" +
                            "tvojich svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> <br>" +
                            "vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby sme touto obetou dôstojne zvestovali <br>" +
                            "smrť tvojho jednorodeného Syna, <font color='#B71C1C'>—</font><br>" +
                            "ktorý mučeníkov povzbudzuje svojím slovom <br>" +
                            "a posilňuje svojím príkladom.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, posilnil si nás nebeským pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sme podľa príkladu <br>" +
                            "svätých mučeníkov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> <br>" +
                            "ustavične pamätali na lásku <br>" +
                            "a umučenie tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "a tak dosiahli blažený pokoj v nebeskej vlasti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"28", "1", "Omša za jedného mučeníka misionára", "Prosíme ťa, všemohúci Bože, <br>" +
                    "daj, aby sme s oddanou láskou <br>" +
                    "nasledovali vieru svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                    "ktorý za šírenie evanjelia položil život <font color='#B71C1C'>—</font><br>" +
                    "a zaslúžil si veniec mučeníctva.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, pri oslave mučeníctva svätého <font color='#B71C1C'>M.</font> <br>" +
                            "prinášame ti obetné dary; <font color='#B71C1C'>*</font><br>" +
                            "láskavo na ne zhliadni <br>" +
                            "a daj, aby sme svojím životom napodobňovali <br>" +
                            "obetu tvojho Syna na kríži, <font color='#B71C1C'>—</font><br>" +
                            "ktorú slávime v tomto tajomstve.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, dal si nám účasť na nebeskej hostine; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, nech nás posilní spomienka <br>" +
                            "na svätého mučeníka <font color='#B71C1C'>M.</font> <font color='#B71C1C'>—</font><br>" +
                            "a nech nás sprevádza jeho orodovanie, <br>" +
                            "aby sme mohli nasledovať jeho príklad viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o panne mucenici
            {"26", "1", "Omša o panne mučenici", "Bože, v dnešný deň nám poskytuješ radosť <br>" +
                    "z výročnej spomienky na svätú <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme na jej orodovanie nasledovali <br>" +
                    "jej žiarivý príklad čistoty a odvahy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, pri oslave svätej <font color='#B71C1C'>M.</font> <br>" +
                            "prinášame ti obetné dary <br>" +
                            "a prosíme, aby ti boli milé, <font color='#B71C1C'>*</font><br>" +
                            "ako sa ti páčila jej odvaha, <font color='#B71C1C'>—</font><br>" +
                            "s ktorou obetovala svoj život.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, v zástupe svätíc si ozdobil svätú <font color='#B71C1C'>M.</font> <br>" +
                            "korunou panenstva i korunou mučeníctva; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme pôsobením prijatej sviatosti <br>" +
                            "statočne premáhali všetko zlo <font color='#B71C1C'>—</font><br>" +
                            "a dosiahli nebeskú slávu.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o svatej zene mucenici
            {"27", "1", "Omša o svätej žene mučenici", "Bože, s tvojou pomocou aj slabý človek <br>" +
                    "môže dosiahnuť hrdinskú odvahu; <font color='#B71C1C'>*</font><br>" +
                    "pri oslave svätej <font color='#B71C1C'>M.</font>, <br>" +
                    "ktorej si dal silu k mučeníctvu, <br>" +
                    "ťa pokorne prosíme, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám na jej orodovanie <br>" +
                    "prekonať všetky životné ťažkosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, pri spomienke na nebeské víťazstvo <br>" +
                            "svätej <font color='#B71C1C'>M.</font> ti s radosťou prinášame dnešnú obetu, <font color='#B71C1C'>*</font><br>" +
                            "ktorou ohlasujeme tvoje veľké skutky, <font color='#B71C1C'>—</font><br>" +
                            "a tešíme sa, že sme získali jej slávny príhovor.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, máme nekonečnú radosť z účasti <br>" +
                            "na tejto sviatosti a zo spomienky na svätú <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, dopraj, <font color='#B71C1C'>—</font><br>" +
                            "aby sme dôstojne prijímali sviatosť, <br>" +
                            "ktorú si nám daroval.<br>" +
                            "Skrze Krista, nášho Pána."},
            // SPOLOCNE OMSE DUCHOVNYCH PASTIEROVSPOLOCNE OMSE DUCHOVNYCH PASTIEROV,
            // omsa o papezoch alebo biskupov
            {"31", "1", "Omša o pápežoch alebo biskupoch 1.", "Všemohúci a večný Bože, <br>" +
                    "ty si povolal svätého pápeža <font color='#B71C1C'>M.</font>, <br>" +
                    "aby spravoval tvoj ľud <br>" +
                    "a slovom i príkladom sa staral o jeho dobro; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor ochraňuj pastierov <br>" +
                    "svojej Cirkvi i ľud, ktorý si im zveril, <font color='#B71C1C'>—</font><br>" +
                    "a všetkých veď po ceste spásy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, prijmi túto obetu svojho ľudu, <font color='#B71C1C'>*</font><br>" +
                            "ktorú ti pri oslave svätého <font color='#B71C1C'>M.</font> obetujeme na slávu, <font color='#B71C1C'>—</font><br>" +
                            "aby nám slúžila na večnú spásu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, prosíme ťa, nech sviatosť, <br>" +
                            "ktorú sme prijali, roznieti v nás oheň lásky, <font color='#B71C1C'>*</font><br>" +
                            "ktorým mocne horel svätý <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                            "keď celý svoj život zasvätil Cirkvi.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "2", "Omša o pápežoch alebo biskupoch 2.", "Bože, uctievame si záslužné činy svätého <font color='#B71C1C'>M.</font>, <br>" +
                    "ktorého si ustanovil za pastiera celej Cirkvi <br>" +
                    "a obdaril si ho vynikajúcimi čnosťami a múdrosťou; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj nám milosť, aby sme pred ľuďmi <br>" +
                    "svietili svetlom dobrých skutkov <font color='#B71C1C'>—</font><br>" +
                    "a horeli stále väčšou láskou k tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, ty si svätého <font color='#B71C1C'>M.</font> ustanovil <br>" +
                    "za nástupcu apoštola Petra <br>" +
                    "a zveril si mu starostlivosť o celú Cirkev; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor neustále ochraňuj svoj ľud, <font color='#B71C1C'>—</font><br>" +
                    "aby v pravej viere napredoval do nebeskej vlasti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, vypočuj našu modlitbu <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby nám bola posilou obeta, <br>" +
                            "ktorú ti prinášame pri oslave svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                            "veď ňou si zmyl hriechy celého sveta.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, nech nám sviatosť, <br>" +
                            "ktorú sme prijali v deň oslavy svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                            "poskytne pomoc v časnom živote <font color='#B71C1C'>—</font><br>" +
                            "a vedie nás k blaženej večnosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"36", "1", "Omša o pápežoch alebo biskupoch 1.", "Bože, vo svätom biskupovi <font color='#B71C1C'>M.</font> <br>" +
                    "si dal svojej Cirkvi vzor dobrého pastiera; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, udeľ nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme na jeho príhovor <br>" +
                    "dosiahli radosti večného života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, prijmi túto obetu svojho ľudu, <font color='#B71C1C'>*</font><br>" +
                            "ktorú ti pri oslave svätého <font color='#B71C1C'>M.</font> obetujeme na slávu, <font color='#B71C1C'>—</font><br>" +
                            "aby nám slúžila na večnú spásu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, prosíme ťa, nech sviatosť, <br>" +
                            "ktorú sme prijali, roznieti v nás oheň lásky, <font color='#B71C1C'>*</font><br>" +
                            "ktorým mocne horel svätý <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                            "keď celý svoj život zasvätil Cirkvi.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"36", "2", "Omša o pápežoch alebo biskupoch 2.", "Všemohúci Bože, daj nám dôstojne <br>" +
                    "osláviť svätého biskupa <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                    "ktorý slovom i príkladom slúžil veriacemu ľudu, <font color='#B71C1C'>—</font><br>" +
                    "a dopraj, aby sme vždy pociťovali <br>" +
                    "účinky jeho mocného príhovoru u teba.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, vypočuj našu modlitbu <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby nám bola posilou obeta, <br>" +
                    "ktorú ti prinášame pri oslave svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "veď ňou si zmyl hriechy celého sveta.<br>" +
                    "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, nech nám sviatosť, <br>" +
                            "ktorú sme prijali v deň oslavy svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                            "poskytne pomoc v časnom živote <font color='#B71C1C'>—</font><br>" +
                            "a vedie nás k blaženej večnosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o biskupoch
            {"32", "1", "Omša o biskupoch 1.", "Všemohúci Bože, daj nám dôstojne <br>" +
                    "osláviť svätého biskupa <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                    "ktorý slovom i príkladom slúžil veriacemu ľudu, <font color='#B71C1C'>—</font><br>" +
                    "a dopraj, aby sme vždy pociťovali <br>" +
                    "účinky jeho mocného príhovoru u teba.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, vypočuj našu modlitbu <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby nám bola posilou obeta, <br>" +
                    "ktorú ti prinášame pri oslave svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "veď ňou si zmyl hriechy celého sveta.<br>" +
                    "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, nech nám sviatosť, <br>" +
                            "ktorú sme prijali v deň oslavy svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                            "poskytne pomoc v časnom živote <font color='#B71C1C'>—</font><br>" +
                            "a vedie nás k blaženej večnosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"32", "2", "Omša o biskupoch 2.", "Bože, ty si k svätým pastierom pridružil <br>" +
                    "biskupa <font color='#B71C1C'>M.</font> preniknutého ohňom lásky <br>" +
                    "a vierou, ktorá víťazí nad svetom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj nám na jeho príhovor <br>" +
                    "vytrvalosť vo viere a láske, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v spoločenstve s ním <br>" +
                    "mali účasť na tvojej sláve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font> <br>" +
                    "Pane a Bože náš, ty si dal svätému <font color='#B71C1C'>M.</font> <br>" +
                    "hlboké poznanie nebeskej náuky; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, <br>" +
                    "aby sme sa verne pridržiavali tvojej pravdy <font color='#B71C1C'>—</font><br>" +
                    "a vyznávali ju svojím životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi obetné dary, <br>" +
                            "ktoré ti tvoj ľud prináša <br>" +
                            "v deň oslavy svätého biskupa <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby nám zaslúžili pomoc, <font color='#B71C1C'>—</font><br>" +
                            "ktorú od teba s dôverou očakávame.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, <br>" +
                            "posilnil si nás presvätým Telom <br>" +
                            "a predrahou Krvou svojho Syna; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, dopraj, <font color='#B71C1C'>—</font><br>" +
                            "aby nám ich časté prijímanie <br>" +
                            "bolo istou zárukou spásy.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o duchovnych pastieroch
            {"33", "1", "Omša o duchovných pastieroch", "Bože, ty si obdaril <br>" +
                    "svätých <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> <font color='#B71C1C'>(</font>svätých biskupov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.)</font> <br>" +
                    "duchom pravdy a lásky, <br>" +
                    "aby boli dobrými pastiermi tvojho ľudu; <font color='#B71C1C'>*</font><br>" +
                    "s úctou slávime ich sviatok a prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám ich príklad a orodovanie <br>" +
                    "pomáhali napredovať v kresťanskom živote.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, pri oslave tvojich svätých <br>" +
                            "prinášame ti obetu chvály v synovskej dôvere, <font color='#B71C1C'>*</font><br>" +
                            "že pre jej zásluhy od nás odvrátiš <br>" +
                            "zlo prítomné i budúce.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, v deň spomienky <br>" +
                            "na tvojich svätých <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> <br>" +
                            "sme prijali nebeskú sviatosť; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme raz vo večnej sláve <br>" +
                            "uzreli v plnom svetle tajomstvo, <font color='#B71C1C'>—</font><br>" +
                            "ktoré teraz slávime pod sviatostnými znakmi.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"36", "1", "Omša o duchovnom pastierovi 1.", "Všemohúci Bože, pokorne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "na príhovor svätého <font color='#B71C1C'>(</font>biskupa<font color='#B71C1C'>) M.</font> <br>" +
                    "rozmnožuj v nás svoje dary <font color='#B71C1C'>—</font><br>" +
                    "a našim časom udeľ pravý pokoj.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, zhliadni na obetné dary, <br>" +
                            "ktoré sme priniesli na tvoj oltár <br>" +
                            "pri spomienke na svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                            "a odpusť nám hriechy pre zásluhy svätej obety, <font color='#B71C1C'>—</font><br>" +
                            "ktorá mu pomohla k nebeskej sláve.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, nech v nás všetkých, <br>" +
                            "ktorí slávime sviatok svätého <font color='#B71C1C'>M.</font>, <br>" +
                            "eucharistický pokrm upevní <br>" +
                            "a rozhojní silu z neba, <font color='#B71C1C'>*</font><br>" +
                            "aby sme si zachovali neporušený dar viery <font color='#B71C1C'>—</font><br>" +
                            "a kráčali po bezpečnej ceste spásy.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"36", "2", "Omša o duchovnom pastierovi 2.", "Bože, svetlo veriacich a pastier duší, <br>" +
                    "ty si dal Cirkvi svätého <font color='#B71C1C'>(</font>biskupa<font color='#B71C1C'>) M.</font>, <br>" +
                    "aby živil tvoj ľud Božím slovom <br>" +
                    "a poučoval ho svojím príkladom; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, <br>" +
                    "aby sme si zachovali vieru, ktorú hlásal slovom, <font color='#B71C1C'>—</font><br>" +
                    "a kráčali cestou, ktorú ukazoval skutkami.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Všemohúci Bože, <br>" +
                            "prijmi obetné dary <br>" +
                            "v deň oslavy svätého <font color='#B71C1C'>M.</font> <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby vznešená obeta, <br>" +
                            "v ktorej sa prejavuje tvoja božská moc, <font color='#B71C1C'>—</font><br>" +
                            "bola pre nás všetkých prameňom spásy.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nás prijatá sviatosť <br>" +
                            "pripraví na večné radosti, <font color='#B71C1C'>—</font><br>" +
                            "ktoré si svätý <font color='#B71C1C'>M.</font> zaslúžil <br>" +
                            "svojou vernou službou.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font><br>" +
                            "Všemohúci Bože, <br>" +
                            "posilnil si nás posvätným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "pomôž nám nasledovať príklad svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ťa uctievali s oddaným srdcom <br>" +
                            "a blížnemu slúžili s neúnavnou láskou.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o zakladateloch miestych cirkvi
            {"34", "1", "Omša o zakladateľovi miestnej cirkvi", "Všemohúci a milosrdný Bože, <br>" +
                    "kázaním svätého <font color='#B71C1C'>M.</font> si priviedol <br>" +
                    "našich otcov k svetlu pravdy; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <br>" +
                    "daj, aby sme celým životom <br>" +
                    "dosvedčovali kresťanskú vieru, <font color='#B71C1C'>—</font><br>" +
                    "ku ktorej sa hrdo hlásime.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Pane, zhliadni na svoju rodinu, <br>" +
                    "ktorú svätý <font color='#B71C1C'>(</font>biskup<font color='#B71C1C'>) M.</font> zrodil <br>" +
                    "slovom pravdy a živil chlebom života; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <br>" +
                    "na jeho orodovanie daj <br>" +
                    "horlivosť v láske všetkým, <font color='#B71C1C'>—</font><br>" +
                    "ktorých si jeho službou priviedol k viere.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Všemohúci Bože, <br>" +
                            "prijmi obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "ktoré ti prinášame pri oslave svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                            "a svojou božskou mocou <br>" +
                            "ich premeň na sviatosť našej spásy.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, pri oslave svätého <font color='#B71C1C'>M.</font> <br>" +
                            "sme prijali záloh večnej spásy; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, nech nám toto prijímanie <br>" +
                            "pomáha v časnom živote <font color='#B71C1C'>—</font><br>" +
                            "a privedie nás do života večného.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"38", "1", "Omša o zakladateľoch miestnych cirkví", "Pane, láskavo zhliadni na svoju Cirkev, <br>" +
                    "ktorú si priviedol k viere <br>" +
                    "apoštolskou činnosťou svätých <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "na ich mocné orodovanie <br>" +
                    "udržuj v nej horlivý kresťanský život.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, kázaním a svedectvom <br>" +
                    "svätých <font color='#B71C1C'>(</font>biskupov<font color='#B71C1C'>) M.</font> a <font color='#B71C1C'>M.</font> povolal si <br>" +
                    "našich otcov k obdivuhodnému svetlu evanjelia; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "na ich príhovor nám pomáhaj <br>" +
                    "rásť v milosti a v poznaní <br>" +
                    "nášho Pána Ježiša Krista, tvojho Syna.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, prijmi dary svojho ľudu, <font color='#B71C1C'>*</font><br>" +
                            "ktoré sme ti priniesli na sviatok <br>" +
                            "tvojich svätých <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                            "a vo svojej dobrote stvor v nás láskavé srdce. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, na sviatok svätých <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> s vďačným <br>" +
                            "srdcom oslavujeme počiatky našej viery <br>" +
                            "a chválime ťa, že obdivuhodne <br>" +
                            "pôsobíš vo svojich svätých; <font color='#B71C1C'>*</font><br>" +
                            "daj nech nás naplní radosťou spasiteľný dar, <font color='#B71C1C'>—</font><br>" +
                            "ktorý sme prijali z tvojho oltára.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o misionaroch
            {"35", "1", "Omša o misionároch 1.", "Bože, misijnou činnosťou svätého <font color='#B71C1C'>(</font>biskupa<font color='#B71C1C'>) M.</font> <br>" +
                    "priviedol si mnohých ľudí <br>" +
                    "z temnôt k svetlu pravdy; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, <br>" +
                    "aby sme zostali pevní vo viere <font color='#B71C1C'>—</font><br>" +
                    "a neochvejne sa pridŕžali <br>" +
                    "nádeje evanjelia, ktoré hlásal.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Všemohúci a večný Bože, <br>" +
                    "v dnešný deň nám dávaš radosť <br>" +
                    "z nebeskej slávy svätého <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "milostivo nám pomáhaj zachovať <br>" +
                    "a skutkami vyznávať vieru, <font color='#B71C1C'>—</font><br>" +
                    "ktorú on horlivo a neúnavne šíril.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Všemohúci Bože, pri oslave svätého <font color='#B71C1C'>M.</font> <br>" +
                            "prinášame ti obetné dary; <font color='#B71C1C'>*</font><br>" +
                            "láskavo na ne zhliadni <br>" +
                            "a daj, aby sme svojím životom <br>" +
                            "napodobňovali obetu tvojho Syna na kríži, <font color='#B71C1C'>—</font><br>" +
                            "ktorú slávime v tomto tajomstve.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, mocou tejto sviatosti <br>" +
                            "upevni nás v pravej viere, <br>" +
                            "aby sme ju všade vyznávali slovom i skutkom, <font color='#B71C1C'>*</font><br>" +
                            "ako ju neúnavne ohlasoval svätý <font color='#B71C1C'>M.</font> <font color='#B71C1C'>—</font><br>" +
                            "a jej šíreniu zasvätil celý svoj život.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"35", "2", "Omša o misionároch 2.", "Bože, ty si zveľadil svoju Cirkev <br>" +
                    "apoštolskou starostlivosťou svätého <font color='#B71C1C'>M.</font> <br>" +
                    "a jeho horlivosťou za vieru; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, aby sa tebe zasvätený ľud <br>" +
                    "neustále vzmáhal vo viere <font color='#B71C1C'>—</font><br>" +
                    "a vzrastal vo svätosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, vypočuj naše pokorné prosby <font color='#B71C1C'>*</font><br>" +
                            "a osloboď nás od každej viny, <font color='#B71C1C'>—</font><br>" +
                            "aby nás tvojou milosťou <br>" +
                            "očistili tajomstvá, ktoré slávime.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, <br>" +
                            "prosíme ťa, nech sviatosť, <br>" +
                            "ktorú sme prijali, živí v nás vieru, <font color='#B71C1C'>*</font><br>" +
                            "ktorú apoštolským ohlasovaním <br>" +
                            "a starostlivosťou zachoval svätý <font color='#B71C1C'>M.</font><br>" +
                            "Skrze Krista, nášho Pána."},
            {"35", "3", "Omša o misionároch 3.", "Bože, ty si poslal svätého <font color='#B71C1C'>M.</font> <br>" +
                    "ohlasovať Kristovo nevyspytateľné bohatstvo; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj <br>" +
                    "vždy lepšie ťa poznávať, <font color='#B71C1C'>—</font><br>" +
                    "aby sme verne žili podľa pravdy evanjelia <br>" +
                    "a prinášali ovocie dobrých skutkov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "zošli nebeské požehnanie na obetné dary, <br>" +
                            "ktoré ti prinášame pri oslave svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                            "aby nás pri svätom prijímaní <br>" +
                            "očistili od každej viny <font color='#B71C1C'>—</font><br>" +
                            "a pomáhali nám dosiahnuť večný život v nebi.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, nech nás <br>" +
                            "posilňuje sviatosť, ktorú sme prijali, <font color='#B71C1C'>*</font><br>" +
                            "aby sme nasledovali príklad <br>" +
                            "apoštolských čností svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                            "ktorého dnes s radosťou oslavujeme.<br>" +
                            "Skrze Krista, nášho Pána."},
            // SPOLOCNE OMSE UCITELOV CIRKVI
            {"4", "1", "Omša o učiteľoch Cirkvi 1.", "Všemohúci a večný Bože, <br>" +
                    "svätého <font color='#B71C1C'>(</font>biskupa<font color='#B71C1C'>) M.</font> si dal <br>" +
                    "svojej Cirkvi za učiteľa; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, natrvalo upevni <br>" +
                    "v našich srdciach náuku, <br>" +
                    "ktorú on z vnuknutia Ducha Svätého učil, <font color='#B71C1C'>—</font><br>" +
                    "a keďže si nám ho dal za patróna, <br>" +
                    "nech nám u teba vyprosuje tvoje milosrdenstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, zhliadni na obetné dary, <br>" +
                            "ktoré ti s radosťou prinášame <br>" +
                            "pri oslave svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby sme sa podľa jeho náuky <br>" +
                            "stali obetným darom pre teba <font color='#B71C1C'>—</font><br>" +
                            "a celým svojím životom ťa oslavovali.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, tvoj Syn je pre nás chlebom života; <font color='#B71C1C'>*</font><br>" +
                            "daj, nech je aj naším učiteľom, <font color='#B71C1C'>—</font><br>" +
                            "aby sme podľa príkladu svätého <font color='#B71C1C'>M.</font> <br>" +
                            "lepšie poznávali tvoju pravdu <br>" +
                            "a dosvedčovali ju bratskou láskou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"4", "2", "Omša o učiteľoch Cirkvi 2.", "Pane a Bože náš, ty si dal svätému <font color='#B71C1C'>M.</font> <br>" +
                    "hlboké poznanie nebeskej náuky; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, <br>" +
                    "aby sme sa verne pridržiavali tvojej pravdy <font color='#B71C1C'>—</font><br>" +
                    "a vyznávali ju svojím životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nás pri slávení týchto svätých tajomstiev <br>" +
                            "naplní svetlom viery Duch Svätý, <font color='#B71C1C'>—</font><br>" +
                            "ktorý svätého <font color='#B71C1C'>M.</font> povzbudzoval <br>" +
                            "k šíreniu tvojej slávy.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, posilnil si nás nebeským pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <br>" +
                            "aby sme nasledovali náuku svätého <font color='#B71C1C'>M.</font> <font color='#B71C1C'>—</font><br>" +
                            "a vždy vzdávali vďaky za prijaté dary.<br>" +
                            "Skrze Krista, nášho Pána."},
            // SPOLOCNE OMSE PANNIEN
            {"51", "1", "Omša o pannách 1.", "Bože, naša spása, <br>" +
                    "pri oslave svätej panny <font color='#B71C1C'>M.</font> <br>" +
                    "vypočuj naše prosby, <font color='#B71C1C'>*</font><br>" +
                    "aby sme sa od nej naučili <br>" +
                    "slúžiť ti s oddaným srdcom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, pri oslave svätej panny <font color='#B71C1C'>M.</font> <br>" +
                            "ťa zvelebujeme a pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby ti naša obeta bola taká milá, <font color='#B71C1C'>—</font><br>" +
                            "ako ti bol milý jej obetavý život.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, <br>" +
                            "posilnení sviatostným pokrmom <br>" +
                            "vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby sme podľa príkladu svätej <font color='#B71C1C'>M.</font> nosili <br>" +
                            "v našom smrteľnom tele Ježišovo utrpenie <font color='#B71C1C'>—</font><br>" +
                            "a celou silou sa vinuli iba k tebe.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"51", "2", "Omša o pannách 2.", "Pane a Bože náš, <br>" +
                    "svätú pannu <font color='#B71C1C'>M.</font> si zahrnul nebeskými darmi; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme si <br>" +
                    "v tomto živote osvojovali jej čnosti <font color='#B71C1C'>—</font><br>" +
                    "a v spoločenstve s ňou <br>" +
                    "tešili sa z večnej slávy v nebi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo (o panne, zakladateľke):</font><br>" +
                    "Pane a Bože náš, <br>" +
                    "nech príklad tvojej vernej nevesty, <br>" +
                    "svätej panny <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                    "roznieti v nás takú vrúcnu lásku k tebe, <font color='#B71C1C'>—</font><br>" +
                    "akú ona vštepovala do sŕdc iných panien <br>" +
                    "na večnú slávu tvojej Cirkvi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "daj, nech v sebe pocítime <br>" +
                            "účinky tejto obety, ktorú ti predkladáme, <font color='#B71C1C'>*</font><br>" +
                            "aby nás na príhovor svätej <font color='#B71C1C'>M.</font> <br>" +
                            "očistila od hriechu <font color='#B71C1C'>—</font><br>" +
                            "a priviedla k večnému životu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech nás prijatie Tela a Krvi <br>" +
                            "tvojho jednorodeného Syna vedie <br>" +
                            "k správnemu používaniu pominuteľných vecí, <font color='#B71C1C'>*</font><br>" +
                            "aby sme ti podľa príkladu svätej <font color='#B71C1C'>M.</font> <br>" +
                            "slúžili s oddanou láskou <font color='#B71C1C'>—</font><br>" +
                            "a v nebi sa tešili z večného pohľadu na teba.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"51", "3", "Omša o pannách 3.", "Bože, ty nás uisťuješ, že prebývaš v tých, <br>" +
                    "čo majú spravodlivé a úprimné srdce; <font color='#B71C1C'>*</font><br>" +
                    "na orodovanie svätej panny <font color='#B71C1C'>M.</font> <br>" +
                    "pomáhaj nám svojou milosťou tak žiť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli tvojím dôstojným príbytkom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Prosíme ťa, Pane, <br>" +
                    "vypočuj naše prosby, ktoré ti prednášame <br>" +
                    "pri oslave čnosti svätej panny <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby sme vytrvali v tvojej láske <font color='#B71C1C'>—</font><br>" +
                    "a rástli v nej až do konca nášho života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi obetné dary, <br>" +
                            "ktoré ti pokorne prinášame <br>" +
                            "v deň spomienky na svätú pannu <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby sme účinkom <br>" +
                            "tejto nepoškvrnenej obety <font color='#B71C1C'>—</font><br>" +
                            "ustavične horeli oddanou a svätou láskou k tebe.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, v deň radostnej oslavy svätej panny <font color='#B71C1C'>M.</font> <br>" +
                            "posilnil si nás nebeským chlebom; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, odpusť nám hriechy <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme pri dobrom zdraví <br>" +
                            "rástli v tvojej milosti a dosiahli večnú spásu.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o viacerych pannach
            {"52", "1", "Omša o viacerých pannách", "Pane, pri radostnej oslave <br>" +
                    "svätých panien <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "preukáž nám svoje milosrdenstvo <font color='#B71C1C'>—</font><br>" +
                    "a pomáhaj nám, aby sme sa spolu s nimi <br>" +
                    "mohli tešiť v tvojom večnom kráľovstve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, pri oslave svätých panien <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <br>" +
                            "ktorou velebíme teba, <br>" +
                            "prinášame obetné dary a pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby ti naša obeta bola taká milá, <font color='#B71C1C'>—</font><br>" +
                            "ako ti bol milý ich obetavý život.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, nech je nám sviatosť, <br>" +
                            "ktorú sme prijali v deň oslavy <br>" +
                            "svätých panien <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <br>" +
                            "stálym prameňom sily a svetla, <font color='#B71C1C'>*</font><br>" +
                            "aby sme bedlivo očakávali <br>" +
                            "príchod tvojho Syna <font color='#B71C1C'>—</font><br>" +
                            "a dostali sa na svadobnú hostinu <br>" +
                            "v jeho kráľovstve.<br>" +
                            "Skrze Krista, nášho Pána."},
            // SPOLOCNE OMSE SVATYCH MUZOV a SVATYCH ZIEN
            {"61", "1", "Omša o svätých mužoch a svätých ženách 1.", "Všemohúci a večný Bože, <br>" +
                    "oslávením svojich svätých <br>" +
                    "nám dávaš stále nové dôkazy svojej lásky; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme na ich orodovanie <br>" +
                    "a podľa ich príkladu verne nasledovali <br>" +
                    "tvojho jednorodeného Syna Ježiša Krista.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, láskavo vypočuj naše prosby <font color='#B71C1C'>*</font><br>" +
                            "a ochraňuj nás na orodovanie svojich svätých, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ti pri oltári vzdávali dôstojnú úctu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci a večný Bože, <br>" +
                            "Otec všetkej útechy a pokoja, <br>" +
                            "dopraj svojmu ľudu, <font color='#B71C1C'>*</font><br>" +
                            "ktorý sa na sviatok svätého <font color='#B71C1C'>M.</font> <br>" +
                            "zišiel chváliť tvoje meno, <font color='#B71C1C'>—</font><br>" +
                            "aby prijatá sviatosť tvojho jednorodeného Syna <br>" +
                            "bola pre všetkých zálohom večnej spásy.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"61", "2", "Omša o svätých mužoch a svätých ženách 2.", "Bože, ty vieš, že sme krehkí a ľahko klesáme; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, zľutuj sa nad nami <font color='#B71C1C'>—</font><br>" +
                            "a príkladom svojich svätých <br>" +
                            "posilni v nás lásku k tebe.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.",
                            "Všemohúci Bože, <br>" +
                                    "nech ti je milá obeta, <br>" +
                                    "ktorú s pokorou prinášame <br>" +
                                    "k úcte tvojich svätých, <font color='#B71C1C'>*</font><br>" +
                                    "aby nás očistila <font color='#B71C1C'>—</font><br>" +
                                    "a posvätila na tele i na duši.<br>" +
                                    "Skrze Krista, nášho Pána.",
                            "Pane, pri oslave blaženej smrti tvojich svätých <br>" +
                                    "posilnil si nás sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                                    "daj, aby sme raz požívali večné dobrá, <font color='#B71C1C'>—</font><br>" +
                                    "na ktorých nám už dávaš účasť touto sviatosťou.<br>" +
                                    "Skrze Krista, nášho Pána."},
                    {"61", "3", "Omša o svätých mužoch a svätých ženách 3.", "Pane, nech nám svätí <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <br>" +
                            "ktorých sviatok nábožne slávime, <br>" +
                            "vyprosia tvoju pomoc, <font color='#B71C1C'>*</font><br>" +
                            "aby sme s nimi mali účasť na večnej sláve.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.",
                            "Pane, prinášame dary na tvoj oltár <br>" +
                                    "a prosíme ťa, daj nám vrúcnu oddanosť tebe, <font color='#B71C1C'>*</font><br>" +
                                    "akou si obdaril svätých <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                                    "aby sme s čistou mysľou a s horlivým srdcom <br>" +
                                    "slávili tebe milú a nám prospešnú obetu.<br>" +
                                    "Skrze Krista, nášho Pána.",
                            "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                                    "nech nám slúži na spásu sviatosť, <br>" +

                                    "ktorú sme prijali, <font color='#B71C1C'>—</font><br>" +
                                    "a nech nás posilňuje svetlom tvojej pravdy.<br>" +
                                    "Skrze Krista, nášho Pána."},
            {"61", "4", "Omša o svätých mužoch a svätých ženách 4.", "Všemohúci Bože, príkladmi svojich svätých <br>" +
                    "nás povzbudzuješ k lepšiemu životu; <font color='#B71C1C'>*</font><br>" +
                    "preto ťa prosíme, pomáhaj nám <br>" +
                    "napodobňovať skutky svätých <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                    "ktorých pamiatku dnes slávime.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, v deň oslavy tvojich svätých <br>" +
                            "kladieme na oltár obetné dary <br>" +
                            "a vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby táto obeta prispela k tvojej väčšej sláve <font color='#B71C1C'>—</font><br>" +
                            "a nám získala hojnú milosť.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby nám vznešené tajomstvá, <br>" +
                            "ktoré sme slávili v deň pamiatky tvojich svätých, <font color='#B71C1C'>—</font><br>" +
                            "priniesli spásu a večný pokoj.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"60", "1", "Omša o svätých mužoch a svätých ženách 5.", "Bože, vo svojich svätých <br>" +
                    "dávaš nám slabým vzor a ochranu, <br>" +
                    "aby si nám uľahčil cestu k spáse; <font color='#B71C1C'>*</font><br>" +
                    "pri oslave nebeských narodenín svätého <font color='#B71C1C'>M.</font> <br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám kráčať k tebe podľa jeho príkladu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prinášame ti obetné dary <br>" +
                            "pri spomienke na svätého <font color='#B71C1C'>M.</font> <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                            "aby si nám pre zásluhy tejto obety <br>" +
                            "udelil dar jednoty a pokoja.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, sviatosť, ktorú sme prijali <br>" +
                            "v deň oslavy svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                            "nech posvätí naše mysle a srdcia, <font color='#B71C1C'>—</font><br>" +
                            "aby sme raz dosiahli plnú účasť <br>" +
                            "na tvojom božskom živote.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"60", "2", "Omša o svätých mužoch a svätých ženách 6.", "Bože, ty jediný si svätý <br>" +
                    "a bez tvojej pomoci nikto nemôže byť dobrý; <font color='#B71C1C'>*</font><br>" +
                    "dopraj nám na príhovor svätého <font color='#B71C1C'>M.</font> tak žiť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli vojsť do slávy, <br>" +
                    "ktorú si nám pripravil.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, na sviatok svätého <font color='#B71C1C'>M.</font> ti prinášame dary <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, aby nás <br>" +
                            "táto svätá obeta zmierila s tebou <font color='#B71C1C'>—</font><br>" +
                            "a pomohla nám dosiahnuť spásu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, daj, aby nám obeta, <br>" +
                            "ktorú sme slávili na sviatok svätého <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                            "stále pomáhala na ceste k spáse.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o reholnikoch
            //opat
            {"62", "1", "Omša o rehoľníkoch 1.", "Pane, vo svätom opátovi <font color='#B71C1C'>M.</font> dal si nám <br>" +
                    "vzor dokonalého života podľa evanjelia; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme uprostred pominuteľných vecí <br>" +
                    "celým srdcom túžili po nebeských dobrách.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, pristupujeme k tvojmu oltáru <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, daj nám ducha nábožnosti, <br>" +
                            "ktorým horel svätý opát <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ti v čistote srdca a zápale lásky <br>" +
                            "mohli prinášať dôstojnú obetu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech prijatá sviatosť obnoví naše srdcia, <font color='#B71C1C'>*</font><br>" +
                            "aby sme podľa príkladu svätého opáta <font color='#B71C1C'>M.</font> <br>" +
                            "poznávali nielen veci pozemské, ale i nebeské, <font color='#B71C1C'>—</font><br>" +
                            "a tak dosiahli večnú slávu s Kristom.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            //mnich
            {"66", "1", "Omša o rehoľníkoch 2.", "Bože, ty si svojho služobníka, svätého <font color='#B71C1C'>M.</font>, <br>" +
                    "milostivo povolal nasledovať Krista; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jeho príhovor dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pomocou sebazapierania <br>" +
                    "priľnuli k tebe celým srdcom.<br>" +
                    "Skrze Krista, nášho Pána. ",
                    "Prosíme ťa, Pane, prijmi obetné dary, <br>" +
                            "ktoré ti prinášame na spásu tvojho ľudu, <font color='#B71C1C'>*</font><br>" +
                            "a na príhovor svätého <font color='#B71C1C'>M.</font> dopraj, <br>" +
                            "aby nám táto obeta pomohla premáhať pokušenia <font color='#B71C1C'>—</font><br>" +
                            "a dôjsť do nebeského kráľovstva.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane a Bože náš, pokorne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "dopraj, aby sme pod mocnou ochranou <br>" +
                            "svätého <font color='#B71C1C'>M.</font> čerpali silu <br>" +
                            "z tejto najsvätejšej sviatosti <font color='#B71C1C'>—</font><br>" +
                            "a žili vždy v pokoji.<br>" +
                            "Skrze Krista, nášho Pána."},
            //mniska
            {"67", "1", "Omša o rehoľníkoch 3.", "Bože, ty si svoju služobnicu, svätú <font color='#B71C1C'>M.</font>, <br>" +
                    "povolal, aby vo všetkom <br>" +
                    "hľadala predovšetkým teba; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme ti na jej príhovor <br>" +
                    "a podľa jej príkladu slúžili <br>" +
                    "s čistým a pokorným srdcom, <font color='#B71C1C'>—</font><br>" +
                    "a tak raz prišli do tvojej večnej slávy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov. ",
                    "Pane, pri spomienke na svätú <font color='#B71C1C'>M.</font> <br>" +
                            "ti prinášame obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, buď nám <br>" +
                            "stále útechou v tomto živote, <font color='#B71C1C'>—</font><br>" +
                            "aby sme nestrácali nádej <br>" +
                            "na prisľúbenú večnosť.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, posilnil si nás spásonosnou sviatosťou; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <br>" +
                            "na príhovor svätej <font color='#B71C1C'>M.</font> nám pomáhaj <br>" +
                            "stále viac sa primknúť ku Kristovi, <font color='#B71C1C'>—</font><br>" +
                            "aby sme dosiahli účasť na kráľovstve jeho milosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            //reholnik
            {"68", "1", "Omša o rehoľníkoch 4.", "Bože, s tvojou pomocou svätý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>)</font> <font color='#B71C1C'>M.</font> <br>" +
                    "vytrvalo nasledoval<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> Ježiša Krista <br>" +
                    "v chudobe a poníženosti; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám na jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> orodovanie <br>" +
                    "verne kráčať vo svojom povolaní, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dospeli k dokonalosti, <br>" +
                    "ktorej vzor si nám ukázal vo svojom Synovi.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Láskavý Bože, ty si vo svätom <font color='#B71C1C'>M. (</font>svätej <font color='#B71C1C'>M.)</font> <br>" +
                            "pretvoril starého človeka <br>" +
                            "na človeka nového podľa svojho srdca; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pretvor aj nás na nových ľudí, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ti mohli dôstojne priniesť <br>" +
                            "túto obetu zmierenia.<br>" +
                            "Skrze Krista, nášho Pána",
                    "Prosíme ťa, Pane, pôsobením tejto sviatosti <br>" +
                            "veď nás cestou svojej lásky, <br>" +
                            "ako si viedol svätého <font color='#B71C1C'>M. (</font>svätú <font color='#B71C1C'>M.)</font>, <font color='#B71C1C'>*</font><br>" +
                            "a dobré dielo, ktoré si v nás začal, <font color='#B71C1C'>—</font><br>" +
                            "priveď k zavŕšeniu v deň príchodu Ježiša Krista.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"68", "2", "Omša o rehoľníkoch 5.", "Bože, ty si svätého <font color='#B71C1C'>M. (</font>svätú <font color='#B71C1C'>M.)</font> povolal, <br>" +
                    "aby úsilím o dokonalú lásku <br>" +
                    "už na tomto svete hľadal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> tvoje kráľovstvo; <font color='#B71C1C'>*</font><br>" +
                    "na jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> príhovor nás posilňuj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s duchovnou radosťou <br>" +
                    "napredovali na ceste lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech sú ti milé dary, <br>" +
                            "ktoré pri spomienke na svätého <font color='#B71C1C'>M. (</font>svätú <font color='#B71C1C'>M.)</font> <br>" +
                            "s oddanosťou kladieme na tvoj oltár; <font color='#B71C1C'>*</font><br>" +
                            "pomáhaj nám, aby sme sa odpútali <br>" +
                            "od pozemských vecí <font color='#B71C1C'>—</font><br>" +
                            "a nachádzali bohatstvo len v tebe.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, touto sviatosťou <br>" +
                            "nám poskytuješ pomoc a silu; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pomáhaj nám, <br>" +
                            "aby sme podľa príkladu svätého <font color='#B71C1C'>M. (</font>svätej <font color='#B71C1C'>M.)</font> <br>" +
                            "hľadali predovšetkým teba <font color='#B71C1C'>—</font><br>" +
                            "a v tomto svete žili ako noví ľudia.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o tych, co konali skutky milosrdensta
            {"63", "1", "Omša o tých, čo konali skutky milosrdenstva", "Bože, ty si svoju Cirkev poučil, <br>" +
                    "že všetky tvoje prikázania <br>" +
                    "sú zahrnuté v láske k tebe a k blížnemu; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme podľa príkladu svätého <font color='#B71C1C'>M. (</font>svätej <font color='#B71C1C'>M.)</font> <br>" +
                    "konali skutky milosrdenstva <font color='#B71C1C'>—</font><br>" +
                    "a boli raz pripočítaní <br>" +
                    "k požehnaným v tvojom kráľovstve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "prijmi naše dary, keď slávime <br>" +
                            "nevýslovné dielo lásky tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme podľa príkladu <br>" +
                            "svätého <font color='#B71C1C'>M. (</font>svätej <font color='#B71C1C'>M.)</font> napredovali <br>" +
                            "v láske k tebe a k blížnemu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, posilnil si nás sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "vrúcne ťa prosíme, pomáhaj nám nasledovať <br>" +
                            "príklad svätého <font color='#B71C1C'>M. (</font>svätej <font color='#B71C1C'>M.)</font>, <br>" +
                            "ktorý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>)</font> ti slúžil<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> s neúnavnou oddanosťou <font color='#B71C1C'>—</font><br>" +
                            "a tvojmu ľudu sa venoval<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> s veľkou láskou.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font><br>" +
                            "Pane, spásonosnou sviatosťou, ktorú sme prijali, <br>" +
                            "nám dávaš duchovnú radosť; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, daj, aby sme nasledovali <br>" +
                            "svätého <font color='#B71C1C'>M. (</font>svätú <font color='#B71C1C'>M.)</font> v láske <font color='#B71C1C'>—</font><br>" +
                            "a spolu s ním <font color='#B71C1C'>(</font>s ňou<font color='#B71C1C'>)</font> si zaslúžili účasť na večnej sláve.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o vychovavateloch
            {"64", "1", "Omša o vychovávateľoch", "Bože, ty si vzbudil vo svojej Cirkvi <br>" +
                    "svätého <font color='#B71C1C'>M.</font> (svätú <font color='#B71C1C'>M.</font>), aby svojim blížnym <br>" +
                            "ukazoval<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> cestu spásy; <font color='#B71C1C'>*</font><br>" +
                            "pomáhaj nám podľa jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> príkladu <br>" +
                            "verne nasledovať Krista, nášho Učiteľa, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli so svojimi bratmi a sestrami <br>" +
                            "dôjsť k tebe do večnej radosti.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.",
                    "Pane, dobrotivo prijmi obetné dary svojho ľudu <br>" +
                            "v deň oslavy svätého <font color='#B71C1C'>M. (</font>svätej <font color='#B71C1C'>M.)</font>; <font color='#B71C1C'>*</font><br>" +
                            "nech nás táto vznešená obeta posilňuje, <font color='#B71C1C'>—</font><br>" +
                            "aby sme dobrými skutkami <br>" +
                            "vydávali pred svetom svedectvo o tvojej láske.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "nech nám sväté prijímanie dodáva silu, <font color='#B71C1C'>*</font><br>" +
                            "aby sme si podľa príkladu svätého <font color='#B71C1C'>M. (</font>svätej <font color='#B71C1C'>M.)</font> <br>" +
                            "zachovali v srdci svetlo tvojej pravdy a bratskú lásku <font color='#B71C1C'>—</font><br>" +
                            "a prejavovali ju aj skutkami.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o svatych zenach
            {"65", "1", "Omša o svätých ženách 1.", "Bože, pri výročnej oslave svätej <font color='#B71C1C'>M.</font> <br>" +
                    "nás napĺňaš duchovnou radosťou; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám aj nasledovať <br>" +
                    "príklad jej svätého života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo (o viacerých ženách):</font><br>" +
                    "Všemohúci Bože, <br>" +
                    "vo svätých <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font> <br>" +
                    "si nám dal spasiteľný príklad; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám ich mocný príhovor zaistil tvoju pomoc.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, v deň oslavy svätej <font color='#B71C1C'>M.</font> <br>" +
                            "prinášame dary na tvoj oltár <font color='#B71C1C'>*</font><br>" +
                            "a pokorne prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby nám táto presvätá obeta <br>" +
                            "získala odpustenie a priniesla spásu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "osvecuj a oduševňuj nás vznešenou sviatosťou, <br>" +
                            "ktorú sme prijali v deň oslavy svätej <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                            "aby sme stále horeli túžbou po svätých veciach <font color='#B71C1C'>—</font><br>" +
                            "a ochotne konali dobré skutky.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"65", "2", "Omša o svätých ženách 2.", "Bože, sláva ponížených, ty si obdaril <br>" +
                    "svätú <font color='#B71C1C'>M.</font> vynikajúcou trpezlivosťou a láskou; <font color='#B71C1C'>*</font><br>" +
                    "pre jej zásluhy a na jej orodovanie nám daj silu, <br>" +
                    "aby sme vytrvalo niesli svoj kríž <font color='#B71C1C'>—</font><br>" +
                    "a milovali ťa celým srdcom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Pane, naplň nás duchom múdrosti a lásky, <br>" +
                    "ktorým si obdaril svoju služobnicu <font color='#B71C1C'>M.</font>; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám verne ti slúžiť <br>" +
                    "podľa jej príkladu, <font color='#B71C1C'>—</font><br>" +
                    "aby sa ti páčila naša viera i naše skutky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, zhliadni na dary svojho ľudu, <br>" +
                            "ktoré ti predkladáme v deň spomienky na svätú <font color='#B71C1C'>M.</font>, <font color='#B71C1C'>*</font><br>" +
                            "a dopraj, aby nám sila obety, ktorú slávime, <font color='#B71C1C'>—</font><br>" +
                            "pomáhala na ceste spásy. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, pri oslave svätej <font color='#B71C1C'>M.</font> <br>" +
                            "zahrnul si nás svojimi darmi; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, nech sviatostná milosť zotrie naše viny <font color='#B71C1C'>—</font><br>" +
                            "a posilní nás na životnej ceste.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"71", "1", "Za odpustenie hriechov 1.", "Pane, uznávame, že sme zhrešili; <font color='#B71C1C'>*</font><br>" +
                    "preto ťa prosíme,<br>" +
                    "zhliadni na našu pokoru<br>" +
                    "a zľutuj sa nad nami, <font color='#B71C1C'>—</font><br>" +
                    "odpusť nám viny<br>" +
                    "a obdaruj nás svojím pokojom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Pane, buď milostivý svojmu ľudu, <font color='#B71C1C'>*</font><br>" +
                    "osloboď nás od všetkých hriechov <font color='#B71C1C'>—</font><br>" +
                    "a odpusť nám tresty,<br>" +
                    "ktoré si zasluhujeme za svoje previnenia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, predkladáme ti obetu<br>" +
                            "zmierenia a chvály, <font color='#B71C1C'>*</font><br>" +
                            "aby si nám láskavo odpustil viny <font color='#B71C1C'>—</font><br>" +
                            "a usmerňoval k sebe naše nestále srdcia.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Milosrdný Bože,<br>" +
                            "pre túto sviatostnú obetu nám odpúšťaš viny; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pomáhaj nám svojou milosťou<br>" +
                            "chrániť sa ďalších hriechov, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ti slúžili s úprimným srdcom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"71", "2", "Za odpustenie hriechov 2.", "Všemohúci a dobrotivý Bože,<br>" +
                    "ty si napojil svoj ľud<br>" +
                    "prameňom živej vody zo skaly; <font color='#B71C1C'>*</font><br>" +
                    "priveď naše zatvrdnuté srdcia k slzám,<br>" +
                    "aby sme mohli oľutovať svoje hriechy <font color='#B71C1C'>—</font><br>" +
                    "a pre tvoje milosrdenstvo<br>" +
                    "si zaslúžili ich odpustenie.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, láskavo zhliadni na dary,<br>" +
                            "ktoré ti prinášame za naše hriechy, <font color='#B71C1C'>*</font><br>" +
                            "a pre obetu, ktorá je prameňom odpustenia, <font color='#B71C1C'>—</font><br>" +
                            "daj, nech nás milosť Ducha Svätého<br>" +
                            "pohne k slzám nad našimi hriechmi.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech nás nábožné prijatie<br>" +
                            "tejto sviatosti privedie k slzám,<br>" +
                            "ktoré zmyjú naše hriechy, <font color='#B71C1C'>*</font><br>" +
                            "a vo svojej milosti dopraj, <font color='#B71C1C'>—</font><br>" +
                            "aby sme dosiahli odpustenie, o ktoré prosíme.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"71", "3", "Za dar lásky", "Pane, zapáľ naše srdcia Duchom svojej lásky, <font color='#B71C1C'>*</font><br>" +
                    "aby sme vždy zmýšľali a konali,<br>" +
                    "ako sa tebe páči, <font color='#B71C1C'>—</font><br>" +
                    "a úprimne ťa milovali v našich bratoch a sestrách.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane,<br>" +
                            "milostivo posväť tieto obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a prijmi duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                            "ktorú konáme, aby sme tvojou láskou<br>" +
                            "milovali všetkých ľudí.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás<br>" +
                            "tým istým nebeským chlebom; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, naplň nás<br>" +
                            "milosťou Ducha Svätého <font color='#B71C1C'>—</font><br>" +
                            "a čistou radosťou prameniacou<br>" +
                            "z dokonalej lásky.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"72a", "1", "Za jednotu kresťanov 1.", "Všemohúci a večný Bože,<br>" +
                    "ty zjednocuješ rozdelených<br>" +
                    "a zjednotených zachovávaš vo svornosti; <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na všetkých,<br>" +
                    "ktorí veria v tvojho Syna,<br>" +
                    "a keďže ich posvätil ten istý krst, <font color='#B71C1C'>—</font><br>" +
                    "nech ich spája aj pravá viera<br>" +
                    "a vzájomná láska.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Prosíme ťa, Pane, milujúci Otec všetkých ľudí,<br>" +
                    "vylej na nás hojnú milosť svojho Ducha<br>" +
                    "a pomôž nám dôsledne žiť podľa kresťanskej viery,<br>" +
                    "ku ktorej si nás povolal, <font color='#B71C1C'>*</font><br>" +
                    "aby sme pred ľuďmi vyznávali tvoju pravdu <font color='#B71C1C'>—</font><br>" +
                    "a vytrvalo sa usilovali o jednotu<br>" +
                    "všetkých veriacich vo zväzku pokoja.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, jedinou obetou<br>" +
                            "si z nás urobil raz navždy svoj ľud; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "udeľ nám v tvojej Cirkvi dar jednoty a pokoja.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, toto sväté prijímanie naznačuje,<br>" +
                            "že veriaci sú zjednotení v tebe; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby táto sviatosť v tvojej Cirkvi<br>" +
                            "vytvárala účinnú jednotu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"72a", "2", "Za jednotu kresťanov 2.", "Bože, ty si zjednotil rozmanité národy<br>" +
                    "vo vyznávaní tvojho mena; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám ochotne plniť tvoju vôľu, <font color='#B71C1C'>—</font><br>" +
                    "aby ľud, ktorý si povolal do svojho kráľovstva,<br>" +
                    "bol jednotný vo viere a v činorodej láske.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Prosíme ťa, Pane,<br>" +
                    "milostivo zhliadni na prosby svojho ľudu<br>" +
                    "a spoj srdcia všetkých veriacich<br>" +
                    "v spoločnom pokání<br>" +
                    "a v spoločnej oslave tvojho mena, <font color='#B71C1C'>*</font><br>" +
                    "aby prestalo rozdelenie kresťanov <font color='#B71C1C'>—</font><br>" +
                    "a aby sme mohli v dokonalom spoločenstve Cirkvi<br>" +
                    "ísť v ústrety tvojmu večnému kráľovstvu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, slávime pamiatku nášho vykúpenia<br>" +
                            "a vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby táto sviatosť tvojej lásky<br>" +
                            "bola pre nás účinným znakom jednoty <font color='#B71C1C'>—</font><br>" +
                            "a putom bratskej lásky.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "naplň nás Duchom svojej lásky <font color='#B71C1C'>—</font><br>" +
                            "a silou tejto sviatosti zjednoť v láske<br>" +
                            "srdcia i mysle všetkých, čo veria v teba.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"72a", "3", "Za jednotu kresťanov 3.", "Prosíme ťa, Pane, <br>" +
                    "milostivo zhliadni na svoj ľud<br>" +
                    "a zahrň ho darmi svojho Ducha, <font color='#B71C1C'>*</font><br>" +
                    "aby sme rástli v láske k pravde,<br>" +
                    "úprimne túžili po dokonalej jednote kresťanov <font color='#B71C1C'>—</font><br>" +
                    "a účinne ju rozvíjali.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Pane, preukáž nám<br>" +
                    "svoje hojné milosrdenstvo a mocou<br>" +
                    "svojho Ducha odstráň rozdelenie kresťanov, <font color='#B71C1C'>*</font><br>" +
                    "aby tvoja Cirkev jasnejšie žiarila ako viditeľný<br>" +
                    "znak tvojej prítomnosti medzi národmi <font color='#B71C1C'>—</font><br>" +
                    "a privádzala svet, osvietený Duchom Svätým,<br>" +
                    "k viere v Krista, ktorého si poslal.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, pôsobením tejto svätej obety<br>" +
                            "očisti nás od hriechov <font color='#B71C1C'>*</font><br>" +
                            "a zjednoť všetkých, ktorých spája jeden krst, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli spoločne sláviť Eucharistiu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme<br>" +
                            "sviatosť Kristovho Tela a Krvi <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, obnov vo svojej Cirkvi dar svätosti, <font color='#B71C1C'>—</font><br>" +
                            "aby ti všetci, čo majú česť volať sa kresťanmi,<br>" +
                            "slúžili zjednotení vo viere.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"72b", "4", "Za povolanie na kňazský stav", "Bože, ty posielaš svojmu ľudu duchovných pastierov; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daruj svojej Cirkvi<br>" +
                    "Ducha nábožnosti a sily, <font color='#B71C1C'>—</font><br>" +
                    "aby vzbudzoval hodných služobníkov<br>" +
                    "tvojho oltára a utváral z nich<br>" +
                    "odvážnych a pokorných<br>" +
                    "hlásateľov tvojho evanjelia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane,<br>" +
                            "zhliadni na modlitby a dary svojho ľudu, <font color='#B71C1C'>*</font><br>" +
                            "rozmnož počet tých, čo vysluhujú tvoje tajomstvá, <font color='#B71C1C'>—</font><br>" +
                            "a zachovaj ich vo vernosti a v láske k tebe.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, pri sviatostnom stole<br>" +
                            "posilnil si nás nebeským chlebom; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, nech účinkom tejto sviatosti lásky<br>" +
                            "dozrievajú povolania,<br>" +
                            "ktoré štedro rozsievaš na roli svojej Cirkvi, <font color='#B71C1C'>—</font><br>" +
                            "aby si mnohí vyvolili za svoje životné povolanie<br>" +
                            "slúžiť tebe vo svojich bratoch.<br>" +
                            "Skrze Krista, nášho Pána."},
                    {"72b", "5", "Za rehoľné povolania", "Svätý Otče, ty všetkých veriacich<br>" +
                            "pozývaš k dokonalej láske<br>" +
                            "a mnohých povolávaš nasledovať<br>" +
                            "tvojho Syna osobitným spôsobom; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, milostivo pomáhaj všetkým,<br>" +
                            "ktorých si vyvolil pre rehoľný život, <font color='#B71C1C'>—</font><br>" +
                            "aby boli Cirkvi a svetu presvedčivým<br>" +
                            "znamením tvojho kráľovstva.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.<br>" +
                            "<font color='#B71C1C'>Alebo (ak modlitbu prednáša rehoľný kňaz):</font><br>" +
                            "Pane, milostivo zhliadni<br>" +
                            "na našu rehoľnú rodinu<br>" +
                            "a zveľaďuj ju novým dorastom; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby všetci členovia nášho spoločenstva<br>" +
                            "nažívali v dokonalej láske <font color='#B71C1C'>—</font><br>" +
                            "a úspešne pracovali na spáse ľudí.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.",
                            "Svätý Otče,<br>" +
                                    "milostivo prijmi dary, ktoré ti predkladáme,<br>" +
                                    "a vypočuj naše prosby za tých,<br>" +
                                    "čo chcú s radosťou nasledovať<br>" +
                                    "tvojho Syna po úzkej ceste rehoľného života; <font color='#B71C1C'>*</font><br>" +
                                    "daj, aby v rehoľnom spoločenstve<br>" +
                                    "našli úprimnú bratskú lásku <font color='#B71C1C'>—</font><br>" +
                                    "a opravdivú slobodu ducha.<br>" +
                                    "Skrze Krista, nášho Pána.",
                            "Pane, posilnil si nás<br>" +
                                    "duchovným pokrmom a nápojom; <font color='#B71C1C'>*</font><br>" +
                                    "prosíme ťa za všetkých rehoľníkov,<br>" +
                                    "aby verne žili podľa evanjeliovej dokonalosti, <font color='#B71C1C'>—</font><br>" +
                                    "a tak boli všade živým obrazom<br>" +
                                    "tvojho Syna, Ježiša Krista.<br>" +
                                    "Lebo on žije a kraľuje na veky vekov.<br>" +
                                    "<font color='#B71C1C'>Alebo (ak modlitbu prednáša rehoľný kňaz):</font><br>" +
                                    "Pane, touto vznešenou sviatosťou<br>" +
                                    "daruj nám silu verne a oddane ti slúžiť, <font color='#B71C1C'>*</font><br>" +
                                    "aby sme pred svetom svedčili o tvojej láske <font color='#B71C1C'>—</font><br>" +
                                    "a vyhľadávali predovšetkým večné hodnoty.<br>" +
                                    "Skrze Krista, nášho Pána."},
            {"73", "1", "Na poďakovanie Pánu Bohu 1.", "Bože, ty sa zľutúvaš<br>" +
                    "nad svojimi služobníkmi, keď sú v tiesni,<br>" +
                    "a vždy vypočuješ ich prosby; <font color='#B71C1C'>*</font><br>" +
                    "vzdávame ti vďaky za tvoje dobrodenia<br>" +
                    "a pokorne ťa prosíme,<br>" +
                    "chráň nás i naďalej od každého zla, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti stále slúžili s radostným srdcom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, ty si nám daroval svojho Syna, <font color='#B71C1C'>*</font><br>" +
                            "aby nás oslobodil<br>" +
                            "od večnej smrti a od každého zla; <font color='#B71C1C'>—</font><br>" +
                            "prijmi obetu, ktorú ti prinášame<br>" +
                            "na poďakovanie za tvoju pomoc<br>" +
                            "v našich súženiach.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, týmto chlebom života<br>" +
                            "nás vyslobodzuješ z pút hriechov<br>" +
                            "a obnovuješ v nás duchovnú silu; <font color='#B71C1C'>*</font><br>" +
                            "daj nám milosť, <font color='#B71C1C'>—</font><br>" +
                            "aby v nás stále rástla nádej na večnú slávu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"73", "2", "Na poďakovanie Pánu Bohu 2.", "Bože, pôvodca všetkých darov,<br>" +
                    "od teba pochádza všetko, čo máme a čím sme; <font color='#B71C1C'>*</font><br>" +
                    "osvieť našu myseľ,<br>" +
                    "aby sme v každom dare videli<br>" +
                    "tvoju otcovskú lásku, <font color='#B71C1C'>—</font><br>" +
                    "ďakovali ti z celého srdca<br>" +
                    "a milovali ťa zo všetkých síl.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prinášame ti<br>" +
                            "obetu chvály a vďaky za prijaté dobrodenia <font color='#B71C1C'>*</font><br>" +
                            "a pokorne prosíme, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                            "aby sme na slávu tvojho mena užívali všetko,<br>" +
                            "čo si nám udelil bez našich zásluh.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, sviatostným pokrmom dal si nám<br>" +
                            "účasť na spásonosnej obete tvojho Syna,<br>" +
                            "ktorú sme slávili na poďakovanie; <font color='#B71C1C'>*</font><br>" +
                            "daj nám dar sily a radosti,<br>" +
                            "aby sme ti slúžili s väčšou oddanosťou <font color='#B71C1C'>—</font><br>" +
                            "a dosiahli od teba ďalšie dobrodenia.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"73", "3", "Na poďakovanie za úrodu", "Pane, dobrotivý Otče,<br>" +
                    "vo svojej prozreteľnosti si zveril ľuďom<br>" +
                    "zem s celým jej bohatstvom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám užívať dary zeme<br>" +
                    "na chválu tvojho mena,<br>" +
                    "na udržanie nášho života <font color='#B71C1C'>—</font><br>" +
                    "a v prospech spoločného dobra.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Pane, ďakujeme ti za úrodu našich polí<br>" +
                    "a za tvoju starostlivosť o nás; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme,<br>" +
                    "daj, aby aj v našich srdciach dozrela tvoja milosť <font color='#B71C1C'>—</font><br>" +
                    "a prejavovala sa skutkami lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, posväť dary, ktoré ti s vďakou<br>" +
                            "prinášame z hojnej úrody zeme, <font color='#B71C1C'>*</font><br>" +
                            "a daj nám milosť, <font color='#B71C1C'>—</font><br>" +
                            "aby aj v našich srdciach dozrelo ovocie,<br>" +
                            "ktoré bude trvať naveky.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, slávením Eucharistie<br>" +
                            "ďakovali sme ti za tohtoročnú úrodu <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa: <font color='#B71C1C'>—</font><br>" +
                            "ako ovocie tejto svätej obety<br>" +
                            "daruj nám večné dobrá svojho kráľovstva.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"74", "1", "Za zachovanie pokoja a spravodlivosti 1.", "Bože, ty si zjavil, že šíritelia pokoja<br>" +
                    "sa budú volať tvojimi synmi; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme vždy a všade<br>" +
                    "uplatňovali spravodlivosť, <font color='#B71C1C'>—</font><br>" +
                    "ktorá jediná môže zaručiť trvalý a pravý pokoj.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, všetci ľudia pochádzajú od teba<br>" +
                    "a ty sa o nich otcovsky staráš; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby žili v pokoji ako jedna rodina<br>" +
                    "spojená úprimnou bratskou láskou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, pod sviatostnými znakmi chleba a vína,<br>" +
                            "ktoré naznačujú pokoj a jednotu,<br>" +
                            "slávime spasiteľnú obetu<br>" +
                            "tvojho Syna, Kráľa pokoja; <font color='#B71C1C'>*</font><br>" +
                            "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "nech táto obeta upevňuje<br>" +
                            "svornosť medzi všetkými tvojimi deťmi.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane,<br>" +
                            "naplň nás duchom svojej lásky, <font color='#B71C1C'>*</font><br>" +
                            "a keďže sme prijali Telo a Krv<br>" +
                            "tvojho jednorodeného Syna, <font color='#B71C1C'>—</font><br>" +
                            "daj, aby sme upevňovali medzi ľuďmi pokoj,<br>" +
                            "ktorý nám zanechal sám Kristus.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"74", "2", "Za zachovanie pokoja a spravodlivosti 2.", "Bože, Stvoriteľ sveta,<br>" +
                    "podľa tvojej vôle sa odvíjajú dejiny sveta; <font color='#B71C1C'>*</font><br>" +
                    "vypočuj naše prosby<br>" +
                    "a daruj našim časom trvalý pokoj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s radostným srdcom<br>" +
                    "mohli chváliť tvoje milosrdenstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože pokoja, ty sám si pokojom,<br>" +
                    "ktorý svárlivý duch nemôže pochopiť<br>" +
                    "a srdce plné nenávisti sa zatvára pred tebou; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby všetci, čo žijú svorne, vytrvali v dobrom <font color='#B71C1C'>—</font><br>" +
                    "a tí, čo žijú v nepriateľstve,<br>" +
                    "nech sa zmieria a zabudnú na neprávosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.", "", ""},
            {"74", "3", "Za rodinu", "Bože, v tebe má rodinné spoločenstvo<br>" +
                            "svoj pôvod a pevný základ; <font color='#B71C1C'>*</font><br>" +
                            "láskavo vypočuj naše prosby<br>" +
                            "a pomáhaj nám rásť vo vzájomnej láske<br>" +
                            "a v rodinných čnostiach<br>" +
                            "podľa príkladu Svätej rodiny, <font color='#B71C1C'>—</font><br>" +
                            "aby sme dosiahli večnú odmenu v nebeskom domove.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.",
                            "Pane, prinášame ti zmiernu obetu <font color='#B71C1C'>*</font><br>" +
                                    "a vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                                    "aby si upevňoval naše rodiny<br>" +
                                    "v tvojej milosti a v tvojom pokoji.<br>" +
                                    "Skrze Krista, nášho Pána.",
                            "Dobrotivý Otče,<br>" +
                                    "ty nás posilňuješ nebeskými sviatosťami; <font color='#B71C1C'>*</font><br>" +
                                    "pomáhaj nám vytrvalo nasledovať<br>" +
                                    "príklad Svätej rodiny, <font color='#B71C1C'>—</font><br>" +
                                    "aby sme po útrapách tohto života<br>" +
                                    "dosiahli večnú blaženosť v jej spoločenstve.<br>" +
                                    "Skrze Krista, nášho Pána."},
            {"75", "1", "V čase sejby 1.", "Bože, zverujeme zemi osivo,<br>" +
                    "ktoré vzrastie s tvojou pomocou, <font color='#B71C1C'>*</font><br>" +
                    "a keďže vieme, že naša práca sama nestačí,<br>" +
                    "doplň to, čo nie je v našich silách, <font color='#B71C1C'>—</font><br>" +
                    "veď ty jediný dávaš vzrast všetkému.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, opravdivý pôvodca zemských plodov<br>" +
                            "a darca duchovných darov, <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, požehnaj našu prácu<br>" +
                            "a daruj nám hojné plody zeme, <font color='#B71C1C'>—</font><br>" +
                            "aby všetky dary, ktoré majú v tebe pôvod,<br>" +
                            "slúžili na tvoju slávu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, ty nás posilňuješ pri sviatostnom stole; <font color='#B71C1C'>*</font><br>" +
                            "napomáhaj i prácu našich rúk<br>" +
                            "a požehnaj naše siatiny, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mali obživu z bohatej úrody,<br>" +
                            "veď v tebe žijeme, hýbeme sa a sme.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"75", "2", "V čase sejby 2.", "Pane a Bože náš, milostivo požehnaj svoj ľud<br>" +
                    "a obdaruj naše polia hojnou úrodou; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj, aby sme tvoje dary užívali<br>" +
                    "na česť tvojho mena <font color='#B71C1C'>—</font><br>" +
                    "a boli ti za ne vždy vďační.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prinášame ti chlieb<br>" +
                            "pripravený zo zŕn pšenice,<br>" +
                            "aby si ho premenil na Telo svojho Syna; <font color='#B71C1C'>*</font><br>" +
                            "vypočuj naše prosby a požehnaj zrno,<br>" +
                            "ktoré zverujeme zemi, <font color='#B71C1C'>—</font><br>" +
                            "aby vzklíčilo a prinieslo bohatú úrodu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože,<br>" +
                            "obdaruj nás bohatými plodmi zeme,<br>" +
                            "ktoré potrebujeme pre svoj život, <font color='#B71C1C'>*</font><br>" +
                            "a podporuj aj náš duchovný vzrast, <font color='#B71C1C'>—</font><br>" +
                            "aby sme dosiahli večné dobrá,<br>" +
                            "ktorých záloh sme prijali v Oltárnej sviatosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"76", "1", "Za jednotu kresťanov 1.","Všemohúci a večný Bože,<br>" +
                    "ty zjednocuješ rozdelených<br>" +
                    "a zjednotených zachovávaš vo svornosti; <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na všetkých,<br>" +
                    "ktorí veria v tvojho Syna,<br>" +
                    "a keďže ich posvätil ten istý krst, <font color='#B71C1C'>—</font><br>" +
                    "nech ich spája aj pravá viera<br>" +
                    "a vzájomná láska.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Prosíme ťa, Pane, milujúci Otec všetkých ľudí,<br>" +
                    "vylej na nás hojnú milosť svojho Ducha<br>" +
                    "a pomôž nám dôsledne žiť podľa kresťanskej viery,<br>" +
                    "ku ktorej si nás povolal, <font color='#B71C1C'>*</font><br>" +
                    "aby sme pred ľuďmi vyznávali tvoju pravdu <font color='#B71C1C'>—</font><br>" +
                    "a vytrvalo sa usilovali o jednotu<br>" +
                    "všetkých veriacich vo zväzku pokoja.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, jedinou obetou<br>" +
                            "si z nás urobil raz navždy svoj ľud; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "udeľ nám v tvojej Cirkvi dar jednoty a pokoja.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, toto sväté prijímanie naznačuje,<br>" +
                            "že veriaci sú zjednotení v tebe; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby táto sviatosť v tvojej Cirkvi<br>" +
                            "vytvárala účinnú jednotu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"76", "2", "Za jednotu kresťanov 2.","Bože, ty si zjednotil rozmanité národy<br>" +
                    "vo vyznávaní tvojho mena; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám ochotne plniť tvoju vôľu, <font color='#B71C1C'>—</font><br>" +
                    "aby ľud, ktorý si povolal do svojho kráľovstva,<br>" +
                    "bol jednotný vo viere a v činorodej láske.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Prosíme ťa, Pane,<br>" +
                    "milostivo zhliadni na prosby svojho ľudu<br>" +
                    "a spoj srdcia všetkých veriacich<br>" +
                    "v spoločnom pokání<br>" +
                    "a v spoločnej oslave tvojho mena, <font color='#B71C1C'>*</font><br>" +
                    "aby prestalo rozdelenie kresťanov <font color='#B71C1C'>—</font><br>" +
                    "a aby sme mohli v dokonalom spoločenstve Cirkvi<br>" +
                    "ísť v ústrety tvojmu večnému kráľovstvu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, slávime pamiatku nášho vykúpenia<br>" +
                            "a vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby táto sviatosť tvojej lásky<br>" +
                            "bola pre nás účinným znakom jednoty <font color='#B71C1C'>—</font><br>" +
                            "a putom bratskej lásky.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "naplň nás Duchom svojej lásky <font color='#B71C1C'>—</font><br>" +
                            "a silou tejto sviatosti zjednoť v láske<br>" +
                            "srdcia i mysle všetkých, čo veria v teba.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"76", "3", "Za jednotu kresťanov 3.", "Prosíme ťa, Pane, <br>" +
                    "milostivo zhliadni na svoj ľud<br>" +
                    "a zahrň ho darmi svojho Ducha, <font color='#B71C1C'>*</font><br>" +
                    "aby sme rástli v láske k pravde,<br>" +
                    "úprimne túžili po dokonalej jednote kresťanov <font color='#B71C1C'>—</font><br>" +
                    "a účinne ju rozvíjali.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Pane, preukáž nám<br>" +
                    "svoje hojné milosrdenstvo a mocou<br>" +
                    "svojho Ducha odstráň rozdelenie kresťanov, <font color='#B71C1C'>*</font><br>" +
                    "aby tvoja Cirkev jasnejšie žiarila ako viditeľný<br>" +
                    "znak tvojej prítomnosti medzi národmi <font color='#B71C1C'>—</font><br>" +
                    "a privádzala svet, osvietený Duchom Svätým,<br>" +
                    "k viere v Krista, ktorého si poslal.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, pôsobením tejto svätej obety<br>" +
                            "očisti nás od hriechov <font color='#B71C1C'>*</font><br>" +
                            "a zjednoť všetkých, ktorých spája jeden krst, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli spoločne sláviť Eucharistiu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme<br>" +
                            "sviatosť Kristovho Tela a Krvi <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, obnov vo svojej Cirkvi dar svätosti, <font color='#B71C1C'>—</font><br>" +
                            "aby ti všetci, čo majú česť volať sa kresťanmi,<br>" +
                            "slúžili zjednotení vo viere.<br>" +
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
            {"01", "1", "Zoslanie Ducha Svätého", "Bratia a sestry, Pánov Duch, ktorého sme očakávali a vzývali, zostupuje dnes na Cirkev, aby aj v našich časoch urobil veľké divy Turíc. Prosme Pána, aby uštedril Cirkvi i celému svetu dary svojho Ducha.",
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
            {"02", "1", "Najsvätejšieho Srdca Ježišovho", ""},
            {"03", "1", "Votívna omša o Najsvätejšom Srdci Ježišovom", ""},
            {"04", "1", "Výročie posviacky chrámu (slávenie mimo chrámu)", "Bratia a sestry, sme živými kameňmi chrámu, ktorým je Cirkev. V jednote a nádeji sa spoločne modlime. ",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, postavenú zo živých kameňov, aby sa zveľaďovala vo viere a v láske.<br>" +
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
            {"11", "3", "Omša k preblahoslavenej Panne Marií 3.", "Bratia a sestry, Panna Mária je veľkým vzorom nášho života v pokore, modlitbe a plnení Božej vôle. V tejto spoločnej modlitbe na jej orodovanie prosme nášho najmilostivejšieho Pána.",
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
            {"11", "4", "Omša k preblahoslavenej Panne Marií 4.", "Bratia a sestry, sme zhromaždení na slávení Eucharistie, kde je prítomný živý Kristus, ktorý nás miluje spolu so svojou Matkou. Ona nám ho pomáha bližšie spoznať ako Božieho Syna a nášho Pána. S radosťou sa modlime.",
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
            {"11", "5", "Omša k preblahoslavenej Panne Marií 5.", "Bratia a sestry, Panna Mária je veľkým vzorom nášho života v pokore, modlitbe a plnení Božej vôle. V tejto spoločnej modlitbe na jej orodovanie prosme nášho najmilostivejšieho Pána.",
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
            {"11", "6", "Omša k preblahoslavenej Panne Marií 6.", "Bratia a sestry, sme zhromaždení na slávení Eucharistie, kde je prítomný živý Kristus, ktorý nás miluje spolu so svojou Matkou. Ona nám ho pomáha bližšie spoznať ako Božieho Syna a nášho Pána. S radosťou sa modlime.",
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
            {"11", "7", "Omša k preblahoslavenej Panne Marií 7.", "Bratia a sestry, Panna Mária je veľkým vzorom nášho života v pokore, modlitbe a plnení Božej vôle. V tejto spoločnej modlitbe na jej orodovanie prosme nášho najmilostivejšieho Pána.",
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
            {"11", "8", "Omša k preblahoslavenej Panne Marií 8.", "Bratia a sestry, sme zhromaždení na slávení Eucharistie, kde je prítomný živý Kristus, ktorý nás miluje spolu so svojou Matkou. Ona nám ho pomáha bližšie spoznať ako Božieho Syna a nášho Pána. S radosťou sa modlime.",
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
            // 4 – iba v adventnom obdobi
            {"12", "1", "Omša k preblahoslavenej Panne Marií", ""},
            // 5 – iba v vianocnom obdobi
            {"13", "1", "Omša k preblahoslavenej Panne Marií", ""},
            // 6 – iba v velkonocnom obdobi
            {"14", "1", "Omša k preblahoslavenej Panne Marií", "Bratia a sestry, v nebi máme svoju Matku, ktorú vzývame ako kráľovnú a našu orodovníčku. S dôverou v jej príhovor sa pri spoločnej modlitbe obráťme na nebeského Otca. ",
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
            //marianske formulare
            {"15", "1", "Preblahoslavená Panna Mária vyvolený potomok Izraela", ""},
            {"15", "2", "Preblahoslavená Panna Mária pri Zvestovaní Pána", ""},
            {"15", "3", "Navštívenie Preblahoslavenej Panny Márie", ""},
            {"16", "1", "Nepoškvrneného Srdca Panny Márie", "Bratia a sestry, v nebi máme svoju Matku, ktorú vzývame ako kráľovnú a našu orodovníčku. S dôverou v jej príhovor sa pri spoločnej modlitbe obráťme na nebeského Otca. ",
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
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.)</font><br>" +
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
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.)</font><br>" +
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
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.)</font><br>" +
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
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.)</font><br>" +
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
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.)</font><br>" +
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
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.)</font><br>" +
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
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.)</font><br>" +
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
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.)</font><br>" +
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
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o mucenikoch misionaroch
            {"25", "1", "Omša za viacerých mučeníkov misionárov", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
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
            {"28", "1", "Omša za jedného mučeníka misionára", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
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
            // omsa o panne mucenici
            {"26", "1", "Omša o panne mučenici", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4. Na sviatok - panny mučenice:</font> Za všetky dievčatá a panny: aby na príhovor svätej mučenice <font color='#B71C1C'>M.</font> chránili svoje panenstvo a odolávali pokušeniam klamlivých a konzumných trendov dnešnej doby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.)</font><br>" +
                            "nás posilňuj pri obrane viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            // omsa o svatej zene mucenici
            {"27", "1", "Omša o svätej žene mučenici", "Bratia a sestry, mučeníci vydali obdivuhodné svedectvo života viery. S vďačnosťou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neváhali celý svoj život obetovať ohlasovaniu evanjelia a sláveniu svätých tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých predstaviteľov štátov: aby mali odvahu bojovať za dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých prenasledovaných: aby našli útechu v Božom slove, ktoré zjavuje život podľa Kristovho učenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4. Na sviatok - panny mučenice:</font> Za všetky dievčatá a panny: aby na príhovor svätej mučenice <font color='#B71C1C'>M.</font> chránili svoje panenstvo a odolávali pokušeniam klamlivých a konzumných trendov dnešnej doby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom svätých mučeníkov v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše prosby,<br>" +
                            "ktorými voláme k tebe,<br>" +
                            "a na orodovanie svätých mučeníkov <font color='#B71C1C'>(</font>svätého mučeníka <font color='#B71C1C'>M.)</font><br>" +
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
            {"36", "1", "Omša o pápežoch alebo biskupoch 1.", "Bratia a sestry, obráťme sa s prosbami na nášho nebeského Otca, ktorý nás nekonečne miluje.",
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
            {"36", "2", "Omša o pápežoch alebo biskupoch 2.", "Bratia a sestry, obráťme sa s prosbami na nášho nebeského Otca, ktorý nás nekonečne miluje.",
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
            {"33", "1", "Omša o duchovných pastieroch", "Bratia a sestry, ďakujme Bohu, že posiela svojmu ľudu kňazov, služobníkov oltára, medzi ktorých patril aj svätý kňaz <font color='#B71C1C'>M.</font>, a s oddanosťou prednesme svoje prosby.",
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
            {"37", "1", "Omša o duchovnom pastierovi 1.", "Bratia a sestry, ďakujme Bohu, že posiela svojmu ľudu kňazov, služobníkov oltára, medzi ktorých patril aj svätý kňaz <font color='#B71C1C'>M.</font>, a s oddanosťou prednesme svoje prosby.",
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
            {"37", "2", "Omša o duchovnom pastierovi 2.", "Bratia a sestry, ďakujme Bohu, že posiela svojmu ľudu kňazov, služobníkov oltára, medzi ktorých patril aj svätý kňaz <font color='#B71C1C'>M.</font>, a s oddanosťou prednesme svoje prosby.",
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
            {"34", "1", "Omša o zakladateľovi miestnej cirkvi", "Bratia a sestry, svätý <font color='#B71C1C'>(</font>svätá<font color='#B71C1C'>)</font> M.</font> nám svojím životom ukázal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font>, ako priniesť svedectvo o zmŕtvychvstalom Kristovi. Nasledujme ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> a obráťme sa s modlitbami k Bohu.",
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
            {"38", "1", "Omša o zakladateľoch miestnych cirkví", "Bratia a sestry, svätý <font color='#B71C1C'>(</font>svätá<font color='#B71C1C'>)</font> M.</font> nám svojím životom ukázal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font>, ako priniesť svedectvo o zmŕtvychvstalom Kristovi. Nasledujme ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> a obráťme sa s modlitbami k Bohu.",
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
    {"60", "1", "Omša o svätých mužoch a svätých ženách 5.", "Bratia a sestry, Pán Ježiš je vzorom svätosti a mnohí ho s vierou nasledovali. Prosme ho, aby na príhovor svätého <font color='#B71C1C'>M.</font> vyslyšal naše prosby.",
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
    {"60", "2", "Omša o svätých mužoch a svätých ženách 6.", "Bratia a sestry, Pán Ježiš je vzorom svätosti a mnohí ho s vierou nasledovali. Prosme ho, aby na príhovor svätého <font color='#B71C1C'>M.</font> vyslyšal naše prosby.",
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
            {"66", "1", "Omša o rehoľníkoch 2.", "Bratia a sestry, svätý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>) M.</font> získal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> korunu víťazstva za svoj príkladný život v rehoľnom spoločenstve. Na jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> príhovor prosme nášho dobrotivého Boha Otca.",
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
            {"67", "1", "Omša o rehoľníkoch 3.", "Bratia a sestry, svätý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>) M.</font> získal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> korunu víťazstva za svoj príkladný život v rehoľnom spoločenstve. Na jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> príhovor prosme nášho dobrotivého Boha Otca.",
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
            {"68", "1", "Omša o rehoľníkoch 4.", "Bratia a sestry, svätý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>) M.</font> získal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> korunu víťazstva za svoj príkladný život v rehoľnom spoločenstve. Na jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> príhovor prosme nášho dobrotivého Boha Otca.",
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
            {"68", "2", "Omša o rehoľníkoch 5.", "Bratia a sestry, svätý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>) M.</font> získal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> korunu víťazstva za svoj príkladný život v rehoľnom spoločenstve. Na jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> príhovor prosme nášho dobrotivého Boha Otca.",
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
            {"71", "1", "Za odpustenie hriechov 1.", "Bratia a sestry, Pán je milostivý a milosrdný, zhovievavý a veľmi láskavý. Pokorne ho prosme o dar pokánia pre seba i pre všetkých hriešnikov.",
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
            {"71", "2", "Za odpustenie hriechov 2.", "Bratia a sestry, Pán je milostivý a milosrdný, zhovievavý a veľmi láskavý. Pokorne ho prosme o dar pokánia pre seba i pre všetkých hriešnikov.",
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

            {"71", "3", "Za dar lásky", "Bratia a sestry, zhromaždení v mene Ježiša Krista prosme nebeského Otca, aby bolo na svete vždy viac dobročinnej lásky.",
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
            {"72b", "4", "Za povolanie na kňazský stav", "Bratia a sestry, Pán Ježiš je stále prítomný vo svojej Cirkvi a svoje kňazstvo uskutočňuje prostredníctvom tých, ktorým dal sviatostnú účasť na svojom kňazstve. Prosme ho za kňazské povolania.",
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
            {"72b", "5", "Za rehoľné povolania", "Bratia a sestry, pokorne prosme nášho veľkňaza Ježiša Krista, aby poslal horlivých robotníkov na svoju žatvu.",
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
            {"74", "1", "Za zachovanie pokoja a spravodlivosti 1.", "Bratia a sestry, spoločnou modlitbou sa obráťme k Bohu Otcovi, aby celá rodina národov žila v pravej bratskej láske.",
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
            {"74", "2", "Za zachovanie pokoja a spravodlivosti 2.", "Bratia a sestry, spoločnou modlitbou sa obráťme k Bohu Otcovi, aby celá rodina národov žila v pravej bratskej láske.",
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
            {"74", "3", "Za rodinu", "Bratia a sestry, pokorne prosme Pána za obnovu našich rodín, aby sa život viery zveľaďoval a upevňoval v našich rodinných spoločenstvách.",
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
            {"Za zachovanie pokoja a spravodlivosti 1.", "Daruj, Pane, pokoj tým, čo sa spoliehajú na teba, vypočuj prosby svojich služobníkov a veď nás na cestu spravodlivosti.", "(Porov. Sir 36, 18 – 19)",
            "Blahoslavení tí, čo šíria pokoj, lebo ich budú volať Božími synmi.<br>" +
            "<font color='#B71C1C'>Alebo: (Jn 14, 27)</font><br>" +
            "Pokoj vám zanechávam, svoj pokoj vám dávam, hovorí Pán.", "(Mt 5, 9)"},
        {"Za zachovanie pokoja a spravodlivosti 2.", "Daruj, Pane, pokoj tým, čo sa spoliehajú na teba, vypočuj prosby svojich služobníkov a veď nás na cestu spravodlivosti.", "(Porov. Sir 36, 18 – 19)",
                "Blahoslavení tí, čo šíria pokoj, lebo ich budú volať Božími synmi.<br>" +
                        "<font color='#B71C1C'>Alebo: (Jn 14, 27)</font><br>" +
                        "Pokoj vám zanechávam, svoj pokoj vám dávam, hovorí Pán.", "(Mt 5, 9)"},
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
            {"Za odpustenie hriechov 1.", "Pane, zmilúvaš sa nad všetkými a nepohŕdaš ničím, čo si vytvoril. Prehliadaš hriechy ľudí, aby sa kajali, a šetríš ich, lebo ty si Pán, náš Boh.", "(Porov. Mud 11, 23. 24. 26)",
                    "Boží anjeli majú radosť z jedného hriešnika, ktorý robí pokánie.", "(Lk 15, 10)"},
            {"Za odpustenie hriechov 2.", "Pane, zmilúvaš sa nad všetkými a nepohŕdaš ničím, čo si vytvoril. Prehliadaš hriechy ľudí, aby sa kajali, a šetríš ich, lebo ty si Pán, náš Boh.", "(Porov. Mud 11, 23. 24. 26)",
                    "Boží anjeli majú radosť z jedného hriešnika, ktorý robí pokánie.", "(Lk 15, 10)"},
            {"Za dar lásky", "Pán hovorí: Odstránim z vášho tela srdce kamenné a dám vám srdce z mäsa. Vložím do vás svojho ducha a budete mojím ľudom a ja budem vaším Bohom.", "(Ez 36, 26 – 28)",
                    "Teraz ostáva viera, nádej, láska, tieto tri, no najväčšia z nich je láska.", "(1 Kor 13, 13)"},
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
            {"Za zachovanie pokoja a spravodlivosti 1.", "Bože, ty si zjavil, že šíritelia pokoja<br>" +
                    "sa budú volať tvojimi synmi; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme vždy a všade<br>" +
                    "uplatňovali spravodlivosť, <font color='#B71C1C'>—</font><br>" +
                    "ktorá jediná môže zaručiť trvalý a pravý pokoj.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, všetci ľudia pochádzajú od teba<br>" +
                    "a ty sa o nich otcovsky staráš; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby žili v pokoji ako jedna rodina<br>" +
                    "spojená úprimnou bratskou láskou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, pod sviatostnými znakmi chleba a vína,<br>" +
                            "ktoré naznačujú pokoj a jednotu,<br>" +
                            "slávime spasiteľnú obetu<br>" +
                            "tvojho Syna, Kráľa pokoja; <font color='#B71C1C'>*</font><br>" +
                            "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "nech táto obeta upevňuje<br>" +
                            "svornosť medzi všetkými tvojimi deťmi.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane,<br>" +
                            "naplň nás duchom svojej lásky, <font color='#B71C1C'>*</font><br>" +
                            "a keďže sme prijali Telo a Krv<br>" +
                            "tvojho jednorodeného Syna, <font color='#B71C1C'>—</font><br>" +
                            "daj, aby sme upevňovali medzi ľuďmi pokoj,<br>" +
                            "ktorý nám zanechal sám Kristus.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"Za zachovanie pokoja a spravodlivosti 2.", "Bože, Stvoriteľ sveta,<br>" +
                    "podľa tvojej vôle sa odvíjajú dejiny sveta; <font color='#B71C1C'>*</font><br>" +
                    "vypočuj naše prosby<br>" +
                    "a daruj našim časom trvalý pokoj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s radostným srdcom<br>" +
                    "mohli chváliť tvoje milosrdenstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože pokoja, ty sám si pokojom,<br>" +
                    "ktorý svárlivý duch nemôže pochopiť<br>" +
                    "a srdce plné nenávisti sa zatvára pred tebou; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby všetci, čo žijú svorne, vytrvali v dobrom <font color='#B71C1C'>—</font><br>" +
                    "a tí, čo žijú v nepriateľstve,<br>" +
                    "nech sa zmieria a zabudnú na neprávosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, pod sviatostnými znakmi chleba a vína,<br>" +
                    "ktoré naznačujú pokoj a jednotu,<br>" +
                    "slávime spasiteľnú obetu<br>" +
                    "tvojho Syna, Kráľa pokoja; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "nech táto obeta upevňuje<br>" +
                    "svornosť medzi všetkými tvojimi deťmi.<br>" +
                    "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane,<br>" +
                            "naplň nás duchom svojej lásky, <font color='#B71C1C'>*</font><br>" +
                            "a keďže sme prijali Telo a Krv<br>" +
                            "tvojho jednorodeného Syna, <font color='#B71C1C'>—</font><br>" +
                            "daj, aby sme upevňovali medzi ľuďmi pokoj,<br>" +
                            "ktorý nám zanechal sám Kristus.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
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
            {"Za odpustenie hriechov 1.", "Pane, uznávame, že sme zhrešili; <font color='#B71C1C'>*</font><br>" +
                    "preto ťa prosíme,<br>" +
                    "zhliadni na našu pokoru<br>" +
                    "a zľutuj sa nad nami, <font color='#B71C1C'>—</font><br>" +
                    "odpusť nám viny<br>" +
                    "a obdaruj nás svojím pokojom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Pane, buď milostivý svojmu ľudu, <font color='#B71C1C'>*</font><br>" +
                    "osloboď nás od všetkých hriechov <font color='#B71C1C'>—</font><br>" +
                    "a odpusť nám tresty,<br>" +
                    "ktoré si zasluhujeme za svoje previnenia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, predkladáme ti obetu<br>" +
                            "zmierenia a chvály, <font color='#B71C1C'>*</font><br>" +
                            "aby si nám láskavo odpustil viny <font color='#B71C1C'>—</font><br>" +
                            "a usmerňoval k sebe naše nestále srdcia.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Milosrdný Bože,<br>" +
                            "pre túto sviatostnú obetu nám odpúšťaš viny; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pomáhaj nám svojou milosťou<br>" +
                            "chrániť sa ďalších hriechov, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ti slúžili s úprimným srdcom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"Za odpustenie hriechov 2.", "Všemohúci a dobrotivý Bože,<br>" +
                    "ty si napojil svoj ľud<br>" +
                    "prameňom živej vody zo skaly; <font color='#B71C1C'>*</font><br>" +
                    "priveď naše zatvrdnuté srdcia k slzám,<br>" +
                    "aby sme mohli oľutovať svoje hriechy <font color='#B71C1C'>—</font><br>" +
                    "a pre tvoje milosrdenstvo<br>" +
                    "si zaslúžili ich odpustenie.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, láskavo zhliadni na dary,<br>" +
                            "ktoré ti prinášame za naše hriechy, <font color='#B71C1C'>*</font><br>" +
                            "a pre obetu, ktorá je prameňom odpustenia, <font color='#B71C1C'>—</font><br>" +
                            "daj, nech nás milosť Ducha Svätého<br>" +
                            "pohne k slzám nad našimi hriechmi.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech nás nábožné prijatie<br>" +
                            "tejto sviatosti privedie k slzám,<br>" +
                            "ktoré zmyjú naše hriechy, <font color='#B71C1C'>*</font><br>" +
                            "a vo svojej milosti dopraj, <font color='#B71C1C'>—</font><br>" +
                            "aby sme dosiahli odpustenie, o ktoré prosíme.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"Za dar lásky", "Pane, zapáľ naše srdcia Duchom svojej lásky, <font color='#B71C1C'>*</font><br>" +
                    "aby sme vždy zmýšľali a konali,<br>" +
                    "ako sa tebe páči, <font color='#B71C1C'>—</font><br>" +
                    "a úprimne ťa milovali v našich bratoch a sestrách.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane,<br>" +
                            "milostivo posväť tieto obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a prijmi duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                            "ktorú konáme, aby sme tvojou láskou<br>" +
                            "milovali všetkých ľudí.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás<br>" +
                            "tým istým nebeským chlebom; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, naplň nás<br>" +
                            "milosťou Ducha Svätého <font color='#B71C1C'>—</font><br>" +
                            "a čistou radosťou prameniacou<br>" +
                            "z dokonalej lásky.<br>" +
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
            {"", "", "V omšiach za zosnulých I.", "Bratia a sestry, s dôverou vzývajme všemohúceho Boha a prosme ho za spásu živých i mŕtvych, veď on vzkriesil svojho Syna Ježiša Krista.",
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
                    "<font color='#B71C1C'>1.</font> Pane, daj, aby Cirkev vedená Duchom Svätým vždy kráčala po ceste pravdy a pevne sa pridŕžala zásad evanjelia. <br>" +
                            "<font color='#B71C1C'>2.</font> Pomôž lekárom vo svete účinne a nezištne hľadať lieky proti chorobám dnešnej civilizácie. <br>" +
                            "<font color='#B71C1C'>3.</font> Vzbudzuj v chorých a trpiacich odhodlanie obetovať svoju chorobu tebe a modlitbou čeliť bolesti a súženiu. <br>" +
                            "<font color='#B71C1C'>4.</font> Ochraňuj nás od chorôb ducha, aby sme si zachovali čistú myseľ a nedali sa manipulovať zlým duchom. <br>" +
                            "<font color='#B71C1C'>5.</font> Vylieč duše našich zosnulých zo všetkých previnení a dovoľ im prebývať v tvojej blaženosti.",
                    "Pane Ježišu, <br>" +
                            "ty si najlepším lekárom; <br>" +
                            "vyslyš naše prosby a posilni tých, <br>" +
                            "ktorí ochotne znášajú bremeno bolesti, <br>" +
                            "aby nám boli príkladom v utrpení, <br>" +
                            "ktoré spájajú s tvojím krížom. <br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            //prve citanie
            {"Nár 3, 17–26", "Dobre je v tichosti očakávať Pánovu záchranu",
                    "Čítanie z Knihy Náreky<br>" +
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


