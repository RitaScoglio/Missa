package sk.missa.interfaces;

/*
v dvojrozmerných poliach (prefacia1, prefacia2...) sa nachádzajú ID sviatkov, pri ktorých sa nachádzajú priradené ID prefácií podľa vzoru nižšie
prefacie - {ID prefácie, názov prefácie, nadpis, text},

001 - prefacia v kode

1 - Nedeľná (0-7)
2 - Spoločná (8-13)
3 - O eucharistii
4 - O preblahoslavenej Panne Marii
5 - O anjeloch
6 – sv. Jozefa, ženícha Panny Márie
7 – O apoštoloch
8 – O svätých
9 – O svätých mučeníkoch
10 – O svätých pastieroch Cirkvi
11 – O svätých pannách a rehoľníkoch
12 - Pôstna (14-17)
13 - Veľkonočná (18-22)
14 - O nanebovstúpení
15 - O Duchu Svätom
16 - Adventná (31-32)
17 - Vianočná (33-35)
Pôstne nedele (23-28)
O umučení (29-30)

//zadefinovane zistovanie vlastnej prefacie vacsie ako 20
21 - Narodenie sv. Jána Krstiteľa
22 - Sv. Petra a Pavla, apoštolov
23 - Sv. Cyrila a Metoda, slovanských vierozvestov
24 - Premenenie Pána
25 - Nanebovzatie Panny Márie
26 - Povýšenie svätého kríža
27 - Sedembolestnej Panny Márie, patrónky Slovenska
28 - Výročie posviacky
29 - Navštívenie preblahoslavenej Panny Márie (panny marie II.)
30 - Všetkých svätých
31 - O zosnulých (vlastna prefacia)
32 - sv. Jozefa, robotníka
33 - Katedra sv. Petra, Obrátenie sv.Pavla (apostoloch I.)
34 - Sv. Marka (apostoloch II.)
35 - Zoslanie Ducha Svätého
36 - Obetovanie Pána
37 - Mária Magdaléna
38 - Zvestovanie Pána
39 - O preblahoslavenej Panne Marii
40 - Nášho Pána Ježiša Krista
41 - Najsvätejšej Trojice
42 - Najsätejšieho Srdca Ježišovho
43 - Nedeľa Krista Kráľa
44 - NEPOŠKVRNENÉ POČATIE PANNY MÁRIE
45 - O zjavení Pána
46 - Krst Krista Pána (nedeľa po 6.1.)
47 - Panny Márie Bohorodičky (panny marie I)
48a, b, c - vlastne prefacie k marianskym formularom
49 - Za jednotu kresťanov


Vlastná - 4. eucharisticka modlitba
*/

public interface Prefacia {
    String[][] prefaciaPohyb = {
            {"0gkp", "6"},
            {"1gkp", "38"},
            {"2gkp", "35"},
            {"3gkp", "35"},
            {"4gkp", "3"},
            {"5gkp", "42"},
            {"60gkp", "14"},
            {"6gkp", "14"},
            {"7gkp", "41"},
            {"1op", "15"},
            {"2mp", "39"},
            {"3gp", "40"},
            {"4mp", "4"},
            {"8gkp", "43"},
            {"9gkp", "44"},
            {"10gkp", "17"},
            {"11gkp", "46"},
    };

    String[][] prefacia1 = {
            {"002", "2"},
            {"003m", "4"},
            {"009", "2"},
            {"01gk", "47"},
            {"02a", "17", "8", "10"},
            {"03a", "17"},
            {"05gk", "45"},
            {"06gk", "45"},
            {"07", "17", "8", "10"},
            {"13",  "2", "8", "10"},
            {"17", "2", "8", "11"},
            {"20a", "2", "8", "9", "10"},
            {"20b", "2", "8", "9"},
            {"20g+", "9"},
            {"21", "2", "8", "9", "11"},
            {"22", "2", "8", "9"},
            {"24", "2", "8", "10"},
            {"25g", "33"},
            {"26", "2", "8", "10"},
            {"27", "2", "8", "11"},
            {"28", "2", "8", "10"},
            {"31", "2", "8", "10"},
    };

    String[][] prefacia2 = {
            {"002", "2"},
            {"003m", "4"},
            {"004", "2"},
            {"02g", "36"},
            {"03a", "2", "8", "9", "10"},
            {"03b", "2", "8", "10"},
            {"05", "2", "8", "9", "11"},
            {"06", "2", "8", "9"},
            {"08a", "2", "8"},
            {"08b", "2", "8", "11"},
            {"10", "2", "8", "11"},
            {"11m", "4"},
            {"14o", "8", "10"},
            {"14g+", "8", "10"},
            {"17", "2", "8", "11"},
            {"21", "2", "8", "10"},
            {"22g", "33"},
            {"23", "2", "8", "9", "10"},
            {"27", "2", "11"},
    };

    String[][] prefacia3 = {
            {"002", "2"},
            {"003m", "4"},
            {"004", "2"},
            {"04", "2", "8"},
            {"07", "2", "8", "9"},
            {"08", "2", "8", "11"},
            {"09", "2", "8", "11"},
            {"10gv", "28"},
            {"17", "2", "8", "10"},
            {"18", "2", "8", "10"},
            {"23", "2", "8", "10"},
    };

    String[][] prefacia4 = {
            {"002", "2"},
            {"003m", "4"},
            {"005", "2"},
            {"008", "2"},
            {"02", "2", "8", "11"},
            {"04", "2", "8", "10"},
            {"05", "2", "8", "10"},
            {"07", "2", "8", "10"},
            {"11", "2", "8", "10"},
            {"13", "2", "8", "9", "10"},
            {"21", "2", "8", "10"},
            {"23", "2", "8", "9", "10"},
            {"24a", "2", "8", "9"},
            {"24b", "2", "8", "9", "10"},
            {"25g", "34"},
            {"28a", "2", "8", "9", "10"},
            {"28b", "2", "8", "10"},
            {"29g", "2", "8", "11"},
            {"30", "2", "8", "9"},
    };

    String[][] prefacia5 = {
            {"002", "2"},
            {"003m", "4"},
            {"005", "2"},
            {"008", "2"},
            {"01", "32"},
            {"02", "2", "8", "10"},
            {"03g", "7"},
            {"04", "2", "8", "9"},
            {"10", "2", "10"},
            {"11", "2", "8", "9"},
            {"12a", "2", "8", "9"},
            {"12b", "2", "8", "9"},
            {"13m", "4"},
            {"14g", "7"},
            {"16", "2", "8", "9"},
            {"16g", "9"},
            {"18", "2", "8", "9", "10"},
            {"20", "2", "8", "10"},
            {"21", "2", "8", "9"},
            {"22", "2", "8", "11"},
            {"25a", "2", "8", "10", "11"},
            {"25b", "2", "8", "10"},
            {"25c", "2", "8", "11"},
            {"26", "2", "8", "10", "11"},
            {"27", "2", "8", "10"},
            {"29", "8", "10"}
    };

    String[][] prefacia6 = {
            {"002", "2"},
            {"003m", "4"},
            {"005", "2"},
            {"008", "2"},
            {"01", "2", "8", "9"},
            {"02", "2", "8", "9"},
            {"03", "2", "8", "9"},
            {"05", "2", "8", "9", "10"},
            {"06", "2", "8", "10", "11"},
            {"09", "2", "8", "10"},
            {"11", "7"},
            {"13", "2", "8", "10", "11"},
            {"13gv", "28"},
            {"16+", "2", "8", "9"},
            {"19", "2", "8", "11"},
            {"21", "2", "8", "11"},
            {"22a", "2", "8", "10"},
            {"22b", "2", "8", "9"},
            {"23gk", "21"},
            {"24gk", "21"},
            {"27a", "2", "8"},
            {"27b", "2", "8", "10"},
            {"28", "2", "8", "9", "10"},
            {"28gk", "22"},
            {"29gk", "22"},
            {"30", "2", "8", "9"},
    };
    String[][] prefacia7 = {
            {"002", "2"},
            {"003m", "4"},
            {"02gm", "29"},
            {"03g", "7"},
            {"04", "2", "8"},
            {"05gk", "23"},
            {"06", "2", "8", "9", "11"},
            {"07", "2", "8", "10", "11"},
            {"09", "2", "8", "9"},
            {"11g", "2", "8", "11"},
            {"12", "8"},
            {"13", "2", "8"},
            {"14", "2", "8", "10"},
            {"15", "2", "8", "10"},
            {"16m", "4"},
            {"17", "2", "8", "11"},
            {"17g", "8", "11"},
            {"17gk", "8", "11"},
            {"20", "2", "8", "9", "10"},
            {"21", "2", "8", "10"},
            {"22g", "37"},
            {"23g", "8", "11"},
            {"24", "2", "8", "10"},
            {"25g", "7"},
            {"26", "2", "8"},
            {"27", "2", "8"},
            {"29", "2", "8"},
            {"30", "2", "8", "10"},
            {"30b", "2", "9", "11"},
            {"31", "2", "8", "10"},
    };
    String[][] prefacia8 = {
            {"002", "2"},
            {"003m", "4"},
            {"01", "2", "8", "10"},
            {"02a", "2", "8", "10"},
            {"02b", "2", "8", "10"},
            {"04", "2", "8", "10"},
            {"05", "4"},
            {"06gn", "24"},
            {"07a", "2", "8", "9"},
            {"07b", "2", "8", "10", "11"},
            {"08", "2", "8", "10", "11"},
            {"09g", "9", "11"},
            {"10g", "9"},
            {"11", "2", "8", "11"},
            {"12", "2", "8", "11"},
            {"13", "2", "8", "9", "10"},
            {"14", "2", "8", "11"},
            {"14gkm", "25"},
            {"15gkm", "25"},
            {"16", "2", "8"},
            {"18", "2", "8"},
            {"19", "2", "8", "10", "11"},
            {"20", "2", "8", "10", "11"},
            {"21", "2", "8", "10"},
            {"22m", "4"},
            {"23", "2", "8", "11"},
            {"24g", "7"},
            {"25a", "2", "8"},
            {"25b", "2", "8", "10"},
            {"27", "2", "8"},
            {"28", "2", "8", "10"},
            {"29", "21"},
            {"30gv", "28"},
    };
    String[][] prefacia9 = {
            {"002", "2"},
            {"003m", "4"},
            {"006", "2"},
            {"03", "2", "8", "10"},
            {"06gv", "28"},
            {"07", "2", "8", "9"},
            {"08gm", "4"},
            {"09", "2", "8", "10"},
            {"12m", "4"},
            {"13", "2", "8", "10"},
            {"14gn", "26"},
            {"15gkm", "27"},
            {"16", "2", "8", "11"},
            {"17a", "2", "8", "10"},
            {"17b", "2", "11"},
            {"19", "2", "8", "11"},
            {"20", "2", "8", "9"},
            {"21g", "7"},
            {"22+", "2", "8", "11"},
            {"23", "2", "8", "10"},
            {"24gv", "28"},
            {"26", "2", "8", "9"},
            {"27", "2", "8", "10"},
            {"28a", "2", "8", "9"},
            {"28b", "2", "8", "9"},
            {"29g", "5"},
            {"30", "2", "8", "10"},
    };
    String[][] prefacia10 = {
            {"002", "2"},
            {"003m", "4"},
            {"01", "2", "8", "11"},
            {"02", "5"},
            {"04", "2", "8", "11"},
            {"05", "2", "8", "11"},
            {"06", "2", "8", "10", "11"},
            {"07m", "4"},
            {"09a", "2", "8", "9"},
            {"09b", "2", "8", "10"},
            {"11", "2", "8", "10"},
            {"10gv", "28"},
            {"14", "2", "8", "9", "10"},
            {"15", "2", "8", "11"},
            {"16a", "2", "8", "11"},
            {"16b", "2", "8", "11"},
            {"16c", "2", "8", "10"},
            {"17", "2", "8", "9", "10"},
            {"18g", "7"},
            {"19a", "2", "8", "9"},
            {"19b", "2", "8", "10"},
            {"22", "2", "8", "10"},
            {"23", "2", "8", "10"},
            {"24", "2", "8", "10"},
            {"25", "2", "8", "10"},
            {"25gv", "28"},
            {"26gk+", "28"},
            {"27gv", "28"},
            {"28g", "7"},
            {"31gk", "30"},
    };
    String[][] prefacia11 = {
            {"002", "2"},
            {"003m", "4"},
            {"01gk", "30"},
            {"02an", "31"},
            {"02bn", "31"},
            {"02cn", "31"},
            {"03", "2", "8", "11"},
            {"04", "2", "8", "10"},
            {"05", "2", "8"},
            {"09g", "28"},
            {"10", "2", "8", "10"},
            {"11", "2", "8", "10"},
            {"11g", "28"},
            {"12", "2", "8", "9", "10"},
            {"15", "2", "8", "10"},
            {"16a", "2", "8"},
            {"16b", "2", "8", "11"},
            {"17", "2", "8", "11"},
            {"17gk", "28"},
            {"18", "7"},
            {"20", "2", "9", "11"},
            {"20gv", "28"},
            {"21m", "4"},
            {"22", "2", "8", "11"},
            {"23a", "2", "8", "9", "10"},
            {"23b", "2", "8", "11"},
            {"24", "2", "8", "9"},
            {"25", "2", "8", "11"},
            {"30g", "7"},
    };

