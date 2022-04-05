package sk.missa.interfaces;

/*
 * uvodnyPozdrav - formuly úvodného pozdravu celebranta
 * ukonKajucnosti - úkon kajúcnosti rozdelení na obdobia a významné sviatky
 * gloria_vypis - glória
 * kredo_vypis - krédo
 * modlitby - modlitby nad ľudom
 * obrad_prijimania - strieda sa menší text s normálnym
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
 * rozpustenie_ludu
 * pozehnanie_sviec_procesia - na Obetovanie Pána (2.2.)
 */

public interface Texty {
    String uvodnyPozdrav = "<font color='#B71C1C'>Kňaz:</font>Milosť nášho Pána Ježiša Krista a láska Boha Otca i spoločenstvo Ducha Svätého nech je s vami všetkými.<br>" +
            "<font color='#B71C1C'>Ľud:</font> I s duchom tvojim.<br>" +
            "<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Milosť vám a pokoj od Boha, nášho Otca, i od Pána Ježiša Krista.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Nech je požehnaný Boh a Otec nášho Pána Ježiša Krista.<br>" +
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
            "<font color='#B71C1C'>Ľud:</font> Nech je požehnaný Boh a Otec nášho Pána Ježiša Krista.<br>" +
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

    String[] kredo_vypis = {"Verím v jedného Boha,<br>" +
            "Otca všemohúceho,<br>" +
            "Stvoriteľa neba i zeme,<br>" +
            "sveta viditeľného i neviditeľného.<br>" +
            "Verím v jedného Pána Ježiša Krista,<br>" +
            "jednorodeného Syna Božieho,<br>" +
            "zrodeného z Otca pred všetkými vekmi;<br>" +
            "Boha z Boha, Svetlo zo Svetla,<br>" +
            "pravého Boha z Boha pravého,<br>" +
            "splodeného, nie stvoreného,<br>" +
            "jednej podstaty s Otcom.<br>" +
            "Skrze neho bolo všetko stvorené.<br>" +
            "On pre nás ľudí a pre našu spásu<br>" +
            "zostúpil z nebies.<br>",
            "Pri slovách","<m> A mocou Ducha Svätého… a stal sa človekom ","sa všetci uklonia.",
            "<br>A mocou Ducha Svätého" +
                    "vzal si telo z Márie Panny<br>" +
                    "a stal sa človekom.<br>" +
                    "Za nás bol aj ukrižovaný za vlády Poncia Piláta,<br>" +
                    "bol umučený a pochovaný,<br>" +
                    "ale tretieho dňa vstal z mŕtvych podľa Svätého písma.<br>" +
                    "A vystúpil do neba,<br>" +
                    "sedí po pravici Otca.<br>" +
                    "A zasa príde v sláve súdiť živých i mŕtvych<br>" +
                    "a jeho kráľovstvu nebude konca.<br>" +
                    "Verím v Ducha Svätého,<br>" +
                    "Pána a Oživovateľa,<br>" +
                    "ktorý vychádza z Otca i Syna.<br>" +
                    "Jemu sa zároveň vzdáva<br>" +
                    "tá istá poklona a sláva ako Otcovi a Synovi.<br>" +
                    "On hovoril ústami prorokov.<br>" +
                    "Verím v jednu, svätú, katolícku, apoštolskú Cirkev.<br>" +
                    "Vyznávam jeden krst na odpustenie hriechov<br>" +
                    "a očakávam vzkriesenie mŕtvych<br>" +
                    "a život budúceho veku. Amen."};

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

    String[] obrad_prijimania = { "Kňaz položí kalich a paténu, zopne ruky a povie:",
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
                    "ale zbav nás zlého.",
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
            "Lebo tvoje je kráľovstvo a moc i sláva naveky.",
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
            "A podajú si ruky s najbližšie stojacimi ako znak pokoja, spoločenstva a lásky; kňaz dá znak pokoja diakonovi alebo posluhujúcemu.\n"+
            "Potom kňaz vezme hostiu, rozlomí ju nad paténou a kúsok hostie vpustí do kalicha, pričom potichu hovorí:",
            "Toto zmiešanie Tela a Krvi nášho Pána Ježiša Krista nech nám prijímajúcim osoží pre večný život.",
            "Medzitým sa spieva alebo recituje:",
            "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n" +
                    "Baránok Boží, ty snímaš hriechy sveta: zmiluj sa nad nami.\n" +
                    "Baránok Boží, ty snímaš hriechy sveta: daruj nám pokoj.",
            "Ak lámanie chleba trvá dlhšie, možno toto zvolanie opakovať viackrát. Len posledné zvolanie sa zakončí slovami: daruj nám pokoj.\n" +
                    "Potom kňaz so zopätými rukami potichu hovorí:",
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
                    "Bratia, vy ste Božia stavba.<br>" +
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
                    "Keď potom vstal z mŕtvych, jeho učeníci si spomenuli, že toto hovoril, a uverili Písmu i slovu, ktoré povedal Ježiš.<br>" +
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
                    "<font color='#B71C1C'>K.:</font> Choďte v mene Božom.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka."};

