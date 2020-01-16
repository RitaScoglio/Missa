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
6 – O svätom Jozefovi
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
32 - Výročie posviacky chrámov, ktorých deň posviacky nie je známy
33 - Katedra sv. Petra, Obrátenie sv.Pavla (apostoloch I.)
34 - Sv. Marka (apostoloch II.)
35 - Zoslanie Ducha Svätého
36 - Obetovanie Pána
37 - Sv.Cyrila a Metoda
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
            {"6gkp", "14"},
            {"7gkp", "41"},
            {"1op", "15"},
            {"2p", "39"},
            {"3gp", "40"},
            {"4p", "4"},
            {"8gkp", "43"},
            {"9gkp", "44"},
            {"10gkp", "17"},
            {"11gkp", "46"},
    };

    String[][] prefacia1 = {
            {"003", "4"},
            {"01gk", "47"},
            {"02a", "17", "8", "10"},
            {"03a", "17"},
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
            {"003", "4"},
            {"02g", "36"},
            {"03a", "2", "8", "9", "10"},
            {"03b", "2", "8", "10"},
            {"05", "2", "8", "9", "11"},
            {"06", "2", "8", "9"},
            {"08a", "2", "8"},
            {"08b", "2", "8", "11"},
            {"10", "2", "8", "11"},
            {"11", "4"},
            {"14o", "37", "8"},
            {"14g+", "37"},
            {"17", "2", "8", "11"},
            {"21", "2", "8", "10"},
            {"22g", "33"},
            {"23", "2", "8", "9", "10"},
    };

    String[][] prefacia3 = {
            {"003", "4"},
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
            {"003", "4"},
            {"01", "6"},
            {"02", "2", "8", "10"},
            {"03g", "7"},
            {"04", "2", "8", "9"},
            {"11", "2", "8", "9"},
            {"12a", "2", "8", "9"},
            {"12b", "2", "8", "9"},
            {"13", "4"},
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
            {"003", "4"},
            {"01", "2", "8", "9"},
            {"02", "2", "8", "9"},
            {"03", "2", "8", "9"},
            {"05", "2", "8", "9", "10"},
            {"06", "2", "8", "10", "11"},
            {"09", "2", "8", "10"},
            {"11", "7"},
            {"13", "2", "8", "10", "11"},
            {"13gv", "28"},
            {"16", "2", "8", "9"},
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
            {"003", "4"},
            {"02g", "29"},
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
            {"16", "4"},
            {"17", "2", "8", "11"},
            {"17g", "8", "11"},
            {"17gk", "8", "11"},
            {"20", "2", "8", "9", "10"},
            {"21", "2", "8", "10"},
            {"22g", "8"},
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
            {"003", "4"},
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
            {"14gk", "25"},
            {"15gk", "25"},
            {"16", "2", "8"},
            {"18", "2", "8"},
            {"19", "2", "8", "10", "11"},
            {"20", "2", "8", "10", "11"},
            {"21", "2", "8", "10"},
            {"22", "4"},
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
            {"003", "4"},
            {"03", "2", "8", "10"},
            {"06gv", "28"},
            {"07", "2", "8", "9"},
            {"08g", "4"},
            {"09", "2", "8", "10"},
            {"12", "4"},
            {"13", "2", "8", "10"},
            {"14gn", "26"},
            {"15gk", "27"},
            {"16", "2", "8", "11"},
            {"17", "2", "8", "10"},
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
            {"003", "4"},
            {"01", "2", "8", "11"},
            {"02", "5"},
            {"04", "2", "8", "11"},
            {"05", "2", "8", "11"},
            {"06", "2", "8", "10", "11"},
            {"07", "4"},
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
            {"26gk+", "32"},
            {"27gv", "28"},
            {"28g", "7"},
            {"31gk", "30"},
    };
    String[][] prefacia11 = {
            {"003", "4"},
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
            {"21", "4"},
            {"22", "2", "8", "11"},
            {"23a", "2", "8", "9", "10"},
            {"23b", "2", "8", "11"},
            {"24", "2", "8", "9"},
            {"25", "2", "8", "11"},
            {"30g", "7"},
    };

    //adventna prefacia sa nastavuje priamo vo funkcii
    String[][] prefacia12 = {
            //{"003", "4", "48"}, - nastavene priamo vo funkcii
            {"03", "8", "10"},
            {"03g", "10"},
            {"04a", "8", "10"},
            {"04b", "8", "9", "11"},
            {"06", "8", "10"},
            {"07", "8", "10"},
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
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on nás veľkonočným tajomstvom<br>" +
                            "zázračne vyslobodil z jarma hriechu a smrti<br>" +
                            "a povolal nás k sláve,<br>" +
                            "aby sme sa už teraz menovali vyvoleným pokolením,<br>" +
                            "kráľovským kňazstvom,<br>" +
                            "svätým národom a jeho získaným ľudom.<br>" +
                            "A preto všade ohlasujeme tvoju moc a silu,<br>" +
                            "ktorou si nás vyviedol z temnôt<br>" +
                            "do svojho predivného svetla.<br>" +
                            "Preto s anjelmi, archanjelmi<br>" +
                            "a so zástupmi všetkých svätých<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"1", "Nedeľná II", "O tajomstve spásy",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on sa zľutoval nad hriešnym ľudstvom,<br>" +
                            "ponížil sa a narodil sa z Panny.<br>" +
                            "Trpel na kríži<br>" +
                            "a oslobodil nás od večnej smrti,<br>" +
                            "vstal z mŕtvych<br>" +
                            "a daroval nám večný život.<br>" +
                            "Preto s anjelmi, archanjelmi<br>" +
                            "a so zástupmi všetkých svätých<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"1", "Nedeľná III", "O vykúpení človeka človekom",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo tvoja nesmierna veľkosť sa prejavila v tom,<br>" +
                            "že si svojou božskou mocou<br>" +
                            "prišiel spasiť ľudstvo;<br>" +
                            "skrze svojho Syna, ktorý sa stal človekom,<br>" +
                            "oslobodil si človeka od večnej smrti,<br>" +
                            "a tak všetkým, ktorých zahubil hriech,<br>" +
                            "vrátil si život smrťou nášho Pána Ježiša Krista.<br>" +
                            "Skrze neho klaňajú sa ti zástupy anjelov<br>" +
                            "a večne sa radujú v tvojej prítomnosti.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne voláme na tvoju slávu:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"1", "Nedeľná IV", "O dejinách spásy",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on svojím narodením<br>" +
                            "priniesol ľudstvu nový život,<br>" +
                            "svojím utrpením<br>" +
                            "zničil naše hriechy,<br>" +
                            "svojím zmŕtvychvstaním<br>" +
                            "pripravil nám cestu do večného života<br>" +
                            "a svojím nanebovstúpením<br>" +
                            "otvoril nám brány neba.<br>" +
                            "Preto so zástupmi anjelov a svätých<br>" +
                            "z celej duše spievame chválospev na tvoju slávu:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"1", "Nedeľná V", "O diele stvorenia",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo od teba pochádzajú všetky živly sveta<br>" +
                            "a pravidelné premeny času.<br>" +
                            "Človeka si stvoril na svoj obraz,<br>" +
                            "podriadil si mu vesmír a všetky jeho divy,<br>" +
                            "aby v tvojom mene vládol nad všetkým tvorstvom<br>" +
                            "a nadchnutý krásou tvojho diela<br>" +
                            "ustavične ťa chválil skrze nášho Pána Ježiša Krista.<br>" +
                            "Preto ťa oslavujeme<br>" +
                            "a so všetkými anjelmi chválime<br>" +
                            "a radostne voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"1", "Nedeľná VI", "O prvotinách Ducha, ktoré sú záloh večnej slávy",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo v tebe žijeme, hýbeme sa a sme<br>" +
                            "a už v tomto pozemskom putovaní<br>" +
                            "neprestajne pociťujeme prejavy tvojej lásky<br>" +
                            "a nosíme v sebe záloh večného života.<br>" +
                            "Dostali sme totiž prvotiny Ducha Svätého,<br>" +
                            "ktorý Ježiša vzkriesil z mŕtvych,<br>" +
                            "a preto dúfame,<br>" +
                            "že vo večnosti budeme mať plnú účasť<br>" +
                            "na jeho veľkonočnom tajomstve.<br>" +
                            "Preto ťa oslavujeme<br>" +
                            "a so všetkými anjelmi chválime<br>" +
                            "a radostne voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"1", "Nedeľná VII", "O spáse skrze Kristovu poslušnosť",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo si tak súcitne miloval svet,<br>" +
                            "že si nám dal svojho Syna za Spasiteľa,<br>" +
                            "ktorý nám bol podobný vo všetkom<br>" +
                            "okrem hriechu,<br>" +
                            "aby si aj v nás mohol milovať,<br>" +
                            "čo si si obľúbil vo svojom Synovi.<br>" +
                            "Veď pre jeho poslušnosť<br>" +
                            "navrátil si nám svoje dary,<br>" +
                            "ktoré sme stratili<br>" +
                            "neposlušnosťou voči tebe.<br>" +
                            "Preto sa pripájame k zástupom anjelov a svätých<br>" +
                            "a radostne spievame na tvoju chválu:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"1", "Nedeľná VIII", "Cirkvi, zjednotenej podľa vzoru Najsvätejšej Trojice",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo krvou svojho Syna<br>" +
                            "a mocou Ducha Svätého<br>" +
                            "znovu si zjednotil okolo seba svoje deti,<br>" +
                            "ktoré hriech od teba odlúčil.<br>" +
                            "A tak tvoj ľud,<br>" +
                            "zjednotený podľa vzoru Najsvätejšej Trojice,<br>" +
                            "tvorí Cirkev, Kristovo tajomné telo,<br>" +
                            "a je chrámom Ducha Svätého<br>" +
                            "na slávu tvojej múdrosti a lásky.<br>" +
                            "Preto ťa spolu s anjelmi chválime<br>" +
                            "a radostne vyznávame:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"2", "Spoločná I", "O obnovení sveta v Kristovi",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo v ňom si obnovil celé stvorenie<br>" +
                            "a z jeho plnosti dal si podiel nám všetkým.<br>" +
                            "On, hoci mal božskú prirodzenosť, uponížil sa<br>" +
                            "a krvou vyliatou na kríži<br>" +
                            "zaslúžil svetu zmierenie a pokoj.<br>" +
                            "Preto bol povýšený nad každé stvorenie<br>" +
                            "a stal sa žriedlom večnej spásy pre všetkých,<br>" +
                            "ktorí zachovávajú jeho slová.<br>" +
                            "Preto s anjelmi, archanjelmi<br>" +
                            "a so zástupmi všetkých svätých<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"2", "Spoločná II", "O spáse skrze Krista",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne vzdávať ti vďaky,<br>" +
                            "tebe stále dobrorečiť a teba chváliť,<br>" +
                            "všemohúci a večný Bože.<br>" +
                            "Lebo vo svojej dobrote si stvoril človeka<br>" +
                            "a keď na seba pritiahol tvoj spravodlivý trest,<br>" +
                            "vo svojom milosrdenstve si ho vykúpil<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Skrze neho tvoju velebu chvália anjeli,<br>" +
                            "klaňajú sa ti všetky nebeské zástupy,<br>" +
                            "i blažení serafíni ťa oslavujú spoločným plesaním.<br>" +
                            "Prosíme, dovoľ i nám,<br>" +
                            "aby sme ťa s nimi<br>" +
                            "v pokornej úcte chválili:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"2", "Spoločná III", "Oslava Boha za stvorenie a vykúpenie človeka",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne,<br>" +
                            "aby sme vždy vzdávali vďaky tebe, milosrdný Otče,<br>" +
                            "všemohúci Bože, Kráľ večnej slávy,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "On je tvoje Slovo,<br>" +
                            "skrze ktoré si stvoril človeka ;<br>" +
                            "on je tvoj milovaný Syn,<br>" +
                            "skrze ktorého si nás vykúpil.<br>" +
                            "Teda právom ti slúži všetko stvorenie,<br>" +
                            "chvália ťa všetci vykúpení<br>" +
                            "a tvoji svätí ti dobrorečia.<br>" +
                            "Preto aj my ťa spolu s anjelmi oslavujeme<br>" +
                            "a radostne vyznávame:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"2", "Spoločná IV", "Chváliť Boha je Božím darom",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo hoci ty nepotrebuješ našu oslavu,<br>" +
                            "predsa prijímaš naše vďaky,<br>" +
                            "pretože nás nesmierne miluješ.<br>" +
                            "Naše chvály nepridávajú nič k tvojej veľkosti,<br>" +
                            "ale nám prispievajú k spáse<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Preto ťa spolu s anjelmi chválime<br>" +
                            "a radostne vyznávame:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"2", "Spoločná V", "Ohlasovanie Kristovho tajomstva",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne,<br>" +
                            "dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo s vďačnou láskou slávime jeho umučenie,<br>" +
                            "so živou vierou vyznávame jeho zmŕtvychvstanie<br>" +
                            "a s pevnou nádejou očakávame jeho slávny príchod.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a bez prestania voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"2", "Spoločná VI", "O tajomstve spásy v Kristovi",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, svätý Otče,<br>" +
                            "skrze tvojho milovaného Syna Ježiša Krista.<br>" +
                            "On je tvoje Slovo,<br>" +
                            "skrze ktoré si všetko stvoril,<br>" +
                            "jeho si nám poslal za Spasiteľa a Vykupiteľa.<br>" +
                            "Mocou Ducha Svätého stal sa človekom<br>" +
                            "a narodil sa z Márie Panny.<br>" +
                            "Aby splnil tvoju vôľu a získal ti ľud svätý,<br>" +
                            "rozpäl ruky na kríži,<br>" +
                            "zomrel za nás,<br>" +
                            "a tak zlomil moc smrti a zjavil vzkriesenie.<br>" +
                            "Preto s anjelmi a so všetkými svätými<br>" +
                            "hlásame tvoju slávu<br>" +
                            "a jedným hlasom voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"12", "Pôstna I", "O duchovnom význame pôstnej doby",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo ty milostivo umožňuješ svojim veriacim,<br>" +
                            "aby každoročne s očisteným srdcom a s radosťou<br>" +
                            "očakávali veľkonočné sviatky,<br>" +
                            "horlivejšie konali nábožné úkony<br>" +
                            "a skutky dobročinnej lásky,<br>" +
                            "hlbšie prežívali tajomstvo svojho znovuzrodenia,<br>" +
                            "a tak dosiahli plnosť milosti Božích detí.<br>" +
                            "Preto s anjelmi, archanjelmi<br>" +
                            "a so zástupmi všetkých svätých<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"12", "Pôstna II", "O duchovnom pokání",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo ty si nám určil tento posvätný čas<br>" +
                            "na duchovnú obnovu,<br>" +
                            "aby sme si očistili srdce od nezriadených žiadostí<br>" +
                            "a uprostred pozemských starostí<br>" +
                            "mali vždy na zreteli večné hodnoty.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"12", "Pôstna III", "O ovocí zdržanlivosti",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne<br>" +
                            "spievať pieseň chvály a veleby tebe,<br>" +
                            "všemohúci Otče,<br>" +
                            "a pôstnym sebazapieraním uznávať tvoju dobrotu<br>" +
                            "a vzdávať ti vďaky.<br>" +
                            "Lebo ty chceš, aby sme premáhaním seba<br>" +
                            "krotili svoju pýchu<br>" +
                            "a otvárali srdcia pre chudobných.<br>" +
                            "Keď sa s nimi delíme o chlieb,<br>" +
                            "napodobňujeme tvoju dobrotu<br>" +
                            "i lásku tvojho Syna, nášho Pána Ježiša Krista.<br>" +
                            "Skrze neho klaňajú sa ti zástupy anjelov<br>" +
                            "a večne sa radujú v tvojej prítomnosti.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne voláme na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"12", "Pôstna IV", "O duchovnom ovocí pôstu",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo ty v nás telesným pôstom krotíš zlé sklony,<br>" +
                            "dvíhaš myseľ,<br>" +
                            "udeľuješ silu k čnosti<br>" +
                            "a dávaš odmenu<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Skrze neho tvoju velebu chvália anjeli,<br>" +
                            "klaňajú sa ti všetky nebeské zástupy,<br>" +
                            "i blažení serafíni ťa oslavujú spoločným plesaním.<br>" +
                            "Prosíme, dovoľ i nám,<br>" +
                            "aby sme ťa s nimi v pokornej úcte chválili:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"13", "Veľkonočná I", "O veľkonočnom tajomstve",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "teba, Pane, velebiť v každom čase,<br>" +
                            "ale slávnostnejšie v túto noc,<br>" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
                            "<font color='#B71C1C'>(</font>v tento deň,<font color='#B71C1C'>)</font><br>" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
                            "<font color='#B71C1C'>(</font>v tento čas,<font color='#B71C1C'>)</font><br>" +
                            "keď sa Kristus obetoval<br>" +
                            "ako náš veľkonočný Baránok.<br>" +
                            "Veď on je opravdivý Baránok,<br>" +
                            "ktorý sňal hriechy sveta.<br>" +
                            "On svojou smrťou našu smrť premohol<br>" +
                            "a svojím zmŕtvychvstaním obnovil nám život.<br>" +
                            "Preto vykúpené ľudstvo po celom svete<br>" +
                            "raduje sa z Kristovho vzkriesenia<br>" +
                            "a v nebi anjeli so zástupmi svätých<br>" +
                            "neprestajne spievajú na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"13", "Veľkonočná II", "O novom živote v Kristovi",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "teba, Pane, velebiť v každom čase,<br>" +
                            "ale slávnostnejšie v tento čas,<br>" +
                            "keď sa Kristus obetoval<br>" +
                            "ako náš veľkonočný Baránok.<br>" +
                            "Skrze neho sa rodia pre večný život<br>" +
                            "noví synovia svetla<br>" +
                            "a veriacim sa otvárajú brány nebeského kráľovstva.<br>" +
                            "On svojou smrťou zvíťazil nad našou smrťou<br>" +
                            "a svojím zmŕtvychvstaním<br>" +
                            "priniesol všetkým nový život.<br>" +
                            "Preto vykúpené ľudstvo po celom svete<br>" +
                            "raduje sa z Kristovho vzkriesenia<br>" +
                            "a v nebi anjeli so zástupmi svätých<br>" +
                            "neprestajne spievajú na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"13", "Veľkonočná III", "O Kristovi, ktorý viacej neumiera a stále sa prihovára za nás",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "teba, Pane, velebiť v každom čase,<br>" +
                            "ale slávnostnejšie v tento čas,<br>" +
                            "keď sa Kristus obetoval<br>" +
                            "ako náš veľkonočný Baránok.<br>" +
                            "Lebo on sa za nás neprestajne obetuje<br>" +
                            "a u teba sa prihovára za nás ako náš večný zástanca;<br>" +
                            "obetoval sa raz na kríži a viacej neumiera,<br>" +
                            "ale večne žije s oslávenými ranami svojho umučenia.<br>" +
                            "Preto vykúpené ľudstvo po celom svete<br>" +
                            "raduje sa z Kristovho vzkriesenia<br>" +
                            "a v nebi anjeli so zástupmi svätých<br>" +
                            "neprestajne spievajú na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"13", "Veľkonočná IV", "O obnove všetkého skrze veľkonočné tajomstvo",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "teba, Pane, velebiť v každom čase,<br>" +
                            "ale slávnostnejšie v tento čas,<br>" +
                            "keď sa Kristus obetoval<br>" +
                            "ako náš veľkonočný Baránok.<br>" +
                            "Lebo on zvíťazil nad hriechom a smrťou,<br>" +
                            "obnovuje celý vesmír<br>" +
                            "a v ňom znovu nadobúdame plnosť života.<br>" +
                            "Preto vykúpené ľudstvo po celom svete<br>" +
                            "raduje sa z Kristovho vzkriesenia<br>" +
                            "a v nebi anjeli so zástupmi svätých<br>" +
                            "neprestajne spievajú na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"13", "Veľkonočná V", "O Kristovi, ktorý je kňazom i obeťou",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "teba, Pane, velebiť v každom čase,<br>" +
                            "ale slávnostnejšie v tento čas,<br>" +
                            "keď sa Kristus obetoval<br>" +
                            "ako náš veľkonočný Baránok.<br>" +
                            "Lebo keď na kríži obetoval svoje telo,<br>" +
                            "zavŕšil obety Starého zákona.<br>" +
                            "A keď vydal sám seba za našu spásu,<br>" +
                            "bol zároveň kňazom, oltárom i obetným Baránkom.<br>" +
                            "Preto vykúpené ľudstvo po celom svete<br>" +
                            "raduje sa z Kristovho vzkriesenia<br>" +
                            "a v nebi anjeli so zástupmi svätých<br>" +
                            "neprestajne spievajú na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},

            {"", "Na prvú pôstnu nedeľu", "O pokúšaní Pána",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on štyridsaťdenným pôstom<br>" +
                            "posvätil túto dobu pokánia,<br>" +
                            "zmaril úklady odvekého nepriateľa<br>" +
                            "a naučil nás odolávať zvodom hriechu,<br>" +
                            "aby sme s čistým srdcom mohli sláviť<br>" +
                            "veľkonočné tajomstvo<br>" +
                            "a raz sa mohli tešiť z veľkonočného víťazstva<br>" +
                            "vo večnosti.<br>" +
                            "Preto so zástupmi anjelov a svätých<br>" +
                            "z celej duše spievame chválospev na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"", "Na druhú pôstnu nedeľu", "O premenení Pána",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on predpovedal svoju smrť učeníkom<br>" +
                            "a na svätom vrchu zjavil im svoju slávu,<br>" +
                            "aby pochopili, že cez utrpenie<br>" +
                            "sa prichádza k slávnemu vzkrieseniu,<br>" +
                            "ako o tom svedčí Zákon i proroci.<br>" +
                            "Preto so zástupmi anjelov a svätých<br>" +
                            "aj my pútnici do nebeskej vlasti<br>" +
                            "ustavične ťa oslavujeme a radostne voláme:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"", "O Samaritánke", "O Samaritánke",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a Večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo keď si on pýtal od Samaritánky vodu,<br>" +
                            "už ju pripravil na prijatie viery.<br>" +
                            "A vo svojej túžbe po jej viere<br>" +
                            "zapálil v nej lásku k Bohu.<br>" +
                            "Preto aj my vzdávame ti vďaky<br>" +
                            "a so zástupmi anjelov oslavujeme tvoju velebu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"", "O slepom", "O slepom",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on sa stal človekom,<br>" +
                            "aby priviedol k svetlu viery<br>" +
                            "ľudstvo tápajúce v temnotách,<br>" +
                            "a sviatosťou krstu<br>" +
                            "udelil hodnosť Božích detí všetkým,<br>" +
                            "čo prichádzajú na svet<br>" +
                            "ako otroci prvotného hriechu.<br>" +
                            "Preto nebo i zem sa ti klania<br>" +
                            "a spieva novú pieseň,<br>" +
                            "preto so všetkými anjelskými chórmi<br>" +
                            "aj my bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"", "O Lazárovi", "O Lazárovi",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on ako opravdivý človek<br>" +
                            "plakal nad svojím priateľom Lazárom<br>" +
                            "a ako večný Boh<br>" +
                            "vzkriesil ho z hrobu.<br>" +
                            "Vo svojej láske skláňa sa aj k nám všetkým<br>" +
                            "a svojimi sviatosťami<br>" +
                            "privádza nás k novému životu.<br>" +
                            "Skrze neho klaňajú sa ti zástupy anjelov<br>" +
                            "a večne sa radujú v tvojej prítomnosti.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne voláme na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"", "Na kvetnú nedeľu", "",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on, hoci bol nevinný,<br>" +
                            "dobrovoľne trpel za nás vinníkov<br>" +
                            "a nechal sa nespravodlivo odsúdiť za hriešnikov.<br>" +
                            "Svojou smrťou zotrel naše hriechy<br>" +
                            "a svojím zmŕtvychvstaním získal nám nový život.<br>" +
                            "Preto ťa oslavujeme<br>" +
                            "a so všetkými anjelmi chválime<br>" +
                            "a radostne voláme:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"", "O umučení Pána I", "O moci kríža",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo umučenie tvojho Syna nám prinieslo spásu<br>" +
                            "a jeho vykupiteľská láska nás pohýna<br>" +
                            "oslavovať tvoju velebu.<br>" +
                            "Veď na kríži sa odohral súd nad zlobou sveta<br>" +
                            "a prejavila sa moc ukrižovaného Krista.<br>" +
                            "Preto sa pripájame k zástupom anjelov a svätých<br>" +
                            "a radostne spievame na tvoju chválu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"", "O umučení Pána II", "Kristovo umučenie značí víťazstvo",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo sa približujú dni jeho spásonosného umučenia<br>" +
                            "a slávneho zmŕtvychvstania,<br>" +
                            "keď sa oslavuje víťazstvo nad odvekým nepriateľom<br>" +
                            "a obnovuje sa tajomstvo nášho vykúpenia.<br>" +
                            "Skrze neho klaňajú sa ti zástupy anjelov<br>" +
                            "a večne sa radujú v tvojej prítomnosti.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne voláme na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"16", "Adventná I", "O dvojakom príchode Ježiša Krista",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo pri svojom prvom príchode sa uponížil,<br>" +
                            "vzal na seba telo,<br>" +
                            "splnil pradávne prisľúbenia<br>" +
                            "a otvoril nám cestu do večnej spásy,<br>" +
                            "aby sme pri jeho slávnom<br>" +
                            "a velebnom druhom príchode<br>" +
                            "dostali prisľúbený dar spásy,<br>" +
                            "ktorý teraz tak bedlivo a túžobne očakávame.<br>" +
                            "Preto s anjelmi, archanjelmi<br>" +
                            "a so zástupmi všetkých svätých<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"16", "Adventná II", "O dvojakom očakávaní Ježiša Krista",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Jeho predpovedali všetci proroci,<br>" +
                            "panenská matka ho v nevýslovnej láske<br>" +
                            "nosila pod srdcom,<br>" +
                            "Ján ohlasoval jeho príchod<br>" +
                            "a ukázal na neho: Hľa, už je tu!<br>" +
                            "On nám dáva milosť,<br>" +
                            "aby sme sa s radosťou pripravovali<br>" +
                            "na slávnosť jeho narodenia,<br>" +
                            "aby nás našiel i bedliť v modlitbách<br>" +
                            "i jasať na jeho slávu.<br>" +
                            "Preto s anjelmi, archanjelmi<br>" +
                            "a so zástupmi všetkých svätých<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"17", "Vianočná I", "O Kristovi - svetle sveta",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo tajomným vtelením tvojho Slova<br>" +
                            "zažiarilo našej duši<br>" +
                            "nové svetlo tvoj ej slávy.<br>" +
                            "Keď takto poznávame Boha viditeľne,<br>" +
                            "nech nás on sám strhne k láske vecí neviditeľných.<br>" +
                            "Preto s anjelmi, archanjelmi<br>" +
                            "a so zástupmi všetkých svätých<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"17", "Vianočná II", "O obnovení všetkého skrze Vtelenie",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on, neviditeľné večné Slovo,<br>" +
                            "vo vznešenom tajomstve svojho narodenia<br>" +
                            "prišiel medzi nás ako viditeľný človek;<br>" +
                            "zrodený z Otca pred všetkými vekmi,<br>" +
                            "v plnosti časov narodil sa z panenskej matky,<br>" +
                            "aby pozdvihol z pádu celé stvorenie,<br>" +
                            "obnovil v sebe všetky veci<br>" +
                            "a stratené ľudstvo opäť povolal<br>" +
                            "do nebeského kráľovstva.<br>" +
                            "Preto ťa oslavujeme<br>" +
                            "a so všetkými anjelmi chválime<br>" +
                            "a radostne voláme:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"17", "Vianočná III", "Tajomná výmena",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo v ňom sa dnes jasne zjavila tajomná výmena,<br>" +
                            "ktorá nám priniesla spásu:<br>" +
                            "keď sa totiž tvoj večný Syn<br>" +
                            "stal smrteľným človekom,<br>" +
                            "povzniesol našu ľudskú pominuteľnosť<br>" +
                            "k nehynúcej sláve<br>" +
                            "a nám smrteľným dal podiel na tvojej večnosti.<br>" +
                            "Preto ťa spolu s anjelmi chválime<br>" +
                            "a radostne vyznávame:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},

            {"3", "O Eucharistii I", "O Kristovej obete a sviatosti",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on, pravý a večný kňaz,<br>" +
                            "ustanovil spôsob ustavičnej obety<br>" +
                            "a prvý seba samého priniesol tebe za obetu spásy.<br>" +
                            "Aj nám prikázal sláviť túto obetu<br>" +
                            "na jeho pamiatku.<br>" +
                            "Jeho telo, obetované za nás,<br>" +
                            "je duchovný pokrm, ktorý nás posilňuje,<br>" +
                            "a jeho krv, vyliata za nás,<br>" +
                            "je duchovný nápoj, ktorý nás očisťuje.<br>" +
                            "Preto s anjelmi, archanjelmi<br>" +
                            "a so zástupmi všetkých svätých<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"3", "O Eucharistii II", "O účinkoch Najsvätejšej sviatosti",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo pri Poslednej večeri<br>" +
                            "v kruhu svojich apoštolov<br>" +
                            "obetoval sa ti ako Baránok bez poškvrny<br>" +
                            "a priniesol ti dokonalú obetu chvály,<br>" +
                            "aby ľudstvo po všetky veky mohlo sláviť<br>" +
                            "pamiatku jeho spásonosnej obety na kríži.<br>" +
                            "Týmto eucharistickým tajomstvom<br>" +
                            "živíš a posväcuješ svojich veriacich,<br>" +
                            "aby celú ľudskú rodinu,<br>" +
                            "žijúcu na tej istej zemi,<br>" +
                            "osvecovala tá istá viera a spájala tá istá láska.<br>" +
                            "Pristupujeme teda k tejto sviatostnej hostine,<br>" +
                            "aby, preniknutí tvojou milosťou,<br>" +
                            "pripravovali sme sa na nebeskú hostinu<br>" +
                            "a vždy viac sa pripodobňovali oslávenému Kristovi.<br>" +
                            "Preto nebo i zem sa ti klania<br>" +
                            "a spieva novú pieseň,<br>" +
                            "preto so všetkými anjelskými chórmi<br>" +
                            "aj my bez prestania voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"4", "O preblahoslavenej Panne Marií I", "O materstve preblahoslavenej Panny Márie",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "a teba <font color='#B71C1C'>.......</font> preblahoslavenej Márie, vždy Panny,<br>" +
                            "spoločne chváliť, velebiť a oslavovať.<br>" +
                            "Veď ona počala tvojho jednorodeného Syna,<br>" +
                            "Duchom Svätým zatônená,<br>" +
                            "a v ustavičnej sláve panenstva<br>" +
                            "porodila svetu večné svetlo,<br>" +
                            "Ježiša Krista, nášho Pána.<br>" +
                            "Skrze neho tvoju velebu chvália anjeli,<br>" +
                            "klaňajú sa ti všetky nebeské zástupy,<br>" +
                            "i blažení serafíni ťa oslavujú spoločným plesaním.<br>" +
                            "Prosíme, dovoľ i nám, aby sme ťa s nimi<br>" +
                            "v pokornej úcte chválili:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"4", "O preblahoslavenej Panne Marií II", "Cirkev oslavuje Boha slovami Panny Márie",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "ohlasovať, Otče, tvoju slávu,<br>" +
                            "ktorá žiari zo všetkých tvojich svätých,<br>" +
                            "a zvelebovať tvoju lásku k nám<br>" +
                            "najmä pri spomienke<br>" +
                            "na preblahoslavenú Pannu Máriu<br>" +
                            "slovami jej chválospevu.<br>" +
                            "Lebo na celom tvorstve<br>" +
                            "si prejavil svoju obdivuhodnú moc<br>" +
                            "a všetky pokolenia<br>" +
                            "si zahrnul svojou milosrdnou láskou,<br>" +
                            "keď si zhliadol na svoju skromnú služobnicu<br>" +
                            "a skrze ňu si nám dal Spasiteľa sveta, Ježiša Krista,<br>" +
                            "tvojho Syna a nášho Pána.<br>" +
                            "Skrze neho klaňajú sa ti zástupy anjelov<br>" +
                            "a večne sa radujú v tvojej prítomnosti.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne voláme na tvoju slávu:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"5", "O anjeloch", "O Božej sláve prostredníctvom úcty anjelov",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "a v anjeloch a archanjeloch<br>" +
                            "oslavovať tvoju moc a velebu.<br>" +
                            "Lebo keď si uctievame tvojich nebeských poslov,<br>" +
                            "velebíme tvoju nekonečnú slávu.<br>" +
                            "Ich krása a dôstojnosť nám dáva tušiť,<br>" +
                            "aký si nesmierny a nadovšetko vznešený.<br>" +
                            "Skrze nášho Pána Ježiša Krista tvoju velebu<br>" +
                            "oslavujú všetci anjeli a spievajú pieseň chvály.<br>" +
                            "Aj my sa k nim pripájame<br>" +
                            "a s úctou sa ti klaniame<br>" +
                            "a spolu s nimi radostne voláme:<br>" +
                            "Svätý, svätý, svätý Pán Boh všetkých svetov ...<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"6", "O svätom Jozefovi", "O poslaní svätého Jozefa",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "a teba na slávnosť<br>" +
                            "<font color='#B71C1C'>(</font>pri spomienke<font color='#B71C1C'>)</font><br>" +
                            "<font color='#B71C1C'>(</font>pri uctievaní<font color='#B71C1C'>)</font><br>" +
                            "svätého Jozefa náležitými chválospevmi chváliť,<br>" +
                            "velebiť a oslavovať.<br>" +
                            "Lebo tohto spravodlivého muža<br>" +
                            "dal si panenskej Bohorodičke za ženícha,<br>" +
                            "a jeho, ako verného a múdreho služobníka,<br>" +
                            "ustanovil si za hlavu Svätej rodiny,<br>" +
                            "aby sa otcovsky staral o tvojho jednorodeného,<br>" +
                            "Duchom Svätým počatého Syna,<br>" +
                            "Ježiša Krista, nášho Pána.<br>" +
                            "Skrze neho tvoju velebu chvália anjeli,<br>" +
                            "klaňajú sa ti všetky nebeské zástupy,<br>" +
                            "i blažení serafíni ťa oslavujú spoločným plesaním.<br>" +
                            "Prosíme, dovoľ i nám, aby sme ťa s nimi<br>" +
                            "v pokornej úcte chválili :<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"7", "O svätých apoštoloch I", "O apoštoloch, pastieroch Božieho ľudu",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo ty, večný Pastier, neopúšťaš svoj ľud,<br>" +
                            "ale prostredníctvom svojich svätých apoštolov<br>" +
                            "stále ho chrániš.<br>" +
                            "Aj naďalej ho opatruješ<br>" +
                            "pod starostlivým vedením tých,<br>" +
                            "ktorých si ako zástupcov svojho Syna<br>" +
                            "ustanovil za duchovných pastierov.<br>" +
                            "Preto s anjelmi, archanjelmi<br>" +
                            "a so zástupmi všetkých svätých<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"7", "O svätých apoštoloch II", "O apoštoloch, základoch Cirkvi a svedkoch",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo ty si postavil svoju Cirkev na základoch,<br>" +
                            "ktorými sú apoštoli,<br>" +
                            "aby ustavične žiarila na zemi<br>" +
                            "ako odlesk tvojej svätosti<br>" +
                            "a celému svetu vydávala svedectvo<br>" +
                            "o nebeskom kráľovstve.<br>" +
                            "Preto teraz i po celú večnosť<br>" +
                            "chceme ti so zástupmi anjelov vrúcne spievať<br>" +
                            "a nadšene ťa oslavovať:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"8", "O svätých I", "O sláve svätých",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe,<br>" +
                            "Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo teba oslavujú zástupy svätých<br>" +
                            "a keď korunuješ ich zásluhy,<br>" +
                            "korunuješ dielo svojej milosti.<br>" +
                            "Ich život nám dávaš za príklad,<br>" +
                            "na ich orodovanie nám pomáhaš<br>" +
                            "a v spoločenstve s nimi utváraš z nás jednu rodinu.<br>" +
                            "Ich hrdinské svedectvo nám dáva silu,<br>" +
                            "aby sme víťazne obstáli v duchovnom zápase<br>" +
                            "a spolu s nimi dosiahli nevädnúci veniec slávy<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Preto ti s anjelmi aj archanjelmi<br>" +
                            "spolu so všetkými svätými<br>" +
                            "spievame pieseň chvály<br>" +
                            "a radostne voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"8", "O svätých II", "O príklade a orodovaní svätých",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne,<br>" +
                            "všemohúci a večný Bože,<br>" +
                            "tebe za všetko ustavične vzdávať vďaky<br>" +
                            "a ohlasovať tvoje veľké skutky<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo obdivuhodným svedectvom viery svätých<br>" +
                            "ustavične obnovuješ životnú silu svojej Cirkvi<br>" +
                            "a dávaš nám presvedčivé dôkazy svojej lásky.<br>" +
                            "Ich vynikajúci príklad nás oduševňuje<br>" +
                            "a ich láskavé orodovanie nám pomáha,<br>" +
                            "aby sme horlivo pracovali na diele našej spásy.<br>" +
                            "Preto sa pripájame k zástupom anjelov a svätých<br>" +
                            "a radostne spievame na tvoju chválu:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"9", "O svätých mučeníkoch", "O význame a príklade mučeníctva",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo svätý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>)</font> mučeník <font color='#B71C1C'>M. (</font>mučenica <font color='#B71C1C'>M.)</font><br>" +
                            "podľa Kristovho príkladu oslávil <font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> tvoje meno,<br>" +
                            "keď položil <font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> život za vieru.<br>" +
                            "Veď tvoja sila sa prejavuje v slabých ľuďoch,<br>" +
                            "keď ich v krehkosti posilňuješ<br>" +
                            "a dodávaš im odvahy k mučeníctvu<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Preto so zástupmi anjelov a svätých<br>" +
                            "aj my, pútnici do nebeskej vlasti,<br>" +
                            "ustavične ťa oslavujeme a radostne voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"10", "O svätých pastieroch Cirkvi", "O prítomnosti svätých pastierov v Cirkvi",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo si dal svojej Cirkvi svätého <font color='#B71C1C'>M.</font>,<br>" +
                            "ktorého dnes s radosťou oslavujeme.<br>" +
                            "Príkladom jeho svätého života nás posilňuješ,<br>" +
                            "jeho náukou nás poučuješ<br>" +
                            "a na jeho príhovor nás ochraňuješ.<br>" +
                            "Preto so zástupmi anjelov a svätých<br>" +
                            "z celej duše spievame chválospev na tvoju slávu:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"11", "O svätých pannách a rehoľníkoch", "O svedectve Bohu zasväteného života",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne,<br>" +
                            "aby sme ti, všemohúci Otče,<br>" +
                            "spievali pieseň chvály a veleby.<br>" +
                            "Lebo si obdivuhodný vo svojich svätých,<br>" +
                            "ktorí pre nebeské kráľovstvo opustili všetko<br>" +
                            "a celkom sa zasvätili Kristovi.<br>" +
                            "Ty krehkého človeka privádzaš k prvotnej svätosti<br>" +
                            "a už tu na zemi mu dávaš okúsiť dobrá,<br>" +
                            "ktoré si mu pripravil v nebi.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a bez prestania voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"31", "O zosnulých I", "O nádeji na vzkriesenie s Kristom",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo v ňom nám zažiarila nádej na slávne vzkriesenie<br>" +
                            "a hoci nás zarmucuje neodvratný údel smrti,<br>" +
                            "potešuje nás prísľub budúcej nesmrteľnosti.<br>" +
                            "Veď tým, čo veria v teba, Bože,<br>" +
                            "život sa neodníma, iba mení;<br>" +
                            "a keď skončíme život v smrteľnom tele,<br>" +
                            "máme pripravený večný príbytok v nebesiach.<br>" +
                            "Preto s anjelmi, archanjelmi<br>" +
                            "a so zástupmi všetkých svätých<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"31", "O zosnulých II", "Kristus zomrel, aby sme my žil!",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on sa podrobil smrti, jeden za všetkých,<br>" +
                            "aby nik z nás v smrti nezahynul;<br>" +
                            "obetoval za nás svoj život,<br>" +
                            "aby sme všetci večne žili s tebou.<br>" +
                            "Preto ťa spolu s anjelmi chválime<br>" +
                            "a radostne vyznávame:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"31", "O zosnulých III", "Kristus je spása a život",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on prináša svetu spásu,<br>" +
                            "dáva ľuďom nový život<br>" +
                            "a mŕtvych kriesi k večnému životu.<br>" +
                            "Skrze neho klaňajú sa ti zástupy anjelov<br>" +
                            "a večne sa radujú v tvojej prítomnosti.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne voláme na tvoju slávu:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"31", "O zosnulých IV", "Z pozemského života do nebeskej slávy",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne,<br>" +
                            "aby sme vždy vzdávali vďaky tebe, milosrdný Otče,<br>" +
                            "všemohúci Bože, Kráľ večnej slávy.<br>" +
                            "Lebo z tvojej vôle prichádzame na svet,<br>" +
                            "v tvojich rukách je náš život<br>" +
                            "a z tvojho rozhodnutia musíme sa následkom hriechu<br>" +
                            "vrátiť do zeme, z ktorej sme vzatí.<br>" +
                            "Ale na tvoj mocný pokyn<br>" +
                            "všetci vykúpení smrťou tvojho Syna<br>" +
                            "budeme vzkriesení,<br>" +
                            "aby sme mali účasť na sláve jeho zmŕtvychvstania.<br>" +
                            "Preto so zástupmi anjelov a svätých<br>" +
                            "z celej duše spievame na tvoju slávu:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"31", "O zosnulých V", "O našom vzkriesení skrze Kristovo víťazstvo nad smrťou",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo aj keď pre svoje skutky<br>" +
                            "podliehame zákonu smrti,<br>" +
                            "tvoja otcovská láska sa zmilúva nad nami.<br>" +
                            "A hoci pre hriech musíme umrieť,<br>" +
                            "tvoj Syn Ježiš Kristus nás zachránil<br>" +
                            "svojím veľkonočným víťazstvom<br>" +
                            "a vedie nás k novému životu.<br>" +
                            "Preto so zástupmi anjelov a svätých<br>" +
                            "aj my, pútnici do nebeskej vlasti,<br>" +
                            "ustavične ťa oslavujeme a radostne voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"21", "Vlastná prefácia - Sv. Ján Krstiteľ", "O poslaní Pánovho predchodcu",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo dnes oslavujeme dielo tvojej milosti<br>" +
                            "v Kristovom predchodcovi, svätom Jánovi,<br>" +
                            "ktorého si spomedzi všetkých ľudí<br>" +
                            "zahrnul mimoriadnou priazňou.<br>" +
                            "On sa už v matkinom lone zaradoval<br>" +
                            "z prítomnosti Spasiteľa,<br>" +
                            "svojím narodením priniesol mnohým veľkú potechu<br>" +
                            "a jediný z prorokov predstavil zástupom Baránka,<br>" +
                            "ktorý sníma hriechy sveta.<br>" +
                            "On pokrstil pôvodcu krstu vodou,<br>" +
                            "ktorá tým dostala posväcujúcu silu,<br>" +
                            "a vyliatím vlastnej krvi<br>" +
                            "vydal najkrajšie svedectvo o Kristovi.<br>" +
                            "Preto so zástupmi anjelov a svätých<br>" +
                            "aj my, pútnici do nebeskej vlasti,<br>" +
                            "ustavične ťa oslavujeme a radostne voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"22", "Vlastná prefácia - Sv. Peter a Pavol", "O dvojakom poslaní svätého Petra a Pavla v Cirkvi",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo nás naplňuješ radosťou<br>" +
                            "z apoštolského diela svätého Petra a Pavla.<br>" +
                            "Jeden nás učí vyznávať vieru<br>" +
                            "a druhý nám objasňuje jej tajomstvá;<br>" +
                            "Peter zhromaždil prvotnú Cirkev zo synov Izraela,<br>" +
                            "Pavol sa stal učiteľom viery pre všetky národy,<br>" +
                            "a tak obaja, hoci odlišným spôsobom,<br>" +
                            "zhromažďovali Kristovu rodinu.<br>" +
                            "My ich spoločne uctievame,<br>" +
                            "ako ty si oboch spoločne oslávil.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými<br>" +
                            "oslavujeme a bez prestania voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"23", "Vlastná prefácia - Sv. Cyril a Metod", "O našich svätých vierozvestoch",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo ty si nám v našich vierozvestoch<br>" +
                            "Cyrilovi a Metodovi<br>" +
                            "poslal učiteľov národa,<br>" +
                            "horlivých i múdrych ohlasovateľov evanjelia,<br>" +
                            "aby v našej krajine pri najsvätejšej obete<br>" +
                            "v reči ľudu zazneli modlitby a spevy<br>" +
                            "na tvoju chválu a slávu.<br>" +
                            "Ich príklad a slová nás povzbudzujú,<br>" +
                            "aby sme si zachovali dedičstvo otcov:<br>" +
                            "jednotu vo viere<br>" +
                            "a vernosť i poslušnosť svätej Cirkvi.<br>" +
                            "Preto ťa spolu s anjelmi chválime<br>" +
                            "a radostne vyznávame:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"24", "Vlastná prefácia - Premenenie Pána", "O tajomstve premenenia",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on zjavil svoju vznešenosť<br>" +
                            "pred vyvolenými svedkami,<br>" +
                            "keď svoje telo, podobné nášmu,<br>" +
                            "prežiaril nebeským jasom.<br>" +
                            "Tým posilnil vieru svojich učeníkov,<br>" +
                            "aby sa nepohoršili nad jeho smrťou na kríži,<br>" +
                            "a ukázal, že všetkých jeho verných<br>" +
                            "očakáva sláva, žiariaca z neho,<br>" +
                            "ktorý je hlavou Cirkvi.<br>" +
                            "Preto so zástupmi anjelov a svätých<br>" +
                            "aj my, pútnici do nebeskej vlasti,<br>" +
                            "ustavične ťa oslavujeme a radostne voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"25", "Vlastná prefácia - Nanebovzatie Panny Márie", "O sláve Panny Márie vzatej do neba",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo dnešného dňa vzal si do neba<br>" +
                            "matku svojho Syna,<br>" +
                            "ktorá je prvotinou a obrazom oslávenej Cirkvi<br>" +
                            "a príčinou pevnej nádeje a potechy<br>" +
                            "Božiemu ľudu na jeho pozemskej púti.<br>" +
                            "Bolo správne,<br>" +
                            "že si ju uchránil od porušenia v hrobe,<br>" +
                            "lebo z nej podivuhodným spôsobom<br>" +
                            "vzal si telo a narodil sa tvoj Syn, pôvodca života.<br>" +
                            "Preto ťa spolu s anjelmi chválime<br>" +
                            "a radostne vyznávame:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"26", "Vlastná prefácia - Povýšenie svätého kríža", "O víťazstve slávneho kríža",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo vykúpenie ľudstva sa z tvojho rozhodnutia<br>" +
                            "uskutočnilo na dreve kríža.<br>" +
                            "Zo stromu v raji prišla na nás smrť,<br>" +
                            "zo stromu kríža dostali sme nový život.<br>" +
                            "Nepriateľ, ktorý nás v raji premohol,<br>" +
                            "na dreve kríža bol premožený Kristom, naším Pánom.<br>" +
                            "Skrze neho tvoju velebu chvália anjeli,<br>" +
                            "klaňajú sa ti všetky nebeské zástupy,<br>" +
                            "i blažení serafíni ťa oslavujú spoločným plesaním.<br>" +
                            "Prosíme, dovoľ i nám,<br>" +
                            "aby sme ťa s nimi v pokornej úcte chválili:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"27", "Vlastná prefácia - Sedembolestnej Panny Márie", "O patrónke slovenského národa",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "a v slávny deň prebolestnej Panny<br>" +
                            "spoločne ťa chváliť, velebiť a oslavovať.<br>" +
                            "Veď ona vždy preukazovala nášmu ľudu<br>" +
                            "útechu v utrpeniach<br>" +
                            "a pomoc v nebezpečenstvách.<br>" +
                            "Ani teraz neprestáva orodovať za nás<br>" +
                            "a s materinskou láskou sa stará<br>" +
                            "o bratov a sestry svojho Syna.<br>" +
                            "Preto ju oslavujeme ako patrónku nášho národa<br>" +
                            "a uctievame ju ako našu nebeskú Matku.<br>" +
                            "Pod jej ochranou kráčame do nebeskej vlasti,<br>" +
                            "v ktorej si ju už oslávil pri svojom Synovi<br>" +
                            "Ježišovi Kristovi, našom Pánovi.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a bez prestania voláme:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"28", "Vlastná prefácia - Výročie posviacky katedrálneho chrámu", "O tajomstve Cirkvi, ktorá je Kristovou nevestou a chrámom Ducha Svätého",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože. <br>" +
                            "Lebo prebývaš v svätom dome modlitby<br>" +
                            "ako štedrý darca, <br>" +
                            "aby si z nás ustavičným pôsobením svojej milosti<br>" +
                            "budoval chrám Ducha Svätého, <br>" +
                            "ktorého okrasou je náš príkladný život. <br>" +
                            "Veď rukou budovaný chrám<br>" +
                            "predstavuje Cirkev, <br>" +
                            "ktorú neprestajne posväcuješ<br>" +
                            "ako nevestu svojho Syna, <br>" +
                            "aby bola radostnou matkou mnohých detí<br>" +
                            "a došla s nimi do tvojej slávy v nebi. <br>" +
                            "Preto ťa so všetkými anjelmi a svätými<br>" +
                            "oslavujeme a bez prestania voláme: <br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"29", "O preblahoslavenej Panne Marií II", ""},
            {"30", "Vlastná prefácia - Všetkých svätých", "O sláve nebeského mesta Jeruzalema<br>",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo dnes oslavujeme nebeský Jeruzalem,<br>" +
                            "tvoje sväté mesto, našu večnú vlasť,<br>" +
                            "kde ti neprestajne spieva na chválu<br>" +
                            "plesajúci zástup našich svätých bratov a sestier.<br>" +
                            "Za nimi sa radostne ponáhľame<br>" +
                            "na našej pozemskej púti,<br>" +
                            "vedení svetlom viery,<br>" +
                            "a tešíme sa z veľkej slávy<br>" +
                            "týchto vyvolených členov Cirkvi,<br>" +
                            "ktorých nám dávaš ako pomoc v našej slabosti<br>" +
                            "a vzor svätého života.<br>" +
                            "Pre tento nesmierny dar tvojej lásky<br>" +
                            "zvelebujeme ťa so všetkými anjelmi a svätými<br>" +
                            "a voláme na tvoju slávu:<br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"32", "Vlastná prefácia - Výročie posviacky chrámov, ktorých deň posviacky nie je známy", "O tajomstve Božieho chrámu, ktorým je Cirkev",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože, <br>" +
                            "skrze nášho Pána Ježiša Krista. <br>" +
                            "Lebo si nám doprial radosť, <br>" +
                            "že sme ti uprostred našich príbytkov<br>" +
                            "mohli postaviť tento dom. <br>" +
                            "V ňom zhromažďuješ rodinu svojich veriacich, <br>" +
                            "putujúcich k tebe, <br>" +
                            "zahrňuješ nás svojou priazňou<br>" +
                            "a sviatostnými znakmi svojej milosti<br>" +
                            "upevňuješ naše spojenie s tebou. <br>" +
                            "Na tomto mieste staviaš si z nás živý chrám<br>" +
                            "a Cirkev, rozšírenú po celom svete, <br>" +
                            "buduješ ako Kristovo tajomné telo, <br>" +
                            "kým nedosiahne dokonalosť<br>" +
                            "v blaženosti nebeského Jeruzalema. <br>" +
                            "Preto ťa v tomto svätom chráme chválime<br>" +
                            "so všetkými anjelmi a svätými<br>" +
                            "a ustavične ti voláme na slávu : <br>" +
                            "<br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"33", "O svätých apoštoloch I", ""},
            {"34", "O svätých apoštoloch II", ""},
            {"14", "O nanebovstúpení Pána I", "O tajomstve Nanebovstúpenia",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo náš slávny Kráľ Ježiš Kristus,<br>" +
                            "víťaz nad hriechom a smrťou,<br>" +
                            "vystúpil (dnes) na nebesia za obdivu anjelov<br>" +
                            "ako prostredník medzi Bohom a ľuďmi,<br>" +
                            "ako sudca sveta a pán celého vesmíru.<br>" +
                            "Vrátil sa k tebe,<br>" +
                            "nie aby nás nechal v našom biednom položení,<br>" +
                            "lež aby sme mali pevnú nádej,<br>" +
                            "že sa ako údy jeho tela<br>" +
                            "dostaneme do nebeskej vlasti,<br>" +
                            "kam nás on predišiel<br>" +
                            "ako naša Hlava a pôvodca našej spásy.<br>" +
                            "Preto vykúpené ľudstvo po celom svete<br>" +
                            "raduje sa z Kristovho vzkriesenia<br>" +
                            "a v nebi anjeli so zástupmi svätých<br>" +
                            "neprestajne spievajú na tvoju slávu:<br>" +

                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"14", "O nanebovstúpení Pána II", "O tajomstve Nanebovstúpenia",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné,<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on sa po svojom zmŕtvychvstaní<br>" +
                            "viditeľne zjavil všetkým svojim učeníkom<br>" +
                            "a pred ich očami vzniesol sa do neba,<br>" +
                            "aby nám dal účasť<br>" +
                            "na svojom božskom živote.<br>" +
                            "Preto vykúpené ľudstvo po celom svete<br>" +
                            "raduje sa z Kristovho vzkriesenia<br>" +
                            "a v nebi anjeli so zástupmi svätých<br>" +
                            "neprestajne spievajú na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"35", "Vlastná prefácia - Zoslanie Ducha Svätého", "O tajomstve zoslania Ducha Svätého",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo na zavŕšenie<br>" +
                            "veľkonočného tajomstva naseJ spásy<br>" +
                            "zoslal si dnes Ducha Svätého na tých,<br>" +
                            "ktorých si v Kristovi, svojom Synovi,<br>" +
                            "prijal za svoje deti;<br>" +
                            "ten Duch Svätý na počiatku Cirkvi<br>" +
                            "zjavil všetkým národom pravého Boha<br>" +
                            "a rozmanité jazyky ľudskej rodiny<br>" +
                            "združil vo vyznávaní tej istej viery.<br>" +
                            "Preto vykúpené ľudstvo po celom svete<br>" +
                            "raduje sa z Kristovho vzkriesenia<br>" +
                            "a v nebi anjeli so zástupmi svätých<br>" +
                            "neprestajne spievajú na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"36", "Vlastná prefácia - Obetovanie Pána", "O tajomstve obetovania Pána v chráme",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo tvoj večný Syn<br>" +
                            "bol dnes obetovaný v chráme<br>" +
                            "a Duch Svätý ústami Simeona o ňom vyhlásil,<br>" +
                            "že bude slávou vyvoleného ľudu<br>" +
                            "a svetlom na osvietenie pohanov.<br>" +
                            "Preto sa s radosťou ponáhľame<br>" +
                            "v ústrety nášmu Spasiteľovi,<br>" +
                            "chválime ťa so všetkými anjelmi a svätými<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"37", "Vlastná prefácia - Sv. Cyrila a Metoda", "O našich svätých vierozvestoch",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne,<br>" +
                            "dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo si dal svojej Cirkvi<br>" +
                            "svätého Cyrila a Metoda,<br>" +
                            "ktorých dnes s radosťou oslavujeme.<br>" +
                            "Príkladom ich svätého života nás posilňuješ,<br>" +
                            "ich náukou nás poučuješ<br>" +
                            "a na ich príhovor nás ochraňuješ.<br>" +
                            "Preto so zástupmi anjelov a svätých<br>" +
                            "z celej duše spievame chválospev na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"38", "Vlastná prefácia - Zvestovanie Pána", "O tajomstve Vtelenia",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo anjel z neba zvestoval Panne Márii,<br>" +
                            "že tvoj Syn sa pôsobením Ducha Svätého<br>" +
                            "stane človekom,<br>" +
                            "aby spasil všetkých ľudí.<br>" +
                            "Ona s vierou prijala nebeské posolstvo<br>" +
                            "a s láskou nosila v nepoškvrnenom lone Ježiša Krista,<br>" +
                            "ktorý splnil prisľúbenia dané vyvolenému ľudu<br>" +
                            "a zjavil sa svetu ako očakávaný Vykupiteľ.<br>" +
                            "Skrze neho klaňajú sa ti zástupy anjelov<br>" +
                            "a večne sa radujú v tvojej prítomnosti.<br>" +
                            "Prosíme ťa, pripoj k nim aj naše hlasy,<br>" +
                            "keď spoločne privolávame na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"15", "O Duchu Svätom I", "Pán zoslal Ducha Svätého Cirkvi",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on vystúpil na nebesia,<br>" +
                            "zasadol po tvojej pravici<br>" +
                            "a zoslal prisľúbeného Ducha Svätého na deti,<br>" +
                            "ktoré si ty prijal za svoje.<br>" +
                            "Preto teraz i po celú večnosť<br>" +
                            "chceme ti so zástupmi anjelov vrúcne spievať<br>" +
                            "a nadšene ťa oslavovať:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"15", "O Duchu Svätom II", "O pôsobení Ducha Svätého v Cirkvi",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo ty dávaš svojej Cirkvi milosti<br>" +
                            "primerané každej dobe<br>" +
                            "a obdivuhodne ju spravuješ a chrániš.<br>" +
                            "Veď darmi Ducha Svätého ju tak posilňuješ<br>" +
                            "a ustavične naplňuješ dôverou,<br>" +
                            "že ani v zármutku ťa neprestáva prosiť,<br>" +
                            "ani uprostred radostí ti nezabúda ďakovať<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Preto ťa spolu s anjelmi chválime<br>" +
                            "a radostne vyznávame:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"39", "O preblahoslavenej Panne Márii", "O Panne Márii, ktorá je vzorom a Matkou Cirkvi",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "a pri oslave preblahoslavenej Panny Márie<br>" +
                            "zvelebovať ťa dôstojným chválospevom.<br>" +
                            "Ona prijala do nepoškvrneného srdca večné Slovo,<br>" +
                            "v panenskom lone ho počala,<br>" +
                            "porodila Pôvodcu sveta,<br>" +
                            "a tak pripravila zrodenie Cirkvi.<br>" +
                            "Pod krížom prevzala odkaz Spasiteľovej lásky<br>" +
                            "a za svoje deti prijala všetkých ľudí,<br>" +
                            "Kristovou smrťou znovuzrodených<br>" +
                            "pre božský život.<br>" +
                            "S apoštolmi očakávala prisľúbeného Ducha Svätého,<br>" +
                            "svoje prosby spájala s modlitbami učeníkov<br>" +
                            "a stala sa vzorom modliacej sa Cirkvi.<br>" +
                            "Napokon bola vzatá do nebeskej slávy,<br>" +
                            "s materskou láskou sprevádza putujúcu Cirkev<br>" +
                            "a starostlivo ju chráni na ceste do večnej vlasti,<br>" +
                            "kým nenadíde preslávny deň Pánov.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"40", "Vlastná prefácia - Nášho Pána Ježiša Krista", "O Kňazstve Krista a Cirkvi",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade, tebe, Pane,<br>" +
                            "svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo ty si svojho jednorodeného Syna <br>" +
                            "posvätil Duchom Svätým,<br>" +
                            "ustanovil si ho za Veľkňaza novej a večnej zmluvy<br>" +
                            "a rozhodol si, že jeho jediné kňazstvo<br>" +
                            "bude neprestajne trvať v tvojej Cirkvi. <br>" +
                            "Veď Kristus nielen povýšil tvoj vykúpený ľud <br>" +
                            "na kráľovské kňazstvo,<br>" +
                            "ale s láskou brata povoláva si z neho učeníkov<br>" +
                            "a vkladaním rúk im dáva účasť<br>" +
                            "na svojej kňazskej službe.<br>" +
                            "V jeho mene obnovujú obetu nášho vykúpenia,<br>" +
                            "a rodine tvojich veriacich pripravujú veľkonočnú hostinu.<br>" +
                            "S opravdivou láskou slúžia tvojmu ľudu,<br>" +
                            "živia ho tvojím slovom a posväcujú sviatosťami.<br>" +
                            "Zasvätiac svoj život tebe a spáse svojich bratov,<br>" +
                            "majú sa pripodobňovať Ježišovi Kristovi<br>" +
                            "a tebe stále dosvedčovať vernosť a lásku. <br>" +
                            "Preto sa pripájame k zástupom anjelov a svätých<br>" +
                            "a radostne spievame na tvoju chválu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"41", "Vlastná prefácia - Najsvätejšej Trojice", "O tajomstve Najsvätejšej Trojice",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo ty so svojím jednorodeným Synom<br>" +
                            "a Duchom Svätým<br>" +
                            "si jeden Boh, si jeden Pán:<br>" +
                            "nie ako jediná osoba,<br>" +
                            "ale ako Trojica osôb jedinej božskej podstaty.<br>" +
                            "A čo podľa tvojho zjavenia veríme o tvojej sláve,<br>" +
                            "to isté bez rozdielu vyznávame<br>" +
                            "aj o tvojom Synovi, aj o Duchu Svätom.<br>" +
                            "A keď vyznávame pravého a večného Boha,<br>" +
                            "klaniame sa trom božským osobám<br>" +
                            "jedinej podstaty<br>" +
                            "a rovnakej veleby.<br>" +
                            "Pre túto velebu ťa oslavujú anjeli, archanjeli,<br>" +
                            "cherubíni a serafíni,<br>" +
                            "ktorí neprestajne spievajú<br>" +
                            "a jedným hlasom volajú:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"42", "Vlastná prefácia - Najsvätejšieho Srdca Ježišovho", "O nesmiernej láske Krista Pána",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne,<br>" +
                            "dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                            "skrze nášho Pána Ježiša Krista.<br>" +
                            "Lebo on sa s nesmiernou láskou obetoval za nás,<br>" +
                            "keď sa nechal pozdvihnúť na kríž.<br>" +
                            "Z jeho otvoreného boku vyšla krv a voda,<br>" +
                            "z neho pramenia aj sviatosti Cirkvi.<br>" +
                            "Spasiteľovo otvorené Srdce priťahuje všetkých,<br>" +
                            "aby s radosťou čerpali z prameňov spásy.<br>" +
                            "Preto ťa so všetkými anjelmi a svätými oslavujeme<br>" +
                            "a bez prestania voláme:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"43", "Vlastná prefácia - Nedeľa Krista Kráľa", "O Kristovi - Kráľovi vesmíru",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Lebo ty si svojho jednorodeného Syna,<br>" +
                            "nášho Pána Ježiša Krista, pomazal olejom veleby<br>" +
                            "za večného kňaza a kráľa všetkých svetov,<br>" +
                            "aby na oltári kríža obetoval sám seba<br>" +
                            "ako zmiernu obetu bez poškvrny,<br>" +
                            "a tak zavŕšil tajomstvá vykúpenia ľudstva,<br>" +
                            "aby podrobil svojej vláde celé stvorenie<br>" +
                            "a odovzdal ho tvojej nesmiernej velebnosti<br>" +
                            "ako večné a vesmírne kráľovstvo;<br>" +
                            "kráľovstvo pravdy a života,<br>" +
                            "kráľovstvo svätosti a milosti,<br>" +
                            "kráľovstvo spravodlivosti, lásky a pokoja.<br>" +
                            "Preto s anjelmi, archanjelmi<br>" +
                            "a so zástupmi všetkých svätých<br>" +
                            "spievame chválospev na tvoju slávu<br>" +
                            "a neprestajne voláme:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {"44", "Vlastná prefácia - Nepoškvrnené počatie Panny Márie", "O tajomstve Panny Márie a Cirkvi",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "vzdávať vďaky vždy a všade<br>" +
                            "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                            "Ty si uchránil preblahoslavenú Pannu Máriu<br>" +
                            "od poškvrny dedičného hriechu<br>" +
                            "a naplnil si ju svojou milosťou,<br>" +
                            "aby bola dôstojnou matkou tvojho Syna<br>" +
                            "a počiatkom i obrazom Cirkvi,<br>" +
                            "jeho krásnej nevesty bez vrásky a poškvrny.<br>" +
                            "Lebo z nepoškvrnenej Panny mal sa narodiť Kristus,<br>" +
                            "nevinný Baránok, ktorý sníma naše viny;<br>" +
                            "ty si ju vyvolil,<br>" +
                            "aby tvojmu ľudu vyprosovala milosti<br>" +
                            "a bola mu príkladom svätosti.<br>" +
                            "Preto ťa spolu s anjelmi chválime<br>" +
                            "a radostne vyznávame:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
    {"45", "O zjavení Pána", "O Kristovi - svetle národov",
            "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                    "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                    "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                    "vzdávať vďaky vždy a všade<br>" +
                    "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                    "Lebo dnes si odhalil tajomstvo našej spásy,<br>" +
                    "dnes si nám zjavil Svetlo národov,<br>" +
                    "svojho Syna Ježiša Krista.<br>" +
                    "On sa zjavil v našom smrteľnom tele<br>" +
                    "a obnovil nás nevídaným svetlom<br>" +
                    "svojej nesmrteľnosti.<br>" +
                    "Preto s anjelmi, archanjelmi<br>" +
                    "a so zástupmi všetkých svätých<br>" +
                    "spievame chválospev na tvoju slávu<br>" +
                    "a neprestajne voláme:<br><br>" +
                    "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                    "Plné sú, nebesia i zem tvojej slávy.<br>" +
                    "Hosana na výsostiach!<br>" +
                    "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                    "Hosana na výsostiach!"},
    {"46", "Vlastná prefácia - Krst Krista Pána", "",
            "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                    "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                    "Je naozaj dôstojné a správne,<br>" +
                    "dobré a spásonosné<br>" +
                    "vzdávať vďaky vždy a všade<br>" +
                    "tebe, Pane, svätý Otče, všemohúci a večný Bože.<br>" +
                    "Lebo pri krste v Jordáne<br>" +
                    "si podivuhodnými znameniami zjavil<br>" +
                    "tajomstvo svojho Syna:<br>" +
                    "hlasom z neba si dosvedčil,<br>" +
                    "že tvoje večné Slovo prebýva medzi nami;<br>" +
                    "Duchom Svätým, ktorý zostúpil v podobe holubice,<br>" +
                    "posvätil si Krista, svojho Sluhu,<br>" +
                    "za kňaza, proroka a kráľa<br>" +
                    "a poslal si ho ohlasovať chudobným spásu.<br>" +
                    "Preto so zástupmi anjelov a svätých<br>" +
                    "aj my, pútnici do nebeskej vlasti,<br>" +
                    "ustavične ťa oslavujeme a radostne voláme:<br><br>" +
                    "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                    "Plné sú, nebesia i zem tvojej slávy.<br>" +
                    "Hosana na výsostiach!<br>" +
                    "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                    "Hosana na výsostiach!"},
            {"47", "O preblahoslavenej Panne Marií I", ""},
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
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
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
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
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
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},

            {"", "Vlastná prefácia", "", "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                    "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                    "<br>" +
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
                    "a mnohé z nich oblažil<br>" +
                    "jasom svojho svetla.<br>" +
                    "Preto stoja pred tebou<br>" +
                    "nespočetné zástupy anjelov,<br>" +
                    "ktorí ti slúžia vo dne v noci,<br>" +
                    "hľadia na velebu tvojej tváre<br>" +
                    "a neprestajne ťa oslavujú.<br>" +
                    "S nimi aj my,<br>" +
                    "a našimi ústami všetko tvorstvo pod nebom,<br>" +
                    "velebíme tvoje meno a spievame:<br>" +
                    "<br>" +
                    "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                    "Plné sú, nebesia i zem tvojej slávy.<br>" +
                    "Hosana na výsostiach!<br>" +
                    "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                    "Hosana na výsostiach!"},
    };

    String[] prefacie_EM0 = {
            "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                    "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                    "Je naozaj dôstojné a správne<br>" +
                    "vzdávať vďaky tebe, Pane, svätý Otče.<br>" +
                    "Lebo ty nás neprestajne pozývaš<br>" +
                    "k stále plnšiemu životu.<br>" +
                    "A pretože si Boh dobrý a milosrdný,<br>" +
                    "všetkým ponúkaš odpustenie<br>" +
                    "a hriešnikov vyzývaš,<br>" +
                    "aby sa s dôverou odovzdali<br>" +
                    "tvojej milosrdnej láske.<br>" +
                    "Neodvrátil si sa od ľudí,<br>" +
                    "keď veľa ráz porušili tvoju zmluvu,<br>" +
                    "ale skrze Ježiša Krista,<br>" +
                    "tvojho Syna a nášho Pána,<br>" +
                    "spojil si so sebou veľkú rodinu ľudstva<br>" +
                    "novým putom,<br>" +
                    "ktoré nijaká moc nemôže rozlomiť.<br>" +
                    "Keď teraz tvoj ľud prežíva<br>" +
                    "tento čas milosti i zmierenia<br>" +
                    "a obracia sa k tebe,<br>" +
                    "ty mu umožňuješ žiť v Kristovi<br>" +
                    "novým životom<br>" +
                    "a pomáhaš mu, aby slúžil všetkým ľuďom<br>" +
                    "a ochotnejšie sa zveril<br>" +
                    "vedeniu Ducha Svätého.<br>" +
                    "Preto ti s obdivom vzdávame vďaky<br>" +
                    "a spolu s nespočetnými zástupmi<br>" +
                    "anjelov a svätých<br>" +
                    "ohlasujeme tvoju nesmiernu lásku,<br>" +
                    "tešíme sa z veľkého daru spásy<br>" +
                    "a radostne voláme na tvoju slávu:<br><br>" +
                    "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                    "Plné sú, nebesia i zem tvojej slávy.<br>" +
                    "Hosana na výsostiach!<br>" +
                    "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                    "Hosana na výsostiach!",
            "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                    "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                    "Bože, všemohúci Otče,<br>" +
                    "vzdávame ti vďaky a oslavujeme ťa<br>" +
                    "skrze nášho Pána, Ježiša Krista,<br>" +
                    "za všetko, čo konáš vo svete.<br>" +
                    "Lebo vo veľkej rodine ľudstva<br>" +
                    "rozdelenej nesvornosťou<br>" +
                    "skusujeme, že ty pohýnaš ľudí,<br>" +
                    "aby boli ochotní zmieriť sa.<br>" +
                    "Tvoj Duch pôsobí v ľudských srdciach,<br>" +
                    "aby nepriatelia obnovili priateľské vzťahy,<br>" +
                    "aby si protivníci podali ruky<br>" +
                    "a národy hľadali cestu svornosti a spolupráce.<br>" +
                    "Vďaka tvojmu mocnému účinkovaniu vo svete<br>" +
                    "úprimné úsilie o pokoj rieši spory,<br>" +
                    "láska víťazí nad nenávisťou<br>" +
                    "a túžba po pomste sa mení na odpustenie.<br>" +
                    "Preto sme povinní<br>" +
                    "neprestajne ti vzdávať vďaky<br>" +
                    "a chváliť ťa s nebeskými chórmi,<br>" +
                    "ktoré ťa ustavične oslavujú:<br><br>" +
                    "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                    "Plné sú, nebesia i zem tvojej slávy.<br>" +
                    "Hosana na výsostiach!<br>" +
                    "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                    "Hosana na výsostiach!",
    };
}


