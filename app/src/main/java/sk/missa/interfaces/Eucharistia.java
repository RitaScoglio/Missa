package sk.missa.interfaces;

/*
 * Vsuvky do eucharistických modlitieb v rôznych obdobiach: vsuvkyEM
 * Eucharistické modlitby: eucharistia1, eucharistia2, eucharistia3, eucharistia4
 * Eucharistické modliby v omšiach za zmierenie: eucharistiaZmierenie1, eucharistiaZmierenie2
 * dvojrozmerné polia sú rozdelené na tri časti podľa slov premenenia a v nich sa striedajú úseky menšieho a normálneho textu
 */

public interface Eucharistia {
    String[][] vsuvkaEM = {
            {"Na Narodenie Pána a cez oktávu",
                    "<br><font color='#B71C1C'>2.k</font> V spoločenstve s oslávenou Cirkvou<br>" +
                            "slávime <font color='#B71C1C'>(</font>presvätú noc<font color='#B71C1C'>)</font> presvätý deň,<br>" +
                            "keď preblahoslavená Mária<br>" +
                            "v neporušenom panenstve porodila svetu Spasiteľa,<br>" +
                            "a s úctou si spomíname<br>" +
                            "najmä na túto preblahoslavenú Máriu, vždy Pannu,<br>" +
                            "Rodičku Boha a nášho Pána Ježiša Krista,"},
            {"Na Zjavenie Pána",
                    "<br><font color='#B71C1C'>2.k</font> V spoločenstve s oslávenou Cirkvou<br>" +
                    "slávime presvätý deň,<br>" +
                    "keď tvoj jednorodený Syn,<br>" +
                    "rovnako večný s tebou v tvojej sláve,<br>" +
                    "viditeľne sa zjavil v našom ľudskom tele,<br>" +
                    "a s úctou si spomíname<br>" +
                    "najmä na preblahoslavenú Máriu, vždy Pannu,<br>" +
                    "Rodičku Boha a nášho Pána Ježiša Krista,"},
            {"Od omše Veľkonočnej vigílie až po Druhú veľkonočnú nedeľu",
                    "<br><font color='#B71C1C'>2.k</font> V spoločenstve s oslávenou Cirkvou<br>" +
                    "slávime <font color='#B71C1C'>(</font>presvätú noc<font color='#B71C1C'>)</font> presvätý deň,<br>" +
                    "keď náš Pán Ježiš Kristus vstal z mŕtvych,<br>" +
                    "a s úctou si spomíname<br>" +
                    "najmä na preblahoslavenú Máriu, vždy Pannu,<br>" +
                    "Rodičku Boha a nášho Pána Ježiša Krista,",
                    "<font color='#B71C1C'>Hl</font> Pane, milostivo prijmi túto obetu, ktorú ti predkladáme my, tvoji služobníci, i celá tvoja rodina. Prinášame ti ju aj za tých, ktorých si znovuzrodil z vody a z Ducha Svätého a udelil si im odpustenie všetkých hriechov. Spravuj naše dni vo svojom pokoji, zachráň nás od večného zatratenia a pripočítaj k zástupu svojich vyvolených."},
            {"Na Nanebovstúpenie Pána",
                    "<br><font color='#B71C1C'>2.k</font> V spoločenstve s oslávenou Cirkvou<br>" +
                            "slávime presvätý deň,<br>" +
                            "keď náš Pán, tvoj jednorodený Syn,<br>" +
                            "našu krehkú prirodzenosť, spojenú so svojím božstvom,<br>" +
                            "povýšil po pravici tvojej slávy,<br>" +
                            "a s úctou si spomíname<br>" +
                            "najmä na preblahoslavenú Máriu, vždy Pannu,<br>" +
                            "Rodičku Boha a nášho Pána Ježiša Krista,"},
            {"Na Turíce",
                    "<br><font color='#B71C1C'>2.k</font> V spoločenstve s oslávenou Cirkvou<br>" +
                    "slávime presvätý deň Turíc,<br>" +
                    "keď sa Duch Svätý v ohnivých jazykoch zjavil apoštolom,<br>" +
                    "a s úctou si spomíname<br>" +
                    "najmä na preblahoslavenú Máriu, vždy Pannu,<br>" +
                    "Rodičku Boha a nášho Pána Ježiša Krista,"},
            {"Zelený štvrtok", "<br><font color='#B71C1C'>2k</font> V spoločenstve s oslávenou Cirkvou<br>" +
                    "slávime presvätý deň,<br>" +
                    "keď sa náš Pán Ježiš Kristus vydal za nás na smrť<br>" +
                    "a s úctou si spomíname<br>" +
                    "najmä na preblahoslavenú Máriu, vždy Pannu,<br>" +
                    "Rodičku Boha a nášho Pána Ježiša Krista,",
                    "<font color='#B71C1C'>Hl</font> Pane, milostivo prijmi túto obetu,<br>" +
                    "ktorú ti predkladáme my, tvoji služobníci,<br>" +
                    " i celá tvoja rodina na pamiatku dňa,<br>" +
                    "keď náš Pán Ježiš Kristus<br>" +
                    "svojich učeníkov poveril<br>" +
                    "slávením sviatostných tajomstiev svojho Tela a Krvi.<br>" +
                    "Spravuj naše dni vo svojom pokoji,<br>" +
                    "zachráň nás od večného zatratenia<br>" +
                    "a pripočítaj k zástupu svojich vyvolených.", "On večer pred svojím umučením\n" +
                    "za spasenie nás i všetkých ľudí,\n" +
                    "čiže dnes,"},
            {"Biela sobota", "<br><font color='#B71C1C'>2.k</font> V spoločenstve s oslávenou Cirkvou<br>" +
                    "slávime presvätú noc <font color='#B71C1C'>(</font>presvätý deň<font color='#B71C1C'>)</font>,<br>" +
                    "keď náš Pán Ježiš Kristus vstal z mŕtvych,<br>" +
                    "a s úctou si spomíname<br>" +
                    "najmä na preblahoslavenú Máriu, vždy Pannu,<br>" +
                    "Rodičku Boha a nášho Pána Ježiša Krista",
                    "<font color='#B71C1C'>HI</font> Pane, milostivo prijmi túto obetu,<br>" +
                            "ktorú ti predkladáme my, tvoji služobníci,<br>" +
                            "i celá tvoja rodina.<br>" +
                            "Prinášame ti ju aj za tých,<br>" +
                            "ktorých si znovuzrodil z vody a z Ducha Svätého<br>" +
                            "a udelil si im odpustenie všetkých hriechov.<br>" +
                            "Spravuj naše dni vo svojom pokoji,<br>" +
                            "zachráň nás od večného zatratenia<br>" +
                            "a pripočítaj k zástupu svojich vyvolených.",},

    };
    String[] eucharistia1 = {"Kňaz rozopne ruky a povie:",
            "<font color='#B71C1C'>Hl</font> Teba teda, najláskavejší Otče,<br>" +
                    "pokorne vzývame a prosíme<br>" +
                    "skrze Ježiša Krista,<br>" +
                    "tvojho Syna a nášho Pána:",
            "Zopne ruky a povie:",
            "láskavo prijmi",
            "Urobí znak kríža nad chlebom a kalichom, hovoriac:",
            "a požehnaj <font color='#B71C1C'>✠</font> tieto dary, tieto žertvy,<br>" +
                    "tieto sväté a nepoškvrnené obety.",
            "Pokračuje s rozopätými rukami:",
            "Prinášame ti ich najmä<br>" +
                    "za tvoju svätú katolícku Cirkev<br>" +
                    "v jednote s tvojím služobníkom,<br>" +
                    "naším pápežom <font color='#B71C1C'>M.</font>, s naším biskupom <font color='#B71C1C'>M. *</font><br>" +
                    "a so všetkými, ktorí vyznávajú pravú,<br>" +
                    "katolícku a apoštolskú vieru.<br>" +
                    "Daruj svojej Cirkvi pokoj,<br>" +
                    "chráň ju, zjednocuj a spravuj po celom svete.",
            "Spomienka na živých",
            "<font color='#B71C1C'>1.k</font> Pamätaj, Pane,<br>" +
                    "na svojich služobníkov a služobnice <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>",
            "Zopne ruky a chvíľu sa modlí za tých, ktorých si chce osobitne pripomenúť. Potom s rozopätými rukami pokračuje:",
            "Pamätaj i na všetkých tu zhromaždených.<br>" +
                    "Ty poznáš ich vieru<br>" +
                    "a vieš, že sú ti oddaní.<br>" +
                    "Za nich ti prinášame túto obetu chvály.<br>" +
                    "Aj oni sami ti ju obetujú za seba<br>" +
                    "i za všetkých svojich drahých,<br>" +
                    "za svoje vykúpenie,<br>" +
                    "za nádej na večnú spásu i za časné blaho<br>" +
                    "a predkladajú svoje prosby tebe,<br>" +
                    "Bohu večnému, živému a pravému.",
            "Spomienka na svätých",
            "VSUVKA1<font color='#B71C1C'>2.k</font> V spoločenstve s oslávenou Cirkvou<br>" +
                    "s úctou si spomíname<br>" +
                    "najmä na preblahoslavenú Máriu, vždy Pannu<br>" +
                    "Rodičku Boha a nášho Pána Ježiša Krista,",
            "",
            "ale i na svätého Jozefa, jej ženícha,<br>" +
                    "a na tvojich svätých apoštolov a mučeníkov<br>" +
                    "Petra a Pavla, Ondreja,<br>" +
                    "<font color='#B71C1C'>(</font>Jakuba, Jána, Tomáša, Jakuba, Filipa,<br>" +
                    "Bartolomeja, Matúša, Šimona a Tadeáša,<br>" +
                    "Lína, Kléta, Klimenta, Sixta,<br>" +
                    "Kornela, Cypriána, Vavrinca, Chryzogóna,<br>" +
                    "Jána a Pavla, Kozmu a Damiána<font color='#B71C1C'>)</font><br>" +
                    "i na všetkých tvojich svätých.<br>" +
                    "Pre ich zásluhy a na ich prosby<br>" +
                    "poskytni nám vždy a všade svoju pomoc a ochranu.<br>" +
                    "<font color='#B71C1C'>(</font>Skrze Krista, nášho Pána. Amen.<font color='#B71C1C'>)</font>",
            "S rozopätými rukami pokračuje:",
            "VSUVKA2<font color='#B71C1C'>HI</font> Pane, milostivo prijmi túto obetu,<br>" +
                    "ktorú ti predkladáme my, tvoji služobníci,<br>" +
                    "i celá tvoja rodina.<br>" +
                    "Spravuj naše dni vo svojom pokoji,<br>" +
                    "zachráň nás od večného zatratenia<br>" +
                    "a pripočítaj k zástupu svojich vyvolených.",
            "Zopne ruky.",
            "<font color='#B71C1C'>(</font>Skrze nášho Pána Ježiša Krista. Amen.<font color='#B71C1C'>)</font>",
            "Vystrie ruky nad obetné dary a povie:",
            "<font color='#B71C1C'>Vš</font> Prosíme ťa, Bože,<br>" +
                    "láskavo urob túto obetu<br>" +
                    "vo všetkom požehnanou, dokonalou,<br>" +
                    "prijatou, duchovnou a ľúbeznou,<br>" +
                    "aby sa nám stala Telom a Krvou<br>" +
                    "tvojho milovaného Syna,<br>" +
                    "nášho Pána Ježiša Krista.",
                    "Zopne ruky.<br>"+
            "V nasledujúcich formulách treba predniesť Pánove slová jasne a zrozumiteľne, ako si to vyžaduje ich povaha.",
            "VSUVKA3On večer pred svojím umučením",
            "Vezme chlieb, drží ho trocha zdvihnutý nad oltárom a pokračuje:",
            "vzal chlieb<br>" +
                    "do svojich svätých a ctihodných rúk,",
            "Pozdvihne oči",
            "pozdvihol oči k nebu,<br>" +
                    "k tebe, Bohu,<br>" +
                    "svojmu všemohúcemu Otcovi,<br>" +
                    "vzdával ti vďaky a dobrorečil, lámal chlieb<br>" +
                    "a dával svojim učeníkom, hovoriac:",
            "Trocha sa skloní.",
            "VEZMITE A JEDZTE Z NEHO VŠETCI:\n" +
                    "LEBO TOTO JE MOJE TELO,\n" +
                    "KTORÉ SA OBETUJE ZA VÁS.",
            "Ukáže konsekrovanú hostiu ľudu, znova ju položí na paténu a pokľaknutím adoruje.<br>" +
                    "Potom pokračuje:",
            "Podobne po večeri",
            "Vezme kalich, drží ho trocha zdvihnutý nad oltárom a pokračuje:",
            "vzal do svojich svätých a ctihodných rúk<br>" +
                    "aj tento preslávny kalich,<br>" +
                    "znova ti vzdával vďaky, dobrorečil<br>" +
                    "a dal ho svojim učeníkom, hovoriac:",
            "Trocha sa skloní.",
            "VEZMITE A PITE Z NEHO VŠETCI:\n" +
                    "LEBO TOTO JE KALICH MOJEJ KRVI,\n" +
                    "KTORÁ SA VYLIEVA ZA VÁS I ZA MNOHÝCH\n" +
                    "NA ODPUSTENIE HRIECHOV.\n" +
                    "JE TO KRV NOVEJ A VEČNEJ ZMLUVY.\n" +
                    "TOTO ROBTE NA MOJU PAMIATKU.",
            "Ukáže kalich ľudu, znova ho položí na korporál a pokľaknutím adoruje.<br>" +
                    "Potom povie:",
            "<font color='#B71C1C'>Hl</font> Hľa, tajomstvo viery.",
                    "Ľud pokračuje zvolaním:",
                    "Smrť tvoju, Pane, zvestujeme<br>" +
                    "a tvoje zmŕtvychvstanie vyznávame,<br>" +
                    "kým neprídeš v sláve.",
            "BAR", "",
            "Druhá formula:",
            "<font color='#B71C1C'>Hl</font> Vyznajme tajomstvo viery.<br>" +
                    "Pane, keď jeme tento chlieb<br>" +
                    "a pijeme z tohto kalicha,<br>" +
                    "zvestujeme tvoju smrť,<br>" +
                    "kým neprídeš v sláve.",
            "Tretia formula:",
            "<font color='#B71C1C'>Hl</font> Veľké je tajomstvo viery.<br>" +
                    "Spasiteľ sveta, zachráň nás,<br>" +
                    "veď ty si nás vykúpil<br>" +
                    "svojím krížom a zmŕtvychvstaním.",
            "BAR", "",
            "Potom kňaz s rozopätými rukami hovorí:",
            "<font color='#B71C1C'>Vš</font> Preto, Pane, my, tvoji služobníci<br>" +
                    "aj tvoj svätý ľud, slávime pamiatku<br>" +
                    "požehnaného umučenia a zmŕtvychvstania<br>" +
                    "i slávneho nanebovstúpenia Ježiša Krista,<br>" +
                    "tvojho Syna a nášho Pána,<br>" +
                    "a prinášame tebe, vznešenému Bohu,<br>" +
                    "dary z tvojich darov, svätý chlieb večného života<br>" +
                    "a kalich večnej spásy<br>" +
                    "ako obetu čistú, obetu svätú,<br>" +
                    "obetu nepoškvrnenú.",
            "SPACE",
                    "Zhliadni na ne vľúdnym a láskavým okom<br>" +
                    "a milostivo ich prijmi,<br>" +
                    "ako si milo prijal obetné dary<br>" +
                    "svojho spravodlivého služobníka Ábela,<br>" +
                    "žertvu nášho praotca Abraháma<br>" +
                    "i svätú a nepoškvrnenú obetu<br>" +
                    "tvojho veľkňaza Melchizedecha.",
            "Sklonený so zopätými rukami pokračuje:",
            "Pokorne ťa prosíme, všemohúci Bože,<br>" +
                    "prikáž svojmu svätému anjelovi<br>" +
                    "preniesť tieto dary na tvoj nebeský oltár,<br>" +
                    "pred tvár tvojej božskej velebnosti,<br>" +
                    "aby nás všetkých,<br>" +
                    "ktorí máme účasť na tejto oltárnej obete<br>" +
                    "a prijmeme presväté Telo a Krv tvojho Syna,",
            "Vzpriami sa a prežehná sa, pritom hovorí:",
            "naplnilo hojné nebeské požehnanie a milosť.",
            "Zopne ruky.",
            "<font color='#B71C1C'>(</font>Skrze nášho Pána Ježiša Krista. Amen.<font color='#B71C1C'>)</font>",
            "Spomienka na zosnulých\n"+
            "S rozopätými rukami povie:",
            "<font color='#B71C1C'>1.k</font> Pamätaj, Pane,<br>" +
                    "i na svojich služobníkov<br>" +
                    "a služobnice <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorí nás predišli do večnosti<br>" +
                    "so znakom viery<br>" +
                    "a spia spánkom pokoja.",
            "Zopne ruky a chvíľu sa modlí za zosnulých, ktorých si chce osobitne pripomenúť.<br>" +
                    "Potom s rozopätými rukami pokračuje:",
            "Prosíme ťa, Pane, daj im a všetkým,<br>" +
                    "ktorí odpočívajú v Kristovi,<br>" +
                    "prebývať na mieste blaha, svetla a pokoja.",
            "Zopne ruky.",
            "<font color='#B71C1C'>(</font>Skrze nášho Pána Ježiša Krista. Amen.<font color='#B71C1C'>)</font>",
            "Pravou rukou sa bije v prsia a hovorí:",
            "<font color='#B71C1C'>2.k</font> Aj nás, svojich hriešnych služobníkov,",
            "a s rozopätými rukami pokračuje:",
            "ktorí dúfame<br>" +
                    "v tvoje prehojné milosrdenstvo,<br>" +
                    "priveď do spoločenstva<br>" +
                    "svojich svätých apoštolov a mučeníkov:<br>" +
                    "Jána, Štefana, Mateja, Barnabáša,<br>" +
                    "<font color='#B71C1C'>(</font>Ignáca, Alexandra, Marcelína, Petra,<br>" +
                    "Felicity, Perpetuy, Agáty, Lucie,<br>" +
                    "Agnesy, Cecílie, Anastázie<font color='#B71C1C'>)</font><br>" +
                    "a všetkých tvojich svätých.<br>" +
                    "Prosíme ťa, prijmi nás do ich spoločenstva,<br>" +
                    "nie pre naše zásluhy,<br>" +
                    "ale pre tvoje veľké zľutovanie.",
            "Zopne ruky.",
            "Skrze nášho Pána Ježiša Krista.",
            "A pokračuje:",
            "<font color='#B71C1C'>HI</font> Skrze neho ty, Pane,<br>" +
                    "všetky tieto dary stále tvoríš,<br>" +
                    "posväcuješ, oživuješ,<br>" +
                    "požehnávaš a nám dávaš.",
            "Vezme paténu s hostiou a kalich, pozdvihne ich a hovorí:",
            "<font color='#B71C1C'>Vš</font> Skrze Krista, s Kristom a v Kristovi<br>" +
                    "máš ty, Bože Otče všemohúci,<br>" +
                    "v jednote Ducha Svätého<br>" +
                    "všetku úctu a slávu<br>" +
                    "po všetky veky vekov.",
            "Ľud zvolá:",
            "Amen."};

