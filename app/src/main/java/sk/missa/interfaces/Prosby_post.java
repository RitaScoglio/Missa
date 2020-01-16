package sk.missa.interfaces;

/*
 * Prosby v pôstnom období uložené v dvojrozmernom poli - postProsby
 * nedeľa: {týždeň v pôstnom období+deň (napr. 2 týždeň v pondelok - 21), liturgický rok (A/B/C), názov spoločnej časti, úvodná výzva, odpoveď ľudu, úmysly, záverečná modlitba},
 * deň v týždni: {týždeň v pôstnom období+deň, deň v týždni (1-pondelok, 2-utorok..., 6-sobota), názov spoločnej časti, úvodná výzva, odpoveď ľudu, úmysly, záverečná modlitba},
 * */

public interface Prosby_post {
    String[][] postProsby = {
            {"03", "3", "Bratia a sestry, na začiatku štyridsaťdňového Pôstneho obdobia vrúcne sa modlime k milosrdnému Bohu Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, obnov nás a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Dobrý a milosrdný Bože, daj svojej Cirkvi milosť obnovy života zvlášť v tomto pôstnom čase, aby skutkami milosrdenstva svedčila o tvojej veľkej láske.<br>" +
                            "<font color='#B71C1C'>2.</font> Dobrý a milosrdný Bože, obdaruj duchovnou a morálnou silou tých, ktorí žijú len pre materiálne veci, a daj im milosť obrátenia, aby dokázali žiť v tvojej prítomnosti a láske.<br>" +
                            "<font color='#B71C1C'>3.</font> Dobrý a milosrdný Bože, zhliadni na bezdomovcov, opustených a chudobných a obdaruj ich praktickou pomocou zo strany blížnych.<br>" +
                            "<font color='#B71C1C'>4.</font> Dobrý a milosrdný Bože, zošli svojho Ducha všetkým, ktorí pristupujú k sviatosti zmierenia, aby sa, preniknutí ľútosťou nad hriechmi, vyliečili zo svojich slabostí.<br>" +
                            "<font color='#B71C1C'>5.</font> Dobrý a milosrdný Bože, daj nám svoju milosť v začínajúcom svätom čase pôstu, vzbuď v nás ducha vnútornej obnovy a návratu k tebe.",
                    "Milosrdný Bože,<br>" +
                            "ty si vždy pripravený vypočuť nás,<br>" +
                            "keď k tebe voláme s pokorou a dôverou;<br>" +
                            "zmiluj sa nad nami a vyslyš naše prosby.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"04", "4", "Bratia a sestry, prednesme všemohúcemu Bohu svoje osobné prosby i prosby celého ľudstva a volajme:",
                    "<font color='#B71C1C'>(</font>Pane, zmiluj sa nad nami a vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za svätosť a vytrvalosť v hlásaní dobrej zvesti pre Kristovu Cirkev.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za národy, ktoré trápia vojnové konflikty, aby ľudia, ktorí sa navzájom nenávidia, počuli vo svojom svedomí Boží hlas a zmierili sa.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých, ktorí žijú v ťažkých hriechoch, aby toto Pôstne obdobie bolo pre nich príležitosťou zmieriť sa s Bohom.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za kňazov vysluhujúcich sviatosť zmierenia, aby ich ustavične sprevádzalo a osvecovalo svetlo Ducha Svätého.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za seba samých, aby čas pokánia a návratu k Bohu priniesol konkrétne zmeny v našom živote.",
                    "Pane, náš Bože,<br>" +
                            "veríme, že vyslyšíš naše prosby;<br>" +
                            "z celého srdca ti za to ďakujeme.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"05", "5", "Bratia a sestry, ak budeme hľadať dobro, Boh bude s nami. Prosme ho, aby vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosíme ťa, Bože, za svätú Cirkev, aby jej deti počúvali tvoj hlas a podľa neho žili.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa, Bože, za tých, ktorí riadia spoločnosť, aby nikomu neprekážali vo vyznávaní a prežívaní kresťanského náboženstva.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa, Bože, za ľudí, ktorí v teba neveria, aby vďaka dobrému svedectvu nás kresťanov našli cestu k tebe – najlepšiemu Otcovi.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa, Bože, za tých, ktorí sa postia, aby sa nielen zriekali pokrmu, ale aby tým, čo ušetria, pomáhali blížnym v ich núdzi.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa, Bože, za nás samých, aby sme nepremárnili čas na obrátenie, ale odpovedali na výzvy na premenu života.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosíme ťa, Bože, za <font color='#B71C1C'>(</font>zosnulých <font color='#B71C1C'>M.</font> a<font color='#B71C1C'>)</font> našich blízkych zosnulých, aby mohli hľadieť na tvoju tvár.",
                    "Bože, ty nám cez pôst, modlitbu a almužnu<br>" +
                            "ukazuješ cestu nápravy a chceš,<br>" +
                            "aby sme konali skutky milosrdnej lásky;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj nám viesť život hodný tvojich detí.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"06", "6", "Bratia a sestry, Boh preniká naše srdcia a pozná túžby každého človeka, preto mu prednesme svoje prosby:",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Kristovu Cirkev: aby bola viditeľným znakom jednoty, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za Svätého Otca: aby s vierou, láskou i radosťou hlásal Božie slovo, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za pokoj vo svete: aby sa ukončili všetky vojny a zavládol vytúžený mier, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za tých, ktorí sú povolaní kráčať za Kristom: aby ochotne prijali toto vzácne pozvanie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za seba samých: aby toto Pôstne obdobie bolo pre nás príležitosťou na návrat a obrátenie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby dosiahli večnú radosť, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "ty svojím Duchom obnovuješ všetko;<br>" +
                            "obnov aj nás v tomto čase milosti<br>" +
                            "a láskavo vyslyš naše prosby.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "A", "Bratia a sestry, naplnil sa čas a priblížilo sa Božie kráľovstvo. S vierou prednesme svoje prosby dobrému Bohu.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, zmiluj sa nad nami a vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za svätú Cirkev, aby verne plnila poslanie, ktoré jej bolo zverené.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za biskupov a kňazov, aby im nástrahy sveta neprekážali na ceste k Pánovi.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za pôstnych kazateľov, aby ich ohlasovanie bolo plné moci Ducha Svätého a ich slovo schopné osloviť a pohnúť ľudí k dobru.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za ľudí žijúcich v hriechu, aby sviatosť zmierenia bola pre nich cestou k Bohu.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za seba samých, aby sme otvorili svoje srdcia Pánovmu slovu.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za zosnulých z našich rodín, aby sa radovali zo spoločenstva s Kristom.",
                    "Bože, vypočuj naše prosby,<br>" +
                            "daj nám poznať svoje cesty<br>" +
                            "a sprevádzaj nás v pravde<br>" +
                            "podľa svojich svätých prikázaní.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "B", "Bratia a sestry, vstúpili sme do obdobia štyridsaťdňového pôstu. Katechumeni sa pripravujú na krst, veriaci si zase pripomínajú svoj krst a konajú pokánie. Prosme Pána, aby sme sa v tomto čase milosti dôstojne pripravili na slávenie veľkonočného tajomstva.",
                    "<font color='#B71C1C'>(</font>Volajme: Obnov nás, Pane, a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za kresťanov na celom svete, aby vždy zachovávali prikázanie lásky.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za synov izraelského národa, aby žili podľa Božieho zákona, ktorý prijali.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých, ktorí sa usilujú o pokoj, aby sa tešili z ovocia svojej námahy.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za tých, ktorí sa blížia k bráne smrti, aby sa dobre pripravili na stretnutie s Pánom.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás samých, aby sme dobrom premáhali každé zlo.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za <font color='#B71C1C'>(</font>zosnulých <font color='#B71C1C'>M.</font> a<font color='#B71C1C'>)</font> všetkých, ktorí zomreli v Kristovi, aby ich Boh prijal k sebe.",
                    "Pane, Bože náš,<br>" +
                            "vyslyš naše prosby,<br>" +
                            "udeľ nám všetky potrebné dary a daj,<br>" +
                            "aby sa naše konanie zhodovalo s tvojimi prikázaniami.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "C", "Bratia a sestry, evanjelium nám dnes ukazuje púšť ako miesto pokánia a stretnutia s Bohom. Aj my ochotne konajme pokánie, predložme svoje prosby nebeskému Otcovi a nábožne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, daj, aby služba kňazov bola oslavou teba a posvätením tvojho ľudu.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby sa veriaci Cirkvi pôstom posväcovali a posilňovali vo svojej viere.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, aby každý človek mohol žiť v slobode a v hmotnom zabezpečení.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj svoje požehnanie všetkým, ktorí sa starajú o chudobných a chorých.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj nám tu prítomným ochotu zmeniť svoje myslenie a konanie.<br>" +
                            "<font color='#B71C1C'>6.</font> Daj našim zosnulým <font color='#B71C1C'>(M.)</font> radosť tvojho domova.",
                    "Bože, človeka si stvoril ako dokonalé dielo;<br>" +
                            "skrze hriech stratil tvoje priateľstvo,<br>" +
                            "no ty si ho neponechal bez pomoci,<br>" +
                            "ale poslal si svojho Syna, aby nás zachránil.<br>" +
                            "Prijmi naše prosby a daj,<br>" +
                            "aby sme zo svojho života<br>" +
                            "dokázali odstraňovať všetko zlo.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "1", "Bratia a sestry, Pán Ježiš nás vyzýva konať skutky milosrdnej lásky, a tak posväcovať svoj život a zjavovať jeho lásku vo svete. Obráťme sa na neho so svojimi prosbami.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za biskupov a kňazov, aby boli viditeľnými znakmi Kristovej prítomnosti vo svete.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za hladujúcich ľudí, aby našli pomocnú ruku, ktorá im podá potrebný pokrm.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za odsúdených a väznených, aby nestrácali nádej v konečné víťazstvo dobra, ktoré zmení ich život.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za postihnutých ľudí, aby v kríži, ktorý nesú, našli Božiu vôľu a prostriedok spásy.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za seba samých, aby sme vďaka sviatostnému životu viery dosiahli večnú spásu.",
                    "Pane Ježišu,<br>" +
                            "ty si na začiatku svojho verejného účinkovania<br>" +
                            "odišiel na púšť a postil si sa;<br>" +
                            "ukázal si nám silu modlitby a pôstu;<br>" +
                            "vypočuj naše prosby,<br>" +
                            "posilni nás v našich slabostiach<br>" +
                            "a požehnaj pôstne úsilie každého človeka.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"12", "2", "Bratia a sestry, Boh ukazuje svoje milosrdenstvo všetkým, ktorí sa naňho obracajú úprimne. Kristom povzbudení k modlitbe prednesme teraz svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za svätú Cirkev, aby bola pre všetky národy viditeľným znamením vykúpenia ľudstva.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za tých, ktorí riadia spoločnosť, aby vždy rešpektovali náboženské cítenie občanov.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých, ktorí ešte nekonajú pokánie, aby sa obrátili a s čistým srdcom očakávali Kristovo konečné víťazstvo.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za chorých, trpiacich a všetkých, ktorí bojujú s pokušeniami, aby nestrácali silu, odvahu a nádej.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za seba samých, aby sme v našich blížnych, ktorí potrebujú pomoc, videli Krista.",
                    "Chválime ťa, dobrý Bože,<br>" +
                            "ktorý nám dovoľuješ volať ťa naším Otcom,<br>" +
                            "a vzdávame ti vďaky, že prijímaš naše prosby.<br>" +
                            "Príď tvoje kráľovstvo teraz i na veky vekov."},
            {"13", "3", "Bratia a sestry, Boh sa zmiloval nad obyvateľmi Ninive, lebo s ľútosťou volali k nemu a robili pokánie. Veríme, že aj nám preukáže svoje milosrdenstvo, keď pred ním skrúšene stojíme a prosíme.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože Otče, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za tých, ktorí hlásajú Božie slovo, aby ho svojím životom premieňali na skutky.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za politikov a štátnikov, aby hľadali vždy také riešenia, ktoré budú na prospech všetkých národov.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za všetkých, ktorí nepristupujú k sviatosti zmierenia a Eucharistie, aby odpovedali na láskavé pozvanie Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za mládež, aby jej príťažlivosť sveta nebola prekážkou v túžbe poznávať Krista.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za zosnulých <font color='#B71C1C'>(M.)</font>, aby za vytrvalú dôveru v Pána dosiahli účasť na nebeskej hostine.",
                    "Dobrý Otče,<br>" +
                            "vyslyš naše prosby, ktoré ti predkladáme,<br>" +
                            "splň naše skryté túžby,<br>" +
                            "ktoré poznáš len ty sám,<br>" +
                            "a príď nám na pomoc v našej slabosti.<br>" +
                            "O to ťa prosíme skrze Krista, nášho Pána."},
            {"14", "4", "Bratia a sestry, Pán nás vyzýva: Proste a dostanete, a uisťuje nás, že naše prosby vyslyší. Preto sa s dôverou modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za svätú Cirkev, aby vytrvalo hlásala evanjelium a privádzala ľudí k živej viere.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za Svätého Otca <font color='#B71C1C'>M.</font>, aby jeho apoštolské úsilie prispelo k trvalému pokoju vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za našu vlasť, aby sa všetky napätia a nedorozumenia vyriešili v láske a pravde.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za všetky deti, aby im bolo dovolené narodiť sa v usporiadaných rodinách a nájsť v nich milujúcich otcov a mamy.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za seba samých, aby sme sa účasťou na najsvätejšej obete pripravili na stretnutie s Kristom.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za zosnulých z našej farnosti <font color='#B71C1C'>(</font>z nášho spoločenstva<font color='#B71C1C'>)</font>, aby im Boh preukázal svoje milosrdenstvo.",
                    "Ježišu, ty poznáš naše srdcia i naše slabosti;<br>" +
                            "vypočuj modlitby svojho ľudu<br>" +
                            "a tvoja milosť nech posilní našu vieru.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"15", "5", "Bratia a sestry, buďme vnímaví na Božie volanie, otvorme svoje srdcia pre modlitbu a spoločne volajme:",
                    "Prosíme ťa, Pane.",
                    "<font color='#B71C1C'>1.</font> Za svätosť Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Za zdravie Svätého Otca.<br>" +
                            "<font color='#B71C1C'>3.</font> Za chlieb pre hladných.<br>" +
                            "<font color='#B71C1C'>4.</font> Za domov pre bezdomovcov.<br>" +
                            "<font color='#B71C1C'>5.</font> Za pokoj vo svete.<br>" +
                            "<font color='#B71C1C'>6.</font> Za lásku v rodinách.<br>" +
                            "<font color='#B71C1C'>7.</font> Za zdravie pre chorých.<br>" +
                            "<font color='#B71C1C'>8.</font> Za radosť pre ponorených v smútku.<br>" +
                            "9. Za hlboké prežitie Pôstneho obdobia pre našu farnosť <font color='#B71C1C'>(</font>naše spoločenstvo<font color='#B71C1C'>)</font>.",
                    "Ježišu, ty si náš Pán;<br>" +
                            "prosíme, vyslyš naše prosby,<br>" +
                            "ktoré ti s dôverou predkladáme.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"16", "6", "Bratia a sestry, vzdávajme chválu nášmu Spasiteľovi, ktorý nám dal Pannu Máriu za Matku, a prednesme mu svoje prosby plné dôvery:",
                    "<font color='#B71C1C'>(</font>Volajme: Mária, Ježišova Matka, oroduj za nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, žehnaj biskupov a kňazov i všetkých, ktorí sa ti celkom zasvätili svätými sľubmi.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, daruj pokoj našej vlasti i všetkým ľuďom na svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Náš Spasiteľ, tvoja prebolestná Matka stála pod krížom; prosíme ťa, poteš všetkých, ktorí pociťujú žiaľ a smútok.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, daj, nech si každý z nás váži čisté srdce viac ako pomíňajúce sa hodnoty života.<br>" +
                            "<font color='#B71C1C'>5.</font> Všemohúci Kráľ, daj nám silu, aby sme napĺňali tvoj príkaz lásky aj voči svojim nepriateľom.<br>" +
                            "<font color='#B71C1C'>6.</font> Ježišu, daj nám milosť, aby sme statočne zachovávali Božie prikázania.",
                    "Pane Ježišu,<br>" +
                            "tvoja milosť nepozná hraníc;<br>" +
                            "vypočuj naše prosby,<br>" +
                            "zostaň s nami<br>" +
                            "a obdaruj nás svojím požehnaním.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"20", "A", "Bratia a sestry, Boh nám vo svojej dobrote dáva osobitný čas, aby sme sa podujali na pôstne úsilie premeny srdca. Predložme mu svoje pokorné prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, udeľ nám svoju milosť.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za dar zdravia a síl pre Svätého Otca <font color='#B71C1C'>M.</font> v službe Božiemu ľudu, aby s vytrvalosťou hlásal pravé Kristovo učenie.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za všetkých ľudí, aby ich zasiahlo ovocie Kristovej vykupiteľskej lásky, ohlasované prostredníctvom Cirkvi.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za chorých, aby pochopili a prijali svoj kríž utrpenia.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za bohatých ľudí, aby boli solidárni s chudobnými, ktorí potrebujú pomoc.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za duchovnú premenu a obrátenie, aby sme čo najlepšie prežívali tajomstvo zmŕtvychvstania.",
                    "Bože, tvoj Syn Ježiš Kristus<br>" +
                            "priniesol ľudstvu nový život v duchu a pravde;<br>" +
                            "daj, nech tento život v nás neustále rastie<br>" +
                            "a my žijeme ako noví ľudia.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "B", "Bratia a sestry, aj my môžeme byť k Ježišovi tak blízko, ako boli Peter, Jakub a Ján. Otvorme svoje srdcia a s dôverou volajme k nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože Otče, požehnaj Kristovu Cirkev a daj, aby čím lepšie prežila toto Pôstne obdobie.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože Otče, daj všetkým duchovným pastierom ducha radosti v plnení každodennej služby.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože Otče, posilni prenasledovaných kresťanov a obdaruj ich slobodou vo vyznávaní viery.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože Otče, riaď srdcia a úmysly katechumenov, ktorí sa pripravujú na sviatosť krstu, aby dobre využívali čas prípravy.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože Otče, posilňuj v dobrých predsavzatiach a skutkoch všetky ženy a dievčatá a daj, aby ich súčasný svet primerane ohodnotil.<br>" +
                            "<font color='#B71C1C'>6.</font> Bože Otče, udeľ nám potrebné duchovné dary a daj, aby sme v prostredí, v ktorom žijeme, boli odvážnymi svedkami evanjelia.",
                    "Nebeský Otče,<br>" +
                            "prijmi naše pokorné prosby<br>" +
                            "a vlož do našich sŕdc túžbu po tvojom milosrdenstve;<br>" +
                            "daj, nech my sami dokážeme byť milosrdní<br>" +
                            "k svojim bratom a sestrám,<br>" +
                            "a tak chváliť teba, nášho Boha.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "C", "Bratia a sestry, Ježišovo premenenie na vrchu Tábor nám poodhaľuje slávu, ktorú má on, Boží Syn, od večnosti u svojho Otca a ktorú raz máme prežívať aj my. V radosti z tejto nádeje prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, ochraňuj svoju Cirkev pred nástrahami diabla.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, daj všetkým biskupom svojho Ducha, aby boli dobrými duchovnými pastiermi.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, daj, aby bol kríž pre každého veriaceho zdrojom sily a znakom spásy.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, daj mocným tohto sveta schopnosť vidieť aj potreby tých najchudobnejších.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, daj, aby sme vždy boli verní sľubom, ktoré sme dali tebe a ľuďom.<br>" +
                            "<font color='#B71C1C'>6.</font> Ježišu, daj, aby sme žili v nádeji, že aj my raz budeme prežívať tvoju slávu.",
                    "Ježišu Kriste, verný služobník Otca,<br>" +
                            "svojím príchodom naprávaš to,<br>" +
                            "čo človek pokazil hriechom;<br>" +
                            "prijmi naše prosby a buď s nami,<br>" +
                            "keď sa usilujeme o vnútornú obnovu života.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"21", "1", "Bratia a sestry, zídení na spoločnej modlitbe vrúcne prednesme svoje prosby nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za pápeža <font color='#B71C1C'>M.</font>, aby mu Duch Svätý pomáhal v hlásaní Kristovho vykúpenia všetkým národom.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za všetkých ľudí, aby v Kristovi našli skutočný zmysel života.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za učiteľov a vychovávateľov, aby boli pre svojich žiakov vzorom viery a lásky k ľuďom.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za mladomanželov, aby rástli vo viere a láske.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za seba samých, aby sme zo slávenia Eucharistie čerpali silu na plnenie každodenných povinností.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za zosnulých <font color='#B71C1C'>(M.)</font>, aby mali vo večnom živote účasť na nebeskej sláve.",
                    "Bože, u teba nachádzame milosť a pomoc,<br>" +
                            "kedykoľvek ju potrebujeme;<br>" +
                            "aj teraz v pokore očakávame splnenie svojich prosieb.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "2", "Bratia a sestry, spoločne prosme nášho Boha, aby všetci ľudia prijali milosť, ktorú nám jeho Syn Ježiš Kristus získal svojou smrťou na kríži.",
                    "<font color='#B71C1C'>(</font>Volajme: Ukáž nám, Pane, svoje milosrdenstvo.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za svätú Cirkev v našej vlasti i na celom svete, aby mohla plniť svoje poslanie v pokoji a bez prekážok.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za pôstnych kazateľov a spovedníkov, aby trpezlivo povzbudzovali svojich bratov a sestry vo viere.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za umelcov, aby preniknutí krásou umenia vedeli ju predstaviť iným, a tak poukazovali na Boha, ktorý je žriedlom všetkej krásy i dobra.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za politikov, aby sa pri rozhodovaní riadili morálnymi zásadami, ktoré vychádzajú z Božieho zákona.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za seba samých, aby sme počuté Božie slovo prijali do svojho srdca a podľa neho žili.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme za zosnulých <font color='#B71C1C'>(M.)</font>, aby boli vďaka vykúpeniu a zavŕšeniu života v smrti a zmŕtvychvstaní Krista pripočítaní k spaseným.",
                    "Bože, nebeský Otče, vypočuj prosby svojej Cirkvi<br>" +
                            "a daj, nech je pre nás toto Pôstne obdobie<br>" +
                            "časom hľadania spravodlivosti,<br>" +
                            "rozvíjania čností<br>" +
                            "a prijímania milosti, o ktorú ťa vrúcne prosíme.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "3", "Bratia a sestry, večný Boh udeľuje pokorným svoju milosť, hriešnikom ponúka cestu pokánia a verných požehnáva. Prosme ho aj my o ochranu nad nami a nad celou Cirkvou.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby prenasledovaní pre vieru verili vo vykupiteľskú hodnotu svojho utrpenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby nadriadení nevyužívali podriadených, ale mali k nim úctu a riadili sa duchom spravodlivosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby sa ľudia, ktorí konajú zlo, vrátili z nesprávnej cesty, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby chorí dopĺňali na svojom tele utrpenie Krista pre dobro jeho tela, ktorým je Cirkev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme sa my sami nikdy neodplácali zlým za zlé, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Aby zosnulí <font color='#B71C1C'>(M.)</font> dosiahli miesto pripravené pre nich v nebi, prosme Pána.",
                    "Bože, prijmi naše prosby,<br>" +
                            "osvieť nás svojou milosťou,<br>" +
                            "aby sme duchovne dozreli<br>" +
                            "a videli tvoju dobrotu voči ľuďom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"24", "4", "Bratia a sestry, s vierou, že Ježiš je Spasiteľom sveta, prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby verne hlásala evanjelium všetkým národom sveta.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za spovedníkov, aby trpezlivo vysluhovali sviatosť zmierenia a stávali sa dokonalými nástrojmi Božej lásky.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za ľudí oplývajúcich materiálnymi dobrami, aby sa neodvracali od tých, ktorí trpia núdzou.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za zločincov, aby mali ducha pokánia a vedeli zadosťučiniť za zlo a neprávosť, ktoré spáchali.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás samých, aby sme sa modlitbou, pôstom a almužnou dobre pripravili na slávenie veľkonočných sviatkov.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za <font color='#B71C1C'>(</font>zosnulých <font color='#B71C1C'>M.</font> a<font color='#B71C1C'>)</font> našich zosnulých priateľov a príbuzných, aby ich Boh prijal k sebe do neba.",
                    "Pane Ježišu, ty si naša nádej;<br>" +
                            "prosíme ťa, prijmi našu vrúcnu modlitbu<br>" +
                            "a pomôž nám dôstojne oslavovať<br>" +
                            "tvoju smrť a zmŕtvychvstanie.<br>" +
                            "Ty žiješ a kraľuješ na veky vekov."},
            {"25", "5", "Bratia a sestry, ako Boží ľud novej zmluvy prednesme svoju modlitbu pred Boží trón.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby duchovní pastieri i veriaci Cirkvi odvážne bránili hodnotu ľudského života od chvíle počatia až po prirodzenú smrť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby pokrstení ľudia, ktorí sa odvrátili od náuky Cirkvi, zistili, že sú na zlej ceste, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby viacčlenné rodiny nášho národa mali zabezpečené dôstojné podmienky existencie a rozvoja, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby umierajúci odchádzali z tohto sveta posilnení sviatosťami a obklopení láskou a prítomnosťou svojich najbližších, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naše eucharistické spoločenstvo verne kráčalo cestou evanjelia, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "slovami nedokážeme vyjadriť vďačnosť,<br>" +
                            "ktorá napĺňa naše srdcia;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a buď od nás vždy chválený<br>" +
                            "teraz i po všetky veky vekov."},
            {"26", "6", "Bratia a sestry, Boh nám dáva čas, aby sme sa konaním pokánia vrátili k nemu. S dôverou v jeho milosrdenstvo sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev: aby sa láskou, príkladom a modlitbou pričinila o obrátenie a návrat hriešnikov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za tých, ktorí nežijú vo sviatostnom manželstve: aby nestrácali lásku k Cirkvi, ktorá je aj ich matkou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za tých, ktorí podľahli závislosti: aby spoznali, že svojím spôsobom života škodia sebe i svojim blížnym, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás samých: aby nám nebol ľahostajný osud tých, ktorí sa vzdialili od Boha, a aby sme im trpezlivo pomáhali obetou a modlitbou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za <font color='#B71C1C'>(</font>zosnulého <font color='#B71C1C'>M.</font> a všetkých<font color='#B71C1C'>)</font> našich blízkych zosnulých: aby im Boh odpustil hriechy, ktorých sa dopustili z ľudskej krehkosti, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "ty nám dávaš čas milosti a vykúpenia,<br>" +
                            "aby sme ťa mohli lepšie poznať a milovať;<br>" +
                            "zhliadni na nás a vyslyš naše prosby.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "A", "Bratia a sestry, Pán Ježiš si pýtal vodu od Samaritánky, aby mohol utíšiť jej smäd po viere a jej srdce zapáliť ohňom lásky. Prosme ho aj my o duchovné dary nielen pre seba, ale aj pre celý svet.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, Kráľu, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby hlásala ukrižovaného Krista, ktorý je Božou mocou a múdrosťou.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za kresťanov, aby verne zachovávali Božie prikázania.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za ľudí, ktorí úprimne hľadajú Boha, aby ich ten, ktorý pozná ľudské srdce, pritiahol k sebe.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za hriešnikov, aby si vedeli usporiadať svoj vzťah s Bohom a s Cirkvou.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás tu prítomných, aby sme očistili svoje srdcia od zlých náklonností a vrátili sa na cestu, ktorú nám ukazuje Pán Ježiš.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za zosnulých, <font color='#B71C1C'>(</font>zvlášť za zosnulého <font color='#B71C1C'>M.<font color='#B71C1C'>)</font>, aby sa v nebeskom kráľovstve tešili z večnej blaženosti.",
                    "Pane Ježišu, Kráľ všetkých sŕdc,<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "aby sme všetkým, s ktorými sa stretneme,<br>" +
                            "prinášali tvoju lásku a milosrdenstvo.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"30", "B", "Bratia a sestry, keď dnes počúvame o očistení chrámu, uvedomme si, že Pán Ježiš myslí na nás a vyzýva aj nás na očistenie chrámu našich sŕdc. Spoločne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, buduj z nás, živých kameňov, svoj duchovný chrám a bývaj s nami i v nás.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby všetci ľudia dbali na Boží zákon vpísaný do srdca každého človeka.<br>" +
                            "<font color='#B71C1C'>3.</font> Žehnaj všetkých budovateľov chrámov i tých, ktorí sa starajú o krásu a dôstojnosť tvojho príbytku.<br>" +
                            "<font color='#B71C1C'>4.</font> Nauč nás vážiť si telo ako chrám Ducha Svätého.<br>" +
                            "<font color='#B71C1C'>5.</font> Pripomeň tým, ktorí pracujú v nedeľu, že tento deň je zasvätený tebe.<br>" +
                            "<font color='#B71C1C'>6.</font> Odstráň náš zlozvyk postávať pri bráne kostola a pohŕdať svätými tajomstvami, ktoré sa slávia na oltári.",
                    "Pane Ježišu,<br>" +
                            "obnov nás a vyslyš naše prosby,<br>" +
                            "aby sme pre účasť<br>" +
                            "na svätých tajomstvách tvojho umučenia<br>" +
                            "mali podiel na tvojom zmŕtvychvstaní a sláve.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"30", "C", "Bratia a sestry, je čas pokánia, a preto sa máme vrúcnejšie modliť za svoju spásu i za spásu našich blížnych.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby biskupi a kňazi pri kajúcich pobožnostiach a vo sviatosti pokánia viedli ľudí k opravdivému obráteniu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby svet netrápili prírodné pohromy a aby sa z ľudskej rodiny stratilo násilie a nenávisť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby sa obrátili tí, ktorí už dlhé roky neboli na veľkonočnej spovedi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme sa neprehrešili opovážlivým spoliehaním na Božie milosrdenstvo, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme láskou, modlitbou a príkladom pomáhali pri obrátení našich bratov a sestier, prosme Pána.",
                    "Pane Ježišu, vypočuj naše prosby<br>" +
                            "a naplň nás duchom kajúcnosti,<br>" +
                            "aby sme zvýrazňovali tvoje víťazstvo nad hriechom<br>" +
                            "a svoj život vždy viac pripodobňovali tvojmu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"31", "1", "Bratia a sestry, Boh v Kristovi zmieril svet so sebou; pokorne prosme Pána za spásu celého sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane Ježišu, pomôž svojmu ľudu.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj, aby tvoja Cirkev nehľadala uznanie tohto sveta, ale ochotne plnila tvoju vôľu.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomôž bezdomovcom, daj pokrm hladným a potrebné živobytie chudobným.<br>" +
                            "<font color='#B71C1C'>3.</font> Pomáhaj všetkým, ktorí sa pripravujú na prijatie sviatosti krstu.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj, aby tvoji kňazi každodenne žili z rozjímania nad tvojím slovom.<br>" +
                            "<font color='#B71C1C'>5.</font> Ukáž správnu cestu a svetlo bezradným.<br>" +
                            "<font color='#B71C1C'>6.</font> Daj radosť večného života našim zosnulým <font color='#B71C1C'>(M.)</font>.",
                    "Pane Ježišu,<br>" +
                            "ty sa staráš o každého z nás;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a zostaň s nami<br>" +
                            "teraz i na veky vekov."},
            {"32", "2", "Bratia a sestry, Ježiš Kristus sa stal naším učiteľom, bratom i vzorom. Spoločne ho chváľme a volajme s dôverou.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Kriste, náš život, pomôž všetkým kresťanom, aby žili podľa evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, osvieť predstaviteľov štátov, aby vynikali starostlivosťou o spoločné dobro.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, daj, aby ťa čoraz viac mladých ľudí ochotne a opravdivo nasledovalo.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, daj, aby sme boli vždy pripravení odpustiť tým, ktorí nám ublížili.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, ochraňuj týrané a zneužívané deti a daj im všetko, čo nedostali od svojich rodičov.<br>" +
                            "<font color='#B71C1C'>6.</font> Dobrý pastier, daj našim zosnulým <font color='#B71C1C'>(M.)</font> milosť tešiť sa z tvojej slávy v nebi.",
                    "Milosrdný Pane,<br>" +
                            "pamätaj na nás<br>" +
                            "a sprevádzaj nás v pravde<br>" +
                            "podľa tvojich príkazov.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"33", "3", "Bratia a sestry, veríme, že Ježiš je prítomný uprostred nás. Modlime sa k nemu.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za svätú Cirkev: aby verne plnila svoje poslanie hlásať evanjelium Ježiša Krista, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za Svätého Otca <font color='#B71C1C'>M.</font>: aby súčasnému svetu odkrýval múdrosť Božích prikázaní, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za tých, ktorí riadia spoločnosť: aby pri vykonávaní svojho úradu uznávali prvenstvo Božieho zákona pred zákonmi ľudskými, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za kňazov: aby učili iných plniť Božie a cirkevné prikázania a aj sami ich verne plnili, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás samých: aby sme svoju vieru nielen vyznávali, ale ju aj dosvedčovali skutkami, prosme Pána.",
                    "Pane Ježišu, ty si dal príkazy,<br>" +
                            "aby sa verne plnili;<br>" +
                            "nauč nás pridržiavať sa tvojho zákona,<br>" +
                            "aby sme dosiahli spásu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"34", "4", "Bratia a sestry, všemohúci Boh, zdroj života a radosti, vstupuje do našich sŕdc a svojou milosťou upevňuje naše spoločenstvo. Prosme ho spoločne.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za kresťanov, aby sa prekonávaním napätia a nedorozumenia zjednotili v pravej viere.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za milosť zmierenia pre rozhádané rodiny, aby v nich zavládol pravý pokoj.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za vytrvalosť v dobrom pre ľudí, ktorí sú vystavení silným pokušeniam, aby im nepodľahli.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za seba samých, aby sme sa v každodennom živote nechali viesť svetlom Ducha Svätého.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za večnú spásu pre <font color='#B71C1C'>(</font>zosnulého <font color='#B71C1C'>M.</font> a<font color='#B71C1C'>)</font> všetkých, ktorí už odišli z tohto sveta, aby našli odpustenie a pokoj.",
                    "Bože, obdaruj svoju Cirkev jednotou a pokojom;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme ti neustále slúžili<br>" +
                            "a rástli vo svätosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"35", "5", "Bratia a sestry, Kristus zomrel za všetky naše hriechy a svojou krvou nás vykúpil. Modlime sa k nemu.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za svätú Cirkev: aby bola skutočným znamením Božej lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za bohatšie národy: aby mali záujem konkrétne pomáhať národom žijúcim v núdzi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za hriešnikov: aby sa ľútosťou a pokáním vrátili k Bohu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za manželov: aby žili v láske a trpezlivosti, v pokoji a vo vernosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás samých: aby sme mali trpezlivosť s nedostatkami iných a usilovali sa im pomôcť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby im Boh odpustil hriechy, prosme Pána.",
                    "Pane, zhliadni na naše modlitby<br>" +
                            "a sprevádzaj nás cestou svojich prikázaní.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"36", "6", "Bratia a sestry, Boh sa pyšným protiví, ale pokorným dáva svoju milosť. Modlime sa so skrúšeným srdcom a vrúcne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých kresťanov: aby žili podľa evanjelia, a tak svedčili o Bohu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za tých, ktorí žijú vo vedomí, že sú spravodliví a nemajú žiaden hriech: aby neurážali Boha pýchou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých, ktorí sa usilujú plniť svoje pôstne predsavzatia: aby v nich vytrvali, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za tých, ktorí sú dlhodobo chorí: aby nestrácali vieru a nádej a pocítili úľavu v bolesti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za <font color='#B71C1C'>(</font>zosnulého <font color='#B71C1C'>M.</font> a<font color='#B71C1C'>)</font> všetkých verných zosnulých: aby dosiahli večnú odmenu v spoločenstve svätých, prosme Pána.",
                    "Bože Otče,<br>" +
                            "prijmi naše prosby a daj,<br>" +
                            "aby sme ťa nikdy neprestávali chváliť<br>" +
                            "a ďakovať ti za veľké dielo vykúpenia a spásy,<br>" +
                            "ktoré si zavŕšil vo svojom Synovi Ježišovi Kristovi,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"40", "A", "Bratia a sestry, veríme v jednorodeného Božieho Syna, ktorý prišiel na svet, aby ľudia mali život v hojnosti. Prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za veriacich, aby láskou a modlitbami napomáhali obrátenie hriešnikov.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za chorých, aby svoje utrpenie spájali s utrpením Krista na kríži.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za katechumenov, aby sa horlivo pripravovali na prijatie sviatostí.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za obete prírodných katastrof, aby zažili solidaritu svojich bratov a sestier.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás tu prítomných, aby sme sa starali aj o spásu svojich blízkych.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za zosnulých <font color='#B71C1C'>(M.)</font>, aby boli prijatí medzi zástupy vyvolených v nebi.",
                    "Pane Ježišu Kriste, náš Vykupiteľ,<br>" +
                            "pokorne ti predkladáme svoje prosby;<br>" +
                            "vypočuj ich a daruj nám všetko,<br>" +
                            "čo potrebujeme pre život.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"40", "B", "Bratia a sestry, Boh je nekonečne milosrdný a láskavo odpúšťa kajúcim hriešnikom. Preto sa s dôverou obráťme k nemu ako k milosrdnému Otcovi a prosme ho.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za svätú Cirkev, aby ohlasovala Kristovo evanjelium všetkým ľuďom a národom.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za pokrstených ľudí, ktorí sú ľahostajní vo viere a ďaleko od Cirkvi, aby si pripomenuli pravdu o veľkej hodnosti Božích detí.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za katechumenov, aby po celý život vytrvali vo viere a plnili svoje krstné sľuby.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za seba samých, aby sme sa dobre pripravili na veľkonočnú svätú spoveď.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za zosnulých <font color='#B71C1C'>(M.)</font>, aby mali účasť na Kristovom zmŕtvychvstaní.",
                    "Bože, ďakujeme ti za tvoju nesmiernu lásku,<br>" +
                            "ktorú nám prejavuješ vo svojom Synovi;<br>" +
                            "odprosujeme ťa za všetky svoje viny a prosíme:<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "nech nás nič neodlúči od tvojho Syna Ježiša Krista,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"40", "C", "Bratia a sestry, v tejto spoločnej modlitbe prosme nebeského Otca za všetkých márnotratných synov a dcéry, aby sa vrátili do Otcovho domu, do plného spoločenstva Kristových učeníkov.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za kresťanov, aby dokázali svet premieňať láskou.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za Cirkev, aby bola matkou všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za hriešnikov, ktorých trápi svedomie, aby uverili, že Boh je láska.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za ľudí žijúcich v hneve a nenávisti, aby si vedeli nielen podať ruky, ale aj zo srdca odpustiť.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za seba samých, aby sme prinášali tomuto svetu radosť, ktorá pramení z blízkosti vykúpenia.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za zosnulých <font color='#B71C1C'>(M.)</font>, aby im Boh odpustil hriechy a prijal ich do svojej slávy.",
                    "Bože Otče, vyslyš naše prosby<br>" +
                            "a daj, aby sme si uvedomili,<br>" +
                            "že vo sviatosti zmierenia sa stretávame<br>" +
                            "s naším milosrdným Spasiteľom,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"41", "1", "Bratia a sestry, Bohu záleží na každom človeku. Všetkých chce obdarovať svojím požehnaním. Preto sa k nemu modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za svätú Cirkev: aby rástla v jednote, láske a pokoji, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za národy zasiahnuté vojnou: aby v nich zavládol spravodlivý mier a pokoj, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za tých, ktorí prijímajú sviatosť zmierenia ako prípravu na veľkonočné sviatky: aby sa obnovili duchom i zmýšľaním, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za tých, ktorí žijú v otroctve hriechu: aby dostali milosť uvedomiť si svoje nesprávne konanie a zbavili sa všetkých zlých návykov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás samých: aby sme vedeli odpúšťať svojim vinníkom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby im Boh odpustil všetky hriechy, prosme Pána.",
                    "Bože, milosrdný Otče,<br>" +
                            "ty si poslal na svet svojho Syna, aby nás vykúpil;<br>" +
                            "prijmi tieto naše prosby<br>" +
                            "a daj nám v tomto svätom čase<br>" +
                            "hojnú milosť na obnovu života.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"42", "2", "Bratia a sestry, Boh je naším ochrancom a pomocou v ťažkostiach života. S dôverou mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby všetci kresťania tvorili jedno duchovné spoločenstvo, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby katechumeni, ktorí majú prijať krst, znovuzrodení z vody a z Ducha Svätého vždy kráčali v novosti života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby tí, ktorí pracujú v zdravotníctve, čo najobetavejšie slúžili chorým a prinášali im úľavu v utrpení, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme v školách, na pracoviskách a všade tam, kde žijeme, dokázali svedčiť o Bohu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zosnulí <font color='#B71C1C'>(M.)</font> mohli vidieť Boha z tváre do tváre, prosme Pána.",
                    "Všemohúci a milosrdný Otče,<br>" +
                            "láskavo nás vyslyš<br>" +
                            "a daj, aby sme preniknutí náukou tvojho Syna<br>" +
                            "vždy podľa nej usmerňovali aj svoj život,<br>" +
                            "a tak dosiahli vykúpenie.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"43", "3", "Bratia a sestry, v tomto pôstnom čase prosme Boha o jeho zmilovanie a modlime sa k nemu.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za svätú Cirkev: aby vedela pozorne vnímať znamenia čias, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za tých, ktorí odvrhli Boha zo svojho života: aby sa stretli s jeho milosrdnou láskou a vrátili sa do domu dobrého Otca, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za utečencov: aby sa mohli vrátiť do svojej vlasti a do svojich domovov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za ľudí, ktorí sú na pokraji síl: aby pocítili Božiu i ľudskú pomoc, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu prítomných: aby sme sa ničím nedali odradiť od služby Bohu a blížnym, prosme Pána.",
                    "Milosrdný Bože,<br>" +
                            "vypočuj nás, keď ťa s dôverou prosíme;<br>" +
                            "zmiluj sa nad nami<br>" +
                            "a posilňuj nás svojou milosťou,<br>" +
                            "aby sme sa usilovali o svätosť života.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"44", "4", "Bratia a sestry, Mojžiš prosil za svoj ľud. Preto aj my s dôverou prosme za Cirkev i za celý svet.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za svätú Cirkev, aby súčasnému svetu ukazovala Božiu dobrotu.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za všetkých, ktorí trpia na tele i na duši, aby pocítili Božiu milosť a lásku.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za hriešnikov, aby cez skrúšenosť srdca a úprimnosť pokánia začali nový život.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za mládež, aby hľadala pravé životné hodnoty.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za učiteľov teológie a katechétov, aby boli zapálení láskou k pravde a žiarili čnostným životom.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby v sile sviatostného pokrmu, ktorý prijímali, prišli do nebeskej slávy.",
                    "Pane Bože,<br>" +
                            "ty si vyslyšal modlitbu Mojžiša;<br>" +
                            "vyslyš aj nás, ktorí ťa prosíme<br>" +
                            "v mene tvojho milovaného Syna.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"45", "5", "Bratia a sestry, skrze Krista, trpiaceho služobníka a nášho Pána, prednesme svoje prosby nebeskému Otcovi, ktorý je blízko pri tých, čo majú čisté a pokorné srdce.",
                    "<font color='#B71C1C'>(</font>Volajme: Maj milosrdenstvo s nami i s celým svetom.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, daj, aby služobníci Cirkvi milosrdne a s láskou vysluhovali sviatosť zmierenia.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, daj, aby si všetci ľudia i všetky národy navzájom odpustili krivdy a priateľsky sa zmierili.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, daj, aby schopnejší ľudia nepohŕdali menej schopnými, ale vychádzali im v ústrety.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, daj, aby rodičia mali v starobe oporu vo svojich deťoch.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, daj, aby sa nevyliečiteľne chorí dobre pripravili na chvíľu smrti a stretnutia s tebou.<br>" +
                            "<font color='#B71C1C'>6.</font> Bože, daj, aby sme čo najlepšie využívali čas pôstu a nasmerovali svoje srdcia k tebe.",
                    "Bože, Otec nášho Spasiteľa Ježiša Krista,<br>" +
                            "vyslyš prosby vyjadrujúce našu vieru a dôveru;<br>" +
                            "vieme, že ťa svojimi hriechmi zraňujeme,<br>" +
                            "ale zmiluj sa nad nami<br>" +
                            "a raz nás pripočítaj k zástupu vyvolených.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"46", "6", "Bratia a sestry, Boh nikdy neodmieta pomoc tým, ktorí ho prosia. Prednesme mu svoje pokorné prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za duchovných pastierov: aby s láskou a odvahou upozorňovali na chyby svojich veriacich, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za ľudí všetkých národov: aby dokázali správne formovaným svedomím rozlišovať dobro a zlo, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za prenasledovaných vo viere: aby dúfali v Božiu spravodlivosť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za tých, ktorých trápia výčitky svedomia: aby našli pokoj pre svoju dušu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za spovedníkov: aby sa vyznačovali múdrosťou, horlivosťou a trpezlivosťou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby v dome Otca našli príbytok, pripravený pre nich od stvorenia sveta, prosme Pána.",
                    "Tebe, Bože, zverujeme naše prosby a starosti;<br>" +
                            "dovoľ nám radovať sa z tvojho pokoja<br>" +
                            "a vždy plniť tvoju vôľu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"50", "A", "Bratia a sestry, Pán Ježiš, ktorý vzkriesil Lazára, svojím Duchom vzkriesi aj nás. Pokorne a s vierou ho prosme za svoju spásu 0i za spásu celého sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Obnov nás, Pane, a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, daj, aby tvoja Cirkev bola vždy verná tomu, čo si jej zveril.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, daj biskupom a kňazom múdrosť, keď povzbudzujú ľud k obráteniu.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, daj každému človekovi milosť zakúsiť moc tvojho milosrdenstva.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, daj, aby bol krst pre všetkých katechumenov bránou k večnej spáse.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, daj všetkým, ktorí sú postihnutí prírodnou katastrofou, svoju ochranu a záštitu a pošli im ľudí, ktorí im pomôžu svojou blízkosťou.<br>" +
                            "<font color='#B71C1C'>6.</font> Ježišu, daj nám tu prítomným odvahu prinášať obetu a niesť svoj kríž.",
                    "Pane Ježišu,<br>" +
                            "veríme, že si Kristus, Boží Syn,<br>" +
                            "naše vzkriesenie a život;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj nám trvalú účasť na tvojom živote.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"50", "B", "Bratia a sestry, Ježiš Kristus je darcom večnej spásy pre všetkých, ktorí ho nasledujú. Modlime sa, aby sa s ním vo veľkonočných tajomstvách stretli všetci členovia Cirkvi a aby v ňom spoznali pôvodcu večnej spásy.",
                    "<font color='#B71C1C'>(</font>Volajme: Vykupiteľ, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Veľkňaz novej zmluvy, posilňuj nášho biskupa <font color='#B71C1C'>M.</font>, aby sa horlivo staral o Boží ľud našej diecézy.<br>" +
                            "<font color='#B71C1C'>2.</font> Náš Pán a Učiteľ, udeľ bohaté duchovné dary deťom, ktoré sa pripravujú na prijatie sviatosti zmierenia a prvého svätého prijímania.<br>" +
                            "<font color='#B71C1C'>3.</font> Kráľ národov, príď so svojou pomocou k hladujúcim, chorým, bezdomovcom i k tým ľuďom, ktorí sú znechutení dobou a spoločnosťou.<br>" +
                            "<font color='#B71C1C'>4.</font> Božský Vykupiteľ, zhliadni na farnosti, v ktorých sa konajú duchovné obnovy a misie, aby sa obnovili a prehĺbili vo viere, nádeji a láske.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, náš život a vzkriesenie, otvor brány raja zosnulým členom našich rodín.",
                    "Pane Ježišu, náš Pán a Kráľ,<br>" +
                            "ty sám si nám ukázal,<br>" +
                            "čo musí predchádzať nášmu víťazstvu;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj nám vytrvalosť na životnej ceste<br>" +
                            "a silu vždy znovu sa rozhodovať pre teba, nášho Pána.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"50", "C", "Bratia a sestry, oslavujme milosrdenstvo Boha, ktorý nás osvecuje milosťou Ducha Potešiteľa, aby sme žili vo viere a spravodlivosti. Modlime sa s dôverou.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, posilňuj biskupov, kňazov a diakonov, aby v sebe roznecovali milosť, ktorú prijali pri vysviacke vkladaním rúk.<br>" +
                            "<font color='#B71C1C'>2.</font> Nauč kresťanov často pristupovať k sviatostiam, aby v nich rástla viera a túžba po svätosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, aby všetci úradníci konali vždy spravodlivo a nezištne.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, daj, aby sa aj počas tohto Pôstneho obdobia čím viacerí zriekli závislosti od alkoholu.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj, aby sme si vážili hodnotu a slobodu svedomia každého človeka.<br>" +
                            "<font color='#B71C1C'>6.</font> Zmiluj sa nad svojimi vernými zosnulými <font color='#B71C1C'>(M.)</font>, ktorých si pozval do večnosti, a voveď ich do svojej slávy.",
                    "Bože, milosrdný Otče,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a naplň nás pokorou,<br>" +
                            "aby sme láskou a modlitbou napomáhali<br>" +
                            "obrátenie svojich bratov a sestier.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"51", "1", "Bratia a sestry, Boh posilňuje tých, ktorí vkladajú do neho svoju nádej. Prednesme mu svoje pokorné prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za spovedníkov, aby boli milosrdnými vysluhovateľmi sviatosti zmierenia.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za mužov a ženy, ktorí nemôžu prijať sviatostné manželstvo, aby sa necítili odlúčení od spoločenstva veriacich a Cirkvi.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za hriešnikov, aby uverili, že aj ich Boh miluje.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za tých, ktorí robia pokánie, aby im Boh preukázal svoje milosrdenstvo.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás tu prítomných, aby z našich úst nevychádzali nespravodlivé výroky o iných ľuďoch.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za zosnulých <font color='#B71C1C'>(M.)</font>, aby sa v nebeskej sláve stretli so svojím Vykupiteľom.",
                    "Nekonečný Bože,<br>" +
                            "pred tebou niet nijakej tajnosti<br>" +
                            "a vo svojej prozreteľnosti vieš všetko, čo sa stane;<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a daj nám viesť tichý a pokorný život.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"52", "2", "Bratia a sestry, Boh sa neodvracia od ľudí, ktorí volajú k nemu o pomoc. S dôverou sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetok kresťanský ľud, aby sa v tomto posvätnom čase častejšie živil slovom, ktoré vychádza z Božích úst, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za hriešnikov, aby našli cestu návratu ku Kristovi, ktorý za nich zomrel na kríži, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za tých, ktorým prekáža znamenie kríža, aby neurážali cítenie veriacich ľudí, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za chorých, aby ochotne prijali utrpenie svojho života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás samých, aby sme vždy robili len to, čo sa páči Bohu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>, aby ich milosrdný Boh prijal k sebe, prosme Pána.",
                    "Bože, veríme, že si láskavý a milosrdný;<br>" +
                            "prijmi prosby svojej Cirkvi,<br>" +
                            "zhliadni na nás hriešnych a slabých<br>" +
                            "a daj nám v kríži svojho Syna<br>" +
                            "objaviť silu pravého kresťanského života.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"53", "3", "Bratia a sestry, Pán Ježiš neprišiel, aby ho obsluhovali, ale aby sám slúžil a dal svoj život ako výkupné za všetkých ľudí. Preto ho s dôverou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Svätého Otca <font color='#B71C1C'>M.</font>: aby s neochvejnou vierou hlásal svetu pravdu, ktorá vyslobodzuje, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých kresťanov: aby vydávali dobré svedectvo svojho života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za tých, ktorí páchajú zlo: aby sa v tomto čase milosti vrátili k Bohu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás samých: aby sme vytrvali v nasledovaní Krista a boli jeho opravdivými učeníkmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby im Boh odpustil hriechy, ktorých sa dopustili z ľudskej krehkosti, a prijal ich k sebe do neba, prosme Pána.",
                    "Ježišu, ty zdroj pravdy a milosrdenstva,<br>" +
                            "pomôž svojmu ľudu<br>" +
                            "obrátiť sa k tebe celým srdcom<br>" +
                            "a vo svojom milosrdenstve mu udeľ to,<br>" +
                            "o čo sa odvažuje prosiť úprimnou modlitbou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"54", "4", "Bratia a sestry, Kristus je naším učiteľom a bratom. Preto mu s vierou prednesme svoje modlitby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za pápeža <font color='#B71C1C'>M.</font>: aby bol viditeľným základom jednoty viery, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za predstaviteľov štátu: aby dokázali svojmu ľudu zabezpečiť hmotné i duchovné blaho, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za katechumenov, ktorí sa pripravujú na prijatie veľkonočných sviatostí: aby sám Boh v nich dokončil dobré dielo, ktoré začal, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás tu prítomných: aby sme boli verní Božím prikázaniam, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby mali účasť na večnom šťastí, ktoré Boh pripravil svojim verným, prosme Pána.",
                    "Pane Ježišu, vyslyš naše prosby<br>" +
                            "a upevni našu vieru,<br>" +
                            "aby sme s odvahou kráčali<br>" +
                            "po kráľovskej ceste kríža.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"55", "5", "Bratia a sestry, odovzdajme Bohu svoj život so všetkým, čo ho napĺňa, a prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za kresťanov, aby svet, vďaka ich svedectvu, uveril v Božieho Syna.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za všetkých, ktorí konajú dielo milosrdnej lásky, aby našli ochotných nasledovníkov.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za spovedníkov, aby mali radosť z každého hriešnika, ktorý sa zmieruje s Bohom.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za prenasledovaných, aby neprestali dôverovať v Božiu spravodlivosť.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za seba samých, aby sme sa dobre pripravili na veľkonočné sviatky.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za zosnulých <font color='#B71C1C'>(M.)</font>, aby mohli v nebi z tváre do tváre vidieť toho, ktorého na zemi poznali prostredníctvom viery.",
                    "Bože, zmiluj sa nad nami,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a napĺňaj naše srdcia vierou a láskou,<br>" +
                            "aby sme cez kríž a umučenie tvojho Syna<br>" +
                            "dosiahli spásu.<br>" +
                            "Lebo on s tebou žije a kraľuje na veky vekov."},
            {"56", "6", "Bratia a sestry, Boh nás chráni ako pastier svoje stádo. Obráťme sa naňho v spoločnej modlitbe.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za rozdelených kresťanov: aby sa zjednotili vo vyznávaní tej istej viery, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých ľudí dobrej vôle: aby poznali všemohúceho Boha, zjaveného v Ježišovi Kristovi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za národy, ktoré trápia vojnové konflikty: aby brat nezabíjal brata, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za ľudí bez domova: aby čím skôr našli nový domov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu prítomných: aby sme všetkým trpiacim a umierajúcim prejavili milosrdnú lásku, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby mohli hľadieť na Božiu tvár, prosme Pána.",
                    "Pane, zmiluj sa nad Cirkvou,<br>" +
                            "ktorá sa vrúcne modlí,<br>" +
                            "a láskavo zhliadni na srdcia oddané tebe;<br>" +
                            "nikdy nenechaj bez pomoci tých,<br>" +
                            "ktorým dávaš účasť na svojom tajomstve.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"60", "A", "Bratia a sestry, keď Pán Ježiš slávne vchádzal do Jeruzalema, zástupy ho vítali ako Kráľa a Mesiáša. Poďme mu aj my v ústrety so svojimi prosbami.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, prosíme ťa za celý Boží ľud, nech využije všetky dary a milosti, ktoré mu ponúkneš v tomto Svätom týždni.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za trpiacich ľudí všetkých národov, aby prijali ovocie tvojho kríža a dokázali z neho naplno žiť.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa aj za hriešnikov, aby dostali silu odmietať zlo vo svojom živote a nastúpiť na cestu pokánia.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby prežívanie obradov tohto Svätého týždňa prehĺbilo vieru každého z nás.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, prosíme ťa za zosnulých <font color='#B71C1C'>(M.)</font>, aby si ich uviedol do slávy a plnosti života vo svojom kráľovstve.",
                    "Pane Ježišu, náš Kráľ,<br>" +
                            "posilňuj nás svojím utrpením,<br>" +
                            "aby sme ti vzdávali chválu celým svojím životom<br>" +
                            "a raz ťa mohli oslavovať v tvojom večnom kráľovstve,<br>" +
                            "kde žiješ a kraľuješ na veky vekov."},
            {"60", "B", "Bratia a sestry, prednesme svoje prosby dobrému Bohu, ktorý uzavrel s ľuďmi novú zmluvu utrpením a smrťou svojho Syna.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, zmiluj sa nad nami a vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby sa ustavične obnovovala vo svetle evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za trpiacich, aby našli pochopenie a pomoc vo svojom ťažkom položení.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za hriešnikov, aby sa pokáním a nápravou života vrátili k Bohu.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za nás tu prítomných, aby sme tieto sväté dni využili predovšetkým na duchovnú obnovu a prehĺbenie viery.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za zosnulých <font color='#B71C1C'>(M.)</font>, aby sa stretli so svojím Stvoriteľom a Vykupiteľom v nebeskej sláve.",
                    "Bože, vyslyš naše prosby,<br>" +
                            "zmiluj sa nad nami,<br>" +
                            "stvor v nás čisté srdcia<br>" +
                            "a obnov pevného ducha.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"60", "C", "Bratia a sestry, Boh nechce smrť hriešnika, ale aby sa obrátil a žil. S hlbokou pokorou a kajúcim srdcom mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, zmiluj sa nad nami a vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby sa neustále očisťovala a obnovovala.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za hlásateľov evanjelia, aby vhodným spôsobom približovali poslucháčom tajomstvo Božej lásky.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za hriešnikov, aby opustili cestu hriechu a nastúpili cestu čistoty srdca.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za tých, ktorí ohovárajú a osočujú iných, aby zmenili svoje správanie, lebo ním spôsobujú veľkú krivdu.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás samých, aby sme sa vyhýbali každému zlu.",
                    "Bože Otče,<br>" +
                            "v tebe má svoj pôvod a základ celý vesmír;<br>" +
                            "skloň sa nad každým človekom,<br>" +
                            "vypočuj hlas nášho spoločenstva,<br>" +
                            "aby sa vždy uskutočňovala tvoja vôľa.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"61", "1", "Bratia a sestry, prežívame tajomstvo Veľkého týždňa a sme účastní na plnení Božieho plánu. Pokorne vzývajme Boha Otca, aby pre lásku k svojmu Synovi vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby sa v tomto čase umučenia dokonalejšie očistila Kristovou krvou.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za celé ľudstvo, aby všetci mohli žiť v pokoji a mali všetko, čo potrebujú pre život a spásu.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za rodiny na Slovensku, aby porozumenie a láska rodičov napomáhala správny rozvoj a výchovu detí.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za lekárov a pracovníkov v zdravotníctve, aby ochotne a s láskou slúžili svojim chorým bratom a sestrám.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás tu zhromaždených, aby sme vždy zachovali vernosť Kristovi.",
                    "Pane a Bože náš,<br>" +
                            "ty si naším svetlom a vykúpením;<br>" +
                            "prosíme ťa, prijmi naše prosby<br>" +
                            "a daruj nám pevnú dôveru v teba.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"62", "2", "Bratia a sestry, Boh nás miluje a prijíma, aj keď sme nehodní jeho lásky. S vierou sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože Otče, obnov svoju Cirkev slávením smrti a zmŕtvychvstania tvojho Syna.<br>" +
                            "<font color='#B71C1C'>2.</font> Obdaruj svojím Duchom všetkých predstaviteľov štátu, aby tvoj zákon bol pre nich základom rozhodovania i konania.<br>" +
                            "<font color='#B71C1C'>3.</font> Udeľ pokoj všetkým ľuďom, aby mohli chváliť tvoje sväté meno.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj, nech ťa v láske kresťanov spoznajú aj tí, ktorí v teba neveria.<br>" +
                            "<font color='#B71C1C'>5.</font> Priprav naše srdcia na radostné prežívanie sviatkov Veľkej noci.<br>" +
                            "<font color='#B71C1C'>6.</font> Bože, ukáž našim zosnulým <font color='#B71C1C'>(M.)</font> svoju láskavú a milosrdnú tvár.",
                    "Dobrotivý Otče,<br>" +
                            "v Kristovi premáhaš silu hriechu a smrti;<br>" +
                            "prosíme ťa, vyslyš naše prosby<br>" +
                            "a obdaruj nás novým životom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"63", "3", "Bratia a sestry, modlime sa k nášmu Pánovi Ježišovi Kristovi, ktorý nás chce zachrániť a chce, aby sme sa zriekli každého zla a konali, čo je dobré v jeho očiach. S dôverou ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, buď s nami v každom čase.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Cirkev, aby bola nositeľkou nádeje pre všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za národy sveta, aby sa riadili Božím zákonom.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za všetkých núdznych, aby nikto nezneužíval ich chudobu.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za nezamestnaných, aby našli vhodné pracovné príležitosti a spravodlivú odmenu.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za nás tu prítomných, aby sme vždy poctivo žili a plnili Božiu vôľu.",
                    "Pane, ty zmierňuješ pôsobenie zla vo svete;<br>" +
                            "vypočuj naše prosby,<br>" +
                            "ktorými ďakujeme za tvoju otcovskú dobrotu,<br>" +
                            "v ktorej nám dávaš všetko,<br>" +
                            "čo naozaj potrebujeme.<br>" +
                            "Nech ti je chvála a vďaka na veky vekov."},};
}
