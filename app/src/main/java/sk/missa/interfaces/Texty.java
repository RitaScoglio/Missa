package sk.missa.interfaces;

/*
 * uvodnyPozdrav - formuly úvodného pozdravu celebranta
 * ukonKajucnosti - úkon kajúcnosti rozdelení na obdobia a významné sviatky
 * gloria_vypis - glória
 * kredo_vypis - krédo
 * modlitby - modlitby nad ľudom
 * modlitba_pana_text - modlitba Pána v obrade prijímania; strieda sa menší text s normálnym
 * obrad_pokoja_text - obrad pokoja v obrade prijímania; strieda sa menší text s normálnym
 * lamanie_chleba_text - lámanie chleba v obrade prijímania rozdelený na 3 časti podľa tichých modlitieb kňaza; strieda sa menší text s normálnym
 * sekvencia_vypis - sekvencie v poradí: Sedembolestnej Panny Márie; veľkonočná oktáva; Zoslanie Ducha Svätého; Najsvätejšieho Kristovho Tela a Krvi
 * vyrocie - texty na výročie posviacky chrámu
 * pozehnanie_Blazej - požehnanie hrdla na svaitok sv. Blažeja
 * popol - požehnanie popola a značenie popolom na popolcovú stredu
 * procesia - eucharistická procesia na slávnosť Najsvätejšieho Kristovho Tela a Krvi
 * slavnostne_pozehnanie - slávnostné požehnania rozdelené podľa období a významných sviatkov
 * postne_pozehnania - pozehnania v poste
 * ticheModlitby - tiché modlitby kňaza
 * prid_Duchu_svaty_tvorivy
 * teba_Boze_chvalime
 * ohlasenieVN - ohlasenie VN na Zjavenie Pana
 * prosby_rozlicne - prosby za zosnulých a rozličné potreby
 * tri_oblasti_modlitby_a_pripravy - Prosby pred návštevou pápeža
 */

public interface Texty {
    String uvodnyPozdrav = "<font color='#B71C1C'>Kňaz:</font>Milosť nášho Pána Ježiša Krista a láska Boha Otca i spoločenstvo Ducha Svätého nech je s vami všetkými.<br>" +
            "<font color='#B71C1C'>Ľud:</font> I s duchom tvojim.<br>" +
            "<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Milosť vám a pokoj od Boha, nášho Otca, i od Pána Ježiša Krista.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Nech je zvelebený Boh a Otec nášho Pána Ježiša Krista.<br>" +
            "<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Milosť a pokoj nech sú s vami všetkými vo svätej Božej Cirkvi.<br>" +
            "<font color='#B71C1C'>Ľud:</font> I s duchom tvojim.<br>" +
            "<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Milosť, milosrdenstvo a pokoj nášho Boha Otca i Ježiša Krista, nášho Spasiteľa, nech je s vami všetkými.<br>" +
            "<font color='#B71C1C'>Ľud:</font> I s duchom tvojim.<br>" +
            "<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Milosť vám a pokoj od Boha Otca a od Ježiša Krista, ktorý si vás zamiloval, a svojou krvou obmyl vás od hriechov.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Jemu sláva na veky vekov. Amen.<br>" +
            "<i>(alebo)</i><br>" +
            "<font color='#B71C1C'>Ľud:</font> Nech je zvelebený Boh a Otec nášho Pána Ježiša Krista.<br>" +
            "<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Milosť, milosrdenstvo a pokoj vám od Boha a od Ježiša Krista, jeho Syna a nášho Pána, v pravde a láske.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<i>(alebo)</i><br>" +
            "<font color='#B71C1C'>Ľud:</font> I s duchom tvojim.<br>" +
            "<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech vám Pán otvorí srdcia, aby ste poznali jeho zákon, nech vyslyší vaše prosby a nech vás zmieri so sebou a udelí vám svoj pokoj.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<i>(alebo)</i><br>" +
            "<font color='#B71C1C'>Ľud:</font> I s duchom tvojim.<br>" +
            "<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Milosť vám a pokoj od Boha, nášho Otca, i od Ježiša Krista, ktorý dal svoj život za naše hriechy.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Jemu sláva na veky vekov. Amen.<br>" +
            "<i>(alebo)</i><br>" +
            "<font color='#B71C1C'>Ľud:</font> I s duchom tvojim.";

