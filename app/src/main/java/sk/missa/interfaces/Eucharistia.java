package sk.missa.interfaces;

/*
* Vsuvky do eucharistických modlitieb v rôznych obdobiach: vsuvkyEM
* Eucharistické modlitby: eucharistia1, eucharistia2, eucharistia3, eucharistia4
* Eucharistické modliby v omšiach za zmierenie: eucharistiaZmierenie1, eucharistiaZmierenie2
* dvojrozmerné polia sú rozdelené na tri časti podľa slov premenenia a v nich sa striedajú úseky menšieho a normálneho textu
*/

public interface Eucharistia {
    String[][] vsuvkaEM = {
            {"Na Narodenie Pána a cez oktávu", "<font color='#B71C1C'>2.k</font> V spoločenstve s celou Cirkvou <font color='#B71C1C'>(</font>v presvätú noc<font color='#B71C1C'>)</font> v presvätý deň, keď preblahoslavená Mária v neporušenom panenstve porodila svetu Spasiteľa, s úctou si spomíname na túto preblahoslavenú vždy Pannu, Rodičku Ježiša Krista, Boha a nášho Pána,"},
            {"Na Zjavenie Pána", "<font color='#B71C1C'>2.k</font> V spoločenstve s celou Cirkvou v presvätý deň, keď tvoj jednorodený Syn, rovnako večný s tebou v tvojej sláve, viditeľne sa zjavil v našom ľudskom tele, s úctou si spomíname najmä na preblahoslavenú Máriu, vždy Pannu, Rodičku Ježiša Krista, Boha a nášho Pána,"},
            {"Od omše Veľkonočnej vigílie až po Druhú veľkonočnú nedeľu", "<font color='#B71C1C'>2.k</font> V spoločenstve s celou Cirkvou <font color='#B71C1C'>(</font>v presvätú noc<font color='#B71C1C'>)</font> v presvätý deň, keď náš Pán Ježiš Kristus vstal z mŕtvych, s úctou si spomíname najmä na preblahoslavenú Máriu, vždy Pannu, Rodičku Ježiša Krista, Boha a nášho Pána,",
                    "<font color='#B71C1C'>HI</font> Bože, milostivo prijmi túto obetu, ktorú ti predkladáme my, tvoji služobníci, i celá tvoja rodina. Prinášame ti ju aj za tých, ktorých si znovuzrodil z vody a z Ducha Svätého a udelil si im odpustenie všetkých hriechov. Spravuj naše dni vo svojom pokoji, zachráň nás od večného zatratenia a pripočítaj k zástupu svojich vyvolených.",},
            {"Na Nanebovstúpenie Pána", "<font color='#B71C1C'>2.k</font> V spoločenstve s celou Cirkvou v presvätý deň, keď náš Pán, tvoj jednorodený Syn, v našej krehkej ľudskej prirodzenosti, spojenej so svojím božstvom, zasadol po pravici tvojej slávy, s úctou si spomíname najmä na preblahoslavenú Máriu, vždy Pannu, Rodičku Ježiša Krista, Boha a nášho Pána,"},
            {"Na Turíce", "<font color='#B71C1C'>2.k</font> V spoločenstve s celou Cirkvou v presvätý deň Turíc, keď sa Duch Svätý v ohnivých jazykoch zjavil apoštolom, s úctou si spomíname najmä na preblahoslavenú Máriu, vždy Pannu, Rodičku Ježiša Krista, Boha a nášho Pána,"},

    };
    String[][] eucharistia1 = {
            {"Kňaz rozopne ruky a hovorí:",
            "<font color='#B71C1C'>HI</font> Teba teda, najláskavejší Otče,<br>" +
                    "pokorne vzývame a prosíme<br>" +
                    "skrze Ježiša Krista,<br>" +
                    "tvojho Syna a nášho Pána",
            "zopne ruky a hovorí:",
            "láskavo prijmi",
            "urobí znak kríža nad chlebom a kalichom hovoriac:",
            "a <font color='#B71C1C'>+</font> požehnaj tieto dary,<br>" +
                    "túto svätú a nepoškvrnenú obetu.",
            "Pokračuje s rozopätými rukami:",
            "Prinášame ti ju<br>" +
                    "najmä za tvoju svätú všeobecnú Cirkev<br>" +
                    "v jednote s tvojím služobníkom,<br>" +
                    "naším pápežom <font color='#B71C1C'>M.</font>,<br>" +
                    "s naším biskupom <font color='#B71C1C'>M. *</font><br>" +
                    "a so všetkými, ktorým je zverená starosť<br>" +
                    "o pravú, katolícku a apoštolskú vieru. <br>" +
                    "Daruj svojej Cirkvi pokoj,<br>" +
                    "chráň ju, zjednocuj <br>" +
                    "a spravuj po celom svete.<br>"},
            {"Spomienka na živých",
            "<br><font color='#B71C1C'>1.k</font> Pamätaj, Otče,<br>" +
                    "na svojich služobníkov a služobnice <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>"},
            {"Zopne ruky a modlí sa chvíľu za tých, ktorých si chce osobitne pripomenúť. Potom s rozopätými rukami pokračuje:",
            "Pamätaj i na všetkých tu prítomných.<br>" +
                    "Ty poznáš ich vieru<br>" +
                    "a vieš, že sú ti oddaní.<br>" +
                    "Za nich ti prinášame túto obetu chvály.<br>" +
                    "Aj oni sami ti ju obetujú<br>" +
                    "za seba i za všetkých svojich drahých,<br>" +
                    "za svoje vykúpenie,<br>" +
                    "za nádej na večnú spásu<br>" +
                    "i za časné blaho<br>" +
                    "a predkladajú svoje prosby tebe,<br>" +
                    "Bohu večnému, živému a pravému.<br>"},
            {"Spomienka na svätých<br>",
            "VSUVKA<font color='#B71C1C'>2.k</font> V spoločenstve s celou Cirkvou<br>" +
                    "s úctou si spomíname<br>" +
                    "najmä na preblahoslavenú Máriu,<br>" +
                    "vždy Pannu,<br>" +
                    "Rodičku Ježiša Krista,<br>" +
                    "Boha a nášho Pána,"},
            {null,
                    "i na svätého Jozefa, jej ženícha,<br>" +
                    "a na tvojich svätých apoštolov a mučeníkov<br>" +
                    "Petra a Pavla, Ondreja,<br>" +
                    "<font color='#B71C1C'>(</font>Jakuba, Jána, Tomáša,<br>" +
                    "Jakuba, Filipa, Bartolomeja,<br>" +
                    "Matúša, Šimona a Tadeáša,<br>" +
                    "Lina, Kléta, Klimenta, Sixta,<br>" +
                    "Kornélia, Cypriána, Vavrinca, Chryzogóna,<br>" +
                    "Jána a Pavla, Kozmu a Damiána<font color='#B71C1C'>)</font><br>" +
                    "i na všetkých tvojich svätých.<br>" +
                    "Pre ich zásluhy a na ich prosby<br>" +
                    "poskytni nám vždy a všade<br>" +
                    "svoju pomoc a ochranu.<br>" +
                    "<font color='#B71C1C'>(</font>Skrze nášho Pána Ježiša Krista. Amen.<font color='#B71C1C'>)</font><br>",
            "Pokračuje s rozopätými rukami:",
            "VSUVKA2<font color='#B71C1C'>HI</font> Bože, milostivo prijmi túto obetu,<br>" +
                    "ktorú ti predkladáme <br>" +
                    "my, tvoji služobníci,<br>" +
                    "i celá tvoja rodina.<br>" +
                    "Spravuj naše dni vo svojom pokoji,<br>" +
                    "zachráň nás od večného zatratenia<br>" +
                    "a pripočítaj k zástupu<br>" +
                    "svojich vyvolených.",
            "Zopne ruky.",
            "<font color='#B71C1C'>(</font>Skrze nášho Pána Ježiša Krista. Amen.<font color='#B71C1C'>)</font><br>",
            "Vystrie ruky nad obetné dary a hovorí (i koncelebranti s ním):",
            "<font color='#B71C1C'>Vš</font> Prosíme ťa, Bože,<br>" +
                    "mocou svojho požehnania posväť tieto dary<br>" +
                    "a urob ich dokonalou,<br>" +
                    "duchovnou a tebe milou obetou,<br>" +
                    "aby sa nám stali telom a krvou<br>" +
                    "tvojho milovaného Syna,<br>" +
                    "nášho Pána Ježiša Krista.",
            "Zopne ruky.",
            "",
            "V nasledujúcich formulách treba predniesť Pánove slová jasne a zrozumiteľne, ako to ich povaha vyžaduje.",
            "On večer pred svojím umučením",
            "vezme chlieb,<br>" +
                    "drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
            "vzal chlieb<br>" +
                    "do svojich svätých a ctihodných rúk,",
            "pozdvihne oči",
            "pozdvihol oči k nebu,<br>" +
                    "k tebe, Bohu,<br>" +
                    "svojmu všemohúcemu Otcovi,<br>" +
                    "vzdával ti vďaky a dobrorečil,<br>" +
                    "lámal chlieb<br>" +
                    "a dával svojim učeníkom, hovoriac:",
            "trocha sa skloní",""},
            {"VEZMITE\n" +
                    "A JEDZTE Z NEHO VŠETCI:\n" +
                    "TOTO JE MOJE TELO,\n" +
                    "KTORÉ SA OBETUJE ZA VÁS."},
            {"Ukáže konsekrovanú hostiu ľudu, znova ju položí na paténu a pokľaknutím adoruje.<br>" +
                    "Potom pokračuje:",
            "Podobne po večeri",
            "vezme kalich,<br>"+
                    "drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
            "vzal do svojich svätých a ctihodných rúk<br>" +
                    "tento preslávny kalich,<br>" +
                    "znova ti vzdával vďaky, dobrorečil<br>" +
                    "a dal ho svojim učeníkom, hovoriac:",
            "trocha sa skloní", ""},
            {"VEZMITE\n" +
                    "A PITE Z NEHO VŠETCI:\n" +
                    "TOTO JE KALICH MOJEJ KRVI,\n" +
                    "KTORÁ SA VYLIEVA ZA VÁS\n" +
                    "I ZA VŠETKÝCH\n" +
                    "NA ODPUSTENIE HRIECHOV.\n" +
                    "JE TO KRV\n" +
                    "NOVEJ A VEČNEJ ZMLUVY.\n" +
                    "TOTO ROBTE NA MOJU PAMIATKU."},
            {"Ukáže kalich ľudu, znova ho položí na korporál a pokľaknutím adoruje.<br>" +
                    "Potom povie:",
            "<font color='#B71C1C'>HI</font> Hľa, tajomstvo viery.<br>" +
                    "Ľud odpovie zvolaním:<br>" +
                    "Smrť tvoju, Pane, zvestujeme<br>" +
                    "a tvoje zmŕtvychvstanie vyznávame,<br>" +
                    "kým neprídeš v sláve.",
            "______________<br>"+
            "Druhá formula:",
                    "<font color='#B71C1C'>HI</font> Vyznajme tajomstvo viery.<br>" +
                    "Pane, keď jeme tento chlieb<br>" +
                    "a pijeme z tohto kalicha,<br>" +
                    "zvestujeme tvoju smrť,<br>" +
                    "kým neprídeš v sláve.",
                    "Tretia formula:",
                    "<font color='#B71C1C'>HI</font> Veľké je tajomstvo viery.<br>" +
                    "Spasiteľ sveta, zachráň nás,<br>" +
                    "veď ty si nás vykúpil<br>" +
                    "svojím krížom a zmŕtvychvstaním.",
            "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾<br>"+
            "Potom kňaz s rozopätými rukami hovorí:",
            "<font color='#B71C1C'>Vš</font> Preto, Otče, my, tvoji služobníci<br>" +
                    "aj tvoj svätý ľud,<br>" +
                    "slávime pamiatku požehnaného umučenia<br>" +
                    "i zmŕtvychvstania<br>" +
                    "a slávneho nanebovstúpenia Ježiša Krista,<br>" +
                    "tvojho Syna a nášho Pána,<br>" +
                    "a prinášame tebe, vznešenému Bohu,<br>" +
                    "dary z tvojich darov,<br>" +
                    "svätý chlieb večného života<br>" +
                    "a kalich večnej spásy <br>" +
                    "ako obetu čistú, obetu svätú,<br>" +
                    "obetu nepoškvrnenú.<br>" +
                    "<br>" +
                    "Zhliadni na ne vľúdnym a láskavým okom<br>" +
                    "a milostivo ich prijmi,<br>" +
                    "ako si milo prijal obetné dary<br>" +
                    "svojho spravodlivého služobníka Ábela,<br>" +
                    "žertvu nášho praotca Abraháma<br>" +
                    "i svätú a nepoškvrnenú obetu<br>" +
                    "tvojho veľkňaza Melchizedecha.<br>",
            "Sklonený so zopätými rukami pokračuje:",
            "Pokorne ťa prosíme, všemohúci Bože,<br>" +
                    "prikáž svojmu svätému anjelovi<br>" +
                    "preniesť tieto dary<br>" +
                    "na tvoj nebeský oltár,<br>" +
                    "pred tvár tvojej božskej velebnosti,<br>" +
                    "aby nás všetkých,<br>" +
                    "ktorí máme účasť na tejto oltárnej obete<br>" +
                    "a prijmeme presväté telo<br>" +
                    "a krv tvojho Syna,<br>",
            "vzpriami sa a prežehná sa; pritom hovorí:",
            "naplnilo hojné nebeské požehnanie a milosť.",
            "Zopne ruky.",
            "<font color='#B71C1C'>(</font>Skrze nášho Pána Ježiša Krista. Amen.<font color='#B71C1C'>)</font><br>"},
            {"Spomienka na zosnulých", ""},
            {"Kňaz s rozopätými rukami hovorí:",
            "<font color='#B71C1C'>1.k</font> Pamätaj, Otče,<br>" +
                    "i na svojich služobníkov<br>" +
                    "a služobnice <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorí nás predišli do večnosti<br>" +
                    "so znakom viery<br>" +
                    "a spia spánkom pokoja.",
            "Zopne ruky a modlí sa chvíľu za zosnulých, ktorých si chce osobitne pripomenúť.<br>"+
                    "Potom s rozopätými rukami pokračuje:",
            "Prosíme ťa, Otče, daj im<br>" +
                    "a všetkým v Kristu odpočívajúcim<br>" +
                    "prebývať vo vlasti blaha,<br>" +
                    "svetla a pokoja.",
            "Zopne ruky.",
            "<font color='#B71C1C'>(</font>Skrze nášho Pána Ježiša Krista. Amen.<font color='#B71C1C'>)</font><br>",
            "Pravou rukou sa udrie v prsia a hovorí:",
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
                    "Prosíme ťa,<br>" +
                    "prijmi nás do ich spoločenstva,<br>" +
                    "nie pre naše zásluhy,<br>" +
                    "ale pre tvoje veľké zľutovanie.",
            "Zopne ruky",
            "Skrze nášho Pána Ježiša Krista.<br>",
            "Pokračuje:",
            "<font color='#B71C1C'>HI</font> Skrze neho ty, Bože,<br>" +
                    "všetky tieto dary stále tvoríš,<br>" +
                    "posväcuješ, oživuješ,<br>" +
                    "požehnávaš a nám dávaš.<br>",
            "Vezme paténu s hostiou a kalich, pozdvihne ich a hovorí:",
            "<font color='#B71C1C'>Vš</font> Skrze Krista, s Kristom a v Kristovi<br>" +
                    "máš ty, Bože Otče všemohúci,<br>" +
                    "v jednote s Duchom Svätým<br>" +
                    "všetku úctu a slávu<br>" +
                    "po všetky veky vekov.",
            "Ľud zvolá:",
            "Amen."},
    };

