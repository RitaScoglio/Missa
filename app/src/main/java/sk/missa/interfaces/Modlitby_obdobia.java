package sk.missa.interfaces;

/*
* Modlitby v cezročnom období - cezrokModlitby; v pôstnom období - postModlitby; vo veľkonočnom období - velkanocModlitby; v adventnom období - adventModlitby
* cezročné obdobie: {týždeň v cezročnom období, modlitba dňa, modlitba nad obetnými darmi, modlitba po prijímaní},
* pôstne obdobie: {týždeň v pôstnom období+deň (napr. 2 týždeň v pondelok - 21), modlitba dňa, modlitba nad obetnými darmi, modlitba po prijímaní},
* veľkonočné obdobie: {týždeň vo veľkonočnom období+deň (napr. 2 týždeň v pondelok - 21), modlitba dňa, modlitba nad obetnými darmi, modlitba po prijímaní},
* adventné obdobie: {týždeň v adventnom období+deň (napr. 2 týždeň v pondelok - 21), modlitba dňa, modlitba nad obetnými darmi, modlitba po prijímaní},
*
* Keďže sú modlitby v adventnom a vianočnom období viazané na deň, nachádzajú sa v Modlitby_svatci uložené v mesiaci, ktorému prislúchajú a s dňom ako ID
*/

public interface Modlitby_obdobia {
    String[][] cezrokModlitby = {
            {"1", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "s otcovskou priazňou prijmi modlitby svojho ľudu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme poznali dobro, ktoré máme konať,<br>" +
                    "a aby sme ho s tvojou pomocou uvádzali do života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, svätý Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo prijmi naše obetné dary <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme sa touto vznešenou obetou posvätili<br>" +
                    "a dosiahli, o čo prosíme.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "posilnil si nás svojím slovom<br>" +
                    "a sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme sa ti zapáčili<br>" +
                    "ochotnou službou tebe a blížnemu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"2", "Všemohúci a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "ty riadiš všetko na nebi aj na zemi; <font color='#B71C1C'>—</font><br>" +
                    "dobrotivo splň prosby svojho ľudu<br>" +
                    "a daruj našim časom svoj pokoj.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám nábožne sláviť eucharistické tajomstvo, <font color='#B71C1C'>—</font><br>" +
                    "lebo vždy, keď slávime<br>" +
                    "pamiatku Kristovej obety,<br>" +
                    "uskutočňuje sa v nás dielo vykúpenia.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "pri tomto oltári si nás posilnil<br>" +
                    "tým istým nebeským chlebom; <font color='#B71C1C'>—</font><br>" +
                    "naplň nás všetkých svojím Duchom<br>" +
                    "a v láske nám zjednoť srdcia i mysle.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"3", "Všemohúci a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "usmerňuj náš život podľa svojej vôle, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v mene tvojho milovaného Syna<br>" +
                    "horlivo konali dobré skutky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, prijmi naše dary a posväť ich, <font color='#B71C1C'>—</font><br>" +
                    "aby nám slúžili na večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "sviatostným pokrmom v nás zveľaďuješ nový život;<font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa stále tešili z tohto nebeského daru.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"4", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "posilni nás svojou milosťou, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ťa uctievali celou dušou<br>" +
                    "a všetkých ľudí milovali opravdivou láskou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože,<br>" +
                    "prijmi tieto dary, <font color='#B71C1C'>*</font><br>" +
                    "ktoré ti so synovskou oddanosťou<br>" +
                    "prinášame na oltár, <font color='#B71C1C'>—</font><br>" +
                    "a premeň ich na sviatosť nášho vykúpenia.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "posilnení sviatosťou vykúpenia<br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby tento spásonosný pokrm<br>" +
                    "zveľaďoval pravú vieru po celom svete.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"5", "Nebeský Otče,<br>" +
                    "rodina tvojich veriacich sa spolieha iba na teba; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "ustavične nás ochraňuj s otcovskou láskou,<br>" +
                    "aby sme pod tvojou opaterou žili vždy v pokoji.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš,<br>" +
                    "ty si stvoril chlieb a víno ako obživu pre telo; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sa nám stali aj sviatostným pokrmom<br>" +
                    "pre večný život. Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "doprial si nám účasť<br>" +
                    "na tom istom chlebe a kalichu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám žiť tak, <font color='#B71C1C'>—</font><br>" +
                    "aby sme všetci boli jedno v Kristovi<br>" +
                    "a radostne s ním spolupracovali na spáse sveta.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"6", "Dobrotivý Bože,<br>" +
                    "ty nás uisťuješ, že prebývaš v tých,<br>" +
                    "čo sú spravodliví a majú čisté srdce; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám svojou milosťou tak žiť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli tvojím dôstojným príbytkom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás táto obeta očistí a obnoví <font color='#B71C1C'>—</font><br>" +
                    "a nech nám zabezpečí večnú odmenu,<br>" +
                    "ktorú si prisľúbil tým, čo plnia tvoju vôľu.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože, s radosťou sme sa zúčastnili<br>" +
                    "na eucharistickej hostine <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme vždy túžili po tomto pokrme,<br>" +
                    "ktorý v nás zveľaďuje život milosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"7", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nauč nás vždy správne zmýšľať, <font color='#B71C1C'>—</font><br>" +
                    "aby sa naše slová i skutky<br>" +
                    "zhodovali s tvojou vôľou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože,<br>" +
                    "prinášame ti túto svätú obetu<br>" +
                    "ako prejav našej oddanej služby; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby bola tebe na slávu<br>" +
                    "a nám na spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "v tejto vznešenej sviatosti<br>" +
                    "dal si nám záloh večnej spásy; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ju dosiahli v plnej miere<br>" +
                    "v nebeskej vlasti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"8", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sa život na zemi rozvíjal v pokoji<br>" +
                    "podľa tvojej vôle <font color='#B71C1C'>—</font><br>" +
                    "a aby tvoja Cirkev mohla nerušene<br>" +
                    "a radostne plniť poslanie, ktoré si jej zveril.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče, od teba pochádzajú dary,<br>" +
                    "ktoré prinášame na oltár,<br>" +
                    "a ty ich prijímaš<br>" +
                    "ako prejav našej synovskej oddanosti; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám obeta, ktorú konáme z tvojej dobroty,<br>" +
                    "zaslúžila večnú odmenu. Skrze Krista, nášho Pána.", "Milosrdný Otče,<br>" +
                    "pri eucharistickom stole<br>" +
                    "posilnil si nás pokrmom spásy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby nám sviatosť,<br>" +
                    "ktorou nás živíš na pozemskej púti,<br>" +
                    "zaistila účasť na večnom živote v nebeskej vlasti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"9", "Všemohúci Bože,<br>" +
                    "tvoja prozreteľnosť je neomylná<br>" +
                    "vo všetkých rozhodnutiach; <font color='#B71C1C'>*</font><br>" +
                    "preto ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "odvráť od nás, čo je škodlivé,<br>" +
                    "a daj, aby nám všetko slúžilo na spásu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože,<br>" +
                    "s dôverou v tvoju dobrotivosť<br>" +
                    "prichádzame s darmi k svätému oltáru; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nás očistila tvoja milosť <font color='#B71C1C'>—</font><br>" +
                    "a posvätila obeta, ktorú konáme.<br>" +
                    "Skrze Krista, nášho Pána.", "Večný Bože,<br>" +
                    "vo svojej štedrosti nás živíš<br>" +
                    "telom a krvou svojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, veď nás stále svojím Svätým Duchom, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ťa vyznávali nielen slovami,<br>" +
                    "ale aj skutkami úprimnej lásky,<br>" +
                    "a tak si zaslúžili vojsť do nebeského kráľovstva.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"10", "Láskavý Bože,<br>" +
                    "od teba pochádza každé dobro; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, osvecuj náš rozum,<br>" +
                    "aby sme poznali, čo je správne, <font color='#B71C1C'>—</font><br>" +
                    "a posilňuj našu vôľu,<br>" +
                    "aby sme podľa toho aj konali.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "milostivo zhliadni na našu kňazskú službu, <font color='#B71C1C'>—</font><br>" +
                    "aby sa naša obeta tebe páčila<br>" +
                    "a v nás rozmnožovala lásku.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "aby nás liečivá moc tejto sviatosti<br>" +
                    "oslobodila od zlých žiadostí <font color='#B71C1C'>—</font><br>" +
                    "a pobádala k dobrému.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"11", "Všemohúci Bože, naša sila a nádej,<br>" +
                    "bez teba ľudská slabosť nič nezmôže; <font color='#B71C1C'>*</font><br>" +
                    "vypočuj naše prosby<br>" +
                    "a ustavične nás posilňuj svojou milosťou, <font color='#B71C1C'>—</font><br>" +
                    "aby sme verne plnili tvoje prikázania,<br>" +
                    "a tak sa ti páčili zmýšľaním i skutkami.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "chlieb a víno nám dávaš za telesný pokrm,<br>" +
                    "ktorý živí naše telo, <font color='#B71C1C'>*</font><br>" +
                    "a premieňaš ich na sviatosť,<br>" +
                    "ktorá nás posväcuje; <font color='#B71C1C'>—</font><br>" +
                    "prosíme ťa, daj,<br>" +
                    "aby sme z nich čerpali vždy novú silu<br>" +
                    "pre telo i pre dušu.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "prijali sme eucharistický pokrm,<br>" +
                    "ktorý sviatostne naznačuje,<br>" +
                    "že veriaci sú zjednotení v tebe; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby táto sviatosť v tvojej Cirkvi<br>" +
                    "stále zveľaďovala jednotu a lásku.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"12", "Svätý Bože,<br>" +
                    "daj, aby sme vždy uctievali a milovali<br>" +
                    "tvoje sväté meno; <font color='#B71C1C'>*</font><br>" +
                    "veď ty nás stále miluješ <font color='#B71C1C'>—</font><br>" +
                    "a neprestajne nás vedieš na ceste života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, Bože,<br>" +
                    "prijmi túto obetu zmierenia a chvály <font color='#B71C1C'>*</font><br>" +
                    "a daj, nech nás očistí, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti mohli slúžiť s úprimným srdcom.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "vo svojej nesmiernej láske<br>" +
                    "posilnil si nás telom a krvou svojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nám časté prijímanie tejto sviatosti<br>" +
                    "bolo zárukou večnej spásy.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"13", "Bože, láskavý Otče,<br>" +
                    "vo sviatosti krstu prijal si nás za svojich<br>" +
                    "a urobil si nás synmi svetla; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa,<br>" +
                    "nedopusť, aby sme upadli do tmy bludu, <font color='#B71C1C'>—</font><br>" +
                    "ale pomôž nám stále vyžiarovať svetlo tvojej pravdy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nekonečný Bože,<br>" +
                    "svätými tajomstvami, ktoré slávime,<br>" +
                    "uskutočňuješ v nás dielo spásy; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby naša služba pri tvojom oltári<br>" +
                    "zodpovedala svätosti tejto obety.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, Otče, <font color='#B71C1C'>*</font><br>" +
                    "eucharistická obeta, ktorú sme slávili<br>" +
                    "a z ktorej sme prijímali,<br>" +
                    "nech zveľaďuje v nás božský život, <font color='#B71C1C'>—</font><br>" +
                    "aby sme láskou boli stále spojení s tebou<br>" +
                    "a vytrvalo konali dobré skutky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"14", "Všemohúci Bože,<br>" +
                    "ty si pozdvihol padnuté ľudstvo<br>" +
                    "u ponížením sa tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "daruj svätú radosť svojim verným,<br>" +
                    "ktorých si vymanil z otroctva hriechu, <font color='#B71C1C'>—</font><br>" +
                    "a priveď ich do večnej blaženosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "obeta, ktorú ti prinášame,<br>" +
                    "nech nás vnútorne očisťuje <font color='#B71C1C'>—</font><br>" +
                    "a nech nás zo dňa na deň lepšie pripravuje na život,<br>" +
                    "ktorý nás čaká v nebi.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý a večný Bože,<br>" +
                    "zahrnul si nás<br>" +
                    "nesmiernymi darmi svojej lásky; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme Oltárnu sviatosť vždy<br>" +
                    "prijímali na naše spasenie <font color='#B71C1C'>—</font><br>" +
                    "a neprestajne ti za ňu ďakovali.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"15", "Milosrdný Bože,<br>" +
                    "ty ukazuješ blúdiacim svetlo svojej pravdy,<br>" +
                    "aby sa vrátili na správnu cestu; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj všetkým kresťanom<br>" +
                    "odmietať, čo sa protiví ich viere, <font color='#B71C1C'>—</font><br>" +
                    "a usilovať sa o to,<br>" +
                    "čo zodpovedá ich kresťanskému povolaniu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milostivý Otče,<br>" +
                    "zhliadni na dary svojej Cirkvi <font color='#B71C1C'>*</font><br>" +
                    "a premeň ich na duchovný pokrm, <font color='#B71C1C'>—</font><br>" +
                    "ktorý posväcuje náš každodenný život.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "s radosťou sme prijali tvoje dary; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sa v nás častým prijímaním<br>" +
                    "sviatostného pokrmu<br>" +
                    "vzmáhali účinky vykúpenia.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"16", "Bože, buď milostivý nám, svojim služobníkom, <font color='#B71C1C'>*</font><br>" +
                    "a obohacuj nás darmi svojej dobroty, <font color='#B71C1C'>—</font><br>" +
                    "aby sme so živou vierou, nádejou a láskou<br>" +
                    "dôsledne zachovávali tvoje prikázania.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože,<br>" +
                    "ty si všetky starozákonné obety zavŕšil a nahradil<br>" +
                    "jedinou a dokonalou obetou Kristovou; <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše obetné dary,<br>" +
                    "ako si prijal dary spravodlivého Ábela,<br>" +
                    "a posväť ich, <font color='#B71C1C'>—</font><br>" +
                    "aby to, čo každý z nás priniesol tebe na slávu,<br>" +
                    "všetkým slúžilo na spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa Bože, <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo ochraňuj svoj ľud,<br>" +
                    "ktorý si nasýtil sviatostným pokrmom, <font color='#B71C1C'>—</font><br>" +
                    "a pomáhaj mu,<br>" +
                    "aby prešiel z temnoty hriechu do nového života.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"17", "Bože, ochranca všetkých, čo v teba dúfajú,<br>" +
                    "bez teba nič nie je hodnotné, nič nie je sväté; <font color='#B71C1C'>*</font><br>" +
                    "zahrňuj nás svojím milosrdenstvom <font color='#B71C1C'>—</font><br>" +
                    "a pomáhaj nám tak užívať pominuteľné veci,<br>" +
                    "aby nás privádzali k hodnotám trvácim.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi dary, ktoré ti prinášame z toho,<br>" +
                    "čo si nám uštedril, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás milosť prúdiaca z tejto obety<br>" +
                    "posväcovala v každodennom živote<br>" +
                    "a viedla k večnej radosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "prijali sme sviatosť,<br>" +
                    "ktorá je trvalou pamiatkou umučenia tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby tento dar jeho nevýslovnej lásky<br>" +
                    "slúžil nám na spásu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"18", "Veľký Bože,<br>" +
                    "nadšene vyznávame,<br>" +
                    "že si náš Stvoriteľ a Pán; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, sprevádzaj nás s otcovskou priazňou <font color='#B71C1C'>—</font><br>" +
                    "a ako si nás láskavo stvoril,<br>" +
                    "tak v nás obnovuj a zachovávaj svoju milosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo posväť tieto obetné dary,<br>" +
                    "ktoré predstavujú našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                    "a urob aj z nás večný dar pre teba.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "ty obnovuješ naše sily nebeským pokrmom<br>" +
                    "a ustavične nám prejavuješ svoju priazeň; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, opatruj nás s otcovskou starostlivosťou <font color='#B71C1C'>—</font><br>" +
                    "a priveď nás do večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"19", "Všemohúci a večný Bože,<br>" +
                    "osmeľujeme sa volať ťa Otcom,<br>" +
                    "lebo si nás prijal za svojich; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám stále rásť v synovskej láske, <font color='#B71C1C'>—</font><br>" +
                    "aby sme raz dosiahli prisľúbené dedičstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo prijmi dary,<br>" +
                    "ktoré si nám poskytol,<br>" +
                    "aby sme ti ich mohli priniesť na obetu, <font color='#B71C1C'>—</font><br>" +
                    "a svojou božskou mocou ich premeň<br>" +
                    "na sviatosť našej spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nám slúži na večnú spásu sviatosť,<br>" +
                    "ktorú sme prijali, <font color='#B71C1C'>—</font><br>" +
                    "a nech nás bezpečne vedie po ceste tvojej pravdy.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"20", "Bože a Otče náš,<br>" +
                    "pripravil si nevídané duchovné bohatstvo<br>" +
                    "všetkým, čo ťa milujú; <font color='#B71C1C'>*</font><br>" +
                    "naplň naše srdcia vrúcnou láskou, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ťa vždy a nadovšetko milovali<br>" +
                    "a dosiahli od teba prisľúbené dedičstvo,<br>" +
                    "ktoré prevyšuje všetky naše túžby.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Otče, prijmi tieto dary,<br>" +
                    "ktorými sa uskutočňuje vznešená výmena: <font color='#B71C1C'>*</font><br>" +
                    "my ti obetujeme z toho, čo si nám uštedril, <font color='#B71C1C'>—</font><br>" +
                    "a ty nám dávaš seba samého<br>" +
                    "vo svojom Synovi Ježišovi Kristovi,<br>" +
                    "ktorý žije a kraľuje na veky vekov.", "Dobrotivý Bože,<br>" +
                    "touto vznešenou sviatosťou<br>" +
                    "nám dávaš účasť na živote svojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ho na zemi verne nasledovali<br>" +
                    "a dostali sa do jeho spoločenstva v nebi.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"21", "Nebeský Otče,<br>" +
                    "ty zjednocuješ mysle veriacich<br>" +
                    "v spoločnom úsilí o dobro; <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám milovať, čo prikazuješ,<br>" +
                    "a túžiť po tom, čo sľubuješ, <font color='#B71C1C'>—</font><br>" +
                    "aby uprostred pominuteľných vecí tohto sveta<br>" +
                    "naše srdcia boli upriamené na nebo,<br>" +
                    "kde nájdeme opravdivú radosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "tvoj Syn nás svojou obetou na kríži vykúpil<br>" +
                    "a urobil z nás raz navždy tvoj ľud; <font color='#B71C1C'>*</font><br>" +
                    "preto ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "udeľ nám vo svojej Cirkvi dar jednoty a pokoja.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "týmto eucharistickým pokrmom<br>" +
                    "vylieč nás z hriechov <font color='#B71C1C'>—</font><br>" +
                    "a ustavične nás zdokonaľuj a opatruj,<br>" +
                    "aby sme sa ti vo všetkom páčili.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"22", "Všemohúci Bože, prameň všetkého dobra, <font color='#B71C1C'>*</font><br>" +
                    "zaštep nám do srdca lásku k tebe<br>" +
                    "a posilňuj našu synovskú oddanosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sa v nás dobro vzmáhalo<br>" +
                    "a pod tvojou otcovskou opaterou<br>" +
                    "bezpečne sa uchovalo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nekonečný Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nám táto eucharistická obeta<br>" +
                    "stále prináša tvoje požehnanie <font color='#B71C1C'>—</font><br>" +
                    "a nech v nás uskutočňuje dielo spásy,<br>" +
                    "ktoré nám sviatostne sprítomňuje.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "ďakujeme ti, že si nás nasýtil pri svojom stole,<br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "aby tento sviatostný pokrm<br>" +
                    "živil v našich srdciach lásku<br>" +
                    "a pobádal nás slúžiť ti<br>" +
                    "v našich bratoch a sestrách.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"23", "Láskavý Otče,<br>" +
                    "ty si nás skrze svojho Syna vykúpil<br>" +
                    "a prijal za svoje milované deti; <font color='#B71C1C'>*</font><br>" +
                    "s otcovskou láskou sprevádzaj všetkých,<br>" +
                    "čo veria v Krista, <font color='#B71C1C'>—</font><br>" +
                    "aby dosiahli pravú slobodu a večný život.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože, pôvodca úprimnej nábožnosti a darca pokoja, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme ťa dôstojne uctili našimi darmi <font color='#B71C1C'>—</font><br>" +
                    "a účasťou na eucharistickom tajomstve<br>" +
                    "upevnili medzi sebou zväzky bratskej jednoty.<br>" +
                    "Skrze Krista, nášho Pána.", "Milovaný Otče,<br>" +
                    "ty nás živíš a posilňuješ<br>" +
                    "svojím slovom a sviatostným chlebom; <font color='#B71C1C'>*</font><br>" +
                    "daj, nech prijímame tieto vznešené dary<br>" +
                    "so živou vierou a láskou, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dosiahli večnú účasť<br>" +
                    "na živote tvojho Syna Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov."},
            {"24", "Všemohúci Bože,<br>" +
                    "všetko si múdro stvoril a všetko starostlivo riadiš; <font color='#B71C1C'>*</font><br>" +
                    "zhliadni na nás a pomôž nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti slúžili celým srdcom<br>" +
                    "a tešili sa tvojej otcovskej priazni.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "vypočuj naše prosby<br>" +
                    "a láskavo prijmi naše dary, <font color='#B71C1C'>—</font><br>" +
                    "aby to, čo každý z nás obetoval tebe na slávu,<br>" +
                    "všetkým slúžilo na spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nám sila sviatostného pokrmu<br>" +
                    "preniká dušu i telo, <font color='#B71C1C'>—</font><br>" +
                    "aby v nás neprevládali zlé sklony,<br>" +
                    "ale spásonosné účinky tejto sviatosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"25", "Všemohúci Bože,<br>" +
                    "všetky ustanovenia posvätného zákona<br>" +
                    "zhrnul si do prikázania lásky k tebe a k blížnemu; <font color='#B71C1C'>*</font><br>" +
                    "daj nám silu plniť tvoju vôľu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme tak mohli dosiahnuť večný život.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary svojho ľudu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme touto eucharistickou obetou<br>" +
                    "dosiahli dobrá,<br>" +
                    "po ktorých so synovskou dôverou túžime.<br>" +
                    "Skrze Krista, nášho Pána.", "Milostivý Bože,<br>" +
                    "ty nás obnovuješ pri sviatostnom stole; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa,<br>" +
                    "ustavične nás sprevádzaj svojou pomocou, <font color='#B71C1C'>—</font><br>" +
                    "aby sa spásonosné účinky prijatej sviatosti<br>" +
                    "prejavovali v našom každodennom živote.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"26", "Dobrotivý Bože,<br>" +
                    "ty najviac prejavuješ svoju všemohúcnosť,<br>" +
                    "keď sa zmilúvaš a odpúšťaš; <font color='#B71C1C'>*</font><br>" +
                    "neprestajne nám dávaj svoju milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme príkladným kresťanským životom na zemi<br>" +
                    "dosiahli prisľúbenú blaženosť v nebi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše obetné dary <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nám táto svätá omša<br>" +
                    "bola prameňom hojného požehnania.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "slávením Eucharistie zvestujeme smrť tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "nech nás táto vznešená sviatosť obnovuje<br>" +
                    "na duchu i na tele<br>" +
                    "a nech nám dá silu trpieť s Ježišom Kristom,<br>" +
                    "aby sme sa raz stali jeho spoludedičmi<br>" +
                    "v nebeskej sláve.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"27", "Všemohúci a večný Bože,<br>" +
                    "vo svojej štedrosti dávaš prosiacim viac,<br>" +
                    "než si zasluhujú a žiadajú; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa,<br>" +
                    "odpusť nám viny, čo znepokojujú naše svedomie, <font color='#B71C1C'>—</font><br>" +
                    "a udeľ nám aj tie milosti,<br>" +
                    "o ktoré sa ani neodvažujeme prosiť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>",
                    "Prosíme ťa, Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetu,<br>" +
                    "ktorú ti prinášame podľa tvojho ustanovenia, <font color='#B71C1C'>—</font><br>" +
                    "a týmto svätým tajomstvom,<br>" +
                    "ktoré slávime ako prejav úprimnej vďačnosti,<br>" +
                    "posväcuj svoj vykúpený ľud.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech je nám táto vznešená sviatosť<br>" +
                    "výdatným duchovným pokrmom a nápojom, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa premieňali v Ježiša Krista,<br>" +
                    "ktorého sme prijali.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"28", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás tvoja milosť<br>" +
                    "ustavične predchádza i sprevádza, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy horlivo konali dobré skutky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše modlitby a dary <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás Eucharistia, ktorú nábožne slávime,<br>" +
                    "priviedla do nebeskej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "pri obetnej hostine nás živíš<br>" +
                    "telom a krvou svojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj nám touto sviatosťou spásy<br>" +
                    "stále plnšiu účasť na svojom božskom živote.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"29", "Všemohúci a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám,<br>" +
                    "aby sme vždy ochotne plnili tvoju vôľu <font color='#B71C1C'>—</font><br>" +
                    "a slúžili ti s úprimným srdcom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám slúžiť ti pri tvojom oltári<br>" +
                    "s úprimným srdcom <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás očistila tvoja milosť<br>" +
                    "a posvätila obeta, ktorú konáme.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám častým prijímaním<br>" +
                    "sviatostného pokrmu<br>" +
                    "napredovať v čnosti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme správne užívali pozemské dary<br>" +
                    "a stále rástli v túžbe po nebeských dobrách.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"30", "Všemohúci a večný Bože,<br>" +
                    "rozmnož v nás vieru, nádej a lásku <font color='#B71C1C'>*</font><br>" +
                    "a pomáhaj nám milovať, čo prikazuješ, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dosiahli, čo sľubuješ.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Vznešený Bože, <font color='#B71C1C'>*</font><br>" +
                    "zhliadni na dary,<br>" +
                    "ktoré ti prinášame s oddaným srdcom, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby táto eucharistická obeta<br>" +
                    "slúžila na tvoju slávu.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože náš, vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "nech prijatá sviatosť uskutočňuje v nás dielo spásy, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa raz dokonale spojili s Kristom,<br>" +
                    "ktorého teraz prijímame pod sviatostnými znakmi.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"31", "Všemohúci a večný Bože,<br>" +
                    "je darom tvojej štedrosti,<br>" +
                    "že ti môžeme dôstojne a chvályhodne slúžiť; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj nám silu<br>" +
                    "premáhať prekážky na ceste spásy, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa dostali do prisľúbenej blaženosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sa tieto dary stali čistou<br>" +
                    "a svätou obetou pre teba <font color='#B71C1C'>—</font><br>" +
                    "a pre nás bohatým prameňom tvojho milosrdenstva.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "rozmnož v nás pôsobenie svojej milosti, <font color='#B71C1C'>—</font><br>" +
                    "aby nás sviatosť, ktorú sme prijali,<br>" +
                    "pripravila na prisľúbenú blaženosť.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"32", "Všemohúci a milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo odvráť od nás všetky protivenstvá, <font color='#B71C1C'>—</font><br>" +
                    "aby sme bez vnútorných a vonkajších prekážok<br>" +
                    "mohli plniť tvoju vôľu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče,<br>" +
                    "zhliadni na tieto obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a pomôž nám nábožne sláviť<br>" +
                    "pamiatku umučenia tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dosiahli plnšiu účasť na jeho vykúpení.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "ďakujeme ti, že si nás posilnil Chlebom života, <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, nech nás sila Ducha Svätého,<br>" +
                    "ktorá pôsobí vo sviatostiach, ustavične obnovuje,<br>" +
                    "aby sme ti zostali úprimne oddaní.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"33", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám,<br>" +
                    "aby sme ťa radostne a oddane uctievali, <font color='#B71C1C'>—</font><br>" +
                    "lebo trvalé a dokonalé šťastie dosiahneme iba vtedy,<br>" +
                    "keď budeme vždy slúžiť tebe,<br>" +
                    "pôvodcovi všetkého dobra.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nám obeta, ktorú slávime,<br>" +
                    "pomáhala žiť pre teba <font color='#B71C1C'>—</font><br>" +
                    "a zaistila nám večnú blaženosť.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "posilnení sviatostným pokrmom pokorne prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby Eucharistia,<br>" +
                    "ktorú nám tvoj Syn prikázal sláviť na svoju pamiatku,<br>" +
                    "rozmnožila v nás lásku k tebe a k blížnemu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"34", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "ustavične povzbudzuj našu vôľu,<br>" +
                    "aby sme horlivo spolupracovali<br>" +
                    "na diele našej spásy <font color='#B71C1C'>—</font><br>" +
                    "a v bohatej miere dosiahli<br>" +
                    "dary tvojej otcovskej dobroty.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Otče,<br>" +
                    "s úľubou prijmi posvätné dary,<br>" +
                    "ktoré prinášame na oltár z tvojho ustanovenia; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomôž nám zachovávať<br>" +
                    "tvoje prikázania, <font color='#B71C1C'>—</font><br>" +
                    "aby si aj v nás našiel zaľúbenie.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "ďakujeme ti za radosť,<br>" +
                    "že sa vo svätom prijímaní môžeme spojiť s tebou; <font color='#B71C1C'>—</font><br>" +
                    "nikdy nedopusť, aby sme sa od teba odlúčili.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána.<br>"},
    };

