package sk.missa.interfaces;

/*
 * Prosby v cezročnom období uložené v dvojrozmernom poli - cezrokProsby
 * nedeľa: {týždeň v cezročnom období, liturgický rok (A/B/C), názov spoločnej časti, úvodná výzva, odpoveď ľudu, úmysly, záverečná modlitba},
 * deň v týždni: {týždeň v cezročnom období, deň v týždni (1-pondelok, 2-utorok..., 6-sobota), názov spoločnej časti, úvodná výzva, odpoveď ľudu, úmysly, záverečná modlitba},
 */

public interface Prosby_cezrok {
    String[][] cezrokProsby = {
            {"1", "A", "", "", "", ""},
            {"1", "B", "", "", "", ""},
            {"1", "C", "", "", "", ""},
            {"1", "1", "Bratia a sestry, Pán Ježiš nás vyzýva, aby sme sa obrátili a verili evanjeliu. Prosme ho, aby nás urobil svojimi vernými učeníkmi, a spoločne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev: aby vždy vzdávala Bohu vďaku a chválu za všetko, čo od neho neustále prijíma, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za kňazov: aby boli vernými správcami Božích tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za chudobných a tých, ktorí sú bez domova: aby našli ľudí, ktorí im pomôžu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za deti: aby boli uchránené od každej formy násilia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: aby bolo pre nás miestom ľudskej i kresťanskej formácie, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomôž nám,<br>" +
                            "aby sme ochotne počúvali tvoj hlas<br>" +
                            "a podľa neho aj žili.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"1", "2", "Bratia a sestry, s úctou a bázňou predstúpme pred nášho Boha a s dôverou v jeho pomoc mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev a jej predstavených: aby ochotne slúžili Bohu i ľuďom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za tých, ktorí spravujú naše obce, mestá a štáty: aby ich práca bola zodpovedná a svedomitá, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za núdznych, trpiacich a chorých: aby s trpezlivosťou niesli svoje každodenné kríže a pociťovali Božiu pomoc, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za exorcistov: aby podporovaní modlitbou cirkevného spoločenstva boli skutočným nástrojom Krista v boji so zlými duchmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu zhromaždených: aby sme žili vo viere a v nádeji, že s Kristom zvíťazíme nad svojimi slabosťami, prosme Pána.",
                    "Dobrý Bože,<br>" +
                            "ty nám uštedruješ dary svojej milosti<br>" +
                            "a neustále nás zahŕňaš nekonečnou láskou;<br>" +
                            "zhliadni na nás a vypočuj naše prosby,<br>" +
                            "o ktoré ťa dnes s úprimným srdcom prosíme.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"1", "3", "Bratia a sestry, Ježiš Kristus, náš Pán, uzdravuje nielen telo, ale aj ducha. Preto ho s dôverou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby posvätená Kristovou láskou privádzala všetkých ľudí k Bohu.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za štátnych predstaviteľov, aby podporovali dobro, ktoré upevní pokoj v spoločnosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za všetkých trpiacich a chorých, aby im Pán uľavil v bolestiach a aby našli posilu v prijímaní sviatostí.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za starých a slabých, aby vo viere a pokoji prežili jeseň života a vo chvíľach samoty sa stretávali so živým Bohom.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za starých rodičov, aby ochotne a s láskou pomáhali svojim deťom pri výchove vnúčat.",
                    "Pane Ježišu, nebeský lekár,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a udeľ nám pevné zdravie tela i duše.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"1", "4", "Bratia a sestry, Pán Ježiš nám zjavuje tajomstvá Božieho kráľovstva a vo sviatostiach Cirkvi nás očisťuje a uzdravuje. Preto ho s dôverou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby služobníci Cirkvi, biskupi a kňazi, milosrdne a s láskou vysluhovali sviatosť zmierenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby sa predstavitelia štátov a medzinárodných organizácií zodpovedne starali o ľudí žijúcich v biede a o tých, ktorí sú postihnutí civilizačnými chorobami, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby tí, ktorí opustili cestu spásy, využili čas, ktorý im milosrdný Boh dáva na kajúcnosť a návrat, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby pracovníci v zdravotníctve pomáhali chorým prijímať utrpenie a ochotne sa o nich starali, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby zomierajúci v ťažkom hriechu túžili po zmierení s Bohom i ľuďmi a vzbudili si dokonalú ľútosť, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a dotkni sa nás svojou milosťou,<br>" +
                            "aby sme vedeli iným pomáhať<br>" +
                            "a tebe slúžiť s čistým srdcom.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"1", "5", "Bratia a sestry, v srdci každého človeka je vložená túžba po Bohu, po spoločenstve s ním, po jeho odpustení a uzdravení. Spoločne prosme nebeského Otca, ktorý nás zhromaždil na slávenie Eucharistie.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, odpusť nám hriechy a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Svätého Otca, biskupov a kňazov, aby im Kristus pomáhal učiť a posväcovať všetkých ľudí, ktorí sú im zverení.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za tých, ktorí rozhodujú o zdravotnej starostlivosti, aby cítili zodpovednosť aj za chorých v chudobných častiach sveta.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za tých, ktorých trápi pocit viny, aby našli v sviatosti zmierenia liek na svoje rany.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za pokoj v našich rodinách, aby sa Eucharistia, ktorú vo viere slávime, stala pre nás prameňom uzmierenia.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme pamätali na bratov a sestry, ktorí sú rozličným spôsobom hendikepovaní.",
                    "Dobrotivý Otče,<br>" +
                            "ty si nás v Kristovi zmieril so sebou;<br>" +
                            "prosíme ťa, vyslyš naše prosby<br>" +
                            "a daj, nech rastie naša láska<br>" +
                            "a naše odpustenie voči bratom a sestrám.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"1", "6", "Bratia a sestry, prosme Pána Ježiša, ktorý neprišiel volať spravodlivých, ale hriešnikov, aby vypočul naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, prosíme ťa za všetkých kresťanov, aby premenou svojho života verne svedčili o tom, že ty si pravý lekár ľudských duší.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, prosíme ťa za všetkých ľudí, aby pochopili, že nie si len sudca, ale aj láskavý spasiteľ.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, prosíme ťa za mladých ľudí, aby porozumeli radostnej zvesti evanjelia a ochotne ťa nasledovali.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, prosíme ťa za nás samých, aby sme nepohŕdali tými, ktorí žili hriešnym životom a chcú robiť pokánie.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, prosíme ťa za zomrelých <font color='#B71C1C'>(M.)</font>, aby na príhovor Panny Márie dosiahli večnú radosť v nebeskom kráľovstve.",
                    "Pane Ježišu Kriste,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a nauč nás z tvojho slova<br>" +
                            "čerpať svetlo do nového života.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"2", "A", "Bratia a sestry, Boh je verný svojim prísľubom. V osobe Ježiša Krista nám posiela Spasiteľa, ktorý berie naše neprávosti na svoje plecia. Prosme o dar vrúcneho prežívania svojho krstného vyvolenia.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby Cirkev vedela všetkým ľuďom ohlasovať, že Ježiš je Baránok, ktorý sníma hriechy sveta, a len v ňom je spása, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby tí, ktorí sú zodpovední za šírenie informácií, vykonávali svoje povolanie s láskou k pravde, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby kresťania, ktorí sú v otroctve hriechu, objavili svoje povolanie na svätosť a hľadali Božiu vôľu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sa v našom <font color='#B71C1C'>(</font>farskom<font color='#B71C1C'>)</font> spoločenstve rozvíjal duch porozumenia k iným vierovyznaniam, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme si pri slávení Eucharistie uvedomovali, že sme vykúpení krvou Baránka, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "ty si nám, znovuzrodeným v krstnom prameni,<br>" +
                            "dovolil nazrieť do tajomstiev<br>" +
                            "tvojho vnútorného života;<br>" +
                            "vypočuj naše pokorné prosby<br>" +
                            "a napĺňaj naše srdcia svojou láskou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"2", "B", "Bratia a sestry, učeníci sa veľmi tešili, že našli Mesiáša a mohli ostať pri ňom. Prosme Pána, aby sme čoraz lepšie prežívali radosť, že môžeme mať účasť na svätých tajomstvách.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Cirkev, ktorá je Božím domom, aby v nej vládla láska, svornosť a jednota.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za predstavených štátu, aby medzi ľuďmi budovali dobré vzťahy a boli šíriteľmi pravdy.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme aj za chudobných a biednych, aby naša pohostinnosť dokázala zmierniť ich núdzu a trápenie.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za seba samých, aby dobrý príklad každého z nás bol pre druhých povzbudením vo viere.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za umierajúcich, aby pokojne prešli bránou smrti a aby ich Pán voviedol do svojej blaženosti.",
                    "Milosrdný a láskavý Bože,<br>" +
                            "ty si sa v Kristovi viditeľne zjavil medzi nami;<br>" +
                            "prijmi naše modlitby<br>" +
                            "a obdaruj nás duchovnými darmi,<br>" +
                            "aby sme raz mohli bývať<br>" +
                            "v tvojom večnom príbytku.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"2", "C", "Bratia a sestry, Pán Ježiš nám svojou prítomnosťou na svadbe v Káne Galilejskej ukázal, že chce mať účasť na našom živote a na našich životných potrebách. Učme sa žiť v trvalom spojení s ním a pokorne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby neohrozene zastávali nerozlučiteľnosť sviatostného manželstva, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za snúbencov: aby sa čistou láskou a modlitbou pripravovali na prijatie sviatosti manželstva, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za manželov: aby vytrvali vo vzájomnej láske a vernosti v šťastí i v nešťastí, v zdraví aj v chorobe, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za tých, ktorí porušujú manželskú vernosť: aby zmenili svoje zmýšľanie a konanie a vrátili sa na správnu cestu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zomrelých, ktorí hriechmi ubližovali svojim rodinám: aby dosiahli odpustenie a večný pokoj, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "tvoja matka Mária nás povzbudzuje,<br>" +
                            "aby sme urobili všetko, čo nám povieš;<br>" +
                            "s dôverou sme ti predniesli svoje prosby<br>" +
                            "a veríme, že ich vyslyšíš.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"2", "1", "Bratia a sestry, Pán Ježiš nás uisťuje, že je prítomný medzi nami. Spoločne sa modlime za svoju spásu i spásu celého sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ochraňuj nášho Svätého Otca <font color='#B71C1C'>M.</font>, aby pod vedením Ducha Svätého viedol Cirkev k jednote a láske.<br>" +
                            "<font color='#B71C1C'>2.</font> Chráň našu vlasť pred zlom a nešťastím, aby sme v nej nažívali v pokoji a rozvíjali kultúru života.<br>" +
                            "<font color='#B71C1C'>3.</font> Povzbudzuj všetkých kresťanov, aby v zachovávaní pôstnej disciplíny Cirkvi objavili prostriedok osobného posvätenia.<br>" +
                            "<font color='#B71C1C'>4.</font> Žehnaj našich príbuzných a priateľov, aby pocítili tvoju lásku a pomoc.<br>" +
                            "<font color='#B71C1C'>5.</font> Zmiluj sa nad našimi zosnulými <font color='#B71C1C'>(M.)</font>, aby dosiahli večnú slávu v nebi.",
                    "Pane Ježišu, zostaň s nami,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a nám, svojim služobníkom,<br>" +
                            "udeľ dobrá hmotné i duchovné.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"2", "2", "Bratia a sestry, Ježiš Kristus je Pánom nad všetkým. S dôverou mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za nášho pápeža <font color='#B71C1C'>M.</font> a nášho biskupa <font color='#B71C1C'>M.</font>, aby Božím slovom a sviatosťami sýtili veriacich a horlivo sa starali o návrat poblúdených.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za svetských predstavených, aby spravodlivo riadili štát, s úctou pristupovali k ľuďom, a vedeli byť oporou pre národ aj v ťažkých časoch.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za kňazov, rehoľníkov a rehoľníčky, aby v modlitbe hľadali silu na apoštolát a službu v Cirkvi.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za tých, ktorí musia vo sviatočný deň konať služobné práce, aby nezabúdali prehlbovať svoje spoločenstvo s Bohom.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za seba samých, aby sme vždy ochotne otvárali svoje srdcia a pomáhali tým, ktorí to potrebujú.",
                    "Milosrdný Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pomôž nám oslobodiť sa od všetkého,<br>" +
                            "čo nám bráni plniť tvoju svätú vôľu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"2", "3", "Bratia a sestry, Pán Ježiš nás učí, že najvyšším zákonom je láska. Preto ho s pokorou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za nášho pápeža <font color='#B71C1C'>M.</font>: aby v sile Ducha, s pokojom a rozvahou vykonával svoj pastiersky úrad, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za národy Európy: aby prispievali k šíreniu pokoja a k rozvoju spolupráce medzi krajinami celého sveta, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za učiteľov a vychovávateľov: aby boli mladej generácii dobrým príkladom a viedli ju k čistote, úcte a pravej múdrosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za deti a mladých ľudí: aby nemali strach zápasiť s ťažkosťami, ale nachádzali posilu v evanjeliu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zomrelých <font color='#B71C1C'>(M.)</font>: aby očistení od hriechov vstúpili do domu Otca, kde je pravý pokoj a večná radosť, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše pokorné prosby<br>" +
                            "a daj, aby sme pred všetkými pominuteľnými vecami<br>" +
                            "tohto sveta<br>" +
                            "uprednostnili lásku k tebe a k blížnym.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"2", "4", "Bratia a sestry, prednesme Bohu svoje modlitby a prosby, aby sme našli zaľúbenie v jeho očiach. S pokorným srdcom sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, prosíme ťa za nášho pápeža <font color='#B71C1C'>M.</font> i za všetkých biskupov, kňazov a diakonov, aby stále prehlbovali svoju vernosť tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, prosíme ťa za našich svetských predstavených, aby vykonávali svoj úrad pre naše spoločné dobro a viedli náš národ k trvalému pokoju a šťastiu.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, prosíme ťa za ľudí posadnutých zlým duchom, aby s tvojou pomocou dosiahli uzdravenie a oslobodili sa z otroctva zlého ducha.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, prosíme ťa za tých, ktorí neveria v teba, aby spoznali, že aj ich voláš, a aby raz dosiahli účasť na tvojej sláve.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, prosíme ťa za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme horlivo prežívali svoju vieru a nikdy neboli pohoršením pre druhých.",
                    "Všemohúci Bože,<br>" +
                            "vypočuj naše volanie<br>" +
                            "a vyplň prosby,<br>" +
                            "ktoré ti prednášame s oddaným srdcom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"2", "5", "Bratia a sestry, Pán Ježiš povolal k sebe Dvanástich, ktorých si vyvolil. Prosme ho, aby dobrotivo zhliadol na nás a vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosíme ťa, Kriste, za všetkých kňazov, aby neustále čerpali silu z plnosti tvojho kňazstva.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za kresťanov vo Svätej zemi, aby mohli v pokoji vyznávať a žiť svoju vieru.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za mladých, ktorí stratili zmysel života, aby v tebe znova našli plnosť radosti a pokoja.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za tých, ktorí pomáhajú kňazom vo farnostiach, aby sa stále viac zjednocovali s tebou, a veľkodušne slúžili šíreniu Božieho kráľovstva.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa za nás tu zhromaždených, aby sme tomuto svetu odhodlane prinášali tvoje slovo.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme kráčali cestou spravodlivosti a svätosti,<br>" +
                            "na ktorú si nás povolal.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"2", "6", "Bratia a sestry, Pán Ježiš pozýva k sebe aj tých, ktorí v neho neveria, a zmilúva sa aj nad tými, ktorí ho opustili. Preto ho s dôverou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa za Cirkev, aby v súčasnom svete vytrvalo ohlasovala tvoje milosrdenstvo.<br>" +
                            "<font color='#B71C1C'>2.</font> Obdaruj predstavených štátov múdrosťou, aby napomáhali rozvoj chudobných krajín.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, prosíme ťa za rodičov, aby šťastnú budúcnosť svojich detí nevideli len v hmotnom zabezpečení, ale predovšetkým v bohatstve života s tebou.<br>" +
                            "<font color='#B71C1C'>4.</font> Pomôž duševne chorým, aby vo svojom ťažkom položení pocítili pomoc svojich blízkych.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prosíme ťa za nás samých, aby sme sa nebáli požiadaviek evanjelia, ale vytrvalo sa usilovali o svoj duchovný rast.",
                    "Pane Ježišu,<br>" +
                            "na príhovor svojej matky Panny Márie<br>" +
                            "vyslyš naše prosby<br>" +
                            "a udeľ nám milosť trvalej vernosti tebe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"3", "A", "Bratia a sestry, Pán Ježiš aj nám, rovnako ako apoštolom, otvára myseľ, aby sme porozumeli Písmu, a povzbudzuje nás, aby sme mu, zhromaždení v jeho mene, predniesli svoje prosby.",
                    "(Volajme: Prosíme ťa, vyslyš nás.)",
                    "<font color='#B71C1C'>1.</font> Ježišu, Božie Slovo, pomáhaj svojej Cirkvi, aby aj v dnešných časoch ohlasovala evanjelium s odvahou a horlivosťou apoštolov.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, obraz Otca, veď svojím Duchom kresťanských politikov, aby hodnoty Svätého písma vnášali do života celej spoločnosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, nebeský Učiteľ, posilňuj kresťanských teológov, aby svoje štúdium a náuku stavali vždy na múdrosti Svätého písma.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, zasľúbený Mesiáš, zapáľ srdcia kresťanov všetkých vyznaní, aby v jednote viery prameniacej z Božieho slova vyznávali, že si Boží Syn.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, náš Boh a Pán, privádzaj naše spoločenstvo k túžbe denne sa živiť múdrosťou biblickej náuky, aby sme správne verili a podľa viery aj žili.",
                    "Pane Ježišu Kriste,<br>" +
                            "skrze teba Otcovým slovom povstal celý svet;<br>" +
                            "prijmi naše dnešné prosby<br>" +
                            "a láskavo ich vyslyš.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"3", "B", "Bratia a sestry, Pán Ježiš si zhromažďuje učeníkov, ohlasuje Božie kráľovstvo a vyzýva na pokánie. Preto obráťme svoje srdcia k nemu a spoločne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby všetci kresťania ochotne a poslušne odpovedali na Božie volanie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby vo svete víťazili pravé hodnoty, ktoré sú založené na Kristovom posolstve, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby všetci ľudia pochopili, že hriechom a zlobou si pripravujú nešťastie a večnú smrť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme dokázali odstrániť všetky nezhody, ktoré sa nachádzajú v našom spoločenstve, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby miništranti v našich farnostiach rástli na dobrých kresťanov a ochotne odpovedali na Božie volanie, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "ty chceš, aby sme sa pripravovali na stretnutie s tebou;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pomôž nám prekonávať všetko,<br>" +
                            "čo nám prekáža dosiahnuť tvoje kráľovstvo.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"3", "C", "Bratia a sestry, Ježiš Kristus je náš učiteľ. Jeho poslal Otec hlásať evanjelium chudobným. Prosme Pána, aby sa slová jeho radostnej zvesti šírili po celom svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, naplň nás svojím Duchom a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosíme ťa, Pane, za Cirkev, aby Božie slovo ohlasovala a vysvetľovala pravdivo a zrozumiteľne.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za všetkých kresťanov, aby im čítanie Svätého písma prinášalo útechu v smútku, silu v slabosti a svetlo v pochybnostiach.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za lektorov v našich farnostiach, aby ochotne plnili svoju službu a vlastným životom sa stotožnili s tým, čo prednášajú.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za deti a mladých ľudí, aby vždy viac objavovali krásu Božieho slova a radi čítali duchovnú literatúru.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa za tých, ktorí pre chorobu a starobu nemohli prísť na nedeľné eucharistické slávenie, aby sa dokázali duchovne spojiť s liturgickým zhromaždením veriacich.",
                    "Pane Ježišu,<br>" +
                            "ty si prítomný aj vo svojom slove;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj nám lásku k tvojmu evanjeliu,<br>" +
                            "aby sme z neho žili a dosiahli večný život.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"3", "1", "Bratia a sestry, Pán Ježiš povedal, že vnútorne rozdelené kráľovstvo nemôže obstáť. Spoločne sa modlime, aby naše srdcia vždy patrili iba jemu.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, zjednoť naše srdcia a vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosíme ťa za našu Cirkev, aby bola znamením jednoty pre celé ľudstvo.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za všetkých ľudí, aby dokázali rozoznávať skutočné dobro od pominuteľných vecí.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za chudobných a núdznych, aby neboli utláčaní a ponižovaní pre životnú situáciu, v ktorej sa nachádzajú.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za nás samých, aby sme ani zlým slovom, ani príkladom nepohoršovali deti a mládež.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby dosiahli večnú radosť a blaženosť v nebeskom kráľovstve.",
                    "Ježišu, vypočuj naše prosby,<br>" +
                            "posilňuj našu túžbu po spojení s tebou<br>" +
                            "a daj, aby sme nekonali ani neschvaľovali nijaké zlo,<br>" +
                            "ale vždy sa pridŕžali tvojho zákona lásky.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"3", "2", "Bratia a sestry, Ježiš nazýva bratmi a sestrami všetkých tých, ktorí plnia Božiu vôľu. Skrze neho prednesme svoje prosby nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, ochraňuj Svätého Otca <font color='#B71C1C'>M.</font>, nášho biskupa <font color='#B71C1C'>M.</font> a všetkých kňazov, aby boli skutočnými pastiermi Božieho ľudu, schopnými obracať ľudské srdcia k tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, daj ľudstvu múdrosť, aby zodpovedne využívalo prírodné bohatstvo zeme a chránilo životné prostredie.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, usmerňuj synov a dcéry, aby pre hmotné dobrá tohto sveta nezanedbávali starostlivosť o svojich rodičov.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, daj hriešnikom odvahu, aby zanechali hriech i zlo a pokáním napravili svoj život.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, buď milosrdný našim zosnulým <font color='#B71C1C'>(M.)</font> a priveď ich k sebe, aby spoznali veľkosť tvojej lásky.",
                    "Všemohúci Otče,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme vždy poznávali, milovali a plnili tvoju vôľu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"3", "3", "Bratia a sestry, Božie slovo zasiate do nášho srdca nech sa teraz zmení na modlitbu k nebeskému Otcovi. Spoločne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Otče, posväť nás svojím slovom.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, prosíme ťa za našich biskupov, kňazov a diakonov, aby ochotne a s nadšením rozsievali tvoje slovo.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, prosíme ťa za predstaviteľov štátov, aby sa starali nielen o telesný, ale aj o duchovný blahobyt ľudu.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, osvecuj svetlom evanjelia pracovníkov vedy a kultúry, aby novými objavmi a tvorivou prácou obohacovali ľudstvo.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, prosíme ťa za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sa stalo úrodným stromom a prinášalo hojné duchovné ovocie.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, prosíme ťa za našich zomrelých, aby mohli aj prostredníctvom našich modlitieb zakúsiť plnosť života v spojení s tebou.",
                    "Otče, vyslyš naše prosby<br>" +
                            "a posväcuj nás svojím slovom,<br>" +
                            "ktoré nám ohlasoval tvoj Syn Ježiš Kristus.<br>" +
                            "On žije a kraľuje na veky vekov."},
            {"3", "4", "Bratia a sestry, Pán Ježiš je svetlo, ktoré osvecuje každého človeka, preto ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, daj nám svoje požehnanie.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby naši biskupi a kňazi boli svetlom, ktoré osvecuje všetkých ľudí pravdou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby si predstavitelia verejnej moci uvedomovali, že nič nie je také skryté, aby sa raz nevyjavilo, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby sme sa vyhýbali posudzovaniu a pamätali na to, že akou mierou budeme merať my, takou sa nameria aj nám, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby naši trpiaci a chorí vydávali svedectvo viery a boli svetlom pre dnešný svet, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby našim zosnulým <font color='#B71C1C'>(M.)</font> čím skôr zažiarilo Kristovo svetlo, prosme Pána.",
                    "Pane Ježišu, prosíme ťa,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj nám svoje požehnanie,<br>" +
                            "aby sme dobre využívali dary,<br>" +
                            "ktoré sme od teba dostali,<br>" +
                            "a tak prinášali hojnú úrodu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"3", "5", "Bratia a sestry, ako členovia Kristovej Cirkvi sme povolaní, aby sme neustále rástli v každom dobre. Prosme Pána, aby semeno Božieho slova prinášalo v našom živote bohatú úrodu. ",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby všetci biskupi a kňazi boli dobrými rozsievačmi Božieho slova a neohrozene hlásali radostnú zvesť všetkým ľuďom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby sa bohaté krajiny zamerali viac na spoločné dobro ľudí ako na upevnenie svojej moci, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby semeno Božieho slova našlo v našich srdciach úrodnú pôdu a viedlo nás k službe chorým i sužovaným, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby si všetci, ktorí hovoreným a písaným slovom vplývajú na spoločnosť, uvedomili svoju veľkú zodpovednosť pred Bohom i pred ľuďmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme pamätali na to, že našou úlohu je odovzdať budúcim generáciám lepší a krajší svet, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "láskavo vypočuj naše prosby<br>" +
                            "a daj, aby ovocie evanjelia<br>" +
                            "bolo viditeľné v našej službe blížnym.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"3", "6", "Bratia a sestry, Pán Ježiš je pri nás v každej situácii života. Preto ho s dôverou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za nášho pápeža <font color='#B71C1C'>M.</font>: aby nehrozene viedol loďku Cirkvi aj v neľahkých situáciách dnešnej doby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za našich biskupov a kňazov: aby ich ani neúspechy, ani neprijatie od ľudí neodrádzali od horlivej pastoračnej činnosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za predstaviteľov štátov: aby si uvedomovali svoju zodpovednosť za životné prostredie a mali úctu k Stvoriteľovi prírody, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za našich chorých: aby neklesali na duchu, ale odhodlane niesli svoj kríž v spojení s Kristom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby sa čím skôr mohli radovať z Božej prítomnosti v nebeskom domove, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "na príhovor Panny Márie vypočuj naše prosby<br>" +
                            "a daj, aby sme nežili len pre seba,<br>" +
                            "ale napĺňali svoj život obetavou službu blížnym.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"4", "A", "Bratia a sestry, v ôsmich blahoslavenstvách nám Pán Ježiš predstavuje základný zákon svojho kráľovstva. Pokorne prosme, aby sme ho správne pochopili a ochotne prijali.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Cirkev, aby dokázala svedčiť o pravých hodnotách evanjelia aj v časoch nepriazne, výsmechu a prenasledovania.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za predstaviteľov národov, aby v múdrosti a svetle Ducha Svätého viedli ľudí k hodnotám evanjelia.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za tých, ktorí sa nachádzajú v núdzi, za ľudí bez domova, trpiacich a chorých, aby s trpezlivosťou niesli svoje každodenné kríže a pociťovali našu pomoc.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za obrátenie pyšných a príliš sebavedomých, aby v pokore srdca prijali posolstvo blahoslavenstiev, a tak našli pravé bohatstvo ducha.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby boli očistení od hriechov a prežívali večnú radosť blahoslavených.",
                    "Pane Ježišu Kriste,<br>" +
                            "ty si tichý a pokorný srdcom,<br>" +
                            "milosrdný a trpezlivý;<br>" +
                            "prijmi naše prosby<br>" +
                            "a daj, aby sme s radosťou prijali evanjeliové posolstvo,<br>" +
                            "a tak sa stali dedičmi tvojho kráľovstva.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"4", "B", "Bratia a sestry, Pán Ježiš učil ako ten, čo má moc. Prosme ho, aby sme si živšie uvedomovali svoju účasť na jeho prorockom poslaní.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za svätú Cirkev: Pane, daj, aby prostredníctvom sviatostí účinne uzdravovala hriešnikov a príkladom lásky premieňala srdcia ľudí.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za tých, čo spravujú národy: Pane, daj im múdrosť srdca, aby potláčali mravné zlo v akejkoľvek podobe.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých, ktorí sa Bohu zasvätili sľubom čistoty, chudoby a poslušnosti: Pane, napĺňaj ich vnútornou radosťou a svojím pokojom.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za tých, ktorí sa nechali ovládnuť zlom: Pane, daj, aby ich uzdravila tvoja spasiteľná moc a zostali verní tvojmu hlasu.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa aj za nás tu zhromaždených: Pane, obdaruj nás svojou milosťou a pokorou, aby sme dokázali prijímať všetkých ľudí a videli v nich teba samého.",
                    "Pane, vyslyš naše prosby<br>" +
                            "a daj, aby sa sila evanjelia<br>" +
                            "čoraz väčšmi prejavovala<br>" +
                            "v každodennom rodinnom a spoločenskom živote.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"4", "C", "Bratia a sestry, krstom máme účasť na Kristovom prorockom, kňazskom a učiteľskom úrade. Stali sme sa znamením pre svet a svedkami Božej dobroty a trpezlivosti. Úprimne prosme:",
                    "<font color='#B71C1C'>(</font>Pane, buď našou nádejou a silou.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, prenikni srdcia veriacich láskou k Cirkvi, aby v nej objavili poklady pravdy.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, vyhas v ľudských srdciach hnev a nenávisť, aby každý v každom videl svojho brata.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, daruj nám svätých kňazov, ktorí nám svojím životom ukazujú svedectvo viery, nádeje a lásky.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, zachovaj naše rodiny vo svornosti a láske, aby bol súlad a porozumenie medzi deťmi a rodičmi i medzi mladými a staršími.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, upevňuj v nás presvedčenie, že nedeľa je sviatočným dňom, ktorý má posilniť náš vzťah k tebe a k blížnym.",
                    "Ježišu, pravé svetlo,<br>" +
                            "láskavo vyslyš naše prosby<br>" +
                            "a daj, aby sme evanjelium, ktoré počúvame,<br>" +
                            "aj uskutočňovali v každodennom živote.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"4", "1", "Bratia a sestry, v Ježišovi Kristovi nás navštívil sám Boh. Preto teraz pozdvihnime svoje mysle k vrúcnej modlitbe a s dôverou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, žehnaj nášho Svätého Otca <font color='#B71C1C'>M.</font>, aby neohrozene hlásal radostnú zvesť celému svetu.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, osvieť predstaviteľov štátov a národov, aby sa láska k pravde stala jediným kritériom ich rozhodovania.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, poteš všetkých chorých a trpiacich, a daj im pocítiť, že v utrpeniach nie sú sami.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, daj všetkým členom nášho <font color='#B71C1C'>(</font>farského<font color='#B71C1C'>)</font> spoločenstva milosť dobrej modlitby.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, uzdrav tých, ktorých sužuje zlý duch, aby ťa oslobodení mohli oslavovať v tvojej Cirkvi.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane, prijmi našich zosnulých <font color='#B71C1C'>(M.)</font> do večnej radosti.",
                    "Všemohúci a večný Otče,<br>" +
                            "tvoj Syn prišiel uzdraviť skrúšených srdcom;<br>" +
                            "daj, aby sme ochotne žili podľa jeho evanjelia,<br>" +
                            "a tak došli do tvojho kráľovstva.<br>" +
                            "O to ťa prosíme skrze Krista, nášho Pána."},
            {"4", "2", "Bratia a sestry, spolu s predstaveným synagógy padnime Ježišovi k nohám a prosme ho s veľkou vierou.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za nášho pápeža <font color='#B71C1C'>M.</font>: aby všetkým národom vydával svedectvo o milosrdnej Božej láske, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za zákonodarcov štátov: aby prijímali nariadenia, ktoré prinesú pokoj a spravodlivosť všetkým ľuďom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za mravne ohrozených: aby ich dobrý príklad a pomoc blížnych chránili pred zlom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za mladých, ktorí sú vážne chorí: aby našli pomocnú ruku u lekárov, kňazov a každého z nás, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za rodičov, ktorí oplakávajú smrť svojho dieťaťa: aby nezúfali, ale žili naplnení láskou, ktorá všetko pretrpí, prosme Pána.",
                    "Pane Ježišu, tebe nič nie je nemožné;<br>" +
                            "prosíme ťa, vyslyš naše prosby<br>" +
                            "a daj, aby sme si to vždy uvedomovali<br>" +
                            "a svojím životom aj dosvedčovali.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"4", "3", "Bratia a sestry, Boh miluje všetkých ľudí bez rozdielu, preto mu s dôverou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby sa Cirkev prehlbovala v pokore a stala sa oslovujúcou a príťažlivou aj pre našich odlúčených bratov a sestry, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby predstavitelia bohatých národov ochotne a s láskou pomáhali rozvojovým krajinám, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby chorí vo svojich súženiach nikdy nestrácali nádej, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo bolo vždy otvorené pre potreby núdznych, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zosnulí <font color='#B71C1C'>(M.)</font> požívali večnú blaženosť v nebeskom kráľovstve, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme boli vždy vďační za tvoju lásku<br>" +
                            "a milovali aj svojich bratov a sestry.<br>" +
                            "O to ťa prosíme skrze Krista, nášho Pána."},
            {"4", "4", "Bratia a sestry, ako kresťania sme poslaní ohlasovať evanjelium. Preto prosme Pána Ježiša o vytrvalosť vo svojom poslaní.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, prosíme ťa za putujúcu Cirkev, aby pri ohlasovaní tvojho evanjelia bola vzorom v pokání a chudobe.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za predstaviteľov našej vlasti, aby spravodlivými zákonmi chránili dobro každého človeka.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, prosíme ťa za chorých, trpiacich a opustených, aby prijímaním svojho kríža boli vzorom pri ohlasovaní evanjelia.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za kňazské povolania, aby Duch Svätý oduševnil pozvaných mladých mužov a pripravil horlivých robotníkov na duchovnú žatvu.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, prosíme ťa aj za zosnulých biskupov a kňazov, ktorí boli ohlasovateľmi tvojho slova, aby ťa teraz chválili na večnej liturgii v nebi.",
                    "Pane Ježišu,<br>" +
                            "ty prostredníctvom svojej Cirkvi a sviatostí<br>" +
                            "uzdravuješ telesne i duševne chorých;<br>" +
                            "aj dnes konaj divy svojej lásky<br>" +
                            "a prijmi naše modlitby,<br>" +
                            "ktoré ti predkladáme,<br>" +
                            "a vo svojej dobrote ich vyslyš.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"4", "5", "Bratia a sestry, Ján Krstiteľ prelial svoju krv pre ohlasovanie pravdy. Povzbudení jeho príkladom a posilnení Božím slovom spoločne sa modlime k Bohu Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za nášho Svätého Otca, biskupov, kňazov a diakonov: aby posilnení Duchom Svätým boli odvážnymi ohlasovateľmi Božieho slova, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých, ktorí riadia a spravujú túto krajinu: aby boli spravodliví a čestní pri vykonávaní svojho úradu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za postihnutých prírodnými katastrofami: aby sa im dostalo účinnej hmotnej i duchovnej pomoci, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za tých, ktorých sužujú výčitky svedomia: aby vo sviatosti zmierenia našli odpustenie hriechov a pokoj duše, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za rodiny našej farnosti: aby svoje deti viedli k pravým hodnotám a vštepovali im lásku k pravde, prosme Pána.",
                    "Milujúci Otče,<br>" +
                            "aj my sme povzbudení svedectvom Jána Krstiteľa,<br>" +
                            "ktorý nebojácne ohlasoval pravdu;<br>" +
                            "prosíme ťa, vyslyš nás a dopraj nám odvahu a silu<br>" +
                            "statočne vydávať svedectvo o pravde.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"4", "6", "Bratia a sestry, Kristus je naším pastierom. Vedení a posilňovaní jeho Duchom oddane ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, udeľ pastierom Cirkvi horlivosť pri vedení im zvereného ľudu.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, ty si apoštolov zavolal do ústrania, aby spolu s tebou načerpali novú silu; daruj kresťanom lásku k úprimnej modlitbe.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, udeľ predstaveným národov milosť, aby sa starali o tých, ktorí sú im zverení, a aby ich viedli po ceste spravodlivosti a pravdy.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, ty neopúšťaš trpiacich samotou; posilňuj ich svojimi dobrodeniami a daj, aby v modlitbe našli silu a útechu.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, pomáhaj nám, aby sme sa nestarali len o pozemské veci, ale hľadali duchovné hodnoty a večnú spásu.",
                    "Ježišu Kriste, Dobrý pastier,<br>" +
                            "na príhovor Panny Márie<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme sa nedali viesť duchom sveta, ale tebou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"5", "A", "Bratia a sestry, Pán Ježiš nás vyzýva, aby sme boli soľou zeme a svetlom sveta. Preto spoločne prosme o vernosť svojmu kresťanskému povolaniu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, pomáhaj svojej Cirkvi hlásať tvoje evanjelium po celom svete, aby sa stala matkou všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>2.</font> Ochraňuj biskupov, kňazov a diakonov, aby svojím príkladom žiarili tým, ktorí sú im zverení.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, veď svetlom svojho Ducha predstaviteľov štátov, aby vnášali do ľudskej spoločnosti pravé mravné hodnoty.<br>" +
                            "<font color='#B71C1C'>4.</font> Sprevádzaj našich starých a slabých v neľahkom období jesene života a potešuj ich vo chvíľach samoty.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, daj, aby sme v našom <font color='#B71C1C'>(</font>farskom<font color='#B71C1C'>)</font> spoločenstve chápali, že máme byť soľou zeme a svetlom sveta.<br>" +
                            "<font color='#B71C1C'>6.</font> Voveď našich zomrelých <font color='#B71C1C'>(M.)</font> do kráľovstva, v ktorom si ty pravým svetlom.",
                    "Pane Ježišu, naše svetlo a náš učiteľ,<br>" +
                            "vyslyš naše pokorné prosby<br>" +
                            "a pomáhaj nám žiť podľa evanjelia,<br>" +
                            "aby sme svojím mravným životom<br>" +
                            "vyžarovali svetlo tvojho kráľovstva.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"5", "B", "Bratia a sestry, Ježiš Kristus je Boží Syn, ktorý odpúšťa a uzdravuje. Volajme k nemu o pomoc v našich bolestiach a ťažkostiach.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosíme ťa, Pane, za všetkých veriacich, aby plní viery v Krista konali skutky milosrdnej lásky najmä voči chorým, trpiacim, starým a opusteným.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa, Pane, za predstavených národov, aby sa viac starali o tých, ktorí potrebujú zdravotnú či sociálnu pomoc.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa, Pane, za spoločenské organizácie, aby účinne rozvíjali starostlivosť o chorých, starých a hendikepovaných.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa, Pane, za naše rodiny, aby v nich vládol dostatok trpezlivosti a dobrej vôle medzi jednotlivými generáciami.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa, Pane, i za nás samých, aby sme nachádzali silu v modlitbe a prostredníctvom nej duchovne rástli.",
                    "Pane Ježišu, veríme,<br>" +
                            "že nás miluješ nekonečnou láskou<br>" +
                            "a neopúšťaš tých, ktorí ťa prosia o pomoc;<br>" +
                            "v tejto viere ti predkladáme svoje prosby<br>" +
                            "a prosíme, aby si ich prijal<br>" +
                            "a milostivo vypočul, o čo v nich žiadame.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"5", "C", "Bratia a sestry, Pán Ježiš si povoláva svojich spolupracovníkov na budovanie nebeského kráľovstva. Vyprosujme Božiemu ľudu dobrých kňazov, ktorí ho budú viesť k dokonalosti a budú všetkým ľuďom ukazovať cestu k Bohu.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby Cirkev bola pravým domovom pre všetkých, ktorí sú blahoslavení pre svoju chudobu, utrpenie a spravodlivosť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby si vodcovia národov uvedomovali svoju zodpovednosť za svet a spravodlivo sa starali o všetkých ľudí, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby bol v Cirkvi dostatok ľudí ochotných odpovedať na Kristovo volanie do duchovnej služby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby hriešnici zanechali cestu zla a nastúpili na cestu spásy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme mali vždy dobrú vôľu spolupracovať s naším kňazom na duchovnom rozvoji života celej farskej rodiny, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "ty nás uisťuješ o pravdivosti svojho slova;<br>" +
                            "daj, nech veľkodušne odpovedáme na tvoje volanie<br>" +
                            "a pomáhame ti vo svete uskutočňovať tvoj plán spásy.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"5", "1", "Bratia a sestry, Pán Ježiš hlásal evanjelium o kráľovstve a uzdravoval každú chorobu medzi ľuďmi. V dôvere v jeho dobrotu prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, prosíme ťa za Cirkev, aby vysluhovaním sviatostí prinášala tomuto svetu uzdravenie a spásu.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za tých, ktorí zastávajú verejné úrady, aby nehľadali svoje vlastné záujmy, ale slúžili tým, ktorí sú im zverení.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, prosíme ťa za trpiacich, ktorí nesú bremeno choroby a bolesti, aby svoje utrpenie spájali s tvojím krížom a našli v ňom posilu.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za matky <font color='#B71C1C'>(</font>našej farnosti<font color='#B71C1C'>)</font>, aby boli vytrvalé a horlivé v modlitbách za svoje deti.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, prosíme ťa za nás všetkých, aby sme boli citliví na potreby blížnych a vedeli im pomáhať v ich núdzi.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosíme ťa, prijmi do svojej slávy našich zosnulých <font color='#B71C1C'>(M.)</font> a daj im večnú odmenu v nebi.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj nám silnú vieru,<br>" +
                            "ktorá je zárukou večného života.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"5", "2", "Bratia a sestry, Boh je jedinou istotou a skutočnou nádejou v živote človeka. Učme sa na ňom stavať celú svoju existenciu a vyprosujme si na to odvahu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, tvoje slovo je živé a účinné; daj, nech si cirkevní predstavitelia pri vykonávaní svojej služby uvedomujú, že najvyšším zákonom je spása duší.<br>" +
                            "<font color='#B71C1C'>2.</font> Tvoja múdrosť bola pri stvorení sveta a ďalej ho udržuje; daj, nech sa ňou pri tvorbe a uplatňovaní zákonov nechajú viesť tí, čo nás spravujú.<br>" +
                            "<font color='#B71C1C'>3.</font> Tvoja láska uzdravuje, čo je zranené; daj, aby sme neostali slepí voči utrpeniu, ale ochotne sa starali o našich starých a nevládnych rodičov.<br>" +
                            "<font color='#B71C1C'>4.</font> Tvoj Duch obnovuje tvárnosť zeme i mysle veriacich; daj, aby nás nádej na nové nebo a novú zem udržiavala v úsilí o spoluprácu pri spáse sveta.<br>" +
                            "<font color='#B71C1C'>5.</font> Tvoj Syn vyliatím svojej krvi spečatil novú a večnú zmluvu; daj, nech zachovávaním zákona lásky ostaneme verní jeho evanjeliovému posolstvu.",
                    "Všemohúci Bože,<br>" +
                            "ty dávaš prosiacim viac, ako sa odvažujú prosiť;<br>" +
                            "vypočuj tieto naše modlitby,<br>" +
                            "aby sme ešte viac mohli chváliť tvoju dobrotu.<br>" +
                            "O to ťa prosíme skrze Krista, nášho Pána."},
            {"5", "3", "Bratia a sestry, náš Pán Ježiš Kristus nás vyzýva odstrániť každú nečistotu, aby sme mohli chváliť Božie meno. Preto sa spoločne modlime a vrúcne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, očisťuj a zdokonaľuj v láske Cirkev, ktorá ťa prijíma v tvojom slove a eucharistickom chlebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Veď strážcov verejného poriadku, aby bdeli nad mravnosťou a dodržiavaním zákonov v našej spoločnosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, obdaruj chápavým srdcom všetkých, ktorí sa starajú o chorých, aby aj oni vnímali hodnotu utrpenia, ktoré očisťuje.<br>" +
                            "<font color='#B71C1C'>4.</font> Pomôž nám, aby sme vedeli hlbšie chápať zmysel Božích a cirkevných prikázaní.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, odpusť nám všetky zlé myšlienky a skutky, ktoré vychádzajú z nášho vnútra.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby,<br>" +
                            "ktoré ti prednášame z úprimného srdca,<br>" +
                            "a veď nás stále svojím Duchom,<br>" +
                            "lebo ty žiješ a kraľuješ na veky vekov."},
            {"5", "4", "Bratia a sestry, Pán Ježiš uzdravil dcéru pohanskej ženy, pretože ho vytrvalo prosila. Aj my mu s dôverou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj, aby Cirkev hlásaním evanjelia umožnila všetkým ľuďom spoznať v tebe Spasiteľa sveta.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, daj, aby bohatšie krajiny pomáhali chudobnejším krajinám zmierňovať ich biedu.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, daj, nech všetci chorí a opustení nachádzajú v kresťanských bratoch a sestrách tvoju starostlivú lásku.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, daj, aby sa kresťanské rodiny schádzali na spoločných modlitbách a vzájomne sa posilňovali Božím slovom.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, daj, aby naši zosnulí <font color='#B71C1C'>(M.)</font> spoznali tvoju dobrotu a milosrdenstvo, veď verili a dúfali v teba.",
                    "Pane Ježišu,<br>" +
                            "vypočuj prosby svojho ľudu<br>" +
                            "a dopraj nám vytrvať v tvojej milosti,<br>" +
                            "aby sme konali vždy len dobro<br>" +
                            "a šírili okolo seba pravú radosť a nádej.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"5", "5", "Bratia a sestry, s dôverou predstúpme pred Pána, ktorý vracia hluchým sluch a nemým reč, a prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby si Cirkev vždy uvedomovala svoju úlohu, ktorú si jej zveril: učiť, chrániť, tešiť a posilňovať.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilňuj kresťanov, aby ochotne konali skutky telesného a duchovného milosrdenstva.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, daj sluchovo postihnutým bratom a sestrám pomocníkov na ich životnej ceste.<br>" +
                            "<font color='#B71C1C'>4.</font> Prebuď v opustených a ťažko skúšaných ľuďoch túžbu po živote s tebou.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, daj nám silu, aby sme svojím jazykom neubližovali našim blížnym.<br>" +
                            "<font color='#B71C1C'>6.</font> Daj nám milosť, aby sme mali v úcte dobré meno a česť našich blížnych.",
                    "Pane Ježišu,<br>" +
                            "ty uzdravuješ tých, ktorí veria v teba;<br>" +
                            "vypočuj modlitby svojej Cirkvi<br>" +
                            "a daj, aby ťa oslavovali všetky národy.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"5", "6", "Bratia a sestry, Pán Ježiš sa zľutoval nad hladným zástupom, ktorý ho počúval. Aj my sme sa zišli, aby sme počúvali jeho slová, preto sa vrúcne modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za biskupov a kňazov Cirkvi, aby v úzkom spojení so Svätým Otcom jasne vysvetľovali Božie pravdy.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za predstaviteľov štátov, aby sa starali nielen o materiálne, ale aj o duchovné potreby obyvateľov.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za opustených a ľudí bez domova, aby v priazni druhých našli pomoc pri riešení svojich problémov.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za seba samých, aby sme sa sýtili Božím slovom a boli jeho hodnovernými svedkami.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za zosnulých kňazov, aby mali účasť na večnej liturgii v nebeskom Jeruzaleme.",
                    "Pane Ježišu,<br>" +
                            "ty si naším pokrmom;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj nám čisté srdce,<br>" +
                            "aby sme ťa mohli často prijímať v Eucharistii.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"6", "A", "Bratia a sestry, ani oko nevidelo, ani ucho nepočulo, ani do ľudského srdca nevystúpilo, čo Boh pripravil tým, ktorí ho milujú. Preto sa s dôverou modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, daj, aby tvoji kňazi verne hlásali náuku, ktorú si zjavil, a aby ju svojím životom aj potvrdzovali.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomôž mierumilovným ľuďom odstrániť zo sveta násilie a vojny.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, vyhas v ľuďoch, ktorí sa hnevajú, oheň hnevu a nenávisti a pomôž im zmieriť sa.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj, aby sa ľudia chránili hriechov smilstva a cudzoložstva, ktoré zabíjajú pravú lásku a ničia šťastie.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, chráň nás, aby sme zlým slovom alebo príkladom nepohoršovali deti a mládež.<br>" +
                            "<font color='#B71C1C'>6.</font> Uveď zosnulých <font color='#B71C1C'>(M.)</font>, do spoločenstva svojich svätých v nebi.",
                    "Všemohúci Bože, vyslyš naše prosby<br>" +
                            "a chráň nás od všetkých nástrah zlého ducha,<br>" +
                            "aby sme kráčali cestou života bez poškvrny.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"6", "B", "Bratia a sestry, spravodlivosť a mravná čistota sú znamením Božej prítomnosti v duši človeka i v spoločnosti. Pokorne prosme nášho nebeského Otca, aby v nás prebýval a pôsobil.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby opustení a chorí našli teplo prijatia a pomoci v spoločenstve Cirkvi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby predstavitelia našej krajiny spravodlivými zákonmi vytvárali dobré sociálne prostredie pre pomoc biednym a sužovaným, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby chorí nachádzali posilu a úľavu v častom prijímaní nebeského pokrmu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sa hriešnici zbavili svojich hriechov a očistili sa vo sviatosti pokánia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sa našlo čoraz viac ochotných ľudí, ktorí sa z lásky k Bohu venujú nevyliečiteľne chorým, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Aby sme boli vďační za dar zdravia a za očistenie od hriechov, prosme Pána.",
                    "Bože Otče, vyslyš naše prosby<br>" +
                            "a dotkni sa nás svojou milosťou,<br>" +
                            "aby sme ti mohli slúžiť v zdraví a s čistým srdcom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"6", "C", "Bratia a sestry, Pán Ježiš pozýva všetkých ľudí k sebe, pretože blahoslavený je ten, kto vkladá svoju nádej do neho. Zverme mu každý okamih svojho života a vrúcne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, urob svoju Cirkev domovom všetkých, ktorí sú blahoslavení pre svoju chudobu, utrpenie alebo spravodlivosť.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomáhaj národom, ktoré ťa nepoznajú, nachádzať cestu k tebe.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, naplň radosťou a útechou všetkých trpiacich, ktorí sa s dôverou obracajú k tebe.<br>" +
                            "<font color='#B71C1C'>4.</font> Posilňuj svojím Duchom tých, ktorí sú v zápase o dobro unavení alebo osamotení.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, buď pre každého z nás neustálym zdrojom vnútornej radosti, mravnej sily a plnosti života.<br>" +
                            "<font color='#B71C1C'>6.</font> Priveď do večného života zomrelých kňazov, ktorí pre teba opustili všetko a nasledovali ťa.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomáhaj nám,<br>" +
                            "aby sme svojím príkladom mnohých privádzali k tebe<br>" +
                            "a všetku dôveru vkladali iba do teba.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"6", "1", "Bratia a sestry, Boh nás denne posilňuje mnohými duchovnými darmi, sprevádza nás svojou pomocou a milosťou, a predsa niekedy žiadame znamenia o jeho existencii a láske k nám. Modlime sa, aby nám otvoril srdce a spoločne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, posilni našu vieru a vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za všetkých kresťanov, aby s radosťou prijímali znamenie Božieho milosrdenstva, ktorým je Ježiš Kristus.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za neveriacich, aby prirodzenou cestou rozumu našli pravdu o Bohu, a tak prijali radostnú zvesť o Ježišovi Kristovi.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za poverčivých ľudí, aby sa oslobodili od povier a tešili sa zo slobody Božích detí.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za nás samých, aby sme stále túžili po Kristovej náuke a ochotne podľa nej žili.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za zosnulých <font color='#B71C1C'>(M.)</font>, aby dosiahli večnú spásu a v radosti videli Boha z tváre do tváre.",
                    "Bože, veríme,<br>" +
                            "že Ježiš je najväčším znamením tvojej lásky k nám;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme nikdy nepohrdli týmto tvojím darom<br>" +
                            "a mali srdcia vždy otvorené pre pravdu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"6", "2", "Bratia a sestry, denne zažívame mnoho situácií, ktoré nás ovplyvňujú. Prosme všemohúceho Boha, aby chránil naše srdcia pred kvasom zla a hriechu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Cirkev, skrze ktorú dostávame Eucharistiu, aby bola uchránená od kvasu ľahostajnosti a pretvárky.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za tých, ktorí pomáhajú chudobným a chorým, aby mali vedomie, že tak slúžia samému Kristovi.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za tých, ktorí podliehajú zúfalstvu a beznádeji, aby v Kristovi našli istotu a pokoj.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za rodičov a vychovávateľov, ktorí vštepujú do detských sŕdc základné ľudské hodnoty, aby im odovzdali správne morálne zásady a kultúru života.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za seba samých, ktorí pri liturgii počúvame Božie slovo, aby sme ho správne chápali a podľa neho aj žili.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme za zosnulých <font color='#B71C1C'>(M.)</font>, pre ktorých sa skončil čas pozemského putovania, aby ich dobrý Boh obdaril večným životom.",
                    "Všemohúci Bože,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pomôž nám očistiť sa od každého zla a hriechu,<br>" +
                            "aby sme správne porozumeli náuke evanjelia.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"6", "3", "Bratia a sestry, s úprimnou dôverou prosme o Božie svetlo pre všetkých ľudí a spoločne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých veriacich v Krista: aby v každodenných okolnostiach života dokázali vnímať Božiu prítomnosť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za neveriacich: aby rozpoznali tajomné pôsobenie Boha vo svete, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za ťažko skúšaných: aby napriek nepriazni osudu našli dostatok ľudskej pomoci a pochopenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za zrakovo postihnutých: aby napriek svojmu hendikepu dokázali rozvíjať ostatné dary, ktoré im Boh dáva, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zosnulých <font color='#B71C1C'>(M.</font> a všetkých našich blízkych zosnulých<font color='#B71C1C'>)</font>: aby sa radovali z daru večného života, prosme Pána.",
                    "Bože, náš nebeský Otec,<br>" +
                            "prijmi našu dnešnú modlitbu<br>" +
                            "a naplň nás svojou milosťou,<br>" +
                            "aby sme preniknutí Duchom Svätým<br>" +
                            "neustále cítili tvoju dobrotu voči nám.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"6", "4", "Bratia a sestry, spolu s apoštolom Petrom vyznajme, že Ježiš je Mesiáš, a s nádejou ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, prosíme ťa za nášho pápeža <font color='#B71C1C'>M.</font>, nástupcu svätého apoštola Petra, aby privádzal čím viacerých k spáse.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, prosíme ťa za náš národ, aby vo všetkých ťažkostiach dôveroval Božej prozreteľnosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, prosíme ťa za trpiacich, aby nestrácali zmysel života a poznávali hodnotu svojho kríža.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, prosíme ťa za nás samých, aby sme každým dňom rástli vo viere a pred ľuďmi vyznávali, že ty si Mesiáš.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, prosíme ťa za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby sa naveky tešili pohľadom na tvoju velebu.",
                    "Pane Ježišu,<br>" +
                            "Mesiáš a Syn človeka,<br>" +
                            "tebe zverujeme svoje prosby<br>" +
                            "a do teba vkladáme všetku svoju nádej;<br>" +
                            "prosíme ťa,<br>" +
                            "pomáhaj nám zvestovať svetu<br>" +
                            "tvoju smrť a zmŕtvychvstanie,<br>" +
                            "kým neprídeš v sláve.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"6", "5", "Bratia a sestry, dnes nás Ježiš učí, že kto chce ísť za ním, musí zaprieť sám seba a vziať svoj každodenný kríž. Prosme o silu vytrvalo ho nasledovať.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa, aby veriaci v každodenných ťažkostiach svojho života rástli v láske k tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa, aby tí, ktorí trpia duchovne a fyzicky, poznali bohatstvo tvojho kríža a našli v ňom útechu a istotu.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za mladých, aby porozumeli tvojej vznešenej náuke o strate a nájdení života pre večnosť.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za nás samých, aby sme sa nikdy nehanbili priznať k tebe a k tvojmu krížu.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa za zosnulých <font color='#B71C1C'>(M.)</font>, aby sa vďaka tvojej obete kríža večne radovali v nebeskom kráľovstve.",
                    "Pane Ježišu, sám si naplnil skutkom to,<br>" +
                            "čo si učil slovom;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme pochopili,<br>" +
                            "že nás všetky utrpenia môžu privádzať k tebe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"6", "6", "Bratia a sestry, v duchu padnime na tvár pred Ježišom, vyznajme vieru v neho a spolu s apoštolmi Petrom, Jakubom a Jánom ho vrúcne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, ty si vyviedol apoštolov na vysoký vrch do samoty, aby boli s tebou; privádzaj všetkých našich biskupov k hlbokému osobnému vzťahu k tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, ty si sa pred zrakom apoštolov premenil a ukázal im svoju slávu; dávaj sa ako Boh a Pán spoznať všetkým, ktorí si myslia, že sú pánmi tohto sveta.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, Peter vyjadril túžbu zostať pri tebe; privádzaj k sebe všetkých, ktorí ťa nepoznajú, aby zatúžili po tvojej prítomnosti.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, tvoj Otec zjavil, že si jeho milovaný Syn; obdaruj vrúcnou rodičovskou láskou všetkých, ktorí opustili svoje deti alebo sa o ne nestarajú.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, ty si apoštolom prikázal, aby o tvojom premenení nehovorili nikomu, kým nevstaneš z mŕtvych; daj nám pevnú vieru, aby sme ako tvoja matka Mária uchovávali vo svojom srdci všetky tvoje slová.",
                    "Ježišu, ty nás pozývaš k sebe<br>" +
                            "a premieňaš sa pred našimi očami;<br>" +
                            "prosíme ťa, prijmi prosby svojho ľudu<br>" +
                            "a posilňuj našu vieru v tvoje božstvo.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"7", "A", "Bratia a sestry, počuli sme Kristovu výzvu: buďte dokonalí, ako je dokonalý váš nebeský Otec. Vrúcne prosme nášho Pána, aby sme s jeho pomocou dosiahli túto dokonalosť a konali skutky lásky.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby tí, ktorí Cirkev prenasledujú alebo odmietajú, našli v jej náručí láskavú matku a raz aj večnú spásu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby sa ľudia vo svete neodplácali zlom za zlo a nenávisťou za nenávisť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby tí, ktorí trpia nedostatkom lásky, nachádzali ju v našom kresťanskom spoločenstve, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby si všetci členovia nášho <font color='#B71C1C'>(</font>farského<font color='#B71C1C'>)</font> spoločenstva navzájom odpustili a žili v pokoji a bratskej láske, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby zosnulí <font color='#B71C1C'>(M.)</font>, na ktorých si pri tejto omši spomíname, dosiahli v nebi večnú slávu, prosme Pána.",
                    "Pane Ježišu, vyslyš naše prosby<br>" +
                            "a zachovaj v nás lásku a múdrosť Ducha Svätého,<br>" +
                            "ktorá vedie k tebe,<br>" +
                            "aby sme boli tvoji naveky.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"7", "B", "Bratia a sestry, Pán Ježiš uzdravoval chorých na dôkaz toho, že má aj moc odpúšťať hriechy. Prosme ho, aby sme lepšie chápali, aký neoceniteľný dar máme vo sviatosti zmierenia.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, tvoja Cirkev vlastní vodu krstu a slzy pokánia; daj, aby jej členovia láskou a modlitbami napomáhali obrátenie svojich bratov a sestier.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, ty si prišiel na svet, aby si nás oslobodil od hriechu; daj, aby všetci ľudia pochopili, že hriech je nepriateľom pokoja a spravodlivosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, ty si chorého uzdravil pre vieru jeho priateľov; žehnaj všetkých, ktorí pomáhajú chorým a posilňujú ich vo viere.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, ty si ochrnutému odpustil hriechy; daj, aby všetci veriaci v odpustení svojich previnení spoznali znak tvojej lásky.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, chorému stretnutie s tebou zmenilo život; daj, nech naše dnešné stretnutie s tebou prenikne do našich myšlienok, slov a postojov.",
                    "Pane Ježišu,<br>" +
                            "prijmi naše modlitby,<br>" +
                            "zmiluj sa nad nami,<br>" +
                            "daruj nám zdravie tela i duše<br>" +
                            "a zmier nás so sebou i s našimi bratmi a sestrami,<br>" +
                            "aby sme sa stali živým znamením tvojej lásky.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"7", "C", "Bratia a sestry, Božím prikázaním je milovať blížneho, priateľa i nepriateľa. To je znak kresťanskej lásky. Pán Ježiš nás učí, akým spôsobom máme prejavovať takúto lásku. Preto ho vrúcne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, posilňuj nás v láske.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, pomáhaj členom Cirkvi odpúšťať aj najväčším nepriateľom, a tak zjavovať svetu tvoje milosrdenstvo.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, daj, nech národy sveta dávajú prednosť vzájomnému dialógu pred ozbrojenými konfliktmi.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, pomôž tým, ktorí nespravodlivo trpia, aby v kresťanoch našli svojich ochrancov a pomocníkov.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, odpusť všetkým, ktorí nám v živote ublížili, a zbav nás nelásky a pocitu krivdy.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, nedovoľ, aby pomsta a násilie našli miesto v našich srdciach.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane Ježišu, priveď k sebe našich zomrelých <font color='#B71C1C'>(M.)</font> a daj nám milosť raz sa s nimi stretnúť.",
                    "Ježišu, ty si Boh milosrdný a milostivý;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme sa milosrdenstvom<br>" +
                            "preukázaným našim bratom a sestrám<br>" +
                            "podobali tebe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"7", "1", "Bratia a sestry, Pán nás zhromaždil na dnešnom eucharistickom slávení, aby sme mu vzdávali vďaky za dar viery. Preto spoločne volajme:",
                    "<font color='#B71C1C'>(</font>Pane, posilni našu vieru.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za všetkých kresťanov, aby v žiadnej životnej ťažkosti nestrácali nádej.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za trpiacich ľudí, aby sa nikdy necítili opustení vo svojom úsilí niesť každý deň svoj kríž.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za ľudí, ktorí majú strach z utrpenia, aby nachádzali silu pripodobniť sa trpiacemu Kristovi.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za seba samých, aby sme napriek všetkým životným ťažkostiam verne stáli pri Ježišovi.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za zomrelých <font color='#B71C1C'>(M.)</font>, ktorí zakončili svoju životnú púť, aby dostali odmenu v nebeskom domove.",
                    "Pane Ježišu,<br>" +
                            "vierou odpovedáme na tvoju lásku k nám,<br>" +
                            "ale niekedy nás premôže nedôvera a pochybnosť;<br>" +
                            "zľutuj sa nad nami,<br>" +
                            "pomôž našej slabej viere<br>" +
                            "a vo svojej nesmiernej láske vypočuj naše prosby.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"7", "2", "Bratia a sestry, s otvoreným srdcom prijmime Pána Ježiša, ktorého nám poslal nebeský Otec, aby nás spasil, a s dôverou sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme o milosti a duchovné dary potrebné pre službu nášho pápeža <font color='#B71C1C'>M.</font><br>" +
                            "<font color='#B71C1C'>2.</font> Prosme o silu pre biskupov, kňazov a diakonov, aby ochotne uskutočňovali slová Písma: Kto chce byť prvý, nech je služobníkom všetkých.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme o ducha pokory pre tých, ktorí majú politickú moc vo svete.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme o ochranu pred pohoršením a zneužívaním detí, ktoré Pán Ježiš tak miloval.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme o otvorené srdce na prijatie Pánových darov pre všetkých členov nášho <font color='#B71C1C'>(</font>farského<font color='#B71C1C'>)</font> spoločenstva.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme o večné šťastie pre zosnulých <font color='#B71C1C'>(M.)</font>, ktorých si Pán povolal z tohto sveta k sebe.",
                    "Pane Ježišu,<br>" +
                            "s dôverou ťa prosíme,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a osvieť našu myseľ,<br>" +
                            "aby sme spoznali, čo znamená skutočná pokora,<br>" +
                            "a tak úprimne plnili Božiu vôľu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"7", "3", "Bratia a sestry, všetci sa zjednocujeme v túžbe byť verní nášmu Pánovi. Preto ho prosme, aby nás vždy viedol k sebe.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby nás Cirkev učila dokonalosti vo viere a viedla k úprimnej vernosti Kristovi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby ľudia dobrej vôle, ktorí nemajú plné spoločenstvo s Katolíckou cirkvou, našli v nej plnosť prostriedkov spásy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby sme mali v úcte aj iné kresťanské spoločenstvá a spolu s nimi napĺňali Kristovu túžbu po jednote, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme sa svojím konaním nikdy neodlúčili od Krista, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zosnulí <font color='#B71C1C'>(M.)</font> dosiahli radosť večného života v spoločenstve s naším nebeským Otcom, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "len v tebe môžeme nájsť pravú jednotu;<br>" +
                            "prosíme ťa, vyslyš naše prosby<br>" +
                            "a obdaruj nás všetkých<br>" +
                            "vzájomnou láskou a milosrdenstvom.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"7", "4", "Bratia a sestry, nie vždy dokážeme naplno prežívať svoju vieru a niekedy v nás zvíťazia aj zlé sklony alebo podľahneme pokušeniam. Preniknutí bolesťou z našich slabostí s pokorou prosme nášho nebeského Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, ktorá je obdarená mocou zmierovať hriešnikov s Bohom, aby v hojnej miere udeľovala milosť odpustenia.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za tých, ktorí svojím životom dávajú pohoršenia a oslabujú vieru iných, aby si uvedomili svoje chyby a vrátili sa k milosrdnému Otcovi.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za hriešnikov, ktorí zotrvávajú v hriechu, aby mali odvahu vzoprieť sa zlu a nastúpiť na cestu pokánia.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za nás tu prítomných, aby sme verne plnili požiadavky evanjelia, a tak sa stávali soľou tejto zeme.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby ich Boh naplnil svojou láskou v blaženej večnosti.",
                    "Bože Otče,<br>" +
                            "vypočuj naše prosby,<br>" +
                            "daj nám silu zachovávať tvoje prikázania<br>" +
                            "a vyhýbať sa všetkému,<br>" +
                            "čo nie je v súlade s radostnou zvesťou evanjelia.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"7", "5", "Bratia a sestry, s ochotným srdcom prijímajme náuku Ježiša Krista o manželstve, jedinečnom zväzku muža a ženy, a prosme nášho nebeského Otca, aby milostivo požehnával všetky kresťanské rodiny.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, požehnaj naše rodiny.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme Pána, aby veriaci, ktorí tvoria Cirkev, s odvahou chránili sviatosť manželstva podľa Božieho zámeru.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme Pána, aby štátne zákony neznevažovali hodnotu manželského spolužitia muža a ženy, ale vytvárali vhodné podmienky na dôstojný život rodín.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme Pána, aby manželia napriek všetkým ťažkostiam a ľudským zlyhaniam zachovávali vernosť a jednotu vzájomného zväzku.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme Pána za rozvedených manželov, aby nezabúdali, že nový civilný zväzok je ťažkým previnením proti nerozlučiteľnosti manželstva.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme Pána za seba samých, aby sme neposudzovali tých, ktorým stroskotalo manželstvo, ale pomáhali im modlitbou a skutkami lásky.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme Pána, aby príklad zomrelých manželov, ktorí zachovávali vernosť a lásku na tejto zemi, posilňoval všetky rodiny vo vzájomnej láske.",
                    "Bože, láskavo vypočuj naše prosby<br>" +
                            "a daj nám silu<br>" +
                            "verne zachovávať tvoje prikázania<br>" +
                            "a trpezlivo znášať všetky ťažkosti nášho života.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"7", "6", "Bratia a sestry, spolu s ľuďmi pokornej, ale silnej viery pristúpme k Pánovi Ježišovi a v jeho mene prednesme Bohu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Cirkev, aby bola vždy pravdivá v učení a pokorná v pohľade na seba.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za deti na celom svete, aby našli ochrancov pred všetkým, čo im škodí na tele alebo na duši.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za tých, ktorí pre svoje veľké vzdelanie podliehajú pýche, aby v múdrosti našli aj hlbokú pokoru srdca.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za nás samých, aby sme boli otvorení pre veľkú milosť lásky k Bohu a k jeho kráľovstvu.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za našich zosnulých <font color='#B71C1C'>(M.)</font>, ktorí nás predišli do večnosti, aby dosiahli večný pokoj v nebi.",
                    "Bože Otče, ty chceš,<br>" +
                            "aby sme sa utiekali k tebe s pokornou dôverou;<br>" +
                            "prijmi našu dnešnú modlitbu<br>" +
                            "a daj nám čistú a pevnú vieru,<br>" +
                            "ktorou sa každým dňom približujeme k tebe.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"8", "A", "Bratia a sestry, Božie slovo je svetlom na ceste nášho života a nebeský Otec je naším útočiskom. Preto sa s dôverou modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby kňazi boli spoľahlivými Kristovými služobníkmi a vernými správcami jeho tajomstiev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby ľudia pre hmotné záujmy nezabúdali na duchovné hodnoty, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby neboli na svete matky, ktoré by neprijali svoje dieťa, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme zanechali také záujmy, ktoré sú v rozpore s Božími plánmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zosnulí <font color='#B71C1C'>(M.)</font>, na ktorých si teraz spomíname, dosiahli večnú spásu, prosme Pána.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a daj, aby sme žili ako tvoje deti,<br>" +
                            "ktoré všetku svoju dôveru vkladajú do teba.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"8", "B", "Bratia a sestry, kajúcimi skutkami sa pripájame k Spasiteľovej obete a hlásime sa k jeho krížu. Prosme Pána, aby sme pochopili, čo je pravé pokánie.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, opatruj a chráň Cirkev ako svoju nevestu a naplň všetkých kresťanov radosťou, že patria tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Nauč všetkých ľudí, aby sa vedeli zriekať časti svojich príjmov v prospech biednych, a tak prispievali k zmierneniu hladu vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Priveď príliš sebavedomých ľudí k poznaniu, že všetky dobré schopnosti a vlohy sú tvojím nezaslúženým darom.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj, aby unavení a vyčerpaní ľudia hľadali odpočinok a osvieženie v tvojom slove a vo sviatostiach.<br>" +
                            "<font color='#B71C1C'>5.</font> Povzbuď nás, aby sme sa ochotne zúčastňovali na kajúcnych pobožnostiach, a tak prežívali tvoje milosrdenstvo.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj nám odvahu zriekať sa vecí,<br>" +
                            "ktoré bránia rozvoju nášho duchovného života.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"8", "C", "Bratia a sestry, z plnosti srdca hovoria ústa. Preto aj my z úprimného srdca prednesme prosby Pánovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých kresťanov: aby svojím životom dokazovali každému, že Cirkev je spoločenstvom pravdy a lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za tých, ktorí spravujú národy: aby svoj ľud viedli cestou spravodlivosti a pokoja, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých, ktorí stratili dôveru v Boha i v ľudí: aby ich evanjeliové posolstvo vyviedlo z ťažkého položenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za všetkých ľudí: aby sa upevnili v istote, že žiadne úsilie o dobro nie je márne, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu zhromaždených: aby sme si uvedomovali svoju hriešnosť a nezveličovali chyby iných, prosme Pána.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a pomáhaj nám,<br>" +
                            "aby sme víťazili nad zlom<br>" +
                            "a prinášali ovocie dobrých skutkov.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"8", "1", "Bratia a sestry, spojení v Duchu Svätom, ktorý prichádza na pomoc našej slabosti, prednesme Pánovi naše vrúcne prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za trpezlivosť pre pastierov Cirkvi, aby mali starosť o každého človeka a vytrvalo hľadali tých, ktorí sa stratili.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za mladých ľudí, aby si zachovali vieru v srdciach a statočnosť vo svojich skutkoch.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za znechutených a bezradných, aby Duch Svätý roznietil v ich srdciach novú nádej.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za tých, ktorí žijú v hriechoch, aby pravým pokáním dosiahli spoločenstvo s tebou.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás všetkých, aby sme boli ochotní zriekať sa nadbytočných vecí v prospech núdznych.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby dosiahli radosť večného života v spoločenstve svätých.",
                    "Pane Ježišu,<br>" +
                            "ty nás vedieš k slobode od všetkého,<br>" +
                            "čo zotročuje človeka;<br>" +
                            "vypočuj prosby svojich veriacich<br>" +
                            "a posilňuj všetkých,<br>" +
                            "ktorí úprimne hľadajú tvoju vôľu<br>" +
                            "a nasledujú ťa.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"8", "2", "Bratia a sestry, Boh sa vo svojej prozreteľnosti o nás neustále stará. Vyjadrime mu svoju dôveru a spoločne volajme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za všetkých služobníkov Cirkvi, aby v sile Ducha Svätého ohlasovali Božie slovo a strážili dar viery.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za tých, ktorí pripravujú zákony a spravujú štát, aby vnímali problémy a ťažkosti života svojich spoluobčanov a múdrymi rozhodnutiami ich zmierňovali.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za vyučujúcich na školách a univerzitách, aby k svojmu povolaniu pristupovali svedomito a zodpovedne.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za ľudí, ktorí sú diskriminovaní pre svoj pôvod, farbu pleti alebo vierovyznanie, aby sa im v ľudskej spoločnosti neupierala sloboda a ich práva.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za nás všetkých, aby sme mali lásku, ktorá všetko znesie a pretrpí, a tak dokázali milovať ľudí, s ktorými žijeme.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme za zosnulých členov našich rodín, aby im odpustenie prameniace z Kristovho kríža otvorilo nebo a získali večnú slávu.",
                    "Všemohúci Bože,<br>" +
                            "ty si prisľúbil večný život tým,<br>" +
                            "ktorí ťa budú nasledovať;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj nám silu vytrvať na ceste evanjelia.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"8", "3", "Bratia a sestry, skôr ako sa posilníme pri oltári sviatostným telom nášho Pána, obráťme sa na neho a prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj, aby kresťania rôznych vierovyznaní boli voči sebe otvorení, prístupní a pripravení na vzájomnú pomoc.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, daj, aby sa vynálezy civilizácie nikdy neobrátili proti pokojnému životu a šťastiu človeka.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, daj, aby lekári pristupovali k chorým podľa príkladu Krista, ktorý uzdravoval so súcitom a s láskou.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, daj, aby skúsenosť kríža priblížila trpiacich k tajomstvu tvojho utrpenia a naplnila ich veľkonočnou vierou vo víťazstvo života.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, daj, aby sme vedeli ochotne a radostne poslúžiť druhým a tešili sa z pokoja, ktorý pramení vo viere.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane, daj, aby sa naši zosnulí <font color='#B71C1C'>(M.)</font> mohli pozerať na teba z tváre do tváre a prihovárať sa za nás.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a posilni našu dôveru,<br>" +
                            "že nám vždy dávaš to, čo potrebujeme,<br>" +
                            "skôr ako by sme ťa o to prosili.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"8", "4", "Bratia a sestry, spolu s nevidiacim Bartimejom volajme k Ježišovi a s vrúcnosťou ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, Syn Dávidov, zmiluj sa nad nami.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Cirkev, aby bola svetlom pre všetky národy a účinne ohlasovala radostnú zvesť evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za svet, aby bol oslobodený od hrozieb vojny a terorizmu a aby celé ľudstvo budovalo civilizáciu lásky.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za mladých ľudí, aby rozpoznali hlas povolania na zasvätený život a ochotne naň odpovedali.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za učiteľov a katechétov, aby čo najlepšie vysvetľovali pravdy o živote a večných hodnotách, a tak napĺňali svoje povolanie.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za všetkých nevidiacich, aby nestrácali chuť do života, ale hľadali posilu v evanjeliu a v prijímaní sviatostí.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby uvideli Zmŕtvychvstalého a tešili sa z jeho večnej slávy.<br>" +
                            "Ježišu, zmiluj sa nad nami,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme ťa nikdy neranili v našich blížnych.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"8", "5", "Bratia a sestry, zhromaždení v dome modlitby, ktorý je domom nášho Otca, prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj všetkým, ktorí patria do Cirkvi, živú vieru, milujúce srdce a čisté svedomie, aby rástli v láske k Bohu a blížnym.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, daj medzinárodným organizáciám citlivosť na základné potreby obyvateľov chudobných krajín, aby sa spravodlivo rozdeľovali všetky materiálne dobrá.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, daj opusteným a starým ľuďom starostlivú opateru, aby im samota a starosti o zajtrajšok neodoberali radosť zo života.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, daj sa poznať ľuďom zotročeným hriechmi, aby vo sviatosti zmierenia odstránili svoje zlozvyky a dosiahli skutočnú slobodu.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, naplň naše srdcia láskou a milosrdenstvom, aby sme dokázali zo srdca odpustiť, ak by mal niekto niečo proti druhému.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane, otvor bránu nebeského domova našim zomrelým <font color='#B71C1C'>(M.)</font>, aby mali účasť na sláve vzkriesenia.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše modlitby<br>" +
                            "a svojou milosťou pomáhaj všetkým ľuďom,<br>" +
                            "za ktorých tvoj Syn Ježiš Kristus obetoval svoj život.<br>" +
                            "On s tebou žije a kraľuje na veky vekov."},
            {"8", "6", "Bratia a sestry, prosme o pomoc nebeského Otca, Stvoriteľa sveta, ktorý všetko, čo existuje, udržiava a zahŕňa svojou starostlivosťou.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za spravodlivosť pre celý svet, nech všade víťazí láska nad nenávisťou a túžba po pomste prenechá miesto odpusteniu.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za Cirkev na Slovensku, nech sa teší slobode, duchovnému rozvoju a zúčastňuje sa na raste Božieho kráľovstva v ľudských srdciach.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za vyznávačov Mojžišovho zákona, nech ich Pán požehná a otvorí im srdcia pre evanjelium.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za chorých a tých, ktorí sú odkázaní na lôžka v nemocniciach, nech sa im dostane primeranej lekárskej starostlivosti a ľudského prijatia.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás všetkých, nech Pán prijme náš život ako milú obetu.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za našich zosnulých <font color='#B71C1C'>(M.)</font>, nech ich Ježiš Kristus, víťaz nad smrťou, zbaví tieňov smrti a privedie do večného života.",
                    "Bože, vypočuj naše prosby<br>" +
                            "a daj, nech tvoja milosť zostúpi na všetkých,<br>" +
                            "za ktorých sa modlíme,<br>" +
                            "aby mohli prinášať bohaté ovocie<br>" +
                            "duchovného života na tvoju slávu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"9", "A", "Bratia a sestry, Pán Ježiš nám prikazuje nielen počúvať jeho slová, ale ich aj uskutočňovať. Prosme ho teda, aby nás v modlitbe i práci predchádzala a sprevádzala jeho milosť.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby si veriaci obľúbili Pánove slová a stáli na pevnom základe viery, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby zodpovední predstavitelia národov verne zachovávali vzájomné dohody o pokoji a spolupráci, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby rodiny využívali sviatočné dni na duchovné osvieženie a posilnenie rodinnej vzájomnosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby si naši rodičia našli čas na náboženskú výchovu svojich detí, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zosnulí <font color='#B71C1C'>(M.)</font>, za ktorých sa modlíme, dosiahli večnú spásu, prosme Pána.",
                    "Pane Ježišu, vypočuj nás, svoj ľud,<br>" +
                            "zhromaždený v tomto chráme,<br>" +
                            "a posilňuj v nás vedomie,<br>" +
                            "že svoju vieru máme dokazovať dobrými skutkami.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"9", "B", "Bratia a sestry, kresťan v Kristovi dosahuje pravú slobodu ducha a v srdci prežíva pokoj Božieho dieťaťa. V tejto dôvere prosme nášho Pána.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby sa kresťania každú nedeľu s radosťou zúčastňovali na eucharistickej obete a doma upevňovali vzájomnú svornosť a rodinné putá, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby správcovia verejných vecí ochotne pracovali na spoločnom dobre všetkých občanov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby všetci ľudia pochopili, že bez Božieho požehnania sú márne všetky ich námahy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby telesne a duševne hendikepovaní našli súcit a pomoc u svojich zdravých bratov a sestier, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme pod falošnými zámienkami nezanedbávali službu chorým v našich rodinách a domovoch, prosme Pána.",
                    "Pane Ježišu, prosíme ťa, vyslyš naše prosby<br>" +
                            "a daj, aby sme nedeľu vždy prežívali<br>" +
                            "ako deň oslavy veľkonočného tajomstva<br>" +
                            "tvojho zmŕtvychvstania.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"9", "C", "Bratia a sestry, nie sme hodní, aby Ježiš vošiel pod našu strechu, ale oživení čnosťou nádeje volajme k nemu.",
                    "<font color='#B71C1C'>(</font>Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby biskupi, kňazi a všetci veriaci mali rovnako veľkú vieru ako stotník z evanjelia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby Cirkev s nadšením ohlasovala ľuďom radostnú zvesť o Božom milosrdenstve, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby vojaci vykonávali svoju službu v zhode s Božím zákonom, chránili mier a ľudské životy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby chorí pevne verili, že Kristus má moc uzdraviť ich z každej choroby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby nedeľa bola pre každého z nás dňom zhromaždenia farskej rodiny pri počúvaní Božieho slova a pri eucharistickej hostine, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "darca viery a zdravia duše i tela,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pomôž nám dúfať v teba<br>" +
                            "v každej chvíli nášho života.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"9", "1", "Bratia a sestry, s vierou, že Kristus je základným kameňom Cirkvi, zjednoťme svoje srdcia v spoločnej modlitbe a prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, vinicu nášho Otca, aby jej nikdy nechýbali svätí a láskaví biskupi a kňazi.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za robotníkov a pracovníkov v rôznych profesiách a povolaniach, aby vždy dodržiavali zásady kresťanského a morálneho správania.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za ľahostajných ľudí a tých, ktorí pohŕdajú Kristom, aby si uvedomili nesprávnosť svojho počínania a čím skôr našli cestu k Cirkvi.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za slobodu pre nás samých, aby sme sa chránili každého hriechu a neuhášali v sebe Božie svetlo.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za našich zomrelých <font color='#B71C1C'>(M.)</font>, ktorí odišli z tohto sveta, aby mohli vidieť Božiu tvár.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby,<br>" +
                            "obdaruj nás duchom radostnej práce v Cirkvi – tvojej vinici<br>" +
                            "a chráň nás pred hriechom nevernosti a zrady.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"9", "2", "Bratia a sestry, Bohu patrí celý náš život so všetkým, čo sme a čo máme. S veľkou dôverou srdca prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev v našej vlasti, aby s veľkou múdrosťou, rozvážnosťou a vernosťou hlásala a hájila pravdy evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za charitatívne povolania, aby sa ich služba Bohu a blížnym stala ozdobou celej Cirkvi.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých, čo pomáhajú núdznym, aby ich srdcia boli plné milosrdenstva a trpezlivosti.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za nás všetkých, aby sme sa z lásky k bratom a sestrám ochotne zriekali svojich nárokov a požiadaviek.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za zosnulých <font color='#B71C1C'>(M.)</font>, aby žili v spoločenstve oslávenej Cirkvi v nebi.",
                    "Všemohúci Bože,<br>" +
                            "ty vieš, ako často sme závislí od ľudí a vecí;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj nám milosť, aby sme nikým nepohŕdali,<br>" +
                            "ale zachovali si opravdivú slobodu srdca.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"9", "3", "Bratia a sestry, Boh nie je Bohom mŕtvych, ale živých. So živou vierou, nádejou a láskou mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Svätého Otca <font color='#B71C1C'>M.</font>: aby mal silu dávať dobrý príklad služby Cirkvi a všetkým ľuďom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za kresťanov na Slovensku: aby očistili a posilnili svoju vieru a vnášali do verejného života pokoj a porozumenie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za tých, ktorí spravujú národy: aby ich Boh osvietil a dal im milosť poznania, že majú byť služobníkmi dobra a pravdy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás tu prítomných: aby nám Boh dal odvahu i vytrvalosť v duchovnom napredovaní, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za tých, ktorí odišli z tohto sveta <font color='#B71C1C'>(</font>i za našich zomrelých <font color='#B71C1C'>M.)</font>: aby mohli spolu s anjelmi hľadieť na Božiu tvár, prosme Pána.",
                    "Pane a Bože náš,<br>" +
                            "ty jediný si milosrdný a spravodlivý vládca;<br>" +
                            "vyslyš naše prosby,<br>" +
                            "pomôž nám dôverovať tvojej prozreteľnosti<br>" +
                            "a hľadať večné dobrá.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"9", "4", "Bratia a sestry, Pán Ježiš nás poučil, ktoré prikázanie je najväčšie. Spoločne prosme, aby sme ho napĺňali vo svojom živote.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Božiu Cirkev, aby verná evanjeliu neustále hlásala prikázanie lásky k Bohu a blížnemu.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za tých, ktorí majú problém zachovávať príkaz lásky, aby ich Boh obdaril milosťou a opäť priviedol na cestu lásky.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za ľudí, s ktorými nemáme rovnaké názory, aby nás vykupiteľská moc Spasiteľa naplnila opravdivou dobrotou srdca a pomohla nám oslobodiť sa od predsudkov.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za nás tu prítomných, aby nám Pán Ježiš pomohol zamilovať si posolstvo jeho lásky.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za zomrelých <font color='#B71C1C'>(M.)</font>, ktorí už zakončili svoju pozemskú púť, aby im Boh odpustil hriechy a prijal ich do svojej radosti.",
                    "Ježišu, náš Vykupiteľ,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a otvor naše srdcia pre úprimnú lásku k blížnym.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"9", "5", "Bratia a sestry, s úprimnou vierou vyznávajme božstvo Ježiša Krista, nášho Vykupiteľa, a s dôverou k nemu sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby modlitbou a skutkami vydávala dobré svedectvo o Božom Synovi.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za nepriateľov Krista, aby ich premohla milosrdná dobrota Boha a viedla ich k obráteniu.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za vyvolený židovský národ, aby prijal Ježiša z Nazareta ako očakávaného Mesiáša.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za nás tu zhromaždených, aby účasť na slávení Eucharistie posilnila našu vieru v božstvo Syna človeka.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za zomrelých <font color='#B71C1C'>(M.)</font>, aby naveky mohli hľadieť na Vykupiteľov majestát.",
                    "Ježišu, Syn Dávidov,<br>" +
                            "prosíme ťa, vyslyš naše prosby;<br>" +
                            "požehnaj naše úsilie o dobro,<br>" +
                            "aby sme zjednotení s tebou<br>" +
                            "svedčili o tvojej láske pred ľuďmi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"9", "6", "Bratia a sestry, Boh vidí každému do srdca a pozná aj jeho najskrytejšie túžby. S dôverou mu prednesme svoje pokorné prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za celú Cirkev, aby bola naplnená duchom štedrosti voči všetkým biednym.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za bohaté štáty, aby dokázali pomáhať chudobným krajinám a vedeli sa deliť o materiálne dobrá nielen zo svojho nadbytku.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za obyvateľov oblastí postihnutých prírodnými katastrofami, aby neupadli do zúfalstva, ale pocítili potrebnú pomoc bratov a sestier.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za tých, ktorí sa aj vo svojom nedostatku vedia podeliť o hmotné dobrá, aby raz dosiahli večnú odmenu v nebi.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za večný pokoj pre zomrelých ktorí v živote štedro pomáhali druhým <font color='#B71C1C'>(</font>a boli dobrodincami tohto chrámu<font color='#B71C1C'>)</font>.",
                    "Všemohúci Bože,<br>" +
                            "prosíme ťa, vyslyš naše prosby<br>" +
                            "a daj, nech je náuka tvojho Syna svetlom nášho života,<br>" +
                            "aby sme konaním dobra prišli k tebe.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "A", "Bratia a sestry, Pán Ježiš nás učí, že Bohu je vzácnejšie milosrdenstvo ako obeta. Obráťme sa na nebeského Otca a s pokorou sa k nemu modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Otec milosrdenstva, zmiluj sa nad nami.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby ochotne ohlasovala slovo spásy všetkým ľuďom.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za predstaviteľov národov, aby si uvedomovali, že majú byť ochrancami spravodlivosti a práva pre každého človeka.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za našu farnosť, aby medzi nami neboli zlomyseľní ľudia, ktorí by ničili šľachetné snahy iných.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za seba samých, aby sme neopovrhovali hriešnikmi, ale láskou a modlitbami ich privádzali k čnostnému životu.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby mohli vidieť Boha z tváre do tváre.",
                    "Bože Otče, prosíme ťa,<br>" +
                            "vyslyš naše prosby a pomáhaj nám,<br>" +
                            "aby sme nikdy neochabli vo viere,<br>" +
                            "ktorá je nám zdrojom<br>" +
                            "radostného a činorodého života.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "B", "Bratia a sestry, pre klamstvo zlého ducha človek stratil Božiu milosť a dostal sa do otroctva hriechu a smrti. Ale Boh sa zmiloval nad ľudstvom a poslal mu sľúbeného Vykupiteľa. Preto sa ako vykúpení s radosťou a s dôverou modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby kňazi Kristovej Cirkvi svojím životom a modlitbami odrážali útoky zlého ducha, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby tí, ktorí vedú národy, konali pod vplyvom Ducha Svätého, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby ľahostajní vo viere dostali spasiteľnú bázeň pred hriechmi proti Duchu Svätému, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sa v našich rodinách ujal nábožný zvyk pravidelne a spoločne sa modliť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme pod ochranou Panny Márie premáhali zvody diabla a úplne sa zriekli jeho skutkov, prosme Pána.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a stále ostávaj s nami,<br>" +
                            "aby nás tvoja milosť<br>" +
                            "chránila pred úkladmi zlého ducha<br>" +
                            "a zaistila nám slávne víťazstvo s tebou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "C", "Bratia a sestry, vzkriesenie naimského mládenca posilňuje našu vieru v božstvo Ježiša Krista a zároveň nás povzbudzuje k spoločnej modlitbe. Preto s dôverou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, pozri na slzy a modlitby Cirkvi, ktorá prosí za oživenie kresťanov žijúcich v ťažkých hriechoch.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, nedovoľ, aby svet podliehal hriechu nevery a sebectva.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, pošli misionárov aj do najvzdialenejších krajín, aby sa všetkým stala známou tvoja radostná zvesť.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, chráň mladíkov a devy pred mravným úpadkom a oživuj ich ideálmi dobra, pravdy a krásy.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, buď ochrancom vdov a zachovaj ich v kresťanskej nábožnosti a čistote.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane, zachovaj nás tu zhromaždených vo svojej milosti, aby nás hriech neodlúčil od teba.",
                    "Prosíme ťa, Pane,<br>" +
                            "milostivo vypočuj prosby svojho ľudu<br>" +
                            "a vo svojej štedrosti nám udeľ dary,<br>" +
                            "o ktoré ťa z tvojho vnuknutia prosíme.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "1", "Bratia a sestry, Boh sa vo svojej láske skláňa k ľuďom a ujíma sa každého srdca, ktoré po ňom túži. Zjednotení s Kristom sa modlime za seba i za všetkých bratov a sestry.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za chudobných v duchu, tichých a plačúcich, aby dosiahli nebeské kráľovstvo.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za lačných a smädných po spravodlivosti a za milosrdných, aby ich pokornú službu odmenil Boh svojím milosrdenstvom.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za ľudí čistého srdca, aby raz mohli vidieť Boha z tváre do tváre.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za tých, čo šíria pokoj, aby sa skutočne mohli stať Božími synmi.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za potupovaných a prenasledovaných pre spravodlivosť, aby ich tešila a povzbudzovala nádej na hojnú odmenu v nebi.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby spolu s anjelmi velebili Božiu dobrotu.",
                    "Bože, prijmi naše prosby,<br>" +
                            "naplň svojím požehnaním<br>" +
                            "všetkých dobrých a spravodlivých ľudí<br>" +
                            "a ak nateraz musia znášať utrpenie pre Krista,<br>" +
                            "ty sám im buď posilou uprostred prenasledovania.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "2", "Bratia a sestry, túžime nasledovať nášho nebeského Otca, od ktorého pochádza všetko dobro. Prosme ho s dôverou.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby kresťania pamätali, že najvážnejším záväzkom ich života je zjednotiť svoje skutky s Ježišovou náukou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby štátnici podporovali hodnoty rozvíjajúce kultúru života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby učitelia náboženstva a katechéti uprostred neveriacich a ľudí iných náboženských vierovyznaní dokázali v sebe udržať Božie svetlo, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby bol náš život svetlom dobrého príkladu pred ľuďmi na chválu Otca, ktorý je na nebesiach, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby zomrelí, ktorí už zakončili svoju pozemskú púť, obsiahli večné svetlo Božej tváre v nebi, prosme Pána.",
                    "Bože, žriedlo dokonalosti,<br>" +
                            "vyslyš naše prosby;<br>" +
                            "pomôž nám kráčať cestou života podľa tvojej svätej vôle<br>" +
                            "a prekonávať všetky ťažkosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "3", "Bratia a sestry, zhromaždili sme sa okolo Krista, ktorý je naším učiteľom. Prosme ho s dôverou.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby mal pápež <font color='#B71C1C'>M.</font> dostatok síl pre službu celej Cirkvi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby kresťania porozumeli hlbokým pravdám evanjelia, a tak naplnili zákon lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby sa vhodnými zákonmi garantovali práva Cirkvi v našej vlasti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme pomocou Božej milosti dokázali plniť práva a povinnosti vyplývajúce z Ježišovej náuky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby <font color='#B71C1C'>(</font>zomrelý <font color='#B71C1C'>M.</font> i<font color='#B71C1C'>)</font> všetci verní zosnulí mohli vidieť Boha v jeho sláve, prosme Pána.",
                    "Pane Ježišu, náš zákonodarca,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby tvoja náuka prenikla naše srdcia i mysle<br>" +
                            "a prebudila v nás vôľu plniť Božie prikázania<br>" +
                            "v duchu radostnej slobody.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"10", "4", "Bratia a sestry, skôr ako prinesieme svoj dar pred oltár, modlime sa k nášmu Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za nášho biskupa <font color='#B71C1C'>M.</font> i kňazov našej diecézy, nech Božia spravodlivosť naplní ich srdcia, aby verne plnili svoje poslanie.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za obete nenávisti, neprajnosti a prehnanej kritiky, nech odvážne vykročia za pozvaním Krista milovať aj nepriateľov.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za všetkých odsúdených väzňov, nech úprimná skrúšenosť a kajúcnosť srdca premení ich život.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za nás samých, nech sa náročné požiadavky evanjelia stanú súčasťou nášho každodenného zmýšľania a konania.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za <font color='#B71C1C'>(</font>zomrelého <font color='#B71C1C'>M.</font> i<font color='#B71C1C'>)</font> všetkých, ktorých Boh povolal do večnosti, nech dosiahnu pokoj v dome nášho Otca.",
                    "Otče, tvoja láska má veľké požiadavky;<br>" +
                            "zhliadni na naše prosby<br>" +
                            "a posilni našu vôľu,<br>" +
                            "aby sme bez ohľadu na vlastné výhody<br>" +
                            "s pohľadom na teba dokázali milovať všetkých ľudí.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "5", "Bratia a sestry, v spoločnej modlitbe prosme nášho Pána o silu i odvahu napĺňať požiadavky evanjelia.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby svojím pôsobením účinne zabraňovala spoločenskému a morálnemu rozkladu.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za deti a mládež <font color='#B71C1C'>(</font>našej farnosti<font color='#B71C1C'>)</font>, aby ich vplyv prostredia nepriviedol k morálnej skaze.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za rodičov, aby osobným príkladom viedli svoje deti k pravidelnej účasti na svätej omši.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za duchovnú silu odolávať pornografii v médiách.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa, aby nás Božia milosť vytrhla zo všetkej nezriadenosti a vášne.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za večný život pre <font color='#B71C1C'>(M.</font> i<font color='#B71C1C'>)</font> všetkých našich blízkych zomrelých.",
                    "Pane Ježišu,<br>" +
                            "ty si sľúbil ľuďom čistého srdca,<br>" +
                            "že budú vidieť Boha;<br>" +
                            "vyslyš naše prosby,<br>" +
                            "zľutuj sa nad nami<br>" +
                            "a obdaruj nás radosťou z čistého svedomia.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"10", "6", "Bratia a sestry, modlime sa, aby nás účasť na Kristovej obete posilnila vo viere a nádeji, že Boh naše prosby vyslyší.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby jasnou a zrozumiteľnou rečou oznamovala svetu pravdivé posolstvo spásy.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za kresťanov, ktorí často zbytočne prisahajú, aby takto neznevažovali Božie meno.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých veriacich, ktorí veľa rozprávajú a často sa dopúšťajú klamstva, aby premysleli a zvážili každé vypovedané slovo.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za nás samých, aby sme pravdu milovali z lásky k Bohu a pre spoločné dobro všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za zomrelých <font color='#B71C1C'>(M.)</font>, aby tí, ktorí usnuli v Kristovom pokoji, dosiahli večný život.",
                    "Pane,<br>" +
                            "tvoj kráľovský majestát<br>" +
                            "nám pomáha chrániť sa všetkého klamstva;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a nauč nás žiť podľa tvojej náuky.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"11", "A", "Bratia a sestry, evanjelium nás povzbudzuje, aby sme si uvedomili povolanie byť ohlasovateľmi radostnej zvesti. V ňom máme všetci podiel na Kristovom kňazstve. Preto sa s dôverou obráťme na nebeského Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, daj nám svätých kňazov.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daruj kňazom ducha svojej trpezlivej lásky, aby prinášali tomuto svetu radosť a pokoj.<br>" +
                            "<font color='#B71C1C'>2.</font> Chráň služobníkov oltára od pocitu bezmocnosti a neužitočnosti, aby pamätali, že ich najvýrečnejšou kázňou je osobný príklad.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, vzbudzuj v srdciach mladých ľudí túžbu zasvätiť sa v službe Bohu a blížnym, aby po celom svete zaznievali slová radostnej zvesti.<br>" +
                            "<font color='#B71C1C'>4.</font> Posilňuj nás v modlitbe, aby v nás a prostredníctvom nás rástlo v tomto svete kráľovstvo pokoja.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prijmi k sebe našich zomrelých biskupov a kňazov, aby mohli mať účasť na večnej liturgii v nebi.",
                    "Všemohúci Bože, Pán žatvy,<br>" +
                            "s dôverou sme ti predniesli svoje prosby;<br>" +
                            "prosíme ťa, vyslyš nás<br>" +
                            "a daruj svetu mnoho robotníkov na poli evanjelizácie.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "B", "Bratia a sestry, s dôverou prosme nášho nebeského Otca, aby v nás neustále rástlo Božie kráľovstvo, ktorého synmi a dcérami sme sa stali vo sviatosti krstu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, daj, aby sa Cirkev svojou vernosťou evanjeliu stávala čoraz lepším obrazom Božieho kráľovstva na zemi.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, daj, aby zákony vydané vládami krajín rešpektovali dôstojnosť všetkých ľudí vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, daj, aby zrno viery zasiate v ľuďoch rástlo a rozvíjalo sa vďaka pomoci svedomitých kresťanov.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, daj, aby v našich rodinách nikdy nechýbal pokrm pre telo i pre dušu.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, daj, aby si mladí ľudia chránili čistotu srdca a vždy túžili po pravých hodnotách.<br>" +
                            "<font color='#B71C1C'>6.</font> Otče, daj, aby sme v ťažkostiach života nachádzali radosť z účasti na Božom kráľovstve.",
                    "Všemohúci Bože,<br>" +
                            "ty zasievaš do našich sŕdc zrno života;<br>" +
                            "vypočuj našu pokornú modlitbu<br>" +
                            "a udeľ svoje dary všetkým,<br>" +
                            "za ktorých sa prihovárame,<br>" +
                            "aby každý vzrastal v tvojej láske a milosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "C", "Bratia a sestry, žijeme vo viere v Božieho Syna, ktorý nás miluje a seba samého vydal za nás. Preto s dôverou prednesme Bohu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev: aby všetci, ktorí túžia po Bohu a jeho láske, prostredníctvom služby duchovných pastierov dosiahli odpustenie hriechov a sviatostnú milosť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za novokňazov: aby mali neustálu radosť z toho, že môžu byť nositeľmi Božej lásky a milosrdenstva vo svete, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za ľudí, ktorí vedú pohoršlivý život: aby si uvedomili svoj hriech a pokáním napravili škody spôsobené zlým príkladom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za žiakov a študentov: aby naplno využili dni voľna a dokázali sa vždy zorientovať v tom, čo je dobré a čo zlé, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: aby sme sa chránili ducha posudzovania a usilovali sa o skutočné spolucítenie so všetkými, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "prijmi naše pokorné prosby<br>" +
                            "a pomáhaj nám zmieriť sa so všetkými,<br>" +
                            "aby sme sa stali živým znamením tvojej lásky.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "1", "Bratia a sestry, zhromaždení okolo Pánovho oltára prednesme milosrdnému Bohu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Príď kráľovstvo tvoje, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za všetkých kresťanov, aby boli verní Kristovej náuke a neodplácali sa zlým za zlé.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za bohaté spoločenstvá, aby boli vnímavé na potreby chudobných a šľachetne im pomáhali.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za chorých a opustených, aby sa cítili plnohodnotnými členmi ľudskej spoločnosti.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za všetkých, ktorí pomáhajú svojim blížnym, aby v Kristovi nachádzali silu konať dobro.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás samých, aby sme si dokázali navzájom preukazovať lásku, dobrotu a odpustenie.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby im Boh odpustil ich nevernosti a priviedol ich do spoločenstva svätých.",
                    "Všemohúci Bože,<br>" +
                            "ty sa o nás neustále staráš;<br>" +
                            "prosíme ťa,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby nás nič neodlúčilo od teba.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "2", "Bratia a sestry, Kristus nás pozýva nasledovať dokonalosť nebeského Otca. Preto sa s dôverou modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za celú Cirkev: aby vždy a všade chránila dôstojnosť ľudskej osoby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za biskupov, kňazov a diakonov: aby boli vždy verní svojmu povolaniu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za kresťanov: aby pre súčasný svet boli svedkami skutočného cieľa a zmyslu ľudského života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za náš národ: aby vernosťou Božiemu zákonu preukazoval vďačnosť za slobodu a prijaté Božie milosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás samých: aby sme mali silu vydávať svedectvo Kristovej lásky každému človekovi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Za našich zomrelých <font color='#B71C1C'>(M.)</font>: aby za nezištnú lásku preukázanú počas pozemského života dosiahli večný pokoj v nebi, prosme Pána.",
                    "Bože, ty vieš, že bez teba nemôžeme nič urobiť;<br>" +
                            "vyslyš naše prosby a posilňuj nás svojou milosťou,<br>" +
                            "aby sme ti mohli ešte lepšie slúžiť v našich blížnych.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "3", "Bratia a sestry, modlime sa k nášmu Otcovi, ktorý vidí aj v skrytosti.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za nášho pápeža <font color='#B71C1C'>M.</font>, aby jeho úsilie o pokoj vo svete našlo prijatie v srdciach všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za všetkých kresťanov, aby svojím životom prinášali ovocie dobrých skutkov.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za bohatých ľudí, aby sa dokázali deliť o svoje dobrá a ochotne preukazovali pomoc chorým a chudobným.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za študentov a mladých ľudí, aby zodpovedne využili čas prípravy na svoje životné povolanie.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za chorých, trpiacich a opustených, aby chápali zmysel utrpenia a posilnení Kristovou láskou všetko znášali s trpezlivosťou a dôverou.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby za lásku a obetu preukázanú v tomto živote dosiahli večnú odmenu v nebi.",
                    "Nekonečný Bože,<br>" +
                            "ty vidíš do hĺbky ľudského srdca;<br>" +
                            "prosíme ťa, vyslyš naše prosby<br>" +
                            "a chráň nás pred povrchnosťou a plytkosťou,<br>" +
                            "aby sme mohli poznať nesmierne bohatstvo tvojej dobroty.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "4", "Bratia a sestry, Pán Ježiš nás poučil, ako sa treba modliť, preto sa s dôverou obráťme na nášho Otca, ktorý je v nebi, a spoločne volajme:",
                    "<font color='#B71C1C'>(</font>Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby kresťania svojím životom oslavovali sväté Božie meno, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby ľudia všetkých národov túžili patriť do Božieho kráľovstva, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby na našich stoloch nikdy nechýbal každodenný chlieb, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sa hnevníci medzi sebou zmierili a žili vo vzájomnom porozumení, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme sa chránili pokušení a boli oslobodení od každého zla, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Aby naši zomrelí <font color='#B71C1C'>(M.)</font> dosiahli Božie milosrdenstvo, prosme Pána.",
                    "Otče náš,<br>" +
                            "vyslyš pokorné modlitby svojich veriacich<br>" +
                            "a daj nám to, čo je najlepšie pre naše dobro a spásu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "5", "Bratia a sestry, horlivo hľadajme Božie kráľovstvo a modlime sa k nášmu nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, ty si poslal na svet svojho Syna, aby hlásal radostnú zvesť vykúpenia; posilňuj pápeža a celý zbor biskupov v ich práci na poli evanjelizácie.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, ty si svojho Syna ustanovil za Kráľa kráľov; daruj správcom národov ducha múdrosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, ty si nás povolal do života; odmeň našich rodičov a vychovávateľov za ich lásku a starostlivosť.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, ty sa o nás neustále staráš; nauč nás zhromažďovať si poklady v nebi.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, ty nás povolávaš do večnosti; daruj našim zomrelým <font color='#B71C1C'>(M.)</font> život, ktorý bude v tvojej prítomnosti trvať bez konca.",
                    "Všemohúci Bože,<br>" +
                            "ty si najväčším bohatstvom svojich veriacich;<br>" +
                            "vyslyš naše prosby,<br>" +
                            "osloboď nás od prílišných starostí o materiálne dobrá<br>" +
                            "a pomôž nám žiť v radostnom očakávaní stretnutia s tebou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "6", "Bratia a sestry, dôverujme Božej prozreteľnosti a prosme nášho nebeského Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev: aby z jej pôsobenia bolo svetu zrejmé, že Božie kráľovstvo je medzi nami, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za kňazov: aby napriek svojim slabostiam pociťovali silu Božej milosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých ľudí dobrej vôle: aby boli ochotní podať pomocnú ruku chudobným a trpiacim, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: aby sme neboli zbytočne ustarostení o svoju budúcnosť, ale aby sme vždy hľadali najprv Božie kráľovstvo, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zomierajúcich: aby mohli zakúsiť moc Božej milosrdnej lásky, prosme Pána.",
                    "Nebeský Otče,<br>" +
                            "ty sa staráš o všetko stvorenie<br>" +
                            "a s múdrosťou riadiš tento svet;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a vlož do našich sŕdc nádej<br>" +
                            "i dôveru v tvoju nekonečnú prozreteľnosť.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"12", "A", "Bratia a sestry, v krste sme sa všetci zjednotili v Ježišovi Kristovi. Preto ako jedna duša a jedno srdce prosme Pána.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby sa v Cirkvi pri rozličnosti mienok zachovala v potrebných veciach jednota a vo všetkom láska, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby bohatšie krajiny napomáhali rozvoj chudobných krajín, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby tí, ktorých trápia úzkosti, našli útechu a pokoj v Kristovi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme sa nikdy nehanbili vyznávať svoju vieru pred ľuďmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo vzrastalo v duchovnej horlivosti a v službe bratom a sestrám, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "vyslyš naše prosby,<br>" +
                            "nauč nás vážiť si vieru ako najvzácnejší poklad<br>" +
                            "a život v tvojej milosti ako najvyššie dobro a šťastie.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"12", "B", "Bratia a sestry, Boh riadi svojou mocou celý vesmír a má moc aj nad naším životom. Obráťme sa naňho so svojimi prosbami.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za nášho Svätého Otca <font color='#B71C1C'>M.</font>: aby s istotou viedol loďku Cirkvi do prístavu spásy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za biskupov a kňazov: aby nepodliehali obavám a strachu z ťažkostí, ktoré prináša ich služba, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za učiteľov a katechétov: aby ich práca priniesla dobré ovocie vo výchove nového pokolenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za mladé rodiny: aby mali odvahu prijať deti, a tak sa podieľali na Božom stvoriteľskom pláne, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu zhromaždených: aby sme si čoraz živšie uvedomovali, že Boh je vždy s nami, prosme Pána.",
                    "Bože, tvoj Syn Ježiš Kristus nás v evanjeliu<br>" +
                            "vyzval na dôveru v teba;<br>" +
                            "vypočuj naše prosby a naplň nás istotou,<br>" +
                            "že si s nami a že nás neopúšťaš.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"12", "C", "Bratia a sestry, spolu s apoštolom Petrom vyznávame, že Ježiš je Mesiáš. Nech sú aj tieto prosby vyjadrením našej viery v jeho božstvo.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, posilni našu vieru.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, zachovaj v milosti a zdraví nášho pápeža <font color='#B71C1C'>M.</font> a nášho biskupa <font color='#B71C1C'>M.</font>, aby horlivo slúžili tvojej Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomôž všetkým ľuďom, aby zo spoločenského života odstraňovali nadradenosť a domýšľavosť.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj múdrosť a pravovernosť všetkým, ktorí učia v seminároch a na teologických fakultách.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj svetu, zranenému vojnami a rozbrojmi, zakúsiť tvoje milosrdenstvo a pokoj.<br>" +
                            "<font color='#B71C1C'>5.</font> Stoj pri tých, ktorí vo svete trpia pre tvoje meno, a pomáhaj im dobrom premáhať zlo.<br>" +
                            "<font color='#B71C1C'>6.</font> Daj nám silu každodenne prijímať svoj kríž a spájať ho s tvojím utrpením.<br>" +
                            "<font color='#B71C1C'>7.</font> Pomôž nám stále si uvedomovať, že všetko vzácne a trvalé sa rodí z obety a statočnej viery.",
                    "Pane Ježišu, ty si mnoho trpel za nás,<br>" +
                            "aby si nám daroval spásu;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a veď nás kráľovskou cestou kríža<br>" +
                            "k slávnemu vzkrieseniu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"12", "1", "Bratia a sestry, Pán Ježiš nás vyzýva na čestný a pravdivý postoj k životu a k ľuďom. Prostredníctvom neho prednesme Bohu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Dobrotivý Bože, daj, aby tvoja Cirkev stále kráčala po ceste spravodlivosti a pravdy.<br>" +
                            "<font color='#B71C1C'>2.</font> Milujúci Otče, daj, aby tí, ktorí musia z úradu hodnotiť konanie blížnych, boli objektívni a spravodliví.<br>" +
                            "<font color='#B71C1C'>3.</font> Milostivý Bože, daj, aby namyslení ľudia uznali svoju pýchu a učili sa pokornému zmýšľaniu.<br>" +
                            "<font color='#B71C1C'>4.</font> Láskavý Otče, daj, aby sme sa v živote chránili zbytočného posudzovania druhých, a tak dosiahli tvoje zmilovanie.<br>" +
                            "<font color='#B71C1C'>5.</font> Milosrdný Bože, daj, aby naši zomrelí <font color='#B71C1C'>(M.)</font> dosiahli večné kráľovstvo, ktoré si prisľúbil svojim verným.",
                    "Všemohúci Bože,<br>" +
                            "vyslyš naše prosby,<br>" +
                            "vylieč nás z náklonnosti a zlozvyku<br>" +
                            "posudzovať, ohovárať a osočovať<br>" +
                            "a daj, aby náš život zodpovedal náuke evanjelia.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"12", "2", "Bratia a sestry, Boh Otec poslal na svet svojho Syna, aby nás poučil, že do nebeského kráľovstva sa vstupuje tesnou bránou. V našom úsilí sa obráťme naňho s dôverou.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, posväcuj svoju Cirkev, aby bola skutočným domovom tvojich detí a znamením tvojej lásky.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, vzbudzuj vo svojich veriacich radosť a vďačnosť, že môžu mať účasť na tvojich svätých tajomstvách.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, neustále obnovuj v kresťanoch vzácny dar viery, aby v nich nevyhasol život milosti, ktorý si im daroval.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, pomôž mladým ľuďom zachovať si čisté srdce a úprimne hľadať svoje miesto v živote.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, daruj nám odvahu, aby sme verne kráčali za Kristom úzkou cestou, ktorá vedie do života.<br>" +
                            "<font color='#B71C1C'>6.</font> Bože, otvor našim zomrelým <font color='#B71C1C'>(M.)</font> bránu neba, ktorá vedie do radosti večného života.",
                    "Nekonečný Bože,<br>" +
                            "ty nás prostredníctvom svojho milovaného Syna<br>" +
                            "učíš plniť tvoju vôľu;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme ti verne slúžili po celý život.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"12", "3", "Bratia a sestry, kto zostáva v Kristovi, prináša veľa dobrého ovocia. Preto aj my upevnime svoje spojenie s ním a spoločne ho vzývajme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, buď našou spásou.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za biskupov a kňazov, aby boli horlivými pastiermi a vlievali nádej do sŕdc všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za všetkých kresťanov, aby úprimne hľadali pravdu a vyznávali svoju vieru.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za pochybujúcich ľudí, aby vo viere našli istotu a pravú radosť.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za nevyliečiteľne chorých, aby vo svojom utrpení dokázali vyprosovať Božie milosrdenstvo pre svet.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za seba samých, aby sme svojím životom prinášali ovocie dobrých skutkov.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby s radosťou prešli bránou neba.",
                    "Pane Ježišu Kriste,<br>" +
                            "ty nás poznáš<br>" +
                            "a vieš, čo potrebujeme;<br>" +
                            "vyslyš naše prosby a posilňuj nás,<br>" +
                            "aby nám ovocie nášho života<br>" +
                            "slúžilo na večnú spásu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"12", "4", "Bratia a sestry, Pán Ježiš učil ako ten, ktorý má moc, preto sa s dôverou obráťme na neho a vrúcne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, posilňuj biskupov, kňazov a diakonov, aby popri službe druhým nezanedbávali vlastné posvätenie a duchovný rast.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, upevňuj všetkých veriacich vo vernosti tvojmu evanjeliu.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, pomôž národom budovať spravodlivý sociálny poriadok.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, vzbuď novú nádej vo všetkých, ktorí stratili dôveru v teba alebo v ľudí.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, otvor naše srdcia pre tvoje slovo, aby sme svoje životy stavali na skale, ktorou si ty sám.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane Ježišu, našim zomrelým <font color='#B71C1C'>(M.)</font> daruj večnú radosť v nebi.",
                    "Pane Ježišu,<br>" +
                            "spoliehame sa na tvoje milosrdenstvo;<br>" +
                            "vyslyš naše prosby,<br>" +
                            "lebo ty si našou jedinou záchranou.<br>" +
                            "Ty žiješ a kraľuješ na veky vekov."},
            {"12", "5", "Bratia a sestry, Boh nás aj dnes zhromažďuje okolo oltára v mene svojho Syna Ježiša Krista. Prednesme mu prosby za Cirkev, svet i nás všetkých.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev: aby vo vernosti evanjeliu ohlasovala posolstvo spásy celému svetu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za našu vlasť: aby duch evanjelia prenikal všetky oblasti nášho každodenného života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za hriešnikov: aby očistení od poškvrny hriechu našli radosť v živote s Bohom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: aby sme mali jasné poznanie našich slabostí a vedeli s nimi zápasiť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zomrelých, ktorí trpia v očistci: aby zbavení múk smrti dosiahli radosť večného života, prosme Pána.",
                    "Pane Ježišu, ty si očistil malomocného;<br>" +
                            "prosíme ťa, vypočuj naše prosby,<br>" +
                            "naplň nás veľkou dôverou v tvoje milosrdenstvo<br>" +
                            "a uzdrav nás zo všetkého,<br>" +
                            "čo by nám prekážalo verne ti slúžiť.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"12", "6", "Bratia a sestry, povzbudzuje nás dôvera stotníka, ktorý uveril, že sa stane to, čo Ježiš povedal. Posilnime svoju vieru spoločnou modlitbou.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, uzdrav nás svojím slovom.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby tvoje slovo prinášalo blúdiacim múdrosť, trpiacim úľavu, chorým zdravie a všetkým pokoj a spásu.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, daj, aby sa medzinárodné spoločenstvá usilovali riešiť konflikty vo svete pokojnou cestou.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, daj, aby všetci kresťania mali otvorené oči pre potreby svojich blížnych a boli im ochotne k dispozícii.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, daj, aby chorí, trpiaci a zomierajúci posilnení tvojím slovom dokázali všetko znášať trpezlivo a s dôverou.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, daj, aby sme sa vo svojich modlitbách prihovárali za všetkých, ktorí to potrebujú.",
                    "Milosrdný Ježišu,<br>" +
                            "s dôverou sme ti predniesli svoje prosby;<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj nás a posilni našu vieru<br>" +
                            "v silu tvojho uzdravujúceho slova.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"13", "A", "Bratia a sestry, pre hriech sme boli mŕtvi, ale Kristus nám v krste daroval nový život. Preto sa s dôverou modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby naši novokňazi boli mužmi hlbokej modlitby a v sile Ducha Svätého viedli veriacich k svätosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby nastávajúci čas prázdnin a dovoleniek bol pre nás príležitosťou spoznať Stvoriteľa v kráse prírody, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby bezdetní manželia napĺňali svoj život službou druhým, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sa našlo čoraz viac šľachetných ľudí, ktorí zasvätia svoj život opatere Božích služobníkov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naše rodiny napĺňal duch kresťanskej pohostinnosti a nezištnej lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Aby sme sa dokázali zrieknuť všetkého, čo nám bráni žiť opravdivým kresťanským životom, prosme Pána.",
                    "Pane Ježišu, vyslyš naše prosby<br>" +
                            "a pomáhaj nám niesť svoj každodenný kríž,<br>" +
                            "aby sme ťa milovali viac ako všetko na svete.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"13", "B", "Bratia a sestry, náš Spasiteľ Ježiš Kristus zbavil smrť jej moci, a tak umožnil, aby človek dosiahol večný život. Vyprosujme dar života všetkým ľuďom.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, nech tvoja Cirkev vydáva jasné svedectvo viery vo vzkriesenie tela a vo večný život.<br>" +
                            "<font color='#B71C1C'>2.</font> Nech biskupi a kňazi hlásaním evanjelia učia ľudí prekonávať zlo a smrť a dosiahnuť pravý život v Bohu.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, nech lekári a chorí dôverujú v tvoju uzdravujúcu a milosrdnú lásku.<br>" +
                            "<font color='#B71C1C'>4.</font> Ochraňuj pred nešťastím všetkých cestujúcich, aby šťastlivo dosiahli svoj cieľ.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj našim zosnulým <font color='#B71C1C'>(M.)</font> radosť zo vzkriesenia do života vo večnosti.",
                    "Pane Ježišu, ty si premohol smrť<br>" +
                            "a náš život si prežiaril svojím evanjeliom;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a nauč nás pomáhať všetkým,<br>" +
                            "ktorí potrebujú našu pomoc.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"13", "C", "Bratia a sestry, vydať sa na cestu znamená niečoho sa zrieknuť. To platí najmä o nasledovaní Krista. Vrúcne ho prosme, aby sme v ňom šťastne dosiahli svoj cieľ.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby novokňazi v obetavosti a láske stále dokonalejšie stelesňovali ideál Dobrého pastiera, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby hmotné výhody a rodinné zväzky neprekážali mladým ľuďom ísť za Božím hlasom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby ľudia nežili v nenávisti, ale aby všade na svete víťazil zákon lásky a milosrdenstva, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby rodičia s rozvahou rešpektovali slobodu svojich detí a viedli ich k zodpovednosti a k vzájomnej úcte, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme rozhodne premáhali pokušenia a neprepadli žiadostivosti tela, prosme Pána.",
                    "Ježišu, vypočuj naše prosby<br>" +
                            "a upevňuj našu dôveru v teba,<br>" +
                            "veď ty si náš Pán a Boh<br>" +
                            "a vedieš nás k pravej slobode Božích detí.<br>" +
                            "Ty žiješ a kraľuješ na veky vekov."},
            {"13", "1", "Bratia a sestry, krstom sme sa stali učeníkmi Ježiša Krista, ktorý nás povoláva do služby všetkým ľuďom. Preto ho teraz prosme o pomoc pre všetkých našich bratov a sestry.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za pokoj a požehnanie pre pápeža <font color='#B71C1C'>M.</font>, nášho biskupa <font color='#B71C1C'>M.</font>, všetkých kňazov a pre celý kresťanský ľud.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za tých, ktorí nás žiadali o modlitbu, aby im Pán pomohol v ich ťažkostiach.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za priaznivé počasie, aby nám zem dala hojnú úrodu.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za tých, ktorí sú na cestách, aby sa šťastne vrátili domov.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za tých, ktorí sa rozhodli nasledovať Krista, aby mu zostali navždy verní.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme za zomrelých <font color='#B71C1C'>(M.)</font>, aby dosiahli večnú radosť a blaženosť v nebeskom domove.",
                    "Ježišu, náš milovaný Majster,<br>" +
                            "zmiluj sa nad svojím ľudom,<br>" +
                            "ktorý ťa nasleduje na ceste spásy,<br>" +
                            "a vyslyš naše prosby,<br>" +
                            "lebo ty si naše útočisko a sila<br>" +
                            "teraz i na veky vekov."},
            {"13", "2", "Bratia a sestry, Ježiš Kristus, ktorého poslúcha vietor i more, nás neustále zahŕňa svojou starostlivou láskou. Preto mu s dôverou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zachráň nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za nášho Svätého Otca <font color='#B71C1C'>M.</font>, aby z Ježišovej moci čerpal silu a múdrosť viesť aj v nepokojných časoch loďku Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za ustráchaných ľudí, aby hľadali záchranu v Kristovi, ktorý nikoho neopustí.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za celé ľudstvo, aby sme sa šetrne správali k prírode a zachovali ju pre budúce generácie.",
                    "<font color='#B71C1C'>(4.</font> Modlime sa za zúrodňujúci dážď, aby všade, kde je potrebný, priniesol životodarnú vlahu.<font color='#B71C1C'>)</font><br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za naše eucharistické spoločenstvo, aby sme posilnení vo viere víťazili nad každým nebezpečenstvom a strachom.",
                    "Pane Ježišu Kriste,<br>" +
                            "ty sa neustále o nás staráš a chrániš nás,<br>" +
                            "v tebe je naša nádej a pomoc;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a ochráň nás pred malomyseľnosťou,<br>" +
                            "aby sme vždy dôverovali v teba.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"13", "3", "Bratia a sestry, vždy, keď sme svedkami pôsobenia zla, hľadajme pomoc v Ježišovi Kristovi, ktorý má moc aj nad zlými duchmi, a volajme k nemu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, chráň svoju Cirkev pred každým zlom a nástrahami diabla.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, osloboď spoločenský a politický život od vplyvu zlého ducha.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, očisti naše rodiny a kresťanské spoločenstvá od každého neporiadku a nepokoja.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, posilňuj nás v boji s pokušením a hriechom.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, daj, nech na nás, kresťanoch, svet spozná, akým šťastím je veriť v teba.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane, vysloboď zomrelých z očistca a daj im večnú spásu.",
                    "Pane Ježišu, ty si naše útočisko a sila;<br>" +
                            "vypočuj naše modlitby a prosby,<br>" +
                            "chráň nás od všetkého zla<br>" +
                            "a daj, aby sme sa nikdy neodlúčili od teba.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"13", "4", "Bratia a sestry, Syn človeka má moc uzdravovať a odpúšťať hriechy. Preto ho s dôverou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zmiluj sa nad nami a vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých pokrstených: aby čoraz viac dozrievali vo svojej viere, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za ľudí, ktorí sa boja pristúpiť k sviatosti zmierenia: aby túžba po Božej láske a odpustení prelomila v nich bariéru strachu a hanblivosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za chudobných a chorých: aby sa vo svojom utrpení necítili sami a našli pomocnú ruku vo svojich blížnych, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: aby sme boli neustále vďační za sviatostné odpustenie hriechov a preukázané milosrdenstvo, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zomrelých <font color='#B71C1C'>(M.)</font>: aby dosiahli odpustenie a večnú slávu v nebi, prosme Pána.",
                    "Ježišu Kriste, Syn človeka,<br>" +
                            "ty máš moc odpúšťať hriechy;<br>" +
                            "zmiluj sa nad nami a vyslyš naše prosby,<br>" +
                            "aby sme mohli povstať do nového života s tebou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"13", "5", "Bratia a sestry, Pán Ježiš vyzdvihuje viac milosrdenstvo než obetu. S vedomím svojej hriešnosti prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, buď nám milosrdný a vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosíme ťa, Pane, za Boží ľud, aby vždy vedel rozpoznať Otcovu vôľu.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za povolaných na zasvätený život, aby s radosťou vytrvali v modlitbe a zostali verní svojim sľubom.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za colníkov a finančných úradníkov, aby boli poctiví a spravodlivo vykonávali svoje povolanie.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za rodiny našej farnosti, aby boli skutočnými domácimi cirkvami.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa za nás tu zhromaždených, aby sme horlivou vierou odpovedali na Božie volanie a životom svedčili o tebe.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosíme ťa za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby pre tvoje milosrdenstvo dosiahli večný život.",
                    "Pane Ježišu Kriste,<br>" +
                            "svojím milosrdenstvom uzdravuješ hriešnikov;<br>" +
                            "zhliadni na naše prosby<br>" +
                            "a daj, aby sme aj my boli milosrdní k našim bratom a sestrám.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"13", "6", "Bratia a sestry, v dôvere, že Panna Mária, Matka milosti, oroduje za nás, obráťme sa k Bohu Otcovi a prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev na celom svete, aby ako Kristova nevesta horlivo a odvážne vydávala svedectvo o svojom Ženíchovi.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za mladých ľudí, aby prijímali evanjeliové morálne zásady, usilovali sa ich pochopiť a podľa nich aj žili.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za rozdávateľov svätého prijímania, aby sami plnšie žili z tajomstva Eucharistie, ktorej sa dotýkajú.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za všetkých, ktorí sú na prázdninách a dovolenkách, aby popri oddychu nezabúdali na svoje kresťanské povinnosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás tu prítomných, aby sme sa svätosťou života stali vzorom pre ľudí vzdialených od Boha.",
                    "Bože, ty nás napĺňaš svojou múdrosťou;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj nám silu premieňať svoj život tak,<br>" +
                            "aby sme vytrvalo ohlasovali radostnú zvesť evanjelia.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14", "A", "Bratia a sestry, kresťanská pokora patrí k pilierom duchovného života. Preto prosme nášho Pána, ktorý je tichý a pokorný srdcom, aby sme sa od neho učili tejto čnosti.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu tichý a pokorný srdcom, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, osvieť svedomie všetkých kresťanov, aby si pokorne priznali svoje chyby a v láske sa zjednocovali v tvojej svätej Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Odstráň zo sŕdc verejných činiteľov pýchu, aby mohli všetky národy žiť v mieri a pokoji.<br>" +
                            "<font color='#B71C1C'>3.</font> Prebúdzaj vo všetkých ľuďoch zodpovednosť za stvorený svet, aby chránili prírodu pre budúce generácie.<br>" +
                            "<font color='#B71C1C'>4.</font> Priveď k svojmu srdcu životom ubitých a prepracovaných ľudí, aby u teba našli útechu a posilu.<br>" +
                            "<font color='#B71C1C'>5.</font> Pomôž nám premáhať pokušenia tela a nauč nás vážiť si prítomnosť Ducha Svätého v našom srdci.",
                    "Pane Ježišu, velebil si svojho Otca za to,<br>" +
                            "že maličkým zjavil tajomstvá nebeského kráľovstva;<br>" +
                            "vyslyš naše pokorné prosby<br>" +
                            "a pretvor naše srdcia podľa svojho srdca.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"14", "B", "Bratia a sestry, ako v dobe prorokov, tak aj dnes Boh posiela hlásateľov svojho slova. Modlime sa spoločne, aby jeho slovo bolo prijímané a oslavované.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev: aby bola jednotná vo viere a neochvejná v láske, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých ľudí: aby dospeli k poznaniu pravdy, a tak dosiahli spásu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých, čo trpia na tele a na duši: aby pocítili Božiu milosť a lásku, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za emigrantov, ktorí museli opustiť svoju vlasť: aby boli oslobodení od každej diskriminácie a našli nový domov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu zhromaždených: aby sme mali v úcte kňazov a videli v nich prorokov dnešnej doby, prosme Pána.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a daj nám silu v pokušeniach,<br>" +
                            "svetlo v pochybnostiach<br>" +
                            "a útechu v chorobách.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14", "C", "Bratia a sestry, prosme Boha Otca, aby sa evanjelium šírilo po celom svete a aby všetci ľudia pocítili Boží pokoj.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, pošli dobrých kňazov svojej Cirkvi, aby bol dostatok robotníkov na tvojej žatve.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, vnukni všetkým ľuďom, aby v tebe hľadali radosť a pravý pokoj.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, sprevádzaj deti a mládež počas prázdnin, aby ich prežili bezpečne a nezabúdali, že ty si ich Otcom.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, žehnaj všetkých, ktorí pracujú na poliach, a nás nauč vážiť si tvoje dary.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, zachovaj nás v posväcujúcej milosti, aby sme nikdy neupadli do ťažkého hriechu.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane, odmeň našich zomrelých <font color='#B71C1C'>(M.)</font> večným pokojom a šťastím v tvojom kráľovstve.",
                    "Večný Bože, tvoja milosť nepozná hraníc<br>" +
                            "a tvoja dobrota je nekonečná;<br>" +
                            "vypočuj naše prosby,<br>" +
                            "ktoré sme ti s dôverou predniesli,<br>" +
                            "a daj, aby sme ustavične žili v tvojom pokoji<br>" +
                            "a boli jeho šíriteľmi vo svete.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14", "1", "Bratia a sestry, prosme Boha, ktorý posilňuje slabých a pomáha tým, ktorí sa k nemu s dôverou utiekajú.",
                    "<font color='#B71C1C'>(</font>Volajme: Dôverujeme ti, Otče.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, zachovaj svojej Cirkvi slobodu pri ohlasovaní tvojej pravdy.<br>" +
                            "<font color='#B71C1C'>2.</font> Povzbudzuj predstaviteľov štátov, aby neochabovali v úsilí zaistiť svetu pokoj.<br>" +
                            "<font color='#B71C1C'>3.</font> Chráň našu vlasť pred každým zlom a nešťastím.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj nevyliečiteľne chorým deťom starostlivých a trpezlivých opatrovateľov.<br>" +
                            "<font color='#B71C1C'>5.</font> Posilňuj matky v požehnanom stave, aby priviedli na svet živé a zdravé deti.<br>" +
                            "<font color='#B71C1C'>6.</font> Prijmi do nebeskej vlasti našich zomrelých <font color='#B71C1C'>(M.)</font> a daj im večnú spásu.",
                    "Bože Otče, zvelebujeme ťa za tvojho Syna,<br>" +
                            "ktorý lieči všetky naše rany;<br>" +
                            "vyslyš naše prosby,<br>" +
                            "ktoré prednášame tu, pred tvojou tvárou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14", "2", "Bratia a sestry, v Kristovi máme starostlivého pastiera, ktorý vie, čo potrebujeme. S nádejou, že naše prosby vyslyší, volajme:",
                    "<font color='#B71C1C'>(</font>Pane, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za nášho Svätého Otca <font color='#B71C1C'>M.</font>, biskupov, kňazov a diakonov, aby boli horliví pri hlásaní Božieho slova.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za všetkých núdznych, aby im nikdy nechýbala naša bratská pomoc a láska.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých, ktorí nepoznajú Krista, aby im živé svedectvo kresťanov otvorilo srdcia pre poznanie pravdy.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za starých rodičov, aby s trpezlivosťou odovzdávali lásku a životnú múdrosť svojim vnúčatám.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za seba samých, aby sme boli vždy ochotní prinášať ľuďom posolstvo o Božom kráľovstve.",
                    "Pane Ježišu Kriste,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pošli robotníkov na svoju žatvu,<br>" +
                            "aby sme nikdy neboli ako ovce bez pastiera.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"14", "3", "Bratia a sestry, prostredníctvom Krista, ktorý rozposiela svojich apoštolov, aby ohlasovali Božie kráľovstvo, volajme k nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, posväcuj svoju Cirkev, postavenú na základe apoštolov, aby bola pre všetkých ľudí pravdivým znamením jednoty, lásky, pokoja a spásy.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, daj, nech ťa v láske kresťanov spoznajú aj tí, ktorí v teba neveria.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, chráň všetky národy pred hrôzami vojny, prírodných katastrof a každého zla.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, daruj rodičom vieru, vychovávateľom múdrosť a deťom šťastnú budúcnosť.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, obdaruj nás milosťou chápať naše osobné kresťanské povolanie.<br>" +
                            "<font color='#B71C1C'>6.</font> Otče, prijmi k sebe duše našich zomrelých <font color='#B71C1C'>(M.)</font> a daruj im radosť zo spásy.",
                    "Všemohúci Bože,<br>" +
                            "s pokorou sme ti predniesli naše prosby;<br>" +
                            "prosíme ťa, vypočuj nás<br>" +
                            "a daj, aby sme boli vždy verní náuke svätých apoštolov.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14", "4", "Bratia a sestry, ako apoštolov, tak aj nás Pán posiela ohlasovať svetu evanjelium. Prosme ho, aby sme sa stali nositeľmi pokoja.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, urob nás nástrojom svojho pokoja.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme o pokorného ducha pre všetkých členov Cirkvi, aby si uvedomovali svoju závislosť od Boha.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme o milosť vytrvalosti pre svedkov evanjelia, aby ho ohlasovali všetkým ľuďom.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme o čestnosť pre všetkých obyvateľov našej vlasti, aby nepodľahli korupcii a materializmu.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za nás samých, aby sme dokázali prinášať pokoj všetkým trpiacim a beznádejným.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme o milosrdenstvo pre našich zomrelých <font color='#B71C1C'>(M.)</font>, aby sa im sám Pán stal večnou odmenou.",
                    "Pane Ježišu,<br>" +
                            "ty nás posielaš ohlasovať príchod nebeského kráľovstva;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a neustále nás posilňuj v službe evanjeliu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"14", "5", "Bratia a sestry, povzbudení slovami evanjelia s dôverou očakávame príchod nášho Pána Ježiša Krista. Preto mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých členov Cirkvi, aby mali odvahu vyznávať evanjelium bez ohľadu na akékoľvek riziká, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za tých, ktorí sú prenasledovaní pre Ježišovo meno, aby dosiahli nevädnúci veniec slávy za svoju vernosť Kristovi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za rodičov, ktorých deti sa odvrátili od Boha, aby ich svojou dobrotou a trpezlivosťou dokázali priviesť naspäť do spoločenstva s nebeským Otcom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za deti z detských domovov, aby sa našli ľudia, ktorí budú ochotní vytvoriť im pravý domov a rodinné zázemie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu zhromaždených, aby sme neboli iba pasívnymi poslucháčmi Pánovho slova, ale aby sme ho aj aktívne uskutočňovali vo svojich životoch, prosme Pána.",
                    "Pane Ježišu, ty nám posielaš Ducha Svätého,<br>" +
                            "aby cez nás hovoril;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme pociťovali jeho pôsobenie<br>" +
                            "vo všetkých chvíľach nášho života.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"14", "6", "Bratia a sestry, Pán Ježiš nám prisľúbil, že nás vyzná pred nebeským Otcom, ak ho my vyznáme pred ľuďmi. S dôverou ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, slovo a múdrosť nebeského Otca, daruj pomáhajúcu milosť všetkým verným ohlasovateľom evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, prameň milosrdenstva, posilňuj všetkých, ktorí sa venujú službe lásky a pomáhajú trpiacim.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, sila slabých, upevňuj pochybujúcich vo viere a chráň prenasledovaných.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, náš záchranca, stoj pri tých, ktorí trpia núdzou, bezprávím alebo nepriateľstvom.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, Kráľ slávy, daj účasť na večnej liturgii našim zomrelým biskupom a kňazom.",
                    "Pane Ježišu, Dobrý pastier a Učiteľ,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, nech tvoje slová zapália naše srdcia,<br>" +
                            "aby sme horlivo konali vôľu tvojho Otca.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"15", "A", "Bratia a sestry, Pán Ježiš je starostlivý rozsievač. Pokorne ho prosme, aby boli naše srdcia dobrou pôdou pre Božie slovo.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, roznecuj v srdciach veriacich vrúcnu a živú lásku k Svätému písmu.<br>" +
                            "<font color='#B71C1C'>2.</font> Pošli všetkým národom horlivých ohlasovateľov tvojho evanjelia.<br>" +
                            "<font color='#B71C1C'>3.</font> Svojou milosťou zavlaž tvrdú pôdu sŕdc tých, ktorí počúvajú Božie slovo ľahostajne.<br>" +
                            "<font color='#B71C1C'>4.</font> Odstráň z našich sŕdc hriešne zlozvyky, aby v nás neničili dobré úsilia a predsavzatia.<br>" +
                            "<font color='#B71C1C'>5.</font> Osviež všetkých, ktorí sú na dovolenkách, aby čas odpočinku využili na regeneráciu tela i ducha.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme s radosťou prijímali duchovnú posilu<br>" +
                            "zo stola tvojho slova,<br>" +
                            "ktorý nám bohato prestieraš.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"15", "B", "Bratia a sestry, Ježiš poslal svojich apoštolov, aby boli jeho svedkami. Dnes túto úlohu dostáva každý kresťan. Prosme v tejto chvíli za seba samých, za naše spoločenstvo i za celý svet.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, pomáhaj svojej Cirkvi, aby ti slúžila v chudobe a láske.<br>" +
                            "<font color='#B71C1C'>2.</font> Udeľ svojim kňazom veľkú dôveru v teba a daj im čisté srdce, aby víťazili nad zlým duchom.<br>" +
                            "<font color='#B71C1C'>3.</font> Nauč manželov a rodičov chápať ich poslanie a zodpovednosť za svoje rodiny.<br>" +
                            "<font color='#B71C1C'>4.</font> Potešuj chorých svojím slovom a uzdrav ich svätým pomazaním.<br>" +
                            "<font color='#B71C1C'>5.</font> Žehnaj naše každodenné práce, aby boli tebe na chválu a blížnym na úžitok.<br>" +
                            "<font color='#B71C1C'>6.</font> Dopraj nám priaznivé počasie, aby tohtoročná úroda priniesla dostatok pre každého.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme napĺňali svoje poslanie v Cirkvi<br>" +
                            "a aby sme boli čoraz čistejší a svätejší pred tvojou tvárou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"15", "C", "Bratia a sestry, v spojení s Kristom a prostredníctvom neho prosme nášho nebeského Otca, aby svet lepšie chápal príkaz lásky k blížnemu.",
                    "<font color='#B71C1C'>(</font>Volajme: Posväť svoj ľud, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj, aby pastieri Cirkvi životom potvrdzovali, čo ohlasujú slovami.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, vnukni všetkým ľuďom, aby v každom človeku videli svojho brata a ochotne mu pomáhali.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, žehnaj tých, ktorí svoj život zasvätili službe opusteným a biednym.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, odmeň námahu lekárov a ošetrovateľov, ktorí sa ochotne starajú o zdravie človeka a s láskou ho opatrujú.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, vlož do našich sŕdc dar svojej lásky, aby sa v našom <font color='#B71C1C'>(</font>farskom<font color='#B71C1C'>)</font> spoločenstve nik necítil opustený.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane, daj, nech nezabúdame na našich zomrelých príbuzných a dobrodincov a modlíme sa za duše v očistci.",
                    "Pane a Bože náš,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a nauč nás najmä v trpiacich a opustených<br>" +
                            "vidieť tvojho Syna Ježiša Krista,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"15", "1", "Bratia a sestry, Božie slovo nás dnes vyzýva, aby sme nasledovali Krista. Spoločne ho prosme, aby sme mali silu plniť aj jeho náročné požiadavky.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, prijmi našu modlitbu.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Cirkev, aby súčasnému svetu prinášala posolstvo pokoja.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za Svätého Otca <font color='#B71C1C'>M.</font>, nášho biskupa <font color='#B71C1C'>M.</font> a všetkých kňazov, aby vždy boli otvorení pre ekumenický dialóg.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za obete každej nespravodlivosti, aby dokázali odpustiť svojim prenasledovateľom spôsobené krivdy.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za tých, ktorí svätokrádežne pristupujú k sviatostiam, aby si čím skôr uvedomili svoj hriech a konali pokánie.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za deti a mládež, aby počas prázdninových výletov mali otvorené srdcia a v prírode vedeli nachádzať stopy Stvoriteľa.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme za seba samých, aby sme odvážne niesli svoj každodenný kríž, a tak sa stále viac pripodobňovali Kristovi.",
                    "Pane, ty chceš,<br>" +
                            "aby sme ťa nasledovali celým srdcom;<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj naše pokorné prosby,<br>" +
                            "ktoré ti s vierou prednášame.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"15", "2", "Bratia a sestry, všemohúci Boh ukazuje blúdiacim svetlo pravdy, aby sa vrátili na správnu cestu. Prednesme mu svoje prosby za spásu celého sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, prosíme ťa za Cirkev, aby bez prestania ohlasovala radostnú zvesť o tvojej nekonečnej láske k svetu a k celému stvoreniu.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, prosíme ťa za biskupa, kňazov a diakonov našej diecézy, aby evanjeliová výzva na pokánie, ktorú ohlasujú, našla úrodnú pôdu v našich srdciach.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, prosíme ťa za všetkých kresťanov, aby sa v skutkoch pokánia dokázali otvárať pre pravdy evanjelia.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, prosíme ťa za hriešnikov, aby pocítili tvoje láskavé pozvanie na zmierenie a prežili radosť z návratu do tvojho otcovského domu.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, prosíme ťa za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby dosiahli večný život získaný víťazstvom Kristovho kríža.",
                    "Všemohúci Bože,<br>" +
                            "záchranca ľudského pokolenia,<br>" +
                            "ty nechceš smrť hriešnika, ale jeho obrátenie;<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj prosby svojich veriacich<br>" +
                            "a daj, aby nás umučenie a kríž tvojho Syna<br>" +
                            "priviedli k sláve zmŕtvychvstania.<br>" +
                            "Lebo on s tebou žije a kraľuje na veky vekov."},
            {"15", "3", "Bratia a sestry, Ježiš Kristus prišiel na svet, aby nám zjavil svojho Otca. Úprimne mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, pretvor naše srdcia a vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby tvoja Cirkev v každom čase pripomínala, že Boh je náš milujúci Otec.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, daj, aby sa všetky národy na zemi usilovali o mier, spravodlivosť a sociálny poriadok.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, daj, aby ťa v láske kresťanov spoznali aj tí, ktorí v teba neveria.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, daj, aby voľný čas dovoleniek a prázdnin bol pre všetkých príležitosťou na oddych a plnšiu skúsenosť s Bohom.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, daj, aby naši zomrelí <font color='#B71C1C'>(M.)</font> v tajomstve tvojej smrti a zmŕtvychvstania dosiahli radosť večného života.",
                    "Láskavý Ježišu,<br>" +
                            "ty sa dávaš poznať tým,<br>" +
                            "ktorí majú pokorné srdcia;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, nech stále žijeme vo vedomí<br>" +
                            "tvojej prítomnosti v našom živote.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"15", "4", "Bratia a sestry, prijať jarmo a bremeno Krista znamená spoznať pravú slobodu, radosť a pokoj. Preto spoločne prosme a volajme:",
                    "<font color='#B71C1C'>(</font>Pane, daj nám tiché a pokorné srdce.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, nauč Cirkev rozpoznávať znamenia čias a vysvetľovať ich vo svetle evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Odstráň z verejného života pýchu, prehnané sebavedomie, sebectvo a nenávisť.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, nech všetci slabí, chorí a bezmocní pocítia pomoc a pochopenie nás kresťanov.<br>" +
                            "<font color='#B71C1C'>4.</font> Pomáhaj nám, aby sme boli vnímaví na tvoj hlas a ochotní niesť svoj každodenný kríž.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás odovzdanosti do tvojej vôle vo všetkom, čo je pre nás bolestné a ťažké.<br>" +
                            "<font color='#B71C1C'>6.</font> Odmeň trápenia a ťažkosti, ktoré prežili naši zomrelí <font color='#B71C1C'>(M.)</font>, blaženým životom vo večnosti.",
                    "Pane Ježišu,<br>" +
                            "radostnú zvesť evanjelia<br>" +
                            "si zjavil poníženým a tichým ľuďom;<br>" +
                            "prijmi našu dnešnú modlitbu<br>" +
                            "a naplň nás duchom pokory,<br>" +
                            "aby sme žili v tvojej pravde.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"15", "5", "Bratia a sestry, Pán Ježiš nás učí hľadieť na životné situácie nie ľudskými, ale Božími očami a vidieť ich pravý zmysel. Máme sa naučiť, že láska je viac ako všetky ostatné príkazy. V spoločnej modlitbe sa s dôverou obráťme na neho.", "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, veď svoju Cirkev, aby bola vo svete znamením tvojej lásky a milosrdenstva.<br>" +
                            "<font color='#B71C1C'>2.</font> Ukáž tomuto svetu, že spravodlivosť sprevádzaná láskou je najpevnejším základom všetkých sociálnych istôt.<br>" +
                            "<font color='#B71C1C'>3.</font> Odstráň zo života ľudí ľahkomyseľné posudzovanie svojich bratov a sestier.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, daj, aby každý človek mohol naplno rozvinúť všetky svoje schopnosti pre službu tebe a blížnym.<br>" +
                            "<font color='#B71C1C'>5.</font> Prebuď v opustených a ťažko skúšaných ľuďoch túžbu po živote s tebou.<br>" +
                            "<font color='#B71C1C'>6.</font> Upevňuj v nás vedomie, že naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo je duchovnou rodinou, ktorú má spájať láska a svornosť.",
                    "Pane Ježišu,<br>" +
                            "k večnému cieľu nás často vedieš cestami,<br>" +
                            "ktoré nepoznáme,<br>" +
                            "a spôsobom, ktorý nechápeme;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a prijmi nás, keď sa zverujeme tvojmu vedeniu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"15", "6", "Bratia a sestry, Pán Ježiš zakúsil nenávisť ľudí, a napriek tomu mnohých uzdravoval, pretože chcel zjaviť tomuto svetu príklad nezištnej lásky. S pokorou ho prosme, aby aj v našom živote neustále zjavoval Božie milosrdenstvo.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa za Cirkev, aby z jej pôsobenia bolo svetu zrejmé, že tvoje kráľovstvo je medzi nami.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, prosíme ťa za národy sveta, aby sa od teba naučili žiť v mieri a vo vzájomnom pokoji.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, prosíme ťa za tých, ktorí trpia hladom a žijú nedôstojne a vo veľkej biede, aby aj našou zásluhou dostali primeranú pomoc.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, prosíme ťa za ľudí, ktorí zle hovoria o iných, aby si uvedomili, že tvojej láske sa protiví rozširovať zlo a ohovárať.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prosíme ťa za nás samých, aby sme si vždy vedeli ochotne odpúšťať a pomáhať v ťažkostiach.",
                    "Pane Ježišu, ty nalomenú trsť nedolomíš<br>" +
                            "a hasnúci knôtik nedohasíš;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a posilňuj nás vždy,<br>" +
                            "keď nebudeme mať dostatok síl,<br>" +
                            "aby sme milovali aj svojich nepriateľov.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"16", "A", "Bratia a sestry, Boh povoláva každého človeka do svojho spoločenstva, aby sa obrátil a žil. Preto spoločne volajme:",
                    "<font color='#B71C1C'>(</font>Zmiluj sa nad nami a vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, ty sprevádzaš všetkých, čo veria v teba; prosíme ťa, daj, aby kresťania dnešných čias verne a s nadšením ohlasovali tvoje slovo.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, ty budeš súdiť celý svet; prosíme ťa, veď predstaviteľov národov k vzájomnej úcte a rešpektu.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, ty pozývaš ľudí na obrátenie; prosíme ťa, priveď všetkých hriešnikov naspäť do svojho domu.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, ty poznáš nepriateľa ľudských duší; prosíme ťa, posilňuj nás vo chvíľach skúšok darom pravej múdrosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, ty obdarúvaš každého človeka slobodnou vôľou; prosíme ťa, daj, aby sme ju vždy využívali na konanie dobra.",
                    "Všemohúci a večný Bože,<br>" +
                            "ty si vládca sveta a sudca všetkých ľudí;<br>" +
                            "prosíme ťa, vypočuj naše pokorné prosby<br>" +
                            "a veď nás cestou pokánia a spásy.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"16", "B", "Bratia a sestry, Pán Ježiš je Dobrý pastier, ktorý nás pozná a vie, čo potrebujeme. V tejto spoločnej modlitbe ho prosme za všetkých ľudí, aby v ňom našli svojho Spasiteľa.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Udeľ dostatok síl Svätému Otcovi <font color='#B71C1C'>M.</font> a všetkým biskupom a kňazom, aby s horlivosťou ohlasovali svetu tvoje meno.<br>" +
                            "<font color='#B71C1C'>2.</font> Zľutuj sa nad národmi a krajinami, kde je nedostatok kňazov, a pošli im svojich robotníkov, aby sa všade mohli sláviť tvoje sviatosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Pouč všetkých kresťanov o dôležitosti ticha a samoty pred tvojou tvárou, aby svedectvo, ktoré vydávajú o tebe, bolo hodnoverné.<br>" +
                            "<font color='#B71C1C'>4.</font> Vnukni všetkým, čo v prírode hľadajú osvieženie, aby sa aj duchovne posilňovali modlitbou a účasťou na svätej omši.<br>" +
                            "<font color='#B71C1C'>5.</font> Ochraňuj naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo od každého nešťastia, aby sme ti mohli slúžiť v pokoji a s radosťou.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme nasledovali tvoj hlas,<br>" +
                            "lebo ním nás vedieš k tichým vodám<br>" +
                            "a po bezpečných chodníkoch spásy.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"16", "C", "Bratia a sestry, Božie slovo nás pozýva, aby sme mali svoj zrak stále upretý na Ježiša, ktorý je pôvodca a zavŕšiteľ viery. Obráťme sa na neho a spoločne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, ochraňuj Svätého Otca <font color='#B71C1C'>M.</font> a všetkých biskupov, aby mohli po celom svete nerušene šíriť posolstvo dobrej zvesti.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, daj, nech sa morálne zásady evanjelia stanú základom dialógu v politickom živote a vo vzťahoch medzi národmi.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, stoj pri všetkých rodinách, v ktorých chýba náboženská jednota.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, daruj svojim veriacim nábožného ducha a srdce, ktoré bude ochotné vždy pomáhať.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, posilňuj vernosť a vieru tých, ktorí sú pre ňu prenasledovaní.",
                    "Pane Ježišu,<br>" +
                            "ty si nás vykúpil svojou smrťou a zmŕtvychvstaním;<br>" +
                            "prosíme ťa, vypočuj naše pokorné prosby<br>" +
                            "a daj, aby sme nikdy nezišli z cesty pravej viery.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"16", "1", "Bratia a sestry, v pokore sa obráťme na Boha, ktorý prebýva na nebesiach a je naším milosrdným a odpúšťajúcim Otcom.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Svätého Otca <font color='#B71C1C'>M.</font>, biskupov a kňazov: aby nám vždy boli vzorom v správaní, v znášaní protivenstiev a v nesení každodenných krížov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých ľudí: aby boli ako prorok Jonáš vnímaví na vnuknutia Ducha Svätého, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za neveriacich a tých, ktorí nepoznajú Krista: aby prostredníctvom evanjeliového posolstva našli cestu k pravej viere, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za naše rodiny: aby sa v nich cez vzájomnú vernosť, lásku a pokoj diali Božie zázraky a znamenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás všetkých: aby sme nikoho nesúdili pre zlé skutky, ale aby sme v každom človeku videli Boží obraz, prosme Pána.",
                    "Všemohúci a večný Bože,<br>" +
                            "ty si vždy zhliadol na prosby svojho ľudu;<br>" +
                            "prosíme ťa, daj, aby sme verne počúvali tvoj hlas<br>" +
                            "a vo všetkom sa ti páčili.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"16", "2", "Bratia a sestry, Ježišovými bratmi a sestrami sú všetci, ktorí zachovávajú Božie slovo. Obráťme sa preto na neho a spoločne volajme:",
                    "<font color='#B71C1C'>(</font>Požehnaj svoj ľud, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, ty si založil Cirkev ako spoločenstvo bratov a sestier; daj, nech napreduje v obetavej a činorodej láske.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, ty si nám daroval svoje slovo, aby nás viedlo na ceste života; daj, nech sa ho usilujeme vždy verne zachovávať.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, ty si vyrastal v rodine, aby si ju posvätil; daj, nech si vážime dar rodinného života.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, ty si si všímal deti a dal si nám ich za príklad; daj, nech ich rodiny prijímajú a vychovávajú s láskou.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, ty si nás stvoril, aby sme žili pre teba; daj, nech tí, ktorí nás predišli do večnosti, zaujmú miesto v tvojom kráľovstve.",
                    "Pane Ježišu Kriste,<br>" +
                            "prosíme ťa,<br>" +
                            "láskavo vyslyš naše prosby<br>" +
                            "a dopraj všetkým,<br>" +
                            "ktorí sa usilujú zachovávať Božie slovo,<br>" +
                            "aby nadobudli trvalé spoločenstvo s tebou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"16", "3", "Bratia a sestry, zrno v evanjeliovom podobenstve je symbolom Božieho slova. Obráťme sa teraz na nášho Pána, aby sme sa aj my stali dobrou pôdou pre jeho posolstvo. S dôverou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, pravý kňaz, posilňuj svojho námestníka pápeža <font color='#B71C1C'>M.</font>, všetkých biskupov, kňazov a diakonov, aby vytrvalo ohlasovali tvoju radostnú zvesť.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, svetlo národov, vzbuď mnohé misijné povolania, aby sa evanjelium ohlasovalo všetkému stvoreniu.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, dobrý pastier, daj nám svätých kňazov, aby nás stále viedli k plnšiemu zjednoteniu s tebou.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, božský rozsievač, pretvor naše srdcia, aby v nás zasiate slovo vzklíčilo, prinieslo bohatú úrodu a bolo na úžitok celej Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, večná pravda, osvieť mysle všetkých neveriacich a pochybujúcich, aby uverili.",
                    "Pane Ježišu, teba nasledujú nespočetné zástupy ľudí;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a dopraj, aby tvoje slovo<br>" +
                            "prinieslo v našich srdciach hojnú úrodu.<br>" +
                            "Lebo ty žiješ a kraľuješ naveky vekov."},
            {"16", "4", "Bratia a sestry, zišli sme sa v tomto dome modlitby, aby sme oslavovali nášho nebeského Otca. Teraz mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Svätého Otca <font color='#B71C1C'>M.</font>, biskupov, kňazov, diakonov a seminaristov: aby ich srdcia boli naplnené evanjeliovou pokorou, láskou a oddanosťou zverenej službe, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za kňazov <font color='#B71C1C'>(</font>našej farnosti<font color='#B71C1C'>)</font>: aby ich životy boli dobrým svedectvom o Kristovej láske, pokore a múdrosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za rodičov: aby vychovávali svoje deti dobrým príkladom a modlievali sa spoločne s nimi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za miništrantov našej farnosti: aby s bázňou pristupovali k službe pri oltári, z ktorého pramení Božie požehnanie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu zhromaždených: aby sme, plní Božej lásky, boli pre našich blížnych milujúcimi bratmi a sestrami, prosme Pána.",
                    "Najláskavejší Otče,<br>" +
                            "pokorne ťa prosíme, vypočuj naše prosby<br>" +
                            "a daj, aby sa v našich životoch vždy upevňovala láska<br>" +
                            "k tvojmu Synovi Ježišovi Kristovi.<br>" +
                            "Lebo on je náš spasiteľ<br>" +
                            "a s tebou žije a kraľuje na veky vekov."},
            {"16", "5", "Bratia a sestry, Pán Ježiš zasieva Božie slovo do srdca každého človeka. Otvorme sa mu, prijmime ho a s vytrvalosťou prosme, aby sme prinášali bohatú úrodu.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za pápeža, biskupov a kňazov: aby žili podľa Božieho slova a vlastným životom svedčili o jeho sile a pravdivosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých veriacich ľudí: aby sa nehanbili verejne vyznať svoju vieru v Krista a s radosťou a odvahou ohlasovali evanjelium, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých, ktorí sú prenasledovaní pre Kristovo meno: aby mu napriek ťažkostiam a protivenstvám zostali verní, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za rodičov: aby svoje deti vychovávali vo viere a dávali im dobrý príklad čnostného života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby za vytrvalosť v konaní dobrých skutkov dostali večnú odmenu v nebi, prosme Pána.",
                    "Pane Ježišu, vyslyš naše prosby,<br>" +
                            "ktoré ti dnes predkladáme,<br>" +
                            "a daj, aby naše srdcia boli dobrou pôdou pre tvoje slovo,<br>" +
                            "pretože ono má moc spasiť naše duše.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"16", "6", "Bratia a sestry, Boh preukazuje svoju všemohúcnosť vo svojom milosrdenstve, keď sa zmilúva a odpúšťa nám naše neprávosti. Prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa, aby kresťania vo svete na mocný príhovor Panny Márie ochotne prijímali tvoje slovo a v tichosti o ňom uvažovali.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, daj, aby hriešnici prijali milosť obrátenia, a tak spoznali tvoju trpezlivú a milosrdnú lásku.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, daruj nám veľkú pokoru, aby naša miernosť bola známa všetkým ľuďom.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, naplň srdcia chorých a trpiacich pravou láskou, aby sa vrúcne a úprimne modlili za Cirkev a za posvätenie sveta.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, daj nám vytrvalosť v dobrom až do konca, aby sme pri poslednom súde mohli byť pripočítaní medzi svätých.",
                    "Bože, tvoja vernosť a láskavosť<br>" +
                            "siaha až po nebesia;<br>" +
                            "prosíme ťa,<br>" +
                            "vo svojej dobrote vyslyš naše modlitby<br>" +
                            "a daj, aby sme raz mali plnú účasť na tvojej sláve.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"17", "A", "Bratia a sestry, Pán Ježiš nám zjavuje tajomstvá svojho kráľovstva. Prosme ho o pravú múdrosť, aby sme dosiahli blaženosť večného života.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Daruj biskupom a kňazom horlivosť, aby so zanietením hľadali každú stratenú dušu, ako kupec hľadal perlu.<br>" +
                            "<font color='#B71C1C'>2.</font> Veď rozhodnutia zákonodarcov, aby pripravovanými zákonmi nepošliapali dar života, ktorý vkladáš do každej ľudskej bytosti v okamihu jej počatia.<br>" +
                            "<font color='#B71C1C'>3.</font> Pomôž všetkým, ktorí vstúpili do rozličných siekt, aby sa dokázali vrátiť k tebe, pravému a jedinému Bohu.<br>" +
                            "<font color='#B71C1C'>4.</font> Veď nás k slobode srdca, aby sme sa dokázali zrieknuť všetkého, čo nám bráni v budovaní vzťahu s tebou.<br>" +
                            "<font color='#B71C1C'>5.</font> Ujmi sa všetkých zomrelých, ktorí ťa počas svojho života úprimne hľadali, aby sa mohli naveky tešiť spolu s anjelmi v tvojej sláve.",
                    "Pane Ježišu,<br>" +
                            "tvoja láska k nám je naším najväčším pokladom;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a naplň nám srdcia vďačnosťou<br>" +
                            "za všetky tvoje dobrodenia.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"17", "B", "Bratia a sestry, Ježiš aj dnes dáva potrebný pokrm tým, ktorí túžia po nasýtení. S dôverou ho prosme, aby nám dával každodenný chlieb a aj chlieb z neba.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, daj nám chlieb z neba.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Zachovaj v zdraví a pri sile nášho pápeža <font color='#B71C1C'>M.</font> i všetkých biskupov a kňazov, aby ochotne lámali a podávali duchovný chlieb veriacim.<br>" +
                            "<font color='#B71C1C'>2.</font> Pohni srdcia ľudí bohatých krajín, aby neplytvali jedlom, ale dokázali sa oň podeliť s chudobnými.<br>" +
                            "<font color='#B71C1C'>3.</font> Pomôž ľuďom, ktorí hľadajú prácu, aby si našli vhodné zamestnanie.<br>" +
                            "<font color='#B71C1C'>4.</font> Pomôž nám vytrvať v ťažkých životných situáciách, aby sme ochotne plnili tvoju vôľu.<br>" +
                            "<font color='#B71C1C'>5.</font> Zjednocuj naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo okolo stola tvojho slova a chleba, aby sme vždy v tebe poznávali svojho Učiteľa a Pána.",
                    "Pane Ježišu, chlieb z neba,<br>" +
                            "ty nám dávaš všetko, čo potrebujeme pre život;<br>" +
                            "prosíme ťa, daj, nech si vážime tvoje duchovné dary,<br>" +
                            "aby sme raz dosiahli nebeské kráľovstvo.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"17", "C", "Bratia a sestry, obráťme sa na Pána Ježiša s rovnakou dôverou, s akou ho prosili učeníci, a spoločne volajme:",
                    "<font color='#B71C1C'>(</font>Pane, nauč nás modliť sa a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa, naplň múdrosťou Ducha Svätého všetkých biskupov a kňazov, aby veriacim pomáhali spoznávať lásku nebeského Otca.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, prosíme ťa, postaraj sa o deti, ktoré nezakúsili rodičovskú lásku, a zaplň prázdne miesto v ich srdciach svojou milujúcou pozornosťou.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, prosíme ťa, urob nás citlivými na potreby druhých a pomôž nám, aby sme sa pre vlastnú pohodlnosť neodvracali od tých, ktorí nás prosia.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, prosíme ťa, obnov naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme sa zjednotili ako jedna rodina a navzájom si zo srdca odpúšťali.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prosíme ťa, otvor nebeskú bránu zosnulým <font color='#B71C1C'>(M.)</font> a daj im večnú odmenu, ktorú im nik nevezme.",
                    "Pane Ježišu, ty nás učíš, ako sa máme modliť;<br>" +
                            "prosíme ťa, vyslyš naše prosby<br>" +
                            "a pomáhaj nám, aby sme sa nemodlili iba ústami,<br>" +
                            "ale hlavne svojím srdcom a celým životom.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"17", "1", "Bratia a sestry, v tejto chvíli prosme milovaného Otca, aby nám udelil dary, ktoré nevyhnutne potrebujeme na našu spásu.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby biskupi a kňazi vytrvalo napomáhali vzrast nebeského kráľovstva v srdciach ľudí, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby predstavitelia štátov pri formulovaní zákonov nezabúdali na mravné zásady obsiahnuté v evanjeliu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby počatým deťom nikdy nebolo upierané právo na život, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby tí, ktorí strácajú nádej, dokázali opäť uveriť v silu Ježišovho posolstva, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme s pomocou milosti Ducha Svätého dokázali odhaliť pravdu skrytú v evanjeliových podobenstvách, prosme Pána.",
                    "Večný Otče,<br>" +
                            "prosíme ťa, vyslyš naše prosby<br>" +
                            "a udeľ nám aj tie dary a milosti,<br>" +
                            "o ktoré sa ani neodvažujeme prosiť.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"17", "2", "Bratia a sestry, obráťme sa na Pána Ježiša, aby nám dal milosť správne chápať a žiť jeho evanjelium.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, daruj nám pravý pokoj a spásu.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daruj Cirkvi nové duchovné povolania, aby nikdy netrpela nedostatkom ohlasovateľov evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilňuj kresťanov žijúcich v ťažkých okolnostiach, aby aj napriek prekážkam prinášali dobrú úrodu.<br>" +
                            "<font color='#B71C1C'>3.</font> Naplň srdcia hriešnikov úprimnou kajúcnosťou, aby sa vrátili do domu tvojho Otca.<br>" +
                            "<font color='#B71C1C'>4.</font> Prebuď v našich srdciach túžbu po častom prijímaní eucharistického chleba, aby sa v nás upevňovala posväcujúca milosť.<br>" +
                            "<font color='#B71C1C'>5.</font> Prijmi duše zosnulých <font color='#B71C1C'>(M.)</font>, ktorí sa na zemi snažili žiť spravodlivo, aby mohli prebývať v kráľovstve tvojho Otca.",
                    "Nebeský rozsievač,<br>" +
                            "ďakujeme ti za vzácny dar tvojho slova;<br>" +
                            "prosíme ťa, vyslyš naše prosby<br>" +
                            "a daj, aby sme ťa vždy počúvali<br>" +
                            "a konali podľa tvojej vôle.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"17", "3", "Bratia a sestry, vo sviatosti krstu sme prijali Boží život ako najvzácnejší poklad. Modlime sa k Pánovi, aby sme si tento poklad starostlivo chránili a zveľaďovali.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Stoj pri všetkých biskupoch, kňazoch a misionároch a otvor srdcia ich poslucháčov, aby spoločne objavili skrytý poklad evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomáhaj všetkým, čo hľadajú správnu cestu života, aby ju našli v náuke tvojho svätého evanjelia.<br>" +
                            "<font color='#B71C1C'>3.</font> Osloboď závislých od drog, alkoholu a hazardných hier, aby žili v pravej slobode Božích detí.<br>" +
                            "<font color='#B71C1C'>4.</font> Obnov lásku v tých manželstvách, kde si manželia prestali vážiť jeden druhého, a daj, aby ich opäť spájala úcta a láska.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj, aby kresťania našej farnosti vydávali dobré svedectvo o duchovnom poklade viery, ktorý získali vo sviatosti krstu.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj nám pocítiť pravú radosť z toho,<br>" +
                            "že si za nás zomrel a vstal z mŕtvych<br>" +
                            "a tým si nám daroval večný život.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"17", "4", "Bratia a sestry, nebeské kráľovstvo bude odmenou pre tých, ktorí sa usilujú žiť spravodlivo a s čistým srdcom. Preto spoločne volajme:",
                    "<font color='#B71C1C'>(</font>Milosrdný Otče, vyslyš našu modlitbu.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby si Pán povolával v každom čase dostatok robotníkov na svoju žatvu.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za predstaviteľov štátov, aby dobre hospodárili s prírodným bohatstvom a nehľadali len vlastný zisk.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za hriešnikov, aby vo svojich srdciach pocítili ľútosť nad svojimi hriechmi a konali pravé pokánie.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za tých, ktorí sú obklopení nežičlivým prostredím, aby pod vplyvom okolia nekonali zlo.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás tu zhromaždených, aby Pán naplnil naše srdcia bratskou láskou.",
                    "Nebeský Otče, ty sám vieš, čo je pre nás najlepšie;<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "aby sme sa vyhýbali zlu<br>" +
                            "a ochotne konali dobro.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"17", "5", "Bratia a sestry, Ježiš učil ako ten, ktorý má moc. Svoje učenie potvrdzoval zázrakmi. Prosme ho s dôverou, aby aj v našom živote konal obdivuhodné skutky svojej lásky.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zmiluj sa;<br>" +
                            "<font color='#B71C1C'>alebo:</font> Kýrie, eléison.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Daruj svojej Cirkvi múdrych a svätých biskupov a kňazov.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilňuj pastierov Cirkvi, ktorým sa ubližuje ohováraním a osočovaním.<br>" +
                            "<font color='#B71C1C'>3.</font> Vzbuď v srdciach veriacich túžbu po sviatostnom spojení s tebou.<br>" +
                            "<font color='#B71C1C'>4.</font> Povzbudzuj spoločenské organizácie, aby rozvíjali charitatívnu činnosť aj v chudobných krajinách sveta.<br>" +
                            "<font color='#B71C1C'>5.</font> Osloboď od pýchy všetkých ľudí, ktorí neprijímajú učenie Cirkvi.<br>" +
                            "<font color='#B71C1C'>6.</font> Upevňuj v našej farnosti ducha svornosti, aby sme si navzájom pomáhali.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pomáhaj nám,<br>" +
                            "aby sme svedčili o tebe nielen slovami,<br>" +
                            "ale najmä každodenným životom.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"17", "6", "Bratia a sestry, svätý Ján Krstiteľ sa nebál otvorene povedať pravdu. Prosme Pána, aby sme sa podľa jeho príkladu aj my stali obhajcami pravdy a vedeli ju povedať láskavo a múdro.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Posilňuj nášho pápeža <font color='#B71C1C'>M.</font>, aby odolával útokom a osočovaniu a neohrozene spravoval svätú Cirkev.<br>" +
                            "<font color='#B71C1C'>2.</font> Naplň odvahou všetkých predstaviteľov štátnej moci, aby pod vplyvom okolia nikdy nekonali v rozpore s morálnym zákonom.<br>" +
                            "<font color='#B71C1C'>3.</font> Ochraňuj deti tých rodín, ktoré rozbila nevera rodičov, a buď im pevnou oporou.<br>" +
                            "<font color='#B71C1C'>4.</font> Vysloboď z ťažkej situácie obete obchodovania s ľuďmi a zahoj im rany tela i duše.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj manželom nášho <font color='#B71C1C'>(</font>farského<font color='#B71C1C'>)</font> spoločenstva silu žiť vo vzájomnej úcte a vernosti až do konca.",
                    "Pane Ježišu,<br>" +
                            "ty si pravda, ktorá osvecuje ľudstvo;<br>" +
                            "prosíme ťa, vyslyš naše prosby<br>" +
                            "a nauč nás, že znakom lásky nie je len mlčať,<br>" +
                            "ale aj vedieť bratsky napomenúť svojho blížneho.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"18", "A", "Bratia a sestry, zjednotení Duchom Svätým v jednej viere prosme Pána o každodenný chlieb a o chlieb pre večný život.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, nasýť nás a vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby naši biskupi ako nástupcovia apoštolov vzorne nasledovali Ježiša v pastierskej starostlivosti o duše, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby Pán daroval svojej neveste Cirkvi nové povolania na ohlasovanie evanjelia a vysluhovanie sviatostí, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby misionárom nechýbali hmotné prostriedky pre chudobných ako prejav štedrej Božej lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sa tí, ktorí sú sýti a žijú v nadbytku, dokázali podeliť s tými, ktorí potrebujú pomoc, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby dospievajúca mládež čerpala z Eucharistie pomoc na riešenie svojich ťažkostí a silu na mravný život, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Aby sme sa aktívne zapájali do slávenia liturgie a mali účasť aj na eucharistickej hostine, prosme Pána.",
                    "Vypočuj, Bože, naše modlitby<br>" +
                            "a láskavo nás obdaruj svojimi duchovnými i časnými darmi,<br>" +
                            "aby sme sa mohli zjednotiť s tebou<br>" +
                            "a naveky zotrvať v tvojej láske.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"18", "B", "Bratia a sestry, skrze Ježiša Krista, ktorý sa nám dáva za pokrm, a tak sýti hlad našich sŕdc, predložme nebeskému Otcovi svoje pokorné prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, posilni našu vieru a vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Kristus vykonáva svoju pastiersku moc cez pápeža, biskupov a kňazov; prosme o dar múdrosti a horlivosti pre všetkých pastierov Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Kristus nás obdarúva svojou láskou v Eucharistii a milosrdenstvom vo sviatosti zmierenia; prosme, aby všetci kresťania nábožne pristupovali k týmto sviatostiam.<br>" +
                            "<font color='#B71C1C'>3.</font> Kristus nám v evanjeliu zjavuje svoju múdrosť; prosme o dary Ducha Svätého pre všetkých, ktorí nám odovzdávajú Božie slovo.<br>" +
                            "<font color='#B71C1C'>4.</font> Kristus nám v sebe zjavil Otcovu lásku; prosme, aby sme si pri prijímaní Eucharistie túto lásku stále viac uvedomovali.<br>" +
                            "<font color='#B71C1C'>5.</font> Kristus je prítomný medzi nami; prosme, aby sme žili vo vzájomnej jednote a v porozumení medzi sebou.",
                    "Dobrotivý Bože,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme vždy mali plnú účasť<br>" +
                            "na svätej omši<br>" +
                            "a na prijímaní Kristovho slova i tela.<br>" +
                            "Lebo on s tebou žije a kraľuje na veky vekov."},
            {"18", "C", "Bratia a sestry, Bohu, ktorý jediný nám môže dať skutočné dobrá a naplniť všetky naše ľudské túžby, prednesme s hlbokou vierou a dôverou naše pokorné modlitby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Svätého Otca <font color='#B71C1C'>M.</font>: aby vďaka dobročinnosti mnohých ľudí mohol účinne pomáhať všetkým núdznym, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za chudobné cirkevné spoločenstvá: aby dostali hmotnú pomoc a duchovnú podporu od svojich bratov a sestier vo viere, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za tých, ktorí sa obohacujú na úkor ostatných ľudí: aby sa čo najskôr napravili a odstránili spôsobené materiálne i morálne škody, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás všetkých: aby sme nevkladali svoju nádej len do pozemských dobier, ale aby sme ich využívali na štedré skutky milosrdenstva, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: aby netrpelo naším lakomstvom a sebectvom, prosme Pána.",
                    "Bože, ty si daroval človeku zem a jej bohatstvá;<br>" +
                            "vzdávame ti za to vďaky<br>" +
                            "a prosíme ťa,<br>" +
                            "aby sme ich vedeli správne využívať<br>" +
                            "a vždy viac dôverovali tvojej prozreteľnosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"18", "1", "Bratia a sestry, svoj život žijeme dobre vtedy, keď má v ňom Boh rozhodujúce miesto. On je náš stvoriteľ, ale aj pomocník a ochranca. Preto sa na neho obráťme so svojimi prosbami.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby biskupi a kňazi spolupracovali s Bohom i navzájom medzi sebou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby zodpovedné svetové organizácie urobili všetko pre zmiernenie hladu vo svete, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby naše polia a záhrady priniesli hojnú úrodu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme nikdy nezabúdali pomáhať chudobným, chorým a tým, ktorí potrebujú pomoc, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme sa častým prijímaním Eucharistie pripravovali na cestu do večnosti, prosme Pána.",
                    "Pane, ty si zázračným spôsobom dával chlieb hladným;<br>" +
                            "prosíme ťa, vyslyš naše prosby<br>" +
                            "a daj, aby sme pôsobením tvojej milosti<br>" +
                            "a štedrosťou voči blížnym<br>" +
                            "získali večné dobrá.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"18", "2", "Bratia a sestry, prosme Krista, nášho učiteľa a spasiteľa, o dar pravej nábožnosti a vytrvalosti v dobrom.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Svätého Otca <font color='#B71C1C'>M.</font>, aby verne ukazoval cestu morálneho poriadku v osobnom a spoločenskom živote.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za tých, ktorí sa starajú o kultúru a vzdelanie, aby rešpektovali a podporovali kresťanské hodnoty v spoločnosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých veriacich, ktorí veria len formálne, aby stále viac prehlbovali svoju lásku k Bohu i človeku.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa, aby nijaké zlé slovo nevyšlo z našich úst, ale iba dobré, ktoré buduje Kristovo kráľovstvo.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa, aby sme svoje srdce nepoškvrňovali zneucťovaním Božieho, Ježišovho a Máriinho mena a hovorením neslušných slov.",
                    "Pane Ježišu Kriste,<br>" +
                            "ty si učil apoštolov pravej nábožnosti;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomáhaj aj nám kráčať do neba<br>" +
                            "po ceste pravdy a lásky.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"18", "3", "Bratia a sestry, Pán Ježiš vyzdvihol vieru kanaánskej ženy, ktorá ho vytrvalo prosila. Poučme sa od nej a s dôverou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby Boh žehnal Svätého Otca <font color='#B71C1C'>M.</font> v jeho úsilí o zjednotenie všetkých kresťanov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby sme vytrvalou modlitbou vyprosovali Božiu milosť pre spásu blížneho, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby tí, ktorých trápi zlý duch, našli pochopenie a duchovnú pomoc v Kristovej cirkvi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme vierou a príkladom života boli povzbudením pre iných, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sa v diecézach, ktoré majú nedostatok kňazov, vzbudili nové povolania, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Aby naša modlitba bola vytrvalá a aby sme s pokorou prijímali poučenia duchovných pastierov, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "podľa príkladu kanaánskej ženy<br>" +
                            "ti s vytrvalosťou predkladáme svoje prosby;<br>" +
                            "vypočuj nás<br>" +
                            "a udeľ nám všetko, čo potrebujeme pre život.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"18", "4", "Bratia a sestry, spolu s apoštolom Petrom vyznávajme svoju vieru a s dôverou sa obráťme na Pána.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby sme s pozornou mysľou a srdcom prijímali slová pápeža <font color='#B71C1C'>M.</font> a uskutočňovali, čo nám hovorí a píše, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby neveriaci uverili, že Boh poslal na svet svojho Syna ako Spasiteľa sveta, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby štátnici neprekážali šíreniu evanjelia a rešpektovali pôsobenie Cirkvi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme sa vzdelávali vo svojej viere a vedeli ju obhajovať pred svetom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby bol náš kresťanský život svedectvom o Božej dobrote, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "ty si apoštola Petra nazval blahoslaveným<br>" +
                            "za jeho vyznanie viery;<br>" +
                            "daj nám milosť vytrvať v pravej viere<br>" +
                            "a vernosti tebe po celý náš život.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"18", "5", "Bratia a sestry, najdôležitejšou úlohou pre človeka je spása jeho duše. Prosme, aby sme verne nasledovali Krista, nášho Spasiteľa, na našej životnej ceste.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby všetci pokrstení vždy konali v súlade s Kristovým učením, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby kresťania vo svete pamätali na potreby svojich núdznych bratov a sestier, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby kňazi verne vytrvali v službe za každých okolností, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby chorí a trpiaci spájali svoje utrpenia s utrpením Ježiša Krista, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby mladí pochopili, že konzumný spôsob života zotročuje ducha a zabíja lásku i nádej, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Aby si všetci členovia nášho <font color='#B71C1C'>(</font>farského<font color='#B71C1C'>)</font> spoločenstva natrvalo zachovali vieru v Boha a vernosť svätej Cirkvi, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše modlitby<br>" +
                            "a pomáhaj nám nasledovať ťa nielen v radostných chvíľach,<br>" +
                            "ale aj pri nesení každodenného kríža.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"18", "6", "Bratia a sestry, viera je drahocenný poklad, ktorý nám zveril Boh. Spoločne prosme, aby nám Pán dal väčšiu vieru.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, daj nám väčšiu vieru.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme, aby pápež <font color='#B71C1C'>M.</font> aj naďalej svojím príkladom a slovami povzbudzoval všetkých kňazov a veriacich.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme, aby Cirkev na príhovor Panny Márie aj napriek rozličným ťažkostiam napĺňala zem evanjeliovým optimizmom a radosťou.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme, aby sa predstavitelia miest a obcí nevyhýbali zodpovednosti za sociálne slabých a núdznych.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme, aby sa chorým dostávalo láskavejšej a starostlivejšej opatery zo strany zdravotníkov a príbuzných.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme, aby sme si čoraz viac uvedomovali silu spoločnej modlitby.",
                    "Pane Ježišu Kriste,<br>" +
                            "ty si prameňom našej viery;<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a daj, aby nás láska k tebe viedla k správnemu životu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"19", "A", "Bratia a sestry, každodenný život a naše slabosti nás často podnecujú, aby sme prosili Pána o pomoc. Ako zachránil Petra, tak pomôže aj nám. Preto sa spoločne modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zachráň nás a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby bola pre svet znamením Božej lásky a milosrdenstva.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za náš národ, aby mu Pán odpustil všetky previnenia a daroval mu požehnanú budúcnosť.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých, ktorí sa topia v hriechoch alkoholizmu a manželskej nevery, aby mali silu prijať pomocnú ruku nebeského Otca.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za tých, ktorí hľadajú osvieženie v prírode, aby nezabúdali ani na svoj duchovný život.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za ľudí v dôchodkovom veku, aby nestrácali zmysel života a vzájomne sa povzbudzovali v spoločenstve a v modlitbe.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za seba samých, aby sme zvlášť v ťažkých chvíľach nestratili dôveru v Ježišovu pomoc.",
                    "Pane Ježišu Kriste,<br>" +
                            "ty si zachránil apoštola Petra;<br>" +
                            "vypočuj nás,<br>" +
                            "zľutuj sa nad nami<br>" +
                            "a pomáhaj nám v ťažkostiach nášho života.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"19", "B", "Bratia a sestry, Ježiš Kristus nám pri slávení svätej omše ponúka svoje telo za duchovný pokrm. Najskôr nás však pozýva zjednotiť sa v modlitbe. Prosme ho spoločne.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, daj nám chlieb z neba a vypočuj naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa za Svätého Otca <font color='#B71C1C'>M.</font>, za nášho diecézneho biskupa <font color='#B71C1C'>M.</font> a všetkých biskupov a kňazov, aby nám ochotne ponúkali tvoj pokrm zo stola Božieho slova a Eucharistie.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, prosíme ťa za predstaviteľov národov, aby sa usilovali o odstránenie každého zla z ľudskej spoločnosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, prosíme ťa za tých, ktorí prežívajú ťažké chvíle života, aby čerpali posilu z viery v teba a z prijímania Eucharistie.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, prosíme ťa za naše farské spoločenstvo, aby sme pamätali na tvoje slová o potrebe prijímania nebeského chleba, a tak upevňovali medzi sebou jednotu a bratskú lásku.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prosíme ťa za našich zosnulých <font color='#B71C1C'>(M.)</font>, ktorí prijímali tvoje sviatosti, aby si ich prijal do svojho kráľovstva.",
                    "Pane Ježišu,<br>" +
                            "ty nás sýtiš nebeským darom Eucharistie;<br>" +
                            "daj, nech sa týmto pokrmom<br>" +
                            "stávame stále lepšími ľuďmi a kresťanmi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"19", "C", "Bratia a sestry, svet na nás hľadí a čaká, či dokážeme obhájiť svoju vieru a zachovať si ju. Obráťme sa s dôverou na Boha, veď naša viera je jeho dar. Buďme za ňu vďační a prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Príď kráľovstvo tvoje, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme Pána, aby viera Cirkvi bola vždy pevná a živá a aby sme pochopili, že jedinou cestou je on sám.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme Pána, aby národy žili v pokoji a aby k nim prišlo Božie kráľovstvo.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme Pána, aby sme mali bedrá opásané a lampy zažaté a očakávali ho, keď príde a zaklope.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme Pána, aby sprevádzal svojím požehnaním rodičov, učiteľov a vychovávateľov, ktorým vďačíme za odovzdanie daru viery.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme Pána, aby si členovia nášho <font color='#B71C1C'>(</font>farského<font color='#B71C1C'>)</font> spoločenstva cez almužnu a pomoc núdznym získavali poklad v nebi, kde ho nič nezničí.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme Pána, aby zomierajúci boli pripravení na stretnutie s ním a očakávali jeho príchod.",
                    "Bože, ty nás poúčaš,<br>" +
                            "aby sme bdeli a očakávali druhý príchod tvojho Syna;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj nám bedlivé srdce,<br>" +
                            "aby sme patrili medzi blahoslavených.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"19", "1", "Bratia a sestry, na začiatku nového pracovného týždňa prosme Pána o pomoc a milosti potrebné pre náš každodenný život.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Svätého Otca <font color='#B71C1C'>M.</font> a za celú Kristovu Cirkev, aby sme cez nich spoznávali Krista, pravého Boha i človeka.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za svetských predstaviteľov, aby viedli ľud k spoločnému dobru a pomáhali mu aj na ceste do večnej vlasti.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za rodičov, aby svoje deti vychovávali k zodpovednosti v občianskych a cirkevných záležitostiach.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za seba, aby sme ako Boží synovia a dcéry nepohoršovali svojím správaním iných ľudí.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby ich Pán prijal do svojho kráľovstva a dal im účasť na večnej blaženosti.",
                    "Pane Ježišu,<br>" +
                            "ty nám dnes hovoríš o svojej smrti a zmŕtvychvstaní<br>" +
                            "a vyzývaš nás zodpovedne žiť;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme ako synovia a dcéry nebeského Otca<br>" +
                            "vydávali dobré svedectvo o tebe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"19", "2", "Bratia a sestry, Ježiš Kristus, Dobrý pastier, nás zhromažďuje vo svojej Cirkvi; prosme za seba i za celú Cirkev.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za biskupov, kňazov a veriaci ľud, aby tvorili pevnú jednotu so Svätým Otcom, ktorého Pán vyvolil za najvyššieho pastiera svojej Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za všetkých ľudí, aby vo svojom vnútri počuli hlas Dobrého pastiera, ktorý ich volá k sebe.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých, ktorí sa odlúčili od Kristovej Cirkvi, aby spoznali pravých pastierov a vrátili sa do jej náručia.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za tých, ktorí svojím životom dávajú zlý príklad maličkým, aby začali nový život v zhode s tvojou vôľou.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za deti, aby boli povzbudené príkladným kresťanským životom a spoznávali krásu spoločenstva kresťanov.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za zomrelých <font color='#B71C1C'>(M.)</font>, ktorí žili v Kristovi, aby boli pripočítaní k zástupu svätých v nebi.",
                    "Pane Ježišu,<br>" +
                            "ty si prišiel, aby si nám daroval život;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomáhaj nám vytrvať v spoločenstve Cirkvi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"19", "3", "Bratia a sestry, Pán Ježiš prisľúbil mimoriadne milosti tým, ktorí sa modlia spoločne. V dôvere, že nás vyslyší, prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa o požehnanie pre Svätého Otca <font color='#B71C1C'>M.</font> a všetkých biskupov i kňazov.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za verejných predstaviteľov, aby spravodlivo riešili nedorozumenia v spoločnosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za kresťanov zhromaždených v tvojom mene, aby si uvedomovali, že si prítomný medzi nimi.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za seba samých, aby sme sa ochotne modlili za tých, ktorí sa vzdialili z nášho spoločenstva.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa aj za zosnulých, ktorí sú pre naše chyby v očistci; prijmi ich k sebe do svojho kráľovstva.",
                    "Pane Ježišu, ty si s nami,<br>" +
                            "keď sme zhromaždení v tvojom mene;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a príď nám na pomoc v našich slabostiach.<br>" +
                            "Ty žiješ a kraľuješ na veky vekov."},
            {"19", "4", "Bratia a sestry, Pán Ježiš nás žiada odpustiť nie sedemkrát, ale sedemdesiatsedemkrát. Prosme ho o odpustenie našich hriechov a prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za svätú Cirkev, aby nás povzbudzovala milovať blížnych a navzájom si odpúšťať.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za národy sveta, aby medzi nimi zavládlo porozumenie, pokoj a svornosť.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za rozbité rodiny, aby si príbuzní odpustili a znovu žili v zhode a láske.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za seba samých, aby sme si dokázali navzájom odpustiť všetky krivdy a neprichádzali k Pánovmu oltáru s hriechom nenávisti.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa na našu farskú rodinu, aby sme prinášali lásku tam, kde je nenávisť.",
                    "Pane Ježišu Kriste,<br>" +
                            "bol si nám podobný vo všetkom okrem hriechu;<br>" +
                            "odstráň z nášho srdca pýchu<br>" +
                            "a egoizmus nahraď láskou, akú máš ty k nám,<br>" +
                            "keď nám odpúšťaš naše hriechy.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"19", "5", "Bratia a sestry, modlime sa spoločne za Cirkev a za rodiny našej farnosti <font color='#B71C1C'>(</font>našich farností<font color='#B71C1C'>)</font>, aby čerpali silu pre svoje poslanie z Kristovho kríža, na ktorom nám zažiarila jeho láska.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa o požehnanie pre Svätého Otca <font color='#B71C1C'>M.</font> v jeho úsilí o obnovu Cirkvi, rodín a manželstiev.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za deti a mládež, aby v rodinách videli príklad šťastného života.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za rozvrátené manželstvá v našej krajine, aby sa znovu zjednotili a obnovili svoju lásku.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za tých, ktorí nežijú v manželskom zväzku, aby svoj život venovali aj službe blížnym.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa za našich príbuzných, ktorí nás už predišli do večnosti, aby dosiahli večnú spásu a prebývali v nebeskom príbytku.",
                    "Pane Ježišu,<br>" +
                            "ty nám dávaš dostatok duchovných prostriedkov<br>" +
                            "na dosiahnutie spásy;<br>" +
                            "prosíme ťa, vyslyš naše prosby<br>" +
                            "a daj, aby sme vždy čerpali z týchto tvojich darov,<br>" +
                            "a tak raz dosiahli spoločenstvo s tebou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"19", "6", "Bratia a sestry, Pán Ježiš požehnával deti a modlil sa za ne. Aj my sa spoločne modlime za deti, ako aj za celú Cirkev a prednesme Bohu Otcovi svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, prosíme ťa za Cirkev, aby si neustále uvedomovala svoje poslanie: učiť, chrániť, potešovať a posilňovať všetkých veriacich.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, prosíme ťa za tých, ktorí v spoločnosti zastávajú právo nenarodených detí na život, veď ich v tomto úsilí svojím Svätým Duchom.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, prosíme ťa za rodičov, aby vzájomnou láskou vytvárali priaznivé prostredie pre rast a výchovu svojich detí.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, prosíme ťa za všetky deti našej farnosti, aby spolu so svojimi rodičmi prichádzali do tvojho domu a k tvojmu oltáru.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, prosíme ťa za starých a chorých členov našich rodín, aby cítili blízkosť a starostlivosť svojich príbuzných.",
                    "Bože, tvoj Syn sa narodil v rodine;<br>" +
                            "na príhovor Panny Márie<br>" +
                            "vypočuj naše prosby,<br>" +
                            "žehnaj naše rodiny<br>" +
                            "a ochraňuj našich najmenších.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "A", "Bratia a sestry, Pán často skúša našu vieru i dôveru v neho. To je znak, že nám chystá ešte väčšie milosti. Prosme ho, aby sme sa vedeli vytrvalo a vrúcne modliť.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev, mystické Kristovo telo: aby žila v očakávaní radostného stretnutia s naším Pánom a Spasiteľom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za tých, ktorí sa vytrvalo modlia: aby dosiahli, o čo prosia, a aby im Boh štedro udelil svoju pomoc a požehnanie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za chorých a trpiacich: aby boli trpezliví v súžení a vedeli svoje ťažkosti obetovať pre dobro Cirkvi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás tu zhromaždených: aby nám Boh daroval silu trpezlivo znášať všetky neúspechy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>, ktorí nás predišli do večnosti: aby videli tvár nebeského Otca a naveky sa s ním radovali, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme ľuďom zvestovali tvoju radostnú zvesť<br>" +
                            "a sami dokázali žiť podľa tvojej vôle.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "B", "Bratia a sestry, Pán Ježiš nás chce sýtiť svojím telom a krvou, aby sme mali v sebe život a spolu s ním mohli žiť večne. S dôverou predstúpme pred neho a spoločne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za biskupov, kňazov a všetkých veriacich: aby čerpali silu z Oltárnej sviatosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých ľudí: aby sa v nich vzmáhala túžba po prijímaní Kristovho tela v Eucharistii, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za rodičov: aby privádzali svoje deti k Eucharistii, ktorá je žriedlom všetkých milostí a prameňom spásy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za chorých a trpiacich, ktorých trápia rozličné choroby: aby sa na tele i na duši posilňovali sviatosťou lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za náš národ: aby sa zjednotil vo viere, ktorú prijal od svojich predkov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Za nás samých: aby naše srdcia naplnila vďačnosť za dar Eucharistie, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby a daj,<br>" +
                            "aby sme si chránili veľký dar Najsvätejšej sviatosti,<br>" +
                            "ktorý si nám odovzdal pred svojím umučením.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"20", "C", "Bratia a sestry, bohoslužba slova dnešnej nedele nás pozýva, aby sme mali svoj zrak upretý na Ježiša, ktorý je pôvodca a zavŕšiteľ viery. Obráťme sa teda na neho a spoločne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, ochraňuj Svätého Otca <font color='#B71C1C'>M.</font> a všetkých biskupov, aby mohli po celom svete nerušene šíriť posolstvo dobrej zvesti.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, daj politikom a štátnikom múdrosť, keď rozhodujú o osudoch národov.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, stoj pri všetkých rodinách, v ktorých chýba náboženská jednota.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, daruj svojim veriacim nábožného ducha a srdce, ktoré bude ochotné vždy pomáhať.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, posilni vernosť tých, ktorí sú prenasledovaní pre vieru v teba.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane Ježišu, pomáhaj veriacim našej farnosti modlitbou a skutkami lásky svedčiť o viere v teba.",
                    "Pane Ježišu Kriste,<br>" +
                            "ty si nás vykúpil svojou smrťou a zmŕtvychvstaním;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a daj, aby sme sa nikdy neodklonili od cesty viery.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"20", "1", "Bratia a sestry, každý človek je povolaný na svätosť a na dokonalosť v láske. Prosme nášho Pána, aby sme verne odpovedali na toto povolanie.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj nám pochopiť, že kresťanská dokonalosť spočíva v láske k tebe a k blížnym.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilni tých, ktorí žijú v obave zo straty zamestnania, aby mali dôveru, že im pomôžeš.<br>" +
                            "<font color='#B71C1C'>3.</font> Veď diakonov a tých, ktorí vykonávajú služby v Cirkvi, aby ich horlivosť bola príkladom pre iných.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj nám vernosť v maličkostiach, aby sme ti slúžili ako dobrí správcovia, a tak prijali tvoj dar večného života.<br>" +
                            "<font color='#B71C1C'>5.</font> Priveď tých, s ktorými sme sa stretávali pri slávení Eucharistie a už nás predišli do večnosti, k účasti na nebeskej liturgii.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sa tvoj ľud stal požehnaním pre celý svet.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"20", "2", "Bratia a sestry, prednesme svoje prosby nášmu Pánovi, ktorý sa pre nás stal chudobným, aby sme sa my jeho chudobou obohatili. S dôverou sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za bohoslovcov: aby sa horlivo prehlbovali v duchovnom živote a raz sa stali dobrými kňazmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za snúbencov: aby sa ich životy naplnili láskou, dôverou a porozumením, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za birmovancov: aby svoje srdcia pripravovali na prijatie darov Ducha Svätého, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za prvoprijímajúce deti: aby vytrvali vo vernosti eucharistickému Kristovi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu zhromaždených: aby sme sa dokázali zrieknuť všetkého, čo nám prekáža na ceste do Božieho kráľovstva, prosme Pána.",
                    "Pane Ježišu Kriste,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pomáhaj nám žiť tak,<br>" +
                            "aby sme si zachovali slobodu srdca<br>" +
                            "a konaním dobra vošli do tvojho kráľovstva.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"20", "3", "Bratia a sestry, Boh je väčší ako naša spravodlivosť, túži priviesť každého človeka k plnosti života a bohato ho obdarovať. Spoločne sa k nemu modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože Otče, pomáhaj svojej Cirkvi, aby veľkoryso prijímala každého, kto sa chce vrátiť k tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Osvieť každého človeka, aby pochopil, že práca má len vtedy plnú hodnotu, keď je oslavou teba a službou blížnemu.<br>" +
                            "<font color='#B71C1C'>3.</font> Daruj rozhodnosť a odhodlanosť všetkým, ktorí váhajú na ceste k tebe.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, priveď dobrovoľne nezamestnaných k vedomiu, že svojou prácou môžu vytvárať spoločenské hodnoty, a daj im ochotu pracovať.<br>" +
                            "<font color='#B71C1C'>5.</font> Posilňuj nás všetkých, aby sme vytrvali v tvojej službe aj vo chvíľach pokušenia a únavy.<br>" +
                            "<font color='#B71C1C'>6.</font> Otče, ujmi sa našich zomrelých <font color='#B71C1C'>(M.)</font> a daj, nech sa s nimi stretneme pri nebeskej hostine.",
                    "Bože Otče,<br>" +
                            "vypočuj naše prosby a nedovoľ,<br>" +
                            "aby sme premárnili niečo z tvojich darov;<br>" +
                            "veď bez teba a tvojej pomoci nezmôžeme nič,<br>" +
                            "čo je hodné tvojej večnej odmeny.<br>" +
                            "O to ťa prosíme skrze Krista, nášho Pána."},
            {"20", "4", "Bratia a sestry, Pán Ježiš nás všetkých odmení za dobro, ktoré konáme blížnym, a za vernosť jeho evanjeliu. Prednesme mu svoje prosby a s úprimným srdcom sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za pápeža, biskupov a kňazov: aby verne, ochotne a s radosťou pracovali v Kristovej vinici a privádzali ľudí k nemu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za predstaviteľov štátov: aby chránili ľudský život od počatia až po prirodzenú smrť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za tých, ktorí sa pripravujú na manželstvo, kňazstvo a rehoľný život: aby zostali napriek rôznym ťažkostiam verní až do konca, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za robotníkov: aby obetavo pracovali a za svoju prácu dostali spravodlivú odmenu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: aby sme boli vnímaví na Boží hlas, ktorý nás pozýva mať účasť na eucharistickej hostine, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme pamätali na to,<br>" +
                            "že ty nám dávaš všetko, čo potrebujeme pre život.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"20", "5", "Bratia a sestry, Boh sa dáva poznať tým, ktorí ho nadovšetko milujú a preukazujú dobro svojim blížnym. Preto prosme Pána, aby nás naučil správne milovať.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zmiluj sa.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj, aby Cirkev vyznávala evanjeliovú lásku nielen slovami, ale aby bola aj jej živým príkladom.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilňuj zasvätené osoby, aby boli vzorom kresťanskej dokonalosti a svetlom pre svet.<br>" +
                            "<font color='#B71C1C'>3.</font> Udeľ našim žiakom a študentom usilovnosť v poznávaní náboženských právd a kresťanskej náuky.<br>" +
                            "<font color='#B71C1C'>4.</font> Ochraňuj tých, ktorým chýba rodinné zázemie, a bohato im nahraď to, čo nedostali od najbližších.<br>" +
                            "<font color='#B71C1C'>5.</font> Osvecuj náš rozum a upevňuj našu vôľu, aby sme sa vo všetkých pochybnostiach obracali k tebe.<br>" +
                            "<font color='#B71C1C'>6.</font> Daj, nech naši zosnulí <font color='#B71C1C'>(M.)</font> naveky prebývajú v nebi, a nám daj vytrvalosť v modlitbách za zomrelých.",
                    "Bože Otče,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a posilňuj nás v každodennom úsilí o svätosť.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "6", "Bratia a sestry, s Pannou Máriou a so všetkými svätými prosme Pána za tých, ktorí sa spoliehajú na naše modlitby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za kňazov: aby nestratili ducha zbožnosti a horlivo slúžili Božiemu ľudu až do konca, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za sociálnych pracovníkov: aby naplnení Božou láskou ochotne pracovali pre tých, ktorí to najviac potrebujú, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za učiteľov: aby pri vyučovaní žiakov a študentov nezabúdali ani na vlastnú formáciu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za mládež našej farnosti: aby dokázala dať prednosť tomu, čo jej prospieva v rozvoji duchovného života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu zhromaždených: aby sme mali podľa vzoru Panny Márie ducha služby v rodinnom i spoločenskom živote, prosme Pána.",
                    "Nebeský Otče,<br>" +
                            "tvoj Syn nám dal príklad služby bratom a sestrám<br>" +
                            "v pokore a poníženosti;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pomôž nám nasledovať ho tak,<br>" +
                            "aby sme skutočne patrili do tvojho kráľovstva.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "A", "Bratia a sestry, Pán Ježiš ustanovil apoštola Petra za skalu a základ Cirkvi a dal mu plnú moc nad všetkými veriacimi. Prosme Pána o dar poslušnosti a oddanosti jeho svätej Cirkvi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, žehnaj nášho pápeža <font color='#B71C1C'>M.</font> a obdaruj ho láskou a úctou všetkých veriacich.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomáhaj štátnikom a politikom, aby chápali svoje postavenie ako službu ľuďom na celom svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Pamätaj na tých, ktorí nezabúdajú na chudobných a núdznych, a štedro ich odmeň duchovnými darmi.<br>" +
                            "<font color='#B71C1C'>4.</font> Stoj pri tých, ktorí dnes nemohli prísť na slávenie Eucharistie: slabých posilni, chorých uzdrav a slúžiacich obdaruj láskou.<br>" +
                            "<font color='#B71C1C'>5.</font> Upevňuj nás vo viere, aby sme vždy a všade vyznávali, že ty si Kristus, Syn Boží.",
                    "Pane, ty si postavil Cirkev na Petrovej skale;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a prenikni naše srdcia takou vierou,<br>" +
                            "akú mali apoštoli,<br>" +
                            "a daj nám radosť z toho, že patríme do tvojej Cirkvi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"21", "B", "Bratia a sestry, s radosťou chceme slúžiť Pánovi, veď on je náš Boh a on má slová večného života. Prosme ho o dar vytrvalosti v jeho službe.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, udeľ všetkým kresťanom ducha oddanosti a vernosti učiteľskému úradu Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Vlož do sŕdc všetkých ľudí túžbu poznať pravdu a ukáž im cestu k tebe.<br>" +
                            "<font color='#B71C1C'>3.</font> Obráť k sebe všetkých, čo ťa pre pýchu a iné hriechy opustili.<br>" +
                            "<font color='#B71C1C'>4.</font> Pomôž všetkým, ktorí hľadajú útechu v alkohole a drogách.<br>" +
                            "<font color='#B71C1C'>5.</font> Posilni kresťanských manželov, aby videli v tvojom tajomnom spojení s Cirkvou obraz a prameň opravdivej lásky.<br>" +
                            "<font color='#B71C1C'>6.</font> Vypočuj všetkých, ktorí prichádzajú do chrámu hľadať útechu vo svojich starostiach a problémoch.",
                    "Pane Ježišu,<br>" +
                            "ty máš slová večného života<br>" +
                            "a my sme uverili a vyznávame,<br>" +
                            "že ty si Kristus, Boží Syn;<br>" +
                            "vyslyš naše pokorné prosby<br>" +
                            "a zachovaj nás vo svojej láske<br>" +
                            "teraz i na veky vekov."},
            {"21", "C", "Bratia a sestry, do Božieho kráľovstva sa vchádza tesnou bránou. Prosme Pána za spásu celého sveta i za nás kresťanov, aby sme rástli v náboženskej horlivosti.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby dobrý príklad kňazov a veriacich mnohým ukazoval cestu k Bohu.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, prosíme ťa za národy celého sveta, aby odstraňovaním bezprávia pripravovali príchod tvojho kráľovstva.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, chráň od pokušení a hriechov všetkých, čo sú na rekreačných miestach, aby sa vrátili osviežení na tele i na duši.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, pomôž ľuďom, ktorých chudoba donútila žobrať, kradnúť alebo privyrábať si prostitúciou, a prinavráť im ľudskú dôstojnosť.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, zbav nás len vonkajšej a zvykovej nábožnosti a daj, aby sme svoje náboženstvo brali vždy vážne.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane Ježišu, nauč našich rodičov vychovávať svoje deti dobrým príkladom a spoločnou modlitbou v rodine.",
                    "Pane, vyslyš naše prosby<br>" +
                            "a posilňuj nás,<br>" +
                            "aby sme boli kresťanmi nielen podľa mena,<br>" +
                            "ale aj svojím opravdivým kresťanským životom.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"21", "1", "Bratia a sestry, Pán Ježiš nám ukazuje cestu do nebeského kráľovstva. Prosme ho s dôverou, aby sme sa stali hodnými jeho prisľúbení.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daruj cirkevným predstaveným otvorenosť srdca, aby múdro vykonávali svoje poslanie.<br>" +
                            "<font color='#B71C1C'>2.</font> Ochraňuj predstaviteľov národov, aby pamätali na zachovanie svetového mieru a pokoja na celej zemi.<br>" +
                            "<font color='#B71C1C'>3.</font> Povzbudzuj tých, ktorí stavajú kresťanské chrámy, aby svojím dielom prispievali k jednote veriacich a svojím umením dvíhali naše srdcia k tebe.<br>" +
                            "<font color='#B71C1C'>4.</font> Posilňuj tých, ktorí trpia chorobnou úzkosťou a depresiami, aby v tebe našli pravý pokoj a nádej.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás štedrosti, aby sme sa vedeli deliť so svojimi blížnymi.<br>" +
                            "<font color='#B71C1C'>6.</font> Prijmi našich zomrelých <font color='#B71C1C'>(M.)</font> do večného domova v nebi, kde budú naveky hľadieť na tvoju oslávenú tvár.",
                    "Pane Ježišu,<br>" +
                            "prosíme ťa, vypočuj naše modlitby<br>" +
                            "a daj, aby sme sa každým dňom<br>" +
                            "približovali k večnej blaženosti,<br>" +
                            "ktorú nám spolu so svojím Otcom sľubuješ.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"21", "2", "Bratia a sestry, Božie slovo nás pozýva na plné poznanie pravdy. S dôverou sa obráťme na Boha, ktorý je večnou pravdou, a prosme ho.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, požehnávaj Svätého Otca <font color='#B71C1C'>M.</font>, aby Cirkev spravoval spravodlivo, múdro a verne.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, vštep do sŕdc svetských predstaviteľov túžbu po premáhaní chamtivosti a sebectva.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, stoj pri tých, ktorí sa starajú o chorých, aby ich obeta našla odmenu v tvojej otcovskej náruči.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, pomáhaj nám, aby sme nežili len povrchný život, ale aby sme s hlbokou vierou prežívali všetko, čo nám z lásky dávaš.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, vo svojej láske prijmi našich zomrelých <font color='#B71C1C'>(M.)</font>, zbav ich ťarchy trestov za hriechy a obdaruj ich večnou blaženosťou.",
                    "Najláskavejší Otče,<br>" +
                            "ďakujeme ti,<br>" +
                            "že ťa môžeme spoznávať v tvojom slove;<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj naše prosby,<br>" +
                            "veď nás k poznávaniu pravého dobra<br>" +
                            "a k uskutočňovaniu pravej kresťanskej viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "3", "Bratia a sestry, Pán Ježiš nás posolstvom evanjelia usmerňuje na cestu pravej lásky. Nasledujme ho a spoločne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby všetci biskupi a kňazi vždy pamätali na svoje sľuby a záväzky dané pri vysviacke, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby národy vzájomne rešpektovali svoje kultúrne a historické dedičstvo, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby pokrytectvo a neprávosť vymizli z verejného, pracovného i rodinného života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme nestavali svoju vieru na vonkajších prejavoch, ale na vnútorných hodnotách, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme neposudzovali svojich blížnych, ale vzájomne sa povzbudzovali ku konaniu dobra, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "prosíme ťa, prijmi naše modlitby,<br>" +
                            "vypočuj ich<br>" +
                            "a dopraj nám,<br>" +
                            "aby sme sa tešili zo spoločenstva v tvojej Cirkvi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"21", "4", "Bratia a sestry, vždy máme byť pripravení na príchod Pána. Pozdvihnime svoje mysle i srdcia a prejavme Pánovi Ježišovi už teraz svoju pripravenosť.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj, aby všetci kresťania boli pripravení na tvoj slávny príchod.<br>" +
                            "<font color='#B71C1C'>2.</font> Prinášaj všetkým národom trvalý pokoj a vzájomné zmierenie.<br>" +
                            "<font color='#B71C1C'>3.</font> Odpusť všetkým, ktorí urážajú tvoje sväté meno a ešte nenašli cestu k tebe.<br>" +
                            "<font color='#B71C1C'>4.</font> Priveď šoférov k poznaniu, že egoizmus a vystatovačnosť môžu spôsobiť vážne tragédie.<br>" +
                            "<font color='#B71C1C'>5.</font> Posilňuj nás v úsilí pravidelne pristupovať k sviatostiam a žiť príkladný kresťanský život.<br>" +
                            "<font color='#B71C1C'>6.</font> Prijmi k sebe našich zomrelých <font color='#B71C1C'>(M.)</font>, ktorým sa už naplnil čas pozemského života.",
                    "Pane Ježišu,<br>" +
                            "ty si naším jediným Pánom;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomáhaj nám uskutočňovať evanjelium<br>" +
                            "v každodennom živote,<br>" +
                            "aby si bol našou odmenou naveky.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"21", "5", "Bratia a sestry, túžime sa podobať múdrym pannám z podobenstva, ktoré pripravené čakali na príchod ženícha. Modlime sa s úprimným srdcom k nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, daj, aby tvoja Cirkev s odvahou a radosťou kráčala v ústrety svojmu Ženíchovi.<br>" +
                            "<font color='#B71C1C'>2.</font> Zmierni napätia medzi národmi a štátnikom pomôž budovať spravodlivý a mierumilovný svet.<br>" +
                            "<font color='#B71C1C'>3.</font> Posilni ľudí žijúcich bez zmyslu života a daruj im svetlo nádeje.<br>" +
                            "<font color='#B71C1C'>4.</font> Stoj pri trpiacich a umierajúcich, nech nestrácajú vieru a s nádejou očakávajú stretnutie s tebou.<br>" +
                            "<font color='#B71C1C'>5.</font> Potešuj nás v trápeniach, aby sme neklesali na duchu a stále ti boli verní.<br>" +
                            "<font color='#B71C1C'>6.</font> Obdaruj našich zomrelých <font color='#B71C1C'>(M.)</font> vencom nebeskej slávy.",
                    "Bože a Otče náš,<br>" +
                            "každým dňom a hodinou sa blížime k tebe;<br>" +
                            "prosíme ťa, vypočuj naše modlitby<br>" +
                            "a pomáhaj nám pripraviť sa<br>" +
                            "na stretnutie s tebou v nebi.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "6", "Bratia a sestry, od Boha sme dostali mnohé milosti a cenné dary. Zveľaďujme ich a spoločne prosme o to, aby sme zostávali dobrými a vernými Božími deťmi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, dávaj kňazom svojej Cirkvi odvahu povzbudzovať veriacich k správnemu používaniu svojich talentov.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby sa prírodné bohatstvo našej planéty využívalo rozumne a s ohľadom na budúce generácie.<br>" +
                            "<font color='#B71C1C'>3.</font> Pobádaj všetkých, ktorí majú obavu používať svoje schopnosti, aby ich štedro využívali pre dobro iných.<br>" +
                            "<font color='#B71C1C'>4.</font> Nauč nás odpúšťať krivdy a daj nám silu milovať aj tých, ktorí nám ublížili.<br>" +
                            "<font color='#B71C1C'>5.</font> Voveď našich zomrelých <font color='#B71C1C'>(M.)</font> do radosti domova v nebi, kde už niet plaču ani bolesti.",
                    "Najláskavejší Otče,<br>" +
                            "ty sa o nás staráš<br>" +
                            "a zahŕňaš nás mnohými dobrodeniami;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a pomáhaj nám zveľaďovať všetko,<br>" +
                            "čo pochádza od teba.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "A", "Bratia a sestry, Kristus nás volá, aby sme ho nasledovali, a ponúka nám prostriedky spásy. Preto ho pokorne prosme, aby sme boli jeho pravými učeníkmi.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev: aby ukazovala svetu skutočný príklad nasledovania Krista, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za maloverných a bojazlivých kresťanov: aby v kríži Božieho Syna našli odvahu verne ho nasledovať, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za deti a mládež, pre ktorých sa začína nový školský rok: aby učenie a štúdium neboli pre nich trápením, ale užitočným poznávaním pravdy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za trpiacich: aby si uvedomovali, že majú osobitné miesto v Cirkvi a v ľudskej spoločnosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: aby sme pre hmotné dobrá nestratili večný život, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme ako kresťania<br>" +
                            "celú svoju činnosť premieňali na duchovnú obetu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"22", "B", "Bratia a sestry, Boh, ktorý je plný dobra, poslal svojho Syna, aby nás zachránil a bol nám cestou, pravdou a životom. S dôverou sa na neho obráťme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosíme ťa, Pane, za nášho pápeža <font color='#B71C1C'>M.</font>, biskupa <font color='#B71C1C'>M.</font> i za všetkých kňazov: posilňuj ich svojím Duchom, aby evanjelium hlásali nielen slovom, ale aj životom.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za tých, ktorí spravujú národy: daj im pravú múdrosť, aby svoje úlohy vykonávali spravodlivo a s láskou.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za všetkých, ktorí svojím hriešnym životom škodia rozvoju kresťanskej viery: obráť ich a priveď na cestu pokánia, aby neboli na pohoršenie ostatným.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za matky, ktoré podstúpili umelé ukončenie tehotenstva: aby neklesali na duchu, úprimne ľutovali svoj čin a snažili sa žiť podľa tvojho slova.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa za našich zomrelých <font color='#B71C1C'>(M.)</font>, ktorí už prešli bránou smrti: privítaj ich vo svojom kráľovstve, aby dosiahli večnú slávu.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a daj, aby sme ťa uctievali nielen ústami,<br>" +
                            "ale aj srdcom<br>" +
                            "a aby sme svojím životom svedčili<br>" +
                            "o evanjeliu tvojho Syna Ježiša Krista,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"22", "C", "Bratia a sestry, Boh odmieta pýchu ľudí a pokorným dáva svoju milosť. Prosme nášho Pána, ktorý je vzorom a učiteľom pokory, aby vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, obdaruj nás pokorou srdca.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, prosíme ťa za služobníkov Cirkvi: aby svoju vznešenú úlohu vykonávali v duchu služby a s láskou.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, prosíme ťa za tých, ktorí spravujú národy: aby hľadali a napomáhali záujmy všeobecného dobra a pokoja.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, prosíme ťa za tých, ktorí si zakladajú na svojom vzdelaní a postavení: aby hľadali múdrosť srdca a pokoru ducha.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, prosíme ťa za matky postihnutých detí: aby boli silné v nesení kríža a vo svojich deťoch videli samého teba.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa, Pane, za seba samých: pretvor naše srdcia podľa svojho tichého a pokorného srdca.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosíme ťa aj za našich zosnulých <font color='#B71C1C'>(M.)</font>: prijmi ich do spoločenstva svojich svätých.",
                    "Pane Ježišu, vyslyš naše pokorné prosby<br>" +
                            "a nauč nás ochotne slúžiť úbohým, chorým a opusteným;<br>" +
                            "zbav nás pýchy a namyslenosti,<br>" +
                            "aby sme mohli získať tvoju milosť a večnú blaženosť.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"22", "1", "Bratia a sestry, Pán Ježiš nám prináša radostnú zvesť a napĺňa slová Písma. Prosme ho, aby sme ho vždy prijímali ako Božieho Syna.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby všetci veriaci preukazovali úctu Svätému Otcovi <font color='#B71C1C'>M.</font> a modlili sa na jeho úmysly.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomáhaj politikom, aby vždy mali na zreteli dobro svojej krajiny a nezabúdali ani na dobro celého sveta.<br>" +
                            "<font color='#B71C1C'>3.</font> Potešuj zajatých a utláčaných a zjav sa im v plnosti svojej dobroty.<br>" +
                            "<font color='#B71C1C'>4.</font> Posilni tých, ktorí sú šikanovaní na pracovisku, aby našli dôstojné prijatie svojej osobnosti a naplnenie svojich ľudských i duchovných potrieb.<br>" +
                            "<font color='#B71C1C'>5.</font> Pretvor naše srdcia, aby sme všetky tvoje slová prijímali s pokorou a odovzdanosťou.<br>" +
                            "<font color='#B71C1C'>6.</font> Zavŕš pozemské putovanie našich zomrelých <font color='#B71C1C'>(M.)</font> príchodom medzi tvojich vyvolených vo večnom kráľovstve.",
                    "Pane Ježišu Kriste,<br>" +
                            "prebývaš medzi nami v Eucharistii;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj nám radosť z tvojej prítomnosti.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"22", "2", "Bratia a sestry, Pán Ježiš má moc víťaziť nad zlými duchmi. S vierou, že on je Boží Svätý, modlime sa s dôverou.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, posilňuj všetkých biskupov a kňazov, aby s radosťou šírili tvoje slovo a podľa neho aj žili.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby sa vo svete urovnali všetky medzinárodné konflikty a aby zlo ustúpilo pravde a spravodlivosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Obráť všetkých, ktorí sú lakomí, pyšní a nosia v sebe nenávisť, aby ich tvoja láska uzdravila a vyslobodila z pút zlého ducha.<br>" +
                            "<font color='#B71C1C'>4.</font> Posilni tých, ktorí trpia duševnými chorobami, a daruj im zdravie tela, ducha i duše.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás pozorne počúvať Božie slovo a úprimne veriť v jeho moc a silu.<br>" +
                            "<font color='#B71C1C'>6.</font> Voveď našich zosnulých <font color='#B71C1C'>(M.)</font> do večného svetla, v ktorom prebývaš.",
                    "Pane Ježišu,<br>" +
                            "tvoja moc je nad všetkým a všetko preniká;<br>" +

                            "prosíme ťa, vypočuj naše modlitby<br>" +
                            "a daruj nám odvahu a silu<br>" +
                            "uskutočňovať tvoje učenie.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"22", "3", "Bratia a sestry, Boží Syn nás svojou smrťou zachránil od večnej tmy a vedie nás do svetla Božieho kráľovstva. S vďakou sa modlime k Bohu Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za nášho biskupa <font color='#B71C1C'>M.</font>: aby svoje poslanie ohlasovať evanjelium vykonával zodpovedne a s láskou.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za predstaviteľov štátov: aby starostlivosť o zdravie človeka stála na popredných miestach ich verejného záujmu.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých, ktorí sa starajú o chorých: aby popri svojej práci nezabúdali na to, že Boh je najlepší a najstarostlivejší lekár.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za testiné a svokry: aby boli pre svoje nevesty a zaťov druhými matkami.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za naše rodiny: aby v modlitbe pozývali Boha medzi seba ako svojho najlepšieho priateľa.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za našich zomrelých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupom blažených v kráľovstve večného svetla.",
                    "Bože Otče,<br>" +
                            "tvoj Syn Ježiš Kristus zvestoval Božie kráľovstvo<br>" +
                            "mnohým mestám a národom;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a pomáhaj nám, aby sme prijímali tvoju zvesť<br>" +
                            "s vďakou za naše vykúpenie.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "4", "Bratia a sestry, Pán Ježiš nás pozýva, aby sme ho nasledovali. Prijmime toto jeho pozvanie a vrúcne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby bolo v Cirkvi čoraz viac bratov a sestier, ktorí zasvätia svoj život duchovnému povolaniu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby národy smerovali k vzájomnému zbližovaniu a tolerancii, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby sa tí, ktorí žijú v neistote a úzkosti, nebáli vložiť svoje starosti do Kristových rúk a nastúpiť na loďku nádeje, ktorou je Cirkev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby poskytovatelia internetových služieb účinne spolupracovali s kresťanskými organizáciami pri šírení evanjelia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme úprimne ľutovali svoje hriechy a často pristupovali k sviatosti zmierenia a k Eucharistii, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Aby sme sa usilovali podobať sa zástupom, ktoré túžili počúvať Ježišove slová, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "ty poznáš naše vnútro a pozývaš nás k sebe;<br>" +
                            "vypočuj naše modlitby,<br>" +
                            "ktorými sa pripájame k zástupom tých,<br>" +
                            "čo ťa prosia.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"22", "5", "Bratia a sestry, Boh poslal svojho Syna, aby sme mali trvalý dôkaz jeho lásky k nám. S vďakou mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, posilňuj všetkých kresťanov, aby ich Kristovo slovo povzbudzovalo do stálej radosti a vytrvalého svedectva viery.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby rozvoj moderných technológií a komunikačných prostriedkov vo svete nezatienil pravú a nemennú hodnotu ľudského života.<br>" +
                            "<font color='#B71C1C'>3.</font> Buď milosrdný voči tým, ktorí akýmkoľvek spôsobom útočia na Cirkev, aby sa obrátili a úprimne hľadali cestu viery.<br>" +
                            "<font color='#B71C1C'>4.</font> Stoj pri nás, aby sme si často pripomínali svoje znovuzrodenie v krste a žili podľa kresťanského učenia.<br>" +
                            "<font color='#B71C1C'>5.</font> Ukáž našim zomrelým <font color='#B71C1C'>(M.)</font> nové nebo a novú zem a odpusť im všetky viny a poklesky.",
                    "Pane a Bože náš,<br>" +
                            "ty si nám zoslal svetlo života;<br>" +
                            "prosíme ťa, vypočuj naše modlitby<br>" +
                            "a potešuj nás neustálou radosťou z toho,<br>" +
                            "že ti môžeme patriť<br>" +
                            "a skláňať sa pred tvojou velebou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "6", "Bratia a sestry, Ježiš je cesta, pravda a život, nik nepríde k Otcovi, iba ak cez neho. On preniká všetko a je naším Pánom. Oddane ho prosme v spoločnej modlitbe.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za kňazov Cirkvi: aby boli vedení Božím slovom a naplnení jeho nevyčerpateľnou múdrosťou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za národy sveta: aby si navzájom pomáhali zmierňovať hlad a biedu vo všetkých častiach zeme, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za pracujúcich: aby si poctivou prácou zarábali na svoje živobytie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás tu prítomných: aby sme prijali evanjelium ako náš najvyšší zákon a podľa neho aj žili, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zomrelých <font color='#B71C1C'>(M.)</font>: aby sa nebo stalo ich večným domovom, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "prednášame ti svoje prosby<br>" +
                            "a prosíme ťa,<br>" +
                            "aby si ich na príhovor Panny Márie vypočul.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"23", "A", "Bratia a sestry, zhromaždení v Ježišovom mene, s vierou, že on je uprostred nás, a vo vedomí zodpovednosti za celú Cirkev spoločne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých duchovných pastierov: aby s láskou i odvahou upozorňovali na chyby svojich veriacich, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých ľudí: aby neboli jeden druhému na pohoršenie, ale aby každý miloval svojho blížneho, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za hriešnikov: aby zanechali cestu hriechu a zmierili sa so svojimi bratmi a s Cirkvou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za rodičov: aby vedeli napomínať a správne vychovávať svoje deti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu zhromaždených: aby sme si uvedomovali silu spoločnej modlitby, prosme Pána.",
                    "Nebeský Otče,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pomôž nám niesť si vzájomne bremená,<br>" +
                            "aby sme naplnili tvoj zákon lásky.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "B", "Bratia a sestry, Pán Ježiš ohlasoval radostnú zvesť a uzdravoval chorých. Prosme ho, aby sme s radosťou počúvali Božie slovo a zvestovali ho aj iným.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daruj svojim biskupom a kňazom múdrosť a horlivosť pri ohlasovaní evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby všetci ľudia mali otvorený sluch pre tvoju radostnú zvesť.<br>" +
                            "<font color='#B71C1C'>3.</font> Napomeň tých, ktorí zneužívajú dar jazyka, aby sa zbavili svojich hriešnych zlozvykov.<br>" +
                            "<font color='#B71C1C'>4.</font> Požehnávaj všetkých lekárov, ktorí podľa tvojho príkladu liečia naše choroby.<br>" +
                            "<font color='#B71C1C'>5.</font> Povzbudzuj pracovníkov charity, aby ich úsilie pomáhať biednym bolo preniknuté duchom evanjelia a obetavej lásky.<br>" +
                            "<font color='#B71C1C'>6.</font> Dávaj nám tu zhromaždeným schopnosť trpezlivo počúvať iných.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby,<br>" +
                            "pomáhaj nám verne počúvať tvoje slovo<br>" +
                            "a s radostným srdcom ohlasovať tvoje veľké skutky.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"23", "C", "Bratia a sestry, dnes nás Pán dôrazne vyzýva, aby sme sa pre neho vedeli zriekať všetkého a aby sme ho verne nasledovali. Prosme ho o túto milosť.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, nech je v tvojej Cirkvi čoraz viac kresťanov, ktorí by sa ti celkom zasvätili a milovali ťa s nerozdeleným srdcom.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, žehnaj všetkých, ktorí svoje sily venujú pre dobro ľudí a pokoj vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, daj, nech mladí ľudia veľkodušne odpovedajú na tvoje pozvanie do kňazskej služby.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, daj, aby vodiči automobilov a iných vozidiel boli vzájomne ohľaduplní a dbali na dopravné predpisy.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, pomáhaj nám zriekať sa všetkého, čo nám bráni žiť opravdivým kresťanským životom.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a nauč nás chápať,<br>" +
                            "že život človeka má nesmiernu cenu<br>" +
                            "a že pre teba máme byť schopní priniesť akúkoľvek obetu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"23", "1", "Bratia a sestry, Boh pozná všetky naše myšlienky a vypočuje tých, ktorí ho prosia. S dôverou sa naňho obráťme v spoločnej modlitbe.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, daj, aby biskupi, kňazi a diakoni hlásaním tvojho slova privádzali ku kresťanstvu čoraz viac neveriacich bratov a sestier.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilňuj predstavených národov, aby dbali na zachovávanie mravných a duchovných hodnôt.<br>" +
                            "<font color='#B71C1C'>3.</font> Očisti srdcia tých, ktorí v sebe živia nenávisť a zlú vôľu, aby ich láska tvojho Syna uzdravila a posilnila.<br>" +
                            "<font color='#B71C1C'>4.</font> Obdaruj duchom nábožnosti všetkých chorých, aby ich viera bola silnejšia ako úzkosť a bolesť.<br>" +
                            "<font color='#B71C1C'>5.</font> Povzbudzuj nás, aby sme dokázali slúžiť trpiacim bez ohľadu na vlastné nevýhody a ťažkosti.<br>" +
                            "<font color='#B71C1C'>6.</font> Daruj našim zomrelým <font color='#B71C1C'>(M.)</font> šťastie a radosť v kráľovstve spravodlivosti a večného pokoja.",
                    "Nebeský Otče a Bože náš,<br>" +
                            "pre teba nič nie je nemožné;<br>" +
                            "vypočuj nás, keď sa k tebe modlíme,<br>" +
                            "a potešuj nás svojou otcovskou dobrotou a láskou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "2", "Bratia a sestry, Pán Ježiš sa k Otcovi úpenlivo a vrúcne modlil. Spolu s apoštolmi buďme aj my jeho nasledovníkmi a prosme nášho nebeského Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, ochraňuj nášho Svätého Otca <font color='#B71C1C'>M.</font>, Petrovho nástupcu, aby Cirkev pod jeho vedením zodpovedne plnila svoje apoštolské poslanie.<br>" +
                            "<font color='#B71C1C'>2.</font> Na orodovanie svätých apoštolov posilňuj slovenských biskupov, aby horlivo a prezieravo slúžili nášmu národu.<br>" +
                            "<font color='#B71C1C'>3.</font> Pomáhaj národom navzájom sa tolerovať a nevyvyšovať sa jeden nad druhým.<br>" +
                            "<font color='#B71C1C'>4.</font> Osvecuj srdcia mladých ľudí, ktorí cítia povolanie do duchovného stavu, aby tvoj hlas vypočuli a nasledovali.<br>" +
                            "<font color='#B71C1C'>5.</font> Vlož do našich sŕdc duchovnú radosť z toho, že patríme do Cirkvi postavenej na základe apoštolov.<br>" +
                            "<font color='#B71C1C'>6.</font> Voveď našich zomrelých <font color='#B71C1C'>(M.)</font> do nebeského domova, kde môžu večne hľadieť na tvoju velebu.",
                    "Bože Otče,<br>" +
                            "tvoj Syn učil zástupy a uzdravoval choroby;<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a urob nás poslušnými náuke apoštolov a ich nástupcov.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "3", "Bratia a sestry, máme radosť z toho, že Kristus pripravil svojim verným hojnú odmenu v nebi. Preto sa usilujme žiť podľa jeho blahoslavenstiev a posilnime sa v spoločnej modlitbe.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, pomáhaj všetkým kresťanom v chudobe ducha budovať Božie kráľovstvo.<br>" +
                            "<font color='#B71C1C'>2.</font> Nasýť krajiny, ktoré trpia hladom, potrebným chlebom a plnosťou svojho slova.<br>" +
                            "<font color='#B71C1C'>3.</font> Potešuj všetkých, ktorí trpia pre vieru a náboženstvo, aby aj v trápení a nenávisti odvážne vyznávali svoju vieru.<br>" +
                            "<font color='#B71C1C'>4.</font> Osvieť svetlom nádeje smútok a žiaľ tých, ktorí stratili svojich blízkych.<br>" +
                            "<font color='#B71C1C'>5.</font> Ochráň nás od falošnej pýchy a namyslenosti, aby sme nezabúdali na pravú obetu a lásku.",
                    "Pane Ježišu Kriste,<br>" +
                            "ty nás učíš pravej radosti;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme na našej ceste k blaženosti<br>" +
                            "vždy túžili žiť podľa tvojho učenia.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"23", "4", "Bratia a sestry, Kristus prišiel na svet, aby spasil všetkých ľudí a naučil nás milovať aj svojich nepriateľov. V duchu tejto náročnej požiadavky evanjelia prosme nášho milosrdného Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, pomáhaj všetkým kresťanom odpúšťať a byť milosrdnými, a tak budovať Cirkev vzájomnej jednoty a porozumenia.<br>" +
                            "<font color='#B71C1C'>2.</font> Odstráň z ľudskej spoločnosti vojnové konflikty a daj, aby sa nezhody a spory medzi krajinami riešili dohodou a mierovou cestou.<br>" +
                            "<font color='#B71C1C'>3.</font> Povzbudzuj tých, čo nenávidia a preklínajú, aby dokázali odpúšťať a prijímať aj názory iných.<br>" +
                            "<font color='#B71C1C'>4.</font> Nauč nás milovať svojich nepriateľov a žehnať tých, čo nás potupujú.<br>" +
                            "<font color='#B71C1C'>5.</font> Buď milosrdný voči našim zomrelým <font color='#B71C1C'>(M.)</font>, odpusť im viny a voveď ich do večnej radosti.",
                    "Pane a Bože náš,<br>" +
                            "ty nás učíš milovať bez akýchkoľvek podmienok a výhrad;<br>" +
                            "prosíme ťa, prijmi naše prosby<br>" +
                            "a daruj nám čisté srdcia,<br>" +
                            "aby sme sa podobali tvojmu Synovi Ježišovi Kristovi,<br>" +
                            "ktorý s tebou žije a kraľuje na veky vekov."},
            {"23", "5", "Bratia a sestry, Pán Ježiš nás učí byť pravdivými k Bohu, k ľuďom, ale najmä k sebe samým. S túžbou stále viac sa mu podobať vrúcne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých kňazov a rehoľníkov: aby mali úctu voči svojim predstaveným a celý svoj život bezvýhradne obetovali Bohu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za svetskú vrchnosť: aby sa štátnici nevyvyšovali nad ostatných obyvateľov, ale ochotne spolupracovali na rozvoji ľudskej spoločnosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za novinárov, komentátorov a reportérov: aby úprimne hľadali pravdu a svojou prácou prispievali k pozdvihovaniu verejnej mienky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za naše rodiny: aby mali silu riešiť napätia a konflikty vzájomným dialógom a žili v úcte a tolerancii, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás samých: aby Božia láska premenila náš vzťah k blížnym a urobila z nás pravých Kristových učeníkov, prosme Pána.",
                    "Pane Ježišu, tvoje slová skrývajú v sebe hlbokú pravdu a lásku;<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a osvecuj náš zrak svetlom pravého poznania,<br>" +
                            "aby sme túžili po pravej kresťanskej láske.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"23", "6", "Bratia a sestry, k nášmu nebeskému Otcovi môžeme prísť len cestou, ktorá vedie cez zachovávanie jeho prikázaní. S túžbou stať sa nasledovníkmi jeho Syna úprimne sa k nemu modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby kazatelia dosvedčovali svojím životom to, čo ohlasujú slovom vo svojich príhovoroch, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby tí, ktorí prijímajú a vyhlasujú zákony, zodpovedne ich pripravovali a sami ich príkladne dodržiavali, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby mladí ľudia uznávali správne životné hodnoty a postavili svoj život na pevnom základe viery, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo prenikol duch solidarity a vzájomnej ohľaduplnosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zomrelí <font color='#B71C1C'>(M.)</font> mohli vidieť krásu Božieho majestátu, prosme Pána.",
                    "Pane a náš vládca,<br>" +
                            "ty nás vedieš cestou svetla;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a daj, aby sme svoj zrak upriamili na večné hodnoty<br>" +
                            "a vždy hľadali iba teba.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"24", "A", "Bratia a sestry, vieme, že Pán Boh nám odpustí naše viny, ak aj my odpustíme tým, ktorí sa previnili proti nám. Pokorne prosme nebeského Otca, aby sme boli milosrdní, a tak dosiahli milosrdenstvo.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby služobníci Cirkvi milosrdne a s láskou vysluhovali sviatosť zmierenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby si všetci ľudia i všetky národy navzájom odpustili krivdy a priateľsky sa zmierili, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby schopnejší ľudia nepohŕdali menej schopnými, ale vychádzali im v ústrety, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby rodičia mali v starobe oporu vo svojich deťoch, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby vo všetkých rodinách našich farností panoval pokoj a bratská láska, prosme Pána.",
                    "Nebeský Otče, vyslyš naše prosby,<br>" +
                            "nauč nás odpúšťať všetkým, ktorí nám ublížili,<br>" +
                            "a byť k nim milosrdní,<br>" +
                            "lebo aj my potrebujeme tvoje veľké milosrdenstvo.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"24", "B", "Bratia a sestry, kresťan v kríži nachádza silu do života. Prosme Pána, aby nám dal odvahu s láskou vziať svoj kríž a verne ho nasledovať.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, pomáhaj pastierom Cirkvi, aby trpezlivo riešili ťažkosti života a boli pre kresťanov vzorom v nesení každodenného kríža.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby ťa ľudia všetkých národov spoznali ako svojho Vykupiteľa a Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Pouč kresťanov, aby pre pozemské a svetské dobrá nestratili duchovné hodnoty a večnú spásu.<br>" +
                            "<font color='#B71C1C'>4.</font> Vnukni chorým a trpiacim, aby sa v krížoch, ktoré na nich doľahnú, zjednotili s tebou a v tebe našli útechu a silu.<br>" +
                            "<font color='#B71C1C'>5.</font> Daruj ľuďom v dôchodkovom veku požehnané dni, aby nestrácali zmysel života a vzájomne sa povzbudzovali v spoločenstve a v modlitbe.<br>" +
                            "<font color='#B71C1C'>6.</font> Nauč nás láskavosti a pozornosti aj voči tým, ktorí sú nám nepríjemní a na ťarchu.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby nám tvoj kríž bol vždy<br>" +
                            "svetlom, silou a spásou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"24", "C", "Bratia a sestry, náš Boh je milosrdný a trpezlivý. S láskou prijíma tých, ktorí úprimne robia pokánie. Pokorne prosme za návrat hriešnikov.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, daj, nech v služobníkoch Cirkvi, ktorí vysluhujú sviatosť zmierenia, žiari tvoja otcovská láska a dobrota.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomáhaj všetkým ľuďom dobrej vôle spolupracovať na uskutočňovaní spravodlivosti a pokoja vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Vlož do sŕdc hriešnikov ľútosť nad premárneným životom a túžbu vrátiť sa do plného spoločenstva Cirkvi.<br>" +
                            "<font color='#B71C1C'>4.</font> Vysloboď mladých ľudí z pokušení a dotkni sa ich svojou milosťou, aby vytrvali v dobrom.<br>" +
                            "<font color='#B71C1C'>5.</font> Vylieč tých, ktorí sú závislí od hazardných hier, a daj, aby sme im vedeli pomôcť pri náprave života.<br>" +
                            "<font color='#B71C1C'>6.</font> Daj, aby si všetci v našom <font color='#B71C1C'>(</font>farskom<font color='#B71C1C'>)</font> spoločenstve odpustili a žili v pokoji a bratskej láske.",
                    "Nebeský Otče,<br>" +
                            "ty si svoje milosrdenstvo voči nám prejavil tým,<br>" +
                            "že si v Kristovi zmieril svet so sebou<br>" +
                            "a pre jeho krv vraciaš pokoj všetkým kajúcnikom;<br>" +
                            "zmiluj sa nad nami<br>" +
                            "a vyslyš naše prosby.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"24", "1", "Bratia a sestry, Boh nám dal svojho jednorodeného Syna, aby sme dosiahli večný život. Prosme o posilnenie našej viery a spoločne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, posilni našu vieru.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za všetkých kresťanov: Bože, daruj nám vytrvalosť v dobrom a nadšenie ohlasovať tvoje slovo.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za celý svet: Otče, vnášaj do sŕdc všetkých ľudí súlad s tvojím stvoriteľským poriadkom a morálnymi i prírodnými zákonmi.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých, ktorí sú pyšní a správajú sa povýšenecky: Bože, daj im poznanie, že len cez Ježišov kríž a pokoru možno dosiahnuť spásu duše.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za našich priateľov a známych: Otče, dopraj im, aby uverili, že vierou v Krista majú otvorené dvere do večnosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za našich zomrelých <font color='#B71C1C'>(M.)</font>: Bože, zavŕš v nich zázrak vykúpenia a voveď ich do svojej slávy.",
                    "Nebeský Otče,<br>" +
                            "zjavil si sa nám vo svojom Synovi,<br>" +
                            "lebo nás nesmierne miluješ;<br>" +
                            "dvíhame k tebe svoje srdcia s nádejou,<br>" +
                            "že vypočuješ naše prosby,<br>" +
                            "a s vierou, že Kristus povie len slovo<br>" +
                            "a budeme uzdravení.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"24", "2", "Bratia a sestry, zástupy ľudu po vzkriesení naimského mládenca spoznali Ježiša ako Božieho Syna. S túžbou spoznávať Krista sa spoločne modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby ťa všetci biskupi verne nasledovali ako tvoji vyvolení učeníci.<br>" +
                            "<font color='#B71C1C'>2.</font> Bdej nad predstaviteľmi štátnej moci, aby nebránili misionárom šíriť Božie slovo v krajinách všetkých kontinentov.<br>" +
                            "<font color='#B71C1C'>3.</font> Buď milosrdný voči všetkým, ktorí podľahli pokušeniam, daj im túžbu zmeniť sa a prijať sviatostné zmierenie s tebou.<br>" +
                            "<font color='#B71C1C'>4.</font> Pomáhaj nám, aby sme mali súcit s trpiacimi a vedeli im dodávať posilu v beznádeji.<br>" +
                            "<font color='#B71C1C'>5.</font> Posilňuj rodičov, ktorí oplakávajú svoje zomrelé dieťa, nádejou na radostné stretnutie v nebi.<br>" +
                            "<font color='#B71C1C'>6.</font> Priveď k večnej radosti našich zomrelých <font color='#B71C1C'>(M.)</font>, aby naveky prebývali v nebeskom domove.",
                    "Pane Ježišu Kriste,<br>" +
                            "ty si Pánom života i smrti;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a dopraj nám naplno uveriť zázraku<br>" +
                            "tvojho zmŕtvychvstania.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"24", "3", "Bratia a sestry, hoci sme slabí a hriešni, Boh nás nekonečne miluje. V tejto spoločnej modlitbe prosme o dary poznania a múdrosti, aby sme sa stávali stále lepšími.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, tvoje slovo je pravdivé; daruj odvahu všetkým misionárom, aby nebojácne svedčili o tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, ty vládneš nad všetkými; posmeľuj vládcov národov konať podľa tvojho zákona.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, ty miluješ spravodlivosť; odpusť všetkým väzneným, ktorí ľutujú svoje počínanie, a daj im novú príležitosť na zmenu života.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, ty si plný dobroty a lásky; nauč nás byť vďačnými svojim rodičom <font color='#B71C1C'>(</font>a láskavými k svojim deťom.<font color='#B71C1C'>)</font><br>" +
                            "<font color='#B71C1C'>5.</font> Bože, ty otváraš brány neba; odmeň našich zomrelých <font color='#B71C1C'>(M.)</font> večným odpočinkom v tvojej láske.",
                    "Nebeský Otče,<br>" +
                            "tvoje slová sú Duch a život;<br>" +
                            "pokorne ťa prosíme, vypočuj naše modlitby<br>" +
                            "a napĺňaj nás nádejou<br>" +
                            "na radostné stretnutie s tebou vo večnosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"24", "4", "Bratia a sestry, Pán Ježiš odpúšťa hriechy tým, ktorí ho milujú. Povzbudení jeho milosrdnou láskou prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, sprevádzaj všetkých kňazov, aby ich každodenné stretnutie s tebou v Eucharistii bolo najkrajšou chvíľou každého dňa.<br>" +
                            "<font color='#B71C1C'>2.</font> Žehnaj všetky národy sveta a daj, aby im nechýbal duch solidarity a vzájomnej pomoci.<br>" +
                            "<font color='#B71C1C'>3.</font> Obráť hriešnikov, aby sa nebáli prísť k tebe a prijať sviatostné odpustenie.<br>" +
                            "<font color='#B71C1C'>4.</font> Vzbuď ľútosť v srdciach žien, ktoré pošliapali svoju dôstojnosť, a daj im milosť znovu objaviť hodnotu ženy a matky.<br>" +
                            "<font color='#B71C1C'>5.</font> Príď do našich domovov a prebývaj v našich rodinách.<br>" +
                            "<font color='#B71C1C'>6.</font> Nauč nás odpúšťať tým, ktorí nás osočujú a ohovárajú.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše volanie k tebe<br>" +
                            "a očisti úmysly nášho srdca,<br>" +
                            "aby sme sa stali hodnými<br>" +
                            "vzdávať chválu tvojmu menu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"24", "5", "Bratia a sestry, Pána Ježiša na cestách sprevádzali jeho verní priatelia a učeníci. Aj my ho s láskou nasledujme a spoločne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, ochraňuj nášho biskupa <font color='#B71C1C'>M.</font>, aby ho nič neodlúčilo od tvojej lásky.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilňuj ducha štedrosti v bohatých krajinách, aby sa vedeli deliť s chudobnými.<br>" +
                            "<font color='#B71C1C'>3.</font> Sprevádzaj všetkých cestujúcich, aby v bezpečí a tvojej milosti dosiahli cieľ svojej cesty.<br>" +
                            "<font color='#B71C1C'>4.</font> Štedro odmeň všetkých, ktorí svojou ochotou, pomocou a prostriedkami podporujú službu Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Osvieť náš duchovný zrak, aby sme lepšie videli potreby našich blížnych.<br>" +
                            "<font color='#B71C1C'>6.</font> Obdaruj našich zomrelých <font color='#B71C1C'>(M.)</font> večnou nebeskou blaženosťou.",
                    "Pane Ježišu,<br>" +
                            "tebe mnohí vypomáhali zo svojich prostriedkov;<br>" +
                            "prosíme ťa, vypočuj naše modlitby<br>" +
                            "a dovoľ nám obetovať ti všetko, čo máme,<br>" +
                            "naše životy, mysle i srdcia.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"24", "6", "Bratia a sestry, kto počúva Božie slovo, zachováva ho v dobrom a šľachetnom srdci a vytrvalo prináša úrodu, je blahoslavený. Počúvajme aj my toto slovo a prednesme svoje prosby Všemohúcemu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby prijímané Božie slovo bolo zrnom, ktoré padá na úrodnú pôdu a prináša stonásobnú úrodu.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za vládnych činiteľov, aby s jasnou mysľou vnímali naliehavé potreby ľudskej spoločnosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých, ktorým starosti, bohatstvo a rozkoše bránia v raste Božieho slova, aby sa obrátili a zanechali starú cestu života.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za seba samých, aby sme v čase skúšok nachádzali prameň večného slova.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za našich zomrelých <font color='#B71C1C'>(M.)</font>: aby dosiahli spásu v nebi.",
                    "Pane a Bože náš,<br>" +
                            "tvoje slovo je mocné a preniká všetko;<br>" +
                            "prosíme ťa, vypočuj naše prosby,<br>" +
                            "prenikni nás svojou láskou<br>" +
                            "a daj nám silu stávať sa dobrým zrnom,<br>" +
                            "ktoré prináša bohatú úrodu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"25", "A", "Bratia a sestry, Boh je nekonečne milosrdný. Odpúšťa každému, kto sa k nemu kajúcne vráti, a štedro odmieňa aj tých, čo sa v poslednej chvíli hlásia do jeho vinice. Preto ho s dôverou prosme za spásu sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby Cirkvi, Pánovej vinici, nechýbali horliví pracovníci z radov kňazov aj laikov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby všetci kresťania poznali a plnili svoje poslanie v Kristovej Cirkvi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby si všetci ľudia uvedomili, že svojou statočnou prácou slúžia Bohu a blížnym, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby podnikatelia a zamestnávatelia načas vyplácali svojim zamestnancom spravodlivú mzdu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zosnulí <font color='#B71C1C'>(M.)</font> dosiahli plné spoločenstvo so svätými v nebeskom kráľovstve, prosme Pána.",
                    "Bože Otče,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a zbav nás duchovnej lenivosti a ľahostajnosti,<br>" +
                            "aby sme boli horlivými pracovníkmi<br>" +
                            "vo vinici Ježiša Krista,<br>" +
                            "ktorý s tebou žije a kraľuje na veky vekov."},
            {"25", "B", "Bratia a sestry, spoločnou modlitbou sa stávame služobníkmi všetkých. Preto úprimne prosme za Cirkev i za celý svet.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby biskupi, kňazi a diakoni uskutočňovali slová Písma o tom, že kto chce byť prvý, má byť služobníkom všetkých, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby vo svete prestali nepriateľstvá, násilie i vraždy a zavládlo medzi ľuďmi porozumenie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby tí, ktorí rozsievajú nenávisť, spoznali tragické následky svojho nesprávneho konania, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby deti v detských domovoch necítili opustenosť a dostali štedré a láskavé náhradné rodiny, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby rodičia a vychovávatelia čerpali z Božej múdrosti, ktorá je čistá, pokojná a plná milosrdenstva, prosme Pána<br>" +
                            "<font color='#B71C1C'>6.</font> Aby sme sa zbavili falošnej pokory, ale aj nebezpečnej ctižiadosti a závisti, prosme Pána.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a pomáhaj nám premáhať<br>" +
                            "všetky zlé náklonnosti a pokušenia,<br>" +
                            "aby sme všade šírili tvoju lásku a pokoj.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"25", "C", "Bratia a sestry, svätý apoštol Pavol nás vyzýva, aby sme sa modlili za všetkých ľudí. Prosme teda všemohúceho Boha Otca, ktorý chce spasiť všetkých ľudí, aby vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za pastierov Cirkvi: aby ich úsilie o svätosť a svedectvo života oslovilo svet, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za predstaviteľov spoločenských organizácií: aby vytvárali podmienky pre pokojný, zbožný a čestný život ľudí, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých utláčaných a chudobných: aby našli pomoc a útechu v spoločenstve svojich kresťanských bratov a sestier, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za všetkých, ktorí chcú žiť len pre seba: aby sa zbavili lakomstva i závisti a slúžili Bohu vo svojich blížnych, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu zhromaždených: aby sme Boha milovali väčšmi ako všetko na svete, prosme Pána.",
                    "Bože, vypočuj modlitby svojej Cirkvi<br>" +
                            "a daj, aby sme žili pokojným životom<br>" +
                            "v nábožnosti a čistote.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"25", "1", "Bratia a sestry, Pán Ježiš nás povzbudzuje konať skutky lásky, aby bolo vidieť, že sme pravými kresťanmi. Nadšene mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby Cirkev nebojácne a odvážne obhajovala Kristovo učenie a vykupiteľské dielo našej spásy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby tí, ktorí majú politickú moc, využívali svoje pôsobenie uvážlivo a spravodlivo, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby tma, ktorá zahaľuje život sirôt, bola osvietená svetlom prijatia do nových rodín, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby vzdelaní a učení ľudia svojím vzdelaním privádzali iných k poznaniu Božej pravdy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zomrelí <font color='#B71C1C'>(M.)</font> dosiahli večný odpočinok v kráľovstve Božieho pokoja, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a posilňuj nás svojou milosťou,<br>" +
                            "aby sme svojím životom svedčili o tvojej dobrote.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"25", "2", "Bratia a sestry, Boh nás prijal za svoje deti a túži mať z nás rodinu zjednotenú pri počúvaní jeho slova. Aj touto spoločnou modlitbou vytvárajme Božiu rodinu a volajme:",
                    "<font color='#B71C1C'>(</font>Nech sme jedno srdce na tvoju slávu, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, daj, aby si všetci kresťania boli navzájom milujúcimi bratmi a sestrami.<br>" +
                            "<font color='#B71C1C'>2.</font> Uzmier znepriatelené krajiny a posilňuj mier vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Ponúkni svoju otcovskú náruč všetkým dospelým, ktorí túžia byť pokrstení a prijatí do spoločenstva Katolíckej cirkvi.<br>" +
                            "<font color='#B71C1C'>4.</font> Usmerňuj naše svedomie, aby sme žili v súlade s tvojimi prikázaniami.<br>" +
                            "<font color='#B71C1C'>5.</font> Voveď našich zomrelých <font color='#B71C1C'>(M.)</font> medzi plesajúci zástup anjelov a všetkých svätých.",
                    "Pane a Bože náš,<br>" +
                            "tvoj Syn nás privádza bližšie k tebe;<br>" +
                            "úpenlivo ťa prosíme,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj nám nádej na večnú blaženosť v nebi.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"25", "3", "Bratia a sestry, apoštoli chodili po mnohých mestách, hlásali evanjelium a uzdravovali. Aj my sa nechajme vyliečiť zo svojich slabostí a úprimne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za tých, ktorí sa pripravujú na prijatie sviatosti kňazstva, aby sa modlitbou a štúdiom otvárali pôsobeniu Ducha Svätého.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za tých, ktorí nás spravujú, aby pamätali na rozvoj celej spoločnosti a prehlbovali morálny a zákonný poriadok.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za tých, ktorí sú posadnutí zlým duchom, aby prijali pomoc a boli uzdravení.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za živiteľov rodín, aby popri starostiach o hmotné zabezpečovanie nezabúdali ani na svoj duchovný rast.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za veriacich našich farností, aby ochotne podporovali pastoračné aktivity svojich kňazov.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme za seba samých, aby sme boli uzdravení zo svojich hriechov a úprimne ich ľutovali.",
                    "Pane Ježišu,<br>" +
                            "ty si poslal svojich vyvolených<br>" +
                            "ohlasovať radostnú zvesť evanjelia;<br>" +
                            "vypočuj nás, pokorne prosiacich,<br>" +
                            "a daj, aby tvoje slovo našlo v nás svoj domov.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"25", "4", "Bratia a sestry, náš Pán Ježiš Kristus prišiel na svet, aby spasil všetkých ľudí. Aj my veríme, že je teraz prítomný medzi nami. Preto sa v jeho mene s pokorou modlime k nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, ochraňuj nášho Svätého Otca <font color='#B71C1C'>M.</font> a daj, aby svetu zjavoval živého zmŕtvychvstalého Krista.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, zachovávaj národy sveta vo svojej milosti, aby v porozumení a vzájomnom rešpekte vytvárali dôstojné podmienky na spoločenský život.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, ujmi sa tých, ktorí pochybujú o pravosti vykupiteľského diela tvojho Syna, aby ich prijatie pravej viery priviedlo k dokonalému šťastiu.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, posilňuj tých, ktorých trápia výčitky svedomia, v úsilí o zmenu života.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, stoj pri nás, aby sme sa neodplácali zlým za zlé, ale vedeli zo srdca odpustiť.<br>" +
                            "<font color='#B71C1C'>6.</font> Otče, otvor brány nebeského domova našim zomrelým <font color='#B71C1C'>(M.)</font> a daruj im večný život.",
                    "Nebeský Otče,<br>" +
                            "ty sa nám dávaš poznať prostredníctvom svojho zjavenia;<br>" +
                            "prosíme ťa, vypočuj nás<br>" +
                            "a ukáž nám správnu cestu, po ktorej máme kráčať,<br>" +
                            "aby sme dosiahli spásu svojej duše.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"25", "5", "Bratia a sestry, Pán Ježiš za nás trpel, bol ukrižovaný, ale na tretí deň vstal z mŕtvych. Obráťme sa naňho so svojimi prosbami.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, dávaj silu všetkým rehoľníkom a rehoľníčkam, aby v modlitbe nachádzali pevné spojenie s tebou.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, zachráň krajiny postihnuté prírodnými katastrofami od ničivých následkov pohrôm a daj, aby našli primeranú hmotnú pomoc.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, sprevádzaj tých, ktorí prežívajú roky svojej staroby, aby sa dôstojne pripravili na príchod do neba.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, zachovávaj nás vo svojej milosti, aby sme boli uchránení od vplyvov škodlivých siekt a falošných prorokov.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, zjav sa našim zomrelým <font color='#B71C1C'>(M.)</font>, ktorí nás predišli do večnosti, v plnosti svojej slávy.",
                    "Pane Ježišu,<br>" +
                            "prišiel si medzi nás, aby si slúžil;<br>" +
                            "prijmi naše prosby,<br>" +
                            "aby sme ti ako Božiemu Mesiášovi<br>" +
                            "mohli pripraviť svoje srdce otvorené a čisté.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"25", "6", "Bratia a sestry, nekonečná láska nášho Pána premáha smrť. S túžbou mať plnú účasť na večnom živote vrúcne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby si všetci kresťania uvedomovali, že ich jednota je podmienkou účinnejšieho hlásania evanjelia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby vedúci predstavitelia národov svedomito plnili svoje poslanie a nezabúdali, že pravým vládcom nad životom a smrťou je sám Boh, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby zamestnanci väzníc a nápravnovýchovných zariadení nikdy nestrácali úctu ku každej ľudskej osobe, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme často a pozorne čítali Sväté písmo a usilovali sa v plnosti prijať Božie zjavenie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zomrelí <font color='#B71C1C'>(M.)</font> boli vyslobodení z pút smrti a dosiahli slávu nebeského kráľovstva, prosme Pána.",
                    "Pane Ježišu, tvoja láska je večná a dokonalá;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomáhaj nám dôslednejšie chápať,<br>" +
                            "že tvoja obeta za nás<br>" +
                            "je tým najcennejším darom.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"26", "A", "Bratia a sestry, Boh nám dáva slobodu a chce, aby sme jeho vôľu plnili s láskou, a nie z donútenia. On spravodlivých vedie k tomu, aby sa utvrdili v dobrom, a hriešnikov vyzýva, aby sa odvrátili od zla. Úprimne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby jej príklad bol natoľko presvedčivý, že osloví všetkých, ktorí hľadajú zmysel života.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za našu vlasť, aby jej predstavitelia dokázali využívať všetky prostriedky na jej rozvoj a na upevnenie dobra a spravodlivosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za všetkých ľudí, aby s pochopením prijímali tých, ktorí sa po vykonaní trestu vracajú na slobodu.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za slabých vo viere, aby mali srdcia otvorené na prijímanie Božích darov.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za seba samých, aby nás Pán posilňoval v dodržaní slova, ktoré sme dali svojim blížnym.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby im Pán dal večný odpočinok.",
                    "Všemohúci a milosrdný Bože,<br>" +
                            "vypočuj naše pokorné prosby<br>" +
                            "a daj, aby sme si vedeli vždy vyvoliť to,<br>" +
                            "čo nám osoží pre večnosť.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"26", "B", "Bratia a sestry, Pán Ježiš nás dnes vyzýva, aby sme sa zbavili duchovnej závisti a aby sme nikdy neboli na pohoršenie iným. Preto sa pokorne modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby Cirkev s vierou a láskou prijímala aj tých, ktorí síce ešte nie sú v jej spoločenstve, ale svojím slovom i skutkami už napomáhajú jej pôsobenie.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, žehnaj všetkých, čo sa usilujú o sociálnu spravodlivosť a pokoj medzi národmi.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, posilňuj trpiacich na tele i na duši, aby pôsobením Ducha Svätého statočne odolávali nástrahám zlého ducha.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, otvor nám srdce pre útrapy a ťažkosti iných, aby nik medzi nami netrpel biedou a opustenosťou.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, upevňuj v našom <font color='#B71C1C'>(</font>farskom<font color='#B71C1C'>)</font> spoločenstve jednotu viery prostredníctvom horlivého ohlasovania evanjelia.",
                    "Pane Ježišu,<br>" +
                            "s dôverou sme ti predniesli svoje prosby;<br>" +
                            "prosíme ťa,<br>" +
                            "prebývaj stále medzi nami<br>" +
                            "a daj, aby naše srdcia boli pokorné a milujúce.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"26", "C", "Bratia a sestry, dnes nám Božie slovo pripomína, že náš život sa nekončí na tomto svete, ale pokračuje vo večnosti. V tejto nádeji prosme Pána, aby zhliadol na naše modlitby a láskavo nám udelil dary, o ktoré prosíme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, priveď svoju Cirkev k hľadaniu pravých hodnôt, aby sa nestarala len o veci tohto sveta, ale mala na pamäti aj večné dobrá.<br>" +
                            "<font color='#B71C1C'>2.</font> Osvieť svojím svetlom srdcia tých, ktorí spravujú verejné veci, aby hľadali pravdu a zmierňovali biedu vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Naplň útechou večného života tých, ktorí trpia na tomto svete slabosťami tela i duše, a raz ich priveď do večnej slávy.<br>" +
                            "<font color='#B71C1C'>4.</font> Vlož do sŕdc hriešnikov ľútosť nad premárneným životom a túžbu vrátiť sa do plného spoločenstva Božieho ľudu.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj, aby si veriaci nášho <font color='#B71C1C'>(</font>farského<font color='#B71C1C'>)</font> spoločenstva vzájomne odpustili a žili v pokoji a bratskej láske.",
                    "Pane, ty dávaš svoj pokoj všetkým,<br>" +
                            "ktorí robia pokánie;<br>" +
                            "prosíme ťa, prejav aj nám svoje milosrdenstvo,<br>" +
                            "zmiluj sa nad nami a vyslyš naše prosby,<br>" +
                            "aby sme sa raz všetci tešili pri tebe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"26", "1", "Bratia a sestry, Ježiš učí apoštolov, aby boli pokorní ako deti, a prikazuje im, aby nebránili tým, ktorí konajú dobro v jeho mene. Prosme ho, aby sme aj my vedeli prijať všetkých, ktorí konajú dobro vo svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj nášmu pápežovi <font color='#B71C1C'>M.</font> a biskupovi <font color='#B71C1C'>M.</font> pokorné srdce, aby vždy múdro viedli a vyučovali tvoj ľud.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, naplň darmi svojho Ducha všetkých predstavených štátov, aby nikomu nebránili ohlasovať tvoje meno.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, prosíme ťa za duševne trpiacich, aby vždy mali blízko seba lekárov duše, ktorí im budú prinášať tvoje uzdravujúce slovo.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, pomáhaj nám tu prítomným <font color='#B71C1C'>(</font>a celej našej farnosti<font color='#B71C1C'>)</font>, aby sme sa v pokornej modlitbe stretávali s tebou, lebo len ty nás môžeš skutočne uzdraviť.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prosíme ťa, daj večný život našim zosnulým <font color='#B71C1C'>(M.)</font>, ktorí nás predišli do večnosti.",
                    "Pane Ježišu,<br>" +
                            "ty jediný si pravý učiteľ a lekár;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj nám pokorné srdce,<br>" +
                            "aby sme neustále žili v tvojej milosti.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"26", "2", "Bratia a sestry, vždy boli na svete ľudia, ktorí Ježiša neprijali. Spoločne sa modlime, aby svet v našom Pánovi spoznal zasľúbeného Mesiáša a prijímal ho ako pravého Boha a pravého človeka.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, naplň naše srdcia túžbou po tebe.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, posilňuj nášho pápeža <font color='#B71C1C'>M.</font> a všetkých biskupov v úsilí otvárať ľudské srdcia na prijatie tvojho posolstva spásy.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, daj predstaveným štátov srdcia otvorené na odpustenie, aby na svete nevládla pomsta, ale láska a pravý pokoj.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, pomáhaj tým, ktorí nevinne trpia vo vojnách a v iných konfliktoch, aby pocítili tvoju ochrannú ruku.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, prosíme ťa za veriacich <font color='#B71C1C'>(</font>našej farnosti<font color='#B71C1C'>)</font>, aby vždy mali srdcia otvorené na prijatie teba a vedeli odpúšťať tým, ktorí im robia zle.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, prijmi k sebe do večnej blaženosti <font color='#B71C1C'>(</font>našich zomrelých <font color='#B71C1C'>M.</font> a<font color='#B71C1C'></font>) všetkých, ktorí sa tu na zemi usilovali plniť tvoju vôľu.",
                    "Pane Ježišu,<br>" +
                            "ty si prišiel na našu zem,<br>" +
                            "aby si nám ukázal veľkosť Otcovej lásky;<br>" +
                            "prijmi naše pokorné prosby a daj,<br>" +
                            "aby nám tvoj príklad bol povzbudením<br>" +
                            "do stále väčšej lásky k Bohu i k blížnym.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"26", "3", "Bratia a sestry, Ježiš každého z nás pozýva k sebe slovami: Poď za mnou! Poslúchli sme jeho hlas a zhromaždili sme sa pred Božou tvárou v dome modlitby. Teraz prednesme Pánovi svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, pamätaj na svoju Cirkev, ktorú si posvätil svojou krvou, aby bola sviatosťou spásy pre všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, vzbuď vo verejných činiteľoch úctu k tým, ktorí vyznávajú tvoje meno, aby vo svete vládol pokoj a porozumenie.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, posilňuj darmi Ducha Svätého našich trpiacich bratov a sestry, aby sa prijatím svojho kríža vždy hlbšie spájali s tebou.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, povolaj si aj z nášho <font color='#B71C1C'>(</font>farského<font color='#B71C1C'>)</font> spoločenstva mladých ľudí, ktorí budú ochotne nasledovať hlas tvojho volania.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, našim zosnulým <font color='#B71C1C'>(M.)</font> udeľ večnú radosť v spoločenstve tých, ktorí zanechali všetko a išli za tebou s čistým srdcom.",
                    "Pane Ježišu Kriste,<br>" +
                            "tvoje jarmo je príjemné a bremeno ľahké;<br>" +
                            "vyslyš, o čo sme ťa s vierou prosili,<br>" +
                            "aby sme mohli statočne spĺňať<br>" +
                            "svoje úlohy v Cirkvi a vo svete.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"26", "4", "Bratia a sestry, Pán Ježiš nás vyzýva: Proste Pána žatvy, aby poslal robotníkov na svoju žatvu! Napĺňajme jeho vôľu a aj v tejto spoločnej modlitbe prosme za kňazské povolania.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, posväcuj tých, ktorých si povolal.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosíme ťa za nášho pápeža <font color='#B71C1C'>M.</font> a za nášho biskupa <font color='#B71C1C'>M.</font>: ochraňuj ich a posilňuj vo svätej službe.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za predstaviteľov celého sveta: vlej im do sŕdc úctu k Cirkvi a ku kňazskému stavu.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za <font color='#B71C1C'>(</font>nášho duchovného otca a<font color='#B71C1C'>)</font> všetkých kňazov: buď im vzorom i najvernejším priateľom a eucharistickou obetou ich zjednocuj so sebou i navzájom.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za diakonov a seminaristov: posilňuj ich a pomáhaj im, aby sa stali kňazmi podľa tvojho srdca.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa za kňazov, ktorí v tomto roku prijali posvätnú vysviacku: urob z nich horlivých šíriteľov radostnej zvesti vo svete.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosíme ťa za zosnulých kňazov: daj im účasť na nebeskej liturgii a prijmi k sebe všetkých, ktorých viedli po ceste spásy.",
                    "Pane Ježišu,<br>" +
                            "ty si ustanovil kňazstvo ako dar ľudstvu;<br>" +
                            "žehnaj všetkých kňazov<br>" +
                            "a vypočuj naše pokorné prosby,<br>" +
                            "ktoré sme ti s dôverou predniesli.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"26", "5", "Bratia a sestry, Pán Ježiš nás učí pokore a kajúcnosti. Otvorme svoje srdcia pôsobeniu Ducha Svätého a úprimne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých veriacich: aby sa dôstojne a aktívne zúčastňovali na slávení najsvätejšej Eucharistie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetky národy sveta: aby ich Boh zachránil pred večnou smrťou a aby našli v kríži svoju spásu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za chorých, sužovaných a trpiacich: aby si viac uvedomovali, že Ježiš je s nimi a že majú účasť na jeho vykupiteľskej obete, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás všetkých: aby sme nezatvrdzovali svoje srdcia, ale počúvali Boží hlas, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby im Boh odpustil viny a prijal ich do svojho nebeského kráľovstva, prosme Pána.",
                    "Pane Ježišu, ty si spravodlivý sudca;<br>" +
                            "vypočuj naše úpenlivé prosby<br>" +
                            "a daj nám silu,<br>" +
                            "aby sme ťa nikdy nezapreli.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"26", "6", "Bratia a sestry, Kristus sa nám zjavuje a obdarúva nás mocou proti všetkým nástrahám nepriateľa. S hlbokou vierou mu predložme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby biskupi a kňazi s pevnou vierou chránili im zverený ľud od úkladov nepriateľa našej spásy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby naši zákonodarcovia odstraňovali všetky nesprávne zákony, a tak napomáhali vzájomnú lásku a spravodlivosť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby tí, ktorí sú v pochybnostiach a skúškach, objavili svetlo a silu vo viere v Božiu moc, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby tí, ktorí sú v zajatí hriechu, na príhovor Panny Márie premáhali pokušenia a s pevnou dôverou kráčali po ceste k večnosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme boli vďační za veľké dary a milosti, ktorými nás Boh obdarúva, a v nich nachádzali silu prekonávať všetky protivenstvá, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "ty zjavuješ maličkým tajomstvá Božieho kráľovstva;<br>" +
                            "vypočuj naše prosby,<br>" +
                            "aby sme sa mohli radovať z tvojej pomoci<br>" +
                            "a pod ochranou nebeskej Matky Márie<br>" +
                            "kráčali po ceste k nebeskej vlasti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"27", "A", "Bratia a sestry, Boh počas celých dejín sprevádzal svoj vyvolený ľud. Príchodom Pána Ježiša patríme do tohto vyvolenia aj my. Pokorne ho prosme, aby sme prinášali hojnú úrodu.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, žehnaj všetkých, čo prinášajú úrodu dobrých skutkov.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj, aby Cirkev, ktorú si vysadil ako svoju vinicu, bola jednotná a vytrvalá v láske.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, daj, aby štátnici a politici sveta podporovali spravodlivosť a pravdu.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, daj, aby sa svetová ekonomika riadila zásadami spravodlivosti a rovnosti s ohľadom na skutočné potreby všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, daj, aby chudobní, chorí a trpiaci nachádzali pomoc a podporu uprostred tvojho ľudu.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, daj, aby sme svojím príkladným životom privádzali k tebe všetkých ľahostajných a zblúdených.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane, daj, aby naši zosnulí <font color='#B71C1C'>(M.)</font> mohli čím skôr uvidieť tvoju tvár v nebesiach.",
                    "Pane Ježišu,<br>" +
                            "ty si nás vyvolil, aby sme šli a prinášali ovocie;<br>" +
                            "vypočuj, prosíme, naše úprimné prosby,<br>" +
                            "aby sme pod tvojou ochranou<br>" +
                            "boli hodnými obety, ktorú si priniesol za našu spásu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"27", "B", "Bratia a sestry, boli sme stvorení ako obraz živého Boha, aby sme žili v spoločenstve lásky. Túto pečať v sebe nesie predovšetkým manželstvo a rodina. Prosme Boha, aby v nás tento obraz neustále rástol.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, náš Stvoriteľ, posväť nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za svätú Cirkev, ktorá je Kristovou nevestou, aby bola verná svojmu nebeskému Ženíchovi a verne hlásala evanjelium na spásu nesmrteľných duší.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za tých, ktorí spravujú štát, aby vytvárali dobré zákony, ktoré budú chrániť a napomáhať dobro manželstiev a rodín.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za rodiny, ktorých matky nosia pod srdcom nový život, aby prijímali deti ako Boží dar a vychovávali ich v duchu kresťanskej lásky.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za manželov, ktorí nežijú primerane svojmu stavu, aby si uvedomili svoje zlyhania, zriekli sa zlých návykov a dokázali si vzájomne odpustiť.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za kresťanských snúbencov, aby prežívali svoj vzťah v úprimnej láske i čistote a nebáli sa uzavrieť manželstvo pred tvárou Cirkvi.",
                    "Milosrdný Bože,<br>" +
                            "ty si stvoril človeka ako muža a ženu,<br>" +
                            "aby boli jedno a vzájomne si pomáhali na ceste spásy;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a ako dobrý Otec nám daj to,<br>" +
                            "čo najviac potrebujeme.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"27", "C", "Bratia a sestry, živá a pevná viera je najväčším pokladom a naším víťazstvom. Prosme nášho Pána, ako ho prosili jeho apoštoli, o vieru pre seba, pre našich blízkych a pre celý svet.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, daj nám väčšiu vieru.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, prosíme ťa za tvoju Cirkev, aby jej nikdy nechýbala misionárska horlivosť a ochota slúžiť.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, prosíme ťa za tých, ktorí spravujú národy, aby podľa tvojho príkladu slúžili všetkým, ktorí sú im zverení.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, prosíme ťa za mladých ľudí, aby vo svojom živote našli odvahu patriť iba tebe, a tak slúžili bratom a sestrám.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, prosíme ťa za príslušníkov rôznych náboženstiev, aby sa sklony k fundamentalizmu a extrémizmu odstraňovali stálym rešpektom, toleranciou a dialógom.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, prosíme ťa za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme svoju vieru posilňovali častým prijímaním tvojho tela a počúvaním tvojho slova.<br>" +
                            "<font color='#B71C1C'>6.</font> Ježišu, prosíme ťa za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby mali účasť na večnej radosti v tvojom nebeskom kráľovstve.",
                    "Pane Ježišu,<br>" +
                            "sme neužitoční sluhovia,<br>" +
                            "lebo robíme to, čo sme povinní urobiť;<br>" +
                            "prosíme, vyslyš naše prosby,<br>" +
                            "ktoré ti v pokore prednášame.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"27", "1", "Bratia a sestry, milovať Boha nadovšetko a blížneho ako seba samého je prvé a najdôležitejšie prikázanie. Toto robiť znamená žiť. Prosme Pána, aby nás obdaroval čistým srdcom a aby sme vždy spoznali tých, ktorí potrebujú našu pomoc.", "<font color='#B71C1C'>(</font>Volajme: Pane, chceme byť dedičmi večného života.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa za pápeža <font color='#B71C1C'>M.</font>, za biskupov a kňazov, aby verne ohlasovali slovo evanjelia a s láskou vyučovali veriacich, ako si to robil ty sám.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, daj svetlo Ducha Svätého všetkým, ktorí s úprimnou túžbou hľadajú pravdu, a keď ju nájdu, daj im silu, aby podľa nej aj žili.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, ty sám buď odmenou všetkým, ktorí konajú skutky telesného i duchovného milosrdenstva, a daj im raz účasť na večnej blaženosti.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, obdaruj nás láskou a ochotou slúžiť, aby sme neprehliadali svojich blížnych v núdzi, ale vedeli si vzájomne pomáhať.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, všetkým zomrelým, ktorí milovali teba nadovšetko a blížnych ako seba samých, daruj dedičstvo večného života.",
                    "Pane, ty sám si nám dal príklad nesmiernej lásky;<br>" +
                            "vypočuj naše pokorné prosby,<br>" +
                            "aby sme si prejavovaním vzájomnej lásky<br>" +
                            "zaslúžili tvoje milosrdenstvo,<br>" +
                            "ktoré si nám zjavil na oltári kríža.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"27", "2", "Bratia a sestry, Pán nikdy nepohŕda našimi prosbami. Prednesme mu svoje úmysly s dôverou, že ich vypočuje na svoju chválu i slávu a pre našu spásu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme Pána za nášho biskupa <font color='#B71C1C'>M.</font>, za kňazov a diakonov našej diecézy, aby mali dostatok síl verne žiť podľa evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme Pána za predstaviteľov štátov, aby svoju úlohu vnímali predovšetkým ako službu tým, ktorí sú im zverení.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme Pána za tých, ktorí slúžia svojim blížnym s horlivosťou Marty, aby nezabúdali počúvať Ježiša ako Mária.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme Pána za mladých ľudí, aby sa zodpovedne pripravovali na svoje povolanie a s nadšením ho plnili.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme Pána za seba samých, aby sme podľa príkladu Márie radi zotrvávali v Pánovej prítomnosti a klaňali sa mu v Oltárnej sviatosti.",
                    "Pane Ježišu,<br>" +
                            "ty si láskavo prijal službu Marty<br>" +
                            "a vyzdvihol si sústredené počúvanie Márie;<br>" +
                            "daj, nech podľa ich príkladu<br>" +
                            "aj my vieme slúžiť blížnym<br>" +
                            "a byť vnímaví na tvoje slová.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"27", "3", "Bratia a sestry, všetci túžime po úprimnej modlitbe a cítime potrebu prosiť Pána, aby nás naučil, ako sa máme správne modliť. Stretávame sa s ním pri slávení svätej omše, preto s dôverou volajme:",
                    "<font color='#B71C1C'>(</font>Pane, nauč nás modliť sa.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, veď svoju modliacu sa Cirkev, aby sa jej prostredníctvom posväcovalo tvoje meno a šírilo tvoje kráľovstvo.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, daruj ľuďom na celom svete každodenný chlieb, aby im nechýbalo nič, čo potrebujú na dôstojný život.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, buď milostivý všetkým, ktorí ťa modlitbou kajúcne prosia o odpustenie svojich hriechov.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, pouč všetkých hnevníkov, že odpustenie hriechov dosiahnu jedine vtedy, keď aj oni zo srdca odpustia.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, neuveď nás do pokušenia a daj nám v modlitbe silu premáhať všetky nástrahy zlého ducha.",
                    "Ježišu, Syn živého Boha,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj nám silu<br>" +
                            "dvíhať v modlitbe svoje srdcia k tebe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"27", "4", "Bratia a sestry, Pán Ježiš nás povzbudzuje: Proste a dostanete! Hľadajte a nájdete! Klopte a otvoria vám! Preto s dôverou odovzdajme svoje prosby nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme, aby kňazi pod vedením svojich biskupov boli pre veriacich zdrojom posily a nábožnosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme, aby sa národy sveta vzájomne rešpektovali a aby utíchli všetky nepokoje a rozbroje.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme, aby sa naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo zbavilo hriechov ohovárania, lakomstva a pokrytectva.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme, aby sme mysleli na potreby svojich bratov a sestier a vždy ochotne slúžili blížnym.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme, aby naši zomrelí <font color='#B71C1C'>(M.)</font>, ktorí nás predišli do večnosti, zakúsili milosrdnú lásku nebeského Otca.",
                    "Bože,<br>" +
                            "vypočuj naše prosby,<br>" +
                            "o ktoré ťa s vierou prosíme,<br>" +
                            "a daruj nám svojho Ducha Svätého.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"27", "5", "Bratia a sestry, ďakujme Bohu, že nás aj dnes pozval na Baránkovu hostinu. S dôverou mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, zjednoť svoj ľud, aby svojou jednotou svedčil o tvojej prítomnosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby svetská vrchnosť podporovala úctu k ľudskému životu od počatia až po prirodzenú smrť.<br>" +
                            "<font color='#B71C1C'>3.</font> Poteš trpiacich a daj, aby odvážne čelili úzkosti a zúfalstvu.<br>" +
                            "<font color='#B71C1C'>4.</font> Pomáhaj nám, aby sme sa prijímaním Eucharistie a čnostným životom bránili pred mocou zlého ducha.<br>" +
                            "<font color='#B71C1C'>5.</font> Daruj spásu všetkým zosnulým, ktorí sa usilovali kráčať v tomto živote s tebou.",
                    "Bože,<br>" +
                            "ty si poslal na svet svojho Syna,<br>" +
                            "aby nám zjavil tvoje kráľovstvo<br>" +
                            "slovom i skutkom;<br>" +
                            "daj, aby sme aj my svojím príkladom<br>" +
                            "svedčili o tebe.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"27", "6", "Bratia a sestry, Pán Ježiš vyzdvihuje všetkých, ktorí počúvajú a zachovávajú Božie slovo, a vyhlasuje ich za blahoslavených. Vrúcne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev: aby verne ohlasovala Božie slovo, ktoré je zdrojom večného života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za tých, čo vedú národy: aby si uvedomili, že ochrana kresťanských hodnôt úzko súvisí s mravnosťou spoločnosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za matky: aby viedli svoje deti k zachovávaniu Kristovej náuky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás tu prítomných: aby sa naša kresťanská viera stala inšpiráciou pre tých, ktorí sa ešte nerozhodli odovzdať svoj život do Božích rúk, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby ich milosrdný Boh voviedol do večnej slávy, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a na orodovanie tvojej i našej nebeskej Matky Márie<br>" +
                            "priveď nás k uskutočňovaniu tvojho slova.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"28", "A", "Bratia a sestry, v tejto spoločnej modlitbe na Pánovej hostine, na ktorú nás pozýva, ďakujme za všetky dobrodenia a prosme za spásu sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za svätú Cirkev: aby v sile Ducha Svätého ukazovala svetu pravé hodnoty, a tak pritiahla všetkých ľudí k Bohu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za predstavených národov: aby spolupracovali s Duchom Svätým, ktorý všetkých povoláva na svornosť a lásku, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za chorých: aby posilnení sviatosťou pomazania chorých mohli vernejšie plniť svoje poslanie v Cirkvi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás tu zhromaždených: aby sme boli vo svete nositeľmi pokoja, radosti a lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby im dobrotivý Boh otvoril brány nebies, kde ho budú velebiť so všetkými svätými, prosme Pána.",
                    "Pane, všemohúci Bože,<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a daj, aby sme aj my raz mali účasť na hostine<br>" +
                            "v nebeskom Jeruzaleme,<br>" +
                            "kde žiješ a kraľuješ na veky vekov."},
            {"28", "B", "Bratia a sestry, Pán Ježiš prisľúbil stonásobnú odmenu a večný život tomu, kto oslobodí svoje srdce od majetku a pripútanosti k tomu, čo nepatrí Bohu. Aj my ho vrúcne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Daj nášmu pápežovi <font color='#B71C1C'>M.</font> dobrých a verných pomocníkov, ktorí mu budú pomáhať vo vykonávaní náročného pastierskeho úradu Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Osvieť svojím Duchom predstavených prosperujúcich štátov, aby podľa tvojej výzvy pomáhali chudobnejším krajinám.<br>" +
                            "<font color='#B71C1C'>3.</font> Odmeň všetkých, ktorí ťa nasledujú celým srdcom, hojnými darmi svojej milosti.<br>" +
                            "<font color='#B71C1C'>4.</font> Pretvor naše srdcia poškvrnené hriechom, aby nás neovládalo lakomstvo a neúmerná túžba po hmotných dobrách tohto sveta.<br>" +
                            "<font color='#B71C1C'>5.</font> Svojich verných, ktorí pre teba opustili všetko, priveď do nebeskej vlasti, kde máš pre nich pripravenú odmenu.",
                    "Pane Ježišu,<br>" +
                            "sľubuješ večnú odmenu tým,<br>" +
                            "ktorí si viac vážia večné hodnoty ako pozemské;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daruj nám silu oslobodiť sa od všetkého,<br>" +
                            "čo nás oddeľuje od teba.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"28", "C", "Bratia a sestry, Pán Ježiš prišiel na svet, aby nás uzdravil svojou láskou. Pokorne mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, pomáhaj svojej Cirkvi v jej úsilí odstraňovať hlad a choroby vo svete.<br>" +
                            "<font color='#B71C1C'>2.</font> Vnukni všetkým kresťanom, aby sa s láskou starali o svojich chorých bratov a sestry.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj kňazom horlivosť a lásku, aby s otcovskou starostlivosťou pristupovali k tým, ktorí prijímajú sviatosť zmierenia.<br>" +
                            "<font color='#B71C1C'>4.</font> Odmeň námahu tých, ktorí zmierňujú utrpenie malomocným a nevyliečiteľne chorým.<br>" +
                            "<font color='#B71C1C'>5.</font> Zapáľ v našom <font color='#B71C1C'>(</font>farskom<font color='#B71C1C'>)</font> spoločenstve ducha milosrdnej lásky a služby blížnym.<br>" +
                            "<font color='#B71C1C'>6.</font> Daruj našim zosnulým <font color='#B71C1C'>(M.)</font> večný odpočinok v tvojom kráľovstve.",
                    "Pane Ježišu,<br>" +
                            "ty si nám poslal svojho Ducha lásky;<br>" +
                            "vyslyš naše prosby,<br>" +
                            "posilni nás jeho silou<br>" +
                            "a uzdrav naše telá i duše.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"28", "1", "Bratia a sestry, zvelebujme Boha, ktorý rád obdarúva svoj ľud, a prosme ho, aby vypočul naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, požehnávaj prácu nášho Svätého Otca <font color='#B71C1C'>M.</font> a všetkých biskupov, aby neohrozene viedli zverený ľud.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, vnukni predstaviteľom štátov zmysel pre pravé hodnoty, aby pracovali pre dobro všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, daruj utrápeným silu, aby vedeli vo svojich ťažkostiach nájsť správne východisko.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, daruj nám väčšiu lásku, aby sme tvoje slovo dokázali nielen počúvať, ale aj uskutočňovať.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, naplň naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo duchom úprimného pokánia.",
                    "Milosrdný Bože,<br>" +
                            "prosíme ťa, vypočuj prosby,<br>" +
                            "ktoré sme ti s pokorou a dôverou predniesli,<br>" +
                            "a daj, aby sme pri poslednom súde<br>" +
                            "mohli byť pripočítaní k tvojim vyvoleným.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"28", "2", "Bratia a sestry, otvorme srdcia mocnému a dobrému Bohu, ktorý nás miluje a vie, čo potrebujeme. Pokorne ho vzývajme a prosme ho, aby zhliadol na naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za svätú Cirkev: aby posilnená Kristovou pravdou viedla všetkých veriacich k úprimnému pokániu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za celý svet: aby bol uchránený od hladu a vojny, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za prenasledovaných a utláčaných: aby dosiahli slobodu a splnenie všetkých práv, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás tu zhromaždených: aby sme dobre a verne spravovali dary, ktorými nás Pán obdaril, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zosnulých <font color='#B71C1C'>(M.)</font>: aby boli pripočítaní k zástupu vyvolených, prosme Pána.",
                    "Milosrdný Bože,<br>" +
                            "s pokorou sme ti predniesli svoje prosby<br>" +
                            "a dúfame v tvoje prehojné milosrdenstvo;<br>" +
                            "vypočuj nás, keď ťa o to prosíme.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"28", "3", "Bratia a sestry, v tejto spoločnej modlitbe zjednoťme svoje hlasy a prednesme s úprimným srdcom všemohúcemu Bohu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za pápeža, biskupov a kňazov: aby slovom i príkladom viedli veriacich k spásonosnej kajúcnosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za tých, ktorí spravujú národy: aby odvádzali ľud od násilia, sebectva a nemravnosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za nedbalých a povrchných kresťanov: aby obnovili v sebe krstnú milosť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za deti stroskotaných manželstiev: aby im Božia milosť doplnila to, o čo prišli rozchodom rodičov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás všetkých: aby sme pohotovo odpovedali na Božie výzvy na svätosť, prosme Pána.",
                    "Bože,<br>" +
                            "ty dávaš všetkým ľuďom spásu a chceš,<br>" +
                            "aby nikto z nich nezahynul;<br>" +
                            "prosíme ťa, vypočuj naše pokorné prosby<br>" +
                            "a daj, aby bol celý svet naplnený pokojom a láskou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"28", "4", "Bratia a sestry, hodnota ľudského života závisí od toho, ako sa človek dokáže otvoriť Božej vôli. Prosme Boha, aby sme ju správne pochopili a dokázali podľa nej žiť.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, chráň a svojou pomocou sprevádzaj nášho Svätého Otca <font color='#B71C1C'>M.</font>, aby oslobodený od nepriateľských útokov hlásal národom tvoju blahozvesť.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, naplň múdrosťou a bázňou voči sebe predstaviteľov štátov, aby rešpektovali dôstojnosť a svedomie každého človeka.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, zošli na prenasledovaných kresťanov Ducha sily, aby s tvojou pomocou vytrvali v pravej viere.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, daj, nech sa preliata krv mučeníkov stane základom na vznik nových kresťanských komunít.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, daruj nášmu <font color='#B71C1C'>(</font>farskému<font color='#B71C1C'>)</font> spoločenstvu ducha úprimnej nábožnosti.",
                    "Všemohúci Bože,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a stoj pri tých,<br>" +
                            "ktorí sú prenasledovaní pre tvoje meno.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"28", "5", "Bratia a sestry, s dôverou sa modlime k Pánu Bohu, ktorý sa s láskou stará o všetkých ľudí, a prosme ho.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby sa Kristova Cirkev stále viac očisťovala a pripodobňovala svojmu zakladateľovi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby si zákonodarcovia a predstavitelia štátnej moci uvedomili cenu každého ľudského života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby sa všetci rozhnevaní zmierili a odstránili zo svojich sŕdc zlo a nenávisť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby pyšní a sebavedomí ľudia objavili duchovnú veľkosť chudoby, miernosti, čistoty a milosrdenstva, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby veriaci <font color='#B71C1C'>(</font>našej farnosti<font color='#B71C1C'>)</font> pomocou Božej milosti odolávali pokušeniam a nástrahám diabla, prosme Pána.",
                    "Láskavý Bože,<br>" +
                            "ty sa stále staráš o svoje stvorenia<br>" +
                            "a zahŕňaš ich láskou;<br>" +
                            "milostivo vypočuj naše prosby,<br>" +
                            "ktoré sme ti predniesli<br>" +
                            "v spoločenstve s Kristom, naším Pánom,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"28", "6", "Bratia a sestry, spoločne prosme Pána Ježiša Krista, veď on štedro udeľuje svoje dary tým, ktorí ho prosia.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, zosielaj svojej Cirkvi Ducha Svätého, aby verne a nebojácne svedčila o tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, daruj všetkým kresťanom silu a múdrosť, aby ťa nikdy nezapreli.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, chráň nás od nekajúcnosti, aby sme nezotrvávali v hriechoch.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, daj, aby veriaci našej farnosti spoznali tvoje milosrdenstvo a vo sviatosti zmierenia dosiahli tvoje odpustenie.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, uveď našich zosnulých <font color='#B71C1C'>(M.)</font> do svojho nebeského kráľovstva.",
                    "Pane Ježišu,<br>" +
                            "na príhovor Panny Márie<br>" +
                            "láskavo vypočuj naše prosby<br>" +
                            "a neustále nás napĺňaj svojimi milosťami.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"29", "A", "Bratia a sestry, Pán Ježiš nás učí správnemu postoju ku všetkým veciam. Prosme ho, aby sme vedeli vždy dávať ľuďom to, čo im patrí, a Bohu to, čo je Božie.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, ty si náš učiteľ; pomáhaj nášmu pápežovi <font color='#B71C1C'>M.</font> a nášmu biskupovi <font color='#B71C1C'>M.</font>, aby boli vernými učiteľmi tvojej pravdy.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, ty si náš Pán a Boh; veď svojím Duchom predstaviteľov národov, aby vždy správne rozhodovali a konali v prospech ľudí.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, ty nás učíš spravodlivosti a pravde; daj, aby sa na celom svete politické voľby konali spravodlivo, transparentne, čestne a slobodne.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, ty si svetlo svojich veriacich; daj všetkým kresťanom milosť, aby si verne plnili záväzky vyplývajúce zo sviatosti krstu.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, ty si cesta k Otcovi; buď milosrdný našim zosnulým <font color='#B71C1C'>(M.)</font> a láskavo im otvor brány nebies.",
                    "Pane Ježišu,<br>" +
                            "láskavo vypočuj naše prosby<br>" +
                            "a daruj nám svoju múdrosť,<br>" +
                            "aby sme vždy vedeli dávať Bohu, čo je Božie.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"29", "B", "Bratia a sestry, Ježiš Kristus, večný veľkňaz, neprišiel, aby sa dal obsluhovať, ale aby slúžil. Aj my, poučení jeho slovom a posilnení jeho príkladom, prednesme Bohu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Svätého Otca <font color='#B71C1C'>M.</font>, za nášho biskupa <font color='#B71C1C'>M.</font> a za všetkých biskupov a kňazov: aby službou, ktorá im bola zverená, ukazovali svojim veriacim večné hodnoty, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za predstaviteľov verejnej moci: aby sa vždy usilovali o pokoj, dobro i zdravý rast spoločnosti a nezabúdali pritom ani na tých najbiednejších, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za naše rodiny: aby sa v nich vzmáhal duch služby a dobročinnosti voči sebe navzájom i voči všetkým ľuďom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za trpiacich, chorých a sužovaných akýmkoľvek trápením: aby stretávali ľudí, ktorí im radi poslúžia, pomôžu a preukážu lásku, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu zhromaždených: aby sme hmotné a duchovné dobrá vedeli nielen prijímať, ale ich aj odovzdávať ďalej, prosme Pána.",
                    "Bože,<br>" +
                            "vypočuj prosby svojho ľudu,<br>" +
                            "ktorý ťa prosí o ducha služby a lásky<br>" +
                            "podľa slov a príkladu tvojho Syna,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"29", "C", "Bratia a sestry, dobrotivý Boh je spravodlivý sudca i milosrdný Otec a chce obrániť každého, kto k nemu volá dňom i nocou. Preto ho vytrvalo a pokorne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, obráň svojich vyvolených.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bráň svoju Cirkev od všetkých protivníkov, ktorí jej ubližujú a kazia jej dielo vo svete.<br>" +
                            "<font color='#B71C1C'>2.</font> Vnukni verejným činiteľom, aby pomáhali tým, ktorí sú utláčaní z dôvodu odlišného vyznania, jazyka či farby pleti.<br>" +
                            "<font color='#B71C1C'>3.</font> Drž pevne tých, ktorí trpia útlakom zlého ducha, aby pocítili, že ich nedovolíš skúšať nad ich sily.<br>" +
                            "<font color='#B71C1C'>4.</font> Obdaruj nás svojou milosťou, aby sme mali vrúcnu a živú lásku k Svätému písmu.<br>" +
                            "<font color='#B71C1C'>5.</font> Posilňuj nás tu zhromaždených, aby sme sa vždy dokázali modliť úprimne a s dôverou.<br>" +
                            "<font color='#B71C1C'>6.</font> Priveď do neba duše všetkých, ktorí počas života s láskou prijímali aj tých, ktorí im ubližovali.",
                    "Láskavý Bože,<br>" +
                            "ty vyslyšíš prosby svojich veriacich,<br>" +
                            "čo dňom i nocou volajú k tebe;<br>" +
                            "rozmnož v nás vieru v silu modlitby<br>" +
                            "a nauč nás modliť sa vytrvalo a s dôverou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"29", "1", "Bratia a sestry, Ježiš Kristus nás varuje pred chamtivosťou i márnivosťou a upriamuje náš zrak na večné hodnoty. Preto pozdvihnime svoje srdcia k nebu a pokorne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za predstaviteľov Cirkvi: aby vždy vedeli ukazovať veriacim krásu a nepominuteľnosť duchovných hodnôt, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za správcov verejných vecí: aby prostriedky, ktoré sú im zverené, vedeli využívať múdro a pre dobro všetkých, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za rodiny rozvadené majetkovými a dedičskými spormi: aby si uvedomili pominuteľnosť pozemských vecí a život na zemi prežívali v atmosfére pokoja, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za chudobných: aby si napriek nedostatku hmotných prostriedkov vedeli zhromažďovať duchovné bohatstvo v nebi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: aby sme boli pripravení na deň, keď nás Boh povolá do večnosti, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "vypočuj prosby svojho ľudu,<br>" +
                            "keď ťa prosí o duchovné bohatstvo,<br>" +
                            "ktoré sa mu stane zárukou spoločenstva s tebou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"29", "2", "Bratia a sestry, Pán Ježiš nás vyzýva, aby sme bdeli a modlili sa, a tak očakávali jeho príchod. S dôverou ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, pripravuj nás na tvoj príchod.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Posilňuj všetkých biskupov a kňazov, aby boli živým príkladom pripravenosti na tvoj príchod.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby si tí, ktorí spravujú štát, boli vedomí svojej zodpovednosti a svedomito si plnili svoje povinnosti voči ľuďom.<br>" +
                            "<font color='#B71C1C'>3.</font> Posilňuj svojou prítomnosťou chorých, ktorí svoju chorobu vnímajú ako prípravu na večný život.<br>" +
                            "<font color='#B71C1C'>4.</font> Veď nás, aby sme na tvoj príchod nečakali v strachu, ale aby sme s radosťou pracovali na šírení tvojho kráľovstva.<br>" +
                            "<font color='#B71C1C'>5.</font> Buď milosrdný zomrelým <font color='#B71C1C'>(M.)</font>, ktorí sa počas svojho života usilovali žiť podľa tvojich rád.",
                    "Pane Ježišu,<br>" +
                            "ty znovu prídeš v deň, ktorý nepoznáme,<br>" +
                            "a v hodine, o ktorej sa nenazdáme;<br>" +
                            "nedovoľ, aby nás ten deň prekvapil,<br>" +
                            "ale daj, aby sme sa naň tešili s pripraveným srdcom.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"29", "3", "Bratia a sestry, prosme nášho nebeského Otca, aby nás posilňoval a dal nám pokorné srdce na radostné očakávanie príchodu jeho Syna Ježiša Krista.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za nášho pápeža <font color='#B71C1C'>M.</font>, aby viedol Cirkev múdro a nábožne, a tak nás pripravoval na stretnutie s Kristom.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za biskupov, kňazov a diakonov, aby pravdivo svedčili o evanjeliu a zbožne i vytrvalo slúžili veriacim.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za snúbencov, aby pamätali na to, že najlepšou prípravou na manželstvo je čistota srdca, duch obetavosti a modlitba.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za nás samých, aby sme nepodľahli nástrahám tohto sveta.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za zomrelých <font color='#B71C1C'>(M.)</font>, aby ich za dobré skutky Pán prijal do večnej slávy.",
                    "Všemohúci a večný Bože,<br>" +
                            "prijmi naše pokorné prosby,<br>" +
                            "odvráť od nás všetko škodlivé<br>" +
                            "a udeľ nám to,<br>" +
                            "čo potrebujeme pre telo i dušu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"29", "4", "Bratia a sestry, zjednotení vo viere, nádeji a láske obráťme sa pokorne na nášho nebeského Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby žila z Božieho slova a bola plná útechy a sily.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za národy sveta, aby túžili po jednote a pokoji.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za všetkých veriacich, aby medzi nimi vládla zhoda a vzájomná pomoc.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za rodičov, ktorých deti odpadli od viery, aby vytrvalo prosili za ich obrátenie.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás samých, aby sa náš život zhodoval s pravdami viery.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za zomrelých <font color='#B71C1C'>(M.)</font>, aby im Boh dal šťastlivú večnosť.",
                    "Všemohúci a večný Bože,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomôž nám svojou láskou,<br>" +
                            "aby sme sa mohli radovať<br>" +
                            "z dosiahnutia tvojho milosrdenstva.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"29", "5", "Bratia a sestry, v spoločnom očakávaní príchodu Ježiša Krista prosme nášho nebeského Otca, aby sme múdro využívali zverený čas. Spoločne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev: aby vedená Svätým Otcom <font color='#B71C1C'>M.</font> bola viditeľným znamením Kristovho kráľovstva, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za rodiny: aby v nich vyrastali nábožní kresťania, ktorí budú odvážne brániť hodnoty viery a mravnosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za mladých ľudí: aby odkrývali v sebe prirodzený zákon daný Bohom a pozorne ho počúvali, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás tu zhromaždených: aby sme žili verní svojmu povolaniu a boli milosrdní jeden voči druhému, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby boli očistení od trestov za hriechy, ktoré ich ešte ťažia, a tak mohli vojsť do Božieho kráľovstva, prosme Pána.",
                    "Vznešený Bože,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pomáhaj nám na našej životnej ceste,<br>" +
                            "aby sme sa čím viac stávali<br>" +
                            "verným obrazom tvojho Syna pre iných.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"29", "6", "Bratia a sestry, Pán nás povzbudzuje, aby sme žili zodpovedne a boli vždy pripravení preukázať svetu nezištnú lásku. Prosme ho, aby naše srdcia napĺňal svojou milosťou.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zmiluj sa.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, veď pastierov svojej Cirkvi, aby verne viedli tvoj ľud cez všetky protivenstvá a nepodliehali tlaku kompromisov.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, daj, nech všetci kresťania s úprimným srdcom hľadajú tvoju tvár vo svojich trpiacich bratoch a sestrách.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, daj, nech sa tí, ktorí nežijú sviatostným životom, cez sviatosť zmierenia a Eucharistiu stávajú živými bunkami tvojho tajomného tela.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, daj, aby sme v hodine smrti boli pripravení na stretnutie s tebou a umierali v posväcujúcej milosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, prijmi do neba tých, na ktorých si už nikto menovite nespomína, a daj im večnú spásu.",
                    "Pane Ježišu,<br>" +
                            "ty nám dávaš silu vstať z hriechu;<br>" +
                            "vlej nám do sŕdc vieru, keď nás zasiahnu pochybnosti,<br>" +
                            "nádej, keď sa všetko bude zdať zbytočné,<br>" +
                            "a lásku, keď nás budú nenávidieť pre tvoje meno.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"30", "A", "Bratia a sestry, Boh sa dáva poznať tým, ktorí ho nadovšetko milujú a preukazujú dobro svojim blížnym. Prosme nášho nebeského Otca, aby nás naučil milovať jeho nadovšetko a blížneho ako seba samého.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, naplň Cirkev svojím Duchom, aby vždy svedčila o tvojej láske.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilňuj poslancov Európskeho parlamentu, aby svojimi hlasmi podporovali konkrétne projekty pomoci chudobným.<br>" +
                            "<font color='#B71C1C'>3.</font> Nauč nás ochotne a konkrétne pomáhať tým, ktorí trpia hladom a chorobami.<br>" +
                            "<font color='#B71C1C'>4.</font> Rozvíjaj medzi manželmi i snúbencami čistú, úprimnú a obetavú lásku.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj, aby učitelia teológie a katechéti boli naplnení láskou k pravde a žili čnostným životom.<br>" +
                            "<font color='#B71C1C'>6.</font> Udeľ našim zosnulým <font color='#B71C1C'>(M.)</font> večnú radosť v tvojom kráľovstve.",
                    "Všemohúci Bože,<br>" +
                            "ty si nám preukázal najväčšiu lásku,<br>" +
                            "keď si nám daroval svojho Syna;<br>" +
                            "daj, aby sme tak ako on<br>" +
                            "milovali teba i svojich blížnych.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "B", "Bratia a sestry, slová dnešného evanjelia dokazujú, že Ježiš neuzdravuje len choroby tela, ale celého človeka. Prednesme mu svoje prosby ako prejav viery v jeho moc uzdravovať svet aj v dnešnej dobe.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa za predstavených Cirkvi, aby svoje poslanie vykonávali vo svetle viery a viedli Boží ľud správnou cestou k tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, prosíme ťa za kňazov, ktorí pôsobia v krajinách náboženskej neslobody, aby ich odvaha zvíťazila nad hrozbami a nástrahami tohto sveta.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, prosíme ťa za mladých ľudí, aby si uvedomovali dôsledky nesprávneho konania, ktorým poškodzujú svoje zdravie.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, prosíme ťa za všetkých ľudí, aby sa starali o svojich starých a nevládnych rodičov a umožnili im aj účasť na bohoslužbách.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prosíme ťa za nás samých, aby sme skutkami a svedectvom života dávali dobrý príklad svojim najbližším.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane, priveď našich zomrelých <font color='#B71C1C'>(M.)</font> do slávy neba, aby sa naveky tešili spolu s tebou.",
                    "Pane Ježišu,<br>" +
                            "ty sa prihováraš za nás u Otca;<br>" +
                            "prijmi naše pokorné prosby, ktoré ti predkladáme,<br>" +
                            "a buď nám svetlom,<br>" +
                            "aby sme raz mohli vidieť jas tvojej tváre.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"30", "C", "Bratia a sestry, modlitba pokorného srdca preniká k Bohu. Prosme Pána, aby nám odpustil hriechy a vypočul naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za pápeža, biskupov a kňazov: aby svojím svätým životom ukazovali cestu ku Kristovi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za tých, čo spravujú národy: aby si uvedomovali, že ich postavenie má byť pokornou službou blížnym, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých ľudí: aby sa nevyvyšovali nad druhých a nepohŕdali inými, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za kajúcnikov: aby spoznali veľkú lásku, ktorou ich Boh prijíma do svojho náručia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu zhromaždených: aby sme vždy prichádzali na svätú omšu s čistým srdcom, a tak sa mohli zúčastniť aj na eucharistickom pokrme, prosme Pána.",
                    "Ježišu, tichý a pokorný srdcom,<br>" +
                            "uznávame, že sme často pyšní<br>" +
                            "a pokladáme sa za lepších od iných;<br>" +
                            "obráť sa k nám, odpusť nám viny<br>" +
                            "a milostivo vyslyš naše prosby.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"30", "1", "Bratia a sestry, dobrotivý Boh nás uzdravuje a dáva nám nový život. Preto mu spoločne predložme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za biskupov, kňazov a diakonov, aby s láskou vysluhovali sviatosti, a tak pomáhali veriacim k plnosti kresťanského života.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za predstaviteľov národov, aby podporovali zákony, ktoré napomáhajú rozvoj spravodlivosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za všetkých chorých a trpiacich, aby s vierou prijímali kríž bolesti a v Kristovi nachádzali nádej a posilu.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za veriacich našich farností, aby modlitbou a čítaním Svätého písma hlbšie vnikali do Kristovej radostnej zvesti.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za nás tu zhromaždených, aby sme sa s láskou starali o našich starých i chorých a preukazovali im takú lásku, akej nás učí Kristus.",
                    "Milosrdný Bože,<br>" +
                            "ty milostivo vedieš svojich veriacich k večnosti;<br>" +
                            "zhliadni na naše prosby,<br>" +
                            "aby sme sa mohli radovať<br>" +
                            "zo všetkých obdivuhodných skutkov,<br>" +
                            "ktoré konáš vo svete.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "2", "Bratia a sestry, všemohúci Boh nám zjavil tajomstvá Božieho kráľovstva. Prosme ho, aby jeho kráľovstvo v nás rástlo a vzmáhalo sa.",
                    "<font color='#B71C1C'>(</font>Volajme: Príď tvoje kráľovstvo, Bože.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, prosíme ťa za Cirkev a jej predstaviteľov, aby svedectvom svojho života sprítomňovali tvoje kráľovstvo medzi ľuďmi.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za tých, ktorí spravujú našu vlasť, aby ju svojím konaním a rozhodnutiami privádzali k rozvoju.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za televíznych a rozhlasových moderátorov, aby rešpektovali etické zásady vyjadrovania a šírili vo verejnosti mravné dobro.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za chorých a trpiacich, aby pochopili, že ich bolesť a utrpenie nie sú zbytočné, lebo spolu s Kristom prispievajú k spáse sveta.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, prosíme ťa aj za seba samých, aby sme sa navzájom posilňovali vo viere, nádeji a láske.",
                    "Milovaný Otče,<br>" +
                            "ty v nás neustále buduješ svoje kráľovstvo;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme ho raz mohli v plnosti prežívať<br>" +
                            "u teba vo večnosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "3", "Bratia a sestry, Pán Ježiš nás učil, že sa máme usilovať vojsť tesnou bránou do nebeského kráľovstva. Preto s úprimným srdcom pozdvihnime oči k nebu a úprimne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, prosíme ťa za nášho pápeža <font color='#B71C1C'>M.</font> a za nášho biskupa <font color='#B71C1C'>M.</font>, aby vedení tvojím Duchom neochvejne viedli tvoju Cirkev.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, prosíme ťa členov miestnych samospráv, aby boli vnímaví na potreby všetkých ľudí v našich mestách a obciach.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, prosíme ťa za nezamestnaných, aby si našli vhodnú prácu, a tak sa mohli dôstojne postarať o svoje rodiny.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, prosíme ťa aj za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme často prijímali z tvojho svätého oltára, a tak si zabezpečili večnú spásu.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, prosíme ťa za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby boli prijatí do nebeského Jeruzalema a pripočítaní k zástupu svätých.",
                    "Dobrotivý Ježišu,<br>" +
                            "zhliadni na prosby svojho ľudu,<br>" +
                            "aby mohol rásť i zdokonaľovať sa v tvojej láske<br>" +
                            "a vytrvalo ísť po ceste do nebeského kráľovstva.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"30", "4", "Bratia a sestry, každé úprimné stretnutie s Bohom prináša človeku duchovný úžitok. S oddaným srdcom mu aj my prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, veď kňazov ku každodennému vnútornému a hlbokému stretnutiu s tebou.<br>" +
                            "<font color='#B71C1C'>2.</font> Nauč ľudí vážiť si dar života s vedomím, že všetko pochádza od teba.<br>" +
                            "<font color='#B71C1C'>3.</font> Priveď k sebe hriešnikov a daj im spoznať svoje milosrdenstvo.<br>" +
                            "<font color='#B71C1C'>4.</font> Nedopusť, aby bezcharakterní ľudia ovládali ostatných a zvádzali ich na zlé.<br>" +
                            "<font color='#B71C1C'>5.</font> Povzbuď naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo do radostného prijatia tých, ktorí opäť nachádzajú cestu k tebe a Cirkvi.<br>" +
                            "<font color='#B71C1C'>6.</font> Dopraj našim zomrelým <font color='#B71C1C'>(M.)</font> večné prebývanie v tvojej prítomnosti.",
                    "Bože, zdroj života a radosti,<br>" +
                            "príď do našich sŕdc i do našich domovov<br>" +
                            "a svojou milosťou upevni naše spoločenstvo s tebou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "5", "Bratia a sestry, Ježiš Kristus, sila trpiacich, prišiel na tento svet, aby nám dal nový život. Prosme pokorne o tento veľký dar.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, žehnaj a posilňuj Svätého Otca <font color='#B71C1C'>M.</font> i nášho biskupa <font color='#B71C1C'>M.</font> a všetkých služobníkov Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomáhaj poslancom Národnej rady Slovenskej republiky, aby rozhodovali spravodlivo a múdro.<br>" +
                            "<font color='#B71C1C'>3.</font> Žehnaj všetkých kresťanov, ktorí sa usilujú zmierniť biedu vo svete.<br>" +
                            "<font color='#B71C1C'>4.</font> Daruj všetkým nevyliečiteľne chorým odvahu, aby dokázali niesť svoj kríž.<br>" +
                            "<font color='#B71C1C'>5.</font> Požehnaj tých, čo pomáhajú nevidiacim a robia ich život radostným.<br>" +
                            "<font color='#B71C1C'>6.</font> Roznecuj v našom <font color='#B71C1C'>(</font>farskom<font color='#B71C1C'>)</font> spoločenstve ducha pokánia.<br>" +
                            "<font color='#B71C1C'>7.</font> Priveď našich zosnulých <font color='#B71C1C'>(M.)</font> do slávy nového života.",
                    "Pane Ježišu,<br>" +
                            "ty si nekonečne milosrdný a láskavý;<br>" +
                            "zľutuj sa nad nami,<br>" +
                            "daj nám hojnosť svojich darov<br>" +
                            "a silu kráčať cestou života.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"30", "6", "Bratia a sestry, aj my sme pozvaní na eucharistickú hostinu nebeského Ženícha. Prosme v tejto chvíli o pokoru a čisté srdce, aby sme účasťou na tejto hostine dosiahli prisľúbené dary milosti.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, daj nám tiché a pokorné srdce.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Kristovu nevestu Cirkev, aby sa po všetky dni okrášľovala dobrými skutkami pre svojho Ženícha.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za predstaviteľov štátov Európskej únie, aby si navzájom bratsky pomáhali.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za všetky deti na celom svete, aby mali vždy dostatok chleba a dobrú výchovu.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za naše rodiny, aby žili v láske, ktorá všetko znáša, všetko verí, všetko dúfa a všetko vydrží.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za nás tu prítomných, aby Boh raz odmenil pokoru nášho srdca slávou večného kráľovstva.",
                    "Pane Ježišu Kriste,<br>" +
                            "vypočuj prosby pokorného ľudu,<br>" +
                            "ktorý sa ti chce pripodobňovať v tvojom ponížení,<br>" +
                            "aby si ho raz mohol povýšiť vo večnosti.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"31", "A", "Bratia a sestry, Božie slovo, ktoré pôsobí v našich srdciach, nás vychováva a učí správnemu životnému postoju. Prosme Pána, aby nás i všetkých ľudí viedol cestou spásy.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daruj Cirkvi a jej predstaveným vnímavosť na znamenia čias.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby politici plnili sľuby, ktoré dali ľuďom pred voľbami.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj nám kňazov, ktorí budú svojím dôsledným životom upevňovať tvoje slovo v srdciach veriacich.<br>" +
                            "<font color='#B71C1C'>4.</font> Veď vychovávateľov v internátoch, aby pristupovali k mladým ľuďom s citlivým porozumením.<br>" +
                            "<font color='#B71C1C'>5.</font> Posilni tých, ktorí opustili Cirkev pre pohoršenia, aby našli cestu k tebe a povzniesli sa nad ľudskú slabosť.<br>" +
                            "<font color='#B71C1C'>6.</font> Upevňuj v našej farnosti povedomie spoločenstva jednej duchovnej rodiny.",
                    "Bože Otče,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme v pokore a láske slúžili tebe<br>" +
                            "vo svojich bratoch a sestrách.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "B", "Bratia a sestry, v tejto spoločnej modlitbe prosme Pána, aby sme sa naučili milovať Pána Boha z celého srdca a blížneho ako seba samého.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby Cirkev tvorila spoločenstvo, v ktorom sa ľudia môžu stretnúť s Kristom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby všetci ľudia čoraz lepšie chápali, že Boh ich stvoril z lásky a na cestu lásky ich neprestajne volá, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby si hnevníci uvedomili, že nemôžu milovať Boha, keď nenávidia blížneho, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby si naši snúbenci neplietli pravú lásku s náruživosťou a sebectvom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby kresťanské rodiny boli malými cirkvami, miestami Kristovej prítomnosti medzi ľuďmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Aby naši zosnulí <font color='#B71C1C'>(M.)</font> mohli hľadieť na Božiu tvár, prosme Pána.",
                    "Otče, svet je chudobný na lásku;<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a daj, aby sme od tvojho oltára,<br>" +
                            "na ktorom sa sprítomňuje obeta kríža,<br>" +
                            "šírili opravdivú lásku k tebe a k blížnym.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "C", "Bratia a sestry, Zachej túžil vidieť Ježiša a prijal ho do svojho domu. V spoločnej modlitbe otvorme mu aj my svoje srdcia a vrúcne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby kňazi vysluhovaním sviatosti zmierenia privádzali ľudí k opravdivosti viery, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby boli colníci a policajti vo svojej práci čestní a svedomití, a tak prispievali k bezpečnosti našej krajiny, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby tí, ktorí stratili vieru, opäť zatúžili po Bohu a jeho blízkosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sa bohatí ľudia zachránili pre Božie kráľovstvo konkrétnou pomocou chudobným, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme sa naučili umeniu milovať hriešnikov a odmietať hriech, prosme Pána.",
                    "Bože Otče, zhliadni na naše prosby<br>" +
                            "a daj, aby sme mali spoločnú radosť<br>" +
                            "z obrátenia hriešnikov<br>" +
                            "a z tvojho milosrdenstva.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "1", "Bratia a sestry, Pán nás pozýva na svoju hostinu a učí nás nezištne konať dobro. Otvorme mu svoje srdcia a spoločne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj, aby sa medzi kresťanmi vzmáhal duch vzájomnej obety a ochotnej pomoci.<br>" +
                            "<font color='#B71C1C'>2.</font> Povzbudzuj štátnikov do vytrvalej služby a do úsilia o spravodlivosť a pokoj vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Upevňuj nádej chudobných i chorých a zjavuj im svoju dobrotu.<br>" +
                            "<font color='#B71C1C'>4.</font> Obdaruj prevádzkovateľov stravovacích zariadení duchom pohostinnosti a nauč ich byť príkladnými hostiteľmi svojich návštevníkov.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás nezištne pomáhať svojim bratom a sestrám a byť im oporou a útechou.<br>" +
                            "<font color='#B71C1C'>6.</font> Priveď k sebe našich zomrelých <font color='#B71C1C'>(M.)</font> a daj im účasť na nebeskej hostine.",
                    "Pane Ježišu,<br>" +
                            "tvoje láskavé srdce<br>" +
                            "je otvorené pre všetkých, ktorí ťa chcú poznať;<br>" +
                            "prijmi naše modlitby<br>" +
                            "a preukazuj nám svoju nekonečnú lásku.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"31", "2", "Bratia a sestry, Pán nás všetkých volá na svoju hostinu. Prijali sme jeho pozvanie, a preto mu prednesme svoje pokorné prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby všetci kňazi vrúcne ďakovali za pozvanie nasledovať Krista cestou sviatostnej služby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby bohatšie krajiny pomáhali zmierňovať hlad a biedu v oblastiach, ktoré sú postihnuté prírodnými katastrofami, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby tí, ktorí z ľahostajnosti zanedbávajú účasť na bohoslužbách, pocítili opätovné pozvanie na eucharistickú hostinu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby ľudia preťažení nadmernými povinnosťami a unavení tempom života v modlitbe pookriali a našli novú silu do života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zomrelí <font color='#B71C1C'>(M.)</font> mali účasť na večnej nebeskej hostine, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "ty si nám dal v Eucharistii seba samého;<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme sa stali hodnými tohto tvojho daru.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"31", "3", "Bratia a sestry, nasledovanie Krista je cesta namáhavá a ťažká, ale prináša hojné duchovné ovocie. Prosme nebeského Otca o silu žiť podľa Kristovho učenia.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Cirkev, aby nasledovaním Kristovho života vydávala svedectvo o jeho vykupiteľskom diele.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za národy, aby uprednostňovali mierové riešenie sporov pred vojnou a ozbrojenými útokmi.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za telesne a duševne postihnutých, aby niesli svoj kríž obetavo a svoje utrpenie spájali s Kristovým utrpením.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za seba samých, aby sme mali správne životné hodnoty a vedeli sa zriekať toho, čo prekáža našej spáse.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby Kristus naplnil ich život večnou odmenou.",
                    "Pane a Bože náš,<br>" +
                            "ty najlepšie vieš, čo potrebujeme na spásu;<br>" +
                            "vypočuj naše prosby,<br>" +
                            "aby sme mohli žiť na tvoju chválu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "4", "Bratia a sestry, Boh nás nekonečne miluje a ponúka nám odpustenie našich hriechov. S vďačným srdcom a s pokorou mu prednesme svoje modlitby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, ochraňuj nášho Svätého Otca <font color='#B71C1C'>M.</font> a daruj mu silu viesť Cirkev pri budovaní tvojho kráľovstva.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, obráť srdcia štátnikov, ktorí nepracujú na rozvoji spoločného dobra, aby napravili svoje konanie.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, povzbudzuj zamestnancov v nápravnovýchovných zariadeniach, aby sa usilovali privádzať svojich zverencov na správnu cestu života.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, pomáhaj nám zodpovedne sa pripravovať na sviatosť zmierenia spytovaním svedomia, ľútosťou a správnym predsavzatím.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, odpusť našim zomrelým <font color='#B71C1C'>(M.)</font> tresty za hriechy a daj, aby naveky mohli prebývať s tebou v nebeskom kráľovstve.",
                    "Bože a Otče náš,<br>" +
                            "ty si nesmierne milostivý<br>" +
                            "a privádzaš nás k zmiereniu s tebou;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a otvor naše vnútro,<br>" +
                            "aby sme dosiahli tvoje milosrdenstvo.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "5", "Bratia a sestry, dokonalosť Božej lásky presahuje naše poznanie. Vo viere a nádeji sa spoločne modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za všetkých kresťanov, aby ich úprimnosť modlitby a sviatostného života hlbšie spájala so živým Kristom.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za bohaté krajiny, aby veľkosť ich hmotného bohatstva nebola prekážkou rozvoja duchovných hodnôt.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za všetkých pracujúcich, aby svoju prácu vykonávali čestne a ohľaduplne voči svojim spolupracovníkom.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za ľudí nečestne hospodáriacich s majetkom, aby v duchu evanjelia zmenili svoje zmýšľanie a zodpovedne spravovali to, čo im bolo zverené.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za naše rodiny, aby odpustenie a vzájomné pochopenie nechýbali v každodennej komunikácii medzi jednotlivými členmi domácností.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby po pozemskej púti získali večný nebeský domov.",
                    "Bože, milosrdný Otče,<br>" +
                            "ty vedieš naše kroky<br>" +
                            "a poznáš naše úmysly;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a buď nám stálou oporou v živote.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "6", "Bratia a sestry, Boh vidí aj v skrytosti a pozná naše srdcia. Prednesme mu svoje prosby a vrúcne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetkých biskupov a kňazov: aby sa vždy tešili zo svojho povolania a uskutočňovali ho s nerozdeleným srdcom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetkých zákonodarcov: aby zostávali verní morálnym princípom a zákonom o dôstojnosti ľudskej osoby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých obchodníkov: aby ochotne dodržiavali zásady čestného a etického obchodovania, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za všetkých tu prítomných: aby sme zostávali verní Kristovi podľa vzoru Panny Márie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za všetkých zomrelých: aby bola ich viera vo večný život zavŕšená prijatím do spoločenstva blažených v nebi, prosme Pána.",
                    "Bože, náš najláskavejší Otec,<br>" +
                            "tvoje dobrodenia sú nesmierne;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby v nás rástla dôvera v teba<br>" +
                            "a v tvoju otcovskú starostlivosť o nás.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"32", "A", "Bratia a sestry, každý náš deň má byť krokom na svadobnú hostinu v nebeskom kráľovstve. Prosme Pána, aby sme boli vždy pripravení na stretnutie s ním a aby sa v nás upevnila viera vo večný život a vo vzkriesenie tela.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj, aby tvoji veriaci bedlivo a so svetlom viery očakávali tvoj príchod.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, daj všetkým ľuďom múdrosť, aby pamätali na pominuteľnosť pozemského života a nepremárnili ani jednu príležitosť konať dobro.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, daj, aby bol náš národ bohatý na ľudí, ktorí uprednostňujú hodnoty kresťanského života pred osobným ziskom a blahobytom.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, pomáhaj mladým ľuďom nachádzať pravý zmysel života a učiť sa vzájomnému porozumeniu, ochotnej pomoci a nezištnej láske.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, otvor bránu nebeského kráľovstva všetkým zosnulým, ktorí s radosťou vstupovali do tvojho chrámu.",
                    "Bože, prijmi naše prosby<br>" +
                            "a vzbuď v nás ducha bedlivosti,<br>" +
                            "aby sme boli pripravení<br>" +
                            "stretnúť sa s tvojím Synom Ježišom Kristom,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"32", "B", "Bratia a sestry, Pán Ježiš nám dáva za príklad chudobnú vdovu, ktorá celú svoju existenciu zverila Bohu. Spoľahnime sa na neho aj my, keď sa spoločne modlíme za seba i za celý svet.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za pápeža <font color='#B71C1C'>M.</font>, nášho biskupa <font color='#B71C1C'>M.</font> a všetkých kňazov, aby úplným odovzdaním seba službe evanjeliu pripravovali svet na druhý Kristov príchod.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za našu vlasť, aby bola uchránená od vnútorných i vonkajších nebezpečenstiev a rozvíjala duchovné a kultúrne hodnoty.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za seniorov, vdovy a siroty, aby vždy pociťovali Kristovu prítomnosť v apoštoloch dobroty.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za nás zhromaždených, aby sme v duchu lásky prispievali na potreby nášho chrámu a na zveľaďovanie našich bohoslužieb.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za našich zosnulých, ktorí zomreli v tomto roku, aby videli Božiu tvár v nebeskej otčine.",
                    "Bože Otče,<br>" +
                            "zmiluj sa nad nami<br>" +
                            "a vyslyš naše prosby;<br>" +
                            "pomáhaj nám žiť sväto a konať dobré skutky,<br>" +
                            "aby sme v deň súdu<br>" +
                            "stáli po pravici tvojho Syna Ježiša Krista,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"32", "C", "Bratia a sestry, náš Boh nie je Bohom mŕtvych, ale živých. Prosme ho teda za všetko, čo robí náš život hodnotným a zmysluplným.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zmiluj sa.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby mala odvahu hlásať pravdu o Kristovom zmŕtvychvstaní.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za sudcov a za tých, ktorí rozhodujú o verejných veciach, aby sa nedali zastrašiť a hľadali pravdu i spravodlivosť.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za mladých ľudí, ktorí trpia pocitom beznádeje a stratou zmyslu života, aby sa neuchyľovali k drogám a násiliu, ale našli cestu k správnemu životu.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za tých, ktorí inklinujú k extrémistickým hnutiam, aby sa spamätali a aby sa už nikdy neopakovali genocídy, ktoré ľudstvo zažilo v minulosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za trpiacich a zlomených na duchu, aby svetlo zmŕtvychvstalého Krista vlievalo nádej do ich sŕdc a navrátilo im vieru v lásku a starostlivosť Boha.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby mali účasť na Kristovom vzkriesení a dosiahli blaženosť večného života.",
                    "Pane, Kráľ večného života,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme raz mohli žiť s tvojimi vyvolenými<br>" +
                            "v nebeskom kráľovstve.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"32", "1", "Bratia a sestry, ako apoštoli, tak aj my prosme, aby Pán posilnil našu vieru a volajme:",
                    "<font color='#B71C1C'>(</font>Pane, daj nám väčšiu vieru.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, pomáhaj všetkým kňazom Cirkvi trpezlivo a s láskou vysluhovať sviatosť zmierenia.<br>" +
                            "<font color='#B71C1C'>2.</font> Chráň verejných činiteľov od skutkov, ktoré by boli pohoršením pre verejnosť.<br>" +
                            "<font color='#B71C1C'>3.</font> Posmeľuj pracovníkov v médiách vydávať svedectvo o pravde a nikdy nešíriť klebety alebo nepravdivé informácie.<br>" +
                            "<font color='#B71C1C'>4.</font> Nauč nás odpúšťať tým, ktorí nám ubližujú, a modliť sa za ich obrátenie.<br>" +
                            "<font color='#B71C1C'>5.</font> Pripoj našich zomrelých <font color='#B71C1C'>(M.)</font> k plesajúcemu zástupu anjelov v tvojom kráľovstve.",
                    "Pane a Bože náš,<br>" +
                            "tvoja láska presahuje naše poznanie;<br>" +
                            "prosíme ťa, vypočuj naše modlitby,<br>" +
                            "pomáhaj nám ochotne kráčať za tebou<br>" +
                            "a tak smerovať k večnej spáse.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"32", "2", "Bratia a sestry, Bohu je milé, keď ho milujeme s čistým a nerozdeleným srdcom. Posilnime sa v takejto láske k nemu a s dôverou sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za misionárov: aby s horlivosťou šírili Kristovo evanjelium a ohlasovali vo svete zvesť o našom vykúpení, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za celý svet: aby vo všetkých krajinách zavládla spravodlivosť a vzájomná ohľaduplnosť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých pracujúcich: aby sa poctivou prácou postarali o svoje rodiny a vytvárali hodnoty pre celú ľudskú spoločnosť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás samých: aby sme nezištne milovali svojich blížnych a ochotne im poskytovali svoju pomoc, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zomrelých <font color='#B71C1C'>(M.)</font>: aby sa nebo stalo ich večným príbytkom, prosme Pána.",
                    "Nebeský Otče,<br>" +
                            "ty nás pozývaš k sebe<br>" +
                            "a nazývaš nás svojimi deťmi;<br>" +
                            "vypočuj naše prosby a daruj nám otvorené srdcia,<br>" +
                            "aby sme mohli čerpať<br>" +
                            "z nekonečného bohatstva tvojej milosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"32", "3", "Bratia a sestry, Pánovi Ježišovi sa prišiel poďakovať len jeden z desiatich uzdravených malomocných. Preto mu s vďačným srdcom prednesme svoje pokorné prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby rehoľní bratia a rehoľné sestry vytrvalou modlitbou prosili o zoslanie Božích milostí a darov Ducha Svätého na všetkých ľudí, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby si národy vedeli vážiť svoje prírodné bohatstvo a rozumne ho využívali, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby vedci a výskumníci prinášali verejnosti nové poznatky vedy i techniky a naučili sa Bohu ďakovať za rozširovanie ľudského poznania, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby deti boli vďačné svojim rodičom za vytváranie domova a prebývanie v rodinnom kruhu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zomrelí <font color='#B71C1C'>(M.)</font> dosiahli večnú odmenu v kráľovstve nebeského Otca, prosme Pána.",
                    "Pane Ježišu, v tebe sa zjavila Božia vôľa<br>" +
                            "a prišiel si na svet, aby si nás spasil;<br>" +
                            "prosíme ťa,<br>" +
                            "prijmi a vypočuj tieto modlitby<br>" +
                            "a prebývaj v našich srdciach,<br>" +
                            "aby sme ťa mohli stále viac milovať<br>" +
                            "a velebiť tvoje meno.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"32", "4", "Bratia a sestry, Božie kráľovstvo je v nás prítomné už tu a teraz a Boh nad nami bdie a sprevádza nás. Otvorme svoje srdcia a nechajme sa preniknúť Božím duchom.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, ty zachovávaš vernosť naveky; posilňuj všetkých biskupov, aby ako nástupcovia apoštolov zostávali verní nasledovaniu Krista.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, tvoja múdrosť je zrkadlom tvojej moci; nauč všetkých verejných činiteľov múdro riadiť štáty a vzájomne spolupracovať s inými krajinami.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, ty hladujúcim dávaš chlieb; vlej svoju nádej do duší všetkých chudobných a trpiacich a pošli im ľudí, ktorí im ochotne pomôžu.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, ty otváraš oči nevidiacim; urob z nás svedkov tvojej lásky medzi našimi neveriacimi bratmi a sestrami.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, ty kraľuješ naveky; daruj našim zomrelým <font color='#B71C1C'>(M.)</font> nebeský domov a ukáž im oslávenú tvár svojho Syna.",
                    "Pane a Bože náš,<br>" +
                            "tebe slúži všetko<br>" +
                            "a tvoja vernosť trvá z pokolenia na pokolenie;<br>" +
                            "vypočuj naše modlitby a zošli na nás svojho Ducha,<br>" +
                            "aby sme naplnení tvojimi darmi<br>" +
                            "mohli raz dosiahnuť nehynúcu radosť v Božom kráľovstve.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"32", "5", "Bratia a sestry, Pán Ježiš je zárukou večného života. Pozdvihnime k nemu svoj zrak a modlime sa.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, zošli na Cirkev Ducha Svätého, aby bola sviatosťou jednoty celého ľudstva.<br>" +
                            "<font color='#B71C1C'>2.</font> Obdaruj celý svet svojimi darmi, aby sa tak zjavila tvoja dobrota.<br>" +
                            "<font color='#B71C1C'>3.</font> Ochraňuj všetkých našich príbuzných, aby pocítili tvoje milosrdenstvo a žehnajúcu pravicu.<br>" +
                            "<font color='#B71C1C'>4.</font> Prinavráť všetkým kajúcim hriešnikom duchovný pokoj a radosť zo zmierenia s tebou.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás chápať nesmiernu hodnotu krstu, ktorým sme boli očistení a prijatí do svätej Cirkvi.<br>" +
                            "<font color='#B71C1C'>6.</font> Prijmi našich zomrelých <font color='#B71C1C'>(M.)</font> do slávy svojho zmŕtvychvstania.",
                    "Pane Ježišu,<br>" +
                            "teba nebeský Otec poslal<br>" +
                            "ako zmiernu obetu za naše hriechy;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a daj, aby sme ti neustále vzdávali vďaky za to,<br>" +
                            "že si sa stal naším Spasiteľom.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"32", "6", "Bratia a sestry, výzva Pána Ježiša neustále sa modliť a neochabovať platí pre všetkých ľudí. Aj my prijmime túto jeho výzvu a zjednoťme sa v modlitbe.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, daruj služobníkom tvojho oltára vytrvalosť v rozjímaní o tvojich svätých tajomstvách.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, zošli verejným činiteľom ducha chápavosti, aby vedeli trpezlivo počúvať ľudí a reagovať na ich aktuálne potreby.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, nauč všetkých sudcov byť zhovievavými, spravodlivými a čestnými zástancami zákona.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, ukáž nám svoju tvár a posilňuj nás v každodenných ťažkostiach a problémoch.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, prijmi našich zomrelých <font color='#B71C1C'>(M.)</font> do svojho kráľovstva, v ktorom budú prebývať naveky.",
                    "Pane Ježišu,<br>" +
                            "ty si dedičom všetkých národov;<br>" +
                            "prijmi a vypočuj naše prosby,<br>" +
                            "zhromažďuj nás okolo svojho stola<br>" +
                            "a voveď nás do svojho kráľovstva.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"33", "A", "Bratia a sestry, Pán nás obdaroval mnohými duchovnými darmi, ktoré máme rozvíjať. Pamätajme na to, že raz sa budeme zodpovedať, ako sme s týmito darmi hospodárili. Spoločne sa modlime, aby sme pred ním obstáli.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby veriaci nehľadali falošné istoty, ale tvorivo rozvíjali zverené Božie dary, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby národy sveta žili v jednote a pokoji a vzájomne si pomáhali, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby všetci umelci a učenci používali svoje talenty na všeobecné dobro, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby mladí ľudia, ktorí hľadajú svoje miesto v živote, rozpoznali svoje talenty, správne si zvolili povolanie a v službe druhým nachádzali svoje šťastie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby chorí, postihnutí a nešťastní prijali svoj ťažký životný údel a našli jeho zmysel a naplnenie, prosme Pána.",
                    "Pane, vyslyš naše prosby<br>" +
                            "a neustále nás povzbudzuj, <br>" +
                            "aby sme všetky dary a talenty<br>" +
                            "používali na dobro blížnych<br>" +
                            "a na česť a slávu tvojho mena.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"33", "B", "Bratia a sestry, keď sa Kristus zjaví vo svojej sláve, radosť naplní toho, kto celým svojím životom slúžil Bohu a ľuďom. Vyprosujme si potrebnú silu na túto službu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, odmeň všetkých biskupov a kňazov, ktorí poúčajú tvoj ľud o vzkriesení a o večnom živote.<br>" +
                            "<font color='#B71C1C'>2.</font> Udeľ milosť spásy všetkým, ktorí vedú národy k pokoju a k bratskej láske.<br>" +
                            "<font color='#B71C1C'>3.</font> Dávaj študentom a všetkým mladým ľuďom silu a odvahu meniť seba i svet k lepšiemu.<br>" +
                            "<font color='#B71C1C'>4.</font> Zmiluj sa nad tými, ktorí opustili cestu spásy, a priveď ich ku kajúcnosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Prenikni nás spasiteľnou bázňou pred tvojím súdom a zachráň nás od náhlej a nekajúcej smrti.<br>" +
                            "<font color='#B71C1C'>6.</font> Otvor našim zosnulým <font color='#B71C1C'>(M.)</font> bránu nebeského domova a udeľ im večnú radosť a blaženosť.",
                    "Pane Ježišu, sudca živých i mŕtvych,<br>" +
                            "zmiluj sa nad nami<br>" +
                            "a pomáhaj nám žiť tak,<br>" +
                            "aby sme sa zaradovali,<br>" +
                            "keď ťa uvidíme prichádzať<br>" +
                            "s veľkou mocou a slávou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"33", "C", "Bratia a sestry, veľa z toho, čo predpovedá dnešné evanjelium, sa už deje a ľuďom prináša utrpenie. Slobodný, dôstojný a pokojný život zostáva pre mnohých len nesplneným želaním. Preto sa modlime za celý svet a volajme:",
                    "<font color='#B71C1C'>(</font>Spasiteľ sveta, zmiluj sa nad nami.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, zbav svojich veriacich úzkosti a strachu a naplň ich radostnou nádejou na tvoj slávny príchod.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, daj, aby každý človek svojou prácou alebo utrpením tvoril hodnoty pre seba i pre dobro blížnych.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, chráň krajiny pred živelnými pohromami, pred hladom a chorobami.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, upevňuj v láske rodiny našej farnosti, aby nepovstávali deti proti rodičom a rodičia proti deťom.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, udeľ silu a útechu všetkým, ktorí musia znášať súženie pre tvoje meno.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane, udeľ večnú spásu všetkým zosnulým, ktorí verili a dúfali v teba.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby,<br>" +
                            "pomáhaj nám statočne plniť úlohy povolania<br>" +
                            "a daruj nám milosť vytrvalosti až do konca.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"33", "1", "Bratia a sestry, Kristove zázraky sú dôkazom nekonečného Božieho milosrdenstva. Vo viere a láske spoločne volajme:",
                    "<font color='#B71C1C'>(</font>Syn Dávidov, zmiluj sa nad nami.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, staň sa svetlom života pre všetkých kresťanov a zosielaj na nich dary svojho Ducha.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, ochráň všetkých ľudí od vojnových zámerov a daruj im svoj pokoj.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, odpusť tým, ktorí zrádzajú tvoj zákon, a priveď ich na cestu zmierenia a pokánia.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, chráň nás pred ohováračmi a prenasledovateľmi a upevňuj nádej našich sŕdc a vernosť tvojej náuke.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, postav našich zomrelých <font color='#B71C1C'>(M.)</font> po svojej pravici, aby zaujali kráľovstvo, ktoré je pre nás pripravené od stvorenia sveta.",
                    "Pane Ježišu Kriste,<br>" +
                            "tvoje kráľovstvo trvá naveky;<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme pochopili plnú pravdu o našej spáse,<br>" +
                            "víťazili nad nepriateľmi dobra<br>" +
                            "a raz dosiahli večný život.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"33", "2", "Bratia a sestry, Pán Ježiš prišiel hľadať a zachrániť hriešnikov a ukázal im svoju lásku. Vzdávajme mu vďaky a spoločnou modlitbou ho vzývajme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, obdaruj trpezlivosťou svojich kňazov, aby s láskou vedeli poskytovať útechu a pomoc všetkým, ktorí zblúdili a zhrešili.<br>" +
                            "<font color='#B71C1C'>2.</font> Posmeľuj duchom štedrosti bohaté krajiny, aby vedeli poskytovať časť svojho bohatstva na zmiernenie hladu a biedy vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Povzbudzuj lekárov a asistentov vykonávajúcich nemorálne lekárske zákroky, aby sa odvrátili od zla a mali silu zastávať sa pravých hodnôt.<br>" +
                            "<font color='#B71C1C'>4.</font> Upevňuj v našich rodinách ochotu prijímať deti ako Boží dar a vychovávať ich s láskou v duchu kresťanskej nábožnosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Buď milostivý našim zomrelým <font color='#B71C1C'>(M.)</font>, ktorých si vykúpil svojou krvou, aby s tebou mali účasť na večnej svadobnej hostine.",
                    "Pane Ježišu, náš záchranca,<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby v našich srdciach žiarilo slnko spravodlivosti<br>" +
                            "a aby sme raz mohli vojsť do svetla, v ktorom prebývaš.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"33", "3", "Bratia a sestry, Boh nám dáva veľké dary svojej milosti, aby sme sa o ne starali a zušľachťovali ich. Učme sa byť vernými uskutočňovateľmi Božej dobroty a vrúcne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, ochraňuj misionárov a hlásateľov evanjelia, ktorých si poslal do celého sveta, a zapáľ v nich oheň svojho Ducha.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, daj, aby zákonodarcovia napomáhali a podporovali spravodlivosť a úprimne spolupracovali na budovaní lepšieho sveta.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, zastaň sa utláčaných, poteš biednych, hladným daj chlieb, slabým silu a na všetkých ukáž víťazstvo kríža.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, daj, aby sme vo všetkých ľuďoch spoznávali tvoj obraz a aby sme ti v nich slúžili.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, našich zomrelých <font color='#B71C1C'>(M.)</font> láskavo pripočítaj k zástupom blažených, ktorých mená sú zapísané v knihe života.",
                    "Pane a Bože náš,<br>" +
                            "ty nám neustále prejavuješ svoju lásku;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a posilňuj nás vo vedomí,<br>" +
                            "že všetky tvoje dary<br>" +
                            "sa nemajú k tebe vracať nevyužité,<br>" +
                            "ale v dobrom srdci majú prinášať úrodu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"33", "4", "Bratia a sestry, Pán nás vyzýva, aby sme počúvali jeho hlas a nezatvrdzovali si srdcia. V duchu oddanosti vyjadrime svoju lásku k Bohu v spoločnej modlitbe.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za celú Cirkev: aby bola vo svete jasným znamením jednoty a pokoja, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetky národy: aby vedeli nachádzať cestu vzájomného porozumenia a mierového spolužitia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za umierajúcich: aby ich prenikala Božia láska a radostná nádej, že čoskoro uvidia Božiu tvár, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za seba samých: aby sme pocítili Božie milosrdenstvo a vzájomne sa posilňovali duchovnou radosťou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zomrelých <font color='#B71C1C'>(M.)</font>: aby ich Boh pridružil k tým, ktorí odpočívajú vo večnej sláve, prosme Pána.",
                    "Pane a Bože náš,<br>" +
                            "ty nám prinášaš pravý pokoj;<br>" +
                            "prosíme ťa, vypočuj naše prosby a ochraňuj nás,<br>" +
                            "aby sme v premenách pominuteľného sveta<br>" +
                            "boli naplnení tvojou nemeniteľnou láskou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"33", "5", "Bratia a sestry, Kristus je pastierom našich duší a vovádza nás do spoločenstva so sebou. Vo viere a láske prijmime jeho pozvanie a modlime sa.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby vo všetkých kresťanských chrámoch zaznievala úprimná vďaka a oslava Stvoriteľa, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby kresťanská tradícia vo svete našla svoje pevné miesto a bola rešpektovaná aj čelnými štátnymi predstaviteľmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby odborníci v otázkach bioetiky konali zodpovedne a mali na zreteli jedinečnosť každej ľudskej osoby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme nábožne navštevovali Boží chrám a nezabúdali prispievať na všetko, čo je potrebné na jeho údržbu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zomrelí <font color='#B71C1C'>(M.)</font> čím skôr vstúpili do príbytku všetkých svätých, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "tvoja je vznešenosť i moc, sláva, jas a veleba;<br>" +
                            "vypočuj naše prosby,<br>" +
                            "prebývaj v hĺbke našich sŕdc<br>" +
                            "a daj nám radosť zo stretnutia s tebou<br>" +
                            "v tvojom svätom chráme – našom dome modlitby.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"33", "6", "Bratia a sestry, Boh nám poslal svojho Syna za vykupiteľa a najláskavejšieho učiteľa. Staňme sa jeho vernými učeníkmi a pozdvihnime srdcia v modlitbe.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za nášho pápeža <font color='#B71C1C'>M.</font> a za nášho biskupa <font color='#B71C1C'>M.</font>, aby svojím životom vydávali svedectvo o živom zmŕtvychvstalom Kristovi.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za krajiny zmietané vojnami, aby vykročili na cestu zmierenia a pokojného spolužitia.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za pozostalých, ktorí oplakávajú zomrelých príbuzných, aby pochopili, že Boh nie je Bohom mŕtvych, ale živých.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme sa vytrvalo pripravovali na večný život a na stretnutie s anjelmi i so všetkými svätými.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby mali účasť na večnej svadobnej hostine.",
                    "Pane Ježišu,<br>" +
                            "ty si zničil smrť a zjavil život;<br>" +
                            "prosíme ťa, vypočuj naše modlitby<br>" +
                            "a bdej pri nás,<br>" +
                            "aby sme nezabudli na tvoj zákon,<br>" +
                            "a raz nám daruj odmenu večného života.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"34", "A", "", "", "", ""},
            {"34", "B", "", "", "", ""},
            {"34", "C", "", "", "", ""},
            {"34", "1", "Bratia a sestry, úprimné srdce je základom vrúcneho vzťahu k nášmu nebeskému Otcovi. S túžbou po jeho dokonalej láske sa spoločne modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, zachovaj svoju Cirkev vo svojom pokoji a obdaruj ju duchom vytrvalosti a jednoty.<br>" +
                            "<font color='#B71C1C'>2.</font> Chráň národy pred prírodnými katastrofami a stále im zjavuj svoje milosrdenstvo.<br>" +
                            "<font color='#B71C1C'>3.</font> Obráť všetkých, ktorí žijú v klamlivých radostiach, a priveď ich na cestu pravého šťastia.<br>" +
                            "<font color='#B71C1C'>4.</font> Požehnaj a odmeň všetkých dobrodincov nášho chrámu.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás celým srdcom a obetavo plniť si svoje pracovné a rodinné povinnosti.<br>" +
                            "<font color='#B71C1C'>6.</font> Priveď našich zomrelých <font color='#B71C1C'>(M.)</font> k poznaniu večnej radosti a daruj im svoju slávu.",
                    "Pane a Bože náš,<br>" +
                            "ty si hoden chvály a slávy nad všetky veky;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomáhaj nám kráčať cestou spásy,<br>" +
                            "aby sme raz mohli v plnosti uzrieť tvoju velebu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"34", "2", "Bratia a sestry, Boh nám prisľubuje kráľovstvo, ktoré nikdy nezanikne. S túžbou mať účasť na živote v Božom kráľovstve prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby kňazi ako dobrí pastieri viedli svojich veriacich k úprimnému hľadaniu pravdy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby štátnici ako starostliví strážcovia podporovali pokoj a svornosť vo svojich krajinách, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby všetci opustení ako trpezliví služobníci nachádzali bohatstvo a nádej Božieho slova, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme sa ako verní kresťania držali pravej viery a neupadli do nástrah falošných prorokov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zomrelí <font color='#B71C1C'>(M.)</font> ako vytrvalí pútnici dosiahli plnú účasť na živote v Božom kráľovstve, prosme Pána.",
                    "Pane a Bože náš,<br>" +
                            "ty si ukázal svetu svojho Syna, Kráľa kráľov;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a udeľ nám milosť,<br>" +
                            "aby sme vždy úprimne hľadali tvoju tvár.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"34", "3", "Bratia a sestry, veľké a obdivuhodné sú Božie skutky a jeho cesty sú spravodlivé a správne. Nechajme sa viesť po ceste Božej pravdy a modlime sa.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Cirkev, aby sa nebála svedčiť o Kristovom kráľovstve a hrdinsky znášala všetky urážky a potupy.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za národy sveta, aby si volili zodpovedných a svedomitých politikov, ktorí budú dôstojne reprezentovať ich krajinu.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za prenasledovaných kresťanov, aby ich posilnil Boží prísľub, že ak vytrvajú, zachovajú si život.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme si boli navzájom živým svedectvom bratskej lásky a pomoci.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby dosiahli večnú slávu v spoločenstve anjelov a svätých.",
                    "Bože, najláskavejší Otec,<br>" +
                            "v Kristovi nám zjavuješ mnohé znamenia<br>" +
                            "potrebné pre našu spásu;<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj naše modlitby a posilňuj nás,<br>" +
                            "aby sme s otvoreným srdcom prijímali tieto znamenia<br>" +
                            "a riadili sa Kristovým učením.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"34", "4", "Bratia a sestry, Pán Ježiš nás pripravuje na svoj budúci príchod v sláve. Povzbuďme sa v tomto radostnom očakávaní a prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Príď, Pane Ježišu.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby všetci veriaci tvojej Cirkvi s radostnou nádejou očakávali tvoj druhý príchod.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomáhaj všetkým štátnikom viesť svoje krajiny v súlade s ekologickými a ekonomickými potrebami celej planéty.<br>" +
                            "<font color='#B71C1C'>3.</font> Posilňuj všetkých lekárov, aby svedomito a bez rozdielov medzi ľuďmi liečili choroby tela i duše.<br>" +
                            "<font color='#B71C1C'>4.</font> Požehnávaj naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby bolo dobrým prostredím na vzrast viery detí a mládeže.<br>" +
                            "<font color='#B71C1C'>5.</font> Uveď našich zomrelých <font color='#B71C1C'>(M.)</font> do svojho večného príbytku, kde kraľuješ spolu so svojím Otcom v jednote s Duchom Svätým.",
                    "Pane Ježišu,<br>" +
                            "tvoje vykupiteľské dielo je dokonané<br>" +
                            "a my očakávame tvoj slávny príchod;<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a sprevádzaj nás po všetky dni,<br>" +
                            "aby sme raz uzreli tvoju nekonečnú slávu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"34", "5", "Bratia a sestry, Kristovo kráľovstvo, ktoré predpovedali proroci, sa naplnilo a je prítomné medzi nami. Preto sa vrúcne modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Príď, Pane Ježišu.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, požehnávaj nášho biskupa <font color='#B71C1C'>M.</font> a všetkých biskupov, aby ako verní apoštoli zvestovali veriacim tvoje kráľovstvo.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, stoj pri predstaviteľoch štátov a daj, aby popri starostlivosti o svetské kráľovstvá nezabúdali na prítomnosť tvojho kráľovstva.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, ujmi sa všetkých snúbencov, aby s čistým a úprimným srdcom vstúpili do manželského zväzku a boli si navzájom verní.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, povzbuď nás svojím slovom a posilni nás vo vytrvalej modlitbe.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, zjav sa v plnosti svojej slávy našim zomrelým <font color='#B71C1C'>(M.)</font> a udeľ im večný pokoj v nebeskom príbytku.",
                    "Pane Ježišu,<br>" +
                            "ty si najdokonalejším zjavením<br>" +
                            "lásky nebeského Otca;<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a privádzaj nás stále bližšie k tebe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"34", "6", "Bratia a sestry, Pán Ježiš nás povzbudzuje na bedlivosť, aby sme s nádejou očakávali jeho slávny príchod. Spoločne sa zjednoťme v modlitbe a volajme:",
                    "<font color='#B71C1C'>(</font>Príď, Pane Ježišu.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, povzbudzuj všetkých rehoľníkov a rehoľníčky do ustavičnej modlitby a do úprimného vydávania svedectva o tvojom zmŕtvychvstaní.<br>" +
                            "<font color='#B71C1C'>2.</font> Sprevádzaj a veď všetky národy, aby sa usilovali o rešpektovanie kresťanských, morálnych a duchovných hodnôt.<br>" +
                            "<font color='#B71C1C'>3.</font> Pomáhaj všetkým, ktorí podľahli nejakej závislosti, aby sa uzdravili z tejto choroby a našli pomoc a útechu v Eucharistii a v tvojom slove.<br>" +
                            "<font color='#B71C1C'>4.</font> Stoj pri nás vo chvíli smrti, aby sme zmierení s tebou pokojne prešli do večnosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Prijmi našich zomrelých <font color='#B71C1C'>(M.)</font> do večného domova a daruj im svoju spásu.",
                    "Pane Ježišu, ty nás uisťuješ,<br>" +
                            "že na konci vekov sa zjavíš v sláve;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomáhaj nám vytrvať v bdelosti a modlitbe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
    };
}