    String[][] eucharistia2 = {
            {"Kňaz rozopne ruky a hovorí:",
                    "<font color='#B71C1C'>HI</font> Naozaj si svätý, Otče,<br>" +
                            "ty prameň všetkej svätosti.<br>",
                    "Zopne ruky, vystrie ich nad obetné dary a hovorí (i všetci koncelebranti s ním):",
                    "<font color='#B71C1C'>Vš</font> Preto ťa prosíme,<br>" +
                            "posväť tieto dary rosou svojho Ducha,",
                    "zopne ruky,<br>" +
                            "urobí znak kríža nad chlebom a kalichom a hovorí:",
                    "aby sa nám stali telom <font color='#B71C1C'>+</font> a krvou<br>" +
                            "nášho Pána Ježiša Krista.",
                    "Zopne ruky.<br>" +
                            "V nasledujúcich formulách treba predniesť Pánove slová jasne a zrozumiteľne, ako to ich povaha vyžaduje.",
                    "On, prv než sa dobrovoľne vydal na smrť,",
                    "vezme chlieb,<br>" +
                            "drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
                    "vzal chlieb<br>" +
                            "a vzdával vďaky,<br>" +
                            "lámal ho a dával svojim učeníkom, hovoriac:",
                    "trocha sa skloní", ""},
            {"VEZMITE\n" +
                    "A JEDZTE Z NEHO VŠETCI:\n" +
                    "TOTO JE MOJE TELO,\n" +
                    "KTORÉ SA OBETUJE ZA VÁS."},
            {"Ukáže konsekrovanú hostiu ľudu, znova ju položí na paténu a pokľaknutím adoruje.<br>" +
                    "Potom pokračuje:",
                    "Podobne po večeri",
                    "vezme kalich,<br>" +
                            "drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
                    "vzal kalich,<br>" +
                            "znova vzdával vďaky<br>" +
                            "a dal ho svojim učeníkom, hovoriac:",
                    "trocha sa skloní", ""},
            {"VEZMITE\n" +
                    "A PITE Z NEHO VŠETCI:\n" +
                    "TOTO JE KALICH MOJEJ KRVI,\n" +
                    "KTORÁ SA VYLIEVA ZA VÁS\n" +
                    "I ZA VŠETKÝCH\n" +
                    "NA ODPUSTENIE HRIECHOV.\n" +
                    "JE TO KRV\n" +
                    "NOVEJ A VEČNEJ ZMLUVY.\n" +
                    "TOTO ROBTE NA MOJU PAMIATKU."},
            {"Ukáže kalich ľudu, znova ho položí na korporál a pokľaknutím adoruje.<br>"+
            "Potom povie:",
            "<font color='#B71C1C'>HI</font> Hľa, tajomstvo viery.",
            "Ľud odpovie zvolaním:",
            "Smrť tvoju, Pane, zvestujeme<br>" +
                    "a tvoje zmŕtvychvstanie vyznávame,<br>" +
                    "kým neprídeš v sláve.",
            "______________<br>"+
            "Druhá formula:",
            "<font color='#B71C1C'>HI</font> Vyznajme tajomstvo viery.<br>" +
                    "Pane, keď jeme tento chlieb<br>" +
                    "a pijeme z tohto kalicha,<br>" +
                    "zvestujeme tvoju smrť,<br>" +
                    "kým neprídeš v sláve.",
            "Tretia formula:",
            "<font color='#B71C1C'>HI</font> Veľké je tajomstvo viery.<br>" +
                    "Spasiteľ sveta, zachráň nás,<br>" +
                    "veď ty si nás vykúpil<br>" +
                    "svojím krížom a zmŕtvychvstaním.",
            "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾<br>"+
            "Potom kňaz s rozopätými rukami hovorí:",
            "<font color='#B71C1C'>Vš</font> Keď teda slávime pamiatku<br>" +
                    "smrti a zmŕtvychvstania tvojho Syna,<br>" +
                    "obetujeme ti, Otče,<br>" +
                    "chlieb života a kalich spásy.<br>" +
                    "Ďakujeme ti,<br>" +
                    "že si nás uznal za hodných<br>" +
                    "stáť pred tvojou tvárou a tebe slúžiť.<br>" +
                    "<br>" +
                    "Pokorne ťa prosíme,<br>" +
                    "nech nás všetkých, ktorí máme účasť<br>" +
                    "na Kristovom tele a krvi,<br>" +
                    "združí v jedno Duch Svätý.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>1.k</font> Pamätaj, Otče, na svoju Cirkev,<br>" +
                    "rozšírenú po celom svete,<br>" +
                    "a veď ju k dokonalej láske<br>" +
                    "v jednote s naším pápežom <font color='#B71C1C'>M.</font><br>" +
                    "a s naším biskupom <font color='#B71C1C'>M. *</font><br>" +
                    "i so všetkými kňazmi a diakonmi.",
            "______________<br>"+
            "V omšiach za zosnulých možno pridať:",
            "Pamätaj na svojho služobníka <font color='#B71C1C'>(</font>svoju služobnicu<font color='#B71C1C'>) M.</font> , ktorého <font color='#B71C1C'>(</font>ktorú<font color='#B71C1C'>)</font> si z tohto sveta <font color='#B71C1C'>(</font>dnes<font color='#B71C1C'>)</font> povolal k sebe. Keďže krstom sa stal <font color='#B71C1C'>(</font>stala<font color='#B71C1C'>)</font> podobným <font color='#B71C1C'>(</font>podobnou<font color='#B71C1C'>)</font> tvojmu Synovi v smrti, daj mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> účasť aj na jeho zmŕtvychvstaní.",
            "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾",
                    "<font color='#B71C1C'>2.k</font> Pamätaj i na našich bratov a sestry,<br>" +
                    "čo zomreli v nádeji na vzkriesenie,<br>" +
                    "i na všetkých, ktorí v tvojej milosti<br>" +
                    "odišli z tohto sveta,<br>" +
                    "a dovoľ im uvidieť svetlo tvojej tváre.<br>" +
                    "<br>" +
                    "Prosíme ťa, zmiluj sa nad nami všetkými,<br>" +
                    "aby sme si zaslúžili účasť<br>" +
                    "na večnom živote<br>" +
                    "v spoločenstve so svätou Bohorodičkou<br>" +
                    "Pannou Máriou,<br>" +
                    "so svätým Jozefom, jej ženíchom,<br>" +
                    "s blaženými apoštolmi<br>" +
                    "a so všetkými svätými,<br>" +
                    "v ktorých si mal od vekov zaľúbenie,<br>" +
                    "žeby sme ťa mohli chváliť a oslavovať",
            "zopne ruky",
            "skrze tvojho Syna Ježiša Krista.<br>",
            "Vezme paténu s hostiou a kalich, pozdvihne ich a hovorí:",
            "<font color='#B71C1C'>Vš</font> Skrze Krista, s Kristom a v Kristovi<br>" +
                    "máš ty, Bože Otče všemohúci,<br>" +
                    "v jednote s Duchom Svätým<br>" +
                    "všetku úctu a slávu<br>" +
                    "po všetky veky vekov.",
            "Ľud zvolá:",
            "Amen."}
    };