    String[] eucharistia2 = {
            "Kňaz rozopne ruky a hovorí:",
            "<font color='#B71C1C'>HI</font> Naozaj si svätý, Pane,<br>" +
                    "ty prameň všetkej svätosti.",
            "Zopne ruky, drží ich vystreté nad obetnými darmi a hovorí:",
            "<font color='#B71C1C'>Vš</font> Preto ťa prosíme,<br>" +
                    "posväť tieto dary rosou svojho Ducha,",
            "Zopne ruky, urobí znak kríža spolu nad chlebom a kalichom a hovorí:",
            "aby sa nám stali Telom a <font color='#B71C1C'>✠</font> Krvou<br>" +
                    "nášho Pána Ježiša Krista.",
            "Zopne ruky.<br>" +
                    "V nasledujúcich formulách treba predniesť Pánove slová jasne a zrozumiteľne, ako si to vyžaduje ich povaha.",
            "On, prv než sa dobrovoľne vydal na smrť,",
            "Vezme chlieb, drží ho trocha zdvihnutý nad oltárom a pokračuje:",
            "vzal chlieb<br>" +
                    "a vzdával vďaky, lámal ho<br>" +
                    "a dával svojim učeníkom, hovoriac:",
            "Trocha sa skloní.",
            "VEZMITE A JEDZTE Z NEHO VŠETCI:\n" +
                    "LEBO TOTO JE MOJE TELO,\n" +
                    "KTORÉ SA OBETUJE ZA VÁS.",
            "Ukáže konsekrovanú hostiu ľudu, znova ju položí na paténu a pokľaknutím adoruje.<br>" +
                    "Potom pokračuje:",
            "Podobne po večeri",
            "Vezme kalich, drží ho trocha zdvihnutý nad oltárom a pokračuje:",
            "vzal aj kalich,<br>" +
                    "znova vzdával vďaky<br>" +
                    "a dal ho svojim učeníkom, hovoriac:",
            "Trocha sa skloní.",
            "VEZMITE A PITE Z NEHO VŠETCI:\n" +
                    "LEBO TOTO JE KALICH MOJEJ KRVI,\n" +
                    "KTORÁ SA VYLIEVA ZA VÁS I ZA MNOHÝCH\n" +
                    "NA ODPUSTENIE HRIECHOV.\n" +
                    "JE TO KRV NOVEJ A VEČNEJ ZMLUVY.\n" +
                    "TOTO ROBTE NA MOJU PAMIATKU.",
            "Ukáže kalich ľudu, znova ho položí na korporál a pokľaknutím adoruje.<br>" +
                    "Potom povie:",
            "<font color='#B71C1C'>Hl</font> Hľa, tajomstvo viery.",
            "Ľud pokračuje zvolaním:",
            "Smrť tvoju, Pane, zvestujeme<br>" +
                    "a tvoje zmŕtvychvstanie vyznávame,<br>" +
                    "kým neprídeš v sláve.",
            "BAR", "",
            "Druhá formula:",
            "<font color='#B71C1C'>Hl</font> Vyznajme tajomstvo viery.<br>" +
                    "Pane, keď jeme tento chlieb<br>" +
                    "a pijeme z tohto kalicha,<br>" +
                    "zvestujeme tvoju smrť,<br>" +
                    "kým neprídeš v sláve.",
            "Tretia formula:",
            "<font color='#B71C1C'>Hl</font> Veľké je tajomstvo viery.<br>" +
                    "Spasiteľ sveta, zachráň nás,<br>" +
                    "veď ty si nás vykúpil<br>" +
                    "svojím krížom a zmŕtvychvstaním.",
            "BAR", "",
            "Potom kňaz s rozopätými rukami hovorí:",
            "<font color='#B71C1C'>Vš</font> Keď teda slávime pamiatku<br>" +
                    "smrti a zmŕtvychvstania tvojho Syna,<br>" +
                    "obetujeme ti, Pane,<br>" +
                    "chlieb života a kalich spásy.<br>" +
                    "Ďakujeme ti, že si nás uznal za hodných<br>" +
                    "stáť pred tvojou tvárou a tebe slúžiť.",
            "SPACE",
                    "Pokorne ťa prosíme,<br>" +
                    "nech nás všetkých,<br>" +
                    "ktorí máme účasť na Kristovom Tele a Krvi,<br>" +
                    "združí v jedno Duch Svätý.",
            "SPACE",
                    "<font color='#B71C1C'>1k</font> Pamätaj, Pane, na svoju Cirkev,<br>" +
                    "rozšírenú po celom svete,<br>" +
                    "a veď ju k dokonalej láske<br>" +
                    "v jednote s naším pápežom <font color='#B71C1C'>M.</font><br>" +
                    "a s naším biskupom <font color='#B71C1C'>M. *</font><br>" +
                    "i so všetkými biskupmi, kňazmi a diakonmi.",
            "BAR", "",
            "V omšiach za zosnulých možno pridať:",
            "Pamätaj na svojho služobníka <font color='#B71C1C'>(</font>svoju služobnicu<font color='#B71C1C'>) M.</font>, ktorého <font color='#B71C1C'>(</font>ktorú<font color='#B71C1C'>)</font> si z tohto sveta <font color='#B71C1C'>(</font>dnes<font color='#B71C1C'>)</font> povolal k sebe. Keďže sa stal <font color='#B71C1C'>(</font>stala<font color='#B71C1C'>)</font> podobným <font color='#B71C1C'>(</font>podobnou<font color='#B71C1C'>)</font> tvojmu Synovi v smrti, nech sa mu pripodobní aj v jeho zmŕtvychvstaní.",
            "BAR", "", "",
            "<font color='#B71C1C'>2.k</font> Pamätaj i na našich bratov a sestry,<br>" +
                    "čo zomreli v nádeji na vzkriesenie,<br>" +
                    "i na všetkých, ktorí v tvojej milosti<br>" +
                    "odišli z tohto sveta,<br>" +
                    "a prijmi ich do svetla svojej tváre.",
            "SPACE",
                    "Prosíme ťa, zmiluj sa nad nami všetkými,<br>" +
                    "aby sme si zaslúžili účasť na večnom živote<br>" +
                    "v spoločenstve s preblahoslavenou Bohorodičkou<br>" +
                    "Pannou Máriou, so svätým Jozefom, jej ženíchom,<br>" +
                    "so svätými apoštolmi a so všetkými svätými,<br>" +
                    "v ktorých si mal od vekov zaľúbenie,<br>" +
                    "aby sme ťa chválili a oslavovali",
            "Zopne ruky.",
            "skrze tvojho Syna Ježiša Krista.",
            "Vezme paténu s hostiou a kalich, pozdvihne ich a hovorí:",
            "<font color='#B71C1C'>Vš</font> Skrze Krista, s Kristom a v Kristovi<br>" +
                    "máš ty, Bože Otče všemohúci,<br>" +
                    "v jednote Ducha Svätého<br>" +
                    "všetku úctu a slávu<br>" +
                    "po všetky veky vekov.",
            "Ľud zvolá:",
            "Amen."};

