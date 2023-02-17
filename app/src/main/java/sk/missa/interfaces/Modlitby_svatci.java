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
            {"60gkp", "", "Bože, tvoj Syn dnes <br>" +
                    "pred zrakom apoštolov vystúpil do neba; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, aby sme podľa jeho prísľubu <br>" +
                    "vždy pociťovali jeho prítomnosť na zemi <font color='#B71C1C'>—</font><br>" +
                    "a zaslúžili si dôjsť do spoločenstva s ním v nebi.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Bože, tvoj jednorodený Syn <br>" +
                            "a náš Veľkňaz je večne živý a sedí <br>" +
                            "po tvojej pravici, aby sa za nás prihováral; <font color='#B71C1C'>*</font><br>" +
                            "dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme pristupovali k trónu milosti <br>" +
                            "s dôverou, že získame tvoje milosrdenstvo.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech dary, ktoré sme prijali z tvojho oltára, <br>" +
                            "zapália v nás túžbu po nebeskej vlasti <font color='#B71C1C'>*</font><br>" +
                            "a nech nám pomáhajú nasledovať svojho Spasiteľa <font color='#B71C1C'>—</font><br>" +
                            "a dôjsť tam, kam nás on sám predišiel.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"6gkp", "", "Všemohúci Bože, <br>" +
                    "naplň nás svätou radosťou a vďačnosťou, <br>" +
                    "lebo nanebovstúpenie tvojho Syna <br>" +
                    "je aj naším víťazstvom; <font color='#B71C1C'>*</font><br>" +
                    "pevne dúfame, že aj my, ako jeho tajomné telo, <br>" +
                    "vojdeme do večnej slávy, <font color='#B71C1C'>—</font><br>" +
                    "kam nás predišiel on, naša Hlava.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Všemohúci Bože, <br>" +
                    "veríme, že dnes tvoj jednorodený Syn <br>" +
                    "a náš Vykupiteľ vystúpil do neba; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my túžili po nebeskom domove. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Večný Bože, na slávnosť <br>" +
                            "nanebovstúpenia tvojho Syna <br>" +
                            "pokorne ti prinášame túto obetu; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby táto presvätá výmena <br>" +
                            "upriamila našu myseľ na nebo.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci a večný Bože, <br>" +
                            "už na zemi nám umožňuješ <br>" +
                            "prežívať božské tajomstvá; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, naplň naše srdcia <br>" +
                            "vrúcnou túžbou žiť s osláveným Kristom, <font color='#B71C1C'>—</font><br>" +
                            "v ktorom naša ľudská prirodzenosť <br>" +
                            "už prebýva u teba.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"2gkp", "", "Všemohúci a večný Bože, <br>" +
                    "v posvätnom okruhu päťdesiatich dní <br>" +
                    "sa podľa tvojej vôle zavŕšilo veľkonočné tajomstvo; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, nebeskou milosťou zjednoť všetky národy, <font color='#B71C1C'>—</font><br>" +
                    "aby ľudia rozličných jazykov <br>" +
                    "spoločne vyznávali tvoje meno.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Prosíme ťa, všemohúci Bože,<br>" +
                    "nech sa nad nami zaskvie jas tvojej slávy <font color='#B71C1C'>*</font><br>" +
                    "a Kristus, svetlo zo svetla, nech Duchom Svätým <br>" +
                    "posilní srdcia všetkých, <font color='#B71C1C'>—</font><br>" +
                    "ktorí sa tvojou milosťou znovuzrodili k novému životu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "posväť tieto obetné dary svojím Duchom <font color='#B71C1C'>*</font><br>" +
                            "a skrze ne udeľ svojej Cirkvi takú lásku, <font color='#B71C1C'>—</font><br>" +
                            "aby celému svetu zažiarila <br>" +
                            "pravda spásonosného tajomstva.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech nám prijaté <br>" +
                            "sviatostné dary pomáhajú, <font color='#B71C1C'>*</font><br>" +
                            "aby sme ustavične planuli Duchom Svätým, <font color='#B71C1C'>—</font><br>" +
                            "ktorým si zázračne naplnil svojich apoštolov.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"3gkp", "", "Bože, tajomstvom dnešnej slávnosti <br>" +
                    "posväcuješ svoju Cirkev <br>" +
                    "vo všetkých krajinách a národoch; <font color='#B71C1C'>*</font><br>" +
                    "naplň celý svet darmi Ducha Svätého <font color='#B71C1C'>—</font><br>" +
                    "a v srdciach svojich veriacich <br>" +
                    "obnovuj aj teraz veľké skutky svojej lásky, <br>" +
                    "ktoré si konal pri prvom hlásaní evanjelia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby nám Duch Svätý, <br>" +
                            "podľa prisľúbenia tvojho Syna, <br>" +
                            "pomáhal stále lepšie chápať tajomstvo tejto obety <font color='#B71C1C'>—</font><br>" +
                            "a priviedol nás k plnému poznaniu pravdy.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Bože, ty štedro dávaš <br>" +
                            "svojej Cirkvi nebeské dary; <font color='#B71C1C'>*</font><br>" +
                            "zachovaj milosť, ktorú si nám daroval, <br>" +
                            "aby dar Ducha Svätého <br>" +
                            "ustavične pôsobil v našich srdciach <font color='#B71C1C'>—</font><br>" +
                            "a sviatostný pokrm zveľaďoval <br>" +
                            "v nás dielo večnej spásy.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"0gkp", "", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby tajomstvo ľudskej spásy, <br>" +
                    "ktorej počiatok si zveril do dôvernej <br>" +
                    "starostlivosti svätého Jozefa, <font color='#B71C1C'>—</font><br>" +
                    "na jeho príhovor tvoja Cirkev <br>" +
                    "neustále udržiavala a viedla k naplneniu. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, svätý Jozef oddane a s láskou <br>" +
                            "slúžil tvojmu jednorodenému Synovi <br>" +
                            "narodenému z Panny Márie; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ti aj my mohli s čistým srdcom <br>" +
                            "slúžiť pri tvojom oltári.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, ustavične ochraňuj svoju rodinu, <font color='#B71C1C'>*</font><br>" +
                            "ktorá sa teší z toho, že si ju na slávnosť svätého Jozefa <br>" +
                            "nasýtil pokrmom zo svojho oltára, <font color='#B71C1C'>—</font><br>" +
                            "a zachovaj ju v tvojej milosti. <br>" +
                            "Skrze Krista, nášho Pána."},

            {"1gkp", "", "Bože, ty si chcel, aby tvoje Slovo <br>" +
                    "prijalo ľudskú prirodzenosť v lone Panny Márie; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby si všetci, čo vyznávajú, <br>" +
                    "že náš Vykupiteľ je Boh a človek, <font color='#B71C1C'>—</font><br>" +
                    "zaslúžili účasť na jeho božskej prirodzenosti. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Všemohúci Bože, <br>" +
                            "láskavo prijmi dary svojej Cirkvi, <font color='#B71C1C'>*</font><br>" +
                            "ktorá vo vtelení tvojho jednorodeného Syna <br>" +
                            "spoznáva svoj počiatok, <font color='#B71C1C'>—</font><br>" +
                            "a daj, nech v deň tejto slávnosti <br>" +
                            "s radosťou slávime tajomstvá spásy.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, upevni v nás tajomstvo pravej viery, <font color='#B71C1C'>*</font><br>" +
                            "aby sme vyznávali, že ten, ktorý sa počal z Panny, <br>" +
                            "je pravý Boh a pravý človek, <font color='#B71C1C'>—</font><br>" +
                            "a mocou jeho spásonosného zmŕtvychvstania <br>" +
                            "si zaslúžili dôjsť do večnej radosti. <br>" +
                            "Skrze Krista, nášho Pána."},

            {"2mp", "", "Bože, Otec milosrdenstva,<br>" +
                    "tvoj jednorodený Syn, pribitý na kríži,<br>" +
                    "dal nám všetkým za matku<br>" +
                    "preblahoslavenú Pannu Máriu; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby tvoja Cirkev<br>" +
                    "s jej láskavou pomocou zo dňa na deň rástla, <font color='#B71C1C'>—</font><br>" +
                    "tešila sa zo svätosti svojich detí<br>" +
                    "a pritiahla do svojho náručia všetky národy sveta.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého<br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi naše obetné dary<br>" +
                            "a premeň ich na sviatosť našej spásy; <font color='#B71C1C'>*</font><br>" +
                            "nech nás povzbudzuje sila tohto tajomstva<br>" +
                            "i láska Panny Márie, Matky Cirkvi, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa spolu s ňou<br>" +
                            "plnšie zapojili do diela vykúpenia.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme<br>" +
                            "záloh vykúpenia a večného života; <font color='#B71C1C'>*</font><br>" +
                            "vrúcne ťa prosíme, daj, aby tvoja Cirkev<br>" +
                            "s materskou pomocou Panny Márie<br>" +
                            "ohlasovala evanjelium všetkým národom <font color='#B71C1C'>—</font><br>" +
                            "a naplnila svet prejavmi Ducha Svätého.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"3gp", "", "Bože, ty si na svoju slávu <br>" +
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
            {"7gkp", "", "Bože, láskavý Otče, <br>" +
                    "ty si poslal na svet Slovo pravdy a Ducha Posvätiteľa, <br>" +
                    "a tak si zjavil ľuďom svoje obdivuhodné tajomstvo; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme v duchu pravej viery <br>" +
                    "vyznávali slávu večnej Trojice <font color='#B71C1C'>—</font><br>" +
                    "a klaňali sa jedinému všemohúcemu Bohu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane a Bože náš, vzývame tvoje meno <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, posväť tieto naše dary <font color='#B71C1C'>—</font><br>" +
                            "a ich pôsobením premeň aj nás <br>" +
                            "na ustavičnú obetu pre teba.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                            "sviatosť, ktorú sme prijali, <br>" +
                            "a viera v jediného Boha vo svätej a večnej Trojici osôb <font color='#B71C1C'>—</font><br>" +
                            "nech nám slúžia na spásu tela i duše.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"4gkp", "", "Pane Ježišu, vo vznešenej Oltárnej sviatosti <br>" +
                    "zanechal si nám pamiatku svojho umučenia a zmŕtvychvstania; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám uctievať tajomstvo <br>" +
                    "tvojho Tela a Krvi s takou vierou a láskou, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy pociťovali účinky <br>" +
                    "tvojho vykupiteľského diela.<br>" +
                    "Lebo ty si Boh a žiješ a kraľuješ <br>" +
                    "s Bohom Otcom v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "daruj svojej Cirkvi jednotu a pokoj, <font color='#B71C1C'>—</font><br>" +
                            "ktoré sú tajomne naznačené týmito darmi chleba a vína.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Dopraj nám, Pane Ježišu, <font color='#B71C1C'>*</font><br>" +
                            "aby sme vo večnosti dosiahli <br>" +
                            "plnú radosť z tvojho božského života, <font color='#B71C1C'>—</font><br>" +
                            "ktorú nám už teraz dávaš okúsiť <br>" +
                            "v prijímaní tvojho predrahého Tela a Krvi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"5gkp", "", "Všemohúci Bože, <br>" +
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
                            "Lebo on žije a kraľuje na veky vekov."},
            {"4mp", "", "Bože, ty si pripravil v srdci <br>" +
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
            {"8gkp", "", "Všemohúci a večný Bože,<br>" +
                    "ty si rozhodol všetko obnoviť <br>" +
                    "vo svojom milovanom Synovi, Kráľovi neba i zeme; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <br>" +
                    "aby sa všetko tvorstvo, vyslobodené <br>" +
                    "z otroctva hriechu, podrobilo tvojej božskej moci <font color='#B71C1C'>—</font><br>" +
                    "a bez prestania ťa oslavovalo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, slávime obetu, <br>" +
                            "ktorá zmierila ľudstvo s tebou, <font color='#B71C1C'>*</font><br>" +
                            "a pokorne prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby tvoj Syn udelil všetkým národom <br>" +
                            "dar jednoty a pokoja.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Pane, prijali sme pokrm večného života <br>" +
                            "a sme šťastní, že môžeme zachovávať príkazy <br>" +
                            "Krista, Kráľa neba i zeme; <font color='#B71C1C'>*</font><br>" +
                            "dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme s ním mohli naveky žiť <br>" +
                            "v nebeskom kráľovstve.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            //8. decembra - NEPOŠKVRNENÉ POČATIE PANNY MÁRIE
            {"9gkp", "", "Bože, nepoškvrneným počatím Panny Márie <br>" +
                    "pripravil si dôstojný príbytok svojmu Synovi <br>" +
                    "a pre budúce zásluhy jeho smrti <br>" +
                    "uchránil si ju od každého hriechu; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme na jej orodovanie <br>" +
                    "aj my prišli k tebe s čistým srdcom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo prijmi naše obetné dary <br>" +
                            "v deň slávnosti Nepoškvrneného počatia <br>" +
                            "preblahoslavenej Panny Márie, <font color='#B71C1C'>*</font><br>" +
                            "ktorú si svojou milosťou <br>" +
                            "uchránil od každého hriechu, <font color='#B71C1C'>—</font><br>" +
                            "a na jej orodovanie nás osloboď <br>" +
                            "od všetkých previnení.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, <br>" +
                            "nech sviatosť, ktorú sme prijali, <br>" +
                            "zahojí v nás rany po prvotnom hriechu, <font color='#B71C1C'>*</font><br>" +
                            "pred ktorým si výnimočným spôsobom <br>" +
                            "uchránil preblahoslavenú Pannu Máriu, <font color='#B71C1C'>—</font><br>" +
                            "keď bola bez poškvrny počatá. <br>" +
                            "Skrze Krista, nášho Pána."},
            //  SVÄTEJ RODINY JEŽIŠA, MÁRIE A JOZEFA
            {"10gkp", "", "Bože, ty si nám dal Svätú rodinu ako žiarivý vzor; <font color='#B71C1C'>*</font><br>" +
                    "láskavo dopraj, aby sme ju nasledovali <br>" +
                    "vo vzájomnej láske a v rodinných čnostiach, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli večnú odmenu <br>" +
                    "v tvojom nebeskom domove. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prinášame ti zmiernu obetu <font color='#B71C1C'>*</font><br>" +
                            "a vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby si na orodovanie Bohorodičky Panny Márie <br>" +
                            "a svätého Jozefa upevňoval naše rodiny <br>" +
                            "v tvojej milosti a v tvojom pokoji. <br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Dobrotivý Otče, <br>" +
                            "ty nás posilňuješ nebeskými sviatosťami; <font color='#B71C1C'>*</font><br>" +
                            "pomáhaj nám vytrvalo nasledovať <br>" +
                            "príklad Svätej rodiny, <font color='#B71C1C'>—</font><br>" +
                            "aby sme po útrapách tohto života <br>" +
                            "dosiahli večnú blaženosť v jej spoločenstve.<br>" +
                            "Skrze Krista, nášho Pána"},
            //Nedeľa po 6. januári - KRST KRISTA PÁNA
            {"11gkp", "", "Všemohúci a večný Bože, <br>" +
                    "keď bol Ježiš Kristus pokrstený v Jordáne <br>" +
                    "a vznášal sa nad ním Duch Svätý, <br>" +
                    "slávnostne si vyhlásil, že je tvojím milovaným Synom; <font color='#B71C1C'>*</font><br>" +
                    "dopraj nám, svojim deťom, <br>" +
                    "zrodeným z vody a Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                    "stále zotrvávať v tvojej priazni. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, tvoj jednorodený Syn <br>" +
                    "sa zjavil v našej ľudskej prirodzenosti <br>" +
                    "a bol nám navonok podobný; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa s pomocou jeho milosti <br>" +
                    "vnútorne stali podobnými jemu. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Bože, pri oslave zjavenia <br>" +
                            "tvojho milovaného Syna prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby sa premenili na Telo a Krv Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                            "ktorý láskavo zmyl hriechy sveta. <br>" +
                            "Lebo on žije a kraľuje na veky vekov. ",
                    "Pane, nasýtení svätými darmi ťa pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                            "pomôž nám verne počúvať tvojho jednorodeného Syna, <font color='#B71C1C'>—</font><br>" +
                            "aby sme boli tvojimi deťmi nielen podľa mena, ale aj životom. <br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] modlitba1 = {
            {"01gk", "Bože, narodením tvojho Syna <br>" +
                    "z preblahoslavenej Panny Márie <br>" +
                    "poskytol si ľuďom večnú spásu; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme vždy pociťovali <br>" +
                    "účinky jej orodovania, <font color='#B71C1C'>—</font><br>" +
                    "veď skrze ňu sme dostali Pôvodcu života, <br>" +
                    "Ježiša Krista, tvojho Syna a nášho Pána.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Bože, ty láskavo začínaš <br>" +
                            "a dovršuješ každé dobré dielo; <font color='#B71C1C'>*</font><br>" +
                            "na tento radostný sviatok Božej Matky <br>" +
                            "oslavujeme začiatok našej spásy a prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sa v nás zavŕšila v plnej miere. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nadšene vyznávame, <br>" +
                            "že preblahoslavená Panna Mária <br>" +
                            "je Rodičkou tvojho Syna a Matkou Cirkvi, <font color='#B71C1C'>*</font><br>" +
                            "a prosíme, aby nám nebeská sviatosť, <br>" +
                            "ktorú sme s radosťou prijali, <font color='#B71C1C'>—</font><br>" +
                            "slúžila pre večný život. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"02a", "Bože, ty si osvietil svoju Cirkev príkladom <br>" +
                    "a náukou svätých biskupov Bazila a Gregora; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, aby sme v pokore prijali tvoju pravdu <font color='#B71C1C'>—</font><br>" +
                    "a verne o nej svedčili skutkami lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, prijmi túto obetu svojho ľudu, <font color='#B71C1C'>*</font><br>" +
                            "ktorú ti pri spomienke na svätých <br>" +
                            "Bazila a Gregora obetujeme na slávu, <font color='#B71C1C'>—</font><br>" +
                            "aby nám slúžila na večnú spásu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "nech v nás všetkých, ktorí slávime <br>" +
                            "sviatok svätých Bazila a Gregora, <br>" +
                            "eucharistický pokrm upevní a rozhojní silu z neba, <font color='#B71C1C'>*</font><br>" +
                            "aby sme si zachovali neporušený dar viery <font color='#B71C1C'>—</font><br>" +
                            "a kráčali po bezpečnej ceste spásy.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"03a", "Bože, vo vtelení svojho Slova <br>" +
                    "si dal ľudskému pokoleniu základ spásy; <font color='#B71C1C'>*</font><br>" +
                    "udeľ svojmu ľudu milosti, o ktoré ťa prosí, <font color='#B71C1C'>—</font><br>" +
                    "aby všetci spoznali, že niet iného mena, <br>" +
                    "ktoré sa má vzývať, iba meno tvojho jednorodeného Syna.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, prinášame ti dary, <br>" +
                            "ktoré si nám udelil vo svojej štedrosti; <font color='#B71C1C'>*</font><br>" +
                            "ty si dal Kristovi poslušnému <br>" +
                            "až na smrť spásonosné meno: <font color='#B71C1C'>—</font><br>" +
                            "prosíme ťa, ochraňuj aj nás silou tohto mena.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme obetu, ktorú sme priniesli <br>" +
                            "tvojej velebnosti na počesť Kristovho mena; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, daj, nech nám hojne vleje tvoju milosť, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa radovali, že aj naše mená sú zapísané v nebi.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"05gk", "Prosíme ťa, Pane, <br>" +
                    "osvieť naše srdcia svetlom svojej slávy, <font color='#B71C1C'>*</font><br>" +
                    "aby sme mohli prekonať temnoty tohto sveta <font color='#B71C1C'>—</font><br>" +
                    "a dosiahnuť žiaru večnej vlasti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi naše dary, ktoré ti obetujeme pri oslave <br>" +
                            "zjavenia tvojho jednorodeného Syna všetkým národom, <font color='#B71C1C'>*</font><br>" +
                            "aby sme ti nimi vzdali chválu, <font color='#B71C1C'>—</font><br>" +
                            "a tak získali večnú spásu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, posilnení posvätným pokrmom <br>" +
                            "ťa láskavo prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby hviezda tvojej spravodlivosti <br>" +
                            "vždy žiarila v našich srdciach <font color='#B71C1C'>—</font><br>" +
                            "a vo vyznávaní tvojho mena <br>" +
                            "sme našli svoj pravý poklad.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"06gk", "Bože, ty si dnešného dňa <br>" +
                    "svetlom hviezdy zjavil svojho Syna národom; <font color='#B71C1C'>*</font><br>" +
                    "aj my sme ťa už spoznali svetlom viery a prosíme, <font color='#B71C1C'>—</font><br>" +
                    "priveď nás láskavo k sebe, <br>" +
                    "aby sme mohli hľadieť na tvoju velebu. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, zhliadni na dary svojej Cirkvi, <font color='#B71C1C'>*</font><br>" +
                            "ktorá ti neprináša zlato, kadidlo a myrhu, <font color='#B71C1C'>—</font><br>" +
                            "ale Ježiša Krista, ktorý sa v týchto daroch <br>" +
                            "sprítomňuje, obetuje a nám dáva. <br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "sprevádzaj nás vždy a všade nebeským svetlom, <font color='#B71C1C'>*</font><br>" +
                            "aby sme stále lepšie poznávali tajomstvo, <br>" +
                            "na ktorom si nám doprial účasť, <font color='#B71C1C'>—</font><br>" +
                            "a prijímali ho so vzrastajúcou láskou. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"07", "Bože, ty si ozdobil svätého kňaza Rajmunda <br>" +
                    "nevšednou láskou voči hriešnikom a zajatým; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jeho orodovanie <br>" +
                    "nás zbav jarma hriechu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme až do konca ochotne nasledovali to, <br>" +
                    "čo je tebe milé.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"13", "Všemohúci Bože, <br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>*</font><br>" +
                    "aby sme správne chápali a verne vyznávali <br>" +
                    "božstvo tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "ktoré neochvejne obhajoval svätý biskup Hilár.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"17", "Bože, ty si vnukol svätému opátovi Antonovi, <br>" +
                    "aby ti na púšti slúžil v nevšednom spoločenstve s tebou; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jeho príhovor nám dopraj, <br>" +
                    "aby sme sa zriekali samých seba <font color='#B71C1C'>—</font><br>" +
                    "a bez prestania ťa nadovšetko milovali. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech sú ti milé dary, ktoré pri spomienke <br>" +
                            "na svätého Antona s oddanosťou kladieme na tvoj oltár; <font color='#B71C1C'>*</font><br>" +
                            "pomáhaj nám, aby sme sa odpútali od pozemských vecí <font color='#B71C1C'>—</font><br>" +
                            "a nachádzali bohatstvo len v tebe. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, ty si dal svätému Antonovi <br>" +
                            "silu víťaziť nad mocnosťami temností; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme aj my, posilnení spasiteľnou sviatosťou, <br>" +
                            "vždy premáhali všetky nástrahy nepriateľa. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"20a", "Bože, ty si sláva kňazov; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa príkladu tvojho mučeníka, <br>" +
                    "svätého Fabiána, a na jeho príhovor <br>" +
                    "rástli vo viere a oddane ti slúžili. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"20b", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "udeľ nám ducha sily, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa z mimoriadneho príkladu <br>" +
                    "tvojho mučeníka, svätého Šebastiána, <br>" +
                    "naučili poslúchať viac teba ako ľudí. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"20g+", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "udeľ nám ducha sily, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa z mimoriadneho príkladu <br>" +
                    "tvojho mučeníka, svätého Šebastiána, <br>" +
                    "naučili poslúchať viac teba ako ľudí. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"21", "Všemohúci a večný Bože, <br>" +
                    "ty si volíš, čo svet pokladá za slabé, <br>" +
                    "aby si zahanbil to, čo je silné; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, láskavo dopraj, <br>" +
                    "aby sme aj my, čo slávime narodenie <br>" +
                    "tvojej svätej mučenice Agnesy pre nebo, <font color='#B71C1C'>—</font><br>" +
                    "nasledovali jej vytrvalosť vo viere. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"22", "Všemohúci a večný Bože, <br>" +
                    "láskavo nás naplň svojím Duchom, <font color='#B71C1C'>*</font><br>" +
                    "aby v našich srdciach zavládla taká mocná láska, <font color='#B71C1C'>—</font><br>" +
                    "s akou svätý mučeník Vincent premohol všetky telesné muky. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"24", "Bože, ty si chcel, aby sa svätý biskup František <br>" +
                    "stal pre spásu duší všetkým pre všetkých; <font color='#B71C1C'>*</font><br>" +
                    "láskavo dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa jeho príkladu <br>" +
                    "v bratskej službe vždy preukazovali tvoju dobrotivú lásku. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, skrze túto spásonosnú obetu, ktorú ti prinášame, <font color='#B71C1C'>*</font><br>" +
                            "zapáľ naše srdcia tým božským ohňom Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                            "ktorým si obdivuhodne roznietil pokorného ducha svätého Františka. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme posilnení prijatou sviatosťou napodobňovali <br>" +
                            "lásku a miernosť svätého Františka tu na zemi, <font color='#B71C1C'>—</font><br>" +
                            "a tak dosiahli slávu v nebi. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"25g", "Bože, ty si poučil celý svet <br>" +
                    "kázaním svätého apoštola Pavla, <br>" +
                    "ktorého obrátenie dnes oslavujeme; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme <br>" +
                    "podľa jeho príkladu kráčali k tebe <font color='#B71C1C'>—</font><br>" +
                    "a boli svedkami tvojej pravdy pre svet. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nás pri slávení tejto obety <br>" +
                            "prenikne Duch Svätý svetlom viery, <font color='#B71C1C'>—</font><br>" +
                            "ktoré ustavične osvecovalo <br>" +
                            "svätého apoštola Pavla pri ohlasovaní tvojej slávy. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, <br>" +
                            "prosíme ťa, nech sviatosť, <br>" +
                            "ktorú sme prijali, roznieti v nás oheň lásky, <font color='#B71C1C'>*</font><br>" +
                            "ktorým mocne horel svätý apoštol Pavol, <font color='#B71C1C'>—</font><br>" +
                            "keď sa neúnavne staral o všetky cirkevné spoločenstvá. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"26", "Bože, ty si ozdobil apoštolskými <br>" +
                    "čnosťami svätých Timoteja a Títa; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie dopraj, <br>" +
                    "aby sme v tomto svete žili spravodlivo a nábožne <font color='#B71C1C'>—</font><br>" +
                    "a zaslúžili si dôjsť do nebeskej vlasti. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "prijmi dary svojho ľudu, ktoré ti predkladáme <br>" +
                            "pri oslave svätých Timoteja a Títa, <font color='#B71C1C'>—</font><br>" +
                            "a dopraj, aby sme k tebe <br>" +
                            "vždy prichádzali s úprimným srdcom. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, nech sviatosť, <br>" +
                            "ktorú sme prijali, živí v nás vieru, <font color='#B71C1C'>—</font><br>" +
                            "ktorú apoštolským ohlasovaním <br>" +
                            "a starostlivosťou zachovali svätí Timotej a Títus. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"27", "Prosíme ťa, Pane, <br>" +
                    "nech nám svätá panna Angela <br>" +
                    "ustavične vyprosuje tvoju milosť, <font color='#B71C1C'>*</font><br>" +
                    "aby sme nasledovaním jej príkladu lásky <br>" +
                    "a múdrosti boli schopní zachovávať tvoju náuku <font color='#B71C1C'>—</font><br>" +
                    "a vyznávať ju životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"28", "Bože, ty si urobil svätého Tomáša <br>" +
                    "veľkým v horlivosti o svätosť <br>" +
                    "a v poznávaní posvätnej náuky; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli schopní pochopiť, čo učil, <br>" +
                    "a napodobňovať, čo žil. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"31", "Bože, ty si svätého kňaza Jána <br>" +
                    "povolal za otca a učiteľa mládeže; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme zapálení tým istým ohňom lásky <br>" +
                    "hľadali duše a slúžili jedine tebe. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
    };

    String[][] modlitba2 = {
            {"02g", "Všemohúci a večný Bože, <br>" +
                    "tvoj jednorodený Syn prijal <br>" +
                    "našu ľudskú prirodzenosť <br>" +
                    "a dnes ti bol obetovaný v chráme; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, očisti nás, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my mohli s čistým srdcom <br>" +
                    "predstúpiť pred tvoju tvár.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, ty si chcel, aby ti bol <br>" +
                            "tvoj jednorodený Syn obetovaný <br>" +
                            "ako nepoškvrnený Baránok za spásu sveta; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, nech ti je milá táto obeta, <font color='#B71C1C'>—</font><br>" +
                            "ktorú ti Cirkev s radosťou prináša.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, ako si Simeonovi splnil očakávanie, <br>" +
                            "že nezomrie prv, kým neuzrie Krista, <font color='#B71C1C'>*</font><br>" +
                            "tak aj nám skrze tento sviatostný pokrm, <br>" +
                            "ktorý sme prijali, udeľ svoju milosť, <font color='#B71C1C'>—</font><br>" +
                            "aby sme kráčali v ústrety Pánovi a dosiahli večný život.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"03a", "Pane, vypočuj pokorné prosby svojho ľudu, <br>" +
                    "ktoré ti prednášame na príhovor svätého mučeníka Blažeja, <font color='#B71C1C'>*</font><br>" +
                    "a dopraj nám tešiť sa v časnom živote z pokoja <font color='#B71C1C'>—</font><br>" +
                    "a nájsť pomoc pre večný život.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"03b", "Bože, ty si poslal svätého biskupa Oskara <br>" +
                    "ohlasovať Kristovu blahozvesť mnohým národom; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy kráčali vo svetle tvojej pravdy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
                    {"05", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "zmiluj sa nad nami na príhovor <br>" +
                            "svätej panny a mučenice Agáty, <font color='#B71C1C'>—</font><br>" +
                            "ktorá ti bola vždy milá pre svoju silu <br>" +
                            "v mučeníctve a panenský život. <br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
                    {"06", "Bože, sila všetkých svätých, <font color='#B71C1C'>*</font><br>" +
                            "ty si povolal svätých mučeníkov Pavla <br>" +
                            "a jeho spoločníkov cez smrť na kríži k životu; <font color='#B71C1C'>—</font><br>" +
                            "daj, prosíme, aby sme si na ich orodovanie <br>" +
                            "zachovali odvahu statočne vyznávať vieru až do smrti.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
                    {"08a", "Bože, Otec milosrdenstva, ty si sirotám <br>" +
                            "dal svätého Hieronyma za otca a pomocníka; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, na jeho orodovanie dopraj, <br>" +
                            "aby sme si verne zachovali ducha synovstva, <font color='#B71C1C'>—</font><br>" +
                            "v ktorom sa nazývame a sme tvojimi deťmi.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
                    {"08b", "Bože, ty si pozdvihol svätú Jozefínu z ponižujúceho <br>" +
                            "otroctva k hodnosti svojej dcéry a Kristovej nevesty; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, dopraj, <br>" +
                            "aby sme podľa jej príkladu <br>" +
                            "oddane nasledovali ukrižovaného Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                            "ochotne vytrvali v láske a konali skutky milosrdenstva.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
                    {"10", "Pane, pri spomienke na svätú pannu <br>" +
                            "Školastiku vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby sme ti podľa jej príkladu oddane slúžili <font color='#B71C1C'>—</font><br>" +
                            "a radostne prijímali to, čo pochádza z tvojej lásky.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
                    {"11m", "Milosrdný Bože, <br>" +
                            "buď nám ochranou v našej slabosti, <font color='#B71C1C'>*</font><br>" +
                            "a keď slávime spomienku <br>" +
                            "na nepoškvrnenú Božiu Rodičku, <font color='#B71C1C'>—</font><br>" +
                            "daj, aby sme na jej príhovor <br>" +
                            "dokázali povstať z našich neprávostí.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
            {"14o", "Bože, ty si prostredníctvom<br>" +
                    "svätých bratov Cyrila a Metoda<br>" +
                    "daroval slovanským národom svetlo evanjelia; <font color='#B71C1C'>*</font><br>" +
                    "daj, nech s ochotným srdcom<br>" +
                    "prijímame slovo tvojho učenia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa zjednotili v pravej viere<br>" +
                    "a správnom vyznávaní.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "zhliadni na dary, ktoré ti pri oslave<br>" +
                            "svätých Cyrila a Metoda kladieme na oltár, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sa stali znamením<br>" +
                            "nového ľudstva zmiereného v láske.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, Otec všetkých národov,<br>" +
                            "ty nás jedným chlebom a v jednom Duchu<br>" +
                            "robíš spolustolujúcimi a dedičmi večnej hostiny; <font color='#B71C1C'>*</font><br>" +
                            "pri tejto oslave svätých Cyrila a Metoda ťa prosíme,<br>" +
                            "daj, aby tvoji synovia a dcéry zotrvávali v tej istej viere <font color='#B71C1C'>—</font><br>" +
                            "a jednomyseľne budovali kráľovstvo<br>" +
                            "spravodlivosti a pokoja.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14g+", "Bože, ty si prostredníctvom<br>" +
                    "svätých bratov Cyrila a Metoda<br>" +
                    "daroval slovanským národom svetlo evanjelia; <font color='#B71C1C'>*</font><br>" +
                    "daj, nech s ochotným srdcom<br>" +
                    "prijímame slovo tvojho učenia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa zjednotili v pravej viere<br>" +
                    "a správnom vyznávaní.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "zhliadni na dary, ktoré ti pri oslave<br>" +
                            "svätých Cyrila a Metoda kladieme na oltár, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sa stali znamením<br>" +
                            "nového ľudstva zmiereného v láske.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, Otec všetkých národov,<br>" +
                            "ty nás jedným chlebom a v jednom Duchu<br>" +
                            "robíš spolustolujúcimi a dedičmi večnej hostiny; <font color='#B71C1C'>*</font><br>" +
                            "pri tejto oslave svätých Cyrila a Metoda ťa prosíme,<br>" +
                            "daj, aby tvoji synovia a dcéry zotrvávali v tej istej viere <font color='#B71C1C'>—</font><br>" +
                            "a jednomyseľne budovali kráľovstvo<br>" +
                            "spravodlivosti a pokoja.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"17", "Prosíme ťa, Pane, <br>" +
                    "naplň nás synovskou láskou, <font color='#B71C1C'>*</font><br>" +
                    "ktorou svätí bratia uctievali Bohorodičku <font color='#B71C1C'>—</font><br>" +
                    "a viedli tvoj ľud k tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"21", "Všemohúci Bože, <br>" +
                    "prosíme ťa, dopraj nám nasledovať učenie <br>" +
                    "a príklad svätého biskupa Petra, <font color='#B71C1C'>*</font><br>" +
                    "aby sme vo všetkom dávali prednosť Kristovi, <br>" +
                    "vždy oddane slúžili tvojej Cirkvi, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli svetlo večnej radosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"22g", "Všemohúci Bože, ty si vystavil svoju Cirkev <br>" +
                    "na skale apoštolského vyznania svätého Petra; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby žiadne ťažkosti neotriasli našou vierou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo prijmi modlitby a dary svojej Cirkvi, <font color='#B71C1C'>*</font><br>" +
                            "ktorá si pod pastierskou ochranou svätého Petra <br>" +
                            "zachováva neporušenú vieru, <font color='#B71C1C'>—</font><br>" +
                            "aby dosiahla večné dedičstvo. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, pri oslave sviatku svätého Petra <br>" +
                            "si nás nasýtil Kristovým Telom a Krvou; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby táto spásna výmena <br>" +
                            "bola pre nás sviatosťou jednoty a pokoja. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "Bože všetkého stvorenia, <br>" +
                    "ty si pripojil svätého biskupa Polykarpa k zástupu mučeníkov; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jeho príhovor nám daj účasť <br>" +
                    "na kalichu tvojho Syna Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                    "aby sme prostredníctvom Ducha Svätého <br>" +
                    "povstali k novému životu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"27","Všemohúci a večný Bože, <br>" +
                    "ty si svätého Gregora, učiteľa ozdobu arménskeho ľudu, <br>" +
                    "láskavo naplnil mystickou náukou; <font color='#B71C1C'>*</font><br>" +
                    "dopraj nám, aby sme sa podľa jeho učenia <br>" +
                    "zdokonaľovali v umení modlitby <font color='#B71C1C'>—</font><br>" +
                    "a v živote sa stále posilňovali sviatosťami Cirkvi. <br>" +
                    "povstali k novému životu. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
    };

    String[][] modlitba3 = {
            {"04", "Všemohúci Bože, tebe slúžiť znamená kraľovať; <font color='#B71C1C'>*</font><br>" +
                    "na orodovanie svätého Kazimíra dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti vytrvalo slúžili v spravodlivosti a svätosti. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"07", "Bože, sväté mučenice Perpetua a Felicita <br>" +
                    "zapálené láskou k tebe pohrdli prenasledovateľom <br>" +
                    "a zvíťazili nad mukami smrti; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na ich príhovor nám dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme stále rástli v tvojej láske. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, pri spomienke na nebeské víťazstvo <br>" +
                            "svätých Perpetuy a Felicity <br>" +
                            "ti s radosťou prinášame dnešnú obetu, <font color='#B71C1C'>*</font><br>" +
                            "ktorou ohlasujeme tvoje veľké skutky <font color='#B71C1C'>—</font><br>" +
                            "a tešíme sa, že sme získali ich slávny príhovor. <br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, máme nekonečnú radosť z účasti na tejto sviatosti <br>" +
                            "a zo spomienky na sväté Perpetuu a Felicitu; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, dopraj, <font color='#B71C1C'>—</font><br>" +
                            "aby sme dôstojne prijímali sviatosť, ktorú si nám daroval. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"08", "Bože, ty si naplnil svätého Jána <br>" +
                    "duchom milosrdenstva; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <br>" +
                    "aby sme si aj my, keď konáme skutky lásky, <font color='#B71C1C'>—</font><br>" +
                    "zaslúžili miesto medzi vyvolenými v tvojom kráľovstve. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"09", "Bože, ty si nám dal vo svätej Františke <br>" +
                    "jedinečný príklad manželského a rehoľného života; <font color='#B71C1C'>*</font><br>" +
                    "dopraj nám vytrvalo ti slúžiť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vo všetkých životných situáciách <br>" +
                    "hľadeli na teba a nasledovali ťa.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"17", "Bože, ty si poslal svätého biskupa Patrika <br>" +
                    "ohlasovať tvoju slávu írskemu národu; <font color='#B71C1C'>*</font><br>" +
                    "pre jeho zásluhy a na jeho orodovanie daj, <br>" +
                    "aby tí, ktorí sa radujú z mena kresťan, <font color='#B71C1C'>—</font><br>" +
                    "vždy ohlasovali svetu tvoje obdivuhodné diela. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"18", "Bože, ty si prostredníctvom svätého biskupa Cyrila <br>" +
                    "obdivuhodne priviedol svoju Cirkev <br>" +
                    "k hlbšiemu chápaniu tajomstiev spásy; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie nám pomáhaj, <br>" +
                    "aby sme lepšie poznávali tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli plnosť života. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"23", "Bože, ty si zveľadil svoju Cirkev <br>" +
                    "apoštolskou starostlivosťou svätého biskupa Turibia <br>" +
                    "a jeho horlivosťou za pravdu; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, aby sa tebe zasvätený ľud neustále vzmáhal vo viere <font color='#B71C1C'>—</font><br>" +
                    "a vzrastal vo svätosti. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
    };

    String[][] modlitba4 = {
            {"02", "Bože, sláva ponížených, <br>" +
                    "ty si povýšil svätého Františka <br>" +
                    "do slávy svojich svätých; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, udeľ nám milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pre jeho zásluhy a príklad <br>" +
                    "šťastlivo dosiahli odmenu prisľúbenú pokorným. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"04", "Prosíme ťa, Pane, vypočuj naše prosby, <br>" +
                    "ktoré ti predkladáme v deň spomienky na svätého Izidora, <font color='#B71C1C'>*</font><br>" +
                    "aby si na jeho orodovanie zveľadil svoju Cirkev, <font color='#B71C1C'>—</font><br>" +
                    "ktorá čerpá z jeho nebeského učenia. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"05", "Bože, ty si svätého kňaza Vincenta <br>" +
                    "podnietil k službe ohlasovania evanjelia; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme Sudcu, <br>" +
                    "ktorý má prísť a ktorého on ohlasoval na zemi, <font color='#B71C1C'>—</font><br>" +
                    "raz uzreli v blaženosti ako kráľa v nebi.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.","",""},
            {"07", "Bože, ty si vyvolil svätého Jána Krstiteľa de la Salle, <br>" +
                    "aby vychovával kresťanskú mládež; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, vzbuď vo svojej Cirkvi vychovávateľov, <br>" +
                    "ktorí by sa mladým venovali celým svojím srdcom <font color='#B71C1C'>—</font><br>" +
                    "a formovali ich v ľudských a kresťanských čnostiach. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"11", "Bože, svätý biskup Stanislav <br>" +
                    "pre tvoju slávu klesol pod mečmi prenasledovateľov; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vytrvali pevní vo viere až do smrti. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"13", "Všemohúci Bože, <br>" +
                    "svätý Martin, pápež a mučeník, <br>" +
                    "s tvojou pomocou nepodľahol hrozbám a mukám; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s nezlomným duchom <br>" +
                    "aj my vytrvalo znášali protivenstvá sveta. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"21", "Bože, ty si dal svätému biskupovi Anzelmovi <br>" +
                    "dar preniknúť do hlbín tvojej múdrosti <br>" +
                    "a vyučovať ju iných; <font color='#B71C1C'>*</font><br>" +
                    "daj, nech viera v teba pomáha nášmu rozumu chápať, <font color='#B71C1C'>—</font><br>" +
                    "že to, čo si nám dal veriť, je ľúbeznou múdrosťou srdca.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"23", "Bože, ty si svätého biskupa Vojtecha <br>" +
                    "korunoval mučeníctvom pre jeho horlivosť za duše; <font color='#B71C1C'>*</font><br>" +
                    "na jeho mocný príhovor dopraj, <br>" +
                    "aby veriaci poslúchali svojich pastierov <font color='#B71C1C'>—</font><br>" +
                    "a kňazi vynikali duchovnou starostlivosťou o veriacich. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, ty si svätého biskupa Vojtecha, <br>" +
                    "muža plného viery a Ducha Svätého, <br>" +
                    "poslal šíriť evanjelium medzi slovanské kmene; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my slovom a dobrým príkladom <br>" +
                    "zveľaďovali vieru, ktorú on tak horlivo ohlasoval. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Dobrotivý Bože, požehnaj tieto obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a posilňuj nás vo viere, <font color='#B71C1C'>—</font><br>" +
                            "ktorú svätý Vojtech dosvedčil mučeníckou smrťou. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Milosrdný Bože, sviatostné Telo a Krv tvojho Syna <br>" +
                            "pomáhali svätému biskupovi Vojtechovi <br>" +
                            "prekonať všetky utrpenia; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, nech aj nás posilňuje sväté prijímanie, <font color='#B71C1C'>—</font><br>" +
                            "aby sme si zachovali vieru a lásku k tebe. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"24a", "Pane, zvelebujeme tvoju moc a pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                    "aby nám svätý Juraj, ktorý sa pripodobnil Pánovmu utrpeniu, <font color='#B71C1C'>—</font><br>" +
                    "bol ochotným pomocníkom v našej krehkosti. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"24b", "Bože, ty si ozdobil palmou mučeníctva svätého Fidéla, <br>" +
                    "ktorý zapálený láskou k tebe šíril vieru; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jeho príhovor dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa upevnili v láske a spolu s ním si zaslúžili <br>" +
                    "spoznať silu Kristovho zmŕtvychvstania. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.","",""},
            {"25g", "Bože, ty si svätého evanjelistu Marka <br>" +
                    "obdaril milosťou ohlasovať tvoju blahozvesť; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, posilňuj nás jeho učením, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy verne nasledovali Krista. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, pri oslave svätého Marka <br>" +
                            "prinášame ti obetu chvály <font color='#B71C1C'>*</font><br>" +
                            "a pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby tvoja Cirkev vždy vytrvala v hlásaní evanjelia. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "daj, prosíme, aby nás sviatosť, <br>" +
                            "ktorú sme prijali z tohto svätého oltára, <font color='#B71C1C'>*</font><br>" +
                            "posvätila a posilnila vo viere evanjelia, <font color='#B71C1C'>—</font><br>" +
                            "ktoré hlásal svätý Marek.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"28a", "Bože, ty si pre rozšírenie svojej Cirkvi <br>" +
                    "ozdobil svätého Petra <font color='#B71C1C'>(</font>Chanela<font color='#B71C1C'>)</font> mučeníctvom; <font color='#B71C1C'>*</font><br>" +
                    "daj, nech v týchto dňoch veľkonočnej radosti <br>" +
                    "tak slávime tajomstvá Kristovej smrti a zmŕtvychvstania, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si zaslúžili byť svedkami nového života. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"28b", "Bože, ty si viedol kroky <br>" +
                    "svätého kňaza Ľudovíta Máriu po ceste spásy <br>" +
                    "a Kristovej lásky v sprievode preblahoslavenej Panny Márie; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme podľa jeho príkladu <br>" +
                    "uvažovali o tajomstvách tvojej lásky <font color='#B71C1C'>—</font><br>" +
                    "a zanietene budovali tvoju Cirkev. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Všemohúci a večný Bože, <br>" +
                    "ty si svätého kňaza Ľudovíta Máriu <br>" +
                    "urobil vynikajúcim svedkom a učiteľom <br>" +
                    "úplného zasvätenia tvojmu Synovi Ježišovi Kristovi <br>" +
                    "prostredníctvom jeho preblahoslavenej Matky; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme nasledovali tú istú duchovnú cestu, <font color='#B71C1C'>—</font><br>" +
                    "a tak neustále šírili tvoje kráľovstvo. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"29g", "Bože, ty si vo svätej Kataríne roznietil vrúcnu lásku, <br>" +
                    "keď rozjímala o Pánovom umučení a slúžila tvojej Cirkvi; <font color='#B71C1C'>*</font><br>" +
                    "na jej príhovor dopraj, <br>" +
                    "aby sa tvoj ľud, ktorému si dal účasť na Kristových tajomstvách, <font color='#B71C1C'>—</font><br>" +
                    "večne tešil, keď sa Kristus zjaví vo svojej sláve. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, prijmi spásonosnú obetu, <font color='#B71C1C'>*</font><br>" +
                            "ktorú ti prinášame na sviatok svätej Kataríny, <font color='#B71C1C'>—</font><br>" +
                            "aby sme povzbudení jej učením ešte horlivejšie <br>" +
                            "vzdávali vďaky tebe, pravému Bohu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme nebeský pokrm, <br>" +
                            "ktorým si posilňoval <br>" +
                            "v pozemskom živote svätú Katarínu; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                            "nech je nám jeho prijímanie zárukou večného života.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "Bože, ty si vo svojej prozreteľnosti <br>" +
                    "dal svojej Cirkvi svätého pápeža Pia, <br>" +
                    "aby chránil vieru a obnovil liturgiu na tvoju oslavu; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme na jeho príhovor mali účasť <br>" +
                    "na tvojich tajomstvách so živou vierou a činorodou láskou. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},

    };

    String[][] modlitba5 = {
            {"01", "Bože, stvoriteľ všetkého, <br>" +
                    "ty si nám dal prácu ako životný údel; <font color='#B71C1C'>*</font><br>" +
                    "dopraj láskavo, aby sme <br>" +
                    "podľa príkladu svätého Jozefa a pod jeho ochranou <br>" +
                    "vykonávali všetky svoje povinnosti <font color='#B71C1C'>—</font><br>" +
                    "a dosiahli sľúbenú odmenu. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, prameň všetkého milosrdenstva, <br>" +
                            "zhliadni na naše dary, ktoré ti predkladáme <br>" +
                            "pri spomienke na svätého Jozefa, <font color='#B71C1C'>*</font><br>" +
                            "a láskavo dopraj, aby sa obeta, <br>" +
                            "ktorú predkladáme tvojej vznešenosti, <font color='#B71C1C'>—</font><br>" +
                            "stala prostriedkom na ochranu tých, <br>" +
                            "ktorí k tebe úpenlivo volajú. <br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.",
                    "Pane, prijali sme nebeský pokrm a pokorne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby sme podľa príkladu svätého Jozefa <br>" +
                            "prinášali vo svojich srdciach svedectvo tvojej lásky <font color='#B71C1C'>—</font><br>" +
                            "a neustále sa tešili z ovocia trvalého pokoja.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"02", "Všemohúci a večný Bože, <br>" +
                    "ty si povýšil svätého biskupa Atanáza <br>" +
                    "na neohrozeného obrancu božstva tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "láskavo dopraj, aby sme sa tešili <br>" +
                    "z jeho náuky a ochrany, <font color='#B71C1C'>—</font><br>" +
                    "a tak ťa mohli vždy lepšie poznávať a nadovšetko milovať. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, zhliadni na dary, <br>" +
                            "ktoré ti prinášame pri spomienke na svätého Atanáza, <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby jeho svedectvo o tvojej pravde <br>" +
                            "slúžilo na spásu tým, <font color='#B71C1C'>—</font><br>" +
                            "čo vyznávajú pravú vieru. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby nás prostredníctvom tejto sviatosti <br>" +
                            "posilňovalo a ochraňovalo pravé božstvo <br>" +
                            "tvojho jednorodeného Syna, <font color='#B71C1C'>—</font><br>" +
                            "ktoré pevne so svätým Atanázom vyznávame. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"03g", "Bože, potešuješ nás výročným sviatkom <br>" +
                    "apoštolov Filipa a Jakuba; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie daj nám účasť <br>" +
                    "na utrpení a zmŕtvychvstaní tvojho jednorodeného Syna, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si naveky zaslúžili hľadieť na tvoju tvár. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "prijmi dary, ktoré ti prinášame <br>" +
                            "na sviatok apoštolov Filipa a Jakuba, <font color='#B71C1C'>—</font><br>" +
                            "a daj nám pravú a čistú nábožnosť. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "týmto svätým prijímaním očisti naše srdcia, <font color='#B71C1C'>*</font><br>" +
                            "aby sme ťa spolu s apoštolmi Filipom a Jakubom <br>" +
                            "spoznali v tvojom Synovi <font color='#B71C1C'>—</font><br>" +
                            "a zaslúžili si večný život. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"04", "Všemohúci Bože, <br>" +
                    "ty si svätému mučeníkovi Floriánovi udelil milosť, <br>" +
                    "že vlastnou smrťou dosvedčil vieru v Krista; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jeho príhovor nás ochraňuj od každého zla <font color='#B71C1C'>—</font><br>" +
                    "a pomáhaj nám, aby sme mali odvahu <br>" +
                    "neohrozene vyznávať vieru v tvojho Syna. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.","",""},
            {"10","Bože, svätého Jána z Avily <br>" +
                    "si dal kňazom i svojmu ľudu za znamenitého učiteľa <br>" +
                    "pre jeho svätosť a horlivosť; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sa Cirkev horlivosťou tvojich služobníkov <br>" +
                    "aj v našich časoch vzmáhala vo svätosti. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"11", "Všemohúci a večný Bože, <br>" +
                    "ty si udelil blahoslavenej Sáre, panne a mučenici, <br>" +
                    "že tebe zasvätený život korunovala mučeníctvom; <font color='#B71C1C'>*</font><br>" +
                    "na jej orodovanie prosíme, <br>" +
                    "udeľ nám milosť ohlasovať spásu chudobným, <font color='#B71C1C'>—</font><br>" +
                    "vykúpenie väzneným a radosť zarmúteným. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"12a", "Všemohúci Bože, <br>" +
                    "poznáme veľkú odvahu <br>" +
                    "slávnych mučeníkov Nerea a Achila, <br>" +
                    "s akou ťa vyznali; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy pociťovali účinky ich orodovania. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"12b", "Bože, nech sa tvoja Cirkev raduje, <br>" +
                    "že sa za ňu prihovára svätý mučeník Pankrác; <font color='#B71C1C'>*</font><br>" +
                    "na jeho slávne prosby dopraj, <br>" +
                    "aby sme ti boli nábožne oddaní <font color='#B71C1C'>—</font><br>" +
                    "a zostali pevní pod tvojou ochranou. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"13m", "Bože, ty si Matku svojho Syna <br>" +
                    "ustanovil aj za našu Matku; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme zotrvávali <br>" +
                    "v pokání a na modlitbách za spásu sveta <font color='#B71C1C'>—</font><br>" +
                    "a mohli deň čo deň účinnejšie zveľaďovať Kristovo kráľovstvo. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.","",""},
                    {"14g", "Bože, ty si pridružil <br>" +
                            "svätého Mateja k zboru apoštolov; <font color='#B71C1C'>*</font><br>" +
                            "na jeho orodovanie dopraj, <br>" +
                            "aby všetci, ktorých zahŕňaš svojou láskou, <font color='#B71C1C'>—</font><br>" +
                            "boli raz pripočítaní k tvojim vyvoleným. <br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.",
                            "Pane, prijmi dary, <br>" +
                                    "ktoré ti tvoja Cirkev úctivo predkladá <br>" +
                                    "na sviatok svätého apoštola Mateja, <font color='#B71C1C'>*</font><br>" +
                                    "a láskavo dopraj, <font color='#B71C1C'>—</font><br>" +
                                    "aby nás posilnili tvojou milosťou. <br>" +
                                    "Skrze Krista, nášho Pána.",
                            "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                                    "neprestajne zahŕňaj rodinu <br>" +
                                    "svojich veriacich nebeskými darmi <font color='#B71C1C'>—</font><br>" +
                                    "a na príhovor svätého Mateja nás prijmi <br>" +
                                    "do blaženého spoločenstva svojich svätých.<br>" +
                                    "Skrze Krista, nášho Pána."},
                    {"16g", "Milosrdný Bože, <br>" +
                            "ty si vyvolil kňaza a mučeníka Jána <br>" +
                            "za obrancu práv Cirkvi <br>" +
                            "a za strážcu spovedného tajomstva; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pomáhaj nám, <br>" +
                            "aby sme si vzali príklad z jeho statočnosti <font color='#B71C1C'>—</font><br>" +
                            "a verne konali službu, do ktorej si nás povolal. <br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.",
                            "Bože, prijmi obetu zmierenia a chvály, <br>" +
                                    "ktorú slávime na sviatok svätého Jána Nepomuckého; <font color='#B71C1C'>*</font><br>" +
                                    "pre jej zásluhy odpusť nám hriechy <font color='#B71C1C'>—</font><br>" +
                                    "a naplň nás ustavičnou vďačnosťou. <br>" +
                                    "Skrze Krista, nášho Pána.",
                            "Milosrdný Bože, nech nás posilňuje <br>" +
                                    "nebeský chlieb, ktorý sme prijali, <font color='#B71C1C'>*</font><br>" +
                                    "ako posilňoval tvojho kňaza a mučeníka Jána, <font color='#B71C1C'>—</font><br>" +
                                    "aby sme ti vždy a vo všetkých <br>" +
                                    "okolnostiach zostali verní. <br>" +
                                    "Skrze Krista, nášho Pána."},
                    {"18", "Bože, odmena verných duší, <br>" +
                            "ty si tento deň posvätil mučeníctvom <br>" +
                            "svätého pápeža Jána; <font color='#B71C1C'>*</font><br>" +
                            "láskavo vypočuj prosby svojho ľudu <br>" +
                            "a daj, aby sme aj my, keď obdivujeme jeho zásluhy, <font color='#B71C1C'>—</font><br>" +
                            "napodobňovali jeho stálosť vo viere. <br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
                    {"20", "Bože, ty si vložil do srdca svojho kňaza Bernardína <br>" +
                            "veľkú lásku k svätému menu Ježiš; <font color='#B71C1C'>*</font><br>" +
                            "pre jeho zásluhy a na jeho orodovanie dopraj, <font color='#B71C1C'>—</font><br>" +
                            "aby sme aj my horeli láskou k tebe. <br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
                    {"21", "Všemohúci a večný Bože, <br>" +
                            "ty si svätého kňaza Krištofa a jeho spoločníkov <br>" +
                            "urobil vernými Kristovi Kráľovi až po mučeníctvo; <font color='#B71C1C'>*</font><br>" +
                            "na ich príhovor dopraj, <br>" +
                            "aby sme vytrvali vo vyznávaní pravej viery, <font color='#B71C1C'>—</font><br>" +
                            "a tak sa vždy pridŕžali prikázaní tvojej lásky. <br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
                    {"22", "Prosíme ťa, Pane, <br>" +
                            "uštedri nám múdrosť a silu kríža, <br>" +
                            "ktorými si milostivo obdaril svätú Ritu, <font color='#B71C1C'>*</font><br>" +
                            "aby sme v súženiach trpeli s Kristom, <font color='#B71C1C'>—</font><br>" +
                            "a tak mohli mať hlbokú účasť na jeho veľkonočnom tajomstve. <br>" +
                            "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                            "v jednote Ducha Svätého po všetky veky vekov.","",""},
                    {"25a", "Bože, ty osvecuješ svoju Cirkev <br>" +
                            "náukou svätého kňaza Bédu; <font color='#B71C1C'>*</font><br>" +
                            "láskavo dopraj, aby nás vždy osvecovala jeho múdrosť <font color='#B71C1C'>—</font><br>" +
                            "a pomáhali nám jeho zásluhy. <br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
                    {"25b", "Prosíme ťa, Pane, <br>" +
                            "daj nám ducha sily a horlivosti za spravodlivosť, <br>" +
                            "ktorými si nechal zažiariť svätého pápeža Gregora, <font color='#B71C1C'>*</font><br>" +
                            "aby Cirkev s odvahou vystupovala proti bezpráviu <font color='#B71C1C'>—</font><br>" +
                            "a s láskou a slobodne podporovala všetko, čo je správne. <br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
                    {"25c", "Bože, milovník panenskej čistoty, <br>" +
                            "ty si obdaril nebeskými darmi <br>" +
                            "svätú pannu Máriu Magdalénu <font color='#B71C1C'>(</font>de Pazzi<font color='#B71C1C'>)</font>, <br>" +
                            "ktorej srdce horelo láskou k tebe; <font color='#B71C1C'>*</font><br>" +
                            "a keď ju dnes oslavujeme, dopraj, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ju nasledovali v jej príklade čistoty a lásky. <br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
                    {"26", "Bože, svojich verných služobníkov <br>" +
                            "korunuješ slávou svätosti; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, dopraj, aby Duch Svätý zapálil v nás oheň, <font color='#B71C1C'>—</font><br>" +
                            "ktorý obdivuhodne prenikol srdce svätého Filipa. <br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.",
                            "Pane, prinášame ti obetu chvály <font color='#B71C1C'>*</font><br>" +
                                    "a prosíme ťa, daj, aby sme <br>" +
                                    "podľa príkladu svätého Filipa <br>" +
                                    "vždy oslavovali tvoje meno <font color='#B71C1C'>—</font><br>" +
                                    "a s radosťou slúžili blížnym. <br>" +
                                    "Skrze Krista, nášho Pána.",
                            "Pane, nasýtil si nás nebeským pokrmom; <font color='#B71C1C'>*</font><br>" +
                                    "daj, prosíme, aby sme podľa <br>" +
                                    "príkladu svätého Filipa vždy túžili po tejto posile, <font color='#B71C1C'>—</font><br>" +
                                    "ktorá v nás zveľaďuje opravdivý život. <br>" +
                                    "Skrze Krista, nášho Pána."},
                    {"27", "Bože, ty si ohlasovaním svätého biskupa Augustína <br>" +
                            "priviedol národy Anglicka k evanjeliu; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <br>" +
                            "aby jeho vytrvalá práca v tvojej Cirkvi <font color='#B71C1C'>—</font><br>" +
                            "vždy prinášala novú úrodu. <br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
                    {"29", "Bože, ty si zveril svoju Cirkev <br>" +
                            "svätému pápežovi Pavlovi, <br>" +
                            "horlivému ohlasovateľovi evanjelia tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, dopraj, <font color='#B71C1C'>—</font><br>" +
                            "aby sme podľa jeho náuky spolupracovali s tebou <br>" +
                            "na šírení vzájomnej úcty a lásky medzi ľuďmi.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
    };

    String[][] modlitba6 = {
            {"01", "Bože, ty si svätého mučeníka Justína <br>" +
                    "obdivuhodne priviedol k jedinečnému <br>" +
                    "poznaniu Ježiša Krista skrze kríž, <br>" +
                    "ktorý je pre múdrych bláznovstvom; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme odmietali bludné náuky a upevňovali sa vo viere. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "dopraj, aby sme dôstojne slávili tieto tajomstvá, <font color='#B71C1C'>—</font><br>" +
                            "ktoré svätý Justín tak statočne obraňoval. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, posilnení nebeským pokrmom <br>" +
                            "pokorne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby sme nasledovali náuku svätého mučeníka Justína <font color='#B71C1C'>—</font><br>" +
                            "a vždy vzdávali vďaky za prijaté dary. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"02", "Bože, ty nás pre slávne vyznanie <br>" +
                    "svätých mučeníkov Marcelína a Petra <br>" +
                    "zahŕňaš ochranou; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, aby sme mali úžitok z ich nasledovania <font color='#B71C1C'>—</font><br>" +
                    "a posilu z ich príhovoru za nás. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"03", "Bože, tvojím pôsobením sa krv mučeníkov <br>" +
                    "stala semenom nových kresťanov; <font color='#B71C1C'>*</font><br>" +
                    "dopraj láskavo, aby pole tvojej Cirkvi, <br>" +
                    "skropené krvou svätého Karola a jeho spoločníkov, <font color='#B71C1C'>—</font><br>" +
                    "prinášalo stále hojnú úrodu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, svätým mučeníkom <br>" +
                            "si dal silu radšej zomrieť, ako zhrešiť; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, prijmi naše obetné dary <br>" +
                            "a dopraj, aby sme boli oddaní iba tebe <font color='#B71C1C'>—</font><br>" +
                            "a slúžili ti pri tvojom oltári.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, pri oslave víťaznej smrti <br>" +
                            "svätých mučeníkov prijali sme Eucharistiu, <br>" +
                            "ktorá ich posilňovala v utrpení; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby táto sviatosť aj nám <br>" +
                            "pomáhala zachovať si pevnú vieru a lásku <br>" +
                            "uprostred skúšok a protivenstiev. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"05", "Bože, na orodovanie <br>" +
                    "svätého mučeníka Bonifáca nám pomáhaj, <font color='#B71C1C'>*</font><br>" +
                    "aby sme pevne vyznávali a životom dosvedčovali vieru, <font color='#B71C1C'>—</font><br>" +
                    "ktorú on neohrozene hlásal a spečatil svojou krvou. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"06", "Bože, ty si ustanovil svätého Norberta <br>" +
                    "za biskupa a služobníka svojej Cirkvi <br>" +
                    "pre jeho lásku k modlitbe a pastiersku horlivosť; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jeho príhovor dopraj, <br>" +
                    "aby spoločenstvo veriacich <br>" +
                    "malo vždy pastierov podľa tvojho srdca, <font color='#B71C1C'>—</font><br>" +
                    "ktorí ho budú neustále viesť k prameňom spásy. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"09", "Bože, láskavo vlej <br>" +
                    "do našich sŕdc silu Ducha Svätého, <br>" +
                    "ktorým si podnietil svätého diakona Efréma, <font color='#B71C1C'>*</font><br>" +
                    "aby radostne ospevoval <br>" +
                    "vznešenosť tvojich tajomstiev <font color='#B71C1C'>—</font><br>" +
                    "a slúžil jedine tebe. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"11", "Bože, ty si poslal svätého Barnabáša, <br>" +
                    "plného viery a Ducha Svätého, obrátiť národy k viere; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sa Kristovo evanjelium, <br>" +
                    "ktoré on tak neochvejne šíril, <font color='#B71C1C'>—</font><br>" +
                    "stále s vierou ohlasovalo slovami i skutkami. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "požehnaj a posväť tieto obetné dary, <br>" +
                            "ktoré si nám dal, aby v nás zapálili oheň tvojej lásky, <font color='#B71C1C'>*</font><br>" +
                            "ktorým horel svätý Barnabáš, <font color='#B71C1C'>—</font><br>" +
                            "keď niesol národom svetlo evanjelia. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, pri spomienke na svätého Barnabáša <br>" +
                            "prijali sme nebeský chlieb ako záloh večného života; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme raz z tváre do tváre videli Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                            "ktorého prijímame v Oltárnej sviatosti. <br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"13", "Všemohúci a večný Bože, <br>" +
                    "vo svätom Antonovi si dal svojmu ľudu <br>" +
                    "vynikajúceho kazateľa <br>" +
                    "a mocného pomocníka v núdzi; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme s jeho pomocou žili <br>" +
                    "podľa kresťanských zásad <font color='#B71C1C'>—</font><br>" +
                    "a vo všetkých protivenstvách cítili tvoju ochranu. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"16+", "Všemohúci a milosrdný Bože, ty si svätému Neitovi pomáhal<br>" +
                    "hrdinsky znášať útrapy mučenia; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomôž<br>" +
                    "tak pracovať na šírení viery, <font color='#B71C1C'>—</font><br>" +
                    "aby sme získali pre Krista<br>" +
                    "čím viac bratov a sestier<br>" +
                    "a spolu s nimi dosiahli večný život. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého<br>" +
                    "po všetky veky vekov. ",
                    "Dobrotivý Bože, požehnaj tieto dary <font color='#B71C1C'>*</font><br>" +
                            "a posilni nás vo viere, <font color='#B71C1C'>—</font><br>" +
                            "ktorú svätý Neitus dosvedčil <br>" +
                            "obetovaním svojho života. <br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Láskavý Bože, nech v nás táto obeta<br>" +
                            "vzbudí takú duševnú silu, <font color='#B71C1C'>*</font><br>" +
                            "akú prejavoval svätý mučeník Neitus v tvojej službe <font color='#B71C1C'>—</font><br>" +
                            "a v hrdinskom utrpení. <br>" +
                            "Skrze Krista, nášho Pána. "},
            {"19", "Bože, ty si prostredníctvom svätého Romualda <br>" +
                    "obnovil vo svojej Cirkvi pustovnícky spôsob života; <font color='#B71C1C'>*</font><br>" +
                    "pomôž aj nám premáhať seba a nasledovať Krista, <font color='#B71C1C'>—</font><br>" +
                    "aby sme šťastne došli do nebeského kráľovstva. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"21", "Bože, pôvodca nebeských darov, <br>" +
                    "ty si v živote svätého Alojza <br>" +
                    "spojil obdivuhodnú nevinnosť s kajúcnosťou; <font color='#B71C1C'>*</font><br>" +
                    "pre jeho zásluhy a na jeho príhovor nám dopraj, <br>" +
                    "aby sme ho napodobňovali v kajúcnosti, <font color='#B71C1C'>—</font><br>" +
                    "ak sme ho nenasledovali v nevinnosti. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "daj, aby sme ako svätý Alojz <br>" +
                            "prichádzali na nebeskú hostinu odetí <br>" +
                            "do svadobného rúcha <font color='#B71C1C'>*</font><br>" +
                            "a účasťou na tomto tajomstve <font color='#B71C1C'>—</font><br>" +
                            "získali hojnosť tvojej milosti. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás anjelským pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme ti podľa príkladu <br>" +
                            "svätého Alojza slúžili s čistým srdcom <font color='#B71C1C'>—</font><br>" +
                            "a ustavične ti vzdávali vďaky. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"22a", "Bože, ty si učinil svätého biskupa Pavlína <br>" +
                    "žiarivým príkladom apoštolskej horlivosti <br>" +
                    "a lásky k chudobným; <font color='#B71C1C'>*</font><br>" +
                    "keď slávime jeho zásluhy, dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme napodobňovali aj príklad jeho činorodej lásky. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"22b", "Bože, mučenícka smrť <br>" +
                    "je najdokonalejším svedectvom pravej viery; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme posilnení príhovorom <br>" +
                    "svätých Jána Fišera a Tomáša Morusa <br>" +
                    "potvrdzovali svedectvom života vieru, <font color='#B71C1C'>—</font><br>" +
                    "ktorú vyznávame ústami. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"23gk", "Všemohúci Bože, <br>" +
                    "daj, aby sme kráčali cestou spásy <br>" +
                    "a nasledovali výzvy svätého Jána, <br>" +
                    "Pánovho predchodcu, <font color='#B71C1C'>*</font><br>" +
                    "aby sme tak bezpečne prišli k tomu, <br>" +
                    "ktorého on predpovedal, <font color='#B71C1C'>—</font><br>" +
                    "k nášmu Pánovi Ježišovi Kristovi. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "láskavo zhliadni na dary, <br>" +
                            "ktoré ti prinášame na slávnosť <br>" +
                            "svätého Jána Krstiteľa, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme ti oddane slúžili <br>" +
                            "pri oltári aj v každodennom živote. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás nebeským pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "daj, nech nás sprevádza láskavý <br>" +
                            "príhovor svätého Jána Krstiteľa <font color='#B71C1C'>—</font><br>" +
                            "a nech nám vyprosí zmilovanie u tvojho Syna, <br>" +
                            "ktorého nazval Baránkom, čo sníma naše hriechy. <br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"24gk", "Bože, ty si poslal svätého Jána Krstiteľa, <br>" +
                    "aby pripravil ľudí na prijatie Ježiša Krista; <font color='#B71C1C'>*</font><br>" +
                    "daj svojmu ľudu milosť duchovných radostí <font color='#B71C1C'>—</font><br>" +
                    "a veď srdcia všetkých veriacich po ceste pokoja a spásy. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prinášame obetné dary na tvoj oltár <br>" +
                            "v deň slávnosti narodenia svätého Jána Krstiteľa, <font color='#B71C1C'>*</font><br>" +
                            "ktorý zvestoval príchod Spasiteľa sveta <font color='#B71C1C'>—</font><br>" +
                            "a ukázal na neho, že už je tu. <br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Pane, na sviatok narodenia <br>" +
                            "svätého Jána Krstiteľa posilnil si nás <br>" +
                            "na hostine nebeského Baránka <br>" +
                            "a naplnil svätou radosťou; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby tvoja Cirkev čoraz lepšie poznávala, <font color='#B71C1C'>—</font><br>" +
                            "že Kristus, ktorého Ján predpovedal, <br>" +
                            "je pôvodcom nášho znovuzrodenia. <br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"27b", "Bože, vo svätom Cyrilovi <br>" +
                    "si dal Cirkvi neohrozeného obrancu pravdy, <br>" +
                    "že preblahoslavená Panna Mária je Bohorodičkou; <font color='#B71C1C'>*</font><br>" +
                    "aj my veríme, že je naozaj Božou Matkou, a prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dosiahli spásu v tvojom Synovi Ježišovi Kristovi, <br>" +
                    "ktorý sa pre nás stal človekom. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.","",""},
            {"27a", "Všemohúci a večný Bože, <br>" +
                    "vo svätom Ladislavovi si nám dal príklad, <br>" +
                    "ako ti možno oddane slúžiť v každom povolaní; <font color='#B71C1C'>*</font><br>" +
                    "láskavo nám pomáhaj, <br>" +
                    "aby sme Kristovou náukou zveľaďovali svornosť <font color='#B71C1C'>—</font><br>" +
                    "a upevňovali lásku medzi ľuďmi. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov. ","",""},
            {"28", "Bože, ty si povolal svätého biskupa Ireneja <br>" +
                    "posilňovať pravé učenie a pokoj v Cirkvi; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jeho príhovor <br>" +
                    "obnov v nás vieru a lásku, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa vždy usilovali o jednotu a svornosť. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, v deň narodenia svätého Ireneja <br>" +
                            "pre nebo ti s radosťou prinášame svätú obetu; <font color='#B71C1C'>*</font><br>" +
                            "nech sa ňou oslávi tvoje meno <br>" +
                            "a nech nás upevní v láske k pravde, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa držali neporušenej viery <br>" +
                            "a zachovali jednotu Cirkvi. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, týmito posvätnými tajomstvami <br>" +
                            "zveľaďuj v nás vieru, <br>" +
                            "za ktorú svätý biskup Irenej <br>" +
                            "podstúpil mučenícku smrť, <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj nám, aby sme aj my <br>" +
                            "dôsledne žili podľa viery, <font color='#B71C1C'>—</font><br>" +
                            "ktorá nás urobí spravodlivými pred tebou. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"28gk", "Pane a Bože náš, <br>" +
                    "požehnaným pôsobením svätých apoštolov <br>" +
                    "Petra a Pavla dal si Cirkvi pevný základ; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "na ich príhovor poskytni nám pomoc <br>" +
                    "potrebnú na večnú spásu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, na slávnosť svätých apoštolov <br>" +
                            "Petra a Pavla kladieme na tvoj oltár obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "a hoci nás veľmi zarmucujú naše poklesky, <font color='#B71C1C'>—</font><br>" +
                            "predsa máme nádej, že nás zachrániš pre svoju dobrotu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "posilňuj nebeským pokrmom svojich veriacich, <font color='#B71C1C'>—</font><br>" +
                            "ktorých si poučil náukou apoštolov. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"29gk", "Bože, dnešnou slávnosťou <br>" +
                    "svätých Petra a Pavla pripravil si nám <br>" +
                    "veľkú a svätú radosť; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby tvoja Cirkev <br>" +
                    "vo všetkom nasledovala učenie apoštolov, <font color='#B71C1C'>—</font><br>" +
                    "od ktorých prijala základ viery. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech orodovanie apoštolov sprevádza dary, <font color='#B71C1C'>*</font><br>" +
                            "ktoré ti prinášame na posvätenie, <font color='#B71C1C'>—</font><br>" +
                            "a nech nám ich príhovor <br>" +
                            "pomáha nábožne sláviť túto obetu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, posilnení touto sviatosťou <br>" +
                            "vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "pomôž nám v Cirkvi žiť tak, <br>" +
                            "aby sme sa ako prví kresťania <br>" +
                            "vytrvalo zúčastňovali na lámaní chleba, <font color='#B71C1C'>—</font><br>" +
                            "ostali verní náuke apoštolov, <br>" +
                            "a tak boli jedno srdce a jedna duša. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "Bože, sľubné začiatky Cirkvi v Ríme <br>" +
                    "si posvätil krvou mnohých mučeníkov; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj, nech čerpáme <br>" +
                    "silu z ich veľkej odvahy <font color='#B71C1C'>—</font><br>" +
                    "a nech sa navždy tešíme z ich svätého víťazstva. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
    };

    String[][] modlitba7 = {
            {"02gm", "Všemohúci a večný Bože, <br>" +
                    "keď preblahoslavená Panna Mária <br>" +
                    "nosila pod srdcom tvojho Syna, <br>" +
                    "vnukol si jej, aby navštívila Alžbetu; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme ochotne <br>" +
                    "nasledovali vnuknutia Ducha Svätého <font color='#B71C1C'>—</font><br>" +
                    "a spolu s Pannou Máriou ťa vždy mohli velebiť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech ti je milá táto naša obeta, <font color='#B71C1C'>—</font><br>" +
                            "ako ti bola milá služba lásky <br>" +
                            "najsvätejšej Matky tvojho jednorodeného Syna.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, nech ťa tvoja Cirkev zvelebuje, <br>" +
                            "pretože si pre svojich veriacich <br>" +
                            "urobil veľké veci, <font color='#B71C1C'>*</font><br>" +
                            "a ako svätý Ján zaplesal, <br>" +
                            "keď pocítil prítomnosť Božieho Syna, <font color='#B71C1C'>—</font><br>" +
                            "tak nech aj my s radosťou prijímame Ježiša Krista, <br>" +
                            "vždy prítomného v Oltárnej sviatosti.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"03g", "Všemohúci Bože, s radosťou slávime <br>" +
                    "sviatok svätého apoštola Tomáša, <br>" +
                    "ktorý vyznal, že tvoj Syn je Pán a Boh; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, nech nás ustavične <br>" +
                    "sprevádza ochrana tohto apoštola, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vierou mali život v Ježišovom mene.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, pri oslave vyznania <br>" +
                            "svätého apoštola Tomáša <br>" +
                            "prinášame ti povinnú obetu chvály <font color='#B71C1C'>*</font><br>" +
                            "a pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "zachovaj v nás milosť vykúpenia.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, v tejto sviatosti sme prijali <br>" +
                            "skutočné Telo tvojho jednorodeného Syna <br>" +
                            "a spolu s apoštolom Tomášom <br>" +
                            "v Kristovi spoznávame nášho Pána a Boha; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme sa k nemu hlásili nielen slovom, <font color='#B71C1C'>—</font><br>" +
                            "ale celým svojím životom.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"04", "Bože, pôvodca pokoja a pravej lásky, <br>" +
                    "ty si obdaril svätú Alžbetu obdivuhodnou <br>" +
                    "milosťou zmierovať hnevníkov; <font color='#B71C1C'>*</font><br>" +
                    "na jej príhovor nám pomáhaj <br>" +
                    "vnášať pokoj medzi ľudí, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa mohli nazývať Božími deťmi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"05gk", "Všemohúci a večný Bože, <br>" +
                    "ty si našim predkom poslal svätých Cyrila a Metoda, <br>" +
                    "aby ich priviedli k pravej viere; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si verne zachovali dedičstvo otcov, <br>" +
                    "statočne vyznávali svoju vieru a podľa nej aj žili.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Láskavý Bože, <br>" +
                            "prinášame ti obetné dary na počesť <br>" +
                            "našich vierozvestov Cyrila a Metoda <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                            "aby si  nám pre túto svätú obetu <br>" +
                            "udelil dar jednoty a pokoja.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "prijali sme nebeský chlieb, ktorý je znakom jednoty; <font color='#B71C1C'>*</font><br>" +
                            "na orodovanie svätých Cyrila a Metoda udeľ nám milosť, <font color='#B71C1C'>—</font><br>" +
                            "aby všetci kresťania, zjednotení vo viere, <br>" +
                            "mohli spoločne sláviť tajomstvo Eucharistie.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"06", "Bože, pôvodca nevinnosti a milovník čistoty, <br>" +
                    "ty si svätej Márii Goretti dal v kvete mladosti <br>" +
                    "milosť mučeníctva pri obrane čistoty <br>" +
                    "a odmenil si ju vencom slávy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jej orodovanie nám udeľ milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme verne zachovávali tvoje prikázania.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"07", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme v duchu apoštola Pavla <br>" +
                    "nasledovali vznešené poznanie Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                    "ktoré svätý Anton Mária naplnený múdrosťou <br>" +
                    "slova spásy ustavične ohlasoval v tvojej Cirkvi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"09", "Bože, ty si vyznaním <br>" +
                    "svätého mučeníka Augustína a jeho spoločníkov <br>" +
                    "obdivuhodným riadením posilnil svoju Cirkev; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby tvoj ľud verný svojmu <br>" +
                    "zverenému poslaniu dosiahol rast slobody <font color='#B71C1C'>—</font><br>" +
                    "a svedčil vo svete o pravde.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"11g", "Bože, ty si vo svätom opátovi Benediktovi <br>" +
                    "ustanovil veľkého učiteľa duchovného života; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme na prvé miesto <br>" +
                    "vždy kládli lásku k tebe <font color='#B71C1C'>—</font><br>" +
                    "a veľkodušne kráčali po ceste tvojich prikázaní.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, milostivo zhliadni na tieto obetné dary, <br>" +
                            "ktoré ti prinášame v deň spomienky na svätého Benedikta, <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby sme podľa jeho príkladu <br>" +
                            "vždy a všade hľadali teba <font color='#B71C1C'>—</font><br>" +
                            "a v tvojej službe dostali dar jednoty a pokoja.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, vo sviatosti, ktorú sme prijali, <br>" +
                            "dal si nám záruku večného života; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, dopraj, aby sme ti <br>" +
                            "podľa vzoru svätého Benedikta svedomite slúžili <font color='#B71C1C'>—</font><br>" +
                            "a činorodou láskou milovali svojich blížnych.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"13", "Bože, ty si svätého Henricha <br>" +
                    "obdaril svojou milosťou <br>" +
                    "a uprostred starostí o pozemské kráľovstvo <br>" +
                    "si dvíhal jeho myseľ k veciam nebeským; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vo víre tohto sveta <br>" +
                    "kráčali k tebe s čistou mysľou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"14", "Bože, ty si svätému kňazovi Kamilovi <br>" +
                    "udelil osobitnú milosť lásky k chorým; <font color='#B71C1C'>*</font><br>" +
                    "pre jeho zásluhy naplň nás duchom svojej lásky, <br>" +
                    "aby sme ti slúžili vo svojich blížnych <font color='#B71C1C'>—</font><br>" +
                    "a v hodine našej smrti mohli bez strachu <br>" +
                    "predstúpiť pred tvoju tvár.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"15", "Všemohúci Bože, <br>" +
                    "pri oslave svätého biskupa Bonaventúru, <br>" +
                    "ktorý sa dnes narodil pre nebo, <br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme mohli čerpať z bohatstva jeho náuky <font color='#B71C1C'>—</font><br>" +
                    "a vytrvalo ho nasledovať v horlivej láske.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"16m", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "nech nám pomáha mocné <br>" +
                    "orodovanie slávnej Panny Márie, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pod jej ochranou bezpečne došli <br>" +
                    "k vrcholu dokonalosti, ktorým je Kristus.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.","",""},
            {"17", "Láskavý Bože, <br>" +
                    "na tvoje vnuknutie sa svätí Andrej Svorad a Beňadik <br>" +
                    "odobrali do ticha samoty, aby ti modlitbou, <br>" +
                    "prácou i mlčaním dokonalejšie slúžili; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie pomôž aj nám uprostred <br>" +
                    "hluku tohto sveta započúvať sa do tvojho hlasu <font color='#B71C1C'>—</font><br>" +
                    "a dôsledne plniť tvoju vôľu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Svätý Bože, nech sú ti milé dary, <br>" +
                            "ktoré prinášame na oltár pri spomienke <br>" +
                            "na svätých Andreja Svorada a Beňadika; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, nauč nás správne hodnotiť pozemské veci <font color='#B71C1C'>—</font><br>" +
                            "a dávať prednosť hodnotám trvácnym.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                            "nech nám toto sväté prijímanie posvätí myseľ i srdce, <font color='#B71C1C'>—</font><br>" +
                            "aby sme podľa príkladu tvojich svätých pustovníkov <br>" +
                            "preukazovali bratskú lásku dobrými skutkami.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"17gn", "Láskavý Bože, <br>" +
                    "na tvoje vnuknutie sa svätí Andrej Svorad a Beňadik <br>" +
                    "odobrali do ticha samoty, aby ti modlitbou, <br>" +
                    "prácou i mlčaním dokonalejšie slúžili; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie pomôž aj nám uprostred <br>" +
                    "hluku tohto sveta započúvať sa do tvojho hlasu <font color='#B71C1C'>—</font><br>" +
                    "a dôsledne plniť tvoju vôľu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Svätý Bože, nech sú ti milé dary, <br>" +
                            "ktoré prinášame na oltár pri spomienke <br>" +
                            "na svätých Andreja Svorada a Beňadika; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, nauč nás správne hodnotiť pozemské veci <font color='#B71C1C'>—</font><br>" +
                            "a dávať prednosť hodnotám trvácnym.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                            "nech nám toto sväté prijímanie posvätí myseľ i srdce, <font color='#B71C1C'>—</font><br>" +
                            "aby sme podľa príkladu tvojich svätých pustovníkov <br>" +
                            "preukazovali bratskú lásku dobrými skutkami.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"17gkn", "Láskavý Bože, <br>" +
                    "na tvoje vnuknutie sa svätí Andrej Svorad a Beňadik <br>" +
                    "odobrali do ticha samoty, aby ti modlitbou, <br>" +
                    "prácou i mlčaním dokonalejšie slúžili; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie pomôž aj nám uprostred <br>" +
                    "hluku tohto sveta započúvať sa do tvojho hlasu <font color='#B71C1C'>—</font><br>" +
                    "a dôsledne plniť tvoju vôľu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Svätý Bože, nech sú ti milé dary, <br>" +
                            "ktoré prinášame na oltár pri spomienke <br>" +
                            "na svätých Andreja Svorada a Beňadika; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, nauč nás správne hodnotiť pozemské veci <font color='#B71C1C'>—</font><br>" +
                            "a dávať prednosť hodnotám trvácnym.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                            "nech nám toto sväté prijímanie posvätí myseľ i srdce, <font color='#B71C1C'>—</font><br>" +
                            "aby sme podľa príkladu tvojich svätých pustovníkov <br>" +
                            "preukazovali bratskú lásku dobrými skutkami.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "Pane, usmerňuj svojich <br>" +
                    "veriacich na cestu večnej spásy, <br>" +
                    "ktorú ukázal učením <br>" +
                    "a mučeníctvom svätý biskup Apolinár; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie dopraj, <br>" +
                    "aby sme vytrvali v tvojich príkazoch <font color='#B71C1C'>—</font><br>" +
                    "a zaslúžili si veniec slávy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"21", "Bože, svätému kňazovi Vavrincovi <br>" +
                    "si udelil ducha rady a sily, <br>" +
                    "aby šíril slávu tvojho mena; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, aby sme v tom istom duchu <br>" +
                    "spoznali, čo máme konať, <font color='#B71C1C'>—</font><br>" +
                    "a na jeho orodovanie to aj uskutočňovali.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"22g", "Bože, tvoj jednorodený Syn <br>" +
                    "poslal Máriu Magdalénu, <br>" +
                    "aby prvá zvestovala apoštolom veľkonočnú radosť; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme na jej príhovor <br>" +
                    "a podľa jej príkladu ohlasovali živého Krista <font color='#B71C1C'>—</font><br>" +
                    "a raz ho uzreli vo večnej sláve ako svojho kráľa.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "prijmi dary, ktoré ti prinášame <br>" +
                            "pri spomienke na svätú Máriu Magdalénu, <font color='#B71C1C'>—</font><br>" +
                            "ako aj tvoj jednorodený Syn <br>" +
                            "dobrotivo prijal jej službu obety a úcty.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nás nábožné prijatie tejto sviatosti <br>" +
                            "naplní takou vytrvalou láskou, <font color='#B71C1C'>—</font><br>" +
                            "s akou sa svätá Mária Magdaléna <br>" +
                            "ustavične pridŕžala Krista, svojho učiteľa.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"23g", "Bože, ty si svätú Brigitu viedol rozličnými cestami života <font color='#B71C1C'>*</font><br>" +
                    "a obdivuhodne si ju naučil múdrosti kríža, <br>" +
                    "keď rozjímala o utrpení tvojho Syna; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme v ktoromkoľvek životnom stave <br>" +
                    "vo všetkom hľadali iba teba.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Najláskavejší Bože, <br>" +
                            "ty si po zničení starého človeka <br>" +
                            "láskavo stvoril vo svätej Brigite človeka nového; <font color='#B71C1C'>*</font><br>" +
                            "dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme rovnako obnovení <br>" +
                            "prinášali túto tebe milú obetu zmierenia.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, posilňuješ nás silou tejto sviatosti; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sme sa podľa príkladu svätej Brigity <br>" +
                            "učili hľadať vždy predovšetkým teba <font color='#B71C1C'>—</font><br>" +
                            "a kráčať v tomto svete ako noví ľudia.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"24", "Bože, ty si povolal svätého kňaza Šarbela, <br>" +
                    "aby viedol duchovný zápas v samote na púšti, <br>" +
                    "a naplnil si ho nesmiernou zbožnosťou; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme sa životom <br>" +
                    "pripodobnili Pánovmu utrpeniu <font color='#B71C1C'>—</font><br>" +
                    "a raz si zaslúžili mať účasť na jeho kráľovstve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"25g", "Všemohúci a večný Bože, <br>" +
                    "ty si prvotnú činnosť apoštolov <br>" +
                    "posvätil mučeníckou krvou svätého Jakuba; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, daj, aby tvoja Cirkev <br>" +
                    "čerpala posilu z jeho mučeníctva <font color='#B71C1C'>—</font><br>" +
                    "a pod jeho ochranou sa ustavične vzmáhala.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, očisti nás spasiteľným krstom <br>" +
                            "utrpenia tvojho Syna, <font color='#B71C1C'>*</font><br>" +
                            "aby sme ti mohli priniesť príjemnú obetu <br>" +
                            "na sviatok svätého Jakuba, <font color='#B71C1C'>—</font><br>" +
                            "ktorého si ako prvého z apoštolov <br>" +
                            "povolal k účasti na kalichu Kristovho utrpenia.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, na sviatok svätého apoštola Jakuba <br>" +
                            "sme s radosťou prijali vznešenú sviatosť; <font color='#B71C1C'>*</font><br>" +
                            "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "na jeho orodovanie nám pomáhaj na životnej púti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"26", "Pane, Bože našich otcov, <br>" +
                    "ty si svätých Joachima a Annu milostivo vyvolil <br>" +
                    "za rodičov Matky tvojho vteleného Syna; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <br>" +
                    "aby sme na ich spoločné orodovanie dosiahli spásu, <font color='#B71C1C'>—</font><br>" +
                    "ktorú si prisľúbil svojmu ľudu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi tieto dary ako prejav našej oddanosti, <font color='#B71C1C'>*</font><br>" +
                            "aby sme mali účasť na tom istom požehnaní, <font color='#B71C1C'>—</font><br>" +
                            "ktoré si prisľúbil Abrahámovi a jeho potomstvu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, tvoj jednorodený Syn sa stal človekom, <br>" +
                            "aby sa prostredníctvom tvojho obdivuhodného <br>" +
                            "tajomstva mohlo ľudstvo znovuzrodiť z teba; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, vo svojej láskavosti <br>" +
                            "posväť duchom adoptívneho synovstva tých, <font color='#B71C1C'>—</font><br>" +
                            "ktorých si nasýtil nebeským chlebom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"27", "Všemohúci a milosrdný Bože, <br>" +
                    "ty si povzbudzoval Metodovho <br>" +
                    "učeníka Gorazda a jeho spoločníkov, <br>" +
                    "aby pokračovali v apoštolskom <br>" +
                    "diele našich vierozvestov; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie nám pomáhaj, <br>" +
                    "aby sme aj my dnešnému svetu <br>" +
                    "ohlasovali blahozvesť tvojho Syna <font color='#B71C1C'>—</font><br>" +
                    "a upevňovali jednotu Cirkvi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Večný Bože, prijmi obetné dary, <br>" +
                            "ktoré ti prinášame v deň spomienky <br>" +
                            "na svätého Gorazda a jeho spoločníkov, <font color='#B71C1C'>*</font><br>" +
                            "a pomôž nám podľa ich príkladu <br>" +
                            "vyznávať neporušenú vieru <font color='#B71C1C'>—</font><br>" +
                            "a s láskou ti obetovať všetky ťažkosti života.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, nasýtil si nás nebeským pokrmom, <br>" +
                            "a tak si nás ešte užšie spojil so svojím Synom; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby nás nič neodlúčilo od Kristovej lásky <font color='#B71C1C'>—</font><br>" +
                            "a aby sme ako svätý Gorazd a jeho spoločníci <br>" +
                            "trpezlivo prekonávali všetky protivenstvá.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"29", "Bože, tvoj Syn<br>" +
                    "povolal Lazára z hrobu späť do života<br>" +
                    "a prijal pohostinstvo v dome svätej Marty; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme,<br>" +
                    "aby sme mu verne slúžili v našich blížnych <font color='#B71C1C'>—</font><br>" +
                    "a spolu s Máriou sa mohli živiť<br>" +
                    "počúvaním jeho slov.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, velebíme ťa pre milosť,<br>" +
                            "ktorou si obdaril svojich svätých, <font color='#B71C1C'>*</font><br>" +
                            "a pokorne ťa prosíme,<br>" +
                            "aby ti aj naša posvätná služba bola príjemná, <font color='#B71C1C'>—</font><br>" +
                            "ako ti bol milý prejav ich pohostinnej lásky.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech nás prijatie Tela a Krvi<br>" +
                            "tvojho jednorodeného Syna vedie<br>" +
                            "k správnemu používaniu pominuteľných vecí, <font color='#B71C1C'>*</font><br>" +
                            "aby sme ti podľa príkladu<br>" +
                            "svätých Marty, Márie a Lazára<br>" +
                            "slúžili s oddanou láskou <font color='#B71C1C'>—</font><br>" +
                            "a v nebi sa tešili z večného pohľadu na teba.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "Bože, vo svätom biskupovi Petrovi Chryzológovi <br>" +
                    "dal si svojej Cirkvi vynikajúceho hlásateľa <br>" +
                    "tvojho vteleného Slova; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, aby sme <br>" +
                    "s milujúcim srdcom uvažovali o tajomstvách spásy <font color='#B71C1C'>—</font><br>" +
                    "a verne o nich svedčili svojimi skutkami.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"30b", "Dobrotivý Bože, ty si dal blahoslavenej Zdenke <br>" +
                    "nevšednú lásku k ukrižovanému Kristovi, <br>" +
                    "ktorú prejavila radostnou službou <br>" +
                    "chorým a tvojim kňazom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, dopraj aj nám, <br>" +
                    "aby sme ju nasledovali v úprimnej ochote <br>" +
                    "dať svoj život do služby bratom a sestrám <font color='#B71C1C'>—</font><br>" +
                    "a boli nadšenými svedkami tvojho Syna Ježiša Krista.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.","",""},
            {"31", "Bože, vo svojej Cirkvi si povolal svätého Ignáca, <br>" +
                    "aby šíril väčšiu slávu tvojho mena; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme podľa jeho príkladu <br>" +
                    "a s jeho pomocou bojovali dobrý boj na zemi <font color='#B71C1C'>—</font><br>" +
                    "a spolu s ním dosiahli veniec slávy v nebi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov. ",
                    "Pane a Bože náš, láskavo prijmi obetné dary, <br>" +
                            "ktoré ti prinášame pri oslave svätého Ignáca, <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby nás posvätilo v pravde eucharistické tajomstvo, <font color='#B71C1C'>—</font><br>" +
                            "ktoré si ustanovil za prameň všetkej svätosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, priniesli sme ti obetu chvály <br>" +
                            "ako poďakovanie za svätého Ignáca; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, dopraj, <font color='#B71C1C'>—</font><br>" +
                            "aby nás Eucharistia priviedla <br>" +
                            "k trvalej oslave tvojej vznešenosti.<br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] modlitba8 = {
            {"01", "Bože, svojej Cirkvi stále udeľuješ nové vzory čností; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme v horlivosti za spásu duší <br>" +
                    "kráčali po stopách svätého biskupa Alfonza <font color='#B71C1C'>—</font><br>" +
                    "a dosiahli s ním večnú odmenu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, svätému Alfonzovi <br>" +
                            "si dal milosť sláviť tieto tajomstvá <br>" +
                            "a v nich ti prinášať aj seba samého ako svätú obetu; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                            "roznieť aj naše srdcia ohňom svojho Ducha.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, ty si vo svojej prozreteľnosti povolal <br>" +
                            "svätého Alfonza za verného vysluhovateľa <br>" +
                            "a ohlasovateľa tohto veľkého tajomstva; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby tvoji veriaci <br>" +
                            "často prijímali Najsvätejšiu sviatosť <font color='#B71C1C'>—</font><br>" +
                            "a bez prestania ti za ňu ďakovali.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"02a", "Pane a Bože náš, <br>" +
                    "daj nám silu vyznávať božstvo tvojho Syna <br>" +
                    "s vytrvalosťou svätého biskupa Euzébia, <font color='#B71C1C'>*</font><br>" +
                    "aby sme si zachovali vieru, ktorú on učil, <font color='#B71C1C'>—</font><br>" +
                    "a zaslúžili si mať účasť na živote tvojho Syna Ježiša Krista.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.","",""},
            {"02b", "Bože, ty si svätého Petra Juliána <br>" +
                    "vyznačil obdivuhodnou láskou <br>" +
                    "k svätým tajomstvám Tela a Krvi tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "milostivo daj, aby sme aj my mohli <br>" +
                    "prijať bohaté ovocie z tejto nebeskej hostiny, <font color='#B71C1C'>—</font><br>" +
                    "ako z nej aj on prijímal.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"04", "Všemohúci a milosrdný Bože, <br>" +
                    "ty si obdaril svätého kňaza Jána Vianneya <br>" +
                    "horlivosťou za spásu duší; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme na jeho príhovor <br>" +
                    "a podľa jeho príkladu Kristovou láskou <br>" +
                    "získavali našich bratov a sestry pre teba <font color='#B71C1C'>—</font><br>" +
                    "a dosiahli s nimi večnú spásu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"05", "Prosíme ťa, Pane, odpusť viny svojim služobníkom, <font color='#B71C1C'>*</font><br>" +
                    "a keďže sa ti nemôžeme zapáčiť svojimi skutkami, <font color='#B71C1C'>—</font><br>" +
                    "zachráň nás na orodovanie Matky tvojho Syna a nášho Pána.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.","",""},
            {"06gn", "Bože, pri slávnom premenení <br>" +
                    "svojho jednorodeného Syna si svedectvom otcov <br>" +
                    "potvrdil tajomstvá viery a obdivuhodne si naznačil <br>" +
                    "naše plné prijatie za tvoje deti; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomôž nám <br>" +
                    "počúvať tvojho milovaného Syna, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dosiahli účasť na jeho sláve.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "pre slávne premenenie tvojho jednorodeného Syna <br>" +
                            "posväť tieto obetné dary žiarou jeho slávy <font color='#B71C1C'>—</font><br>" +
                            "a očisti nás od poškvrny hriechu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, pri slávnom premenení svojho Syna <br>" +
                            "zjavil si nám jeho vznešenosť; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby nás sviatostný pokrm, ktorý sme prijali, <br>" +
                            "urobil podobnými Ježišovi Kristovi.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"07a", "Všemohúci Bože, svätého pápeža Sixta <br>" +
                    "a jeho spoločníkov si obdaril silou, <br>" +
                    "že za tvoje slovo a za Ježiša Krista položili život; <font color='#B71C1C'>*</font><br>" +
                    "aj nás posilňuj Duchom Svätým, <br>" +
                    "aby sme verne počúvali tvoje posolstvo <font color='#B71C1C'>—</font><br>" +
                    "a statočne vyznávali svoju vieru.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"07b", "Bože, ty si vnukol svätému kňazovi Kajetánovi, <br>" +
                    "aby žil podľa príkladu apoštolov; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie a podľa jeho príkladu <br>" +
                    "nauč aj nás vždy dôverovať v teba <font color='#B71C1C'>—</font><br>" +
                    "a neúnavne hľadať tvoje kráľovstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"08", "Pane, nech tvojej Cirkvi pomáhajú <br>" +
                    "zásluhy a učenie svätého Dominika, <br>" +
                    "vynikajúceho hlásateľa tvojej pravdy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "na jeho orodovanie vzbuď aj v našich časoch <br>" +
                    "presvedčivých kazateľov tvojho slova.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "na príhovor svätého Dominika láskavo zhliadni <br>" +
                            "na modlitby, ktoré ti prednášame, <font color='#B71C1C'>—</font><br>" +
                            "a silou tejto obety chráň a posilňuj <br>" +
                            "všetkých hlásateľov evanjelia.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, posilnil si nás nebeskou sviatosťou <br>" +
                            "v deň spomienky na svätého Dominika, <br>" +
                            "ktorý svojimi kázňami priviedol Cirkev k rozkvetu; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sa Cirkev <br>" +
                            "na jeho príhovor aj dnes vzmáhala <font color='#B71C1C'>—</font><br>" +
                            "a dosiahla plný účinok tejto sviatosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"09g", "Bože našich otcov, <br>" +
                    "ty si svätú mučenicu Teréziu Benediktu <br>" +
                    "priviedol k poznaniu tvojho ukrižovaného Syna <br>" +
                    "a jeho nasledovaniu až na smrť; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby na jej príhovor všetci ľudia <br>" +
                    "spoznali Krista, Spasiteľa, <font color='#B71C1C'>—</font><br>" +
                    "a skrze neho raz večne hľadeli na teba.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, dobrotivo prijmi a urob dokonalými <br>" +
                            "tieto obetné dary, ktoré ti prinášame <br>" +
                            "pri spomienke na tvoju mučenicu Teréziu Benediktu; <font color='#B71C1C'>*</font><br>" +
                            "veď ty si rozličné starozákonné obety <br>" +
                            "zavŕšil jedinou a dokonalou obetou, <font color='#B71C1C'>—</font><br>" +
                            "ktorú ti svojou krvou priniesol tvoj Syn.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Najláskavejší Bože, keď si uctievame <br>" +
                            "svätú Teréziu Benediktu, prosíme ťa, dopraj, <font color='#B71C1C'>*</font><br>" +
                            "nech nebeské ovocie zo stromu kríža <br>" +
                            "poskytne našim srdciam silu, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa verne pridŕžali Krista tu na zemi <br>" +
                            "a raz mohli jesť zo stromu života v raji.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10g", "Bože, ohnivá láska k tebe <br>" +
                    "dala svätému diakonovi Vavrincovi silu <br>" +
                    "k vernej službe a mučeníckej smrti; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme milovali to, čo on miloval, <font color='#B71C1C'>—</font><br>" +
                    "a konali to, čo učil.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "prijmi obetné dary, ktoré ti s radosťou prinášame <br>" +
                            "na sviatok svätého Vavrinca, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby nám táto eucharistická obeta bola na spásu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, na sviatok svätého Vavrinca <br>" +
                            "sme slávili svätú obetu a prijali Oltárnu sviatosť; <font color='#B71C1C'>*</font><br>" +
                            "nech nás tento nebeský pokrm posilní <font color='#B71C1C'>—</font><br>" +
                            "a upevní na ceste spásy.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "Bože, ty si vložil do srdca svätej Kláry <br>" +
                    "veľkú lásku k evanjeliovej chudobe; <font color='#B71C1C'>*</font><br>" +
                    "na jej príhovor nám pomáhaj <br>" +
                    "nasledovať Ježiša Krista v duchu chudoby, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si zaslúžili naveky žiť s tebou v nebeskom kráľovstve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"12", "Bože, svätú Janu Františku si priviedol <br>" +
                    "k veľkej svätosti v rodinnom i rehoľnom živote; <font color='#B71C1C'>*</font><br>" +
                    "na jej príhovor nám pomáhaj, <br>" +
                    "aby sme čnostne žili vo svojom povolaní, <font color='#B71C1C'>—</font><br>" +
                    "a tak dávali dobrý príklad.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"13", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby obdivuhodná statočnosť <br>" +
                    "svätých mučeníkov Ponciána a Hipolyta <br>" +
                    "ustavične v nás rozmnožovala lásku k tebe <font color='#B71C1C'>—</font><br>" +
                    "a v našich srdciach upevňovala svätú vieru.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"14", "Bože, ty si naplnil svätého kňaza <br>" +
                    "a mučeníka Maximiliána nevšednou láskou <br>" +
                    "k nepoškvrnenej Panne Márii, <br>" +
                    "horlivosťou pre spásu duší a láskou k blížnemu; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, daj, aby sme na jeho príhovor <br>" +
                    "neúnavne slúžili svojim bratom na tvoju slávu <font color='#B71C1C'>—</font><br>" +
                    "a mali silu stať sa podobnými tvojmu Synovi <br>" +
                    "aj obetovaním svojho života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prinášame ti obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa podľa príkladu svätého Maximiliána <br>" +
                            "naučili obetovať ti aj svoj život.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "daj, nech v nás prijímanie <br>" +
                            "Tela a Krvi tvojho Syna roznieti oheň lásky, <font color='#B71C1C'>—</font><br>" +
                            "ktorý čerpal svätý Maximilián z účasti <br>" +
                            "na tejto sviatostnej hostine.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14gkm", "Bože, ty si zhliadol na svoju <br>" +
                    "pokornú služobnicu Pannu Máriu, <br>" +
                    "ktorú si vyvolil za matku svojho jednorodeného Syna, <br>" +
                    "a dnešného dňa si ju korunoval najvyššou slávou; <font color='#B71C1C'>*</font><br>" +
                    "na jej príhovor prijmi aj nás do nebeského kráľovstva, <font color='#B71C1C'>—</font><br>" +
                    "veď si nás zachránil tajomstvom vykúpenia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi, obetu zmierenia a chvály, <br>" +
                            "ktorú slávime na slávnosť <br>" +
                            "Nanebovzatia Bohorodičky, Panny Márie; <font color='#B71C1C'>*</font><br>" +
                            "nech nás táto svätá obeta očistí, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ti ustavične vzdávali vďaky.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, na slávnosť <br>" +
                            "Nanebovzatia Bohorodičky, Panny Márie, <br>" +
                            "zhromaždil si nás pri svojom stole; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, dopraj, <font color='#B71C1C'>—</font><br>" +
                            "aby sme boli oslobodení od všetkého zla.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"15gkm", "Všemohúci a večný Bože, <br>" +
                    "ty si vzal nepoškvrnenú Pannu Máriu, <br>" +
                    "matku svojho Syna, s telom a dušou <br>" +
                    "do nebeskej slávy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <br>" +
                    "aby sme vždy smerovali k nebu <font color='#B71C1C'>—</font><br>" +
                    "a mali s ňou účasť na večnej blaženosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, nech stúpa k tebe <br>" +
                            "naša modlitba a naša obeta <font color='#B71C1C'>*</font><br>" +
                            "a na príhovor preblahoslavenej Panny Márie, <br>" +
                            "ktorú si vzal do neba, <br>" +
                            "zapáľ naše srdcia ohňom lásky, <font color='#B71C1C'>—</font><br>" +
                            "aby sme vždy túžili po tebe.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, s radosťou sme prijali spásonosnú sviatosť; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, udeľ nám milosť, <font color='#B71C1C'>—</font><br>" +
                            "aby sme na orodovanie preblahoslavenej Panny Márie, <br>" +

                            "ktorú si vzal do neba, dosiahli slávne vzkriesenie.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"16", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "dopraj, aby svätý Štefan, <br>" +
                    "ktorý podporoval vzrast tvojej Cirkvi <br>" +
                    "ako pozemský kráľ, <font color='#B71C1C'>—</font><br>" +
                    "bol aj jej mocným nebeským ochrancom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"18", "Milosrdný Bože, <br>" +
                    "svätú Helenu si obdaril <br>" +
                    "mimoriadnou úctou k svätému krížu, <br>" +
                    "ktorý je znamením tvojej bezhraničnej lásky; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme na jej orodovanie <br>" +
                    "stále viac milovali toho, ktorý na ňom zomrel, <font color='#B71C1C'>—</font><br>" +
                    "Ježiša Krista, nášho Pána.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.","",""},
            {"19", "Bože, ty si vyvolil <br>" +
                    "svätého kňaza Jána, aby ohlasoval <br>" +
                    "nevýslovné bohatstvo Kristovho tajomstva; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme podľa jeho príkladu a učenia <br>" +
                    "stále viac poznávali teba <font color='#B71C1C'>—</font><br>" +
                    "a žili verne podľa evanjelia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"20", "Bože, svätému opátovi Bernardovi <br>" +
                    "si dal milosť, aby bol svetlom <br>" +
                    "v tvojej Cirkvi a horel za jej obnovu; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor naplň aj nás duchom horlivosti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme stále žili ako synovia svetla.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, obetujeme ti sviatosť jednoty a pokoja <br>" +
                            "pri oslave svätého opáta Bernarda, <font color='#B71C1C'>*</font><br>" +
                            "ktorý vynikal v slovách i skutkoch <font color='#B71C1C'>—</font><br>" +
                            "a usiloval sa o poriadok a svornosť v tvojej Cirkvi.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech v nás mocne pôsobí sviatostný pokrm, <font color='#B71C1C'>*</font><br>" +
                            "ktorý sme prijali v deň spomienky na svätého Bernarda; <font color='#B71C1C'>—</font><br>" +
                            "daj, prosíme, aby nás jeho príklad a náuka <br>" +
                            "viedli k láske k Ježišovi Kristovi, tvojmu vtelenému Slovu.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"21", "Bože, svätého pápeža Pia <br>" +
                    "si obdaril nebeskou múdrosťou <br>" +
                    "a apoštolskou odvahou, aby chránil <br>" +
                    "vieru Cirkvi a všetko obnovil v Kristovi; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme si z neho vzali príklad, <font color='#B71C1C'>—</font><br>" +
                    "osvojili si jeho zásady, a tak dosiahli večnú odmenu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, láskavo prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby sme povzbudení odkazom <br>" +
                            "svätého pápeža Pia dôstojne <br>" +
                            "slávili sväté tajomstvá <font color='#B71C1C'>—</font><br>" +
                            "a prijímali ich so živou vierou.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, <br>" +
                            "v deň spomienky na svätého <br>" +
                            "pápeža Pia ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby nás účasť <br>" +
                            "na nebeskej hostine upevnila vo viere <font color='#B71C1C'>—</font><br>" +
                            "a zjednotila v láske.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22m", "Bože, Máriu, matku svojho Syna, <br>" +
                    "dal si nám za Matku a Kráľovnú; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na jej orodovanie dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dosiahli v nebeskom kráľovstve <br>" +
                    "plnú slávu tvojich synov a dcér.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi dary, ktoré ti obetujeme <br>" +
                            "pri oslave preblahoslavenej Panny Márie, <font color='#B71C1C'>*</font><br>" +
                            "a dopraj, nech nám stále pomáha tvoj Syn, <br>" +
                            "ktorý sa stal človekom <font color='#B71C1C'>—</font><br>" +
                            "a obetoval sa ti na kríži ako obeta bez poškvrny.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Pane, prijali sme nebeskú sviatosť <br>" +
                            "pri oslave preblahoslavenej Panny Márie; <font color='#B71C1C'>*</font><br>" +
                            "dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme raz mohli mať účasť <br>" +
                            "na večnej nebeskej hostine.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "Bože, svätú Ruženu si zapálil takou veľkou láskou, <br>" +
                    "že sa zriekla sveta a v prísnej kajúcnosti slúžila iba tebe; <font color='#B71C1C'>*</font><br>" +
                    "na jej príhovor nám pomáhaj <br>" +
                    "kráčať cestou čnostného života, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli dôjsť k tebe, <br>" +
                    "prameňu večnej blaženosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"24g", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "posilňuj nás vo viere, ktorou sa <br>" +
                    "svätý apoštol Bartolomej <br>" +
                    "úprimne oddal tvojmu Synovi, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby tvoja Cirkev na jeho orodovanie <br>" +
                    "bola účinnou sviatosťou spásy pre všetky národy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, na sviatok svätého apoštola Bartolomeja <br>" +
                            "prinášame ti na jeho česť obetu chvály <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                            "na jeho príhovor nám udeľ svoju láskavú pomoc.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, na sviatok svätého apoštola Bartolomeja <br>" +
                            "sme prijali záloh večnej spásy; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, nech nám toto prijímanie <br>" +
                            "pomáha v časnom živote <font color='#B71C1C'>—</font><br>" +
                            "a privedie nás do života večného.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"25a", "Bože, ty si priviedol svätého Ľudovíta <br>" +
                    "zo starostí o pozemské kráľovstvo <br>" +
                    "do slávy nebeského kráľovstva; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj <br>" +
                    "svedomite si plniť časné povinnosti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si zaslúžili večné kráľovstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"25b", "Bože, svätého kňaza Jozefa <br>" +
                    "si obdaril takou láskou a trpezlivosťou, <br>" +
                    "že sa neúnavne venoval mládeži <br>" +
                    "a viedol ju k čnostnému životu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj aj nám, <br>" +
                    "ktorí si ho uctievame ako učiteľa múdrosti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ho napodobňovali <br>" +
                    "ako spolupracovníka tvojej pravdy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"27", "Bože, útecha zarmútených, <br>" +
                    "ty si milosrdne vypočul svätú Moniku, <br>" +
                    "keď ťa so slzami v očiach vytrvalo prosila <br>" +
                    "za obrátenie svojho syna Augustína; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme aj my na príhovor obidvoch <br>" +
                    "oplakávali svoje hriechy, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli milosť tvojho odpustenia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"28", "Prosíme ťa, Pane, <br>" +
                    "obnov vo svojej Cirkvi ducha, <br>" +
                    "ktorým si naplnil svätého biskupa Augustína, <font color='#B71C1C'>*</font><br>" +
                    "aby sme aj my túžili po tebe, <br>" +
                    "prameni pravej múdrosti, <font color='#B71C1C'>—</font><br>" +
                    "a neúnavne hľadali teba, pôvodcu večnej lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, nábožne slávime pamiatku našej spásy <font color='#B71C1C'>*</font><br>" +
                            "a pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sa nám táto sviatosť <br>" +
                            "stala znamením jednoty a putom lásky.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech nás posvätí <br>" +
                            "účasť na Kristovej hostine; <font color='#B71C1C'>*</font><br>" +
                            "a keďže patríme do jeho tajomného tela, <font color='#B71C1C'>—</font><br>" +
                            "daj, nech sa čoraz viac premieňame v neho.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"29", "Bože, ty si povolal svätého Jána Krstiteľa, <br>" +
                    "aby svojím narodením a smrťou <br>" +
                    "bol predchodcom tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme neohrozene <br>" +
                    "vyznávali vieru v teba, <font color='#B71C1C'>—</font><br>" +
                    "ako on položil život za pravdu a spravodlivosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, pre tieto dary, <br>" +
                            "ktoré ti predkladáme, daj nám milosť, <br>" +
                            "aby sme bez váhania kráčali priamou cestou, <font color='#B71C1C'>*</font><br>" +
                            "ktorú svätý Ján ukázal prorockým hlasom na púšti <font color='#B71C1C'>—</font><br>" +
                            "a hrdinsky poznačil svojou krvou.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, pri oslave mučeníckej smrti <br>" +
                            "svätého Jána Krstiteľa ťa pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                            "dopraj, aby sme sviatosť <br>" +
                            "spásy, ktorú sme prijali, <br>" +
                            "uctievali s hlbokou vierou <font color='#B71C1C'>—</font><br>" +
                            "a radovali sa z jej pôsobenia v nás.<br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] modlitba9 = {
            {"03", "Bože, ty odpúšťaš svojmu ľudu <br>" +
                    "a s láskou nad ním vládneš; <font color='#B71C1C'>*</font><br>" +
                    "na príhovor svätého pápeža Gregora <br>" +
                    "udeľ ducha múdrosti všetkým, <br>" +
                    "čo majú účasť na vedení tvojho ľudu, <font color='#B71C1C'>—</font><br>" +
                    "aby z čnostného života veriacich <br>" +
                    "mali večnú radosť duchovní pastieri.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "vypočuj našu modlitbu <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby nám bola posilou obeta, <br>" +
                            "ktorú ti prinášame pri oslave svätého Gregora, <font color='#B71C1C'>—</font><br>" +
                            "veď ňou si zmyl hriechy celého sveta.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, tvoj Syn je pre nás chlebom života; <font color='#B71C1C'>*</font><br>" +
                            "daj, nech je aj naším učiteľom, <br>" +
                            "aby sme podľa príkladu svätého Gregora <br>" +
                            "lepšie poznávali tvoju pravdu <font color='#B71C1C'>—</font><br>" +
                            "a dosvedčovali ju bratskou láskou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"07", "Bože, ty si dal svojmu ľudu <br>" +
                    "vo svätých košických mučeníkoch <br>" +
                    "Markovi, Melicharovi a Štefanovi <br>" +
                    "horlivých pastierov a hrdinov pravej viery; <font color='#B71C1C'>*</font><br>" +
                    "na ich príhovor nám daj útechu v súženiach <font color='#B71C1C'>—</font><br>" +
                    "a pomôž nám utvrdzovať sa vo viere.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Dobrotivý Bože, prinášame ti obetné dary <br>" +
                            "pri spomienke na košických mučeníkov; <font color='#B71C1C'>*</font><br>" +
                            "posilňuj i nás vo viere, <font color='#B71C1C'>—</font><br>" +
                            "aby sme vo všetkých protivenstvách <br>" +
                            "neohrozene vyznávali tvoje meno.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, posilnil si nás predrahým <br>" +
                            "Telom a Krvou svojho jednorodeného Syna; <font color='#B71C1C'>*</font><br>" +
                            "obdaruj nás milosťou, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa podľa príkladu košických mučeníkov <br>" +
                            "verne pridŕžali Ježiša Krista a jeho Cirkvi.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"08gm", "Prosíme ťa, Pane, <br>" +
                    "udeľ nám svoju nebeskú milosť, <font color='#B71C1C'>*</font><br>" +
                    "a keďže narodenie Spasiteľa z presvätej Panny <br>" +
                    "bolo počiatkom našej spásy, <font color='#B71C1C'>—</font><br>" +
                    "nech oslava jej narodenia <br>" +
                    "upevní pokoj na celom svete.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, nech nám vždy pomáha <br>" +
                            "tvoj jednorodený Syn, <br>" +
                            "ktorý pri svojom narodení neporušil <br>" +
                            "panenstvo svojej matky, ale ho posvätil; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby posvätil aj nás, <br>" +
                            "aby nás uchránil od hriechov <font color='#B71C1C'>—</font><br>" +
                            "a urobil ti príjemnou túto našu obetu.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.<br>" +
                            "<font color='#B71C1C'>Alebo:</font><br>" +
                            "Pane, prinášame ti obetné dary <br>" +
                            "pri radostnej oslave narodenia <br>" +
                            "preblahoslavenej Panny Márie <font color='#B71C1C'>*</font><br>" +
                            "a pokorne ťa prosíme, <br>" +
                            "nech nám pre svoju ľudskú prirodzenosť <br>" +
                            "pomáha tvoj Syn, <font color='#B71C1C'>—</font><br>" +
                            "ktorý si vzal telo z panenskej Matky.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Pane, tvoja Cirkev, ktorú si nasýtil <br>" +
                            "sviatostným pokrmom, ťa zvelebuje <font color='#B71C1C'>*</font><br>" +
                            "a s radosťou oslavuje narodenie <br>" +
                            "preblahoslavenej Panny Márie, <font color='#B71C1C'>—</font><br>" +
                            "lebo v nej svitla celému svetu <br>" +
                            "nádej na spásu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"09", "Bože, ty si urobil svätého Petra <br>" +
                    "sluhom otrokov a obdaril si ho <br>" +
                    "obdivuhodnou láskou a trpezlivosťou <br>" +
                    "v jeho úsilí pomôcť im; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie daj, <br>" +
                    "aby sme hľadali záujmy Ježiša Krista <font color='#B71C1C'>—</font><br>" +
                    "a blížnych milovali skutkom a pravdou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"12m", "Všemohúci Bože, prosíme ťa, dopraj, <font color='#B71C1C'>*</font><br>" +
                    "aby preblahoslavená Panna Mária sprostredkovala <br>" +
                    "dobrodenia tvojho milosrdenstva všetkým, <font color='#B71C1C'>—</font><br>" +
                    "čo oslavujú jej slávne meno. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech príhovor preblahoslavenej Márie, <br>" +
                            "vždy Panny, sprevádza naše dary <font color='#B71C1C'>*</font><br>" +
                            "a nás, čo uctievame jej meno, <font color='#B71C1C'>—</font><br>" +
                            "nech urobí milými tvojej velebnosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, daj, aby sme <br>" +
                            "na orodovanie Bohorodičky Márie <br>" +
                            "dosiahli milosť tvojho požehnania <font color='#B71C1C'>*</font><br>" +
                            "a aby sme vo všetkých potrebách <br>" +
                            "získali pomoc tej, <font color='#B71C1C'>—</font><br>" +
                            "ktorej sväté meno oslavujeme.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"13", "Bože, sila dúfajúcich v teba, <br>" +
                    "ty si dal svätému Jánovi Zlatoústemu <br>" +
                    "obdivuhodnú výrečnosť a hrdinskú <br>" +
                    "odvahu v prenasledovaniach; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, osvieť našu myseľ jeho slovom <font color='#B71C1C'>—</font><br>" +
                    "a našu vôľu povzbuď jeho nezdolnou trpezlivosťou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, zhliadni na obetné dary, <br>" +
                            "ktoré ti s radosťou prinášame <br>" +
                            "v deň spomienky na svätého Jána Zlatoústeho, <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby sme sa podľa jeho poučenia <br>" +
                            "stali obetným darom pre teba <font color='#B71C1C'>—</font><br>" +
                            "a celým svojím životom ťa oslavovali.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Milosrdný Bože, <br>" +
                            "v deň spomienky na svätého <br>" +
                            "Jána Zlatoústeho sme prijali nebeskú sviatosť; <font color='#B71C1C'>*</font><br>" +
                            "nech nás jej prijatie posilní v láske k tebe <font color='#B71C1C'>—</font><br>" +
                            "a pretvorí na verných vyznávačov tvojej pravdy.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14gn", "Bože, ty si poslal na svet <br>" +
                    "svojho jednorodeného Syna, <br>" +
                    "aby smrťou na kríži spasil všetkých ľudí; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme na zemi stále lepšie <br>" +
                    "poznávali tajomstvo jeho vykupiteľskej smrti <font color='#B71C1C'>—</font><br>" +
                    "a dosiahli účasť na jeho sláve v nebi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nás očistí od každej viny táto obeta, <font color='#B71C1C'>—</font><br>" +
                            "ktorou sa na oltári kríža <br>" +
                            "sňali hriechy celého sveta.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane Ježišu Kriste, <br>" +
                            "nasýtil si nás sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "a keďže si nás vykúpil na životodarnom dreve kríža, <font color='#B71C1C'>—</font><br>" +
                            "prosíme ťa, priveď nás k sláve vzkriesenia.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"15gkm", "Všemohúci Bože, ty si dal <br>" +
                    "prebolestnej Matke Márii silu, <br>" +
                    "aby stála pri tvojom ukrižovanom Synovi <br>" +
                    "a spolu s ním trpela; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme aj my ochotne niesli <br>" +
                    "svoj každodenný kríž v spojení s Kristom, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli účasť na jeho zmŕtvychvstaní.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov. ",
                    "Milosrdný Bože, <br>" +
                            "prijmi na svoju chválu naše modlitby a dary, <font color='#B71C1C'>*</font><br>" +
                            "ktoré ti obetujeme na slávnosť <br>" +
                            "Sedembolestnej Panny Márie, <font color='#B71C1C'>—</font><br>" +
                            "ktorú si nám dal za Matku, <br>" +
                            "keď stála pri Ježišovom kríži.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, s oddanou vierou <br>" +
                            "sme prijali sviatosť večnej spásy <br>" +
                            "a s úctou si pripomíname účasť <br>" +
                            "preblahoslavenej Panny Márie <br>" +
                            "na Kristovom vykupiteľskom utrpení; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pomôž nám vytrvalo <br>" +
                            "znášať ťažkosti každodenného života, <font color='#B71C1C'>—</font><br>" +
                            "a tak dopĺňať, čo chýba Kristovmu utrpeniu <br>" +
                            "v prospech Cirkvi, jeho tajomného tela.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"16", "Bože, vo svätom pápežovi Kornelovi <br>" +
                    "a vo svätom biskupovi Cypriánovi <br>" +
                    "dal si svojej Cirkvi horlivých <br>" +
                    "duchovných pastierov a neohrozených mučeníkov; <font color='#B71C1C'>*</font><br>" +
                    "na ich orodovanie upevni našu vieru <font color='#B71C1C'>—</font><br>" +
                    "a povzbuď nás k modlitbe a práci za jednotu Cirkvi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi obetné dary, <br>" +
                            "ktoré ti prinášame pri oslave <br>" +
                            "mučeníckej smrti svätých Kornela a Cypriána; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby nám eucharistická obeta <br>" +
                            "dala silu prekonávať životné ťažkosti, <font color='#B71C1C'>—</font><br>" +
                            "ako týmto mučeníkom dala vytrvalosť v protivenstvách.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "týmto svätým prijímaním <br>" +
                            "upevni v nás ducha odvahy a sily, <font color='#B71C1C'>*</font><br>" +
                            "aby sme podľa príkladu <br>" +
                            "svätých mučeníkov Kornela a Cypriána <font color='#B71C1C'>—</font><br>" +
                            "odhodlane vydávali svedectvo <br>" +
                            "o pravde evanjelia.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"17a", "Bože, svätého biskupa Róberta <br>" +
                    "si obdaril vynikajúcou učenosťou <br>" +
                    "a nezlomnou odvahou, <br>" +
                    "aby bránil vieru tvojej Cirkvi; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie pomáhaj svojmu ľudu <br>" +
                    "zachovať si neporušenú vieru <font color='#B71C1C'>—</font><br>" +
                    "a dosvedčovať ju v každodennom živote.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"17b","Bože, prameň života, <br>" +
                    "ty si svätú pannu Hildegardu <br>" +
                    "naplnil prorockým duchom; <font color='#B71C1C'>*</font><br>" +
                    "daj prosíme, aby sme podľa jej príkladu <br>" +
                    "a na jej príhovor poznali tvoje cesty <font color='#B71C1C'>—</font><br>" +
                    "a v temnote tohto veku spoznali svetlo tvojej slávy. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"19", "Bože, v dnešný deň <br>" +
                    "nám dovoľuješ osláviť <br>" +
                    "mučeníctvo svätého biskupa Januára; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa tešili <br>" +
                    "z jeho spoločenstva vo večnej blaženosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"20", "Bože, ty rozmnožuješ počet <br>" +
                    "svojich adoptívnych synov a dcér vo svete <br>" +
                    "a z krvi svätých mučeníkov Andreja <br>" +
                    "a jeho spoločníkov si urobil <br>" +
                    "semeno nových kresťanov; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nám pomáhal ich príhovor <font color='#B71C1C'>—</font><br>" +
                    "a posilňoval nás ich príklad.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                            "láskavo zhliadni na obetné dary svojho ľudu <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme sa na príhovor svätých mučeníkov <br>" +
                            "stali aj my tebe milou obetou na spásu celého sveta.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, pri oslave svätých mučeníkov <br>" +
                            "nasýtil si nás pokrmom silných; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <br>" +
                            "daj, aby sme zostali pevne spojení s Kristom <font color='#B71C1C'>—</font><br>" +
                            "a v Cirkvi pracovali na spáse všetkých ľudí.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21g", "Bože, vo svojom nesmiernom milosrdenstve <br>" +
                    "si mýtnika Matúša vyvolil za apoštola; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme podľa jeho príkladu <br>" +
                    "a na jeho príhovor verne kráčali za tebou <font color='#B71C1C'>—</font><br>" +
                    "a pevne sa ťa pridŕžali.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, na sviatok svätého Matúša <br>" +
                            "prinášame ti obetné dary a pokorne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "milostivo zhliadni na svoju Cirkev, <font color='#B71C1C'>—</font><br>" +
                            "ktorej vieru apoštoli živili hlásaním evanjelia.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prežívame radosť zo spásy, <br>" +
                            "ktorú cítil svätý Matúš, keď vo svojom dome <br>" +
                            "prijal Spasiteľa ako hosťa; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme vždy prijímali pokrm tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "ktorý neprišiel volať a spasiť <br>" +
                            "spravodlivých, ale hriešnikov.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"22+", "Všemohúci a večný Bože, <br>" +
                    "ty si dal svätému biskupovi Emerámovi<br>" +
                    "silu trpezlivo znášať nespravodlivé obvinenie<br>" +
                    "a umrieť mučeníckou smrťou; <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám, aby sme z lásky k tebe<br>" +
                    "prekonávali všetky protivenstvá <font color='#B71C1C'>—</font><br>" +
                    "a čistým životom sa uberali k tebe. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého<br>" +
                    "po všetky veky vekov. ",
                    "Dobrotivý Bože, v deň spomienky<br>" +
                            "na svätého mučeníka Emeráma<br>" +
                            "prijmi naše obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "ako si prijal jeho neúnavnú prácu za spásu duší <font color='#B71C1C'>—</font><br>" +
                            "a jeho mučenícke svedectvo. <br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Milosrdný Otče, <br>" +
                            "prijali sme Telo a Krv tvojho Syna <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, obdaruj nás takou duševnou silou, <font color='#B71C1C'>—</font><br>" +
                            "akú prejavoval svätý Emerám v tvojej službe<br>" +
                            "i pri svojom umučení. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "Všemohúci a večný Bože, <br>" +
                    "ty si dal svätému kňazovi Piovi <br>" +
                    "osobitnou milosťou účasť na kríži tvojho Syna <br>" +
                    "a prostredníctvom jeho služby si obnovil <br>" +
                    "obdivuhodné prejavy tvojho milosrdenstva; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie nám dopraj, <br>" +
                    "aby sme boli neustále spojení s utrpením Krista <font color='#B71C1C'>—</font><br>" +
                    "a šťastlivo dosiahli slávu vzkriesenia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"26", "Pane, oslavujeme ťa spomienkou <br>" +
                    "na svätých mučeníkov Kozmu a Damiána, <br>" +
                    "ktorých si voviedol do večnej slávy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "sprevádzaj aj nás svojou prozreteľnosťou <br>" +
                    "na ceste k tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, v deň víťaznej smrti <br>" +
                            "tvojich svätých mučeníkov <font color='#B71C1C'>*</font><br>" +
                            "prinášame ti obetu, <font color='#B71C1C'>—</font><br>" +
                            "v ktorej má pôvod a silu každé mučeníctvo.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, zachovaj v nás svoje dary, <font color='#B71C1C'>*</font><br>" +
                            "a čo sme v deň spomienky <br>" +
                            "na svätých mučeníkov Kozmu a Damiána <br>" +
                            "prijali z tvojej štedrosti, <font color='#B71C1C'>—</font><br>" +
                            "nech nám prinesie pokoj a spásu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"27", "Bože, svätého Vincenta <br>" +
                    "si obdaril apoštolskými čnosťami, <br>" +
                    "aby sa staral o chudobných <br>" +
                    "a o výchovu dobrých kňazov; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, naplň aj nás apoštolskou horlivosťou, <br>" +
                    "aby sme sa riadili jeho náukou <font color='#B71C1C'>—</font><br>" +
                    "a nasledovali ho v láske k tebe a k blížnym.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, svätému Vincentovi <br>" +
                            "si dal milosť životom uskutočňovať, <br>" +
                            "čo slávil v týchto svätých tajomstvách; <font color='#B71C1C'>*</font><br>" +
                            "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "mocou tejto obety premeň aj nás <br>" +
                            "na príjemný dar pre teba.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás nebeskou sviatosťou; <font color='#B71C1C'>*</font><br>" +
                            "vrúcne ťa prosíme, <br>" +
                            "daj, aby sme podľa príkladu svätého Vincenta <br>" +
                            "a na jeho príhovor nasledovali tvojho Syna <font color='#B71C1C'>—</font><br>" +
                            "a ohlasovali blahozvesť chudobným.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"28a", "Bože, ty si svätého mučeníka Václava <br>" +
                    "naučil ceniť si nebeské kráľovstvo <br>" +
                    "viac ako pozemské vladárstvo; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám daj silu, <br>" +
                    "aby sme premáhali seba samých <font color='#B71C1C'>—</font><br>" +
                    "a celým srdcom sa vinuli k tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"28b", "Pane a Bože náš, <br>" +
                    "prosíme ťa, udeľ nám takú vytrvalosť <br>" +
                    "v službe tebe a blížnemu, <br>" +
                    "akú mali tvoji svätí mučeníci <br>" +
                    "Vavrinec a jeho spoločníci, <font color='#B71C1C'>*</font><br>" +
                    "lebo v tvojom kráľovstve sú blahoslavení tí, <font color='#B71C1C'>—</font><br>" +
                    "ktorých prenasledujú pre spravodlivosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"29g", "Bože, ty obdivuhodne <br>" +
                    "určuješ úlohy anjelom i ľuďom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pošli svojich anjelov, <br>" +
                    "ktorí ti ustavične slúžia v nebi, <font color='#B71C1C'>—</font><br>" +
                    "aby nás ochraňovali v pozemskom živote.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prinášame ti obetu chvály a prosíme, <br>" +
                            "nech ju anjeli prenesú pred tvoju tvár; <font color='#B71C1C'>*</font><br>" +
                            "milostivo ju prijmi <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby nám bola na spásu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, posilnil si nás nebeským chlebom; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <br>" +
                            "aby nám tento sviatostný pokrm <br>" +
                            "pomáhal odhodlane napredovať na ceste spásy <font color='#B71C1C'>—</font><br>" +
                            "pod mocnou ochranou tvojich anjelov.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "Bože, svätého kňaza Hieronyma <br>" +
                    "si obdaril láskou a živým <br>" +
                    "záujmom o Sväté písmo; <font color='#B71C1C'>*</font><br>" +
                    "otvor aj naše srdce pre tvoje slovo, <br>" +
                    "aby sme sa ním živili <font color='#B71C1C'>—</font><br>" +
                    "a v ňom našli prameň života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "daj, aby sme aj my podľa príkladu <br>" +
                            "svätého Hieronyma rozjímali o tvojom slove, <font color='#B71C1C'>*</font><br>" +
                            "a tak ochotnejšie pristupovali k tvojmu oltáru <font color='#B71C1C'>—</font><br>" +
                            "nábožne sláviť obetu spásy.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "sviatosť, ktorú sme prijali <br>" +
                            "pri radostnej oslave svätého Hieronyma, <br>" +
                            "nech vzbudí v našich srdciach <br>" +
                            "väčšiu lásku k tvojmu slovu, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ho čoraz lepšie chápali, <br>" +
                            "podľa neho žili, <br>" +
                            "a tak dosiahli večný život.<br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] modlitba10 = {
            {"01", "Bože, svoje kráľovstvo <br>" +
                    "otváraš pokorným a maličkým; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme s dôverou kráčali <br>" +
                    "po stopách svätej Terézie <font color='#B71C1C'>—</font><br>" +
                    "a na jej príhovor sa dostali do večnej slávy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, velebíme teba, keď slávime pamiatku <br>" +
                            "svätej panny Terézie, a pokorne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby ti naša obeta bola taká milá, <font color='#B71C1C'>—</font><br>" +
                            "ako ti bol milý jej obetavý život.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech prijatá sviatosť <br>" +
                            "zapáli v nás oheň lásky, <font color='#B71C1C'>*</font><br>" +
                            "aby sme sa ti úplne oddali ako svätá Terézia <font color='#B71C1C'>—</font><br>" +
                            "a podľa jej príkladu vyprosovali <br>" +
                            "všetkým ľuďom tvoje zľutovanie.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"02", "Bože, vo svojej prozreteľnosti <br>" +
                    "posielaš nám svätých anjelov za strážcov; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <br>" +
                    "daj, aby sme vždy cítili ich mocnú ochranu <font color='#B71C1C'>—</font><br>" +
                    "a raz v ich spoločenstve prežívali večnú radosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi obetné dary, ktoré ti <br>" +
                            "prinášame na počesť tvojich svätých anjelov, <font color='#B71C1C'>*</font><br>" +
                            "a dopraj, aby nás neustále chránili <br>" +
                            "pred nebezpečenstvami tohto sveta <font color='#B71C1C'>—</font><br>" +
                            "a priviedli do večného života.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, v tejto vznešenej sviatosti <br>" +
                            "nám dávaš pokrm pre večný život; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pošli svojich anjelov, <font color='#B71C1C'>—</font><br>" +
                            "aby nás sprevádzali na ceste spásy a pokoja.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"04", "Bože, svätému Františkovi si dal milosť, <br>" +
                    "že sa chudobou a pokorou <br>" +
                    "stal podobným Kristovi; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme aj my podľa jeho príkladu <br>" +
                    "nasledovali tvojho Syna <font color='#B71C1C'>—</font><br>" +
                    "a v láske a radosti sa zjednocovali s tebou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prinášame ti obetné dary <br>" +
                            "a pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby sme tajomstvo kríža slávili <br>" +
                            "na tvojom oltári s takou láskou, <font color='#B71C1C'>—</font><br>" +
                            "s akou sa k Ukrižovanému <br>" +
                            "vinul svätý František.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech nás prijatá sviatosť <br>" +
                            "upevní v láske k tebe <font color='#B71C1C'>*</font><br>" +
                            "a nech v nás vzbudí horlivosť za spásu ľudí, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa ako svätý František <br>" +
                            "stali šíriteľmi kresťanskej radosti vo svete.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"05", "Všemohúci a večný Bože, <br>" +
                    "ty si vybral svätú Faustínu, <br>" +
                    "aby hlásala nesmierne bohatstvá <br>" +
                    "tvojho milosrdenstva; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme na jej príhovor a podľa jej príkladu <br>" +
                    "úplne dôverovali tvojmu milosrdenstvu <font color='#B71C1C'>—</font><br>" +
                    "a vytrvalo konali diela kresťanskej lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"06", "Bože, svätého Bruna si povolal, <br>" +
                    "aby ti slúžil v samote; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si v zhone tohto života <br>" +
                    "vždy našli čas pre teba.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"07m", "Pane, z anjelovho zvestovania vieme, <br>" +
                    "že tvoj Syn Ježiš Kristus sa stal človekom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na orodovanie <br>" +
                    "preblahoslavenej Panny Márie <br>" +
                    "vlej nám do duše svoju milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby nás jeho umučenie a kríž <br>" +
                    "priviedli k slávnemu vzkrieseniu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, pomôž nám <br>" +
                            "pripodobniť sa darom, ktoré prinášame, <font color='#B71C1C'>*</font><br>" +
                            "a daj, nech tak prežívame <br>" +
                            "tajomstvá tvojho jednorodeného Syna, <font color='#B71C1C'>—</font><br>" +
                            "aby sme boli hodní jeho prisľúbení.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Pane a Bože náš, v tejto sviatosti zvestujeme <br>" +
                            "smrť a zmŕtvychvstanie tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pomôž nám <br>" +
                            "znášať utrpenia v spojení s Kristom, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mali účasť aj na jeho večnej sláve.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"09a", "Bože, svätého Dionýza a jeho spoločníkov <br>" +
                    "si poslal ohlasovať evanjelium pohanom <br>" +
                    "a dal si im silu podstúpiť mučeníctvo; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, na ich príhovor nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa nedali zvábiť klamnými dobrami <br>" +
                    "tohto sveta a nebáli sa jeho protivenstiev.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"09b", "Bože, darca všetkého dobra, <br>" +
                    "ty si poslal svätého kňaza Jána <br>" +
                    "ohlasovať evanjelium národom; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby vždy a všade prekvitala pravá viera.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"11", "Všemohúci a večný Bože, <br>" +
                    "ty si vo svätom pápežovi Jánovi <br>" +
                    "dal svetu živý obraz Krista, dobrého pastiera; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s radosťou šírili plnosť kresťanskej lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"14", "Bože, ty si povolal svätého pápeža Kalixta <br>" +
                    "slúžiť Cirkvi a prehlbovať úctu <br>" +
                    "k zosnulým veriacim; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, nech nás posilňuje príklad jeho viery, <br>" +
                    "aby sme sa vymanili z otroctva hriechu <font color='#B71C1C'>—</font><br>" +
                    "a získali neporušené dedičstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"15", "Bože, svätú Teréziu si osvietil <br>" +
                    "Duchom Svätým, aby bola v Cirkvi <br>" +
                    "učiteľkou kresťanskej dokonalosti; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, daj nám <br>" +
                    "neprestajne čerpať z jej duchovnej náuky <font color='#B71C1C'>—</font><br>" +
                    "a túžiť po pravej svätosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech sú ti príjemné naše obetné dary, <font color='#B71C1C'>—</font><br>" +
                            "ako ti bol milý obetavý <br>" +
                            "a oddaný život svätej Terézie.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, rodinu svojich <br>" +
                            "veriacich si nasýtil nebeským chlebom; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme nasledovali <br>" +
                            "príklad svätej Terézie <font color='#B71C1C'>—</font><br>" +
                            "a raz mohli naveky <br>" +
                            "ospevovať tvoje milosrdenstvo.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"16a", "Všemohúci Bože, <br>" +
                    "vo svätej Hedvige si nám dal <br>" +
                    "žiarivý vzor evanjeliovej pokory; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám jej mocný <br>" +
                    "príhovor zaistil tvoju pomoc.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"16b", "Prosíme ťa, Pane, zošli na nás ducha, <br>" +
                    "ktorým si osobitne naplnil svätú Margitu Máriu, <font color='#B71C1C'>*</font><br>" +
                    "aby sme mohli poznať Kristovu lásku, <br>" +
                    "ktorá prevyšuje všetko poznanie, <font color='#B71C1C'>—</font><br>" +
                    "a mali účasť na bohatstve tvojho božského života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"16c", "Všemohúci Bože, ty si povolal svätého Gála, <br>" +
                    "aby horlivo ohlasoval pravdy evanjelia; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, zachovaj nám pravú radosť, <br>" +
                    "ktorá pramení z viery, <font color='#B71C1C'>—</font><br>" +
                    "a posilni našu vernosť <br>" +
                    "tvojmu Synovi, Ježišovi Kristovi.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.","",""},
            {"17", "Všemohúci a večný Bože, <br>" +
                    "svedectvom svätých mučeníkov <br>" +
                    "ozdobuješ svoju Cirkev, Kristovo tajomné telo; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby mučenícka smrť svätého Ignáca, <br>" +
                    "ktorá ho priviedla do večnej slávy, <font color='#B71C1C'>—</font><br>" +
                    "bola pre nás ustavičným zdrojom posily.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, láskavo prijmi obetu našej oddanosti, <font color='#B71C1C'>*</font><br>" +
                            "ako si prijal svätého Ignáca, <br>" +
                            "keď sa ti obetoval ako Kristova pšenica, <font color='#B71C1C'>—</font><br>" +
                            "mučeníctvom pretvorená na čistý chlieb.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech nás občerství nebeský chlieb, <br>" +
                            "ktorý sme prijali v deň <br>" +
                            "víťaznej smrti svätého Ignáca, <font color='#B71C1C'>*</font><br>" +
                            "aby sme boli kresťanmi nielen podľa mena, <font color='#B71C1C'>—</font><br>" +
                            "ale aj svojím životom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"18g", "Pane a Bože náš, ty si poslal <br>" +
                    "svätého Lukáša ohlasovať slovom i písmom <br>" +
                    "tajomstvo tvojej lásky k chudobným; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby všetci kresťania boli <br>" +
                    "jedno srdce a jedna duša <font color='#B71C1C'>—</font><br>" +
                    "a aby všetky národy uzreli tvoju spásu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, obdaruj nás <br>" +
                            "milosťou ochotne ti slúžiť, <font color='#B71C1C'>*</font><br>" +
                            "aby dary, ktoré ti prinášame <br>" +
                            "na sviatok svätého Lukáša, <br>" +
                            "stali sa pre nás duchovným liekom <font color='#B71C1C'>—</font><br>" +
                            "a pomáhali nám k večnej sláve.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "nech nás posvätí sviatosť, <br>" +
                            "ktorú sme prijali z tvojho svätého oltára, <font color='#B71C1C'>*</font><br>" +
                            "a nech nás upevní vo vernosti k evanjeliu, <font color='#B71C1C'>—</font><br>" +
                            "ktoré ohlasoval svätý Lukáš.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"19a", "Bože, ty si chcel námahou a vyliatím krvi <br>" +
                    "svätých Jána a Izáka a ich spoločníkov <br>" +
                    "poukázať na blaženú nádej večného kráľovstva; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sa na ich príhovor <br>" +
                    "stále upevňovala kresťanská viera.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"19b", "Pane, nech nám svätý kňaz Pavol, <br>" +
                    "ktorého jedinou láskou bol kríž, <br>" +
                    "vyprosí tvoju milosť, <font color='#B71C1C'>*</font><br>" +
                    "aby sme nasledovali jeho príklad <font color='#B71C1C'>—</font><br>" +
                    "a s odvahou vzali na seba každodenný kríž.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Všemohúci Bože, <br>" +
                            "v deň spomienky na svätého Pavla <br>" +
                            "prinášame ti obetné dary; <font color='#B71C1C'>*</font><br>" +
                            "láskavo na ne zhliadni a daj, <br>" +
                            "aby sme svojím životom napodobňovali <br>" +
                            "obetu tvojho Syna na kríži, <font color='#B71C1C'>—</font><br>" +
                            "ktorú slávime v tomto tajomstve.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, v živote svätého kňaza Pavla <br>" +
                            "si nám obdivuhodne priblížil tajomstvo kríža; <font color='#B71C1C'>*</font><br>" +
                            "láskavo dopraj, aby sme sa posilnení <br>" +
                            "touto obetou verne pridŕžali Krista <font color='#B71C1C'>—</font><br>" +
                            "a v Cirkvi pracovali na spáse všetkých ľudí.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "Bože, bohatý na milosrdenstvo, <br>" +
                    "ty si povolal svätého pápeža <br>" +
                    "Jána Pavla viesť tvoju Cirkev; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme posilnení jeho náukou <br>" +
                    "s dôverou otvorili svoje srdcia <br>" +
                    "spásnej milosti Krista, <font color='#B71C1C'>—</font><br>" +
                    "jediného Vykupiteľa človeka. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.","",""},
            {"23", "Bože, ty si povolal svätého Jána, <br>" +
                    "aby v krušných časoch posmeľoval kresťanský ľud; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, aj nám poskytuj bezpečnú ochranu <font color='#B71C1C'>—</font><br>" +
                    "a svoju Cirkev zachovaj v trvalom pokoji.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"24", "Bože, ty si obdaril <br>" +
                    "svätého biskupa Antona Máriu <br>" +
                    "veľkou láskou a trpezlivosťou <br>" +
                    "pri hlásaní evanjelia národom; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor dopraj, <br>" +
                    "aby sme aj my hľadali Božie kráľovstvo <font color='#B71C1C'>—</font><br>" +
                    "a horlivo privádzali svojich blížnych ku Kristovi.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.","",""},
            {"25", "Dobrotivý Bože, svätý Maurus <br>" +
                    "sa s tebou spájal v tichu <br>" +
                    "a bol príkladom ustavičnej <br>" +
                    "modlitby, pokory a čistoty; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám <br>" +
                    "zjednotiť sa s tebou na tvoju chválu <font color='#B71C1C'>—</font><br>" +
                    "a na našu spásu i spásu celého sveta.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"28g", "Bože, prostredníctvom svätých apoštolov <br>" +
                    "priviedol si nás k poznaniu svojho mena; <font color='#B71C1C'>*</font><br>" +
                    "láskavo dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby na príhovor svätých Šimona a Júdu <br>" +
                    "Cirkev stále vzrastala v počte veriacich.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, pripomíname si nekonečnú slávu <br>" +
                            "svätých apoštolov Šimona a Júdu <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, prijmi naše dary a modlitby, <font color='#B71C1C'>—</font><br>" +
                            "aby sme dôstojne slávili sväté tajomstvá.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme sviatostný pokrm <br>" +
                            "a v Duchu Svätom ťa pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                            "nech nás obeta, ktorú sme slávili <br>" +
                            "na počesť utrpenia apoštolov Šimona a Júdu, <font color='#B71C1C'>—</font><br>" +
                            "upevní v láske k tebe.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31gk", "Všemohúci a večný Bože, <br>" +
                    "doprial si nám radosť, že dnešným sviatkom <br>" +
                    "môžeme osláviť zásluhy všetkých tvojich svätých; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "na príhovor toľkých orodovníkov <br>" +
                    "zahrň nás svojou milosrdnou láskou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, nech sú ti milé obetné dary <br>" +
                            "na počesť všetkých svätých, <br>" +
                            "ktorí už dosiahli nehynúcu blaženosť v nebi; <font color='#B71C1C'>*</font><br>" +
                            "dopraj, aby sme pocítili, <font color='#B71C1C'>—</font><br>" +
                            "že nám účinne pomáhajú na ceste spásy.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Bože, dnešným sviatkom všetkých svätých <br>" +
                            "oslavujeme teba, prameň všetkej svätosti; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pomáhaj nám, <br>" +
                            "aby sme ťa nadovšetko milovali, <font color='#B71C1C'>—</font><br>" +
                            "a tak mohli prejsť od sviatostného stola pútnikov <br>" +
                            "k nebeskej hostine v spoločenstve tvojich svätých. <br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] modlitba11 = {
            {"01gk", "Všemohúci a večný Bože, <br>" +
                    "doprial si nám radosť, že dnešným sviatkom <br>" +
                    "môžeme osláviť zásluhy všetkých tvojich svätých; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "na príhovor toľkých orodovníkov <br>" +
                    "zahrň nás svojou milosrdnou láskou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, nech sú ti milé obetné dary <br>" +
                            "na počesť všetkých svätých, <br>" +
                            "ktorí už dosiahli nehynúcu blaženosť v nebi; <font color='#B71C1C'>*</font><br>" +
                            "dopraj, aby sme pocítili, <font color='#B71C1C'>—</font><br>" +
                            "že nám účinne pomáhajú na ceste spásy.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Bože, dnešným sviatkom všetkých svätých <br>" +
                            "oslavujeme teba, prameň všetkej svätosti; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pomáhaj nám, <br>" +
                            "aby sme ťa nadovšetko milovali, <font color='#B71C1C'>—</font><br>" +
                            "a tak mohli prejsť od sviatostného stola pútnikov <br>" +
                            "k nebeskej hostine v spoločenstve tvojich svätých. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"02an", "Prosíme ťa, Pane, <br>" +
                    "vypočuj naše prosby a oživuj našu vieru <br>" +
                    "v tvojho Syna, ktorý vstal z mŕtvych, <font color='#B71C1C'>*</font><br>" +
                    "aby v nás rástla nádej, <font color='#B71C1C'>—</font><br>" +
                    "že aj našich zosnulých <br>" +
                    "vzkriesiš k večnému životu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,..",
                    "Pane, láskavo zhliadni na naše obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a všetkých svojich zosnulých služobníkov <br>" +
                            "prijmi do slávy svojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "s ktorým aj nás spája táto sviatosť lásky.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "prijmi do vlasti svetla a pokoja <br>" +
                            "všetkých svojich zosnulých služobníkov, <font color='#B71C1C'>—</font><br>" +
                            "za ktorých sme slávili túto veľkonočnú sviatosť.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"02bn", "Bože, svetlo veriacich a život spravodlivých, <br>" +
                    "tvoj Syn nás vykúpil <br>" +
                    "svojou smrťou a zmŕtvychvstaním; <font color='#B71C1C'>*</font><br>" +
                    "zmiluj sa nad svojimi zosnulými služobníkmi, <br>" +
                    "ktorí verili vo vzkriesenie z mŕtvych, <font color='#B71C1C'>—</font><br>" +
                    "a odmeň ich večnou blaženosťou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov. ",
                    "Všemohúci a milosrdný Bože, <br>" +
                            "prosíme ťa za tvojich zosnulých služobníkov, <br>" +
                            "ktorých si obmyl vodou krstu; <font color='#B71C1C'>*</font><br>" +
                            "v tejto obete zotri ich viny Kristovou krvou <font color='#B71C1C'>—</font><br>" +
                            "a dokonale ich očisti svojou milosrdnou láskou.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme sviatosť <br>" +
                            "tvojho jednorodeného Syna, <br>" +
                            "ktorý za nás zomrel na kríži <br>" +
                            "a slávne vstal z mŕtvych; <font color='#B71C1C'>*</font><br>" +
                            "týmto tajomstvom nášho vykúpenia <br>" +
                            "očisti svojich zosnulých služobníkov, <font color='#B71C1C'>—</font><br>" +
                            "aby sa radovali z daru budúceho vzkriesenia.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"02cn", "Bože, ty si povýšil do nebeskej slávy <br>" +
                    "svojho jednorodeného Syna, víťaza nad smrťou; <font color='#B71C1C'>*</font><br>" +
                    "daj svojim zosnulým služobníkom <br>" +
                    "účasť na Kristovom víťazstve nad smrťou, <font color='#B71C1C'>—</font><br>" +
                    "aby mohli večne hľadieť na teba, <br>" +
                    "svojho Stvoriteľa a Záchrancu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi tieto obetné dary <br>" +
                            "za všetkých svojich služobníkov, <br>" +
                            "čo zosnuli v Kristovi, <font color='#B71C1C'>*</font><br>" +
                            "a pre túto vznešenú obetu <br>" +
                            "vysloboď ich z moci smrti <font color='#B71C1C'>—</font><br>" +
                            "a voveď do večného života.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, mocou sviatosti, ktorú sme prijali, <br>" +
                            "zahrň svojich zosnulých služobníkov <br>" +
                            "svojím milosrdenstvom; <font color='#B71C1C'>*</font><br>" +
                            "a keďže si ich už obdaril krstnou milosťou, <font color='#B71C1C'>—</font><br>" +
                            "daruj im plnosť večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"03", "Bože, svätého Martina si priviedol <br>" +
                    "po ceste pokory do nebeskej slávy; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme nasledovali jeho žiarivý príklad, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli s ním účasť na nebeskej radosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"04", "Prosíme ťa, Pane, <br>" +
                    "zachovaj vo svojom ľude ducha, <br>" +
                    "ktorým si naplnil svätého biskupa Karola, <font color='#B71C1C'>*</font><br>" +
                    "aby sa tvoja Cirkev stále obnovovala, <br>" +
                    "stávala sa čoraz podobnejšou Kristovi, <font color='#B71C1C'>—</font><br>" +
                    "a tak sprítomňovala svetu tvár tvojho Syna.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "zhliadni na obetné dary, <br>" +
                            "ktoré ti kladieme na oltár <br>" +
                            "v deň spomienky na svätého Karola, <br>" +
                            "bedlivého pastiera, ktorý vynikal v čnostiach, <font color='#B71C1C'>—</font><br>" +
                            "a mocou tejto obety pomôž aj nám <br>" +
                            "prinášať ovocie pravého kresťanského života.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, nech nám sviatosť, <br>" +
                            "ktorú sme prijali, dá silu ducha, <font color='#B71C1C'>*</font><br>" +
                            "ktorá svätého Karola <br>" +
                            "urobila verným v kňazskej službe <font color='#B71C1C'>—</font><br>" +
                            "a neúnavným v láske k blížnym.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"05", "Dobrotivý Bože, <br>" +
                    "ty si svätého Imricha v kvete mladosti<br>" +
                    "prijal do spoločenstva svojich svätých; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor nám pomôž, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si uprostred pokušení tohto sveta<br>" +
                    "zachovali čistotu srdca. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého<br>" +
                    "po všetky veky vekov. ","",""},
            {"09g", "Bože, zo živých a vybraných kameňov <br>" +
                    "si pripravuješ svoj večný príbytok; <font color='#B71C1C'>*</font><br>" +
                    "rozmnož vo svojej Cirkvi <br>" +
                    "ducha milosti, ktorého si jej poslal, <font color='#B71C1C'>—</font><br>" +
                    "aby sa vzrastom tvojho veriaceho ľudu <br>" +
                    "budoval nebeský Jeruzalem.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, ty Cirkev nazývaš svojou nevestou; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby ľud slúžiaci <br>" +
                    "tvojmu menu tebe sa klaňal, <br>" +
                    "teba miloval a nasledoval <font color='#B71C1C'>—</font><br>" +
                    "a pod tvojím vedením <br>" +
                    "dosiahol prisľúbenú nebeskú blaženosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi naše obetné dary a dopraj, <font color='#B71C1C'>*</font><br>" +
                            "aby sme v tvojom svätom chráme<br>" +
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
            {"10", "Bože, svojej Cirkvi si dal pevný základ <br>" +
                    "na skale, ktorou je Peter, <br>" +
                    "a nikdy nedovolíš, aby ju <br>" +
                    "premohli pekelné mocnosti; <font color='#B71C1C'>*</font><br>" +
                    "na príhovor svätého pápeža Leva Veľkého <br>" +
                    "posilňuj ju v pravej viere <font color='#B71C1C'>—</font><br>" +
                    "a zachovaj v jednote a pokoji.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "pre túto svätú obetu osvecuj svoju Cirkev, <font color='#B71C1C'>*</font><br>" +
                            "aby sa tvoj ľud vzmáhal po celej zemi <font color='#B71C1C'>—</font><br>" +
                            "a aby ti bola milá služba duchovných pastierov.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, láskavo spravuj <br>" +
                            "svoju Cirkev mocnou rukou, <font color='#B71C1C'>—</font><br>" +
                            "aby ti mohla slúžiť v pravej slobode <br>" +
                            "a zachovávala neporušenú vieru.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "Bože, svätý biskup Martin <br>" +
                    "ťa oslávil svojím životom i svojou smrťou; <font color='#B71C1C'>*</font><br>" +
                    "aj v našich srdciach konaj divy svojej milosti, <font color='#B71C1C'>—</font><br>" +
                    "aby nás ani smrť, ani život <br>" +
                    "nemohli odlúčiť od tvojej lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane a Bože náš, posväť tieto dary, <br>" +
                            "ktoré ti s radosťou prinášame <br>" +
                            "pri spomienke na svätého Martina; <font color='#B71C1C'>*</font><br>" +
                            "nech nás táto obeta posilní, <font color='#B71C1C'>—</font><br>" +
                            "aby sme v šťastí i v protivenstvách <br>" +
                            "kráčali správnou cestou.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, posilnil si nás sviatosťou jednoty; <font color='#B71C1C'>*</font><br>" +
                            "pomáhaj nám ochotne plniť tvoju vôľu <br>" +
                            "a úplne sa ti odovzdať ako svätý Martin, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa mohli tešiť, že patríme celkom tebe.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11g", "Bože, svätý biskup Martin <br>" +
                    "ťa oslávil svojím životom i svojou smrťou; <font color='#B71C1C'>*</font><br>" +
                    "aj v našich srdciach konaj divy svojej milosti, <font color='#B71C1C'>—</font><br>" +
                    "aby nás ani smrť, ani život <br>" +
                    "nemohli odlúčiť od tvojej lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane a Bože náš, posväť tieto dary, <br>" +
                            "ktoré ti s radosťou prinášame <br>" +
                            "pri spomienke na svätého Martina; <font color='#B71C1C'>*</font><br>" +
                            "nech nás táto obeta posilní, <font color='#B71C1C'>—</font><br>" +
                            "aby sme v šťastí i v protivenstvách <br>" +
                            "kráčali správnou cestou.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, posilnil si nás sviatosťou jednoty; <font color='#B71C1C'>*</font><br>" +
                            "pomáhaj nám ochotne plniť tvoju vôľu <br>" +
                            "a úplne sa ti odovzdať ako svätý Martin, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa mohli tešiť, že patríme celkom tebe.<br>" +
                            "Skrze Krista, nášho Pána."},

            {"12", "Prosíme ťa, Pane, daj svojej Cirkvi Ducha lásky, <br>" +
                    "ktorý svätému Jozafátovi dal silu <br>" +
                    "položiť život za svoj ľud; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor naplň i nás tým istým Duchom, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa nebáli obetovať aj život za svojich bratov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Dobrotivý Bože, <br>" +
                            "svojím požehnaním posväť tieto dary <font color='#B71C1C'>*</font><br>" +
                            "a posilni nás vo viere, <font color='#B71C1C'>—</font><br>" +
                            "ktorú svätý Jozafát dosvedčil svojou krvou.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech nám táto obetná hostina <font color='#B71C1C'>*</font><br>" +
                            "dá ducha sily a pokoja, <font color='#B71C1C'>—</font><br>" +
                            "aby sme podľa príkladu svätého Jozafáta <br>" +
                            "vedeli ochotne obetovať <br>" +
                            "aj život za česť a jednotu Cirkvi.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"15", "Bože, svätého biskupa Alberta <br>" +
                    "si vyznačil tým, že ľudskú vedu <br>" +
                    "uviedol do súladu so zjavenou pravdou; <font color='#B71C1C'>*</font><br>" +
                    "dopraj nám kráčať v šľapajach tohto učiteľa, <font color='#B71C1C'>—</font><br>" +
                    "aby nám pokrok vo vede pomáhal <br>" +
                    "lepšie poznávať a vrúcnejšie milovať teba.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"16a", "Bože, do srdca svätej Margity <br>" +
                    "si vložil veľkú lásku k chudobným; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme na jej orodovanie <br>" +
                    "a podľa jej príkladu <br>" +
                    "vo svete sprítomňovali tvoju dobrotu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"16b", "Bože, v panenskom srdci svätej Gertrúdy <br>" +
                    "pripravil si pre seba milý príbytok; <font color='#B71C1C'>*</font><br>" +
                    "na jej orodovanie rozptýľ <br>" +
                    "temnoty nášho srdca <br>" +
                    "a osvieť nás svojím svetlom, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s radosťou cítili, <br>" +
                    "že v nás prebývaš a pôsobíš.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"17", "Bože, svätej Alžbete si udelil milosť, <br>" +
                    "že v chudobných videla <br>" +
                    "a uctievala samého Krista; <font color='#B71C1C'>*</font><br>" +
                    "na jej orodovanie dopraj aj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s neúnavnou láskou <br>" +
                    "pomáhali chudobným a trpiacim.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"17gk", "Bože, svätej Alžbete si udelil milosť, <br>" +
                    "že v chudobných videla <br>" +
                    "a uctievala samého Krista; <font color='#B71C1C'>*</font><br>" +
                    "na jej orodovanie dopraj aj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s neúnavnou láskou <br>" +
                    "pomáhali chudobným a trpiacim.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"18", "Pane, neprestajne poskytuj svojej Cirkvi <br>" +
                    "ochranu svätých apoštolov Petra a Pavla, <font color='#B71C1C'>*</font><br>" +
                    "ktorí jej prví ohlasovali evanjelium; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby na ich príhovor rástla <br>" +
                    "v tvojej milosti až do konca vekov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prinášame ti dary svojej oddanosti <br>" +
                            "a vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby sme zachovali neporušenú náuku, <font color='#B71C1C'>—</font><br>" +
                            "ktorú nám odovzdali <br>" +
                            "svätí apoštoli Peter a Pavol.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby tvoj ľud, nasýtený <br>" +
                            "nebeským chlebom, <br>" +
                            "s radosťou prežíval spomienku <br>" +
                            "na svätých apoštolov Petra a Pavla, <font color='#B71C1C'>—</font><br>" +
                            "ktorých si mu dal za pastierov a ochrancov.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "Bože, ty si blahoslavenú Annu posilňoval, <br>" +
                    "aby sa nebála toho, kto môže zabiť telo, <font color='#B71C1C'>*</font><br>" +
                    "a korunoval si jej panenstvo slávou mučeníctva; <font color='#B71C1C'>—</font><br>" +
                    "na jej príhovor udeľ aj nám odvahu<br>" +
                    "voliť si dobro a zavrhovať zlo. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého<br>" +
                    "po všetky veky vekov. ","",""},
            {"21m", "Pane, dnes si s úctou spomíname <br>" +
                    "na najsvätejšiu Pannu Máriu; <font color='#B71C1C'>*</font><br>" +
                    "na jej orodovanie ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "dopraj, aby sme mohli mať účasť <br>" +
                    "na plnosti tvojej milosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"22", "Bože, každoročne nás potešuješ <br>" +
                    "oslavou svätej Cecílie; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám jej život bol príkladom <br>" +
                    "a svedectvom pôsobenia Krista, <br>" +
                    "tvojho Syna, vo svojich služobníkoch.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.","",""},
            {"23a", "Všemohúci a večný Bože, <br>" +
                    "obdivuhodná sila všetkých svätých, <br>" +
                    "naplň nás radosťou pri spomienke <br>" +
                    "na svätého Klimenta, <br>" +
                    "Kristovho kňaza a mučeníka; <font color='#B71C1C'>*</font><br>" +
                    "veď on nielen slávil tajomstvo viery, <br>" +
                    "ale vydal o ňom aj svedectvo svojou krvou, <font color='#B71C1C'>—</font><br>" +
                    "a evanjelium, ktoré hlásal slovom, <br>" +
                    "potvrdzoval skutkami.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"23b", "Bože, vo svätom Kolumbánovi <br>" +
                    "si obdivuhodne spojil horlivosť v šírení <br>" +
                    "evanjelia s láskou k mníšskemu životu; <font color='#B71C1C'>*</font><br>" +
                    "na jeho orodovanie nám pomáhaj, <br>" +
                    "aby sme podľa jeho príkladu <br>" +
                    "vo všetkom hľadali iba teba <font color='#B71C1C'>—</font><br>" +
                    "a snažili sa o rozvoj veriaceho ľudu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"24", "Bože, prameň a pôvodca každého otcovstva, <br>" +
                    "ty si urobil svätých mučeníkov <br>" +
                    "Andreja a jeho spoločníkov vernými <br>" +
                    "krížu tvojho Syna až po vyliatie krvi; <font color='#B71C1C'>*</font><br>" +
                    "daj, nech na ich príhovor <br>" +
                    "šírime tvoju lásku medzi bratmi, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa mohli volať a byť tvojimi synmi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Svätý Otče, prijmi obetné dary, <br>" +
                            "ktoré ti prinášame pri spomienke <br>" +
                            "umučenia svätých mučeníkov; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme ti uprostred protivenstiev <br>" +
                            "nášho života zostali vždy verní <font color='#B71C1C'>—</font><br>" +
                            "a aby sme sa sami stali tebe milou obetou.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, pri spomienke na svätých mučeníkov <br>" +
                            "nasýtil si nás z jedného chleba; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, daj, aby sme zostali <br>" +
                            "jednomyseľní v tvojej láske <font color='#B71C1C'>—</font><br>" +
                            "a dosiahli večnú odmenu trpezlivosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"25", "Všemohúci a večný Bože, <br>" +
                    "ty si svojmu ľudu dal <br>" +
                    "svätú pannu a mučenicu Katarínu; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, aby sme sa na jej príhovor <br>" +
                    "utvrdzovali vo viere <font color='#B71C1C'>—</font><br>" +
                    "a horlivo pracovali na jednote Cirkvi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"30g", "Pane, svojej Cirkvi si dal <br>" +
                    "svätého apoštola Ondreja <br>" +
                    "za ohlasovateľa viery a duchovného pastiera; <font color='#B71C1C'>*</font><br>" +
                    "vypočuj naše prosby <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme vždy <br>" +
                    "cítili účinky jeho orodovania.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Všemohúci Bože, <br>" +
                            "na sviatok svätého Ondreja <br>" +
                            "prinášame ti obetné dary; <font color='#B71C1C'>*</font><br>" +
                            "nech sa ti páčia, keď ich predkladáme, <font color='#B71C1C'>—</font><br>" +
                            "a nech nás posilnia, <br>" +
                            "keď ich premenené prijmeme.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, posilni nás týmto svätým prijímaním, <font color='#B71C1C'>*</font><br>" +
                            "aby sme podľa príkladu <br>" +
                            "svätého apoštola Ondreja <br>" +
                            "s láskou nasledovali ukrižovaného Krista, <font color='#B71C1C'>—</font><br>" +
                            "a tak sme mohli dosiahnuť slávu vzkriesenia.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
    };

    String[][] modlitba12 = {
            {"03", "Bože, misionárskou činnosťou <br>" +
                    "svätého Františka Xaverského si získal <br>" +
                    "mnohé národy pre svoju Cirkev; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, naplň srdcia veriacich <br>" +
                    "horlivosťou za šírenie viery, <font color='#B71C1C'>—</font><br>" +
                    "aby tvoja Cirkev po celom svete <br>" +
                    "rástla počtom a svätosťou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi naše obetné dary <br>" +
                            "v deň spomienky na svätého Františka, <br>" +
                            "ktorý sa z túžby po spáse ľudí <br>" +
                            "odobral do ďalekých krajín <br>" +
                            "ohlasovať Kristovu blahozvesť; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme aj my boli <br>" +
                            "pravými svedkami evanjelia <font color='#B71C1C'>—</font><br>" +
                            "a s našimi bratmi a sestrami <br>" +
                            "vo viere sa uberali k tebe.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, nech táto sviatosť <br>" +
                            "zapáli v nás oheň lásky, <br>" +
                            "akým za spásu duší <br>" +
                            "horel svätý František, <font color='#B71C1C'>*</font><br>" +
                            "aby sme žili zodpovedne <br>" +
                            "svojmu kresťanskému povolaniu <font color='#B71C1C'>—</font><br>" +
                            "a spolu s ním dosiahli odmenu <br>" +
                            "prisľúbenú svedomitým robotníkom <br>" +
                            "v tvojej vinici.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"03g", "Bože, misionárskou činnosťou <br>" +
                    "svätého Františka Xaverského si získal <br>" +
                    "mnohé národy pre svoju Cirkev; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, naplň srdcia veriacich <br>" +
                    "horlivosťou za šírenie viery, <font color='#B71C1C'>—</font><br>" +
                    "aby tvoja Cirkev po celom svete <br>" +
                    "rástla počtom a svätosťou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi naše obetné dary <br>" +
                            "v deň spomienky na svätého Františka, <br>" +
                            "ktorý sa z túžby po spáse ľudí <br>" +
                            "odobral do ďalekých krajín <br>" +
                            "ohlasovať Kristovu blahozvesť; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme aj my boli <br>" +
                            "pravými svedkami evanjelia <font color='#B71C1C'>—</font><br>" +
                            "a s našimi bratmi a sestrami <br>" +
                            "vo viere sa uberali k tebe.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, nech táto sviatosť <br>" +
                            "zapáli v nás oheň lásky, <br>" +
                            "akým za spásu duší <br>" +
                            "horel svätý František, <font color='#B71C1C'>*</font><br>" +
                            "aby sme žili zodpovedne <br>" +
                            "svojmu kresťanskému povolaniu <font color='#B71C1C'>—</font><br>" +
                            "a spolu s ním dosiahli odmenu <br>" +
                            "prisľúbenú svedomitým robotníkom <br>" +
                            "v tvojej vinici.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"04a", "Pane, na príhovor <br>" +
                    "svätého Jána Damascénskeho nám pomáhaj, <font color='#B71C1C'>*</font><br>" +
                    "aby pravá viera, ktorú tak presvedčivo hlásal, <font color='#B71C1C'>—</font><br>" +
                    "bola pre nás vždy prameňom svetla a sily.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
                    {"04b", "Bože, ty si vo svojej všemohúcnosti <br>" +
                            "udelil i ženskému pokoleniu <br>" +
                            "víťazstvo mučeníctva; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, daj nám silu, <font color='#B71C1C'>—</font><br>" +
                            "aby sme nasledovali príklad <br>" +
                            "svätej panny a mučenice Barbory, <br>" +
                            "ktorej narodenie pre nebo oslavujeme, <br>" +
                            "a tak sa dostali k tebe.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
                    {"06", "Pane, vzývame tvoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, na mocný príhovor <br>" +
                            "svätého biskupa Mikuláša chráň nás <br>" +
                            "pred každým nešťastím, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli napredovať po ceste spásy.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.","",""},
                    {"07", "Bože, vo svätom biskupovi Ambrózovi <br>" +
                            "dal si nám vynikajúceho učiteľa <br>" +
                            "katolíckej viery a vzor apoštolskej odvahy; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, posielaj svojej Cirkvi <br>" +
                            "duchovných pastierov podľa svojho srdca, <font color='#B71C1C'>—</font><br>" +
                            "aby ju spravovali múdro a neohrozene.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.",
                            "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                                    "nech nás pri slávení týchto svätých tajomstiev <br>" +
                                    "naplní svetlom viery Duch Svätý, <font color='#B71C1C'>—</font><br>" +
                                    "ktorý svätého Ambróza povzbudzoval <br>" +
                                    "k šíreniu tvojej slávy.<br>" +
                                    "Skrze Krista, nášho Pána.",
                            "Pane, nech nám prijatie tejto sviatosti pomáha, <font color='#B71C1C'>*</font><br>" +
                                    "aby sme podľa príkladu svätého Ambróza <br>" +
                                    "neochvejne kráčali po tvojich cestách <font color='#B71C1C'>—</font><br>" +
                                    "a pripravovali sa na radostnú hostinu vo večnosti.<br>" +
                                    "Skrze Krista, nášho Pána."},
            {"09", "Bože, ty si prostredníctvom svätého Jána <br>" +
                    "preukázal svojmu ľudu lásku <br>" +
                    "presvätej Panny Márie; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme na jeho orodovanie <br>" +
                    "nasledovali rady guadalupskej Matky, <font color='#B71C1C'>—</font><br>" +
                    "a tak mohli neustále plniť tvoju vôľu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"10m", "Bože, ty si splnil sľub daný našim otcom <br>" +
                    "a vyvolil si preblahoslavenú Pannu Máriu <br>" +
                    "za matku Spasiteľa; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám nasledovať <br>" +
                    "jej príklad pokory, ktorá ti je milá, <font color='#B71C1C'>—</font><br>" +
                    "a poslušnosti, ktorá nám priniesla spásu. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"11", "Pane, svätý pápež Damaz <br>" +
                    "bol veľkým ctiteľom mučeníkov <br>" +
                    "a horlivo šíril ich úctu; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa jeho príkladu <br>" +
                    "aj my oslavovali ich hrdinské skutky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"12", "Bože, Otec milosrdenstva, <br>" +
                    "ty si zveril svoj ľud pod osobitnú ochranu <br>" +
                    "presvätej Matky tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "udeľ všetkým, ktorí vzývajú <br>" +
                    "preblahoslavenú guadalupskú Pannu, <font color='#B71C1C'>—</font><br>" +
                    "aby sa so živou vierou usilovali o rozvoj <br>" +
                    "národov po cestách spravodlivosti a pokoja.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"13", "Prosíme ťa, Pane, na príhovor <br>" +
                    "svätej panny a mučenice Lucie nám pomáhaj, <font color='#B71C1C'>*</font><br>" +
                    "aby sme tu na zemi dôstojne oslávili <br>" +
                    "jej narodenie pre nebo <font color='#B71C1C'>—</font><br>" +
                    "a raz sa s ňou mohli stretnúť vo večnej sláve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"14", "Bože, svätého kňaza Jána <br>" +
                    "si obdaril mimoriadnou silou k sebazapieraniu <br>" +
                    "a vynikajúcou láskou ku krížu; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme nasledovali jeho príklad <font color='#B71C1C'>—</font><br>" +
                    "a navždy sa spojili s tebou vo večnej sláve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Všemohúci Bože, <br>" +
                            "v deň spomienky na svätého Jána od Kríža <br>" +
                            "prinášame ti obetné dary; <font color='#B71C1C'>*</font><br>" +
                            "láskavo na ne zhliadni <br>" +
                            "a daj, aby sme vo svojom živote <br>" +
                            "napodobňovali obetu tvojho Syna na kríži, <font color='#B71C1C'>—</font><br>" +
                            "ktorej pamiatku nábožne slávime.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, v živote svätého kňaza Jána <br>" +
                            "si nám obdivuhodne priblížil tajomstvo kríža; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme sa posilnení <br>" +
                            "touto obetou verne pridŕžali Krista <font color='#B71C1C'>—</font><br>" +
                            "a v Cirkvi pracovali na spáse všetkých ľudí.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"17", "Bože, Stvoriteľ a Vykupiteľ človeka, <br>" +
                    "ty si chcel, aby sa tvoje Slovo <br>" +
                    "v lone ustavičnej Panny stalo telom; <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na naše prosby a dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby nám tvoj jednorodený Syn, <br>" +
                    "ktorý prijal našu ľudskú prirodzenosť, <br>" +
                    "dal účasť na svojom božskom živote. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "posväť dary svojej Cirkvi <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby sme sa pri slávení <br>" +
                            "týchto svätých tajomstiev <font color='#B71C1C'>—</font><br>" +
                            "mohli posilniť nebeským chlebom. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "nasýtení sviatostným pokrmom ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "splň našu túžbu a zapáľ v nás oheň svojho Ducha, <font color='#B71C1C'>—</font><br>" +
                            "aby sme žiarili ako jasné svetlá, <br>" +
                            "keď príde tvoj Syn Ježiš Kristus.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"18", "Všemohúci Bože, <br>" +
                    "ešte stále na nás doliehajú následky prvotného hriechu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "nech nám prinesie pravú slobodu <br>" +
                    "očakávané narodenie tvojho milovaného Syna. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, nech nás obeta, ktorú slávime, urobí tebe milými, <font color='#B71C1C'>*</font><br>" +
                            "aby sme mali účasť na večnosti tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "ktorý nám svojou smrťou zaslúžil nesmrteľnosť. <br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "preukáž nám svoje milosrdenstvo <br>" +
                            "v tvojom svätom chráme, <font color='#B71C1C'>*</font><br>" +
                            "aby sme s náležitou úctou <font color='#B71C1C'>—</font><br>" +
                            "napredovali k nadchádzajúcej slávnosti nášho vykúpenia.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"19", "Bože, ty si narodením svojho Syna <br>" +
                    "z presvätej Panny zjavil svetu jas svojej slávy; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme toto nevýslovné tajomstvo vtelenia <br>" +
                    "uctievali s neporušenou vierou <font color='#B71C1C'>—</font><br>" +
                    "a oslavovali s úprimnou oddanosťou. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo zhliadni na obetné dary, <br>" +
                            "ktoré kladieme na tvoj oltár, <font color='#B71C1C'>*</font><br>" +
                            "aby tvoja moc posvätila to, <font color='#B71C1C'>—</font><br>" +
                            "čo ti v našej slabosti predkladáme.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "vzdávame ti vďaky za udelené dary <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, vzbuď v nás túžbu po prisľúbenej spáse, <font color='#B71C1C'>—</font><br>" +
                            "aby sme s očisteným srdcom dôstojne oslávili <br>" +
                            "narodenie nášho Spasiteľa.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"20", "Bože, večná vznešenosť, nepoškvrnená Panna Mária <br>" +
                    "pri anjelovom zvestovaní prijala tvoje večné Slovo <br>" +
                    "a naplnená svetlom Ducha Svätého <br>" +
                    "stala sa Božím príbytkom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa jej príkladu <br>" +
                    "aj my ochotne plnili tvoju vôľu. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo zhliadni na túto vznešenú obetu <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby sme účasťou na tomto tajomstve <font color='#B71C1C'>—</font><br>" +
                            "dosiahli nebeské dary, ktoré s vierou očakávame. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, svojou božskou mocou ochraňuj tých, <br>" +
                            "ktorých si nasýtil nebeským pokrmom, <font color='#B71C1C'>*</font><br>" +
                            "a láskavo dopraj, <font color='#B71C1C'>—</font><br>" +
                            "aby nám účasť na tvojich tajomstvách <br>" +
                            "priniesla radosť a pravý pokoj. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "Prosíme ťa, Pane, <br>" +
                    "láskavo vypočuj prosby svojho ľudu, <br>" +
                    "ktorý sa raduje z príchodu <br>" +
                    "tvojho jednorodeného Syna v ľudskom tele, <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby sme dosiahli odmenu večného života, <font color='#B71C1C'>—</font><br>" +
                    "keď príde vo svojej sláve. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, dobrotivo prijmi dary svojej Cirkvi, <font color='#B71C1C'>*</font><br>" +
                            "ktoré si nám poskytol, aby sme ti ich mohli priniesť na obetu, <font color='#B71C1C'>—</font><br>" +
                            "a svojou mocou ich premeň na sviatosť našej spásy. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech je účasť na tomto božskom tajomstve <br>" +
                            "pre tvoj ľud ustavičnou ochranou; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sme ti oddane slúžili, <font color='#B71C1C'>—</font><br>" +
                            "a tak dosiahli spásu tela i duše. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"21a", "Bože, svätého kňaza Petra Kanízia <br>" +
                    "si obdaril vynikajúcou učenosťou <br>" +
                    "a veľkou odvahou pri obrane katolíckej viery; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor <br>" +
                    "pomáhaj všetkým, čo hľadajú pravdu, <br>" +
                    "aby s radosťou našli teba, <font color='#B71C1C'>—</font><br>" +
                    "a svojim veriacim udeľ vytrvalosť <br>" +
                    "a neohrozenosť vo viere.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov. ","",""},
            {"22", "Bože, príchodom svojho Syna <br>" +
                    "vyslobodil si človeka z moci hriechu a smrti; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, aby sme pokorne a nábožne <br>" +
                    "vyznávali tajomstvo jeho vtelenia <font color='#B71C1C'>—</font><br>" +
                    "a zaslúžili si večnú spásu <br>" +
                    "v spoločenstve s naším Vykupiteľom.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, s dôverou v tvoju dobrotu <br>" +
                            "prichádzame s darmi k svätému oltáru; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby nás očistila tvoja milosť <font color='#B71C1C'>—</font><br>" +
                            "a posvätili tajomstvá, ktoré slávime. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech nás posilní prijatá sviatosť, <font color='#B71C1C'>*</font><br>" +
                            "aby sme, bohatí na dobré skutky, <br>" +
                            "s dôverou mohli ísť v ústrety Spasiteľovi <font color='#B71C1C'>—</font><br>" +
                            "a zaslúžili si odmenu večnej blaženosti. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "Všemohúci a večný Bože, <br>" +
                    "už sú blízko sviatky <br>" +
                    "narodenia tvojho Syna v ľudskom tele; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, nech nám, tvojim nehodným služobníkom, <br>" +
                    "preukáže svoju milosrdnú lásku tvoje Slovo, Ježiš Kristus, <font color='#B71C1C'>—</font><br>" +
                    "ktorý si vzal telo z Panny Márie a prebýval medzi nami. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, nech nás táto obeta, <br>" +
                            "ktorú si nám dal ako najplnšiu bohoslužbu, <font color='#B71C1C'>*</font><br>" +
                            "dokonale zmieri s tebou, <font color='#B71C1C'>—</font><br>" +
                            "aby sme s očisteným srdcom slávili narodenie nášho Vykupiteľa.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Pane, nebeský pokrm, ktorým si nás nasýtil, <font color='#B71C1C'>*</font><br>" +
                            "nech nám prinesie tvoj pokoj, <font color='#B71C1C'>—</font><br>" +
                            "aby sme so zažatými lampami kráčali <br>" +
                            "v ústrety tvojmu milovanému Synovi. <br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"23a", "Všemohúci Bože, <br>" +
                    "nech nám príklad svätého kňaza <br>" +
                    "Jána Kentského pomáha rásť v múdrosti svätých, <font color='#B71C1C'>*</font><br>" +
                    "aby sme preukazovali milosrdenstvo všetkým, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli tvoje odpustenie.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.", "", ""},
            {"24", "Pane Ježišu, príď rýchlo a nemeškaj, <font color='#B71C1C'>*</font><br>" +
                    "a svojím príchodom poteš a posilni tých, <font color='#B71C1C'>—</font><br>" +
                    "čo dôverujú v tvoju dobrotu. <br>" +
                    "Lebo ty si Boh a žiješ a kraľuješ s Bohom Otcom <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, láskavo prijmi tieto obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby sme sa ich prijatím očistili od hriechov <font color='#B71C1C'>—</font><br>" +
                            "a mohli sme s čistým srdcom očakávať <br>" +
                            "slávny príchod tvojho Syna.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Pane, posilnil si nás <br>" +
                            "týmto svojím obdivuhodným darom; <font color='#B71C1C'>*</font><br>" +
                            "daj, nech sa dôstojne pripravíme <br>" +
                            "na sviatok narodenia tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "aby sme tak s radosťou mohli získať <br>" +
                            "jeho večnú odmenu.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"24gkn", "Bože, ty nás každý rok potešuješ <br>" +
                    "očakávaním sviatkov nášho vykúpenia; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme raz bez obáv mohli hľadieť <br>" +
                    "na tvojho jednorodeného Syna, <br>" +
                    "nášho Pána Ježiša Krista, ako na sudcu, <font color='#B71C1C'>—</font><br>" +
                    "keď ho teraz s radosťou vítame ako Vykupiteľa.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme touto službou dôstojne oslávili <br>" +
                            "tajomstvo narodenia tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "ktoré je začiatkom nášho vykúpenia. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nás duchovne posilní <br>" +
                            "slávnosť narodenia tvojho jednorodeného Syna, <font color='#B71C1C'>—</font><br>" +
                            "ktorý sa nám v tomto nebeskom tajomstve dáva za pokrm a nápoj. <br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"25agkn", "Bože, v túto presvätú noc <br>" +
                    "nám zažiarilo pravé svetlo, Ježiš Kristus; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme na zemi <br>" +
                    "spoznali svetlo jeho pravdy <font color='#B71C1C'>—</font><br>" +
                    "a v nebi mali účasť na jeho sláve.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, nech ti je milá <br>" +
                            "dnešná sviatočná obeta, <font color='#B71C1C'>*</font><br>" +
                            "aby sme touto presvätou výmenou <br>" +
                            "dosiahli účasť na božskom živote tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "v ktorom je naša ľudská prirodzenosť <br>" +
                            "spojená s tvojím božstvom.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Pane a Bože náš, <br>" +
                            "radostne slávime narodenie nášho Vykupiteľa a prosíme ťa, <font color='#B71C1C'>*</font><br>" +
                            "daj nám milosť, aby sme žili príkladným životom, <font color='#B71C1C'>—</font><br>" +
                            "a tak sa dostali do jeho spoločenstva v nebi. <br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"25bgkn", "Všemohúci Bože, <br>" +
                    "tvoje vtelené Slovo nás preniká novým svetlom; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby viera, ktorá osvecuje našu myseľ, <br>" +
                    "žiarila aj z našich skutkov. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, nech sú naše dary hodné <br>" +
                            "tajomstiev Božieho narodenia, ktoré dnes slávime; <font color='#B71C1C'>*</font><br>" +
                            "a tak ako sa v narodenom dieťati Ježišovi zjavil Boh, <font color='#B71C1C'>—</font><br>" +
                            "nech nám tieto pozemské dary <br>" +
                            "sprostredkujú účasť na Božom živote.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, s radosťou oslavujeme <br>" +
                            "narodenie tvojho Syna a vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme toto nevýslovné tajomstvo <br>" +
                            "poznávali so živou vierou <font color='#B71C1C'>—</font><br>" +
                            "a prežívali ho s čoraz väčšou láskou. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"25cgkn", "Bože, ty si podivuhodne stvoril človeka <br>" +
                    "a ešte podivuhodnejšie si ho vykúpil; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj nám účasť <br>" +
                    "na božskom živote svojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "ktorý prijal našu ľudskú prirodzenosť. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, nech ti je milá dnešná slávnostná obeta, <font color='#B71C1C'>*</font><br>" +
                            "ktorá nás dokonale zmieruje s tebou <font color='#B71C1C'>—</font><br>" +
                            "a je najvyšším prejavom našej bohoslužby. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                            "nech nám Spasiteľ sveta, ktorý sa dnes narodil <br>" +
                            "a je pôvodcom nášho božského zrodenia, <font color='#B71C1C'>—</font><br>" +
                            "dá aj účasť na večnom živote. <br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"26g", "Pane, pri oslave víťaznej smrti <br>" +
                    "svätého Štefana, ktorý sa modlil <br>" +
                    "za svojich prenasledovateľov, <br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "daj nám silu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme podľa jeho príkladu <br>" +
                    "milovali aj svojich nepriateľov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "pri oslave svätého mučeníka Štefana, <br>" +
                            "láskavo prijmi tieto dary, <font color='#B71C1C'>—</font><br>" +
                            "s ktorými sa ti ochotne aj my oddávame.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, ďakujeme ti za toľké <br>" +
                            "prejavy tvojho milosrdenstva, <font color='#B71C1C'>*</font><br>" +
                            "lebo narodením svojho Syna nám dávaš spásu <font color='#B71C1C'>—</font><br>" +
                            "a oslavou svätého mučeníka Štefana nás povzbudzuješ.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"27g", "Bože, prostredníctvom <br>" +
                    "svätého apoštola Jána zjavil si nám <br>" +
                    "tajomstvo svojho večného Slova; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám, <br>" +
                    "aby sme s osvietenou mysľou pochopili učenie, <font color='#B71C1C'>—</font><br>" +
                    "ktoré nám tak vzletne hlásal.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "posväť naše obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby sme účasťou na posvätnej hostine <br>" +
                            "stále viac poznávali tajomstvá večného Slova, <font color='#B71C1C'>—</font><br>" +
                            "ktoré si pri Poslednej večeri <br>" +
                            "zjavil svojmu apoštolovi Jánovi.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "svätý apoštol Ján ohlasoval, <br>" +
                            "že tvoje Slovo sa stalo telom pre našu spásu; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby skrze posvätné tajomstvo, ktoré sme slávili, <font color='#B71C1C'>—</font><br>" +
                            "stále v nás prebýval tvoj Syn Ježiš Kristus.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"28g", "Bože, dnes ťa betlehemské deti <br>" +
                    "oslávili nie slovami, ale mučeníckou smrťou; <font color='#B71C1C'>*</font><br>" +
                    "udeľ nám milosť, <br>" +
                    "aby sme vieru, ktorú vyznávame ústami, <font color='#B71C1C'>—</font><br>" +
                    "dosvedčovali aj svojím životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi obetné dary, <br>" +
                            "ktoré ti prinášame s úprimným srdcom, <font color='#B71C1C'>*</font><br>" +
                            "a očisti nás touto obetou, <font color='#B71C1C'>—</font><br>" +
                            "pre ktorú dávaš milosť spásy aj tým, <br>" +
                            "čo ťa nepoznajú.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, pre zásluhy narodenia svojho Syna <br>" +
                            "dal si betlehemským deťom <br>" +
                            "korunu mučeníctva, hoci ešte <br>" +
                            "neboli schopné vyznať vieru v neho; <font color='#B71C1C'>*</font><br>" +
                            "nech nám Kristus, <br>" +
                            "pre ktorého vyliali nevinnú krv, <font color='#B71C1C'>—</font><br>" +
                            "udelí v tejto sviatosti plnosť spásy.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"29", "Všemohúci a neviditeľný Bože, <br>" +
                    "príchodom tvojho svetla rozptýlil si temnoty sveta; <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo zhliadni na nás <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme dôstojne oslavovali <br>" +
                    "vznešené narodenie tvojho jednorodeného Syna. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, prijmi naše dary, <br>" +
                            "ktorými sa uskutočňuje vznešená výmena, <font color='#B71C1C'>*</font><br>" +
                            "a keď ti obetujeme z toho, čo si nám uštedril, <font color='#B71C1C'>—</font><br>" +
                            "nech si zaslúžime prijať teba samého.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby nám sväté tajomstvá, ktoré sme prijali, <font color='#B71C1C'>—</font><br>" +
                            "boli neustálou posilou v našom živote. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"29a", "Bože, svätému Tomášovi Becketovi <br>" +
                    "si dal milosť veľkodušne obetovať <br>" +
                    "svoj život za spravodlivosť; <font color='#B71C1C'>*</font><br>" +
                    "na jeho príhovor dopraj, <br>" +
                    "aby sme aj my z lásky ku Kristovi <br>" +
                    "boli ochotní stratiť svoj život na tomto svete, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ho znova našli v nebeskom kráľovstve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"30", "Všemohúci Bože, prosíme ťa, dopraj, <font color='#B71C1C'>*</font><br>" +
                            "aby nás narodenie tvojho jednorodeného Syna <br>" +
                            "vyslobodilo zo starého otroctva, <font color='#B71C1C'>—</font><br>" +
                            "ktoré nás drží v jarme hriechu.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                            "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                            "po všetky veky vekov.",
                            "Prosíme ťa, Pane, <br>" +
                                    "dobrotivo prijmi obetné dary svojho ľudu, <font color='#B71C1C'>*</font><br>" +
                                    "aby sme touto nebeskou sviatosťou dosiahli dobrá, <font color='#B71C1C'>—</font><br>" +
                                    "po ktorých túžime s vierou a nábožnosťou. <br>" +
                                    "Skrze Krista, nášho Pána.",
                            "Bože, láskavo sa stretávaš s nami v Najsvätejšej sviatosti; <font color='#B71C1C'>*</font><br>" +
                                    "daj, nech jej sila neprestajne účinkuje v našich srdciach, <font color='#B71C1C'>—</font><br>" +
                                    "aby nás tak pripravila na prijatie ďalších milostí.<br>" +
                                    "Skrze Krista, nášho Pána."},
                    {"31", "Všemohúci a večný Bože, <br>" +
                            "narodenie tvojho Syna sa stalo začiatkom <br>" +
                            "nového a dokonalého vzťahu ľudí k tebe; <font color='#B71C1C'>*</font><br>" +
                            "a keďže je Spasiteľom celého ľudstva, <font color='#B71C1C'>—</font><br>" +
                            "daj, prosíme, aby sme aj my boli pripočítaní medzi jeho verných.<br>" +
                            "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                            "v jednote Ducha Svätého po všetky veky vekov.",
                            "Bože, pôvodca úprimnej nábožnosti a pokoja, <font color='#B71C1C'>*</font><br>" +
                                    "daj, prosíme, aby sme ťa dôstojne uctili týmito darmi <font color='#B71C1C'>—</font><br>" +
                                    "a účasťou na svätých tajomstvách upevnili vzájomnú jednotu. <br>" +
                                    "Skrze Krista, nášho Pána.",
                            "Pane, ty mnohorakým spôsobom <br>" +
                                    "vedieš a posilňuješ svoj ľud; <font color='#B71C1C'>*</font><br>" +
                                    "otcovsky nás ochraňuj teraz i v budúcnosti <font color='#B71C1C'>—</font><br>" +
                                    "a daj, aby nás radosť z pozemských dobier <br>" +
                                    "pobádala väčšmi sa usilovať o hodnoty večné. <br>" +
                                    "Skrze Krista, nášho Pána."},
            {"31a", "Pane, na príhovor svätého <br>" +
                    "pápeža Silvestra nám pomáhaj, <font color='#B71C1C'>*</font><br>" +
                    "aby sme sa v pozemskom živote <br>" +
                    "riadili tvojou vôľou <font color='#B71C1C'>—</font><br>" +
                    "a dosiahli nehynúcu blaženosť vo večnosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.","",""},
            {"31gk", "Bože, narodením tvojho Syna <br>" +
                    "z preblahoslavenej Panny Márie <br>" +
                    "poskytol si ľuďom večnú spásu; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme vždy pociťovali <br>" +
                    "účinky jej orodovania, <font color='#B71C1C'>—</font><br>" +
                    "veď skrze ňu sme dostali Pôvodcu života, <br>" +
                    "Ježiša Krista, tvojho Syna a nášho Pána.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Bože, ty láskavo začínaš <br>" +
                            "a dovršuješ každé dobré dielo; <font color='#B71C1C'>*</font><br>" +
                            "na tento radostný sviatok Božej Matky <br>" +
                            "oslavujeme začiatok našej spásy a prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sa v nás zavŕšila v plnej miere. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nadšene vyznávame, <br>" +
                            "že preblahoslavená Panna Mária <br>" +
                            "je Rodičkou tvojho Syna a Matkou Cirkvi, <font color='#B71C1C'>*</font><br>" +
                            "a prosíme, aby nám nebeská sviatosť, <br>" +
                            "ktorú sme s radosťou prijali, <font color='#B71C1C'>—</font><br>" +
                            "slúžila pre večný život. <br>" +
                            "Skrze Krista, nášho Pána."},
    };
}