package sk.missa.interfaces;

/*
 * Čítania v\u00A0adventnom období uložené v\u00A0troch dvojrozmerných poliach: adventCitanie1, adventCitanie2, adventEvanjelium
 * nedeľa: {týždeň v\u00A0cezročnom období + deň v\u00A0týždni (1-pondelok, 2-utorok..., 6-sobota), liturgický rok (A/B/C), "", súradnice, citát, text},
 * deň v\u00A0týždni: {týždeň v\u00A0cezročnom období + deň v\u00A0týždni (1-pondelok, 2-utorok..., 6-sobota), deň v\u00A0týždni (1-pondelok, 2-utorok..., 6-sobota), "", súradnice, citát, text},
 * čítanie, ktoré obsahuje alebo: {týždeň v\u00A0cezročnom období + deň v\u00A0týždni (1-pondelok, 2-utorok..., 6-sobota), deň v\u00A0týždni (1-pondelok, 2-utorok..., 6-sobota, "", súradnice, citát, text, "Alebo:", súradnice, citát, text...},
 *
 * Keďže sú čitania v\u00A0adventnom a vianočnom období viazané na\u00A0deň, nachádzajú sa v\u00A0Citania_svatci uložené v\u00A0mesiaci, ktorému prislúchajú a s\u00A0dňom ako ID
 * */