    //adventna prefacia sa nastavuje priamo vo funkcii
    String[][] prefacia12 = {
            //{"003m", "4", "48"}, - nastavene priamo vo funkcii
            {"002", ""},
            {"007", ""},
            {"03", "8", "10"},
            {"03g", "10"},
            {"04a", "8", "10"},
            {"04b", "8", "9", "11"},
            {"06", "8", "10"},
            {"07", "8", "10"},
            {"09", "8"},
            {"10m", "4"},
            {"11", "8", "10"},
            {"12", "4"},
            {"13", "8", "9", "11"},
            {"14", "8", "10"},
            {"21a", ""},
            {"23a", ""},
            {"24gkn", "17"},
            {"25agkn", "17"},
            {"25bgkn", "17"},
            {"25cgkn", "17"},
            {"26g", "17"},
            {"27g", "17"},
            {"28g", "17"},
            {"29", "17"}, //oktava
            {"29a", "17"},
            {"30", "17"}, //oktava
            {"31", "17"}, //oktava
            {"31a", "17"},
            {"31gk", "47"},
    };

    String[][] prefacie = {
            {"1", "Nedeľná I", "O veľkonočnom tajomstve a Božom ľude",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on nás veľkonočným tajomstvom<br>" +
                            "zázračne vyslobodil z jarma hriechu a smrti<br>" +
                            "a povolal nás k sláve,<br>" +
                            "aby sme sa odteraz nazývali vyvoleným pokolením,<br>" +
                            "kráľovským kňazstvom,<br>" +
                            "svätým národom a jeho získaným ľudom.<br>" +
                            "A preto všade ohlasujeme tvoju moc a silu,<br>" +
                            "ktorou si nás vyviedol z temnôt<br>" +
                            "do svojho predivného svetla.<br>" +
                            "Preto s anjelmi aj archanjelmi, s trónmi a panstvami<br>" +
                            "a so všetkými nebeskými zástupmi<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"1", "Nedeľná II", "O tajomstve spásy",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on sa zľutoval nad hriešnym ľudstvom,<br>" +
                            "ponížil sa a narodil sa z Panny.<br>" +
                            "Trpel na kríži a oslobodil nás od večnej smrti,<br>" +
                            "vstal z mŕtvych a daroval nám večný život.<br>" +
                            "Preto s anjelmi aj archanjelmi, s trónmi a panstvami<br>" +
                            "a so všetkými nebeskými zástupmi<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"1", "Nedeľná III", "O vykúpení človeka človekom",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo tvoja nesmierna veľkosť sa prejavila v tom,<br>" +
                            "že si svojou božskou mocou prišiel spasiť ľudstvo;<br>" +
                            "skrze svojho Syna, ktorý sa stal človekom,<br>" +
                            "oslobodil si človeka od večnej smrti,<br>" +
                            "a tak všetkým, ktorých zahubil hriech,<br>" +
                            "vrátil si život skrze nášho Pána Ježiša Krista.<br>" +
                            "Skrze neho klaňajú sa ti zástupy anjelov<br>" +
                            "a večne sa radujú pred tvojou tvárou.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne voláme na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"1", "Nedeľná IV", "O dejinách spásy",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on svojím narodením<br>" +
                            "obnovil padnuté ľudstvo,<br>" +
                            "svojím utrpením zničil naše hriechy,<br>" +
                            "svojím zmŕtvychvstaním pripravil nám cestu<br>" +
                            "do večného života<br>" +
                            "a svojím nanebovstúpením<br>" +
                            "otvoril nám brány neba.<br>" +
                            "Preto ti so zástupmi anjelov a svätých<br>" +
                            "spievame pieseň chvály<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"1", "Nedeľná V", "O diele stvorenia",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo od teba pochádzajú všetky živly sveta<br>" +
                            "a pravidelné premeny času.<br>" +
                            "Človeka si stvoril na svoj obraz<br>" +
                            "a podriadil si mu všetky divy sveta,<br>" +
                            "aby v tvojom mene vládol nad všetkým tvorstvom<br>" +
                            "a nadchnutý krásou tvojho diela<br>" +
                            "ustavične ťa chválil skrze nášho Pána Ježiša Krista.<br>" +
                            "Preto ťa aj my so všetkými anjelmi chválime<br>" +
                            "a radostne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"1", "Nedeľná VI", "O zálohu večnej Paschy",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo v tebe žijeme, hýbeme sa a sme<br>" +
                            "a už v tomto pozemskom putovaní<br>" +
                            "každodenne pociťujeme prejavy tvojej lásky<br>" +
                            "a nosíme v sebe záloh večného života.<br>" +
                            "Dostali sme totiž prvotiny Ducha Svätého,<br>" +
                            "ktorý Ježiša vzkriesil z mŕtvych,<br>" +
                            "a preto dúfame, že budeme mať plnú účasť<br>" +
                            "na jeho veľkonočnom tajomstve.<br>" +
                            "Preto ťa aj my so všetkými anjelmi chválime<br>" +
                            "a radostne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"1", "Nedeľná VII", "O spáse skrze Kristovu poslušnosť",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo si tak súcitne miloval svet,<br>" +
                            "že si nám poslal Vykupiteľa,<br>" +
                            "ktorý nám bol podobný vo všetkom okrem hriechu,<br>" +
                            "aby si aj v nás mohol milovať,<br>" +
                            "čo si si obľúbil vo svojom Synovi.<br>" +
                            "Veď pre jeho poslušnosť navrátil si nám svoje dary,<br>" +
                            "ktoré sme stratili neposlušnosťou a hriechom.<br>" +
                            "Preto ťa aj my, Pane,<br>" +
                            "spolu so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a radostne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"1", "Nedeľná VIII", "O Cirkvi, zjednotenej podľa vzoru Najsvätejšej Trojice",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo krvou svojho Syna a mocou Ducha Svätého<br>" +
                            "znova si zjednotil okolo seba svoje deti,<br>" +
                            "ktoré hriech od teba odlúčil.<br>" +
                            "A tak tvoj ľud,<br>" +
                            "zhromaždený v jednote Najsvätejšej Trojice,<br>" +
                            "vytvára Cirkev, Kristovo telo a chrám Ducha Svätého<br>" +
                            "na slávu tvojej mnohotvárnej múdrosti.<br>" +
                            "Preto ťa spolu s anjelskými chórmi chválime<br>" +
                            "a radostne vyznávame:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"2", "Spoločná I", "O obnovení všetkého v Kristovi",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo v ňom si sa rozhodol obnoviť celé stvorenie<br>" +
                            "a z jeho plnosti dal si podiel nám všetkým.<br>" +
                            "On, hoci mal božskú prirodzenosť,<br>" +
                            "zriekol sa seba samého<br>" +
                            "a krvou vyliatou na kríži<br>" +
                            "priniesol pokoj celému svetu.<br>" +
                            "Preto bol nad všetko povýšený<br>" +
                            "a stal sa žriedlom večnej spásy pre všetkých,<br>" +
                            "ktorí ho poslúchajú.<br>" +
                            "Preto s anjelmi aj archanjelmi, s trónmi a panstvami<br>" +
                            "a so všetkými nebeskými zástupmi<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"2", "Spoločná II", "O spáse skrze Krista",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo vo svojej dobrote si stvoril človeka,<br>" +
                            "a hoci bol spravodlivo odsúdený,<br>" +
                            "vo svojom milosrdenstve si ho vykúpil<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Skrze neho tvoju velebu chvália anjeli,<br>" +
                            "klaňajú sa jej panstvá, chvejú sa pred ňou mocnosti.<br>" +
                            "Nebesia a nebeské sily i blažení serafíni<br>" +
                            "ťa oslavujú spoločným plesaním.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď v pokornej úcte voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"2", "Spoločná III","Oslava Boha za stvorenie a vykúpenie človeka",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo skrze svojho milovaného Syna<br>" +
                            "si stvoril človeka<br>" +
                            "a skrze neho si nás aj vykúpil.<br>" +
                            "Teda právom ti slúži všetko stvorenie,<br>" +
                            "chvália ťa všetci vykúpení<br>" +
                            "a tvoji svätí ti svorne dobrorečia.<br>" +
                            "Preto ťa aj my so všetkými anjelmi oslavujeme<br>" +
                            "a radostne vyznávame:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"2", "Spoločná IV", "O chvále, Božom dare",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo hoci ty nepotrebuješ našu oslavu,<br>" +
                            "predsa je tvojím darom,<br>" +
                            "že ti smieme vzdávať vďaky.<br>" +
                            "Naše chvály nepridávajú nič k tvojej veľkosti,<br>" +
                            "ale nám prispievajú k spáse,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Preto ťa spolu s anjelskými chórmi chválime<br>" +
                            "a radostne vyznávame:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"2", "Spoločná V", "Ohlasovanie Kristovho tajomstva",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo s láskou slávime jeho umučenie,<br>" +
                            "so živou vierou vyznávame jeho zmŕtvychvstanie<br>" +
                            "a s pevnou nádejou očakávame jeho slávny príchod.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"2", "Spoločná VI", "O tajomstve spásy v Kristovi",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, svätý Otče,<br>" +
                            "skrze tvojho milovaného Syna Ježiša Krista.<br>" +
                            "On je tvoje Slovo, skrze ktoré si všetko stvoril,<br>" +
                            "jeho si nám poslal za Spasiteľa a Vykupiteľa.<br>" +
                            "Mocou Ducha Svätého sa stal človekom<br>" +
                            "a narodil sa z Panny.<br>" +
                            "Aby splnil tvoju vôľu a získal ti svätý ľud,<br>" +
                            "rozpäl ruky na kríži, zomrel za nás,<br>" +
                            "a tak zlomil moc smrti a zjavil vzkriesenie.<br>" +
                            "Preto s anjelmi a so všetkými svätými<br>" +
                            "hlásame tvoju slávu a jedným hlasom voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"12", "Pôstna I", "O duchovnom význame pôstnej doby",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo ty milostivo umožňuješ svojim veriacim,<br>" +
                            "aby každoročne s očisteným srdcom a s radosťou<br>" +
                            "očakávali veľkonočné sviatky,<br>" +
                            "horlivejšie konali nábožné úkony<br>" +
                            "a skutky dobročinnej lásky<br>" +
                            "a účasťou na tajomstvách, ktorými boli znovuzrodení,<br>" +
                            "dosiahli plnosť milosti Božích detí.<br>" +
                            "Preto s anjelmi aj archanjelmi, s trónmi a panstvami<br>" +
                            "a so všetkými nebeskými zástupmi<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"12", "Pôstna II", "O duchovnom pokání",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo ty si nám, svojim deťom, určil tento osobitný čas,<br>" +
                            "aby sme si očistili srdce od nezriadených žiadostí<br>" +
                            "a uprostred pozemských starostí<br>" +
                            "mali vždy na zreteli večné hodnoty.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"12", "Pôstna III", "O ovocí zdržanlivosti",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Ty si chcel, aby sme ti odriekaním vzdávali vďaky,<br>" +
                            "aby v nás hriešnikoch zdržanlivosť krotila pýchu<br>" +
                            "a viedla nás k napodobňovaniu tvojej dobroty,<br>" +
                            "keď sa s chudobnými delíme o chlieb.<br>" +
                            "Preto ťa velebíme s nespočetnými zástupmi anjelov<br>" +
                            "a jedným hlasom voláme na tvoju chválu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"12", "Pôstna IV", "O ovocí pôstu",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo ty v nás telesným pôstom krotíš zlé sklony,<br>" +
                            "dvíhaš myseľ, udeľuješ silu k čnosti<br>" +
                            "a dávaš odmenu skrze nášho Pána Ježiša Krista.<br>" +
                            "Skrze neho tvoju velebu chvália anjeli,<br>" +
                            "klaňajú sa jej panstvá, chvejú sa pred ňou mocnosti.<br>" +
                            "Nebesia a nebeské sily i blažení serafíni<br>" +
                            "ťa oslavujú spoločným plesaním.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď v pokornej úcte voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"13", "Veľkonočná I", "O veľkonočnom tajomstve",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "teba, Pane, velebiť v každom čase,<br>" +
                            "ale slávnostnejšie v túto noc <font color='#B71C1C'>(</font>v tento deň<font color='#B71C1C'>) (</font>v tento čas<font color='#B71C1C'>)</font>,<br>" +
                            "keď sa Kristus obetoval ako náš veľkonočný Baránok.<br>" +
                            "Veď on je opravdivý Baránok,<br>" +
                            "ktorý sňal hriechy sveta.<br>" +
                            "On svojou smrťou zničil našu smrť<br>" +
                            "a svojím zmŕtvychvstaním obnovil nám život.<br>" +
                            "Preto ľudstvo po celom svete<br>" +
                            "plesá nesmiernou veľkonočnou radosťou,<br>" +
                            "ale aj anjelské zástupy<br>" +
                            "neprestajne spievajú chválospev na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"13", "Veľkonočná II", "O novom živote v Kristovi",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "teba, Pane, velebiť v každom čase,<br>" +
                            "ale slávnostnejšie v tento čas,<br>" +
                            "keď sa Kristus obetoval ako náš veľkonočný Baránok.<br>" +
                            "Skrze neho sa rodia pre večný život synovia svetla<br>" +
                            "a veriacim sa otvárajú brány nebeského kráľovstva.<br>" +
                            "On svojou smrťou vykúpil našu smrť<br>" +
                            "a svojím zmŕtvychvstaním<br>" +
                            "priniesol všetkým nový život.<br>" +
                            "Preto ľudstvo po celom svete<br>" +
                            "plesá nesmiernou veľkonočnou radosťou,<br>" +
                            "ale aj anjelské zástupy<br>" +
                            "neprestajne spievajú chválospev na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"13", "Veľkonočná III", "O Kristovi, ktorý žije a stále sa prihovára za nás ",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "teba, Pane, velebiť v každom čase,<br>" +
                            "ale slávnostnejšie v tento čas,<br>" +
                            "keď sa Kristus obetoval ako náš veľkonočný Baránok.<br>" +
                            "Lebo on sa za nás neprestajne obetuje<br>" +
                            "a u teba sa prihovára za nás ako náš večný zástanca;<br>" +
                            "obetoval sa raz na kríži a viacej neumiera,<br>" +
                            "ale večne žije aj po svojom umučení.<br>" +
                            "Preto ľudstvo po celom svete<br>" +
                            "plesá nesmiernou veľkonočnou radosťou,<br>" +
                            "ale aj anjelské zástupy<br>" +
                            "neprestajne spievajú chválospev na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"13", "Veľkonočná IV", "O obnove všetkého skrze veľkonočné tajomstvo",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "teba, Pane, velebiť v každom čase,<br>" +
                            "ale slávnostnejšie v tento čas,<br>" +
                            "keď sa Kristus obetoval ako náš veľkonočný Baránok.<br>" +
                            "Lebo on zvíťazil nad hriechom a smrťou,<br>" +
                            "obnovuje všetko padnuté<br>" +
                            "a v ňom znova nadobúdame plnosť života.<br>" +
                            "Preto ľudstvo po celom svete<br>" +
                            "plesá nesmiernou veľkonočnou radosťou,<br>" +
                            "ale aj anjelské zástupy<br>" +
                            "neprestajne spievajú chválospev na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"13", "Veľkonočná V", "O Kristovi, ktorý je kňazom i obetou",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "teba, Pane, velebiť v každom čase,<br>" +
                            "ale slávnostnejšie v tento čas,<br>" +
                            "keď sa Kristus obetoval ako náš veľkonočný Baránok.<br>" +
                            "Lebo keď obetoval svoje telo,<br>" +
                            "zavŕšil starozákonné obety v pravde kríža.<br>" +
                            "A keď sa ti ponúkol za našu spásu,<br>" +
                            "bol zároveň kňazom,<br>" +
                            "oltárom i obetným Baránkom.<br>" +
                            "Preto ľudstvo po celom svete<br>" +
                            "plesá nesmiernou veľkonočnou radosťou,<br>" +
                            "ale aj anjelské zástupy<br>" +
                            "neprestajne spievajú chválospev na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"", "Na prvú pôstnu nedeľu", "O pokúšaní Pána",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on štyridsaťdenným pôstom<br>" +
                            "posvätil túto dobu pokánia,<br>" +
                            "zmaril úklady odvekého nepriateľa<br>" +
                            "a naučil nás odolávať zvodom hriechu,<br>" +
                            "aby sme s čistým srdcom<br>" +
                            "mohli sláviť veľkonočné tajomstvo<br>" +
                            "a raz sa mohli tešiť<br>" +
                            "z veľkonočného víťazstva vo večnosti.<br>" +
                            "Preto ti so zástupmi anjelov a svätých<br>" +
                            "spievame pieseň chvály a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"", "Na druhú pôstnu nedeľu", "O Premenení Pána",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on predpovedal svoju smrť učeníkom<br>" +
                            "a na svätom vrchu im zjavil svoju slávu,<br>" +
                            "aby pochopili, že cez utrpenie<br>" +
                            "sa prichádza k slávnemu vzkrieseniu,<br>" +
                            "ako o tom svedčí Zákon i proroci.<br>" +
                            "Preto ťa tu na zemi spolu s nebeskými zástupmi<br>" +
                            "oslavujeme a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"", "O Samaritánke", "O Samaritánke",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo keď si on pýtal od Samaritánky vodu,<br>" +
                            "už ju pripravil na dar viery.<br>" +
                            "A vo svojej túžbe po jej viere<br>" +
                            "zapálil v nej oheň Božej lásky.<br>" +
                            "Preto ti aj my vzdávame vďaky<br>" +
                            "a so zástupmi anjelov oslavujeme tvoju velebu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"", "O slepom od narodenia", "O slepom od narodenia",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on sa stal človekom,<br>" +
                            "aby priviedol k svetlu viery<br>" +
                            "ľudstvo kráčajúce v temnotách<br>" +
                            "a kúpeľom znovuzrodenia<br>" +
                            "udelil hodnosť Božích detí všetkým,<br>" +
                            "čo prichádzajú na svet ako otroci prvotného hriechu.<br>" +
                            "Preto sa ti nebo i zem klaňajú a spievajú novú pieseň,<br>" +
                            "preto aj my so všetkými chórmi anjelov bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"", "O Lazárovi", "O Lazárovi",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on ako opravdivý človek<br>" +
                            "plakal nad svojím priateľom Lazárom<br>" +
                            "a ako večný Boh vzkriesil ho z hrobu.<br>" +
                            "Zmiloval sa nad celým ľudstvom<br>" +
                            "a svätými tajomstvami nás privádza k novému životu.<br>" +
                            "Skrze neho klaňajú sa ti zástupy anjelov<br>" +
                            "a večne sa radujú pred tvojou tvárou.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne voláme na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"", "Na kvetnú nedeľu", "O Pánovom umučení",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on, hoci bol nevinný,<br>" +
                            "dobrovoľne trpel za nás vinníkov<br>" +
                            "a nechal sa nespravodlivo odsúdiť za hriešnikov.<br>" +
                            "Svojou smrťou zotrel naše hriechy<br>" +
                            "a svojím zmŕtvychvstaním nám získal odpustenie.<br>" +
                            "Preto ťa aj my so všetkými anjelmi chválime<br>" +
                            "a radostne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"", "O umučení Pána I", "O moci kríža",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo spásonosné umučenie tvojho Syna<br>" +
                            "pohýna celý svet oslavovať tvoju velebu.<br>" +
                            "Veď na kríži sa odohral súd nad zlobou sveta<br>" +
                            "a prejavila sa moc ukrižovaného Krista.<br>" +
                            "Preto ťa aj my, Pane,<br>" +
                            "spolu so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a radostne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"", "O umučení Pána II", "O víťazstve Kristovho umučenia",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo sa približujú dni<br>" +
                            "jeho spásonosného umučenia<br>" +
                            "a slávneho zmŕtvychvstania,<br>" +
                            "keď sa oslavuje víťazstvo<br>" +
                            "nad pýchou odvekého nepriateľa<br>" +
                            "a obnovuje sa tajomstvo nášho vykúpenia.<br>" +
                            "Skrze neho klaňajú sa ti zástupy anjelov<br>" +
                            "a večne sa radujú pred tvojou tvárou.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne voláme na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"16", "Adventná I", "O dvoch Kristových príchodoch",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo pri svojom prvom príchode sa uponížil,<br>" +
                            "vzal na seba telo, splnil pradávne prisľúbenia<br>" +
                            "a otvoril nám cestu do večnej spásy,<br>" +
                            "aby sme pri jeho slávnom<br>" +
                            "a velebnom druhom príchode<br>" +
                            "dostali prisľúbený dar spásy,<br>" +
                            "ktorý teraz tak bedlivo a túžobne očakávame.<br>" +
                            "Preto s anjelmi aj archanjelmi, s trónmi a panstvami<br>" +
                            "a so všetkými nebeskými zástupmi<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"16", "Adventná II", "O dvojakom očakávaní Krista",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Jeho predpovedali všetci proroci,<br>" +
                            "panenská Matka ho v nevýslovnej láske<br>" +
                            "nosila pod srdcom,<br>" +
                            "Ján ohlasoval jeho príchod<br>" +
                            "a ukázal na neho, že už je tu.<br>" +
                            "On nám dáva milosť, aby sme sa s radosťou<br>" +
                            "pripravovali na slávnosť jeho narodenia,<br>" +
                            "aby nás našiel i bedliť v modlitbách,<br>" +
                            "i jasať na jeho slávu.<br>" +
                            "Preto s anjelmi aj archanjelmi, s trónmi a panstvami<br>" +
                            "a so všetkými nebeskými zástupmi<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"17", "Vianočná I", "O Kristovi – svetle",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo tajomným vtelením tvojho Slova<br>" +
                            "zažiarilo našej duši nové svetlo tvojej slávy.<br>" +
                            "Keď takto poznávame Boha viditeľne,<br>" +
                            "nech nás on sám strhne k láske vecí neviditeľných.<br>" +
                            "Preto s anjelmi aj archanjelmi, s trónmi a panstvami<br>" +
                            "a so všetkými nebeskými zástupmi<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"17", "Vianočná II", "O obnove všetkého vo vtelení",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on, neviditeľný vo svojom božstve,<br>" +
                            "zjavil sa vo vznešenom tajomstve, ktoré slávime,<br>" +
                            "ako viditeľný v našej prirodzenosti;<br>" +
                            "splodený pred všetkými vekmi narodil sa v čase,<br>" +
                            "aby v sebe pozdvihol všetko padnuté,<br>" +
                            "obnovil v sebe celé stvorenie<br>" +
                            "a strateného človeka opäť povolal<br>" +
                            "do nebeského kráľovstva.<br>" +
                            "Preto ťa aj my so všetkými anjelmi chválime<br>" +
                            "a radostne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"17", "Vianočná III", "Tajomná výmena vo vtelení Slova",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "V ňom sa dnes jasne zjavila tajomná výmena,<br>" +
                            "ktorá nám priniesla spásu:<br>" +
                            "lebo keď si tvoje Slovo vzalo našu krehkú prirodzenosť,<br>" +
                            "naša ľudská pominuteľnosť<br>" +
                            "sa povzniesla k nehynúcej sláve<br>" +
                            "a my všetci sme týmto obdivuhodným spoločenstvom<br>" +
                            "dostali podiel na večnosti.<br>" +
                            "Preto ťa spolu s anjelskými chórmi chválime<br>" +
                            "a radostne vyznávame:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"3", "O Eucharistii I", "O Kristovej obete a sviatosti",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on, pravý a večný kňaz,<br>" +
                            "ustanovil spôsob ustavičnej obety<br>" +
                            "a prvý seba samého priniesol tebe za obetu spásy.<br>" +
                            "Aj nám prikázal sláviť<br>" +
                            "túto obetu na jeho pamiatku.<br>" +
                            "Jeho telo, obetované za nás,<br>" +
                            "je duchovný pokrm, ktorý nás posilňuje,<br>" +
                            "a jeho krv, vyliata za nás,<br>" +
                            "je duchovný nápoj, ktorý nás očisťuje.<br>" +
                            "Preto s anjelmi aj archanjelmi, s trónmi a panstvami<br>" +
                            "a so všetkými nebeskými zástupmi<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"3", "O Eucharistii II", "O účinkoch Najsvätejšej sviatosti",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo pri Poslednej večeri v kruhu svojich apoštolov<br>" +
                            "obetoval sa ti ako Baránok bez poškvrny<br>" +
                            "a priniesol ti dokonalú obetu chvály,<br>" +
                            "aby tak naveky ustanovil spásonosnú pamiatku kríža.<br>" +
                            "Týmto eucharistickým tajomstvom<br>" +
                            "živíš a posväcuješ svojich veriacich,<br>" +
                            "aby celú ľudskú rodinu, žijúcu na tej istej zemi,<br>" +
                            "osvecovala tá istá viera<br>" +
                            "a spájala tá istá láska.<br>" +
                            "Pristupujeme teda k stolu tejto obdivuhodnej sviatosti,<br>" +
                            "aby sme, preniknutí tvojou milosťou,<br>" +
                            "prešli k nebeským skutočnostiam,<br>" +
                            "ktoré sa tu naznačujú.<br>" +
                            "Preto sa ti nebo i zem klaňajú a spievajú novú pieseň,<br>" +
                            "preto aj my so všetkými chórmi anjelov<br>" +
                            "bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"4", "O preblahoslavenej Panne Marií I", "O materstve blahoslavenej Panny Márie",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "a teba <font color='#B71C1C'>(</font>pri uctievaní...<font color='#B71C1C'>)</font><br>" +
                            "preblahoslavenej Márie, vždy Panny,<br>" +
                            "spoločne chváliť, velebiť a oslavovať.<br>" +
                            "Veď ona počala tvojho jednorodeného Syna,<br>" +
                            "Duchom Svätým zatônená,<br>" +
                            "a v ustavičnej sláve panenstva<br>" +
                            "porodila svetu večné svetlo,<br>" +
                            "Ježiša Krista, nášho Pána.<br>" +
                            "Skrze neho tvoju velebu chvália anjeli,<br>" +
                            "klaňajú sa jej panstvá,<br>" +
                            "chvejú sa pred ňou mocnosti.<br>" +
                            "Nebesia a nebeské sily i blažení serafíni<br>" +
                            "ťa oslavujú spoločným plesaním.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď v pokornej úcte voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"4", "O preblahoslavenej Panne Marií II", "Cirkev oslavuje Boha slovami Panny Márie",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "ohlasovať tvoju slávu,<br>" +
                            "ktorá žiari zo všetkých tvojich svätých,<br>" +
                            "a zvelebovať tvoju lásku k nám<br>" +
                            "najmä pri spomienke na preblahoslavenú Pannu Máriu<br>" +
                            "slovami jej chválospevu.<br>" +
                            "Lebo na celom tvorstve<br>" +
                            "si prejavil svoju obdivuhodnú moc<br>" +
                            "a všetky pokolenia si zahrnul svojou milosrdnou láskou,<br>" +
                            "keď si zhliadol na svoju skromnú služobnicu<br>" +
                            "a skrze ňu si nám dal pôvodcu našej spásy,<br>" +
                            "svojho Syna Ježiša Krista, nášho Pána.<br>" +
                            "Skrze neho klaňajú sa ti zástupy anjelov<br>" +
                            "a večne sa radujú pred tvojou tvárou.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne voláme na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"5", "O anjeloch", "O Božej sláve prostredníctvom úcty anjelov",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "a v anjeloch a archanjeloch<br>" +
                            "oslavovať tvoju moc a velebu.<br>" +
                            "Lebo keď si uctievame tvojich nebeských poslov,<br>" +
                            "velebíme tvoju nekonečnú slávu.<br>" +
                            "Ich krása a dôstojnosť nám dáva tušiť,<br>" +
                            "aký si nesmierny a nadovšetko vznešený.<br>" +
                            "Skrze nášho Pána Ježiša Krista tvoju velebu<br>" +
                            "oslavujú všetci anjeli a spievajú pieseň chvály.<br>" +
                            "Aj my sa k nim pripájame a s úctou sa ti klaniame,<br>" +
                            "keď spolu s nimi radostne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"6", "Sv. Jozefa, ženícha Panny Márie", "O poslaní svätého Jozefa",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože:<br>" +
                            "a teba na slávnosť svätého Jozefa náležitými<br>" +
                            "chválospevmi chváliť, velebiť a oslavovať.<br>" +
                            "Lebo si dal tohto spravodlivého muža<br>" +
                            "panenskej Bohorodičke za ženícha<br>" +
                            "a jeho, ako verného a múdreho služobníka,<br>" +
                            "ustanovil si za hlavu Svätej rodiny,<br>" +
                            "aby sa otcovsky staral o tvojho jednorodeného,<br>" +
                            "Duchom Svätým počatého Syna<br>" +
                            "Ježiša Krista, nášho Pána.<br>" +
                            "Skrze neho tvoju velebu chvália anjeli,<br>" +
                            "klaňajú sa jej panstvá, chvejú sa pred ňou mocnosti.<br>" +
                            "Nebesia a nebeské sily i blažení serafíni<br>" +
                            "ťa oslavujú spoločným plesaním.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď v pokornej úcte voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"7", "O apoštoloch I", "O apoštoloch, pastieroch Božieho ľudu",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo ty, večný Pastier, neopúšťaš svoj ľud,<br>" +
                            "ale prostredníctvom svojich svätých apoštolov<br>" +
                            "stále ho chrániš.<br>" +
                            "Aj naďalej ho opatruješ<br>" +
                            "pod starostlivým vedením tých,<br>" +
                            "ktorých si ako zástupcov svojho Syna<br>" +
                            "ustanovil za duchovných pastierov.<br>" +
                            "Preto s anjelmi aj archanjelmi, s trónmi a panstvami<br>" +
                            "a so všetkými nebeskými zástupmi<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"7", "O apoštoloch II", "O apoštolskom základe a svedectve",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo ty si postavil svoju Cirkev<br>" +
                            "na apoštolských základoch,<br>" +
                            "aby ustavične žiarila na zemi<br>" +
                            "ako odlesk tvojej svätosti<br>" +
                            "a všetkým ľuďom vydávala svedectvo<br>" +
                            "o nebeskom kráľovstve.<br>" +
                            "Preto ťa teraz i po celú večnosť<br>" +
                            "spolu so všetkými zástupmi anjelov<br>" +
                            "nábožne oslavujeme a voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"8", "O svätých I", "O sláve svätých",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo teba oslavujú zástupy svätých,<br>" +
                            "a keď korunuješ ich zásluhy,<br>" +
                            "korunuješ dielo svojej milosti.<br>" +
                            "Ich život nám dávaš za príklad,<br>" +
                            "na ich orodovanie nám pomáhaš<br>" +
                            "a v spoločenstve s nimi<br>" +
                            "z nás utváraš jednu rodinu.<br>" +
                            "Aby sme, povzbudení toľkými svedkami,<br>" +
                            "víťazne obstáli v duchovnom zápase<br>" +
                            "a spolu s nimi dosiahli nevädnúci veniec slávy<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Preto ti spolu s anjelmi aj archanjelmi<br>" +
                            "a so zástupom všetkých svätých<br>" +
                            "spievame pieseň chvály a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"8", "O svätých II", "O príklade a orodovaní svätých",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo obdivuhodným svedectvom svojich svätých<br>" +
                            "ustavične obnovuješ životnú silu svojej Cirkvi<br>" +
                            "a dávaš nám presvedčivé dôkazy svojej lásky.<br>" +
                            "Ich vynikajúci príklad nás povzbudzuje<br>" +
                            "a ich láskavé orodovanie nám pomáha<br>" +
                            "napĺňať tajomstvá spásy.<br>" +
                            "Preto ťa aj my, Pane,<br>" +
                            "spolu so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a radostne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"9", "O svätých mučeníkoch I", "O význame a príklade mučeníctva",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo svätý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>/</font>í<font color='#B71C1C'>)</font> mučeník <font color='#B71C1C'>M.</font><br>" +
                            "<font color='#B71C1C'>(</font>mučenica <font color='#B71C1C'>M. /</font> mučeníci <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.)</font><br>" +
                            "podľa Kristovho príkladu vyznal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>/</font>i<font color='#B71C1C'>)</font> tvoje meno<br>" +
                            "a vyliatím krvi poukázal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>/</font>i<font color='#B71C1C'>)</font><br>" +
                            "na tvoju obdivuhodnú moc,<br>" +
                            "ktorou krehkých ľudí posilňuješ<br>" +
                            "a upevňuješ ich odvahu stať sa tvojimi svedkami,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Preto ťa tu na zemi<br>" +
                            "spolu s nebeskými zástupmi oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"9", "O svätých mučeníkoch II", "O veľkých Božích činoch vo víťazstve mučeníkov",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo zvelebujeme teba,<br>" +
                            "keď oslavujeme tvojich svätých,<br>" +
                            "veď ich umučenie je obdivuhodným<br>" +
                            "dielom tvojej moci.<br>" +
                            "Ty láskavo udeľuješ zápal takejto viery,<br>" +
                            "ty vnukáš rozhodnosť vytrvať do konca,<br>" +
                            "ty dávaš víťazstvo v smrteľnom zápase<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Preto sa ti nebo i zem klaňajú a spievajú novú pieseň,<br>" +
                            "preto aj my so všetkými chórmi anjelov<br>" +
                            "bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"10", "O svätých pastieroch Cirkvi", "O prítomnosti svätých pastierov v Cirkvi",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo si dal svojej Cirkvi svätého <font color='#B71C1C'>M.</font>,<br>" +
                            "ktorého dnes s radosťou oslavujeme.<br>" +
                            "Príkladom jeho svätého života nás posilňuješ,<br>" +
                            "jeho náukou nás poučuješ<br>" +
                            "a na jeho príhovor nás ochraňuješ.<br>" +
                            "Preto ti so zástupmi anjelov<br>" +
                            "a svätých spievame pieseň chvály<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"11", "O svätých pannách a rehoľníkoch", "O svedectve Bohu zasväteného života",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo vo svätých,<br>" +
                            "ktorí sa pre nebeské kráľovstvo zasvätili Kristovi,<br>" +
                            "oslavujeme tvoju obdivuhodnú prozreteľnosť,<br>" +
                            "ktorou krehkého človeka<br>" +
                            "privádzaš k prvotnej svätosti<br>" +
                            "a už tu na zemi mu dávaš okúsiť dobrá,<br>" +
                            "ktoré si mu pripravil v nebi.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"31", "O zosnulých I", "O nádeji na vzkriesenie v Kristovi",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo v ňom nám zažiarila nádej<br>" +
                            "na slávne vzkriesenie,<br>" +
                            "a hoci nás zarmucuje neodvratný údel smrti,<br>" +
                            "potešuje nás prísľub budúcej nesmrteľnosti.<br>" +
                            "Veď tým, čo veria v teba, Pane,<br>" +
                            "život sa neodníma, iba mení;<br>" +
                            "a keď skončíme život v smrteľnom tele,<br>" +
                            "máme pripravený večný príbytok v nebesiach.<br>" +
                            "Preto s anjelmi aj archanjelmi, s trónmi a panstvami<br>" +
                            "a so všetkými nebeskými zástupmi<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"31", "O zosnulých II", "Kristus zomrel, aby sme my žili",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on sám prijal smrť,<br>" +
                            "aby nik z nás v smrti nezahynul;<br>" +
                            "on sám sa rozhodol umrieť,<br>" +
                            "aby sme všetci večne žili s tebou.<br>" +
                            "Preto ťa spolu s anjelskými chórmi chválime<br>" +
                            "a radostne vyznávame:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"31", "O zosnulých III", "Kristus je spása a život",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on je spása sveta,<br>" +
                            "život ľudí a vzkriesenie mŕtvych.<br>" +
                            "Skrze neho sa ti klaňajú zástupy anjelov<br>" +
                            "a večne sa radujú pred tvojou tvárou.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne voláme na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"31", "O zosnulých IV", "Z pozemského života do nebeskej slávy",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo z tvojej vôle prichádzame na svet,<br>" +
                            "v tvojich rukách je náš život<br>" +
                            "a z tvojho príkazu sa musíme následkom hriechu<br>" +
                            "vrátiť do zeme, z ktorej sme vzatí.<br>" +
                            "Sme však vykúpení smrťou tvojho Syna,<br>" +
                            "nech sme teda na tvoj pokyn aj povýšení<br>" +
                            "do slávy jeho zmŕtvychvstania.<br>" +
                            "Preto ti so zástupmi anjelov a svätých<br>" +
                            "spievame pieseň chvály a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"31", "O zosnulých V", "O našom vzkriesení skrze Kristovo víťazstvo ",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo aj keď pre svoje skutky hynieme,<br>" +
                            "pomáhaš nám svojou láskou a milosťou.<br>" +
                            "Hoci sme pre hriech boli pohltení smrťou,<br>" +
                            "Kristus nás vykúpil svojím víťazstvom<br>" +
                            "a priviedol k novému životu.<br>" +
                            "Preto ťa tu na zemi<br>" +
                            "spolu s nebeskými zástupmi oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"21", "Vlastná prefácia - Sv. Ján Krstiteľ", "O poslaní Pánovho predchodcu",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo oslavujeme dielo tvojej milosti<br>" +
                            "v Kristovom predchodcovi, svätom Jánovi,<br>" +
                            "ktorého si spomedzi všetkých ľudí<br>" +
                            "zahrnul mimoriadnou priazňou.<br>" +
                            "On sa už v matkinom lone zaradoval<br>" +
                            "z prítomnosti Spasiteľa,<br>" +
                            "svojím narodením priniesol mnohým veľkú potechu<br>" +
                            "a ako jediný z prorokov ukázal na Baránka,<br>" +
                            "ktorý sníma hriechy sveta.<br>" +
                            "On pokrstil pôvodcu krstu vodou,<br>" +
                            "ktorá tým dostala posväcujúcu silu,<br>" +
                            "a vyliatím svojej krvi<br>" +
                            "vydal najväčšie svedectvo o Kristovi.<br>" +
                            "Preto ťa tu na zemi<br>" +
                            "spolu s nebeskými zástupmi oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"22", "Vlastná prefácia - Sv. Peter a Pavol", "O dvojakom poslaní svätých Petra a Pavla v Cirkvi",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo nás naplňuješ radosťou<br>" +
                            "z apoštolského diela svätých Petra a Pavla.<br>" +
                            "Jeden nás učí vyznávať vieru<br>" +
                            "a druhý nám objasňuje jej tajomstvá;<br>" +
                            "Peter zhromaždil prvotnú Cirkev zo synov Izraela,<br>" +
                            "Pavol sa stal učiteľom viery pre všetky národy,<br>" +
                            "a tak obaja, hoci odlišným spôsobom,<br>" +
                            "zhromažďovali jednu Kristovu rodinu.<br>" +
                            "My ich spoločne uctievame,<br>" +
                            "ako ty si oboch spoločne oslávil.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"23", "Vlastná prefácia - Sv. Cyril a Metod", "O našich svätých vierozvestoch",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo ty si nám<br>" +
                            "v našich vierozvestoch Cyrilovi a Metodovi<br>" +
                            "poslal učiteľov národa,<br>" +
                            "horlivých i múdrych ohlasovateľov evanjelia,<br>" +
                            "aby v našej krajine pri najsvätejšej obete<br>" +
                            "v reči ľudu zazneli modlitby a spevy<br>" +
                            "na tvoju chválu a slávu.<br>" +
                            "Ich príklad a slová nás povzbudzujú,<br>" +
                            "aby sme si zachovali dedičstvo otcov:<br>" +
                            "jednotu vo viere a vernosť i poslušnosť svätej Cirkvi.<br>" +
                            "Preto ťa spolu s anjelmi chválime<br>" +
                            "a radostne vyznávame:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"24", "Vlastná prefácia - Premenenie Pána", "O tajomstve premenenia",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on zjavil svoju slávu<br>" +
                            "pred vyvolenými svedkami,<br>" +
                            "keď svoje telo, podobné nášmu,<br>" +
                            "prežiaril nebeským jasom.<br>" +
                            "Tým posilnil vieru svojich učeníkov,<br>" +
                            "aby sa nepohoršili nad jeho smrťou na kríži,<br>" +
                            "a ukázal, že všetkých jeho verných očakáva sláva,<br>" +
                            "žiariaca z neho, ktorý je hlavou Cirkvi.<br>" +
                            "Preto ťa tu na zemi<br>" +
                            "spolu s nebeskými zástupmi oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"25", "Vlastná prefácia - Nanebovzatie Panny Márie", "O sláve Panny Márie vzatej do neba",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo dnešného dňa vzal si do neba<br>" +
                            "matku svojho Syna,<br>" +
                            "ktorá je prvotinou a obrazom oslávenej Cirkvi<br>" +
                            "a príčinou pevnej nádeje a potechy Božiemu ľudu<br>" +
                            "na jeho pozemskej púti.<br>" +
                            "Bolo správne, že si ju uchránil od porušenia v hrobe,<br>" +
                            "lebo z nej podivuhodným spôsobom vzal si telo<br>" +
                            "a narodil sa tvoj Syn, pôvodca života.<br>" +
                            "Preto ťa spolu s anjelskými chórmi chválime<br>" +
                            "a radostne vyznávame:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"26", "Vlastná prefácia - Povýšenie svätého kríža", "O víťazstve slávneho kríža",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo vykúpenie ľudstva<br>" +
                            "sa z tvojho rozhodnutia<br>" +
                            "uskutočnilo na dreve kríža.<br>" +
                            "Zo stromu v raji prišla na nás smrť,<br>" +
                            "zo stromu kríža dostali sme nový život.<br>" +
                            "Nepriateľ, ktorý nás v raji premohol,<br>" +
                            "na dreve kríža bol premožený<br>" +
                            "Kristom, naším Pánom.<br>" +
                            "Skrze neho tvoju velebu chvália anjeli,<br>" +
                            "klaňajú sa jej panstvá,<br>" +
                            "chvejú sa pred ňou mocnosti.<br>" +
                            "Nebesia a nebeské sily i blažení serafíni<br>" +
                            "ťa oslavujú spoločným plesaním.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď v pokornej úcte voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"27", "Vlastná prefácia - Sedembolestnej Panny Márie", "O patrónke slovenského národa",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "a v slávny deň prebolestnej Panny<br>" +
                            "spoločne ťa chváliť, velebiť a oslavovať.<br>" +
                            "Veď ona vždy preukazovala nášmu ľudu<br>" +
                            "útechu v utrpeniach a pomoc v nebezpečenstvách.<br>" +
                            "Ani teraz neprestáva orodovať za nás<br>" +
                            "a s materinskou láskou sa stará<br>" +
                            "o bratov a sestry svojho Syna.<br>" +
                            "Preto ju oslavujeme ako patrónku nášho národa<br>" +
                            "a uctievame ju ako našu nebeskú Matku.<br>" +
                            "Pod jej ochranou kráčame do nebeskej vlasti,<br>" +
                            "v ktorej si ju už oslávil pri svojom Synovi<br>" +
                            "Ježišovi Kristovi, našom Pánovi.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"28", "Vlastná prefácia - Výročie posviacky chrámu", "O tajomstve Cirkvi, ktorá je Kristovou nevestou a chrámom Ducha Svätého",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo prebývaš v svätom dome modlitby<br>" +
                            "ako štedrý darca,<br>" +
                            "aby si z nás ustavičným pôsobením svojej milosti<br>" +
                            "budoval chrám Ducha Svätého,<br>" +
                            "ktorého okrasou je náš príkladný život.<br>" +
                            "Veď rukou budovaný chrám predstavuje Cirkev,<br>" +
                            "ktorú neprestajne posväcuješ<br>" +
                            "ako Kristovu nevestu,<br>" +
                            "aby bola radostnou matkou mnohých detí<br>" +
                            "a došla s nimi do tvojej slávy v nebi.<br>" +
                            "Preto ťa so všetkými<br>" +
                            "anjelmi a svätými oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"29", "O preblahoslavenej Panne Marií II", "", ""},
            {"30", "Vlastná prefácia - Všetkých svätých", "O sláve nebeského mesta Jeruzalema",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo dnes oslavujeme nebeský Jeruzalem,<br>" +
                            "tvoje sväté mesto, našu večnú vlasť,<br>" +
                            "kde ti neprestajne spieva na chválu<br>" +
                            "plesajúci zástup našich svätých bratov a sestier.<br>" +
                            "Za nimi sa radostne ponáhľame<br>" +
                            "na našej pozemskej púti, vedení svetlom viery,<br>" +
                            "a tešíme sa z veľkej slávy<br>" +
                            "týchto vyvolených členov Cirkvi,<br>" +
                            "ktorých nám dávaš ako pomoc v našej slabosti<br>" +
                            "a vzor svätého života.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými zvelebujeme<br>" +
                            "a voláme na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"32", "Sv. Jozefa, robotníka", "O poslaní svätého Jozefa",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "a teba pri spomienke na svätého Jozefa<br>" +
                            "náležitými chválospevmi chváliť, velebiť a oslavovať.<br>" +
                            "Lebo si dal tohto spravodlivého muža<br>" +
                            "panenskej Bohorodičke za ženícha<br>" +
                            "a jeho, ako verného a múdreho služobníka,<br>" +
                            "ustanovil si za hlavu Svätej rodiny,<br>" +
                            "aby sa otcovsky staral o tvojho jednorodeného,<br>" +
                            "Duchom Svätým počatého Syna<br>" +
                            "Ježiša Krista, nášho Pána.<br>" +
                            "Skrze neho tvoju velebu chvália anjeli,<br>" +
                            "klaňajú sa jej panstvá, chvejú sa pred ňou mocnosti.<br>" +
                            "Nebesia a nebeské sily i blažení serafíni<br>" +
                            "ťa oslavujú spoločným plesaním.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď v pokornej úcte voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"33", "O apoštoloch I", "",""},
            {"34", "O apoštoloch II", "", ""},
            {"14", "O nanebovstúpení Pána I", "O tajomstve nanebovstúpenia",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo Pán Ježiš, Kráľ slávy,<br>" +
                            "víťaz nad hriechom a smrťou,<br>" +
                            "vystúpil <font color='#B71C1C'>(</font>dnes<font color='#B71C1C'>)</font> na nebesia za obdivu anjelov<br>" +
                            "ako prostredník medzi Bohom a ľuďmi,<br>" +
                            "ako sudca sveta a Pán mocností.<br>" +
                            "Vrátil sa k tebe, nie aby nás nechal<br>" +
                            "v našom biednom položení,<br>" +
                            "ale aby sme mali pevnú nádej,<br>" +
                            "že ho ako jeho tajomné telo<br>" +
                            "budeme nasledovať do nebeskej vlasti,<br>" +
                            "kam nás predišiel on, naša hlava,<br>" +
                            "a pôvodca našej spásy.<br>" +
                            "Preto ľudstvo po celom svete<br>" +
                            "plesá nesmiernou veľkonočnou radosťou,<br>" +
                            "ale aj anjelské zástupy<br>" +
                            "neprestajne spievajú chválospev na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"14", "O nanebovstúpení Pána II", "O tajomstve nanebovstúpenia",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on sa po svojom zmŕtvychvstaní<br>" +
                            "viditeľne zjavil všetkým svojim učeníkom<br>" +
                            "a pred ich očami vzniesol sa do neba,<br>" +
                            "aby nám dal účasť na svojom božskom živote.<br>" +
                            "Preto ľudstvo po celom svete<br>" +
                            "plesá nesmiernou veľkonočnou radosťou,<br>" +
                            "ale aj anjelské zástupy<br>" +
                            "neprestajne spievajú chválospev na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"35", "Vlastná prefácia - Zoslanie Ducha Svätého", "O tajomstve zoslania Ducha Svätého",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo na zavŕšenie veľkonočného tajomstva<br>" +
                            "zoslal si dnes Ducha Svätého na tých,<br>" +
                            "ktorých si vo svojom jednorodenom Synovi<br>" +
                            "prijal za svoje deti;<br>" +
                            "ten Duch Svätý na počiatku Cirkvi<br>" +
                            "zjavil všetkým národom pravého Boha<br>" +
                            "a rozmanité jazyky ľudskej rodiny združil<br>" +
                            "vo vyznávaní tej istej viery.<br>" +
                            "Preto ľudstvo po celom svete<br>" +
                            "plesá nesmiernou veľkonočnou radosťou,<br>" +
                            "ale aj anjelské zástupy<br>" +
                            "neprestajne spievajú chválospev na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"36", "Vlastná prefácia - Obetovanie Pána", "O tajomstve obetovania Pána v chráme",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo tvoj večný Syn<br>" +
                            "bol dnes obetovaný v chráme<br>" +
                            "a Duch Svätý ústami Simeona o ňom vyhlásil,<br>" +
                            "že bude slávou Izraela<br>" +
                            "a svetlom na osvietenie pohanov.<br>" +
                            "Preto sa s radosťou ponáhľame<br>" +
                            "v ústrety nášmu Spasiteľovi,<br>" +
                            "chválime ťa s anjelmi a svätými<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"37", "Sv. Márie Magdalény", "O apoštolke apoštolov",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vo všetkom oslavovať teba, všemohúci Otče,<br>" +
                            "lebo tvoje milosrdenstvo<br>" +
                            "nie je menšie ako tvoja moc,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "On sa zjavil v záhrade<br>" +
                            "a dal sa poznať Márii Magdaléne,<br>" +
                            "lebo ona ho milovala, kým žil,<br>" +
                            "videla ho na kríži, keď zomieral,<br>" +
                            "hľadala ho, keď ležal v hrobe,<br>" +
                            "a ako prvá sa mu klaňala, keď vstal z mŕtvych.<br>" +
                            "On ju ozdobil službou apoštola pre apoštolov,<br>" +
                            "aby sa dobrá zvesť o novom živote<br>" +
                            "rozšírila po celom svete.<br>" +
                            "Preto ťa aj my, Pane,<br>" +
                            "spolu so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a radostne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"38", "Vlastná prefácia - Zvestovanie Pána", "O tajomstve vtelenia",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo anjel z neba zvestoval Panne Márii,<br>" +
                            "že tvoj Syn sa pôsobením Ducha Svätého<br>" +
                            "narodí medzi ľuďmi a pre ľudí.<br>" +
                            "Ona s vierou prijala nebeské posolstvo<br>" +
                            "a s láskou nosila<br>" +
                            "v nepoškvrnenom lone Ježiša Krista,<br>" +
                            "aby splnil prisľúbenia dané synom Izraela<br>" +
                            "a naplnil očakávania národov.<br>" +
                            "Skrze neho klaňajú sa ti zástupy anjelov<br>" +
                            "a večne sa radujú pred tvojou tvárou.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne voláme na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"15", "O Duchu Svätom I", "Pán zoslal Ducha Svätého Cirkvi",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane, <br>" +
                            "svätý Otče, všemohúci a večný Bože, <br>" +
                            "skrze nášho Pána Ježiša Krista. <br>" +
                            "Lebo on vystúpil na nebesia, <br>" +
                            "zasadol po tvojej pravici<br>" +
                            "a zoslal prisľúbeného Ducha Svätého na deti, <br>" +
                            "ktoré si ty prijal za svoje. <br>" +
                            "Preto ťa teraz i po celú večnosť<br>" +
                            "spolu so všetkými zástupmi anjelov<br>" +
                            "nábožne oslavujeme a voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"15", "O Duchu Svätom II", "O pôsobení Ducha Svätého v Cirkvi",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné <br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane, <br>" +
                            "svätý Otče, všemohúci a večný Bože. <br>" +
                            "Lebo ty dávaš svojej Cirkvi<br>" +
                            "milosti primerané každej dobe<br>" +
                            "a obdivuhodne ju spravuješ a chrániš. <br>" +
                            "Veď darmi Ducha Svätého ju tak posilňuješ<br>" +
                            "a ustavične naplňuješ dôverou, <br>" +
                            "že ani v zármutku ťa neprestáva prosiť, <br>" +
                            "ani uprostred radostí ti nezabúda ďakovať<br>" +
                            "skrze nášho Pána Ježiša Krista. <br>" +
                            "Preto ťa spolu s anjelskými chórmi chválime<br>" +
                            "a radostne vyznávame:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"39", "O preblahoslavenej Panne Márii", "O Panne Márii, ktorá je vzorom a Matkou Cirkvi",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "a pri oslave preblahoslavenej Panny Márie<br>" +
                            "zvelebovať ťa dôstojným chválospevom.<br>" +
                            "Ona prijala do nepoškvrneného srdca večné Slovo,<br>" +
                            "v panenskom lone ho počala,<br>" +
                            "porodila Stvoriteľa sveta,<br>" +
                            "a tak pripravila zrodenie Cirkvi.<br>" +
                            "Pod krížom prevzala odkaz Božej lásky<br>" +
                            "a za svoje deti prijala všetkých ľudí,<br>" +
                            "ktorých Kristova smrť znovuzrodila pre večný život.<br>" +
                            "S apoštolmi očakávala prisľúbeného Ducha Svätého,<br>" +
                            "svoje prosby spájala s modlitbami učeníkov<br>" +
                            "a stala sa vzorom modliacej sa Cirkvi.<br>" +
                            "Napokon bola vzatá do nebeskej slávy,<br>" +
                            "s materskou láskou sprevádza putujúcu Cirkev<br>" +
                            "a starostlivo ju chráni na ceste do večnej vlasti,<br>" +
                            "kým nenadíde slávny deň Pánov.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"40", "Vlastná prefácia - Nášho Pána Ježiša Krista", "O kňazstve Krista a Cirkvi",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo ty si svojho jednorodeného Syna<br>" +
                            "pomazal Duchom Svätým,<br>" +
                            "ustanovil si ho za veľkňaza novej a večnej zmluvy<br>" +
                            "a milostivo si rozhodol, že jeho jediné kňazstvo<br>" +
                            "bude neprestajne trvať v tvojej Cirkvi.<br>" +
                            "Veď Kristus nielen povýšil<br>" +
                            "tvoj vykúpený ľud na kráľovské kňazstvo,<br>" +
                            "ale s láskou brata povoláva si z neho učeníkov<br>" +
                            "a vkladaním rúk im dáva účasť<br>" +
                            "na svojej posvätnej službe.<br>" +
                            "V jeho mene obnovujú obetu nášho vykúpenia<br>" +
                            "a rodine tvojich veriacich<br>" +
                            "pripravujú veľkonočnú hostinu.<br>" +
                            "S opravdivou láskou slúžia tvojmu ľudu,<br>" +
                            "živia ho tvojím slovom a posväcujú sviatosťami.<br>" +
                            "Zasvätiac svoj život tebe a spáse svojich bratov,<br>" +
                            "majú sa pripodobňovať Ježišovi Kristovi<br>" +
                            "a tebe stále dosvedčovať vernosť a lásku.<br>" +
                            "Preto ťa aj my, Pane,<br>" +
                            "spolu so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a radostne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"41", "Vlastná prefácia - Najsvätejšej Trojice", "O tajomstve Najsvätejšej Trojice",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo ty so svojím jednorodeným Synom<br>" +
                            "a Duchom Svätým<br>" +
                            "si jeden Boh, si jeden Pán:<br>" +
                            "nie ako jediná osoba,<br>" +
                            "ale ako Trojica osôb jedinej podstaty.<br>" +
                            "A čo podľa tvojho zjavenia veríme o tvojej sláve,<br>" +
                            "to isté bez rozdielu vyznávame<br>" +
                            "aj o tvojom Synovi, aj o Duchu Svätom.<br>" +
                            "A keď vyznávame pravého a večného Boha,<br>" +
                            "klaniame sa trom božským osobám<br>" +
                            "jedinej podstaty a rovnakej veleby.<br>" +
                            "Pre túto velebu ťa oslavujú anjeli,<br>" +
                            "archanjeli, cherubíni a serafíni,<br>" +
                            "ktorí neprestajne spievajú<br>" +
                            "a jedným hlasom volajú:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"42", "Vlastná prefácia - Najsvätejšieho Srdca Ježišovho", "O nesmiernej Kristovej láske",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on sa s nesmiernou láskou obetoval za nás,<br>" +
                            "keď sa nechal pozdvihnúť na kríž.<br>" +
                            "Z jeho otvoreného boku vyšla krv a voda,<br>" +
                            "z neho pramenia aj sviatosti Cirkvi.<br>" +
                            "Spasiteľovo otvorené Srdce priťahuje všetkých,<br>" +
                            "aby s radosťou čerpali z prameňov spásy.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"43", "Vlastná prefácia - Nedeľa nášho Pána Ježiša Krista, Kráľa neba i zeme", "O Kristovi – Kráľovi neba i zeme",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo ty si svojho jednorodeného Syna,<br>" +
                            "nášho Pána Ježiša Krista, pomazal olejom veleby<br>" +
                            "za večného kňaza a kráľa neba i zeme,<br>" +
                            "aby na oltári kríža obetoval sám seba<br>" +
                            "ako zmiernu obetu bez poškvrny,<br>" +
                            "a tak zavŕšil tajomstvá vykúpenia ľudstva;<br>" +
                            "aby podrobil svojej vláde celé stvorenie<br>" +
                            "a odovzdal ho tvojej nesmiernej velebnosti<br>" +
                            "ako večné a vesmírne kráľovstvo<br>" +
                            "– kráľovstvo pravdy a života,<br>" +
                            "kráľovstvo svätosti a milosti,<br>" +
                            "kráľovstvo spravodlivosti, lásky a pokoja.<br>" +
                            "Preto s anjelmi aj archanjelmi, s trónmi a panstvami<br>" +
                            "a so všetkými nebeskými zástupmi<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"44", "Vlastná prefácia - Nepoškvrnené počatie Panny Márie","O tajomstve Panny Márie a Cirkvi",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Ty si uchránil preblahoslavenú Pannu Máriu<br>" +
                            "od poškvrny dedičného hriechu<br>" +
                            "a naplnil si ju svojou milosťou,<br>" +
                            "aby bola dôstojnou matkou tvojho Syna<br>" +
                            "a počiatkom i obrazom Cirkvi,<br>" +
                            "jeho krásnej nevesty bez vrásky a poškvrny.<br>" +
                            "Lebo z nepoškvrnenej Panny<br>" +
                            "mal sa narodiť Kristus,<br>" +
                            "nevinný Baránok, ktorý sníma naše viny;<br>" +
                            "ty si ju vyvolil, aby tvojmu ľudu<br>" +
                            "vyprosovala milosti<br>" +
                            "a bola mu príkladom svätosti.<br>" +
                            "Preto ťa spolu s anjelskými chórmi chválime<br>" +
                            "a radostne vyznávame:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"45", "O zjavení Pána", "O Kristovi – svetle národov",
            "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                    "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                    "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                    "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                    "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                    "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                    "svätý Otče, všemohúci a večný Bože.<br>" +
                    "Lebo dnes si na osvietenie národov<br>" +
                    "odhalil tajomstvo našej spásy v Kristovi,<br>" +
                    "a keď sa on zjavil v našej smrteľnej prirodzenosti,<br>" +
                    "obnovil si nás slávou jeho nesmrteľnosti.<br>" +
                    "Preto s anjelmi aj archanjelmi, s trónmi a panstvami<br>" +
                    "a so všetkými nebeskými zástupmi<br>" +
                    "spievame chválospev na tvoju slávu<br>" +
                    "a neprestajne voláme:<br><br>" +
                    "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                    "Plné sú, nebesia i zem tvojej slávy.<br>" +
                    "Hosana na výsostiach!<br>" +
                    "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                    "Hosana na výsostiach!"},
            {"46", "Vlastná prefácia - Krst Krista Pána", "O Pánovom krste",
            "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                    "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                    "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                    "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                    "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                    "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                    "svätý Otče, všemohúci a večný Bože.<br>" +
                    "Lebo vo vodách Jordánu<br>" +
                    "si podivuhodnými znameniami zjavil nový krst:<br>" +
                    "hlasom z neba si dosvedčil,<br>" +
                    "že tvoje večné Slovo prebýva medzi nami;<br>" +
                    "Duchom Svätým, ktorý zostúpil v podobe holubice,<br>" +
                    "pomazal si Krista, svojho Sluhu, olejom radosti<br>" +
                    "a poslal si ho ohlasovať chudobným spásu.<br>" +
                    "Preto ťa tu na zemi spolu s nebeskými zástupmi<br>" +
                    "oslavujeme a bez prestania voláme:<br><br>" +
                    "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                    "Plné sú, nebesia i zem tvojej slávy.<br>" +
                    "Hosana na výsostiach!<br>" +
                    "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                    "Hosana na výsostiach!"},
            {"47", "O preblahoslavenej Panne Marií I", "", ""},
            {"48a", "Vlastná prefácia - Preblahoslavená Panna Mária vyvolený potomok Izraela",
                    "Svätá Mária, Adamova dcéra, Abrahámovo potomstvo, ratolesť Jesseho",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo ty si ustanovil blahoslavenú Pannu Máriu<br>" +
                            "za vrchol Izraela a počiatok Cirkvi,<br>" +
                            "aby všetkým ľuďom bolo známe,<br>" +
                            "že spása prichádza z Izraela<br>" +
                            "a tvoja nová rodina vzíde z vyvoleného kmeňa.<br>" +
                            "Veď ona je podľa pôvodu Adamovou dcérou,<br>" +
                            "ktorá napravila vinu matky Evy svojou nevinnosťou;<br>" +
                            "podľa viery je Abrahámovým potomstvom,<br>" +
                            "lebo vierou počala;<br>" +
                            "podľa rodu je ratolesťou z koreňa Jesseho,<br>" +
                            "z ktorej vzišiel výhonok Ježiš Kristus, náš Pán.<br>" +
                            "Skrze neho klaňajú sa ti zástupy anjelov<br>" +
                            "a večne sa radujú v tvojej prítomnosti.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne voláme na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"48b", "Vlastná prefácia - Preblahoslavená Panna Mária pri Zvestovaní Pána",
                    "Preblahoslavená Panna s dôverou počúvala nebeského posla",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo anjel z neba zvestoval Panne Márii,<br>" +
                            "že tvoj Syn sa pôsobením Ducha Svätého stane človekom,<br>" +
                            "aby spasil všetkých ľudí.<br>" +
                            "Ona s vierou prijala nebeské posolstvo<br>" +
                            "a s láskou nosila v nepoškvrnenom lone Ježiša Krista,<br>" +
                            "ktorý splnil prisľúbenia dané vyvolenému ľudu<br>" +
                            "a zjavil sa svetu ako očakávaný Vykupiteľ,<br>" +
                            "Skrze neho klaňajú sa ti zástupy anjelov<br>" +
                            "a večne sa radujú z tvojej prítomnosti.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne voláme na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý Pán Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"48c", "Vlastná prefácia - Navštívenie Preblahoslavenej Panny Márie", "Svätá Mária je blahoslavená pre vieru v prisľúbenú spásu",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo ty nám prorockými slovami Alžbety<br>" +
                            "prednesenými z vnuknutia Ducha<br>" +
                            "zjavuješ vznešenú úlohu presvätej Márie Panny.<br>" +
                            "Právom ju pre vieru v prisľúbenú spásu<br>" +
                            "matka Predchodcu pozdravuje ako blahoslavenú<br>" +
                            "a v službe lásky nazýva matkou Pána.<br>" +
                            "Preto sa s plesaním pripájame<br>" +
                            "k chválospevu Bohorodičky Panny,<br>" +
                            "ponížene chválime tvoju velebu<br>" +
                            "a so zástupmi anjelov a svätých neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"49", "Vlastná prefácia - Za jednotu kresťanov", "O jednote Kristovho tela, ktorým je Cirkev",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo skrze neho si nás priviedol<br>" +
                            "k poznaniu svojej pravdy,<br>" +
                            "aby sme sa zväzkom<br>" +
                            "jednej viery a jedného krstu<br>" +
                            "stali jeho tajomným telom.<br>" +
                            "Skrze neho si všetkým národom<br>" +
                            "daroval svojho Svätého Ducha,<br>" +
                            "ktorý rozmanitými darmi<br>" +
                            "tajomne účinkuje a tvorí jednotu,<br>" +
                            "prebýva v ľuďoch,<br>" +
                            "ktorých si ty prijal za svoje deti,<br>" +
                            "a posväcuje i spravuje celú Cirkev.<br>" +
                            "Preto ťa spolu s anjelskými chórmi chválime<br>" +
                            "a radostne vyznávame:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},

            //omse za zmierenie
            {"1z", "Za jednotu kresťanov", "O jednote Kristovho tela, ktorým je Cirkev",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo skrze neho si nás priviedol<br>" +
                            "k poznaniu svojej pravdy,<br>" +
                            "aby sme sa zväzkom<br>" +
                            "jednej viery a jedného krstu<br>" +
                            "stali jeho tajomným telom.<br>" +
                            "Skrze neho si všetkým národom<br>" +
                            "daroval svojho Svätého Ducha,<br>" +
                            "ktorý rozmanitými darmi<br>" +
                            "tajomne účinkuje a tvorí jednotu,<br>" +
                            "prebýva v ľuďoch,<br>" +
                            "ktorých si ty prijal za svoje deti,<br>" +
                            "a posväcuje i spravuje celú Cirkev.<br>" +
                            "Preto ťa spolu s anjelskými chórmi chválime<br>" +
                            "a radostne vyznávame:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
            {"2z", "O víťazstve slávneho kríža", "O víťazstve slávneho kríža",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>R.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo vykúpenie ľudstva<br>" +
                            "sa z tvojho rozhodnutia<br>" +
                            "uskutočnilo na dreve kríža.<br>" +
                            "Zo stromu v raji prišla na nás smrť,<br>" +
                            "zo stromu kríža dostali sme nový život.<br>" +
                            "Nepriateľ, ktorý nás v raji premohol,<br>" +
                            "na dreve kríža bol premožený<br>" +
                            "Kristom, naším Pánom.<br>" +
                            "Skrze neho tvoju velebu chvália anjeli,<br>" +
                            "klaňajú sa jej panstvá,<br>" +
                            "chvejú sa pred ňou mocnosti.<br>" +
                            "Nebesia a nebeské sily i blažení serafíni<br>" +
                            "ťa oslavujú spoločným plesaním.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď v pokornej úcte voláme:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},


            {"", "Vlastná prefácia - 2. eucharistická modlitba", "",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                    "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                    "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                    "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                    "vzdávať vďaky vždy a všade tebe, svätý Otče,<br>" +
                    "skrze tvojho milovaného Syna Ježiša Krista.<br>" +
                    "On je tvoje Slovo, skrze ktoré si všetko stvoril,<br>" +
                    "jeho si nám poslal za Spasiteľa a Vykupiteľa.<br>" +
                    "Mocou Ducha Svätého sa stal človekom<br>" +
                    "a narodil sa z Panny.<br>" +
                    "Aby splnil tvoju vôľu a získal ti svätý ľud,<br>" +
                    "rozpäl ruky na kríži, zomrel za nás,<br>" +
                    "a tak zlomil moc smrti a zjavil vzkriesenie.<br>" +
                    "Preto s anjelmi a so všetkými svätými<br>" +
                    "hlásame tvoju slávu a jedným hlasom voláme:<br><br>" +
                    "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                    "Plné sú, nebesia i zem tvojej slávy.<br>" +
                    "Hosana na výsostiach!<br>" +
                    "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                    "Hosana na výsostiach!"},
            {"", "Vlastná prefácia - 4. eucharistická modlitba", "",
                    "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné<br>" +
                            "vzdávať vďaky tebe, svätý Otče,<br>" +
                            "a je správne oslavovať teba,<br>" +
                            "lebo ty jediný si Boh živý a pravý;<br>" +
                            "ty si pred vekmi a zostávaš naveky<br>" +
                            "a bývaš v neprístupnom svetle.<br>" +
                            "Ty jediný si dobrý,<br>" +
                            "ty, prameň života, stvoril si všetko,<br>" +
                            "aby si svoje stvorenia<br>" +
                            "bohato obdaril požehnaním<br>" +
                            "a mnohé z nich oblažil jasom svojho svetla.<br>" +
                            "Preto stoja pred tebou<br>" +
                            "nespočetné zástupy anjelov,<br>" +
                            "ktorí ti slúžia vo dne v noci,<br>" +
                            "hľadia na velebu tvojej tváre<br>" +
                            "a neprestajne ťa oslavujú.<br>" +
                            "S nimi aj my, a našimi ústami<br>" +
                            "všetko tvorstvo pod nebom,<br>" +
                            "velebíme tvoje meno a spievame:<br><br>" +
                            "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                            "Hosana na výsostiach!"},
    };

    String[] prefacie_EM_zmierenie = {
            "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                    "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                    "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                    "Je naozaj dôstojné a správne,<br>" +
                    "aby sme vždy vzdávali vďaky tebe, Pane,<br>" +
                    "svätý Otče, všemohúci a večný Bože.<br>" +
                    "Lebo ty nás neprestajne pozývaš<br>" +
                    "k stále plnšiemu životu.<br>" +
                    "A pretože si bohatý na milosrdenstvo,<br>" +
                    "všetkým ponúkaš zmierenie a hriešnikov vyzývaš,<br>" +
                    "aby dôverovali len tvojmu odpusteniu.<br>" +
                    "Neodvrátil si sa od nás,<br>" +
                    "keď sme veľa ráz porušili tvoju zmluvu,<br>" +
                    "ale skrze Ježiša Krista,<br>" +
                    "tvojho Syna a nášho Vykupiteľa,<br>" +
                    "spojil si so sebou ľudskú rodinu novým putom lásky,<br>" +
                    "ktoré nijaká moc nemôže rozlomiť.<br>" +
                    "Keď teraz tvoj ľud prežíva čas milosti i zmierenia<br>" +
                    "a obracia svoje srdcia k tebe,<br>" +
                    "ty mu dávaš nádej v Ježišovi Kristovi<br>" +
                    "a pomáhaš mu, aby slúžil všetkým ľuďom <br>" +
                    "a ochotnejšie sa zveril<br>" +
                    "vedeniu Ducha Svätého.<br>" +
                    "Preto s obdivom zvelebujeme silu tvojej lásky,<br>" +
                    "radujeme sa z našej spásy,<br>" +
                    "s nespočetnými nebeskými zástupmi ťa chválime<br>" +
                    "a bez prestania voláme:<br><br>" +
                    "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                    "Plné sú, nebesia i zem tvojej slávy.<br>" +
                    "Hosana na výsostiach!<br>" +
                    "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                    "Hosana na výsostiach!",
            "<font color='#B71C1C'>V.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>R.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                    "<font color='#B71C1C'>R.:</font> Máme ich u Pána.<br>" +
                    "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                    "Je naozaj dôstojné a správne,<br>" +
                    "aby sme ti vzdávali vďaky a oslavovali ťa, Bože,<br>" +
                    "všemohúci Otče, za všetko, čo konáš vo svete,<br>" +
                    "skrze nášho Pána Ježiša Krista.<br>" +
                    "Lebo hoci je ľudská rodina rozdelená<br>" +
                    "nezhodami a nesvornosťou,<br>" +
                    "skusujeme, že ty nabádaš ľudí,<br>" +
                    "aby boli ochotní zmieriť sa.<br>" +
                    "Veď skrze svojho Ducha pohýnaš srdcia ľudí,<br>" +
                    "aby nepriatelia obnovili priateľské vzťahy,<br>" +
                    "aby si protivníci podali ruky<br>" +
                    "a národy hľadali cestu svornosti.<br>" +
                    "Vďaka tvojmu mocnému pôsobeniu, Pane,<br>" +
                    "láska víťazí nad nenávisťou,<br>" +
                    "túžba po pomste sa pretvára na odpustenie<br>" +
                    "a nesvornosť sa mení na vzájomnú lásku.<br>" +
                    "Preto s nebeskými zástupmi,<br>" +
                    "ktoré ti neprestajne vzdávajú vďaky,<br>" +
                    "aj my na zemi bez prestania voláme:<br><br>" +
                    "Svätý, svätý, svätý Pán, Boh všetkých svetov.<br>" +
                    "Plné sú, nebesia i zem tvojej slávy.<br>" +
                    "Hosana na výsostiach!<br>" +
                    "Požehnaný, ktorý prichádza v mene Pánovom!<br>" +
                    "Hosana na výsostiach!"
};
}