    String[][] eucharistia3 = {
            {"Kňaz rozopne ruky a hovorí:",
            "<font color='#B71C1C'>HI</font> Naozaj si svätý, Otče,<br>" +
                    "a právom ťa chváli každé tvoje stvorenie,<br>" +
                    "lebo skrze svojho Syna,<br>" +
                    "nášho Pána Ježiša Krista,<br>" +
                    "mocou a pôsobením Ducha Svätého<br>" +
                    "oživuješ a posväcuješ všetko<br>" +
                    "a ustavične si zhromažďuješ ľud,<br>" +
                    "aby od východu slnka až po jeho západ<br>" +
                    "prinášal tvojmu menu obetu čistú.<br>",
            "Zopne ruky, vystrie ich nad obetné dary a hovorí (i všetci koncelebranti s ním):",
            "<font color='#B71C1C'>Vš</font> Preto ťa, Otče, pokorne prosíme,<br>" +
                    "láskavo posväť svojím Duchom<br>" +
                    "tieto dary,<br>" +
                    "ktoré sme ti priniesli na obetu,",
            "zopne ruky,<br>"+
            "urobí znak kríža nad chlebom a kalichom a hovorí:",
            "aby sa stali telom <font color='#B71C1C'>+</font> a krvou<br>" +
                    "Ježiša Krista, tvojho Syna a nášho Pána,",
            "zloží ruky",
            "ktorý nám prikázal sláviť tieto tajomstvá.",
            "nasledujúcich formulách treba predniesť Pánove slová jasne a zrozumiteľne, ako to ich povaha vyžaduje.",
            "<br>" +
                    "On v tú noc, keď bol zradený,",
            "vezme chlieb,<br>"+
                    "drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
            "vzal chlieb,<br>" +
                    "vzdával ti vďaky a dobrorečil,<br>" +
                    "lámal ho a dával svojim učeníkom, hovoriac:",
            "trocha sa skloní",""},
            {"VEZMITE\n" +
                    "A JEDZTE Z NEHO VŠETCI:\n" +
                    "TOTO JE MOJE TELO,\n" +
                    "KTORÉ SA OBETUJE ZA VÁS."},
            {"Ukáže konsekrovanú hostiu ľudu, znova ju položí na paténu a pokľaknutím adoruje.<br>"+
            "Potom pokračuje:",
            "Podobne po večeri",
            "vezme kalich,<br>"+
            "drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
            "vzal kalich,<br>" +
                    "vzdával ti vďaky, dobrorečil<br>" +
                    "a dal ho svojim učeníkom, hovoriac:",
            "trocha sa skloní",""},
            {"VEZMITE\n" +
                    "A PITE Z NEHO VŠETCI:\n" +
                    "TOTO JE KALICH MOJEJ KRVI,\n" +
                    "KTORÁ SA VYLIEVA ZA VÁS\n" +
                    "I ZA VŠETKÝCH\n" +
                    "NA ODPUSTENIE HRIECHOV.\n" +
                    "JE TO KRV\n" +
                    "NOVEJ A VEČNEJ ZMLUVY.\n" +
                    "TOTO ROBTE NA MOJU PAMIATKU."},
            {"Ukáže kalich ľudu, znova ho položí na korporál a pokľaknutím adoruje.<br>Potom povie:",
            "<font color='#B71C1C'>HI</font> Hľa, tajomstvo viery.",
            "Ľud odpovie zvolaním:",
            "Smrť tvoju, Pane, zvestujeme<br>" +
                    "a tvoje zmŕtvychvstanie vyznávame,<br>" +
                    "kým neprídeš v sláve.",
            "______________<br>"+
            "Druhá formula:",
            "<font color='#B71C1C'>HI</font> Vyznajme tajomstvo viery.<br>" +
                    "Pane, keď jeme tento chlieb<br>" +
                    "a pijeme z tohto kalicha,<br>" +
                    "zvestujeme tvoju smrť,<br>" +
                    "kým neprídeš v sláve.",
            "Tretia formula:",
            "<font color='#B71C1C'>HI</font> Veľké je tajomstvo viery.<br>" +
                    "Spasiteľ sveta, zachráň nás,<br>" +
                    "veď ty si nás vykúpil<br>" +
                    "svojím krížom a zmŕtvychvstaním.",
            "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾<br>"+
            "Potom kňaz s rozopätými rukami hovorí:",
            "<font color='#B71C1C'>Vš</font> Preto, Otče, keď slávime pamiatku<br>" +
                    "spásonosného umučenia tvojho Syna<br>" +
                    "i jeho slávneho zmŕtvychvstania<br>" +
                    "a nanebovstúpenia<br>" +
                    "a kým očakávame jeho druhý príchod,<br>" +
                    "prinášame ti so vzdávaním vďaky<br>" +
                    "túto živú a svätú obetu.<br>" +
                    "<br>" +
                    "Zhliadni, prosíme, na dar svojej Cirkvi<br>" +
                    "a spoznaj v ňom obetovaného Baránka,<br>" +
                    "ktorý podľa tvojej vôle zmieril nás s tebou;<br>" +
                    "a všetkých, ktorí sa živíme telom a krvou<br>" +
                    "tvojho Syna,<br>" +
                    "naplň Duchom Svätým,<br>" +
                    "aby sme boli v Kristovi<br>" +
                    "jedno telo a jeden duch.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>1.k</font> Nech Duch Svätý urobí z nás<br>" +
                    "ustavičnú obetu pre teba,<br>" +
                    "aby sme dostali dedičstvo<br>" +
                    "s tvojimi vyvolenými,<br>" +
                    "najmä s preblahoslavenou Pannou Máriou,<br>" +
                    "Božou Rodičkou,<br>" +
                    "so svätým Jozefom, jej ženíchom,<br>" +
                    "s tvojimi svätými apoštolmi<br>" +
                    "a slávnymi mučeníkmi<br>" +
                    "<font color='#B71C1C'>(</font>so svätým <font color='#B71C1C'>M.,<br>" +
                    "svätcom dňa alebo patrónom)</font><br>" +
                    "a so všetkými svätými,<br>" +
                    "ktorí nám, ako úfame,<br>" +
                    "ustavične pomáhajú<br>" +
                    "svojím orodovaním u teba.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>2.k</font> Prosíme ťa, Otče,<br>" +
                    "nech táto obeta nášho zmierenia<br>" +
                    "prinesie celému svetu pokoj a spásu.<br>" +
                    "Vo viere a láske upevňuj svoju Cirkev,<br>" +
                    "putujúcu na zemi:<br>" +
                    "tvojho služobníka, nášho pápeža <font color='#B71C1C'>M.</font>,<br>" +
                    "nášho biskupa <font color='#B71C1C'>M. </font>, <font color='#B71C1C'>*</font><br>" +
                    "celý zbor biskupov,<br>" +
                    "všetkých kňazov a diakonov<br>" +
                    "i všetok vykúpený ľud.<br>" +
                    "Milostivo vypočuj prosby tejto rodiny,<br>" +
                    "ktorú si zhromaždil okolo seba,<br>" +
                    "a láskavo priveď k sebe, dobrotivý Otče,<br>" +
                    "všetky svoje roztratené deti.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>▲</font> Dobrotivo prijmi do svojho kráľovstva<br>" +
                    "našich zosnulých bratov a sestry<br>" +
                    "všetkých, ktorí v tvojej milosti<br>" +
                    "odišli z tohto sveta.<br>" +
                    "Pevne dúfame, že aj my sa tam s nimi<br>" +
                    "budeme naveky radovať z tvojej slávy",
            "zopne ruky",
            "v Kristovi, našom Pánovi,<br>" +
                    "skrze ktorého<br>" +
                    "štedro dávaš svetu všetko dobré.",
            "______________<br>"+
                    "V omšiach za zosnulých namiesto posledného odseku ▲ \"Dobrotivo...\" možno pridať:",
            "<font color='#B71C1C'>▲</font> Pamätaj na svojho služobníka <font color='#B71C1C'>(</font>svoju služobnicu<font color='#B71C1C'>) M.</font>, ktorého <font color='#B71C1C'>(</font>ktorú<font color='#B71C1C'>)</font> si z tohto sveta <font color='#B71C1C'>(</font>dnes<font color='#B71C1C'>)</font> povolal k sebe. Keďže krstom sa stal <font color='#B71C1C'>(</font>stala<font color='#B71C1C'>)</font> podobným <font color='#B71C1C'>(</font>podobnou<font color='#B71C1C'>)</font> tvojmu Synovi v smrti, daj mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> účasť aj na jeho zmŕtvychvstaní, keď Kristus vzkriesi mŕtvych a naše smrteľné telo pripodobní svojmu oslávenému telu.<br>" +
                    "Dobrotivo prijmi do svojho kráľovstva aj ostatných našich zosnulých bratov a sestry i všetkých, ktorí v tvojej milosti odišli z tohto sveta. Pevne dúfame, že aj my sa tam s nimi budeme naveky radovať z tvojej slávy. Tam zotrieš každú slzu z našich očí a uvidíme teba, svojho Boha, z tváre do tváre; budeme ti podobní po všetky veky a budeme ťa bez prestania chváliť",
            "zopne ruky",
            "v Kristovi, našom Pánovi, skrze ktoréhoF štedro dávaš svetu všetko dobré.",
            "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾<br>"+
                    "Vezme paténu s hostiou a kalich, pozdvihne ich a hovorí:",
            "<font color='#B71C1C'>Vš</font> Skrze Krista, s Kristom a v Kristovi<br>" +
                    "máš ty, Bože Otče všemohúci,<br>" +
                    "v jednote s Duchom Svätým<br>" +
                    "všetku úctu a slávu po všetky veky vekov.",
            "Ľud zvolá:",
            "Amen."}
    };