    String[][] ukonKajucnosti = {
            {"Cezrok", "<font color='#B71C1C'>—</font> Ježišu, ty si prijal ľudskú prirodzenosť, aby si nás spasil: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si zomrel na kríži za všetkých ľudí: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si nám otvoril cestu do neba: Pane, zmiluj sa.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "<font color='#B71C1C'>—</font> Ježišu, ty si Dobrý pastier a poznáš svoje ovečky: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty hľadáš každú stratenú ovečku: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty nás vedieš na nebeské pastviny: Pane, zmiluj sa.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "<font color='#B71C1C'>—</font> Ježišu, ty si cesta, ktorá vedie k Otcovi: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si pravda, ktorá osvecuje ľudstvo: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si život, ktorý obnovuje celý svet: Pane, zmiluj sa.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "<font color='#B71C1C'>—</font> Pane Ježišu, ty máš slová života večného: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si tichý a pokorný srdcom: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si bol pre nás poslušný až na smrť na kríži: Pane, zmiluj sa.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "<font color='#B71C1C'>—</font> Ježišu, ty si odpustil plačúcemu Petrovi, ktorý ťa zaprel: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si prisľúbil nebeské kráľovstvo kajúcemu zločincovi na kríži: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si dal apoštolom Ducha Svätého, aby odpúšťali hriechy: Pane, zmiluj sa.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "<font color='#B71C1C'>—</font> Ježišu, ty si zomrel, aby každý, kto uverí v teba, mal život večný: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si prišiel na svet hľadať, čo sa stratilo: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si bol poslaný od Otca, nie aby si svet súdil, ale aby si ho spasil: Pane, zmiluj sa.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "<font color='#B71C1C'>—</font> Ježišu, ty si prišiel na svet zmieriť ľudí s nebeským Otcom: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si sa stal poslušným sluhom, aby si nás hriešnych urobil Božími deťmi: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty večne žiješ u Otca v jednote s Duchom Svätým, aby si sa za nás prihováral: Pane, zmiluj sa."},
            {"Advent", "<font color='#B71C1C'>—</font> Ježišu, ty prichádzaš volať nie spravodlivých, ale hriešnikov: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty nalomenú trstinu nedolomíš a hasnúci knôt nedohasíš: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Tvoje slovo nám dáva nádej a silu, prináša zľutovanie a lásku: Pane, zmiluj sa.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "<font color='#B71C1C'>—</font> Ježišu, ty si od večnosti Syn Boží: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si sa stal synom Panny Márie: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty oslobodzuješ človeka od viny a od zlého: Pane, zmiluj sa."},
            {"Vianoce", "<font color='#B71C1C'>—</font> Ty, večné Slovo nebeského Otca, stal si sa človekom: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si začiatkom nového života: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Skrze teba môže celé stvorenie nájsť pokoj v Bohu: Pane, zmiluj sa.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "<font color='#B71C1C'>—</font> Ježišu, ty si veľkým svetlom pre ľudstvo tápajúce v tmách: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si záchrancom svojho ľudu a splnením jeho nádejí: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> V tebe sa nám zjavila dobrota a láskavosť nášho nebeského Otca: Pane, zmiluj sa."},
            {"Pôst", "<font color='#B71C1C'>—</font> Ježišu, ty si žil ako človek, vo všetkom nám podobný okrem hriechu: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si v ťažkej hodine skúšky v Getsemanskej záhrade prijal vôľu nebeského Otca: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty nás dnes voláš, aby sme sa obrátili a nasledovali ťa: Pane, zmiluj sa.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "<font color='#B71C1C'>—</font> Ježišu, ty si prišiel medzi hriešnikov a priniesol si im Otcovo odpustenie: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si vydal seba samého na smrť, aby si hriešnikom dal život: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si prameňom božskej sily a nového života: Pane, zmiluj sa.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "<font color='#B71C1C'>—</font> Ježišu, ty si nás vo sviatosti krstu vyviedol z temnôt smrti na svetlo života: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si nám očistil duchovný zrak, aby sme mohli veriť: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty nás posilňuješ svojím slovom, aby sme podľa tvojho príkladu niesli svoj každodenný kríž a dosiahli slávu vzkriesenia: Pane, zmiluj sa."},
            {"Veľká noc", "<font color='#B71C1C'>—</font> Pane Ježišu, ty si svojou smrťou premohol našu smrť: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si vstal z mŕtvych, aby sme večne žili: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> V tvojom mene dosiahneme odpustenie svojich hriechov: Pane, zmiluj sa.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "<font color='#B71C1C'>—</font> Ježišu, ty si kráľ pokoja: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si nádej pochybujúcich: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si radosť veriacich: Pane, zmiluj sa."},
            {"NA SLÁVNOSŤ ZJAVENIA PÁNA", "<font color='#B71C1C'>—</font> Ježišu, ty si kráľ všetkých národov: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si pravda a cesta všetkých, čo ťa hľadajú: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si radosť a odmena všetkých veriacich: Pane, zmiluj sa."},
            {"NA SLÁVNOSŤ NANEBOVSTÚPENIA PÁNA","<font color='#B71C1C'>—</font> Ježišu, ty si verne vykonal dielo, ktoré ti Otec zveril: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si nám svojím nanebovstúpením dal dôkaz o Božej vernosti a láske: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si nám prisľúbil Ducha Svätého, ktorý nás posilňuje: Pane, zmiluj sa."},
            {"NA TURÍCE", "<font color='#B71C1C'>—</font> Pane Ježišu, Duch Svätý nám ukázal, že ty si vyvolený Boží: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si prisľúbil dary Ducha Svätého všetkým, čo budú svedčiť o tvojej pravde: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Svojím slovom nás poučuješ, aby sme vyznávali jedného Boha v troch osobách: Pane, zmiluj sa."},
            {"NA MARIÁNSKE SVIATKY", "<font color='#B71C1C'>—</font> Pane Ježišu, tvoja matka Mária bola nepoškvrnená nad nami hriešnymi: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Tvoja matka ťa s láskou prijala, sprevádzala ťa na životnej ceste a verne stála pod krížom, keď si za nás umieral: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Svoju matku si vzal do neba, aby bola našou kráľovnou a orodovníčkou: Pane, zmiluj sa."},
            {"ZA ZOSNULÝCH", "<font color='#B71C1C'>—</font> Pane Ježišu, ty si nám ukázal cestu k Otcovi: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si svojou smrťou daroval svetu život: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si nám pripravil v dome svojho Otca príbytok:<br>" +
                    "<font color='#B71C1C'>—</font> Pane, zmiluj sa.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "<font color='#B71C1C'>—</font> Pane Ježišu, ty si sa stal človekom, aby si nám dal účasť na Božom živote: Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si zomrel na kríži, aby si nám otvoril bránu večného života: Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>—</font> Ty si vstal z mŕtvych, aby sme večne žili pre teba: Pane, zmiluj sa."},
    };

    String gloria_vypis = "Sláva Bohu na výsostiach\n" +
            "a na zemi pokoj ľuďom dobrej vôle.\n" +
            "Chválime ťa, velebíme ťa,\n" +
            "klaniame sa ti, oslavujeme ťa,\n" +
            "vzdávame ti vďaky, lebo veľká je sláva tvoja.\n" +
            "Pane Bože, Kráľ nebeský,\n" +
            "Boh Otec všemohúci.\n" +
            "Pane, Ježišu Kriste, ty jednorodený syn,\n" +
            "Pán a Boh, Baránok Boží, Syn Otca.\n" +
            "Ty snímaš hriechy sveta, zmiluj sa nad nami,\n" +
            "ty snímaš hriechy sveta, prijmi našu úpenlivú prosbu.\n" +
            "Ty sedíš po pravici Otca, zmiluj sa nad nami.\n" +
            "Veď len ty si Svätý, len ty si Pán,\n" +
            "len ty si Najvyšší, Ježišu Kriste,\n" +
            "s Duchom Svätým v sláve Boha Otca.\n" +
            "Amen.";

    String kredo_vypis = "Verím v jedného Boha,\n" +
            "Otca všemohúceho,\n" +
            "Stvoriteľa neba i zeme,\n" +
            "sveta viditeľného i neviditeľného.\n" +
            "Verím v jedného Pána Ježiša Krista,\n" +
            "jednorodeného Syna Božieho,\n" +
            "zrodeného z Otca pred všetkými vekmi;\n" +
            "Boha z Boha, Svetlo zo Svetla,\n" +
            "pravého Boha z Boha pravého,\n" +
            "splodeného, nie stvoreného,\n" +
            "jednej podstaty s Otcom:\n" +
            "skrze neho bolo všetko stvorené.\n" +
            "On pre nás ľudí a pre našu spásu\n" +
            "zostúpil z nebies.\n" +
            "A mocou Ducha Svätého\n" +
            "vzal si telo z Márie Panny\n" +
            "a stal sa človekom.\n" +
            "Za nás bol aj ukrižovaný\n" +
            "za vlády Poncia Piláta,\n" +
            "bol umučený a pochovaný,\n" +
            "ale tretieho dňa vstal z mŕtvych podľa Svätého písma.\n" +
            "A vystúpil do neba,\n" +
            "sedí po pravici Otca.\n" +
            "A zasa príde v sláve súdiť živých i mŕtvych\n" +
            "a jeho kráľovstvu nebude konca.\n" +
            "Verím v Ducha Svätého,\n" +
            "Pána a Oživovateľa,\n" +
            "ktorý vychádza z Otca i Syna.\n" +
            "Jemu sa zároveň vzdáva\n" +
            "tá istá poklona a sláva ako Otcovi a Synovi.\n" +
            "On hovoril ústami prorokov.\n" +
            "Verím v jednu, svätú, katolícku, apoštolskú Cirkev.\n" +
            "Vyznávam jeden krst na odpustenie hriechov \n" +
            "a očakávam vzkriesenie mŕtvych\n" +
            "a život budúceho veku.\n" +
            "Amen.";

    String[] modlitby_nad_ludom = {"", "Uvedené formuly slávnostných požehnaní môže kňaz použiť podľa vlastného uváženia na konci svätej omše alebo liturgie slova, na konci liturgie hodín alebo po vysluhovaní sviatostí.\n" +
            "Diakon alebo, ak ho niet, sám kňaz, prednesie výzvu: ",
            "<m>Skloňte sa na požehnanie. ",
            "alebo: ",
            "<m>Prijmite slávnostné požehnanie.",
            "Potom kňaz vystrie ruky nad ľud a prednesie formulu požehnania. Všetci odpovedia: ",
            "<m>Amen. ",
            "Po modlitbe kňaz vždy dodá: ",
            "<m> A požehnanie všemohúceho Boha, Otca i Syna ", "+ ", "<m>i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami. ",
            "Ľud odpovie: ",
            "<m>Amen.\n", "",
            "<br><font color='#B71C1C'>1.<br>" +
                    "Kňaz:</font> Pane, zľutuj sa nad svojím ľudom a nenechaj ho bez útechy na pozemskej púti, veď ho povolávaš k večnej radosti v nebi. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>2.<br>" +
                    "Kňaz:</font> Pane, daj, prosíme, aby kresťanský ľud poznal pravdy, ktoré vyznáva, a miloval nebeskú liturgiu, na ktorej sa zúčastňuje. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>3.<br>" +
                    "Kňaz:</font> Pane, daj, nech tvoj ľud prijme dar svätého požehnania, pomocou ktorého odmietne všetko škodlivé a získa to, po čom túži. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>4.<br>" +
                    "Kňaz:</font>Pane, prosíme, obráť k sebe srdcia svojho ľudu, veď ty ochraňuješ aj tých, čo sa stratili, ale keď ti slúžia s nerozdeleným srdcom, posilňuješ ich väčšou láskou. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>5.<br>" +
                    "Kňaz:</font> Pane, prosíme, láskavo osvieť rodinu svojich veriacich, aby sa pridržiavali toho, čo sa ti páči, a tak mohli konať dobré skutky. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>6.<br>" +
                    "Kňaz:</font> Pane, láskavo udeľ svojim veriacim odpustenie a pokoj, aby boli očistení od všetkých previnení a mohli ti slúžiť s pokojným srdcom. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>7.<br>" +
                    "Kňaz:</font> Pane, prosíme ťa, nech tvoja nebeská priazeň rozmnožuje počet tvojho ľudu a nech mu pomáha vždy zachovávať tvoje príkazy. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>8.<br>" +
                    "Kňaz:</font> Bože, stoj pri svojom ľude, aby, oslobodený od všetkého zla, mohol ti slúžiť s celým srdcom a vždy pevne stál pod tvojou ochranou. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>9.<br>" +
                    "Kňaz:</font> Bože, nech sa rodina tvojich veriacich vždy raduje z tajomstiev svojho vykúpenia, ktoré sme slávili, a nech stále nadobúda dary, ktoré z nich prúdia. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>10.<br>" +
                    "Kňaz:</font> Pane, Bože, obdaruj svojich služobníkov bohatstvom svojho milosrdenstva a pokojom, aby boli posilnení tvojím požehnaním a neustále ťa s radosťou zvelebovali a vzdávali ti vďaky. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>11.<br>" +
                    "Kňaz:</font> Pane, prosíme ťa, neustále ochraňuj rodinu svojich veriacich, aby pod tvojou ochranou boli oslobodení od všetkého zla a dobrými skutkami dokazovali oddanosť tvojmu menu. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>12.<br>" +
                    "Kňaz:</font> Pane, prosíme ťa, očisť srdcia i mysle svojich veriacich, aby boli vnímaví na tvoje vnuknutia, chránili sa hriešnych príležitostí a vždy boli naplnení tvojou radosťou. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>13.<br>" +
                    "Kňaz:</font> Pane, pomáhaj svojim veriacim svätým požehnaním, a tak priprav ich srdcia, aby boli vo všetkých svojich dielach posilňovaní silou tvojej lásky. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>14.<br>" +
                    "Kňaz:</font> Srdcia veriacich, oddané tvojmu menu, prosia ťa o pomoc, Pane; a keďže bez teba nemôžu urobiť nič dobré, zahrň ich svojím hojným milosrdenstvom, aby poznali, čo je správne, a mali silu konať dobro. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>15.<br>" +
                    "Kňaz:</font> Pane, prosíme ťa, pomáhaj svojmu veriacemu ľudu, ktorý k tebe volá, a láskavo ho posilni v jeho ľudskej slabosti, aby ťa uctieval s úprimným srdcom a radoval sa z tvojej pomoci v tomto i v budúcom živote. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>16.<br>" +
                    "Kňaz:</font> Pane, láskavo zhliadni na prosiacu rodinu svojich veriacich a naplň nás svojím nekonečným milosrdenstvom, lebo bez neho nemôžeme urobiť nič, čo by sa ti páčilo, a len skrze neho môžeme zachovávať tvoje spásne príkazy. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>17.<br>" +
                    "Kňaz:</font> Pane, rozmnož vo svojich veriacich nebeskú milosť, aby ťa chválili perami, dušou i životom, a keďže naše bytie je tvojím darom, nech celé naše životy patria tebe. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>18.<br>" +
                    "Kňaz:</font> Pane, prosíme, usmerňuj svoj ľud nebeskými príkazmi, nech sa vyhýba všetkému zlu a nasleduje všetko dobré, aby nezískal tvoje odsúdenie, ale nekonečné milosrdenstvo. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>19.<br>" +
                    "Kňaz:</font> Pane, stoj pri tých, čo ťa prosia, a ochraňuj tých, čo svoju nádej vkladajú do tvojho milosrdenstva, aby zostali verní vo svätosti života, nadobudli všetky potrebné pozemské dobrá a boli dedičmi tvojich prísľubov vo večnosti. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>20.<br>" +
                    "Kňaz:</font> Pane, zahrň svojou milosťou svoj ľud, ktorý k tebe volá, a keďže si ho ako Stvoriteľ utvoril a ako Vykupiteľ obnovil, nech je v tvojom nepretržitom diele spasený. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>21.<br>" +
                    "Kňaz:</font> Pane, prosíme ťa, nech tvoj veriaci ľud vždy odpovedá na výzvy tvojej lásky a pobádaný spásnym vnuknutím nech s radosťou zachováva, čo prikazuješ, aby dosiahol, čo sľubuješ. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>22.<br>" +
                    "Kňaz:</font> Pane, prosíme ťa, nech slabosť tvojho milovaného ľudu vzbudí v tebe lásku a jeho vytrvalá prosba vzbudí tvoje milosrdenstvo, aby to, čo si nezaslúži skutkami, získal tvojím bohatým milosrdenstvom. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>23.<br>" +
                    "Kňaz:</font> Pane, prosíme ťa, vystri svoju vznešenú pravicu na ochranu svojich synov a dcér, aby v poslušnosti tvojej otcovskej vôli boli posilnení ochranou tvojej trvalej lásky. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>24.<br>" +
                    "Kňaz:</font> Pane, zhliadni na prosby rodiny svojich veriacich a poskytni im pomoc, o ktorú pokorne prosia, aby takto posilnení vytrvali vo vyznávaní tvojho mena. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>"+
                    "<br><font color='#B71C1C'>25.<br>" +
                    "Kňaz:</font> Pane, prosíme ťa, ochraňuj rodinu svojich veriacich a zahrň ju bohatstvom svojho milosrdenstva, aby stále rástla pomocou nebeského učenia a darov. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>26.<br>" +
                    "Kňaz:</font> Pane, prosíme ťa, nech sa tvoj veriaci ľud raduje pod ochranou tvojej pravice, nech napreduje v kresťanskom živote a nech sa teší z dobier terajšieho i budúceho života. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>NA SVIATKY SVÄTÝCH<br>" +
                    "<br>27.<br>" +
                    "Kňaz:</font> Pane, nech kresťanský ľud jasá pri oslave obdivuhodných členov tajomného tela tvojho Syna, a keď v deň ich sviatku potvrdzuje svoju oddanosť tebe, nech získa podiel na ich večnosti a spolu s nimi sa raduje z tvojej slávy. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
                    "<br><font color='#B71C1C'>28.<br>" +
                    "Kňaz:</font> Pane, prosíme ťa, neustále obracaj k sebe srdcia svojho ľudu, a keďže mu dávaš na pomoc takých veľkých orodovníkov, veď ho vždy pod svojou stálou ochranou. " +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľud:</font> Amen."};

    String[] modlitba_pana_text = {"Modlitba Pána",
            "Kňaz položí kalich a paténu, zopne ruky a povie:",
            "Na príkaz nášho Spasiteľa a podľa jeho božského učenia osmeľujeme sa povedať:",
            "BAR", "",
            "Iné výzvy k modlitbe Pána:",
            "A teraz spoločne prosme nebeského Otca a modlime sa, ako nás naučil náš Pán Ježiš Kristus:",
            "Alebo:",
            "Prijali sme Ducha Svätého, v ktorom sme sa stali Božími deťmi; preto sa osmeľujeme povedať:",
            "BAR", "",
            "Rozopne ruky a spolu s ľudom pokračuje:",
            "Otče náš, ktorý si na nebesiach,\n" +
                    "posväť sa meno tvoje,\n" +
                    "príď kráľovstvo tvoje,\n" +
                    "buď vôľa tvoja ako v nebi, tak i na zemi.\n" +
                    "Chlieb náš každodenný daj nám dnes\n" +
                    "a odpusť nám naše viny,\n" +
                    "ako i my odpúšťame svojim vinníkom,\n" +
                    "a neuveď nás do pokušenia,\n" +
                    "ale zbav nás zlého.\n",
            "Ďalej pokračuje iba kňaz s rozopätými rukami:",
            "Prosíme ťa, Pane, zbav nás všetkého zla,\n" +
                    "udeľ svoj pokoj našim dňom\n" +
                    "a príď nám milosrdne na pomoc,\n" +
                    "aby sme boli vždy uchránení pred hriechom\n" +
                    "a pred každým nepokojom,\n" +
                    "kým očakávame blaženú nádej\n" +
                    "a príchod nášho Spasiteľa Ježiša Krista.",
            "Zopne ruky.\n" +
                    "Ľud zakľúči modlitbu zvolaním:",
            "Lebo tvoje je kráľovstvo a moc i sláva naveky."};


    String[] obrad_pokoja_text = {"Obrad pokoja",
            "Potom kňaz s rozopätými rukami nahlas hovorí:",
            "Pane Ježišu Kriste,\n" +
                    "ty si povedal svojim apoštolom:\n" +
                    "Pokoj vám zanechávam,\n" +
                    "svoj pokoj vám dávam.\n" +
                    "Nehľaď na naše hriechy,\n" +
                    "ale na vieru svojej Cirkvi\n" +
                    "a podľa svojej vôle jej milostivo\n" +
                    "daruj pokoj a jednotu,",
            "Zopne ruky.",
            "lebo ty žiješ a kraľuješ na veky vekov.",
            "Ľud odpovie:",
            "Amen.",
            "Kňaz, obrátený tvárou k ľudu, rozopne a znova zloží ruky, pričom hovorí:",
            "Pokoj Pánov nech je vždy s vami.",
            "Ľud odpovie:",
            "I s duchom tvojím.",
            "Potom diakon alebo kňaz prípadne dodá:",
            "Dajte si znak pokoja.",
            "Ľud zvolá:",
            "Pokoj a bratská láska nech je medzi nami.",
            "A podajú si ruky s najbližšie stojacimi ako znak pokoja, spoločenstva a lásky; kňaz dá znak pokoja diakonovi alebo posluhujúcemu.", null};

    String[] lamanie_chleba_text = {"Lámanie chleba",
            "Potom kňaz vezme hostiu, rozlomí ju nad paténou a kúsok hostie vpustí do kalicha, pričom potichu hovorí:",
            "Toto zmiešanie Tela a Krvi nášho Pána Ježiša Krista nech nám prijímajúcim osoží pre večný život.",
            "Medzitým sa spieva alebo recituje:",
            "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n" +
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n" +
                    "Baránok Boží, ty snímaš hriechy sveta: daruj nám pokoj.",
            "Ak lámanie chleba trvá dlhšie, možno toto zvolanie opakovať viackrát. Len posledné zvolanie sa zakončí slovami: daruj nám pokoj.\n" +
                    "Potom kňaz so zopätými rukami potichu hovorí:\n",
            "Pane Ježišu Kriste, Syn Boha živého,\n" +
                    "ty si z vôle Otca\n" +
                    "a za spoluúčinkovania Ducha Svätého\n" +
                    "svojou smrťou oživil svet.\n" +
                    "Skrze svoje presväté Telo a Krv osloboď ma\n" +
                    "od všetkých mojich neprávostí a od každého zla.\n" +
                    "Daj, aby som sa vždy pridržiaval tvojich prikázaní,\n" +
                    "a nikdy nedopusť, aby som sa odlúčil od teba.",
            "Alebo:",
            "Pane Ježišu Kriste,\n" +
                    "nech mi prijatie tvojho Tela a Krvi\n" +
                    "neslúži na odsúdenie a zatratenie,\n" +
                    "ale pre tvoju dobrotu\n" +
                    "nech mi ochraňuje a uzdravuje dušu i telo.",
            "Kňaz pokľakne, vezme hostiu, drží ju trocha pozdvihnutú nad paténou alebo nad kalichom a obrátený k ľudu nahlas hovorí:",
            "Hľa, Baránok Boží, ktorý sníma hriechy sveta.\n" +
                    "Blažení tí, čo sú pozvaní na hostinu Baránkovu.",
            "A spolu s ľudom raz povie:",
            "Pane, nie som hoden, aby si vošiel pod moju strechu, ale povedz iba slovo a duša mi ozdravie."
    };

    String[] sekvencia_vypis = {"<font color='#B71C1C'>Nie je záväzná, možno ju predniesť celú alebo len od slov * Svätá Matka, Krista rany.</font><br>" +
            "Stála Matka bolestivá<br>" +
            "vedľa kríža ľútostivá,<br>" +
            "keď na ňom Syn milý pnel.<br>" +
            "Ach, tej Matke prežalostnej,<br>" +
            "zarmútenej a bolestnej<br>" +
            "sedmorý meč v duši tkvel.<br>" +
            "Ó, jak smutná, doráňaná<br>" +
            "bola ona požehnaná<br>" +
            "Matka Syna Božieho.<br>" +
            "Jak plakala a trpela<br>" +
            "svätá Matka, keď videla<br>" +
            "muky Syna milého.<br>" +
            "Ktože by z nás nezaplakal,<br>" +
            "keby videl, bolesť aká<br>" +
            "je v jej srdci nevinnom.<br>" +
            "Kto by nebol rozžialený,<br>" +
            "pozorujúc bolesť Ženy,<br>" +
            "ako trpí so Synom.<br>" +
            "Pre hriech ľudu bezbožného<br>" +
            "vidí Syna mučeného,<br>" +
            "jak ho človek zbičoval.<br>" +
            "Vidí, ako Syn milený<br>" +
            "dokonáva opustený;<br>" +
            "dušu Otcu odovzdal.<br>" +
            "Ó, ty, Matka, žriedlo lásky,<br>" +
            "nech prežívam bôľ tvoj ťažký<br>" +
            "a nech s tebou nariekam!<br>" +
            "Nech mi srdce láskou planie<br>" +
            "ku Kristovi neprestajne,<br>" +
            "veď on je môj Boh a Pán.<br>" +
            "<font color='#B71C1C'>*</font> Svätá Matka, Krista rany,<br>" +
            "ktorými bol doráňaný,<br>" +
            "hlboko mi v srdce vtlač.<br>" +
            "Na bolestiach Syna tvojho,<br>" +
            "za mňa z lásky trpiaceho,<br>" +
            "nech mám podiel, v srdci plač.<br>" +
            "Daj, nech s tebou plačem, kvílim<br>" +
            "a nech s Kristom spolucítim,<br>" +
            "kým len tuná budem žiť.<br>" +
            "Pod krížom stáť s tebou túžim,<br>" +
            "k tebe v žiali sa pridružím<br>" +
            "a chcem s tebou žalostiť.<br>" +
            "Panna panien prevznešená,<br>" +
            "aj pre mňa si zúbožená,<br>" +
            "preto s tebou nariekam.<br>" +
            "Daj, nech Kristovu smrť nosím<br>" +
            "a na kríži účasť prosím,<br>" +
            "rany jeho uctievam.<br>" +
            "Raň ma bôľmi Krista Pána,<br>" +
            "svätým krížom opoj aj mňa<br>" +
            "aj krvou Nevinného.<br>" +
            "A pred večným ohňom chráň ma,<br>" +
            "pomáhaj mi, svätá Panna,<br>" +
            "v deň súdu posledného.<br>" +
            "Nech je mi kríž útočišťom,<br>" +
            "Kristova smrť – život s Kristom;<br>" +
            "vyprosuj mi milosti.<br>" +
            "A keď moje telo skoná,<br>" +
            "daj, nech moja duša spozná<br>" +
            "život rajskej radosti. Amen.",
            "<font color='#B71C1C'>Vo Veľkonočnú nedeľu je povinná; v dňoch cez oktávu podľa ľubovôle.</font><br><br>" +
                    "Obeť svoju veľkonočnú oslavujme, kresťania,<br>" +
                    "Pán za nás dal krv nevinnú; chváľme ho bez prestania.<br><br>" +
                    "Ovce našiel už Baránok, nás, ovečky stratené;<br>" +
                    "zmieril nás so svojím Otcom, hriechy sú nám zhladené.<br><br>" +
                    "Súboj divný viedli spolu život i smrť ukrutná;<br>" +
                    "Pán života mrie i vstáva, smrť nás už viac nesputná.<br><br>" +
                    "Povedzže nám, ó, Mária, čos' videla na ceste?<br>" +
                    "Hrob som zrela oslávený, kameň nebol na mieste.<br><br>" +
                    "Videla som svedkov z neba, na kameni sedeli;<br>" +
                    "plachtu, v ktorej Pán bol v hrobe, skladali už anjeli.<br><br>" +
                    "Vstal Pán, Kristus, nádej moja! Čuj a plesaj, ó, svete!<br>" +
                    "Náhlite do Galiley, tam ho aj vy uzriete.<br><br>" +
                    "Vieme, že Pán z mŕtvych už vstal, Kristus náš, aleluja.<br>" +
                    "Milostivý buď, Kráľ Kristus! Sláva ti, aleluja.",
            "Duchu Svätý, príď z neba<br>" +
                    "a vyšli nám zo seba<br>" +
                    "žiaru svetla pravého.<br><br>" +
                    "Príď k nám, Otče chudobných,<br>" +
                    "Darca darov sľúbených,<br>" +
                    "svetlo srdca bôľneho.<br><br>" +
                    "Tešiteľ si najlepší,<br>" +
                    "ó, hosť duše najsladší,<br>" +
                    "ty sladké občerstvenie.<br><br>" +
                    "V práci si poľahčenie,<br>" +
                    "v sparne si ovlaženie,<br>" +
                    "v plači si potešenie.<br><br>" +
                    "Svetlo oblažujúce,<br>" +
                    "naplň myseľ aj srdce<br>" +
                    "ľudu tebe verného.<br><br>" +
                    "Bez pomocnej milosti<br>" +
                    "človek žije v hriešnosti,<br>" +
                    "nie je v ňom nič dobrého.<br><br>" +
                    "Očisť, čo je skalené,<br>" +
                    "zavlaž, čo je znavené,<br>" +
                    "uzdrav, čo je zranené.<br><br>" +
                    "Ohni, čo je stŕpnuté,<br>" +
                    "zohrej, čo je skrehnuté,<br>" +
                    "naprav, čo je zblúdené.<br><br>" +
                    "Daruj svojim veriacim,<br>" +
                    "s dôverou ťa prosiacim,<br>" +
                    "svätú milosť sedmorú.<br><br>" +
                    "Daj za čnosti odmenu,<br>" +
                    "daj smrť dobrú, blaženú,<br>" +
                    "daj nám radosť trvalú.",
            "<font color='#B71C1C'>Nasledujúca sekvencia – nie je prikázaná – možno spievať celú, alebo od slov *</font> Hľa, chlieb z neba.<br><br>" +
                    "Chváľ, Sione, Spasiteľa,<br>" +
                    "chváľ Pastiera, Živiteľa,<br>" +
                    "v hymnách, piesňach hlas svoj zvýš.<br><br>" +
                    "Koľko máš síl, toľko snaž sa:<br>" +
                    "tak je veľká jeho krása,<br>" +
                    "že ju chváliť nestačíš.<br><br>" +
                    "Živý chlieb, čo život dáva,<br>" +
                    "dnes naozaj podľa práva<br>" +
                    "ospevovať treba nám.<br><br>" +
                    "Ten chlieb nad večerným stolom<br>" +
                    "lámal dvanásť apoštolom<br>" +
                    "skutočne náš drahý Pán.<br><br>" +
                    "Buď mu chvála, plná, jasná,<br>" +
                    "slávnosť príjemná a krásna,<br>" +
                    "v srdci vrúcne plesanie.<br><br>" +
                    "Nech dnes prvé stolovanie,<br>" +
                    "čo si ustanovil, Pane,<br>" +
                    "úctu od nás dostane.<br><br>" +
                    "Hostina nového Kráľa<br>" +
                    "Baránka nám darovala;<br>" +
                    "koniec starej slávnosti.<br><br>" +
                    "Po starých, hľa, nové časy,<br>" +
                    "pravda tôňu iste zhasí,<br>" +
                    "svetlo noc von vyhostí.<br><br>" +
                    "Čo sám Kristus obetoval,<br>" +
                    "chcel, by kňaz vždy obnovoval<br>" +
                    "na pamiatku jeho rán.<br><br>" +
                    "Tak sme Cirkvou poučení,<br>" +
                    "že sa chlieb a víno zmení<br>" +
                    "na obetu spásy nám.<br><br>" +
                    "Kresťanom sa veriť dáva,<br>" +
                    "že sa z chleba telo stáva,<br>" +
                    "víno sa v krv zmeňuje.<br><br>" +
                    "Čo zrak nezrie, nevie hlava,<br>" +
                    "overí nám viera pravá,<br>" +
                    "čo moc vecí zvyšuje.<br><br>" +
                    "Rozličnými pod spôsobmi,<br>" +
                    "znakmi, nie však podstatami<br>" +
                    "ukrytý je pravý Boh.<br><br>" +
                    "Telo je sa, krv sa pije:<br>" +
                    "Kristus celý stále žije<br>" +
                    "v obidvoch tých spôsoboch.<br><br>" +
                    "Ak ho prijmeš, vždy je celý,<br>" +
                    "neláme sa, nerozdelí,<br>" +
                    "celý sa vždy požíva.<br><br>" +
                    "Tisíce ho prijímajú,<br>" +
                    "však celého všetci majú,<br>" +
                    "z celku sa neodníma.<br><br>" +
                    "Dobrí aj zlí prijímajú,<br>" +
                    "nerovnaký údel majú:<br>" +
                    "život, buď odsúdenie.<br><br>" +
                    "Život dobrým, smrť zas hriešnym;<br>" +
                    "hľa, jak účinok rozličný<br>" +
                    "pôsobí prijímanie.<br><br>" +
                    "Keď sa chlieb sviatostný láme,<br>" +
                    "v každej časti požívame<br>" +
                    "telo Pána v celosti.<br><br>" +
                    "Podstata je nezmenená,<br>" +
                    "len v znaku je táto zmena;<br>" +
                    "zostáva moc sviatosti.<br><br>" +
                    "* Hľa, chlieb z neba, chlieb anjelov,<br>" +
                    "stal sa ľuďom živým chlebom,<br>" +
                    "nedajme ho zneuctiť.<br><br>" +
                    "Zobrazený v Izákovi,<br>" +
                    "spodobený v baránkovi,<br>" +
                    "v manne danej na púšti.<br><br>" +
                    "Pastier dobrý, chlieb náš pravý,<br>" +
                    "zmiluj sa, ó, preláskavý<br>" +
                    "Ježiš, pas nás, chráň nás v zdraví,<br>" +
                    "vezmi si nás do výšavy,<br>" +
                    "nech tiež zrieme zem živých.<br><br>" +
                    "Všetko vieš a možné je ti:<br>" +
                    "tu nás pasieš, svoje deti;<br>" +
                    "tam nech stoluje a sedí<br>" +
                    "každý z nás jak dedič svätý,<br>" +
                    "brat občanov blažených.",
    };

    String[] vyrocie = {"Iz 56, 1. 6-7",
            "Cudzincov privediem na svoj svätý vrch",
            "Čítanie z Knihy proroka Izaiáša<br>" +
                    "Toto hovorí Pán: \"Zachovajte právo, konajte spravodlivo, lebo je blízko moja spása, už príde, aj moja spravodlivosť, už sa zjaví.<br>" +
                    "A cudzincov, čo sa vinú k Pánovi, čo si ho ctia, čo milujú jeho meno a čo mu slúžia, všetkých, čo zachovávajú sobotu bez znesvätenia a pridŕžajú sa mojej zmluvy, privediem na svoj svätý vrch a naplním ich radosťou v mojom dome modlitby. Ich žertvy a ich obety mi budú potešením na mojom oltári; veď môj dom sa bude volať domom modlitby pre všetky národy. \"<br>" +
                    "Počuli sme Božie slovo.",
            "Alebo:",
            "1 Kor 3, 9c-11. 16-17",
            "Ste Boží chrám",
            "Čítanie z Prvého listu svätého apoštola Pavla Korinťanom<br>" +
                    "Bratia, vy ste Božia stavba. <br>" +
                    "Podľa Božej milosti, ktorú som dostal, položil som ako múdry staviteľ základ a iný na ňom stavia. Ale každý nech si dáva pozor, ako na ňom stavia. Lebo nik nemôže položiť iný základ okrem toho, čo je už položený, a je ním Ježiš Kristus.<br>" +
                    "Neviete že ste Boží chrám a že vo vás prebýva Boží Duch? Kto by teda Boží chrám zničil, toho Boh zničí. Lebo Boží chrám je svätý – a ním ste vy.<br>" +
                    "Počuli sme Božie slovo.",
            "Ž 84, 3. 4. 5+10. 11",
            "<font color='#B71C1C'>R.:</font> Hľa, Boží stánok je medzi ľuďmi!<br><br>" +
                    "Túži a zmiera moja duša <font color='#B71C1C'>*</font><br>" +
                    "po nádvoriach Pánových.<br>" +
                    "Moje srdce i moje telo <font color='#B71C1C'>*</font><br>" +
                    "vznášajú sa k Bohu živému.<font color='#B71C1C'> – R.</font><br>" +
                    "Veď aj vrabec si nájde príbytok <font color='#B71C1C'>*</font><br>" +
                    "a lastovička hniezdo, kde vkladá svoje mláďatá:<br>" +
                    "tvoje oltáre, Pane zástupov, <font color='#B71C1C'>*</font><br>" +
                    "môj kráľ a môj Boh.<font color='#B71C1C'> – R.</font><br>" +
                    "Blažení tí, čo bývajú v tvojom dome <font color='#B71C1C'>*</font><br>" +
                    "a bez prestania ťa velebia.<br>" +
                    "Bože, náš ochranca, pohliadni <font color='#B71C1C'>*</font><br>" +
                    "a pozri na tvár svojho pomazaného. <font color='#B71C1C'> – R.</font><br>" +
                    "Jeden deň v tvojich nádvoriach je lepší <font color='#B71C1C'>*</font><br>" +
                    "než iných tisíce.<br>" +
                    "Radšej chcem stáť na prahu domu svojho Boha <font color='#B71C1C'>*</font><br>" +
                    "ako prebývať v stanoch hriešnikov.<font color='#B71C1C'> – R.</font>",
            "2 Krn 7, 16",
            "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vyvolil som si toto miesto a posvätil som ho, hovorí Pán; aby tam bolo moje meno naveky. <font color='#B71C1C'>– R.</font> Aleluja.",
            "Jn 2, 13-22",
            "Hovoril o chráme svojho tela",
            "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Jana<br>" +
                    "Blízko bola židovská Veľká noc a Ježiš vystúpil do Jeruzalema.<br>" +
                    "V chráme našiel predavačov dobytka, oviec a holubov i peňazomencov, čo tam sedeli. Urobil si z povrázkov bič a všetkých vyhnal z chrámu, aj ovce a dobytok. Peňazomencom rozhádzal peniaze a poprevracal stoly a predavačom holubov povedal: \"Odneste to odtiaľto! Nerobte z domu môjho Otca tržnicu!\"<br>" +
                    "Jeho učeníci si spomenuli, že je napísané: \"Strávi ma horlivosť za tvoj dom.\"<br>" +
                    "Židia sa ho opýtali: \"Aké znamenie nám ukážeš, že môžeš toto robiť? \"<br>" +
                    "Ježiš im odpovedal: \"Zborte tento chrám a za tri dni ho postavím. \"<br>" +
                    "Židia povedali: \"Štyridsaťšesť rokov stavali tento chrám a ty ho postavíš za tri dni?\"<br>" +
                    "Ale on hovoril o chráme svojho tela.<br>" +
                    "Keď potom vstal z mŕtvych, jeho učeníci si spomenuli, že toto hovoril, a uverili Písmu i slovu, ktoré povedal Ježiš. <br>" +
                    "Počuli sme slovo Pánovo."
    };

    String[] pozehnanie_Blazej = {
            "Požehnanie hrdla je azda najrozšírenejším požehnaním, ktoré sa spája s týmto svätým biskupom a mučeníkom, ktorý bol podľa tradície lekárom a pomáhal ľuďom pri liečení chorôb. Je uctievaný ako ochranca pred chorobami hrdla.\n" +
                    "Požehnanie sa udeľuje individuálne alebo spoločne, podľa uváženia kňaza. Toto požehnanie nahrádza záverečné požehnanie v omši, ak sa udeľuje po modlitbe po prijímaní.\n" +
                    "Obrad sa začne požehnaním sviec.\n" +
                    "Sviece na svätoblažejské požehnanie sa požehnávajú po homílii alebo po modlitbe po prijímaní.\n",
            "<font color='#B71C1C'>POŽEHNANIE SVIEC</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Modlime sa.<br>" +
                    "Velebíme ťa, Bože, náš Otec, Pán nášho života,<br>" +
                    "a prosíme ťa: požehnaj <font color='#B71C1C'>+</font> tieto sviece<br>" +
                    "a nám všetkým, čo sme sa tu<br>" +
                    "na sviatok svätého Blažeja zhromaždili,<br>" +
                    "daruj svoju pomoc a milosrdenstvo.<br>" +
                    "Ochraňuj nás na príhovor<br>" +
                    "tohto biskupa a mučeníka<br>" +
                    "od chorôb hrdla a každej škody<br>" +
                    "a veď nás bezpečne<br>" +
                    "cez všetky nebezpečenstvá nášho života.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.",
            "Po požehnaní kňaz pokropí sviece požehnanou vodou.\n",
            "<font color='#B71C1C'>POŽEHNANIE JEDNOTLIVÝCH VERIACICH</font>",
            "Kňaz drží skrížené sviece pod hrdlom veriaceho a žehná ho týmito slovami:",
            "<font color='#B71C1C'>K.:</font> Na príhovor svätého Blažeja<br>" +
                    "nech ťa Pán chráni od každého zla<br>" +
                    "a nech ťa žehná všemohúci Boh<br>" +
                    "Otec, i Syn <font color='#B71C1C'>+</font> i Duch Svätý.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>SPOLOČNÉ POŽEHNANIE</font>",
            "Ak je veriacich veľa, možno udeliť toto požehnanie takto:\n" +
                    "V omši po modlitbe po prijímaní nasleduje modlitba požehnania sviec, ako je hore, a po nej kňaz udelí požehnanie takto:",
            "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.",
            "Potom dodá:",
            "<font color='#B71C1C'>K.:</font> Prijmite svätoblažejské požehnanie:",
            "Držiac sviece vystrie kňaz pravú ruku nad všetkých veriacich a povie:",
            "<font color='#B71C1C'>K.:</font> Na príhovor svätého Blažeja,<br>" +
                    "biskupa a mučeníka,<br>" +
                    "nech vás Pán chráni od každého zla,<br>" +
                    "nech vás sprevádza svojím <font color='#B71C1C'>+</font> požehnaním<br>" +
                    "a nech vás posilňuje,<br>" +
                    "aby ste v zdraví tela a duše plnili svoje poslanie<br>" +
                    "a dosiahli spásu v spoločenstve všetkých svätých.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> A požehnanie všemohúceho Boha Otca i Syna <font color='#B71C1C'>+</font> i Ducha Svätého nech zostúpi na vás a zostane vždy s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Iďte v mene Božom.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka."};

    String popol = "Po homílii kňaz postojačky a so zopätými rukami hovorí:<br>" +
            "Drahí bratia a sestry, <font color='#B71C1C'>(alebo iné vhodné oslovenie)</font><br>" +
            "pokorne prosme Boha Otca,<br>" +
            "aby hojnou milosťou požehnal tento popol,<br>" +
            "ktorým budeme poznačení na znak kajúcnosti.<br>" +
            "<font color='#B71C1C'>Všetci zotrvajú chvíľu v tichej modlitbe. Potom kňaz pokračuje:</font><br>" +
            "Dobrotivý Bože,<br>" +
            "ty sa skláňaš k poníženým<br>" +
            "a zmilúvaš sa nad kajúcimi;<br>" +
            "dobrotivo vypočuj naše prosby<br>" +
            "a láskavo nás <font color='#B71C1C'>†</font> požehnaj,<br>" +
            "keď budeme poznačení týmto popolom,<br>" +
            "aby sme v nastávajúcom pôstnom období<br>" +
            "konali skutky pokánia<br>" +
            "a s očisteným srdcom mohli sláviť<br>" +
            "veľkonočné tajomstvo tvojho Syna,<br>" +
            "ktorý s tebou žije a kraľuje po všetky veky vekov.<br>" +
            "<font color='#B71C1C'>Ľ.: </font>Amen.<br>" +
            "<font color='#B71C1C'>Alebo:</font><br>" +
            "Milosrdný Bože,<br>" +
            "ty nechceš smrť hriešnika,<br>" +
            "ale jeho návrat na cestu spásy.<br>" +
            "Milostivo vypočuj naše prosby<br>" +
            "a vo svojej otcovskej láske požehnaj <font color='#B71C1C'>†</font> tento popol,<br>" +
            "ktorým si dáme poznačiť hlavy,<br>" +
            "lebo uznávame, že sme prach<br>" +
            "a na prach sa obrátime.<br>" +
            "Daj, prosíme, aby sme v tomto pôstnom období<br>" +
            "úprimnou kajúcnosťou dosiahli odpustenie hriechov,<br>" +
            "začali nový život<br>" +
            "a stále viac sa podobali tvojmu vzkriesenému Synovi,<br>" +
            "ktorý s tebou žije a kraľuje po všetky veky vekov.<br>" +
            "<font color='#B71C1C'>Ľ.: </font>Amen.<br>" +
            "<font color='#B71C1C'>Kňaz mlčky pokropí popol svätenou vodou. Potom poznačí popolom tých prítomných, ktorí k nemu prídu. Každému povie:</font><br>" +
            "Kajajte sa a verte evanjeliu. <font color='#B71C1C'>(Mk 1, 15)</font><br>" +
            "<font color='#B71C1C'>Alebo:</font><br>" +
            "Pamätaj, že si prach a na prach sa obrátiš. <font color='#B71C1C'>(Porov. Gn 3, 19)</font><br>" +
            "<br>" +
            "<font color='#B71C1C'>Medzitým sa spieva:<br>" +
            "ANTIFÓNA (Porov. Joel 2, 13)</font><br>" +
            "Obnovme sa v duchu poníženosti a pokánia,<br>" +
            "postíme sa a skrúšene prosme Pána,<br>" +
            "lebo náš Boh je veľmi milosrdný<br>" +
            "a odpustí nám hriechy.<br>" +
            "<font color='#B71C1C'>INÁ ANTIFÓNA (Joel 2, 17; Est 13, 17)</font><br>" +
            "Medzi predsieňou a oltárom<br>" +
            "nech plačú kňazi, služobníci Pána,<br>" +
            "a nech hovoria:<br>" +
            "Ušetri, Pane, svoj ľud<br>" +
            "a nedaj umĺknuť ústam, ktoré ťa ospevujú.<br>" +
            "<font color='#B71C1C'>INÁ ANTIFÓNA (Ž 50, 3)</font><br>" +
            "Pane, zmy zo mňa moju vinu.<br>" +
            "<font color='#B71C1C'>Túto antifónu možno spojiť so žalmom 50 a opakovať ju za každým veršom tohoto žalmu.<br>" +
            "RESPONZÓRIUM (Porov. Bar 3, 2)</font><br>" +
            "Kajajme sa, lebo sme sa previnili a polepšime sa,<br>" +
            "aby nás neprekvapila smrť;<br>" +
            "potom by sme už márne chceli robiť pokánie.<br>" +
            "Čuj, Pane, a zmiluj sa, lebo sme sa previnili proti tebe.<br>" +
            "<font color='#B71C1C'>V. (Ž 78, 9)</font> Pomôž nám, Bože, naša spása,<br>" +
            "pre slávu svojho mena, vysloboď nás.<br>" +
            "Čuj, Pane ...<br>" +
            "<font color='#B71C1C'>Namiesto tohto responzória sa môže spievať niektorá pôstna pieseň z JKS, napr. č. 123, 151 alebo iná.<br>" +
            "Keď sa skončilo značenie popolom, kňaz si umyje ruky. Obrad sa zakonči modlitbou veriacich.<br>" +
            "Vyznanie viery sa vynechá.</font><br>";

    String[] procesia = {"<font color='#B71C1C'>ÚVOD</font><br>",
            "Procesia sa koná v deň samotnej slávnosti alebo v nasledujúcu nedeľu. Omša sa vždy berie zo slávnosti (aj čítania).\n" +
                    "Na vhodných miestach sa pripravia štyri oltáriky s horiacimi sviecami.\n" +
                    "Hostia pre monštranciu sa konsekruje v omši, po ktorej sa koná procesia.\n" +
                    "Po svätom prijímaní celebrant vloží do monštrancie veľkú hostiu. Po modlitbe po prijímaní celebrant zloží ornát, vezme si pluviál (bielej farby), incenzuje Oltárnu sviatosť, potom vstane, obráti sa k ľudu a povie:\n",
            "<br>Drahí bratia a sestry, Kristus Pán, náš Spasiteľ, v predvečer svojho umučenia a smrti ustanovil Najsvätejšiu sviatosť, aby nás, vykúpených jeho krvou, živil nebeským pokrmom a nápojom a aby stále prebýval medzi nami.<br>" +
                    "V tých dramatických chvíľach nášho vykúpenia sme sa nestačili poďakovať Pánovi za prevzácny dar chleba života a duchovného nápoja. Preto nás Cirkev, nie bez Božieho riadenia, povzbudzuje, aby sme dnes vzdávali vďaky a velebili Pána za dar Najsvätejšej sviatosti.<br>" +
                    "Nech táto naša eucharistická procesia vyznie ako prejav našej živej viery, že Kristus je prítomný ako zmŕtvychvstalý a oslávený Pán medzi nami, a ako vyznanie veľkej lásky k nášmu Spasiteľovi.<br><br>",
            "Potom kňaz príjme náplecné vélum, vezme do rúk monštranciu a intonuje on alebo speváci hymnus ", "<m>Pange lingua ", "(JKS 536) alebo ", "<m>Javte ústa ", "(JKS 317,1). Keď sa verš dospieva, speváci intonujú pieseň ", "<m>Hostiu vítajme ", "(JKS 267).\n" +
            "Procesia sa pohne k prvému zastaveniu.\n",
            "<br><font color='#B71C1C'>PRVÉ ZASTAVENIE</font><br>",
            "Keď kňaz príde k oltáru prvého zastavenia, položí Eucharistiu na pripravený stôl, odloží vélum, incenzuje Oltárnu sviatosť a potom zostane stáť.\n" +
                    "Speváci a ľud spievajú hymnus ", "<m>Pri tejto slávnosti ", "(JKS 223b).\n" +
            "Po skončení hymnu diakon alebo kňaz sklonený pred Oltárnou sviatosťou povie ", "<m>Všemohúci Bože ", "a číta evanjelium.\n",
            "<br><font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého Evanjelia podľa Jána <font color='#B71C1C'>Jn 6, 48-51</font><br>" +
                    "Ježiš povedal: \"Ja som chlieb života. Vaši otcovia jedli na púšti mannu a pomreli. Toto je ten chlieb, ktorý zostupuje z neba, aby nezomrel nik, leto bude z neho jesť. Ja som živý chlieb, ktorý zostúpil z neba. Kto bude jesť z tohto chleba, bude žiť naveky. A chlieb, ktorý ja dám, je moje telo za život sveta.\"<br>" +
                    "Počuli sme slovo Pánovo.<br><br>",
            "Po prečítaní sa spieva responzórium ", "<m>Ja som chlieb života.\n", "",
            "<br><font color='#B71C1C'>K.:</font> Ja som chlieb života. Vaši otcovia jedli na púšti mannu a pomreli. <font color='#B71C1C'>*</font> Toto je ten chlieb, ktorý zostupuje z neba, aby nezomrel nik, kto bude z neho jesť.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Ja som živý chlieb, ktorý zostúpil z neba. Kto bude jesť z tohto chleba, bude žiť naveky. <font color='#B71C1C'>*</font> Toto je ten chlieb, ktorý zostupuje z neba, aby nezomrel nik, kto bude z neho jesť.<br><br>",
            "Chvíľa ticha.\n" +
                    "Nasleduje eucharistická pieseň pred požehnaním ", "<m>Svätý, svätý, svätý ", "(JKS 332, 1). Medzitým kňaz postojačky vloží tymian do kadidelnice a kľačiačky incenzuje Oltárnu sviatosť. Potom vstane a so zloženými rukami sa modlí:\n",
            "<font color='#B71C1C'>K.:</font> Kŕmil ich jadrom pšeničným. Aleluja.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> A sýtil medom zo skaly. Aleluja.<br>" +
                    "<font color='#B71C1C'>K.:</font> Modlime sa.<br>" +
                    "Dobrotivý Bože,<br>" +
                    "ty si nám dal pravý chlieb z neba;<br>" +
                    "posilňuj nás týmto duchovným pokrmom,<br>" +
                    "aby sme vždy žili v tebe<br>" +
                    "a v posledný deň vstali na vecnú spásu.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>",
            "Potom prijme náplecné vélum, vezme do rúk monštranciu a mlčky udelí ľudu požehnanie. Miništranti dajú zvončekom znamenie, aby si všetci kľakli.\n" +
                    "Po požehnaní ide procesia za spevu eucharistickej piesne ", "<m>Ó, láska, nádej, spása ", "(JKS 278) k druhému zastaveniu.\n",
            "<br><font color='#B71C1C'>DRUHÉ ZASTAVENIE</font><br>",
            "Keď kňaz príde k oltáru druhého zastavenia, položí Oltárnu sviatosť na pripravený stôl, odloží vélum, incenzuje sviatosť a zostane stáť.\n" +
                    "Speváci a ľud spievajú hymnus ", "<m>Nebeské slovo ", "(JKS 224).\n" +
            "Po skončení hymnu diakon alebo kňaz sklonený pred Oltárnou sviatosťou povie ", "<m>Všemohúci Bože ", "a číta evanjelium.\n",
            "<br><font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého Evanjelia podlá Matúša <font color='#B71C1C'>Mt 26, 26-28</font><br>" +
                    "Pri večeri vzal Ježiš chlieb a dobrorečil, lámal ho a dával učeníkom, hovoriac: \"Vezmite a jedzte: toto je moje telo.\" Potom vzal kalich, vzdával vďaky a dal im ho, hovoriac: \"Pite z neho všetci: toto je moja krv novej zmluvy, ktorá sa vylieva za všetkých na odpustenie hriechov.\"<br>" +
                    "Počuli sme slovo Pánovo.<br><br>",
            "Po prečítaní sa spieva responzórium ", "<m>Pri večerí.\n", "",
            "<br><font color='#B71C1C'>K.:</font> Pri večeri vzal Ježiš chlieb a dobrorečil, lámal ho a dával učeníkom, hovoriac: <font color='#B71C1C'>*</font> Vezmite a jedzte: toto je moje telo.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Kto je moje telo, ostáva vo mne a ja v ňom. <font color='#B71C1C'>*</font> Vezmite a jedzte: toto je moje telo.<br><br>",
            "Chvíľa ticha.\n" +
                    "Nasleduje eucharistická pieseň pred požehnaním ", "<m>Na kolená padám ", "(JKS 320). Medzitým kňaz postojačky vloží tymian do kadidelnice a kľačiačky incenzuje Oltárnu sviatosť. Potom vstane a so zloženými rukami sa modlí:\n",
            "<br><font color='#B71C1C'>K.:</font> Večný kňaz, Kristus Pán. Aleluja.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Obetoval chlieb a víno. Aleluja.<br>" +
                    "<font color='#B71C1C'>K.:</font> Modlime sa.<br>" +
                    "Pane a Bože nás,<br>" +
                    "veríme a vyznávame,<br>" +
                    "že tvoj Syn Ježiš Kristus,<br>" +
                    "ktorý sa pre nás narodil z Márie Panny<br>" +
                    "a trpel na kríži,<br>" +
                    "je prítomný v Najsvätejšej sviatosti;<br>" +
                    "daj, aby sme z tohto božského prameňa<br>" +
                    "čerpali večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>",
            "Potom prijme náplecné vélum, vezme do rúk monštranciu a mlčky udelí ľudu požehnanie. Miništranti dajú zvončekom znamenie, aby si všetci kľakli.\n" +
                    "Po požehnaní ide procesia za spevu eucharistickej piesne ", "<m>Klaniam sa ti vrúcne ", "(JKS 270) k tretiemu zastaveniu.\n",
            "<br><font color='#B71C1C'>TRETIE ZASTAVENIE</font><br>",
            "Keď kňaz príde k oltáru tretieho zastavenia, položí Oltárnu sviatosť na pripravený stôl, odloží vélum, incenzuje sviatosť a potom zostane stáť.\n" +
                    "Speváci a ľud spievajú hymnus ", "<m>Pri tejto slávnosti ", "(JKS 225). Po skončení hymnu diakon alebo kňaz sklonený pred sviatosťou povie ", "<m>Všemohúci Bože ", "a číta evanjelium.\n",
            "<br><font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého Evanjelia podľa Jána <font color='#B71C1C'>Jn 6, 55-58</font><br>" +
                    "Ježil povedal: \"Moje telo je pravý pokrm a moja krv je pravý nápoj. Kto je moje telo a pije moju krv, ostáva vo mne a ja v ňom. Ako mňa poslal živý Otec a ja žijem z Otca, aj ten, čo mňa je, bude žiť zo mňa. Toto je ten chlieb, ktorý zostúpil z neba, a nie aký jedli otcovia a pomreli. Kto je tento chlieb, bude žiť naveky.\"<br>" +
                    "Počuli sme slovo Pánovo.<br><br>",
            "Po prečítaní sa spieva responzóríum ", "<m>Mňa poslal.\n", "",
            "<br><font color='#B71C1C'>K.:</font> Mňa poslal živý Otec a ja žijem z Otca. <font color='#B71C1C'>*</font> Aj ten, čo mňa je, bude žiť zo mňa.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Pán ho kŕmil chlebom života a rozumnosti. <font color='#B71C1C'>*</font> Aj ten, čo mňa je, bude žiť zo mňa.<br><br>",
            "Chvíľa ticha.\n" +
                    "Nasleduje eucharistická pieseň pred požehnaním ", "<m>Svätý, svätý, svätý ", "(JKS 332, 1). Medzitým kňaz postojačky vloží tymian do kadidelnice a kľačiačky incenzuje Oltárnu sviatosť. Potom vstane a so zloženými rukami sa modlí:\n",
            "<br><font color='#B71C1C'>K.:</font> Nebeský chlieb im dal. Aleluja.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Anjelský chlieb požíval človek. Aleluja.<br>" +
                    "<font color='#B71C1C'>K.:</font> Modlime sa.<br>" +
                    "Láskavý Bože,<br>" +
                    "ty nás deň čo deň<br>" +
                    "obnovuješ Oltárnou sviatosťou;<br>" +
                    "naplň nás nežnosťou svojej lásky,<br>" +
                    "aby sme sa usilovali získať<br>" +
                    "neoceniteľné bohatstvá tvojho kráľovstva.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>",
            "Potom prijme náplecné vélum, vezme do rúk monštranciu a mlčky udelí ľudu požehnanie. Miništranti dajú zvončekom znamenie, aby si všetci kľakli.\n" +
                    "Po požehnaní ide procesia za spevu eucharistickej piesne ", "<m>Hostiu vítajme ", "(JKS 267) k štvrtému zastaveniu.\n",
            "<br><font color='#B71C1C'>ŠTVRTÉ ZASTAVENIE</font><br>",
            "Keď kňaz príde k oltáru štvrtého zastavenia, položí Oltárnu sviatosť na pripravený stôl, odloží véíum, incenzuje sviatosť a potom zostane stáť.\n" +
                    "Speváci a ľud spievajú hymnus ", "<m>Pri tejto slávnosti ", "(JKS 226). Po skončení hymnu diakon alebo kňaz sklonený pred Oltárnou sviatosťou povie ", "<m>Všemohúci Bože ", "a číta evanjelium.\n",
            "<br><font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého Evanjelia podľa Jána <font color='#B71C1C'>Jn 15,9-12</font><br>" +
                    "Ježiš povedal: \"Ako mňa miluje Otec, tak ja milujem vás. Ostaňte v mojej láske! Ak budete zachovávať moje prikázania, ostanete v mojej láske, ako ja zachovávam prikázania svojho Otca a ostávam v jeho láske. Toto som vám povedal, aby vo vás bola moja radosť a aby vaša radosť bola úplná. Toto je moje prikázanie: Aby ste sa milovali navzájom, ako som ja miloval vás.\"<br>" +
                    "Počuli sme slovo Pánovo.<br><br>",
            "Po prečítaní sa spieva responzórium ", "<m>Poznajte v chlebe.\n", "",
            "<br><font color='#B71C1C'>K.:</font> Poznajte v chlebe telo, ktoré viselo na kríži. Poznajte v kalichu krv, čo tiekla z Ježišovho boku. Vezmite teda a jedzte Kristovo telo, vezmite a pite Kristovu krv. <font color='#B71C1C'>*</font> Tak sme my sami údmi Krista.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Neoddeľujte sa, jedzte toho, ktorý je vaším spojivom. Poznajte svoju hodnosť, pite cenu svojej spásy. <font color='#B71C1C'>*</font> Tak sme my sami údmi Krista.<br><br>",
            "Chvíľa ticha.\n" +
                    "Nasleduje eucharistická pieseň pred požehnaním ", "<m>Bože, všetko stvorenie ", "(JKS 316). Medzitým kňaz postojačky vloží tymian do kadidelnice a kľačiačky incenzuje Oltárnu sviatosť. Potom vstane a so zloženými rukami sa modlí:\n",
            "<br><font color='#B71C1C'>K.:</font> Zhromaždila nás. Aleluja.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Kristova láska. Aleluja.<br>" +
                    "<font color='#B71C1C'>K.:</font> Modlime sa.<br>" +
                    "Nebeský Otče,<br>" +
                    "vyznávame, že tvoj Syn,<br>" +
                    "prítomný v tejto sviatosti,<br>" +
                    "je náš Pán a náš Boh;<br>" +
                    "osvieť naše srdcia svetlom viery<br>" +
                    "a zapáľ nás ohňom svojej lásky,<br>" +
                    "aby sme sa mu s dôverou klaňali<br>" +
                    "v duchu a pravde.<br>" +
                    "Lebo on je Boh a s tebou žije <br>" +
                    "a kraľuje na veky vekov.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>",
            "Potom prijme náplecné vélum, vezme do rúk monštranciu a mlčky udelí ľudu požehnanie. Miništranti dajú znamenie, aby si všetci kľakli.\n" +
                    "Potom ide procesia za spevu piesne ", "<m>Ježišu, kráľu neba i zeme ", "(JKS 498) do kostola\n",
            "<br><font color='#B71C1C'>ZAKONČENIE</font><br>",
            "Keď procesia vstupuje do kostola, speváci začnú spievať hymnus ", "<m>Teba, Bože, chválime ", "a ľud pokračuje.\n" +
            "Kňaz v kostole ide k oltáru, položí na korporál monštranciu, odloží vélum, incenzuje Oltárnu sviatosť a obrátený k Najsvätejšej sviatosti postojačky počká na zakončenie hymnu. Potom on alebo spevák zaintonuje ",
            "<m>Tantum ergo - Ctíme túto sviatosť slávnu. ", "Ku koncu druhej strofy postojačky vloží tymian do kadidelnice a kľačiačky incenzuje Oltárnu sviatosť. Potom vstane a vyzve ľud na modlitbu:\n",
            "<br><font color='#B71C1C'>K.:</font> Modlime sa.<br>" +
                    "Dobrotivý Bože,<br>" +
                    "ty si vykúpil celé ľudstvo smrťou<br>" +
                    "a zmŕtvychvstaním svojho Syna;<br>" +
                    "zachovaj v nás dielo svojho milosrdenstva<br>" +
                    "a daj, aby sme vždy plní vďaky<br>" +
                    "slávili tajomstvo viery,<br>" +
                    "a tak dosiahli večnú odmenu v nebi.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>",
            "Kňaz prijme náplecné vélum, vezme do rúk monštranciu a mlčky udelí ľudu požehnanie. Miništranti dajú zvončekom znamenie, aby si všetci kľakli.\n" +
                    "Keď kňaz ukladá Najsvätejšiu sviatosť do svätostánku, možno na záver spievať aklamáciu ", "<m>Kristus víťaz ", "alebo inú vhodnú pieseň.\n"};

    String[][] slavnostne_pozehnanie = {
            /*0*/      {"Advent", "<font color='#B71C1C'>Kňaz:</font> Všemohúci a milosrdný Boh, z milosti ktorého veríte v prvý príchod jeho jednorodeného Syna a očakávate jeho budúci príchod v sláve, nech vás posvätí žiarou Kristovho príchodu a posilní svojím požehnaním.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech vás na pozemskej púti posilňuje v hlbokej viere, v radostnej nádeji a v činorodej láske.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Vykupiteľ, ktorý vás potešil svojím prvým príchodom, nech vás odmení večným životom, keď na konci vekov príde v sláve.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen."},
            /*1*/      {"Vianoce", "<font color='#B71C1C'>Kňaz:</font> Nekonečne dobrotivý Boh, ktorý vtelením svojho Syna zahnal temnoty sveta a jeho slávnym narodením ožiaril túto presvätú noc <font color='#B71C1C'>(</font>tento presvätý deň<font color='#B71C1C'>)</font>, nech zaženie od vás temnoty zla a ožiari vaše srdcia svetlom svojej milosti.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Boh, ktorý oznámil pastierom prostredníctvom anjelov radostnú zvesť o Spasiteľovom narodení, nech naplní aj vás radosťou a urobí vás ohlasovateľmi Kristovej blahozvesti.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Boh, ktorý vtelením svojho Syna spojil nebo so zemou, nech vás naplní svojím pokojom a láskou a nech vás vovedie do spoločenstva oslávenej Cirkvi v nebi.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen."},
            /*2*/    {"Pôst", "<font color='#B71C1C'>Kňaz:</font> Milosrdný Boh Otec, ktorý obetoval svojho Syna a v ňom vám dal príklad nesmiernej lásky, nech vám dá milosť, aby ste v službe Bohu i ľuďom pocítili nevýslovný dar jeho požehnania.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech vás Kristus odmení večným životom, veď veríte, že skrze jeho smrť ste boli oslobodení od večnej smrti.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Keďže nasledujete Krista v jeho uponížení, nech vám dá účasť na jeho slávnom zmŕtvychvstaní.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen."},
            /*3*/    {"Veľká noc", "<font color='#B71C1C'>Kňaz:</font> Boh, ktorý vás zmŕtvychvstaním svojho Syna vykúpil a prijal za svojich, nech vás požehná a naplní duchovnou radosťou.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Vykupiteľ Ježiš Kristus, ktorý vám zaslúžil dar trvalej slobody, nech vám dá podiel na dedičstve večnej blaženosti.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Keďže ste boli v krste vierou vzkriesení s Kristom, nech si dobrým životom zaslúžite večnú odmenu v nebi.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen."},
            /*4*/      {"Cezrok", "<font color='#B71C1C'>V OBDOBÍ «CEZ ROK» I (Nm 6, 24 – 26)</font><br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech vás žehná Pán a nech vás ochraňuje.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech rozžiari svoju tvár nad vami a nech vám je milostivý. <br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech k vám obráti svoju tvár a nech vám daruje pokoj. <br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami. <br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br><br>" +
            "<font color='#B71C1C'>V OBDOBÍ «CEZ ROK» II (Flp 4, 7)</font><br>" +
            "<font color='#B71C1C'>Kňaz:</font> Boží pokoj, ktorý prevyšuje každú chápavosť, nech zachová vaše srdcia a vaše mysle v múdrosti a láske Boha i jeho Syna, nášho Pána Ježiša Krista.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br><br>" +
            "<font color='#B71C1C'>V OBDOBÍ «CEZ ROK» III</font><br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech vás vo svojej láskavosti požehná všemohúci Boh a nech vám dá pravú múdrosť, ktorá vedie k spáse.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech vás neprestajne živí náukou viery a nech vám dá silu vytrvať vo svätých skutkoch.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech usmerňuje k sebe vaše kroky a nech vám ukáže cestu pokoja a lásky.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br><br>" +
            "<font color='#B71C1C'>V OBDOBÍ «CEZ ROK» IV</font><br>" +
            "<font color='#B71C1C'>Kňaz:</font> Boh všetkej útechy nech zachová vaše dni vo svojom pokoji a obdaruje vás svojím požehnaním.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech vás chráni pred každým nebezpečenstvom a nech upevňuje vaše srdcia vo svojej láske.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen. <br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech vo vás rozmnoží dary nádeje, viery a lásky, aby ste horlivo konali dobré skutky, a tak si zaslúžili večný život.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br><br>" +
            "<font color='#B71C1C'>V OBDOBÍ «CEZ ROK» V</font><br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech všemohúci Boh odvráti od vás každé zlo a láskavo vás zahrnie svojím požehnaním.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech vzbudí vo vašich srdciach túžbu po Božom slove, aby vás naplnila trvalá radosť.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech vždy chápete, čo je dobré a správne, a nech kráčate po ceste Božích prikázaní, aby ste dosiahli spoločenstvo so svätými v nebi.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br><br>"+
			 "<font color='#B71C1C'>V OBDOBÍ «CEZ ROK» VI</font><br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech vás Boh požehná všetkým nebeským požehnaním, nech vás zachová vo svätosti a čistote pred svojím pohľadom, štedro na vás vyleje bohatstvo svojej slávy, učí vás slovami pravdy, usmerňuje vás evanjeliom spásy a vždy vás obohacuje bratskou láskou. Skrze Krista, nášho Pána.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen."},

            /*5*/  {"Začiatok roku", "<font color='#B71C1C'>Kňaz:</font> Boh, prameň a pôvodca všetkého požehnania, nech vás posilní milosťou, naplní hojným požehnaním a nech vás po celý rok ochraňuje od všetkých nebezpečenstiev.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech vás zachová v neporušenej viere, utvrdí v neochvejnej nádeji a nech vám dá silu vytrvať v láske až do konca.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech svojím pokojom naplní všetky vaše dni a skutky, nech vyslyší všetky vaše modlitby a šťastlivo vás privedie do večného života.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen."},
            /*6*/    {"Zjavenie Pána", "<font color='#B71C1C'>Kňaz:</font> Boh, ktorý vás povolal z temnôt do svojho predivného svetla, nech vás naplní svojím požehnaním a nech vám dá silnú vieru, nádej a lásku.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Keďže s dôverou nasledujete Krista, ktorý sa dnes zjavil svetu ako svetlo v temnotách, nech aj vás urobí svetlom pre vašich bratov a sestry.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Po skončení pozemskej púte nech prídete ku Kristovi, svetlu zo svetla, ktorého mudrci hľadali, keď išli za hviezdou, a ktorého našli s veľkou radosťou.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen."},
            /*7*/     {"Nanebovstúpenie Pána", "<font color='#B71C1C'>Kňaz:</font> Nech vás požehná všemohúci Boh, ktorého jednorodený Syn vystúpil dnes na nebesia a otvoril aj vám cestu, aby ste mohli prísť tam, kde on žije v sláve.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Kristus, ktorý sa po slávnom zmŕtvychvstaní zjavoval svojim učeníkom, nech sa aj vám zjaví ako milosrdný sudca, keď príde súdiť živých i mŕtvych.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Keďže veríte, že Kristus zasadol s Otcom v jeho sláve, nech s radosťou prežívate naplnenie jeho sľubu, že zostane s vami až do konca vekov.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen."},
            /*8*/     {"O Duchu Svätom", "<font color='#B71C1C'>Kňaz:</font> Boh, Otec svetla, ktorý osvietil mysle učeníkov vyliatím Ducha Svätého, Tešiteľa, nech vám dá radosť z jeho požehnania a bohato vás naplní trvalými darmi Ducha Svätého.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech oheň, ktorý sa zázračne zjavil nad učeníkmi, zbaví vaše srdcia každého zla a naplní ich svojím svetlom.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Duch Svätý, ktorý zjednotil rozličné jazyky vo vyznávaní tej istej viery, nech aj vás utvrdí vo viere a privedie do večnej blaženosti.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen."},
            /*9*/      {"Preblahoslavenej Panny Márie", "<font color='#B71C1C'>Kňaz:</font> Boh, ktorý sa narodil z preblahoslavenej Panny Márie, a tak chcel vo svojej veľkej láske vykúpiť ľudstvo, nech vás obdarí svojím požehnaním.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech vás vždy a všade ochraňuje Panna Mária, skrze ktorú sme dostali pôvodcu života, Ježiša Krista.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Všetkým vám, ktorí ste sa zišli osláviť sviatok ... Panny Márie, nech dobrotivý Boh udelí pravú duchovnú radosť a bohatú odmenu v nebi.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen."},
            /*10*/    {"Svätý Peter a Pavol", "<font color='#B71C1C'>Kňaz:</font> Nech vás požehná všemohúci Boh, ktorý vás upevnil v Petrovom spásnom vyznaní a postavil vás tak na pevnej skale viery Cirkvi.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Boh, ktorý vás poučil neúnavným kázaním svätého Pavla, nech vás naučí nasledovať jeho príklad, aby ste vedeli získavať bratov a sestry pre Krista.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Svätí apoštoli Peter a Pavol dosiahli veniec slávy mučeníckou smrťou, jeden na kríži, druhý pod ostrím meča; nech aj vám pomáhajú dosiahnuť večnú radosť: svätý Peter mocou kľúčov a svätý Pavol silou Božieho slova.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen."},
            /*11*/     {"Sviatky apoštolov", "<font color='#B71C1C'>Kňaz:</font> Boh, ktorý vás postavil na bezpečné základy apoštolskej viery, nech vás láskavo požehná prostredníctvom slávnych zásluh svätých apoštolov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M. (</font>svätého apoštola <font color='#B71C1C'>M.)</font>.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Boh, ktorý vás obdaroval učením a príkladom apoštolov, nech vás pod ich ochranou urobí svedkami pravdy.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech príklad svätých apoštolov <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M. (</font>svätého apoštola <font color='#B71C1C'>M.)</font> posilňuje vašu vieru a ich <font color='#B71C1C'>(</font>jeho<font color='#B71C1C'>)</font> orodovanie nech vám pomáha na ceste k večnému životu.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen."},
            /*12*/    {"Všetkých svätých", "<font color='#B71C1C'>Kňaz:</font> Boh, sláva a radosť svätých, ktorý vám dal posilu v ich osobitnom príhovore, nech vás požehná trvalým požehnaním.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech vás Boh na ich orodovanie oslobodí od zlého a povzbudí príkladom ich svätého života, aby ste vždy ochotne slúžili Bohu i blížnemu.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech spolu so všetkými svätými získate radosť večnej vlasti, kde sa svätá Cirkev raduje, že jej deti sú prijaté vo večnom pokoji do spoločenstva vyvolených.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen."},
            /*13*/     {"Za zosnulých", "<font color='#B71C1C'>Kňaz:</font> Nech vás žehná Boh všetkej útechy, ktorý vo svojej nevýslovnej dobrote stvoril človeka a zmŕtvychvstaním svojho milovaného Syna dal veriacim nádej na vzkriesenie.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech nám žijúcim tu na zemi odpustí hriechy a všetkých zosnulých nech prijme do vlasti svetla a pokoja.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech nás všetkých privedie do večnej radosti s Kristom, o ktorom pevne veríme, že víťazne vstal z mŕtvych.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen."},
    };

    String[][] postne_pozehnania = {
            {"03", "Bože, vylej ducha kajúcnosti na tých,<br>" +
                    "čo sa skláňajú pred tvojou velebou,<br>" +
                    "aby mohli získať odmenu sľúbenú tým,<br>" +
                    "čo konajú pokánie.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"04", "Všemohúci Bože, ty si ukázal<br>" +
                    "svojmu ľudu cestu večného života;<br>" +
                    "daj, prosíme, aby sme po tejto ceste<br>" +
                    "prišli k tebe, nehasnúcemu svetlu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"05", "Milosrdný Bože,<br>" +
                    "tvoj ľud ti neprestajne ďakuje za tvoje veľké činy;<br>" +
                    "daj, nech si zachovávaním starobylých príkazov<br>" +
                    "na svojej životnej púti zaslúži dôjsť<br>" +
                    "do večnosti s tebou.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"06", "Pane, láskavo stoj pri svojom ľude,<br>" +
                    "ktorý sa dotýka svätých tajomstiev,<br>" +
                    "aby žiadne nebezpečenstvo neublížilo tým,<br>" +
                    "ktorí dôverujú v tvoju ochranu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"10", "Prosíme ťa, Pane,<br>" +
                    "nech zostúpi na tvoj ľud hojné požehnanie,<br>" +
                    "aby v súžení rástla naša nádej,<br>" +
                    "v pokušení sa upevňovali naše čnosti,<br>" +
                    "a tak sme získali večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"11", "Prosíme ťa, Pane,<br>" +
                    "osvieť myseľ svojho ľudu svetlom svojej slávy,<br>" +
                    "aby spoznal, čo treba konať,<br>" +
                    "a nasledoval, čo je správne.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"12", "Bože, posilni svojich veriacich svojím požehnaním<br>" +
                    "a buď im potešením v smútku, posilou v utrpení<br>" +
                    "a pomocou v nebezpečenstve.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"13", "Pane, zhliadni na svoj ľud<br>" +
                    "a láskavo nás očisti od každého hriechu,<br>" +
                    "lebo ak nás neovláda neprávosť,<br>" +
                    "nemôže nám ublížiť žiadne pokušenie.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"14", "Prosíme ťa, Pane,<br>" +
                    "zahrň žiadaným milosrdenstvom tých, čo ťa vzývajú,<br>" +
                    "a udeľ im nebeské dary, aby poznali, čo je správne,<br>" +
                    "a získali, po čom túžia.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"16", "Pane, láskavo zhliadni na svoj ľud,<br>" +
                    "aby vonkajšie telesné odriekanie<br>" +
                    "dosiahlo aj vnútorný účinok.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"20", "Bože, posilňuj svojich veriacich požehnaním,<br>" +
                    "aby sa nikdy neodklonili od tvojej vôle<br>" +
                    "a mohli sa vždy radovať z tvojich dobrodení.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"20", "Pane, požehnaj svojich veriacich trvalým požehnaním<br>" +
                    "a daj, nech tak nasledujú evanjelium<br>" +
                    "tvojho jednorodeného Syna, aby vždy túžili po sláve,<br>" +
                    "ktorú ukázal pri svojom premenení apoštolom,<br>" +
                    "a šťastne k nej i došli.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"21", "Prosíme ťa, Pane,<br>" +
                    "posilni srdcia svojich veriacich silou tvojej milosti,<br>" +
                    "aby boli zbožní v modlitbe<br>" +
                    "a úprimní vo vzájomnej láske.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"22", "Pane, vypočuj prosby svojich veriacich<br>" +
                    "a posilni ich na duchu, aby získali odpustenie<br>" +
                    "a tešili sa z tvojho požehnania.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"23", "Pane, poskytni svojim služobníkom<br>" +
                    "hojnú ochranu a milosť,<br>" +
                    "daj im zdravie tela i duše, daj im plnosť bratskej lásky<br>" +
                    "a urob ich stále oddanými tebe.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"24", "Pane, stoj pri svojich služobníkoch,<br>" +
                    "ktorí si vyprosujú pomoc tvojej milosti,<br>" +
                    "a neustále ich sprevádzaj a ochraňuj.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"25", "Prosíme ťa, Pane,<br>" +
                    "udeľ svojmu ľudu zdravie tela i duše,<br>" +
                    "aby si vytrvalosťou v dobrých skutkoch<br>" +
                    "zaslúžil tvoju ochranu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"26", "Pane, ty napĺňaš želania prosiacich;<br>" +
                    "vo svojom milosrdenstve vypočuj naše modlitby<br>" +
                    "a daj, aby sme si žiadali to, čo je milé tebe.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"30", "Prosíme ťa, Pane, spravuj srdcia svojich veriacich<br>" +
                    "a svojim služobníkom udeľ milosť,<br>" +
                    "aby vytrvali v láske k tebe a k blížnemu<br>" +
                    "a zachovávali všetky tvoje príkazy.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"31", "Prosíme ťa, Pane, svojou pravicou<br>" +
                    "ochraňuj prosiaci ľud a láskavo ho očisti,<br>" +
                    "aby získal útechu v tomto živote<br>" +
                    "a dosiahol aj budúce dobrá.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"32", "Bože, tvorca a vládca svojho ľudu,<br>" +
                    "odstráň hriechy, ktoré ho sužujú,<br>" +
                    "aby sa ti vždy páčil a pokojne žil<br>" +
                    "pod tvojou ochranou.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"33", "Bože, daj svojmu ľudu zmýšľanie, ktoré by sa ti páčilo,<br>" +
                    "lebo keď ho vzdelávaš svojimi príkazmi,<br>" +
                    "zahŕňaš ho aj svojou priazňou.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"34", "Pane, dúfame v tvoje milosrdenstvo<br>" +
                    "a vzývame tvoju láskavosť,<br>" +
                    "a keďže od teba pochádza všetko, čím sme,<br>" +
                    "nech v tvojej milosti hľadáme, čo je správne,<br>" +
                    "a konáme, čo je dobré.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"35", "Pane, láskavo zhliadni na svojich veriacich,<br>" +
                    "ktorí vzývajú tvoje milosrdenstvo,<br>" +
                    "a keďže dôverujú v tvoju dobrotu,<br>" +
                    "nech dokážu všade šíriť dary tvojej lásky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"36", "Pane, drž nad svojimi veriacimi ochrannú pravicu,<br>" +
                    "aby ťa hľadali celým srdcom a zaslúžili si získať,<br>" +
                    "o čo zbožne prosia.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"40", "Pane, zhliadni na tých, čo ťa vzývajú, a posilni slabých;<br>" +
                    "oživuj svojím svetlom tých, čo kráčajú v temnotách smrti,<br>" +
                    "a tých, ktorých si oslobodil od všetkého zla,<br>" +
                    "priveď k najvyššiemu dobru.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"41", "Prosíme ťa, Pane, obnov svoj ľud vnútorne i navonok,<br>" +
                    "a keďže nechceš, aby bol spútaný telesnou rozkošou,<br>" +
                    "daj nech napreduje v duchovnom živote.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"42", "Milosrdný Bože,<br>" +
                    "daj, aby sa tvoj ľud vzmáhal v láske k tebe<br>" +
                    "a z tvojej milosti vždy dostával to,<br>" +
                    "čo mu je prospešné.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"43", "Pane, láskavo ochraňuj svojich služobníkov,<br>" +
                    "keď na tomto svete konajú dobré skutky,<br>" +
                    "aby mohli dôjsť k najvyššiemu dobru.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"44", "Bože, ochranca tých, čo v teba dúfajú,<br>" +
                    "požehnaj, zachráň, ochraňuj a obnov svoj ľud,<br>" +
                    "aby bol oslobodený od hriechu, v bezpečí pred zlom<br>" +
                    "a vždy vytrval v tvojej láske.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"45", "Pane, zhliadni na svojich služobníkov,<br>" +
                    "ktorí dúfajú v tvoje milosrdenstvo,<br>" +
                    "a láskavo im poskytni nebeskú pomoc a ochranu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"46", "Pane, zhliadni na svoj ľud,<br>" +
                    "ktorý sa pripravuje na slávenie veľkonočných sviatkov,<br>" +
                    "a sprevádzaj ho nebeskou milosťou,<br>" +
                    "aby posilnený pozemskou útechou<br>" +
                    "túžil viac po nebeských dobrách.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"50", "Pane, požehnaj svoj ľud,<br>" +
                    "ktorý očakáva dielo tvojho milosrdenstva,<br>" +
                    "a daj, aby to, po čom z tvojho vnuknutia túži,<br>" +
                    "z tvojej štedrosti aj dosiahol.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"51", "Prosíme ťa, Pane,<br>" +
                    "osloboď od hriechov ľud, ktorý ťa vzýva,<br>" +
                    "aby žil svätým spôsobom života<br>" +
                    "a bol uchránený od všetkých pokušení.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"52", "Bože, ty dúfajúcim v teba<br>" +
                    "prejavuješ radšej milosrdenstvo ako hnev;<br>" +
                    "daj, nech tvoji veriaci oľutujú zlo, ktoré konali,<br>" +
                    "aby si zaslúžili dosiahnuť milosť tvojej útechy.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"53", "Všemohúci Bože, vypočuj prosby svojho ľudu,<br>" +
                    "a tak ako mu dávaš nádej vo svojom zľutovaní,<br>" +
                    "dopraj mu pocítiť účinky tvojho milosrdenstva.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"54", "Prosíme ťa, Pane, láskavo stoj pri svojom ľude,<br>" +
                    "ktorý každý deň odmieta to, čo ti nie je milé,<br>" +
                    "aby sa mohol radovať z tvojich príkazov.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"55", "Všemohúci Bože, prosíme ťa, dopraj,<br>" +
                    "aby boli tvoji služobníci,<br>" +
                    "ktorí hľadajú tvoju milostivú ochranu,<br>" +
                    "oslobodení od všetkého zla<br>" +
                    "a slúžili ti s pokojným srdcom.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"56", "Pane, zmiluj sa nad svojou Cirkvou,<br>" +
                    "ktorá ti predkladá svoje prosby, a obráť sa k tým,<br>" +
                    "čo pred tebou skláňajú svoje srdcia;<br>" +
                    "a keďže si nás vykúpil smrťou svojho jednorodeného Syna,<br>" +
                    "nedaj, aby sme boli pripútaní k hriechu,<br>" +
                    "ani premožení pokušeniami.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"60", "Prosíme ťa, Pane, zhliadni na túto svoju rodinu,<br>" +
                    "pre ktorú sa náš Pán Ježiš Kristus<br>" +
                    "neváhal vydať do rúk zločincov<br>" +
                    "a podstúpiť muky kríža.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"61", "Prosíme ťa, Pane, bráň pokorných<br>" +
                    "a neustále ochraňuj tých, čo dúfajú v tvoje milosrdenstvo,<br>" +
                    "aby sme mohli sláviť veľkonočné sviatky<br>" +
                    "nielen vonkajšími znakmi,<br>" +
                    "ale nadovšetko s čistým srdcom.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"62", "Bože, nech tvoje milosrdenstvo<br>" +
                    "očistí tebe oddaný ľud od všetkých minulých hriechov<br>" +
                    "a nech ho urobí schopným novej svätosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"63", "Prosíme ťa, Pane, daj, aby tvoji veriaci<br>" +
                    "mali neprestajne účasť na veľkonočných tajomstvách,<br>" +
                    "túžobne očakávali budúce dary<br>" +
                    "a vytrvali v sviatosti, ktorou boli znovuzrodení,<br>" +
                    "aby tak pomocou kajúcich skutkov došli do nového života.<br>" +
                    "Skrze Krista, nášho Pána."},
    };

    String[][] tiche_modlitby = {
            {"Po úkone kajúcnosti", "Nasleduje absolúcia kňaza:",
                    "Nech sa nad nami zmiluje všemohúci Boh, nech nám hriechy odpustí\n" +
                            "a privedie nás do večného života.",
                    "Ľud odpovie:",
                    "Amen."},
            {"Pred evanjeliom", "Všemohúci Bože, očisť mi srdce i pery, aby som mohol dôstojne hlásať tvoje sväté evanjelium."},
            {"Po evanjeliu", "Slová evanjelia nech zmyjú naše previnenia."},
            {"Príprava obetných darov", "ňaz stojí pri oltári, vezme paténu s chlebom, oboma rukami ju drží trocha pozdvihnutú nad oltárom a potichu hovorí:",
                    "Požehnaný si, Pane, Bože všetkého stvorenia,\n" +
                            "pretože sme z tvojej štedrosti prijali tento chlieb.\n" +
                            "Obetujeme ti ho ako plod zeme a práce ľudských rúk,\n" +
                            "aby sa nám stal chlebom života.",
                    "Potom položí paténu s chlebom na korporál.\n" +
                            "Ak sa počas prípravy obetných darov nespieva, kňaz môže tieto slová predniesť nahlas.\n" +
                            "Na konci môže ľud zvolať:",
                    "Požehnaný Boh naveky!",
                    "Diakon alebo kňaz naleje do kalicha víno a trocha vody. Pritom potichu hovorí:",
                    "Tajomstvo tejto vody a vína\n" +
                            "nech nám dá účasť na božstve toho,\n" +
                            "ktorý láskavo prijal našu ľudskú prirodzenosť.",
                    "Potom kňaz vezme kalich, oboma rukami ho drží trocha pozdvihnutý nad oltárom a potichu hovorí:",
                    "Požehnaný si, Pane, Bože všetkého stvorenia, \n" +
                            "pretože sme z tvojej štedrosti prijali toto víno. \n" +
                            "Obetujeme ti ho ako plod viniča a práce ľudských rúk, \n" +
                            "aby sa nám stalo duchovným nápojom.",
                            "Potom položí kalich na korporál.\n" +
                                    "Ak sa nespieva spev na obetovanie, kňaz môže tieto slová predniesť nahlas. Na konci môže ľud zvolať:",
                    "Požehnaný Boh naveky!",
                    "Potom sa kňaz hlboko skloní a potichu povie:",
                    "Prijmi nás, Pane,\n" +
                            "v duchu pokorných a v srdci skrúšených, \n" +
                            "a naša dnešná obeta\n" +
                            "nech nájde zaľúbenie v tvojich očiach.",
                    "Potom si kňaz stojac na boku oltára umyje ruky a potichu hovorí:",
                    "Pane, zmy zo mňa moju vinu a očisť ma od hriechu.",
                    "Kňaz stojí uprostred oltára obrátený tvárou k ľudu, rozopne a znova zloží ruky, pričom hovorí:",
                    "Modlite sa, bratia a sestry, aby sa moja i vaša obeta zaľúbila všemohúcemu Bohu Otcovi.",
                    "Ľud vstane a odpovie:",
                    "Nech Pán prijme obetu z tvojich rúk na chválu a slávu svojho mena,\n" +
                            "na úžitok nám i celej svätej Cirkvi."},
            {"Po speve na prijímanie", "Pri purifikovaní kňaz potichu hovorí:", "Pane, čo sme prijali ústami, \n" +
                    "nech očistí naše srdce\n" +
                    "a časný dar nech sa nám stane \n" +
                    "zárukou večného života."}
    };

    String teba_Boze_chvalime = "Teba, Bože, chválime,\n" +
            "teba, Pane, velebíme,\n" +
            "Teba, večný Otče,\n" +
            "uctieva celá zem.\n" +
            "Tebe všetci anjeli, \n" +
            "tebe nebesia i všetky mocnosti,\n" +
            "tebe cherubíni a serafíni \n" +
            "bez prestania prespevujú:\n" +
            "Svätý, svätý, svätý \n" +
            "Pán, Boh zástupov.\n" +
            "Plné sú nebo i zem \n" +
            "tvojej veleby a slávy.\n" +
            "\n" +
            "Teba oslavuje \n" +
            "slávny zbor apoštolov;\n" +
            "teba velebí \n" +
            "veľký počet prorokov;\n" +
            "teba chváli \n" +
            "vznešený zástup mučeníkov;\n" +
            "teba oslavuje \n" +
            "svätá Cirkev po celej zemi,\n" +
            "teba, Otče, \n" +
            "nesmierne velebného,\n" +
            "i tvojho milovaného, \n" +
            "pravého a jediného Syna,\n" +
            "aj Ducha Svätého, \n" +
            "Tešiteľa nášho.\n" +
            "\n" +
            "Kriste, \n" +
            "ty si kráľ slávy.\n" +
            "Ty si Otcov Syn \n" +
            "od večnosti.\n" +
            "Ty si neváhal vstúpiť do života Panny, \n" +
            "stal si sa človekom, aby si vykúpil človeka.\n" +
            "Ty si zvíťazil nad smrťou \n" +
            "a otvoril si veriacim nebeské kráľovstvo.\n" +
            "Ty sedíš po pravici Boha \n" +
            "v sláve svojho Otca.\n" +
            "Veríme, \n" +
            "že ako sudca ešte raz prídeš.\n" +
            "\n" +
            "Preto ťa prosíme, pomáhaj svojim služobníkom, \n" +
            "ktorých si vykúpil predrahou krvou.\n" +
            "Pripočítaj nás k svojim svätým \n" +
            "vo večnej sláve.\n" +
            "\n" +
            "Zachráň, Pane, svoj ľud \n" +
            "a žehnaj svojich dedičov.\n" +
            "A spravuj ich \n" +
            "a vyvýš ich až naveky.\n" +
            "Po všetky dni \n" +
            "dobrorečíme tebe.\n" +
            "A chválime tvoje meno naveky, \n" +
            "až na veky večné.\n" +
            "Vo svojej láskavosti, Pane, \n" +
            "chráň nás v tento deň pred hriechom.\n" +
            "Zmiluj sa, Pane, nad nami, \n" +
            "zmiluj sa nad nami.\n" +
            "Tvoje milosrdenstvo, Pane, nech je nad nami, \n" +
            "ako dúfame v teba.\n" +
            "V teba, Pane, som dúfal, \n" +
            "nebudem zahanbený naveky.";

    String prid_Duchu_svaty_tvorivy = "Príď, Duchu Svätý, tvorivý,\n" +
            "príď svojich verných navštíviť;\n" +
            "naplň nám srdcia milosťou,\n" +
            "ktoré si stvoril múdrosťou.\n" +
            "\n" +
            "Tešiteľom si nazvaný,\n" +
            "dar Boží z neba nám daný,\n" +
            "zdroj živý, láska, oheň v nej\n" +
            "i pomazanie duchovné.\n" +
            "\n" +
            "Ty, darca darov sedmorých,\n" +
            "prst Boží v dielach stvorených;\n" +
            "ty, prisľúbenie Otcovo,\n" +
            "dávaš reč, slovo Pánovo.\n" +
            "\n" +
            "Osvieť nás, ducha posilňuj,\n" +
            "do sŕdc vlej lásku ohnivú;\n" +
            "keď telo klesá v slabosti,\n" +
            "vzpriamuj ho silou milosti.\n" +
            "\n" +
            "Pred nepriateľom ochráň nás,\n" +
            "svoj pokoj daj nám v každý čas;\n" +
            "nech vždy pod tvojím vedením\n" +
            "vyhneme vplyvom škodlivým.\n" +
            "\n" +
            "Nauč nás Otca poznávať\n" +
            "a jeho Syna milovať\n" +
            "a v teba, Ducha obidvoch,\n" +
            "daj veriť vždy, vo všetkých dňoch. Amen.";

    String[] kvetna_nedela = {"Spomienka na Pánov vstup do Jeruzalema",
            //antifona - 1, 2, 3
            "ANTIFÓNA", "(Porov. Mt 21, 9)",
            "Hosanna Synovi Dávidovmu!\n"+
            "Požehnaný, ktorý prichádza v mene Pánovom: Král Izraela.\n"+
            "Hosanna na výsostiach!",
            //komentar - 4
            "Potom kňaz pozdraví ľud zvyčajným spôsobom. Krátkym príhovorom povzbudí veriacich, aby sa aktívne a povedome zúčastnili na slávnosti tohto dňa. Môže sa im prihovoriť napríklad takto:",
            //text - 5
            "Drahí bratia a sestry, od začiatku pôstneho obdobia sme sa duchovne očisťovali pokáním a skutkami kresťanskej lásky. Dnes sa schádzame, aby sme spolu s celou Cirkvou začali sláviť veľkonočné tajomstvo Ježiša Krista. Kristus Pán toto tajomstvo uskutočnil svojou smrťou a zmŕtvychvstaním; preto prišiel do svojho mesta Jeruzalema.\n"+
            "S vierou a nábožnosťou oslávme teda spomienku na jeho spásonosný vstup do Jeruzalema.\n"+
            "Sprevádzajme Pána, aby sme mali účasť na jeho slávnom zmŕtvychvstaní a večnom živote, ktorý dosiahneme, keď s pomocou jeho milosti budeme spolu s ním trpieť.",
            //komentar - 6
            "Po príhovore sa kňaz modlí so zopätými rukami niektorú z týchto modlitieb:",
            //text(html) - 7
            "Modlime sa.<br>"+
                    "Všemohúci a večný Bože,<br>"+
                    "posväť <font color='#B71C1C'>†</font> tieto ratolesti svojím požehnaním, <font color='#B71C1C'>*</font><br>"+
                    "aby sme skrze Krista Kráľa,<br>"+
                    "ktorého s plesaním sprevádzame, <font color='#B71C1C'>–</font><br>"+
                    "mohli vojsť do večného Jeruzalema.<br>"+
                    "Lebo on žije a kraľuje na veky vekov.<br>"+
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>"+
                    "<font color='#B71C1C'>Alebo:</font><br>"+
                    "Modlime sa.<br>"+
                    "Bože, posilni vieru tých, čo dúfajú v teba, <font color='#B71C1C'>*</font><br>"+
                    "a láskavo vypočuj modlitby prosiacich, <font color='#B71C1C'>–</font><br>"+
                    "aby sme ti v Kristovi,<br>"+
                    "ktorému dnes ako víťazovi mávame ratolesťami,<br>"+
                    "prinášali ovocie dobrých skutkov.<br>"+
                    "Lebo on žije a kraľuje na veky vekov.<br>"+
                    "<font color='#B71C1C'>Ľ.:</font> Amen.",
            //komentar - 8
            "Mlčky pokropí ratolesti svätenou vodou.\n"+
            "Potom sa číta stať o Pánovom vstupe do Jeruzalema z jedného zo štyroch Evanjelií. Číta ju diakon, alebo (ak nieto diakona) sám kňaz zvyčajným spôsobom.",
            //V ROKU A - 9, 10
            "Mt 21, 1-11", "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Matúša<br>"+
            "Keď sa priblížili k Jeruzalemu a došli do Betfage pri Olivovej hore, Ježiš poslal dvoch učeníkov a povedal im: „Choďte do dedinky oproti vám a hneď nájdete priviazanú oslicu a pri nej osliatko. Odviažte ich a priveďte mi ich. A keby vám niekto niečo vravel, povedzte: ‚Pán ich potrebuje.‘ A hneď ich prepustí.“<br>"+
            "Toto sa stalo, aby sa splnilo slovo proroka: „Povedzte dcére sionskej: Hľa, tvoj Kráľ prichádza k tebe, ponížený, sediaci na oslici a na osliatku, mláďati ťažného zvieraťa.“<br>"+
            "Učeníci šli a urobili, ako im Ježiš rozkázal. Priviedli oslicu a osliatko, pokládli na ne svoje plášte a on si na ne sadol. Mnohí zo zástupu prestierali na cestu svoje plášte, iní stínali ratolesti zo stromov a stlali ich po ceste. A zástupy, čo šli pred ním, i tie, čo šli za ním, vyvolávali:<br>"+
            "„Hosanna Synovi Dávidovmu! Požehnaný, ktorý prichádza v mene Pánovom. Hosanna na výsostiach!“<br>"+
            "Keď Ježiš vošiel do Jeruzalema, rozvírilo sa celé mesto; vypytovali sa: „Kto je to?“ A ľudia hovorili: „Je to Ježiš, prorok z galilejského Nazareta.“<br>"+
            "Počuli sme slovo Pánovo.",
            //V ROKU B - 11, 12, 13, 14, 15
            "Mk 11, 1-10", "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Marka<br>"+
            "Keď sa blížili k Jeruzalemu, Betfage a Betánii pri Olivovej hore, poslal Ježiš dvoch svojich učeníkov a povedal im: „Choďte do dedinky oproti vám a len čo do nej vojdete, nájdete priviazané osliatko, na ktorom doteraz človek nesedel. Odviažte ho a priveďte. A keby vám niekto vravel: ‚Čo to robíte?‘, povedzte: ‚Pán ho potrebuje a hneď ho zasa vráti.‘“<br>"+
            "I odišli a vonku na rázcestí našli osliatko, priviazané o dvere, a odviazali ho. Niektorí z tých, čo tam stáli, im vraveli: „Čo robíte, prečo odväzujete osliatko?“ Oni im povedali, ako im kázal Ježiš, a povolili im to.<br>"+
            "Osliatko priviedli k Ježišovi, položili naň svoje plášte a on naň vysadol. Mnohí prestierali na cestu svoje plášte, iní zasa zelené ratolesti, narezané na poliach. A tí, čo išli pred ním, i tí, čo išli za ním, volali:<br>"+
            "„Hosanna! Požehnaný, ktorý prichádza v mene Pánovom. Požehnané kráľovstvo nášho otca Dávida, ktoré sa približuje. Hosanna na výsostiach!“ <br>"+
            "Počuli sme slovo Pánovo.",
            "Alebo:", "Jn 12, 12-16",
            "<font color='#B71C1C'>†</font> Čítanie zo svätého Evanjelia podľa Jána <br>"+
                    "Keď sa veľké zástupy, ktoré prišli na sviatky, dopočuli, že Ježiš prichádza do Jeruzalema, nabrali palmových ratolestí, vyšli mu naproti a volali: „Hosanna! Požehnaný, ktorý prichádza v mene Pánovom, požehnaný Kráľ Izraela!“<br>"+
                    "Ježiš si našiel osliatko a vysadol naň, ako je napísané: „Neboj sa, dcéra sionská, hľa, tvoj kráľ prichádza, sediaci na mláďati oslice.“<br>"+
                    "Jeho učeníci tomu ešte nerozumeli, ale keď bol Ježiš oslávený, rozpomenuli sa, že to bolo o ňom napísané a že mu to urobili.<br>"+
                    "Počuli sme slovo Pánovo.",
            //V ROKU C - 16, 17
            "Lk 19, 28-40", "<font color='#B71C1C'>†</font> Čítanie zo svätého evanjelia podľa Lukáša<br>"+
            "Ježiš pokračoval v ceste do Jeruzalema. Keď sa priblížil k Betfage a Betánii, pri hore, ktorá sa volá Olivová, poslal dvoch učeníkov so slovami: „Choďte do dedinky naproti a len čo do nej vojdete, nájdete priviazané osliatko, na ktorom človek ešte nesedel. Odviažte ho a priveďte! A keby sa vás niekto opýtal: ‚Prečo ho odväzujete?‘, povedzte mu: ‚Pán ho potrebuje.‘“<br>"+
            "Poslovia odišli a našli, ako im povedal. Keď odväzovali osliatko, povedali im jeho majitelia: „Prečo odväzujete osliatko?“ Oni povedali: „Pán ho potrebuje.“ Potom osliatko priviedli k Ježišovi, hodili naň svoje plášte a posadili naň Ježiša. A ako išiel, na cestu mu prestierali svoje plášte. Keď sa už blížil k úbočiu Olivovej hory, začal sa celý zástup učeníkov radovať a mocným hlasom chváliť Boha za všetky divy, ktoré videl, a volal:<br>"+
            "„Požehnaný kráľ, ktorý prichádza v mene Pánovom. Pokoj na nebi a sláva na výsostiach!“<br>"+
            "Tu mu zo zástupu povedali niektorí farizeji: „Učiteľ, napomeň svojich učeníkov!“ On im odvetil: „Hovorím vám, ak budú títo mlčať, kamene budú kričať.“<br>"+
            "Počuli sme slovo Pánovo.",
            //komentar - 18
            "Po evanjeliu, ak je to vhodné, môže byť krátka homília.\n"+
            "Potom kňaz alebo iný schopný prisluhujúci dá pokyn k procesií týmito alebo podobnými slovami:",
            //text - 19
            "Bratia a sestry, ako kedysi zástupy v Jeruzaleme,\n"+
            "tak aj my dnes volajme Ježišovi na slávu.\n"+
            "Poďme v pokoji!",
            //komentar - 20
            "Procesia sa pohne ku kostolu, v ktorom sa bude sláviť svätá omša, v tomto poriadku: popredu ide turiferár s dymiacou kadidelnicou (ak sa mieni používať). Za ním ide prisluhujúci s ozdobeným krížom, po jeho bokoch dvaja prisluhujúci so zažatými sviecami. Potom kráča kňaz s asistenciou. Za nimi idú veriaci s ratolesťami v rukách.\n"+
            "Pri procesií zbor a ľud spieva nasledujúcu antifónu, opakujúc ju po jednotlivých veršoch 23. žalmu, alebo inú vhodnú pieseň (u nás to môže byť napr. JKS, č. 182. alebo 183).",
            //text(html) - 21
            "<br><font color='#B71C1C'>ANTIFÓNA</font><br>"+
                    "Jeruzalemské deti s olivovými ratolesťami v rukách <br>"+
                    "išli v ústrety Ježišovi a nadšene volali: Hosanna na výsostiach!<br>"+
                    "<br>"+
                    "<font color='#B71C1C'>ŽALM 23</font><br>"+
                    "Pánova je zem i všetko, čo ju napĺňa,<br>"+
                    "okruh zeme aj tí, čo bývajú na ňom.<br>"+
                    "Veď on sám položil jeho základy na moriach,<br>"+
                    "a upevnil ho na vodách.<br>"+
                    "<br>"+
                    "Kto smie vystúpiť na vrch Pánov?<br>"+
                    "Kto smie stáť na jeho mieste posvätnom?<br>"+
                    "Ten, čo má ruky nevinné a srdce čisté,<br>"+
                    "čo neberie jeho meno nadarmo<br>"+
                    "a neprisahá falošne.<br>"+
                    "<br>"+
                    "Taký dosiahne požehnanie od Pána<br>"+
                    "a odmenu od Boha, svojho spasiteľa.<br>"+
                    "To je pokolenie tých, čo ho hľadajú,<br>"+
                    "čo hľadajú tvár Boha Jakubovho.<br>"+
                    "<br>"+
                    "Zdvihnite, brány, svoje hlavice,<br>"+
                    "a vyvýšte sa, brány prastaré,<br>"+
                    "lebo má vstúpiť kráľ slávy.<br>"+
                    "Kto je ten kráľ slávy?<br>"+
                    "Pán silný a mocný, Pán mocný v boji.<br>"+
                    "<br>"+
                    "Zdvihnite, brány, svoje hlavice<br>"+
                    "a vyvýšte sa, brány prastaré,<br>"+
                    "lebo má vstúpiť kráľ slávy.<br>"+
                    "Kto je ten kráľ slávy?<br>"+
                    "Pán zástupov, to je ten kráľ slávy.<br>"+
                    "<br>"+
                    "<font color='#B71C1C'>ANTIFÓNA 2</font><br>"+
                    "Jeruzalemské deti prestierali na cestu rúcha a nadšene volali:<br>"+
                    "Hosanna Synovi Dávidovmu!<br>"+
                    "Požehnaný, ktorý prichádza v mene Pánovom.",
            //komentar - 22
            "(Táto antifóna sa môže opakovať po jednotlivých veršoch žalmu 46.)",
            //text(html) - 23
            "<br><font color='#B71C1C'>ŽALM 46</font><br>"+
                    "Tlieskajte rukami, všetky národy,<br>"+
                    "jasajte Bohu hlasom radostným.<br>"+
                    "Lebo Pán je Najvyšší a hrozný,<br>"+
                    "nad celou zemou veľký kráľ.<br>"+
                    "<br>"+
                    "Podmaňuje nám národy<br>"+
                    "a pohanov nám kladie pod nohy.<br>"+
                    "On pre nás vybral dedičstvo,<br>"+
                    "slávu Jakuba, ktorého má rád.<br>"+
                    "<br>"+
                    "Za jasotu vystupuje Boh,<br>"+
                    "Pán vystupuje za hlaholu poľnice.<br>"+
                    "Spievajte Bohu, spievajte.<br>"+
                    "Spievajte nášmu kráľovi, spievajte.<br>"+
                    "Pretože Boh je kráľom celej zeme;<br>"+
                    "spievajte mu chválospev.<br>"+
                    "<br>"+
                    "Boh kraľuje nad národmi,<br>"+
                    "Boh sedí na svojom svätom tróne.<br>"+
                    "Kniežatá národov sa spolčujú<br>"+
                    "s národom Boha Abrahámovho.<br>"+
                    "Veď Bohu patria mocní zeme;<br>"+
                    "tak veľmi je vyvýšený.<br>"+
                    "<br>"+
                    "<font color='#B71C1C'>HYMNUS KRISTA KRÁĽA<br>"+
                    "Refrén:</font><br>"+
                    "Sláva ti, Kriste, Kráľ náš, ty Vykupiteľ sveta!<br>"+
                    "Prijmi hold od zástupu, čo sa dnes s tebou stretá!<br>"+
                    "<font color='#B71C1C'>1.</font> Ľud vyvolený plesá a radostne ťa zdraví,<br>"+
                    "prichádzaš v mene Božom, zdrav buď, Kráľ večnej slávy!<br>"+
                    "<font color='#B71C1C'>Refrén.<br>"+
                    "2.</font> Anjeli zišli z neba, aby ťa sprevádzali,<br>"+
                    "a smrteľný tvor, človek, k ich pridá svoje chvály.<br>"+
                    "<font color='#B71C1C'>Refrén.<br>"+
                    "3.</font> Pomedzi zástup ľudu k Svätému ideš mestu,<br>"+
                    "mlaď palmami a kvetmi pokrýva tvoju cestu.<br>"+
                    "<font color='#B71C1C'>Refrén.<br>"+
                    "4.</font> Hosanna, volá sprievod, lež tvoje oči hľadia<br>"+
                    "v ústrety múk a krížu, keď ťa aj verní zradia.<br>"+
                    "<font color='#B71C1C'>Refrén.<br>"+
                    "5.</font> My veríme však, že si Kráľ, ktorý večne žije,<br>"+
                    "n naše srdce k tebe oddanou láskou bije.<br>"+
                    "<font color='#B71C1C'>Refrén.<br>"+
                    "6.</font> Ako si vtedy prijal spev natešenej mladi,<br>"+
                    "prijmi aj našu chválu, veď spievame ti radi.<br>"+
                    "<font color='#B71C1C'>Refrén.<br>"+
                    "7.</font> A pripútaj nás k sebe, aby sme s tebou boli<br>"+
                    "v slávnostnej tejto chvíli, aj v úzkosti a bôli!<br>"+
                    "<font color='#B71C1C'>Refrén.</font>",
            //komentar - 24
            "Keď sprievod vchádza do kostola, spieva sa nasledujúce responzórium alebo iná vhodná pieseň o Ježišovom vstupe do Jeruzalema.",
            //text - 25
            "\nRESPONZÓRIUM\n"+
            "Keď Pán vchádzal do Svätého mesta, jeruzalemské deti s palmovými ratolesťami v rukách ohlasovali vzkriesenie života a volali: Hosanna na výsostiach!\n"+
            "Keď ľudia počuli, že Ježiš prichádza do Jeruzalema, vyšli mu v ústrety s palmovými ratolesťami v rukách a volali: Hosanna na výsostiach!",
            //komentar - 26
            "Keď kňaz príde k oltáru, pobozká ho, prípadne ho aj incenzuje. Potom ide k sedadlu (odloží pluviál a oblečie si ornát). Vynechá úvodné omšové obrady a na zakľúčenie procesie prednesie modlitbu dňa. Potom pokračuje v slávení omše zvyčajným spôsobom.",
            //text(html) - 27
            "<br><b>Druhý spôsob: Slávnostný vstup</b>",
            //komentar(html) - 28
                    "<font color='#B71C1C'>Ak nie je možné usporiadať procesiu, spomienka na Pánov vstup do Jeruzalema sa oslávi v kostole, a to slávnostným vstupom na začiatku slávnostnej svätej omše.<br>"+
                    "Veriaci s ratolesťami v rukách sa zhromaždia pred bránou kostola alebo v kostole samom. Kňaz, prisluhujúci a skupina zástupcov ľudu prídu na stanovené miesto mimo presbytéria. Toto miesto nech sa zvolí tak, aby čím viacerí mohli sledovať obrad.<br>"+
                    "Kým kňaz ide na určené miesto, ľud spieva </font><font color='#000000'>Hosanna</font><font color='#B71C1C'> alebo inú vhodnú pieseň. Požehnanie ratolestí a čítanie evanjelia o Ježišovom vstupe do Jeruzalema sa koná ako pred procesiou. Po evanjeliu kňaz, prisluhujúci a skupina zástupcov ľudu slávnostne idú cez kostol k oltáru. Pritom sa spieva </font><font color='#000000'>Keď Pán vchádzal</font><font color='#B71C1C'> alebo iná pieseň (JKS, č. 182, 183).<br>"+
                    "Keď kňaz príde k oltáru, pobozká ho, odíde k sedadlu, vynechá úvodné omšové obrady a hneď prednesie modlitbu dňa. Potom pokračuje v omši zvyčajným spôsobom.</font><br>"+
                    "<br>",
            //text(html) - 29
                    "<b>Tretí spôsob: Jednoduchý vstup</b>",
            //komentar(html) - 30
                    "<font color='#B71C1C'>Vo všetkých ostatných omšiach tejto nedele, v ktorých sa nekoná slávnostný vstup, Pánov príchod do Jeruzalema sa pripomína len jednoduchým vstupom.<br>"+
                    "Keď kňaz ide k oltáru, spieva sa úvodný spev so žalmom alebo iná pieseň s rovnakou myšlienkou. Keď kňaz príde k oltáru, pobozká ho, odíde k sedadlu, pozdraví ľud a pokračuje v omši zvyčajným spôsobom. V omšiach bez prítomnosti ľudu a v omšiach, v ktorých úvodný spev nemožno spievať, kňaz, len čo príde k oltáru a pobozká ho, pozdraví ľud a hneď prečíta úvodný spev. Potom pokračuje v omši zvyčajným spôsobom.</font><br>"+
                    "<br>",
            //text(html) - 31
                    "<font color='#B71C1C'>ÚVODNÝ SPEV</font><br>"+
                    "Šesť dní pred Veľkou nocou,<br>"+
                    "keď Ježiš prichádzal do Jeruzalema,<br>"+
                    "išli mu v ústrety deti<br>"+
                    "s palmovými ratolesťami v rukách<br>"+
                    "a nadšene volali: Hosanna na výsostiach!<br>"+
                    "Požehnaný, ktorý prináša milosrdenstvo a spásu.<br>"+
                    "<br><font color='#B71C1C'>Žalm 23 (9-10)</font><br>"+
                    "Zdvihnite, brány, svoje hlavice<br>"+
                    "a vyvýšte sa, brány prastaré,<br>"+
                    "lebo má vstúpiť kráľ slávy.<br>"+
                    "Kto je ten kráľ slávy?<br>"+
                    "Pán zástupov, to je ten kráľ slávy.<br>"+
                    "Hosanna na výsostiach!<br>"+
                    "Sláva ti, ktorý prinášaš milosrdenstvo a spásu.<br>"};

    String modlitba_zasvatenia =             "<font color='#B71C1C'>Po svätom prijímaní kňaz nechá na oltári cibórium alebo vloží Hostiu do monštrancie a prikryje ju priesvitným závojom. Po modlitbe po prijímaní odhalí monštranciu a zíde ku kľačadlu. Vezme kadidelnicu a incenzuje Sviatosť. Ak je na oltári iba cibórium, incenzácia Sviatosti môže byť, ale nemusí. Medzitým sa spieva:</font><br>"+
            "<br>"+
            "<font color='#B71C1C'>PIESEŇ (JKS 499, 1)</font><br>"+
            "Ó, Kriste, veľký Kráľu náš,<br>"+
            "čo svetom, nebom vládneš,<br>"+
            "ty božskej moci berlu máš<br>"+
            "a láskou večne vládneš.<br>"+
            "(:Ježišu, Kráľu, prijmi svoj ľud,<br>"+
            "vrelý ti lásky skladáme sľub:<br>"+
            "za tebou, Kráľu, vždy ísť chceme,<br>"+
            "za tebou vždy ísť chceme:)<br>"+
            "<br>"+
            "<font color='#B71C1C'>Alebo: (JKS 270, 1)</font><br>"+
            "Klaniam sa ti vrúcne <br>"+
            "<br>"+
            "<font color='#B71C1C'>ÚVODNÉ ZVOLANIA<br>"+
            "K.:</font> Sláva ti a chvála, víťazný Baránok.<br>"+
            "<font color='#B71C1C'>Ľ.:</font> Sláva ti a chvála, víťazný Baránok.<br>"+
            "<font color='#B71C1C'>K.:</font> Ty si nás vykúpil svojou drahou krvou, Kriste, Vykupiteľ.<br>"+
            "<font color='#B71C1C'>Ľ.:</font> Sláva ti a chvála, víťazný Baránok.<br>"+
            "<font color='#B71C1C'>K.:</font> Ty si nás znovuzrodil pre nový život a živíš nás svojím obetovaným telom, Kriste, Spasiteľ.<br>"+
            "<font color='#B71C1C'>Ľ.:</font> Sláva ti a chvála, víťazný Baránok.<br>"+
            "<font color='#B71C1C'>K.:</font> Ty si Kráľ a stredisko našich sŕdc.<br>"+
            "<font color='#B71C1C'>Ľ.:</font> Sláva ti a chvála, víťazný Baránok.<br>"+
            "<font color='#B71C1C'>K.:</font> Hoden si prijať moc a bohatstvo, múdrosť a silu, slávu a dobrorečenie, víťazný Baránok, Ježišu Kriste.<br>"+
            "<font color='#B71C1C'>Ľ.:</font> Sláva ti a chvála, víťazný Baránok.<br>"+
            "<br>"+
            "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA (Kol 3, 12-15)</font><br>"+
            "Apoštol Pavol hovorí:<br>"+
            "Ako Boží vyvolenci, svätí a milovaní, oblečte si hlboké milosrdenstvo, láskavosť, pokoru, miernosť a trpezlivosť. Znášajte sa navzájom a odpúšťajte si, ak by mal niekto niečo proti druhému. Ako Pán odpustil vám, tak aj vy! Ale nad všetko toto majte lásku, ktorá je zväzkom dokonalosti! A vo vašich srdciach nech vládne Kristov pokoj. Preň ste aj povolaní v jednom tele. A buďte vďační! <br>"+
            "<font color='#B71C1C'>Alebo: (1Kor 15, 25-28)</font><br>"+
            "Apoštol Pavol hovorí:<br>"+
            "On musí kraľovať, kým mu nepoloží všetkých nepriateľov pod nohy. Ako posledný nepriateľ bude zničená smrť, lebo mu všetko položil pod nohy. Ale keď hovorí: „Všetko je podrobené“, je jasné, že okrem toho, ktorý mu všetko podrobil. A keď mu bude všetko podrobené, vtedy sa aj sám Syn podrobí tomu, ktorý mu všetko podrobil, aby bol Boh všetko vo všetkom. <br>"+
            "<br>"+
            "<font color='#B71C1C'>ÚVAHA (Benedikt XV.)</font><br>"+
            "Je krásne hľadieť na Ježišovo Srdce ako symbol jeho nekonečnej lásky. Ešte krajšie je mať ho vždy živého blízko seba, v Oltárnej sviatosti. Najsvätejšie Srdce, ktoré uctievame, nie je mŕtve, nebijúce srdce, na ktoré môžeme iba spomínať. Je to Srdce živé, živé nielen v nebi, kde sídli oslávený človek Kristus Ježiš, ale je živé aj na zemi, všade, kde je Eucharistia. „V Eucharistii nás toto Božské Srdce spravuje a miluje, žije a prebýva s nami, aby sme aj my žili a prebývali v ňom.“ <br>"+
            "<br>"+
            "<font color='#B71C1C'>Chvíľa ticha.<br>"+
            "V tejto chvíľke sa zasvätím Kristovi Kráľovi a poďakujem sa mu, že patrím do jeho kráľovstva, do kráľovstva pravdy a života, do kráľovstva svätosti a milosti, do kráľovstva spravodlivosti, lásky a pokoja.<br>"+
            "<br>"+
            "ZASVÄTENIE ĽUDSKÉHO POKOLENIA BOŽSKÉMU SRDCU<br>"+
            "K.:</font> Ježišu, Vykupiteľ ľudského pokolenia,<br>"+
            "zhliadni na nás, pokorne kľačiacich<br>"+
            "pred tvojím oltárom:<br>"+
            "<font color='#B71C1C'>Ľ.:</font> Tvoji sme a tvoji chceme zostať.<br>"+
            "<font color='#B71C1C'>K.:</font> Aby sme sa mohli s tebou<br>"+
            "ešte vrúcnejšie spojiť,<br>"+
            "<font color='#B71C1C'>Ľ.:</font> každý z nás sa dnes dobrovoľne<br>"+
            "zasväcuje tvojmu najsvätejšiemu Srdcu.<br>"+
            "<font color='#B71C1C'>K.:</font> Mnohí ľudia ťa doteraz nepoznali<br>"+
            "mnohí pohrdli tvojimi prikázaniami<br>"+
            "a odmietli ťa,<br>"+
            "<font color='#B71C1C'>Ľ.:</font> zmiluj sa nad nimi, dobrotivý Ježišu,<br>"+
            "a všetkých strhni k tvojmu svätému Srdcu.<br>"+
            "<font color='#B71C1C'>K.:</font> Pane, buď kráľom nielen svojim verným,<br>"+
            "ktorí ťa nikdy neopustili,<br>"+
            "ale aj márnotratným synom a dcéram;<br>"+
            "<font color='#B71C1C'>Ľ.:</font> daj, aby sa čím skôr vrátili<br>"+
            "do otcovského domu<br>"+
            "a nezahynuli hladom a biedou.<br>"+
            "<font color='#B71C1C'>K.:</font> Pane, buď kráľom i tým,<br>"+
            "ktorých od teba odlúčili<br>"+
            "mylné názory a rozkolníctvo;<br>"+
            "<font color='#B71C1C'>Ľ.:</font> priveď ich naspäť do prístavu pravdy<br>"+
            "a k jednote viery,<br>"+
            "aby bolo jedno stádo a jeden pastier.<br>"+
            "<font color='#B71C1C'>K.:</font> Daruj svojej Cirkvi slobodu a bezpečnosť,<br>"+
            "všetkým národom poriadok a pokoj;<br>"+
            "nech zo všetkých končín zeme<br>"+
            "zaznieva jeden hlas:<br>"+
            "<font color='#B71C1C'>Ľ.:</font> Sláva Božskému Srdcu,<br>"+
            "ktoré nám prinieslo spásu;<br>"+
            "jemu česť a chvála naveky.<br>"+
            "<font color='#B71C1C'>V.:</font> Amen.<br>"+
            "<br>"+
            "<font color='#B71C1C'>Kňaz môže celú modlitbu predniesť sám.<br>"+
            "<br>"+
            "Nasleduje eucharistická pieseň, modlitba a požehnanie.<br>"+
            "<br>"+
            "Táto pobožnosť nech sa koná vo všetkých kostoloch aspoň pri hlavnej svätej omši alebo aj popoludní mimo omše. Pri ostatných omšiach pred požehnaním recitovať aspoň zasväcujúcu modlitbu. (</font>Porov. Pius XI. Quas primas z 11. decembra 1925<font color='#B71C1C'>).</font><br>"
            ;

    String[] ohlasenieVN = {
            "Milí bratia a sestry,<br>" +
            "Pánova sláva sa nám zjavila<br>" +
            "a vždy sa bude zjavovať medzi nami,<br>" +
            "až kým on sám nepríde.<br>" +
            "V rytmoch a striedaní času<br>" +
            "si pripomíname a prežívame tajomstvá spásy.<br>" +
            "<br>" +
            "Centrom celého liturgického roka<br>" +
            "je posvätné Trojdnie<br>" +
            "ukrižovaného, pochovaného<br>" +
            "a vzkrieseného Pána,<br>" +
            " ktoré vrcholí v nedeľu na Veľkú noc<br>" +
            "– v tomto roku ",
            ".<br><br>" +
                    "V každú nedeľu, ktorá je Veľkou nocou týždňa,<br>" +
                    "svätá Cirkev sprítomňuje<br>" +
                    "túto veľkú udalosť spásy,<br>" +
                    "v ktorej Kristus premohol hriech a smrť.<br>" +
                    " Z Veľkej noci pramenia všetky sväté dni:<br>" +
                    "začiatok pôstneho obdobia<br>" +
                    "- Popolcová streda ",
            ",<br>Nanebovstúpenie Pána ",
            ",<br>Zoslanie Ducha Svätého ",
            ",<br>Prvá adventná nedeľa ",
            ".<br><br>" +
                    "Aj na sviatky svätej Božej Matky,<br>" +
                    "apoštolov a svätých<br>" +
                    "i pri Spomienke na všetkých verných zosnulých<br>" +
                    "Cirkev putujúca na zemi<br>" +
                    "ohlasuje Veľkú noc svojho Pána.<br>" +
                    " Kristovi, ktorý bol, ktorý je a ktorý príde,<br>" +
                    "Pánovi času a dejín,<br>" +
                    "neprestajná chvála na veky vekov. Amen."
    };

    String[][] prosby_rozlicne = {
            {"Prosby za zosnulých",
                    "<font color='#B71C1C'>1.</font> Bože Otče, prosíme ťa za zomrelých <font color='#B71C1C'>M.</font>, nech ich tvoj Syn Ježiš Kristus privedie do nebeského kráľovstva.<br><br>" +
                    "<font color='#B71C1C'>2.</font> Bože, uveď našich zomrelých <font color='#B71C1C'>M.</font> do slávy večného života.<br><br>" +
                    "<font color='#B71C1C'>3.</font> Ježišu, ty prídeš súdiť živých i mŕtvych; pripoj našich zosnulých <font color='#B71C1C'>M.</font> k zástupu blažených.<br><br>" +
                    "<font color='#B71C1C'>4.</font> Ježišu, náš život a naše vzkriesenie, udeľ večnú spásu našim zomrelým <font color='#B71C1C'>M.</font> a priveď ich do víťaznej Cirkvi v nebi.<br><br>" +
                    "<font color='#B71C1C'>5.</font> Pane Ježišu, zmiluj sa nad našimi zomrelými <font color='#B71C1C'>M.</font>, zahrň ich svojím milosrdenstvom a daj im spoznať svoju spásu.<br><br>" +
                    "<font color='#B71C1C'>6.</font> Pane, prosíme ťa za zosnulých <font color='#B71C1C'>M.</font>: ukáž im svoju slávu v nebeskom príbytku.<br><br>" +
                    "<font color='#B71C1C'>7.</font> Daj, aby naši zomrelí <font color='#B71C1C'>M.</font> prežívali večnú radosť v nebeskom domove.<br><br>" +
                    "<font color='#B71C1C'>8.</font> Odním putá smrti z našich zomrelých <font color='#B71C1C'>M.</font> a privítaj ich vo svojom kráľovstve.<br><br>" +
                    "<font color='#B71C1C'>9.</font> Prosme za našich zosnulých <font color='#B71C1C'>M.</font>: Pane, daj im podiel na svojej sláve.<br><br>" +
                    "<font color='#B71C1C'>10.</font> Modlime sa za našich zomrelých <font color='#B71C1C'>M.</font>, aby im Pán prejavil svoju lásku, odpustil im hriechy a prijal ich k sebe.<br><br>" +
                    "<font color='#B71C1C'>11.</font> Aby Pán priviedol našich zosnulých <font color='#B71C1C'>M.</font> do svojho nebeského kráľovstva, prosme Pána.<br><br>" +
                    "<font color='#B71C1C'>12.</font> Za zomrelých <font color='#B71C1C'>M.</font>: nech spoznajú moc nekonečného Božieho milosrdenstva, prosme Pána.<br><br>" +
                    "<font color='#B71C1C'>13.</font> Za zosnulých <font color='#B71C1C'>M.</font>, na ktorých si pri tejto omši spomíname: aby dosiahli večnú spásu v spoločenstve svätých v nebi, prosme Pána.<br>"},
            {"Prosby za zdravie a Božiu pomoc", "<font color='#B71C1C'>1.</font> Pane Ježišu, prosíme ťa o zdravie a tvoje požehnanie pre nášho brata <font color='#B71C1C'>M. (</font> našu sestru <font color='#B71C1C'>M.)</font>, za ktorého <font color='#B71C1C'>(</font>ktorú<font color='#B71C1C'>)</font> je obetovaná táto svätá omša.<br><br>" +
                    "<font color='#B71C1C'>2.</font> Bože Otče, daruj zdravie, svoju pomoc a požehnanie nášmu bratovi <font color='#B71C1C'>M. (</font>našej sestre <font color='#B71C1C'>M.)</font>.<br>"},
            {"Prosby za poďakovanie", "<font color='#B71C1C'>1.</font> Pane, ty nám dávaš všetko potrebné pre náš život; prijmi naše poďakovanie za...<br><br>" +
                    "<font color='#B71C1C'>2.</font> Bože, vypočuj úmysel tejto svätej omše, ktorú ti obetujeme na poďakovanie za...<br>"},
            {"Prosby za farnosť", "<font color='#B71C1C'>1.</font> Pane, požehnaj našu farnosť a daj, aby sme všetci žili a pracovali podľa tvojej vôle.<br><br>" +
                    "<font color='#B71C1C'>2.</font> Bože, požehnávaj naše farské spoločenstvo, aby sme všetci žili ako jedna rodina vo svornosti a pravej láske.<br><br>" +
                    "<font color='#B71C1C'>3.</font> Modlime sa za našu farnosť: aby sme sa všetci usilovali o horlivý kresťanský život, prosme Pána.<br>"},
            {"Prosby za duchovné povolania", "<font color='#B71C1C'>1.</font> Ježišu, daj mladým ľuďom túžbu zasvätiť sa ti v duchovnom povolaní.<br><br>" +
                    "<font color='#B71C1C'>2.</font> Bože Otče, posilňuj v ochote odpovedať na tvoj hlas všetkých mužov a ženy, ktorých voláš k zasvätenému životu.<br><br>" +
                    "<font color='#B71C1C'>3.</font> Za chlapcov a mladých mužov: aby mali odvahu rozhodnúť sa pre kňazskú službu, prosme Pána.<br><br>" +
                    "<font color='#B71C1C'>4.</font> Modlime sa za kresťanské rodiny: aby mali ochotu darovať a vychovať Cirkvi nových kňazov, rehoľníkov a rehoľné sestry.<br>"},
    };

    String[][] tri_oblasti_modlitby_a_pripravy = {
            {"Za pápeža – znak spoločenstva so Svätým Otcom",
                    "<font color='#B71C1C'>1.</font> Aby modernému svetu s odvahou hlásal Ježišovo evanjelium pravdy a lásky.<br><br>" +
                            "<font color='#B71C1C'>2.</font> Aby slovami nádeje napomáhal prekonávanie nerovností a rozdelení medzi ľuďmi.<br><br>" +
                            "<font color='#B71C1C'>3.</font> Aby bol naplnený Božím Duchom a viedol Cirkev k chápaniu znamení našich čias.<br><br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme s úctou a poslušnosťou počúvali slová pápeža Františka a uvádzali ich do života.<br>"},
            {"Za Cirkev na Slovensku – znak zodpovednosti za našu krajinu",
                    "<font color='#B71C1C'>1.</font> Aby sme sa s úprimnou ochotou modlili za pápeža, za biskupov a kňazov<br><br>" +
                            "<font color='#B71C1C'>2.</font> Aby sme prijímali radosť kresťanskej viery v každodennom živote a vydávali pravdivé svedectvo o Kristovi a jeho Cirkvi.<br><br>" +
                            "<font color='#B71C1C'>3.</font> Aby sme podľa príkladu Panny Márie a s jej pomocou odvážne prijímali svoj život ako neopakovateľný a dôležitý v Božích plánoch.<br><br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme podľa príkladu sv. Jozefa neúnavne a nenápadne pracovali vo svete v službe Ježišovi.<br><br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme v pravde a láske mohli rásť v slobode Božích synov a dcér.<br><br>"
            },
            {"Za ľudí vo svete – znak evanjeliovej solidarity",
                    "<font color='#B71C1C'>1.</font> Aby kresťania rôznych vyznaní budovali medzi sebou cesty porozumenia a vzájomného prijatia.<br><br>" +
                            "<font color='#B71C1C'>2.</font> Aby mladí ľudia, ktorí hľadajú zmysel života, vytrvali v spoločenstve s Bohom i Cirkvou.<br><br>" +
                            "<font color='#B71C1C'>3.</font> Aby sa napĺňali túžby ľudskej rodiny po pravom pokoji a bratskej láske.<br><br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme spolupracovali s Bohom na prejavoch starostlivosti voči chorým, opusteným, chudobným a prenasledovaným.<br><br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme boli ochotní konkrétne pomáhať sociálne slabším a ľuďom, ktorí sa nachádzajú v núdzi.<br><br>"
            },
    };

    String[] rozpustenie_ludu = {
            "Potom diakon alebo sám kňaz, obrátený k ľudu, so zopätými rukami povie:",
                    "Choďte v mene Božom.",
                    "Alebo:",
                    "Choďte a ohlasujte Pánovo evanjelium.",
                    "Alebo:",
                    "Choďte v pokoji a oslavujte Pána svojím životom.",
                    "Alebo:",
                    "Choďte v pokoji.",
                    "Ľud odpovie:",
                    "Bohu vďaka."
    };
}

