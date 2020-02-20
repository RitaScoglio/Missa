package sk.missa.interfaces;

public interface Svatci {
    /*
    Sviatky svätých počas celého roku v dvojrozmerných poliach: month1, month2...
    {ID, názov, typ slávenia, liturgická farba},
    Polia pre poradie mesiacov (mesiac), dní v týždni (dni), veľkonočnej oktávy (VNdni), Panny Márie v sobotu (maria)

    POMOCNÉ ZNAČKY pre bližšie určenie sviatku:
    ID: nedela = gk
    feria = ""
    maria = 003
    prvy piatok = 001
    trojdnie = 3dni4/5/6
    v - vyrocie posviacky
    g - gloria (sviatok)
    k - kredo (slavnost, vigilia)
    * - vigilia rovnaka ako slavnost
    n - sviatky su aj v nedelu
    + - titul katedrály, mimo sviatku svätého (tj. spomienka, sviatok... v dieceze + feria)
    o - votivna omsa (lubovolna spomienka, ale slavi sa aj pokial v ten den spomienka alebo post)
    p - pohyblivy sviatok
    m - mariansky sviatok (vzdy na konci lebo v misali sa odobera z ID)

    POHYBLIVE SVIATKY
    19.3. - Svätého Jozefa, ženícha Panny Márie, Slávnosť            0gkp
    25.3. - Zvestovanie Pána, Slávnosť                               1gkp
    Zoslanie Ducha Svätého, Vigília                                  2gkp
    Zoslanie Ducha Svätého, Slávnosť                                 3gkp
    Najsvätejšieho Kristovho Tela a Krvi, Slávnosť                   4gkp
    Najsvätejšieho Srdca Ježišovho, Slávnosť                         5gkp
    Nanebovstúpenie Pána                                             6gkp
    Najsvätejšej Trojice - nedela                                    7gkp
    Nedeľa Krista Kráľa                                              8gkp
    8.12. - Nepoškvrnené počatie Panny Márie, Slávnosť               9gkp
    Svätej rodiny                                                    10gkp
    Krst Krista Pána                                                 11gkp
    Svätodušný pondelok, Votívna omša                                1op
    Preblahoslavenej Panny Márie, Matky Cirkvi, Spomienka            2pm
    Nášho Pána Ježiša Krista, najvyššieho a večného kňaza, Sviatok   3gp
    Nepoškvrneného Srdca Panny Márie, Spomienka                      4pm


    OBDOBIA
    Cezročné    c
    Advent      a
    Vianočné    v
    Pôstne      p
    Veľkonočné  n
    => posledne pismeno v ID symbolizuje obdobie, v ktorom sa daný deň nachádza, toto písmeno sa prideľuje k sviatku vo funkciach v triede Main a následne sa odstráňuje pri zisťovaní obdobia vo funkcii v triede Misal
    */
    String[] mesiac = {"január", "február", "marec", "apríl", "máj", "jún", "júl", "august", "september", "október", "november", "december"};
    String[] dni = {"Nedeľa", "Pondelok", "Utorok", "Streda", "Štvrtok", "Piatok", "Sobota"};
    String[] VNdni = {"Nedeľa", "Veľkonočný pondelok", "Veľkonočný utorok", "Veľkonočná streda", "Veľkonočný štvrtok", "Veľkonočný piatok", "Veľkonočná sobota"};
    String[] maria = {"", "Panny Márie v sobotu", "Ľubovoľná spomienka", "(biela)"};
    String[] cisla_m = {"Prvý", "Druhý", "Tretí", "Štvrtý", "Piaty", "Šiesty", "Siedmy"};
    String[] cisla_z = {"Prvá", "Druhá", "Tretia", "Štvrtá", "Piata", "Šiesta", "Siedma"};