    String[] eucharistia3 = {
            "Kňaz rozopne ruky a hovorí:",
            "<font color='#B71C1C'>HI</font> Naozaj si svätý, Pane,<br>" +
                    "a právom ťa chváli<br>" +
                    "každé tvoje stvorenie,<br>" +
                    "lebo skrze svojho Syna,<br>" +
                    "nášho Pána Ježiša Krista,<br>" +
                    "mocou a pôsobením Ducha Svätého<br>" +
                    "oživuješ a posväcuješ všetko<br>" +
                    "a ustavične si zhromažďuješ ľud,<br>" +
                    "aby sa od východu slnka až po jeho západ<br>" +
                    "prinášala tvojmu menu čistá obeta.",
            "Zopne ruky, vystrie ich nad obetné dary a hovorí:",
            "<font color='#B71C1C'>Vš</font> Preto ťa, Pane, pokorne prosíme,<br>" +
                    "láskavo posväť svojím Duchom tieto dary,<br>" +
                    "ktoré sme ti priniesli na obetu,",
            "Zopne ruky, urobí znak kríža spolu nad chlebom a kalichom a hovorí:",
            "aby sa stali Telom a <font color='#B71C1C'>✠</font> Krvou tvojho Syna<br>" +
                    "a nášho Pána Ježiša Krista,",
            "Zloží ruky.",
            "ktorý nám prikázal sláviť tieto tajomstvá.",
            "V nasledujúcich formulách treba predniesť Pánove slová jasne a zrozumiteľne, ako si to vyžaduje ich povaha.",
                    "On v tú noc, keď bol zradený,",
            "Vezme chlieb, drží ho trocha zdvihnutý nad oltárom a pokračuje:",
            "vzal chlieb,<br>" +
                    "vzdával ti vďaky a dobrorečil,<br>" +
                    "lámal ho a dával svojim učeníkom, hovoriac:",
            "Trocha sa skloní.",
            "VEZMITE A JEDZTE Z NEHO VŠETCI:\n" +
                    "LEBO TOTO JE MOJE TELO,\n" +
                    "KTORÉ SA OBETUJE ZA VÁS.",
            "Ukáže konsekrovanú hostiu ľudu, znova ju položí na paténu a pokľaknutím adoruje.<br>" +
                    "Potom pokračuje:",
            "Podobne po večeri",
            "Vezme kalich, drží ho trocha zdvihnutý nad oltárom a pokračuje:",
            "vzal kalich,<br>" +
                    "vzdával ti vďaky, dobrorečil<br>" +
                    "a dal ho svojim učeníkom, hovoriac:",
            "Trocha sa skloní.",
            "VEZMITE A PITE Z NEHO VŠETCI:\n" +
                    "LEBO TOTO JE KALICH MOJEJ KRVI,\n" +
                    "KTORÁ SA VYLIEVA ZA VÁS I ZA MNOHÝCH\n" +
                    "NA ODPUSTENIE HRIECHOV.\n" +
                    "JE TO KRV NOVEJ A VEČNEJ ZMLUVY.\n" +
                    "TOTO ROBTE NA MOJU PAMIATKU.",
            "Ukáže kalich ľudu, znova ho položí na korporál a pokľaknutím adoruje.<br>" +
                    "Potom povie:",
            "<font color='#B71C1C'>Hl</font> Hľa, tajomstvo viery.",
            "Ľud pokračuje zvolaním:",
            "Smrť tvoju, Pane, zvestujeme<br>" +
                    "a tvoje zmŕtvychvstanie vyznávame,<br>" +
                    "kým neprídeš v sláve.",
            "BAR", "",
            "Druhá formula:",
            "<font color='#B71C1C'>Hl</font> Vyznajme tajomstvo viery.<br>" +
                    "Pane, keď jeme tento chlieb<br>" +
                    "a pijeme z tohto kalicha,<br>" +
                    "zvestujeme tvoju smrť,<br>" +
                    "kým neprídeš v sláve.",
            "Tretia formula:",
            "<font color='#B71C1C'>Hl</font> Veľké je tajomstvo viery.<br>" +
                    "Spasiteľ sveta, zachráň nás,<br>" +
                    "veď ty si nás vykúpil<br>" +
                    "svojím krížom a zmŕtvychvstaním.",
            "BAR", "",
            "Potom kňaz s rozopätými rukami hovorí:",
            "<font color='#B71C1C'>Vš</font> Preto, Pane, keď slávime pamiatku<br>" +
                    "spásonosného umučenia tvojho Syna<br>" +
                    "i jeho slávneho zmŕtvychvstania a nanebovstúpenia<br>" +
                    "a kým očakávame jeho druhý príchod,<br>" +
                    "prinášame ti so vzdávaním vďaky<br>" +
                    "túto živú a svätú obetu.",
            "SPACE",
                    "Zhliadni, prosíme, na dar svojej Cirkvi<br>" +
                    "a spoznaj v ňom obetovaného Baránka,<br>" +
                    "ktorý podľa tvojej vôle zmieril nás s tebou;<br>" +
                    "a všetkých, ktorí sa živíme<br>" +
                    "Telom a Krvou tvojho Syna,<br>" +
                    "naplň Duchom Svätým,<br>" +
                    "aby sme boli v Kristovi<br>" +
                    "jedno telo a jeden duch.",
                    "SPACE",
                    "<font color='#B71C1C'>1.k</font> Nech Duch Svätý urobí z nás<br>" +
                    "ustavičnú obetu pre teba,<br>" +
                    "aby sme dostali dedičstvo<br>" +
                    "s tvojimi vyvolenými,<br>" +
                    "najmä s preblahoslavenou Pannou Máriou,<br>" +
                    "Božou Rodičkou,<br>" +
                    "so svätým Jozefom, jej ženíchom,<br>" +
                    "s tvojimi svätými apoštolmi<br>" +
                    "a slávnymi mučeníkmi<br>" +
                    "<font color='#B71C1C'>(</font>so svätým <font color='#B71C1C'>M., svätcom dňa alebo patrónom)</font><br>" +
                    "a so všetkými svätými,<br>" +
                    "ktorí nám, ako dúfame, ustavične pomáhajú<br>" +
                    "svojím orodovaním u teba.",
                            "SPACE",
                    "<font color='#B71C1C'>2.k</font> Prosíme ťa, Pane,<br>" +
                    "nech táto obeta nášho zmierenia<br>" +
                    "prinesie celému svetu pokoj a spásu.<br>" +
                    "Vo viere a láske upevňuj svoju Cirkev,<br>" +
                    "putujúcu na zemi:<br>" +
                    "tvojho služobníka, nášho pápeža <font color='#B71C1C'>M.</font>,<br>" +
                    "nášho biskupa <font color='#B71C1C'>M. *</font>, celý zbor biskupov,<br>" +
                    "všetkých kňazov a diakonov<br>" +
                    "i všetok vykúpený ľud.<br>" +
                    "Milostivo vypočuj prosby tejto rodiny,<br>" +
                    "ktorú si zhromaždil okolo seba,<br>" +
                    "a láskavo priveď k sebe, dobrotivý Otče,<br>" +
                    "všetky svoje roztratené deti.",
            "SPACE",
                    "<font color='#B71C1C'>▲</font> Dobrotivo prijmi do svojho kráľovstva<br>" +
                    "našich zosnulých bratov a sestry<br>" +
                    "i všetkých, ktorí v tvojej milosti<br>" +
                    "odišli z tohto sveta.<br>" +
                    "Pevne dúfame, že aj my sa tam s nimi<br>" +
                    "budeme naveky radovať z tvojej slávy",
            "Zopne ruky.",
            "v Kristovi, našom Pánovi,<br>" +
                    "skrze ktorého štedro dávaš svetu všetko dobré.",
            "BAR", "",
            "Keď sa použije táto eucharistická modlitba v omšiach za zosnulých, možno povedať:",
            "<font color='#B71C1C'>▲</font> Pamätaj na svojho služobníka <font color='#B71C1C'>(</font>svoju služobnicu<font color='#B71C1C'>) M.</font>, ktorého <font color='#B71C1C'>(</font>ktorú<font color='#B71C1C'>)</font> si z tohto sveta <font color='#B71C1C'>(</font>dnes<font color='#B71C1C'>)</font> povolal k sebe. Keďže krstom sa stal <font color='#B71C1C'>(</font>stala<font color='#B71C1C'>)</font> podobným <font color='#B71C1C'>(</font>podobnou<font color='#B71C1C'>)</font> tvojmu Synovi v smrti, daj mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> účasť aj na jeho zmŕtvychvstaní, keď Kristus vzkriesi mŕtvych a naše smrteľné telo pripodobní svojmu oslávenému telu.<br>" +
                    "Dobrotivo prijmi do svojho kráľovstva aj ostatných našich zosnulých bratov a sestry i všetkých, ktorí v tvojej milosti odišli z tohto sveta. Pevne dúfame, že aj my sa tam s nimi budeme naveky radovať z tvojej slávy. Tam zotrieš každú slzu z našich očí a uvidíme teba, svojho Boha, z tváre do tváre; budeme ti podobní po všetky veky a budeme ťa bez prestania chváliť",
            "Zopne ruky.",
            "v Kristovi, našom Pánovi, skrze ktorého štedro dávaš svetu všetko dobré.",
            "BAR", "",
            "Vezme paténu s hostiou a kalich, pozdvihne ich a hovorí:",
            "<font color='#B71C1C'>Vš</font> Skrze Krista, s Kristom a v Kristovi<br>" +
                    "máš ty, Bože Otče všemohúci,<br>" +
                    "v jednote Ducha Svätého<br>" +
                    "všetku úctu a slávu po všetky veky vekov.",
            "Ľud zvolá:",
            "Amen."};