    String[][] eucharistia4 = {
            {"Kňaz rozopne ruky a hovorí:",
            "<font color='#B71C1C'>HI</font> Velebíme ťa, svätý Otče, lebo si veľký<br>" +
                    "a všetko si stvoril<br>" +
                    "s múdrosťou a s láskou.<br>" +
                    "Človeka si stvoril na svoj obraz<br>" +
                    "a dal si mu na starosť celý svet,<br>" +
                    "aby vládol nad všetkým tvorstvom<br>" +
                    "a slúžil iba tebe, svojmu Stvoriteľovi.<br>" +
                    "A keď pre svoju neposlušnosť<br>" +
                    "stratil tvoje priateľstvo,<br>" +
                    "neponechal si ho v moci smrti,<br>" +
                    "ale milosrdne si pomáhal všetkým,<br>" +
                    "aby ťa hľadali a našli.<br>" +
                    "Viac ráz si ľuďom ponúkol zmluvu<br>" +
                    "a ústami prorokov si ich povzbudzoval,<br>" +
                    "aby očakávali spásu.<br>" +
                    "<br>" +
                    "Svätý Otče, až tak si svet miloval,<br>" +
                    "že v plnosti času<br>" +
                    "poslal si nám za Spasiteľa<br>" +
                    "svojho jednorodeného Syna,<br>" +
                    "ktorý sa mocou Ducha Svätého<br>" +
                    "stal človekom, narodil sa z Márie Panny<br>" +
                    "a žil podobný nám ľuďom<br>" +
                    "vo všetkom okrem hriechu.<br>" +
                    "Chudobným zvestoval spásu,<br>" +
                    "zajatým vykúpenie,<br>" +
                    "zroneným potešenie.<br>" +
                    "Aby uskutočnil tvoj večný plán spásy,<br>" +
                    "sám seba vydal na smrť<br>" +
                    "a svojím zmŕtvychvstaním<br>" +
                    "premohol smrť a obnovil život.<br>" +
                    "<br>" +
                    "A aby sme už nežili len sebe samým,<br>" +
                    "ale jemu, ktorý za nás umrel<br>" +
                    "a vstal z mŕtvych,<br>" +
                    "od teba, Otče,<br>" +
                    "poslal ako prvý dar veriacim<br>" +
                    "Ducha Svätého,<br>" +
                    "ktorý završuje jeho dielo vo svete<br>" +
                    "a všetko posväcuje.<br>",
            "Zopne ruky, vystrie ich nad obetné dary a hovorí (i všetci koncelebranti s ním):",
            "<font color='#B71C1C'>Vš</font> Preto ťa, Otče, prosíme,<br>" +
                    "nech Duch Svätý posvätí tieto dary,",
            "zopne ruky,<br>"+
                    "urobí znak kríža nad chlebom a kalichom a hovorí:",
            "aby sa stali telom <font color='#B71C1C'>+</font> a krvou nášho Pána Ježiša Krista",
            "zopne ruky",
            "a mohli sme sláviť toto veľké tajomstvo,<br>" +
                    "ktoré nám on sám zanechal<br>" +
                    "ako večnú zmluvu.<br>",
            "V nasledujúcich formulách treba predniesť Pánove slová jasne a zrozumiteľne, ako to ich povaha vyžaduje.",
            "Keď nadišla chvíľa,<br>" +
                    "aby si ho oslávil, svätý Otče,<br>" +
                    "pretože miloval svojich, čo boli na svete,<br>" +
                    "a miloval ich do krajnosti,",
            "vezme chlieb,<br>"+
                    "drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
            "pri večeri vzal chlieb a dobrorečil,<br>" +
                    "lámal ho<br>" +
                    "a dával svojim učeníkom, hovoriac:",
            "trocha sa skloní",""},
            {"VEZMITE\n" +
                    "A JEDZTE Z NEHO VŠETCI:\n" +
                    "TOTO JE MOJE TELO,\n" +
                    "KTORÉ SA OBETUJE ZA VÁS."},
            {"Ukáže konsekrovanú hostiu ľudu, znova ju položí na paténu a pokľaknutím adoruje.<br>"+
                    "Potom pokračuje:",
            "Podobne",
            "vezme kalich,<br>"+
            "drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
            "vzal kalich s vínom,<br>" +
                    "vzdával vďaky<br>" +
                    "a dal ho svojim učeníkom, hovoriac:",
            "trocha sa skloní",""},
            {"VEZMITE\n" +
                    "A PITE Z NEHO VŠETCI:\n" +
                    "TOTO JE KALICH MOJEJ KRVI,\n" +
                    "KTORÁ SA VYLIEVA ZA VÁS\n" +
                    "I ZA VŠETKÝCH\n" +
                    "NA ODPUSTENIE HRIECHOV.\n" +
                    "JE TO KRV\n" +
                    "NOVEJ A VEČNEJ ZMLUVY.\n" +
                    "TOTO ROBTE NA MOJU PAMIATKU."},
            {"Ukáže kalich ľudu, znova ho položí na korporál a pokľaknutím adoruje.<br>Potom povie:",
            "<font color='#B71C1C'>HI</font> Hľa, tajomstvo viery.",
            "Ľud odpovie zvolaním:",
            "Smrť tvoju, Pane, zvestujeme <br>" +
                    "a tvoje zmŕtvychvstanie vyznávame, <br>" +
                    "kým neprídeš v sláve.",
            "______________<br>"+
                    "Druhá formula:",
            "<font color='#B71C1C'>HI</font> Vyznajme tajomstvo viery.<br>" +
                    "Pane, keď jeme tento chlieb<br>" +
                    "a pijeme z tohto kalicha,<br>" +
                    "zvestujeme tvoju smrť,<br>" +
                    "kým neprídeš v sláve.",
            "Tretia formula:",
            "<font color='#B71C1C'>HI</font> Veľké je tajomstvo viery.<br>" +
                    "Spasiteľ sveta, zachráň nás,<br>" +
                    "veď ty si nás vykúpil<br>" +
                    "svojím krížom a zmŕtvychvstaním.",
            "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾<br>"+
            "Potom kňaz s rozopätými rukami hovorí:",
            "<font color='#B71C1C'>Vš</font> Preto, Otče, keď teraz slávime<br>" +
                    "pamiatku nášho vykúpenia,<br>" +
                    "zvestujeme Kristovu smrť<br>" +
                    "a jeho zostúpenie k zosnulým,<br>" +
                    "vyznávame jeho zmŕtvychvstanie<br>" +
                    "a vstúpenie do neba,<br>" +
                    "kde sedí po tvojej pravici,<br>" +
                    "a kým očakávame jeho príchod v sláve,<br>" +
                    "obetujeme ti jeho telo a krv,<br>" +
                    "obetu, v ktorej ty máš zaľúbenie<br>" +
                    "a celý svet spásu.<br>" +
                    "<br>" +
                    "Zhliadni, Otče, na obetu,<br>" +
                    "ktorú si sám svojej Cirkvi pripravil,<br>" +
                    "a daj, nech všetkých,<br>" +
                    "čo budú mať účasť<br>" +
                    "na tomto jednom chlebe a jednom kalichu,<br>" +
                    "Duch Svätý združí v jedno telo,<br>" +
                    "aby sa v Kristovi stali živou obetou<br>" +
                    "na tvoju chválu a slávu.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>1.k</font> Pamätaj, Otče, na všetkých,<br>" +
                    "za ktorých ti prinášame túto obetu:<br>" +
                    "najmä na svojho služobníka,<br>" +
                    "nášho pápeža <font color='#B71C1C'>M.</font> ,<br>" +
                    "na nášho biskupa <font color='#B71C1C'>M. *</font><br>" +
                    "a na celý zbor biskupov<br>" +
                    "i na všetkých kňazov a diakonov,<br>" +
                    "na obetujúcich i tu prítomných,<br>" +
                    "na všetok svoj ľud a na všetkých,<br>" +
                    "čo ťa hľadajú s úprimným srdcom.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>2.k</font> Pamätaj i na tých,<br>" +
                    "čo zomreli v Kristovom pokoji,<br>" +
                    "a na všetkých zosnulých,<br>" +
                    "ktorých vieru iba ty si poznal.<br>" +
                    "Dobrotivý Otče,<br>" +
                    "nám všetkým, tvojim deťom,<br>" +
                    "pomôž dosiahnuť nebeské dedičstvo<br>" +
                    "v tvojom kráľovstve<br>" +
                    "s preblahoslavenou Pannou Máriou,<br>" +
                    "Božou Rodičkou,<br>" +
                    "so svätým Jozefom, jej ženíchom,<br>" +
                    "s tvojimi apoštolmi a svätými,<br>" +
                    "kde by sme ťa mohli so všetkým tvorstvom,<br>" +
                    "oslobodeným od skazy hriechu a smrti,<br>" +
                    "oslavovať skrze nášho Pána Ježiša Krista,",
            "zopne ruky",
            "skrze ktorého štedro dávaš svetu<br>" +
                    "všetko dobré.<br>",
            "Vezme paténu s hostiou a kalich, pozdvihne ich a hovorí:",
            "<font color='#B71C1C'>Vš</font> Skrze Krista, s Kristom a v Kristovi<br>" +
                    "máš ty, Bože Otče všemohúci,<br>" +
                    "v jednote s Duchom Svätým<br>" +
                    "všetku úctu a slávu po všetky veky vekov.",
            "Ľud zvolá:",
            "Amen."}
    };