    //SVIATKY V MESIACOCH V ROKU
    String[][] month1 ={
            {"01gk", "Slávnosť Panny Márie Bohorodičky", "Slávnosť", "(biela)"},
            {"02a", "Sv. Bazila Veľkého a Gregora Nazianského, biskupov a učiteľov Cirkvi", "Spomienka", "(biela)"},
            {"03a", "Najsvätejšieho mena Ježiš", "Ľubovoľná spomienka", "(biela)"},
            {"06gk", "Zjavenie Pána", "Slávnosť", "(biela)"},
            {"07", "Sv. Rajmunda z Peňafortu, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"13", "Sv. Hilára, biskupa a učiteľa Cirkvi", "Ľubovoľná spomienka", "(biela)"},
            {"17", "Sv. Antona, opáta", "Spomienka", "(biela)"},
            {"20a", "Sv. Fabiána, pápeža a mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"20b", "Sv. Šebastiána, mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"20g+", "ORDINARIÁT OZBROJENÝ SÍL A OZBROJENÝCH ZBOROV SR:\nSv. Šebastiána, mučeníka (Hlavný patrón ordinariátu a titul katedraly)", "Sviatok", "(červená)"},
            {"21", "Sv. Agnesy, panny a mučenice", "Spomienka", "(červená)"},
            {"22", "Sv. Vincenta, diakona a mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"24", "Sv. Františka Saleského, biskupa a učiteľa Cirkvi", "Spomienka", "(biela)"},
            {"25g", "Obrátenie sv. Pavla, apoštola", "Sviatok", "(biela)"},
            {"26", "Sv. Timoteja a Títa, biskupov", "Spomienka", "(biela)"},
            {"27", "Sv. Angely Merici, panny", "Ľubovoľná spomienka", "(biela)"},
            {"28", "Sv. Tomáša Akvinského, kňaza a učiteľa Cirkvi", "Spomienka", "(biela)"},
            {"31", "Sv. Jána Bosca, kňaza", "Spomienka", "(biela)"},
    };

    String[][] month2 ={
            {"02g", "Obetovanie Pána", "Sviatok", "(biela)"},
            {"03a", "Sv. Blažeja, biskupa a mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"03b", "Sv. Oskara, biskupa", "Ľubovoľná spomienka", "(biela)"},
            {"05", "Sv. Agáty, panny a mučenice", "Spomienka", "(červená)"},
            {"06", "Sv. Mikiho a spoločníkov, mučeníkov", "Spomienka", "(červená)"},
            {"08a", "Sv. Hieronyma Emilianiho", "Ľubovoľná spomienka", "(biela)"},
            {"08b", "Sv. Jozefíny Bakhity, panny", "Ľubovoľná spomienka", "(biela)"},
            {"10", "Sv. Školastiky, pannny", "Spomienka", "(biela)"},
            {"11m", "Preblahoslavenej Panny Márie Lurdskej", "Ľubovoľná spomienka", "(biela)"},
            {"14o", "Sv. Cyrila, mnícha a Sv. Metóda, biskupa, patrónov Európy", "Votívna omša", "(biela)"},
            {"14g+", "ŽILINSKÁ DIECÉZA: Sv. Cyrila, mnícha a Sv. Metóda, biskupa (Hlavných patrónov diecézy)", "Sviatok", "(biela)"},
            {"17", "Siedmich svätých zakladateľov Rehole služobníkov Panny Márie", "Ľubovoľná spomienka", "(biela)"},
            {"21", "Sv. Petra Damianiho, biskupa a učiteľa Cirkvi", "Ľubovoľná spomienka", "(biela)"},
            {"22g", "Katedra sv. Petra, apoštola", "Sviatok", "(biela)"},
            {"23", "Sv. Polykarpa, biskupa a mučeníka", "Spomienka", "(červená)"},
    };
    String[][] month3 ={
            {"04", "Sv. Kazimíra", "Ľubovoľná spomienka", "(biela)"},
            {"07", "Sv. Perpetuy a Felicity, mučeníc", "Spomienka", "(červená)"},
            {"08", "Sv. Jána z Boha, rehoľníka", "Ľubovoľná spomienka", "(biela)"},
            {"09", "Sv. Františky Rímskej, rehoľníčky", "Ľubovoľná spomienka", "(biela)"},
            {"10gv", "BRATISLAVSKÁ ARCIDIECÉZA: Výročie posviacky katedrálneho chrámu svätého Martina z Tours", "Sviatok", "(biela)"},
            {"17", "Sv. Patrika, biskupa", "Ľubovoľná spomienka", "(biela)"},
            {"18", "Sv. Cyrila Jeruzalemského, biskupa a učiteľa Cirkvi", "Ľubovoľná spomienka", "(biela)"},
            {"23", "Sv. Turibia de Mongrovejo, biskupa", "Ľubovoľná spomienka", "(biela)"},
    };
    String[][] month4 ={
            {"02", "Sv. Františka z Paoly, pustovníka", "Ľubovoľná spomienka", "(biela)"},
            {"04", "Sv. Izidora, biskupa a učiteľa Cirkvi", "Ľubovoľná spomienka", "(biela)"},
            {"05", "Sv. Vincenta Ferrera, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"07", "Sv. Jána Krstiteľa de la Salle, kňaza", "Spomienka", "(biela)"},
            {"11", "Sv. Stanislava, biskupa a mučeníka", "Spomienka", "(červená)"},
            {"13", "Sv. Martina I., pápeža a mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"21", "Sv. Anzelma, biskupa a učiteľa Cirkvi", "Ľubovoľná spomienka", "(biela)"},
            {"23", "Sv. Vojtecha, biskupa a mučenika", "Spomienka", "(červená)"},
            {"24a", "Sv. Juraja, mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"24b", "Sv. Fidéla zo Sigmaringenu, kňaza a mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"25g", "Sv. Marka, evanjelistu", "Sviatok", "(biela)"},
            {"28a", "Sv. Petra Chanela, kňaza a mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"28b", "Sv. Ľudovíta Máriu Grigniona z Montfortu, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"29g", "Sv. Kataríny Sienskej, panny a učiteľky Cirkvi, patrónky Európy", "Sviatok", "(biela)"},
            {"30", "Sv. Pia V., pápeža", "Ľubovoľná spomienka", "(biela)"},
    };
    String[][] month5 ={
            {"01", "Svätého Jozefa, robotníka", "Ľubovoľná spomienka", "(biela)"},
            {"02", "Sv. Atanáza, biskupa a učiteľa Cirkvi", "Spomienka", "(biela)"},
            {"03g", "Sv. Filipa a Jakuba, apoštolov", "Sviatok", "(červená)"},
            {"04", "Sv. Floriána, mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"11", "Bl. Sáry Salkaháziovej, panny a mučenice", "Ľubovoľná spomienka", "(červená)"},
            {"12a", "Sv. Nerea a Achila, mučeníkov", "Ľubovoľná spomienka", "(červená)"},
            {"12b", "Sv. Pankráca, mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"13m", "Blahoslavenej Panny Márie Fatimskej", "Ľubovoľná spomienka", "(biela)"},
            {"14g", "Sv. Mateja, apoštola", "Sviatok", "(červená)"},
            {"16", "Sv. Jána Nepomuckého, kňaza a mučeníka", "Spomienka", "(červená)"},
            {"16g", "ROŽŇAVSKÁ DIECÉZA: Sv. Jána Nepomuckého, kňaza a mučeníka (Hlavný patrón diecézy)", "Sviatok", "(červená)"},
            {"18", "Sv. Jána I., pápeža a mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"20", "Sv. Bernardína Sienského, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"21", "Sv. Krištofa Magallanesa, kňaza a spoločníkov, mučeníkov", "Ľubovoľná spomienka", "(červená)"},
            {"22", "Sv. Rity z Cascie, rehoľníčky", "Ľubovoľná spomienka", "(biela)"},
            {"25a", "Sv. Bédu Ctihodného, kňaza a učiteľov Cirkvi", "Ľubovoľná spomienka", "(biela)"},
            {"25b", "Sv. Gregora VII., pápeža", "Ľubovoľná spomienka", "(biela)"},
            {"25c", "Sv. Márie Magdalény de' Pazzi, panny", "Ľubovoľná spomienka", "(biela)"},
            {"26", "Sv. Filipa Neriho, kňaza", "Spomienka", "(biela)"},
            {"27", "Sv. Augustína z Canterbury, biskupa", "Ľubovoľná spomienka", "(biela)"},
            {"29", "Sv. Pavol VI., pápeža", "Ľubovoľná spomienka", "(biela)"},
    };
    String[][] month6 = {
            {"01", "Sv. Justína, mučeníka", "Spomienka", "(červená)"},
            {"02", "Sv. Marcelína a Petra, mučeníkov", "Ľubovoľná spomienka", "(červená)"},
            {"03", "Sv. Karola Lwangu a spoločníkov, mučeníkov", "Spomienka", "(červená)"},
            {"05", "Sv. Bonifáca, biskupa a mučeníka", "Spomienka", "(červená)"},
            {"06", "Sv. Norberta, biskupa", "Ľubovoľná spomienka", "(biela)"},
            {"09", "Sv. Efréma, diakona a učiteľa cirkvi", "Ľubovoľná spomienka", "(biela)"},
            {"11", "Sv. Barnabáša, apoštola", "Spomienka", "(červená)"},
            {"13", "Sv. Antona Paduánskeho, kňaza a učiteľa Cirkvi", "Spomienka", "(biela)"},
            {"13gv", "ORDINARIÁT OZBROJENĆH SÍL A OZBROJENÝCH ZBOROV SR: Výročie posviacky katedrálneho chrámu", "Sviatok", "(biela)"},
            {"16", "ROŽŇAVSKÁ DIECÉZA: Sv. Neita, mučeníka", "Spomienka", "(červená)"},
            {"19", "Sv. Romualda, opáta", "Ľubovoľná spomienka", "(biela)"},
            {"21", "Sv. Alojza Gonzágu, rehoľníka", "Spomienka", "(biela)"},
            {"22a", "Sv. Pavlína z Noly, biskupa", "Ľubovoľná spomienka", "(biela)"},
            {"22b", "Sv. Jána Fishera, biskupa, a sv. Tomáša Morusa, mučeníkov", "Ľubovoľná spomienka", "(červená)"},
            {"23gk", "Narodenie sv. Jána Krstiteľa", "Vigília", "(biela)"},
            {"24gk", "Narodenie sv. Jána Krstiteľa\n(TRNAVA: Hlavný patrón arcidiecézy a titul katedrály)", "Slávnosť", "(biela)"},
            {"27b", "Sv. Cyrila Alexandrijského, biskupa a učiteľa Cirkvi", "Ľubovoľná spomienka", "(biela)"},
            {"27a", "TRNAVSKÁ ARCIDIECÉZA, BANSKOBYSTRICKÁ, NITRIANSKÁ A ROŽŇAVSKÁ DIECÉZA: Sv. Ladislava", "Ľubovoľná spomienka", "(biela)"},
            {"28", "Sv. Ireneja, biskupa a mučeníka", "Spomienka", "(červená)"},
            {"28gk", "Sv. Petra a Pavla, apoštolov", "Vigília", "(červená)"},
            {"29gk", "Sv. Petra a Pavla, apoštolov", "Slávnosť", "(červená)"},
            {"30", "Prvých svätých mučeníkov Cirkvi v Ríme", "Ľubovoľná spomienka", "(červená)"},
    };
    String[][] month7 = {
            {"02gm", "Návšteva Panny Márie", "Sviatok", "(biela)"},
            {"03g", "Sv. Tomáša, apoštola", "Sviatok", "(červená)"},
            {"04", "Sv. Alžbety Portugalskej", "Ľubovoľná spomienka", "(biela)"},
            {"04*", "Sv. Cyrila a Metoda, slovanských vierozvestov", "Vigília", "(biela)"},
            {"05gk", "Sv. Cyrila a Metoda, slovanských vierozvestov", "Slávnosť", "(biela)"},
            {"06", "Sv. Márie Goretti, panny a mučenice", "Ľubovoľná spomienka", "(červená)"},
            {"07", "Sv. Antona Márie Zaccariu, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"09", "Sv. Augustína Zhao Rong, kňaza, a spoločníkov, mučeníkov", "Ľubovoľná spomienka", "(červená)"},
            {"11g", "Sv. Benedikta, opáta, patróna Európy", "Sviatok", "(biela)"},
            {"12", "Sv. Louis a Zélia Martinovci", "Ľubovoľná spomienka", "(biela)"},
            {"13", "Sv. Henricha", "Ľubovoľná spomienka", "(biela)"},
            {"14", "Sv. Kamila de Lellis, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"15", "Sv. Bonaventúru, biskupa a učiteľa Cirkvi", "Spomienka", "(biela)"},
            {"16m", "Preblahoslavenej Panny Márie Karmelskej", "Ľubovoľná spomienka", "(biela)"},
            {"17", "Sv. Andreja-Svorada a Benedikta, pustovníkov", "Spomienka", "(biela)"},
            {"17g", "NITRIANSKA DIECÉZA: Svätých Andreja-Svorada a Benedikta, pustovníkov (Hlavných patrónov diecézy)", "Sviatok", "(biela)"},
            {"17gk", "NITRA (iba v meste Nitra): Svätého Andreja-Svorada (Patrón mesta)", "Slávnosť", "(biela)"},
            {"20", "Sv. Apolinára, biskupa a mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"21", "Sv. Vavrinca z Brindisi, kňaza a učiteľa Cirkvi", "Ľubovoľná spomienka", "(biela)"},
            {"22g", "Sv. Márie Magdalény", "Sviatok", "(biela)"},
            {"23g", "Sv. Brigity, rehoľníčky, patrónky Európy", "Sviatok", "(biela)"},
            {"24", "Sv. Šarbela Makhlufa, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"25g", "Sv. Jakuba, apoštola", "Sviatok", "(červená)"},
            {"26", "Sv. Joachima a Anny, rodičov Panny Márie", "Spomienka", "(biela)"},
            {"27", "Sv. Gorazda a spoločníkov", "Spomienka", "(biela)"},
            {"29", "Sv. Marty", "Spomienka", "(biela)"},
            {"30", "Sv. Petra Chryzológa, biskupa a učiteľa Cirkvi", "Ľubovoľná spomienka", "(biela)"},
            {"30b", "Bl. Zdenky Cecílie Schelingovej, panny a mučenice", "Ľubovoľná spomienka", "(červená)"},
            {"31", "Sv. Ignáca z Loyoly, kňaza", "Spomienka", "(biela)"},
    };
    String[][] month8 = {
            {"01", "Sv. Alfonza Márie deʼ Liguori, biskupa a učiteľa Cirkvi", "Spomienka", "(biela)"},
            {"02a", "Sv. Euzébia Vercellského, biskupa", "Ľubovoľná spomienka", "(biela)"},
            {"02b", "Sv. Petra Juliána Eymard, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"04", "Sv. Jána Máriu Vianneya, kňaza", "Spomienka", "(biela)"},
            {"05", "Výročie posviacky hlavnej mariánskej baziliky v Ríme", "Ľubovoľná spomienka", "(biela)"},
            {"06gn", "Premenenie Pána", "Sviatok", "(biela)"},
            {"07a", "Sv. Sixta II., pápeža, a jeho spoločníkov, mučeníkov", "Ľubovoľná spomienka", "(červená)"},
            {"07b", "Sv. Kajetána, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"08", "Sv. Dominika, kňaza", "Spomienka", "(biela)"},
            {"09g", "Sv. Terézie Benedikty od Kríža, panny a mučenice, patrónky Európy", "Sviatok", "(červená)"},
            {"10g", "Sv. Vavrinca, diakona a mučeníka", "Sviatok", "(červená)"},
            {"11", "Sv. Kláry, panny", "Spomienka", "(biela)"},
            {"12", "Sv. Jany Františky de Chantal, rehoľníčky", "Ľubovoľná spomienka", "(biela)"},
            {"13", "Sv. Ponciána, pápeža, a sv. Hypolita, kňaza, mučeníkov", "Ľubovoľná spomienka", "(červená)"},
            {"14", "Sv. Maximiliána Máriu Kolbeho, kňaza a mučeníka", "Spomienka", "(červená)"},
            {"14gkm", "Nanebovzatie Panny Márie", "Vigília", "(biela)"},
            {"15gkm", "Nanebovzatie Panny Márie", "Slávnosť", "(biela)"},
            {"16", "Sv. Štefana Uhorského", "Ľubovoľná spomienka", "(biela)"},
            {"18", "Sv. Heleny", "Ľubovoľná spomienka", "(biela)"},
            {"19", "Sv. Jána Eudes, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"20", "Sv. Bernarda, opáta a učiteľa Cirkvi", "Spomienka", "(biela)"},
            {"21", "Sv. Pia X., pápeža", "Spomienka", "(biela)"},
            {"22m", "Panny Márie Kráľovnej", "Spomienka", "(biela)"},
            {"23", "Sv. Ruženy Limskej, panny", "Ľubovoľná spomienka", "(biela)"},
            {"24g", "Sv. Bartolomeja, apoštola", "Sviatok", "(biela)"},
            {"25a", "Sv. Ľudovíta", "Ľubovoľná spomienka", "(biela)"},
            {"25b", "Sv. Jozefa Kalazanského, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"27", "Sv. Moniky", "Spomienka", "(biela)"},
            {"28", "Sv. Augustína, biskupa a učiteľa Cirkvi", "Spomienka", "(biela)"},
            {"29", "Mučenícka smrť sv. Jána Krstiteľa", "Spomienka", "(červená)"},
            {"30gv", "TRNAVSKÁ ARCIDIECÉZA: Výročie posviacky katedrálneho chrámu svätého Jána Krstiteľa v Trnave", "Sviatok", "(biela)"},
    };
    String[][] month9 = {
            {"03", "Sv. Gregora Veľkého, pápeža a učiteľa Cirkvi", "Spomienka", "(biela)"},
            {"06gv", "KOŠICKÁ ARCIDIECÉZA: Výročie posviacky katedrálného chrámu svätej Alžbety", "Sviatok", "(biela)"},
            {"07", "Sv. Marka Križina, Melichara Grodzieckého a Štefana Pongrácza, kňazov a mučeníkov", "Spomienka", "(červená)"},
            {"08gm", "Narodenie Panny Márie", "Sviatok", "(biela)"},
            {"09", "Sv. Petra Clavera, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"12m", "Najsvätejšieho mena Panny Márie", "Ľubovoľná spomienka", "(biela)"},
            {"13", "Sv. Jána Zlatoústeho, biskupa a učiteľa Cirkvi", "Spomienka", "(biela)"},
            {"14gn", "Povýšenie svätého kríža", "Sviatok", "(červená)"},
            //{"14*", "Sedembolestnej Panny Márie, patrónky Slovenska", "Vigília", "(biela)"},
            {"15gkm", "Sedembolestnej Panny Márie, patrónky Slovenska", "Slávnosť", "(biela)"},
            {"16", "Sv. Kornélia, pápeža, a sv. Cypriána, biskupa, mučeníkov", "Spomienka", "(červená)"},
            {"17", "Sv. Róberta Bellarmína, biskupa a učiteľa Cirkvi", "Ľubovoľná spomienka", "(biela)"},
            {"19", "Sv. Januára, biskupa a mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"20", "Sv. Ondreja Kim Taegona, kňaza, a Pavla Chong Hasanga a spoločníkov, mučeníkov", "Spomienka", "(červená)"},
            {"21g", "Sv. Matúša, apoštola a evanjelistu", "Sviatok", "(červená)"},
            {"22+", "NITRIANSKA DIECÉZA: Sv. Emeráma, biskupa a mučeníka, titul katedrály", "Spomienka", "(červená)"},
            {"23", "Sv. Pia z Pietrelčiny, kňaza", "Spomienka", "(biela)"},
            {"24gv", "BANSKOBYSTRICKÁ DIECÉZA: Výročie posviacky katedrálneho chrámu svätého Františka Xaverského v Banskej Bystrici", "Sviatok", "(biela)"},
            {"26", "Sv. Kozmu a Damiána, mučeníkov", "Ľubovoľná spomienka", "(červená)"},
            {"27", "Sv. Vincenta de Paul, kňaza", "Spomienka", "(biela)"},
            {"28a", "Sv. Václava, mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"28b", "Sv. Vavrinca Ruiza a spoločníkov, mučeníkov", "Ľubovoľná spomienka", "(červená)"},
            {"29g", "Sv. Michala, Gabriela a Rafaela, archanjelov", "Sviatok", "(biela)"},
            {"30", "Sv. Hieronyma, kňaza a učiteľa Cirkvi", "Spomienka", "(biela)"},
    };
    String[][] month10 = {
            {"01", "Sv. Terézie z Lisieux, panny a učiteľky Cirkvi", "Spomienka", "(biela)"},
            {"02", "Svätých anjelov strážcov", "Spomienka", "(biela)"},
            {"04", "Sv. Františka Assiského", "Spomienka", "(biela)"},
            {"05", "Sv. Faustíny Kowalskej, panny", "Ľubovoľná spomienka", "(biela)"},
            {"06", "Sv. Bruna, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"07m", "Ružencovej Panny Márie", "Spomienka", "(biela)"},
            {"09a", "Sv. Dionýza, biskupa, a spoločníkov, mučeníkov", "Ľubovoľná spomienka", "(červená)"},
            {"09b", "Sv. Jána Leonardiho, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"11", "Sv. Ján XXIII., pápeža", "Ľubovoľná spomienka", "(biela)"},
            {"10gv", "ŽILINSKÁ DIECÉZA: Výročie posviacky katedrálného chrámu Najsvätejšej Trojice", "Sviatok", "(biela)"},
            {"14", "Sv. Kalixta I., pápeža a mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"15", "Sv. Terézie od Ježiša, panny a učiteľky Cirkvi", "Spomienka", "(biela)"},
            {"16a", "Sv. Hedvigy, rehoľníčky", "Ľubovoľná spomienka", "(biela)"},
            {"16b", "Sv. Margity Márie Alacoque, panny", "Ľubovoľná spomienka", "(biela)"},
            {"16c", "Sv. Gála, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"17", "Sv. Ignáca Antiochijského, biskupa a mučeníka", "Spomienka", "(červená)"},
            {"18g", "Sv. Lukáša, evanjelistu", "Sviatok", "(červená)"},
            {"19a", "Sv. Jána de Brébeuf a Izáka Jogues, kňazov, a ich spoločníkov, mučeníkov", "Ľubovoľná spomienka", "(červená)"},
            {"19b", "Sv. Pavla z Kríža, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"22", "Sv. Jána Pavla II., pápeža", "Ľubovoľná spomienka", "(biela)"},
            {"23", "Sv. Jána Kapistránskeho, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"24", "Sv. Antona Máriu Clareta, biskupa", "Ľubovoľná spomienka", "(biela)"},
            {"25", "Sv. Maura, biskupa", "Ľubovoľná spomienka", "(biela)"},
            {"25gv", "SPIŠSKÁ DIECÉZA: Výročie posviacky katedrálného chrámu svätého Martina z Tours", "Sviatok", "(biela)"},
            {"26gk+", "Výročie posviacky chrámov, ktorých deň posviacky nie je známy", "Slávnosť", "(biela)"},
            {"27gv", "ROŽNAVSKÁ DIECÉZA: Výročie posviacky katedrálného chrámu Nanebovzatia Panny Márie", "Sviatok", "(biela)"},
            {"28g", "Sv. Šimona a Júdu, apoštolov", "Sviatok", "(červená)"},
            {"31gk", "Všetkých svätých", "Vigília", "(biela)"},
    };
    String[][] month11 = {
            {"01gk", "Všetkých svätých", "Slávnosť", "(biela)"},
            {"02an", "Spomienka na všetkých verných zosnulých (1.)", "Spomienka", "(fialová)"},
            {"02bn", "Spomienka na všetkých verných zosnulých (2.)", "Spomienka", "(fialová)"},
            {"02cn", "Spomienka na všetkých verných zosnulých (3.)", "Spomienka", "(fialová)"},
            {"03", "Sv. Martina de Porres, rehoľníka", "Ľubovoľná spomienka", "(biela)"},
            {"04", "Sv. Karola Boromejského, biskupa", "Spomienka", "(biela)"},
            {"05", "Sv. Imricha", "Ľubovoľná spomienka", "(biela)"},
            {"09g", "Výročie posviacky Lateránskej baziliky", "Sviatok", "(biela)"},
            {"10", "Sv. Leva Veľkého, pápeža a učiteľa Cirkvi", "Spomienka", "(biela)"},
            {"11", "Sv. Martina z Tours, biskupa", "Spomienka", "(biela)"},
            {"11g", "BRATISLAVSKA ARCIDIECÉZA A SPIŠSKÁ DIECÉZA: Sv. Martina z Tours, biskupa (Hlavný patrón Bratislavskej arcidiecézy a Spišskej diecézy a titul katedrál)", "Sviatok", "(biela)"},
            {"12", "Sv. Jozafáta, biskupa a mučeníka", "Spomienka", "(červená)"},
            {"15", "Sv. Alberta Veľkého, biskupa a učiteľa Cirkvi", "Ľubovoľná spomienka", "(biela)"},
            {"16a", "Sv. Margity Škótskej", "Ľubovoľná spomienka", "(biela)"},
            {"16b", "Sv. Gertrúdy, panny", "Ľubovoľná spomienka", "(biela)"},
            {"17", "Sv. Alžbety Uhorskej, rehoľníčky", "Spomienka", "(biela)"},
            {"17gk", "KOŠICE (iba v meste Košice): Sv. Alžbety Uhorskej, rehoľníčky - Titul katedrály a patrónka mesta Košice", "Slávnosť", "(biela)"},
            {"18", "Výročie posviacky bazilík sv. Petra a sv. Pavla, apoštolov", "Ľubovoľná spomienka", "(biela)"},
            {"20", "KOŠICKÁ ARCIDIECÉZA: Bl. Anny Kolesárovej, panny a mučenice", "Ľubovoľná spomienka", "(červená)"},
            {"20gv", "NITRIANSKA DIECÉZA: Výročie posviacky katedrálneho chrámu svätého Emeráma", "Sviatok", "(biela)"},
            {"21m", "Obetovanie Panny Márie", "Spomienka", "(biela)"},
            {"22", "Sv. Cecílie, panny a mučenice", "Spomienka", "(červená)"},
            {"23a", "Sv. Klementa I., pápeža a mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"23b", "Sv. Kolumbána, opáta", "Ľubovoľná spomienka", "(biela)"},
            {"24", "Sv. Ondreja Dung-Laka, kňaza, a spoločníkov, mučeníkov", "Spomienka", "(červená)"},
            {"25", "Sv. Kataríny Alexandrijskej, panny a mučenice", "Ľubovoľná spomienka", "(červená)"},
            {"30g", "Sv. Ondreja, apoštola\n(KOŠICKÁ ARCIDIECÉZA: Hlavný patrón arcidiecézy)", "Sviatok", "(červená)"},
    };
    String[][] month12 = {
            {"03", "Sv. Františka Xaverského, kňaza", "Spomienka", "(biela)"},
            {"03g", "BANSKOBYSTRICKÁ DIECÉZA: Sv. Františka Xaverského, kňaza (Hlavný patrón diecézy a titul katedrály)", "Sviatok", "(biela)"},
            {"04a", "Sv. Jána Damascénskeho, kňaza a učiteľa Cirkvi", "Ľubovoľná spomienka", "(biela)"},
            {"04b", "Sv. Barbory, panny a mučenice", "Ľubovoľná spomienka", "(červená)"},
            {"06", "Sv. Mikuláša, biskupa", "Ľubovoľná spomienka", "(biela)"},
            {"07", "Sv. Ambróza, biskupa a učiteľa Cirkvi", "Spomienka", "(biela)"},
            {"11", "Sv. Damaza I., pápeža", "Ľubovoľná spomienka", "(biela)"},
            {"12", "Preblahoslavenej Panny Márie Guadalupskej", "Ľubovoľná spomienka", "(biela)"},
            {"13", "Sv. Lucie, panny a mučenice", "Spomienka", "(červená)"},
            {"14", "Sv. Jána z Kríža, kňaza a učiteľa Cirkvi", "Spomienka", "(biela)"},
            {"21a", "Sv. Petra Kanízia, kňaza a učiteľa Cirkvi", "Ľubovoľná spomienka", "(biela)"},
            {"23a", "Sv. Jána Kentského, kňaza", "Ľubovoľná spomienka", "(biela)"},
            {"24gkn", "Narodenie Pána", "Vigília", "(biela)"},
            {"25agkn", "Narodenie Pána (v noci)", "Slávnosť", "(biela)"},
            {"25bgkn", "Narodenie Pána (na úsvite)", "Slávnosť", "(biela)"},
            {"25cgkn", "Narodenie Pána (vo dne)", "Slávnosť", "(biela)"},
            {"26g", "Sv. Štefana, prvého mučeníka", "Sviatok", "(červená)"},
            {"27g", "Sv. Jána, apoštola a evanjelistu", "Sviatok", "(biela)"},
            {"28g", "Sv. Neviniatok, mučeníkov", "Sviatok", "(červená)"},
            {"29a", "Sv. Tomáša Becketa, biskupa a mučeníka", "Ľubovoľná spomienka", "(červená)"},
            {"31a", "Sv. Silvestra I., pápeža", "Ľubovoľná spomienka", "(biela)"},
            {"31gk", "Slávnosť Panny Márie Bohorodičky", "Vigília", "(biela)"},
    };
}
