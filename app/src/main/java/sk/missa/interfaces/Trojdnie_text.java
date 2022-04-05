package sk.missa.interfaces;

/*
* vsuvkyTrojdnieEM - vsuvky do eucharistických modlitieb na Zelený štvrtok (ZŠ) a Bielu sobotu (BS)
* evanjeliumSobota - evanjelium na Bielu sobotu (A, B, C)
* sobota - texty na Bielu sobotu
* piatok - texty na Veľký piatok
* stvrtok - texty na Zelený štvrtok
* Skratky pre texty (kvôli rôznemu spôsobu výpisu):
  S - nadpis
  N - podnadpisy
  K - komentare
  V - vyskakovacie okna
  E - citania, evanjelia, zalmy
  A - komentare okolo evanjelia na bielu sobotu
  P - prefacia
  O - obrad prijimanie
*/

public interface Trojdnie_text {

    String[][] sobota = {
            {"red|small|justify", "1. Podľa pradávnej tradície táto noc je nocou bdenia zasvätenou Pánovi (Ex 12, 42). Preto podľa výzvy evanjelia (Lk 12, 35 – 37) sa veriaci s horiacimi sviecami v rukách majú podobať ľuďom očakávajúcim návrat svojho Pána. Keď príde a nájde ich bdieť, dá im miesto pri svojom stole.\n" +
                    "2. Vigília tejto noci, ktorá je najväčšou a najvznešenejšou spomedzi všetkých slávností, sa má v každom kostole sláviť len raz. Slávi sa takto: po obrade svetla a veľkonočnom chválospeve (prvá časť vigílie) svätá Cirkev rozjíma o obdivuhodných skutkoch, ktoré Pán konal od začiatku pre svoj ľud, a prejavuje dôveru v Pánovo slovo a v jeho prísľub (druhá časť vigílie – liturgia slova); keď nastáva deň, Cirkev so svojimi novými členmi, čo sa znovuzrodili v krste (tretia časť vigílie), je pozvaná na sviatostnú hostinu, ktorú svojmu ľudu pripravil Pán ako pamiatku na svoju smrť a zmŕtvychvstanie, kým znova nepríde (štvrtá časť vigílie).\n" +
                    "3. Celá slávnosť Veľkonočnej vigílie sa má konať v noci. Nemá sa začať pred zotmením a má sa skončiť pred svitaním nedeľného rána.\n" +
                    "4. Omša vigílie, aj keď sa slávi pred polnocou, je omšou Veľkonočnej nedele.\n" +
                    "5. Kto sa zúčastnil na omši v noci, môže znova pristúpiť k prijímaniu v omši vo dne. Kto celebroval alebo koncelebroval omšu v noci, môže znova celebrovať alebo koncelebrovať omšu vo dne.\n" +
                    "Slávenie Veľkonočnej vigílie je náhradou posvätného čítania.\n" +
                    "6. Kňazovi zvyčajne posluhuje diakon. Ak však chýba, jeho úlohy okrem prípadov, kde je to uvedené inak, prevezme celebrujúci alebo koncelebrujúci kňaz. Kňaz a diakon si oblečú biele omšové rúcho.\n" +
                    "7. Pre všetkých účastníkov vigílie treba pripraviť sviece. Svetlá v kostole sa zhasnú."},
            {"center|bold|bigPadding", "I. časť\n" +
                    "Slávnostný začiatok vigílie: Obrad svetla\n" +
                    "Požehnanie ohňa a príprava veľkonočnej sviece"},
            {"red|small|justify", "8. Na vhodnom mieste mimo kostola sa pripraví oheň. Keď sa tam už zhromaždili veriaci, príde kňaz s posluhujúcimi; jeden z nich nesie veľkonočnú sviecu (paškál). Procesiový kríž a sviece sa neprinášajú.\n" +
                    "Keď nemožno posvätiť oheň mimo kostola, obrad sa koná, ako je uvedené pod č. 13."},
            {"html|small|justify", "<font color='#B71C1C'>9. Kňaz a veriaci sa prežehnajú, pričom kňaz hovorí: </font>V mene Otca i Syna i Ducha Svätého<font color='#B71C1C'>. Potom pozdraví zhromaždený ľud zvyčajným spôsobom a krátko ho poučí o Veľkonočnej vigílii týmito alebo podobnými slovami:</font>"},
            {"", "Bratia a sestry, v túto presvätú noc náš Pán Ježiš Kristus prešiel zo smrti do života. Preto Cirkev po celom svete zvoláva svojich synov a dcéry a zhromažďuje ich, aby bdeli a modlili sa.\n" +
                    "Pripomeňme si teda Pánovo zmŕtvychvstanie počúvaním Božieho slova a slávením jeho tajomstiev, aby sme mali nádej, že budeme mať účasť na Kristovom víťazstve nad smrťou a na živote s ním v Bohu."},
            {"red|small|justify", "10. Potom kňaz požehná oheň. S rozopätými rukami prednáša modlitbu:"},
            {"html", "Modlime sa.<br>" +
                    "Bože, skrze svojho Syna<br>" +
                    "si nás ožiaril svetlom svojej slávy; <font color='#B71C1C'>*</font><br>" +
                    "posväť <font color='#B71C1C'>✠</font> tento nový oheň a veľkonočnou slávnosťou<br>" +
                    "roznieť v nás túžbu po nebeských veciach,<font color='#B71C1C'> —</font><br>" +
                    "aby sme s čistým srdcom mohli vojsť<br>" +
                    "do kráľovstva večného svetla.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|small|justify", "11. Po požehnaní nového ohňa jeden z posluhujúcich prinesie pred kňaza veľkonočnú sviecu. Celebrant vryje do sviece kríž; nad kríž napíše grécke písmeno alfa, pod kríž písmeno omega a medzi ramená kríža vpíše štyri číslice aktuálneho roka.\n" +
                    "Pritom hovorí:"},
            {"html", "<font color='#B71C1C'>1.</font> Kristus je ten istý včera i dnes"},
            {"red|small", "(celebrant vrýva zvislú čiaru kríža)"},
            {"html", "<font color='#B71C1C'>2.</font> On je počiatok a koniec,"},
            {"red|small", "(kňaz vrýva vodorovnú čiaru kríža)"},
            {"html", "<font color='#B71C1C'>3.</font> Alfa"},
            {"red|small", "(nad zvislú čiaru kríža vrýva písmeno alfa)"},
            {"html", "<font color='#B71C1C'>4.</font> i Omega,"},
            {"red|small", "(pod zvislú čiaru kríža vrýva písmeno omega)"},
            {"html", "<font color='#B71C1C'>5.</font> Pán času"},
            {"red|small", "(do ľavého horného uhla kríža vrýva prvú číslicu letopočtu)"},
            {"html", "<font color='#B71C1C'>6.</font> i večnosti."},
            {"red|small", "(do pravého horného uhla kríža vrýva druhú číslicu letopočtu)."},
            {"html", "<font color='#B71C1C'>7.</font> Jemu patrí sláva i moc"},
            {"red|small", "(do ľavého spodného uhla kríža vrýva tretiu číslicu letopočtu)"},
            {"html", "<font color='#B71C1C'>8.</font> po všetky veky vekov. Amen."},
            {"red|small", "(do spodného pravého uhla kríža vrýva štvrtú číslicu letopočtu).\n" +
                    "12. Keď už vryl do sviece kríž a ostatné znaky, môže do nej vsadiť v podobe kríža päť hrudiek tymianu. Pritom hovorí:"},
            {"red|center", "1\n" +
                    "4     2     5\n" +
                    "3"},
            {"html", "<font color='#B71C1C'>1.</font> Pre svoje sväté<br>" +
                    "<font color='#B71C1C'>2.</font> a oslávené rany<br>" +
                    "<font color='#B71C1C'>3.</font> nech nás ochraňuje<br>" +
                    "<font color='#B71C1C'>4.</font> a zachováva<br>" +
                    "<font color='#B71C1C'>5.</font> Kristus, náš Pán. Amen."},
            {"red|small|justify", "13. Ak sa pre prípadné ťažkosti nežehná oheň vonku, obrad požehnania ohňa sa prispôsobí okolnostiam. Keď sa ľud zhromaždí v kostole, kňaz a posluhujúci s veľkonočnou sviecou prídu k bráne kostola. Ak je to možné, ľud sa obráti tvárou ku kňazovi.\n" +
                    "Nasleduje pozdrav a poučenie (pozri č. 9). Potom sa žehná oheň a pripraví sa veľkonočná svieca (pozri č. 10 – 12).\n" +
                    "14. Kňaz od požehnaného ohňa zapáli veľkonočnú sviecu a hovorí:"},
            {"", "Svetlo Krista, ktorý slávne vstal z mŕtvych,\n" +
                    "nech zaženie tmu z našich sŕdc a myslí."},
            {"red|small|justify", "Pokiaľ ide o vyššie opísané prvky, konferencie biskupov môžu stanoviť iný spôsob, lepšie vyhovujúci mentalite veriacich."},
            {"center", "Sprievod"},
            {"red|small|justify", "15. Po zapálení sviece jeden z posluhujúcich vloží žeravé uhlíky z ohňa do kadidelnice a kňaz, ako zvyčajne, nasype tymian. Diakon, alebo ak ho niet, iný vhodný posluhujúci vezme od posluhujúceho veľkonočnú sviecu a zoradí sa procesia. Turiferár s dymiacou kadidelnicou ide pred diakonom alebo posluhujúcim nesúcim veľkonočnú sviecu, za nimi ide kňaz s posluhujúcimi a veriaci. Všetci nesú v rukách sviece.\n" +
                    "Pred bránou kostola diakon zastane, pozdvihne sviecu a spieva:"},
            {"", "Svetlo Kristovo."},
            {"red|small", "Všetci odpovedia:"},
            {"", "Bohu vďaka."},
            {"red|small", "Kňaz zažne svoju sviecu od veľkonočnej sviece.\n" +
                    "16. Potom diakon pokračuje do stredu kostola, zastane, pozdvihne sviecu a znova spieva:"},
            {"", "Svetlo Kristovo."},
            {"red|small", "Všetci odpovedia:"},
            {"", "Bohu vďaka."},
            {"red|small", "Všetci si zapália sviece od veľkonočnej sviece a pokračujú.\n" +
                    "17. Keď diakon príde pred oltár, obráti sa k ľudu, pozdvihne sviecu a tretíkrát spieva:"},
            {"", "Svetlo Kristovo."},
            {"red|small", "Všetci odpovedia:"},
            {"", "Bohu vďaka."},
            {"red|small|justify", "Diakon umiestni veľkonočnú sviecu na veľký svietnik pripravený pri ambóne alebo uprostred presbytéria.\n" +
                    "V kostole sa zažnú svetlá okrem sviec na oltári."},
            {"center", "Veľkonočný chválospev"},
            {"html|small|justify", "<font color='#B71C1C'>18. Po príchode k oltáru kňaz ide k sedadlu, sviecu odovzdá posluhujúcemu, vloží do kadidelnice tymian a požehná ho ako na evanjelium v omši. Diakon predstúpi pred kňaza a slovami: </font>Požehnaj ma, otče<font color='#B71C1C'>, požiada kňaza o požehnanie. Kňaz mu ho dá polohlasne týmito slovami:</font>"},
            {"html", "Pán nech je v tvojom srdci i na tvojich perách,<br>" +
                    "aby si dôstojne a náležite predniesol<br>" +
                    "jeho veľkonočný chválospev;<br>" +
                    "v mene Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého."},
            {"red|small", "Diakon odpovie:"},
            {"", "Amen."},
            {"red|small|justify", "Toto požehnanie sa vynechá, ak chválospev prednesie niekto iný ako diakon.\n" +
                    "19. Diakon incenzuje knihu i sviecu a potom na ambóne alebo pri stojane prednesie veľkonočný chválospev. Všetci zatiaľ stoja a držia v rukách zažaté sviece."},
            {"html|small|justify", "<font color='#B71C1C'>Ak chýba diakon, môže veľkonočný chválospev predniesť sám kňaz alebo iný koncelebrant. Ak v prípade potreby prednáša chválospev spevák laik, vynechá stať </font>Prosím vás teda, bratia a sestry<font color='#B71C1C'> až do konca úvodu a pozdravenie </font>Pán s vami<font color='#B71C1C'>.<br>" +
                    "Chválospev možno predniesť aj v skrátenom znení.</font>"},
            {"onClick", "4", "red|bigPadding", "DLHŠÍ VEĽKONOČNÝ CHVÁLOSPEV (otvoriť)"},
            {"onClick", "5", "red|bigPadding", "KRATŠÍ VEĽKONOČNÝ CHVÁLOSPEV (otvoriť)"},
            {"center|bold|bigPadding", "II. časť\n" +
                    "Liturgia slova"},
            {"red|small|justify", "20. Na túto vigíliu, matku všetkých vigílií, je určených deväť čítaní, a to sedem zo Starého zákona a dve (epištola a evanjelium) z Nového zákona. Treba ich čítať všetky všade, kde je to možné, aby sa zachoval charakter vigílie, ktorá si vyžaduje dlhšie trvanie.\n" +
                    "21. Ak si to vyžadujú veľmi vážne pastoračné dôvody, možno vynechať niektoré čítania zo Starého zákona. Treba však vždy pamätať na to, že čítanie Božieho slova je podstatnou zložkou tejto vigílie.\n" +
                    "Majú sa čítať aspoň tri čítania zo Starého zákona, čiže zo Zákona a Prorokov, a spievať príslušné responzóriové žalmy. Nikdy sa však nemá vynechať čítanie zo 14. kapitoly Knihy Exodus so svojím spevom.\n" +
                    "22. Všetci odložia sviece a sadnú si. Pred čítaniami kňaz povzbudí ľud týmito alebo podobnými slovami:"},
            {"", "Drahí bratia a sestry, po slávnostnom úvode veľkonočnej vigílie teraz pozorne počúvajme Božie slovo. Uvažujme, ako Boh ochraňoval svoj ľud v minulosti a ako napokon poslal svojho Syna ako Vykupiteľa. Modlime sa, aby náš Boh dovŕšil toto veľkonočné dielo spásy a priviedol nás k plnosti vykúpenia."},
            {"html|small|justify", "<font color='#B71C1C'>23. Nasledujú čítania. Lektor príde k ambóne a prečíta čítanie. Žalmista, čiže spevák, prednáša žalm, pričom ľud opakuje responzórium. Potom všetci vstanú. Kňaz povie </font>Modlime sa<font color='#B71C1C'> a všetci sa chvíľu potichu modlia. Napokon sa kňaz nahlas modlí príslušnú modlitbu.<br>" +
                    "Namiesto responzóriového žalmu sa môže zachovať chvíľa posvätného ticha. V tomto prípade po výzve </font>Modlime sa<font color='#B71C1C'> kňaz hneď prednesie príslušnú modlitbu.</font>"},
            {"center", "Modlitby po čítaniach"},
            {"onClick", "11", "red|bigPadding","PRVÉ ČÍTANIE a RESPONZÓRIOVÝ ŽALM (otvoriť)"},
            {"red|small|justify", "24. Po prvom čítaní (Stvorenie sveta: Gn 1, 1 – 2, 2 alebo 1, 1. 26 – 31a) a žalme (104 alebo 33):"},
            {"html", "Modlime sa.<br>" +
                    "Všemohúci a večný Bože,<br>" +
                    "ty si obdivuhodný vo všetkom, čo konáš; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby tvoj vykúpený ľud poznal,<br>" +
                    "aké vznešené bolo dielo stvorenia na počiatku<br>" +
                    "a o koľko vznešenejšie bolo dielo<br>" +
                    "vykúpenia v plnosti času, <font color='#B71C1C'>—</font><br>" +
                    "keď sa obetoval náš veľkonočný<br>" +
                    "Baránok Ježiš Kristus.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|small", "Alebo (O stvorení človeka):"},
            {"html", "Bože, ty si obdivuhodne stvoril človeka<br>" +
                    "a ešte obdivuhodnejšie si ho vykúpil; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, posilňuj našu vôľu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme odolávali zvodom hriechu<br>" +
                    "a zaslúžili si vojsť do večnej radosti.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"onClick", "12", "red|bigPadding", "DRUHÉ ČÍTANIE a RESPONZÓRIOVÝ ŽALM (otvoriť)"},
            {"red|small|justify", "25. Po druhom čítaní (O Abrahámovej obete: Gn 22, 1 – 18 alebo 22, 1 – 2. 9a. 10 – 13. 15 – 18) a žalme (15):"},
            {"html", "Modlime sa.<br>" +
                    "Bože, Otec všetkých veriacich, <font color='#B71C1C'>*</font><br>" +
                    "po celej zemi rozmnožuješ synov svojho prisľúbenia,<br>" +
                    "keď ľudí prijímaš za svoje deti<br>" +
                    "a sviatosťou krstu plníš prísľub,<br>" +
                    "ktorý si dal Abrahámovi,<br>" +
                    "že bude otcom všetkých národov; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby všetci ľudia ochotne prijali<br>" +
                    "milosť tvojho povolania.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"onClick", "13", "red|bigPadding", "TRETIE ČÍTANIE a RESPONZÓRIOVÝ ŽALM (otvoriť)"},
            {"red|small|justify", "26. Po treťom čítaní (O prechode cez Červené more: Ex 14, 15 – 15, 1) a jeho speve (Ex 15):"},
            {"html", "Modlime sa.<br>" +
                    "Bože, tvoje dávne veľké činy<br>" +
                    "sa obnovujú aj za našich čias; <font color='#B71C1C'>*</font><br>" +
                    "veď čo si v minulosti mocou svojej pravice<br>" +
                    "preukázal jednému národu,<br>" +
                    "keď si ho zachránil pred faraónom,<br>" +
                    "to za našich čias vodou znovuzrodenia<br>" +
                    "uskutočňuješ na spásu všetkých národov; <font color='#B71C1C'>—</font><br>" +
                    "daj, prosíme, aby sa všetci ľudia<br>" +
                    "stali duchovnými deťmi praotca Abraháma<br>" +
                    "a dosiahli výsady vyvoleného ľudu.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|small", "Alebo:"},
            {"html", "Bože, ty si objasnil význam starozákonných<br>" +
                    "zázrakov svetlom Nového zákona:<br>" +
                    "Červené more je predobrazom krstnej vody<br>" +
                    "a izraelský ľud, vyslobodený z otroctva,<br>" +
                    "je predobrazom kresťanského ľudu; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby všetci ľudia vierou nadobudli<br>" +
                    "výsady vyvoleného ľudu <font color='#B71C1C'>—</font><br>" +
                    "a znovuzrodili sa z Ducha Svätého.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"onClick", "14", "red|bigPadding", "ŠTVRTÉ ČÍTANIE a RESPONZÓRIOVÝ ŽALM (otvoriť)"},
            {"red|small|justify", "27. Po štvrtom čítaní (O novom Jeruzaleme: Iz 54, 5 – 14) a žalme (30):"},
            {"html", "Modlime sa.<br>" +
                    "Všemohúci a večný Bože,<br>" +
                    "na slávu svojho mena zveľaďuj potomstvo,<br>" +
                    "ktoré si sľúbil praotcom za ich vieru, <font color='#B71C1C'>*</font><br>" +
                    "a sviatosťou krstu rozmnožuj<br>" +
                    "počet synov zasľúbenia, <font color='#B71C1C'>—</font><br>" +
                    "aby Cirkev spoznala, že sa už plní to,<br>" +
                    "čo svätí praotcovia s dôverou očakávali.<br>n" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|small|justify", "Tu možno použiť aj inú z modlitieb predpísaných po čítaniach, ktoré sa prípadne vynechajú."},
            {"onClick", "15", "red|bigPadding", "PIATE ČÍTANIE a RESPONZÓRIOVÝ ŽALM (otvoriť)"},
            {"red|small|justify","28. Po piatom čítaní (O spáse zadarmo darovanej všetkým: Iz 55, 1 – 11) a speve (Iz 12):"},
            {"html", "Modlime sa.<br>" +
                    "Všemohúci a večný Bože, jediná nádej sveta,<br>" +
                    "ty si už ústami prorokov zvestoval tajomstvá spásy,<br>" +
                    "ktoré sa odohrávajú za našich čias; <font color='#B71C1C'>*</font><br>" +
                    "milostivo v nás roznecuj sväté túžby, <font color='#B71C1C'>—</font><br>" +
                    "lebo len s tvojou pomocou<br>" +
                    "môžu veriaci rásť v každej čnosti.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"onClick", "16", "red|bigPadding", "ŠIESTE ČÍTANIE a RESPONZÓRIOVÝ ŽALM (otvoriť)"},
            {"red|small|justify", "29. Po šiestom čítaní (O prameni múdrosti: Bar 3, 9 – 15. 31 – 4, 4) a žalme (19):"},
            {"html", "Modlime sa.<br>" +
                    "Bože, ty neprestajne zveľaďuješ svoju Cirkev<br>" +
                    "a povolávaš do nej ľudí zo všetkých národov; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, ustavične ochraňuj všetkých, <font color='#B71C1C'>—</font><br>" +
                    "ktorých si očistil krstnou vodou.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"onClick", "17", "red|bigPadding", "SIEDME ČÍTANIE a RESPONZÓRIOVÝ ŽALM (otvoriť)"},
            {"red|small|justify", "30. Posiedmom čítaní (Onovom srdcianovom duchu: Ez 36, 16 – 28) ažalme (42 – 43):"},
            {"html", "Modlime sa.<br>" +
                    "Bože, nekonečná sila a nehynúce svetlo,<br>" +
                    "láskavo zhliadni na svoju Cirkev,<br>" +
                    "ktorá je sviatosťou spásy,<br>" +
                    "a podľa svojho odvekého rozhodnutia<br>" +
                    "uskutočňuj dielo ľudského vykúpenia<br>" +
                    "v trvalom pokoji; <font color='#B71C1C'>*</font><br>" +
                    "nech celý svet skúsi a uzná,<br>" +
                    "že dvíhaš, čo bolo pokorené, obnovuješ, čo zostarlo, <font color='#B71C1C'>—</font><br>" +
                    "a všetko privádzaš do stavu pôvodnej dokonalosti<br>" +
                    "skrze pôvodcu všetkého, Ježiša Krista.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|small", "Alebo:"},
            {"html", "Bože, Písmom Starého a Nového zákona<br>" +
                    "nás vedieš k sláveniu veľkonočného tajomstva; <font color='#B71C1C'>*</font><br>" +
                    "daj nám pochopiť svoje milosrdenstvo, <font color='#B71C1C'>—</font><br>" +
                    "aby dary, ktoré nám dnes dávaš,<br>" +
                    "posilňovali v nás nádej na dary budúce.<br>n" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"html|small|justify", "<font color='#B71C1C'>31. Po poslednom čítaní zo Starého zákona s príslušným responzóriovým žalmom a modlitbou sa zažnú na oltári sviece a kňaz začne hymnus </font>Sláva Bohu na výsostiach<font color='#B71C1C'>. Všetci pokračujú. Ak je zvykom, zvonia pritom zvony.</font>"},
            {"onClick", "10", "red|bigPadding", "Sláva Bohu na výsostiach (otvoriť)"},
            {"red|small|justify", "32. Keď sa skončí hymnus, kňaz prednesie zvyčajným spôsobom kolektu:"},
            {"html", "Modlime sa.<br>" +
                    "Bože, ty ožiaruješ túto presvätú noc<br>" +
                    "slávou Pánovho zmŕtvychvstania; <font color='#B71C1C'>*</font><br>" +
                    "oživuj vo svojej Cirkvi ducha Božieho synovstva\n" +
                    "a pomáhaj nám obnoviť sa na tele i na duši, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti vždy verne slúžili.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého<br>" +
                    "po všetky veky vekov."},
            {"red|small|justify", "33. Potom lektor číta z listu apoštola Pavla."},
            {"separated", "red", "EPIŠTOLA", "Rim 6, 3-11"},
            {"italic|center", "Kristus vzkriesený z mŕtvych už neumiera"},
            {"", "Čítanie z Listu svätého apoštola Pavla Rimanom\n" +
                            "Bratia, všetci, čo sme boli pokrstení v Kristovi Ježišovi, v jeho smrť sme boli pokrstení. Krstom sme teda s ním boli pochovaní v smrť, aby sme tak, ako bol Kristus vzkriesený z mŕtvych Otcovou slávou, aj my žili novým životom. Lebo ak sme s ním zrástli a stali sa mu podobnými v smrti, tak mu budeme podobní aj v zmŕtvychvstaní. Veď vieme, že náš starý človek bol s ním ukrižovaný, aby bolo hriešne telo zničené, aby sme už neotročili hriechu. Lebo kto zomrel, je ospravedlnený od hriechu.\n" +
                            "Ale ak sme zomreli s Kristom, veríme, že s ním budeme aj žiť. Veď vieme, že Kristus vzkriesený z mŕtvych už neumiera, smrť nad ním už nepanuje. Lebo keď zomrel, zomrel raz navždy hriechu, ale keď žije, žije Bohu. Tak zmýšľajte o sebe aj vy: že ste mŕtvi hriechu a žijete Bohu v Kristovi Ježišovi.\n" +
                            "Počuli sme Božie slovo."},
            {"html|small|justify", "<font color='#B71C1C'>34. Po čítaní všetci vstanú. Kňaz trikrát slávnostne zaintonuje (postupne vždy vo vyššej tónine) </font>Aleluja<font color='#B71C1C'> a všetci po ňom opakujú. Ak je to potrebné, </font>Aleluja<font color='#B71C1C'> zaintonuje spevák.<br>" +
                    "35. Potom žalmista alebo spevák prednesie Žalm 118 a ľud odpovedá </font>Aleluja."},
                    {"separated", "red", "RESPONZÓRIOVÝ ŽALM", "Ž 118, 1-2. 16ab+17. 22-23"},
            {"html", "<font color='#B71C1C'>R.:</font> Aleluja.<br><br>" +
                                    "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><br>" +
                                    "lebo jeho milosrdenstvo trvá naveky.<br>" +
                                    "Teraz nech hovorí Izrael, že Pán je dobrý, <font color='#B71C1C'>*</font><br>" +
                                    "že jeho milosrdenstvo trvá naveky. <font color='#B71C1C'>R.</font><br>" +
                                    "\"Pánova pravica mocne zasiahla, <font color='#B71C1C'>*</font><br>" +
                                    "Pánova pravica ma zdvihla.\"<br>" +
                                    "Ja nezomriem, budem žiť <font color='#B71C1C'>*</font><br>" +
                                    "a vyrozprávam skutky Pánove. <font color='#B71C1C'>R.</font><br>" +
                                    "Kameň, čo stavitelia zavrhli, <font color='#B71C1C'>*</font><br>" +
                                    "stal sa kameňom uholným.<br>" +
                                    "To sa stalo na pokyn Pána; <font color='#B71C1C'>*</font><br>" +
                                    "vec v našich očiach obdivuhodná. <font color='#B71C1C'>R.</font>"},
            {"red|small|justify", "36. Kňaz zvyčajným spôsobom vloží do kadidelnice tymian a požehná diakona. Na evanjelium sa neprinášajú sviece, ale iba kadidlo.\n" +
                    "Po evanjeliu nech sa nevynechá homília, hoci aj krátka."},
            {"center|bold|bigPadding", "III. časť\n" +
                    "Liturgia krstu"},
            {"red|small|justify", "37. Po homílii nasleduje liturgia krstu. Kňaz s posluhujúcimi ide ku krstiteľnici, ak je veriacim na dohľad. Ak nie, nádobu s vodou treba umiestniť v presbytériu.\n" +
                    "38. Zavolajú sa katechumeni, ak sú prítomní. Pred zhromaždenie veriacich ich privedú krstní rodičia. Ak ide o malé deti, prinesú ich rodičia a krstní rodičia.\n" +
                    "39. Potom, ak sa má konať, hneď sa začne procesia do baptistéria alebo ku krstnému prameňu. Prvý ide posluhujúci s veľkonočnou sviecou, nasledujú krstenci s krstnými rodičmi, posluhujúci, diakon a kňaz. Počas procesie sa spievajú litánie (č. 43). Po ich skončení kňaz pokračuje povzbudením (č. 40).\n" +
                    "40. Ak sa však liturgia krstu koná v presbytériu, kňaz hneď prednesie povzbudenie týmito alebo podobnými slovami:\n" +
                    "Ak bude krst:"},
            {"html|justify", "Drahí bratia a sestry, všetci sprevádzajme svojou modlitbou našich bratov <font color='#B71C1C'>(</font>sestry<font color='#B71C1C'>)</font> <font color='#B71C1C'>(</font>bratov a sestry<font color='#B71C1C'>)</font>, ktorí<font color='#B71C1C'>(</font>é<font color='#B71C1C'>)</font> pristupujú v blaženej nádeji k prameňu znovuzrodenia. Všemohúci Boh Otec nech ich ochraňuje vo svojom milosrdenstve."},
            {"red|small|justify", "Ak sa požehnáva krstný prameň, ale nebude krst:"},
            {"", "Drahí bratia a sestry, pokorne vzývajme všemohúceho Boha Otca, aby zoslal svoju milosť na túto vodu a tých, čo sa z nej znovuzrodia, prijal v Kristovi za svoje deti."},
            {"red|small|justify", "41. Potom dvaja speváci spievajú litánie. Všetci stoja (pretože je už Veľkonočné obdobie) a odpovedajú.\n" +
                    "Ak treba ísť ku krstiteľnici v dlhšom sprievode, litánie sa spievajú počas procesie. V tomto prípade sa krstenci zavolajú dopredu ešte pred procesiou.\n" +
                    "Na čele sprievodu sa nesie veľkonočná svieca, za ňou idú katechumeni s krstnými rodičmi, posluhujúci, diakon a kňaz. Príhovor je až pred požehnaním vody."},
            {"divider"},
            {"red|small|justify", "42. Ak sa nevysluhuje krst a nepožehnáva sa krstný prameň, litánie sa vynechajú a hneď nasleduje obrad požehnania vody (pozri č. 54)."},
            {"divider"},
            {"red|small|justify", "43. Do litánií možno vsunúť aj mená iných svätých, najmä z titulu kostola alebo patróna miesta a patrónov krstencov."},
            {"separated", "", "Pane, zmiluj sa.", "Pane, zmiluj sa."},
            {"separated", "", "Kriste, zmiluj sa.", "Kriste, zmiluj sa."},
            {"separated", "", "Pane, zmiluj sa.", "Pane, zmiluj sa. "},
            {"separated", "", "Svätá Mária, Matka Božia,", "oroduj za nás. "},
            {"separated", "", "Svätý Michal,", "oroduj za nás."},
            {"separated", "", "Svätí Boží anjeli,", "orodujte za nás."},
            {"separated", "", "Svätý Ján Krstiteľ,", "oroduj za nás."},
            {"separated", "", "Svätý Jozef,", "oroduj za nás."},
            {"separated", "", "Svätý Peter a Pavol,", "orodujte za nás."},
            {"separated", "", "Svätý Andrej,", "oroduj za nás."},
            {"separated", "", "Svätý Ján,", "oroduj za nás."},
            {"separated", "", "Svätá Mária Magdaléna,", "oroduj za nás."},
            {"separated", "", "Svätý Štefan,", "oroduj za nás."},
            {"separated", "", "Svätý Ignác Antiochijský,", "oroduj za nás."},
            {"separated", "", "Svätý Vavrinec,", "oroduj za nás."},
            {"separated", "", "Svätá Perpetua a Felicita,", "orodujte za nás."},
            {"separated", "", "Svätá Agnesa,", "oroduj za nás."},
            {"separated", "", "Svätý Vojtech,", "oroduj za nás."},
            {"separated", "", "Svätý Ján Nepomucký,", "oroduj za nás."},
            {"separated", "", "Svätý Gregor,", "oroduj za nás."},
            {"separated", "", "Svätý Augustín,", "oroduj za nás."},
            {"separated", "", "Svätý Atanáz,", "oroduj za nás."},
            {"separated", "", "Svätý Bazil,", "oroduj za nás."},
            {"separated", "", "Svätý Martin,", "oroduj za nás."},
            {"separated", "", "Svätý Benedikt,", "oroduj za nás."},
            {"separated", "", "Svätý Cyril a Metod,", "orodujte za nás."},
            {"separated", "", "Svätý Andrej Svorad a Beňadik,", "orodujte za nás."},
            {"separated", "", "Svätý František a Dominik,", "orodujte za nás."},
            {"separated", "", "Svätý František Xaverský,", "oroduj za nás."},
            {"separated", "", "Svätý Ján Mária Vianney,", "oroduj za nás."},
            {"separated", "", "Svätá Katarína Sienská,", "oroduj za nás."},
            {"separated", "", "Svätá Terézia Avilská,", "oroduj za nás."},
            {"separated", "", "Všetci Boží svätí a sväté,", "orodujte za nás."},
            {"separated", "", "Buď nám milostivý,", "ochraňuj nás, Pane."},
            {"separated", "", "Od všetkého zla,", "ochraňuj nás, Pane."},
            {"separated", "", "Od každého hriechu,", "ochraňuj nás, Pane."},
            {"separated", "", "Od večnej smrti,", "ochraňuj nás, Pane."},
            {"separated", "", "Pre tvoje vtelenie,", "ochraňuj nás, Pane."},
            {"separated", "", "Pre tvoju smrť\n" +
                    "a zmŕtvychvstanie,", "ochraňuj nás, Pane."},
            {"separated", "", "Pre zoslanie Ducha Svätého,", "ochraňuj nás, Pane. "},
            {"separated", "", "My hriešnici,", "prosíme ťa, vyslyš nás."},
            {"red|small", "Ak bude krst:"},
            {"separated", "", "Udeľ vo svätom krste milosť znovuzrodenia\n" +
                    "týmto svojim vyvoleným,", "prosíme ťa, vyslyš nás."},
            {"red|small", "Ak nebude krst:"},
            {"separated", "", "Posväť svojou milosťou túto vodu, z ktorej\n" +
                    "sa ti zrodia synovia a dcéry,", "prosíme ťa, vyslyš nás."},
            {"separated", "", "Ježišu, Syn živého Boha,", "prosíme ťa, vyslyš nás."},
            {"separated", "", "Kriste, uslyš nás. Kriste,", "uslyš nás."},
            {"separated", "", "Kriste, vyslyš nás. Kriste,", "vyslyš nás."},
            {"red|small", "Ak bude krst, kňaz s rozopätými rukami prednesie túto modlitbu:"},
            {"html", "Všemohúci a večný Bože,<br>" +
                    "prejav svoju moc vo sviatosti svojej lásky <font color='#B71C1C'>*</font><br>" +
                    "a zošli ducha synovstva na pretvorenie všetkých,<br>" +
                    "ktorí sa ti zrodia v krstnom prameni, <font color='#B71C1C'>—</font><br>" +
                    "aby sa tvojou mocou uskutočnilo to,<br>" +
                    "čo máme vykonať svojou pokornou službou.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"center", "Požehnanie krstnej vody"},
            {"red|small|justify", "44. Potom kňaz požehná krstnú vodu. S rozopätými rukami prednáša túto modlitbu:\n" +
                    "45. Potom kňaz požehná krstnú vodu. S rozopätými rukami prednáša túto modlitbu:"},
            {"", "Bože, tvoja neviditeľná moc zázračne účinkuje\n" +
                    "prostredníctvom sviatostných znakov.\n" +
                    "Stvoril si vodu\n" +
                    "a mnohorakým spôsobom si ju pripravoval,\n" +
                    "aby nám naznačovala milosť krstu.\n" +
                    "Bože, tvoj Duch sa už na počiatku stvorenia\n" +
                    "vznášal nad vodami,\n" +
                    "a tak voda už vtedy dostala schopnosť posväcovať.\n" +
                    "Bože, ty si potopou sveta\n" +
                    "vopred naznačil naše znovuzrodenie,\n" +
                    "aby v tajomstve jedného a toho istého živlu\n" +
                    "bol koniec nerestí a začiatok čností.\n" +
                    "Bože, ty si Abrahámovým potomkom dal\n" +
                    "suchou nohou prejsť cez Červené more,\n" +
                    "aby ľud vyslobodený z faraónovho otroctva\n" +
                    "bol predobrazom pokrsteného ľudu.\n" +
                    "Bože, tvoj Syn, pokrstený Jánom vo vodách Jordánu,\n" +
                    "bol pomazaný Duchom Svätým,\n" +
                    "a keď visel na kríži, z jeho boku vytiekla krv a voda.\n" +
                    "A keď vstal z mŕtvych, rozkázal učeníkom:\n" +
                    "„Choďte a učte všetky národy\n" +
                    "a krstite ich v mene Otca i Syna i Ducha Svätého.“\n" +
                    "Zhliadni na tvár svojej Cirkvi\n" +
                    "a milostivo jej otvor prameň krstnej vody.\n" +
                    "Nech Duch Svätý vloží do tejto vody milosť tvojho jednorodeného Syna,\n" +
                    "aby z človeka, stvoreného na obraz Boží,\n" +
                    "sviatosť krstu zmyla všetku nečistotu starého života a umožnila mu povstať z vody a z Ducha Svätého\n" +
                    "k novému detstvu."},
            {"red|small|justify", "46. Kňaz ponorí podľa okolností veľkonočnú sviecu do vody raz alebo trikrát a pokračuje:"},
            {"", "Prosíme ťa, Pane,\n" +
                    "nech skrze tvojho Syna\n" +
                    "zostúpi sila Ducha Svätého do tohto prameňa,"},
            {"red|small", "drží veľkonočnú sviecu vo vode a pokračuje:"},
            {"", "aby všetci, ktorí v krste umierajú\n" +
                    "a sú pochovaní s Kristom,\n" +
                    "povstali s ním aj k životu.\n" +
                    "Lebo on je Boh a s tebou žije a kraľuje\n" +
                    "v jednote Ducha Svätého po všetky veky vekov."},
            {"html", "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|small|justify", "47. Kňaz vytiahne veľkonočnú sviecu z vody. Ľud pritom zvolá:"},
            {"", "Dobrorečte Pánovi, pramene,\n" +
                    "chváľte a vyvyšujte ho naveky!"},
            {"red|small|justify", "48. Po požehnaní krstnej vody a zvolaní ľudu kňaz stojí a pýta sa dospelých ako i rodičov a krstných rodičov detí na zrieknutie sa Zlého ducha, ako je to uvedené v príslušných obradoch v Rímskom rituáli.\n" +
                    "Ak sa pomazanie olejom katechumenov u dospelých nevykonalo vopred v prípravných obradoch, vykoná sa v tomto momente.\n" +
                    "49. Potom sa kňaz pýta na vyznanie viery jednotlivých dospelých; v prípade detí sa tromi otázkami pýta na vyznanie viery spolu všetkých rodičov a krstných rodičov, ako je to uvedené v príslušných obradoch.\n" +
                    "Ak je v túto noc veľa krstencov, obrad sa môže usporiadať tak, že hneď po odpovedi krstencov, krstných rodičov a rodičov kňaz žiada a prijíma obnovu krstných sľubov všetkých veriacich.\n" +
                    "50. Po otázkach kňaz pokrstí vyvolených dospelých a deti.\n" +
                    "51. Po krste kňaz pomaže deti krizmou. Všetci, dospelí i deti, prijmú bie le rúcho. Potom posluhujúci podá kňazovi alebo diakonovi veľkonočnú sviecu a zažnú sa od nej sviece novopokrstených. Pri deťoch sa vynechá obrad „Effetha“."},
            {"html|small|justify", "<font color='#B71C1C'>52. Ak sa krst a vysvetľujúce obrady nekonali v presbytériu, nasleduje návrat do presbytéria v procesii zoradenej ako predtým. Novopokrstení alebo krstní rodičia, či rodičia nesú zažaté sviece. Počas procesie sa spieva krstný spev </font>Tiekla voda<font color='#B71C1C'> alebo iný vhodný spev (č. 56).<br>" +
                    "53. Ak boli pokrstení dospelí, biskup, alebo ak ho niet, kňaz, ktorý vysluhoval krst, im ihneď v presbytériu udelí sviatosť birmovania, ako je to uvedené v Rímskom pontifikáli alebo rituáli."},
            {"onClick", "6", "red|bigPadding",  "Slávenie sviatostí uvádzania do kresťanského života (otvoriť)"},
            {"onClick", "7", "red|bigPadding",  "Požehnanie vody (otvoriť)"},
            {"center", "Obnovenie krstných sľubov"},
            {"red|small|justify", "55. Po krstných (a birmovných) obradoch, alebo ak sa tieto sviatosti nevysluhovali, po požehnaní vody všetci vstanú a so zažatými sviecami v rukách obnovia krstné sľuby, ak už ich obnova nebola pri vysluhovaní krstu (porov. č. 49).\n" +
                    "Kňaz sa prihovorí veriacim týmito alebo podobnými slovami:"},
            {"", "Drahí bratia a sestry,\n" +
                    "prostredníctvom veľkonočného tajomstva\n" +
                    "sme boli v krste pochovaní s Kristom,\n" +
                    "aby sme s ním povstali k novému životu.\n" +
                    "Preto po skončení štyridsaťdennej\n" +
                    "predveľkonočnej prípravy\n" +
                    "obnovme sľuby svätého krstu,\n" +
                    "ktorými sme sa zriekli Zlého ducha\n" +
                    "a jeho skutkov a sľúbili sme,\n" +
                    "že budeme slúžiť Bohu vo svätej katolíckej Cirkvi.\n" +
                    "Preto sa vás pýtam:"},
            {"html", "<font color='#B71C1C'>Kňaz:</font> Zriekate sa Zlého ducha?<br>" +
                    "<font color='#B71C1C'>Všetci:</font> Zriekam.<br>" +
                    "<font color='#B71C1C'>Kňaz:</font> Aj všetkých jeho skutkov?<br>" +
                    "<font color='#B71C1C'>Všetci:</font> Zriekam.<br>" +
                    "<font color='#B71C1C'>Kňaz:</font> Aj všetkých jeho pokušení?<br>" +
                    "<font color='#B71C1C'>Všetci:</font> Zriekam."},
            {"red|small", "Alebo:"},
            {"html", "<font color='#B71C1C'>Kňaz:</font> Zriekate sa hriechu, aby ste mohli žiť v slobode Božích detí?<br>" +
                    "<font color='#B71C1C'>Všetci:</font> Zriekam.<br>" +
                    "<font color='#B71C1C'>Kňaz:</font> Zriekate sa vábivých pokušení, aby vás neovládal hriech?<br>" +
                    "<font color='#B71C1C'>Všetci:</font> Zriekam.<br>" +
                    "<font color='#B71C1C'>Kňaz:</font> Zriekate sa Zlého ducha, pôvodcu a kniežaťa hriechu?<br>" +
                    "<font color='#B71C1C'>Všetci:</font> Zriekam."},
            {"red|small", "Ak je to potrebné, konferencia biskupov môže túto druhú formulu upraviť podľa miestnych potrieb.\n" +
                    "Kňaz pokračuje:"},
            {"html", "<font color='#B71C1C'>Kňaz:</font> Veríte v Boha, Otca všemohúceho, Stvoriteľa neba i zeme?<br>" +
                    "<font color='#B71C1C'>Všetci:</font> Verím.<br>" +
                    "<font color='#B71C1C'>Kňaz:</font> Veríte v Ježiša Krista, jeho jediného Syna a nášho Pána, narodeného z Márie Panny, umučeného a pochovaného, ktorý vstal z mŕtvych a sedí po pravici Otca?<br>" +
                    "<font color='#B71C1C'>Všetci:</font> Verím.<br>" +
                    "<font color='#B71C1C'>Kňaz:</font> Veríte v Ducha Svätého, v svätú Cirkev katolícku, v spoločenstvo svätých, v odpustenie hriechov, vo vzkriesenie tela a v život večný?<br>" +
                    "<font color='#B71C1C'>Všetci:</font> Verím."},
            {"red|small", "Kňaz zakončí modlitbou:"},
            {"", "Všemohúci Boh, Otec nášho Pána Ježiša Krista,\n" +
                    "ktorý nás znovuzrodil z vody a z Ducha Svätého\n" +
                    "a odpustil nám hriechy,\n" +
                    "nech nás svojou milosťou zachová pre večný život\n" +
                    "v Ježišovi Kristovi, našom Pánovi."},
            {"html", "<font color='#B71C1C'>Všetci:</font> Amen."},
            {"red|small|justify", "56. Kňaz pokropí ľud požehnanou vodou. Všetci spievajú:"},
            {"html", "<font color='#B71C1C'>Ant.</font> Videl som vodu vytekať z pravej strany chrámu, aleluja;<br>" +
                    "a všetci, ku ktorým sa táto voda dostala, boli uzdravení<br>" +
                    "a budú volať: Aleluja, aleluja."},
            {"red|small", "Môže sa spievať aj iná pieseň pripomínajúca krst, napríklad (JKS 484):"},
            {"", "Tiekla voda z pravej strany svätyne, aleluja,\n" +
                    "krstom v nej sme povolaní k nevine, aleluja.\n" +
                    "Zmiluj sa nad nami, Bože, v nekonečnej milosti,\n" +
                    "tvoje zľutovanie môže zotrieť naše nečnosti."},
            {"red|small|justify", "57. Medzitým sa novopokrstení vrátia na svoje miesta medzi veriacich. Ak sa krstná voda nepožehnávala v krstiteľnici, diakon a posluhujúci dôstojne prenesú nádobu s vodou ku krstiteľnici.\n" +
                    "Ak sa nepožehnával krstný prameň, požehnaná voda sa odloží na zvyčajné miesto.\n" +
                    "58. Keď kňaz pokropil ľud, vráti sa k sedadlu. Vynechá sa vyznanie viery a hneď nasleduje modlitba veriacich, na ktorej sa po prvý raz zúčastnia aj novopokrstení."},
            {"red|bold", "Spoločná modlitba veriacich"},
            {"justify", "Bratia a sestry, v túto svätú noc slávime vzkriesenie nášho Pána. S radosťou a veľkou dôverou prednesme svoje prosby."},
            {"html|italic|justify", "(Volajme: Prosíme ťa, vyslyš nás.<br><font color='#B71C1C'>Alebo:</font> Víťazný Baránok, vyslyš naše prosby.)"},
            {"html|smallPadding|justify", "<font color='#B71C1C'>1.</font> Pane Ježišu, víťaz nad hriechom a smrťou, naplň svoju nevestu Cirkev, zrodenú z tvojho boku, veľkonočnou radosťou.<br>" +
                    "<font color='#B71C1C'>2.</font> Pane Ježišu, Boží Baránok, pritiahni k sebe celé ľudstvo, za ktoré si sa obetoval na kríži, a daj mu účasť na svojom božskom živote.<br>" +
                    "<font color='#B71C1C'>3.</font> Pane Ježišu, svetlo sveta, osvieť svojím Duchom všetkých, ktorí ešte nepoznajú tvoje vzkriesenie.<br>" +
                    "<font color='#B71C1C'>4.</font> Pane Ježišu, naša cesta, pravda a život, zachovaj v krstnej milosti a vo svojej láske všetkých, ktorí boli pokrstení v tejto svätej noci.<br>" +
                    "<font color='#B71C1C'>5.</font> Pane Ježišu, naša radosť, daj, aby sme s úprimným srdcom slávili v našich domoch a rodinách tvoje slávne zmŕtvychvstanie.<br>" +
                    "<font color='#B71C1C'>6.</font> Pane Ježišu, naše vzkriesenie a život, daj, aby naši zosnulí <font color='#B71C1C'>(M.)</font> dosiahli účasť na večnom živote v nebi."},
            {"", "Božský Vykupiteľ,\n" +
                    "ty si nás zmieril s Otcom a dal si nám účasť na Božom živote;\n" +
                    "daj, nech si ceníme svoje znovuzrodenie v krste\n" +
                    "a všade ohlasujeme veľkonočnú radosť.\n" +
                    "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"center|bold", "IV. časť\n" +
                    "Liturgia Eucharistie"},
            {"red|small|justify", "59. Kňaz pristúpi k oltáru a zvyčajným spôsobom začne liturgiu Eucharistie.\n" +
                    "60. Odporúča sa, aby chlieb a víno priniesli k oltáru novopokrstení, alebo ak boli krstené deti, ich rodičia alebo krstní rodičia."},
            {"red", "61. NAD OBETNÝMI DARMI"},
            {"html", "Prosíme ťa, Pane,<br>" +
                    "prijmi modlitby a obetné dary svojho ľudu <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby nám táto obeta, ktorá má pôvod<br>" +
                    "vo veľkonočnom tajomstve, <font color='#B71C1C'></font>—<br>" +
                    "zaistila večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"red", "62. PREFÁCIA"},
            {"insert", "prefacia"},
            {"html|small|justify", "<font color='#B71C1C'>63. V eucharistickej modlitbe sa spomenú pokrstení a ich krstní rodičia podľa formúl, ktoré sú uvedené v Rímskom misáli a rituáli pre jednotlivé eucharistické modlitby.<br>" +
                    "64. Pred </font>Hľa, Baránok Boží<font color='#B71C1C'> kňaz môže krátko poučiť novopokrstených o prijatí prvého svätého prijímania a o hodnote tohto tajomstva, ktoré je vrcholom iniciácie a stredobodom celého kresťanského života.<br>" +
                    "65. Žiada sa, aby novopokrstení prijali sväté prijímanie pod obidvoma spôsobmi spolu s krstnými rodičmi, rodičmi a katolíckymi príbuznými, ako aj s laickými katechétmi. Je tiež vhodné, aby so súhlasom diecézneho biskupa podľa okolností všetci veriaci prijali sväté prijímanie pod obidvoma spôsobmi."},
            {"insert", "eucharisticka modlitba"},
            {"insert", "obrad prijimania"},
            {"separated", "red", "66. SPEV NA PRIJÍMANIE", "(1 Kor 5, 7 – 8)"},
            {"", "Bol obetovaný náš veľkonočný Baránok, Kristus; preto slávme sviatky s nekvaseným chlebom čistoty a pravdy, aleluja."},
            {"red|small", "Je vhodné spievať Žalm 118."},
            {"red", "67. PO PRIJÍMANÍ"},
            {"html", "Pane, pri veľkonočnej hostine<br>" +
                    "si nás posilnil sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "naplň nás všetkých svojím Duchom <font color='#B71C1C'>—</font><br>" +
                    "a v láske nám zjednoť srdcia i mysle.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"red", "68. SLÁVNOSTNÉ POŽEHNANIE"},
            {"", "Pri dnešnej veľkonočnej slávnosti\n" +
                    "nech vás žehná všemohúci Boh a vo svojom milosrdenstve\n" +
                    "nech vás chráni od nebezpečenstva hriechu."},
            {"html", "<font color='#B71C1C'>℟.</font> Amen."},
            {"","Boh, ktorý vám zmŕtvychvstaním\n" +
                    "svojho jednorodeného Syna znova získal večný život,\n" +
                    "nech vám dá odmenu nesmrteľnosti."},
                            {"html", "<font color='#B71C1C'>℟.</font> Amen."},
                    {"","Boh, ktorý vám doprial po dňoch Pánovho umučenia\n" +
                    "radostne sláviť veľkonočné sviatky,\n" +
                    "nech vám pomáha dôjsť do večnej radosti."},
            {"html", "<font color='#B71C1C'>℟.</font> Amen.<br>" +
                    "A požehnanie všemohúceho Boha,<br>" +
                    "Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého,<br>" +
                    "nech zostúpi na vás<br>" +
                    "a zostane vždy s vami.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|small|justify", "69. Na prepustenie ľudu diakon, alebo ak ho niet, sám kňaz spieva alebo hovorí:"},
            {"", "Choďte v mene Božom, aleluja, aleluja."},
            {"red|small", "Alebo:"},
            {"", "Choďte v pokoji, aleluja, aleluja."},
            {"red|small", "Všetci odpovedia:"},
            {"", "Bohu vďaka, aleluja, aleluja."},
            {"red|small|justify", "To sa zachováva počas celej Veľkonočnej oktávy.\n" +
                    "70. Veľkonočná svieca sa zapaľuje pri všetkých slávnostnejších liturgických sláveniach v tomto období."},
            {"onClick", "8", "red|bigPadding", "Eucharistická procesia na oslavu vzkrieseného Pána (otvoriť)"}
    };

    String[][] piatok = {
            {"small|red|justify", "1. Podľa pradávnej tradície Cirkev v tento a v nasledujúci deň neslávi sviatosti okrem sviatosti zmierenia a pomazania chorých.\n" +
                    "2. V tento deň sa sväté prijímanie veriacim podáva výlučne v rámci liturgie utrpenia a smrti Pána; ale chorým, ktorí sa jej nemôžu zúčastniť, možno sväté prijímanie zaniesť kedykoľvek.\n" +
                    "3. Oltár má byť úplne obnažený, bez kríža, svietnikov a plachiet."},
            {"center", "Slávenie utrpenia a smrti Pána"},
            {"html|small|justify", "<font color='#B71C1C'>4. Popoludní okolo tretej hodiny, ak z pastoračných dôvodov netreba zvoliť neskoršiu hodinu, sa slávi liturgia umučenia Pána. Má tri časti: liturgiu slova, poklonu svätému krížu a sväté prijímanie.<br>" +
                    "5. Kňaz a diakon, ak je prítomný, sa oblečú ako na omšu do rúcha červenej farby; v tichosti prídu k oltáru, poklonia sa, ľahnú si dolu tvárou, alebo ak je to vhodnejšie, kľaknú si a zotrvajú chvíľu v tichej modlitbe. Všetci ostatní si kľaknú.<br>" +
                    "6. Potom kňaz a posluhujúci odídu k sedadlám. Kňaz stojí obrátený k ľudu a s rozopätými rukami sa modlí jednu z týchto modlitieb, pričom sa vynechá výzva </font>Modlime sa."},
            {"red", "MODLITBA"},
            {"html|small", "<font color='#B71C1C'>(Vynechá sa výzva:</font> Modlime sa.<font color='#B71C1C'>)</font>"},
            {"html", "Pane, rozpomeň sa<br>" +
                    "na veľké skutky svojho milosrdenstva<br>" +
                    "a ustavične ochraňuj a posväcuj svoj ľud, <font color='#B71C1C'>*</font><br>" +
                    "za ktorý tvoj Syn Ježiš Kristus vylial svoju krv, <font color='#B71C1C'>—</font><br>" +
                    "a tak ustanovil veľkonočné tajomstvo.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|small", "Alebo:"},
            {"html", "Milosrdný Bože,<br>" +
                    "utrpením a smrťou svojho Syna a nášho Pána<br>" +
                    "Ježiša Krista premohol si smrť,<br>" +
                    "ktorú celé ľudstvo zdedilo ako trest za prvotný hriech; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, urob nás podobnými Kristovi,<br>" +
                    "a keď sme podľa prirodzenosti doteraz žili<br>" +
                    "ako ľudia hriešni, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme odteraz, posvätení tvojou milosťou,<br>" +
                    "žili ako ľudia vykúpení.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"center|bold|bigPadding", "I. ČASŤ\n" +
                    "LITURGIA SLOVA"},
            {"small|red|justify", "7. Potom sa číta prvé čítanie z Knihy proroka Izaiáša (52, 13 – 53, 12) s príslušným žalmom. Všetci pritom sedia.\n" +
                    "8. Nasleduje druhé čítanie z Listu Hebrejom (4, 14 – 16; 5, 7 – 9) a spev pred evanjeliom.\n" +
                    "9. Potom sa prednášajú pašie podľa svätého Jána (18, 1 – 19, 42) takým istým spôsobom ako predchádzajúcu nedeľu.\n" +
                    "10. Po pašiách kňaz prednesie krátku homíliu. V jej závere môže kňaz vyzvať veriacich na krátku modlitbu."},
            {"separated", "red", "PRVÉ ČÍTANIE", "Iz 52, 13 – 53, 12"},
            {"italic|center", "On bol prebodnutý pre naše neprávosti\n" +
                    "Štvrtý spev Pánovho sluhu"},
            {"html|justify", "Čítanie z Knihy proroka Izaiáša<br>" +
                    "Boh hovorí:<br>" +
                    "Hľa, môj služobník bude úspešný, bude povýšený, vyzdvihnutý a veľmi slávny. Ako sa mnohí nad ním zhrozili – lebo bol zohavený, že sa výzorom nepodobá človeku a vzhľadom sa neponáša na ľudí –, tak rozoženie mnohé národy. Králi pred ním zatvoria ústa, lebo uvidia, o čom sa im nevravelo, a spoznajú, čo nikdy nepočuli.<br>" +
                    "Prorok hovorí:<br>" +
                    "Kto uveril, čo sme hlásali? A Pánovo rameno komu sa zjavilo? Veď vzišiel pred ním ako ratoliestka, sťa koreň z vyschnutej zeme. Nemal podoby ani krásy, aby sme naň hľadeli; ani výzor nemal, aby sme po ňom túžili. Opovrhnutý bol a najposlednejší z ľudí, muž bolestí, ktorý poznal slabosť, ako niekto, pred kým si zakrývame tvár, opovrhnutý, a preto sme si ho nevážili. A on niesol naše neduhy, vzal na seba naše bolesti. No my sme ho pokladali za zbitého, strestaného Bohom a pokoreného. Ale on bol prebodnutý pre naše neprávosti, pre naše zločiny strýznený. On pre náš pokoj znášal trest a jeho rany nás uzdravili.<br>" +
                    "My všetci sme blúdili ako ovce, každý zahol svojou vlastnou cestou. A Pán na neho uvalil neprávosť nás všetkých. Týrali ho, on to ponížene znášal a neotvoril ústa; ako baránok vedený na zabitie, ako ovca, ktorá onemela pred strihačmi a neotvorila ústa.<br>" +
                    "Násilným súdom ho odstránili a kto sa bude starať o jeho pokolenie? Veď bol vyťatý z krajiny žijúcich, pre hriech môjho ľudu na smrť ubitý. So zločincami ho pochovali, a hrob mal medzi boháčmi, hoci sa nedopustil neprávosti, ani lesť nebola v jeho ústach.<br>" +
                    "Pán dovolil zdrviť ho slabosťou; keď dá svoj život na zmiernu obetu, uvidí ďaleké potomstvo a jeho ruka úspešne vykoná Pánovu vôľu. Po útrapách svojej duše uvidí svetlo a nasýti sa poznaním.<br>" +
                    "Boh hovorí:<br>" +
                    "Môj spravodlivý služobník ospravedlní mnohých a sám ponesie ich viny. Preto mu dám ako podiel zástupy a s mocnými sa bude deliť o korisť, pretože vydal na smrť svoj život a započítali ho medzi zločincov; a on niesol hriech mnohých a prosí za hriešnikov.<br>" +
                    "Počuli sme Božie slovo."},
            {"separated", "red", "RESPONZÓRIOVÝ ŽALM", "Ž 31, 2+6. 12-13. 15-16. 17+25"},
            {"html", "<font color='#B71C1C'>R.:</font> Otče, do tvojich rúk porúčam svojho ducha.<br><br>" +
                    "Pane, v teba dúfam, nech nie som zahanbený naveky; <font color='#B71C1C'>*</font><br>" +
                    "vysloboď ma, veď si spravodlivý.<br>" +
                    "Do tvojich rúk porúčam svojho ducha; <font color='#B71C1C'>*</font><br>" +
                    "ty si ma vykúpil, Pane, Bože verný. <font color='#B71C1C'>R.</font><br>" +
                    "Všetci moji nepriatelia mnou opovrhujú, <font color='#B71C1C'>✠</font><br>" +
                    "susedom som na posmech<br>" +
                    "a svojim známym som postrachom. <font color='#B71C1C'>*</font><br>" +
                    "Tí, čo ma vidia na ulici, utekajú predo mnou.<br>" +
                    "Vytrácam sa z ich pamäti ako mŕtvy, <font color='#B71C1C'>*</font><br>" +
                    "som sťa odhodená nádoba. <font color='#B71C1C'>R.</font><br>" +
                    "Ja sa však spolieham na teba, Pane,<br>" +
                    "a hovorím: „Ty si môj Boh, <font color='#B71C1C'>*</font><br>" +
                    "v tvojich rukách je môj osud.“<br>" +
                    "Vytrhni ma z rúk mojich nepriateľov <font color='#B71C1C'>*</font><br>" +
                    "a prenasledovateľov. <font color='#B71C1C'>R.</font><br>" +
                    "Rozjasni svoju tvár nad svojím sluhom <font color='#B71C1C'>*</font><br>" +
                    "a zachráň ma vo svojom milosrdenstve.<br>" +
                    "Vzmužte sa a majte srdce statočné, <font color='#B71C1C'>*</font><br>" +
                    "vy všetci, čo dúfate v Pána. <font color='#B71C1C'>R.</font>"},
            {"separated", "red", "DRUHÉ ČÍTANIE", "Hebr 4, 14-16; 5, 7-9"},
            {"italic|center", "Naučil sa poslušnosti a stal sa pôvodcom večnej spásy pre všetkých, ktorí ho poslúchajú"},
            {"html|justify", "Čítanie z Listu Hebrejom<br>" +
                    "Bratia, keďže máme vznešeného veľkňaza, ktorý prenikol nebesia, Ježiša, Božieho Syna, držme sa svojho vyznania. Veď nemáme veľkňaza, ktorý by nemohol cítiť s našimi slabosťami; veď bol podobne skúšaný vo všetkom okrem hriechu. Pristupujme teda s dôverou k trónu milosti, aby sme dosiahli milosrdenstvo a našli milosť a pomoc v pravom čase.<br>" +
                    "Kristus v dňoch svojho pozemského života so silným výkrikom a so slzami prednášal prosby a modlitby tomu, ktorý ho mohol zachrániť od smrti; a bol vyslyšaný pre svoju bohabojnosť. A hoci bol Synom, z toho, čo vytrpel, naučil sa poslušnosti; a keď dosiahol dokonalosť, stal sa pôvodcom večnej spásy pre všetkých, ktorí ho poslúchajú.<br>" +
                    "Počuli sme Božie slovo."},
            {"separated", "red", "VERŠ PRED EVANJELIOM", "Flp 2, 8-9"},
            {"html", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Kristus sa stal pre nás poslušným až na smrť,<br>" +
                    "až na smrť na kríži.<br>" +
                    "Preto ho Boh nad všetko povýšil<br>" +
                    "a dal mu meno, ktoré je nad každé iné meno.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"separated", "red", "EVANJELIUM", "Jn 18, 1 – 19, 42"},
            {"red|small", "Značky pri dialogickom čítaní: E - evanjelista, + - Kristove slová, S - slová ostatných osôb."},
            {"", "Umučenie nášho Pána Ježiša Krista podľa Jána"},
            {"italic|center", "Ježiša chytili a zviazali"},
            {"html|justify", "<font color='#B71C1C'>E</font> Ježiš vyšiel so svojimi učeníkmi za potok Cedron. Tam bola záhrada. Vošiel do nej on i jeho učeníci. O tom mieste však vedel aj jeho zradca Judáš, lebo Ježiš sa tam často schádzal so svojimi učeníkmi.<br>" +
                    "<font color='#B71C1C'>E</font> Judáš vzal kohortu a sluhov od veľkňazov a farizejov a prišiel ta s lampášmi, fakľami a zbraňami. Ale Ježiš, keďže vedel všetko, čo malo naňho prísť, popodišiel a opýtal sa ich: <font color='#B71C1C'>✠</font> „Koho hľadáte?“<br>" +
                    "<font color='#B71C1C'>E</font> Odpovedali mu: <font color='#B71C1C'>S</font> „Ježiša Nazaretského.“<br>" +
                    "<font color='#B71C1C'>E</font> Povedal im: <font color='#B71C1C'>✠</font> „Ja som.“<br>" +
                    "<font color='#B71C1C'>E</font> Bol s nimi aj zradca Judáš.<br>" +
                    "<font color='#B71C1C'>E</font> Ako im povedal: „Ja som,“ cúvli a popadali na zem. Znova sa ich teda opýtal: + „Koho hľadáte?“<br>" +
                    "<font color='#B71C1C'>E</font> Oni povedali: <font color='#B71C1C'>S</font> „Ježiša Nazaretského.“<br>" +
                    "<font color='#B71C1C'>E</font> Ježiš odvetil: <font color='#B71C1C'>✠</font> „Povedal som vám: Ja som. Keď teda mňa hľadáte, týchto nechajte odísť!“<br>" +
                    "<font color='#B71C1C'>E</font> Tak sa malo splniť slovo, ktoré povedal: „Z tých, ktorých si mi dal, nestratil som ani jedného.“<br>" +
                    "<font color='#B71C1C'>E</font> Šimon Peter mal meč. Vytasil ho, zasiahol ním veľkňazovho sluhu a odťal mu pravé ucho. Sluha sa volal Malchus. Ale Ježiš Petrovi povedal: <font color='#B71C1C'>✠</font> „Schovaj meč do pošvy! Azda nemám piť kalich, ktorý mi dal Otec?!“"},
            {"italic|center", "Ježiša priviedli najprv k Annášovi"},
            {"html|justify", "<font color='#B71C1C'>E</font> Kohorta, veliteľ a židovskí sluhovia Ježiša chytili, zviazali ho a priviedli najprv k Annášovi; bol totiž tesťom Kajfáša, ktorý bol veľkňazom toho roka. A bol to Kajfáš, čo poradil Židom: „Je lepšie, ak zomrie jeden človek za ľud.“<br>" +
                    "<font color='#B71C1C'>E</font> Za Ježišom šiel Šimon Peter a iný učeník. Ten učeník sa poznal s veľkňazom a vošiel s Ježišom do veľkňazovho dvora, Peter však ostal vonku pri dverách. Potom ten druhý učeník, čo sa poznal s veľkňazom, vyšiel, prehovoril s vrátničkou a voviedol ta Petra. Tu vrátnička povedala Petrovi: <font color='#B71C1C'>S</font> „Nie si aj ty z učeníkov toho človeka?“<br>" +
                    "<font color='#B71C1C'>E</font> On vravel: <font color='#B71C1C'>S</font> „Nie som.“<br>" +
                    "<font color='#B71C1C'>E</font> Stáli tam sluhovia a strážnici, ktorí si rozložili oheň, lebo bolo chladno, a zohrievali sa. S nimi stál aj Peter a zohrieval sa.<br>" +
                    "<font color='#B71C1C'>E</font> Veľkňaz sa vypytoval Ježiša na jeho učeníkov a na jeho učenie. Ježiš mu odpovedal: <font color='#B71C1C'>✠</font> „Ja som verejne hovoril svetu. Vždy som učil v synagóge a v chráme, kde sa schádzajú všetci Židia, a nič som nehovoril tajne. Prečo sa pýtaš mňa? Opýtaj sa tých, ktorí počuli, čo som im hovoril! Oni vedia, čo som hovoril.“<br>" +
                    "<font color='#B71C1C'>E</font> Ako to povedal, jeden zo sluhov, čo tam stál, udrel Ježiša po tvári a povedal: <font color='#B71C1C'>S</font> „Tak odpovedáš veľkňazovi?“<br>" +
                    "Ježiš mu odvetil: <font color='#B71C1C'>✠</font> „Ak som zle povedal, dokáž, čo bolo zlé, ale ak dobre, prečo ma biješ?!“<br>" +
                    "<font color='#B71C1C'>E</font> A tak ho Annáš zviazaného poslal k veľkňazovi Kajfášovi."},
            {"italic|center", "Nie si aj ty z jeho učeníkov? Nie som"},
            {"html|justify", "<font color='#B71C1C'>E</font> Šimon Peter tam stál a zohrieval sa. I pýtali sa ho: „Nie si aj ty z jeho učeníkov?“<br>" +
                    "<font color='#B71C1C'>E</font> On zaprel: <font color='#B71C1C'>S</font> „Nie som.“<br>" +
                    "<font color='#B71C1C'>E</font> Jeden z veľkňazových sluhov, príbuzný toho, ktorému Peter odťal ucho, vravel: <font color='#B71C1C'>S</font> „A nevidel som ťa s ním v záhrade?!“<br>" +
                    "<font color='#B71C1C'>E</font> Peter znova zaprel – a vtom zaspieval kohút."},
            {"italic|center", "Moje kráľovstvo nie je z tohto sveta"},
            {"html|justify", "<font color='#B71C1C'>E</font> Od Kajfáša viedli Ježiša do vládnej budovy. Bolo už ráno. Ale oni do vládnej budovy nevošli, aby sa nepoškvrnili a mohli jesť veľkonočného baránka. Preto vyšiel von za nimi Pilát a opýtal sa: <font color='#B71C1C'>S</font> „Akú žalobu podávate proti tomuto človeku?“<br>" +
                    "<font color='#B71C1C'>E</font> Odpovedali mu: <font color='#B71C1C'>S</font> „Keby tento nebol zločinec, neboli by sme ti ho vydali.“<br>" +
                    "<font color='#B71C1C'>E</font> Pilát im povedal: <font color='#B71C1C'>S</font> „Vezmite si ho vy a súďte podľa svojho zákona!“<br>" +
                    "<font color='#B71C1C'>E</font> Židia mu odpovedali: <font color='#B71C1C'>S</font> „My nesmieme nikoho usmrtiť.“ Tak sa malo splniť Ježišovo slovo, ktorým naznačil, akou smrťou zomrie.<br>" +
                    "<font color='#B71C1C'>E</font> Pilát opäť vošiel do vládnej budovy. Predvolal si Ježiša a spýtal sa ho: <font color='#B71C1C'>S</font> „Si židovský kráľ?“<br>" +
                    "<font color='#B71C1C'>E</font> Ježiš odpovedal: <font color='#B71C1C'>✠</font> „Hovoríš to sám od seba, alebo ti to iní povedali o mne?“<br>" +
                    "<font color='#B71C1C'>E</font> Pilát odvetil: <font color='#B71C1C'>S</font> „Vari som ja Žid? Tvoj národ a veľkňazi mi ťa vydali. Čo si vykonal?“<br>" +
                    "<font color='#B71C1C'>E</font> Ježiš povedal: <font color='#B71C1C'>✠</font> „Moje kráľovstvo nie je z tohto sveta. Keby moje kráľovstvo bolo z tohto sveta, moji služobníci by sa bili, aby som nebol vydaný Židom. Lenže moje kráľovstvo nie je stadiaľto.“<br>" +
                    "<font color='#B71C1C'>E</font> Pilát mu povedal: <font color='#B71C1C'>S</font> „Tak predsa si kráľ?“<br>" +
                    "<font color='#B71C1C'>E</font> Ježiš odpovedal: <font color='#B71C1C'>✠</font> „Sám hovoríš, že som kráľ. Ja som sa na to narodil a na to som prišiel na svet, aby som vydal svedectvo pravde. Každý, kto je z pravdy, počúva môj hlas.“<br>" +
                    "<font color='#B71C1C'>E</font> Pilát mu povedal: <font color='#B71C1C'>S</font> „Čo je pravda?“<br>" +
                    "<font color='#B71C1C'>E</font> Ako to povedal, znova vyšiel k Židom a vravel im: <font color='#B71C1C'>S</font> „Ja na ňom nenachádzam nijakú vinu. Je však u vás zvykom, že vám na Veľkú noc prepúšťam jedného väzňa. Chcete teda, aby som vám prepustil židovského kráľa?“<br>" +
                    "<font color='#B71C1C'>E</font> Oni znova kričali: <font color='#B71C1C'>S</font> „Toho nie, ale Barabáša!“ <font color='#B71C1C'>E</font> A Barabáš bol zbojník."},
            {"italic|center", "Buď pozdravený, židovský kráľ!"},
            {"html|justify", "<font color='#B71C1C'>E</font> Vtedy Pilát Ježiša vzal a dal ho zbičovať. Vojaci uplietli z tŕnia korunu, položili mu ju na hlavu a odeli ho do purpurového plášťa. Prichádzali k nemu a hovorili: <font color='#B71C1C'>S</font> „Buď pozdravený, židovský kráľ!“ <font color='#B71C1C'>E</font> A bili ho po tvári.<br>" +
                    "<font color='#B71C1C'>E</font> Pilát znova vyšiel a povedal im: <font color='#B71C1C'>S</font> „Pozrite, privádzam vám ho von, aby ste vedeli, že na ňom nijakú vinu nenachádzam.“<br>" +
                    "<font color='#B71C1C'>E</font> Ježiš vyšiel von s tŕňovou korunou a v purpurovom plášti. Pilát im povedal: <font color='#B71C1C'>S</font> „Hľa, človek!“<br>" +
                    "<font color='#B71C1C'>E</font> Len čo ho zazreli veľkňazi a ich sluhovia, kričali: <font color='#B71C1C'>S</font> „Ukrižuj! Ukrižuj ho!“<br>" +
                    "<font color='#B71C1C'>E</font> Pilát im povedal: <font color='#B71C1C'>S</font> „Vezmite si ho a ukrižujte. Ja na ňom nenachádzam vinu.“<br>" +
                    "<font color='#B71C1C'>E</font> Židia mu odpovedali: <font color='#B71C1C'>S</font> „My máme zákon a podľa zákona musí umrieť, lebo sa vydával za Božieho Syna.“<br>" +
                    "<font color='#B71C1C'>E</font> Keď to Pilát počul, ešte väčšmi sa naľakal. Znova vošiel do vládnej budovy a spýtal sa Ježiša: <font color='#B71C1C'>S</font> „Odkiaľ si?“ <br>" +
                    "<font color='#B71C1C'>E</font> Ale Ježiš mu neodpovedal. Pilát sa ho spýtal: <font color='#B71C1C'>S</font> „So mnou sa nechceš rozprávať?! Nevieš, že mám moc prepustiť ťa a moc ukrižovať ťa?“<br>" +
                    "<font color='#B71C1C'>E</font> Ježiš odpovedal: <font color='#B71C1C'>✠</font> „Nemal by si nado mnou nijakú moc, keby ti to nebolo dané zhora. Preto má väčší hriech ten, čo ma vydal tebe.“"},
            {"italic|center", "Preč s ním! Preč s ním! Ukrižuj ho!"},
            {"html|justify", "<font color='#B71C1C'>E</font> Od tej chvíle sa Pilát usiloval prepustiť ho. Ale Židia kričali: <font color='#B71C1C'>S</font> „Ak ho prepustíš, nie si priateľom cisára. Každý, kto sa vydáva za kráľa, stavia sa proti cisárovi.“<br>" +
                    "<font color='#B71C1C'>E</font> Keď Pilát počul tieto slová, vyviedol Ježiša von a sadol si na súdnu stolicu na mieste zvanom Lithostrotus, po hebrejsky Gabbatha. Bol Prípravný deň pred Veľkou nocou, okolo poludnia.<br>" +
                    "<font color='#B71C1C'>E</font> Tu povedal Židom: <font color='#B71C1C'>S</font> „Hľa, váš kráľ!“<br>" +
                    "<font color='#B71C1C'>E</font> Ale oni kričali: <font color='#B71C1C'>S</font> „Preč s ním! Preč s ním! Ukrižuj ho!“<br>" +
                    "<font color='#B71C1C'>E</font> Pilát im povedal: <font color='#B71C1C'>S</font> „Vášho kráľa mám ukrižovať?!“<br>" +
                    "<font color='#B71C1C'>E</font> Veľkňazi odpovedali: <font color='#B71C1C'>S</font> „Nemáme kráľa, iba cisára!“ Tak im ho teda vydal, aby ho ukrižovali. A oni prevzali Ježiša."},
            {"italic|center", "Ukrižovali ho a s ním iných dvoch"},
            {"html|justify", "<font color='#B71C1C'>E</font> Sám si niesol kríž a vyšiel na miesto, ktoré sa volá Lebka, po hebrejsky Golgota. Tam ho ukrižovali a s ním iných dvoch, z jednej i druhej strany, Ježiša v prostriedku. Pilát vyhotovil aj nápis a pripevnil ho na kríž. Bolo tam napísané: „Ježiš Nazaretský, židovský kráľ.“ Tento nápis čítalo mnoho Židov, lebo miesto, kde Ježiša ukrižovali, bolo blízko mesta; a bol napísaný po hebrejsky, latinsky a grécky.<br>" +
                    "<font color='#B71C1C'>E</font> Židovskí veľkňazi povedali Pilátovi: <font color='#B71C1C'>S</font> „Nepíš: Židovský kráľ, ale: On povedal: ‚Som židovský kráľ.‘“<br>" +
                    "<font color='#B71C1C'>E</font> Pilát odpovedal: <font color='#B71C1C'>S</font> „Čo som napísal, to som napísal.“"},
            {"italic|center", "Rozdelili si moje šaty"},
            {"html|justify", "<font color='#B71C1C'>E</font> Keď vojaci Ježiša ukrižovali, vzali jeho šaty a rozdelili ich na štyri časti, pre každého vojaka jednu. Vzali aj spodný odev. Ale tento odev bol nezošívaný, odhora v celku utkaný. Preto si medzi sebou povedali: <font color='#B71C1C'>S</font> „Netrhajme ho, ale losujme oň, čí bude!“ <font color='#B71C1C'>E</font> Aby sa splnilo Písmo:<br>" +
                    "„Rozdelili si moje šaty<br>" +
                    "a o môj odev hodili lós.“<br>" +
                    "<font color='#B71C1C'>E</font> A vojaci to tak urobili."},
            {"italic|center", "Hľa, tvoj syn! Hľa, tvoja matka!"},
                    {"html|justify", "<font color='#B71C1C'>E</font> Pri Ježišovom kríži stála jeho matka, sestra jeho matky, Mária Kleopasova, a Mária Magdaléna. Keď Ježiš uzrel matku a pri nej učeníka, ktorého miloval, povedal matke: <font color='#B71C1C'>✠</font> „Žena, hľa, tvoj syn!“<br>" +
                    "<font color='#B71C1C'>E</font> Potom povedal učeníkovi: <font color='#B71C1C'>✠</font> „Hľa, tvoja matka!“ A od tej hodiny si ju učeník vzal k sebe."},
            {"italic|center", "Je dokonané"},
            {"html|justify", "<font color='#B71C1C'>E</font> Potom Ježiš vo vedomí, že je už všetko dokonané, povedal, aby sa splnilo Písmo: <font color='#B71C1C'>✠</font> „Žíznim.“<br>" +
                    "<font color='#B71C1C'>E</font> Bola tam nádoba plná octu. Nastokli teda na yzop špongiu naplnenú octom a podali mu ju k ústam. Keď Ježiš okúsil ocot, povedal: <font color='#B71C1C'>✠</font> „Je dokonané.“ <font color='#B71C1C'>E</font> Naklonil hlavu a odovzdal ducha."},
            {"red", "Pokľakne sa a chvíľku je ticho."},
            {"italic|center", "Hneď vyšla krv a voda"},
            {"html|justify", "<font color='#B71C1C'>E</font> Keďže bol Prípravný deň, Židia požiadali Piláta, aby ukrižovaným polámali nohy a sňali ich, aby nezostali telá na kríži cez sobotu, lebo v tú sobotu bol veľký sviatok. Prišli teda vojaci a polámali kosti prvému aj druhému, čo boli s ním ukrižovaní. No keď prišli k Ježišovi a videli, že je už mŕtvy, kosti mu nepolámali, ale jeden z vojakov mu kopijou prebodol bok a hneď vyšla krv a voda.<br>" +
                    "<font color='#B71C1C'>E</font> A ten, ktorý to videl, vydal o tom svedectvo a jeho svedectvo je pravdivé. On vie, že hovorí pravdu, aby ste aj vy uverili. Toto sa stalo, aby sa splnilo Písmo: „Kosť mu nebude zlomená.“ A na inom mieste Písmo hovorí: „Uvidia, koho prebodli.“"},
            {"italic|center", "Ježišovo telo zavinuli do plátna s voňavými olejmi"},
                    {"html|justify","<font color='#B71C1C'>E</font> Potom Jozef z Arimatey, ktorý bol Ježišovým učeníkom, ale tajným, lebo sa bál Židov, poprosil Piláta, aby mu dovolil sňať Ježišovo telo. A Pilát dovolil. Išiel teda a sňal jeho telo.<br>" +
                    "<font color='#B71C1C'>E</font> Prišiel aj Nikodém, ten, čo bol kedysi u neho v noci. Priniesol asi sto libier zmesi myrhy s aloou. Vzali Ježišovo telo a zavinuli ho do plátna s voňavými olejmi, ako je u Židov zvykom pochovávať. V tých miestach, kde bol ukrižovaný, bola záhrada a v záhrade nový hrob, v ktorom ešte nik neležal. Tam teda uložili Ježiša, lebo bol židovský Prípravný deň a hrob bol blízko.<br>" +
                    "Počuli sme slovo Pánovo."},
            {"center", "Modlitba veriacich"},
            {"html|small|justify", "<font color='#B71C1C'>11. Poslednou časťou liturgie slova je modlitba veriacich. Diakon, alebo ak ho niet, posluhujúci laik, stojí pri ambóne a prednáša výzvu, ktorou oznámi úmysel. Potom všetci zotrvajú chvíľu v tichej modlitbe. Nato kňaz, stojaci pri sedadle alebo podľa okolností pri oltári, prednáša s rozopätými rukami modlitbu.<br>" +
                    "Veriaci počas modlitby stoja alebo kľačia.<br>" +
                    "12. Pred modlitbou kňaza možno, podľa tradície, zachovať výzvy diakona </font>Kľaknime si – Vstaňte<font color='#B71C1C'>, kedy si všetci kľaknú a ticho sa modlia. Konferencie biskupov môžu pripraviť iné úvodné výzvy pred modlitbou kňaza.<br>" +
                    "13. Keď si to vážny verejný záujem vyžaduje, diecézny biskup môže dovoliť alebo určiť, aby sa pridala aj iná modlitba na osobitný úmysel.</font>"},
            {"red|bold|smallPadding", "I. ZA SVÄTÚ CIRKEV"},
            {"html|small|justify", "<font color='#B71C1C'>Modlitba sa prednáša v jednoduchom nápeve, alebo ak sa použijú výzvy </font>Kľaknime si – Vstaňte<font color='#B71C1C'>, v slávnostnom nápeve.</font>"},
            {"", "Modlime sa, milovaní bratia a sestry,\n" +
                    "za svätú Božiu Cirkev, nech jej náš Boh a Pán\n" +
                    "láskavo udelí pokoj, jednotu a ochranu na celom svete,\n" +
                    "aby sme mohli pokojne a nerušene oslavovať\n" +
                    "Boha Otca všemohúceho."},
            {"small|red", "Modlitba v tichosti. Potom kňaz pokračuje:"},
            {"html", "Všemohúci a večný Bože, ty si v Kristovi zjavil<br>" +
                    "svoju slávu všetkým národom; <font color='#B71C1C'>*</font><br>" +
                    "ochraňuj dielo svojho milosrdenstva, <font color='#B71C1C'>—</font><br>" +
                    "aby tvoja Cirkev, rozšírená po celom svete,<br>" +
                    "vytrvala v pevnej viere a neohrozene ťa vyznávala.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|bold|smallPadding", "II. ZA PÁPEŽA"},
            {"html", "Modlime sa za nášho Svätého Otca, pápeža <font color='#B71C1C'>M.</font>,<br>" +
                    "ktorého si náš Boh a Pán vyvolil spomedzi biskupov,<br>" +
                    "nech ho chráni a zachová pre svoju Cirkev,<br>" +
                    "aby mohol spravovať svätý ľud Boží."},
            {"small|red", "Modlitba v tichosti. Potom kňaz pokračuje:"},
            {"html", "Všemohúci a večný Bože,<br>" +
                    "od tvojej vôle závisí všetko; <font color='#B71C1C'>*</font><br>" +
                    "láskavo vypočuj naše prosby<br>" +
                    "a ochraňuj nášho najvyššieho pastiera, <font color='#B71C1C'>—</font><br>" +
                    "aby kresťanský ľud, ktorému ty vládneš,<br>" +
                    "pod jeho vedením rástol vo viere.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|bold|smallPadding", "III. ZA VŠETKY RÁDY A STUPNE VERIACICH"},
            {"html", "Modlime sa za nášho biskupa <font color='#B71C1C'>M.*</font>,<br>" +
                    "za všetkých biskupov, kňazov a diakonov svätej Cirkvi<br>" +
                    "i za všetok veriaci ľud."},
            {"small|red|justify", "* Tu možno spomenúť biskupa koadjútora alebo pomocných biskupov v zmysle Všeobecných smerníc Rímskeho misála, č. 149.\n" +
                    "Modlitba v tichosti. Potom kňaz pokračuje:"},
            {"html", "Všemohúci a večný Bože,<br>" +
                    "tvoj Duch posväcuje a spravuje celú Cirkev; <font color='#B71C1C'>*</font><br>" +
                    "vypočuj naše prosby za tvojich služobníkov <font color='#B71C1C'>—</font><br>" +
                    "a udeľ im milosť, aby ti všetci verne slúžili.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|bold|smallPadding", "IV. ZA KATECHUMENOV"},
            {"html", "Modlime sa za <font color='#B71C1C'>(</font>našich<font color='#B71C1C'>)</font> katechumenov,<br>" +
                    " nech náš Boh a Pán pripraví ich srdcia<br>" +
                    "a otvorí im bránu svojho milosrdenstva,<br>" +
                    "aby v prameni znovuzrodenia<br>" +
                    "dosiahli odpustenie hriechov<br>" +
                    "a nový život v Ježišovi Kristovi, našom Pánovi."},
            {"small|red", "Modlitba v tichosti. Potom kňaz pokračuje:"},
            {"html", "Všemohúci a večný Bože,<br>" +
                    "ty stále požehnávaš svoju Cirkev novým potomstvom; <font color='#B71C1C'>*</font><br>" +
                    "zveľaďuj dar viery a poznania<br>" +
                    "v <font color='#B71C1C'>(</font>našich<font color='#B71C1C'>)</font> katechumenoch, <font color='#B71C1C'>—</font><br>" +
                    "aby sa znovuzrodili v krstnom prameni<br>" +
                    "a boli pripočítaní medzi tvoje adoptívne deti.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|bold|smallPadding", "V. ZA JEDNOTU KRESŤANOV"},
            {"", "Modlime sa za všetkých bratov, čo veria v Krista\n" +
                    "a úprimne žijú podľa pravdy,\n" +
                    "nech ich náš Boh a Pán zjednotí\n" +
                    "a zachová vo svojej jedinej Cirkvi."},
            {"small|red", "Modlitba v tichosti. Potom kňaz pokračuje:"},
            {"html", "Všemohúci a večný Bože,<br>" +
                    "ty zjednocuješ rozdelených<br>" +
                    "a zjednotených zachovávaš vo svornosti; <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na všetkých, ktorí veria v tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a keďže ich posvätil ten istý krst,<br>" +
                    "nech ich spája aj pravá viera a vzájomná láska.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|bold|smallPadding", "VI. ZA ŽIDOV"},
            {"", "Modlime sa aj za synov židovského národa,\n" +
                    "lebo oni boli prví, ku ktorým Pán prehovoril,\n" +
                    "nech vzrastajú v láske k Bohu\n" +
                    "a vo vernosti k jeho zákonu."},
            {"small|red", "Modlitba v tichosti. Potom kňaz pokračuje:"},
            {"html", "Všemohúci a večný Bože,<br>" +
                    "ty si dal svoje prisľúbenia Abrahámovi a jeho potomkom; <font color='#B71C1C'>*</font><br>" +
                    "milostivo vypočuj prosby svojej Cirkvi, <font color='#B71C1C'>—</font><br>" +
                    "aby národ, ktorý si si ako prvý vyvolil,<br>" +
                    "dosiahol plnosť vykúpenia.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|bold|smallPadding", "VII. ZA TÝCH, ČO NEVERIA V KRISTA"},
            {"", "Modlime sa za tých, čo neveria v Krista,\n" +
                    "aby ich Duch Svätý osvietil a priviedol na cestu spásy."},
            {"small|red", "Modlitba v tichosti. Potom kňaz pokračuje:"},
            {"html", "Všemohúci a večný Bože, daj, aby tí,<br>" +
                    "čo nevyznávajú Krista, žili pred tvojou tvárou<br>" +
                    "statočným životom, a tak došli k pravde; <font color='#B71C1C'>*</font><br>" +
                    "nám však pomôž vždy hlbšie vnikať<br>" +
                    "do tajomstiev tvojho života a rásť vo vzájomnej láske, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli vo svete<br>" +
                    "vždy dokonalejšími svedkami tvojej dobroty.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|bold|smallPadding", "VIII. ZA TÝCH, ČO NEVERIA V BOHA"},
            {"", "Modlime sa za tých, čo nepoznajú Boha,\n" +
                    "aby úprimne žili podľa svedomia,\n" +
                    "a tak došli k pravému Bohu."},
            {"small|red", "Modlitba v tichosti. Potom kňaz pokračuje:"},
            {"html", "Všemohúci a večný Bože,<br>" +
                    "ty si vložil do srdca človeka takú silnú túžbu po tebe,<br>" +
                    "že sa uspokojí len vtedy, keď ťa nájde; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj, nech všetci pocítia prejavy tvojej lásky<br>" +
                    "a povzbudia sa na príkladnom živote tvojich veriacich, <font color='#B71C1C'>—</font><br>" +
                    "aby napriek všetkým prekážkam a ťažkostiam uznali,<br>" +
                    "že ty jediný si pravý Boh a Otec všetkých ľudí.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|bold|smallPadding", "IX. ZA TÝCH, ČO SPRAVUJÚ ŠTÁT"},
            {"", "Modlime sa za tých, čo spravujú štát,\n" +
                    "nech náš Boh a Pán vedie ich mysle a srdcia,\n" +
                    "aby podľa jeho vôle pracovali za pravý pokoj\n" +
                    "a slobodu pre všetkých."},
            {"small|red", "Modlitba v tichosti. Potom kňaz pokračuje:"},
            {"html", "Všemohúci a večný Bože,<br>" +
                    "v tvojich rukách sú ľudské srdcia i práva národov; <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo pomáhaj tým, čo nás zákonite spravujú, <font color='#B71C1C'>—</font><br>" +
                    "aby všade presadzovali pravý pokoj,<br>" +
                    "blahobyt ľudu a náboženskú slobodu.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|bold|smallPadding", "X. ZA TÝCH, ČO ZNÁŠAJÚ ÚTRAPY"},
            {"", "Modlime sa, milovaní bratia a sestry,\n" +
                    "k Bohu Otcu všemohúcemu,\n" +
                    "aby oslobodil svet od všetkých neporiadkov,\n" +
                    "odvrátil choroby, zahnal hlad,\n" +
                    "oslobodil nevinne väznených, ujal sa utláčaných,\n" +
                    "cestujúcim doprial bezpečnosť,\n" +
                    "vzdialeným z domova šťastný návrat,\n" +
                    "chorým zdravie a umierajúcim večnú spásu."},
            {"small|red", "Modlitba v tichosti. Potom kňaz pokračuje:"},
            {"html", "Všemohúci a večný Bože,<br>" +
                    "útecha zarmútených a posila trpiacich, <font color='#B71C1C'>*</font><br>" +
                    "vypočuj prosby tých, čo ťa vzývajú<br>" +
                    " vo svojich súženiach, <font color='#B71C1C'>—</font><br>" +
                    "a poteš ich v každej núdzi svojou láskavou pomocou.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"center|bold|bigPadding", "II. ČASŤ\n" +
                    "POKLONA SVÄTÉMU KRÍŽU"},
            {"small|red|justify", "14. Po modlitbách veriacich nasleduje slávnostná poklona svätému krížu. Z dvoch spôsobov tejto poklony, ktoré sa uvádzajú, treba zvoliť ten, ktorý je vhodnejší z pastoračného hľadiska."},
            {"center", "Vystavenie svätého kríža Prvý spôsob"},
            {"html|small|justify", "<font color='#B71C1C'>15. Diakon s posluhujúcimi alebo iný vhodný posluhujúci odíde do sakristie, z ktorej v procesii prinesie do stredu presbytéria kríž zahalený fialovým závojom, pričom ho sprevádzajú dvaja posluhujúci so zažatými sviecami.<br>" +
                    "Kňaz, stojac pred oltárom otočený tvárou k ľudu, vezme kríž, poodhalí jeho vrchnú časť, vyzdvihne ho a začne spievať </font>Hľa, drevo kríža<font color='#B71C1C'>. V speve mu pomáha diakon, prípadne spevácky zbor. Všetci odpovedajú </font>Poďte, pokloňme sa<font color='#B71C1C'>. Keď dospievajú, všetci si kľaknú a chvíľu zotrvajú v tichej adorácii. Kňaz pritom stojí a drží zdvihnutý kríž.</font>"},
            {"html", "Hľa, drevo kríža, na ktorom zomrel Spasiteľ sveta.<br>" +
                    "<font color='#B71C1C'>℟.</font> Poďte, pokloňme sa."},
            {"html|small|justify", "<font color='#B71C1C'>Potom kňaz odhalí pravé rameno kríža, znova pozdvihne kríž a spieva </font>Hľa, drevo kríža<font color='#B71C1C'>. Pokračuje sa ako po prvý raz.<br>" +
                    "Napokon odhalí celý kríž, pozdvihne ho a tretí raz spieva </font>Hľa, drevo kríža<font color='#B71C1C'>. Pokračuje sa ako po prvý raz.</font>"},
            {"center", "Druhý spôsob"},
            {"html|small|justify", "<font color='#B71C1C'>16. Kňaz alebo diakon s posluhujúcimi, prípadne iný vhodný posluhujúci, ide k bráne kostola. Tu vezme nezahalený kríž, posluhujúci vezmú zažaté sviece a idú v sprievode cez kostol do presbytéria. Ten, čo nesie kríž, pozdvihne ho najprv pri vchode, potom uprostred kostola, napokon pred vstupom do presbytéria a spieva pritom </font>Hľa, drevo kríža<font color='#B71C1C'>. Všetci mu odpovedajú </font>Poďte, pokloňme sa<font color='#B71C1C'>. Po každej odpovedi si kľaknú a chvíľu zotrvajú v tichej adorácii ako pri prvom spôsobe.</font>"},
            {"center", "Poklona svätému krížu"},
            {"red|small|justify", "17. Potom v sprievode dvoch posluhujúcich so zažatými sviecami kňaz alebo diakon odnesie kríž ku vchodu do presbytéria alebo na iné vhodné miesto. Tam ho položí alebo odovzdá posluhujúcim, aby ho držali. Po oboch stranách kríža sa postavia sviece.\n" +
                    "18. Krížu sa príde pokloniť najprv celebrujúci kňaz, ktorýsi podľa okolností vyzlečie ornát a vyzuje topánky. Potom klérus, posluhujúci a veriaci, ktorí prichádzajú akoby v procesii. Krížu vzdajú úctu jednoduchým pokľaknutím alebo iným vhodným spôsobom podľa miestneho zvyku, napríklad pobozkaním.\n" +
                    "19. Na poklonu sa vystaví iba jeden kríž. Keď sa pre veľké množstvo veriacich nemôžu všetci jednotlivo pokloniť krížu, postupuje sa takto: Keď sa už istá časť kléru a veriacich poklonila krížu, kňaz ho vezme, stane si do stredu pred oltárom a niekoľkými slovami vyzve prítomných, aby sa spoločne poklonili krížu. Potom drží chvíľu kríž vysoko vyzdvihnutý a veriaci zatiaľ zotrvajú v tichej adorácii."},
            {"html|small|justify", "<font color='#B71C1C'>20. Počas poklony svätému krížu sa spieva antifóna </font>Pane, vzdávame úctu tvojmu krížu<font color='#B71C1C'>, impropériá, hymnus </font>Útulný kríž<font color='#B71C1C'> alebo iný vhodný spev. Tí, čo sa už poklonili krížu, si sadnú.</font>"},
            {"center", "Spevy pri poklone svätému krížu"},
            {"html", "<font color='#B71C1C'>Ant.</font> Pane, vzdávame úctu tvojmu krížu,<br>" +
                    "velebíme a oslavujeme tvoje zmŕtvychvstanie,<br>" +
                    "lebo drevo kríža prinieslo radosť celému svetu.<br>" +
                    "<font color='#B71C1C'>Porov. Ž 67, 2</font><br>" +
                    "Bože, buď nám milostivý a žehnaj nás;<br>" +
                    "a tvoja tvár nech žiari nad nami.<br>" +
                    "Zmiluj sa nad nami.<br>" +
                    "<font color='#B71C1C'>Opakuje sa antifóna:</font><br>" +
                    "Pane, vzdávame úctu tvojmu krížu..."},
            {"red|center", "IMPROPÉRIÁ"},
            {"red|small|justify", "Časti, ktoré patria jednotlivým chórom, sa označujú číslami 1 (prvý chór) a 2 (druhý chór). Tie, ktoré majú spievať spolu oba chóry, sa označujú: 1 a 2. Niektoré verše môžu spievať aj dvaja speváci."},
            {"onClick", "1", "red|bigPadding", "I - Prvý Pánov žalospev (otvoriť)"},
            {"onClick", "2", "red|bigPadding", "II - Druhý Pánov žalospev (otvoriť)"},
            {"onClick", "3", "red|bigPadding", "HYMNUS (otvoriť)"},
            {"html|small|justify", "<font color='#B71C1C'>Podľa miestnych podmienok, zvykov a pastoračných okolností možno spievať </font>Stála Matka<font color='#B71C1C'> podľa Rímskeho graduálu, alebo iný vhodný spev s témou bolestí preblahoslavenej Panny Márie.<br>" +
                    "21. Po skončení poklony diakon alebo posluhujúci odnesie kríž na svoje miesto pri oltári. Zažaté sviece sa položia okolo oltára alebo na oltár, prípadne blízko kríža.</font>"},
            {"bold|center", "III. časť\n" +
                    "Sväté prijímanie"},
            {"red|small|justify", "22. Oltár sa prikryje plachtou, rozprestrie sa naň korporál a pripraví sa misál. Medzitým diakon alebo (ak niet diakona) sám kňaz prijme náplecné vélum a prenesie na oltár Najsvätejšiu sviatosť najkratšou cestou z miesta, kde bola uschovaná, pričom všetci v tichosti stoja. Dvaja posluhujúci sprevádzajú Najsvätejšiu sviatosť so zažatými sviecami, ktoré potom postavia vedľa oltára alebo na oltár.\n" +
                    "Keď diakon, ak je prítomný, položí na oltár Najsvätejšiu sviatosť a odkryje pyxidu, kňaz pristúpi k oltáru a pokľakne.\n" +
                    "23. Potom kňaz so zopätými rukami nahlas hovorí:"},
            {"", "Na príkaz nášho Spasiteľa a podľa jeho božského učenia osmeľujeme sa povedať:"},
            {"red|small", "Kňaz rozopne ruky a spolu s prítomnými pokračuje:"},
            {"", "Otče náš, ktorý si na nebesiach,\n" +
                    "posväť sa meno tvoje,\n" +
                    "príď kráľovstvo tvoje,\n" +
                    "buď vôľa tvoja ako v nebi, tak i na zemi.\n" +
                    "Chlieb náš každodenný daj nám dnes\n" +
                    "a odpusť nám naše viny,\n" +
                    "ako i my odpúšťame svojim vinníkom,\n" +
                    "a neuveď nás do pokušenia,\n" +
                    "ale zbav nás zlého."},
            {"red|small", "24. Ďalej pokračuje iba kňaz s rozopätými rukami:"},
            {"", "Prosíme ťa, Pane, zbav nás všetkého zla,\n" +
                    "udeľ svoj pokoj našim dňom\n" +
                    "a príď nám milosrdne na pomoc,\n" +
                    "aby sme boli vždy uchránení pred hriechom\n" +
                    "a pred každým nepokojom,\n" +
                    "kým očakávame blaženú nádej\n" +
                    "a príchod nášho Spasiteľa Ježiša Krista."},
            {"red|small", "Zopne ruky.\n" +
                    "Ľud zakončí modlitbu zvolaním:"},
            {"", "Lebo tvoje je kráľovstvo a moc i sláva naveky."},
            {"red|small", "25. Potom kňaz so zopätými rukami potichu hovorí:"},
            {"", "Pane Ježišu Kriste, nech mi prijatie tvojho Tela\n" +
                    "neslúži na odsúdenie a zatratenie,\n" +
                    "ale pre tvoju dobrotu\n" +
                    "nech mi ochraňuje a uzdravuje dušu i telo."},
            {"red|small", "26. Potom pokľakne, vezme hostiu, drží ju trocha pozdvihnutú nad cibóriom a obrátený k ľudu nahlas hovorí:"},
            {"", "Hľa, Baránok Boží, ktorý sníma hriechy sveta.\n" +
                    "Blažení tí, čo sú pozvaní na hostinu Baránkovu."},
            {"red|small", "A spolu s ľudom raz povie:"},
            {"", "Pane, nie som hoden, aby si vošiel pod moju strechu, ale povedz iba slovo a duša mi ozdravie."},
            {"red|small|justify", "27. A obrátený k oltáru úctivo prijme Kristovo Telo, pričom potichu povie: Telo Kristovo.\n" +
                    "28. Potom ide rozdávať prijímanie veriacim. Cez prijímanie možno spievať Žalm 22 alebo iné primerané piesne.\n" +
                    "29. Po skončení prijímania diakon alebo iný vhodný posluhujúci odnesie nádobku s hostiami na pripravené miesto mimo kostola, alebo – ak si to okolnosti vyžadujú – uloží ju do svätostánku."},
            {"html|small|justify", "<font color='#B71C1C'>30. Potom kňaz vyzve: </font>Modlime sa<font color='#B71C1C'>. Podľa okolností možno zachovať chvíľu posvätného ticha. Potom kňaz prednesie modlitbu po prijímaní:</font>"},
            {"red", "PO PRIJÍMANÍ"},
            {"html", "Všemohúci a večný Bože,<br>" +
                    "ty si nám smrťou a zmŕtvychvstaním<br>" +
                    "Ježiša Krista daroval nový život; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, zachovaj v nás dielo svojho milosrdenstva, <font color='#B71C1C'>—</font><br>" +
                    "aby nám účasť na tomto tajomstve<br>" +
                    "pomáhala žiť v ustavičnej zbožnosti.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"html|small|justify", "<font color='#B71C1C'>31. Na prepustenie diakon, alebo ak ho niet, sám kňaz môže vyzvať: </font>Skloňte sa na požehnanie<font color='#B71C1C'>.<br>" +
                    "Napokon sa kňaz obráti k ľudu, vystrie nad ním ruky a prednáša túto modlitbu nad ľudom:</font>"},
            {"red", "MODLITBA NAD ĽUDOM"},
            {"", "Prosíme ťa, Pane, zošli hojné požehnanie na svoj ľud,\n" +
                    "ktorý v nádeji na svoje vzkriesenie\n" +
                    "nábožne oslávil smrť tvojho Syna;\n" +
                    "odpusť mu viny a obdaruj ho radosťou,\n" +
                    "zveľaďuj v ňom svätú vieru\n" +
                    "a posilňuj ho večným vykúpením.\n" +
                    "Skrze Krista, nášho Pána."},
            {"html", "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|small|justify", "32. Všetci pokľaknú pred krížom a v tichosti odídu.\n" +
                    "33. Oltár sa po skončení slávenia obnaží. Ostane však na ňom kríž s dvoma alebo štyrmi svietnikmi.\n" +
                    "34. Tí, čo sa zúčastnili na popoludňajšej slávnostnej liturgii, neslávia vešpery."},
            {"center", "Sprievod do Božieho hrobu"},
            {"html|small|justify", "<font color='#B71C1C'>Po prijímaní v liturgii Utrpenia a smrti Pána kňaz alebo diakon, ak je prítomný, vloží hostiu do ostenzória, ostenzórium zahalí bielym priesvitným závojom a nechá ho na oltári.<br>" +
                    "Po modlitbe po prijímaní, modlitba nad ľudom sa vynechá, kňaz zostúpi pred oltár, chrbtom k veriacim, vloží do kadidelnice tymian, požehná ho a kľačiačky trikrát okiadza Najsvätejšiu sviatosť. Potom si vezme vélum bielej farby, zoberie do rúk ostenzórium a nesie ju do Božieho hrobu. Pred ním ide posluhujúci s dymiacou kadidelnicou; kňaza sprevádzajú posluhujúci so zapálenými sviecami. Počas procesie sa spieva alebo recituje:</font> Zdrav buď, pravé telo Krista."},
            {"", "Zdrav buď, pravé telo Krista,\n" +
                    "z Panny Matky zrodené,\n" +
                    "za nás ako obeť čistá\n" +
                    "na kríži umučené.\n" +
                    "Z jeho boku tiekla voda\n" +
                    "i krv, čo nás obmyla;\n" +
                    "ochraňuj nás v chvíli smrti,\n" +
                    "sviatosť spásy premilá.\n" +
                    "Ježiš drahý, dobrotivý,\n" +
                    "Syn Márie milostivý! "},
            {"red|small|justify", "Možno spievať aj inú primeranú pieseň.\n" +
                    "Po príchode k Božiemu hrobu kňaz vystaví ostenzórium na oltár alebo na trón (na korporáli), kľačiačky trikrát okiadza Najsvätejšiu sviatosť a zotrvá v tichej modlitbe.\n" +
                    "Potom prednesie túto modlitbu:"},
            {"html", "Pane Ježišu Kriste,<br>" +
                    "ty si naše zmŕtvychvstanie a život,<br>" +
                    "pomôž nám povstať z hrobu hriechov,<br>" +
                    "príď k nám a naplň nás duchovnou silou.<br>" +
                    "Upevni našu vieru, nádej a lásku<br>" +
                    "a daj, aby sme so všetkými svätými mohli pochopiť<br>" +
                    "aká veľká je tvoja láska.<br>" +
                    "Tak veľmi si nás miloval,<br>" +
                    "že si za nás umrel na kríži,<br>" +
                    "aby nik, kto v teba verí, nezahynul, ale mal večný život.<br>" +
                    "Ty žiješ a kraľuješ na veky vekov.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|small", "Alebo:"},
            {"html", "Pane Ježišu,<br>" +
                    "vo vznešenej Oltárnej sviatosti<br>" +
                    "zanechal si nám pamiatku<br>" +
                    "svojho umučenia a zmŕtvychvstania;<br>" +
                    "prosíme ťa,<br>" +
                    "pomáhaj nám uctievať tajomstvo tvojho Tela a Krvi<br>" +
                    "s takou vierou a láskou, aby sme vždy pociťovali<br>" +
                    "účinky tvojho vykupiteľského diela.<br>" +
                    "Lebo ty žiješ a kraľuješ na veky vekov.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|small|justify", "Potom po krátkej adorácii kňaz s posluhujúcimi odíde do sakristie."},
    };

    String[][] stvrtok = {
            {"red|small|justify", "1. Omša na pamiatku Pánovej večere sa slávi vo večerných hodinách v čase, ktorý najviac umožňuje plnú účasť celého miestneho spoločenstva. Všetci kňazi a posluhujúci pri nej vykonávajú svoju službu.\n" +
                    "2. Koncelebrovať môžu všetci kňazi, hoci už koncelebrovali pri omši svätenia olejov alebo slúžili inú omšu pre dobro veriacich.\n" +
                    "3. Ak si to vyžadujú pastoračné dôvody, miestny ordinár môže dovoliť aj inú večernú omšu v kostoloch a oratóriách. Vo veľmi naliehavých prípadoch môže dovoliť svätú omšu aj v ranných hodinách pre veriacich, ktorí sa nemôžu zúčastniť na večernej omši. Treba dbať, aby táto omša nebola iba pre záujem jednotlivcov či malej skupinky osôb, a na úkor hlavnej večernej omše.\n" +
                    "4. Sväté prijímanie možno veriacim podávať iba cez omšu, ale chorým ho možno zaniesť v ktorúkoľvek hodinu dňa.\n" +
                    "5. Oltár možno ozdobiť kvetmi s miernosťou, ktorá prináleží tomuto dňu. Bohostánok má byť úplne prázdny. V tejto omši je potrebné konsekrovať dostatočné množstvo hostií na prijímanie kňazov a ľudu v dnešný i zajtrajší deň."},
            {"center", "Úvodné obrady a liturgia slova"},
            {"separated", "red", "6. VSTUPNÝ SPEV", "(Porov. Gal 6, 14)"},
            {"", "Máme sa chváliť krížom nášho Pána Ježiša Krista,\n" +
                    "v ktorom je naša spása, náš život, naše vzkriesenie;\n" +
                    "on nás oslobodil a spasil."},
            {"html|small|justify", "<font color='#B71C1C'>7. Hymnus </font>Sláva Bohu na výsostiach<font color='#B71C1C'>. Kým sa spieva hymnus, zvonia zvony. Potom sa odmlčia až do spevu tohto hymnu na Veľkonočnú vigíliu, ak diecézny biskup nestanovil niečo iné. Organ a iné hudobné nástroje možno v tomto čase používať len na podporu spevu.</font>"},
            {"insert", "gloria"},
            {"red", "8. KOLEKTA"},
            {"html", "Bože, zišli sme sa osláviť<br>" +
                    "pamiatku najsvätejšej večere,<br>" +
                    "pri ktorej tvoj jednorodený Syn,<br>" +
                    "prv než seba samého vydal na smrť,<br>" +
                    "zveril svojej Cirkvi novú a večnú obetu<br>" +
                    "ako hostinu svojej lásky; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme z tejto veľkej sviatosti<br>" +
                    "čerpali plnosť lásky a života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého<br>" +
                    "po všetky veky vekov."},
            {"separated", "red", "PRVÉ ČÍTANIE", "Ex 12, 1-8. 11-14"},
            {"italic|center", "Predpisy o veľkonočnej večeri"},
            {"html|justify", "Čítanie z Kniha Exodus<br>" +
                    "Pán povedal Mojžišovi a Áronovi v Egypte: „Tento mesiac bude pre vás začiatočným mesiacom, prvým mesiacom v roku.<br>" +
                    "Celej izraelskej pospolitosti povedzte: V desiaty deň tohoto mesiaca nech si každý zaobstará baránka pre svoju rodinu, baránka pre každý dom. Ak je rodina menšia a nevládala by zjesť baránka, nech sa spojí so susedom, čo býva jeho domu najbližšie, podľa počtu osôb, koľko stačí na zjedenie baránka.<br>" +
                    "Baránok musí byť bezchybný, jednoročný samček; môžete ho vybrať z oviec alebo kozliat. Budete ho opatrovať do štrnásteho dňa tohoto mesiaca; v predvečer ho celá izraelská pospolitosť obetuje.<br>" +
                    "Vezmú z jeho krvi a namažú ňou oboje verají a vrchný prah dverí na domoch, v ktorých ho budú jesť. A v tú noc budú jesť mäso upečené na ohni a nekvasený chlieb s horkými zelinami.<br>" +
                    "A budete ho jesť takto: Bedrá budete mať opásané, sandále na nohách a palicu v ruke. Budete jesť rýchlo, lebo je Pánova Pascha (čiže Pánov prechod).<br>" +
                    "V tú noc prejdem egyptskou krajinou a usmrtím všetko prvorodené v Egypte; človekom počnúc až po dobytok. A nad všetkými bohmi Egypta vykonám súd. Ja som Pán. Krv na vašich domoch bude znamením, že v nich bývate. Uvidím krv a obídem vás; nezastihne vás nijaká pohroma, keď budem biť Egypt.<br>" +
                    "Tento deň bude pre vás pamätný a budete ho sláviť ako sviatok Pána; z pokolenia na pokolenie ho budete sláviť po všetky veky.“<br>" +
                    "Počuli sme Božie slovo."},
            {"separated", "red", "RESPONZORIOVÝ ŽALM", "Ž 116, 12-13. 15+16bc. 17-18"},
            {"html", "<font color='#B71C1C'>R.:</font> Tento kalich dobrorečenia je účasťou na Kristovej krvi.<br><br>" +
                    "Čím sa odvďačím Pánovi <font color='#B71C1C'>*</font><br>" +
                    "za všetko, čo mi dal?<br>" +
                    "Vezmem kalich spásy <font color='#B71C1C'>*</font><br>" +
                    "a budem vzývať meno Pánovo. <font color='#B71C1C'>R.</font><br>" +
                    "V Pánových očiach má veľkú cenu <font color='#B71C1C'>*</font><br>" +
                    "smrť jeho svätých.<br>" +
                    "Pane, som tvoj sluha a syn tvojej služobnice. <font color='#B71C1C'>*</font><br>" +
                    "Ty si mi putá rozviazal: <font color='#B71C1C'>R.</font><br>" +
                    "obetu chvály ti prinesiem <font color='#B71C1C'>*</font><br>" +
                    "a budem vzývať meno Pánovo.<br>" +
                    "Splním svoje sľuby Pánovi <font color='#B71C1C'>*</font><br>" +
                    "pred všetkým jeho ľudom. <font color='#B71C1C'>R.</font>"},
            {"separated", "red", "DRUHÉ ČÍTANIE", "1 Kor 11, 23-26"},
            {"italic|center", "Vždy, keď budete jesť tento chlieb a piť tento kalich, zvestujete Pánovu smrť"},
            {"html|justify", "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                    "Bratia, ja som od Pána prijal, čo som vám aj odovzdal, že Pán Ježiš v tú noc, keď bol zradený, vzal chlieb, vzdával vďaky, lámal ho a povedal: „Toto je moje telo, ktoré je pre vás; toto robte na moju pamiatku.“<br>" +
                    "Podobne po večeri vzal kalich a hovoril: „Tento kalich je nová zmluva v mojej krvi. Toto robte, kedykoľvek ho budete piť, na moju pamiatku.“<br>" +
                    "A tak vždy, keď budete jesť tento chlieb a piť tento kalich, zvestujete Pánovu smrť, kým nepríde.<br>" +
                    "Počuli sme Božie slovo."},
            {"separated", "red", "VERŠ PRED EVANJELIOM", "Jn 13, 34"},
            {"html", "<font color='#B71C1C'>R.</font> Chvála ti a česť, Pane Ježišu.<br>" +
                    "Nové prikázanie vám dávam, hovorí Pán; aby ste sa milovali navzájom, ako som ja miloval vás.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti a česť, Pane Ježišu."},
            {"separated", "red", "EVANJELIUM", "Jn 13, 1-15"},
            {"italic|center", "Miloval ich do krajnosti"},
            {"html|justify", "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Jána<br>" +
                    "Bolo pred veľkonočnými sviatkami. Ježiš vedel, že nadišla jeho hodina odísť z tohoto sveta k Otcovi. A pretože miloval svojich, čo boli na svete, miloval ich do krajnosti.<br>" +
                    "Pri večeri, keď už diabol vnukol Judášovi, synovi Šimona Iškariotského, aby ho zradil, Ježiš vo vedomí, že mu Otec dal do rúk všetko a že od Boha vyšiel a k Bohu odchádza, vstal od stola, zobliekol si odev, vzal plátennú zásteru a prepásal sa. Potom nalial vody do umývadla a začal umývať učeníkom nohy a utierať zásterou, ktorou bol prepásaný.<br>" +
                    "Tak prišiel k Šimonovi Petrovi. On mu povedal: „Pane, ty mi chceš umývať nohy?“<br>" +
                    "Ježiš mu odpovedal: „Teraz ešte nechápeš, čo robím, ale neskôr pochopíš.“<br>" +
                    "Peter mu povedal: „Nikdy mi nebudeš umývať nohy!“<br>" +
                    "Ježiš mu odpovedal: „Ak ťa neumyjem, nebudeš mať podiel so mnou.“ Šimon Peter mu vravel: „Pane, tak potom nielen nohy, ale aj ruky a hlavu!“<br>" +
                    "Ježiš mu na to: „Kto sa okúpal, potrebuje si umyť už len nohy a je celý čistý. A vy ste čistí, ale nie všetci.“ Vedel totiž, kto ho zradí, – preto povedal: „Nie všetci ste čistí.“<br>" +
                    "Keď im umyl nohy a obliekol si odev, znova si sadol k stolu a povedal im: „Chápete, čo som vám urobil? Vy ma oslovujete: ‚Učiteľ‘ a: ‚Pane‘ a dobre hovoríte, lebo to som.<br>" +
                    "Keď som teda ja, Pán a Učiteľ, umyl nohy vám, aj vy si máte jeden druhému nohy umývať. Dal som vám príklad, aby ste aj vy robili, ako som ja urobil vám.<br>" +
                    "Počuli sme slovo Pánovo."},
            {"red|small|justify", "9. Po prednesení evanjelia má kňaz homíliu, v ktorej objasní hlavné tajomstvá pripomínané v tejto omši, a to ustanovenie Eucharistie a sviatosti kňazstva, ako aj Pánov príkaz lásky."},
            {"center", "Umývanie nôh"},
            {"red|small|justify", "10. Po homílii, ak je to z pastoračných dôvodov vhodné, môže sa konať obrad umývania nôh.\n" +
                    "11. Posluhujúci privedú vybraných z Božieho ľudu k sedadlám pripraveným na vhodnom mieste. Kňaz (ak treba, odloží ornát) príde ku každému, naleje mu vody na nohy a utrie ich. Posluhujúci mu pri tom pomáhajú.\n" +
                    "12. Medzitým sa spievajú niektoré z uvedených antifón alebo iné vhodné piesne."},
            {"separated", "red", "ANTIFÓNA 1", "(Porov. Jn 13, 4. 5. 15)"},
            {"", "Pán vstal od večere, nalial vody do umývadla\n" +
                    "a začal učeníkom umývať nohy, aby im dal príklad."},
            {"separated", "red", "ANTIFÓNA 2", "(Porov. Jn 13, 12. 13. 15)"},
            {"", "Pán Ježiš po večeri umyl svojim učeníkom nohy a povedal im:\n" +
                    "„Chápete, čo som vám urobil ja, Pán a Učiteľ?\n" +
                    "Dal som vám príklad, aby ste aj vy robili, ako som ja urobil vám.“"},
            {"separated", "red", "ANTIFÓNA 3", "(Porov. Jn 13, 6. 7. 8)"},
            {"html", "Pane, ty mi chceš umývať nohy?<br>" +
                    "Ježiš mu odpovedal: Ak ti neumyjem nohy,<br>" +
                    "nebudeš mať podiel so mnou.<br>" +
                    "<font color='#B71C1C'>℣.</font> Pristúpil teda k Šimonovi Petrovi a Peter mu povedal:<br>" +
                    "<font color='#B71C1C'>—</font> Pane, ty mi chceš umývať nohy? Ježiš mu odpovedal:<br>" +
                    "Ak ti neumyjem nohy, nebudeš mať podiel so mnou.<br>" +
                    "<font color='#B71C1C'>℣.</font> Čo ja robím, to teraz nechápeš. Pochopíš to neskôr.<br>" +
                    "<font color='#B71C1C'>—</font> Pane, ty mi chceš umývať nohy? Ježiš mu odpovedal:<br>" +
                    "Ak ti neumyjem nohy, nebudeš mať podiel so mnou."},
            {"separated", "red", "ANTIFÓNA 4", "(Porov. Jn 13, 14)"},
            {"", "Keď som vám teda ja, Pán a Učiteľ, umyl nohy,\n" +
                    "o koľko skôr máte vy umývať nohy jeden druhému!"},
            {"separated", "red", "ANTIFÓNA 5", "(Jn 13, 35)"},
            {"html", "Podľa toho spoznajú všetci, že ste moji učeníci,<br>" +
                    "ak sa budete navzájom milovať.<br>" +
                    "<font color='#B71C1C'>℣.</font> Ježiš povedal svojim učeníkom:<br>" +
                    "<font color='#B71C1C'>—</font> Podľa toho spoznajú všetci, že ste moji učeníci,<br>" +
                    "ak sa budete navzájom milovať."},
            {"separated", "red", "ANTIFÓNA 6", "(Jn 13, 34)"},
            {"", "Nové prikázanie vám dávam,\n" +
                    "aby ste sa milovali navzájom,\n" +
                    "ako som ja miloval vás, hovorí Pán."},
            {"separated", "red", "ANTIFÓNA 7", "(1 Kor 13, 13)"},
            {"html", "Nech zostane vo vás viera, nádej a láska, tieto tri;<br>" +
                    "no najväčšia z nich je láska.<br>" +
                    "<font color='#B71C1C'>℣.</font> A tak teraz ostáva viera, nádej, láska, tieto tri; no najväčšia z nich je láska.<br>" +
                    "<font color='#B71C1C'>—</font> Nech zostane vo vás viera, nádej a láska, tieto tri;<br>" +
                    "no najväčšia z nich je láska."},
            {"red|small|justify", "13. Po umývaní nôh si kňaz umyje ruky, znova si oblečie ornát a vráti sa k sedadlu, kde pokračuje modlitbou veriacich.\n" +
                    "Vyznanie viery sa vynechá."},
            {"red|bold", "SPOLOČNÉ MODLITBY VERIACICH"},
            {"justify", "Bratia a sestry, náš Spasiteľ pri Poslednej večeri ustanovil eucharistickú obetu svojho tela a krvi, aby ňou až do konca sveta sprítomňoval obetu kríža. V duchu sa spojme so všetkými bratmi a sestrami po celom svete a nábožne sa modlime."},
            {"html|italic|justify", "<font color='#B71C1C'>(</font>Volajme: Obdaruj svoju Cirkev jednotou a pokojom.<font color='#B71C1C'>)</font>"},
            {"html|smallPadding|justify", "<font color='#B71C1C'>1.</font> Ježišu, zachovaj Svätého Otca <font color='#B71C1C'>M.</font> v zdraví a sile ducha pre dobro Cirkvi.<br>" +
                    "<font color='#B71C1C'>2.</font> Požehnaj nášho biskupa <font color='#B71C1C'>M.</font> a všetkých biskupov, aby jasne a zrozumiteľne ukazovali cestu k tebe.<br>" +
                    "<font color='#B71C1C'>3.</font> Našim kňazom a predstaveným udeľ Ducha lásky a obety v službe zvereným bratom a sestrám.<br>" +
                    "<font color='#B71C1C'>4.</font> Daj, aby všetci kresťania našli v Eucharistii puto jednoty a večnú spásu.<br>" +
                    "<font color='#B71C1C'>5.</font> Daj, aby sme mali otvorené srdcia pre potreby biednych, chudobných, chorých a tých, ktorí sú bez domova.<br>" +
                    "<font color='#B71C1C'>6.</font> Požehnaj všetkých, ktorým dnes ich zdravotný stav neumožnil zúčastniť sa na tejto bohoslužbe."},
            {"", "Ježišu, veľkňaz novej a večnej zmluvy,\n" +
                    "ďakujeme ti, že môžeme mať účasť\n" +
                    "na eucharistickej obete;\n" +
                    "vyslyš naše prosby a pomáhaj nám\n" +
                    "uskutočňovať príkaz lásky,\n" +
                    "ktorý si nám zanechal.\n" +
                    "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"center", "Liturgia Eucharistie"},
            {"red|small|justify", "14. Liturgia Eucharistie sa môže začať procesiou, v ktorej veriaci môžu priniesť okrem chleba a vína aj dary pre chudobných.\n" +
                    "Medzitým sa spieva tento alebo iný vhodný spev."},
            {"html", "<font color='#B71C1C'>ANTIFÓNA:</font> Kde je láska opravdivá, tam Boh prebýva.<br>" +
                    "<font color='#B71C1C'>℣.</font> Láska Kristova nás zhromažďuje k stolu.<br>" +
                    "V ňom sa všetci tešme, radujme sa spolu.<br>" +
                    "Vrúcne ctime Boha, nech je puto tuhšie.<br>" +
                    "Milujme sa bratsky z otvorenej duše."},
            {"html", "<font color='#B71C1C'>ANTIFÓNA:</font> Kde je láska opravdivá, tam Boh prebýva.<br>" +
                    "<font color='#B71C1C'>℣.</font> Keď nás teda láska spája pri oltári,<br>" +
                    "hľaďme, by nás nikdy nedelili sváry.<br>" +
                    "Nech sa od nás vzdialia nezhody a spory,<br>" +
                    "medzi nami Kristus večné bratstvo tvorí."},
            {"html", "<font color='#B71C1C'>ANTIFÓNA:</font> Kde je láska opravdivá, tam Boh prebýva.<br>" +
                    "<font color='#B71C1C'>℣.</font> Kriste, Bože, daj nám s blaženými raja obdivovať krásu tvojho obličaja.<br>" +
                    "Ty, náš nesmierny zdroj čistej blaženosti, ktorá klíči v čase, zreje vo večnosti. Amen."},
            {"red", "15. NAD OBETNÝMI DARMI"},
            {"html", "Prosíme ťa, Pane,<br>" +
                    "pomôž nám nábožne sláviť tieto tajomstvá, <font color='#B71C1C'>*</font><br>" +
                    "lebo vždy, keď slávime pamiatku Kristovej obety, <font color='#B71C1C'>—</font><br>" +
                    "uskutočňuje sa dielo nášho vykúpenia.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"red", "16. PREFÁCIA"},
            {"insert", "prefacia"},
            {"insert", "eucharisticka modlitba"},
            {"insert", "obrad prijimania"},
            {"small|red|justify", "33. Vo vhodnom momente obradu prijímania kňaz odovzdá Eucharistiu z oltára diakonom alebo akolytom, alebo iným mimoriadnym vysluhovateľom, aby ju potom mohli zaniesť chorým, ktorí ju prijmú doma."},
            {"separated", "red", "34. SPEV NA PRIJÍMANIE", "(1 Kor 11, 24 – 25)"},
            {"", "Toto je moje Telo, ktoré sa obetuje za vás;\n" +
                    "tento kalich je nová zmluva v mojej Krvi, hovorí Pán.\n" +
                    "Toto robte, kedykoľvek ho budete piť, na moju pamiatku."},
            {"small|red|justify", "35. Po skončení prijímania nádobka s hostiami určenými na prijímanie v nasledujúci deň ostane na oltári. Kňaz stojí pri sedese a prednesie modlitbu po prijímaní."},
            {"red", "36. PO PRIJÍMANÍ"},
            {"html", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "na pozemskej púti nás posilňuješ<br>" +
                    "posvätnou večerou svojho Syna; <font color='#B71C1C'>—</font><br>" +
                    "dopraj, aby sme mali účasť<br>" +
                    "aj na jeho večnej hostine.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"center", "Prenesenie Najsvätejšej sviatosti"},
            {"html|small|justify", "<font color='#B71C1C'>37. Po tejto modlitbe kňaz, stojac pred oltárom, vloží do kadidelnice tymian, požehná ho a kľačiačky trikrát okiadza Najsvätejšiu sviatosť. Potom si vezme vélum bielej farby, zoberie nádobku s hostiami a zakryje ju koncami véla.<br>" +
                    "38. Nasleduje sprievod, v ktorom sa prenesie Najsvätejšia sviatosť so sviecami a kadidlom cez kostol na miesto, kde bude uložená, čo môže byť v primerane ozdobenej časti kostola alebo kaplnke. Na čele ide posluhujúci s krížom medzi dvoma posluhujúcimi so zažatými sviecami, za nimi idú ďalší so zažatými sviecami. Pred kňazom nesúcim Najsvätejšiu sviatosť ide posluhujúci s dymiacou kadidelnicou. Medzitým sa spieva hymnus </font>Sviatosť tela tajomného<font color='#B71C1C'> (okrem posledných dvoch slôh) alebo iná eucharistická pieseň.<br>" +
                    "39. Keď sa príde na miesto, kde má byť uschovaná Najsvätejšia sviatosť, kňaz vloží nádobku s hostiami do bohostánku, pričom mu môže pomáhať diakon. Dvierka bohostánku nechá otvorené. Nasype do kadidelnice tymian a kľačiačky okiadza Najsvätejšiu sviatosť. Pritom sa spieva </font>Ctime túto sviatosť slávnu<font color='#B71C1C'> alebo iná eucharistická pieseň. Potom diakon alebo sám kňaz zatvorí bohostánok.<br>" +
                    "40. Po krátkej tichej poklone kňaz a posluhujúci pokľaknú a vrátia sa do sakristie.<br>" +
                    "41. Vo vhodnom momente sa obnaží oltár a odnesú sa, ak je to možné, kríže z kostola. Tie, čo zostanú v kostole, by sa mali zahaliť.<br>" +
                    "42. Tí, čo sa zúčastnili na omši na pamiatku Pánovej večere, neslávia vešpery.<br>" +
                    "43. Veriacich treba pozvať k tomu, aby v noci – podľa miestnych zvyklostí a možností – venovali nejaký čas poklone Najsvätejšej sviatosti. Poklona po polnoci však už nemá mať slávnostný ráz.<br>" +
                    "44. Ak sa v danom kostole v Piatok utrpenia Pána nebudú sláviť obrady utrpenia a smrti Pána, omša sa ukončí zvyčajným spôsobom a Najsvätejšia sviatosť sa odloží do bohostánku.</font>"},
    };

    String[][] prvy_zalospev = {
            {"html", "<font color='#B71C1C'>1 a 2</font> Ó, ľud môj, čo som ti urobil?<br>" +
                    "Alebo čím som ťa zarmútil? Odpovedz mi!<br>" +
                    "<font color='#B71C1C'>1</font> Ja som ťa vyviedol z egyptskej krajiny,<br>" +
                    "a ty si pripravil kríž svojmu Spasiteľovi."},
            {"html|tab", "<font color='#B71C1C'>1</font> Hágios o Theós.<br>" +
                    "<font color='#B71C1C'>2</font> Svätý Bože.<br>" +
                    "<font color='#B71C1C'>1</font> Hágios Ischyrós.<br>" +
                    "<font color='#B71C1C'>2</font> Svätý Silný.<br>" +
                    "<font color='#B71C1C'>1</font> Hágios Athánatos, eléison himás.<br>" +
                    "<font color='#B71C1C'>2</font> Svätý Nesmrteľný, zmiluj sa nad nami."},
            {"html", "<font color='#B71C1C'>1 a 2</font> Ja som ťa štyridsať rokov viedol púšťou,<br>" +
                    "kŕmil som ťa mannou a priviedol do úrodnej krajiny,<br>" +
                    "a ty si pripravil kríž svojmu Spasiteľovi."},
            {"html|tab", "<font color='#B71C1C'>1</font> Hágios o Theós.<br>" +
                    "<font color='#B71C1C'>2</font> Svätý Bože.<br>" +
                    "<font color='#B71C1C'>1</font> Hágios Ischyrós.<br>" +
                    "<font color='#B71C1C'>2</font> Svätý Silný.<br>" +
                    "<font color='#B71C1C'>1</font> Hágios Athánatos, eléison himás.<br>" +
                    "<font color='#B71C1C'>2</font> Svätý Nesmrteľný, zmiluj sa nad nami."},
            {"html", "<font color='#B71C1C'>1 a 2</font> Čo som mal ešte pre teba urobiť?<br>" +
                    "Veď som ťa vysadil ako svoju najkrajšiu vinicu,<br>" +
                    "ale ty si mi priniesol iba trpkosti,<br>" +
                    "lebo octom si mi hasil smäd a kopijou si prebodol srdce svojho Spasiteľa."},
            {"html|tab", "<font color='#B71C1C'>1</font> Hágios o Theós.<br>" +
                    "<font color='#B71C1C'>2</font> Svätý Bože.<br>" +
                    "<font color='#B71C1C'>1</font> Hágios Ischyrós.<br>" +
                    "<font color='#B71C1C'>2</font> Svätý Silný.<br>" +
                    "<font color='#B71C1C'>1</font> Hágios Athánatos, eléison himás.<br>" +
                    "<font color='#B71C1C'>2</font> Svätý Nesmrteľný, zmiluj sa nad nami."},
    };

    String[][] druhy_zalospev = {
            {"red", "Speváci:"},
            {"", "Pre teba som tvrdo stíhal Egypt a pobil jeho prvorodených,\n" +
                    "a ty si ma zbičoval a hnal na smrť."},
            {"red", "1 a 2 opakujú:"},
            {"", "Ó, ľud môj, čo som ti urobil? Alebo čím som ťa zarmútil? Odpovedz mi."},
            {"red", "Speváci:"},
            {"", "Ja som ťa vyviedol z egyptskej krajiny\n" +
                    "a faraóna som nechal utonúť v Červenom mori,\n" +
                    "a ty si ma za to priviedol pred veľradu."},
            {"red", "1 a 2 opakujú:"},
            {"", "Ó, ľud môj, čo som ti urobil? Alebo čím som ťa zarmútil? Odpovedz mi."},
            {"red", "Speváci:"},
            {"", "Ja som ti otvoril cestu cez Červené more,\n" +
                    "a ty si mi kopijou otvoril srdce."},
            {"red", "1 a 2 opakujú:"},
            {"", "Ó, ľud môj, čo som ti urobil? Alebo čím som ťa zarmútil? Odpovedz mi."},
            {"red", "Speváci:"},
            {"", "Ja som šiel pred tebou v oblačnom stĺpe,\n" +
                    "a ty si ma priviedol pred Pilátov súd."},
            {"red", "1 a 2 opakujú:"},
            {"", "Ó, ľud môj, čo som ti urobil? Alebo čím som ťa zarmútil? Odpovedz mi."},
            {"red", "Speváci:"},
            {"", "Ja som ťa kŕmil mannou na púšti,\n" +
                    "a ty si ma bičoval a potupoval."},
            {"red", "1 a 2 opakujú:"},
            {"", "Ó, ľud môj, čo som ti urobil? Alebo čím som ťa zarmútil? Odpovedz mi."},
            {"red", "Speváci:"},
            {"", "Ja som ťa zázračne občerstvoval vodou zo skaly,\n" +
                    "a ty si ma napájal žlčou a octom."},
            {"red", "1 a 2 opakujú:"},
            {"", "Ó, ľud môj, čo som ti urobil? Alebo čím som ťa zarmútil? Odpovedz mi."},
            {"red", "Speváci:"},
            {"", "Ja som za teba bil kanaánskych kráľov,\n" +
                    "a ty si ma bil trstinou po hlave."},
            {"red", "1 a 2 opakujú:"},
            {"", "Ó, ľud môj, čo som ti urobil? Alebo čím som ťa zarmútil? Odpovedz mi."},
            {"red", "Speváci:"},
            {"", "Ja som ti daroval kráľovské žezlo,\n" +
                    "a ty si mi dal na hlavu tŕňovú korunu."},
            {"red", "1 a 2 opakujú:"},
            {"", "Ó, ľud môj, čo som ti urobil? Alebo čím som ťa zarmútil? Odpovedz mi."},
            {"red", "Speváci:"},
            {"", "Ja som ťa preslávil veľkými skutkami,\n" +
                    "a ty si ma za to všetko ukrižoval."},
            {"red", "1 a 2 opakujú:"},
            {"", "Ó, ľud môj, čo som ti urobil? Alebo čím som ťa zarmútil? Odpovedz mi."},
    };

    String[][] hymnus = {
            {"red", "Všetci:"},
            {"", "Útulný kríž, najkrajší strom, ty skvost medzi stromami,\n" +
                    "všetkým sadom taký konár, kvet a plod je neznámy!\n" +
                    "Milé drevo s milou ťarchou milo stojíš pred nami."},
            {"red", "Speváci:"},
            {"", "Ospevujme veľký súboj, šírme slávne odkazy\n" +
                    "trámov kríža, ktorý zdolal strojcu večnej nákazy!\n" +
                    "Obeť na ňom zmiera za svet, a tou smrťou víťazí."},
            {"red", "Všetci:"},
            {"", "Útulný kríž, najkrajší strom, ty skvost medzi stromami,\n" +
                    "všetkým sadom taký konár, kvet a plod je neznámy!"},
            {"red", "Speváci:"},
            {"", "Prvý človek veril zvodom, smrť si vtiahol do domu,\n" +
                    "keď v ňom Božiu lásku zhasil jed, čo zjedol zo stromu,\n" +
                    "lež Boh nový strom si vybral zažehnať tú pohromu."},
            {"red", "Všetci:"},
            {"", "Milé drevo s milou ťarchou milo stojíš pred nami."},
            {"red", "Speváci:"},
            {"", "Poriadok si vyžadoval po bolestnom otrase\n" +
                    "do priepasti vrhnúť zhubcu, čo nás ranil v zápase,\n" +
                    "aby skazonosný úder poslúžil nám ku spáse."},
            {"red", "Všetci:"},
            {"", "Útulný kríž, najkrajší strom, ty skvost medzi stromami,\n" +
                    "všetkým sadom taký konár, kvet a plod je neznámy!"},
            {"red", "Speváci:"},
            {"", "Keď čas prišiel, keď po Bohu vyvrcholil dávny smäd,\n" +
                    "Otec poslal na svet Syna, skrz ktorého stvoril svet,\n" +
                    "a on z Panny ľudsky vzklíčil, sťa z kra vytúžený kvet."},
            {"red", "Všetci:"},
            {"", "Milé drevo s milou ťarchou milo stojíš pred nami."},
            {"red", "Speváci:"},
            {"", "V úzkych jasliach plače Dieťa, predurčená Hostia,\n" +
                    "bedlí nad ním, ohrieva ho nežná matka Mária,\n" +
                    "útle telo, ruky, nohy povojníkom ovíja."},
            {"red", "Všetci:"},
            {"", "Útulný kríž, najkrajší strom, ty skvost medzi stromami\n" +
                    "všetkým sadom taký konár, kvet a plod je neznámy!"},
            {"red", "Speváci:"},
            {"", "A keď sa mu v ľudskom veku najkrajší vek priblíži,\n" +
                    "predurčený trpieť rád sa pred mukami poníži,\n" +
                    "preto Baránka, hľa, ľudstvo v obeť dvíha na kríži."},
            {"red", "Všetci:"},
            {"", "Milé drevo s milou ťarchou milo stojíš pred nami."},
            {"red", "Speváci:"},
            {"", "Hľa, žlč, ocot, sliny, kliny, trsť a dýka ranivá\n" +
                    "trápia telo, z boku tečie voda a krv neživá,\n" +
                    "predsa ten zdroj zem i nebo, súš i more omýva."},
            {"red", "Všetci:"},
            {"", "Útulný kríž, najkrajší strom, ty skvost medzi stromami,\n" +
                    "všetkým sadom taký konár, kvet a plod je neznámy!"},
            {"red", "Speváci:"},
            {"", "Vznešený kmeň, ohni vetvy, zjemni postoj pristrohý,\n" +
                    "hoci Tvorca dal ti tvrdosť, keď ťa staval na nohy,\n" +
                    "neotváraj rany Kráľa, našej spásnej zálohy!"},
            {"red", "Všetci:"},
            {"", "Milé drevo s milou ťarchou milo stojíš pred nami."},
            {"red", "Speváci:"},
            {"", "Len tebe sa ušlo slávy nosiť Darcu života,\n" +
                    "rozosvietiť vo tme maják svetu, ktorý troskotá,\n" +
                    "veď ťa krvou napojila Baránkova milota."},
            {"red", "Všetci:"},
            {"", "Útulný kríž, najkrajší strom, ty skvost medzi stromami,\n" +
                    "všetkým sadom taký konár, kvet a plod je neznámy!"},
            {"red", "Záver sa nikdy nevynechá: Všetci:"},
            {"", "Tebe, Otče, s Duchom Svätým, nech je sláva naveky\n" +
                    "skrze Krista, ktorý telom nie je nám už ďaleký\n" +
                    "a chce krížom zmeniť v radosť ľudský bôľ a náreky. Amen."},
    };

    String[][] dlhy_chvalospev = {
            {"", "Zaplesaj, nebeský chór anjelov,\n" +
                    "zaplesajte, Boží služobníci,\n" +
                    "nech zahlaholí poľnica na oslavu víťazného Kráľa.\n" +
                    "Zaraduj sa, zem, zaplavená toľkým jasom,\n" +
                    "lebo svetlo večného Kráľa\n" +
                    "vymanilo ťa z moci temnôt.\n" +
                    "Raduj sa aj ty, matka Cirkev,\n" +
                    "ozdobená žiarou Pánovej slávy\n" +
                    "a tento chrám nech zaznie naším jasavým spevom."},
            {"html", "<font color='#B71C1C'>Ľud:</font> Tento chrám nech zaznie spevom<br>" +
                    "na oslavu víťazného Kráľa.<br>" +
                    "<font color='#B71C1C'>(</font>Prosím vás teda, bratia a sestry,<br>" +
                    "ako svedkov obdivuhodného jasu tohto svätého svetla,<br>" +
                    "vzývajte so mnou milosrdného a všemohúceho Boha.<br>" +
                    "On ma bez mojich zásluh, iba z milosti<br>" +
                    "pridružil k služobníkom oltára;<br>" +
                    "nech ma teda naplní jasom svojho svetla,<br>" +
                    "aby som mohol zaspievať chválospev o tejto svieci.<font color='#B71C1C'>)</font><br>" +
                    "<font color='#B71C1C'>(℣.</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>℟.</font> I s duchom tvojím.)<br>" +
                    "<font color='#B71C1C'>℣.</font> Hore srdcia.<br>" +
                    "<font color='#B71C1C'>℟.</font> Máme ich u Pána.<br>" +
                    "<font color='#B71C1C'>℣.</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                    "<font color='#B71C1C'>℟.</font> Je to dôstojné a správne."},
            {"", "Je naozaj dôstojné a správne\n" +
                    "z hĺbky srdca a z celej duše zvelebovať\n" +
                    "neviditeľného, všemohúceho Boha Otca\n" +
                    "a ospevovať jeho jednorodeného Syna,\n" +
                    "nášho Pána Ježiša Krista.\n" +
                    "On namiesto nás splatil večnému Otcovi dlžobu\n" +
                    "za hriech Adamov\n" +
                    "a svojou krvou zrušil výrok odsúdenia za prvotnú vinu.\n" +
                    "Lebo slávime veľkonočné sviatky,\n" +
                    "keď bol zabitý pravý Baránok,\n" +
                    "ktorého krv posväcuje dveraje veriacich.\n" +
                    "Toto je noc,\n" +
                    "v ktorej si našim otcom, synom Izraela,\n" +
                    "pomohol prejsť suchou nohou cez Červené more,\n" +
                    "keď si ich vyviedol z Egypta.\n" +
                    "Toto je noc,\n" +
                    "v ktorej jas ohnivého stĺpa\n" +
                    "rozohnal temnoty hriechu.\n" +
                    "Toto je noc,\n" +
                    "ktorá dnes na celej zemi veriacich v Krista\n" +
                    "vymaňuje z neprávosti sveta a z otroctva hriechu,\n" +
                    "vracia im Božiu milosť a vovádza ich\n" +
                    "do spoločenstva svätých.\n" +
                    "Toto je noc,\n" +
                    "v ktorej Kristus rozlámal okovy smrti\n" +
                    "a víťazne vstal z hrobu."},
            {"html", "<font color='#B71C1C'>Ľud:</font> Tento chrám nech zaznie spevom<br>" +
                    "na oslavu víťazného Kráľa."},
            {"", "Veď čo by nám osožilo, že sme sa narodili,\n" +
                    "keby sme neboli vykúpení?\n" +
                    "Aká nesmierna je voči nám tvoja dobrota, Otče,\n" +
                    "aká nevyspytateľná je tvoja láska!\n" +
                    "Aby si vykúpil otroka,\n" +
                    "vydal si na smrť vlastného Syna!\n" +
                    "Naozaj potrebný bol hriech Adamov,\n" +
                    "ktorý zotrela smrť Kristova!\n" +
                    "Ó, šťastná vina,\n" +
                    "pre ktorú k nám prišiel taký vznešený Vykupiteľ!"},
            {"html", "<font color='#B71C1C'>Ľud:</font> Tento chrám nech zaznie spevom na oslavu víťazného Kráľa."},
            {"", "Ó, naozaj blažená noc,\n" +
                    "ktorá jediná si zaslúžila poznať čas a hodinu,\n" +
                    "v ktorej Kristus vstal z mŕtvych.\n" +
                    "Toto je noc,\n" +
                    "o ktorej Písmo hovorí: Noc bude jasná ako deň,\n" +
                    "noc ma obklopí ako žiarivé svetlo.\n" +
                    "Posvätné tajomstvo tejto noci premáha zlobu,\n" +
                    "zmýva viny,\n" +
                    "hriešnikom vracia nevinnosť\n" +
                    "a radosť zarmúteným;\n" +
                    "odvracia nenávisť, zjednocuje srdcia\n" +
                    "a pokoruje pýchu mocných.\n" +
                    "Preto v túto milostivú noc\n" +
                    "prijmi, svätý Otče,\n" +
                    "našu večernú obetu chvály,\n" +
                    "ktorú ti prináša svätá Cirkev,\n" +
                    "keď rukami svojich služobníkov\n" +
                    "slávnostne ti predkladá túto veľkonočnú sviecu,\n" +
                    "pripravenú z vosku pracovitých včiel."},
            {"html", "<font color='#B71C1C'>Ľud:</font> Tento chrám nech zaznie spevom<br>" +
                    "na oslavu víťazného Kráľa."},
            {"", "Veď už vieme, čo znamená táto svieca,\n" +
                    "ktorú sme na tvoju počesť rozožali\n" +
                    "z plápolajúceho ohňa.\n" +
                    "Hoci jej plameň rozožal sviece dookola,\n" +
                    "predsa neubudlo na jeho jase,\n" +
                    "lebo sa živí roztopeným voskom,\n" +
                    "ktorý na túto vzácnu sviecu\n" +
                    "pripravila usilovná včela.\n" +
                    "Naozaj požehnaná noc,\n" +
                    "ktorá spája nebo so zemou\n" +
                    "a človeka s Bohom.\n" +
                    "Preto ťa, Pane, prosíme,\n" +
                    "nech táto svieca, zasvätená oslave tvojho mena,\n" +
                    "žiari nehasnúcim svetlom\n" +
                    "a zaháňa nočné temnoty.\n" +
                    "Prijmi ju so záľubou\n" +
                    "a jej žiara nech sa spojí\n" +
                    "so svetlom nebeských hviezd.\n" +
                    "Nech ju nájde horieť ranná zornica,\n" +
                    "tá zornica, ktorá nikdy nezapadá:\n" +
                    "tvoj Syn Ježiš Kristus,\n" +
                    "ktorý slávne vstal z mŕtvych,\n" +
                    "osvecuje ľudstvo veľkonočným svetlom\n" +
                    "a žije a kraľuje na veky vekov."},
            {"html", "<font color='#B71C1C'>Ľud:</font> Amen."},
    };

    String[][] kratky_chvalospev = {
            {"", "Zaplesaj, nebeský chór anjelov,\n" +
                    "zaplesajte, Boží služobníci,\n" +
                    "nech zahlaholí poľnica na oslavu víťazného Kráľa.\n" +
                    "Zaraduj sa, zem, zaplavená toľkým jasom,\n" +
                    "lebo svetlo večného Kráľa\n" +
                    "vymanilo ťa z moci temnôt.\n" +
                    "Raduj sa aj ty, matka Cirkev,\n" +
                    "ozdobená žiarou Pánovej slávy\n" +
                    "a tento chrám nech zaznie naším jasavým spevom."},
            {"html", "<font color='#B71C1C'>(℣.</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>℟.</font> I s duchom tvojím.)<br>" +
                    "<font color='#B71C1C'>℣.</font> Hore srdcia.<br>" +
                    "<font color='#B71C1C'>℟.</font> Máme ich u Pána.<br>" +
                    "<font color='#B71C1C'>℣.</font> Vzdávajme vďaky Pánovi, nášmu Bohu.<br>" +
                    "<font color='#B71C1C'>℟.</font> Je to dôstojné a správne."},
            {"", "Je naozaj dôstojné a správne\n" +
                    "z hĺbky srdca a z celej duše zvelebovať\n" +
                    "neviditeľného, všemohúceho Boha Otca\n" +
                    "a ospevovať jeho jednorodeného Syna,\n" +
                    "nášho Pána Ježiša Krista.\n" +
                    "On namiesto nás splatil večnému Otcovi\n" +
                    "dlžobu za hriech Adamov\n" +
                    "a svojou krvou zrušil výrok odsúdenia za prvotnú vinu.\n" +
                    "Lebo slávime veľkonočné sviatky,\n" +
                    "keď bol zabitý pravý Baránok,\n" +
                    "ktorého krv posväcuje dveraje veriacich.\n" +
                    "Toto je noc,\n" +
                    "v ktorej si našim otcom, synom Izraela,\n" +
                    "pomohol prejsť suchou nohou cez Červené more,\n" +
                    "keď si ich vyviedol z Egypta.\n" +
                    "Toto je noc,\n" +
                    "v ktorej jas ohnivého stĺpa\n" +
                    "rozohnal temnoty hriechu.\n" +
                    "Toto je noc,\n" +
                    "ktorá dnes na celej zemi veriacich v Krista\n" +
                    "vymaňuje z neprávosti sveta a z otroctva hriechu,\n" +
                    "vracia im Božiu milosť\n" +
                    "a vovádza ich do spoločenstva svätých.\n" +
                    "Toto je noc,\n" +
                    "v ktorej Kristus rozlámal okovy smrti\n" +
                    "a víťazne vstal z hrobu.\n" +
                    "Aká nesmierna je voči nám tvoja dobrota, Otče,\n" +
                    "aká nevyspytateľná je tvoja láska!\n" +
                    "Aby si vykúpil otroka,\n" +
                    "vydal si na smrť vlastného Syna!\n" +
                    "Naozaj potrebný bol hriech Adamov,\n" +
                    "ktorý zotrela smrť Kristova!\n" +
                    "Ó, šťastná vina,\n" +
                    "pre ktorú k nám prišiel taký vznešený Vykupiteľ!\n" +
                    "Posvätné tajomstvo tejto noci premáha zlobu, zmýva viny,\n" +
                    "hriešnikom vracia nevinnosť a radosť zarmúteným.\n" +
                    "Naozaj požehnaná noc,\n" +
                    "ktorá spája nebo so zemou a človeka s Bohom.\n" +
                    "Preto v túto milostivú noc\n" +
                    "prijmi, svätý Otče, našu večernú obetu chvály,\n" +
                    "ktorú ti prináša svätá Cirkev,\n" +
                    "keď rukami svojich služobníkov\n" +
                    "slávnostne ti predkladá túto veľkonočnú sviecu,\n" +
                    "pripravenú z vosku pracovitých včiel.\n" +
                    "Preto ťa, Pane, prosíme,\n" +
                    "nech táto svieca, zasvätená oslave tvojho mena,\n" +
                    "žiari nehasnúcim svetlom a zaháňa nočné temnoty.\n" +
                    "Prijmi ju so záľubou\n" +
                    "a jej žiara nech sa spojí\n" +
                    "so svetlom nebeských hviezd.\n" +
                    "Nech ju nájde horieť ranná zornica,\n" +
                    "tá zornica, ktorá nikdy nezapadá:\n" +
                    "tvoj Syn Ježiš Kristus, ktorý slávne vstal z mŕtvych,\n" +
                    "osvecuje ľudstvo veľkonočným svetlom\n" +
                    "a žije a kraľuje na veky vekov."},
            {"html", "<font color='#B71C1C'>Ľud:</font> Amen."},
    };

    String[][] pozehnanie_vody = {
            {"red|small|justify", "54. Ak sa nevysluhuje krst a nepožehnáva sa ani krstný prameň, kňaz požehná vodu. Najprv sa prihovorí veriacim:"},
            {"", "Bratia a sestry,\n" +
                    "pokorne prosme nášho Pána a Boha,\n" +
                    "nech požehná túto vodu,\n" +
                    "aby sme ňou mohli byť pokropení\n" +
                    "na pamiatku nášho krstu,\n" +
                    "a nech nás milostivo obnoví,\n" +
                    "aby sme ostali verní Duchu Svätému, ktorého sme prijali."},
            {"red|small|justify", "A po krátkej chvíli ticha prednesie s rozopätými rukami túto modlitbu:"},
            {"", "Pane a Bože náš, láskavo buď s nami\n" +
                    "a požehnaj túto vodu,\n" +
                    "keď nábožne slávime túto presvätú noc\n" +
                    "a pripomíname si, ako obdivuhodne si nás stvoril\n" +
                    "a ešte obdivuhodnejšie vykúpil.\n" +
                    "Ty si stvoril vodu, aby zúrodňovala polia\n" +
                    "a aby nás osviežovala a očisťovala.\n" +
                    "Ty si ju postavil do služieb svojho milosrdenstva:\n" +
                    "vodou si vyslobodil svoj ľud z otroctva\n" +
                    "a uhasil si na púšti jeho smäd.\n" +
                    "V predpovediach prorokov voda\n" +
                    "bola obrazom novej zmluvy,\n" +
                    "ktorú si chcel uzavrieť s ľudstvom.\n" +
                    "Napokon skrze vodu,\n" +
                    "ktorú Kristus posvätil v Jordáne,\n" +
                    "si v kúpeli znovuzrodenia\n" +
                    "obnovil porušenú ľudskú prirodzenosť.\n" +
                    "Nech nám teda táto voda pripomína náš krst,\n" +
                    "aby sme sa radovali s našimi bratmi a sestrami,\n" +
                    "ktorí na Veľkú noc prijali sviatosť krstu.\n" +
                    "Skrze Krista, nášho Pána."},
            {"html", "<font color='#B71C1C'>℟.</font> Amen."},
    };

    String[][] uvadzanie_kres_zivot = {
            {"red|small|justify", "1. Uvádzanie dospelých do kresťanského života sa slávi podľa tradície na Veľkonočnú vigíliu. Sviatosti sa udeľujú po požehnaní vody, ako sa uvádza v Rímskom misáli, v obrade Veľkonočnej vigílie v bodoch č. 48 – 53."},
            {"center|red", "Slávenie sviatosti krstu"},
            {"red|small|justify", "2. Aj vtedy, keď sa slávia sviatosti uvádzania do kresťanského života mimo veľkonočnej slávnosti, koná sa obrad požehnania vody (porov. Všeobecný úvod, OICA č. 21), ktorým sa spomienkou na veľké veci, ktoré Boh urobil, pripomína tajomstvo jeho lásky od začiatku sveta a stvorenia ľudstva. Vzývaním Ducha Svätého a zvestovaním Kristovej smrti a zmŕtvychvstania sa zdôrazňuje nový kúpeľ znovuzrodenia ustanovený Pánom, ktorým máme účasť na jeho smrti a zmŕtvychvstaní a prijímame Božiu svätosť. \n" +
                    "3. Zrieknutie sa zlého ducha a vyznanie viery tvoria jeden obrad, ktorý má plnú silu v krste dospelých. Pretože krst je sviatosťou viery, ktorou sa katechumeni spájajú s Bohom, ktorý ich znovuzrodzuje, krst predchádza úkon, ktorým sa jednotlivci, ako to bolo predobrazené prvou zmluvou patriarchov, rozhodne zriekajú hriechu a zlého ducha tak, že navždy sa chcú privinúť k Spasiteľovým prisľúbeniam a tajomstvu Trojice. Týmto vyznaním, ktoré skladajú pred celebrantom a spoločenstvom, vyjadrujú vôľu, vyzretú počas katechumenátu, uzavrieť s Kristom novú zmluvu. V tejto viere, ktorú Cirkev z Božej vôle odovzdáva a oni ju prijímajú, sa krstia dospelí. \n" +
                    "4. Pomazanie olejom katechumenov, ktoré je medzi zriekaním sa zlého ducha a vyznaním viery, možno z pastoračných dôvodov, a ak je to liturgicky vhodné, anticipovať (porov. OICA č. 206 – 207). \n" +
                    "Pritom treba mať na zreteli, že pomazaním sa vyjadruje potreba Božej posily, aby krstenec po prekonaní prekážok minulého života a nástrah diabla mohol s odvahou nastúpiť na cestu vyznávania viery, ktorej sa má neochvejne držať po celý svoj život."},
            {"center", "Úvodné slová celebranta, litánie a svätenie krstnej vody"},
            {"red|small", "Pozri v bodoch č. 37 – 47."},
            {"center", "Zrieknutie sa Zlého ducha"},
            {"red|small|justify", "5. Po posvätení krstného prameňa celebrant sa pýta súčasne všetkých vyvolených jednou z nasledujúcich formúl:"},
            {"html", "<font color='#B71C1C'>Kňaz:</font> Zriekate sa Zlého ducha a všetkých jeho skutkov a pokušení?<br>" +
                    "<font color='#B71C1C'>Vyvolení:</font> Zriekam."},
            {"red|small", "Alebo:"},
            {"html", "<font color='#B71C1C'>Kňaz:</font> Zriekate sa Zlého ducha?<br>" +
                    "<font color='#B71C1C'>Vyvolení:</font>Zriekam.<br>" +
                    "<font color='#B71C1C'>Kňaz:</font> Aj všetkých jeho skutkov?<br>" +
                    "<font color='#B71C1C'>Vyvolení:</font> Zriekam.<br>" +
                    "<font color='#B71C1C'>Kňaz:</font> Aj všetkých jeho pokušení?<br>" +
                    "<font color='#B71C1C'>Vyvolení:</font> Zriekam."},
            {"red|small", "Alebo:"},
            {"html", "<font color='#B71C1C'>Kňaz:</font> Zriekate sa hriechu, aby ste mohli žiť v slobode Božích detí?<br>" +
                    "<font color='#B71C1C'>Vyvolení:</font> Zriekam.<br>" +
                    "<font color='#B71C1C'>Kňaz:</font> Zriekate sa vábivých pokušení, aby vás neovládal hriech?<br>" +
                    "<font color='#B71C1C'>Vyvolení:</font> Zriekam.<br>" +
                    "<font color='#B71C1C'>Kňaz:</font> Zriekate sa Zlého ducha, pôvodcu a kniežaťa hriechu?<br>" +
                    "<font color='#B71C1C'>Vyvolení:</font> Zriekam."},
            {"red|small|justify", "Dozvediac sa od krstných rodičov meno krstencov, celebrant sa podlá okolností môže pýtať každého jednotlivca podľa niektorej z priliehavejších formúl uvedených vyššie.\n" +
                    "Ak je to potrebné, biskupské konferencie však môžu upraviť tieto tri formuly, najmä tam, kde treba, aby sa vyvolení zriekli povier, veštenia a mágie (porov. OICA č. 80)."},
            {"center", "Pomazanie olejom katechumenov"},
            {"red|small|justify", "6. Ak sa pomazanie olejom katechumenov nekonalo v obrade bezprostrednej prípravy (OICA č. 206 – 207), celebrant povie:"},
            {"", "Nech vás posilňuje sila Krista, nášho Spasiteľa;\n" +
                    "na znak toho vás pomažeme olejom spásy\n" +
                    "v Kristovi Ježišovi, našom Pánovi,\n" +
                    "ktorý žije a kraľuje na veky vekov."},
            {"red", "Vyvolení:"},
            {"", "Amen."},
            {"red|small|justify", "Kňaz pomaže každého vyvoleného olejom katechumenov na hrudi alebo na obidvoch rukách alebo aj, ak to pokladá za vhodné, na iných častiach tela. Ak je vyvolených veľa, pomazanie môžu robiť aj viacerí celebranti.\n" +
                    "Podľa úsudku biskupskej konferencie sa toto pomazanie môže aj vynechať."},
            {"center", "Vyznanie viery"},
            {"red|small|justify", "7. Celebrant sa znova pýta krstných rodičov na meno krstencov a pýta sa každého jednotlivo:"},
            {"html", "<font color='#B71C1C'>Kňaz: M.</font>, Veríš v Boha Otca všemohúceho, Stvoriteľa neba i zeme?<br>" +
                    "<font color='#B71C1C'>Vyvolený:</font> Verím.<br>" +
                    "<font color='#B71C1C'>Kňaz:</font> Veríš v Ježiša Krista, jeho jediného Syna a nášho Pána, narodeného z Márie Panny, umučeného a pochovaného, ktorý vstal z mŕtvych a sedí po pravici Otca?<br>" +
                    "<font color='#B71C1C'>Vyvolený:</font> Verím.<br>" +
                    "<font color='#B71C1C'>Kňaz:</font> Veríš v Ducha Svätého, v svätú Cirkev katolícku, v spoločenstvo svätých, v odpustenie hriechov, vo vzkriesenie tela a v život večný?<br>" +
                    "<font color='#B71C1C'>Vyvolený:</font> Verím."},
            {"red|small|justify", "Hneď po vyznaní viery každý prijme krst ponorením alebo poliatím. Ak je krstencov veľmi veľa, vyznanie viery môžu urobiť všetci súčasne alebo viacerí spolu."},
            {"center", "Obrad krstu"},
            {"red|small|justify", "8. Ak sa krstí ponorením celého tela alebo len hlavy, treba sa postarať o zachovanie studu a slušnosti.\n" +
                    "Celebrant sa dotkne vyvoleného a ponorí ho alebo jeho hlavu do vody trikrát a krstí ho, pričom raz vzýva najsvätejšiu Trojicu:"},
            {"html", "M., ja ťa krstím v mene Otca"},
            {"red|small", "ponorí prvý raz"},
            {"", "i Syna"},
            {"red|small", "ponorí druhý raz"},
            {"", "i Ducha Svätého."},
            {"red|small|justify", "ponorí tretí raz.\n" +
                    "Krstný otec alebo krstná matka, alebo obidvaja sa dotknú krstenca. Po krste každého dospelého ľud povie krátku aklamáciu (porov. OICA č. 390)\n" +
                    "9. Ak sa krst koná poliatím vodou, celebrant vezme z prameňa krstnú vodu, trikrát vyleje vodu na naklonenú hlavu vyvoleného a pokrstí ho v mene najsvätejšej Trojice:"},
            {"html", "M., ja ťa krstím v mene Otca"},
            {"red|small", "ponorí prvý raz"},
            {"", "i Syna"},
            {"red|small", "ponorí druhý raz"},
            {"", "i Ducha Svätého."},
            {"red|small|justify", "ponorí tretí raz.\n" +
                    "Krstný otec alebo krstná matka, alebo obidvaja držia pravú ruku na pravom pleci vyvoleného.\n" +
                    "Po krste každého dospelého ľud povie krátku aklamáciu, napríklad:"},
            {"", "Nad vodami zaznieva hlas Otca,\n" +
                    "žiari sláva Syna\n" +
                    "a láska Ducha Svätého rozdáva život."},
            {"red|small|justify", "(Iné aklamácie pozri pod OICA č. 390).\n" +
                    "10. Ak je vyvolených veľmi veľa a sú prítomní ďalší kňazi alebo diakoni, krstencov možno rozdeliť medzi jednotlivých vysluhovateľov, ktorí ich ponárajú do vody alebo lejú na nich vodu, pričom každý povie formulu v jednotnom čísle.\n" +
                    "Počas obradu sa žiada, aby ľud spieval. Možno aj čítať čítania alebo zachovať posvätné ticho."},
            {"red|bold|center", "Vysvetľujúce obrady"},
            {"red|small|justify", "11. Hneď po krste sa konajú vysvetľujúce obrady (č. 12 – 14). Po nich sa slávi aj birmovanie, ako sa uvádza ďalej (č. 15 – 19). Vtedy sa pomazanie po krste vynecháva."},
            {"center", "Pomazanie po krste"},
            {"red|small|justify", "12. Ak sa slávenie sviatosti birmovania z osobitnej príčiny oddelí od krstu, po ponorení alebo poliatí vodou celebrant urobí pomazanie krizmou zvyčajným spôsobom. Povie naraz nad všetkými pokrstenými:"},
            {"", "Všemohúci Boh, Otec nášho Pána Ježiša Krista,\n" +
                    "znovuzrodil vás z vody a z Ducha Svätého,\n" +
                    "odpustil vám všetky hriechy\n" +
                    "a začlenil vás medzi svoj ľud.\n" +
                    "Teraz vás poznačuje krizmou spásy,\n" +
                    "aby ste boli údmi Krista\n" +
                    "kňaza, proroka a kráľa\n" +
                    "a mali život večný."},
            {"red", "Pokrstení:"},
            {"", "Amen."},
            {"red|small|justify", "Potom celebrant bez slova pomaže svätou krizmou každého pokrsteného na temene hlavy.\n" +
                    "Ak je pokrstených veľmi veľa a sú prítomní ďalší kňazi alebo diakoni, každý z nich môže pomazať niektorých pokrstených."},
            {"center", "Odovzdanie bieleho rúcha"},
            {"red|small|justify", "13. Celebrant povie:"},
            {"html", "<font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>, stali ste sa novým stvorením<br>" +
                    "a obliekli ste si Krista.<br>" +
                    "Prijmite toto biele rúcho<br>" +
                    "a prineste ho nepoškvrnené<br>" +
                    "pred súdnu stolicu nášho Pána Ježiša Krista,<br>" +
                    "aby ste mali účasť na večnom živote."},
            {"red", "Pokrstení:"},
            {"", "Amen."},
            {"red|small|justify", "Na slová Prijmite toto biele rúcho krstní rodičia položia na novopokrstených biele rúcho, ak miestne obyčaje neradia primeranejšiu farbu.\n" +
                    "Podľa okolností možno tento obrad vynechať."},
            {"center", "Odovzdanie zažatej sviece"},
            {"red|small|justify", "14. Celebrant vezme do rúk veľkonočnú sviecu alebo sa jej dotkne a povie:"},
            {"", "Krstní rodičia,\n" +
                    "pristúpte a odovzdajte novopokrsteným svetlo."},
            {"red|small|justify", "Krstní rodičia pristúpia, zapália si sviecu od veľkonočnej sviece a odovzdajú ju novopokrstenému. Kňaz potom povie:"},
            {"", "Stali ste sa svetlom v Kristovi.\n" +
                    "Kráčajte vždy ako deti svetla\n" +
                    "a vytrvajte vo viere až do konca,\n" +
                    "aby ste mohli ísť so všetkými svätými\n" +
                    "v ústrety Pánovi, keď príde v nebeskej sláve."},
            {"red", "Pokrstení:"},
            {"", "Amen."},
            {"red|bold|center", "Slávenie sviatosti birmovania"},
            {"html|small|justify", "<font color='#B71C1C'>15. Medzi slávením krstu a birmovania môže spoločenstvo veriacich spievať vhodnú pieseň, napríklad:</font> Duchu Svätý, príď z neba.<font color='#B71C1C'><br>" +
                    "Slávenie birmovania môže byť v presbytériu alebo v samom baptistériu podlá toho, ako to radia miestne okolnosti.</font>"},
            {"red|small|justify", "16. Ak krst udeľoval biskup, patrí sa, aby on sám pokrsteného aj birmoval. Ak nie je prítomný biskup, birmovať môže kňaz, ktorý udelil krst.\n" +
                    "Ak je birmovancov veľmi veľa, k celebrantovi sa v udeľovaní sviatosti môžu pridružiť kňazi, ktorí sa určujú na túto službu (porov. OICA č. 46).\n" +
                    "17. Celebrant krátko osloví novopokrstených takto alebo podobne:"},
            {"html|justify", "Drahí novopokrstení <font color='#B71C1C'>(</font>bratia a sestry<font color='#B71C1C'>)</font>, v Kristovi ste sa znovuzrodili a stali ste sa údmi Krista a jeho kňazského ľudu. Teraz vám ešte ostáva prijať Ducha Svätého, ako sme ho aj my prijali. Jeho zoslal Pán v Turíčny deň na apoštolov a apoštoli a ich nástupcovia ho potom dávali pokrsteným.<br>" +
                    "Aj vy teda prijmete podľa prísľubu silu Ducha Svätého, aby ste sa dokonalejšie pripodobnili Kristovi, a tak vydávali svedectvo o Pánovom umučení a zmŕtvychvstaní a stali sa živými údmi Cirkvi na zveľadenie Kristovho tela vo viere a láske."},
            {"red|small|justify", "Potom celebrant vstane (a s ním aj kňazi, ktorí mu budú pomáhať), obráti sa k ľudu a so zopätými rukami hovorí:"},
            {"", "Milovaní bratia a sestry,\n" +
                    "prosme všemohúceho Boha Otca,\n" +
                    "aby láskavo udelil Ducha Svätého týmto novopokrsteným.\n" +
                    "Nech ich Duch Svätý posilní prehojnými darmi\n" +
                    "a nech ich pomazaním zdokonalí a pripodobní\n" +
                    "Ježišovi Kristovi, Synovi Božiemu."},
            {"red|small|justify", "Všetci sa v tichosti modlia.\n" +
                    "18. Potom celebrant (a kňazi, ktorí mu budú pomáhať birmovať) vystrú ruky nad všetkých birmovancov. Modlí sa iba celebrant:"},
            {"", "Všemohúci Bože, Otec nášho Pána Ježiša Krista,\n" +
                    "ty si znovuzrodil z vody a z Ducha Svätého\n" +
                    "týchto našich bratov a sestry\n" +
                    "a oslobodil si ich od hriechu.\n" +
                    "Otče, zošli na nich Ducha Svätého Obhajcu,\n" +
                    "udeľ im ducha múdrosti a rozumu,\n" +
                    "ducha rady a sily,\n" +
                    "ducha poznania a nábožnosti\n" +
                    "a naplň ich duchom bázne voči tebe.\n" +
                    "Skrze Krista, nášho Pána."},
            {"red", "Všetci:"},
            {"", "Amen."},
            {"red|small|justify", "19. Potom prisluhujúci podá celebrantovi svätú krizmu. Birmovanci po jednom pristupujú k celebrantovi, alebo ak by to bolo výhodnejšie, sám celebrant pristúpi ku každému z nich. Krstný rodič položí pravú ruku na plece birmovanca a celebrantovi povie meno birmovanca, prípadne birmovanec povie svoje meno. \n" +
                    "Celebrant vloží koniec palca pravej ruky do krizmy, urobí ním kríž na čele birmovanca a pritom povie:"},
            {"html", "<font color='#B71C1C'>M.</font>, prijmi znak Daru Ducha Svätého."},
            {"red|small", "Birmovanec povie:"},
            {"", "Amen."},
            {"red|small", "Celebrant dodá:"},
            {"", "Pokoj s tebou."},
            {"red", "Birmovanec:"},
            {"", "I s duchom tvojím."},
            {"red|small|justify", "Ak celebrantovi pomáhajú pri udeľovaní sviatosti ďalší kňazi, biskup, ak je prítomný, podá každému nádobku so svätou krizmou.\n" +
                    "Birmovanci po jednom pristupujú k celebrantovi alebo ku kňazom, alebo ak by to bolo výhodnejšie, celebrant i kňazi pristupujú k birmovancom a pomazávajú ich, ako sa uvádza v predchádzajúcom bode.\n" +
                    "Počas birmovania sa môže spievať vhodná pieseň."},
            {"red|bold|center", "Slávenie Eucharistie"},
            {"red|small|justify", "Pozri od bodu 59.\n" +
                    "20. Ak sa berie Rímsky kánon, v spomienke na živých sa spomenú mená krstných rodičov:"},
            {"", "Pamätaj, Pane, na svojich\n" +
                    "služobníkov a služobnice,\n" +
                    "ktorí priviedli tvojich vyvolených\n" +
                    "k svätej milosti krstu,"},
            {"red|small", "Tu sa spomenú mená krstných rodičov."},
            {"", "Pamätaj i na všetkých tu zhromaždených.\n" +
                    "Ty poznáš ich vieru..."},
            {"red|small|justify", "21. V eucharistických modlitbách sa spomienka na novopokrstených koná takto:"},
            {"html|justify", "<font color='#B71C1C'>a) V Prvej eucharistickej modlitbe</font> Pane, milostivo prijmi<font color='#B71C1C'>, je vlastné:</font>"},
            {"", "Pane, milostivo prijmi túto obetu,\n" +
                    "ktorú ti predkladáme my, tvoji služobníci,\n" +
                    "i celá tvoja rodina.\n" +
                    "Prinášame ti ju aj za tých,\n" +
                    "ktorých si znovuzrodil z vody a z Ducha Svätého\n" +
                    "a udelil si im odpustenie všetkých hriechov,\n" +
                    "aby boli tvojimi deťmi\n" +
                    "v Ježišovi Kristovi, našom Pánovi.\n" +
                    "Prosíme ťa, zapíš ich mená do knihy života.\n" +
                    "(Skrze Krista, nášho Pána. Amen.)"},
            {"html|justify", "<font color='#B71C1C'>b) V Druhej eucharistickej modlitbe po slovách </font>a so všetkými biskupmi, kňazmi a diakonmi<font color='#B71C1C'> sa dodá:</font>"},
            {"", "Pamätaj, Pane, aj na našich novopokrstených,\n" +
                    "ktorí sa dnes krstom (a birmovaním)\n" +
                    "stali členmi tvojej rodiny,\n" +
                    "a pomáhaj im, aby ochotne a veľkodušne\n" +
                    "nasledovali tvojho Syna Ježiša Krista.\n" +
                    "\n" +
                    "Pamätaj i na našich bratov a sestry, čo zomreli..."},
            {"html|justify", "<font color='#B71C1C'>c) V Tretej eucharistickej modlitbe po slovách </font>i všetok vykúpený ľud<font color='#B71C1C'> sa dodá:</font>"},
            {"", "Prosíme ťa, posilňuj vo svätom predsavzatí\n" +
                    "svojich služobníkov (a služobnice),\n" +
                    "ktorí dnes v kúpeli znovuzrodenia\n" +
                    "(a prijatím Ducha Svätého)\n" +
                    "boli pridružení k tvojmu ľudu,\n" +
                    "a pomáhaj im rásť v novom živote.\n" +
                    "\n" +
                    "Milostivo vypočuj prosby tejto rodiny..."}
    };

    String[][] eucharisticka_procesia_vn_sobota = {
            {"red|small|justify", "V omši sa konsekruje aj veľká hostia do monštrancie.\n" +
                    "Po prijímaní kňaz (alebo diakon, ak je) vloží hostiu do monštrancie.\n" +
                    "Hneď po modlitbe po prijímaní celebrant si vezme biely pluviál (alebo môže zostať aj v ornáte), zíde pred oltár, kľakne si (chrbtom k ľudu) a incenzuje Sviatosť.\n" +
                    "Potom vstane, obráti sa tvárou k veriacim a povie takto alebo podobne:"},
            {"justify", "Drahí bratia a sestry, v tejto veľkonočnej vigílii sme oslávili Kristovo veľkonočné tajomstvo: Kristus vstal z mŕtvych, premohol smrť a hriech a priniesol nám novy život. Kristus nás vykúpil svojím krížom a zmŕtvychvstaním. Raduje sa celá Cirkev, ozdobená žiarou Pánovej slávy, a aj tento chrám zaznel jasavým spevom. Nech aj okolo tohto chrámu a v celej našej farnosti zaznie chválospev na oslavu víťazného Pána."},
            {"red|small|justify", "Celebrant sa obráti k oltáru a zaintonuje on alebo aj spevák:"},
            {"", "Vstal som z mŕtvych."},
            {"red|small|justify", "Zbor alebo aj veriaci pokračujú:"},
            {"html", "A som, Otče, stále s tebou. Aleluja.<br>" +
                    "Kladieš na mňa svoju ruku. Aleluja.<br>" +
                    "Obdivuhodná je tvoja múdrosť.<br>" +
                    "Aleluja, aleluja, aleluja. <font color='#B71C1C'>(Porov. Ž 139, 5)</font>"},
            {"red|small|justify", "Celebrant prijme vélum, vezme do rúk monštranciu a povie:"},
            {"", "Pokoj vám, ja som to. Aleluja."},
            {"red|small|justify", "Zbor (ľud):"},
            {"", "Nebojte sa. Aleluja."},
            {"red|small|justify", "Tieto slová celebrant i zbor opakujú ešte dvakrát, a to vždy vyšším hlasom. Namiesto kňaza môže intonovať spevák.\n" +
                    "Potom kňaz alebo aj spevák zaspieva:"},
            {"html", "Pán Ježiš Kristus vstal z mŕtvych. <font color='#B71C1C'>(JKS 192)</font>"},
            {"html|small|justify", "<font color='#B71C1C'>Všetci v piesni pokračujú.<br>" +
                    "Sprievod ide cez kostol a okolo kostola podľa miestnych okolností. Pred Najsvätejšou sviatosťou idú posluhujúci s dymiacimi kadidelnicami. Na čele ide posluhujúci s krížom medzi dvoma posluhujúcimi so zažatými sviecami a posluhujúci so sochou Zmŕtvychvstalého. Ostatní veriaci sa usporiadajú podľa miestnych zvyklostí. Zvonia zvony.<br>" +
                    "Pri návrate speváci intonujú chválospev </font>Teba, Bože, chválime<font color='#B71C1C'>. Ľud pokračuje. Keď celebrant príde k oltáru, položí ostenzórium na oltár. Po skončení chválospevu kňaz alebo spevák intonuje </font>Ctime túto sviatosť slávnu<font color='#B71C1C'>.<br>" +
                    "Ak sa nemôže konať procesia, kňaz po intonácii </font>Pán Ježiš Kristus vstal z mŕtvych<font color='#B71C1C'> alebo </font>Raduj sa, Cirkev Kristova<font color='#B71C1C'> položí Najsvätejšou sviatosť na oltár, stane si pred oltár, chrbtom k ľudu, a pripojí sa k spevu. Potom je hymnus </font>Teba, Bože, chválime<font color='#B71C1C'>. Po ňom eucharistická pieseň </font>Ctime túto sviatosť slávnu<font color='#B71C1C'>.<br>" +
                    "Pri druhej strofe eucharistického hymnu, kňaz stojac vloží do kadidelnice tymian, požehná ho, kľačiačky trikrát okiadza Najsvätejšiu sviatosť a po skončení hymnu povie:</font>"},
            {"html", "<font color='#B71C1C'>Kňaz:</font> Nebo a zem sa tešia. Aleluja.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Z tvojho zmŕtvychvstania, Kriste. Aleluja.<br>" +
                    "Modlime sa."},
            {"red|small", "Chvíľa ticha."},
            {"html", "Pane Ježišu, vo vznešenej Oltárnej sviatosti<br>" +
                    "zanechal si nám pamiatku<br>" +
                    "svojho umučenia a zmŕtvychvstania; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám uctievať<br>" +
                    "tajomstvo tvojho Tela a Krvi s takou vierou a láskou, <font color='#B71C1C'>–</font><br>" +
                    "aby sme vždy pociťovali<br>" +
                    "účinky tvojho vykupiteľského diela.<br>" +
                    "Lebo ty žiješ a kraľuješ na veky vekov.<br>" +
                    "<font color='#B71C1C'>Všetci:</font> Amen."},
            {"html|small|justify", "<font color='#B71C1C'>Kňaz prijme náplecné vélum, zoberie do rúk monštranciu a požehná ľud, pričom nič nehovorí.\n" +
                    "Potom uloží Najsvätejšiu sviatosť do svätostánku, pokľakne a svätostánok uzavrie. Ľud môže zatiaľ predniesť vhodnú aklamáciu, napr. </font>Christus vincit – Kristus víťaz<font color='#B71C1C'>.\n" +
                    "Na zakončenie sa zaspieva veľkonočná mariánska antifóna.</font>"},
            {"", "Raduj sa, nebies Kráľovná, aleluja, aleluja.\n" +
                    "Lebo koho si nosila, aleluja, aleluja.\n" +
                    "Z mŕtvych vstal, jak predpovedal, aleluja, aleluja.\n" +
                    "Pros, aby nás k sebe prijal, aleluja, aleluja."},
            {"html", "<font color='#B71C1C'>Kňaz:</font> Raduj sa a veseľ sa, Panna Mária, aleluja.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Lebo Pán naozaj vstal z mŕtvych, aleluja.<br>" +
                    "Modlime sa.<br>" +
                    "Bože, ty si zmŕtvychvstaním tvojho Syna,<br>" +
                    "nášho Pána Ježiša Krista, potešil celý svet; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>–</font><br>" +
                    "daj, aby sme na príhovor jeho Rodičky Panny Márie<br>" +
                    "dosiahli radosti večného života.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Všetci:</font> Amen."},
    };

    String[][] eucharisticka_procesia_vn_nedela = {
            {"red|small|justify", "Slávnosť sa koná v čase vešpier.\n" +
                    "Ak by sa namiesto vešpier konala bohoslužba slova, treba vziať prvé čítanie 1 Pt 1, 17-21 a evanjelium Lk 24, 12-25 s responzóriovým žalmom 15.\n" +
                    "Kňaz vystaví na oltár Najsvätejšiu sviatosť v monštrancii. Kľakne si a počas eucharistickej piesne incenzuje Sviatosť.\n" +
                    "Potom sa konajú slávnostné vešpery (prípadne bohoslužba slova). Po záverečnej modlitbe sa kňaz obráti k ľudu a povie:"},
            {"justify", "Drahí bratia a sestry, toto je deň, ktorý učinil Pán: plesajme a radujme sa z neho. Aleluja. Deň vzkriesenia Ježiša Krista je najslávnejším dňom a veľkonočná radosť je najväčšou radosťou.\n" +
                    "Ohlasujme radostnú zvesť o vykúpení, ďakujme zmŕtvychvstalému Kristovi, ktorý je medzi nami, za tento deň a oslavujme ho."},
            {"red|small|justify", "Kňaz incenzuje Sviatosť, obráti sa k ľudu a zaintonuje:"},
            {"", "Ja som s vami."},
            {"red|small", "Intonovať môže aj spevák.\n" +
                    "Zbor alebo aj veriaci pokračujú:"},
            {"", "Po všetky dni až do skončenia sveta. Aleluja.\n" +
                    "Ja som Prvý a Posledný a Živý. Aleluja.\n" +
                    "Bol som mŕtvy a hľa, žijem na veky vekov.\n" +
                    "Aleluja, aleluja, aleluja."},
            {"red|small|justify", "Celebrant prijme náplecné vélum, vezme do rúk monštranciu, obráti sa k ľudu a intonuje:"},
            {"", "Pokoj vám, ja som to. Aleluja."},
            {"red|small", "Zbor alebo aj veriaci odpovedajú:"},
            {"", "Nebojte sa. Aleluja."},
            {"red|small|justify", "Tieto slová celebrant i zbor opakujú ešte dvakrát, a to vždy vyšším hlasom. Namiesto kňaza môže intonovať spevák.\n" +
                    "Potom kňaz alebo aj spevák zaspieva:"},
            {"html", "Pán Ježiš Kristus vstal z mŕtvych. <font color='#B71C1C'>(JKS 192)</font>"},
            {"red|small", "Alebo:"},
            {"html", "Raduj sa, Cirkev Kristova. <font color='#B71C1C'>(JKS 201)</font>"},
            {"html|small|justify", "<font color='#B71C1C'>Všetci v piesni pokračujú.<br>" +
                    "Sprievod koná podľa miestnych okolností. Na čele procesie sa nesie kríž a socha Zmŕtvychvstalého. Pred Sviatosťou idú turiferi, ktorí striedavo incenzujú Sviatosť. Ostatní veriaci sa usporiadajú podľa miestnych zvyklostí. Zvonia zvony.<br>" +
                    "Po návrate speváci intonujú chválospev </font>Teba, Bože, chválime<font color='#B71C1C'>. Ľud pokračuje. Keď celebrant príde k oltáru, položí monštranciu na oltár. Po skončení chválospevu celebrant alebo spevák intonuje </font>Tantum ergo – Ctime túto sviatosť slávnu<font color='#B71C1C'>.<br>" +
                    "Ak sa nemôže konať procesia, kňaz po intonácii </font>Pán Ježiš Kristus vstal z mŕtvych<font color='#B71C1C'> alebo </font>Raduj sa, Cirkev Kristova<font color='#B71C1C'> položí Sviatosť na oltár, stane si pred oltár (chrbtom k ľudu) a pripojí sa k spevu. Potom je hymnus </font>Teba, Bože, chválime<font color='#B71C1C'>. Po ňom eucharistická pieseň </font>Tantum ergo – Ctime túto sviatosť slávnu<font color='#B71C1C'>.<br>" +
                    "Pri druhej strofe eucharistického hymnu, kňaz incenzuje Sviatosť a po skončení hymnu povie\n</font>"},
            {"html", "<font color='#B71C1C'>Kňaz:</font> Pane, zostaň s nami, lebo sa zvečerieva. Aleluja.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> A deň sa už schýlil. Aleluja.<br>" +
                    "Modlime sa."},
            {"red|small", "Chvíľa ticha."},
            {"html", "Pane Ježišu, vo vznešenej Oltárnej sviatosti<br>" +
                    "zanechal si nám pamiatku<br>" +
                    "svojho umučenia a zmŕtvychvstania; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám uctievať<br>" +
                    "tajomstvo tvojho Tela a Krvi s takou vierou a láskou, <font color='#B71C1C'>–</font><br>" +
                    "aby sme vždy pociťovali<br>" +
                    "účinky tvojho vykupiteľského diela.<br>" +
                    "Lebo ty žiješ a kraľuješ na veky vekov.<br>" +
                    "<font color='#B71C1C'>Všetci:</font> Amen."},
            {"html|small|justify", "<font color='#B71C1C'>Kňaz prijme náplecné vélum, zoberie do rúk monštranciu a požehná ľud, pričom nič nehovorí.<br>" +
                    "Potom uloží Najsvätejšiu sviatosť do svätostánku, pokľakne a svätostánok uzavrie. Ľud môže zatiaľ predniesť vhodnú aklamáciu, napr. </font>Christus vincit – Kristus víťaz<font color='#B71C1C'>.<br>" +
                    "Na zakončenie sa zaspieva veľkonočná mariánska antifóna.</font>"},
            {"", "Raduj sa, nebies Kráľovná, aleluja, aleluja.\n" +
                    "Lebo koho si nosila, aleluja, aleluja.\n" +
                    "Z mŕtvych vstal, jak predpovedal, aleluja, aleluja.\n" +
                    "Pros, aby nás k sebe prijal, aleluja, aleluja."},
            {"html", "<font color='#B71C1C'>Kňaz:</font>Raduj sa a veseľ sa, Panna Mária, aleluja.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Lebo Pán naozaj vstal z mŕtvych, aleluja.<br>" +
                    "Modlime sa.<br>" +
                    "Bože, ty si zmŕtvychvstaním tvojho Syna,<br>" +
                    "nášho Pána Ježiša Krista, potešil celý svet; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme na príhovor jeho Rodičky Panny Márie<br>" +
                    "dosiahli radosti večného života.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Všetci:</font> Amen."}
    };

    String[][] ulozenie_piatok = {
            {"red|small|justify", "Adorácia v Božom hrobe trvá až do začiatku Veľkonočnej vigílie. Na noc sa však Najsvätejšia sviatosť uloží do svätostánku v kaplnke.\n" +
        "Kňaz (diakon) si vezme na albu alebo superpelíciu červenú štólu, príde k Božiemu hrobu, chvíľu zotrvá v tichej modlitbe a potom sa s prítomnými modlí:"},
            {"html", "<font color='#B71C1C'>℣.</font> Buď pozdravené, pravé Kristovo telo, obetované za nás na kríži.<br>" +
        "<font color='#B71C1C'>℟.</font> Buď pozdravené, pravé Kristovo telo, obetované za nás na kríži.<br>" +
        "<font color='#B71C1C'>℣.</font> Ježišu Kriste, Baránok bez poškvrny, ty si zomrel na kríži za naše hriechy. <br>" +
        "<font color='#B71C1C'>℟.</font> Buď pozdravené, pravé Kristovo telo, obetované za nás na kríži.<br>" +
        "<font color='#B71C1C'>℣.</font> Ježišu Kriste, tvoje telo, obetované za nás, je duchovný pokrm, ktorý nás posilňuje.<br>" +
        "<font color='#B71C1C'>℟.</font> Buď pozdravené, pravé Kristovo telo, obetované za nás na kríži.<br>" +
        "<font color='#B71C1C'>℣.</font> Ježišu Kriste, ty si nám v Oltárnej sviatosti zanechal pamiatku tvojej smrti a zmŕtvychvstania.<br>" +
        "<font color='#B71C1C'>℟.</font> Buď pozdravené, pravé Kristovo telo, obetované za nás na kríži.<br>" +
        "<font color='#B71C1C'>℣.</font> Baránok Boží, ty snímaš hriechy sveta.<br>" +
        "<font color='#B71C1C'>℟.</font> Zmiluj sa nad nami.<br>" +
        "<font color='#B71C1C'>℣.</font> Baránok Boží, ty snímaš hriechy sveta.<br>" +
        "<font color='#B71C1C'>℟.</font> Zmiluj sa nad nami.<br>" +
        "<font color='#B71C1C'>℣.</font> Baránok Boží, ty snímaš hriechy sveta.<br>" +
        "<font color='#B71C1C'>℟.</font> Daruj nám pokoj."},
            {"red|small|justify","Kňaz v tichosti uloží Najsvätejšia sviatosť do svätostánku v kaplnke."},
    };

    String[][] vylozenie_sobota = {
            {"red|small|justify", "Po ranných chválach celebrant v albe alebo v superpelícii s fialovou štólou, prípadne aj vo fialovom pluviáli, ide s asistenciou k Božiemu hrobu, vyloží v monštrancii Najsvätejšiu sviatosť (monštrancia je zahalená bielym priesvitným závojom), kľakne si a chvíľu v tichosti adoruje.\n" +
        "Potom sa z veriacimi modlí:"},
            {"html", "<font color='#B71C1C'>℣.</font> Klaniame sa ti, Kriste, a dobrorečíme ti.<br>" +
        "<font color='#B71C1C'>℟.</font> Lebo si svojím krížom vykúpil svet.<br>" +
        "<font color='#B71C1C'>℣.</font> Pane, ja hľadám tvoju tvár.<br>" +
        "<font color='#B71C1C'>℟.</font> Pane, ja hľadám tvoju tvár.<br>" +
        "<font color='#B71C1C'>℣.</font> Čuj, Pane, hlas môjho volania, zľutuj sa nado mnou a vyslyš ma.<br>" +
        "<font color='#B71C1C'>℟.</font> Pane, ja hľadám tvoju tvár.<br>" +
        "<font color='#B71C1C'>℣.</font> V srdci mi znejú tvoje slová: Hľadajte jeho tvár!<br>" +
        "<font color='#B71C1C'>℟.</font> Pane, ja hľadám tvoju tvár.<br>" +
        "<font color='#B71C1C'>℣.</font> Ty si moja pomoc, neodvrhuj ma, ani ma neopúšťaj. Bože, moja spása.<br>" +
        "<font color='#B71C1C'>℟.</font> Pane, ja hľadám tvoju tvár.<br>" +
        "<font color='#B71C1C'>℣.</font> Verím, že uvidím dobrodenia Pánove v krajine žijúcich.<br>" +
        "<font color='#B71C1C'>℟.</font> Pane, ja hľadám tvoju tvár."},
    };

    String[][] ukoncenie_sobota = {
            {"red|small|justify", "Pred slávením Veľkonočnej vigílie sa ukončí poklona v Božom hrobe. \n" +
                    "V stanovenú hodinu celebrant oblečený v albe alebo v superpelícii s fialovou štólou príde k Božiemu hrobu, kľakne si pred Oltárnou sviatosťou a chvíľu sa ticho modlí. Potom s prítomnými recituje vešpery Bielej soboty alebo aspoň prosby z nich."},
            {"justify", "Úprimne sa klaňajme nášmu Vykupiteľovi, ktorý bol za nás umučený a pochovaný, aby vstal z mŕtvych, a pokorne ho vzývajme:"},
            {"italic", "Pane, zmiluj sa nad nami."},
            {"html", "Pane Ježišu, zo svojho boku, prebodnutého kopijou, si vylial krv a vodu, obdivuhodné tajomstvo celej Cirkvi;<br>" +
                    "<font color='#B71C1C'>–</font> svojou smrťou, pochovaním a zmŕtvychvstaním oživuj túto svoju tajomnú Nevestu.<br>" +
                    "Pane Ježišu, spomenul si si na tých, čo zabudli na tvoje prisľúbenia, že vstaneš z mŕtvych;<br>" +
                    "<font color='#B71C1C'>–</font> nezabudni ani na tých, čo nevedia o tvojom zmŕtvychvstaní a žijú bez nádeje.<br>" +
                    "Baránok Boží, ty si bol obetovaný za všetkých ako náš veľkonočný Baránok;<br>" +
                    "<font color='#B71C1C'>–</font> pritiahni k sebe všetkých ľudí.<br>" +
                    "Pane, v tvojej ruke je celý svet, a predsa si sa nechal zavrieť do hrobu;<br>" +
                    "<font color='#B71C1C'>–</font> vysloboď ľudstvo z moci pekla a daruj mu slávu nesmrteľnosti.<br>" +
                    "Kriste, Syn živého Boha, ty si z kríža zločincovi otvoril bránu raja;<br>" +
                    "<font color='#B71C1C'>–</font> pridruž k sláve svojho zmŕtvychvstania zosnulých, čo sa ti stali podobnými v smrti a pochovaní."},
            {"red|small|justify", "Namiesto Modlitby Pána a záverečnej modlitby kňaz povie:"},
            {"html", "Tomu, čo sedí na tróne, a Baránkovi dobrorečenie a česť, sláva a moc na veky vekov.<br>" +
                    "<font color='#B71C1C'>℟.</font>Amen."},
            {"red|small|justify", "Potom celebrant vyberie hostiu z monštrancie a uloží ju do svätostánku. Socha Krista ležiaceho v hrobe sa prikryje bielou plachtou a zhasnú sa všetky svetlá okrem lampy pred svätostánkom."}
    };

    String[][] citanie1_sobota = {
            {"separated", "red", "PRVÉ ČÍTANIE", "Gn 1, 1 – 2, 2"},
            {"italic|center", "Boh videl všetko, čo urobil, a bolo to veľmi dobré"},
            {"html|justify", "Čítanie z Knihy Genezis<br>" +
                    "Na počiatku stvoril Boh nebo a zem. Ale zem bola pustá a prázdna, tma bola nad priepasťou a duch Boží sa vznášal nad vodami.<br>" +
                    "Boh povedal: „Buď svetlo!“ A bolo svetlo. Boh videl, že svetlo je dobré, a oddelil svetlo od tmy. Svetlo nazval Dňom a tmu Nocou. A nastal večer a ráno, prvý deň.<br>" +
                    "Boh povedal: „Nech je obloha uprostred vôd a nech oddeľuje vody od vôd.“ Boh urobil oblohu a oddelil vody pod oblohou od vôd nad oblohou. A tak sa stalo. A Boh nazval oblohu Nebom. A nastal večer a ráno, druhý deň.<br>" +
                    "Boh povedal: „Vody pod nebom nech sa zhromaždia na jedno miesto a nech sa ukáže súš.“ A tak sa stalo. Boh nazval súš Zemou a masy vôd nazval Morom. A Boh videl, že je to dobré.<br>" +
                    "Ďalej Boh povedal: „Zem nech vyženie zelené rastliny: rastliny prinášajúce semeno a ovocné stromy prinášajúce plody podľa svojho druhu a v nich nech je semeno na zemi.“ A tak sa stalo. Zem vyhnala zelené rastliny, rastliny prinášajúce semeno podľa svojho druhu i stromy prinášajúce plody a v nich semená podľa svojho druhu. A Boh videl, že je to dobré. A nastal večer a ráno, tretí deň.<br>" +
                    "Boh povedal: „Nech sú svetlá na nebeskej oblohe a nech oddeľujú deň od noci, nech sú znamením období, dní a rokov, nech svietia na nebeskej oblohe a nech osvetľujú zem.“ A tak sa stalo. Boh urobil dvoje veľkých svetiel: väčšie svetlo, žeby vládlo vo dne, a menšie svetlo, žeby vládlo v noci, a hviezdy. Umiestil ich na nebeskej oblohe, aby svietili na zem a vládli vo dne v noci a oddeľovali svetlo od tmy. A Boh videl, že je to dobré. A nastal večer a ráno, štvrtý deň.<br>" +
                    "Boh povedal: „Nech sa vody hemžia živými tvormi a vtáky nech lietajú ponad zem na nebeskej oblohe.“ A Boh stvoril veľryby a všetky živé tvory, ktoré sa hýbu a hemžia vo vodách, podľa svojho druhu, i všetky vtáky podľa svojho druhu. A Boh videl, že je to dobré. Boh ich požehnal a povedal: „Vzrastajte, rozmnožujte sa a naplňte morské vody; aj vtáky nech sa rozmnožujú na zemi.“ A nastal večer a ráno, piaty deň.<br>" +
                    "Boh povedal: „Zem nech vydá všetky druhy živých bytostí: dobytok, plazy a divú zver podľa svojho druhu.“ A tak sa stalo. Boh urobil divú zver podľa svojho druhu, dobytok podľa svojho druhu i všetky druhy zemských plazov. A Boh videl, že je to dobré.<br>" +
                    "Potom Boh povedal: „Urobme človeka na náš obraz, na našu podobu. Nech vládnu nad morskými rybami a nad nebeským vtáctvom, nad zverinou i nad celou zemou; nad všetkými plazmi, čo sa hýbu po zemi.“ A stvoril Boh človeka na svoj obraz; na Boží obraz ho stvoril, muža a ženu ich stvoril. Boh ich požehnal a povedal im: „Vzrastajte a množte sa. Naplňte zem a podmaňte si ju. Panujte nad morskými rybami, nad nebeským vtáctvom a nad všetkou zverou, čo sa hýbe na zemi.“<br>" +
                    "Potom Boh povedal: „Hľa, dávam vám všetky semenné rastliny na zemi a všetky stromy s ich ovocím, v ktorom je semeno, aby vám boli za pokrm. A všetkým živočíchom zeme, všetkému nebeskému vtáctvu i všetkému, čo sa hýbe na zemi a má v sebe život, dávam za pokrm všetky zelené rastliny.“ A tak sa stalo. A Boh videl všetko, čo urobil; a bolo to veľmi dobré. A nastal večer a ráno, šiesty deň.<br>" +
                    "Takto boli dokončené nebo a zem i všetka ich nádhera. Siedmeho dňa Boh ukončil dielo, ktoré konal, a v siedmy deň si odpočinul po všetkých dielach, čo vytvoril.<br>" +
                    "Počuli sme Božie slovo."},
                    {"separated", "red", "Alebo kratšie:", "Gn 1, 1. 26-31a"},
            {"italic|center","Na počiatku stvoril Boh nebo a zem."},
            {"html|justify", "Čítanie z Knihy Genezis<br>" +
                    "Potom Boh povedal: „Urobme človeka na náš obraz, na našu podobu. Nech vládnu nad morskými rybami a nad nebeským vtáctvom, nad zverinou i nad celou zemou; nad všetkými plazmi, čo sa hýbu po zemi.“ A stvoril Boh človeka na svoj obraz; na Boží obraz ho stvoril, muža a ženu ich stvoril.<br>" +
                    "Boh ich požehnal a povedal im: „Vzrastajte a množte sa. Naplňte zem a podmaňte si ju. Panujte nad morskými rybami, nad nebeským vtáctvom a nad všetkou zverou, čo sa hýbe na zemi.“ Potom Boh povedal: „Hľa, dávam vám všetky semenné rastliny na zemi a všetky stromy s ich ovocím, v ktorom je semeno, aby vám boli za pokrm. A všetkým živočíchom zeme, všetkému nebeskému vtáctvu i všetkému, čo sa hýbe na zemi a má v sebe život, dávam za pokrm všetky zelené rastliny.“ A tak sa stalo. A Boh videl všetko, čo urobil; a bolo to veľmi dobré.<br>" +
                    "Počuli sme Božie slovo."},
            {"separated", "red","RESPONZÓRIOVÝ ŽALM", "Ž 104, 1-2a. 5-6. 10+12. 13-14b. 24+35c"},
            {"html","<font color='#B71C1C'>R.:</font> Pane, zošli svojho Ducha a obnov tvárnosť zeme.<br>" +
                    "<br>" +
                    "Dobroreč, duša moja, Pánovi; <font color='#B71C1C'>*</font><br>" +
                    "Pane, Bože môj, ty si nesmierne veľký.<br>" +
                    "Odel si sa do slávy a veleby, <font color='#B71C1C'>*</font><br>" +
                    "do svetla si sa zahalil ako do rúcha. <font color='#B71C1C'>R.</font><br>" +
                    "Zem si postavil na jej základoch, <font color='#B71C1C'>*</font><br>" +
                    "nevychýli sa nikdy-nikdy.<br>" +
                    "Oceán ju prikryl sťa odev, <font color='#B71C1C'>*</font><br>" +
                    "nad vrchmi vody zastali. <font color='#B71C1C'>R.</font><br>" +
                    "Prameňom dávaš stekať do potokov, <font color='#B71C1C'>*</font><br>" +
                    "čo tečú pomedzi vrchy.<br>" +
                    "Popri nich hniezdi nebeské vtáctvo, <font color='#B71C1C'>*</font><br>" +
                    "spomedzi konárov zaznieva ich pieseň. <font color='#B71C1C'>R.</font><br>" +
                    "Zo svojich komnát zvlažuješ vrchy, <font color='#B71C1C'>*</font><br>" +
                    "plodmi svojich diel sýtiš zem.<br>" +
                    "Tráve dávaš rásť pre ťažný dobytok <font color='#B71C1C'>*</font><br>" +
                    "a byli, aby slúžila človeku. <font color='#B71C1C'>R.</font><br>" +
                    "Aké mnohoraké sú tvoje diela, Pane! <font color='#B71C1C'>*</font><br>" +
                    "Všetko si múdro urobil.<br>" +
                    "Zem je plná tvojho stvorenstva. <font color='#B71C1C'>*</font><br>" +
                    "Dobroreč, duša moja, Pánovi. <font color='#B71C1C'>R.</font>"},
             {"separated", "red", "Alebo kratšie:", "Ž 33, 4-5. 6-7. 12-13. 20+22"},
            {"html", "<font color='#B71C1C'>R.:</font> Milosti Pánovej plná je zem.<br>" +
                    "<br>" +
                    "Pánovo slovo je pravdivé <font color='#B71C1C'>*</font><br>" +
                    "a verné všetko jeho konanie.<br>" +
                    "Miluje spravodlivosť a právo; <font color='#B71C1C'>*</font><br>" +
                    "milosti Pánovej plná je zem. <font color='#B71C1C'>R.</font><br>" +
                    "Pánovým slovom povstali nebesia <font color='#B71C1C'>*</font><br>" +
                    "a dychom jeho úst všetky ich voje.<br>" +
                    "Ako do vreca hromadí morské vody, <font color='#B71C1C'>*</font><br>" +
                    "ako do nádrží zlieva oceány. <font color='#B71C1C'>R.</font><br>" +
                    "Blažený národ, ktorého Bohom je Pán, <font color='#B71C1C'>*</font><br>" +
                    "blažený ľud, ktorý si on vyvolil za dedičstvo.<br>" +
                    "Pán hľadí z neba <font color='#B71C1C'>*</font><br>" +
                    "a vidí všetkých ľudí. <font color='#B71C1C'>R.</font><br>" +
                    "Naša duša očakáva Pána, <font color='#B71C1C'>*</font><br>" +
                    "on je naša pomoc a ochrana.<br>" +
                    "Tvoje milosrdenstvo, Pane, nech je nad nami, <font color='#B71C1C'>*</font><br>" +
                    "ako dúfame v teba. <font color='#B71C1C'>R.</font>"}
};

    String[][] citanie2_sobota = {
            {"separated", "red","DRUHÉ ČÍTANIE", "Gn 22, 1-18"},
                    {"italic|center","Obeta nášho praotca Abraháma"},
                            {"html|justify","Čítanie z Knihy Genezis<br>" +
                            "Boh skúšal Abraháma a povedal mu: „Abrahám!“<br>" +
                            "On odpovedal: „Tu som.“<br>" +
                            "Boh hovoril: „Vezmi svojho jediného syna Izáka, ktorého miluješ, choď do krajiny Moria a obetuj ho tam ako zápalnú obetu na vrchu, ktorý ti ukážem.“<br>" +
                            "Abrahám vstal ešte za noci, osedlal osla, vzal so sebou dvoch sluhov a svojho syna Izáka, naštiepal dreva na zápalnú obetu a vybral sa na miesto, ktoré mu Boh označil.<br>" +
                            "Keď na tretí deň Abrahám zdvihol oči, zďaleka uzrel to miesto a povedal svojim sluhom: „Čakajte tu s oslom. Ja a chlapec pôjdeme až ta, pokloníme sa a vrátime sa k vám.“ Potom Abrahám vzal drevo na zápalnú obetu a naložil ho na svojho syna Izáka. Sám niesol v rukách oheň a nôž.<br>" +
                            "Ako išli sami dvaja, vravel Izák svojmu otcovi Abrahámovi: „Otče!“<br>" +
                            "On mu povedal: „Čo chceš, syn môj?“<br>" +
                            "„Pozri,“ hovorí Izák, „oheň a drevo je tu, a baránok na zápalnú obetu je kde?“<br>" +
                            "Abrahám odvetil: „Boh si zaobstará baránka na obetu, syn môj.“ A vedno šli ďalej.<br>" +
                            "Keď došli na miesto, ktoré mu ukázal Boh, Abrahám postavil oltár, poukladal naň drevo, zviazal svojho syna Izáka a položil ho na oltár, na drevo. Potom Abrahám vystrel ruku, vzal nôž a chcel obetovať svojho syna. Ale vtom naň zavolal anjel Pána z neba: „Abrahám, Abrahám!“<br>" +
                            "On odpovedal: „Tu som.“<br>" +
                            "Anjel mu povedal: „Nevzťahuj svoju ruku na chlapca a neublíž mu! Teraz viem, že sa bojíš Boha, veď si mi neodoprel svojho jediného syna.“<br>" +
                            "Abrahám zdvihol oči a uzrel barana zachyteného rohami v kroví. Vzal ho a obetoval namiesto svojho syna ako zápalnú obetu. A toto miesto nazval: „Pán sa stará;“ a tak sa až podnes hovorí: „Na vrchu Pán sa stará.“<br>" +
                            "Anjel Pána znova zavolal z neba na Abraháma: „Na seba samého prisahám – taký je výrok Pána –: Pretože si toto urobil a neodoprel si mi svojho jediného syna, požehnám ťa a rozmnožím tvoje potomstvo ako hviezdy na nebi a ako piesok na brehu mora a tvoje potomstvo sa zmocní brán svojich nepriateľov. A pretože si poslúchol môj hlas, v tvojom potomstve budú požehnané všetky národy zeme.“<br>" +
                            "Počuli sme Božie slovo."},
                    {"separated", "red","Alebo kratšie:", "Gn 22, 1-2. 9a. 10-13. 15-18"},
                            {"italic|center","Obeta nášho praotca Abraháma"},
                                    {"html|justify","Čítanie z Knihy Genezis<br>" +
                            "Boh skúšal Abraháma a povedal mu: „Abrahám!“<br>" +
                            "On odpovedal: „Tu som.“<br>" +
                            "Boh hovoril: „Vezmi svojho jediného syna Izáka, ktorého miluješ, choď do krajiny Moria a obetuj ho tam ako zápalnú obetu na vrchu, ktorý ti ukážem.“<br>" +
                            "Keď došli na miesto, ktoré mu ukázal Boh, Abrahám postavil oltár a poukladal naň drevo. Potom vystrel ruku, vzal nôž a chcel obetovať svojho syna.<br>" +
                            "Ale vtom naň zavolal anjel Pána z neba: „Abrahám, Abrahám!“<br>" +
                            "On odpovedal: „Tu som.“<br>" +
                            "Anjel mu povedal: „Nevzťahuj svoju ruku na chlapca a neublíž mu! Teraz viem, že sa bojíš Boha, veď si mi neodoprel svojho jediného syna.“<br>" +
                            "Abrahám zdvihol oči a uzrel barana zachyteného rohami v kroví. Vzal ho a obetoval namiesto svojho syna ako zápalnú obetu.<br>" +
                            "Anjel Pána znova zavolal z neba na Abraháma: „Na seba samého prisahám – taký je výrok Pána –: Pretože si toto urobil a neodoprel si mi svojho jediného syna, požehnám ťa a rozmnožím tvoje potomstvo ako hviezdy na nebi a ako piesok na brehu mora a tvoje potomstvo sa zmocní brán svojich nepriateľov. A pretože si poslúchol môj hlas, v tvojom potomstve budú požehnané všetky národy zeme.“<br>" +
                            "Počuli sme Božie slovo."},
                            {"separated", "red","RESPONZÓRIOVÝ ŽALM", "Ž 16, 5+8. 9-10. 11"},
                                    {"html","<font color='#B71C1C'>R.:</font> Ochráň ma, Bože, k tebe sa utiekam.<br><br>" +
                            "Ty, Pane, si môj podiel na dedičstve a na kalichu, <font color='#B71C1C'>*</font><br>" +
                            "v tvojich rukách je môj osud.<br>" +
                            "Pána mám vždy pred očami; <font color='#B71C1C'>*</font><br>" +
                            "a pretože je po mojej pravici, nezakolíšem sa. <font color='#B71C1C'>R.</font><br>" +
                            "Preto sa raduje moje srdce <font color='#B71C1C'>†</font><br>" +
                            "a moja duša plesá <font color='#B71C1C'>*</font><br>" +
                            "aj moje telo odpočíva v nádeji.<br>" +
                            "Lebo nenecháš moju dušu v podsvetí <font color='#B71C1C'>*</font><br>" +
                            "a nedovolíš, aby tvoj svätý videl porušenie. <font color='#B71C1C'>R.</font><br>" +
                            "Ukážeš mi cestu života. <font color='#B71C1C'>†</font><br>" +
                            "U teba je plnosť radosti, <font color='#B71C1C'>*</font><br>" +
                            "po tvojej pravici večná slasť. <font color='#B71C1C'>R.</font>"},
    };

    String[][] citanie3_sobota = {
            {"separated", "red","TRETIE ČÍTANIE", "Ex 14,15 – 15, 1"},
                    {"italic|center","Izraeliti šli stredom mora po suchu"},
                            {"html|justify","Čítanie z Knihy Exodus<br>" +
                            "Pán povedal Mojžišovi: “Čo voláš ku mne? Povedz Izraelitom, aby sa pohli. Ty zdvihni svoju palicu a vystri ruku nad more a rozdeľ ho, aby Izraeliti mohli prejsť stredom mora ako po súši.<br>" +
                            "Ja zatvrdím srdce Egypťanov a budú sa hnať za nimi; a na faraónovi, na celom jeho vojsku, na jeho vozoch a jazde ukážem svoju slávu. Egypťania spoznajú, že ja som Pán, keď ukážem svoju slávu na faraónovi i na jeho vozoch a jazde.“<br>" +
                            "Tu sa Boží anjel, čo šiel pred izraelským táborom, zdvihol a išiel za ním. A s ním aj oblačný stĺp zmenil svoje doterajšie miesto – prešiel spredu zaň. Postavil sa medzi egyptský tábor a izraelský tábor. Oblak bol pre jedných temný, druhým osvetľoval noc, a tak sa celú noc nemohli jedni k druhým priblížiť.<br>" +
                            "Mojžiš vystrel ruku nad more a Pán ho celú noc prudkým horúcim vetrom rozháňal a vysúšal. Voda sa rozdelila a Izraeliti šli stredom mora po suchu, kým voda bola ako múr po ich pravici a ľavici. Egypťania ich prenasledovali. Všetky faraónove kone, vozy a jazdci sa pustili za nimi doprostred mora.<br>" +
                            "Ale v čase rannej stráže sa Pán pozrel z ohnivého a oblačného stĺpa na Egypťanov a ich vojsko uviedol do zmätku. Hamoval kolesá na ich vozoch, takže mohli len ťažko napredovať. Preto Egypťania hovorili: “Utekajme pred Izraelitmi, lebo Pán za nich bojuje proti nám.“<br>" +
                            "A Pán povedal Mojžišovi: “Vystri ruku nad more, aby sa vody vrátili na Egypťanov, na ich vozy a na ich jazdcov.“ Mojžiš vystrel ruku nad more a ono sa nad ránom vrátilo na svoje pôvodné miesto. Vody sa valili oproti utekajúcim Egypťanom a Pán ich prikryl vlnami uprostred mora. Vody sa vrátili a pokryli vozy i jazdcov celého faraónovho vojska, ktoré sa pustilo za Izraelitmi do mora. Ani jeden z nich neostal. No Izraeliti prešli stredom mora po suchu a voda bola ako múr po ich pravici a ľavici.<br>" +
                            "Takto Pán v ten deň vyslobodil Izrael z rúk Egypťanov. Videli mŕtvych Egypťanov na morskom brehu i mocnú ruku, ktorú Pán zdvihol proti nim. Ľud sa bál a uverili Pánovi i jeho služobníkovi Mojžišovi.<br>" +
                            "Vtedy Mojžiš a synovia Izraela zaspievali Pánovi túto pieseň:"},
                    {"separated", "red", "RESPONZÓRIOVÝ ŽALM", "Ex 15, 1b-2. 3-4. 5-6. 17-18"},
                            {"html", "<font color='#B71C1C'>R.:</font> Spievajme Pánovi, lebo sa preslávil.<br><br>" +
                            "Spievajme Pánovi, lebo sa preslávil: <font color='#B71C1C'>*</font><br>" +
                            "koňa i jazdca zmietol do mora.<br>" +
                            "Pán je moja sila a moja udatnosť, <font color='#B71C1C'>*</font><br>" +
                            "on ma zachránil.<br>" +
                            "On je môj Boh, chcem ho velebiť; <font color='#B71C1C'>*</font><br>" +
                            "Boh môjho otca, budem ho chváliť. <font color='#B71C1C'>R.</font><br>" +
                            "Pán je ako bojovník; <font color='#B71C1C'>*</font><br>" +
                            "Jahve je jeho meno.<br>" +
                            "Faraónove vozy a jeho vojsko zmietol do mora; <font color='#B71C1C'>*</font><br>" +
                            "jeho najlepší bojovníci utonuli v Červenom mori. <font color='#B71C1C'>R.</font><br>" +
                            "Vlny ich pokryli; <font color='#B71C1C'>*</font><br>" +
                            "sťa kameň klesli do hlbín.<br>" +
                            "Tvoja pravica, Pane, vyniká mocou, <font color='#B71C1C'>*</font><br>" +
                            "tvoja pravica, Pane, zasiahla nepriateľa. <font color='#B71C1C'>R.</font><br>" +
                            "Vovedieš ich a zasadíš na vrchu svojho dedičstva, <font color='#B71C1C'>*</font><br>" +
                            "v svojom bezpečnom príbytku, ktorý si ty, Pane, urobil;<br>" +
                            "vo svätyni, ktorej základy kládli tvoje ruky, Pane. <font color='#B71C1C'>*</font><br>" +
                            "Pán bude kraľovať naveky a navždy. <font color='#B71C1C'>R.</font>"},
    };

    String[][] citanie4_sobota = {
            {"separated", "red","ŠTVRTÉ ČITANIE", "Iz 54, 5-14"},
                    {"italic|center","Večným milosrdenstvom som sa nad tebou zmiloval, tvoj vykupiteľ, Pán"},
                            {"html|justify","Čítanie z Knihy proroka Izaiáša<br>" +
                            "Tvoj Stvoriteľ je tvojím ženíchom, “Pán zástupov“ je jeho meno. Svätý Izraela je tvoj vykupiteľ, “Bohom celej zeme“ sa nazýva.<br>" +
                            "Pán ťa povolal ako ženu opustenú a duchom sklesnutú, ako odvrhnutú ženu svojej mladosti, hovorí tvoj Boh. Na chvíľu krátku som ťa opustil, no s veľkou láskou si ťa pritiahnem. V návale hnevu skryl som nakrátko svoju tvár pred tebou, no večným milosrdenstvom som sa nad tebou zmiloval, hovorí tvoj vykupiteľ, Pán.<br>" +
                            "Je mi ako za dní Noema: keď som prisahal, že Noemove vody viac nezaplavia zem. Aj teraz prisahám, že sa už nebudem hnevať na teba, ani ťa viac karhať nebudem. Vrchy sa pohnú a kopce sa budú triasť, no moje milosrdenstvo neodstúpi od teba, moja zmluva pokoja sa neotrasie, hovorí Pán, ktorý sa zmilúva nad tebou.<br>" +
                            "Úbohá, vetrom zmietaná, bez akejkoľvek potechy, hľa, ja položím tvoje kamene na malachit a tvoje základy na zafíry, cimburie urobím z rubínu, tvoje brány budú z krištáľu a múry zo vzácnych kameňov.<br>" +
                            "Všetci tvoji synovia budú učeníkmi Pána a veľký pokoj budú požívať tvoji synovia. Základy budeš mať na spravodlivosti. Budeš ďaleko od utláčania, preto sa nemusíš báť, ďaleko od strachu, lebo sa k tebe nepriblíži.<br>" +
                            "Počuli sme Božie slovo."},
                    {"separated", "red","RESPONZÓRIOVÝ ŽALM", "Ž 30, 2+4. 5-6. 11-12a+13b"},
                            {"html","<font color='#B71C1C'>R.:</font> Budem ťa, Pane, oslavovať, že si ma vyslobodil.<br><br>" +
                            "Budem ťa, Pane, oslavovať, že si ma vyslobodil <font color='#B71C1C'>*</font><br>" +
                            "a že si nedovolil, aby sa moji nepriatelia radovali nado mnou.<br>" +
                            "Pane, vyviedol si ma z ríše zosnulých, <font color='#B71C1C'>*</font><br>" +
                            "navrátil si mi život, aby som nezostúpil do hrobu. <font color='#B71C1C'>R.</font><br>" +
                            "Na harfe hrajte Pánovi, jeho svätí, <font color='#B71C1C'>*</font><br>" +
                            "vzdávajte vďaky jeho menu svätému.<br>" +
                            "Lebo len chvíľku trvá jeho hnev, <font color='#B71C1C'>*</font><br>" +
                            "ale celý život jeho láskavosť.<br>" +
                            "Podvečer je nám hosťom plač <font color='#B71C1C'>*</font><br>" +
                            "a radosť nad ránom. <font color='#B71C1C'>R.</font><br>" +
                            "Čuj, Pane a zmiluj sa nado mnou; <font color='#B71C1C'>*</font><br>" +
                            "Pane, buď mi na pomoci.<br>" +
                            "Môj nárek si obrátil na tanec; <font color='#B71C1C'>*</font><br>" +
                            "Pane, Bože môj, naveky ťa chcem velebiť. <font color='#B71C1C'>R.</font>"},
    };

    String[][] citanie5_sobota = {
            {"separated", "red","PIATE ČÍTANIE", "Iz 55, 1-11"},
                    {"italic|center","Poďte k vodám: počúvajte a budete žiť"},
                            {"html|justify","Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán: “Poďte k vodám, všetci, čo ste smädní, nech príde aj ten, čo nemá peniaze. Kupujte chlieb a jedzte. Poďte, kupujte bez striebra, víno a mlieko bez platenia.<br>" +
                            "Prečo platíte striebrom za to, čo nie je chlieb, a driete za to, čo nesýti? Počúvajte mňa a budete jesť dobroty a budete sa kochať v jedlách vyberaných. Napnite svoj sluch a poďte ku mne, počúvajte a budete žiť. Uzavriem s vami večnú zmluvu, verný láske, ktorou som miloval Dávida. Hľa, ustanovil som ho za svedka pre ľudí, za knieža a vládcu národov. Budeš volať národ, ktorý nepoznáš; národy, ktoré ťa nepoznali, pribehnú k tebe kvôli Pánovi, tvojmu Bohu, a kvôli Svätému Izraela, lebo ťa oslávil.<br>" +
                            "Hľadajte Pána, kým ho možno nájsť, volajte ho, kým je nablízku. Nech zanechá bezbožný svoju cestu a zločinec svoje zámery, nech sa vráti k Pánovi a on sa nad ním zmiluje, k nášmu Bohu, lebo on veľkodušne odpúšťa. Lebo moje myšlienky nie sú vaše myšlienky a vaše cesty nie sú mojimi cestami, hovorí Pán. Lebo ako vysoko je nebo nad zemou, tak vysoko sú moje cesty nad vašimi cestami a moje myšlienky nad vašimi myšlienkami.<br>" +
                            "A ako z neba padá dážď a sneh a nevracia sa späť, lež napojí zem a zúrodní ju, aby z nej klíčilo, aby obdarovala rozsievača semenom a dala chlieb hladnému, tak bude so slovom, ktoré vychádza z mojich úst: nevráti sa ku mne naprázdno, ale vykoná všetko, čo chcem, a vydarí sa jeho poslanie.“<br>" +
                            "Počuli sme Božie slovo."},
                    {"separated", "red","RESPONZÓRIOVÝ ŽALM", "Iz 12, 2-3. 4b-d. 5-6"},
                            {"html","<font color='#B71C1C'>R.:</font> Čerpajme vodu s radosťou z prameňov spásy.<br><br>" +
                            "“Hľa, Boh je moja spása; <font color='#B71C1C'>*</font><br>" +
                            "dúfam a nebojím sa,<br>" +
                            "lebo moja sila a chvála je Pán, <font color='#B71C1C'>*</font><br>" +
                            "on sa mi stal záchrancom.“<br>" +
                            "Budete čerpať vodu s radosťou <font color='#B71C1C'>*</font><br>" +
                            "z prameňov spásy. <font color='#B71C1C'>R.</font><br>" +
                            "“Oslavujte Pána a vzývajte jeho meno, <font color='#B71C1C'>†</font><br>" +
                            "ohlasujte medzi národmi jeho zázraky, <font color='#B71C1C'>*</font><br>" +
                            "pamätajte, že jeho meno je vznešené. <font color='#B71C1C'>R.</font><br>" +
                            "Spievajte Pánovi, lebo urobil veľké veci; <font color='#B71C1C'>*</font><br>" +
                            "nech je to známe po celej zemi.<br>" +
                            "Plesaj a jasaj, obyvateľka Siona, <font color='#B71C1C'>*</font><br>" +
                            "lebo veľký uprostred teba je Svätý Izraela.“ <font color='#B71C1C'>R.</font>"},
    };

    String[][] citanie6_sobota = {
            {"separated", "red","ŠIESTE ČÍTANIE", "Bar 3, 9-15. 32 – 4, 4"},
                    {"italic|center","Choď za Pánovou žiarou"},
                            {"html|justify", "Čítanie z Knihy proroka Barucha<br>" +
                            "Počúvaj, Izrael, príkazy života, napnite sluch, aby ste sa naučili byť rozumnými. Čo je, Izrael? Čo je, že si v nepriateľskej krajine? Zostarel si v cudzej krajine, poškvrnil si sa mŕtvolami, pripočítaný si k tým, čo sú v podsvetí. Opustil si prameň múdrosti. Keby si bol kráčal po Božej ceste, bol by si býval v pokoji naveky. Nauč sa, kde je rozumnosť, kde je sila, kde je rozum, aby si vedel, aj kde je dlhý vek a život, kde je svetlo očí a pokoj. Kto našiel jej miesto? A kto vošiel do jej pokladníc?<br>" +
                            "Ale ten, ktorý vie všetko, pozná ju, vynašiel ju svojou rozumnosťou. Ten, ktorý založil zem na večný čas a naplnil ju štvornohými zvieratami. Ten, ktorý vysiela svetlo a ono ide, zavolal ho a ono ho s chvením poslúchlo. I hviezdy zažiarili na svojich strážach a potešili sa. Zavolal ich a povedali: “Tu sme!“ a veselo svietia tomu, ktorý ich vytvoril.<br>" +
                            "Toto je náš Boh a iného nemožno k nemu prirovnať. On našiel každú cestu k múdrosti a dal ju svojmu služobníkovi Jakubovi a svojmu miláčikovi Izraelovi. Potom sa zjavila na zemi a žila s ľuďmi.<br>" +
                            "Ona je knihou Božích prikázaní a zákonom, ktorý zostáva naveky. Všetci, ktorí sa jej držia, budú žiť, tí však, čo ju opúšťajú, zomrú.<br>" +
                            "Obráť sa, Jakub, a chop sa jej, choď za žiarou v jej svetle. Nedávaj svoju slávu inému a svoje hodnosti cudziemu národu.<br>" +
                            "Blahoslavení sme, Izrael, lebo my vieme, čo sa páči Bohu.<br>" +
                            "Počuli sme Božie slovo."},
                    {"separated", "red","RESPONZÓRIOVÝ ŽALM", "Ž 19, 8. 9. 10. 11"},
                            {"html","<font color='#B71C1C'>R.:</font> Pane, ty máš slová večného života.<br><br>" +
                            "Zákon Pánov je dokonalý, <font color='#B71C1C'>*</font><br>" +
                            "osviežuje dušu.<br>" +
                            "Svedectvo Pánovo je hodnoverné, <font color='#B71C1C'>*</font><br>" +
                            "dáva múdrosť maličkým. <font color='#B71C1C'>R.</font><br>" +
                            "Rozhodnutia Pánove sú správne, <font color='#B71C1C'>*</font><br>" +
                            "potešujú srdce.<br>" +
                            "Prikázania Pánove sú jasné, <font color='#B71C1C'>*</font><br>" +
                            "osvecujú oči. <font color='#B71C1C'>R.</font><br>" +
                            "Bázeň pred Pánom je úprimná, <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky.<br>" +
                            "Výroky Pánove sú pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a všetky spravodlivé. <font color='#B71C1C'>R.</font><br>" +
                            "Vzácnejšie sú než zlato, <font color='#B71C1C'>*</font><br>" +
                            "než veľký drahokam,<br>" +
                            "sladšie sú než med, <font color='#B71C1C'>*</font><br>" +
                            "než medové kvapky z plástu. <font color='#B71C1C'>R.</font>"},
    };

    String[][] ccitanie7_sobota = {
            {"separated", "red","SIEDME ČÍTANIE", "Ez 36, 16-17a. 18-28"},
                    {"italic|center","Vylejem na vás čistú vodu a dám vám nové srdce"},
                            {"html|justify", "Čítanie z Knihy proroka Ezechiela<br>" +
                            "Pán prehovoril ku mne takto: “Syn človeka, Izraelov dom býval na svojej pôde a poškvrnil ju svojím správaním a svojimi skutkami. Preto som na nich vylial svoj hnev: pre krv, ktorú vylievali po zemi, a poškvrnili ju svojimi modlami. Roztrúsil som ich medzi národy a rozptýlení sú po krajinách. Podľa ich správania a podľa ich skutkov som ich odsúdil.<br>" +
                            "Išli medzi národy a všade, kam sa dostali, zhanobili moje sväté meno, lebo sa o nich vravelo: ‚Toto je Pánov ľud a musel vyjsť zo svojej krajiny.'<br>" +
                            "A mne záleží na mojom svätom mene, ktoré zhanobil dom Izraela medzi národmi, ku ktorým prišli.<br>" +
                            "Preto povedz Izraelovmu domu: Toto hovorí Pán, Boh: Nie kvôli vám budem konať, dom Izraela, ale z úcty k svojmu svätému menu, ktoré ste hanobili medzi národmi, ku ktorým ste prišli.<br>" +
                            "Posvätím svoje veľké meno, zneuctené medzi národmi, ktoré ste uprostred nich hanobili. A národy spoznajú, že ja som Pán, keď na vás pred ich očami ukážem, že som svätý, – hovorí Pán, Boh.<br>" +
                            "Vezmem vás spomedzi národov, zhromaždím vás zo všetkých krajín a zavediem vás do vlastnej krajiny. Potom na vás vylejem čistú vodu a budete očistení od všetkej špiny. Od všetkých vašich modiel vás očistím.<br>" +
                            "Dám vám nové srdce a vložím do vás nového ducha. Odstránim z vášho tela srdce kamenné a dám vám srdce z mäsa. Vložím do vás svojho ducha a spôsobím, že budete kráčať podľa mojich príkazov, že budete zachovávať a plniť moje výroky.<br>" +
                            "Budete bývať v krajine, ktorú som dal vašim otcom, budete mojím ľudom a ja budem vaším Bohom.“<br>" +
                            "Počuli sme Božie slovo.",},
                    {"separated", "red","RESPONZÓRIOVÝ ŽALM", "Ž 42, 3. 5b-e; 43, 3. 4"},
                            {"html", "<font color='#B71C1C'>R.:</font> Ako jeleň dychtí za vodou z prameňa, tak moja duša, Bože, túži za tebou.<br><br>" +
                            "Po Bohu žízni moja duša, po Bohu živom; <font color='#B71C1C'>*</font><br>" +
                            "kedyže už prídem k nemu a uzriem Božiu tvár? <font color='#B71C1C'>R.</font><br>" +
                            "Veď som putoval ku vznešenému stánku <font color='#B71C1C'>*</font><br>" +
                            "a vstupoval do domu Božieho<br>" +
                            "s radostným plesaním a s piesňou ďakovnou <font color='#B71C1C'>*</font><br>" +
                            "uprostred zástupov sláviacich sviatky. <font color='#B71C1C'>R.</font><br>" +
                            "Zošli svoje svetlo a svoju pravdu; <font color='#B71C1C'>†</font><br>" +
                            "ony nech ma sprevádzajú <font color='#B71C1C'>*</font><br>" +
                            "a privedú na tvoj svätý vrch a do tvojich stánkov. <font color='#B71C1C'>R.</font><br>" +
                            "I pristúpim k Božiemu oltáru, <font color='#B71C1C'>†</font><br>" +
                            "k Bohu, ktorý ma napĺňa radosťou i plesaním, <font color='#B71C1C'>*</font><br>" +
                            "a citarou ťa, Bože, môj Bože, zvelebím. <font color='#B71C1C'>R.</font>"},
            {"BAR"},
            {"red|small", "Keď sa slávi krst:"},
                            {"separated", "red","RESPONZÓRIOVÝ ŽALM", "Iz 12, 2-3. 4b-d. 5-6."},
                                    {"html","<font color='#B71C1C'>R.:</font> Čerpajme vodu s radosťou z prameňov spásy.<br><br>" +
                            "“Hľa, Boh je moja spása; <font color='#B71C1C'>*</font><br>" +
                            "dúfam a nebojím sa,<br>" +
                            "lebo moja sila a chvála je Pán, <font color='#B71C1C'>*</font><br>" +
                            "on sa mi stal záchrancom.“<br>" +
                            "Budete čerpať vodu s radosťou <font color='#B71C1C'>*</font><br>" +
                            "z prameňov spásy. <font color='#B71C1C'>R.</font><br>" +
                            "“Oslavujte Pána a vzývajte jeho meno, <font color='#B71C1C'>†</font><br>" +
                            "ohlasujte medzi národmi jeho zázraky, <font color='#B71C1C'>*</font><br>" +
                            "pamätajte, že jeho meno je vznešené. <font color='#B71C1C'>R.</font><br>" +
                            "Spievajte Pánovi, lebo urobil veľké veci; <font color='#B71C1C'>*</font><br>" +
                            "nech je to známe po celej zemi.<br>" +
                            "Plesaj a jasaj, obyvateľka Siona, <font color='#B71C1C'>*</font><br>" +
                            "lebo veľký uprostred teba je Svätý Izraela.“ <font color='#B71C1C'>R.</font>"},
            {"BAR"},
                            {"separated", "red","Alebo:", "Ž 51, 12-13. 14-15. 18-19"},
                                    {"html","<font color='#B71C1C'>R.:</font> Bože, stvor vo mne srdce čisté.<br><br>" +
                            "Bože, stvor vo mne srdce čisté <font color='#B71C1C'>*</font><br>" +
                            "a v mojom vnútri obnov ducha pevného.<br>" +
                            "Neodvrhuj ma spred svojej tváre <font color='#B71C1C'>*</font><br>" +
                            "a neodnímaj mi svojho ducha svätého. <font color='#B71C1C'>R.</font><br>" +
                            "Navráť mi radosť z tvojej spásy <font color='#B71C1C'>*</font><br>" +
                            "a posilni ma duchom veľkej ochoty.<br>" +
                            "Poučím blúdiacich o tvojich cestách <font color='#B71C1C'>*</font><br>" +
                            "a hriešnici sa k tebe obrátia. <font color='#B71C1C'>R.</font><br>" +
                            "Veď ty nemáš záľubu v obete, <font color='#B71C1C'>*</font><br>" +
                            "ani žertvu neprijmeš odo mňa.<br>" +
                            "Obetou Bohu milou je duch skrúšený; <font color='#B71C1C'>*</font><br>" +
                            "Bože, ty nepohŕdaš srdcom skrúšeným a poníženým. <font color='#B71C1C'>R.</font>"}
    };
}
