package sk.missa.interfaces;

/*
 * Prosby v adventnom období uložené v dvojrozmernom poli - adventProsby
 * nedeľa: {týždeň v adventnom období+deň (napr. 2 týždeň v pondelok - 21), liturgický rok (A/B/C), názov spoločnej časti, úvodná výzva, odpoveď ľudu, úmysly, záverečná modlitba},
 * deň v týždni: {týždeň v adventnom období+deň, deň v týždni (1-pondelok, 2-utorok..., 6-sobota), názov spoločnej časti, úvodná výzva, odpoveď ľudu, úmysly, záverečná modlitba},
 */

public interface Prosby_advent {
    String[][] adventProsby = {
            {"10", "A", "Bratia a sestry, dnes, keď začíname nový cirkevný rok, prosme nebeského Otca, aby nás urobil schopnými počúvať jeho slovo a uskutočňovať ho v našom živote.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Za svätú Cirkev: aby vedela uchovávať a ohlasovať zverené Božie slovo a prostredníctvom neho ohlasovala Boží plán spásy vo svete, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Za všetkých ľudí: aby si uvedomovali, že čas života, ktorý im dáva Boh, je darom a jedinečnou príležitosťou na uskutočňovanie osobnej spásy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Za všetkých, ktorí sa stali otrokmi konzumného života: aby ich evanjeliové posolstvo oslobodilo a priviedlo na správnu cestu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Za manželov: aby v spoločnom zväzku dokázali spoznávať duchovné hodnoty a ovocie nábožného života, ktoré pramenia z viery v Ježiša Krista, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: aby sme adventný čas prežili v duchu modlitby a radostnej túžby po stretnutí s Kristom, prosme Pána.",
                    "Nebeský Otče,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a ustavične v nás oživuj túžbu po živote v tvojom Synovi,<br>" +
                            "aby nás posilňoval vo viere a v uskutočňovaní príkazu lásky.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"10", "B", "Bratia a sestry, spojme svoje hlasy v úprimnej modlitbe a spoločne prosme za všetkých, ktorí očakávajú príchod nášho Pána.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Za svätú Cirkev: aby horlivo vydávala svedectvo o Kristovi, ktorý má prísť, a aby bola živým príkladom jeho lásky vo svete, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Za všetkých ľudí: aby aj v životných ťažkostiach dokázali s múdrosťou prežívať prítomnú chvíľu a boli pozorní na pôsobenie Boha vo svojom živote, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Za tých, ktorí si zatvárajú oči pred trpiacimi bratmi a sestrami: aby naplnili svoj život pravou láskou a solidárnosťou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Za utláčaných, prenasledovaných a tých, ktorí sú bez domova: aby v kresťanských spoločenstvách našli pomoc a ochranu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Za nás všetkých: aby sme boli ochotní pomôcť tým, ktorí potrebujú našu pomoc, prosme Pána.",
                    "Nebeský Otče,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a naplň nás radosťou, že ti môžeme slúžiť,<br>" +
                            "a tak ohlasovať tvoju lásku vo svete.<br>" +
                            "O to ťa prosíme skrze Krista, nášho Pána."},
            {"10", "C", "Bratia a sestry, náš Pán môže prísť kedykoľvek, preto túžobne očakávajme jeho príchod a pripravme sa na stretnutie s ním. S dôverou ho prosme:",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane Ježišu, pripravuj svoju Cirkev na svoj príchod v sláve a upevňuj ju v blaženej nádeji.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Spasiteľ sveta, preukáž nám svoje milosrdenstvo a daruj spásu všetkým ľuďom.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Nebeský lekár, žehnaj všetkých, ktorí sa starajú o naše zdravie.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Požehnávaj rodičov a osvecuj ich svojím Duchom, aby sa dobre starali o spásu svojich detí.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Upokoj všetkých, ktorí prežívajú strach z budúcnosti, aby uverili, že náš život je v tvojich rukách.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Dobrý pastier, daj, aby sme sa v tomto posvätnom čase ochotnejšie venovali modlitbe a skutkom milosrdenstva.<br>" +
                            "<font color='#B71C1C'>7.</font>&nbsp;Daruj nášmu <font color='#B71C1C'>(</font>farskému<font color='#B71C1C'>)</font> spoločenstvu požehnaný Advent a urob nás bohatými na lásku k tebe a k blížnym.",
                    "Pane Ježišu,<br>" +
                            "ty si nám prikázal,<br>" +
                            "aby sme sa modlili a bedlili, a tak ťa očakávali;<br>" +
                            "vyslyš naše prosby a sprevádzaj naše kroky,<br>" +
                            "aby sme ťa všetci mohli radostne privítať,<br>" +
                            "keď prídeš v sláve.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"11", "1", "Bratia a sestry, v očakávaní príchodu nášho Pána prosme o takú vieru a pokoru, akú mal stotník v dnešnom evanjeliu.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, v teba dúfame, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane, pomáhaj Cirkvi, aby múdro viedla svojich veriacich do Božieho kráľovstva.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Žehnaj nášho pápeža <font color='#B71C1C'>M.</font>, aby bol dôstojným zástupcom Krista na zemi.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Daj ľudstvu poznať, že hmotné hodnoty nenahradia hodnoty duchovné.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Ujmi sa detí a mládeže a daj im dobrých učiteľov a vychovávateľov.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Daj milosť stretnutia s Ježišom aj tým, ktorí nie sú v jeho Cirkvi, ale žijú podľa svojho svedomia.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Požehnaj rodiny, v ktorých ťa jeden z manželov odmieta, aby sa príkladom druhého vrátil na cestu pravdy.<br>" +
                            "<font color='#B71C1C'>7.</font>&nbsp;Priveď zomrelých, ktorí počas svojho pozemského života spoznali Ježiša v trpiacich, chudobných a prenasledovaných, do večného spoločenstva s ním.",
                    "Pane Bože,<br>" +
                            "vypočuj naše pokorné prosby a daj,<br>" +
                            "aby sme sa dobre pripravili<br>" +
                            "na stretnutie s tebou vo večnosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"12", "2", "Bratia a sestry, podľa vzoru učeníkov sprevádzajúcich nášho Pána priblížme sa aj my ku Kristovi a úprimne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Ježišu, pomáhaj svojej Cirkvi, aby ti pripravovala dokonalý a svätý ľud.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Chráň pápeža <font color='#B71C1C'>M.</font>, biskupov a kňazov a daj, aby viedli tvoj ľud k spáse.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Daj, aby si sudcovia plnili svoje povolanie svedomito, spravodlivo a s vedomím, že aj oni raz budú stáť pred tvojím súdom.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Ujmi sa všetkých ponížených a prenasledovaných, aby mohli žiť v radosti a pokoji.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Daj, aby sme boli vždy vďační za dar viery a podľa nej aj žili.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Pomôž nám, aby sme si ochotne dokázali nájsť čas pre potreby druhých.<br>" +
                            "<font color='#B71C1C'>7.</font>&nbsp;Prijmi všetkých našich zomrelých do svojho kráľovstva.",
                    "Prosíme ťa, Pane,<br>" +
                            "vyslyš naše modlitby a daj nám silu,<br>" +
                            "aby sme ti slúžili s čistým srdcom,<br>" +
                            "a tak sa dobre pripravili<br>" +
                            "na stretnutie s tebou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"13", "3", "Bratia a sestry, dnes si môžeme uvedomiť, že Ježiš má pre toho, kto mu otvorí svoje srdce, pripravenú plnosť spásy. Prosme ho s dôverou:",
                    "<font color='#B71C1C'>(</font>Pane, buď vždy s nami.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Ježišu, žehnaj úsilie nášho pápeža <font color='#B71C1C'>M.</font> o mier a pokoj vo svete.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Povolaj mnoho dobrých pracovníkov do svojej služby.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prebuď pocit zodpovednosti v bohatých národoch, aby pamätali na ľudí žijúcich v biede a hlade.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Žehnaj prácu tých, ktorí opatrujú starých a chorých.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Priveď všetkých, ktorí pre vojnu a biedu opúšťajú svoje domovy, do bezpečia a pokoja.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Svojou láskou posilňuj všetkých misionárov, ktorí sa starajú o biednych a opustených.<br>" +
                            "<font color='#B71C1C'>7.</font>&nbsp;Pomáhaj nám všetkým k čnostnému životu, aby sme raz mali účasť na nebeskej hostine.",
                    "Pane Ježišu,<br>" +
                            "zástupy na púšti si nasýtil chlebom;<br>" +
                            "zhliadni na dnešný svet,<br>" +
                            "ktorý trpí nedostatkom pozemského chleba<br>" +
                            "i nedostatkom chleba, ktorým si ty sám,<br>" +
                            "a priveď všetkých ľudí k sebe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"14", "4", "Bratia a sestry, Pán Ježiš nás vyzýva plniť vôľu nebeského Otca tak, aby naša viera i skutky boli ako dom postavený na skale. S dôverou ho prosme:",
                    "<font color='#B71C1C'>(</font>Pane, daj nám silu plniť vôľu nebeského Otca.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Požehnaj úsilie Svätého Otca o morálnu záchranu ľudstva a pomocou jeho slova ochráň svet pred večnou skazou.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Daj nám horlivých a svätých kňazov, aby svedomito a s láskou nasledovali teba, Učiteľa a Pána, a tak všetkých viedli cestou spásy.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Veď mysle predstaviteľov verejnej správy, aby sa usilovali o rozvoj spoločného dobra.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Povolaj do svojej vinice nových robotníkov, aby prostredníctvom ich služby každý spoznal vôľu tvojho Otca.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Upevni vo vernosti všetkých zasvätených, aby nás svojím životom povzbudzovali vo viere.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Posilňuj nás, aby sme po svojich osobných pádoch dokázali vždy vstať.<br>" +
                            "<font color='#B71C1C'>7.</font>&nbsp;Udeľ našim zosnulým <font color='#B71C1C'>(M.)</font> večnú radosť v nebeskom príbytku.",
                    "Pane Ježišu,<br>" +
                            "pomáhaj nám verne plniť Otcovu vôľu na zemi,<br>" +
                            "aby sme sa s tebou<br>" +
                            "mohli raz tešiť v tvojom kráľovstve.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"15", "5", "Bratia a sestry, vidieť Boha z tváre do tváre bude vo večnosti najkrajším darom pre človeka. Prosme nášho Pána Ježiša Krista, aby nám už teraz zjavoval svoju lásku.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, Syn Dávidov, zmiluj sa nad nami.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane, pomáhaj našim biskupom, aby boli pre ľudí príkladom a povzbudením.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Daj svojej Cirkvi dobrých a prezieravých kňazov, ktorí budú správne viesť Boží ľud.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Poteš všetkých onkologicky chorých a posilňuj ich v trpezlivosti a oddanosti do Božej vôle.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Žehnaj deti a mládež <font color='#B71C1C'>(</font>našej farnosti<font color='#B71C1C'>)</font>, aby sa svojím životom pripodobňovali tebe.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Daj, aby sme raz mali účasť na nebeskej hostine v spoločenstve s preblahoslavenou Pannou Máriou, anjelmi a so všetkými svätými.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Daruj našim zosnulým <font color='#B71C1C'><font color='#B71C1C'>(</font>M.</font>, na ktorých si pri tejto svätej omši spomíname,<font color='#B71C1C'>)</font> účasť na živote v nebeskom kráľovstve.",
                    "Pane Ježišu, syn Dávidov,<br>" +
                            "svetlo nášho života,<br>" +
                            "vyslyš naše modlitby<br>" +
                            "a dopraj nám radostný pohľad<br>" +
                            "na tvoju tvár vo večnosti.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"16", "6", "Bratia a sestry, Pánu Ježišovi bolo ľúto zástupu ľudí, ktorí boli zmorení a sklesnutí ako ovce bez pastiera. Prosme ho pokorne a s dôverou o milosti, ktoré svet potrebuje.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane, požehnaj Svätého Otca <font color='#B71C1C'>M.</font> a daj mu radosť z ľudí, ktorí Božie slovo nielen počúvajú, ale podľa neho aj žijú.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Vlej pocit zodpovednosti do sŕdc učiteľov a vychovávateľov za im zverenú mládež.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Dopraj všetkým zblúdilým návrat k tvojmu milosrdenstvu.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Ujmi sa všetkých ľudí, ktorí podľahli nenávisti, alkoholu a smilstvu, a pomôž im vrátiť sa na cestu pokánia.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Odvráť od nás choroby, zažeň hlad a odstráň všetky súženia.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Zľutuj sa nad našimi zosnulými <font color='#B71C1C'>(M.)</font> a ukáž im v nebi svoju tvár.",
                    "Pane, Ježišu Kriste,<br>" +
                            "tvoje milosrdenstvo je nekonečné;<br>" +
                            "zhliadni s láskou na svoj ľud<br>" +
                            "a zbav nás Zlého.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"20", "A", "Bratia a sestry, svätý Ján Krstiteľ svojím účinkovaním pripravoval ľud na pokánie. Prosme Pána, aby všetci kresťania svojím životom ohlasovali príchod Božieho kráľovstva.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane Ježišu, daj, aby kresťania úprimne pristupovali k sviatosti pokánia, a tak sa dôkladne pripravili na tvoj príchod.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Pane Ježišu, udeľ odvahu a vytrvalosť všetkým, ktorí sa zasvätili ohlasovaniu evanjelia podľa príkladu svätého Jána Krstiteľa.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Pane Ježišu, priveď našich márnotratných bratov a sestry na cestu pokánia, aby sa vždy usilovali len o dobro.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Pane Ježišu, vzbuď v ľudských srdciach vedomie zodpovednosti za biedu blížnych, osamelých a opustených ľudí.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Pane Ježišu, daj, aby v čase vianočných sviatkov zavládol na celej zemi pokoj a mier.",
                    "Pane Ježišu, vyslyš naše prosby a daj,<br>" +
                            "aby sme láskou, príkladom a modlitbou<br>" +
                            "pomáhali našim bratom a sestrám<br>" +
                            "obrátiť sa na ceste pokánia,<br>" +
                            "a tak so živou vierou a s čistým srdcom<br>" +
                            "kráčali v ústrety nebeskému kráľovstvu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"20", "B", "Bratia a sestry, modlime sa k nebeskému Otcovi a prosme ho, aby sme vedeli, podľa príkladu Jána Krstiteľa, pripravovať v našom živote cestu Ježišovi Kristovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Za Cirkev: aby ako Ján Krstiteľ vedela ohlasovať Božie slovo, ktoré nás volá k obráteniu a k zmene života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Za všetkých, ktorým je zverená verejná služba: aby podporovali spoločné dobro a brali ohľad na každého človeka, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Za všetkých kresťanov: aby vykorenili zo svojich sŕdc pýchu a sebeckosť, a tak pripravili cestu Kristovi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Za všetkých ľudí: aby nehľadali zmysel života v pominuteľných veciach, ale v službe lásky k blížnym, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Za naše spoločenstvo: aby sme boli nástrojom Krista, ktorý všetkým prináša spásu, a posilňovali medzi sebou bratské a priateľské vzťahy, prosme Pána.",
                    "Bože, náš Otec a Pastier,<br>" +
                            "ty nechceš, aby sa niektorý z tvojich synov stratil;<br>" +
                            "vyslyš modlitby svojho ľudu<br>" +
                            "a daruj nám silu,<br>" +
                            "aby sme v tomto svete svedčili o láske tvojho Syna.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"20", "C", "Bratia a sestry, pretože Pán je blízko, pripravme mu cestu a vrúcnejšie sa modlime za spásu všetkých ľudí.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane Ježišu, zveľaďuj svoju Cirkev vodou krstu a slzami pokánia.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Udeľ odvahu a vytrvalosť všetkým hlásateľom evanjelia, ktorí ti zasvätili svoj život.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Splň túžby ľudskej rodiny po pravom pokoji a bratskej láske.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Vzbuď v srdciach veriacich pocit zodpovednosti za biedu a krivdy blížnych.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Daj, aby veriaci pochopili, že k plnej účasti na omši patrí aj účasť na svätom prijímaní.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prijmi našich zomrelých <font color='#B71C1C'>(M.)</font> do svojho nebeského kráľovstva, aby naveky hľadeli na tvoju tvár.",
                    "Pane Ježišu,<br>" +
                            "prijmi naše prosby a daj,<br>" +
                            "aby sme modlitbou, príkladom a láskou<br>" +
                            "pomáhali svojim bratom a sestrám obrátiť sa,<br>" +
                            "a tak so živou vierou a s čistým srdcom<br>" +
                            "kráčali v ústrety tebe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"21", "1", "Bratia a sestry, Kristus je radosťou všetkých, ktorí ho očakávajú. S dôverou mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane, daj, aby Cirkev bola ohlasovateľkou radostnej zvesti všetkým ľuďom.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Osvieť predstaviteľov bohatých krajín, aby bratsky pomáhali chudobným.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Napĺňaj ustráchaných a nervóznych ľudí darom svojho pokoja.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Posilňuj darom nádeje všetkých, ktorí sa obávajú staroby a smrti.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Chráň nás od akýchkoľvek predsudkov voči iným ľuďom.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Pane, daj nám odvahu a statočnosť, aby sme sa aj napriek možným nepríjemnostiam vedeli zastať ukrivdených.<br>" +
                            "<font color='#B71C1C'>7.</font>&nbsp;Priveď našich zomrelých <font color='#B71C1C'>(M.)</font> do spoločenstva svojich svätých.",
                    "Kráľ pokoja,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomôž svojmu ľudu,<br>" +
                            "ktorý sa zhromaždil na slávenie Eucharistie,<br>" +
                            "aby chválil tvoje veľké diela.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"22", "2", "Bratia a sestry, očakávame príchod Pána, ktorý je zdrojom pokoja, nádeje a spásy. Prosme ho, aby vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane Ježišu, sprevádzaj nášho pápeža <font color='#B71C1C'>M.</font> a nášho biskupa <font color='#B71C1C'>M.</font> svojimi milosťami, aby viedli sebe zverený ľud po ceste spásy.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Zmiluj sa nad národmi sužovanými vojnou, aby v nich zavládol pravý pokoj.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Odpusť všetkým kajúcnikom ich hriechy a zlyhania a priveď ich na cestu pravej viery.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Posielaj dobrých pastierov k tým, ktorí nevidia zmysel svojho života.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Pomáhaj sirotám, vdovám a opusteným niesť kríže svojho života, aby takto posväcovali seba i ostatných.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Pane Ježišu, ovlaž rosou svojho milosrdenstva duše zosnulých <font color='#B71C1C'>(M.)</font> a dovoľ im uvidieť svetlo tvojej tváre.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše prosby,<br>" +
                            "aby sme boli verní svojmu povolaniu<br>" +
                            "a boli pripravení na tvoj príchod,<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"23", "3", "Bratia a sestry, Boh je naozaj dobrý a milosrdný Otec, istá nádej pre každého, kto je unavený a utláčaný. Prosme ho plní dôvery.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Všemohúci Otče, moc tvojej lásky nepozná hraníc; požehnávaj všetky národy, aby žili v bezpečí a pravom pokoji.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Milosrdný Otče, ty si svätý Boh; pomáhaj utrápeným a prepracovaným ľuďom, aby v tebe našli pokoj a útechu.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Dobrotivý Otče, tvoja moc a sila sú nesmierne; posilňuj misionárov a tých, ktorí šíria tvoje kráľovstvo medzi ľuďmi, aby mali dostatok sily a lásky.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Láskavý Otče, pri druhom príchode svojho Syna zjavíš na vyvolených svoju slávu; teraz ukáž na hriešnikoch svoju dobrotu a milosrdenstvo.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Všemohúci Otče, ty si náš Stvoriteľ a Pán; daj nám silu ukázať všetkým ľuďom príklad obetavej služby a lásky.",
                    "Pane a Bože náš,<br>" +
                            "prednášame ti svoje prosby,<br>" +
                            "lebo dúfame v tvoju pomoc<br>" +
                            "a plnosť radosti<br>" +
                            "z príchodu tvojho Syna Ježiša Krista,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"24", "4", "Bratia a sestry, túžobne očakávame príchod nášho Pána Ježiša a úpenlivo sa dovolávame jeho milosrdenstva. Kedysi on sám prišiel na svet ohlasovať radostnú zvesť chudobným a uzdravovať skrúšených srdcom. Prosme ho, aby aj v našich časoch poskytol spásu všetkým ľuďom.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Milosrdný Ježišu, daj, aby kresťania žili na tomto svete nábožne a triezvo, a tak očakávali splnenie blaženej nádeje a tvoj príchod v sláve.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Pane, spravodlivý Sudca, posilni predstaviteľov našej verejnej správy, aby sa vždy usilovali o spoločné dobro.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Ježišu, tichý a pokorný Srdcom, vyhas v každej duši plameň pýchy a nenávisti, aby si v nej mohol prebývať ako vo svojom chráme.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Pane, Svätý Izraela, požehnávaj služobníkov svojho oltára, aby sa pripodobňovali tebe a viedli ľudí k spáse.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Ježišu, Dobrý pastier, vzbuď v mladých ľuďoch túžbu úplne sa ti zasvätiť, aby svojím životom svedčili o tvojej dobrote a láske.",
                    "Pane Ježišu, vypočuj naše prosby a daj,<br>" +
                            "aby sme sa všetci pripravili na tvoj príchod<br>" +
                            "a mohli obdivovať tvoju slávu,<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"25", "5", "Bratia a sestry, s dôverou očakávame druhý príchod Pána a pripravujeme mu cestu. Preto sa modlime a prosme ho, aby prišiel k všetkým ľuďom dobrej vôle a obdaril nás vykúpením.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane Ježišu, proroci oddávna predpovedali, že sa narodíš ako človek; posilňuj nás, aby sme rástli v čnosti viery.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Ježišu, kto nasleduje teba, bude mať svetlo života; posilňuj našu vôľu, aby sme plnili tvoje príkazy, a tak kráčali cestou života v tvojom svetle.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Pane Ježišu, tvoja láska je nekonečná; pomáhaj nám, aby sme nezabúdali na potreby hladujúcich, chudobných a núdznych.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Ježišu, teba proroci nazvali kniežaťom pokoja; napĺňaj všetky rodiny svojou láskou a pokojom, aby tak žili v šťastí a radosti.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Pane Ježišu, prvý raz si prišiel vykúpiť svet; keď prídeš druhý raz, nezavrhni tých, ktorí veria v teba.",
                    "Pane, ty neodmietaš nikoho,<br>" +
                            "kto sa k tebe utieka<br>" +
                            "a s dôverou ťa prosí;<br>" +
                            "vyslyš naše pokorné prosby<br>" +
                            "a naplň našu túžbu po tvojej blízkosti.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"26", "6", "Bratia a sestry, spolu s Pannou Máriou a jej ženíchom svätým Jozefom, očakávame sviatky narodenia Božieho Syna. Prednesme mu svoje prosby s vedomím, že iba od neho prichádza pomoc.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Ježišu, ty si prišiel, no vlastní ťa nespoznali; pomáhaj nám, aby sme v každom núdznom, chudobnom a chorom človeku spoznali teba a poskytli mu primeranú pomoc.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Pane, ty si pred sebou poslal Jána Krstiteľa, aby ti pripravil cestu; daj, nech hlas adventných kazateľov pohne naše srdcia, aby sme sa prehĺbili v láske.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Tvoje slovo je svetlo pre naše nohy a pochodeň na našich chodníkoch; pomôž nám denným čítaním Svätého písma hľadať a spoznávať tvoju vôľu.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Svoju matku Máriu si nám dal za príklad trpezlivosti a dôvery v teba; na jej príhovor nás posilňuj v boji s našimi slabosťami.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Sľúbil si, že opäť prídeš; poteš nás, ktorí túžobne očakávame tvoj príchod, účasťou na svojom božskom živote.",
                    "Pane, ty si mocný Vykupiteľ;<br>" +
                            "vypočuj naše pokorné prosby<br>" +
                            "a premeň svojou mocou naše srdcia,<br>" +
                            "aby sme sa stali ľuďmi viery, pokory a lásky.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"30", "A", "Bratia a sestry, pretože Pán je už blízko, modlime sa ešte vrúcnejšie za spásu všetkých ľudí.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, Syn živého Boha, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane Ježišu, daj, aby Cirkev smelo ohlasovala tvoj budúci príchod, a tak utvrdzovala ľudí v konaní dobra.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Pane Ježišu, posilňuj všetkých pokrstených, aby pred týmto svetom pravdivo svedčili o tebe.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Pane Ježišu, daj, nech predstavitelia štátov dokážu rozoznať, čo slúži dobru, ktoré je potrebné konať na ceste do večnosti.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Pane Ježišu, pomôž mladým ľuďom získať dobré vzdelanie a robiť tento svet lepším.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Pane Ježišu, veď nás, aby sme pri svojich rozhovoroch a rozhodnutiach pamätali na večnosť.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Pane Ježišu, prosíme ťa, otvor našim zosnulým <font color='#B71C1C'>(M.)</font> dvere do Otcovho náručia.",
                    "Pane Ježišu, Syn Panny Márie,<br>" +
                            "ty si náš Boh a Pán, náš Vykupiteľ a Spasiteľ;<br>" +
                            "vypočuj naše prosby,<br>" +
                            "príď k nám a zachráň nás.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"30", "B", "Bratia a sestry, prosme Pána, ktorý je blízko, aby naše srdcia pretváral radosťou a nádejou z očakávania jeho príchodu.",
                    "<font color='#B71C1C'>(</font>Volajme: Príď, Pane Ježišu.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Modlime sa za Cirkev, aby vedela vnášať Kristovu radostnú zvesť do hodnôt, tradícií a spoločenstiev všetkých ľudí sveta.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Modlime sa za vedcov, politikov a umelcov, aby spájali svoje úsilie pri budovaní novej civilizácie postavenej na Kristovi.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Modlime sa za chorých, trpiacich a tých, ktorí sú bez nádeje, aby v sile Kristovho príchodu objavili svoju hodnotu a poslanie pre dnešný svet.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Modlime sa za nás samých, aby sme vydávali svedectvo o svetle, ktoré sme prijali vo sviatosti krstu.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Modlime sa za zosnulých <font color='#B71C1C'>(M.)</font>, ktorí s dôverou očakávali príchod Pána, aby uvideli jas a svetlo Božieho Baránka.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby a daj,<br>" +
                            "aby sme si čoraz lepšie uvedomovali,<br>" +
                            "že chceš byť stále prítomný uprostred nás.<br>" +
                            "Ty žiješ a kraľuješ na veky vekov."},
            {"30", "C", "Bratia a sestry, svätý apoštol Pavol hovorí, aby sme vo všetkom modlitbou, prosbou a so vzdávaním vďaky prednášali svoje žiadosti Bohu. Prosme nášho nebeského Otca, aby vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Otče náš, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Otče, obnov Kristovu nevestu Cirkev ohňom Ducha Svätého, aby všetkým prinášala nádej a spásu.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Udeľ svoj pokoj našim bratom a sestrám, ktorí sú prenasledovaní pre vieru, a posilni ich vo vernosti tebe.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Otče, chráň predstaviteľov štátov od korupcie a ziskuchtivosti a daj, aby vždy konali spravodlivo a múdro.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Daj pracovníkom médií odvahu šíriť lásku a porozumenie.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Otče, osloboď úzkostlivých ľudí od ťaživého bremena pochybností a prílišných starostí.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Daj, aby sme pre hmotné starosti nezabúdali na duchovnú prípravu Vianoc.",
                    "Nebeský Otče,<br>" +
                            "prijmi naše prosby,<br>" +
                            "daruj nám svoj pokoj a chráň nás,<br>" +
                            "aby sme sa nemuseli obávať nijakého nešťastia,<br>" +
                            "a tak sa mohli tešiť a radovať z celého srdca.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "1", "Bratia a sestry, Boh Otec nám vo svojej dobrote dáva milosť pripraviť sa na príchod nášho Pána Ježiša Krista. Preto ho s dôverou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, daj nám svoju spásu.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Otče, ty si cez prorokov ukazoval na nehasnúce Svetlo; prosíme ťa za Cirkev, aby zjavovala tvoju tvár ľuďom našej i budúcej generácie.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Otče, tvoj Syn ohlasoval Božie kráľovstvo; daj, aby nik zo svetských predstaviteľov nekládol prekážky hlásateľom evanjelia.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Otče, tvoj Syn nasýtil hladné zástupy; daj, nech vo svete nerozhodujú záujmy ekonomiky, ale životné potreby všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Otče, tvoj Syn učil ľudí citlivosti na to, čo je Božie; daj, aby sme v našej farnosti evanjelizovali tých, ktorí ho ešte nepoznajú.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Otče, tvoj Syn ukázal svetu tvoju lásku k nám; daj zomierajúcim útechu a zosnulým spásu.",
                    "Dobrotivý Otče,<br>" +
                            "prosíme ťa,<br>" +
                            "láskavo vyslyš naše volanie<br>" +
                            "a príchodom svojho Syna<br>" +
                            "odstráň temnoty z našich sŕdc,<br>" +
                            "lebo on s tebou žije a kraľuje na veky vekov."},
            {"32", "2", "Bratia a sestry, keď túžobne očakávame oslavu narodenia nášho Pána Ježiša Krista, pozdvihnime svoje srdcia k Bohu a s dôverou sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Aby všetci kresťania v nasledujúcich dňoch prehĺbili svoju osobnú modlitbu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Aby sa národy celého sveta usilovali o mierové riešenie svojich sporov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Aby ľudia v duševnom trápení našli Boží pokoj, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Aby naša mládež napĺňala svoj život pravými hodnotami, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Aby sme odpustenie a pokoj vždy úprimne hľadali vo sviatosti zmierenia, prosme Pána.",
                    "Bože, naše útočisko a sila,<br>" +
                            "z tvojho vnuknutia pochádza každá pravá modlitba;<br>" +
                            "vypočuj prosby svojej Cirkvi a daj,<br>" +
                            "aby sme dosiahli všetko,<br>" +
                            "o čo ťa s dôverou prosíme.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"33", "3", "Bratia a sestry, vrúcne vzývajme Ježiša Krista, nášho Spasiteľa, veď on je naša cesta, pravda a život.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Ježišu, na tebe spočinul Duch Pána; daj, aby Duch Svätý viedol tvoju Cirkev k obnove a svätosti.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Ježišu, koreň Jesseho, ty si pre národy znamením; daj, aby ťa našli a prijali všetci, ktorí nepoznajú zmysel a cieľ svojho života.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Ježišu, ty nechceš, aby zahynul čo len jediný z tvojich maličkých; chráň deti pred pohoršením.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Ježišu, ty si naša nádej; daj všetkým utrápeným pocítiť moc tvojho blížiaceho sa kráľovstva.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Ježišu, ty si zaplesal v Duchu Svätom; daj, aby sme sa aj my vedeli tešiť z duchovných hodnôt.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Ježišu, ty prídeš súdiť živých i mŕtvych; pridruž našich zosnulých <font color='#B71C1C'>(M.)</font> k zástupom blažených.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a príď k nám s hojnou milosťou,<br>" +
                            "aby sme skrze teba mohli prísť k Otcovi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"34", "4", "Bratia a sestry, spoločne prosme Boha, ktorý všetkým národom sľúbil vykúpenie.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Za biskupov a kňazov: aby s radosťou pripravovali cestu Ježišovi Kristovi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Za všetkých ľudí: aby v spoločnosti svedomito plnili svoje úlohy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Za neveriacich: aby vždy zostávali otvorení hlasu svojho svedomia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Za opustených a odmietaných: aby stretli milujúcich ľudí ochotných pomôcť im, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Za každého z nás: aby sme sa nebáli Božích nárokov a vytrvalo sa usilovali o svoj duchovný rast, prosme Pána.",
                    "Pane a Bože náš, daj,<br>" +
                            "nech je naša modlitba vrúcna,<br>" +
                            "aby stúpala k tvojmu trónu<br>" +
                            "a priviedla nás k poznaniu veľkého tajomstva<br>" +
                            "vtelenia tvojho Syna,<br>" +
                            "ktorý s tebou žije a kraľuje na veky vekov."},
            {"35", "5", "Bratia a sestry, obráťme svoj zrak k Pánovi, očakávajme Boha, svojho Spasiteľa, a so živou vierou a čistým srdcom sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, daj nám svoju spásu.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Modlime sa za Svätého Otca <font color='#B71C1C'>M.</font>, biskupov a kňazov, aby starostlivo pripravovali Pánovi dokonalý ľud.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Modlime sa za všetky národy, nech ich osvieti Božie svetlo a naplní jeho slovo, aby kráčali v ústrety Kristovi.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Modlime sa za organizácie, ktoré sa usilujú o rozvoj chudobných krajín, aby nezištne nachádzali správne prostriedky pre svoju službu.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Modlime sa za tých, ktorí sú v temnotách, aby im Spasiteľ svojím príchodom vlial do sŕdc nové svetlo a upriamil ich na cestu pokoja.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Modlime sa za nás všetkých, aby sme mali ducha pokánia a s radosťou sa pripravili na slávnosť Pánovho narodenia.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Modlime sa za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby boli očistení od každého hriechu a mali podiel na večnom dedičstve v nebeskom kráľovstve.",
                    "Bože, darca a základ našej spásy,<br>" +
                            "vyslyš naše vrúcne prosby<br>" +
                            "a vytrhni nás z moci hriechu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"40", "A", "Bratia a sestry, pokorne prosme Krista Pána, ktorý sa narodil z Panny Márie, a radostne volajme:",
                    "<font color='#B71C1C'>(</font>Príď, Pane Ježišu.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane Ježišu, priprav všetok svoj ľud a jeho pastierov na dôstojnú oslavu tvojho narodenia.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Priveď vyvolený národ, z ktorého pochádzaš, k poznaniu, že ty si prisľúbený Mesiáš.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Naplň dôverou v Božiu pomoc matky očakávajúce narodenie svojho dieťaťa.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Poteš novým potomstvom všetkých manželov, ktorí túžia po dieťati.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Príď, Pane, aby sme mali život a aby sme ho mali v hojnosti.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Urob z nás poslov tvojej blahozvesti, aby sme ako Panna Mária vnášali do rodín lásku k tebe a k blížnym.<br>" +
                            "<font color='#B71C1C'>7.</font>&nbsp;Požehnaj naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme tento svätý čas prežívali v tvojej milosti.",
                    "Pane Ježišu, očakávaný Emanuel,<br>" +
                            "navštív svoj ľud a obdaruj nás svojimi milosťami,<br>" +
                            "aby sme v každodenných potrebách<br>" +
                            "cítili tvoju pomoc<br>" +
                            "a raz ťa mohli velebiť v nebi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"40", "B", "Bratia a sestry, obráťme sa s pokornými prosbami na Krista, Vykupiteľa, ktorý prišiel spasiť ľudí, a s dôverou volajme:",
                    "<font color='#B71C1C'>(</font>Príď, Pane Ježišu.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane Ježišu, pripravuj Cirkev na svoj príchod a upevňuj ju v blaženej nádeji.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Duchom Svätým naplň nášho pápeža <font color='#B71C1C'>M.</font>, aby s nadšením ohlasoval svetu tvoju radostnú novinu.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Veď národy, ktoré sa boria s vážnymi ekonomickými a spoločenskými ťažkosťami, k východisku, ktoré je založené na Božom zákone a poriadku.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Zbúraj múr nenávisti, ktorý rozdeľuje národy, a urovnaj ľuďom cestu k svornosti.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Vzbuď novú nádej v srdciach tých, čo stratili dôveru v teba i v ľudí.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Pomáhaj snúbencom, aby sa dobre pripravili na spoločný život v manželstve.<br>" +
                            "<font color='#B71C1C'>7.</font>&nbsp;Napĺňaj láskou naše srdcia, aby sme spríjemnili nastávajúce sviatky všetkým opusteným a biednym.",
                    "Pane Ježišu, vyslyš naše prosby<br>" +
                            "a pomáhaj nám nasledovať tvoju panenskú Matku,<br>" +
                            "aby sme s čistým srdcom a s radosťou<br>" +
                            "mohli očakávať slávny deň tvojho narodenia.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"40", "C", "Bratia a sestry, obráťme sa v tejto spoločnej modlitbe k tomu, ktorého očakávali otcovia a ktorého Panna Mária v nevýslovnej láske nosila pod srdcom.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Aby všetky národy spoznali jediného a pravého Boha, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Aby sviatky Narodenia Pána prehĺbili vzájomnú lásku v kresťanských rodinách, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Aby na našej zemi prebývala spravodlivosť a pokoj, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Aby sme ako Panna Mária prinášali svetu radosť a lásku, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Aby všetci obyvatelia nášho mesta <font color='#B71C1C'>(</font>našej obce<font color='#B71C1C'>)</font>, povzbudení naším príkladom, spoznali Kristovu lásku a pokoj, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Aby naši zosnulí <font color='#B71C1C'>(M.)</font> mohli v nebi uvidieť toho, ktorého na zemi poznávali vierou, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "tvoj príchod je už blízko;<br>" +
                            "daj, aby sme prichádzajúce sviatky tvojho narodenia<br>" +
                            "prežívali v radosti z darov,<br>" +
                            "ktoré nám neustále udeľuješ.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
    };
}