    String[][] postModlitby = {
            {"03", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "dopraj nám týmto svätým pôstom<br>" +
                    "nastúpiť cestu duchovnej obnovy, <font color='#B71C1C'>—</font><br>" +
                    "aby nás pokánie posilňovalo v boji<br>" +
                    "proti nepriateľom spásy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš, prijmi túto obetu,<br>" +
                    "ktorou slávnostne začíname pôstne obdobie; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa,<br>" +
                    "nech nám pokánie a skutky lásky pomáhajú<br>" +
                    "krotiť škodlivé náruživosti<br>" +
                    "a očistiť sa od hriechov, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli nábožne sláviť<br>" +
                    "tajomstvo umučenia tvojho Syna,<br>" +
                    "ktorý s tebou žije a kraľuje po všetky veky vekov.", "Dobrotivý Bože, prosíme ťa,<br>" +
                    "nech nám prijatá sviatosť pomáha, <font color='#B71C1C'>*</font><br>" +
                    "aby sme sa ti zapáčili svojím pôstom <font color='#B71C1C'>—</font><br>" +
                    "a vyliečili sa zo všetkých slabostí.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"04", "Všemohúci Bože,<br>" +
                    "predchádzaj naše konanie svojím vnuknutím<br>" +
                    "a sprevádzaj ho svojou pomocou, <font color='#B71C1C'>*</font><br>" +
                    "aby sme všetky podujatia s tebou začínali <font color='#B71C1C'>—</font><br>" +
                    "a s tvojou pomocou i dokončili.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "milostivo pozri na obetné dary,<br>" +
                    "ktoré kladieme na tvoj oltár; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby svätá obeta, ktorú slávime,<br>" +
                    "nám získala odpustenie hriechov <font color='#B71C1C'>—</font><br>" +
                    "a tvojmu menu slúžila na slávu.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, pokorne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "aby nám nebeský pokrm, ktorým si nás nasýtil, <font color='#B71C1C'>—</font><br>" +
                    "bol nevyčerpateľným prameňom<br>" +
                    "odpustenia a spásy.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"05", "Dobrotivý Otče,<font color='#B71C1C'>*</font><br>" +
                    "sprevádzaj svojou pomocou<br>" +
                    "naše prvé kroky na ceste pokánia,<font color='#B71C1C'>—</font><br>" +
                    "aby vonkajšie úkony kajúcnosti<br>" +
                    "vychádzali z úprimného srdca.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš,<br>" +
                    "eucharistická obeta,<br>" +
                    "ktorú slávime v tejto pôstnej dobe, <font color='#B71C1C'>*</font><br>" +
                    "nech zmení naše zmýšľanie, aby sme sa ti páčili, <font color='#B71C1C'>—</font><br>" +
                    "a nech nám dá silu,<br>" +
                    "aby sme sa ochotnejšie premáhali.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás účasť na sviatostnej hostine<br>" +
                    "očistí od všetkých previnení, <font color='#B71C1C'>—</font><br>" +
                    "aby náš život zodpovedal<br>" +
                    "výzvam tvojej lásky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"06", "Všemohúci a večný Bože,<br>" +
                    "milosrdne zhliadni na našu krehkosť <font color='#B71C1C'>*</font><br>" +
                    "a vystri nad nás svoju ochrannú ruku, <font color='#B71C1C'>—</font><br>" +
                    "aby sme zvíťazili v boji proti zlu.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, Bože,<br>" +
                    "prijmi túto obetu zmierenia a chvály <font color='#B71C1C'>*</font><br>" +
                    "a daj, nech nás očistí, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti mohli slúžiť s úprimným srdcom.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "posilnení sviatostným pokrmom vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "aby nám eucharistické tajomstvo,<br>" +
                    "ktoré slávime v pozemskom živote, <font color='#B71C1C'>—</font><br>" +
                    "pomohlo dosiahnuť život večný.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"10", "Všemohúci Bože,<br>" +
                    "udeľ nám milosť, <font color='#B71C1C'>*</font><br>" +
                    "aby sme prežívaním štyridsaťdenného<br>" +
                    "pôstneho obdobia<br>" +
                    "hlbšie vnikali do Kristovho tajomstva <font color='#B71C1C'>—</font><br>" +
                    "a čnostným životom napredovali na ceste k spáse.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš, pomôž nám,<font color='#B71C1C'>*</font><br>" +
                    "aby sme sa celým srdcom zapojili do tejto obety, <font color='#B71C1C'>—</font><br>" +
                    "ktorou začíname prípravu<br>" +
                    "na slávenie veľkonočného tajomstva.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "posilnil si nás nebeským chlebom,<br>" +
                    "ktorý v nás rozmnožuje vieru,<br>" +
                    "posilňuje nádej a rozohňuje lásku; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme túžili<br>" +
                    "po živom a pravom chlebe, ktorým je Kristus, <font color='#B71C1C'>—</font><br>" +
                    "a živili sa každým slovom pochádzajúcim od teba.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"11", "Milosrdný Bože a Záchranca náš, <font color='#B71C1C'>*</font><br>" +
                    "obráť k sebe naše srdcia<br>" +
                    "a pouč naše mysle nebeskou náukou, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa pôstnym pokáním<br>" +
                    "zdokonalili v kresťanskom živote.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Otče, prijmi tieto dary<br>" +
                    "ako prejav našej oddanosti <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby sme pre zásluhy eucharistickej obety<br>" +
                    "získali milosť odpustenia <font color='#B71C1C'>—</font><br>" +
                    "a v každodennom živote čoraz vernejšie nasledovali<br>" +
                    "príklad Ježiša Krista,<br>" +
                    "ktorý žije a kraľuje na veky vekov.", "Láskavý Bože,<br>" +
                    "nech je nám sviatosť, ktorú sme prijali,<br>" +
                    "duchovnou i telesnou posilou, <font color='#B71C1C'>*</font><br>" +
                    "aby sme sa mohli tešiť z večnej slávy, <font color='#B71C1C'>—</font><br>" +
                    "ku ktorej nám dopomáha tento nebeský pokrm.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"12", "Láskavý Otče <font color='#B71C1C'>*</font><br>" +
                    "zhliadni na svoju rodinu a pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa striedmym užívaním hmotných vecí<br>" +
                    "zbavovali sebectva<br>" +
                    "a zahoreli vrúcnou túžbou po tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože a Stvoriteľ náš, <font color='#B71C1C'>*</font><br>" +
                    "prijmi dary, ktoré ti prinášame z toho,<br>" +
                    "čo si nám veľkodušne uštedril, <font color='#B71C1C'>—</font><br>" +
                    "a premeň tento časný pokrm<br>" +
                    "na zdroj života večného.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "nech nám prijatá sviatosť dá silu<br>" +
                    "mierniť pozemské žiadosti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa oduševnili za veci nebeské.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"13", "Milosrdný Bože,<br>" +
                    "láskavo zhliadni na oddanosť svojho ľudu <font color='#B71C1C'>*</font><br>" +
                    "a pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme zdržanlivosťou ovládali svoje telo<br>" +
                    "a dobrými skutkami sa vzmáhali na duchu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "predkladáme ti dary, ktoré si nám dal,<br>" +
                    "aby sme ti ich mohli obetovať; <font color='#B71C1C'>—</font><br>" +
                    "prosíme ťa, premeň ich na sviatosť,<br>" +
                    "ktorú prijmeme ako pokrm pre večný život.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Bože,<br>" +
                    "neprestajne nás živíš svojím slovom<br>" +
                    "a sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nás tieto sväté dary priviedli k večnej spáse.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"14", "Všemohúci Bože, prosíme ťa,<br>" +
                    "vnukaj nám správne myšlienky a predsavzatia<br>" +
                    "a daj nám ochotu podľa nich aj konať; <font color='#B71C1C'>*</font><br>" +
                    "a pretože nemôžeme jestvovať bez teba, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám žiť podľa tvojej svätej vôle.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "vypočuj našu pokornú prosbu: <font color='#B71C1C'>*</font><br>" +
                    "láskavo prijmi obetné dary a modlitby,<br>" +
                    "ktoré ti prednášame, <font color='#B71C1C'>—</font><br>" +
                    "a pritiahni naše srdcia k sebe.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "daroval si nám túto sviatosť,<br>" +
                    "aby nám bola posilou na ceste spásy; <font color='#B71C1C'>—</font><br>" +
                    "daj, nech nám sväté prijímanie slúži<br>" +
                    "ako duchovný liek<br>" +
                    "v každej chvíli nášho života.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"15", "Všemohúci Bože,<br>" +
                    "pomáhaj nám náležite sa pripraviť<br>" +
                    "na veľkonočné sviatky, <font color='#B71C1C'>*</font><br>" +
                    "aby telesné odriekanie,<br>" +
                    "na ktoré sme sa spoločne podujali, <font color='#B71C1C'>—</font><br>" +
                    "všetkým slúžilo na duchovné posvätenie.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "prijmi tieto obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby nás presvätá obeta,<br>" +
                    "ktorú z tvojej vôle slávime, <font color='#B71C1C'>—</font><br>" +
                    "uzmierila s tebou a obnovila v nás dielo spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "nech nás nábožné prijatie tvojej sviatosti<br>" +
                    "vnútorne obnoví, <font color='#B71C1C'>*</font><br>" +
                    "očistí od škvŕn minulosti <font color='#B71C1C'>—</font><br>" +
                    "a privedie do blaženého spoločenstva s tebou.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"16", "Večný Otče,<br>" +
                    "obráť k sebe naše srdcia, <font color='#B71C1C'>*</font><br>" +
                    "aby sme vždy hľadali to jedine potrebné <font color='#B71C1C'>—</font><br>" +
                    "a činorodou láskou sa venovali tvojej službe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás duchovne obnoví táto sviatostná obeta, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli hodní večnej odmeny.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože a Otče náš, nasýtil si nás svojím slovom<br>" +
                    "a eucharistickým chlebom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "ustavične nás sprevádzaj svojou priazňou<br>" +
                    "a povzbudzuj nás nádejou na spásu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"20", "Nebeský Otče,<br>" +
                    "ty si nám prikázal<br>" +
                    "počúvať tvojho milovaného Syna; <font color='#B71C1C'>*</font><br>" +
                    "živ našu vieru svojím slovom<br>" +
                    "a očisťuj náš duchovný zrak, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa mohli vo večnosti tešiť<br>" +
                    "z pohľadu na tvoju velebu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, Bože,<br>" +
                    "nech táto obeta zotrie naše viny <font color='#B71C1C'>*</font><br>" +
                    "a posvätí nás na tele i na duši, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli dôstojne sláviť veľkonočné sviatky.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ti ďakujeme,<br>" +
                    "že môžeme prijímať Najsvätejšiu sviatosť <font color='#B71C1C'>—</font><br>" +
                    "a že nám už v pozemskom živote<br>" +
                    "dávaš účasť na nebeskej hostine.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"21", "Milosrdný Bože,<br>" +
                    "vo svojej otcovskej láske<br>" +
                    "prikazuješ nám telesné umŕtvovanie<br>" +
                    "ako duchovný liek; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám<br>" +
                    "chrániť sa každého hriechu <font color='#B71C1C'>—</font><br>" +
                    "a verne zachovávať tvoje prikázania.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Svätý Bože, milostivo vyslyš naše prosby <font color='#B71C1C'>*</font><br>" +
                    "a vysloboď nás z osídel hriechu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli dôstojne sláviť<br>" +
                    "tieto nebeské tajomstvá.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijatie eucharistického pokrmu<br>" +
                    "nech nás uchráni od hriechu <font color='#B71C1C'>—</font><br>" +
                    "a nech nám dá účasť na nebeskej radosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"22", "Milostivý Bože, prosíme ťa,<br>" +
                    "ustavične ochraňuj svoju Cirkev; <font color='#B71C1C'>*</font><br>" +
                    "a pretože my smrteľní ľudia<br>" +
                    "bez tvojej pomoci klesáme,<br>" +
                    "pomáhaj nám svojou milosťou<br>" +
                    "vyhýbať sa nebezpečenstvám <font color='#B71C1C'>—</font><br>" +
                    "a sprevádzaj nás na ceste spásy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "nech nás táto zmierna obeta<br>" +
                    "posvätí svojou milosťou, <font color='#B71C1C'>*</font><br>" +
                    "očistí od našich previnení <font color='#B71C1C'>—</font><br>" +
                    "a pripraví na odmenu v nebi.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech účasť na sviatostnej hostine<br>" +
                    "zveľaďuje náš duchovný život <font color='#B71C1C'>—</font><br>" +
                    "a poskytuje nám ustavičnú pomoc.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"23", "Nebeský Otče,<br>" +
                    "pomáhaj svojej rodine<br>" +
                    "ochotne konať dobré skutky <font color='#B71C1C'>*</font><br>" +
                    "a potešuj nás svojou ochranou<br>" +
                    "na pozemskej púti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme šťastlivo prišli<br>" +
                    "do nebeskej vlasti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "Bože a Otče náš,<br>" +
                    "milostivo prijmi naše obetné dary, <font color='#B71C1C'>*</font><br>" +
                    "a premeň ich na telo a krv svojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "aby táto tajomná výmena darov<br>" +
                    "rozviazala putá našich hriechov.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "aby nám eucharistický pokrm,<br>" +
                    "ktorý si nám dal ako záloh nesmrteľnosti, <font color='#B71C1C'>—</font><br>" +
                    "zabezpečil večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"24", "Milosrdný Bože,<br>" +
                    "ty miluješ nevinnosť<br>" +
                    "a navraciaš ju kajúcim hriešnikom; <font color='#B71C1C'>*</font><br>" +
                    "preto ťa prosíme,<br>" +
                    "zapáľ v nás oheň Ducha Svätého<br>" +
                    "a obráť naše srdcia k tebe, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli pevní vo viere<br>" +
                    "a dosvedčovali ju svojím životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "touto obetou posväť naše pokánie; <font color='#B71C1C'>*</font><br>" +
                    "nech vonkajšie úkony kajúcnosti,<br>" +
                    "na ktoré sme sa podujali v tejto pôstnej dobe, <font color='#B71C1C'>—</font><br>" +
                    "obnovia a posilnia v nás život milosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech v nás neprestajne pôsobí<br>" +
                    "eucharistická obeta, ktorú sme slávili, <font color='#B71C1C'>—</font><br>" +
                    "a nech nás upevňuje vo vzájomnej láske.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"25", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám v tejto pôstnej dobe<br>" +
                    "očistiť sa úprimným pokáním, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli s obnoveným srdcom<br>" +
                    "sláviť veľkonočné tajomstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš,<br>" +
                    "predchádzaj nás svojou milosťou <font color='#B71C1C'>*</font><br>" +
                    "a pomáhaj nám žiť podľa tvojej vôle, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli dôstojne<br>" +
                    "sláviť túto svätú obetu.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nám záloh večného života, ktorý sme prijali,<br>" +
                    "pomáha duchovne stále napredovať, <font color='#B71C1C'>—</font><br>" +
                    "aby sme raz dosiahli večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"26", "Dobrotivý Bože,<br>" +
                    "ty liečiš naše slabosti svojou milosťou<br>" +
                    "a už teraz nám dávaš účasť na svojom živote; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, riaď naše kroky na pozemskej púti <font color='#B71C1C'>—</font><br>" +
                    "a priveď nás do svetla,<br>" +
                    "v ktorom večne prebývaš.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "touto svätou obetou<br>" +
                    "rozmnož v nás účinky vykúpenia, <font color='#B71C1C'>*</font><br>" +
                    "aby nás chránili od hriešnej nezriadenosti <font color='#B71C1C'>—</font><br>" +
                    "a posilňovali na ceste k večnej spáse.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Bože,<br>" +
                    "vznešená sviatosť, ktorú sme nábožne prijali, <font color='#B71C1C'>*</font><br>" +
                    "nech prenikne naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy horlivejšie žili pre teba.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"30", "Bože, prameň nekonečného milosrdenstva<br>" +
                    "a nesmiernej dobroty, <font color='#B71C1C'>*</font><br>" +
                    "ty nás učíš,<br>" +
                    "že pôst, modlitba a skutky kresťanskej lásky<br>" +
                    "sú liekom proti hriechu; <font color='#B71C1C'>—</font><br>" +
                    "láskavo prijmi vyznanie našej slabosti,<br>" +
                    "a keď klesáme pod ťarchou previnení,<br>" +
                    "pozdvihni nás svojou milosrdnou rukou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "očisti nás touto obetou od našich hriechov <font color='#B71C1C'>*</font><br>" +
                    "a daj nám silu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme aj my ochotne<br>" +
                    "odpúšťali svojim bratom.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "už v pozemskom živote nás živíš nebeským chlebom<br>" +
                    "a dávaš nám tak záloh nebeskej blaženosti; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sa účinky tejto sviatosti<br>" +
                    "prejavovali aj v našich skutkoch.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"31", "Svätý Bože,<br>" +
                    "milostivo očisťuj a ochraňuj svoju Cirkev, <font color='#B71C1C'>*</font><br>" +
                    "a pretože sa nemôžeme zaobísť bez tvojej pomoci, <font color='#B71C1C'>—</font><br>" +
                    "neprestajne nás sprevádzaj svojou milosťou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary, ktoré ti prinášame<br>" +
                    "na znak úprimnej oddanosti, <font color='#B71C1C'>—</font><br>" +
                    "a premeň ich na sviatosť našej spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nás prijatie sviatostného pokrmu<br>" +
                    "očistilo od každej viny <font color='#B71C1C'>—</font><br>" +
                    "a zjednotilo v pokoji a láske.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"32", "Pane a Bože náš,<br>" +
                    "ustavične nás sprevádzaj svojou milosťou <font color='#B71C1C'>*</font><br>" +
                    "a poskytuj nám svoju pomoc, <font color='#B71C1C'>—</font><br>" +
                    "aby sme oddane zotrvali v tvojej svätej službe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech spásonosná obeta, ktorú slávime,<br>" +
                    "zotrie naše viny <font color='#B71C1C'>—</font><br>" +
                    "a uzmieri nás s tebou.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože a Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "nech nás účasť na eucharistickej obete<br>" +
                    "oslobodí od hriechov a posilní v duchovnom boji, <font color='#B71C1C'>—</font><br>" +
                    "aby sa v nás rozmáhal život viery.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"33", "Milosrdný Bože,<br>" +
                    "v tomto štyridsaťdennom pôstnom období<br>" +
                    "živíš nás svojím slovom<br>" +
                    "a vedieš nás k duchovnej obnove; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomôž nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa kajúcimi skutkami celkom oddali tebe<br>" +
                    "a v bratskej láske spoločne ťa vzývali<br>" +
                    "ako svojho Otca.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Otče náš,<br>" +
                    "prijmi naše prosby a obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a ochraňuj pred každým<br>" +
                    "nebezpečenstvom nás všetkých, <font color='#B71C1C'>—</font><br>" +
                    "čo slávime tieto sväté tajomstvá.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás sviatostný pokrm, ktorým si nás nasýtil,<br>" +
                    "očistí od všetkých previnení <font color='#B71C1C'>—</font><br>" +
                    "a pripraví pre život večný,<br>" +
                    "ktorý si nám prisľúbil.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"34", "Velebný Bože, pokorne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme sa tým nábožnejšie pripravovali<br>" +
                    "na slávenie veľkonočného tajomstva, <font color='#B71C1C'>—</font><br>" +
                    "čím viac sa blížia sviatky nášho vykúpenia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Presvätý Bože,<br>" +
                    "očisti nás od nákazy hriechov<br>" +
                    "a s úľubou prijmi naše dary; <font color='#B71C1C'>*</font><br>" +
                    "nedopusť, aby sme sa dali zlákať<br>" +
                    "klamnými radosťami, <font color='#B71C1C'>—</font><br>" +
                    "ale veď nás k pravému šťastiu,<br>" +
                    "ktoré si nám prisľúbil.<br>" +
                    "Skrze Krista, nášho Pána.", "Večný Bože,<br>" +
                    "s otcovskou láskou nás<br>" +
                    "nasycuješ nebeským pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "posilňuj nás svojou pomocou, <font color='#B71C1C'>—</font><br>" +
                    "aby sa ozdravujúca milosť tejto sviatosti<br>" +
                    "prejavovala aj v našom živote.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"35", "Dobrotivý Bože,<br>" +
                    "naplň naše srdcia svojou milosťou, <font color='#B71C1C'>*</font><br>" +
                    "aby sme sa chránili všetkých nezriadeností <font color='#B71C1C'>—</font><br>" +
                    "a s tvojou pomocou sa pridržiavali<br>" +
                    "nebeských vnuknutí.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "Pane a Bože náš,<br>" +
                    "milostivo zhliadni na dary,<br>" +
                    "ktoré ti predkladáme: <font color='#B71C1C'>*</font><br>" +
                    "tebe nech sú milé <font color='#B71C1C'>—</font><br>" +
                    "a nám nech sa stanú prameňom spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče,<br>" +
                    "svojou milosťou nás posilňuj na tele i na duši, <font color='#B71C1C'>*</font><br>" +
                    "aby sme raz v plnej miere dosiahli spásu, <font color='#B71C1C'>—</font><br>" +
                    "na ktorej nám dávaš účasť sviatostným pokrmom.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"36", "Dobrotivý Otče,<br>" +
                    "s duchovnou radosťou konáme pokánie<br>" +
                    "v tejto pôstnej dobe; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám vždy hlbšie prežívať<br>" +
                    "veľkonočné tajomstvo, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v plnej miere dosiahli<br>" +
                    "jeho spásonosné účinky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Svätý Bože, tebe vďačíme,<br>" +
                    "že môžeme pristupovať k tvojim svätým tajomstvám<br>" +
                    "s čistým srdcom; <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti slávením ich ustanovenia<br>" +
                    "vzdávali dôstojnú chválu.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "ty nás ustavične posväcuješ<br>" +
                    "touto vznešenou sviatosťou; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme telo a krv tvojho Syna prijímali<br>" +
                    "vždy s veľkou úctou a s oddaným srdcom.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"40", "Večný Otče, prostredníctvom svojho Syna<br>" +
                    "obdivuhodne zmieruješ so sebou ľudské pokolenie; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj kresťanskému ľudu, <font color='#B71C1C'>—</font><br>" +
                    "aby kráčal v ústrety veľkonočným sviatkom<br>" +
                    "s vrúcnou nábožnosťou a so živou vierou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, s radosťou ti prinášame dary,<br>" +
                    "ktoré sa nám stanú posilou pre večný život; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám s hlbokou vierou sláviť obetu,<br>" +
                    "ktorá prináša spásu celému svetu.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "ty osvecuješ každého človeka<br>" +
                    "prichádzajúceho na tento svet; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, osvieť nás žiarou svojej milosti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy mali na mysli to,<br>" +
                    "čo sa zhoduje s tvojou vôľou,<br>" +
                    "a milovali ťa s úprimným srdcom.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"41", "Všemohúci Bože,<br>" +
                    "svojimi vznešenými sviatosťami obnovuješ svet; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj, aby sa Cirkev vzmáhala<br>" +
                    "týmito znakmi tvojej prítomnosti <font color='#B71C1C'>—</font><br>" +
                    "a nikdy nezostala bez tvojej otcovskej pomoci.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše dary a dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby nás táto svätá obeta oslobodila<br>" +
                    "od pripútanosti k hriechu<br>" +
                    "a pomáhala nám v úsilí<br>" +
                    "o prehĺbenie kresťanského života.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás obnovujúca sila tejto sviatosti<br>" +
                    "ustavične oživuje a posväcuje, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa stali hodnými večného života.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"42", "Milosrdný Bože,<br>" +
                    "modlitby a kajúce skutky v tejto pôstnej dobe<br>" +
                    "nech pripravia naše srdcia, <font color='#B71C1C'>*</font><br>" +
                    "aby sme ochotne prijali veľkonočnú milosť <font color='#B71C1C'>—</font><br>" +
                    "a ohlasovali svetu radostnú zvesť o vykúpení.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Bože a Stvoriteľ náš,<br>" +
                    "prinášame ti dary chleba a vína,<br>" +
                    "ktoré nám dávaš na zachovanie pozemského života; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, premeň ich svojou božskou mocou, <font color='#B71C1C'>—</font><br>" +
                    "aby sa nám stali prameňom nesmrteľnosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "dokonale nás očisti a obnov sviatosťou,<br>" +
                    "ktorú sme prijali, <font color='#B71C1C'>—</font><br>" +
                    "aby aj naše telo z nej čerpalo posväcujúcu silu<br>" +
                    "a bolo raz oslávené s víťazným Kristom,<br>" +
                    "ktorý žije a kraľuje na veky vekov."},
            {"43", "Milosrdný Bože,<br>" +
                    "ty odmeňuješ spravodlivých za ich zásluhy<br>" +
                    "a hriešnikom odpúšťaš pre ich pokánie; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme,<br>" +
                    "zmiluj sa nad nami a pomôž nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pokorne vyznali svoje hriechy,<br>" +
                    "a tak dosiahli tvoje odpustenie.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech táto svätá obeta zotrie naše hriechy, <font color='#B71C1C'>—</font><br>" +
                    "zveľadí v nás nový život<br>" +
                    "a zaistí nám spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Milostivý Bože,<br>" +
                    "dávaš nám nebeský pokrm<br>" +
                    "ako posilu na životnej púti; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "nedopusť, aby nám bola na odsúdenie sviatosť,<br>" +
                    "ktorú si nám určil na spasenie.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"44", "Dobrotivý Bože,<br>" +
                    "v tejto pôstnej dobe nám ponúkaš milosť<br>" +
                    "napraviť sa pokáním<br>" +
                    "a posvätiť sa dobrými skutkami; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám verne zachovávať tvoje prikázania,<br>" +
                    "aby sme mohli s úprimným srdcom sláviť<br>" +
                    "veľkonočné sviatky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "zľutuj sa nad nami krehkými,<br>" +
                    "prijmi naše dary, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás táto svätá obeta<br>" +
                    "očistila od poškvrny hriechu<br>" +
                    "a upevnila v čnostnom živote.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, láskavý Otče,<br>" +
                    "očisti nás sviatosťou, ktorú sme prijali,<br>" +
                    "aby sme boli oslobodení od každej viny; <font color='#B71C1C'>*</font><br>" +
                    "a keď nás sužujú výčitky svedomia, <font color='#B71C1C'>—</font><br>" +
                    "poteš nás svojím odpustením<br>" +
                    "a nádejou na večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"45", "Milosrdný Otče,<br>" +
                    "ty si nám, krehkým ľuďom,<br>" +
                    "pripravil potrebnú posilu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s vďačným srdcom<br>" +
                    "prijímali ovocie vykúpenia<br>" +
                    "a nábožným životom<br>" +
                    "dávali najavo svoju duchovnú obnovu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "pre zásluhy tejto obety zotri naše viny <font color='#B71C1C'>—</font><br>" +
                    "a priveď nás čistých<br>" +
                    "k jej pôvodcovi, Ježišovi Kristovi,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov.", "Milostivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "sviatosť, ktorú sme prijali, nám pripomína<br>" +
                    "prechod zo Starej zmluvy do Novej; <font color='#B71C1C'>—</font><br>" +
                    "nech nám pomôže zanechať starý spôsob života<br>" +
                    "a viesť nový život podľa príkladu Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov."},
            {"46", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "svojou milosrdnou láskou<br>" +
                    "pritiahni k sebe naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "lebo bez tvojej milosti sa nemôžeme páčiť tebe,<br>" +
                    "ktorý si prameň všetkej svätosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi tieto obetné dary <font color='#B71C1C'>—</font><br>" +
                    "a silou svojej lásky<br>" +
                    "podmaň si aj našu vzdorovitú vôľu.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás táto sviatosť<br>" +
                    "očistí a zdokonalí, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa ti celým životom páčili.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"50", "Prosíme ťa, Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám nadšene žiť v tej láske, <font color='#B71C1C'>—</font><br>" +
                    "ktorou tvoj Syn Ježiš Kristus ľudstvo miloval<br>" +
                    "a na kríži sa zaň obetoval.<br>" +
                    "On je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "vo svojej otcovskej láske<br>" +
                    "priviedol si nás k poznaniu kresťanskej viery; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, očisti nás touto obetou<br>" +
                    "od všetkých hriechov <font color='#B71C1C'>—</font><br>" +
                    "a pretvor nás na nových ľudí.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy boli živými údmi Ježiša Krista,<br>" +
                    "ktorého telo a krv prijímame.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"51", "Milosrdný Bože,<br>" +
                    "vo svojej nevýslovnej láske<br>" +
                    "nás zahrnuješ hojným požehnaním; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám<br>" +
                    "zanechať hriešne návyky a začať čnostný život, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa pripravili<br>" +
                    "na slávu nebeského kráľovstva.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože,<br>" +
                    "s radosťou prinášame dary na najsvätejšiu obetu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomôž nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ti ochotne obetovali aj svoje srdcia,<br>" +
                    "očistené telesným pokáním.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "nech nás milosť prijatej sviatosti<br>" +
                    "ustavične očisťuje od hriešnych náklonností, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ochotne nasledovali Krista<br>" +
                    "a čoraz horlivejšie napredovali na ceste k tebe.<br>" +
                    "O to ťa prosíme skrze Krista, nášho Pána."},
            {"52", "Nekonečný Bože,<font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám vytrvalo plniť tvoju vôľu<br>" +
                    "a ochotne ti slúžiť, <font color='#B71C1C'>—</font><br>" +
                    "aby tvoja Cirkev aj v dnešných časoch<br>" +
                    "rástla počtom<br>" +
                    "a obohacovala sa dobrými skutkami.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "pre zásluhy zmiernej obety, ktorú slávime, <font color='#B71C1C'>—</font><br>" +
                    "odpusť nám viny<br>" +
                    "a usmerňuj k sebe naše nestále srdcia.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, všemohúci Otče, <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám vždy nábožnejšie sláviť<br>" +
                    "tieto sväté tajomstvá, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli čoraz hodnejší nebeskej odmeny.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"53", "Milosrdný Bože,<br>" +
                    "posväť naše srdcia očistené pokáním <font color='#B71C1C'>*</font><br>" +
                    "a pomáhaj nám oddane ti slúžiť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dosiahli milosti, o ktoré ťa pokorne prosíme.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Otče,<br>" +
                    "od teba sme dostali dary,<br>" +
                    "ktoré prinášame na česť tvojho mena; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "premeň ich na sviatosť našej spásy,<br>" +
                    "aby nám boli posilou pre večný život.<br>" +
                    "Skrze Krista, nášho Pána.", "Bože a Otče náš, prosíme ťa,<br>" +
                    "nech v nás blahodarne pôsobí prijatá sviatosť, <font color='#B71C1C'>*</font><br>" +
                    "aby nám očistila srdcia od previnení <font color='#B71C1C'>—</font><br>" +
                    "a chránila nás pred každým nebezpečenstvom.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"54", "Všemohúci Bože,<br>" +
                    "vypočuj naše prosby a ochraňuj nás,<br>" +
                    "veď všetku nádej skladáme<br>" +
                    "iba do tvojho milosrdenstva; <font color='#B71C1C'>*</font><br>" +
                    "očisti nás od poškvrny hriechu<br>" +
                    "a pomáhaj nám vytrvať v čnostnom živote, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dosiahli večné dedičstvo,<br>" +
                    "ktoré si nám prisľúbil.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Otče, <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na obetu, ktorú slávime, <font color='#B71C1C'>—</font><br>" +
                    "aby nám slúžila na obrátenie<br>" +
                    "a celému svetu na spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Otče,<br>" +
                    "pri eucharistickom stole<br>" +
                    "posilnil si nás pokrmom spásy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby nám sviatosť,<br>" +
                    "ktorou nás živíš na pozemskej púti,<br>" +
                    "zaistila účasť na večnom živote v nebeskej vlasti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"55", "Láskavý Bože, odpusť nám naše viny <font color='#B71C1C'>*</font><br>" +
                    "a pre svoju dobrotu<br>" +
                    "vysloboď nás z osídel hriechu, <font color='#B71C1C'>—</font><br>" +
                    "do ktorých sme upadli pre svoju krehkosť.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme vždy s úprimným srdcom<br>" +
                    "slúžili pri tvojom oltári <font color='#B71C1C'>—</font><br>" +
                    "a vytrvalou účasťou na obete tvojho Syna<br>" +
                    "dosiahli večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nám sviatosť, ktorú sme prijali,<br>" +
                    "poskytovala ustavičnú ochranu <font color='#B71C1C'>—</font><br>" +
                    "a odvrátila od nás všetko škodlivé.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"56", "Milosrdný Bože,<br>" +
                    "ty privádzaš ľudí k spáse v každom čase,<br>" +
                    "ale v týchto dňoch nás zahŕňaš<br>" +
                    "mimoriadnymi milosťami; <font color='#B71C1C'>*</font><br>" +
                    "prosíme, zhliadni na svoj vyvolený ľud:<br>" +
                    "s otcovskou láskou<br>" +
                    "ochraňuj všetkých pokrstených <font color='#B71C1C'>—</font><br>" +
                    "a posilňuj tých,<br>" +
                    "čo sa pripravujú na sviatosť krstu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "Všemohúci a večný Bože,<br>" +
                    "ty dávaš večný život všetkým,<br>" +
                    "čo vyznávajú vieru v teba<br>" +
                    "a prijímajú sviatosť krstu; <font color='#B71C1C'>*</font><br>" +
                    "s dôverou ťa prosíme,<br>" +
                    "prijmi naše modlitby a obetné dary, <font color='#B71C1C'>—</font><br>" +
                    "splň naše túžby a očisti nás od každého hriechu.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "pri obetnej hostine nás živíš<br>" +
                    "telom a krvou svojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj nám touto sviatosťou spásy<br>" +
                    "stále plnšiu účasť na svojom božskom živote.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"60", "Všemohúci a večný Bože,<br>" +
                    "ty si dal ľudstvu vzor poníženosti<br>" +
                    "v Ježišovi Kristovi, našom Spasiteľovi,<br>" +
                    "keď sa z tvojej vôle stal človekom<br>" +
                    "a zomrel na kríži; <font color='#B71C1C'>*</font><br>" +
                    "láskavo nám pomáhaj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme nasledovali jeho príklad v utrpení,<br>" +
                    "a tak mali účasť na jeho zmŕtvychvstaní.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milostivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "pre umučenie tvojho Syna<br>" +
                    "preukáž nám svoje zľutovanie,<br>" +
                    "ktoré si nezasluhujeme svojimi skutkami, <font color='#B71C1C'>—</font><br>" +
                    "ale očakávame ho od tvojho milosrdenstva<br>" +
                    "ako ovocie tejto vznešenej obety.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "posilnil si nás presvätým chlebom z neba<br>" +
                    "a upevnil si nás vo viere a nádeji,<br>" +
                    "že pre smrť tvojho Syna získame večný život; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme skrze jeho zmŕtvychvstanie<br>" +
                    "dosiahli cieľ nášho putovania.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"61", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "pretože sme slabí a často klesáme,<br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "nech nás posilňuje umučenie<br>" +
                    "tvojho milovaného Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milostivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "zhliadni na obetu, ktorú slávime, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nám smrť tvojho Syna na kríži,<br>" +
                    "ktorou si zrušil rozsudok nad nami,<br>" +
                    "zaistila večný život.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "zostaň s nami a ochraňuj naše srdcia,<br>" +
                    "posvätené touto obetou, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si s tvojou pomocou<br>" +
                    "zachovali účinky sviatosti,<br>" +
                    "ktorú sme prijali ako tvoj vzácny dar.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"62", "Všemohúci a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám nábožne sláviť tajomstvo<br>" +
                    "Pánovho utrpenia a smrti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dosiahli odpustenie hriechov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, láskavý Bože,<br>" +
                    "zhliadni na obetu svojho ľudu, <font color='#B71C1C'>*</font><br>" +
                    "a keďže nám už teraz dávaš účasť<br>" +
                    "na svätých daroch, <font color='#B71C1C'>—</font><br>" +
                    "dopraj, aby sme ich dosiahli<br>" +
                    "v plnej miere vo večnosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Otče,<br>" +
                    "pri eucharistickom stole<br>" +
                    "posilnil si nás pokrmom spásy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby nám sviatosť,<br>" +
                    "ktorou nás živíš na pozemskej púti,<br>" +
                    "zaistila účasť na večnom živote v nebeskej vlasti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"63", "Svätý Bože, ty si poslal svojho Syna,<br>" +
                    "aby za nás zomrel na kríži<br>" +
                    "a vyslobodil nás z moci odvekého nepriateľa; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj nám účasť aj na jeho slávnom vzkriesení.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, Otče, prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                    "a daj, aby nám pamiatka umučenia tvojho Syna,<br>" +
                    "ktorú nábožne slávime, <font color='#B71C1C'>—</font><br>" +
                    "pomáhala odhodlane niesť každodenný kríž.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, touto posvätnou obetou sme slávili<br>" +
                    "tajomstvo nášho vykúpenia; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "posilňuj nás vo viere,<br>" +
                    "že pre zásluhy smrti tvojho Syna<br>" +
                    "dal si nám večný život.<br>" +
                    "Skrze Krista, nášho Pána."},
    };

