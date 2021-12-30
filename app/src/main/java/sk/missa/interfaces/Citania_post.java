package sk.missa.interfaces;

/*
 * Čítania v\u00A0pôstnom období uložené v\u00A0troch dvojrozmerných poliach: postCitanie1, postCitanie2, postEvanjelium
 * nedeľa: {týždeň v\u00A0pôstnom období+deň, liturgický rok (A/B/C), "", súradnice, citát, text},
 * deň v\u00A0týždni: {týždeň v\u00A0pôstnom období+deň (napr. 2 týždeň v\u00A0pondelok - 21), deň v\u00A0týždni (1-pondelok, 2-utorok..., 6-sobota), "", súradnice, citát, text},
 * čítanie, ktoré obsahuje alebo: {týždeň v\u00A0pôstnom období+deň, deň v\u00A0týždni (1-pondelok, 2-utorok..., 6-sobota, "", súradnice, citát, text, "Alebo:", súradnice, citát, text...},
 * */

public interface Citania_post {
    String[][] postCitanie1 = {
            {"03", "3", "", "Joel 2, 12-18",
                    "Srdcia si roztrhnite, nie šaty",
                    "Čítanie z Knihy proroka Joela<br>" +
                            "Pán hovorí: \"Obráťte sa ku\u00A0mne celým svojím srdcom, pôstom, plačom a nárekom; srdcia si roztrhnite, nie šaty, a obráťte sa k\u00A0Pánovi, svojmu Bohu.<br>" +
                            "Veď on je dobrotivý a milosrdný, zhovievavý a veľmi milostivý a zľutúva sa v\u00A0nešťastí.\"<br>" +
                            "Kto vie? Možno zmení svoje rozhodnutie a odpustí nám a zanechá po\u00A0sebe požehnanie na\u00A0obetu a nápoj Pánovi, vášmu Bohu.<br>" +
                            "Trúbte na\u00A0Sione, vyhláste pôst, zvolajte pospolitosť! Zhromaždite ľud, posväťte zástup, zvolajte starcov, zhromaždite deti i tie, čo sajú prsia; ženích nech vyjde zo\u00A0svojej izby a nevesta zo\u00A0svojej komôrky.<br>" +
                            "Kňazi, Pánovi služobníci, nech plačú medzi predsieňou a oltárom a nech hovoria: \"Zľutuj sa, Pane, nad\u00A0svojím ľudom a nevystavuj potupe svoje dedičstvo; nech nepanujú nad\u00A0ním národy.\" Prečo by sa malo vravieť medzi národmi: \"Kdeže je ich boh?\" A Pán sa rozhorlil za\u00A0svoju krajinu a zľutoval sa nad\u00A0svojím ľudom.<br>" +
                            "Počuli sme Božie slovo."},
            {"04", "4", "", "Dt 30, 15-20",
                    "Pozrite, dnes vám predkladám požehnanie a kliatbu",
                    "Čítanie z Knihy Deuteronómium<br>" +
                            "Mojžiš prehovoril k\u00A0ľudu: \"Hľa, dnes ti predkladám život a šťastie i smrť a nešťastie. Ak budeš poslúchať príkazy Pána, svojho Boha, ktoré ti dnes dávam, ak budeš milovať Pána, svojho Boha, kráčať po\u00A0jeho cestách a zachovávať jeho nariadenia, prikázania a ustanovenia, budeš žiť: Pán ťa rozmnoží a požehná v\u00A0krajine, do\u00A0ktorej vojdeš a prevezmeš ju do\u00A0vlastníctva.<br>" +
                            "Ale ak sa tvoje srdce odvráti a nebudeš počúvať, ak sa dáš zviesť a budeš sa klaňať cudzím bohom a budeš im slúžiť, tak vám už dnes hovorím, že zahyniete a nepobudnete dlho v\u00A0krajine, do\u00A0ktorej vojdeš, keď prejdeš cez\u00A0Jordán, aby si ju vzal do\u00A0vlastníctva.<br>" +
                            "Nebo i zem volám dnes za\u00A0svedkov proti vám, že som vám predložil život i smrť, požehnanie i kliatbu: vyvoľ si život, aby si žil ty aj tvoje potomstvo; miluj Pána, svojho Boha, poslúchaj jeho hlas a viň sa k\u00A0nemu lebo on je tvoj život a dlhý vek a budeš bývať v\u00A0krajine, o\u00A0ktorej Pán prisahal tvojim otcom Abrahámovi, Izákovi a Jakubovi, že im ju dá.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"05", "5", "", "Iz 58, 1-9b ",
                    "A nie toto je pôst, aký som si vyvolil?",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán, Boh: \"Krič mocne, neutíchaj! Rozozvuč svoj hlas ako poľnica a oznám môjmu ľudu jeho zločiny a Jakubovmu domu jeho hriechy.<br>" +
                            "Áno, deň čo deň ma hľadajú, chcú poznať moje cesty ako ľud, čo koná spravodlivo a práva svojho Boha sa nespúšťa.<br>" +
                            "Žiadajú odo\u00A0mňa spravodlivé súdy, túžia po\u00A0Božej blízkosti. ‚Prečo sa postíme, keď to nevidíš, ponižujeme sa, a ty si nevšímaš?' A hľa, v\u00A0deň vášho pôstu obchodujete a utláčate všetkých svojich robotníkov!<br>" +
                            "Postíte sa, no pritom sa škriepite a hádate a bijete päsťou zločinne.<br>" +
                            "Nepostite sa už ako dnes, a váš hlas bude počuť na\u00A0výsostiach. Azda som si takýto pôst vyvolil, deň, v\u00A0ktorý sa človek uponižuje? Vykrúcať si hlavu ako sítie, vrecovinou a popolom si ustieľať?<br>" +
                            "Toto voláš pôstom a dňom milým Bohu? A nie toto je pôst, aký som si vyvolil: rozviazať putá nespravodlivé, uvoľniť povrazy otroctva, zlomených prepustiť na\u00A0slobodu a rozlámať všetky okovy? Lámať hladnému svoj chlieb, bedárov bez\u00A0prístrešia zaviesť do\u00A0svojho domu? Ak uvidíš nahého, zaodej ho, a pred\u00A0svojím blížnym sa neskrývaj. Vtedy ako zora vyrazí tvoje svetlo a rana sa ti rýchlo zahojí. Pred\u00A0tebou pôjde tvoja spravodlivosť a Pánova sláva za\u00A0tebou. Vtedy budeš volať a Pán ti odpovie, budeš kričať o\u00A0pomoc a on ti povie: ‚Tu som.'\"<br>" +
                            "Počuli sme Božie slovo."},
            {"06", "6", "", "Iz 58, 9c-14",
                    "Ak dáš svoj chlieb hladnému, vtedy zažiari vo\u00A0tmách tvoje svetlo",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán: \"Ak odstrániš zo\u00A0svojho stredu utláčanie a prestaneš ukazovať prstom a hovoriť bezbožne, ak dáš svoj chlieb hladnému a nasýtiš dušu ubitú, vtedy zažiari vo\u00A0tmách tvoje svetlo a tvoja temnota bude ako poludnie.<br>" + "Pán ťa bude neprestajne sprevádzať i na\u00A0miestach vyprahnutých ťa nasýti a tvoje kosti upevní; a budeš ako polievaná záhrada a ako prameň, ktorého voda nevysychá. Tvoj národ znova postaví dávne rumoviská, stavať budeš na\u00A0základoch dávnych pokolení a budú ťa volať opravovateľom ruín a obnoviteľom ulíc, aby sa v\u00A0nich dalo bývať.<br>" +
                            "Ak zdržíš v\u00A0sobotu svoju nohu a v\u00A0môj svätý deň nebudeš pracovať a volať budeš sobotu rozkošou, Pánov svätý deň slávnym a osláviš ho tým, že nebudeš cestovať, obchodovať ani rokovať, budeš sa kochať v\u00A0Pánovi. Budem ťa vodiť po\u00A0výšinách zeme a nasýtim ťa dedičstvom Jakuba, tvojho otca; lebo prehovorili Pánove ústa.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "A", "", "Gn 2, 7-9; 3, 1-7a ",
                    "Stvorenie prvých ľudí a hriech",
                    "Čítanie z Knihy Genezis<br>" +
                            "Pán, Boh, stvárnil človeka z\u00A0prachu zeme a vdýchol do\u00A0jeho nozdier dych života. Tak sa stal človek živou bytosťou.<br>" +
                            "Potom Pán, Boh, vysadil v\u00A0Edene, na\u00A0východe, záhradu a v\u00A0nej umiestil človeka, ktorého bol utvoril. Pán, Boh, dal vyrásť zo\u00A0zeme stromom všetkých druhov, krásnym na\u00A0pohľad a chutným na\u00A0jedenie; uprostred záhrady dal vyrásť stromu života a stromu poznania dobra a zla.<br>" +
                            "Had bol ľstivejší než všetky poľné zvieratá, ktoré urobil Pán, Boh. I vravel žene: \"Naozaj vám Boh zakázal jesť zo\u00A0všetkých stromov záhrady?\"<br>" +
                            "Žena mu odpovedala: \"Jeme ovocie zo\u00A0všetkých stromov, čo sú v\u00A0záhrade. Len ovocie stromu, ktorý je uprostred záhrady, nám Boh zakázal jesť, ba aj dotknúť sa ho, aby sme nezomreli.\"<br>" +
                            "No had povedal žene: \"Nie, nezomriete. Ale Boh vie, že v\u00A0deň, keď budete z\u00A0neho jesť, otvoria sa vám oči a budete ako Boh, budete poznať dobro i zlo.\"<br>" +
                            "Žena videla, že by bolo dobré jesť zo\u00A0stromu, že strom je na\u00A0pohľad krásny a na\u00A0získanie múdrosti vábivý; vzala z\u00A0jeho ovocia a jedla a dala aj svojmu mužovi, čo bol s\u00A0ňou, a jedol aj on. Obom sa otvorili oči a spoznali, že sú nahí.<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "B", "", "Gn 9, 8-15",
                    "Božia zmluva s\u00A0Noemom zachráneným pred\u00A0potopou",
                    "Čítanie z Knihy Genezis<br>" +
                            "Toto povedal Boh Noemovi a jeho synom: \"Hľa, ja uzavriem zmluvu s\u00A0vami a s\u00A0vaším potomstvom i so\u00A0všetkými živými bytosťami, čo sú s\u00A0vami: s\u00A0vtákmi i s\u00A0dobytkom a so\u00A0všetkou zverou zeme, čo je s\u00A0vami, so\u00A0všetkým, čo vyšlo z\u00A0korába; so\u00A0všetkými zvieratami na\u00A0zemi. Uzavriem s\u00A0vami zmluvu a už nikdy nezahynie všetko živé vo\u00A0vodách potopy, už nikdy nebude potopa, ktorá by spustošila zem.\"<br>" +
                            "A Boh povedal: \"Toto je znak zmluvy, ktorú uzatváram medzi mnou a vami a medzi všetkými živými bytosťami, čo sú s\u00A0vami, pre\u00A0všetky budúce pokolenia: Do\u00A0oblakov vložím svoj oblúk a bude znamením zmluvy medzi mnou a zemou. Keď nahromadím oblaky nad\u00A0zemou a keď sa v\u00A0oblakoch zjaví dúha, vtedy si spomeniem na\u00A0svoju zmluvu s\u00A0vami a s\u00A0každou živou bytosťou, ktorá má telo. Nebudú už vody potopy a nezničia nijaké telo.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "C", "", "Dt 26, 4-10",
                    "Vyznanie viery vyvoleného ľudu",
                    "Čítanie z Knihy Deuteronómium<br>" +
                            "Mojžiš povedal ľudu: \"Kňaz vezme kôš z\u00A0tvojej ruky, položí ho pred\u00A0oltár Pána, tvojho Boha, a ty pred\u00A0Pánom, svojím Bohom, povieš: ‚Môj otec bol potulný Sýrčan. Zostúpil do\u00A0Egypta a žil tam ako cudzinec vo\u00A0veľmi malom počte. Tam vzrástol na\u00A0veľký, silný a nesmierne početný národ.<br>" +
                            "Egypťania nás týrali a prenasledovali ukladaním najťažších robôt. My sme volali k\u00A0Pánovi, Bohu svojich otcov, a on nás vypočul a zhliadol na\u00A0naše poníženie, lopotu a útlak. Pán nás vyviedol z\u00A0Egypta silnou rukou a vystretým ramenom za\u00A0veľkej hrôzy, znamení a zázrakov a priviedol nás na\u00A0toto miesto a dal nám túto krajinu oplývajúcu mliekom a medom. A hľa, teraz som priniesol prvotiny plodov zeme, ktorú si mi dal, Pane.'<br>" +
                            "A necháš ich pred\u00A0Pánom, svojím Bohom, a pokloníš sa Pánovi, svojmu Bohu.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"11", "1", "", "Lv 19, 1-2. 11-18",
                    "Spravodlivo súď svojho blížneho",
                    "Čítanie z Knihy Levitikus<br>" +
                            "Pán povedal Mojžišovi: \"Prehovor k\u00A0celej pospolitosti Izraelových synov a povedz im: Buďte svätí, lebo ja, Pán, váš Boh, som svätý.<br>" +
                            "Nekradnite. Neluhajte a nepodvádzajte svojho blížneho.<br>" +
                            "Nebudeš falošne prisahať na\u00A0moje meno ani hanobiť meno svojho Boha. Ja som Pán.<br>" +
                            "Nebudeš potupovať svojho blížneho, ani ho nebudeš okrádať. Mzda nádenníka neostane u\u00A0teba do\u00A0rána.<br>" +
                            "Hluchému nebudeš zlorečiť a slepému nenastavíš prekážku, ale báť sa budeš svojho Boha. Ja som Pán.<br>" +
                            "Na súde nebuďte nespravodliví. Ani chudobnému nadŕžať nebudeš, ani sa nebudeš skláňať pred\u00A0mocnými. Spravodlivo súď svojho blížneho.<br>" +
                            "Nebudeš osočovať ani ohovárať svojich súkmeňovcov. Nebudeš číhať na\u00A0krv svojho blížneho. Ja som Pán.<br>" +
                            "Nenos vo\u00A0svojom srdci nenávisť voči svojmu bratovi; napomeň ho, aby si sa neobťažil jeho hriechom.<br>" +
                            "Nepomsti sa a neprechovávaj hnev k\u00A0synom svojho ľudu. Milovať budeš svojho blížneho ako seba samého. Ja som Pán.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"12", "2", "", "Iz 55, 10-11",
                    "Dážď dá, aby zo\u00A0zeme klíčilo",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán: \"Ako z\u00A0neba padá dážď a sneh a nevracia sa späť, lež napojí zem a zúrodní ju, aby z\u00A0nej klíčilo, aby obdarovala rozsievača semenom a dala chlieb hladnému, tak bude so\u00A0slovom, ktoré vychádza z\u00A0mojich úst: nevráti sa ku\u00A0mne naprázdno, ale vykoná všetko, čo chcem, a vydarí sa jeho poslanie.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"13", "3", "", "Jon 3, 1-10",
                    "Ninivčania sa odvrátili od\u00A0svojej zlej cesty",
                    "Čítanie z Knihy proroka Jonáša<br>" +
                            "Pán druhý raz prehovoril k\u00A0Jonášovi: \"Vstaň, choď do\u00A0veľkého mesta Ninive a káž tam, čo ti hovorím.\"<br>" +
                            "Jonáš vstal a podľa Pánovho rozkazu šiel do\u00A0Ninive.<br>" +
                            "Ninive bolo veľké mesto pred\u00A0Bohom; tri dni trvala cesta cezeň. Jonáš začal prechádzať mestom v\u00A0prvý deň a volal: \"Ešte štyridsať dní a Ninive bude rozvrátené.\"<br>" +
                            "Obyvatelia Ninive uverili v\u00A0Boha, vyhlásili pôst a od\u00A0najväčšieho po\u00A0najmenšieho sa obliekli do\u00A0vrecoviny.<br>" +
                            "Zvesť sa dostala až k\u00A0ninivskému kráľovi. Vstal zo\u00A0svojho trónu, zhodil zo\u00A0seba plášť, obliekol si vrecovinu a posadil sa do\u00A0popola. Potom dal rozhlásiť po\u00A0Ninive rozhodnutie kráľa a jeho veľmožov: \"Nech nič neokúsia ľudia ani zvieratá, dobytok a ovce nech sa nepasú, ani vodu nech nepijú! Ľudia i zvieratá nech sa oblečú do\u00A0vrecoviny a hlasno volajú k\u00A0Bohu a nech sa každý odvráti od\u00A0svojej zlej cesty a od\u00A0násilia, ktoré pácha. Ktovie, možno Boh zmení svoje rozhodnutie a odpustí nám, odloží svoje rozhorčenie a nezahynieme.\"<br>" +
                            "A Boh videl ich skutky, že sa odvrátili od\u00A0svojej zlej cesty; zmiloval sa a nepostihol ich nešťastím, ktorým im hrozil.<br>" +
                            "Počuli sme Božie slovo."},
            {"14", "4", "", "Est 4, 17n. p-r. aa-bb. gg-hh ",
                    "Nemám ochrancu okrem teba, Pane",
                    "Čítanie z Knihy Ester<br>" +
                            "Kráľovná Ester v\u00A0smrteľnom nebezpečenstve, ktoré hrozilo jej národu, hľadala útočište u\u00A0Pána. Padla na\u00A0zem so\u00A0svojimi služobnicami a od\u00A0rána až do\u00A0večera sa modlila: \"Zvelebený si, Bože Abraháma, Bože Izáka a Bože Jakuba. Pomôž mne opustenej, ktorá nemá ochrancu okrem teba, Pane, a nebezpečenstvo sa mi priblížilo na\u00A0dosah ruky.<br>" +
                            "Počula som čítať z\u00A0kníh mojich predkov, Pane, že ty až do\u00A0konca zachraňuješ všetkých, čo sa ti páčia, Pane.<br>" +
                            "Teraz pomáhaj mne opustenej, ktorá nemá nikoho okrem teba, Pane, Bože môj.<br>" +
                            "Teraz pomáhaj mne, sirote, vlož mi do\u00A0úst príhodné slovo pred\u00A0levom, urob ma milou v\u00A0jeho očiach a obráť jeho srdce na\u00A0nenávisť k\u00A0tomu, ktorý nás napáda, na\u00A0záhubu jeho a tých, čo s\u00A0ním súhlasia.<br>" +
                            "Ale nás vysloboď z\u00A0rúk našich nepriateľov, náš zármutok obráť na\u00A0radosť a naše bôle na\u00A0zdravie.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"15", "5", "", "Ez 18, 21-28",
                    "Azda môžem chcieť smrť bezbožného, a nie aby sa odvrátil od\u00A0svojich ciest a žil?",
                    "Čítanie z Knihy proroka Ezechiela<br>" +
                            "Toto hovorí Pán, Boh: \"Ak sa hriešnik odvráti od\u00A0všetkých hriechov, ktoré popáchal, a zachová všetky moje príkazy a bude konať podľa práva a spravodlivosti, určite bude žiť, nezomrie. Nepripomenie sa mu ani jeden z\u00A0hriechov, ktoré popáchal. Bude žiť pre\u00A0spravodlivosť, ktorú konal.<br>" +
                            "Azda môžem chcieť smrť bezbožného, hovorí Pán, Boh, a nie aby sa odvrátil od\u00A0svojich ciest a žil?<br>" +
                            "Ale ak sa spravodlivý odvráti od\u00A0svojej spravodlivosti a spácha zločin, podobný ohavnostiam, aké páchajú hriešnici, môže potom žiť? Nepripomenie sa ani jeden zo\u00A0spravodlivých skutkov, ktoré robil. Zomrie pre\u00A0svoju vierolomnosť, ktorej sa dopustil, a pre\u00A0svoj hriech, ktorý spáchal.<br>" +
                            "Vravíte: ‚Nie je správne, ako koná Pán.' Počujte teda, vy z\u00A0izraelského domu! Ja že nekonám správne? A nekonáte skôr vy nesprávne?<br>" +
                            "Ak sa spravodlivý odvráti od\u00A0svojej spravodlivosti a pácha neprávosť, zomrie: zomrie pre\u00A0neprávosť, ktorú spáchal.<br>" +
                            "Ak sa však bezbožný odvráti od\u00A0svojej bezbožnosti, ktorú páchal, a koná podľa práva a spravodlivosti, zachráni si život. Keď teda uzná všetky svoje neprávosti, ktoré popáchal, a odvráti sa od\u00A0nich, určite bude žiť, nezomrie.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"16", "6", "", "Dt 26, 16-19",
                    "Aby si bol svätým ľudom Pána, svojho Boha",
                    "Čítanie z Knihy Deuteronómium<br>" +
                            "Mojžiš povedal ľudu: \"Dnes ti Pán, tvoj Boh, prikazuje, aby si zachovával tieto príkazy a ustanovenia; zachovávaj a plň ich z\u00A0celého svojho srdca a z\u00A0celej svojej duše.<br>" +
                            "Dnes si si vyvolil Pána, že bude tvojím Bohom, že budeš kráčať po\u00A0jeho cestách, zachovávať jeho príkazy, nariadenia a ustanovenia a poslúchať jeho rozkazy.<br>" +
                            "A Pán si ťa dnes vyvolil, že budeš jeho osobitným ľudom, ako ti povedal, a že budeš zachovávať všetky jeho príkazy, že ťa vyvýši nad\u00A0všetky národy, ktoré stvoril na\u00A0svoju chválu, česť a slávu, aby si bol svätým ľudom Pána, svojho Boha, ako povedal.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "A", "", "Gn 12, 1-4a ",
                    "Odíď zo\u00A0svojej krajiny, od\u00A0svojich príbuzných",
                    "Čítanie z Knihy Genezis<br>" +
                            "Pán povedal Abramovi: \"Odíď zo\u00A0svojej krajiny, od\u00A0svojich príbuzných a z\u00A0domu svojho otca do\u00A0krajiny, ktorú ti ukážem. Urobím z\u00A0teba veľký národ a požehnám ťa, oslávim tvoje meno a budeš požehnaním.<br>" +
                            "Požehnám tých, čo ťa budú žehnať, a prekľajem tých, čo ťa budú preklínať. V\u00A0tebe budú požehnané všetky pokolenia zeme.\" A Abram odišiel, ako mu rozkázal Pán.<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "B", "", "Gn 22, 1-2. 9a. 10-13. 15-18",
                    "Obeta nášho praotca Abraháma",
                    "Čítanie z Knihy Genezis<br>" +
                            "Boh skúšal Abraháma a povedal mu: \"Abrahám!\"<br>" +
                            "On odpovedal: \"Tu som.\"<br>" +
                            "Boh hovoril: \"Vezmi svojho jediného syna Izáka, ktorého miluješ, choď do\u00A0krajiny Moria a obetuj ho tam ako zápalnú obetu na\u00A0vrchu, ktorý ti ukážem.\"<br>" +
                            "Keď došli na\u00A0miesto, ktoré mu ukázal Boh, Abrahám postavil oltár a poukladal naň drevo. Potom vystrel ruku, vzal nôž a chcel obetovať svojho syna.<br>" +
                            "Ale vtom naň zavolal anjel Pána z\u00A0neba: \"Abrahám, Abrahám!\"<br>" +
                            "On odpovedal: \"Tu som.\"<br>" +
                            "Anjel mu povedal: \"Nevzťahuj svoju ruku na\u00A0chlapca a neublíž mu! Teraz viem, že sa bojíš Boha, veď si mi neodoprel svojho jediného syna.\"<br>" +
                            "Abrahám zdvihol oči a uzrel barana zachyteného rohami v\u00A0kroví. Vzal ho a obetoval namiesto svojho syna ako zápalnú obetu.<br>" +
                            "Anjel Pána znova zavolal z\u00A0neba na\u00A0Abraháma: \"Na seba samého prisahám taký je výrok Pána : Pretože si toto urobil a neodoprel si mi svojho jediného syna, požehnám ťa a rozmnožím tvoje potomstvo ako hviezdy na\u00A0nebi a ako piesok na\u00A0brehu mora a tvoje potomstvo sa zmocní brán svojich nepriateľov. A pretože si poslúchol môj hlas, v\u00A0tvojom potomstve budú požehnané všetky národy zeme.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "C", "", "Gn 15, 5-12. 17-18",
                    "Boh uzaviera s\u00A0verným Abrahámom zmluvu",
                    "Čítanie z Knihy Genezis<br>" +
                            "Boh vyviedol Abrama von a povedal mu: \"Pozri na\u00A0nebo a spočítaj hviezdy, ak môžeš.\" A uistil ho: \"Také bude tvoje potomstvo.\" On uveril Pánovi a to sa mu počítalo za\u00A0spravodlivosť.<br>" +
                            "Potom mu povedal: \"Ja som Pán, ja som ťa vyviedol z\u00A0Uru Chaldejcov, aby som ti dal do\u00A0vlastníctva túto krajinu.\"<br>" +
                            "On sa opýtal: \"Pane, Bože, podľa čoho spoznám, že ju budem vlastniť?\"<br>" +
                            "Pán odpovedal: \"Prines mi trojročnú jalovicu, trojročnú kozu a trojročného barana, hrdličku a holubicu.\"<br>" +
                            "On vzal všetky tieto zvieratá, rozpolil ich a obe polovice položil vzájomne oproti sebe; vtáky však nerozpolil. Na\u00A0mŕtve telá zlietali dravé vtáky a Abram ich odháňal.<br>" +
                            "Keď zapadlo slnko, na\u00A0Abrama doľahol tvrdý spánok a prenikla ho veľká, príšerná hrôza.<br>" +
                            "Keď už slnko zapadlo a nastala hustá tma, zjavila sa dymiaca pec a ohnivá pochodeň, ktorá prechádzala pomedzi rozpolené zvieratá.<br>" +
                            "V ten deň Pán uzavrel s\u00A0Abramom zmluvu slovami: \"Tvojmu potomstvu dám túto krajinu od\u00A0Egyptskej rieky až po\u00A0veľkú rieku, Eufrat.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"21", "1", "", "Dan 9, 4b-10",
                    "Zhrešili sme, konali sme ničomne",
                    "Čítanie z Knihy proroka Daniela<br>" +
                            "Pane, Bože veľký a hrozný, ktorý zachovávaš zmluvu a si láskavý k\u00A0tým, čo ťa milujú a zachovávajú tvoje nariadenia. Zhrešili sme, konali sme ničomne a žili bezbožne; vzopreli sme sa a odklonili od\u00A0tvojich nariadení a od\u00A0tvojich ustanovení. Neposlúchali sme tvojich sluhov, prorokov, ktorí v\u00A0tvojom mene hovorili k\u00A0našim kráľom, našim kniežatám, našim otcom i všetkému ľudu krajiny.<br>" +
                            "Tebe, Pane, pristane spravodlivosť a nám zahanbená tvár, akú majú dnes mužovia Judey, obyvatelia Jeruzalema a všetci Izraeliti, blízki i vzdialení po\u00A0rozličných krajinách, do\u00A0ktorých si ich rozohnal, pretože porušili vernosť voči tebe.<br>" +
                            "Nám, Pane, našim kráľom, našim kniežatám a našim otcom pristane zahanbená tvár, lebo sme zhrešili proti tebe. No Pánovi, nášmu Bohu, svedčí milosrdenstvo a zľutovanie, pretože sme odstúpili od\u00A0teba a nepočúvali sme hlas Pána, svojho Boha, a nekráčali sme podľa jeho zákonov, ktoré nám dal prostredníctvom svojich sluhov, prorokov.<br>" +
                            "Počuli sme Božie slovo."},
            {"22", "2", "", "Iz 1, 10. 16-20",
                    "Učte sa robiť dobro, hľadajte spravodlivosť",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Čujte Pánovo slovo, kniežatá sodomské, počúvaj zákon nášho Boha, ľud gomorský!<br>" +
                            "\"Obmyte sa, očistite sa, odstráňte mi spred očí zlobu svojho zmýšľania; prestaňte robiť zlo, učte sa robiť dobro, hľadajte spravodlivosť, pomôžte utláčanému, vymôžte právo sirote, obhajujte vdovu.<br>" +
                            "A príďte, budeme sa pravotiť,\" hovorí Pán. \"Keby boli vaše hriechy ako šarlát, zbelejú ako sneh, a keby boli červené sťa purpur, budú ako vlna. Ak budete poddajní a počúvnete, dobro zeme budete požívať. Ale ak sa vzpriečite a rozhneváte ma, mečom zahyniete, lebo prehovorili Pánove ústa.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"23", "3", "", "Jer 18, 18-20",
                    "Poďte, porazíme ho",
                    "Čítanie z Knihy proroka Jeremiáša<br>" +
                            "Prorokovi nepriatelia povedali: \"Poďte, zosnujme plány proti Jeremiášovi! Veď kňaz nebude bez\u00A0zákona, ani mudrc bez\u00A0rady a prorok bez\u00A0reči. Poďte, porazíme ho jazykom a nepočúvajme jeho reči.\"<br>" +
                            "Pozri, Pane, na\u00A0mňa a čuj hlas mojich protivníkov! Vari sa zlom odpláca za\u00A0dobro, že mi vykopali jamu? Spomeň si, že som stával pred\u00A0tebou, aby som hovoril v\u00A0ich prospech a odvrátil od\u00A0nich tvoju nevôľu.<br>" +
                            "Počuli sme Božie slovo."},
            {"24", "4", "", "Jer 17, 5-10",
                    "Zlorečený človek, ktorý sa spolieha na\u00A0človeka; požehnaný človek, čo dúfa v\u00A0Pána",
                    "Čítanie z Knihy proroka Jeremiáša<br>" +
                            "Toto hovorí Pán: \"Zlorečený človek, ktorý sa spolieha na\u00A0človeka; telo urobil svojou oporou a jeho srdce sa vzďaľuje od\u00A0Pána. Bude ako tamariška na\u00A0púšti, neuzrie prichádzať blaho, svoj domov bude mať v\u00A0suchopárnej pustatine, v\u00A0zemi soľnatej, kde sa nedá bývať.<br>" +
                            "Požehnaný človek, čo dúfa v\u00A0Pána, Pán bude jeho oporou.<br>" +
                            "Bude ako strom zasadený pri\u00A0vode, ktorý k\u00A0potoku vystiera korene; nebude sa báť, keď príde horúčosť, jeho lístie zostane zelené; ani v\u00A0suchom roku nebude mať starosti a neprestane rodiť ovocie.<br>" +
                            "Zo všetkého najklamnejšie je srdce a ťažko ho vyliečiť; kto sa v\u00A0ňom vyzná? Ja, Pán, skúmam srdce a skúšam zmýšľanie: každému odplatím podľa jeho cesty, podľa ovocia jeho skutkov.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"25", "5", "", "Gn 37, 3-4. 12-13a. 17b-28",
                    "Hľa, snár prichádza; poďte, zabijeme ho",
                    "Čítanie z Knihy Genezis<br>" +
                            "Izrael miloval Jozefa viac ako všetkých svojich synov, lebo sa mu narodil v\u00A0starobe, a dal mu urobiť dlhú tuniku. Keď jeho bratia videli, že ho má otec radšej ako všetkých ostatných synov, začali ho nenávidieť a nevedeli sa s\u00A0ním prívetivo rozprávať.<br>" +
                            "Raz jeho bratia pásli ovce svojho otca pri\u00A0Sicheme. A Izrael povedal Jozefovi: \"Tvoji bratia pasú ovce pri\u00A0Sicheme, poď, pošlem ťa za\u00A0nimi.\" A Jozef išiel za\u00A0svojimi bratmi a našiel ich v\u00A0Dotaine.<br>" +
                            "Oni ho zďaleka zbadali a prv než k\u00A0nim prišiel, sa dohodli, že ho zabijú. Medzi sebou hovorili: \"Hľa, snár prichádza; poďte, zabijeme ho a hodíme do\u00A0niektorej cisterny. A povieme, že ho zožrala divá zver. Potom sa ukáže, čo mu pomôžu jeho sny.\"<br>" +
                            "Keď to počul Ruben, usiloval sa vyslobodiť ho z\u00A0ich rúk a vravel: \"Neberme mu život.\" A ďalej im hovoril: \"Neprelievajte krv. Hoďte ho do\u00A0cisterny tu na\u00A0pustatine a nepoškvrňujte si ruky.\" To povedal preto, že ho chcel vyslobodiť z\u00A0ich rúk a vrátiť jeho otcovi.<br>" +
                            "A len čo Jozef došiel k\u00A0svojim bratom, zobliekli mu jeho dlhú tuniku a hodili ho do\u00A0cisterny, v\u00A0ktorej nebolo vody.<br>" +
                            "Potom si posadali a jedli chlieb. A keď zdvihli oči, videli prichádzať karavánu Izmaelitov z\u00A0Galaádu. Ich ťavy niesli balzam, mastixovú živicu a ladánum do\u00A0Egypta. Tu povedal Júda svojim bratom: \"Čo by sme mali z\u00A0toho, keby sme zabili svojho brata a zatajili jeho krv? Bude lepšie predať ho Izmaelitom a nepoškvrniť si ruky. Veď je to náš brat a naše telo.\" A bratia s\u00A0ním súhlasili.<br>" +
                            "A keď madiánski kupci prechádzali okolo, vytiahli Jozefa z\u00A0cisterny a predali ho za\u00A0dvadsať strieborných Izmaelitom. A tí ho odviedli do\u00A0Egypta.<br>" +
                            "Počuli sme Božie slovo."},
            {"26", "6", "", "Mich 7, 14-15. 18-20",
                    "Do morských hlbín zahodí všetky naše hriechy",
                    "Čítanie z Knihy proroka Micheáša<br>" +
                            "Pane, pas svoj ľud svojou berlou, svoje dedičné stádo, ktoré osamelé býva na\u00A0horských stráňach, uprostred záhrad; nech spasú Bášan a Galaád ako v\u00A0dňoch pradávnych. Ukáž nám zázraky ako v\u00A0dňoch, keď si vychádzal z\u00A0egyptskej krajiny.<br>" +
                            "Kto je Boh ako ty, ktorý odpúšťaš zločiny a prechádzaš ponad hriech zvyškov svojho dedičstva?<br>" +
                            "Neprechováva svoj hnev naveky, lebo sa rád zľutúva.<br>" +
                            "Vráti sa a zmiluje sa nad\u00A0nami, rozšliape naše neprávosti a do\u00A0morských hlbín zahodí všetky naše hriechy. Jakubovi preukážeš vernosť, Abrahámovi milosrdenstvo; ako si prisahal našim otcom od\u00A0pradávnych dní.<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "A", "", "Ex 17, 3-7",
                    "Daj nám vodu na\u00A0pitie!",
                    "Čítanie z Knihy Exodus<br>" +
                            "Nebolo vody a smädný ľud reptal proti Mojžišovi: \"Načo si nás len vyviedol z\u00A0Egypta? Aby si nás, naše deti a náš dobytok umoril smädom?\"<br>" +
                            "Mojžiš volal k\u00A0Pánovi: \"Čo si počnem s\u00A0týmto ľudom? Málo chýba a ukameňuje ma.\"<br>" +
                            "Pán povedal Mojžišovi: \"Kráčaj pred\u00A0ľudom, zober so\u00A0sebou niekoľko starších z\u00A0Izraela. Do\u00A0ruky si vezmi palicu, ktorou si udieral rieku, a choď! Hľa, ja budem stáť pred\u00A0tebou na\u00A0skale Horebu; udrieš na\u00A0skalu, vytryskne z\u00A0nej voda a ľud sa napije.\"<br>" +
                            "Mojžiš tak urobil pred\u00A0očami starších Izraela a nazval to miesto Massa a Meríba pre\u00A0hádku synov Izraela a preto, že pokúšali Pána, keď vraveli: \"Je Pán medzi nami, alebo nie?\"<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "B", "", "Ex 20, 1-17",
                    "Zákon bol daný skrze Mojžiša",
                    "Čítanie z Knihy Exodus<br>" +
                            "Boh povedal všetky tieto slová: \"Ja som Pán, tvoj Boh, ktorý ťa vyviedol z\u00A0egyptskej krajiny, z\u00A0domu otroctva. Nebudeš mať iných bohov okrem mňa.<br>" +
                            "Neurobíš si modlu ani nijakú podobu toho, čo je hore na\u00A0nebi, dole na\u00A0zemi alebo vo\u00A0vodách pod\u00A0zemou.<br>" +
                            "Nebudeš sa im klaňať ani ich uctievať. Lebo ja som Pán, tvoj Boh, Boh žiarlivý, ktorý trestá neprávosti otcov na\u00A0deťoch do\u00A0tretieho a štvrtého pokolenia u\u00A0tých, čo ma nenávidia, ale tým, čo ma milujú a zachovávajú moje prikázania, preukazujem priazeň až do\u00A0tisíceho pokolenia.<br>" +
                            "Nevyslovíš meno Pána, svojho Boha, nadarmo. Lebo Pán nenechá bez\u00A0trestu toho, kto by zneuctil meno Pána, svojho Boha.<br>" +
                            "Pamätaj na\u00A0sobotný deň a zasväť ho.<br>" +
                            "Šesť dní budeš pracovať a tvoriť všetky svoje diela, ale siedmy deň je sobota Pána, tvojho Boha. V\u00A0ten deň nebudeš konať nijakú prácu ani ty, ani tvoj syn alebo tvoja dcéra, ani tvoj sluha alebo tvoja slúžka, ani tvoj dobytok, ani prišelec, čo býva v\u00A0tvojich bránach. Lebo Pán za\u00A0šesť dní utvoril nebo i zem, more a všetko, čo je v\u00A0nich, a na\u00A0siedmy deň odpočíval. Preto Pán sobotu požehnal a vyhlásil ju za\u00A0svätú.<br>" +
                            "Cti svojho otca a svoju matku, aby si dlho žil v\u00A0krajine, ktorú ti dá Pán, tvoj Boh.<br>" +
                            "Nezabiješ.<br>" +
                            "Nescudzoložíš.<br>" +
                            "Nepokradneš.<br>" +
                            "Nebudeš krivo svedčiť proti svojmu blížnemu.<br>" +
                            "Nebudeš žiadostivo túžiť po\u00A0dome svojho blížneho.<br>" +
                            "Nebudeš túžiť po\u00A0jeho manželke, ani po\u00A0jeho sluhovi, ani po\u00A0slúžke, ani po\u00A0volovi, ani po\u00A0oslovi, ani po\u00A0ničom, čo mu patrí.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "C", "", "Ex 3, 1-8a. 13-15",
                    "Ten, ktorý je, ma k\u00A0vám poslal",
                    "Čítanie z Knihy Exodus<br>" +
                            "Mojžiš pásol ovce svojho tesťa, madiánskeho kňaza Jetra. Keď raz hnal stádo za\u00A0púšť, došiel k\u00A0Božiemu vrchu Horeb. Tam sa mu zjavil anjel Pána v\u00A0plameni ohňa, čo šľahal z\u00A0tŕňového kra. Videl, že ker horí plameňom, a nezhára.<br>" +
                            "Mojžiš si povedal: \"Pôjdem sa pozrieť na\u00A0tento zvláštny jav, prečo ker nezhára.\"<br>" +
                            "Keď Pán videl, že sa prichádza pozrieť, Boh ho z\u00A0tŕňového kra oslovil: \"Mojžiš, Mojžiš!\"<br>" +
                            "On odpovedal: \"Tu som.\"<br>" +
                            "Pán povedal: \"Nepribližuj sa sem! Zobuj si z\u00A0nôh sandále, lebo miesto, na\u00A0ktorom stojíš, je zem svätá.\"<br>" +
                            "A pokračoval: \"Ja som Boh tvojho otca, Boh Abraháma, Boh Izáka a Boh Jakuba.\"<br>" +
                            "Mojžiš si zakryl tvár, lebo sa neodvážil hľadieť na\u00A0Boha.<br>" +
                            "A Pán mu povedal: \"Videl som utrpenie môjho ľudu v\u00A0Egypte a počul som jeho kvílenie pre\u00A0tvrdosť jeho poháňačov. Poznám jeho bolesť a zostúpil som, aby som ho vyslobodil z\u00A0rúk Egypťanov a vyviedol z\u00A0tej krajiny do\u00A0krajiny dobrej a rozľahlej, do\u00A0krajiny, ktorá oplýva mliekom a medom.\"<br>" +
                            "Mojžiš povedal Bohu: \"Ja pôjdem k\u00A0synom Izraela a poviem im: Poslal ma k\u00A0vám Boh vašich otcov. A čo im poviem, keď sa ma opýtajú: ‚Ako sa volá?'\"<br>" +
                            "Boh povedal Mojžišovi: \"Ja som, ktorý som.\"<br>" +
                            "A dodal: \"Toto povieš synom Izraela: Ten, ktorý je, ma k\u00A0vám poslal.\"<br>" +
                            "A Boh Mojžišovi ešte povedal: \"Toto povieš synom Izraela: Pán, Boh vašich otcov, Boh Abraháma, Boh Izáka a Boh Jakuba, ma k\u00A0vám poslal. Toto je moje meno naveky a takto ma budú volať po\u00A0všetky pokolenia.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"31", "1", "", "2 Kr 5, 1-15a ",
                    "Mnoho malomocných bolo v\u00A0Izraeli, a ani jeden z\u00A0nich nebol očistený, iba Sýrčan Náman (Lk 4, 27)",
                    "Čítanie z Druhej knihy kráľov<br>" +
                            "Náman, vojenský veliteľ sýrskeho kráľa, bol význačný muž a jeho pán si ho vážil, lebo pomocou neho dal Pán Sýrii víťazstvo. Ale tento udatný muž bol malomocný.<br>" +
                            "Zo Sýrie raz vyrazil oddiel jazdcov a z\u00A0izraelskej krajiny odvliekli do\u00A0zajatia dievčatko, ktoré potom slúžilo Námanovej žene. Ono povedalo svojej panej: \"Keby bol môj pán u\u00A0proroka v\u00A0Samárii, určite by ho oslobodil od\u00A0malomocenstva.\"<br>" +
                            "Náman šiel k\u00A0svojmu pánovi a oznámil mu: \"Takto a takto povedalo dievča z\u00A0izraelskej krajiny.\"<br>" +
                            "A sýrsky kráľ mu povedal: \"Zober sa a choď, pošlem izraelskému kráľovi list.\"<br>" +
                            "On išiel, vzal so\u00A0sebou desať hrivien striebra, šesťtisíc šiklov zlata a desať oblekov a odovzdal izraelskému kráľovi list tohoto znenia: \"Keď dostaneš tento list, vedz, že ti posielam svojho služobníka Námana, aby si ho oslobodil od\u00A0malomocenstva!\"<br>" +
                            "Keď izraelský kráľ list prečítal, roztrhol si rúcho a povedal: \"Čo som Boh, aby som mohol zabíjať a oživovať, keď tento posiela ku\u00A0mne človeka, aby som ho oslobodil od\u00A0malomocenstva? Pozrite, očividne hľadá proti mne zámienku!\"<br>" +
                            "Keď Boží muž Elizeus počul, že si izraelský kráľ roztrhol rúcho, poslal mu odkaz: \"Prečo si si roztrhol rúcho? Nech príde ku\u00A0mne a zvie, že je v\u00A0Izraeli prorok.\"<br>" +
                            "Náman teda šiel s\u00A0koňmi a vozmi a zastal predo\u00A0dvermi Elizeovho domu. Elizeus poslal k\u00A0nemu posla s\u00A0odkazom: \"Choď a okúp sa sedem ráz v\u00A0Jordáne, potom ti telo ozdravie a budeš čistý!\"<br>" +
                            "Náman sa nahneval a odišiel so\u00A0slovami: \"Myslel som si, že vyjde ku\u00A0mne, bude vzývať meno Pána, svojho Boha, rukou sa dotkne malomocného miesta a uzdraví ma. Nie sú rieky Damasku Abana a Farfar lepšie než všetky rieky Izraela? Nemôžem sa v\u00A0nich okúpať a očistiť?\"<br>" +
                            "Obrátil sa a s\u00A0hnevom odchádzal. Tu pristúpili k\u00A0nemu jeho sluhovia a povedali mu: \"Keby ti prorok rozkázal veľkú vec, iste by si to urobil. O\u00A0to skôr tak urob, keď ti povedal: ‚Okúp sa a budeš čistý.'\"<br>" +
                            "Zostúpil teda a sedem ráz sa ponoril do\u00A0Jordánu podľa slova Božieho muža. A jeho telo sa obnovilo ako telo malého dieťaťa a bol čistý.<br>" +
                            "Potom sa s\u00A0celým sprievodom vrátil k\u00A0Božiemu mužovi, zastal pred\u00A0ním a povedal: \"Teraz viem, že na\u00A0celej zemi niet Boha, iba v\u00A0Izraeli.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"32", "2", "", "Dan 3, 25. 34-43",
                    "Prijmi nás skrúšených srdcom a ponížených duchom",
                    "Čítanie z Knihy proroka Daniela<br>" +
                            "Azariáš stál uprostred ohňa, otvoril ústa a modlil sa: \"Pre tvoje meno, prosím, neodvrhni nás navždy a nezrušuj svoju zmluvu. Ani nám neodriekni svoje milosrdenstvo pre\u00A0Abraháma, tvojho miláčika, pre\u00A0Izáka, tvojho sluhu, a pre\u00A0Izraela, tvojho svätého; veď si im prisľúbil, že rozmnožíš ich potomstvo ako hviezdy na\u00A0nebi a ako piesok na\u00A0brehu mora.<br>" +
                            "Pane, stali sme sa menšími ako všetky iné národy a sme dnes pokorení na\u00A0celej zemi pre\u00A0svoje hriechy. A niet v\u00A0tomto čase ani kniežaťa, ani proroka, ani vodcu, ani celopalu, ani krvavej obety, ani darov, ani kadidla, ani miesta, kde by sme ti priniesli prvotiny, aby sme našli milosrdenstvo. Ale prijmi nás skrúšených srdcom a ponížených duchom; nech je dnes pred\u00A0tebou naša obeta ako zápalné obety baranov a býkov a ako tisíce tučných baránkov, a zdokonaľ tých, čo ťa nasledujú, lebo nebudú zahanbení tí, čo dúfajú v\u00A0teba.<br>" +
                            "A teraz ťa chceme nasledovať celým srdcom, a s\u00A0bázňou hľadáme tvoju tvár. Nezahanbi nás, ale zaobchádzaj s\u00A0nami podľa svojej miernosti a podľa svojho veľkého milosrdenstva. Vysloboď nás svojou obdivuhodnou mocou a osláv svoje meno, Pane.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"33", "3", "", "Dt 4, 1. 5-9",
                    "Strážte prikázania a uskutočňujte ich!",
                    "Čítanie z Knihy Deuteronómium<br>" +
                            "Mojžiš povedal ľudu: \"A teraz, Izrael, počúvaj prikázania a ustanovenia, ktoré vás učím, a zachovávajte ich, aby ste žili a vošli do\u00A0krajiny, ktorú vám chce dať Pán, Boh vašich otcov, do\u00A0vlastníctva.<br>" +
                            "Hľa, učil som vás príkazy a ustanovenia, ako mi nariadil Pán, môj Boh, aby ste ich plnili v\u00A0krajine, ktorú dostanete do\u00A0vlastníctva.<br>" +
                            "Strážte ich a uskutočňujte! Lebo len tak budete múdri a rozumní v\u00A0očiach národov. Budú počuť o\u00A0všetkých týchto prikázaniach a povedia: ‚Skutočne múdry a rozumný je tento veľký národ.'<br>" +
                            "Veď ktorý národ je taký veľký a má bohov tak blízko, ako je nám blízko Pán, náš Boh, kedykoľvek ho vzývame?! A kde je národ taký slávny, ktorý by mal také spravodlivé prikázania a ustanovenia, ako sú všetky tieto zákony, ktoré vám ja dnes predkladám?!<br>" +
                            "Len dávaj veľký pozor na\u00A0seba a na\u00A0svoju dušu a nezabudni na\u00A0veci, ktoré si videl na\u00A0vlastné oči, nech nevymiznú z\u00A0tvojho srdca cez\u00A0celý tvoj život, ale pouč o\u00A0nich svojich synov a svojich vnukov.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"34", "4", "", "Jer 7, 23-28",
                    "Toto je národ, ktorý nepočúva hlas Pána, svojho Boha",
                    "Čítanie z Knihy proroka Jeremiáša<br>" +
                            "Pán hovorí: \"Dal som svojmu ľudu toto prikázanie: Počúvajte môj hlas a budem vaším Bohom a vy budete mojím ľudom. Kráčajte vždy po\u00A0ceste, po\u00A0ktorej som vám prikázal ísť, aby vám dobre bolo.<br>" +
                            "Ale nepočúvali a nenaklonili si ucho, lež odišli za\u00A0svojimi chúťkami a v\u00A0zatvrdilosti svojho zvrhlého srdca sa obrátili ku\u00A0mne chrbtom a nie tvárou; odo\u00A0dňa, čo ich otcovia vyšli z\u00A0Egypta až podnes.<br>" +
                            "A posielal som vám mnohých svojich sluhov, prorokov; denne som vstával na\u00A0úsvite a posielal ich, no nepočúvali ma, nenaklonili si ucho, zatvrdili si šiju a robili horšie ako ich otcovia.<br>" +
                            "A ak im aj povieš všetky tieto veci, nebudú ťa počúvať. Ak na\u00A0nich zavoláš, neozvú sa ti. Povieš im teda: Toto je národ, ktorý nepočúva hlas Pána, svojho Boha, a neprijíma napomenutie. Zhynula vernosť, zmizla im z\u00A0úst.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"35", "5", "", "Oz 14, 2-10",
                    "Nebudeme hovoriť o\u00A0dielach svojich rúk: Naši bohovia",
                    "Čítanie z Knihy proroka Ozeáša<br>" +
                            "Toto hovorí Pán: \"Vráť sa, Izrael, k\u00A0Pánovi, svojmu Bohu, lebo si uviazol vo\u00A0svojej neprávosti. Pripravte si slová, vráťte sa k\u00A0Pánovi a povedzte mu: ‚Odpusť všetku vinu, prijmi, čo je dobré, chceme splácať plodom svojich perí. Asýrsko nás nezachráni; už nevysadneme na\u00A0koňa a už nebudeme hovoriť o\u00A0dielach svojich rúk: Naši bohovia, lebo sirota u\u00A0teba nájde milosrdenstvo.'<br>" +
                            "Vyliečim ich nevernosť, úprimne ich budem milovať, lebo sa môj hnev od\u00A0nich odvrátil. Budem pre\u00A0Izrael ako rosa, kvitnúť bude ako ľalia, korene zapustí ako Libanon. Jeho konáre sa rozrastú, nádherný bude ako oliva a voňať bude ako Libanon.<br>" +
                            "Vrátia sa a v\u00A0mojej tôni sa usadia, pestovať budú pšenicu a rozkvitnú ako vinica, ktorá má chýr ako víno z\u00A0Libanonu. Efraim, čo chce ešte s\u00A0modlami? Ja ho vyslyším a zhliadnem na\u00A0neho. Ja som ako jedľa stále zelená. Odo\u00A0mňa pochádza tvoje ovocie.'<br>" +
                            "Kto je múdry, nech to pochopí, kto je rozumný, nech to rozpozná! Lebo priame sú cesty Pánove a spravodliví po\u00A0nich kráčajú; no vzbúrenci na\u00A0nich zahynú.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"36", "6", "", "Oz 6, 1-6",
                    "Lásku chcem, a nie obetu",
                    "Čítanie z Knihy proroka Ozeáša<br>" +
                            " \"Poďte, vráťme sa k\u00A0Pánovi, lebo on nás poranil a on nás uzdraví, on nás udrel, on nás aj ošetrí. Po\u00A0dvoch dňoch nás oživí, na\u00A0tretí deň nám pomôže vstať a budeme žiť pred\u00A0jeho tvárou.<br>" +
                            "Poznávajme, usilujme sa poznať Pána: jeho príchod je istý ako zornica. Príde k\u00A0nám ako dážď v\u00A0pravý čas, ako dážď neskorý, čo zavlaží zem.\"<br>" +
                            "Čo mám robiť s\u00A0tebou, Efraim? Čo mám robiť s\u00A0tebou, Júda? Vaša láska je ako ranný mráčik a ako rosa, ktorá zrána pominie. Preto som ich okresával skrze prorokov, zabíjal slovami svojich úst. Spravodlivosť moja jak svetlo vychádza. Lásku chcem, a nie obetu; poznanie Boha viac ako zápalnú obetu.<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "A", "", "1 Sam 16, 1b. 6-7. 10-13a ",
                    "Pomazanie Dávida za\u00A0kráľa Izraela",
                    "Čítanie z Prvej knihy Samuelovej<br>" +
                            "Pán povedal Samuelovi: \"Naplň si roh olejom a choď! Posielam ťa do\u00A0Betlehema k\u00A0Izaimu, lebo spomedzi jeho synov som si vyhliadol kráľa.\"<br>" +
                            "Keď Samuel prišiel k\u00A0Izaimu a videl Eliaba, povedal si: \"Toto je iste Pánov pomazaný.\"<br>" +
                            "Ale Pán povedal Samuelovi: \"Nehľaď na\u00A0jeho tvár ani na\u00A0výšku postavy; tohoto som si nevybral. Ja nehľadím ako človek. Človek vidí iba vonkajšok, ale Pán vidí do\u00A0srdca.\"<br>" +
                            "Izai predviedol Samuelovi sedem svojich synov, ale Samuel povedal: \"Pán si z\u00A0týchto nevyvolil ani jedného.\"<br>" +
                            "A Samuel povedal Izaimu: \"Sú to všetci tvoji synovia?\"<br>" +
                            "On odpovedal: \"Ešte chýba najmenší, ten pasie ovce.\"<br>" +
                            "Samuel povedal Izaimu: \"Pošli poň a priveď ho; ani si nesadneme k\u00A0stolu, kým nepríde.\"<br>" +
                            "Poslal teda poň a priviedol ho; bol ryšavý, mal pekné oči a príjemný vzhľad.<br>" +
                            "A Pán povedal: \"Vstaň, pomaž ho, to je on.\"<br>" +
                            "Samuel vzal roh s\u00A0olejom a pomazal ho uprostred jeho bratov. A od\u00A0toho dňa pôsobil na\u00A0Dávida Pánov duch.<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "B", "", "2 Krn 36, 14-16. 19-23",
                    "Vyhnanstvom a vyslobodením ľudu Pán ukázal svoj hnev i milosrdenstvo",
                    "Čítanie z Druhej knihy Kroník<br>" +
                            "Všetky kňazské kniežatá i ľud množili nevernosti, napodobňovali všetky ohavnosti pohanov a poškvrnili Pánov dom, ktorý si zasvätil v\u00A0Jeruzaleme.<br>" +
                            "Pán, Boh ich otcov, posielal k\u00A0nim poslov a vo\u00A0dne v\u00A0noci ich napomínal, lebo mu bolo ľúto svojho ľudu a svojho príbytku. Ale oni vysmiali Božích poslov, pohŕdali jeho slovami a tupili jeho prorokov, až vzrástol Pánov hnev proti jeho ľudu a už nebolo lieku.<br>" +
                            "Nepriatelia spálili Boží dom, zrúcali jeruzalemské múry, podpálili všetky paláce a zničili všetky cenné predmety. Tých, čo unikli meču, odvliekli do\u00A0Babylonu a stali sa otrokmi kráľa a jeho synov, kým sa nezačalo kráľovstvo Peržanov. Tak sa splnilo Pánovo slovo, ktoré povedal ústami Jeremiáša: Teraz zem dostala svoje soboty, cez\u00A0celý čas spustošenia odpočívala, až sa naplnilo sedemdesiat rokov.<br>" +
                            "V prvom roku Kýra, kráľa Peržanov, sa splnilo, čo Pán povedal ústami Jeremiáša. Pán vnukol Kýrovi, kráľovi Peržanov, a on po\u00A0celom svojom kráľovstve nariadil vyhlásiť aj písomne: \"Takto hovorí Kýros, kráľ Peržanov: Pán, Boh nebies, mi dal všetky kráľovstvá zeme. A rozkázal mi, aby som mu postavil dom v\u00A0Jeruzaleme, ktorý je v\u00A0Judei. S\u00A0každým, kto patrí k\u00A0jeho ľudu, nech je Pán, jeho Boh, a nech vystúpi.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "C", "", "Joz 5, 9a. 10-12",
                    "Boží ľud vošiel do\u00A0zasľúbenej zeme a slávil Veľkú noc",
                    "Čítanie z Knihy Jozue<br>" +
                            "Pán povedal Jozuemu: \"Dnes som z\u00A0vás odstránil egyptskú potupu.\"<br>" +
                            "Synovia Izraela sa utáborili v\u00A0Galgale a štrnásteho dňa mesiaca navečer slávili na\u00A0jerišských stepiach Veľkú noc.<br>" +
                            "Od nasledujúceho dňa jedli z\u00A0úrody zeme nekvasený chlieb a pražené zrno; práve v\u00A0ten istý deň.<br>" +
                            "Na druhý deň, ako jedli z\u00A0úrody zeme, prestala manna a synovia Izraela už tento pokrm nepožívali, ale toho roku jedli z\u00A0úrody kanaánskej krajiny.<br>" +
                            "Počuli sme Božie slovo."},
            {"41", "1", "", "Iz 65, 17-21",
                    "Už nebude počuť plač ani bolestné volanie",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán: \"Hľa, ja tvorím nové nebo a novú zem, na\u00A0predošlé sa nebude spomínať, ani na\u00A0myseľ neprídu; tešiť sa budú a večne jasať nad\u00A0tými, ktoré ja stvorím. Lebo ja urobím z\u00A0Jeruzalema mesto plesania a z\u00A0jeho obyvateľov ľud radosti. A budem plesať nad\u00A0Jeruzalemom, tešiť sa budem zo\u00A0svojho ľudu; už tam nebude počuť plač ani bolestné volanie. Nebude tam dieťa, čo žije len niekoľko dní, ani starec, ktorý nedoplní svoj vek, lebo najmladší zomrie ako storočný, a kto sa nedožije sto rokov, bude prekliaty.<br>" +
                            "Budú stavať domy a bývať v\u00A0nich budú sadiť vinice a jesť ich ovocie.<br>" +
                            "Počuli sme Božie slovo."},
            {"42", "2", "", "Ez 47, 1-9. 12",
                    "Videl som vodu vytekať z\u00A0chrámu; a všetko, k\u00A0čomu sa táto voda dostala, ozdravelo",
                    "Čítanie z Knihy proroka Ezechiela<br>" +
                            "Anjel ma obrátil k\u00A0bráne chrámu a hľa, spod prahu chrámu vyvierala voda smerom na\u00A0východ – na\u00A0východ bolo totiž obrátené chrámové priečelie – a tiekla z\u00A0pravej strany chrámu, južne od\u00A0oltára. Potom ma vyviedol severnou bránou von a obrátil ma smerom k\u00A0vonkajšej bráne, obrátenej na\u00A0východ, a hľa, voda vytekala z\u00A0pravej strany.<br>" +
                            "Vtom vyšiel smerom na\u00A0východ muž s\u00A0meradlom v\u00A0ruke. Odmeral tisíc lakťov a previedol ma cez\u00A0vodu – bola po\u00A0členky. Zasa odmeral tisíc lakťov a previedol ma cez\u00A0vodu – bola po\u00A0kolená. Znova odmeral tisíc lakťov a previedol ma cez\u00A0vodu – bola po\u00A0pás. Odmeral ešte tisíc lakťov a bola to rieka, cez\u00A0ktorú som nemohol prejsť, lebo voda sa tak zdvihla, že bolo po\u00A0nej treba plávať; bola to rieka, ktorú nemožno prebrodiť.<br>" +
                            "A povedal mi: \"Videl si, syn človeka.\"<br>" +
                            "Potom ma zaviedol na\u00A0breh rieky a obrátil. Keď som sa obrátil, videl som na\u00A0oboch brehoch rieky veľké množstvo stromov. A povedal mi: \"Táto voda prúdi do\u00A0východnej krajiny, preteká cez\u00A0Arabu, vleje sa do\u00A0mora, do\u00A0slaných vôd, a vody sa uzdravia. A všade, kam sa rieka dostane, bude žiť všetko, čo sa hýbe; bude veľmi mnoho rýb všade, kam sa dostane táto voda; ozdravie a žiť bude všetko, k\u00A0čomu sa rieka dostane.<br>" +
                            "Pri rieke, na\u00A0oboch jej brehoch, budú rásť rozličné ovocné stromy. Lístie z\u00A0nich neopadne a nikdy nebudú bez\u00A0ovocia. Každý mesiac prinesú čerstvé plody, lebo jej voda vyteká zo\u00A0svätyne. Ich ovocie bude pokrmom a ich lístie liekom.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"43", "3", "", "Iz 49, 8-15",
                    "Zmluvou ľudu ťa urobím, aby si pozdvihol krajinu",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán: \"V milostivom čase ťa vyslyším a v\u00A0deň spásy ti pomôžem, ochránim ťa a zmluvou ľudu ťa urobím, aby si pozdvihol krajinu a rozdelil spustošené dedičstvo, aby si väzňom povedal: ‚Vyjdite!' a tým, čo sú vo\u00A0tme: ‚Zjavte sa!'<br>" +
                            "Budú sa pásť popri cestách, ich pastva bude na\u00A0všetkých holých pahorkoch. Nebudú lačnieť ani žízniť a nezraní ich úpal ani slnce; lebo ich bude viesť ten, čo sa zľutoval nad\u00A0nimi, a k\u00A0prameňom vôd ich privedie. Zo\u00A0všetkých svojich vrchov cesty porobím a moje chodníky sa vyvýšia. Hľa, títo prídu zďaleka, tí, hľa, od\u00A0severu a od\u00A0mora a tamtí z\u00A0krajiny Sinim.\"<br>" +
                            "Plesaj, nebo, a jasaj, zem, plesaním znejte vrchy, lebo Pán utešuje svoj ľud a nad\u00A0svojimi biednymi sa zľutúva.<br>" +
                            "Sion povedal: \"Pán ma opustil, Pán na\u00A0mňa zabudol.\" Môže matka zabudnúť na\u00A0svoje nemluvňa a nezľutuje sa nad\u00A0synom svojho lona?<br>" +
                            "A keby aj ona zabudla, ja na\u00A0teba nezabudnem.<br>" +
                            "Počuli sme Božie slovo."},
            {"44", "4", "", "Ex 32, 7-14",
                    "Odpusť zločin svojho ľudu",
                    "Čítanie z Knihy Exodus<br>" +
                            "Pán povedal Mojžišovi: \"Choď, zostúp, lebo tvoj ľud, ktorý si vyviedol z\u00A0egyptskej krajiny, sa skazil. Veľmi rýchlo odbočili z\u00A0cesty, ktorú som im určil. Urobili si z\u00A0kovu teľa a klaňali sa mu, priniesli mu obetu a povedali: ‚Toto sú tvoji bohovia, Izrael, čo ťa vyviedli z\u00A0egyptskej krajiny.'\"<br>" +
                            "Potom Pán povedal Mojžišovi: \"Vidím, že tento ľud má nepoddajnú šiju. Nechaj ma, nech vzplanie môj hnev proti nim, vyhubím ich a z\u00A0teba urobím veľký národ.\"<br>" +
                            "Ale Mojžiš prosil Pána, svojho Boha, a hovoril: \"Pane, prečo planie tvoj hnev proti tvojmu ľudu, ktorý si veľkou silou a mocnou rukou vyviedol z\u00A0egyptskej krajiny? Nech, prosím, nepovedia Egypťania: ‚Podvodne ich vyviedol, aby ich pozabíjal na\u00A0horách a vyničil zo\u00A0zemského povrchu.' Nech utíchne tvoj hnev a odpusť zločin svojho ľudu!<br>" +
                            "Spomeň si na\u00A0Abraháma, Izáka a Izraela, svojich služobníkov, ktorým si na\u00A0seba samého prisahal a vyhlásil: ‚Rozmnožím vaše potomstvo ako hviezdy na\u00A0nebi a celú túto krajinu, o\u00A0ktorej som hovoril, dám vášmu potomstvu a budete ju mať navždy.'\"<br>" +
                            "A Pán sa zriekol svojho zámeru a nedopustil skazu, ktorú vyhlásil svojmu ľudu.<br>" +
                            "Počuli sme Božie slovo."},
            {"45", "5", "", "Múd 2, 1a. 12-22",
                    "Odsúďme ho na\u00A0smrť potupnú",
                    "Čítanie z Knihy múdrosti<br>" +
                            "Bezbožní hovoria vo\u00A0svojom zvrátenom zmýšľaní: \"Číhajme na\u00A0spravodlivého, lebo nám je na\u00A0ťarchu. Stavia sa proti nášmu správaniu, vyčíta nám prestupovanie zákona, žaluje, že sme zradili svoju výchovu. Chvastá sa, že pozná Boha, a Božím synom sa nazýva.<br>" +
                            "Obžalúva naše zmýšľanie, už aj pohľad na\u00A0neho je nám na\u00A0ťarchu. Lebo jeho život je nepodobný ostatným a odlišné sú jeho chodníky. Pokladá nás za\u00A0spotvorených a bočí od\u00A0našich ciest ako od\u00A0nečistoty; blahoslaví údel spravodlivých a chváli sa, že Boh mu je otcom.<br>" +
                            "Nuž pozrime, či sú jeho reči pravdivé, a skúsme, ako sa to s\u00A0ním skončí. Lebo ak je ozaj Božím synom, on sa ho ujme a vyslobodí ho z\u00A0rúk odporcov.<br>" +
                            "Skúšajme ho potupou a súžením, aby sme poznali jeho miernosť a vyskúšali jeho trpezlivosť. Odsúďme ho na\u00A0smrť potupnú, veď mu príde pomoc, ako hovorí.\"<br>" +
                            "Takto uvažujú a mýlia sa, lebo vlastná zloba ich zaslepila. Nepoznajú Božie tajomstvá, ani odmenu za\u00A0svätosť nečakajú a ani v\u00A0oslávenie čistých duší neveria.<br>" +
                            "Počuli sme Božie slovo."},
            {"46", "6", "", " Jer 11, 18-20",
                    "Bol som ako krotký baránok, vedený na\u00A0zabitie",
                    "Čítanie z Knihy proroka Jeremiáša <br>" +
                            "Pane, ty si mi to zjavil a ja som pochopil; ukázal si mi ich výčiny.<br>" +
                            "Bol som ako krotký baránok, vedený na\u00A0zabitie; nevedel som, že stroja proti mne úklady: \"Vytnime strom v\u00A0jeho miazge, vykoreňme ho zo\u00A0zeme živých, nech sa už ani nespomenie jeho meno!\"<br>" +
                            "Ale ty, Pane zástupov, súdiš spravodlivo, ty skúmaš srdce i zmýšľanie, nech uvidím na\u00A0nich tvoju pomstu, veď tebe som postúpil svoj spor.<br>" +
                            "Počuli sme Božie slovo."},
            {"50", "A", "", "Ez 37, 12b-14",
                    "Vložím do\u00A0vás svojho ducha a ožijete",
                    "Čítanie z Knihy proroka Ezechiela<br>" +
                            "\"Toto hovorí Pán, Boh: Ľud môj, ja otvorím vaše hroby, vyvediem vás z\u00A0vašich hrobov a vovediem vás do\u00A0krajiny Izraela. A spoznáte, že ja som Pán, keď otvorím vaše hroby a vyvediem vás z\u00A0vašich hrobov, ľud môj.<br>" +
                            "Vložím do\u00A0vás svojho ducha a ožijete. Usadím vás na\u00A0vlastnej pôde a spoznáte, že ja som Pán. Povedal som a splním,\" hovorí Pán, Boh.<br>" +
                            "Počuli sme Božie slovo."},
            {"50", "B", "", "Jer 31, 31-34",
                    "Uzavriem novú zmluvu a na\u00A0ich hriech si už nespomeniem",
                    "Čítanie z Knihy proroka Jeremiáša<br>" +
                            "\"Hľa, prichádzajú dni, hovorí Pán, keď uzavriem s\u00A0domom Izraela a s\u00A0domom Júdu novú zmluvu; nie takú zmluvu, akú som uzavrel s\u00A0ich otcami v\u00A0ten deň, keď som ich vzal za\u00A0ruku a vyviedol z\u00A0egyptskej krajiny, a oni túto zmluvu porušili, hoci ja som bol ich Pánom, hovorí Pán.<br>" +
                            "Takáto bude zmluva, ktorú po\u00A0tých dňoch uzavriem s\u00A0domom Izraela, hovorí Pán: Svoj zákon vložím do\u00A0ich vnútra a vpíšem ho do\u00A0ich srdca; ja budem ich Bohom a oni budú mojím ľudom.<br>" +
                            "Nik nebude poúčať svojho blížneho ani brat brata slovami: ‚Poznaj Pána!', lebo ma budú poznať všetci, malí i veľkí, hovorí Pán. Odpustím im ich neprávosť a na\u00A0ich hriech si už nespomeniem.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"50", "C", "", "Iz 43, 16-21",
                    "Hľa, tvorím čosi nové a napojím svoj ľud",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán, ktorý urobil cestu cez\u00A0more a cez\u00A0dravé vody chodník; ktorý vyviedol vozy i kone, vojsko i vojvodcov – ležia mŕtvi, už nevstanú, zanikli, zhasli ako knôt –: \"Nemyslite na\u00A0to, čo bolo, nesnite o\u00A0veciach dávnych. Hľa, ja tvorím čosi nové, teraz to klíči; nebadáte? Áno, na\u00A0púšti urobím cestu a rieky na\u00A0pustatine.<br>" +
                            "Bude ma chváliť poľná zverina, šakaly a pštrosy, že som dal vodu na\u00A0púšti a rieky na\u00A0pustatine, aby som napojil svoj ľud, svojho vyvolenca.<br>" +
                            "Ľud, ktorý som si stvoril, bude ohlasovať moju chválu.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"51", "1", "", "Dan 13, 1-9. 15-17. 19-30. 33-62",
                    "Pozri, umieram, hoci som neurobila nič z\u00A0toho",
                    "Čítanie z Knihy proroka Daniela<br>" +
                            "V Babylone býval muž, menom Joakim. Za\u00A0manželku si vzal veľmi peknú a bohabojnú Helkiášovu dcéru Zuzanu. Jej rodičia boli spravodliví a svoju dcéru vychovávali podľa Mojžišovho zákona. Joakim bol veľmi bohatý a pri\u00A0dome mal ovocnú záhradu. A pretože si ho veľmi vážili, schádzali sa uňho Židia.<br>" +
                            "V tom roku ustanovili z\u00A0ľudu za\u00A0sudcov dvoch starcov, o\u00A0ktorých povedal Pán, že neprávosť vyšla z\u00A0Babylonu od\u00A0starších sudcov, ktorí len zdanlivo spravovali ľud. Oni často chodievali do\u00A0Joakimovho domu a ta k\u00A0nim prichádzali všetci, čo mali spory. Keď okolo poludnia ľud odišiel, vchádzala Zuzana a prechádzala sa v\u00A0záhrade svojho muža. Obaja starci ju deň čo deň videli vchádzať a prechádzať sa. Zahoreli žiadostivosťou po\u00A0nej, rozvrátili si myseľ a odvrátili oči, že nevideli nebo, a nepamätali na\u00A0spravodlivé súdy.<br>" +
                            "A keď striehli na\u00A0vhodnú príležitosť, vošla raz ako včera a predvčerom len s\u00A0dvoma slúžkami a chcela sa v\u00A0záhrade kúpať, lebo bolo horúco. Nebolo tam nikoho okrem dvoch starcov, ktorí sa schovali a pozorovali ju.<br>" +
                            "Ona povedala slúžkam: \"Doneste mi olej a masti a zatvorte dvere záhrady, okúpem sa.\"<br>" +
                            "A keď slúžky odišli, obaja starci vstali, pribehli k\u00A0nej a povedali: \"Pozri, dvere záhrady sú zatvorené, nik nás nevidí a my túžime po\u00A0tebe; pristaň teda a oddaj sa nám! Ak by si nechcela, budeme svedčiť proti tebe, že bol s\u00A0tebou akýsi mladík, a preto si poslala slúžky preč.\"<br>" +
                            "Zuzana zakvílila a povedala: \"Úzkosť ma zviera z\u00A0oboch strán: ak to urobím, bude to pre\u00A0mňa smrť, ak neurobím, neuniknem vašim rukám. No lepšie bude pre\u00A0mňa, keď to neurobím a padnem do\u00A0vašich rúk, ako zhrešiť pred\u00A0Pánovou tvárou.\"<br>" +
                            "A Zuzana mocne vykríkla. Ale skríkli aj starci proti nej. A jeden bežal otvoriť dvere záhrady.<br>" +
                            "Keď domáci sluhovia počuli krik v\u00A0záhrade, vtrhli cez\u00A0zadný vchod pozrieť, čo sa jej stalo. A keď im starci rozpovedali svoje výmysly, sluhovia sa veľmi hanbili, lebo sa nikdy nič podobné o\u00A0Zuzane nehovorilo.<br>" +
                            "Keď na\u00A0druhý deň prišiel ľud k\u00A0jej manželovi Joakimovi, prišli aj dvaja starci, plní zločinného zámeru proti Zuzane, že ju zabijú. Povedali pred\u00A0ľudom: \"Pošlite pre\u00A0Helkiášovu dcéru Zuzanu, Joakimovu manželku!\" A hneď poslali.<br>" +
                            "Prišla s\u00A0rodičmi, deťmi a so\u00A0svojimi príbuznými. Jej príbuzní a všetci, čo ju videli, plakali.<br>" +
                            "Vtedy uprostred ľudu povstali obaja starci a položili ruky na\u00A0jej hlavu. Ona s\u00A0plačom pozdvihla oči k\u00A0nebu, lebo srdce mala plné dôvery v\u00A0Pána. Starci povedali: \"Keď sme sa my dvaja prechádzali po\u00A0záhrade, vošla táto s\u00A0dvoma slúžkami, zatvorila dvere záhrady a slúžky poslala preč. Prišiel k\u00A0nej mladík, ktorý bol skrytý, a zhrešil s\u00A0ňou. Ale my sme boli v\u00A0rohu záhrady a keď sme videli zločin, bežali sme k\u00A0nim a videli sme ich spolu hrešiť. Jeho sme nemohli chytiť, pretože bol mocnejší ako my, otvoril dvere a vyskočil von. Ju sme však chytili a pýtali sme sa, kto bol ten mladík, no nechcela nám prezradiť. Toto môžeme dosvedčiť.\"<br>" +
                            "Zástup im ako starším ľudu a sudcom uveril a odsúdili ju na\u00A0smrť.<br>" +
                            "Ale Zuzana mocne vykríkla: \"Bože večný, ty poznáš skryté veci, ty vieš všetko skôr, ako sa stane, ty vieš, že krivo proti mne svedčili; pozri, umieram, hoci som neurobila nič z\u00A0toho, čo títo zločinne osnovali proti mne.\"<br>" +
                            "A Pán vyslyšal jej hlas. Keď ju viedli na\u00A0smrť, Pán vzbudil svätého ducha v\u00A0mladom chlapcovi, ktorý sa volal Daniel, a on vykríkol: \"Ja nemám vinu na\u00A0krvi tejto ženy.\"<br>" +
                            "Všetok ľud sa obrátil k\u00A0nemu a povedal: \"Čo je to za\u00A0reč, čo hovoríš?\"<br>" +
                            "On si stal doprostred nich a povedal: \"Takí hlúpi ste, synovia Izraela? Bez\u00A0 súdu, bez\u00A0skúmania pravdy ste odsúdili dcéru Izraela. Obnovte súd, pretože krivo proti nej svedčili.\"<br>" +
                            "Ľud sa rýchlo vrátil a starší mu povedali: \"Poď, sadni si medzi nás a hovor, pretože ti Boh dal vážnosť starca.\"<br>" +
                            "Daniel im povedal: \"Oddeľte ich ďaleko od\u00A0seba a ja ich rozsúdim.\"<br>" +
                            "Keď ich oddelili jedného od\u00A0druhého, zavolal jedného z\u00A0nich a povedal mu: \"Ty, čo si zostarel v\u00A0zlobe, teraz vyšli najavo tvoje hriechy, ktoré si doteraz páchal, keď si vynášal nespravodlivé rozsudky, nevinných utláčal a prepúšťal vinných, hoci Pán riekol: ‚Nevinného a spravodlivého nezabiješ.' Nuž teraz, ak si ju naozaj videl, povedz, pod\u00A0akým stromom sa zhovárali?\"<br>" +
                            "On odpovedal: \"Pod lentyškom.\"<br>" +
                            "Daniel povedal: \"Pekne si luhal proti vlastnej hlave. Hľa, Boží anjel dostal od\u00A0Boha príkaz a rozsekne ťa na\u00A0dvoje.\"<br>" +
                            "Keď ho odviedli, rozkázal priviesť druhého a povedal mu: \"Semä kanaánske, a nie judejské, krása ťa zviedla a žiadostivosť ti rozvrátila srdce. Takto ste robievali dcéram Izraela a ony sa zo\u00A0strachu dávali s\u00A0vami do\u00A0reči. No Júdova dcéra nestrpela vašu neprávosť. Teraz mi povedz, pod\u00A0akým stromom si ich prichytil zhovárať sa?\"<br>" +
                            "Ten povedal: \"Pod dubom.\"<br>" +
                            "A Daniel mu povedal: \"Pekne si luhal aj ty proti vlastnej hlave; lebo Boží anjel čaká s\u00A0mečom, aby ťa preťal napoly a usmrtil vás.\"<br>" +
                            "Celý zástup mocne vykríkol a dobrorečil Bohu, ktorý zachraňuje tých, čo v\u00A0neho dúfajú.<br>" +
                            "I povstali proti dvom starcom, lebo ich Daniel z\u00A0vlastných úst usvedčil, že krivo svedčili, a urobili im, ako oni zločinne robili svojim blížnym, aby splnili Mojžišov zákon; usmrtili ich a v\u00A0ten deň sa nevinná krv zachránila.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Dan 13, 41c-62",
                    "Pozri, umieram, hoci som neurobila nič z\u00A0toho",
                    "Čítanie z Knihy proroka Daniela<br>" +
                            "Zástup odsúdil Zuzanu na\u00A0smrť. Ale Zuzana mocne vykríkla: \"Bože večný, ty poznáš skryté veci, ty vieš všetko skôr, ako sa stane, ty vieš, že krivo proti mne svedčili; pozri, umieram, hoci som neurobila nič z\u00A0toho, čo títo zločinne osnovali proti mne.\"<br>" +
                            "A Pán vyslyšal jej hlas. Keď ju viedli na\u00A0smrť, Pán vzbudil svätého ducha v\u00A0mladom chlapcovi, ktorý sa volal Daniel, a on vykríkol: \"Ja nemám vinu na\u00A0krvi tejto ženy.\"<br>" +
                            "Všetok ľud sa obrátil k\u00A0nemu a povedal: \"Čo je to za\u00A0reč, čo hovoríš?\"<br>" +
                            "On si stal doprostred nich a povedal: \"Takí hlúpi ste, synovia Izraela? Bez\u00A0 súdu, bez\u00A0skúmania pravdy ste odsúdili dcéru Izraela. Obnovte súd, pretože krivo proti nej svedčili.\"<br>" +
                            "Ľud sa rýchlo vrátil a starší mu povedali: \"Poď, sadni si medzi nás a hovor, pretože ti Boh dal vážnosť starca.\"<br>" +
                            "Daniel im povedal: \"Oddeľte ich ďaleko od\u00A0seba a ja ich rozsúdim.\"<br>" +
                            "Keď ich oddelili jedného od\u00A0druhého, zavolal jedného z\u00A0nich a povedal mu: \"Ty, čo si zostarel v\u00A0zlobe, teraz vyšli najavo tvoje hriechy, ktoré si doteraz páchal, keď si vynášal nespravodlivé rozsudky, nevinných utláčal a prepúšťal vinných, hoci Pán riekol: ‚Nevinného a spravodlivého nezabiješ.' Nuž teraz, ak si ju naozaj videl, povedz, pod\u00A0akým stromom sa zhovárali?\"<br>" +
                            "On odpovedal: \"Pod lentyškom.\"<br>" +
                            "Daniel povedal: \"Pekne si luhal proti vlastnej hlave. Hľa, Boží anjel dostal od\u00A0Boha príkaz a rozsekne ťa na\u00A0dvoje.\"<br>" +
                            "Keď ho odviedli, rozkázal priviesť druhého a povedal mu: \"Semä kanaánske, a nie judejské, krása ťa zviedla a žiadostivosť ti rozvrátila srdce. Takto ste robievali dcéram Izraela a ony sa zo\u00A0strachu dávali s\u00A0vami do\u00A0reči. No Júdova dcéra nestrpela vašu neprávosť. Teraz mi povedz, pod\u00A0akým stromom si ich prichytil zhovárať sa?\"<br>" +
                            "Ten povedal: \"Pod dubom.\"<br>" +
                            "A Daniel mu povedal: \"Pekne si luhal aj ty proti vlastnej hlave; lebo Boží anjel čaká s\u00A0mečom, aby ťa preťal napoly a usmrtil vás.\"<br>" +
                            "Celý zástup mocne vykríkol a dobrorečil Bohu, ktorý zachraňuje tých, čo v\u00A0neho dúfajú.<br>" +
                            "I povstali proti dvom starcom, lebo ich Daniel z\u00A0vlastných úst usvedčil, že krivo svedčili, a urobili im, ako oni zločinne robili svojim blížnym, aby splnili Mojžišov zákon; usmrtili ich a v\u00A0ten deň sa nevinná krv zachránila.<br>" +
                            "Počuli sme Božie slovo."},
            {"52", "2", "", "Nm 21, 4-9",
                    "Ak sa pohryzený pozrie na\u00A0medeného hada, ostane nažive",
                    "Čítanie z Knihy Numeri<br>" +
                            "Izraeliti tiahli od\u00A0vrchu Hor po\u00A0ceste, ktorá vedie k\u00A0Červenému moru, aby obišli krajinu Edomčanov.<br>" +
                            "Ľud začal chabnúť na\u00A0ceste. Reptal proti Bohu i Mojžišovi: \"Prečo ste nás vyviedli z\u00A0Egypta? Aby sme umreli na\u00A0púšti? Niet chleba, niet vody! A tento biedny pokrm sa nám už protiví.\"<br>" +
                            "Preto Pán poslal na\u00A0ľudí ohnivé hady. Ony hrýzli ľud a mnoho ľudí z\u00A0Izraela zomrelo. Prišli k\u00A0Mojžišovi a povedali: \"Zhrešili sme, lebo sme reptali proti Pánovi a proti tebe. Pros Pána, aby nás oslobodil od\u00A0hadov.\"<br>" +
                            "Mojžiš sa modlil za\u00A0ľud a Pán mu povedal: \"Urob ohnivého hada a postav ho ako znamenie; ak sa pohryzený pozrie naň, ostane nažive.\"<br>" +
                            "Mojžiš teda urobil medeného hada a postavil ho ako znamenie. A keď naň pohryzení pozreli, ozdraveli.<br>" +
                            "Počuli sme Božie slovo."},
            {"53", "3", "", "Dan 3, 14-20. 91-92. 95",
                    "Poslal svojho anjela a vyslobodil svojich služobníkov",
                    "Čítanie z Knihy proroka Daniela<br>" +
                            "Kráľ Nabuchodonozor povedal: \"Je to pravda, Sidrach, Mizach a Abdenago, že neuctievate mojich bohov a neklaniate sa zlatej soche, ktorú som postavil? Ste ochotní teraz, hneď ako počujete zvuk trúby, píšťaly, citary, sambuky, harfy, symfónie a iných hudobných nástrojov, padnúť na\u00A0zem a klaňať sa soche, ktorú som urobil? Ak sa nebudete klaňať, v\u00A0tú hodinu vás hodia do\u00A0rozpálenej pece; a ktorý boh vás vyslobodí z\u00A0mojej ruky?\"<br>" +
                            "Sidrach, Mizach a Abdenago odpovedali Nabuchodonozorovi: \"Na toto ti nemusíme odpovedať; totiž či nás náš Boh, ktorého uctievame, môže zachrániť z\u00A0rozpálenej pece a či nás vyslobodí z\u00A0tvojej ruky, kráľ. Aj keby to neurobil, vedz, kráľ, že tvojich bohov si nectíme a zlatej soche, ktorú si postavil, sa neklaniame.\"<br>" +
                            "Vtedy Nabuchodonozor vzkypel zlosťou a tvár sa mu znetvorila pre\u00A0Sidracha, Mizacha a Abdenaga. Preto rozkázal, aby pec rozpálili sedemkrát viac ako zvyčajne, a najsilnejším mužom zo\u00A0svojho vojska rozkázal, aby Sidracha, Mizacha a Abdenaga zviazali a hodili do\u00A0rozpálenej pece.<br>" +
                            "Vtedy kráľ Nabuchodonozor užasol, rýchle vstal a povedal svojim dvoranom: \"Nehodili sme do\u00A0ohňa troch poviazaných mužov?\"<br>" +
                            "Oni kráľovi odpovedali: \"Tak je, kráľ.\"<br>" +
                            "A on povedal: \"Ja vidím štyroch mužov bez\u00A0pút; chodia uprostred ohňa bez\u00A0ujmy a štvrtý sa výzorom podobá synovi bohov.\"<br>" +
                            "A Nabuchodonozor vykríkol: \"Nech je zvelebený Boh Sidracha, Mizacha a Abdenaga, ktorý poslal svojho anjela a vyslobodil svojich služobníkov, čo v\u00A0neho dôverovali, prestúpili kráľov rozkaz a obetovali svoje telá, aby nemuseli slúžiť a klaňať sa inému bohu okrem svojho Boha.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"54", "4", "", "Gn 17, 3-9",
                    "Budeš otcom mnohých národov",
                    "Čítanie z Knihy Genezis<br>" +
                            "Abram padol na\u00A0tvár a Boh mu povedal: \"Hľa, moja zmluva s\u00A0tebou. Budeš otcom mnohých národov a už sa nebudeš volať Abram; budeš sa volať Abrahám, lebo ťa urobím otcom mnohých národov.<br>" +
                            "Dám sa ti rozrásť prenáramne, urobím z\u00A0teba národy, aj králi z\u00A0teba vzídu.<br>" +
                            "A uzavriem zmluvu medzi mnou a tebou i medzi tvojím potomstvom po\u00A0tebe vo\u00A0všetkých pokoleniach, zmluvu večnú, že budem Bohom tvojím i tvojho potomstva po\u00A0tebe.<br>" +
                            "Tebe a tvojmu potomstvu po\u00A0tebe dám krajinu, v\u00A0ktorej si ako cudzinec; celú zem Kanaán do\u00A0večného vlastníctva a budem ich Bohom.\"<br>" +
                            "Potom Boh povedal Abrahámovi: \"Ale aj ty zachováš moju zmluvu, aj tvoje potomstvo po\u00A0tebe vo\u00A0všetkých pokoleniach.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"55", "5", "", "Jer 20, 10-13",
                    "Pán je so\u00A0mnou sťa mocný bojovník",
                    "Čítanie z Knihy proroka Jeremiáša<br>" +
                            "Jeremiáš povedal: \"Počul som potupy mnohých: Hrôza zo\u00A0všetkých strán! ‚Udajte ho! A udáme ho.'<br>" +
                            "Aj tí, čo žili so\u00A0mnou v\u00A0priateľstve, striehnu na\u00A0môj pád: ‚Hádam sa dá oklamať, zmocníme sa ho a vypomstíme sa na\u00A0ňom.'<br>" +
                            "Ale Pán je so\u00A0mnou sťa mocný bojovník; preto tí, čo ma prenasledujú, padnú a nič nezmôžu, budú zahanbení, lebo nič nedosiahnu: bude to hanba večná, nezabudnuteľná.<br>" +
                            "Pane zástupov, čo skúšaš spravodlivého, ty skúmaš myseľ i srdce, nech vidím tvoju pomstu nad\u00A0nimi, lebo tebe som zveril svoj spor.<br>" +
                            "Spievajte Pánovi, oslavujte Pána, veď vyslobodil život úbohého z\u00A0ruky zločincov.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"56", "6", "", "Ez 37, 21-28",
                    "Urobím z\u00A0nich jeden národ",
                    "Čítanie z Knihy proroka Ezechiela<br>" +
                            "Toto hovorí Pán, Boh: \"Hľa, ja vezmem synov Izraela spomedzi národov, medzi ktoré išli, zhromaždím ich zovšadiaľ a privediem ich do\u00A0vlastnej krajiny a urobím z\u00A0nich jeden národ v\u00A0krajine, na\u00A0vrchoch Izraela. Všetkým bude vládnuť jeden kráľ a už nebudú viac dva národy, ani sa nebudú deliť na\u00A0dve kráľovstvá.<br>" +
                            "Už sa nebudú poškvrňovať svojimi modlami, svojimi ohavnosťami a všelijakými svojimi neprávosťami. Vyslobodím ich zo\u00A0všetkých neverností, ktorými sa prehrešili, očistím ich a budú mojím ľudom a ja budem ich Bohom.<br>" +
                            "Môj služobník Dávid bude ich kráľom a všetci budú mať jedného pastiera. Budú kráčať podľa mojich ustanovení, budú zachovávať a uskutočňovať moje nariadenia. Budú bývať v\u00A0krajine, ktorú som dal svojmu služobníkovi Jakubovi a v\u00A0ktorej bývali vaši otcovia. Budú v\u00A0nej bývať oni, ich deti a deti ich detí navždy a môj služobník Dávid bude ich kráľom naveky.<br>" +
                            "Uzavriem s\u00A0nimi zmluvu pokoja. Bude to večná zmluva s\u00A0nimi, že ich usadím a rozmnožím a uprostred nich navždy umiestim svoju svätyňu. Budem bývať s\u00A0nimi, budem ich Bohom a oni budú mojím ľudom. A národy poznajú, že ja som Pán, ktorý posväcuje Izraela; veď uprostred nich bude navždy moja svätyňa.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"60", "A", "", "Iz 50, 4-7",
                    "Tvár som si nezakryl pred\u00A0potupou, lebo viem, že sa nezahanbím\n" +
                            "Tretí spev Pánovho sluhu",
                    "Čítanie z Kniha proroka Izaiáša<br>" +
                            "Pán, Boh, mi dal jazyk učeníka, aby som vedel milým slovom posilniť unaveného.<br>" +
                            "Každé ráno prebúdza môj sluch, aby som počúval ako učeník. Pán, Boh, mi otvoril ucho. A ja som neodporoval, nazad som neustúpil.<br>" +
                            "Svoj chrbát som nastavil tým, čo bili, a svoje líca tým, čo trhali. Tvár som si nezakryl pred\u00A0potupou a slinou.<br>" +
                            "Pán, Boh, mi pomáha, preto nebudem zahanbený. On zatvrdil moju tvár sťa kremeň a viem, že sa nezahanbím.<br>" +
                            "Počuli sme Božie slovo."},
            {"60", "B", "", "Iz 50, 4-7",
                    "Tvár som si nezakryl pred\u00A0potupou, lebo viem, že sa nezahanbím\n" +
                            "Tretí spev Pánovho sluhu",
                    "Čítanie z Kniha proroka Izaiáša<br>" +
                            "Pán, Boh, mi dal jazyk učeníka, aby som vedel milým slovom posilniť unaveného.<br>" +
                            "Každé ráno prebúdza môj sluch, aby som počúval ako učeník. Pán, Boh, mi otvoril ucho. A ja som neodporoval, nazad som neustúpil.<br>" +
                            "Svoj chrbát som nastavil tým, čo bili, a svoje líca tým, čo trhali. Tvár som si nezakryl pred\u00A0potupou a slinou.<br>" +
                            "Pán, Boh, mi pomáha, preto nebudem zahanbený. On zatvrdil moju tvár sťa kremeň a viem, že sa nezahanbím.<br>" +
                            "Počuli sme Božie slovo."},
            {"60", "C", "", "Iz 50, 4-7",
                    "Tvár som si nezakryl pred\u00A0potupou, lebo viem, že sa nezahanbím\n" +
                            "Tretí spev Pánovho sluhu",
                    "Čítanie z Kniha proroka Izaiáša<br>" +
                            "Pán, Boh, mi dal jazyk učeníka, aby som vedel milým slovom posilniť unaveného.<br>" +
                            "Každé ráno prebúdza môj sluch, aby som počúval ako učeník. Pán, Boh, mi otvoril ucho. A ja som neodporoval, nazad som neustúpil.<br>" +
                            "Svoj chrbát som nastavil tým, čo bili, a svoje líca tým, čo trhali. Tvár som si nezakryl pred\u00A0potupou a slinou.<br>" +
                            "Pán, Boh, mi pomáha, preto nebudem zahanbený. On zatvrdil moju tvár sťa kremeň a viem, že sa nezahanbím.<br>" +
                            "Počuli sme Božie slovo."},
            {"61", "1", "", "Iz 42, 1-7",
                    "Nebude kričať, nebude počuť na\u00A0ulici jeho hlas\n" +
                            "Prvá pieseň o\u00A0Pánovom Služobníkovi",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Hľa, môj služobník, priviniem si ho; vyvolený môj, mám v\u00A0ňom zaľúbenie. Vložil som na\u00A0neho svojho ducha; právo prinesie národom.<br>" +
                            "Nebude kričať ani hlučne volať, nebude počuť na\u00A0ulici jeho hlas. Nalomenú trsť nedolomí, hasnúci knôtik nedohasí, bude uplatňovať právo. Nezoslabne, nezlomí sa, kým nezaloží právo na\u00A0zemi. Na\u00A0jeho zákon čakajú ostrovy.<br>" +
                            "Toto hovorí Pán, Boh, ktorý stvoril nebesia a rozprestrel ich, upevnil zem a jej rastlinstvo, ktorý dáva dych života ľudu, čo na\u00A0nej žije, a ducha tým, čo po\u00A0nej chodia: \"Ja, Pán, som ťa povolal v\u00A0spravodlivosti a vzal som ťa za\u00A0ruku. Utvoril som ťa a zmluvou ľudu som ťa urobil, svetlom národov, aby si otvoril oči slepým, vyviedol väzňov zo\u00A0žalára a z\u00A0väznice tých, čo sedia v\u00A0temnotách.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"62", "2", "", "Iz 49, 1-6",
                    "Urobím ťa svetlom národov, aby si bol mojou spásou až do\u00A0končín zeme\n" +
                            "Druhá pieseň o\u00A0Pánovom Služobníkovi",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Počúvajte ma, ostrovy, dávajte pozor, národy v\u00A0diaľavách; Pán ma z\u00A0matkinho lona povolal, už v\u00A0živote mojej matky myslel na\u00A0moje meno, ústa mi urobil sťa ostrý meč, ukryl ma v\u00A0tôni svojej ruky. Utvoril ma ako zaostrený šíp, do\u00A0svojho tulca ma uložil. A povedal mi: \"Ty si môj služobník, Izrael, na\u00A0tebe ukážem svoju slávu.\"<br>" +
                            "Ja som povedal: \"Nadarmo som sa namáhal, márne a zbytočne som mrhal svoju silu. Ale moje právo je isté u\u00A0Pána a moja odmena u\u00A0môjho Boha.\"<br>" +
                            "A teraz hovorí Pán, ten, čo si ma utváral za\u00A0služobníka už v\u00A0matkinom lone, aby som priviedol k\u00A0nemu Jakuba a Izraela okolo neho zhromaždil; tak som bol poctený v\u00A0očiach Pána a môj Boh sa mi stal silou.<br>" +
                            "Povedal: \"To je málo, že si môj služobník, aby si obnovil Jakubove kmene a naspäť priviedol zvyšok Izraela. Urobím ťa svetlom národov, aby moja spása siahala až do\u00A0končín zeme.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"63", "3", "", "Iz 50, 4-9b",
                    "Tvár som si nezakryl pred\u00A0potupou\n" +
                            "Tretia pieseň o\u00A0Pánovom Služobníkovi",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Pán, Boh, mi dal jazyk učeníka, aby som vedel milým slovom posilniť unaveného. Každé ráno prebúdza môj sluch, aby som počúval ako učeník. Pán, Boh, mi otvoril ucho. A ja som neodporoval, nazad som neustúpil.<br>" +
                            "Svoj chrbát som nastavil tým, čo bili, a svoje líca tým, čo trhali. Tvár som si nezakryl pred\u00A0potupou a slinou.<br>" +
                            "Pán, Boh, mi pomáha, preto nebudem zahanbený. On zatvrdil moju tvár sťa kremeň a viem, že sa nezahanbím. Blízko je ten, čo mi dá za\u00A0pravdu; kto sa chce prieť so\u00A0mnou? Postavmeže sa zoči-voči! Kto je mojím žalobcom? Nech pristúpi ku\u00A0mne!<br>" +
                            "Hľa, Pán, Boh, mi pomáha: ktože ma môže odsúdiť?<br>" +
                            "Počuli sme Božie slovo."},


            /* Fakultatívne čítania na\u00A03. pôstny týždeň
             {"", "", "", "Ex 17, 1-7",
             "Vytryskne voda a ľud sa napije",
             "Čítanie z Knihy Exodus<br>" +
             "Celá pospolitosť Izraelových synov odišla z\u00A0púšte Sin, podľa Božieho rozkazu prešli ďalšími úsekmi a utáborili sa v\u00A0Rafidim. Tam nebola pitná voda pre\u00A0ľud. Preto ľud doliehal na\u00A0Mojžiša a vravel: \"Daj nám vodu na\u00A0pitie!\"<br>" +
             "Mojžiš im odvetil: \"Prečo sa so\u00A0mnou vadíte a prečo pokúšate Pána?\"<br>" +
             "Ale vody nebolo a smädný ľud reptal proti Mojžišovi: \"Načo si nás len vyviedol z\u00A0Egypta? Aby si nás, naše deti a náš dobytok umoril smädom?\"<br>" +
             "Mojžiš volal k\u00A0Pánovi: \"Čo si počnem s\u00A0týmto ľudom? Málo chýba a ukameňuje ma.\"<br>" +
             "Pán povedal Mojžišovi: \"Kráčaj pred\u00A0ľudom, zober so\u00A0sebou niekoľko starších z\u00A0Izraela. Do\u00A0ruky si vezmi palicu, ktorou si udieral rieku, a choď! Hľa, ja budem stáť pred\u00A0tebou na\u00A0skale Horebu; udrieš na\u00A0skalu, vytryskne z\u00A0nej voda a ľud sa napije.\"<br>" +
             "Mojžiš tak urobil pred\u00A0očami starších Izraela a nazval to miesto Massa a Meríba pre\u00A0hádku synov Izraela a preto, že pokúšali Pána, keď vraveli: \"Je Pán medzi nami, alebo nie?\"<br>" +
             "Počuli sme Božie slovo."},

             Fakultatívne čítania na\u00A04. pôstny týždeň
             {"", "", "", "Mich 7, 7-9",
             "Vstanem; keď sedím vo\u00A0tme, Pán je mojím svetlom",
             "Čítanie z Knihy proroka Micheáša<br>" +
             "Upieram svoj zrak na\u00A0Pána, očakávam Boha, svojho záchrancu; môj Boh ma vyslyší.<br>" +
             "Neteš sa zo\u00A0mňa, nepriateľka moja; padol som, ale vstanem, keď sedím vo\u00A0tme, Pán je mojím svetlom.<br>" +
             "Znášam Pánov hnev, lebo som zhrešil proti nemu, kým sa neujme mojej veci a neprisúdi mi právo; on ma vyvedie na\u00A0svetlo, uvidím jeho spravodlivosť.<br>" +
             "Počuli sme Božie slovo."},

             Fakultatívne čítania na\u00A05. pôstny týždeň
             {"", "", "", "2 Kr 4, 18b-21. 32-37",
             "Keď sa na\u00A0neho rozprestrel, chlapcovo telo sa rozohrialo",
             "Čítanie z Druhej knihy kráľov<br>" +
             "V ktorýsi deň išiel Sunamitkin syn za\u00A0svojím otcom k\u00A0žencom. Tu povedal svojmu otcovi: \"Moja hlava, moja hlava!\"<br>" +
             "Ten rozkázal sluhovi: \"Vezmi ho a zaveď k\u00A0jeho matke.\"<br>" +
             "On ho vzal a zaviedol k\u00A0matke. Tá ho až do\u00A0poludnia držala na\u00A0kolenách, no potom zomrel. Vyšla hore, položila ho na\u00A0posteľ Božieho muža, zavrela dvere a odišla.<br>" +
             "Keď Elizeus prišiel domov, videl, že na\u00A0jeho posteli leží mŕtvy chlapec. Vošiel dnu, zavrel za\u00A0sebou a chlapcom dvere a modlil sa k\u00A0Pánovi. Vystúpil a ľahol si na\u00A0chlapca: ústa si priložil k\u00A0jeho ústam, oči oproti jeho očiam a ruky na\u00A0jeho ruky. Keď sa tak na\u00A0neho rozprestrel, chlapcovo telo sa rozohrialo. Potom vstal, prešiel raz po\u00A0dome sem i tam, znova vystúpil, ľahol si naň a chlapec sedem ráz kýchol a otvoril oči.<br>" +
             "Elizeus zavolal Gieziho a povedal mu: \"Zavolaj Sunamitku!\"<br>" +
             "Keď ju zavolal, prišla k\u00A0nemu a on jej povedal: \"Vezmi si syna!\"<br>" +
             "Vtedy pristúpila, padla mu k\u00A0nohám a poklonila sa až po\u00A0zem. Vzala si syna a vyšla von.<br>" +
             "Počuli sme Božie slovo."},*/
    };

    String[][] postCitanie2 = {
            {"03", "3", "", "2 Kor 5, 20 – 6, 2",
                    "Zmierte sa s\u00A0Bohom! Hľa, teraz je milostivý čas",
                    "Čítanie z Druhého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, sme Kristovými vyslancami a akoby Boh napomínal skrze nás. V\u00A0Kristovom mene prosíme: Zmierte sa s\u00A0Bohom!<br>" +
                            "Toho, ktorý nepoznal hriech, za\u00A0nás urobil hriechom, aby sme sa v\u00A0ňom stali Božou spravodlivosťou.<br>" +
                            "Ako spolupracovníci vás napomíname, aby ste Božiu milosť neprijímali nadarmo. Veď hovorí: \"V milostivom čase som ťa vyslyšal a v\u00A0deň spásy som ti pomohol.\"<br>" +
                            "Hľa, teraz je milostivý čas, teraz je deň spásy!<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "A", "", "Rim 5, 12-19",
                    "Kde sa rozmnožil hriech, v\u00A0miere ešte väčšej sa ukázala milosť",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, ako skrze jedného človeka vstúpil do\u00A0tohoto sveta hriech a skrze hriech smrť, tak aj smrť prešla na\u00A0všetkých ľudí, lebo všetci zhrešili. Hriech bol síce vo\u00A0svete už pred\u00A0zákonom, lenže hriech sa nepočíta, keď nieto zákona. No smrť panovala od\u00A0Adama až po\u00A0Mojžiša aj nad\u00A0tými, ktorí nespáchali priestupok podobný Adamovmu: on je predobrazom toho, ktorý mal prísť.<br>" +
                            "Ale s\u00A0darom to nie je tak ako s\u00A0previnením. Lebo ak previnením jedného zomreli mnohí, tým väčšmi sa milosťou jedného človeka, Ježiša Krista, v\u00A0mnohých rozhojnila Božia milosť a dar. A s\u00A0darom to nie je tak ako s\u00A0tým, čo prišlo skrze jedného, ktorý zhrešil. Lebo súd pre\u00A0jedno previnenie priniesol odsúdenie, milosť však prináša ospravedlnenie z\u00A0mnohých previnení.<br>" +
                            "Lebo ak previnením jedného skrze jedného zavládla smrť, tým skôr skrze jedného, Ježiša Krista, budú v\u00A0živote kraľovať tí, čo dostávajú hojnosť milosti a darovanej spravodlivosti.<br>" +
                            "Teda ako previnenie jedného prinieslo odsúdenie všetkým ľuďom, tak spravodlivosť jedného priniesla všetkým ľuďom ospravedlnenie a život. Lebo ako sa neposlušnosťou jedného človeka mnohí stali hriešnikmi, tak zasa poslušnosťou jedného sa mnohí stanú spravodlivými.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Rim 5, 12. 17-19",
                    "Kde sa rozmnožil hriech, tam sa ešte väčšmi rozhojnila milosť",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, ako skrze jedného človeka vstúpil do\u00A0tohoto sveta hriech a skrze hriech smrť, tak aj smrť prešla na\u00A0všetkých ľudí, lebo všetci zhrešili.<br>" +
                            "Lebo ak previnením jedného skrze jedného zavládla smrť, tým skôr skrze jedného, Ježiša Krista, budú v\u00A0živote kraľovať tí, čo dostávajú hojnosť milosti a darovanej spravodlivosti.<br>" +
                            "Teda ako previnenie jedného prinieslo odsúdenie všetkým ľuďom, tak spravodlivosť jedného priniesla všetkým ľuďom ospravedlnenie a život. Lebo ako sa neposlušnosťou jedného človeka mnohí stali hriešnikmi, tak zasa poslušnosťou jedného sa mnohí stanú spravodlivými.<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "B", "", "1 Pt 3, 18-22",
                    "Krst vás teraz zachraňuje",
                    "Čítanie z Prvého listu svätého apoštola Petra<br>" +
                            "Milovaní, Kristus raz navždy trpel za\u00A0hriechy, spravodlivý za\u00A0nespravodlivých, aby vás priviedol k\u00A0Bohu. Bol usmrtený v\u00A0tele, ale Duchom oživený. V\u00A0ňom prišiel a kázal aj duchom, čo boli vo\u00A0väzení. Oni kedysi veriť nechceli, keď Božia trpezlivosť za\u00A0Noemových dní vyčkávala, kým sa staval koráb, v\u00A0ktorom sa zachránili z\u00A0vody len niekoľkí, celkom osem ľudí.<br>" +
                            "To je predobraz krstu, ktorý teraz vás zachraňuje. Nie tým, že odstraňuje telesnú špinu, ale vyprosuje u\u00A0Boha čisté svedomie pre\u00A0zmŕtvychvstanie Ježiša Krista, ktorý vystúpil do\u00A0neba, je po\u00A0Božej pravici a podriadení sú mu anjeli, mocnosti a sily.<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "C", "", "Rim 10, 8-13",
                    "Vyznanie viery človeka veriaceho v\u00A0Krista",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, čo hovorí Písmo? \"Blízko teba je slovo, v\u00A0tvojich ústach a v\u00A0tvojom srdci;\" totiž slovo viery, ktoré hlásame. Lebo ak svojimi ústami vyznávaš: \"Ježiš je Pán!\" a vo\u00A0svojom srdci uveríš, že Boh ho vzkriesil z\u00A0mŕtvych, budeš spasený. Lebo srdcom veríme na\u00A0spravodlivosť a ústami vyznávame na\u00A0spásu. Veď Písmo hovorí: \"Nik, kto v\u00A0neho verí, nebude zahanbený.\"<br>" +
                            "Niet rozdielu medzi Židom a Grékom, lebo ten istý je Pán všetkých, bohatý pre\u00A0všetkých, ktorí ho vzývajú: Lebo každý, kto bude vzývať Pánovo meno, bude spasený.<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "A", "", "2 Tim 1, 8b-10",
                    "Boh nás volá a posilňuje",
                    "Čítanie z Druhého listu svätého apoštola Pavla Timotejovi<br>" +
                            "Milovaný, trp spolu so\u00A0mnou za\u00A0evanjelium, posilňovaný mocou Boha. On nás spasil a povolal svätým povolaním, nie pre\u00A0naše skutky, ale zo\u00A0svojho rozhodnutia a milosti, ktorú sme dostali v\u00A0Kristovi Ježišovi pred\u00A0večnými vekmi. No známou sa stala až teraz, keď sa zjavil náš Spasiteľ Ježiš Kristus. On zničil smrť a zjavil život a nesmrteľnosť evanjeliom.<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "B", "", "Rim 8, 31b-34",
                    "Boh vlastného Syna neušetril",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, ak je Boh za\u00A0nás, kto je proti nám? Keď on vlastného Syna neušetril, ale vydal ho za\u00A0nás všetkých, akože by nám s\u00A0ním nedaroval všetko!?<br>" +
                            "Kto obžaluje Božích vyvolencov? Boh, ktorý ospravedlňuje? A kto ich odsúdi? Kristus Ježiš, ktorý zomrel, ba viac – ktorý bol vzkriesený, je po\u00A0pravici Boha a prihovára sa za\u00A0nás?<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "C", "", "Flp 3, 17 – 4, 1",
                    "Kristus nás pripodobní svojmu oslávenému telu",
                    "Čítanie z Listu svätého apoštola Pavla Filipanom<br>" +
                            "Bratia, spoločne ma napodobňujte a všímajte si tých, čo žijú podľa vzoru, aký máte v\u00A0nás! Lebo mnohí, o\u00A0ktorých som vám často hovoril a teraz aj s\u00A0plačom hovorím, žijú ako nepriatelia Kristovho kríža. Ich koniec je záhuba, ich bohom je brucho a hanba je slávou tých, čo zmýšľajú pozemsky.<br>" +
                            "Veď naša vlasť je v\u00A0nebi. Odtiaľ očakávame aj Spasiteľa Pána Ježiša Krista. On mocou, ktorou si môže podmaniť všetko, pretvorí naše úbohé telo, aby sa stalo podobným jeho oslávenému telu.<br>" +
                            "A preto, bratia moji milovaní a vytúžení, moja radosť a moja koruna, takto pevne stojte v\u00A0Pánovi, milovaní!<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "Flp 3, 20 – 4, 1",
                    "Kristus nás pripodobní svojmu oslávenému telu",
                    "Čítanie z Listu svätého apoštola Pavla Filipanom<br>" +
                            "Bratia, naša vlasť je v\u00A0nebi. Odtiaľ očakávame aj Spasiteľa Pána Ježiša Krista. On mocou, ktorou si môže podmaniť všetko, pretvorí naše úbohé telo, aby sa stalo podobným jeho oslávenému telu.<br>" +
                            "A preto, bratia moji milovaní a vytúžení, moja radosť a moja koruna, takto pevne stojte v\u00A0Pánovi, milovaní!<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "A", "", "Rim 5, 1-2. 5-8",
                    "Božia láska je rozliata v\u00A0našich srdciach skrze Ducha Svätého, ktorého sme dostali",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, ospravedlnení z\u00A0viery, žijeme v\u00A0pokoji s\u00A0Bohom skrze nášho Pána Ježiša Krista. Skrze neho máme vierou prístup k\u00A0tej milosti, v\u00A0ktorej zotrvávame, aj sa chválime nádejou na\u00A0Božiu slávu.<br>" +
                            "A nádej nezahanbuje, lebo Božia láska je rozliata v\u00A0našich srdciach skrze Ducha Svätého, ktorého sme dostali.<br>" +
                            "Veď Kristus zomrel v\u00A0určenom čase za\u00A0bezbožných, keď sme boli ešte bezmocní. Sotvakto zomrie za\u00A0spravodlivého; hoci za\u00A0dobrého by sa azda niekto odhodlal umrieť. Ale Boh dokazuje svoju lásku k\u00A0nám tým, že Kristus zomrel za\u00A0nás, keď sme boli ešte hriešnici.<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "B", "", "1 Kor 1, 22-25",
                    "Ohlasujeme ukrižovaného Krista: pre\u00A0ľudí bláznovstvo, ale pre\u00A0povolaných Božiu múdrosť",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, Židia žiadajú znamenia a Gréci hľadajú múdrosť, my však ohlasujeme ukrižovaného Krista, pre\u00A0Židov pohoršenie, pre\u00A0pohanov bláznovstvo, ale pre\u00A0povolaných, tak Židov ako Grékov, Krista – Božiu moc a Božiu múdrosť.<br>" +
                            "Lebo čo je u\u00A0Boha bláznivé, je múdrejšie ako ľudia, a čo je u\u00A0Boha slabé, je silnejšie ako ľudia.<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "C", "", "1 Kor 10, 1-6. 10-12",
                    "Život ľudu s\u00A0Mojžišom na\u00A0púšti je zapísaný ako napomenutie pre\u00A0nás",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Nechcem, bratia, aby ste nevedeli, že všetci naši otcovia boli pod\u00A0oblakom, všetci prešli cez\u00A0more a všetci boli v\u00A0oblaku a v\u00A0mori pokrstení v\u00A0Mojžišovi, všetci jedli ten istý duchovný pokrm a všetci pili ten istý duchovný nápoj, lebo pili z\u00A0duchovnej skaly, ktorá ich sprevádzala, a tou skalou bol Kristus. Ale vo\u00A0väčšine z\u00A0nich nemal Boh zaľúbenie, veď popadali na\u00A0púšti.<br>" +
                            "To sa stalo ako predobraz pre\u00A0nás, aby sme neboli žiadostiví zla, ako boli žiadostiví oni. Ani nerepcite, ako niektorí z\u00A0nich reptali, a zahynuli od\u00A0zhubcu.<br>" +
                            "A toto sa im stalo ako predobraz a bolo napísané ako napomenutie pre\u00A0nás, ktorých zastihol koniec vekov. Preto kto si myslí, že stojí, nech si dáva pozor, aby nepadol.<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "A", "", "Ef 5, 8-14",
                    "Vstaň z\u00A0mŕtvych a bude ti svietiť Kristus",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Bratia, kedysi ste boli tmou, ale teraz ste svetlom v\u00A0Pánovi. Žite ako deti svetla! Ovocie svetla je v\u00A0každej dobrote, spravodlivosti a pravde. Skúmajte, čo sa páči Pánovi, a nemajte účasť na\u00A0jalových skutkoch tmy, radšej ich odhaľujte, lebo to, čo oni potajomky robia, je hanba aj hovoriť. Ale všetko, čo sa odhalí, svetlo vynesie najavo, a všetko, čo je zjavné, je svetlo.<br>" +
                            "Preto hovorí: \"Prebuď sa, ty, čo spíš, vstaň z\u00A0mŕtvych a bude ti svietiť Kristus!\"<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "B", "", "Ef 2, 4-10",
                    "Mŕtvi pre\u00A0hriechy, milosťou ste spasení",
                    "Čítanie z Listu svätého apoštola Pavla Efezanom<br>" +
                            "Bratia, Boh, bohatý na\u00A0milosrdenstvo, pre\u00A0svoju nesmiernu lásku, ktorou nás miluje, hoci sme boli pre\u00A0hriechy mŕtvi, oživil nás s\u00A0Kristom milosťou ste spasení a s\u00A0ním nás vzkriesil a daroval nám miesto v\u00A0nebi v\u00A0Kristovi Ježišovi, aby ukázal v\u00A0budúcich vekoch nesmierne bohatstvo svojej milosti dobrotou voči nám v\u00A0Kristovi Ježišovi.<br>" +
                            "Lebo spasení ste milosťou skrze vieru; a to nie je z\u00A0vás, je to Boží dar: nie zo\u00A0skutkov, aby sa nik nevystatoval. Veď sme jeho dielo, stvorení v\u00A0Kristovi Ježišovi pre\u00A0dobré skutky, ktoré pripravil Boh, aby sme ich konali.<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "C", "", "2 Kor 5, 17-21",
                    "Boh nás skrze Krista zmieril so\u00A0sebou",
                    "Čítanie z Druhého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, kto je v\u00A0Kristovi, je novým stvorením. Staré sa pominulo a nastalo nové. Ale to všetko je od\u00A0Boha, ktorý nás skrze Krista zmieril so\u00A0sebou a zveril nám službu zmierenia. Veď v\u00A0Kristovi Boh zmieril svet so\u00A0sebou a nepočítal ľuďom ich hriechy. A nám odovzdal slovo zmierenia. Sme teda Kristovými vyslancami a akoby Boh napomínal skrze nás.<br>" +
                            "V Kristovom mene prosíme: Zmierte sa s\u00A0Bohom! Toho, ktorý nepoznal hriech, za\u00A0nás urobil hriechom, aby sme sa v\u00A0ňom stali Božou spravodlivosťou.<br>" +
                            "Počuli sme Božie slovo."},
            {"50", "A", "", "Rim 8, 8-11",
                    "Vo vás prebýva Duch toho, ktorý vzkriesil Ježiša z\u00A0mŕtvych",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, tí, čo žijú telesne, nemôžu sa páčiť Bohu.<br>" +
                            "Lenže vy nežijete telesne, ale duchovne, pravda, ak vo\u00A0vás prebýva Boží Duch. Lebo kto nemá Kristovho Ducha, ten nie je jeho. Ale ak je vo\u00A0vás Kristus, telo je síce pre\u00A0hriech mŕtve, no duch je život pre\u00A0spravodlivosť.<br>" +
                            "A keď vo\u00A0vás prebýva Duch toho, ktorý vzkriesil Ježiša z\u00A0mŕtvych, potom ten, čo vzkriesil z\u00A0mŕtvych Krista, oživí aj vaše smrteľné telá skrze svojho Ducha, ktorý prebýva vo\u00A0vás.<br>" +
                            "Počuli sme Božie slovo."},
            {"50", "B", "", "Hebr 5, 7-9",
                    "Naučil sa poslušnosti a stal sa pôvodcom večnej spásy",
                    "Čítanie z Listu Hebrejom<br>" +
                            "Kristus v\u00A0dňoch svojho pozemského života so\u00A0silným výkrikom a so\u00A0slzami prednášal prosby a modlitby tomu, ktorý ho mohol zachrániť od\u00A0smrti; a bol vyslyšaný pre\u00A0svoju bohabojnosť.<br>" +
                            "A hoci bol Synom, z\u00A0toho, čo vytrpel, naučil sa poslušnosti; a keď dosiahol dokonalosť, stal sa pôvodcom večnej spásy pre\u00A0všetkých, ktorí ho poslúchajú.<br>" +
                            "Počuli sme Božie slovo."},
            {"50", "C", "", "Flp 3, 8-14",
                    "Bežím k\u00A0cieľu, za\u00A0víťaznou cenou Božieho povolania zhora v\u00A0Kristovi Ježišovi",
                    "Čítanie z Listu svätého apoštola Pavla Filipanom<br>" +
                            "Bratia, všetko pokladám za\u00A0stratu pre\u00A0vznešenosť poznania Krista Ježiša, môjho Pána. Preň som všetko stratil a pokladám za\u00A0odpadky, aby som získal Krista a našiel sa v\u00A0ňom bez\u00A0vlastnej spravodlivosti, ktorá je zo\u00A0zákona, ale s\u00A0tou, ktorá je skrze vieru v\u00A0Krista – spravodlivosťou z\u00A0Boha, založenou na\u00A0viere –, aby som poznal jeho, moc jeho zmŕtvychvstania a účasť na\u00A0jeho utrpení tým, že sa mu pripodobním v\u00A0smrti, aby som tak nejako dosiahol aj vzkriesenie z\u00A0mŕtvych. Nie že by som ho už bol dosiahol, alebo že by som už bol dokonalý, ale bežím, aby som sa ho niekedy zmocnil, ako sa aj Kristus Ježiš zmocnil mňa.<br>" +
                            "Bratia, ja si nenamýšľam, že som sa už zmocnil. Ale jedno robím: zabúdam na\u00A0to, čo je za\u00A0mnou, a uháňam za\u00A0tým, čo je predo\u00A0mnou. Bežím k\u00A0cieľu, za\u00A0víťaznou cenou Božieho povolania zhora v\u00A0Kristovi Ježišovi.<br>" +
                            "Počuli sme Božie slovo."},
            {"60", "A", "", "Flp 2, 6-11",
                    "Uponížil sa, preto ho Boh povýšil",
                    "Čítanie z Listu svätého apoštola Pavla Filipanom<br>" +
                            "Ježiš Kristus, hoci má božskú prirodzenosť, nepridŕžal sa svojej rovnosti s\u00A0Bohom, ale zriekol sa seba samého, vzal si prirodzenosť sluhu, stal sa podobný ľuďom a podľa vonkajšieho zjavu bol pokladaný za\u00A0človeka. Uponížil sa, stal sa poslušným až na\u00A0smrť, až na\u00A0smrť na\u00A0kríži.<br>" +
                            "Preto ho Boh nad\u00A0všetko povýšil a dal mu meno, ktoré je nad\u00A0každé iné meno, aby sa na\u00A0meno Ježiš zohlo každé koleno v\u00A0nebi, na\u00A0zemi i v\u00A0podsvetí a aby každý jazyk vyznával: \"Ježiš Kristus je Pán!\" na\u00A0slávu Boha Otca.<br>" +
                            "Počuli sme Božie slovo."},
            {"60", "B", "", "Flp 2, 6-11",
                    "Uponížil sa, preto ho Boh povýšil",
                    "Čítanie z Listu svätého apoštola Pavla Filipanom<br>" +
                            "Ježiš Kristus, hoci má božskú prirodzenosť, nepridŕžal sa svojej rovnosti s\u00A0Bohom, ale zriekol sa seba samého, vzal si prirodzenosť sluhu, stal sa podobný ľuďom a podľa vonkajšieho zjavu bol pokladaný za\u00A0človeka. Uponížil sa, stal sa poslušným až na\u00A0smrť, až na\u00A0smrť na\u00A0kríži.<br>" +
                            "Preto ho Boh nad\u00A0všetko povýšil a dal mu meno, ktoré je nad\u00A0každé iné meno, aby sa na\u00A0meno Ježiš zohlo každé koleno v\u00A0nebi, na\u00A0zemi i v\u00A0podsvetí a aby každý jazyk vyznával: \"Ježiš Kristus je Pán!\" na\u00A0slávu Boha Otca.<br>" +
                            "Počuli sme Božie slovo."},
            {"60", "C", "", "Flp 2, 6-11",
                    "Uponížil sa, preto ho Boh povýšil",
                    "Čítanie z Listu svätého apoštola Pavla Filipanom<br>" +
                            "Ježiš Kristus, hoci má božskú prirodzenosť, nepridŕžal sa svojej rovnosti s\u00A0Bohom, ale zriekol sa seba samého, vzal si prirodzenosť sluhu, stal sa podobný ľuďom a podľa vonkajšieho zjavu bol pokladaný za\u00A0človeka. Uponížil sa, stal sa poslušným až na\u00A0smrť, až na\u00A0smrť na\u00A0kríži.<br>" +
                            "Preto ho Boh nad\u00A0všetko povýšil a dal mu meno, ktoré je nad\u00A0každé iné meno, aby sa na\u00A0meno Ježiš zohlo každé koleno v\u00A0nebi, na\u00A0zemi i v\u00A0podsvetí a aby každý jazyk vyznával: \"Ježiš Kristus je Pán!\" na\u00A0slávu Boha Otca.<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] postEvanjelium = {
            {"03", "3", "", "Mt 6, 1-6. 16-18",
                    "Tvoj Otec ťa odmení, lebo on vidí aj v\u00A0skrytosti",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Dajte si pozor a nekonajte svoje dobré skutky pred\u00A0ľuďmi, aby vás obdivovali, lebo nebudete mať odmenu u\u00A0svojho Otca, ktorý je na\u00A0nebesiach.<br>" +
                            "Keď teda dávaš almužnu, nevytrubuj pred\u00A0sebou, ako to robia pokrytci v\u00A0synagógach a po\u00A0uliciach, aby ich ľudia chválili. Veru, hovorím vám: Už dostali svoju odmenu.<br>" +
                            "Ale keď ty dávaš almužnu, nech nevie tvoja ľavá ruka, čo robí pravá, aby tvoja almužna zostala skrytá. A tvoj Otec ťa odmení, lebo on vidí aj v\u00A0skrytosti.<br>" +
                            "A keď sa modlíte, nebuďte ako pokrytci, ktorí sa radi postojačky modlievajú v\u00A0synagógach a na\u00A0rohoch ulíc, aby ich ľudia videli. Veru, hovorím vám: Už dostali svoju odmenu.<br>" +
                            "Ale keď sa ty ideš modliť, vojdi do\u00A0svojej izby, zatvor za\u00A0sebou dvere a modli sa k\u00A0svojmu Otcovi, ktorý je v\u00A0skrytosti. A tvoj Otec ťa odmení, lebo on vidí aj v\u00A0skrytosti.<br>" +
                            "A keď sa postíte, nebuďte zamračení ako pokrytci. Znetvorujú si tvár, aby ľudia videli, že sa postia. Veru, hovorím vám: Už dostali svoju odmenu.<br>" +
                            "Keď sa ty postíš, pomaž si hlavu a umy si tvár, aby nie ľudia zbadali, že sa postíš, ale tvoj Otec, ktorý je v\u00A0skrytosti. A tvoj Otec ťa odmení, lebo on vidí aj v\u00A0skrytosti.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"04", "4", "", "Lk 9, 22-25",
                    "Kto stratí svoj život pre\u00A0mňa, zachráni si ho",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Syn človeka musí mnoho trpieť, starší, veľkňazi a zákonníci ho zavrhnú, zabijú ho, ale on tretieho dňa vstane z\u00A0mŕtvych.\"<br>" +
                            "A všetkým povedal: \"Kto chce ísť za\u00A0mnou, nech zaprie sám seba, vezme každý deň svoj kríž a nasleduje ma. Lebo kto by si chcel život zachrániť, stratí ho, ale kto stratí svoj život pre\u00A0mňa, zachráni si ho.<br>" +
                            "Veď čo osoží človekovi, keby aj celý svet získal, a seba samého by stratil alebo poškodil?!\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"05", "5", "", "Mt 9, 14-15",
                    "Keď im ženícha vezmú; potom sa budú postiť",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "K Ježišovi prišli Jánovi učeníci a hovorili: \"Prečo sa my a farizeji často postíme, a tvoji učeníci sa nepostia?\"<br>" +
                            "Ježiš im povedal: \"Vari môžu svadobní hostia smútiť, kým je ženích s\u00A0nimi? No prídu dni, keď im ženícha vezmú; potom sa budú postiť.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"06", "6", "", "Lk 5, 27-32",
                    "Neprišiel som volať spravodlivých, ale hriešnikov, aby sa kajali",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš videl na\u00A0mýtnici sedieť mýtnika menom Léviho a povedal mu: \"Poď za\u00A0mnou!\" On vstal, opustil všetko a išiel za\u00A0ním.<br>" +
                            "Lévi mu urobil vo\u00A0svojom dome veľkú hostinu. A bol tam veľký zástup mýtnikov a iných, ktorí s\u00A0nimi stolovali.<br>" +
                            "Farizeji a ich zákonníci šomrali a hovorili jeho učeníkom: \"Prečo jete a pijete s\u00A0mýtnikmi a hriešnikmi?\"<br>" +
                            "Odpovedal im Ježiš: \"Lekára nepotrebujú zdraví, ale chorí. Neprišiel som volať spravodlivých, ale hriešnikov, aby sa kajali.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"10", "A", "", "Mt 4, 1-11",
                    "Ježiš sa štyridsať dní postí a je pokúšaný",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Duch vyviedol Ježiša na\u00A0púšť, aby ho diabol pokúšal. A keď sa štyridsať dní a štyridsať nocí postil, napokon vyhladol.<br>" +
                            "Tu pristúpil pokušiteľ a povedal mu: \"Ak si Boží Syn, povedz, nech sa z\u00A0týchto kameňov stanú chleby.\"<br>" +
                            "On odvetil: \"Napísané je: ‚Nielen z\u00A0chleba žije človek, ale z\u00A0každého slova, ktoré vychádza z\u00A0Božích úst.'\"<br>" +
                            "Potom ho diabol vzal do\u00A0svätého mesta, postavil ho na\u00A0vrchol chrámu a vravel mu: \"Ak si Boží Syn, vrhni sa dolu, veď je napísané: ‚Svojim anjelom dá príkaz o\u00A0tebe a vezmú ťa na\u00A0ruky, aby si si neuderil nohu o\u00A0kameň.'\"<br>" +
                            "Ježiš mu povedal: \"Ale je aj napísané: ‚Nebudeš pokúšať Pána, svojho Boha.'\"<br>" +
                            "A zasa ho diabol vzal na\u00A0veľmi vysoký vrch, ukázal mu všetky kráľovstvá sveta a ich slávu a vravel mu: \"Toto všetko ti dám, ak padneš predo\u00A0mnou a budeš sa mi klaňať.\" Vtedy mu Ježiš povedal: \"Odíď, satan, lebo je napísané: ‚Pánovi, svojmu Bohu, sa budeš klaňať a jedine jemu budeš slúžiť.'\"<br>" +
                            "Tu ho diabol opustil a prišli anjeli a posluhovali mu.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"10", "B", "", "Mk 1, 12-15",
                    "Satan ho pokúšal a anjeli mu posluhovali",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Duch hnal Ježiša na\u00A0púšť. Na\u00A0púšti bol štyridsať dní a satan ho pokúšal. Bol medzi divou zverou a anjeli mu posluhovali.<br>" +
                            "Keď Jána uväznili, Ježiš prišiel do\u00A0Galiley a hlásal Božie evanjelium. Hovoril: \"Naplnil sa čas a priblížilo sa Božie kráľovstvo. Kajajte sa a verte evanjeliu.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"10", "C", "", "Lk 4, 1-13",
                    "Duch ho vodil po\u00A0púšti a diabol ho pokúšal",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš sa vrátil od\u00A0Jordánu plný Ducha Svätého. Duch ho vodil štyridsať dní po\u00A0púšti a diabol ho pokúšal. V\u00A0tých dňoch nič nejedol. A keď sa skončili, vyhladol. Tu mu diabol povedal: \"Ak si Boží Syn, povedz tomuto kameňu, aby sa stal chlebom.\"<br>" +
                            "Ježiš mu odvetil: \"Napísané je: ‚Nielen z\u00A0chleba žije človek.'\"<br>" +
                            "Potom ho diabol vyzdvihol, v\u00A0jedinom okamihu mu ukázal všetky kráľovstvá sveta a vravel mu: \"Dám ti všetku ich moc a slávu, lebo som ju dostal a dám ju, komu chcem. Ak sa mi teda budeš klaňať, všetka bude tvoja.\"<br>" +
                            "Ježiš mu povedal: \"Je napísané: ‚Pánovi, svojmu Bohu, sa budeš klaňať a jedine jemu budeš slúžiť.'\"<br>" +
                            "Potom ho zaviedol do\u00A0Jeruzalema, postavil ho na\u00A0vrchol chrámu a povedal mu: \"Ak si Boží Syn, vrhni sa stadeto dolu, veď je napísané: ‚Svojim anjelom dá príkaz o\u00A0tebe, aby ťa chránili,' a ‚vezmú ťa na\u00A0ruky, aby si si neuderil nohu o\u00A0kameň.'\"<br>" +
                            "Ježiš mu odvetil: \"Je povedané: ‚Nebudeš pokúšať Pána, svojho Boha.'\"<br>" +
                            "Keď diabol skončil všetko pokúšanie, na\u00A0čas od\u00A0neho odišiel.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"11", "1", "", "Mt 25, 31-46",
                    "Čokoľvek ste urobili jednému z\u00A0týchto mojich najmenších bratov, mne ste urobili",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Až príde Syn človeka vo\u00A0svojej sláve a s\u00A0ním všetci anjeli, zasadne na\u00A0trón svojej slávy. Vtedy sa pred\u00A0ním zhromaždia všetky národy a on oddelí jedných od\u00A0druhých, ako pastier oddeľuje ovce od\u00A0capov. Ovce si postaví sprava a capov zľava.<br>" +
                            "Potom Kráľ povie tým, čo budú po\u00A0jeho pravici: ‚Poďte, požehnaní môjho Otca, zaujmite kráľovstvo, ktoré je pre\u00A0vás pripravené od\u00A0stvorenia sveta. Lebo som bol hladný a dali ste mi jesť; bol som smädný a dali ste mi piť; bol som pocestný a pritúlili ste ma; bol som nahý a priodeli ste ma; bol som chorý a navštívili ste ma; bol som vo\u00A0väzení a prišli ste ku\u00A0mne.'<br>" +
                            "Vtedy mu spravodliví povedia: ‚Pane, a kedy sme ťa videli hladného a nakŕmili sme ťa, alebo smädného a dali sme ti piť? Kedy sme ťa videli ako pocestného a pritúlili sme ťa, alebo nahého a priodeli sme ťa? Kedy sme ťa videli chorého alebo vo\u00A0väzení a prišli sme k\u00A0tebe?'<br>" +
                            "Kráľ im odpovie: ‚Veru, hovorím vám: Čokoľvek ste urobili jednému z\u00A0týchto mojich najmenších bratov, mne ste urobili.'<br>" +
                            "Potom povie aj tým, čo budú zľava: ‚Odíďte odo\u00A0mňa, zlorečení, do\u00A0večného ohňa, ktorý je pripravený diablovi a jeho anjelom! Lebo som bol hladný, a nedali ste mi jesť; bol som smädný, a nedali ste mi piť; bol som pocestný, a nepritúlili ste ma; bol som nahý, a nepriodeli ste ma; bol som chorý a vo\u00A0väzení, a nenavštívili ste ma.'<br>" +
                            "Vtedy mu aj oni povedia: ‚Pane, a kedy sme ťa videli hladného alebo smädného, alebo ako pocestného, alebo nahého, alebo chorého, alebo vo\u00A0väzení a neposlúžili sme ti?' Vtedy im on odpovie: ‚Veru, hovorím vám: Čokoľvek ste neurobili jednému z\u00A0týchto najmenších, ani mne ste to neurobili.'<br>" +
                            "A pôjdu títo do\u00A0večného trápenia, kým spravodliví do\u00A0večného života.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"12", "2", "", "Mt 6, 7-15",
                    "Vy sa budete modliť takto",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Keď sa modlíte, nehovorte veľa ako pohania. Myslia si, že budú vypočutí pre\u00A0svoju mnohovravnosť. Nenapodobňujte ich; veď váš Otec vie, čo potrebujete, prv, ako by ste ho prosili.<br>" +
                            "Vy sa budete modliť takto: Otče náš, ktorý si na\u00A0nebesiach, posväť sa tvoje meno, príď tvoje kráľovstvo, buď tvoja vôľa, ako v\u00A0nebi tak i na\u00A0zemi.<br>" +
                            "Chlieb náš každodenný daj nám dnes. A odpusť nám naše viny, ako i my odpúšťame svojim vinníkom. A neuveď nás do\u00A0pokušenia, ale zbav nás Zlého.<br>" +
                            "Lebo ak vy odpustíte ľuďom ich poklesky, aj váš nebeský Otec vám odpustí. Ale ak vy neodpustíte ľuďom, ani váš Otec neodpustí vaše hriechy.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"13", "3", "", "Lk 11, 29-32",
                    "Toto pokolenie nedostane znamenie, iba ak znamenie Jonášovo",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Keď sa schádzali zástupy, začal Ježiš hovoriť: \"Toto pokolenie je zlé pokolenie. Žiada znamenie, ale znamenie nedostane, iba ak znamenie Jonášovo. Lebo ako bol Jonáš znamením pre\u00A0Ninivčanov, tak bude aj Syn človeka pre\u00A0toto pokolenie.<br>" +
                            "Kráľovná z\u00A0juhu vystúpi na\u00A0súde proti mužom tohto pokolenia a odsúdi ich; lebo ona z\u00A0končín zeme prišla počúvať Šalamúnovu múdrosť a tu je niekto väčší ako Šalamún.<br>" +
                            "Mužovia z\u00A0Ninive vystúpia na\u00A0súde proti tomuto pokoleniu a odsúdia ho; lebo oni sa kajali na\u00A0Jonášovo kázanie a tu je predsa niekto väčší ako Jonáš.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"14", "4", "", "Mt 7, 7-12",
                    "Každý, kto prosí, dostane",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Proste a dostanete! Hľadajte a nájdete! Klopte a otvoria vám! Lebo každý, kto prosí, dostane, a kto hľadá, nájde, a kto klope, tomu otvoria. Alebo je medzi vami človek, čo by podal synovi kameň, keď ho prosí o\u00A0chlieb? Alebo keby pýtal rybu, čo by mu dal hada?<br>" +
                            "Keď teda vy, hoci ste zlí, viete dávať dobré dary svojim deťom; o\u00A0čo skôr dá váš Otec, ktorý je na\u00A0nebesiach, dobré veci tým, čo ho prosia.<br>" +
                            "Všetko, čo chcete, aby ľudia robili vám, robte aj vy im. Lebo to je Zákon i Proroci.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"15", "5", "", "Mt 5, 20-26",
                    "Choď sa najprv zmieriť so\u00A0svojím bratom",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Ak vaša spravodlivosť nebude väčšia ako spravodlivosť zákonníkov a farizejov, nevojdete do\u00A0nebeského kráľovstva.<br>" +
                            "Počuli ste, že otcom bolo povedané: ‚Nezabiješ!' Kto by teda zabil, pôjde pred\u00A0súd.<br>" +
                            "No ja vám hovorím: Pred\u00A0súd pôjde každý, kto sa na\u00A0svojho brata hnevá. Kto svojmu bratovi povie: ‚Hlupák,' pôjde pred\u00A0veľradu. A kto mu povie: ‚Ty bohapustý blázon,' pôjde do\u00A0pekelného ohňa.<br>" +
                            "Keď teda prinášaš dar na\u00A0oltár a tam si spomenieš, že tvoj brat má niečo proti tebe, nechaj svoj dar tam pred\u00A0oltárom a choď sa najprv zmieriť so\u00A0svojím bratom; až potom príď a obetuj svoj dar.<br>" +
                            "Pokonaj sa včas so\u00A0svojím protivníkom, kým si s\u00A0ním na\u00A0ceste, aby ťa protivník nevydal sudcovi a sudca strážnikovi a aby ťa neuvrhli do\u00A0väzenia. Veru, hovorím ti: Nevyjdeš odtiaľ, kým nezaplatíš do\u00A0ostatného haliera.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"16", "6", "", "Mt 5, 43-48",
                    "Buďte dokonalí ako váš nebeský Otec",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Počuli ste, že bolo povedané: ‚Milovať budeš svojho blížneho a nenávidieť svojho nepriateľa.'<br>" +
                            "Ale ja vám hovorím: Milujte svojich nepriateľov a modlite sa za\u00A0tých, čo vás prenasledujú, aby ste boli synmi svojho Otca, ktorý je na\u00A0nebesiach. Veď on dáva slnku vychádzať nad\u00A0zlých i dobrých a posiela dážď na\u00A0spravodlivých i nespravodlivých.<br>" +
                            "Lebo ak milujete tých, ktorí vás milujú, akú odmenu môžete čakať? Vari to nerobia aj mýtnici? A ak pozdravujete iba svojich bratov, čo zvláštne robíte? Nerobia to aj pohania?<br>" +
                            "Vy teda buďte dokonalí, ako je dokonalý váš nebeský Otec.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"20", "A", "", "Mt 17, 1-9",
                    "Tvár mu zažiarila sťa slnko",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš vzal so\u00A0sebou Petra, Jakuba a jeho brata Jána a vyviedol ich na\u00A0vysoký vrch do\u00A0samoty. Tam sa pred\u00A0nimi premenil: tvár mu zažiarila sťa slnko a odev mu zbelel ako svetlo.<br>" +
                            "Vtom sa im zjavil Mojžiš a Eliáš a rozprávali sa s\u00A0ním.<br>" +
                            "Vtedy Peter povedal Ježišovi: \"Pane, dobre je nám tu. Ak chceš, urobím tu tri stánky: jeden tebe, jeden Mojžišovi a jeden Eliášovi.\"<br>" +
                            "Kým ešte hovoril, zahalil ich jasný oblak a z\u00A0oblaku zaznel hlas: \"Toto je môj milovaný Syn, v\u00A0ktorom mám zaľúbenie; počúvajte ho.\"<br>" +
                            "Keď to učeníci počuli, padli na\u00A0tvár a veľmi sa báli.<br>" +
                            "No pristúpil k\u00A0nim Ježiš, dotkol sa ich a povedal im: \"Vstaňte a nebojte sa!\" A keď zdvihli oči, nevideli nikoho, iba Ježiša.<br>" +
                            "Keď zostupovali z\u00A0vrchu, Ježiš im prikázal: \"Nikomu nehovorte o\u00A0tomto videní, kým Syn človeka nevstane z\u00A0mŕtvych.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"20", "B", "", "Mk 9, 2-10",
                    "Toto je môj milovaný Syn",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Ježiš vzal so\u00A0sebou Petra, Jakuba a Jána a len ich vyviedol na\u00A0vysoký vrch do\u00A0samoty. Tam sa pred\u00A0nimi premenil. Jeho odev zažiaril a bol taký biely, že by ho nijaký bielič na\u00A0svete tak nevybielil. A zjavil sa im Eliáš s\u00A0Mojžišom a rozprávali sa s\u00A0Ježišom.<br>" +
                            "Vtedy Peter povedal Ježišovi: \"Rabbi, dobre je nám tu. Urobme tri stánky: jeden tebe, jeden Mojžišovi a jeden Eliášovi.\" Lebo nevedel, čo povedať; takí boli preľaknutí. Tu sa utvoril oblak a zahalil ich. A z\u00A0oblaku zaznel hlas: \"Toto je môj milovaný Syn, počúvajte ho.\" A sotva sa rozhliadli, nevideli pri\u00A0sebe nikoho, iba Ježiša. Keď zostupovali z\u00A0vrchu, prikázal im, aby o\u00A0tom, čo videli, nehovorili nikomu, kým Syn človeka nevstane z\u00A0mŕtvych. Oni si toto slovo zapamätali a jeden druhého sa vypytovali, čo znamená \"vstať z\u00A0mŕtvych\".<br>" +
                            "Počuli sme slovo Pánovo."},
            {"20", "C", "", "Lk 9, 28b-36",
                    "Ako sa modlil, zmenil sa vzhľad jeho tváre",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš vzal so\u00A0sebou Petra, Jána a Jakuba a vystúpil na\u00A0vrch modliť sa. Ako sa modlil, zmenil sa vzhľad jeho tváre a jeho odev zažiaril belobou. A hľa, rozprávali sa s\u00A0ním dvaja mužovia – boli to Mojžiš a Eliáš. Zjavili sa v\u00A0sláve a hovorili o\u00A0jeho odchode, ktorý sa mal uskutočniť v\u00A0Jeruzaleme. Petra a tých, čo boli s\u00A0ním, premohol spánok. A keď sa prebudili, videli jeho slávu a tých dvoch mužov, čo s\u00A0ním stáli.<br>" +
                            "Keď od\u00A0neho odchádzali, povedal Peter Ježišovi: \"Učiteľ, dobre je nám tu. Urobme tri stánky: jeden tebe, jeden Mojžišovi a jeden Eliášovi.\" Nevedel, čo hovorí. Kým toto hovoril, utvoril sa oblak a zahalil ich. Keď vstúpili do\u00A0oblaku, zmocnil sa ich strach.<br>" +
                            "A z\u00A0oblaku zaznel hlas: \"Toto je môj vyvolený Syn, počúvajte ho!\" A kým hlas doznel, ostal Ježiš sám.<br>" +
                            "Oni zmĺkli a v\u00A0tých dňoch nehovorili nikomu o\u00A0tom, čo videli.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"21", "1", "", "Lk 6, 36-38",
                    "Odpúšťajte a odpustí sa vám",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Buďte milosrdní, ako je milosrdný váš Otec! Nesúďte a nebudete súdení. Neodsudzujte a nebudete odsúdení!<br>" +
                            "Odpúšťajte a odpustí sa vám. Dávajte a dajú vám: mieru dobrú, natlačenú, natrasenú, vrchovatú vám dajú do\u00A0lona.<br>" +
                            "Lebo akou mierou budete merať vy, takou sa nameria aj vám.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"22", "2", "", "Mt 23, 1-12",
                    "Hovoria, a nekonajú",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal zástupom i svojim učeníkom: \"Zákonníci a farizeji zasadli na\u00A0Mojžišovu stolicu. Preto robte a zachovávajte všetko, čo vám povedia, ale podľa ich skutkov nerobte: lebo hovoria, a nekonajú. Viažu ťažké až neúnosné bremená a kladú ich ľuďom na\u00A0plecia, ale sami ich nechcú ani prstom pohnúť.<br>" +
                            "Všetko, čo robia, konajú iba preto, aby ich ľudia videli: rozširujú si modlitebné remienky a zväčšujú strapce na\u00A0šatách, radi majú popredné miesta na\u00A0hostinách, prvé stolice v\u00A0synagógach, pozdravy na\u00A0uliciach a keď ich ľudia oslovujú Rabbi.<br>" +
                            "Vy sa nedávajte volať Rabbi, lebo len jeden je váš Učiteľ, vy všetci ste bratia. Ani Otcom nevolajte nikoho na\u00A0zemi, lebo len jeden je váš Otec, ten nebeský. Ani sa nedávajte volať Učiteľmi, lebo len jediný je váš Učiteľ, Kristus. Kto je medzi vami najväčší, bude vaším služobníkom. Kto sa povyšuje, bude ponížený, a kto sa ponižuje, bude povýšený.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"23", "3", "", "Mt 20, 17-28",
                    "Odsúdia ho na\u00A0smrť",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Keď Ježiš vystupoval do\u00A0Jeruzalema, vzal si osve dvanástich učeníkov a cestou im hovoril: \"Hľa, vystupujeme do\u00A0Jeruzalema a Syn človeka bude vydaný veľkňazom a zákonníkom. Odsúdia ho na\u00A0smrť a vydajú pohanom, aby ho vysmiali, zbičovali a ukrižovali, ale on tretieho dňa vstane z\u00A0mŕtvych.\"<br>" +
                            "Vtedy k\u00A0nemu pristúpila matka Zebedejových synov so\u00A0svojimi synmi, poklonila sa a o\u00A0čosi ho prosila.<br>" +
                            "On sa jej opýtal: \"Čo chceš?\"<br>" +
                            "Vravela mu: \"Povedz, aby títo moji dvaja synovia sedeli v\u00A0tvojom kráľovstve jeden po\u00A0tvojej pravici a druhý po\u00A0ľavici.\"<br>" +
                            "Ježiš odpovedal: \"Neviete, čo žiadate. Môžete piť kalich, ktorý mám ja piť?\"<br>" +
                            "Oni mu vraveli: \"Môžeme.\"<br>" +
                            "On im povedal: \"Môj kalich budete piť, ale dať niekomu sedieť po\u00A0mojej pravici alebo ľavici nepatrí mne; to dostanú tí, ktorým to pripravil môj Otec.\"<br>" +
                            "Keď to počuli ostatní desiati, namrzeli sa na\u00A0oboch bratov. Ježiš ich zavolal k\u00A0sebe a povedal: \"Viete, že vládcovia národov panujú nad\u00A0nimi a mocnári im dávajú cítiť svoju moc. Medzi vami to tak nebude. Ale kto sa medzi vami bude chcieť stať veľkým, bude vaším služobníkom. A kto bude chcieť byť medzi vami prvý, bude vaším sluhom.<br>" +
                            "Ako ani Syn človeka neprišiel dať sa obsluhovať, ale slúžiť a položiť svoj život ako výkupné za\u00A0mnohých.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"24", "4", "", "Lk 16, 19-31",
                    "Dostal si dobré a Lazár zlé; teraz sa tu teší a ty sa trápiš",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš povedal farizejom: \"Bol istý bohatý človek. Obliekal sa do\u00A0purpuru a kmentu a deň čo deň prepychovo hodoval. Pri\u00A0jeho bráne líhal akýsi žobrák, menom Lazár, plný vredov. Túžil nasýtiť sa z\u00A0toho, čo padalo z\u00A0boháčovho stola, a len psy prichádzali a lízali mu vredy.<br>" +
                            "Keď žobrák umrel, anjeli ho zaniesli do\u00A0Abrahámovho lona. Zomrel aj boháč a pochovali ho. A keď v\u00A0pekle v\u00A0mukách pozdvihol oči, zďaleka videl Abraháma a Lazára v\u00A0jeho lone. I zvolal: ‚Otec Abrahám, zľutuj sa nado mnou a pošli Lazára, nech si namočí aspoň koniec prsta vo\u00A0vode a zvlaží mi jazyk, lebo sa hrozne trápim v\u00A0tomto plameni!'<br>" +
                            "No Abrahám povedal: ‚Synu, spomeň si, že si dostal všetko dobré za\u00A0svojho života a Lazár zasa iba zlé. Teraz sa on tu teší a ty sa trápiš. A okrem toho je medzi nami a vami veľká priepasť, takže nik čo ako by chcel nemôže prejsť odtiaľto k\u00A0vám ani odtiaľ prekročiť k\u00A0nám.'<br>" +
                            "Tu povedal: ‚Prosím ťa, Otče, pošli ho do\u00A0domu môjho otca. Mám totiž piatich bratov; nech ich zaprisahá, aby sa nedostali aj oni na\u00A0toto miesto múk.'<br>" +
                            "Abrahám mu odpovedal: ‚Majú Mojžiša a Prorokov, nech ich počúvajú.'<br>" +
                            "Ale on vravel: ‚Nie, otec Abrahám. Ak príde k\u00A0nim niekto z\u00A0mŕtvych, budú robiť pokánie.'<br>" +
                            "Odpovedal mu: ‚Ak nepočúvajú Mojžiša a Prorokov, neuveria, ani keby niekto z\u00A0mŕtvych vstal.'\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"25", "5", "", "Mt 21, 33-43. 45-46",
                    "To je dedič. Poďte, zabime ho",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal veľkňazom a starším ľudu: \"Počujte iné podobenstvo: Istý hospodár vysadil vinicu. Obohnal ju plotom, vykopal v\u00A0nej lis a postavil vežu. Potom ju prenajal vinohradníkom a odcestoval.<br>" +
                            "Keď sa priblížil čas oberačky, poslal k\u00A0vinohradníkom svojich sluhov, aby prevzali jeho diel úrody. Ale vinohradníci jeho sluhov pochytali; jedného zbili, iného zabili, ďalšieho ukameňovali.<br>" +
                            "Znova poslal iných sluhov, viac ako predtým, ale aj s\u00A0nimi urobili podobne.<br>" +
                            "Napokon k\u00A0nim poslal svojho syna, lebo si povedal: ‚K môjmu synovi budú mať úctu.'<br>" +
                            "Ale keď vinohradníci zazreli syna, povedali si: ‚To je dedič. Poďte, zabime ho a jeho dedičstvo bude naše!' Chytili ho, vyvliekli z\u00A0vinice a zabili.<br>" +
                            "Keď potom príde pán vinice, čo urobí tým vinohradníkom?\"<br>" +
                            "Odpovedali mu: \"Zlých bez\u00A0milosti zahubí a vinicu prenajme iným vinohradníkom, ktorí mu budú načas odovzdávať úrodu.\"<br>" +
                            "Ježiš im povedal: \"Nikdy ste nečítali v\u00A0Písme: ‚Kameň, čo stavitelia zavrhli, stal sa kameňom uholným. To sa stalo na\u00A0pokyn Pána; vec v\u00A0našich očiach obdivuhodná'?<br>" +
                            "Preto vám hovorím: Vám sa Božie kráľovstvo vezme a dá sa národu, ktorý bude prinášať úrodu.\"<br>" +
                            "Keď veľkňazi a farizeji počuli tieto jeho podobenstvá, vybadali, že hovorí o\u00A0nich. A chceli ho zajať, len sa báli zástupov, lebo ony ho pokladali za\u00A0proroka.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"26", "6", "", "Lk 15, 1-3. 11-32",
                    "Tento tvoj brat bol mŕtvy, a ožil",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "K Ježišovi sa približovali všetci mýtnici a hriešnici a počúvali ho. Farizeji a zákonníci šomrali: \"Tento prijíma hriešnikov a jedáva s\u00A0nimi.\"<br>" +
                            "Preto im povedal toto podobenstvo: \"Istý človek mal dvoch synov. Mladší z\u00A0nich povedal otcovi: ‚Otec, daj mi časť majetku, ktorá mi patrí.' A on im rozdelil majetok. O\u00A0niekoľko dní si mladší syn všetko zobral, odcestoval do\u00A0ďalekého kraja a tam svoj majetok hýrivým životom premárnil.<br>" +
                            "Keď všetko premrhal, nastal v\u00A0tej krajine veľký hlad a on začal trieť núdzu. Išiel teda a uchytil sa u\u00A0istého obyvateľa tej krajiny a on ho poslal na\u00A0svoje hospodárstvo svine pásť. I túžil nasýtiť sa aspoň strukmi, čo žrali svine, ale nik mu ich nedával.<br>" +
                            "Vstúpil teda do\u00A0seba a povedal si: ‚Koľko nádenníkov u\u00A0môjho otca má chleba nazvyš, a ja tu hyniem od\u00A0hladu. Vstanem, pôjdem k\u00A0svojmu otcovi a poviem mu: Otče, zhrešil som proti nebu i voči tebe. Už nie som hoden volať sa tvojím synom. Prijmi ma ako jedného zo\u00A0svojich nádenníkov.' I vstal a šiel k\u00A0svojmu otcovi.<br>" +
                            "Ešte bol ďaleko, keď ho zazrel jeho otec, a bolo mu ho ľúto. Pribehol k\u00A0nemu, hodil sa mu okolo krku a vybozkával ho.<br>" +
                            "Syn mu povedal: ‚Otče, zhrešil som proti nebu i voči tebe. Už nie som hoden volať sa tvojím synom.'<br>" +
                            "Ale otec povedal svojim sluhom: ‚Rýchlo prineste najlepšie šaty a oblečte ho! Dajte mu prsteň na\u00A0ruku a obuv na\u00A0nohy! Priveďte vykŕmené teľa a zabite ho. Jedzme a veselo hodujme, lebo tento môj syn bol mŕtvy, a ožil, bol stratený, a našiel sa.' A začali hodovať.<br>" +
                            "Jeho starší syn bol práve na\u00A0poli. Keď sa vracal a približoval sa k\u00A0domu, počul hudbu a tanec. Zavolal si jedného zo\u00A0sluhov a pýtal sa, čo sa deje. Ten mu povedal: ‚Prišiel tvoj brat a tvoj otec zabil vykŕmené teľa, lebo sa mu vrátil zdravý.'<br>" +
                            "On sa však nahneval a nechcel vojsť. Vyšiel teda otec a začal ho prosiť.<br>" +
                            "Ale on odpovedal otcovi: ‚Už toľko rokov ti slúžim a nikdy som neprestúpil tvoj príkaz, a mne si nikdy nedal ani kozliatko, aby som sa zabavil so\u00A0svojimi priateľmi. No keď prišiel tento tvoj syn, čo ti prehýril majetok s\u00A0neviestkami, pre\u00A0neho si zabil vykŕmené teľa.'<br>" +
                            "On mu na\u00A0to povedal: ‚Syn môj, ty si stále so\u00A0mnou a všetko, čo ja mám, je tvoje. Ale patrilo sa hodovať a radovať sa, lebo tento tvoj brat bol mŕtvy, a ožil, bol stratený, a našiel sa.'\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"30", "A", "", "Jn 4, 5-42",
                    "Prameň vody prúdiacej do\u00A0večného života",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš prišiel do\u00A0samarijského mesta menom Sychar neďaleko pozemku, ktorý dal Jakub svojmu synovi Jozefovi. Tam bola Jakubova studňa. Ježiš unavený z\u00A0cesty sadol si k\u00A0studni. Bolo okolo poludnia.<br>" +
                            "Tu prišla po\u00A0vodu istá Samaritánka. Ježiš jej povedal: \"Daj sa mi napiť!\" Jeho učeníci odišli do\u00A0mesta nakúpiť potravy. Samaritánka mu povedala: \"Ako si môžeš ty, Žid, pýtať vodu odo\u00A0mňa, Samaritánky?\" Židia sa totiž so\u00A0Samaritánmi nestýkajú.<br>" +
                            "Ježiš jej odpovedal: \"Keby si poznala Boží dar a vedela, kto je ten, čo ti hovorí: ‚Daj sa mi napiť,' ty by si poprosila jeho a on by ti dal živú vodu.\"<br>" +
                            "Žena mu povedala: \"Pane, ani vedro nemáš a studňa je hlboká. Odkiaľ máš teda živú vodu? Si azda väčší ako náš otec Jakub, ktorý nám dal túto studňu a pil z\u00A0nej on sám i jeho synovia a jeho stáda?\"<br>" +
                            "Ježiš jej odvetil: \"Každý, kto pije túto vodu, bude znova smädný. Ale kto sa napije z\u00A0vody, ktorú mu ja dám, nebude žízniť naveky. A voda, ktorú mu dám, stane sa v\u00A0ňom prameňom vody prúdiacej do\u00A0večného života.\"<br>" +
                            "Žena mu vravela: \"Pane, daj mi takej vody, aby som už nebola smädná a nemusela sem chodiť čerpať!\"<br>" +
                            "Povedal jej: \"Choď, zavolaj svojho muža a príď sem!\"<br>" +
                            "Žena mu odpovedala: \"Nemám muža.\"<br>" +
                            "Ježiš jej vravel: \"Správne si povedala: ‚Nemám muža,' lebo si mala päť mužov a ten, ktorého máš teraz, nie je tvoj muž. To si povedala pravdu.\"<br>" +
                            "Žena mu vravela: \"Pane, vidím, že si prorok. Naši otcovia sa klaňali Bohu na\u00A0tomto vrchu, a vy hovoríte, že v\u00A0Jeruzaleme je miesto, kde sa treba klaňať.\"<br>" +
                            "Ježiš jej povedal: \"Ver mi, žena, že prichádza hodina, keď sa nebudete klaňať Otcovi ani na\u00A0tomto vrchu, ani v\u00A0Jeruzaleme. Vy sa klaniate tomu, čo nepoznáte; my sa klaniame tomu, čo poznáme, lebo spása je zo\u00A0Židov. Ale prichádza hodina, ba už je tu, keď sa praví ctitelia budú klaňať Otcovi v\u00A0Duchu a pravde. Lebo sám Otec hľadá takých ctiteľov. Boh je Duch a tí, čo sa mu klaňajú, musia sa mu klaňať v\u00A0Duchu a pravde.\"<br>" +
                            "Žena mu vravela: \"Viem, že príde Mesiáš, zvaný Kristus. Až príde on, zvestuje nám všetko.\" Ježiš jej povedal: \"To som ja, čo sa rozprávam s\u00A0tebou.\" Vtom prišli jeho učeníci a divili sa, že sa rozpráva so\u00A0ženou. Ale nik nepovedal: \"Čo sa jej pýtaš?\" Alebo: \"Prečo sa s\u00A0ňou rozprávaš?\"<br>" +
                            "Žena nechala svoj džbán, odišla do\u00A0mesta a vravela ľuďom: \"Poďte sa pozrieť na\u00A0človeka, ktorý mi povedal všetko, čo som porobila! Nebude to Mesiáš?\"<br>" +
                            "Vyšli teda z\u00A0mesta a šli k\u00A0nemu.<br>" +
                            "Medzitým ho učeníci prosili: \"Rabbi, jedz!\"<br>" +
                            "On im povedal: \"Ja mám jesť pokrm, ktorý vy nepoznáte.\"<br>" +
                            "Učeníci si hovorili medzi sebou: \"Vari mu niekto priniesol jesť?\"<br>" +
                            "Ježiš im povedal: \"Mojím pokrmom je plniť vôľu toho, ktorý ma poslal, a dokonať jeho dielo. Nevravíte aj vy: ‚Ešte štyri mesiace a bude žatva?' Hľa, hovorím vám: Zdvihnite oči a pozrite sa na\u00A0polia, že sú už biele na\u00A0žatvu! Žnec už dostáva odmenu a zbiera úrodu pre\u00A0večný život, aby sa spoločne tešili aj rozsievač, aj žnec. Tu sa potvrdzuje príslovie: Jeden rozsieva a druhý žne. Ja som vás poslal žať to, na\u00A0čom ste nepracovali. Pracovali iní a vy ste vstúpili do\u00A0ich práce.\"<br>" +
                            "Mnoho Samaritánov z\u00A0toho mesta uverilo v\u00A0neho pre\u00A0slovo ženy, ktorá svedčila: \"Povedal mi všetko, čo som porobila.\"<br>" +
                            "Keď Samaritáni prišli k\u00A0nemu, prosili ho, aby u\u00A0nich zostal. I zostal tam dva dni. A ešte oveľa viac ich uverilo pre\u00A0jeho slovo. A žene povedali: \"Už veríme nielen pre\u00A0tvoje slovo, ale sami sme počuli a vieme, že toto je naozaj Spasiteľ sveta.\"<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Jn 4, 5-15. 19b-26. 39a. 40-42",
                    "Prameň vody prúdiacej do\u00A0večného života",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš prišiel do\u00A0samarijského mesta menom Sychar neďaleko pozemku, ktorý dal Jakub svojmu synovi Jozefovi. Tam bola Jakubova studňa. Ježiš unavený z\u00A0cesty sadol si k\u00A0studni. Bolo okolo poludnia.<br>" +
                            "Tu prišla po\u00A0vodu istá Samaritánka. Ježiš jej povedal: \"Daj sa mi napiť!\" Jeho učeníci odišli do\u00A0mesta nakúpiť potravy.<br>" +
                            "Samaritánka mu povedala: \"Ako si môžeš ty, Žid, pýtať vodu odo\u00A0mňa, Samaritánky?\" Židia sa totiž so\u00A0Samaritánmi nestýkajú.<br>" +
                            "Ježiš jej odpovedal: \"Keby si poznala Boží dar a vedela, kto je ten, čo ti hovorí: ‚Daj sa mi napiť,' ty by si poprosila jeho a on by ti dal živú vodu.\"<br>" +
                            "Žena mu povedala: \"Pane, ani vedro nemáš a studňa je hlboká. Odkiaľ máš teda živú vodu? Si azda väčší ako náš otec Jakub, ktorý nám dal túto studňu a pil z\u00A0nej on sám i jeho synovia a jeho stáda?\"<br>" +
                            "Ježiš jej odvetil: \"Každý, kto pije túto vodu, bude znova smädný. Ale kto sa napije z\u00A0vody, ktorú mu ja dám, nebude žízniť naveky. A voda, ktorú mu dám, stane sa v\u00A0ňom prameňom vody prúdiacej do\u00A0večného života.\"<br>" +
                            "Žena mu vravela: \"Pane, daj mi takej vody, aby som už nebola smädná a nemusela sem chodiť čerpať! Vidím, že si prorok. Naši otcovia sa klaňali Bohu na\u00A0tomto vrchu, a vy hovoríte, že v\u00A0Jeruzaleme je miesto, kde sa treba klaňať.\"<br>" +
                            "Ježiš jej povedal: \"Ver mi, žena, že prichádza hodina, keď sa nebudete klaňať Otcovi ani na\u00A0tomto vrchu, ani v\u00A0Jeruzaleme. Vy sa klaniate tomu, čo nepoznáte; my sa klaniame tomu, čo poznáme, lebo spása je zo\u00A0Židov. Ale prichádza hodina, ba už je tu, keď sa praví ctitelia budú klaňať Otcovi v\u00A0Duchu a pravde. Lebo sám Otec hľadá takých ctiteľov. Boh je Duch a tí, čo sa mu klaňajú, musia sa mu klaňať v\u00A0Duchu a pravde.\"<br>" +
                            "Žena mu vravela: \"Viem, že príde Mesiáš, zvaný Kristus. Až príde on, zvestuje nám všetko.\"<br>" +
                            "Ježiš jej povedal: \"To som ja, čo sa rozprávam s\u00A0tebou.\"<br>" +
                            "Mnoho Samaritánov z\u00A0toho mesta uverilo v\u00A0neho. Keď Samaritáni prišli k\u00A0nemu, prosili ho, aby u\u00A0nich zostal. I zostal tam dva dni. A ešte oveľa viac ich uverilo pre\u00A0jeho slovo. A žene povedali: \"Už veríme nielen pre\u00A0tvoje slovo, ale sami sme počuli a vieme, že toto je naozaj Spasiteľ sveta.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"30", "B", "", "Jn 2, 13-25",
                    "Zborte tento chrám a za\u00A0tri dni ho postavím",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Blízko bola židovská Veľká noc a Ježiš vystúpil do\u00A0Jeruzalema. V\u00A0chráme našiel predavačov dobytka, oviec a holubov i peňazomencov, čo tam sedeli. Urobil si z\u00A0povrázkov bič a všetkých vyhnal z\u00A0chrámu, aj ovce a dobytok. Peňazomencom rozhádzal peniaze a poprevracal stoly a predavačom holubov povedal: \"Odneste to odtiaľto! Nerobte z\u00A0domu môjho Otca tržnicu!\" Jeho učeníci si spomenuli, že je napísané: \"Strávi ma horlivosť za\u00A0tvoj dom.\"<br>" +
                            "Židia sa ho opýtali: \"Aké znamenie nám ukážeš, že môžeš toto robiť?\"<br>" +
                            "Ježiš im odpovedal: \"Zborte tento chrám a za\u00A0tri dni ho postavím.\"<br>" +
                            "Židia povedali: \"Štyridsaťšesť rokov stavali tento chrám a ty ho postavíš za\u00A0tri dni?\"<br>" +
                            "Ale on hovoril o\u00A0chráme svojho tela. Keď potom vstal z\u00A0mŕtvych, jeho učeníci si spomenuli, že toto hovoril, a uverili Písmu i slovu, ktoré povedal Ježiš.<br>" +
                            "Keď bol cez\u00A0veľkonočné sviatky v\u00A0Jeruzaleme, mnohí uverili v\u00A0jeho meno, lebo videli znamenia, ktoré robil. Ale Ježiš sa im nezdôveril; on poznal každého a nepotreboval, aby mu niekto vydával svedectvo o\u00A0človekovi. Sám totiž vedel, čo je v\u00A0človeku.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"30", "C", "", "Lk 13, 1-9",
                    "Ak nebudete robiť pokánie, všetci zahyniete podobne",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Niektorí z\u00A0tých, čo tam boli v\u00A0tom čase, rozprávali Ježišovi o\u00A0Galilejčanoch, ktorých krv Pilát zmiešal s\u00A0krvou ich obetí. On im povedal: \"Myslíte si, že títo Galilejčania boli väčší hriešnici ako ostatní Galilejčania, keď tak trpeli? Nie, hovorím vám, ale ak nebudete robiť pokánie, všetci podobne zahyniete. Alebo si myslíte, že tí osemnásti, čo na\u00A0nich padla veža v\u00A0Siloe a zabila ich, boli väčší vinníci ako ostatní obyvatelia Jeruzalema? Nie, hovorím vám, ale ak nebudete robiť pokánie, všetci zahyniete podobne.\"<br>" +
                            "A povedal toto podobenstvo: \"Ktosi mal vo\u00A0vinici zasadený figovník a prišiel hľadať na\u00A0ňom ovocie, ale nenašiel. Preto povedal vinohradníkovi: ‚Pozri, už tri roky chodím hľadať ovocie na\u00A0tomto figovníku, a nič nenachádzam. Vytni ho! Načo ešte aj zem vyčerpáva?'<br>" +
                            "On mu odvetil: ‚Pane, nechaj ho ešte tento rok. Okopem ho a pohnojím. Možno nabudúce prinesie ovocie. Ak nie, potom ho vytneš.'\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"31", "1", "", "Lk 4, 24-30",
                    "Ježiš nebol podobne ako Eliáš a Elizeus poslaný iba k\u00A0Židom",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Keď Ježiš prišiel do\u00A0Nazareta, povedal ľudu v\u00A0synagóge: \"Veru, hovorím vám: Ani jeden prorok nie je vzácny vo\u00A0svojej vlasti. Ale vravím vám pravdu: Mnoho vdov bolo v\u00A0Izraeli za\u00A0dní Eliáša, keď sa zavrelo nebo na\u00A0tri roky a šesť mesiacov a nastal veľký hlad po\u00A0celej krajine. A ani k\u00A0jednej z\u00A0nich nebol poslaný Eliáš, iba k\u00A0onej vdove do\u00A0Sarepty v\u00A0Sidone.<br>" +
                            "A mnoho malomocných bolo v\u00A0Izraeli za\u00A0proroka Elizea, a ani jeden z\u00A0nich nebol očistený, iba Sýrčan Náman.\"<br>" +
                            "Keď to počuli, všetkých v\u00A0synagóge zachvátil hnev. Vstali, vyhnali ho z\u00A0mesta a viedli ho až na\u00A0zráz vrchu, na\u00A0ktorom bolo ich mesto postavené, a odtiaľ ho chceli zhodiť. Ale on prešiel pomedzi nich a odišiel.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"32", "2", "", " Mt 18, 21-35",
                    "Ak neodpustíte každý svojmu bratovi, Otec neodpustí vám",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Peter pristúpil k\u00A0Ježišovi a povedal mu: \"Pane, koľko ráz mám odpustiť svojmu bratovi, keď sa proti mne prehreší? Azda sedem ráz?\"<br>" +
                            "Ježiš mu odpovedal: \"Hovorím ti: Nie sedem ráz, ale sedemdesiatsedem ráz.<br>" +
                            "Preto sa nebeské kráľovstvo podobá kráľovi, ktorý sa rozhodol vyúčtovať so\u00A0svojimi sluhami. Keď začal účtovať, priviedli mu jedného, ktorý bol dlžen desaťtisíc talentov. Ale pretože nemal skadiaľ vrátiť, pán rozkázal predať jeho aj jeho ženu aj deti i všetko, čo mal, a dlh splatiť.<br>" +
                            "Vtedy mu sluha padol k\u00A0nohám a na\u00A0kolenách ho prosil: ‚Pozhovej mi a všetko ti vrátim.' A pán sa nad\u00A0sluhom zľutoval, prepustil ho a odpustil mu aj dlžobu.<br>" +
                            "No len čo ten sluha vyšiel, stretol sa so\u00A0svojím spolusluhom, ktorý mu dlhoval sto denárov. Chytil ho pod\u00A0krk a kričal: ‚Vráť, čo mi dlhuješ!'<br>" +
                            "Jeho spolusluha mu padol k\u00A0nohám a prosil ho: ‚Pozhovej mi a dlžobu ti splatím.'<br>" +
                            "On však nechcel, ale odišiel a vrhol ho do\u00A0žalára, kým dlh nesplatí.<br>" +
                            "Keď jeho spolusluhovia videli, čo sa stalo, veľmi sa zarmútili. Išli a rozpovedali svojmu pánovi všetko, čo sa stalo.<br>" +
                            "A tak si ho pán predvolal a povedal mu: ‚Zlý sluha, ja som ti odpustil celú dlžobu, pretože si ma prosil. Nemal si sa teda aj ty zľutovať nad\u00A0svojím spolusluhom, ako som sa ja zľutoval nad\u00A0tebou?' A rozhnevaný pán ho vydal mučiteľom, kým nesplatí celú dlžobu.<br>" +
                            "Tak aj môj nebeský Otec urobí vám, ak neodpustíte zo\u00A0srdca každý svojmu bratovi.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"33", "3", "", "Mt 5, 17-19",
                    "Kto ich zachová a tak bude aj učiť, ten bude veľký",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Nemyslite si, že som prišiel zrušiť Zákon alebo Prorokov; neprišiel som ich zrušiť, ale naplniť.<br>" +
                            "Veru, hovorím vám: Kým sa nepominie nebo a zem, nepominie sa ani jediné písmeno, ani jediná čiarka zo\u00A0Zákona, kým sa všetko nesplní.<br>" +
                            "Kto by teda zrušil jediné z\u00A0týchto prikázaní, čo aj najmenšie, a tak by učil ľudí, bude v\u00A0nebeskom kráľovstve najmenší. Ale kto ich zachová a tak bude aj učiť, ten bude v\u00A0nebeskom kráľovstve veľký.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"34", "4", "", "Lk 11, 14-23",
                    "Kto nie je so\u00A0mnou, je proti mne",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš raz vyháňal zlého ducha, ktorý bol nemý. Keď zlý duch vyšiel, nemý prehovoril. Zástupy žasli; no niektorí z\u00A0nich hovorili: \"Mocou Belzebula, kniežaťa zlých duchov, vyháňa zlých duchov.\"<br>" +
                            "Iní žiadali od\u00A0neho znamenie z\u00A0neba, aby ho pokúšali.<br>" +
                            "Ale on poznal ich myšlienky a povedal im: \"Každé kráľovstvo vnútorne rozdelené spustne a dom na\u00A0dom sa zrúti. Ak je aj satan vnútorne rozdelený, akože obstojí jeho kráľovstvo? Vy hovoríte, že ja mocou Belzebula vyháňam zlých duchov. No ak ja vyháňam zlých duchov mocou Belzebula, čou mocou ich vyháňajú vaši synovia? Preto oni budú vašimi sudcami.<br>" +
                            "Ale ak ja Božím prstom vyháňam zlých duchov, potom k\u00A0vám prišlo Božie kráľovstvo.<br>" +
                            "Keď silný ozbrojený človek stráži svoj dvor, jeho majetok je v\u00A0bezpečí. Ale keď ho prepadne silnejší ako on, premôže ho, vezme mu zbrane na\u00A0ktoré sa spoliehal, a korisť rozdelí.<br>" +
                            "Kto nie je so\u00A0mnou, je proti mne, a kto nezhromažďuje so\u00A0mnou, rozhadzuje.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"35", "5", "", "Mk 12, 28b-34",
                    "Iného, väčšieho prikázania ako sú tieto, niet",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Jeden zo\u00A0zákonníkov pristúpil k\u00A0Ježišovi a spýtal sa ho: \"Ktoré prikázanie je prvé zo\u00A0všetkých?\"<br>" +
                            "Ježiš odpovedal: \"Prvé je toto: ‚Počuj, Izrael, Pán, náš Boh, je jediný Pán. Milovať budeš Pána, svojho Boha, z\u00A0celého svojho srdca, z\u00A0celej svojej duše, z\u00A0celej svojej mysle a z\u00A0celej svojej sily!' Druhé je toto: ‚Milovať budeš svojho blížneho ako seba samého!' Iného, väčšieho prikázania, ako sú tieto, niet.\"<br>" +
                            "Zákonník mu vravel: \"Dobre, Učiteľ, správne si povedal: ‚Jediný je a okrem neho iného niet; a milovať ho z\u00A0celého srdca, z\u00A0celého rozumu a z\u00A0celej sily' a ‚milovať blížneho ako seba samého' je viac ako všetky zápalné a ostatné obety.\"<br>" +
                            "Keď Ježiš videl, že odpovedal rozumne, povedal mu: \"Nie si ďaleko od\u00A0Božieho kráľovstva.\"<br>" +
                            "A už sa ho nik neodvážil vypytovať.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"36", "6", "", "Lk 18, 9-14",
                    "Mýtnik odišiel domov ospravedlnený, a nie farizej",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Tým, čo si namýšľali, že sú spravodliví, a ostatnými pohŕdali, povedal Ježiš toto podobenstvo: \"Dvaja ľudia vstúpili do\u00A0chrámu modliť sa. Jeden bol farizej, druhý mýtnik.<br>" +
                            "Farizej sa postavil a takto sa v\u00A0sebe modlil: ‚Bože, ďakujem ti, že nie som ako ostatní ľudia: vydierači, nespravodlivci, cudzoložníci alebo aj ako tento mýtnik. Postím sa dva razy do\u00A0týždňa, dávam desiatky zo\u00A0všetkého, čo mám.'<br>" +
                            "Mýtnik stál celkom vzadu a neodvážil sa ani oči k\u00A0nebu zdvihnúť, ale bil sa do\u00A0pŕs a hovoril: ‚Bože, buď milostivý mne hriešnemu.'<br>" +
                            "Hovorím vám: Tento odišiel domov ospravedlnený, a nie tamten. Lebo každý, kto sa povyšuje, bude ponížený, a kto sa ponižuje, bude povýšený.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"40", "A", "", "Jn 9, 1-41",
                    "Šiel, umyl sa a vrátil sa vidiaci",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ako Ježiš šiel, videl človeka, ktorý bol od\u00A0narodenia slepý. Jeho učeníci sa ho spýtali: \"Rabbi, kto zhrešil – on, alebo jeho rodičia –, že sa narodil slepý?\"<br>" +
                            "Ježiš odpovedal: \"Nezhrešil ani on ani jeho rodičia, ale majú sa na\u00A0ňom zjaviť Božie skutky. Musíme konať skutky toho, ktorý ma poslal, dokiaľ je deň. Ide noc, keď nik nebude môcť pracovať. Kým som na\u00A0svete, som, svetlo sveta.\"<br>" +
                            "Keď to povedal, napľul na\u00A0zem, urobil zo\u00A0sliny blato, blatom mu potrel oči a povedal mu: \"Choď, umy sa v\u00A0rybníku Siloe,\" čo v\u00A0preklade znamená: Poslaný. On šiel, umyl sa a vrátil sa vidiaci.<br>" +
                            "Susedia a tí, čo ho predtým vídali žobrať, hovorili: \"Nie je to ten, čo tu sedával a žobral?\"<br>" +
                            "Jedni tvrdili: \"Je to on.\" Iní zasa: \"Nie je, len sa mu podobá.\" On vravel: \"Ja som to.\"<br>" +
                            "Pýtali sa ho teda: \"Ako to, že sa ti otvorili oči?\"<br>" +
                            "On odpovedal: \"Človek, ktorý sa volá Ježiš, urobil blato, potrel mi oči a povedal mi: ‚Choď k\u00A0Siloe a umy sa!' Šiel som teda, umyl som sa a vidím.\"<br>" +
                            "Pýtali sa ho: \"Kde je ten človek?\"<br>" +
                            "Odpovedal: \"Neviem.\"<br>" +
                            "Zaviedli ho, toho, čo bol predtým slepý, k\u00A0farizejom. Ale v\u00A0ten deň, keď Ježiš urobil blato a otvoril mu oči, bola práve sobota. Preto sa ho aj farizeji pýtali, ako to, že vidí. On im povedal: \"Priložil mi na\u00A0oči blato, umyl som sa a vidím.\"<br>" +
                            "Niektorí farizeji hovorili: \"Ten človek nie je od\u00A0Boha, lebo nezachováva sobotu.\"<br>" +
                            "Iní vraveli: \"Ako môže hriešny človek robiť takéto znamenia?\" A rozštiepili sa.<br>" +
                            "Znova sa teda pýtali slepého: \"Čo hovoríš o\u00A0ňom ty? Veď tebe otvoril oči!?\"<br>" +
                            "On odpovedal: \"Je prorok.\"<br>" +
                            "Židia však neverili, že bol slepý a teraz vidí, kým si nezavolali jeho rodičov. Opýtali sa ich: \"Je to váš syn? A hovoríte, že sa narodil slepý? Ako to, že teraz vidí?\"<br>" +
                            "Rodičia odpovedali: \"Vieme, že je to náš syn a že sa narodil slepý. Ale ako to, že teraz vidí, to nevieme, ani nevieme, kto mu otvoril oči. Jeho sa spýtajte. Má svoje roky, nech hovorí sám za\u00A0seba.\" Jeho rodičia hovorili tak preto, že sa báli Židov. Židia sa už totiž uzniesli, že každý, kto by ho uznal za\u00A0Mesiáša, má byť vylúčený zo\u00A0synagógy. Preto jeho rodičia povedali: \"Má svoje roky, jeho sa spýtajte.\"<br>" +
                            "Znovu teda zavolali človeka, čo bol predtým slepý, a povedali mu: \"Vzdaj Bohu slávu! My vieme, že ten človek je hriešnik.\"<br>" +
                            "On odvetil: \"Či je hriešnik, neviem. Ale jedno viem: že som bol slepý a teraz vidím.\"<br>" +
                            "Spýtali sa ho teda: \"Čo urobil s\u00A0tebou? Ako ti otvoril oči?\"<br>" +
                            "Odpovedal im: \"Už som vám povedal, a nepočuli ste. Prečo to chcete počuť znova? Chcete sa aj vy stať jeho učeníkmi?\"<br>" +
                            "Vynadali mu a povedali: \"Ty si jeho učeník, my sme Mojžišovi učeníci. My vieme, že Mojžišovi hovoril Boh, a o\u00A0tomto nevieme ani to, odkiaľ je.\"<br>" +
                            "Ten človek im odpovedal: \"Práve to je čudné, že vy neviete, odkiaľ je, a mne otvoril oči. Vieme, že hriešnikov Boh nevyslyší; ale vyslyší toho, kto si Boha ctí a plní jeho vôľu. Od\u00A0vekov nebolo počuť, že by bol niekto otvoril oči slepému od\u00A0narodenia. Keby on nebol od\u00A0Boha, nemohol by nič také urobiť.\"<br>" +
                            "Povedali mu: \"Celý si sa v\u00A0hriechoch narodil a nás poúčaš?!\" A vyhnali ho von.<br>" +
                            "Ježiš sa dopočul, že ho vyhnali, vyhľadal ho a povedal mu: \"Ty veríš v\u00A0Syna človeka?\"<br>" +
                            "On vravel: \"A kto je to, Pane, aby som v\u00A0neho uveril?\"<br>" +
                            "Ježiš mu povedal: \"Už si ho videl a je to ten, čo sa rozpráva s\u00A0tebou.\"<br>" +
                            "On povedal: \"Verím, Pane,\" a klaňal sa mu.<br>" +
                            "Ježiš povedal: \"Súdiť som prišiel na\u00A0tento svet: aby tí, čo nevidia, videli, a tí, čo vidia, aby oslepli.\"<br>" +
                            "Začuli to farizeji, čo boli pri\u00A0ňom, a povedali mu: \"Sme azda aj my slepí?!\"<br>" +
                            "Ježiš im odpovedal: \"Keby ste boli slepí, nemali by ste hriech. Vy však hovoríte: ‚Vidíme.' A tak váš hriech ostáva.\"<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Jn 9, 1. 6-9. 13-17. 34-38",
                    "Šiel, umyl sa a vrátil sa vidiaci",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ako Ježiš šiel, videl človeka, ktorý bol od\u00A0narodenia slepý. Napľul na\u00A0zem, urobil zo\u00A0sliny blato, blatom mu potrel oči a povedal mu: \"Choď, umy sa v\u00A0rybníku Siloe,\" čo v\u00A0preklade znamená: Poslaný. On šiel, umyl sa a vrátil sa vidiaci.<br>" +
                            "Susedia a tí, čo ho predtým vídali žobrať, hovorili: \"Nie je to ten, čo tu sedával a žobral?\"<br>" +
                            "Jedni tvrdili: \"Je to on.\"<br>" +
                            "Iní zasa: \"Nie je, len sa mu podobá.\"<br>" +
                            "On vravel: \"Ja som to.\"<br>" +
                            "Zaviedli ho, toho, čo bol predtým slepý, k\u00A0farizejom. Ale v\u00A0ten deň, keď Ježiš urobil blato a otvoril mu oči, bola práve sobota. Preto sa ho aj farizeji pýtali, ako to, že vidí. On im povedal: \"Priložil mi na\u00A0oči blato, umyl som sa a vidím.\"<br>" +
                            "Niektorí farizeji hovorili: \"Ten človek nie je od\u00A0Boha, lebo nezachováva sobotu.\" Iní vraveli: \"Ako môže hriešny človek robiť takéto znamenia?\" A rozštiepili sa.<br>" +
                            "Znova sa teda pýtali slepého: \"Čo hovoríš o\u00A0ňom ty? Veď tebe otvoril oči!?\" On odpovedal: \"Je prorok.\"<br>" +
                            "Povedali mu: \"Celý si sa v\u00A0hriechoch narodil a nás poúčaš?!\" A vyhnali ho von.<br>" +
                            "Ježiš sa dopočul, že ho vyhnali, vyhľadal ho a povedal mu: \"Ty veríš v\u00A0Syna človeka?\"<br>" +
                            "On vravel: \"A kto je to, Pane, aby som v\u00A0neho uveril?\"<br>" +
                            "Ježiš mu povedal: \"Už si ho videl a je to ten, čo sa rozpráva s\u00A0tebou.\"<br>" +
                            "On povedal: \"Verím, Pane,\" a klaňal sa mu.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"40", "B", "", "Jn 3, 14-21",
                    "Boh poslal Syna, aby sa skrze neho svet spasil",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal Nikodémovi: \"Ako Mojžiš vyzdvihol na\u00A0púšti hada, tak musí byť vyzdvihnutý aj Syn človeka, aby každý, kto verí, mal v\u00A0ňom večný život.\"<br>" +
                            "Veď Boh tak miloval svet, že dal svojho jednorodeného Syna, aby nezahynul nik, kto v\u00A0neho verí, ale aby mal večný život. Lebo Boh neposlal Syna na\u00A0svet, aby svet odsúdil, ale aby sa skrze neho svet spasil.<br>" +
                            "Kto v\u00A0neho verí, nie je súdený. Ale kto neverí, už je odsúdený, pretože neuveril v\u00A0meno Jednorodeného Božieho Syna.<br>" +
                            "A súd je v\u00A0tomto: Svetlo prišlo na\u00A0svet, a ľudia milovali tmu viac ako svetlo, lebo ich skutky boli zlé. Veď každý, kto zle robí, nenávidí svetlo a nejde na\u00A0svetlo, aby jeho skutky neboli odhalené. Ale kto koná pravdu, ide na\u00A0svetlo, aby bolo vidieť, že svoje skutky koná v\u00A0Bohu.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"40", "C", "", "Lk 15, 1-3. 11-32",
                    "Tento tvoj brat bol mŕtvy, a ožil",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "K Ježišovi sa približovali všetci mýtnici a hriešnici a počúvali ho. Farizeji a zákonníci šomrali: \"Tento prijíma hriešnikov a jedáva s\u00A0nimi.\"<br>" +
                            "Preto im povedal toto podobenstvo: \"Istý človek mal dvoch synov. Mladší z\u00A0nich povedal otcovi: ‚Otec, daj mi časť majetku, ktorá mi patrí.' A on im rozdelil majetok. O\u00A0niekoľko dní si mladší syn všetko zobral, odcestoval do\u00A0ďalekého kraja a tam svoj majetok hýrivým životom premárnil.<br>" +
                            "Keď všetko premrhal, nastal v\u00A0tej krajine veľký hlad a on začal trieť núdzu. Išiel teda a uchytil sa u\u00A0istého obyvateľa tej krajiny a on ho poslal na\u00A0svoje hospodárstvo svine pásť. I túžil nasýtiť sa aspoň strukmi, čo žrali svine, ale nik mu ich nedával.<br>" +
                            "Vstúpil teda do\u00A0seba a povedal si: ‚Koľko nádenníkov u\u00A0môjho otca má chleba nazvyš, a ja tu hyniem od\u00A0hladu. Vstanem, pôjdem k\u00A0svojmu otcovi a poviem mu: Otče, zhrešil som proti nebu i voči tebe. Už nie som hoden volať sa tvojím synom. Prijmi ma ako jedného zo\u00A0svojich nádenníkov.' I vstal a šiel k\u00A0svojmu otcovi.<br>" +
                            "Ešte bol ďaleko, keď ho zazrel jeho otec, a bolo mu ho ľúto. Pribehol k\u00A0nemu, hodil sa mu okolo krku a vybozkával ho.<br>" +
                            "Syn mu povedal: ‚Otče, zhrešil som proti nebu i voči tebe. Už nie som hoden volať sa tvojím synom.'<br>" +
                            "Ale otec povedal svojim sluhom: ‚Rýchlo prineste najlepšie šaty a oblečte ho! Dajte mu prsteň na\u00A0ruku a obuv na\u00A0nohy! Priveďte vykŕmené teľa a zabite ho. Jedzme a veselo hodujme, lebo tento môj syn bol mŕtvy, a ožil, bol stratený, a našiel sa.' A začali hodovať.<br>" +
                            "Jeho starší syn bol práve na\u00A0poli. Keď sa vracal a približoval sa k\u00A0domu, počul hudbu a tanec. Zavolal si jedného zo\u00A0sluhov a pýtal sa, čo sa deje. Ten mu povedal: ‚Prišiel tvoj brat a tvoj otec zabil vykŕmené teľa, lebo sa mu vrátil zdravý.'<br>" +
                            "On sa však nahneval a nechcel vojsť. Vyšiel teda otec a začal ho prosiť.<br>" +
                            "Ale on odpovedal otcovi: ‚Už toľko rokov ti slúžim a nikdy som neprestúpil tvoj príkaz, a mne si nikdy nedal ani kozliatko, aby som sa zabavil so\u00A0svojimi priateľmi. No keď prišiel tento tvoj syn, čo ti prehýril majetok s\u00A0neviestkami, pre\u00A0neho si zabil vykŕmené teľa.'<br>" +
                            "On mu na\u00A0to povedal: ‚Syn môj, ty si stále so\u00A0mnou a všetko, čo ja mám, je tvoje. Ale patrilo sa hodovať a radovať sa, lebo tento tvoj brat bol mŕtvy, a ožil, bol stratený, a našiel sa.'\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"41", "1", "", "Jn 4, 43-54",
                    "Choď, tvoj syn žije!",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš odišiel zo\u00A0Samárie do\u00A0Galiley. Lebo sám Ježiš sa osvedčil, že vo\u00A0svojej vlasti prorok nemá úctu. Keď prišiel do\u00A0Galiley, Galilejčania ho uvítali, lebo videli všetko, čo urobil cez\u00A0sviatky v\u00A0Jeruzaleme. Aj oni tam boli na\u00A0sviatky.<br>" +
                            "Prišiel teda znova do\u00A0Kány Galilejskej, kde premenil vodu na\u00A0víno. Bol tam istý kráľovský úradník, ktorý mal v\u00A0Kafarnaume chorého syna. Ako počul, že Ježiš prišiel z\u00A0Judey do\u00A0Galiley, vybral sa k\u00A0nemu a prosil ho, aby šiel uzdraviť jeho syna, ktorý už umieral. Ježiš mu povedal: \"Ak nevidíte znamenia a divy, neveríte.\"<br>" +
                            "Kráľovský úradník mu hovoril: \"Pane, poď, kým mi dieťa neumrie!\"<br>" +
                            "Ježiš mu povedal: \"Choď, tvoj syn žije!\" On uveril Ježišovmu slovu a šiel.<br>" +
                            "Ešte bol na\u00A0ceste, keď mu prišli sluhovia naproti a hovorili že jeho dieťa žije. Pýtal sa ich, koľko hodín bolo, keď sa mu uľavilo. Povedali mu: \"Včera o\u00A0jednej popoludní mu prestala horúčka.\" Tu otec poznal, že to bolo práve v\u00A0tú hodinu, keď mu Ježiš povedal: \"Tvoj syn žije.\" A uveril on i celý jeho dom.<br>" +
                            "Toto bolo už druhé znamenie, ktoré urobil Ježiš, keď prišiel z\u00A0Judey do\u00A0Galiley.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"42", "2", "", "Jn 5, 1-3. 5-16",
                    "A ten človek hneď ozdravel",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Boli židovské sviatky a Ježiš vystupoval do\u00A0Jeruzalema.<br>" +
                            "V Jeruzaleme pri\u00A0Ovčej bráne je rybník, hebrejsky zvaný Betsata, a pri\u00A0ňom päť stĺporadí. V\u00A0nich ležalo množstvo chorých, slepých, chromých a ochrnutých.<br>" +
                            "Bol tam aj istý človek, chorý už tridsaťosem rokov. Keď ho tam videl Ježiš ležať a zvedel, že je už dlho chorý, povedal mu: \"Chceš ozdravieť?\"<br>" +
                            "Chorý mu odpovedal: \"Pane, nemám človeka, čo by ma spustil do\u00A0rybníka, keď sa zvíri voda. A kým sa ta sám dostanem, iný ma predíde.\"<br>" +
                            "Ježiš mu vravel: \"Vstaň, vezmi si lôžko a choď!\" A ten človek hneď ozdravel, vzal si lôžko a chodil.<br>" +
                            "No v\u00A0ten deň bola sobota, preto Židia hovorili uzdravenému: \"Je sobota, nesmieš nosiť lôžko!\"<br>" +
                            "Ale on im odvetil: \"Ten, čo ma uzdravil, mi povedal: ‚Vezmi si lôžko a choď!'\"<br>" +
                            "Pýtali sa ho: \"A kto je ten človek, čo ti povedal: ‚Vezmi a choď?'\"<br>" +
                            "Ale uzdravený nevedel, kto je to, lebo Ježiš sa vzdialil spomedzi zástupu, čo sa zišiel na\u00A0tom mieste.<br>" +
                            "Neskôr ho Ježiš našiel v\u00A0chráme a povedal mu: \"Hľa, ozdravel si, už nehreš, aby ťa nepostihlo niečo horšie.\"<br>" +
                            "A ten človek šiel povedať Židom, že ho to Ježiš uzdravil. A Židia Ježiša prenasledovali za\u00A0to, že robil takéto veci v\u00A0sobotu.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"43", "3", "", "Jn 5, 17-30",
                    "Lebo ako Otec kriesi mŕtvych a oživuje, tak aj Syn oživuje, koho chce",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal Židom: \"Môj Otec pracuje doteraz, aj ja pracujem.\" Preto sa Židia ešte väčšmi usilovali zabiť ho, lebo nielenže porušoval sobotu, ale aj Boha nazýval svojím Otcom a robil sa rovným Bohu.<br>" +
                            "Ježiš im vravel: \"Veru veru, hovorím vám: Syn nemôže nič robiť sám od\u00A0seba, len to, čo vidí robiť Otca. Čo robí Otec, to robí podobne aj Syn. Veď Otec miluje Syna a ukazuje mu všetko, čo sám robí; a ukáže mu ešte väčšie skutky ako tieto, aby ste sa čudovali.<br>" +
                            "Lebo ako Otec kriesi mŕtvych a oživuje, tak aj Syn oživuje, koho chce.<br>" +
                            "A Otec nikoho ani nesúdi, ale všetok súd odovzdal Synovi, aby si všetci ctili Syna tak, ako si ctia Otca. Kto si nectí Syna, nectí si ani Otca, ktorý ho poslal.<br>" +
                            "Veru, veru, hovorím vám: Kto počúva moje slovo a verí tomu, ktorý ma poslal, má večný život a nepôjde na\u00A0súd, ale prešiel zo\u00A0smrti do\u00A0života.<br>" +
                            "Nedivte sa tomu, lebo prichádza hodina, keď všetci v\u00A0hroboch počujú jeho hlas a vyjdú: tí, čo robili dobre, budú vzkriesení pre\u00A0život a tí, čo páchali zlo, budú vzkriesení na\u00A0odsúdenie.<br>" +
                            "Ja nemôžem nič robiť sám od\u00A0seba. Súdim, ako počujem. A môj súd je spravodlivý, lebo nehľadám svoju vôľu, ale vôľu toho, ktorý ma poslal.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"44", "4", "", "Jn 5, 31-47",
                    "Iný na\u00A0vás žaluje: Mojžiš, do\u00A0ktorého skladáte svoju nádej",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal Židom: \"Ak vydávam svedectvo o\u00A0sebe len ja sám, moje svedectvo nie je pravdivé. Ale je niekto iný, čo svedčí o\u00A0mne, a ja viem, že svedectvo, ktoré vydáva o\u00A0mne, je pravdivé.<br>" +
                            "Vy ste poslali k\u00A0Jánovi a on vydal svedectvo pravde. Lenže ja neprijímam svedectvo od\u00A0človeka, ale toto hovorím preto, aby ste vy boli spasení. On bol lampa, ktorá horí a svieti, a vy ste sa chceli chvíľu veseliť v\u00A0jeho svetle.<br>" + "Ja mám väčšie svedectvo, ako je Jánovo: skutky, ktoré mi dal vykonať Otec. Tieto skutky, ktoré konám, svedčia o\u00A0mne, že ma poslal Otec. A sám Otec, ktorý ma poslal, vydal o\u00A0mne svedectvo.<br>" +
                            "Vy ste nikdy nepočuli jeho hlas, ani jeho tvár ste nevideli a jeho slovo neostáva vo\u00A0vás, lebo neveríte tomu, ktorého on poslal.<br>" +
                            "Skúmate Písma, lebo si myslíte, že v\u00A0nich máte večný život, a práve ony svedčia o\u00A0mne. Lenže vy nechcete prísť ku\u00A0mne, aby ste mali život.<br>" +
                            "Slávu od\u00A0ľudí neprijímam. Ale vás poznám, že nemáte v\u00A0sebe Božiu lásku.<br>" +
                            "Ja som prišiel v\u00A0mene môjho Otca, a neprijímate ma. Keby prišiel niekto iný v\u00A0svojom vlastnom mene, toho by ste prijali.<br>" +
                            "Ako môžete veriť vy, ktorí sa navzájom oslavujete, a nehľadáte slávu, ktorú dáva len Boh?!<br>" +
                            "Nemyslite si, že ja budem na\u00A0vás u\u00A0Otca žalovať. Iný na\u00A0vás žaluje: Mojžiš, do\u00A0ktorého skladáte svoju nádej. Lenže keby ste verili Mojžišovi, verili by ste aj mne, lebo on o\u00A0mne písal. Ale ak neveríte tomu, čo on napísal, ako uveríte mojim slovám?!\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"45", "5", "", "Jn 7, 1-2. 10. 25-30",
                    "Chceli ho chytiť, ale ešte neprišla jeho hodina",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš chodil po\u00A0Galilei; nechcel ísť do\u00A0Judey, lebo Židia ho chceli zabiť.<br>" +
                            "Boli však blízko židovské sviatky Stánkov.<br>" +
                            "Ale keď jeho bratia odišli na\u00A0sviatky, išiel aj on, no nie verejne, lež akoby potajomky.<br>" +
                            "Tu niektorí Jeruzalemčania hovorili: \"Nie je to ten, čo ho chcú zabiť? Pozrite, hovorí verejne a nič mu nevravia. Vari sa už aj poprední muži presvedčili, že on je Mesiáš? Lenže o\u00A0tomto vieme, odkiaľ je, ale keď príde Mesiáš, nik nebude vedieť, odkiaľ je.\"<br>" +
                            "A Ježiš učil v\u00A0chráme a zvolal: \"Aj ma poznáte, aj odkiaľ som, viete. A neprišiel som sám od\u00A0seba, ale pravdivý je ten, ktorý ma poslal a vy ho nepoznáte. Ja ho poznám, lebo som od\u00A0neho a on ma poslal.\"<br>" +
                            "Preto ho chceli chytiť, ale nik nepoložil naň ruky, lebo ešte neprišla jeho hodina.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"46", "6", "", "Jn 7, 40-53",
                    "Vari z\u00A0Galiley príde Mesiáš?!",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Keď počuli Ježišove slová, niektorí zo\u00A0zástupu hovorili: \"Toto je naozaj prorok.\" Druhí tvrdili: \"Mesiáš je to.\" Ale iní namietali: \"Vari z\u00A0Galiley príde Mesiáš?! A nehovorí Písmo: ‚Mesiáš príde z\u00A0Dávidovho potomstva, z\u00A0mestečka Betlehem, odkiaľ bol Dávid?!'\" A tak nastala preňho v\u00A0zástupe roztržka.<br>" +
                            "Niektorí z\u00A0nich chceli ho aj chytiť, ale nik nepoložil naň ruky. Sluhovia sa vrátili k\u00A0veľkňazom a farizejom a oni sa ich pýtali: \"Prečo ste ho nepriviedli?\"<br>" +
                            "Sluhovia odpovedali: \"Nikdy tak človek nehovoril.\"<br>" +
                            "Farizeji im vraveli: \"Aj vy ste sa dali zviesť? Vari uveril v\u00A0neho niektorý z\u00A0popredných mužov alebo farizejov? A tento zástup, ktorý nepozná zákon, je prekliaty.\"<br>" +
                            "Jeden z\u00A0nich, Nikodém, ten, čo predtým prišiel k\u00A0Ježišovi, im povedal: \"Odsúdi náš zákon človeka prv, ako by ho vypočul a zistil, čo urobil?\"<br>" +
                            "Odvrávali mu: \"Nie si aj ty z\u00A0Galiley?! Skúmaj a uvidíš, že z\u00A0Galiley prorok nepovstane.\" A všetci sa vrátili domov.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"50", "A", "", "Jn 11, 1-45",
                    "Ja som vzkriesenie a život",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Bol chorý istý Lazár z\u00A0Betánie, z\u00A0dediny Márie a jej sestry Marty. Bola to tá Mária, čo pomazala Pána voňavým olejom a poutierala mu nohy svojimi vlasmi. Jej brat Lazár bol chorý. Preto mu sestry poslali odkaz: \"Pane, ten, ktorého miluješ, je chorý.\"<br>" +
                            "Keď to Ježiš počul, povedal: \"Táto choroba nie je na\u00A0smrť, ale na\u00A0Božiu slávu, aby ňou bol oslávený Boží Syn.\"<br>" +
                            "Ježiš mal rád Martu i jej sestru a Lazára. Keď teda počul, že je chorý, zostal ešte dva dni na\u00A0mieste, kde bol. Až potom povedal učeníkom: \"Poďme znova do\u00A0Judey.\"<br>" +
                            "Učeníci mu vraveli: \"Rabbi, len nedávno ťa Židia chceli ukameňovať a zasa ta ideš?!\"<br>" +
                            "Ježiš odpovedal: \"Nemá deň dvanásť hodín? Kto chodí vo\u00A0dne, nepotkne sa, lebo vidí svetlo tohoto sveta. Ale kto chodí v\u00A0noci, potkne sa, lebo v\u00A0ňom nieto svetla.\"<br>" +
                            "Toto povedal a dodal: \"Náš priateľ Lazár spí, ale idem ho zobudiť.\"<br>" +
                            "Učeníci mu povedali: \"Pane, ak spí, ozdravie.\" Ježiš však hovoril o\u00A0jeho smrti, a oni si mysleli, že hovorí o\u00A0spánku.<br>" +
                            "Vtedy im Ježiš povedal otvorene: \"Lazár zomrel. A kvôli vám sa radujem, že som tam nebol, aby ste uverili. Poďme k\u00A0nemu!\"<br>" +
                            "Tomáš, nazývaný Didymus, povedal ostatným učeníkom: \"Poďme aj my a umrime s\u00A0ním.\"<br>" +
                            "Keď ta Ježiš prišiel, dozvedel sa, že Lazár je už štyri dni v\u00A0hrobe. Betánia bola pri\u00A0Jeruzaleme, vzdialená asi pätnásť stadií, a tak prišlo k\u00A0Marte a Márii veľa Židov potešiť ich v\u00A0žiali za\u00A0bratom.<br>" +
                            "Keď Marta počula, že prichádza Ježiš, išla mu naproti. Mária zostala doma. Marta povedala Ježišovi: \"Pane, keby si bol býval tu, môj brat by nebol umrel. Ale aj teraz viem, že o\u00A0čokoľvek poprosíš Boha, Boh ti to dá.\"<br>" +
                            "Ježiš jej povedal: \"Tvoj brat vstane z\u00A0mŕtvych.\"<br>" +
                            "Marta mu vravela: \"Viem, že vstane v\u00A0posledný deň pri\u00A0vzkriesení.\"<br>" +
                            "Ježiš jej povedal: \"Ja som vzkriesenie a život. Kto verí vo\u00A0mňa, bude žiť, aj keď umrie. A nik, kto žije a verí vo\u00A0mňa, neumrie naveky. Veríš tomu?\"<br>" +
                            "Povedala mu: \"Áno, Pane, ja som uverila, že ty si Mesiáš, Boží Syn, ktorý mal prísť na\u00A0svet.\"<br>" +
                            "Ako to povedala, odišla, zavolala svoju sestru Máriu a potichu jej vravela: \"Učiteľ je tu a volá ťa.\" Len čo to ona počula, vstala a šla k\u00A0nemu. Ježiš totiž ešte nevošiel do\u00A0dediny, ale bol stále na\u00A0mieste, kde mu Marta vyšla naproti. Keď Židia, čo boli s\u00A0ňou v\u00A0dome a potešovali ju, videli, že Mária rýchlo vstala a vyšla von, pobrali sa za\u00A0ňou, lebo si mysleli: \"Ide sa vyplakať k\u00A0hrobu.\"<br>" +
                            "Keď Mária prišla ta, kde bol Ježiš, a zazrela ho, padla mu k\u00A0nohám a povedala mu: \"Pane, keby si bol býval tu, môj brat by nebol umrel.\"<br>" +
                            "Keď Ježiš videl, ako plače a ako plačú aj Židia, čo s\u00A0ňou prišli, zachvel sa v\u00A0duchu a vzrušený sa opýtal: \"Kde ste ho uložili?\"<br>" +
                            "Povedali mu: \"Pane, poď sa pozrieť!\" A Ježiš zaslzil.<br>" +
                            "Židia povedali: \"Hľa, ako ho miloval!\"<br>" +
                            "No niektorí z\u00A0nich hovorili: \"A nemohol ten, čo otvoril oči slepému, urobiť, aby tento nezomrel?!\"<br>" +
                            "Ježiš sa znova zachvel a pristúpil k\u00A0hrobu. Bola to jaskyňa uzavretá kameňom.<br>" +
                            "Ježiš povedal: \"Odvaľte kameň!\"<br>" +
                            "Marta, sestra mŕtveho, mu povedala: \"Pane, už páchne, veď je už štyri dni v\u00A0hrobe.\"<br>" +
                            "Ježiš jej vravel: \"Nepovedal som ti, že ak uveríš, uvidíš Božiu slávu?\"<br>" +
                            "Odvalili teda kameň. Ježiš pozdvihol oči k\u00A0nebu a povedal: \"Otče, ďakujem ti, že si ma vypočul. A ja som vedel, že ma vždy počuješ, ale hovorím to kvôli ľudu, čo tu stojí, aby uverili, že si ma ty poslal.\"<br>" +
                            "Keď to povedal, zvolal veľkým hlasom: \"Lazár, poď von!\" A mŕtvy vyšiel. Nohy a ruky mal ovinuté plátnom a tvár obviazanú šatkou.<br>" +
                            "Ježiš im povedal: \"Porozväzujte ho a nechajte ho odísť!\"<br>" +
                            "Mnohí z\u00A0tých Židov, čo prišli k\u00A0Márii a videli, čo urobil, uverili v\u00A0neho.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Jn 11, 3-7. 17. 20-27. 33b-45",
                    "Ja som vzkriesenie a život",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Lazárove sestry poslali Ježišovi odkaz: \"Pane, ten, ktorého miluješ, je chorý.\"<br>" +
                            "Keď to Ježiš počul, povedal: \"Táto choroba nie je na\u00A0smrť, ale na\u00A0Božiu slávu, aby ňou bol oslávený Boží Syn.\"<br>" +
                            "Ježiš mal rád Martu i jej sestru a Lazára. Keď teda počul, že je chorý, zostal ešte dva dni na\u00A0mieste, kde bol. Až potom povedal učeníkom: \"Poďme znova do\u00A0Judey.\"<br>" +
                            "Keď ta Ježiš prišiel, dozvedel sa, že Lazár je už štyri dni v\u00A0hrobe.<br>" +
                            "Keď Marta počula, že prichádza Ježiš, išla mu naproti. Mária zostala doma. Marta povedala Ježišovi: \"Pane, keby si bol býval tu, môj brat by nebol umrel. Ale aj teraz viem, že o\u00A0čokoľvek poprosíš Boha, Boh ti to dá.\"<br>" +
                            "Ježiš jej povedal: \"Tvoj brat vstane z\u00A0mŕtvych.\"<br>" +
                            "Marta mu vravela: \"Viem, že vstane v\u00A0posledný deň pri\u00A0vzkriesení.\"<br>" +
                            "Ježiš jej povedal: \"Ja som vzkriesenie a život. Kto verí vo\u00A0mňa, bude žiť, aj keď umrie. A nik, kto žije a verí vo\u00A0mňa, neumrie naveky. Veríš tomu?\"<br>" +
                            "Povedala mu: \"Áno, Pane, ja som uverila, že ty si Mesiáš, Boží Syn, ktorý mal prísť na\u00A0svet.\"<br>" +
                            "Ježiš sa zachvel v\u00A0duchu a vzrušený sa opýtal: \"Kde ste ho uložili?\"<br>" +
                            "Povedali mu: \"Pane, poď sa pozrieť!\" A Ježiš zaslzil.<br>" +
                            "Židia povedali: \"Hľa, ako ho miloval!\"<br>" +
                            "No niektorí z\u00A0nich hovorili: \"A nemohol ten, čo otvoril oči slepému, urobiť, aby tento nezomrel?!\"<br>" +
                            "Ježiš sa znova zachvel a pristúpil k\u00A0hrobu. Bola to jaskyňa uzavretá kameňom. Ježiš povedal: \"Odvaľte kameň!\"<br>" +
                            "Marta, sestra mŕtveho, mu povedala: \"Pane, už páchne, veď je už štyri dni v\u00A0hrobe.\"<br>" +
                            "Ježiš jej vravel: \"Nepovedal som ti, že ak uveríš, uvidíš Božiu slávu?\"<br>" +
                            "Odvalili teda kameň. Ježiš pozdvihol oči k\u00A0nebu a povedal: \"Otče, ďakujem ti, že si ma vypočul. A ja som vedel, že ma vždy počuješ, ale hovorím to kvôli ľudu, čo tu stojí, aby uverili, že si ma ty poslal.\"<br>" +
                            "Keď to povedal, zvolal veľkým hlasom: \"Lazár, poď von!\" A mŕtvy vyšiel. Nohy a ruky mal ovinuté plátnom a tvár obviazanú šatkou.<br>" +
                            "Ježiš im povedal: \"Porozväzujte ho a nechajte ho odísť!\"<br>" +
                            "Mnohí z\u00A0tých Židov, čo prišli k\u00A0Márii a videli, čo urobil, uverili v\u00A0neho.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"50", "B", "", "Jn 12, 20-33",
                    "Ak pšeničné zrno padne do\u00A0zeme a odumrie, prinesie veľkú úrodu",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Niektorí z\u00A0tých, čo sa cez\u00A0sviatky prišli klaňať Bohu, boli Gréci. Pristúpili k\u00A0Filipovi, ktorý bol z\u00A0galilejskej Betsaidy, a prosili ho: \"Pane, chceli by sme vidieť Ježiša.\"<br>" +
                            "Filip šiel a povedal to Ondrejovi. Ondrej a Filip to išli povedať Ježišovi.<br>" +
                            "Ježiš im odpovedal: \"Nadišla hodina, aby bol Syn človeka oslávený. Veru, veru, hovorím vám: Ak pšeničné zrno nepadne do\u00A0zeme a neodumrie, ostane samo. Ale ak odumrie, prinesie veľkú úrodu. Kto miluje svoj život, stratí ho, a kto svoj život nenávidí na\u00A0tomto svete, zachráni si ho pre\u00A0večný život. Ak mi niekto slúži, nech ma nasleduje! A kde som ja, tam bude aj môj služobník. Kto bude mne slúžiť, toho poctí Otec.<br>" +
                            "Teraz je moja duša vzrušená. Čo mám povedať? Otče, zachráň ma pred\u00A0touto hodinou? Veď práve pre\u00A0túto hodinu som prišiel. Otče, osláv svoje meno!\"<br>" +
                            "A z\u00A0neba zaznel hlas: \"Už som oslávil a ešte oslávim.\"<br>" +
                            "Zástup, ktorý tam stál a počul to, hovoril, že zahrmelo. Iní vraveli: \"Anjel s\u00A0ním hovoril.\"<br>" +
                            "Ježiš povedal: \"Nie kvôli mne zaznel tento hlas, ale kvôli vám. Teraz je súd nad\u00A0týmto svetom, teraz bude knieža tohto sveta vyhodené von. A ja, až budem vyzdvihnutý od\u00A0zeme, všetkých pritiahnem k\u00A0sebe.\"<br>" +
                            "To povedal, aby naznačil, akou smrťou zomrie.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"50", "C", "", " Jn 8, 1-11",
                    "Kto z\u00A0vás je bez\u00A0hriechu, nech prvý hodí do\u00A0nej kameň",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš odišiel na\u00A0Olivovú horu. Ale zavčas ráno sa vrátil do\u00A0chrámu a všetok ľud sa hrnul k\u00A0nemu. Sadol si a učil ich.<br>" +
                            "Tu zákonníci a farizeji priviedli ženu pristihnutú pri\u00A0cudzoložstve, postavili ju do\u00A0prostriedku a povedali mu: \"Učiteľ, túto ženu pristihli priamo pri\u00A0cudzoložstve. Mojžiš nám v\u00A0zákone nariadil takéto ženy ukameňovať. Čo povieš ty?\" Ale to hovorili, aby ho pokúšali a mohli ho obžalovať.<br>" +
                            "Ježiš sa zohol a prstom písal po\u00A0zemi. Ale keď sa ho neprestávali vypytovať, vzpriamil sa a povedal im: \"Kto z\u00A0vás je bez\u00A0hriechu, nech prvý hodí do\u00A0nej kameň.\" A znovu sa zohol a písal po\u00A0zemi. Ako to počuli, jeden po\u00A0druhom počnúc staršími sa vytrácali, až zostal sám so\u00A0ženou, čo stála v\u00A0prostriedku.<br>" +
                            "Ježiš sa vzpriamil a opýtal sa jej: \"Žena, kde sú? Nik ťa neodsúdil?\"<br>" +
                            "Ona odpovedala: \"Nik, Pane.\"<br>" +
                            "A Ježiš jej povedal: \"Ani ja ťa neodsudzujem. Choď a už nehreš!\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"51", "1", "", " Jn 8, 1-11",
                    "Kto z\u00A0vás je bez\u00A0hriechu, nech prvý hodí do\u00A0nej kameň",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš odišiel na\u00A0Olivovú horu. Ale zavčas ráno sa vrátil do\u00A0chrámu a všetok ľud sa hrnul k\u00A0nemu. Sadol si a učil ich.<br>" +
                            "Tu zákonníci a farizeji priviedli ženu pristihnutú pri\u00A0cudzoložstve, postavili ju do\u00A0prostriedku a povedali mu: \"Učiteľ, túto ženu pristihli priamo pri\u00A0cudzoložstve. Mojžiš nám v\u00A0zákone nariadil takéto ženy ukameňovať. Čo povieš ty?\" Ale to hovorili, aby ho pokúšali a mohli ho obžalovať.<br>" +
                            "Ježiš sa zohol a prstom písal po\u00A0zemi. Ale keď sa ho neprestávali vypytovať, vzpriamil sa a povedal im: \"Kto z\u00A0vás je bez\u00A0hriechu, nech prvý hodí do\u00A0nej kameň.\" A znovu sa zohol a písal po\u00A0zemi. Ako to počuli, jeden po\u00A0druhom počnúc staršími sa vytrácali, až zostal sám so\u00A0ženou, čo stála v\u00A0prostriedku.<br>" +
                            "Ježiš sa vzpriamil a opýtal sa jej: \"Žena, kde sú? Nik ťa neodsúdil?\"<br>" +
                            "Ona odpovedala: \"Nik, Pane.\"<br>" +
                            "A Ježiš jej povedal: \"Ani ja ťa neodsudzujem. Choď a už nehreš!\"<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo v\u00A0roku C, keď sa toto čítanie čítalo na\u00A0Piatu pôstnu nedeľu:",
                    "Jn 8, 12-20",
                    "Kto z\u00A0vás je bez\u00A0hriechu, nech prvý hodí do\u00A0nej kameň",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ja som svetlo sveta<br>" +
                            "Ježiš povedal farizejom: \"Ja som svetlo sveta. Kto mňa nasleduje, nebude chodiť vo\u00A0tmách, ale bude mať svetlo života.\"<br>" +
                            "Farizeji mu povedali: \"Vydávaš svedectvo o\u00A0sebe len ty sám, tvoje svedectvo nie je pravdivé.\"<br>" +
                            "Ježiš im odpovedal: \"Hoci vydávam svedectvo o\u00A0sebe iba ja sám, moje svedectvo je pravdivé, lebo viem, odkiaľ som prišiel a kam idem. Vy však neviete, odkiaľ prichádzam, ani kam idem.<br>" +
                            "Vy súdite podľa tela, ja nesúdim nikoho. A ak aj súdim, môj súd je pravdivý, lebo nie som sám, ale ja a Otec, ktorý ma poslal. A vo\u00A0vašom zákone je napísané, že svedectvo dvoch ľudí je pravdivé.<br>" +
                            "Ja sám vydávam svedectvo o\u00A0sebe a vydáva o\u00A0mne svedectvo aj Otec, ktorý ma poslal.\"<br>" +
                            "Opýtali sa ho: \"Kdeže je tvoj Otec?!\"<br>" +
                            "Ježiš odpovedal: \"Nepoznáte ani mňa ani môjho Otca. Keby ste poznali mňa, poznali by ste aj môjho Otca.\"<br>" +
                            "Tieto slová povedal v\u00A0pokladničnej sieni, keď učil v\u00A0chráme. A nik ho nechytil, lebo ešte neprišla jeho hodina.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"52", "2", "", "Jn 8, 21-30",
                    "Keď vyzdvihnete Syna človeka, poznáte, že Ja Som",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal farizejom: \"Odchádzam a budete ma hľadať, ale zomriete vo\u00A0svojom hriechu. Kam ja idem, tam vy prísť nemôžete.\"<br>" +
                            "Židia si hovorili: \"Vari sám seba zabije, že vraví: ‚Kam ja idem, tam vy prísť nemôžete?'\"<br>" +
                            "On im povedal: \"Vy ste zdola, ja som zhora. Vy ste z\u00A0tohto sveta, ja nie som z\u00A0tohto sveta. Preto som vám povedal, že zomriete vo\u00A0svojich hriechoch. Lebo ak neuveríte, že Ja Som, zomriete vo\u00A0svojich hriechoch.\"<br>" +
                            "Pýtali sa ho teda: \"Kto si ty?\"<br>" +
                            "Ježiš im teda povedal: \"Keď vyzdvihnete Syna človeka, poznáte, že Ja Som a že nič nerobím sám od\u00A0seba, ale hovorím tak, ako ma naučil Otec. A ten ktorý ma poslal, je so\u00A0mnou. Nenechal ma samého, lebo ja vždy robím, čo sa páči jemu.\"<br>" +
                            "Keď to hovoril, mnohí uverili v\u00A0neho.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"53", "3", "", "Jn 8, 31-42",
                    "Až keď vás Syn vyslobodí, budete naozaj slobodní",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal Židom, ktorí mu uverili: \"Ak ostanete v\u00A0mojom slove, budete naozaj mojimi učeníkmi, poznáte pravdu a pravda vás vyslobodí.\"<br>" +
                            "Odpovedali mu: \"Sme Abrahámovo potomstvo a nikdy sme nikomu neotročili. Akože hovoríš: ‚Budete slobodní?!'\"<br>" +
                            "Ježiš im povedal: \"Veru, veru, hovorím vám: Každý, kto pácha hriech, je otrok. A otrok neostáva v\u00A0dome navždy; navždy ostáva syn. Až keď vás Syn vyslobodí, budete naozaj slobodní.<br>" +
                            "Viem, že ste Abrahámovo potomstvo; a chcete ma zabiť, lebo sa moje slovo vo\u00A0vás neujíma.<br>" +
                            "Ja hovorím o\u00A0tom, čo som videl u\u00A0Otca. Aj vy robíte to, čo ste počuli od\u00A0otca.\"<br>" +
                            "Odpovedali mu: \"Naším otcom je Abrahám.\"<br>" +
                            "Ježiš im povedal: \"Keby ste boli Abrahámovými deťmi, robili by ste skutky Abrahámove. No vy ma chcete zabiť – človeka, ktorý vám povedal pravdu, čo som počul od\u00A0Boha. To Abrahám nerobil. Vy robíte skutky svojho otca.\"<br>" +
                            "Povedali mu: \"My sme sa nenarodili zo\u00A0smilstva; máme len jedného otca, Boha.\"<br>" +
                            "Ježiš im odvetil: \"Keby bol vaším otcom Boh, milovali by ste ma, lebo ja som z\u00A0Boha vyšiel a od\u00A0neho prichádzam. Neprišiel som sám od\u00A0seba, ale on ma poslal.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"54", "4", "", "Jn 8, 51-59",
                    "Váš otec Abrahám zaplesal, že uvidí môj deň",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal Židom: \"Veru, veru, hovorím vám: Kto zachová moje slovo, neuvidí smrť naveky.\"<br>" +
                            "Židia mu povedali: \"Teraz už vieme, že si posadnutý zlým duchom. Abrahám zomrel aj proroci, a ty hovoríš: ‚Kto zachová moje slovo, neokúsi smrť naveky.' Si azda väčší ako náš otec Abrahám, ktorý zomrel? Aj proroci pomreli. Kýmže sa robíš?\"<br>" +
                            "Ježiš odpovedal: \"Ak sa oslavujem ja sám, moja sláva nestojí za\u00A0nič. Ale oslavuje ma môj Otec, o\u00A0ktorom vy hovoríte: ‚On je náš Boh,' a nepoznáte ho. Ale ja ho poznám. A keby som povedal: Nepoznám ho, bol by som luhár ako vy. Ale ja ho poznám a jeho slovo zachovávam. Váš otec Abrahám zaplesal, že uvidí môj deň; i videl a zaradoval sa.\"<br>" +
                            "Židia mu vraveli: \"Ešte nemáš ani päťdesiat rokov a videl si Abraháma?\"<br>" +
                            "Ježiš im povedal: \"Veru, veru, hovorím vám: Prv ako bol Abrahám, Ja Som.\"<br>" +
                            "Na to zdvihli kamene a chceli ich hádzať do\u00A0neho, ale Ježiš sa skryl a vyšiel z\u00A0chrámu.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"55", "5", "", "Jn 10, 31-42",
                    "Chceli ho chytiť, ale on sa im vymkol z\u00A0rúk",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Židia zdvihli kamene a chceli Ježiša kameňovať. Ježiš im povedal: \"Ukázal som vám veľa dobrých skutkov od\u00A0Otca. Pre\u00A0ktorý z\u00A0nich ma kameňujete?!\"<br>" +
                            "Židia mu odpovedali: \"Nekameňujeme ťa za\u00A0dobrý skutok, ale za\u00A0rúhanie, preto, že hoci si človek, robíš sa Bohom.\"<br>" +
                            "Ježiš im vravel: \"A nie je napísané vo\u00A0vašom zákone: ‚Ja som povedal: Ste bohmi?' Nuž ak nazval bohmi tých, ktorým bolo dané Božie slovo – a Písmo nemožno zrušiť! –, prečo vy hovoríte tomu, ktorého Otec posvätil a poslal na\u00A0svet: ‚Rúhaš sa' za\u00A0to že som povedal: Som Boží Syn?!<br>" +
                            "Ak nekonám skutky môjho Otca, neverte mi. Ale ak ich konám, keď už nechcete veriť mne, verte tým skutkom, aby ste poznali a vedeli, že vo\u00A0mne je Otec a ja v\u00A0Otcovi!\" Preto ho zasa chceli chytiť, ale on sa im vymkol z\u00A0rúk.<br>" +
                            "Znova odišiel za\u00A0Jordán, na\u00A0miesto, kde Ján predtým krstil, a tam zostal.<br>" +
                            "Mnohí prichádzali za\u00A0ním a hovorili si: \"Ján síce neurobil nijaké znamenie, ale všetko, čo Ján povedal o\u00A0tomto, je pravda.\" A mnohí tam uverili v\u00A0neho.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"56", "6", "", "Jn 11, 45-56",
                    "Aby zhromaždil vedno rozptýlené Božie deti",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Mnohí z\u00A0tých Židov, čo prišli k\u00A0Márii a videli, čo urobil Ježiš, uverili v\u00A0neho. No niektorí z\u00A0nich odišli k\u00A0farizejom a rozpovedali im, čo Ježiš urobil.<br>" +
                            "Veľkňazi a farizeji zvolali veľradu a hovorili: \"Čo robiť? Tento človek robí mnohé znamenia. Ak ho necháme tak, uveria v\u00A0neho všetci, prídu Rimania a zničia nám i toto miesto i národ.\"<br>" +
                            "Ale jeden z\u00A0nich, Kajfáš, ktorý bol veľkňazom toho roka, im povedal: \"Vy neviete nič. Neuvedomujete si, že je pre\u00A0vás lepšie, ak zomrie jeden človek za\u00A0ľud, a nezahynie celý národ.\"<br>" +
                            "Toto však nepovedal sám od\u00A0seba, ale ako veľkňaz toho roka prorokoval, že Ježiš má zomrieť za\u00A0národ, a nielen za\u00A0národ, ale aj preto, aby zhromaždil vedno rozptýlené Božie deti. A od\u00A0toho dňa boli rozhodnutí, že ho zabijú.<br>" +
                            "Preto už Ježiš nechodil verejne medzi Židmi, ale odišiel odtiaľ do\u00A0kraja blízko púšte, do\u00A0mesta zvaného Efraim, a tam sa zdržiaval s\u00A0učeníkmi.<br>" +
                            "Blízko bola židovská Veľká noc a mnohí z\u00A0toho kraja vystupovali pred\u00A0Veľkou nocou do\u00A0Jeruzalema, aby sa očistili. Hľadali aj Ježiša. A ako stáli v\u00A0chráme, navzájom si vraveli: \"Čo myslíte? Príde na\u00A0sviatky?\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"60", "A", "Mt 26, 14 – 27, 66", "Umučenie nášho Pána Ježiša Krista podľa Matúša<br>"+
                    "<font color='#B71C1C'>Pašie sa čítajú bez\u00A0sviečok a bez\u00A0incenzácie, bez\u00A0pozdravu a bez\u00A0poznačenia knihy znakom kríža. Číta ich diakon; ak ho niet, kňaz. Čítať ich môžu aj lektori laici; v\u00A0tomto prípade, ak je možné, treba vyhradiť kňazovi časti, v\u00A0ktorých hovorí Kristus.<br>"+
                    "Diakoni (nie však iní) pred\u00A0spievaním pašií prosia od\u00A0kňaza požehnanie, ako sa to robí vo\u00A0svätej omši pred\u00A0evanjeliom.<br>" +
                    "Po pašiách, ak je to vhodné, nech je krátka homília.<br>" +
                    "Značky pri\u00A0dialogickom čítaní: E - evanjelista, + - Kristove slová, S - slová ostatných osôb.</font>",
                    "",
                    "<font color='#B71C1C'>E</font> Jeden z\u00A0Dvanástich volal sa Judáš Iškariotský odišiel k\u00A0veľkňazom a vyzvedal sa: <font color='#B71C1C'>S</font> \"Čo mi dáte a ja vám ho vydám?\" <br>" +
                    "<font color='#B71C1C'>E</font> Oni mu určili tridsať strieborných. A od\u00A0tej chvíle hľadal príležitosť vydať ho.",
                    "Kde ti máme pripraviť veľkonočnú večeru?",
                    "<font color='#B71C1C'>E</font> V\u00A0prvý deň sviatkov Nekvasených chlebov prišli k\u00A0Ježišovi učeníci a pýtali sa ho: <font color='#B71C1C'>S</font> \"Kde ti máme pripraviť veľkonočnú večeru?\"<br>" +
                            "<font color='#B71C1C'>E</font> On povedal: <font color='#B71C1C'>+</font> \"Choďte do\u00A0mesta k\u00A0istému človekovi a povedzte mu: Učiteľ odkazuje: Môj čas je blízko, u\u00A0teba budem jesť so\u00A0svojimi učeníkmi veľkonočného baránka.\"<br>" +
                            "<font color='#B71C1C'>E</font> Učeníci urobili, ako im Ježiš rozkázal, a pripravili veľkonočného baránka.",
                    "Jeden z\u00A0vás ma zradí",
                    "<font color='#B71C1C'>E</font> Keď sa zvečerilo, zasadol s\u00A0Dvanástimi za\u00A0stôl. A keď jedli, povedal: <font color='#B71C1C'>+</font> \"Veru, hovorím vám: Jeden z\u00A0vás ma zradí.\"<br>" +
                            "<font color='#B71C1C'>E</font> Veľmi osmutneli a začali sa ho jeden po\u00A0druhom vypytovať: <font color='#B71C1C'>S</font> \"Som to ja, Pane?\"<br>" +
                            "<font color='#B71C1C'>E</font> On odpovedal: <font color='#B71C1C'>+</font> \"Kto so\u00A0mnou namáča ruku v\u00A0mise, ten ma zradí. Syn človeka síce ide, ako je o\u00A0ňom napísané, ale beda človekovi, ktorý zrádza Syna človeka! Pre\u00A0toho človeka by bolo lepšie, keby sa nebol narodil.\"<br>" +
                            "<font color='#B71C1C'>E</font> On odpovedal: <font color='#B71C1C'>+</font> \"Kto so\u00A0mnou namáča ruku v\u00A0mise, ten ma zradí. Syn človeka síce ide, ako je o\u00A0ňom napísané, ale beda človekovi, ktorý zrádza Syna človeka! Pre\u00A0toho človeka by bolo lepšie, keby sa nebol narodil.\"<br>" +
                            "<font color='#B71C1C'>E</font> Aj jeho zradca Judáš sa opýtal: <font color='#B71C1C'>S</font> \"Som to azda ja, Rabbi?\"<br>" +
                            "<font color='#B71C1C'>E</font> Odpovedal mu: <font color='#B71C1C'>+</font> \"Sám si to povedal.\"",
                    "Toto je moje telo. Toto je moja krv",
                    "<font color='#B71C1C'>E</font> Pri\u00A0večeri vzal Ježiš chlieb a dobrorečil, lámal ho a dával učeníkom, hovoriac: <font color='#B71C1C'>+</font> \"Vezmite a jedzte: toto je moje telo.\" <br>" +
                            "<font color='#B71C1C'>E</font> Potom vzal kalich, vzdával vďaky a dal im ho, hovoriac: <font color='#B71C1C'>+</font> \"Pite z\u00A0neho všetci: toto je moja krv novej zmluvy, ktorá sa vylieva za\u00A0všetkých na\u00A0odpustenie hriechov. Hovorím vám: Odteraz už nebudem piť z\u00A0tohoto plodu viniča až do\u00A0dňa, keď ho budem piť s\u00A0vami nový v\u00A0kráľovstve svojho Otca.\"<br>" +
                            "<font color='#B71C1C'>E</font> Potom zaspievali chválospev a vyšli na\u00A0Olivovú horu.",
                    "Udriem pastiera a stádo oviec sa rozpŕchne",
                    "<font color='#B71C1C'>E</font> Vtedy im Ježiš povedal: <font color='#B71C1C'>+</font> \"Vy všetci tejto noci odpadnete odo\u00A0mňa, lebo je napísané: ‚Udriem pastiera a stádo oviec sa rozpŕchne.' Ale keď vstanem z\u00A0mŕtvych, predídem vás do\u00A0Galiley.\"<br>" +
                            "<font color='#B71C1C'>E</font> Peter mu povedal: <font color='#B71C1C'>S</font> \"Aj keby všetci odpadli od\u00A0teba, ja nikdy neodpadnem.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš mu odvetil: <font color='#B71C1C'>+</font> \"Veru, hovorím ti: Tejto noci skôr, ako kohút zaspieva, tri razy ma zaprieš.\"<br>" +
                            "<font color='#B71C1C'>E</font> Peter mu povedal: <font color='#B71C1C'>S</font> \"Aj keby som mal umrieť s\u00A0tebou, nezapriem ťa.\"<br>" +
                            "<font color='#B71C1C'>E</font> Podobne hovorili aj ostatní učeníci.",
                    "Doľahli naňho smútok a úzkosť",
                    "<font color='#B71C1C'>E</font> Tu Ježiš prišiel s\u00A0nimi na\u00A0pozemok, ktorý sa volá Getsemani, a povedal učeníkom: <font color='#B71C1C'>+</font> \"Sadnite si tu, kým odídem tamto a pomodlím sa.\"<br>" +
                            "<font color='#B71C1C'>E</font> Vzal so\u00A0sebou Petra a oboch Zebedejových synov. I doľahli naňho smútok a úzkosť. Vtedy im povedal: <font color='#B71C1C'>+</font> \"Moja duša je smutná až na\u00A0smrť. Ostaňte tu a bdejte so\u00A0mnou!\" <br>" +
                            "<font color='#B71C1C'>E</font> Trochu poodišiel, padol na\u00A0tvár a modlil sa: <font color='#B71C1C'>+</font> \"Otče môj, ak je možné, nech ma minie tento kalich. No nie ako ja chcem, ale ako ty.\"<br>" +
                            "<font color='#B71C1C'>E</font> Keď sa vrátil k\u00A0učeníkom, našiel ich spať. I povedal Petrovi: <font color='#B71C1C'>+</font> \"To ste nemohli ani hodinu bdieť so\u00A0mnou? Bdejte a modlite sa, aby ste neprišli do\u00A0pokušenia! Duch je síce ochotný, ale telo slabé.\"<br>" +
                            "<font color='#B71C1C'>E</font> Znova odišiel a modlil sa: <font color='#B71C1C'>+</font> \"Otče môj, ak ma tento kalich nemôže minúť a musím ho piť, nech sa stane tvoja vôľa.\" <br>" +
                            "<font color='#B71C1C'>E</font> A keď sa vrátil, zasa ich našiel spať: oči sa im zatvárali od\u00A0únavy. Nechal ich, znova sa vzdialil a tretí raz sa modlil tými istými slovami. Potom prišiel k\u00A0učeníkom a povedal im: <font color='#B71C1C'>+</font> \"Teraz už spite a odpočívajte! Hľa, prišla hodina; Syna človeka už vydávajú do\u00A0rúk hriešnikov. Vstaňte, poďme! Pozrite, môj zradca sa priblížil.\"",
                    "Položili na\u00A0Ježiša ruky a zajali ho",
                    "<font color='#B71C1C'>E</font> A kým ešte hovoril, prišiel Judáš, jeden z\u00A0Dvanástich, a s\u00A0ním veľký zástup s\u00A0mečmi a kyjmi, ktorý poslali veľkňazi a starší ľudu. Jeho zradca im dal znamenie: <font color='#B71C1C'>S</font> \"Koho pobozkám, to je on; toho chyťte!\"<br>" +
                            "<font color='#B71C1C'>E</font> A hneď pristúpil k\u00A0Ježišovi a povedal: <font color='#B71C1C'>S</font> \"Buď pozdravený, Rabbi!\" <font color='#B71C1C'>E</font> A pobozkal ho.<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš mu povedal: <font color='#B71C1C'>+</font> \"Priateľu, načo si prišiel!?\"<br>" +
                            "<font color='#B71C1C'>E</font> Vtedy pristúpili, položili na\u00A0Ježiša ruky a zajali ho.<br>" +
                            "<font color='#B71C1C'>E</font> Tu jeden z\u00A0tých, čo boli s\u00A0Ježišom, vystrel ruku, vytasil meč, zasiahol ním veľkňazovho sluhu a odťal mu ucho. Ježiš mu povedal: <font color='#B71C1C'>+</font> \"Daj svoj meč na\u00A0jeho miesto! Lebo všetci, čo sa chytajú meča, mečom zahynú. Alebo si myslíš, že by som nemohol poprosiť svojho Otca a on by mi hneď poslal viac ako dvanásť plukov anjelov? Ale ako by sa potom splnilo Písmo, že to má byť takto?\"<br>" +
                            "<font color='#B71C1C'>E</font> V\u00A0tú hodinu povedal Ježiš zástupom: <font color='#B71C1C'>+</font> \"Vyšli ste s\u00A0mečmi a kyjmi ako na\u00A0zločinca, aby ste ma zajali. Deň čo deň som sedával a učil v\u00A0chráme, a nezajali ste ma.\"<br>" +
                            "<font color='#B71C1C'>E</font> Toto všetko sa stalo, aby sa splnili písma Prorokov. Vtedy ho všetci učeníci opustili a rozutekali sa.",
                    "Uvidíte Syna človeka sedieť po\u00A0pravici Moci",
                    "<font color='#B71C1C'>E</font> Tí, čo Ježiša zajali, odviedli ho k\u00A0veľkňazovi Kajfášovi, kde sa zhromaždili zákonníci a starší. Peter šiel zďaleka za\u00A0ním až do\u00A0veľkňazovho dvora. Vošiel dnu a sadol si k\u00A0sluhom: chcel vidieť, ako sa to skončí. Veľkňazi a celá veľrada zháňali krivé svedectvo proti Ježišovi, aby ho mohli odsúdiť na\u00A0smrť. Ale nenašli, hoci vystúpilo mnoho falošných svedkov. Napokon prišli dvaja a hovorili: <font color='#B71C1C'>S</font> \"Tento povedal: ‚Môžem zboriť Boží chrám a o\u00A0tri dni ho postaviť.'\"<br>" +
                            "Tu vstal veľkňaz a spýtal sa ho: <font color='#B71C1C'>S</font> \"Nič neodpovieš? Čo to títo svedčia proti tebe?!\" <font color='#B71C1C'>E</font> Ale Ježiš mlčal.<br>" +
                            "<font color='#B71C1C'>E</font> Veľkňaz mu povedal: <font color='#B71C1C'>S</font> \"Zaprisahám ťa na\u00A0živého Boha, aby si nám povedal, či si Mesiáš, Boží Syn.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš mu odvetil: <font color='#B71C1C'>+</font> \"Sám si to povedal. Ale hovorím vám: Odteraz uvidíte Syna človeka sedieť po\u00A0pravici Moci a prichádzať na\u00A0nebeských oblakoch.\"<br>" +
                            "<font color='#B71C1C'>E</font> Vtedy si veľkňaz roztrhol rúcho a povedal: <font color='#B71C1C'>S</font> \"Rúhal sa! Načo ešte potrebujeme svedkov? Sami ste teraz počuli rúhanie. Čo na\u00A0to poviete?\"<br>" +
                            "<font color='#B71C1C'>E</font> Oni odpovedali: <font color='#B71C1C'>S</font> \"Hoden je smrti!\"<br>" +
                            "<font color='#B71C1C'>E</font> Potom mu pľuli do\u00A0tváre a bili ho päsťami, iní ho zauškovali a hovorili: <font color='#B71C1C'>S</font> \"Prorokuj nám, Mesiáš, hádaj, kto ťa udrel!\"",
                    "Skôr ako kohút zaspieva, tri razy ma zaprieš",
                    "<font color='#B71C1C'>E</font> Peter sedel vonku na\u00A0nádvorí. Prišla k\u00A0nemu ktorási slúžka a povedala: <font color='#B71C1C'>S</font> \"Aj ty si bol s\u00A0Ježišom Galilejským!\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale on pred\u00A0všetkými zaprel: <font color='#B71C1C'>S</font> \"Neviem, čo hovoríš.\"<br>" +
                            "<font color='#B71C1C'>E</font> Keď vyšiel k\u00A0bráne, videla ho iná a povedala tým, čo tam boli: <font color='#B71C1C'>S</font> \"Tento bol s\u00A0Ježišom Nazaretským!\"<br>" +
                            "<font color='#B71C1C'>E</font> On znova zaprel s\u00A0prísahou: <font color='#B71C1C'>S</font> \"Nepoznám toho človeka.\"<br>" +
                            "<font color='#B71C1C'>E</font> O\u00A0chvíľku pristúpili tí, čo tam stáli, a povedali Petrovi: <font color='#B71C1C'>S</font> \"Veru, aj ty si z\u00A0nich, veď aj tvoja reč ťa prezrádza!\"<br>" +
                            "<font color='#B71C1C'>E</font> Vtedy sa začal zaklínať a prisahať: <font color='#B71C1C'>S</font> \"Nepoznám toho človeka.\"<font color='#B71C1C'>E</font> A vtom zaspieval kohút. Tu sa Peter rozpamätal na\u00A0slovo, ktoré mu bol povedal Ježiš: \"Skôr ako kohút zaspieva, tri razy ma zaprieš.\" Vyšiel von a horko sa rozplakal.",
                    "Ježiša odovzdali vladárovi Pilátovi",
                    "<font color='#B71C1C'>E</font> Keď sa rozodnilo, veľkňazi a starší ľudu sa uzniesli, že Ježiša vydajú na\u00A0smrť. Preto ho spútaného odviedli a odovzdali vladárovi Pilátovi.",
                    "Neslobodno ich dať do\u00A0chrámovej pokladnice, lebo je to cena krvi",
                    "<font color='#B71C1C'>E</font> Keď zradca Judáš videl, že Ježiša odsúdili, ľútosťou pohnutý vrátil tridsať strieborných veľkňazom a starším so\u00A0slovami: <font color='#B71C1C'>S</font> \"Zhrešil som, lebo som zradil nevinnú krv.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale oni odvetili: <font color='#B71C1C'>S</font> \"Čo nás do\u00A0toho? To je tvoja vec!\"<br>" +
                            "<font color='#B71C1C'>E</font> On odhodil strieborné peniaze v\u00A0chráme a odišiel; a potom sa šiel obesiť.<br>" +
                            "<font color='#B71C1C'>E</font> Veľkňazi vzali peniaze a povedali: <font color='#B71C1C'>S</font> \"Neslobodno ich dať do\u00A0chrámovej pokladnice, lebo je to cena krvi!\"<br>" +
                            "<font color='#B71C1C'>E</font> Dohodli sa teda a kúpili za\u00A0ne Hrnčiarovo pole na\u00A0pochovávanie cudzincov. Preto sa to pole až do\u00A0dnešného dňa volá Pole krvi.<br>" +
                            "<font color='#B71C1C'>E</font> Vtedy sa splnilo, čo povedal prorok Jeremiáš: <br>" +
                            "\"Vzali tridsať strieborných, <br>" +
                            "cenu toho, ktorého takto ocenili synovia Izraela, <br>" +
                            "a dali ich za\u00A0Hrnčiarovo pole; <br>" +
                            "ako mi prikázal Pán.\"",
                    "Si židovský kráľ",
                    "<font color='#B71C1C'>E</font> Keď Ježiš stál pred\u00A0vladárom, vladár sa ho spýtal: <font color='#B71C1C'>S</font> \"Si židovský kráľ?\"<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš odpovedal: <font color='#B71C1C'>+</font> \"Sám to hovoríš.\"<br>" +
                            "<font color='#B71C1C'>E</font> A keď naňho veľkňazi a starší žalovali, nič neodpovedal. Vtedy sa ho Pilát opýtal: <font color='#B71C1C'>S</font> \"Nepočuješ, čo všetko proti tebe svedčia?\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale on mu neodpovedal ani na\u00A0jediné slovo, takže sa vladár veľmi čudoval.<br>" +
                            "<font color='#B71C1C'>E</font> Na\u00A0sviatky vladár prepúšťal zástupu jedného väzňa, ktorého si žiadali. Mali vtedy povestného väzňa, ktorý sa volal Barabáš. Keď sa zhromaždili, Pilát im povedal: <font color='#B71C1C'>S</font> \"Koho vám mám prepustiť: Barabáša, alebo Ježiša, ktorý sa volá Mesiáš?\" <font color='#B71C1C'>E</font> Lebo vedel, že ho vydali zo\u00A0závisti.<br>" +
                            "<font color='#B71C1C'>E</font> Keď sedel na\u00A0súdnej stolici, odkázala mu jeho manželka: <font color='#B71C1C'>S</font> \"Nemaj nič s\u00A0tým spravodlivým, lebo som dnes vo\u00A0sne veľa vytrpela pre\u00A0neho.\"<br>" +
                            "<font color='#B71C1C'>E</font> Veľkňazi a starší nahovorili zástupy, aby si žiadali Barabáša a Ježiša zahubili. Vladár sa ich opýtal: <font color='#B71C1C'>S</font> \"Ktorého z\u00A0týchto dvoch si žiadate prepustiť?\"<br>" +
                            "<font color='#B71C1C'>E</font> Oni zvolali: <font color='#B71C1C'>S</font> \"Barabáša!\"<br>" +
                            "<font color='#B71C1C'>E</font> Pilát im povedal: <font color='#B71C1C'>S</font> \"Čo mám teda urobiť s\u00A0Ježišom, ktorý sa volá Mesiáš?\"<br>" +
                            "<font color='#B71C1C'>E</font> Všetci volali: <font color='#B71C1C'>S</font> \"Ukrižovať ho!\"<br>" +
                            "<font color='#B71C1C'>E</font> On vravel: <font color='#B71C1C'>S</font> \"A čo zlé urobil?\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale oni tým väčšmi kričali: <font color='#B71C1C'>S</font> \"Ukrižovať ho!\"<br>" +
                            "<font color='#B71C1C'>E</font> Keď Pilát videl, že nič nedosiahne, ba že pobúrenie ešte vzrastá, vzal vodu, umyl si pred\u00A0zástupom ruky a vyhlásil: <font color='#B71C1C'>S</font> \"Ja nemám vinu na\u00A0krvi tohoto človeka. To je vaša vec!\"<br>" +
                            "<font color='#B71C1C'>E</font> A všetok ľud odpovedal: <font color='#B71C1C'>S</font> \"Jeho krv na\u00A0nás a na\u00A0naše deti!\"<br>" +
                            "<font color='#B71C1C'>E</font> Vtedy im prepustil Barabáša; Ježiša však dal zbičovať a vydal ho, aby ho ukrižovali.",
                    "Buď pozdravený, židovský kráľ!",
                    "<font color='#B71C1C'>E</font> Vladárovi vojaci vzali Ježiša do\u00A0vládnej budovy a zhromaždili k\u00A0nemu celú kohortu. Vyzliekli ho a odeli do\u00A0šarlátového plášťa, z\u00A0tŕnia uplietli korunu a položili mu ju na\u00A0hlavu, do\u00A0pravej ruky mu dali trstinu, padali pred\u00A0ním na\u00A0kolená a posmievali sa mu: <font color='#B71C1C'>S</font> \"Buď pozdravený, židovský kráľ!\"<br>" +
                            "<font color='#B71C1C'>E</font> Pľuli naňho, brali mu trstinu a bili ho po\u00A0hlave. Keď sa mu naposmievali, vyzliekli ho z\u00A0plášťa a obliekli mu jeho šaty. Potom ho vyviedli, aby ho ukrižovali.",
                    "Vedno s\u00A0ním ukrižovali aj dvoch zločincov",
                    "<font color='#B71C1C'>E</font> Ako vychádzali, stretli človeka z\u00A0Cyrény, menom Šimona. Toho prinútili, aby mu niesol kríž. Tak prišli na\u00A0miesto, ktoré sa volá Golgota, čo znamená Lebka. Dali mu piť víno zmiešané so\u00A0žlčou. Ale keď ho ochutnal, nechcel piť. Keď ho ukrižovali, hodili lós a rozdelili si jeho šaty. Potom si posadali a strážili ho.<br>" +
                            "<font color='#B71C1C'>E</font> Nad\u00A0hlavu mu dali nápis s\u00A0označením jeho viny: \"Toto je Ježiš, židovský kráľ!\"<br>" +
                            "<font color='#B71C1C'>E</font> Vedno s\u00A0ním ukrižovali aj dvoch zločincov: jedného sprava, druhého zľava.",
                    "Ak si Boží Syn, zostúp z\u00A0kríža!",
                    "<font color='#B71C1C'>E</font> A tí, čo šli okolo, rúhali sa mu: potriasali hlavami a vraveli: <font color='#B71C1C'>S</font> \"Ty, čo zboríš chrám a za\u00A0tri dni ho znova postavíš, zachráň sám seba! Ak si Boží Syn, zostúp z\u00A0kríža!\"<br>" +
                            "<font color='#B71C1C'>E</font> Podobne sa mu posmievali aj veľkňazi so\u00A0zákonníkmi a staršími: <font color='#B71C1C'>S</font> \"Iných zachraňoval, sám seba nemôže zachrániť. Je kráľom Izraela; nech teraz zostúpi z\u00A0kríža a uveríme v\u00A0neho. Spoliehal sa na\u00A0Boha; nech ho teraz vyslobodí, ak ho má rád. Veď povedal: ‚Som Boží Syn.'\"<br>" +
                            "<font color='#B71C1C'>E</font> Takisto ho tupili aj zločinci, čo boli s\u00A0ním ukrižovaní.",
                    "Eli, Eli, lema sabakthani?",
                    "<font color='#B71C1C'>E</font> Od\u00A0dvanástej hodiny nastala tma po\u00A0celej zemi až do\u00A0tretej hodiny popoludní. Okolo tretej hodiny zvolal Ježiš mocným hlasom: <font color='#B71C1C'>+</font> \"Eli, Eli, lema sabakthani?\", <font color='#B71C1C'>E</font> čo znamená: <font color='#B71C1C'>+</font> \"Bože môj, Bože môj, prečo si ma opustil?\"<br>" +
                            "<font color='#B71C1C'>E</font> Keď to počuli niektorí z\u00A0tých, čo tam stáli, vraveli: <font color='#B71C1C'>S</font> \"Volá Eliáša.\"<br>" +
                            "<font color='#B71C1C'>E</font> Jeden z\u00A0nich hneď odbehol, vzal špongiu, naplnil ju octom, nastokol na\u00A0trstinu a dával mu piť. Ale ostatní hovorili: <font color='#B71C1C'>S</font> \"Počkaj, nech uvidíme, či ho Eliáš príde vyslobodiť.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš však znova zvolal mocným hlasom a vydýchol dušu.<br>" +
                            "<font color='#B71C1C'>Pokľakne sa a chvíľku je ticho.</font><br>" +
                            "<font color='#B71C1C'>E</font> A hľa, chrámová opona sa roztrhla vo\u00A0dvoje odvrchu až dospodku. Zem sa triasla a skaly sa pukali. Otvorili sa hroby a mnohé telá zosnulých svätých vstali z\u00A0mŕtvych. Vyšli z\u00A0hrobov a po\u00A0jeho vzkriesení prišli do\u00A0svätého mesta a ukázali sa mnohým.<br>" +
                            "<font color='#B71C1C'>E</font> Keď stotník a tí, čo s\u00A0ním strážili Ježiša, videli zemetrasenie a všetko, čo sa deje, veľmi sa naľakali a hovorili: \"On bol naozaj Boží Syn.\"<br>" +
                            "<font color='#B71C1C'>E</font> Boli tam a zobďaleč sa pozerali mnohé ženy, ktoré sprevádzali Ježiša z\u00A0Galiley a posluhovali mu. Medzi nimi bola Mária Magdaléna, Mária, Jakubova a Jozefova matka, a matka Zebedejových synov.",
                    "Jozef uložil Ježišovo telo do\u00A0svojho nového hrobu",
                    "<font color='#B71C1C'>E</font> Keď sa zvečerilo, prišiel zámožný človek z\u00A0Arimatey, menom Jozef, ktorý bol tiež Ježišovým učeníkom. Zašiel k\u00A0Pilátovi a poprosil o\u00A0Ježišovo telo. Pilát rozkázal, aby mu ho dali. Jozef vzal telo, zavinul ho do\u00A0čistého plátna a uložil do\u00A0svojho nového hrobu, ktorý si vytesal do\u00A0skaly. Ku\u00A0vchodu do\u00A0hrobu privalil veľký kameň a odišiel. Bola tam Mária Magdaléna a iná Mária a sedeli oproti hrobu.",
                    "Máte stráž; choďte a strážte, ako viete!",
                    "<font color='#B71C1C'>E</font> Na\u00A0druhý deň, ktorý bol po\u00A0Prípravnom dni, zhromaždili sa veľkňazi a farizeji k\u00A0Pilátovi a hovorili: \"Pane, spomenuli sme si, že ten zvodca, ešte kým žil, povedal: ‚Po troch dňoch vstanem z\u00A0mŕtvych.' Rozkáž teda strážiť hrob až do\u00A0tretieho dňa, aby azda neprišli jeho učeníci a neukradli ho a nepovedali ľudu: ‚Vstal z\u00A0mŕtvych,' a ostatné klamstvo by bolo horšie ako prvé.\"<br>" +
                            "<font color='#B71C1C'>E</font> Pilát im povedal: <font color='#B71C1C'>S</font> \"Máte stráž; choďte a strážte, ako viete!\"<br>" +
                            "<font color='#B71C1C'>E</font> Oni šli a hrob zabezpečili: zapečatili kameň a postavili stráž.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo kratšie:",
                    "Mt 27, 11-54",
                            "Si židovský kráľ",
                    "<font color='#B71C1C'>E</font> Keď Ježiš stál pred\u00A0vladárom, vladár sa ho spýtal: <font color='#B71C1C'>S</font> \"Si židovský kráľ?\"<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš odpovedal: <font color='#B71C1C'>+</font> \"Sám to hovoríš.\"<br>" +
                            "<font color='#B71C1C'>E</font> A keď naňho veľkňazi a starší žalovali, nič neodpovedal. Vtedy sa ho Pilát opýtal: <font color='#B71C1C'>S</font> \"Nepočuješ, čo všetko proti tebe svedčia?\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale on mu neodpovedal ani na\u00A0jediné slovo, takže sa vladár veľmi čudoval.<br>" +
                            "<font color='#B71C1C'>E</font> Na\u00A0sviatky vladár prepúšťal zástupu jedného väzňa, ktorého si žiadali. Mali vtedy povestného väzňa, ktorý sa volal Barabáš. Keď sa zhromaždili, Pilát im povedal: <font color='#B71C1C'>S</font> \"Koho vám mám prepustiť: Barabáša, alebo Ježiša, ktorý sa volá Mesiáš?\" <font color='#B71C1C'>E</font> Lebo vedel, že ho vydali zo\u00A0závisti.<br>" +
                            "<font color='#B71C1C'>E</font> Keď sedel na\u00A0súdnej stolici, odkázala mu jeho manželka: <font color='#B71C1C'>S</font> \"Nemaj nič s\u00A0tým spravodlivým, lebo som dnes vo\u00A0sne veľa vytrpela pre\u00A0neho.\"<br>" +
                            "<font color='#B71C1C'>E</font> Veľkňazi a starší nahovorili zástupy, aby si žiadali Barabáša a Ježiša zahubili. Vladár sa ich opýtal: <font color='#B71C1C'>S</font> \"Ktorého z\u00A0týchto dvoch si žiadate prepustiť?\"<br>" +
                            "<font color='#B71C1C'>E</font> Oni zvolali: <font color='#B71C1C'>S</font> \"Barabáša!\"<br>" +
                            "<font color='#B71C1C'>E</font> Pilát im povedal: <font color='#B71C1C'>S</font> \"Čo mám teda urobiť s\u00A0Ježišom, ktorý sa volá Mesiáš?\"<br>" +
                            "<font color='#B71C1C'>E</font> Všetci volali: <font color='#B71C1C'>S</font> \"Ukrižovať ho!\"<br>" +
                            "<font color='#B71C1C'>E</font> On vravel: <font color='#B71C1C'>S</font> \"A čo zlé urobil?\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale oni tým väčšmi kričali: <font color='#B71C1C'>S</font> \"Ukrižovať ho!\"<br>" +
                            "<font color='#B71C1C'>E</font> Keď Pilát videl, že nič nedosiahne, ba že pobúrenie ešte vzrastá, vzal vodu, umyl si pred\u00A0zástupom ruky a vyhlásil: <font color='#B71C1C'>S</font> \"Ja nemám vinu na\u00A0krvi tohoto človeka. To je vaša vec!\"<br>" +
                            "<font color='#B71C1C'>E</font> A všetok ľud odpovedal: <font color='#B71C1C'>S</font> \"Jeho krv na\u00A0nás a na\u00A0naše deti!\"<br>" +
                            "<font color='#B71C1C'>E</font> Vtedy im prepustil Barabáša; Ježiša však dal zbičovať a vydal ho, aby ho ukrižovali.",
                    "Buď pozdravený, židovský kráľ!",
                    "<font color='#B71C1C'>E</font> Vladárovi vojaci vzali Ježiša do\u00A0vládnej budovy a zhromaždili k\u00A0nemu celú kohortu. Vyzliekli ho a odeli do\u00A0šarlátového plášťa, z\u00A0tŕnia uplietli korunu a položili mu ju na\u00A0hlavu, do\u00A0pravej ruky mu dali trstinu, padali pred\u00A0ním na\u00A0kolená a posmievali sa mu: <font color='#B71C1C'>S</font> \"Buď pozdravený, židovský kráľ!\"<br>" +
                            "<font color='#B71C1C'>E</font> Pľuli naňho, brali mu trstinu a bili ho po\u00A0hlave. Keď sa mu naposmievali, vyzliekli ho z\u00A0plášťa a obliekli mu jeho šaty. Potom ho vyviedli, aby ho ukrižovali.",
                    "Vedno s\u00A0ním ukrižovali aj dvoch zločincov",
                    "<font color='#B71C1C'>E</font> Ako vychádzali, stretli človeka z\u00A0Cyrény, menom Šimona. Toho prinútili, aby mu niesol kríž. Tak prišli na\u00A0miesto, ktoré sa volá Golgota, čo znamená Lebka. Dali mu piť víno zmiešané so\u00A0žlčou. Ale keď ho ochutnal, nechcel piť. Keď ho ukrižovali, hodili lós a rozdelili si jeho šaty. Potom si posadali a strážili ho.<br>" +
                            "<font color='#B71C1C'>E</font> Nad\u00A0hlavu mu dali nápis s\u00A0označením jeho viny: \"Toto je Ježiš, židovský kráľ!\"<br>" +
                            "<font color='#B71C1C'>E</font> Vedno s\u00A0ním ukrižovali aj dvoch zločincov: jedného sprava, druhého zľava.",
                    "Ak si Boží Syn, zostúp z\u00A0kríža!",
                    "<font color='#B71C1C'>E</font> A tí, čo šli okolo, rúhali sa mu: potriasali hlavami a vraveli: <font color='#B71C1C'>S</font> \"Ty, čo zboríš chrám a za\u00A0tri dni ho znova postavíš, zachráň sám seba! Ak si Boží Syn, zostúp z\u00A0kríža!\"<br>" +
                            "<font color='#B71C1C'>E</font> Podobne sa mu posmievali aj veľkňazi so\u00A0zákonníkmi a staršími: <font color='#B71C1C'>S</font> \"Iných zachraňoval, sám seba nemôže zachrániť. Je kráľom Izraela; nech teraz zostúpi z\u00A0kríža a uveríme v\u00A0neho. Spoliehal sa na\u00A0Boha; nech ho teraz vyslobodí, ak ho má rád. Veď povedal: ‚Som Boží Syn.'\" <br>" +
                            "<font color='#B71C1C'>E</font> Takisto ho tupili aj zločinci, čo boli s\u00A0ním ukrižovaní.",
                    "Eli, Eli, lema sabakthani?",
                    "<font color='#B71C1C'>E</font> Od\u00A0dvanástej hodiny nastala tma po\u00A0celej zemi až do\u00A0tretej hodiny popoludní. Okolo tretej hodiny zvolal Ježiš mocným hlasom: <font color='#B71C1C'>+</font> \"Eli, Eli, lema sabakthani?\", <font color='#B71C1C'>E</font> čo znamená: <font color='#B71C1C'>+</font> \"Bože môj, Bože môj, prečo si ma opustil?\"<br>" +
                            "<font color='#B71C1C'>E</font> Keď to počuli niektorí z\u00A0tých, čo tam stáli, vraveli: <font color='#B71C1C'>S</font> \"Volá Eliáša.\"<br>" +
                            "<font color='#B71C1C'>E</font> Jeden z\u00A0nich hneď odbehol, vzal špongiu, naplnil ju octom, nastokol na\u00A0trstinu a dával mu piť. Ale ostatní hovorili: <font color='#B71C1C'>S</font> \"Počkaj, nech uvidíme, či ho Eliáš príde vyslobodiť.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš však znova zvolal mocným hlasom a vydýchol dušu.<br>" +
                            "<font color='#B71C1C'>Pokľakne sa a chvíľku je ticho.</font><br>" +
                            "<font color='#B71C1C'>E</font> A hľa, chrámová opona sa roztrhla vo\u00A0dvoje odvrchu až dospodku. Zem sa triasla a skaly sa pukali. Otvorili sa hroby a mnohé telá zosnulých svätých vstali z\u00A0mŕtvych. Vyšli z\u00A0hrobov a po\u00A0jeho vzkriesení prišli do\u00A0svätého mesta a ukázali sa mnohým.<br>" +
                            "<font color='#B71C1C'>E</font> Keď stotník a tí, čo s\u00A0ním strážili Ježiša, videli zemetrasenie a všetko, čo sa deje, veľmi sa naľakali a hovorili: <font color='#B71C1C'>S</font> \"On bol naozaj Boží Syn.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"60", "B", "Mk 14, 1 – 15, 47", "Umučenie nášho Pána Ježiša Krista podľa Marka<br>"+
                    "<font color='#B71C1C'>Pašie sa čítajú bez\u00A0sviečok a bez\u00A0incenzácie, bez\u00A0pozdravu a bez\u00A0poznačenia knihy znakom kríža. Číta ich diakon; ak ho niet, kňaz. Čítať ich môžu aj lektori laici; v\u00A0tomto prípade, ak je možné, treba vyhradiť kňazovi časti, v\u00A0ktorých hovorí Kristus.<br>" +
                    "Diakoni (nie však iní) pred\u00A0spievaním pašií prosia od\u00A0kňaza požehnanie, ako sa to robí vo\u00A0svätej omši pred\u00A0evanjeliom.<br>" +
                    "Po pašiách, ak je to vhodné, nech je krátka homília.<br>" +
                    "Značky pri\u00A0dialogickom čítaní: E - evanjelista, + - Kristove slová, S - slová ostatných osôb.</font>",

                    "Hľadali spôsob, ako podvodne chytiť Ježiša a zabiť",
                    "<font color='#B71C1C'>E</font> Bolo dva dni pred\u00A0Veľkou nocou a sviatkami Nekvasených chlebov. Veľkňazi a zákonníci hľadali spôsob, ako podvodne chytiť Ježiša a zabiť ho. Ale hovorili: <font color='#B71C1C'>S</font> \"Nie vo\u00A0sviatok, aby sa ľud nevzbúril.\"",
                    "Vopred pomazala moje telo na\u00A0pohreb",
                    "<font color='#B71C1C'>E</font> Keď bol v\u00A0Betánii v\u00A0dome Šimona Malomocného a sedel pri\u00A0stole, prišla žena s\u00A0alabastrovou nádobou pravého vzácneho nardového oleja. Nádobu rozbila a olej mu vyliala na\u00A0hlavu. Niektorí sa hnevali a hovorili si: <font color='#B71C1C'>S</font> \"Načo takto mrhať voňavý olej?! Veď sa mohol tento olej predať za\u00A0viac ako tristo denárov a tie rozdať chudobným.\" <font color='#B71C1C'>E</font> A osopovali sa na\u00A0ňu.<br>" +
                            "<font color='#B71C1C'>E</font> Ale Ježiš povedal: <font color='#B71C1C'>+</font> \"Nechajte ju! Prečo ju trápite? Urobila mi dobrý skutok. Veď chudobných máte vždy medzi sebou, a keď budete chcieť, môžete im robiť dobre. Ale mňa nemáte vždy. Urobila, čo mohla. Vopred pomazala moje telo na\u00A0pohreb. Veru, hovorím vám: Kdekoľvek na\u00A0svete sa bude ohlasovať evanjelium, bude sa na\u00A0jej pamiatku hovoriť aj o\u00A0tom, čo urobila.\"",
                    "Judášovi Iškariotskému sľúbili peniaze",
                    "<font color='#B71C1C'>E</font> Judáš Iškariotský, jeden z\u00A0Dvanástich, odišiel k\u00A0veľkňazom, aby im ho zradil. Tí sa potešili, keď to počuli, a sľúbili, že mu dajú peniaze. A on hľadal spôsob, ako ho príhodne vydať.",
                    "Kde je pre\u00A0mňa miestnosť, v\u00A0ktorej by som mohol jesť so\u00A0svojimi učeníkmi veľkonočného baránka?",
                    "<font color='#B71C1C'>E</font> V\u00A0prvý deň sviatkov Nekvasených chlebov, keď zabíjali veľkonočného baránka, povedali mu jeho učeníci: <font color='#B71C1C'>S</font> \"Kde ti máme ísť pripraviť veľkonočnú večeru?\"<br>" +
                            "<font color='#B71C1C'>E</font> Poslal dvoch zo\u00A0svojich učeníkov a vravel im: <font color='#B71C1C'>+</font> \"Choďte do\u00A0mesta. Tam stretnete človeka, ktorý bude niesť džbán vody. Choďte za\u00A0ním a pánovi domu, do\u00A0ktorého vojde, povedzte: ‚Učiteľ odkazuje: Kde je pre\u00A0mňa miestnosť, v\u00A0ktorej by som mohol jesť so\u00A0svojimi učeníkmi veľkonočného baránka?' On vám ukáže veľkú hornú sieň, prestretú a pripravenú. Tam nám prichystajte.\"<br>" +
                            "<font color='#B71C1C'>E</font> Učeníci odišli a keď prišli do\u00A0mesta, všetko našli tak, ako im povedal. A pripravili veľkonočného baránka.",
                    "Jeden z\u00A0vás ma zradí",
                    "<font color='#B71C1C'>E</font> Keď sa zvečerilo, prišiel s\u00A0Dvanástimi. A keď boli pri\u00A0stole a jedli, Ježiš povedal: <font color='#B71C1C'>+</font> \"Veru, hovorím vám: Jeden z\u00A0vás ma zradí, ten, čo je so\u00A0mnou.\"<br>" +
                            "<font color='#B71C1C'>E</font> Zosmutneli a začali sa ho jeden po\u00A0druhom vypytovať: <font color='#B71C1C'>S</font> \"Azda ja?\"<br>" +
                            "<font color='#B71C1C'>E</font> On im odpovedal: <font color='#B71C1C'>+</font> \"Jeden z\u00A0Dvanástich, čo so\u00A0mnou namáča v\u00A0mise. Syn človeka síce ide, ako je o\u00A0ňom napísané, ale beda človekovi, ktorý zrádza Syna človeka! Pre\u00A0toho človeka by bolo lepšie, keby sa nebol narodil.\"",
                    "Toto je moje telo. Toto je moja krv novej zmluvy",
                    "<font color='#B71C1C'>E</font> Keď jedli, vzal chlieb a dobrorečil, lámal ho a dával im, hovoriac: <font color='#B71C1C'>+</font> \"Vezmite, toto je moje telo!\"<br>" +
                            "<font color='#B71C1C'>E</font> Potom vzal kalich, vzdával vďaky, dal im ho a všetci z\u00A0neho pili. A povedal im: <font color='#B71C1C'>+</font> \"Toto je moja krv novej zmluvy, ktorá sa vylieva za\u00A0všetkých. Veru, hovorím vám: Už nebudem piť z\u00A0plodu viniča až do\u00A0dňa, keď ho budem piť nový v\u00A0Božom kráľovstve.\"",
                    "Skôr ako dva razy kohút zaspieva, tri razy ma zaprieš",
                    "<font color='#B71C1C'>E</font> Potom zaspievali chválospev a vyšli na\u00A0Olivovú horu. Vtedy im Ježiš povedal: <font color='#B71C1C'>+</font> \"Všetci odpadnete, lebo je napísané: ‚Udriem pastiera a ovce sa rozpŕchnu.' Ale keď vstanem z\u00A0mŕtvych, predídem vás do\u00A0Galiley.\"<br>" +
                            "<font color='#B71C1C'>E</font> Peter mu povedal: <font color='#B71C1C'>S</font> \"Aj keby všetci odpadli, ja nie.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš mu odvetil: <font color='#B71C1C'>+</font> \"Veru, hovorím ti: Ty ma dnes, tejto noci, skôr, ako dva razy kohút zaspieva, tri razy zaprieš.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale on ešte horlivejšie vyhlasoval: <font color='#B71C1C'>S</font> \"Aj keby som mal umrieť s\u00A0tebou, nezapriem ťa.\"<br>" +
                            "<font color='#B71C1C'>E</font> Podobne hovorili aj ostatní.",
                    "Doľahla naňho hrôza a úzkosť",
                    "<font color='#B71C1C'>E</font> Prišli na\u00A0pozemok, ktorý sa volá Getsemani, a povedal svojim učeníkom: <font color='#B71C1C'>+</font> \"Sadnite si tu, kým sa pomodlím.\"<br>" +
                            "<font color='#B71C1C'>E</font> Vzal so\u00A0sebou Petra, Jakuba a Jána. I doľahla naňho hrôza a úzkosť. Vtedy im povedal: <font color='#B71C1C'>+</font> \"Moja duša je smutná až na\u00A0smrť. Ostaňte tu a bdejte!\"<br>" +
                            "<font color='#B71C1C'>E</font> Trocha poodišiel, padol na\u00A0zem a modlil sa, aby ho, ak je možné, minula táto hodina. Hovoril: <font color='#B71C1C'>+</font> \"Abba, Otče! Tebe je všetko možné. Vezmi odo\u00A0mňa tento kalich. No nie čo ja chcem, ale čo ty.\"<br>" +
                            "<font color='#B71C1C'>E</font> Keď sa vrátil, našiel ich spať. I povedal Petrovi: <font color='#B71C1C'>+</font> \"Šimon, spíš? Ani hodinu si nemohol bdieť? Bdejte a modlite sa, aby ste neprišli do\u00A0pokušenia. Duch je síce ochotný, ale telo slabé.\"<br>" +
                            "<font color='#B71C1C'>E</font> Znova odišiel a modlil sa tými istými slovami. A keď sa vrátil, zasa ich našiel spať: oči sa im zatvárali od\u00A0únavy a nevedeli, čo mu povedať.<br>" +
                            "<font color='#B71C1C'>E</font> Keď prišiel tretí raz, povedal im: <font color='#B71C1C'>+</font> \"Ešte spíte a odpočívate? Dosť už. Prišla hodina: hľa, Syna človeka už vydávajú do\u00A0rúk hriešnikov. Vstaňte, poďme! Pozrite, môj zradca je blízko.\"",
                    "Chyťte ho a obozretne odveďte!",
                    "<font color='#B71C1C'>E</font> A kým ešte hovoril, prišiel zrazu Judáš, jeden z\u00A0Dvanástich, a s\u00A0ním zástup s\u00A0mečmi a kyjmi, ktorý poslali veľkňazi, zákonníci a starší. Jeho zradca im dal znamenie: <font color='#B71C1C'>+</font> \"Koho pobozkám, to je on. Chyťte ho a obozretne odveďte!\"<br>" +
                            "<font color='#B71C1C'>E</font> Keď prišiel, hneď pristúpil k\u00A0nemu a povedal: <font color='#B71C1C'>+</font> \"Rabbi.\" <font color='#B71C1C'>E</font> A pobozkal ho.<br>" +
                            "<font color='#B71C1C'>E</font> Oni položili naň ruky a zajali ho. Tu jeden z\u00A0okolostojacich vytasil meč, zasiahol ním veľkňazovho sluhu a odťal mu ucho.<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš im povedal: <font color='#B71C1C'>+</font> \"Vyšli ste s\u00A0mečmi a kyjmi ako na\u00A0zločinca, aby ste ma zajali. Deň čo deň som učil u\u00A0vás v\u00A0chráme, a nezajali ste ma. Ale musí sa splniť Písmo.\"<br>" +
                            "<font color='#B71C1C'>E</font> Vtedy ho všetci opustili a rozutekali sa.<br>" +
                            "<font color='#B71C1C'>E</font> No akýsi mladík išiel za\u00A0ním, odetý plachtou na\u00A0holom tele; a chytili ho. Ale on pustil plachtu a utiekol nahý.",
                    "Si ty Mesiáš, syn Požehnaného?",
                    "<font color='#B71C1C'>E</font> Ježiša priviedli k\u00A0veľkňazovi, kde sa zhromaždili všetci veľkňazi, starší a zákonníci. Peter šiel zďaleka za\u00A0ním až dnu do\u00A0veľkňazovho dvora. Sadol si k\u00A0sluhom a zohrieval sa pri\u00A0ohni.<br>" +
                            "<font color='#B71C1C'>E</font> Veľkňazi a celá veľrada zháňali svedectvo proti Ježišovi, aby ho mohli odsúdiť na\u00A0smrť. Ale nenašli. Mnohí proti nemu krivo svedčili, a ich svedectvá sa nezhodovali. Tu niektorí vstali a krivo proti nemu svedčili: <font color='#B71C1C'>S</font> \"My sme ho počuli hovoriť: ‚Ja zborím tento chrám zhotovený rukou a za\u00A0tri dni postavím iný, nie rukou zhotovený.'\" <font color='#B71C1C'>E</font> Ale ani tak sa ich svedectvo nezhodovalo.<br>" +
                            "<font color='#B71C1C'>E</font> Tu vstal veľkňaz, postavil sa do\u00A0stredu a opýtal sa Ježiša: <font color='#B71C1C'>S</font> \"Nič neodpovieš na\u00A0to, čo títo svedčia proti tebe?\" <font color='#B71C1C'>E</font> Ale on mlčal a nič neodpovedal.<br>" +
                            "<font color='#B71C1C'>E</font> Veľkňaz sa ho znova pýtal: <font color='#B71C1C'>S</font> \"Si ty Mesiáš, syn Požehnaného?\"<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš odvetil: <font color='#B71C1C'>+</font> \"Áno, som. A uvidíte Syna človeka sedieť po\u00A0pravici Moci a prichádzať s\u00A0nebeskými oblakmi.\"<br>" +
                            "<font color='#B71C1C'>E</font> Vtedy si veľkňaz roztrhol rúcho a povedal: <font color='#B71C1C'>S</font> \"Načo ešte potrebujeme svedkov? Počuli ste rúhanie. Čo na\u00A0to poviete?\"<br>" +
                            "<font color='#B71C1C'>E</font> A oni všetci vyniesli nad\u00A0ním súd, že je hoden smrti.<br>" +
                            "<font color='#B71C1C'>E</font> Niektorí začali naňho pľuť, zakrývali mu tvár, bili ho päsťami a hovorili mu:<font color='#B71C1C'>S</font> \"Prorokuj!\" <font color='#B71C1C'>E</font> Aj sluhovia ho bili po\u00A0tvári.",
                    "Nepoznám toho človeka, o\u00A0ktorom hovoríte",
                    "<font color='#B71C1C'>E</font> Keď bol Peter dolu na\u00A0nádvorí, prišla jedna z\u00A0veľkňazových slúžok. Len čo zbadala Petra, ako sa zohrieva, pozrela sa naňho a povedala: <font color='#B71C1C'>S</font> \"Aj ty si bol s\u00A0tým Nazaretčanom, Ježišom.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale on zaprel: <font color='#B71C1C'>S</font> \"Ani neviem, ani nerozumiem, čo hovoríš.\" <font color='#B71C1C'>E</font> Vyšiel von pred\u00A0nádvorie a zaspieval kohút.<br>" +
                            "<font color='#B71C1C'>E</font> Keď ho tam videla slúžka, znova začala vravieť okolostojacim: <font color='#B71C1C'>S</font> \"Tento je z\u00A0nich.\" <font color='#B71C1C'>E</font> Ale on opäť zapieral.<br>" +
                            "<font color='#B71C1C'>E</font> O\u00A0chvíľku tí, čo tam stáli, znova hovorili Petrovi: <font color='#B71C1C'>S</font> \"Veru si z\u00A0nich, veď si aj Galilejčan.\"<br>" +
                            "<font color='#B71C1C'>E</font> On sa však začal zaklínať a prisahať: <font color='#B71C1C'>S</font> \"Nepoznám toho človeka, o\u00A0ktorom hovoríte.\" <font color='#B71C1C'>E</font> Vtom kohút zaspieval druhý raz.<br>" +
                            "<font color='#B71C1C'>E</font> Vtedy sa Peter rozpamätal na\u00A0slovo, ktoré mu bol povedal Ježiš: \"Skôr ako dva razy kohút zaspieva, tri razy ma zaprieš.\" I rozplakal sa.",
                    "Chcete, aby som vám prepustil židovského kráľa?",
                    "<font color='#B71C1C'>E</font> Hneď zrána mali poradu veľkňazi so\u00A0staršími a zákonníkmi, teda celá veľrada. Ježiša spútali, odviedli a odovzdali Pilátovi.<br>" +
                            "<font color='#B71C1C'>E</font> Pilát sa ho spýtal: <font color='#B71C1C'>S</font> \"Si židovský kráľ?\"<br>" +
                            "<font color='#B71C1C'>E</font> On mu odpovedal: <font color='#B71C1C'>+</font> \"Sám to hovoríš.\"<br>" +
                            "<font color='#B71C1C'>E</font> Veľkňazi naň mnoho žalovali a Pilát sa ho znova spytoval: \"Nič neodpovieš? Pozri, čo všetko žalujú na\u00A0teba!\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale Ježiš už nič nepovedal, takže sa Pilát čudoval.<br>" +
                            "<font color='#B71C1C'>E</font> Na\u00A0sviatky im prepúšťal jedného väzňa, ktorého si žiadali. <font color='#B71C1C'>S</font> povstalcami, čo sa pri\u00A0vzbure dopustili vraždy, bol uväznený muž, ktorý sa volal Barabáš. Zástup vystúpil hore a žiadal si to, čo im robieval. Pilát im povedal: <font color='#B71C1C'>S</font> \"Chcete, aby som vám prepustil židovského kráľa?\" <font color='#B71C1C'>E</font> Lebo vedel, že ho veľkňazi vydali zo\u00A0závisti.<br>" +
                            "<font color='#B71C1C'>E</font> Ale veľkňazi podnietili zástup, aby im radšej prepustil Barabáša.<br>" +
                            "<font color='#B71C1C'>E</font> Pilát sa ich znova opýtal: <font color='#B71C1C'>S</font> \"Čo mám teda podľa vás urobiť so\u00A0židovským kráľom?\"<br>" +
                            "<font color='#B71C1C'>E</font> Oni opäť skríkli: <font color='#B71C1C'>S</font> \"Ukrižuj ho!\"<br>" +
                            "<font color='#B71C1C'>E</font> Pilát im vravel: <font color='#B71C1C'>S</font> \"A čo zlé urobil?\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale oni tým väčšmi kričali: <font color='#B71C1C'>S</font> \"Ukrižuj ho!\"<br>" +
                            "<font color='#B71C1C'>E</font> A Pilát, aby urobil ľudu po\u00A0vôli, prepustil im Barabáša. Ježiša však dal zbičovať a vydal ho, aby ho ukrižovali.",
                    "Z tŕnia uplietli korunu a založili mu ju",
                    "<font color='#B71C1C'>E</font> Vojaci ho odviedli dnu do\u00A0nádvoria, čiže do\u00A0vládnej budovy, a zvolali celú kohortu. Odeli ho do\u00A0purpurového plášťa, z\u00A0tŕnia uplietli korunu a založili mu ju a začali ho pozdravovať: <font color='#B71C1C'>S</font> \"Buď pozdravený, židovský kráľ!\"<br>" +
                            "<font color='#B71C1C'>E</font> Bili ho trstinou po\u00A0hlave, pľuli naňho, kľakali pred\u00A0ním a klaňali sa mu. Keď sa mu naposmievali, vyzliekli ho z\u00A0purpuru a obliekli mu jeho šaty. Potom ho vyviedli, aby ho ukrižovali.",
                    "Priviedli ho na\u00A0miesto Golgota a ukrižovali ho",
                    "<font color='#B71C1C'>E</font> Tu prinútili istého Šimona z\u00A0Cyrény, Alexandrovho a Rúfovho otca, ktorý sa tade vracal z\u00A0poľa, aby mu niesol kríž. Tak ho priviedli na\u00A0miesto Golgota, čo v\u00A0preklade znamená Lebka.<br>" +
                            "<font color='#B71C1C'>E</font> Dávali mu víno zmiešané s\u00A0myrhou, ale on ho neprijal. Potom ho ukrižovali a rozdelili si jeho šaty hodili o\u00A0ne lós, kto si má čo vziať. Keď ho ukrižovali, bolo deväť hodín.<br>" +
                            "<font color='#B71C1C'>E</font> Jeho vinu označili nápisom: \"Židovský kráľ.\"<br>" +
                            "<font color='#B71C1C'>E</font> Vedno s\u00A0ním ukrižovali aj dvoch zločincov: jedného napravo od\u00A0neho, druhého naľavo.",
                    "Iných zachraňoval, sám seba nemôže zachrániť",
                    "<font color='#B71C1C'>E</font> A tí, čo šli okolo, rúhali sa mu; potriasali hlavami a vraveli: <font color='#B71C1C'>S</font> \"Aha, ten, čo zborí chrám a za\u00A0tri dni ho postaví. Zachráň sám seba, zostúp z\u00A0kríža!\"<br>" +
                            "<font color='#B71C1C'>E</font> Podobne sa mu posmievali aj veľkňazi a so\u00A0zákonníkmi si hovorili: <font color='#B71C1C'>S</font> \"Iných zachraňoval, sám seba nemôže zachrániť. Kristus, kráľ Izraela! Nech teraz zostúpi z\u00A0kríža, aby sme videli a uverili.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ešte aj tí ho hanobili, čo boli s\u00A0ním ukrižovaní.",
                    "Ježiš zvolal mocným hlasom a vydýchol",
                    "<font color='#B71C1C'>E</font> Keď bolo dvanásť hodín, nastala tma po\u00A0celej zemi až do\u00A0tretej hodiny popoludní. O\u00A0tretej hodine zvolal Ježiš mocným hlasom: <font color='#B71C1C'>+</font> \"Heloi, heloi, lema sabakthani?\", <font color='#B71C1C'>E</font> čo v\u00A0preklade znamená: <font color='#B71C1C'>+</font> \"Bože môj, Bože môj, prečo si ma opustil?\"<br>" +
                            "<font color='#B71C1C'>E</font> Keď to počuli, niektorí z\u00A0okolostojacich vraveli: <font color='#B71C1C'>S</font> \"Pozrite, volá Eliáša.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ktosi odbehol, naplnil špongiu octom, nastokol ju na\u00A0trstinu, dával mu piť a hovoril: <font color='#B71C1C'>S</font> \"Počkajte, uvidíme, či ho Eliáš príde sňať.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale Ježiš zvolal mocným hlasom a vydýchol.<br>" +
                            "<font color='#B71C1C'>Pokľakne sa a chvíľku je ticho.</font><br>" +
                            "<font color='#B71C1C'>E</font> Chrámová opona sa roztrhla vo\u00A0dvoje odvrchu až dospodku.<br>" +
                            "<font color='#B71C1C'>E</font> Keď stotník, čo stál naproti nemu, videl, ako vykríkol a skonal, povedal: <font color='#B71C1C'>S</font> \"Tento človek bol naozaj Boží Syn.\"<br>" +
                            "<font color='#B71C1C'>E</font> Zobďaleč sa pozerali aj ženy. Medzi nimi Mária Magdaléna, Mária, matka Jakuba Mladšieho a Jozesa, i Salome, ktoré ho sprevádzali a posluhovali mu, keď bol v\u00A0Galilei. Aj mnohé iné, čo s\u00A0ním prišli do\u00A0Jeruzalema.",
                    "Jozef ku\u00A0vchodu do\u00A0hrobu privalil kameň",
                    "<font color='#B71C1C'>E</font> Keď sa už zvečerilo, pretože bol Prípravný deň, čiže deň pred\u00A0sobotou, prišiel Jozef z\u00A0Arimatey, významný člen rady, ktorý tiež očakával Božie kráľovstvo, smelo vošiel k\u00A0Pilátovi a poprosil o\u00A0Ježišovo telo. Pilát sa zadivil, že už zomrel. Zavolal si stotníka a opýtal sa ho, či je už mŕtvy. Keď mu to stotník potvrdil, daroval telo Jozefovi. On kúpil plátno a keď ho sňal, zavinul ho do\u00A0plátna a uložil do\u00A0hrobu vytesaného do\u00A0skaly. A ku\u00A0vchodu do\u00A0hrobu privalil kameň.<br>" +
                            "<font color='#B71C1C'>E</font> Mária Magdaléna a Mária Jozesova sa pozerali, kde ho uložili.<br>" +
                            "Počuli sme slovo Pánovo.",
                            "Alebo kratšie:",
                    "Mk 15, 1-39",
                    "Chcete, aby som vám prepustil židovského kráľa?",
                    "<font color='#B71C1C'>E</font> Hneď zrána mali poradu veľkňazi so\u00A0staršími a zákonníkmi, teda celá veľrada. Ježiša spútali, odviedli a odovzdali Pilátovi.<br>" +
                            "<font color='#B71C1C'>E</font> Pilát sa ho spýtal: <font color='#B71C1C'>S</font> \"Si židovský kráľ?\"<br>" +
                            "<font color='#B71C1C'>E</font> On mu odpovedal: <font color='#B71C1C'>+</font> \"Sám to hovoríš.\"<br>" +
                            "<font color='#B71C1C'>E</font> Veľkňazi naň mnoho žalovali a Pilát sa ho znova spytoval: <font color='#B71C1C'>S</font> \"Nič neodpovieš? Pozri, čo všetko žalujú na\u00A0teba!\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale Ježiš už nič nepovedal, takže sa Pilát čudoval.<br>" +
                            "<font color='#B71C1C'>E</font> Na\u00A0sviatky im prepúšťal jedného väzňa, ktorého si žiadali. <font color='#B71C1C'>S</font> povstalcami, čo sa pri\u00A0vzbure dopustili vraždy, bol uväznený muž, ktorý sa volal Barabáš. Zástup vystúpil hore a žiadal si to, čo im robieval. Pilát im povedal: <font color='#B71C1C'>S</font> \"Chcete, aby som vám prepustil židovského kráľa?\"<br>" +
                            "<font color='#B71C1C'>E</font> Lebo vedel, že ho veľkňazi vydali zo\u00A0závisti.<br>" +
                            "<font color='#B71C1C'>E</font> Ale veľkňazi podnietili zástup, aby im radšej prepustil Barabáša.<br>" +
                            "<font color='#B71C1C'>E</font> Pilát sa ich znova opýtal: <font color='#B71C1C'>S</font> \"Čo mám teda podľa vás urobiť so\u00A0židovským kráľom?\"<br>" +
                            "<font color='#B71C1C'>E</font> Oni opäť skríkli: <font color='#B71C1C'>S</font> \"Ukrižuj ho!\"<br>" +
                            "<font color='#B71C1C'>E</font> Pilát im vravel: <font color='#B71C1C'>S</font> \"A čo zlé urobil?\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale oni tým väčšmi kričali: <font color='#B71C1C'>S</font> \"Ukrižuj ho!\"<br>" +
                            "<font color='#B71C1C'>E</font> A Pilát, aby urobil ľudu po\u00A0vôli, prepustil im Barabáša. Ježiša však dal zbičovať a vydal ho, aby ho ukrižovali.",
                    "Z tŕnia uplietli korunu a založili mu ju",
                    "<font color='#B71C1C'>E</font> Vojaci ho odviedli dnu do\u00A0nádvoria, čiže do\u00A0vládnej budovy, a zvolali celú kohortu. Odeli ho do\u00A0purpurového plášťa, z\u00A0tŕnia uplietli korunu a založili mu ju a začali ho pozdravovať: <font color='#B71C1C'>S</font> \"Buď pozdravený, židovský kráľ!\"<br>" +
                            "<font color='#B71C1C'>E</font> Bili ho trstinou po\u00A0hlave, pľuli naňho, kľakali pred\u00A0ním a klaňali sa mu. Keď sa mu naposmievali, vyzliekli ho z\u00A0purpuru a obliekli mu jeho šaty. Potom ho vyviedli, aby ho ukrižovali.",
                    "Priviedli ho na\u00A0miesto Golgota a ukrižovali ho",
                    "<font color='#B71C1C'>E</font> Tu prinútili istého Šimona z\u00A0Cyrény, Alexandrovho a Rúfovho otca, ktorý sa tade vracal z\u00A0poľa, aby mu niesol kríž. Tak ho priviedli na\u00A0miesto Golgota, čo v\u00A0preklade znamená Lebka.<br>" +
                            "<font color='#B71C1C'>E</font> Dávali mu víno zmiešané s\u00A0myrhou, ale on ho neprijal. Potom ho ukrižovali a rozdelili si jeho šaty hodili o\u00A0ne lós, kto si má čo vziať. Keď ho ukrižovali, bolo deväť hodín.<br>" +
                            "<font color='#B71C1C'>E</font> Jeho vinu označili nápisom: \"Židovský kráľ.\"<br>" +
                            "<font color='#B71C1C'>E</font> Vedno s\u00A0ním ukrižovali aj dvoch zločincov: jedného napravo od\u00A0neho, druhého naľavo.",
                    "Iných zachraňoval, sám seba nemôže zachrániť",
                    "<font color='#B71C1C'>E</font> A tí, čo šli okolo, rúhali sa mu; potriasali hlavami a vraveli: <font color='#B71C1C'>S</font> \"Aha, ten, čo zborí chrám a za\u00A0tri dni ho postaví. Zachráň sám seba, zostúp z\u00A0kríža!\"<br>" +
                            "<font color='#B71C1C'>E</font> Podobne sa mu posmievali aj veľkňazi a so\u00A0zákonníkmi si hovorili: <font color='#B71C1C'>S</font> \"Iných zachraňoval, sám seba nemôže zachrániť. Kristus, kráľ Izraela! Nech teraz zostúpi z\u00A0kríža, aby sme videli a uverili.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ešte aj tí ho hanobili, čo boli s\u00A0ním ukrižovaní.",
                    "Ježiš zvolal mocným hlasom a vydýchol",
                    "<font color='#B71C1C'>E</font> Keď bolo dvanásť hodín, nastala tma po\u00A0celej zemi až do\u00A0tretej hodiny popoludní. O\u00A0tretej hodine zvolal Ježiš mocným hlasom: <font color='#B71C1C'>+</font> \"Heloi, heloi, lema sabakthani?\", <font color='#B71C1C'>E</font> čo v\u00A0preklade znamená: <font color='#B71C1C'>+</font> \"Bože môj, Bože môj, prečo si ma opustil?\"<br>" +
                            "<font color='#B71C1C'>E</font> Keď to počuli, niektorí z\u00A0okolostojacich vraveli: <font color='#B71C1C'>S</font> \"Pozrite, volá Eliáša.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ktosi odbehol, naplnil špongiu octom, nastokol ju na\u00A0trstinu, dával mu piť a hovoril: <font color='#B71C1C'>S</font> \"Počkajte, uvidíme, či ho Eliáš príde sňať.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale Ježiš zvolal mocným hlasom a vydýchol.<br>" +
                            "<font color='#B71C1C'>Pokľakne sa a chvíľku je ticho.</font><br>" +
                            "<font color='#B71C1C'>E</font> Chrámová opona sa roztrhla vo\u00A0dvoje odvrchu až dospodku.<br>" +
                            "<font color='#B71C1C'>E</font> Keď stotník, čo stál naproti nemu, videl, ako vykríkol a skonal, povedal: <font color='#B71C1C'>S</font> \"Tento človek bol naozaj Boží Syn.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"60", "C", "", "Lk 22, 14 – 23, 56", "Umučenie nášho Pána Ježiša Krista podľa Lukáša<br>"+
                    "<font color='#B71C1C'>Pašie sa čítajú bez\u00A0sviečok a bez\u00A0incenzácie, bez\u00A0pozdravu a bez\u00A0poznačenia knihy znakom kríža. Číta ich diakon; ak ho niet, kňaz. Čítať ich môžu aj lektori laici; v\u00A0tomto prípade, ak je možné, treba vyhradiť kňazovi časti, v\u00A0ktorých hovorí Kristus.<br>" +
                            "Diakoni (nie však iní) pred\u00A0spievaním pašií prosia od\u00A0kňaza požehnanie, ako sa to robí vo\u00A0svätej omši pred\u00A0evanjeliom.<br>" +
                            "Po pašiách, ak je to vhodné, nech je krátka homília.<br>" +
                            "Značky pri\u00A0dialogickom čítaní: E - evanjelista, + - Kristove slová, S - slová ostatných osôb.</font>",

                    "Veľmi som túžil jesť s\u00A0vami tohto veľkonočného baránka skôr, ako budem trpieť",
                    "<font color='#B71C1C'>E</font> Keď prišla hodina, Ježiš zasadol za\u00A0stôl a apoštoli s\u00A0ním. Tu im povedal: <font color='#B71C1C'>+</font> \"Veľmi som túžil jesť s\u00A0vami tohoto veľkonočného baránka skôr, ako budem trpieť. Lebo hovorím vám: Už ho nebudem jesť, kým sa nenaplní v\u00A0Božom kráľovstve.\"<br>" +
                            "<font color='#B71C1C'>E</font> Vzal kalich, vzdával vďaky a povedal: <font color='#B71C1C'>+</font> \"Vezmite ho a rozdeľte si ho medzi sebou. Lebo hovorím vám: Odteraz už nebudem piť z\u00A0plodu viniča, kým nepríde Božie kráľovstvo.\"",
                    "Toto robte na\u00A0moju pamiatku",
                    "<font color='#B71C1C'>E</font> Potom vzal chlieb a vzdával vďaky, lámal ho a dával im, hovoriac: <font color='#B71C1C'>+</font> \"Toto je moje telo, ktoré sa dáva za\u00A0vás. Toto robte na\u00A0moju pamiatku.\"<br>" +
                            "<font color='#B71C1C'>E</font> Podobne po\u00A0večeri vzal kalich a hovoril: <font color='#B71C1C'>+</font> \"Tento kalich je nová zmluva v\u00A0mojej krvi, ktorá sa vylieva za\u00A0vás.",
                    "Beda človekovi, ktorý zrádza Syna človeka!",
                    "<font color='#B71C1C'>+</font> A hľa, ruka môjho zradcu je so\u00A0mnou na\u00A0stole. Syn človeka síce ide, ako je určené, ale beda človekovi, ktorý ho zrádza!\"<br>" +
                            "<font color='#B71C1C'>E</font> A oni sa začali jeden druhého vypytovať, kto z\u00A0nich by to mohol urobiť.",
                    "Ja som medzi vami ako ten, čo obsluhuje",
                    "<font color='#B71C1C'>E</font> Vznikol medzi nimi aj spor, kto je z\u00A0nich asi najväčší. Povedal im: <font color='#B71C1C'>+</font> \"Králi národov panujú nad\u00A0nimi, a tí, čo majú nad\u00A0nimi moc, volajú sa dobrodincami. Ale vy nie tak! Kto je medzi vami najväčší, nech je ako najmenší a vodca ako služobník. Veď kto je väčší? Ten, čo sedí za\u00A0stolom, či ten, čo obsluhuje? Nie ten, čo sedí za\u00A0stolom? A ja som medzi vami ako ten, čo obsluhuje.<br>" +
                            "<font color='#B71C1C'>+</font> Vy ste vytrvali so\u00A0mnou v\u00A0mojich skúškach a ja vám dávam kráľovstvo, ako ho môj Otec dal mne, aby ste jedli a pili pri\u00A0mojom stole v\u00A0mojom kráľovstve, sedeli na\u00A0trónoch a súdili dvanásť kmeňov Izraela.",
                    "A ty, až sa raz obrátiš, posilňuj svojich bratov",
                    "<font color='#B71C1C'>+</font> Šimon, Šimon, hľa, satan si vás vyžiadal, aby vás preosial ako pšenicu. Ale ja som prosil za\u00A0teba, aby neochabla tvoja viera. A ty, až sa raz obrátiš, posilňuj svojich bratov.\"<br>" +
                            "<font color='#B71C1C'>E</font> On mu povedal: <font color='#B71C1C'>S</font> \"Pane, hotový som ísť s\u00A0tebou do\u00A0väzenia i na\u00A0smrť.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale Ježiš povedal: <font color='#B71C1C'>+</font> \"Hovorím ti, Peter, dnes nezaspieva kohút, kým tri razy nezaprieš, že ma poznáš.\"",
                    "Musí sa na\u00A0mne splniť, čo je napísané",
                    "<font color='#B71C1C'>E</font> Potom im povedal: <font color='#B71C1C'>+</font> \"Chýbalo vám niečo, keď som vás poslal bez\u00A0mešca, bez\u00A0kapsy a bez\u00A0obuvi?\"<br>" +
                            "<font color='#B71C1C'>E</font> Oni odpovedali: <font color='#B71C1C'>S</font> \"Nie.\"<br>" +
                            "<font color='#B71C1C'>E</font> On im povedal: <font color='#B71C1C'>+</font> \"Ale teraz, kto má mešec, nech si ho vezme, takisto aj kapsu, a kto nemá, nech predá šaty a kúpi si meč. Lebo hovorím vám: Musí sa na\u00A0mne splniť, čo je napísané: ‚Započítali ho medzi zločincov.' Lebo sa spĺňa o\u00A0mne všetko.\"<br>" +
                            "<font color='#B71C1C'>E</font> On im povedal: <font color='#B71C1C'>+</font> \"Ale teraz, kto má mešec, nech si ho vezme, takisto aj kapsu, a kto nemá, nech predá šaty a kúpi si meč. Lebo hovorím vám: Musí sa na\u00A0mne splniť, čo je napísané: ‚Započítali ho medzi zločincov.' Lebo sa spĺňa o\u00A0mne všetko.\"<br>" +
                            "<font color='#B71C1C'>E</font> Oni hovorili: <font color='#B71C1C'>S</font> \"Pane, pozri, tu sú dva meče.\"<br>" +
                            "<font color='#B71C1C'>E</font> On im povedal: <font color='#B71C1C'>+</font> \"Stačí.\"",
                    "V smrteľnej úzkosti sa ešte vrúcnejšie modlil",
                    "<font color='#B71C1C'>E</font> Potom vyšiel von a ako zvyčajne šiel na\u00A0Olivovú horu a učeníci išli za\u00A0ním. Keď prišiel na\u00A0miesto, povedal im: <font color='#B71C1C'>+</font> \"Modlite sa, aby ste neprišli do\u00A0pokušenia!\"<br>" +
                            "<font color='#B71C1C'>E</font> Sám sa od\u00A0nich vzdialil asi toľko, čo by kameňom dohodil, kľakol si a modlil sa: <font color='#B71C1C'>+</font> \"Otče, ak chceš, vezmi odo\u00A0mňa tento kalich! No nie moja, ale tvoja vôľa nech sa stane!\"<br>" +
                            "<font color='#B71C1C'>E</font> Tu sa mu zjavil anjel z\u00A0neba a posilňoval ho. A on sa v\u00A0smrteľnej úzkosti ešte vrúcnejšie modlil, pričom mu pot stekal na\u00A0zem ako kvapky krvi.<br>" +
                            "<font color='#B71C1C'>E</font> Keď vstal od\u00A0modlitby a vrátil sa k\u00A0učeníkom, našiel ich spať od\u00A0zármutku. I povedal im: <font color='#B71C1C'>+</font> \"Čo spíte? Vstaňte, modlite sa, aby ste neprišli do\u00A0pokušenia!\"",
                    "Judáš, bozkom zrádzaš Syna človeka?",
                    "<font color='#B71C1C'>E</font> Kým ešte hovoril, zjavil sa zástup a pred\u00A0nimi išiel jeden z\u00A0Dvanástich, ktorý sa volal Judáš. Priblížil sa k\u00A0Ježišovi, aby ho pobozkal. Ježiš mu však povedal: <font color='#B71C1C'>+</font> \"Judáš, bozkom zrádzaš Syna človeka?\"<br>" +
                            "<font color='#B71C1C'>E</font> Keď tí, čo boli okolo neho, videli, čo sa chystá, povedali: \"Pane, máme udrieť mečom?\" <font color='#B71C1C'>E</font> A jeden z\u00A0nich zasiahol veľkňazovho sluhu a odťal mu pravé ucho.<br>" +
                            "<font color='#B71C1C'>E</font> Ale Ježiš povedal: <font color='#B71C1C'>+</font> \"Nechajte to už!\" <font color='#B71C1C'>E</font> I dotkol sa mu ucha a uzdravil ho.<br>" +
                            "<font color='#B71C1C'>E</font> Potom Ježiš povedal veľkňazom, veliteľom chrámovej stráže a starším, čo prišli za\u00A0ním: <font color='#B71C1C'>+</font> \"Vyšli ste s\u00A0mečmi a kyjmi ako na\u00A0zločinca. Keď som bol deň čo deň s\u00A0vami v\u00A0chráme, nepoložili ste na\u00A0mňa ruky. Ale toto je vaša hodina a moc temna.\"",
                    "Peter vyšiel von a horko sa rozplakal",
                    "<font color='#B71C1C'>E</font> Potom ho zajali, odviedli a zaviedli do\u00A0veľkňazovho domu. Peter šiel zďaleka za\u00A0nimi. Keď uprostred nádvoria rozložili oheň a posadali si okolo neho, Peter si sadol medzi nich. Ako tak sedel pri\u00A0svetle, všimla si ho ktorási slúžka, zahľadela sa naňho a povedala: <font color='#B71C1C'>S</font> \"Aj tento bol s\u00A0ním.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale on ho zaprel: <font color='#B71C1C'>S</font> \"Žena, nepoznám ho.\"<br>" +
                            "<font color='#B71C1C'>E</font> O\u00A0chvíľu si ho všimol iný a povedal: <font color='#B71C1C'>S</font> \"Aj ty si z\u00A0nich.\"<br>" +
                            "<font color='#B71C1C'>E</font> Peter odpovedal: <font color='#B71C1C'>S</font> \"Človeče, nie som.\"<br>" +
                            "<font color='#B71C1C'>E</font> A keď prešla asi hodina, ktosi iný tvrdil: <font color='#B71C1C'>S</font> \"Veru, aj tento bol s\u00A0ním, veď je aj Galilejčan.\"<br>" +
                            "<font color='#B71C1C'>E</font> Peter povedal: <font color='#B71C1C'>S</font> \"Človeče, neviem, čo hovoríš.\" <font color='#B71C1C'>E</font> A vtom, kým ešte hovoril, zaspieval kohút.<br>" +
                            "<font color='#B71C1C'>E</font> Vtedy sa Pán obrátil a pozrel sa na\u00A0Petra a Peter sa rozpamätal na\u00A0Pánovo slovo, ako mu povedal: \"Skôr ako dnes kohút zaspieva, tri razy ma zaprieš.\" Vyšiel von a horko sa rozplakal.",
                    "Prorokuj, hádaj, kto ťa udrel!",
                    "<font color='#B71C1C'>E</font> Muži, ktorí Ježiša strážili, posmievali sa mu a bili ho. Zakryli ho a vypytovali sa ho: <font color='#B71C1C'>S</font> \"Prorokuj, hádaj, kto ťa udrel!\" <font color='#B71C1C'>E</font> A ešte všelijako ináč sa mu rúhali.",
                    "Predviedli ho pred\u00A0svoju radu",
                    "<font color='#B71C1C'>E</font> Keď sa rozodnilo, zišli sa starší ľudu, veľkňazi a zákonníci, predviedli ho pred\u00A0svoju radu a hovorili mu: <font color='#B71C1C'>S</font> \"Ak si Mesiáš, povedz nám to!\"<br>" +
                            "<font color='#B71C1C'>E</font> On im odvetil: <font color='#B71C1C'>S</font> \"Aj keď vám to poviem, neuveríte, a keď sa opýtam, neodpoviete mi. Ale odteraz bude Syn človeka sedieť po\u00A0pravici Božej moci.\"<br>" +
                            "<font color='#B71C1C'>E</font> Tu povedali všetci: <font color='#B71C1C'>S</font> \"Si teda Boží Syn?\"<br>" +
                            "<font color='#B71C1C'>E</font> On im povedal:<font color='#B71C1C'>S</font> \"Vy sami hovoríte, že som.\"<br>" +
                            "<font color='#B71C1C'>E</font> Oni povedali: <font color='#B71C1C'>S</font> \"Načo ešte potrebujeme svedectvo? Veď sme to sami počuli z\u00A0jeho úst!\"",
                    "Ja nenachádzam nijakú vinu na\u00A0tomto človekovi",
                    "<font color='#B71C1C'>E</font> Tu celé zhromaždenie vstalo, odviedli ho k\u00A0Pilátovi a začali naňho žalovať: <font color='#B71C1C'>S</font> \"Tohoto sme pristihli, ako rozvracia náš národ, zakazuje platiť dane cisárovi a tvrdí o\u00A0sebe, že je Mesiáš, kráľ.\"<br>" +
                            "<font color='#B71C1C'>E</font> Pilát sa ho spýtal: <font color='#B71C1C'>S</font> \"Si židovský kráľ?\"<br>" +
                            "<font color='#B71C1C'>E</font> On odpovedal: <font color='#B71C1C'>S</font> \"Sám to hovoríš.\"<br>" +
                            "<font color='#B71C1C'>E</font> Pilát povedal veľkňazom a zástupom:<font color='#B71C1C'>S</font> \"Ja nenachádzam nijakú vinu na\u00A0tomto človekovi.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale oni naliehali:<font color='#B71C1C'>S</font> \"Poburuje ľud a učí po\u00A0celej Judei; počnúc od\u00A0Galiley až sem.\"<br>" +
                            "<font color='#B71C1C'>E</font> Len čo to Pilát počul, opýtal sa, či je ten človek Galilejčan. A keď sa dozvedel, že podlieha Herodesovej právomoci, poslal ho k\u00A0Herodesovi, lebo aj on bol v\u00A0tých dňoch v\u00A0Jeruzaleme.",
                    "Herodes so\u00A0svojimi vojakmi ním opovrhol",
                    "<font color='#B71C1C'>E</font> Keď Herodes uvidel Ježiša, veľmi sa zaradoval. Už dávno ho túžil vidieť, lebo o\u00A0ňom počul, a dúfal, že ho uvidí urobiť nejaký zázrak. Mnoho sa ho vypytoval, ale on mu na\u00A0nič neodpovedal.<br>" +
                            "<font color='#B71C1C'>E</font> Stáli tam aj veľkňazi a zákonníci a nástojčivo naň žalovali. Ale Herodes so\u00A0svojimi vojakmi ním opovrhol, urobil si z\u00A0neho posmech, dal ho obliecť do\u00A0bielych šiat a poslal ho nazad k\u00A0Pilátovi. V\u00A0ten deň sa Herodes a Pilát spriatelili, lebo predtým žili v\u00A0nepriateľstve.",
                    "Pilát vydal Ježiša ich zvoli",
                    "<font color='#B71C1C'>E</font> Pilát zvolal veľkňazov, predstavených a ľud a povedal im: <font color='#B71C1C'>S</font> \"Priviedli ste mi tohoto človeka, že poburuje ľud. Ja som ho pred\u00A0vami vypočúval a nenašiel som na\u00A0tomto človekovi nič z\u00A0toho, čo na\u00A0neho žalujete. Ale ani Herodes, lebo nám ho poslal späť. Vidíte, že neurobil nič, za\u00A0čo by si zasluhoval smrť. Potrescem ho teda a prepustím.\"<br>" +
                            "<font color='#B71C1C'>E</font> Tu celý dav skríkol: <font color='#B71C1C'>S</font> \"Preč s\u00A0ním a prepusť nám Barabáša!\" <font color='#B71C1C'>E</font> Ten bol uväznený pre\u00A0akúsi vzburu v\u00A0meste a pre\u00A0vraždu.<br>" +
                            "<font color='#B71C1C'>E</font> Pilát k\u00A0nim znova prehovoril, lebo chcel Ježiša prepustiť. Ale oni vykrikovali: <font color='#B71C1C'>S</font> \"Ukrižuj! Ukrižuj ho!\"<br>" +
                            "<font color='#B71C1C'>E</font> On k\u00A0nim tretí raz prehovoril: <font color='#B71C1C'>S</font> \"A čo zlé urobil? Nenašiel som na\u00A0ňom nič, za\u00A0čo by si zasluhoval smrť. Potrestám ho teda a prepustím.\" <font color='#B71C1C'>E</font> Ale oni veľkým krikom dorážali a žiadali, aby ho dal ukrižovať. Ich krik sa stupňoval a Pilát sa rozhodol vyhovieť ich žiadosti: prepustil toho, ktorého si žiadali, čo bol uväznený pre\u00A0vzburu a vraždu, kým Ježiša vydal ich zvoli.",
                    "Dcéry jeruzalemské, neplačte nado mnou",
                    "<font color='#B71C1C'>E</font> Ako ho viedli, chytili istého Šimona z\u00A0Cyrény, ktorý sa vracal z\u00A0poľa, a položili naň kríž, aby ho niesol za\u00A0Ježišom.<br>" +
                            "<font color='#B71C1C'>E</font> Šiel za\u00A0ním veľký zástup ľudu aj žien, ktoré nad\u00A0ním kvílili a nariekali. Ježiš sa k\u00A0nim obrátil a povedal: <font color='#B71C1C'>+</font> \"Dcéry jeruzalemské, neplačte nado mnou, ale plačte samy nad\u00A0sebou a nad\u00A0svojimi deťmi. Lebo prichádzajú dni, keď povedia: ‚Blahoslavené neplodné, loná, čo nerodili, a prsia, čo nepridájali!' Vtedy začnú hovoriť vrchom: ‚Padnite na\u00A0nás!' a kopcom: ‚Prikryte nás!' Lebo keď toto robia so\u00A0zeleným stromom, čo sa stane so\u00A0suchým?\"<br>" +
                            "<font color='#B71C1C'>E</font> Vedno s\u00A0ním viedli na\u00A0popravu ešte dvoch zločincov.",
                    "Otče, odpusť im, lebo nevedia, čo robia",
                    "<font color='#B71C1C'>E</font> Keď prišli na\u00A0miesto, ktoré sa volá Lebka, ukrižovali jeho i zločincov: jedného sprava, druhého zľava.<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš povedal: <font color='#B71C1C'>+</font> \"Otče, odpusť im, lebo nevedia, čo robia.\"<br>" +
                            "<font color='#B71C1C'>E</font> Potom hodili lós a rozdelili si jeho šaty.",
                    "Toto je židovský kráľ",
                    "<font color='#B71C1C'>E</font> Ľud tam stál a díval sa. Poprední muži sa mu posmievali a vraveli: <font color='#B71C1C'>S</font> \"Iných zachraňoval, nech zachráni aj seba, ak je Boží Mesiáš, ten vyvolenec.\"<br>" +
                            "<font color='#B71C1C'>E</font> Aj vojaci sa mu posmievali. Chodili k\u00A0nemu, podávali mu ocot a hovorili: <font color='#B71C1C'>S</font> \"Zachráň sa, ak si židovský kráľ!\"<br>" +
                            "<font color='#B71C1C'>E</font> Nad\u00A0ním bol nápis: \"Toto je židovský kráľ.\"",
                    "Dnes budeš so\u00A0mnou v\u00A0raji",
                    "<font color='#B71C1C'>E</font> A jeden zo\u00A0zločincov, čo viseli na\u00A0kríži, sa mu rúhal: <font color='#B71C1C'>S</font> \"Nie si ty Mesiáš?! Zachráň seba i nás!\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale druhý ho zahriakol: <font color='#B71C1C'>S</font> \"Ani ty sa nebojíš Boha, hoci si odsúdený na\u00A0to isté? Lenže my spravodlivo, lebo dostávame, čo sme si skutkami zaslúžili. Ale on neurobil nič zlé.\"<br>" +
                            "<font color='#B71C1C'>E</font> Potom povedal: <font color='#B71C1C'>S</font> \"Ježišu, spomeň si na\u00A0mňa, keď prídeš do\u00A0svojho kráľovstva.\"<br>" +
                            "<font color='#B71C1C'>E</font> On mu odpovedal: <font color='#B71C1C'>+</font> \"Veru, hovorím ti: Dnes budeš so\u00A0mnou v\u00A0raji.\"",
                    "Otče, do\u00A0tvojich rúk porúčam svojho ducha",
                    "<font color='#B71C1C'>E</font> Bolo už okolo dvanástej hodiny a nastala tma po\u00A0celej zemi až do\u00A0tretej hodiny popoludní. Slnko sa zatmelo, chrámová opona sa roztrhla napoly a Ježiš zvolal mocným hlasom: <font color='#B71C1C'>+</font> \"Otče, do\u00A0tvojich rúk porúčam svojho ducha.\" <font color='#B71C1C'>E</font> Po\u00A0tých slovách vydýchol.<br>" +
                            "<font color='#B71C1C'>Pokľakne sa a chvíľku je ticho.</font><br>" +
                            "<font color='#B71C1C'>E</font> Keď stotník videl, čo sa stalo, oslavoval Boha, hovoriac: <font color='#B71C1C'>+</font> \"Tento človek bol naozaj spravodlivý.\" <font color='#B71C1C'>E</font> A celé zástupy tých, čo sa zišli na\u00A0toto divadlo a videli, čo sa deje, bili sa do\u00A0pŕs a vracali sa domov.<br>" +
                            "<font color='#B71C1C'>E</font> Všetci jeho známi stáli obďaleč i ženy, ktoré ho sprevádzali z\u00A0Galiley, a dívali sa na\u00A0to.",
                    "Jozef uložil Ježišovo telo do\u00A0vytesaného hrobu",
                    "<font color='#B71C1C'>E</font> Tu istý muž menom Jozef, člen rady, dobrý a spravodlivý človek z\u00A0judejského mesta Arimatey, ktorý nesúhlasil s\u00A0ich rozhodnutím ani činmi a očakával Božie kráľovstvo, zašiel k\u00A0Pilátovi a poprosil o\u00A0Ježišovo telo. Keď ho sňal, zavinul ho do\u00A0plátna a uložil do\u00A0vytesaného hrobu, v\u00A0ktorom ešte nik neležal. Bol Prípravný deň a už sa začínala sobota.<br>" +
                            "<font color='#B71C1C'>E</font> Odprevádzali ho ženy, ktoré s\u00A0ním prišli z\u00A0Galiley. Pozreli si hrob aj to, ako uložili jeho telo. Potom sa vrátili domov a pripravili si voňavé oleje a masti. Ale v\u00A0sobotu zachovali podľa prikázania pokoj.<br>" +
                            "Počuli sme slovo Pánovo.",
                            "Alebo kratšie:",
                    "Lk 23, 1-49",
                    "Ja nenachádzam nijakú vinu na\u00A0tomto človekovi",
                    "<font color='#B71C1C'>E</font> Tu celé zhromaždenie vstalo, odviedli ho k\u00A0Pilátovi a začali naňho žalovať: <font color='#B71C1C'>S</font> \"Tohoto sme pristihli, ako rozvracia náš národ, zakazuje platiť dane cisárovi a tvrdí o\u00A0sebe, že je Mesiáš, kráľ.\"<br>" +
                            "<font color='#B71C1C'>E</font> Pilát sa ho spýtal: <font color='#B71C1C'>S</font> \"Si židovský kráľ?\"<br>" +
                            "<font color='#B71C1C'>E</font> On odpovedal: <font color='#B71C1C'>+</font> \"Sám to hovoríš.\"<br>" +
                            "<font color='#B71C1C'>E</font> Pilát povedal veľkňazom a zástupom: <font color='#B71C1C'>S</font> \"Ja nenachádzam nijakú vinu na\u00A0tomto človekovi.\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale oni naliehali: <font color='#B71C1C'>S</font> \"Poburuje ľud a učí po\u00A0celej Judei; počnúc od\u00A0Galiley až sem.\"<br>" +
                            "<font color='#B71C1C'>E</font> Len čo to Pilát počul, opýtal sa, či je ten človek Galilejčan. A keď sa dozvedel, že podlieha Herodesovej právomoci, poslal ho k\u00A0Herodesovi, lebo aj on bol v\u00A0tých dňoch v\u00A0Jeruzaleme.",
                    "Herodes so\u00A0svojimi vojakmi ním opovrhol",
                    "<font color='#B71C1C'>E</font> Keď Herodes uvidel Ježiša, veľmi sa zaradoval. Už dávno ho túžil vidieť, lebo o\u00A0ňom počul, a dúfal, že ho uvidí urobiť nejaký zázrak. Mnoho sa ho vypytoval, ale on mu na\u00A0nič neodpovedal.<br>" +
                            "<font color='#B71C1C'>E</font> Stáli tam aj veľkňazi a zákonníci a nástojčivo naň žalovali. Ale Herodes so\u00A0svojimi vojakmi ním opovrhol, urobil si z\u00A0neho posmech, dal ho obliecť do\u00A0bielych šiat a poslal ho nazad k\u00A0Pilátovi. V\u00A0ten deň sa Herodes a Pilát spriatelili, lebo predtým žili v\u00A0nepriateľstve.",
                    "Pilát vydal Ježiša ich zvoli",
                    "<font color='#B71C1C'>E</font> Pilát zvolal veľkňazov, predstavených a ľud a povedal im: <font color='#B71C1C'>S</font> \"Priviedli ste mi tohoto človeka, že poburuje ľud. Ja som ho pred\u00A0vami vypočúval a nenašiel som na\u00A0tomto človekovi nič z\u00A0toho, čo na\u00A0neho žalujete. Ale ani Herodes, lebo nám ho poslal späť. Vidíte, že neurobil nič, za\u00A0čo by si zasluhoval smrť. Potrescem ho teda a prepustím.\"<br>" +
                            "<font color='#B71C1C'>E</font> Tu celý dav skríkol: <font color='#B71C1C'>S</font> \"Preč s\u00A0ním a prepusť nám Barabáša!\" <font color='#B71C1C'>E</font> Ten bol uväznený pre\u00A0akúsi vzburu v\u00A0meste a pre\u00A0vraždu.<br>" +
                            "<font color='#B71C1C'>E</font> Pilát k\u00A0nim znova prehovoril, lebo chcel Ježiša prepustiť. Ale oni vykrikovali: <font color='#B71C1C'>S</font> \"Ukrižuj! Ukrižuj ho!\"<br>" +
                            "<font color='#B71C1C'>E</font> On k\u00A0nim tretí raz prehovoril: <font color='#B71C1C'>S</font> \"A čo zlé urobil? Nenašiel som na\u00A0ňom nič, za\u00A0čo by si zasluhoval smrť. Potrestám ho teda a prepustím.\" <font color='#B71C1C'>E</font> Ale oni veľkým krikom dorážali a žiadali, aby ho dal ukrižovať. Ich krik sa stupňoval a Pilát sa rozhodol vyhovieť ich žiadosti: prepustil toho, ktorého si žiadali, čo bol uväznený pre\u00A0vzburu a vraždu, kým Ježiša vydal ich zvoli.",
                    "Dcéry jeruzalemské, neplačte nado mnou",
                    "<font color='#B71C1C'>E</font> Ako ho viedli, chytili istého Šimona z\u00A0Cyrény, ktorý sa vracal z\u00A0poľa, a položili naň kríž, aby ho niesol za\u00A0Ježišom.<br>" +
                            "<font color='#B71C1C'>E</font> Šiel za\u00A0ním veľký zástup ľudu aj žien, ktoré nad\u00A0ním kvílili a nariekali. Ježiš sa k\u00A0nim obrátil a povedal: <font color='#B71C1C'>+</font> \"Dcéry jeruzalemské, neplačte nado mnou, ale plačte samy nad\u00A0sebou a nad\u00A0svojimi deťmi. Lebo prichádzajú dni, keď povedia: ‚Blahoslavené neplodné, loná, čo nerodili, a prsia, čo nepridájali!' Vtedy začnú hovoriť vrchom: ‚Padnite na\u00A0nás!' a kopcom: ‚Prikryte nás!' Lebo keď toto robia so\u00A0zeleným stromom, čo sa stane so\u00A0suchým?\"<br>" +
                            "<font color='#B71C1C'>E</font> Vedno s\u00A0ním viedli na\u00A0popravu ešte dvoch zločincov.",
                    "Otče, odpusť im, lebo nevedia, čo robia",
                    "<font color='#B71C1C'>E</font> Keď prišli na\u00A0miesto, ktoré sa volá Lebka, ukrižovali jeho i zločincov: jedného sprava, druhého zľava.<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš povedal: <font color='#B71C1C'>+</font> \"Otče, odpusť im, lebo nevedia, čo robia.\"<br>" +
                            "<font color='#B71C1C'>E</font> Potom hodili lós a rozdelili si jeho šaty.",
                    "Toto je židovský kráľ",
                    "<font color='#B71C1C'>E</font> Ľud tam stál a díval sa. Poprední muži sa mu posmievali a vraveli: <font color='#B71C1C'>S</font> \"Iných zachraňoval, nech zachráni aj seba, ak je Boží Mesiáš, ten vyvolenec.\"<br>" +
                            "<font color='#B71C1C'>E</font> Aj vojaci sa mu posmievali. Chodili k\u00A0nemu, podávali mu ocot a hovorili: <font color='#B71C1C'>S</font> \"Zachráň sa, ak si židovský kráľ!\"<br>" +
                            "<font color='#B71C1C'>E</font> Nad\u00A0ním bol nápis: \"Toto je židovský kráľ.\"",
                    "Dnes budeš so\u00A0mnou v\u00A0raji",
                    "<font color='#B71C1C'>E</font> A jeden zo\u00A0zločincov, čo viseli na\u00A0kríži, sa mu rúhal: <font color='#B71C1C'>S</font> \"Nie si ty Mesiáš?! Zachráň seba i nás!\"<br>" +
                            "<font color='#B71C1C'>E</font> Ale druhý ho zahriakol: <font color='#B71C1C'>S</font> \"Ani ty sa nebojíš Boha, hoci si odsúdený na\u00A0to isté? Lenže my spravodlivo, lebo dostávame, čo sme si skutkami zaslúžili. Ale on neurobil nič zlé.\"<br>" +
                            "<font color='#B71C1C'>E</font> Potom povedal: <font color='#B71C1C'>S</font> \"Ježišu, spomeň si na\u00A0mňa, keď prídeš do\u00A0svojho kráľovstva.\"<br>" +
                            "<font color='#B71C1C'>E</font> On mu odpovedal: <font color='#B71C1C'>+</font> \"Veru, hovorím ti: Dnes budeš so\u00A0mnou v\u00A0raji.\"",
                    "Otče, do\u00A0tvojich rúk porúčam svojho ducha",
                    "<font color='#B71C1C'>E</font> Bolo už okolo dvanástej hodiny a nastala tma po\u00A0celej zemi až do\u00A0tretej hodiny popoludní. Slnko sa zatmelo, chrámová opona sa roztrhla napoly a Ježiš zvolal mocným hlasom: <font color='#B71C1C'>+</font> \"Otče, do\u00A0tvojich rúk porúčam svojho ducha.\" <font color='#B71C1C'>E</font> Po\u00A0tých slovách vydýchol.<br>" +
                            "<font color='#B71C1C'>Pokľakne sa a chvíľku je ticho.</font><br>" +
                            "<font color='#B71C1C'>E</font> Keď stotník videl, čo sa stalo, oslavoval Boha, hovoriac: <font color='#B71C1C'>S</font> \"Tento človek bol naozaj spravodlivý.\" <font color='#B71C1C'>E</font> A celé zástupy tých, čo sa zišli na\u00A0toto divadlo a videli, čo sa deje, bili sa do\u00A0pŕs a vracali sa domov.<br>" +
                            "<font color='#B71C1C'>E</font> Všetci jeho známi stáli obďaleč i ženy, ktoré ho sprevádzali z\u00A0Galiley, a dívali sa na\u00A0to.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"61", "1", "", "Jn 12, 1-11",
                    "Nechaj ju, nech to zachová na\u00A0deň môjho pohrebu!",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Šesť dní pred\u00A0Veľkou nocou prišiel Ježiš do\u00A0Betánie, kde býval Lazár, ktorého vzkriesil z\u00A0mŕtvych. Pripravili mu tam hostinu. Marta obsluhovala a Lazár bol jedným z\u00A0tých, čo s\u00A0ním stolovali.<br>" +
                            "Mária vzala libru pravého vzácneho nardového oleja, pomazala ním Ježišove nohy a poutierala mu ich svojimi vlasmi; a dom sa naplnil vôňou oleja.<br>" +
                            "Tu jeden z\u00A0jeho učeníkov, Judáš Iškariotský, ktorý ho mal zradiť, povedal: \"Prečo nepredali tento olej za\u00A0tristo denárov a nerozdali ich chudobným?\" Lenže to nepovedal preto, že mu šlo o\u00A0chudobných, ale že bol zlodej. Mal mešec a nosil to, čo doň vkladali.<br>" +
                            "Ježiš povedal: \"Nechaj ju, nech to zachová na\u00A0deň môjho pohrebu! Veď chudobných máte vždy medzi sebou, ale mňa nemáte vždy.\"<br>" +
                            "Veľké množstvo Židov sa dozvedelo, že je tam, a prišli nielen kvôli Ježišovi, ale aby videli aj Lazára, ktorého vzkriesil z\u00A0mŕtvych. A veľkňazi sa rozhodli, že zabijú aj Lazára, lebo preň mnohí Židia odchádzali a uverili v\u00A0Ježiša.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"62", "2", "", "Jn 13, 21-33. 36-38",
                    "Jeden z\u00A0vás ma zradí. Nezaspieva kohút, kým ma tri razy nezaprieš",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Keď Ježiš sedel za\u00A0stolom so\u00A0svojimi učeníkmi, zachvel sa v\u00A0duchu a vyhlásil: \"Veru, veru, hovorím vám: Jeden z\u00A0vás ma zradí.\"<br>" +
                            "Učeníci sa pozerali jeden na\u00A0druhého v\u00A0rozpakoch, o\u00A0kom to hovorí.<br>" +
                            "Jeden z\u00A0jeho učeníkov, ten, ktorého Ježiš miloval, bol celkom pri\u00A0Ježišovej hrudi. Jemu dal Šimon Peter znak, aby sa opýtal: \"Kto je to, o\u00A0kom hovorí?\" On sa naklonil k\u00A0Ježišovej hrudi a spýtal sa: \"Pane, kto je to?\"<br>" +
                            "Ježiš odpovedal: \"Ten, komu podám namočenú smidku.\" Namočil smidku chleba a dal ju Judášovi, synovi Šimona Iškariotského. A hneď po\u00A0tejto smidke vošiel do\u00A0neho satan.<br>" +
                            "Ježiš mu povedal: \"Čo chceš urobiť, urob čo najskôr.\" Ale nik zo\u00A0stolujúcich nerozumel, prečo mu to povedal. Judáš mal mešec, preto si niektorí mysleli, že mu Ježiš povedal: \"Nakúp, čo budeme potrebovať na\u00A0sviatky,\" alebo aby dal niečo chudobným. On vzal smidku a hneď vyšiel von. A bola noc.<br>" +
                            "Keď vyšiel, Ježiš povedal: \"Teraz je Syn človeka oslávený a v\u00A0ňom je oslávený Boh. A keď je Boh oslávený v\u00A0ňom, aj Boh jeho v\u00A0sebe oslávi, a čoskoro ho oslávi. Deti moje, ešte chvíľku som s\u00A0vami. Budete ma hľadať, ale ako som povedal Židom, aj vám teraz hovorím: Kam ja idem, tam vy prísť nemôžete.\"<br>" +
                            "Šimon Peter sa ho opýtal: \"Pane, kam ideš?\"<br>" +
                            "Ježiš odvetil: \"Kam ja idem, tam teraz za\u00A0mnou ísť nemôžeš, no pôjdeš za\u00A0mnou neskôr.\"<br>" +
                            "Peter mu vravel: \"Pane, prečo nemôžem ísť za\u00A0tebou teraz? Aj život položím za\u00A0teba.\"<br>" +
                            "Ježiš odpovedal: \"Aj život položíš za\u00A0mňa? Veru, veru, hovorím ti: Nezaspieva kohút, kým ma tri razy nezaprieš.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"63", "3", "", "Mt 26, 14-25",
                    "Syn človeka ide, ako je o\u00A0ňom napísané, ale beda tomu, kto ho zrádza",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Jeden z\u00A0Dvanástich volal sa Judáš Iškariotský odišiel k\u00A0veľkňazom a vyzvedal sa: \"Čo mi dáte a ja vám ho vydám?\" Oni mu určili tridsať strieborných. A od\u00A0tej chvíle hľadal príležitosť vydať ho.<br>" +
                            "V prvý deň sviatkov Nekvasených chlebov prišli k\u00A0Ježišovi učeníci a pýtali sa ho: \"Kde ti máme pripraviť veľkonočnú večeru?\"<br>" +
                            "On povedal: \"Choďte do\u00A0mesta k\u00A0istému človekovi a povedzte mu: Učiteľ odkazuje: Môj čas je blízko, u\u00A0teba budem jesť so\u00A0svojimi učeníkmi veľkonočného baránka.\" Učeníci urobili, ako im Ježiš rozkázal, a pripravili veľkonočného baránka.<br>" +
                            "Keď sa zvečerilo, zasadol s\u00A0Dvanástimi za\u00A0stôl. A keď jedli, povedal: \"Veru, hovorím vám: Jeden z\u00A0vás ma zradí.\"<br>" +
                            "Veľmi osmutneli a začali sa ho jeden po\u00A0druhom vypytovať: \"Som to ja, Pane?\"<br>" +
                            "On odpovedal: \"Kto so\u00A0mnou namáča ruku v\u00A0mise, ten ma zradí. Syn človeka síce ide, ako je o\u00A0ňom napísané, ale beda človekovi, ktorý zrádza Syna človeka! Pre\u00A0toho človeka by bolo lepšie, keby sa nebol narodil.\"<br>" +
                            "Aj jeho zradca Judáš sa opýtal: \"Som to azda ja, Rabbi?\"<br>" +
                            "Odpovedal mu: \"Sám si to povedal.\"<br>" +
                            "Počuli sme slovo Pánovo."},


            /*Fakultatívne čítania na\u00A03. pôstny týždeň
            {"", "", "", "Jn 4, 5-42",
                    "Prameň vody prúdiacej do\u00A0večného života",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš prišiel do\u00A0samarijského mesta menom Sychar neďaleko pozemku, ktorý dal Jakub svojmu synovi Jozefovi. Tam bola Jakubova studňa. Ježiš unavený z\u00A0cesty sadol si k\u00A0studni. Bolo okolo poludnia.<br>" +
                            "Tu prišla po\u00A0vodu istá Samaritánka. Ježiš jej povedal: \"Daj sa mi napiť!\" Jeho učeníci odišli do\u00A0mesta nakúpiť potravy. Samaritánka mu povedala: \"Ako si môžeš ty, Žid, pýtať vodu odo\u00A0mňa, Samaritánky?\" Židia sa totiž so\u00A0Samaritánmi nestýkajú.<br>" +
                            "Ježiš jej odpovedal: \"Keby si poznala Boží dar a vedela, kto je ten, čo ti hovorí: ‚Daj sa mi napiť,' ty by si poprosila jeho a on by ti dal živú vodu.\"<br>" +
                            "Žena mu povedala: \"Pane, ani vedro nemáš a studňa je hlboká. Odkiaľ máš teda živú vodu? Si azda väčší ako náš otec Jakub, ktorý nám dal túto studňu a pil z\u00A0nej on sám i jeho synovia a jeho stáda?\"<br>" +
                            "Ježiš jej odvetil: \"Každý, kto pije túto vodu, bude znova smädný. Ale kto sa napije z\u00A0vody, ktorú mu ja dám, nebude žízniť naveky. A voda, ktorú mu dám, stane sa v\u00A0ňom prameňom vody prúdiacej do\u00A0večného života.\"<br>" +
                            "Žena mu vravela: \"Pane, daj mi takej vody, aby som už nebola smädná a nemusela sem chodiť čerpať!\"<br>" +
                            "Povedal jej: \"Choď, zavolaj svojho muža a príď sem!\"<br>" +
                            "Žena mu odpovedala: \"Nemám muža.\"<br>" +
                            "Ježiš jej vravel: \"Správne si povedala: ‚Nemám muža,' lebo si mala päť mužov a ten, ktorého máš teraz, nie je tvoj muž. To si povedala pravdu.\"<br>" +
                            "Žena mu vravela: \"Pane, vidím, že si prorok. Naši otcovia sa klaňali Bohu na\u00A0tomto vrchu, a vy hovoríte, že v\u00A0Jeruzaleme je miesto, kde sa treba klaňať.\"<br>" +
                            "Ježiš jej povedal: \"Ver mi, žena, že prichádza hodina, keď sa nebudete klaňať Otcovi ani na\u00A0tomto vrchu, ani v\u00A0Jeruzaleme. Vy sa klaniate tomu, čo nepoznáte; my sa klaniame tomu, čo poznáme, lebo spása je zo\u00A0Židov. Ale prichádza hodina, ba už je tu, keď sa praví ctitelia budú klaňať Otcovi v\u00A0Duchu a pravde. Lebo sám Otec hľadá takých ctiteľov. Boh je Duch a tí, čo sa mu klaňajú, musia sa mu klaňať v\u00A0Duchu a pravde.\"<br>" +
                            "Žena mu vravela: \"Viem, že príde Mesiáš, zvaný Kristus. Až príde on, zvestuje nám všetko.\" Ježiš jej povedal: \"To som ja, čo sa rozprávam s\u00A0tebou.\" Vtom prišli jeho učeníci a divili sa, že sa rozpráva so\u00A0ženou. Ale nik nepovedal: \"Čo sa jej pýtaš?\" Alebo: \"Prečo sa s\u00A0ňou rozprávaš?\"<br>" +
                            "Žena nechala svoj džbán, odišla do\u00A0mesta a vravela ľuďom: \"Poďte sa pozrieť na\u00A0človeka, ktorý mi povedal všetko, čo som porobila! Nebude to Mesiáš?\"<br>" +
                            "Vyšli teda z\u00A0mesta a šli k\u00A0nemu.<br>" +
                            "Medzitým ho učeníci prosili: \"Rabbi, jedz!\"<br>" +
                            "On im povedal: \"Ja mám jesť pokrm, ktorý vy nepoznáte.\"<br>" +
                            "Učeníci si hovorili medzi sebou: \"Vari mu niekto priniesol jesť?\"<br>" +
                            "Ježiš im povedal: \"Mojím pokrmom je plniť vôľu toho, ktorý ma poslal, a dokonať jeho dielo. Nevravíte aj vy: ‚Ešte štyri mesiace a bude žatva?' Hľa, hovorím vám: Zdvihnite oči a pozrite sa na\u00A0polia, že sú už biele na\u00A0žatvu! Žnec už dostáva odmenu a zbiera úrodu pre\u00A0večný život, aby sa spoločne tešili aj rozsievač, aj žnec. Tu sa potvrdzuje príslovie: Jeden rozsieva a druhý žne. Ja som vás poslal žať to, na\u00A0čom ste nepracovali. Pracovali iní a vy ste vstúpili do\u00A0ich práce.\"<br>" +
                            "Mnoho Samaritánov z\u00A0toho mesta uverilo v\u00A0neho pre\u00A0slovo ženy, ktorá svedčila: \"Povedal mi všetko, čo som porobila.\"<br>" +
                            "Keď Samaritáni prišli k\u00A0nemu, prosili ho, aby u\u00A0nich zostal. I zostal tam dva dni. A ešte oveľa viac ich uverilo pre\u00A0jeho slovo. A žene povedali: \"Už veríme nielen pre\u00A0tvoje slovo, ale sami sme počuli a vieme, že toto je naozaj Spasiteľ sveta.\"<br>" +
                            "Počuli sme slovo Pánovo."},

            Fakultatívne čítania na\u00A04. pôstny týždeň
            {"", "", "", "Jn 9, 1-41",
                    "Šiel, umyl sa a vrátil sa vidiaci",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ako Ježiš šiel, videl človeka, ktorý bol od\u00A0narodenia slepý. Jeho učeníci sa ho spýtali: \"Rabbi, kto zhrešil – on, alebo jeho rodičia –, že sa narodil slepý?\"<br>" +
                            "Ježiš odpovedal: \"Nezhrešil ani on ani jeho rodičia, ale majú sa na\u00A0ňom zjaviť Božie skutky. Musíme konať skutky toho, ktorý ma poslal, dokiaľ je deň. Ide noc, keď nik nebude môcť pracovať. Kým som na\u00A0svete, som, svetlo sveta.\"<br>" +
                            "Keď to povedal, napľul na\u00A0zem, urobil zo\u00A0sliny blato, blatom mu potrel oči a povedal mu: \"Choď, umy sa v\u00A0rybníku Siloe,\" čo v\u00A0preklade znamená: Poslaný. On šiel, umyl sa a vrátil sa vidiaci.<br>" +
                            "Susedia a tí, čo ho predtým vídali žobrať, hovorili: \"Nie je to ten, čo tu sedával a žobral?\"<br>" +
                            "Jedni tvrdili: \"Je to on.\" Iní zasa: \"Nie je, len sa mu podobá.\" On vravel: \"Ja som to.\"<br>" +
                            "Pýtali sa ho teda: \"Ako to, že sa ti otvorili oči?\"<br>" +
                            "On odpovedal: \"Človek, ktorý sa volá Ježiš, urobil blato, potrel mi oči a povedal mi: ‚Choď k\u00A0Siloe a umy sa!' Šiel som teda, umyl som sa a vidím.\"<br>" +
                            "Pýtali sa ho: \"Kde je ten človek?\"<br>" +
                            "Odpovedal: \"Neviem.\"<br>" +
                            "Zaviedli ho, toho, čo bol predtým slepý, k\u00A0farizejom. Ale v\u00A0ten deň, keď Ježiš urobil blato a otvoril mu oči, bola práve sobota. Preto sa ho aj farizeji pýtali, ako to, že vidí. On im povedal: \"Priložil mi na\u00A0oči blato, umyl som sa a vidím.\"<br>" +
                            "Niektorí farizeji hovorili: \"Ten človek nie je od\u00A0Boha, lebo nezachováva sobotu.\"<br>" +
                            "Iní vraveli: \"Ako môže hriešny človek robiť takéto znamenia?\" A rozštiepili sa.<br>" +
                            "Znova sa teda pýtali slepého: \"Čo hovoríš o\u00A0ňom ty? Veď tebe otvoril oči!?\"<br>" +
                            "On odpovedal: \"Je prorok.\"<br>" +
                            "Židia však neverili, že bol slepý a teraz vidí, kým si nezavolali jeho rodičov. Opýtali sa ich: \"Je to váš syn? A hovoríte, že sa narodil slepý? Ako to, že teraz vidí?\"<br>" +
                            "Rodičia odpovedali: \"Vieme, že je to náš syn a že sa narodil slepý. Ale ako to, že teraz vidí, to nevieme, ani nevieme, kto mu otvoril oči. Jeho sa spýtajte. Má svoje roky, nech hovorí sám za\u00A0seba.\" Jeho rodičia hovorili tak preto, že sa báli Židov. Židia sa už totiž uzniesli, že každý, kto by ho uznal za\u00A0Mesiáša, má byť vylúčený zo\u00A0synagógy. Preto jeho rodičia povedali: \"Má svoje roky, jeho sa spýtajte.\"<br>" +
                            "Znovu teda zavolali človeka, čo bol predtým slepý, a povedali mu: \"Vzdaj Bohu slávu! My vieme, že ten človek je hriešnik.\"<br>" +
                            "On odvetil: \"Či je hriešnik, neviem. Ale jedno viem: že som bol slepý a teraz vidím.\"<br>" +
                            "Spýtali sa ho teda: \"Čo urobil s\u00A0tebou? Ako ti otvoril oči?\"<br>" +
                            "Odpovedal im: \"Už som vám povedal, a nepočuli ste. Prečo to chcete počuť znova? Chcete sa aj vy stať jeho učeníkmi?\"<br>" +
                            "Vynadali mu a povedali: \"Ty si jeho učeník, my sme Mojžišovi učeníci. My vieme, že Mojžišovi hovoril Boh, a o\u00A0tomto nevieme ani to, odkiaľ je.\"<br>" +
                            "Ten človek im odpovedal: \"Práve to je čudné, že vy neviete, odkiaľ je, a mne otvoril oči. Vieme, že hriešnikov Boh nevyslyší; ale vyslyší toho, kto si Boha ctí a plní jeho vôľu. Od\u00A0vekov nebolo počuť, že by bol niekto otvoril oči slepému od\u00A0narodenia. Keby on nebol od\u00A0Boha, nemohol by nič také urobiť.\"<br>" +
                            "Povedali mu: \"Celý si sa v\u00A0hriechoch narodil a nás poúčaš?!\" A vyhnali ho von.<br>" +
                            "Ježiš sa dopočul, že ho vyhnali, vyhľadal ho a povedal mu: \"Ty veríš v\u00A0Syna človeka?\"<br>" +
                            "On vravel: \"A kto je to, Pane, aby som v\u00A0neho uveril?\"<br>" +
                            "Ježiš mu povedal: \"Už si ho videl a je to ten, čo sa rozpráva s\u00A0tebou.\"<br>" +
                            "On povedal: \"Verím, Pane,\" a klaňal sa mu.<br>" +
                            "Ježiš povedal: \"Súdiť som prišiel na\u00A0tento svet: aby tí, čo nevidia, videli, a tí, čo vidia, aby oslepli.\"<br>" +
                            "Začuli to farizeji, čo boli pri\u00A0ňom, a povedali mu: \"Sme azda aj my slepí?!\"<br>" +
                            "Ježiš im odpovedal: \"Keby ste boli slepí, nemali by ste hriech. Vy však hovoríte: ‚Vidíme.' A tak váš hriech ostáva.\"<br>" +
                            "Počuli sme slovo Pánovo."},

            Fakultatívne čítania na\u00A05. pôstny týždeň
            {"", "", "", "Jn 11, 1-45",
                    "Ja som vzkriesenie a život",
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Bol chorý istý Lazár z\u00A0Betánie, z\u00A0dediny Márie a jej sestry Marty. Bola to tá Mária, čo pomazala Pána voňavým olejom a poutierala mu nohy svojimi vlasmi. Jej brat Lazár bol chorý. Preto mu sestry poslali odkaz: \"Pane, ten, ktorého miluješ, je chorý.\"<br>" +
                            "Keď to Ježiš počul, povedal: \"Táto choroba nie je na\u00A0smrť, ale na\u00A0Božiu slávu, aby ňou bol oslávený Boží Syn.\"<br>" +
                            "Ježiš mal rád Martu i jej sestru a Lazára. Keď teda počul, že je chorý, zostal ešte dva dni na\u00A0mieste, kde bol. Až potom povedal učeníkom: \"Poďme znova do\u00A0Judey.\"<br>" +
                            "Učeníci mu vraveli: \"Rabbi, len nedávno ťa Židia chceli ukameňovať a zasa ta ideš?!\"<br>" +
                            "Ježiš odpovedal: \"Nemá deň dvanásť hodín? Kto chodí vo\u00A0dne, nepotkne sa, lebo vidí svetlo tohoto sveta. Ale kto chodí v\u00A0noci, potkne sa, lebo v\u00A0ňom nieto svetla.\"<br>" +
                            "Toto povedal a dodal: \"Náš priateľ Lazár spí, ale idem ho zobudiť.\"<br>" +
                            "Učeníci mu povedali: \"Pane, ak spí, ozdravie.\" Ježiš však hovoril o\u00A0jeho smrti, a oni si mysleli, že hovorí o\u00A0spánku.<br>" +
                            "Vtedy im Ježiš povedal otvorene: \"Lazár zomrel. A kvôli vám sa radujem, že som tam nebol, aby ste uverili. Poďme k\u00A0nemu!\"<br>" +
                            "Tomáš, nazývaný Didymus, povedal ostatným učeníkom: \"Poďme aj my a umrime s\u00A0ním.\"<br>" +
                            "Keď ta Ježiš prišiel, dozvedel sa, že Lazár je už štyri dni v\u00A0hrobe. Betánia bola pri\u00A0Jeruzaleme, vzdialená asi pätnásť stadií, a tak prišlo k\u00A0Marte a Márii veľa Židov potešiť ich v\u00A0žiali za\u00A0bratom.<br>" +
                            "Keď Marta počula, že prichádza Ježiš, išla mu naproti. Mária zostala doma. Marta povedala Ježišovi: \"Pane, keby si bol býval tu, môj brat by nebol umrel. Ale aj teraz viem, že o\u00A0čokoľvek poprosíš Boha, Boh ti to dá.\"<br>" +
                            "Ježiš jej povedal: \"Tvoj brat vstane z\u00A0mŕtvych.\"<br>" +
                            "Marta mu vravela: \"Viem, že vstane v\u00A0posledný deň pri\u00A0vzkriesení.\"<br>" +
                            "Ježiš jej povedal: \"Ja som vzkriesenie a život. Kto verí vo\u00A0mňa, bude žiť, aj keď umrie. A nik, kto žije a verí vo\u00A0mňa, neumrie naveky. Veríš tomu?\"<br>" +
                            "Povedala mu: \"Áno, Pane, ja som uverila, že ty si Mesiáš, Boží Syn, ktorý mal prísť na\u00A0svet.\"<br>" +
                            "Ako to povedala, odišla, zavolala svoju sestru Máriu a potichu jej vravela: \"Učiteľ je tu a volá ťa.\" Len čo to ona počula, vstala a šla k\u00A0nemu. Ježiš totiž ešte nevošiel do\u00A0dediny, ale bol stále na\u00A0mieste, kde mu Marta vyšla naproti. Keď Židia, čo boli s\u00A0ňou v\u00A0dome a potešovali ju, videli, že Mária rýchlo vstala a vyšla von, pobrali sa za\u00A0ňou, lebo si mysleli: \"Ide sa vyplakať k\u00A0hrobu.\"<br>" +
                            "Keď Mária prišla ta, kde bol Ježiš, a zazrela ho, padla mu k\u00A0nohám a povedala mu: \"Pane, keby si bol býval tu, môj brat by nebol umrel.\"<br>" +
                            "Keď Ježiš videl, ako plače a ako plačú aj Židia, čo s\u00A0ňou prišli, zachvel sa v\u00A0duchu a vzrušený sa opýtal: \"Kde ste ho uložili?\"<br>" +
                            "Povedali mu: \"Pane, poď sa pozrieť!\" A Ježiš zaslzil.<br>" +
                            "Židia povedali: \"Hľa, ako ho miloval!\"<br>" +
                            "No niektorí z\u00A0nich hovorili: \"A nemohol ten, čo otvoril oči slepému, urobiť, aby tento nezomrel?!\"<br>" +
                            "Ježiš sa znova zachvel a pristúpil k\u00A0hrobu. Bola to jaskyňa uzavretá kameňom.<br>" +
                            "Ježiš povedal: \"Odvaľte kameň!\"<br>" +
                            "Marta, sestra mŕtveho, mu povedala: \"Pane, už páchne, veď je už štyri dni v\u00A0hrobe.\"<br>" +
                            "Ježiš jej vravel: \"Nepovedal som ti, že ak uveríš, uvidíš Božiu slávu?\"<br>" +
                            "Odvalili teda kameň. Ježiš pozdvihol oči k\u00A0nebu a povedal: \"Otče, ďakujem ti, že si ma vypočul. A ja som vedel, že ma vždy počuješ, ale hovorím to kvôli ľudu, čo tu stojí, aby uverili, že si ma ty poslal.\"<br>" +
                            "Keď to povedal, zvolal veľkým hlasom: \"Lazár, poď von!\" A mŕtvy vyšiel. Nohy a ruky mal ovinuté plátnom a tvár obviazanú šatkou.<br>" +
                            "Ježiš im povedal: \"Porozväzujte ho a nechajte ho odísť!\"<br>" +
                            "Mnohí z\u00A0tých Židov, čo prišli k\u00A0Márii a videli, čo urobil, uverili v\u00A0neho.<br>" +
                            "Počuli sme slovo Pánovo."},*/
    };
}