    String[] eucharistia4 = {"Kňaz rozopne ruky a hovorí:",
            "<font color='#B71C1C'>HI</font> Velebíme ťa, svätý Otče, lebo si veľký<br>" +
                    "a všetko si stvoril s múdrosťou a s láskou.<br>" +
                    "Človeka si stvoril na svoj obraz<br>" +
                    "a dal si mu na starosť celý svet,<br>" +
                    "aby vládol nad všetkým tvorstvom<br>" +
                    "a slúžil iba tebe, svojmu Stvoriteľovi.<br>" +
                    "A keď pre svoju neposlušnosť<br>" +
                    "stratil tvoje priateľstvo,<br>" +
                    "neponechal si ho v moci smrti, br>" +
                    "ale milosrdne si pomáhal všetkým,<br>" +
                    "aby ťa hľadali a našli.<br>" +
                    "Viac ráz si ľuďom ponúkol zmluvu<br>" +
                    "a ústami prorokov si ich povzbudzoval,<br>" +
                    "aby očakávali spásu.",
            "SPACE",
                    "Svätý Otče, až tak si svet miloval,<br>" +
                    "že v plnosti času poslal si nám za Spasiteľa<br>" +
                    "svojho jednorodeného Syna,<br>" +
                    "ktorý sa mocou Ducha Svätého stal človekom,<br>" +
                    "narodil sa z Márie Panny<br>" +
                    "a žil podobný nám ľuďom vo všetkom okrem hriechu.<br>" +
                    "Chudobným zvestoval spásu,<br>" +
                    "zajatým vykúpenie, zroneným potešenie.<br>" +
                    "Aby uskutočnil tvoj večný plán spásy,<br>" +
                    "sám seba vydal na smrť a svojím zmŕtvychvstaním<br>" +
                    "premohol smrť a obnovil život.",
            "SPACE",
                    "A aby sme už nežili len sebe samým,<br>" +
                    "ale jemu, ktorý za nás umrel a vstal z mŕtvych,<br>" +
                    "od teba, Otče, poslal ako prvý dar veriacim<br>" +
                    "Ducha Svätého, ktorý završuje jeho dielo vo svete<br>" +
                    "a všetko posväcuje.",
            "Zopne ruky, vystrie ich nad obetné dary a hovorí:",
            "<font color='#B71C1C'>Vš</font> Preto ťa, Pane, prosíme,<br>" +
                    "nech Duch Svätý posvätí tieto dary,",
            "Zopne ruky, urobí znak kríža spolu nad chlebom a kalichom a hovorí:",
            "aby sa stali Telom a <font color='#B71C1C'>✠</font> Krvou<br>" +
                    "nášho Pána Ježiša Krista",
            "Zopne ruky.",
            "a mohli sme sláviť toto veľké tajomstvo,<br>" +
                    "ktoré nám on sám zanechal ako večnú zmluvu.",
            "V nasledujúcich formulách treba predniesť Pánove slová jasne a zrozumiteľne, ako si to vyžaduje ich povaha.",
            "Lebo on, keď nadišla chvíľa,<br>" +
                    "aby si ho oslávil, svätý Otče,<br>" +
                            "pretože miloval svojich, čo boli na svete,<br>" +
                            "a miloval ich do krajnosti,<br>" +
                            "pri večeri",
            "Vezme chlieb, drží ho trocha zdvihnutý nad oltárom a pokračuje:",
            "vzal chlieb<br>" +
                    "a dobrorečil, lámal ho<br>" +
                    "a dával svojim učeníkom, hovoriac:",
            "Trocha sa skloní.",
            "VEZMITE A JEDZTE Z NEHO VŠETCI:\n" +
                    "LEBO TOTO JE MOJE TELO,\n" +
                    "KTORÉ SA OBETUJE ZA VÁS.",
            "Ukáže konsekrovanú hostiu ľudu, znova ju položí na paténu a pokľaknutím adoruje.<br>" +
                    "Potom pokračuje:",
            "Podobne",
            "Vezme kalich, drží ho trocha zdvihnutý nad oltárom a pokračuje:",
            "vzal kalich s vínom, vzdával vďaky<br>" +
                    "a dal ho svojim učeníkom, hovoriac:",
            "Trocha sa skloní.",
            "VEZMITE A PITE Z NEHO VŠETCI:\n" +
                    "LEBO TOTO JE KALICH MOJEJ KRVI,\n" +
                    "KTORÁ SA VYLIEVA ZA VÁS I ZA MNOHÝCH\n" +
                    "NA ODPUSTENIE HRIECHOV.\n" +
                    "JE TO KRV NOVEJ A VEČNEJ ZMLUVY.\n" +
                    "TOTO ROBTE NA MOJU PAMIATKU.",
            "Ukáže kalich ľudu, znova ho položí na korporál a pokľaknutím adoruje.<br>" +
                    "Potom povie:",
            "<font color='#B71C1C'>Hl</font> Hľa, tajomstvo viery.<br>",
            "Ľud pokračuje zvolaním:",
            "Smrť tvoju, Pane, zvestujeme<br>" +
                    "a tvoje zmŕtvychvstanie vyznávame,<br>" +
                    "kým neprídeš v sláve.",
            "BAR", "",
            "Druhá formula:",
            "<font color='#B71C1C'>Hl</font> Vyznajme tajomstvo viery." +
                    "Pane, keď jeme tento chlieb<br>" +
                    "a pijeme z tohto kalicha,<br>" +
                    "zvestujeme tvoju smrť,<br>" +
                    "kým neprídeš v sláve.",
            "Tretia formula:",
            "<font color='#B71C1C'>Hl</font> Veľké je tajomstvo viery.<br>" +
                    "Spasiteľ sveta, zachráň nás,<br>" +
                    "veď ty si nás vykúpil<br>" +
                    "svojím krížom a zmŕtvychvstaním.",
            "BAR", "",
            "Potom kňaz s rozopätými rukami hovorí:",
            "<font color='#B71C1C'>Vš</font> Preto, Pane, keď teraz slávime<br>" +
                    "pamiatku nášho vykúpenia,<br>" +
                    "zvestujeme Kristovu smrť<br>" +
                    "a jeho zostúpenie k zosnulým,<br>" +
                    "vyznávame jeho zmŕtvychvstanie<br>" +
                    "a vystúpenie do neba, kde sedí po tvojej pravici,<br>" +
                    "a kým očakávame jeho príchod v sláve,<br>" +
                    "obetujeme ti jeho Telo a Krv,<br>" +
                    "obetu, v ktorej ty máš zaľúbenie<br>" +
                    "a celý svet spásu.",
            "SPACE",
                    "Zhliadni, Pane, na obetu,<br>" +
                    "ktorú si sám svojej Cirkvi pripravil,<br>" +
                    "a daj, nech všetkých, čo budú mať účasť<br>" +
                    "na tomto jednom chlebe a jednom kalichu,<br>" +
                    "Duch Svätý združí v jedno telo,<br>" +
                    "aby sa v Kristovi stali živou obetou<br>" +
                    "na tvoju chválu a slávu.",
                    "SPACE",
                    "<font color='#B71C1C'>1.k</font> Pamätaj, Pane, na všetkých,<br>" +
                    "za ktorých ti prinášame túto obetu:<br>" +
                    "najmä na svojho služobníka, nášho pápeža <font color='#B71C1C'>M.</font> ,<br>" +
                    "na nášho biskupa <font color='#B71C1C'>M. *</font> a na celý zbor biskupov<br>" +
                    "i na všetkých kňazov a diakonov,<br>" +
                    "na obetujúcich i tu prítomných,<br>" +
                    "na všetok svoj ľud a na všetkých,<br>" +
                    "čo ťa hľadajú s úprimným srdcom.",
                            "SPACE",
                    "<font color='#B71C1C'>2.k</font> Pamätaj i na tých,<br>" +
                    "čo zomreli v Kristovom pokoji,<br>" +
                    "a na všetkých zosnulých,<br>" +
                    "ktorých vieru iba ty si poznal.",
            "SPACE",
                    "Dobrotivý Otče,<br>" +
                    "nám všetkým, tvojim deťom, pomôž dosiahnuť<br>" +
                    "nebeské dedičstvo v tvojom kráľovstve<br>" +
                    "s preblahoslavenou Bohorodičkou Pannou Máriou,<br>" +
                    "so svätým Jozefom, jej ženíchom,<br>" +
                    "s tvojimi apoštolmi a svätými,<br>" +
                    "kde by sme ťa mohli so všetkým tvorstvom,<br>" +
                    "oslobodeným od skazy hriechu a smrti,<br>" +
                    "oslavovať skrze nášho Pána Ježiša Krista,",
            "Zopne ruky.",
            "skrze ktorého štedro dávaš svetu všetko dobré.",
            "Vezme paténu s hostiou a kalich, pozdvihne ich a hovorí:",
            "<font color='#B71C1C'>Vš</font> Skrze Krista, s Kristom a v Kristovi<br>" +
                    "máš ty, Bože Otče všemohúci,<br>" +
                    "v jednote Ducha Svätého<br>" +
                    "všetku úctu a slávu po všetky veky vekov.",
            "Ľud zvolá:",
            "Amen."};