    String[][] eucharistiaZmierenie1 = {
            {"Kňaz rozopne ruky a hovorí:",
                    "<font color='#B71C1C'>HI</font> Naozaj si svätý, Otče,<br>" +
                            "a od začiatku sveta sa o človeka staráš,<br>" +
                            "aby sa stal svätým, ako ty si svätý.",
                    "Zopne ruky, vystrie ich nad obetné dary a hovorí:",
                    "<font color='#B71C1C'>Vš</font> Zhliadni, prosíme, na svoj ľud,<br>" +
                            "zhromaždený pri tvojom oltári,<br>" +
                            "a zošli moc svojho Ducha,<br>" +
                            "aby sa nám tieto dary stali telom a krvou",
                    "zopne ruky,<br>" +
                            "urobí znak kríža nad chlebom a kalichom a hovorí:",
                    "tvojho milovaného Syna <font color='#B71C1C'>+</font> Ježiša Krista,<br>" +
                            "v ktorom sme aj my tvojimi deťmi.",
                    "Pokračuje s rozopätými rukami:",
                    "<font color='#B71C1C'>HI</font> Keď sme boli ako mŕtvi<br>" +
                            "a nevládali sme prísť k tebe,<br>" +
                            "dal si nám vrcholný dôkaz svojej lásky tým,<br>" +
                            "že tvoj Syn, ktorý jediný je spravodlivý, <br>" +
                            "odovzdal sa do našich rúk<br>" +
                            "a nechal sa pribiť na drevo kríža.",
                    "Zopne ruky." +
                            "V nasledujúcich formulách treba predniesť Pánove slová jasne a zrozumiteľne, ako to ich povaha vyžaduje:",
                    "<font color='#B71C1C'>Vš</font> Prv než rozopäl svoje ruky<br>" +
                            "na znak večnej zmluvy<br>" +
                            "medzi nebom a zemou,<br>" +
                            "chcel so svojimi učeníkmi sláviť Veľkú noc.",
                    "Vezme chlieb, drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
                    "Pri večeri vzal chlieb,<br>" +
                            "vzdával ti vďaky a dobrorečil,<br>" +
                            "lámal ho a dával svojim učeníkom, hovoriac:",
                    "trocha sa skloní:", ""},
            {"VEZMITE\n" +
                    "A JEDZTE Z NEHO VŠETCI:\n" +
                    "TOTO JE MOJE TELO,\n" +
                    "KTORÉ SA OBETUJE ZA VÁS."},
            {"Ukáže konsekrovanú hostiu ľudu, znova ju položí na paténu a pokľaknutím adoruje.<br>" +
                    "Potom pokračuje:",
                    "Podobne po večeri,<br>" +
                            "vediac, že svojou krvou vyliatou na kríži<br>" +
                            "má v sebe zmieriť celý svet,",
                    "vezme kalich, drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
                    "vzal kalich s vínom,<br>" +
                            "znova vzdával vďaky<br>" +
                            "a dal ho svojim učeníkom, hovoriac:",
                    "trocha sa skloní",""},
            {"VEZMITE\n" +
                    "A PITE Z NEHO VŠETCI:\n" +
                    "TOTO JE KALICH MOJEJ KRVI,\n" +
                    "KTORÁ SA VYLIEVA ZA VÁS\n" +
                    "I ZA VŠETKÝCH\n" +
                    "NA ODPUSTENIE HRIECHOV.\n" +
                    "JE TO KRV\n" +
                    "NOVEJ A VEČNEJ ZMLUVY.\n" +
                    "TOTO ROBTE NA MOJU PAMIATKU."},
            {"Ukáže kalich ľudu, znova ho položí na korporál a pokľaknutím adoruje.<br>" +
                    "Potom povie:",
                    "<font color='#B71C1C'>HI</font> Hľa, tajomstvo viery.",
                    "Ľud odpovie zvolaním:",
                    "Smrť tvoju, Pane, zvestujeme<br>" +
                            "a tvoje zmŕtvychvstanie vyznávame,<br>" +
                            "kým neprídeš v sláve.",
                    "______________<br>"+
                            "Druhá formula:",
                    "<font color='#B71C1C'>HI</font> Vyznajme tajomstvo viery.",
                    "Ľud odpovie zvolaním:",
                    "Pane, keď jeme tento chlieb<br>" +
                            "a pijeme z tohto kalicha,<br>" +
                            "zvestujeme tvoju smrť,<br>" +
                            "kým neprídeš v sláve.",
                    "Tretia formula:",
                    "<font color='#B71C1C'>HI</font> Veľké je tajomstvo viery.<br>" +
                            "Spasiteľ sveta, zachráň nás,<br>" +
                            "veď ty si nás vykúpil<br>" +
                            "svojím krížom a zmŕtvychvstaním.",
                    "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾<br>" +
                            "Potom kňaz s rozopätými rukami hovorí:",
                    "<font color='#B71C1C'>Vš</font> Keď teda slávime pamiatku<br>" +
                            "smrti a zmŕtvychvstania Ježiša Krista,<br>" +
                            "ktorý je náš veľkonočný Baránok<br>" +
                            "a náš bezpečný pokoj,<br>" +
                            "a kým očakávame deň jeho príchodu v sláve,<br>" +
                            "prinášame tebe, Bohu vernému a pravému,<br>" +
                            "túto obetu,<br>" +
                            "ktorá zmieruje ľudstvo s tebou.<br>" +
                            "Dobrotivý Otče,<br>" +
                            "láskavo zhliadni na tých,<br>" +
                            "ktorým dávaš účasť<br>" +
                            "na tejto jedinej Kristovej obete,<br>" +
                            "a tak ich spájaš so sebou.<br>" +
                            "Daj, aby sa pôsobením Ducha Svätého<br>" +
                            "stali jedným telom,<br>" +
                            "v ktorom niet rozdelenia ani nesvornosti.<br>" +
                            "<font color='#B71C1C'>1.k</font> Zachovaj nás<br>" +
                            "vo vzájomnej jednote ducha a srdca<br>" +
                            "s naším pápežom <font color='#B71C1C'>M.</font> a s naším biskupom <font color='#B71C1C'>M.</font><br>" +
                            "Pomáhaj nám pripravovať<br>" +
                            "príchod tvojho kráľovstva<br>" +
                            "až do dňa, keď prídeme k tebe<br>" +
                            "a budeme večne žiť v tvojej prítomnosti,<br>" +
                            "svätí medzi svätými,<br>" +
                            "v spoločenstve s Pannou Máriou<br>" +
                            "a apoštolmi i s našimi zosnulými bratmi a sestrami,<br>" +
                            "ktorých odporúčame<br>" +
                            "do tvojej milosrdnej lásky.<br>" +
                            "Vtedy budeme novými stvoreniami,<br>" +
                            "konečne oslobodenými od skazy hriechu,<br>" +
                            "a budeme s Kristom večne živým",
                    "zopne ruky",
                    "spievať chválospev vďaky.",
                    "Vezme paténu s hostiou a kalich, pozdvihne ich a hovorí:",
                    "<font color='#B71C1C'>Vš</font> Skrze Krista, s Kristom a v Kristovi<br>" +
                            "máš ty, Bože Otče všemohúci,<br>" +
                            "v jednote s Duchom Svätým<br>" +
                            "všetku úctu a slávu<br>" +
                            "po všetky veky vekov.",
                    "Ľud zvolá:",
                    "Amen."}
    };
            String [][] eucharistiaZmierenie2 = {
                    {"Kňaz rozopne ruky a hovorí:",
                    "<font color='#B71C1C'>HI</font> Naozaj si svätý, Otče,<br>" +
                    "Pán neba i zeme.<br>" +
                    "Dobrorečíme ti<br>" +
                    "skrze tvojho Syna Ježiša Krista,<br>" +
                    "ktorý prišiel k nám v tvojom mene.<br>" +
                    "On je tvoje slovo, ktoré zachraňuje ľudí,<br>" +
                    "on je ruka, ktorú podávaš hriešnikom,<br>" +
                    "on je cesta,<br>" +
                    "ktorou k nám prichádza tvoj pokoj.<br>" +
                    "Bože, dobrotivý Otec nás všetkých,<br>" +
                    "hoci sme sa od teba vzdialili,<br>" +
                    "priviedol si nás späť skrze svojho Syna.<br>" +
                    "Jeho si vydal na smrť,<br>" +
                    "aby sme sa my vrátili k tebe<br>" +
                    "a navzájom sa milovali.<br>" +
                    "<font color='#B71C1C'>Vš</font> Preto slávime veľké dielo nášho zmierenia,<br>" +
                    "ktoré vykonal Ježiš Kristus,<br>" +
                    "a vrúcne ťa prosíme.",
                    "Zopne ruky, vystrie ich nad obetné dary a hovorí:",
                    "posväť tieto dary rosou svojho Ducha,",
                    "Zopne ruky, urobí znak kríža nad chlebom a kalichom a hovorí:",
                    "keď konáme, čo nám prikázal <font color='#B71C1C'>+</font> tvoj Syn.",
                    "Zloží ruky." +
                    "V nasledujúcich formách treba predniesť Pánove slová jasne a zrozumiteľne, ako to ich povahe vyžaduje:",
                    "On, prv než obetoval za nás život,<br>" +
                    "aby nás vyslobodil,",
                    "Vezme chlieb, drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
                    "pri večeri vzal do rúk chlieb,<br>" +
                    "vzdával ti vďaky a dobrorečil,<br>" +
                    "lámal ho a dával svojim učeníkom, hovoriac:",
                    "trochu sa skloní",""},
                    {"VEZMITE\n" +
                            "A JEDZTE Z NEHO VŠETCI:\n" +
                            "TOTO JE MOJE TELO,\n" +
                            "KTORÉ SA OBETUJE ZA VÁS."},
            {"Ukáže konsekrovanú hostiu ľudu, znova ju položí na paténu a pokľaknutím adoruje.<br>" +
                    "Potom pokračuje:",
                    "Podobne v ten istý večer",
                    "vezme kalich, drží ho trocha pozdvihnutý nad oltárom a pokračuje:",
                    "vzal kalich s vínom,<br>" +
                    "zveleboval tvoju milosrdnú lásku<br>" +
                    "a dal ho svojim učeníkom, hovoriac:",
                    "trocha sa skloní",""},
                    {"VEZMITE\n" +
                            "A PITE Z NEHO VŠETCI:\n" +
                            "TOTO JE KALICH MOJEJ KRVI,\n" +
                            "KTORÁ SA VYLIEVA ZA VÁS\n" +
                            "I ZA VŠETKÝCH\n" +
                            "NA ODPUSTENIE HRIECHOV.\n" +
                            "JE TO KRV\n" +
                            "NOVEJ A VEČNEJ ZMLUVY.\n" +
                            "TOTO ROBTE NA MOJU PAMIATKU."},
            {"Ukáže kalich ľudu, znova ho položí na korporál a pokľaknutím adoruje.<br>" +
                    "Potom povie:",
                    "<font color='#B71C1C'>HI</font> Hľa, tajomstvo viery.",
                    "Ľud odpovie zvolaním:",
                    "Smrť tvoju, Pane, zvestujeme<br>" +
                    "a tvoje zmŕtvychvstanie vyznávame,<br>" +
                    "kým neprídeš v sláve.",
                    "______________<br>"+
                    "Druhá formula:",
                    "<font color='#B71C1C'>HI</font> Vyznajme tajomstvo viery.<br>" +
                    "<font color='#B71C1C'>Ľud odpovie zvolaním:</font><br>" +
                    "Pane, keď jeme tento chlieb<br>" +
                    "a pijeme z tohto kalicha,<br>" +
                    "zvestujeme tvoju smrť,<br>" +
                    "kým neprídeš v sláve.",
                    "Tretia formula:",
                    "<font color='#B71C1C'>HI</font> Veľké je tajomstvo viery.<br>" +
                    "Spasiteľ sveta, zachráň nás,<br>" +
                    "veď ty si nás vykúpil<br>" +
                    "svojím krížom a zmŕtvychvstaním.",
                            "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾<br>"+
                    "Potom kňaz s rozopätými rukami hovorí:",
                    "<font color='#B71C1C'>Vš</font> Pane a Bože náš,<br>" +
                    "tvoj Syn nám zanechal<br>" +
                    "tento dôkaz svojej lásky.<br>" +
                    "Preto keď slávime pamiatku jeho smrti<br>" +
                    "a zmŕtvychvstania,<br>" +
                    "prinášame ti obetu dokonalého zmierenia,<br>" +
                    "ktorú si ty sám vložil do našich rúk.<br>" +
                    "Prosíme ťa, svätý Otče,<br>" +
                    "láskavo prijmi so svojím Synom aj nás,<br>" +
                    "kajúcich hriešnikov,<br>" +
                    "a pri tejto eucharistickej hostine<br>" +
                    "zošli na nás jeho Ducha,<br>" +
                    "aby nás oslobodil od všetkého, čo rozdeľuje.<br>" +
                    "<font color='#B71C1C'>1.k</font> Nech nás Duch Svätý zachová v jednote<br>" +
                    "s naším pápežom <font color='#B71C1C'>M.</font>, s naším biskupom <font color='#B71C1C'>M.</font>,<br>" +
                    "so všetkými biskupmi<br>" +
                    "a s celým tvojím ľudom.<br>" +
                    "Daj, aby tvoja Cirkev bola znakom jednoty<br>" +
                    "a nástrojom pokoja<br>" +
                    "medzi všetkými ľuďmi.<br>" +
                    "<font color='#B71C1C'>2.k</font> Zhromaždil si nás pri stole svojho Syna<br>" +
                    "v spoločenstve<br>" +
                    "so svätou Bohorodičkou Pannou Máriou<br>" +
                    "a so všetkými svätými.<br>" +
                    "Podobne zhromaždi aj ostatných ľudí<br>" +
                    "zo všetkých krajín a národov,<br>" +
                    "jazykov a kultúr<br>" +
                    "na večnej hostine v novom svete,<br>" +
                    "kde vládne dokonalá jednota a pravý pokoj.",
                    "Zopne ruky.",
                    "Skrze nášho Pána, Ježiša Krista.",
                    "Vezme paténu s hostiou a kalich, pozdvihne ich a hovorí:",
                    "<font color='#B71C1C'>Vš</font> Skrze Krista, s Kristom a v Kristovi<br>" +
                    "máš ty, Bože Otče všemohúci,<br>" +
                    "v jednote s Duchom Svätým<br>" +
                    "všetku úctu a slávu<br>" +
                    "po všetky veky vekov.",
                    "Ľud zvolá:",
                    "Amen."}
    };
}

