package sk.missa.interfaces;

/*
 * Čítania vo\u00A0veľkonočnom období uložené v\u00A0troch dvojrozmerných poliach: velkanocCitanie1, velkanocCitanie2, velkanocEvanjelium
 * nedeľa: {týždeň vo\u00A0veľkonočnom období+deň, liturgický rok (A/B/C), "", súradnice, citát, text},
 * deň v\u00A0týždni: {týždeň vo\u00A0veľkonočnom období+deň (napr. 2 týždeň v\u00A0pondelok - 21), deň v\u00A0týždni (1-pondelok, 2-utorok..., 6-sobota), "", súradnice, citát, text},
 * čítanie, ktoré obsahuje alebo: {týždeň vo\u00A0veľkonočnom období+deň, deň v\u00A0týždni (1-pondelok, 2-utorok..., 6-sobota, "", súradnice, citát, text, "Alebo:", súradnice, citát, text...},
 * */


public interface Citania_velkanoc {
    String[][] velkanocCitanie1 = {
            {"10", "A", "", "Sk 10, 34a. 37-43",
                    "Po jeho zmŕtvychvstaní sme s\u00A0ním jedli a pili",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Peter otvoril ústa a povedal: \"Vy viete, čo sa počnúc od\u00A0Galiley po\u00A0krste, ktorý hlásal Ján, dialo po\u00A0celej Judei; ako Boh pomazal Ježiša z\u00A0Nazareta Duchom Svätým a mocou a on chodil, dobre robil a uzdravoval všetkých posadnutých diablom, lebo bol s\u00A0ním Boh. A my sme svedkami všetkého, čo urobil v\u00A0judejskej krajine i v\u00A0Jeruzaleme.<br>" +
                            "Ale zavesili ho na\u00A0drevo a zabili. Boh ho tretieho dňa vzkriesil a dal mu, aby sa zjavil nie všetkému ľudu, ale svedkom, ktorých Boh vopred určil, nám, čo sme s\u00A0ním po\u00A0jeho zmŕtvychvstaní jedli a pili.<br>" +
                            "A prikázal nám, aby sme ľudu hlásali a dosvedčovali, že to jeho Boh ustanovil za\u00A0sudcu živých i mŕtvych. Jemu vydávajú všetci proroci svedectvo, že pre\u00A0jeho meno dosiahne odpustenie hriechov každý, kto v\u00A0neho verí.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "B", "", "Sk 10, 34a. 37-43",
                    "Po jeho zmŕtvychvstaní sme s\u00A0ním jedli a pili",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Peter otvoril ústa a povedal: \"Vy viete, čo sa počnúc od\u00A0Galiley po\u00A0krste, ktorý hlásal Ján, dialo po\u00A0celej Judei; ako Boh pomazal Ježiša z\u00A0Nazareta Duchom Svätým a mocou a on chodil, dobre robil a uzdravoval všetkých posadnutých diablom, lebo bol s\u00A0ním Boh. A my sme svedkami všetkého, čo urobil v\u00A0judejskej krajine i v\u00A0Jeruzaleme.<br>" +
                            "Ale zavesili ho na\u00A0drevo a zabili. Boh ho tretieho dňa vzkriesil a dal mu, aby sa zjavil nie všetkému ľudu, ale svedkom, ktorých Boh vopred určil, nám, čo sme s\u00A0ním po\u00A0jeho zmŕtvychvstaní jedli a pili.<br>" +
                            "A prikázal nám, aby sme ľudu hlásali a dosvedčovali, že to jeho Boh ustanovil za\u00A0sudcu živých i mŕtvych. Jemu vydávajú všetci proroci svedectvo, že pre\u00A0jeho meno dosiahne odpustenie hriechov každý, kto v\u00A0neho verí.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "C", "", "Sk 10, 34a. 37-43",
                    "Po jeho zmŕtvychvstaní sme s\u00A0ním jedli a pili",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Peter otvoril ústa a povedal: \"Vy viete, čo sa počnúc od\u00A0Galiley po\u00A0krste, ktorý hlásal Ján, dialo po\u00A0celej Judei; ako Boh pomazal Ježiša z\u00A0Nazareta Duchom Svätým a mocou a on chodil, dobre robil a uzdravoval všetkých posadnutých diablom, lebo bol s\u00A0ním Boh. A my sme svedkami všetkého, čo urobil v\u00A0judejskej krajine i v\u00A0Jeruzaleme.<br>" +
                            "Ale zavesili ho na\u00A0drevo a zabili. Boh ho tretieho dňa vzkriesil a dal mu, aby sa zjavil nie všetkému ľudu, ale svedkom, ktorých Boh vopred určil, nám, čo sme s\u00A0ním po\u00A0jeho zmŕtvychvstaní jedli a pili.<br>" +
                            "A prikázal nám, aby sme ľudu hlásali a dosvedčovali, že to jeho Boh ustanovil za\u00A0sudcu živých i mŕtvych. Jemu vydávajú všetci proroci svedectvo, že pre\u00A0jeho meno dosiahne odpustenie hriechov každý, kto v\u00A0neho verí.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"11", "1", "", "Sk 2, 14. 22-33",
                    "Tohoto Ježiša Boh vzkriesil a my všetci sme toho svedkami",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "V deň Turíc vystúpil Peter s\u00A0Jedenástimi a zvýšeným hlasom povedal: \"Mužovia judejskí a všetci, čo bývate v\u00A0Jeruzaleme, aby vám toto bolo známe, počúvajte moje slová.<br>" +
                            "Boh u\u00A0vás potvrdil muža, Ježiša Nazaretského, mocnými činmi, divmi a znameniami, ktoré, ako sami viete, Boh skrze neho medzi vami urobil. A vy ste ho, vydaného podľa presného Božieho zámeru a predvídania, rukami bezbožníkov pribili na\u00A0kríž a zavraždili.<br>" +
                            "Ale Boh ho vzkriesil a zbavil múk smrti, lebo ho nemohla držať vo\u00A0svojej moci. Veď Dávid o\u00A0ňom hovorí: ‚Pána mám vždy pred\u00A0očami, lebo je po\u00A0mojej pravici, aby som sa nezakolísal. Preto sa raduje moje srdce a môj jazyk plesá, aj moje telo odpočíva v\u00A0nádeji. Lebo nenecháš moju dušu v\u00A0podsvetí a nedovolíš, aby tvoj Svätý videl porušenie. Ukázal si mi cestu života, naplníš ma radosťou pred\u00A0svojou tvárou.'<br>" +
                            "Bratia, dovoľte mi otvorene vám povedať o\u00A0praotcovi Dávidovi, že zomrel, pochovali ho a jeho hrob je u\u00A0nás až do\u00A0dnešného dňa.<br>" +
                            "Ale on bol prorok a vedel, že Boh sa mu prísahou zaviazal posadiť potomka z\u00A0jeho bedier na\u00A0jeho trón; videl do\u00A0budúcnosti a povedal o\u00A0Kristovom vzkriesení, že ani nebol ponechaný v\u00A0podsvetí, ani jeho telo nevidelo porušenie.<br>" +
                            "Tohoto Ježiša Boh vzkriesil a my všetci sme toho svedkami. Božia pravica ho povýšila a keď od\u00A0Otca dostal prisľúbeného Ducha Svätého, vylial ho, ako sami vidíte a počujete.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"12", "2", "", "Sk 2, 36-41",
                    "Robte pokánie a nech sa dá každý z\u00A0vás pokrstiť v\u00A0mene Ježiša",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "V deň Turíc povedal Peter Židom: \"Nech teda s\u00A0istotou vie celý dom Izraela, že toho Ježiša, ktorého ste vy ukrižovali, Boh urobil aj Pánom aj Mesiášom.\"<br>" +
                            "Keď to počuli, bolesť im prenikla srdce a povedali Petrovi a ostatným apoštolom: \"Čo máme robiť bratia?\"<br>" +
                            "Peter im povedal: \"Robte pokánie a nech sa dá každý z\u00A0vás pokrstiť v\u00A0mene Ježiša Krista na\u00A0odpustenie svojich hriechov a dostanete dar Svätého Ducha. Veď to prisľúbenie patrí vám a vašim deťom i všetkým, čo sú ďaleko, všetkým, ktorých si povolá Pán, náš Boh.\"<br>" +
                            "A ešte mnohými inými slovami ich zaprisahával a povzbudzoval: \"Zachráňte sa z\u00A0tohoto zvrhlého pokolenia!\"<br>" +
                            "Oni prijali jeho slovo a dali sa pokrstiť; a v\u00A0ten deň sa pridalo asi tritisíc duší.<br>" +
                            "Počuli sme Božie slovo."},
            {"13", "3", "", "Sk 3, 1-10",
                    "Čo mám, to ti dám: V mene Ježiša Krista Nazaretského vstaň a choď!",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Peter a Ján vystupovali o\u00A0tretej hodine do\u00A0chrámu na\u00A0popoludňajšiu modlitbu.<br>" +
                            "Práve prinášali istého muža, ktorý bol od\u00A0narodenia chromý. Denne ho kládli k\u00A0chrámovej bráne, ktorá sa volá Krásna, aby si pýtal almužnu od\u00A0tých, čo vchádzali do\u00A0chrámu. Keď videl vchádzať do\u00A0chrámu Petra a Jána, prosil, aby mu dali almužnu.<br>" +
                            "Peter sa naň s\u00A0Jánom zahľadel a povedal: \"Pozri sa na\u00A0nás!\" On sa na\u00A0nich pozrel a čakal, že od\u00A0nich niečo dostane.<br>" +
                            "Ale Peter povedal: \"Striebro a zlato nemám, ale čo mám, to ti dám: V mene Ježiša Krista Nazaretského vstaň a choď!\" Chytil ho za\u00A0pravú ruku a zodvihol ho.<br>" +
                            "Vtom mu spevneli nohy a členky, vyskočil, postavil sa a chodil. Vošiel s\u00A0nimi do\u00A0chrámu, chodil, vyskakoval a chválil Boha.<br>" +
                            "Všetok ľud videl, ako chodí a chváli Boha, a poznali ho, že je to ten, čo sedával pri\u00A0Krásnej bráne chrámu a žobral. A naplnil ich úžas a vzrušenie nad\u00A0tým, čo sa s\u00A0ním stalo.<br>" +
                            "Počuli sme Božie slovo."},
            {"14", "4", "", "Sk 3, 11-26",
                    "Zabili ste pôvodcu života, ale Boh ho vzkriesil z\u00A0mŕtvych",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keďže sa uzdravený chromý pridŕžal Petra a Jána, zbehol sa k\u00A0nim do\u00A0stĺporadia, ktoré sa volá Šalamúnovým, všetok užasnutý ľud. Keď to Peter videl, prehovoril k\u00A0ľudu: \"Mužovia, Izraeliti, čo sa tomu divíte a prečo hľadíte na\u00A0nás, akoby sme boli vlastnou mocou alebo nábožnosťou urobili, že tento chodí? Boh Abraháma, Boh Izáka a Boh Jakuba, Boh našich otcov, oslávil svojho Služobníka Ježiša, ktorého ste vy vydali a zapreli pred\u00A0Pilátom, kým on rozhodol, že ho treba prepustiť. Vy ste zapreli Svätého a Spravodlivého a žiadali ste, aby vám prepustil vraha. Zabili ste pôvodcu života, ale Boh ho vzkriesil z\u00A0mŕtvych; a my sme toho svedkami.<br>" +
                            "A jeho meno pre\u00A0vieru v\u00A0toto meno upevnilo tohoto človeka, ktorého vidíte a poznáte, a viera, ktorá je skrze neho, dala mu toto úplné zdravie pred\u00A0očami vás všetkých.<br>" +
                            "A teraz, bratia, viem, že ste to v\u00A0nevedomosti urobili, ako aj vaši poprední muži. Ale Boh takto splnil, čo vopred oznámil ústami všetkých prorokov, že jeho Mesiáš bude trpieť.<br>" +
                            "Kajajte sa teda, obráťte sa, aby sa zotreli vaše hriechy a prišli časy osvieženia od\u00A0Pána, aby poslal Ježiša, ktorý je vám predurčený Mesiáš, ale musí ho prijať nebo až do\u00A0čias, keď sa všetko obnoví, čo odpradávna hovoril Boh ústami svojich svätých prorokov.<br>" +
                            "Veď Mojžiš povedal: ‚Proroka vám vzbudí Pán, váš Boh, z\u00A0vašich bratov ako mňa. Jeho budete počúvať vo\u00A0všetkom, čo vám povie. A každý, kto nepočúvne toho proroka, bude odstránený z\u00A0ľudu.' A všetci proroci, čo, počnúc Samuelom postupne hovorili, oznamovali tieto dni.<br>" +
                            "Vy ste synovia prorokov a zmluvy, ktorú Boh uzavrel s\u00A0vašimi otcami, keď povedal Abrahámovi: ‚A v\u00A0tvojom potomstve budú požehnané všetky rodiny zeme.' Boh predovšetkým vám vzbudil svojho Služobníka a poslal ho, aby vás požehnal tým, že každého z\u00A0vás odvráti od\u00A0vašich neprávostí.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"15", "5", "", "Sk 4, 1-12",
                    "V nikom inom niet spásy",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Kým Peter a Ján po\u00A0uzdravení chromého hovorili k\u00A0ľudu, prepadli ich kňazi, veliteľ chrámovej stráže a saduceji a zazlievali im, že učia ľud a ohlasujú zmŕtvychvstanie v\u00A0Ježišovi. Položili na\u00A0nich ruky a do\u00A0rána ich dali do\u00A0väzenia, lebo už bol večer. Ale mnohí z\u00A0tých, čo vypočuli slovo, uverili; a vzrástol počet mužov na\u00A0päťtisíc.<br>" +
                            "Na druhý deň sa v\u00A0Jeruzaleme zhromaždili poprední muži, starší a zákonníci, veľkňazi Annáš a Kajfáš, Ján a Alexander a všetci, čo boli z\u00A0veľkňazského rodu, postavili ich do\u00A0stredu a pýtali sa: \"Akou mocou alebo v\u00A0mene koho ste to urobili?\"<br>" +
                            "Vtedy im Peter, naplnený Duchom Svätým, povedal: \"Vodcovia ľudu a starší! Ak nás dnes vyšetrujete pre\u00A0dobrý skutok, vykonaný na\u00A0chorom človekovi, ako sa tento uzdravil, nech je známe vám všetkým a všetkému izraelskému ľudu, že v\u00A0mene Ježiša Krista Nazaretského, ktorého ste vy ukrižovali, ale Boh ho vzkriesil z\u00A0mŕtvych, stojí tento človek pred\u00A0vami zdravý! On je kameň, ktorý ste vy, stavitelia, zavrhli, a on sa stal kameňom uholným.<br>" +
                            "A v\u00A0nikom inom niet spásy, lebo niet pod\u00A0nebom iného mena, daného ľuďom, v\u00A0ktorom by sme mali byť spasení.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"16", "6", "", "Sk 4, 13-21",
                    "Nemôžeme nehovoriť o\u00A0tom, čo sme videli a počuli",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď veľkňazi, starší a zákonníci videli Petrovu a Jánovu odvahu a zbadali, že sú to ľudia neučení a prostí, veľmi sa čudovali; spoznali ich, že boli s\u00A0Ježišom. A keď videli, že uzdravený človek stojí s\u00A0nimi, nemohli nič namietať.<br>" +
                            "Preto im rozkázali, aby vyšli von z\u00A0veľrady, a radili sa: \"Čo robiť s\u00A0týmito ľuďmi? Všetci obyvatelia Jeruzalema vedia, že sa skrze nich stalo očividné znamenie a nemôžeme to poprieť. Ale aby sa to nešírilo ďalej medzi ľud, pohrozme im, nech už nikomu nehovoria v\u00A0tomto mene.\"<br>" +
                            "Zavolali ich teda a prikázali im že nesmú vôbec hovoriť ani učiť v\u00A0Ježišovom mene.<br>" +
                            "Ale Peter a Ján im odpovedali: \"Posúďte, či je správne pred\u00A0Bohom vás poslúchať viac ako Boha; lebo my nemôžeme nehovoriť o\u00A0tom, čo sme videli a počuli.\"<br>" +
                            "Ale oni im znova pohrozili a prepustili ich, lebo nenašli, ako ich potrestať, a to pre\u00A0ľud, pretože všetci oslavovali Boha za\u00A0to, čo sa stalo.<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "A", "", "Sk 2, 42-47",
                    "Všetci, čo uverili, boli pospolu a všetko mali spoločné",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Pokrstení sa vytrvalo zúčastňovali na\u00A0učení apoštolov a na\u00A0bratskom spoločenstve, na\u00A0lámaní chleba a na\u00A0modlitbách.<br>" +
                            "Všetkých sa zmocňovala bázeň; prostredníctvom apoštolov sa dialo množstvo divov a znamení. Všetci, čo uverili, boli pospolu a všetko mali spoločné. Predávali pozemky a majetky a rozdeľovali ich všetkým, podľa toho, ako kto potreboval.<br>" +
                            "Deň čo deň svorne zotrvávali v\u00A0chráme, po\u00A0domoch lámali chlieb a s\u00A0radosťou a úprimným srdcom požívali pokrm. Chválili Boha a boli milí všetkému ľudu. A Pán každý deň rozmnožoval tých, čo mali byť spasení.<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "B", "", "Sk 4, 32-35",
                    "Jedno srdce a jedna duša",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Množstvo veriacich malo jedno srdce a jednu dušu. A nik z\u00A0nich nehovoril, že niečo z\u00A0toho, čo mal, je jeho, ale všetko mali spoločné. Apoštoli veľkou silou vydávali svedectvo o\u00A0zmŕtvychvstaní Pána Ježiša a na\u00A0všetkých spočívala veľká milosť, veď medzi nimi nebolo núdzneho, lebo všetci, čo mali polia alebo domy, predávali ich a čo za\u00A0ne utŕžili, prinášali a kládli apoštolom k\u00A0nohám, a rozdeľovalo sa každému podľa toho, kto ako potreboval.<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "C", "", "Sk 5, 12-16",
                    "Pribúdalo veriacich Pánovi; veľké množstvo mužov a žien",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Rukami apoštolov sa dialo množstvo znamení a divov medzi ľudom. Všetci svorne zotrvávali v\u00A0Šalamúnovom stĺporadí. Ale nik iný sa k\u00A0nim neodvážil pripojiť, no ľud ich velebil a čím ďalej, tým viac pribúdalo veriacich Pánovi; veľké množstvo mužov a žien.<br>" +
                            "Ešte aj na\u00A0ulice vynášali chorých a kládli ich na\u00A0postele a lôžka, aby aspoň Petrova tôňa padla na\u00A0niektorého z\u00A0nich, keď tade pôjde. Aj z\u00A0miest okolo Jeruzalema sa zbiehalo množstvo ľudu, prinášali chorých a trápených nečistými duchmi a všetci sa uzdravovali.<br>" +
                            "Počuli sme Božie slovo."},
            {"21", "1", "", "Sk 4, 23-31",
                    "Keď sa pomodlili, všetkých naplnil Svätý Duch a smelo hlásali Božie slovo",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď Petra a Jána prepustili, išli k\u00A0svojim a rozpovedali, čo im hovorili veľkňazi a starší. Keď ich vypočuli, jednomyseľne pozdvihli hlas k\u00A0Bohu a hovorili: \"Pane, ty si stvoril nebo a zem i more a všetko, čo je v\u00A0nich. Ty si skrze Ducha Svätého ústami svojho služobníka, nášho otca Dávida, povedal: ‚Prečo sa búria pohania? Prečo národy snujú plány daromné? Povstávajú pozemskí králi a vladári sa spolčujú proti Pánovi a proti jeho Pomazanému.'<br>" +
                            "V tomto meste sa naozaj spolčili Herodes a Poncius Pilát s\u00A0pohanmi a s\u00A0izraelským ľudom proti tvojmu svätému Služobníkovi Ježišovi, ktorého si pomazal, aby vykonali všetko, čo tvoja ruka a vôľa vopred určili, že sa má stať.<br>" +
                            "A teraz, Pane, pozri na\u00A0ich hrozby a daj, aby tvoji služobníci hlásali tvoje slovo so\u00A0všetkou odvahou. Vystri svoju ruku, aby sa skrze meno tvojho svätého Služobníka Ježiša diali uzdravenia, znamenia a divy.\"<br>" +
                            "A keď sa pomodlili, zatriaslo sa miesto, na\u00A0ktorom boli zhromaždení, všetkých naplnil Svätý Duch a smelo hlásali Božie slovo.<br>" +
                            "Počuli sme Božie slovo."},
            {"22", "2", "", "Sk 4, 32-37",
                    "Jedno srdce a jedna duša",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Množstvo veriacich malo jedno srdce a jednu dušu. A nik z\u00A0nich nehovoril, že niečo z\u00A0toho, čo mal, je jeho, ale všetko mali spoločné.<br>" +
                            "Apoštoli veľkou silou vydávali svedectvo o\u00A0zmŕtvychvstaní Pána Ježiša a na\u00A0všetkých spočívala veľká milosť, veď medzi nimi nebolo núdzneho, lebo všetci, čo mali polia alebo domy, predávali ich a čo za\u00A0ne utŕžili, prinášali a kládli apoštolom k\u00A0nohám, a rozdeľovalo sa každému podľa toho, kto ako potreboval.<br>" +
                            "Aj Jozef, ktorému apoštoli dali meno Barnabáš, čo v\u00A0preklade znamená syn Útechy, levita, rodom Cyperčan, mal roľu, predal ju a peniaze priniesol a položil apoštolom k\u00A0nohám.<br>" +
                            "Počuli sme Božie slovo."},
            {"23", "3", "", "Sk 5, 17-26",
                    "Muži, ktorých ste vrhli do\u00A0žalára, stoja v\u00A0chráme a učia ľud",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Vystúpil veľkňaz a všetci, čo boli s\u00A0ním – teda sekta saducejov –, a plní žiarlivosti položili na\u00A0apoštolov ruky a vrhli ich do\u00A0mestského väzenia.<br>" +
                            "Ale Pánov anjel otvoril v\u00A0noci dvere väzenia, vyviedol ich a povedal: \"Choďte, staňte si v\u00A0chráme a hlásajte ľudu všetky slová tohoto života!\" Oni počúvli, zavčas rána vošli do\u00A0chrámu a učili.<br>" +
                            "Keď prišiel veľkňaz a tí, čo boli s\u00A0ním, zvolali veľradu a všetkých starších zo\u00A0synov Izraela a poslali do\u00A0väzenia, aby ich priviedli.<br>" +
                            "Ale keď ta sluhovia prišli, vo\u00A0väzení ich nenašli. Vrátili sa teda a hlásili: \"Väzenie sme našli dôkladne zatvorené a strážnici stáli pri\u00A0dverách; no keď sme otvorili, vnútri sme nenašli nikoho.\"<br>" +
                            "Keď veliteľ chrámovej stráže a veľkňazi počuli tieto slová, boli v\u00A0pomykove, čo sa to vlastne stalo.<br>" +
                            "Tu ktosi prišiel a oznámil im: \"Muži, ktorých ste vrhli do\u00A0žalára, stoja v\u00A0chráme a učia ľud.\"<br>" +
                            "Veliteľ stráže hneď odišiel so\u00A0sluhami a priviedol ich – ale nie násilne, lebo sa báli ľudu, aby ich neukameňoval.<br>" +
                            "Počuli sme Božie slovo."},
            {"24", "4", "", "Sk 5, 27-33",
                    "My sme toho svedkami aj Duch Svätý",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď sluhovia priviedli apoštolov, postavili ich pred\u00A0veľradu a veľkňaz sa ich opýtal: \"Nezakázali sme vám prísne učiť v\u00A0tom mene?! A vy ste naplnili Jeruzalem svojím učením a chcete na\u00A0nás uvaliť krv toho človeka.\"<br>" +
                            "Peter a apoštoli odpovedali: \"Boha treba viac poslúchať ako ľudí. Boh našich otcov vzkriesil Ježiša, ktorého ste vy zavesili na\u00A0drevo a zavraždili. Jeho Boh svojou pravicou povýšil za\u00A0Vládcu a Spasiteľa, aby daroval Izraelu pokánie a odpustenie hriechov. A my sme toho svedkami aj Duch Svätý, ktorého Boh dal tým, čo ho poslúchajú.\"<br>" +
                            "Keď to počuli, pukali od\u00A0zlosti a chceli ich zabiť.<br>" +
                            "Počuli sme Božie slovo."},
            {"25", "5", "", "Sk 5, 34-42",
                    "Odchádzali natešení, že boli uznaní za\u00A0hodných znášať potupu pre\u00A0Meno",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Vo veľrade vstal istý farizej, menom Gamaliel, učiteľ zákona, ktorého si vážil všetok ľud. Rozkázal apoštolov vyviesť na\u00A0chvíľu von a im povedal: \"Mužovia, Izraeliti, dobre si rozmyslite, čo chcete urobiť s\u00A0týmito ľuďmi. Lebo prednedávnom povstal Teudas a hovoril, že on je niekým, a pridalo sa k\u00A0nemu okolo štyristo mužov. No zabili ho a všetci, čo mu verili, boli rozprášení a zničení. Po\u00A0ňom v\u00A0dňoch súpisu povstal Júda Galilejský a strhol za\u00A0sebou ľud. Aj on zahynul a všetci jeho stúpenci sa rozpŕchli.<br>" +
                            "Preto vám teraz hovorím: Nechajte týchto ľudí a prepustite ich, lebo ak je tento zámer alebo toto dielo od\u00A0ľudí, rozpadne sa, ale ak je od\u00A0Boha, nebudete ich môcť rozvrátiť. Aby ste sa neocitli v\u00A0boji proti Bohu!\"<br>" +
                            "I súhlasili s\u00A0ním. Zavolali apoštolov, dali ich zbičovať, prikázali im, že nesmú hovoriť v\u00A0Ježišovom mene, a prepustili ich. A oni odchádzali z\u00A0veľrady natešení, že boli uznaní za\u00A0hodných znášať potupu pre\u00A0toto meno.<br>" +
                            "A neprestávali deň čo deň učiť v\u00A0chráme i po\u00A0domoch a zvestovať Krista, Ježiša.<br>" +
                            "Počuli sme Božie slovo."},
            {"26", "", "", "Sk 6, 1-7",
                    "Vyvolili si sedem mužov plných Ducha Svätého",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "V tých dňoch, keď počet učeníkov rástol, Helenisti začali šomrať na\u00A0Hebrejov, že pri\u00A0každodennom obsluhovaní zanedbávajú ich vdovy. Preto Dvanásti zvolali zhromaždenie učeníkov a povedali: \"Nie je správne, aby sme my zanedbávali Božie slovo a obsluhovali pri\u00A0stoloch. Preto si, bratia, vyhliadnite spomedzi seba sedem osvedčených mužov, plných Ducha a múdrosti, a na\u00A0túto úlohu ustanovíme ich. My sa budeme celkom venovať modlitbe a službe slova.\"<br>" +
                            "Táto reč sa páčila celému zhromaždeniu a vyvolili si Štefana, muža plného viery a Ducha Svätého, ďalej Filipa, Prochora, Nikanora, Timona, Parmenáša a Mikuláša, prozelytu z\u00A0Antiochie. Postavili ich pred\u00A0apoštolov a oni sa modlili a vložili na\u00A0nich ruky.<br>" +
                            "Božie slovo sa šírilo a počet učeníkov v\u00A0Jeruzaleme veľmi rástol. Aj veľa kňazov poslušne prijalo vieru.<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "A", "", "Sk 2, 14. 22b-33",
                    "Smrť ho nemohla držať vo\u00A0svojej moci",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "V deň Turíc vystúpil Peter s\u00A0Jedenástimi a zvýšeným hlasom im povedal: \"Mužovia judejskí a všetci, čo bývate v\u00A0Jeruzaleme, aby vám toto bolo známe, počúvajte moje slová.<br>" +
                            "Boh u\u00A0vás potvrdil muža, Ježiša Nazaretského, mocnými činmi, divmi a znameniami, ktoré, ako sami viete, Boh skrze neho medzi vami urobil. A vy ste ho, vydaného podľa presného Božieho zámeru a predvídania, rukami bezbožníkov pribili na\u00A0kríž a zavraždili. Ale Boh ho vzkriesil a zbavil múk smrti, lebo ho nemohla držať vo\u00A0svojej moci. Veď Dávid o\u00A0ňom hovorí: ‚Pána mám vždy pred\u00A0očami, lebo je po\u00A0mojej pravici, aby som sa nezakolísal. Preto sa raduje moje srdce a môj jazyk plesá, aj moje telo odpočíva v\u00A0nádeji. Lebo nenecháš moju dušu v\u00A0podsvetí a nedovolíš, aby tvoj Svätý videl porušenie. Ukázal si mi cestu života, naplníš ma radosťou pred\u00A0svojou tvárou.'\"<br>" +
                            "Bratia, dovoľte mi otvorene vám povedať o\u00A0praotcovi Dávidovi, že zomrel, pochovali ho a jeho hrob je u\u00A0nás až do\u00A0dnešného dňa. Ale on bol prorok a vedel, že Boh sa mu prísahou zaviazal posadiť potomka z\u00A0jeho bedier na\u00A0jeho trón; videl do\u00A0budúcnosti a povedal o\u00A0Kristovom vzkriesení, že ani nebol ponechaný v\u00A0podsvetí, ani jeho telo nevidelo porušenie. Tohoto Ježiša Boh vzkriesil a my všetci sme toho svedkami. Božia pravica ho povýšila a keď od\u00A0Otca dostal prisľúbeného Ducha Svätého, vylial ho, ako sami vidíte a počujete.<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "B", "", "Sk 3, 13-15. 17-19",
                    "Zabili ste pôvodcu života, ale Boh ho vzkriesil z\u00A0mŕtvych",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Peter prehovoril k\u00A0ľudu: \"Boh Abraháma, Boh Izáka a Boh Jakuba, Boh našich otcov, oslávil svojho Služobníka Ježiša, ktorého ste vy vydali a zapreli pred\u00A0Pilátom, kým on rozhodol, že ho treba prepustiť. Vy ste zapreli Svätého a Spravodlivého a žiadali ste, aby vám prepustil vraha. Zabili ste pôvodcu života, ale Boh ho vzkriesil z\u00A0mŕtvych; a my sme toho svedkami.<br>" +
                            "A teraz, bratia, viem, že ste to v\u00A0nevedomosti urobili, ako aj vaši poprední muži. Ale Boh takto splnil, čo vopred oznámil ústami všetkých prorokov, že jeho Mesiáš bude trpieť. Kajajte sa teda, obráťte sa, aby sa zotreli vaše hriechy.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "C", "", "Sk 5, 27b-32. 40b-41",
                    "My sme toho svedkami aj Duch Svätý",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Veľkňaz začal vyšetrovať apoštolov. Opýtal sa ich: \"Nezakázali sme vám prísne učiť v\u00A0tom mene?! A vy ste naplnili Jeruzalem svojím učením a chcete na\u00A0nás uvaliť krv toho človeka.\" Peter a apoštoli odpovedali: \"Boha treba viac poslúchať ako ľudí. Boh našich otcov vzkriesil Ježiša, ktorého ste vy zavesili na\u00A0drevo a zavraždili. Jeho Boh svojou pravicou povýšil za\u00A0Vládcu a Spasiteľa, aby daroval Izraelu pokánie a odpustenie hriechov. A my sme toho svedkami aj Duch Svätý, ktorého Boh dal tým, čo ho poslúchajú.\"<br>" +
                            "Apoštolom potom prikázali, že nesmú hovoriť v\u00A0Ježišovom mene, a prepustili ich. A oni odchádzali z\u00A0veľrady natešení, že boli uznaní za\u00A0hodných znášať potupu pre\u00A0toto meno.<br>" +
                            "Počuli sme Božie slovo."},
            {"31", "1", "", "Sk 6, 8-15",
                    "Neboli schopní čeliť múdrosti a Duchu, ktorým hovoril",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Štefan plný milosti a sily, robil veľké divy a znamenia medzi ľudom. Tu vstali niektorí z\u00A0takzvanej synagógy Libertíncov, Cyrénčanov a Alexandrijčanov a z\u00A0tých, čo boli z\u00A0Cilície a Ázie, a hádali sa so\u00A0Štefanom. Ale neboli schopní čeliť múdrosti a Duchu, ktorým hovoril.<br>" +
                            "Podstrčili teda mužov, ktorí hovorili: \"Počuli sme, že hovoril rúhavé slová proti Mojžišovi a proti Bohu.\"<br>" +
                            "Pobúrili ľud, starších a zákonníkov, zbehli sa, zdrapli ho a zaviedli pred\u00A0veľradu.<br>" +
                            "Tu postavili falošných svedkov, ktorí hovorili: \"Tento človek neprestáva hovoriť proti svätému miestu a proti Zákonu. Počuli sme, ako hovoril, že Ježiš, ten Nazaretský, zborí toto miesto a zmení obyčaje, ktoré nám odovzdal Mojžiš.\"<br>" +
                            "Všetci, čo sedeli vo\u00A0veľrade, uprene naňho hľadeli a videli, že jeho tvár je ako tvár anjela.<br>" +
                            "Počuli sme Božie slovo."},
            {"32", "2", "", "Sk 7, 51 – 8, 1a ",
                    "Pane Ježišu, prijmi môjho ducha",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Štefan povedal ľudu, starším a zákonníkom: \"Vy, tvrdošijní s\u00A0neobrezaným srdcom a ušami, vy vždy odporujete Duchu Svätému; vy takisto ako vaši otcovia. Ktorého proroka neprenasledovali vaši otcovia? Oni zabíjali tých, čo predpovedali príchod Spravodlivého, a vy ste sa teraz stali jeho zradcami a vrahmi; vy, čo ste prostredníctvom anjelov dostali zákon, no nezachovávali ste ho.\"<br>" +
                            "Keď to počuli, pukali im srdcia od\u00A0zlosti a zubami škrípali proti nemu.<br>" +
                            "Ale on, plný Ducha Svätého, uprene sa zahľadel na\u00A0nebo, uvidel Božiu slávu a Ježiša stáť po\u00A0pravici Boha a povedal: \"Vidím otvorené nebo a Syna človeka stáť po\u00A0pravici Boha.\"<br>" +
                            "Strašne vykríkli, zapchávali si uši a všetci sa naňho vrhli. Vyhnali ho za\u00A0mesto a kameňovali. Svedkovia si odložili šaty k\u00A0nohám mladého muža, ktorý sa volal Šavol.<br>" +
                            "Štefana kameňovali a on sa modlil: \"Pane Ježišu, prijmi môjho ducha.\"<br>" +
                            "Potom si kľakol a zvolal veľkým hlasom: \"Pane, nezapočítaj im tento hriech.\" A len čo to povedal, zomrel.<br>" +
                            "Šavol schvaľoval, že ho zabili.<br>" +
                            "Počuli sme Božie slovo."},
            {"33", "3", "", "Sk 8, 1b-8",
                    "Chodili a hlásali slovo",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "V ten deň sa začalo veľké prenasledovanie cirkvi v\u00A0Jeruzaleme a všetci sa okrem apoštolov rozpŕchli po\u00A0krajoch Judey a Samárie. Štefana pochovali bohabojní muži a veľmi nad\u00A0ním plakali. Ale Šavol ničil Cirkev, vnikal do\u00A0domov a odvláčal mužov i ženy a dával ich do\u00A0väzenia. Tí, čo sa rozpŕchli, chodili a hlásali slovo.<br>" +
                            "Filip prišiel do\u00A0mesta Samárie a zvestoval im Krista. Zástupy pozorne a jednomyseľne sledovali, čo Filip hovorí, pretože počuli i videli, že robí znamenia. Lebo z\u00A0mnohých posadnutých vychádzali s\u00A0veľkým krikom nečistí duchovia a mnohí ochrnutí a chromí ozdraveli. A v\u00A0meste nastala veľká radosť.<br>" +
                            "Počuli sme Božie slovo."},
            {"34", "4", "", "Sk 8, 26-36. 38-40",
                    "Pozri, voda! Čo prekáža, aby som sa dal pokrstiť?",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Pánov anjel povedal Filipovi: \"Vstaň a choď na\u00A0juh k\u00A0ceste, čo vedie z\u00A0Jeruzalema do\u00A0Gazy; je pustá.\"<br>" +
                            "On vstal a šiel. Tu videl Etiópčana, eunucha a veľmoža etiópskej kráľovnej Kandaky, správcu všetkých jej pokladov, ktorý sa prišiel do\u00A0Jeruzalema pokloniť Bohu, a už sa vracal. Sedel na\u00A0svojom voze a čítal proroka Izaiáša.<br>" +
                            "Tu povedal Duch Filipovi: \"Choď a pridaj sa k\u00A0tamtomu vozu.\" Keď Filip pribehol a počul, že číta proroka Izaiáša, opýtal sa: \"A aj rozumieš, čo čítaš?\"<br>" +
                            "On odvetil: \"Ako by som mohol, keď mi to nik nevysvetlí?\" A poprosil Filipa, aby nastúpil a sadol si vedľa neho.<br>" +
                            "Stať Písma, ktorú čítal, bola táto: \"Viedli ho ako ovcu na\u00A0zabitie a ako baránok onemie pred\u00A0tým, čo ho strihá, tak ani on neotvorí ústa. Pre\u00A0jeho pokoru bol súd nad\u00A0nim zrušený. A kto bude rozprávať o\u00A0jeho rode? Lebo jeho život sa berie zo\u00A0zeme.\"<br>" +
                            "Eunuch povedal Filipovi: \"Prosím ťa, o\u00A0kom to prorok hovorí? O\u00A0sebe, či o\u00A0niekom inom?\"<br>" +
                            "Tu Filip otvoril ústa a počnúc týmto miestom z\u00A0Písma, zvestoval mu Ježiša.<br>" +
                            "Ako išli cestou, došli k\u00A0akejsi vode a eunuch vravel: \"Pozri, voda! Čo prekáža, aby som sa dal pokrstiť?\"<br>" +
                            "Rozkázal zastaviť voz a obaja, Filip i eunuch, zostúpili do\u00A0vody a pokrstil ho.<br>" +
                            "Keď vystúpili z\u00A0vody, Pánov Duch Filipa uniesol a eunuch ho viac nevidel; ale šiel svojou cestou plný radosti.<br>" +
                            "A Filip sa našiel v\u00A0Azote. Chodil po\u00A0všetkých mestách a hlásal evanjelium, až prišiel do\u00A0Cézarey.<br>" +
                            "Počuli sme Božie slovo."},
            {"35", "5", "", "Sk 9, 1-20",
                    "Jeho som si vyvolil za\u00A0nádobu, aby zaniesol moje meno pohanom",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Šavol ešte stále dychtil po\u00A0hrozbách a zabíjaní Pánových učeníkov.<br>" +
                            "Išiel teda k\u00A0veľkňazovi a vyžiadal si od\u00A0neho listy pre\u00A0synagógy v\u00A0Damasku, aby mohol stúpencov tejto Cesty, mužov i ženy, ak tam dajakých nájde, v\u00A0putách priviesť do\u00A0Jeruzalema.<br>" +
                            "Ako šiel a blížil sa k\u00A0Damasku, zrazu ho zalialo svetlo z\u00A0neba. Padol na\u00A0zem a počul hlas, ktorý mu hovoril: \"Šavol, Šavol, prečo ma prenasleduješ?\"<br>" +
                            "On povedal: \"Kto si, Pane?\"<br>" +
                            "A ten: \"Ja som Ježiš, ktorého ty prenasleduješ. Ale vstaň, chod' do\u00A0mesta a povedia ti, čo máš robiť.\"<br>" +
                            "Muži, čo ho sprevádzali, stáli ako ohromení, lebo hlas počuli, ale nikoho nevideli.<br>" +
                            "Šavol vstal zo\u00A0zeme, otvoril oči, ale nič nevidel. Vzali ho teda za\u00A0ruku a zaviedli do\u00A0Damasku. Tri dni nevidel a nejedol, ani nepil.<br>" +
                            "V Damasku bol istý učeník menom Ananiáš, a Pán ho vo\u00A0videní oslovil: \"Ananiáš!\"<br>" +
                            "On povedal: \"Tu som, Pane.\"<br>" +
                            "A Pán jemu: \"Vstaň a chod' do\u00A0ulice, ktorá sa volá Rovná, a v\u00A0Júdovom dome vyhľadaj Šavla prímením Tarzského; práve sa modlí a vidí muža menom Ananiáša, ako vchádza a vkladá naň ruky, aby sa mu vrátil zrak.\"<br>" +
                            "No Ananiáš odpovedal: \"Pane, od\u00A0mnohých som počul o\u00A0tomto mužovi, koľko zla narobil tvojim svätým v\u00A0Jeruzaleme. Aj tu má moc od\u00A0veľkňazov poviazať všetkých, čo vzývajú tvoje meno.\"<br>" +
                            "Ale Pán mu povedal: \"Len choď, lebo jeho som si vyvolil za\u00A0nádobu, aby zaniesol moje meno pohanom aj kráľom i synom Izraela; a ja mu ukážem, koľko musí trpieť pre\u00A0moje meno.\"<br>" +
                            "Ananiáš teda šiel a vošiel do\u00A0domu, vložil naň ruky a povedal: \"Brat Šavol, poslal ma Pán Ježiš, ktorý sa ti zjavil na\u00A0ceste, keď si šiel sem, aby si zasa videl a aby ťa naplnil Duch Svätý.\"<br>" +
                            "Hneď mu spadli z\u00A0očí akoby lupiny a vrátil sa mu zrak. Tu vstal a dal sa pokrstiť. Potom prijal pokrm a zosilnel.<br>" +
                            "Niekoľko dní zostal s\u00A0učeníkmi v\u00A0Damasku a hneď v\u00A0synagógach ohlasoval Ježiša, že je Božím Synom.<br>" +
                            "Počuli sme Božie slovo."},
            {"36", "6", "", "Sk 9, 31-42",
                    "Cirkev sa upevňovala a rástla v\u00A0úteche Svätého Ducha",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Cirkev mala pokoj po\u00A0celej Judei, Galilei a Samárii; upevňovala sa, žila v\u00A0bázni pred\u00A0Pánom a rástla v\u00A0úteche Svätého Ducha.<br>" +
                            "Ako Peter navštevoval všetkých, prišiel aj k\u00A0svätým, čo bývali v\u00A0Lydde. Našiel tam istého človeka, menom Eneáša, ktorý bol ochrnutý a už osem rokov ležal na\u00A0posteli. Peter mu povedal: \"Eneáš, Ježiš Kristus ťa uzdravuje. Vstaň a usteľ si.\" A on hneď vstal. A videli ho všetci, čo bývali v\u00A0Lydde a Sárone, ktorí sa obrátili k\u00A0Pánovi.<br>" +
                            "V Joppe zasa bola istá učeníčka, menom Tabita, čo v\u00A0preklade znamená Dorkas. Ona vynikala dobrými skutkami a almužnami, ktoré dávala. No v\u00A0tých dňoch ochorela a umrela. Keď ju poumývali, vystreli ju v\u00A0hornej sieni. A pretože Lydda je blízko Joppe a učeníci sa dopočuli, že je tam Peter, poslali k\u00A0nemu dvoch mužov s\u00A0prosbou: \"Príď bez\u00A0meškania aj k\u00A0nám!\"<br>" +
                            "Peter vstal a šiel s\u00A0nimi. Keď ta prišiel, zaviedli ho do\u00A0hornej siene. Obstúpili ho s\u00A0plačom všetky vdovy a ukazovali mu sukne a šaty, čo im urobila Dorkas, kým bola medzi nimi. Peter poslal všetkých von, kľakol si a pomodlil sa. Potom obrátený k\u00A0mŕtvole povedal: \"Tabita, vstaň!\" Ona otvorila oči a keď videla Petra, posadila sa. On jej podal ruku a zodvihol ju. Potom zavolal svätých a vdovy a predstavil im ju živú.<br>" +
                            "Roznieslo sa to po\u00A0celom Joppe a mnohí uverili v\u00A0Pána.<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "A", "", "Sk 2, 14a. 36-41",
                    "Boh ho urobil aj Pánom, aj Mesiášom",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "V deň Turíc vystúpil Peter s\u00A0Jedenástimi a zvýšeným hlasom im povedal: \"Nech teda s\u00A0istotou vie celý dom Izraela, že toho Ježiša, ktorého ste vy ukrižovali, Boh urobil aj Pánom, aj Mesiášom.\"<br>" +
                            "Keď to počuli, bolesť im prenikla srdce a povedali Petrovi a ostatným apoštolom: \"Čo máme robiť, bratia?\"<br>" +
                            "Peter im povedal: \"Robte pokánie a nech sa dá každý z\u00A0vás pokrstiť v\u00A0mene Ježiša Krista na\u00A0odpustenie svojich hriechov a dostanete dar Svätého Ducha. Veď to prisľúbenie patrí vám a vašim deťom i všetkým, čo sú ďaleko, všetkým, ktorých si povolá Pán, náš Boh.\"<br>" +
                            "A ešte mnohými inými slovami ich zaprisahával a povzbudzoval: \"Zachráňte sa z\u00A0tohoto zvrhlého pokolenia!\" Oni prijali jeho slovo a dali sa pokrstiť; a v\u00A0ten deň sa pridalo asi tritisíc duší.<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "B", "", "Sk 4, 8-12",
                    "V nikom inom niet spásy",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Peter, naplnený Duchom Svätým, povedal: \"Vodcovia ľudu a starší! Ak nás dnes vyšetrujete pre\u00A0dobrý skutok, vykonaný na\u00A0chorom človekovi, ako sa tento uzdravil, nech je známe vám všetkým a všetkému izraelskému ľudu, že v\u00A0mene Ježiša Krista Nazaretského, ktorého ste vy ukrižovali, ale Boh ho vzkriesil z\u00A0mŕtvych, stojí tento človek pred\u00A0vami zdravý! On je kameň, ktorý ste vy, stavitelia, zavrhli, a on sa stal kameňom uholným.<br>" +
                            "A v\u00A0nikom inom niet spásy, lebo niet pod\u00A0nebom iného mena, daného ľuďom, v\u00A0ktorom by sme mali byť spasení.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "C", "", "Sk 13, 14. 43-52",
                    "Obraciame sa k\u00A0pohanom",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Pavol a Barnabáš šli ďalej a z\u00A0Perge došli do\u00A0Antiochie v\u00A0Pizídii. V sobotu vošli do\u00A0synagógy a sadli si.<br>" +
                            "A keď sa zhromaždenie rozišlo, mnoho Židov a nábožných prozelytov išlo za\u00A0Pavlom a Barnabášom. A oni s\u00A0nimi hovorili a povzbudzovali ich, aby vytrvali v\u00A0Božej milosti.<br>" +
                            "V nasledujúcu sobotu sa skoro celé mesto zišlo počúvať Pánovo slovo. Keď Židia videli zástupy, plní žiarlivosti rúhavo odporovali tomu, čo hovoril Pavol.<br>" +
                            "Tu Pavol a Barnabáš povedali smelo: \"Predovšetkým vám sa malo hlásať Božie slovo, ale preto, že ho odmietate a sami sa pokladáte za\u00A0nehodných večného života, obraciame sa k\u00A0pohanom. Lebo tak nám prikázal Pán: ‚Ustanovil som ťa za\u00A0svetlo pohanom, aby si bol spásou až do\u00A0končín zeme.'\"<br>" +
                            "Keď to počuli pohania, radovali sa a oslavovali Pánovo slovo a uverili všetci, čo boli vopred určení pre\u00A0večný život. A Pánovo slovo sa šírilo po\u00A0celom kraji.<br>" +
                            "Ale Židia poštvali nábožné ženy z\u00A0vyšších vrstiev a popredných mešťanov, podnietili proti Pavlovi a Barnabášovi prenasledovanie a vyhnali ich zo\u00A0svojho kraja. Oni na\u00A0nich striasli prach z\u00A0nôh a odišli do\u00A0Ikónia. No učeníci boli naplnení radosťou a Duchom Svätým.<br>" +
                            "Počuli sme Božie slovo."},
            {"41", "1", "", "Sk 11, 1-18",
                    "Teda Boh aj pohanom daroval pokánie, aby mali život",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Apoštoli a bratia v\u00A0Judei sa dopočuli, že aj pohania prijali Božie slovo. Keď Peter prišiel do\u00A0Jeruzalema, tí, čo boli z\u00A0obriezky, mu dohovárali: \"Vošiel si k\u00A0neobrezancom a jedol si s\u00A0nimi!\"<br>" +
                            "Peter im začal rad-radom vysvetľovať: \"Bol som v\u00A0meste Joppe, modlil som sa a vo\u00A0vytržení som mal videnie: akási nádoba ako veľké prestieradlo spúšťané za\u00A0štyri rohy zostupovala z\u00A0neba a prišla až ku\u00A0mne. Keď som pozorne do\u00A0nej pozrel, videl som pozemské štvornožce a divú zver, plazy a nebeské vtáctvo.<br>" +
                            "A počul som, aj hlas, ktorý mi hovoril: ‚Peter, vstaň, zabíjaj a jedz!' No ja som povedal: Nijakým činom, Pane, veď poškvrnené a nečisté nevošlo nikdy do\u00A0mojich úst! Ale hlas mi druhý raz povedal z\u00A0neba: ‚Čo Boh očistil, ty nenazývaj poškvrneným.' To sa opakovalo tri razy a všetko sa zasa zdvihlo do\u00A0neba.<br>" +
                            "Hneď nato zastali pri\u00A0dome, v\u00A0ktorom sme boli, traja muži, vyslaní ku\u00A0mne z\u00A0Cézarey. A Duch mi povedal, aby som šiel bez\u00A0váhania s\u00A0nimi. So mnou šli aj títo šiesti bratia a vošli sme do\u00A0domu toho muža. On nám rozpovedal, ako videl vo\u00A0svojom dome anjela, ktorý stál a hovoril: ‚Pošli do\u00A0Joppe a zavolaj ši Šimona s\u00A0prímením Peter; on ti povie slová, v\u00A0ktorých budeš spasený ty i celý tvoj dom.'<br>" +
                            "Keď som potom začal hovoriť, zostúpil na\u00A0nich Duch Svätý, tak ako na\u00A0začiatku na\u00A0nás. Vtedy som si spomenul na\u00A0Pánovo slovo, ako hovoril: ‚Ján krstil vodou, ale vy budete pokrstení Duchom Svätým.' Keď im teda Boh dal taký istý dar ako nám, čo sme uverili v\u00A0Pána Ježiša Krista, ktože som ja, aby som mohol prekážať Bohu?\"<br>" +
                            "Keď to počuli, uspokojili sa a oslavovali Boha, hovoriac: \"Teda Boh aj pohanom daroval pokánie, aby mali život.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"42", "2", "", "Sk 11, 19-26",
                    "Hovorili aj Helenistom a zvestovali im Pána Ježiša",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Tí, čo sa rozpŕchli pred\u00A0súžením, ktoré nastalo za\u00A0Štefana, došli až do\u00A0Fenície, na\u00A0Cyprus a do\u00A0Antiochie, ale nikomu neohlasovali slovo, iba Židom. No niektorí z\u00A0nich boli Cyperčania a Cyrénčania. A keď prišli do\u00A0Antiochie, hovorili aj Helenistom a zvestovali im Pána Ježiša. Pánova ruka bola s\u00A0nimi a veľa ich uverilo a obrátilo sa k\u00A0Pánovi.<br>" +
                            "Zvesť o\u00A0tom sa dostala aj do\u00A0uší jeruzalemskej cirkvi; a vyslali do\u00A0Antiochie Barnabáša. Keď ta prišiel a videl Božiu milosť, zaradoval sa a povzbudzoval všetkých, aby vytrvali v\u00A0Pánovi, ako si zaumienili v\u00A0srdci, lebo on bol muž dobrý, plný Ducha Svätého a viery. A k\u00A0Pánovi sa pridal veľký zástup.<br>" +
                            "Preto odišiel do\u00A0Tarzu vyhľadať Šavla. Keď ho našiel, priviedol ho do\u00A0Antiochie. Celý rok pobudli v\u00A0tamojšej cirkvi a učili početný zástup.<br>" +
                            "V Antiochii učeníkov prvý raz nazvali kresťanmi.<br>" +
                            "Počuli sme Božie slovo."},
            {"43", "3", "", "Sk 12, 24 – 13, 5a",
                    "Oddeľte mi Barnabáša a Šavla",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Božie slovo sa šírilo a rozmáhalo. Keď Barnabáš a Šavol splnili v\u00A0Jeruzaleme svoju úlohu, vrátili sa a vzali so\u00A0sebou Jána, ktorý sa volá Marek.<br>" +
                            "V antiochijskej cirkvi boli prorokmi a učiteľmi Barnabáš, Simeon, ktorého volali Niger, Lucius z\u00A0Cyrény, Manaen, ktorý bol vychovaný s\u00A0tetrarchom Herodesom, a Šavol.<br>" +
                            "Ako slúžili Pánovi a postili sa, povedal Duch Svätý: \"Oddeľte mi Barnabáša a Šavla na\u00A0dielo, na\u00A0ktoré som ich povolal.\" Oni sa postili a modlili, vložili na\u00A0nich ruky a prepustili ich.<br>" +
                            "A oni, vyslaní Duchom Svätým, došli do\u00A0Seleucie a stade sa preplavili na\u00A0Cyprus. Keď prišli do\u00A0Salaminy, hlásali Božie slovo v\u00A0židovských synagógach.<br>" +
                            "Počuli sme Božie slovo."},
            {"44", "4", "", "Sk 13, 13-25",
                    "Z Dávidovho potomstva dal Boh Spasiteľa, Ježiša",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Pavol a jeho spoločníci sa z\u00A0Pafu odplavili a prišli do\u00A0Perge v\u00A0Pamfýlii. Ján od\u00A0nich odišiel a vrátil sa do\u00A0Jeruzalema.<br>" +
                            "Ostatní šli ďalej a z\u00A0Perge došli do\u00A0Antiochie v\u00A0Pizídii. V sobotu vošli do\u00A0synagógy a sadli si. Po\u00A0čítaní zo\u00A0Zákona a Prorokov im predstavení synagógy odkázali: \"Bratia, ak máte nejaké povzbudivé slovo pre\u00A0ľud, hovorte!\"<br>" +
                            "Tu Pavol vstal, rukou dal znamenie, aby bolo ticho, a povedal: \"Mužovia, Izraeliti a vy všetci, čo sa bojíte Boha, počúvajte! Boh tohoto izraelského ľudu si vyvolil našich otcov a povýšil tento ľud, keď býval v\u00A0cudzine, v\u00A0egyptskej krajine. Potom ho z\u00A0nej vyviedol zdvihnutým ramenom a asi štyridsať rokov znášal ich správanie na\u00A0púšti. Vyhubil sedem národov v\u00A0kanaánskej krajine a lósom rozdelil ich krajinu asi na\u00A0štyristopäťdesiat rokov.<br>" +
                            "Potom im dával sudcov až po\u00A0proroka Samuela.<br>" +
                            "Vtedy si žiadali kráľa a Boh im dal Kíšovho syna Saula, muža z\u00A0Benjamínovho kmeňa, na\u00A0štyridsať rokov. Keď ho odstránil, povolal im za\u00A0kráľa Dávida a vydal mu svedectvo: ‚Našiel som Dávida, syna Jesseho, muža podľa môjho srdca, ktorý bude plniť moju vôľu celú.'<br>" +
                            "Z jeho potomstva dal Boh podľa prisľúbenia Izraelu Spasiteľa, Ježiša. Pred\u00A0jeho príchodom Ján hlásal všetkému izraelskému ľudu krst pokánia. Keď Ján končil svoj beh, hovoril: ‚Ja nie som ten, za\u00A0koho ma pokladáte. Ale, hľa, po\u00A0mne prichádza ten, ktorému nie som hoden rozviazať obuv na\u00A0nohách.'\"<br>" +
                            "Počuli sme Božie slovo."},
            {"45", "5", "", "Sk 13, 26-33",
                    "Boh splnil prisľúbenie, keď vzkriesil Ježiša",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď prišiel Pavol do\u00A0Antiochie v\u00A0Pizídii, povedal v\u00A0synagóge: \"Bratia, synovia Abrahámovho rodu, a tí, čo sa u\u00A0vás boja Boha, nám bolo poslané toto slovo spásy.<br>" +
                            "Lebo obyvatelia Jeruzalema ani ich vodcovia ho nepoznali, odsúdili ho, a tak splnili slová Prorokov, ktoré sa čítajú každú sobotu. A hoci nenašli nič, za\u00A0čo by si zasluhoval smrť, dožadovali sa od\u00A0Piláta, aby ho dal zabiť. A keď splnili všetko, čo bolo o\u00A0ňom napísané, sňali ho z\u00A0dreva a uložili do\u00A0hrobu.<br>" +
                            "Ale Boh ho vzkriesil z\u00A0mŕtvych a on sa mnoho dní zjavoval tým, čo s\u00A0ním prišli z\u00A0Galiley do\u00A0Jeruzalema, a teraz sú jeho svedkami pred\u00A0ľudom.<br>" +
                            "A my vám zvestujeme, že prisľúbenie, ktoré dostali naši otcovia, Boh splnil ich deťom, keď nám vzkriesil Ježiša, ako je aj v\u00A0druhom žalme napísané: ‚Ty si môj syn. Ja som ťa dnes splodil.'\"<br>" +
                            "Počuli sme Božie slovo."},
            {"46", "6", "", "Sk 13, 44-52",
                    "Obraciame sa k\u00A0pohanom",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "V nasledujúcu sobotu sa skoro celé mesto zišlo počúvať Pánovo slovo. Keď Židia videli zástupy, plní žiarlivosti rúhavo odporovali tomu, čo hovoril Pavol.<br>" +
                            "Tu Pavol a Barnabáš povedali smelo: \"Predovšetkým vám sa malo hlásať Božie slovo, ale preto, že ho odmietate a sami sa pokladáte za\u00A0nehodných večného života, obraciame sa k\u00A0pohanom. Lebo tak nám prikázal Pán: ‚Ustanovil som ťa za\u00A0svetlo pohanom, aby si bol spásou až do\u00A0končín zeme.'\"<br>" +
                            "Keď to počuli pohania, radovali sa a oslavovali Pánovo slovo a uverili všetci, čo boli vopred určení pre\u00A0večný život. A Pánovo slovo sa šírilo po\u00A0celom kraji.<br>" +
                            "Ale Židia poštvali nábožné ženy z\u00A0vyšších vrstiev a popredných mešťanov, podnietili proti Pavlovi a Barnabášovi prenasledovanie a vyhnali ich zo\u00A0svojho kraja. Oni na\u00A0nich striasli prach z\u00A0nôh a odišli do\u00A0Ikónia. No učeníci boli naplnení radosťou a Duchom Svätým.<br>" +
                            "Počuli sme Božie slovo."},
            {"50", "A", "", "Sk 6, 1-7",
                    "Vyvolili si sedem mužov plných Ducha Svätého",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "V tých dňoch, keď počet učeníkov rástol, Helenisti začali šomrať na\u00A0Hebrejov, že pri\u00A0každodennom obsluhovaní zanedbávajú ich vdovy. Preto Dvanásti zvolali zhromaždenie učeníkov a povedali: \"Nie je správne, aby sme my zanedbávali Božie slovo a obsluhovali pri\u00A0stoloch. Preto si, bratia, vyhliadnite spomedzi seba sedem osvedčených mužov, plných Ducha a múdrosti, a na\u00A0túto úlohu ustanovíme ich. My sa budeme celkom venovať modlitbe a službe slova.\"<br>" +
                            "Táto reč sa páčila celému zhromaždeniu a vyvolili si Štefana, muža plného viery a Ducha Svätého, ďalej Filipa, Prochora, Nikanora, Timona, Parmenáša a Mikuláša, prozelytu z\u00A0Antiochie. Postavili ich pred\u00A0apoštolov a oni sa modlili a vložili na\u00A0nich ruky.<br>" +
                            "Božie slovo sa šírilo a počet učeníkov v\u00A0Jeruzaleme veľmi rástol. Aj veľa kňazov poslušne prijalo vieru.<br>" +
                            "Počuli sme Božie slovo."},
            {"50", "B", "", "Sk 9, 26-31",
                    "Porozprával im, ako na\u00A0ceste videl Pána",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď Šavol prišiel do\u00A0Jeruzalema, pokúšal sa spojiť s\u00A0učeníkmi, ale všetci sa ho báli, lebo neverili, že je učeníkom.<br>" +
                            "Tu sa ho ujal Barnabáš, zaviedol ho k\u00A0apoštolom a porozprával im, ako na\u00A0ceste videl Pána a že s\u00A0ním hovoril a ako smelo si v\u00A0Damasku počínal v\u00A0Ježišovom mene.<br>" +
                            "A žil s\u00A0nimi v\u00A0Jeruzaleme a smelo si počínal v\u00A0Pánovom mene. Rozprával a prel sa aj s\u00A0Helenistami a oni ho chceli zabiť. Keď sa to dozvedeli bratia, zaviedli ho do\u00A0Cézarey a poslali do\u00A0Tarzu.<br>" +
                            "A Cirkev mala pokoj po\u00A0celej Judei, Galilei a Samárii; upevňovala sa, žila v\u00A0bázni pred\u00A0Pánom a rástla v\u00A0úteche Svätého Ducha.<br>" +
                            "Počuli sme Božie slovo."},
            {"50", "C", "", "Sk 14, 21b-27",
                    "Rozpovedali cirkvi, aké veľké veci s\u00A0nimi urobil Boh",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Pavol a Barnabáš sa vrátili do\u00A0Lystry, Ikónia a Antiochie. Posilňovali srdcia učeníkov a povzbudzovali ich, aby vytrvali vo\u00A0viere a že do\u00A0Božieho kráľovstva máme vojsť cez\u00A0mnohé súženia. A keď im po\u00A0jednotlivých cirkvách ustanovili starších, modlili sa a postili a odporúčali ich Pánovi, v\u00A0ktorého uverili.<br>" +
                            "Potom prešli Pizídiou a prišli do\u00A0Pamfýlie. Hlásali slovo v\u00A0Perge, odišli do\u00A0Atálie a odtiaľ sa odplavili do\u00A0Antiochie, kde ich zverili Božej milosti na\u00A0dielo, ktoré práve dokončili.<br>" +
                            "Keď ta došli a zhromaždili cirkev, rozpovedali, aké veľké veci s\u00A0nimi urobil Boh a že pohanom otvoril dvere viery.<br>" +
                            "Počuli sme Božie slovo."},
            {"51", "1", "", "Sk 14, 5-18",
                    "Hlásame vám evanjelium, aby ste sa od\u00A0týchto márností obrátili k\u00A0živému Bohu",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď sa v\u00A0Ikóniu pohania a Židia so\u00A0svojimi predstavenými chystali prepadnúť, potupiť a ukameňovať Pavla a Barnabáša a oni sa to dozvedeli, utiekli do\u00A0lykaonských miest, do\u00A0Lystry a Derbe a do\u00A0kraja okolo nich a tam hlásali evanjelium.<br>" +
                            "V Lystre sedával istý muž s\u00A0chorými nohami. Bol od\u00A0narodenia chromý a nikdy nechodil. Počúval Pavla hovoriť a on sa naňho zahľadel. A keď videl, že má vieru a môže byť uzdravený, povedal veľkým hlasom: \"Postav sa rovno na\u00A0nohy!\" A on vyskočil a chodil.<br>" +
                            "Keď zástupy videli, čo Pavol urobil, po\u00A0lykaonsky kričali: \"Zostúpili k\u00A0nám bohovia v\u00A0ľudskej podobe.\" Barnabáša nazvali Jupiterom a Pavla Merkúrom, lebo on viedol reč.<br>" +
                            "A kňaz Jupiterovho chrámu na\u00A0predmestí priviedol k\u00A0bráne býkov s\u00A0vencami a chcel s\u00A0ľuďmi obetovať. Keď sa o\u00A0tom dopočuli apoštoli Barnabáš a Pavol, roztrhli si šaty, vybehli medzi zástup a kričali: \"Mužovia, čo to robíte? Aj my sme smrteľní ľudia ako vy. Hlásame vám evanjelium, aby ste sa od\u00A0týchto márností obrátili k\u00A0živému Bohu, ktorý stvoril nebo a zem i more a všetko, čo je v\u00A0nich. On v\u00A0minulých pokoleniach nechal všetky národy ísť svojou cestou, ale bez\u00A0svedectva o\u00A0sebe samom neostával, lebo dobre robil: z\u00A0neba vám dával dážď a úrodné časy a napĺňal vaše srdcia pokrmom a radosťou.\"<br>" +
                            "Toto hovorili a len-len že utíšili zástupy, aby im neobetovali.<br>" +
                            "Počuli sme Božie slovo."},
            {"52", "2", "", "Sk 14, 19-28",
                    "Rozpovedali cirkvi, aké veľké veci s\u00A0nimi urobil Boh",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Z Antiochie a Ikónia prišli Židia, naviedli zástupy a Pavla kameňovali. Potom ho vyvliekli za\u00A0mesto v\u00A0domnení, že je mŕtvy. Ale keď ho obstúpili učeníci, vstal a vošiel do\u00A0mesta. Na\u00A0druhý deň odišiel s\u00A0Barnabášom do\u00A0Derbe.<br>" +
                            "Aj tomu mestu hlásali evanjelium a získali mnoho učeníkov. Potom sa vrátili do\u00A0Lystry, Ikónia a Antiochie.<br>" +
                            "Posilňovali srdcia učeníkov a povzbudzovali ich, aby vytrvali vo\u00A0viere a že do\u00A0Božieho kráľovstva máme vojsť cez\u00A0mnohé súženia.<br>" +
                            "A keď im po\u00A0jednotlivých cirkvách ustanovili starších, modlili sa a postili a odporúčali ich Pánovi, v\u00A0ktorého uverili.<br>" +
                            "Potom prešli Pizídiou a prišli do\u00A0Pamfýlie. Hlásali slovo v\u00A0Perge, odišli do\u00A0Atálie a odtiaľ sa odplavili do\u00A0Antiochie, kde ich zverili Božej milosti na\u00A0dielo, ktoré práve dokončili.<br>" +
                            "Keď ta došli a zhromaždili cirkev, rozpovedali, aké veľké veci s\u00A0nimi urobil Boh a že pohanom otvoril dvere viery.<br>" +
                            "A zostali dlhší čas s\u00A0učeníkmi.<br>" +
                            "Počuli sme Božie slovo."},
            {"53", "3", "", "Sk 15, 1-6",
                    "Rozhodli, že pôjdu s\u00A0touto spornou otázkou k\u00A0apoštolom a starším do\u00A0Jeruzalema",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Prišli niektorí z\u00A0Judey a poúčali bratov: \"Ak sa nedáte obrezať podľa Mojžišovho predpisu, nemôžete byť spasení.\"<br>" +
                            "Keď sa s\u00A0nimi Pavol a Barnabáš dostali do\u00A0sporu a nie malej hádky, rozhodli, že Pavol, Barnabáš a niektorí ďalší z\u00A0nich pôjdu s\u00A0touto spornou otázkou k\u00A0apoštolom a starším do\u00A0Jeruzalema.<br>" +
                            "Cirkev ich teda vypravila a oni išli cez\u00A0Feníciu a Samáriu a rozprávali, ako sa obrátili pohania, a všetkým bratom pôsobili veľkú radosť. Keď prišli do\u00A0Jeruzalema, prijala ich cirkev, apoštoli a starší a oni vyrozprávali, aké veľké veci s\u00A0nimi urobil Boh.<br>" +
                            "Tu vstali niektorí, čo uverili zo\u00A0sekty farizejov, a hovorili: \"Treba ich obrezať a prikázať im, že musia zachovávať Mojžišov zákon.\"<br>" +
                            "\"Apoštoli a starší sa zišli a skúmali túto vec.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"54", "4", "", "Sk 15, 7-21",
                    "Myslím si, že neslobodno znepokojovať tých, čo sa z\u00A0pohanov obracajú k\u00A0Bohu",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď nastala veľká hádka, vstal Peter a povedal apoštolom a starším: \"Bratia, vy viete, že Boh si ma od\u00A0prvých dní vyvolil spomedzi vás, aby pohania z\u00A0mojich úst počuli slovo evanjelia a uverili. A Boh, ktorý pozná srdcia, vydal im svedectvo, keď im dal Ducha Svätého tak ako nám; a neurobil nijaký rozdiel medzi nami a nimi, keď vierou očistil ich srdcia.<br>" +
                            "Prečo teda teraz pokúšate Boha a chcete položiť na\u00A0šiju učeníkov jarmo, ktoré nevládali niesť ani naši otcovia, ani my?! A veríme, že aj my budeme spasení milosťou Pána Ježiša takisto ako oni.\"<br>" +
                            "Celé zhromaždenie stíchlo a počúvali Barnabáša a Pavla, ktorí rozprávali, aké veľké znamenia a divy urobil Boh prostredníctvom nich medzi pohanmi.<br>" +
                            "Keď sa odmlčali, ozval sa Jakub: \"Bratia vypočujte ma! Šimon porozprával, ako Boh prvý raz zhliadol a vybral si z\u00A0pohanov ľud pre\u00A0svoje meno.<br>" +
                            "S tým sa zhodujú aj slová Prorokov, ako je napísané: ‚Potom sa vrátim a znova vybudujem zborený Dávidov stánok; znova postavím jeho ruiny a vztýčim ho, aby aj ostatní ľudia hľadali Pána, všetky národy, nad\u00A0ktorými sa vzývalo moje meno, hovorí Pán, čo robí tieto veci, známe od\u00A0vekov.' Preto si myslím, že neslobodno znepokojovať tých, čo sa z\u00A0pohanov obracajú k\u00A0Bohu, ale im treba napísať, aby sa zdŕžali poškvrneného modlami, smilstva, zaduseného a krvi. Mojžiš má totiž od\u00A0dávnych pokolení v\u00A0každom meste kazateľov po\u00A0synagógach, kde ho každú sobotu čítajú.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"55", "5", "", "Sk 15, 22-31",
                    "Duch Svätý a my sme usúdili, že nebudeme na\u00A0vás klásť nijaké iné bremeno okrem toho nevyhnutného",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Apoštoli a starší sa s\u00A0celou cirkvou uzniesli, že spomedzi seba vyberú mužov a pošlú ich s\u00A0Pavlom a Barnabášom do\u00A0Antiochie. Boli to Júda, ktorý sa volal Barsabáš, a Sílas, poprední muži medzi bratmi. Po\u00A0nich poslali tento list: \"Apoštoli a starší bratia pozdravujú bratov z\u00A0pohanov v\u00A0Antiochii, Sýrii a Cilícii.<br>" +
                            "Počuli sme, že vás niektorí, čo vyšli z\u00A0nás, znepokojili a rozvrátili vám srdcia rečami, hoci sme ich ničím nepoverili. Preto sme sa zhromaždili a jednomyseľne sme sa uzniesli, že vyberieme mužov a pošleme ich k\u00A0vám s\u00A0našimi drahými Barnabášom a Pavlom, ľuďmi, ktorí vydali svoj život za\u00A0meno nášho Pána Ježiša Krista. Vyslali sme teda Júdu a Sílasa a oni vám aj ústne povedia to isté.<br>" +
                            "Lebo Duch Svätý a my sme usúdili, že nebudeme na\u00A0vás klásť nijaké iné bremeno okrem toho nevyhnutného: zdŕžať sa mäsa obetovaného modlám, krvi, udusených zvierat a smilstva. Ak sa budete tohoto chrániť, budete konať správne. Buďte zdraví!\"<br>" +
                            "Keď ich vypravili, odišli do\u00A0Antiochie, zvolali zhromaždenie a odovzdali list. Keď ho prečítali, radovali sa z\u00A0tejto útechy.<br>" +
                            "Počuli sme Božie slovo."},
            {"56", "6", "", "Sk 16, 1-10",
                    "Prejdi do\u00A0Macedónska a pomôž nám!",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Pavol prišiel aj do\u00A0Derbe a Lystry.<br>" +
                            "Tam bol istý učeník menom Timotej, syn veriacej Židovky, ale otec bol Grék. Bratia v\u00A0Lystre a v\u00A0Ikóniu mu vydali svedectvo. Pavol chcel, aby šiel s\u00A0ním, a kvôli Židom, čo tam bývali, ho vzal a obrezal, lebo všetci vedeli, že jeho otec bol Grék.<br>" +
                            "Ako chodili po\u00A0mestách, odovzdávali im učenie, ktoré vyhlásili apoštoli a starší v\u00A0Jeruzaleme, aby ho zachovávali. Cirkvi sa upevňovali vo\u00A0viere a deň čo deň sa zväčšovali počtom.<br>" +
                            "Prešli cez\u00A0Frýgiu a galatský kraj, lebo Svätý Duch im bránil hlásať slovo v\u00A0Ázii. Keď došli k\u00A0Mýzii, pokúšali sa dostať do\u00A0Bitýnie, ale Ježišov Duch im to nedovolil.<br>" +
                            "Obišli teda Mýziu a zišli do\u00A0Troady. Tam mal Pavol v\u00A0noci videnie. Stál pred\u00A0ním akýsi Macedónčan a prosil ho: \"Prejdi do\u00A0Macedónska a pomôž nám!\" Hneď ako mal toto videnie, usilovali sme sa odísť do\u00A0Macedónska, presvedčení, že nás Boh volá hlásať im evanjelium.<br>" +
                            "Počuli sme Božie slovo."},
            {"60", "A", "", "Sk 8, 5-8. 14-17",
                    "Vložili na\u00A0nich ruky a dostali Ducha Svätého",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Filip prišiel do\u00A0mesta Samárie a zvestoval im Krista. Zástupy pozorne a jednomyseľne sledovali, čo Filip hovorí, pretože počuli i videli, že robí znamenia. Lebo z\u00A0mnohých posadnutých vychádzali s\u00A0veľkým krikom nečistí duchovia a mnohí ochrnutí a chromí ozdraveli. A v\u00A0meste nastala veľká radosť.<br>" +
                            "Keď sa apoštoli, ktorí boli v\u00A0Jeruzaleme, dopočuli, že Samária prijala Božie slovo, vyslali k\u00A0nim Petra a Jána. Oni ta zašli a modlili sa za\u00A0nich, aby dostali Ducha Svätého, lebo na\u00A0nikoho z\u00A0nich ešte nezostúpil; boli iba pokrstení v\u00A0mene Pána Ježiša. Potom na\u00A0nich vložili ruky a dostali Ducha Svätého.<br>" +
                            "Počuli sme Božie slovo."},
            {"60", "B", "", "Sk 10, 25-26. 34-35. 44-48",
                    "Dar Ducha Svätého sa vylial aj na\u00A0pohanov",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď Peter prišiel do\u00A0Cézarey, vyšiel mu v\u00A0ústrety Kornélius, padol mu k\u00A0nohám a poklonil sa. Ale Peter ho zdvihol a povedal mu: \"Vstaň, aj ja som len človek.\"<br>" +
                            "Vtedy Peter otvoril ústa a povedal: \"Naozaj poznávam, že Boh nenadŕža nikomu, ale v\u00A0každom národe mu je milý ten, kto sa ho bojí a koná spravodlivo.<br>" +
                            "Kým Peter toto hovoril, zostúpil Duch Svätý na\u00A0všetkých, čo počúvali slovo. A veriaci z\u00A0obriezky, čo prišli s\u00A0Petrom, žasli, že sa dar Ducha Svätého vylial aj na\u00A0pohanov, lebo ich počuli hovoriť jazykmi a velebiť Boha.<br>" +
                            "Vtedy Peter povedal: \"Môže ešte niekto zabrániť, aby boli vodou pokrstení tí, čo dostali Ducha Svätého tak ako my?\" A rozkázal ich pokrstiť v\u00A0mene Ježiša Krista.<br>" +
                            "Potom ho prosili, aby u\u00A0nich niekoľko dní zostal.<br>" +
                            "Počuli sme Božie slovo."},
            {"60", "C", "", "Sk 15, 1-2. 22-29",
                    "Duch Svätý a my sme usúdili, že nebudeme na\u00A0vás klásť nijaké iné bremeno okrem toho nevyhnutného",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Tu prišli niektorí z\u00A0Judey a poúčali bratov: \"Ak sa nedáte obrezať podľa Mojžišovho predpisu, nemôžete byť spasení.\"<br>" +
                            "Keď sa s\u00A0nimi Pavol a Barnabáš dostali do\u00A0sporu a nie malej hádky, rozhodli, že Pavol, Barnabáš a niektorí ďalší z\u00A0nich pôjdu s\u00A0touto spornou otázkou k\u00A0apoštolom a starším do\u00A0Jeruzalema.<br>" +
                            "Vtedy sa apoštoli a starší s\u00A0celou cirkvou uzniesli, že spomedzi seba vyberú mužov a pošlú ich s\u00A0Pavlom a Barnabášom do\u00A0Antiochie. Boli to Júda, ktorý sa volal Barsabáš, a Sílas, poprední muži medzi bratmi. Po\u00A0nich poslali tento list: \"Apoštoli a starší bratia pozdravujú bratov z\u00A0pohanov v\u00A0Antiochii, Sýrii a Cilícii. Počuli sme, že vás niektorí, čo vyšli z\u00A0nás, znepokojili a rozvrátili vám srdcia rečami, hoci sme ich ničím nepoverili. Preto sme sa zhromaždili a jednomyseľne sme sa uzniesli, že vyberieme mužov a pošleme ich k\u00A0vám s\u00A0našimi drahými Barnabášom a Pavlom, ľuďmi, ktorí vydali svoj život za\u00A0meno nášho Pána Ježiša Krista. Vyslali sme teda Júdu a Sílasa a oni vám aj ústne povedia to isté. Lebo Duch Svätý a my sme usúdili, že nebudeme na\u00A0vás klásť nijaké iné bremeno okrem toho nevyhnutného: zdŕžať sa mäsa obetovaného modlám, krvi, udusených zvierat a smilstva. Ak sa budete tohoto chrániť, budete konať správne. Buďte zdraví!\"<br>" +
                            "Počuli sme Božie slovo."},
            {"61", "1", "", "Sk 16, 11-15",
                    "Pán jej otvoril srdce, aby pozorne sledovala, čo Pavol hovorí",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Odplavili sme sa z\u00A0Troady, priamym smerom sme prišli do\u00A0Samotrácie, na\u00A0druhý deň do\u00A0Neapola a odtiaľ do\u00A0Filíp. Je to prvé mesto tej časti Macedónska a kolónia.<br>" +
                            "V tomto meste sme sa niekoľko dni zdržali. V sobotu sme vyšli za\u00A0bránu k\u00A0rieke, lebo sme predpokladali, že sa tam modlia. Sadli sme si a hovorili sme so\u00A0ženami, čo sa tam zišli.<br>" +
                            "Počúvala aj istá žena menom Lýdia, predavačka purpuru z\u00A0mesta Tyatiry, ktorá si ctila Boha: Pán jej otvoril srdce, aby pozorne sledovala, čo Pavol hovorí. A keď sa dala so\u00A0svojím domom pokrstiť, prosila nás: \"Ak si myslíte, že som verná Pánovi, poďte do\u00A0môjho domu a zostaňte.\" A prinútila nás.<br>" +
                            "Počuli sme Božie slovo."},
            {"62", "2", "", "Sk 16, 22-34",
                    "Ver v\u00A0Pána Ježiša a budeš spasený ty aj tvoj dom",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Vo Filipách sa zhŕkol dav proti Pavlovi a Sílasovi a úradníci im postŕhali šaty a rozkázali ich zbičovať. Keď im vymerali veľa rán, vrhli ich do\u00A0väzenia a strážcovi prikázali, aby ich dobre strážil. On ich podľa tohoto rozkazu vsadil do\u00A0vnútorného žalára a nohy im privrel do\u00A0klady.<br>" +
                            "O polnoci sa Pavol a Sílas modlili a spievali Bohu chválospevy a väzni ich počúvali. Zrazu nastalo veľké zemetrasenie, až sa pohli základy žalára. Hneď sa otvorili všetky dvere a všetkým sa uvoľnili putá. Keď sa strážca väzenia prebudil a videl dvere väzenia otvorené, vytasil meč a chcel sa zabiť, lebo si myslel, že väzni ušli. Ale Pavol skríkol veľkým hlasom: \"Neubližuj si, lebo sme tu všetci!\"<br>" +
                            "Vypýtal si svetlo, vbehol dnu a s\u00A0chvením padol pred\u00A0Pavla a Sílasa. Vyviedol ich von a vravel: \"Páni, čo mám robiť, aby som bol spasený?\"<br>" +
                            "Oni povedali: \"Ver v\u00A0Pána Ježiša a budeš spasený ty aj tvoj dom.\" A zvestovali Pánovo slovo jemu aj všetkým, čo boli v\u00A0jeho dome.<br>" +
                            "V tú nočnú hodinu ich vzal, vymyl im rany a hneď sa dal pokrstiť on i všetci jeho domáci. Potom ich zaviedol do\u00A0domu, prestrel stôl a radoval sa s\u00A0celým svojím domom, že uveril Bohu.<br>" +
                            "Počuli sme Božie slovo."},
            {"63", "3", "", "Sk 17, 15. 22 – 18, 1",
                    "Čo uctievate, hoci to nepoznáte, to vám ja zvestujem",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Tí, čo odprevádzali Pavla, zaviedli ho až do\u00A0Atén. Tam dostali príkaz pre\u00A0Silasa a Timoteja, aby čím skôr prišli za\u00A0ním; a vrátili sa.<br>" +
                            "Pavol si stal doprostred areopágu a hovoril: \"Aténčania, podľa všetkého vidím, že ste neobyčajne nábožní. Lebo keď som sa prechádzal a prezeral si vaše svätyne, našiel som aj oltár s\u00A0nápisom: ‚Neznámemu bohu.' Čo teda uctievate, hoci to nepoznáte, to vám ja zvestujem.<br>" +
                            "Boh, ktorý stvoril svet a všetko, čo je v\u00A0ňom, pretože je Pánom neba i zeme, nebýva v\u00A0chrámoch zhotovených rukou, ani sa mu neslúži ľudskými rukami, akoby niečo potreboval, veď on dáva všetkým život, dych a všetko a z\u00A0jedného urobil celé ľudské pokolenie, aby obývalo celý povrch zeme; určil im vymedzený čas a hranice ich bývania, aby hľadali Boha, ak by ho dajako nahmatali a našli, hoci od\u00A0nikoho z\u00A0nás nie je ďaleko. Lebo v\u00A0ňom žijeme, hýbeme sa a sme, ako to aj niektorí z\u00A0vašich básnikov povedali: ‚Veď aj jeho pokolenie sme.'<br>" +
                            "Keď sme teda Božím pokolením, nemáme si myslieť, že božstvo sa podobá zlatu, striebru alebo kameňu, výtvoru ľudského umenia a dômyslu.<br>" +
                            "Ale Boh prehliadol časy nevedomosti a teraz zvestuje ľuďom, aby všetci a všade robili pokánie, lebo určil deň, keď bude spravodlivo súdiť zemekruh skrze muža, ktorého na\u00A0to ustanovil a všetkým osvedčil tým, že ho vzkriesil z\u00A0mŕtvych.\"<br>" +
                            "Ako počuli o\u00A0vzkriesení z\u00A0mŕtvych, niektorí sa posmievali, iní hovorili: \"Vypočujeme ťa o\u00A0tom inokedy.\" Tak Pavol spomedzi nich odišiel.<br>" +
                            "No niektorí muži sa pripojili k\u00A0nemu a uverili. Medzi nimi aj Dionýz Areopagita, žena menom Damaris a iní s\u00A0nimi.<br>" +
                            "Potom z\u00A0Atén odišiel a prišiel do\u00A0Korintu.<br>" +
                            "Počuli sme Božie slovo."},


            {"64", "4", "", "Sk 18, 1-8",
                    "Zostal u\u00A0nich a pracoval a hovoril v\u00A0synagóge",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Pavol odišiel z\u00A0Atén a prišiel do\u00A0Korintu. Tam našiel Žida menom Akvilu, rodom Ponťana, ktorý nedávno prišiel z\u00A0Itálie, i jeho manželku Priscillu, lebo Klaudius nariadil, že všetci Židia musia opustiť Rím. Pripojil sa k\u00A0nim, a pretože mal to isté remeslo, zostal u\u00A0nich a pracoval; boli výrobcami stanov. Každú sobotu hovoril v\u00A0synagóge a presviedčal Židov i Grékov. <br>" +
                            "Keď prišli z\u00A0Macedónska Sílas a Timotej, Pavol sa celkom veno¬val slovu a dosvedčoval Židom, že Ježiš je Mesiáš. <br>" +
                            "Ale keď mu protirečili a rúhali sa, otriasol si odev a povedal im: \"Vaša krv na\u00A0vašu hlavu! Ja som čistý. Odteraz pôjdem k\u00A0pohanom.\" <br>" +
                            "Odišiel odtiaľ a vošiel do\u00A0domu istého človeka, čo si ctil Boha, menom Títa Justa; jeho dom bol spojený so\u00A0synagógou. A predstavený synagógy Krispus uveril Pánovi s\u00A0celým svojím domom; aj mnohí Korinťania, ktorí počúvali, uverili a dali sa pokrstiť. <br>" +
                            "Počuli sme Božie slovo."},
            {"65", "5", "", "Sk 18, 9-18",
                    "Mám v\u00A0tomto meste mnoho ľudu",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď bol Pavol v\u00A0Korinte, Pán mu povedal v\u00A0noci vo\u00A0videní: \"Neboj sa, len hovor a nemlč, veď som s\u00A0tebou ja a nik nesiahne na\u00A0teba, aby ti ublížil, lebo mám v\u00A0tomto meste mnoho ľudu.\" Zostal tam teda rok a šesť mesiacov a učil u\u00A0nich Božie slovo.<br>" +
                            "Keď bol v\u00A0Achájsku prokonzulom Gallio, Židia svorne povstali proti Pavlovi, priviedli ho pred\u00A0súdnu stolicu a hovorili: \"Tento navádza ľudí, aby protizákonne uctievali Boha.\"<br>" +
                            "Ale keď sa Pavol chystal otvoriť ústa, povedal Gallio Židom: \"Židia, keby šlo o\u00A0nejakú krivdu alebo o\u00A0podlý zločin, vypočul by som vás, ako sa patrí. Ale keď sú to spory o\u00A0slovo, o\u00A0mená a o\u00A0váš zákon, to je vaša vec. Ja v\u00A0takýchto veciach nechcem byť sudcom.\" A odohnal ich od\u00A0súdnej stolice.<br>" +
                            "Tu všetci chytili predstaveného synagógy Sostena a pred\u00A0súdnou stolicou ho zbili. A Gallio sa o\u00A0to vôbec nestaral.<br>" +
                            "Pavol tam zostal ešte veľa dní; potom sa s\u00A0bratmi rozlúčil a odplavil sa do\u00A0Sýrie a s\u00A0ním aj Priscilla a Akvila. V Kenchreách si dal ostrihať hlavu, lebo mal sľub.<br>" +
                            "Počuli sme Božie slovo."},
            {"66", "6", "", "Sk 18, 23-28",
                    "Apollo dokazoval z\u00A0Písem, že Ježiš je Mesiáš",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Pavol pobudol nejaký čas v\u00A0Antiochii a šiel ďalej. Postupne prechádzal galatským krajom a Frýgiou a povzbudzoval všetkých učeníkov.<br>" +
                            "Do Efezu prišiel istý Žid menom Apollo, rodom Alexandrijčan, muž výrečný a zbehlý v\u00A0Písmach. Bol poučený o\u00A0Pánovej ceste a so\u00A0zápalom ducha hovoril a správne učil o\u00A0Ježišovi, hoci poznal iba Jánov krst. Začal teda smelo vystupovať v\u00A0synagóge. Keď ho počuli Priscilla a Akvila, vzali ho k\u00A0sebe a dôkladnejšie mu vysvetlili Božiu cestu.<br>" +
                            "A keď chcel odísť do\u00A0Achájska, bratia ho povzbudzovali a napísali učeníkom, aby ho prijali. Keď ta prišiel, veľmi pomohol tým, čo z\u00A0milosti uverili. Lebo rázne usviedčal Židov a verejne dokazoval z\u00A0Písem, že Ježiš je Mesiáš.<br>" +
                            "Počuli sme Božie slovo."},
            {"70", "A", "", "Sk 1, 12-14",
                    "Zotrvávali na\u00A0modlitbách spolu s\u00A0Ježišovou matkou Máriou",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď bol Ježiš vzatý do\u00A0neba, apoštoli sa vrátili do\u00A0Jeruzalema z\u00A0hory, ktorá sa volá Olivová a je blízko Jeruzalema, vzdialená toľko, koľko je dovolené prejsť v\u00A0sobotu.<br>" +
                            "Keď ta prišli, vystúpili do\u00A0hornej siene, kde sa zdržiavali Peter a Ján, Jakub a Ondrej, Filip a Tomáš, Bartolomej a Matúš, Jakub Alfejov, Šimon Horlivec a Júda Jakubov.<br>" +
                            "Títo všetci jednomyseľne zotrvávali na\u00A0modlitbách spolu so\u00A0ženami, s\u00A0Ježišovou matkou Máriou a s\u00A0jeho bratmi.<br>" +
                            "Počuli sme Božie slovo."},
            {"70", "B", "", "Sk 1, 15-17. 20a. 20d-26",
                    "Aby sa jeden z\u00A0nich stal s\u00A0nami svedkom jeho zmŕtvychvstania",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "V tých dňoch vstal Peter uprostred bratov – bolo tam zhromaždených asi stodvadsať ľudí – a povedal: \"Bratia, muselo sa splniť Písmo, kde predpovedal Duch Svätý ústami Dávida o\u00A0Judášovi, ktorý bol vodcom tých, čo zajali Ježiša; patril do\u00A0nášho počtu a dostal podiel na\u00A0tej istej službe. Lebo v\u00A0knihe Žalmov je napísané: ‚Jeho úrad nech prevezme iný.'<br>" +
                            "Treba teda, aby sa z\u00A0týchto mužov, čo boli s\u00A0nami celý čas, keď medzi nami žil Pán Ježiš, počnúc Jánovým krstom až do\u00A0dňa, keď bol od\u00A0nás vzatý, aby sa jeden z\u00A0nich stal s\u00A0nami svedkom jeho zmŕtvychvstania.\"<br>" +
                            "A tak postavili dvoch: Jozefa, ktorý sa volal Barsabáš, s\u00A0prímením Justus, a Mateja. A modlili sa: \"Pane, ty poznáš srdcia všetkých ľudí; ukáž, ktorého z\u00A0týchto dvoch si si vyvolil, aby zaujal miesto v\u00A0tejto službe a apoštoláte, ktorým sa Judáš spreneveril, aby odišiel na\u00A0svoje miesto.\"<br>" +
                            "Potom im dali lósy a lós padol na\u00A0Mateja. I pripočítali ho k\u00A0jedenástim apoštolom.<br>" +
                            "Počuli sme Božie slovo."},
            {"70", "C", "", "Sk 7, 55-60",
                    "Vidím Syna človeka stáť po\u00A0pravici Boha",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Štefan, plný Ducha Svätého, uprene sa zahľadel na\u00A0nebo, uvidel Božiu slávu a Ježiša stáť po\u00A0pravici Boha a povedal: \"Vidím otvorené nebo a Syna človeka stáť po\u00A0pravici Boha.\" Strašne vykríkli, zapchávali si uši a všetci sa naňho vrhli. Vyhnali ho za\u00A0mesto a kameňovali. Svedkovia si odložili šaty k\u00A0nohám mladého muža, ktorý sa volal Šavol.<br>" +
                            "Štefana kameňovali a on sa modlil: \"Pane Ježišu, prijmi môjho ducha.\"<br>" +
                            "Potom si kľakol a zvolal veľkým hlasom: \"Pane, nezapočítaj im tento hriech.\" A len čo to povedal, zomrel.<br>" +
                            "Počuli sme Božie slovo."},
            {"71", "1", "", "Sk 19, 1-8",
                    "Dostali ste aj Ducha Svätého, keď ste uverili?",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Kým bol Apollo v\u00A0Korinte, Pavol pochodil po\u00A0horných krajoch a prišiel do\u00A0Efezu. Tam našiel akýchsi učeníkov a povedal im: \"Dostali ste aj Ducha Svätého, keď ste uverili?\"<br>" +
                            "Oni mu odvetili: \"Ani sme nepočuli, že je Duch Svätý.\"<br>" +
                            "On sa opýtal: \"Ako ste teda boli pokrstení?\"<br>" +
                            "Oni odpovedali: \"Jánovým krstom.\"<br>" +
                            "Pavol povedal: \"Ján krstil krstom pokánia a hovoril ľudu, aby uverili v\u00A0toho, ktorý prichádzal po\u00A0ňom, to jest v\u00A0Ježiša.\"<br>" +
                            "Keď to počuli, dali sa pokrstiť v\u00A0mene Pána Ježiša. A keď na\u00A0nich Pavol vložil ruky, zostúpil na\u00A0nich Duch Svätý; i hovorili jazykmi a prorokovali. Spolu ich bolo asi dvanásť mužov.<br>" +
                            "Potom vošiel do\u00A0synagógy a smelo hovoril; tri mesiace rozprával a presviedčal o\u00A0Božom kráľovstve.<br>" +
                            "Počuli sme Božie slovo."},
            {"72", "2", "", "Sk 20, 17-27",
                    "Dokončil som svoj beh a službu, ktorú som dostal od\u00A0Pána Ježiša",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Pavol z\u00A0Milétu poslal do\u00A0Efezu a zavolal si starších cirkvi. Keď k\u00A0nemu prišli, povedal im: \"Vy viete, ako som bol s\u00A0vami celý čas od\u00A0prvého dňa, čo som vkročil do\u00A0Ázie; ako som slúžil Pánovi so\u00A0všetkou pokorou v\u00A0slzách a skúškach, ktoré na\u00A0mňa doliehali z\u00A0úkladov Židov; ako som nezanedbal zvestovať vám všetko užitočné a učil som vás verejne i po\u00A0domoch; ako som zaprisahával Židov aj Grékov, že sa majú obrátiť k\u00A0Bohu a uveriť v\u00A0nášho Pána Ježiša.<br>" +
                            "A teraz spútaný Duchom idem do\u00A0Jeruzalema, hoci neviem, čo ma tam čaká. Len Duch Svätý ma vo\u00A0všetkých mestách uisťuje, že ma očakávajú okovy a súženie. Svoj život si však veľmi necením, len aby som dokončil svoj beh a službu, ktorú som dostal od\u00A0Pána Ježiša: svedčiť o\u00A0evanjeliu Božej milosti.<br>" +
                            "A teraz viem, že už neuvidíte moju tvár: nik z\u00A0vás, medzi ktorými som chodil a ohlasoval kráľovstvo. Preto vám v\u00A0dnešný deň dosvedčujem, že som čistý od\u00A0krvi všetkých, lebo som neušiel bez\u00A0toho, že by som vám nezvestoval Božiu vôľu celú.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"73", "3", "", "Sk 20, 28-38",
                    "Odporúčam vás Bohu, ktorý má moc budovať a dať dedičstvo",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Pavol hovoril starším efezskej cirkvi: \"Dávajte pozor na\u00A0seba a na\u00A0celé stádo, v\u00A0ktorom vás Duch Svätý ustanovil za\u00A0biskupov, aby ste pásli Božiu Cirkev, ktorú si získal vlastnou krvou.<br>" +
                            "Ja viem, že po\u00A0mojom odchode vniknú medzi vás draví vlci a nebudú šetriť stádo. Ba aj z\u00A0vás samých povstanú muži, čo budú prevrátene hovoriť, aby strhli učeníkov za\u00A0sebou.<br>" +
                            "Preto bdejte a pamätajte, že som tri roky vo\u00A0dne v\u00A0noci neprestával so\u00A0slzami napomínať každého z\u00A0vás.<br>" +
                            "A teraz vás odporúčam Bohu a slovu jeho milosti: ono má moc budovať a dať dedičstvo medzi všetkými posvätenými.<br>" +
                            "Netúžil som po\u00A0ničom striebre ani zlate ani odeve. Sami viete, že tieto ruky vyslúžili všetko, čo som potreboval ja a títo tu so\u00A0mnou.<br>" +
                            "Vo všetkom som vám ukázal, že treba takto pracovať a ujímať sa slabých a pamätať na\u00A0slová Pána Ježiša; lebo on povedal: ‚Blaženejšie je dávať, ako prijímať.'\"<br>" +
                            "Keď to povedal, kľakol si a modlil sa s\u00A0nimi všetkými. Všetci sa dali do\u00A0veľkého plaču, vešali sa Pavlovi okolo krku a bozkávali ho. Najviac ich bolelo jeho slovo, že už neuvidia jeho tvár.<br>" +
                            "A vyprevadili ho na\u00A0loď.<br>" +
                            "Počuli sme Božie slovo."},
            {"74", "4", "", "Sk 22, 30; 23, 6-11",
                    "Musíš svedčiť aj v\u00A0Ríme",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keďže veliteľ chcel presne vedieť, z\u00A0čoho Židia obviňujú Pavla, na\u00A0druhý deň mu sňal putá, rozkázal, aby sa zišli veľkňazi a celá veľrada, priviedol Pavla a postavil ho pred\u00A0nich.<br>" +
                            "Ale Pavol vedel, že jedna časť sú saduceji a druhá farizeji, preto zvolal vo\u00A0veľrade: \"Bratia, ja som farizej, syn farizejov. Pre\u00A0nádej a zmŕtvychvstanie ma súdia.\"<br>" +
                            "Ako to povedal, nastala medzi farizejmi a saducejmi hádka a zhromaždenie sa rozčeslo. Lebo saduceji tvrdia, že niet zmŕtvychvstania ani anjela ani ducha, kým farizeji vyznávajú jedno i druhé. Strhol sa veľký krik a vstali niektorí zákonníci z\u00A0časti farizejov a protestovali: \"Nenachádzame nič zlé na\u00A0tomto človekovi. A čo ak s\u00A0ním hovoril duch alebo anjel?!\"<br>" +
                            "Keď hádka silnela, veliteľ z\u00A0obavy, že Pavla roztrhajú, poslal dolu vojakov, aby im ho vyrvali a odviedli do\u00A0pevnosti.<br>" +
                            "V nasledujúcu noc stál pred\u00A0ním Pán a hovoril: \"Buď pevný! Lebo ako si o\u00A0mne svedčil v\u00A0Jeruzaleme, tak musíš svedčiť aj v\u00A0Ríme.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"75", "5", "", "Sk 25, 13b-21",
                    "Mŕtvy Ježiš, o\u00A0ktorom Pavol tvrdí, že žije",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Do Cézarey prišli kráľ Agrippa a Berenika a pozdravili Festa. Keď tam boli už viac dní, Festus sa zmienil kráľovi o\u00A0Pavlovi: \"Félix tu nechal vo\u00A0väzení istého muža. Keď som bol v\u00A0Jeruzaleme, prišli kvôli nemu za\u00A0mnou veľkňazi a židovskí starší a žiadali ho odsúdiť. Odpovedal som im, že Rimania nevydávajú nikoho skôr, kým obžalovaný nedostane možnosť brániť sa proti obvineniu v\u00A0prítomnosti žalobcov.<br>" +
                            "Keď teda prišli sem, bez\u00A0prieťahov som v\u00A0nasledujúci deň sadol na\u00A0súdnu stolicu a rozkázal som priviesť toho muža. Žalobcovia ho obstúpili, ale nevzniesli nijaké obvinenie zo\u00A0zločinov, z\u00A0ktorých som ho podozrieval. Mali s\u00A0ním nejaké spory o\u00A0ich náboženstve a o\u00A0akomsi mŕtvom Ježišovi, o\u00A0ktorom Pavol tvrdí, že žije.<br>" +
                            "Ja v\u00A0rozpakoch, ako riešiť takýto spor, vravel som, či by nechcel ísť do\u00A0Jeruzalema a tam sa dať súdiť z\u00A0tých vecí. Ale Pavol sa odvolal, aby ho strážili až do\u00A0rozhodnutia Jeho Veličenstva. Tak som ho rozkázal strážiť, kým ho nepošlem k\u00A0cisárovi.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"76", "6", "", "Sk 28, 16-20. 30-31",
                    "Zostal v\u00A0Ríme a ohlasoval Božie kráľovstvo",
                    "Čítanie zo Skutkov apoštolov<br>" +
                            "Keď sme prišli do\u00A0Ríma, dovolili Pavlovi bývať oddelene len s\u00A0vojakom, čo ho strážil.<br>" +
                            "O tri dni zvolal popredných Židov. Keď sa zišli, povedal im: \"Bratia, ja som nič neurobil ani proti ľudu, ani proti otcovským zvykom, a predsa ma v\u00A0Jeruzaleme uväznili a vydali do\u00A0rúk Rimanov. Oni ma vypočuli a chceli ma prepustiť, lebo som neurobil nič, za\u00A0čo by som si zasluhoval smrť.<br>" +
                            "Ale Židia boli proti tomu a bol som donútený odvolať sa na\u00A0cisára; ale nie že by som chcel niečo žalovať na\u00A0svoj národ. Pre\u00A0toto som sa chcel stretnúť a hovoriť s\u00A0vami. Lebo pre\u00A0nádej Izraela som sputnaný touto reťazou.\"<br>" +
                            "Pavol potom zostal celé dva roky vo\u00A0svojom najatom byte a prijímal všetkých, čo k\u00A0nemu prichádzali. Ohlasoval Božie kráľovstvo a učil o\u00A0Pánu Ježišovi Kristovi so\u00A0všetkou odvahou a bez\u00A0prekážky.<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] velkanocCitanie2 = {
            {"10", "A", "", "Kol 3, 1-4",
                    "Hľadajte, čo je hore, kde je Kristus",
                    "Čítanie z Listu svätého apoštola Pavla Kolosanom<br>" +
                            "Bratia, ak ste s\u00A0Kristom vstali z\u00A0mŕtvych, hľadajte, čo je hore, kde Kristus sedí po\u00A0pravici Boha! Myslite na\u00A0to, čo je hore, nie na\u00A0to, čo je na\u00A0zemi!<br>" +
                            "Veď ste zomreli a váš život je s\u00A0Kristom ukrytý v\u00A0Bohu. A keď sa zjaví Kristus, váš život, vtedy sa aj vy zjavíte s\u00A0ním v\u00A0sláve.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "1 Kor 5, 6b-8",
                    "Vyčistite starý kvas, aby ste boli novým cestom",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, neviete, že trocha kvasu prekvasí celé cesto? Vyčistite starý kvas, aby ste boli novým cestom. Ste totiž akoby nekvasený chlieb.<br>" +
                            "Veď bol obetovaný náš veľkonočný Baránok, Kristus.<br>" +
                            "Preto slávme sviatky nie v\u00A0starom kvase ani v\u00A0kvase zloby a neprávosti, ale s\u00A0nekvaseným chlebom čistoty a pravdy.<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "B", "", "Kol 3, 1-4",
                    "Hľadajte, čo je hore, kde je Kristus",
                    "Čítanie z Listu svätého apoštola Pavla Kolosanom<br>" +
                            "Bratia, ak ste s\u00A0Kristom vstali z\u00A0mŕtvych, hľadajte, čo je hore, kde Kristus sedí po\u00A0pravici Boha! Myslite na\u00A0to, čo je hore, nie na\u00A0to, čo je na\u00A0zemi!<br>" +
                            "Veď ste zomreli a váš život je s\u00A0Kristom ukrytý v\u00A0Bohu. A keď sa zjaví Kristus, váš život, vtedy sa aj vy zjavíte s\u00A0ním v\u00A0sláve.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "1 Kor 5, 6b-8",
                    "Vyčistite starý kvas, aby ste boli novým cestom",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, neviete, že trocha kvasu prekvasí celé cesto? Vyčistite starý kvas, aby ste boli novým cestom. Ste totiž akoby nekvasený chlieb.<br>" +
                            "Veď bol obetovaný náš veľkonočný Baránok, Kristus.<br>" +
                            "Preto slávme sviatky nie v\u00A0starom kvase ani v\u00A0kvase zloby a neprávosti, ale s\u00A0nekvaseným chlebom čistoty a pravdy.<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "C", "", "Kol 3, 1-4",
                    "Hľadajte, čo je hore, kde je Kristus",
                    "Čítanie z Listu svätého apoštola Pavla Kolosanom<br>" +
                            "Bratia, ak ste s\u00A0Kristom vstali z\u00A0mŕtvych, hľadajte, čo je hore, kde Kristus sedí po\u00A0pravici Boha! Myslite na\u00A0to, čo je hore, nie na\u00A0to, čo je na\u00A0zemi!<br>" +
                            "Veď ste zomreli a váš život je s\u00A0Kristom ukrytý v\u00A0Bohu. A keď sa zjaví Kristus, váš život, vtedy sa aj vy zjavíte s\u00A0ním v\u00A0sláve.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo:",
                    "1 Kor 5, 6b-8",
                    "Vyčistite starý kvas, aby ste boli novým cestom",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, neviete, že trocha kvasu prekvasí celé cesto? Vyčistite starý kvas, aby ste boli novým cestom. Ste totiž akoby nekvasený chlieb.<br>" +
                            "Veď bol obetovaný náš veľkonočný Baránok, Kristus.<br>" +
                            "Preto slávme sviatky nie v\u00A0starom kvase ani v\u00A0kvase zloby a neprávosti, ale s\u00A0nekvaseným chlebom čistoty a pravdy.<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "A", "", "1 Pt 1, 3-9",
                    "Milujete Krista, hoci ste ho nevideli, ale veríte a jasáte nevýslovnou radosťou",
                    "Čítanie z Prvého listu svätého apoštola Petra<br>" +
                            "Nech je zvelebený Boh a Otec nášho Pána Ježiša Krista, ktorý nás vo\u00A0svojom veľkom milosrdenstve vzkriesením Ježiša Krista z\u00A0mŕtvych znovuzrodil pre\u00A0živú nádej, pre\u00A0neporušiteľné, nepoškvrnené a nevädnúce dedičstvo.<br>" +
                            "Ono sa uchováva pre\u00A0vás v\u00A0nebi. Vás Božia moc vierou chráni pre\u00A0spásu, ktorá je pripravená zjaviť sa v\u00A0poslednom čase.<br>" +
                            "Preto sa radujete, hoci sa teraz, ak treba, trochu aj rmútite pre\u00A0rozličné skúšky, aby vám vaša vyskúšaná viera, omnoho vzácnejšia ako pominuteľné zlato, ktoré sa tiež skúša ohňom, bola na\u00A0chválu, slávu a česť vtedy, keď sa zjaví Ježiš Kristus. Vy ho milujete, hoci ste ho nevideli. Ani teraz ho nevidíte, ale veríte a jasáte nevýslovnou radosťou, plnou slávy, že dosahujete cieľ svojej viery – spásu duší.<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "B", "", "1 Jn 5, 1-6",
                    "Všetko, čo sa narodilo z\u00A0Boha, premáha svet",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, každý, kto verí, že Ježiš je Kristus, narodil sa z\u00A0Boha. A každý, kto miluje Boha ako Otca, miluje aj toho, kto sa z\u00A0neho narodil. Podľa toho poznáme, že milujeme Božie deti, keď milujeme Boha a plníme jeho prikázania. Lebo láska k\u00A0Bohu spočíva v\u00A0tom, že zachovávame jeho prikázania. A jeho prikázania nie sú ťažké.<br>" +
                            "Veď všetko, čo sa narodilo z\u00A0Boha, premáha svet. A tým víťazstvom, ktoré premohlo svet, je naša viera. Veď kto iný premáha svet, ak nie ten, kto verí, že Ježiš je Boží Syn?<br>" +
                            "On je ten, ktorý prišiel skrze vodu a krv, Ježiš Kristus. Nielen skrze vodu, ale skrze vodu a krv. A Duch to dosvedčuje, pretože Duch je pravda.<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "C", "", "Zjv 1, 9-11a. 12-13. 17-19",
                    "Bol som mŕtvy, a hľa, žijem na\u00A0veky vekov",
                    "Čítanie z Knihy zjavenia svätého apoštola Jána<br>" +
                            "Ja, Ján, váš brat a spoločník v\u00A0súžení, v\u00A0kráľovstve i vo\u00A0vytrvalosti v\u00A0Ježišovi, bol som pre\u00A0Božie slovo a Ježišovo svedectvo na\u00A0ostrove, ktorý sa volá Patmos. V Pánov deň som bol vo\u00A0vytržení a počul som za\u00A0sebou hlas mohutný ako zvuk poľnice hovoriť: \"Čo vidíš, napíš do\u00A0knihy a pošli siedmim cirkvám.\"<br>" +
                            "Obrátil som sa, aby som pozoroval hlas, čo so\u00A0mnou hovoril.<br>" +
                            "A keď som sa obrátil, videl som sedem zlatých svietnikov a uprostred svietnikov kohosi, ako Syna človeka, oblečeného do\u00A0dlhého rúcha a cez\u00A0prsia prepásaného zlatým pásom.<br>" +
                            "Keď som ho uvidel, padol som mu k\u00A0nohám ako mŕtvy. On položil na\u00A0mňa svoju pravicu a povedal: \"Neboj sa! Ja som Prvý a Posledný a Živý. Bol som mŕtvy, a hľa, žijem na\u00A0veky vekov a mám kľúče od\u00A0smrti a podsvetia. Napíš teda, čo si videl: čo je a čo sa má stať potom.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "A", "", "1 Pt 1, 17-21",
                    "Vykúpení ste drahou krvou Krista, bezúhonného a nepoškvrneného Baránka",
                    "Čítanie z Prvého listu svätého apoštola Petra<br>" +
                            "Milovaní, keď ako Otca vzývate toho, ktorý súdi bez\u00A0nadŕžania osobám, každého podľa jeho skutkov, žite v\u00A0bázni v\u00A0čase svojho pobytu na\u00A0zemi. Veď viete, že zo\u00A0svojho márneho spôsobu života, zdedeného po\u00A0otcoch, boli ste vykúpení nie porušiteľným striebrom alebo zlatom, ale drahou krvou Krista, bezúhonného a nepoškvrneného Baránka. On bol vopred vyhliadnutý, ešte pred\u00A0stvorením sveta, zjavil sa však až v\u00A0posledných časoch kvôli vám, čo skrze neho veríte v\u00A0Boha, ktorý ho vzkriesil z\u00A0mŕtvych a dal mu slávu, aby sa vaša viera a nádej upínali na\u00A0Boha.<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "B", "", "1 Jn 2, 1-5a ",
                    "On je zmiernou obetou za\u00A0naše hriechy, ale aj za\u00A0hriechy celého sveta",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Deti moje, toto vám píšem, aby ste nehrešili. Ale keby niekto zhrešil, máme u\u00A0Otca zástancu: Ježiša Krista, spravodlivého. On je zmiernou obetou za\u00A0naše hriechy; a nielen za\u00A0naše, ale aj za\u00A0hriechy celého sveta.<br>" +
                            "Podľa toho vieme, že sme ho poznali, ak zachovávame jeho prikázania. Kto hovorí: \"Poznám ho,\" a nezachováva jeho prikázania, je luhár a niet v\u00A0ňom pravdy. Kto však zachováva jeho slovo, v\u00A0tom je Božia láska naozaj dokonalá.<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "C", "", "Zjv 5, 11-14",
                    "Hoden je Baránok, ktorý bol zabitý, prijať moc a bohatstvo",
                    "Čítanie z Knihy zjavenia svätého apoštola Jána<br>" +
                            "Ja, Ján, videl som a počul som hlas mnohých anjelov okolo trónu, bytostí a starcov. Boli ich myriady myriád a tisíce tisícov a volali mohutným hlasom: \"Hoden je Baránok, ktorý bol zabitý, prijať moc, bohatstvo a múdrosť, silu, česť, slávu a dobrorečenie.\"<br>" +
                            "A všetko tvorstvo na\u00A0nebi, na\u00A0zemi, pod\u00A0zemou i na\u00A0mori a všetko, čo je v\u00A0nich, počul som volať: \"Sediacemu na\u00A0tróne a Baránkovi dobrorečenie a česť, sláva a moc na\u00A0veky vekov.\"<br>" +
                            "A štyri bytosti volali: \"Amen.\" A starci padli a klaňali sa.<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "A", "", "1 Pt 2, 20b-25",
                    "Vrátili ste sa k\u00A0pastierovi svojich duší",
                    "Čítanie z Prvého listu svätého apoštola Petra<br>" +
                            "Milovaní, ak dobre robíte, a predsa znášate utrpenia, je to milosť pred\u00A0Bohom. Veď na\u00A0to ste povolaní; lebo aj Kristus trpel za\u00A0vás a zanechal vám príklad, aby ste kráčali v\u00A0jeho šľapajach. On sa nedopustil hriechu, ani lesť nebola v\u00A0jeho ústach. Keď mu zlorečili, on nezlorečil, keď trpel, nevyhrážal sa, to postúpil tomu, ktorý súdi spravodlivo. Sám vyniesol naše hriechy na\u00A0svojom tele na\u00A0drevo aby sme zomreli hriechu a žili pre\u00A0spravodlivosť. Jeho rany vás uzdravili.<br>" +
                            "Veď ste boli ako blúdiace ovce, ale teraz ste sa vrátili k\u00A0pastierovi a biskupovi svojich duší.<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "B", "", "1 Jn 3, 1-2",
                    "Budeme vidieť Boha takého, aký je",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, pozrite, akú veľkú lásku nám daroval Otec: voláme sa Božími deťmi a nimi aj sme.<br>" +
                            "Preto nás svet nepozná, že nepoznal jeho. Milovaní, teraz sme Božími deťmi, a ešte sa neukázalo, čím budeme. Vieme však, že keď sa on zjaví, budeme mu podobní, lebo ho budeme vidieť takého, aký je.<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "C", "", "Zjv 7, 9. 14b-17",
                    "Baránok ich bude pásť a privedie ich k\u00A0prameňom vôd života",
                    "Čítanie z Knihy zjavenia svätého apoštola Jána<br>" +
                            "Ja, Ján, videl som veľký zástup, ktorý nik nemohol spočítať, zo\u00A0všetkých národov, kmeňov, plemien a jazykov. Stáli pred\u00A0trónom a pred\u00A0Baránkom, oblečení do\u00A0bieleho rúcha, v\u00A0rukách mali palmy.<br>" +
                            "A jeden zo\u00A0starcov mi povedal: \"To sú tí, čo prichádzajú z\u00A0veľkého súženia: oprali si rúcha a zbielili ich v\u00A0Baránkovej krvi. Preto sú pred\u00A0Božím trónom a dňom i nocou mu slúžia v\u00A0jeho chráme. A ten, čo sedí na\u00A0tróne, bude prebývať nad\u00A0nimi.<br>" +
                            "Už nebudú hladovať ani žízniť, nebude na\u00A0nich dorážať ani slnko, ani iná horúčosť, lebo Baránok, čo je v\u00A0strede pred\u00A0trónom, bude ich pásť a privedie ich k\u00A0prameňom vôd života. A Boh im zotrie z\u00A0očí každú slzu.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"50", "A", "", "1 Pt 2, 4-9",
                    "Dajte sa vbudovať ako živé kamene do\u00A0duchovného domu",
                    "Čítanie z Prvého listu svätého apoštola Petra<br>" +
                            "Milovaní, prichádzajte k\u00A0Pánovi, k\u00A0živému kameňu, ktorý ľudia síce zavrhli, ale pred\u00A0Bohom je vyvolený a vzácny, a dajte sa vbudovať aj vy ako živé kamene do\u00A0duchovného domu, do\u00A0svätého kňazstva, aby ste prinášali duchovné obety, príjemné Bohu skrze Ježiša Krista. Preto je v\u00A0Písme: \"Hľa, kladiem na\u00A0Sione kameň uholný, vyvolený a vzácny; kto v\u00A0neho verí, nebude zahanbený.\"<br>" +
                            "Vám teda, ktorí veríte, je na\u00A0česť; pre\u00A0tých však, čo neveria: \"Kameň, čo stavitelia zavrhli, sa stal kameňom uholným,\" \"kameňom úrazu a skalou pohoršenia\". Oni naň narážajú, lebo neveria slovu. A na\u00A0to sú aj určení.<br>" +
                            "Ale vy ste vyvolený rod, kráľovské kňazstvo, svätý národ, ľud určený na\u00A0vlastníctvo, aby ste zvestovali slávne skutky toho, ktorý vás z\u00A0tmy povolal do\u00A0svojho obdivuhodného svetla.<br>" +
                            "Počuli sme Božie slovo."},
            {"50", "B", "", "1 Jn 3, 18-24",
                    "Toto je jeho prikázanie: aby sme verili a milovali",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Deti moje, nemilujme len slovom a jazykom, ale skutkom a pravdou. Podľa toho poznáme, že sme z\u00A0pravdy, a upokojíme si pred\u00A0ním srdce. Lebo keby nám srdce niečo vyčítalo, Boh je väčší ako naše srdce a vie všetko.<br>" +
                            "Milovaní, ak nám srdce nič nevyčíta, máme dôveru k\u00A0Bohu a dostaneme od\u00A0neho všetko, o\u00A0čo len budeme prosiť, lebo zachovávame jeho prikázania a robíme, čo sa jemu páči. A toto je jeho prikázanie: aby sme verili v\u00A0meno jeho Syna Ježiša Krista a milovali jeden druhého, ako nám prikázal. Kto zachováva jeho prikázania, ostáva v\u00A0Bohu a Boh v\u00A0ňom. A že v\u00A0nás ostáva, poznáme z\u00A0Ducha, ktorého nám dal.<br>" +
                            "Počuli sme Božie slovo."},
            {"50", "C", "", "Zjv 21, 1-5a ",
                    "Boh im zotrie z\u00A0očí každú slzu",
                    "Čítanie z Knihy zjavenia svätého apoštola Jána<br>" +
                            "Ja, Ján, videl som nové nebo a novú zem, lebo prvé nebo a prvá zem sa pominuli a ani mora už niet. A videl som, ako z\u00A0neba od\u00A0Boha zostupuje sväté mesto, nový Jeruzalem, vystrojené ako nevesta, ozdobená pre\u00A0svojho ženícha. A počul som mohutný hlas od\u00A0trónu hovoriť: \"Hľa, Boží stánok je medzi ľuďmi! A bude medzi nimi prebývať; oni budú jeho ľudom a sám Boh – ich Boh – bude s\u00A0nimi. Zotrie im z\u00A0očí každú slzu a už nebude smrti ani žiaľu; ani náreku ani bolesti viac nebude, lebo prvé sa pominulo.\"<br>" +
                            "A ten, čo sedel na\u00A0tróne, povedal: \"Hľa, všetko robím nové.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"60", "A", "", "1 Pt 3, 15-18",
                    "Bol usmrtený v\u00A0tele, ale Duchom oživený",
                    "Čítanie z Prvého listu svätého apoštola Petra<br>" +
                            "Milovaní, uctievajte sväto Krista, Pána, vo\u00A0svojich srdciach, stále pripravení obhájiť sa pred\u00A0každým, kto vás vyzýva zdôvodniť nádej, ktorá je vo\u00A0vás. Robte to však skromne, s\u00A0bázňou a s\u00A0dobrým svedomím, aby sa tí, čo tupia váš dobrý život v\u00A0Kristovi, zahanbili práve v\u00A0tom, z\u00A0čoho vás osočujú.<br>" +
                            "Lebo je lepšie trpieť za\u00A0dobré skutky, ak je to Božia vôľa, ako za\u00A0zlé. Veď aj Kristus raz navždy trpel za\u00A0hriechy, spravodlivý za\u00A0nespravodlivých, aby vás priviedol k\u00A0Bohu. Bol usmrtený v\u00A0tele, ale Duchom oživený.<br>" +
                            "Počuli sme Božie slovo."},
            {"60", "B", "", "1 Jn 4, 7-10",
                    "Boh je láska",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, milujme sa navzájom, lebo láska je z\u00A0Boha a každý, kto miluje, narodil sa z\u00A0Boha a pozná Boha. Kto nemiluje, nepoznal Boha, lebo Boh je láska.<br>" +
                            "A Božia láska k\u00A0nám sa prejavila v\u00A0tom, že Boh poslal svojho jednorodeného Syna na\u00A0svet, aby sme skrze neho mali život.<br>" +
                            "Láska je v\u00A0tom, že nie my sme milovali Boha, ale že on miloval nás a poslal svojho Syna ako zmiernu obetu za\u00A0naše hriechy.<br>" +
                            "Počuli sme Božie slovo."},
            {"60", "C", "", "Zjv 21, 10-14. 22-23",
                    "Ukázal mi sväté mesto, ako zostupuje z\u00A0neba",
                    "Čítanie z Knihy zjavenia svätého apoštola Jána<br>" +
                            "Anjel ma v\u00A0duchu preniesol na\u00A0veľký a vysoký vrch a ukázal mi sväté mesto Jeruzalem, ako zostupuje z\u00A0neba od\u00A0Boha ožiarené Božou slávou. Jeho jas bol podobný najdrahšiemu kameňu, akoby krištáľovo čistému kameňu jaspisu. Malo veľké a vysoké hradby. Malo dvanásť brán a na\u00A0bránach dvanásť anjelov a napísané mená dvanástich kmeňov synov Izraela. Tri brány boli od\u00A0východu, tri brány od\u00A0severu, tri brány od\u00A0juhu a tri brány od\u00A0západu. Hradby mesta mali dvanásť základných kameňov a na\u00A0nich dvanásť mien dvanástich Baránkových apoštolov.<br>" +
                            "Ale chrám som v\u00A0ňom nevidel, lebo jeho chrámom je Pán, všemohúci Boh, a Baránok. A mesto nepotrebuje ani slnko ani mesiac, aby mu svietili, lebo ho ožiaruje Božia sláva a jeho lampou je Baránok.<br>" +
                            "Počuli sme Božie slovo."},
            {"70", "A", "", "1 Pt 4, 13-16",
                    "Keď vás hanobia pre\u00A0Kristovo meno, ste blahoslavení",
                    "Čítanie z Prvého listu svätého apoštola Petra<br>" +
                            "Milovaní, radujte sa, keď máte účasť na\u00A0Kristových utrpeniach, aby ste sa radovali a plesali aj vtedy, keď sa zjaví jeho sláva.<br>" +
                            "Keď vás hanobia pre\u00A0Kristovo meno, ste blahoslavení, lebo Duch slávy a Boží na\u00A0vás spočíva.<br>" +
                            "Len nech nik z\u00A0vás netrpí ako vrah alebo zlodej, alebo zločinec, alebo sliedič. Kto však trpí ako kresťan, nech sa nehanbí, ale nech oslavuje Boha týmto menom.<br>" +
                            "Počuli sme Božie slovo."},
            {"70", "B", "", "1 Jn 4, 11-16",
                    "Kto ostáva v\u00A0láske, ostáva v\u00A0Bohu a Boh ostáva v\u00A0ňom",
                    "Čítanie z Prvého listu svätého apoštola Jána<br>" +
                            "Milovaní, keď nás Boh tak miluje, aj my sme povinní milovať jeden druhého. Boha nikto nikdy nevidel; ale keď sa milujeme navzájom, Boh ostáva v\u00A0nás a jeho láska v\u00A0nás je dokonalá. A že ostávame v\u00A0ňom a on v\u00A0nás, poznávame podľa toho, že nám dal zo\u00A0svojho Ducha.<br>" +
                            "A my sme videli a svedčíme, že Otec poslal Syna za\u00A0Spasiteľa sveta. Kto vyzná: \"Ježiš je Boží Syn,\" ostáva v\u00A0ňom Boh a on v\u00A0Bohu. A my, čo sme uverili, spoznali sme lásku, akú má Boh k\u00A0nám. Boh je láska; a kto ostáva v\u00A0láske, ostáva v\u00A0Bohu a Boh ostáva v\u00A0ňom.<br>" +
                            "Počuli sme Božie slovo."},
            {"70", "C", "", "Zjv 22, 12-14. 16-17. 20",
                    "Príď, Pane Ježišu!",
                    "Čítanie z Knihy zjavenia svätého apoštola Jána<br>" +
                            "Ja, Ján, počul som hlas. Hovoril mi: \"Hľa, prídem čoskoro a moja odplata so\u00A0mnou; odmením každého podľa jeho skutkov. Ja som Alfa a Omega, Prvý a Posledný, Počiatok a Koniec. Blahoslavení sú tí, čo si vypierajú rúcha: budú mať moc nad\u00A0stromom života a budú môcť vstúpiť bránami mesta.<br>" +
                            "Ja, Ježiš, poslal som svojho anjela, aby vám toto dosvedčil o\u00A0cirkvách. Ja som Koreň a Rod Dávidov, Žiarivá ranná hviezda.\"<br>" +
                            "A Duch i nevesta volajú: \"Príď!\"<br>" +
                            "Aj ten, čo počúva, nech volá: \"Príď!\"<br>" +
                            "Kto je smädný, nech príde, a kto chce, nech si naberie zadarmo vody života.<br>" +
                            "Ten, čo to dosvedčuje, hovorí: \"Áno, prídem čoskoro.\"<br>" +
                            "\"Amen. Príď, Pane Ježišu!\"<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] velkanocEvanjelium = {
            {"10", "A", "", "Jn 20, 1-9",
                    "Že má vstať z\u00A0mŕtvych",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ráno prvého dňa v\u00A0týždni, ešte za\u00A0tmy, prišla Mária Magdaléna k\u00A0hrobu a videla, že kameň je od\u00A0hrobu odvalený. Bežala teda a prišla k\u00A0Šimonovi Petrovi a k\u00A0inému učeníkovi, ktorého mal Ježiš tak rád, a povedala im: \"Odniesli Pána z\u00A0hrobu a nevieme, kde ho položili.\"<br>" +
                            "Peter a ten druhý učeník sa zobrali a išli k\u00A0hrobu. Bežali obaja, ale ten druhý učeník bežal rýchlejšie, predbehol Petra a prišiel k\u00A0hrobu prvý. Nahol sa a videl tam položené plachty; dnu však nevkročil.<br>" +
                            "Potom prišiel aj Šimon Peter, ktorý ho nasledoval, a vošiel do\u00A0hrobu. Videl tam položené plachty aj šatku, ktorú mal Ježiš na\u00A0hlave. Lenže tá nebola pri\u00A0plachtách, lež osobitne zvinutá na\u00A0inom mieste. Vtedy vošiel aj druhý učeník, ten, čo prišiel k\u00A0hrobu prvý, a videl i uveril. Ešte totiž nechápali Písmo, že má vstať z\u00A0mŕtvych.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Mt 28, 1-10",
                    "Vstal z\u00A0mŕtvych a ide pred\u00A0vami do\u00A0Galiley",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša <br>" +
                            "Keď sa pominula sobota, na\u00A0úsvite prvého dňa v\u00A0týždni prišla Mária Magdaléna a iná Mária pozrieť hrob. Vtom nastalo veľké zemetrasenie, lebo z\u00A0neba zostúpil Pánov anjel, pristúpil, odvalil kameň a sadol si naň. Jeho zjav bol ako blesk a jeho odev biely ako sneh. Strážnici strnuli od\u00A0strachu z\u00A0neho a ostali ako mŕtvi.<br>" +
                            "Anjel sa prihovoril ženám: \"Vy sa nebojte! Viem, že hľadáte Ježiša, ktorý bol ukrižovaný. Niet ho tu, lebo vstal, ako povedal. Poďte, pozrite si miesto, kde ležal. A rýchlo choďte povedať jeho učeníkom: ‚Vstal z\u00A0mŕtvych a ide pred\u00A0vami do\u00A0Galiley. Tam ho uvidíte.' Hľa, povedal som vám to.\"<br>" +
                            "Rýchlo vyšli z\u00A0hrobu a so\u00A0strachom i s\u00A0veľkou radosťou bežali to oznámiť jeho učeníkom.<br>" +
                            "A hľa, Ježiš im išiel v\u00A0ústrety a oslovil ich: \"Pozdravujem vás!\" Ony pristúpili, objali mu nohy a klaňali sa mu. Tu im Ježiš povedal: \"Nebojte sa! Choďte, oznámte mojim bratom, aby šli do\u00A0Galiley; tam ma uvidia.\"<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo(pri večernej omši dnes):",
                    "Lk 24, 13-35",
                            "Spoznali ho pri\u00A0lámaní chleba",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša <br>" +
                            "V ten deň išli dvaja z\u00A0Ježišových učeníkov do\u00A0dediny zvanej Emauzy, ktorá bola od\u00A0Jeruzalema vzdialená šesťdesiat stadií, a zhovárali sa o\u00A0všetkom, čo sa prihodilo. Ako sa tak zhovárali a spoločne uvažovali, priblížil sa k\u00A0nim sám Ježiš a išiel s\u00A0nimi. Ich oči boli zastreté, aby ho nepoznali. I spýtal sa ich: \"O čom sa to cestou zhovárate?\"<br>" +
                            "Zastavili sa zronení a jeden z\u00A0nich, menom Kleopas, mu povedal: \"Ty si vari jediný cudzinec v\u00A0Jeruzaleme, ktorý nevie, čo sa tam stalo v\u00A0týchto dňoch?\"<br>" +
                            "On im povedal: \"A čo?\"<br>" +
                            "Oni mu vraveli: \"No s\u00A0Ježišom Nazaretským, ktorý bol prorokom, mocným v\u00A0čine i v\u00A0reči pred\u00A0Bohom aj pred\u00A0všetkým ľudom; ako ho veľkňazi a naši poprední muži dali odsúdiť na\u00A0smrť a ukrižovali. A my sme dúfali, že on vykúpi Izrael. Ale dnes je už tretí deň, ako sa to všetko stalo. Niektoré ženy z\u00A0našich nás aj naľakali. Pred\u00A0svitaním boli pri\u00A0hrobe, a keď nenašli jeho telo, prišli a tvrdili, že sa im zjavili anjeli a hovorili, že on žije. Niektorí z\u00A0našich odišli k\u00A0hrobu a zistili, že je to tak, ako vraveli ženy, ale jeho nevideli.\"<br>" +
                            "On im povedal: \"Vy nechápaví a ťarbaví srdcom uveriť všetko, čo hovorili proroci! Či nemal Mesiáš toto všetko vytrpieť, a tak vojsť do\u00A0svojej slávy?\" A počnúc od\u00A0Mojžiša a všetkých Prorokov, vykladal im, čo sa naňho v\u00A0celom Písme vzťahovalo.<br>" +
                            "Tak sa priblížili k\u00A0dedine, do\u00A0ktorej šli, a on sa tváril, že ide ďalej. Ale oni naň naliehali: \"Zostaň s\u00A0nami, lebo sa zvečerieva a deň sa už schýlil!\"<br>" +
                            "Vošiel teda a zostal s\u00A0nimi. A keď sedel s\u00A0nimi pri\u00A0stole, vzal chlieb a dobrorečil, lámal ho a podával im ho. Vtom sa im otvorili oči a spoznali ho. Ale on im zmizol. Tu si povedali: \"Či nám nehorelo srdce, keď sa s\u00A0nami cestou rozprával a vysvetľoval nám Písma?\"<br>" +
                            "A ešte v\u00A0tú hodinu vstali a vrátili sa do\u00A0Jeruzalema. Tam našli zhromaždených Jedenástich a iných s\u00A0nimi a tí im povedali: \"Pán naozaj vstal z\u00A0mŕtvych a zjavil sa Šimonovi.\" Aj oni porozprávali, čo sa im stalo cestou a ako ho spoznali pri\u00A0lámaní chleba.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"10", "B", "", "Jn 20, 1-9",
                    "Že má vstať z\u00A0mŕtvych",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ráno prvého dňa v\u00A0týždni, ešte za\u00A0tmy, prišla Mária Magdaléna k\u00A0hrobu a videla, že kameň je od\u00A0hrobu odvalený. Bežala teda a prišla k\u00A0Šimonovi Petrovi a k\u00A0inému učeníkovi, ktorého mal Ježiš tak rád, a povedala im: \"Odniesli Pána z\u00A0hrobu a nevieme, kde ho položili.\"<br>" +
                            "Peter a ten druhý učeník sa zobrali a išli k\u00A0hrobu. Bežali obaja, ale ten druhý učeník bežal rýchlejšie, predbehol Petra a prišiel k\u00A0hrobu prvý. Nahol sa a videl tam položené plachty; dnu však nevkročil.<br>" +
                            "Potom prišiel aj Šimon Peter, ktorý ho nasledoval, a vošiel do\u00A0hrobu. Videl tam položené plachty aj šatku, ktorú mal Ježiš na\u00A0hlave. Lenže tá nebola pri\u00A0plachtách, lež osobitne zvinutá na\u00A0inom mieste. Vtedy vošiel aj druhý učeník, ten, čo prišiel k\u00A0hrobu prvý, a videl i uveril. Ešte totiž nechápali Písmo, že má vstať z\u00A0mŕtvych.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Mt 16, 1-8",
                    "Ukrižovaný Ježiš Nazaretský vstal z\u00A0mŕtvych",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka <br>" +
                            "Keď sa pominula sobota, Mária Magdaléna a Mária Jakubova i Salome nakúpili voňavé oleje a išli ho pomazať. V prvý deň týždňa, skoro ráno, po\u00A0východe slnka, prišli k\u00A0hrobu a hovorili si: „Kto nám odvalí kameň od\u00A0vchodu do\u00A0hrobu?“ <br>" +
                            "Ale keď sa pozreli, videli, že kameň je odvalený; bol totiž veľmi veľký.<br>" +
                            "Keď vošli do\u00A0hrobu, na\u00A0pravej strane videli sedieť mladíka oblečeného do\u00A0bieleho rúcha a stŕpli.<br>" +
                            "On sa im prihovoril: \"Neľakajte sa! Hľadáte Ježiša Nazaretského, ktorý bol ukrižovaný. Vstal z\u00A0mŕtvych. Niet ho tu. Hľa, miesto, kde ho uložili. Ale choďte a povedzte jeho učeníkom a Petrovi: ‚Ide pred\u00A0vami do\u00A0Galiley. Tam ho uvidíte, ako vám povedal.'\"<br>" +
                            "Vyšli a utekali od\u00A0hrobu, lebo sa ich zmocnila hrôza a strach. A nepovedali nikomu nič, lebo sa báli.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo(pri večernej omši dnes):",
                    "Lk 24, 13-35",
                            "Spoznali ho pri\u00A0lámaní chleba",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša <br>" +
                            "V ten deň išli dvaja z\u00A0Ježišových učeníkov do\u00A0dediny zvanej Emauzy, ktorá bola od\u00A0Jeruzalema vzdialená šesťdesiat stadií, a zhovárali sa o\u00A0všetkom, čo sa prihodilo. Ako sa tak zhovárali a spoločne uvažovali, priblížil sa k\u00A0nim sám Ježiš a išiel s\u00A0nimi. Ich oči boli zastreté, aby ho nepoznali. I spýtal sa ich: \"O čom sa to cestou zhovárate?\"<br>" +
                            "Zastavili sa zronení a jeden z\u00A0nich, menom Kleopas, mu povedal: \"Ty si vari jediný cudzinec v\u00A0Jeruzaleme, ktorý nevie, čo sa tam stalo v\u00A0týchto dňoch?\"<br>" +
                            "On im povedal: \"A čo?\"<br>" +
                            "Oni mu vraveli: \"No s\u00A0Ježišom Nazaretským, ktorý bol prorokom, mocným v\u00A0čine i v\u00A0reči pred\u00A0Bohom aj pred\u00A0všetkým ľudom; ako ho veľkňazi a naši poprední muži dali odsúdiť na\u00A0smrť a ukrižovali. A my sme dúfali, že on vykúpi Izrael. Ale dnes je už tretí deň, ako sa to všetko stalo. Niektoré ženy z\u00A0našich nás aj naľakali. Pred\u00A0svitaním boli pri\u00A0hrobe, a keď nenašli jeho telo, prišli a tvrdili, že sa im zjavili anjeli a hovorili, že on žije. Niektorí z\u00A0našich odišli k\u00A0hrobu a zistili, že je to tak, ako vraveli ženy, ale jeho nevideli.\"<br>" +
                            "On im povedal: \"Vy nechápaví a ťarbaví srdcom uveriť všetko, čo hovorili proroci! Či nemal Mesiáš toto všetko vytrpieť, a tak vojsť do\u00A0svojej slávy?\" A počnúc od\u00A0Mojžiša a všetkých Prorokov, vykladal im, čo sa naňho v\u00A0celom Písme vzťahovalo.<br>" +
                            "Tak sa priblížili k\u00A0dedine, do\u00A0ktorej šli, a on sa tváril, že ide ďalej. Ale oni naň naliehali: \"Zostaň s\u00A0nami, lebo sa zvečerieva a deň sa už schýlil!\"<br>" +
                            "Vošiel teda a zostal s\u00A0nimi. A keď sedel s\u00A0nimi pri\u00A0stole, vzal chlieb a dobrorečil, lámal ho a podával im ho. Vtom sa im otvorili oči a spoznali ho. Ale on im zmizol. Tu si povedali: \"Či nám nehorelo srdce, keď sa s\u00A0nami cestou rozprával a vysvetľoval nám Písma?\"<br>" +
                            "A ešte v\u00A0tú hodinu vstali a vrátili sa do\u00A0Jeruzalema. Tam našli zhromaždených Jedenástich a iných s\u00A0nimi a tí im povedali: \"Pán naozaj vstal z\u00A0mŕtvych a zjavil sa Šimonovi.\" Aj oni porozprávali, čo sa im stalo cestou a ako ho spoznali pri\u00A0lámaní chleba.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"10", "C", "", "Jn 20, 1-9",
                    "Že má vstať z\u00A0mŕtvych",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ráno prvého dňa v\u00A0týždni, ešte za\u00A0tmy, prišla Mária Magdaléna k\u00A0hrobu a videla, že kameň je od\u00A0hrobu odvalený. Bežala teda a prišla k\u00A0Šimonovi Petrovi a k\u00A0inému učeníkovi, ktorého mal Ježiš tak rád, a povedala im: \"Odniesli Pána z\u00A0hrobu a nevieme, kde ho položili.\"<br>" +
                            "Peter a ten druhý učeník sa zobrali a išli k\u00A0hrobu. Bežali obaja, ale ten druhý učeník bežal rýchlejšie, predbehol Petra a prišiel k\u00A0hrobu prvý. Nahol sa a videl tam položené plachty; dnu však nevkročil.<br>" +
                            "Potom prišiel aj Šimon Peter, ktorý ho nasledoval, a vošiel do\u00A0hrobu. Videl tam položené plachty aj šatku, ktorú mal Ježiš na\u00A0hlave. Lenže tá nebola pri\u00A0plachtách, lež osobitne zvinutá na\u00A0inom mieste. Vtedy vošiel aj druhý učeník, ten, čo prišiel k\u00A0hrobu prvý, a videl i uveril. Ešte totiž nechápali Písmo, že má vstať z\u00A0mŕtvych.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Lk 24, 1-12",
                    "Vstal z\u00A0mŕtvych a ide pred\u00A0vami do\u00A0Galiley",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša <br>" +
                            "Keď sa pominula sobota, Mária Magdaléna a Mária Jakubova i Salome nakúpili voňavé oleje a išli ho pomazať. V prvý deň týždňa, skoro ráno, po\u00A0východe slnka, prišli k\u00A0hrobu a hovorili si: „Kto nám odvalí kameň od\u00A0vchodu do\u00A0hrobu?“ <br>" +
                            "Ale keď sa pozreli, videli, že kameň je odvalený; bol totiž veľmi veľký.<br>" +
                            "Keď vošli do\u00A0hrobu, na\u00A0pravej strane videli sedieť mladíka oblečeného do\u00A0bieleho rúcha a stŕpli.<br>" +
                            "On sa im prihovoril: \"Neľakajte sa! Hľadáte Ježiša Nazaretského, ktorý bol ukrižovaný. Vstal z\u00A0mŕtvych. Niet ho tu. Hľa, miesto, kde ho uložili. Ale choďte a povedzte jeho učeníkom a Petrovi: ‚Ide pred\u00A0vami do\u00A0Galiley. Tam ho uvidíte, ako vám povedal.'\"<br>" +
                            "Vyšli a utekali od\u00A0hrobu, lebo sa ich zmocnila hrôza a strach. A nepovedali nikomu nič, lebo sa báli.<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo(pri večernej omši dnes):",
                    " Lk 24, 13-35",
                            "Spoznali ho pri\u00A0lámaní chleba",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "V ten deň išli dvaja z\u00A0Ježišových učeníkov do\u00A0dediny zvanej Emauzy, ktorá bola od\u00A0Jeruzalema vzdialená šesťdesiat stadií, a zhovárali sa o\u00A0všetkom, čo sa prihodilo. Ako sa tak zhovárali a spoločne uvažovali, priblížil sa k\u00A0nim sám Ježiš a išiel s\u00A0nimi. Ich oči boli zastreté, aby ho nepoznali. I spýtal sa ich: \"O čom sa to cestou zhovárate?\"<br>" +
                            "Zastavili sa zronení a jeden z\u00A0nich, menom Kleopas, mu povedal: \"Ty si vari jediný cudzinec v\u00A0Jeruzaleme, ktorý nevie, čo sa tam stalo v\u00A0týchto dňoch?\"<br>" +
                            "On im povedal: \"A čo?\"<br>" +
                            "Oni mu vraveli: \"No s\u00A0Ježišom Nazaretským, ktorý bol prorokom, mocným v\u00A0čine i v\u00A0reči pred\u00A0Bohom aj pred\u00A0všetkým ľudom; ako ho veľkňazi a naši poprední muži dali odsúdiť na\u00A0smrť a ukrižovali. A my sme dúfali, že on vykúpi Izrael. Ale dnes je už tretí deň, ako sa to všetko stalo. Niektoré ženy z\u00A0našich nás aj naľakali. Pred\u00A0svitaním boli pri\u00A0hrobe, a keď nenašli jeho telo, prišli a tvrdili, že sa im zjavili anjeli a hovorili, že on žije. Niektorí z\u00A0našich odišli k\u00A0hrobu a zistili, že je to tak, ako vraveli ženy, ale jeho nevideli.\"<br>" +
                            "On im povedal: \"Vy nechápaví a ťarbaví srdcom uveriť všetko, čo hovorili proroci! Či nemal Mesiáš toto všetko vytrpieť, a tak vojsť do\u00A0svojej slávy?\" A počnúc od\u00A0Mojžiša a všetkých Prorokov, vykladal im, čo sa naňho v\u00A0celom Písme vzťahovalo.<br>" +
                            "Tak sa priblížili k\u00A0dedine, do\u00A0ktorej šli, a on sa tváril, že ide ďalej. Ale oni naň naliehali: \"Zostaň s\u00A0nami, lebo sa zvečerieva a deň sa už schýlil!\"<br>" +
                            "Vošiel teda a zostal s\u00A0nimi. A keď sedel s\u00A0nimi pri\u00A0stole, vzal chlieb a dobrorečil, lámal ho a podával im ho. Vtom sa im otvorili oči a spoznali ho. Ale on im zmizol. Tu si povedali: \"Či nám nehorelo srdce, keď sa s\u00A0nami cestou rozprával a vysvetľoval nám Písma?\"<br>" +
                            "A ešte v\u00A0tú hodinu vstali a vrátili sa do\u00A0Jeruzalema. Tam našli zhromaždených Jedenástich a iných s\u00A0nimi a tí im povedali: \"Pán naozaj vstal z\u00A0mŕtvych a zjavil sa Šimonovi.\" Aj oni porozprávali, čo sa im stalo cestou a ako ho spoznali pri\u00A0lámaní chleba.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"11", "1", "", "Mt 28, 8-15",
                    "Oznámte mojim bratom, aby šli do\u00A0Galiley; tam ma uvidia",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ženy rýchlo vyšli z\u00A0hrobu a so\u00A0strachom i s\u00A0veľkou radosťou bežali to oznámiť jeho učeníkom.<br>" +
                            "A hľa, Ježiš im išiel v\u00A0ústrety a oslovil ich: \"Pozdravujem vás!\"<br>" +
                            "Ony pristúpili, objali mu nohy a klaňali sa mu.<br>" +
                            "Tu im Ježiš povedal: \"Nebojte sa! Choďte, oznámte mojim bratom, aby šli do\u00A0Galiley; tam ma uvidia.\"<br>" +
                            "Keď odišli, prišli do\u00A0mesta niektorí zo\u00A0stráže a oznámili veľkňazom všetko, čo sa stalo. Tí sa zišli so\u00A0staršími, poradili sa a dali vojakom veľa peňazí so\u00A0slovami: \"Tak vravte: ‚V noci prišli jeho učeníci a kým sme my spali, oni ho ukradli.' A keby sa to dopočul vladár, my ho uchlácholíme a postaráme sa, aby sa vám nič nestalo.\"<br>" +
                            "Oni vzali peniaze a urobili tak, ako ich poučili. A toto sa hovorí medzi Židmi až do\u00A0dnešného dňa.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"12", "2", "", "Jn 20, 11-18",
                    "Videla som Pána a toto mi povedal",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Mária stála vonku pri\u00A0hrobe a plakala. Ako tak plakala, nahla sa do\u00A0hrobu a videla dvoch anjelov v\u00A0bielom sedieť tam, kde bolo predtým uložené Ježišovo telo, jedného pri\u00A0hlave, druhého pri\u00A0nohách.<br>" +
                            "Oni sa jej opýtali: \"Žena, prečo plačeš?\"<br>" +
                            "Vravela im: \"Odniesli môjho Pána a neviem, kde ho položili.\" Keď to povedala, obrátila sa a videla tam stáť Ježiša; no nevedela, že je to Ježiš.<br>" +
                            "Ježiš sa jej opýtal: \"Žena, prečo plačeš? Koho hľadáš?\"<br>" +
                            "Ona mu v\u00A0domnení, že je to záhradník, povedala: \"Pane, ak si ho ty odniesol, povedz mi, kde si ho položil, a ja si ho vezmem.\"<br>" +
                            "Ježiš ju oslovil: \"Mária!\"<br>" +
                            "Ona sa obrátila a po\u00A0hebrejsky mu povedala: \"Rabbuni,\" čo znamená Učiteľ.<br>" +
                            "Ježiš jej povedal: \"Už ma nedrž, veď som ešte nevystúpil k\u00A0Otcovi; ale choď k\u00A0mojim bratom a povedz im: Vystupujem k\u00A0môjmu Otcovi a vášmu Otcovi, k\u00A0môjmu Bohu a vášmu Bohu.\"<br>" +
                            "Mária Magdaléna išla a zvestovala učeníkom: \"Videla som Pána,\" a že jej toto povedal.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"13", "3", "", "Lk 24, 13-35",
                    "Spoznali ho pri\u00A0lámaní chleba",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "V ten deň išli dvaja z\u00A0Ježišových učeníkov do\u00A0dediny zvanej Emauzy, ktorá bola od\u00A0Jeruzalema vzdialená šesťdesiat stadií, a zhovárali sa o\u00A0všetkom, čo sa prihodilo. Ako sa tak zhovárali a spoločne uvažovali, priblížil sa k\u00A0nim sám Ježiš a išiel s\u00A0nimi. Ich oči boli zastreté, aby ho nepoznali. I spýtal sa ich: \"O čom sa to cestou zhovárate?\"<br>" +
                            "Zastavili sa zronení a jeden z\u00A0nich, menom Kleopas, mu povedal: \"Ty si vari jediný cudzinec v\u00A0Jeruzaleme, ktorý nevie, čo sa tam stalo v\u00A0týchto dňoch?\"<br>" +
                            "On im povedal: \"A čo?\"<br>" +
                            "Oni mu vraveli: \"No s\u00A0Ježišom Nazaretským, ktorý bol prorokom, mocným v\u00A0čine i v\u00A0reči pred\u00A0Bohom aj pred\u00A0všetkým ľudom; ako ho veľkňazi a naši poprední muži dali odsúdiť na\u00A0smrť a ukrižovali. A my sme dúfali, že on vykúpi Izrael. Ale dnes je už tretí deň, ako sa to všetko stalo. Niektoré ženy z\u00A0našich nás aj naľakali. Pred\u00A0svitaním boli pri\u00A0hrobe, a keď nenašli jeho telo, prišli a tvrdili, že sa im zjavili anjeli a hovorili, že on žije. Niektorí z\u00A0našich odišli k\u00A0hrobu a zistili, že je to tak, ako vraveli ženy, ale jeho nevideli.\"<br>" +
                            "On im povedal: \"Vy nechápaví a ťarbaví srdcom uveriť všetko, čo hovorili proroci! Či nemal Mesiáš toto všetko vytrpieť, a tak vojsť do\u00A0svojej slávy?\" A počnúc od\u00A0Mojžiša a všetkých Prorokov, vykladal im, čo sa naňho v\u00A0celom Písme vzťahovalo.<br>" +
                            "Tak sa priblížili k\u00A0dedine, do\u00A0ktorej šli, a on sa tváril, že ide ďalej. Ale oni naň naliehali: \"Zostaň s\u00A0nami, lebo sa zvečerieva a deň sa už schýlil!\"<br>" +
                            "Vošiel teda a zostal s\u00A0nimi. A keď sedel s\u00A0nimi pri\u00A0stole, vzal chlieb a dobrorečil, lámal ho a podával im ho. Vtom sa im otvorili oči a spoznali ho. Ale on im zmizol. Tu si povedali: \"Či nám nehorelo srdce, keď sa s\u00A0nami cestou rozprával a vysvetľoval nám Písma?\"<br>" +
                            "A ešte v\u00A0tú hodinu vstali a vrátili sa do\u00A0Jeruzalema. Tam našli zhromaždených Jedenástich a iných s\u00A0nimi a tí im povedali: \"Pán naozaj vstal z\u00A0mŕtvych a zjavil sa Šimonovi.\" Aj oni porozprávali, čo sa im stalo cestou a ako ho spoznali pri\u00A0lámaní chleba.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"14", "4", "", "Lk 24, 35-48",
                    "Tak je napísané, že Mesiáš bude trpieť a tretieho dňa vstane z\u00A0mŕtvych",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježišovi učeníci porozprávali, čo sa im stalo cestou a ako ho spoznali pri\u00A0lámaní chleba.<br>" +
                            "Kým o\u00A0tom hovorili, on sám zastal uprostred nich a povedal im: \"Pokoj vám.\" Zmätení a naľakaní si mysleli, že vidia ducha. On im povedal. \"Čo sa ľakáte a prečo vám srdcia zachvacujú také myšlienky? Pozrite na\u00A0moje ruky a nohy, že som to ja! Dotknite sa ma a presvedčte sa! Veď duch nemá mäso a kosti a vidíte, že ja mám.\" Ako to povedal, ukázal im ruky a nohy.<br>" +
                            "A keď tomu stále od\u00A0veľkej radosti nemohli uveriť a len sa divili, povedal im: \"Máte tu niečo na\u00A0jedenie?\" Oni mu podali kúsok pečenej ryby. I vzal si a jedol pred\u00A0nimi. Potom im povedal: \"Toto je to, čo som vám hovoril, kým som bol ešte s\u00A0vami, že sa musí splniť všetko, čo je o\u00A0mne napísané v\u00A0Mojžišovom zákone, u\u00A0Prorokov a v\u00A0Žalmoch.\"<br>" +
                            "Vtedy im otvoril myseľ, aby porozumeli Písmu, a povedal im: \"Tak je napísané, že Mesiáš bude trpieť a tretieho dňa vstane z\u00A0mŕtvych a v\u00A0jeho mene sa bude všetkým národom, počnúc od\u00A0Jeruzalema, hlásať pokánie na\u00A0odpustenie hriechov. Vy ste toho svedkami.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"15", "5", "", "Jn 21, 1-14",
                    "Ježiš pristúpil, vzal chlieb a dával im; podobne aj rybu",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš sa znova zjavil učeníkom pri\u00A0Tiberiadskom mori. A zjavil sa takto: Boli spolu Šimon Peter, Tomáš nazývaný Didymus, Natanael z\u00A0Kány Galilejskej, Zebedejovi synovia a iní dvaja z\u00A0jeho učeníkov.<br>" +
                            "Šimon Peter im povedal: \"Idem loviť ryby.\"<br>" +
                            "Povedali mu: \"Pôjdeme aj my s\u00A0tebou.\" Išli a nastúpili na\u00A0loď. Ale tej noci nechytili nič.<br>" +
                            "Keď sa už rozodnilo, stál Ježiš na\u00A0brehu; ale učeníci nevedeli, že je to Ježiš. A Ježiš sa ich opýtal: \"Deti, máte niečo na\u00A0jedenie?\"<br>" +
                            "Odpovedali mu: \"Nemáme.\"<br>" +
                            "On im povedal: \"Spustite sieť z\u00A0pravej strany lode a nájdete.\" Oni spustili a pre\u00A0množstvo rýb ju už nevládali vytiahnuť.<br>" +
                            "Učeník, ktorého Ježiš miloval, povedal Petrovi: \"To je Pán.\" Len čo Šimon Peter počul, že je to Pán, pripásal si šaty nebol totiž oblečený a skočil do\u00A0mora. Ostatní učeníci prišli na\u00A0lodi, lebo neboli ďaleko od\u00A0brehu, len asi dvesto lakťov, a sieť s\u00A0rybami ťahali za\u00A0sebou.<br>" +
                            "Keď vystúpili na\u00A0breh, videli rozloženú pahrebu a na\u00A0nej položenú rybu a chlieb. Ježiš im povedal: \"Doneste z\u00A0rýb, čo ste teraz chytili!\" Šimon Peter šiel a vytiahol na\u00A0breh sieť plnú veľkých rýb. Bolo ich stopäťdesiattri. A hoci ich bolo toľko, sieť sa nepretrhla.<br>" +
                            "Ježiš im povedal: \"Poďte jesť!\" A nik z\u00A0učeníkov sa ho neodvážil spýtať: \"Kto si?\", lebo vedeli, že je to Pán.<br>" +
                            "Ježiš pristúpil, vzal chlieb a dával im; podobne aj rybu.<br>" +
                            "To sa Ježiš učeníkom zjavil už tretí raz od\u00A0svojho zmŕtvychvstania.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"16", "6", "", "Mk 16, 9-15",
                    "Choďte do\u00A0celého sveta a hlásajte evanjelium",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Keď ráno v\u00A0prvý deň týždňa vstal Ježiš z\u00A0mŕtvych, zjavil sa najprv Márii Magdaléne, z\u00A0ktorej kedysi vyhnal sedem zlých duchov. Ona išla a zvestovala to tým, čo s\u00A0ním bývali a teraz boli smutní a plakali. Ale oni, keď počuli, že žije a že ho videla, neverili.<br>" +
                            "Potom sa v\u00A0inej podobe zjavil dvom z\u00A0nich na\u00A0ceste, keď išli na\u00A0vidiek. Aj oni to išli zvestovať ostatným, ale ani im neuverili.<br>" +
                            "Napokon sa zjavil samým Jedenástim, keď sedeli pri\u00A0stole, a vyčítal im neveru a tvrdosť srdca, že neuverili tým, čo ho videli vzkrieseného.<br>" +
                            "A povedal im: \"Choďte do\u00A0celého sveta a hlásajte evanjelium všetkému stvoreniu.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"20", "A", "", "Jn 20, 19-31",
                    "O osem dní prišiel Ježiš",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Večer v\u00A0ten istý prvý deň v\u00A0týždni, keď boli učeníci zo\u00A0strachu pred\u00A0Židmi zhromaždení za\u00A0zatvorenými dverami, prišiel Ježiš, stal si doprostred a povedal im: \"Pokoj vám!\" Ako to povedal, ukázal im ruky a bok. Učeníci sa zaradovali, keď videli Pána.<br>" +
                            "A znova im povedal: \"Pokoj vám! Ako mňa poslal Otec, aj ja posielam vás.\" Keď to povedal, dýchol na\u00A0nich a hovoril im: \"Prijmite Ducha Svätého. Komu odpustíte hriechy, budú mu odpustené, komu ich zadržíte, budú zadržané.\" Tomáš, jeden z\u00A0Dvanástich, nazývaný Didymus, nebol s\u00A0nimi, keď prišiel Ježiš. Ostatní učeníci mu hovorili: \"Videli sme Pána.\"<br>" +
                            "Ale on im povedal: \"Ak neuvidím na\u00A0jeho rukách stopy po\u00A0klincoch a nevložím svoj prst do\u00A0rán po\u00A0klincoch a nevložím svoju ruku do\u00A0jeho boku, neuverím.\"<br>" +
                            "O osem dní boli jeho učeníci zasa vnútri a Tomáš bol s\u00A0nimi. Prišiel Ježiš, hoci dvere boli zatvorené, stal si doprostred a povedal: \"Pokoj vám!\"<br>" +
                            "Potom povedal Tomášovi: \"Vlož sem prst a pozri moje ruky! Vystri ruku a vlož ju do\u00A0môjho boku! A nebuď neveriaci, ale veriaci!\"<br>" +
                            "Tomáš mu odpovedal: \"Pán môj a Boh môj!\"<br>" +
                            "Ježiš mu povedal: \"Uveril si, pretože si ma videl. Blahoslavení tí, čo nevideli, a uverili.\"<br>" +
                            "Ježiš urobil pred\u00A0očami svojich učeníkov ešte mnoho iných znamení, ktoré nie sú zapísané v\u00A0tejto knihe. Ale toto je napísané, aby ste verili, že Ježiš je Mesiáš, Boží Syn, a aby ste vierou mali život v\u00A0jeho mene.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"20", "B", "", "Jn 20, 19-31",
                    "O osem dní prišiel Ježiš",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Večer v\u00A0ten istý prvý deň v\u00A0týždni, keď boli učeníci zo\u00A0strachu pred\u00A0Židmi zhromaždení za\u00A0zatvorenými dverami, prišiel Ježiš, stal si doprostred a povedal im: \"Pokoj vám!\" Ako to povedal, ukázal im ruky a bok. Učeníci sa zaradovali, keď videli Pána.<br>" +
                            "A znova im povedal: \"Pokoj vám! Ako mňa poslal Otec, aj ja posielam vás.\" Keď to povedal, dýchol na\u00A0nich a hovoril im: \"Prijmite Ducha Svätého. Komu odpustíte hriechy, budú mu odpustené, komu ich zadržíte, budú zadržané.\" Tomáš, jeden z\u00A0Dvanástich, nazývaný Didymus, nebol s\u00A0nimi, keď prišiel Ježiš. Ostatní učeníci mu hovorili: \"Videli sme Pána.\"<br>" +
                            "Ale on im povedal: \"Ak neuvidím na\u00A0jeho rukách stopy po\u00A0klincoch a nevložím svoj prst do\u00A0rán po\u00A0klincoch a nevložím svoju ruku do\u00A0jeho boku, neuverím.\"<br>" +
                            "O osem dní boli jeho učeníci zasa vnútri a Tomáš bol s\u00A0nimi. Prišiel Ježiš, hoci dvere boli zatvorené, stal si doprostred a povedal: \"Pokoj vám!\"<br>" +
                            "Potom povedal Tomášovi: \"Vlož sem prst a pozri moje ruky! Vystri ruku a vlož ju do\u00A0môjho boku! A nebuď neveriaci, ale veriaci!\"<br>" +
                            "Tomáš mu odpovedal: \"Pán môj a Boh môj!\"<br>" +
                            "Ježiš mu povedal: \"Uveril si, pretože si ma videl. Blahoslavení tí, čo nevideli, a uverili.\"<br>" +
                            "Ježiš urobil pred\u00A0očami svojich učeníkov ešte mnoho iných znamení, ktoré nie sú zapísané v\u00A0tejto knihe. Ale toto je napísané, aby ste verili, že Ježiš je Mesiáš, Boží Syn, a aby ste vierou mali život v\u00A0jeho mene.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"20", "C", "", "Jn 20, 19-31",
                    "O osem dní prišiel Ježiš",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Večer v\u00A0ten istý prvý deň v\u00A0týždni, keď boli učeníci zo\u00A0strachu pred\u00A0Židmi zhromaždení za\u00A0zatvorenými dverami, prišiel Ježiš, stal si doprostred a povedal im: \"Pokoj vám!\" Ako to povedal, ukázal im ruky a bok. Učeníci sa zaradovali, keď videli Pána.<br>" +
                            "A znova im povedal: \"Pokoj vám! Ako mňa poslal Otec, aj ja posielam vás.\" Keď to povedal, dýchol na\u00A0nich a hovoril im: \"Prijmite Ducha Svätého. Komu odpustíte hriechy, budú mu odpustené, komu ich zadržíte, budú zadržané.\" Tomáš, jeden z\u00A0Dvanástich, nazývaný Didymus, nebol s\u00A0nimi, keď prišiel Ježiš. Ostatní učeníci mu hovorili: \"Videli sme Pána.\"<br>" +
                            "Ale on im povedal: \"Ak neuvidím na\u00A0jeho rukách stopy po\u00A0klincoch a nevložím svoj prst do\u00A0rán po\u00A0klincoch a nevložím svoju ruku do\u00A0jeho boku, neuverím.\"<br>" +
                            "O osem dní boli jeho učeníci zasa vnútri a Tomáš bol s\u00A0nimi. Prišiel Ježiš, hoci dvere boli zatvorené, stal si doprostred a povedal: \"Pokoj vám!\"<br>" +
                            "Potom povedal Tomášovi: \"Vlož sem prst a pozri moje ruky! Vystri ruku a vlož ju do\u00A0môjho boku! A nebuď neveriaci, ale veriaci!\"<br>" +
                            "Tomáš mu odpovedal: \"Pán môj a Boh môj!\"<br>" +
                            "Ježiš mu povedal: \"Uveril si, pretože si ma videl. Blahoslavení tí, čo nevideli, a uverili.\"<br>" +
                            "Ježiš urobil pred\u00A0očami svojich učeníkov ešte mnoho iných znamení, ktoré nie sú zapísané v\u00A0tejto knihe. Ale toto je napísané, aby ste verili, že Ježiš je Mesiáš, Boží Syn, a aby ste vierou mali život v\u00A0jeho mene.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"21", "1", "", "Jn 3, 1-8",
                    "Ak sa niekto nenarodí z\u00A0vody a z\u00A0Ducha, nemôže vojsť do\u00A0Božieho kráľovstva",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Medzi farizejmi bol človek menom Nikodém, popredný muž u\u00A0Židov. On prišiel v\u00A0noci k\u00A0Ježišovi a povedal mu: \"Rabbi, vieme, že si prišiel od\u00A0Boha ako učiteľ, lebo nik nemôže robiť také znamenia, aké ty robíš, ak nie je s\u00A0ním Boh.\"<br>" +
                            "Ježiš mu odpovedal: \"Veru, veru, hovorím ti: Ak sa niekto nenarodí zhora, nemôže uzrieť Božie kráľovstvo.\"<br>" +
                            "Nikodém mu vravel: \"Ako sa môže človek narodiť, keď je už starý? Azda môže druhý raz vojsť do\u00A0lona svojej matky a narodiť sa?\"<br>" +
                            "Ježiš odpovedal: \"Veru, veru, hovorím ti: Ak sa niekto nenarodí z\u00A0vody a z\u00A0Ducha, nemôže vojsť do\u00A0Božieho kráľovstva.<br>" +
                            "Čo sa narodilo z\u00A0tela, je telo, a čo sa narodilo z\u00A0Ducha, je duch.<br>" +
                            "Nečuduj sa, že som ti povedal: Musíte sa znova narodiť. Vietor veje, kam chce; počuješ jeho šum, ale nevieš, odkiaľ prichádza a kam ide. Tak je to s\u00A0každým, kto sa narodil z\u00A0Ducha.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"22", "2", "", "Jn 3, 7b-15",
                    "Nik nevystúpil do\u00A0neba, iba ten, čo zostúpil z\u00A0neba, Syn človeka",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal Nikodémovi: \"Musíte sa znova narodiť. Vietor veje, kam chce; počuješ jeho šum, ale nevieš, odkiaľ prichádza a kam ide. Tak je to s\u00A0každým, kto sa narodil z\u00A0Ducha.\"<br>" +
                            "Nikodém sa ho opýtal: \"Ako sa to môže stať?\"<br>" +
                            "Ježiš mu odvetil: \"Ty si učiteľ Izraela a toto nevieš? Veru, veru, hovorím ti: Hovoríme o\u00A0tom, čo poznáme, a svedčíme o\u00A0tom, čo sme videli, a neprijímate naše svedectvo.<br>" +
                            "Ak neveríte, keď vám hovorím o\u00A0pozemských veciach, akože uveríte, keď vám budem rozprávať o\u00A0nebeských?<br>" +
                            "Nik nevystúpil do\u00A0neba, iba ten, čo zostúpil z\u00A0neba, Syn človeka. A ako Mojžiš vyzdvihol na\u00A0púšti hada, tak musí byť vyzdvihnutý aj Syn človeka, aby každý, kto verí, mal v\u00A0ňom večný život.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"23", "3", "", "Jn 3, 16-21",
                    "Boh poslal Syna, aby sa skrze neho svet spasil",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Boh tak miloval svet, že dal svojho jednorodeného Syna, aby nezahynul nik, kto v\u00A0neho verí, ale aby mal večný život. Lebo Boh neposlal Syna na\u00A0svet, aby svet odsúdil, ale aby sa skrze neho svet spasil.<br>" +
                            "Kto v\u00A0neho verí, nie je súdený. Ale kto neverí, už je odsúdený, pretože neuveril v\u00A0meno Jednorodeného Božieho Syna.<br>" +
                            "A súd je v\u00A0tomto: Svetlo prišlo na\u00A0svet, a ľudia milovali tmu viac ako svetlo, lebo ich skutky boli zlé.<br>" +
                            "Veď každý, kto zle robí, nenávidí svetlo a nejde na\u00A0svetlo, aby jeho skutky neboli odhalené. Ale kto koná pravdu, ide na\u00A0svetlo, aby bolo vidieť, že svoje skutky koná v\u00A0Bohu.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"24", "4", "", "Jn 3, 31-36",
                    "Otec miluje Syna a dal mu do\u00A0rúk všetko",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Kto prichádza zhora, je nad\u00A0všetkých. Kto je zo\u00A0zeme, patrí zemi a hovorí pozemsky. Kto prichádza z\u00A0neba, je nad\u00A0všetkých a svedčí o\u00A0tom, čo videl a počul, ale nik neprijíma jeho svedectvo.<br>" +
                            "Kto prijíma jeho svedectvo, potvrdzuje, že Boh je pravdivý. Lebo ten, koho poslal Boh, hovorí Božie slová, pretože on nedáva Ducha podľa miery.<br>" +
                            "Otec miluje Syna a dal mu do\u00A0rúk všetko. Kto verí v\u00A0Syna, má večný život, ale kto Synovi neverí, neuzrie život a spočinie na\u00A0ňom Boží hnev.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"25", "5", "", "Jn 6, 1-15",
                    "Rozdával sediacim, koľko chceli",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš odišiel na\u00A0druhý breh Galilejského čiže Tiberiadského mora. Šlo za\u00A0ním veľké množstvo ľudí, lebo videli znamenia, ktoré robil na\u00A0chorých. Ježiš vystúpil na\u00A0vrch a tam si sadol so\u00A0svojimi učeníkmi. Blízko boli židovské sviatky Veľkej noci.<br>" +
                            "Keď Ježiš zdvihol oči a videl, že k\u00A0nemu prichádza veľké množstvo ľudí, povedal Filipovi: \"Kde nakúpime chleba, aby sa títo najedli?\" Ale to povedal len preto, že ho skúšal. Lebo sám vedel, čo urobí.<br>" +
                            "Filip mu odpovedal: \"Ani za\u00A0dvesto denárov chleba nebude stačiť, ak sa má každému ujsť čo len kúsok.\"<br>" +
                            "Jeden z\u00A0jeho učeníkov, Ondrej, brat Šimona Petra, mu povedal: \"Je tu chlapec, ktorý má päť jačmenných chlebov a dve ryby. Ale čo je to pre\u00A0toľkých!?\"<br>" +
                            "Ježiš povedal: \"Usaďte ľudí!\"<br>" +
                            "Na tom mieste bolo mnoho trávy. A mužov si tam posadalo okolo päťtisíc.<br>" +
                            "Tu Ježiš vzal chleby, vzdával vďaky a rozdával sediacim; podobne aj z\u00A0rýb, koľko chceli.<br>" +
                            "Keď sa nasýtili, povedal svojim učeníkom: \"Pozbierajte zvyšné odrobiny, aby nič nevyšlo nazmar!\" Pozbierali teda a odrobinami z\u00A0piatich jačmenných chlebov, ktoré zostali po\u00A0tých, čo jedli, naplnili dvanásť košov.<br>" +
                            "Keď ľudia videli, aké znamenie urobil, hovorili: \"Toto je naozaj ten prorok, ktorý má prísť na\u00A0svet.\"<br>" +
                            "Ale keď Ježiš spoznal, že chcú prísť, zmocniť sa ho a urobiť ho kráľom, znova sa utiahol na\u00A0vrch celkom sám.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"26", "6", "", "Jn 6, 16-21",
                    "Videli Ježiša kráčať po\u00A0mori",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Keď sa zvečerilo, zišli Ježišovi učeníci k\u00A0moru, nastúpili na\u00A0loď a plavili sa na\u00A0druhú stranu mora do\u00A0Kafarnauma.<br>" +
                            "Už sa zotmelo, a Ježiš k\u00A0nim ešte neprišiel. Dul silný vietor a more bolo rozbúrené.<br>" +
                            "Veslovali tak dvadsaťpäť až tridsať stadií, keď videli Ježiša kráčať po\u00A0mori a blížiť sa k\u00A0lodi, a zľakli sa. Ale on im povedal: \"To som ja, nebojte sa!\" Chceli ho vziať na\u00A0loď, ale loď bola už pri\u00A0brehu, ku\u00A0ktorému sa plavili.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"30", "A", "", "Lk 24, 13-35",
                    "Spoznali ho pri\u00A0lámaní chleba",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "V ten deň išli dvaja z\u00A0Ježišových učeníkov do\u00A0dediny zvanej Emauzy, ktorá bola od\u00A0Jeruzalema vzdialená šesťdesiat stadií, a zhovárali sa o\u00A0všetkom, čo sa prihodilo. Ako sa tak zhovárali a spoločne uvažovali, priblížil sa k\u00A0nim sám Ježiš a išiel s\u00A0nimi. Ich oči boli zastreté, aby ho nepoznali. I spýtal sa ich: \"O čom sa to cestou zhovárate?\"<br>" +
                            "Zastavili sa zronení a jeden z\u00A0nich, menom Kleopas, mu povedal: \"Ty si vari jediný cudzinec v\u00A0Jeruzaleme, ktorý nevie, čo sa tam stalo v\u00A0týchto dňoch?\"<br>" +
                            "On im povedal: \"A čo?\"<br>" +
                            "Oni mu vraveli: \"No s\u00A0Ježišom Nazaretským, ktorý bol prorokom, mocným v\u00A0čine i v\u00A0reči pred\u00A0Bohom aj pred\u00A0všetkým ľudom; ako ho veľkňazi a naši poprední muži dali odsúdiť na\u00A0smrť a ukrižovali. A my sme dúfali, že on vykúpi Izrael. Ale dnes je už tretí deň, ako sa to všetko stalo. Niektoré ženy z\u00A0našich nás aj naľakali. Pred\u00A0svitaním boli pri\u00A0hrobe, a keď nenašli jeho telo, prišli a tvrdili, že sa im zjavili anjeli a hovorili, že on žije. Niektorí z\u00A0našich odišli k\u00A0hrobu a zistili, že je to tak, ako vraveli ženy, ale jeho nevideli.\"<br>" +
                            "On im povedal: \"Vy nechápaví a ťarbaví srdcom uveriť všetko, čo hovorili proroci! Či nemal Mesiáš toto všetko vytrpieť, a tak vojsť do\u00A0svojej slávy?\" A počnúc od\u00A0Mojžiša a všetkých Prorokov, vykladal im, čo sa naňho v\u00A0celom Písme vzťahovalo.<br>" +
                            "Tak sa priblížili k\u00A0dedine, do\u00A0ktorej šli, a on sa tváril, že ide ďalej. Ale oni naň naliehali: \"Zostaň s\u00A0nami, lebo sa zvečerieva a deň sa už schýlil!\"<br>" +
                            "Vošiel teda a zostal s\u00A0nimi. A keď sedel s\u00A0nimi pri\u00A0stole, vzal chlieb a dobrorečil, lámal ho a podával im ho. Vtom sa im otvorili oči a spoznali ho. Ale on im zmizol. Tu si povedali: \"Či nám nehorelo srdce, keď sa s\u00A0nami cestou rozprával a vysvetľoval nám Písma?\"<br>" +
                            "A ešte v\u00A0tú hodinu vstali a vrátili sa do\u00A0Jeruzalema. Tam našli zhromaždených Jedenástich a iných s\u00A0nimi a tí im povedali: \"Pán naozaj vstal z\u00A0mŕtvych a zjavil sa Šimonovi.\" Aj oni porozprávali, čo sa im stalo cestou a ako ho spoznali pri\u00A0lámaní chleba.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"30", "B", "", "Lk 24, 35-48",
                    "Tak je napísané, že Mesiáš bude trpieť a tretieho dňa vstane z\u00A0mŕtvych",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježišovi učeníci porozprávali, čo sa im stalo cestou a ako ho spoznali pri\u00A0lámaní chleba.<br>" +
                            "Kým o\u00A0tom hovorili, on sám zastal uprostred nich a povedal im: \"Pokoj vám.\" Zmätení a naľakaní si mysleli, že vidia ducha. On im povedal. \"Čo sa ľakáte a prečo vám srdcia zachvacujú také myšlienky? Pozrite na\u00A0moje ruky a nohy, že som to ja! Dotknite sa ma a presvedčte sa! Veď duch nemá mäso a kosti a vidíte, že ja mám.\" Ako to povedal, ukázal im ruky a nohy.<br>" +
                            "A keď tomu stále od\u00A0veľkej radosti nemohli uveriť a len sa divili, povedal im: \"Máte tu niečo na\u00A0jedenie?\" Oni mu podali kúsok pečenej ryby. I vzal si a jedol pred\u00A0nimi. Potom im povedal: \"Toto je to, čo som vám hovoril, kým som bol ešte s\u00A0vami, že sa musí splniť všetko, čo je o\u00A0mne napísané v\u00A0Mojžišovom zákone, u\u00A0Prorokov a v\u00A0Žalmoch.\"<br>" +
                            "Vtedy im otvoril myseľ, aby porozumeli Písmu, a povedal im: \"Tak je napísané, že Mesiáš bude trpieť a tretieho dňa vstane z\u00A0mŕtvych a v\u00A0jeho mene sa bude všetkým národom, počnúc od\u00A0Jeruzalema, hlásať pokánie na\u00A0odpustenie hriechov. Vy ste toho svedkami.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"30", "C", "", "Jn 21, 1-19",
                    "Ježiš pristúpil, vzal chlieb a dával im; podobne aj rybu",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš sa znova zjavil učeníkom pri\u00A0Tiberiadskom mori. A zjavil sa takto: Boli spolu Šimon Peter, Tomáš nazývaný Didymus, Natanael z\u00A0Kány Galilejskej, Zebedejovi synovia a iní dvaja z\u00A0jeho učeníkov. Šimon Peter im povedal: \"Idem loviť ryby.\"<br>" +
                            "Povedali mu: \"Pôjdeme aj my s\u00A0tebou.\" Išli a nastúpili na\u00A0loď. Ale tej noci nechytili nič.<br>" +
                            "Keď sa už rozodnilo, stál Ježiš na\u00A0brehu; ale učeníci nevedeli, že je to Ježiš. A Ježiš sa ich opýtal: \"Deti, máte niečo na\u00A0jedenie?\"<br>" +
                            "Odpovedali mu: \"Nemáme.\"<br>" +
                            "On im povedal: \"Spustite sieť z\u00A0pravej strany lode a nájdete.\" Oni spustili a pre\u00A0množstvo rýb ju už nevládali vytiahnuť.<br>" +
                            "Učeník, ktorého Ježiš miloval, povedal Petrovi: \"To je Pán.\"<br>" +
                            "Len čo Šimon Peter počul, že je to Pán, pripásal si šaty nebol totiž oblečený a skočil do\u00A0mora. Ostatní učeníci prišli na\u00A0lodi, lebo neboli ďaleko od\u00A0brehu, len asi dvesto lakťov, a sieť s\u00A0rybami ťahali za\u00A0sebou.<br>" +
                            "Keď vystúpili na\u00A0breh, videli rozloženú pahrebu a na\u00A0nej položenú rybu a chlieb. Ježiš im povedal: \"Doneste z\u00A0rýb, čo ste teraz chytili!\" Šimon Peter šiel a vytiahol na\u00A0breh sieť plnú veľkých rýb. Bolo ich stopäťdesiattri. A hoci ich bolo toľko, sieť sa nepretrhla.<br>" +
                            "Ježiš im povedal: \"Poďte jesť!\" A nik z\u00A0učeníkov sa ho neodvážil spýtať: \"Kto si?\", lebo vedeli, že je to Pán.<br>" +
                            "Ježiš pristúpil, vzal chlieb a dával im; podobne aj rybu.<br>" +
                            "To sa Ježiš učeníkom zjavil už tretí raz od\u00A0svojho zmŕtvychvstania.<br>" +
                            "Keď sa najedli, Ježiš sa opýtal Šimona Petra: \"Šimon, syn Jánov, miluješ ma väčšmi ako títo?\"<br>" +
                            "Odpovedal mu: \"Áno, Pane, ty vieš, že ťa mám rád.\"<br>" +
                            "Ježiš mu povedal: \"Pas moje baránky.\"<br>" +
                            "Opýtal sa ho aj druhý raz: \"Šimon, syn Jánov, miluješ ma?\"<br>" +
                            "On mu odpovedal: \"Áno, Pane, ty vieš, že ťa mám rád.\"<br>" +
                            "Ježiš mu povedal: \"Pas moje ovce!\"<br>" +
                            "Pýtal sa ho tretí raz: \"Šimon, syn Jánov, máš ma rád?\"<br>" +
                            "Petra zarmútilo, že sa ho tretí raz spýtal: \"Máš ma rád?\", a povedal mu: \"Pane, ty vieš všetko, ty dobre vieš, že ťa mám rád.\"<br>" +
                            "Ježiš mu povedal: \"Pas moje ovce! Veru, veru, hovorím ti: Keď si bol mladší, sám si sa opásal a chodil si, kade si chcel. Ale keď zostarneš, vystrieš ruky, iný ťa opáše a povedie, kam nechceš.\" To povedal, aby naznačil, akou smrťou oslávi Boha. Ako to povedal, vyzval ho: \"Poď za\u00A0mnou!\"<br>" +
                            "Počuli sme slovo Pánovo.",
                    "Alebo:",
                    "Jn 21, 1-14",
                    "Ježiš pristúpil, vzal chlieb a dával im; podobne aj rybu",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš sa znova zjavil učeníkom pri\u00A0Tiberiadskom mori. A zjavil sa takto: Boli spolu Šimon Peter, Tomáš nazývaný Didymus, Natanael z\u00A0Kány Galilejskej, Zebedejovi synovia a iní dvaja z\u00A0jeho učeníkov.<br>" +
                            "Šimon Peter im povedal: \"Idem loviť ryby.\"<br>" +
                            "Povedali mu: \"Pôjdeme aj my s\u00A0tebou.\" Išli a nastúpili na\u00A0loď. Ale tej noci nechytili nič.<br>" +
                            "Keď sa už rozodnilo, stál Ježiš na\u00A0brehu; ale učeníci nevedeli, že je to Ježiš. A Ježiš sa ich opýtal: \"Deti, máte niečo na\u00A0jedenie?\"<br>" +
                            "Odpovedali mu: \"Nemáme.\"<br>" +
                            "On im povedal: \"Spustite sieť z\u00A0pravej strany lode a nájdete.\" Oni spustili a pre\u00A0množstvo rýb ju už nevládali vytiahnuť.<br>" +
                            "Učeník, ktorého Ježiš miloval, povedal Petrovi: \"To je Pán.\" Len čo Šimon Peter počul, že je to Pán, pripásal si šaty nebol totiž oblečený a skočil do\u00A0mora. Ostatní učeníci prišli na\u00A0lodi, lebo neboli ďaleko od\u00A0brehu, len asi dvesto lakťov, a sieť s\u00A0rybami ťahali za\u00A0sebou.<br>" +
                            "Keď vystúpili na\u00A0breh, videli rozloženú pahrebu a na\u00A0nej položenú rybu a chlieb. Ježiš im povedal: \"Doneste z\u00A0rýb, čo ste teraz chytili!\" Šimon Peter šiel a vytiahol na\u00A0breh sieť plnú veľkých rýb. Bolo ich stopäťdesiattri. A hoci ich bolo toľko, sieť sa nepretrhla.<br>" +
                            "Ježiš im povedal: \"Poďte jesť!\" A nik z\u00A0učeníkov sa ho neodvážil spýtať: \"Kto si?\", lebo vedeli, že je to Pán.<br>" +
                            "Ježiš pristúpil, vzal chlieb a dával im; podobne aj rybu.<br>" +
                            "To sa Ježiš učeníkom zjavil už tretí raz od\u00A0svojho zmŕtvychvstania.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"31", "1", "", "Jn 6, 22-29",
                    "Nezháňajte sa za\u00A0pominuteľným pokrmom, ale za\u00A0tým, ktorý ostáva pre\u00A0večný život",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Keď Ježiš nasýtil päťtisíc ľudí, jeho učeníci ho videli chodiť po\u00A0mori. Na\u00A0druhý deň si však zástup, čo zostal na\u00A0druhom brehu mora, všimol, že tam bola iba jedna loďka a že Ježiš nenastúpil na\u00A0loď so\u00A0svojimi učeníkmi, ale že sa učeníci odplavili sami. A z\u00A0Tiberiady prišli iné lode k\u00A0miestu, kde jedli chlieb, keď Pán vzdával vďaky.<br>" +
                            "No zástup zbadal, že tam nie je ani Ježiš ani jeho učeníci. Preto aj oni nastúpili na\u00A0loďky, prišli do\u00A0Kafarnauma a hľadali Ježiša. Keď ho na\u00A0druhom brehu mora našli, povedali mu: \"Rabbi, kedy si sem prišiel?\"<br>" +
                            "Ježiš im odpovedal: \"Veru, veru, hovorím vám: Nehľadáte ma preto, že ste videli znamenia, ale preto, že ste jedli z\u00A0chlebov a nasýtili ste sa.<br>" +
                            "Nezháňajte sa za\u00A0pominuteľným pokrmom, ale za\u00A0pokrmom, ktorý ostáva pre\u00A0večný život, a ten vám dá Syn človeka. Lebo jeho označil Otec, Boh, svojou pečaťou.\"<br>" +
                            "Povedali mu: \"Čo máme robiť, aby sme konali Božie skutky?\" Ježiš im odpovedal: \"Boží skutok je veriť v\u00A0toho, ktorého on poslal.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"32", "2", "", "Jn 6, 30-35",
                    "Nie Mojžiš, ale môj Otec dáva pravý chlieb z\u00A0neba",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Zástup sa pýtal Ježiša: \"Aké znamenie urobíš, aby sme videli a uverili ti? Čo urobíš? Naši otcovia na\u00A0púšti jedli mannu, ako je napísané: ‚Dal im jesť chlieb z\u00A0neba.'\"<br>" +
                            "Ježiš im odvetil: \"Veru, veru, hovorím vám: Nie Mojžiš vám dal chlieb z\u00A0neba, ale môj Otec vám dáva pravý chlieb z\u00A0neba. Lebo Boží chlieb je ten, ktorý zostúpil z\u00A0neba a dáva svetu život.\"<br>" +
                            "Povedali mu: \"Pane, vždy nám dávaj taký chlieb.\"<br>" +
                            "Ježiš im povedal: \"Ja som chlieb života. Kto prichádza ku\u00A0mne, nikdy nebude hladovať, a kto verí vo\u00A0mňa, nikdy nebude žízniť.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"33", "3", "", "Jn 6, 35-40",
                    "Vôľa Otca je, aby každý, kto vidí Syna, mal večný život",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal zástupom: \"Ja som chlieb života. Kto prichádza ku\u00A0mne, nikdy nebude hladovať, a kto verí vo\u00A0mňa, nikdy nebude žízniť.<br>" +
                            "Ale už som vám povedal: Aj ste ma videli, a neveríte. Všetko, čo mi dáva Otec, príde ku\u00A0mne. A toho, kto prichádza ku\u00A0mne, neodoženiem, lebo som nezostúpil z\u00A0neba, aby som plnil svoju vôľu, ale vôľu toho ktorý ma poslal.<br>" +
                            "A vôľa toho, ktorý ma poslal, je, aby som nestratil nič z\u00A0toho, čo mi dal, ale aby som všetko vzkriesil v\u00A0posledný deň. Lebo vôľa môjho Otca je, aby každý, kto vidí Syna a verí v\u00A0neho, mal večný život; a ja ho vzkriesim v\u00A0posledný deň.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"34", "4", "", "Jn 6, 44-51",
                    "Ja som živý chlieb, ktorý zostúpil z\u00A0neba",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal zástupom: \"Nik nemôže prísť ku\u00A0mne, ak ho nepritiahne Otec, ktorý ma poslal. A ja ho vzkriesim v\u00A0posledný deň. U Prorokov je napísané: ‚Všetkých bude učiť sám Boh.' A každý, kto počul Otca a dal sa poučiť, prichádza ku\u00A0mne. Nie že by bol niekto videl Otca; iba ten, ktorý je od\u00A0Boha, videl Otca.<br>" +
                            "Veru, veru, hovorím vám: Kto verí, má večný život.<br>" +
                            "Ja som chlieb života. Vaši otcovia jedli na\u00A0púšti mannu a pomreli.<br>" +
                            "Toto je ten chlieb, ktorý zostupuje z\u00A0neba, aby nezomrel nik, kto bude z\u00A0neho jesť.<br>" +
                            "Ja som živý chlieb, ktorý zostúpil z\u00A0neba. Kto bude jesť z\u00A0tohoto chleba, bude žiť naveky. A chlieb, ktorý ja dám, je moje telo za\u00A0život sveta.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"35", "5", "", "Jn 6, 52-59",
                    "Moje telo je pravý pokrm a moja krv je pravý nápoj",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Židia sa hádali medzi sebou a hovorili: \"Ako nám tento môže dať jesť svoje telo?!\"<br>" +
                            "Ježiš im povedal: \"Veru, veru, hovorím vám: Ak nebudete jesť telo Syna človeka a piť jeho krv, nebudete mať v\u00A0sebe život.<br>" +
                            "Kto je moje telo a pije moju krv, má večný život a ja ho vzkriesim v\u00A0posledný deň. Lebo moje telo je pravý pokrm a moja krv je pravý nápoj.<br>" +
                            "Kto je moje telo a pije moju krv, ostáva vo\u00A0mne a ja v\u00A0ňom.<br>" +
                            "Ako mňa poslal živý Otec a ja žijem z\u00A0Otca, aj ten, čo mňa je, bude žiť zo\u00A0mňa.<br>" +
                            "Toto je ten chlieb, ktorý zostúpil z\u00A0neba, a nie aký jedli otcovia a pomreli. Kto je tento chlieb, bude žiť naveky.\"<br>" +
                            "Toto povedal v\u00A0synagóge, keď učil v\u00A0Kafarnaume.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"36", "6", "", "Jn 6, 60-69",
                    "Ku komu by sme išli? Ty máš slová večného života",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Mnohí z\u00A0Ježišových učeníkov povedali: \"Tvrdá je to reč! Kto to môže počúvať?!\"<br>" +
                            "Ježiš vedel sám od\u00A0seba, že jeho učeníci na\u00A0to šomrú, a opýtal sa ich: \"Toto vás pohoršuje? A čo až uvidíte Syna človeka vystupovať ta, kde bol predtým? Duch oživuje, telo nič neosoží. Slová, ktoré som vám povedal, sú Duch a život. Ale niektorí z\u00A0vás neveria.\"<br>" +
                            "Lebo Ježiš od\u00A0počiatku vedel, ktorí neveria a kto ho zradí. A povedal: \"Preto som vám hovoril: Nik nemôže prísť ku\u00A0mne, ak mu to nedá Otec.\"<br>" +
                            "Vtedy ho mnohí z\u00A0jeho učeníkov opustili a viac s\u00A0ním nechodili.<br>" +
                            "Ježiš povedal Dvanástim: \"Aj vy chcete odísť?\"<br>" +
                            "Odpovedal mu Šimon Peter: \"Pane, a ku\u00A0komu by sme išli? Ty máš slová večného života. A my sme uverili a spoznali, že ty si Boží Svätý.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"40", "A", "", "Jn 10, 1-10",
                    "Ja som brána k\u00A0ovciam",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal: \"Veru, veru, hovorím vám: Kto nevchádza do\u00A0ovčinca bránou, ale prelieza inokade, je zlodej a zbojník. Kto vchádza bránou je pastier oviec. Tomu vrátnik otvára a ovce počúvajú jeho hlas. On volá svoje ovce po\u00A0mene a vyvádza ich. Keď ich všetky vyženie, kráča pred\u00A0nimi a ovce idú za\u00A0ním, lebo poznajú jeho hlas. Za cudzím nepôjdu, ba ujdú od\u00A0neho, lebo cudzí hlas nepoznajú.\" Ježiš im to povedal takto obrazne, ale oni nepochopili, čo im to chcel povedať.<br>" +
                            "Preto im Ježiš znova vravel: \"Veru, veru, hovorím vám: Ja som brána k\u00A0ovciam: Všetci, čo prišli predo\u00A0mnou, sú zlodeji a zbojníci, ale ovce ich nepočúvali. Ja som brána. Kto vojde cezo mňa, bude spasený; bude vchádzať i vychádzať a nájde pastvu.<br>" +
                            "Zlodej prichádza, len aby kradol, zabíjal a ničil. Ja som prišiel, aby mali život a aby ho mali hojnejšie.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"40", "B", "", "Jn 10, 11-18",
                    "Dobrý pastier položí svoj život za\u00A0ovce",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal: \"Ja som dobrý pastier. Dobrý pastier položí svoj život za\u00A0ovce. Nájomník a ten, čo nie je pastierom a ovce nie sú jeho, opúšťa ovce a uteká, keď vidí prichádzať vlka, a vlk ich trhá a rozháňa. Veď je nádenník a nezáleží mu na\u00A0ovciach.<br>" +
                            "Ja som dobrý pastier. Poznám svoje a moje poznajú mňa, ako mňa pozná Otec a ja poznám Otca. Aj svoj život položím za\u00A0ovce.<br>" +
                            "Mám aj iné ovce, ktoré nie sú z\u00A0tohoto ovčinca. Aj tie musím priviesť a budú počuť môj hlas; a bude jedno stádo a jeden pastier.<br>" +
                            "Otec ma preto miluje, že ja dávam svoj život, a zasa si ho vezmem. Nik mi ho neberie, ja ho dávam sám od\u00A0seba. Mám moc dať ho a mám moc zasa si ho vziať. Taký príkaz som dostal od\u00A0môjho Otca.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"40", "C", "", "Jn 10, 27-30",
                    "Ja dávam svojim ovciam večný život",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal: \"Moje ovce počúvajú môj hlas, ja ich poznám a ony idú za\u00A0mnou. Ja im dávam večný život. Nezahynú nikdy a nik mi ich nevytrhne z\u00A0ruky. Môj Otec, ktorý mi ich dal, je väčší od\u00A0všetkých a nik ich nemôže Otcovi vytrhnúť z\u00A0ruky. Ja a Otec sme jedno.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"41", "1", "", "Jn 10, 11-18",
                    "Dobrý pastier položí svoj život za\u00A0ovce",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal: \"Ja som dobrý pastier. Dobrý pastier položí svoj život za\u00A0ovce. Nájomník a ten, čo nie je pastierom a ovce nie sú jeho, opúšťa ovce a uteká, keď vidí prichádzať vlka, a vlk ich trhá a rozháňa. Veď je nádenník a nezáleží mu na\u00A0ovciach.<br>" +
                            "Ja som dobrý pastier. Poznám svoje a moje poznajú mňa, ako mňa pozná Otec a ja poznám Otca. Aj svoj život položím za\u00A0ovce.<br>" +
                            "Mám aj iné ovce, ktoré nie sú z\u00A0tohoto ovčinca. Aj tie musím priviesť a budú počuť môj hlas; a bude jedno stádo a jeden pastier.<br>" +
                            "Otec ma preto miluje, že ja dávam svoj život, a zasa si ho vezmem. Nik mi ho neberie, ja ho dávam sám od\u00A0seba. Mám moc dať ho a mám moc zasa si ho vziať. Taký príkaz som dostal od\u00A0môjho Otca.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"42", "2", "", "Jn 10, 22-30",
                    "Ja a Otec sme jedno",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "V Jeruzaleme boli sviatky Posvätenia chrámu. Bola zima.<br>" +
                            "Ježiš sa prechádzal v\u00A0chráme v\u00A0Šalamúnovom stĺporadí. Obstúpili ho Židia a hovorili mu: \"Dokedy nás chceš držať v\u00A0neistote?! Ak si Mesiáš, povedz nám to otvorene.\"<br>" +
                            "Ježiš im odvetil: \"Už som vám povedal, a neveríte. Svedčia o\u00A0mne skutky, ktoré konám v\u00A0mene svojho Otca, ale vy neveríte, lebo nie ste z\u00A0mojich oviec.<br>" +
                            "Moje ovce počúvajú môj hlas, ja ich poznám a ony idú za\u00A0mnou. Ja im dávam večný život. Nezahynú nikdy a nik mi ich nevytrhne z\u00A0ruky.<br>" +
                            "Môj Otec, ktorý mi ich dal, je väčší od\u00A0všetkých a nik ich nemôže Otcovi vytrhnúť z\u00A0ruky. Ja a Otec sme jedno.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"43", "3", "", "Jn 12, 44-50",
                    "Ja som prišiel na\u00A0svet ako svetlo",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš zvolal: \"Kto verí vo\u00A0mňa, nie vo\u00A0mňa verí, ale v\u00A0toho, ktorý ma poslal. A kto vidí mňa, vidí toho, ktorý ma poslal.<br>" +
                            "Ja som prišiel na\u00A0svet ako svetlo, aby nik, kto verí vo\u00A0mňa, neostal vo\u00A0tmách.<br>" +
                            "Ak niekto počúva moje slová a nezachováva ich, ja ho nesúdim, lebo som neprišiel svet súdiť, ale svet spasiť.<br>" +
                            "Kto mnou pohŕda a neprijíma moje slová, má svojho sudcu: slovo, ktoré som hovoril, bude ho súdiť v\u00A0posledný deň. Lebo ja som nehovoril sám zo\u00A0seba, ale Otec, ktorý ma poslal, ten mi prikázal, čo mám povedať a čo mám hovoriť. A viem, že jeho príkaz je večný život. Čo teda hovorím, hovorím tak, ako mi povedal Otec.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"44", "4", "", "Jn 13, 16-20",
                    "Kto prijíma toho, koho ja pošlem, mňa prijíma",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Keď Ježiš umyl učeníkom nohy, povedal im: \"Veru, veru, hovorím vám: Sluha nie je väčší ako jeho pán, ani posol nie je väčší ako ten, kto ho poslal. Keď to viete, ste blahoslavení, ak podľa toho aj konáte.<br>" +
                            "Nehovorím o\u00A0vás všetkých. Ja viem, koho som si vyvolil, ale má sa splniť Písmo: ‚Ten, ktorý je môj chlieb, zdvihol proti mne pätu.' Hovorím vám to už teraz, skôr, ako sa to stane, aby ste uverili, keď sa to stane, že Ja Som.<br>" +
                            "Veru, veru, hovorím vám: Kto prijíma toho, koho ja pošlem, mňa prijíma. A kto prijíma mňa, prijíma toho, ktorý ma poslal.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"45", "5", "", "Jn 14, 1-6",
                    "Ja som cesta, pravda a život",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Nech sa vám srdce nevzrušuje! Veríte v\u00A0Boha, verte aj vo\u00A0mňa. V dome môjho Otca je mnoho príbytkov. Keby to tak nebolo bol by som vám povedal, že vám idem pripraviť miesto?! Keď odídem a pripravím vám miesto, zasa prídem a vezmem vás k\u00A0sebe, aby ste aj vy boli tam, kde som ja. A cestu, kam idem, poznáte.\"<br>" +
                            "Tomáš mu povedal: \"Pane, nevieme, kam ideš. Akože môžeme poznať cestu?!\"<br>" +
                            "Ježiš mu odpovedal: \"Ja som cesta, pravda a život. Nik nepríde k\u00A0Otcovi, iba cezo mňa.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"46", "6", "", "Jn 14, 7-14",
                    "Kto vidí mňa, vidí Otca",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Ak poznáte mňa, budete poznať aj môjho Otca. Už teraz ho poznáte a videli ste ho.\"<br>" +
                            "Filip sa ozval: \"Pane, ukáž nám Otca a to nám postačí.\"<br>" +
                            "Ježiš mu vravel: \"Filip, toľký čas som s\u00A0vami a nepoznáš ma?! Kto vidí mňa, vidí Otca. Ako môžeš hovoriť: ‚Ukáž nám Otca?!' Neveríš, že ja som v\u00A0Otcovi a Otec vo\u00A0mne? Slová, ktoré vám hovorím, nehovorím sám zo\u00A0seba, ale Otec, ktorý ostáva vo\u00A0mne, koná svoje skutky.<br>" +
                            "Verte mi, že ja som v\u00A0Otcovi a Otec vo\u00A0mne. Ak nie pre\u00A0iné, aspoň pre\u00A0tie skutky verte!<br>" +
                            "Veru, veru, hovorím vám: Aj ten, kto verí vo\u00A0mňa, bude konať skutky, aké ja konám, ba bude konať ešte väčšie, lebo ja idem k\u00A0Otcovi.<br>" +
                            "A urobím všetko, o\u00A0čo budete prosiť v\u00A0mojom mene, aby bol Otec oslávený v\u00A0Synovi. Ak ma budete prosiť o\u00A0niečo v\u00A0mojom mene, ja to urobím.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"50", "A", "", "Jn 14, 1-12",
                    "Ja som cesta, pravda a život",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Nech sa vám srdce nevzrušuje! Veríte v\u00A0Boha, verte aj vo\u00A0mňa. V dome môjho Otca je mnoho príbytkov. Keby to tak nebolo, bol by som vám povedal, že vám idem pripraviť miesto?! Keď odídem a pripravím vám miesto, zasa prídem a vezmem vás k\u00A0sebe, aby ste aj vy boli tam, kde som ja. A cestu, kam idem, poznáte.\"<br>" +
                            "Tomáš mu povedal: \"Pane, nevieme, kam ideš. Akože môžeme poznať cestu?!\"<br>" +
                            "Ježiš mu odpovedal: \"Ja som cesta, pravda a život. Nik nepríde k\u00A0Otcovi, iba cezo mňa. Ak poznáte mňa, budete poznať aj môjho Otca. Už teraz ho poznáte a videli ste ho.\"<br>" +
                            "Filip sa ozval: \"Pane, ukáž nám Otca a to nám postačí.\"<br>" +
                            "Ježiš mu vravel: \"Filip, toľký čas som s\u00A0vami a nepoznáš ma?! Kto vidí mňa, vidí Otca. Ako môžeš hovoriť: ‚Ukáž nám Otca?!' Neveríš, že ja som v\u00A0Otcovi a Otec vo\u00A0mne? Slová, ktoré vám hovorím, nehovorím sám zo\u00A0seba, ale Otec, ktorý ostáva vo\u00A0mne, koná svoje skutky. Verte mi, že ja som v\u00A0Otcovi a Otec vo\u00A0mne. Ak nie pre\u00A0iné, aspoň pre\u00A0tie skutky verte!<br>" +
                            "Veru, veru, hovorím vám: Aj ten, kto verí vo\u00A0mňa, bude konať skutky, aké ja konám, ba bude konať ešte väčšie, lebo ja idem k\u00A0Otcovi.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"50", "B", "", "Jn 15, 1-8",
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
            {"50", "C", "", "Jn 13, 31-33a. 34-35",
                    "Nové prikázanie vám dávam, aby ste sa milovali navzájom",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Keď Judáš vyšiel z\u00A0večeradla, Ježiš povedal: \"Teraz je Syn človeka oslávený a v\u00A0ňom je oslávený Boh. A keď je Boh oslávený v\u00A0ňom, aj Boh jeho v\u00A0sebe oslávi, a čoskoro ho oslávi.<br>" +
                            "Deti moje, ešte chvíľku som s\u00A0vami. Nové prikázanie vám dávam, aby ste sa milovali navzájom. Aby ste sa aj vy vzájomne milovali, ako som ja miloval vás. Podľa toho spoznajú všetci, že ste moji učeníci, ak sa budete navzájom milovať.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"51", "1", "", "Jn 14, 21-26",
                    "Tešiteľ, ktorého pošle Otec, naučí vás všetko",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Kto má moje prikázania a zachováva ich, ten ma miluje. A kto miluje mňa, toho bude milovať môj Otec; aj ja ho budem milovať a zjavím mu seba samého.\"<br>" +
                            "Júda, nie ten Iškariotský, sa ho spýtal: \"Pane, ako to, že seba chceš zjaviť nám, a svetu nie?\"<br>" +
                            "Ježiš mu odpovedal: \"Kto ma miluje, bude zachovávať moje slovo a môj Otec ho bude milovať; prídeme k\u00A0nemu a urobíme si uňho príbytok. Kto ma nemiluje, nezachováva moje slová. A slovo, ktoré počujete, nie je moje, ale Otcovo, toho, ktorý ma poslal.<br>" +
                            "Toto som vám povedal, kým som ešte u\u00A0vás. Ale Tešiteľ, Duch Svätý, ktorého pošle Otec v\u00A0mojom mene, naučí vás všetko a pripomenie vám všetko, čo som vám povedal.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"52", "2", "", "Jn 14, 27-31a",
                    "Svoj pokoj vám dávam",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Pokoj vám zanechávam, svoj pokoj vám dávam. Ale ja vám nedávam, ako svet dáva.<br>" +
                            "Nech sa vám srdce nevzrušuje a nestrachuje. Počuli ste, že som vám povedal: Odchádzam a prídem k\u00A0vám. Keby ste ma milovali, radovali by ste sa, že idem k\u00A0Otcovi, lebo Otec je väčší ako ja. A povedal som vám to teraz, skôr, ako sa to stane, aby ste uverili, keď sa to stane.<br>" +
                            "Už s\u00A0vami nebudem veľa hovoriť, lebo prichádza knieža sveta. Nado mnou nemá nijakú moc, ale svet má poznať, že milujem Otca a robím, ako mi prikázal Otec.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"53", "3", "", "Jn 15, 1-8",
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
            {"54", "4", "", "Jn 15, 9-11",
                    "Ostaňte v\u00A0mojej láske, aby vaša radosť bola úplná",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Ako mňa miluje Otec, tak ja milujem vás. Ostaňte v\u00A0mojej láske! Ak budete zachovávať moje prikázania, ostanete v\u00A0mojej láske, ako ja zachovávam prikázania svojho Otca a ostávam v\u00A0jeho láske.<br>" +
                            "Toto som vám povedal, aby vo\u00A0vás bola moja radosť a aby vaša radosť bola úplná.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"55", "5", "", "Jn 15, 12-17",
                    "Toto vám prikazujem: Aby ste sa milovali navzájom",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Toto je moje prikázanie: Aby ste sa milovali navzájom, ako som ja miloval vás. Nik nemá väčšiu lásku ako ten, kto položí svoj život za\u00A0svojich priateľov.<br>" +
                            "Vy ste moji priatelia, ak robíte, čo vám prikazujem. Už vás nenazývam sluhami, lebo sluha nevie, čo robí jeho Pán. Nazval som vás priateľmi, pretože som vám oznámil všetko, čo som počul od\u00A0svojho Otca.<br>" +
                            "Nie vy ste si vyvolili mňa, ale ja som si vyvolil vás a ustanovil som vás, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo; aby vám Otec dal všetko, o\u00A0čo ho budete prosiť v\u00A0mojom mene.<br>" +
                            "Toto vám prikazujem: Aby ste sa milovali navzájom.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"56", "6", "", "Jn 15, 18-21",
                    "Ak mňa prenasledovali, budú prenasledovať aj vás",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Ak vás svet nenávidí, vedzte, že mňa nenávidel prv ako vás.<br>" +
                            "Keby ste boli zo\u00A0sveta, svet by miloval, čo je jeho, ale preto, že nie ste zo\u00A0sveta, že som si vás ja vyvolil zo\u00A0sveta, svet vás nenávidí.<br>" +
                            "Spomeňte si na\u00A0slovo, ktoré som vám povedal: Sluha nie je väčší ako jeho pán. Ak mňa prenasledovali, budú prenasledovať aj vás; ak zachovávali moje slovo, budú zachovávať aj vaše.<br>" +
                            "Ale to všetko vám budú robiť pre\u00A0moje meno, lebo nepoznajú toho, ktorý ma poslal.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"60", "A", "", "Jn 14, 15-21",
                    "Poprosím Otca a dá vám iného Tešiteľa",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Ak ma milujete, budete zachovávať moje prikázania. A ja poprosím Otca a on vám dá iného Tešiteľa, aby zostal s\u00A0vami naveky Ducha pravdy, ktorého svet nemôže prijať, lebo ho nevidí, ani nepozná. Vy ho poznáte, veď ostáva u\u00A0vás a bude vo\u00A0vás.<br>" +
                            "Nenechám vás ako siroty, prídem k\u00A0vám. Ešte chvíľku a svet ma už neuvidí, ale vy ma uvidíte, lebo ja žijem a aj vy budete žiť. V ten deň spoznáte, že ja som v\u00A0svojom Otcovi, vy vo\u00A0mne a ja vo\u00A0vás.<br>" +
                            "Kto má moje prikázania a zachováva ich, ten ma miluje. A kto miluje mňa, toho bude milovať môj Otec; aj ja ho budem milovať a zjavím mu seba samého.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"60", "B", "", "Jn 15, 9-17",
                    "Nie vy ste si vyvolili mňa, ale ja som si vyvolil vás",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Ako mňa miluje Otec, tak ja milujem vás. Ostaňte v\u00A0mojej láske!<br>" +
                            "Ak budete zachovávať moje prikázania, ostanete v\u00A0mojej láske, ako ja zachovávam prikázania svojho Otca a ostávam v\u00A0jeho láske. Toto som vám povedal, aby vo\u00A0vás bola moja radosť a aby vaša radosť bola úplná.<br>" +
                            "Toto je moje prikázanie: Aby ste sa milovali navzájom, ako som ja miloval vás. Nik nemá väčšiu lásku ako ten, kto položí svoj život za\u00A0svojich priateľov.<br>" +
                            "Vy ste moji priatelia, ak robíte, čo vám prikazujem. Už vás nenazývam sluhami, lebo sluha nevie čo robí jeho Pán. Nazval som vás priateľmi, pretože som vám oznámil všetko, čo som počul od\u00A0svojho Otca.<br>" +
                            "Nie vy ste si vyvolili mňa, ale ja som si vyvolil vás a ustanovil som vás, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo; aby vám Otec dal všetko, o\u00A0čo ho budete prosiť v\u00A0mojom mene.<br>" +
                            "Toto vám prikazujem: Aby ste sa milovali navzájom.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"60", "C", "", "Jn 14, 23-29",
                    "Duch Svätý vám pripomenie všetko, čo som vám povedal",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Kto ma miluje, bude zachovávať moje slovo a môj Otec ho bude milovať; prídeme k\u00A0nemu a urobíme si uňho príbytok. Kto ma nemiluje, nezachováva moje slová. A slovo, ktoré počujete, nie je moje, ale Otcovo, toho, ktorý ma poslal.<br>" +
                            "Toto som vám povedal, kým som ešte u\u00A0vás. Ale Tešiteľ, Duch Svätý, ktorého pošle Otec v\u00A0mojom mene, naučí vás všetko a pripomenie vám všetko, čo som vám povedal.<br>" +
                            "Pokoj vám zanechávam, svoj pokoj vám dávam. Ale ja vám nedávam, ako svet dáva. Nech sa vám srdce nevzrušuje a nestrachuje. Počuli ste, že som vám povedal: Odchádzam a prídem k\u00A0vám. Keby ste ma milovali, radovali by ste sa, že idem k\u00A0Otcovi, lebo Otec je väčší ako ja. A povedal som vám to teraz, skôr, ako sa to stane, aby ste uverili, keď sa to stane.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"61", "1", "", "Jn 15, 26 – 16, 4a",
                    "Duch pravdy vydá o\u00A0mne svedectvo",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Keď príde Tešiteľ, ktorého vám ja pošlem od\u00A0Otca, Duch pravdy, ktorý vychádza od\u00A0Otca, on o\u00A0mne vydá svedectvo. Ale aj vy vydávate svedectvo, lebo ste so\u00A0mnou od\u00A0začiatku.<br>" +
                            "Toto som vám povedal, aby ste sa nepohoršovali. Vylúčia vás zo\u00A0synagóg, ba prichádza hodina, keď sa každý, kto vás zabije, bude nazdávať, že tým slúži Bohu. A budú to robiť preto, že nepoznali Otca ani mňa. A toto som vám povedal, aby ste si spomenuli, keď príde ich hodina, že som vám to hovoril.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"62", "2", "", "Jn 16, 5-11",
                    "Ak neodídem, Tešiteľ k\u00A0vám nepríde",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Teraz idem k\u00A0tomu, ktorý ma poslal, a nik z\u00A0vás sa ma nepýta: ‚Kam ideš?' Ale srdce vám naplnil smútok, že som vám to povedal. Lenže hovorím vám pravdu: Je pre\u00A0vás lepšie, aby som odišiel. Lebo ak neodídem, Tešiteľ k\u00A0vám nepríde. Ale keď odídem, pošlem ho k\u00A0vám.<br>" +
                            "A keď príde on, ukáže svetu, čo je hriech, čo spravodlivosť a čo súd. Hriech je, že neveria vo\u00A0mňa, spravodlivosť, že idem k\u00A0Otcovi a už ma neuvidíte, a súd, že knieža tohto sveta je už odsúdené.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"63", "3", "", "Jn 16, 12-15",
                    "Duch pravdy vás uvedie do\u00A0plnej pravdy",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Ešte veľa vám mám toho povedať, ale teraz by ste to nezniesli.<br>" +
                            "Keď príde on, Duch pravdy, uvedie vás do\u00A0plnej pravdy, lebo nebude hovoriť sám zo\u00A0seba, ale bude hovoriť, čo počuje, a zvestuje vám, čo má prísť. On ma oslávi, lebo z\u00A0môjho vezme a zvestuje vám.<br>" +
                            "Všetko, čo má Otec, je moje. Preto som povedal, že z\u00A0môjho vezme a zvestuje vám.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"64", "4", "", "Jn 16, 16-20",
                    "Budete žialiť, ale váš smútok sa premení na\u00A0radosť ",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého Evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Ešte chvíľku a už ma neuvidíte a zasa chvíľku a uvidíte ma.\" <br>" +
                            "Niektorí z\u00A0jeho učeníkov si medzi sebou hovorili: \"Čo je to, že nám hovorí: ,Ešte chvíľku a neuvidíte ma a zasa chvíľku a uvidíte ma,' a: ,Idem k\u00A0Otcovi'?\" Hovorili: \"Čo je to, že hovorí: ,Ešte chvíľku'? Nevieme, čo hovorí.\" <br>" +
                            "Ježiš spoznal, že sa ho chcú opýtať, a povedal im: \"Dohadujete sa medzi sebou o\u00A0tom, že som povedal: ,Ešte chvíľku a neuvidíte ma a zasa chvíľku a uvidíte ma'? Veru, veru, hovorím vám: Vy budete plakať a nariekať, a svet sa bude radovať. Budete žialiť, ale váš smútok sa premení na\u00A0radosť.\" <br>" +
                            "Počuli sme slovo Pánovo."},
            {"65", "5", "", "Jn 16, 20-23a",
                    "Vašu radosť vám nik nevezme",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Veru, veru, hovorím vám: Vy budete plakať a nariekať, a svet sa bude radovať. Budete žialiť, ale váš smútok sa premení na\u00A0radosť.<br>" +
                            "Keď žena rodí, je skľúčená, lebo prišla jej hodina. No len čo porodí dieťa, už nemyslí na\u00A0bolesti pre\u00A0radosť, že prišiel na\u00A0svet človek.<br>" +
                            "Aj vy ste teraz smutní; ale zasa vás uvidím a vaše srdce sa bude radovať. A vašu radosť vám nik nevezme. V ten deň sa ma už nebudete na\u00A0nič opytovať.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"66", "6", "", "Jn 16, 23b-28",
                    "Otec vás miluje, lebo vy ste milovali mňa a uverili ste",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal svojim učeníkom: \"Veru, veru, hovorím vám: Ak budete o\u00A0niečo prosiť Otca v\u00A0mojom mene, dá vám to. Doteraz ste o\u00A0nič neprosili v\u00A0mojom mene. Proste a dostanete, aby vaša radosť bola úplná.<br>" +
                            "Toto som vám hovoril v\u00A0obrazoch. No prichádza hodina, keď vám už nebudem hovoriť v\u00A0obrazoch, ale budem vám o\u00A0Otcovi hovoriť otvorene. V ten deň budete prosiť v\u00A0mojom mene. A nevravím vám, že ja budem prosiť Otca za\u00A0vás. Veď Otec sám vás miluje, lebo vy ste milovali mňa a uverili ste, že som vyšiel od\u00A0Boha.<br>" +
                            "Vyšiel som od\u00A0Otca a prišiel som na\u00A0svet; a zasa opúšťam svet a idem k\u00A0Otcovi.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"70", "A", "", "Jn 17, 1-11a",
                    "Otče, osláv svojho Syna!",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš pozdvihol oči k\u00A0nebu a hovoril: \"Otče, nadišla hodina: Osláv svojho Syna, aby Syn oslávil teba, tak, ako si mu dal moc nad\u00A0každým telom, aby všetko, čo si dal ty jemu, im darovalo večný život. A večný život je v\u00A0tom, aby poznali teba, jediného pravého Boha, a toho, ktorého si poslal, Ježiša Krista.<br>" +
                            "Ja som ťa oslávil na\u00A0zemi: dokončil som dielo, ktoré si mi dal vykonať. A teraz ty, Otče, osláv mňa pri\u00A0sebe slávou, ktorú som mal u\u00A0teba skôr, ako bol svet.<br>" +
                            "Zjavil som tvoje meno ľuďom, ktorých si mi dal zo\u00A0sveta. Tvoji boli a dal si ich mne a oni zachovali tvoje slovo. Teraz poznali, že všetko, čo si mi dal, je od\u00A0teba, lebo slová, ktoré si ty dal mne, ja som dal im. A oni ich prijali a naozaj spoznali, že som vyšiel od\u00A0teba, a uverili, že si ma ty poslal.<br>" +
                            "Za nich prosím. Neprosím za\u00A0svet, ale za\u00A0tých, ktorých si mi dal, lebo sú tvoji. A všetko, čo je moje, je tvoje, a čo je tvoje, je moje. A v\u00A0nich som oslávený.<br>" +
                            "Už nie som vo\u00A0svete, ale oni sú vo\u00A0svete a ja idem k\u00A0tebe.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"70", "B", "", "Jn 17, 11b-19",
                    "Aby boli jedno ako my",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš pozdvihol oči k\u00A0nebu a modlil sa: \"Svätý Otče, zachovaj ich vo\u00A0svojom mene, ktoré si ty dal mne, aby boli jedno ako my.<br>" +
                            "Kým som bol s\u00A0nimi, ja som ich zachovával v\u00A0tvojom mene, ktoré si mi dal. Ochránil som ich a nikto z\u00A0nich sa nestratil, iba syn zatratenia, aby sa splnilo Písmo.<br>" +
                            "Ale teraz idem k\u00A0tebe a toto hovorím na\u00A0svete, aby mali v\u00A0sebe moju radosť – a úplnú. Dal som im tvoje slovo a svet ich znenávidel, lebo nie sú zo\u00A0sveta, ako ani ja nie som zo\u00A0sveta.<br>" +
                            "Neprosím, aby si ich vzal zo\u00A0sveta, ale aby si ich ochránil pred\u00A0Zlým. Nie sú zo\u00A0sveta, ako ani ja nie som zo\u00A0sveta.<br>" +
                            "Posväť ich pravdou; tvoje slovo je pravda.<br>" +
                            "Ako si ty mňa poslal na\u00A0svet, aj ja som ich poslal do\u00A0sveta a pre\u00A0nich sa ja sám posväcujem, aby boli aj oni posvätení v\u00A0pravde.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"70", "C", "", "Jn 17, 20-26",
                    "Aby všetci boli jedno",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš pozdvihol oči k\u00A0nebu a modlil sa: \"Svätý Otče, neprosím len za\u00A0nich, ale aj za\u00A0tých, čo skrze ich slovo uveria vo\u00A0mňa, aby všetci boli jedno, ako ty, Otče, vo\u00A0mne a ja v\u00A0tebe, aby aj oni boli v\u00A0nás jedno, aby svet uveril, že si ma ty poslal.<br>" +
                            "A slávu, ktorú si ty dal mne, ja som dal im, aby boli jedno, ako sme my jedno – ja v\u00A0nich a ty vo\u00A0mne. Nech sú tak dokonale jedno, aby svet spoznal, že si ma ty poslal a že ich miluješ tak, ako miluješ mňa.<br>" +
                            "Otče, chcem, aby aj tí, ktorých si mi dal, boli so\u00A0mnou tam, kde som ja, aby videli moju slávu, ktorú si mi dal, lebo si ma miloval pred\u00A0stvorením sveta.<br>" +
                            "Spravodlivý Otče, svet ťa nepozná, ale ja ťa poznám. I oni spoznali, že si ma ty poslal. Ohlásil som im tvoje meno a ešte ohlásim, aby láska, ktorou ma miluješ, bola v\u00A0nich a aby som v\u00A0nich bol ja.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"71", "1", "", "Jn 16, 29-33",
                    "Dúfajte, ja som premohol svet!",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Učeníci povedali Ježišovi: \"Teraz už hovoríš otvorene a nehovoríš v\u00A0obrazoch. Teraz vieme, že vieš všetko a nepotrebuješ, aby sa ťa dakto spytoval. Preto veríme, že si vyšiel od\u00A0Boha.\" Ježiš im odvetil: \"Teraz veríte? Hľa, prichádza hodina, ba už prišla, keď sa rozpŕchnete, každý svojou stranou, a mňa necháte samého. Ale nie som sám, lebo Otec je so\u00A0mnou.<br>" +
                            "Toto som vám povedal, aby ste vo\u00A0mne mali pokoj. Vo svete máte súženie, ale dúfajte, ja som premohol svet!\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"72", "2", "", "Jn 17, 1-11a",
                    "Otče, osláv svojho Syna!",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš pozdvihol oči k\u00A0nebu a hovoril: \"Otče, nadišla hodina: Osláv svojho Syna, aby Syn oslávil teba, tak, ako si mu dal moc nad\u00A0každým telom, aby všetko, čo si dal ty jemu, im darovalo večný život. A večný život je v\u00A0tom, aby poznali teba, jediného pravého Boha, a toho, ktorého si poslal, Ježiša Krista.<br>" +
                            "Ja som ťa oslávil na\u00A0zemi: dokončil som dielo, ktoré si mi dal vykonať. A teraz ty, Otče, osláv mňa pri\u00A0sebe slávou, ktorú som mal u\u00A0teba skôr, ako bol svet.<br>" +
                            "Zjavil som tvoje meno ľuďom, ktorých si mi dal zo\u00A0sveta. Tvoji boli a dal si ich mne a oni zachovali tvoje slovo. Teraz poznali, že všetko, čo si mi dal, je od\u00A0teba, lebo slová, ktoré si ty dal mne, ja som dal im. A oni ich prijali a naozaj spoznali, že som vyšiel od\u00A0teba, a uverili, že si ma ty poslal.<br>" +
                            "Za nich prosím. Neprosím za\u00A0svet, ale za\u00A0tých, ktorých si mi dal, lebo sú tvoji. A všetko, čo je moje, je tvoje, a čo je tvoje, je moje. A v\u00A0nich som oslávený.<br>" +
                            "Už nie som vo\u00A0svete, ale oni sú vo\u00A0svete a ja idem k\u00A0tebe.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"73", "3", "", "Jn 17, 11b-19",
                    "Aby boli jedno ako my",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš pozdvihol oči k\u00A0nebu a modlil sa: \"Svätý Otče, zachovaj ich vo\u00A0svojom mene, ktoré si ty dal mne, aby boli jedno ako my.<br>" +
                            "Kým som bol s\u00A0nimi, ja som ich zachovával v\u00A0tvojom mene, ktoré si mi dal. Ochránil som ich a nikto z\u00A0nich sa nestratil, iba syn zatratenia, aby sa splnilo Písmo.<br>" +
                            "Ale teraz idem k\u00A0tebe a toto hovorím na\u00A0svete, aby mali v\u00A0sebe moju radosť – a úplnú. Dal som im tvoje slovo a svet ich znenávidel, lebo nie sú zo\u00A0sveta, ako ani ja nie som zo\u00A0sveta.<br>" +
                            "Neprosím, aby si ich vzal zo\u00A0sveta, ale aby si ich ochránil pred\u00A0Zlým. Nie sú zo\u00A0sveta, ako ani ja nie som zo\u00A0sveta.<br>" +
                            "Posväť ich pravdou; tvoje slovo je pravda.<br>" +
                            "Ako si ty mňa poslal na\u00A0svet, aj ja som ich poslal do\u00A0sveta a pre\u00A0nich sa ja sám posväcujem, aby boli aj oni posvätení v\u00A0pravde.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"74", "4", "", "Jn 17, 20-26",
                    "Aby všetci boli jedno",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš pozdvihol oči k\u00A0nebu a modlil sa: \"Svätý Otče, neprosím len za\u00A0nich, ale aj za\u00A0tých, čo skrze ich slovo uveria vo\u00A0mňa, aby všetci boli jedno, ako ty, Otče, vo\u00A0mne a ja v\u00A0tebe, aby aj oni boli v\u00A0nás jedno, aby svet uveril, že si ma ty poslal.<br>" +
                            "A slávu, ktorú si ty dal mne, ja som dal im, aby boli jedno, ako sme my jedno – ja v\u00A0nich a ty vo\u00A0mne. Nech sú tak dokonale jedno, aby svet spoznal, že si ma ty poslal a že ich miluješ tak, ako miluješ mňa.<br>" +
                            "Otče, chcem, aby aj tí, ktorých si mi dal, boli so\u00A0mnou tam, kde som ja, aby videli moju slávu, ktorú si mi dal, lebo si ma miloval pred\u00A0stvorením sveta.<br>" +
                            "Spravodlivý Otče, svet ťa nepozná, ale ja ťa poznám. I oni spoznali, že si ma ty poslal. Ohlásil som im tvoje meno a ešte ohlásim, aby láska, ktorou ma miluješ, bola v\u00A0nich a aby som v\u00A0nich bol ja.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"75", "5", "", "Jn 21, 15-19",
                    "Pas moje baránky! Pas moje ovce!",
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
            {"76", "6", "", "Jn 21, 20-25",
                    "To je ten učeník, ktorý toto napísal, a jeho svedectvo je pravdivé",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Peter sa obrátil a videl, že za\u00A0nimi ide učeník, ktorého Ježiš miloval, ten, čo sa pri\u00A0večeri naklonil k\u00A0jeho hrudi a spýtal sa: \"Pane, kto ťa to zradí?\"<br>" +
                            "Keď ho teda Peter zazrel, povedal Ježišovi: \"Pane, a čo bude s\u00A0týmto?\"<br>" +
                            "Ježiš mu odpovedal: \"Ak chcem, aby zostal, kým neprídem, čo teba do\u00A0toho? Ty poď za\u00A0mnou!\"<br>" +
                            "A tak sa medzi bratmi rozchýrilo, že ten učeník neumrie. No Ježiš mu nepovedal: \"Neumrie,\" ale: \"Ak chcem, aby zostal, kým neprídem, čo teba do\u00A0toho?\"<br>" +
                            "To je ten učeník, ktorý o\u00A0týchto veciach vydáva svedectvo a toto napísal. A vieme, že jeho svedectvo je pravdivé.<br>" +
                            "Ale Ježiš urobil ešte veľa iného. Keby sa to všetko malo dopodrobna opísať, myslím, ani na\u00A0celom svete by nebolo dosť miesta na\u00A0knihy, ktoré by bolo treba napísať.<br>" +
                            "Počuli sme slovo Pánovo."},
    };
}
