package sk.missa.interfaces;

/*
 * Modlitby na sviatky svätých uložené v dvojrozmerných poliach za každý mesiac: modlitba1, modlitba2, modlitba3...
 * {ID sviatku (podľa mesiacov v interface Svatci), modlitba dňa, modlitba nad obetnými darmi, modlitba po prijímaní},
 * Modlitby pre pohyblivé sviatky: modlitbaPohyb
 * {ID sviatku (podľa interface Svatci), cirkevný rok (A/B/C) , modlitba dňa, modlitba nad obetnými darmi, modlitba po prijímaní},
 *
 * Keďže sú modlitby v adventnom a vianočnom období viazané na deň, nachádzajú sa uložené v mesiaci, ktorému prislúchajú a s dňom ako ID
 */

public interface Modlitby_svatci {
    String[][] modlitbaPohyb = {
            {"6gkp", "", "Všemohúci Bože,<br>" +
                    "naplň nás svätou radosťou a vďačnosťou, <font color='#B71C1C'>*</font><br>" +
                    "lebo nanebovstúpenie tvojho Syna<br>" +
                    "je aj naším víťazstvom; <font color='#B71C1C'>—</font><br>" +
                    "pevne dúfame, že aj my,<br>" +
                    "ako údy jeho tela, vojdeme do večnej slávy,<br>" +
                    "kam nás predišiel on, naša Hlava.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože,<br>" +
                    "na slávnosť nanebovstúpenia tvojho Syna<br>" +
                    "pokorne ti prinášame túto obetu; <font color='#B71C1C'>*</font><br>" +
                    "dožič nám láskavo, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa týmto posvätným úkonom<br>" +
                    "aj my povzniesli k tebe. Skrze Krista, nášho Pána.", "Všemohúci a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "vo svojej dobrote dávaš nám už na zemi<br>" +
                    "prežívať nebeské tajomstvá; <font color='#B71C1C'>—</font><br>" +
                    "prosíme ťa, naplň naše srdcia vrúcnou túžbou<br>" +
                    "žiť s osláveným Kristom,<br>" +
                    "v ktorom naša ľudská prirodzenosť už prebýva u teba.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"2gkp", "", "Všemohúci a večný Bože,<br>" +
                    "v posvätnom okruhu päťdesiatich dní<br>" +
                    "sa podľa tvojej vôle zavŕšilo veľkonočné tajomstvo; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa,<br>" +
                    "mocou Ducha Svätého zjednoť všetky národy, <font color='#B71C1C'>—</font><br>" +
                    "aby ľudia rozličných jazykov spoločne<br>" +
                    "vyznávali tvoje meno.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech sa nad nami zaskvie jas tvojej slávy <font color='#B71C1C'>—</font><br>" +
                    "a Kristus, svetlo sveta,<br>" +
                    "nech Duchom Svätým posilní srdcia všetkých,<br>" +
                    "ktorí sa krstom znovuzrodili k novému životu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "posväť tieto obetné dary svojím Duchom <font color='#B71C1C'>*</font><br>" +
                    "a skrze ne udeľ Cirkvi pravú lásku, <font color='#B71C1C'>—</font><br>" +
                    "aby celému svetu horlivo ohlasovala spásu,<br>" +
                    "ku ktorej povolávaš všetky národy.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nám prijaté sviatostné dary pomáhajú, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ustavične planuli tým Duchom Svätým,<br>" +
                    "ktorým si zázračne naplnil svojich apoštolov.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"3gkp", "", "Všemohúci Bože,<br>" +
                    "tajomstvom dnešnej slávnosti<br>" +
                    "posväcuješ svoju Cirkev<br>" +
                    "vo všetkých krajinách a národoch; <font color='#B71C1C'>*</font><br>" +
                    "naplň celý svet darmi Ducha Svätého <font color='#B71C1C'>—</font><br>" +
                    "a v srdciach svojich veriacich<br>" +
                    "obnovuj aj teraz veľké skutky svojej lásky, <br>" +
                    "ktoré si konal pri prvom hlásaní evanjelia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, nebeský Otče, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nám Duch Svätý pomáhal<br>" +
                    "stále lepšie chápať tajomstvo tejto obety <font color='#B71C1C'>—</font><br>" +
                    "a priviedol nás k plnému poznaniu pravdy<br>" +
                    "podľa prisľúbenia Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov.", "Dobrotivý Otče,<br>" +
                    "ty štedro dávaš svojej Cirkvi nebeské dary; <font color='#B71C1C'>*</font><br>" +
                    "ochraňuj v nás svoju milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby dar Ducha Svätého ustavične pôsobil<br>" +
                    "v našich srdciach<br>" +
                    "a sviatostný pokrm zveľaďoval<br>" +
                    "v nás dielo večnej spásy.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"0gkp", "", "Všemohúci Bože,<br>" +
                    "ty si svojho Syna a jeho panenskú matku<br>" +
                    "zveril vernej ochrane svätého Jozefa; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby tvoja Cirkev, pod ochranou Pánovho pestúna,<br>" +
                    "ustavične pracovala na spáse všetkých ľudí.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože Otče,<br>" +
                    "svätý Jozef oddane a s láskou slúžil tvojmu Synovi,<br>" +
                    "narodenému z Panny Márie; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme aj my verne a s čistým srdcom<br>" +
                    "vykonávali službu pri tvojom oltári.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "na slávnosť svätého Jozefa<br>" +
                    "zhromaždil si nás okolo svojho oltára<br>" +
                    "a nasýtil si nás sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "ustavične nás opatruj s otcovskou láskou<br>" +
                    "a zveľaďuj v nás svoje dary.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"1gkp", "", "Bože Otče,<br>" +
                    "ty si chcel, aby tvoj večný Syn<br>" +
                    "prijal ľudskú prirodzenosť v lone Panny Márie; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby všetci, ktorí ho vyznávajú<br>" +
                    "ako pravého Boha a pravého človeka,<br>" +
                    "mali účasť na jeho božskej prirodzenosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "láskavo prijmi dary svojej Cirkvi, <font color='#B71C1C'>*</font><br>" +
                    "ktorá vo vtelení tvojho jednorodeného Syna<br>" +
                    "vidí svoj počiatok; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme s radosťou slávili<br>" +
                    "toto hlboké tajomstvo Ježiša Krista,<br>" +
                    "ktorý žije a kraľuje na veky vekov.", "Prosíme ťa, dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech účasť na eucharistickej slávnosti<br>" +
                    "posilňuje v nás vieru v Ježiša Krista,<br>" +
                    "ktorý sa počal z Panny Márie, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy vyznávali,<br>" +
                    "že on je pravý Boh a pravý človek,<br>" +
                    "a mocou jeho zmŕtvychvstania dosiahli večnú radosť.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"2p", "", "Bože, milosrdný Otče,<br>" +
                    "tvoj jednorodený Syn, pribitý na kríži,<br>" +
                    "dal nám všetkým za matku<br>" +
                    "pre blahoslavenú Pannu Máriu; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby tvoja Cirkev s jej láskavou pomocou<br>" +
                    "zo dňa na deň rástla,<br>" +
                    "tešila sa zo svätosti svojich detí<br>" +
                    "a pritiahla do svojho náručia<br>" +
                    "všetky národy sveta.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože,<br>" +
                    "prijmi naše obetné dary<br>" +
                    "a premeň ich na sviatosť našej spásy; <font color='#B71C1C'>*</font><br>" +
                    "nech nás povzbudzuje sila tohto tajomstva<br>" +
                    "i láska Panny Márie, Matky Cirkvi, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa spolu s ňou<br>" +
                    "plnšie zapojili do diela vykúpenia.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "prijali sme záloh vykúpenia<br>" +
                    "a večného života; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby tvoja Cirkev<br>" +
                    "s materskou pomocou Panny Márie<br>" +
                    "ohlasovala evanjelium všetkým národom<br>" +
                    "a naplnila svet prejavmi Ducha Svätého.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"3gp", "", "Bože, ty si na svoju slávu<br>" +
                    "a na spásu ľudského pokolenia <br>" +
                    "ustanovil svojho jednorodeného Syna <br>" +
                    "za najvyššieho a večného kňaza, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby tí, ktorých si vyvolil<br>" +
                    "za vysluhovateľov a správcov tvojich tajomstiev, <font color='#B71C1C'>—</font><br>" +
                    "boli v sile Ducha Svätého <br>" +
                    "verní vo vykonávaní prijatej služby.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Náš prostredník Ježiš Kristus <font color='#B71C1C'>*</font><br>" +
                    "nech urobí tieto dary príjemnými tebe, Pane, <font color='#B71C1C'>—</font> <br>" +
                    "a nech nás zároveň<br>" +
                    "so sebou prinesie ako tebe milú obetu. <br>" +
                    "Lebo on žije a kraľuje na veky vekov.", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "nech nás oživuje božská obeta, <br>" +
                    "ktorú sme priniesli a prijali, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli večnou láskou spojení s tebou<br>" +
                    "a prinášali ovocie trvajúce naveky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"7gkp", "", "Bože, láskavý Otče,<br>" +
                    "ty si poslal na svet svojho Syna, večné Slovo pravdy,<br>" +
                    "a Ducha Svätého, Posvätiteľa, <font color='#B71C1C'>*</font><br>" +
                    "a tak si zjavil ľuďom<br>" +
                    "nevyspytateľné tajomstvo božského života; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme v duchu pravej viery<br>" +
                    "vyznávali slávu večnej Trojice<br>" +
                    "a klaňali sa jedinému všemohúcemu Bohu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "vzývame tvoje meno a vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "posväť tieto dary<br>" +
                    "a ich pôsobením premeň aj nás<br>" +
                    "na ustavičnú obetu pre teba.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "sviatosť, ktorú sme prijali,<br>" +
                    "a viera v jediného Boha<br>" +
                    "vo svätej a nerozdielnej Trojici osôb <font color='#B71C1C'>—</font><br>" +
                    "nech nám slúžia na spásu tela i duše.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"4gkp", "", "Pane Ježišu,<br>" +
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
            {"5gkp", "", "Všemohúci Bože,<br>" +
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
            {"4p", "", "Svätý Bože,<br>" +
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
            {"8gkp", "", "Všemohúci a večný Bože,<br>" +
                    "ty si rozhodol všetko obnoviť a zjednotiť<br>" +
                    "vo svojom milovanom Synovi,<br>" +
                    "Kráľovi neba i zeme; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sa všetko tvorstvo,<br>" +
                    "vyslobodené z otroctva hriechu,<br>" +
                    "podrobilo tvojej božskej moci<br>" +
                    "a bez prestania ťa oslavovalo. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "slávime obetu, ktorá zmierila ľudstvo s tebou, <font color='#B71C1C'>*</font>" +
                    "a pokorne prosíme, <font color='#B71C1C'>—</font>" +
                    "aby tvoj Syn udelil všetkým národom<br>" +
                    "dar jednoty a pokoja.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.", "Nebeský Otče,<br>" +
                    "s radosťou sme prijali chlieb večného života<br>" +
                    "a sme šťastní, že môžeme poslúchať Ježiša Krista,<br>" +
                    "Kráľa neba i zeme; <font color='#B71C1C'>*</font>" +
                    "dožič nám, prosíme, <font color='#B71C1C'>—</font>" +
                    "aby sme s ním naveky žili v nebeskom kráľovstve.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            //8. decembra - NEPOŠKVRNENÉ POČATIE PANNY MÁRIE
            {"9gkp", "", "Svätý Bože,<br>" +
                    "nepoškvrneným počatím Panny Márie<br>" +
                    "pripravil si dôstojný príbytok svojmu Synovi<br>" +
                    "a pre budúce zásluhy jeho smrti<br>" +
                    "uchránil si ju od každého hriechu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme na jej orodovanie<br>" +
                    "aj my prišli k tebe s čistým srdcom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, láskavo prijmi naše obetné dary<br>" +
                    "v deň slávnosti<br>" +
                    "Nepoškvrneného počatia Panny Márie,<br>" +
                    "ktorú si svojou milosťou<br>" +
                    "uchránil od každého hriechu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "osloboď nás na jej orodovanie<br>" +
                    "od všetkých previnení<br>" +
                    "a zachovaj nás vo svojej milosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "nech sviatosť, ktorú sme prijali,<br>" +
                    "zahojí v nás rany po prvotnom hriechu, <font color='#B71C1C'>*</font><br>" +
                    "pred ktorým si výnimočným spôsobom<br>" +
                    "uchránil Pannu Máriu, <font color='#B71C1C'>—</font><br>" +
                    "keď bola bez poškvrny počatá.<br>" +
                    "Skrze Krista, nášho Pána."},
            //  SVÄTEJ RODINY JEŽIŠA, MÁRIE A JOZEFA
            {"10gkp", "", "Nebeský Otče,<br>" +
                    "ty si nám dal Svätú rodinu ako žiarivý vzor; <font color='#B71C1C'>*</font><br>" +
                    "láskavo dopraj,<br>" +
                    "aby sme ju nasledovali vo vzájomnej láske<br>" +
                    "a v rodinných čnostiach, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli večnú blaženosť<br>" +
                    "v tvojom nebeskom domove.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš, prinášame ti zmiernu obetu <font color='#B71C1C'>*</font><br>" +
                    "a vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby si na orodovanie Panny Márie a svätého Jozefa<br>" +
                    "upevňoval naše rodiny v tvojej milosti<br>" +
                    "a v tvojom pokoji.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "ty nás posilňuješ pri sviatostnom stole; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám vytrvalo nasledovať<br>" +
                    "príklad Svätej rodiny, <font color='#B71C1C'>—</font><br>" +
                    "aby sme po útrapách tohto života<br>" +
                    "dosiahli večnú blaženosť<br>" +
                    "v jej spoločenstve.<br>" +
                    "Skrze Krista, nášho Pána."},
            //Nedeľa po 6. januári - KRST KRISTA PÁNA
            {"11gkp", "", "Všemohúci a večný Bože,<br>" +
                    "keď bol Ježiš Kristus pokrstený v Jordáne<br>" +
                    "a vznášal sa nad ním Duch Svätý,<br>" +
                    "slávnostne si vyhlásil,<br>" +
                    "že je tvojím milovaným Synom;*<br>" +
                    "pomáhaj nám, svojim deťom,<br>" +
                    "zrodeným z vody a Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                    "stále žiť podľa tvojej svätej vôle.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Láskavý Otče,<br>" +
                    "tvoj jednorodený Syn<br>" +
                    "prišiel medzi nás ako pravý človek<br>" +
                    "a bol nám navonok podobný; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa s pomocou jeho milosti<br>" +
                    "vnútorne stali podobnými jemu.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "na sviatok krstu tvojho milovaného Syna<br>" +
                    "prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby sa premenili<br>" +
                    "na telo a krv Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                    "ktorý láskavo zmyl hriechy sveta<br>" +
                    "a s tebou žije a kraľuje na veky vekov.", "Dobrotivý Bože,<br>" +
                    "posilnil si nás svojím slovom a chlebom života; <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám verne počúvať<br>" +
                    "tvojho milovaného Syna, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli tvojimi deťmi<br>" +
                    "nielen podľa mena, ale aj životom.<br>" +
                    "Skrze Krista, nášho Pána."},
    };

    String[][] modlitba1 = {
            {"01gk", "Večný Otče,<br>" +
                    "narodením tvojho Syna z Panny Márie<br>" +
                    "poskytol si ľuďom večnú spásu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme vždy pociťovali účinky jej orodovania,<br>" +
                    "veď skrze ňu sme dostali Pôvodcu života,<br>" +
                    "Ježiša Krista,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "ty láskavo začínaš a dovršuješ každé dobré dielo; <font color='#B71C1C'>*</font><br>" +
                    "na tento radostný sviatok Božej Matky<br>" +
                    "oslavujeme začiatok našej spásy <font color='#B71C1C'>—</font><br>" +
                    "a prosíme, aby sa v nás zavŕšila v plnej miere.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nadšene vyznávame, že blahoslavená Panna Mária<br>" +
                    "je Rodičkou tvojho Syna a Matkou Cirkvi, <font color='#B71C1C'>—</font><br>" +
                    "a prosíme, aby nám nebeský pokrm,<br>" +
                    "ktorý sme s radosťou prijali,<br>" +
                    "slúžil pre večný život.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"02a", "Láskavý Bože,<br>" +
                    "ty si osvietil svoju Cirkev<br>" +
                    "príkladom a náukou svätého Bazila a Gregora; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s pokorným srdcom prijali tvoju pravdu<br>" +
                    "a dôsledne ju dosvedčovali skutkami lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"06gk", "Všemohúci Bože,<br>" +
                    "ty si dnešného dňa svetlom hviezdy<br>" +
                    "zjavil svojho Syna národom; <font color='#B71C1C'>*</font><br>" +
                    "aj my sme ťa už poznali svetlom viery a prosíme,<br>" +
                    "priveď nás láskavo k sebe, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vo večnej blaženosti<br>" +
                    "mohli hľadieť na tvoju velebu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče,<br>" +
                    "zhliadni na dary svojej Cirkvi, <font color='#B71C1C'>*</font><br>" +
                    "ktorá ti neprináša zlato, kadidlo a myrhu,<br>" +
                    "ale Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                    "ktorý sa v týchto daroch<br>" +
                    "sprítomňuje, obetuje a nám dáva.<br>" +
                    "On s tebou žije a kraľuje na veky vekov.", "Prosíme ťa, Bože,<br>" +
                    "sprevádzaj nás vždy a všade nebeským svetlom, <font color='#B71C1C'>*</font><br>" +
                    "aby sme stále lepšie poznávali sviatosť,<br>" +
                    "na ktorej si nám doprial účasť, <font color='#B71C1C'>—</font><br>" +
                    "a prijímali ju so vzrastajúcou láskou.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"07", "Milosrdný Bože,<br>" +
                    "ty si udelil svätému kňazovi Rajmundovi<br>" +
                    "nevšednú lásku voči hriešnikom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "na jeho orodovanie zbav nás jarma hriechu,<br>" +
                    "aby sme so slobodným srdcom<br>" +
                    "ochotne plnili tvoju vôľu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"13", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám správne chápať a verne vyznávať<br>" +
                    "božstvo tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "ktoré tak neochvejne obhajoval svätý biskup Hilár.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"17", "Bože a Otče náš,<br>" +
                    "ty si vnukol svätému opátovi Antonovi,<br>" +
                    "aby ti slúžil obdivuhodným životom na púšti; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jeho orodovanie dopraj aj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme premáhali svoje sebectvo<br>" +
                    "a nadovšetko milovali teba.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Svätý Bože, nech sú ti príjemné naše dary,<br>" +
                    "ktoré pri spomienke na svätého Antona<br>" +
                    "s oddanosťou kladieme na oltár; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa nepripútali k pozemským veciam<br>" +
                    "a svoje bohatstvo hľadali iba v tebe.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, ty si dal svätému Antonovi silu<br>" +
                    "víťaziť nad mocnosťami temností; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, posilni nás spasiteľnou sviatosťou,<br>" +
                    "ktorú sme prijali, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my premáhali všetky nástrahy<br>" +
                    "nepriateľa našej spásy. Skrze Krista, nášho Pána."},
            {"20a", "Bože a Otče náš, ty si sláva Cirkvi<br>" +
                    "a sila jej duchovných pastierov; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme na orodovanie svätého<br>" +
                    "mučeníka Fabiána<br>" +
                    "rástli vo viere, ktorú on hrdinsky vyznával,<br>" +
                    "a podľa jeho príkladu oddane ti slúžili až do smrti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"20b", "Prosíme ťa, nekonečný Bože, <font color='#B71C1C'>*</font><br>" +
                    "udeľ nám ducha sily, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa príkladu slávneho<br>" +
                    "mučeníka Šebastiána<br>" +
                    "poslúchali viac teba ako ľudí.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"21", "Všemohúci a večný Bože,<br>" +
                    "ty si volíš, čo svet pokladá za slabé,<br>" +
                    "aby si zahanbil, čo je v očiach sveta mocné; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, dopraj nám vytrvať vo viere, <font color='#B71C1C'>—</font><br>" +
                    "ako nás k tomu povzbudzuje svätá Agnesa,<br>" +
                    "ktorej mučenícku smrť dnes oslavujeme.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"22", "Všemohúci a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo na nás zošli svojho Ducha,<br>" +
                    "aby v našich srdciach zavládla taká láska,<br>" +
                    "s akou svätý mučeník Vincent<br>" +
                    "pretrpel všetky telesné muky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
           /* 23. januára
            SV. JÁNA ALMUŽNÍKA
            {"", "Všemohúci Bože, ty si svätého biskupa<br>" +
                    "Jána Almužníka obdaril nevšednou láskou<br>" +
                    "voči biednym a núdznym; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomôž, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa vymanili z otroctva lakomstva<br>" +
                    "a ochotne konali skutky milosrdenstva.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, nech sú ti milé obetné dary,<br>" +
                    "ktoré prinášame na oltár; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "nauč nás správne hodnotiť pozemské veci,<br>" +
                    "aby nám neprekážali v úsilí<br>" +
                    "o duchovné dobrá.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "nech toto prijímanie roznieti v nás takú lásku, <font color='#B71C1C'>*</font><br>" +
                    "akou horel svätý Ján Almužník, <font color='#B71C1C'>—</font><br>" +
                    "keď všetok svoj majetok rozdal chudobným.<br>" +
                    "Skrze Krista, nášho Pána."},*/

            {"24", "Láskavý Bože,<br>" +
                    "ty si povolal svätého biskupa Františka,<br>" +
                    "aby sa v horlivosti za spásu duši<br>" +
                    "stal všetkým pre všetkých; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám<br>" +
                    "podľa jeho príkladu slúžiť bratom <font color='#B71C1C'>—</font><br>" +
                    "a sprítomňovať vo svete tvoju dobrotivú lásku.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "pre túto spásonosnú obetu<br>" +
                    "zapáľ v nás oheň Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                    "ktorým si urobil zo svätého Františka<br>" +
                    "vzor prívetivej láskavosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme posilnení touto sviatosťou<br>" +
                    "napodobňovali lásku a miernosť<br>" +
                    "svätého Františka v tomto živote <font color='#B71C1C'>—</font><br>" +
                    "a v nebi dosiahli večnú slávu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"25g", "Bože, spása všetkých národov,<br>" +
                    "apoštola Pavla si vyvolil,<br>" +
                    "aby ohlasoval radostné posolstvo pohanom ; <font color='#B71C1C'>*</font><br>" +
                    "dnes, keď slávime sviatok jeho obrátenia,<br>" +
                    "vrúcne ťa prosíme, posilňuj nás, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa jeho príkladu kráčali k tebe<br>" +
                    "a pred svetom vydávali svedectvo o tvojej pravde.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "nech nás Duch Svätý pri slávení tejto obety<br>" +
                    "prenikne svetlom viery, <font color='#B71C1C'>*</font><br>" +
                    "ktoré ustavične viedlo svätého Pavla apoštola, <font color='#B71C1C'>—</font><br>" +
                    "aby ohlasoval tvoju slávu medzi národmi.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "sviatostný pokrm, ktorý sme prijali,<br>" +
                    "nech v nás roznieti oheň lásky, <font color='#B71C1C'>—</font><br>" +
                    "ktorým horel svätý apoštol Pavol,<br>" +
                    "keď sa neúnavne staral<br>" +
                    "o všetky cirkevné spoločenstvá.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"26", "Dobrotivý Bože,<br>" +
                    "svätého Timoteja a Tita si ozdobil<br>" +
                    "čnosťami apoštolov; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám na ich orodovanie, <font color='#B71C1C'>—</font><br>" +
                    "aby sme nábožne a sväto žili na tomto svete,<br>" +
                    "a tak si zaslúžili dôjsť do nebeskej vlasti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"27", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás svätá panna Angela ustavične odporúča<br>" +
                    "tvojej otcovskej dobrote, <font color='#B71C1C'>—</font><br>" +
                    "aby sme nasledovaním jej lásky a múdrosti<br>" +
                    "ochotne prijali tvoje učenie<br>" +
                    "a vyznávali ho čnostným životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"28", "Bože, prameň všetkej múdrosti,<br>" +
                    "ty si urobil Tomáša Akvinského veľkým<br>" +
                    "na poli svätosti a posvätnej vedy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, osvieť nám myseľ,<br>" +
                    "aby sme chápali jeho náuku, <font color='#B71C1C'>—</font><br>" +
                    "a posilni nám vôľu,<br>" +
                    "aby sme nasledovali jeho čnosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"31", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "vo svätom kňazovi Jánovi Boskovi<br>" +
                    "dal si mládeži láskavého otca a učiteľa; <font color='#B71C1C'>—</font><br>" +
                    "prosíme ťa, zapáľ aj nás takou láskou,<br>" +
                    "akou horelo jeho srdce,<br>" +
                    "aby sme neúnavne hľadali duše<br>" +
                    "a vytrvalo slúžili iba tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
    };

    String[][] modlitba2 = {
            {"02g", "Všemohúci a večný Bože,<br>" +
                    "tvoj jednorodený Syn<br>" +
                    "prijal našu ľudskú prirodzenosť<br>" +
                    "a dnes ti bol obetovaný v chráme; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "obnov náš život a naše zmýšľanie,<br>" +
                    "aby sme aj my mohli s čistým srdcom<br>" +
                    "predstúpiť pred tvoju tvár.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Otče,<br>" +
                    "ty si chcel, aby sa tvoj jednorodený Syn<br>" +
                    "obetoval za spásu sveta<br>" +
                    "ako nepoškvrnený Baránok; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "prijmi láskavo aj tento obetný dar svojej Cirkvi,<br>" +
                    "ktorá ťa s radosťou oslavuje.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "ty si splnil Simeonovi prísľub,<br>" +
                    "že neumrie, kým neuzrie Spasiteľa sveta; <font color='#B71C1C'>*</font><br>" +
                    "upevňuj nás týmto sviatostným pokrmom<br>" +
                    "vo svojej milosti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme neochvejne kráčali v ústrety Pánovi<br>" +
                    "a dosiahli večný život.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"03a", "Pane a Bože náš, vypočuj svoj ľud,<br>" +
                    "ktorý ti v deň svätého biskupa a mučeníka Blažeja<br>" +
                    "prednáša svoje pokorné prosby: <font color='#B71C1C'>*</font><br>" +
                    "daruj nám pokoj a zdravie<br>" +
                    "a pomáhaj nám tak žiť v časnom živote, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dosiahli večnú spásu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"03b", "Svätý Bože, prameň spásy, <font color='#B71C1C'>*</font><br>" +
                    "ty si poslal svätého biskupa Oskára<br>" +
                    "ohlasovať Kristovu blahozvesť mnohým národom; <font color='#B71C1C'>—</font><br>" +
                    "na jeho orodovanie nám pomáhaj<br>" +
                    "ustavične kráčať vo svetle tvojej pravdy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"05", "Dobrotivý Bože, zmiluj sa nad nami <font color='#B71C1C'>*</font><br>" +
                    "a odpusť nám naše previnenia<br>" +
                    "na orodovanie svätej Agaty, panny a mučenice, <font color='#B71C1C'>—</font><br>" +
                    "ktorá ti bola milá pre panenský život<br>" +
                    "a pre svoje mučeníctvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"06", "Bože, posila všetkých mučeníkov,<br>" +
                    "ty si priviedol svätého Pavla a jeho spoločníkov<br>" +
                    "k večnému životu ich mučeníckou smrťou na kríži; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie daj nám silu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme statočne vyznávali vieru<br>" +
                    "a zachovali si ju až do smrti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"08a", "Bože Otče, prameň milosrdenstva,<br>" +
                    "ty si dal svätého Hieronyma<br>" +
                    "sirotám za otca a pomocníka; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme plnili záväzky svätého krstu,<br>" +
                    "v ktorom sme dostali ducha synovstva<br>" +
                    "a stali sme sa tvojimi deťmi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"10", "Vznešený Bože, <font color='#B71C1C'>*</font><br>" +
                    "pri spomienke na svätú pannu Školastiku<br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám, aby sme ti podľa jej príkladu<br>" +
                    "slúžili s nenarušenou oddanosťou,<br>" +
                    "a tak dosiahli blažený život,<br>" +
                    "ktorý nám pripravila tvoja láska.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"11", "Milosrdný Otče, <font color='#B71C1C'>*</font><br>" +
                    "s radosťou slávime pamiatku Panny Márie,<br>" +
                    "nepoškvrnenej matky tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a prosíme ťa, na jej orodovanie pomôž nám slabým<br>" +
                    "odvrátiť sa od hriechov,<br>" +
                    "konať pokánie a žiť novým životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"14o", "Všemohúci Bože,<br>" +
                    "ty si prostredníctvom svätých bratov Cyrila a Metoda<br>" +
                    "daroval slovanským národom svetlo evanjelia <font color='#B71C1C'>*</font><br>" +
                    "daj, nech s ochotným srdcom<br>" +
                    "prijímame slovo tvojho učenia, <font color='#B71C1C'>—</font><br>" +
                    "a urob z nás ľud zjednotený<br>" +
                    "v pravej viere a správnom vyznávaní.", "Zhliadni, Otče na dary <font color='#B71C1C'>*</font><br>" +
                    "ktoré ti pri spomienke na svätého Cyrila a Metoda<br>" +
                    "kladieme na oltár <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sa stali znamením nového ľudstva<br>" +
                    "zmiereného v láske.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože, Otec všetkých národov,<br>" +
                    "ty nás jedným chlebom robíš v jednom Duchu<br>" +
                    "spolustolujúcimi a dedičmi večnej hostiny; <font color='#B71C1C'>*</font><br>" +
                    "pri tejto slávnosti svätého Cyrila a Metoda<br>" +
                    "ťa prosíme: <font color='#B71C1C'>—</font><br>" +
                    "daj, aby množstvo tvojich synov a dcér<br>" +
                    "zotrvalo v tej istej viere<br>" +
                    "a jednomyseľne budovalo kráľovstvo<br>" +
                    "spravodlivosti a pokoja.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"14g+", "Všemohúci Bože,<br>" +
                    "ty si prostredníctvom svätých bratov Cyrila a Metoda<br>" +
                    "daroval slovanským národom svetlo evanjelia <font color='#B71C1C'>*</font><br>" +
                    "daj, nech s ochotným srdcom<br>" +
                    "prijímame slovo tvojho učenia, <font color='#B71C1C'>—</font><br>" +
                    "a urob z nás ľud zjednotený<br>" +
                    "v pravej viere a správnom vyznávaní.", "Zhliadni, Otče na dary <font color='#B71C1C'>*</font><br>" +
                    "ktoré ti pri spomienke na svätého Cyrila a Metoda<br>" +
                    "kladieme na oltár <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sa stali znamením nového ľudstva<br>" +
                    "zmiereného v láske.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože, Otec všetkých národov,<br>" +
                    "ty nás jedným chlebom robíš v jednom Duchu<br>" +
                    "spolustolujúcimi a dedičmi večnej hostiny; <font color='#B71C1C'>*</font><br>" +
                    "pri tejto slávnosti svätého Cyrila a Metoda<br>" +
                    "ťa prosíme: <font color='#B71C1C'>—</font><br>" +
                    "daj, aby množstvo tvojich synov a dcér<br>" +
                    "zotrvalo v tej istej viere<br>" +
                    "a jednomyseľne budovalo kráľovstvo<br>" +
                    "spravodlivosti a pokoja.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"17", "Dobrotivý Bože,<br>" +
                    "nábožne slávime pamiatku siedmich svätých bratov,<br>" +
                    "ktorým si vlial úprimnú lásku k Matke Božej<br>" +
                    "a pomáhal si im privádzať tvoj ľud bližšie k tebe; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "aj nám daj vrúcnu lásku k Panne Márii<br>" +
                    "a ustavičnú ochotu slúžiť ti v našich blížnych.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"21", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám nasledovať učenie a príklad<br>" +
                    "svätého biskupa Petra Damianiho, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vo všetkom dávali prednosť Kristovi,<br>" +
                    "oddane slúžili tvojej Cirkvi,<br>" +
                    "a tak došli do večnej radosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"22g", "Všemohúci Bože,<br>" +
                    "ty si vystavil svoju Cirkev na Petrovi,<br>" +
                    "ktorý vyznal vieru v tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "nedovoľ, aby bludy a búrlivé rozvraty<br>" +
                    "otriasli našou vierou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milostivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi modlitby a dary svojej Cirkvi,<br>" +
                    "ktorá má v Petrovi učiteľa neporušenej viery; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme pod jeho pastierskou ochranou<br>" +
                    "dosiahli večné dedičstvo. Skrze Krista, nášho Pána.", "Bože a Otče náš,<br>" +
                    "na sviatok svätého Petra apoštola<br>" +
                    "posilnil si nás telom a krvou svojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám toto stretnutie s naším Vykupiteľom<br>" +
                    "bolo prameňom jednoty a pokoja.<br>" +
                    "Skrze Krista, nášho Pána.<br>"},
            {"23", "Bože, Pán všetkého tvorstva,<br>" +
                    "ty si pridružil svätého biskupa Polykarpa<br>" +
                    "k zástupu mučeníkov; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor aj nám daj silu<br>" +
                    "piť z kalicha Kristovho utrpenia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mali účasť na sláve vzkriesenia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
    };

    String[][] modlitba3 = {
            {"04", "Všemohúci Bože,<br>" +
                    "tebe slúžiť znamená kraľovať; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, na orodovanie svätého Kazimíra, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti vytrvalo slúžili v spravodlivosti a svätosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"07", "Bože a Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "veľká láska k tebe<br>" +
                    "dala svätej Perpetue a Felicite silu<br>" +
                    "zvíťaziť nad trýzniteľmi a nad mukami;<br>" +
                    "pomáhaj nám na ich orodovanie, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my ustavične rástli v láske,<br>" +
                    "ktorá premáha všetok strach.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"08", "Dobrotivý Bože,<br>" +
                    "ty si naplnil srdce svätého Jána<br>" +
                    "milosrdenstvom voči chudobným a chorým; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, aj nám pomáhaj konať skutky lásky, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dosiahli miesto medzi vyvolenými<br>" +
                    "v tvojom kráľovstve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"09", "Všemohúci Bože,<br>" +
                    "ty si dal svojmu ľudu svätú Františku<br>" +
                    "za príklad manželského i rehoľného života; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, udeľ nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti v každom stave a povolaní<br>" +
                    "verne slúžili, žili v tvojej prítomnosti<br>" +
                    "a dali sa viesť svetlom tvojej pravdy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"17", "Večný Bože,<br>" +
                    "ty si poslal svätého biskupa Patrika<br>" +
                    "írskemu národu hlásať tvoju blahozvesť; <font color='#B71C1C'>*</font><br>" +
                    "pre jeho zásluhy a na jeho orodovanie<br>" +
                    "vzbuď misionárskeho ducha<br>" +
                    "vo všetkých kresťanoch, <font color='#B71C1C'>—</font><br>" +
                    "aby ohlasovali svetu obdivuhodné dielo tvojej lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"18", "Nekonečný Bože,<br>" +
                    "prostredníctvom svätého biskupa Cyrila<br>" +
                    "priviedol si svoju Cirkev<br>" +
                    "k hlbšiemu chápaniu tajomstiev spásy; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy lepšie poznávali tvojho Syna<br>" +
                    "a v ňom hľadali plnosť života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"23", "Milosrdný Bože, ty si zveľadil svoju Cirkev<br>" +
                    "apoštolskou horlivosťou svätého biskupa Turibia<br>" +
                    "a jeho láskou k pravde; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj kresťanskému ľudu<br>" +
                    "ustavične rásť vo viere a svätosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
    };

    String[][] modlitba4 = {
            {"02", "Bože, sláva ponížených,<br>" +
                    "ty si povýšil svätého Františka<br>" +
                    "do slávy svojich vyvolených; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, udeľ nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme nasledovali jeho príklad<br>" +
                    "a pre jeho zásluhy dosiahli odmenu,<br>" +
                    "prisľúbenú ľuďom tichého a pokorného srdca.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"04", "Bože, prameň všetkej múdrosti, <font color='#B71C1C'>*</font><br>" +
                    "v deň spomienky na svätého<br>" +
                    "Izidora pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "na jeho orodovanie na pomáhaj svoju Cirkev,<br>" +
                    "ktorú on obohatil svojou náukou a svätým životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"05", "Bože a Otče náš,<br>" +
                    "ty si dal svojej Cirkvi svätého kňaza Vincenta,<br>" +
                    "ktorý neúnavne hlásal evanjelium<br>" +
                    "a zdôrazňoval príchod tvojho Syna<br>" +
                    "ako večného Sudcu; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme bedlivo očakávali<br>" +
                    "deň Kristovho príchodu <font color='#B71C1C'>—</font><br>" +
                    "a v nebeskej blaženosti ho uzreli ako nášho Kráľa.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"07", "Dobrotivý Bože,<br>" +
                    "ty si vyvolil svätého kňaza Jána de la Salle,<br>" +
                    "aby viedol kresťanskú mládež po ceste spásy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "vzbuď vo svojej Cirkvi vychovávateľov,<br>" +
                    "ktorí by sa celým srdcom venovali mládeži<br>" +
                    "a vychovávali dobrých občanov a pravých kresťanov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"11", "Nekonečný Bože,<br>" +
                    "svätý biskup Stanislav<br>" +
                    "pre tvoju česť klesol<br>" +
                    "pod mečom prenasledovateľov; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa o milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli silní vo viere<br>" +
                    "a vytrvali v nej až do smrti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"13", "Všemohúci Bože,<br>" +
                    "svätému Martinovi, pápežovi a mučeníkovi,<br>" +
                    "dal si takú silu,<br>" +
                    "že ho nezastrašili ani hrozby ani muky; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, aj nás posilňuj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s nezlomným duchom<br>" +
                    "znášali všetky protivenstvá.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"21", "Nekonečný Bože,<br>" +
                    "svätému biskupovi Anzelmovi si udelil dar<br>" +
                    "prenikať do hlbín tvojich tajomstiev<br>" +
                    "a ohlasovať ich tvojmu ľudu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj, nech viera napomáha náš rozum, <font color='#B71C1C'>—</font><br>" +
                    "aby náuka, ktorú si nám zjavil,<br>" +
                    "bola slasťou nášho srdca.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"23", "Všemohúci a večný Bože,<br>" +
                    "ty si svätého biskupa Vojtecha,<br>" +
                    "muža plného viery a Ducha Svätého,<br>" +
                    "poslal šíriť evanjelium medzi slovanské kmene; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my slovom a dobrým príkladom<br>" +
                    "zveľaďovali vieru, ktorú on tak horlivo ohlasoval.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "požehnaj tieto obetné dary<br>" +
                    "a posilňuj nás vo viere, <font color='#B71C1C'>—</font><br>" +
                    "ktorú svätý Vojtech dosvedčil mučeníckou smrťou.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože, sviatostné telo a krv tvojho Syna<br>" +
                    "pomáhali svätému biskupovi Vojtechovi<br>" +
                    "prekonať všetky utrpenia; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "nech aj nás posilňuje sväté prijímanie,<br>" +
                    "aby sme si zachovali vieru a lásku k tebe.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"24a", "Všemohúci Bože,<br>" +
                    "velebíme tvoju moc vo svätom Jurajovi,<br>" +
                    "ktorý svojím utrpením nasledoval tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj nám na jeho orodovanie silu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy zvíťazili nad zlom<br>" +
                    "a každodenný kríž niesli<br>" +
                    "v spojení s Ježišom Kristom,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"24b", "Večný Bože,<br>" +
                    "ty si dal svätému Fidelovi takú veľkú lásku,<br>" +
                    "že pri šírení viery získal palmu mučeníctva; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor udeľ nám vytrvalosť v láske, <font color='#B71C1C'>—</font><br>" +
                    "aby sa aj na nás prejavila sila zmŕtvychvstania<br>" +
                    "nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"25g", "Milostivý Bože,<br>" +
                    "ty si vyvolil svätého evanjelistu Marka<br>" +
                    "za ohlasovateľa tvojej blahozvesti; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, osvecuj nás, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa nábožným čítaním jeho Evanjelia<br>" +
                    "naučili verne kráčať po stopách tvojho Syna<br>" +
                    "Ježiša Krista, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "na sviatok svätého Marka<br>" +
                    "prinášame ti obetu chvály a pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby tvoja Cirkev neprestajne hlásala<br>" +
                    "evanjelium Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás posvätí chlieb života,<br>" +
                    "ktorý sme prijali z tvojho oltára, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pevne verili evanjeliu,<br>" +
                    "ktoré ohlasoval a nám odovzdal svätý Marek.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"28a", "Všemohúci Bože,<br>" +
                    "mučeníckou smrťou svätého Petra Chanela<br>" +
                    "si zasial semeno viery na ostrovoch Oceánie; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám v tomto veľkonočnom období<br>" +
                    "tak sláviť tajomstvo<br>" +
                    "Kristovej smrti a zmŕtvychvstania,<br>" +
                    "aby sme vydávali o ňom svedectvo<br>" +
                    "obnoveným kresťanským životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"29g", "Milosrdný Bože,<br>" +
                    "ty si roznecoval vo svätej Kataríne<br>" +
                    "vrúcnu lásku k tebe,<br>" +
                    "keď rozjímala o Kristovom utrpení<br>" +
                    "a slúžila tvojej Cirkvi; <font color='#B71C1C'>*</font><br>" +
                    "na jej príhovor pomáhaj aj nám<br>" +
                    "v osudoch Cirkvi prežívať tajomstvo<br>" +
                    "Kristovej smrti a zmŕtvychvstania, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa s ním večne mohli radovať,<br>" +
                    "keď sa zjaví vo svojej sláve.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče,<br>" +
                    "prijmi spásonosnú obetu, ktorú ti prinášame<br>" +
                    "v deň spomienky na svätú Katarínu, <font color='#B71C1C'>*</font><br>" +
                    "a pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa jej učenia a príkladu<br>" +
                    "vždy horlivejšie vzdávali vďaky<br>" +
                    "tebe, pravému Bohu.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "prijali sme nebeský pokrm,<br>" +
                    "ktorý zázračne udržoval<br>" +
                    "aj pozemský život svätej Kataríny; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám prijímanie tejto sviatosti<br>" +
                    "zaistilo večný život.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"30", "Dobrotivý Bože,<br>" +
                    "vo svojej prozreteľnosti<br>" +
                    "si poslal svojmu ľudu svätého pápeža Pia,<br>" +
                    "aby hájil pravú vieru a obnovil liturgiu Cirkvi; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme na jeho príhovor<br>" +
                    "slávili tajomstvá spásy so živou vierou <font color='#B71C1C'>—</font><br>" +
                    "a uvádzali ich do života činorodou láskou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
    };

    String[][] modlitba5 = {
            {"01", "Bože, stvoriteľ vesmíru,<br>" +
                    "ty si nám dal prácu ako životný údel; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa,<br>" +
                    "pomáhaj nám nasledovať príklad svätého Jozefa <font color='#B71C1C'>—</font><br>" +
                    "a pod jeho ochranou<br>" +
                    "svedomite vykonávať všetky svoje povinnosti,<br>" +
                    "aby sme dosiahli prisľúbenú odmenu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože, prameň všetkého milosrdenstva, <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na dary, ktoré ti prinášame<br>" +
                    "pri spomienke na svätého Jozefa, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme pre zásluhy tejto svätej obety<br>" +
                    "našli u teba pomoc a ochranu.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "s radosťou sme prijali nebeský pokrm; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme podľa príkladu svätého Jozefa<br>" +
                    "vydávali svedectvo o láske,<br>" +
                    "ktorú si roznietil v našich srdciach, <font color='#B71C1C'>—</font><br>" +
                    "a neprestajne sa tešili z pravého a trvalého pokoja.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"02", "Všemohúci a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "vo svätom biskupovi Atanázovi<br>" +
                    "si dal svoj ej Cirkvi<br>" +
                    "neohrozeného obrancu božstva tvojho Syna; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme ťa mohli vždy lepšie poznávať<br>" +
                    "a nadovšetko milovať,<br>" +
                    "osvietení náukou a podporovaní orodovaním<br>" +
                    "tohto vynikajúceho biskupa.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "zhliadni na dary, ktoré ti prinášame<br>" +
                    "pri spomienke na svätého Atanáza; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám<br>" +
                    "neohrozene vyznávať pravú vieru, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vydávali svedectvo o tvojej pravde,<br>" +
                    "a tak si zaslúžili večnú odmenu.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "so svätým Atanázom pevne vyznávame,<br>" +
                    "že tvoj jednorodený Syn je pravý Boh; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "posilňuj a zveľaďuj v nás božský život<br>" +
                    "prijímaním Najsvätejšej sviatosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"03g", "Dobrotivý Bože,<br>" +
                    "potešuješ nás výročným sviatkom<br>" +
                    "apoštolov Filipa a Jakuba; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie daj nám účasť<br>" +
                    "na utrpení a zmŕtvychvstaní tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ťa vo večnosti mohli vidieť z tváre do tváre.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary, ktoré ti prinášame<br>" +
                    "na sviatok apoštolov Filipa a Jakuba, <font color='#B71C1C'>—</font><br>" +
                    "a pomáhaj nám uvádzať do života<br>" +
                    "rýdzu a bezchybnú nábožnosť.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "týmto svätým prijímaním očisti naše srdce,<br>" +
                    "aby sme ťa aj my poznali v tvojom Synovi<br>" +
                    "ako svätý Filip a Jakub,<br>" +
                    "a zaslúžili si život večný. Skrze Krista, nášho Pána."},
            {"12a", "Všemohúci Bože,<br>" +
                    "ty si dal svätým mučeníkom Nereovi a Achilovi<br>" +
                    "odvahu a stálosť vo vyznávaní viery; <font color='#B71C1C'>*</font><br>" +
                    "pomôž aj nám na ich orodovanie, <font color='#B71C1C'>—</font><br>" +
                    "aby sme neohrozene vyznávali vieru až do smrti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"12b", "Dobrotivý Bože, nech sa tvoja Cirkev raduje,<br>" +
                    "že sa za ňu prihovára svätý mučeník Pankrác; <font color='#B71C1C'>*</font><br>" +
                    "pomôž jej, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby vytrvala v nábožnej oddanosti tebe<br>" +
                    "a pod tvojou ochranou žila v trvalom pokoji.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"13", "Dobrotivý Bože,<br>" +
                    "ty si Rodičku svojho Syna ustanovil aj za našu Matku; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme,<br>" +
                    "aby sme zotrvávali v pokání<br>" +
                    "a na modlitbách za spásu sveta <font color='#B71C1C'>―</font><br>" +
                    "a mohli čoraz viac a účinnejšie zveľaďovať<br>" +
                    "Kristovo kráľovstvo.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "", ""},
            {"14g", "Milosrdný Bože, ty si pridružil svätého Mateja<br>" +
                    "k zboru apoštolov; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie nám udeľ milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme všetci, ktorých zahŕňaš svojou láskou,<br>" +
                    "boli raz pripočítaní k tvojim vyvoleným.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary,<br>" +
                    "ktoré ti tvoja Cirkev úctivo predkladá<br>" +
                    "na sviatok apoštola Mateja, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sa nám stali prameňom milosti a sily.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "neprestajne zahŕňaj rodinu veriacich<br>" +
                    "nebeskými darmi <font color='#B71C1C'>—</font><br>" +
                    "a na príhovor svätého Mateja<br>" +
                    "prijmi nás do blaženého spoločenstva tvojich svätých.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"16", "Milosrdný Bože,<br>" +
                    "ty si vyvolil kňaza a mučeníka Jána<br>" +
                    "za obrancu práv Cirkvi<br>" +
                    "a za strážcu spovedného tajomstva; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si vzali príklad z jeho statočnosti<br>" +
                    "a verne konali službu, do ktorej si nás povolal.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prijmi, Bože, obetu zmierenia a chvály, <font color='#B71C1C'>*</font><br>" +
                    "ktorú slávime<br>" +
                    "na sviatok svätého Jána Nepomuckého;<br>" +
                    "pre jej zásluhy odpusť nám hriechy <font color='#B71C1C'>—</font><br>" +
                    "a naplň nás ustavičnou vďačnosťou.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "nech nás posilňuje nebeský chlieb,<br>" +
                    "ktorý sme prijali, <font color='#B71C1C'>*</font><br>" +
                    "ako posilňoval tvojho kňaza a mučeníka Jána, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti vždy<br>" +
                    "a vo všetkých okolnostiach zostali verní.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"16g", "Milosrdný Bože,<br>" +
                    "ty si vyvolil kňaza a mučeníka Jána<br>" +
                    "za obrancu práv Cirkvi<br>" +
                    "a za strážcu spovedného tajomstva; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si vzali príklad z jeho statočnosti<br>" +
                    "a verne konali službu, do ktorej si nás povolal.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prijmi, Bože, obetu zmierenia a chvály, <font color='#B71C1C'>*</font><br>" +
                    "ktorú slávime<br>" +
                    "na sviatok svätého Jána Nepomuckého;<br>" +
                    "pre jej zásluhy odpusť nám hriechy <font color='#B71C1C'>—</font><br>" +
                    "a naplň nás ustavičnou vďačnosťou.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "nech nás posilňuje nebeský chlieb,<br>" +
                    "ktorý sme prijali, <font color='#B71C1C'>*</font><br>" +
                    "ako posilňoval tvojho kňaza a mučeníka Jána, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti vždy<br>" +
                    "a vo všetkých okolnostiach zostali verní.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"18", "Večný Bože, odmena verných duší,<br>" +
                    "tento deň si posvätil mučeníctvom<br>" +
                    "svätého pápeža Jána; <font color='#B71C1C'>*</font><br>" +
                    "obdivujeme jeho záslužné činy<br>" +
                    "a vrúcne ťa prosíme, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy nasledovali jeho stálosť vo viere.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"20", "Láskavý Otče,<br>" +
                    "ty si vložil do srdca svojho kňaza Bernardína<br>" +
                    "veľkú lásku k svätému menu Ježiš; <font color='#B71C1C'>*</font><br>" +
                    "pre jeho zásluhy a na jeho orodovanie dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my horeli láskou k tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"21", "Všemohúci večný Bože,<br>" +
                    "ty si svätého kňaza Krištofa a jeho spoločníkov<br>" +
                    "urobil vernými Kristovi Kráľovi až po mučeníctvo; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie nám udeľ,<br>" +
                    "aby sme vytrvali vo vyznávaní pravej viery <font color='#B71C1C'>―</font><br>" +
                    "a tak sa vždy pridŕžali prikázaní tvojej lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"22", "Otče, uštedri nám, prosíme,<br>" +
                    "múdrosť a silu kríža, <font color='#B71C1C'>*</font><br>" +
                    "ktorými si milostivo obdaril svätú Ritu, <font color='#B71C1C'>―</font><br>" +
                    "aby sme v súženiach trpeli s Kristom,<br>" +
                    "a tak mohli mať hlbokú účasť<br>" +
                    "na jeho veľkonočnom tajomstve.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"25a", "Láskavý Bože,<br>" +
                    "ty osvecuješ svoju Cirkev náukou<br>" +
                    "svätého kňaza Bédu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby nám jeho múdrosť svietila na ceste života<br>" +
                    "a jeho zásluhy pomáhali vytrvať v dobrom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"25b", "Všemohúci Bože,<br>" +
                    "svätého pápeža Gregora si vyznačil<br>" +
                    "veľkou duchovnou silou<br>" +
                    "a horlivosťou za spravodlivosť; <font color='#B71C1C'>*</font><br>" +
                    "udeľ aj dnes svojej Cirkvi odvahu<br>" +
                    "vystupovať proti bezpráviu <font color='#B71C1C'>—</font><br>" +
                    "a s úprimnou láskou slobodne slúžiť pravde a dobru.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"25c", "Bože, milovník panenskej čistoty, <font color='#B71C1C'>*</font><br>" +
                    "svätú Máriu Magdalénu de' Pazzi,<br>" +
                    "ktorej srdce horelo vrúcnou láskou k tebe,<br>" +
                    "obdaril si mimoriadnymi nad prirodzenými darmi; <font color='#B71C1C'>—</font><br>" +
                    "prosíme ťa, dopraj nám všetkým,<br>" +
                    "čo ju dnes uctievame,<br>" +
                    "nasledovať príklad jej čistoty a lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"26", "Láskavý Bože,<br>" +
                    "svojich verných služobníkov<br>" +
                    "korunuješ slávou svätosti<br>" +
                    "a dávaš ich za vzor svojim veriacim; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, zapáľ nám srdcia<br>" +
                    "ohňom Ducha Svätého<br>" +
                    "a zachovaj v nás lásku a veselosť,<br>" +
                    "akú nosil v srdci svätý kňaz Filip Neri, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli poslami tvojej radosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "prinášame ti obetu chvály a vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa príkladu svätého Filipa<br>" +
                    "vždy s radosťou oslavovali tvoje meno<br>" +
                    "a s láskou slúžili svojim blížnym.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás sväté prijímanie naplní radosťou,<br>" +
                    "s akou svätý Filip ohlasoval ľuďom tvoju lásku, <font color='#B71C1C'>—</font><br>" +
                    "nech ustavične túžime<br>" +
                    "po sviatostnom pokrme,<br>" +
                    "ktorý v nás zveľaďuje pravý život.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"27", "Bože, vládca národov,<br>" +
                    "slovom a príkladom svätého biskupa Augustína<br>" +
                    "priviedol si národy Anglicka k svetlu evanjelia; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby jeho misionárske námahy<br>" +
                    "prinášali v tvojej Cirkvi vždy novú úrodu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"29", "Bože, ty si zveril svoju Cirkev <br>" +
                    "svätému pápežovi Pavlovi, <br>" +
                    "horlivému ohlasovateľovi evanjelia tvojho Syna; <br>" +
                    "prosíme ťa, dopraj, <br>" +
                    "aby sme podľa jeho náuky <br>" +
                    "spolupracovali s tebou na šírení <br>" +
                    "vzájomnej úcty a lásky medzi ľuďmi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""}
    };

    String[][] modlitba6 = {
            {"01", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "ty si svätého mučeníka Justína priviedol<br>" +
                    "k hlbokému poznaniu Ježiša Krista skrze kríž,<br>" +
                    "ktorý je pre mnohých bláznovstvom; <font color='#B71C1C'>—</font><br>" +
                    "na jeho orodovanie nás ochraňuj<br>" +
                    "pred bludnými náukami<br>" +
                    "a upevňuj vo vyznávaní pravej viery.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby sme dôstojne slávili<br>" +
                    "eucharistické tajomstvo, <font color='#B71C1C'>—</font><br>" +
                    "ktoré svätý mučeník Justín<br>" +
                    "tak odhodlane a statočne obraňoval.<br>" +
                    "Skrze Krista, nášho Pána.", "Večný Bože,<br>" +
                    "nebeským pokrmom posilnení pokorne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "aby sme žili podľa náuky svätého<br>" +
                    "mučeníka Justína <font color='#B71C1C'>—</font><br>" +
                    "a ustavične ti ďakovali za prijaté dary.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"02", "Láskavý Bože,<br>" +
                    "pre slávne mučeníctvo svätého Marcelína a Petra<br>" +
                    "poskytuješ svojej Cirkvi vytrvalosť a odvahu; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nás svojím orodovaním posilňovali <font color='#B71C1C'>—</font><br>" +
                    "a svojím príkladom povzbudzovali k stálosti vo viere.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"03", "Všemohúci Bože,<br>" +
                    "tvojím pôsobením sa krv mučeníkov<br>" +
                    "stáva semenom nových kresťanov; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby pole tvojej Cirkvi,<br>" +
                    "skropené krvou svätého Karola a jeho spoločníkov,<br>" +
                    "prinášalo stále hojnú úrodu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "prinášame ti obetné dary<br>" +
                    "v deň spomienky na ugandských mučeníkov,<br>" +
                    "ktorí radšej zomreli, ako by mali zhrešiť; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli oddaní jedine tebe<br>" +
                    "a nábožne slúžili pri tvojom oltári.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "pri oslave víťaznej smrti svätých mučeníkov<br>" +
                    "prijali sme Eucharistiu,<br>" +
                    "ktorá ich posilňovala v utrpení; <font color='#B71C1C'>—</font><br>" +
                    "prosíme ťa, daj,<br>" +
                    "aby táto vznešená sviatosť aj nám pomáhala<br>" +
                    "zachovať si živú vieru a lásku<br>" +
                    "uprostred skúšok a protivenstiev tohto života.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"05", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám na orodovanie svätého<br>" +
                    "mučeníka Bonifáca, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pevne vyznávali<br>" +
                    "a životom dosvedčovali vieru,<br>" +
                    "ktorú on neohrozene hlásal a spečatil svojou krvou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"06", "Nekonečný Bože,<br>" +
                    "svätý Norbert sa pre svoju lásku k modlitbe<br>" +
                    "a pastiersku horlivosť<br>" +
                    "stal biskupom podľa tvojho srdca; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor daj svojmu ľudu<br>" +
                    "aj dnes biskupov a kňazov, <font color='#B71C1C'>—</font><br>" +
                    "ktorí by sa s láskou starali o tvojich veriacich<br>" +
                    "a viedli ich k prameňom spásy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"09", "Dobrotivý Bože,<br>" +
                    "pôsobením Ducha Svätého<br>" +
                    "si tak roznietil svätého diakona Efréma,<br>" +
                    "že radostne ospevoval vznešenosť tvojich tajomstiev<br>" +
                    "a venoval sa iba tvojej službe; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa,<br>" +
                    "aj do našich sŕdc vlož lásku a silu svojho Ducha, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti verne slúžili a svojím životom ťa chválili.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"11", "Dobrotivý Bože,<br>" +
                    "ty si poslal svätého Barnabáša,<br>" +
                    "plného viery a Ducha Svätého,<br>" +
                    "ohlasovať evanjelium pohanom; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "vzbudzuj aj dnes horlivých pracovníkov,<br>" +
                    "ktorí by podľa jeho príkladu<br>" +
                    "slovom i životom ohlasovali blahozvesť Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "Prosíme ťa, večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "požehnaj a posväť tieto obetné dary <font color='#B71C1C'>—</font><br>" +
                    "a zapáľ v nás oheň lásky,<br>" +
                    "ktorou horel svätý Barnabáš,<br>" +
                    "keď národom niesol svetlo evanjelia.<br>" +
                    "Skrze Krista, nášho Pána.", "Nekonečný Bože, <font color='#B71C1C'>*</font><br>" +
                    "pri spomienke na svätého Barnabáša<br>" +
                    "prijali sme nebeský chlieb<br>" +
                    "ako záloh večného života; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme raz z tváre do tváre<br>" +
                    "videli Ježiša Krista,<br>" +
                    "ktorého prijímame v Oltárnej sviatosti.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"13", "Všemohúci a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "vo svätom Antonovi si dal svojmu ľudu<br>" +
                    "vynikajúceho kazateľa<br>" +
                    "a mocného pomocníka v núdzi; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme na jeho príhovor<br>" +
                    "žili podľa kresťanských zásad<br>" +
                    "a vo všetkých protivenstvách cítili tvoju ochranu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"16+", "", "Všemohúci a milosrdný Bože,<br>" +
                    "ty si svätému Neitovi pomáhal<br>" +
                    "hrdinsky znášať útrapy mučenia; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomôž<br>" +
                    "tak pracovať na šírení viery, <font color='#B71C1C'>—</font><br>" +
                    "aby sme získali pre Krista čím viac bratov a sestier<br>" +
                    "a spolu s nimi dosiahli večný život.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech v nás táto obeta vznieti takú duševnú silu, <font color='#B71C1C'>—</font><br>" +
                    "akú prejavoval svätý mučeník Neitus<br>" +
                    "v tvojej službe a v hrdinskom utrpení.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"19", "Dobrotivý Bože,<br>" +
                    "ty si prostredníctvom svätého Romualda<br>" +
                    "obnovil vo svojej Cirkvi<br>" +
                    "pustovnícky spôsob života; <font color='#B71C1C'>*</font><br>" +
                    "pomôž aj nám premáhať seba<br>" +
                    "a nasledovať Krista, <font color='#B71C1C'>—</font><br>" +
                    "aby sme šťastne došli do nebeského kráľovstva.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"21", "Bože, pôvodca nebeských darov,<br>" +
                    "ty si v živote svätého Alojza<br>" +
                    "spojil obdivuhodnú nevinnosť s kajúcnosťou; <font color='#B71C1C'>*</font><br>" +
                    "pre jeho zásluhy a na jeho<br>" +
                    "príhovor daj nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ho napodobňovali v kajúcnosti,<br>" +
                    "ak sme ho nenasledovali v nevinnosti.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme ako svätý Alojz<br>" +
                    "prichádzali na nebeskú hostinu<br>" +
                    "vždy vo svadobnom rúchu milosti, <font color='#B71C1C'>—</font><br>" +
                    "a tak vo svätej omši získali hojnosť tvojich darov.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "nasýtil si nás anjelským chlebom; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme ti podľa príkladu svätého Alojza<br>" +
                    "slúžili s čistým srdcom <font color='#B71C1C'>—</font><br>" +
                    "a ustavične ti vzdávali vďaky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"22a", "Dobrotivý Bože,<br>" +
                    "vo svätom biskupovi Pavlínovi<br>" +
                    "dal si svojej Cirkvi žiarivý príklad<br>" +
                    "apoštolskej horlivosti a lásky k chudobným; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám, aby sme uctievali jeho svätý život <font color='#B71C1C'>—</font><br>" +
                    "a napodobňovali jeho činorodú lásku.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "", ""},
            {"22b", "Láskavý Bože,<br>" +
                    "mučenícka smrť je pred tebou<br>" +
                    "najdokonalejším svedectvom pravej viery; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám na orodovanie<br>" +
                    "svätého Jána Fišera a Tomáša Morusa, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v životných<br>" +
                    "skúškach skutkami dokazovali vieru,<br>" +
                    "ktorú vyznávame slovami.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"23gk", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme sa uberali cestou spásy,<br>" +
                    "nasledujúc výzvy Pánovho predchodcu Jána Krstiteľa, <font color='#B71C1C'>—</font><br>" +
                    "a tak bezpečne prišli k tomu,<br>" +
                    "ktorého on predpovedal,<br>" +
                    "k nášmu Pánovi Ježišovi Kristovi,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na dary, ktoré ti prinášame<br>" +
                    "na slávnosť svätého Jána Krstiteľa, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme ti so živou vierou a opravdivou láskou<br>" +
                    "slúžili aj pri oltári aj v každodennom živote.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "nasýtil si nás nebeským pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "daj, nech nás svätý Ján Krstiteľ<br>" +
                    "sprevádza svojím orodovaním <font color='#B71C1C'>—</font><br>" +
                    "a nech nám vyprosí zmilovanie u tvojho Syna,<br>" +
                    "ktorého nazval Baránkom, čo sníma hriechy sveta.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"24gk", "Dobrotivý Bože,<br>" +
                    "ty si poslal svätého Jána Krstiteľa,<br>" +
                    "aby pripravil starozákonný ľud<br>" +
                    "na príchod Ježiša Krista; <font color='#B71C1C'>*</font><br>" +
                    "daruj svojej Cirkvi radosť v Duchu Svätom <font color='#B71C1C'>—</font><br>" +
                    "a veď nás stále po ceste pokoja a spásy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nebeský Otče, <font color='#B71C1C'>*</font><br>" +
                    "s radosťou prinášame obetné dary na tvoj oltár<br>" +
                    "na slávnosť narodenia Jána Krstiteľa, <font color='#B71C1C'>—</font><br>" +
                    "ktorý predpovedal<br>" +
                    "i oznámil príchod Spasiteľa sveta, Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov.", "Všemohúci Bože,<br>" +
                    "na sviatok narodenia svätého Jána Krstiteľa<br>" +
                    "posilnil si nás na hostine nebeského Baránka<br>" +
                    "a naplnil svätou radosťou; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme čoraz lepšie poznávali, <font color='#B71C1C'>—</font><br>" +
                    "že Kristus, ktorého Ján predpovedal,<br>" +
                    "je pôvodcom nášho znovuzrodenia.<br>" +
                    "On žije a kraľuje na veky vekov."},
            {"27a", "Všemohúci a večný Bože,<br>" +
                    "vo svätom Ladislavovi si nám dal príklad,<br>" +
                    "ako ti možno oddane slúžiť<br>" +
                    "v každom povolaní; <font color='#B71C1C'>*</font><br>" +
                    "láskavo nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme Kristovou náukou zveľaďovali svornosť<br>" +
                    "a upevňovali lásku medzi ľuďmi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"27b", "Večný Bože,<br>" +
                    "vo svätom Cyrilovi si dal Cirkvi<br>" +
                    "neohrozeného obrancu pravdy,<br>" +
                    "že preblahoslavená Panna Mária je Bohorodičkou; <font color='#B71C1C'>*</font><br>" +
                    "aj my veríme a vyznávame,<br>" +
                    "že je naozaj Matkou Božou, <font color='#B71C1C'>—</font><br>" +
                    "a prosíme, aby sme dosiahli spásu<br>" +
                    "v tvojom Synovi Ježišovi Kristovi,<br>" +
                    "ktorý sa pre nás stal človekom<br>" +
                    "a s tebou žije a kraľuje v jednote<br>" +
                    "s Duchom Svätým po všetky veky vekov.", "", ""},
            {"28", "Dobrotivý Bože,<br>" +
                    "ty si povolal svätého Ireneja<br>" +
                    "obraňovať pravé učenie<br>" +
                    "a upevňovať pokoj v Cirkvi; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "na jeho príhovor obnov v nás vieru a lásku,<br>" +
                    "aby sme sa vždy usilovali o jednotu a svornosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Veľký a večný Bože,<br>" +
                    "s radosťou ti prinášame svätú obetu<br>" +
                    "v deň víťaznej smrti svätého Ireneja; <font color='#B71C1C'>*</font><br>" +
                    "nech táto svätá omša oslávi tvoje meno<br>" +
                    "a nás nech upevní v láske k pravde, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa držali neporušenej viery<br>" +
                    "a zachovali jednotu Cirkvi.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "týmito posvätnými tajomstvami<br>" +
                    "zveľaďuj v nás vieru,<br>" +
                    "za ktorú tvoj svätý biskup Irenej<br>" +
                    "podstúpil mučenícku smrť, <font color='#B71C1C'>*</font><br>" +
                    "a pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my dôsledne žili podľa viery<br>" +
                    "a dosiahli slávu v nebi.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"28gk", "Pane a Bože náš,<br>" +
                    "požehnaným pôsobením svätých<br>" +
                    "apoštolov Petra a Pavla<br>" +
                    "dal si rodiacej sa Cirkvi pevný základ viery; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "na ich príhovor poskytni nám pomoc<br>" +
                    "potrebnú na večnú spásu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "v predvečer slávnosti svätých apoštolov Petra a Pavla<br>" +
                    "kladieme na tvoj oltár obetné dary, <font color='#B71C1C'>—</font><br>" +
                    "a hoci nás zarmucujú naše poklesky,<br>" +
                    "dúfame, že nás zachrániš pre svoju dobrotu.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Bože,<br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "ustavične nás posilňuj nebeským pokrmom, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa držali náuky apoštolov.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"29gk", "Všemohúci a večný Bože,<br>" +
                    "dnešnou slávnosťou svätého Petra a Pavla<br>" +
                    "pripravil si nám veľkú a svätú radosť; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj svojej Cirkvi, <font color='#B71C1C'>—</font><br>" +
                    "aby vo všetkom nasledovala<br>" +
                    "učenie svätých apoštolov,<br>" +
                    "od ktorých pri svojom zrode prijala dar viery.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech orodovanie svätých apoštolov<br>" +
                    "sprevádza naše dary,<br>" +
                    "ktoré sme priniesli na oltár, <font color='#B71C1C'>—</font><br>" +
                    "a nech nám pomáha<br>" +
                    "nábožne sláviť túto obetu.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "posilnení touto sviatosťou vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám bratsky nažívať v Cirkvi,<br>" +
                    "aby sme sa ako prví kresťania<br>" +
                    "vytrvalo zúčastňovali na lámaní chleba,<br>" +
                    "ostali verní náuke apoštolov, <font color='#B71C1C'>—</font><br>" +
                    "a tak boli jedno srdce a jedna duša.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"30", "Všemohúci Bože,<br>" +
                    "sľubné začiatky Cirkvi v Ríme<br>" +
                    "si posvätil krvou mnohých mučeníkov; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj,<br>" +
                    "aby nás ich hrdinský zápas<br>" +
                    "povzbudzoval k statočnosti <font color='#B71C1C'>—</font><br>" +
                    "a ich sväté víťazstvo napĺňalo radosťou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
    };

    String[][] modlitba7 = {
            {"02g", "Všemohúci a večný Bože,<br>" +
                    "keď pre blahoslavená Panna Mária<br>" +
                    "nosila pod srdcom tvojho Syna,<br>" +
                    "vnukol si jej, aby navštívila svätú Alžbetu; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme aj my ochotne poslúchali<br>" +
                    "vnuknutia Ducha Svätého <font color='#B71C1C'>—</font><br>" +
                    "a spolu s Pannou Máriou ťa vždy velebili.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš,<br>" +
                    "nech ti je milá táto naša obeta, <font color='#B71C1C'>*</font><br>" +
                    "ako ti bola milá služba lásky, <font color='#B71C1C'>—</font><br>" +
                    "ktorú svätej Alžbete preukázala<br>" +
                    "matka tvojho Syna Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov.", "Dobrotivý Otče,<br>" +
                    "zvelebujeme ťa s Pannou Máriou a s celou Cirkvou,<br>" +
                    "lebo si nás zahrnul veľkými milosťami; <font color='#B71C1C'>*</font><br>" +
                    "a ako svätý Ján zaplesal, keď pocítil prítomnosť<br>" +
                    "Božieho Syna v lone panenskej matky, <font color='#B71C1C'>—</font><br>" +
                    "daj, nech aj my s radosťou prijímame Ježiša Krista,<br>" +
                    "vždy prítomného v Oltárnej sviatosti.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"03g", "Všemohúci Bože,<br>" +
                    "s radosťou slávime sviatok svätého apoštola Tomáša,<br>" +
                    "ktorý vyznal, že tvoj Syn je Pán a Boh; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, nech nás ustavične sprevádza<br>" +
                    "ochrana tohto apoštola, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vierou mali život v Ježišovom mene.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "pri oslave mučeníckej smrti svätého apoštola Tomáša<br>" +
                    "prinášame ti povinnú obetu chvály <font color='#B71C1C'>*</font><br>" +
                    "a pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "zachovaj v nás milosť vykúpenia.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "v tejto sviatosti sme prijali skutočné telo<br>" +
                    "tvojho osláveného Syna <font color='#B71C1C'>*</font><br>" +
                    "a spolu s apoštolom Tomášom<br>" +
                    "v Kristovi spoznávame nášho Pána a Boha; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme sa k nemu hlásili nielen slovom,<br>" +
                    "ale celým svojím životom.<br>" +
                    "Lebo on s tebou žije a kraľuje na veky vekov."},
            {"04", "Bože, pôvodca lásky a pokoja,<br>" +
                    "ty si obdaril svätú Alžbetu<br>" +
                    "obdivuhodnou milosťou zmierovať hnevníkov; <font color='#B71C1C'>*</font><br>" +
                    "na jej príhovor pomáhaj nám vnášať pokoj medzi ľudí, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa mohli nazývať Božími deťmi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"05gk", "Všemohúci a večný Bože,<br>" +
                    "ty si našim predkom poslal svätého Cyrila a Metoda,<br>" +
                    "aby ich priviedli k pravej viere; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si verne zachovali dedičstvo otcov,<br>" +
                    "statočne vyznávali svoju vieru a podľa nej aj žili.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože,<br>" +
                    "prinášame ti obetné dary<br>" +
                    "na počesť našich vierozvestov Cyrila a Metoda <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pre túto svätú obetu<br>" +
                    "udeľ nám dar jednoty a pokoja.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "prijali sme nebeský chlieb, ktorý je znakom jednoty; <font color='#B71C1C'>*</font><br>" +
                    "na orodovanie svätého Cyrila a Metoda udeľ nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby všetci kresťania, zjednotení vo viere,<br>" +
                    "mohli spoločne sláviť tajomstvo Eucharistie.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"06", "Bože, pôvodca nevinnosti a milovník čistoty,<br>" +
                    "ty si svätej Márii Goretti dal v kvete mladosti<br>" +
                    "milosť mučeníctva pri obrane čistoty<br>" +
                    "a v nebi si ju odmenil vencom slávy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jej orodovanie udeľ nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme odhodlane a verne zachovávali tvoje prikázania.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"07", "Pane a Bože náš,<br>" +
                    "v duchu apoštola Pavla svätý Anton Mária Zaccaria<br>" +
                    "nechcel poznať a ohlasovať nič iné,<br>" +
                    "iba Ježiša Krista, a to ukrižovaného; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme si aj my osvojili toto vznešené učenie <font color='#B71C1C'>—</font><br>" +
                    "a v kríži Ježiša Krista našli pravú múdrosť.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "", ""},
            {"11g", "Dobrotivý Bože,<br>" +
                    "vo svätom opátovi Benediktovi<br>" +
                    "dal si nám veľkého učiteľ a duchovného života; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy na prvé miesto kládli lásku k tebe<br>" +
                    "a veľkodušne kráčali po ceste tvojich prikázaní.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "milostivo zhliadni na obetné dary,<br>" +
                    "ktoré ti prinášame v deň spomienky<br>" +
                    "na svätého Benedikta, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme podľa jeho príkladu<br>" +
                    "vždy a všade hľadali teba<br>" +
                    "a v tvojej službe dostali dar jednoty a pokoja.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "vo sviatosti, ktorú sme prijali,<br>" +
                    "dal si nám záruku večného života; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti podľa vzoru svätého Benedikta svedomite slúžili<br>" +
                    "a činorodou láskou milovali svojich blížnych.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"13", "Všemohúci Bože,<br>" +
                    "ty si svätého Henricha obdaril svojou milosťou<br>" +
                    "a uprostred starostí o pozemské kráľovstvo<br>" +
                    "dvíhal si jeho myseľ k veciam nebeským; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vo víre tohto sveta<br>" +
                    "kráčali k tebe s čistou mysľou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"14", "Milosrdný Bože,<br>" +
                    "ty si svätému kňazovi Kamilovi<br>" +
                    "udelil dar hrdinskej lásky k chorým; <font color='#B71C1C'>*</font><br>" +
                    "pre jeho zásluhy naplň nás duchom svojej lásky, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti slúžili vo svojich blížnych<br>" +
                    "a v hodine našej smrti<br>" +
                    "mohli bez strachu predstúpiť pred tvoju tvár.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"15", " Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "v deň spomienky na svätého biskupa Bonaventúru,<br>" +
                    "ktorý sa dnes narodil pre nebo, vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám čerpať z bohatstva jeho náuky<br>" +
                    "a vytrvalo ho nasledovať vo veľkej láske k tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"16", "Veľký a svätý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nám pomáha na životnej púti<br>" +
                    "mocné orodovanie slávnej Panny Márie, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pod jej ochranou<br>" +
                    "bezpečne došli k vrcholu dokonalosti,<br>" +
                    "k Ježišovi Kristovi, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "", ""},
            {"17", "Láskavý Bože,<br>" +
                    "na tvoje vnuknutie svätý Andrej-Svorad a Benedikt<br>" +
                    "sa odobrali do ticha samoty,<br>" +
                    "aby ti modlitbou, prácou i mlčaním dokonalejšie slúžili; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie pomôž aj nám <font color='#B71C1C'>—</font><br>" +
                    "uprostred hluku tohto sveta<br>" +
                    "započúvať sa do tvojho hlasu<br>" +
                    "a dôsledne plniť tvoju vôľu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Svätý Bože, nech sú ti milé dary,<br>" +
                    "ktoré prinášame na oltár pri spomienke<br>" +
                    "na svätého Andreja-Svorada a Benedikta; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "nauč nás správne hodnotiť pozemské veci<br>" +
                    "a dávať prednosť hodnotám trvácnym.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, všemohúci Bože,<br>" +
                    "nech nám toto prijímanie<br>" +
                    "posvätí myseľ i srdce, <font color='#B71C1C'>*</font><br>" +
                    "aby sme podľa príkladu tvojich svätých pustovníkov <font color='#B71C1C'>—</font><br>" +
                    "preukazovali bratskú lásku dobrými skutkami.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"17g", "Láskavý Bože,<br>" +
                    "na tvoje vnuknutie svätý Andrej-Svorad a Benedikt<br>" +
                    "sa odobrali do ticha samoty,<br>" +
                    "aby ti modlitbou, prácou i mlčaním dokonalejšie slúžili; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie pomôž aj nám <font color='#B71C1C'>—</font><br>" +
                    "uprostred hluku tohto sveta<br>" +
                    "započúvať sa do tvojho hlasu<br>" +
                    "a dôsledne plniť tvoju vôľu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Svätý Bože, nech sú ti milé dary,<br>" +
                    "ktoré prinášame na oltár pri spomienke<br>" +
                    "na svätého Andreja-Svorada a Benedikta; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "nauč nás správne hodnotiť pozemské veci<br>" +
                    "a dávať prednosť hodnotám trvácnym.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, všemohúci Bože,<br>" +
                    "nech nám toto prijímanie<br>" +
                    "posvätí myseľ i srdce, <font color='#B71C1C'>*</font><br>" +
                    "aby sme podľa príkladu tvojich svätých pustovníkov <font color='#B71C1C'>—</font><br>" +
                    "preukazovali bratskú lásku dobrými skutkami.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"17gk", "Láskavý Bože,<br>" +
                    "na tvoje vnuknutie svätý Andrej-Svorad a Benedikt<br>" +
                    "sa odobrali do ticha samoty,<br>" +
                    "aby ti modlitbou, prácou i mlčaním dokonalejšie slúžili; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie pomôž aj nám <font color='#B71C1C'>—</font><br>" +
                    "uprostred hluku tohto sveta<br>" +
                    "započúvať sa do tvojho hlasu<br>" +
                    "a dôsledne plniť tvoju vôľu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Svätý Bože, nech sú ti milé dary,<br>" +
                    "ktoré prinášame na oltár pri spomienke<br>" +
                    "na svätého Andreja-Svorada a Benedikta; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "nauč nás správne hodnotiť pozemské veci<br>" +
                    "a dávať prednosť hodnotám trvácnym.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, všemohúci Bože,<br>" +
                    "nech nám toto prijímanie<br>" +
                    "posvätí myseľ i srdce, <font color='#B71C1C'>*</font><br>" +
                    "aby sme podľa príkladu tvojich svätých pustovníkov <font color='#B71C1C'>—</font><br>" +
                    "preukazovali bratskú lásku dobrými skutkami.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"21", "Všemohúci Bože,<br>" +
                    "svätému Vavrincovi z Brindisi si udelil ducha rady a sily,<br>" +
                    "aby ako kňaz a učiteľ svätej náuky<br>" +
                    "šíril slávu tvojho mena a zachraňoval duše; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor aj nás osvieť svojím Duchom, <font color='#B71C1C'>—</font><br>" +
                    "aby sme poznali svoje poslanie<br>" +
                    "a s tvojou pomocou ho aj spĺňali.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"22g", "Všemohúci Otče,<br>" +
                    "tvoj jednorodený Syn poslal Máriu Magdalénu,<br>" +
                    "aby prvá zvestovala apoštolom veľkonočnú radosť; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jej príhovor nás posilňuj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa jej príkladu<br>" +
                    "aj my ohlasovali vzkrieseného Ježiša Krista<br>" +
                    "a raz ho uzreli vo večnej sláve ako svojho Kráľa.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože,<br>" +
                    "prinášame ti obetné dary<br>" +
                    "pri spomienke na svätú Máriu Magdalénu; <font color='#B71C1C'>*</font><br>" +
                    "láskavo ich prijmi, <font color='#B71C1C'>—</font><br>" +
                    "ako tvoj Syn dobrotivo prijal jej službu,<br>" +
                    "ktorú mu z lásky preukázala.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás nábožné prijatie tejto sviatosti<br>" +
                    "naplní takou vrúcnou a vytrvalou láskou, <font color='#B71C1C'>—</font><br>" +
                    "s akou sa svätá Mária Magdaléna<br>" +
                    "ustavične pridŕžala svojho Učiteľa a Pána,<br>" +
                    "tvojho Syna Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov."},
            {"23g", "Bože, ty si svätú Brigitu viedol rozličnými cestami života<br>" +
                    "a obdivuhodne si ju naučil múdrosti kríža,<br>" +
                    "keď rozjímala o utrpení tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme v ktoromkoľvek životnom stave <font color='#B71C1C'>—</font><br>" +
                    "vo všetkom vedeli hľadať iba teba.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Najláskavejší Bože,<br>" +
                    "ty si po zničení starého človeka<br>" +
                    "láskavo stvoril vo svätej Brigite človeka nového; <font color='#B71C1C'>*</font><br>" +
                    "udeľ milostivo, <font color='#B71C1C'>—</font><br>" +
                    "aby sme rovnako obnovení<br>" +
                    "prinášali túto tebe milú obetu zmierenia.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "upevňujeme sa silou tejto sviatosti; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj,<br>" +
                    "aby sme sa podľa príkladu svätej Brigity<br>" +
                    "učili hľadať vždy predovšetkým teba <font color='#B71C1C'>—</font><br>" +
                    "a kráčať v tomto svete ako noví ľudia.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"25g", "Všemohúci a večný Bože,<br>" +
                    "ty si prvotnú činnosť apoštolov<br>" +
                    "požehnal mučeníckou krvou svätého Jakuba; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby tvoja Cirkev čerpala posilu z jeho mučeníctva<br>" +
                    "a pod jeho ochranou sa ustavične vzmáhala.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "očisť nás spasiteľným krstom<br>" +
                    "utrpenia tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti mohli priniesť príjemnú obetu<br>" +
                    "na sviatok svätého Jakuba,<br>" +
                    "ktorého si prvého z apoštolov povolal k účasti<br>" +
                    "na kalichu Kristovho utrpenia.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "na sviatok svätého apoštola Jakuba<br>" +
                    "sme s radosťou prijali vznešenú sviatosť; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "na jeho orodovanie sprevádzaj nás na životnej púti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"26", "Pane, Bože našich otcov,<br>" +
                    "ty si svätého Joachima a Annu<br>" +
                    "vyvolil za rodičov Panny Márie,<br>" +
                    "matky tvojho vteleného Syna; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám na ich spoločné orodovanie<br>" +
                    "dosiahnuť spásu, ktorú si sľúbil svojmu ľudu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi tieto dary<br>" +
                    "ako prejav našej oddanosti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mali účasť na požehnaní,<br>" +
                    "ktoré si prisľúbil nášmu praotcovi vo viere<br>" +
                    "Abrahámovi a jeho potomkom.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože a Otče náš,<br>" +
                    "tvoj jednorodený Syn sa stal človekom,<br>" +
                    "aby sa človek mohol vo sviatosti krstu znovuzrodiť z teba; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "posväcuj nás Duchom, ktorý nás pretvára na tvoje deti,<br>" +
                    "a živ nás Chlebom z tvojho stola.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"27", "Všemohúci a milosrdný Bože,<br>" +
                    "ty si povzbudzoval Metodovho učeníka Gorazda<br>" +
                    "a jeho spoločníkov,<br>" +
                    "aby pokračovali v apoštolskom diele našich vierozvestov; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie nám pomôž, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my dnešnému svetu<br>" +
                    "ohlasovali blahozvesť tvojho Syna<br>" +
                    "a upevňovali jednotu Cirkvi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože, prijmi obetné dary,<br>" +
                    "ktoré ti prinášame v deň spomienky<br>" +
                    "na svätého Gorazda a jeho spoločníkov, <font color='#B71C1C'>*</font><br>" +
                    "a pomôž nám podľa ich príkladu<br>" +
                    "vyznávať neporušenú vieru <font color='#B71C1C'>—</font><br>" +
                    "a s láskou ti obetovať všetky ťažkosti života.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože, nasýtil si nás nebeským pokrmom,<br>" +
                    "a tak si nás ešte užšie spojil so svojím Synom; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nás nič neodlúčilo od Kristovej lásky <font color='#B71C1C'>—</font><br>" +
                    "a aby sme ako svätý Gorazda jeho spoločníci<br>" +
                    "trpezlivo prekonávali všetky protivenstvá.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"29", "Všemohúci a večný Bože,<br>" +
                    "tvoj Syn láskavo prijal pohostinstvo v dome svätej Marty; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jej príhovor nám pomáhaj<br>" +
                    "ochotne slúžiť Kristovi v našich blížnych, <font color='#B71C1C'>—</font><br>" +
                    "aby si nás mohol prijať do svojho nebeského príbytku.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "Mocný Bože, velebíme ťa pre milosť,<br>" +
                    "ktorou si obdaril svätú Martu <font color='#B71C1C'>*</font><br>" +
                    "a pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby ti aj naša posvätná služba bola príjemná,<br>" +
                    "ako ti bol milý prejav jej pohostinnej lásky.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "nech nás prijatie tela a krvi tvojho jednorodeného Syna<br>" +
                    "vedie k správnemu hodnoteniu pominuteľných vecí, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti podľa príkladu svätej Marty<br>" +
                    "slúžili s oddanou láskou<br>" +
                    "a v nebi sa tešili z večného pohľadu na teba.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"30", "Svätý Bože,<br>" +
                    "vo svätom biskupovi Petrovi Chryzológovi<br>" +
                    "dal si svojej Cirkvi<br>" +
                    "vynikajúceho hlásateľ a tvojho vteleného Slova; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s milujúcim srdcom<br>" +
                    "uvažovali o tajomstvách spásy<br>" +
                    "a verne o nich svedčili svojimi skutkami.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"30b", "Dobrotivý Bože,<br>" +
                    "ty si dal blahoslavenej Zdenke<br>" +
                    "nevšednú lásku k ukrižovanému Kristovi,<br>" +
                    "ktorú prejavila radostnou službou chorým<br>" +
                    "a tvojim kňazom;<br>" +
                    "prosíme ťa, dopraj aj nám,<br>" +
                    "aby sme ju nasledovali v úprimnej ochote<br>" +
                    "dať svoj život do služby bratom a sestrám<br>" +
                    "a boli nadšenými svedkami tvojho Syna Ježiša Krista,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>", "", ""},
            {"31", "Všemohúci Bože,<br>" +
                    "svätého Ignáca z Loyoly si povolal,<br>" +
                    "aby šíril väčšiu slávu tvojho mena; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme podľa jeho príkladu<br>" +
                    "a s jeho pomocou bojovali dobrý boj na zemi<br>" +
                    "a spolu s ním dostali veniec slávy v nebi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "láskavo prijmi obetné dary,<br>" +
                    "ktoré ti prinášame pri oslave svätého Ignáca, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás posvätilo v pravde<br>" +
                    "eucharistické tajomstvo,<br>" +
                    "ktoré si ustanovil za prameň všetkej svätosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "priniesli sme ti obetu chvály a ďakujeme ti,<br>" +
                    "že si svojej Cirkvi dal svätého Ignáca; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, nech nás Eucharistia posilňuje, <font color='#B71C1C'>—</font><br>" +
                    "aby sme všetko konali na tvoju väčšiu slávu<br>" +
                    "a mohli ťa večne chváliť v nebi.<br>" +
                    "Skrze Krista, nášho Pána."},
    };

    String[][] modlitba8 = {
            {"01", "Dobrotivý Bože,<br>" +
                    "svojej Cirkvi stále udeľuješ nové vzory čností; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme v horlivosti za spásu duší<br>" +
                    "kráčali po stopách svätého biskupa Alfonza <font color='#B71C1C'>—</font><br>" +
                    "a dosiahli s ním večnú odmenu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože,<br>" +
                    "svätému Alfonzovi si dal milosť<br>" +
                    "sláviť tieto tajomstvá<br>" +
                    "a v nich ti prinášať aj seba samého<br>" +
                    "ako svätú obetu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "ohňom svojho Ducha očisť a posväť i naše srdcia.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "vo svojej prozreteľnosti si povolal svätého Alfonza<br>" +
                    "za verného vysluhovateľa a apoštola Eucharistie; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby veriaci často prijímali Naj svätejšiu sviatosť<br>" +
                    "a bez prestania ti za ňu ďakovali.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"02a", "Nekonečný a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj nám silu vyznávať božstvo tvojho Syna<br>" +
                    "s vytrvalosťou svätého biskupa Euzébia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si zachovali vieru, ktorú on učil,<br>" +
                    "a vo večnosti mali účasť na sláve<br>" +
                    "tvojho Syna Ježiša Krista, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "", ""},
            {"02b", "Vznešený Bože, <font color='#B71C1C'>*</font><br>" +
                    "ty si svätého Petra Juliána vyznačil obdivuhodnou láskou<br>" +
                    "k svätým tajomstvám tela a krvi svojho Syna; <font color='#B71C1C'>—</font><br>" +
                    "milostivo daj, aby sme aj my mohli prijať bohaté ovocie<br>" +
                    "z tejto nebeskej hostiny, ako on prijímal.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"04", "Všemohúci a milosrdný Bože,<br>" +
                    "ty si obdaril svojho kňaza Jána Vianneya<br>" +
                    "horlivosťou za spásu duší; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jeho príhovor daj nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my Kristovou láskou<br>" +
                    "získavali pre teba našich bratov a sestry<br>" +
                    "a s nimi dosiahli večnú spásu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"05", "Prosíme ťa, milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "odpusť nám naše viny, <font color='#B71C1C'>—</font><br>" +
                    "a keďže sa nemôžeme spoliehať na vlastné zásluhy,<br>" +
                    "zachráň nás na orodovanie Rodičky tvojho Syna<br>" +
                    "a nášho Pána Ježiša Krista, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "", ""},
            {"06gn", "Láskavý Otče,<br>" +
                    "pri slávnom premenení tvojho jednorodeného Syna<br>" +
                    "si potvrdil pravdivosť tajomstiev našej viery<br>" +
                    "svedectvom Mojžiša a Eliáša<br>" +
                    "a naznačil si, čo očakáva nás, tvoje deti,<br>" +
                    "keď budeme navždy s tebou; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pomôž nám počúvať tvojho milovaného Syna,<br>" +
                    "aby sme dosiahli účasť na jeho sláve.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "pre slávne premenenie tvojho Syna posväť dary,<br>" +
                    "ktoré sme ti priniesli na oltár, <font color='#B71C1C'>—</font><br>" +
                    "a očisti nás od poškvrny hriechu<br>" +
                    "žiarou slávy Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov.", "Nebeský Otče,<br>" +
                    "pri slávnom premenení tvojho Syna<br>" +
                    "zjavil si nám jeho vznešenosť; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sviatostný pokrm, ktorý sme prijali,<br>" +
                    "urobil nás podobnými Ježišovi Kristovi,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov."},
            {"07a", "Všemohúci Bože,<br>" +
                    "svätého pápeža Sixta a jeho spoločníkov si obdaril silou,<br>" +
                    "že za tvoje slovo a za Ježiša Krista položili život; <font color='#B71C1C'>*</font><br>" +
                    "aj nás posilňuj Duchom Svätým, <font color='#B71C1C'>—</font><br>" +
                    "aby sme verne počúvali tvoje posolstvo<br>" +
                    "a statočne vyznávali svoju vieru.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"07b", "Dobrotivý Bože,<br>" +
                    "ty si vnukol svätému kňazovi Kajetánovi,<br>" +
                    "aby žil podľa príkladu apoštolov; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie nauč aj nás vždy dôverovať v teba <font color='#B71C1C'>—</font><br>" +
                    "a neúnavne hľadať tvoje kráľovstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"08", "Bože, milosrdný Otče,<br>" +
                    "nech tvojej Cirkvi pomáhajú zásluhy a učenie<br>" +
                    "svätého Dominika, vynikajúceho hlásateľa tvojej pravdy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "na jeho orodovanie vzbuď aj v našich časoch<br>" +
                    "presvedčivých kazateľov tvojho slova.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "na príhovor svätého Dominika<br>" +
                    "nech sú ti milé naše modlitby a obetné dary <font color='#B71C1C'>—</font><br>" +
                    "a pre túto spasiteľnú obetu<br>" +
                    "chráň a posilňuj všetkých hlásateľov evanjelia.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "posilnil si nás nebeskou sviatosťou<br>" +
                    "v deň spomienky na svätého Dominika,<br>" +
                    "ktorý svojimi kázňami priviedol Cirkev k rozkvetu; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sa Cirkev na jeho príhovor<br>" +
                    "aj dnes vzmáhala a dosiahla plný účinok tejto sviatosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"09g", "Bože našich otcov,<br>" +
                    "ty si svätú mučenicu Teréziu Benediktu<br>" +
                    "priviedol k poznaniu tvojho ukrižovaného Syna<br>" +
                    "a jeho nasledovaniu až na smrť; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby na jej príhovor<br>" +
                    "všetci ľudia spoznali Krista, Spasiteľa, <font color='#B71C1C'>—</font><br>" +
                    "a skrze neho raz večne hľadeli na teba.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane, dobrotivo prijmi<br>" +
                    "a urob dokonalými tieto obetné dary, <font color='#B71C1C'>*</font><br>" +
                    "ktoré ti prinášame<br>" +
                    "pri spomienke na tvoju mučenicu<br>" +
                    "Teréziu Benediktu; <font color='#B71C1C'>—</font><br>" +
                    "veď ty si rozličné starozákonné obety<br>" +
                    "zavŕšil jedinou a dokonalou obetou,<br>" +
                    "ktorú ti svojou krvou priniesol tvoj Syn,<br>" +
                    "ktorý žije a kraľuje na veky vekov.", "Najláskavejší Bože, <font color='#B71C1C'>*</font><br>" +
                    "keď si uctievame svätú Teréziu Benediktu prosíme ťa,<br>" +
                    "daj, aby nebeské ovocie zo stromu kríža<br>" +
                    "poskytlo našim srdciam silu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa verne pridŕžali Krista tu na zemi<br>" +
                    "a raz mohli jesť zo stromu života v raji.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"10g", "Milosrdný Bože, ohnivá láska k tebe<br>" +
                    "dala svätému diakonovi Vavrincovi silu<br>" +
                    "verne slúžiť tebe a chudobným<br>" +
                    "a bez strachu podstúpiť mučenícku smrť; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme ťa podľa jeho príkladu vrúcne milovali<br>" +
                    "a obetavo slúžili blížnym.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary, ktoré ti s radosťou prinášame<br>" +
                    "na sviatok svätého Vavrinca, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby táto eucharistická obeta<br>" +
                    "bola na spásu nám i celému svetu.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "na sviatok svätého Vavrinca sme slávili svätú obetu<br>" +
                    "a prijali Oltárnu sviatosť; <font color='#B71C1C'>—</font><br>" +
                    "nech nás tento nebeský pokrm posilní<br>" +
                    "a upevní v tvojej láske.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"11", "Dobrotivý Bože,<br>" +
                    "ty si vložil do srdca svätej Kláry<br>" +
                    "veľkú lásku k evanjeliovej chudobe; <font color='#B71C1C'>*</font><br>" +
                    "na jej príhovor nám pomáhaj<br>" +
                    "nasledovať Ježiša Krista v duchu chudoby, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si zaslúžili naveky žiť s tebou<br>" +
                    "v nebeskom kráľovstve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"12", "Dobrotivý Bože,<br>" +
                    "svätú Janu Františku priviedol si k veľkej svätosti<br>" +
                    "v rodinnom i rehoľnom živote; <font color='#B71C1C'>*</font><br>" +
                    "na jej príhovor nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme čnostne žili vo svojom povolaní<br>" +
                    "a blížnemu svietili dobrým príkladom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"13", "Pane a Bože náš, prosíme ťa, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby obdivuhodná statočnosť<br>" +
                    "svätých mučeníkov Ponciána a Hypolita <font color='#B71C1C'>—</font><br>" +
                    "ustavične v nás rozmnožovala lásku k tebe<br>" +
                    "a upevňovala svätú vieru.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"14", "Všemohúci Bože,<br>" +
                    "ty si naplnil svätého kňaza a mučeníka Maximiliána<br>" +
                    "nevšednou láskou k Nepoškvrnenej Panne Márii<br>" +
                    "a dal si mu silu, aby z lásky k nesmrteľným dušiam<br>" +
                    "položil život za svojho blížneho; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, daj, aby sme na jeho príhovor<br>" +
                    "neúnavne slúžili svojim bratom na tvoju slávu <font color='#B71C1C'>—</font><br>" +
                    "a mali silu stať sa podobnými tvojmu Synovi<br>" +
                    "aj obetovaním svojho života.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Otče, <font color='#B71C1C'>*</font><br>" +
                    "prinášame ti obetné dary<br>" +
                    "a vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa podľa príkladu svätého Maximiliána<br>" +
                    "naučili obetovať tebe aj svoj život.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane Ježišu, <font color='#B71C1C'>*</font><br>" +
                    "daj, nech v nás prijímanie tvojho tela a tvojej krvi<br>" +
                    "roznieti oheň lásky, <font color='#B71C1C'>—</font><br>" +
                    "ktorý čerpal svätý Maximilián Mária<br>" +
                    "z účasti na tejto sviatostnej hostine.<br>" +
                    "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"14gk", "Všemohúci a večný Bože,<br>" +
                    "ty si zhliadol na svoju pokornú služobnicu Pannu Máriu<br>" +
                    "a vyznačil si ju tým, že sa stala matkou tvojho večného Syna<br>" +
                    "a dnešného dňa si ju korunoval najvyššou slávou; <font color='#B71C1C'>*</font><br>" +
                    "na jej orodovanie prijmi aj nás do nebeského kráľovstva, <font color='#B71C1C'>—</font><br>" +
                    "veď si nás vykúpil smrťou a zmŕtvychvstaním<br>" +
                    "tvojho Syna, nášho Pána Ježiša Krista,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prijmi, Bože, obetu zmierenia a chvály,<br>" +
                    "ktorú slávime v predvečer slávnosti<br>" +
                    "Nanebovzatia Panny Márie; <font color='#B71C1C'>*</font><br>" +
                    "nech nám táto svätá obeta očisti srdcia<br>" +
                    "a pretvorí celý náš život, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti ustavične vzdávali vďaky.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "v predvečer sviatku Nanebovzatia Panny Márie<br>" +
                    "zhromaždil si nás pri svojom stole; <font color='#B71C1C'>*</font><br>" +
                    "na príhovor svätej Bohorodičky<br>" +
                    "pomáhaj nám na tomto svete prekonávať všetky prekážky, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli dôjsť k tebe do nebeskej vlasti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"15gk", "Všemohúci a večný Bože,<br>" +
                    "ty si vzal nepoškvrnenú Pannu Máriu, matku tvojho Syna,<br>" +
                    "s telom a dušou do nebeskej slávy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy smerovali k nebu<br>" +
                    "a mohli mať s ňou účasť na večnej blaženosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "nech stúpa k tebe naša modlitba a naša obeta <font color='#B71C1C'>*</font><br>" +
                    "a na príhovor Panny Márie, ktorú si vzal do neba,<br>" +
                    "zapáľ naše srdcia ohňom lásky, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy túžili po tebe.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "s radosťou sme prijali spásonosnú sviatosť; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, dopraj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme na orodovanie Panny Márie,<br>" +
                    "ktorú si vzal do neba,<br>" +
                    "dosiahli slávne vzkriesenie.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"16", "Všemohúci Bože,<font color='#B71C1C'>*</font><br>" +
                    "svätý Štefan, uhorský kráľ,<br>" +
                    "priviedol svoj ľud ku kresťanskej viere; <font color='#B71C1C'>—</font><br>" +
                    "daj, nech je svojmu ľudu i nám všetkým<br>" +
                    "mocným orodovníkom v nebeskom kráľovstve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"19", "Večný Bože,<br>" +
                    "ty si vyvolil svätého kňaza Jána,<br>" +
                    "aby ohlasoval nevýslovné bohatstvo Kristovho tajomstva; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme podľa jeho príkladu a učenia<br>" +
                    "stále viac poznávali teba <font color='#B71C1C'>—</font><br>" +
                    "a žili verne podľa evanjelia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"20", "Milosrdný Bože,<br>" +
                    "svätému opátovi Bernardovi si dal milosť,<br>" +
                    "aby bol svetlom v tvojej Cirkvi a horel za jej obnovu; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor naplň aj nás duchom horlivosti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme stále žili ako synovia svetla.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "s radosťou slávime Eucharistiu,<br>" +
                    "prameň jednoty a pokoja,<br>" +
                    "v deň spomienky na svätého opáta Bernarda,<br>" +
                    "vynikajúceho kazateľa a svätca,<br>" +
                    "ktorý sa zaslúžil o poriadok a svornosť v Cirkvi; <font color='#B71C1C'>—</font><br>" +
                    "prijmi naše obetné dary<br>" +
                    "a odstráň od nás všetky roztržky a nepokoje.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "nech v nás mocne pôsobí sviatostný pokrm,<br>" +
                    "ktorý sme prijali v deň spomienky na svätého Bernarda; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby nás jeho príklad a náuka<br>" +
                    "viedli k láske k tvojmu vtelenému Slovu, Ježišovi Kristovi,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov."},
            {"21", "Láskavý Bože,<br>" +
                    "svätého pápeža Pia si obdaril<br>" +
                    "nebeskou múdrosťou a apoštolskou odvahou,<br>" +
                    "aby chránil vieru Cirkvi a všetko obnovil v Kristovi; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme si z neho vzali príklad<br>" +
                    "a osvojili si jeho zásady, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli večnú odmenu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, láskavo prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby sme povzbudení odkazom<br>" +
                    "svätého pápeža Pia <font color='#B71C1C'>—</font><br>" +
                    "dôstojne slávili sväté tajomstvá<br>" +
                    "a prijímali ich so živou vierou.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "v deň spomienky na svätého pápeža Pia,<br>" +
                    "apoštola častého svätého prijímania,<br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nás nebeský chlieb, ktorý sme prijali,<br>" +
                    "upevnil vo viere a zjednotil v láske.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"22", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "Máriu, matku svojho Syna,<br>" +
                    "dal si nám za Matku a Kráľovnú; <font color='#B71C1C'>—</font><br>" +
                    "pomôž nám na jej orodovanie<br>" +
                    "dosiahnuť v nebeskom kráľovstve<br>" +
                    "plnú slávu tvojich synov a dcér.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš,<br>" +
                    "prijmi dary, ktoré ti obetujeme<br>" +
                    "pri oslave pre blahoslavenej Panny Márie; <font color='#B71C1C'>*</font><br>" +
                    "nech nám stále pomáha tvoj Syn, <font color='#B71C1C'>—</font><br>" +
                    "ktorý sa stal človekom<br>" +
                    "a obetoval sa ti na kríži<br>" +
                    "ako obeť bez poškvrny.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "na sviatok pre blahoslavenej Panny Márie,<br>" +
                    "našej Matky a Kráľovnej,<br>" +
                    "nasýtil si nás na sviatostnej hostine; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme pôsobením tejto sviatosti<br>" +
                    "dosiahli účasť na večnej hostine v nebi.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"23", "Dobrotivý Bože,<br>" +
                    "svätú Ruženu si zapálil takou veľkou láskou,<br>" +
                    "že sa zriekla sveta<br>" +
                    "a v prísnej kajúcnosti slúžila iba tebe; <font color='#B71C1C'>*</font><br>" +
                    "na jej príhovor nám pomáhaj<br>" +
                    "kráčať cestou čnostného života, <font color='#B71C1C'>—</font><br>" +
                    "aby sme raz došli k tebe,<br>" +
                    "nevyčerpateľnému prameňu večnej blaženosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"24g", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "posilňuj nás vo viere,<br>" +
                    "ktorou sa apoštol Bartolomej<br>" +
                    "úprimne oddal tvojmu Synovi, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby tvoja Cirkev na jeho orodovanie<br>" +
                    "bola účinnou sviatosťou spásy pre všetky národy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "na sviatok svätého apoštola Bartolomeja<br>" +
                    "prinášame ti na jeho česť obetu chvály; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "na jeho príhovor nám udeľ<br>" +
                    "svoju láskavú pomoc.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "na sviatok svätého apoštola Bartolomeja<br>" +
                    "sme pri tvojom stole prijali záloh večnej spásy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "nech nám toto prijímanie pomáha v časnom živote<br>" +
                    "a privedie nás do života večného.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"25a", "Všemohúci Bože,<br>" +
                    "ty si priviedol svätého Ľudovíta<br>" +
                    "zo starostí o pozemské kráľovstvo<br>" +
                    "do slávy nebeského kráľovstva; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj<br>" +
                    "svedomite si plniť povinnosti svojho povolania, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si zaslúžili večné kráľovstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"25b", "Milosrdný Bože,<br>" +
                    "svätého kňaza Jozefa si obdaril takou láskou a trpezlivosťou,<br>" +
                    "že sa neúnavne venoval mládeži<br>" +
                    "a viedol ju k čnostnému životu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj aj nám,<br>" +
                    "ktorí si ho uctievame ako učiteľa múdrosti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa jeho príkladu<br>" +
                    "privádzali mládež k poznaniu pravdy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"27", "Bože, útecha zarmútených,<br>" +
                    "ty si milosrdne vyslyšal svätú Moniku,<br>" +
                    "keď ťa so slzami v očiach vytrvalo prosila<br>" +
                    "za obrátenie svojho syna Augustína; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme aj my na príhovor obidvoch<br>" +
                    "oplakávali svoje hriechy, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli milosť tvojho odpustenia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"28", "Prosíme ťa, milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "obnov vo svojej Cirkvi ducha,<br>" +
                    "ktorým si naplnil svätého biskupa Augustína, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my túžili po tebe, prameni pravej múdrosti,<br>" +
                    "a neúnavne hľadali teba, pôvodcu večnej lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "nábožne slávime pamiatku našej spásy<br>" +
                    "a pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "premeň naše obetné dary na sviatosť,<br>" +
                    "ktorá je znamením jednoty a putom lásky.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "nech nás posvätí účasť na hostine Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa ako údy jeho tajomného tela<br>" +
                    "čoraz viac premieňali v neho.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"29", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "ty si povolal svätého Jána Krstiteľa,<br>" +
                    "aby svojím narodením a smrťou<br>" +
                    "bol predchodcom tvojho Syna; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme neohrozene vyznávali vieru v teba,<br>" +
                    "ako on položil život za pravdu a spravodlivosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "pre túto svätú obetu daj nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme bez váhania kráčali priamou cestou,<br>" +
                    "ktorú svätý Ján ukázal prorockým hlasom na púšti<br>" +
                    "a hrdinsky poznačil svojou krvou.<br>" +
                    "Skze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "pri oslave mučeníckej smrti svätého Jána Krstiteľa<br>" +
                    "prijali sme sviatosť spásy; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme túto sviatosť uctievali s hlbokou vierou <font color='#B71C1C'>—</font><br>" +
                    "a cítili jej blahodarné účinky v každodennom živote.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
    };

    String[][] modlitba9 = {
            {"03", "Milosrdný Bože,<br>" +
                    "ty odpúšťaš svojmu ľudu a s láskou nad ním vládneš; <font color='#B71C1C'>*</font><br>" +
                    "na príhovor svätého pápeža Gregora<br>" +
                    "udeľ ducha múdrosti všetkým,<br>" +
                    "čo majú účasť na vedení tvojho ľudu, <font color='#B71C1C'>—</font><br>" +
                    "aby z čnostného života veriacich<br>" +
                    "mali večnú radosť duchovní pastieri.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "v deň spomienky na svätého pápeža Gregora<br>" +
                    "prinášame ti dary na slávenie obety,<br>" +
                    "ktorou si sňal hriechy sveta; <font color='#B71C1C'>*</font><br>" +
                    "milostivo zhliadni na nás <font color='#B71C1C'>—</font><br>" +
                    "a daj, nech nám toto sväté tajomstvo<br>" +
                    "prinesie požehnanie a spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "tvoj Syn je pre nás chlebom života; <font color='#B71C1C'>*</font><br>" +
                    "daj, nech je aj naším učiteľom, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa príkladu svätého Gregora<br>" +
                    "lepšie poznávali tvoju pravdu<br>" +
                    "a dosvedčovali ju bratskou láskou.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"07", "Dobrotivý Bože,<br>" +
                    "ty si dal svojmu ľudu vo svätých košických mučeníkoch<br>" +
                    "Markovi, Melicharovi a Štefanovi<br>" +
                    "horlivých pastierov a hrdinov pravej viery; <font color='#B71C1C'>*</font><br>" +
                    "na ich príhovor dožič nám útechu v súženiach <font color='#B71C1C'>—</font><br>" +
                    "a pomôž nám utvrdzovať sa vo viere.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "prinášame ti obetné dary<br>" +
                    "pri spomienke na košických mučeníkov; <font color='#B71C1C'>*</font><br>" +
                    "posilňuj i nás vo viere, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vo všetkých protivenstvách<br>" +
                    "neohrozene vyznávali tvoje meno.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <br>" +
                    "posilnil si nás predrahým telom a krvou<br>" +
                    "svojho jednorodeného Syna; <font color='#B71C1C'>*</font><br>" +
                    "obdaruj nás milosťou, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa podľa príkladu košických mučeníkov<br>" +
                    "verne pridŕžali Ježiša Krista a jeho Cirkvi.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"08g", "Milosrdný Bože,<br>" +
                    "uštedri nám svoju nebeskú milosť, <font color='#B71C1C'>*</font><br>" +
                    "a keďže narodenie Spasiteľ a z presvätej Panny<br>" +
                    "bolo počiatkom našej spásy, <font color='#B71C1C'>—</font><br>" +
                    "nech oslava jej narodenia upevní pokoj na celom svete.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Otče,<br>" +
                    "nech nám vždy pomáha tvoj láskavý Syn,<br>" +
                    "ktorý pri svojom narodení<br>" +
                    "neporušil panenstvo svojej matky, ale ho posvätil; <font color='#B71C1C'>*</font><br>" +
                    "daj prosíme, <font color='#B71C1C'>—</font><br>" +
                    "nech aj nás tvoj Syn posvätí a chráni od hriechov<br>" +
                    "aby ti bola milá naša obeta.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.", "Dobrotivý Otče,<br>" +
                    "tvoja Cirkev ťa zvelebuje,<br>" +
                    "že si ju nasýtil sviatostným pokrmom, <font color='#B71C1C'>*</font><br>" +
                    "a s radosťou oslavuje narodenie Panny Márie, <font color='#B71C1C'>—</font><br>" +
                    "lebo v nej svitla celému svetu nádej na spásu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"09", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "ty si urobil svätého Petra sluhom otrokov<br>" +
                    "a obdaril si ho obdivuhodnou láskou<br>" +
                    "a trpezlivosťou v jeho úsilí pomôcť im; <font color='#B71C1C'>—</font><br>" +
                    "na jeho orodovanie daj,<br>" +
                    "aby sme hľadali záujmy Ježiša Krista<br>" +
                    "a blížnych milovali skutkom a pravdou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"12", "Všemohúci Bože, prosíme ťa, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby blahoslavená Panna Mária<br>" +
                    "sprostredkovala dobrodenia<br>" +
                    "tvojho milosrdenstva všetkým, <font color='#B71C1C'>—</font><br>" +
                    "čo oslavujú jej slávne meno.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Všemohúci Bože,<br>" +
                    "s radosťou oslavujeme preblahoslavenú Pannu Máriu<br>" +
                    "a osobitne uctievame jej meno; <font color='#B71C1C'>*</font><br>" +
                    "na jej orodovanie chráň nás pred časnými nebezpečenstvami <font color='#B71C1C'>—</font><br>" +
                    "a priveď nás do večnej radosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Otče nech príhovor blahoslavenej Márie vždy Panny<br>" +
                    "sprevádza naše dary <font color='#B71C1C'>*</font><br>" +
                    "a nás, čo uctievame jej meno, <font color='#B71C1C'>—</font><br>" +
                    "nech urobí milými tvojej velebnosti.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.", "Pane, daj, aby sme na orodovanie Bohorodičky Márie<br>" +
                    "dosiahli milosť tvojho požehnania <font color='#B71C1C'>*</font><br>" +
                    "a aby sme vo všetkých potrebách<br>" +
                    "získali pomoc tej, <font color='#B71C1C'>—</font><br>" +
                    "ktorej úctyhodné meno oslavujeme.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"13", "Bože, sila dúfajúcich v teba,<br>" +
                    "ty si dal svätému Ján ovi Zlatoústemu<br>" +
                    "obdivuhodnú výrečnosť<br>" +
                    "a hrdinskú odvahu v prenasledovaniach; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "osvieť našu myseľ jeho slovom<br>" +
                    "a našu vôľu povzbuď jeho nezdolnou trpezlivosťou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "zhliadni na obetné dary,<br>" +
                    "ktoré ti s radosťou prinášame v deň spomienky<br>" +
                    "na svätého Jána Zlatoústeho, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme sa podľa jeho poučenia<br>" +
                    "stali obetným darom pre teba<br>" +
                    "a celým svojím životom ťa oslavovali.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "v deň spomienky na svätého Jána Zlatoústeho<br>" +
                    "prijali sme nebeský chlieb; <font color='#B71C1C'>—</font><br>" +
                    "nech nás tento sviatostný pokrm posilní v láske k tebe<br>" +
                    "a pretvorí na verných vyznávačov tvojej pravdy.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"14gn", "Láskavý Otče,<br>" +
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
            {"15gk", "Všemohúci Bože,<br>" +
                    "ty si dal pre bolestnej Matke Márii silu,<br>" +
                    "aby stála pri tvojom ukrižovanom Synovi<br>" +
                    "a spolu s ním trpela; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj,<br>" +
                    "aby sme aj my ochotne niesli svoj každodenný kríž<br>" +
                    "v spojení s Kristom, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli účasť na jeho zmŕtvychvstaní.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "prijmi na svoju chválu naše modlitby a dary, <font color='#B71C1C'>*</font><br>" +
                    "ktoré ti obetujeme<br>" +
                    "na slávnosť Sedembolestnej Panny Márie, <font color='#B71C1C'>—</font><br>" +
                    "ktorú si nám dal za Matku,<br>" +
                    "keď stála pri Ježišovom kríži.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "s oddanou vierou sme prijali sviatosť večnej spásy<br>" +
                    "a s úctou si pripomíname účasť Panny Márie<br>" +
                    "na Kristovom vykupiteľskom utrpení; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomôž nám<br>" +
                    "vytrvalo znášať ťažkosti každodenného života, <font color='#B71C1C'>—</font><br>" +
                    "a tak dopĺňať, čo chýba Kristovmu utrpeniu<br>" +
                    "v prospech Cirkvi, jeho tajomného tela.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"16", "Večný Bože,<br>" +
                    "vo svätom pápežovi Kornéliovi<br>" +
                    "a vo svätom biskupovi Cypriánovi<br>" +
                    "dal si svojej Cirkvi horlivých duchovných pastierov<br>" +
                    "a neohrozených mučeníkov; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie upevni našu vieru <font color='#B71C1C'>—</font><br>" +
                    "a povzbuď nás k modlitbe a práci za jednotu Cirkvi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, prijmi obetné dary,<br>" +
                    "ktoré ti prinášame pri oslave mučeníckej smrti<br>" +
                    "svätého Kornélia a Cypriána; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám eucharistická obeta dala silu<br>" +
                    "prekonávať životné ťažkosti,<br>" +
                    "ako týmto mučeníkom dala odvahu<br>" +
                    "položiť život za Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov.", "Pokorne ťa prosíme, láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "týmto svätým prijímaním<br>" +
                    "upevni v nás ducha odvahy a sily, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa príkladu<br>" +
                    "svätých mučeníkov Kornélia a Cypriána<br>" +
                    "odhodlane vydávali svedectvo o pravde evanjelia.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"17", "Večný Bože,<br>" +
                    "svätého biskupa Róberta si obdaril<br>" +
                    "vynikajúcou učenosťou a nezlomnou odvahou,<br>" +
                    "aby bránil vieru tvojej Cirkvi; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie pomáhaj svojmu ľudu<br>" +
                    "zachovať si neporušenú vieru <font color='#B71C1C'>—</font><br>" +
                    "a dosvedčovať ju v každodennom živote.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"19", "Láskavý Bože,<br>" +
                    "v dnešný deň nás povolávaš osláviť<br>" +
                    "mučeníctvo svätého biskupa Januára; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme sa tešili z jeho spoločenstva<br>" +
                    "vo večnej blaženosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"20", "Milostivý Bože, stvoriteľ a spása všetkých národov, <font color='#B71C1C'>*</font><br>" +
                    "ty si v Kórei obdivuhodne povolal na katolícku vieru ľud,<br>" +
                    "ktorý si prijal za svoj,<br>" +
                    "a pre slávne vyznanie svätých mučeníkov<br>" +
                    "Ondreja, Pavla a ich spoločníkov<br>" +
                    "dal si mu rásť vo viere, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme aj my podľa ich príkladu a na ich orodovanie<br>" +
                    "vytrvali v zachovávaní tvojich prikázaní až do smrti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na obetné dary svojho ľudu <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme sa na príhovor svätých mučeníkov<br>" +
                    "stali aj my tebe milou obetou<br>" +
                    "na spásu celého sveta.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "pri oslave svätých mučeníkov<br>" +
                    "nasýtil si nás pokrmom silných; <font color='#B71C1C'>—</font><br>" +
                    "pokorne ťa prosíme,<br>" +
                    "daj, aby sme zostali pevne spojení s Kristom<br>" +
                    "a v Cirkvi pracovali na spáse všetkých ľudí.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"21g", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "vo svojom nesmiernom milosrdenstve<br>" +
                    "si mýtnika Matúša vyvolil za apoštola; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme podľa jeho príkladu a na jeho príhovor<br>" +
                    "verne kráčali za Kristom a pevne sa ho pridŕžali.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "Bože, Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "na sviatok svätého Matúša prinášame ti obetné dary<br>" +
                    "a pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "milostivo zhliadni na svoju Cirkev,<br>" +
                    "ktorej vieru apoštoli živili hlásaním evanjelia.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "prežívame duchovnú radosť,<br>" +
                    "ktorú cítil svätý Matúš,<br>" +
                    "keď vo svojom dome prijal Spasiteľa ako hosťa; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme so živou vierou<br>" +
                    "pristupovali k stolu tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "ktorý neprišiel volať a spasiť spravodlivých,<br>" +
                    "ale hriešnikov.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"22+", "Všemohúci a večný Bože,<br>" +
                    "ty si dal svätému biskupovi Emerámovi<br>" +
                    "silu trpezlivo znášať nespravodlivé obvinenie<br>" +
                    "a umrieť mučeníckou smrťou; <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám,<br>" +
                    "aby sme z lásky k tebe prekonávali všetky protivenstvá <font color='#B71C1C'>—</font><br>" +
                    "a čistým životom sa uberali k tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "v deň spomienky na svätého mučeníka Emeráma<br>" +
                    "prijmi naše obetné dary, <font color='#B71C1C'>—</font><br>" +
                    "ako si prijal<br>" +
                    "jeho neúnavnú prácu za spásu duší<br>" +
                    "a jeho mučenícke svedectvo.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Otče,<br>" +
                    "prijali sme telo a krv tvojho Syna <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, obdaruj nás takou duševnou silou, <font color='#B71C1C'>—</font><br>" +
                    "akú prejavoval svätý Emerám v tvojej službe<br>" +
                    "i pri svojom umučení.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"26", "Všemohúci Bože,<br>" +
                    "oslavujeme ťa spomienkou<br>" +
                    "na svätých mučeníkov Kozmu a Damiána,<br>" +
                    "ktorých si voviedol do večnej slávy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "sprevádzaj aj nás svojou prozreteľnosťou na ceste k tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "v deň víťaznej smrti tvojich svätých mučeníkov<br>" +
                    "slávime pamiatku obety tvojho Syna <font color='#B71C1C'>—</font><br>" +
                    "a vyznávame, že každé mučeníctvo má pôvod a silu<br>" +
                    "v tejto jedinej obete Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "v deň spomienky<br>" +
                    "na svätých mučeníkov Kozmu a Damiána<br>" +
                    "uštedril si nám pri tejto obete dary svojej milosti; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby v nás Oltárna sviatosť upevnila vernosť k tebe<br>" +
                    "a priniesla nám pokoj a spásu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"27", "Milosrdný Bože,<br>" +
                    "svätého Vincenta si obdaril apoštolskými čnosťami,<br>" +
                    "aby sa staral o chudobných a o výchovu dobrých kňazov; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, naplň aj nás apoštolskou horlivosťou, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa riadili jeho naučeniami<br>" +
                    "a nasledovali ho v láske k tebe a k blížnym.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "svätému Vincentovi si dal milosť<br>" +
                    "životom uskutočňovať,<br>" +
                    "čo slávil v týchto svätých tajomstvách; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "mocou tejto obety premeň aj nás<br>" +
                    "na príjemný dar pre teba.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "eucharistickým pokrmom posilnení vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa príkladu svätého Vincenta<br>" +
                    "a na jeho príhovor<br>" +
                    "nasledovali tvojho milovaného Syna<br>" +
                    "a ohlasovali blahozvesť chudobným.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"28a", "Bože, kráľ večnej slávy,<br>" +
                    "ty si svätého mučeníka Václava<br>" +
                    "naučil ceniť si nebeské kráľovstvo<br>" +
                    "viac ako pozemské vladárstvo; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor daj nám silu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme premáhali seba samých<br>" +
                    "a celým srdcom sa vinuli k tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"28b", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, udeľ nám takú vytrvalosť<br>" +
                    "v službe tebe a blížnemu,<br>" +
                    "akú mali tvoji svätí mučeníci Vavrinec a jeho spoločníci, <font color='#B71C1C'>—</font><br>" +
                    "lebo v tvojom kráľovstve sú blahoslavení tí, <br>" +
                    "ktorých prenasledujú pre spravodlivosť.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "", ""},
            {"29g", "Nekonečný Bože,<br>" +
                    "ty obdivuhodne určuješ úlohy anjelom i ľuďom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pošli svojich anjelov,<br>" +
                    "ktorí ti ustavične slúžia v nebi, <font color='#B71C1C'>—</font><br>" +
                    "aby nás ochraňovali v pozemskom živote.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš,<br>" +
                    "prinášame ti obetu chvály a prosíme,<br>" +
                    "nech ju anjeli prenesú pred tvoju tvár; <font color='#B71C1C'>*</font><br>" +
                    "milostivo ju prijmi <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nám bola na spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "posilnení nebeským chlebom pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám tento sviatostný pokrm<br>" +
                    "pomáhal odhodlane napredovať na ceste spásy<br>" +
                    "pod mocnou ochranou tvojich anjelov.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"30", "Všemohúci Bože,<br>" +
                    "svätého kňaza Hieronyma si obdaril láskou<br>" +
                    "a živým záujmom o Sväté písmo; <font color='#B71C1C'>*</font><br>" +
                    "otvor aj naše srdce pre tvoje slovo, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa ním živili a v ňom našli prameň života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme aj my ako svätý Hieronym<br>" +
                    "s radosťou rozjímali o tvojom slove, <font color='#B71C1C'>—</font><br>" +
                    "a tak ochotnejšie pristupovali k tvojmu oltáru<br>" +
                    "nábožne sláviť obetu spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "sviatosť, ktorú sme prijali<br>" +
                    "pri radostnej oslave svätého Hieronyma,<br>" +
                    "nech vzbudí v našich srdciach<br>" +
                    "väčšiu lásku k tvojmu slovu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ho čoraz lepšie chápali, podľa neho žili,<br>" +
                    "a tak dosiahli večnú blaženosť.<br>" +
                    "Skrze Krista, nášho Pána."},
    };

    String[][] modlitba10 = {
            {"01", "Veľký Bože,<br>" +
                    "svoje kráľovstvo otváraš pokorným a maličkým; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme s dôverou kráčali<br>" +
                    "po stopách svätej Terézie <font color='#B71C1C'>—</font><br>" +
                    "a na jej príhovor sa dostali do večnej slávy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nekonečný Bože, velebíme teba,<br>" +
                    "keď slávime pamiatku svätej panny Terézie, <font color='#B71C1C'>*</font><br>" +
                    "a pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby ti naša obeta bola taká milá,<br>" +
                    "ako ti bol milý jej obetavý život.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech toto sväté prijímanie<br>" +
                    "zapáli v nás oheň lásky, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa ti úplne oddali ako svätá Terézia<br>" +
                    "a podľa jej príkladu vyprosovali všetkým ľuďom<br>" +
                    "tvoje zľutovanie.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"02", "Láskavý Bože, vo svojej prozreteľnosti<br>" +
                    "posielaš nám svätých anjelov za strážcov; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme vždy cítili ich mocnú ochranu<br>" +
                    "a raz v ich spoločenstve prežívali večnú radosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary, ktoré ti prinášame<br>" +
                    "na počesť tvojich svätých anjelov, <font color='#B71C1C'>—</font><br>" +
                    "aby nás chránili pred nebezpečenstvami tohto sveta<br>" +
                    "a priviedli do večného života.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "v tejto vznešenej sviatosti nám dávaš pokrm<br>" +
                    "pre večný život; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pošli svojich anjelov, <font color='#B71C1C'>—</font><br>" +
                    "aby nás sprevádzali na ceste spásy a pokoja.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"04", "Bože, otec chudobných,<br>" +
                    "svätému Františkovi si dal milosť,<br>" +
                    "že sa chudobou a pokorou stal podobným Kristovi; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme aj my podľa jeho príkladu<br>" +
                    "nasledovali tvojho Syna <font color='#B71C1C'>—</font><br>" +
                    "a v láske a radosti sa zjednocovali s tebou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Otče, prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby sme tajomstvo kríža<br>" +
                    "slávili na tvojom oltári s takou láskou, <font color='#B71C1C'>—</font><br>" +
                    "s akou sa k Ukrižovanému vinul svätý František.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás Oltárna sviatosť upevní v láske k tebe<br>" +
                    "a nech v nás vzbudí horlivosť za spásu ľudí, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa ako svätý František<br>" +
                    "stali šíriteľmi kresťanskej radosti vo svete.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"06", "Všemohúci Bože,<br>" +
                    "svätého Bruna si povolal, aby ti slúžil v samote; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si v zhone tohto života<br>" +
                    "vždy našli čas pre teba.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"07", "Všemohúci Bože,<br>" +
                    "z anjelovho zvestovania vieme,<br>" +
                    "že tvoj Syn Ježiš Kristus sa stal človekom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa,<br>" +
                    "na orodovanie preblahoslavenej Panny Márie<br>" +
                    "vlej nám do duše svoju milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby nás jeho umučenie a kríž<br>" +
                    "priviedli k slávnemu vzkrieseniu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, prijmi tieto dary,<br>" +
                    "s ktorými ti obetujeme aj seba samých, <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby sme úprimne prežívali<br>" +
                    "tajomstvá tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli slávu, ktorú si nám prisľúbil.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "touto sviatostnou obetou<br>" +
                    "zvestujeme smrť a zmŕtvychvstanie tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomôž nám<br>" +
                    "znášať utrpenia v spojení s Kristom, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mali účasť aj na jeho večnej sláve.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"09a", "Dobrotivý Bože,<br>" +
                    "svätého biskupa Dionýza a jeho spoločníkov<br>" +
                    "si poslal ohlasovať evanjelium pohanom<br>" +
                    "a dal si im silu podstúpiť mučeníctvo; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na ich príhovor nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa nedali zvábiť<br>" +
                    "klamnými dobrami tohto sveta<br>" +
                    "a nebáli sa jeho protivenstiev.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"09b", "Bože, darca všetkého dobra,<br>" +
                    "ty si poslal svätého kňaza Jána Leonardiho<br>" +
                    "ohlasovať evanjelium národom; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby vždy a všade prekvitala pravá viera.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"14", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "vypočuj prosby kresťanského ľudu,<br>" +
                    "ktorý oslavuje mučenícku smrť svätého<br>" +
                    "pápeža Kalixta; <font color='#B71C1C'>—</font><br>" +
                    "pre jeho zásluhy a na jeho orodovanie<br>" +
                    "pomáhaj nám v ťažkostiach každodenného života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"15", "Všemohúci Bože,<br>" +
                    "svätú Teréziu si osvietil Duchom Svätým,<br>" +
                    "aby bola v Cirkvi učiteľkou<br>" +
                    "kresťanskej dokonalosti; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj nám neprestajne čerpať z jej duchovnej náuky<br>" +
                    "a túžiť po pravej svätosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "nech sú ti príjemné naše obetné dary, <font color='#B71C1C'>—</font><br>" +
                    "ako ti bol milý<br>" +
                    "obetavý a oddaný život svätej Terézie.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, rodinu svojich veriacich<br>" +
                    "si posilnil nebeským chlebom; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme podľa príkladu svätej Terézie<br>" +
                    "vedeli ďakovať za tento veľký dar <font color='#B71C1C'>—</font><br>" +
                    "a naveky ospevovali tvoje milosrdenstvo.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"16a", "Všemohúci Bože,<br>" +
                    "vo svätej Hedvige si dal kresťanskému ľudu<br>" +
                    "žiarivý vzor evanjeliovej pokory; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám jej mocný príhovor zaistil tvoju pomoc.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"16b", "Milosrdný Bože,<br>" +
                    "ty si dal svätej Margite nazrieť<br>" +
                    "do tajomstva lásky tvojho Syna,<br>" +
                    "ktorá prevyšuje všetko poznanie; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, aj nám daruj svojho Ducha, <font color='#B71C1C'>—</font><br>" +
                    "aby sme poznali Kristovu lásku<br>" +
                    "a mali účasť na bohatstve tvojho božského života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"17", "Všemohúci a večný Bože,<br>" +
                    "svedectvom svätých mučeníkov<br>" +
                    "ozdobuješ svoju Cirkev, Kristovo tajomné telo; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby mučenícka smrť svätého Ignáca,<br>" +
                    "ktorá jeho priviedla do večnej slávy, <font color='#B71C1C'>—</font><br>" +
                    "pre nás bola ustavičným zdrojom sily a odvahy<br>" +
                    "vo vyznávaní viery.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "láskavo prijmi obetu našej oddanosti,<br>" +
                    "ako si prijal svätého Ignáca, <font color='#B71C1C'>—</font><br>" +
                    "keď sa ti obetoval ako Kristova pšenica,<br>" +
                    "mučeníctvom rozomletá na čistý chlieb.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás občerství a posilní sviatostný chlieb,<br>" +
                    "ktorý sme prijali<br>" +
                    "v deň víťaznej smrti svätého Ignáca, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli kresťanmi nielen podľa mena,<br>" +
                    "ale aj svojím životom.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"18g", "Pane a Bože náš,<br>" +
                    "ty si poslal svätého Lukáša<br>" +
                    "ohlasovať slovom i písmom<br>" +
                    "tajomstvo tvojej lásky voči chudobným; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby všetci kresťania<br>" +
                    "boli jedno srdce a jedna duša <font color='#B71C1C'>—</font><br>" +
                    "a aby všetky národy uvideli spásu,<br>" +
                    "ktorú si im pripravil.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože,<br>" +
                    "obdaruj nás milosťou ochotne ti slúžiť, <font color='#B71C1C'>*</font><br>" +
                    "aby dary, ktoré ti prinášame<br>" +
                    "na sviatok svätého Lukáša, <font color='#B71C1C'>—</font><br>" +
                    "stali sa pre nás duchovným liekom<br>" +
                    "a pomáhali nám k večnej sláve.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás posvätí nebeský chlieb,<br>" +
                    "ktorý sme prijali z tvojho oltára, <font color='#B71C1C'>—</font><br>" +
                    "a nech nás upevní vo vernosti k evanjeliu,<br>" +
                    "ktoré ohlasoval svätý Lukáš.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"19a", "Dobrotivý Bože, ty si posvätil<br>" +
                    "prvotiny viery v krajinách severnej Ameriky<br>" +
                    "kázaním a mučeníckou krvou<br>" +
                    "svätého Jána, Izáka a ich spoločníkov; <font color='#B71C1C'>*</font><br>" +
                    "milostivo dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby na ich orodovanie<br>" +
                    "vzrastalo a prekvitalo kresťanstvo<br>" +
                    "vo všetkých končinách zeme.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"19b", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "ty si do srdca svätého kňaza Pavla<br>" +
                    "vložil veľkú lásku ku krížu tvojho Syna; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme na jeho príhovor a podľa jeho príkladu<br>" +
                    "vzali na seba každodenný kríž<br>" +
                    "a nasledovali Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "v deň spomienky na svätého Pavla z Kríža<br>" +
                    "prinášame ti obetné dary; <font color='#B71C1C'>*</font><br>" +
                    "láskavo na ne zhliadni <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme svojím životom<br>" +
                    "napodobňovali obetu tvojho Syna na kríži,<br>" +
                    "ktorú slávime v tomto tajomstve.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "v živote svätého kňaza Pavla<br>" +
                    "si nám obdivuhodne priblížil tajomstvo kríža; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme sa posilnení touto obetou<br>" +
                    "verne pridŕžali tvojho ukrižovaného Syna <font color='#B71C1C'>—</font><br>" +
                    "a v Cirkvi pracovali na spáse všetkých ľudí.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"22", "Bože, bohatý na milosrdenstvo,<br>" +
                    "ty si povolal svätého pápeža Jána Pavla II.<br>" +
                    "viesť tvoju Cirkev; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme posilnení jeho náukou<br>" +
                    "s dôverou otvorili svoje srdcia<br>" +
                    "spásnej milosti Krista, <font color='#B71C1C'>—</font><br>" +
                    "jediného Vykupiteľa človeka.<br>" +
                    "On je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"23", "Milosrdný Bože,<br>" +
                    "ty si povolal svätého Jána Kapistránskeho,<br>" +
                    "aby v krušných časoch posmeľoval kresťanský ľud;<font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, aj nám poskytuj bezpečnú ochranu <font color='#B71C1C'>—</font><br>" +
                    "a svoju Cirkev zachovaj v trvalom pokoji.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"24", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "ty si obdaril svätého biskupa Antona<br>" +
                    "veľkou láskou a trpezlivosťou<br>" +
                    "pri hlásaní evanjelia národom; <font color='#B71C1C'>—</font> <br>" +
                    "daj, aby sme aj my hľadali<br>" +
                    "najprv Božie kráľovstvo<br>" +
                    "a horlivo privádzali svojich blížnych<br>" +
                    "k tvojmu Synovi Ježišovi Kristovi,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"26gk+", "Všemohúci Bože, pre tvoju dobrotu<br>" +
                    "môžeme každoročne sláviť<br>" +
                    "deň posvätenia tohto chrámu; <font color='#B71C1C'>*</font><br>" +
                    "vyslyš prosby svojho ľudu a dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sa na tomto mieste<br>" +
                    "vždy konala tebe milá služba<br>" +
                    "a na nás hojne zostupovala milosť vykúpenia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Presvätý Bože, pripomíname si deň,<br>" +
                    "keď si svojou prítomnosťou posvätil<br>" +
                    "tento chrám vyhradený pre teba; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "prijmi dary, ktoré ti prinášame<br>" +
                    "na tomto posvätnom mieste,<br>" +
                    "a urob aj z nás tebe príjemnú obetu.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci a večný Bože,<br>" +
                    "na výročie posvätenia tohto chrámu<br>" +
                    "priniesli sme ti obetu chvály; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa,<br>" +
                    "naplň nás nebeským požehnaním a radosťou, <font color='#B71C1C'>—</font><br>" +
                    "aby naše spoločenstvo bolo vždy<br>" +
                    "dôstojnejším chrámom tvojej slávy.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"28g", "Všemohúci Bože,<br>" +
                    "pričinením svätých apoštolov<br>" +
                    "priviedol si nás k poznaniu svojho mena; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby na príhovor svätého Šimona a Júdu<br>" +
                    "stále vzrastal počet veriacich <font color='#B71C1C'>—</font><br>" +
                    "a tvoja Cirkev bola znamením spásy<br>" +
                    "pre všetky národy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože,<br>" +
                    "pripomíname si nebeskú slávu<br>" +
                    "tvojich svätých apoštolov Šimona a Júdu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, prijmi naše dary a modlitby, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dôstojne slávili sväté tajomstvá.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "prijali sme sviatostný pokrm z obety,<br>" +
                    "ktorú sme slávili na počesť mučeníkov<br>" +
                    "Šimona a Júdu; <font color='#B71C1C'>*</font><br>" +
                    "v Duchu Svätom ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "nech nás táto sviatosť a príklad tvojich apoštolov<br>" +
                    "upevní v láske k tebe.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"31gk", "Všemohúci a večný Bože,<br>" +
                    "doprial si nám radosť,<br>" +
                    "že dnešným sviatkom<br>" +
                    "môžeme osláviť zásluhy všetkých tvojich svätých; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "na príhovor toľkých orodovníkov<br>" +
                    "zahrň nás svojou milosrdnou láskou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Presvätý Otče,<br>" +
                    "prijmi obetné dary na počesť všetkých svätých,<br>" +
                    "ktorí už dosiahli nehynúcu blaženosť v nebi; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, aby sme pocítili, <font color='#B71C1C'>—</font><br>" +
                    "že nám účinne pomáhajú na ceste spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Nekonečný Bože,<br>" +
                    "dnešným sviatkom všetkých svätých<br>" +
                    "oslavujeme teba, prameň všetkej svätosti; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ťa nadovšetko milovali,<br>" +
                    "a tak mohli prejsť<br>" +
                    "od sviatostného stola pútnikov<br>" +
                    "k nebeskej hostine v spoločenstve tvojich svätých.<br>" +
                    "Skrze Krista, nášho Pána."},
    };

    String[][] modlitba11 = {
            {"01gk", "Všemohúci a večný Bože,<br>" +
                    "doprial si nám radosť,<br>" +
                    "že dnešným sviatkom<br>" +
                    "môžeme osláviť zásluhy všetkých tvojich svätých; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "na príhovor toľkých orodovníkov<br>" +
                    "zahrň nás svojou milosrdnou láskou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Presvätý Otče,<br>" +
                    "prijmi obetné dary na počesť všetkých svätých,<br>" +
                    "ktorí už dosiahli nehynúcu blaženosť v nebi; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, aby sme pocítili, <font color='#B71C1C'>—</font><br>" +
                    "že nám účinne pomáhajú na ceste spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Nekonečný Bože,<br>" +
                    "dnešným sviatkom všetkých svätých<br>" +
                    "oslavujeme teba, prameň všetkej svätosti; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ťa nadovšetko milovali,<br>" +
                    "a tak mohli prejsť<br>" +
                    "od sviatostného stola pútnikov<br>" +
                    "k nebeskej hostine v spoločenstve tvojich svätých.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"02an", "Milosrdný Bože,<br>" +
                    "vypočuj naše prosby a oživuj našu vieru<br>" +
                    "v tvojho Syna, ktorý vstal z mŕtvych, <font color='#B71C1C'>*</font><br>" +
                    "aby v nás rástla nádej, <font color='#B71C1C'>—</font><br>" +
                    "že aj našich zosnulých<br>" +
                    "vzkriesiš k večnému životu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš,<br>" +
                    "láskavo zhliadni na naše obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a všetkých verných zosnulých<br>" +
                    "prijmi do slávy svojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "s ktorým aj nás spája<br>" +
                    "táto sviatosť nesmiernej lásky.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, večný Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi do vlasti svetla a pokoja<br>" +
                    "všetkých našich zosnulých, <font color='#B71C1C'>—</font><br>" +
                    "za ktorých sme slávili<br>" +
                    "pamiatku smrti a zmŕtvychvstania Ježiša Krista,<br>" +
                    "ktorý žije a kraľuje na veky vekov."},
            {"02bn", "Bože, svetlo veriacich a život spravodlivých,<br>" +
                    "tvoj Syn nás vykúpil<br>" +
                    "svojou smrťou a zmŕtvychvstaním; <font color='#B71C1C'>*</font><br>" +
                    "zmiluj sa nad svojimi zosnulými služobníkmi,<br>" +
                    "ktorí verili vo vzkriesenie z mŕtvych, <font color='#B71C1C'>—</font><br>" +
                    "a odmeň ich večnou blaženosťou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci a milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa za tvojich zosnulých služobníkov,<br>" +
                    "ktorých si v krste priviedol k novému životu; <font color='#B71C1C'>—</font><br>" +
                    "v tejto obete obmy ich viny Kristovou krvou<br>" +
                    "a dokonale ich očisti<br>" +
                    "svojou milosrdnou láskou.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Otče,<br>" +
                    "prijali sme sviatosť tvojho jednorodeného Syna,<br>" +
                    "ktorý za nás zomrel na kríži<br>" +
                    "a slávne vstal z mŕtvych ; <font color='#B71C1C'>*</font><br>" +
                    "týmto tajomstvom nášho vykúpenia<br>" +
                    "očisti našich zosnulých bratov a sestry, <font color='#B71C1C'>—</font><br>" +
                    "aby mali účasť na sláve<br>" +
                    "vzkrieseného Ježiša Krista,<br>" +
                    "ktorý žije a kraľuje na veky vekov."},
            {"02cn", "Všemohúci Bože,<br>" +
                    "ty si povýšil do nebeskej slávy<br>" +
                    "svojho Syna, víťaza nad smrťou; <font color='#B71C1C'>*</font><br>" +
                    "daj našim zosnulým bratom a sestrám<br>" +
                    "účasť na Kristovom víťazstve nad smrťou, <font color='#B71C1C'>—</font><br>" +
                    "aby mohli večne vidieť z tváre do tváre teba,<br>" +
                    "svojho Stvoriteľa a Záchrancu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi tieto obetné dary<br>" +
                    "za všetkých našich bratov a sestry,<br>" +
                    "čo zosnuli v spojení s Kristom, <font color='#B71C1C'>—</font><br>" +
                    "a pre túto vznešenú obetu<br>" +
                    "vysloboď ich z moci smrti<br>" +
                    "a voveď do večného života.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Otče,<br>" +
                    "pri viň k sebe našich zosnulých bratov a sestry,<br>" +
                    "za ktorých sme priniesli túto obetu; <font color='#B71C1C'>*</font><br>" +
                    "a keďže si im v krste dal účasť<br>" +
                    "na svojom živote, <font color='#B71C1C'>—</font><br>" +
                    "daj im v nebi podiel<br>" +
                    "na večnej radosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"03", "Milosrdný Bože,<br>" +
                    "svätého Martina si priviedol po ceste pokory<br>" +
                    "do nebeskej slávy; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme podľa jeho príkladu<br>" +
                    "pomáhali svojim blížnym v núdzi a chorobe, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli s ním účasť<br>" +
                    "na radosti svätých v nebi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"04", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "zachovaj vo svojom ľude ducha,<br>" +
                    "ktorým si naplnil svätého biskupa Karola, <font color='#B71C1C'>—</font><br>" +
                    "aby sa tvoja Cirkev stále obnovovala,<br>" +
                    "stávala sa čoraz podobnejšia Kristovi,<br>" +
                    "a tak sprítomňovala svetu tvár tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary,<br>" +
                    "ktoré ti kladieme na oltár<br>" +
                    "v deň spomienky na svätého Karola,<br>" +
                    "bedlivého pastiera a horlivého kňaza; <font color='#B71C1C'>—</font><br>" +
                    "mocou tejto obety pomôž aj nám<br>" +
                    "prinášať v tvoj ej Cirkvi<br>" +
                    "ovocie pravého kresťanského života.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nám spásonosný pokrm, ktorý sme prijali,<br>" +
                    "dá silu ducha, <font color='#B71C1C'>—</font><br>" +
                    "ktorá svätého Karola urobila verným<br>" +
                    "v kňazskej službe<br>" +
                    "a neúnavným v láske k blížnym.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"05", "Dobrotivý Bože,<br>" +
                    "ty si svätého Imricha v kvete mladosti prijal<br>" +
                    "do spoločenstva svojich svätých; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomôž, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si uprostred pokušení tohto sveta<br>" +
                    "zachovali čistotu srdca.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"10", "Vševládny Bože,<br>" +
                    "svojej Cirkvi si dal pevný základ<br>" +
                    "na skale, ktorou je Peter,<br>" +
                    "a nikdy nedovolíš,<br>" +
                    "aby ju premohli pekelné mocnosti; <font color='#B71C1C'>*</font><br>" +
                    "na príhovor svätého pápeža Leva Veľkého<br>" +
                    "posilňuj ju v pravej viere <font color='#B71C1C'>—</font><br>" +
                    "a zachovaj v jednote a pokoji.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "pre túto svätú obetu<br>" +
                    "ukazuj svojej Cirkvi správnu cestu,<br>" +
                    "aby sa tvoj ľud duchovne vzmáhal po celej zemi, <font color='#B71C1C'>—</font><br>" +
                    "a osvecuj jeho pastierov,<br>" +
                    "aby ti ich služba bola milá.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "nasýtil si nás sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "spravuj svoju Cirkev pevnou rukou<br>" +
                    "a daruj jej múdrych pastierov, <font color='#B71C1C'>—</font><br>" +
                    "aby ti mohla slúžiť v pravej slobode<br>" +
                    "a zachovávala neporušenú vieru.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"11", "Všemohúci Bože,<br>" +
                    "svätý biskup Martin ťa oslávil<br>" +
                    "svojím životom i svojou smrťou; <font color='#B71C1C'>*</font><br>" +
                    "aj v našich srdciach konaj divy svojej milosti, <font color='#B71C1C'>—</font><br>" +
                    "aby nás ani smrť ani život<br>" +
                    "nemohli odlúčiť od tvojej lásky.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, posväť tieto dary,<br>" +
                    "ktoré ti s radosťou prinášame<br>" +
                    "pri spomienke na svätého Martina; <font color='#B71C1C'>*</font><br>" +
                    "nech nás táto obeta posilní, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v šťastí i v protivenstvách<br>" +
                    "kráčali správnou cestou.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "posilnil si nás sviatosťou jednoty; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám ochotne plniť tvoju vôľu<br>" +
                    "a úplne sa ti odovzdať ako svätý Martin, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa mohli tešiť, že patríme celkom tebe.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"11g", "Všemohúci Bože,<br>" +
                    "svätý biskup Martin ťa oslávil<br>" +
                    "svojím životom i svojou smrťou; <font color='#B71C1C'>*</font><br>" +
                    "aj v našich srdciach konaj divy svojej milosti, <font color='#B71C1C'>—</font><br>" +
                    "aby nás ani smrť ani život<br>" +
                    "nemohli odlúčiť od tvojej lásky.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, posväť tieto dary,<br>" +
                    "ktoré ti s radosťou prinášame<br>" +
                    "pri spomienke na svätého Martina; <font color='#B71C1C'>*</font><br>" +
                    "nech nás táto obeta posilní, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v šťastí i v protivenstvách<br>" +
                    "kráčali správnou cestou.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "posilnil si nás sviatosťou jednoty; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám ochotne plniť tvoju vôľu<br>" +
                    "a úplne sa ti odovzdať ako svätý Martin, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa mohli tešiť, že patríme celkom tebe.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"12", "Bože, otec všetkých veriacich,<br>" +
                    "daj svojej Cirkvi Ducha lásky,<br>" +
                    "ktorý svätému Jozafátovi dal silu<br>" +
                    "položiť život za svoj ľud; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor naplň i nás<br>" +
                    "duchom lásky a sily, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa nebáli<br>" +
                    "obetovať aj život za svojich bratov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "svojím požehnaním posväť tieto dary <font color='#B71C1C'>—</font><br>" +
                    "a posilni nás vo viere,<br>" +
                    "ktorú svätý Jozafát dosvedčil svojou krvou.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nám táto obetná hostina<br>" +
                    "dá ducha sily a pokoja, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa príkladu svätého Jozafáta<br>" +
                    "vedeli ochotne obetovať aj život<br>" +
                    "za česť a jednotu Cirkvi.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"15", "Bože, prameň všetkej múdrosti,<br>" +
                    "svätého biskupa Alberta si vyznačil tým,<br>" +
                    "že ľudskú vedu<br>" +
                    "uviedol do súladu so zjavenou pravdou; <font color='#B71C1C'>*</font><br>" +
                    "dopraj nám kráčať v šľapajach tohto učiteľa, <font color='#B71C1C'>—</font><br>" +
                    "aby nám pokrok vo vede<br>" +
                    "pomáhal lepšie poznávať a vrúcnejšie milovať teba.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"16a", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "do srdca svätej Margity, škótskej kráľovnej,<br>" +
                    "vložil si veľkú lásku k chudobným; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme na jej orodovanie a podľa jej príkladu<br>" +
                    "vo svete sprítomňovali tvoju dobrotu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"16b", "Dobrotivý Bože,<br>" +
                    "v panenskom srdci svätej Gertrúdy<br>" +
                    "pripravil si pre seba milý príbytok; <font color='#B71C1C'>*</font><br>" +
                    "na jej orodovanie rozptýľ temnoty nášho srdca<br>" +
                    "a osvieť nás svojím svetlom, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s radosťou cítili,<br>" +
                    "že v nás prebývaš a pôsobíš.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"17", "Bože, otec chudobných,<br>" +
                    "svätej Alžbete si udelil milosť,<br>" +
                    "že v chudobných<br>" +
                    "videla a uctievala samého Krista; <font color='#B71C1C'>*</font><br>" +
                    "na jej orodovanie dopraj aj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s neúnavnou láskou<br>" +
                    "pomáhali chudobným a trpiacim.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"17gk", "Bože, otec chudobných,<br>" +
                    "svätej Alžbete si udelil milosť,<br>" +
                    "že v chudobných<br>" +
                    "videla a uctievala samého Krista; <font color='#B71C1C'>*</font><br>" +
                    "na jej orodovanie dopraj aj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s neúnavnou láskou<br>" +
                    "pomáhali chudobným a trpiacim.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"18", "Nekonečný a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "neprestajne poskytuj svojej Cirkvi<br>" +
                    "ochranu svätých apoštolov Petra a Pavla,<br>" +
                    "ktorí jej prví ohlasovali evanjelium; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby na ich príhovor<br>" +
                    "rástla v tvoj ej milosti až do konca vekov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "prinášame ti dary svojej oddanosti<br>" +
                    "a vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme neporušenú zachovali náuku,<br>" +
                    "ktorú nám odovzdali svätí apoštoli Peter a Pavol.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, aby tvoj ľud,<br>" +
                    "nasýtený nebeským chlebom, <font color='#B71C1C'>—</font><br>" +
                    "s radosťou prežíval spomienku<br>" +
                    "na svätých apoštolov Petra a Pavla,<br>" +
                    "ktorých si mu dal za pastierov a ochrancov.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"20", "Bože, ty si blahoslavenú Annu posilňoval,<br>" +
                    "aby sa nebála toho, kto môže zabiť telo,<br>" +
                    "s korunoval si jej panenstvo slávou mučeníctva;<br>" +
                    "na jej príhovor udeľ aj nám odvahu<br>" +
                    "voliť si dobro a zavrhovať zlo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"21", "Dobrotivý Bože,<br>" +
                    "dnes si s úctou spomíname na najsvätejšiu Pannu,<br>" +
                    "ktorú si zahrnul darmi svojej milosti; <font color='#B71C1C'>*</font><br>" +
                    "na jej orodovanie udeľ aj nám<br>" +
                    "z bohatstva svojej dobroty, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti cez celý život<br>" +
                    "slúžili s oddaným srdcom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"22", "Dobrotivý Bože,<br>" +
                    "milostivo prijmi naše modlitby <font color='#B71C1C'>*</font><br>" +
                    "a na príhovor svätej Cecílie, panny a mučenice,<br>" +
                    "udeľ nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ťa s radostnou oddanosťou<br>" +
                    "mohli chváliť celým svojím životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"23a", "Bože, obdivuhodná sila všetkých svätých,<br>" +
                    "naplň nás radosťou<br>" +
                    "pri spomienke na svätého Klementa,<br>" +
                    "Kristovho kňaza a mučeníka; <font color='#B71C1C'>*</font><br>" +
                    "veď on nielen slávil tajomstvo viery,<br>" +
                    "ale vydal o ňom aj svedectvo svojou krvou, <font color='#B71C1C'>—</font><br>" +
                    "a evanjelium, ktoré hlásal slovom,<br>" +
                    "potvrdzoval skutkami.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"23b", "Dobrotivý Bože,<br>" +
                    "vo svätom Kolumbánovi si obdivuhodne spojil<br>" +
                    "horlivosť v šírení evanjelia<br>" +
                    "s láskou k rehoľnému životu; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa jeho príkladu<br>" +
                    "vo všetkom hľadali iba teba<br>" +
                    "a horlivo sa pričiňovali o rozvoj tvojej Cirkvi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"24", "Dobrotivý Bože,<br>" +
                    "prameň a pôvodca každého otcovstva,<br>" +
                    "ty si urobil svätých mučeníkov Ondreja a jeho spoločníkov<br>" +
                    "vernými krížu tvojho Syna až po vyliatie krvi; <font color='#B71C1C'>*</font><br>" +
                    "daj, nech na ich príhovor<br>" +
                    "šírime tvoju lásku medzi bratmi, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa mohli volať a byť tvojimi synmi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nebeský Otče,<br>" +
                    "Prijmi obetné dary, ktoré ti prinášame<br>" +
                    "Pri spomienke umučenia<br>" +
                    "Svätých vietnamských mučeníkov; <font color='#B71C1C'>*</font><br>" +
                    "Daj, aby sme ti uprostred protivenstiev nášho života<br>" +
                    "Zostali vždy verní <font color='#B71C1C'>—</font> <br>" +
                    "A aby sme sa sami stali tebe milou obetou.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože náš,<br>" +
                    "pri svätej omši si nás posilnil<br>" +
                    "pokrmom jedného chleba; <font color='#B71C1C'>*</font><br>" +
                    "pri spomienke na svätých vietnamských mučeníkov<br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme zostali jednomyseľní v tvojej láske<br>" +
                    "a dosiahli večnú odmenu trpezlivosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"25", "Bože, prameň múdrosti a sily,<br>" +
                    "svojim verným zjavuješ moc svojho milosrdenstva; <font color='#B71C1C'>*</font><br>" +
                    "na príhovor svätej Kataríny nám pomáhaj<br>" +
                    "obstáť v skúškach života <font color='#B71C1C'>—</font><br>" +
                    "a v každej núdzi nám daj pocítiť tvoju láskavú pomoc.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"30g", "Všemohúci Bože,<br>" +
                    "svojej Cirkvi si dal svätého apoštola Ondreja<br>" +
                    "za zvestovateľa viery a duchovného pastiera; <font color='#B71C1C'>*</font><br>" +
                    "vyslyš naše prosby <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby Cirkev aj v dnešných časoch<br>" +
                    "cítila moc jeho orodovania.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "na sviatok svätého Ondreja<br>" +
                    "prinášame ti obetné dary; <font color='#B71C1C'>*</font><br>" +
                    "nech sa ti páčia, keď ich predkladáme, <font color='#B71C1C'>—</font><br>" +
                    "a nech nás obživia, keď ich premenené prijmeme.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "posilni nás týmto svätým prijímaním, <font color='#B71C1C'>*</font><br>" +
                    "aby sme podľa príkladu svätého apoštola Ondreja<br>" +
                    "s láskou nasledovali ukrižovaného Krista, <font color='#B71C1C'>—</font><br>" +
                    "a tak mohli aj my dosiahnuť slávu vzkriesenia.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
    };

    String[][] modlitba12 = {
            {"03", "Bože, spása všetkých ľudí,<br>" +
                    "misionárskou činnosťou svätého<br>" +
                    "Františka Xaverského<br>" +
                    "získal si mnohé národy pre svoju Cirkev; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, naplň srdcia veriacich<br>" +
                    "horlivosťou za šírenie viery, <font color='#B71C1C'>—</font><br>" +
                    "aby tvoj a Cirkev po celom svete<br>" +
                    "rástla počtom a svätosťou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože, Pán všetkých národov, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše obetné dary<br>" +
                    "v deň spomienky na svätého Františka,<br>" +
                    "ktorý sa z túžby po spáse ľudí<br>" +
                    "odobral do ďalekých krajín ohlasovať<br>" +
                    "Kristovu blahozvesť; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme aj my boli pravými svedkami evanjelia<br>" +
                    "a s našimi bratmi a sestrami vo viere<br>" +
                    "uberali sa k tebe.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech táto sviatosť zapáli v nás oheň lásky,<br>" +
                    "akým za spásu duší horel svätý František, <font color='#B71C1C'>—</font><br>" +
                    "aby sme žili zodpovedne<br>" +
                    "svojmu kresťanskému povolaniu<br>" +
                    "a spolu s ním dosiahli odmenu<br>" +
                    "prisľúbenú svedomitým robotníkom v tvojej vinici.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"03g", "Bože, spása všetkých ľudí,<br>" +
                    "misionárskou činnosťou svätého<br>" +
                    "Františka Xaverského<br>" +
                    "získal si mnohé národy pre svoju Cirkev; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, naplň srdcia veriacich<br>" +
                    "horlivosťou za šírenie viery, <font color='#B71C1C'>—</font><br>" +
                    "aby tvoj a Cirkev po celom svete<br>" +
                    "rástla počtom a svätosťou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože, Pán všetkých národov, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše obetné dary<br>" +
                    "v deň spomienky na svätého Františka,<br>" +
                    "ktorý sa z túžby po spáse ľudí<br>" +
                    "odobral do ďalekých krajín ohlasovať<br>" +
                    "Kristovu blahozvesť; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme aj my boli pravými svedkami evanjelia<br>" +
                    "a s našimi bratmi a sestrami vo viere<br>" +
                    "uberali sa k tebe.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech táto sviatosť zapáli v nás oheň lásky,<br>" +
                    "akým za spásu duší horel svätý František, <font color='#B71C1C'>—</font><br>" +
                    "aby sme žili zodpovedne<br>" +
                    "svojmu kresťanskému povolaniu<br>" +
                    "a spolu s ním dosiahli odmenu<br>" +
                    "prisľúbenú svedomitým robotníkom v tvojej vinici.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"04a", "Všemohúci Bože, vo svätom Jánovi Damascénskom<br>" +
                    "si dal Cirkvi vynikajúceho učiteľa; <font color='#B71C1C'>*</font><br>" +
                    "poskytuj nám na jeho príhovor stálu pomoc, <font color='#B71C1C'>—</font><br>" +
                    "aby pravá viera, ktorú tak presvedčivo hlásal,<br>" +
                    "bola nám vždy prameňom svetla a sily.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"06", "Bože, darca každého dobra,<br>" +
                    "na príhovor svätého biskupa Mikuláša<br>" +
                    "pomáhaj nám v každej núdzi<br>" +
                    "a chráň nás pred každým nešťastím; <font color='#B71C1C'>*</font><br>" +
                    "daj nám veľkodušné srdce, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ochotne dávali iným, čo prijímame od teba,<br>" +
                    "a tak bezpečne kráčali po ceste spásy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"07", "Dobrotivý Bože,<br>" +
                    "vo svätom biskupovi Ambrózovi<br>" +
                    "dal si nám vynikajúceho učiteľa katolíckej viery<br>" +
                    "a vzor apoštolskej odvahy; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aj v našich dňoch pošli svojej Cirkvi<br>" +
                    "duchovných pastierov podľa tvojho srdca,<br>" +
                    "aby ju spravovali múdro a neohrozene.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás pri slávení tejto božskej obety<br>" +
                    "naplní svetlom viery Duch Svätý, <font color='#B71C1C'>—</font><br>" +
                    "ktorý svätého Ambróza povzbudzoval<br>" +
                    "k horlivému šíreniu tvojej pravdy a slávy.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "na sviatostnej hostine<br>" +
                    "si nás posilnil chlebom z neba; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme podľa príkladu svätého Ambróza<br>" +
                    "neochvejne kráčali po tvojich cestách<br>" +
                    "a pripravovali sa na radostnú hostinu vo večnosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"11", "Pane a Bože náš,<br>" +
                    "tvoj služobník svätý pápež Damaz<br>" +
                    "bol veľkým ctiteľom mučeníkov<br>" +
                    "a horlivo šíril ich úctu; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme podľa jeho príkladu<br>" +
                    "aj my obdivovali ich hrdinské skutky <font color='#B71C1C'>—</font><br>" +
                    "a neochvejne vyznávali svoju vieru.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"13", "Milosrdný Bože,<br>" +
                    "na mocný príhovor svätej panny a mučenice Lucie<br>" +
                    "naplň nás svojím svetlom a radosťou <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby sme na zemi podľa jej príkladu<br>" +
                    "žili ako deti svetla <font color='#B71C1C'>—</font><br>" +
                    "a vo večnosti mali s ňou účasť na tvojej sláve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"14", "Všemohúci Bože,<br>" +
                    "svätého kňaza Jána si obdaril<br>" +
                    "mimoriadnou silou k sebazapieraniu<br>" +
                    "a vynikajúcou láskou ku krížu; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme nasledovali jeho príklad <font color='#B71C1C'>—</font><br>" +
                    "a navždy sa spojili s tebou v nebeskej sláve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože, milosrdný Otče,<br>" +
                    "v deň spomienky na svätého Jána z Kríža<br>" +
                    "prinášame ti obetné dary; <font color='#B71C1C'>*</font><br>" +
                    "láskavo na ne zhliadni <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme vo svojom živote<br>" +
                    "napodobňovali obetu tvojho Syna na kríži,<br>" +
                    "ktorej pamiatku nábožne slávime.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "v živote svätého kňaza Jána<br>" +
                    "si nám obdivuhodne priblížil tajomstvo kríža; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme sa posilnení touto obetou<br>" +
                    "verne pridŕžali tvojho ukrižovaného Syna <font color='#B71C1C'>—</font><br>" +
                    "a v Cirkvi pracovali na spáse všetkých ľudí.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"17", "Všemohúci Bože, Stvoriteľ a Vykupiteľ človeka,<br>" +
                    "tvoje večné Slovo<br>" +
                    "sa v lone panenskej matky stalo telom; <font color='#B71C1C'>*</font><br>" +
                    "láskavo vypočuj naše prosby a dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby nám tvoj jednorodený Syn,<br>" +
                    "ktorý prijal našu ľudskú prirodzenosť,<br>" +
                    "dal účasť na svojom božskom živote.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože,<br>" +
                    "posväť dary svojej Cirkvi, <font color='#B71C1C'>*</font><br>" +
                    "aby sme sa pri slávení tejto svätej obety <font color='#B71C1C'>—</font><br>" +
                    "mohli posilniť nebeským chlebom.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "nasýtil si nás sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, zapáľ v nás oheň svojho Ducha,<br>" +
                    "aby sme žiarili ako jasné svetlá, <font color='#B71C1C'>—</font><br>" +
                    "keď príde tvoj Syn Ježiš Kristus,<br>" +
                    "ktorý žije a kraľuje na veky vekov."},
            {"18", "Všemohúci Bože,<font color='#B71C1C'>*</font><br>" +
                    "ešte stále na nás doliehajú<br>" +
                    "následky prvotného hriechu; <font color='#B71C1C'>—</font><br>" +
                    "prosíme ťa, nech nám prinesie pravú slobodu<br>" +
                    "očakávané narodenie tvojho milovaného Syna.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš,<br>" +
                    "nech obeta, ktorú slávime,<br>" +
                    "urobí nás tebe milými <font color='#B71C1C'>*</font><br>" +
                    "a nech nám dá účasť na večnom živote tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "ktorý sa stal človekom,<br>" +
                    "aby nám svojou smrťou zaslúžil nesmrteľnosť.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "preukáž nám svoje milosrdenstvo<br>" +
                    "v tomto svätom chráme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa účasťou na bohoslužbách<br>" +
                    "náležite pripravili na blízke sviatky nášho vykúpenia.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"19", "Večný Bože,<br>" +
                    "narodením tvojho Syna z presvätej Panny<br>" +
                    "zjavil si svetu jas svojej slávy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme toto nevýslovné tajomstvo vtelenia<br>" +
                    "uctievali so živou vierou<br>" +
                    "a oslavovali s úprimnou oddanosťou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na obetné dary,<br>" +
                    "ktoré kladieme na tvoj oltár, <font color='#B71C1C'>—</font><br>" +
                    "a svojou mocou posväť to,<br>" +
                    "čo ti my, krehkí ľudia, ochotne obetujeme.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "vzdávame ti vďaky za udelené dary <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "očisti naše srdcia<br>" +
                    "a vzbuď v nás túžbu po prisľúbenej spáse,<br>" +
                    "aby sme dôstojne oslávili<br>" +
                    "narodenie nášho Spasiteľa,<br>" +
                    "ktorý žije a kraľuje na veky vekov."},
            {"20", "Nebeský Otče,<br>" +
                    "nepoškvrnená Panna Mária<br>" +
                    "pri anjelovom zvestovaní prijala večné Slovo<br>" +
                    "a naplnená svetlom Ducha Svätého<br>" +
                    "stala sa Božím príbytkom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa jej príkladu<br>" +
                    "aj my ochotne plnili tvoju vôľu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "láskavo zhliadni na túto vznešenú obetu <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby sme účasťou<br>" +
                    "na eucharistickom tajomstve <font color='#B71C1C'>—</font><br>" +
                    "dosiahli nebeské dary, ktoré s vierou očakávame.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "svojou božskou mocou ochraňuj svojich verných,<br>" +
                    "ktorých si nasýtil nebeským pokrmom, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nám účasť na sviatostnej hostine<br>" +
                    "priniesla radosť a pravý pokoj.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"21", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "láskavo vyslyš prosby svojho ľudu,<br>" +
                    "ktorý s radosťou očakáva príchod<br>" +
                    "tvojho jednorodeného Syna v ľudskom tele; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme dosiahli odmenu večného života,<br>" +
                    "keď znova príde vo svojej sláve.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo prijmi dary,<br>" +
                    "ktoré si nám poskytol,<br>" +
                    "aby sme ti ich mohli priniesť na obetu, <font color='#B71C1C'>—</font><br>" +
                    "a svojou božskou mocou ich premeň<br>" +
                    "na sviatosť našej spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "účasť na eucharistickej obete<br>" +
                    "nech je tvojmu ľudu ustavičnou ochranou; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj, aby sme ti oddane slúžili, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli spásu tela i duše.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"21a", "Všemohúci Bože,<br>" +
                    "svätého kňaza Petra Kanízia<br>" +
                    "si obdaril vynikajúcou učenosťou a veľkou odvahou<br>" +
                    "pri obrane katolíckej viery; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor pomáhaj všetkým,<br>" +
                    "čo hľadajú pravdu,<br>" +
                    "aby s radosťou našli teba, <font color='#B71C1C'>—</font><br>" +
                    "a svojim veriacim udeľ vytrvalosť<br>" +
                    "a neohrozenosť vo viere.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"22", "Milosrdný Otče, príchodom tvojho Syna<br>" +
                    "vyslobodil si človeka z moci hriechu a smrti; <font color='#B71C1C'>*</font><br>" +
                    "udeľ nám veriacim milosť,<br>" +
                    "aby sme pokorne a nábožne vyznávali<br>" +
                    "tajomstvo Kristovho vtelenia <font color='#B71C1C'>—</font><br>" +
                    "a v spoločenstve s naším Spasiteľom<br>" +
                    "našli večnú spásu.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože,<br>" +
                    "s dôverou v tvoju dobrotivosť<br>" +
                    "prichádzame s darmi k svätému oltáru; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nás očistila tvoja milosť <font color='#B71C1C'>—</font><br>" +
                    "a posvätila obeta, ktorú konáme.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "nech nás posilní prijatá sviatosť, <font color='#B71C1C'>*</font><br>" +
                    "aby sme, bohatí na dobré skutky,<br>" +
                    "s dôverou mohli ísť v ústrety Spasiteľovi <font color='#B71C1C'>—</font><br>" +
                    "a zaslúžili si odmenu večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"23", "Všemohúci a večný Bože,<br>" +
                    "už sú blízko sviatky narodenia tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, nech nám, nehodným služobníkom,<br>" +
                    "'preukáže svoju milosrdnú lásku<br>" +
                    "tvoje večné Slovo, Ježiš Kristus, <font color='#B71C1C'>—</font><br>" +
                    "ktorý si vzal telo z Panny Márie<br>" +
                    "a prebýval medzi nami.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "táto obeta, ktorú si nám dal<br>" +
                    "ako najdokonalejšiu bohoslužbu, <font color='#B71C1C'>*</font><br>" +
                    "nech nás u zmieri s tebou, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s očisteným srdcom<br>" +
                    "slávili narodenie nášho Vykupiteľa,<br>" +
                    "ktorý žije a kraľuje na veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "nebeský pokrm, ktorým si nás nasýtil,<br>" +
                    "nech nám prinesie tvoj pokoj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme so zažatými lampami<br>" +
                    "kráčali v ústrety tvojmu milovanému Synovi,<br>" +
                    "ktorý žije a kraľuje na veky vekov."},
            {"23a", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nám príklad svätého Jána Kentského pomáha<br>" +
                    "rásť v múdrosti svätých, <font color='#B71C1C'>—</font><br>" +
                    "aby sme preukazovali milosrdenstvo všetkým,<br>" +
                    "a tak dosiahli tvoje odpustenie.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"24", "Pane Ježišu, príď už a nemeškaj, <font color='#B71C1C'>*</font><br>" +
                    "a svojím príchodom poteš a posilni tých, <font color='#B71C1C'>—</font><br>" +
                    "čo dôverujú v tvoju dobrotu.<br>" +
                    "Lebo ty si Boh a žiješ a kraľuješ s Bohom Otcom<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš,<br>" +
                    "láskavo prijmi tieto obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a premeň ich na sviatostný pokrm,<br>" +
                    "ktorý očistí naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s radosťou mohli očakávať<br>" +
                    "slávny príchod tvojho Syna,<br>" +
                    "ktorý žije a kraľuje na veky vekov.", "Štedrý Bože,<br>" +
                    "posilnil si nás nebeským chlebom; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme dôstojne oslávili<br>" +
                    "sviatok narodenia tvojho Syna <font color='#B71C1C'>—</font><br>" +
                    "a v deň jeho slávneho príchodu<br>" +
                    "dosiahli večnú radosť.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"24gkn", "Najláskavejší Otče,<br>" +
                    "z tvojej dobroty každý rok radostne očakávame<br>" +
                    "sviatky našej spásy; <font color='#B71C1C'>*</font><br>" +
                    "daj nám s čistým srdcom privítať tvojho Syna,<br>" +
                    "keď nás prichádza vykúpiť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme bez obáv hľadeli na neho,<br>" +
                    "keď nás raz príde súdiť.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože,<br>" +
                    "prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a pomôž nám dôstojne sláviť<br>" +
                    "tajomstvo narodenia tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "ktoré je začiatkom nášho vykúpenia.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás duchovne obrodí výročná slávnosť<br>" +
                    "narodenia tvojho milovaného Syna, <font color='#B71C1C'>—</font><br>" +
                    "ktorý sa nám v tejto sviatosti dáva za pokrm a nápoj.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"25agkn", "Večný Bože, v túto presvätú noc<br>" +
                    "nám zažiarilo pravé svetlo, Ježiš Kristus; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj, aby sme s vierou prijali<br>" +
                    "svetlo jeho pravdy, <font color='#B71C1C'>—</font><br>" +
                    "a v nebi mali blaživú účasť na jeho sláve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, Bože,<br>" +
                    "nech ti je milá naša vianočná obeta, <font color='#B71C1C'>*</font><br>" +
                    "aby sme touto tajomnou výmenou darov<br>" +
                    "dosiahli účasť na božskom živote tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "v ktorom je naša ľudská prirodzenosť<br>" +
                    "spojená s tvojím božstvom.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "radostne slávime narodenie nášho Vykupiteľa <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, daj nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme žili príkladným kresťanským životom,<br>" +
                    "a tak sa dostali do jeho spoločenstva v nebi.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"25bgkn", "Všemohúci Bože,<br>" +
                    "tvoje vtelené Slovo Ježiš Kristus<br>" +
                    "preniká nás novým svetlom; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby viera v neho, ktorá osvecuje našu myseľ,<br>" +
                    "žiarila aj z našich skutkov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nebeský Otče, prosíme ťa,<br>" +
                    "požehnaj naše obetné dary,<br>" +
                    "aby zvýrazňovali tajomstvo dnešného dňa: <font color='#B71C1C'>*</font><br>" +
                    "ako sa nám v slabom dieťati Ježišovi zjavil Boh, <font color='#B71C1C'>—</font><br>" +
                    "tak nech nám tieto skromné dary chleba a vína<br>" +
                    "sprostredkujú účasť na Božom živote.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Bože,<br>" +
                    "s radosťou oslavujeme narodenie tvojho Syna <font color='#B71C1C'>*</font><br>" +
                    "a vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme toto nevýslovné tajomstvo<br>" +
                    "poznávali so živou vierou<br>" +
                    "a prežívali ho čoraz s väčšou láskou.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"25cgkn", "Všemohúci Otče,<br>" +
                    "ty si podivuhodne stvoril človeka<br>" +
                    "a ešte podivuhodnejšie si ho vykúpil; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj nám účasť na božskom živote svojho Syna,<br>" +
                    "ktorý prijal našu ľudskú prirodzenosť.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "nech ti je milá dnešná slávnostná obeta, <font color='#B71C1C'>*</font><br>" +
                    "ktorá nás dokonale zmieruje s tebou <font color='#B71C1C'>—</font><br>" +
                    "a je najvyšším prejavom našej služby<br>" +
                    "na tvoju česť a slávu.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nám Spasiteľ sveta, ktorý sa dnes narodil<br>" +
                    "a urobil nás tvojimi deťmi, <font color='#B71C1C'>—</font><br>" +
                    "dá aj účasť na večnom živote.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"26g", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "pri oslave víťaznej smrti svätého Štefana,<br>" +
                    "prvého mučeníka tvojej Cirkvi,<br>" +
                    "ktorý sa modlil za svojich mučiteľov,<br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj nám silu, aby sme podľa jeho príkladu<br>" +
                    "milovali aj svojich nepriateľov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "pri oslave prvého mučeníka svätého Štefana<br>" +
                    "láskavo prijmi tieto dary, <font color='#B71C1C'>—</font><br>" +
                    "s ktorými sa ti ochotne aj my oddávame.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "ďakujeme ti za toľké prejavy<br>" +
                    "tvojho milosrdenstva, <font color='#B71C1C'>*</font><br>" +
                    "lebo narodením Ježiša Krista nám dávaš spásu <font color='#B71C1C'>—</font><br>" +
                    "a oslavou prvého mučeníka Štefana nás povzbudzuješ,<br>" +
                    "aby sme sa vždy odvážne hlásili k tvojmu Synovi,<br>" +
                    "ktorý žije a kraľuje na veky vekov."},
            {"27g", "Všemohúci Bože,<br>" +
                    "prostredníctvom svätého Jána apoštola<br>" +
                    "zjavil si nám tajomstvo tvojho večného Slova; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s osvietenou mysľou<br>" +
                    "a s milujúcim srdcom pochopili učenie,<br>" +
                    "ktoré nám tak vzletne hlásal.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "posväť naše obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby sme účasťou na posvätnej hostine<br>" +
                    "stále viac poznávali tajomstvá večného Slova, <font color='#B71C1C'>—</font><br>" +
                    "ktoré si pri Poslednej večeri<br>" +
                    "zjavil svojmu apoštolovi Jánovi.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "svätý apoštol Ján ohlasoval,<br>" +
                    "že tvoje Slovo sa stalo telom pre našu spásu; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby skrze posvätné tajomstvo,<br>" +
                    "ktoré sme slávili,<br>" +
                    "stále prebýval v nás tvoj Syn Ježiš Kristus,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov."},
            {"28g", "Nebeský Otče,<br>" +
                    "dnes ťa betlehemské deti oslávili<br>" +
                    "nie slovami, ale mučeníckou smrťou; <font color='#B71C1C'>*</font><br>" +
                    "udeľ nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vieru, ktorú vyznávame ústami,<br>" +
                    "dosvedčovali aj svojím životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš,<br>" +
                    "prijmi obetné dary,<br>" +
                    "ktoré ti prinášame s čistým a úprimným srdcom <font color='#B71C1C'>*</font><br>" +
                    "a očisť nás obetou svojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "pre ktorú dávaš milosť spásy aj ľuďom,<br>" +
                    "čo ťa nepoznajú.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.", "Bože a Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "pre zásluhy narodenia tvojho Syna<br>" +
                    "dal si betlehemským deťom korunu mučeníctva,<br>" +
                    "hoci ešte neboli schopné vyznať vieru v neho; <font color='#B71C1C'>—</font><br>" +
                    "nech nám Kristus,<br>" +
                    "pre ktorého vyliali nevinnú krv,<br>" +
                    "udelí v tejto sviatosti plnosť spásy.<br>" +
                    "O to ťa prosíme Skrze Krista, nášho Pána."},
            {"29", "Všemohúci a neviditeľný Bože,<br>" +
                    "príchodom Ježiša Krista, pravého svetla,<br>" +
                    "rozptýlil si temnoty sveta; <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo pozri na nás <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme dôstojne oslavovali<br>" +
                    "narodenie tvojho Syna.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Otče, prijmi tieto dary,<br>" +
                    "ktorými sa uskutočňuje vznešená výmena: <font color='#B71C1C'>*</font><br>" +
                    "my ti obetujeme z toho, čo si nám uštedril, <font color='#B71C1C'>—</font><br>" +
                    "a ty nám dávaš seba samého<br>" +
                    "vo svojom Synovi Ježišovi Kristovi,<br>" +
                    "ktorý žije a kraľuje na veky vekov.", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nám nebeský pokrm, ktorý sme prijali, <font color='#B71C1C'>—</font><br>" +
                    "bol stálou posilou na ceste k tebe.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"29a", "Všemohúci Bože,<br>" +
                    "svätému Tomášovi Becketovi si dal milosť<br>" +
                    "veľkodušne obetovať svoj život<br>" +
                    "za spravodlivosť a slobodu Cirkvi; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme aj my z lásky ku Kristovi<br>" +
                    "boli ochotní stratiť svoj život na tomto svete, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ho znovu našli v nebeskom kráľovstve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"30", "Všemohúci Bože,<br>" +
                    "pre zásluhy narodenia tvojho milovaného Syna <font color='#B71C1C'>*</font><br>" +
                    "vysloboď nás zo starého otroctva, <font color='#B71C1C'>—</font><br>" +
                    "ktoré nás drží v jarme hriechu.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary svojho ľudu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme touto eucharistickou obetou<br>" +
                    "dosiahli dobrá,<br>" +
                    "po ktorých so synovskou dôverou túžime.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "láskavo sa stretávaš s nami<br>" +
                    "v Najsvätejšej sviatosti; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby jej sila<br>" +
                    "neprestajne účinkovala v našich srdciach <font color='#B71C1C'>—</font><br>" +
                    "a uspôsobila nás na prijatie ďalších milostí.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"31", "Dobrotivý Otče,<br>" +
                    "narodenie tvojho Syna utvorilo nový<br>" +
                    "a dokonalý vzťah ľudí k tebe; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa,<br>" +
                    "daj, aby sme aj my patrili medzi jeho verných, <font color='#B71C1C'>—</font><br>" +
                    "lebo on je Spasiteľ celého ľudstva.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože, pôvodca úprimnej nábožnosti<br>" +
                    "a darca pokoja, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme ťa dôstojne uctili našimi darmi <font color='#B71C1C'>—</font><br>" +
                    "a účasťou na eucharistickom tajomstve<br>" +
                    "upevnili medzi sebou zväzky bratskej jednoty.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "ty mnohorakým spôsobom<br>" +
                    "vedieš a posilňuješ svoj ľud;<br>" +
                    "<font color='#B71C1C'>(</font>aj v uplynulom roku<br>" +
                    "si nás sprevádzal na životnej ceste;<font color='#B71C1C'>) *</font><br>" +
                    "otcovsky nás ochraňuj teraz i v budúcnosti <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás radosť z pozemských dohier<br>" +
                    "pobádala väčšmi sa usilovať<br>" +
                    "o hodnoty večné.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"31a", "Bože, Pán časov, <font color='#B71C1C'>*</font><br>" +
                    "na príhovor svätého pápeža Silvestra<br>" +
                    "nám pomáhaj <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa v pozemskom živote riadili tvojou vôľou<br>" +
                    "a dosiahli nehynúcu blaženosť vo večnosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "", ""},
            {"31gk", "Večný Otče,<br>" +
                    "narodením tvojho Syna z Panny Márie<br>" +
                    "poskytol si ľuďom večnú spásu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme vždy pociťovali účinky jej orodovania,<br>" +
                    "veď skrze ňu sme dostali Pôvodcu života,<br>" +
                    "Ježiša Krista,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "ty láskavo začínaš a dovršuješ každé dobré dielo; <font color='#B71C1C'>*</font><br>" +
                    "na tento radostný sviatok Božej Matky<br>" +
                    "oslavujeme začiatok našej spásy <font color='#B71C1C'>—</font><br>" +
                    "a prosíme, aby sa v nás zavŕšila v plnej miere.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nadšene vyznávame, že blahoslavená Panna Mária<br>" +
                    "je Rodičkou tvojho Syna a Matkou Cirkvi, <font color='#B71C1C'>—</font><br>" +
                    "a prosíme, aby nám nebeský pokrm,<br>" +
                    "ktorý sme s radosťou prijali,<br>" +
                    "slúžil pre večný život.<br>" +
                    "Skrze Krista, nášho Pána."},
    };
}