    String[] popol = {"",
            "Po homílii kňaz postojačky a so zopätými rukami hovorí:\n",
            "Drahí bratia a sestry, pokorne prosme Boha Otca,<br>" +
            "aby hojnou milosťou požehnal tento popol,<br>" +
            "ktorým budeme poznačení na znak kajúcnosti.<br>",
            "Po krátkej tichej modlitbe pokračuje s rozopätými rukami:\n",
            "Bože, ty sa skláňaš k poníženým<br>" +
                    "a uzmieruješ kajúcnikov;<br>" +
                    "dobrotivo vypočuj naše prosby<br>" +
                    "a láskavo nás <font color='#B71C1C'>✠</font> požehnaj,<br>" +
                    "keď budeme poznačení týmto popolom,<br>" +
                    "aby sme v nastávajúcom Pôstnom období<br>" +
                    "konali skutky pokánia<br>" +
                    "a s očisteným srdcom mohli sláviť<br>" +
                    "veľkonočné tajomstvo tvojho Syna.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Milosrdný Bože,<br>" +
                    "ty nechceš smrť hriešnika, ale jeho obrátenie.<br>" +
                    "Milostivo vypočuj naše prosby<br>" +
                    "a vo svojej otcovskej láske požehnaj <font color='#B71C1C'>✠</font> tento popol,<br>" +
                    "ktorým si dáme poznačiť hlavy,<br>" +
                    "lebo uznávame, že sme prach a na prach sa obrátime.<br>" +
                    "Daj, prosíme, aby sme v tomto Pôstnom období<br>" +
                    "úprimnou kajúcnosťou dosiahli odpustenie hriechov,<br>" +
                    "začali nový život a stále viac sa podobali<br>" +
                    "tvojmu vzkriesenému Synovi.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen.<br>",
            "Kňaz mlčky pokropí popol požehnanou vodou. Potom poznačí popolom všetkých prítomných, ktorí k nemu prídu.\n" +
                    "Každému povie:\n",
            "Kajajte sa a verte evanjeliu. <font color='#B71C1C'>(Mk 1, 15)</font><br>" +
            "<font color='#B71C1C'>Alebo:</font><br>" +
            "Pamätaj, že si prach a na prach sa obrátiš. <font color='#B71C1C'>(Porov. Gn 3, 19)</font><br>",
            "Medzitým sa spieva:\n",
            "<font color='#B71C1C'>ANTIFÓNA 1</font><br>" +
            "Obnovme sa v duchu poníženosti a pokánia,<br>" +
            "postime sa a skrúšene prosme Pána,<br>" +
            "lebo náš Boh je veľmi milosrdný a odpustí nám hriechy.<br>" +
            "<font color='#B71C1C'>ANTIFÓNA 2 (Porov. Joel 2, 17; Est 4, 17)</font><br>" +
            "Medzi predsieňou a oltárom nech plačú kňazi, Pánovi služobníci,<br>" +
            "a nech hovoria: Zľutuj sa, Pane, nad svojím ľudom<br>" +
                    "a nezatváraj ústa, ktoré ťa ospevujú.<br>" +
            "<font color='#B71C1C'>ANTIFÓNA 3 (Ž 51, 3)</font><br>" +
            "Pane, zmy zo mňa moju vinu.<br>",
            "Túto antifónu možno opakovať po jednotlivých veršoch Žalmu 51 (","<m>Zmiluj sa, Bože, nado mnou",").\n",
            "<font color='#B71C1C'>RESPONZÓRIUM (Porov. Bar 3, 2; Ž 79, 9)</font><br>" +
            "<font color='#B71C1C'>℟.</font> Kajajme sa, lebo sme sa previnili a polepšime sa, aby nás<br>" +
                    "neprekvapila smrť; potom by sme už márne chceli robiť pokánie. <font color='#B71C1C'>*</font><br>" +
                    "Vyslyš, Pane, a zmiluj sa, lebo sme sa prehrešili proti tebe.<br>" +
                    "<font color='#B71C1C'>℣.</font> Pre slávu svojho mena nám pomôž, Bože, naša spása a vysloboď nás. <font color='#B71C1C'>*</font><br>" +
                    "Vyslyš, Pane, a zmiluj sa, lebo sme sa prehrešili proti tebe.<br>",
            "Možno spievať aj inú vhodnú pieseň (napríklad z JKS).\n" +
                    "Keď sa skončilo značenie popolom, kňaz si umyje ruky. Nasleduje modlitba veriacich. Po nej omša pokračuje zvyčajným spôsobom.\n" +
                    "Vyznanie viery sa vynechá.\n"
    };

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
                    "Lebo on je Boh a s tebou žije<br>" +
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
            "<font color='#B71C1C'>Kňaz:</font> Nech rozžiari svoju tvár nad vami a nech vám je milostivý.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> Nech k vám obráti svoju tvár a nech vám daruje pokoj.<br>" +
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
            "<font color='#B71C1C'>Kňaz:</font> A požehnanie všemohúceho Boha, Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého, nech zostúpi na vás a zostane vždy s vami.<br>" +
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
            "<font color='#B71C1C'>Ľud:</font> Amen.<br>" +
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
            {"Príprava obetných darov", "Kňaz stojí pri oltári, vezme paténu s chlebom, oboma rukami ju drží trocha pozdvihnutú nad oltárom a potichu hovorí:",
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
                    "Požehnaný si, Pane, Bože všetkého stvorenia,\n" +
                            "pretože sme z tvojej štedrosti prijali toto víno.\n" +
                            "Obetujeme ti ho ako plod viniča a práce ľudských rúk,\n" +
                            "aby sa nám stalo duchovným nápojom.",
                            "Potom položí kalich na korporál.\n" +
                                    "Ak sa nespieva spev na obetovanie, kňaz môže tieto slová predniesť nahlas. Na konci môže ľud zvolať:",
                    "Požehnaný Boh naveky!",
                    "Potom sa kňaz hlboko skloní a potichu povie:",
                    "Prijmi nás, Pane,\n" +
                            "v duchu pokorných a v srdci skrúšených,\n" +
                            "a naša dnešná obeta\n" +
                            "nech nájde zaľúbenie v tvojich očiach.",
                    "Potom si kňaz stojac na boku oltára umyje ruky a potichu hovorí:",
                    "Pane, zmy zo mňa moju vinu a očisť ma od hriechu.",
                    "Kňaz stojí uprostred oltára obrátený tvárou k ľudu, rozopne a znova zloží ruky, pričom hovorí:",
                    "Modlite sa, bratia a sestry, aby sa moja i vaša obeta zaľúbila všemohúcemu Bohu Otcovi.",
                    "Ľud vstane a odpovie:",
                    "Nech Pán prijme obetu z tvojich rúk na chválu a slávu svojho mena,\n" +
                            "na úžitok nám i celej svätej Cirkvi."},
            {"Pred spevom na prijímanie", "Kňaz, obrátený k oltáru, potichu hovorí:",
                    "Telo Kristovo nech ma zachová pre večný život.",
                    "Úctivo prijme Kristovo Telo.\n"+
                    "Potom vezme kalich a potichu hovorí:",
                    "Krv Kristova nech ma zachová pre večný život.",
                    "Úctivo prijme Kristovu Krv."},
            {"Po speve na prijímanie", "Pri purifikovaní kňaz potichu hovorí:", "Pane, čo sme prijali ústami,\n" +
                    "nech očistí naše srdce\n" +
                    "a časný dar nech sa nám stane\n" +
                    "zárukou večného života."}
    };

    String teba_Boze_chvalime = "Teba, Bože, chválime,\n" +
            "teba, Pane, velebíme,\n" +
            "Teba, večný Otče,\n" +
            "uctieva celá zem.\n" +
            "Tebe všetci anjeli,\n" +
            "tebe nebesia i všetky mocnosti,\n" +
            "tebe cherubíni a serafíni\n" +
            "bez prestania prespevujú:\n" +
            "Svätý, svätý, svätý\n" +
            "Pán, Boh zástupov.\n" +
            "Plné sú nebo i zem\n" +
            "tvojej veleby a slávy.\n" +
            "\n" +
            "Teba oslavuje\n" +
            "slávny zbor apoštolov;\n" +
            "teba velebí\n" +
            "veľký počet prorokov;\n" +
            "teba chváli\n" +
            "vznešený zástup mučeníkov;\n" +
            "teba oslavuje\n" +
            "svätá Cirkev po celej zemi,\n" +
            "teba, Otče,\n" +
            "nesmierne velebného,\n" +
            "i tvojho milovaného,\n" +
            "pravého a jediného Syna,\n" +
            "aj Ducha Svätého,\n" +
            "Tešiteľa nášho.\n" +
            "\n" +
            "Kriste,\n" +
            "ty si kráľ slávy.\n" +
            "Ty si Otcov Syn\n" +
            "od večnosti.\n" +
            "Ty si neváhal vstúpiť do života Panny,\n" +
            "stal si sa človekom, aby si vykúpil človeka.\n" +
            "Ty si zvíťazil nad smrťou\n" +
            "a otvoril si veriacim nebeské kráľovstvo.\n" +
            "Ty sedíš po pravici Boha\n" +
            "v sláve svojho Otca.\n" +
            "Veríme,\n" +
            "že ako sudca ešte raz prídeš.\n" +
            "\n" +
            "Preto ťa prosíme, pomáhaj svojim služobníkom,\n" +
            "ktorých si vykúpil predrahou krvou.\n" +
            "Pripočítaj nás k svojim svätým\n" +
            "vo večnej sláve.\n" +
            "\n" +
            "Zachráň, Pane, svoj ľud\n" +
            "a žehnaj svojich dedičov.\n" +
            "A spravuj ich\n" +
            "a vyvýš ich až naveky.\n" +
            "Po všetky dni\n" +
            "dobrorečíme tebe.\n" +
            "A chválime tvoje meno naveky,\n" +
            "až na veky večné.\n" +
            "Vo svojej láskavosti, Pane,\n" +
            "chráň nás v tento deň pred hriechom.\n" +
            "Zmiluj sa, Pane, nad nami,\n" +
            "zmiluj sa nad nami.\n" +
            "Tvoje milosrdenstvo, Pane, nech je nad nami,\n" +
            "ako dúfame v teba.\n" +
            "V teba, Pane, som dúfal,\n" +
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

    String[][] kvetna_nedela = {
            {"red|small", "1. V tento deň si Cirkev pripomína Ježišov vstup do Jeruzalema, aby tam uskutočnil svoje veľkonočné tajomstvo. Preto sa vo všetkých omšiach koná spomienka na Pánov vstup do Jeruzalema, a to procesiou alebo slávnostným vstupom pred hlavnou omšou a jednoduchým vstupom pred inými omšami. Slávnostný vstup, nie však procesia, sa môže opakovať aj pred inými omšami, na ktorých sa zúčastňuje mnoho veriacich. Je vhodné, aby sa tam, kde nemôže byť procesia ani slávnostný vstup, konala bohoslužba slova o Mesiášovom vstupe do Jeruzalema a o Pánovom umučení, a to v sobotu večer alebo vo vhodnom čase v nedeľu."},
            {"bold|center", "Spomienka na Pánov vstup do Jeruzalema"},
            {"center", "Prvý spôsob: Procesia"},
            {"red|small", "2. Veriaci sa v určenú hodinu zhromaždia v menšom kostole alebo na inom vhodnom mieste mimo toho kostola, do ktorého sa má ísť v procesii. Veriaci majú v rukách ratolesti.\n" +
                    "3. Kňaz a diakon v červenom omšovom rúchu prídu s posluhujúcimi na miesto, kde sa zhromaždili veriaci. Kňaz môže mať namiesto ornátu pluviál, ktorý po procesii odloží, a vezme si ornát.\n" +
                    "4. Medzitým sa spieva nasledujúca antifóna alebo iný vhodný spev."},
            {"separated", "red", "ANTIFÓNA", "(Mt 21, 9)"},
            {"", "Hosanna synovi Dávidovmu!\n" +
                    "Požehnaný, ktorý prichádza v mene Pánovom! Kráľ Izraela!\n" +
                    "Hosanna na výsostiach!"},
            {"html|small", "<font color='#B71C1C'>5. Kňaz a veriaci sa prežehnajú, pričom kňaz hovorí: </font>V mene Otca i Syna i Ducha Svätého<font color='#B71C1C'>. Potom kňaz pozdraví ľud zvyčajným spôsobom. Krátkym príhovorom povzbudí veriacich, aby sa aktívne a vedome zúčastnili na slávnosti tohto dňa. Môže tak urobiť týmito alebo podobnými slovami:</font>"},
            {"", "Drahí bratia a sestry, od začiatku Pôstneho obdobia sme si pripravovali srdcia pokáním a skutkami kresťanskej lásky. Dnes sa schádzame, aby sme spolu s celou Cirkvou začali sláviť veľkonočné tajomstvo nášho Pána, ktoré uskutočnil svojou smrťou a zmŕtvychvstaním; preto prišiel do svojho mesta Jeruzalema. S vierou a nábožnosťou oslávme teda spomienku na jeho spásonosný vstup do Jeruzalema. Nasledujme Pána, aby sme mali účasť na zmŕtvychvstaní a večnom živote, ktorý dosiahneme, keď s pomocou milosti budeme spolu s ním trpieť."},
            {"red|small", "6. Po príhovore sa kňaz modlí s rozopätými rukami jednu z týchto modlitieb:"},
            {"html", "Modlime sa.<br>" +
                    "Všemohúci a večný Bože,<br>" +
                    "posväť <font color='#B71C1C'>✠</font> tieto ratolesti svojím požehnaním, <font color='#B71C1C'>*</font><br>" +
                    "aby sme skrze Krista Kráľa,<br>" +
                    "ktorého s plesaním nasledujeme, <font color='#B71C1C'>—</font><br>" +
                    "mohli vojsť do večného Jeruzalema.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|small", "Alebo:"},
            {"html", "Bože, posilni vieru tých, čo dúfajú v teba,<br>" +
                    "a láskavo vypočuj modlitby prosiacich, <font color='#B71C1C'>*</font><br>" +
                    "aby sme ti v Kristovi,<br>" +
                    "ktorému dnes ako víťazovi mávame ratolesťami, <font color='#B71C1C'>—</font><br>" +
                    "prinášali ovocie dobrých skutkov.<br>" +
                    "Lebo on žije a kraľuje na veky vekov.<br>" +
                    "<font color='#B71C1C'>℟.</font> Amen."},
            {"red|small", "Mlčky pokropí ratolesti požehnanou vodou.\n" +
                    "7. Potom diakon, alebo ak ho niet, sám kňaz prednáša zvyčajným spôsobom evanjelium o Pánovom vstupe do Jeruzalema z jedného zo štyroch evanjelií. Podľa okolností možno použiť kadidlo."},
            {"center|italic", "Požehnaný, ktorý prichádza v mene Pánovom"},
            {"red|bold", "V ROKU A"},
            {"separated", "html", "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Matúša", "<font color='#B71C1C'>21, 1 – 11</font>"},
            {"", "Keď sa priblížili k Jeruzalemu a prišli do Betfage pri Olivovej hore, Ježiš poslal dvoch učeníkov a povedal im: „Choďte do dediny, čo je pred vami, a hneď nájdete priviazanú oslicu a s ňou osliatko! Odviažte ich a priveďte ku mne! A keby vám niekto niečo hovoril, povedzte: ,Pán ich potrebuje.‘ A hneď ich prepustí.“\n" +
                    "Toto sa stalo, aby sa splnilo, čo predpovedal prorok: „Povedzte dcére sionskej: Hľa, tvoj Kráľ prichádza k tebe, tichý, sediaci na oslici, na osliatku, mláďati ťažného zvieraťa.“\n" +
                    "Učeníci šli a urobili, ako im Ježiš rozkázal. Priviedli oslicu a osliatko, pokládli na ne svoje plášte a on si na ne sadol. Veľké zástupy prestierali na cestu svoje plášte, iní odtínali zo stromov ratolesti a stlali ich na cestu. A zástupy, čo išli pred ním, i tie, čo šli za ním, volali:\n" +
                    "„Hosanna synovi Dávidovmu! Požehnaný, ktorý prichádza v mene Pánovom! Hosanna na výsostiach!“\n" +
                    "Keď vošiel do Jeruzalema, rozvírilo sa celé mesto; vypytovali sa: „Kto je to?“ A zástupy hovorili: „To je ten prorok, Ježiš z galilejského Nazareta.“\n" +
                    "Počuli sme slovo Pánovo."},
            {"red|bold", "V ROKU B"},
            {"separated", "html", "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Marka", "<font color='#B71C1C'>11, 1 – 10</font>"},
            {"", "Keď sa blížili k Jeruzalemu, k Betfage a Betánii pri Olivovej hore, poslal Ježiš dvoch svojich učeníkov a povedal im: „Choďte do dediny, čo je pred vami. A len čo do nej vojdete, nájdete priviazané osliatko, na ktorom ešte nijaký človek nesedel. Odviažte ho a priveďte. A keby vám niekto hovoril: ,Čo to robíte?‘, povedzte: ,Pán ho potrebuje a hneď ho zasa sem vráti.‘ “\n" +
                    "Oni odišli a na rázcestí našli osliatko, priviazané vonku pri bráne; i odviazali ho. Niektorí z tých, čo tam stáli, im vraveli: „Čo to robíte, prečo odväzujete osliatko?“ Oni im povedali, ako im kázal Ježiš, a nechali ich.\n" +
                    "Osliatko priviedli k Ježišovi, pokládli naň svoje plášte a on si naň sadol. Mnohí prestierali na cestu svoje plášte, iní zasa zelené ratolesti, čo narezali v poli. A tí, čo išli pred ním, aj tí, čo šli za ním, volali:\n" +
                    "„Hosanna! Požehnaný, ktorý prichádza v mene Pánovom! Požehnané kráľovstvo nášho otca Dávida, ktoré prichádza! Hosanna na výsostiach!“\n" +
                    "Počuli sme slovo Pánovo."},
            {"red|small", "Alebo:"},
            {"separated", "html", "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Jána", "<font color='#B71C1C'>12, 12 – 16</font>"},
            {"", "Keď sa veľký zástup, čo prišiel na sviatky, dopočul, že Ježiš prichádza do Jeruzalema, nabrali palmových ratolestí, vyšli mu v ústrety a volali: „Hosanna! Požehnaný, ktorý prichádza v mene Pánovom, Kráľ Izraela!“\n" +
                    "Ježiš si našiel osliatko a sadol si naň, ako je napísané: „Neboj sa, dcéra sionská. Hľa, tvoj kráľ prichádza, sediaci na mláďati oslice.“\n" +
                    "Jeho učeníci tomu ešte nerozumeli, ale keď bol Ježiš oslávený, spomenuli si, že to bolo o ňom napísané a že mu to urobili.\n" +
                    "Počuli sme slovo Pánovo."},
            {"red|bold", "V ROKU C"},
            {"separated", "html", "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Lukáša", "<font color='#B71C1C'>19, 28 – 40</font>"},
            {"", "Ježiš išiel popredku a uberal sa do Jeruzalema. Keď sa priblížil k Betfage a Betánii pri hore, ktorá sa volá Olivová, poslal dvoch učeníkov so slovami: „Choďte do dediny, čo je pred vami. Len čo do nej vojdete, nájdete priviazané osliatko, na ktorom nikdy nijaký človek nesedel. Odviažte ho a priveďte! A keby sa vás niekto opýtal: ,Prečo ho odväzujete?‘, poviete: ,Pán ho potrebuje.‘ “\n" +
                    "Tí, ktorých poslal, odišli a našli všetko tak, ako im povedal. Keď osliatko odväzovali, povedali im jeho majitelia: „Prečo odväzujete osliatko?“ Oni povedali: „Pán ho potrebuje.“ Osliatko priviedli k Ježišovi, prehodili cezeň svoje plášte a posadili naň Ježiša. Ako šiel, prestierali na cestu svoje plášte. A keď sa už blížil k úpätiu Olivovej hory, začali celé zástupy učeníkov radostne veľkým hlasom chváliť Boha za všetky zázraky, ktoré videli, a volali: „Požehnaný kráľ, ktorý prichádza v mene Pánovom! Pokoj na nebi a sláva na výsostiach!“\n" +
                    "Vtedy mu niektorí farizeji zo zástupu povedali: „Učiteľ, napomeň svojich učeníkov!“ On odvetil: „Hovorím vám: Ak budú oni mlčať, budú kričať kamene.“\n" +
                    "Počuli sme slovo Pánovo."},
            {"red|small", "8. Po evanjeliu môže byť krátka homília. Potom kňaz alebo diakon, prípadne iný posluhujúci, dá pokyn na procesiu týmito alebo podobnými slovami:"},
            {"", "Bratia a sestry, ako kedysi zástupy v Jeruzaleme,\n" +
                    "tak aj my dnes volajme Ježišovi na slávu.\n" +
                    "Poďme v pokoji!"},
            {"red|small", "Alebo:"},
            {"", "Poďme v pokoji."},
            {"red|small", "Všetci odpovedia:"},
            {"", "V mene Kristovom. Amen."},
            {"red|small", "9. Procesia sa zvyčajným spôsobom pohne ku kostolu, v ktorom sa bude sláviť svätá omša, v tomto poradí: vpredu ide turiferár s dymiacou kadidelnicou (ak sa mieni používať). Za ním ide akolyta alebo iný posluhujúci s krížom ozdobeným ratolesťami podľa miestnych zvyklostí, po jeho bokoch dvaja posluhujúci so zažatými sviecami. Potom kráča diakon nesúci evanjeliár, kňaz s posluhujúcimi a za nimi idú všetci veriaci s ratolesťami v rukách.\n" +
                    "Pri procesii zbor a ľud spievajú nasledujúci spev alebo inú vhodnú pieseň k úcte Krista Kráľa."},
            {"red|bold", "ANTIFÓNA 1"},
            {"", "Jeruzalemské deti išli s olivovými ratolesťami v rukách\n" +
                    "v ústrety Pánovi a nadšene volali: Hosanna na výsostiach!"},
            {"red|small", "Antifóna sa môže opakovať po jednotlivých strofách tohto žalmu."},
            {"red|bold", "ŽALM 24"},
            {"", "Pánova je zem i všetko, čo ju napĺňa,\n" +
                    "okruh zeme aj tí, čo bývajú na ňom.\n" +
                    "Veď on sám položil jeho základy na moriach\n" +
                    "a upevnil ho na vodách."},
            {"red|small", "(opakuje sa antifóna)"},
            {"", "Kto smie vystúpiť na vrch Pánov,\n" +
                    "kto smie stáť na jeho mieste posvätnom?\n" +
                    "Ten, čo má ruky nevinné a srdce čisté,\n" +
                    "čo nedvíha svoju dušu k márnosti\n" +
                    "a neprisahá falošne."},
            {"red|small", "(opakuje sa antifóna)"},
            {"", "Taký dostane požehnanie od Pána\n" +
                    "a odmenu od Boha, svojho spasiteľa.\n" +
                    "To je pokolenie tých, čo ho hľadajú,\n" +
                    "čo hľadajú tvár Boha Jakubovho."},
            {"red|small", "(opakuje sa antifóna)"},
            {"", "Zdvihnite, brány, svoje hlavice\n" +
                    "a vyvýšte sa, brány prastaré,\n" +
                    "lebo má vstúpiť kráľ slávy.\n" +
                    "Kto je ten kráľ slávy?\n" +
                    "Pán silný a mocný, Pán mocný v boji."},
            {"red|small", "(opakuje sa antifóna)"},
            {"", "Zdvihnite, brány, svoje hlavice\n" +
                    "a vyvýšte sa, brány prastaré,\n" +
                    "lebo má vstúpiť kráľ slávy.\n" +
                    "Kto je ten kráľ slávy?\n" +
                    "Pán zástupov, to je ten kráľ slávy."},
            {"red|small", "(opakuje sa antifóna)"},
            {"red|bold", "ANTIFÓNA 2"},
            {"", "Jeruzalemské deti prestierali na cestu svoje plášte a nadšene volali:\n" +
                    "Hosanna Synovi Dávidovmu!\n" +
                    "Požehnaný, ktorý prichádza v mene Pánovom!"},
            {"red|small", "Antifóna sa môže opakovať po jednotlivých strofách tohto žalmu."},
            {"red|bold", "ŽALM 47"},
            {"", "Tlieskajte rukami, všetky národy,\n" +
                    "jasajte Bohu hlasom radostným.\n" +
                    "Lebo Pán je najvyšší a hrozný,\n" +
                    "nad celou zemou veľký kráľ."},
            {"red|small", "(opakuje sa antifóna)"},
            {"", "Podmaňuje nám národy\n" +
                    "a pohanov nám kladie pod nohy.\n" +
                    "On pre nás vybral dedičstvo,\n" +
                    "slávu Jakuba, ktorého má rád.\n" +
                    "Za jasotu vystupuje Boh,\n" +
                    "Pán vystupuje za hlaholu poľnice."},
            {"red|small", "(opakuje sa antifóna)"},
            {"", "Spievajte Bohu, spievajte.\n" +
                    "Spievajte nášmu kráľovi, spievajte.\n" +
                    "Pretože Boh je kráľom celej zeme;\n" +
                    "spievajte mu chválospev."},
            {"red|small", "(opakuje sa antifóna)"},
            {"", "Boh kraľuje nad národmi,\n" +
                    "Boh sedí na svojom svätom tróne.\n" +
                    "Kniežatá národov sa spolčujú\n" +
                    "s národom Boha Abrahámovho.\n" +
                    "Veď Bohu patria mocní zeme,\n" +
                    "tak veľmi je vyvýšený."},
            {"red|small", "(opakuje sa antifóna)"},
            {"red|bold", "HYMNUS KRISTA KRÁĽA"},
            {"red", "Refrén:"},
            {"", "Buď sláva, česť a chvála tebe, Kráľ, Vykupiteľ, Kristus!\n" +
                    "To tebe deti s kvetmi spievajú zbožne Hosanna.\n" +
                    "1. Ty si Kráľ Izraela, vznešený Dávidov potomok.\n" +
                    "Prichádzaš v mene Pánovom, ty, Kráľ náš požehnaný."},
            {"red", "Refrén:"},
            {"", "2. Na výsostiach ťa chvália zástupy nebešťanov\n" +
                    "a ľudia smrteľní na zemi, stvorenie všetko s nimi."},
            {"red", "Refrén:"},
            {"", "3. Židovský národ vyšiel oproti tebe s palmami.\n" +
                    "My ťa teraz vítame hymnom a sľubmi, prosbami."},
            {"red", "Refrén:"},
            {"", "4. Oni ti vtedy spievali a ty si kráčal k utrpeniu.\n" +
                    "Naše piesne dnes, Kráľu, znejú ti iba na slávu."},
            {"red", "Refrén:"},
            {"", "5. Keď sa ti oni zaľúbili, aj našu zbožnosť si obľúb.\n" +
                    "Kráľ dobrý, Kráľ láskavý, ty v dobrom vždy máš záľubu."},
            {"red", "Refrén:"},
            {"red|small", "10. Keď procesia vchádza do kostola, spieva sa nasledujúce responzórium alebo iný vhodný spev o Ježišovom vstupe do Jeruzalema."},
            {"html", "Keď Pán vchádzal do Svätého mesta, jeruzalemské deti ohlasovali vzkriesenie života.<br>" +
                    "<font color='#B71C1C'>*</font> S palmovými ratolesťami v rukách volali: Hosanna na výsostiach!<br>" +
                    "Keď ľudia počuli, že Ježiš prichádza do Jeruzalema, vyšli mu v ústrety.<br>" +
                    "<font color='#B71C1C'>*</font> S palmovými ratolesťami v rukách volali: Hosanna na výsostiach!"},
            {"red|small", "11. Keď kňaz príde k oltáru, uctí si ho, prípadne ho aj incenzuje. Potom ide k sedadlu, kde odloží pluviál, ak ho mal oblečený, a vezme si ornát. Vynechá zvyšné úvodné omšové obrady, a podľa okolností Kýrie, a prednesie kolektu omše. Omša potom pokračuje zvyčajným spôsobom."},
            {"center", "Druhý spôsob: Slávnostný vstup"},
            {"red|small", "12. Ak nie je možné usporiadať procesiu mimo kostola, spomienka na Pánov vstup do Jeruzalema sa oslávi v kostole, a to slávnostným vstupom na začiatku hlavnej svätej omše.\n" +
                    "13. Veriaci s ratolesťami v rukách sa zhromaždia pred bránou kostola alebo v kostole samom. Kňaz, posluhujúci a skupina zástupcov ľudu prídu na stanovené miesto mimo presbytéria. Toto miesto nech sa zvolí tak, aby aspoň väčšia časť veriacich mohla sledovať obrad."},
            {"html|small", "<font color='#B71C1C'>14. Kým kňaz ide na určené miesto, ľud spieva </font>Hosanna<font color='#B71C1C'> (pozri č. 4) alebo iný vhodný spev. Požehnanie ratolestí a čítanie evanjelia o Pánovom vstupe do Jeruzalema sa koná, ako je uvedené vyššie (pozri č. 5 – 7). Po evanjeliu kňaz, posluhujúci a skupina zástupcov ľudu slávnostne idú cez kostol k presbytériu. Pritom sa spieva </font>Keď Pán vchádzal<font color='#B71C1C'> (pozri č. 10) alebo iný vhodný spev.<br>" +
                    "15. Keď kňaz príde k oltáru, uctí si ho, odíde k sedadlu, vynechá úvodné omšové obrady, a podľa okolností </font>Kýrie<font color='#B71C1C'>, a hneď prednesie kolektu omše. Omša potom pokračuje zvyčajným spôsobom."},
            {"center", "Tretí spôsob: Jednoduchý vstup"},
            {"red|small", "16. Vo všetkých ostatných omšiach tejto nedele, v ktorých sa nekoná slávnostný vstup, Pánov vstup do Jeruzalema sa pripomína jednoduchým vstupom.\n" +
                    "17. Keď kňaz ide k oltáru, spieva sa vstupný spev so žalmom (pozri č. 18) alebo iný spev s rovnakou myšlienkou. Keď kňaz príde k oltáru, uctí si ho a odíde k sedadlu. Po prežehnaní pozdraví ľud; omša potom pokračuje zvyčajným spôsobom.\n" +
                    "V omšiach, v ktorých vstupný spev nemožno spievať, kňaz, len čo príde k oltáru a uctí si ho, pozdraví ľud, prečíta vstupný spev a omša pokračuje zvyčajným spôsobom."},
    };

    String modlitba_zasvatenia = "<font color='#B71C1C'>Po svätom prijímaní kňaz nechá na oltári cibórium alebo vloží Hostiu do monštrancie a prikryje ju priesvitným závojom. Po modlitbe po prijímaní odhalí monštranciu a zíde ku kľačadlu. Vezme kadidelnicu a incenzuje Sviatosť. Ak je na oltári iba cibórium, incenzácia Sviatosti môže byť, ale nemusí. Medzitým sa spieva:</font><br>" +
            "<br>" +
            "<font color='#B71C1C'>PIESEŇ (JKS 499, 1)</font><br>" +
            "Ó, Kriste, veľký Kráľu náš,<br>" +
            "čo svetom, nebom vládneš,<br>" +
            "ty božskej moci berlu máš<br>" +
            "a láskou večne vládneš.<br>" +
            "(:Ježišu, Kráľu, prijmi svoj ľud,<br>" +
            "vrelý ti lásky skladáme sľub:<br>" +
            "za tebou, Kráľu, vždy ísť chceme,<br>" +
            "za tebou vždy ísť chceme:)<br>" +
            "<br>"+
            "<font color='#B71C1C'>Alebo: (JKS 270, 1)</font><br>"+
            "Klaniam sa ti vrúcne<br>"+
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
            "Ako Boží vyvolenci, svätí a milovaní, oblečte si hlboké milosrdenstvo, láskavosť, pokoru, miernosť a trpezlivosť. Znášajte sa navzájom a odpúšťajte si, ak by mal niekto niečo proti druhému. Ako Pán odpustil vám, tak aj vy! Ale nad všetko toto majte lásku, ktorá je zväzkom dokonalosti! A vo vašich srdciach nech vládne Kristov pokoj. Preň ste aj povolaní v jednom tele. A buďte vďační!<br>"+
            "<font color='#B71C1C'>Alebo: (1Kor 15, 25-28)</font><br>"+
            "Apoštol Pavol hovorí:<br>"+
            "On musí kraľovať, kým mu nepoloží všetkých nepriateľov pod nohy. Ako posledný nepriateľ bude zničená smrť, lebo mu všetko položil pod nohy. Ale keď hovorí: „Všetko je podrobené“, je jasné, že okrem toho, ktorý mu všetko podrobil. A keď mu bude všetko podrobené, vtedy sa aj sám Syn podrobí tomu, ktorý mu všetko podrobil, aby bol Boh všetko vo všetkom.<br>"+
            "<br>"+
            "<font color='#B71C1C'>ÚVAHA (Benedikt XV.)</font><br>"+
            "Je krásne hľadieť na Ježišovo Srdce ako symbol jeho nekonečnej lásky. Ešte krajšie je mať ho vždy živého blízko seba, v Oltárnej sviatosti. Najsvätejšie Srdce, ktoré uctievame, nie je mŕtve, nebijúce srdce, na ktoré môžeme iba spomínať. Je to Srdce živé, živé nielen v nebi, kde sídli oslávený človek Kristus Ježiš, ale je živé aj na zemi, všade, kde je Eucharistia. „V Eucharistii nás toto Božské Srdce spravuje a miluje, žije a prebýva s nami, aby sme aj my žili a prebývali v ňom.“<br>"+
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

    String[] rozpustenie_ludu_oktava = {
            "Potom diakon alebo sám kňaz, obrátený k ľudu, so zopätými rukami povie:",
            "Choďte v mene Božom, aleluja, aleluja.",
            "Alebo:",
            "Choďte v pokoji, aleluja, aleluja.",
            "Ľud odpovie:",
            "Bohu vďaka, aleluja, aleluja"
    };

    String[][] pozehnanie_sviec_procesia = {
            {"Prvý spôsob: Procesia<br>",
                    "<font color='#B71C1C'>1. V určenom čase sa veriaci zídu v menšom kostole alebo na inom vhodnom mieste mimo kostola, ku ktorému sa má procesia uberať. V rukách majú nezažaté sviece.<br>" +
                            "2. Kňaz s posluhujúcimi príde oblečený do bieleho omšového rúcha. Namiesto ornátu môže mať pluviál, ktorý po skončení procesie odloží.<br>" +
                            "3. Kým si veriaci zapaľujú sviece, spieva sa táto antifóna alebo iná vhodná pieseň:</font>",
                    "Hľa, náš Pán <font color='#B71C1C'>*</font> príde s mocou, aby osvietil oči svojich služobníkov, aleluja.",
                    "<font color='#B71C1C'>4. Po skončení spevu kňaz obrátený k ľudu hovorí: </font>V mene Otca i Syna i Ducha Svätého<font color='#B71C1C'>. Potom pozdraví veriacich zvyčajným spôsobom a niekoľkými slovami ich povzbudí, aby sa aktívne zúčastnili na obradoch sviatku. Môže sa im prihovoriť napríklad takto:</font>",
                    "Drahí bratia a sestry, pred štyridsiatimi dňami sme s radosťou oslavovali narodenie Krista Pána. Dnes si pripomíname, ako Panna Mária a svätý Jozef obetovali Ježiša v chráme. Pán Ježiš sa teda podrobil predpisom zákona, ale predovšetkým sa chcel stretnúť so svojím ľudom, ktorý ho s vierou očakával. A naozaj, Simeon a Anna prišli do chrámu vedení Duchom Svätým, ktorý ich osvietil, aby v malom dieťati spoznali svojho Pána. A oni ho vyznali pred všetkými s veľkou radosťou. Aj my sme sa tu zišli z podnetu Ducha Svätého a spoločne pôjdeme do Božieho chrámu stretnúť sa s Kristom. Nájdeme ho a spoznáme pri lámaní eucharistického chleba. Tento božský po\u00AD krm nás posilní, aby sme vydržali na púti, ktorá nás dovedie do nebeskej vlasti, kde sa budeme večne tešiť z Kristovej prítomnosti.",
                    "<font color='#B71C1C'>5. Po týchto slovách kňaz požehná sviece. S rozopätými rukami sa modlí:</font>",
                    "Modlime sa.<br>" +
                            "Bože, pôvodca a zdroj všetkého svetla,<br>" +
                            "ty si dnes spravodlivému Simeonovi<br>" +
                            "ukázal Ježiša Krista ako pravé svetlo,<br>" +
                            "ktoré prišlo osvietiť všetkých ľudí; <font color='#B71C1C'>*</font><br>" +
                            "vrúcne ťa prosíme, vypočuj prosby svojho ľudu:<br>" +
                            "požehnaj <font color='#B71C1C'>✠</font> tieto sviece, ktoré ponesieme<br>" +
                            "v sprievode na tvoju oslavu, a veď nás cestou čnosti, <font color='#B71C1C'>—</font><br>" +
                            "aby sme vošli do svetla večnej slávy.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>℟.</font> Amen.<br>" +
                            "<font color='#B71C1C'>Alebo:</font><br>" +
                            "Bože, ty si pravé svetlo a zdroj každého svetla; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, osvieť naše srdcia<br>" +
                            "nehasnúcim svetlom viery, <font color='#B71C1C'>—</font><br>" +
                            "aby sme všetci, čo vstúpime do tvojho chrámu<br>" +
                            "so zažatými sviecami, šťastlivo vošli do svetla tvojej slávy.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>℟.</font> Amen.",
                    "<font color='#B71C1C'>Kňaz pokropí sviece požehnanou vodou; nič pri tom nehovorí. Po pokropení vloží tymian do kadidelnice na procesiu.<br>" +
                            "6. Potom si kňaz vezme zažatú sviecu a vyzve veriacich na procesiu:</font>",
                    "Poďme v pokoji v ústrety Pánovi!<br>" +
                            "<font color='#B71C1C'>Alebo: </font><br>" +
                            "Poďme v pokoji!",
                    "<font color='#B71C1C'>Na čo všetci odpovedia:</font>",
                    "V mene Kristovom. Amen.",
                    "<font color='#B71C1C'>7. Všetci nesú zažaté sviece. Počas procesie sa spieva antifóna Svetlo na osvietenie pohanov s kantikom (Lk 2, 29 – 32) alebo antifóna Ozdob, alebo iný vhodný spev.</font><br>"},
            {"<font color='#B71C1C'>I</font>",
                    "",
                    "<font color='#B71C1C'>Ant.</font> Svetlo na osvietenie pohanov a slávu Izraela, tvojho ľudu.<br>" +
                            "Teraz prepustíš, Pane, svojho služobníka<br>" +
                            "v pokoji podľa svojho slova.<br>" +
                            "<font color='#B71C1C'>Ant.</font> Svetlo na osvietenie pohanov a slávu Izraela, tvojho ľudu.<br>" +
                            "Lebo moje oči uvideli tvoju spásu.<br>" +
                            "<font color='#B71C1C'>Ant.</font> Svetlo na osvietenie pohanov a slávu Izraela, tvojho ľudu.<br>" +
                            "Ktorú si pripravil pred tvárou všetkých národov.<br>" +
                            "<font color='#B71C1C'>Ant.</font> Svetlo na osvietenie pohanov a slávu Izraela, tvojho ľudu.<br>"},
            {"<font color='#B71C1C'>II</font>", "",
                    "<font color='#B71C1C'>Ant.</font> Ozdob svoju svadobnú miestnosť, Sion, a prijmi Kráľa Krista; objím Máriu, ktorá je nebeskou bránou; veď ona nesie Kráľa slávy nového svetla; ostáva Pannou nesúc na rukách Syna zrodené\u00AD ho pred východom zornice; Simeon ho vzal do náručia a zvestoval ľudu, že je Pánom života a smrti a Spasiteľom sveta.<br>",
                    "<font color='#B71C1C'>8. Keď procesia vchádza do kostola, spieva sa vstupný spev omše. Kňaz príde k oltáru, uctí ho zvyčajným spôsobom, prípadne ho aj incenzuje. Potom ide k sedadlu, odloží pluviál – ak ho mal pri procesii – a oblečie si kazulu. Zaintonuje hymnus Sláva Bohu na výsostiach a po ňom prednesie kolektu. Omša pokračuje zvyčajným spôsobom.</font><br>"},
            {"Druhý spôsob: Slávnostný vstup",
                    "<font color='#B71C1C'>9. Ak sa nemôže konať procesia, veriaci so sviečkami v rukách sa zídu v kostole. Kňaz v bielom omšovom rúchu s posluhujúcimi a s niekoľkými zástupcami ľudu príde na vhodné miesto, napríklad ku kostolnej bráne, aby aspoň väčšia časť veriacich mohla sledovať obrad.<br>" +
                    "10. Keď kňaz prišiel na miesto určené na požehnanie sviec, všetci si zažnú sviece a spievajú pritom antifónu </font>Hľa, náš Pán príde <font color='#B71C1C'>(pozri č. 3) alebo iný vhodný spev.<br>" +
                    "11. Potom kňaz pozdraví veriacich, vysvetlí im význam sviatku, požehná sviece (pozri č. 4 – 5) a za spevu kráča v procesii k oltáru (pozri č. 6 – 7). Pri svätej omši treba zachovať úpravy pod č. 8.</font><br><br><br>"},
    };

    String[][] pozehnania_menu = {
            {"Požehnanie osôb"},
            {"Požehnanie detí", "<font color='#B71C1C'>K Ježišovi, ako svedčí evanjelium, prinášali deti, aby ich požehnal a položil na ne ruky. Kresťanskí rodičia veľmi túžia, aby sa takéto požehnanie udeľovalo aj ich deťom. Vskutku, v ľudových tradíciách je vo veľkej úcte požehnanie detí, ktoré im udeľujú sami rodičia. To sa môže konať za osobitných okolností života detí alebo aj vtedy, keď sa rodina zhromaždí na modlitbu alebo na meditáciu nad textom Svätého písma.<br>" +
                    "Ak je prítomný kňaz alebo diakon, najmä pri príležitosti návštevy, ktorú duchovní pastieri vykonávajú v stanovenom čase v jednotlivých rodinách, aby ich požehnali, vtedy je vhodnejšie, aby túto službu požehnania vykonali oni. Ak kňaz alebo diakon nie je prítomný, môžu tento obrad, pri zachovaní príslušných textov, konať aj rodičia.<br>" +
                    "Toto požehnanie je pastoračné zvlášť odporúčané pre deti pred prvým svätým prijímaním.</font><br><br>" +
                    "<font color='#B71C1C'>ÚVODNÉ OBRADY</font><br>" +
                    "<font color='#B71C1C'>Obrad sa môže začať vhodnou piesňou. Potom kňaz povie:</font><br>" +
                    "<font color='#B71C1C'>K.:</font> V mene Otca i Syna i Ducha Svätého.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Milosť a pokoj od Boha Otca, ktorý nás prijal za svojich synov a dcéry, nech je s vami všetkými.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
                    "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne:</font><br>" +
                    "V žalme sa deti prirovnávajú k mládnikom olivy okolo rodinného stola: ony sú totiž nielen znamením a prejavom božského požehnania, ale dosvedčujú účinnú prítomnosť samého Boha, ktorý keď dáva plodnosť v deťoch, rozmnožuje v rodine veselosť a zväčšuje radosť. Teda deťom treba nielen prejaviť veľkú úctu, ale treba ich od začiatku vychovávať k láske k Bohu a k bázni pred ním, aby vedomé si svojich povinností vzmáhali sa v múdrosti a milosti, mali na mysli to, čo je pravdivé, spravodlivé a sväté, to aj konali, a tak sa stali svedkami Krista vo svete a hlásateľmi jeho evanjelia.<br><br>" +
                    "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Kňaz prečíta buď nasledovný text, alebo vyberie iný vhodný.</font><br><br>" +
                    "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
                    "<i>Nechajte deti prichádzať ku mne</i><br>" +
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Matúša   <font color='#B71C1C'>19, 13-15</font><br>" +
                    "Ježišovi priniesli deti, aby na ne položil ruky a pomodlil sa. Ale učeníci ich okrikovali.<br>" +
                    "Ježiš im povedal: \"Nechajte deti a nebráňte im prichádzať ku mne, lebo takým patrí nebeské kráľovstvo.\"<br>" +
                    "Potom na ne kládol ruky a odišiel odtiaľ.<br>" +
                    "Počuli sme slovo Pánovo.<br><br>" +
                    "<font color='#B71C1C'>Po čítaní Božieho slova môže byť krátky príhovor. Po ňom nasleduje spoločná modlitba veriacich. </font><br><br>" +
                    "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
                    "Pokorne prosme všemohúceho Boha, ktorého nás Pán Ježiš naučil vzývať ako nášho Otca, a volajme:<br>" +
                    "<i>Nebeský Otče, ochraňuj svoje deti.</i><br><br>" +
                    "<font color='#B71C1C'>1.</font> Láskavý Otče, ty si tak miloval ľudí, že si nám dal svojho jednorodeného Syna; stráž a ochraňuj nás, svoje deti, zrodené vo sviatosti krstu.<br>" +
                    "<font color='#B71C1C'>2.</font> Ty máš zaľúbenie vo svojom milovanom Synovi; daj, aby sme verne vykonávali úlohu, ktorú si každému z nás zveril v Cirkvi a vo svete.<br>" +
                    "<font color='#B71C1C'>3.</font> Ty si zveril svojho Syna, keď dospieval, do vernej ochrany Márie a Jozefa; daj, aby naši synovia a dcéry rástli podľa jeho príkladu do plnej ľudskej a kresťanskej dospelosti.<br>" +
                    "<font color='#B71C1C'>4.</font> Ty s veľkou láskou sleduješ údel opustených;<br>" +
                    "daj, aby pomoc kresťanského spoločenstva umožnila všetkým deťom zbaveným tepla rodiny živo pocítiť tvoju otcovskú lásku.<br><br>" +
                    "<font color='#B71C1C'>Spoločnú modlitbu kňaz uzavrie požehnaním. Modlitbu prednáša s rozopnutými rukami.</font><br><br>" +
                    "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font><br>" +
                    "Pane Ježišu Kriste,<br>" +
                    "ty si deťom prejavoval veľkú lásku<br>" +
                    "a povedal si, že kto ich prijíma, teba prijíma;<br>" +
                    "vypočuj naše prosby za tieto deti<br>" +
                    "<font color='#B71C1C'>(</font>za toto dieťa<font color='#B71C1C'>)</font><br>" +
                    "ustavične ich <font color='#B71C1C'>(</font>ho<font color='#B71C1C'>)</font> <font color='#B71C1C'>✠</font> ochraňuj,<br>" +
                    "aby ťa vtedy, keď dospejú <font color='#B71C1C'>(</font>dospeje<font color='#B71C1C'>)</font>,<br>" +
                    "odvážne vierou vyznávali <font color='#B71C1C'>(</font>vyznávalo<font color='#B71C1C'>)</font>,<br>" +
                    "vrúcne milovali <font color='#B71C1C'>(</font>milovalo<font color='#B71C1C'>)</font>,<br>" +
                    "a vytrvali <font color='#B71C1C'>(</font>vytrvalo<font color='#B71C1C'>)</font> v dôvernom očakávaní<br>" +
                    "tvojho kráľovstva.<br>" +
                    "Lebo ty žiješ a kraľuješ na veky vekov.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>____________________</font><br>" +
                    "<font color='#B71C1C'>Ak sú vysluhovateľmi rodičia, po spoločnej modlitbe poznačia deti znakom kríža na čele a prednesú modlitbu požehnania:</font><br>" +
                    "Svätý Otče, nevyčerpateľný prameň života<br>" +
                    "a pôvodca každého dobra,<br>" +
                    "velebíme ťa a vzdávame ti vďaky,<br>" +
                    "lebo si naše spoločenstvo lásky potešil darom detí;<br>" +
                    "daj, prosíme, aby títo mladí členovia rodiny<br>" +
                    "našli v domácom prostredí cestu,<br>" +
                    "na ktorej sa budú vždy usilovať o to, čo je lepšie,<br>" +
                    "a tak by s tvojou pomocou mohli raz<br>" +
                    "dosiahnuť svoj cieľ, ktorý si im určil.<br>" +
                    "Skrze Krista, nášho Pána. Amen.<br>" +
                    "<font color='#B71C1C'>Potom sa rodičia prežehnajú a obrad zakončia slovami:</font><br>" +
                    "Nech nás Pán Ježiš, ktorý miloval deti,<br>" +
                    "žehná a zachová vo svojej láske.<br>" +
                    "<font color='#B71C1C'>____________________</font><br>" +
                    "<font color='#B71C1C'>Kňaz uzavrie obrad požehnaním.</font><br><br>" +
                    "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Nech vás Pán Ježiš, ktorý miloval deti, žehná a zachová vo svojej láske.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> A požehnanie všemohúceho Boha Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého nech zostúpi na vás a zostane vždy s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Dobrorečme Pánovi.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka.<br><br>" +
                    "<font color='#B71C1C'>Na záver obradu sa môže spievať vhodná pieseň.</font>"},
            {"Požehnania matky pred pôrodom", "<font color='#B71C1C'>Požehnanie matky pred pôrodom sa môže konať pre jednu ženu predovšetkým v kruhu vlastnej rodiny alebo pre viaceré ženy, napríklad v nemocnici alebo v kostole. V tomto prípade sa formuly prednesú v množnom čísle.<br>" +
                    "Tento obrad môže konať kňaz alebo diakon.</font><br><br>" +
                    "<font color='#B71C1C'>ÚVODNÉ OBRADY</font><br>" +
                    "<font color='#B71C1C'>Podľa okolností sa môže v úvode obradu spievať vhodná pieseň. Potom kňaz povie:</font><br>" +
                    "<font color='#B71C1C'>K.:</font> V mene Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Kristus, Boží Syn, ktorý sa stal človekom v lone Panny Márie, nech je s vami všetkými.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
                    "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne:</font><br>" +
                    "Boh, náš Otec, je Pánom života. On rozhoduje o bytí každého človeka. Vo svojej prozreteľnosti spravuje a zachováva život všetkých.<br>" +
                    "Veríme, že to najviac platí o živote pochádzajúcom z kresťanského manželstva, ktorý bude zavŕšený prijatím daru sviatosti krstu ako boží život.<br>" +
                    "A práve to chce vyjadriť požehnanie matky pred pôrodom, aby vo viere a nádeji matka sama očakávala čas pôrodu a aby, spolupracujúc s Božou láskou, plod, ktorý nosí v lone, sprevádzala materinskou láskou.<br><br>" +
                    "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Kňaz prečíta buď nasledovný text, alebo vyberie iný vhodný.</font><br><br>" +
                    "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
                    "<i>Radosťou sa zachvelo dieťa v mojom lone</i><br>" +
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Lukáša   <font color='#B71C1C'>1, 39-45</font><br>" +
                    "V tých dňoch sa Mária vydala na cestu s ponáhľala sa do istého judejského mesta v hornatom kraji.<br>" +
                    "Vošla do Zachaviášovho domu a pozdravila Alžbetu. Len čo Alžbeta začula Máriin pozdrav, dieťa v jej lone sa zachvelo a Alžbetu naplnil Duch Svätý.<br>" +
                    "Vtedy zvolala veľkým hlasom: \"Požehnaná si medzi ženami a požehnaný je plod tvojho života. Čím som si zaslúžila, že matka môjho Pána prichádza ku mne? Lebo len čo zaznel tvoj pozdrav v mojich ušiach, radosťou sa zachvelo dieťa v mojom lone. A blahoslavená je tá, ktorá uverila, že sa splní, čo jej povedal Pán.\"<br>" +
                    "Počuli sme slovo Pánovo.<br><br>" +
                    "<font color='#B71C1C'>Kňaz sa môže krátko prihovoriť. Potom nasledujú zvolania:</font><br><br>" +
                    "<font color='#B71C1C'>OSLAVNÉ ZVOLANIA</font><br>" +
                    "Velebme Krista, Pána, požehnaný plod Máriinho života, ktorý tajomstvom svojho vtelenia vylial na svet milosť spásy. Volajme:<br>" +
                    "<i>Velebíme ťa, Pane, pre tvoju dobrotu a milosrdenstvo.</i>><br><br>" +
                    "<font color='#B71C1C'>1.</font> Ty si sa milostivo stal človekom a narodil si sa zo ženy, aby sme dosiahli adoptívne synovstvo.<br>" +
                    "<font color='#B71C1C'>2.</font> Ty si sa nebál lona matky, ale chcel si, aby bol blahoslavený život, ktorý ťa nosil, a prsia, ktoré si požíval.<br>" +
                    "<font color='#B71C1C'>3.</font> Ty si v Márii Panne, požehnanej medzi ženami, vyzdvihol úctu ku všetkým ženám.<br>" +
                    "<font color='#B71C1C'>4.</font> Ty si dal Jánovi Máriu za matku, keď si zomieral na kríži, aby sa stala matkou nás všetkých.<br>" +
                    "<font color='#B71C1C'>5.</font> Ty poslaním matiek obohacuješ svoju Cirkev novým potomstvom, a tak rozmnožuješ a zväčšuješ radosť.<br>" +
                    "<font color='#B71C1C'>6.</font> Ty si najväčším príkladom úcty k matke a k jej poslaniu priviesť na svet a ochraňovať svoje deti.<br><br>" +
                    "<font color='#B71C1C'>Kňaz, ak je to v hodné, vystrie ruky nad ženu alebo ju poznačí znakom kríža na čele, ináč s rozopnutými rukami prednesie modlitbu požehnania:</font><br><br>" +
                    "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font><br>" +
                    "<font color='#B71C1C'>A</font><br>" +
                    "Pane a Bože náš, stvoriteľ ľudského pokolenia,<br>" +
                    "tvoj Syn sa mocou Ducha Svätého<br>" +
                    "milostivo narodil z Panny Márie,<br>" +
                    "aby rozviazal dlh prvotného hriechu<br>" +
                    "a vykúpil a spasil všetkých ľudí;<br>" +
                    "dobrotivo prijmi prosby tejto tvojej služobnice<br>" +
                    "pokorne <font color='#B71C1C'>✠</font> prosiacej o zdravie dieťaťa,<br>" +
                    "ktoré sa jej má narodiť,<br>" +
                    "a daj, aby šťastlivo porodila dieťa,<br>" +
                    "ktoré sa pridruží k tvojim veriacim<br>" +
                    "a bude ti vo všetkom slúžiť, a tak získa večný život.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>B (ak je matiek viac)</font><br>" +
                    "Bože, Otče, Stvoriteľ každého života,<br>" +
                    "zhliadni na tieto matky,<br>" +
                    "ktoré prosia pre seba i pre svoje deti tvoje požehnanie.<br>" +
                    "Naplň ich hlbokou radosťou<br>" +
                    "nad zázrakom života a požehnaj <font color='#B71C1C'>✠</font> ich.<br>" +
                    "Ochraňuj ich a daj, aby deti,<br>" +
                    "ktoré nosia pod srdcom a očakávajú ich narodenie,<br>" +
                    "uzreli zdravé svetlo tohto sveta.<br>" +
                    "Daj, nech tieto deti nájdu<br>" +
                    "u svojich rodičov oporu a lásku.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Po modlitbe požehnania vysluhovateľ vyzve všetkých prítomných, aby vzývali preblahoslavenú Pannu Máriu o ochranu, čo sa vhodne urobí recitovaním alebo spevom antifóny:</font><br>" +
                    "Pod tvoju ochranu sa utiekame,<br>" +
                    "svätá Božia Rodička.<br>" +
                    "Neodvracaj zrak od našich prosieb,<br>" +
                    "pomôž nám v núdzi<br>" +
                    "a z každého nebezpečenstva nás vysloboď,<br>" +
                    "ty, Panna slávna a požehnaná. Amen.<br><br>" +
                    "<font color='#B71C1C'>Na takéto vzývanie možno použiť aj iné prosby, napríklad antifónu</font> Slávna Matka Spasiteľa <font color='#B71C1C'>alebo</font> Zdravas', Mária<font color='#B71C1C'>, alebo</font> Zdravas', Kráľovná<font color='#B71C1C'>.<br>" +
                    "Kňaz uzavrie obrad záverečným požehnaním.</font><br><br>" +
                    "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Boh, prameň a pôvod každého života, nech ťa ochraňuje svojou dobrotou.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Nech ti milostivo posilňuje vieru, upevňuje nádej a deň čo deň zveľaďuje lásku.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> V čase pôrodu nech vypočuje tvoje prosby a nech ťa posilňuje svojou milosťou.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Aj vás všetkých tu prítomných nech žehná všemohúci Boh Otec i Syn <font color='#B71C1C'>✠</font> i Duch Svätý.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Dobrorečme Pánovi.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka.<br><br>" +
                    "<font color='#B71C1C'>Podľa okolností môže nasledovať vhodná záverečná pieseň.</font>"},
            {"Požehnanie starých ľudí", "<font color='#B71C1C'>Starí ľudia, ktorí upadajú na sile a bývajú doma alebo v spoločných domovoch, potrebujú bratskú pomoc, aby sa ešte cítili plne prijímaní v rodine alebo v cirkevnom spoločenstve. Zmyslom tohto požehnania je, aby starší prijímali bratské svedectvo úcty a vďačnosti, keď spolu s nimi vzdávame Pánovi vďaky za dobrodenia prijaté od neho a za dobré skutky vykonané jeho pomocou.<br>" +
                    "Požehnanie starých ľudí sa môže konať pri slávení omše po homílii alebo na konci omše, alebo keď sa starým prináša najsvätejšia Eucharistia.<br>" +
                    "Ak sa obrad požehnania koná v omši, vykoná ho kňaz, ak mimo omše, môže mu predsedať aj diakon.</font><br><br>" +
                    "<font color='#B71C1C'>ÚVODNÉ OBRADY</font><br>" +
                    "<font color='#B71C1C'>Obrad sa začne vhodnou piesňou. Potom kňaz povie:</font><br>" +
                    "<font color='#B71C1C'>K.:</font> V mene Otca i Syna i Ducha Svätého.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Milosť nášho Pána Ježiša Krista a láska Boha Otca i spoločenstvo Ducha Svätého nech je s vami všetkými.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
                    "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne:</font><br>" +
                    "Čas staroby je Boží dar, ktorý musíme prijať s vďačným srdcom. Títo naši bratia a sestry pokročilého veku môžu nám odovzdať bohaté skúsenosti kresťanského života. V spojení s nimi vzdávajme Bohu vďaky a prosme pre nich Božiu pomoc, aby sa upevnila ich nádej' a posilnila dôvera.<br><br>" +
                    "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Kňaz prečíta buď nasledovný text, alebo vyberie iný vhodný.</font><br><br>" +
                    "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
                    "<i>Očakávali potechu Izraela</i><br>" +
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Lukáša   <font color='#B71C1C'>2, 25-32. 36-38</font><br>" +
                    "V Jeruzaleme žil muž menom Simson, človek spravodlivý a nábožný, ktorý očakával potechu Izraela a Duch Svätý bol na ňom. Jemu Duch Svätý vyjavil, že neumrie, kým neuvidí Pánovho Mesiáša. Z vnuknutia Ducha prišiel do chrámu. A keď rodičia prinášali dieťa Ježiša, aby splnili, čo o ňom predpisoval zákon, vzal ho aj on do svojho náručia a velebil Boha slovami:<br>" +
                    "\"Teraz prepustíš, Pane, svojho služobníka<br>" +
                    "v pokoji podľa svojho slova,<br>" +
                    "lebo moje oči uvideli tvoju spásu,<br>" +
                    "ktorú si pripravil<br>" +
                    "pred tvárou všetkých národov,<br>" +
                    "svetlo na osvietenie pohanov<br>" +
                    "a slávu Izraela, tvojho ľudu.\"<br>" +
                    "Žila vtedy aj prorokyňa Anna, Fanuelova dcéra, z Aserovho kmeňa. Bola už vo vysokom veku. Od svojho panenstva žila so svojím mužom sedem rokov, potom ako vdova do osemdesiateho štvrtého roku. Z chrámu neodchádzala, vo dne v noci slúžila Bohu pôstom a modlitbami. Práve v tú chvíľu prišla aj ona, velebila Boha a hovorila o ňom všetkým, čo očakávali vykúpenie Jeruzalema.<br>" +
                    "Počuli sme slovo Pánovo.<br><br>" +
                    "<font color='#B71C1C'>Po čítam môže kňaz povedať krátky príhovor. Potom nasleduje spoločná modlitba veriacich.</font><br><br>" +
                    "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Pokorne prosme Boha Otca všemohúceho, ktorý nás v každom veku svojou milosťou omladzuje a posilňuje; vrúcne volajme:<br>" +
                    "<i>Neopúšťaj nás, Pane.</i><br>" +
                    "<font color='#B71C1C'>Alebo:</font> <i>Pane, daj nám útechu svojho Ducha.</i><br><br>" +
                    "<font color='#B71C1C'>1.</font> Bože, ty si vo svojom milosrdenstve Simeonovi a Anne, ktorí očakávali vykúpenie Izraela, zjavil svojho Syna; daj, aby títo tvoji služobníci vierou videli tvoju spásu a tešili sa z útechy Ducha Svätého.<br>" +
                    "<font color='#B71C1C'>2.</font> Ty si skrze svojho Syna, ktorý prišiel na tento svet, sľúbil všetkým, čo znášajú ťarchu námah a úzkosti, pravé osvieženie a pokoj; daj, aby títo tvoji služobníci denne trpezlivo niesli svoj kríž.<br>" +
                    "<font color='#B71C1C'>3.</font> Ty svojou dobrotivosťou a štedrosťou prevyšuješ všetko naše očakávanie; daj, aby týmto tvojim služobníkom ich príbuzní a priatelia s láskou preukazovali povinnú útechu.<br>" +
                    "<font color='#B71C1C'>4.</font> Ty nikoho nevylučuješ zo svojej otcovskej lásky, ale pokorných miluješ ešte väčšou láskou; daj, aby ľudská spoločnosť uznávala dôstojnosť starých ľudí a vážila si ich.<br><br>" +
                    "<font color='#B71C1C'>Spoločnú modlitbu uzavrie kňaz modlitbou požehnania. Vyberie jednu z uvedených foriem modlitby a prednesie ju s rozopnutými rukami.</font><br><br>" +
                    "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font></font><br>" +
                    "<font color='#B71C1C'>A</font><br>" +
                    "Pane a Bože náš,<br>" +
                    "ty si týmto svojim veriacim udelil milosť,<br>" +
                    "aby v premenách života do teba vkladali svoju nádej<br>" +
                    "a aby skúsili a videli, aký si dobrý;<br>" +
                    "velebíme ťa, že si ich počas toľkých rokov<br>" +
                    "zahŕňal mnohými dobrodeniami,<br>" +
                    "a prosíme ťa, daj, <font color='#B71C1C'>✠</font> aby sa ustavične radovali<br>" +
                    "z obnovenej mladosti ducha,<br>" +
                    "aby sa tešili zdraviu tela<br>" +
                    "a svojím životom svedčili o tom,<br>" +
                    "že aj staroba má svoju krásu a pôvab.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>B</font><br>" +
                    "Vzdávame ti vďaky, všemohúci a večný Bože,<br>" +
                    "že v tebe žijeme, hýbeme sa a sme,<br>" +
                    "a velebíme ťa,<br>" +
                    "že si týmto svojim služobníkom<br>" +
                    "udelil dlhý život<br>" +
                    "s vytrvalosťou vo viere a v dobrých skutkoch;<br>" +
                    "prosíme ťa, Pane,<br>" +
                    "daj, aby sa posilňovaní dobrotou bratov a sestier<br>" +
                    "tešili z pevného zdravia<br>" +
                    "a v chorobe neklesali na mysli;<br>" +
                    "osviež ich svojím <font color='#B71C1C'>✠</font> požehnaním,<br>" +
                    "aby čas zrelého veku<br>" +
                    "ochotne využívali na tvoju chválu.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>C</font><br>" +
                    "Všemohúci a večný Bože,<br>" +
                    "ty si týchto svojich služobníkov<br>" +
                    "obdaril vysokou starobou;<br>" +
                    "milostivo im udeľ svoje <font color='#B71C1C'>✠</font> požehnanie:<br>" +
                    "nech cítia sladkosť tvojej prítomnosti,<br>" +
                    "aby sa pri pohľade do minulosti<br>" +
                    "tešili z tvojho milosrdenstva<br>" +
                    "a pozerajúc sa do budúcnosti<br>" +
                    "s dôverou vytrvali vo svätej nádeji.<br>" +
                    "Skrze Krista nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Kňaz uzavrie obrad záverečným požehnaním. </font><br><br>" +
                    "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Pán Ježiš Kristus nech u vás zostáva a nech vás chráni.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Nech je pred vami, aby vás viedol, nech je za vami, aby vás chránil.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Nech na vás zhliadne, nech vás opatruje a nech vás žehná.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> A požehnanie všemohúceho Boha Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého nech zostúpi na vás a zostane vždy s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Je chvályhodné zakončiť slávenie primeranou piesňou.</font>"},
            {"Požehnanie chorých", "<font color='#B71C1C'>Je pradávnym zvykom, ktorý má pôvod v príklade Krista a apoštolov, že služobníci Cirkvi požehnávajú chorých. Treba, aby kňazi pri návšteve chorých starostlivo dodržali všetko, čo sa hovorí v Rituáli v časti Obrad pomazania chorých a pastoračná starosť o nich; predovšetkým však nech prejavia chorým starostlivosť a lásku Krista a Cirkvi.<br>" +
                    "V Obrade pomazania chorých a pastoračnej starosti o nich sa počíta s viacerými príležitosťami na požehnanie chorých a uvádzajú sa aj formuláre požehnania.<br>" +
                    "Tu predložené obrady môže použiť tak kňaz, ako aj diakon.</font><br><br>" +
                    "<font color='#B71C1C'>ÚVODNÉ OBRADY</font><br>" +
                    "<font color='#B71C1C'>Na úvod sa môže spievať vhodná pieseň. Potom kňaz povie:</font><br>" +
                    "<font color='#B71C1C'>K.:</font> V mene Otca i Syna i Ducha Svätého.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Pokoj tomuto domu a všetkým, čo v ňom bývajú.<br>" +
                    "<font color='#B71C1C'>Alebo: </font><br>" +
                    "<font color='#B71C1C'>K.:</font> Pokoj Pánov nech je vždy s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
                    "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne:</font><br>" +
                    "Pán Ježiš, ktorý kadiaľ chodil, robil dobre a uzdravoval všetky neduhy a choroby. Svojim učeníkom zveril úlohu, aby sa starali o chorých, vkladali na nich ruky a v jeho mene ich požehnávali.<br>" +
                    "Pri tomto slávení budeme Bohu odporúčať našich chorých bratov a sestry, aby trpezlivo vládali znášať všetky telesné a duševné bolesti, veď vieme, že ako majú účasť na Kristových utrpeniach, tak budú mať aj na úteche <font color='#B71C1C'>(</font><i>porov. 2 Kor 1, 7</i><font color='#B71C1C'>)</font>.<br><br>" +
                    "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Lektor, niekto z prítomných alebo sám kňaz prečíta buď nasledujúci text, alebo vyberie iný vhodný.</font><br><br>" +
                    "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
                    "<i>Nech je zvelebený Boh všetkej útechy</i><br>" +
                    "Čítanie z Druhého listu svätého apoštola Pavla Korinťanom   <font color='#B71C1C'>1, 3-7</font><br>" +
                    "Nech je zvelebený Boh a Otec nášho Pána Ježiša Krista, Otec milosrdenstva a Boh všetkej útechy! On nás potešuje v každom našom súžení, aby sme mohli aj my potešovať tých, čo sú v akomkoľvek súžení, tou útechou, ktorou Boh potešuje nás.<br>" +
                    "Lebo ako sa v nás rozmnožujú Kristove utrpenia, tak sa skrze Krista rozhojňuje aj naša útecha. Ak sme teda sužovaní, je to na vašu potechu a spásu; ak sme potešovaní, je to vám na potešenie, ktoré sa prejavuje v znášaní takých istých utrpení, aké znášame aj my.<br>" +
                    "A naša nádej, vzhľadom na vás, je pevná, veď vieme, že ako máte účasť na utrpeniach, tak budete mať aj na úteche.<br>" +
                    "Počuli sme Božie slovo.<br><br>" +
                    "<font color='#B71C1C'>Po čítaní môže kňaz povedať krátky príhovor. Potom nasleduje spoločná modlitba veriacich. Vyberie sa jeden z predložených formulárov.</font><br><br>" +
                    "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
                    "<font color='#B71C1C'>A</font><br>" +
                    "Bratia a sestry, s dôverou prosme Pána Ježiša, nášho Spasiteľa, aby svojou milosťou potešil našich chorých bratov; volajme:<br>" +
                    "<i>Pane Ježišu, milostivo pomáhaj našim chorým bratom a sestrám.</i><br><br>" +
                    "<font color='#B71C1C'>1.</font> Ty si prišiel ako lekár tela a duše, aby si uzdravil naše choroby.<br>" +
                    "<font color='#B71C1C'>2.</font> Ty, muž bolestí, niesol si naše neduhy a vzal si na seba naše bolesti.<br>" +
                    "<font color='#B71C1C'>3.</font> Ty si sa vo všetkom chcel pripodobniť svojim bratom, aby si zjavil svoje milosrdenstvo.<br>" +
                    "<font color='#B71C1C'>4.</font> Ty si chcel skúsiť slabosti tela, aby si nás zbavil zla.<br>" +
                    "<font color='#B71C1C'>5.</font> Ty si mal svoju matku Máriu, ktorá stála vedľa kríža, za spoločníčku v bolestiach a dal si ju za matku aj nám.<br>" +
                    "<font color='#B71C1C'>6.</font> Ty chceš, aby sme na vlastnom tele dopĺňali to, čo chýba Kristovmu utrpeniu pre tvoje telo, ktorým je Cirkev.<br><br>" +
                    "<font color='#B71C1C'>B</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Ty si vzal na seba naše utrpenia a nosil si naše bolesti. Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>K.:</font> Ty si sa zľutoval nad zástupom a kadiaľ si chodil, robil si dobre a uzdravoval chorých. Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Kriste, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>K.:</font> Ty si prikázal apoštolom, aby vkladali ruky na chorých. Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Pane, zmiluj sa.<br><br>" +
                    "<font color='#B71C1C'>C</font><br>" +
                    "Prosme Pána za nášho chorého brata <font color='#B71C1C'>(</font>za našu chorú sestru<font color='#B71C1C'>) M.</font> a za všetkých, čo sa oňho <font color='#B71C1C'>(</font>o ňu<font color='#B71C1C'>)</font> starajú a čo ho <font color='#B71C1C'>(</font>ju<font color='#B71C1C'>)</font> opatrujú.<br>" +
                    "<i>Prosíme ťa, vyslyš nás.</i><br><br>" +
                    "<font color='#B71C1C'>1.</font> Aby si dobrotivo zhliadol na tohto chorého <font color='#B71C1C'>(</font>na túto chorú<font color='#B71C1C'>)</font>.<br>" +
                    "<font color='#B71C1C'>2.</font> Aby si vlial do jeho <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> údov novú silu.<br>" +
                    "<font color='#B71C1C'>3.</font> Aby si mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> uľahčil v jeho <font color='#B71C1C'>(</font>v jej<font color='#B71C1C'>)</font> úzkostiach.<br>" +
                    "<font color='#B71C1C'>4.</font> Aby si pomáhal svojou milosťou všetkým chorým.<br>" +
                    "<font color='#B71C1C'>5.</font> Aby si svojou božskou silou udržiaval tých, čo sa starajú o chorých.<br>" +
                    "<font color='#B71C1C'>6.</font> Aby si milostivo udelil život a spásu chorému <font color='#B71C1C'>(</font>chorej<font color='#B71C1C'>)</font> <font color='#B71C1C'>M.</font>, ktorého <font color='#B71C1C'>(</font>ktorú<font color='#B71C1C'>)</font> v modlitbe odporúčame do tvojej uzdravujúcej lásky.<br><br>" +
                    " <font color='#B71C1C'>D (pri požehnaní detí)</font><br>" +
                    "Pán Ježiš osobitnou láskou miluje a chráni maličkých; prosme ho za tieto deti a volajme:<br>" +
                    "<i>Stráž ich na všetkých cestách.</i><br><br>" +
                    "<font color='#B71C1C'>1.</font> Ty si volal deti k sebe a povedal si, že takým patrí nebeské kráľovstvo; láskavo vypočuj našu modlitbu za tieto deti.<br>" +
                    "<font color='#B71C1C'>2.</font> Ty si povedal, že tajomstvá kráľovstva nie sú zjavené múdrym a rozumným, ale maličkým; milostivo ukáž týmto deťom znamenie svojej lásky.<br>" +
                    "<font color='#B71C1C'>3.</font> Ty si ochotne prijal spev natešených detí, keď ti na ceste utrpenia volali nábožné Hosana; posilni svojou svätou útechou tieto deti aj ich rodičov.<br>" +
                    "<font color='#B71C1C'>4.</font> Ty si svojim učeníkom zveril úlohu, aby sa starali o chorých; dobrotivo pomáhaj všetkým, ktorí sa horlivo venujú liečeniu týchto detí.<br><br>" +
                    "<font color='#B71C1C'>Spoločnú modlitbu uzavrie kňaz modlitbou požehnania. Vyberie jednu z uvedených foriem modlitby a prednesie ju s rozopnutými rukami.</font><br><br>" +
                    "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font><br>" +
                    "<font color='#B71C1C'>A</font><br>" +
                    "Pane a Bože náš,<br>" +
                    "ty si poslal na svet svojho Syna,<br>" +
                    "aby sám niesol naše neduhy<br>" +
                    "a vzal na seba naše bolesti;<br>" +
                    "pokorne prosíme za tvojich chorých služobníkov:<br>" +
                    "požehnaj <font color='#B71C1C'>✠</font> ich,<br>" +
                    "aby posilnení trpezlivosťou<br>" +
                    "a osviežení vo svojej nádeji premáhali chorobu<br>" +
                    "a pomôž im tešiť sa z dobrého zdravia.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>B</font><br>" +
                    "Pane Ježišu,<br>" +
                    "kadiaľ si chodil, robil si dobre<br>" +
                    "a uzdravoval všetkých;<br>" +
                    "pokorne ťa prosíme,<br>" +
                    "aby si týchto svojich chorých služobníkov<br>" +
                    "milostivo <font color='#B71C1C'>✠</font> požehnal:<br>" +
                    "posilni ich na tele a upevni na duchu,<br>" +
                    "udeľ im trpezlivosť v bolestiach, obnov im zdravie,<br>" +
                    "aby sa vrátili do spoločenstva bratov a sestier<br>" +
                    "a s radosťou velebili tvoje meno.<br>" +
                    "Lebo ty žiješ a kraľuješ na veky vekov.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    " <font color='#B71C1C'>C (pre jedného chorého)</font><br>" +
                    "Pane, svätý Otče, všemohúci a večný Bože,<br>" +
                    "ty nás svojím <font color='#B71C1C'>✠</font> požehnaním<br>" +
                    "pozdvihuješ a posilňuješ<br>" +
                    "v slabosti našej ľudskej prirodzenosti;<br>" +
                    "milostivo zhliadni na tohto svojho služobníka <font color='#B71C1C'>M.</font>;<br>" +
                    "     <font color='#B71C1C'>(</font>túto svoju služobnicu <font color='#B71C1C'>M.)</font>;<br>" +
                    "daj, aby premohol <font color='#B71C1C'>(</font>premohla<font color='#B71C1C'>)</font> chorobu,<br>" +
                    "znova získal<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> plné zdravie<br>" +
                    "a s vďačným srdcom velebil<font color='#B71C1C'>(</font>a<font color='#B71C1C'>)</font> tvoje sväté meno.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    " <font color='#B71C1C'>D (pre viacero deti)</font><br>" +
                    "Pane a Bože náš,<br>" +
                    "tvoj Syn, Ježiš Kristus,<br>" +
                    "s láskou prijal deti a požehnal <font color='#B71C1C'>✠</font> ich;<br>" +
                    "dobrotivo vystri svoju pravicu<br>" +
                    "na týchto svojich služobníkov <font color='#B71C1C'>(M.</font> a <font color='#B71C1C'>M.)</font><br>" +
                    "ktorí trpia už v útlom veku:<br>" +
                    "daj im sviežosť a zdravie<br>" +
                    "a obnovených na tele i na duši<br>" +
                    "vráť Cirkvi a rodičom,<br>" +
                    "aby ti mohli vzdávať vďaky.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>E (pre jedno dieťa)</font><br>" +
                    "Pane a Bože náš,<br>" +
                    "tvoj Syn, Ježiš Kristus,<br>" +
                    "s láskou prijal deti a požehnal <font color='#B71C1C'>✠</font> ich;<br>" +
                    "dobrotivo vystri svoju pravicu<br>" +
                    "na tohto svojho služobníka <font color='#B71C1C'>M.</font>,<br>" +
                    "     <font color='#B71C1C'>(</font>túto svoju služobnicu <font color='#B71C1C'>M.)</font>,<br>" +
                    "ktorý<font color='#B71C1C'>(</font>á<font color='#B71C1C'>)</font> trpí už v útlom veku:<br>" +
                    "daj mu <font color='#B71C1C'>(</font>jej<font color='#B71C1C'>)</font> sviežosť a zdravie<br>" +
                    "a obnoveného <font color='#B71C1C'>(</font>obnovenú<font color='#B71C1C'>)</font> na tele i na duši<br>" +
                    "vráť Cirkvi a rodičom, aby ti mohli vzdávať vďaky.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Po modlitbe požehnania vysluhovateľ vyzve všetkých prítomných, aby vzývali preblahoslavenú Pannu Máriu o ochranu, čo sa vhodne urobí recitovaním alebo spevom antifóny:</font><br>" +
                    "<font color='#B71C1C'>K.:</font> A teraz vzývajme o pomoc a orodovanie našu nebeskú Matku Máriu:<br><br>" +
                    "Pod tvoju ochranu sa utiekame,<br>" +
                    "svätá Božia Rodička.<br>" +
                    "Neodvracaj zrak od našich prosieb,<br>" +
                    "pomôž nám v núdzi<br>" +
                    "a z každého nebezpečenstva nás vysloboď,<br>" +
                    "ty, Panna slávna a požehnaná. Amen.<br><br>" +
                    "<font color='#B71C1C'>Na takéto vzývanie možno použiť aj iné prosby, napríklad antifónu</font> <i>Slávna Matka Spasiteľa</i> <font color='#B71C1C'>alebo</font> <i>Zdravas', Mária</i><font color='#B71C1C'>, alebo</font> <i>Zdravas', Kráľovná</i><font color='#B71C1C'>.<br>" +
                    "Kňaz uzavrie obrad záverečným požehnaním.</font><br><br>" +
                    "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Nech vás <font color='#B71C1C'>(</font>ťa<font color='#B71C1C'>)</font> žehná Boh Otec.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Nech vás <font color='#B71C1C'>(</font>ťa<font color='#B71C1C'>)</font> uzdraví Boží Syn.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Nech vás <font color='#B71C1C'>(</font>ťa<font color='#B71C1C'>)</font> osvieti Duch Svätý.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> A požehnanie všemohúceho Boha Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého nech zostúpi na vás a zostane vždy s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Choďte v mene Božom.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka.<br><br>" +
                    "<font color='#B71C1C'>Na záver sa spieva hodná pieseň.</font>"},
            {"Požehnania na cestu", "<font color='#B71C1C'>Treba mať v úcte zvyk, častejšie spomínaný v samom Písme, aby tí, čo sa vydávajú na cestu, prosili Pána o pomoc. Nasledujúci obrad požehnania je vzorom modlitby, ktorým sa má tento nábožný zvyk zachovať.<br>" +
                    "Možno ho použiť predovšetkým pre cestujúcich, ktorí odchádzajú z vlasti alebo z domova hoci len na čas, za prácou, alebo idú na iné miesto, napríklad počas dovolenky.<br>" +
                    "Tu predložené obrady môže použiť tak kňaz, ako aj diakon.</font><br><br>" +
                    "<font color='#B71C1C'>ÚVODNÉ OBRADY</font><br>" +
                    "<font color='#B71C1C'>V úvode obradu sa môže spievať vhodná pieseň. Potom kňaz povie:</font><br>" +
                    "<font color='#B71C1C'>K.:</font> V mene Otca i Syna i Ducha Svätého.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Pán, ktorý nás ako vychádzajúci z výsosti navštívi, aby upriamil naše kroky na cestu pokoja, nech je s vami všetkými.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
                    "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne:</font><br>" +
                    "Odporúčajme Pánovi týchto našich bratov a sestry, ktorí odchádzajú, aby im pripravil šťastnú cestu a oni aby na cestách tohto sveta chválili Boha v jeho stvoreniach, cítili jeho dobrotu v pohostinstve bratov, zvestovali ľuďom dobrú zvesť spásy, boli prívetiví ku každému, aby utrápených a biednych, s ktorými sa stretnú, láskavo pozdravovali a usilovali sa im pomáhať.<br><br>" +
                    "<font color='#B71C1C'>Ak cestuje aj predsedajúci:</font><br>" +
                    "Prosme Pána, aby nás sprevádzal svojím požehnaním a aby sme ho na cestách tohto sveta chválili v jeho stvoreniach, cítili jeho dobrotu v pohostinstve bratov, zvestovali ľuďom dobrú zvesť spásy, boli prívetiví ku každému, aby sme utrápených a biednych, s ktorými sa stretneme, láskavo pozdravovali a usilovali sa im pomáhať.<br><br>" +
                    "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Lektor, niekto z prítomných alebo sám kňaz prečíta buď nasledujúci text, alebo vyberie iný vhodný.</font><br><br>" +
                    "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
                    "<i>Budeš uvažovať o mojich slovách, keď budeš cestovať</i><br>" +
                    "Čítanie z Knihy Deuteronómium   <font color='#B71C1C'>6, 4-9</font><br>" +
                    "Počúvaj, Izrael: \"Pán, náš Boh, je jediný Pán! Milovať budeš Pána, svojho Boha, celým svojím srdcom, celou svojou dušou a celou svojou silou. A tieto slová, ktoré ti ja dnes hovorím, budú v tvojom srdci, budeš ich opakovať svojim synom a hovoriť o nich, či budeš sedieť vo svojom dome alebo cestovať, či budeš líhať alebo vstávať; priviažeš si ich ako znamenie na ruku a budú ako ozdoba medzi tvojimi očami; a napíšeš ich na veraje svojho domu a na svoje brány.\"<br>" +
                    "Počuli sme Božie slovo.<br><br>" +
                    "<font color='#B71C1C'>Po čítaní Božieho slova môže nasledovať krátky príhovor a po ňom spoločná modlitba veriacich. Vyberie sa jedna z uvedených foriem. </font><br><br>" +
                    "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
                    "<font color='#B71C1C'>A</font><br>" +
                    "S dôverou vzývajme Boha, začiatok a koniec našich ciest, a volajme:<br>" +
                    "Pane, láskavo bedli nad našimi krokmi.<br><br>" +
                    "<font color='#B71C1C'>1.</font> Svätý Otče, tvoj jednorodený Syn sa nám dal ako cesta, po ktorej prídeme k tebe; daj, aby sme nasledovali toho, ktorý nás verne a vytrvalo predchádza.<br>" +
                    "<font color='#B71C1C'>2.</font> Ty si vždy a všade blízko tým, čo ti slúžia; otcovskou ochranou stráž svojich služobníkov, aby cítili, že ich na ceste sprevádzaš a že raz budú s tebou stolovať vo večnej vlasti.<br>" +
                    "<font color='#B71C1C'>3.</font> Ty sám si bol kedysi svojmu ľudu putujúcemu na púšti vodcom a cestou; uštedri nám, ktorí sa dávame na cestu, svoju ochranu, aby sme sa po prekonaní všetkých nebezpečenstiev šťastlivo vrátili k našim drahým.<br>" +
                    "<font color='#B71C1C'>4.</font> Ty si urobil z pohostinnosti prejavenej cestujúcim jeden zo znakov tvojho prichádzajúceho kráľovstva; daj, aby všetci, ktorí sa potulujú bez domova, mohli nájsť stály príbytok.<br><br>" +
                    "<font color='#B71C1C'>B</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Ukáž nám, Pane, svoje cesty. Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>K.:</font> Pošli nám, Pane, pomoc zo svätyne. Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>K.:</font> Buď nám, Pane, baštou sily. Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>K.:</font> Spas, svojich služobníkov, Pane, ktorí dúfajú v teba. Pane, zmiluj sa.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Pane, zmiluj sa.<br><br>" +
                    "<font color='#B71C1C'>Spoločnú modlitbu uzavrie kňaz modlitbou požehnania, ktorú prednesie s rozopnutými rukami. Podľa okolností použije prvú alebo druhú formu.</font><br><br>" +
                    "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font><br>" +
                    "<font color='#B71C1C'>A (ak predsedajúci sám s ostatnými necestuje)</font><br>" +
                    "Všemohúci a milosrdný Bože,<br>" +
                    "ty si dal synom Izraela suchou nohou<br>" +
                    "prejsť stredom mora<br>" +
                    "a mudrcom, ktorí prišli k tvojmu Synovi,<br>" +
                    "hviezdou si ukázal cestu;<br>" +
                    "pomáhaj našim bratom a sestrám<br>" +
                    "a daj im šťastlivú cestu,<br>" +
                    "aby pod tvojou ochranou<br>" +
                    "a s tvojím <font color='#B71C1C'>✠</font> požehnaním<br>" +
                    "bez ujmy došli tam, kam smerujú,<br>" +
                    "a aby si raz zaslúžili šťastlivo vojsť<br>" +
                    "do prístavu večnej spásy.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>B (ak predsedajúci sám pôjde s cestujúcimi)</font><br>" +
                    "Všemohúci a večný Bože,<br>" +
                    "ty si Abraháma,<br>" +
                    "ktorého si vyviedol z jeho krajiny<br>" +
                    "a vytrhol z jeho príbuzenstva,<br>" +
                    "chránil a bez úrazu viedol<br>" +
                    "na všetkých cestách jeho putovania.<br>" +
                    "Milostivo <font color='#B71C1C'>✠</font> ochraňuj aj nás,<br>" +
                    "svojich služobníkov;<br>" +
                    "buď nám, Bože, pohotovou pomocou,<br>" +
                    "vodcom a útechou na ceste,<br>" +
                    "ochranou v protivenstvách,<br>" +
                    "aby sme pod tvojím vedením<br>" +
                    "dobre prišli tam, kam sa uberáme,<br>" +
                    "a aby sme sa mohli šťastlivo vrátiť k svojim.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Celý obrad sa uzavrie záverečným požehnaním. </font><br><br>" +
                    "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Pán nech je nerozlučne s vami <font color='#B71C1C'>(</font>s nami<font color='#B71C1C'>)</font> a nech svojou láskavosťou milosrdne riadi vašu <font color='#B71C1C'>(</font>našu<font color='#B71C1C'>)</font> cestu. Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> A požehnanie všemohúceho Boha Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého nech zostúpi na vás a zostane vždy s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Choďte v mene Božom.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka.<br><br>" +
                    "<font color='#B71C1C'>Na záver sa môže spievať vhodná pieseň.</font>"},
            {"Požehnanie vecí určených na liturgiu a ľudovú nábožnosť"},
            {"Požehnania adventného venca", "<font color='#B71C1C'>Požehnanie adventného venca je znamením nádeje a oslavy toho, ktorý prichádza, ako to ukazujú ozdoby na venci. Štyri adventné sviece označujú počet adventných nedelí, pričom pribúdanie svetla znázorňuje blížiaci sa príchod Krista, ktorý je svetlom tohto sveta.<br>" +
                    "Ak sa tento obrad koná v omši v sobotu večer alebo v nedeľu ráno, koná sa v úvode svätej omše a vyberie sa z neho len úvod a modlitby požehnania.<br>" +
                    "Ak sa obrad požehnania koná v omši, vykoná ho kňaz, ak mimo omše, môže mu predsedať aj diakon.<br>" +
                    "Pri tomto obrade sa použije fialová farba liturgického rúcha. Kňaz si môže obliecť aj pluviál. </font><br><br>" +
                    "<font color='#B71C1C'>ÚVOD</font><br>" +
                    "<font color='#B71C1C'>Na úvod sa spieva vhodná pieseň, potom kňaz povie:</font><br><br>" +
                    "<font color='#B71C1C'>K.:</font> V mene Otca i Syna i Ducha Svätého.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Milosť a pokoj od toho, ktorý je, ktorý bol a ktorý príde, nech je s vami všetkými.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
                    "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne:</font><br>" +
                    "Drahí bratia a sestry, začíname prežívať Adventné obdobie a požehnávame adventný veniec a sviece, ktoré nám majú pripomínať blížiaci sa príchod nášho Spasiteľa Ježiša Krista.<br>" +
                    "Modlime sa, nech v našich srdciach zažiari on sám ako odblesk slávy nebeského Otca; jeho príchod nech z nás zaženie všetku tmu hriechu a pretvorí nás na synov svetla.<br><br>" +
                    "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Lektor, niekto z prítomných alebo sám kňaz prečíta buď nasledujúci text, alebo vyberie iný vhodný.</font><br><br>" +
                    "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
                    "<i>Nadišla hodina, aby ste sa prebudili zo sna</i><br>" +
                    "Čítanie z Listu svätého apoštola Pavla Rimanom   <font color='#B71C1C'>13, 11-14a</font><br>" +
                    "Bratia, viete, aký je čas, že už nadišla hodina, aby ste sa prebudili zo sna. Veď teraz je nám spása bližšie, ako vtedy, keď sme uverili. Noc pokročila, deň sa priblížil. Zhoďme teda skutky tmy a oblečme sa do výzbroje svetla. Žime počestne ako vo dne; nie v hýrení a opilstve, nie v smilstve a necudnosti, nie v svároch a žiarlivosti, ale oblečte si Pána Ježiša Krista.<br>" +
                    "Počuli sme Božie slovo.<br><br>" +
                    "<font color='#B71C1C'>Môže nasledovať krátky príhovor. Po ňom modlitba požehnania, ktorú kňaz prednesie v rozopnutými rukami.</font><br><br>" +
                    "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Bože, ty si stvoril všetko, lebo si láska a prameň života.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Velebíme ťa, Bože.<br>" +
                    "<font color='#B71C1C'>K.:</font> Vo svojom Synovi nám dávaš svetlo a život.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Velebíme ťa, Bože.<br>" +
                    "<font color='#B71C1C'>K.:</font> Nech tvoj Duch osvieti naše srdcia, aby sme vedeli, k akej nádeji sme povolaní.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Velebíme ťa, Bože.<br><br>" +
                    "<font color='#B71C1C'>K.:</font> Modlime sa:<br>" +
                    "Ďakujeme ti, Pane, Bože náš,<br>" +
                    "že nám aj v tomto roku dávaš radosti Adventu<br>" +
                    "a že smieme v nádeji a s dôverou očakávať<br>" +
                    "tvojho Syna, nášho Spasiteľa.<br>" +
                    "Požehnaj <font color='#B71C1C'>✠</font> tento veniec,<br>" +
                    "aby nám ako znak nádeje pripomínal<br>" +
                    "život a sväté spoločenstvo, a daj,<br>" +
                    "aby sme v týchto dňoch rástli v tvojej milosti.<br>" +
                    "Skrze Krista nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen<br><br>" +
                    "<font color='#B71C1C'>Pridá sa modlitba požehnania sviec:</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Modlime sa:<br>" +
                    "Bože, ty si poslal na svet svojho Syna ako svetlo.<br>" +
                    "Požehnaj <font color='#B71C1C'>✠</font> tieto sviece;<br>" +
                    "nech nám v dňoch Adventu<br>" +
                    "pripomínajú Ježiša Krista,<br>" +
                    "ktorý chce osvietiť každého človeka.<br>" +
                    "A keď budeme každú nedeľu<br>" +
                    "zapaľovať nové svetlo, daj,<br>" +
                    "aby sme tak rástli aj v láske ku Kristovi.<br>" +
                    "Priprav naše srdcia na slávnosť jeho narodenia<br>" +
                    "a daj, aby sme raz videli z tváre do tváre<br>" +
                    "tvojho Syna, plného milosti a pravdy,<br>" +
                    "ktorý žije a kraľuje na veky vekov.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Kňaz pokropí (prípadne aj incenzuje) veniec a sviece. Potom zapáli prvú sviecu. Medzitým možno spievať z JKS:</font> <i>28, 1-2</i><font color='#B71C1C'>.</font><br>" +
                    "<font color='#B71C1C'>Po požehnaní nasleduje spoločná modlitba veriacich, ktorá sa uzavrie Modlitbou Pána.</font><br><br>" +
                    "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Prosme nášho Pána Ježiša Krista, ktorého nebeský Otec poslal na svet, aby všetci ľudia prišli k svetlu pravdy a milosti.<br>" +
                    "<i>Prosíme ťa, vyslyš nás.</i><br><br>" +
                    "<font color='#B71C1C'>1.</font> Pane, daj, nech tvoja Cirkev v týchto dňoch horlivo ohlasuje tvoje radostné posolstvo a nech vedie veriacich po ceste spásy.<br>" +
                    "<font color='#B71C1C'>2.</font> Pane, daj, nech všetky národy sveta vyhľadávajú pravé svetlo a počujú slovo tvojej blahozvesti.<br>" +
                    "<font color='#B71C1C'>3.</font> Pane, daj, nech sa tento adventný čas stane pre našu farnosť časom obrátenia a milosti.<br>" +
                    "<font color='#B71C1C'>4.</font> Pane, daj, nech naše rodiny, rodičia i deti, hľadajú Boha v duchovnom sústredení, v horlivej modlitbe a v dobrote a láske.<br><br>" +
                    "<font color='#B71C1C'>K.:</font> A teraz sa spoločne modlime, ako nás naučil náš Pán Ježiš Kristus:<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Otčenáš...<br><br>" +
                    "<font color='#B71C1C'>Celý obrad sa uzavrie záverečným požehnaním.</font><br><br>" +
                    "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Z milosrdnej lásky Boha Otca veríme, že Syn Boží prišiel na tento svet a znova príde na konci vekov. Nech vás Boh pre túto vieru posväcuje a sprevádza svojím požehnaním.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Očakávanie Kristovho príchodu nech vás na pozemskej púti posilňuje v hlbokej viere, v radostnej nádeji a v činorodej láske.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Vykupiteľ, ktorý vás potešil svojím prvým príchodom, nech vás odmení večným životom, keď na konci vekov príde v sláve.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> A požehnanie všemohúceho Boha Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého nech zostúpi na vás a zostane vždy s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Choďte v mene Božom.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka.<br><br>" +
                    "<font color='#B71C1C'>Na záver sa spieva vhodná pieseň.</font>"},
            {"Požehnanie betlehemov", "<font color='#B71C1C'>K čaru vianočnej atmosféry patrí stavanie betlehemov s jasličkamii postavami Svätej rodiny, troch mudrcov, pastierov, anjelov a zvierat v maštali Ježišovho narodenia. Ide o vyobrazenie scény Ježišovho narodenia. Za zvyk pripraviť si betlehem vďačíme sv. Františkovi z Assisi, ktorý v roku 1223 spolu s priateľmi premenil jaskyňu na kaplnku a zinscenovali živý betlehem. Odtiaľto sa zvyk pripraviť betlehem dostal do kostolov a kláštorov. Až koncom 18. stor. sa betlehemy dostali do širšej verejnosti už či v živej, drevenej alebo papierovej podobe.<br>" +
                    "Cirkev požehnáva tento obraz Ježišovho narodenia, aby tak vyprosovala veriacim poníženosť Božieho Syna, ktorú betlehem znázorňuje.<br>" +
                    "Tomuto obradu môže predsedať kňaz alebo diakon.</font><br><br>" +
                    "<font color='#B71C1C'>ÚVOD</font><br>" +
                    "<font color='#B71C1C'>Na úvod sa môže spievať vhodná pieseň. Po nej kňaz povie:</font><br><br>" +
                    "<font color='#B71C1C'>K.:</font> V mene Otca i Syna i Ducha Svätého.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Milosť a pokoj od toho, ktorý je, ktorý bol a ktorý príde, nech je s vami všetkými.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
                    "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne:</font><br>" +
                    "<font color='#B71C1C'>(</font>Oslovenie<font color='#B71C1C'>)</font>, Pán Ježiš sa narodil v Betleheme v maštaľke. Panna Mária ho uložila do jasieľ. A tak sa jasličky stali znamením veľkej poníženosti a lásky Pána Ježiša voči nám, aby sme všetci s veľkou dôverou a láskou pristupovali k nášmu Spasiteľovi. Jasličky sa stavajú od čias sv. Františka Assiského, ktorý v roku 1223 postavil prvé živé jasle v talianskom Grecciu [gréču]. Vo Vianočnom období sú jasličky nielen ozdobou našich príbytkov a kostolov, ale aj výzvou, aby sme dali miesto Kristovi vo svojom živote a klaňali sa mu.<br><br>" +
                    "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Kňaz prečíta buď nasledovný text, alebo vyberie iný vhodný.</font><br><br>" +
                    "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
                    "<i>Kým tam boli, nadišiel jej čas pôrodu</i><br>" +
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Lukáša   <font color='#B71C1C'>2, 4-7</font><br>" +
                    "V tých dňoch sa vybral Jozef z galilejského mesta Nazaret do Judey, do Dávidovho mesta, ktoré sa volá Betlehem lebo pochádzal z Dávidovho domu a rodu, aby sa dal zapísať s Máriou, svojou manželkou, ktorá bola v požehnanom stave. Kým tam boli, nadišiel jej čas pôrodu. I porodila svojho prvorodeného syna, zavinula ho do plienok a uložila do jasieľ, lebo pre nich nebolo miesta v hostinci.<br>" +
                    "Počuli sme slovo Pánovo.<br><br>" +
                    "<font color='#B71C1C'>Po čítaní sa môže kňaz prítomným krátko prihovoriť. Potom nasleduje spoločná modlitba veriacich.</font><br><br>" +
                    "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
                    "Bratia a sestry, s radosťou a nádejou obráťme v prosbách svoje srdcia k nášmu nebeskému Otcovi, ktorý narodením Ježiša Krista zjavil celému svetu svoju nekonečnú lásku, a volajme:<br>" +
                    "<i>Pane, velebíme tvoju dobrotu.</i><br><br>" +
                    "<font color='#B71C1C'>1.</font> Bože, darca života, rozjasni srdcia všetkých, ktorí s úprimnou radosťou prichádzajú sláviť tohtoročné vianočné sviatky.<br>" +
                    "<font color='#B71C1C'>2.</font> Otče, milosrdná láska, posilni vieru pochybujúcich, upevni nádej hľadajúcich a povzbuď blúdiacich pri hľadaní pravdy o narodení tvojho Syna.<br>" +
                    "<font color='#B71C1C'>3.</font> Pane, nádej sveta, daruj našim očiam svetlo betlehemskej hviezdy, aby nám i ona mohla ukazovať správny smer nášho života, Ježiša Krista.<br>" +
                    "<font color='#B71C1C'>4.</font> Bože, najvyšší vládca, roznecuj v nás túžbu mudrcov z Východu stretnúť sa s tvojím Synom, Ježišom Kristom.<br><br>" +
                    "<font color='#B71C1C'>Spoločná modlitba veriacich sa u zavrie modlitbou požehnania.</font><br><br>" +
                    "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font><br>" +
                    "Modlime sa.<br>" +
                    "Dobrotivý Bože, svätý Otče,<br>" +
                    "ty si tak miloval ľudí,<br>" +
                    "že si im poslal svojho jednorodeného Syna,<br>" +
                    "zrodeného pred všetkými vekmi.<br>" +
                    "Láskavo požehnaj <font color='#B71C1C'>✠</font> tieto jasličky,<br>" +
                    "     <font color='#B71C1C'>(</font>tento betlehem<font color='#B71C1C'>)</font>,<br>" +
                    "ktoré sa stanú radosťou kresťanskej rodiny.<br>" +
                    "Tieto obrazy tajomstva vtelenia nech udržujú<br>" +
                    "vieru rodičov a dospelých,<br>" +
                    "nech oživujú nádej detí<br>" +
                    "a vo všetkých nech zveľaďujú lásku.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Kňaz pokropí jasličky požehnanou vodou.</font><br><br>" +
                    "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Nech vás žehná všemohúci Boh, Otec i Syn <font color='#B71C1C'>✠</font> i Duch Svätý.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Choďte v mene Božom.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka.<br><br>" +
                    "<font color='#B71C1C'>Obrad sa môže ukončiť vhodnou piesňou.</font>"},
            {"Požehnanie vody mimo slávenie omše", "<font color='#B71C1C'>Podľa dávneho zvyku spomedzi znakov, ktoré Cirkvi slúžia na požehnanie veriacich, sa často používa voda. Požehnaná voda totiž pripomína veriacim Krista, ktorý je pre nás vrcholom Božieho požehnania. On sám sa nazval živou vodou a ustanovil pre nás krst na znak spásonosného požehnania.<br>" +
                    "Požehnanie vody a kropenie vodou sa riadne koná v nedeľu podľa obradu, ktorý je opísaný v Rímskom misáli. Používa sa namiesto úkonu kajúcnosti.<br>" +
                    "Keď sa však požehnanie vody koná mimo slávenia omše, kňaz alebo diakon použije obrad, ktorý sa predkladá, pričom pri zachovaní štruktúry a hlavných prvkov obradu prispôsobí slávenie okolnostiam.</font><br><br>" +
                    "<font color='#B71C1C'>ÚVODNÉ OBRADY</font><br>" +
                    "<font color='#B71C1C'>Obrad sa môže začať spievaním vhodnej piesne. Potom kňaz povie:</font><br>" +
                    "<font color='#B71C1C'>K.:</font> V mene Otca i Syna i Ducha Svätého.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Boh, ktorý nás v Kristovi znovuzrodil z vody a z Ducha Svätého, nech je s vami všetkými.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
                    "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne:</font><br>" +
                    "Požehnaním vody si pripomíname Krista, živú vodu, a sviatosť krstu, v ktorom sme sa znovuzrodili z vody a z Ducha Svätého. Vždy, keď sme kropení touto vodou alebo keď ju používame so znakom kríža pri vstupe do chrámu alebo keď sme v našich domoch, vzdávajme Bohu vďaky za jeho nevýslovný dar a vzývajme jeho pomoc, aby sme životom potvrdzovali sviatosť, ktorú sme s vierou prijali.<br><br>" +
                    "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Kňaz prečíta buď nasledovný text, alebo vyberie iný vhodný.</font><br><br>" +
                    "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
                    "<i>Ak je niekto smädný a verí vo mňa, nech príde ku mne a nech pije</i><br>" +
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Jána   <font color='#B71C1C'>7, 37-39</font><br>" +
                    "V posledný veľký deň sviatkov Ježiš vstal a zvolal: \"Ak je niekto smädný a verí vo mňa, nech príde ku mne a nech pije. Ako hovorí Písmo, z jeho vnútra potečú prúdy živej vody.\" To povedal o Duchu, ktorého mali dostať tí, čo v neho uverili. Lebo ešte nebolo Ducha, pretože Ježiš ešte nebol oslávený.<br>" +
                    "Počuli sme slovo Pánovo.<br><br>" +
                    "<font color='#B71C1C'>Po čítaní môže nasledovať krátky príhovor. Po ňom jedna z modlitieb požehnania. Tú kňaz prednesie s rozopnutými rukami.</font><br><br>" +
                    "<font color='#B71C1C'>MODLITBA POŽEHNANIA<br>" +
                    "A</font><br>" +
                    "Modlime sa.<br>" +
                    "Velebíme ťa, Pane, všemohúci Bože,<br>" +
                    "že si nás v Kristovej živej vode našej spásy<br>" +
                    "milostivo požehnal a vnútorne obnovil.<br>" +
                    "Požehnaj <font color='#B71C1C'>✠</font> túto vodu a daj,<br>" +
                    "nech nás pokropenie touto vodou<br>" +
                    "alebo jej nábožné používanie ochraňuje,<br>" +
                    "aby sme obnovení mladosťou ducha<br>" +
                    "silou Ducha Svätého<br>" +
                    "kráčali stále v novosti života.<br>" +
                    "Skrze Krista, nášho Pána,<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen<br><br>" +
                    "<font color='#B71C1C'>B</font><br>" +
                    "Pane, svätý Otče, zhliadni na nás,<br>" +
                    "vykúpených tvojím Synom a v krste<br>" +
                    "znovuzrodených z vody a z Ducha Svätého;<br>" +
                    "prosíme ťa,<br>" +
                    "požehnaj <font color='#B71C1C'>✠</font> túto vodu a daj,<br>" +
                    "aby sme sa pokropení touto vodou<br>" +
                    "obnovovali na tele i na duši<br>" +
                    "a čisto a verne ti slúžili.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Po modlitbe požehnania nasleduje spoločná modlitba veriacich. </font><br><br>" +
                    "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
                    "Drahí bratia s sestry, s vďačným srdcom prednesme svoje prosby, aby Boh vo svojej nekonečnej milosti zhliadol na nás svojou láskou.<br>" +
                    "<i>Prosíme ťa, vyslyš nás.</i><br><br>" +
                    "<font color='#B71C1C'>1.</font> Bože, ty si prameňom živej vody; vlej do nás nádej a silu kráčať v otvorenosti srdca a čistote života.<br>" +
                    "<font color='#B71C1C'>2.</font> Otče, v tebe má pôvod všetko stvorenie; nechaj nás čerpať vodu s radosťou z prameňov spásy.<br>" +
                    "<font color='#B71C1C'>3.</font> Bože, tvoja dobrotivosť je nesmierna; zmy z nás naše viny a pomôž nám znovuzrodiť sa k novému životu.<br>" +
                    "<font color='#B71C1C'>4.</font> Otče, vodou si naplnil moria i toky riek; urob aj z nás pramene dobra a prúdy pomoci svojim blížnym.<br>" +
                    "<font color='#B71C1C'>5.</font> Bože, vodu dávaš všetkým živým tvorom a rastlinám, aby rástli a napĺňali zem; dovoľ nám po skončení nášho pozemského života zavŕšiť svoj rast a naplnenie pred tvojou tvárou v nebeskom kráľovstve.<br><br>" +
                    "Milosrdný Bože, vypočuj naše prosby,<br>" +
                    "ktorými voláme k tebe<br>" +
                    "smädní po vode tvojej dobroty,<br>" +
                    "aby sme ovlažení tvojou radosťou<br>" +
                    "a očistení od hriechov<br>" +
                    "mohli neprestajne šíriť tvoje slovo<br>" +
                    "a chváliť tvoje meno naveky.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Potom kňaz pokropí prítomných požehnanou vodou a ak je to vhodné, povie:</font><br>" +
                    "Nech nám táto voda pripomenie náš krst<br>" +
                    "i Ježiša Krista,<br>" +
                    "ktorý nás vykúpil svojím<br>" +
                    "krížom a zmŕtvychvstaním.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Obrad sa uzavrie záverečným požehnaním.</font><br><br>" +
                    "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Nech vás žehná všemohúci Boh, Otec i Syn 4 i Duch Svätý.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Choďte v mene Božom.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka.<br><br>" +
                    "<font color='#B71C1C'>Na záver sa môže spievať vhodná pieseň.</font>"},
            {"Požehnanie ruženca", "<font color='#B71C1C'>Je dobré, ak sa požehnanie viacerých ružencov koná slávením, ktoré bezprostredne predchádza nábožnej modlitbe ruženca za účasti ľudu.<br>" +
                    "Obrad spoločného slávenia sa vhodne použije aj na sviatky a spomienky blahoslavenej Márie Panny alebo pri príležitosti nábožnej púte.<br>" +
                    "Tento obrad môže použiť kňaz alebo diakon.</font><br><br>" +
                    "<font color='#B71C1C'>ÚVODNÉ OBRADY</font><br>" +
                    "<font color='#B71C1C'>Obrad sa môže začať vhodnou piesňou. Po nej kňaz povie:</font><br>" +
                    "<font color='#B71C1C'>K.:</font> V mene Otca i Syna i Ducha Svätého.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Milosť a pokoj od Boha, nášho Otca, od ktorého skrze Syna, narodeného z Panny, pochádzajú všetky dobrá, nech je s vami všetkými.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
                    "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne:</font><br>" +
                    "Blahoslavená Panna, od večnosti predurčená spolu s vtelením Božieho Slova za Božiu Matku, tu na zemi bola slávnou matkou Vykupiteľa a celkom jedinečným spôsobom spolupracovala na diele spásy.<br>" +
                    "Tento zámer Božej prozreteľnosti sa osobitne a obdivuhodne zvýrazňuje v modlitbe, ktorú voláme ruženec. Preto si pastieri Cirkvi ruženec vysoko cenili a horlivo ho odporúčali.<br>" +
                    "Cirkev teda právom obdarúva osobitným požehnaním ružence a aj tých, ktorí modlitbou ruženca uctievajú tajomstvá nášho vykúpenia a rozjímajú o nich, aby s Máriou a skrze Máriu vzdávali Bohu chvály.<br><br>" +
                    "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Kňaz prečíta buď nasledovný text, alebo vyberie iný vhodný.</font><br><br>" +
                    "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
                    "<i>Ježišova matka zachovávala všetky slová vo svojom srdci</i><br>" +
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Lukáša   <font color='#B71C1C'>2, 46-52</font><br>" +
                    "Po troch dňoch Mária a Jozef našli chlapca Ježiša v chráme. Sedel medzi učiteľmi, počúval ich a kládol im otázky. Všetci, čo ho počuli, žasli nad jeho rozumnosťou a odpoveďami. Keď ho zazreli, stŕpli od údivu a Matka mu povedala: \"Syn môj, čo si nám to urobil ? Pozri, tvoj otec i ja sme ťa s bolesťou hľadali!\" On im odpovedal: \"Prečo ste ma hľadali? Nevedeli ste, že mám byť tam, kde ide o môjho Otca?\" Ale oni nepochopili slovo, ktoré im hovoril. Potom sa s nimi vrátil do Nazareta a bol im poslušný. A jeho matka zachovávala všetky slová vo svojom srdci. A Ježiš sa vzmáhal v múdrosti, veku a v obľube u Boha i u ľudí.<br>" +
                    "Počuli sme slovo Pánovo.<br><br>" +
                    "<font color='#B71C1C'>Po čítaní môže byť krátky príhovor. Po ňom nasleduje spoločná modlitba veriacich.</font><br><br>" +
                    "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
                    "Bratia a sestry, keďže sa ruženec právom pokladá za vynikajúci znak našej úcty k Panne Márii, na orodovanie blahoslavenej Panny vzývajme všemohúceho Boha Otca a volajme:<br>" +
                    "<i>Bože Otče, vyslyš nás.</i><br><br>" +
                    "<font color='#B71C1C'>1.</font> Najláskavejší Otče, ty si Máriu, poslušnú tvojmu slovu, vyvolil za spoločníčku vykúpenia; daj, aby tvoja Cirkev na orodovanie blahoslavenej Panny hojne prijímala ovocie vykúpenia.<br>" +
                    "<font color='#B71C1C'>2.</font> Ty si Pannu Máriu spojil s Kristom, tvojím Synom, úzkym putom a obdivuhodne si ju obdaril plnosťou svojej milosti; daj, aby sme ustavične cítili, že nám vyprosuje milosti.<br>" +
                    "<font color='#B71C1C'>3.</font> Ty si nám v Panne Márii poskytol dokonalý vzor nasledovania Krista; daj, aby sme sa usilovali tajomstvá spásy, ktoré si v modlitbe ruženca nábožne pripomíname, účinne vnášať aj do svojho života.<br>" +
                    "<font color='#B71C1C'>4.</font> Ty si naučil Pannu Máriu, aby všetky tvoje slová zachovávala vo svojom srdci; daj, aby sme nasledujúc jej príklad vierou prijímali slová tvojho Syna a skutkami ich uskutočňovali.<br>" +
                    "<font color='#B71C1C'>5.</font> Ty si dal svojim apoštolom, ktorí sa modlili s Ježišovou matkou Máriou, Ducha Svätého; daj, aby sme zotrvávali na modlitbách a ako žijeme v Duchu, podľa Ducha aj konali.<br><br>" +
                    "<font color='#B71C1C'>Spoločná modlitba veriacich sa uzavrie modlitbou požehnania, vyberie sa jedna z uvedených, ktorú kňaz prednesie s rozopnutými rukami.</font><br><br>" +
                    "<font color='#B71C1C'>MODLITBA POŽEHNANIA<br>" +
                    "A</font><br>" +
                    "Pane Ježišu, ty jednorodený Syn Boží,<br>" +
                    "zrodený z Otca pred všetkými vekmi,<br>" +
                    "mocou Ducha Svätého<br>" +
                    "vzal si si telo z Márie Panny a stal si sa človekom.<br>" +
                    "Požehnaj <font color='#B71C1C'>✠</font> tento ruženec,<br>" +
                    "ktorým vzdávame úctu tvojej najsvätejšej Matke.<br>" +
                    "Daj, aby sa všetci,<br>" +
                    "čo budú tento ruženec s dôverou nosiť<br>" +
                    "a rozjímať o tajomstvách<br>" +
                    "tvojho života, utrpenia a slávy,<br>" +
                    "vždy pevnejšie spájali s tebou<br>" +
                    "a čoraz viac milovali svojich blížnych.<br>" +
                    "Ochraňuj nás od všetkého zla a raz nás uveď<br>" +
                    "medzi zástupy svojich vyvolených,<br>" +
                    "ktorí ťa v sláve Boha Otca<br>" +
                    "v jednote s Duchom Svätým<br>" +
                    "chvália na veky vekov.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>B</font><br>" +
                    "Všemohúci a milosrdný Bože,<br>" +
                    "ty si vo svojej nesmiernej láske,<br>" +
                    "ktorou nás miluješ, chcel,<br>" +
                    "aby si tvoj Syn mocou Ducha Svätého<br>" +
                    "vzal telo z blahoslavenej Panny Márie,<br>" +
                    "podstúpil smrť na kríži a vstal z mŕtvych;<br>" +
                    "láskavo <font color='#B71C1C'>✠</font> požehnaj všetkých,<br>" +
                    "čo budú používať tento ruženec<br>" +
                    "na počesť rodičky tvojho Syna,<br>" +
                    "budú sa ho modliť perami aj srdcom,<br>" +
                    "aby oplývali trvalou nábožnosťou,<br>" +
                    "a keď skončia svoj život,<br>" +
                    "aby ich k tebe mohla priviesť<br>" +
                    "sama blahoslavená Panna Mária.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Kňaz pokropí ruženec požehnanou vodou.<br>" +
                    "Podľa miestnych zvykov nasleduje modlitba ruženca.</font><br><br>" +
                    "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                    "<font color='#B71C1C'>Po speve antifóny, napríklad Zdravas', Kráľovná alebo inej primeranej piesne, kňaz obrad zakončí slovami:</font><br><br>" +
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Boh, ktorý skrze blahoslavenú Máriu Pannu potešil celý svet, nech vás milostivo obdarí svojou dobrotou.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> A požehnanie všemohúceho Boha Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého nech zostúpi na vás a zostane vždy s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Choďte v mene Božom.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka.<br><br>" +
                    "<font color='#B71C1C'>Na záver sa môže spievať vhodná pieseň.</font>"},
            {"Požehnanie obrazu alebo sochy Ježiša Krista", "<font color='#B71C1C'>Popri úcte svätému krížu, ktorý má medzi posvätnými obrazmi prvé a výnimočné miesto, matka Cirkev nábožne vyzýva veriacich aj na uctievanie iných obrazov, aby čím hlbšie nazreli do tajomstva Božej slávy, ktorá zažiarila v tvári Ježiša Krista.<br>" +
                    "Ak ide o súkromný obraz, môže ho požehnať aj diakon.</font><br><br>" +
                    "<font color='#B71C1C'>ÚVODNÉ OBRADY</font><br>" +
                    "<font color='#B71C1C'>Obrad sa môže začať vhodnou piesňou. Po nej kňaz povie:</font><br>" +
                    "<font color='#B71C1C'>K.:</font> V mene Otca i Syna i Ducha Svätého.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Milosť a pokoj od Boha Otca i od nášho Pána Ježiša Krista, ktorý je obrazom neviditeľného Boha, nech je s vami všetkými.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
                    "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne:</font><br>" +
                    "Drahí bratia a sestry, máme naozaj dôvod na radosť, pretože chceme velebiť Boha pri príležitosti požehnania tohto <font color='#B71C1C'>(</font>nového<font color='#B71C1C'>)</font> obrazu nášho Pána Ježiša Krista <font color='#B71C1C'>(</font>ktorý predkladáme veriacim na verejnú úctu<font color='#B71C1C'>)</font>. Tento posvätný obraz nám v prvom rade pripomína, že Kristus je viditeľným obrazom neviditeľného Boha: večný Boží Syn, ktorý zostúpil do lona Panny, je znamením a sviatosťou Boha Otca. Sám totiž povedal: \"Kto vidí mňa, vidí aj Otca.\" Keď teda uctievame tento obraz, pozdvihnime oči ku Kristovi, ktorý s Otcom i Duchom kraľuje naveky.<br><br>" +
                    "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Lektor, niekto z prítomných alebo sám kňaz prečíta nasledovný text, alebo vyberie iný vhodný.</font><br><br>" +
                    "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
                    "<i>Kristus Pán je obraz neviditeľného Boha</i><br>" +
                    "Čítanie z Listu svätého apoštola Pavla Kolosanom   <font color='#B71C1C'>1, 12-20</font><br>" +
                    "Bratia, vzdávame vďaky Bohu Otcovi, ktorý vás urobil súcimi mať účasť na podiele svätých vo svetle. On nás vytrhol z moci tmy a preniesol do kráľovstva svojho milovaného Syna, v ktorom máme vykúpenie, odpustenie hriechov. On je obraz neviditeľného Boha, prvorodený zo všetkého stvorenia, lebo v ňom bolo stvorené všetko na nebi a na zemi, viditeľné i neviditeľné, tróny aj panstvá, kniežatstvá aj mocnosti. Všetko je stvorené skrze neho a pre neho. On je pred všetkým a všetko v ňom spočíva. On je hlavou tela, Cirkvi. On je počiatok, prvorodený z mŕtvych, aby on mal vo všetkom prvenstvo. Lebo Boh chcel, aby v ňom prebývala všetka plnosť, a aby skrze neho zmieril všetko so sebou, keď pre jeho krv na kríži priniesol pokoj všetkému, čo je na zemi aj čo je na nebi.<br>" +
                    "Počuli sme Božie slovo.<br><br>" +
                    "<font color='#B71C1C'>Po čítaní môže byť krátky príhovor. Po ňom nasleduje spoločná modlitba veriacich.</font><br><br>" +
                    "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
                    "Vrúcne prosme Boha Otca, ktorý nám dal za Spasiteľa a Vykupiteľa svoje Slovo, skrze ktoré je všetko stvorené a v ktorom všetko spočíva, a volajme:<br>" +
                    "<i>Otče, daj, aby sme sa stali podobní tvojmu Synovi.</i><br><br>" +
                    "<font color='#B71C1C'>1.</font> Otče, tvoj Syn je nekonečná múdrosť a najvyššia pravda; daj, aby sme ho čoraz hlbšie poznávali a túžili užšie sa k nemu privinúť.<br>" +
                    "<font color='#B71C1C'>2.</font> Otče, ty si poslal svojho Syna na zem a tým si ju posvätil; obveseľuj naše srdce ustavičnou Kristovou prítomnosťou.<br>" +
                    "<font color='#B71C1C'>3.</font> Otče, ty si pomazal Krista za kňaza, kráľa a proroka; daj, aby sme sa mu stali príjemnou obetou, vernými služobníkmi a horlivými učeníkmi.<br>" +
                    "<font color='#B71C1C'>4.</font> Otče, ty si chcel, aby nám bol učiteľom Kristus tichý a pokorný srdcom; daj, aby sme sa od neho poslušne učili dobrotivosti a miernosti.<br>" +
                    "<font color='#B71C1C'>5.</font> Otče, ty si krvou vyliatou na Kristovom kríži zmieril všetko so sebou; daj, aby sme boli šíriteľmi svornosti a pokoja.<br>" +
                    "<font color='#B71C1C'>6.</font> Otče, v nevýslovnom zámere tvojej prozreteľnosti bolo, že náš Spasiteľ visel na kríži, aby premohol smrť a peklo; daj, aby sme v spojení s jeho smrťou mali účasť na jeho zmŕtvychvstaní.<br><br>" +
                    "<font color='#B71C1C'>Spoločná modlitba veriacich sa uzavrie modlitbou požehnania, ktorú kňaz prednesie s rozopnutými rukami.</font><br><br>" +
                    "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font><br>" +
                    "<font color='#B71C1C'>B (ak ide o súkromný obraz, sochu)</font><br>" +
                    "Pane Ježišu Kriste,<br>" +
                    "ty si verný obraz neviditeľného Boha<br>" +
                    "a odlesk jeho slávy;<br>" +
                    "ty sám si povedal: \"Kto vidí mňa, vidí Otca.\"<br>" +
                    "Požehnaj <font color='#B71C1C'>✠</font> tento obraz, pred ktorým ťa vzývame.<br>" +
                    "     <font color='#B71C1C'>(</font>túto sochu, pred ktorou ťa vzývame.<font color='#B71C1C'>)</font><br>" +
                    "Upevňuj vieru všetkých,<br>" +
                    "čo budú naň <font color='#B71C1C'>(</font>na ňu<font color='#B71C1C'>)</font> s dôverou hľadieť.<br>" +
                    "Daj, nech vždy lepšie chápu tajomstvo tvojej spásy<br>" +
                    "a verne ťa nasledujú.<br>" +
                    "Chráň nás pred hriechom a nešťastím,<br>" +
                    "aby sme ťa raz mohli vidieť<br>" +
                    "v sláve Otca z tváre do tváre.<br>" +
                    "Lebo ty žiješ a kraľuješ na veky vekov.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Po modlitbe požehnania kňaz pokropí obraz požehnanou vodou, potom vloží tymian do kadidelnice a obraz incenzuje. Medzitým sa spieva antifóna, hymnus alebo žalm o Kristovom tajomstve znázornenom na obraze, alebo iná primeraná pieseň.<br>" +
                    "Obrad sa uzavrie záverečným požehnaním.</font><br><br>" +
                    "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Boží pokoj, ktorý prevyšuje každú chápavosť, nech uchráni vaše srdcia a vašu myseľ v poznaní a láske Boha a jeho Syna, nášho Pána Ježiša Krista.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> A požehnanie všemohúceho Boha Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého nech zostúpi na vás a zostane vždy s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Choďte v mene Božom.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka.<br><br>" +
                    "<font color='#B71C1C'>Je chvályhodné spievať na záver obradu vhodnú pieseň.</font>"},
            {"Požehnanie obrazu alebo sochy Panny Márie", "<font color='#B71C1C'>Obrazy Božej Matky Márie, rovnako ako obrazy Krista, majú vzbudzovať vo veriacich vieru a úctu k Panne Márii. Nie že by sa verilo, že je v nich nejaká zvláštna sila, pre ktorú by sa mali uctievať, ale že úcta, ktorá sa im vzdáva, vzťahuje sa na samu Pannu Máriu, ktorá je obrazom Božej nevinnosti a čistoty.<br>" +
                    "Ak ide o súkromný obraz, môže ho požehnať aj diakon.</font><br><br>" +
                    "<font color='#B71C1C'>ÚVODNÉ OBRADY</font><br>" +
                    "<font color='#B71C1C'>Obrad sa môže začať vhodnou piesňou. Po nej kňaz povie:</font><br>" +
                    "<font color='#B71C1C'>K.:</font> V mene Otca i Syna i Ducha Svätého.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Milosť nášho Pána Ježiša Krista, narodeného z Matky Panny, a láska Boha Otca i spoločenstvo Ducha Svätého nech je s vami všetkými.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
                    "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne:</font><br>" +
                    "Drahí bratia a sestry, s radosťou sme sa zhromaždili na požehnanie obrazu <font color='#B71C1C'>(</font>sochy<font color='#B71C1C'>)</font> blahoslavenej Panny Márie. Tento obraz pod titulom <font color='#B71C1C'>M.</font> nám bude pripomínať pevný a živý vzťah blahoslavenej Panny Márie ku Kristovi a jeho Cirkvi. Svätá Mária je totiž matka viditeľného Krista, obrazu neviditeľného Boha; ale aj ona je obrazom, vzorom a príkladom Cirkvi: obrazom, v ktorom Cirkev s radosťou rozjíma o tom, čím sama celá túži byť; vzorom, v ktorom poznáva cestu a poriadok na dosiahnutie dokonalého zjednotenia sa s Kristom; príkladom, o ktorý sa Kristova nevesta opiera pri plnení apoštolskej úlohy. S vnútornou pozornosťou a nábožnou horlivosťou usilujme sa mať účasť na tomto posvätnom obrade.<br><br>" +
                    "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Kňaz prečíta buď nasledovný text, alebo vyberie iný vhodný.</font><br><br>" +
                    "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
                    "<i>Blahoslaviť ma budú všetky pokolenia</i><br>" +
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Lukáša   <font color='#B71C1C'>1, 42-50</font><br>" +
                    "Alžbeta zvolala veľkým hlasom: \"Požehnaná si medzi ženami a požehnaný je plod tvojho života. Čím som si zaslúžila, že matka môjho Pána prichádza ku mne? Lebo len bo zaznel tvoj pozdrav v mojich ušiach, radosťou sa zachvelo dieťa v mojom lone. A blahoslavená je tá, ktorá uverila, že sa splní, čo jej povedal Pán.\"<br>" +
                    "Mária hovorila:<br>" +
                    "\"Velebí moja duša Pána<br>" +
                    "a môj duch jasá v Bohu, mojom Spasiteľovi,<br>" +
                    "lebo zhliadol na poníženosť svojej služobnice.<br>" +
                    "Hľa, od tejto chvíle<br>" +
                    "blahoslaviť ma budú všetky pokolenia,<br>" +
                    "lebo veľké veci mi urobil ten, ktorý je mocný,<br>" +
                    "a sväté je jeho meno<br>" +
                    "a jeho milosrdenstvo z pokolenia na pokolenie<br>" +
                    "s tými, bo sa ho boja.\"<br>" +
                    "Počuli sme slovo Pánovo.<br><br>" +
                    "<font color='#B71C1C'>Po čítaní môže byť krátky príhovor. Po ňom nasleduje spoločná modlitba veriacich.</font><br><br>" +
                    "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
                    "Oslavujme nášho Spasiteľa, ktorý sa narodil z Márie Panny, a prosme ho:<br>" +
                    "<i>Na príhovor preblahoslavenej Panny Márie vyslyš nás, Pane.</i><br><br>" +
                    "<font color='#B71C1C'>1.</font> Spasiteľ sveta, ty si mocou svojho vykúpenia uchránil svoju matku od každej škvrny hriechu; zachovaj nás čistých od hriechu.<br>" +
                    "<font color='#B71C1C'>2.</font> Náš Vykupiteľ, ty si Pannu Máriu urobil príbytkom pre seba a svätyňou Ducha Svätého; vybuduj z nás chrám, v ktorom by stále prebýval tvoj Duch.<br>" +
                    "<font color='#B71C1C'>3.</font> Náš Kňaz, ty si chcel, aby tvoja matka stála pri kríži; daj, aby sme sa na jej príhovor tešili z účasti na tvojom utrpení.<br>" +
                    "<font color='#B71C1C'>4.</font> Kráľ kráľov, ty si svoju matku vzal s telom i dušou k sebe do neba; daj, aby sme stále hľadali a chápali, čo je hore.<br>" +
                    "<font color='#B71C1C'>5.</font> Pán neba i zeme, ty si Máriu postavil po svojej pravici ako kráľovnú; daj, aby sme si zaslúžili mať účasť na jej sláve.<br><br>" +
                    "<font color='#B71C1C'>Spoločná modlitba veriacich sa uzavrie modlitbou požehnania, ktorú kňaz prednesie s rozopnutými rukami.</font><br><br>" +
                    "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font><br>" +
                    "<font color='#B71C1C'>B (ak ide o súkromný obraz)</font><br>" +
                    "Všemohúci a večný Bože,<br>" +
                    "podľa úctyhodného zvyku<br>" +
                    "v obrazoch svätých uctievame teba.<br>" +
                    "Prosíme ťa: požehnaj <font color='#B71C1C'>✠</font> tento obraz <font color='#B71C1C'>(</font>túto sochu<font color='#B71C1C'>)</font><br>" +
                    "blahoslavenej Panny a Bohorodičky Márie<br>" +
                    "a daj, aby sme pomocou úcty<br>" +
                    "k našej nebeskej Matke<br>" +
                    "čoraz lepšie chápali jej účasť<br>" +
                    "na diele spásy tvojho Syna Ježiša Krista.<br>" +
                    "Pod jej ochranou nech sme bezpeční<br>" +
                    "pred každým hriechom a nešťastím,<br>" +
                    "aby sme raz v spoločenstve s ňou<br>" +
                    "mali účasť na tvojej večnej sláve.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Po modlitbe požehnania kňaz, ak je to vhodné, pokropí obraz požehnanou vodou, potom naloží tymian do kadidelnice a obraz incenzuje. Medzitým sa spieva žalm alebo hymnus o blahoslavenej Panne Márii so zreteľom na titul predstavený na obraze, alebo jedna z nasledujúcich antifón o Panne Márii, napríklad:</font><br><br>" +
                    "Pod tvoju ochranu sa utiekame<br>" +
                    "svätá Božia Rodička.<br>" +
                    "Neodvracaj zrak od našich prosieb,<br>" +
                    "pomôž nám v núdzi<br>" +
                    "a z každého nebezpečenstva nás vysloboď,<br>" +
                    "ty, Panna slávna a požehnaná. Amen.<br><br>" +
                    "<font color='#B71C1C'>Obrad sa uzavrie záverečným požehnaním.</font><br><br>" +
                    "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Dobrotivý Boh, ktorý prostredníctvom svojho Syna, narodeného z Panny Márie, vykúpil ľudské pokolenie, nech vás milostivo zahrnie svojím požehnaním.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Nech vás vždy a všade ochraňuje tá, skrze ktorú ste prijali pôvodcu života.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Nech vám všetkým, čo ste sa dnes s nábožnou mysľou zhromaždili, udelí Pán duchovné radosti a nebeskú odmenu.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> A požehnanie všemohúceho Boha Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého nech zostúpi na vás a zostane vždy s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Choďte v mene Božom.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka.<br><br>" +
                    "<font color='#B71C1C'>Je chvályhodné obrad zakončiť primeranou piesňou.</font>"},
            {"Požehnanie obrazu alebo sochy svätého", "<font color='#B71C1C'>Cirkev chvályhodne požehnáva obrazy svätých, ktorí sa svojím životom stali \"svetlom v Pánovi\". Obrazy totiž nepripomínajú veriacim iba svätých, ktorých predstavujú, ale veriacich istým spôsobom privádzajú pred ich zrak: \"Čím častejšie totiž oči spočinú na týchto obrazoch, tým živšie v tých, ktorí o nich rozjímajú, rodí sa spomienka a túžba po tých, ktorých obrazy znázorňujú\" <font color='#B71C1C'>(</font>Druhý nicejský koncil<font color='#B71C1C'>)</font>.<br>" +
                    "Ak ide o súkromný obraz, môže ho požehnať aj diakon.</font><br><br>" +
                    "<font color='#B71C1C'>ÚVODNÉ OBRADY</font><br>" +
                    "<font color='#B71C1C'>Obrad sa môže začať vhodnou piesňou. Po nej kňaz povie:</font><br>" +
                    "<font color='#B71C1C'>K.:</font> V mene Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Milosť nášho Pána Ježiša Krista, ktorý je korunou všetkých svätých, a láska Boha Otca i spoločenstvo Ducha Svätého nech je s vami všetkými.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
                    "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne:</font><br>" +
                    "Drahí bratia a sestry, zišli sme sa sláviť obrad požehnania tohto nového obrazu svätého <font color='#B71C1C'>M.</font> <font color='#B71C1C'>(</font>svätej <font color='#B71C1C'>M.)</font>, <font color='#B71C1C'>(</font>ktorý bude vystavený na verejnú úctu veriacich<font color='#B71C1C'>)</font>. Týmto obradom velebíme predovšetkým Boha. Aby sme pochopili zmysel slávenia, treba sa nám vnútorne pripraviť. Keď matka Cirkev predkladá obrazy svätých <font color='#B71C1C'>(</font>na verejnú úctu veriacich<font color='#B71C1C'>)</font>, veľmi má na zreteli, aby sme pri pohľade na obrazy tých, čo verne nasledovali Krista, hľadali budúce mesto a zároveň sa poučili, akou cestou môžeme bezpečne prísť k dokonalému spojeniu s Kristom. Svätí sú totiž priatelia a spoludedičia Ježiša Krista a aj naši bratia a vynikajúci dobrodinci, ktorí nás milujú, sú s nami, starostlivo sa za nás prihovárajú a obdivuhodným spôsobom sú s nami spojení.<br><br>" +
                    "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Kňaz počíta buď nasledovný text, alebo vyberie iný vhodný.</font><br><br>" +
                    "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
                    "<i>Radujte sa a jasajte, lebo máte hojnú odmenu v nebi</i><br>" +
                    "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Matúša   <font color='#B71C1C'>5, 1-12a</font><br>" +
                    "Keď Ježiš videl veľké zástupy, vystúpil na vrch. A keď sa posadil, pristúpili k nemu jeho učeníci. Otvoril ústa a učil ich:<br>" +
                    "\"Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo.<br>" +
                    "Blahoslavení plačúci, lebo oni budú potešení. Blahoslavení tichí, lebo oni budú dedičmi zeme. Blahoslavení lační a smädní po spravodlivosti, lebo oni budú nasýtení.<br>" +
                    "Blahoslavení milosrdní, lebo oni dosiahnu milosrdenstvo.<br>" +
                    "Blahoslavení čistého srdca, lebo oni uvidia Boha.<br>" +
                    "Blahoslavení tí, čo šíria pokoj, lebo ich budú volať Božími synmi.<br>" +
                    "Blahoslavení prenasledovaní pre spravodlivosť, lebo ich je nebeské kráľovstvo.<br>" +
                    "Blahoslavení ste, keď vás budú pre mňa potupovať a prenasledovať a všetko zlé na vás nepravdivo hovoriť; radujte sa a jasajte, lebo máte hojnú odmenu v nebi.\"<br>" +
                    "Počuli sme slovo Pánovo.<br><br>" +
                    "<font color='#B71C1C'>Po čítaní môže byť krátky príhovor. Po ňom nasleduje spoločná modlitba veriacich.</font><br><br>" +
                    "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
                    "Pokorne prosme Boha Otca, ktorý svätých pripodobňuje obrazu svojho Syna a mocou Ducha neprestajne posväcuje svoju Cirkev, a volajme:<br>" +
                    "<i>Na orodovanie svätého <font color='#B71C1C'>(</font>svätej<font color='#B71C1C'>)</font> <font color='#B71C1C'>M.</font> zachráň nás, Pane.</i><br><br>" +
                    "<font color='#B71C1C'>1.</font> Bože, prameň svätosti, ty si dal zažiariť vo svätých obdivuhodným dielam tvojej mnohorakej milosti; daj nám v nich osláviť tvoju velebnosť.<br>" +
                    "<font color='#B71C1C'>2.</font> Bože, žriedlo všetkej múdrosti, ty si prostredníctvom Krista ustanovil apoštolov za základ svojej Cirkvi; zachovaj svojich veriacich v ich náuke.<br>" +
                    "<font color='#B71C1C'>3.</font> Ty si dal mučeníkom silu svedčiť až po vyliatie krvi; urob kresťanov vernými svedkami tvojho Syna.<br>" +
                    "<font color='#B71C1C'>4.</font> Ty si dal svätým pannám vynikajúci dar nasledovať Krista v čistote;<br>" +
                    "daj, aby poznali, že tebe zasvätené panenstvo je osobitným znakom nebeským dobier.<br>" +
                    "<font color='#B71C1C'>5.</font> Ty ukazuješ svoju prítomnosť a zjavuješ svoju tvár a svoje slovo vo všetkých svätých; udeľ svojim veriacim, aby ich uctievaním cítili, že sa užšie spájajú s tebou.<br><br>" +
                    "Spoločná modlitba veriacich sa uzavrie modlitbou požehnania, ktorú kňaz prednesie s rozopnutými rukami.</font><br><br>" +
                    "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font><br>" +
                    "<font color='#B71C1C'>B (ak ide o súkromný obraz, sochu)</font><br>" +
                    "Všemohúci Bože,<br>" +
                    "v každom čase si volíš mužov a ženy,<br>" +
                    "čo s veľkou vierou prijímajú tvoje slovo<br>" +
                    "a hrdinsky nasledujú tvojho Syna Ježiša Krista.<br>" +
                    "Tvojou slávou je zástup tvojich svätých.<br>" +
                    "Prosíme ťa: požehnaj <font color='#B71C1C'>✠</font> tento obraz <font color='#B71C1C'>(</font>túto sochu<font color='#B71C1C'>)</font>,<br>" +
                    "ktorý <font color='#B71C1C'>(</font>ktorá<font color='#B71C1C'>)</font> znázorňuje svätého <font color='#B71C1C'>M.</font> <font color='#B71C1C'>(</font>svätú <font color='#B71C1C'>M.)</font>,<br>" +
                    "a vyslyš modlitby svojich veriacich,<br>" +
                    "ktorí sa budú s dôverou modliť<br>" +
                    "pred týmto obrazom <font color='#B71C1C'>(</font>touto sochou<font color='#B71C1C'>)</font>.<br>" +
                    "Daj, aby sme napodobňovali svätého <font color='#B71C1C'>(</font>svätú<font color='#B71C1C'>)</font> <font color='#B71C1C'>M.</font><br>" +
                    "v čnostiach a v láske k tebe.<br>" +
                    "Ochraňuj všetkých, čo všetku svoju dôveru<br>" +
                    "vkladajú v teba,<br>" +
                    "a prijmi nás do spoločenstva so svätými<br>" +
                    "a tvojimi vyvolenými v nebi.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Po modlitbe požehnania kňaz pokropí obraz požehnanou vodou, potom vloží tymian do kadidelnice a obraz incenzuje. Medzitým sa spieva žalm alebo hymnus zodpovedajúci svätému, ktorého obraz sa požehnáva, alebo nasledujúca antifóna:</font><br><br>" +
                    "Chváľte nášho Boha,<br>" +
                    "všetci jeho svätí<br>" +
                    "aj vy, čo sa bojíte Boha, malí i veľkí.<br>" +
                    "Lebo začal kraľovať Pán, náš všemohúci Boh.<br>" +
                    "Radujme sa a jasajme,<br>" +
                    "vzdávajme mu slávu.<br><br>" +
                    "<font color='#B71C1C'>Obrad sa uzavrie záverečným požehnaním.</font><br><br>" +
                    "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Boh, sláva a plesanie svätých, ktorý vám dal na pomoc takých mocných orodovníkov, nech vás sprevádza stálym požehnaním.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Ich orodovanie nech vás oslobodí od každého zla a ich príklad nech vás poučí o svätom živote, aby ste vždy slúžili Bohu a bratom.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Nech vám Boh dá milosť tešiť sa z tej vlasti, v ktorej sa synovia Cirkvi s radosťou spájajú s občanmi neba vo večnom pokoji.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> A požehnanie všemohúceho Boha Otca i Syna i Ducha Svätého nech zostúpi na vás a zostane vždy s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Choďte v mene Božom.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka.<br><br>" +
                    "<font color='#B71C1C'>Je chvályhodné obrad zakončiť primeranou piesňou.</font>"},
            {"Požehnanie devocionálií", "<font color='#B71C1C'>Tento obrad treba použiť pri požehnaní medailí, malých krížov, náboženských obrazov, ktoré sa nevystavujú na posvätných miestach, škapuliarov, ružencov a podobných predmetov, ktoré sa používajú pri pobožnostiach. Zvlášť vtedy, ak treba požehnať viacero predmetov naraz.</font><br><br>" +
                    "<font color='#B71C1C'>ÚVOD</font><br>" +
                    "<font color='#B71C1C'>Kňaz začne obrad zvolaním:</font><br><br>" +
                    "<font color='#B71C1C'>K.:</font> Naša pomoc <font color='#B71C1C'>✠</font> v mene Pánovom.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Ktorý stvoril nebo a zem.<br><br>" +
                    "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Lektor, niekto z prítomných alebo sám kňaz prečíta nasledovný text, alebo vyberie iný vhodný.</font><br><br>" +
                    "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
                    "Počujme slová Svätého Písma:   <font color='#B71C1C'>Rim 8, 26b-27b</font><br>" +
                    "Nevieme ani to, za čo sa máme modliť, ako treba a sám Duch sa prihovára za nás nevysloviteľnými vzdychmi; prihovára sa za svätých, ako sa páči Bohu.<br>" +
                    "<font color='#B71C1C'>Alebo:   Kol 3, 17</font><br>" +
                    "Všetko, čo hovoríte alebo konáte, všetko robte v mene Pána Ježiša a skrze neho vzdávajte vďaky Bohu Otcovi.<br><br>" +
                    "<font color='#B71C1C'>Nasleduje modlitba požehnania, ktorú kňaz prednesie s rozopnutými rukami. </font><br><br>" +
                    "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font><br>" +
                    "Nech Boh požehná <font color='#B71C1C'>✠</font> tieto predmety<br>" +
                    "     <font color='#B71C1C'>(</font>túto medailu, tento obraz, tento ruženec...<font color='#B71C1C'>)</font>,<br>" +
                    "a nech zveľaďuje a upevňuje<br>" +
                    "tvoju <font color='#B71C1C'>(</font>vašu<font color='#B71C1C'>)</font> nábožnosť,<br>" +
                    "aby si <font color='#B71C1C'>(</font>ste<font color='#B71C1C'>)</font> kráčal <font color='#B71C1C'>(</font>i<font color='#B71C1C'>)</font> v tomto živote bez úhony<br>" +
                    "a šťastlivo dosiahol <font color='#B71C1C'>(</font>dosiahli<font color='#B71C1C'>)</font> večný život.<br>" +
                    "Skrze Krista nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                    "<font color='#B71C1C'>Kňaz môže pokropiť devocionálie požehnanou vodou.</font><br><br>" +
                    "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                    "<font color='#B71C1C'>K.:</font> Nech vás žehná všemohúci Boh, Otec i Syn <font color='#B71C1C'>✠</font> i Duch Svätý.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                    "<font color='#B71C1C'>K.:</font> Dobrorečme Pánovi.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka."},
            {"Rôzne požehnania"},
            {"Požehnanie domu v období slávnosti Zjavenia Pána", "<font color='#B71C1C'>Požehnanie domov na slávnosť Zjavenia Pána je známe od konca stredoveku. Pri požehnaní sa používa voda a tymian, požehnané v tento deň. Nad dvere sa pritom píšu písmená C + M + B. Obrad požehnania kriedy začlenený do Rímskeho rituálu to vykladá ako iniciály mien troch kráľov Caspar, Melchior a Balthasar a podporuje tak veľmi rozšírené vysvetlenie, kým podľa iných ide o počiatočné písmená troch slov prosby <i>Christus mansionetn benedicat - Kristus nech žehná tento dom.</i><br>" +
            "Tento obrad môže vykonať kňaz alebo diakon. </font><br><br>" +
            "<font color='#B71C1C'>ÚVOD</font><br>" +
            "<font color='#B71C1C'>Obrad sa môže začať vhodnou piesňou. Ho nej kňaz povie:</font><br><br>" +
            "<font color='#B71C1C'>K.:</font> V mene Otca i Syna i Ducha Svätého.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
            "<font color='#B71C1C'>K.:</font> Pokoj tomuto domu i všetkým, čo v ňom bývajú.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
            "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne:</font><br>" +
            "Slávime svätý deň ozdobený tromi zázrakmi: dnes priviedla hviezda mudrcov k jasliam; dnes sa zvody stalo víno na svadbe; dnes sa dal Kristus Jánovi pokrstiť v Jordáne, aby nás spasil. Aleluja.<br><br>" +
            "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Kňaz prečíta buď nasledovný text, alebo vyberie iný vhodný. </font><br><br>" +
            "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
            "<i>Otvorili svoje pokladnice a dali mu dary: zlato, kadidlo a myrhu</i><br><br>" +
            "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Matúša   <font color='#B71C1C'>2, 1. 9b-11</font><br>" +
            "Keď sa za čias kráľa Herodesa v judejskom Betleheme narodil Ježiš, prišli do Jeruzalema mudrci od východu. A hľa; hviezda, ktorú videli na východe, išla pred nimi, až sa zastavila nad miestom, kde bolo dieťa. Ako zbadali hviezdu, nesmierne sa zaradovali. Vošli do domu a uvideli dieťa s Máriou, jeho matkou, padli na zem a klaňali sa mu. Potom otvorili svoje pokladnice a dali mu dary: zlato, kadidlo a myrhu.<br>" +
            "Počuli sme slovo Pánovo.<br><br>" +
            "<font color='#B71C1C'>Po čítaní môže byť brátky príhovor. Po ňom nasleduje modlitba požehnania, vyberie sa jedna z uvedených, ktorú kňaz prednesie s rozopnutými rukami.</font><br><br>" +
            "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font><br>" +
            "<font color='#B71C1C'>A</font><br>" +
            "Modlime sa:<br>" +
            "Všemohúci Bože a Otče,<br>" +
            "ty si nás v krste prijal za svoje deti<br>" +
            "a urobil si nás bratmi a sestrami svojho Syna.<br>" +
            "Posilňuj naše spoločenstvo s ním a daj,<br>" +
            "aby sme v našich rodinách žili vo svornosti a láske.<br>" +
            "Bože, chráň tento dom pred zlom a hriechom,<br>" +
            "požehnaj ho <font color='#B71C1C'>✠</font> i všetkých, čo v ňom bývajú,<br>" +
            "aby ti ako domáca cirkev<br>" +
            "prinášali duchovné obete:<br>" +
            "zlato lásky, myrhu utrpenia a kadidlo modlitby.<br>" +
            "Skrze Krista nášho Pána.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
            "<font color='#B71C1C'>B</font><br>" +
            "Modlime sa.<br>" +
            "Velebíme ťa, Bože, náš Otec,<br>" +
            "že dávaš bývať tejto rodine<br>" +
            "v tomto <font color='#B71C1C'>(</font>novom<font color='#B71C1C'>)</font> dome.<br>" +
            "Udeľ členom tejto rodiny<br>" +
            "hojnosť darov Ducha Svätého<br>" +
            "a milosť svojho <font color='#B71C1C'>✠</font> požehnania,<br>" +
            "aby všetci, ktorí bývajú v tomto dome,<br>" +
            "i tí, ktorí budú do tohto domu prichádzať,<br>" +
            "pocítili lásku i pokoj,<br>" +
            "ktoré pochádzajú od teba.<br>" +
            "Skrze Krista, nášho Pána.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
            "<font color='#B71C1C'>C (pre starších ľudí)</font><br>" +
            "Modlime sa.<br>" +
            "Pane Ježišu, ty si naša sila<br>" +
            "a nádej v rozličných útrapách,<br>" +
            "ktoré prináša pokročilý vek;<br>" +
            "zhliadni na týchto svojich služobníkov,<br>" +
            "ktorí bývajú v tomto dome,<br>" +
            "žehnaj <font color='#B71C1C'>✠</font> ich a udeľ im sily,<br>" +
            "aby vedeli trpezlivo znášať ťažkosti života<br>" +
            "a spolu s modlitbou ich prinášali Bohu<br>" +
            "ako duchovnú obetu<br>" +
            "za spásu ich príbuzných<br>" +
            "a za šírenie tvojho kráľovstva.<br>" +
            "Zachovaj ich vo svojej láske a milosti<br>" +
            "a napĺňaj ich svojou radosťou,<br>" +
            "ktorá bude úplná v nebi.<br>" +
            "Lebo ty žiješ a kraľuješ na veky vekov.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
            "<font color='#B71C1C'>Kňaz pokropí dom a prítomných požehnanou vodou a ak používa kadidlo, incenzuje ho. Potom nasleduje spoločná modlitba veriacich.<br>" +
            "Potom on alebo niekto iný napíše na horné veraje dvier začiatočné písmená troch mudrcov (C + M + B) a pred písmeno C prvé dve čísla letopočtu a za písmeno B druhé dve čísla letopočtu, napr.: 20 - C + M + B - 22. </font><br><br>" +
            "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
            "Kde sú zhromaždení dvaja alebo traja v Kristovom mene, tam je Kristus medzi nimi. Spolu s ním teda prednesme svoje prosby nebeskému Otcovi.<br>" +
            "<i>Prosíme ťa, vyslyš nás.</i><br><br>" +
            "<font color='#B71C1C'>1.</font> Nebeský Otče, zachovaj všetkých, čo v tomto dome bývajú, v zdraví a milosti, v pokoji, v čistote a vo vďačnosti.<br>" +
            "<font color='#B71C1C'>2.</font> Posilňuj našu vieru, upevňuj našu nádej a zveľaďuj našu lásku k tebe.<br>" +
            "<font color='#B71C1C'>3.</font> Daj, aby sme sa navzájom znášali a odpúšťali si, ako nám káže náš Pán Ježiš Kristus.<br>" +
            "<font color='#B71C1C'>4.</font> Udeľ našim zosnulým príbuzným večnú radosť v nebeskom domove.<br><br>" +
            "<font color='#B71C1C'>K.:</font> A teraz sa modlime, ako nás naučil náš Pán Ježiš Kristus:<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Otčenáš...<br><br>" +
            "<font color='#B71C1C'>OBRAD POKOJA</font><br>" +
            "<font color='#B71C1C'>Potom kňaz vyzve prítomných, aby si na znak bratskej lásky podali ruky. </font><br>" +
            "<font color='#B71C1C'>K.:</font> Dajte si znak pokoja<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Pokoj a bratská láska nech je medzi nami.<br><br>" +
            "<font color='#B71C1C'>Obrad sa uzavrie záverečným požehnaním. </font><br><br>" +
            "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
            "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
            "<font color='#B71C1C'>K.:</font> Nech vás žehná všemohúci Boh, Otec i Syn <font color='#B71C1C'>✠</font> i Duch Svätý.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
            "<font color='#B71C1C'>K.:</font> Ostávajte v pokoji.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka.<br><br>" +
            "<font color='#B71C1C'>Na záver sa môže spievať vhodná pieseň. </font>"},
    {"Požehnanie domu počas roka", "<font color='#B71C1C'>Pretože sa tento obrad okrem domu priamo týka aj rodiny, vyžaduje sa prítomnosť jej členov.<br>" +
            "Požehnanie domov sa má konať v prítomnosti tých, čo v nich bývajú.<br>" +
            "Zvyčajne sa toto požehnanie slávi v jednotlivých domoch, ale z pastoračných dôvodov a na posilnenie jednoty rodín, ktoré bývajú v tej istej budove alebo na tom istom mieste, sa môže sláviť pre viacero rodín zhromaždených na primeranom mieste. V tomto prípade sa modlitba prednesie v množnom čísle.<br>" +
            "Kňaz môže, vždy pri zachovaní hlavných častí, čiže čítania Božieho slova a modlitby požehnania, prispôsobiť jednotlivé časti jednotlivým rodinným a miestnym okolnostiam. Pri slávení nech si starostlivo a s láskou všimne všetkých prítomných, najmä deti, starých a chorých.<br>" +
            "Pri tomto požehnaní sa používa biela liturgická farba.<br>" +
            "Tomuto obradu môže predsedať kňaz alebo diakon.</font><br><br>" +
            "<font color='#B71C1C'>ÚVODNÉ OBRADY</font><br>" +
            "<font color='#B71C1C'>Na úvod sa môže spievať vhodná pieseň. Potom kňaz povie: </font><br>" +
            "<font color='#B71C1C'>K.:</font> V mene Otca i Syna i Ducha Svätého.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
            "<font color='#B71C1C'>K.:</font> Pokoj tomuto domu a všetkým, čo v ňom bývajú.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
            "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne: </font><br>" +
            "Bratia a sestry, spoločne prosme Pána, ktorý poslal na zem svojho Syna a ktorý teraz posiela svojho služobníka do vášho príbytku, aby nám priniesol svoje požehnanie. Prosiť o zoslanie Pánovej milosti na miesto, na ktorom bývate, aby vám všetko, čo v ňom prežívate a svojou činnosťou zveľaďujete, prinášalo úžitok, spokojnosť a podnecovalo vo vás vytrvalú vďaku za všetky Pánove dobrodenia.<br><br>" +
            "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Kňaz prečíta buď nasledovný text, alebo vyberie iný vhodný. </font><br><br>" +
            "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
            "<i>Dom postavený na skale</i><br>" +
            "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Matúša   <font color='#B71C1C'>7, 24-28</font><br>" +
            "Ježiš povedal: \"Každý, kto počúva tieto moje slová a uskutočňuje ich, podobá sa múdremu mužovi, ktorý si postavil dom na skale. Spustil sa dážď, privalili sa vody, strhla sa víchrica a oborili sa na ten dom, ale dom sa nezrútil, lebo mal základy na skale. A každý, kto tieto moje slová počúva, ale ich neuskutočňuje, podobá sa hlúpemu mužovi, ktorý si postavil dom na piesku. Spustil sa dážď, privalili sa vody, strhla sa víchrica, oborili sa na ten dom a dom sa zrútil; zostalo z neho veľké rumovisko.\"<br>" +
        "Keď Ježiš skončil tieto reči, zástupy žasli nad jeho učením.<br>" +
                "Počuli sme slovo Pánovo.<br><br>" +
                "<font color='#B71C1C'>Kňaz sa môže krátko prihovoriť. Potom nasleduje spoločná modlitba. </font><br><br>" +
                "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
                "Milovaní bratia a sestry, keď vzývame na vašu rodinu Pánovo požehnanie, majme pred očami, že spoločné nažívanie sa môže udržovať a zveľaďovať len vtedy, keď má základ v samom Pánovi. Vzývajme ho teda a volajme:<br>" +
                "<i>Posväť nás, Pane.</i><br><br>" +
                "<font color='#B71C1C'>1.</font> Pane Ježišu Kriste, Duch Svätý posväcuje každé naše úsilie o dobro; daj, aby sa títo tvoji služobníci a služobnice zjednocovali v tvojom mene a aby ich život mal pevný základ v tebe.<br>" +
                "<font color='#B71C1C'>2.</font> Ty si domáci život posvätil spolu s Máriou a Jozefom; nauč všetkých, čo bývajú v tomto dome, byť jeden druhému darom, ktorým sa rodinný život spravuje a posilňuje.<br>" +
                "<font color='#B71C1C'>3.</font> Ty si z členov prirodzenej rodiny ich uvedením do kresťanského života urobil účastníkov duchovnej rodiny; daj, aby títo tvoji služobníci verne vykonávali svoju úlohu v Cirkvi.<br>" +
                "<font color='#B71C1C'>4.</font> Ty si chcel, aby rodiaca sa Cirkev bola zhromaždená vo večeradle s Máriou, tvojou matkou; daj, aby sa táto domáca cirkev od preblahoslavenej Panny naučila zachovávať tvoje slová vo svojom srdci, zotrvávať na modlitbách a veľkodušne sa otvárať blížnym.<br>" +
                "<font color='#B71C1C'>____________________</font><br>" +
                "<font color='#B71C1C'>Vo Veľkonočnom období: </font><br>" +
                "Milovaní bratia a sestry, jasáme veľkonočnou radosťou; pohnutí Duchom Svätým, pokorne vzývajme zmŕtvychvstalého Krista, ktorého Otec ustanovil za začiatok a základ nášho spoločenstva; volajme:<br>" +
                "<i>Pane, zostaň s nami.</i><br><br>" +
                "<font color='#B71C1C'>1.</font> Pane Ježišu Kriste, ty si sa po svojom zmŕtvychvstaní zjavil učeníkom a potešil si ich darom svojho pokoja; daj, nech táto rodina spozná, že si v nej prítomný, a nech sa v tvojom blaženom pokoji vždy viac vinie k tebe.<br>" +
                "<font color='#B71C1C'>2.</font> Ty si sa skrze kríž uponížil, a tak si došiel k sláve vzkriesenia; nauč všetkých členov tejto rodiny aj z každodenných útrap budovať spoločenstvo lásky.<br>" +
                "<font color='#B71C1C'>3.</font> Ty si sedel pri stole s učeníkmi a dal si sa im spoznať pri lámaní chleba; daj, aby táto rodina, ktorá má účasť na spoločnom slávení Eucharistie, posilňovala si vieru a vydávala svedectvo o svojej nábožnosti.<br>" +
                "<font color='#B71C1C'>4.</font> Ty si naplnil silou Ducha Svätého dom, v ktorom boli zhromaždení učeníci spolu s Máriou, tvojou matkou; zošli toho istého Ducha na túto rodinu, aby sa tešila z jeho pokoja a radosti.<br>" +
                "<font color='#B71C1C'>____________________</font><br>" +
                "<font color='#B71C1C'>Po prosbách, ak je to vhodné, kňaz týmito alebo podobnými slovami vyzve všetkých prítomných spievať alebo recitovať Modlitbu Pána: </font><br><br>" +
                "<font color='#B71C1C'>K.:</font> Na príkaz nášho Spasiteľa a podľa jeho božského učenia osmeľujeme sa povedať:<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Otčenáš...<br><br>" +
                "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font><br><br>" +
                "<font color='#B71C1C'>Teraz kňaz vystrie ruky nad všetkých členov rodiny a povie: </font><br>" +
                "<font color='#B71C1C'>A</font></font><br>" +
                "Večný Bože,<br>" +
                "ty sa vo svojej otcovskej láske<br>" +
                "neprestávaš starať o potreby svojich synov a dcér;<br>" +
                "prosíme ťa, vylej na túto rodinu a na tento dom<br>" +
                "hojnosť svojho <font color='#B71C1C'>✠</font> požehnania<br>" +
                "a darom svojej milosti<br>" +
                "posväť všetkých, čo bývajú v tomto dome,<br>" +
                "aby vytrvalo zachovávali tvoje prikázania,<br>" +
                "využívali prítomný čas,<br>" +
                "a tak raz mohli vojsť do príbytku<br>" +
                "pripraveného pre nich v nebi.<br>" +
                "Skrze Krista, nášho Pána.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                "<font color='#B71C1C'>B</font><br>" +
                "Velebíme ťa, Bože, náš Otec,<br>" +
                "za tento dom,<br>" +
                "ktorý poskytuješ tejto rodine na bývanie.<br>" +
                "Nech všetci, čo v ňom prebývajú,<br>" +
                "dosiahnu dary tvojho Ducha<br>" +
                "a nech v činorodej láske prejavujú<br>" +
                "milosť tvojho <font color='#B71C1C'>✠</font> požehnania,<br>" +
                "aby všetci, čo navštívia tento dom,<br>" +
                "našli v ňom vždy ovzdušie lásky a pokoja,<br>" +
                "ktorého, ako vyznávame,<br>" +
                "si len ty pôvodcom.<br>" +
                "O to ťa prosíme skrze Krista, nášho Pána.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                "<font color='#B71C1C'>C (vo Veľkonočnom období)</font><br>" +
                "Velebíme ťa, Bože,<br>" +
                "že si na Veľkú noc<br>" +
                "zachoval neporušené domy svojho ľudu,<br>" +
                "natreté krvou baránka.<br>" +
                "Ty si nám dal ako zavŕšenie svojich znamení<br>" +
                "Ježiša, svojho Syna,<br>" +
                "za nás ukrižovaného a z mŕtvych vzkrieseného<br>" +
                "ako pravého veľkonočného Baránka,<br>" +
                "aby si svojich veriacich ochránil<br>" +
                "pred klamstvom nepriateľa<br>" +
                "a zahrnul milosťou Svätého Ducha.<br>" +
                "Vylej svoje <font color='#B71C1C'>✠</font> požehnanie<br>" +
                "na túto rodinu a na tento dom,<br>" +
                "aby radosť lásky osviežovala<br>" +
                "srdcia v ňom bývajúcich.<br>" +
                "Skrze Krista, nášho Pána.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                "<font color='#B71C1C'>D (pri novostavbe)</font><br>" +
                "Pane Ježišu, buď na pomoci svojim služobníkom,<br>" +
                "ktorí <font color='#B71C1C'>(</font>dnes<font color='#B71C1C'>)</font> začínajú bývať v tomto dome<br>" +
                "a ktorí ťa pokorne prosia <font color='#B71C1C'>✠</font> o požehnanie.<br>" +
                "Aby vždy, keď sa v ňom budú zdržiavať, pocítili,<br>" +
                "že si ich útočiskom,<br>" +
                "aby sa vždy, keď budú z neho vychádzať, tešili,<br>" +
                "že si ich sprievodcom,<br>" +
                "a aby mali radosť, keď sa budú doň vracať,<br>" +
                "kým šťastne nedôjdu do príbytku,<br>" +
                "ktorý majú pripravený v dome tvojho Otca.<br>" +
                "Lebo ty žiješ a kraľuješ na veky vekov.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                "<font color='#B71C1C'>Po modlitbe požehnania kňaz pokropí požehnanou vodou, ak je to vhodné, prítomných a dom, pričom povie: </font><br>" +
                "Táto požehnaná voda nech nám pripomenie náš krst i Ježiša Krista, ktorý nás vykúpil svojím krížom a zmŕtvychvstaním.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                "<font color='#B71C1C'>Obrad sa uzavrie záverečným požehnaním. </font><br><br>" +
                "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                "<font color='#B71C1C'>K.:</font> Nech vás Boh naplní všetkou radosťou a nádejou vo viere.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                "<font color='#B71C1C'>K.:</font> Kristov pokoj nech vládne vo vašich srdciach.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                "<font color='#B71C1C'>K.:</font> Duch Svätý nech vyleje na vás svoje dary.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                "<font color='#B71C1C'>K.:</font> A požehnanie všemohúceho Boha Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého nech zostúpi na vás a zostane vždy s vami.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                "<font color='#B71C1C'>K.:</font> Ostávajte v pokoji.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka.<br><br>" +
                "<font color='#B71C1C'>Je chvályhodné slávenie zakončiť vhodnou piesňou. </font>"},
    {"Požehnanie vozidla", "<font color='#B71C1C'>Veľkou pomocou v živote ľudí je používanie prostriedkov, ktoré skracujú vzdialenosti, umožňujú vzájomné stretanie, utváranie jednoty a vzájomnú komunikáciu a ktoré možno vo všeobecnosti označiť ako prostriedky na cestovanie.<br>" +
            "Keďže používaním týchto prostriedkov sa zdokonaľuje povedomie vzájomnej pomoci, je vhodná príležitosť vzývať Boha o požehnanie a zároveň sa modliť za ľudí, ktorí ich používajú. </font><br><br>" +
            "<font color='#B71C1C'>ÚVODNÉ OBRADY</font><br>" +
            "<font color='#B71C1C'>Na úvod sa môže spievať vhodná pieseň. Potom kňaz povie: </font><br>" +
            "<font color='#B71C1C'>K.:</font> V mene Otca i Syna i Ducha Svätého.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
            "<font color='#B71C1C'>K.:</font> Pán, ktorý je cesta, pravda a život, nech je s vami všetkými.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
            "<font color='#B71C1C'>Kňaz sa prihovorí takto alebo podobne:</font><br>" +
            "Bratia a sestry, toto vozidlo, pred ktorým stojíme, o malú chvíľu požehnáme.<br>" +
            "Budeme prosiť nášho Pána, ktorý nám doprial užívať aj tento prostriedok v našom každodennom živote, aby nás po všetkých cestách, po ktorých s týmto vozidlom budeme cestovať, ochraňoval a pomáhal nám kráčať na nábožnej ceste k nemu.<br><br>" +
            "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Kňaz prečíta buď nasledovný text, alebo vyberie iný vhodný. </font><br><br>" +
            "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
            "<i>Ja som cesta, pravda a život</i><br>" +
            "<font color='#B71C1C'>✠</font> Čítanie zo svätého Evanjelia podľa Jána   <font color='#B71C1C'>4, 6-7</font><br>" +
            "Ježiš povedal svojim učeníkom: \"Ja som cesta, pravda a život. Nik nepríde k Otcovi, iba cezo mňa. Ak poznáte mňa, budete poznať aj môjho Otca. Už teraz ho poznáte a videli ste ho.\"<br>" +
        "Počuli sme slovo Pánovo.<br><br>" +
                "<font color='#B71C1C'>Potom môže nasledovať krátky príhovor a po ňom spoločná modlitba veriacich: </font><br><br>" +
                "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
                "Spoločnou modlitbou pokorne vzývajme Pána Ježiša Krista; on je cesta, ktorou prídeme do nebeskej vlasti.<br>" +
                "<i>Pane, veď naše kroky na tvojej ceste.</i><br><br>" +
                "<font color='#B71C1C'>1.</font> Pane Ježišu, ty si sa stal človekom a láskavo si býval s ľuďmi; daj, aby sme stále podporovaní tvojou prítomnosťou šťastlivo kráčali po cestách tvojej lásky.<br>" +
                "<font color='#B71C1C'>2.</font> Pane Ježišu, ty si prechádzal cez mestá, ohlasoval si evanjelium a uzdravoval chorých; aj teraz milostivo kráčaj po našich uliciach a cestách a posilňuj nás svojím milosrdenstvom.<br>" +
                "<font color='#B71C1C'>3.</font> Pane Ježišu, ty si pomohol učeníkom, keď plávali po mori a vyslobodil si ich z každého nebezpečenstva; milostivo buď pri nás v búrkach tohto sveta.<br>" +
                "<font color='#B71C1C'>4.</font> Pane Ježišu, ty si bol svojim učeníkom sprievodcom na ceste do Emauz; láskavo požehnaj naše cesty a svojimi slovami rozpáľ naše srdcia.<br>" +
                "<font color='#B71C1C'>5.</font> Pane Ježišu, ty si vystúpil do neba a tak si nám otvoril cestu; bedli nad nami putujúcimi na zemi, aby sme mohli mať príbytok v dome nášho Otca.<br>" +
                "<font color='#B71C1C'>6.</font> Pane Ježišu, ty si nás zveril ako synov svojej matke; na jej orodovanie urob bezpečnými naše cesty, aby sme ťa raz mohli vidieť a s tebou sa naveky radovať.<br>" +
                "<font color='#B71C1C'>____________________</font><br>" +
                "<font color='#B71C1C'>Po prosbách môže nasledovať vzývanie svätých o orodovanie.</font><br><br>" +
                "<font color='#B71C1C'>VZÝVANIA A PROSBY</font><br>" +
                "Volajme k svätým patrónom cestujúcich a prosme Pána, ktorý je nám blízko na všetkých našich cestách.<br>" +
                "Svätá Mária, Matka Božia, - oroduj za nás.<br>" +
                "Svätý Rafael,<br>" +
                "Svätý Pavol,<br>" +
                "Svätý Jakub,<br>" +
                "Svätý Krištof,<br>" +
                "Svätý anjel strážca,<br>" +
                "<font color='#B71C1C'>Možno pridať aj mená svätých, ktoré nosia vlastníci vozidiel.<br>" +
                "____________________<br>" +
                "Potom nasleduje modlitba požehnania, vyberie sa jedna z uvedených, ktorú kňaz prednesie s rozopnutými rukami. </font><br><br>" +
                "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font><br>" +
                "<font color='#B71C1C'>A</font><br>" +
                "Všemohúci Bože, Stvoriteľ neba i zeme,<br>" +
                "ty si vo svojej mnohotvárnej múdrosti<br>" +
                "poveril človeka robiť krásne a veľké veci;<br>" +
                "prosíme ťa, daj, aby si tí,<br>" +
                "čo budú používať <font color='#B71C1C'>✠</font> toto vozidlo,<br>" +
                "opatrne a bezpečne počínali na svojich cestách,<br>" +
                "aby dbali na bezpečnosť iných<br>" +
                "a, či už idú za prácou, alebo za odpočinkom,<br>" +
                "vždy cítili,<br>" +
                "že ich na ceste sprevádza Kristus, tvoj Syn,<br>" +
                "ktorý s tebou žije a kraľuje na veky vekov.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                "<font color='#B71C1C'>B</font><br>" +
                "Pane a Bože náš,<br>" +
                "stojíme pred tvojou tvárou a voláme k tebe:<br>" +
                "požehnaj <font color='#B71C1C'>✠</font> toto vozidlo <font color='#B71C1C'>(</font>auto<font color='#B71C1C'>)</font><br>" +
                "a ochraňuj od nešťastia a škody všetkých,<br>" +
                "čo ho budú používať vo svojom povolaní<br>" +
                "alebo vo voľnom čase.<br>" +
                "Daj, aby sme na cestách mali stále<br>" +
                "vedomie zodpovednosti,<br>" +
                "boli ohľaduplní a vždy pripravení pomáhať.<br>" +
                "Nech sme vo všetkom, čo robíme,<br>" +
                "tvojimi svedkami.<br>" +
                "O to ťa prosíme skrze Krista, nášho Pána.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
                "<font color='#B71C1C'>Po modlitbe požehnania, ak je to vhodné, vysluhovateľ požehnanou vodou pokropí vozidlo a aj ľudí.<br>" +
                "Potom obrad uzavrie záverečným požehnaním.</font><br><br>" +
                "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
                "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                "<font color='#B71C1C'>K.:</font> Pán nech riadi vaše cesty, aby ste kráčali v pokoji a došli do večného života.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                "<font color='#B71C1C'>K.:</font> A požehnanie všemohúceho Boha Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého nech zostúpi na vás a zostane vždy s vami.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                "<font color='#B71C1C'>K.:</font> Choďte v mene Božom.<br>" +
                "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka."},
    {"Požehnania pri rozličných príležitostiach", "<font color='#B71C1C'>Na požehnanie rôznych vecí a osôb, ktoré sa v predchádzajúcich požehnaniach výslovne neoznačujú (napríklad požehnanie darov pre chudobných, požehnanie rôznych jedál a pokrmov, napríklad soli alebo oleja, požehnanie zhromaždenia členov nejakej rodiny alebo skupiny a podobne) sa predkladá tento obrad slávenia, ktorý sa môže ľahšie prispôsobiť rozličným okolnostiam.<br>" +
            "Týmto obradom sa nechce nič rušiť zo zásad požehnania. Nepatrí sa z akýchkoľvek vecí robiť príležitosť na slávenie nejakého požehnania (napríklad postavenie nejakého pomníka, vyrobenie nových vojenských zbraní alebo okolností každého druhu). Každé slávenie sa musí vždy podrobiť správnemu pastoračnému úsudku, najmä ak sa dá predvídať nebezpečenstvo, že sa veriaci alebo ostatní ľudia tomu budú diviť.<br>" +
            "Tento obrad môže vykonať kňaz alebo diakon.</font><br><br>" +
            "<font color='#B71C1C'>ÚVODNÉ OBRADY</font><br>" +
            "<font color='#B71C1C'>Obrad sa začne vhodnou piesňou. Potom kňaz povie:<br>" +
            "<font color='#B71C1C'>K.:</font> V mene Otca i Syna i Ducha Svätého.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
            "<font color='#B71C1C'>K.:</font> Boh, prameň každého dobra, nech je s vami všetkými.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br><br>" +
            "<font color='#B71C1C'>Kňaz sa môže prihovoriť takto alebo podobne.</font><br>" +
            "Všetky veci, čo Boh stvoril a udržiava, všetky udalosti, ktoré sám prozreteľne riadi, aj diela ľudí, ktoré sú dobré a vedú k dobru, toto všetko pohýna srdcia i ústa veriacich, aby velebili Boha, pôvodcu a prameň každého dobra.<br>" +
            "Týmto naším slávením vyznávame vieru, že tým, čo sa boja Boha a milujú ho, všetko slúži na dobré; nepochybujeme, že treba vždy a vo všetkom hľadať Božiu pomoc, aby sme sa primkli k vôli nášho Otca a v Kristovi mohli všetko robiť na Božiu slávu.<br><br>" +
            "<font color='#B71C1C'>Nasleduje čítanie Božieho slova. Lektor, niekto z prítomných alebo sám kňaz prečíta nasledovný text, alebo vyberie iný vhodný.</font><br><br>" +
            "<font color='#B71C1C'>ČÍTANIE BOŽIEHO SLOVA</font><br>" +
            "<i>Všetko, čo Boh stvoril, je dobré</i><br>" +
            "Čítanie z Prvého listu svätého apoštola Pavla Timotejovi   <font color='#B71C1C'>4, 4-5</font><br>" +
            "Všetko, čo Boh stvoril, je dobré a nemá sa zavrhovať nič, čo sa prijíma so vzdávaním vďaky, lebo sa to posväcuje Božím slovom a modlitbou.<br>" +
            "Počuli sme Božie slovo.<br><br>" +
            "<font color='#B71C1C'>Kňaz sa môže krátko prihovoriť. Potom nasleduje spoločná modlitba veriacich.</font><br><br>" +
            "<font color='#B71C1C'>SPOLOČNÁ MODLITBA VERIACICH</font><br>" +
            "Boh miluje všetko, čo stvoril, a svojím požehnaním všetko zachováva. Vrúcne prosme, aby nám teraz udelil svoje požehnanie a svojou útechou nás osviežil a udržiaval; volajme spoločne:<br>" +
            "<i>Bože, nech je nad nami tvoje požehnanie.</i><br><br>" +
            "<font color='#B71C1C'>1.</font> Večný Bože, ty dávaš hlbší zmysel životu, ak celým srdcom plníme tvoju vôľu; milostivo nás naplň Duchom tvojej svätosti.<br>" +
            "<font color='#B71C1C'>2.</font> Ty túžiš, aby sme tvoje rozmnožené dary dávali tebe a našim bratom; prijmi obetné dary našej služby a lásky.<br>" +
            "<font color='#B71C1C'>3.</font> Ty vždy hľadíš na nás láskavým okom; vypočuj, Pane, hlas dúfajúcich v teba.<br>" +
            "<font color='#B71C1C'>4.</font> Ty si poslal na svet svojho Syna, aby odstránil kliatbu hriechu a priniesol nám tvoje požehnanie; naplň nás v ňom všetkým nebeským požehnaním.<br>" +
            "<font color='#B71C1C'>5.</font> Ty si nás smrťou a zmŕtvychvstaním svojho Syna vyvolil za svoj ľud a za svoje dedičstvo; pamätaj na nás v našich potrebách a požehnaj svojich dedičov.<br><br>" +
            "<font color='#B71C1C'>Modlitbu požehnania, vyberie sa jedna z uvedených, podľa okolností, prednesie kňaz s rozopnutými rukami.</font><br><br>" +
            "<font color='#B71C1C'>MODLITBA POŽEHNANIA</font><br>" +
            "<font color='#B71C1C'>A (pre osoby)</font><br>" +
            "Pane a Bože náš, z hojnosti svojho milosrdenstva<br>" +
            "udeľ svojim služobníkom dobrá, istotu a pokoj,<br>" +
            "aby posilnení tvojím <font color='#B71C1C'>✠</font> požehnaním<br>" +
            "ustavične ti vzdávali vďaky<br>" +
            "a s jasotom ťa velebili bez konca.<br>" +
            "Skrze Krista, nášho Pána.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
            "<font color='#B71C1C'>B (pre veci)</font><br>" +
            "Všemohúci a večný Bože,<br>" +
            "ty si stvorený svet podriadil ľuďom,<br>" +
            "aby si vzájomne prejavovali služby lásky;<br>" +
            "prosíme ťa,<br>" +
            "dobrotivo vyslyš naše prosby,<br>" +
            "ktorými vzývame tvoje <font color='#B71C1C'>✠</font> požehnanie na tých,<br>" +
            "ktorí budú používať<br>" +
            "tieto veci pre svoju potrebu,<br>" +
            "aby ťa stále uznávali ako najvyššie dobro<br>" +
            "a svojich bratov sprevádzali úprimnou láskou.<br>" +
            "Skrze Krista, nášho Pána.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
            "<font color='#B71C1C'>C (pre veci)</font><br>" +
            "Bože, ty všetko posväcuješ svojím slovom;<br>" +
            "vrúcne ťa prosíme,<br>" +
            "požehnaj <font color='#B71C1C'>✠</font> túto vec <font color='#B71C1C'>(</font>môže sa uviesť konkrétne<font color='#B71C1C'>)</font><br>" +
            "a daj, aby každý, kto ju bude používať<br>" +
            "podľa tvojej vôle,<br>" +
            "dosiahol zdravie tela i duše.<br>" +
            "Skrze Krista, nášho Pána.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
            "<font color='#B71C1C'>D (pre jedlo)</font><br>" +
            "Pane, Bože nekonečnej štedrosti,<br>" +
            "ty nás miluješ svojou otcovskou láskou<br>" +
            "a dávaš nám chlieb pozemský i duchovný.<br>" +
            "Prosíme ťa,<br>" +
            "požehnaj <font color='#B71C1C'>✠</font> toto jedlo <font color='#B71C1C'>(</font>môže sa uviesť konkrétne<font color='#B71C1C'>)</font>,<br>" +
            "aby nám vždy prinášalo úžitok,<br>" +
            "aby sme zaň neprestávali vzdávať vďaku,<br>" +
            "a aby sme tak mohli prísť k večnému<br>" +
            "požívaniu tvojich nebeských dobier.<br>" +
            "Skrze Krista, nášho Pána.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Amen.<br><br>" +
            "<font color='#B71C1C'>Po modlitbe kňaz pokropí požehnanú vec alebo jedlo požehnanou vodou.<br>" +
            "Potom uzavrie obrad záverečným požehnaním.</font><br><br>" +
            "<font color='#B71C1C'>ZÁVEREČNÉ POŽEHNANIE</font><br>" +
            "<font color='#B71C1C'>K.:</font> Boh, ktorého všetko velebí, nech vás skrze Krista vo všetkom žehná, aby vám všetko slúžilo na dobré.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
            "<font color='#B71C1C'>K.:</font> A požehnanie všemohúceho Boha Otca i Syna <font color='#B71C1C'>✠</font> i Ducha Svätého nech zostúpi na vás a zostane vždy s vami.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
            "<font color='#B71C1C'>K.:</font> Choďte v mene Božom.<br>" +
            "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka.<br><br>" +
            "<font color='#B71C1C'>Na konci obradu sa môže spievať vhodná pieseň.</font>"},
};

    String pokoj_mier_Ukrajina = "<font color='#B71C1C'>1.</font> Za pokoj na Ukrajine a Rusku: aby štátnici na oboch stranách hľadali také riešenia, ktoré všetkým prinesú trvalý mier.<br>" +
            "<br>" +
            "<font color='#B71C1C'>2.</font> Prosme za všetkých, ktorí trpia následkami vojny na Ukrajine, aby sa mohli sa vrátiť k pokojnému životu v mieri.<br>" +
            "<br>" +
            "<font color='#B71C1C'>3.</font> Ježišu, ty si život a odpustenie; daj nech všetci pochopia, že iba mier a pokojné spolunažívanie sú cestou k opravdivému rozvoju ľudskej spoločnosti.<br>" +
            "<br>" +
            "<font color='#B71C1C'>4.</font> Modlime sa za kresťanov zasiahnutých vojnou, aby v tomto neľahkom boji o pokoj, ba aj o sám život, svedčili o láske, ku ktorej ich Kristus povolal.<br>" +
            "<br>" +
            "<font color='#B71C1C'>5.</font> Aby politici brali vážne svoju zodpovednosť za mier vo svete a usilovne hľadali spôsoby ako uskutočňovať spoločné dobro pre všetkých ľudí.<br>" +
            "<br>" +
            "<font color='#B71C1C'>6.</font> Nebeský Otče, posilňuj predstaviteľov národov, aby vládli rozumne a s rozvahou, a tak budovali vzájomné a ohľaduplné občianske spolužitie.<br>" +
            "<br>" +
            "<font color='#B71C1C'>7.</font> Pane Ježišu, prosíme ťa za pokoj vo všetkých krajinách, kde zúri vojna a prenasledovanie pre vieru, farbu pleti, či iný názor, aby utíchli zbrane a nastúpil vzájomný dialóg a porozumenie.";
}