    String[] eucharistiaZmierenie1 = {
            "Kňaz rozopne ruky a hovorí:",
            "<font color='#B71C1C'>HI</font> Naozaj si svätý, Pane,<br>" +
                    "a od začiatku sveta sa o človeka staráš,<br>" +
                    "aby sa stal svätým, ako ty si svätý.",
            "Zopne ruky, vystrie ich nad obetné dary a hovorí:",
            "<font color='#B71C1C'>Vš</font> Zhliadni, prosíme, na dary svojho ľudu,<br>" +
                    "a vylej na nich moc svojho Ducha,",
            "Zopne ruky, urobí znak kríža spolu nad chlebom a kalichom a hovorí:",
            "aby sa stali Telom a <font color='#B71C1C'>✠</font> Krvou",
            "Zopne ruky.",
            "tvojho milovaného Syna Ježiša Krista,<br>" +
                    "v ktorom sme aj my tvojimi deťmi.<br>"+
            "<font color='#B71C1C'>HI</font> Keď sme boli stratení a nemohli sme prísť k tebe,<br>" +
                    "dal si nám vrcholný dôkaz svojej lásky tým,<br>" +
                    "že tvoj Syn, ktorý jediný je spravodlivý,<br>" +
                    "sám seba vydal na smrť<br>" +
                    "a nechal sa za nás pribiť na drevo kríža.<br>"+
            "<font color='#B71C1C'>Vš</font> Ale skôr než rozopäl svoje ruky<br>" +
                    "medzi nebom a zemou<br>" +
                    "na znak tvojej večnej zmluvy,<br>" +
                    "chcel so svojimi učeníkmi sláviť Veľkú noc.",
            "V nasledujúcich formulách treba predniesť Pánove slová jasne a zrozumiteľne, ako si to vyžaduje ich povaha:",
            "Pri večeri",
            "Vezme chlieb, drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
            "vzal chlieb,<br>" +
                    "vzdával ti vďaky a dobrorečil,<br>" +
                    "lámal ho a dával svojim učeníkom, hovoriac:",
            "Trocha sa skloní.",
            "VEZMITE A JEDZTE Z NEHO VŠETCI:\n" +
                    "LEBO TOTO JE MOJE TELO,\n" +
                    "KTORÉ SA OBETUJE ZA VÁS.",
            "Ukáže konsekrovanú hostiu ľudu, znova ju položí na paténu a pokľaknutím adoruje.<br>" +
                    "Potom pokračuje:",
            "Podobne po večeri,<br>" +
                    "vediac, že svojou krvou vyliatou na kríži<br>" +
                    "má v sebe zmieriť celý svet,",
            "Vezme kalich, drží ho trocha zdvihnutý nad oltárom a pokračuje:",
            "vzal kalich s vínom,<br>" +
                    "znova ti vzdával vďaky<br>" +
                    "a dal ho svojim učeníkom, hovoriac:",
            "Trocha sa skloní.",
            "VEZMITE A PITE Z NEHO VŠETCI:\n" +
                    "LEBO TOTO JE KALICH MOJEJ KRVI,\n" +
                    "KTORÁ SA VYLIEVA ZA VÁS I ZA MNOHÝCH\n" +
                    "NA ODPUSTENIE HRIECHOV.\n" +
                    "JE TO KRV NOVEJ A VEČNEJ ZMLUVY.\n" +
                    "TOTO ROBTE NA MOJU PAMIATKU.",
            "Ukáže kalich ľudu, znova ho položí na korporál a pokľaknutím adoruje.<br>" +
                    "Potom povie:",
            "<font color='#B71C1C'>Hl</font> Hľa, tajomstvo viery.",
            "Ľud pokračuje zvolaním:",
            "Smrť tvoju, Pane, zvestujeme<br>" +
                    "a tvoje zmŕtvychvstanie vyznávame,<br>" +
                    "kým neprídeš v sláve.",
            "BAR", "",
            "Druhá formula:",
            "<font color='#B71C1C'>Hl</font> Vyznajme tajomstvo viery.<br>" +
                    "Pane, keď jeme tento chlieb<br>" +
                    "a pijeme z tohto kalicha,<br>" +
                    "zvestujeme tvoju smrť,<br>" +
                    "kým neprídeš v sláve.",
            "Tretia formula:",
            "<font color='#B71C1C'>Hl</font> Veľké je tajomstvo viery.<br>" +
                    "Spasiteľ sveta, zachráň nás,<br>" +
                    "veď ty si nás vykúpil<br>" +
                    "svojím krížom a zmŕtvychvstaním.",
            "BAR", "",
            "Potom kňaz s rozopätými rukami hovorí:",
            "<font color='#B71C1C'>Vš</font> Keď teda slávime pamiatku<br>" +
                    "tvojho Syna Ježiša Krista,<br>" +
                    "ktorý je náš veľkonočný Baránok<br>" +
                    "a náš bezpečný pokoj,<br>" +
                    "oslavujeme jeho smrť a vzkriesenie z mŕtvych,<br>" +
                    "a kým očakávame jeho príchod v sláve,<br>" +
                    "prinášame tebe, Bohu vernému a milosrdnému,<br>" +
                    "túto obetu, ktorá zmieruje ľudstvo s tebou.",
            "SPACE",
                    "Dobrotivý Otče,<br>" +
                    "láskavo zhliadni na tých,<br>" +
                    "ktorých obetou tvojho Syna spájaš so sebou.<br>" +
                    "Daj, aby sa mocou Ducha Svätého<br>" +
                    "a účasťou na tomto jednom chlebe a kalichu<br>" +
                    "stali jedným telom v Kristovi,<br>" +
                    "ktorý odstraňuje všetko rozdelenie.",
            "SPACE",
                    "<font color='#B71C1C'>1.k</font> Zachovaj nás<br>" +
                    "vo vzájomnej jednote ducha a srdca<br>" +
                    "s naším pápežom <font color='#B71C1C'>M.</font> a s naším biskupom <font color='#B71C1C'>M. *</font><br>" +
                    "Pomáhaj nám pripravovať<br>" +
                    "príchod tvojho kráľovstva<br>" +
                    "až do dňa, keď budeme stáť pred tebou,<br>" +
                    "svätí medzi svätými v nebeskom príbytku,<br>" +
                    "s preblahoslavenou Bohorodičkou Pannou Máriou,<br>" +
                    "so svätými apoštolmi a so všetkými svätými<br>" +
                    "i s našimi zosnulými bratmi a sestrami,<br>" +
                    "ktorých pokorne odporúčame tvojmu milosrdenstvu.",
            "SPACE",
                    "Vtedy budeme novými stvoreniami,<br>" +
                    "konečne oslobodenými od skazy hriechu,<br>" +
                    "a budeme ti spievať chválospev vďaky",
            "Zopne ruky.",
            "s Kristom, ktorý žije po všetky veky.",
            "Vezme paténu s hostiou a kalich, pozdvihne ich a hovorí:",
            "<font color='#B71C1C'>Vš</font> Skrze Krista, s Kristom a v Kristovi<br>" +
                    "máš ty, Bože Otče všemohúci,<br>" +
                    "v jednote Ducha Svätého<br>" +
                    "všetku úctu a slávu<br>" +
                    "po všetky veky vekov.",
            "Ľud zvolá:",
            "Amen."
    };
    String[] eucharistiaZmierenie2 = {"Kňaz rozopne ruky a hovorí:",
            "<font color='#B71C1C'>HI</font> Tebe, teda, všemohúci Otče,<br>" +
                    "dobrorečíme skrze tvojho Syna, Ježiša Krista,<br>" +
                    "ktorý prišiel k nám v tvojom mene.<br>" +
                    "On je pre ľudí Slovom spásy,<br>" +
                    "on je ruka, ktorú podávaš hriešnikom,<br>" +
                    "on je cesta, ktorou k nám prichádza tvoj pokoj.<br>" +
                    "Pane, hoci sme sa našimi hriechmi odvrátili od teba,<br>" +
                    "priviedol si nás späť,<br>" +
                    "aby sme sa zmierili, navrátili k tebe<br>" +
                    "a navzájom sa milovali skrze tvojho Syna,<br>" +
                    "ktorého si pre nás vydal na smrť.",
            "Zopne ruky, vystrie ich nad obetné dary a hovorí",
                    "<font color='#B71C1C'>Vš</font> Keď teraz slávime dielo zmierenia,<br>" +
                            "ktoré nám priniesol Kristus,<br>" +
                            "prosíme ťa,<br>" +
                            "posväť tieto dary rosou svojho Ducha,",
            "Zopne ruky, urobí znak kríža spolu nad chlebom a kalichom a hovorí:",
            "aby sa nám stali Telom a <font color='#B71C1C'>✠</font>  Krvou tvojho Syna,<br>" +
                    "ktorý nám prikázal sláviť tieto tajomstvá",
            "Zloží ruky." +
                    "V nasledujúcich formulách treba predniesť Pánove slová jasne a zrozumiteľne, ako si to vyžaduje ich povaha:",
            "On, prv než obetoval svoj život,<br>" +
                    "aby nás vyslobodil,<br>" +
                    "pri večeri",
            "Vezme chlieb, drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
            "vzal do rúk chlieb,<br>"+
            "vzdával ti vďaky a dobrorečil,<br>" +
                    "lámal ho a dával svojim učeníkom, hovoriac:",
            "Trocha sa skloní.",
            "VEZMITE A JEDZTE Z NEHO VŠETCI:\n" +
                    "LEBO TOTO JE MOJE TELO,\n" +
                    "KTORÉ SA OBETUJE ZA VÁS.",
            "Ukáže konsekrovanú hostiu ľudu, znova ju položí na paténu a pokľaknutím adoruje.<br>" +
                    "Potom pokračuje:",
            "Podobne v ten istý večer",
            "Vezme kalich, drží ho trocha zdvihnutý nad oltárom a pokračuje:",
            "vzal do rúk kalich dobrorečenia,<br>" +
                    "zveleboval tvoju milosrdnú lásku<br>" +
                    "a dal ho svojim učeníkom, hovoriac:",
            "Trocha sa skloní.",
            "VEZMITE A PITE Z NEHO VŠETCI:\n" +
                    "LEBO TOTO JE KALICH MOJEJ KRVI,\n" +
                    "KTORÁ SA VYLIEVA ZA VÁS I ZA MNOHÝCH\n" +
                    "NA ODPUSTENIE HRIECHOV.\n" +
                    "JE TO KRV NOVEJ A VEČNEJ ZMLUVY.\n" +
                    "TOTO ROBTE NA MOJU PAMIATKU.",
            "Ukáže kalich ľudu, znova ho položí na korporál a pokľaknutím adoruje.<br>" +
                    "Potom povie:",
            "<font color='#B71C1C'>Hl</font> Hľa, tajomstvo viery.",
            "Ľud pokračuje zvolaním:",
            "Smrť tvoju, Pane, zvestujeme<br>" +
                    "a tvoje zmŕtvychvstanie vyznávame,<br>" +
                    "kým neprídeš v sláve.",
            "BAR", "",
            "Druhá formula:",
            "<font color='#B71C1C'>Hl</font> Vyznajme tajomstvo viery.<br>" +
                    "Pane, keď jeme tento chlieb<br>" +
                    "a pijeme z tohto kalicha,<br>" +
                    "zvestujeme tvoju smrť,<br>" +
                    "kým neprídeš v sláve.",
            "Tretia formula:",
            "<font color='#B71C1C'>Hl</font> Veľké je tajomstvo viery.<br>" +
                    "Spasiteľ sveta, zachráň nás,<br>" +
                    "veď ty si nás vykúpil<br>" +
                    "svojím krížom a zmŕtvychvstaním.",
            "BAR", "",
            "Potom kňaz s rozopätými rukami hovorí:",
            "<font color='#B71C1C'>Vš</font> Keď teda slávime pamiatku,<br>" +
                    "smrti a zmŕtvychvstania tvojho Syna,<br>" +
                    "ktorý nám zanechal tento dôkaz svojej lásky,<br>" +
                    "prinášame ti to, čo si nám sám uštedril,<br>" +
                    "ako obetu dokonalého zmierenia.",
            "SPACE",
                    "Prosíme ťa, svätý Otče,<br>" +
                    "láskavo prijmi so svojím Synom aj nás<br>" +
                    "a pri tejto spásonosnej hostine<br>" +
                    "zošli na nás jeho Ducha,<br>" +
                    "aby nás oslobodil od všetkého, čo rozdeľuje.",
                    "SPACE",
                    "<font color='#B71C1C'>1.k</font> On sám nech urobí z tvojej Cirkvi znak jednoty<br>" +
                    "a nástroj pokoja medzi všetkými ľuďmi<br>" +
                    "a nech nás zachová v spoločenstve<br>"+
            "s naším pápežom <font color='#B71C1C'>M.</font>, s naším biskupom <font color='#B71C1C'>M. *</font>,<br>" +
                    "so všetkými biskupmi<br>" +
                    "a s celým tvojím ľudom.",
                            "SPACE",
                    "<font color='#B71C1C'>2.k</font> Ako si nás zhromaždil pri stole svojho Syna,<br>" +
                    "tak nás zjednoť aj s preblahoslavenou Bohorodičkou<br>" +
                    "Pannou Máriou,<br>" +
                    "s tvojimi svätými apoštolmi a všetkými svätými,<br>" +
                    "s našimi bratmi a sestrami<br>" +
                    "i s ľuďmi všetkých národov a jazykov,<br>" +
                    "ktorí zomreli v tvojom priateľstve,<br>" +
                    "a zhromaždi nás všetkých na hostine večnej jednoty<br>" +
                    "v nových nebesiach a novej zemi,<br>" +
                    "kde žiari plnosť tvojho pokoja,",
            "Zopne ruky.",
            "v Ježišovi Kristovi, našom Pánovi.",
            "Vezme paténu s hostiou a kalich, pozdvihne ich a hovorí:",
            "<font color='#B71C1C'>Vš</font> Skrze Krista, s Kristom a v Kristovi<br>" +
                    "máš ty, Bože Otče všemohúci,<br>" +
                    "v jednote Ducha Svätého<br>" +
                    "všetku úctu a slávu<br>" +
                    "po všetky veky vekov.",
            "Ľud zvolá:",
            "Amen."
    };
}

