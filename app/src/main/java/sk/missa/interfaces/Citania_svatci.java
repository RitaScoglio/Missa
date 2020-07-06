package sk.missa.interfaces;

/*
 * Čítania na\u00A0sviatky svätých uložené v\u00A0dvojrozmerných poliach za\u00A0každý mesiac: citanie1_1, citanie2_1, evanjelium1...
 * Čítania pre\u00A0pohyblivé sviatky: citanie1Pohyb, citanie2Pohyb, evanjeliumPohyb
 * {ID sviatku (podľa mesiacov v\u00A0interface Svatci), "", "", súradnice, citát, text},
 * čítanie, ktoré obsahuje alebo: {ID sviatku (podľa mesiacov v\u00A0interface Svatci), "", "", súradnice, citát, text, "Alebo:", súradnice, citát, text...},
 *
 * Keďže sú čitania v\u00A0adventnom a vianočnom období viazané na\u00A0deň, nachádzajú sa uložené v\u00A0mesiaci, ktorému prislúchajú a s\u00A0dňom ako ID
 */


public interface Citania_svatci {
    String[][] citanie1Pohyb = {
            {"0gkp", "", "", "2 Sam 7, 4-5a. 12-14a. 16",
                    "Pán, Boh, mu dá trón jeho otca Dávida",
                    "Čítanie z Druhej knihy Samuelovej<br>" +
                            "Nátanovi zaznelo Pánovo slovo: \"Choď a povedz môjmu služobníkovi Dávidovi: Toto hovorí Pán: Až sa tvoje dni dovŕšia, a ty sa uložíš na\u00A0odpočinok k\u00A0svojim otcom, ustanovím po\u00A0tebe potomka, ktorý bude pochádzať z\u00A0tvojich útrob, a upevním jeho kráľovstvo. On postaví dom môjmu menu a ja upevním jeho kráľovský trón naveky. Ja mu budem otcom a on mi bude synom.<br>" +
                            "Tvoj dom a tvoje kráľovstvo budú trvať predo\u00A0mnou naveky, tvoj trón bude upevnený navždy.\"<br>" +
                            "Počuli sme Božie slovo."},
            //Zoslanie Ducha Svätého(Vigília)
            {"2gkp", "", "", "Gn 11, 1-9",
                    "Mesto sa volá Bábel; lebo tam bola pomätená reč celej zeme",
                    "Čítanie z Knihy Genezis<br>" +
                            "Na celej zemi bol jeden jazyk a rovnaká reč.<br>" +
                            "Keď sa ľudia pohli z\u00A0východu, našli rovinu v\u00A0krajine Sennaar a usadili sa na\u00A0nej.<br>" +
                            "Povedali si: \"Poďte, narobíme tehál a vypálime ich v\u00A0ohni.\" Tehlu používali namiesto kameňa a namiesto malty asfalt.<br>" +
                            "Potom povedali: \"Poďte, postavíme si mesto a vežu, ktorej vrchol bude siahať do\u00A0neba. A urobíme si meno, aby sme sa nerozptýlili po\u00A0celej zemi.\"<br>" +
                            "Pán však zostúpil, aby sa podíval na\u00A0mesto a vežu, ktorú stavali ľudia, a povedal: \"Hľa, sú jeden národ a všetci hovoria jedným jazykom. Toto je začiatok ich činov a už im nebude ťažko urobiť, čo si zaumienili. Poďte, zostúpime a pomätieme tam ich reč, aby nik nerozumel reči druhého.\" Tak ich Pán odtiaľ rozptýlil po\u00A0celej zemi a mesto prestali stavať. Preto sa ono volá Bábel. Lebo tam bola pomätená reč celej zeme a Pán ich odtiaľ rozptýlil po\u00A0celej zemi.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Ex 19, 3-8a. 16-20b",
                    "Pán zostúpil pred\u00A0očami všetkého ľudu na\u00A0vrch Sinaj",
                    "Čítanie z Knihy Exodus<br>" +
                            "Mojžiš vystúpil k\u00A0Bohu. Pán ho zavolal z\u00A0vrchu a povedal: \"Toto povieš domu Jakuba a oznámiš synom Izraela: Sami ste videli, čo som urobil Egypťanom, ako som vás niesol na\u00A0orlích krídlach a priviedol k\u00A0sebe. Ak teda budete počúvať môj hlas a zachovávať moju zmluvu, budete mojím vlastníctvom medzi všetkými národmi; lebo moja je celá zem. Budete mi kráľovstvom kňazov a svätým národom. Toto sú slová, ktoré povieš synom Izraela.\"<br>" +
                            "Mojžiš šiel, zvolal starších ľudu a predniesol im všetko, čo mu Pán nariadil povedať. A všetok ľud naraz odpovedal: \"Splníme všetko, čo Pán povedal.\"<br>" +
                            "Na tretí deň za\u00A0rána začalo hrmieť a blýskať sa; vrch zahalil čierny mrak a zaznieval mohutný zvuk poľnice. Všetok ľud v\u00A0tábore sa chvel od\u00A0strachu.<br>" +
                            "Keď ich Mojžiš vyviedol z\u00A0tábora v\u00A0ústrety Bohu, na\u00A0úpätí vrchu zastali.<br>" +
                            "Vrch Sinaj bol celý zahalený v\u00A0dyme, lebo Pán zostúpil naň v\u00A0ohni. Vystupoval z\u00A0neho dym ako z\u00A0pece a celý vrch sa silno otriasal.<br>" +
                            "Zvuk poľnice bol čoraz silnejší. Mojžiš hovoril a Boh mu odpovedal v\u00A0hrmení. Pán zostúpil na\u00A0vrch Sinaj, na\u00A0končiar vrchu, a Mojžiša povolal na\u00A0končiar.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Ez 37, 1-14",
                    "Suché kosti, vložím do\u00A0vás svojho ducha a ožijete",
                    "Čítanie z Knihy proroka Ezechiela<br>" +
                            "V tých dňoch spočinula na\u00A0mne Pánova ruka, Pán ma v\u00A0duchu vyviedol a postavil uprostred údolia, ktoré bolo plné kostí, a vodil ma zôkol-vôkol pomedzi ne; bolo ich veľmi veľa v\u00A0údolí a boli už celkom zoschnuté. A povedal mi: \"Syn človeka, ožijú tieto kosti?\"<br>" +
                            "Povedal som: \"Pane, ty to vieš.\"<br>" +
                            "Potom mi povedal: \"Prorokuj o\u00A0týchto kostiach a povedz im: Suché kosti, počujte Pánovo slovo! Toto hovorí Pán, Boh, týmto kostiam: Hľa, ja vložím do\u00A0vás ducha a ožijete. Pripevním na\u00A0vás šľachy, nechám vás obrásť mäsom, obtiahnem vás kožou, dám vám ducha, ožijete a spoznáte, že ja som Pán!\"<br>" +
                            "Prorokoval som teda, ako mi rozkázal. Ako som prorokoval, nastal hrkot a pohyb: kosť sa priblížila ku\u00A0kosti, každá k\u00A0svojmu kĺbu. Pozeral som sa a hľa, obložili ich šľachy a mäso a zvrchu ich obtiahla koža, ale ducha v\u00A0nich nebolo.<br>" +
                            "Vtedy mi povedal: \"Prorokuj o\u00A0duchu, prorokuj, syn človeka. Povedz duchu: Toto hovorí Pán, Boh: Duch, príď od\u00A0štyroch vetrov a ovej týchto pozabíjaných, nech ožijú.\"<br>" +
                            "Prorokoval som teda, ako mi rozkázal, a vošiel do\u00A0nich duch. Ožili a postavili sa na\u00A0nohy nesmierne veľké vojsko.<br>" +
                            "Potom mi povedal: \"Syn človeka, tieto kosti, to je celý dom Izraela. Oni hovoria: ‚Zoschli nám kosti, zhynula naša nádej, sme stratení.' Preto prorokuj a povedz im: Toto hovorí Pán, Boh: Ľud môj, ja otvorím vaše hroby, vyvediem vás z\u00A0vašich hrobov a vovediem vás do\u00A0krajiny Izraela. A spoznáte, že ja som Pán, keď otvorím vaše hroby a vyvediem vás z\u00A0vašich hrobov, ľud môj. Vložím do\u00A0vás svojho ducha a ožijete. Usadím vás na\u00A0vlastnej pôde a spoznáte, že ja som Pán. Povedal som a splním,\" hovorí Pán, Boh.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Joel 3, 1-5",
                    "Na svojich služobníkov a služobnice vylejem svojho ducha",
                    "Čítanie z Knihy proroka Joela<br>" +
                            "Toto hovorí Pán: \"Vylejem svojho ducha na\u00A0každé telo a vaši synovia i vaše dcéry budú prorokovať. Vaši starci budú snívať sny a vaši mladíci budú mať videnia. Aj na\u00A0svojich služobníkov a služobnice vylejem v\u00A0tých dňoch svojho ducha. A urobím znamenia na\u00A0nebi i na\u00A0zemi: krv, oheň a stĺpy dymu. Slnko sa premení na\u00A0tmu a mesiac na\u00A0krv, prv, ako príde Pánov deň, veľký a hrozný.<br>" +
                            "Ale každý, kto bude vzývať Pánovo meno, bude zachránený, lebo na\u00A0vrchu Sion a v\u00A0Jeruzaleme bude spása, ako hovorí Pán, aj vo\u00A0zvyškoch, ktoré Pán povolá.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"1gkp", "", "", "Iz 7, 10-14; 8, 10c ",
                    "Hľa, panna počne",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Pán prehovoril k\u00A0Achazovi: \"Žiadaj znamenie od\u00A0Pána, svojho Boha. Žiadaj ho, či v\u00A0hĺbkach podsvetia, alebo hore na\u00A0výsostiach.\"<br>" +
                            "Achaz však povedal: \"Nebudem žiadať, nebudem pokúšať Pána.\"<br>" +
                            "A Izaiáš riekol: \"Počúvajte teda, Dávidov dom. Nestačí, že obťažujete ľudí, ešte aj môjho Boha obťažujete?<br>" +
                            "A preto vám Pán sám dá znamenie: Hľa, panna počne a porodí syna a dá mu meno Emanuel,\" lebo s\u00A0nami je Boh.<br>" +
                            "Počuli sme Božie slovo."},
            {"1op", "", "", "Gal 5, 16-17. 22-23a. 24-25",
                    "Ak žijeme v\u00A0Duchu, podľa Ducha aj konajme",
                    "Čítanie z Listu svätého apoštola Pavla Galaťanom<br>" +
                            "Bratia, žite duchovne a nebudete spĺňať žiadosti tela. Lebo telo si žiada, čo je proti duchu, a duch, čo je proti telu. Navzájom si odporujú, aby ste nerobili to, čo chcete.<br>" +
                            "Ale ovocie Ducha je láska, radosť, pokoj, zhovievavosť, láskavosť, dobrota, vernosť, miernosť, zdržanlivosť.<br>" +
                            "Tí, čo patria Kristovi Ježišovi, ukrižovali telo s\u00A0vášňami a žiadosťami. Ak žijeme v\u00A0Duchu, podľa Ducha aj konajme.<br>" +
                            "Počuli sme Božie slovo."},
            {"2p", "", "", "Gn 3, 9-15. 20",
                    "Matka všetkých žijúcich",
                    "Čítanie z knihy Genezis<br>" +
                            "Keď Adam jedol zo\u00A0stromu, zavolal ho Pán, Boh, a povedal mu: \"Kde si?\"<br>" +
                            "On odpovedal: \"Počul som tvoj hlas v\u00A0záhrade, naľakal som sa, pretože som nahý, a skryl som sa.\"<br>" +
                            "Opýtal sa ho: \"Kto ťa upozornil, že si nahý, ak si nejedol zo\u00A0stromu, z\u00A0ktorého som ti jesť zakázal?\"<br>" +
                            "Adam odpovedal: \"Žena, ktorú si mi dal za\u00A0spoločníčku, dala mi zo\u00A0stromu a jedol som.\"<br>" +
                            "Pán, Boh, povedal žene: \"Čo si to urobila?\"<br>" +
                            "Žena odpovedala: \"Had ma naviedol a jedla som.\"<br>" +
                            "Tu povedal Pán, Boh, hadovi: \"Pretože si to urobil, prekliaty budeš medzi všetkými krotkými a divými zvieratami. Po\u00A0bruchu sa budeš plaziť a prach hltať po\u00A0všetky dni svojho života. Nepriateľstvo ustanovujem medzi tebou a ženou, medzi tvojím potomstvom a jej potomstvom; ono ti rozšliape hlavu a ty mu zraníš pätu.\"<br>" +
                            "A nazval Adam svoju ženu Evou, pretože bola matkou všetkých žijúcich.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Sk 1, 12-14",
                    "Zotrvávali na\u00A0modlitbách spolu s\u00A0Ježišovou matkou Máriou",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď bol Ježiš vzatý do\u00A0neba, apoštoli sa vrátili do\u00A0Jeruzalema z\u00A0hory, ktorá sa volá Olivová a je blízko Jeruzalema, vzdialená toľko, koľko je dovolené prejsť v\u00A0sobotu. <br>" +
                            "Keď ta prišli, vystúpili do\u00A0hornej siene, kde sa zdržiavali Peter a Ján, Jakub a Ondrej, Filip a Tomáš, Bartolomej a Matúš, Jakub Alfejov, Šimon Horlivec a Júda Jakubov. <br>" +
                            "Títo všetci jednomyseľne zotrvávali na\u00A0modlitbách spolu so\u00A0ženami, s\u00A0Ježišovou matkou Máriou a s\u00A0jeho bratmi.<br>" +
                            "Počuli sme Božie slovo."},

            // Nášho Pána Ježiša Krista, najvyššieho a večného kňaza
            {"3gp", "A", "", "Gn 22, 9-18",
                    "Obeta nášho Patriarchu Abraháma",
                    "Čítanie z knihy Genezis <br>" +
                            "Abrahám a Izák došli na\u00A0miesto, ktoré mu ukázal Boh. Abrahám postavil oltár, poukladal naň drevo, zviazal svojho syna Izáka a položil ho na\u00A0oltár, na\u00A0drevo. Potom Abrahám vystrel ruku, vzal nôž a chcel obetovať svojho syna.<br>" +
                            "Ale v\u00A0tom naň zavolal anjel Pána z\u00A0neba: \"Abrahám, Abrahám!\" On odpovedal: \"Tu som.\" Anjel mu povedal: \"Nevzťahuj svoju ruku na\u00A0chlapca a neublíž mu! Teraz viem, že sa bojíš Boha, veď si mi neodoprel svojho jediného syna.\"<br>" +
                            "Abrahám zdvihol oči a uzrel barana zachyteného rohami v\u00A0kroví. Vzal ho a obetoval namiesto svojho syna. A toto miesto nazval: \"Pán sa stará\" a tak sa až po\u00A0dnes hovorí: \"Na vrchu Pán sa stará.\"<br>" +
                            "Anjel Pána znova zavolal z\u00A0neba na\u00A0Abraháma: \"Na seba samého prisahám – taký je výrok Pána –: Pretože si toto urobil a neodoprel si mi svojho jediného syna, požehnám ťa a rozmnožím tvoje potomstvo ako hviezdy na\u00A0nebi a ako piesok na\u00A0brehu mora a tvoje potomstvo sa zmocní brán svojich nepriateľov. A pretože si poslúchol môj hlas, v\u00A0tvojom potomstve budú požehnané všetky národy zeme.\"<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Hebr 10, 4-10",
                    "Vo zvitku knihy je napísané o\u00A0mne –, aby som plnil tvoju vôľu, Bože",
                    "Čítanie z Listu Hebrejom<br>" +
                            "Bratia, je nemožné, aby krv býkov a capov odstránila hriechy. Preto keď prichádza na\u00A0svet, hovorí: \"Nechcel si obetu ani dar, ale dal si mi telo. Nepáčili sa ti zápalné obety ani obety za\u00A0hriech. Vtedy som povedal: Hľa prichádzam – vo\u00A0zvitku knihy je napísané o\u00A0mne –, aby som plnil tvoju vôľu, Bože.\"<br>" +
                            "Najprv hovorí: \"Obety a dary, ani obety zápalné ani obety za\u00A0hriech si nechcel, ani sa ti nepáčili\" – a ony sa prinášajú podľa zákona. Potom povedal: \"Hľa, prichádzam, aby som plnil tvoju vôľu.\" Ruší prvé, aby ustanovil druhé.<br>" +
                            "V tejto vôli sme posvätení obetou tela Krista Ježiša raz a navždy.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "Jer 31, 31-34",
                    "Uzavriem novú zmluvu a na\u00A0ich hriech si už nespomeniem",
                    "Čítanie z Knihy proroka Jeremiáša<br>" +
                            "\"Hľa, prichádzajú dni, hovorí Pán, keď uzavriem s\u00A0domom Izraela a s\u00A0domom Júdu novú zmluvu; nie takú zmluvu, akú som uzavrel s\u00A0ich otcami v\u00A0ten deň, keď som ich vzal za\u00A0ruku a vyviedol z\u00A0egyptskej krajiny, a oni túto zmluvu porušili, hoci ja som bol ich Pánom, hovorí Pán.<br>" +
                            "Takáto bude zmluva, ktorú po\u00A0tých dňoch uzavriem s\u00A0domom Izraela, hovorí Pán: Svoj zákon vložím do\u00A0ich vnútra a vpíšem ho do\u00A0ich srdca; ja budem ich Bohom a oni budú mojím ľudom.<br>" +
                            "Nik nebude poúčať svojho blížneho ani brat brata slovami: ‚Poznaj Pána!', lebo ma budú poznať všetci, malí i veľkí, hovorí Pán. Odpustím im ich neprávosť a na\u00A0ich hriech si už nespomeniem.\"<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Hebr 10, 11-18",
                    "Navždy zdokonalil tých, čo sa posväcujú",
                    "Čítanie z Listu Hebrejom<br>" +
                            "Každý kňaz koná denne bohoslužbu a veľa ráz prináša tie isté obety, ktoré nikdy nemôžu odstrániť hriechy.<br>" +
                            "No Kristus priniesol jedinú obetu za\u00A0hriechy a navždy zasadol po\u00A0pravici Boha. A teraz už čaká, kým mu nebudú jeho nepriatelia položení ako podnožka pod\u00A0nohy. Lebo jedinou obetou navždy zdokonalil tých, čo sa posväcujú.<br>" +
                            "Dosvedčuje nám to i Duch Svätý, keď povedal: \"Toto je zmluva, ktorú s\u00A0nimi uzavriem po\u00A0tých dňoch, hovorí Pán: svoje zákony vložím do\u00A0ich sŕdc a vpíšem im ich do\u00A0mysle; a na\u00A0ich hriechy a neprávosti si už viac nespomeniem.\"<br>" +
                            "A kde sú ony odpustené, tam už niet obety za\u00A0hriech.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "Iz 6, 1-4. 8",
                    "Svätý, svätý, svätý je Pán zástupov",
                    "Čítanie z knihy proroka Izaiáša<br>" +
                            "V tom roku, keď zomrel kráľ Oziáš, videl som Pána sedieť na\u00A0vysokom a vznešenom tróne; lem jeho rúcha napĺňal svätyňu.<br>" +
                            "Vedľa neho stáli serafíni; aj jeden mal šesť krídel aj druhý mal šesť krídel: dvoma si zakrýval tvár, dvoma si zakrýval nohy a dvoma lietal. A jeden druhému volal:<br>" +
                            "\"Svätý, svätý, svätý je Pán zástupov, celá zem je plná jeho slávy.\"<br>" +
                            "Prahy dverí sa chveli od\u00A0hlasu volajúceho a dom sa naplnil dymom. Potom som počul Pánov hlas. Hovoril: \"Koho mám poslať, kto nám pôjde?\" I povedal som: \"Hľa, tu som, mňa pošli.\"<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Hebr 2, 10-18",
                    "Ten, čo posväcuje, aj tí, čo sú posväcovaní, všetci pochádzajú z\u00A0jedného",
                    "Čítanie z Listu Hebrejom<br>" +
                            "Bratia, patrilo sa, aby Boh, pre\u00A0ktorého je všetko a skrze ktorého je všetko, ktorý priviedol mnoho synov do\u00A0slávy, zdokonalil pôvodcu ich spásy utrpením. Lebo aj ten, čo posväcuje, aj tí, čo sú posväcovaní, všetci pochádzajú z\u00A0jedného. Preto sa nehanbí volať ich bratmi, keď hovorí: \"Tvoje meno zvestujem svojim bratom a uprostred zhromaždenia budem ťa velebiť.\" Ďalej: \"Ja budem v\u00A0neho dúfať.\" A zasa: \"Hľa, ja i deti, ktoré mi dal Boh.\"<br>" +
                            "A pretože deti majú účasť na\u00A0krvi a tele, aj on mal podobne spoluúčasť na\u00A0nich, aby smrťou zničil toho, ktorý vládol smrťou, čiže diabla, a vyslobodil tých, ktorých celý život zotročoval strach pred\u00A0smrťou. Veď sa neujíma anjelov, ale ujíma sa Abrahámovho potomstva. Preto sa vo\u00A0všetkom musel pripodobniť bratom, aby sa stal milosrdným a verným veľkňazom pred\u00A0Bohom a odčinil hriechy ľudu. A pretože sám prešiel skúškou utrpenia, môže pomáhať tým, ktorí sú skúšaní.<br>" +
                            "Počuli sme Božie slovo."},
            {"6gkp", "", "", "Sk 1, 1-11",
                    "Pred ich očami sa vzniesol",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Milý Teofil, v\u00A0prvej knihe som rozprával o\u00A0všetkom, čo Ježiš robil a učil od\u00A0začiatku až do\u00A0dňa, keď dal skrze Ducha Svätého príkazy apoštolom, ktorých si vyvolil, a vzatý bol do\u00A0neba. Po\u00A0svojom umučení im poskytol mnoho dôkazov, že žije, keď sa im štyridsať dní zjavoval a hovoril o\u00A0Božom kráľovstve.<br>" +
                            "A keď s\u00A0nimi stoloval, prikázal im, aby neodchádzali z\u00A0Jeruzalema, ale aby očakávali Otcovo prisľúbenie: \"O ktorom ste počuli odo\u00A0mňa, že Ján krstil vodou, ale vy budete o\u00A0niekoľko dní pokrstení Duchom Svätým.\"<br>" +
                            "A zhromaždení sa ho pýtali: \"Pane, už v\u00A0tomto čase obnovíš kráľovstvo Izraela?\"<br>" +
                            "On im povedal: \"Vám neprislúcha poznať časy alebo chvíle, ktoré Otec určil svojou mocou, ale keď zostúpi na\u00A0vás Svätý Duch, dostanete silu a budete mi svedkami v\u00A0Jeruzaleme i v\u00A0celej Judei aj v\u00A0Samárii a až po\u00A0samý kraj zeme.\"<br>" +
                            "Keď to povedal, pred\u00A0ich očami sa vzniesol a oblak im ho vzal spred očí. A kým uprene hľadeli k\u00A0nebu, ako odchádza, zastali pri\u00A0nich dvaja mužovia v\u00A0bielom odeve a povedali: \"Mužovia galilejskí, čo stojíte a hľadíte do\u00A0neba? Tento Ježiš, ktorý bol od\u00A0vás vzatý do\u00A0neba, príde tak, ako ste ho videli do\u00A0neba odchádzať.\"<br>" +
                            "Počuli sme Božie slovo."},

            //Najsvätejšej Trojice
            {"7gkp", "A", "", "Ex 34, 4b-6. 8-9",
                    "Pán, Pán, Boh je milosrdný a láskavý",
                    "Čítanie z Knihy Exodus<br>" +
                            "Mojžiš včasráno vstal a vystúpil na\u00A0vrch Sinaj, ako mu prikázal Pán; v\u00A0rukách mal dve kamenné tabule.<br>" +
                            "Keď Pán zostúpil v\u00A0oblaku, Mojžiš zostal stáť s\u00A0ním a vyslovil Pánovo meno. Pán prešiel popred neho a volal: \"Pán, Pán, Boh je milosrdný a láskavý, zhovievavý, veľmi milostivý a verný.\"<br>" +
                            "Mojžiš sa rýchlo sklonil až po\u00A0zem, klaňal sa a vravel: \"Pane, ak som našiel v\u00A0tvojich očiach milosť, prosím, poď s\u00A0nami. Áno, je to ľud tvrdej šije, ale ty odpustíš naše neprávosti a hriechy a budeme tvoji.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "Dt 4, 32-34. 39-40",
                    "Len Pán je Boh hore na\u00A0nebi i dolu na\u00A0zemi; iného niet",
                    "Čítanie z Knihy Deuteronómium<br>" +
                            "Mojžiš povedal ľudu: \"Opýtaj sa len dávnych čias, ktoré boli pred\u00A0tebou: odo\u00A0dňa, keď Boh stvoril človeka na\u00A0zemi; pýtaj sa od\u00A0jedného konca nebies po\u00A0druhý: Stalo sa niekedy niečo také veľké ako toto, alebo bolo niekedy počuť, že by bol niektorý národ počul hlas Boha hovoriaceho z\u00A0ohňa, ako si počul ty – a zostal si na\u00A0žive?! Alebo sa už niekedy Boh pokúsil prísť a vybrať si národ spomedzi iných národov skúškami, znameniami, zázrakmi a bojom, rukou silnou, so\u00A0zdvihnutým ramenom a s\u00A0veľkou hrôzou, ako to pre\u00A0vás urobil Pán, váš Boh, v\u00A0Egypte priamo pred\u00A0vašimi očami?<br>" +
                            "Dnes teda vedz a uchovaj si v\u00A0srdci, že len Pán je Boh hore na\u00A0nebi i dolu na\u00A0zemi; iného niet.<br>" +
                            "Zachovávaj jeho prikázania a ustanovenia, ktoré ti ja dnes predkladám, aby dobre bolo tebe i tvojim synom po\u00A0tebe a aby si dlho žil v\u00A0krajine, ktorú ti dá Pán, tvoj Boh.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "Prís 8, 22-31",
                    "Mária, stolica Múdrosti",
                    "Čítanie z Knihy Prísloví<br>" +
                            "Toto hovorí Božia Múdrosť: \"Pán ma vlastnil už na\u00A0začiatku svojich ciest, od\u00A0počiatku, skôr, ako urobil čokoľvek.<br>" +
                            "Od večnosti som ustanovená, odpradávna, prv, ako povstal svet.<br>" +
                            "Neboli ešte morské priehlbne, a ja som sa už počala; ani žriedla, čo chrlia vodu, neboli. Prv než boli upevnené vrchy, pred\u00A0pahorkami som sa zrodila; prv, než učinil zem a nivy a prvé hrudy na\u00A0pevnine.<br>" +
                            "Keď pripravoval nebesia, bola som pri\u00A0tom. Keď vymeriaval klenbu nad\u00A0oceánmi, keď upevňoval mraky vo\u00A0výšinách, keď dával silu morským prameňom, keď moru vymedzoval hranice a vodám, aby neprekročili svoj breh, keď kládol základy zeme – už vtedy som bola s\u00A0ním ako staviteľka: deň čo deň som bola jeho potešením a hrala som sa pred\u00A0ním v\u00A0každý čas. Hrala som sa na\u00A0okruhu zeme a mojou radosťou je bývať s\u00A0ľuďmi.\"<br>" +
                            "Počuli sme Božie slovo."},

            // PRIKÁZANÝ SVIATOK – Najsvätejšieho Kristovho Tela a Krvi
            {"4gkp", "A", "", "Dt 8, 2-3. 14b-16a ",
                    "Dával ti pokrm, ktorý si nepoznal ani ty ani tvoji otcovia",
                    "Čítanie z Knihy Deuteronómium<br>" +
                            "Mojžiš povedal ľudu: \"Spomínaj si na\u00A0celú cestu, ktorou ťa Pán, tvoj Boh, týchto štyridsať rokov viedol po\u00A0púšti, aby ťa pokoril a vyskúšal, aby sa ukázalo, čo je v\u00A0tvojom srdci, či budeš zachovávať jeho prikázania alebo nie.<br>" +
                            "Pokoril ťa, nechal ťa hladovať a potom ti dal za\u00A0pokrm mannu, ktorú si nepoznal ani ty, ani tvoji otcovia, aby ti ukázal, že nielen z\u00A0chleba žije človek, ale z\u00A0každého slova, ktoré vychádza z\u00A0Pánových úst.<br>" +
                            "Nezabudni teda na\u00A0Pána, svojho Boha, ktorý ťa vyviedol z\u00A0egyptskej krajiny, z\u00A0domu otroctva, a viedol ťa cez\u00A0veľkú a hroznú púšť, kde boli ohnivé hady a škorpióny, po\u00A0vyprahnutej zemi bez\u00A0vody, ktorý pre\u00A0teba z\u00A0najtvrdšej skaly vyviedol vodu a sýtil ťa na\u00A0púšti mannou, ktorú nepoznali tvoji otcovia.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "Ex 24, 3-8",
                    "Toto je krv zmluvy, ktorú s\u00A0vami uzavrel Pán",
                    "Čítanie z Knihy Exodus<br>" +
                            "Mojžiš prišiel a rozpovedal ľudu všetky Pánove slová a ustanovenia. A všetok ľud odpovedal jedným hlasom: \"Všetko, čo Pán povedal, splníme.\"<br>" +
                            "A Mojžiš všetky Pánove slová napísal. Ráno vstal a na\u00A0úpätí vrchu postavil oltár a dvanásť kameňov pre\u00A0dvanásť kmeňov Izraela. Potom poslal izraelských mládencov a oni priniesli zápalné obety a zabili teľatá na\u00A0pokojnú obetu Pánovi.<br>" +
                            "Mojžiš vzal polovicu krvi a nalial ju do\u00A0obetných misiek. Druhú polovicu vykropil na\u00A0oltár.<br>" +
                            "Potom vzal knihu zmluvy a čítal ju nahlas ľudu; a oni vraveli: \"Splníme všetko, čo Pán povedal, a budeme poslúchať.\"<br>" +
                            "Mojžiš vzal krv, pokropil ňou ľud a povedal: \"Toto je krv zmluvy, ktorú s\u00A0vami uzavrel Pán podľa všetkých týchto slov.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "Gn 14, 18-20",
                    "Priniesol chlieb a víno",
                    "Čítanie z knihy Genezis<br>" +
                            "Melchizedech, kráľ Salema, priniesol chlieb a víno. Bol totiž kňazom najvyššieho Boha. Požehnal Abrama slovami: \"Nech Abrama požehná najvyšší Boh, ktorý stvoril nebo i zem. Nech je zvelebený najvyšší Boh, ktorý ti vydal do\u00A0rúk tvojich nepriateľov.\"<br>" +
                            "Abram mu potom dal desiatok zo\u00A0všetkého.<br>" +
                            "Počuli sme Božie slovo."},

            //Najsvätejšieho Srdca Ježišovho
            {"5gkp", "A", "", "Dt 7, 6-11",
                    "Pán vás miluje; on si vás vyvolil",
                    "Čítanie z Knihy Deuteronómium<br>" +
                            "Mojžiš povedal ľudu: \"Ty si ľud zasvätený Pánovi, svojmu Bohu. Teba si Pán, tvoj Boh, vyvolil zo\u00A0všetkých národov, čo sú na\u00A0zemi, aby si bol jeho vlastným ľudom.<br>" +
                            "Pán sa k\u00A0vám pripútal a vyvolil si vás nie preto, že by ste boli počtom prevýšili iné národy – veď ste najmenší zo\u00A0všetkých národov –, ale preto, že vás Pán miluje a zachováva prísahu, ktorou sa zaviazal vašim otcom. Preto vás vyviedol mocnou rukou a vykúpil ťa z\u00A0domu otroctva, z\u00A0ruky faraóna, egyptského kráľa.<br>" +
                            "Vedz teda, že Pán, tvoj Boh, je jediný Boh, verný Boh, ktorý zachováva zmluvu a milosrdenstvo do\u00A0tisíceho pokolenia voči tým, čo ho milujú a zachovávajú jeho prikázania, a tým, čo ho nenávidia, odpláca hneď a zničí ich, nebude odkladať; ihneď im vráti, čo si zasluhujú.<br>" +
                            "Preto zachovávaj prikázania, nariadenia a ustanovenia, ktoré ti ja dnes dávam, aby si ich plnil.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "Oz 11, 1. 3-4. 8e-9",
                    "Srdce sa vo\u00A0mne obracia",
                    "Čítanie z Knihy proroka Ozeáša<br>" +
                            "Toto hovorí Pán: \"Keď bol Izrael ešte dieťaťom, obľúbil som si ho a z\u00A0Egypta som povolal svojho syna.<br>" +
                            "Ja som Efraima učil chodiť; bral som ich na\u00A0svoje ramená, ale oni nepochopili, že mám o\u00A0nich starosť.<br>" +
                            "Povrazmi láskavosti som ich priťahoval, lanami lásky; bol som im ako ten, čo dvíha dieťa k\u00A0svojmu lícu, skláňal som sa k\u00A0nemu a kŕmil som ho.<br>" +
                            "Srdce sa vo\u00A0mne obracia, rozhorieva sa vo\u00A0mne súcit. Nebudem konať v\u00A0zápale svojho hnevu, nezničím zase Efraim, veď som ja Boh, a nie človek, som Svätý uprostred teba, preto neprídem s\u00A0hrozbami.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "Ez 34, 11-16",
                    "Ako sa pastier ujíma svojho stáda, tak sa aj ja postarám o\u00A0svoje ovce",
                    "Čítanie z Knihy proroka Ezechiela<br>" +
                            "Toto hovorí Pán: \"Hľa, ja sám vyhľadám svoje ovce a ujmem sa ich. Ako sa pastier ujíma svojho stáda, keď príde medzi svoje rozptýlené ovce, tak sa aj ja postarám o\u00A0svoje ovce a vyslobodím ich zovšadiaľ, kam sa rozpŕchli v\u00A0oblačnom a hmlistom čase.<br>" +
                            "Vyvediem ich spomedzi národov, zhromaždím ich z\u00A0krajín a privediem ich do\u00A0vlasti. A budem ich pásť na\u00A0izraelských vrchoch, v\u00A0dolinách a na\u00A0lúčinách krajiny. Budem ich vodiť na\u00A0bohatú pastvu a ich ovčinec bude na\u00A0vysokých vrchoch Izraela. Tam si odpočinú na\u00A0zelenom trávniku, na\u00A0izraelských vrchoch nájdu šťavnatú pastvu.<br>" +
                            "Ja sám budem pásť svoje ovce, ja im dám odpočinok, hovorí Pán, Boh. Stratené ovce vyhľadám, rozptýlené privediem naspäť, zranené obviažem, slabé posilním, tučné a silné ochránim a budem ich pásť svedomito.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"4p", "", "", "Iz 61, 9-11",
                    "Radosťou jasám v\u00A0Pánovi",
                    "Čítanie z knihy proroka Izaiáša<br>" +
                            "Ich rod bude známy medzi pohanmi a ich potomstvo medzi národmi. Všetci, čo ich uvidia, poznajú, že oni sú pokolením, ktoré požehnal Pán.<br>" +
                            "Radosťou jasám v\u00A0Pánovi, duša mi plesá v\u00A0mojom Bohu, pretože ma zaodial rúchom spásy, zahalil ma plášťom spravodlivosti ako ženícha zdobeného vencom, ako nevestu okrášlenú šperkami. Lebo ako zem vydá rastliny a ako záhrada dá vyklíčiť semenu, tak Pán, Boh, dá vyklíčiť spravodlivosti a chvále pred\u00A0všetkými národmi.<br>" +
                            "Počuli sme Božie slovo."},
            {"3gkp", "", "", "Sk 2, 1-11",
                    "Všetkých naplnil Duch Svätý a začali hovoriť",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď prišiel deň Turíc, boli všetci vedno na\u00A0tom istom mieste. Tu sa náhle strhol hukot z\u00A0neba, ako keď sa ženie prudký vietor, a naplnil celý dom, v\u00A0ktorom boli. I zjavili sa im akoby ohnivé jazyky, ktoré sa rozdelili, a na\u00A0každom z\u00A0nich spočinul jeden. Všetkých naplnil Duch Svätý a začali hovoriť inými jazykmi, ako im Duch dával hovoriť.<br>" +
                            "V Jeruzaleme boli Židia, nábožní ľudia zo\u00A0všetkých národov, čo sú pod\u00A0nebom.<br>" +
                            "Keď sa teda strhol tento hukot, mnoho sa ich zbehlo a boli zmätení, lebo každý ich počul hovoriť svojím jazykom. I stŕpli a udivení vraveli: \"Nie sú títo všetci, čo tu hovoria, Galilejčania? A ako to, že ich každý z\u00A0nás počuje vo\u00A0svojom vlastnom jazyku, v\u00A0ktorom sme sa narodili? My, Parti, Médi, Elamčania, obyvatelia Mezopotámie, Judey a Kappadócie, Pontu a Ázie, Frýgie a Pamfýlie, Egypta a líbyjských krajov okolo Cyrény, prisťahovaní Rimania, Židia aj prozelyti, Kréťania i Arabi: počujeme ich vo\u00A0svojich jazykoch hovoriť o\u00A0veľkých Božích skutkoch.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"8gkp", "A", "", "Ez 34, 11-12. 15-17",
                    "Vy ste moje stádo; budem súdiť medzi ovcou a ovcou",
                    "Čítanie z Knihy proroka Ezechiela<br>" +
                            "Toto hovorí Pán, Boh: \"Hľa, ja sám vyhľadám svoje ovce a ujmem sa ich. Ako sa pastier ujíma svojho stáda, keď príde medzi svoje rozptýlené ovce, tak sa aj ja postarám o\u00A0svoje ovce a vyslobodím ich zovšadiaľ, kam sa rozpŕchli v\u00A0oblačnom a hmlistom čase.<br>" +
                            "Ja sám budem pásť svoje ovce, ja im dám odpočinok, hovorí Pán, Boh. Stratené ovce vyhľadám, rozptýlené privediem naspäť, zranené obviažem, slabé posilním, tučné a silné ochránim a budem ich pásť svedomito.\"<br>" +
                            "Tebe, moje stádo, hovorí Pán toto: \"Hľa, ja budem súdiť medzi ovcou a ovcou, medzi baranmi a capmi.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "Dan 7, 13-14",
                    "Jeho vláda je večná",
                    "Čítanie z Knihy proroka Daniela<br>" +
                            "Videl som v\u00A0nočnom videní: V\u00A0nebeských oblakoch prichádzal ktosi ako Syn človeka a došiel až k\u00A0Starcovi.<br>" +
                            "Priviedli ho pred\u00A0neho, dostal moc a slávu i kráľovstvo a budú mu slúžiť všetky národy, kmene a jazyky. Jeho vláda je večná, nikdy nezanikne a jeho kráľovstvo nebude nikdy zničené.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "2 Sam 5, 1-3",
                    "Dávida pomazali za\u00A0kráľa nad\u00A0Izraelom",
                    "Čítanie z Druhej knihy Samuelovej<br>" +
                            "Všetky izraelské kmene prišli k\u00A0Dávidovi do\u00A0Hebronu a hovorili: \"Pozri, sme tvoja kosť a tvoje telo. A už vtedy, keď bol naším kráľom Saul, ty si viedol Izrael do\u00A0boja a z\u00A0boja. A Pán ti povedal: ‚Ty budeš pásť môj ľud Izrael, ty budeš vodcom Izraela.'\"<br>" +
                            "Prišli aj všetci starší Izraela ku\u00A0kráľovi do\u00A0Hebronu a kráľ Dávid s\u00A0nimi uzavrel zmluvu pred\u00A0Pánom v\u00A0Hebrone a oni pomazali Dávida za\u00A0kráľa nad\u00A0Izraelom.<br>" +
                            "Počuli sme Božie slovo."},
            //8. decembra - Nepoškvrnené počatie Panny Márie
            {"9gkp", "", "", "Gn 3, 9-15. 20",
                    "Nepriateľstvo ustanovujem medzi tvojím potomstvom a potomstvom ženy",
                    "Čítanie z Knihy Genezis<br>" +
                            "Keď Adam jedol zo\u00A0stromu, zavolal ho Pán, Boh, a povedal mu: \"Kde si?\"<br>" +
                            "On odpovedal: \"Počul som tvoj hlas v\u00A0záhrade, naľakal som sa, pretože som nahý, a skryl som sa.\"<br>" +
                            "Opýtal sa ho: \"Kto ťa upozornil, že si nahý, ak si nejedol zo\u00A0stromu, z\u00A0ktorého som ti jesť zakázal?\"<br>" +
                            "Adam odpovedal: \"Žena, ktorú si mi dal za\u00A0spoločníčku, dala mi zo\u00A0stromu a jedol som.\"<br>" +
                            "Pán, Boh, povedal žene: \"Čo si to urobila?\"<br>" +
                            "Žena odpovedala: \"Had ma naviedol a jedla som.\"<br>" +
                            "Tu povedal Pán, Boh, hadovi: \"Pretože si to urobil, prekliaty budeš medzi všetkými krotkými a divými zvieratami. Po\u00A0bruchu sa budeš plaziť a prach hltať po\u00A0všetky dni svojho života. Nepriateľstvo ustanovujem medzi tebou a ženou, medzi tvojím potomstvom a jej potomstvom; ono ti rozšliape hlavu a ty mu zraníš pätu.\"<br>" +
                            "A nazval Adam svoju ženu Evou, pretože bola matkou všetkých žijúcich.<br>" +
                            "Počuli sme Božie slovo."},
            //Krst Krista Pána - čítanie spojené so\u00A0žalmom A-A, B-B, C-C
            {"11gkp", "A", "", "Iz 42, 1-4. 6-7",
                    "Hľa, môj služobník, mám v\u00A0ňom zaľúbenie",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán: \"Hľa, môj služobník, priviniem si ho; vyvolený môj, mám v\u00A0ňom zaľúbenie. Vložil som na\u00A0neho svojho ducha; právo prinesie národom. Nebude kričať ani hlučne volať, nebude počuť na\u00A0ulici jeho hlas. Nalomenú trsť nedolomí, hasnúci knôtik nedohasí, bude uplatňovať právo. Nezoslabne, nezlomí sa, kým nezaloží právo na\u00A0zemi. Na\u00A0jeho zákon čakajú ostrovy.<br>" +
                            "‚Ja, Pán, som ťa povolal v\u00A0spravodlivosti a vzal som ťa za\u00A0ruku. Utvoril som ťa a zmluvou ľudu som ťa urobil, svetlom národov, aby si otvoril oči slepým, vyviedol väzňov zo\u00A0žalára a z\u00A0väznice tých, čo sedia v\u00A0temnotách.'\"<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "Iz 42, 1-4. 6-7",
                    "Hľa, môj služobník, mám v\u00A0ňom zaľúbenie",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán: \"Hľa, môj služobník, priviniem si ho; vyvolený môj, mám v\u00A0ňom zaľúbenie. Vložil som na\u00A0neho svojho ducha; právo prinesie národom. Nebude kričať ani hlučne volať, nebude počuť na\u00A0ulici jeho hlas. Nalomenú trsť nedolomí, hasnúci knôtik nedohasí, bude uplatňovať právo. Nezoslabne, nezlomí sa, kým nezaloží právo na\u00A0zemi. Na\u00A0jeho zákon čakajú ostrovy.<br>" +
                            "‚Ja, Pán, som ťa povolal v\u00A0spravodlivosti a vzal som ťa za\u00A0ruku. Utvoril som ťa a zmluvou ľudu som ťa urobil, svetlom národov, aby si otvoril oči slepým, vyviedol väzňov zo\u00A0žalára a z\u00A0väznice tých, čo sedia v\u00A0temnotách.'\"<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Iz 55, 1-11",
                    "Poďte k\u00A0vodám: počúvajte a budete žiť",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán: \"Poďte k\u00A0vodám, všetci, čo ste smädní, nech príde aj ten, čo nemá peniaze. Kupujte chlieb a jedzte. Poďte, kupujte bez\u00A0striebra, víno a mlieko bez\u00A0platenia.<br>" +
                            "Prečo platíte striebrom za\u00A0to, čo nie je chlieb, a driete za\u00A0to, čo nesýti? Počúvajte mňa a budete jesť dobroty a budete sa kochať v\u00A0jedlách vyberaných. Napnite svoj sluch a poďte ku\u00A0mne, počúvajte a budete žiť. Uzavriem s\u00A0vami večnú zmluvu, verný láske, ktorou som miloval Dávida. Hľa, ustanovil som ho za\u00A0svedka pre\u00A0ľudí, za\u00A0knieža a vládcu národov. Budeš volať národ, ktorý nepoznáš; národy, ktoré ťa nepoznali, pribehnú k\u00A0tebe kvôli Pánovi, tvojmu Bohu, a kvôli Svätému Izraela, lebo ťa oslávil.<br>" +
                            "Hľadajte Pána, kým ho možno nájsť, volajte ho, kým je nablízku. Nech zanechá bezbožný svoju cestu a zločinec svoje zámery, nech sa vráti k\u00A0Pánovi a on sa nad\u00A0ním zmiluje, k\u00A0nášmu Bohu, lebo on veľkodušne odpúšťa. Lebo moje myšlienky nie sú vaše myšlienky a vaše cesty nie sú mojimi cestami, hovorí Pán. Lebo ako vysoko je nebo nad\u00A0zemou, tak vysoko sú moje cesty nad\u00A0vašimi cestami a moje myšlienky nad\u00A0vašimi myšlienkami.<br>" +
                            "A ako z\u00A0neba padá dážď a sneh a nevracia sa späť, lež napojí zem a zúrodní ju, aby z\u00A0nej klíčilo, aby obdarovala rozsievača semenom a dala chlieb hladnému, tak bude so\u00A0slovom, ktoré vychádza z\u00A0mojich úst: nevráti sa ku\u00A0mne naprázdno, ale vykoná všetko, čo chcem, a vydarí sa jeho poslanie.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "Iz 42, 1-4. 6-7",
                    "Hľa, môj služobník, mám v\u00A0ňom zaľúbenie",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán: \"Hľa, môj služobník, priviniem si ho; vyvolený môj, mám v\u00A0ňom zaľúbenie. Vložil som na\u00A0neho svojho ducha; právo prinesie národom. Nebude kričať ani hlučne volať, nebude počuť na\u00A0ulici jeho hlas. Nalomenú trsť nedolomí, hasnúci knôtik nedohasí, bude uplatňovať právo. Nezoslabne, nezlomí sa, kým nezaloží právo na\u00A0zemi. Na\u00A0jeho zákon čakajú ostrovy.<br>" +
                            "‚Ja, Pán, som ťa povolal v\u00A0spravodlivosti a vzal som ťa za\u00A0ruku. Utvoril som ťa a zmluvou ľudu som ťa urobil, svetlom národov, aby si otvoril oči slepým, vyviedol väzňov zo\u00A0žalára a z\u00A0väznice tých, čo sedia v\u00A0temnotách.'\"<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Iz 40, 1-5. 9-11",
                    "Pripravte cestu Pánovi",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Potešujte, potešujte môj ľud, vraví váš Boh. Hovorte k\u00A0srdcu Jeruzalema a volajte k\u00A0nemu, že sa skončilo jeho otroctvo a je odčinená jeho vina; veď dostal z\u00A0ruky Pánovej dvojnásobok za\u00A0každý svoj hriech.<br>" +
                            "Hlas volajúceho: \"Pripravte cestu Pánovi na\u00A0púšti, vyrovnajte chodníky nášmu Bohu na\u00A0pustatine! Každá dolina nech sa zdvihne a každý vrch i kopec zníži! Čo je krivé, nech je rovinou, a čo hrboľaté, nížinou. I zjaví sa Pánova sláva, a uvidí spoločne každé stvorenie, že prehovorili Pánove ústa.\"<br>" +
                            "Vystúp na\u00A0vysoký vrch, ty, čo hlásaš radostnú zvesť Sionu! Zodvihni mocne svoj hlas, ty, čo hlásaš radostnú zvesť Jeruzalemu! Zodvihni, neboj sa, povedz judejským mestám: \"Hľa, váš Boh! Hľa, Pán, Boh, prichádza so\u00A0všetkou mocou a jeho ruka bude vládnuť. Odmenu víťaza nesie so\u00A0sebou a jeho trofeje idú pred\u00A0ním. Ako pastier pasie svoju čriedu, do\u00A0náručia berie baránky a kladie si ich do\u00A0lona; starostlivo vedie ovce brezivé.\"<br>" +
                            "Počuli sme Božie slovo."},
            //Svätej rodiny - čítanie spojené so\u00A0žalmom A-A, B-B, C-C
            {"10gkp", "A", "", "Sir 3, 3-7. 14-17a ",
                    "Kto sa bojí Pána, ctí si rodičov",
                    "Čítanie z Knihy Sirachovho syna<br>" +
                            "Pán dal otcovi vážnosť, ktorá je vysoko nad\u00A0deťmi, a upevnil právo matky nad\u00A0synmi. Kto si váži otca, očisťuje sa z\u00A0hriechov; bude sa ich zdržiavať a bude vyslyšaná jeho každodenná modlitba. A zbiera poklady ten, kto má v\u00A0úcte matku. Kto si váži otca, bude sa radovať zo\u00A0svojich detí a budú vyslyšané jeho modlitby. Kto si váži otca, bude dlho žiť, a kto poslúcha otca, potešuje matku.<br>" +
                            "Syn môj, buď oporou svojmu otcovi v\u00A0starobe a nezarmucuj ho, kým je nažive. Ak slabne na\u00A0mysli, buď trpezlivý a nepohŕdaj ním, kým ty si pri\u00A0plnej sile. Nezabudne sa ti, že si mal súcit s\u00A0otcom, odráta sa ti z\u00A0hriechov, ktoré si napáchal a zveľadí sa ti v\u00A0spravodlivosti.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "Sir 3, 3-7. 14-17a ",
                    "Kto sa bojí Pána, ctí si rodičov",
                    "Čítanie z Knihy Sirachovho syna<br>" +
                            "Pán dal otcovi vážnosť, ktorá je vysoko nad\u00A0deťmi, a upevnil právo matky nad\u00A0synmi. Kto si váži otca, očisťuje sa z\u00A0hriechov; bude sa ich zdržiavať a bude vyslyšaná jeho každodenná modlitba. A zbiera poklady ten, kto má v\u00A0úcte matku. Kto si váži otca, bude sa radovať zo\u00A0svojich detí a budú vyslyšané jeho modlitby. Kto si váži otca, bude dlho žiť, a kto poslúcha otca, potešuje matku.<br>" +
                            "Syn môj, buď oporou svojmu otcovi v\u00A0starobe a nezarmucuj ho, kým je nažive. Ak slabne na\u00A0mysli, buď trpezlivý a nepohŕdaj ním, kým ty si pri\u00A0plnej sile. Nezabudne sa ti, že si mal súcit s\u00A0otcom, odráta sa ti z\u00A0hriechov, ktoré si napáchal a zveľadí sa ti v\u00A0spravodlivosti.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Gn 15, 1-6; 21, 1-3",
                    "Tvojím dedičom bude ten, čo vzíde z\u00A0tvojho lona",
                    "Čítanie z Knihy Genezis<br>" +
                            "Pán povedal Abramovi vo\u00A0videní: \"Neboj sa, Abram! Ja som tvoj ochranca a tvoja odmena bude nesmierna.\"<br>" +
                            "Abram povedal: \"Pane, Bože, čože mi dáš? Odchádzam bezdetný a dedičom môjho domu bude damaský Eliezer.\" A Abram dodal: \"Veď si mi nedal potomka a môj domáci sluha bude mojím dedičom.\"<br>" +
                            "Ale Pán mu povedal: \"Ten nebude tvojím dedičom. Tvojím dedičom bude ten, čo vzíde z\u00A0tvojho lona.\"<br>" +
                            "Vyviedol ho von a povedal mu: \"Pozri na\u00A0nebo a spočítaj hviezdy, ak môžeš.\" A uistil ho: \"Také bude tvoje potomstvo.\" On uveril Pánovi a to sa mu počítalo za\u00A0spravodlivosť.<br>" +
                            "Pán navštívil Sáru, ako prisľúbil, a splnil Sáre, čo povedal. I počala a porodila Abrahámovi syna v\u00A0jeho starobe, v\u00A0čase, ktorý mu predpovedal Boh. A Abrahám dal svojmu synovi, ktorého mu porodila Sára, meno Izák.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "Sir 3, 3-7. 14-17a ",
                    "Kto sa bojí Pána, ctí si rodičov",
                    "Čítanie z Knihy Sirachovho syna<br>" +
                            "Pán dal otcovi vážnosť, ktorá je vysoko nad\u00A0deťmi, a upevnil právo matky nad\u00A0synmi. Kto si váži otca, očisťuje sa z\u00A0hriechov; bude sa ich zdržiavať a bude vyslyšaná jeho každodenná modlitba. A zbiera poklady ten, kto má v\u00A0úcte matku. Kto si váži otca, bude sa radovať zo\u00A0svojich detí a budú vyslyšané jeho modlitby. Kto si váži otca, bude dlho žiť, a kto poslúcha otca, potešuje matku.<br>" +
                            "Syn môj, buď oporou svojmu otcovi v\u00A0starobe a nezarmucuj ho, kým je nažive. Ak slabne na\u00A0mysli, buď trpezlivý a nepohŕdaj ním, kým ty si pri\u00A0plnej sile. Nezabudne sa ti, že si mal súcit s\u00A0otcom, odráta sa ti z\u00A0hriechov, ktoré si napáchal a zveľadí sa ti v\u00A0spravodlivosti.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "1 Sam 1, 20-22. 24-28",
                    "Samuel po\u00A0všetky dni, kým bude žiť, nech je zasvätený Pánovi",
                    "Čítanie z Prvej knihy Samuelovej<br>" +
                            "Keď nadišiel čas, Anna počala a porodila syna a dala mu meno Samuel, pretože si ho od\u00A0Pána vyprosila. Potom išiel muž Elkana a celý jeho dom obetovať Pánovi výročnú obetu a splniť sľub. Ale Anna s\u00A0ním nešla; povedala svojmu mužovi: \"Nepôjdem, kým neoddojčím dieťa a neprivediem ho, aby sa ukázal pred\u00A0Pánovou tvárou a zostal tam navždy.\"<br>" +
                            "Keď ho oddojčila, vzala ho so\u00A0sebou, aj trojročného býčka, jednu mericu múky, mech vína, a priviedla ho do\u00A0Pánovho domu v\u00A0Silo. Chlapec bol ešte maličký. Býčka obetovali a chlapca zaviedli k\u00A0Helimu.<br>" +
                            "Anna povedala: \"Prosím, pane môj, ako žiješ, pane, ja som tá žena, čo tu stála pred\u00A0tebou a modlila sa k\u00A0Pánovi. O\u00A0tohto chlapčeka som prosila a Pán mi dal, o\u00A0čo som ho prosila. Nuž aj ja ho odovzdávam Pánovi. Po\u00A0všetky dni, kým bude žiť, nech je zasvätený Pánovi.\"<br>" +
                            "I klaňali sa tam Pánovi.<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] citanie1_1 = {
            //  2. nedeľa po\u00A0NP
            {"", "", "", "Sir 24, 1b-2. 12-16",
                    "Božia múdrosť prebýva vo\u00A0vyvolenom ľude",
                    "Čítanie z Knihy Sirachovho syna<br>" +
                            "Múdrosť sa chváli sama, aj u\u00A0Boha má česť a uprostred svojho ľudu slávu. V\u00A0zhromaždení Najvyššieho otvára svoje ústa a vyvyšuje sa pred\u00A0jeho zástupmi: \"Vtedy mi Stvoriteľ vesmíru rozkázal, ten, čo ma stvoril, daroval pokoj môjmu stánku a povedal mi: ‚V Jakubovi prebývaj, v\u00A0Izraeli maj svoje dedičstvo a medzi mojimi vyvolenými zapusť korene.'<br>" +
                            "Od počiatku, pred\u00A0vekmi som stvorená a budem trvať naveky. Pred\u00A0ním som vo\u00A0Svätom stánku konala službu a na\u00A0Sione som sa usadila. V\u00A0meste, ktoré on miluje, našla som bývanie, nad\u00A0Jeruzalemom dal mi právomoc. V\u00A0slávnom národe som zapustila korene, v\u00A0podiele môjho Boha – v\u00A0jeho dedičstve – a v\u00A0zástupoch svätých sa zdržiavam.\"<br>" +
                            "Počuli sme Božie slovo."},

            {"01gk", "", "", "Nm 6, 22-27",
                    "Budú vzývať moje meno nad\u00A0izraelskými synmi a ja ich požehnám",
                    "Čítanie z Knihy Numeri<br>" +
                            "Pán hovoril Mojžišovi takto: \"Povedz Áronovi a jeho synom: Takto budete požehnávať izraelských synov; poviete im: Nech ťa žehná Pán a nech ťa ochraňuje! Nech Pán rozžiari svoju tvár nad\u00A0tebou a nech ti je milostivý! Nech Pán obráti svoju tvár k\u00A0tebe a nech ti daruje pokoj!<br>" +
                            "Takto budú vzývať moje meno nad\u00A0izraelskými synmi a ja ich požehnám.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"2", "", "", "1 Jn 2, 22-28",
                    "Nech zostáva vo\u00A0vás, čo ste počuli od\u00A0začiatku",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, kto je luhár, ak nie ten, kto popiera, že Ježiš je Kristus!? To je antikrist, kto popiera Otca i Syna. Kto popiera Syna, nemá ani Otca. Kto vyznáva Syna, má aj Otca.<br>" +
                            "Nech zostáva vo\u00A0vás, čo ste počuli od\u00A0začiatku. Ak vo\u00A0vás zostane to, čo ste počuli od\u00A0začiatku, aj vy ostanete v\u00A0Synovi aj v\u00A0Otcovi. A prisľúbenie, ktoré nám dal on, je večný život.<br>" +
                            "Toto som vám napísal o\u00A0tých, čo vás zvádzajú. A pomazanie, ktoré ste od\u00A0neho dostali, ostáva vo\u00A0vás a nepotrebujete, aby vás niekto poúčal. Ale ako jeho pomazanie vás poúča o\u00A0všetkom a je pravdivé, nie je lžou teda ako vás poučilo, ostávate v\u00A0ňom.<br>" +
                            "A teraz, deti moje, ostávajte v\u00A0ňom, aby sme mali dôveru, keď sa zjaví, a aby sme pri\u00A0jeho príchode neboli ním zahanbení.<br>" +
                            "Počuli sme Božie slovo."},
            {"3", "", "", "1 Jn 2, 29 – 3, 6",
                    "Kto ostáva v\u00A0ňom, nehreší",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, ak viete, že je spravodlivý, vedzte, že každý, kto koná spravodlivo, z\u00A0neho sa narodil.<br>" +
                            "Pozrite, akú veľkú lásku nám daroval Otec: voláme sa Božími deťmi a nimi aj sme.<br>" +
                            "Preto nás svet nepozná, že nepoznal jeho.<br>" +
                            "Milovaní, teraz sme Božími deťmi, a ešte sa neukázalo, čím budeme. Vieme však, že keď sa on zjaví, budeme mu podobní, lebo ho budeme vidieť takého, aký je.<br>" +
                            "Každý, kto má túto nádej v\u00A0neho, usiluje sa byť čistý, ako je on čistý.<br>" +
                            "Každý, kto pácha hriech, pácha aj bezprávie, lebo hriech je bezprávie. A viete, že on sa zjavil, aby sňal hriechy, a v\u00A0ňom hriechu niet. Kto ostáva v\u00A0ňom, nehreší; kto hreší, ten ho nevidel, ani nepoznal.<br>" +
                            "Počuli sme Božie slovo."},
            {"03a", "", "", "Flp 2, 1-11",
                    "Zmýšľajte tak ako Kristus Ježiš",
                    "Čítanie z Listu svätého apoštola Pavla Filipanom<br>" +
                            "Bratia, ak jestvuje nejaké potešenie v\u00A0Kristovi, ak jestvuje nejaká útecha z\u00A0lásky, nejaké spoločenstvo ducha, nejaké srdce a zľutovanie, dovŕšte moju radosť: zmýšľajte rovnako, rovnako milujte, buďte jedna duša a jedna myseľ!<br>" +
                            "Nerobte nič z\u00A0nevraživosti ani pre\u00A0márnu slávu, ale v\u00A0pokore pokladajte jeden druhého za\u00A0vyššieho. Nech nik nehľadí iba na\u00A0svoje vlastné záujmy, ale aj na\u00A0záujmy iných.<br>" +
                            "Zmýšľajte tak, ako Kristus Ježiš: On, hoci má božskú prirodzenosť, nepridŕžal sa svojej rovnosti s\u00A0Bohom, ale zriekol sa seba samého, vzal si prirodzenosť sluhu, stal sa podobný ľuďom a podľa vonkajšieho zjavu bol pokladaný za\u00A0človeka. Uponížil sa, stal sa poslušným až na\u00A0smrť, až na\u00A0smrť na\u00A0kríži. Preto ho Boh nad\u00A0všetko povýšil a dal mu meno, ktoré je nad\u00A0každé iné meno, aby sa na\u00A0meno Ježiš zohlo každé koleno v\u00A0nebi, na\u00A0zemi i v\u00A0podsvetí a aby každý jazyk vyznával: \"Ježiš Kristus je Pán!\" na\u00A0slávu Boha Otca.<br>" +
                            "Počuli sme Božie slovo."},
            {"4", "", "", "1 Jn 3, 7-10",
                    "Nemôže hrešiť, pretože sa narodil z\u00A0Boha",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Deti moje, nech vás nik nezvedie. Kto koná spravodlivo, je spravodlivý, ako je on spravodlivý. Kto pácha hriech, je z\u00A0diabla, pretože diabol hreší od\u00A0počiatku. A Boží Syn sa zjavil preto, aby zmaril diablove skutky.<br>" +
                            "Kto sa narodil z\u00A0Boha, nepácha hriech, lebo v\u00A0ňom ostáva jeho semeno; a nemôže hrešiť, pretože sa narodil z\u00A0Boha.<br>" +
                            "Podľa tohto sa dajú rozoznať Božie deti od\u00A0detí diablových: kto nekoná spravodlivo, nie je z\u00A0Boha; ani ten, kto nemiluje svojho brata.<br>" +
                            "Počuli sme Božie slovo."},
            {"5", "", "", "1 Jn 3, 11-21",
                    "Prešli sme zo\u00A0smrti do\u00A0života, lebo milujeme bratov",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, toto je zvesť, ktorú ste počuli od\u00A0začiatku: aby sme jeden druhého milovali. Nie ako Kain; on bol zo\u00A0Zlého a zabil svojho brata. A prečo ho zabil? Preto, že jeho skutky boli zlé a bratove spravodlivé.<br>" +
                            "Bratia, nedivte sa, ak vás svet nenávidí. My vieme, že sme prešli zo\u00A0smrti do\u00A0života, lebo milujeme bratov. Kto nemiluje, ostáva v\u00A0smrti. Každý, kto nenávidí svojho brata, je vrah. A viete, že ani jeden vrah nemá v\u00A0sebe večný život.<br>" +
                            "Čo je láska, poznali sme z\u00A0toho, že on položil za\u00A0nás svoj život. Aj my sme povinní dávať život za\u00A0bratov.<br>" +
                            "Ak má niekto pozemský majetok a vidí brata v\u00A0núdzi, a srdce si pred\u00A0ním zatvorí, ako v\u00A0ňom môže ostávať Božia láska?<br>" +
                            "Deti moje, nemilujme len slovom a jazykom, ale skutkom a pravdou. Podľa toho poznáme, že sme z\u00A0pravdy, a upokojíme si pred\u00A0ním srdce. Lebo keby nám srdce niečo vyčítalo, Boh je väčší ako naše srdce a vie všetko.<br>" +
                            "Milovaní, ak nám srdce nič nevyčíta, máme dôveru k\u00A0Bohu.<br>" +
                            "Počuli sme Božie slovo."},
            {"06gk", "", "", "Iz 60, 1-6",
                    "Pánova veleba vzišla nad\u00A0tebou",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Vstaň, zažiar, Jeruzalem, lebo prichádza tvoje svetlo a Pánova veleba vzišla nad\u00A0tebou.<br>" +
                            "Lebo, hľa, tma zahaľuje zem a temnota pokrýva národy; ale nad\u00A0tebou vzíde Pán a jeho veleba sa zjaví na\u00A0tebe.<br>" +
                            "Národy budú kráčať v\u00A0tvojom svetle a králi v\u00A0jase, čo ti vzišiel. Pozdvihni oči a dívaj sa navôkol: títo všetci sa zhromaždili, prišli k\u00A0tebe; zďaleka prichádzajú tvoji synovia a tvoje dcéry nesú v\u00A0náručí.<br>" +
                            "Uvidíš to a zažiariš, rozochveje a rozšíri sa tvoje srdce. Lebo k\u00A0tebe sa obráti bohatstvo mora, poklady národov prídu k\u00A0tebe. Záplava tiav ťa pokryje, ťavätá z\u00A0Madiánu a Efy; prídu všetci zo\u00A0Sáby, zlato a kadidlo prinesú a zvestujú Pánovu slávu.<br>" +
                            "Počuli sme Božie slovo."},
            {"7", "", "", "1 Jn 3, 22 – 4, 6",
                    "Skúmajte duchov, či sú z\u00A0Boha",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, od\u00A0Boha dostaneme všetko, o\u00A0čo len budeme prosiť, lebo zachovávame jeho prikázania a robíme, čo sa jemu páči.<br>" +
                            "A toto je jeho prikázanie: aby sme verili v\u00A0meno jeho Syna Ježiša Krista a milovali jeden druhého, ako nám prikázal. Kto zachováva jeho prikázania, ostáva v\u00A0Bohu a Boh v\u00A0ňom. A že v\u00A0nás ostáva, poznáme z\u00A0Ducha, ktorého nám dal.<br>" +
                            "Milovaní, neverte každému duchu, ale skúmajte duchov, či sú z\u00A0Boha; lebo do\u00A0sveta vyšlo mnoho falošných prorokov. Božieho Ducha poznáte podľa tohoto: Každý duch, ktorý vyznáva, že Ježiš Kristus prišiel v\u00A0tele, je z\u00A0Boha. Duch, ktorý nevyznáva Ježiša, nie je z\u00A0Boha. To je duch antikrista, o\u00A0ktorom ste počuli, že príde, a už teraz je na\u00A0svete.<br>" +
                            "Vy, deti moje, ste z\u00A0Boha a zvíťazili ste nad\u00A0nimi, lebo ten, ktorý je vo\u00A0vás, je väčší než ten, čo je vo\u00A0svete. Oni sú zo\u00A0sveta, preto hovoria podľa sveta a svet ich počúva. My sme z\u00A0Boha. Kto pozná Boha, počúva nás. Kto nie je z\u00A0Boha, ten nás nepočúva. Podľa toho poznávame Ducha pravdy a ducha bludu.<br>" +
                            "Počuli sme Božie slovo."},
            {"8", "", "", "1 Jn 4, 7-10",
                    "Boh je láska",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, milujme sa navzájom, lebo láska je z\u00A0Boha a každý, kto miluje, narodil sa z\u00A0Boha a pozná Boha. Kto nemiluje, nepoznal Boha, lebo Boh je láska.<br>" +
                            "A Božia láska k\u00A0nám sa prejavila v\u00A0tom, že Boh poslal svojho jednorodeného Syna na\u00A0svet, aby sme skrze neho mali život.<br>" +
                            "Láska je v\u00A0tom, že nie my sme milovali Boha, ale že on miloval nás a poslal svojho Syna ako zmiernu obetu za\u00A0naše hriechy.<br>" +
                            "Počuli sme Božie slovo."},
            {"9", "", "", "1 Jn 4, 11-18",
                    "Keď sa milujeme navzájom; Boh ostáva v\u00A0nás",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, keď nás Boh tak miluje, aj my sme povinní milovať jeden druhého. Boha nikto nikdy nevidel; ale keď sa milujeme navzájom, Boh ostáva v\u00A0nás a jeho láska v\u00A0nás je dokonalá.<br>" +
                            "A že ostávame v\u00A0ňom a on v\u00A0nás, poznávame podľa toho, že nám dal zo\u00A0svojho Ducha. A my sme videli a svedčíme, že Otec poslal Syna za\u00A0Spasiteľa sveta.<br>" +
                            "Kto vyzná: \"Ježiš je Boží Syn,\" ostáva v\u00A0ňom Boh a on v\u00A0Bohu. A my, čo sme uverili, spoznali sme lásku, akú má Boh k\u00A0nám. Boh je láska; a kto ostáva v\u00A0láske, ostáva v\u00A0Bohu a Boh ostáva v\u00A0ňom.<br>" +
                            "Láska v\u00A0nás je dokonalá v\u00A0tom, že máme dôveru v\u00A0deň súdu, lebo ako je on, tak sme aj my na\u00A0tomto svete. V\u00A0láske niet strachu, a dokonalá láska vyháňa strach, lebo strach má v\u00A0sebe trest, a kto sa bojí, nie je dokonalý v\u00A0láske.<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "", "", "1 Jn 4, 19 – 5, 4",
                    "Kto miluje Boha, má milovať aj svojho brata",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, my milujeme Boha, pretože on prvý miloval nás.<br>" +
                            "Ak niekto povie: \"Milujem Boha,\" a nenávidí svojho brata, je luhár. Veď kto nemiluje brata, ktorého vidí, nemôže milovať Boha, ktorého nevidí. A toto prikázanie máme od\u00A0neho: aby ten, kto miluje Boha, miloval aj svojho brata.<br>" +
                            "Každý, kto verí, že Ježiš je Kristus, narodil sa z\u00A0Boha. A každý, kto miluje Boha ako Otca, miluje aj toho, kto sa z\u00A0neho narodil.<br>" +
                            "Podľa toho poznáme, že milujeme Božie deti, keď milujeme Boha a plníme jeho prikázania.<br>" +
                            "Lebo láska k\u00A0Bohu spočíva v\u00A0tom, že zachovávame jeho prikázania. A jeho prikázania nie sú ťažké.<br>" +
                            "Veď všetko, čo sa narodilo z\u00A0Boha, premáha svet. A tým víťazstvom, ktoré premohlo svet, je naša viera.<br>" +
                            "Počuli sme Božie slovo."},
            {"11", "", "", "1 Jn 5, 5-13",
                    "Duch, voda a krv",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, kto iný premáha svet, ak nie ten, kto verí, že Ježiš je Boží Syn?<br>" +
                            "On je ten, ktorý prišiel skrze vodu a krv, Ježiš Kristus. Nielen skrze vodu, ale skrze vodu a krv. A Duch to dosvedčuje, pretože Duch je pravda. Lebo traja sú, čo svedčia: Duch, voda a krv; a títo traja sú zajedno.<br>" +
                            "Ak prijímame svedectvo ľudí, Božie svedectvo je väčšie; pretože Božie svedectvo je to, že svedčil o\u00A0svojom Synovi.<br>" +
                            "Kto verí v\u00A0Božieho Syna, má svedectvo v\u00A0sebe. Kto neverí Bohu, robí ho luhárom, pretože neuveril svedectvu, ktoré vydal Boh o\u00A0svojom Synovi.<br>" +
                            "A toto svedectvo je, že Boh nám dal večný život a tento život je v\u00A0jeho Synovi. Kto má Syna, má život; kto nemá Syna, nemá Boží život.<br>" +
                            "Toto som vám napísal, aby ste vedeli, že máte večný život vy, čo veríte v\u00A0meno Božieho Syna.<br>" +
                            "Počuli sme Božie slovo."},
            {"12", "", "", "1 Jn 5, 14-21",
                    "Počuje nás, nech o\u00A0čokoľvek prosíme",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, toto je dôvera, ktorú máme k\u00A0Bohu, že nás počuje, keď o\u00A0niečo prosíme podľa jeho vôle. A ak vieme, že nás počuje, nech o\u00A0čokoľvek prosíme, vieme aj to, že dostaneme, o\u00A0čo sme ho žiadali.<br>" +
                            "Keď niekto vidí, že jeho brat pácha hriech, ktorý nevedie k\u00A0smrti, nech prosí a Boh mu dá život, totiž tým, čo páchajú hriech, ktorý nevedie k\u00A0smrti. Je aj hriech, ktorý vedie k\u00A0smrti; o\u00A0takom nehovorím, že sa treba zaň modliť. Každá neprávosť je hriechom, ale je aj hriech, ktorý nevedie k\u00A0smrti.<br>" +
                            "Vieme, že nik, kto sa narodil z\u00A0Boha, nehreší, ale chráni ho ten, ktorý sa narodil z\u00A0Boha, a Zlý sa ho nedotkne. Vieme, že sme z\u00A0Boha a celý svet je v\u00A0moci Zlého. A vieme, že prišiel Boží Syn a dal nám schopnosť poznať toho Pravého. A my sme v\u00A0tom Pravom, v\u00A0jeho Synovi Ježišovi Kristovi. On je ten Pravý, Boh a večný život.<br>" +
                            "Deti moje, chráňte sa modiel!<br>" +
                            "Počuli sme Božie slovo."},
            {"20g+", "", "", "Krn 24, 18-22",
                    "Zachariáš, ktorého ste zabili medzi chrámom a oltárom",
                    "Čítanie z Druhej knihy Kroník<br>" +
                            "Židovskí vodcovia opustili chrám Pána, Boha svojich otcov, a slúžili posvätným kameňom a modlám. Pre\u00A0tento hriech doľahol hnev na\u00A0Júdu a Jeruzalem. Posielal k\u00A0nim prorokov, aby sa vrátili k\u00A0Pánovi, ale nechceli počuť ich napomínanie.<br>" +
                            "Vtedy duch Boží zahalil Zachariáša, syna kňaza Jojadu; on si stal pred\u00A0ľud a povedal mu: \"Toto hovorí Boh: Prečo prestupujete Pánove príkazy? To vám nemôže osožiť. Pretože ste opustili Pána, on opustil vás.\"<br>" +
                            "Oni sa proti nemu sprisahali a podľa kráľovho rozkazu ho ukameňovali na\u00A0nádvorí Pánovho domu. Kráľ Joas si nespomenul na\u00A0dobrodenie, ktoré mu preukázal Zachariášov otec Jojada, a zavraždil jeho syna.<br>" +
                            "On umierajúc povedal: \"Nech to Pán vidí a nech sa pomsti!\"<br>" +
                            "Počuli sme Božie slovo."},
            {"25g", "", "", "Sk 22, 3-16",
                    "Vstaň, daj sa pokrstiť, zmy svoje hriechy a vzývaj Ježišovo meno",
                    "Čítanie zo Skutky apoštolov<br>" +
                            "Pavol povedal ľudu: \"Ja som Žid. Narodil som sa v\u00A0cilícijskom Tarze, ale vychovaný som bol v\u00A0tomto meste. Pri\u00A0Gamalielových nohách som sa naučil prísne žiť podľa zákona otcov a horlil som za\u00A0Boha, ako aj vy všetci dnes. Túto Cestu som prenasledoval až na\u00A0smrť: spútaval som mužov i ženy a dával som ich do\u00A0väzenia, ako mi dosvedčí aj veľkňaz a celá veľrada. Od\u00A0nich som dostal aj listy pre\u00A0bratov a šiel som do\u00A0Damasku, aby som aj tých, čo tam boli, v\u00A0putách priviedol do\u00A0Jeruzalema na\u00A0potrestanie.<br>" +
                            "Ale ako som šiel a blížil sa k\u00A0Damasku, zrazu ma okolo poludnia zalialo jasné svetlo z\u00A0neba. Padol som na\u00A0zem a počul som hlas, ktorý mi hovoril: ‚Šavol, Šavol, prečo ma prenasleduješ?'<br>" +
                            "Ja som odpovedal: ‚Kto si, Pane?'<br>" +
                            "A on mi povedal: ‚Ja som Ježiš Nazaretský, ktorého ty prenasleduješ.' Tí, čo boli so\u00A0mnou, svetlo videli, ale hlas toho, čo so\u00A0mnou hovoril, nepočuli.<br>" +
                            "I povedal som: ‚Čo mám robiť, Pane?'<br>" +
                            "A Pán mi povedal: ‚Vstaň a choď do\u00A0Damasku; tam ti povedia všetko, čo ti je určené urobiť.'<br>" +
                            "Keďže som pre\u00A0jas toho svetla nevidel, viedli ma moji sprievodcovia za\u00A0ruku, a tak som prišiel do\u00A0Damasku.<br>" +
                            "Istý Ananiáš, nábožný muž podľa zákona, ktorému všetci tamojší Židia vydávajú svedectvo, prišiel za\u00A0mnou, pristúpil a povedal mi: ‚Brat Šavol, pozeraj!' A ja som ho v\u00A0tú hodinu videl.<br>" +
                            "Tu on povedal: ‚Boh našich otcov ťa predurčil, aby si poznal jeho vôľu, videl Spravodlivého a počul hlas z\u00A0jeho úst. Lebo mu budeš pred\u00A0všetkými ľuďmi svedkom toho, čo si videl a počul. A teraz – čo čakáš?! Vstaň, daj sa pokrstiť, zmy svoje hriechy a vzývaj jeho meno!'\"<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Sk 9, 1-22",
                    "Povedia ti, čo ti je určené urobiť",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Šavol ešte stále dychtil po\u00A0hrozbách a zabíjaní Pánových učeníkov. Išiel teda k\u00A0veľkňazovi a vyžiadal si od\u00A0neho listy pre\u00A0synagógy v\u00A0Damasku, aby mohol stúpencov tejto Cesty, mužov i ženy, ak tam dajakých nájde, v\u00A0putách priviesť do\u00A0Jeruzalema.<br>" +
                            "Ako šiel a blížil sa k\u00A0Damasku, zrazu ho zalialo svetlo z\u00A0neba. Padol na\u00A0zem a počul hlas, ktorý mu hovoril: \"Šavol, Šavol, prečo ma prenasleduješ?\"<br>" +
                            "On povedal: \"Kto si, Pane?\"<br>" +
                            "A ten: \"Ja som Ježiš, ktorého ty prenasleduješ. Ale vstaň, choď do\u00A0mesta a povedia ti, čo máš robiť.\"<br>" +
                            "Muži, čo ho sprevádzali, stáli ako ohromení, lebo hlas počuli, ale nikoho nevideli.<br>" +
                            "Šavol vstal zo\u00A0zeme, otvoril oči, ale nič nevidel. Vzali ho teda za\u00A0ruku a zaviedli do\u00A0Damasku. Tri dni nevidel a nejedol, ani nepil.<br>" +
                            "V Damasku bol istý učeník, menom Ananiáš, a Pán ho vo\u00A0videní oslovil: \"Ananiáš!\"<br>" +
                            "On povedal: \"Tu som, Pane.\"<br>" +
                            "A Pán jemu: \"Vstaň a choď do\u00A0ulice, ktorá sa volá Rovná, a v\u00A0Júdovom dome vyhľadaj Šavla prímením Tarzského; práve sa modlí a vidí muža, menom Ananiáša, ako vchádza a vkladá naň ruky, aby sa mu vrátil zrak.\"<br>" +
                            "No Ananiáš odpovedal: \"Pane, od\u00A0mnohých som počul o\u00A0tomto mužovi, koľko zla narobil tvojim svätým v\u00A0Jeruzaleme. Aj tu má moc od\u00A0veľkňazov poviazať všetkých, čo vzývajú tvoje meno.\"<br>" +
                            "Ale Pán mu povedal: \"Len choď, lebo jeho som si vyvolil za\u00A0nádobu, aby zaniesol moje meno pohanom aj kráľom i synom Izraela; a ja mu ukážem, koľko musí trpieť pre\u00A0moje meno.\"<br>" +
                            "Ananiáš teda šiel a vošiel do\u00A0domu, vložil naň ruky a povedal: \"Brat Šavol, poslal ma Pán Ježiš, ktorý sa ti zjavil na\u00A0ceste, keď si šiel sem, aby si zasa videl a aby ťa naplnil Duch Svätý.\" Hneď mu spadli z\u00A0očí akoby lupiny a vrátil sa mu zrak. Tu vstal a dal sa pokrstiť. Potom prijal pokrm a zosilnel.<br>" +
                            "Niekoľko dní zostal s\u00A0učeníkmi v\u00A0Damasku a hneď v\u00A0synagógach ohlasoval Ježiša, že je Božím Synom.<br>" +
                            "Všetci, čo počúvali, žasli a vraveli: \"Nie je to ten, čo v\u00A0Jeruzaleme prenasledoval tých, čo vzývali toto meno? A neprišiel sem na\u00A0to, aby ich v\u00A0putách odviedol k\u00A0veľkňazom?\" Ale Šavol bol čoraz silnejší a miatol Židov, čo bývali v\u00A0Damasku, lebo dokazoval, že toto je Mesiáš.<br>" +
                            "Počuli sme Božie slovo."},
            {"26", "", "", "2 Tim 1, 1-8",
                    "Spomínam si na\u00A0tvoju úprimnú vieru",
                    "Čítanie z Druhého listu svätého apoštola Pavla Timotejovi<br>" +
                            "Pavol, z\u00A0Božej vôle apoštol Krista Ježiša podľa prisľúbenia života, ktorý je v\u00A0Kristovi Ježišovi, milovanému synovi Timotejovi: Milosť, milosrdenstvo a pokoj od\u00A0Boha Otca i od\u00A0Krista Ježiša, nášho Pána.<br>" +
                            "Vzdávam vďaky Bohu, ktorému slúžim s\u00A0čistým svedomím ako moji predkovia, keď na\u00A0teba neprestajne myslím vo\u00A0svojich modlitbách vo\u00A0dne v\u00A0noci. A keď si spomínam na\u00A0tvoje slzy, túžim ťa vidieť, aby ma naplnila radosť. Spomínam si na\u00A0tvoju úprimnú vieru, akú mala už tvoja stará matka Loida a tvoja matka Eunika, a som presvedčený, že aj ty.<br>" +
                            "Preto ti pripomínam, aby si roznecoval Boží dar, ktorý je v\u00A0tebe prostredníctvom vkladania mojich rúk. Veď Boh nám nedal Ducha bojazlivosti, ale Ducha sily, lásky a rozvahy. Preto sa nehanbi za\u00A0svedectvo o\u00A0našom Pánovi ani za\u00A0mňa, jeho väzňa, ale trp spolu so\u00A0mnou za\u00A0evanjelium, posilňovaný mocou Boha.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Tít 1, 1-5",
                    "Títovi, pravému synovi podľa spoločnej viery",
                    "Čítanie z Listu svätého apoštola Pavla Títovi<br>" +
                            "Pavol, služobník Boha a apoštol Ježiša Krista pre\u00A0vieru Božích vyvolených a pre\u00A0poznanie pravdy, ktorá na\u00A0základe nábožnosti vedie k\u00A0nádeji na\u00A0večný život, ktorý pred\u00A0večnými vekmi prisľúbil pravdovravný Boh, ale v\u00A0určenom čase zjavil svoje slovo v\u00A0kázaní, ktoré mi bolo zverené na\u00A0rozkaz Boha, nášho spasiteľa, – Títovi, pravému synovi podľa spoločnej viery: Milosť a pokoj od\u00A0Boha Otca i od\u00A0Krista Ježiša, nášho Spasiteľa.<br>" +
                            "Na to som ťa nechal na\u00A0Kréte, aby si usporiadal, čo ešte treba, a po\u00A0mestách ustanovil starších, ako som ti prikázal.<br>" +
                            "Počuli sme Božie slovo."},

    };

    String[][] citanie1_2 = {
            {"02g", "", "", "Mal 3, 1-4",
                    "Príde do\u00A0svojho chrámu Pán, ktorého hľadáte",
                    "Čítanie z Knihy proroka Malachiaša<br>" +
                            "Toto hovorí Pán, Boh: \"Hľa, ja posielam svojho anjela, aby mi pripravil cestu. Hneď potom príde do\u00A0svojho chrámu Pán, ktorého hľadáte, a anjel zmluvy, po\u00A0ktorom túžite.<br>" +
                            "Hľa, príde, hovorí Pán zástupov. Kto však znesie deň jeho príchodu a kto obstojí, až sa zjaví?<br>" +
                            "Veď on je ako oheň, ktorý roztápa, a ako lúh práčov. Sadne si a bude vytápať a čistiť striebro, očistí synov Léviho a zošľachtí ich ako zlato a striebro, takže budú prinášať Pánovi obety v\u00A0spravodlivosti.<br>" +
                            "Vtedy sa Pánovi zapáči obeta Júdu a Jeruzalema ako v\u00A0dňoch predošlých, ako v\u00A0rokoch dávnych.\"<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Hebr 2, 14-18",
                    "Vo všetkom sa musel pripodobniť bratom, aby sa stal milosrdným",
                    "Čítanie z Listu Hebrejom<br>" +
                            "Pretože deti majú účasť na\u00A0krvi a tele, aj Ježiš mal podobne spoluúčasť na\u00A0nich, aby smrťou zničil toho, ktorý vládol smrťou, čiže diabla, a vyslobodil tých, ktorých celý život zotročoval strach pred\u00A0smrťou.<br>" +
                            "Veď sa neujíma anjelov, ale ujíma sa Abrahámovho potomstva. Preto sa vo\u00A0všetkom musel pripodobniť bratom, aby sa stal milosrdným a verným veľkňazom pred\u00A0Bohom a odčinil hriechy ľudu. A pretože sám prešiel skúškou utrpenia, môže pomáhať tým, ktorí sú skúšaní.<br>" +
                            "Počuli sme Božie slovo."},
            /*{"11", "", "", "Iz 66, 10-14c",
                    "Hľa, obrátim k\u00A0nemu pokoj ako rieku",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Tešte sa s\u00A0Jeruzalemom, jasajte v\u00A0ňom všetci, čo ho milujete, radujte sa s\u00A0ním všetci, čo ste nad\u00A0ním trúchlili.<br>" +
                            "Sajte dosýta z\u00A0pŕs jeho útechy a pite s\u00A0rozkošou z\u00A0pŕs jeho slávy. Lebo takto hovorí Pán: \"Hľa, obrátim k\u00A0nemu pokoj ako rieku, ako rozvodnený potok slávu národov.<br>" +
                            "Budete sať, v\u00A0náručí vás budú nosiť a na\u00A0kolenách láskať. Ako keď niekoho utešuje matka, tak vás ja poteším; v\u00A0Jeruzaleme nájdete útechu.<br>" +
                            "Až to uvidíte, zaraduje sa vám srdce a vaše kosti oživnú ako svieža tráva. Pánova ruka sa ukáže na\u00A0jeho služobníkoch.\"<br>" +
                            "Počuli sme Božie slovo."},*/
            {"14o", "", "", "Iz 52, 7-10",
                    "Všetky končiny zeme uvidia spásu nášho Boha",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Aké krásne sú na\u00A0horách nohy posla, ktorý hlása pokoj, posla dobrej zvesti, ktorý ohlasuje spásu, ktorý hovorí Sionu: \"Tvoj Boh kraľuje.\"<br>" +
                            "Počúvaj svoje hliadky! Zvyšujú svoj hlas a jasajú všetci, lebo na\u00A0vlastné oči vidia návrat Pána na\u00A0Sion.<br>" +
                            "Radujte sa a vedno plesajte, rozvaliny Jeruzalema, lebo Pán potešil svoj ľud, vykúpil Jeruzalem.<br>" +
                            "Obnažil si Pán svoje sväté rameno pred\u00A0očami všetkých národov a všetky končiny zeme uvidia spásu nášho Boha.<br>" +
                            "Počuli sme Božie slovo."},
            {"14g+", "", "", "Iz 52, 7-10",
                    "Všetky končiny zeme uvidia spásu nášho Boha",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Aké krásne sú na\u00A0horách nohy posla, ktorý hlása pokoj, posla dobrej zvesti, ktorý ohlasuje spásu, ktorý hovorí Sionu: \"Tvoj Boh kraľuje.\"<br>" +
                            "Počúvaj svoje hliadky! Zvyšujú svoj hlas a jasajú všetci, lebo na\u00A0vlastné oči vidia návrat Pána na\u00A0Sion.<br>" +
                            "Radujte sa a vedno plesajte, rozvaliny Jeruzalema, lebo Pán potešil svoj ľud, vykúpil Jeruzalem.<br>" +
                            "Obnažil si Pán svoje sväté rameno pred\u00A0očami všetkých národov a všetky končiny zeme uvidia spásu nášho Boha.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Ef 4, 1-7. 11-13",
                    "Na dielo služby, na\u00A0budovanie Kristovho tela",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Bratia, prosím vás ja, väzeň v\u00A0Pánovi, aby ste žili dôstojne podľa povolania, ktorého sa vám dostalo, so\u00A0všetkou pokorou, miernosťou a zhovievavosťou. Znášajte sa navzájom v\u00A0láske a usilujte sa zachovať jednotu ducha vo\u00A0zväzku pokoja.<br>" +
                            "Jedno je telo a jeden Duch, ako ste aj povolaní v\u00A0jednej nádeji svojho povolania. Jeden je Pán, jedna viera, jeden krst. Jeden je Boh a Otec všetkých, ktorý je nad\u00A0všetkými, preniká všetkých a je vo\u00A0všetkých.<br>" +
                            "Ale každý z\u00A0nás dostal milosť podľa miery, akou nás obdaroval Kristus. On ustanovil niektorých za\u00A0apoštolov, niektorých za\u00A0prorokov, iných za\u00A0evanjelistov a iných za\u00A0pastierov a učiteľov, aby pripravovali svätých na\u00A0dielo služby, na\u00A0budovanie Kristovho tela, kým nedospejeme všetci k\u00A0jednote viery a poznania Božieho Syna, k\u00A0zrelosti muža, k\u00A0miere plného Kristovho veku.<br>" +
                            "Počuli sme Božie slovo."},
            {"22g", "", "", "1 Pt 5, 1-4",
                    "Paste Božie stádo, ktoré je u\u00A0vás",
                    "Čítanie z Prvého listu svätého apoštola Petra<br>" +
                            "Milovaní, starších, čo sú medzi vami, prosím ako spolustarší a svedok Kristových utrpení, ale aj účastník jeho slávy, ktorá sa má v\u00A0budúcnosti zjaviť: Paste Božie stádo, ktoré je u\u00A0vás; starajte sa oň nie z\u00A0prinútenia, ale dobrovoľne, podľa Božej vôle, nie pre\u00A0mrzký zisk, ale ochotne; nie ako páni nad\u00A0dedičným podielom, ale ako vzor stáda.<br>" +
                            "A keď sa zjaví Najvyšší pastier, dostanete nevädnúci veniec slávy.<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] citanie1_3 = {};

    String[][] citanie1_4 = {
            {"25g", "", "", "1 Pt 5, 5b-14",
                    "Pozdravuje vás môj syn Marek",
                    "Čítanie z Prvého listu svätého apoštola Petra<br>" +
                            "Milovaní, všetci sa navzájom zaodejte pokorou, lebo Boh pyšným odporuje, ale pokorným dáva milosť.<br>" +
                            "Pokorte sa teda pod\u00A0mocnou Božou rukou, aby vás povýšil v\u00A0určenom čase. Na\u00A0neho zložte všetky svoje starosti, lebo on sa o\u00A0vás stará.<br>" +
                            "Buďte triezvi a bdejte! Váš protivník, diabol, obchádza ako revúci lev a hľadá, koho by zožral. Vzoprite sa mu, pevní vo\u00A0viere, a vedzte, že také isté utrpenie dolieha na\u00A0vašich bratov po\u00A0celom svete.<br>" +
                            "A Boh všetkej milosti, ktorý vás v\u00A0Kristovi Ježišovi, povolal do\u00A0svojej večnej slávy, on sám vás po\u00A0krátkom utrpení zdokonalí, posilní, utvrdí a upevní. Jemu vláda na\u00A0veky vekov. Amen.<br>" +
                            "Prostredníctvom Silvána, ktorého pokladám za\u00A0vám verného brata, som vám krátko napísal, aby som vás povzbudil a dosvedčil, že toto je tá pravá Božia milosť; v\u00A0nej vytrvajte! Pozdravuje vás cirkev, vyvolená ako vy, ktorá je v\u00A0Babylone, aj môj syn Marek. Pozdravte sa navzájom bozkom lásky.<br>" +
                            "Pokoj vám všetkým, čo ste v\u00A0Kristovi.<br>" +
                            "Počuli sme Božie slovo."},
            {"29g", "", "", "1 Jn 1, 5 – 2, 2",
                    "Krv Ježiša nás očisťuje od\u00A0každého hriechu",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, toto je zvesť, ktorú sme počuli od\u00A0Ježiša Krista a vám zvestujeme: Boh je svetlo a niet v\u00A0ňom nijakej tmy.<br>" +
                            "Ak hovoríme, že máme s\u00A0ním spoločenstvo, ale chodíme vo\u00A0tme, luháme a nekonáme pravdu. Ale ak chodíme vo\u00A0svetle ako je on vo\u00A0svetle, máme spoločenstvo medzi sebou a krv Ježiša, jeho Syna, nás očisťuje od\u00A0každého hriechu.<br>" +
                            "Ak hovoríme, že nemáme hriech, klameme sami seba a nie je v\u00A0nás pravda. Ale ak vyznávame svoje hriechy, on je verný a spravodlivý: odpustí nám hriechy a očistí nás od\u00A0každej neprávosti. Ak hovoríme, že sme nezhrešili, jeho robíme luhárom a nie je v\u00A0nás jeho slovo.<br>" +
                            "Deti moje, toto vám píšem, aby ste nehrešili. Ale keby niekto zhrešil, máme u\u00A0Otca zástancu: Ježiša Krista, spravodlivého. On je zmiernou obetou za\u00A0naše hriechy; a nielen za\u00A0naše, ale aj za\u00A0hriechy celého sveta.<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] citanie1_5 = {
            {"01", "", "", "Gn 1, 26 – 2, 3",
                    "Naplňte zem a podmaňte si ju",
                    "Čítanie z Knihy Genezis<br>" +
                            "Boh povedal: \"Urobme človeka na\u00A0náš obraz, na\u00A0našu podobu. Nech vládnu nad\u00A0morskými rybami a nad\u00A0nebeským vtáctvom, nad\u00A0zverinou i nad\u00A0celou zemou; nad\u00A0všetkými plazmi, čo sa hýbu po\u00A0zemi.\"<br>" +
                            "A stvoril Boh človeka na\u00A0svoj obraz; na\u00A0Boží obraz ho stvoril, muža a ženu ich stvoril. Boh ich požehnal a povedal im: \"Vzrastajte a množte sa. Naplňte zem a podmaňte si ju. Panujte nad\u00A0morskými rybami, nad\u00A0nebeským vtáctvom a nad\u00A0všetkou zverou, čo sa hýbe na\u00A0zemi.\"<br>" +
                            "Potom Boh povedal: \"Hľa, dávam vám všetky semenné rastliny na\u00A0zemi a všetky stromy s\u00A0ich ovocím, v\u00A0ktorom je semeno, aby vám boli za\u00A0pokrm. A všetkým živočíchom zeme, všetkému nebeskému vtáctvu i všetkému, čo sa hýbe na\u00A0zemi a má v\u00A0sebe život, dávam za\u00A0pokrm všetky zelené rastliny.\"<br>" +
                            "A tak sa stalo. A Boh videl všetko, čo urobil; a bolo to veľmi dobré.<br>" +
                            "A nastal večer a ráno, šiesty deň.<br>" +
                            "Takto boli dokončené nebo a zem i všetka ich nádhera. Siedmeho dňa Boh ukončil dielo, ktoré konal, a v\u00A0siedmy deň si odpočinul po\u00A0všetkých dielach, čo vytvoril.<br>" +
                            "A Boh požehnal siedmy deň a posvätil ho, lebo v\u00A0ten deň Boh odpočíval po\u00A0celom svojom diele, ktoré stvorením vytvoril.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Kol 3, 14-15. 17. 23-24",
                    "Čokoľvek robíte, robte z\u00A0tej duše ako Pánovi, a nie ako ľuďom!",
                    "Čítanie z Listu svätého apoštola Pavla Kolosanom<br>" +
                            "Bratia, nad\u00A0všetko toto majte lásku, ktorá je zväzkom dokonalosti! A vo\u00A0vašich srdciach nech vládne Kristov pokoj. Preň ste aj povolaní v\u00A0jednom tele. A buďte vďační!<br>" +
                            "A všetko, čokoľvek hovoríte alebo konáte, všetko robte v\u00A0mene Pána Ježiša a skrze neho vzdávajte vďaky Bohu Otcovi.<br>" +
                            "Čokoľvek robíte, robte z\u00A0tej duše ako Pánovi, a nie ako ľuďom! Veď viete, že od\u00A0Pána dostanete za\u00A0odmenu dedičstvo. Slúžte Pánovi, Kristovi!<br>" +
                            "Počuli sme Božie slovo."},
            {"03g", "", "", "1 Kor 15, 1-8",
                    "Pán sa zjavil Jakubovi a potom všetkým apoštolom",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, pripomínam vám evanjelium, ktoré som vám hlásal a vy ste ho prijali, zotrvávate v\u00A0ňom a prostredníctvom neho dosahujete spásu, ak sa ho držíte tak, ako som vám ho hlásal, ibaže by ste boli nadarmo uverili.<br>" +
                            "Odovzdal som vám predovšetkým to, čo som aj ja prijal: že Kristus zomrel za\u00A0naše hriechy podľa Písem; že bol pochovaný a že bol tretieho dňa vzkriesený podľa Písem, že sa zjavil Kéfasovi a potom Dvanástim.<br>" +
                            "Potom sa zjavil viac ako päťsto bratom naraz; väčšina z\u00A0nich žije doteraz, niektorí už zosnuli. Potom sa zjavil Jakubovi a potom všetkým apoštolom a poslednému zo\u00A0všetkých, ako nedochôdčaťu, zjavil sa aj mne.<br>" +
                            "Počuli sme Božie slovo."},
            {"14g", "", "", "Sk 1, 15-17. 20-26",
                    "Lós padol na\u00A0Mateja. I pripočítali ho k\u00A0jedenástim apoštolom",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "V tých dňoch vstal Peter uprostred bratov – bolo tam zhromaždených asi stodvadsať ľudí – a povedal: \"Bratia, muselo sa splniť Písmo, kde predpovedal Duch Svätý ústami Dávida o\u00A0Judášovi, ktorý bol vodcom tých, čo zajali Ježiša; patril do\u00A0nášho počtu a dostal podiel na\u00A0tej istej službe. Lebo v\u00A0knihe Žalmov je napísané: ‚Jeho príbytok nech spustne a nech niet nikoho, kto by v\u00A0ňom býval,' a: ‚Jeho úrad nech prevezme iný.'<br>" +
                            "Treba teda, aby sa z\u00A0týchto mužov, čo boli s\u00A0nami celý čas, keď medzi nami žil Pán Ježiš, počnúc Jánovým krstom až do\u00A0dňa, keď bol od\u00A0nás vzatý, aby sa jeden z\u00A0nich stal s\u00A0nami svedkom jeho zmŕtvychvstania.\"<br>" +
                            "A tak postavili dvoch: Jozefa, ktorý sa volal Barsabáš, s\u00A0prímením Justus, a Mateja. A modlili sa: \"Pane, ty poznáš srdcia všetkých ľudí; ukáž, ktorého z\u00A0týchto dvoch si si vyvolil, aby zaujal miesto v\u00A0tejto službe a apoštoláte, ktorým sa Judáš spreneveril, aby odišiel na\u00A0svoje miesto.\"<br>" +
                            "Potom im dali lósy a lós padol na\u00A0Mateja. I pripočítali ho k\u00A0jedenástim apoštolom.<br>" +
                            "Počuli sme Božie slovo."},
            {"16", "", "", "Rim 8, 31b-39",
                    "Ani smrť, ani život nás nebude môcť odlúčiť od\u00A0Božej lásky",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, ak je Boh za\u00A0nás, kto je proti nám? Keď on vlastného Syna neušetril, ale vydal ho za\u00A0nás všetkých, akože by nám s\u00A0ním nedaroval všetko!?<br>" +
                            "Kto obžaluje Božích vyvolencov? Boh, ktorý ospravedlňuje?<br>" +
                            "A kto ich odsúdi? Kristus Ježiš, ktorý zomrel, ba viac — ktorý bol vzkriesený, je po\u00A0pravici Boha a prihovára sa za\u00A0nás?<br>" +
                            "Kto nás odlúči od\u00A0Kristovej lásky? Azda súženie, úzkosť alebo prenasledovanie, hlad alebo nahota, nebezpečenstvo alebo meč?<br>" +
                            "Ako je napísané:<br>" +
                            "\"Pre teba nás usmrcujú deň čo deň,<br>" +
                            "pokladajú nás za\u00A0ovce na\u00A0zabitie.\"<br>" +
                            "Ale v\u00A0tomto všetkom slávne víťazíme skrze toho, ktorý nás miluje.<br>" +
                            "A som si istý, že ani smrť, ani život, ani anjeli, ani kniežatstvá, ani prítomnosť, ani budúcnosť, ani mocnosti, ani výška, ani hĺbka, ani nijaké iné stvorenie nás nebude môcť odlúčiť od\u00A0Božej lásky, ktorá je v\u00A0Kristovi Ježišovi, našom Pánovi.<br>" +
                            "Počuli sme Božie slovo."},
            {"16g", "", "", "Rim 8, 31b-39",
                    "Ani smrť, ani život nás nebude môcť odlúčiť od\u00A0Božej lásky",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, ak je Boh za\u00A0nás, kto je proti nám? Keď on vlastného Syna neušetril, ale vydal ho za\u00A0nás všetkých, akože by nám s\u00A0ním nedaroval všetko!?<br>" +
                            "Kto obžaluje Božích vyvolencov? Boh, ktorý ospravedlňuje?<br>" +
                            "A kto ich odsúdi? Kristus Ježiš, ktorý zomrel, ba viac — ktorý bol vzkriesený, je po\u00A0pravici Boha a prihovára sa za\u00A0nás?<br>" +
                            "Kto nás odlúči od\u00A0Kristovej lásky? Azda súženie, úzkosť alebo prenasledovanie, hlad alebo nahota, nebezpečenstvo alebo meč?<br>" +
                            "Ako je napísané:<br>" +
                            "\"Pre teba nás usmrcujú deň čo deň,<br>" +
                            "pokladajú nás za\u00A0ovce na\u00A0zabitie.\"<br>" +
                            "Ale v\u00A0tomto všetkom slávne víťazíme skrze toho, ktorý nás miluje.<br>" +
                            "A som si istý, že ani smrť, ani život, ani anjeli, ani kniežatstvá, ani prítomnosť, ani budúcnosť, ani mocnosti, ani výška, ani hĺbka, ani nijaké iné stvorenie nás nebude môcť odlúčiť od\u00A0Božej lásky, ktorá je v\u00A0Kristovi Ježišovi, našom Pánovi.<br>" +
                            "Počuli sme Božie slovo."}
    };

    String[][] citanie1_6 = {
            {"11", "", "", "Sk 11, 21b-26; 13, 1-3",
                    "On bol muž dobrý, plný Ducha Svätého a viery",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Veľa ľudí uverilo a obrátilo sa k\u00A0Pánovi. Zvesť o\u00A0tom sa dostala aj do\u00A0uší jeruzalemskej cirkvi; a vyslali do\u00A0Antiochie Barnabáša. Keď ta prišiel a videl Božiu milosť, zaradoval sa a povzbudzoval všetkých, aby vytrvali v\u00A0Pánovi, ako si zaumienili v\u00A0srdci, lebo on bol muž dobrý, plný Ducha Svätého a viery. A k\u00A0Pánovi sa pridal veľký zástup.<br>" +
                            "Preto odišiel do\u00A0Tarzu vyhľadať Šavla. Keď ho našiel, priviedol ho do\u00A0Antiochie. Celý rok pobudli v\u00A0tamojšej cirkvi a učili početný zástup.<br>" +
                            "V Antiochii učeníkov prvý raz nazvali kresťanmi.<br>" +
                            "V antiochijskej cirkvi boli prorokmi a učiteľmi Barnabáš, Simeon, ktorého volali Niger, Lucius z\u00A0Cyrény, Manaen, ktorý bol vychovaný s\u00A0tetrarchom Herodesom, a Šavol.<br>" +
                            "Ako slúžili Pánovi a postili sa, povedal Duch Svätý: \"Oddeľte mi Barnabáša a Šavla na\u00A0dielo, na\u00A0ktoré som ich povolal.\" Oni sa postili a modlili, vložili na\u00A0nich ruky a prepustili ich.<br>" +
                            "Počuli sme Božie slovo."},
            {"23gk", "", "", "Jer 1, 4-10",
                    "Poznal som ťa skôr, ako som ťa utvoril v\u00A0matkinom lone",
                    "Čítanie z Knihy proroka Jeremiáša<br>" +
                            "Za dní kráľa Joziáša Pán prehovoril ku\u00A0mne takto: \"Skôr, ako som ťa utvoril v\u00A0matkinom lone, poznal som ťa; a skôr, ako si vyšiel z\u00A0neho, som ťa posvätil; ustanovil som ťa za\u00A0proroka národom.\"<br>" +
                            "I povedal som: \"Ach, Pane, Bože, veď ja neviem hovoriť, lebo som ešte dieťa.\"<br>" +
                            "Ale Pán mi povedal: \"Nehovor: ‚Som dieťa,' lebo pôjdeš, kamkoľvek ťa pošlem, a budeš hovoriť všetko, čo ti prikážem. Neboj sa ich, veď ja som s\u00A0tebou a budem ťa chrániť,\" hovorí Pán.<br>" +
                            "Potom Pán vystrel svoju ruku, dotkol sa mi úst a povedal mi: \"Hľa, svoje slová vkladám do\u00A0tvojich úst; pozri, dnes ti dávam moc nad\u00A0národmi a kráľovstvami, aby si vytrhával a rúcal, ničil a pustošil, budoval a sadil.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"24gk", "", "", "Iz 49, 1-6",
                    "Urobím ťa svetlom národov, aby si bol mojou spásou až do\u00A0končín zeme",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Druhá pieseň o\u00A0Pánovom Služobníkovi<br>" +
                            "Počúvajte ma, ostrovy, dávajte pozor, národy v\u00A0diaľavách; Pán ma z\u00A0matkinho lona povolal, už v\u00A0živote mojej matky myslel na\u00A0moje meno, ústa mi urobil sťa ostrý meč, ukryl ma v\u00A0tôni svojej ruky. Utvoril ma ako zaostrený šíp, do\u00A0svojho tulca ma uložil. A povedal mi: \"Ty si môj služobník, Izrael, na\u00A0tebe ukážem svoju slávu.\"<br>" +
                            "Ja som povedal: \"Nadarmo som sa namáhal, márne a zbytočne som mrhal svoju silu. Ale moje právo je isté u\u00A0Pána a moja odmena u\u00A0môjho Boha.\"<br>" +
                            "A teraz hovorí Pán, ten, čo si ma utváral za\u00A0služobníka už v\u00A0matkinom lone, aby som priviedol k\u00A0nemu Jakuba a Izraela okolo neho zhromaždil; tak som bol poctený v\u00A0očiach Pána a môj Boh sa mi stal silou.<br>" +
                            "Povedal: \"To je málo, že si môj služobník, aby si obnovil Jakubove kmene a naspäť priviedol zvyšok Izraela. Urobím ťa svetlom národov, aby moja spása siahala až do\u00A0končín zeme.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"28gk", "", "", "Sk 3, 1-10",
                    "Čo mám, to ti dám: V\u00A0mene Ježiša Krista Nazaretského vstaň a choď!",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Peter a Ján vystupovali o\u00A0tretej hodine do\u00A0chrámu na\u00A0popoludňajšiu modlitbu.<br>" +
                            "Práve prinášali istého muža, ktorý bol od\u00A0narodenia chromý. Denne ho kládli k\u00A0chrámovej bráne, ktorá sa volá Krásna, aby si pýtal almužnu od\u00A0tých, čo vchádzali do\u00A0chrámu. Keď videl vchádzať do\u00A0chrámu Petra a Jána, prosil, aby mu dali almužnu.<br>" +
                            "Peter sa naň s\u00A0Jánom zahľadel a povedal: \"Pozri sa na\u00A0nás!\" On sa na\u00A0nich pozrel a čakal, že od\u00A0nich niečo dostane.<br>" +
                            "Ale Peter povedal: \"Striebro a zlato nemám, ale čo mám, to ti dám: V\u00A0mene Ježiša Krista Nazaretského vstaň a choď!\" Chytil ho za\u00A0pravú ruku a zodvihol ho.<br>" +
                            "Vtom mu spevneli nohy a členky, vyskočil, postavil sa a chodil. Vošiel s\u00A0nimi do\u00A0chrámu, chodil, vyskakoval a chválil Boha.<br>" +
                            "Všetok ľud videl, ako chodí a chváli Boha, a poznali ho, že je to ten, čo sedával pri\u00A0Krásnej bráne chrámu a žobral. A naplnil ich úžas a vzrušenie nad\u00A0tým, čo sa s\u00A0ním stalo.<br>" +
                            "Počuli sme Božie slovo."},
            {"29gk", "", "", "Sk 12, 1-11",
                    "Teraz naozaj viem, že ma Pán vyslobodil z\u00A0Herodesovej ruky",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "V tom čase kráľ Herodes položil ruky na\u00A0niektorých príslušníkov Cirkvi a mučil ich. Jánovho brata Jakuba zabil mečom. A keď videl, že sa to Židom páči, rozkázal chytiť aj Petra. Boli práve dni Nekvasených chlebov. Keď sa ho zmocnil, uvrhol ho do\u00A0väzenia a dal ho strážiť štyrom strážam po\u00A0štyroch vojakoch: po\u00A0Veľkej noci ho chcel predviesť ľudu.<br>" +
                            "Petra teda strážili vo\u00A0väzení. Ale Cirkev sa bez\u00A0prestania modlila k\u00A0Bohu za\u00A0neho.<br>" +
                            "V poslednú noc, ako ho mal Herodes predviesť, Peter spal medzi dvoma vojakmi spútaný dvoma reťazami a strážnici predo\u00A0dvermi strážili väzenie.<br>" +
                            "Tu zastal pri\u00A0ňom Pánov anjel a v\u00A0miestnosti zažiarilo svetlo. Udrel Petra do\u00A0boku, zobudil ho a povedal: \"Vstaň rýchlo!\" A reťaze mu spadli z\u00A0rúk.<br>" +
                            "Anjel mu povedal: \"Opáš sa a obuj si sandále!\" Keď to urobil, povedal mu: \"Prehoď si plášť a poď za\u00A0mnou!\" Vyšiel von a šiel za\u00A0ním; ani nevedel, že je to skutočnosť, čo sa dialo skrze anjela. Myslel si, že má videnie.<br>" +
                            "Prešli cez\u00A0prvú i druhú stráž a došli k\u00A0železnej bráne, čo vedie do\u00A0mesta. Tá sa im sama otvorila. Vyšli ňou, a keď prešli jednou ulicou, anjel mu zmizol.<br>" +
                            "Tu Peter prišiel k\u00A0sebe a povedal si: \"Teraz naozaj viem, že Pán poslal svojho anjela a vyslobodil ma z\u00A0Herodesovej ruky a zo\u00A0všetkého, čo očakával židovský ľud.\"<br>" +
                            "Počuli sme Božie slovo."},};
    String[][] citanie1_7 = {
            {"02g", "", "", "Sof 3, 14-18",
                    "Kráľ Izraela, Pán, je s\u00A0tebou",
                    "Čítanie z Knihy proroka Sofoniáša<br>" +
                            "Jasaj, dcéra sionská, plesaj, Izrael! Raduj sa a veseľ z\u00A0plného srdca, dcéra jeruzalemská! Pán zrušil tvoj rozsudok, odvrátil tvojich nepriateľov. Kráľ Izraela, Pán, je s\u00A0tebou, neboj sa nijakého zla!<br>" +
                            "V onen deň povedia Jeruzalemu: \"Neboj sa, Sion, nech ti ruky nechabnú! Pán, tvoj Boh, je s\u00A0tebou, on je mocný, on ťa zachráni. Teší sa a plesá nad\u00A0tebou, obnovuje k\u00A0tebe svoju lásku, plesá nad\u00A0tebou a jasá; ako v\u00A0deň zhromaždenia.\" \"Odstránim z\u00A0teba nešťastie a už sa nebudeš zaň hanbiť.\"<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Rim 12, 9-16b",
                    "Majte účasť na\u00A0potrebách svätých, buďte pohostinní",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, láska nech je bez\u00A0pretvárky. Nenáviďte zlo, lipnite k\u00A0dobru. Milujte sa navzájom bratskou láskou, predbiehajte sa vzájomne v\u00A0úctivosti, v\u00A0horlivosti neochabujte, buďte vrúcneho ducha, slúžte Pánovi. V\u00A0nádeji sa radujte, v\u00A0súžení buďte trpezliví, v\u00A0modlitbe vytrvalí. Majte účasť na\u00A0potrebách svätých, buďte pohostinní.<br>" +
                            "Žehnajte tých, čo vás prenasledujú – žehnajte a nepreklínajte!<br>" +
                            "Radujte sa s\u00A0radujúcimi, plačte s\u00A0plačúcimi! Navzájom rovnako zmýšľajte; a nezmýšľajte vysoko, ale prikláňajte sa k\u00A0nízkym.<br>" +
                            "Počuli sme Božie slovo."},
            {"03g", "", "", "Ef 2, 19-22",
                    "Celá stavba rastie v\u00A0svätý chrám v\u00A0Pánovi",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Bratia, už nie ste cudzinci ani prišelci, ale ste spoluobčania svätých a patríte do\u00A0Božej rodiny. Ste postavení na\u00A0základe apoštolov a prorokov; hlavným uholným kameňom je sám Kristus Ježiš. V\u00A0ňom celá stavba pevne pospájaná rastie v\u00A0svätý chrám v\u00A0Pánovi, v\u00A0ňom ste aj vy vbudovaní do\u00A0Božieho príbytku v\u00A0Duchu.<br>" +
                            "Počuli sme Božie slovo."},
            {"05gk", "", "", "Sir 44, 1. 4-7. 11-15",
                    "Ich meno žije z\u00A0pokolenia na\u00A0pokolenie",
                    "Čítanie z Knihy Sirachovho syna<br>" +
                            "Chváliť nám treba slávnych mužov, našich otcov, ako nasledovali po\u00A0sebe.<br>" +
                            "Pre svoju rozvahu stali sa vodcami ľudu a pre\u00A0svoju zbehlosť v\u00A0písmach viedli národy. V\u00A0ich výrokoch sú slová múdrosti; zostavovali piesne a nápevy, písali a prednášali básne. Boli bohatí a obdarení silou; usilovali sa o\u00A0krásny život a pokojne žili vo\u00A0svojich rodinách. Všetci dosiahli slávu u\u00A0svojich súčasníkov, už za\u00A0ich života ich chválili.<br>" +
                            "Zostávajú vo\u00A0svojom potomstve, posvätné dedičstvo sú ich vnukovia; lebo ich potomstvo zostalo verné zmluve a vďaka im – aj ich synovia. Ich potomstvo zostane naveky a ich sláva nezanikne nikdy.<br>" +
                            "Ich telá odpočívajú v\u00A0pokoji a ich meno žije z\u00A0pokolenia na\u00A0pokolenie. O\u00A0ich múdrosti rozprávajú národy a zhromaždený ľud ich ospevuje.<br>" +
                            "Počuli sme Božie slovo."},
            {"11g", "", "", "Prís 2, 1-9",
                    "Nakloň svoje srdce k\u00A0poznaniu",
                    "Čítanie z Knihy Prísloví<br>" +
                            "Syn môj, ak prijmeš moje slová a vo\u00A0svojom vnútri zachováš moje príkazy, napneš svoj sluch za\u00A0múdrosťou a svoje srdce nakloníš k\u00A0poznaniu; ak budeš vzývať múdrosť a dovolávať sa rozumnosti, ak sa budeš za\u00A0ňou zháňať ako za\u00A0peniazmi a hľadať ju ako poklady, vtedy pochopíš bázeň Pánovu a spoznáš Boha; lebo Pán dáva múdrosť, z\u00A0jeho úst pochádza poznanie a rozumnosť.<br>" +
                            "Statočným poskytuje ochranu, je štítom tým, čo žijú poctivo, dáva pozor na\u00A0chodníky spravodlivosti a chráni cestu svätých.<br>" +
                            "Až vtedy pochopíš spravodlivosť a právo, statočnosť a každú dobrú cestu.<br>" +
                            "Počuli sme Božie slovo."},
            /*{"16", "", "", "Zach 2, 14-17",
                    "Raduj sa, dcéra Siona, lebo hľa, ja prichádzam",
                    "Čítanie z Knihy proroka Zachariáša<br>" +
                            "Plesaj a raduj sa, dcéra Siona, lebo hľa, ja prichádzam a budem bývať uprostred teba, hovorí Pán. V\u00A0ten deň sa mnohé národy pripoja k\u00A0Pánovi a budú jeho ľudom. Budem bývať uprostred teba a budeš vedieť, že ma Pán zástupov poslal k\u00A0tebe.<br>" +
                            "Pán bude vlastniť Júdu ako svoj podiel vo\u00A0svätej zemi a znovu si vyvolí Jeruzalem. Nech mlčí pred\u00A0Pánom každé telo, lebo vstáva zo\u00A0svojho svätého príbytku.<br>" +
                            "Počuli sme Božie slovo."},*/
            {"17gk", "", "", "Gn 12, 1-4a ",
                    "Odíď zo\u00A0svojej krajiny, od\u00A0svojich príbuzných",
                    "Čítanie z Knihy Genezis<br>" +
                            "Pán povedal Abramovi: \"Odíď zo\u00A0svojej krajiny, od\u00A0svojich príbuzných a z\u00A0domu svojho otca do\u00A0krajiny, ktorú ti ukážem. Urobím z\u00A0teba veľký národ a požehnám ťa, oslávim tvoje meno a budeš požehnaním.<br>" +
                            "Požehnám tých, čo ťa budú žehnať, a prekľajem tých, čo ťa budú preklínať. V\u00A0tebe budú požehnané všetky pokolenia zeme.\" A Abram odišiel, ako mu rozkázal Pán.<br>" +
                            "Počuli sme Božie slovo."},
            {"17g", "", "", "Flp 4, 4-9",
                    "Myslite na\u00A0všetko, čo mravne čisté",
                    "Čítanie z Listu svätého apoštola Pavla Filipanom<br>" +
                            "Bratia, ustavične sa radujte v\u00A0Pánovi! Opakujem: Radujte sa! Vaša miernosť nech je známa všetkým ľuďom. Pán je blízko.<br>" +
                            "O nič nebuďte ustarostení. Ale vo\u00A0všetkom modlitbou, prosbou a so\u00A0vzdávaním vďaky prednášajte svoje žiadosti Bohu.<br>" +
                            "A Boží pokoj, ktorý prevyšuje každú chápavosť, uchráni vaše srdcia a vaše mysle v\u00A0Kristovi Ježišovi.<br>" +
                            "Napokon, bratia, myslite na\u00A0všetko, čo je pravdivé, čo je cudné, čo je spravodlivé, čo je mravne čisté, čo je milé a čo má dobrú povesť, čo je čnostné a chválitebné!<br>" +
                            "Robte to, čo ste sa naučili, prijali, počuli a videli na\u00A0mne! A Boh pokoja bude s\u00A0vami.<br>" +
                            "Počuli sme Božie slovo."},
            {"22g", "", "", "Pies 3, 1-4a",
                    "Našla som toho, ktorého moja duša miluje",
                    "Čítanie z Knihy Pieseň piesní<br>" +
                            "Snúbenica vraví: Na\u00A0svojom lôžku po\u00A0nociach hľadala som toho, ktorého moja duša miluje; hľadala som ho, ale nenašla. \"Vstanem a mesto pochodím: po\u00A0uliciach a námestiach budem hľadať toho, ktorého miluje moja duša.\"<br>" +
                            "Hľadala som ho, ale nenašla. Stretli ma strážcovia, čo boli na\u00A0obchôdzke po\u00A0meste. \"Nevideli ste toho, ktorého moja duša miluje?\"<br>" +
                            "A keď som trochu od\u00A0nich poodišla, našla som, koho moja duša miluje.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "2 Kor 5, 14-17",
                    "Nastalo nové",
                    "Čítanie z Druhého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, ženie nás Kristova láska, keď si uvedomíme, že ak jeden zomrel za\u00A0všetkých, teda všetci zomreli. A zomrel za\u00A0všetkých, aby aj tí, čo žijú, už nežili pre\u00A0seba, ale pre\u00A0toho, ktorý za\u00A0nich zomrel a vstal z\u00A0mŕtvych.<br>" +
                            "Preto odteraz nepoznáme nikoho podľa tela. A ak sme aj poznali Krista podľa tela, teraz už nepoznáme. Kto je teda v\u00A0Kristovi, je novým stvorením. Staré sa pominulo a nastalo nové.<br>" +
                            "Počuli sme Božie slovo."},
            {"23g", "", "", "Gal 2, 19-20",
                    "Už nežijem ja, ale vo mne žije Kristus",
                    "Čítanie z Listu svätého apoštola Pavla Galaťanom <br>" +
                            "Bratia, ja som skrze zákon zomrel zákonu, aby som žil Bohu. S\u00A0Kristom som pribitý na\u00A0kríž.<br>" +
                            "Už nežijem ja, ale vo\u00A0mne žije Kristus.<br>" +
                            "Ale život, ktorý teraz žijem v\u00A0tele, žijem vo\u00A0viere v\u00A0Božieho Syna, ktorý ma miluje a vydal seba samého za\u00A0mňa." +
                            "Počuli sme Božie slovo."},
            {"25g", "", "", "2 Kor 4, 7-15",
                    "Nosíme na\u00A0tele Ježišovo umieranie",
                    "Čítanie z Druhého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, tento poklad máme v\u00A0hlinených nádobách, aby mal Boh zvrchovanú moc, a nie my.<br>" +
                            "Zo všetkých strán nás sužujú, ale nie sme stiesnení; sme bezradní, ale nepoddávame sa; prenasledujú nás, ale nie sme opustení; zrážajú nás, ale nehynieme. Stále nosíme na\u00A0tele Ježišovo umieranie, aby sa na\u00A0našom tele zjavil aj Ježišov život.<br>" +
                            "A tak kým žijeme, ustavične sa vydávame na\u00A0smrť pre\u00A0Ježiša, aby sa aj Ježišov život zjavil na\u00A0našom smrteľnom tele. V\u00A0nás teda účinkuje smrť, vo\u00A0vás život.<br>" +
                            "Ale pretože máme toho istého ducha viery, ako je napísané: \"Uveril som, a preto som povedal,\" aj my veríme, a preto hovoríme. Veď vieme, že ten, čo vzkriesil Pána Ježiša, s\u00A0Ježišom vzkriesi aj nás a postaví nás s\u00A0vami.<br>" +
                            "A to všetko pre\u00A0vás, aby hojnosť milosti prostredníctvom mnohých rozmnožila vzdávanie vďaky na\u00A0Božiu slávu.<br>" +
                            "Počuli sme Božie slovo."},
            {"29", "", "", "1 Jn 4, 7-16",
                    "Boh nás miluje",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, milujme sa navzájom, lebo láska je z\u00A0Boha a každý, kto miluje, narodil sa z\u00A0Boha a pozná Boha. Kto nemiluje, nepoznal Boha, lebo Boh je láska.<br>" +
                            "A Božia láska k\u00A0nám sa prejavila v\u00A0tom, že Boh poslal svojho jednorodeného Syna na\u00A0svet, aby sme skrze neho mali život. Láska je v\u00A0tom, že nie my sme milovali Boha, ale že on miloval nás a poslal svojho Syna ako zmiernu obetu za\u00A0naše hriechy.<br>" +
                            "Milovaní, keď nás Boh tak miluje, aj my sme povinní milovať jeden druhého. Boha nikto nikdy nevidel; ale keď sa milujeme navzájom, Boh ostáva v\u00A0nás a jeho láska v\u00A0nás je dokonalá.<br>" +
                            "A že ostávame v\u00A0ňom a on v\u00A0nás, poznávame podľa toho, že nám dal zo\u00A0svojho Ducha. A my sme videli a svedčíme, že Otec poslal Syna za\u00A0Spasiteľa sveta.<br>" +
                            "Kto vyzná: \"Ježiš je Boží Syn,\" ostáva v\u00A0ňom Boh a on v\u00A0Bohu. A my, čo sme uverili, spoznali sme lásku, akú má Boh k\u00A0nám.<br>" +
                            "Boh je láska; a kto ostáva v\u00A0láske, ostáva v\u00A0Bohu a Boh ostáva v\u00A0ňom.<br>" +
                            "Počuli sme Božie slovo."},};
    String[][] citanie1_8 = {
            {"06gn", "", "", "Dan 7, 9-10. 13-14",
                    "Jeho rúcho bolo biele ako sneh",
                    "Čítanie z Knihy proroka Daniela<br>" +
                            "Díval som sa, kým postavili tróny, a Starec si sadol. Jeho rúcho bolo biele ako sneh a vlasy na\u00A0jeho hlave ako čistá vlna. Jeho trónom boli ohnivé plamene, kolesá jeho trónu blčiaci oheň. Od\u00A0neho vyvierala a prúdila ohnivá rieka; tisíce tisícov mu slúžili a desaťtisíce státisícov stáli okolo neho: zasadol k\u00A0súdu a knihy sa otvorili.<br>" +
                            "Videl som v\u00A0nočnom videní: V\u00A0nebeských oblakoch prichádzal ktosi ako Syn človeka a došiel až k\u00A0Starcovi. Priviedli ho pred\u00A0neho, dostal moc a slávu i kráľovstvo a budú mu slúžiť všetky národy, kmene a jazyky. Jeho vláda je večná, nikdy nezanikne, a jeho kráľovstvo nebude nikdy zničené.<br>" +
                            "Počuli sme Božie slovo.",
                    //iba ak nie je nedela
                    "Alebo:",
                    "2 Pt 1, 16-19",
                    "Tento hlas sme my počuli; zaznel z\u00A0neba",
                    "Čítanie z Druhého listu svätého apoštola Petra<br>" +
                            "Milovaní, nesledovali sme vymyslené bájky, keď sme vás oboznámili s\u00A0mocou a príchodom nášho Pána Ježiša Krista, ale sami sme boli očitými svedkami jeho veleby.<br>" +
                            "On dostal od\u00A0Boha Otca česť a slávu, keď mu z\u00A0velebnej slávy zaznel hlas: \"Toto je môj Syn, môj milovaný, v\u00A0ktorom mám zaľúbenie.\" A tento hlas sme my počuli; zaznel z\u00A0neba, keď sme boli s\u00A0ním na\u00A0svätom vrchu.<br>" +
                            "Tým je aj prorocké slovo pre\u00A0nás pevnejšie. A vy dobre robíte, že hľadíte naň ako na\u00A0lampu, ktorá svieti v\u00A0temnom mieste, kým nesvitne deň a nevzíde vo\u00A0vašich srdciach zornica.<br>" +
                            "Počuli sme Božie slovo."},
            {"09g", "", "", "Oz 2, 16bc. 17c-e. 21-22",
                    "Navždy si ťa zasnúbim",
                    "Čítanie z Knihy proroka Ozeáša<br>" +
                            "Toto hovorí Pán: \"Zavediem ju na\u00A0púšť a prihovorím sa jej srdcu. Tam bude poslúchať ako v\u00A0dňoch svojej mladosti, ako v\u00A0dňoch, keď vychádzala z\u00A0egyptskej krajiny.<br>" +
                            "Vtedy si ťa navždy zasnúbim, zasnúbim si ťa v\u00A0spravodlivosti a práve, v\u00A0láske a milosrdenstve, zasnúbim si ťa vo\u00A0vernosti a ty spoznáš Pána.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"10g", "", "", "2 Kor 9, 6-10",
                    "Veselého darcu Boh miluje",
                    "Čítanie z Druhého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, kto skúpo seje, skúpo bude aj žať; kto seje štedro, štedro bude aj žať. Každý tak, ako si umienil v\u00A0srdci; nie zo\u00A0žiaľu ani z\u00A0donútenia, lebo veselého darcu Boh miluje.<br>" +
                            "A Boh má moc rozhojniť vo\u00A0vás každú milosť, aby ste mali vždy vo\u00A0všetkom úplný dostatok a aby ste mali hojne na\u00A0každý dobrý skutok, ako je napísané: \"Rozsýpal a dal chudobným; jeho spravodlivosť trvá naveky.\"<br>" +
                            "Ten, čo dáva rozsievačovi semeno a chlieb na\u00A0jedenie, dá a rozmnoží vaše osivo a dá vzrast plodom vašej spravodlivosti.<br>" +
                            "Počuli sme Božie slovo."},
            {"14gk", "", "", "1 Krn 15, 3-4. 15-16; 16, 1-2",
                    "Priniesli Božiu archu a postavili ju uprostred stanu, ktorý pre\u00A0ňu postavil Dávid",
                    "Čítanie z Prvej knihy Kroník<br>" +
                            "Dávid zhromaždil celý Izrael v\u00A0Jeruzaleme, lebo sa prenášala Pánova archa na\u00A0miesto, ktoré pre\u00A0ňu pripravil.<br>" +
                            "Zhromaždil aj Áronových synov a levitov. Synovia Léviho niesli Božiu archu pomocou žrdí na\u00A0pleciach, ako to podľa Pánovho slova prikázal Mojžiš.<br>" +
                            "Dávid rozkázal predstaveným levitov, aby zo\u00A0svojich bratov ustanovili spevákov s\u00A0hudobnými nástrojmi, s\u00A0citarami, harfami a cimbalmi tak, aby mocne znelo radostné plesanie.<br>" +
                            "Tak preniesli Božiu archu a postavili ju uprostred stanu, ktorý pre\u00A0ňu postavil Dávid. Potom obetovali pred\u00A0Bohom zápalné a pokojné obety.<br>" +
                            "Keď Dávid skončil obetovanie zápalných a pokojných obiet, požehnal ľud v\u00A0mene Pánovom.<br>" +
                            "Počuli sme Božie slovo."},
            {"15gk", "", "", "Zjv 11, 19a; 12, 1-6a. 10a-c ",
                    "Žena odetá slnkom, pod\u00A0jej nohami mesiac",
                    "Čítanie z knihy zjavenia svätého apoštola Jána<br>" +
                            "V nebi sa otvoril Boží chrám a v\u00A0chráme bolo vidieť archu jeho zmluvy. Potom sa na\u00A0nebi ukázalo veľké znamenie: Žena odetá slnkom, pod\u00A0jej nohami mesiac a na\u00A0jej hlave veniec z\u00A0dvanástich hviezd. Bola ťarchavá a kričala v\u00A0bolestiach, lebo mala rodiť.<br>" +
                            "A bolo vidieť aj iné znamenie na\u00A0nebi: Veľký ohnivý drak; mal sedem hláv a desať rohov a na\u00A0hlavách sedem diadémov; jeho chvost zmietol tretinu nebeských hviezd a vrhol ich na\u00A0zem.<br>" +
                            "A drak sa postavil pred\u00A0ženu, ktorá mala rodiť, aby zhltol jej dieťa, len čo ho porodí.<br>" +
                            "I porodila syna, chlapca, ktorý má železným žezlom panovať nad\u00A0všetkými národmi. A jej dieťa bolo uchvátené k\u00A0Bohu a k\u00A0jeho trónu. Žena potom utiekla na\u00A0púšť, kde jej Boh pripravil miesto. A počul som mohutný hlas volať v\u00A0nebi: \"Teraz nastala spása, moc a kráľovstvo nášho Boha a vláda jeho Pomazaného.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"24g", "", "", "Zjv 21, 9b-14",
                    "Na základných kameňoch bolo dvanásť mien dvanástich Baránkových apoštolov",
                    "Čítanie z knihy zjavenia svätého apoštola Jána<br>" +
                            "Jeden zo\u00A0siedmich anjelov mi povedal: \"Poď, ukážem ti nevestu, Baránkovu manželku!\"<br>" +
                            "A v\u00A0duchu ma preniesol na\u00A0veľký a vysoký vrch a ukázal mi sväté mesto Jeruzalem, ako zostupuje z\u00A0neba od\u00A0Boha ožiarené Božou slávou. Jeho jas bol podobný najdrahšiemu kameňu, akoby krištáľovo čistému kameňu jaspisu.<br>" +
                            "Malo veľké a vysoké hradby. Malo dvanásť brán a na\u00A0bránach dvanásť anjelov a napísané mená dvanástich kmeňov synov Izraela.<br>" +
                            "Tri brány boli od\u00A0východu, tri brány od\u00A0severu, tri brány od\u00A0juhu a tri brány od\u00A0západu. Hradby mesta mali dvanásť základných kameňov a na\u00A0nich dvanásť mien dvanástich Baránkových apoštolov.<br>" +
                            "Počuli sme Božie slovo."},
            {"29", "", "", "Jer 1, 17-19",
                    "Povedz im všetko, čo ti prikazujem; nezľakni sa ich",
                    "Čítanie z Knihy proroka Jeremiáša<br>" +
                            "Pán prehovoril ku\u00A0mne takto: \"Prepáš si teda bedrá, vstaň a povedz im všetko, čo ti prikazujem! Nezľakni sa ich, aby som ti nenahnal strach pred\u00A0nimi.<br>" +
                            "Ja ťa dnes urobím opevneným mestom, železným stĺpom a bronzovým múrom proti celej krajine, proti kráľom Judey a jej kniežatám, proti kňazom a ľudu krajiny.<br>" +
                            "Budú proti tebe bojovať, no nepremôžu ťa, lebo s\u00A0tebou som ja, hovorí Pán, ja ťa zachránim.\"<br>" +
                            "Počuli sme Božie slovo."},};
    String[][] citanie1_9 = {
            {"08g", "", "", "Mich 5, 1-4a ",
                    "Kým rodička neporodí",
                    "Čítanie z Knihy proroka Micheáša<br>" +
                            "Toto hovorí Pán: \"Betlehem Efratský, najmenší medzi judejskými mestami, z\u00A0teba vzíde zvrchovaný vládca Izraela. Pôvod jeho je odpradávna, od\u00A0večnosti. Preto ich vydá až do\u00A0času, kým rodička neporodí. Až potom sa zvyšok jeho bratov vráti k\u00A0synom Izraela.<br>" +
                            "On vystúpi a bude ich pastierom silou Pána, velebou mena Pána, svojho Boha. A budú žiť v\u00A0istote, lebo teraz bude veľký až po\u00A0končiny zeme. On bude pokoj.\"<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Rim 8, 28-30",
                    "Ktorých Boh predpoznal, tých aj predurčil",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, vieme, že tým, čo milujú Boha, všetko slúži na\u00A0dobré; tým, čo sú povolaní podľa jeho rozhodnutia. Lebo ktorých predpoznal, tých aj predurčil, že sa stanú podobnými obrazu jeho Syna, aby on bol prvorodený medzi mnohými bratmi.<br>" +
                            "A tých, ktorých predurčil, aj povolal, a ktorých povolal, tých aj ospravedlnil, a tých, čo ospravedlnil, aj oslávil.<br>" +
                            "Počuli sme Božie slovo."},
            {"14gn", "", "", "Nm 21, 4c-9",
                    "Ak sa pohryzený pozrie naň, ostane nažive",
                    "Čítanie z Knihy Numeri<br>" +
                            "Ľud začal chabnúť na\u00A0ceste.<br>" +
                            "Reptal proti Bohu i Mojžišovi: \"Prečo ste nás vyviedli z\u00A0Egypta? Aby sme umreli na\u00A0púšti? Niet chleba, niet vody! A tento biedny pokrm sa nám už protiví.\"<br>" +
                            "Preto Pán poslal na\u00A0ľudí ohnivé hady. Ony hrýzli ľud a mnoho ľudí z\u00A0Izraela zomrelo. Prišli k\u00A0Mojžišovi a povedali: \"Zhrešili sme, lebo sme reptali proti Pánovi a proti tebe. Pros Pána, aby nás oslobodil od\u00A0hadov.\"<br>" +
                            "Mojžiš sa modlil za\u00A0ľud a Pán mu povedal: \"Urob ohnivého hada a postav ho ako znamenie; ak sa pohryzený pozrie naň, ostane nažive.\"<br>" +
                            "Mojžiš teda urobil medeného hada a postavil ho ako znamenie. A keď naň pohryzení pozreli, ozdraveli.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Flp 2, 6-11",
                    "Uponížil sa, preto ho Boh povýšil",
                    "Čítanie z Listu svätého apoštola Pavla Filipanom<br>" +
                            "Ježiš Kristus, hoci má božskú prirodzenosť, nepridŕžal sa svojej rovnosti s\u00A0Bohom, ale zriekol sa seba samého, vzal si prirodzenosť sluhu, stal sa podobný ľuďom a podľa vonkajšieho zjavu bol pokladaný za\u00A0človeka. Uponížil sa, stal sa poslušným až na\u00A0smrť, až na\u00A0smrť na\u00A0kríži.<br>" +
                            "Preto ho Boh nad\u00A0všetko povýšil a dal mu meno, ktoré je nad\u00A0každé iné meno, aby sa na\u00A0meno Ježiš zohlo každé koleno v\u00A0nebi, na\u00A0zemi i v\u00A0podsvetí a aby každý jazyk vyznával: „Ježiš Kristus je Pán!“ na\u00A0slávu Boha Otca.<br>" +
                            "Počuli sme Božie slovo."},
            {"15gk", "", "", "Sk 1, 12-14",
                    "Jednomyseľne zotrvávali na\u00A0modlitbách",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď bol Ježiš vzatý do\u00A0neba, apoštoli sa vrátili do\u00A0Jeruzalema z\u00A0hory, ktorá sa volá Olivová a je blízko Jeruzalema, vzdialená toľko, koľko je dovolené prejsť v\u00A0sobotu.<br>" +
                            "Keď ta prišli, vystúpili do\u00A0hornej siene, kde sa zdržiavali Peter a Ján, Jakub a Ondrej, Filip a Tomáš, Bartolomej a Matúš, Jakub Alfejov, Šimon Horlivec a Júda Jakubov. Títo všetci jednomyseľne zotrvávali na\u00A0modlitbách spolu so\u00A0ženami, s\u00A0Ježišovou matkou Máriou a s\u00A0jeho bratmi.<br>" +
                            "Počuli sme Božie slovo."},
            {"21g", "", "", "Ef 4, 1-7. 11-13",
                    "Na dielo služby, na\u00A0budovanie Kristovho tela",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Bratia, prosím vás ja, väzeň v\u00A0Pánovi, aby ste žili dôstojne podľa povolania, ktorého sa vám dostalo, so\u00A0všetkou pokorou, miernosťou a zhovievavosťou. Znášajte sa navzájom v\u00A0láske a usilujte sa zachovať jednotu ducha vo\u00A0zväzku pokoja.<br>" +
                            "Jedno je telo a jeden Duch, ako ste aj povolaní v\u00A0jednej nádeji svojho povolania. Jeden je Pán, jedna viera, jeden krst. Jeden je Boh a Otec všetkých, ktorý je nad\u00A0všetkými, preniká všetkých a je vo\u00A0všetkých.<br>" +
                            "Ale každý z\u00A0nás dostal milosť podľa miery, akou nás obdaroval Kristus. On ustanovil niektorých za\u00A0apoštolov, niektorých za\u00A0prorokov, iných za\u00A0evanjelistov a iných za\u00A0pastierov a učiteľov, aby pripravovali svätých na\u00A0dielo služby, na\u00A0budovanie Kristovho tela, kým nedospejeme všetci k\u00A0jednote viery a poznania Božieho Syna, k\u00A0zrelosti muža, k\u00A0miere plného Kristovho veku.<br>" +
                            "Počuli sme Božie slovo."},
            {"29g", "", "", "Dan 7, 9-10. 13-14",
                    "Jeho rúcho bolo biele ako sneh",
                    "Čítanie z Knihy proroka Daniela<br>" +
                            "Díval som sa, kým postavili tróny, a Starec si sadol. Jeho rúcho bolo biele ako sneh a vlasy na\u00A0jeho hlave ako čistá vlna. Jeho trónom boli ohnivé plamene, kolesá jeho trónu blčiaci oheň. Od\u00A0neho vyvierala a prúdila ohnivá rieka; tisíce tisícov mu slúžili a desaťtisíce státisícov stáli okolo neho: zasadol k\u00A0súdu a knihy sa otvorili.<br>" +
                            "Videl som v\u00A0nočnom videní: V\u00A0nebeských oblakoch prichádzal ktosi ako Syn človeka a došiel až k\u00A0Starcovi. Priviedli ho pred\u00A0neho, dostal moc a slávu i kráľovstvo a budú mu slúžiť všetky národy, kmene a jazyky. Jeho vláda je večná, nikdy nezanikne, a jeho kráľovstvo nebude nikdy zničené.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Zjv 12, 7-12a",
                    "Michal a jeho anjeli bojovali proti drakovi",
                    "Čítanie z Knihy zjavenie svätého apoštola Jána <br>" +
                            "Na nebi sa strhol boj: Michal a jeho anjeli bojovali proti drakovi. Bojoval drak i jeho anjeli, ale neobstáli a už nebolo pre\u00A0nich miesto v\u00A0nebi.<br>" +
                            "A veľký drak, ten starý had, ktorý sa volá diabol a satan, čo zvádzal celý svet, bol zvrhnutý; zvrhnutý bol na\u00A0zem a s\u00A0ním boli zvrhnutí jeho anjeli.<br>" +
                            "A počul som mohutný hlas volať v\u00A0nebi: \"Teraz nastala spása, moc a kráľovstvo nášho Boha a vláda jeho Pomazaného, lebo bol zvrhnutý žalobca našich bratov, ktorý na\u00A0nich dňom i nocou žaloval pred\u00A0naším Bohom.<br>" +
                            "Ale oni nad\u00A0ním zvíťazili pre\u00A0Baránkovu krv a pre\u00A0slovo svojho svedectva; a nemilovali svoj život až na\u00A0smrť.<br>" +
                            "Preto radujte sa, nebesia, aj vy, čo v\u00A0nich bývate.<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] citanie1_10 = {
            {"02", "", "", "Ex 23, 20-23a",
                    "Môj anjel pôjde pred\u00A0tebou",
                    "Čítanie z Knihy Exodus<br>" +
                            "Toto hovorí Pán: \"Pošlem pred\u00A0tebou anjela, aby ťa chránil na\u00A0ceste a priviedol ťa na\u00A0miesto, ktoré som pripravil.<br>" +
                            "Váž si ho a počúvaj jeho hlas; nepohŕdaj ním, lebo by vám neodpustil vaše previnenie, pretože je v\u00A0ňom moje meno.<br>" +
                            "Ak počúvneš jeho hlas a urobíš všetko, čo hovorím, budem nepriateľom tvojich nepriateľov a budem sužovať tých, čo teba sužujú.<br>" +
                            "Môj anjel pôjde pred\u00A0tebou.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"07", "", "", "Sk 1, 12-14",
                    "Zotrvávali na\u00A0modlitbách spolu s\u00A0Ježišovou matkou Máriou",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď bol Ježiš vzatý do\u00A0neba, apoštoli sa vrátili do\u00A0Jeruzalema z\u00A0hory, ktorá sa volá Olivová a je blízko Jeruzalema, vzdialená toľko, koľko je dovolené prejsť v\u00A0sobotu.<br>" +
                            "Keď ta prišli, vystúpili do\u00A0hornej siene, kde sa zdržiavali Peter a Ján, Jakub a Ondrej, Filip a Tomáš, Bartolomej a Matúš, Jakub Alfejov, Šimon Horlivec a Júda Jakubov.<br>" +
                            "Títo všetci jednomyseľne zotrvávali na\u00A0modlitbách spolu so\u00A0ženami, s\u00A0Ježišovou matkou Máriou a s\u00A0jeho bratmi.<br>" +
                            "Počuli sme Božie slovo."},
            {"18g", "", "", "2 Tim 4, 10-17b",
                    "Jediný Lukáš je so\u00A0mnou",
                    "Čítanie z Druhého listu svätého apoštola Pavla Timotejovi<br>" +
                            "Milovaný, Démas ma opustil, lebo miluje tento svet, a odišiel do\u00A0Solúna, Krescent do\u00A0Galácie, Títus do\u00A0Dalmácie. Jediný Lukáš je so\u00A0mnou. Vezmi Marka a priveď ho so\u00A0sebou, lebo je mi užitočný v\u00A0službe. Tychika som poslal do\u00A0Efezu. Keď prídeš, prines plášť, čo som si nechal v\u00A0Troade u\u00A0Karpa, aj knihy a najmä pergameny.<br>" +
                            "Kováč Alexander mi spôsobil veľa zlého. Pán mu odplatí podľa jeho skutkov. Aj ty sa ho chráň, lebo veľmi odporoval našim slovám.<br>" +
                            "Keď som sa prvý raz bránil, nebol pri\u00A0mne nik; všetci ma opustili. Nech sa im to nepočíta. Ale Pán stál pri\u00A0mne a posilňoval ma, aby sa cezo mňa naplnilo ohlasovanie a aby ho počuli všetky národy.<br>" +
                            "Počuli sme Božie slovo."},
            {"26gk+", "", "", "Iz 56, 1. 6-7",
                    "Cudzincov privediem na\u00A0svoj svätý vrch",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán: \"Zachovajte právo, konajte spravodlivo, lebo je blízko moja spása, už príde, aj moja spravodlivosť, už sa zjaví.<br>" +
                            "A cudzincov, čo sa vinú k\u00A0Pánovi, čo si ho ctia, čo milujú jeho meno a čo mu slúžia, všetkých, čo zachovávajú sobotu bez\u00A0znesvätenia a pridŕžajú sa mojej zmluvy, privediem na\u00A0svoj svätý vrch a naplním ich radosťou v\u00A0mojom dome modlitby. Ich žertvy a ich obety mi budú potešením na\u00A0mojom oltári; veď môj dom sa bude volať domom modlitby pre\u00A0všetky národy. \"<br>" +
                            "Počuli sme Božie slovo."},
            {"28g", "", "", "Ef 2, 19-22",
                    "Celá stavba rastie v\u00A0svätý chrám v\u00A0Pánovi",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Bratia, už nie ste cudzinci ani prišelci, ale ste spoluobčania svätých a patríte do\u00A0Božej rodiny. Ste postavení na\u00A0základe apoštolov a prorokov; hlavným uholným kameňom je sám Kristus Ježiš. V\u00A0ňom celá stavba pevne pospájaná rastie v\u00A0svätý chrám v\u00A0Pánovi, v\u00A0ňom ste aj vy vbudovaní do\u00A0Božieho príbytku v\u00A0Duchu.<br>" +
                            "Počuli sme Božie slovo."},
            {"31gk", "", "", "Zjv 7, 2-4. 9-14",
                    "Hľa, veľký zástup, ktorý nik nemohol spočítať, zo\u00A0všetkých národov, kmeňov, plemien a jazykov",
                    "Čítanie z Knihy zjavenia svätého apoštola Jána<br>" +
                            "Ja, Ján, videl som vystupovať od\u00A0východu slnka iného anjela, ktorý mal pečať živého Boha a mohutným hlasom zvolal na\u00A0štyroch anjelov, ktorí dostali moc škodiť zemi a moru: \"Neškoďte zemi ani moru ani stromom, kým neoznačíme na\u00A0čele služobníkov nášho Boha!\"<br>" +
                            "A počul som počet označených: stoštyridsaťštyritisíc označených zo\u00A0všetkých kmeňov synov Izraela.<br>" +
                            "Potom som videl; a hľa, veľký zástup, ktorý nik nemohol spočítať, zo\u00A0všetkých národov, kmeňov, plemien a jazykov. Stáli pred\u00A0trónom a pred\u00A0Baránkom, oblečení do\u00A0bieleho rúcha, v\u00A0rukách mali palmy a mohutným hlasom volali: \"Spása nášmu Bohu, ktorý sedí na\u00A0tróne, a Baránkovi!\"<br>" +
                            "Všetci anjeli stáli okolo trónu, starcov a štyroch bytostí, padli na\u00A0tvár pred\u00A0trónom, klaňali sa Bohu a volali: \"Amen! Dobrorečenie a sláva, múdrosť a vďaka, česť a moc i sila nášmu Bohu na\u00A0veky vekov. Amen.\"<br>" +
                            "I prehovoril jeden zo\u00A0starcov a povedal mi: \"Kto sú títo oblečení do\u00A0bieleho rúcha a odkiaľ prišli?\"<br>" +
                            "Povedal som mu: \"Pán môj, ty to vieš.\"<br>" +
                            "A on mi povedal: \"To sú tí, čo prichádzajú z\u00A0veľkého súženia: oprali si rúcha a zbielili ich v\u00A0Baránkovej krvi.\"<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] citanie1_11 = {
            {"01gk", "", "", "Zjv 7, 2-4. 9-14",
                    "Hľa, veľký zástup, ktorý nik nemohol spočítať, zo\u00A0všetkých národov, kmeňov, plemien a jazykov",
                    "Čítanie z Knihy zjavenia svätého apoštola Jána<br>" +
                            "Ja, Ján, videl som vystupovať od\u00A0východu slnka iného anjela, ktorý mal pečať živého Boha a mohutným hlasom zvolal na\u00A0štyroch anjelov, ktorí dostali moc škodiť zemi a moru: \"Neškoďte zemi ani moru ani stromom, kým neoznačíme na\u00A0čele služobníkov nášho Boha!\"<br>" +
                            "A počul som počet označených: stoštyridsaťštyritisíc označených zo\u00A0všetkých kmeňov synov Izraela.<br>" +
                            "Potom som videl; a hľa, veľký zástup, ktorý nik nemohol spočítať, zo\u00A0všetkých národov, kmeňov, plemien a jazykov. Stáli pred\u00A0trónom a pred\u00A0Baránkom, oblečení do\u00A0bieleho rúcha, v\u00A0rukách mali palmy a mohutným hlasom volali: \"Spása nášmu Bohu, ktorý sedí na\u00A0tróne, a Baránkovi!\"<br>" +
                            "Všetci anjeli stáli okolo trónu, starcov a štyroch bytostí, padli na\u00A0tvár pred\u00A0trónom, klaňali sa Bohu a volali: \"Amen! Dobrorečenie a sláva, múdrosť a vďaka, česť a moc i sila nášmu Bohu na\u00A0veky vekov. Amen.\"<br>" +
                            "I prehovoril jeden zo\u00A0starcov a povedal mi: \"Kto sú títo oblečení do\u00A0bieleho rúcha a odkiaľ prišli?\"<br>" +
                            "Povedal som mu: \"Pán môj, ty to vieš.\"<br>" +
                            "A on mi povedal: \"To sú tí, čo prichádzajú z\u00A0veľkého súženia: oprali si rúcha a zbielili ich v\u00A0Baránkovej krvi.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"02an", "", "", "Jób 19, 1. 23-27a",
                    "Viem, že môj vykupiteľ žije",
                    "Čítanie z Knihy Jób<br>" +
                            "Jób prehovoril takto: \"Bár by moje slová boli napísané, bár by ich zaznačili do\u00A0knihy železným rydlom a olovom, aby navždy zostali vrýpané do\u00A0skaly.<br>" +
                            "Ja viem, že môj vykupiteľ žije a ako posledný bude stáť nad\u00A0prachom; a hoc moja koža bude rozrušená, zo\u00A0svojho tela budem vidieť Boha. Veru, ja sám ho uvidím.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"02bn", "", "", "Múd 3, 1-9",
                    "Prijal ich ako celopalnú žertvu",
                    "Čítanie z Knihy Múdrosti<br>" +
                            "Duše spravodlivých sú v\u00A0Božích rukách, muka smrti sa ich nedotkne. Nemúdri sa nazdávali, že sú mŕtvi; za\u00A0nešťastie pokladali ich smrť a ich odchod od\u00A0nás za\u00A0záhubu. Ale oni sú v\u00A0pokoji. A hoci v\u00A0očiach ľudí pretrpeli muky, ich nádej je plná nesmrteľnosti.<br>" +
                            "Po krátkom utrpení prijmú veľké dobrodenie, lebo ich Boh skúšal a zistil, že sú ho hodni.<br>" +
                            "Vyskúšal ich ako zlato v\u00A0peci a prijal ich ako celopalnú žertvu. V\u00A0deň ich súdu zažiaria, prebehnú sťa iskry cez\u00A0trstinu, súdiť budú ľudstvo, nad\u00A0národmi budú panovať a Pán bude nad\u00A0nimi kraľovať naveky.<br>" +
                            "Tí, čo v\u00A0neho dúfajú, poznajú pravdu a verní zotrvajú v\u00A0láske pri\u00A0ňom, lebo pre\u00A0svätých je pripravená milosť a zľutovanie a pre\u00A0jeho vyvolených odmena.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Múd 3, 1-6. 9",
                    "Prijal ich ako celopalnú žertvu",
                    "Čítanie z Knihy Múdrosti <br>" +
                            "Duše spravodlivých sú v\u00A0Božích rukách, muka smrti sa ich nedotkne. Nemúdri sa nazdávali, že sú mŕtvi; za\u00A0nešťastie pokladali ich smrť a ich odchod od\u00A0nás za\u00A0záhubu. Ale oni sú v\u00A0pokoji. A hoci v\u00A0očiach ľudí pretrpeli muky, ich nádej je plná nesmrteľnosti.<br>" +
                            "Po krátkom utrpení prijmú veľké dobrodenie, lebo ich Boh skúšal a zistil, že sú ho hodni.<br>" +
                            "Vyskúšal ich ako zlato v\u00A0peci a prijal ich ako celopalnú žertvu. Tí, čo v\u00A0neho dúfajú, poznajú pravdu a verní zotrvajú v\u00A0láske pri\u00A0ňom, lebo pre\u00A0svätých je pripravená milosť a zľutovanie a pre\u00A0jeho vyvolených odmena.<br>" +
                            "Počuli sme Božie slovo."},
            {"02cn", "", "", "Dan 12, 1-3",
                    "Tí, čo spia v\u00A0prachu zeme, sa zobudia",
                    "Čítanie z Knihy proroka Daniela<br>" +
                            "V tých dňoch som ja, Daniel, žialil a počul som toto Pánovo slovo: \"V tom čase povstane Michal, veľké knieža, čo chráni synov tvojho ľudu. Bude to čas úzkosti, aký nebol odvtedy, čo vznikli národy, až po\u00A0ten čas.<br>" +
                            "V tom čase sa tvoj národ zachráni; každý, koho nájdu zapísaného v\u00A0knihe.<br>" +
                            "A mnohí z\u00A0tých, čo spia v\u00A0prachu zeme, sa zobudia; jedni na\u00A0večný život, druhí na\u00A0večnú potupu.<br>" +
                            "Múdri sa budú skvieť ako jas oblohy a tí, čo mnohých priviedli k\u00A0spravodlivosti, ako hviezdy na\u00A0večné veky.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"09g", "", "", "Ez 47, 1-2. 8-9. 12",
                    "Videl som vodu vytekať z\u00A0chrámu; a všetko, k\u00A0čomu sa táto voda dostala, ozdravelo",
                    "Čítanie z Knihy proroka Ezechiela<br>" +
                            "Anjel ma obrátil k\u00A0bráne Pánovho chrámu a hľa, spod prahu chrámu vyvierala voda smerom na\u00A0východ – na\u00A0východ bolo totiž obrátené chrámové priečelie – a tiekla z\u00A0pravej strany chrámu, južne od\u00A0oltára.<br>" +
                            "Potom ma vyviedol severnou bránou von a obrátil ma smerom k\u00A0vonkajšej bráne, obrátenej na\u00A0východ, a hľa, voda vytekala z\u00A0pravej strany.<br>" +
                            "A povedal mi: \"Táto voda prúdi do\u00A0východnej krajiny, preteká cez\u00A0Arabu, vleje sa do\u00A0mora, do\u00A0slaných vôd, a vody sa uzdravia. A všade, kam sa rieka dostane, bude žiť všetko, čo sa hýbe; bude veľmi mnoho rýb všade, kam sa dostane táto voda; ozdravie a žiť bude všetko, k\u00A0čomu sa rieka dostane. Pri\u00A0rieke, na\u00A0oboch jej brehoch, budú rásť rozličné ovocné stromy. Lístie z\u00A0nich neopadne a nikdy nebudú bez\u00A0ovocia. Každý mesiac prinesú čerstvé plody, lebo jej voda vyteká zo\u00A0svätyne. Ich ovocie bude pokrmom a ich lístie liekom.\"<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "1 Kor 3, 9c-11. 16-17",
                    "Ste Boží chrám",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, vy ste Božia stavba.<br>" +
                            "Podľa Božej milosti, ktorú som dostal, položil som ako múdry staviteľ základ a iný na\u00A0ňom stavia. Ale každý nech si dáva pozor, ako na\u00A0ňom stavia. Lebo nik nemôže položiť iný základ okrem toho, čo je už položený, a je ním Ježiš Kristus.<br>" +
                            "Neviete že ste Boží chrám a že vo\u00A0vás prebýva Boží Duch? Kto by teda Boží chrám zničil, toho Boh zničí. Lebo Boží chrám je svätý – a ním ste vy.<br>" +
                            "Počuli sme Božie slovo."},
            {"11g", "", "", "Iz 61, 1-3",
                    "Pán ma pomazal a poslal ma hlásať evanjelium chudobným",
                    "Čítanie z Knihy proroka Izaiaša<br>" +
                            "Duch Pána, Boha, je nado mnou, pretože ma Pán pomazal: poslal ma hlásať radostnú zvesť chudobným, uzdraviť skrúšených srdcom, oznámiť zajatým slobodu, väzneným prepustenie, ohlásiť rok milosti Pána a deň pomsty nášho Boha, aby som potešil všetkých zarmútených a tým, čo oplakávajú Sion, dal veniec namiesto popola, olej plesania namiesto smútku, rúcho radosti namiesto ducha skleslého. Budú sa volať dubmi spravodlivosti, sadenicou Pána na\u00A0jeho oslavu.<br>" +
                            "Počuli sme Božie slovo."},
            {"17gk", "", "", "Gn 12, 1-4a",
                    "Odíď zo\u00A0svojej krajiny a od\u00A0svojich príbuznych",
                    "Čítanie z Knihy Genezis<br>" +
                            "Pán povedal Abramovi:<br>" +
                            "\"Odíď zo\u00A0svojej krajiny, od\u00A0svojich príbuzných<br>" +
                            "a z\u00A0domu svojho otca<br>" +
                            "do krajiny, ktorú ti ukážem.<br>" +
                            "Urobím z\u00A0teba veľký národ<br>" +
                            "a požehnám ťa,<br>" +
                            "oslávim tvoje meno<br>" +
                            "a budeš požehnaním.<br>" +
                            "Požehnám tých, čo ťa budú žehnať,<br>" +
                            "a prekľajem tých, čo ťa budú preklínať.<br>" +
                            "V tebe budú požehnane<br>" +
                            "všetky pokolenia zeme.\"<br>" +
                            "A Abram odišiel, ako mu rozkázal Pán.<br>" +
                            "Počuli sme Božie slovo."},
            {"18", "", "", "Sk 28, 11-16. 30-31",
                    "Tak sme prišli do\u00A0Ríma",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Po troch mesiacoch sme vyplávali na\u00A0alexandrijskej lodi, čo zimovala na\u00A0ostrove a mala v\u00A0znaku Blížence. Prišli sme do\u00A0Syrakúz a zostali sme tam tri dni. Potom sme stade odrazili a dostali sme sa do\u00A0Régia. Na\u00A0druhý deň začal viať južný vietor a za\u00A0dva dni sme došli do\u00A0Puteol. Tam sme našli bratov, ktorí nás prosili, aby sme u\u00A0nich zostali sedem dní. A tak sme prišli do\u00A0Ríma.<br>" +
                            "Dopočuli sa o\u00A0nás tamojší bratia a prišli nám naproti až po\u00A0Appiovo Fórum a k\u00A0Trom Tabernám. Keď ich Pavol zazrel, vzdával Bohu vďaky a nadobudol úfnosť.<br>" +
                            "Keď sme prišli do\u00A0Ríma, dovolili Pavlovi bývať oddelene len s\u00A0vojakom, čo ho strážil.<br>" +
                            "Pavol potom zostal celé dva roky vo\u00A0svojom najatom byte a prijímal všetkých, čo k\u00A0nemu prichádzali. Ohlasoval Božie kráľovstvo a učil o\u00A0Pánu Ježišovi Kristovi so\u00A0všetkou odvahou a bez\u00A0prekážky.<br>" +
                            "Počuli sme Božie slovo."},
            {"21", "", "", "Zach 2, 14-17",
                    "Raduj sa, dcéra Siona, lebo hľa, ja prichádzam",
                    "Čítanie z Knihy proroka Zachariáša<br>" +
                            "Plesaj a raduj sa, dcéra Siona, lebo hľa, ja prichádzam a budem bývať uprostred teba, hovorí Pán. V\u00A0ten deň sa mnohé národy pripoja k\u00A0Pánovi a budú jeho ľudom. Budem bývať uprostred teba a budeš vedieť, že ma Pán zástupov poslal k\u00A0tebe.<br>" +
                            "Pán bude vlastniť Júdu ako svoj podiel vo\u00A0svätej zemi a znovu si vyvolí Jeruzalem. Nech mlčí pred\u00A0Pánom každé telo, lebo vstáva zo\u00A0svojho svätého príbytku.<br>" +
                            "Počuli sme Božie slovo."},
            {"30g", "", "", "Rim 10, 9-18",
                    "Viera je z\u00A0hlásania a hlásanie skrze Kristovo slovo",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Ak svojimi ústami vyznávaš: \"Ježiš je Pán!\" a vo\u00A0svojom srdci uveríš, že Boh ho vzkriesil z\u00A0mŕtvych, budeš spasený. Lebo srdcom veríme na\u00A0spravodlivosť a ústami vyznávame na\u00A0spásu. Veď Písmo hovorí: \"Nik, kto v\u00A0neho verí, nebude zahanbený.\"<br>" +
                            "Niet rozdielu medzi Židom a Grékom, lebo ten istý je Pán všetkých, bohatý pre\u00A0všetkých, ktorí ho vzývajú: Lebo každý, kto bude vzývať Pánovo meno, bude spasený.<br>" +
                            "Ale ako budú vzývať toho, v\u00A0ktorého neuverili? A ako uveria v\u00A0toho, o\u00A0ktorom nepočuli? A ako počujú bez\u00A0kazateľa? A ako budú kázať, ak nie sú poslaní? Ako je napísané: \"Aké krásne sú nohy tých, čo hlásajú dobrú zvesť.\"<br>" +
                            "Lenže nie všetci poslúchli evanjelium. Aj Izaiáš hovorí: \"Pane, kto uveril tomu, čo sme hlásali?\"<br>" +
                            "Teda viera je z\u00A0hlásania a hlásanie skrze Kristovo slovo.<br>" +
                            "Ale spytujem sa: Azda nepočuli? Ale áno, po\u00A0celej zemi rozlieha sa ich hlas a ich slová až po\u00A0hranice sveta.<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] citanie1_12 = {
            {"03g", "", "", "1 Kor 9, 16-19. 22-23",
                    "Beda mi, keby som evanjelium nehlásal",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, ak hlásam evanjelium, nemám sa čím chváliť; to je moja povinnosť a beda mi, keby som evanjelium nehlásal. Ak to robím z\u00A0vlastnej vôle, mám nárok na\u00A0odmenu, ale ak nie z\u00A0vlastnej vôle, je to služba, ktorá mi je zverená.<br>" +
                            "Aká je teda moja odmena? Že keď hlásam evanjelium, predkladám ho zadarmo a nevyužívam svoje právo pri\u00A0evanjeliu.<br>" +
                            "Lebo hoci som slobodný voči všetkým, stal som sa sluhom všetkých, aby som čím viacerých získal. Pre\u00A0slabých som sa stal slabým, aby som získal slabých. Pre\u00A0všetkých som sa stal všetkým, aby som zachránil aspoň niektorých. A všetko robím pre\u00A0evanjelium, aby som mal na\u00A0ňom podiel.<br>" +
                            "Počuli sme Božie slovo."},
            {"17", "", "", "Gn 49, 1-2. 8-10",
                    "Nebude odňaté žezlo od\u00A0Júdu",
                    "Čítanie z Knihy Genezis <br>" +
                            "Jakub zavolal svojich synov a povedal im: \"Zhromaždite sa a oznámim vám, čo vás čaká v\u00A0ďalekej budúcnosti: Zhromaždite sa a počúvajte, Jakubovi synovia, počujte Izraela, svojho otca!<br>" +
                            "Júda, teba budú chváliť tvoji bratia, tvoja ruka bude na\u00A0šiji tvojich nepriateľov, tebe sa budú klaňať synovia tvojho otca. Mladým levom si Júda, od\u00A0koristi vstávaš, syn môj; líha si a odpočíva ako lev a ako levica: kto sa ho odváži vyrušiť?<br>" +
                            "Nebude odňaté žezlo od\u00A0Júdu ani vladárska berla od\u00A0jeho nôh, kým nepríde ten, komu patrí, ktorého budú poslúchať národy.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"18", "", "", "Jer 23, 5-8",
                    "Vzbudím Dávidovi spravodlivý výhonok",
                    "Čítanie z Knihy proroka Jeremiáša<br>" +
                            "Hľa, prídu dni, hovorí Pán, a vzbudím Dávidovi spravodlivý výhonok, kráľa, ktorý bude múdro panovať a uskutoční právo a spravodlivosť na\u00A0zemi. Za\u00A0jeho dní Júda dosiahne spásu a Izrael bude bývať v\u00A0istote. A toto je meno, ktorým ho budú volať: \"Pán je naša spravodlivosť.\"<br>" +
                            "Preto, hľa, prídu dni, hovorí Pán, keď už nebudú vravieť: \"Ako žije Pán, ktorý vyviedol synov Izraela z\u00A0egyptskej krajiny,\" ale: \"Ako žije Pán, ktorý vyviedol a priviedol potomstvo Izraelovho domu zo\u00A0severnej krajiny a zo\u00A0všetkých krajín,\" kam som ich vyhnal, a budú bývať vo\u00A0svojej krajine.<br>" +
                            "Počuli sme Božie slovo."},
            {"19", "", "", "Sdc 13, 2-7. 24-25a ",
                    "Anjel oznamuje Samsonovo narodenie",
                    "Čítanie z Knihy sudcov <br>" +
                            "V tých dňoch bol istý muž zo\u00A0Saray, z\u00A0kmeňa Dan, volal sa Manue. Jeho manželka bola neplodná. Zjavil sa jej Pánov anjel a povedal: \"Hľa, si neplodná a bez\u00A0detí; no počneš a porodíš syna. Dávaj teda pozor: nepi víno ani iný opojný nápoj a nejedz nič nečisté. Lebo počneš a porodíš syna, ktorého hlavy sa britva nedotkne: chlapec bude už od\u00A0materského lona zasvätený Bohu a on začne vyslobodzovať Izraela z\u00A0ruky Filištíncov.\"<br>" +
                            "Ona prišla k\u00A0svojmu mužovi a povedala mu: \"Prišiel ku\u00A0mne Boží muž, vyzeral ako Pánov anjel a vzbudzoval hrôzu. Nepýtala som sa ho, odkiaľ je, a ani on mi neprezradil svoje meno. Povedal mi: ‚Hľa, počneš a porodíš syna. Dávaj pozor: nepi víno ani iný opojný nápoj a nejedz nič nečisté. Lebo chlapec bude už od\u00A0materského lona zasvätený Bohu až do\u00A0dňa svojej smrti.'\"<br>" +
                            "I porodila syna a dala mu meno Samson. Chlapec rástol a Pán ho požehnával. A začal v\u00A0ňom pôsobiť Pánov duch.<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "", "", "Iz 7, 10-14",
                    "Hľa, panna počne",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Pán prehovoril k\u00A0Achazovi: \"Žiadaj znamenie od\u00A0Pána, svojho Boha. Žiadaj ho, či v\u00A0hĺbkach podsvetia, alebo hore na\u00A0výsostiach.\"<br>" +
                            "Achaz však povedal: \"Nebudem žiadať, nebudem pokúšať Pána.\"<br>" +
                            "A Izaiáš riekol: \"Počúvajte teda, Dávidov dom. Nestačí, že obťažujete ľudí, ešte aj môjho Boha obťažujete? A preto vám Pán sám dá znamenie: Hľa, panna počne a porodí syna a dá mu meno Emanuel.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"21", "", "", " Pies 2, 8-14",
                    "Hľa, môj milý prichádza, po\u00A0horách skáče",
                    "Čítanie z Piesne piesní<br>" +
                            "Hlas môjho milého! Hľa, on prichádza, po\u00A0horách skáče, po\u00A0vŕškoch hupká. Milý môj je sťa srna, ako jeleníča. Hľa, veď už stojí pred\u00A0naším múrom; oblôčkom hľadí, cez\u00A0mriežku sa díva. Môj milý mi hovorí: \"Hor' sa, priateľka moja, holubica moja, krásava moja, a poď! Veď už je po\u00A0zime, dážď prestal, pominul. Na\u00A0zemi sa zjavili kvety, prišiel čas veselého spevu, hrkútanie hrdličky počuť v\u00A0našom kraji, fígovník vydáva svoje plody, vinič roznáša vôňu v\u00A0rozkvete. Nuž, hor' sa, priateľka moja, krásava moja, a poď! Holubica moja v\u00A0rozsadlinách skál, v\u00A0úkryte na\u00A0bralách! Daj zrieť mi svoju tvár, daj počuť mi svoj hlas; veď sladký je tvoj hlas a prekrásna je tvoja tvár.\"",
                    "Alebo:",
                    "Sof 3, 14-18a",
                    "Kráľ Izraela, Pán, je s\u00A0tebou",
                    "Čítanie z Knihy proroka Sofoniáša<br>" +
                            "Jasaj, dcéra sionská, plesaj, Izrael! Raduj sa a veseľ z\u00A0plného srdca, dcéra jeruzalemská! Pán zrušil tvoj rozsudok, odvrátil tvojich nepriateľov. Kráľ Izraela, Pán, je s\u00A0tebou, neboj sa nijakého zla! V onen deň povedia Jeruzalemu: „Neboj sa, Sion, nech ti ruky nechabnú! Pán, tvoj Boh, je s\u00A0tebou, on je mocný, on ťa zachráni. Teší sa a plesá nad\u00A0tebou, obnovuje k\u00A0tebe svoju lásku, plesá nad\u00A0tebou a jasá; ako \u00A0 deň zhromaždenia.“<br>" +
                            "Počuli sme Božie slovo."},
            {"22", "", "", "1 Sam 1, 24-28",
                    "Anna ďakuje za\u00A0Samuelovo narodenie",
                    "Čítanie z Prvej knihy Samuelovej<br>" +
                            "Keď Anna oddojčila Samuela, vzala ho so\u00A0sebou, aj trojročného býčka, jednu mericu múky a mech vína, a priviedla ho do\u00A0Pánovho domu v\u00A0Silo. Chlapec bol ešte maličký. Býčka obetovali a chlapca zaviedli k\u00A0Helimu.<br>" +
                            "Anna povedala: \"Prosím, pane môj, ako žiješ, pane, ja som tá žena, čo tu stála pred\u00A0tebou a modlila sa k\u00A0Pánovi. O\u00A0tohto chlapčeka som prosila a Pán mi dal, o\u00A0čo som ho prosila. Nuž aj ja ho odovzdávam Pánovi. Po\u00A0všetky dni, kým bude žiť, nech je zasvätený Pánovi.\"<br>" +
                            "I klaňali sa tam Pánovi."},
            {"23", "", "", "Mal 3, 1-4. 23-24",
                    "Hľa, ja vám pošlem proroka Eliáša, prv, ako príde deň Pána",
                    "Čítanie z Knihy proroka Malachiáša<br>" +
                            "Toto hovorí Pán, Boh: \"Hľa, ja posielam svojho anjela, aby mi pripravil cestu. Hneď potom príde do\u00A0svojho chrámu Pán, ktorého hľadáte, a anjel zmluvy, po\u00A0ktorom túžite. Hľa, príde, hovorí Pán zástupov. Kto však znesie deň jeho príchodu a kto obstojí, až sa zjaví? Veď on je ako oheň, ktorý roztápa, a ako lúh práčov.<br>" +
                            "Sadne si a bude vytápať a čistiť striebro, očistí synov Léviho a zošľachtí ich ako zlato a striebro, takže budú prinášať Pánovi obety v\u00A0spravodlivosti.<br>" +
                            "Vtedy sa Pánovi zapáči obeta Júdu a Jeruzalema ako v\u00A0dňoch predošlých, ako v\u00A0rokoch dávnych.<br>" +
                            "Hľa, ja vám pošlem proroka Eliáša, prv, ako príde deň Pána, veľký a hrozný. On obráti srdcia otcov k\u00A0synom a srdcia synov k\u00A0ich otcom, aby som nemusel prísť a postihnúť zem kliatbou.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"24", "", "", "2 Sam 7, 1-5. 8b-12. 14a. 16",
                    "Dávidovo kráľovstvo bude trvať pred\u00A0Pánom naveky",
                    "Čítanie z Druhej knihy Samuelovej<br>" +
                            "Keď kráľ Dávid býval už vo\u00A0svojom paláci a Pán mu poprial pokoj od\u00A0všetkých okolitých nepriateľov, povedal prorokovi Nátanovi: \"Pozri, ja bývam v\u00A0dome z\u00A0cédrov, a Božia archa stojí pod\u00A0stanmi.\"<br>" +
                            "Nátan odpovedal kráľovi: \"Choď a rob všetko, čo ti vnuká srdce, Pán je s\u00A0tebou.\"<br>" +
                            "V tú noc zaznelo Pánovo slovo Nátanovi: \"Choď a povedz môjmu služobníkovi Dávidovi: Toto hovorí Pán: Ty mi chceš postaviť dom, v\u00A0ktorom mám bývať? Ja som ťa vzal z\u00A0pastvín od\u00A0oviec, aby si bol vodcom môjho ľudu, Izraela; a bol som s\u00A0tebou pri\u00A0všetkom, čo si podnikal. Pred\u00A0tvojimi očami som vyhubil všetkých tvojich nepriateľov a zaistil som ti také meno, aké majú len najväčší na\u00A0zemi.<br>" +
                            "Svojmu ľudu, Izraelovi, určím miesto a zasadím ho tam. Tam bude bývať a nebude sa báť a ani zlosynovia ho už nebudú utláčať ako kedysi, v\u00A0dňoch, keď som ustanovoval sudcov nad\u00A0svojím ľudom, Izraelom. Oslobodím ťa od\u00A0všetkých tvojich nepriateľov a darujem ti pokoj. Pán ti oznamuje, že ti sám vybuduje dom, a až sa tvoje dni dovŕšia a ty sa uložíš na\u00A0odpočinok k\u00A0svojim otcom, ustanovím po\u00A0tebe potomka, ktorý bude pochádzať z\u00A0tvojich útrob, a upevním jeho kráľovstvo. Ja mu budem otcom a on mi bude synom.<br>" +
                            "Tvoj dom a tvoje kráľovstvo budú trvať predo\u00A0mnou naveky, tvoj trón bude upevnený navždy.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"24gkn", "", "", "Iz 62, 1-5",
                    "Pán si ťa obľúbil",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Kvôli Sionu neutíchnem, kvôli Jeruzalemu nebudem mať pokoja, kým nezažiari ako svetlo jeho spravodlivosť, kým sa jeho spása nerozhorí ako fakľa.<br>" +
                            "Potom národy uvidia tvoju spravodlivosť a všetci králi tvoju slávu a budú ťa volať novým menom, ktoré určia Pánove ústa. Budeš žiarivou korunou v\u00A0Pánovej ruke, kráľovským vencom v\u00A0ruke svojho Boha.<br>" +
                            "Nebudú ťa viac volať Opustená a tvoju krajinu nenazvú viac Osamelá. Ale budú ťa volať Moja potecha a tvoju krajinu Nevesta. Pretože Pán si ťa obľúbil a tvoja krajina dostane manžela.<br>" +
                            "Ako sa junák snúbi s\u00A0pannou, tak si ťa vezmú tvoji synovia, a ako ženích má radosť z\u00A0nevesty, tak z\u00A0teba bude mať radosť tvoj Boh.<br>" +
                            "Počuli sme Božie slovo."},
            {"25agkn", "", "", "Iz 9, 1-3. 5-6",
                    "Daný nám je syn",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Ľud, čo kráča vo\u00A0tmách, uzrie veľké svetlo; nad\u00A0tými, čo bývajú v\u00A0krajine temnôt, zažiari svetlo.<br>" +
                            "Rozmnožuješ plesanie, zväčšuješ radosť. Jasajú pred\u00A0tebou, ako sa jasá pri\u00A0žatve, ako plesajú tí, čo sa delia o\u00A0korisť. Pretože lámeš jeho ťažké jarmo, brvno na\u00A0jeho pleciach a palicu jeho utláčateľa ako v\u00A0deň porážky Madiánčanov.<br>" +
                            "Lebo chlapček sa nám narodil, daný nám je syn; na\u00A0jeho pleciach spočíva vláda a volajú ho: obdivuhodný Radca, mocný Boh, večný Otec, Knieža pokoja.<br>" +
                            "Jeho moc vzrastie a pokoj nebude mať konca na\u00A0Dávidovom tróne a v\u00A0jeho kráľovstve. On ho upevní a posilní právom a spravodlivosťou odteraz až naveky. To všetko vykoná horlivosť Pána zástupov.<br>" +
                            "Počuli sme Božie slovo."},
            {"25bgkn", "", "", "Iz 62, 11-12",
                    "Hľa, prichádza tvoj spasiteľ",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Hľa, Pán ohlasuje až po\u00A0končiny zeme: \"Povedzte dcére Siona: Hľa, prichádza tvoj spasiteľ. Hľa, jeho odmena s\u00A0ním a jeho trofeje pred\u00A0ním. Budú ich volať: Svätý ľud, Pánom vykúpení. A teba budú nazývať: Vytúžená, Mesto neopustené.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"25cgkn", "", "", "Iz 52, 7-10",
                    "Všetky končiny zeme uvidia spásu nášho Boha",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Aké krásne sú na\u00A0horách nohy posla, ktorý hlása pokoj, posla dobrej zvesti, ktorý ohlasuje spásu, ktorý hovorí Sionu: \"Tvoj Boh kraľuje.\"<br>" +
                            "Počúvaj svoje hliadky! Zvyšujú svoj hlas a jasajú všetci, lebo na\u00A0vlastné oči vidia návrat Pána na\u00A0Sion.<br>" +
                            "Radujte sa a vedno plesajte, rozvaliny Jeruzalema, lebo Pán potešil svoj ľud, vykúpil Jeruzalem.<br>" +
                            "Obnažil si Pán svoje sväté rameno pred\u00A0očami všetkých národov a všetky končiny zeme uvidia spásu nášho Boha.<br>" +
                            "Počuli sme Božie slovo."},
            {"26g", "", "", "Sk 6, 8-10; 7, 54-60",
                    "Vidím otvorené nebo",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Štefan plný milosti a sily, robil veľké divy a znamenia medzi ľudom.<br>" +
                            "Tu vstali niektorí z\u00A0takzvanej synagógy Libertíncov, Cyrénčanov a Alexandrijčanov a z\u00A0tých, čo boli z\u00A0Cilície a Ázie, a hádali sa so\u00A0Štefanom. Ale neboli schopní čeliť múdrosti a Duchu, ktorým hovoril.<br>" +
                            "Keď to počuli, pukali im srdcia od\u00A0zlosti a zubami škrípali proti nemu.<br>" +
                            "Ale on, plný Ducha Svätého, uprene sa zahľadel na\u00A0nebo, uvidel Božiu slávu a Ježiša stáť po\u00A0pravici Boha a povedal: \"Vidím otvorené nebo a Syna človeka stáť po\u00A0pravici Boha.\"<br>" +
                            "Strašne vykríkli, zapchávali si uši a všetci sa naňho vrhli. Vyhnali ho za\u00A0mesto a kameňovali. Svedkovia si odložili šaty k\u00A0nohám mladého muža, ktorý sa volal Šavol.<br>" +
                            "Štefana kameňovali a on sa modlil: \"Pane Ježišu, prijmi môjho ducha.\"<br>" +
                            "A len čo to povedal, zomrel.<br>" +
                            "Počuli sme Božie slovo."},
            {"27g", "", "", "1 Jn 1, 1-4",
                    "Čo sme videli a počuli, zvestujeme aj vám",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, čo bolo od\u00A0počiatku, čo sme počuli, čo sme na\u00A0vlastné oči videli, na\u00A0čo sme hľadeli a čoho sa naše ruky dotýkali, to zvestujeme: Slovo života. Lebo zjavil sa život a my sme videli, dosvedčujeme a zvestujeme vám večný život, ktorý bol u\u00A0Otca a zjavil sa nám.<br>" +
                            "Čo sme videli a počuli, zvestujeme aj vám, aby ste aj vy mali spoločenstvo s\u00A0nami.<br>" +
                            "Veď my máme spoločenstvo s\u00A0Otcom a s\u00A0jeho Synom Ježišom Kristom. A toto píšeme, aby naša radosť bola úplná.<br>" +
                            "Počuli sme Božie slovo."},
            {"28g", "", "", "1 Jn 1, 5 – 2, 2",
                    "Krv Ježiša nás očisťuje od\u00A0každého hriechu",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, toto je zvesť, ktorú sme počuli od\u00A0Ježiša Krista a vám zvestujeme: Boh je svetlo a niet v\u00A0ňom nijakej tmy.<br>" +
                            "Ak hovoríme, že máme s\u00A0ním spoločenstvo, ale chodíme vo\u00A0tme, luháme a nekonáme pravdu. Ale ak chodíme vo\u00A0svetle ako je on vo\u00A0svetle, máme spoločenstvo medzi sebou a krv Ježiša, jeho Syna, nás očisťuje od\u00A0každého hriechu.<br>" +
                            "Ak hovoríme, že nemáme hriech, klameme sami seba a nie je v\u00A0nás pravda. Ale ak vyznávame svoje hriechy, on je verný a spravodlivý: odpustí nám hriechy a očistí nás od\u00A0každej neprávosti. Ak hovoríme, že sme nezhrešili, jeho robíme luhárom a nie je v\u00A0nás jeho slovo.<br>" +
                            "Deti moje, toto vám píšem, aby ste nehrešili. Ale keby niekto zhrešil, máme u\u00A0Otca zástancu: Ježiša Krista, spravodlivého. On je zmiernou obetou za\u00A0naše hriechy; a nielen za\u00A0naše, ale aj za\u00A0hriechy celého sveta.<br>" +
                            "Počuli sme Božie slovo."},
            {"29", "", "", "1 Jn 2, 3-11",
                    "Kto miluje svojho brata, ostáva vo\u00A0svetle",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, podľa toho vieme, že sme poznali Ježiša, ak zachovávame jeho prikázania. Kto hovorí: \"Poznám ho,\" a nezachováva jeho prikázania, je luhár a niet v\u00A0ňom pravdy. Kto však zachováva jeho slovo, v\u00A0tom je Božia láska naozaj dokonalá. A podľa toho vieme, že sme v\u00A0ňom. Kto hovorí, že ostáva v\u00A0ňom, má aj sám žiť, ako žil on.<br>" +
                            "Milovaní, nepíšem vám nové prikázanie, ale staré prikázanie, ktoré ste mali od\u00A0začiatku: staré prikázanie je slovo, ktoré ste počuli. A predsa vám píšem nové prikázanie, ktoré je pravdivé v\u00A0ňom aj vo\u00A0vás, lebo tma odchádza a už svieti pravé svetlo.<br>" +
                            "Kto hovorí, že je vo\u00A0svetle, a nenávidí svojho brata, je ešte stále vo\u00A0tme. Kto miluje svojho brata, ostáva vo\u00A0svetle a nie je preň pohoršením. Ale kto nenávidí svojho brata, je vo\u00A0tme a chodí vo\u00A0tme a nevie, kam ide, lebo tma mu zaslepila oči.<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "", "", "1 Jn 2, 12-17",
                    "Kto plní Božiu vôľu, ostáva naveky",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Píšem vám, deti: Pre\u00A0jeho meno máte odpustené hriechy.<br>" +
                            "Otcovia, vám píšem: Poznali ste toho, ktorý je od\u00A0počiatku.<br>" +
                            "Mládenci, vám píšem: Premohli ste Zlého.<br>" +
                            "Napísal som vám, deti: Poznali ste Otca.<br>" +
                            "Napísal som vám, otcovia: Poznali ste toho, ktorý je od\u00A0počiatku.<br>" +
                            "Napísal som vám, mládenci: Ste silní, Božie slovo ostáva vo\u00A0vás a premohli ste Zlého.<br>" +
                            "Nemilujte svet, ani to, čo je vo\u00A0svete. Ak niekto miluje svet, nie je v\u00A0ňom Otcova láska. Veď nič z\u00A0toho, čo je vo\u00A0svete, ani žiadostivosť tela, ani žiadostivosť očí, ani honosenie sa bohatstvom, nie je z\u00A0Otca, ale zo\u00A0sveta. A svet sa pominie, aj jeho žiadostivosť. Kto však plní Božiu vôľu, ostáva naveky.<br>" +
                            "Počuli sme Božie slovo."},
            {"31", "", "", "1 Jn 2, 18-21",
                    "Máte pomazanie od\u00A0Svätého a viete to všetci",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Deti moje, je posledná hodina. A ako ste počuli, že príde antikrist, tak teraz vystúpilo mnoho antikristov. Z\u00A0toho poznávame, že je tu posledná hodina.<br>" +
                            "Spomedzi nás vyšli, ale neboli z\u00A0nás. Lebo keby boli z\u00A0nás, boli by zostali s\u00A0nami. No malo sa ukázať, že tí všetci nie sú z\u00A0nás.<br>" +
                            "Ale vy máte pomazanie od\u00A0Svätého a viete to všetci. Nenapísal som vám, akoby ste nepoznali pravdu, ale že ju poznáte a preto, že nijaká lož nie je z\u00A0pravdy.<br>" +
                            "Počuli sme Božie slovo."},
            {"31gk", "", "", "Nm 6, 22-27",
                    "Budú vzývať moje meno nad\u00A0izraelskými synmi a ja ich požehnám",
                    "Čítanie z Knihy Numeri<br>" +
                            "Pán hovoril Mojžišovi takto: \"Povedz Áronovi a jeho synom: Takto budete požehnávať izraelských synov; poviete im: Nech ťa žehná Pán a nech ťa ochraňuje! Nech Pán rozžiari svoju tvár nad\u00A0tebou a nech ti je milostivý! Nech Pán obráti svoju tvár k\u00A0tebe a nech ti daruje pokoj!<br>" +
                            "Takto budú vzývať moje meno nad\u00A0izraelskými synmi a ja ich požehnám.\"<br>" +
                            "Počuli sme Božie slovo."},

    };

    String[][] citanie2Pohyb = {
            {"0gkp", "", "", "Rim 4, 13. 16-18. 22",
                    "On proti nádeji v\u00A0nádeji uveril",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, Abrahám ani jeho potomstvo nedostali prisľúbenie, že budú dedičmi sveta skrze zákon, ale skrze spravodlivosť z\u00A0viery.<br>" +
                            "Preto z\u00A0viery, aby to bolo z\u00A0milosti, aby prisľúbenie trvale platilo pre\u00A0všetko potomstvo: nielen pre\u00A0to, čo je zo\u00A0zákona, ale aj pre\u00A0to, čo je z\u00A0Abrahámovej viery – on je otcom nás všetkých, ako je napísané: \"Ustanovil som ťa za\u00A0otca mnohých národov\" – pred\u00A0Bohom, ktorému uveril a ktorý oživuje mŕtvych a volá k\u00A0bytiu to, čoho niet.<br>" +
                            "On proti nádeji v\u00A0nádeji uveril, že sa stane otcom mnohých národov, podľa slova: \"Také bude tvoje potomstvo.\"<br>" +
                            "Preto sa mu to počítalo za\u00A0spravodlivosť.<br>" +
                            "Počuli sme Božie slovo."},
            {"1gkp", "", "", "Hebr 10, 4-10",
                    "Vo zvitku knihy je napísané o\u00A0mne –, aby som plnil tvoju vôľu, Bože",
                    "Čítanie z Listu Hebrejom<br>" +
                            "Bratia, je nemožné, aby krv býkov a capov odstránila hriechy. Preto keď prichádza na\u00A0svet, hovorí: \"Nechcel si obetu ani dar, ale dal si mi telo. Nepáčili sa ti zápalné obety ani obety za\u00A0hriech. Vtedy som povedal: Hľa prichádzam – vo\u00A0zvitku knihy je napísané o\u00A0mne –, aby som plnil tvoju vôľu, Bože.\"<br>" +
                            "Najprv hovorí: \"Obety a dary, ani obety zápalné ani obety za\u00A0hriech si nechcel, ani sa ti nepáčili\" – a ony sa prinášajú podľa zákona. Potom povedal: \"Hľa, prichádzam, aby som plnil tvoju vôľu.\" Ruší prvé, aby ustanovil druhé.<br>" +
                            "V tejto vôli sme posvätení obetou tela Krista Ježiša raz a navždy.<br>" +
                            "Počuli sme Božie slovo."},
            //
            {"7gkp", "A", "", "2 Kor 13, 11-13",
                    "Milosť Ježiša Krista a Božia láska i spoločenstvo Svätého Ducha",
                    "Čítanie z Druhého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, radujte sa, zdokonaľujte sa, povzbudzujte sa navzájom, rovnako zmýšľajte, žite v\u00A0pokoji a Boh lásky a pokoja bude s\u00A0vami. Pozdravte sa navzájom svätým bozkom.<br>" +
                            "Pozdravujú vás všetci svätí.<br>" +
                            "Milosť Pána Ježiša Krista a Božia láska i spoločenstvo Svätého Ducha nech je s\u00A0vami všetkými.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "Rim 8, 14-17",
                    "Dostali ste Ducha adoptívneho synovstva, v\u00A0ktorom voláme: Abba, Otče!",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, všetci, ktorých vedie Boží Duch, sú Božími synmi. Lebo ste nedostali ducha otroctva, aby ste sa museli zasa báť, ale dostali ste Ducha adoptívneho synovstva, v\u00A0ktorom voláme: \"Abba, Otče!\" Sám Duch spolu s\u00A0naším duchom dosvedčuje, že sme Božie deti. Ale ak sme deti, sme aj dedičia: Boží dedičia a Kristovi spoludedičia; pravda, ak s\u00A0ním trpíme, aby sme s\u00A0ním boli aj oslávení.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "Rim 5, 1-5",
                    "Chválime sa aj súženiami",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, ospravedlnení z\u00A0viery, žijeme v\u00A0pokoji s\u00A0Bohom skrze nášho Pána Ježiša Krista. Skrze neho máme vierou prístup k\u00A0tej milosti, v\u00A0ktorej zotrvávame, aj sa chválime nádejou na\u00A0Božiu slávu.<br>" +
                            "A nielen to: chválime sa aj súženiami, veď vieme, že súženie prináša trpezlivosť, trpezlivosť osvedčenú čnosť a osvedčená čnosť zasa nádej.<br>" +
                            "A nádej nezahanbuje, lebo Božia láska je rozliata v\u00A0našich srdciach skrze Ducha Svätého, ktorého sme dostali.<br>" +
                            "Počuli sme Božie slovo."},

            //PRIKÁZANÝ SVIATOK – Najsvätejšieho Kristovho Tela a Krvi
            {"4gkp", "A", "", "1 Kor 10, 16-17",
                    "Keďže je jeden chlieb, my mnohí sme jedno telo",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, nie je kalich dobrorečenia, ktorému dobrorečíme, účasťou na\u00A0Kristovej krvi? A chlieb, ktorý lámeme, nie je účasťou na\u00A0Kristovom tele?<br>" +
                            "Keďže je jeden chlieb, my mnohí sme jedno telo, lebo všetci máme podiel na\u00A0jednom chlebe.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "Hebr 9, 11-15",
                    "Krv Krista očistí nám svedomie",
                    "Čítanie z Listu Hebrejom<br>" +
                            "Bratia, keď prišiel Kristus, veľkňaz budúcich darov, cez\u00A0väčší a dokonalejší stánok, nie urobený rukou, to jest nie z\u00A0tohto stvoreného sveta, raz navždy vošiel do\u00A0Svätyne, a to nie s\u00A0krvou capov a teliat, ale so\u00A0svojou vlastnou krvou, a tak získal večné vykúpenie.<br>" +
                            "Lebo ak už krv capov a býkov a popol z\u00A0jalovice pokropením poškvrnených posväcuje, aby boli telesne čistí, o\u00A0čo viac krv Krista, ktorý skrze večného Ducha sám seba priniesol Bohu na\u00A0obetu bez\u00A0poškvrny, očistí nám svedomie od\u00A0mŕtvych skutkov, aby sme mohli slúžiť živému Bohu. A preto je prostredníkom novej zmluvy, aby smrťou podstúpenou na\u00A0vykúpenie z\u00A0previnení spáchaných za\u00A0prvej zmluvy dostali tí, čo sú povolaní, prisľúbenie večného dedičstva.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "1 Kor 11, 23-26",
                    "Vždy, keď budete jesť tento chlieb a piť tento kalich, zvestujete Pánovu smrť",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, ja som od\u00A0Pána prijal, čo som vám aj odovzdal, že Pán Ježiš v\u00A0tú noc, keď bol zradený, vzal chlieb, vzdával vďaky, lámal ho a povedal: \"Toto je moje telo, ktoré je pre\u00A0vás; toto robte na\u00A0moju pamiatku.\"<br>" +
                            "Podobne po\u00A0večeri vzal kalich a hovoril: \"Tento kalich je nová zmluva v\u00A0mojej krvi. Toto robte, kedykoľvek ho budete piť, na\u00A0moju pamiatku.\"<br>" +
                            "A tak vždy, keď budete jesť tento chlieb a piť tento kalich, zvestujete Pánovu smrť, kým nepríde.<br>" +
                            "Počuli sme Božie slovo."},
            {"5gkp", "A", "", "1 Jn 4, 7-16",
                    "Boh nás miluje",
                    "Čítanie z Prvého Listu svätého apoštola Jána<br>" +
                            "Milovaní, milujme sa navzájom, lebo láska je z\u00A0Boha a každý, kto miluje, narodil sa z\u00A0Boha a pozná Boha. Kto nemiluje, nepoznal Boha, lebo Boh je láska.<br>" +
                            "A Božia láska k\u00A0nám sa prejavila v\u00A0tom, že Boh poslal svojho jednorodeného Syna na\u00A0svet, aby sme skrze neho mali život. Láska je v\u00A0tom, že nie my sme milovali Boha, ale že on miloval nás a poslal svojho Syna ako zmiernu obetu za\u00A0naše hriechy.<br>" +
                            "Milovaní, keď nás Boh tak miluje, aj my sme povinní milovať jeden druhého. Boha nikto nikdy nevidel; ale keď sa milujeme navzájom, Boh ostáva v\u00A0nás a jeho láska v\u00A0nás je dokonalá.<br>" +
                            "A že ostávame v\u00A0ňom a on v\u00A0nás, poznávame podľa toho, že nám dal zo\u00A0svojho Ducha. A my sme videli a svedčíme, že Otec poslal Syna za\u00A0Spasiteľa sveta.<br>" +
                            "Kto vyzná: \"Ježiš je Boží Syn,\" ostáva v\u00A0ňom Boh a on v\u00A0Bohu. A my, čo sme uverili, spoznali sme lásku, akú má Boh k\u00A0nám.<br>" +
                            "Boh je láska; a kto ostáva v\u00A0láske, ostáva v\u00A0Bohu a Boh ostáva v\u00A0ňom.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "Ef 3, 8-12. 14-19",
                    "Poznať Kristovu lásku, presahujúcu každé poznanie",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Bratia, ja, najmenší zo\u00A0všetkých svätých, dostal som tú milosť zvestovať pohanom Kristovo nevyspytateľné bohatstvo a všetkým oznámiť, aký je plán tajomstva od\u00A0vekov skrytého v\u00A0Bohu, ktorý všetko stvoril, aby sa teraz skrze Cirkev kniežatstvám a mocnostiam v\u00A0nebi stala známou Božia mnohotvárna múdrosť, podľa odvekého rozhodnutia, ktoré uskutočnil v\u00A0Kristovi Ježišovi, našom Pánovi. V\u00A0ňom máme odvahu a prístup v\u00A0dôvere skrze vieru v\u00A0neho.<br>" +
                            "Preto zohýnam kolená pred\u00A0Otcom, od\u00A0ktorého má meno každé otcovstvo na\u00A0nebi i na\u00A0zemi: nech vám dá podľa bohatstva svojej slávy, aby skrze jeho Ducha mocne zosilnel váš vnútorný človek, aby Kristus skrze vieru prebýval vo\u00A0vašich srdciach, aby ste zakorenení a upevnení v\u00A0láske mohli so\u00A0všetkými svätými pochopiť, aká je to šírka, dĺžka, výška a hĺbka, a poznať aj Kristovu lásku, presahujúcu každé poznanie, aby vás naplnila Božia plnosť celá.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "Rim 5, 5b-11",
                    "Boh dokazuje svoju lásku k\u00A0nám",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, Božia láska je rozliata v\u00A0našich srdciach skrze Ducha Svätého, ktorého sme dostali.<br>" +
                            "Veď Kristus zomrel v\u00A0určenom čase za\u00A0bezbožných, keď sme boli ešte bezmocní. Sotvakto zomrie za\u00A0spravodlivého; hoci za\u00A0dobrého by sa azda niekto odhodlal umrieť. Ale Boh dokazuje svoju lásku k\u00A0nám tým, že Kristus zomrel za\u00A0nás, keď sme boli ešte hriešnici. Tým skôr sa teda skrze neho zachránime od\u00A0hnevu teraz, keď sme už ospravedlnení jeho krvou!<br>" +
                            "Lebo ak sme boli zmierení s\u00A0Bohom smrťou jeho Syna vtedy, keď sme boli nepriateľmi, tým skôr už ako zmierení budeme spasení jeho životom. A nielen to: ešte sa aj chválime Bohom skrze nášho Pána Ježiša Krista, skrze ktorého sme teraz obsiahli zmierenie.<br>" +
                            "Počuli sme Božie slovo."},
            {"2gkp", "", "", "Rim 8, 22-27",
                    "Duch sa prihovára za\u00A0nás nevysloviteľnými vzdychmi",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, vieme, že celé stvorenie spoločne vzdychá a zvíja sa v\u00A0pôrodných bolestiach až doteraz. A nielen ono, ale aj my sami, čo máme prvotiny Ducha, aj my vo\u00A0svojom vnútri vzdycháme a očakávame adoptívne synovstvo, vykúpenie svojho tela.<br>" +
                            "Lebo v\u00A0nádeji sme spasení. Ale nádej, ktorú možno vidieť, nie je nádej. Lebo kto dúfa v\u00A0niečo, čo vidí? Ale ak dúfame v\u00A0niečo, čo nevidíme, trpezlivo to očakávame.<br>" +
                            "Tak aj Duch prichádza na\u00A0pomoc našej slabosti, lebo nevieme ani to, za\u00A0čo sa máme modliť, ako treba; a sám Duch sa prihovára za\u00A0nás nevysloviteľnými vzdychmi. A ten, ktorý skúma srdcia, vie, po\u00A0čom Duch túži: že sa prihovára za\u00A0svätých, ako sa páči Bohu.<br>" +
                            "Počuli sme Božie slovo."},
            //Zoslanie Ducha Svätého
            {"3gkp", "A", "", "1 Kor 12, 3b-7. 12-13",
                    "Všetci sme boli v\u00A0jednom Duchu pokrstení v\u00A0jedno telo",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, nik nemôže povedať: \"Ježiš je Pán,\" iba ak v\u00A0Duchu Svätom.<br>" +
                            "Dary milosti sú rozličné, ale Duch je ten istý. Aj služby sú rozličné, ale Pán je ten istý. A rozličné sú aj účinky, ale Boh, ktorý pôsobí všetko vo\u00A0všetkých, je ten istý. Každý však dostáva prejavy Ducha na\u00A0všeobecný úžitok.<br>" +
                            "Lebo ako je jedno telo a má mnoho údov, ale všetky údy tela sú jedno telo, hoci je ich mnoho, tak aj Kristus. Veď my všetci, či Židia alebo Gréci, či otroci alebo slobodní, boli sme v\u00A0jednom Duchu pokrstení v\u00A0jedno telo. A všetci sme boli napojení jedným Duchom.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "1 Kor 12, 3b-7. 12-13",
                    "Všetci sme boli v\u00A0jednom Duchu pokrstení v\u00A0jedno telo",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, nik nemôže povedať: \"Ježiš je Pán,\" iba ak v\u00A0Duchu Svätom.<br>" +
                            "Dary milosti sú rozličné, ale Duch je ten istý. Aj služby sú rozličné, ale Pán je ten istý. A rozličné sú aj účinky, ale Boh, ktorý pôsobí všetko vo\u00A0všetkých, je ten istý. Každý však dostáva prejavy Ducha na\u00A0všeobecný úžitok.<br>" +
                            "Lebo ako je jedno telo a má mnoho údov, ale všetky údy tela sú jedno telo, hoci je ich mnoho, tak aj Kristus. Veď my všetci, či Židia alebo Gréci, či otroci alebo slobodní, boli sme v\u00A0jednom Duchu pokrstení v\u00A0jedno telo. A všetci sme boli napojení jedným Duchom.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Gal 5, 16-25",
                    "Ovocie Ducha",
                    "Čítanie z Listu svätého apoštola Pavla Galaťanom <br>" +
                            "Bratia, žite duchovne a nebudete spĺňať žiadosti tela. Lebo telo si žiada, čo je proti duchu, a duch, čo je proti telu. Navzájom si odporujú, aby ste nerobili to, čo chcete.<br>" +
                            "Ale ak vás vedie Duch, nie ste pod\u00A0zákonom. A skutky tela sú zjavné: je to smilstvo, nečistota, chlipnosť, modloslužba, čary, nepriateľstvá, sváry, žiarlivosť, hnevy, zvady, rozbroje, rozkoly, závisť, opilstvo, hýrenie a im podobné.<br>" +
                            "O tomto vám vopred hovorím, ako som už povedal, že tí, čo robia takéto veci, nedosiahnu Božie kráľovstvo.<br>" +
                            "Ale ovocie Ducha je láska, radosť, pokoj, zhovievavosť, láskavosť, dobrota, vernosť, miernosť, zdržanlivosť. Proti tomuto zákona niet.<br>" +
                            "Tí, čo patria Kristovi Ježišovi, ukrižovali telo s\u00A0vášňami a žiadosťami. Ak žijeme v\u00A0Duchu, podľa Ducha aj konajme.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "1 Kor 12, 3b-7. 12-13",
                    "Všetci sme boli v\u00A0jednom Duchu pokrstení v\u00A0jedno telo",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, nik nemôže povedať: \"Ježiš je Pán,\" iba ak v\u00A0Duchu Svätom.<br>" +
                            "Dary milosti sú rozličné, ale Duch je ten istý. Aj služby sú rozličné, ale Pán je ten istý. A rozličné sú aj účinky, ale Boh, ktorý pôsobí všetko vo\u00A0všetkých, je ten istý. Každý však dostáva prejavy Ducha na\u00A0všeobecný úžitok.<br>" +
                            "Lebo ako je jedno telo a má mnoho údov, ale všetky údy tela sú jedno telo, hoci je ich mnoho, tak aj Kristus. Veď my všetci, či Židia alebo Gréci, či otroci alebo slobodní, boli sme v\u00A0jednom Duchu pokrstení v\u00A0jedno telo. A všetci sme boli napojení jedným Duchom.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Rim 8, 8-17",
                    "Všetci, ktorých vedie Boží Duch, sú Božími synmi",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, tí, čo žijú telesne, nemôžu sa páčiť Bohu.<br>" +
                            "Lenže vy nežijete telesne, ale duchovne, pravda, ak vo\u00A0vás prebýva Boží Duch. Lebo kto nemá Kristovho Ducha, ten nie je jeho. Ale ak je vo\u00A0vás Kristus, telo je síce pre\u00A0hriech mŕtve, no duch je život pre\u00A0spravodlivosť. A keď vo\u00A0vás prebýva Duch toho, ktorý vzkriesil Ježiša z\u00A0mŕtvych, potom ten, čo vzkriesil z\u00A0mŕtvych Krista, oživí aj vaše smrteľné telá skrze svojho Ducha, ktorý prebýva vo\u00A0vás.<br>" +
                            "A tak, bratia, sme dlžníkmi, ale nie telu, aby sme museli žiť podľa tela. Lebo ak budete žiť podľa tela, zomriete. Ale ak Duchom umŕtvujete skutky tela, budete žiť. Veď všetci, ktorých vedie Boží Duch, sú Božími synmi. Lebo ste nedostali ducha otroctva, aby ste sa museli zasa báť, ale dostali ste Ducha adoptívneho synovstva, v\u00A0ktorom voláme: \"Abba, Otče!\" Sám Duch spolu s\u00A0naším duchom dosvedčuje, že sme Božie deti. Ale ak sme deti, sme aj dedičia: Boží dedičia a Kristovi spoludedičia; pravda, ak s\u00A0ním trpíme, aby sme s\u00A0ním boli aj oslávení.<br>" +
                            "Počuli sme Božie slovo."},
            //PRIKÁZANÝ SVIATOK – Nanebovstúpenie Pána
            {"6gkp", "A", "", "Ef 1, 17-23",
                    "V nebi ho posadil po\u00A0svojej pravici",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Bratia, nech vám Boh nášho Pána Ježiša Krista, Otec slávy, dá Ducha múdrosti a zjavenia, aby ste ho poznali.<br>" +
                            "Nech osvieti oči vášho srdca, aby ste vedeli, aká je nádej z\u00A0jeho povolania, aké bohatstvo slávy je z\u00A0jeho dedičstva vo\u00A0svätých, a aká nesmierne veľká je jeho moc pre\u00A0nás veriacich podľa pôsobenia jeho mocnej sily, ktorú dokázal na\u00A0Kristovi, keď ho vzkriesil z\u00A0mŕtvych a v\u00A0nebi posadil po\u00A0svojej pravici nad\u00A0každé kniežatstvo, mocnosť, silu a panstvo a nad\u00A0každé iné meno, ktoré možno vysloviť nielen v\u00A0tomto veku, ale aj v\u00A0budúcom.<br>" +
                            "Všetko mu položil pod\u00A0nohy a jeho ustanovil nad\u00A0všetkým za\u00A0hlavu Cirkvi, ktorá je jeho telom, plnosťou toho, ktorý napĺňa všetko vo\u00A0všetkom.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "Ef 1, 17-23",
                    "V nebi ho posadil po\u00A0svojej pravici",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Bratia, nech vám Boh nášho Pána Ježiša Krista, Otec slávy, dá Ducha múdrosti a zjavenia, aby ste ho poznali.<br>" +
                            "Nech osvieti oči vášho srdca, aby ste vedeli, aká je nádej z\u00A0jeho povolania, aké bohatstvo slávy je z\u00A0jeho dedičstva vo\u00A0svätých, a aká nesmierne veľká je jeho moc pre\u00A0nás veriacich podľa pôsobenia jeho mocnej sily, ktorú dokázal na\u00A0Kristovi, keď ho vzkriesil z\u00A0mŕtvych a v\u00A0nebi posadil po\u00A0svojej pravici nad\u00A0každé kniežatstvo, mocnosť, silu a panstvo a nad\u00A0každé iné meno, ktoré možno vysloviť nielen v\u00A0tomto veku, ale aj v\u00A0budúcom.<br>" +
                            "Všetko mu položil pod\u00A0nohy a jeho ustanovil nad\u00A0všetkým za\u00A0hlavu Cirkvi, ktorá je jeho telom, plnosťou toho, ktorý napĺňa všetko vo\u00A0všetkom.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Ef 4, 1-13",
                    "K miere plného Kristovho veku",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Bratia, prosím vás ja, väzeň v\u00A0Pánovi, aby ste žili dôstojne podľa povolania, ktorého sa vám dostalo, so\u00A0všetkou pokorou, miernosťou a zhovievavosťou. Znášajte sa navzájom v\u00A0láske a usilujte sa zachovať jednotu ducha vo\u00A0zväzku pokoja. Jedno je telo a jeden Duch, ako ste aj povolaní v\u00A0jednej nádeji svojho povolania. Jeden je Pán, jedna viera, jeden krst. Jeden je Boh a Otec všetkých, ktorý je nad\u00A0všetkými, preniká všetkých a je vo\u00A0všetkých.<br>" +
                            "Ale každý z\u00A0nás dostal milosť podľa miery, akou nás obdaroval Kristus. Preto hovorí: \"Do výšav vystúpil, so\u00A0sebou vzal zajatcov, ľuďom dal dary.\"<br>" +
                            "A čo iné znamená to \"vystúpil\", ako že aj zostúpil do\u00A0nižších častí zeme? Ten, čo zostúpil, je ten istý, čo aj vystúpil ponad všetky nebesia, aby naplnil všetko.<br>" +
                            "On ustanovil niektorých za\u00A0apoštolov, niektorých za\u00A0prorokov, iných za\u00A0evanjelistov a iných za\u00A0pastierov a učiteľov, aby pripravovali svätých na\u00A0dielo služby, na\u00A0budovanie Kristovho tela, kým nedospejeme všetci k\u00A0jednote viery a poznania Božieho Syna, k\u00A0zrelosti muža, k\u00A0miere plného Kristovho veku.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo kratšie:",
                    "Ef 4, 1-7. 11-13",
                    "Na dielo služby, na\u00A0budovanie Kristovho tela",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Bratia, prosím vás ja, väzeň v\u00A0Pánovi, aby ste žili dôstojne podľa povolania, ktorého sa vám dostalo, so\u00A0všetkou pokorou, miernosťou a zhovievavosťou. Znášajte sa navzájom v\u00A0láske a usilujte sa zachovať jednotu ducha vo\u00A0zväzku pokoja.<br>" +
                            "Jedno je telo a jeden Duch, ako ste aj povolaní v\u00A0jednej nádeji svojho povolania. Jeden je Pán, jedna viera, jeden krst. Jeden je Boh a Otec všetkých, ktorý je nad\u00A0všetkými, preniká všetkých a je vo\u00A0všetkých.<br>" +
                            "Ale každý z\u00A0nás dostal milosť podľa miery, akou nás obdaroval Kristus. On ustanovil niektorých za\u00A0apoštolov, niektorých za\u00A0prorokov, iných za\u00A0evanjelistov a iných za\u00A0pastierov a učiteľov, aby pripravovali svätých na\u00A0dielo služby, na\u00A0budovanie Kristovho tela, kým nedospejeme všetci k\u00A0jednote viery a poznania Božieho Syna, k\u00A0zrelosti muža, k\u00A0miere plného Kristovho veku.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "Ef 1, 17-23",
                    "V nebi ho posadil po\u00A0svojej pravici",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Bratia, nech vám Boh nášho Pána Ježiša Krista, Otec slávy, dá Ducha múdrosti a zjavenia, aby ste ho poznali.<br>" +
                            "Nech osvieti oči vášho srdca, aby ste vedeli, aká je nádej z\u00A0jeho povolania, aké bohatstvo slávy je z\u00A0jeho dedičstva vo\u00A0svätých, a aká nesmierne veľká je jeho moc pre\u00A0nás veriacich podľa pôsobenia jeho mocnej sily, ktorú dokázal na\u00A0Kristovi, keď ho vzkriesil z\u00A0mŕtvych a v\u00A0nebi posadil po\u00A0svojej pravici nad\u00A0každé kniežatstvo, mocnosť, silu a panstvo a nad\u00A0každé iné meno, ktoré možno vysloviť nielen v\u00A0tomto veku, ale aj v\u00A0budúcom.<br>" +
                            "Všetko mu položil pod\u00A0nohy a jeho ustanovil nad\u00A0všetkým za\u00A0hlavu Cirkvi, ktorá je jeho telom, plnosťou toho, ktorý napĺňa všetko vo\u00A0všetkom.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Hebr 9, 24-28; 10, 19-23",
                    "Kristus vošiel do\u00A0samého neba",
                    "Čítanie z Listu Hebrejom<br>" +
                            "Kristus nevošiel do\u00A0Svätyne zhotovenej rukou, ktorá je len predobrazom pravej, ale do\u00A0samého neba, aby sa teraz za\u00A0nás ukázal pred\u00A0Božou tvárou. Ani nie preto, aby seba samého viackrát obetoval ako veľkňaz, ktorý rok čo rok vchádza do\u00A0Svätyne s\u00A0cudzou krvou. Inak by bol musel trpieť už mnohokrát od\u00A0stvorenia sveta. On sa však teraz na\u00A0konci vekov zjavil raz navždy, aby obetovaním seba zničil hriech.<br>" +
                            "A ako je ustanovené, že ľudia raz zomrú a potom bude súd, tak aj Kristus: raz sa obetoval, aby sňal hriechy mnohých, a druhý raz sa zjaví bez\u00A0hriechu na\u00A0spásu tým, čo ho očakávajú.<br>" +
                            "A keď máme, bratia, smelú dôveru, že vojdeme do\u00A0Svätyne skrze Ježišovu krv, tou novou a živou cestou, ktorú nám otvoril cez\u00A0oponu, to jest cez\u00A0svoje telo, a keď máme veľkňaza nad\u00A0Božím domom, pristupujme s\u00A0úprimným srdcom v\u00A0plnosti viery, so\u00A0srdcom očisteným od\u00A0zlého svedomia a s\u00A0telom obmytým čistou vodou. Neochvejne sa držme nádeje, ktorú vyznávame, lebo verný je ten, ktorý dal prisľúbenie.<br>" +
                            "Počuli sme Božie slovo."},
            {"8gkp", "A", "", "1 Kor 15, 20-26. 28",
                    "Odovzdá kráľovstvo Bohu a Otcovi, aby bol Boh všetko vo\u00A0všetkom",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, Kristus vstal z\u00A0mŕtvych, prvotina zosnulých. Lebo ako je skrze človeka smrť, tak je skrze človeka aj zmŕtvychvstanie: Veď ako všetci umierajú v\u00A0Adamovi, tak zasa všetci ožijú v\u00A0Kristovi. Ale každý v\u00A0poradí, aké mu patrí: prvotinou je Kristus; potom, pri\u00A0jeho príchode, tí, čo patria Kristovi. A potom bude koniec, keď odovzdá Bohu a Otcovi kráľovstvo, keď zruší každé kniežatstvo, každú mocnosť a silu.<br>" +
                            "Lebo on musí kraľovať, kým mu nepoloží všetkých nepriateľov pod\u00A0nohy. Ako posledný nepriateľ bude zničená smrť. A keď mu bude všetko podrobené, vtedy sa aj sám Syn podrobí tomu, ktorý mu všetko podrobil, aby bol Boh všetko vo\u00A0všetkom.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "Zjv 1, 5-8",
                    "Vládca nad\u00A0kráľmi zeme... urobil nás kráľovstvom, kňazmi Bohu",
                    "Čítanie z Knihy zjavenia svätého apoštola Jána<br>" +
                            "Ježiš Kristus je verný svedok, prvorodený z\u00A0mŕtvych a vládca nad\u00A0kráľmi zeme.<br>" +
                            "Jemu, ktorý nás miluje a svojou krvou nás oslobodil od\u00A0hriechov a urobil nás kráľovstvom, kňazmi Bohu a svojmu Otcovi, jemu sláva a vláda na\u00A0veky vekov. Amen.<br>" +
                            "Hľa, prichádza s\u00A0oblakmi a uvidí ho každé oko, aj tí, čo ho prebodli, a budú nad\u00A0ním nariekať všetky kmene zeme. Tak je. Amen.<br>" +
                            "Ja som Alfa a Omega, hovorí Pán, Boh, ktorý je, ktorý bol a ktorý príde, Všemohúci.<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "Kol 1, 12-20",
                    "Preniesol nás do\u00A0kráľovstva svojho milovaného Syna",
                    "Čítanie z Listu svätého apoštola Pavla Kolosanom<br>" +
                            "Bratia, vzdávame vďaky Otcovi, ktorý vás urobil súcimi mať účasť na\u00A0podiele svätých vo\u00A0svetle. On nás vytrhol z\u00A0moci tmy a preniesol do\u00A0kráľovstva svojho milovaného Syna, v\u00A0ktorom máme vykúpenie, odpustenie hriechov. On je obraz neviditeľného Boha, prvorodený zo\u00A0všetkého stvorenia, lebo v\u00A0ňom bolo stvorené všetko na\u00A0nebi a na\u00A0zemi, viditeľné i neviditeľné, tróny aj panstvá, kniežatstvá aj mocnosti. Všetko je stvorené skrze neho a pre\u00A0neho. On je pred\u00A0všetkým a všetko v\u00A0ňom spočíva. On je hlavou tela, Cirkvi. On je počiatok, prvorodený z\u00A0mŕtvych, aby on mal vo\u00A0všetkom prvenstvo. Lebo Boh chcel, aby v\u00A0ňom prebývala všetka plnosť a aby skrze neho zmieril všetko so\u00A0sebou, keď pre\u00A0jeho krv na\u00A0kríži priniesol pokoj všetkému, čo je na\u00A0zemi aj čo je na\u00A0nebi.<br>" +
                            "Počuli sme Božie slovo."},
            //8. decembra - Nepoškvrnené počatie Panny Márie
            {"9gkp", "", "", "Ef 1, 3-6. 11-12",
                    "Boh si nás ešte pred\u00A0stvorením sveta vyvolil v\u00A0Kristovi",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Nech je zvelebený Boh a Otec nášho Pána Ježiša Krista, ktorý nás v\u00A0Kristovi požehnal všetkým nebeským duchovným požehnaním. Veď v\u00A0ňom si nás ešte pred\u00A0stvorením sveta vyvolil, aby sme boli pred\u00A0jeho tvárou svätí a nepoškvrnení v\u00A0láske; on nás podľa dobrotivého rozhodnutia svojej vôle predurčil, aby sme sa skrze Ježiša Krista stali jeho adoptovanými synmi na\u00A0chválu a slávu jeho milosti, ktorou nás obdaroval v\u00A0milovanom Synovi.<br>" +
                            "Veď v\u00A0ňom sme sa stali dedičmi predurčenými podľa rozhodnutia toho, ktorý všetko koná podľa rady svojej vôle, aby sme boli na\u00A0chválu jeho slávy my, čo sme už prv dúfali v\u00A0Krista.<br>" +
                            "Počuli sme Božie slovo."},
            //Svätej rodiny
            {"10gkp", "A", "", "Kol 3, 12-21",
                    "Rodinný život v\u00A0Pánovi",
                    "Čítanie z Listu svätého apoštola Pavla Kolosanom<br>" +
                            "Bratia, ako Boží vyvolenci, svätí a milovaní, oblečte si hlboké milosrdenstvo, láskavosť, pokoru, miernosť a trpezlivosť. Znášajte sa navzájom a odpúšťajte si, ak by mal niekto niečo proti druhému. Ako Pán odpustil vám, tak aj vy!<br>" +
                            "Ale nad\u00A0všetko toto majte lásku, ktorá je zväzkom dokonalosti! A vo\u00A0vašich srdciach nech vládne Kristov pokoj. Preň ste aj povolaní v\u00A0jednom tele. A buďte vďační!<br>" +
                            "Kristovo slovo nech vo\u00A0vás bohato prebýva. Vo\u00A0všetkej múdrosti sa navzájom poúčajte a napomínajte a pod\u00A0vplyvom milosti spievajte Bohu vo\u00A0svojich srdciach žalmy, hymny a duchovné piesne.<br>" +
                            "A všetko, čokoľvek hovoríte alebo konáte, všetko robte v\u00A0mene Pána Ježiša a skrze neho vzdávajte vďaky Bohu Otcovi.<br>" +
                            "Ženy, podriaďujte sa mužom, ako sa sluší v\u00A0Pánovi!<br>" +
                            "Muži, milujte manželky a nebuďte voči nim nevrlí!<br>" +
                            "Deti, poslúchajte rodičov vo\u00A0všetkom, lebo je to milé Pánovi!<br>" +
                            "Otcovia, nedráždite svoje deti, aby nezmalomyseľneli!<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "Hebr 11, 8. 11-12. 17-19",
                    "Viera Abraháma, Sáry a Izáka",
                    "Čítanie z Listu Hebrejom<br>" +
                            "Bratia, s\u00A0vierou poslúchol Abrahám, keď bol povolaný, aby šiel na\u00A0miesto, ktoré mal dostať ako dedičstvo; išiel a ani nevedel, kam ide.<br>" +
                            "Vierou aj neplodná Sára dostala napriek pokročilému veku silu počať potomka, lebo verila, že je verný ten, ktorý dal prisľúbenie. Preto aj z\u00A0jedného, a to odumretého, vzišlo ich také množstvo, ako je hviezd na\u00A0nebi a piesku na\u00A0brehu mora, a ten sa nedá spočítať.<br>" +
                            "S vierou obetoval Abrahám Izáka, keď bol skúšaný, a jednorodeného obetoval ten, ktorý dostal prisľúbenia a ktorému bolo povedané: \"Po Izákovi sa bude volať tvoje potomstvo.\" Usudzoval totiž, že Boh má moc aj z\u00A0mŕtvych vzkriesiť. Preto ho dostal naspäť aj ako predobraz.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Kol 3, 12-21",
                    "Rodinný život v\u00A0Pánovi",
                    "Čítanie z Listu svätého apoštola Pavla Kolosanom<br>" +
                            "Bratia, ako Boží vyvolenci, svätí a milovaní, oblečte si hlboké milosrdenstvo, láskavosť, pokoru, miernosť a trpezlivosť. Znášajte sa navzájom a odpúšťajte si, ak by mal niekto niečo proti druhému. Ako Pán odpustil vám, tak aj vy!<br>" +
                            "Ale nad\u00A0všetko toto majte lásku, ktorá je zväzkom dokonalosti! A vo\u00A0vašich srdciach nech vládne Kristov pokoj. Preň ste aj povolaní v\u00A0jednom tele. A buďte vďační!<br>" +
                            "Kristovo slovo nech vo\u00A0vás bohato prebýva. Vo\u00A0všetkej múdrosti sa navzájom poúčajte a napomínajte a pod\u00A0vplyvom milosti spievajte Bohu vo\u00A0svojich srdciach žalmy, hymny a duchovné piesne.<br>" +
                            "A všetko, čokoľvek hovoríte alebo konáte, všetko robte v\u00A0mene Pána Ježiša a skrze neho vzdávajte vďaky Bohu Otcovi.<br>" +
                            "Ženy, podriaďujte sa mužom, ako sa sluší v\u00A0Pánovi!<br>" +
                            "Muži, milujte manželky a nebuďte voči nim nevrlí!<br>" +
                            "Deti, poslúchajte rodičov vo\u00A0všetkom, lebo je to milé Pánovi!<br>" +
                            "Otcovia, nedráždite svoje deti, aby nezmalomyseľneli!<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "1 Jn 3, 1-2. 21-24",
                    "Voláme sa Božími deťmi a nimi aj sme",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, pozrite, akú veľkú lásku nám daroval Otec: voláme sa Božími deťmi a nimi aj sme.<br>" +
                            "Preto nás svet nepozná, že nepoznal jeho.<br>" +
                            "Milovaní, teraz sme Božími deťmi, a ešte sa neukázalo, čím budeme. Vieme však, že keď sa on zjaví, budeme mu podobní, lebo ho budeme vidieť takého, aký je.<br>" +
                            "Milovaní, ak nám srdce nič nevyčíta, máme dôveru k\u00A0Bohu a dostaneme od\u00A0neho všetko, o\u00A0čo len budeme prosiť, lebo zachovávame jeho prikázania a robíme, čo sa jemu páči.<br>" +
                            "A toto je jeho prikázanie: aby sme verili v\u00A0meno jeho Syna Ježiša Krista a milovali jeden druhého, ako nám prikázal. Kto zachováva jeho prikázania, ostáva v\u00A0Bohu a Boh v\u00A0ňom. A že v\u00A0nás ostáva, poznáme z\u00A0Ducha, ktorého nám dal.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Kol 3, 12-21",
                    "Rodinný život v\u00A0Pánovi",
                    "Čítanie z Listu svätého apoštola Pavla Kolosanom<br>" +
                            "Bratia, ako Boží vyvolenci, svätí a milovaní, oblečte si hlboké milosrdenstvo, láskavosť, pokoru, miernosť a trpezlivosť. Znášajte sa navzájom a odpúšťajte si, ak by mal niekto niečo proti druhému. Ako Pán odpustil vám, tak aj vy!<br>" +
                            "Ale nad\u00A0všetko toto majte lásku, ktorá je zväzkom dokonalosti! A vo\u00A0vašich srdciach nech vládne Kristov pokoj. Preň ste aj povolaní v\u00A0jednom tele. A buďte vďační!<br>" +
                            "Kristovo slovo nech vo\u00A0vás bohato prebýva. Vo\u00A0všetkej múdrosti sa navzájom poúčajte a napomínajte a pod\u00A0vplyvom milosti spievajte Bohu vo\u00A0svojich srdciach žalmy, hymny a duchovné piesne.<br>" +
                            "A všetko, čokoľvek hovoríte alebo konáte, všetko robte v\u00A0mene Pána Ježiša a skrze neho vzdávajte vďaky Bohu Otcovi.<br>" +
                            "Ženy, podriaďujte sa mužom, ako sa sluší v\u00A0Pánovi!<br>" +
                            "Muži, milujte manželky a nebuďte voči nim nevrlí!<br>" +
                            "Deti, poslúchajte rodičov vo\u00A0všetkom, lebo je to milé Pánovi!<br>" +
                            "Otcovia, nedráždite svoje deti, aby nezmalomyseľneli!<br>" +
                            "Počuli sme Božie slovo."},
            //Krst Krista Pána
            {"11gkp", "A", "", "Sk 10, 34-38",
                    "Boh pomazal Ježiša Duchom Svätým",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Peter otvoril ústa a povedal: \"Naozaj poznávam, že Boh nenadŕža nikomu, ale v\u00A0každom národe mu je milý ten, kto sa ho bojí a koná spravodlivo.<br>" +
                            "Synom Izraela zoslal slovo a zvestoval pokoj skrze Ježiša Krista; on je Pánom všetkých. Vy viete, čo sa počnúc od\u00A0Galiley po\u00A0krste, ktorý hlásal Ján, dialo po\u00A0celej Judei; ako Boh pomazal Ježiša z\u00A0Nazareta Duchom Svätým a mocou a on chodil, dobre robil a uzdravoval všetkých posadnutých diablom, lebo bol s\u00A0ním Boh.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"", "B", "", "1 Jn 5, 1-9",
                    "Duch, voda a krv",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, každý, kto verí, že Ježiš je Kristus, narodil sa z\u00A0Boha. A každý, kto miluje Boha ako Otca, miluje aj toho, kto sa z\u00A0neho narodil. Podľa toho poznáme, že milujeme Božie deti, keď milujeme Boha a plníme jeho prikázania. Lebo láska k\u00A0Bohu spočíva v\u00A0tom, že zachovávame jeho prikázania. A jeho prikázania nie sú ťažké. Veď všetko, čo sa narodilo z\u00A0Boha, premáha svet. A tým víťazstvom, ktoré premohlo svet, je naša viera.<br>" +
                            "Veď kto iný premáha svet, ak nie ten, kto verí, že Ježiš je Boží Syn? On je ten, ktorý prišiel skrze vodu a krv, Ježiš Kristus. Nielen skrze vodu, ale skrze vodu a krv. A Duch to dosvedčuje, pretože Duch je pravda. Lebo traja sú, čo svedčia: Duch, voda a krv; a títo traja sú zajedno. Ak prijímame svedectvo ľudí, Božie svedectvo je väčšie; pretože Božie svedectvo je to, že svedčil o\u00A0svojom Synovi.",
                    "Alebo:",
                    "Sk 10, 34-38",
                    "Boh pomazal Ježiša Duchom Svätým",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Peter otvoril ústa a povedal: \"Naozaj poznávam, že Boh nenadŕža nikomu, ale v\u00A0každom národe mu je milý ten, kto sa ho bojí a koná spravodlivo.<br>" +
                            "Synom Izraela zoslal slovo a zvestoval pokoj skrze Ježiša Krista; on je Pánom všetkých. Vy viete, čo sa počnúc od\u00A0Galiley po\u00A0krste, ktorý hlásal Ján, dialo po\u00A0celej Judei; ako Boh pomazal Ježiša z\u00A0Nazareta Duchom Svätým a mocou a on chodil, dobre robil a uzdravoval všetkých posadnutých diablom, lebo bol s\u00A0ním Boh.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"", "C", "", "Tít 2, 11-14; 3, 4-7",
                    "Spasil nás kúpeľom znovuzrodenia a obnovy v\u00A0Duchu Svätom",
                    "Čítanie z Listu svätého apoštola Pavla Títovi<br>" +
                            "Milovaný, zjavila sa Božia milosť na\u00A0spásu všetkým ľuďom a vychováva nás, aby sme sa zriekli bezbožnosti a svetských žiadostí a žili v\u00A0tomto veku triezvo, spravodlivo a nábožne, a tak očakávali blahoslavenú nádej a príchod slávy veľkého Boha a nášho Spasiteľa Ježiša Krista, ktorý vydal za\u00A0nás seba samého, aby nás vykúpil z\u00A0každej neprávosti a očistil si vlastný ľud, horlivý v\u00A0dobrých skutkoch.<br>" +
                            "Ale keď sa zjavila dobrota Boha, nášho Spasiteľa, a jeho láska k\u00A0ľuďom, spasil nás nie pre\u00A0spravodlivé skutky, ktoré sme my konali, ale zo\u00A0svojho milosrdenstva, kúpeľom znovuzrodenia a obnovy v\u00A0Duchu Svätom, ktorého na\u00A0nás hojne vylial skrze Ježiša Krista, nášho Spasiteľa, aby sme, ospravedlnení jeho milosťou, boli podľa nádeje dedičmi večného života.",
                    "Alebo:",
                    "Sk 10, 34-38",
                    "Boh pomazal Ježiša Duchom Svätým",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Peter otvoril ústa a povedal: \"Naozaj poznávam, že Boh nenadŕža nikomu, ale v\u00A0každom národe mu je milý ten, kto sa ho bojí a koná spravodlivo.<br>" +
                            "Synom Izraela zoslal slovo a zvestoval pokoj skrze Ježiša Krista; on je Pánom všetkých. Vy viete, čo sa počnúc od\u00A0Galiley po\u00A0krste, ktorý hlásal Ján, dialo po\u00A0celej Judei; ako Boh pomazal Ježiša z\u00A0Nazareta Duchom Svätým a mocou a on chodil, dobre robil a uzdravoval všetkých posadnutých diablom, lebo bol s\u00A0ním Boh.\"<br>" +
                            "Počuli sme Božie slovo."},

    };

    String[][] citanie2_1 = {
// 2.nedeľa po\u00A0NP
            {"", "", "", "Ef 1, 3-6. 15-18",
                    "Predurčil nás, aby sme sa skrze Ježiša stali jeho adoptovanými synmi",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Nech je zvelebený Boh a Otec nášho Pána Ježiša Krista, ktorý nás v\u00A0Kristovi požehnal všetkým nebeským duchovným požehnaním. Veď v\u00A0ňom si nás ešte pred\u00A0stvorením sveta vyvolil, aby sme boli pred\u00A0jeho tvárou svätí a nepoškvrnení v\u00A0láske; on nás podľa dobrotivého rozhodnutia svojej vôle predurčil, aby sme sa skrze Ježiša Krista stali jeho adoptovanými synmi na\u00A0chválu a slávu jeho milosti, ktorou nás obdaroval v\u00A0milovanom Synovi.<br>" +
                            "Preto keď som aj ja počul o\u00A0vašej viere v\u00A0Pána Ježiša a o\u00A0láske k\u00A0všetkým svätým, neprestávam za\u00A0vás vzdávať vďaky, keď si na\u00A0vás spomínam vo\u00A0svojich modlitbách. Nech vám Boh nášho Pána Ježiša Krista, Otec slávy, dá Ducha múdrosti a zjavenia, aby ste ho poznali. Nech osvieti oči vášho srdca, aby ste vedeli, aká je nádej z\u00A0jeho povolania, aké bohatstvo slávy je z\u00A0jeho dedičstva vo\u00A0svätých.<br>" +
                            "Počuli sme Božie slovo."},

            {"01gk", "", "", "Gal 4, 4-7",
                    "Boh poslal svojho Syna, narodeného zo\u00A0ženy",
                    "Čítanie z Listu svätého apoštola Pavla Galaťanom<br>" +
                            "Bratia, keď prišla plnosť času, Boh poslal svojho Syna, narodeného zo\u00A0ženy, narodeného pod\u00A0zákonom, aby vykúpil tých, čo boli pod\u00A0zákonom, a aby sme dostali adoptívne synovstvo.<br>" +
                            "Pretože ste synmi, poslal Boh do\u00A0našich sŕdc Ducha svojho Syna a on volá: \"Abba, Otče!\"<br>" +
                            "A tak už nie si otrok, ale syn; a keď syn, tak skrze Boha aj dedič.<br>" +
                            "Počuli sme Božie slovo."},
            {"06gk", "", "", "Ef 3, 2-3a. 5-6",
                    "Teraz sa zjavilo, že pohania sú spoludedičmi prisľúbenia",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Bratia, počuli ste o\u00A0dare Božej milosti, ktorý som dostal pre\u00A0vás: lebo zo\u00A0zjavenia som sa dozvedel tajomstvo. Ono v\u00A0iných pokoleniach nebolo ľuďom známe tak, ako sa teraz v\u00A0Duchu zjavilo jeho svätým apoštolom a prorokom: že pohania sú spoludedičmi, spoluúdmi a spoluúčastníkmi prisľúbenia v\u00A0Kristovi Ježišovi skrze evanjelium.<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] citanie2_2 = {
            //iba ak je v nedelu
            {"02g", "", "", "Hebr 2, 14-18",
                    "Vo všetkom sa musel pripodobniť bratom, aby sa stal milosrdným",
                    "Čítanie z Listu Hebrejom<br>" +
                            "Pretože deti majú účasť na\u00A0krvi a tele, aj Ježiš mal podobne spoluúčasť na\u00A0nich, aby smrťou zničil toho, ktorý vládol smrťou, čiže diabla, a vyslobodil tých, ktorých celý život zotročoval strach pred\u00A0smrťou.<br>" +
                            "Veď sa neujíma anjelov, ale ujíma sa Abrahámovho potomstva. Preto sa vo\u00A0všetkom musel pripodobniť bratom, aby sa stal milosrdným a verným veľkňazom pred\u00A0Bohom a odčinil hriechy ľudu. A pretože sám prešiel skúškou utrpenia, môže pomáhať tým, ktorí sú skúšaní.<br>" +
                            "Počuli sme Božie slovo."}
    };

    String[][] citanie2_3 = {};

    String[][] citanie2_4 = {};

    String[][] citanie2_5 = {};

    String[][] citanie2_6 = {
            {"23gk", "", "", "1 Pt 1, 8-12",
                    "Túto spásu hľadali a skúmali proroci",
                    "Čítanie z Prvého listu svätého apoštola Petrov<br>" +
                            "Milovaní, Ježiša Krista milujete, hoci ste ho nevideli. Ani teraz ho nevidíte, ale veríte a jasáte nevýslovnou radosťou, plnou slávy, že dosahujete cieľ svojej viery – spásu duší.<br>" +
                            "Túto spásu hľadali a skúmali proroci, ktorí prorokovali o\u00A0milosti, pripravenej pre\u00A0vás. Skúmali, na\u00A0ktorý čas a na\u00A0aké okolnosti ukazuje Kristov Duch, ktorý bol v\u00A0nich, keď vopred svedčil o\u00A0Kristových utrpeniach a o\u00A0sláve, ktorá po\u00A0nich nasledovala.<br>" +
                            "A bolo im zjavené, že nie sebe, ale vám poslúžili tým, čo vám teraz zvestujú hlásatelia evanjelia v\u00A0Duchu Svätom, zoslanom z\u00A0neba, na\u00A0čo túžia hľadieť aj anjeli.<br>" +
                            "Počuli sme Božie slovo."},
            {"24gk", "", "", "Sk 13, 22-26",
                    "Ján kázal pred\u00A0Kristovým príchodom",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Pavol povedal: \"Boh povolal otcom za\u00A0kráľa Dávida a vydal mu svedectvo: ‚Našiel som Dávida, syna Jesseho, muža podľa môjho srdca, ktorý bude plniť moju vôľu celú.' Z\u00A0jeho potomstva dal Boh podľa prisľúbenia Izraelu Spasiteľa, Ježiša. Pred\u00A0jeho príchodom Ján hlásal všetkému izraelskému ľudu krst pokánia. Keď Ján končil svoj beh, hovoril: \"Ja nie som ten, za\u00A0koho ma pokladáte. Ale, hľa, po\u00A0mne prichádza ten, ktorému nie som hoden rozviazať obuv na\u00A0nohách.'<br>" +
                            "Bratia, synovia Abrahámovho rodu a tí, čo sa u\u00A0vás boja Boha, nám bolo poslané toto slovo spásy.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"28gk", "", "", "Gal 1, 11-20",
                    "Boh si ma už v\u00A0živote matky vybral",
                    "Čítanie z Listu svätého apoštola Pavla Galaťanom<br>" +
                            "Bratia, pripomínam vám, že evanjelium, ktoré som vám ja hlásal, nemá ľudský pôvod, lebo ja som ho neprijal, ani som sa ho nenaučil od\u00A0človeka, ale zo\u00A0zjavenia Ježiša Krista.<br>" +
                            "Veď ste počuli, ako som si kedysi počínal v\u00A0židovstve: že som veľmi prenasledoval Božiu Cirkev a nivočil som ju. V\u00A0židovstve som prevýšil mnohých vrstovníkov vo\u00A0svojom rode, lebo som viac horlil za\u00A0obyčaje svojich otcov.<br>" +
                            "Ale keď sa Bohu, ktorý si ma už v\u00A0lone matky vybral a svojou milosťou povolal, zapáčilo zjaviť vo\u00A0mne svojho Syna, aby som ho zvestoval medzi pohanmi, už som sa neradil s\u00A0telom a krvou, ani som nešiel do\u00A0Jeruzalema za\u00A0tými, čo boli apoštolmi prv ako ja, ale odišiel som do\u00A0Arábie a opäť som sa vrátil do\u00A0Damasku.<br>" +
                            "Až po\u00A0troch rokoch som šiel do\u00A0Jeruzalema, aby som videl Kéfasa, a zostal som uňho pätnásť dní. Iného z\u00A0apoštolov som nevidel, iba Jakuba, Pánovho brata.<br>" +
                            "A čo vám píšem, hovorím pred\u00A0Bohom, že neklamem.<br>" +
                            "Počuli sme Božie slovo."},
            {"29gk", "", "", "2 Tim 4, 6-8. 17-18",
                    "Už mám pripravený veniec spravodlivosti",
                    "Čítanie z Druhého listu svätého apoštola Pavla Timotejovi<br>" +
                            "Milovaný, ja mám vyliať svoju krv na\u00A0obetu, nastáva čas môjho odchodu. Dobrý boj som bojoval, beh som dokončil, vieru som zachoval. Už mám pripravený veniec spravodlivosti, ktorý mi v\u00A0onen deň dá Pán, spravodlivý sudca; a nielen mne, ale aj všetkým, čo milujú jeho príchod.<br>" +
                            "Pán stál pri\u00A0mne a posilňoval ma, aby sa cezo mňa naplnilo ohlasovanie a aby ho počuli všetky národy; a bol som vyslobodený z\u00A0tlamy leva.<br>" +
                            "Pán ma vyslobodí zo\u00A0všetkého zla a zachráni ma pre\u00A0svoje nebeské kráľovstvo. Jemu sláva na\u00A0veky vekov. Amen.<br>" +
                            "Počuli sme Božie slovo."},};
    String[][] citanie2_7 = {
            {"05gk", "", "", "Ef 4, 1-7. 11-13",
                    "Na dielo služby, na\u00A0budovanie Kristovho tela",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Bratia, prosím vás ja, väzeň v\u00A0Pánovi, aby ste žili dôstojne podľa povolania, ktorého sa vám dostalo, so\u00A0všetkou pokorou, miernosťou a zhovievavosťou. Znášajte sa navzájom v\u00A0láske a usilujte sa zachovať jednotu ducha vo\u00A0zväzku pokoja.<br>" +
                            "Jedno je telo a jeden Duch, ako ste aj povolaní v\u00A0jednej nádeji svojho povolania. Jeden je Pán, jedna viera, jeden krst. Jeden je Boh a Otec všetkých, ktorý je nad\u00A0všetkými, preniká všetkých a je vo\u00A0všetkých.<br>" +
                            "Ale každý z\u00A0nás dostal milosť podľa miery, akou nás obdaroval Kristus. On ustanovil niektorých za\u00A0apoštolov, niektorých za\u00A0prorokov, iných za\u00A0evanjelistov a iných za\u00A0pastierov a učiteľov, aby pripravovali svätých na\u00A0dielo služby, na\u00A0budovanie Kristovho tela, kým nedospejeme všetci k\u00A0jednote viery a poznania Božieho Syna, k\u00A0zrelosti muža, k\u00A0miere plného Kristovho veku.<br>" +
                            "Počuli sme Božie slovo."},
            {"17gk", "", "", "Flp 4, 4-9",
                    "Myslite na\u00A0všetko, čo mravne čisté",
                    "Čítanie z Listu svätého apoštola Pavla Filipanom<br>" +
                            "Bratia, ustavične sa radujte v\u00A0Pánovi! Opakujem: Radujte sa! Vaša miernosť nech je známa všetkým ľuďom. Pán je blízko.<br>" +
                            "O nič nebuďte ustarostení. Ale vo\u00A0všetkom modlitbou, prosbou a so\u00A0vzdávaním vďaky prednášajte svoje žiadosti Bohu.<br>" +
                            "A Boží pokoj, ktorý prevyšuje každú chápavosť, uchráni vaše srdcia a vaše mysle v\u00A0Kristovi Ježišovi.<br>" +
                            "Napokon, bratia, myslite na\u00A0všetko, čo je pravdivé, čo je cudné, čo je spravodlivé, čo je mravne čisté, čo je milé a čo má dobrú povesť, čo je čnostné a chválitebné!<br>" +
                            "Robte to, čo ste sa naučili, prijali, počuli a videli na\u00A0mne! A Boh pokoja bude s\u00A0vami.<br>" +
                            "Počuli sme Božie slovo."},};
    String[][] citanie2_8 = {
            {"06gn", "", "", "2 Pt 1, 16-19",
                    "Tento hlas sme my počuli; zaznel z\u00A0neba",
                    "Čítanie z Druhého listu svätého apoštola Petra<br>" +
                            "Milovaní, nesledovali sme vymyslené bájky, keď sme vás oboznámili s\u00A0mocou a príchodom nášho Pána Ježiša Krista, ale sami sme boli očitými svedkami jeho veleby.<br>" +
                            "On dostal od\u00A0Boha Otca česť a slávu, keď mu z\u00A0velebnej slávy zaznel hlas: \"Toto je môj Syn, môj milovaný, v\u00A0ktorom mám zaľúbenie.\" A tento hlas sme my počuli; zaznel z\u00A0neba, keď sme boli s\u00A0ním na\u00A0svätom vrchu.<br>" +
                            "Tým je aj prorocké slovo pre\u00A0nás pevnejšie. A vy dobre robíte, že hľadíte naň ako na\u00A0lampu, ktorá svieti v\u00A0temnom mieste, kým nesvitne deň a nevzíde vo\u00A0vašich srdciach zornica.<br>" +
                            "Počuli sme Božie slovo."},
            {"14gk", "", "", "1 Kor 15, 54-57",
                    "Dal nám víťazstvo skrze Ježiša Krista",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, keď si toto porušiteľné oblečie neporušiteľnosť a toto smrteľné si oblečie nesmrteľnosť, vtedy sa splní, čo je napísané: \"Smrť pohltilo víťazstvo. Smrť, kde je tvoje víťazstvo? Smrť, kdeže je tvoj osteň?\"<br>" +
                            "Ostňom smrti je hriech a silou hriechu je zákon. Ale vďaka Bohu, ktorý nám dal víťazstvo skrze nášho Pána Ježiša Krista.<br>" +
                            "Počuli sme Božie slovo."},
            {"15gk", "", "", "1 Kor 15, 20-27a ",
                    "Prvotinou je Kristus; potom tí, čo patria Kristovi",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, Kristus vstal z\u00A0mŕtvych, prvotina zosnulých. Lebo ako je skrze človeka smrť, tak je skrze človeka aj zmŕtvychvstanie: Veď ako všetci umierajú v\u00A0Adamovi, tak zasa všetci ožijú v\u00A0Kristovi.<br>" +
                            "Ale každý v\u00A0poradí, aké mu patrí: prvotinou je Kristus; potom, pri\u00A0jeho príchode, tí, čo patria Kristovi. A potom bude koniec, keď odovzdá Bohu a Otcovi kráľovstvo, keď zruší každé kniežatstvo, každú mocnosť a silu.<br>" +
                            "Lebo on musí kraľovať, kým mu nepoloží všetkých nepriateľov pod\u00A0nohy. Ako posledný nepriateľ bude zničená smrť, lebo mu všetko položil pod\u00A0nohy.<br>" +
                            "Počuli sme Božie slovo."},};
    String[][] citanie2_9 = {
            {"14gn", "", "", "Flp 2, 6-11",
                    "Uponížil sa, preto ho Boh povýšil",
                    "Čítanie z Listu svätého apoštola Pavla Filipanom<br>" +
                            "Ježiš Kristus, hoci má božskú prirodzenosť, nepridŕžal sa svojej rovnosti s\u00A0Bohom, ale zriekol sa seba samého, vzal si prirodzenosť sluhu, stal sa podobný ľuďom a podľa vonkajšieho zjavu bol pokladaný za\u00A0človeka. Uponížil sa, stal sa poslušným až na\u00A0smrť, až na\u00A0smrť na\u00A0kríži.<br>" +
                            "Preto ho Boh nad\u00A0všetko povýšil a dal mu meno, ktoré je nad\u00A0každé iné meno, aby sa na\u00A0meno Ježiš zohlo každé koleno v\u00A0nebi, na\u00A0zemi i v\u00A0podsvetí a aby každý jazyk vyznával: \"Ježiš Kristus je Pán!\" na\u00A0slávu Boha Otca.<br>" +
                            "Počuli sme Božie slovo."},
            {"15gk", "", "", "1 Pt 4, 13-16",
                    "Keď vás hanobia pre\u00A0Kristovo meno, ste blahoslavení",
                    "Čítanie z Prvého listu svätého apoštola Petra<br>" +
                            "Milovaní, radujte sa, keď máte účasť na\u00A0Kristových utrpeniach, aby ste sa radovali a plesali aj vtedy, keď sa zjaví jeho sláva.<br>" +
                            "Keď vás hanobia pre\u00A0Kristovo meno, ste blahoslavení, lebo Duch slávy a Boží na\u00A0vás spočíva.<br>" +
                            "Len nech nik z\u00A0vás netrpí ako vrah alebo zlodej, alebo zločinec, alebo sliedič. Kto však trpí ako kresťan, nech sa nehanbí, ale nech oslavuje Boha týmto menom.<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] citanie2_10 = {
            {"26gk+", "", "", "1 Kor 3, 9c-11. 16-17",
                    "Ste Boží chrám",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, vy ste Božia stavba. <br>" +
                            "Podľa Božej milosti, ktorú som dostal, položil som ako múdry staviteľ základ a iný na\u00A0ňom stavia. Ale každý nech si dáva pozor, ako na\u00A0ňom stavia. Lebo nik nemôže položiť iný základ okrem toho, čo je už položený, a je ním Ježiš Kristus.<br>" +
                            "Neviete že ste Boží chrám a že vo\u00A0vás prebýva Boží Duch? Kto by teda Boží chrám zničil, toho Boh zničí. Lebo Boží chrám je svätý – a ním ste vy.<br>" +
                            "Počuli sme Božie slovo."},
            {"31gk", "", "", "1 Jn 3, 1-3",
                    "Budeme vidieť Boha takého, aký je",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, pozrite, akú veľkú lásku nám daroval Otec: voláme sa Božími deťmi a nimi aj sme.<br>" +
                            "Preto nás svet nepozná, že nepoznal jeho.<br>" +
                            "Milovaní, teraz sme Božími deťmi, a ešte sa neukázalo, čím budeme. Vieme však, že keď sa on zjaví, budeme mu podobní, lebo ho budeme vidieť takého, aký je.<br>" +
                            "Každý, kto má túto nádej v\u00A0neho, usiluje sa byť čistý, ako je on čistý.<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] citanie2_11 = {
            {"01gk", "", "", "1 Jn 3, 1-3",
                    "Budeme vidieť Boha takého, aký je",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, pozrite, akú veľkú lásku nám daroval Otec: voláme sa Božími deťmi a nimi aj sme.<br>" +
                            "Preto nás svet nepozná, že nepoznal jeho.<br>" +
                            "Milovaní, teraz sme Božími deťmi, a ešte sa neukázalo, čím budeme. Vieme však, že keď sa on zjaví, budeme mu podobní, lebo ho budeme vidieť takého, aký je.<br>" +
                            "Každý, kto má túto nádej v\u00A0neho, usiluje sa byť čistý, ako je on čistý.<br>" +
                            "Počuli sme Božie slovo."},
            {"02an", "", "", "2 Kor 4, 14 – 5, 1",
                    "Viditeľné je do\u00A0času, ale neviditeľné je naveky",
                    "Čítanie z Druhého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, vieme, že ten, čo vzkriesil Pána Ježiša, s\u00A0Ježišom vzkriesi aj nás a postaví nás s\u00A0vami.<br>" +
                            "A to všetko pre\u00A0vás, aby hojnosť milosti prostredníctvom mnohých rozmnožila vzdávanie vďaky na\u00A0Božiu slávu.<br>" +
                            "Preto neochabujeme; a hoci náš vonkajší človek chradne, náš vnútorný sa zo\u00A0dňa na\u00A0deň obnovuje. Veď naše terajšie ľahké súženie prinesie nám nesmierne veľkú váhu večnej slávy, ak nehľadíme na\u00A0to, čo je viditeľné, ale na\u00A0to, čo je neviditeľné; lebo viditeľné je do\u00A0času, ale neviditeľné je naveky.<br>" +
                            "Veď vieme, že keď sa tento stánok – náš pozemský dom rozpadne, máme od\u00A0Boha príbytok nie rukou zhotovený, ale večný dom v\u00A0nebi.<br>" +
                            "Počuli sme Božie slovo."},
            {"02bn", "", "", "1 Sol 4, 13-18",
                    "Boh tých, čo zosnuli, skrze Ježiša privedie s\u00A0ním",
                    "Čítanie z Prvého listu svätého apoštola Pavla Solúnčanom<br>" +
                            "Nechceme, bratia, aby ste nevedeli, ako je to so\u00A0zosnulými, aby ste sa nezarmucovali ako ostatní, čo nemajú nádej.<br>" +
                            "Lebo ak veríme, že Ježiš zomrel a vstal z\u00A0mŕtvych, tak Boh aj tých, čo zosnuli, skrze Ježiša privedie s\u00A0ním.<br>" +
                            "Toto vám hovoríme podľa Pánovho slova: My, čo žijeme a zostaneme až do\u00A0Pánovho príchodu, nepredídeme tých, čo zosnuli.<br>" +
                            "Lebo na\u00A0povel, na\u00A0hlas archanjela a zvuk Božej poľnice sám Pán zostúpi z\u00A0neba a tí, čo umreli v\u00A0Kristovi, vstanú prví. Potom my, čo žijeme a zostaneme, budeme spolu s\u00A0nimi v\u00A0oblakoch uchvátení do\u00A0vzduchu v\u00A0ústrety Pánovi, a tak budeme navždy s\u00A0Pánom.<br>" +
                            "Preto sa potešujte navzájom týmito slovami.<br>" +
                            "Počuli sme Božie slovo."},
            {"02cn", "", "", "2 Kor 5, 1. 6-10",
                    "Máme večný dom v\u00A0nebi",
                    "Čítanie z Druhého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, vieme, že keď sa tento stánok náš pozemský dom rozpadne, máme od\u00A0Boha príbytok nie rukou zhotovený, ale večný dom v\u00A0nebi.<br>" +
                            "Sme teda stále plní dôvery a vieme, že kým sme doma v\u00A0tele, sme vzdialení od\u00A0Pána; lebo žijeme vo\u00A0viere, a nie v\u00A0nazeraní. Sme však plní dôvery a radšej sa chceme vzdialiť z\u00A0tela a bývať u\u00A0Pána.<br>" +
                            "A preto sa usilujeme páčiť sa mu, či sme doma alebo mimo domu. Veď sa všetci musíme ukázať pred\u00A0Kristovou súdnou stolicou, aby každý dostal odplatu za\u00A0to, čo konal, kým bol v\u00A0tele, či už dobré a či zlé.<br>" +
                            "Počuli sme Božie slovo."},
            {"11g", "", "", "1 Pt 5, 1-4",
                    "Paste Božie stádo, ktoré je u\u00A0vás",
                    "Čítanie z Prvého listu svätého apoštola Petra<br>" +
                            "Milovaní, starších, čo sú medzi vami, prosím ako spolustarší a svedok Kristových utrpení, ale aj účastník jeho slávy, ktorá sa má v\u00A0budúcnosti zjaviť: Paste Božie stádo, ktoré je u\u00A0vás; starajte sa oň nie z\u00A0prinútenia, ale dobrovoľne, podľa Božej vôle, nie pre\u00A0mrzký zisk, ale ochotne; nie ako páni nad\u00A0dedičným podielom, ale ako vzor stáda.<br>" +
                            "A keď sa zjaví Najvyšší pastier, dostanete nevädnúci veniec slávy.<br>" +
                            "Počuli sme Božie slovo."},
            {"17gk", "", "", "1 Jn 3, 14-18",
                    "Aj my sme povinní dávať život za\u00A0bratov",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, my vieme, že sme prešli zo\u00A0smrti do\u00A0života, lebo milujeme bratov. Kto nemiluje, ostáva v\u00A0smrti. Každý, kto nenávidí svojho brata, je vrah. A viete, že ani jeden vrah nemá v\u00A0sebe večný život.<br>" +
                            "Čo je láska, poznali sme z\u00A0toho, že on položil za\u00A0nás svoj život. Aj my sme povinní dávať život za\u00A0bratov.<br>" +
                            "Ak má niekto pozemský majetok a vidí brata v\u00A0núdzi, a srdce si pred\u00A0ním zatvorí, ako v\u00A0ňom môže ostávať Božia láska?<br>" +
                            "Deti moje, nemilujme len slovom a jazykom, ale skutkom a pravdou.<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] citanie2_12 = {
            {"24gkn", "", "", "Sk 13, 16-17. 22-25",
                    "Pavlovo svedectvo o\u00A0Kristovi, Dávidovom synovi",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Pavol vstal v\u00A0synagóge Pizídskej Antiochie, dal rukou znamenie, aby bolo ticho, a povedal: \"Mužovia, Izraeliti a vy všetci, čo sa bojíte Boha, počúvajte! Boh tohoto izraelského ľudu si vyvolil našich otcov a povýšil tento ľud, keď býval v\u00A0cudzine, v\u00A0egyptskej krajine. Potom ho z\u00A0nej vyviedol zdvihnutým ramenom.<br>" +
                            "Povolal im za\u00A0kráľa Dávida a vydal mu svedectvo: ‚Našiel som Dávida, syna Jesseho, muža podľa môjho srdca, ktorý bude plniť moju vôľu celú.'<br>" +
                            "Z jeho potomstva dal Boh podľa prisľúbenia Izraelu Spasiteľa, Ježiša. Pred\u00A0jeho príchodom Ján hlásal všetkému izraelskému ľudu krst pokánia. Keď Ján končil svoj beh, hovoril: ‚Ja nie som ten, za\u00A0koho ma pokladáte. Ale, hľa, po\u00A0mne prichádza ten, ktorému nie som hoden rozviazať obuv na\u00A0nohách.'\"<br>" +
                            "Počuli sme Božie slovo."},
            {"25agkn", "", "", "Tít 2, 11-14",
                    "Zjavila sa Božia milosť všetkým ľuďom",
                    "Čítanie z Listu svätého apoštola Pavla Títovi<br>" +
                            "Milovaný, zjavila sa Božia milosť na\u00A0spásu všetkým ľuďom a vychováva nás, aby sme sa zriekli bezbožnosti a svetských žiadostí a žili v\u00A0tomto veku triezvo, spravodlivo a nábožne, a tak očakávali blahoslavenú nádej a príchod slávy veľkého Boha a nášho Spasiteľa Ježiša Krista, ktorý vydal za\u00A0nás seba samého, aby nás vykúpil z\u00A0každej neprávosti a očistil si vlastný ľud, horlivý v\u00A0dobrých skutkoch.<br>" +
                            "Počuli sme Božie slovo."},
            {"25bgkn", "", "", "Tít 3, 4-7",
                    "Spasil nás zo\u00A0svojho milosrdenstva",
                    "Čítanie z Listu svätého apoštola Pavla Titovi<br>" +
                            "Milovaný, keď sa zjavila dobrota Boha, nášho Spasiteľa, a jeho láska k\u00A0ľuďom, spasil nás nie pre\u00A0spravodlivé skutky, ktoré sme my konali, ale zo\u00A0svojho milosrdenstva, kúpeľom znovuzrodenia a obnovy v\u00A0Duchu Svätom, ktorého na\u00A0nás hojne vylial skrze Ježiša Krista, nášho Spasiteľa, aby sme, ospravedlnení jeho milosťou, boli podľa nádeje dedičmi večného života.<br>" +
                            "Počuli sme Božie slovo."},
            {"25cgkn", "", "", "Hebr 1, 1-6",
                    "Boh k\u00A0nám prehovoril v\u00A0Synovi",
                    "Čítanie z Listu Hebrejom<br>" +
                            "Mnoho ráz a rozličným spôsobom hovoril kedysi Boh otcom skrze prorokov. V\u00A0týchto posledných dňoch prehovoril k\u00A0nám v\u00A0Synovi, ktorého ustanovil za\u00A0dediča všetkého a skrze ktorého stvoril aj svet. On je odblesk jeho slávy a obraz jeho podstaty a udržuje všetko svojím mocným slovom. Preto keď vykonal očistenie od\u00A0hriechov, zasadol po\u00A0pravici velebnosti na\u00A0výsostiach; a stal sa o\u00A0toľko vyšším od\u00A0anjelov, o\u00A0koľko vznešenejšie meno zdedil než oni.<br>" +
                            "Veď kedy komu z\u00A0anjelov povedal: \"Ty si môj syn, ja som ťa dnes splodil\" a opäť: \"Ja budem jeho otcom a on bude mojím synom\"?<br>" +
                            "A znova, keď uvádza prvorodeného na\u00A0svet, hovorí: \"Nech sa mu klaňajú všetci Boží anjeli.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"31gk", "", "", "Gal 4, 4-7",
                    "Boh poslal svojho Syna, narodeného zo\u00A0ženy",
                    "Čítanie z Listu svätého apoštola Pavla Galaťanom<br>" +
                            "Bratia, keď prišla plnosť času, Boh poslal svojho Syna, narodeného zo\u00A0ženy, narodeného pod\u00A0zákonom, aby vykúpil tých, čo boli pod\u00A0zákonom, a aby sme dostali adoptívne synovstvo.<br>" +
                            "Pretože ste synmi, poslal Boh do\u00A0našich sŕdc Ducha svojho Syna a on volá: \"Abba, Otče!\"<br>" +
                            "A tak už nie si otrok, ale syn; a keď syn, tak skrze Boha aj dedič.<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] evanjeliumPohyb = {
            {"0gkp", "", "", "Mt 1, 16. 18-21. 24a ",
                    "Jozef urobil, ako mu prikázal Pánov anjel",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Jakub mal syna Jozefa, manžela Márie, z\u00A0ktorej sa narodil Ježiš, nazývaný Kristus.<br>" +
                            "S narodením Ježiša Krista to bolo takto: Jeho matka Mária bola zasnúbená s\u00A0Jozefom. Ale skôr, ako by boli začali spolu bývať, ukázalo sa, že počala z\u00A0Ducha Svätého.<br>" +
                            "Jozef, jej manžel, bol človek spravodlivý a nechcel ju vystaviť potupe, preto ju zamýšľal potajomky prepustiť.<br>" +
                            "Ako o\u00A0tom uvažoval, zjavil sa mu vo\u00A0sne Pánov anjel a povedal: \"Jozef, syn Dávidov, neboj sa prijať Máriu, svoju manželku, lebo to, čo sa v\u00A0nej počalo, je z\u00A0Ducha Svätého. Porodí syna a dáš mu meno Ježiš; lebo on vyslobodí svoj ľud z\u00A0hriechov.\"<br>" +
                            "Keď sa Jozef prebudil, urobil, ako mu prikázal Pánov anjel.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Lk 2, 41-51a",
                    "Pozri, tvoj otec i ja sme ťa s\u00A0bolesťou hľadali!",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježišovi rodičia chodievali každý rok do\u00A0Jeruzalema na\u00A0veľkonočné sviatky. Keď mal dvanásť rokov, tiež išli, ako bývalo na\u00A0sviatky zvykom.<br>" +
                            "A keď sa dni slávností skončili a oni sa vracali domov, zostal chlapec Ježiš v\u00A0Jeruzaleme, čo jeho rodičia nezbadali. Nazdávali sa, že je v\u00A0sprievode.<br>" +
                            "Prešli deň cesty a hľadali ho medzi príbuznými a známymi. No nenašli. Vrátili sa teda do\u00A0Jeruzalema a tam ho hľadali.<br>" +
                            "Po troch dňoch ho našli v\u00A0chráme. Sedel medzi učiteľmi, počúval ich a kládol im otázky. Všetci, čo ho počuli, žasli nad\u00A0jeho rozumnosťou a odpoveďami.<br>" +
                            "Keď ho zazreli, stŕpli od\u00A0údivu a Matka mu povedala: \"Syn môj, čo si nám to urobil? Pozri, tvoj otec i ja sme ťa s\u00A0bolesťou hľadali!\"<br>" +
                            "On im odpovedal: \"Prečo ste ma hľadali? Nevedeli ste, že mám byť tam, kde ide o\u00A0môjho Otca?\" Ale oni nepochopili slovo, ktoré im hovoril.<br>" +
                            "Potom sa s\u00A0nimi vrátil do\u00A0Nazareta a bol im poslušný.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"1gkp", "", "", "Lk 1, 26-38",
                    "Počneš a porodíš syna",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Boh poslal anjela Gabriela do\u00A0galilejského mesta, ktoré sa volá Nazaret, k\u00A0panne zasnúbenej mužovi z\u00A0rodu Dávidovho, menom Jozefovi. A meno panny bolo Mária.<br>" +
                            "Anjel prišiel k\u00A0nej a povedal: \"Zdravas', milosti plná, Pán s\u00A0tebou.\"<br>" +
                            "Ona sa nad\u00A0jeho slovami zarazila a rozmýšľala, čo znamená takýto pozdrav.<br>" +
                            "Anjel jej povedal: \"Neboj sa, Mária, našla si milosť u\u00A0Boha. Počneš a porodíš syna a dáš mu meno Ježiš. On bude veľký a bude sa volať Synom Najvyššieho. Pán, Boh, mu dá trón jeho otca Dávida, naveky bude kraľovať nad\u00A0Jakubovým rodom a jeho kráľovstvu nebude konca.\"<br>" +
                            "Mária povedala anjelovi: \"Ako sa to stane, veď ja muža nepoznám?\"<br>" +
                            "Anjel jej odpovedal: \"Duch Svätý zostúpi na\u00A0teba a moc Najvyššieho ťa zatieni. A preto aj dieťa bude sa volať svätým, bude to Boží Syn. Aj Alžbeta, tvoja príbuzná, počala syna v\u00A0starobe. Už je v\u00A0šiestom mesiaci. A hovorili o\u00A0nej, že je neplodná! Lebo Bohu nič nie je nemožné.\"<br>" +
                            "Mária povedala: \"Hľa, služobnica Pána, nech sa mi stane podľa tvojho slova.\"<br>" +
                            "Anjel potom od\u00A0nej odišiel.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"1op", "", "", "Jn 14, 23-26",
                    "Duch Svätý vás naučí všetko",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Kto ma miluje, bude zachovávať moje slovo a môj Otec ho bude milovať; prídeme k\u00A0nemu a urobíme si uňho príbytok. Kto ma nemiluje, nezachováva moje slová. A slovo, ktoré počujete, nie je moje, ale Otcovo, toho, ktorý ma poslal.<br>" +
                            "Toto som vám povedal, kým som ešte u\u00A0vás. Ale Tešiteľ, Duch Svätý, ktorého pošle Otec v\u00A0mojom mene, naučí vás všetko a pripomenie vám všetko, čo som vám povedal.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"2p", "", "", "Jn 19, 25-34",
                    "Hľa, tvoj syn! Hľa, tvoja matka!",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Pri Ježišovom kríži stála jeho matka, sestra jeho matky, Mária Kleopasova, a Mária Magdaléna. Keď Ježiš uzrel matku a pri\u00A0nej učeníka, ktorého miloval, povedal matke: \"Žena, hľa, tvoj syn!\" Potom povedal učeníkovi: \"Hľa, tvoja matka!\" A od\u00A0tej hodiny si ju učeník vzal k\u00A0sebe.<br>" +
                            "Potom Ježiš vo\u00A0vedomí, že je už všetko dokonané, povedal, aby sa splnilo Písmo: \"Žíznim.\" Bola tam nádoba plná octu. Nastokli teda na\u00A0yzop špongiu naplnenú octom a podali mu ju k\u00A0ústam. Keď Ježiš okúsil ocot, povedal: \"Je dokonané.\" Naklonil hlavu a odovzdal ducha.<br>" +
                            "Keďže bol Prípravný deň, Židia požiadali Piláta, aby ukrižovaným polámali nohy a sňali ich, aby nezostali telá na\u00A0kríži cez\u00A0sobotu, lebo v\u00A0tú sobotu bol veľký sviatok. Prišli teda vojaci a polámali kosti prvému aj druhému, čo boli s\u00A0ním ukrižovaní. No keď prišli k\u00A0Ježišovi a videli, že je už mŕtvy, kosti mu nepolámali, ale jeden z\u00A0vojakov mu kopijou prebodol bok a hneď vyšla krv a voda.<br>" +
                            "Počuli sme slovo Pánovo."},

//Nášho Pána Ježiša Krista, najvyššieho a večného kňaza
            {"3gp", "A", "", "Mt 26, 36-42",
                    "Moja duša je smutná až na\u00A0smrť",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš prišiel s\u00A0učeníkmi na\u00A0pozemok, ktorý sa volá Getsemani, a povedal učeníkom: \"Sadnite si tu, kým odídem tamto a pomodlím sa.\" Vzal so\u00A0sebou Petra a oboch Zebedejových synov. I doľahli naňho smútok a úzkosť. Vtedy im povedal: \"Moja duša je smutná až na\u00A0smrť. Ostaňte tu a bdejte so\u00A0mnou!\"<br>" +
                            "Trochu poodišiel, padol na\u00A0tvár a modlil sa: \"Otče môj, ak je možné, nech ma minie tento kalich. No nie ako ja chcem, ale ako ty.\"<br>" +
                            "Keď sa vrátil k\u00A0učeníkom, našiel ich spať. I povedal Petrovi: \"To ste nemohli ani hodinu bdieť so\u00A0mnou? Bdejte a modlite sa, aby ste neprišli do\u00A0pokušenia! Duch je síce ochotný, ale telo slabé.\"<br>" +
                            "Znova odišiel a modlil sa: \"Otče môj, ak ma tento kalich nemôže minúť a musím ho piť, nech sa stane tvoja vôľa.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "B", "", "Mk 14, 22-25",
                    "Toto je moje telo. Toto je moja krv.",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "V prvý deň sviatkov Nekvasených chlebov, keď zabíjali veľkonočného baránka, pri\u00A0večeri Ježiš vzal chlieb a dobrorečil, lámal ho a dával im, hovoriac: \"Vezmite, toto je moje telo!\" Potom vzal kalich, vzdával vďaky, dal im ho a všetci z\u00A0neho pili. A povedal im: \"Toto je moja krv novej zmluvy, ktorá sa vylieva za\u00A0mnohých. Veru, hovorím vám: Už nebudem piť z\u00A0plodu viniča až do\u00A0dňa, keď ho budem piť nový v\u00A0Božom kráľovstve.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "C", "", "Jn 17, 1-2. 9. 14-26",
                    "Pre nich sa ja sám posväcujem, aby boli aj oni posvätení v\u00A0pravde",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš pozdvihol oči k\u00A0nebu a hovoril: \"Otče, nadišla hodina: Osláv svojho Syna, aby Syn oslávil teba, tak, ako si mu dal moc nad\u00A0každým telom, aby všetko, čo si dal ty jemu, im darovalo večný život. Za\u00A0nich prosím. Neprosím za\u00A0svet, ale za\u00A0tých, ktorých si mi dal, lebo sú tvoji.<br>" +
                            "Dal som im tvoje slovo a svet ich znenávidel, lebo nie sú zo\u00A0sveta, ako ani ja nie som zo\u00A0sveta.<br>" +
                            "Neprosím, aby si ich vzal zo\u00A0sveta, ale aby si ich ochránil pred\u00A0Zlým. Nie sú zo\u00A0sveta, ako ani ja nie som zo\u00A0sveta. Posväť ich pravdou; tvoje slovo je pravda. Ako si ty mňa poslal na\u00A0svet, aj ja som ich poslal do\u00A0sveta a pre\u00A0nich sa ja sám posväcujem, aby boli aj oni posvätení v\u00A0pravde.<br>" +
                            "No neprosím len za\u00A0nich, ale aj za\u00A0tých, čo skrze ich slovo uveria vo\u00A0mňa, aby všetci boli jedno, ako ty, Otče vo\u00A0mne a ja v\u00A0tebe, aby aj oni boli v\u00A0nás, aby svet uveril, že si ma ty poslal. A slávu, ktorú si ty dal mne, ja som dal im, aby boli jedno, ako sme my jedno – ja v\u00A0nich a ty vo\u00A0mne. Nech sú tak dokonale jedno, aby svet spoznal, že si ma ty poslal a že ich miluješ tak, ako miluješ mňa.<br>" +
                            "Otče, chcem, aby aj tí, ktorých si mi dal, boli so\u00A0mnou tam, kde som ja, aby videli moju slávu, ktorú si mi dal, lebo si ma miloval pred\u00A0stvorením sveta.<br>" +
                            "Spravodlivý Otče, svet ťa nepozná, ale ja ťa poznám. I oni spoznali, že si ma ty poslal. Ohlásil som im tvoje meno a ešte ohlásim, aby láska, ktorou ma miluješ, bola v\u00A0nich a aby som v\u00A0nich bol ja.\"<br>" +
                            "Počuli sme slovo Pánovo."},

//Najsvätejšej Trojice
            {"7gkp", "A", "", "Jn 3, 16-18",
                    "Boh poslal svojho Syna, aby sa skrze neho svet spasil",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Boh tak miloval svet, že dal svojho jednorodeného Syna, aby nezahynul nik, kto v\u00A0neho verí, ale aby mal večný život.<br>" +
                            "Lebo Boh neposlal Syna na\u00A0svet, aby svet odsúdil, ale aby sa skrze neho svet spasil. Kto v\u00A0neho verí, nie je súdený. Ale kto neverí, už je odsúdený, pretože neuveril v\u00A0meno Jednorodeného Božieho Syna.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "B", "", "Mt 28, 16-20",
                    "Choďte a učte všetky národy",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Jedenásti učeníci odišli do\u00A0Galiley na\u00A0vrch, kam im Ježiš rozkázal. Keď ho uvideli, klaňali sa mu, no niektorí pochybovali.<br>" +
                            "Ježiš pristúpil k\u00A0nim a povedal im: \"Daná mi je všetka moc na\u00A0nebi i na\u00A0zemi. Choďte teda, učte všetky národy a krstite ich v\u00A0mene Otca i Syna i Ducha Svätého a naučte ich zachovávať všetko, čo som vám prikázal.<br>" +
                            "A hľa, ja som s\u00A0vami po\u00A0všetky dni až do\u00A0skončenia sveta.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "C", "", "Jn 16, 12-15",
                    "Duch pravdy vás uvedie do\u00A0plnej pravdy",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Ešte veľa vám mám toho povedať, ale teraz by ste to nezniesli.<br>" +
                            "Keď príde on, Duch pravdy, uvedie vás do\u00A0plnej pravdy, lebo nebude hovoriť sám zo\u00A0seba, ale bude hovoriť, čo počuje, a zvestuje vám, čo má prísť. On ma oslávi, lebo z\u00A0môjho vezme a zvestuje vám.<br>" +
                            "Všetko, čo má Otec, je moje. Preto som povedal, že z\u00A0môjho vezme a zvestuje vám.\"<br>" +
                            "Počuli sme slovo Pánovo."},

//PRIKÁZANÝ SVIATOK – Najsvätejšieho Kristovho Tela a Krvi
            {"4gkp", "A", "", "Jn 6, 51-58",
                    "Kto bude jesť z\u00A0tohoto chleba, bude žiť naveky; a ja ho vzkriesim v\u00A0posledný deň",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal zástupom: \"Ja som živý chlieb, ktorý zostúpil z\u00A0neba. Kto bude jesť z\u00A0tohoto chleba, bude žiť naveky. A chlieb, ktorý ja dám, je moje telo za\u00A0život sveta.\"<br>" +
                            "Židia sa hádali medzi sebou a hovorili: \"Ako nám tento môže dať jesť svoje telo?!\"<br>" +
                            "Ježiš im povedal: \"Veru, veru, hovorím vám: Ak nebudete jesť telo Syna človeka a piť jeho krv, nebudete mať v\u00A0sebe život.<br>" +
                            "Kto je moje telo a pije moju krv, má večný život a ja ho vzkriesim v\u00A0posledný deň.<br>" +
                            "Lebo moje telo je pravý pokrm a moja krv je pravý nápoj. Kto je moje telo a pije moju krv, ostáva vo\u00A0mne a ja v\u00A0ňom. Ako mňa poslal živý Otec a ja žijem z\u00A0Otca, aj ten, čo mňa je, bude žiť zo\u00A0mňa.<br>" +
                            "Toto je ten chlieb, ktorý zostúpil z\u00A0neba, a nie aký jedli otcovia a pomreli.<br>" +
                            "Kto je tento chlieb, bude žiť naveky.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "B", "", "Mk 14, 12-16. 22-26",
                    "Toto je moje telo. Toto je moja krv",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "V prvý deň sviatkov Nekvasených chlebov, keď zabíjali veľkonočného baránka, učeníci povedali Ježišovi: \"Kde ti máme ísť pripraviť veľkonočnú večeru?\"<br>" +
                            "Poslal dvoch zo\u00A0svojich učeníkov a vravel im: \"Choďte do\u00A0mesta. Tam stretnete človeka, ktorý bude niesť džbán vody. Choďte za\u00A0ním a pánovi domu, do\u00A0ktorého vojde, povedzte: ‚Učiteľ odkazuje: Kde je pre\u00A0mňa miestnosť, v\u00A0ktorej by som mohol jesť so\u00A0svojimi učeníkmi veľkonočného baránka?' On vám ukáže veľkú hornú sieň, prestretú a pripravenú. Tam nám prichystajte.\"<br>" +
                            "Učeníci odišli a keď prišli do\u00A0mesta, všetko našli tak, ako im povedal. A pripravili veľkonočného baránka.<br>" +
                            "Keď jedli, vzal chlieb a dobrorečil, lámal ho a dával im, hovoriac: \"Vezmite, toto je moje telo!\" Potom vzal kalich, vzdával vďaky, dal im ho a všetci z\u00A0neho pili. A povedal im: \"Toto je moja krv novej zmluvy, ktorá sa vylieva za\u00A0všetkých. Veru, hovorím vám: Už nebudem piť z\u00A0plodu viniča až do\u00A0dňa, keď ho budem piť nový v\u00A0Božom kráľovstve.\"<br>" +
                            "Potom zaspievali chválospev a vyšli na\u00A0Olivovú horu.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "C", "", "Lk 9, 11b-17",
                    "Jedli a všetci sa nasýtili",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš hovoril zástupom o\u00A0Božom kráľovstve a uzdravoval tých, čo to potrebovali. Deň sa začal schyľovať. Tu pristúpili Dvanásti a povedali mu: \"Rozpusť zástup, nech sa rozídu do\u00A0okolitých dedín a osád pohľadať si nocľah a jedlo, lebo tu sme na\u00A0pustom mieste.\"<br>" +
                            "On im povedal: \"Vy im dajte jesť!\"<br>" +
                            "Oni vraveli: \"Nemáme viac ako päť chlebov a dve ryby; ibaže by sme šli a nakúpili jedlo pre\u00A0celý tento zástup.\" Bolo tam asi päťtisíc mužov.<br>" +
                            "Ale on povedal svojim učeníkom: \"Usaďte ich v\u00A0skupinách asi po\u00A0päťdesiat!\" Urobili to a všetkých usadili.<br>" +
                            "Potom vzal päť chlebov a dve ryby, pozdvihol oči k\u00A0nebu, dobrorečil nad\u00A0nimi, lámal ich a dával svojim učeníkom, aby ich predkladali zástupu. I jedli a všetci sa nasýtili, ba ešte sa nazbieralo dvanásť košov odrobín, čo po\u00A0nich zostali.<br>" +
                            "Počuli sme slovo Pánovo."},

//Najsvätejšieho Srdca Ježišovho
            {"5gkp", "A", "", "Mt 11, 25-30",
                    "Skryl si tieto veci pred\u00A0múdrymi a zjavil si ich maličkým",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "V tom čase Ježiš povedal: \"Zvelebujem ťa, Otče, Pán neba i zeme, že si tieto veci skryl pred\u00A0múdrymi a rozumnými a zjavil si ich maličkým. Áno, Otče, tebe sa tak páčilo.<br>" +
                            "Môj Otec mi odovzdal všetko. A nik nepozná Syna, iba Otec, ani Otca nepozná nik, iba Syn a ten, komu to Syn bude chcieť zjaviť.<br>" +
                            "Poďte ku\u00A0mne všetci, ktorí sa namáhate a ste preťažení, a ja vás posilním. Vezmite na\u00A0seba moje jarmo a učte sa odo\u00A0mňa, lebo som tichý a pokorný srdcom; a nájdete odpočinok pre\u00A0svoju dušu.<br>" +
                            "Moje jarmo je príjemné a moje bremeno ľahké.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "B", "", "Jn 19, 31-37",
                    "Prebodol mu bok a vyšla krv a voda",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Keďže bol Prípravný deň, Židia požiadali Piláta, aby ukrižovaným polámali nohy a sňali ich, aby nezostali telá na\u00A0kríži cez\u00A0sobotu, lebo v\u00A0tú sobotu bol veľký sviatok.<br>" +
                            "Prišli teda vojaci a polámali kosti prvému aj druhému, čo boli s\u00A0ním ukrižovaní.<br>" +
                            "No keď prišli k\u00A0Ježišovi a videli, že je už mŕtvy, kosti mu nepolámali, ale jeden z\u00A0vojakov mu kopijou prebodol bok a hneď vyšla krv a voda.<br>" +
                            "A ten, ktorý to videl, vydal o\u00A0tom svedectvo a jeho svedectvo je pravdivé. On vie, že hovorí pravdu, aby ste aj vy uverili. Toto sa stalo, aby sa splnilo Písmo: \"Kosť mu nebude zlomená.\" A na\u00A0inom mieste Písmo hovorí: \"Uvidia, koho prebodli.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "C", "", "Lk 15, 3-7",
                    "Radujte sa so\u00A0mnou, lebo som našiel ovcu, čo sa mi stratila",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš povedal farizejom a zákonníkom toto podobenstvo: \"Ak má niekto z\u00A0vás sto oviec a jednu z\u00A0nich stratí, nenechá tých deväťdesiatdeväť na\u00A0púšti a nepôjde za\u00A0tou, čo sa stratila, kým ju nenájde? A keď ju nájde, vezme ju s\u00A0radosťou na\u00A0plecia, a len čo príde domov, zvolá priateľov a susedov a povie im: ‚Radujte sa so\u00A0mnou lebo som našiel ovcu, čo sa mi stratila.'<br>" +
                            "Hovorím vám: Tak bude aj v\u00A0nebi väčšia radosť nad\u00A0jedným hriešnikom, ktorý robí pokánie, ako nad\u00A0deväťdesiatimi deviatimi spravodlivými, ktorí pokánie nepotrebujú.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"4p", "", "", "Lk 2, 41-52",
                    "Rodičia našli Ježiša medzi učiteľmi",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježišovi rodičia chodievali každý rok do\u00A0Jeruzalema na\u00A0veľkonočné sviatky. Keď mal dvanásť rokov, tiež išli, ako bývalo na\u00A0sviatky zvykom. A keď sa dni slávností skončili a oni sa vracali domov, zostal chlapec Ježiš v\u00A0Jeruzaleme, čo jeho rodičia nezbadali. Nazdávali sa, že je v\u00A0sprievode. Prešli deň cesty a hľadali ho medzi príbuznými a známymi. No nenašli. Vrátili sa teda do\u00A0Jeruzalema a tam ho hľadali.<br>" +
                            "Po troch dňoch ho našli v\u00A0chráme. Sedel medzi učiteľmi, počúval ich a kládol im otázky. Všetci, čo ho počuli, žasli nad\u00A0jeho rozumnosťou a odpoveďami.<br>" +
                            "Keď ho zazreli, stŕpli od\u00A0údivu a Matka mu povedala: \"Syn môj, čo si nám to urobil? Pozri, tvoj otec i ja sme ťa s\u00A0bolesťou hľadali!\"<br>" +
                            "On im odpovedal: \"Prečo ste ma hľadali? Nevedeli ste, že mám byť tam, kde ide o\u00A0môjho Otca?\" Ale oni nepochopili slovo, ktoré im hovoril.<br>" +
                            "Potom sa s\u00A0nimi vrátil do\u00A0Nazareta a bol im poslušný.<br>" +
                            "A jeho matka zachovávala všetky slová vo\u00A0svojom srdci.<br>" +
                            "A Ježiš sa vzmáhal v\u00A0múdrosti, veku a v\u00A0obľube u\u00A0Boha i u\u00A0ľudí.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"2gkp", "", "", "Jn 7, 37-39",
                    "Potečú prúdy živej vody",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "V posledný, veľký deň sviatkov Ježiš vstal a zvolal: \"Ak je niekto smädný a verí vo\u00A0mňa, nech príde ku\u00A0mne a nech pije. Ako hovorí Písmo, z\u00A0jeho vnútra potečú prúdy živej vody.\"<br>" +
                            "To povedal o\u00A0Duchu, ktorého mali dostať tí, čo v\u00A0neho uverili. Lebo ešte nebolo Ducha, pretože Ježiš ešte nebol oslávený.<br>" +
                            "Počuli sme slovo Pánovo."},
//Zoslanie Ducha Svätého(slávnosť)
            {"3gkp", "A", "", "Jn 20, 19-23",
                    "Ako mňa poslal Otec, aj ja posielam vás: Prijmite Ducha Svätého",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Večer v\u00A0ten istý prvý deň v\u00A0týždni, keď boli učeníci zo\u00A0strachu pred\u00A0Židmi zhromaždení za\u00A0zatvorenými dverami, prišiel Ježiš, stal si doprostred a povedal im: \"Pokoj vám!\" Ako to povedal, ukázal im ruky a bok. Učeníci sa zaradovali, keď videli Pána.<br>" +
                            "A znova im povedal: \"Pokoj vám! Ako mňa poslal Otec, aj ja posielam vás.\" Keď to povedal, dýchol na\u00A0nich a hovoril im: \"Prijmite Ducha Svätého. Komu odpustíte hriechy, budú mu odpustené, komu ich zadržíte, budú zadržané.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "B", "", "Jn 15, 26-27; 16, 12-15",
                    "Duch pravdy vás uvedie do\u00A0plnej pravdy",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Keď príde Tešiteľ, ktorého vám ja pošlem od\u00A0Otca, Duch pravdy, ktorý vychádza od\u00A0Otca, on o\u00A0mne vydá svedectvo. Ale aj vy vydávate svedectvo, lebo ste so\u00A0mnou od\u00A0začiatku.<br>" +
                            "Ešte veľa vám mám toho povedať, ale teraz by ste to nezniesli. Keď príde on, Duch pravdy, uvedie vás do\u00A0plnej pravdy, lebo nebude hovoriť sám zo\u00A0seba, ale bude hovoriť, čo počuje, a zvestuje vám, čo má prísť. On ma oslávi, lebo z\u00A0môjho vezme a zvestuje vám. Všetko, čo má Otec, je moje. Preto som povedal, že z\u00A0môjho vezme a zvestuje vám.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "C", "", "Jn 20, 19-23",
                    "Ako mňa poslal Otec, aj ja posielam vás: Prijmite Ducha Svätého",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Večer v\u00A0ten istý prvý deň v\u00A0týždni, keď boli učeníci zo\u00A0strachu pred\u00A0Židmi zhromaždení za\u00A0zatvorenými dverami, prišiel Ježiš, stal si doprostred a povedal im: \"Pokoj vám!\" Ako to povedal, ukázal im ruky a bok. Učeníci sa zaradovali, keď videli Pána.<br>" +
                            "A znova im povedal: \"Pokoj vám! Ako mňa poslal Otec, aj ja posielam vás.\" Keď to povedal, dýchol na\u00A0nich a hovoril im: \"Prijmite Ducha Svätého. Komu odpustíte hriechy, budú mu odpustené, komu ich zadržíte, budú zadržané.\"<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Jn 14, 15-16. 23b-26",
                    "Duch Svätý vás naučí všetko",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Ak ma milujete, budete zachovávať moje prikázania. A ja poprosím Otca a on vám dá iného Tešiteľa, aby zostal s\u00A0vami naveky.<br>" +
                            "Kto ma miluje, bude zachovávať moje slovo a môj Otec ho bude milovať; prídeme k\u00A0nemu a urobíme si uňho príbytok. Kto ma nemiluje, nezachováva moje slová. A slovo, ktoré počujete, nie je moje, ale Otcovo, toho, ktorý ma poslal.<br>" +
                            "To som vám povedal, kým som ešte u\u00A0vás. Ale Tešiteľ, Duch Svätý, ktorého pošle Otec v\u00A0mojom mene, naučí vás všetko a pripomenie vám všetko, čo som vám povedal.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"6gkp", "A", "", "Mt 28, 16-20",
                    "Choďte a učte všetky národy",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Jedenásti učeníci odišli do\u00A0Galiley na\u00A0vrch, kam im Ježiš rozkázal. Keď ho uvideli, klaňali sa mu, no niektorí pochybovali.<br>" +
                            "Ježiš pristúpil k\u00A0nim a povedal im: \"Daná mi je všetka moc na\u00A0nebi i na\u00A0zemi. Choďte teda, učte všetky národy a krstite ich v\u00A0mene Otca i Syna i Ducha Svätého a naučte ich zachovávať všetko, čo som vám prikázal.<br>" +
                            "A hľa, ja som s\u00A0vami po\u00A0všetky dni až do\u00A0skončenia sveta.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "B", "", "Mk 16, 15-20",
                    "Choďte do\u00A0celého sveta a hlásajte evanjelium",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Ježiš sa zjavil Jedenástim a povedal im: \"Choďte do\u00A0celého sveta a hlásajte evanjelium všetkému stvoreniu.<br>" +
                            "Kto uverí a dá sa pokrstiť, bude spasený; ale kto neuverí, bude odsúdený.<br>" +
                            "A tých, čo uveria, budú sprevádzať tieto znamenia: v\u00A0mojom mene budú vyháňať zlých duchov, budú hovoriť novými jazykmi, hady budú brať do\u00A0rúk a ak niečo smrtonosné vypijú, neuškodí im; na\u00A0chorých budú vkladať ruky a tí ozdravejú.\"<br>" +
                            "Keď im to Pán Ježiš povedal, vzatý bol do\u00A0neba a zasadol po\u00A0pravici Boha.<br>" +
                            "Oni sa rozišli a všade kázali. Pán im pomáhal a ich slová potvrdzoval znameniami, ktoré ich sprevádzali.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "C", "", "Lk 24, 46-53",
                    "Ako ich žehnal, vznášal sa do\u00A0neba",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Tak je napísané, že Mesiáš bude trpieť a tretieho dňa vstane z\u00A0mŕtvych a v\u00A0jeho mene sa bude všetkým národom, počnúc od\u00A0Jeruzalema, hlásať pokánie na\u00A0odpustenie hriechov. Vy ste toho svedkami.<br>" +
                            "Hľa, ja na\u00A0vás zošlem, čo môj Otec prisľúbil. Preto zostaňte v\u00A0meste, kým nebudete vystrojení mocou z\u00A0výsosti!\"<br>" +
                            "Potom ich vyviedol von až k\u00A0Betánii, zdvihol ruky a požehnal ich. Ako ich žehnal, vzdialil sa od\u00A0nich a vznášal sa do\u00A0neba. Oni sa mu klaňali a s\u00A0veľkou radosťou sa vrátili do\u00A0Jeruzalema. Stále boli v\u00A0chráme a velebili Boha.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"8gkp", "A", "", "Mt 25, 31-46",
                    "Čokoľvek ste urobili jednému z\u00A0týchto mojich najmenších bratov, mne ste urobili",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Až príde Syn človeka vo\u00A0svojej sláve a s\u00A0ním všetci anjeli, zasadne na\u00A0trón svojej slávy. Vtedy sa pred\u00A0ním zhromaždia všetky národy a on oddelí jedných od\u00A0druhých, ako pastier oddeľuje ovce od\u00A0capov. Ovce si postaví sprava a capov zľava.<br>" +
                            "Potom Kráľ povie tým, čo budú po\u00A0jeho pravici: ‚Poďte, požehnaní môjho Otca, zaujmite kráľovstvo, ktoré je pre\u00A0vás pripravené od\u00A0stvorenia sveta. Lebo som bol hladný a dali ste mi jesť; bol som smädný a dali ste mi piť; bol som pocestný a pritúlili ste ma; bol som nahý a priodeli ste ma; bol som chorý a navštívili ste ma; bol som vo\u00A0väzení a prišli ste ku\u00A0mne.'<br>" +
                            "Vtedy mu spravodliví povedia: ‚Pane, a kedy sme ťa videli hladného a nakŕmili sme ťa, alebo smädného a dali sme ti piť? Kedy sme ťa videli ako pocestného a pritúlili sme ťa, alebo nahého a priodeli sme ťa? Kedy sme ťa videli chorého alebo vo\u00A0väzení a prišli sme k\u00A0tebe?'<br>" +
                            "Kráľ im odpovie: ‚Veru, hovorím vám: Čokoľvek ste urobili jednému z\u00A0týchto mojich najmenších bratov, mne ste urobili.'<br>" +
                            "Potom povie aj tým, čo budú zľava: ‚Odíďte odo\u00A0mňa, zlorečení, do\u00A0večného ohňa, ktorý je pripravený diablovi a jeho anjelom! Lebo som bol hladný, a nedali ste mi jesť; bol som smädný, a nedali ste mi piť; bol som pocestný, a nepritúlili ste ma; bol som nahý, a nepriodeli ste ma; bol som chorý a vo\u00A0väzení, a nenavštívili ste ma.'<br>" +
                            "Vtedy mu aj oni povedia: ‚Pane, a kedy sme ťa videli hladného alebo smädného, alebo ako pocestného, alebo nahého, alebo chorého, alebo vo\u00A0väzení a neposlúžili sme ti?' Vtedy im on odpovie: ‚Veru, hovorím vám: Čokoľvek ste neurobili jednému z\u00A0týchto najmenších, ani mne ste to neurobili.'<br>" +
                            "A pôjdu títo do\u00A0večného trápenia, kým spravodliví do\u00A0večného života.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "B", "", "Jn 18, 33b-37",
                    "Sám hovoríš, že som kráľ",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Pilát sa spýtal Ježiša: \"Si židovský kráľ?\"<br>" +
                            "Ježiš odpovedal: \"Hovoríš to sám od\u00A0seba, alebo ti to iní povedali o\u00A0mne?\"<br>" +
                            "Pilát odvetil: \"Vari som ja Žid? Tvoj národ a veľkňazi mi ťa vydali. Čo si vykonal?\"<br>" +
                            "Ježiš povedal: \"Moje kráľovstvo nie je z\u00A0tohto sveta. Keby moje kráľovstvo bolo z\u00A0tohto sveta, moji služobníci by sa bili, aby som nebol vydaný Židom. Lenže moje kráľovstvo nie je stadiaľto.\"<br>" +
                            "Pilát mu povedal: \"Tak predsa si kráľ?\"<br>" +
                            "Ježiš odpovedal: \"Sám hovoríš, že som kráľ. Ja som sa na\u00A0to narodil a na\u00A0to som prišiel na\u00A0svet, aby som vydal svedectvo pravde. Každý, kto je z\u00A0pravdy, počúva môj hlas.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "C", "", "Lk 23, 35b-43",
                    "Ježišu, spomeň si na\u00A0mňa, keď prídeš do\u00A0svojho kráľovstva",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Poprední muži sa posmievali Ježišovi a vraveli: \"Iných zachraňoval, nech zachráni aj seba, ak je Boží Mesiáš, ten vyvolenec.\" Aj vojaci sa mu posmievali. Chodili k\u00A0nemu, podávali mu ocot a hovorili: \"Zachráň sa, ak si židovský kráľ!\"<br>" +
                            "Nad ním bol nápis: \"Toto je židovský kráľ.\"<br>" +
                            "A jeden zo\u00A0zločincov, čo viseli na\u00A0kríži, sa mu rúhal: \"Nie si ty Mesiáš?! Zachráň seba i nás!\"<br>" +
                            "Ale druhý ho zahriakol: \"Ani ty sa nebojíš Boha, hoci si odsúdený na\u00A0to isté? Lenže my spravodlivo, lebo dostávame, čo sme si skutkami zaslúžili. Ale on neurobil nič zlé.\"<br>" +
                            "Potom povedal: \"Ježišu, spomeň si na\u00A0mňa, keď prídeš do\u00A0svojho kráľovstva.\"<br>" +
                            "On mu odpovedal: \"Veru, hovorím ti: Dnes budeš so\u00A0mnou v\u00A0raji.\"<br>" +
                            "Počuli sme slovo Pánovo."},
//8. decembra - Nepoškvrnené počatie Panny Márie
            {"9gkp", "", "", "Lk 1, 26-38",
                    "Počneš a porodíš syna",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Boh poslal anjela Gabriela do\u00A0galilejského mesta, ktoré sa volá Nazaret, k\u00A0panne zasnúbenej mužovi z\u00A0rodu Dávidovho, menom Jozefovi. A meno panny bolo Mária.<br>" +
                            "Anjel prišiel k\u00A0nej a povedal: \"Zdravas', milosti plná, Pán s\u00A0tebou.\"<br>" +
                            "Ona sa nad\u00A0jeho slovami zarazila a rozmýšľala, čo znamená takýto pozdrav.<br>" +
                            "Anjel jej povedal: \"Neboj sa, Mária, našla si milosť u\u00A0Boha. Počneš a porodíš syna a dáš mu meno Ježiš. On bude veľký a bude sa volať Synom Najvyššieho. Pán, Boh, mu dá trón jeho otca Dávida, naveky bude kraľovať nad\u00A0Jakubovým rodom a jeho kráľovstvu nebude konca.\"<br>" +
                            "Mária povedala anjelovi: \"Ako sa to stane, veď ja muža nepoznám?\"<br>" +
                            "Anjel jej odpovedal: \"Duch Svätý zostúpi na\u00A0teba a moc Najvyššieho ťa zatieni. A preto aj dieťa bude sa volať svätým, bude to Boží Syn. Aj Alžbeta, tvoja príbuzná, počala syna v\u00A0starobe. Už je v\u00A0šiestom mesiaci. A hovorili o\u00A0nej, že je neplodná! Lebo Bohu nič nie je nemožné.\"<br>" +
                            "Mária povedala: \"Hľa, služobnica Pána, nech sa mi stane podľa tvojho slova.\"<br>" +
                            "Anjel potom od\u00A0nej odišiel.<br>" +
                            "Počuli sme slovo Pánovo."},
            //Svätej rodiny
            {"10gkp", "A", "", "Mt 2, 13-15. 19-23",
                    "Vezmi dieťa i jeho matku a ujdi do\u00A0Egypta",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Po odchode mudrcov sa Jozefovi vo\u00A0sne zjavil Pánov anjel a povedal: \"Vstaň, vezmi so\u00A0sebou dieťa i jeho matku, ujdi do\u00A0Egypta a zostaň tam, kým ti nedám vedieť, lebo Herodes bude hľadať dieťa, aby ho zmárnil.\"<br>" +
                            "On vstal, vzal za\u00A0noci dieťa i jeho matku a odišiel do\u00A0Egypta. Tam zostal až do\u00A0Herodesovej smrti, aby sa splnilo, čo povedal Pán ústami proroka: \"Z Egypta som povolal svojho syna.\"<br>" +
                            "Po Herodesovej smrti sa Pánov anjel zjavil vo\u00A0sne Jozefovi v\u00A0Egypte a povedal mu: \"Vstaň, vezmi so\u00A0sebou dieťa i jeho matku a choď do\u00A0izraelskej krajiny. Tí, čo striehli na\u00A0život dieťaťa, už pomreli.\"<br>" +
                            "On vstal, vzal dieťa i jeho matku a vrátil sa do\u00A0izraelskej krajiny. Ale keď sa dopočul, že v\u00A0Judei kraľuje Archelaus namiesto svojho otca Herodesa, bál sa ta ísť. Varovaný vo\u00A0sne, odobral sa do\u00A0galilejského kraja. Keď ta prišiel, usadil sa v\u00A0meste, ktoré sa volá Nazaret, aby sa splnilo, čo predpovedali proroci: \"Budú ho volať Nazaretský.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "B", "", "Lk 2, 22-40",
                    "Chlapec rástol, plný múdrosti",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Keď uplynuli podľa Mojžišovho zákona dni ich očisťovania, priniesli Ježiša jeho rodičia do\u00A0Jeruzalema, aby ho predstavili Pánovi, ako je napísané v\u00A0Pánovom zákone: \"Všetko mužského rodu, čo otvára lono matky, bude zasvätené Pánovi,\" a aby obetovali, ako káže Pánov zákon, pár hrdličiek alebo dva holúbky.<br>" +
                            "V Jeruzaleme žil vtedy muž menom Simeon, človek spravodlivý a nábožný, ktorý očakával potechu Izraela, a Duch Svätý bol na\u00A0ňom. Jemu Duch Svätý vyjavil, že neumrie, kým neuvidí Pánovho Mesiáša.<br>" +
                            "Z vnuknutia Ducha prišiel do\u00A0chrámu. A keď rodičia prinášali dieťa Ježiša, aby splnili, čo o\u00A0ňom predpisoval zákon, vzal ho aj on do\u00A0svojho náručia a velebil Boha slovami: \"Teraz prepustíš, Pane, svojho služobníka v\u00A0pokoji podľa svojho slova, lebo moje oči uvideli tvoju spásu, ktorú si pripravil pred\u00A0tvárou všetkých národov: svetlo na\u00A0osvietenie pohanov a slávu Izraela, tvojho ľudu.\"<br>" +
                            "Jeho otec a matka divili sa tomu, čo sa o\u00A0ňom hovorilo.<br>" +
                            "Simeon ich požehnal a Márii, jeho matke, povedal: \"On je ustanovený na\u00A0pád a na\u00A0povstanie pre\u00A0mnohých v\u00A0Izraeli a na\u00A0znamenie, ktorému budú odporovať, – a tvoju vlastnú dušu prenikne meč –, aby vyšlo najavo zmýšľanie mnohých sŕdc.\"<br>" +
                            "Žila vtedy aj prorokyňa Anna, Fanuelova dcéra, z\u00A0Aserovho kmeňa. Bola už vo\u00A0vysokom veku. Od\u00A0svojho panenstva žila so\u00A0svojím mužom sedem rokov, potom ako vdova do\u00A0osemdesiateho štvrtého roku. Z\u00A0chrámu neodchádzala, vo\u00A0dne v\u00A0noci slúžila Bohu pôstom a modlitbami. Práve v\u00A0tú chvíľu prišla aj ona, velebila Boha a hovorila o\u00A0ňom všetkým, čo očakávali vykúpenie Jeruzalema.<br>" +
                            "A keď vykonali všetko podľa Pánovho zákona, vrátili sa do\u00A0Galiley, do\u00A0svojho mesta Nazareta.<br>" +
                            "Chlapec rástol a mocnel, plný múdrosti, a Božia milosť bola na\u00A0ňom.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Lk 2, 22. 39-40",
                    "Chlapec rástol, plný múdrosti",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Keď uplynuli podľa Mojžišovho zákona dni ich očisťovania, priniesli Ježiša jeho rodičia do\u00A0Jeruzalema, aby ho predstavili Pánovi.<br>" +
                            "A keď vykonali všetko podľa Pánovho zákona, vrátili sa do\u00A0Galiley, do\u00A0svojho mesta Nazareta.<br>" +
                            "Chlapec rástol a mocnel, plný múdrosti, a Božia milosť bola na\u00A0ňom.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "C", "", "Lk 2, 41-52",
                    "Rodičia našli Ježiša medzi učiteľmi",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježišovi rodičia chodievali každý rok do\u00A0Jeruzalema na\u00A0veľkonočné sviatky. Keď mal dvanásť rokov, tiež išli, ako bývalo na\u00A0sviatky zvykom. A keď sa dni slávností skončili a oni sa vracali domov, zostal chlapec Ježiš v\u00A0Jeruzaleme, čo jeho rodičia nezbadali. Nazdávali sa, že je v\u00A0sprievode. Prešli deň cesty a hľadali ho medzi príbuznými a známymi. No nenašli. Vrátili sa teda do\u00A0Jeruzalema a tam ho hľadali.<br>" +
                            "Po troch dňoch ho našli v\u00A0chráme. Sedel medzi učiteľmi, počúval ich a kládol im otázky. Všetci, čo ho počuli, žasli nad\u00A0jeho rozumnosťou a odpoveďami.<br>" +
                            "Keď ho zazreli, stŕpli od\u00A0údivu a Matka mu povedala: \"Syn môj, čo si nám to urobil? Pozri, tvoj otec i ja sme ťa s\u00A0bolesťou hľadali!\"<br>" +
                            "On im odpovedal: \"Prečo ste ma hľadali? Nevedeli ste, že mám byť tam, kde ide o\u00A0môjho Otca?\" Ale oni nepochopili slovo, ktoré im hovoril.<br>" +
                            "Potom sa s\u00A0nimi vrátil do\u00A0Nazareta a bol im poslušný.<br>" +
                            "A jeho matka zachovávala všetky slová vo\u00A0svojom srdci.<br>" +
                            "A Ježiš sa vzmáhal v\u00A0múdrosti, veku a v\u00A0obľube u\u00A0Boha i u\u00A0ľudí.<br>" +
                            "Počuli sme slovo Pánovo."},
//Krst Krista Pána
            {"11gkp", "A", "", "Mt 3, 13-17",
                    "Keď bol Ježiš pokrstený, videl Božieho Ducha, ako prichádzal nad\u00A0neho",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš prišiel z\u00A0Galiley k\u00A0Jordánu za\u00A0Jánom, aby sa mu dal pokrstiť. Ale Ján mu odporoval a hovoril: \"Ja by som sa mal dať tebe pokrstiť, a ty prichádzaš ku\u00A0mne?\"<br>" +
                            "Ježiš mu však povedal: \"Len to nechaj, lebo sa patrí, aby sme splnili všetko, čo je spravodlivé.\" Potom mu už neodporoval.<br>" +
                            "Keď bol Ježiš pokrstený, hneď vystúpil z\u00A0vody. Vtom sa mu otvorilo nebo a on videl Božieho Ducha, ktorý ako holubica zostupoval a prichádzal nad\u00A0neho. A z\u00A0neba zaznel hlas: \"Toto je môj milovaný Syn, v\u00A0ktorom mám zaľúbenie.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "B", "", "Mk 1, 7-11",
                    "Ty si môj milovaný Syn, v\u00A0tebe mám zaľúbenie",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Ján hlásal: \"Po mne prichádza mocnejší, ako som ja. Ja nie som hoden ani zohnúť sa a rozviazať mu remienok na\u00A0obuvi. Ja som vás krstil vodou, ale on vás bude krstiť Duchom Svätým.\"<br>" +
                            "V tých dňoch prišiel Ježiš z\u00A0galilejského Nazareta a Ján ho pokrstil v\u00A0Jordáne. Vtom, ako vystupoval z\u00A0vody, videl otvorené nebo a Ducha, ktorý ako holubica zostupoval na\u00A0neho. A z\u00A0neba zaznel hlas: \"Ty si môj milovaný Syn, v\u00A0tebe mám zaľúbenie.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"", "C", "", "Lk 3, 15-16. 21-22",
                    "Keď bol Ježiš pokrstený a modlil sa, otvorilo sa nebo",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ľud žil v\u00A0očakávaní a všetci si o\u00A0Jánovi v\u00A0duchu mysleli, že azda on je Mesiáš. Ale Ján dal odpoveď všetkým: \"Ja vás krstím vodou. No prichádza mocnejší, ako som ja. Ja nie som hoden rozviazať mu remienok na\u00A0obuvi. On vás bude krstiť Duchom Svätým a ohňom.\"<br>" +
                            "Keď sa všetok ľud dával krstiť a keď bol pokrstený aj Ježiš a modlil sa, otvorilo sa nebo, zostúpil na\u00A0neho Duch Svätý v\u00A0telesnej podobe ako holubica a z\u00A0neba zaznel hlas: \"Ty si môj milovaný Syn, v\u00A0tebe mám zaľúbenie.\"<br>" +
                            "Počuli sme slovo Pánovo."},

    };

    String[][] evanjelium1 = {
            //2. nedeľa po\u00A0NP
            {"", "", "", "Jn 1, 1-18",
                    "Slovo sa telom stalo a prebývalo medzi nami",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Na počiatku bolo Slovo a Slovo bolo u\u00A0Boha a to Slovo bolo Boh.<br>" +
                            "Ono bolo na\u00A0počiatku u\u00A0Boha. Všetko povstalo skrze neho a bez\u00A0neho nepovstalo nič z\u00A0toho, čo povstalo. V\u00A0ňom bol život a život bol svetlom ľudí. A svetlo vo\u00A0tmách svieti, a tmy ho neprijali.<br>" +
                            "Bol človek, ktorého poslal Boh, volal sa Ján. Prišiel ako svedok vydať svedectvo o\u00A0svetle, aby skrze neho všetci uverili. On sám nebol svetlo, prišiel iba vydať svedectvo o\u00A0svetle.<br>" +
                            "Pravé svetlo, ktoré osvecuje každého človeka, prišlo na\u00A0svet. Bol na\u00A0svete a svet povstal skrze neho, a svet ho nepoznal. Prišiel do\u00A0svojho vlastného, a vlastní ho neprijali.<br>" +
                            "Ale tým, ktorí ho prijali, dal moc stať sa Božími deťmi: tým, čo uverili v\u00A0jeho meno, čo sa nenarodili ani z\u00A0krvi, ani z\u00A0vôle tela, ani z\u00A0vôle muža, ale z\u00A0Boha.<br>" +
                            "A Slovo sa telom stalo a prebývalo medzi nami. A my sme uvideli jeho slávu, slávu, akú má od\u00A0Otca jednorodený Syn, plný milosti a pravdy.<br>" +
                            "Ján o\u00A0ňom vydal svedectvo a volal: \"Toto je ten, o\u00A0ktorom som hovoril: Ten, čo príde po\u00A0mne, je predo\u00A0mnou, lebo bol prv ako ja.\"<br>" +
                            "Z jeho plnosti sme my všetci dostali milosť za\u00A0milosťou. Lebo ak zákon bol daný skrze Mojžiša, milosť a pravda prišli skrze Ježiša Krista.<br>" +
                            "Boha nikto nikdy nevidel. Jednorodený Boh, ktorý je v\u00A0lone Otca, ten o\u00A0ňom priniesol zvesť.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Jn 1, 1-5. 9-14",
                    "Na počiatku bolo Slovo a Slovo bolo u\u00A0Boha a to Slovo bolo Boh.",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ono bolo na\u00A0počiatku u\u00A0Boha. Všetko povstalo skrze neho a bez\u00A0neho nepovstalo nič z\u00A0toho, čo povstalo. V\u00A0ňom bol život a život bol svetlom ľudí. A svetlo vo\u00A0tmách svieti, a tmy ho neprijali. Pravé svetlo, ktoré osvecuje každého človeka, prišlo na\u00A0svet. Bol na\u00A0svete a svet povstal skrze neho, a svet ho nepoznal.<br>" +
                            "Prišiel do\u00A0svojho vlastného, a vlastní ho neprijali. Ale tým, ktorí ho prijali, dal moc stať sa Božími deťmi: tým, čo uverili v\u00A0jeho meno, čo sa nenarodili ani z\u00A0krvi, ani z\u00A0vôle tela, ani z\u00A0vôle muža, ale z\u00A0Boha.<br>" +
                            "A Slovo sa telom stalo a prebývalo medzi nami. A my sme uvideli jeho slávu, slávu, akú má od\u00A0Otca jednorodený Syn, plný milosti a pravdy.<br>" +
                            "Počuli sme slovo Pánovo."},

            {"01gk", "", "", "Lk 2, 16-21",
                    "Našli Máriu a Jozefa i dieťa. Po\u00A0ôsmich dňoch dali mu meno Ježiš",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Pastieri sa poponáhľali do\u00A0Betlehema a našli Máriu a Jozefa i dieťa uložené v\u00A0jasliach. Keď ich videli, vyrozprávali, čo im bolo povedané o\u00A0tomto dieťati. A všetci, ktorí to počúvali, divili sa nad\u00A0tým, čo im pastieri rozprávali. Ale Mária zachovávala všetky tieto slová vo\u00A0svojom srdci a premýšľala o\u00A0nich.<br>" +
                            "Pastieri sa potom vrátili a oslavovali a chválili Boha za\u00A0všetko, čo počuli a videli, ako im bolo povedané.<br>" +
                            "Po ôsmich dňoch, keď ho bolo treba obrezať, dali mu meno Ježiš, ktorým ho anjel nazval skôr, ako sa počal v\u00A0živote matky.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"2", "", "", "Jn 1, 19-28",
                    "On prichádza po\u00A0mne",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Toto je Jánovo svedectvo: Keď Židia z\u00A0Jeruzalema poslali k\u00A0nemu kňazov a levitov, aby sa ho pýtali: \"Kto si ty?\", on vyznal a nič nezaprel. Vyznal: \"Ja nie som Mesiáš.\"<br>" +
                            "\"Čo teda,\" pýtali sa ho, \"si Eliáš?\"<br>" +
                            "Povedal: \"Nie som.\"<br>" +
                            "\"Si prorok?\"<br>" +
                            "Odpovedal: \"Nie.\"<br>" +
                            "Vraveli mu teda: \"Kto si? Aby sme mohli dať odpoveď tým, čo nás poslali. Čo hovoríš o\u00A0sebe?\"<br>" +
                            "Povedal: \"Ja som hlas volajúceho na\u00A0púšti: ‚Vyrovnajte cestu Pánovi,' ako povedal prorok Izaiáš.\"<br>" +
                            "Tí vyslaní boli spomedzi farizejov. A pýtali sa ho: \"Prečo teda krstíš, keď nie si Mesiáš ani Eliáš ani prorok?\"<br>" +
                            "Ján im odpovedal: \"Ja krstím vodou. Medzi vami stojí ten, ktorého nepoznáte. On prichádza po\u00A0mne a ja nie som hoden rozviazať mu remienok na\u00A0obuvi.\"<br>" +
                            "To sa stalo v\u00A0Betánii za\u00A0Jordánom, kde Ján krstil.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"3", "", "", "Jn 1, 29-34",
                    "Hľa, Boží Baránok, ktorý sníma hriech sveta",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Keď Ján videl, ako k\u00A0nemu prichádza Ježiš, zvolal: \"Hľa, Boží Baránok, ktorý sníma hriech sveta. Toto je ten, o\u00A0ktorom som hovoril: Po\u00A0mne prichádza muž, ktorý je predo\u00A0mnou, lebo bol prv ako ja. Ani ja som ho nepoznal, ale preto som prišiel a krstím vodou, aby sa on stal známym Izraelu.\"<br>" +
                            "Ján vydal svedectvo: \"Videl som Ducha, ktorý ako holubica zostupoval z\u00A0neba a spočinul na\u00A0ňom. Ani ja som ho nepoznal, ale ten, čo ma poslal krstiť vodou, mi povedal: ‚Na koho uvidíš zostupovať Ducha a spočinúť na\u00A0ňom, to je ten, čo krstí Duchom Svätým.' A ja som to videl a vydávam svedectvo, že toto je Boží Syn.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"03a", "", "", "Lk 2, 21-24",
                    "Dali mu meno Ježiš",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Po ôsmich dňoch, keď ho bolo treba obrezať, dali mu meno Ježiš, ktorým ho anjel nazval skôr, ako sa počal v\u00A0živote matky.<br>" +
                            "Keď uplynuli podľa Mojžišovho zákona dni ich očisťovania, priniesli ho do\u00A0Jeruzalema, aby ho predstavili Pánovi, ako je napísané v\u00A0Pánovom zákone: \"Všetko mužského rodu, čo otvára lono matky, bude zasvätené Pánovi,\" a aby obetovali, ako káže Pánov zákon, pár hrdličiek alebo dva holúbky.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"4", "", "", "Jn 1, 35-42",
                    "Našli sme Mesiáša",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ján stál s\u00A0dvoma zo\u00A0svojich učeníkov. Keď videl Ježiša ísť okolo, povedal: \"Hľa, Boží Baránok.\"<br>" +
                            "Tí dvaja učeníci počuli, čo hovorí, a išli za\u00A0Ježišom. Ježiš sa obrátil a keď videl, že idú za\u00A0ním, opýtal sa ich: \"Čo hľadáte?\"<br>" +
                            "Oni mu povedali: \"Rabbi – čo v\u00A0preklade znamená: Učiteľ –, kde bývaš?\"<br>" +
                            "Odpovedal im: \"Poďte a uvidíte!\"<br>" +
                            "Šli teda, videli, kde býva, a zostali v\u00A0ten deň u\u00A0neho. Boli asi štyri hodiny popoludní.<br>" +
                            "Jeden z\u00A0tých dvoch, čo to počuli od\u00A0Jána a nasledovali Ježiša, bol Ondrej, brat Šimona Petra. On hneď vyhľadal svojho brata Šimona a povedal mu: \"Našli sme Mesiáša,\" čo v\u00A0preklade znamená Kristus. A priviedol ho k\u00A0Ježišovi.<br>" +
                            "Ježiš sa naňho zahľadel a povedal: \"Ty si Šimon, syn Jánov, ale budeš sa volať Kéfas,\" čo v\u00A0preklade znamená Peter.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"5", "", "", "Jn 1, 43-51",
                    "Ty si Boží Syn, ty si kráľ Izraela!",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš sa rozhodol odísť do\u00A0Galiley. Stretol Filipa a povedal mu: \"Poď za\u00A0mnou!\" Filip bol z\u00A0Betsaidy, z\u00A0Ondrejovho a Petrovho mesta. Filip sa stretol s\u00A0Natanaelom a povedal mu: \"Našli sme toho, o\u00A0ktorom písal Mojžiš v\u00A0Zákone a Proroci, Ježiša, Jozefovho syna z\u00A0Nazareta.\"<br>" +
                            "Natanael mu vravel: \"Môže byť z\u00A0Nazareta niečo dobré?!\" Filip mu odpovedal: \"Poď a uvidíš!\"<br>" +
                            "Keď Ježiš videl prichádzať Natanaela, povedal o\u00A0ňom: \"Toto je pravý Izraelita, v\u00A0ktorom niet lesti.\"<br>" +
                            "Natanael sa ho opýtal: \"Odkiaľ ma poznáš?\"<br>" +
                            "Ježiš mu vravel: \"Videl som ťa prv, ako ťa Filip zavolal, keď si bol pod\u00A0figovníkom.\"<br>" +
                            "Natanael mu povedal: \"Rabbi, ty si Boží Syn, ty si kráľ Izraela!\"<br>" +
                            "Ježiš mu odvetil: \"Veríš preto, že som ti povedal: Videl som ťa pod\u00A0figovníkom? Uvidíš väčšie veci ako toto.\"<br>" +
                            "Potom mu povedal: \"Veru, veru, hovorím vám: Uvidíte otvorené nebo a Božích anjelov vystupovať a zostupovať na\u00A0Syna človeka.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"06gk", "", "", "Mt 2, 1-12",
                    "Prišli sme z\u00A0východu pokloniť sa kráľovi",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Keď sa za\u00A0čias kráľa Herodesa v\u00A0judejskom Betleheme narodil Ježiš, prišli do\u00A0Jeruzalema mudrci od\u00A0východu a pýtali sa: \"Kde je ten novonarodený židovský kráľ? Videli sme jeho hviezdu na\u00A0východe a prišli sme sa mu pokloniť.\"<br>" +
                            "Keď to počul kráľ Herodes, rozrušil sa a celý Jeruzalem s\u00A0ním. Zvolal všetkých veľkňazov a zákonníkov ľudu a vyzvedal sa od\u00A0nich, kde sa má narodiť Mesiáš.<br>" +
                            "Oni mu povedali: \"V judejskom Betleheme, lebo tak píše prorok: ‚A ty, Betlehem, v\u00A0judejskej krajine, nijako nie si najmenší medzi poprednými mestami Judey, lebo z\u00A0teba vyjde vojvoda, ktorý bude spravovať môj ľud, Izrael.'\" Tu si dal Herodes potajomky zavolať mudrcov a podrobne sa ich povypytoval, kedy sa im zjavila hviezda. Potom ich poslal do\u00A0Betlehema a povedal: \"Choďte a dôkladne sa vypytujte na\u00A0dieťa. Keď ho nájdete, oznámte mi, aby som sa mu aj ja šiel pokloniť.\"<br>" +
                            "Oni kráľa vypočuli a odišli. A hľa, hviezda, ktorú videli na\u00A0východe, išla pred\u00A0nimi, až sa zastavila nad\u00A0miestom, kde bolo dieťa. Ako zbadali hviezdu, nesmierne sa zaradovali.<br>" +
                            "Vošli do\u00A0domu a uvideli dieťa s\u00A0Máriou, jeho matkou, padli na\u00A0zem a klaňali sa mu. Potom otvorili svoje pokladnice a dali mu dary: zlato, kadidlo a myrhu. A keď vo\u00A0sne dostali pokyn, aby sa nevracali k\u00A0Herodesovi, inou cestou sa vrátili do\u00A0svojej krajiny.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"7", "", "", "Mt 4, 12-17. 23-25",
                    "Priblížilo sa nebeské kráľovstvo",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Keď sa Ježiš dopočul, že Jána uväznili, odobral sa do\u00A0Galiley. Opustil Nazaret a prišiel bývať do\u00A0pobrežného mesta Kafarnaum, v\u00A0končinách Zabulon a Neftali, aby sa splnilo, čo povedal prorok Izaiáš: \"Krajina Zabulon a krajina Neftali, na\u00A0ceste k\u00A0moru, za\u00A0Jordánom, Galilea pohanov! Ľud bývajúci v\u00A0temnotách uvidel veľké svetlo. Svetlo zažiarilo tým, čo sedeli v\u00A0temnom kraji smrti.\"<br>" +
                            "Od tej chvíle začal Ježiš hlásať: \"Robte pokánie, lebo sa priblížilo nebeské kráľovstvo.\"<br>" +
                            "A Ježiš chodil po\u00A0celej Galilei, učil v\u00A0ich synagógach, hlásal evanjelium o\u00A0kráľovstve a uzdravoval každý neduh a každú chorobu medzi ľudom.<br>" +
                            "Povesť o\u00A0ňom sa rozniesla po\u00A0celej Sýrii. Prinášali k\u00A0nemu všetkých chorých, postihnutých rozličnými neduhmi a trápením, posadnutých zlými duchmi, námesačníkov a ochrnutých, a on ich uzdravoval. A šli za\u00A0ním veľké zástupy z\u00A0Galiley a Dekapola, z\u00A0Jeruzalema, Judey a Zajordánska.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"8", "", "", "Mk 6, 34-44",
                    "Ježiš rozmnožením chlebov ukazuje, že je prorok",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Keď Ježiš videl veľký zástup, zľutoval sa nad\u00A0nimi, lebo boli ako ovce bez\u00A0pastiera. A začal ich učiť mnohým veciam.<br>" +
                            "Keď už bolo veľa hodín, pristúpili k\u00A0nemu jeho učeníci a hovorili: \"Toto miesto je pusté a je už veľa hodín. Rozpusť ich, nech sa rozídu do\u00A0okolitých osád a dedín kúpiť si niečo na\u00A0jedenie.\"<br>" +
                            "On im odpovedal: \"Vy im dajte jesť!\"<br>" +
                            "Vraveli mu: \"Máme ísť nakúpiť za\u00A0dvesto denárov chleba a dať im jesť?\"<br>" +
                            "Opýtal sa ich: \"Koľko máte chlebov? Choďte sa pozrieť!\"<br>" +
                            "Keď to zistili, povedali: \"Päť a dve ryby.\"<br>" +
                            "Tu im rozkázal usadiť všetkých po\u00A0skupinách na\u00A0zelenú trávu. A posadali si v\u00A0skupinách po\u00A0sto a po\u00A0päťdesiat.<br>" +
                            "Potom vzal päť chlebov a dve ryby, pozdvihol oči k\u00A0nebu, dobrorečil, lámal chleby a dával svojim učeníkom, aby im ich rozdávali. Aj obe ryby rozdelil všetkým. Všetci jedli a nasýtili sa, ba ešte nazbierali dvanásť plných košov odrobín a zvyškov z\u00A0rýb. A tých, čo jedli chleby, bolo päťtisíc mužov.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"9", "", "", "Mk 6, 45-52",
                    "Videli ho kráčať po\u00A0mori",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Keď Ježiš nasýtil päťtisíc mužov, hneď prinútil svojich učeníkov, aby nastúpili na\u00A0loď a išli napred na\u00A0druhý breh k\u00A0Betsaide, kým on rozpustí ľud. Keď ich rozpustil, odišiel na\u00A0vrch modliť sa.<br>" +
                            "A keď sa zvečerilo, loď bola uprostred mora a on sám na\u00A0zemi. Videl ich, ako sa namáhajú pri\u00A0veslovaní, lebo vietor dul proti nim. A nad\u00A0ránom, kráčajúc po\u00A0mori blížil sa k\u00A0nim a chcel ich obísť.<br>" +
                            "Keď ho videli kráčať po\u00A0mori, mysleli si, že je to mátoha, a vykríkli; všetci ho totiž videli a zľakli sa. Ale on sa im hneď prihovoril: \"Vzchopte sa! To som ja, nebojte sa!\"<br>" +
                            "Vstúpil k\u00A0nim do\u00A0lode a vietor utíchol. A boli celí ohromení, lebo nepochopili, ako to bolo s\u00A0chlebmi; ich srdce bolo otupené.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"10", "", "", "Lk 4, 14-22a ",
                    "Dnes sa splnilo toto Písmo",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš sa v\u00A0sile Ducha vrátil do\u00A0Galiley a chýr o\u00A0ňom sa rozniesol po\u00A0celom kraji. Učil v\u00A0ich synagógach a všetci ho oslavovali.<br>" +
                            "Prišiel aj do\u00A0Nazareta, kde vyrástol. Podľa svojho zvyku vošiel v\u00A0sobotu do\u00A0synagógy a vstal, aby čítal. Podali mu knihu proroka Izaiáša. Keď knihu rozvinul, našiel miesto, kde bolo napísané: \"Duch Pána je nado mnou, lebo ma pomazal, aby som hlásal evanjelium chudobným. Poslal ma oznámiť zajatým, že budú prepustení, a slepým, že budú vidieť; utláčaných prepustiť na\u00A0slobodu a ohlásiť Pánov milostivý rok.\"<br>" +
                            "Potom knihu zvinul, vrátil ju sluhovi a sadol si. Oči všetkých v\u00A0synagóge sa upreli na\u00A0neho. A on im začal hovoriť: \"Dnes sa splnilo toto Písmo, ktoré ste práve počuli.\"<br>" +
                            "Všetci mu prisviedčali a divili sa milým slovám, čo vychádzali z\u00A0jeho úst.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"11", "", "", "Lk 5, 12-16",
                    "A malomocenstvo z\u00A0neho hneď zmizlo",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Keď bol Ježiš v\u00A0ktoromsi meste, zjavil sa muž plný malomocenstva. Len čo zbadal Ježiša, padol na\u00A0tvár a prosil ho: \"Pane, ak chceš, môžeš ma očistiť.\"<br>" +
                            "On vystrel ruku, dotkol sa ho a povedal: \"Chcem, buď čistý!\" A malomocenstvo z\u00A0neho hneď zmizlo.<br>" +
                            "A prikázal mu, že o\u00A0tom nesmie nikomu hovoriť, ale: \"Choď,\" povedal, \"ukáž sa kňazovi a prines za\u00A0svoje očistenie obetu, ako predpísal Mojžiš im na\u00A0svedectvo.\"<br>" +
                            "No zvesť o\u00A0ňom sa tým väčšmi šírila a schádzali sa veľké zástupy, aby ho počuli a dali sa uzdraviť zo\u00A0svojich chorôb. On sa však utiahol na\u00A0púšť a modlil sa.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"12", "", "", "Jn 3, 22-30",
                    "Ženíchov priateľ sa raduje zo\u00A0ženíchovho hlasu",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš prišiel so\u00A0svojimi učeníkmi do\u00A0judejskej krajiny. Tam s\u00A0nimi pobudol a krstil. Ale aj Ján krstil v\u00A0Enone, blízko Salima, lebo tam bolo veľa vody. Ľudia tam prichádzali a dávali sa krstiť. Ján vtedy ešte nebol vo\u00A0väzení.<br>" +
                            "Medzi Jánovými učeníkmi a istým Židom vznikla hádka o\u00A0očisťovaní. Prišli k\u00A0Jánovi a povedali mu: \"Rabbi, aj ten, čo bol s\u00A0tebou za\u00A0Jordánom, a ty si mu vydal svedectvo, tu krstí a všetci idú k\u00A0nemu.\"<br>" +
                            "Ján odpovedal: \"Človek si nemôže prisvojiť nič, ak mu to nebolo dané z\u00A0neba. Vy sami ste svedkami, že som povedal: Ja nie som Mesiáš, ale som poslaný pred\u00A0ním.<br>" +
                            "Ženích je ten, kto má nevestu. A ženíchov priateľ, ktorý je pri\u00A0ňom a počúva ho, veľmi sa raduje zo\u00A0ženíchovho hlasu. A táto moja radosť je úplná. On musí rásť a mňa musí ubúdať.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"20g+", "", "", "Mt 10, 28-33",
                    "Nebojte sa tých, čo zabíjajú telo",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim apoštolom: \"Nebojte sa tých, čo zabíjajú telo, ale dušu zabiť nemôžu. Skôr sa bojte toho, ktorý môže i dušu, i telo zahubiť v\u00A0pekle.<br>" +
                            "Nepredávajú sa dva vrabce za\u00A0halier? A predsa ani jeden z\u00A0nich nepadne na\u00A0zem bez\u00A0vedomia vášho Otca.<br>" +
                            "Vy však máte aj všetky vlasy na\u00A0hlave spočítané. Nebojte sa teda, vy ste cennejší ako mnoho vrabcov.<br>" +
                            "Každého, kto mňa vyzná pred\u00A0ľuďmi, aj ja vyznám pred\u00A0svojím Otcom, ktorý je na\u00A0nebesiach. Ale toho, kto mňa zaprie pred\u00A0ľuďmi, aj ja zapriem pred\u00A0svojím Otcom, ktorý je na\u00A0nebesiach.<br>" +
                            "Počuli sme slovo Pánovo."},

            {"25g", "", "", "Mk 16, 15-18",
                    "Choďte do\u00A0celého sveta a hlásajte evanjelium",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Ježiš sa zjavil Jedenástim a povedal im: \"Choďte do\u00A0celého sveta a hlásajte evanjelium všetkému stvoreniu. Kto uverí a dá sa pokrstiť, bude spasený; ale kto neuverí, bude odsúdený.<br>" +
                            "A tých, čo uveria, budú sprevádzať tieto znamenia: v\u00A0mojom mene budú vyháňať zlých duchov, budú hovoriť novými jazykmi, hady budú brať do\u00A0rúk a ak niečo smrtonosné vypijú, neuškodí im; na\u00A0chorých budú vkladať ruky a tí ozdravejú.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"26", "", "", "Lk 10, 1-9",
                    "Žatva je veľká, ale robotníkov málo",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Pán si vyvolil iných sedemdesiatich dvoch a po\u00A0dvoch ich poslal pred\u00A0sebou do\u00A0každého mesta a na\u00A0každé miesto, kam sa sám chystal ísť. A povedal im: \"Žatva je veľká, ale robotníkov málo. Preto proste Pána žatvy, aby poslal robotníkov na\u00A0svoju žatvu!<br>" +
                            "Choďte! Hľa, posielam vás ako baránkov medzi vlkov.<br>" +
                            "Nenoste mešec ani kapsu, ani obuv a cestou nikoho nepozdravujte!<br>" +
                            "Keď vojdete do\u00A0niektorého domu, najprv povedzte: ‚Pokoj tomuto domu!' Ak tam bude syn pokoja, váš pokoj na\u00A0ňom spočinie; ak nie, vráti sa k\u00A0vám. V\u00A0tom dome potom ostaňte, jedzte a pite, čo majú, lebo robotník si zaslúži svoju mzdu.<br>" +
                            "Neprechádzajte z\u00A0domu do\u00A0domu!<br>" +
                            "A keď prídete do\u00A0niektorého mesta a prijmú vás, jedzte, čo vám predložia, uzdravujte chorých, čo sú v\u00A0ňom, a povedzte im: ‚Priblížilo sa k\u00A0vám Božie kráľovstvo.'\"<br>" +
                            "Počuli sme slovo Pánovo."},


    };

    String[][] evanjelium2 = {
            {"02g", "", "", "Lk 2, 22-40",
                    "Chlapec rástol, plný múdrosti",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Keď uplynuli podľa Mojžišovho zákona dni ich očisťovania, priniesli Ježiša jeho rodičia do\u00A0Jeruzalema, aby ho predstavili Pánovi, ako je napísané v\u00A0Pánovom zákone: \"Všetko mužského rodu, čo otvára lono matky, bude zasvätené Pánovi,\" a aby obetovali, ako káže Pánov zákon, pár hrdličiek alebo dva holúbky.<br>" +
                            "V Jeruzaleme žil vtedy muž menom Simeon, človek spravodlivý a nábožný, ktorý očakával potechu Izraela, a Duch Svätý bol na\u00A0ňom. Jemu Duch Svätý vyjavil, že neumrie, kým neuvidí Pánovho Mesiáša.<br>" +
                            "Z vnuknutia Ducha prišiel do\u00A0chrámu. A keď rodičia prinášali dieťa Ježiša, aby splnili, čo o\u00A0ňom predpisoval zákon, vzal ho aj on do\u00A0svojho náručia a velebil Boha slovami: \"Teraz prepustíš, Pane, svojho služobníka v\u00A0pokoji podľa svojho slova, lebo moje oči uvideli tvoju spásu, ktorú si pripravil pred\u00A0tvárou všetkých národov: svetlo na\u00A0osvietenie pohanov a slávu Izraela, tvojho ľudu.\"<br>" +
                            "Jeho otec a matka divili sa tomu, čo sa o\u00A0ňom hovorilo.<br>" +
                            "Simeon ich požehnal a Márii, jeho matke, povedal: \"On je ustanovený na\u00A0pád a na\u00A0povstanie pre\u00A0mnohých v\u00A0Izraeli a na\u00A0znamenie, ktorému budú odporovať, – a tvoju vlastnú dušu prenikne meč –, aby vyšlo najavo zmýšľanie mnohých sŕdc.\"<br>" +
                            "Žila vtedy aj prorokyňa Anna, Fanuelova dcéra, z\u00A0Aserovho kmeňa. Bola už vo\u00A0vysokom veku. Od\u00A0svojho panenstva žila so\u00A0svojím mužom sedem rokov, potom ako vdova do\u00A0osemdesiateho štvrtého roku. Z\u00A0chrámu neodchádzala, vo\u00A0dne v\u00A0noci slúžila Bohu pôstom a modlitbami. Práve v\u00A0tú chvíľu prišla aj ona, velebila Boha a hovorila o\u00A0ňom všetkým, čo očakávali vykúpenie Jeruzalema.<br>" +
                            "A keď vykonali všetko podľa Pánovho zákona, vrátili sa do\u00A0Galiley, do\u00A0svojho mesta Nazareta.<br>" +
                            "Chlapec rástol a mocnel, plný múdrosti, a Božia milosť bola na\u00A0ňom.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Lk 2, 22-32",
                    "Chlapec rástol, plný múdrosti",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Keď uplynuli podľa Mojžišovho zákona dni ich očisťovania, priniesli Ježiša jeho rodičia do\u00A0Jeruzalema, aby ho predstavili Pánovi, ako je napísané v\u00A0Pánovom zákone: \"Všetko mužského rodu, čo otvára lono matky, bude zasvätené Pánovi,\" a aby obetovali, ako káže Pánov zákon, pár hrdličiek alebo dva holúbky.<br>" +
                            "V Jeruzaleme žil vtedy muž menom Simeon, človek spravodlivý a nábožný, ktorý očakával potechu Izraela, a Duch Svätý bol na\u00A0ňom. Jemu Duch Svätý vyjavil, že neumrie, kým neuvidí Pánovho Mesiáša.<br>" +
                            "Z vnuknutia Ducha prišiel do\u00A0chrámu. A keď rodičia prinášali dieťa Ježiša, aby splnili, čo o\u00A0ňom predpisoval zákon, vzal ho aj on do\u00A0svojho náručia a velebil Boha slovami: \"Teraz prepustíš, Pane, svojho služobníka v\u00A0pokoji podľa svojho slova, lebo moje oči uvideli tvoju spásu, ktorú si pripravil pred\u00A0tvárou všetkých národov: svetlo na\u00A0osvietenie pohanov a slávu Izraela, tvojho ľudu.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            /*{"11", "", "", "Jn 2, 1-11",
                    "Bola tam aj Ježišova matka",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "V Káne Galilejskej bola svadba. Bola tam aj Ježišova matka. Na\u00A0svadbu pozvali aj Ježiša a jeho učeníkov.<br>" +
                            "Keď sa minulo víno, povedala Ježišovi jeho matka: \"Nemajú vína.\"<br>" +
                            "Ježiš jej odpovedal: \"Čo mňa a teba do\u00A0toho, žena? Ešte neprišla moja hodina.\"<br>" +
                            "Jeho matka povedala obsluhujúcim: \"Urobte všetko, čo vám povie!\"<br>" +
                            "Stálo tam šesť kamenných nádob na\u00A0vodu, ktoré slúžili na\u00A0očisťovanie, ako bolo zvykom u\u00A0Židov, každá na\u00A0dve až tri miery. Ježiš im povedal: \"Naplňte nádoby vodou!\" A naplnili ich až po\u00A0okraj.<br>" +
                            "Potom im povedal: \"Teraz načrite a zaneste starejšiemu!\" A oni zaniesli.<br>" +
                            "Keď starejší ochutnal vodu premenenú na\u00A0víno – on nevedel, skade je, ale obsluhujúci, čo načierali vodu, to vedeli –, zavolal si ženícha a vravel mu: \"Každý človek podáva najprv dobré víno a horšie až potom, keď si hostia upili. Ty si zachoval dobré víno až doteraz.\"<br>" +
                            "Toto urobil Ježiš v\u00A0Káne Galilejskej ako prvé zo\u00A0znamení a zjavil svoju slávu. A jeho učeníci uverili v\u00A0neho.<br>" +
                            "Počuli sme slovo Pánovo."},*/
            {"14o", "", "", "Mk 16, 15-20",
                    "Choďte do\u00A0celého sveta a hlásajte evanjelium",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Ježiš sa zjavil Jedenástim a povedal im: \"Choďte do\u00A0celého sveta a hlásajte evanjelium všetkému stvoreniu.<br>" +
                            "Kto uverí a dá sa pokrstiť, bude spasený; ale kto neuverí, bude odsúdený.<br>" +
                            "A tých, čo uveria, budú sprevádzať tieto znamenia: v\u00A0mojom mene budú vyháňať zlých duchov, budú hovoriť novými jazykmi, hady budú brať do\u00A0rúk a ak niečo smrtonosné vypijú, neuškodí im; na\u00A0chorých budú vkladať ruky a tí ozdravejú.\"<br>" +
                            "Keď im to Pán Ježiš povedal, vzatý bol do\u00A0neba a zasadol po\u00A0pravici Boha.<br>" +
                            "Oni sa rozišli a všade kázali. Pán im pomáhal a ich slová potvrdzoval znameniami, ktoré ich sprevádzali.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"14g+", "", "", "Mk 16, 15-20",
                    "Choďte do\u00A0celého sveta a hlásajte evanjelium",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Ježiš sa zjavil Jedenástim a povedal im: \"Choďte do\u00A0celého sveta a hlásajte evanjelium všetkému stvoreniu.<br>" +
                            "Kto uverí a dá sa pokrstiť, bude spasený; ale kto neuverí, bude odsúdený.<br>" +
                            "A tých, čo uveria, budú sprevádzať tieto znamenia: v\u00A0mojom mene budú vyháňať zlých duchov, budú hovoriť novými jazykmi, hady budú brať do\u00A0rúk a ak niečo smrtonosné vypijú, neuškodí im; na\u00A0chorých budú vkladať ruky a tí ozdravejú.\"<br>" +
                            "Keď im to Pán Ježiš povedal, vzatý bol do\u00A0neba a zasadol po\u00A0pravici Boha.<br>" +
                            "Oni sa rozišli a všade kázali. Pán im pomáhal a ich slová potvrdzoval znameniami, ktoré ich sprevádzali.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"22g", "", "", "Mt 16, 13-19",
                    "Ty si Peter a na\u00A0tejto skale postavím svoju Cirkev",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Keď Ježiš prišiel do\u00A0okolia Cézarey Filipovej, pýtal sa svojich učeníkov: \"Za koho pokladajú ľudia Syna človeka?\"<br>" +
                            "Oni vraveli: \"Jedni za\u00A0Jána Krstiteľa, iní za\u00A0Eliáša a iní za\u00A0Jeremiáša alebo za\u00A0jedného z\u00A0prorokov.\"<br>" +
                            "\"A za\u00A0koho ma pokladáte vy?\", opýtal sa ich.<br>" +
                            "Odpovedal Šimon Peter: \"Ty si Mesiáš, Syn živého Boha.\"<br>" +
                            "Ježiš mu povedal: \"Blahoslavený si, Šimon, syn Jonášov, lebo ti to nezjavilo telo a krv, ale môj Otec, ktorý je na\u00A0nebesiach. A ja ti hovorím: Ty si Peter a na\u00A0tejto skale postavím svoju Cirkev a pekelné brány ju nepremôžu.<br>" +
                            "Tebe dám kľúče od\u00A0nebeského kráľovstva: čo zviažeš na\u00A0zemi, bude zviazané v\u00A0nebi, a čo rozviažeš na\u00A0zemi, bude rozviazané v\u00A0nebi.\"<br>" +
                            "Počuli sme slovo Pánovo."},
    };

    String[][] evanjelium3 = {};

    String[][] evanjelium4 = {
            {"25g", "", "", "Mk 16, 15-20",
                    "Choďte do\u00A0celého sveta a hlásajte evanjelium",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Ježiš sa zjavil Jedenástim a povedal im: \"Choďte do\u00A0celého sveta a hlásajte evanjelium všetkému stvoreniu.<br>" +
                            "Kto uverí a dá sa pokrstiť, bude spasený; ale kto neuverí, bude odsúdený.<br>" +
                            "A tých, čo uveria, budú sprevádzať tieto znamenia: v\u00A0mojom mene budú vyháňať zlých duchov, budú hovoriť novými jazykmi, hady budú brať do\u00A0rúk a ak niečo smrtonosné vypijú, neuškodí im; na\u00A0chorých budú vkladať ruky a tí ozdravejú.\"<br>" +
                            "Keď im to Pán Ježiš povedal, vzatý bol do\u00A0neba a zasadol po\u00A0pravici Boha.<br>" +
                            "Oni sa rozišli a všade kázali. Pán im pomáhal a ich slová potvrdzoval znameniami, ktoré ich sprevádzali.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"29g", "", "", "Mt 11, 25-30",
                    "Skryl si tieto veci pred\u00A0múdrymi a zjavil si ich maličkým",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "V tom čase Ježiš povedal: \"Zvelebujem ťa, Otče, Pán neba i zeme, že si tieto veci skryl pred\u00A0múdrymi a rozumnými a zjavil si ich maličkým. Áno, Otče, tebe sa tak páčilo.<br>" +
                            "Môj Otec mi odovzdal všetko. A nik nepozná Syna, iba Otec, ani Otca nepozná nik, iba Syn a ten, komu to Syn bude chcieť zjaviť.<br>" +
                            "Poďte ku\u00A0mne všetci, ktorí sa namáhate a ste preťažení, a ja vás posilním. Vezmite na\u00A0seba moje jarmo a učte sa odo\u00A0mňa, lebo som tichý a pokorný srdcom; a nájdete odpočinok pre\u00A0svoju dušu.<br>" +
                            "Moje jarmo je príjemné a moje bremeno ľahké.\"<br>" +
                            "Počuli sme slovo Pánovo."},
    };

    String[][] evanjelium5 = {
            {"01", "", "", "Mt 13, 54-58",
                    "Vari to nie je tesárov syn?",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš prišiel do\u00A0svojej vlasti a učil ich v\u00A0synagóge. Oni sa divili a hovorili: \"Skade má tento takú múdrosť a zázračnú moc? Vari to nie je tesárov syn? Nevolá sa jeho matka Mária a jeho bratia Jakub a Jozef, Šimon a Júda? A nie sú u\u00A0nás všetky jeho sestry? Skadeže má toto všetko?\" A pohoršovali sa na\u00A0ňom.<br>" +
                            "Ale Ježiš im povedal: \"Proroka si všade uctia, len nie v\u00A0jeho vlasti a v\u00A0jeho dome.\"<br>" +
                            "A pre\u00A0ich neveru tam neurobil veľa zázrakov.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"03g", "", "", "Jn 14, 6-14",
                    "Toľký čas som s\u00A0vami a nepoznáš ma?!",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal Tomášovi: \"Ja som cesta, pravda a život. Nik nepríde k\u00A0Otcovi, iba cezo mňa. Ak poznáte mňa, budete poznať aj môjho Otca. Už teraz ho poznáte a videli ste ho.\"<br>" +
                            "Filip sa ozval: \"Pane, ukáž nám Otca a to nám postačí.\"<br>" +
                            "Ježiš mu vravel: \"Filip, toľký čas som s\u00A0vami a nepoznáš ma?! Kto vidí mňa, vidí Otca. Ako môžeš hovoriť: ‚Ukáž nám Otca?!' Neveríš, že ja som v\u00A0Otcovi a Otec vo\u00A0mne? Slová, ktoré vám hovorím, nehovorím sám zo\u00A0seba, ale Otec, ktorý ostáva vo\u00A0mne, koná svoje skutky.<br>" +
                            "Verte mi, že ja som v\u00A0Otcovi a Otec vo\u00A0mne. Ak nie pre\u00A0iné, aspoň pre\u00A0tie skutky verte!<br>" +
                            "Veru, veru, hovorím vám: Aj ten, kto verí vo\u00A0mňa, bude konať skutky, aké ja konám, ba bude konať ešte väčšie, lebo ja idem k\u00A0Otcovi.<br>" +
                            "A urobím všetko, o\u00A0čo budete prosiť v\u00A0mojom mene, aby bol Otec oslávený v\u00A0Synovi. Ak ma budete prosiť o\u00A0niečo v\u00A0mojom mene, ja to urobím.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"14g", "", "", "Jn 15, 9-17",
                    "Nie vy ste si vyvolili mňa, ale ja som si vyvolil vás",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Ako mňa miluje Otec, tak ja milujem vás. Ostaňte v\u00A0mojej láske!<br>" +
                            "Ak budete zachovávať moje prikázania, ostanete v\u00A0mojej láske, ako ja zachovávam prikázania svojho Otca a ostávam v\u00A0jeho láske. Toto som vám povedal, aby vo\u00A0vás bola moja radosť a aby vaša radosť bola úplná.<br>" +
                            "Toto je moje prikázanie: Aby ste sa milovali navzájom, ako som ja miloval vás. Nik nemá väčšiu lásku ako ten, kto položí svoj život za\u00A0svojich priateľov.<br>" +
                            "Vy ste moji priatelia, ak robíte, čo vám prikazujem. Už vás nenazývam sluhami, lebo sluha nevie čo robí jeho Pán. Nazval som vás priateľmi, pretože som vám oznámil všetko, čo som počul od\u00A0svojho Otca.<br>" +
                            "Nie vy ste si vyvolili mňa, ale ja som si vyvolil vás a ustanovil som vás, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo; aby vám Otec dal všetko, o\u00A0čo ho budete prosiť v\u00A0mojom mene.<br>" +
                            "Toto vám prikazujem: Aby ste sa milovali navzájom.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"16", "", "", "Mt 10, 17-22",
                    "Pre mňa vás budú vláčiť pred\u00A0vladárov a kráľov, aby ste vydali svedectvo",
                    "+ Čítanie zo svätého Evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Chráňte sa ľudí, lebo vás vydajú súdom, budú vás bičovať vo\u00A0svojich synagógach a pre\u00A0mňa vás budú vláčiť pred\u00A0vladárov a kráľov, aby ste vydali svedectvo im aj pohanom.<br>" +
                            "Ale keď vás vydajú, nestarajte sa, ako a čo budete hovoriť, lebo v\u00A0tú hodinu vám bude dané, čo máte povedať. Veď to už nie vy budete hovoriť, ale Duch vášho Otca bude hovoriť vo\u00A0vás.<br>" +
                            "Brat vydá na\u00A0smrť brata a otec dieťa. Deti povstanú proti rodičom a pripravia ich o\u00A0život.<br>" +
                            "Všetci vás budú nenávidieť pre\u00A0moje meno. Ale kto vytrvá do\u00A0konca, bude spasený.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"16g", "", "", "Mt 10, 17-22",
                    "Pre mňa vás budú vláčiť pred\u00A0vladárov a kráľov, aby ste vydali svedectvo",
                    "+ Čítanie zo svätého Evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Chráňte sa ľudí, lebo vás vydajú súdom, budú vás bičovať vo\u00A0svojich synagógach a pre\u00A0mňa vás budú vláčiť pred\u00A0vladárov a kráľov, aby ste vydali svedectvo im aj pohanom.<br>" +
                            "Ale keď vás vydajú, nestarajte sa, ako a čo budete hovoriť, lebo v\u00A0tú hodinu vám bude dané, čo máte povedať. Veď to už nie vy budete hovoriť, ale Duch vášho Otca bude hovoriť vo\u00A0vás.<br>" +
                            "Brat vydá na\u00A0smrť brata a otec dieťa. Deti povstanú proti rodičom a pripravia ich o\u00A0život.<br>" +
                            "Všetci vás budú nenávidieť pre\u00A0moje meno. Ale kto vytrvá do\u00A0konca, bude spasený.\"<br>" +
                            "Počuli sme slovo Pánovo."},
    };

    String[][] evanjelium6 = {
            {"11", "", "", "Mt 10, 7-13",
                    "Zadarmo ste dostali, zadarmo dávajte",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim apoštolom: \"Choďte a hlásajte: ‚Priblížilo sa nebeské kráľovstvo.' Chorých uzdravujte, mŕtvych krieste, malomocných očisťujte, zlých duchov vyháňajte. Zadarmo ste dostali, zadarmo dávajte.<br>" +
                            "Neberte si do\u00A0opaskov ani zlato, ani striebro, ani peniaze; ani kapsu na\u00A0cestu si neberte, ani dvoje šiat, ani obuv, ani palicu, lebo robotník si zaslúži svoj pokrm.<br>" +
                            "Keď prídete do\u00A0niektorého mesta alebo dediny, vypytujte sa, kto je vás tam hoden. Tam potom ostaňte, kým nepôjdete ďalej. Keď vojdete do\u00A0domu, pozdravte ho! Ak ten dom bude toho hoden, nech naň zostúpi váš pokoj; ale ak toho hoden nebude, nech sa váš pokoj vráti k\u00A0vám.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"23gk", "", "", "Lk 1, 5-17",
                    "Porodí ti syna a dáš mu meno Ján",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Za čias judejského kráľa Herodesa žil istý kňaz menom Zachariáš z\u00A0Abiášovej kňazskej triedy. Jeho manželka pochádzala z\u00A0Áronových dcér a volala sa Alžbeta.<br>" +
                            "Obaja boli spravodliví pred\u00A0Bohom a bezúhonne zachovávali všetky Pánove prikázania a ustanovenia. Nemali však deti, lebo Alžbeta bola neplodná a obaja boli v\u00A0pokročilom veku. Keď raz prišiel rad na\u00A0jeho triedu a on konal kňazskú službu pred\u00A0Bohom, podľa zvyku kňazského úradu lósom mu pripadlo vojsť do\u00A0Pánovho chrámu a priniesť kadidlovú obetu. V\u00A0čase kadidlovej obety sa vonku modlilo množstvo ľudu.<br>" +
                            "Tu sa mu zjavil Pánov anjel; stál na\u00A0pravej strane kadidlového oltára. Keď ho Zachariáš zbadal, zľakol sa a zmocňovala sa ho hrôza.<br>" +
                            "Ale anjel mu povedal: \"Neboj sa, Zachariáš, lebo je vyslyšaná tvoja modlitba. Tvoja manželka Alžbeta ti porodí syna a dáš mu meno Ján. Budeš sa radovať a plesať a jeho narodenie poteší mnohých.<br>" +
                            "Lebo on bude veľký pred\u00A0Pánom. Víno a opojný nápoj piť nebude a už v\u00A0matkinom lone ho naplní Duch Svätý. Mnohých synov Izraela obráti k\u00A0Pánovi, ich Bohu.<br>" +
                            "Sám pôjde pred\u00A0ním s\u00A0Eliášovým duchom a mocou, aby obrátil srdcia otcov k\u00A0synom a neveriacich k\u00A0múdrosti spravodlivých a pripravil Pánovi dokonalý ľud.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"24gk", "", "", "Lk 1, 57-66. 80",
                    "Ján sa bude volať",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Alžbete nadišiel čas pôrodu a porodila syna. Keď jej susedia a príbuzní počuli, že jej Pán prejavil svoje veľké milosrdenstvo, radovali sa s\u00A0ňou.<br>" +
                            "Na ôsmy deň prišli chlapca obrezať a chceli mu dať meno Zachariáš po\u00A0jeho otcovi. Ale jeho matka povedala: \"Nie, bude sa volať Ján.\"<br>" +
                            "Povedali jej: \"Veď v\u00A0tvojom príbuzenstve sa nik takto nevolá.\"<br>" +
                            "Dali znak otcovi, ako ho chce nazvať on. Vypýtal si tabuľku a napísal: \"Ján sa bude volať.\" A všetci sa divili. Vtom sa mu rozviazali ústa a jazyk i prehovoril a velebil Boha. Všetkých ich susedov zmocnil sa strach a všade po\u00A0judejských horách sa hovorilo o\u00A0týchto udalostiach. A všetci, čo to počuli, vštepili si to do\u00A0srdca a vraveli: \"Čím len bude tento chlapec?\" A vskutku Pánova ruka bola s\u00A0ním.<br>" +
                            "Chlapec rástol a mocnel na\u00A0duchu a žil na\u00A0púšti až do\u00A0dňa, keď vystúpil pred\u00A0Izrael.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"28gk", "", "", "Jn 21, 15-19",
                    "Pas moje baránky! Pas moje ovce! ",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Keď sa Ježiš zjavil svojim učeníkom a jedol s\u00A0nimi, opýtal sa Šimona Petra: \"Šimon, syn Jánov, miluješ ma väčšmi ako títo?\"<br>" +
                            "Odpovedal mu: \"Áno, Pane, ty vieš, že ťa mám rád.\"<br>" +
                            "Ježiš mu povedal: \"Pas moje baránky!\"<br>" +
                            "Opýtal sa ho aj druhý raz: \"Šimon, syn Jánov, miluješ ma?\"<br>" +
                            "On mu odpovedal: \"Áno, Pane, ty vieš, že ťa mám rád.\"<br>" +
                            "Ježiš mu povedal: \"Pas moje ovce!\"<br>" +
                            "Pýtal sa ho tretí raz: \"Šimon, syn Jánov, máš ma rád?\"<br>" +
                            "Petra zarmútilo, že sa ho tretí raz spýtal: \"Máš ma rád?\", a povedal mu: \"Pane, ty vieš všetko, ty dobre vieš, že ťa mám rád.\"<br>" +
                            "Ježiš mu povedal: \"Pas moje ovce!<br>" +
                            "Veru, veru, hovorím ti: Keď si bol mladší, sám si sa opásal a chodil si, kade si chcel. Ale keď zostarneš, vystrieš ruky, iný ťa opáše a povedie, kam nechceš.\" To povedal, aby naznačil, akou smrťou oslávi Boha.<br>" +
                            "Ako to povedal, vyzval ho: \"Poď za\u00A0mnou!\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"29gk", "", "", "Mt 16, 13-19",
                    "Ty si Peter a na\u00A0tejto skale postavím svoju Cirkev",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Keď Ježiš prišiel do\u00A0okolia Cézarey Filipovej, pýtal sa svojich učeníkov: \"Za koho pokladajú ľudia Syna človeka?\"<br>" +
                            "Oni vraveli: \"Jedni za\u00A0Jána Krstiteľa, iní za\u00A0Eliáša a iní za\u00A0Jeremiáša alebo za\u00A0jedného z\u00A0prorokov.\"<br>" +
                            "\"A za\u00A0koho ma pokladáte vy?\", opýtal sa ich.<br>" +
                            "Odpovedal Šimon Peter: \"Ty si Mesiáš, Syn živého Boha.\"<br>" +
                            "Ježiš mu povedal: \"Blahoslavený si, Šimon, syn Jonášov, lebo ti to nezjavilo telo a krv, ale môj Otec, ktorý je na\u00A0nebesiach. A ja ti hovorím: Ty si Peter a na\u00A0tejto skale postavím svoju Cirkev a pekelné brány ju nepremôžu.<br>" +
                            "Tebe dám kľúče od\u00A0nebeského kráľovstva: čo zviažeš na\u00A0zemi, bude zviazané v\u00A0nebi, a čo rozviažeš na\u00A0zemi, bude rozviazané v\u00A0nebi.\"<br>" +
                            "Počuli sme slovo Pánovo."},};
    String[][] evanjelium7 = {
            {"02g", "", "", "Lk 1, 39-56",
                    "Čím som si zaslúžila, že matka môjho Pána prichádza ku\u00A0mne?",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "V tých dňoch sa Mária vydala na\u00A0cestu a ponáhľala sa do\u00A0istého judejského mesta v\u00A0hornatom kraji. Vošla do\u00A0Zachariášovho domu a pozdravila Alžbetu.<br>" +
                            "Len čo Alžbeta začula Máriin pozdrav, dieťa v\u00A0jej lone sa zachvelo a Alžbetu naplnil Duch Svätý. Vtedy zvolala veľkým hlasom: \"Požehnaná si medzi ženami a požehnaný je plod tvojho života. Čím som si zaslúžila, že matka môjho Pána prichádza ku\u00A0mne? Lebo len čo zaznel tvoj pozdrav v\u00A0mojich ušiach, radosťou sa zachvelo dieťa v\u00A0mojom lone. A blahoslavená je tá, ktorá uverila, že sa splní, čo jej povedal Pán.\"<br>" +
                            "Mária hovorila: \"Velebí moja duša Pána a môj duch jasá v\u00A0Bohu, mojom spasiteľovi, lebo zhliadol na\u00A0poníženosť svojej služobnice. Hľa, od\u00A0tejto chvíle blahoslaviť ma budú všetky pokolenia, lebo veľké veci mi urobil ten, ktorý je mocný, a sväté je jeho meno a jeho milosrdenstvo z\u00A0pokolenia na\u00A0pokolenie s\u00A0tými, čo sa ho boja.<br>" +
                            "Ukázal silu svojho ramena, rozptýlil tých, čo v\u00A0srdci pyšne zmýšľajú. Mocnárov zosadil z\u00A0trónov a povýšil ponížených. Hladných nakŕmil dobrotami a bohatých prepustil naprázdno.<br>" +
                            "Ujal sa Izraela, svojho služobníka, lebo pamätá na\u00A0svoje milosrdenstvo, ako sľúbil našim otcom, Abrahámovi a jeho potomstvu naveky.\" Mária zostala pri\u00A0nej asi tri mesiace a potom sa vrátila domov.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"03g", "", "", "Jn 20, 24-29",
                    "Pán môj a Boh môj",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Tomáš, jeden z\u00A0Dvanástich, nazývaný Didymus, nebol s\u00A0nimi, keď prišiel Ježiš.<br>" +
                            "Ostatní učeníci mu hovorili: \"Videli sme Pána.\"<br>" +
                            "Ale on im povedal: \"Ak neuvidím na\u00A0jeho rukách stopy po\u00A0klincoch a nevložím svoj prst do\u00A0rán po\u00A0klincoch a nevložím svoju ruku do\u00A0jeho boku, neuverím.\"<br>" +
                            "O osem dní boli jeho učeníci zasa vnútri a Tomáš bol s\u00A0nimi.<br>" +
                            "Prišiel Ježiš, hoci dvere boli zatvorené, stal si doprostred a povedal: \"Pokoj vám!\"<br>" +
                            "Potom povedal Tomášovi: \"Vlož sem prst a pozri moje ruky! Vystri ruku a vlož ju do\u00A0môjho boku! A nebuď neveriaci, ale veriaci!\"<br>" +
                            "Tomáš mu odpovedal: \"Pán môj a Boh môj!\"<br>" +
                            "Ježiš mu povedal: \"Uveril si, pretože si ma videl. Blahoslavení tí, čo nevideli, a uverili.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"05gk", "", "", "Mt 28, 16-20",
                    "Choďte a učte všetky národy",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Jedenásti učeníci odišli do\u00A0Galiley na\u00A0vrch, kam im Ježiš rozkázal. Keď ho uvideli, klaňali sa mu, no niektorí pochybovali.<br>" +
                            "Ježiš pristúpil k\u00A0nim a povedal im: \"Daná mi je všetka moc na\u00A0nebi i na\u00A0zemi. Choďte teda, učte všetky národy a krstite ich v\u00A0mene Otca i Syna i Ducha Svätého a naučte ich zachovávať všetko, čo som vám prikázal.<br>" +
                            "A hľa, ja som s\u00A0vami po\u00A0všetky dni až do\u00A0skončenia sveta.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"11g", "", "", "Mt 19, 27-29",
                    "Vy, čo ste išli za\u00A0mnou, dostanete stonásobne viac",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Peter povedal Ježišovi: \"Pozri, my sme opustili všetko a išli sme za\u00A0tebou. Čo z\u00A0toho teda budeme mať?\"<br>" +
                            "Ježiš im povedal: \"Veru, hovorím vám: Pri\u00A0obnovení sveta, keď Syn človeka zasadne na\u00A0trón svojej slávy, aj vy, čo ste išli za\u00A0mnou, zasadnete na\u00A0dvanásť trónov a budete súdiť dvanásť kmeňov Izraela. A každý, kto pre\u00A0moje meno opustí domy alebo bratov a sestry, alebo otca a matku, alebo deti, alebo polia, dostane stonásobne viac a bude dedičom večného života.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            /*{"16", "", "", "Mt 12, 46-50",
                    "Vystrel ruku nad\u00A0svojich učeníkov a povedal: Hľa, moja matka a moji bratia",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Kým Ježiš hovoril zástupom, vonku stála jeho matka a bratia a chceli sa s\u00A0ním rozprávať. Ktosi mu povedal: \"Vonku stojí tvoja matka a tvoji bratia a chcú sa s\u00A0tebou rozprávať.\" On však odvetil tomu, čo mu to vravel: \"Kto je moja matka a kto sú moji bratia?\"<br>" +
                            "Vystrel ruku nad\u00A0svojich učeníkov a povedal: \"Hľa, moja matka a moji bratia. Lebo každý, kto plní vôľu môjho Otca, ktorý je na\u00A0nebesiach, je môj brat i sestra i matka.\"<br>" +
                            "Počuli sme slovo Pánovo."},*/
            {"17gk", "", "", "Lk 12, 35-40",
                    "Aj vy buďte pripravení",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Bedrá majte opásané a lampy zažaté! Buďte podobní ľuďom, ktorí očakávajú svojho pána, keď sa má vrátiť zo\u00A0svadby, aby mu otvorili hneď, ako príde a zaklope.<br>" +
                            "Blahoslavení sluhovia, ktorých pán pri\u00A0svojom príchode nájde bdieť. Veru, hovorím vám: Opáše sa, posadí ich k\u00A0stolu a bude ich obsluhovať.<br>" +
                            "A keď príde pred\u00A0polnocou alebo až nad\u00A0ránom a nájde ich bdieť, budú blahoslavení.<br>" +
                            "Uvážte predsa: Keby hospodár vedel, v\u00A0ktorú hodinu príde zlodej, nedovolil by mu vniknúť do\u00A0svojho domu.<br>" +
                            "Aj vy buďte pripravení, lebo Syn človeka príde v\u00A0hodinu, o\u00A0ktorej sa nenazdáte.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"17g", "", "", "Lk 12, 35-40",
                    "Aj vy buďte pripravení",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Bedrá majte opásané a lampy zažaté! Buďte podobní ľuďom, ktorí očakávajú svojho pána, keď sa má vrátiť zo\u00A0svadby, aby mu otvorili hneď, ako príde a zaklope.<br>" +
                            "Blahoslavení sluhovia, ktorých pán pri\u00A0svojom príchode nájde bdieť. Veru, hovorím vám: Opáše sa, posadí ich k\u00A0stolu a bude ich obsluhovať.<br>" +
                            "A keď príde pred\u00A0polnocou alebo až nad\u00A0ránom a nájde ich bdieť, budú blahoslavení.<br>" +
                            "Uvážte predsa: Keby hospodár vedel, v\u00A0ktorú hodinu príde zlodej, nedovolil by mu vniknúť do\u00A0svojho domu.<br>" +
                            "Aj vy buďte pripravení, lebo Syn človeka príde v\u00A0hodinu, o\u00A0ktorej sa nenazdáte.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"22g", "", "", "Jn 20, 1-2. 11-18",
                    "Žena, prečo plačeš? Koho hľadáš?",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ráno prvého dňa v\u00A0týždni, ešte za\u00A0tmy, prišla Mária Magdaléna k\u00A0hrobu a videla, že kameň je od\u00A0hrobu odvalený. Bežala teda a prišla k\u00A0Šimonovi Petrovi a k\u00A0inému učeníkovi, ktorého mal Ježiš tak rád, a povedala im: \"Odniesli Pána z\u00A0hrobu a nevieme, kde ho položili.\"<br>" +
                            "Mária stála vonku pri\u00A0hrobe a plakala. Ako tak plakala, nahla sa do\u00A0hrobu a videla dvoch anjelov v\u00A0bielom sedieť tam, kde bolo predtým uložené Ježišovo telo, jedného pri\u00A0hlave, druhého pri\u00A0nohách.<br>" +
                            "Oni sa jej opýtali: \"Žena, prečo plačeš?\"<br>" +
                            "Vravela im: \"Odniesli môjho Pána a neviem, kde ho položili.\"<br>" +
                            "Keď to povedala, obrátila sa a videla tam stáť Ježiša; no nevedela, že je to Ježiš.<br>" +
                            "Ježiš sa jej opýtal: \"Žena, prečo plačeš? Koho hľadáš?\"<br>" +
                            "Ona mu v\u00A0domnení, že je to záhradník, povedala: \"Pane, ak si ho ty odniesol, povedz mi, kde si ho položil, a ja si ho vezmem.\"<br>" +
                            "Ježiš ju oslovil: \"Mária!\"<br>" +
                            "Ona sa obrátila a po\u00A0hebrejsky mu povedala: \"Rabbuni,\" čo znamená Učiteľ.<br>" +
                            "Ježiš jej povedal: \"Už ma nedrž, veď som ešte nevystúpil k\u00A0Otcovi; ale choď k\u00A0mojim bratom a povedz im: Vystupujem k\u00A0môjmu Otcovi a vášmu Otcovi, k\u00A0môjmu Bohu a vášmu Bohu.\"<br>" +
                            "Mária Magdaléna išla a zvestovala učeníkom: \"Videla som Pána,\" a že jej toto povedal.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"23g", "", "", "Jn 15, 1-8",
                    "Kto ostáva vo\u00A0mne a ja v\u00A0ňom, prináša veľa ovocia",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Ja som pravý vinič a môj Otec je vinohradník. On každú ratolesť, ktorá na\u00A0mne neprináša ovocie, odrezáva, a každú, ktorá ovocie prináša, čistí, aby prinášala viac ovocia.<br>" +
                            "Vy ste už čistí pre\u00A0slovo, ktoré som vám povedal.<br>" +
                            "Ostaňte vo\u00A0mne a ja vo\u00A0vás. Ako ratolesť nemôže prinášať ovocie sama od\u00A0seba, ak neostane na\u00A0viniči, tak ani vy, ak neostanete vo\u00A0mne.<br>" +
                            "Ja som vinič, vy ste ratolesti. Kto ostáva vo\u00A0mne a ja v\u00A0ňom, prináša veľa ovocia; lebo bezo mňa nemôžete nič urobiť.<br>" +
                            "Ak niekto neostane vo\u00A0mne, vyhodia ho von ako ratolesť a uschne. Potom ich pozbierajú, hodia ich do\u00A0ohňa a zhoria.<br>" +
                            "Ak ostanete vo\u00A0mne a moje slová ostanú vo\u00A0vás, proste, o\u00A0čo chcete, a splní sa vám to.<br>" +
                            "Môj Otec je oslávený tým, že prinášate veľa ovocia a stanete sa mojimi učeníkmi.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"25g", "", "", "Mt 20, 20-28",
                    "Môj kalich budete piť",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "K Ježišovi pristúpila matka Zebedejových synov so\u00A0svojimi synmi, poklonila sa a o\u00A0čosi ho prosila.<br>" +
                            "On sa jej opýtal: \"Čo chceš?\"<br>" +
                            "Vravela mu: \"Povedz, aby títo moji dvaja synovia sedeli v\u00A0tvojom kráľovstve jeden po\u00A0tvojej pravici a druhý po\u00A0ľavici.\"<br>" +
                            "Ježiš odpovedal: \"Neviete, čo žiadate. Môžete piť kalich, ktorý mám ja piť?\"<br>" +
                            "Oni mu vraveli: \"Môžeme.\"<br>" +
                            "On im povedal: \"Môj kalich budete piť, ale dať niekomu sedieť po\u00A0mojej pravici alebo ľavici nepatrí mne; to dostanú tí, ktorým to pripravil môj Otec.\"<br>" +
                            "Keď to počuli ostatní desiati, namrzeli sa na\u00A0oboch bratov.<br>" +
                            "Ježiš ich zavolal k\u00A0sebe a povedal: \"Viete, že vládcovia národov panujú nad\u00A0nimi a mocnári im dávajú cítiť svoju moc. Medzi vami to tak nebude. Ale kto sa medzi vami bude chcieť stať veľkým, bude vaším služobníkom. A kto bude chcieť byť medzi vami prvý, bude vaším sluhom.<br>" +
                            "Ako ani Syn človeka neprišiel dať sa obsluhovať, ale slúžiť a položiť svoj život ako výkupné za\u00A0mnohých.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"29", "", "", "Jn 11, 19-27",
                    "Ja som uverila, že ty si Mesiáš, Boží Syn",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Veľa Židov prišlo k\u00A0Marte a Márii potešiť ich v\u00A0žiali za\u00A0bratom.<br>" +
                            "Keď Marta počula, že prichádza Ježiš, išla mu naproti. Mária zostala doma. Marta povedala Ježišovi: \"Pane, keby si bol býval tu, môj brat by nebol umrel. Ale aj teraz viem, že o\u00A0čokoľvek poprosíš Boha, Boh ti to dá.\"<br>" +
                            "Ježiš jej povedal: \"Tvoj brat vstane z\u00A0mŕtvych.\"<br>" +
                            "Marta mu vravela: \"Viem, že vstane v\u00A0posledný deň pri\u00A0vzkriesení.\"<br>" +
                            "Ježiš jej povedal: \"Ja som vzkriesenie a život. Kto verí vo\u00A0mňa, bude žiť, aj keď umrie. A nik, kto žije a verí vo\u00A0mňa, neumrie naveky. Veríš tomu?\"<br>" +
                            "Povedala mu: \"Áno, Pane, ja som uverila, že ty si Mesiáš, Boží Syn, ktorý mal prísť na\u00A0svet.\"<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Lk 10, 38-42",
                    "Marta ho prijala do\u00A0domu. Mária si vybrala lepší podiel",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš vošiel do\u00A0ktorejsi dediny, kde ho prijala do\u00A0domu istá žena, menom Marta. Tá mala sestru menom Máriu, ktorá si sadla Pánovi k\u00A0nohám a počúvala jeho slovo.<br>" +
                            "Ale Marta mala plno práce s\u00A0obsluhou. Tu zastala a povedala: \"Pane, nedbáš, že ma sestra nechá samu obsluhovať? Povedz jej, nech mi pomôže!\"<br>" +
                            "Pán jej odpovedal: \"Marta, Marta, staráš sa a znepokojuješ pre\u00A0mnohé veci, a potrebné je len jedno. Mária si vybrala lepší podiel, ktorý sa jej neodníme.\"<br>" +
                            "Počuli sme slovo Pánovo."},};

    String[][] evanjelium8 = {
            {"06gn", "", "A", " Mt 17, 1-9",
                    "Tvár mu zažiarila sťa slnko",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša <br>" +
                            "Ježiš vzal so\u00A0sebou Petra, Jakuba a jeho brata Jána a vyviedol ich na\u00A0vysoký vrch do\u00A0samoty. Tam sa pred\u00A0nimi premenil: tvár mu zažiarila sťa slnko a odev mu zbelel ako svetlo.<br>" +
                            "Vtom sa im zjavil Mojžiš a Eliáš a rozprávali sa s\u00A0ním.<br>" +
                            "Vtedy Peter povedal Ježišovi: \"Pane, dobre je nám tu. Ak chceš, urobím tu tri stánky: jeden tebe, jeden Mojžišovi a jeden Eliášovi.\"<br>" +
                            "Kým ešte hovoril, zahalil ich jasný oblak a z\u00A0oblaku zaznel hlas: \"Toto je môj milovaný Syn, v\u00A0ktorom mám zaľúbenie; počúvajte ho.\"<br>" +
                            "Keď to učeníci počuli, padli na\u00A0tvár a veľmi sa báli.<br>" +
                            "No pristúpil k\u00A0nim Ježiš, dotkol sa ich a povedal im: \"Vstaňte a nebojte sa!\" A keď zdvihli oči, nevideli nikoho, iba Ježiša.<br>" +
                            "Keď zostupovali z\u00A0vrchu, Ježiš im prikázal: \"Nikomu nehovorte o\u00A0tomto videní, kým Syn človeka nevstane z\u00A0mŕtvych.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"06gn", "", "B", "Mk 9, 2-10",
                    "Toto je môj milovaný Syn",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Ježiš vzal so\u00A0sebou Petra, Jakuba a Jána a len ich vyviedol na\u00A0vysoký vrch do\u00A0samoty. Tam sa pred\u00A0nimi premenil. Jeho odev zažiaril a bol taký biely, že by ho nijaký bielič na\u00A0svete tak nevybielil. A zjavil sa im Eliáš s\u00A0Mojžišom a rozprávali sa s\u00A0Ježišom.<br>" +
                            "Vtedy Peter povedal Ježišovi: \"Rabbi, dobre je nám tu. Urobme tri stánky: jeden tebe, jeden Mojžišovi a jeden Eliášovi.\" Lebo nevedel, čo povedať; takí boli preľaknutí. Tu sa utvoril oblak a zahalil ich. A z\u00A0oblaku zaznel hlas: \"Toto je môj milovaný Syn, počúvajte ho.\" A sotva sa rozhliadli, nevideli pri\u00A0sebe nikoho, iba Ježiša. Keď zostupovali z\u00A0vrchu, prikázal im, aby o\u00A0tom, čo videli, nehovorili nikomu, kým Syn človeka nevstane z\u00A0mŕtvych. Oni si toto slovo zapamätali a jeden druhého sa vypytovali, čo znamená \"vstať z\u00A0mŕtvych\".<br>" +
                            "Počuli sme slovo Pánovo."},
            {"06gn", "", "C", "Lk 9, 28b-36",
                    "Ako sa modlil, zmenil sa vzhľad jeho tváre",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš vzal so\u00A0sebou Petra, Jána a Jakuba a vystúpil na\u00A0vrch modliť sa. Ako sa modlil, zmenil sa vzhľad jeho tváre a jeho odev zažiaril belobou. A hľa, rozprávali sa s\u00A0ním dvaja mužovia – boli to Mojžiš a Eliáš. Zjavili sa v\u00A0sláve a hovorili o\u00A0jeho odchode, ktorý sa mal uskutočniť v\u00A0Jeruzaleme. Petra a tých, čo boli s\u00A0ním, premohol spánok. A keď sa prebudili, videli jeho slávu a tých dvoch mužov, čo s\u00A0ním stáli.<br>" +
                            "Keď od\u00A0neho odchádzali, povedal Peter Ježišovi: \"Učiteľ, dobre je nám tu. Urobme tri stánky: jeden tebe, jeden Mojžišovi a jeden Eliášovi.\" Nevedel, čo hovorí. Kým toto hovoril, utvoril sa oblak a zahalil ich. Keď vstúpili do\u00A0oblaku, zmocnil sa ich strach.<br>" +
                            "A z\u00A0oblaku zaznel hlas: \"Toto je môj vyvolený Syn, počúvajte ho!\" A kým hlas doznel, ostal Ježiš sám.<br>" +
                            "Oni zmĺkli a v\u00A0tých dňoch nehovorili nikomu o\u00A0tom, čo videli.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"09g", "", "", "Mt 25, 1-13",
                    "Hľa, ženích prichádza, vyjdite mu v\u00A0ústrety",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom toto podobenstvo: \"Nebeské kráľovstvo sa bude podobať desiatim pannám, ktoré si vzali lampy a vyšli naproti ženíchovi. Päť z\u00A0nich bolo nerozumných a päť múdrych. Nerozumné si vzali lampy, ale olej si so\u00A0sebou nevzali. Múdre si vzali s\u00A0lampami aj olej do\u00A0nádob.<br>" +
                            "Keď ženích neprichádzal, všetkým sa začalo driemať a zaspali. O\u00A0polnoci sa strhol krik: ‚Ženích prichádza, vyjdite mu v\u00A0ústrety!'<br>" +
                            "Všetky panny sa prebudili a pripravovali si lampy.<br>" +
                            "Tu nerozumné panny povedali múdrym: ‚Dajte nám zo\u00A0svojho oleja, lebo naše lampy hasnú.'<br>" +
                            "Ale múdre odvetili: ‚Aby azda nebolo ani nám ani vám málo, choďte radšej k\u00A0predavačom a kúpte si!'<br>" +
                            "No kým išli kupovať olej, prišiel ženích a tie, čo boli pripravené, vošli s\u00A0ním na\u00A0svadbu a dvere sa zatvorili.<br>" +
                            "Napokon prišli aj ostatné panny a vraveli: ‚Pane, Pane, otvor nám!'<br>" +
                            "Ale on im povedal: ‚Veru, hovorím vám: Nepoznám vás.'<br>" +
                            "Preto bdejte, lebo neviete ani dňa ani hodiny.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"10g", "", "", "Jn 12, 24-26",
                    "Ak pšeničné zrno odumrie, prinesie veľkú úrodu",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Veru, veru, hovorím vám: Ak pšeničné zrno nepadne do\u00A0zeme a neodumrie, ostane samo. Ale ak odumrie, prinesie veľkú úrodu.<br>" +
                            "Kto miluje svoj život, stratí ho, a kto svoj život nenávidí na\u00A0tomto svete, zachráni si ho pre\u00A0večný život.<br>" +
                            "Ak mi niekto slúži, nech ma nasleduje! A kde som ja, tam bude aj môj služobník. Kto bude mne slúžiť, toho poctí Otec.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"14gk", "", "", "Lk 11, 27-28",
                    "Blahoslavený život, ktorý ťa nosil. Skôr sú blahoslavení tí, čo počúvajú Božie slovo",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ako Ježiš hovoril zástupom, akási žena zo\u00A0zástupu pozdvihla svoj hlas a povedala mu: \"Blahoslavený život, ktorý ťa nosil, a prsia, ktoré si požíval.\"<br>" +
                            "Ale on povedal: \"Skôr sú blahoslavení tí, čo počúvajú Božie slovo a zachovávajú ho.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"15gk", "", "", "Lk 1, 39-56",
                    "Čím som si zaslúžila, že matka môjho Pána prichádza ku\u00A0mne?",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "V tých dňoch sa Mária vydala na\u00A0cestu a ponáhľala sa do\u00A0istého judejského mesta v\u00A0hornatom kraji. Vošla do\u00A0Zachariášovho domu a pozdravila Alžbetu.<br>" +
                            "Len čo Alžbeta začula Máriin pozdrav, dieťa v\u00A0jej lone sa zachvelo a Alžbetu naplnil Duch Svätý. Vtedy zvolala veľkým hlasom: \"Požehnaná si medzi ženami a požehnaný je plod tvojho života. Čím som si zaslúžila, že matka môjho Pána prichádza ku\u00A0mne? Lebo len čo zaznel tvoj pozdrav v\u00A0mojich ušiach, radosťou sa zachvelo dieťa v\u00A0mojom lone. A blahoslavená je tá, ktorá uverila, že sa splní, čo jej povedal Pán.\"<br>" +
                            "Mária hovorila: \"Velebí moja duša Pána a môj duch jasá v\u00A0Bohu, mojom spasiteľovi, lebo zhliadol na\u00A0poníženosť svojej služobnice. Hľa, od\u00A0tejto chvíle blahoslaviť ma budú všetky pokolenia, lebo veľké veci mi urobil ten, ktorý je mocný, a sväté je jeho meno a jeho milosrdenstvo z\u00A0pokolenia na\u00A0pokolenie s\u00A0tými, čo sa ho boja.<br>" +
                            "Ukázal silu svojho ramena, rozptýlil tých, čo v\u00A0srdci pyšne zmýšľajú. Mocnárov zosadil z\u00A0trónov a povýšil ponížených. Hladných nakŕmil dobrotami a bohatých prepustil naprázdno.<br>" +
                            "Ujal sa Izraela, svojho služobníka, lebo pamätá na\u00A0svoje milosrdenstvo, ako sľúbil našim otcom, Abrahámovi a jeho potomstvu naveky.\" Mária zostala pri\u00A0nej asi tri mesiace a potom sa vrátila domov.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"24g", "", "", "Jn 1, 45-51",
                    "Toto je pravý Izraelita, v\u00A0ktorom niet lesti",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Filip sa stretol s\u00A0Natanaelom a povedal mu: \"Našli sme toho, o\u00A0ktorom písal Mojžiš v\u00A0Zákone a Proroci, Ježiša, Jozefovho syna z\u00A0Nazareta.\"<br>" +
                            "Natanael mu vravel: \"Môže byť z\u00A0Nazareta niečo dobré?!\" Filip mu odpovedal: \"Poď a uvidíš!\"<br>" +
                            "Keď Ježiš videl prichádzať Natanaela, povedal o\u00A0ňom: \"Toto je pravý Izraelita, v\u00A0ktorom niet lesti.\"<br>" +
                            "Natanael sa ho opýtal: \"Odkiaľ ma poznáš?\"<br>" +
                            "Ježiš mu vravel: \"Videl som ťa prv, ako ťa Filip zavolal, keď si bol pod\u00A0figovníkom.\"<br>" +
                            "Natanael mu povedal: \"Rabbi, ty si Boží Syn, ty si kráľ Izraela.\"<br>" +
                            "Ježiš mu odvetil: \"Veríš preto, že som ti povedal: Videl som ťa pod\u00A0figovníkom? Uvidíš väčšie veci ako toto.\"<br>" +
                            "Potom mu povedal: \"Veru, veru, hovorím vám: Uvidíte otvorené nebo a Božích anjelov vystupovať a zostupovať na\u00A0Syna človeka.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"29", "", "", "Mk 6, 17-29",
                    "Chcem, aby si mi hneď dal na\u00A0mise hlavu Jána Krstiteľa",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Herodes dal Jána chytiť a v\u00A0putách vrhnúť do\u00A0väzenia pre\u00A0Herodiadu, manželku svojho brata Filipa, lebo si ju vzal za\u00A0ženu.<br>" +
                            "A Ján Herodesovi hovoril: \"Nesmieš žiť s\u00A0manželkou svojho brata!\" Herodias mu strojila úklady a chcela ho zabiť, ale nemohla, lebo Herodes sa Jána bál. Vedel, že je to muž spravodlivý a svätý, preto ho chránil. Keď ho počúval, býval vo\u00A0veľkých rozpakoch, a predsa ho rád počúval.<br>" +
                            "Vhodný deň nadišiel, keď Herodes na\u00A0svoje narodeniny usporiadal hostinu pre\u00A0svojich veľmožov, vysokých dôstojníkov a popredných mužov Galiley. Keď potom vošla dcéra tejto Herodiady a tancovala, zapáčila sa Herodesovi i spolustolujúcim.<br>" +
                            "Kráľ povedal dievčine: \"Žiadaj si odo\u00A0mňa, čo chceš, a dám ti.\" A veľmi jej prisahal: \"Dám ti všetko, čo si len zažiadaš, hoc aj polovicu svojho kráľovstva.\"<br>" +
                            "Ona vyšla a vravela svojej matke: \"Čo si mám žiadať?\"<br>" +
                            "A tá jej povedala: \"Hlavu Jána Krstiteľa.\"<br>" +
                            "Hneď utekala dnu ku\u00A0kráľovi a žiadala: \"Chcem, aby si mi hneď dal na\u00A0mise hlavu Jána Krstiteľa.\"<br>" +
                            "Kráľ sa zarmútil, ale pre\u00A0prísahu a kvôli spolustolujúcim ju nechcel sklamať. Hneď poslal kata a rozkázal priniesť jeho hlavu. Ten odišiel, vo\u00A0väzení ho sťal, priniesol na\u00A0mise jeho hlavu, odovzdal ju dievčaťu a dievča ju dalo svojej matke. Keď sa to dopočuli jeho učeníci, prišli, vzali jeho telo a uložili ho do\u00A0hrobu.<br>" +
                            "Počuli sme slovo Pánovo."},};
    String[][] evanjelium9 = {
            {"08g", "", "", "Mt 1, 1-16. 18-23",
                    "Čo sa v\u00A0nej počalo, je z\u00A0Ducha Svätého",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Rodokmeň Ježiša Krista, syna Dávidovho, syna Abrahámovho.<br>" +
                            "Abrahám mal syna Izáka, Izák Jakuba, Jakub Júdu a jeho bratov, Júda Faresa a Záru z\u00A0Tamary. Fares mal syna Ezroma, Ezrom Arama. Aram mal syna Aminadaba, Aminadab Násona, Náson Salmona, Salmon mal syna Bóza z\u00A0Rachaby, Bóz Obeda z\u00A0Rút, Obed Jesseho a Jesse kráľa Dávida.<br>" +
                            "Dávid mal syna Šalamúna z\u00A0Uriášovej ženy. Šalamún mal syna Roboama, Roboam Abiáša, Abiáš Azu, Aza Jozafata, Jozafat Jorama, Joram Oziáša. Oziáš mal syna Joatama, Joatam Achaza, Achaz Ezechiáša. Ezechiáš mal syna Manassesa, Manasses Amona, Amon Joziáša, Joziáš Jechoniáša a jeho bratov za\u00A0babylonského zajatia.<br>" +
                            "Po babylonskom zajatí Jechoniáš mal syna Salatiela, Salatiel Zorobábela, Zorobábel Abiuda, Abiud Eliakima, Eliakim Azora. Azor mal syna Sadoka, Sadok Achima, Achim Eliuda. Eliud mal syna Eleazara, Eleazar Matana, Matan Jakuba. Jakub mal syna Jozefa, manžela Márie, z\u00A0ktorej sa narodil Ježiš, nazývaný Kristus.<br>" +
                            "S narodením Ježiša Krista to bolo takto: Jeho matka Mária bola zasnúbená s\u00A0Jozefom. Ale skôr, ako by boli začali spolu bývať, ukázalo sa, že počala z\u00A0Ducha Svätého.<br>" +
                            "Jozef, jej manžel, bol človek spravodlivý a nechcel ju vystaviť potupe, preto ju zamýšľal potajomky prepustiť.<br>" +
                            "Ako o\u00A0tom uvažoval, zjavil sa mu vo\u00A0sne Pánov anjel a povedal: \"Jozef, syn Dávidov, neboj sa prijať Máriu, svoju manželku, lebo to, čo sa v\u00A0nej počalo, je z\u00A0Ducha Svätého. Porodí syna a dáš mu meno Ježiš; lebo on vyslobodí svoj ľud z\u00A0hriechov.\"<br>" +
                            "To všetko sa stalo, aby sa splnilo, čo Pán povedal ústami proroka: \"Hľa, panna počne a porodí syna a dajú mu meno Emanuel,\" čo v\u00A0preklade znamená: Boh s\u00A0nami.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Mt 1, 18-23",
                    "Čo sa v\u00A0nej počalo, je z\u00A0Ducha Svätého",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "S narodením Ježiša Krista to bolo takto: Jeho matka Mária bola zasnúbená s\u00A0Jozefom. Ale skôr, ako by boli začali spolu bývať, ukázalo sa, že počala z\u00A0Ducha Svätého.<br>" +
                            "Jozef, jej manžel, bol človek spravodlivý a nechcel ju vystaviť potupe, preto ju zamýšľal potajomky prepustiť.<br>" +
                            "Ako o\u00A0tom uvažoval, zjavil sa mu vo\u00A0sne Pánov anjel a povedal: \"Jozef, syn Dávidov, neboj sa prijať Máriu, svoju manželku, lebo to, čo sa v\u00A0nej počalo, je z\u00A0Ducha Svätého. Porodí syna a dáš mu meno Ježiš; lebo on vyslobodí svoj ľud z\u00A0hriechov.\"<br>" +
                            "To všetko sa stalo, aby sa splnilo, čo Pán povedal ústami proroka: \"Hľa, panna počne a porodí syna a dajú mu meno Emanuel,\" čo v\u00A0preklade znamená: Boh s\u00A0nami.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"14gn", "", "", "Jn 3, 13-17",
                    "Syn človeka musí byť vyzdvihnutý",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal Nikodémovi: \"Nik nevystúpil do\u00A0neba, iba ten, čo zostúpil z\u00A0neba, Syn človeka.<br>" +
                            "A ako Mojžiš vyzdvihol na\u00A0púšti hada, tak musí byť vyzdvihnutý aj Syn človeka, aby každý, kto verí, mal v\u00A0ňom večný život.\"<br>" +
                            "Veď Boh tak miloval svet, že dal svojho jednorodeného Syna, aby nezahynul nik, kto v\u00A0neho verí, ale aby mal večný život. Lebo Boh neposlal Syna na\u00A0svet, aby svet odsúdil, ale aby sa skrze neho svet spasil.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"15gk", "", "", "Jn 19, 25-27",
                    "Hľa, tvoj syn! Hľa, tvoja matka!",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Pri Ježišovom kríži stála jeho matka, sestra jeho matky, Mária Kleopasova, a Mária Magdaléna.<br>" +
                            "Keď Ježiš uzrel matku a pri\u00A0nej učeníka, ktorého miloval, povedal matke: \"Žena, hľa, tvoj syn!\"<br>" +
                            "Potom povedal učeníkovi: \"Hľa, tvoja matka!\"<br>" +
                            "A od\u00A0tej hodiny si ju učeník vzal k\u00A0sebe.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Lk 2, 33-35",
                    "Tvoju vlastnú dušu prenikne meč",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježišov otec a matka divili sa tomu, čo sa o\u00A0ňom hovorilo. Simeon ich požehnal a Márii, jeho matke, povedal: \"On je ustanovený na\u00A0pád a na\u00A0povstanie pre\u00A0mnohých v\u00A0Izraeli a na\u00A0znamenie, ktorému budú odporovať, – a tvoju vlastnú dušu prenikne meč –, aby vyšlo najavo zmýšľanie mnohých sŕdc.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"21g", "", "", "Mt 9, 9-13",
                    "Lekára nepotrebujú zdraví, ale chorí; milosrdenstvo chcem, a nie obetu",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš videl na\u00A0mýtnici sedieť človeka menom Matúša a povedal mu: \"Poď za\u00A0mnou!\" On vstal a išiel za\u00A0ním.<br>" +
                            "Keď potom Ježiš sedel v\u00A0dome za\u00A0stolom, prišli mnohí mýtnici a hriešnici a stolovali s\u00A0ním a s\u00A0jeho učeníkmi. Keď to videli farizeji, hovorili jeho učeníkom: \"Prečo váš učiteľ jedáva s\u00A0mýtnikmi a hriešnikmi?\"<br>" +
                            "On to začul a povedal: \"Lekára nepotrebujú zdraví, ale chorí. Choďte a naučte sa, čo to znamená: ‚Milosrdenstvo chcem, a nie obetu.' Neprišiel som volať spravodlivých, ale hriešnikov.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"29g", "", "", "Jn 1, 47-51",
                    "Uvidíte Božích anjelov vystupovať a zostupovať na\u00A0Syna človeka",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Keď Ježiš videl prichádzať Natanaela, povedal o\u00A0ňom: \"Toto je pravý Izraelita, v\u00A0ktorom niet lesti.\"<br>" +
                            "Natanael sa ho opýtal: \"Odkiaľ ma poznáš?\"<br>" +
                            "Ježiš mu vravel: \"Videl som ťa prv, ako ťa Filip zavolal, keď si bol pod\u00A0figovníkom.\"<br>" +
                            "Natanael mu povedal: \"Rabbi, ty si Boží Syn, ty si kráľ Izraela!\"<br>" +
                            "Ježiš mu odvetil: \"Veríš preto, že som ti povedal: Videl som ťa pod\u00A0figovníkom? Uvidíš väčšie veci ako toto.\"<br>" +
                            "Potom mu povedal: \"Veru, veru, hovorím vám: Uvidíte otvorené nebo a Božích anjelov vystupovať a zostupovať na\u00A0Syna človeka.\"<br>" +
                            "Počuli sme slovo Pánovo."},
    };

    String[][] evanjelium10 = {
            {"02", "", "", "Mt 18, 1-5. 10",
                    "Ich anjeli ustavične hľadia na\u00A0tvár môjho Otca, ktorý je na\u00A0nebesiach",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "V tú hodinu pristúpili k\u00A0Ježišovi učeníci a pýtali sa: \"Kto je podľa teba najväčší v\u00A0nebeskom kráľovstve?\"<br>" +
                            "On zavolal k\u00A0sebe dieťa, postavil ho medzi nich a povedal: \"Veru, hovorím vám: Ak sa neobrátite a nebudete ako deti, nevojdete do\u00A0nebeského kráľovstva. Kto sa teda poníži ako toto dieťa, ten je najväčší v\u00A0nebeskom kráľovstve. A kto prijme jedno takéto dieťa v\u00A0mojom mene, mňa prijíma. Dajte si pozor, aby ste neopovrhli ani jedným z\u00A0týchto maličkých. Lebo vám hovorím, že ich anjeli v\u00A0nebi ustavične hľadia na\u00A0tvár môjho Otca, ktorý je na\u00A0nebesiach.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"07", "", "", "Lk 1, 26-38",
                    "Počneš a porodíš syna",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Boh poslal anjela Gabriela do\u00A0galilejského mesta, ktoré sa volá Nazaret, k\u00A0panne zasnúbenej mužovi z\u00A0rodu Dávidovho, menom Jozefovi. A meno panny bolo Mária.<br>" +
                            "Anjel prišiel k\u00A0nej a povedal: \"Zdravas', milosti plná, Pán s\u00A0tebou.\"<br>" +
                            "Ona sa nad\u00A0jeho slovami zarazila a rozmýšľala, čo znamená takýto pozdrav.<br>" +
                            "Anjel jej povedal: \"Neboj sa, Mária, našla si milosť u\u00A0Boha. Počneš a porodíš syna a dáš mu meno Ježiš. On bude veľký a bude sa volať Synom Najvyššieho. Pán, Boh, mu dá trón jeho otca Dávida, naveky bude kraľovať nad\u00A0Jakubovým rodom a jeho kráľovstvu nebude konca.\"<br>" +
                            "Mária povedala anjelovi: \"Ako sa to stane, veď ja muža nepoznám?\"<br>" +
                            "Anjel jej odpovedal: \"Duch Svätý zostúpi na\u00A0teba a moc Najvyššieho ťa zatieni. A preto aj dieťa bude sa volať svätým, bude to Boží Syn. Aj Alžbeta, tvoja príbuzná, počala syna v\u00A0starobe. Už je v\u00A0šiestom mesiaci. A hovorili o\u00A0nej, že je neplodná! Lebo Bohu nič nie je nemožné.\"<br>" +
                            "Mária povedala: \"Hľa, služobnica Pána, nech sa mi stane podľa tvojho slova.\"<br>" +
                            "Anjel potom od\u00A0nej odišiel.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"18g", "", "", "Lk 10, 1-9",
                    "Žatva je veľká, ale robotníkov málo",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Pán si vyvolil iných sedemdesiatich dvoch a po\u00A0dvoch ich poslal pred\u00A0sebou do\u00A0každého mesta a na\u00A0každé miesto, kam sa sám chystal ísť. A povedal im: \"Žatva je veľká, ale robotníkov málo. Preto proste Pána žatvy, aby poslal robotníkov na\u00A0svoju žatvu!<br>" +
                            "Choďte! Hľa, posielam vás ako baránkov medzi vlkov.<br>" +
                            "Nenoste mešec ani kapsu, ani obuv a cestou nikoho nepozdravujte!<br>" +
                            "Keď vojdete do\u00A0niektorého domu, najprv povedzte: ‚Pokoj tomuto domu!' Ak tam bude syn pokoja, váš pokoj na\u00A0ňom spočinie; ak nie, vráti sa k\u00A0vám. V\u00A0tom dome potom ostaňte, jedzte a pite, čo majú, lebo robotník si zaslúži svoju mzdu.<br>" +
                            "Neprechádzajte z\u00A0domu do\u00A0domu!<br>" +
                            "A keď prídete do\u00A0niektorého mesta a prijmú vás, jedzte, čo vám predložia, uzdravujte chorých, čo sú v\u00A0ňom, a povedzte im: ‚Priblížilo sa k\u00A0vám Božie kráľovstvo.'\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"26gk+", "", "", "Jn 2, 13-22",
                    "Hovoril o\u00A0chráme svojho tela",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jana<br>" +
                            "Blízko bola židovská Veľká noc a Ježiš vystúpil do\u00A0Jeruzalema.<br>" +
                            "V chráme našiel predavačov dobytka, oviec a holubov i peňazomencov, čo tam sedeli. Urobil si z\u00A0povrázkov bič a všetkých vyhnal z\u00A0chrámu, aj ovce a dobytok. Peňazomencom rozhádzal peniaze a poprevracal stoly a predavačom holubov povedal: \"Odneste to odtiaľto! Nerobte z\u00A0domu môjho Otca tržnicu!\"<br>" +
                            "Jeho učeníci si spomenuli, že je napísané: \"Strávi ma horlivosť za\u00A0tvoj dom.\"<br>" +
                            "Židia sa ho opýtali: \"Aké znamenie nám ukážeš, že môžeš toto robiť? \"<br>" +
                            "Ježiš im odpovedal: \"Zborte tento chrám a za\u00A0tri dni ho postavím. \"<br>" +
                            "Židia povedali: \"Štyridsaťšesť rokov stavali tento chrám a ty ho postavíš za\u00A0tri dni?\"<br>" +
                            "Ale on hovoril o\u00A0chráme svojho tela.<br>" +
                            "Keď potom vstal z\u00A0mŕtvych, jeho učeníci si spomenuli, že toto hovoril, a uverili Písmu i slovu, ktoré povedal Ježiš. <br>" +
                            "Počuli sme slovo Pánovo."},
            {"28g", "", "", "Lk 6, 12-19",
                    "Strávil celú noc v\u00A0modlitbe. Vyvolil si z\u00A0nich Dvanástich, ktorých nazval apoštolmi",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "V tých dňoch vyšiel Ježiš na\u00A0vrch modliť sa a strávil celú noc v\u00A0modlitbe s\u00A0Bohom.<br>" +
                            "Keď sa rozodnilo, zavolal si učeníkov a vyvolil si z\u00A0nich Dvanástich, ktorých nazval apoštolmi: Šimona, ktorému dal meno Peter, a jeho brata Ondreja, Jakuba, Jána, Filipa, Bartolomeja, Matúša, Tomáša, Jakuba Alfejovho, Šimona, ktorého volali Horlivec, Júdu Jakubovho a Judáša Iškariotského, ktorý sa stal zradcom.<br>" +
                            "Zostúpil s\u00A0nimi dolu a zastal na\u00A0rovine i veľký zástup jeho učeníkov a veľké množstvo ľudu z\u00A0celej Judey i z\u00A0Jeruzalema aj z\u00A0týrskeho a sidonského pobrežia. Prišli ho počúvať a dať sa uzdraviť zo\u00A0svojich neduhov. A ozdraveli aj tí, ktorých trápili nečistí duchovia.<br>" +
                            "A každý zo\u00A0zástupu sa usiloval dotknúť sa ho, lebo vychádzala z\u00A0neho sila a uzdravovala všetkých.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"31gk", "", "", "Mt 5, 1-12a",
                    "Blahoslavení chudobní v\u00A0duchu",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Keď Ježiš videl veľké zástupy, vystúpil na\u00A0vrch. A keď sa posadil, pristúpili k\u00A0nemu jeho učeníci. Otvoril ústa a učil ich: \"Blahoslavení chudobní v\u00A0duchu, lebo ich je nebeské kráľovstvo.<br>" +
                            "Blahoslavení plačúci, lebo oni budú potešení.<br>" +
                            "Blahoslavení tichí, lebo oni budú dedičmi zeme.<br>" +
                            "Blahoslavení lační a smädní po\u00A0spravodlivosti, lebo oni budú nasýtení.<br>" +
                            "Blahoslavení milosrdní, lebo oni dosiahnu milosrdenstvo.<br>" +
                            "Blahoslavení čistého srdca, lebo oni uvidia Boha.<br>" +
                            "Blahoslavení tí, čo šíria pokoj, lebo ich budú volať Božími synmi.<br>" +
                            "Blahoslavení prenasledovaní pre\u00A0spravodlivosť, lebo ich je nebeské kráľovstvo.<br>" +
                            "Blahoslavení ste, keď vás budú pre\u00A0mňa potupovať a prenasledovať a všetko zlé na\u00A0vás nepravdivo hovoriť; radujte sa a jasajte, lebo máte hojnú odmenu v\u00A0nebi.\"<br>" +
                            "Počuli sme slovo Pánovo."},
    };

    String[][] evanjelium11 = {
            {"01gk", "", "", "Mt 5, 1-12a",
                    "Blahoslavení chudobní v\u00A0duchu",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Keď Ježiš videl veľké zástupy, vystúpil na\u00A0vrch. A keď sa posadil, pristúpili k\u00A0nemu jeho učeníci. Otvoril ústa a učil ich: \"Blahoslavení chudobní v\u00A0duchu, lebo ich je nebeské kráľovstvo.<br>" +
                            "Blahoslavení plačúci, lebo oni budú potešení.<br>" +
                            "Blahoslavení tichí, lebo oni budú dedičmi zeme.<br>" +
                            "Blahoslavení lační a smädní po\u00A0spravodlivosti, lebo oni budú nasýtení.<br>" +
                            "Blahoslavení milosrdní, lebo oni dosiahnu milosrdenstvo.<br>" +
                            "Blahoslavení čistého srdca, lebo oni uvidia Boha.<br>" +
                            "Blahoslavení tí, čo šíria pokoj, lebo ich budú volať Božími synmi.<br>" +
                            "Blahoslavení prenasledovaní pre\u00A0spravodlivosť, lebo ich je nebeské kráľovstvo.<br>" +
                            "Blahoslavení ste, keď vás budú pre\u00A0mňa potupovať a prenasledovať a všetko zlé na\u00A0vás nepravdivo hovoriť; radujte sa a jasajte, lebo máte hojnú odmenu v\u00A0nebi.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"02an", "", "", "Jn 14, 1-6",
                    "Ja som cesta, pravda a život",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Nech sa vám srdce nevzrušuje! Veríte v\u00A0Boha, verte aj vo\u00A0mňa. V\u00A0dome môjho Otca je mnoho príbytkov. Keby to tak nebolo bol by som vám povedal, že vám idem pripraviť miesto?! Keď odídem a pripravím vám miesto, zasa prídem a vezmem vás k\u00A0sebe, aby ste aj vy boli tam, kde som ja. A cestu, kam idem, poznáte.\"<br>" +
                            "Tomáš mu povedal: \"Pane, nevieme, kam ideš. Akože môžeme poznať cestu?!\"<br>" +
                            "Ježiš mu odpovedal: \"Ja som cesta, pravda a život. Nik nepríde k\u00A0Otcovi, iba cezo mňa.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"02bn", "", "", "Jn 6, 51-58",
                    "Kto bude jesť z\u00A0tohoto chleba, bude žiť naveky; a ja ho vzkriesim v\u00A0posledný deň",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal zástupom: \"Ja som živý chlieb, ktorý zostúpil z\u00A0neba. Kto bude jesť z\u00A0tohoto chleba, bude žiť naveky. A chlieb, ktorý ja dám, je moje telo za\u00A0život sveta.\"<br>" +
                            "Židia sa hádali medzi sebou a hovorili: \"Ako nám tento môže dať jesť svoje telo?!\"<br>" +
                            "Ježiš im povedal: \"Veru, veru, hovorím vám: Ak nebudete jesť telo Syna človeka a piť jeho krv, nebudete mať v\u00A0sebe život.<br>" +
                            "Kto je moje telo a pije moju krv, má večný život a ja ho vzkriesim v\u00A0posledný deň.<br>" +
                            "Lebo moje telo je pravý pokrm a moja krv je pravý nápoj. Kto je moje telo a pije moju krv, ostáva vo\u00A0mne a ja v\u00A0ňom. Ako mňa poslal živý Otec a ja žijem z\u00A0Otca, aj ten, čo mňa je, bude žiť zo\u00A0mňa.<br>" +
                            "Toto je ten chlieb, ktorý zostúpil z\u00A0neba, a nie aký jedli otcovia a pomreli.<br>" +
                            "Kto je tento chlieb, bude žiť naveky.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"02cn", "", "", "Mt 25, 1-13",
                    "Hľa, ženích prichádza, vyjdite mu v\u00A0ústrety",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom toto podobenstvo: \"Nebeské kráľovstvo sa bude podobať desiatim pannám, ktoré si vzali lampy a vyšli naproti ženíchovi. Päť z\u00A0nich bolo nerozumných a päť múdrych. Nerozumné si vzali lampy, ale olej si so\u00A0sebou nevzali. Múdre si vzali s\u00A0lampami aj olej do\u00A0nádob.<br>" +
                            "Keď ženích neprichádzal, všetkým sa začalo driemať a zaspali. O\u00A0polnoci sa strhol krik: ‚Ženích prichádza, vyjdite mu v\u00A0ústrety!'<br>" +
                            "Všetky panny sa prebudili a pripravovali si lampy.<br>" +
                            "Tu nerozumné panny povedali múdrym: ‚Dajte nám zo\u00A0svojho oleja, lebo naše lampy hasnú.'<br>" +
                            "Ale múdre odvetili: ‚Aby azda nebolo ani nám ani vám málo, choďte radšej k\u00A0predavačom a kúpte si!'<br>" +
                            "No kým išli kupovať olej, prišiel ženích a tie, čo boli pripravené, vošli s\u00A0ním na\u00A0svadbu a dvere sa zatvorili.<br>" +
                            "Napokon prišli aj ostatné panny a vraveli: ‚Pane, Pane, otvor nám!'<br>" +
                            "Ale on im povedal: ‚Veru, hovorím vám: Nepoznám vás.'<br>" +
                            "Preto bdejte, lebo neviete ani dňa ani hodiny.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"09g", "", "", "Jn 2, 13-22",
                    "Hovoril o\u00A0chráme svojho tela",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Blízko bola židovská Veľká noc a Ježiš vystúpil do\u00A0Jeruzalema.<br>" +
                            "V chráme našiel predavačov dobytka, oviec a holubov i peňazomencov, čo tam sedeli. Urobil si z\u00A0povrázkov bič a všetkých vyhnal z\u00A0chrámu, aj ovce a dobytok. Peňazomencom rozhádzal peniaze a poprevracal stoly a predavačom holubov povedal: \"Odneste to odtiaľto! Nerobte z\u00A0domu môjho Otca tržnicu!\"<br>" +
                            "Jeho učeníci si spomenuli, že je napísané: \"Strávi ma horlivosť za\u00A0tvoj dom.\"<br>" +
                            "Židia sa ho opýtali: \"Aké znamenie nám ukážeš, že môžeš toto robiť?\"<br>" +
                            "Ježiš im odpovedal: \"Zborte tento chrám a za\u00A0tri dni ho postavím.\"<br>" +
                            "Židia povedali: \"Štyridsaťšesť rokov stavali tento chrám a ty ho postavíš za\u00A0tri dni?\"<br>" +
                            "Ale on hovoril o\u00A0chráme svojho tela.<br>" +
                            "Keď potom vstal z\u00A0mŕtvych, jeho učeníci si spomenuli, že toto hovoril, a uverili Písmu i slovu, ktoré povedal Ježiš.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"11g", "", "", "Mt 25, 31-40",
                    "Čokoľvek ste urobili mojim najmenším bratom, mne ste urobili",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Až príde Syn človeka vo\u00A0svojej sláve a s\u00A0ním všetci anjeli, zasadne na\u00A0trón svojej slávy. Vtedy sa pred\u00A0ním zhromaždia všetky národy a on oddelí jedných od\u00A0druhých, ako pastier oddeľuje ovce od\u00A0capov. Ovce si postaví sprava a capov zľava.<br>" +
                            "Potom Kráľ povie tým, čo budú po\u00A0jeho pravici: ‚Poďte, požehnaní môjho Otca, zaujmite kráľovstvo, ktoré je pre\u00A0vás pripravené od\u00A0stvorenia sveta. Lebo som bol hladný a dali ste mi jesť; bol som smädný a dali ste mi piť; bol som pocestný a pritúlili ste ma; bol som nahý a priodeli ste ma; bol som chorý a navštívili ste ma; bol som vo\u00A0väzení a prišli ste ku\u00A0mne.'<br>" +
                            "Vtedy mu spravodliví povedia: ‚Pane, a kedy sme ťa videli hladného a nakŕmili sme ťa, alebo smädného a dali sme ti piť? Kedy sme ťa videli ako pocestného a pritúlili sme ťa, alebo nahého a priodeli sme ťa? Kedy sme ťa videli chorého alebo vo\u00A0väzení a prišli sme k\u00A0tebe?'<br>" +
                            "Kráľ im odpovie: ‚Veru, hovorím vám: Čokoľvek ste urobili jednému z\u00A0týchto mojich najmenších bratov, mne ste urobili.'\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"17gk", "", "", "Lk 6, 27-38",
                    "Buďte milosrdní, ako je milosrdný váš Otec!",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Vám, ktorí ma počúvate, hovorím: Milujte svojich nepriateľov, robte dobre tým, čo vás nenávidia, žehnajte tým, čo vás preklínajú, a modlite sa za\u00A0tých, čo vás potupujú!<br>" +
                            "Tomu, kto ťa udrie po\u00A0líci, nadstav aj druhé. A tomu, kto ti berie plášť, neodopri ani šaty. Každému, kto ťa prosí, daj a ak ti niekto niečo vezme, nežiadaj to naspäť. Ako chcete, aby ľudia robili vám, tak robte aj vy im!<br>" +
                            "Ak milujete tých, ktorí vás milujú, akúže máte zásluhu? Veď aj hriešnici milujú tých, čo ich milujú. Ak robíte dobre tým, čo vám dobre robia, akúže máte zásluhu? Veď to isté robia aj hriešnici. A ak požičiavate tým, od\u00A0ktorých to dúfate dostať naspäť, akúže máte zásluhu? Veď aj hriešnici požičiavajú hriešnikom, aby dostali naspäť to isté.<br>" +
                            "Ale milujte svojich nepriateľov, dobre robte, požičiavajte a nič za\u00A0to nečakajte! Tak bude vaša odmena veľká a budete synmi Najvyššieho, lebo on je dobrý aj k\u00A0nevďačným a zlým.<br>" +
                            "Buďte milosrdní, ako je milosrdný váš Otec! Nesúďte a nebudete súdení! Neodsudzujte a nebudete odsúdení! Odpúšťajte a odpustí sa vám! Dávajte a dajú vám: mieru dobrú, natlačenú, natrasenú, vrchovatú vám dajú do\u00A0lona. Lebo akou mierou budete merať vy, takou sa nameria aj vám.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"18", "", "", "Mt 14, 22-33",
                    "Rozkáž, aby som prišiel k\u00A0tebe po\u00A0vode",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Len čo Ježiš nasýtil zástupy, rozkázal učeníkom, aby nastúpili na\u00A0loďku a išli pred\u00A0ním na\u00A0druhý breh, kým on rozpustí zástupy. Keď rozpustil zástupy, vystúpil sám na\u00A0vrch modliť sa. Zvečerilo sa a on tam bol sám. Loďka bola už mnoho stadií od\u00A0zeme a zmietali ňou vlny, lebo vietor dul proti nim.<br>" +
                            "Nad ránom sa, kráčajúc po\u00A0mori, blížil k\u00A0nim Ježiš.<br>" +
                            "Keď ho učeníci videli kráčať po\u00A0mori, vzrušení vraveli: \"Mátoha!\" A od\u00A0strachu vykríkli.<br>" +
                            "Ale Ježiš sa im hneď prihovoril: \"Vzchopte sa! To som ja, nebojte sa!\"<br>" +
                            "Peter mu povedal: \"Pane, ak si to ty, rozkáž, aby som prišiel k\u00A0tebe po\u00A0vode.\"<br>" +
                            "On povedal: \"Poď!\"<br>" +
                            "Peter vystúpil z\u00A0loďky, vykročil po\u00A0vode a šiel k\u00A0Ježišovi. Ale keď videl silný vietor, naľakal sa. Začal sa topiť a vykríkol: \"Pane, zachráň ma!\"<br>" +
                            "Ježiš hneď vystrel ruku, zachytil ho a povedal mu: \"Maloverný, prečo si pochyboval?\" A keď vstúpili do\u00A0loďky, vietor utíchol. Tí, čo boli na\u00A0loďke, klaňali sa mu a vraveli: \"Naozaj si Boží Syn!\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"21", "", "", "Mt 12, 46-50",
                    "Vystrel ruku nad\u00A0svojich učeníkov a povedal: Hľa, moja matka a moji bratia",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Kým Ježiš hovoril zástupom, vonku stála jeho matka a bratia a chceli sa s\u00A0ním rozprávať. Ktosi mu povedal: \"Vonku stojí tvoja matka a tvoji bratia a chcú sa s\u00A0tebou rozprávať.\" On však odvetil tomu, čo mu to vravel: \"Kto je moja matka a kto sú moji bratia?\"<br>" +
                            "Vystrel ruku nad\u00A0svojich učeníkov a povedal: \"Hľa, moja matka a moji bratia. Lebo každý, kto plní vôľu môjho Otca, ktorý je na\u00A0nebesiach, je môj brat i sestra i matka.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"30g", "", "", "Mt 4, 18-22",
                    "Oni hneď zanechali siete a išli za\u00A0ním",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Keď raz Ježiš kráčal popri Galilejskom mori, videl dvoch bratov, Šimona, ktorý sa volá Peter, a jeho brata Ondreja, ako spúšťajú sieť do\u00A0mora; boli totiž rybármi.<br>" +
                            "I povedal im: \"Poďte za\u00A0mnou a urobím z\u00A0vás rybárov ľudí.\" Oni hneď zanechali siete a išli za\u00A0ním.<br>" +
                            "Ako šiel odtiaľ ďalej, videl iných dvoch bratov, Jakuba Zebedejovho a jeho brata Jána, ako na\u00A0lodi so\u00A0svojím otcom Zebedejom opravujú siete, aj ich povolal.<br>" +
                            "Oni hneď zanechali loď i svojho otca a išli za\u00A0ním.<br>" +
                            "Počuli sme slovo Pánovo."},
    };

    String[][] evanjelium12 = {
            {"03g", "", "", "Mk 16, 15-20",
                    "Choďte do\u00A0celého sveta a hlásajte evanjelium",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Ježiš sa zjavil Jedenástim a povedal im: \"Choďte do\u00A0celého sveta a hlásajte evanjelium všetkému stvoreniu.<br>" +
                            "Kto uverí a dá sa pokrstiť, bude spasený; ale kto neuverí, bude odsúdený.<br>" +
                            "A tých, čo uveria, budú sprevádzať tieto znamenia: v\u00A0mojom mene budú vyháňať zlých duchov, budú hovoriť novými jazykmi, hady budú brať do\u00A0rúk a ak niečo smrtonosné vypijú, neuškodí im; na\u00A0chorých budú vkladať ruky a tí ozdravejú.\"<br>" +
                            "Keď im to Pán Ježiš povedal, vzatý bol do\u00A0neba a zasadol po\u00A0pravici Boha.<br>" +
                            "Oni sa rozišli a všade kázali. Pán im pomáhal a ich slová potvrdzoval znameniami, ktoré ich sprevádzali.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"17", "", "", "Mt 1, 1-17",
                    "Rodokmeň Ježiša Krista, Dávidovho syna",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Rodokmeň Ježiša Krista, syna Dávidovho, syna Abrahámovho.<br>" +
                            "Abrahám mal syna Izáka, Izák Jakuba, Jakub Júdu a jeho bratov, Júda Faresa a Záru z\u00A0Tamary. Fares mal syna Ezroma, Ezrom Arama. Aram mal syna Aminadaba, Aminadab Násona, Náson Salmona, Salmon mal syna Bóza z\u00A0Rachaby, Bóz Obeda z\u00A0Rút. Obed Jesseho a Jesse kráľa Dávida.<br>" +
                            "Dávid mal syna Šalamúna z\u00A0Uriášovej ženy. Šalamún mal syna Roboama, Roboam Abiáša, Abiáš Azu, Aza Jozafata, Jozafat Jorama, Joram Oziáša. Oziáš mal syna Joatama, Joatam Achaza, Achaz Ezechiáša. Ezechiáš mal syna Manassesa, Manasses Amona, Amon Joziáša, Joziáš Jechoniáša a jeho bratov za\u00A0babylonského zajatia.<br>" +
                            "Po babylonskom zajatí Jechoniáš mal syna Salatiela, Salatiel Zorobábela, Zorobábel Abiuda, Abiud Eliakima, Eliakim Azora. Azor mal syna Sadoka, Sadok Achima, Achim Eliuda. Eliud mal syna Eleazara, Eleazar Matana, Matan Jakuba. Jakub mal syna Jozefa, manžela Márie, z\u00A0ktorej sa narodil Ježiš, nazývaný Kristus.<br>" +
                            "Všetkých pokolení od\u00A0Abraháma po\u00A0Dávida bolo štrnásť, od\u00A0Dávida po\u00A0babylonské zajatie štrnásť a štrnásť od\u00A0babylonského zajatia po\u00A0Krista.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"18", "", "", "Mt 1, 18-24",
                    "Ježiš sa narodí z\u00A0Márie, zasnúbenej s\u00A0Jozefom, Dávidovým synom",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "S narodením Ježiša Krista to bolo takto: Jeho matka Mária bola zasnúbená s\u00A0Jozefom. Ale skôr, ako by boli začali spolu bývať, ukázalo sa, že počala z\u00A0Ducha Svätého.<br>" +
                            "Jozef, jej manžel, bol človek spravodlivý a nechcel ju vystaviť potupe, preto ju zamýšľal potajomky prepustiť.<br>" +
                            "Ako o\u00A0tom uvažoval, zjavil sa mu vo\u00A0sne Pánov anjel a povedal: \"Jozef, syn Dávidov, neboj sa prijať Máriu, svoju manželku, lebo to, čo sa v\u00A0nej počalo, je z\u00A0Ducha Svätého. Porodí syna a dáš mu meno Ježiš; lebo on vyslobodí svoj ľud z\u00A0hriechov.\"<br>" +
                            "To všetko sa stalo, aby sa splnilo, čo Pán povedal ústami proroka: \"Hľa, panna počne a porodí syna a dajú mu meno Emanuel,\" čo v\u00A0preklade znamená: Boh s\u00A0nami.<br>" +
                            "Keď sa Jozef prebudil, urobil, ako mu prikázal Pánov anjel, a prijal svoju manželku.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"19", "", "", "Lk 1, 5-25",
                    "Gabriel zvestuje narodenie Jána Krstiteľa",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Za čias judejského kráľa Herodesa žil istý kňaz menom Zachariáš z\u00A0Abiášovej kňazskej triedy. Jeho manželka pochádzala z\u00A0Áronových dcér a volala sa Alžbeta. Obaja boli spravodliví pred\u00A0Bohom a bezúhonne zachovávali všetky Pánove prikázania a ustanovenia. Nemali však deti, lebo Alžbeta bola neplodná a obaja boli v\u00A0pokročilom veku.<br>" +
                            "Keď raz prišiel rad na\u00A0jeho triedu a on konal kňazskú službu pred\u00A0Bohom, podľa zvyku kňazského úradu lósom mu pripadlo vojsť do\u00A0Pánovho chrámu a priniesť kadidlovú obetu. V\u00A0čase kadidlovej obety sa vonku modlilo množstvo ľudu.<br>" +
                            "Tu sa mu zjavil Pánov anjel; stál na\u00A0pravej strane kadidlového oltára. Keď ho Zachariáš zbadal, zľakol sa a zmocňovala sa ho hrôza. Ale anjel mu povedal: \"Neboj sa, Zachariáš, lebo je vyslyšaná tvoja modlitba. Tvoja manželka Alžbeta ti porodí syna a dáš mu meno Ján. Budeš sa radovať a plesať a jeho narodenie poteší mnohých. Lebo on bude veľký pred\u00A0Pánom. Víno a opojný nápoj piť nebude a už v\u00A0matkinom lone ho naplní Duch Svätý. Mnohých synov Izraela obráti k\u00A0Pánovi, ich Bohu. Sám pôjde pred\u00A0ním s\u00A0Eliášovým duchom a mocou, aby obrátil srdcia otcov k\u00A0synom a neveriacich k\u00A0múdrosti spravodlivých a pripravil Pánovi dokonalý ľud.\"<br>" +
                            "Zachariáš povedal anjelovi: \"Podľa čoho to poznám? Veď ja som starec a moja manželka je v\u00A0pokročilom veku.\"<br>" +
                            "Anjel mu odpovedal: \"Ja som Gabriel. Stojím pred\u00A0Bohom a som poslaný hovoriť s\u00A0tebou a oznámiť ti túto radostnú zvesť. Ale onemieš a nebudeš môcť hovoriť až do\u00A0dňa, keď sa toto stane, lebo si neuveril mojim slovám, ktoré sa splnia v\u00A0svojom čase.\"<br>" +
                            "Ľud čakal na\u00A0Zachariáša a divil sa, že sa tak dlho zdržuje v\u00A0chráme. Ale keď vyšiel, nemohol k\u00A0nim prehovoriť; a oni pochopili, že mal v\u00A0chráme videnie. Dával im znaky a zostal nemý.<br>" +
                            "Len čo sa skončili dni jeho služby, vrátil sa domov. Po\u00A0tých dňoch jeho manželka Alžbeta počala, ale skrývala sa päť mesiacov a hovorila: \"Toto mi urobil Pán v\u00A0čase, keď zhliadol na\u00A0mňa, aby ma zbavil hanby pred\u00A0ľuďmi.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"20", "", "", " Lk 1, 26-38",
                    "Počneš a porodíš syna",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Boh poslal anjela Gabriela do\u00A0galilejského mesta, ktoré sa volá Nazaret, k\u00A0panne zasnúbenej mužovi z\u00A0rodu Dávidovho, menom Jozefovi. A meno panny bolo Mária.<br>" +
                            "Anjel prišiel k\u00A0nej a povedal: \"Zdravas', milosti plná, Pán s\u00A0tebou.\"<br>" +
                            "Ona sa nad\u00A0jeho slovami zarazila a rozmýšľala, čo znamená takýto pozdrav.<br>" +
                            "Anjel jej povedal: \"Neboj sa, Mária, našla si milosť u\u00A0Boha. Počneš a porodíš syna a dáš mu meno Ježiš. On bude veľký a bude sa volať Synom Najvyššieho. Pán, Boh, mu dá trón jeho otca Dávida, naveky bude kraľovať nad\u00A0Jakubovým rodom a jeho kráľovstvu nebude konca.\"<br>" +
                            "Mária povedala anjelovi: \"Ako sa to stane, veď ja muža nepoznám?\"<br>" +
                            "Anjel jej odpovedal: \"Duch Svätý zostúpi na\u00A0teba a moc Najvyššieho ťa zatieni. A preto aj dieťa bude sa volať svätým, bude to Boží Syn. Aj Alžbeta, tvoja príbuzná, počala syna v\u00A0starobe. Už je v\u00A0šiestom mesiaci. A hovorili o\u00A0nej, že je neplodná! Lebo Bohu nič nie je nemožné.\"<br>" +
                            "Mária povedala: \"Hľa, služobnica Pána, nech sa mi stane podľa tvojho slova.\"<br>" +
                            "Anjel potom od\u00A0nej odišiel.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"21", "", "", "Lk 1, 39-45",
                    "Čím som si zaslúžila, že matka môjho Pána prichádza ku\u00A0mne?",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "V tých dňoch sa Mária vydala na\u00A0cestu a ponáhľala sa do\u00A0istého judejského mesta v\u00A0hornatom kraji. Vošla do\u00A0Zachariášovho domu a pozdravila Alžbetu. Len čo Alžbeta začula Máriin pozdrav, dieťa v\u00A0jej lone sa zachvelo a Alžbetu naplnil Duch Svätý. Vtedy zvolala veľkým hlasom: \"Požehnaná si medzi ženami a požehnaný je plod tvojho života. Čím som si zaslúžila, že matka môjho Pána prichádza ku\u00A0mne? Lebo len čo zaznel tvoj pozdrav v\u00A0mojich ušiach, radosťou sa zachvelo dieťa v\u00A0mojom lone. A blahoslavená je tá, ktorá uverila, že sa splní, čo jej povedal Pán.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"22", "", "", "Lk 1, 46-56",
                    "Veľké veci mi urobil ten, ktorý je mocný",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Mária hovorila: \"Velebí moja duša Pána a môj duch jasá v\u00A0Bohu, mojom Spasiteľovi, lebo zhliadol na\u00A0poníženosť svojej služobnice. Hľa, od\u00A0tejto chvíle blahoslaviť ma budú všetky pokolenia, lebo veľké veci mi urobil ten, ktorý je mocný, a sväté je jeho meno a jeho milosrdenstvo z\u00A0pokolenia na\u00A0pokolenie s\u00A0tými, čo sa ho boja.<br>" +
                            "Ukázal silu svojho ramena, rozptýlil tých, čo v\u00A0srdci pyšne zmýšľajú. Mocnárov zosadil z\u00A0trónov a povýšil ponížených. Hladných nakŕmil dobrotami a bohatých prepustil naprázdno.<br>" +
                            "Ujal sa Izraela, svojho služobníka, lebo pamätá na\u00A0svoje milosrdenstvo, ako sľúbil našim otcom, Abrahámovi a jeho potomstvu naveky.\"<br>" +
                            "Mária zostala pri\u00A0Alžbete asi tri mesiace a potom sa vrátila domov.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"23", "", "", "Lk 1, 57-66",
                    "Narodenie Jána Krstiteľa",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Alžbete nadišiel čas pôrodu a porodila syna. Keď jej susedia a príbuzní počuli, že jej Pán prejavil svoje veľké milosrdenstvo, radovali sa s\u00A0ňou.<br>" +
                            "Na ôsmy deň prišli chlapca obrezať a chceli mu dať meno Zachariáš po\u00A0jeho otcovi. Ale jeho matka povedala: \"Nie, bude sa volať Ján.\"<br>" +
                            "Povedali jej: \"Veď v\u00A0tvojom príbuzenstve sa nik takto nevolá.\"<br>" +
                            "Dali znak otcovi, ako ho chce nazvať on. Vypýtal si tabuľku a napísal: \"Ján sa bude volať.\" A všetci sa divili.<br>" +
                            "Vtom sa mu rozviazali ústa a jazyk i prehovoril a velebil Boha.<br>" +
                            "Všetkých ich susedov zmocnil sa strach a všade po\u00A0judejských horách sa hovorilo o\u00A0týchto udalostiach. A všetci, čo to počuli, vštepili si to do\u00A0srdca a vraveli: \"Čím len bude tento chlapec?\" A vskutku Pánova ruka bola s\u00A0ním.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"24", "", "", "Lk 1, 67-79",
                    "Navštívi nás Vychádzajúci z\u00A0výsosti",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Jánovho otca Zachariáša naplnil Duch Svätý a takto prorokoval: \"Nech je zvelebený Pán, Boh Izraela, lebo navštívil a vykúpil svoj ľud a vzbudil nám mocného Spasiteľa z\u00A0rodu Dávida, svojho služobníka, ako odpradávna hovoril ústami svojich svätých prorokov, že nás oslobodí od\u00A0našich nepriateľov a z\u00A0rúk všetkých, čo nás nenávidia. Preukázal milosrdenstvo našim otcom a pamätá na\u00A0svoju svätú zmluvu, na\u00A0prísahu, ktorou sa zaviazal nášmu otcovi Abrahámovi, že nás vyslobodí z\u00A0rúk nepriateľov, aby sme mu bez\u00A0strachu slúžili vo\u00A0svätosti a spravodlivosti pred\u00A0jeho tvárou po\u00A0všetky dni nášho života.<br>" +
                            "A ty, chlapček, budeš sa volať prorokom Najvyššieho: pôjdeš pred\u00A0tvárou Pána, pripravíš mu cestu a poučíš jeho ľud o\u00A0spáse, že mu náš Boh z\u00A0hĺbky svojho milosrdenstva odpustí hriechy. Tak nás Vychádzajúci z\u00A0výsosti navštívi a zažiari tým, čo sedia vo\u00A0tme a v\u00A0tôni smrti, a naše kroky upriami na\u00A0cestu pokoja.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"24gkn", "", "", "Mt 1, 1-25",
                    "Rodokmeň Ježiša Krista, Dávidovho syna",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Rodokmeň Ježiša Krista, syna Dávidovho, syna Abrahámovho. Abrahám mal syna Izáka, Izák Jakuba, Jakub Júdu a jeho bratov, Júda Faresa a Záru z\u00A0Tamary. Fares mal syna Ezroma, Ezrom Arama. Aram mal syna Aminadaba, Aminadab Násona, Náson Salmona, Salmon mal syna Bóza z\u00A0Rachaby, Bóz Obeda z\u00A0Rút, Obed Jesseho a Jesse kráľa Dávida.<br>" +
                            "Dávid mal syna Šalamúna z\u00A0Uriášovej ženy. Šalamún mal syna Roboama, Roboam Abiáša, Abiáš Azu, Aza Jozafata, Jozafat Jorama, Joram Oziáša. Oziáš mal syna Joatama, Joatam Achaza, Achaz Ezechiáša. Ezechiáš mal syna Manassesa, Manasses Amona, Amon Joziáša, Joziáš Jechoniáša a jeho bratov za\u00A0babylonského zajatia.<br>" +
                            "Po babylonskom zajatí Jechoniáš mal syna Salatiela, Salatiel Zorobábela, Zorobábel Abiuda, Abiud Eliakima, Eliakim Azora. Azor mal syna Sadoka, Sadok Achima, Achim Eliuda. Eliud mal syna Eleazara, Eleazar Matana, Matan Jakuba. Jakub mal syna Jozefa, manžela Márie, z\u00A0ktorej sa narodil Ježiš, nazývaný Kristus.<br>" +
                            "Všetkých pokolení od\u00A0Abraháma po\u00A0Dávida bolo štrnásť, od\u00A0Dávida po\u00A0babylonské zajatie štrnásť a štrnásť od\u00A0babylonského zajatia po\u00A0Krista.<br>" +
                            "S narodením Ježiša Krista to bolo takto: Jeho matka Mária bola zasnúbená s\u00A0Jozefom. Ale skôr, ako by boli začali spolu bývať, ukázalo sa, že počala z\u00A0Ducha Svätého.<br>" +
                            "Jozef, jej manžel, bol človek spravodlivý a nechcel ju vystaviť potupe, preto ju zamýšľal potajomky prepustiť. Ako o\u00A0tom uvažoval, zjavil sa mu vo\u00A0sne Pánov anjel a povedal: \"Jozef, syn Dávidov, neboj sa prijať Máriu, svoju manželku, lebo to, čo sa v\u00A0nej počalo, je z\u00A0Ducha Svätého. Porodí syna a dáš mu meno Ježiš; lebo on vyslobodí svoj ľud z\u00A0hriechov.\"<br>" +
                            "To všetko sa stalo, aby sa splnilo, čo Pán povedal ústami proroka: \"Hľa, panna počne a porodí syna a dajú mu meno Emanuel,\" čo v\u00A0preklade znamená: Boh s\u00A0nami.<br>" +
                            "Keď sa Jozef prebudil, urobil, ako mu prikázal Pánov anjel, a prijal svoju manželku. Ale nepoznal ju, kým neporodila syna; a dal mu meno Ježiš.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo kratšie:",
                    "Mt 1, 18-25",
                    "Mária porodí syna a dáš mu meno Ježiš",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "S narodením Ježiša Krista to bolo takto: Jeho matka Mária bola zasnúbená s\u00A0Jozefom. Ale skôr, ako by boli začali spolu bývať, ukázalo sa, že počala z\u00A0Ducha Svätého.<br>" +
                            "Jozef, jej manžel, bol človek spravodlivý a nechcel ju vystaviť potupe, preto ju zamýšľal potajomky prepustiť. Ako o\u00A0tom uvažoval, zjavil sa mu vo\u00A0sne Pánov anjel a povedal: \"Jozef, syn Dávidov, neboj sa prijať Máriu, svoju manželku, lebo to, čo sa v\u00A0nej počalo, je z\u00A0Ducha Svätého. Porodí syna a dáš mu meno Ježiš; lebo on vyslobodí svoj ľud z\u00A0hriechov.\"<br>" +
                            "To všetko sa stalo, aby sa splnilo, čo Pán povedal ústami proroka: \"Hľa, panna počne a porodí syna a dajú mu meno Emanuel,\" čo v\u00A0preklade znamená: Boh s\u00A0nami.<br>" +
                            "Keď sa Jozef prebudil, urobil, ako mu prikázal Pánov anjel, a prijal svoju manželku. Ale nepoznal ju, kým neporodila syna; a dal mu meno Ježiš.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"25agkn", "", "", "Lk 2, 1-14",
                    "Dnes sa vám narodil Spasiteľ",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "V tých dňoch vyšiel rozkaz od\u00A0cisára Augusta vykonať súpis ľudu po\u00A0celom svete. Tento prvý súpis sa konal, keď Sýriu spravoval Kvirínius. A všetci šli dať sa zapísať, každý do\u00A0svojho mesta.<br>" +
                            "Vybral sa aj Jozef z\u00A0galilejského mesta Nazareta do\u00A0Judey, do\u00A0Dávidovho mesta, ktoré sa volá Betlehem, lebo pochádzal z\u00A0Dávidovho domu a rodu, aby sa dal zapísať s\u00A0Máriou, svojou manželkou, ktorá bola v\u00A0požehnanom stave.<br>" +
                            "Kým tam boli, nadišiel jej čas pôrodu. I porodila svojho prvorodeného syna, zavinula ho do\u00A0plienok a uložila do\u00A0jasieľ, lebo pre\u00A0nich nebolo miesta v\u00A0hostinci.<br>" +
                            "V tom istom kraji boli pastieri, ktorí v\u00A0noci bdeli a strážili svoje stádo. Tu zastal pri\u00A0nich Pánov anjel a ožiarila ich Pánova sláva. Zmocnil sa ich veľký strach, ale anjel im povedal: \"Nebojte sa. Zvestujem vám veľkú radosť, ktorá bude patriť všetkým ľuďom: Dnes sa vám v\u00A0Dávidovom meste narodil Spasiteľ, Kristus Pán. A toto vám bude znamením: Nájdete dieťatko zavinuté do\u00A0plienok a uložené v\u00A0jasliach.\"<br>" +
                            "A hneď sa k\u00A0anjelovi pripojilo množstvo nebeských zástupov, zvelebovali Boha a hovorili: \"Sláva Bohu na\u00A0výsostiach a na\u00A0zemi pokoj ľuďom dobrej vôle.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"25bgkn", "", "", "Lk 2, 15-20",
                    "Pastieri našli Máriu a Jozefa i dieťa",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Keď anjeli odišli od\u00A0pastierov do\u00A0neba, pastieri si povedali: \"Poďme teda do\u00A0Betlehema a pozrime, čo sa to stalo, ako nám oznámil Pán.\"<br>" +
                            "Poponáhľali sa a našli Máriu a Jozefa i dieťa uložené v\u00A0jasliach. Keď ich videli, vyrozprávali, čo im bolo povedané o\u00A0tomto dieťati.<br>" +
                            "A všetci, ktorí to počúvali, divili sa nad\u00A0tým, čo im pastieri rozprávali. Ale Mária zachovávala všetky tieto slová vo\u00A0svojom srdci a premýšľala o\u00A0nich.<br>" +
                            "Pastieri sa potom vrátili a oslavovali a chválili Boha za\u00A0všetko, čo počuli a videli, ako im bolo povedané.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"25cgkn", "", "", "Jn 1, 1-18",
                    "Slovo sa telom stalo a prebývalo medzi nami",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Na počiatku bolo Slovo a Slovo bolo u\u00A0Boha a to Slovo bolo Boh.<br>" +
                            "Ono bolo na\u00A0počiatku u\u00A0Boha. Všetko povstalo skrze neho a bez\u00A0neho nepovstalo nič z\u00A0toho, čo povstalo. V\u00A0ňom bol život a život bol svetlom ľudí. A svetlo vo\u00A0tmách svieti, a tmy ho neprijali.<br>" +
                            "Bol človek, ktorého poslal Boh, volal sa Ján. Prišiel ako svedok vydať svedectvo o\u00A0svetle, aby skrze neho všetci uverili. On sám nebol svetlo, prišiel iba vydať svedectvo o\u00A0svetle.<br>" +
                            "Pravé svetlo, ktoré osvecuje každého človeka, prišlo na\u00A0svet. Bol na\u00A0svete a svet povstal skrze neho, a svet ho nepoznal. Prišiel do\u00A0svojho vlastného, a vlastní ho neprijali.<br>" +
                            "Ale tým, ktorí ho prijali, dal moc stať sa Božími deťmi: tým, čo uverili v\u00A0jeho meno, čo sa nenarodili ani z\u00A0krvi, ani z\u00A0vôle tela, ani z\u00A0vôle muža, ale z\u00A0Boha.<br>" +
                            "A Slovo sa telom stalo a prebývalo medzi nami. A my sme uvideli jeho slávu, slávu, akú má od\u00A0Otca jednorodený Syn, plný milosti a pravdy.<br>" +
                            "Ján o\u00A0ňom vydal svedectvo a volal: \"Toto je ten, o\u00A0ktorom som hovoril: Ten, čo príde po\u00A0mne, je predo\u00A0mnou, lebo bol prv ako ja.\"<br>" +
                            "Z jeho plnosti sme my všetci dostali milosť za\u00A0milosťou. Lebo ak zákon bol daný skrze Mojžiša, milosť a pravda prišli skrze Ježiša Krista.<br>" +
                            "Boha nikto nikdy nevidel. Jednorodený Boh, ktorý je v\u00A0lone Otca, ten o\u00A0ňom priniesol zvesť.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo kratšie:",
                    "Jn 1, 1-5. 9-14",
                    "Na počiatku bolo Slovo a Slovo bolo u\u00A0Boha a to Slovo bolo Boh.",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ono bolo na\u00A0počiatku u\u00A0Boha. Všetko povstalo skrze neho a bez\u00A0neho nepovstalo nič z\u00A0toho, čo povstalo. V\u00A0ňom bol život a život bol svetlom ľudí. A svetlo vo\u00A0tmách svieti, a tmy ho neprijali. Pravé svetlo, ktoré osvecuje každého človeka, prišlo na\u00A0svet. Bol na\u00A0svete a svet povstal skrze neho, a svet ho nepoznal.<br>" +
                            "Prišiel do\u00A0svojho vlastného, a vlastní ho neprijali. Ale tým, ktorí ho prijali, dal moc stať sa Božími deťmi: tým, čo uverili v\u00A0jeho meno, čo sa nenarodili ani z\u00A0krvi, ani z\u00A0vôle tela, ani z\u00A0vôle muža, ale z\u00A0Boha.<br>" +
                            "A Slovo sa telom stalo a prebývalo medzi nami. A my sme uvideli jeho slávu, slávu, akú má od\u00A0Otca jednorodený Syn, plný milosti a pravdy.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"26g", "", "", "Mt 10, 17-22",
                    "Pre mňa vás budú vláčiť pred\u00A0vladárov a kráľov, aby ste vydali svedectvo im aj pohanom",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim apoštolom: \"Chráňte sa ľudí, lebo vás vydajú súdom, budú vás bičovať vo\u00A0svojich synagógach a pre\u00A0mňa vás budú vláčiť pred\u00A0vladárov a kráľov, aby ste vydali svedectvo im aj pohanom.<br>" +
                            "Ale keď vás vydajú, nestarajte sa, ako a čo budete hovoriť, lebo v\u00A0tú hodinu vám bude dané, čo máte povedať. Veď to už nie vy budete hovoriť, ale Duch vášho Otca bude hovoriť vo\u00A0vás.<br>" +
                            "Brat vydá na\u00A0smrť brata a otec dieťa. Deti povstanú proti rodičom a pripravia ich o\u00A0život.<br>" +
                            "Všetci vás budú nenávidieť pre\u00A0moje meno. Ale kto vytrvá do\u00A0konca, bude spasený.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"27g", "", "", "Jn 20, 2-8",
                    "Ten druhý učeník bežal rýchlejšie, predbehol Petra a prišiel k\u00A0hrobu prvý",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Prvého dňa v\u00A0týždni bežala Mária Magdaléna a prišla k\u00A0Šimonovi Petrovi a k\u00A0inému učeníkovi, ktorého mal Ježiš tak rád, a povedala im: \"Odniesli Pána z\u00A0hrobu a nevieme, kde ho položili.\"<br>" +
                            "Peter a ten druhý učeník sa zobrali a išli k\u00A0hrobu. Bežali obaja, ale ten druhý učeník bežal rýchlejšie, predbehol Petra a prišiel k\u00A0hrobu prvý. Nahol sa a videl tam položené plachty; dnu však nevkročil.<br>" +
                            "Potom prišiel aj Šimon Peter, ktorý ho nasledoval, a vošiel do\u00A0hrobu. Videl tam položené plachty aj šatku, ktorú mal Ježiš na\u00A0hlave. Lenže tá nebola pri\u00A0plachtách, lež osobitne zvinutá na\u00A0inom mieste.<br>" +
                            "Vtedy vošiel aj druhý učeník, ten, čo prišiel k\u00A0hrobu prvý, a videl i uveril.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"28g", "", "", "Mt 2, 13-18",
                    "Herodes dal povraždiť všetkých chlapcov v\u00A0Betleheme",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Po odchode mudrcov sa Jozefovi vo\u00A0sne zjavil Pánov anjel a povedal: \"Vstaň, vezmi so\u00A0sebou dieťa i jeho matku, ujdi do\u00A0Egypta a zostaň tam, kým ti nedám vedieť, lebo Herodes bude hľadať dieťa, aby ho zmárnil.\"<br>" +
                            "On vstal, vzal za\u00A0noci dieťa i jeho matku a odišiel do\u00A0Egypta. Tam zostal až do\u00A0Herodesovej smrti, aby sa splnilo, čo povedal Pán ústami proroka: \"Z Egypta som povolal svojho syna.\"<br>" +
                            "Keď Herodes zbadal, že ho mudrci oklamali, veľmi sa rozhneval a dal povraždiť v\u00A0Betleheme a na\u00A0jeho okolí všetkých chlapcov od\u00A0dvoch rokov nadol, podľa času, ktorý zvedel od\u00A0mudrcov. Vtedy sa splnilo, čo povedal prorok Jeremiáš: \"V Ráme bolo počuť hlas, nárek a veľké kvílenie: Ráchel oplakáva svoje deti a odmieta útechu, lebo ich niet.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"29", "", "", "Lk 2, 22-35",
                    "Svetlo na\u00A0osvietenie pohanov",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Keď uplynuli podľa Mojžišovho zákona dni ich očisťovania, priniesli Ježiša jeho rodičia do\u00A0Jeruzalema, aby ho predstavili Pánovi, ako je napísané v\u00A0Pánovom zákone: \"Všetko mužského rodu, čo otvára lono matky, bude zasvätené Pánovi,\" a aby obetovali, ako káže Pánov zákon, pár hrdličiek alebo dva holúbky.<br>" +
                            "V Jeruzaleme žil vtedy muž menom Simeon, človek spravodlivý a nábožný, ktorý očakával potechu Izraela, a Duch Svätý bol na\u00A0ňom. Jemu Duch Svätý vyjavil, že neumrie, kým neuvidí Pánovho Mesiáša.<br>" +
                            "Z vnuknutia Ducha prišiel do\u00A0chrámu. A keď rodičia prinášali dieťa Ježiša, aby splnili, čo o\u00A0ňom predpisoval zákon, vzal ho aj on do\u00A0svojho náručia a velebil Boha slovami: \"Teraz prepustíš, Pane, svojho služobníka v\u00A0pokoji podľa svojho slova, lebo moje oči uvideli tvoju spásu, ktorú si pripravil pred\u00A0tvárou všetkých národov: svetlo na\u00A0osvietenie pohanov a slávu Izraela, tvojho ľudu.\"<br>" +
                            "Jeho otec a matka divili sa tomu, čo sa o\u00A0ňom hovorilo. Simeon ich požehnal a Márii, jeho matke, povedal: \"On je ustanovený na\u00A0pád a na\u00A0povstanie pre\u00A0mnohých v\u00A0Izraeli a na\u00A0znamenie, ktorému budú odporovať, – a tvoju vlastnú dušu prenikne meč –, aby vyšlo najavo zmýšľanie mnohých sŕdc.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"30", "", "", "Lk 2, 36-40",
                    "Hovorila o\u00A0ňom všetkým, čo očakávali vykúpenie Jeruzalema",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Žila vtedy prorokyňa Anna, Fanuelova dcéra, z\u00A0Aserovho kmeňa. Bola už vo\u00A0vysokom veku. Od\u00A0svojho panenstva žila so\u00A0svojím mužom sedem rokov, potom ako vdova do\u00A0osemdesiateho štvrtého roku. Z\u00A0chrámu neodchádzala, vo\u00A0dne v\u00A0noci slúžila Bohu pôstom a modlitbami.<br>" +
                            "Práve v\u00A0tú chvíľu prišla aj ona, velebila Boha a hovorila o\u00A0ňom všetkým, čo očakávali vykúpenie Jeruzalema.<br>" +
                            "A keď vykonali všetko podľa Pánovho zákona, vrátili sa do\u00A0Galiley, do\u00A0svojho mesta Nazareta.<br>" +
                            "Chlapec rástol a mocnel, plný múdrosti, a Božia milosť bola na\u00A0ňom.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"31", "", "", "Jn 1, 1-18",
                    "Slovo sa telom stalo a prebývalo medzi nami",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Na počiatku bolo Slovo a Slovo bolo u\u00A0Boha a to Slovo bolo Boh.<br>" +
                            "Ono bolo na\u00A0počiatku u\u00A0Boha. Všetko povstalo skrze neho a bez\u00A0neho nepovstalo nič z\u00A0toho, čo povstalo. V\u00A0ňom bol život a život bol svetlom ľudí. A svetlo vo\u00A0tmách svieti, a tmy ho neprijali.<br>" +
                            "Bol človek, ktorého poslal Boh, volal sa Ján. Prišiel ako svedok vydať svedectvo o\u00A0svetle, aby skrze neho všetci uverili. On sám nebol svetlo, prišiel iba vydať svedectvo o\u00A0svetle.<br>" +
                            "Pravé svetlo, ktoré osvecuje každého človeka, prišlo na\u00A0svet. Bol na\u00A0svete a svet povstal skrze neho, a svet ho nepoznal. Prišiel do\u00A0svojho vlastného, a vlastní ho neprijali.<br>" +
                            "Ale tým, ktorí ho prijali, dal moc stať sa Božími deťmi: tým, čo uverili v\u00A0jeho meno, čo sa nenarodili ani z\u00A0krvi, ani z\u00A0vôle tela, ani z\u00A0vôle muža, ale z\u00A0Boha.<br>" +
                            "A Slovo sa telom stalo a prebývalo medzi nami. A my sme uvideli jeho slávu, slávu, akú má od\u00A0Otca jednorodený Syn, plný milosti a pravdy.<br>" +
                            "Ján o\u00A0ňom vydal svedectvo a volal: \"Toto je ten, o\u00A0ktorom som hovoril: Ten, čo príde po\u00A0mne, je predo\u00A0mnou, lebo bol prv ako ja.\"<br>" +
                            "Z jeho plnosti sme my všetci dostali milosť za\u00A0milosťou. Lebo ak zákon bol daný skrze Mojžiša, milosť a pravda prišli skrze Ježiša Krista.<br>" +
                            "Boha nikto nikdy nevidel. Jednorodený Boh, ktorý je v\u00A0lone Otca, ten o\u00A0ňom priniesol zvesť.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"31gk", "", "", "Lk 2, 16-21",
                    "Našli Máriu a Jozefa i dieťa. Po\u00A0ôsmich dňoch dali mu meno Ježiš",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Pastieri sa poponáhľali do\u00A0Betlehema a našli Máriu a Jozefa i dieťa uložené v\u00A0jasliach. Keď ich videli, vyrozprávali, čo im bolo povedané o\u00A0tomto dieťati. A všetci, ktorí to počúvali, divili sa nad\u00A0tým, čo im pastieri rozprávali. Ale Mária zachovávala všetky tieto slová vo\u00A0svojom srdci a premýšľala o\u00A0nich.<br>" +
                            "Pastieri sa potom vrátili a oslavovali a chválili Boha za\u00A0všetko, čo počuli a videli, ako im bolo povedané.<br>" +
                            "Po ôsmich dňoch, keď ho bolo treba obrezať, dali mu meno Ježiš, ktorým ho anjel nazval skôr, ako sa počal v\u00A0živote matky.<br>" +
                            "Počuli sme slovo Pánovo."},
    };
}