    String[][] velkanocModlitby = {
            {"10", "Všemohúci a večný Bože,<br>" +
                    "ty si nám dnešného dňa<br>" +
                    "Kristovým víťazstvom nad smrťou<br>" +
                    "otvoril bránu do večnosti; <font color='#B71C1C'>*</font><br>" +
                    "preto s radosťou slávime jeho zmŕtvychvstanie<br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "obnov nás Duchom Svätým,<br>" +
                    "aby sme povstali k novému životu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milostivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "s veľkonočnou radosťou<br>" +
                    "prinášame ti dary na obetu, <font color='#B71C1C'>—</font><br>" +
                    "ktorou sa tvoja Cirkev<br>" +
                    "podivuhodne obrodzuje a zveľaďuje.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "ochraňuj svoju Cirkev s otcovskou priazňou, <font color='#B71C1C'>—</font><br>" +
                    "aby obnovená veľkonočnými sviatosťami<br>" +
                    "dosiahla slávu zmŕtvychvstania.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"11", "Všemohúci Bože,<br>" +
                    "ty zveľaďuješ svoju Cirkev<br>" +
                    "stále novým potomstvom; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj všetkým kresťanom, <font color='#B71C1C'>—</font><br>" +
                    "aby dôsledne plnili záväzky krstu,<br>" +
                    "ktorý s vierou prijali.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary nášho spoločenstva <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme vyznávaním pravej viery<br>" +
                    "a vernosťou krstným záväzkom<br>" +
                    "dosiahli večnú blaženosť.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, Bože,<br>" +
                    "nech naše duše prekypujú<br>" +
                    "milosťou veľkonočných sviatostí, <font color='#B71C1C'>*</font><br>" +
                    "a keďže si nás priviedol na cestu večnej spásy, <font color='#B71C1C'>—</font><br>" +
                    "urob nás hodnými tvojich darov.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"12", "Všemohúci Bože,<br>" +
                    "ty si nás veľkonočnými tajomstvami<br>" +
                    "oslobodil a vnútorne obnovil; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, sprevádzaj nás svojou milosťou<br>" +
                    "a veď nás k dokonalej slobode, <font color='#B71C1C'>—</font><br>" +
                    "aby naša radosť z Kristovho zmŕtvychvstania<br>" +
                    "vyvrcholila v nebeskej blaženosti.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše obetné dary a pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si uchovali veľkonočné milosti<br>" +
                    "a dosiahli večnú radosť, ktorú si nám pripravil.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "ty si nám udelil vzácnu milosť krstu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, ustavične stvárňuj naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si zaslúžili večnú blaženosť.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"13", "Milosrdný Bože, z tvojej láskavosti<br>" +
                    "každoročne prežívame radosť<br>" +
                    "zo slávnosti Kristovho zmŕtvychvstania; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nás slávenie pominuteľných sviatkov<br>" +
                    "priviedlo do večnej radosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi dary na slávenie obety<br>" +
                    "nášho vykúpenia <font color='#B71C1C'>—</font><br>" +
                    "a daruj nám zdravie duše i tela.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, nekonečný Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás dôstojné prijatie sviatosti tvojho Syna<br>" +
                    "očistí od všetkých chýb minulosti <font color='#B71C1C'>—</font><br>" +
                    "a pretvorí na nových ľudí.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"14", "Bože a Otče náš,<br>" +
                    "ty si zjednotil rozmanité národy<br>" +
                    "vo vyznávaní tvojho mena; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby všetkých,<br>" +
                    "čo sa znovuzrodili v krstnom prameni,<br>" +
                    "spájala živá viera a činorodá láska.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše obetné dary,<br>" +
                    "ktoré ti prinášame na znak vďaky<br>" +
                    "za novopokrstených, <font color='#B71C1C'>—</font><br>" +
                    "a sprevádzaj nás všetkých otcovskou priazňou.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, vypočuj naše prosby, <font color='#B71C1C'>*</font><br>" +
                    "aby nás účasť na svätých tajomstvách<br>" +
                    "nášho vykúpenia<br>" +
                    "posilňovala v tomto živote <font color='#B71C1C'>—</font><br>" +
                    "a priviedla do večnej radosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"15", "Všemohúci a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "umučením a zmŕtvychvstaním tvojho Syna<br>" +
                    "uzavrel si s ľudstvom zmluvu zmierenia; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme svojím životom dosvedčovali vieru,<br>" +
                    "ktorú vyznávame slávením veľkonočných sviatkov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "premeň tieto obetné dary na sviatosť života<br>" +
                    "a pretvor aj naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa odpútali od pozemských náklonností<br>" +
                    "a zahoreli túžbou po veciach nebeských.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "ochraňuj ustavičnou láskou svoj ľud,<br>" +
                    "ktorý si vykúpil smrťou tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme sa bez prestania tešili<br>" +
                    "z jeho slávneho zmŕtvychvstania.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"16", "Dobrotivý Otče,<br>" +
                    "svojou hojnou milosťou<br>" +
                    "rozmnožuješ počet veriacich v teba; <font color='#B71C1C'>*</font><br>" +
                    "láskavo ochraňuj svojich vyvolených,<br>" +
                    "ktorých si znovuzrodil vo sviatosti krstu, <font color='#B71C1C'>—</font><br>" +
                    "a zaodej ich raz rúchom blaženej nesmrteľnosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "nech nás ustavične sprevádza radosť<br>" +
                    "z týchto veľkonočných tajomstiev,<br>" +
                    "ktorými sa neprestajne uskutočňuje naša spása, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sa nám stali prameňom<br>" +
                    "večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na svoj ľud,<br>" +
                    "ktorý si duchovne obnovil<br>" +
                    "veľkonočnými sviatosťami, <font color='#B71C1C'>—</font><br>" +
                    "a priveď nás k slávnemu vzkrieseniu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"20", "Nekonečne milosrdný Bože,<br>" +
                    "každoročnou slávnosťou Veľkej noci<br>" +
                    "oživuješ vieru svojho ľudu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, zveľaďuj v nás svoju milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy hlbšie chápali<br>" +
                    "nesmiernu hodnotu krstu,<br>" +
                    "ktorým sme boli očistení,<br>" +
                    "nevýslovnú lásku Ducha,<br>" +
                    "ktorým sme boli znovuzrodení,<br>" +
                    "a nekonečnú cenu krvi,<br>" +
                    "ktorou sme boli vykúpení.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi obetné dary od svojho ľudu <font color='#B71C1C'>—</font><br>" +
                    "<font color='#B71C1C'>(</font>i od všetkých, ktorí sa krstom zrodili<br>" +
                    "k novému životu<font color='#B71C1C'>)</font>,<br>" +
                    "a daj, aby sme vyznávaním pravej viery<br>" +
                    "a vernosťou krstným záväzkom<br>" +
                    "dosiahli večnú blaženosť.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby veľkonočná sviatosť, ktorú sme prijali, <font color='#B71C1C'>—</font><br>" +
                    "neprestajne pôsobila v našich dušiach<br>" +
                    "a prejavovala sa v našich skutkoch.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"21", "Všemohúci a večný Bože,<br>" +
                    "smieme ťa volať Otcom,<br>" +
                    "lebo si nás prijal za svoje deti; <font color='#B71C1C'>*</font><br>" +
                    "dopraj nám stále rásť v synovskej láske, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli dosiahnuť prisľúbené dedičstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi dary plesajúcej Cirkvi,<br>" +
                    "ktorej si pripravil svätú veľkonočnú radosť, <font color='#B71C1C'>—</font><br>" +
                    "a priveď ju do večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na svoj ľud,<br>" +
                    "ktorý si duchovne obnovil<br>" +
                    "veľkonočnými sviatosťami, <font color='#B71C1C'>—</font><br>" +
                    "a priveď nás k slávnemu vzkrieseniu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"22", "Všemohúci Bože,<br>" +
                    "vo veľkonočnom tajomstve dal si nám záruku<br>" +
                    "nášho vzkriesenia; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám ohlasovať víťazstvo<br>" +
                    "zmŕtvychvstalého Pána <font color='#B71C1C'>—</font><br>" +
                    "a dosiahnuť večný život v jeho spoločenstve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "nech nás ustavične sprevádza radosť<br>" +
                    "z týchto veľkonočných tajomstiev,<br>" +
                    "ktorými sa neprestajne uskutočňuje naša spása, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sa nim stali prameňom večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, vypočuj naše prosby, <font color='#B71C1C'>*</font><br>" +
                    "aby nás účasť na svätých tajomstvách<br>" +
                    "nášho vykúpenia<br>" +
                    "posilňovala v tomto živote <font color='#B71C1C'>—</font><br>" +
                    "a priviedla do večnej radosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"23", "Dobrotivý Bože,<br>" +
                    "tajomstvom umučenia a zmŕtvychvstania tvojho Syna<br>" +
                    "obnovil si pôvodnú dôstojnosť človeka<br>" +
                    "a dal si nám nádej na slávne vzkriesenie; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme činorodou láskou dosvedčovali tajomstvo,<br>" +
                    "ktoré každoročne s vierou slávime.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Vznešený Bože,<br>" +
                    "z tvojej dobrotivosti slávime svätú obetu,<br>" +
                    "ktorou nám dávaš účasť na svojom živote, <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám dôsledne žiť podľa pravdy,<br>" +
                    "ktorú si nám zjavil.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, Bože, <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo ochraňuj svoj ľud,<br>" +
                    "ktorý si nasýtil sviatostným pokrmom, <font color='#B71C1C'>—</font><br>" +
                    "a pomáhaj mu,<br>" +
                    "aby prešiel z temnoty hriechu do nového života.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"24", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sa v skutkoch nášho každodenného života<br>" +
                    "prejavovala milosť, <font color='#B71C1C'>—</font><br>" +
                    "ktorú si nám udelil<br>" +
                    "pri slávení veľkonočných sviatkov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nebeský Otče, prijmi naše modlitby,<br>" +
                    "ktorými sprevádzame tieto obetné dary, <font color='#B71C1C'>*</font><br>" +
                    "a láskavo očisti naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli dôstojne sláviť sviatosť tvojej lásky.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci a večný Bože,<br>" +
                    "zmŕtvychvstaním tvojho Syna<br>" +
                    "znovu si nám otvoril cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                    "zveľaďuj v nás účinky veľkonočného tajomstva <font color='#B71C1C'>—</font><br>" +
                    "a naplň nás silou sviatostného pokrmu,<br>" +
                    "ktorý sme prijali.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"25", "Svätý Bože,<br>" +
                    "ty si poslal svojho Syna,<br>" +
                    "aby za nás zomrel na kríži<br>" +
                    "a vyslobodil nás z moci odvekého nepriateľa; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj nám aj účasť na jeho slávnom vzkriesení.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše obetné dary a pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si uchovali veľkonočné milosti<br>" +
                    "a dosiahli večnú radosť, ktorú si nám pripravil.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "ustavičnou láskou ochraňuj svoj ľud,<br>" +
                    "ktorý si vykúpil smrťou svojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme sa bez prestania tešili<br>" +
                    "z jeho slávneho zmŕtvychvstania.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"26", "Láskavý Otče,<br>" +
                    "ty si nás skrze svojho Syna vykúpil<br>" +
                    "a prijal za svoje milované deti; <font color='#B71C1C'>*</font><br>" +
                    "sprevádzaj s otcovskou láskou všetkých,<br>" +
                    "čo veria v Krista, <font color='#B71C1C'>—</font><br>" +
                    "aby dosiahli pravú slobodu<br>" +
                    "a večný život.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo posväť tieto obetné dary,<br>" +
                    "ktoré predstavujú našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                    "a urob aj z nás večný dar pre teba.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "posilnení sviatostným pokrmom pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                    "aby Eucharistia,<br>" +
                    "ktorú nám tvoj Syn prikázal sláviť<br>" +
                    "na svoju pamiatku, <font color='#B71C1C'>—</font><br>" +
                    "rozmnožila v nás lásku k tebe a k blížnemu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"30", "Všemohúci a večný Bože,<br>" +
                    "nech sa tvoj ľud, duchovne obnovený,<br>" +
                    "stále raduje <font color='#B71C1C'>*</font><br>" +
                    "a nech s pevnou nádejou očakáva<br>" +
                    "túžený deň svojho vzkriesenia, <font color='#B71C1C'>—</font><br>" +
                    "ako sa teraz teší z prijatia do Božej rodiny.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi dary plesajúcej Cirkvi,<br>" +
                    "ktorej si pripravil svätú veľkonočnú radosť, <font color='#B71C1C'>—</font><br>" +
                    "a priveď ju do večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na svoj ľud,<br>" +
                    "ktorý si duchovne obnovil<br>" +
                    "veľkonočnými sviatosťami, <font color='#B71C1C'>—</font><br>" +
                    "a priveď nás k slávnemu vzkrieseniu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"31", "Milosrdný Bože,<br>" +
                    "ty ukazuješ blúdiacim svetlo svojej pravdy,<br>" +
                    "aby sa vrátili na správnu cestu; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj všetkým kresťanom<br>" +
                    "odmietať, čo sa protiví ich viere, <font color='#B71C1C'>—</font><br>" +
                    "a usilovať sa o to,<br>" +
                    "čo zodpovedá ich kresťanskému povolaniu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nebeský Otče, prijmi naše modlitby,<br>" +
                    "ktorými sprevádzame tieto obetné dary, <font color='#B71C1C'>*</font><br>" +
                    "a láskavo očisti naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli dôstojne sláviť sviatosť tvojej lásky.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci a večný Bože,<br>" +
                    "zmŕtvychvstaním tvojho Syna<br>" +
                    "znovu si nám otvoril cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                    "zveľaďuj v nás účinky veľkonočného tajomstva <font color='#B71C1C'>—</font><br>" +
                    "a naplň nás silou sviatostného pokrmu,<br>" +
                    "ktorý sme prijali.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"32", "Pane a Bože náš,<br>" +
                    "ty otváraš bránu nebeského kráľovstva<br>" +
                    "všetkým, čo sa znovuzrodili<br>" +
                    "z vody a z Ducha Svätého; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, rozmnož v nás krstnú milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme odolávali hriechu<br>" +
                    "a dosiahli nebeskú blaženosť,<br>" +
                    "ktorú si nám prisľúbil.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi dary plesajúcej Cirkvi,<br>" +
                    "ktorej si pripravil svätú veľkonočnú radosť, <font color='#B71C1C'>—</font><br>" +
                    "a priveď ju do večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na svoj ľud,<br>" +
                    "ktorý si duchovne obnovil<br>" +
                    "veľkonočnými sviatosťami, <font color='#B71C1C'>—</font><br>" +
                    "a priveď nás k slávnemu vzkrieseniu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"33", "Milosrdný Otče,<br>" +
                    "vypočuj prosby svojho ľudu: <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám žiť podľa viery, ktorú si nám dal, <font color='#B71C1C'>—</font><br>" +
                    "a dopraj nám vo večnosti účasť<br>" +
                    "na sláve tvojho zmŕtvychvstalého Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš,<br>" +
                    "nech nás ustavične sprevádza radosť<br>" +
                    "z týchto veľkonočných tajomstiev, <font color='#B71C1C'>*</font><br>" +
                    "ktorými sa neprestajne uskutočňuje naša spása, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sa nám stali prameňom večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, vypočuj naše prosby, <font color='#B71C1C'>*</font><br>" +
                    "aby nás účasť<br>" +
                    "na svätých tajomstvách nášho vykúpenia<br>" +
                    "posilňovala v tomto živote <font color='#B71C1C'>—</font><br>" +
                    "a priviedla do večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"34", "Všemohúci a večný Bože,<br>" +
                    "v tomto veľkonočnom období<br>" +
                    "vrúcnejšie prežívame a lepšie poznávame<br>" +
                    "tvoju otcovskú dobrotu,<br>" +
                    "lebo si nás vyslobodil z temnoty bludov; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa vždy verne pridržiavali tvojej pravdy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Vznešený Bože,<br>" +
                    "z tvojej dobrotivosti slávime svätú obetu,<br>" +
                    "ktorou nám dávaš účasť na svojom živote, <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám dôsledne žiť podľa pravdy,<br>" +
                    "ktorú si nám zjavil.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, Bože, <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo ochraňuj svoj ľud,<br>" +
                    "ktorý si nasýtil sviatostným pokrmom, <font color='#B71C1C'>—</font><br>" +
                    "a pomáhaj mu,<br>" +
                    "aby prešiel z temnoty hriechu do nového života.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"35", "Všemohúci Bože, veríme a vyznávame,<br>" +
                    "že náš Pán, Ježiš Kristus,<br>" +
                    "pre nás zomrel a vstal z mŕtvych; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby nás láska Ducha Svätého<br>" +
                    "viedla k dokonalejšiemu životu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo posväť tieto obetné dary,<br>" +
                    "ktoré predstavujú našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                    "a urob aj z nás večný dar pre teba.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "posilnení sviatostným pokrmom pokorne prosíme,<font color='#B71C1C'>*</font><br>" +
                    "aby Eucharistia,<br>" +
                    "ktorú nám tvoj Syn prikázal sláviť<br>" +
                    "na svoju pamiatku, <font color='#B71C1C'>—</font><br>" +
                    "rozmnožila v nás lásku k tebe a k blížnemu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"36", "Všemohúci Bože,<br>" +
                    "vo sviatosti krstu dávaš nový život tým,<br>" +
                    "čo veria v teba; <font color='#B71C1C'>*</font><br>" +
                    "ochraňuj všetkých znovuzrodených v Kristovi, <font color='#B71C1C'>—</font><br>" +
                    "aby odolávali útokom bludu<br>" +
                    "a zachovali si dar tvojej milosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše obetné dary<br>" +
                    "a pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si uchovali veľkonočné milosti<br>" +
                    "a dosiahli večnú radosť, ktorú si nám pripravil.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "ustavičnou láskou ochraňuj svoj ľud,<br>" +
                    "ktorý si vykúpil smrťou svojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme sa bez prestania tešili<br>" +
                    "z jeho slávneho zmŕtvychvstania.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"40", "Všemohúci a večný Bože,<br>" +
                    "veď nás stále po ceste spásy, <font color='#B71C1C'>*</font><br>" +
                    "aby sme aj my, tvoje pokorné ovečky,<br>" +
                    "došli do nebeskej vlasti, <font color='#B71C1C'>—</font><br>" +
                    "kam nás predišiel náš vznešený Pastier Ježiš Kristus,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, Bože, <font color='#B71C1C'>*</font><br>" +
                    "dopraj nám trvalú radosť<br>" +
                    "z veľkonočných tajomstiev, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby v nás stále účinkovala milosť vykúpenia<br>" +
                    "a priviedla nás do večnej radosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "láskavo sa ujmi rodiny svojich verných <font color='#B71C1C'>*</font><br>" +
                    "a priveď na nivy večného blaha ovečky,<br>" +
                    "vykúpené drahocennou krvou<br>" +
                    "tvojho Syna Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                    "ktorý žije a kraľuje na veky vekov."},
            {"41", "Všemohúci Bože,<br>" +
                    "ty si pozdvihol padnuté ľudstvo<br>" +
                    "uponížením sa tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "daruj svätú radosť svojim verným,<br>" +
                    "ktorých si vymanil z otroctva hriechu, <font color='#B71C1C'>—</font><br>" +
                    "a priveď ich do večnej blaženosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi dary plesajúcej Cirkvi,<br>" +
                    "ktorej si pripravil svätú veľkonočnú radosť, <font color='#B71C1C'>—</font><br>" +
                    "a priveď ju do večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na svoj ľud,<br>" +
                    "ktorý si duchovne obnovil<br>" +
                    "veľkonočnými sviatosťami, <font color='#B71C1C'>—</font><br>" +
                    "a priveď nás k slávnemu vzkrieseniu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"42", "Všemohúci Bože,<br>" +
                    "v tomto veľkonočnom čase s vďačným srdcom<br>" +
                    "oslavujeme tajomstvo Pánovho zmŕtvychvstania; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme plne prežívali radosť z našej spásy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "nech nás ustavične sprevádza radosť<br>" +
                    "z týchto veľkonočných tajomstiev,<br>" +
                    "ktorými sa neprestajne uskutočňuje naša spása, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sa nám stali prameňom večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, vypočuj naše prosby, <font color='#B71C1C'>*</font><br>" +
                    "aby nás účasť na svätých tajomstvách<br>" +
                    "nášho vykúpenia<br>" +
                    "posilňovala v tomto živote <font color='#B71C1C'>—</font><br>" +
                    "a priviedla do večnej radosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"43", "Nekonečný Bože, ty si život veriacich,<br>" +
                    "sláva ponížených a blaženosť spravodlivých; <font color='#B71C1C'>*</font><br>" +
                    "vypočuj naše pokorné prosby<br>" +
                    "a vyplň našu vrúcnu túžbu po tvojich daroch, <font color='#B71C1C'>—</font><br>" +
                    "ktoré si nám vo svojej štedrosti prisľúbil.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Vznešený Bože,<br>" +
                    "z tvojej dobrotivosti slávime svätú obetu,<br>" +
                    "ktorou nám dávaš účasť na svojom živote, <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám dôsledne žiť podľa pravdy,<br>" +
                    "ktorú si nám zjavil.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, Bože, <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo ochraňuj svoj ľud,<br>" +
                    "ktorý si nasýtil sviatostným pokrmom, <font color='#B71C1C'>—</font><br>" +
                    "a pomáhaj mu,<br>" +
                    "aby prešiel z temnoty hriechu do nového života.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"44", "Bože a Otče náš,<br>" +
                    "vykúpením dávaš človekovi vyššiu dôstojnosť,<br>" +
                    "ako mal pri stvorení; <font color='#B71C1C'>*</font><br>" +
                    "pre toto nevýslovné tajomstvo tvojej lásky<br>" +
                    "prosíme ťa za všetkých,<br>" +
                    "ktorých si znovuzrodil sviatosťou krstu: <font color='#B71C1C'>—</font><br>" +
                    "zachovaj ich vo svojej milosti<br>" +
                    "a sprevádzaj ich svojím požehnaním.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nebeský Otče, prijmi naše modlitby,<br>" +
                    "ktorými sprevádzame tieto obetné dary, <font color='#B71C1C'>*</font><br>" +
                    "a láskavo očisti naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli dôstojne sláviť<br>" +
                    "sviatosť tvojej lásky.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci a večný Bože,<br>" +
                    "zmŕtvychvstaním tvojho Syna<br>" +
                    "znovu si nám otvoril cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                    "zveľaďuj v nás účinky veľkonočného tajomstva <font color='#B71C1C'>—</font><br>" +
                    "a naplň nás silou sviatostného pokrmu,<br>" +
                    "ktorý sme prijali.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"45", "Dobrotivý Bože,<br>" +
                    "pôvodca našej slobody a spásy,<br>" +
                    "ty si nás vykúpil predrahou krvou svojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "buď zdrojom nášho života,<br>" +
                    "aby sme v tebe vždy nachádzali trvalú radosť a istotu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše obetné dary a pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si uchovali veľkonočné milosti,<br>" +
                    "a dosiahli večnú radosť, ktorú si nám pripravil.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "ustavičnou láskou ochraňuj svoj ľud,<br>" +
                    "ktorý si vykúpil smrťou svojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme sa bez prestania tešili<br>" +
                    "z jeho slávneho zmŕtvychvstania.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"46", "Všemohúci a večný Bože,<br>" +
                    "vo svätom krste si nám dal nový život; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, neprestajne v nás uskutočňuj<br>" +
                    "veľkonočné tajomstvo, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pod tvojou ochranou prinášali hojné ovocie<br>" +
                    "dobrých skutkov<br>" +
                    "a dosiahli radosť večného života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo posväť tieto obetné dary,<br>" +
                    "ktoré predstavujú našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                    "a urob aj z nás večný dar pre teba.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "posilnení sviatostným pokrmom pokorne prosíme,<font color='#B71C1C'>*</font><br>" +
                    "aby Eucharistia,<br>" +
                    "ktorú nám tvoj Syn prikázal sláviť<br>" +
                    "na svoju pamiatku, <font color='#B71C1C'>—</font><br>" +
                    "rozmnožila v nás lásku k tebe a k blížnemu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"50", "Láskavý Otče,<br>" +
                    "ty si nás skrze svojho Syna vykúpil<br>" +
                    "a prijal za svoje milované deti;<font color='#B71C1C'>*</font><br>" +
                    "s otcovskou láskou sprevádzaj všetkých,<br>" +
                    "čo veria v Krista, <font color='#B71C1C'>—</font><br>" +
                    "aby dosiahli pravú slobodu a večný život.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Vznešený Bože,<br>" +
                    "z tvojej dobrotivosti slávime svätú obetu,<br>" +
                    "ktorou nám dávaš účasť na svojom živote, <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám dôsledne žiť podľa pravdy,<br>" +
                    "ktorú si nám zjavil.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa Bože, <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo ochraňuj svoj ľud,<br>" +
                    "ktorý si nasýtil sviatostným pokrmom, <font color='#B71C1C'>—</font><br>" +
                    "a pomáhaj mu,<br>" +
                    "aby prešiel z temnoty hriechu do nového života.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"51", "Nebeský Otče,<br>" +
                    "ty zjednocuješ mysle veriacich<br>" +
                    "v spoločnom úsilí o dobro; <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám milovať, čo prikazuješ,<br>" +
                    "a túžiť po tom, čo sľubuješ, <font color='#B71C1C'>—</font><br>" +
                    "aby uprostred pominuteľných vecí tohto sveta<br>" +
                    "naše srdcia boli upriamené na nebo,<br>" +
                    "kde nájdeme opravdivú radosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým<br>" +
                    "po všetky veky vekov.", "Nebeský Otče, prijmi naše modlitby,<br>" +
                    "ktorými sprevádzame tieto obetné dary, <font color='#B71C1C'>*</font><br>" +
                    "a láskavo očisti naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli dôstojne sláviť sviatosť tvojej lásky.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci a večný Bože,<br>" +
                    "zmŕtvychvstaním tvojho Syna<br>" +
                    "znovu si nám otvoril cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                    "zveľaďuj v nás účinky veľkonočného tajomstva <font color='#B71C1C'>—</font><br>" +
                    "a naplň nás silou sviatostného pokrmu,<br>" +
                    "ktorý sme prijali.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"52", "Všemohúci Bože,<br>" +
                    "Kristovým zmŕtvychvstaním<br>" +
                    "urobil si nás novým stvorením pre život večný; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj nám pevnú vieru a nádej, <font color='#B71C1C'>—</font><br>" +
                    "aby sme nikdy nepochybovali,<br>" +
                    "že sa splnia tvoje prisľúbenia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi dary plesajúcej Cirkvi,<br>" +
                    "ktorej si pripravil svätú veľkonočnú radosť, <font color='#B71C1C'>—</font><br>" +
                    "a priveď ju do večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na svoj ľud,<br>" +
                    "ktorý si duchovne obnovil<br>" +
                    "veľkonočnými sviatosťami, <font color='#B71C1C'>—</font><br>" +
                    "a priveď nás k slávnemu vzkrieseniu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"53", "Milosrdný Bože,<br>" +
                    "ty miluješ nevinnosť<br>" +
                    "a navraciaš ju kajúcim hriešnikom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pripútaj k sebe naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa nikdy<br>" +
                    "neodvrátili od svetla tvojej pravdy,<br>" +
                    "ku ktorej si nás priviedol z temnôt nevery.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "nech nás ustavične sprevádza radosť<br>" +
                    "z týchto veľkonočných tajomstiev,<br>" +
                    "ktorými sa neprestajne uskutočňuje naša spása, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sa nám stali<br>" +
                    "prameňom večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, vypočuj naše prosby, <font color='#B71C1C'>*</font><br>" +
                    "aby nás účasť<br>" +
                    "na svätých tajomstvách nášho vykúpenia<br>" +
                    "posilňovala v tomto živote <font color='#B71C1C'>—</font><br>" +
                    "a priviedla do večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"54", "Svätý Bože,<br>" +
                    "tvoja láska nás prenáša z hriechu do milosti<br>" +
                    "a z biedy do blaženosti; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, upevni v nás dielo tvojej lásky, <font color='#B71C1C'>—</font><br>" +
                    "aby sme všetci, ktorých si ospravedlnil vierou,<br>" +
                    "vytrvali v dobrom až do konca.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Vznešený Bože,<br>" +
                    "z tvojej dobrotivosti slávime svätú obetu,<br>" +
                    "ktorou nám dávaš účasť na svojom živote, <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám dôsledne žiť podľa pravdy,<br>" +
                    "ktorú si nám zjavil.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, Bože, <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo ochraňuj svoj ľud,<br>" +
                    "ktorý si nasýtil sviatostným pokrmom, <font color='#B71C1C'>—</font><br>" +
                    "a pomáhaj mu,<br>" +
                    "aby prešiel z temnoty hriechu do nového života.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"55", "Prosíme ťa, dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám dôsledne stvárňovať náš život<br>" +
                    "podľa veľkonočného tajomstva,<br>" +
                    "ktoré s radosťou slávime, <font color='#B71C1C'>—</font><br>" +
                    "aby nás sila Kristovho zmŕtvychvstania<br>" +
                    "ochraňovala a viedla k spáse.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo posväť tieto obetné dary,<br>" +
                    "ktoré predstavujú našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                    "a urob aj z nás večný dar pre teba.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "posilnení sviatostným pokrmom pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                    "aby Eucharistia,<br>" +
                    "ktorú nám tvoj Syn prikázal sláviť<br>" +
                    "na svoj u pamiatku, <font color='#B71C1C'>—</font><br>" +
                    "rozmnožila v nás lásku k tebe a k blížnemu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"56", "Všemohúci a večný Bože,<br>" +
                    "vo sviatosti krstu<br>" +
                    "si nám dal účasť na svojom živote<br>" +
                    "a uschopnil si nás pre blaženú nesmrteľnosť; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s tvojou pomocou dosiahli<br>" +
                    "plnosť života v tvojej sláve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše obetné dary a pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si uchovali veľkonočné milosti<br>" +
                    "a dosiahli večnú radosť, ktorú si nám pripravil.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "ustavičnou láskou ochraňuj svoj ľud,<br>" +
                    "ktorý si vykúpil smrťou svojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme sa bez prestania tešili<br>" +
                    "z jeho slávneho zmŕtvychvstania.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"60", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "dopraj nám prežívať s úprimnou horlivosťou<br>" +
                    "tieto radostné dni<br>" +
                    "na oslavu vzkrieseného Spasiteľa, <font color='#B71C1C'>—</font><br>" +
                    "aby sa jeho zmŕtvychvstanie, ktoré opätovne slávime,<br>" +
                    "ustavične prejavovalo v našich skutkoch.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nebeský Otče, prijmi naše modlitby,<br>" +
                    "ktorými sprevádzame tieto obetné dary, <font color='#B71C1C'>*</font><br>" +
                    "a láskavo očisti naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli dôstojne sláviť sviatosť tvojej lásky.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci a večný Bože,<br>" +
                    "zmŕtvychvstaním tvojho Syna<br>" +
                    "znovu si nám otvoril cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                    "naplň nás silou sviatostného pokrmu,<br>" +
                    "ktorý sme prijali, <font color='#B71C1C'>—</font><br>" +
                    "a zveľaďuj v nás účinky veľkonočného tajomstva.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"61", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sa v skutkoch nášho každodenného života<br>" +
                    "prejavovali milosti, <font color='#B71C1C'>—</font><br>" +
                    "ktoré si nám udelil<br>" +
                    "pri slávení veľkonočných sviatkov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče, <font color='#B71C1C'>*</font><br>" +
                    "prijmi dary plesajúcej Cirkvi,<br>" +
                    "ktorej si pripravil svätú veľkonočnú radosť, <font color='#B71C1C'>—</font><br>" +
                    "a priveď ju do večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na svoj ľud,<br>" +
                    "ktorý si duchovne obnovil<br>" +
                    "veľkonočnými sviatosťami, <font color='#B71C1C'>—</font><br>" +
                    "a priveď nás k slávnemu vzkrieseniu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"62", "Všemohúci a večný Bože,<br>" +
                    "tvoj ľud sa teší z prijatia do Božej rodiny; <font color='#B71C1C'>*</font><br>" +
                    "daj, nech sa, duchovne obnovený, stále raduje <font color='#B71C1C'>—</font><br>" +
                    "a s pevnou nádejou očakáva<br>" +
                    "deň svojho vzkriesenia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "nech nás ustavične sprevádza radosť<br>" +
                    "z týchto veľkonočných tajomstiev,<br>" +
                    "ktorými sa neprestajne uskutočňuje naša spása, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sa nám stali prameňom<br>" +
                    "večnej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, vypočuj naše prosby, <font color='#B71C1C'>*</font><br>" +
                    "aby nás účasť na svätých tajomstvách<br>" +
                    "nášho vykúpenia<br>" +
                    "posilňovala v tomto živote <font color='#B71C1C'>—</font><br>" +
                    "a priviedla do večnej radosti.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"63", "Bože a Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "dožič, aby sme raz so všetkými svätými<br>" +
                    "radostne privítali príchod tvojho Syna v sláve, <font color='#B71C1C'>—</font><br>" +
                    "ako teraz slávime<br>" +
                    "tajomstvo jeho zmŕtvychvstania.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Vznešený Bože,<br>" +
                    "z tvojej dobrotivosti slávime svätú obetu,<br>" +
                    "ktorou nám dávaš účasť na svojom živote, <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám dôsledne žiť podľa pravdy,<br>" +
                    "ktorú si nám zjavil.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, Bože, <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo ochraňuj svoj ľud,<br>" +
                    "ktorý si nasýtil sviatostným pokrmom, <font color='#B71C1C'>—</font><br>" +
                    "a pomáhaj mu,<br>" +
                    "aby prešiel z temnoty hriechu do nového života.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"64", "Dobrotivý Bože,<br>" +
                    "smrťou a zmŕtvychvstaním tvojho Syna<br>" +
                    "stali sme sa tvojím vyvoleným ľudom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme v každodennom živote prejavovali radosť<br>" +
                    "zo slávneho víťazstva nášho Pána Ježiša Krista,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Nebeský Otče, prijmi naše modlitby,<br>" +
                    "ktorými sprevádzame tieto obetné dary, <font color='#B71C1C'>*</font><br>" +
                    "a láskavo očisti naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli dôstojne sláviť sviatosť tvojej<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci a večný Bože,<br>" +
                    "zmŕtvychvstaním tvojho Syna<br>" +
                    "znovu si nám otvoril cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                    "zveľaďuj v nás účinky veľkonočného tajomstva <font color='#B71C1C'>—</font><br>" +
                    "a naplň nás silou sviatostného pokrmu,<br>" +
                    "ktorý sme prijali.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"65", "Večný Bože,<br>" +
                    "zmŕtvychvstaním tvojho Syna Ježiša Krista<br>" +
                    "otvoril si nám cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                    "povznes naše srdcia k Pôvodcovi našej spásy,<br>" +
                    "ktorý sedí po tvojej pravici, <font color='#B71C1C'>—</font><br>" +
                    "a keď príde vo svojej sláve,<br>" +
                    "zaodej rúchom blaženej nesmrteľnosti všetkých,<br>" +
                    "ktorých si znovuzrodil svätým krstom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo (keď sa slávnosť Nanebovstúpenia slávi v nedeľu):</font><br>" +
                    "Dobrotivý Otče, <font color='#B71C1C'>*</font><br>" +
                    "nech hlásaním evanjelia všetci ľudia dosiahnu spásu,<br>" +
                    "ktorú nám zaistil tvoj Syn<br>" +
                    "svojou smrťou a zmŕtvychvstaním; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme dosiahli plnú hodnosť tvojich detí,<br>" +
                    "ako to prisľúbil Ježiš Kristus - večná Pravda,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše obetné dary a pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si uchovali veľkonočné milosti<br>" +
                    "a dosiahli večnú radosť, ktorú si nám pripravil.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "ustavičnou láskou ochraňuj svoj ľud,<br>" +
                    "ktorý si vykúpil smrťou svojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme sa bez prestania tešili<br>" +
                    "z jeho slávneho zmŕtvychvstania.<br>" +
                    "Lebo on žije a kraľuje na veky vekov."},
            {"66", "Bože a Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "tvoj Syn pred svojím nanebovstúpením<br>" +
                    "prisľúbil apoštolom Ducha Svätého; <font color='#B71C1C'>—</font><br>" +
                    "prosíme ťa,<br>" +
                    "udeľ aj nám dary tvojho Ducha,<br>" +
                    "ako oni dostali rozmanité dary<br>" +
                    "nebeskej múdrosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.<br>" +
                    "<br>" +
                    "<font color='#B71C1C'>Alebo (keď sa slávnosť Nanebovstúpenia slávi v nedeľu):</font><br>" +
                    "Prosíme ťa, všemohúci Bože,<br>" +
                    "povzbudzuj našu vôľu<br>" +
                    "ku konaniu dobrých skutkov, <font color='#B71C1C'>*</font><br>" +
                    "aby sme sa vždy usilovali o to, čo je lepšie, <font color='#B71C1C'>—</font><br>" +
                    "a čoraz hlbšie prežívali veľkonočné tajomstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo posväť tieto obetné dary,<br>" +
                    "ktoré predstavujú našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                    "a urob aj z nás večný dar pre teba.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "posilnení sviatostným pokrmom pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                    "aby Eucharistia,<br>" +
                    "ktorú nám tvoj Syn prikázal sláviť<br>" +
                    "na svoju pamiatku, <font color='#B71C1C'>—</font><br>" +
                    "rozmnožila v nás lásku k tebe a k blížnemu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"70", "Všemohúci Bože,<br>" +
                    "pevne vyznávame, že Ježiš Kristus, Spasiteľ sveta,<br>" +
                    "prebýva s tebou v sláve; <font color='#B71C1C'>*</font><br>" +
                    "vypočuj naše prosby a daj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme pociťovali, že je s nami po všetky dni<br>" +
                    "až do skončenia sveta,<br>" +
                    "ako nám to prisľúbil.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše modlitby a dary <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás Eucharistia, ktorú nábožne slávime,<br>" +
                    "priviedla do nebeskej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Vyslyš nás, Bože, pôvodca našej spásy,<br>" +
                    "a upevni nás v nádeji, <font color='#B71C1C'>*</font><br>" +
                    "že pôsobením tejto sviatosti<br>" +
                    "osláviš celé telo Cirkvi, <font color='#B71C1C'>—</font><br>" +
                    "ako si oslávil jej Hlavu, Ježiša Krista,<br>" +
                    "ktorý žije a kraľuje na veky vekov."},
            {"71", "Prosíme ťa, Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "nech zostúpi na nás sila Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa vždy podriadili tvojej vôli<br>" +
                    "a plnili ju so synovskou oddanosťou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, svätý Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás táto nepoškvrnená obeta očistí od hriechu <font color='#B71C1C'>—</font><br>" +
                    "a vleje nám do sŕdc silu nebeskej milosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa Bože, <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo ochraňuj svoj ľud,<br>" +
                    "ktorý si nasýtil sviatostným pokrmom, <font color='#B71C1C'>—</font><br>" +
                    "a pomáhaj mu,<br>" +
                    "aby prešiel z temnoty hriechu<br>" +
                    "do nového života.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"72", "Všemohúci a milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, zošli nám Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                    "aby v nás prebýval svojou milosťou<br>" +
                    "a urobil nás chrámom svojej slávy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky vekov.", "Láskavý Bože, <font color='#B71C1C'>*</font><br>" +
                    "prijmi naše modlitby a dary <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás Eucharistia, ktorú nábožne slávime,<br>" +
                    "priviedla do nebeskej blaženosti.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče,<br>" +
                    "posilnení sviatostným pokrmom pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                    "aby Eucharistia,<br>" +
                    "ktorú nám tvoj Syn prikázal sláviť<br>" +
                    "na svoju pamiatku, <font color='#B71C1C'>—</font><br>" +
                    "rozmnožila v nás lásku k tebe a k blížnemu.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"73", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj svojej Cirkvi,<br>" +
                    "ktorú zhromaždil Duch Svätý, <font color='#B71C1C'>—</font><br>" +
                    "aby ti bola úplne oddaná<br>" +
                    "a v úprimnej láske zachovala svornosť a jednotu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, Bože, prijmi obetu,<br>" +
                    "ktorú ti prinášame podľa tvojho ustanovenia, <font color='#B71C1C'>*</font><br>" +
                    "a týmto svätým tajomstvom,<br>" +
                    "ktoré slávime ako prejav úprimnej vďačnosti, <font color='#B71C1C'>—</font><br>" +
                    "posväcuj svoj vykúpený ľud.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "Najsvätejšou sviatosťou, ktorú prijímame,<br>" +
                    "zveľaďuj v nás svoju milosť <font color='#B71C1C'>—</font><br>" +
                    "a jej očisťujúcou silou<br>" +
                    "pripravuj nás na ďalšie prijatie tohto veľkého daru.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"74", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech nás Duch Svätý naplní svojimi darmi, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy zmýšľali tak, ako sa páči tebe,<br>" +
                    "a konali, ako nám prikazuješ.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo posväť tieto obetné dary,<br>" +
                    "ktoré predstavujú našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                    "a urob aj z nás večný dar pre teba.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Bože,<br>" +
                    "nech nás osvieti tvoje slovo, ktoré sme počuli, <font color='#B71C1C'>*</font><br>" +
                    "a nech nás vnútorne obnoví sviatosť,<br>" +
                    "ktorú sme prijali, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si otvorili srdcia<br>" +
                    "pre dary Ducha Svätého.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"75", "Nekonečný Bože,<br>" +
                    "oslávením Ježiša Krista a zaslaním Ducha Svätého<br>" +
                    "otvoril si nám bránu večného života; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby nám prijatie tohto veľkého daru<br>" +
                    "pomáhalo rásť vo viere a oddane ti slúžiť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Bože,<br>" +
                    "zhliadni na obetné dary svojho ľudu <font color='#B71C1C'>*</font><br>" +
                    "a očisti naše srdcia príchodom Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                    "aby sa ti páčila naša obeta.<br>" +
                    "Skrze Krista, nášho Pána.", "Láskavý Bože,<br>" +
                    "sviatosť Eucharistie nás očisťuje od previnení<br>" +
                    "a je nám duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nás stále posilňovala<br>" +
                    "a priviedla do večného života.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"76", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech veľkonočné tajomstvo,<br>" +
                    "ktoré sme päťdesiat dní slávili, <font color='#B71C1C'>—</font><br>" +
                    "prenikne naše zmýšľanie<br>" +
                    "a prejavuje sa v našom každodennom živote.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Prosíme ťa, všemohúci Bože,<br>" +
                    "nech príde Duch Svätý <font color='#B71C1C'>*</font><br>" +
                    "a pripraví našu myseľ na eucharistickú obetu, <font color='#B71C1C'>—</font><br>" +
                    "lebo v ňom máme odpustenie všetkých hriechov.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "ty si viedol svoj ľud od starozákonných obradov<br>" +
                    "k novozákonným sviatostiam; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám odložiť starý spôsob života<br>" +
                    "a obnoviť si srdce láskou Ducha Svätého.<br>" +
                    "Skrze Krista, nášho Pána."},
    };

    String[][] adventModlitby = {
            {"10", "Prosíme ťa, všemohúci Bože,<br>" +
                    "daj nám ochotu konať dobré skutky <font color='#B71C1C'>*</font><br>" +
                    "a pomáhaj nám kráčať v ústrety Kristovi tak,<br>" +
                    "aby nás pri svojom druhom príchode <font color='#B71C1C'>—</font><br>" +
                    "postavil po svojej pravici<br>" +
                    "a voviedol do nebeského kráľovstva.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože,<br>" +
                    "prijmi obetné dary,<br>" +
                    "ktoré ti prinášame z toho,<br>" +
                    "čo nám udelila tvoj a dobrota; <font color='#B71C1C'>*</font><br>" +
                    "a čo ti teraz so synovskou oddanosťou obetujeme, <font color='#B71C1C'>—</font><br>" +
                    "nech nám prinesie večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                    "nech je nám na osoh účasť<br>" +
                    "na tejto sviatostnej hostine, <font color='#B71C1C'>*</font><br>" +
                    "pri ktorej nás už v tomto pominuteľnom svete<br>" +
                    "učíš milovať veci nebeské <font color='#B71C1C'>—</font><br>" +
                    "a hľadať hodnoty trváce.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"11", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám starostlivo sa pripraviť<br>" +
                    "na príchod tvojho Syna Ježiša Krista; <font color='#B71C1C'>—</font><br>" +
                    "a keď príde a zaklope,<br>" +
                    "nech nás nájde bdieť v modlitbách<br>" +
                    "a jasať na jeho slávu.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože, prijmi obetné dary,<br>" +
                    "ktoré ti prinášame z toho,<br>" +
                    "čo nám udelila tvoja dobrota; <font color='#B71C1C'>*</font><br>" +
                    "a čo ti teraz so synovskou oddanosťou obetujeme, <font color='#B71C1C'>—</font><br>" +
                    "nech nám prinesie večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, nech je nám na osoh<br>" +
                    "účasť na tejto sviatostnej hostine, <font color='#B71C1C'>*</font><br>" +
                    "pri ktorej nás už v tomto pominuteľnom svete<br>" +
                    "učíš milovať veci nebeské <font color='#B71C1C'>—</font><br>" +
                    "a hľadať hodnoty trváce.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"12", "Všemohúci Bože,<br>" +
                    "dobrotivo vyslyš naše pokorné prosby, <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám v našich slabostiach <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás radosť z príchodu tvojho Syna<br>" +
                    "chránila pred nebezpečenstvami hriechu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech ťa uzmieria naše pokorné modlitby<br>" +
                    "a obetné dary, <font color='#B71C1C'>—</font><br>" +
                    "a pretože sa nemôžeme spoliehať<br>" +
                    "na vlastné zásluhy,<br>" +
                    "pomáhaj nám svojou milosrdnou láskou.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, vo svojej nesmiernej láske<br>" +
                    "nasýtil si nás duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme sa účasťou na tejto sviatosti<br>" +
                    "naučili správne hodnotiť pozemské veci<br>" +
                    "a milovať hodnoty nebeské.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"13", "Prosíme ťa, Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "svojou božskou mocou priprav naše srdcia<br>" +
                    "na stretnutie s tvojím Synom Ježišom Kristom, <font color='#B71C1C'>—</font><br>" +
                    "aby nás pri svojom druhom príchode<br>" +
                    "uznal za hodných nebeskej hostiny,<br>" +
                    "na ktorej on sám podáva pokrm večného života.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dožič nám, Bože,<br>" +
                    "prinášať ti s oddaným srdcom túto obetu, <font color='#B71C1C'>*</font><br>" +
                    "ktorá sprítomňuje eucharistické tajomstvo, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby v nás uskutočňovala dielo spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, milostivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj nám týmto nebeským pokrmom silu<br>" +
                    "premáha ť naše zlé sklony, <font color='#B71C1C'>—</font><br>" +
                    "a tak sa pripraviť na blížiace sa sviatky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"14", "Dobrotivý Bože, ukáž svoju moc<br>" +
                    "a pomáhaj nám svojou božskou silou; <font color='#B71C1C'>*</font><br>" +
                    "nech tvoja milosrdná láska odstráni naše hriechy <font color='#B71C1C'>—</font><br>" +
                    "a urýchli príchod našej spásy.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože, prijmi obetné dary,<br>" +
                    "ktoré ti prinášame z toho,<br>" +
                    "čo nám udelila tvoj a dobrota ; <font color='#B71C1C'>*</font><br>" +
                    "a čo ti teraz so synovskou oddanosťou obetujeme, <font color='#B71C1C'>—</font><br>" +
                    "nech nám prinesie večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, nech je nám na osoh<br>" +
                    "účasť na tejto sviatostnej hostine, <font color='#B71C1C'>*</font><br>" +
                    "pri ktorej nás už v tomto pominuteľnom svete<br>" +
                    "učíš milovať veci nebeské <font color='#B71C1C'>—</font><br>" +
                    "a hľadať hodnoty trváce.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"15", "Pane Ježišu, prejav svoju moc a príď, <font color='#B71C1C'>*</font><br>" +
                    "aby nás tvoja prítomnosť<br>" +
                    "vyslobodila z nebezpečenstiev hriechu <font color='#B71C1C'>—</font><br>" +
                    "a tvoja milosrdná láska<br>" +
                    "priviedla k spáse.<br>" +
                    "Lebo ty žiješ a kraľuješ s Bohom Otcom<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "nech ťa uzmieria naše pokorné modlitby<br>" +
                    "a obetné dary, <font color='#B71C1C'>*</font><br>" +
                    "a pretože sa nemôžeme spoliehať<br>" +
                    "na vlastné zásluhy, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám svojou milosrdnou láskou.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, vo svojej nesmiernej láske<br>" +
                    "nasýtil si nás duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme sa účasťou na tejto sviatosti<br>" +
                    "naučili správne hodnotiť pozemské veci<br>" +
                    "a milovať hodnoty nebeské.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"16", "Milosrdný Bože,<br>" +
                    "ty si poslal na svet svojho milovaného Syna,<br>" +
                    "aby vyslobodil ľudské pokolenie<br>" +
                    "z otroctva hriechu; <font color='#B71C1C'>*</font><br>" +
                    "túžobne očakávame jeho príchod a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "vo svojej otcovskej dobrote<br>" +
                    "udeľ nám dar pravej slobody.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dožič nám, Bože,<br>" +
                    "prinášať ti s oddaným srdcom túto obetu, <font color='#B71C1C'>*</font><br>" +
                    "ktorá sprítomňuje eucharistické tajomstvo, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby v nás uskutočňovala dielo spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, milostivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj nám týmto nebeským pokrmom silu<br>" +
                    "premáhať naše zlé sklony, <font color='#B71C1C'>—</font><br>" +
                    "a tak sa pripraviť na blížiace sa sviatky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"20", "Všemohúci a milosrdný Bože,<br>" +
                    "nedopusť, aby nám starosti o pozemské veci<br>" +
                    "prekážali ísť v ústrety tvojmu Synovi, <font color='#B71C1C'>*</font><br>" +
                    "ale nech nás dar nebeskej múdrosti<br>" +
                    "privedie do spoločenstva s ním. <font color='#B71C1C'>—</font><br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "nech ťa uzmieria naše pokorné modlitby<br>" +
                    "a obetné dary, <font color='#B71C1C'>*</font><br>" +
                    "a pretože sa nemôžeme spoliehať<br>" +
                    "na vlastné zásluhy, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám svojou milosrdnou láskou.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, vo svojej nesmiernej láske<br>" +
                    "nasýtil si nás duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme sa účasťou na tejto sviatosti<br>" +
                    "naučili správne hodnotiť pozemské veci<br>" +
                    "a milovať hodnoty nebeské.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"21", "Prosíme ťa, Bože a Otče náš, <font color='#B71C1C'>*</font><br>" +
                    "nech sa k tebe vznesie naša pokorná modlitba, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v oddanej službe a s čistou dušou<br>" +
                    "mohli sláviť veľké tajomstvo<br>" +
                    "vtelenia tvojho jednorodeného Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože, prijmi obetné dary,<br>" +
                    "ktoré ti prinášame z toho,<br>" +
                    "čo nám udelila tvoja dobrota; <font color='#B71C1C'>*</font><br>" +
                    "a čo ti teraz so synovskou oddanosťou obetujeme, <font color='#B71C1C'>—</font><br>" +
                    "nech nám prinesie večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, nech je nám na osoh<br>" +
                    "účasť na tejto sviatostnej hostine, <font color='#B71C1C'>*</font><br>" +
                    "pri ktorej nás už v tomto pominuteľnom svete<br>" +
                    "učíš milovať veci nebeské <font color='#B71C1C'>—</font><br>" +
                    "a hľadať hodnoty trváce.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"22", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "ty si prisľúbil spásu všetkým národom; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme s radosťou očakávali<br>" +
                    "slávnosť narodenia tvojho Syna Ježiša Krista,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "nech ťa uzmieria naše pokorné modlitby<br>" +
                    "a obetné dary, <font color='#B71C1C'>*</font><br>" +
                    "a pretože sa nemôžeme spoliehať<br>" +
                    "na vlastné zásluhy, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám svojou milosrdnou láskou.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, vo svojej nesmiernej láske<br>" +
                    "nasýtil si nás duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme sa účasťou na tejto sviatosti<br>" +
                    "naučili správne hodnotiť pozemské veci<br>" +
                    "a milovať hodnoty nebeské.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"23", "Všemohúci Bože,<br>" +
                    "ty nám kážeš pripravovať cestu Pánovi; <font color='#B71C1C'>*</font><br>" +
                    "láskavo nás posilňuj,<br>" +
                    "aby nás nepremohla ľudská slabosť, — <br>" +
                    "keď s dôverou očakávame blaživý príchod<br>" +
                    "nebeského lekára Ježiša Krista,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dožič nám, Bože,<br>" +
                    "prinášať ti s oddaným srdcom túto obetu, <font color='#B71C1C'>*</font><br>" +
                    "ktorá sprítomňuje eucharistické tajomstvo, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby v nás uskutočňovala dielo spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, milostivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj nám týmto nebeským pokrmom silu<br>" +
                    "premáhať naše zlé sklony, <font color='#B71C1C'>—</font><br>" +
                    "a tak sa pripraviť na blížiace sa sviatky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"24", "Všemohúci Bože, pohni naše srdcia,<br>" +
                    "aby sme pripravili cestu<br>" +
                    "tvojmu jednorodenému Synovi; <font color='#B71C1C'>*</font><br>" +
                    "jeho príchod nech nás očistí <font color='#B71C1C'>—</font><br>" +
                    "a urobí nás hodnými slúžiť tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože, prijmi obetné dary,<br>" +
                    "ktoré ti prinášame z toho,<br>" +
                    "čo nám udelila tvoja dobrota; <font color='#B71C1C'>*</font><br>" +
                    "a čo ti teraz so synovskou oddanosťou obetujeme, <font color='#B71C1C'>—</font><br>" +
                    "nech nám prinesie večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, nech je nám na osoh<br>" +
                    "účasť na tejto sviatostnej hostine, <font color='#B71C1C'>*</font><br>" +
                    "pri ktorej nás už v tomto pominuteľnom svete<br>" +
                    "učíš milovať veci nebeské <font color='#B71C1C'>—</font><br>" +
                    "a hľadať hodnoty trváce.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"25", "Všemohúci Bože, prosíme ťa, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme v ustavičnej bdelosti<br>" +
                    "očakávali príchod tvojho jednorodeného Syna <font color='#B71C1C'>—</font><br>" +
                    "a podľa výzvy evanjelia<br>" +
                    "ponáhľali sa s horiacimi lampami<br>" +
                    "v ústrety pôvodcovi našej spásy Ježišovi Kristovi,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "nech ťa uzmieria naše pokorné modlitby<br>" +
                    "a obetné dary, <font color='#B71C1C'>*</font><br>" +
                    "a pretože sa nemôžeme spoliehať<br>" +
                    "na vlastné zásluhy, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám svojou milosrdnou láskou.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, vo svojej nesmiernej láske<br>" +
                    "nasýtil si nás duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme sa účasťou na tejto sviatosti<br>" +
                    "naučili správne hodnotiť pozemské veci<br>" +
                    "a milovať hodnoty nebeské.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"26", "Všemohúci Bože,<br>" +
                    "nech v našich srdciach zažiari tvoj Syn Ježiš Kristus,<br>" +
                    "odblesk tvojej slávy; <font color='#B71C1C'>*</font><br>" +
                    "jeho príchod nech zaženie všetku tmu hriechu <font color='#B71C1C'>—</font><br>" +
                    "a pretvorí nás na synov svetla.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dožič nám, Bože,<br>" +
                    "prinášať ti s oddaným srdcom túto obetu, <font color='#B71C1C'>*</font><br>" +
                    "ktorá sprítomňuje eucharistické tajomstvo, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby v nás uskutočňovala dielo spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, milostivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj nám týmto nebeským pokrmom silu<br>" +
                    "premáhať naše zlé sklony, <font color='#B71C1C'>—</font><br>" +
                    "a tak sa pripraviť na blížiace sa sviatky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"30", "Láskavý Bože,<br>" +
                    "zhliadni na svoj ľud, ktorý tak túžobne očakáva<br>" +
                    "slávnosť Narodenia Pána; <font color='#B71C1C'>*</font><br>" +
                    "priprav nám srdcia na sviatky našej spásy, <font color='#B71C1C'>—</font><br>" +
                    "aby nám boli dňami radosti<br>" +
                    "a velebnej oslavy teba.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dožič nám, Bože,<br>" +
                    "prinášať ti s oddaným srdcom túto obetu, <font color='#B71C1C'>*</font><br>" +
                    "ktorá sprítomňuje eucharistické tajomstvo, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby v nás uskutočňovala dielo spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, milostivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj nám týmto nebeským pokrmom silu<br>" +
                    "premáha ť naše zlé sklony, <font color='#B71C1C'>—</font><br>" +
                    "a tak sa pripraviť na blížiace sa sviatky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"31", "Dobrotivý Otče, prosíme ťa,<br>" +
                    "láskavo vypočuj naše volanie <font color='#B71C1C'>*</font><br>" +
                    "a príchodom tvojho Syna <font color='#B71C1C'>—</font><br>" +
                    "odstráň temnoty z nášho srdca.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože, prijmi obetné dary,<br>" +
                    "ktoré ti prinášame z toho,<br>" +
                    "čo nám udelila tvoj a dobrota; <font color='#B71C1C'>*</font><br>" +
                    "a čo ti teraz so synovskou oddanosťou obetujeme, <font color='#B71C1C'>—</font><br>" +
                    "nech nám prinesie večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, nech nám je na osoh<br>" +
                    "účasť na tejto sviatostnej hostine, <font color='#B71C1C'>*</font><br>" +
                    "pri ktorej nás už v tomto pominuteľnom svete<br>" +
                    "učíš milovať veci nebeské <font color='#B71C1C'>—</font><br>" +
                    "a hľadať hodnoty trváce.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"32", "Bože Otče,<br>" +
                    "skrze svojho jednorodeného Syna<br>" +
                    "utvoril si z nás nové stvorenie; <font color='#B71C1C'>*</font><br>" +
                    "zhliadni na dielo svojej milosrdnej lásky <font color='#B71C1C'>—</font><br>" +
                    "a príchodom Spasiteľa očisti nás<br>" +
                    "od následkov hriechu.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "nech ťa uzmieria naše pokorné modlitby<br>" +
                    "a obetné dary, <font color='#B71C1C'>*</font><br>" +
                    "a pretože sa nemôžeme spoliehať<br>" +
                    "na vlastné zásluhy, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám svojou milosrdnou láskou.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, vo svojej nesmiernej láske<br>" +
                    "nasýtil si nás duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme sa účasťou na tejto sviatosti<br>" +
                    "naučili správne hodnotiť pozemské veci<br>" +
                    "a milovať hodnoty nebeské.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"33", "Všemohúci Bože, prosíme ťa, <font color='#B71C1C'>*</font><br>" +
                    "nech nám blízka slávnosť narodenia tvojho Syna<br>" +
                    "poskytne pomoc v tomto živote <font color='#B71C1C'>—</font><br>" +
                    "a pripraví nás na odmenu vo večnosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dožič nám, Bože,<br>" +
                    "prinášať ti s oddaným srdcom túto obetu, <font color='#B71C1C'>*</font><br>" +
                    "ktorá sprítomňuje eucharistické tajomstvo, <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby v nás uskutočňovala dielo spásy.<br>" +
                    "Skrze Krista, nášho Pána.", "Prosíme ťa, milostivý Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj nám týmto nebeským pokrmom silu<br>" +
                    "premáhať naše zlé sklony, <font color='#B71C1C'>—</font><br>" +
                    "a tak sa pripraviť na blížiace sa sviatky.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"34", "Milosrdný a svätý Bože,<br>" +
                    "sme tvoji nehodní služobníci<br>" +
                    "a zarmucujú nás naše viny; <font color='#B71C1C'>*</font><br>" +
                    "preto ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "poteš nás spasiteľným príchodom<br>" +
                    "svojho jednorodeného Syna Ježiša Krista,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Večný Bože, prijmi obetné dary,<br>" +
                    "ktoré ti prinášame z toho,<br>" +
                    "čo nám udelila tvoja dobrota; <font color='#B71C1C'>*</font><br>" +
                    "a čo ti teraz so synovskou oddanosťou obetujeme, <font color='#B71C1C'>—</font><br>" +
                    "nech nám prinesie večnú spásu.<br>" +
                    "Skrze Krista, nášho Pána.", "Pane a Bože náš, nech je nám na osoh<br>" +
                    "účasť na tejto sviatostnej hostine, <font color='#B71C1C'>*</font><br>" +
                    "pri ktorej nás už v tomto pominuteľnom svete<br>" +
                    "učíš milovať veci nebeské <font color='#B71C1C'>—</font><br>" +
                    "a hľadať hodnoty trváce.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"35", "Všemohúci Bože,<br>" +
                    "nech tvoja milosť predchádza naše myšlienky<br>" +
                    "a sprevádza naše skutky, <font color='#B71C1C'>*</font><br>" +
                    "aby nám príchod tvojho Syna,<br>" +
                    "po ktorom celým srdcom túžime, <font color='#B71C1C'>—</font><br>" +
                    "priniesol pomoc pre život časný i večný.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milosrdný Bože,<br>" +
                    "nech ťa uzmieria naše pokorné modlitby<br>" +
                    "a obetné dary, <font color='#B71C1C'>*</font><br>" +
                    "a pretože sa nemôžeme spoliehať<br>" +
                    "na vlastné zásluhy, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám svojou milosrdnou láskou.<br>" +
                    "Skrze Krista, nášho Pána.", "Dobrotivý Otče, vo svojej nesmiernej láske<br>" +
                    "nasýtil si nás duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme sa účasťou na tejto sviatosti<br>" +
                    "naučili správne hodnotiť pozemské veci<br>" +
                    "a milovať hodnoty nebeské.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"40", "Bože,<br>" +
                    "z anjelovho zvestovania vieme,<br>" +
                    "že tvoj Syn Ježiš Kristus sa stal človekom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, vlej nám do duše svoju milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby nás jeho umučenie a kríž<br>" +
                    "priviedli k slávnemu vzkrieseniu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "tvoj Duch Svätý,<br>" +
                    "ktorý svojou mocou zatônil Pannu Máriu,<br>" +
                    "aby sa stala matkou tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "nech posvätí obetné dary, pripravené na tvojom oltári.<br>" +
                    "Skrze Krista, nášho Pána.", "Všemohúci Bože,<br>" +
                    "v Eucharistii sme prijali záloh večnej spásy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa tým nábožnejšie pripravovali<br>" +
                    "na dôstojnú oslavu narodenia tvojho Syna,<br>" +
                    "čím viac sa blížia vianočné sviatky.<br>" +
                    "Skrze Krista, nášho Pána."},
    };

    //dni po Zjavení majú formu: 1+ dvt
    String[][] vianoceModlitby = {
            //DRUHÁ NEDEĽA PO NARODENÍ PÁNA
                   {"0", "Všemohúci a večný Bože,<br>" +
                           "ty svetlo veriaceho ľudu, <font color='#B71C1C'>*</font><br>" +
                           "milostivo naplň celý svet svojou slávou <font color='#B71C1C'>—</font><br>" +
                           "a vo svetle svojej pravdy<br>" +
                           "daj sa poznať všetkým národom.<br>" +
                           "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                           "ktorý je Boh a s tebou žije a kraľuje<br>" +
                           "v jednote s Duchom Svätým po všetky veky vekov.", "Láskavý Otče,<br>" +
                           "posväť naše dary<br>" +
                           "spásonosným narodením tvojho Syna, <font color='#B71C1C'>*</font><br>" +
                           "ktorý nám ukazuje cestu pravdy <font color='#B71C1C'>—</font><br>" +
                           "a sľubuje život v nebeskom kráľovstve.<br>" +
                           "Skrze Krista, nášho Pána.", "Pane a Bože náš,<br>" +
                           "pokorne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                           "pomôž nám pôsobením tejto sviatosti<br>" +
                           "oslobodiť sa od zlých návykov <font color='#B71C1C'>—</font><br>" +
                           "a dosiahnuť spásu, po ktorej túžime.<br>" +
                           "Skrze Krista, nášho Pána."},
            //VŠEDNÉ DNI VIANOCNÉHO OBDOBIA
            {"1", "Všemohúci Bože, vyznávame,<br>" +
                    "že tvoj milovaný Syn, s tebou večný v sláve,<br>" +
                    "stal sa človekom a narodil sa z panenskej matky; <font color='#B71C1C'>*</font><br>" +
                    "posilňuj nás v tejto viere,<br>" +
                    "aby sme prekonali terajšie protivenstvá <font color='#B71C1C'>—</font><br>" +
                    "a dosiahli nehynúcu radosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Otče, prijmi tieto dary,<br>" +
                    "ktorými sa uskutočňuje vznešená výmena: <font color='#B71C1C'>*</font><br>" +
                    "my ti obetujeme z toho, čo si nám uštedril, <font color='#B71C1C'>—</font><br>" +
                    "a ty nám dávaš seba samého<br>" +
                    "vo svojom Synovi Ježišovi Kristovi,<br>" +
                    "ktorý žije a kraľuje naveky vekov.", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nám nebeský pokrm, ktorý sme prijali, <font color='#B71C1C'>—</font><br>" +
                    "bol stálou posilou na ceste k tebe.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"2", "Večný Bože,<br>" +
                    "tvoj milovaný Syn, narodený z Panny Márie,<br>" +
                    "stal sa nám podobným vo všetkom okrem hriechu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa,<br>" +
                    "uzdrav nás z následkov prvotnej viny, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ako nové stvorenie žili novým životom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
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
            {"3", "Všemohúci Bože,<br>" +
                    "ty si poslal svojho Syna Ježiša Krista,<br>" +
                    "aby priniesol svetlo spásy celému svetu; <font color='#B71C1C'>*</font><br>" +
                    "daj, nech ožiari aj naše srdcia <font color='#B71C1C'>—</font><br>" +
                    "a ustavične ich obnovuje.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milovaný Bože,<br>" +
                    "pôvodca úprimnej nábožnosti a pokoja, <font color='#B71C1C'>*</font><br>" +
                    "dožič, aby sme ťa týmto obetným darom<br>" +
                    "dôstojne uctili <font color='#B71C1C'>—</font><br>" +
                    "a účasťou na sviatostnej hostine<br>" +
                    "dosiahli svornosť a jednotu zmýšľania.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "ty mnohorakým spôsobom<br>" +
                    "vedieš a posilňuješ svoj ľud; <font color='#B71C1C'>*</font><br>" +
                    "otcovsky nás ochraňuj teraz i v budúcnosti <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás radosť z pozemských dohier<br>" +
                    "pobádala väčšmi sa usilovať o hodnoty večné.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"4", "Dobrotivý Otče,<br>" +
                    "narodením tvojho milovaného Syna<br>" +
                    "obdivuhodne si začal dielo našej spásy; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, posilňuj našu vieru, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s jeho pomocou<br>" +
                    "dosiahli prisľúbenú odmenu slávy.<br>" +
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
            {"5", "Dobrotivý Bože,<br>" +
                    "láskavo nás osvecuj jasom svojej slávy <font color='#B71C1C'>*</font><br>" +
                    "a ustavične roznecuj naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy lepšie poznávali nášho Spasiteľa<br>" +
                    "a žili jeho životom.<br>" +
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
            {"6", "Všemohúci a večný Bože,<br>" +
                    "pri narodení tvojho Syna<br>" +
                    "zjavil si sa nám v novom svetle ; <font color='#B71C1C'>*</font><br>" +
                    "daj nám účasť na jeho božskom živote, <font color='#B71C1C'>—</font><br>" +
                    "ako on vzal na seba našu ľudskú prirodzenosť<br>" +
                    "narodením z Panny Márie.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milovaný Bože,<br>" +
                    "pôvodca úprimnej nábožnosti a pokoja, <font color='#B71C1C'>*</font><br>" +
                    "dožič, aby sme ťa týmto obetným darom<br>" +
                    "dôstojne uctili <font color='#B71C1C'>—</font><br>" +
                    "a účasťou na sviatostnej hostine<br>" +
                    "dosiahli svornosť a jednotu zmýšľania.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "ty mnohorakým spôsobom<br>" +
                    "vedieš a posilňuješ svoj ľud; <font color='#B71C1C'>*</font><br>" +
                    "otcovsky nás ochraňuj teraz i v budúcnosti <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás radosť z pozemských dohier<br>" +
                    "pobádala väčšmi sa usilovať o hodnoty večné.<br>" +
                    "Skrze Krista, nášho Pána."},
            //VŠEDNÉ DNI PO ZJAVENÍ PÁNA
            {"11", "Prosíme ťa, všemohúci Bože,<br>" +
                    "osvieť naše srdcia jasom svojej velebnosti, <font color='#B71C1C'>*</font><br>" +
                    "aby sme šťastne prešli cez temnoty tohto sveta <font color='#B71C1C'>—</font><br>" +
                    "a dostali sa do vlasti večného svetla.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Dobrotivý Otče, prijmi tieto dary,<br>" +
                    "ktorými sa uskutočňuje vznešená výmena: <font color='#B71C1C'>*</font><br>" +
                    "my ti obetujeme z toho, čo si nám uštedril, <font color='#B71C1C'>—</font><br>" +
                    "a ty nám dávaš seba samého<br>" +
                    "vo svojom Synovi Ježišovi Kristovi,<br>" +
                    "ktorý žije a kraľuje naveky vekov.", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby nám nebeský pokrm, ktorý sme prijali, <font color='#B71C1C'>—</font><br>" +
                    "bol stálou posilou na ceste k tebe.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"12", "Láskavý Otče, tvoj jednorodený Syn<br>" +
                    "prišiel medzi nás ako pravý človek<br>" +
                    "a bol nám navonok podobný; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa s pomocou jeho milosti<br>" +
                    "vnútorne stali podobnými jemu.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje<br>" +
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
            {"13", "Bože, svetlo všetkých národov, <font color='#B71C1C'>*</font><br>" +
                    "dožič celému svetu trvalý pokoj<br>" +
                    "a do našich sŕdc vlej žiarivé svetlo, <font color='#B71C1C'>—</font><br>" +
                    "ktorým si osvecoval mysle našich praotcov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milovaný Bože,<br>" +
                    "pôvodca úprimnej nábožnosti a pokoja, <font color='#B71C1C'>*</font><br>" +
                    "dožič, aby sme ťa týmto obetným darom<br>" +
                    "dôstojne uctili <font color='#B71C1C'>—</font><br>" +
                    "a účasťou na sviatostnej hostine<br>" +
                    "dosiahli svornosť a jednotu zmýšľania.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "ty mnohorakým spôsobom<br>" +
                    "vedieš a posilňuješ svoj ľud; <font color='#B71C1C'>*</font><br>" +
                    "otcovsky nás ochraňuj teraz i v budúcnosti <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás radosť z pozemských dohier<br>" +
                    "pobádala väčšmi sa usilovať o hodnoty večné.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"14", "Večný Bože,<br>" +
                    "pri narodení tvojho Syna<br>" +
                    "všetkým národom zažiarila nádej na večný život; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme stále lepšie poznávali<br>" +
                    "nášho Vykupiteľa <font color='#B71C1C'>—</font><br>" +
                    "a s jeho pomocou vošli do svetla večnej slávy.<br>" +
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
            {"15", "Všemohúci Bože,<br>" +
                    "svetlom hviezdy si zjavil národom<br>" +
                    "príchod Spasiteľa sveta; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme vždy dokonalejšie poznávali<br>" +
                    "tajomstvo narodenia tvojho Syna Ježiša Krista,<br>" +
                    "ktorý je Boh a s tebou žije a kraľuje<br>" +
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
            {"16", "Všemohúci a večný Bože,<br>" +
                    "skrze svojho jednorodeného Syna<br>" +
                    "urobil si nás novým stvorením; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme sa pôsobením tvojej milosti<br>" +
                    "čoraz dokonalejšie premieňali v Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                    "v ktorom je naša ľudská prirodzenosť<br>" +
                    "spojená s tvojím božstvom.<br>" +
                    "O to ťa prosíme skrze nášho Pána Ježiša Krista,<br>" +
                    "tvojho Syna, ktorý je Boh a s tebou žije a kraľuje<br>" +
                    "v jednote s Duchom Svätým po všetky veky vekov.", "Milovaný Bože,<br>" +
                    "pôvodca úprimnej nábožnosti a pokoja, <font color='#B71C1C'>*</font><br>" +
                    "dožič, aby sme ťa týmto obetným darom<br>" +
                    "dôstojne uctili <font color='#B71C1C'>—</font><br>" +
                    "a účasťou na sviatostnej hostine<br>" +
                    "dosiahli svornosť a jednotu zmýšľania.<br>" +
                    "Skrze Krista, nášho Pána.", "Milosrdný Bože,<br>" +
                    "ty mnohorakým spôsobom<br>" +
                    "vedieš a posilňuješ svoj ľud; <font color='#B71C1C'>*</font><br>" +
                    "otcovsky nás ochraňuj teraz i v budúcnosti <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby nás radosť z pozemských dohier<br>" +
                    "pobádala väčšmi sa usilovať o hodnoty večné.<br>" +
                    "Skrze Krista, nášho Pána."},
    };
}