public interface Citania_advent {
    String[][] adventCitanie1 = {
            {"10", "A", "", "Iz 2, 1-5",
                    "Pán zhromaždí všetky národy vo\u00A0večnom pokoji Božieho kráľovstva",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Videnie Izaiáša, syna Amosovho, o\u00A0Judei a Jeruzaleme.<br>" +
                            "Stane sa v\u00A0ostatných dňoch: Vrch s\u00A0Pánovým domom bude stáť pevne na\u00A0temene hôr a bude vyčnievať nad\u00A0pahorky.<br>" +
                            "Budú k\u00A0nemu prúdiť všetky národy, prídu k\u00A0nemu mnohé kmene a povedia: \"Poďme, vystúpme na\u00A0Pánov vrch, do\u00A0domu Jakubovho Boha! Nech nás poučí o\u00A0svojich cestách a my budeme kráčať po\u00A0jeho chodníkoch.\" Lebo zo\u00A0Siona vzíde zákon a z\u00A0Jeruzalema Pánovo slovo.<br>" +
                            "On bude súdiť národy a naprávať početné kmene, takže ony si zo\u00A0svojich mečov ukujú radlice a zo\u00A0svojich kopijí kosáky. Národ proti národu nezodvihne meč a nebudú sa priúčať boju. Hor' sa, dom Jakubov, kráčajme vo\u00A0svetle Pánovom!<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "B", "", "Iz 63, 16d-17. 19de; 64, 2c-7",
                    "Kiež by si prelomil nebesia a zostúpil!",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Ty, Pane, si náš otec, náš vykupiteľ: to je tvoje meno od\u00A0vekov. Prečo si nám, Pane, dal zablúdiť z\u00A0tvojich ciest, srdcu zatvrdnúť, aby sme nemali bázeň pred\u00A0tebou? Obráť sa k\u00A0nám, lebo sme tvoji služobníci a kmene tvojho dedičstva.<br>" +
                            "Kiež by si prelomil nebesia a zostúpil! Vrchy by sa rozplynuli pred\u00A0tebou.<br>" +
                            "Zostúpil si a vrchy sa rozplynuli pred\u00A0tebou. Od\u00A0vekov nebolo slýchať, ucho nepočulo, oko nevidelo, aby bol okrem teba iný Boh, ktorý by pomáhal tým, čo v\u00A0neho dúfajú. Vychádzaš v\u00A0ústrety tým, čo s\u00A0radosťou konajú spravodlivo, tým, čo si na\u00A0tvojich cestách spomínajú na\u00A0teba.<br>" +
                            "Ty si sa hneval, a my sme hrešili. Dlho sme ti boli neverní, ale budeme spasení. Všetci sme boli nečistí, sťa špinavý šat je všetka naša spravodlivosť. Všetci sme jak zvädnuté lístie, naša neprávosť nás unáša ako vietor.<br>" +
                            "Nik nevzýva tvoje meno, nik sa nevzchopí, aby sa k\u00A0tebe privinul, lebo si skryl pred\u00A0nami svoju tvár, vydal si nás napospas našej neprávosti. A predsa, Pane, ty si náš otec! My sme hlina, ty si náš tvorca; všetci sme dielo tvojich rúk.<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "C", "", "Jer 33, 14-16",
                    "Vyklíči z\u00A0Dávida spravodlivý výhonok",
                    "Čítanie z Knihy proroka Jeremiáša<br>" +
                            "Hľa, blížia sa dni, – hovorí Pán –, keď splním prísľub spásy, ktorý som dal Izraelovmu a Júdovmu domu.<br>" +
                            "V tých dňoch a v\u00A0tom čase vyklíči z\u00A0Dávida spravodlivý výhonok, ktorý bude konať právo a spravodlivosť na\u00A0zemi. V\u00A0tých dňoch Júda dosiahne spásu a Jeruzalem istotu a budú ho volať: Pán – naša spravodlivosť.<br>" +
                            "Počuli sme Božie slovo."},
            {"11", "1", "", "Iz 2, 1-5",
                    "Pán zhromaždí všetky národy vo\u00A0večnom pokoji Božieho kráľovstva",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Videnie Izaiáša, syna Amosovho, o\u00A0Judei a Jeruzaleme.<br>" +
                            "Stane sa v\u00A0ostatných dňoch: Vrch s\u00A0Pánovým domom bude stáť pevne na\u00A0temene hôr a bude vyčnievať nad\u00A0pahorky.<br>" +
                            "Budú k\u00A0nemu prúdiť všetky národy, prídu k\u00A0nemu mnohé kmene a povedia: \"Poďme, vystúpme na\u00A0Pánov vrch, do\u00A0domu Jakubovho Boha! Nech nás poučí o\u00A0svojich cestách a my budeme kráčať po\u00A0jeho chodníkoch.\" Lebo zo\u00A0Siona vzíde zákon a z\u00A0Jeruzalema Pánovo slovo.<br>" +
                            "On bude súdiť národy a naprávať početné kmene, takže ony si zo\u00A0svojich mečov ukujú radlice a zo\u00A0svojich kopijí kosáky. Národ proti národu nezodvihne meč a nebudú sa priúčať boju. Hor' sa, dom Jakubov, kráčajme vo\u00A0svetle Pánovom!<br>" +
                            "Počuli sme Božie slovo.",
                    // V\u00A0roku A(keď sa toto čítanie číta v1.adventnú nedeľu )možno čítať nasledujúce čítanie:
                    "Alebo:",
                    "Iz 4, 2-6",
                    "Bude chválou všetkých, ktorí sa zachránia",
                    "Čítanie z Knihy proroka Izaiáša" +
                            "V ten deň bude Pánov výhonok ozdobou a slávou a plod zeme pýchou a chválou všetkých, ktorí sa zachránia z\u00A0Izraela. Svätým sa bude nazývať každý, kto zostane na\u00A0Sione a kto prežije v\u00A0Jeruzaleme, každý, kto bude zapísaný v\u00A0Jeruzaleme pre\u00A0život.<br>" +
                            "Až Pán zmyje špinu sionských dcér, až celkom spláchne krv z\u00A0Jeruzalema dychom súdu a dychom páľavy, vtedy utvorí nad\u00A0každým miestom vrchu Sion a nad\u00A0tými, čo sa tam zhromaždia, oblak vo\u00A0dne a dym i žiaru blčiaceho ohňa v\u00A0noci. Pánova veleba bude nad\u00A0všetkým ako ochrana; a stánok bude tieňom pred\u00A0horúčavou dňa a bezpečným útočišťom pred\u00A0víchricou a dažďom.<br>" +
                            "Počuli sme Božie slovo."
            },
            {"12", "2", "", "Iz 11, 1-10",
                    "Podľa spravodlivosti bude súdiť chudobných",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "V ten deň: Z\u00A0kmeňa Jesseho vzíde ratolesť a z\u00A0jeho koreňov vyženie výhonok. A spočinie na\u00A0ňom duch Pánov: duch múdrosti a rozumu, duch rady a sily, duch poznania a bázne pred\u00A0Pánom. A bude mať záľubu v\u00A0bázni pred\u00A0Pánom.<br>" +
                            "Nebude súdiť podľa zdania očí, ani nebude karhať podľa počutia, ale podľa spravodlivosti bude súdiť chudobných a podľa práva bude rozhodovať v\u00A0prospech ponížených zeme. Zem udrie prútom svojich úst a dychom svojich perí usmrtí bezbožníka.<br>" +
                            "Spravodlivosť bude pásom jeho bedier a vernosť opaskom jeho bokov. Vlk bude bývať s\u00A0baránkom, leopard si ľahne vedľa kozliatka. Teliatko i lev budú žrať spolu a chlapček ich bude zaháňať. Krava a medvedica sa budú spolu pásť, ich mláďatá budú vedno odpočívať. Lev sťa vôl sa bude kŕmiť slamou, dojča sa bude hrať nad\u00A0dierou hada, do\u00A0skrýše vretenice siahne rukou batoľa. Nik nebude škodiť ani pustošiť na\u00A0celom mojom svätom vrchu; lebo poznaním Pána bude naplnená zem, ako vody napĺňajú moria.<br>" +
                            "V ten deň koreň Jesseho sa vztýči ako znamenie národom; pohania ho budú vyhľadávať a slávny bude jeho príbytok.<br>" +
                            "Počuli sme Božie slovo."},
            {"13", "3", "", "Iz 25, 6-10a",
                    "Pán vystrojí hostinu a zotrie slzu z\u00A0každej tváre",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Pán zástupov vystrojí na\u00A0tomto vrchu všetkým národom hostinu s\u00A0mnohými jedlami: hostinu s\u00A0výborným vínom, so\u00A0šťavnatými jedlami, s\u00A0vínom najjemnejším. Strhne na\u00A0tomto vrchu závoj, ktorý zahaľoval všetkých ľudí, a prikrývku, čo zakrývala všetky národy.<br>" +
                            "Zničí smrť navždy; zotrie Pán, Boh, slzu z\u00A0každej tváre a hanbu svojho ľudu odstráni z\u00A0celej zeme, lebo Pán prehovoril.<br>" +
                            "V ten deň povedia: \"Hľa, náš Boh, v\u00A0neho sme dúfali a on nás spasí. On je Pán, v\u00A0ktorého sme dúfali. Jasajme a radujme sa z\u00A0jeho spásy. Pánova ruka spočinie na\u00A0tomto vrchu.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"14", "4", "", "Iz 26, 1-6",
                    "Nech vstúpi spravodlivý ľud, ktorý zachováva vernosť",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "V ten deň sa bude v\u00A0judejskej krajine spievať táto pieseň: \"Pevné mesto máme, v\u00A0ňom sa zachránime; Pán ho obohnal valom a hradbami. Otvorte brány, nech vstúpi spravodlivý ľud, ľud, ktorý zachováva vernosť. Má ducha pevného; zaistíš mu pokoj, veď dúfa v\u00A0teba.<br>" +
                            "Dúfajte v\u00A0Pána stále, lebo Pán je skala naveky. Zvrhol tých, čo bývajú na\u00A0výšinách, ponížil neprístupné mesto; ponížil ho až po\u00A0zem, zrazil ho do\u00A0prachu. Šliape po\u00A0ňom noha, nohy chudobných, kroky bedárov.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"15", "5", "", "Iz 29, 17-24",
                    "V ten deň sa oči slepých rozhliadnu",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán, Boh: \"Či sa o\u00A0krátku chvíľu Libanon nezmení na\u00A0ovocný sad a nebude ten sad ako les? V\u00A0ten deň budú hluchí počuť slová knihy, z\u00A0temnoty a hmly sa oči slepých rozhliadnu.<br>" +
                            "Pokorní sa rozveselia v\u00A0Pánovi a najbiednejší zajasajú v\u00A0Svätom Izraela, lebo padol násilník, zhynul posmievač; zničení sú všetci, čo osnovali neprávosť, čo nútili ľudí hovoriť falošne, čo sudcom v\u00A0bráne kládli osídla a falošnými rečami ničili spravodlivého.<br>" +
                            "Preto takto hovorí Jakubovmu domu Pán, ktorý vykúpil Abraháma: ‚Nebude sa už hanbiť Jakub, už nesčervenie jeho tvár. Ale keď uvidia na\u00A0sebe dielo mojich rúk, budú si ctiť moje meno, budú uctievať Jakubovho Svätého, báť sa budú Boha Izraelovho. Blúdiaci duchom spoznajú múdrosť a nespokojní sa dajú poučiť.'\"<br>" +
                            "Počuli sme Božie slovo."},
            {"16", "6", "", "Iz 30, 19-21. 23-26",
                    "Boh sa iste zmiluje nad\u00A0tebou, len čo počuje tvoje volanie",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán, Boh, Svätý Izraela: \"Sionský ľud, čo bývaš v\u00A0Jeruzaleme, ty nebudeš plakať ustavične. On sa iste zmiluje nad\u00A0tebou, keď budeš volať o\u00A0pomoc; odpovie ti hneď, len čo počuje tvoje volanie.<br>" +
                            "Pán vám dá chlieb úzkosti a vodu súženia; no tvoj učiteľ sa už skrývať nebude, tvoje oči uvidia svojho učiteľa. A ak sa odchýlite napravo alebo naľavo, tvoje uši budú počuť za\u00A0sebou hlas: ‚Toto je cesta, kráčajte po\u00A0nej!' On zošle dážď tvojmu semenu, ktoré zaseješ do\u00A0pôdy. A chlieb, plod zeme, bude výdatný a záživný.<br>" +
                            "V ten deň sa bude pásť tvoj dobytok i baránky na\u00A0šírych pastvinách; tvoje voly a osly, čo obrábajú zem, budú žrať obrok miešaný, previaty sitom a lopatou. Na\u00A0každom vysokom vrchu, na\u00A0každom vyčnievajúcom kopci budú tiecť vody v\u00A0potokoch v\u00A0deň veľkého vraždenia, keď budú padať veže.<br>" +
                            "Svetlo mesiaca bude ako svetlo slnka a svetlo slnka bude sedem ráz také ako svetlo siedmich dní v\u00A0deň, keď Pán obviaže ranu svojho ľudu a vylieči jeho miesta boľavé.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "A", "", "Iz 11, 1-10",
                    "Podľa spravodlivosti bude súdiť chudobných",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "V ten deň: Z\u00A0kmeňa Jesseho vzíde ratolesť a z\u00A0jeho koreňov vyženie výhonok. A spočinie na\u00A0ňom duch Pánov: duch múdrosti a rozumu, duch rady a sily, duch poznania a bázne pred\u00A0Pánom. A bude mať záľubu v\u00A0bázni pred\u00A0Pánom.<br>" +
                            "Nebude súdiť podľa zdania očí, ani nebude karhať podľa počutia, ale podľa spravodlivosti bude súdiť chudobných a podľa práva bude rozhodovať v\u00A0prospech ponížených zeme. Zem udrie prútom svojich úst a dychom svojich perí usmrtí bezbožníka.<br>" +
                            "Spravodlivosť bude pásom jeho bedier a vernosť opaskom jeho bokov. Vlk bude bývať s\u00A0baránkom, leopard si ľahne vedľa kozliatka. Teliatko i lev budú žrať spolu a chlapček ich bude zaháňať. Krava a medvedica sa budú spolu pásť, ich mláďatá budú vedno odpočívať. Lev sťa vôl sa bude kŕmiť slamou, dojča sa bude hrať nad\u00A0dierou hada, do\u00A0skrýše vretenice siahne rukou batoľa. Nik nebude škodiť ani pustošiť na\u00A0celom mojom svätom vrchu; lebo poznaním Pána bude naplnená zem, ako vody napĺňajú moria.<br>" +
                            "V ten deň koreň Jesseho sa vztýči ako znamenie národom; pohania ho budú vyhľadávať a slávny bude jeho príbytok.<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "B", "", "Iz 40, 1-5. 9-11",
                    "Pripravte cestu Pánovi",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Potešujte, potešujte môj ľud, vraví váš Boh. Hovorte k\u00A0srdcu Jeruzalema a volajte k\u00A0nemu, že sa skončilo jeho otroctvo a je odčinená jeho vina; veď dostal z\u00A0ruky Pánovej dvojnásobok za\u00A0každý svoj hriech.<br>" +
                            "Hlas volajúceho: \"Pripravte cestu Pánovi na\u00A0púšti, vyrovnajte chodníky nášmu Bohu na\u00A0pustatine! Každá dolina nech sa zdvihne a každý vrch i kopec zníži! Čo je krivé, nech je rovinou, a čo hrboľaté, nížinou. I zjaví sa Pánova sláva, a uvidí spoločne každé stvorenie, že prehovorili Pánove ústa.\"<br>" +
                            "Vystúp na\u00A0vysoký vrch, ty, čo hlásaš radostnú zvesť Sionu! Zodvihni mocne svoj hlas, ty, čo hlásaš radostnú zvesť Jeruzalemu! Zodvihni, neboj sa, povedz judejským mestám: \"Hľa, váš Boh! Hľa, Pán, Boh, prichádza so\u00A0všetkou mocou a jeho ruka bude vládnuť. Odmenu víťaza nesie so\u00A0sebou a jeho trofeje idú pred\u00A0ním. Ako pastier pasie svoju čriedu, do\u00A0náručia berie baránky a kladie si ich do\u00A0lona; starostlivo vedie ovce brezivé.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "C", "", "Bar 5, 1-9",
                    "Boh ukáže tvoj lesk",
                    "Čítanie z Knihy proroka Barucha<br>" +
                            "Jeruzalem, odlož rúcho svojho smútku a súženia a obleč si ozdobu slávy, ktorú ti Boh dáva naveky. Zaodej sa plášťom Božej spravodlivosti a polož si na\u00A0hlavu korunu slávy Večného. Boh ukáže tvoj lesk všetkému, čo je pod\u00A0nebom. Boh ti dá navždy meno: Pokoj spravodlivosti a Sláva bohabojnosti.<br>" +
                            "Povstaň, Jeruzalem, a postav sa na\u00A0výšinu, hľaď na\u00A0východ a podívaj sa na\u00A0svojich synov, zhromaždených od\u00A0východu slnka až po\u00A0západ na\u00A0slovo Svätého. Tešia sa, že Boh na\u00A0nich pamätal. Vyšli z\u00A0teba peši, odvlečení nepriateľmi, ale Boh ich privedie k\u00A0tebe a ponesie ich so\u00A0slávou ako na\u00A0kráľovskom tróne.<br>" +
                            "Boh totiž rozkázal znížiť každý vysoký vrch a odveké pahorky a vyplniť údolia na\u00A0úroveň zeme, aby Izrael bezpečne kráčal pod\u00A0Božou slávou.<br>" +
                            "Na Boží rozkaz lesy a všetky voňavé stromy zatônia Izraela. A Boh povedie Izrael v\u00A0radosti, vo\u00A0svetle svojej veleby, v\u00A0milosrdenstve a spravodlivosti, ktoré pochádzajú od\u00A0neho.<br>" +
                            "Počuli sme Božie slovo."},
            {"21", "1", "", "Iz 35, 1-10",
                    "Boh sám príde a spasí vás",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Bude sa radovať vyschnutá zem, zaplesá a rozkvitne púšť. Ako narcis vykvitne, zajasá, zaplesá a radosťou vykríkne. Bude obdarená nádherou Libanonu, krásou Karmelu a Sárona. Uvidia slávu Pána a velebu nášho Boha.<br>" +
                            "Posilňujte ruky zoslabnuté, upevňujte chvejúce sa kolená. Povedzte malomyseľným: \"Vzchopte sa, nebojte sa! Hľa, váš Boh! Príde odveta, odplata Boha. On sám príde a spasí vás.\"<br>" +
                            "Vtedy roztvoria oči slepí a uši hluchých sa otvoria. Ako jeleň skákať bude chromý, jazyk nemého radosťou vykríkne. Lebo na\u00A0púšti vyrazí voda, potoky na\u00A0pustatine.<br>" +
                            "Vyprahnutá zem sa zmení na\u00A0jazero a žíznivá pôda na\u00A0pramene vôd. Na\u00A0mieste, kde sa rozvaľovali šakaly, vyrastie tŕstie a sítie. Bude tam chodník, cesta; svätou cestou sa bude volať a nečistý po\u00A0nej neprejde. A bude to cesta priama, takže ani hlúpi na\u00A0nej nezblúdia. Nebude tam lev, a dravá zver na\u00A0ňu nevkročí, ani chýru o\u00A0nej nebude; len vykúpení budú chodiť po\u00A0nej.<br>" +
                            "A tí, ktorých Pán vykúpil, sa vrátia, s\u00A0jasotom vojdú na\u00A0Sion. Večná radosť ovenčí im hlavy, zaplaví ich radosť a veselosť, zmizne bôľ a vzdychanie.<br>" +
                            "Počuli sme Božie slovo."},
            {"22", "2", "", "Iz 40, 1-11",
                    "Boh potešuje svoj ľud",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Potešujte, potešujte môj ľud, – vraví váš Boh. Hovorte k\u00A0srdcu Jeruzalema a volajte k\u00A0nemu, že sa skončilo jeho otroctvo a je odčinená jeho vina, že dostal z\u00A0ruky Pánovej dvojnásobok za\u00A0každý svoj hriech.<br>" +
                            "Hlas volajúceho: \"Pripravte cestu Pánovi na\u00A0púšti, vyrovnajte chodníky nášmu Bohu na\u00A0pustatine! Každá dolina nech sa zdvihne a každý vrch i kopec zníži! Čo je krivé, nech je rovinou, a čo hrboľaté, nížinou. I zjaví sa Pánova sláva a uvidí spoločne každé stvorenie, že prehovorili Pánove ústa.\"<br>" +
                            "Hlas hovorí: \"Volaj!\" Ja vravím: \"Čo mám volať?\" Každé telo je ako tráva a všetka jeho krása ako poľný kvet. Tráva uschne a kvet odpadne, keď ho ovanie Pánov dych. Naozaj je ľud ako tráva: Tráva uschne, kvet odpadne, ale slovo nášho Boha trvá naveky.<br>" +
                            "Vystúp na\u00A0vysoký vrch, ty, čo hlásaš radostnú zvesť Sionu! Zodvihni mocne svoj hlas, ty, čo hlásaš radostnú zvesť Jeruzalemu! Zodvihni, neboj sa, povedz judejským mestám: \"Hľa, váš Boh! Hľa, Pán, Boh, prichádza so\u00A0všetkou mocou a jeho ruka bude vládnuť. Odmenu víťaza nesie so\u00A0sebou a jeho trofeje idú pred\u00A0ním. Ako pastier pasie svoju čriedu, do\u00A0náručia berie baránky a kladie si ich do\u00A0lona; starostlivo vedie ovce brezivé.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"23", "3", "", "Iz 40, 25-31",
                    "Všemohúci Pán dáva unavenému silu",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "\"Komuže ma prirovnáte, aby som mu bol podobný?\" – vraví Svätý. Zdvihnite oči k\u00A0nebu a pozrite: kto toto všetko stvoril? Ten, čo vyvádza ich spočítané zástupy a všetky volá po\u00A0mene; taká nesmierna je jeho moc a sila, že ani jedno z\u00A0nich nechýba. Prečo vravíš, Jakub, Izrael, prečo hovoríš: \"Skrytá je moja cesta pred\u00A0Pánom, môjmu Bohu sa moje právo vymyká?\" Nevieš alebo si nepočul? Pán je večný Boh, ktorý stvoril zemské končiny; on neomdlie, ani sa neunaví a jeho múdrosť nemožno vyskúmať. On dáva unavenému silu a bezmocnému rozmnožuje zdatnosť. Mladí omdlievajú od\u00A0únavy a junač podlomená padá, ale tí, čo dúfajú v\u00A0Pána, načerpajú novú silu, dostanú krídla ako orly, utekať budú, a neustanú, budú putovať, a neomdlejú.<br>" +
                            "Počuli sme Božie slovo."},
            {"24", "4", "", "Iz 41, 13-20",
                    "Ja som tvoj vykupiteľ, Svätý Izraela",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Ja som Pán, tvoj Boh, ktorý ťa drží za\u00A0ruku a hovorí ti: \"Neboj sa, ja ti pomôžem!<br>" +
                            "Nebojže sa, červíček Jakub, hŕstka Izraela, ja sám ti pomôžem,\" hovorí Pán a tvoj vykupiteľ Svätý Izraela. Urobím z\u00A0teba mláťačku, novú a ostrú, s\u00A0mnohými zubami. Rozmlátiš a rozdrvíš vrchy, pahorky na\u00A0plevy obrátiš.<br>" +
                            "Preveješ ich: vietor ich uchytí a víchrica rozpráši. Ty však zajasáš v\u00A0Pánovi, tešiť sa budeš v\u00A0Svätom Izraela.<br>" +
                            "Chudáci a bedári hľadajú vodu, a vody niet; jazyk im zosychá od\u00A0smädu. Ja, Pán, ich vyslyším, ja, Boh Izraela, ich neopustím.<br>" +
                            "Na holých pahorkoch dám vytrysknúť riekam, uprostred údolí prameňom. Púšť zmením na\u00A0jazero a vyprahnutú zem na\u00A0pramene vôd.<br>" +
                            "Na púšti zasadím cédre, akácie, myrty a olivy, stepi vysadím jedľami, brestmi a cyprusmi, aby videli a poznali, aby si uvedomili a pochopili, že to urobila Pánova ruka, že to stvoril Svätý Izraela.<br>" +
                            "Počuli sme Božie slovo."},
            {"25", "5", "", "Iz 48, 17-19",
                    "Kiež by si si bol všímal moje príkazy",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán, tvoj vykupiteľ, Svätý Izraela: Ja som Pán, tvoj Boh, ktorý ťa učí, čo ti osoží, a vedie ťa po\u00A0ceste, ktorou máš ísť.<br>" +
                            "Keby si si bol všímal moje príkazy, tvoj pokoj by bol ako rieka a tvoja spravodlivosť ako morské vlny; ako piesku by bolo tvojich potomkov a ratolestí tvojho lona ako zrniek piesku. Nezaniklo by, ani by nebolo vyhladené jeho meno spred mojej tváre.<br>" +
                            "Počuli sme Božie slovo."},
            {"26", "6", "", "Sir 48, 1-4. 9-11",
                    "Opäť príde Eliáš",
                    "Čítanie z Knihy Sirachovho syna<br>" +
                            "Vystúpil Eliáš, prorok ako oheň, a jeho slovo horelo ako fakľa. Priviedol na\u00A0nich hlad a v\u00A0svojej horlivosti zmenšil ich počet. Pánovým slovom zatvoril nebo a tri razy zvolal oheň z\u00A0neba. Aký slávny si, Eliáš, svojimi zázrakmi! Kto sa môže chváliť, že sa ti podobá?<br>" +
                            "Ty si bol vzatý v\u00A0ohnivej víchrici, na\u00A0voze s\u00A0ohnivými koňmi. Je napísané o\u00A0tebe, že si určený pre\u00A0budúce časy mierniť Pánov hnev prv, než vzplanie, obrátiť srdce otca k\u00A0synovi a obnoviť Jakubove kmene. Blažení, čo ťa videli a čo zosnuli ako tvoji priatelia!<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "A", "", "Iz 35, 1-6b. 10",
                    "Boh sám príde a spasí vás",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Bude sa radovať vyschnutá zem, zaplesá a rozkvitne púšť. Ako narcis vykvitne, zajasá, zaplesá a radosťou vykríkne. Bude obdarená nádherou Libanonu, krásou Karmelu a Sarona. Uvidia slávu Pána a velebu nášho Boha.<br>" +
                            "Posilňujte ruky zoslabnuté, upevňujte chvejúce sa kolená. Povedzte malomyseľným: \"Vzchopte sa, nebojte sa! Hľa, váš Boh! Príde odveta, odplata Boha. On sám príde a spasí vás.\"<br>" +
                            "Vtedy roztvoria oči slepí a uši hluchých sa otvoria. Ako jeleň skákať bude chromý, jazyk nemého radosťou vykríkne.<br>" +
                            "A tí, ktorých Pán vykúpil, sa vrátia, s\u00A0jasotom vojdú na\u00A0Sion. Večná radosť ovenčí im hlavy, zaplaví ich radosť a veselosť, zmizne bôľ a vzdychanie.<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "B", "", "Iz 61, 1-2a. 10-11",
                    "Radosťou jasám v\u00A0Pánovi",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Duch Pána, Boha, je nado mnou, pretože ma Pán pomazal: poslal ma hlásať radostnú zvesť chudobným, uzdraviť skrúšených srdcom, oznámiť zajatým slobodu, väzneným prepustenie, ohlásiť rok milosti Pána.<br>" +
                            "Radosťou jasám v\u00A0Pánovi, duša mi plesá v\u00A0mojom Bohu, pretože ma zaodial rúchom spásy, zahalil ma plášťom spravodlivosti ako ženícha zdobeného vencom, ako nevestu okrášlenú šperkami.<br>" +
                            "Lebo ako zem vydá rastliny a ako záhrada dá vyklíčiť semenu, tak Pán, Boh, dá vyklíčiť spravodlivosti a chvále pred\u00A0všetkými národmi."},
            {"30", "C", "", "Sof 3, 14-18a ",
                    "Kráľ Izraela, Pán, je s\u00A0tebou",
                    "Čítanie z Knihy proroka Sofoniáša<br>" +
                            "Jasaj, dcéra sionská, plesaj, Izrael! Raduj sa a veseľ z\u00A0plného srdca, dcéra jeruzalemská! Pán zrušil tvoj rozsudok, odvrátil tvojich nepriateľov. Kráľ Izraela, Pán, je s\u00A0tebou, neboj sa nijakého zla! V\u00A0onen deň povedia Jeruzalemu: \"Neboj sa, Sion, nech ti ruky nechabnú! Pán, tvoj Boh, je s\u00A0tebou, on je mocný, on ťa zachráni. Teší sa a plesá nad\u00A0tebou, obnovuje k\u00A0tebe svoju lásku, plesá nad\u00A0tebou a jasá; ako v\u00A0deň zhromaždenia.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"31", "1", "", "Nm 24, 2-7. 15-17d ",
                    "Hviezda vychádza z\u00A0Jakuba",
                    "Čítanie z Knihy Numeri<br>" +
                            "V tých dňoch Balaam zdvihol oči a videl Izraelitov, ako táboria podľa kmeňov. Vtedy zostúpil naňho duch Boží a on predniesol svoju pieseň: \"Hovorí Balaam, Beorov syn, hovorí muž s\u00A0prenikavým zrakom, hovorí ten, čo načúva Božie slová, ktorý vidí, čo mu dáva vidieť Všemohúci, ktorý padá a otvárajú sa mu oči.<br>" +
                            "Aké krásne sú tvoje stany, Jakub, tvoje príbytky, Izrael! Tiahnu sa do\u00A0diaľav ako údolia, ako zavlažené záhrady pozdĺž rieky, ako aloy, ktoré zasadil Pán, a ako cédre pri\u00A0vode. Voda tečie z\u00A0jeho vedier a jeho semeno má bohatú vlahu. Jeho kráľ bude väčší než Agag a slávne bude jeho kráľovstvo.\"<br>" +
                            "A ďalej povedal: \"Hovorí Balaam, Beorov syn, hovorí muž s\u00A0prenikavým zrakom, hovorí ten, čo načúva Božie slová, ten, čo pozná náuku Najvyššieho, ktorý vidí, čo mu dáva vidieť Všemohúci, ktorý padá a otvárajú sa mu oči.<br>" +
                            "Vidím ho, ale nie teraz, hľadím na\u00A0neho, no nie zblízka. Hviezda vychádza z\u00A0Jakuba, žezlo sa dvíha z\u00A0Izraela.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"32", "2", "", "Sof 3, 1-2. 9-13",
                    "Mesiášska spása sa sľubuje všetkým chudobným",
                    "Čítanie z Knihy proroka Sofoniáša<br>" +
                            "Toto hovorí Pán: \"Beda ti, odbojné a poškvrnené, násilnícke mesto! Nepočúvlo hlas, nedbalo na\u00A0výstrahu, nedúfalo v\u00A0Pána, k\u00A0svojmu Bohu sa neobrátilo. ‚Očistím teda pery národom, aby všetci vzývali Pánovo meno, aby mu všetci svorne slúžili. Až spoza riek Etiópie budú mi prinášať obety moji ctitelia, potomci môjho rozptýleného ľudu. V\u00A0ten deň sa už nebudeš hanbiť za\u00A0svoje mnohé výčiny, ktorými si sa prehrešilo proti mne, lebo vtedy z\u00A0teba odstránim nadutých chvastúňov, a už sa nebudeš vyvyšovať na\u00A0mojom svätom vrchu.<br>" +
                            "Ponechám v\u00A0tvojom strede ľud pokorný a chudobný.' Zvyšky Izraela budú dôverovať v\u00A0Pánovo meno; už nebudú páchať neprávosť a nebudú hovoriť lož, v\u00A0ich ústach sa už podvodný jazyk nenájde. Nik ich nevystraší, keď sa budú pásť a odpočívať.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"33", "3", "", "Iz 45, 6c-8. 18. 21d-25",
                    "Roste, nebesia, z\u00A0výsosti",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            " \"Ja som Pán a nik iný, ja tvorím svetlo a pôsobím tmu, dávam šťastie a dopúšťam nešťastie; ja, Pán, robím toto všetko.<br>" +
                            "Roste, nebesia, z\u00A0výsosti, z\u00A0oblakov nech prší spravodlivosť. Nech sa otvorí zem a zrodí spásu; a spolu s\u00A0ňou nech vzíde spravodlivosť; ja, Pán, som ju stvoril.\"<br>" +
                            "Toto hovorí Pán, ktorý stvoril nebo; on je Boh, ktorý stvoril zem a stvárnil ju, on ju upevnil. Nestvoril ju, aby bola prázdna, na\u00A0obývanie ju pripravil: \"Ja som Pán a nik iný!<br>" +
                            "Nie som Pán len ja? Veď nieto Boha okrem mňa. Okrem mňa niet Boha pravého a spásneho. Obráťte sa ku\u00A0mne a dosiahnete spásu, všetky končiny zeme. Lebo ja som Boh a nik iný!<br>" +
                            "Na seba samého prisahám: z\u00A0mojich úst vychádza pravda, neodvolateľné slovo: predo\u00A0mnou sa skloní každé koleno, mne bude prisahať každý jazyk.\" \"Len v\u00A0Pánovi\" – povedia – \"je spása a sila.\" K\u00A0nemu prídu, a zahanbia sa všetci, čo sa mu protivia: v\u00A0Pánovi dosiahnu spásu a slávu všetci potomci Izraela.<br>" +
                            "Počuli sme Božie slovo."},
            {"34", "4", "", "Iz 54, 1-10",
                    "Pán ťa povolal ako opustenú ženu",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Plesaj, neplodná, čo si nerodila, jasaj a raduj sa, čo nepoznáš pôrodné bolesti, lebo opustená má viac detí než vydatá, hovorí Pán. Rozšír priestor svojho stanu, plachty svojich príbytkov roztiahni, nešetri, predĺž svoje povrazy a svoje kolíky upevni. Lebo prenikneš napravo i naľavo a tvoje potomstvo zdedí národy, bude obývať opustené mestá.<br>" +
                            "Neboj sa, lebo nebudeš zahanbená, ani sa nepýr, nebudeš potupená, zabudneš na\u00A0hanbu svojej mladosti a nespomenieš si už na\u00A0potupu svojho vdovstva. Veď tvoj Stvoriteľ je tvojím ženíchom, \"Pán zástupov\" je jeho meno. Svätý Izraela je tvoj vykupiteľ, \"Bohom celej zeme\" sa nazýva.<br>" +
                            "Pán ťa povolal ako ženu opustenú a duchom sklesnutú, ako odvrhnutú ženu svojej mladosti, hovorí tvoj Boh. Na\u00A0chvíľu krátku som ťa opustil, no s\u00A0veľkou láskou si ťa pritiahnem. V\u00A0návale hnevu skryl som nakrátko svoju tvár pred\u00A0tebou, no večným milosrdenstvom som sa nad\u00A0tebou zmiloval, hovorí tvoj vykupiteľ, Pán.<br>" +
                            "Je mi ako za\u00A0dní Noema: keď som prisahal, že Noemove vody viac nezaplavia zem. Aj teraz prisahám, že sa už nebudem hnevať na\u00A0teba, ani ťa viac karhať nebudem. Vrchy sa pohnú a kopce sa budú triasť, no moje milosrdenstvo neodstúpi od\u00A0teba, moja zmluva pokoja sa neotrasie, hovorí Pán, ktorý sa zmilúva nad\u00A0tebou.<br>" +
                            "Počuli sme Božie slovo."},
            {"35", "5", "", "Iz 56, 1-3b. 6-8",
                    "Môj dom sa bude volať domom modlitby pre\u00A0všetky národy",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán: \"Zachovajte právo, konajte spravodlivo, lebo je blízko moja spása, už príde, aj moja spravodlivosť, už sa zjaví.\"<br>" +
                            "Blažený muž, ktorý takto robí, blažený človek, čo sa toho drží, čo zachováva sobotu bez\u00A0znesvätenia, čo bdie nad\u00A0svojou rukou, aby nerobila zle. Nech nevraví cudzinec, ktorý lipne k\u00A0Pánovi: \"Pán ma vylúči zo\u00A0svojho ľudu.\"<br>" +
                            "\"A cudzincov, čo sa vinú k\u00A0Pánovi, čo si ho ctia, čo milujú jeho meno a čo mu slúžia, všetkých, čo zachovávajú sobotu bez\u00A0znesvätenia a pridŕžajú sa mojej zmluvy, privediem na\u00A0svoj svätý vrch a naplním ich radosťou v\u00A0mojom dome modlitby. Ich žertvy a ich obety mi budú potešením na\u00A0mojom oltári; veď môj dom sa bude volať domom modlitby pre\u00A0všetky národy.\"<br>" +
                            "Hovorí Pán, Boh, ktorý zhromažďuje rozptýlených z\u00A0Izraela: \"K jeho zhromaždeným zhromaždím ešte ďalších.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "A", "", "Iz 7, 10-14",
                    "Hľa, panna počne",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Pán prehovoril k\u00A0Achazovi: \"Žiadaj znamenie od\u00A0Pána, svojho Boha. Žiadaj ho, či v\u00A0hĺbkach podsvetia, alebo hore na\u00A0výsostiach.\"<br>" +
                            "Achaz však povedal: \"Nebudem žiadať, nebudem pokúšať Pána.\"<br>" +
                            "A Izaiáš riekol: \"Počúvajte teda, Dávidov dom. Nestačí, že obťažujete ľudí, ešte aj môjho Boha obťažujete? A preto vám Pán sám dá znamenie: Hľa, panna počne a porodí syna a dá mu meno Emanuel.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "B", "", "2 Sam 7, 1-5. 8b-12. 14a. 16",
                    "Dávidovo kráľovstvo bude trvať pred\u00A0Pánom naveky",
                    "Čítanie z Druhej knihy Samuelovej<br>" +
                            "Keď kráľ Dávid býval už vo\u00A0svojom paláci a Pán mu poprial pokoj od\u00A0všetkých okolitých nepriateľov, povedal prorokovi Nátanovi: \"Pozri, ja bývam v\u00A0dome z\u00A0cédrov, a Božia archa stojí pod\u00A0stanmi.\"<br>" +
                            "Nátan odpovedal kráľovi: \"Choď a rob všetko, čo ti vnuká srdce, Pán je s\u00A0tebou.\"<br>" +
                            "V tú noc zaznelo Pánovo slovo Nátanovi: \"Choď a povedz môjmu služobníkovi Dávidovi: Toto hovorí Pán: Ty mi chceš postaviť dom, v\u00A0ktorom mám bývať? Ja som ťa vzal z\u00A0pastvín od\u00A0oviec, aby si bol vodcom môjho ľudu, Izraela; a bol som s\u00A0tebou pri\u00A0všetkom, čo si podnikal. Pred\u00A0tvojimi očami som vyhubil všetkých tvojich nepriateľov a zaistil som ti také meno, aké majú len najväčší na\u00A0zemi.<br>" +
                            "Svojmu ľudu, Izraelovi, určím miesto a zasadím ho tam. Tam bude bývať a nebude sa báť a ani zlosynovia ho už nebudú utláčať ako kedysi, v\u00A0dňoch, keď som ustanovoval sudcov nad\u00A0svojím ľudom, Izraelom. Oslobodím ťa od\u00A0všetkých tvojich nepriateľov a darujem ti pokoj. Pán ti oznamuje, že ti sám vybuduje dom, a až sa tvoje dni dovŕšia a ty sa uložíš na\u00A0odpočinok k\u00A0svojim otcom, ustanovím po\u00A0tebe potomka, ktorý bude pochádzať z\u00A0tvojich útrob, a upevním jeho kráľovstvo. Ja mu budem otcom a on mi bude synom.<br>" +
                            "Tvoj dom a tvoje kráľovstvo budú trvať predo\u00A0mnou naveky, tvoj trón bude upevnený navždy.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "C", "", " Mich 5, 1-4a ",
                    "Kým rodička neporodí",
                    "Čítanie z Knihy proroka Micheáša<br>" +
                            "Toto hovorí Pán: \"Betlehem Efratský, najmenší medzi judejskými mestami, z\u00A0teba vzíde zvrchovaný vládca Izraela. Pôvod jeho je odpradávna, od\u00A0večnosti. Preto ich vydá až do\u00A0času, kým rodička neporodí. Až potom sa zvyšok jeho bratov vráti k\u00A0synom Izraela.<br>" +
                            "On vystúpi a bude ich pastierom silou Pána, velebou mena Pána, svojho Boha. A budú žiť v\u00A0istote, lebo teraz bude veľký až po\u00A0končiny zeme. On bude pokoj.\"<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] adventCitanie2 = {
            {"10", "A", "", "Rim 13, 11-14a ",
                    "Naša spása je blízko",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, viete, aký je čas, že už nadišla hodina, aby ste sa prebudili zo\u00A0sna. Veď teraz je nám spása bližšie, ako vtedy, keď sme uverili. Noc pokročila, deň sa priblížil. Zhoďme teda skutky tmy a oblečme sa do\u00A0výzbroje svetla. Žime počestne ako vo\u00A0dne; nie v\u00A0hýrení a opilstve, nie v\u00A0smilstve a necudnosti, nie v\u00A0svároch a žiarlivosti, ale oblečte si Pána Ježiša Krista.<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "B", "", "1 Kor 1, 3-9",
                    "Očakávame, že sa zjaví náš Pán Ježiš Kristus",
                    "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                            "Bratia, milosť vám a pokoj od\u00A0Boha, nášho Otca, i od\u00A0Pána Ježiša Krista.<br>" +
                            "Ustavične vzdávam vďaky svojmu Bohu za\u00A0vás pre\u00A0Božiu milosť, ktorú ste dostali v\u00A0Kristovi Ježišovi. Veď v\u00A0ňom ste boli obohatení vo\u00A0všetkom, v\u00A0každom slove a v\u00A0každom poznaní, tak ako sa medzi vami upevnilo svedectvo o\u00A0Kristovi, takže vám nechýba nijaký dar milosti, kým očakávate, že sa zjaví náš Pán Ježiš Kristus. On vás bude posilňovať až do\u00A0konca, aby ste boli bez\u00A0úhony v\u00A0deň nášho Pána Ježiša Krista. Verný je Boh, ktorý vás povolal do\u00A0spoločenstva svojho Syna Ježiša Krista, nášho Pána.<br>" +
                            "Počuli sme Božie slovo."},
            {"10", "C", "", "1 Sol 3, 12 – 4, 2",
                    "Nech Pán posilní vaše srdcia, keď príde Kristus",
                    "Čítanie z Prvého listu svätého apoštola Pavla Solúnčanom<br>" +
                            "Bratia, Pán nech zveľadí a rozhojní vašu lásku navzájom i voči všetkým tak, ako ju my máme voči vám. Nech posilní vaše srdcia, aby ste boli bez\u00A0úhony vo\u00A0svätosti pred\u00A0Bohom a naším Otcom, keď príde náš Pán Ježiš so\u00A0všetkými svojimi svätými. Amen.<br>" +
                            "Napokon vás teda, bratia, prosíme a napomíname v\u00A0Pánu Ježišovi, aby ste čoraz viac rástli v\u00A0tom, čo ste od\u00A0nás prijali: ako máte žiť a páčiť sa Bohu, ako aj žijete. Veď viete, aké príkazy sme vám dali z\u00A0moci Pána Ježiša.<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "A", "", "Rim 15, 4-9",
                    "Kristus vykúpil všetkých ľudí",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, všetko, čo bolo kedysi napísané, bolo napísané nám na\u00A0poučenie, aby sme skrze trpezlivosť a útechu z\u00A0Písma mali nádej. Boh trpezlivosti a potechy nech vám dá, aby ste jedni o\u00A0druhých zmýšľali podľa Krista Ježiša, a tak jednomyseľne, jednými ústami oslavovali Boha a Otca nášho Pána Ježiša Krista.<br>" +
                            "Preto prijímajte jeden druhého, ako aj Kristus prijal vás, na\u00A0Božiu slávu. Hovorím totiž, že Kristus bol služobníkom obriezky v\u00A0záujme Božej pravdy, aby potvrdil prisľúbenia dané otcom a aby pohania oslavovali Boha za\u00A0milosrdenstvo, ako je napísané: \"Preto ťa budem velebiť medzi národmi, a ospevovať tvoje meno.\"<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "B", "", "2 Pt 3, 8-14",
                    "Očakávame nové nebo a novú zem",
                    "Čítanie z Druhého listu svätého apoštola Petra<br>" +
                            "Toto jedno nech vám je, milovaní, zjavné: že u\u00A0Pána je jeden deň ako tisíc rokov a tisíc rokov ako jeden deň. Pán nemešká s\u00A0prisľúbením, ako sa niektorí nazdávajú, že mešká; on je len trpezlivý s\u00A0vami a nechce, aby niekto zahynul, ale aby sa všetci dali na\u00A0pokánie. Pánov deň príde ako zlodej. A vtedy sa nebesia s\u00A0rachotom pominú, živly sa páľavou rozplynú, aj zem i diela, ktoré sú na\u00A0nej.<br>" +
                            "A keď sa toto všetko má tak rozplynúť, ako sväto a nábožne musíte žiť vy, čo očakávate túžobne príchod Božieho dňa, pre\u00A0ktorý sa nebesia páľavou rozplynú a živly sa v\u00A0ohni roztopia! Podľa jeho prísľubu očakávame nové nebo a novú zem, na\u00A0ktorých prebýva spravodlivosť.<br>" +
                            "Preto, milovaní, keď toto očakávate, usilujte sa, aby vás našiel nepoškvrnených a bez\u00A0úhony, v\u00A0pokoji.<br>" +
                            "Počuli sme Božie slovo."},
            {"20", "C", "", "Flp 1, 4-6. 8-11",
                    "Buďte čistí a bez\u00A0hany pre\u00A0Kristov deň",
                    "Čítanie z Listu svätého apoštola Pavla Filipanom<br>" +
                            "Bratia, vždy, v\u00A0každej svojej modlitbe s\u00A0radosťou prosím za\u00A0vás všetkých, za\u00A0vašu účasť na\u00A0evanjeliu od\u00A0prvého dňa až doteraz. A som si istý, že ten, čo začal vo\u00A0vás dobré dielo, aj ho dokončí až do\u00A0dňa Krista Ježiša.<br>" +
                            "Boh mi je svedok, ako po\u00A0vás všetkých túžim srdcom Krista Ježiša. A modlím sa za\u00A0to, aby vaša láska čoraz viac rástla v\u00A0pravom poznaní a vo\u00A0všestrannom chápaní, aby ste vedeli rozoznať, čo je lepšie, a aby ste boli čistí a bez\u00A0hany pre\u00A0Kristov deň, plní ovocia spravodlivosti, ktoré je skrze Ježiša Krista na\u00A0Božiu slávu a chválu.<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "A", "", "Jak 5, 7-10",
                    "Posilnite si srdcia, lebo Pánov príchod sa približuje",
                    "Čítanie z Listu svätého apoštola Jakuba<br>" +
                            "Bratia, buďte trpezliví až do\u00A0Pánovho príchodu. Pozrite: aj roľník čaká na\u00A0vzácnu úrodu zeme a trpezlivo čaká, kým nedostane včasný i neskorý dážď. Buďte aj vy trpezliví a posilnite si srdcia, lebo Pánov príchod sa približuje.<br>" +
                            "Nesťažujte sa, bratia, jeden na\u00A0druhého, aby ste neboli odsúdení. Hľa, sudca stojí predo\u00A0dvermi. Za\u00A0príklad, ako trpieť a byť trpezlivým, berte si, bratia, prorokov, ktorí hovorili v\u00A0Pánovom mene.<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "B", "", "1 Sol 5, 16-24",
                    "Aby sa zachoval váš duch a duša i telo, keď príde Pán",
                    "Čítanie z Prvého listu svätého apoštola Pavla Solúnčanom<br>" +
                            "Bratia, ustavične sa radujte! Bez\u00A0 prestania sa modlite, pri\u00A0všetkom vzdávajte vďaky, lebo to je Božia vôľa v\u00A0Kristovi Ježišovi pre\u00A0vás! Ducha neuhášajte, proroctvami nepohŕdajte! Ale všetko skúmajte a čo je dobré, toho sa držte! Chráňte sa zla v\u00A0akejkoľvek podobe!<br>" +
                            "Sám Boh pokoja nech vás celých posvätí, aby sa zachoval váš duch neporušený a duša i telo bez\u00A0úhony, keď príde náš Pán Ježiš Kristus. Verný je ten, ktorý vás volá, a on to aj urobí.<br>" +
                            "Počuli sme Božie slovo."},
            {"30", "C", "", "Flp 4, 4-7",
                    "Pán je blízko",
                    "Čítanie z Listu svätého apoštola Pavla Filipanom<br>" +
                            "Bratia, ustavične sa radujte v\u00A0Pánovi! Opakujem: Radujte sa! Vaša miernosť nech je známa všetkým ľuďom. Pán je blízko. O\u00A0nič nebuďte ustarostení. Ale vo\u00A0všetkom modlitbou, prosbou a so\u00A0vzdávaním vďaky prednášajte svoje žiadosti Bohu. A Boží pokoj, ktorý prevyšuje každú chápavosť, uchráni vaše srdcia a vaše mysle v\u00A0Kristovi Ježišovi.<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "A", "", "Rim 1, 1-7",
                    "Ježiš Kristus, z\u00A0Dávidovho rodu, Boží Syn",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Pavol, služobník Krista Ježiša, povolaný za\u00A0apoštola, vybraný hlásať Božie evanjelium, ktoré Boh vopred prisľúbil vo\u00A0Svätých písmach skrze svojich prorokov o\u00A0svojom Synovi, ktorý podľa tela pochádza z\u00A0Dávidovho rodu a podľa Ducha svätosti od\u00A0vzkriesenia z\u00A0mŕtvych je ustanovený v\u00A0moci ako Boží Syn, o\u00A0Ježišovi Kristovi, našom Pánovi.<br>" +
                            "Skrze neho sme dostali milosť a apoštolský úrad, aby na\u00A0slávu jeho mena poslušne uverili všetky národy; k\u00A0nim patríte aj vy, povolaní Ježišom Kristom.<br>" +
                            "Všetkým, čo sú v\u00A0Ríme, Bohom milovaným, povolaným svätým: Milosť vám a pokoj od\u00A0Boha, nášho Otca, i od\u00A0Pána Ježiša Krista.<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "B", "", "Rim 16, 25-27",
                    "Teraz bolo zjavené od\u00A0večnosti skryté tajomstvo",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, tomu, ktorý má moc utvrdiť vás podľa môjho evanjelia a hlásania Ježiša Krista na\u00A0základe zjavenia tajomstva, ktoré bolo od\u00A0večnosti skryté, ale teraz bolo zjavené a skrze Písma prorokov z\u00A0príkazu večného Boha vyjavené všetkým národom, aby poslušne prijali vieru, jemu, jedinému múdremu Bohu sláva skrze Ježiša Krista naveky. Amen.<br>" +
                            "Počuli sme Božie slovo."},
            {"40", "C", "", "Hebr 10, 5-10",
                    "Prichádzam, aby som plnil tvoju vôľu",
                    "Čítanie z Listu Hebrejom<br>" +
                            "Bratia, keď Kristus prichádza na\u00A0svet, hovorí: \"Nechcel si obetu ani dar, ale dal si mi telo. Nepáčili sa ti zápalné obety ani obety za\u00A0hriech. Vtedy som povedal: Hľa, prichádzam – vo\u00A0zvitku knihy je napísané o\u00A0mne –, aby som plnil tvoju vôľu, Bože.\"<br>" +
                            "Najprv hovorí: \"Obety ani dary, ani obety zápalné, ani obety za\u00A0hriech si nechcel, ani sa ti nepáčili\" – a ony sa prinášajú podľa zákona. Potom povedal: \"Hľa, prichádzam, aby som plnil tvoju vôľu.\" Ruší prvé, aby ustanovil druhé. V\u00A0tejto vôli sme posvätení obetou tela Krista Ježiša raz navždy.<br>" +
                            "Počuli sme Božie slovo."},
    };

    String[][] adventEvanjelium = {
            {"10", "A", "", "Mt 24, 37-44",
                    "Bdejte, aby ste boli pripravení",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Ako bolo za\u00A0dní Noema, tak bude aj pri\u00A0príchode Syna človeka. Ako v\u00A0dňoch pred\u00A0potopou ľudia jedli a pili, ženili sa a vydávali až do\u00A0toho dňa, keď Noe vošiel do\u00A0korába, a nič nezbadali, až prišla potopa a zmietla všetkých, tak bude aj pri\u00A0príchode Syna človeka. Vtedy budú na\u00A0poli dvaja: jeden bude vzatý, druhý sa ponechá. Dve budú mlieť na\u00A0mlyne: jedna bude vzatá, druhá sa ponechá.<br>" +
                            "Bdejte teda, lebo neviete, v\u00A0ktorý deň príde váš Pán. Uvážte predsa: Keby hospodár vedel, v\u00A0ktorú nočnú hodinu príde zlodej, veruže by bdel a nedovolil by mu vniknúť do\u00A0svojho domu. Preto aj vy buďte pripravení, lebo Syn človeka príde v\u00A0hodinu, o\u00A0ktorej neviete.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"10", "B", "", "Mk 13, 33-37",
                    "Bdejte, lebo neviete, kedy príde pán domu",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Ježiš povedal svojim učeníkom: \"Majte sa na\u00A0pozore, bdejte, lebo neviete, kedy príde ten čas. Je to tak, ako keď človek odcestuje: opustil svoj dom, svojim sluhom odovzdal moc, každému určil prácu a vrátnikovi prikázal bdieť.<br>" +
                            "Bdejte teda, lebo neviete, kedy príde pán domu: či večer, či o\u00A0polnoci, či za\u00A0spevu kohúta alebo ráno. Aby vás nenašiel spať, keď príde nečakane!<br>" +
                            "A čo hovorím vám, hovorím všetkým: Bdejte!\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"10", "C", "", "Lk 21, 25-28. 34-36",
                    "Blíži sa vaše vykúpenie",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Budú znamenia na\u00A0slnku a mesiaci i na\u00A0hviezdach a na\u00A0zemi budú národy plné úzkosti a zmätku z\u00A0hukotu mora a vlnobitia. Ľudia budú zmierať od\u00A0strachu a očakávania toho, čo príde na\u00A0svet, lebo nebeské mocnosti sa budú chvieť. Vtedy uvidia Syna človeka prichádzať v\u00A0oblaku s\u00A0mocou a veľkou slávou.<br>" +
                            "Keď sa to začne diať, vzpriamte sa, zodvihnite hlavu, lebo sa blíži vaše vykúpenie.<br>" +
                            "Dávajte si pozor, aby vaše srdcia neoťaželi obžerstvom, opilstvom a starosťami o\u00A0tento život, aby vás onen deň neprekvapil. Lebo príde ako osídlo na\u00A0všetkých, čo bývajú na\u00A0povrchu celej zeme. Preto bdejte celý čas a modlite sa, aby ste mohli uniknúť všetkému tomu, čo má prísť, a postaviť sa pred\u00A0Syna človeka.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"11", "1", "", "Mt 8, 5-11",
                    "Prídu mnohí od\u00A0východu i západu do\u00A0nebeského kráľovstva",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Keď Ježiš vošiel do\u00A0Kafarnauma, pristúpil k\u00A0nemu stotník s\u00A0prosbou: \"Pane, sluha mi leží doma ochrnutý a hrozne trpí.\"<br>" +
                            "On mu povedal: \"Prídem a uzdravím ho.\"<br>" +
                            "Stotník mu odpovedal: \"Pane, nie som hoden, aby si vošiel pod\u00A0moju strechu, ale povedz iba slovo a môj sluha ozdravie. Veď aj ja som podriadený človek a mám pod\u00A0sebou vojakov. Ak daktorému poviem: \"Choď!\" – ide; inému: \"Poď sem!\" – tak príde; a svojmu sluhovi: \"Urob toto!\" – on to urobí.\"<br>" +
                            "Keď to Ježiš počul, zadivil sa a tým, čo ho sprevádzali, povedal: \"Veru, hovorím vám: Takú vieru som nenašiel u\u00A0nikoho v\u00A0Izraeli. Hovorím vám, že prídu mnohí od\u00A0východu i západu a budú stolovať s\u00A0Abrahámom, Izákom a Jakubom v\u00A0nebeskom kráľovstve.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"12", "2", "", "Lk 10, 21-24",
                    "Ježiš zaplesal v\u00A0Duchu Svätom",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ježiš v\u00A0tej hodine zaplesal v\u00A0Duchu Svätom a povedal: \"Zvelebujem ťa, Otče, Pán neba i zeme, že si tieto veci skryl pred\u00A0múdrymi a rozumnými a zjavil si ich maličkým. Áno, Otče, tebe sa tak páčilo.<br>" +
                            "Môj Otec mi odovzdal všetko. A nik nevie, kto je Syn, iba Otec, ani kto je Otec, iba Syn a ten, komu to Syn bude chcieť zjaviť.\"<br>" +
                            "Potom sa obrátil osobitne k\u00A0učeníkom a povedal: \"Blahoslavené oči, ktoré vidia, čo vidíte vy. Lebo hovorím vám: Mnohí proroci a králi chceli vidieť, čo vidíte vy, ale nevideli, a počuť, čo vy počúvate, ale nepočuli.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"13", "3", "", "Mt 15, 29-37",
                    "Ježiš uzdravuje mnohých a rozmnožuje chleby",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš prišiel ku\u00A0Galilejskému moru, vystúpil na\u00A0vrch a tam si sadol. Prichádzali k\u00A0nemu celé zástupy, ktoré mali so\u00A0sebou chromých, slepých, mrzákov, nemých a mnohých iných. Kládli mu ich k\u00A0nohám a on ich uzdravoval. A zástupy žasli, keď videli, že nemí hovoria, mrzáci sú zdraví, chromí chodia a slepí vidia, a velebili Boha Izraela.<br>" +
                            "Ježiš zvolal svojich učeníkov a povedal: \"Ľúto mi je zástupu, lebo už tri dni sa zdržiavajú pri\u00A0mne a nemajú čo jesť. A nechcem ich prepustiť hladných, aby nepoomdlievali na\u00A0ceste.\"<br>" +
                            "Učeníci mu povedali: \"Kdeže vezmeme na\u00A0púšti toľko chleba, aby sme nasýtili takýto zástup?\"<br>" +
                            "Ježiš sa ich opýtal: \"Koľko máte chlebov?\"<br>" +
                            "Oni odpovedali: \"Sedem a zopár rybiek.\"<br>" +
                            "Tu rozkázal zástupu, aby si posadal na\u00A0zem. Vzal sedem chlebov a ryby, vzdával vďaky, lámal a dával učeníkom a učeníci zástupom.<br>" +
                            "Všetci jedli a nasýtili sa. A nazbierali sedem plných košov zvyšných odrobín.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"14", "4", "", "Mt 7, 21. 24-27",
                    "Kto plní vôľu Otca, vojde do\u00A0nebeského kráľovstva",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Nie každý, kto mi hovorí: ‚Pane, Pane,' vojde do\u00A0nebeského kráľovstva, ale iba ten, kto plní vôľu môjho Otca, ktorý je na\u00A0nebesiach.<br>" +
                            "A tak každý, kto počúva tieto moje slová a uskutočňuje ich, podobá sa múdremu mužovi, ktorý si postavil dom na\u00A0skale. Spustil sa dážď, privalili sa vody, strhla sa víchrica a oborili sa na\u00A0ten dom, ale dom sa nezrútil, lebo mal základy na\u00A0skale.<br>" +
                            "A každý, kto tieto moje slová počúva, ale ich neuskutočňuje, podobá sa hlúpemu mužovi, ktorý si postavil dom na\u00A0piesku. Spustil sa dážď, privalili sa vody, strhla sa víchrica, oborili sa na\u00A0ten dom a dom sa zrútil; zostalo z\u00A0neho veľké rumovisko.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"15", "5", "", "Mt 9, 27-31",
                    "Dvom slepcom, ktorí uverili v\u00A0Ježiša, sa otvorili oči",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Keď Ježiš odchádzal, išli za\u00A0ním dvaja slepci a kričali: \"Syn Dávidov, zmiluj sa nad\u00A0nami!\"<br>" +
                            "Keď potom vošiel do\u00A0domu, slepci prišli k\u00A0nemu. Ježiš sa ich opýtal: \"Veríte, že to môžem urobiť?\"<br>" +
                            "Oni mu odpovedali: \"Áno, Pane.\"<br>" +
                            "Tu sa dotkol ich očí a povedal: \"Nech sa vám stane, ako ste uverili.\" A oči sa im otvorili.<br>" +
                            "Ježiš im pohrozil: \"Ale nech sa to nik nedozvie!\"<br>" +
                            "No oni šli a rozprávali o\u00A0ňom po\u00A0celom kraji.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"16", "6", "", "Mt 9, 35 – 10, 1. 5a. 6-8",
                    "Videl zástupy a zľutoval sa nad\u00A0nimi",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš chodil po\u00A0všetkých mestách a dedinách, učil v\u00A0ich synagógach, hlásal evanjelium o\u00A0kráľovstve a uzdravoval každý neduh a každú chorobu.<br>" +
                            "Keď videl zástupy, zľutoval sa nad\u00A0nimi, lebo boli zmorené a sklesnuté ako ovce bez\u00A0pastiera. Vtedy povedal svojim učeníkom: \"Žatva je veľká, ale robotníkov málo. Preto proste Pána žatvy, aby poslal robotníkov na\u00A0svoju žatvu.\"<br>" +
                            "Zvolal svojich dvanástich učeníkov a dal im moc nad\u00A0nečistými duchmi, aby ich vyháňali a uzdravovali každý neduh a každú chorobu. Týchto dvanástich Ježiš vyslal a prikázal im: \"Choďte k\u00A0ovciam strateným z\u00A0domu Izraela! Choďte a hlásajte: ‚Priblížilo sa nebeské kráľovstvo.' Chorých uzdravujte, mŕtvych krieste, malomocných očisťujte, zlých duchov vyháňajte. Zadarmo ste dostali, zadarmo dávajte.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"20", "A", "", "Mt 3, 1-12",
                    "Robte pokánie, lebo sa priblížilo nebeské kráľovstvo",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "V tých dňoch vystúpil Ján Krstiteľ a hlásal v\u00A0judejskej púšti: \"Robte pokánie, lebo sa priblížilo nebeské kráľovstvo.\"<br>" +
                            "To o\u00A0ňom povedal prorok Izaiáš: \"Hlas volajúceho na\u00A0púšti: ‚Pripravte cestu Pánovi, vyrovnajte mu chodníky!'\" Ján nosil odev z\u00A0ťavej srsti a okolo bedier kožený opasok. Potravou mu boli kobylky a lesný med. Vtedy prichádzal k\u00A0nemu Jeruzalem a celá Judea i celé okolie Jordánu. Vyznávali svoje hriechy a dávali sa mu krstiť v\u00A0rieke Jordán.<br>" +
                            "Keď videl, že aj mnohí farizeji a saduceji prichádzajú k\u00A0nemu na\u00A0krst, povedal im: \"Hadie plemeno, kto vám ukázal, ako uniknúť budúcemu hnevu!? Prinášajte teda ovocie hodné pokánia! Nenazdávajte sa, že si môžete povedať: ‚Naším otcom je Abrahám!' – lebo vravím vám: Boh môže Abrahámovi vzbudiť deti aj z\u00A0týchto kameňov. Sekera je už priložená na\u00A0korene stromov. A každý strom, ktorý neprináša dobré ovocie, vytnú a hodia do\u00A0ohňa. Ja vás krstím vodou na\u00A0pokánie, ale ten, čo príde po\u00A0mne, je mocnejší, ako som ja. Ja nie som hoden nosiť mu obuv. On vás bude krstiť Duchom Svätým a ohňom. V\u00A0ruke má vejačku, vyčistí si humno, pšenicu si zhromaždí do\u00A0sýpky, ale plevy spáli v\u00A0neuhasiteľnom ohni.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"20", "B", "", "Mk 1, 1-8",
                    "Vyrovnajte chodníky Pánovi",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>" +
                            "Začiatok evanjelia Ježiša Krista, Božieho Syna.<br>" +
                            "Prorok Izaiáš napísal: \"Hľa, posielam svojho posla pred\u00A0tvojou tvárou a on ti pripraví cestu.<br>" +
                            "Hlas volajúceho na\u00A0púšti: ‚Pripravte cestu Pánovi, vyrovnajte mu chodníky!'\"<br>" +
                            "Ján bol na\u00A0púšti, krstil a hlásal krst pokánia na\u00A0odpustenie hriechov. Prichádzala k\u00A0nemu celá judejská krajina i všetci Jeruzalemčania. Vyznávali svoje hriechy a dávali sa mu krstiť v\u00A0rieke Jordán.<br>" +
                            "Ján nosil odev z\u00A0ťavej srsti a okolo bedier kožený opasok. Jedával kobylky a lesný med. A hlásal: \"Po mne prichádza mocnejší, ako som ja. Ja nie som hoden ani zohnúť sa a rozviazať mu remienok na\u00A0obuvi. Ja som vás krstil vodou, ale on vás bude krstiť Duchom Svätým.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"20", "C", "", "Lk 3, 1-6",
                    "Každé telo uvidí Božiu spásu",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "V pätnástom roku vlády cisára Tibéria, keď Poncius Pilát spravoval Judeu a Herodes bol tetrarchom v\u00A0Galilei, jeho brat Filip tetrarchom v\u00A0Itúrei a trachonitídskom kraji a Lyzaniáš tetrarchom v\u00A0Abilíne, za\u00A0veľkňazov Annáša a Kajfáša zaznel na\u00A0púšti Boží hlas nad\u00A0Jánom, synom Zachariáša.<br>" +
                            "Chodil po\u00A0celom okolí Jordána a hlásal krst pokánia na\u00A0odpustenie hriechov, ako je napísané v\u00A0knihe rečí proroka Izaiáša: \"Hlas volajúceho na\u00A0púšti: ‚Pripravte cestu Pánovi, vyrovnajte mu chodníky! Každá dolina sa vyplní a každý vrch a kopec zníži. Čo je krivé, bude priame, a čo je hrboľaté, bude cestou hladkou. A každé telo uvidí Božiu spásu.'\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"21", "1", "", "Lk 5, 17-26",
                    "Dnes sme videli obdivuhodné veci",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Keď v\u00A0istý deň Ježiš učil, sedeli pri\u00A0ňom farizeji a zákonníci, čo poprichádzali zo\u00A0všetkých galilejských a judejských dedín i z\u00A0Jeruzalema; a mal od\u00A0Pána moc uzdravovať.<br>" +
                            "Tu muži priniesli na\u00A0nosidlách človeka, ktorý bol ochrnutý, a pokúšali sa dostať ho dovnútra a položiť pred\u00A0neho. Ale keď pre\u00A0zástup nenašli priechod, kadiaľ by ho vniesli, vyšli na\u00A0strechu a cez\u00A0povalu ho na\u00A0lôžku spustili priamo pred\u00A0Ježiša.<br>" +
                            "Keď videl ich vieru, povedal: \"Človeče, odpúšťajú sa ti hriechy.\"<br>" +
                            "Tu zákonníci a farizeji začali uvažovať: \"Ktože je to, že sa takto rúha?! Kto môže okrem Boha odpúšťať hriechy?\"<br>" +
                            "Keďže Ježiš poznal ich myšlienky, povedal im: \"O čom to premýšľate vo\u00A0svojich srdciach? Čo je ľahšie – povedať: ‚Odpúšťajú sa ti hriechy,' alebo povedať: ‚Vstaň a choď?'<br>" +
                            "Ale aby ste vedeli, že Syn človeka má na\u00A0zemi moc odpúšťať hriechy\" – povedal ochrnutému: \"Hovorím ti: Vstaň, vezmi si lôžko a choď domov!\" A on hneď pred\u00A0ich očami vstal, vzal si lôžko a velebiac Boha odišiel domov.<br>" +
                            "Všetkých sa zmocnil úžas a velebili Boha, a plní bázne hovorili: \"Dnes sme videli obdivuhodné veci.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"22", "2", "", "Mt 18, 12-14",
                    "Boh nechce, aby zahynuli maličkí",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal svojim učeníkom: \"Čo myslíte? Keby mal niekto sto oviec a jedna z\u00A0nich by zablúdila, nenechá tých deväťdesiatdeväť na\u00A0vrchoch a nepôjde hľadať tú, čo zablúdila? A keď sa mu ju podarí nájsť, veru, hovorím vám: Bude mať z\u00A0nej väčšiu radosť ako z\u00A0tých deväťdesiatich deviatich, čo nezablúdili.<br>" +
                            "Tak ani váš Otec, ktorý je na\u00A0nebesiach, nechce, aby zahynul čo len jediný z\u00A0týchto maličkých.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"23", "3", "", "Mt 11, 28-30",
                    "Poďte ku\u00A0mne všetci, ktorí sa namáhate",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal: \"Poďte ku\u00A0mne všetci, ktorí sa namáhate a ste preťažení, a ja vás posilním.<br>" +
                            "Vezmite na\u00A0seba moje jarmo a učte sa odo\u00A0mňa, lebo som tichý a pokorný srdcom; a nájdete odpočinok pre\u00A0svoju dušu.<br>" +
                            "Moje jarmo je príjemné a moje bremeno ľahké.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"24", "4", "", "Mt 11, 11-15",
                    "Nik nepovstal väčší ako Ján Krstiteľ",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal zástupom: \"Veru, hovorím vám: Medzi tými, čo sa narodili zo\u00A0ženy, nepovstal nik väčší ako Ján Krstiteľ. Ale ten, kto je v\u00A0nebeskom kráľovstve menší, je väčší ako on.<br>" +
                            "Od dní Jána Krstiteľa podnes trpí nebeské kráľovstvo násilie a násilníci sa ho zmocňujú. Lebo všetci Proroci i Zákon prorokovali až po\u00A0Jána: A on sám – ak to chcete prijať – je Eliáš, ktorý má prísť.<br>" +
                            "Kto má uši, nech počúva!\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"25", "5", "", "Mt 11, 16-19",
                    "Nepočúvajú ani Jána, ani Syna človeka",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal zástupom: \"Komuže prirovnám toto pokolenie? Podobá sa deťom, čo vysedávajú na\u00A0námestí a pokrikujú na\u00A0svojich druhov: ‚Pískali sme vám, a netancovali ste; nariekali sme, a neplakali ste.'<br>" +
                            "Prišiel Ján, nejedol a nepil, a hovoria: ‚Je posadnutý zlým duchom.' Prišiel Syn človeka, je a pije, a hovoria: ‚Hľa, pažravec a pijan, priateľ mýtnikov a hriešnikov!' No múdrosť ospravedlňujú jej skutky.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"26", "6", "", "Mt 17, 10-13",
                    "Eliáš už prišiel, no nespoznali ho",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Keď zostupovali z\u00A0vrchu, učeníci sa pýtali Ježiša: \"Prečo zákonníci hovoria, že najprv musí prísť Eliáš?\"<br>" +
                            "On odpovedal: \"Áno Eliáš príde a všetko obnoví. Ba hovorím vám, že Eliáš už prišiel, no nespoznali ho a urobili s\u00A0ním, čo chceli. Takisto bude od\u00A0nich trpieť aj Syn človeka.\" Vtedy učeníci pochopili, že im hovoril o\u00A0Jánovi Krstiteľovi.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"30", "A", "", "Mt 11, 2-11",
                    "Ty si ten, ktorý má prísť, alebo máme čakať iného?",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ján bol v\u00A0žalári. Keď počul o\u00A0Kristových skutkoch, poslal k\u00A0nemu svojich učeníkov opýtať sa: \"Ty si ten, ktorý má prísť, alebo máme čakať iného?\"<br>" +
                            "Ježiš im odpovedal: \"Choďte a oznámte Jánovi, čo počujete a čo vidíte: Slepí vidia, chromí chodia, malomocní sú čistí, hluchí počujú, mŕtvi vstávajú a chudobným sa hlása evanjelium. A blahoslavený je, kto sa na\u00A0mne nepohorší.\"<br>" +
                            "Keď odchádzali, začal Ježiš hovoriť zástupom o\u00A0Jánovi: \"Čo ste vyšli na\u00A0púšť vidieť? Trstinu zmietanú vetrom? Alebo čo ste vyšli vidieť? Človeka oblečeného do\u00A0jemných šiat? Veď tí, čo nosia jemné šaty, bývajú v\u00A0kráľovských domoch. Teda čo ste vyšli vidieť? Proroka? Áno, hovorím vám, viac ako proroka! Lebo to o\u00A0ňom je napísané: ‚Hľa, ja posielam svojho posla pred\u00A0tvojou tvárou a on pripraví cestu pred\u00A0tebou.'<br>" +
                            "Veru, hovorím vám: Medzi tými, čo sa narodili zo\u00A0ženy, nepovstal nik väčší ako Ján Krstiteľ. Ale ten, kto je v\u00A0nebeskom kráľovstve menší, je väčší ako on.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"30", "B", "", "Jn 1, 6-8. 19-28",
                    "Medzi vami stojí ten, ktorého nepoznáte",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Bol človek, ktorého poslal Boh, volal sa Ján. Prišiel ako svedok vydať svedectvo o\u00A0svetle, aby skrze neho všetci uverili. On sám nebol svetlo, prišiel iba vydať svedectvo o\u00A0svetle.<br>" +
                            "A toto je Jánovo svedectvo: Keď Židia z\u00A0Jeruzalema poslali k\u00A0nemu kňazov a levitov, aby sa ho pýtali: \"Kto si ty?\", on vyznal a nič nezaprel. Vyznal: \"Ja nie som Mesiáš.\"<br>" +
                            "\"Čo teda, \"pýtali sa ho, \"si Eliáš?\"<br>" +
                            "Povedal: \"Nie som.\"<br>" +
                            "\"Si prorok?\" Odpovedal: \"Nie.\"<br>" +
                            "Vraveli mu teda: \"Kto si? Aby sme mohli dať odpoveď tým, čo nás poslali. Čo hovoríš o\u00A0sebe?\"<br>" +
                            "Povedal: \"Ja som hlas volajúceho na\u00A0púšti: ‚Vyrovnajte cestu Pánovi,' ako povedal prorok Izaiáš.\"<br>" +
                            "Tí vyslaní boli spomedzi farizejov. A pýtali sa ho: \"Prečo teda krstíš, keď nie si Mesiáš ani Eliáš, ani prorok?\" Ján im odpovedal: \"Ja krstím vodou. Medzi vami stojí ten, ktorého nepoznáte. On prichádza po\u00A0mne a ja nie som hoden rozviazať mu remienok na\u00A0obuvi.\"<br>" +
                            "To sa stalo v\u00A0Betánii za\u00A0Jordánom, kde Ján krstil.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"30", "C", "", "Lk 3, 10-18",
                    "Čo máme robiť my?",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Zástupy sa pýtali Jána: \"Čo teda máme robiť?\"<br>" +
                            "On im odpovedal: \"Kto má dvoje šiat, nech dá tomu, čo nemá nijaké, a kto má jedlo, nech urobí podobne!\"<br>" +
                            "Aj mýtnici prišli, aby sa dali pokrstiť, a hovorili mu: \"Učiteľ, čo máme robiť?\"<br>" +
                            "On im povedal: \"Nevymáhajte viac, ako vám určili!\"<br>" +
                            "Pýtali sa ho aj vojaci: \"A čo máme robiť my?\"<br>" +
                            "Vravel im: \"Nikoho netrápte, nikomu nekrivdite a buďte spokojní so\u00A0svojím žoldom!\"<br>" +
                            "Ľud žil v\u00A0očakávaní a všetci si o\u00A0Jánovi v\u00A0duchu mysleli, že azda on je Mesiáš. Ale Ján dal odpoveď všetkým: \"Ja vás krstím vodou. No prichádza mocnejší, ako som ja. Ja nie som hoden rozviazať mu remienok na\u00A0obuvi. On vás bude krstiť Duchom Svätým a ohňom. V\u00A0ruke má vejačku, aby si vyčistil humno a pšenicu zhromaždil do\u00A0svojej sýpky, ale plevy spáli v\u00A0neuhasiteľnom ohni.\"<br>" +
                            "A ešte všelijako ináč napomínal ľud a hlásal mu evanjelium.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"31", "1", "", "Mt 21, 23-27",
                    "Odkiaľ bol Jánov krst?",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Keď Ježiš prišiel do\u00A0chrámu a učil, pristúpili k\u00A0nemu veľkňazi a starší ľudu a pýtali sa: \"Akou mocou toto robíš? A kto ti dal túto moc?\"<br>" +
                            "Ježiš im povedal: \"Aj ja sa vás na\u00A0niečo spýtam. Ak mi odpoviete, i ja vám poviem, akou mocou toto robím. Odkiaľ bol Jánov krst? Z\u00A0neba, či od\u00A0ľudí?\"<br>" +
                            "Oni rozmýšľali a hovorili si: \"Ak povieme: ‚Z neba,' povie nám: ‚Prečo ste mu teda neuverili?' Ale ak povieme: ‚Od ľudí,' máme sa čo obávať zástupu, lebo Jána pokladajú všetci za\u00A0proroka.\"<br>" +
                            "Odpovedali teda Ježišovi: \"Nevieme.\"<br>" +
                            "A on im odvetil: \"Ani ja vám nepoviem, akou mocou toto robím.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"32", "2", "", "Mt 21, 28-32",
                    "Prišiel Ján a hriešnici mu uverili",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "Ježiš povedal veľkňazom a starším ľudu: \"Čo poviete na\u00A0toto? Istý človek mal dvoch synov. Prišiel k\u00A0prvému a povedal mu: ‚Syn môj, choď dnes pracovať do\u00A0vinice!' Ale on odpovedal: ‚Nechce sa mi.' No potom to oľutoval a šiel.<br>" +
                            "Išiel k\u00A0druhému a povedal mu to isté. Ten odpovedal: ‚Idem, pane!' Ale nešiel. Kto z\u00A0týchto dvoch splnil otcovu vôľu?\"<br>" +
                            "Odpovedali: \"Ten prvý.\"<br>" +
                            "Ježiš im povedal: \"Veru, hovorím vám: Mýtnici a neviestky vás predchádzajú do\u00A0Božieho kráľovstva. Lebo k\u00A0vám prišiel Ján cestou spravodlivosti, a neuverili ste mu. Ale mýtnici a neviestky mu uverili. A vy, hoci ste to videli, ani potom ste sa nekajali a neuverili ste mu.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"33", "3", "", "Lk 7, 19-23",
                    "Oznámte Jánovi, čo ste videli a počuli",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Ján si zavolal dvoch zo\u00A0svojich učeníkov a poslal ich k\u00A0Pánovi s\u00A0otázkou: \"Ty si ten, ktorý má prísť, alebo máme čakať iného?\"<br>" +
                            "Keď muži k\u00A0nemu prišli, povedali: \"Poslal nás k\u00A0tebe Ján Krstiteľ a pýta sa: ‚Ty si ten, ktorý má prísť, alebo máme čakať iného?'\"<br>" +
                            "Práve v\u00A0tú hodinu uzdravil mnohých z\u00A0neduhov, chorôb a od\u00A0zlých duchov a mnohým slepým daroval zrak. A tak im odpovedal: \"Choďte a oznámte Jánovi, čo ste videli a počuli: Slepí vidia, chromí chodia, malomocní sú čistí, hluchí počujú, mŕtvi vstávajú a chudobným sa hlása evanjelium. A blahoslavený je, kto sa na\u00A0mne nepohorší.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"34", "4", "", "Lk 7, 24-30",
                    "Ján je posol ktorý pripravuje cestu Pánovi",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "Keď Jánovi poslovia odišli, začal Ježiš hovoriť zástupom o\u00A0Jánovi: \"Čo ste vyšli na\u00A0púšť vidieť? Trstinu zmietanú vetrom?<br>" +
                            "Alebo čo ste vyšli vidieť? Človeka oblečeného do\u00A0jemných šiat? Veď tí, čo sa skvostne obliekajú a žijú v\u00A0rozkošiach, bývajú v\u00A0kráľovských domoch.<br>" +
                            "Teda čo ste vyšli vidieť? Proroka?<br>" +
                            "Áno, hovorím vám, viac ako proroka. Lebo to o\u00A0ňom je napísané: ‚Hľa, posielam svojho posla pred\u00A0tvojou tvárou a on pripraví cestu pred\u00A0tebou.'<br>" +
                            "Hovorím vám: Medzi tými, čo sa narodili zo\u00A0ženy, nie je nik väčší ako Ján. Ale ten, kto je v\u00A0Božom kráľovstve menší, je väčší ako on.\"<br>" +
                            "A všetok ľud, čo ho počúval, ba aj mýtnici uznali Božiu spravodlivosť, keď sa dali pokrstiť Jánovým krstom. Ale farizeji a zákonníci zmarili v\u00A0sebe Boží úmysel, lebo sa mu nedali pokrstiť.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"35", "5", "", "Jn 5, 33-36",
                    "Ján je lampa, ktorá horí a svieti",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jána<br>" +
                            "Ježiš povedal Židom: \"Vy ste poslali k\u00A0Jánovi a on vydal svedectvo pravde. Lenže ja neprijímam svedectvo od\u00A0človeka, ale toto hovorím preto, aby ste vy boli spasení. On bol lampa, ktorá horí a svieti, a vy ste sa chceli chvíľu veseliť v\u00A0jeho svetle.<br>" +
                            "Ja mám väčšie svedectvo, ako je Jánovo: skutky, ktoré mi dal vykonať Otec. Tieto skutky, ktoré konám, svedčia o\u00A0mne, že ma poslal Otec.\"<br>" +
                            "Počuli sme slovo Pánovo."},
            {"40", "A", "", "Mt 1, 18-24",
                    "Ježiš sa narodí z\u00A0Márie, zasnúbenej s\u00A0Jozefom, Dávidovým synom",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>" +
                            "S narodením Ježiša Krista to bolo takto: Jeho matka Mária bola zasnúbená s\u00A0Jozefom. Ale skôr, ako by boli začali spolu bývať, ukázalo sa, že počala z\u00A0Ducha Svätého.<br>" +
                            "Jozef, jej manžel, bol človek spravodlivý a nechcel ju vystaviť potupe, preto ju zamýšľal potajomky prepustiť.<br>" +
                            "Ako o\u00A0tom uvažoval, zjavil sa mu vo\u00A0sne Pánov anjel a povedal: \"Jozef, syn Dávidov, neboj sa prijať Máriu, svoju manželku, lebo to, čo sa v\u00A0nej počalo, je z\u00A0Ducha Svätého. Porodí syna a dáš mu meno Ježiš; lebo on vyslobodí svoj ľud z\u00A0hriechov.\"<br>" +
                            "To všetko sa stalo, aby sa splnilo, čo Pán povedal ústami proroka: \"Hľa, panna počne a porodí syna a dajú mu meno Emanuel,\" čo v\u00A0preklade znamená: Boh s\u00A0nami.<br>" +
                            "Keď sa Jozef prebudil, urobil, ako mu prikázal Pánov anjel, a prijal svoju manželku.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"40", "B", "", "Lk 1, 26-38",
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
            {"40", "C", "", "Lk 1, 39-45",
                    "Čím som si zaslúžila, že matka môjho Pána prichádza ku\u00A0mne?",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>" +
                            "V tých dňoch sa Mária vydala na\u00A0cestu a ponáhľala sa do\u00A0istého judejského mesta v\u00A0hornatom kraji. Vošla do\u00A0Zachariášovho domu a pozdravila Alžbetu. Len čo Alžbeta začula Máriin pozdrav, dieťa v\u00A0jej lone sa zachvelo a Alžbetu naplnil Duch Svätý. Vtedy zvolala veľkým hlasom: \"Požehnaná si medzi ženami a požehnaný je plod tvojho života. Čím som si zaslúžila, že matka môjho Pána prichádza ku\u00A0mne? Lebo len čo zaznel tvoj pozdrav v\u00A0mojich ušiach, radosťou sa zachvelo dieťa v\u00A0mojom lone. A blahoslavená je tá, ktorá uverila, že sa splní, čo jej povedal Pán.\"<br>" +
                            "Počuli sme slovo Pánovo."},
    };
}
