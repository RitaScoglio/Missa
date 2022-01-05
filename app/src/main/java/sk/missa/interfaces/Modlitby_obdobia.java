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
            {"1", "Prosíme ťa, Pane, <br>" +
                    "vo svojej láskavosti prijmi prosby svojho ľudu, <font color='#B71C1C'>*</font><br>" +
                    "aby sme poznali dobro, ktoré máme konať, <font color='#B71C1C'>—</font><br>" +
                    "a aby sme ho čo najlepšie uvádzali do života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech ti je milá naša obeta, <font color='#B71C1C'>*</font><br>" +
                            "aby sme sa ňou posvätili <font color='#B71C1C'>—</font><br>" +
                            "a dosiahli, o čo s úctou prosíme.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "posilnil si nás sviatostným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "daj, aby sme ti úprimne slúžili <br>" +
                            "príkladným životom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"2", "Všemohúci a večný Bože, <br>" +
                    "ty riadiš všetko na nebi i na zemi; <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo splň prosby svojho ľudu <font color='#B71C1C'>—</font><br>" +
                    "a daruj našim časom svoj pokoj.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "pomôž nám nábožne sláviť tieto tajomstvá, <font color='#B71C1C'>*</font><br>" +
                            "lebo vždy, keď slávime pamiatku Kristovej obety, <font color='#B71C1C'>—</font><br>" +
                            "uskutočňuje sa dielo nášho vykúpenia.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, nasýtil si nás <br>" +
                            "tým istým nebeským chlebom; <font color='#B71C1C'>*</font><br>" +
                            "naplň nás Duchom svojej lásky <font color='#B71C1C'>—</font><br>" +
                            "a zjednoť naše srdcia i mysle.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"3", "Všemohúci a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "usmerňuj náš život podľa svojej vôle, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v mene tvojho milovaného Syna <br>" +
                    "horlivo konali dobré skutky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "milostivo prijmi naše dary a posväť ich, <font color='#B71C1C'>—</font><br>" +
                            "aby nám slúžili na spásu.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Všemohúci Bože, <br>" +
                            "sviatostným pokrmom v nás <br>" +
                            "zveľaďuješ milosť nového života; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa stále tešili z tohto nebeského daru.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"4", "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                    "dopraj, aby sme ťa uctievali celou dušou <font color='#B71C1C'>—</font><br>" +
                    "a všetkých ľudí milovali opravdivou láskou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo prijmi dary, <font color='#B71C1C'>*</font><br>" +
                            "ktoré ti so synovskou oddanosťou prinášame na oltár, <font color='#B71C1C'>—</font><br>" +
                            "a premeň ich na sviatosť nášho vykúpenia.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, posilnil si nás <br>" +
                            "sviatosťou nášho vykúpenia; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby tento prostriedok večnej spásy <br>" +
                            "vždy zveľaďoval pravú vieru.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"5", "Prosíme ťa, Pane, <br>" +
                    "neprestajne ochraňuj svoju rodinu, <font color='#B71C1C'>*</font><br>" +
                    "ktorá vkladá nádej iba do nebeskej milosti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli vždy v bezpečí pod tvojou ochranou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane a Bože náš, <br>" +
                            "ty si stvoril chlieb a víno ako posilu pre telo; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sa nám stali aj sviatostným pokrmom <br>" +
                            "pre večný život.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Bože, ty si chcel, aby sme mali účasť <br>" +
                            "na jednom chlebe a jednom kalichu; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pomáhaj nám žiť tak, <font color='#B71C1C'>—</font><br>" +
                            "aby sme zjednotení v Kristovi radostne <br>" +
                            "spolupracovali na spáse sveta.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"6", "Bože, ty nás uisťuješ, že prebývaš v tých, <br>" +
                    "čo majú spravodlivé a úprimné srdce; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám svojou milosťou tak žiť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli tvojím dôstojným príbytkom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech nás táto obeta očistí a obnoví <font color='#B71C1C'>*</font><br>" +
                            "a nech nám zabezpečí večnú odmenu, <font color='#B71C1C'>—</font><br>" +
                            "ktorú si prisľúbil tým, čo plnia tvoju vôľu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás nebeským pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sme vždy túžili po tejto posile, <font color='#B71C1C'>—</font><br>" +
                            "ktorá v nás zveľaďuje opravdivý život.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"7", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nauč nás vždy správne zmýšľať, <font color='#B71C1C'>—</font><br>" +
                    "aby sa naše slová i skutky zhodovali s tvojou vôľou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, slávime tieto tajomstvá <br>" +
                            "ako prejav našej oddanej služby; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby obeta, ktorú prinášame tebe na slávu, <br>" +
                            "nám slúžila na spásu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "v tejto sviatosti si nám dal záloh večnej spásy; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ju dosiahli v plnej miere <br>" +
                            "v nebeskej vlasti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"8", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sa život na zemi <br>" +
                    "rozvíjal v pokoji podľa tvojej vôle <font color='#B71C1C'>—</font><br>" +
                    "a aby tvoja Cirkev mohla nerušene <br>" +
                    "a radostne plniť poslanie, ktoré si jej zveril.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, od teba pochádzajú dary, <br>" +
                            "ktoré ti prinášame, a ty ich prijímaš <br>" +
                            "ako prejav našej oddanosti; <font color='#B71C1C'>*</font><br>" +
                            "láskavo ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "daj, aby nám obeta, ktorú konáme, <br>" +
                            "zaslúžila večnú odmenu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás spásonosnými darmi; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <br>" +
                            "aby nám táto sviatosť, <br>" +
                            "ktorou nás živíš na pozemskej púti, <font color='#B71C1C'>—</font><br>" +
                            "zaistila účasť na večnom živote.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"9", "Bože, tvoja prozreteľnosť <br>" +
                    "je neomylná vo všetkých rozhodnutiach; <font color='#B71C1C'>*</font><br>" +
                    "preto ťa pokorne prosíme, <br>" +
                    "odvráť od nás, čo je škodlivé, <font color='#B71C1C'>—</font><br>" +
                    "a daj nám všetko, čo slúži na spásu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, s dôverou v tvoju dobrotu <br>" +
                            "prichádzame s darmi k svätému oltáru; <font color='#B71C1C'>*</font><br>" +
                            "daj, aby nás očistila tvoja milosť <font color='#B71C1C'>—</font><br>" +
                            "a posvätili tajomstvá, ktoré slávime.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, živíš nás Telom a Krvou svojho Syna; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, veď nás svojím Duchom, <br>" +
                            "aby sme ťa vyznávali nielen slovami a jazykom, <br>" +
                            "ale aj skutkami a v pravde, <font color='#B71C1C'>—</font><br>" +
                            "a tak si zaslúžili vojsť do nebeského kráľovstva.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "Bože, od teba pochádza každé dobro; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, osvecuj náš rozum, <br>" +
                    "aby sme poznali, čo je správne, <font color='#B71C1C'>—</font><br>" +
                    "a posilňuj našu vôľu, aby sme podľa toho aj konali.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "milostivo zhliadni na našu službu, <font color='#B71C1C'>*</font><br>" +
                            "aby sa ti naša obeta páčila <font color='#B71C1C'>—</font><br>" +
                            "a v nás rozmnožovala lásku.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nás tvoja uzdravujúca moc <br>" +
                            "dobrotivo oslobodzuje od zlých žiadostí <font color='#B71C1C'>—</font><br>" +
                            "a privedie k pravému dobru.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "Bože, sila tých, čo v teba dúfajú, <br>" +
                    "bez teba ľudská slabosť nič nezmôže; <font color='#B71C1C'>*</font><br>" +
                    "vypočuj naše prosby a ustavične nám <br>" +
                    "pomáhaj svojou milosťou, <font color='#B71C1C'>—</font><br>" +
                    "aby sme verne plnili tvoje prikázania, <br>" +
                    "a tak sa ti páčili zmýšľaním i skutkami.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, chlieb a víno nám dávaš <br>" +
                            "za telesný pokrm, ktorý živí naše telo, <br>" +
                            "a premieňaš ich na sviatosť, ktorá nás posväcuje; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme z nich čerpali vždy novú silu pre telo i pre dušu.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, toto sväté prijímanie naznačuje, <br>" +
                            "že veriaci sú zjednotení v tebe; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby táto sviatosť v tvojej Cirkvi <br>" +
                            "vytvárala účinnú jednotu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"12", "Pane, daj, aby sme vždy uctievali <br>" +
                    "a milovali tvoje sväté meno, <font color='#B71C1C'>*</font><br>" +
                    "veď ty nás stále miluješ <font color='#B71C1C'>—</font><br>" +
                    "a neprestajne nás vedieš na ceste života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi túto obetu zmierenia a chvály <font color='#B71C1C'>*</font><br>" +
                            "a daj, nech nás očistí, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ti mohli slúžiť s úprimným srdcom.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, obnovil si nás <br>" +
                            "vzácnym pokrmom presvätého Tela a Krvi; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, dopraj, <font color='#B71C1C'>—</font><br>" +
                            "aby nám ich časté prijímanie bolo istou zárukou spásy.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"13", "Bože, ty si chcel, aby sme sa prostredníctvom <br>" +
                    "krstnej milosti stali synmi svetla; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, nedopusť, aby sme upadli do tmy bludu, <font color='#B71C1C'>—</font><br>" +
                    "ale pomôž nám vždy stáť vo svetle pravdy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, svätými tajomstvami <br>" +
                            "v nás milostivo uskutočňuješ dielo spásy; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby naša služba pri tvojom oltári <br>" +
                            "zodpovedala svätosti tejto obety.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Prosíme ťa, Pane, <br>" +
                            "nech svätá obeta, ktorú sme slávili <br>" +
                            "a z ktorej sme prijímali, zveľaďuje v nás život, <font color='#B71C1C'>*</font><br>" +
                            "aby sme láskou boli stále spojení s tebou <font color='#B71C1C'>—</font><br>" +
                            "a prinášali trvalé ovocie.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14", "Bože, ty si pozdvihol <br>" +
                    "padnuté ľudstvo uponížením sa tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "daruj svätú radosť svojim veriacim, <br>" +
                    "ktorých si vymanil z otroctva hriechu, <font color='#B71C1C'>—</font><br>" +
                    "a priveď ich do večnej blaženosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, obeta, ktorú ti prinášame, <font color='#B71C1C'>*</font><br>" +
                            "nech nás vnútorne očisťuje <font color='#B71C1C'>—</font><br>" +
                            "a nech nás zo dňa na deň lepšie pripravuje na život, <br>" +
                            "ktorý nás čaká v nebi.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, zahrnul si nás nesmiernou milosťou; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sme <br>" +
                            "vždy prijímali spásonosné dary <font color='#B71C1C'>—</font><br>" +
                            "a nikdy ťa neprestali chváliť.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"15", "Bože, ty ukazuješ blúdiacim svetlo <br>" +
                    "svojej pravdy, aby sa vrátili na správnu cestu; <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj všetkým kresťanom <br>" +
                    "odmietať, čo sa protiví ich viere, <font color='#B71C1C'>—</font><br>" +
                    "a usilovať sa o to, čo zodpovedá <br>" +
                    "ich kresťanskému povolaniu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, zhliadni na dary prosiacej Cirkvi <font color='#B71C1C'>*</font><br>" +
                            "a premeň ich na duchovný pokrm, <font color='#B71C1C'>—</font><br>" +
                            "ktorý posväcuje náš každodenný život.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, prijali sme tvoje dary <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                            "daj, aby sa v nás účasťou <br>" +
                            "na týchto tajomstvách vzmáhali účinky vykúpenia.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"16", "Pane, buď milostivý nám, svojim služobníkom, <font color='#B71C1C'>*</font><br>" +
                    "a obohacuj nás darmi svojej dobroty, <font color='#B71C1C'>—</font><br>" +
                    "aby sme so živou vierou, nádejou a láskou <br>" +
                    "dôsledne zachovávali tvoje prikázania.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, ty si jedinou a dokonalou obetou <br>" +
                            "zavŕšil rozličné obety Starého zákona; <font color='#B71C1C'>*</font><br>" +
                            "prijmi naše obetné dary, <br>" +
                            "ako si prijal dary spravodlivého Ábela, a posväť ich, <font color='#B71C1C'>—</font><br>" +
                            "aby to, čo každý z nás priniesol tebe na slávu, <br>" +
                            "všetkým slúžilo na spásu.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Prosíme ťa, Pane, <br>" +
                            "dobrotivo ochraňuj svoj ľud, <br>" +
                            "ktorý si nasýtil nebeským pokrmom, <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj mu, aby sa odvrátil od hriechu <font color='#B71C1C'>—</font><br>" +
                            "a prešiel k novému životu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"17", "Bože, ochranca všetkých, čo v teba dúfajú, <br>" +
                    "bez teba nič nie je hodnotné, nič nie je sväté; <font color='#B71C1C'>*</font><br>" +
                    "zahrňuj nás svojím milosrdenstvom <br>" +
                    "a pomáhaj nám tak užívať pominuteľné veci, <font color='#B71C1C'>—</font><br>" +
                    "aby nás privádzali k hodnotám trvácim.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi dary, ktoré ti prinášame <br>" +
                            "z toho, čo si nám uštedril, <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby nás milosť prúdiaca <br>" +
                            "z týchto presvätých tajomstiev <br>" +
                            "posväcovala v každodennom živote <font color='#B71C1C'>—</font><br>" +
                            "a viedla k večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, prijali sme sviatosť, <br>" +
                            "ktorá je trvalou pamiatkou umučenia tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby nám tento dar jeho nevýslovnej lásky slúžil na spásu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"18", "Pane, nadšene vyznávame, <br>" +
                    "že si náš Stvoriteľ a Pán; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, sprevádzaj <br>" +
                    "svojich služobníkov ustavičnou priazňou, <font color='#B71C1C'>—</font><br>" +
                    "aby si svoje stvorenie obnovil <br>" +
                    "a obnovené aj zachoval.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo posväť tieto dary, <font color='#B71C1C'>*</font><br>" +
                            "ktoré predstavujú našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                            "a urob aj z nás večný dar pre teba.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, ty nás obnovuješ nebeskými darmi <br>" +
                            "a ustavične nám prejavuješ svoju priazeň; <font color='#B71C1C'>*</font><br>" +
                            "vo svojej starostlivosti dopraj, <font color='#B71C1C'>—</font><br>" +
                            "aby sme si zaslúžili večné vykúpenie.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"19", "Všemohúci a večný Bože, <br>" +
                    "pod vedením Ducha Svätého <br>" +
                    "sa osmeľujeme volať ťa Otcom; <font color='#B71C1C'>*</font><br>" +
                    "rozhojňuj v našich srdciach ducha adoptívneho synovstva, <font color='#B71C1C'>—</font><br>" +
                    "aby sme raz dosiahli prisľúbené dedičstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, dobrotivo prijmi dary svojej Cirkvi, <font color='#B71C1C'>*</font><br>" +
                            "ktoré si nám poskytol, aby sme ti ich mohli priniesť na obetu, <font color='#B71C1C'>—</font><br>" +
                            "a svojou mocou ich premeň na sviatosť našej spásy.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nám slúži na spásu sviatosť, <br>" +
                            "ktorú sme prijali, <font color='#B71C1C'>—</font><br>" +
                            "a nech nás posilňuje svetlom tvojej pravdy.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "Bože, pripravil si duchovné <br>" +
                    "bohatstvo všetkým, čo ťa milujú; <font color='#B71C1C'>*</font><br>" +
                    "naplň naše srdcia svojou vrúcnou láskou, <br>" +
                    "aby sme ťa vždy a nadovšetko milovali <font color='#B71C1C'>—</font><br>" +
                    "a dosiahli od teba prisľúbené dedičstvo, <br>" +
                    "ktoré prevyšuje všetky naše túžby.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi naše dary, <br>" +
                            "ktorými sa uskutočňuje vznešená výmena, <font color='#B71C1C'>*</font><br>" +
                            "a keď ti obetujeme z toho, čo si nám uštedril, <font color='#B71C1C'>—</font><br>" +
                            "nech si zaslúžime prijať teba samého.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, touto sviatosťou <br>" +
                            "nám dávaš účasť na živote svojho Syna; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, pomáhaj nám, <br>" +
                            "aby sme ho na zemi verne nasledovali <font color='#B71C1C'>—</font><br>" +
                            "a zaslúžili si dostať sa do jeho spoločenstva v nebi.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"21", "Bože, ty zjednocuješ <br>" +
                    "mysle veriacich v spoločnom úsilí o dobro; <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám milovať, čo prikazuješ, <br>" +
                    "a túžiť po tom, čo sľubuješ, <font color='#B71C1C'>—</font><br>" +
                    "aby uprostred pominuteľných vecí tohto sveta <br>" +
                    "naše srdcia boli upriamené na nebo, <br>" +
                    "kde nájdeme opravdivú radosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, jedinou obetou <br>" +
                            "si z nás urobil raz navždy svoj ľud; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "udeľ nám v tvojej Cirkvi dar jednoty a pokoja.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Prosíme ťa, Pane, <br>" +
                            "úplne nás uzdrav svojím milosrdenstvom <font color='#B71C1C'>*</font><br>" +
                            "a ustavične nás zdokonaľuj a opatruj, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa ti vo všetkom páčili.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "Mocný Bože, prameň všetkého dobra, <br>" +
                    "zaštep nám do srdca lásku k tvojmu menu <br>" +
                    "a posilňuj našu nábožnosť, <font color='#B71C1C'>*</font><br>" +
                    "aby sa v nás dobro vzmáhalo <font color='#B71C1C'>—</font><br>" +
                    "a pod tvojou ochranou sa aj uchovalo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, nech nám táto svätá obeta <br>" +
                            "stále prináša spásonosné požehnanie, <font color='#B71C1C'>*</font><br>" +
                            "aby sa tvojou mocou uskutočnilo to, <font color='#B71C1C'>—</font><br>" +
                            "čo slávime ako tajomstvo.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, nasýtil si nás chlebom z nebeského stola; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby tento pokrm lásky <br>" +
                            "posilňoval naše srdcia <font color='#B71C1C'>—</font><br>" +
                            "a pobádal nás slúžiť ti v našich bratoch a sestrách.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "Bože, ty si nás vykúpil a prijal za svoje deti; <font color='#B71C1C'>*</font><br>" +
                    "dobrotivo zhliadni na svojich synov a dcéry, <font color='#B71C1C'>—</font><br>" +
                    "aby všetci, čo veria v Krista, <br>" +
                    "dosiahli pravú slobodu a večné dedičstvo.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, pôvodca úprimnej nábožnosti a pokoja, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme ťa dôstojne uctili týmito darmi <font color='#B71C1C'>—</font><br>" +
                            "a účasťou na svätých tajomstvách <br>" +
                            "upevnili vzájomnú jednotu.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, ty nás živíš a posilňuješ <br>" +
                            "pokrmom svojho slova a nebeskej sviatosti; <font color='#B71C1C'>*</font><br>" +
                            "daj, nech tak prijímame <br>" +
                            "vznešené dary tvojho milovaného Syna, <font color='#B71C1C'>—</font><br>" +
                            "aby sme dosiahli večnú účasť na jeho živote.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"24", "Bože, ty si všetko stvoril a všetko riadiš; <font color='#B71C1C'>*</font><br>" +
                    "zhliadni na nás a daj, aby sme ti slúžili celým srdcom <font color='#B71C1C'>—</font><br>" +
                    "a cítili v sebe účinky tvojho milosrdenstva.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, vypočuj naše prosby a láskavo prijmi naše dary, <font color='#B71C1C'>*</font><br>" +
                            "aby to, čo každý z nás obetoval na slávu tvojho mena, <font color='#B71C1C'>—</font><br>" +
                            "všetkým slúžilo na spásu.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Prosíme ťa, Pane, <br>" +
                            "nech nám sila nebeských darov preniká dušu i telo, <font color='#B71C1C'>*</font><br>" +
                            "aby v nás neprevládali pozemské túžby, <font color='#B71C1C'>—</font><br>" +
                            "ale spásonosné účinky tejto sviatosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"25", "Bože, všetky ustanovenia posvätného zákona <br>" +
                    "zhrnul si do prikázania lásky k tebe a k blížnemu; <font color='#B71C1C'>*</font><br>" +
                    "daj nám silu plniť tvoju vôľu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme tak mohli dosiahnuť večný život.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "dobrotivo prijmi obetné dary svojho ľudu, <font color='#B71C1C'>*</font><br>" +
                            "aby sme touto nebeskou sviatosťou dosiahli dobrá, <font color='#B71C1C'>—</font><br>" +
                            "po ktorých túžime s vierou a nábožnosťou.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, ty nás obnovuješ svojimi sviatosťami; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, ustavične nás sprevádzaj svojou pomocou, <font color='#B71C1C'>—</font><br>" +
                            "aby sa spásonosné účinky týchto tajomstiev <br>" +
                            "prejavovali aj v našom živote.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"26", "Bože, ty najviac prejavuješ <br>" +
                    "svoju všemohúcnosť, keď sa zmilúvaš a odpúšťaš; <font color='#B71C1C'>*</font><br>" +
                    "neprestajne nám dávaj svoju milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dôverou v tvoje prisľúbenia <br>" +
                    "dosiahli účasť na nebeskej blaženosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                            "nech ti je milá táto naša obeta, <font color='#B71C1C'>—</font><br>" +
                            "aby sa nám stala prameňom hojného požehnania.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, nech nás táto <br>" +
                            "vznešená sviatosť obnovuje na duchu i na tele, <font color='#B71C1C'>*</font><br>" +
                            "aby sme mali účasť na sláve Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                            "s utrpením ktorého sa zjednocujeme vždy, <br>" +
                            "keď zvestujeme jeho smrť.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"27", "Všemohúci a večný Bože, <br>" +
                    "vo svojej štedrosti dávaš <br>" +
                    "prosiacim viac, než si zasluhujú a žiadajú; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, vo svojom milosrdenstve <br>" +
                    "nám odpusť viny, čo znepokojujú naše svedomie, <font color='#B71C1C'>—</font><br>" +
                    "a udeľ nám aj tie milosti, o ktoré sa ani neodvažujeme prosiť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi obetu, ktorú ti prinášame podľa tvojho ustanovenia, <font color='#B71C1C'>*</font><br>" +
                            "a týmto svätým tajomstvom, <br>" +
                            "ktoré slávime ako prejav našej povinnej oddanosti, <font color='#B71C1C'>—</font><br>" +
                            "posväcuj svoj vykúpený ľud.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Všemohúci Bože, <br>" +
                            "nech je nám prijatá sviatosť <br>" +
                            "výdatným duchovným pokrmom a nápojom, <font color='#B71C1C'>*</font><br>" +
                            "aby sme sa premieňali v Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                            "ktorého sme prijali.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"28", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "nech nás tvoja milosť ustavične predchádza i sprevádza, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy horlivo konali dobré skutky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi naše modlitby a obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby nás posvätná služba, ktorú nábožne konáme, <font color='#B71C1C'>—</font><br>" +
                            "priviedla do nebeskej blaženosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, ty nás živíš <br>" +
                            "presvätým Telom a Krvou svojho Syna; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "daj nám aj účasť na svojom božskom živote.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"29", "Všemohúci a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám, aby sme vždy <br>" +
                    "ochotne plnili tvoju vôľu <font color='#B71C1C'>—</font><br>" +
                    "a slúžili ti s úprimným srdcom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "pomôž nám slúžiť ti <br>" +
                            "pri tvojom oltári s úprimným srdcom <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby nás očistila tvoja milosť <font color='#B71C1C'>—</font><br>" +
                            "a posvätili tajomstvá, ktoré slávime.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Prosíme ťa, Pane, <br>" +
                            "nech nám prijatie nebeského pokrmu pomáha, <font color='#B71C1C'>*</font><br>" +
                            "aby sme správne užívali pozemské dobrá <font color='#B71C1C'>—</font><br>" +
                            "a túžili aj po nebeských.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "Všemohúci a večný Bože, <br>" +
                    "rozmnož v nás vieru, nádej a lásku <font color='#B71C1C'>*</font><br>" +
                    "a pomáhaj nám milovať, čo prikazuješ, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli dosiahnuť, čo sľubuješ.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "zhliadni na dary, ktoré ti prinášame, <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby obeta, ktorú konáme, <font color='#B71C1C'>—</font><br>" +
                            "slúžila na tvoju slávu.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Prosíme ťa, Pane, <br>" +
                            "nech prijatá sviatosť uskutočňuje v nás dielo spásy, <font color='#B71C1C'>*</font><br>" +
                            "aby sme raz v plnosti dosiahli to, <font color='#B71C1C'>—</font><br>" +
                            "čo teraz slávime pod sviatostnými znakmi.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "Všemohúci a milosrdný Bože, <br>" +
                    "je darom tvojej štedrosti, <br>" +
                    "že ti môžeme dôstojne a chvályhodne slúžiť; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj nám silu premáhať prekážky <br>" +
                    "na ceste do prisľúbenej blaženosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sa tieto dary stali čistou obetou pre teba <font color='#B71C1C'>—</font><br>" +
                            "a pre nás bohatým prameňom tvojho milosrdenstva.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Prosíme ťa, Pane, <br>" +
                            "rozmnož v nás pôsobenie svojej milosti, <font color='#B71C1C'>*</font><br>" +
                            "aby nás nebeská sviatosť, ktorú sme prijali, <font color='#B71C1C'>—</font><br>" +
                            "pripravila na prisľúbenú blaženosť.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"32", "Všemohúci a milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "láskavo odvráť od nás všetky protivenstvá, <font color='#B71C1C'>—</font><br>" +
                    "aby sme bez vnútorných a vonkajších prekážok <br>" +
                    "mohli plniť tvoju vôľu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "zhliadni na tieto obetné dary, <font color='#B71C1C'>—</font><br>" +
                            "aby sme tajomstvo umučenia tvojho Syna slávili <br>" +
                            "a uctievali s úprimnou zbožnosťou.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Ďakujeme ti, Pane, že si nás posilnil svätou obetou, <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, daj, nech nám Duch Svätý, <br>" +
                            "ktorý pôsobí vo sviatostiach, dá silu, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ti zostali úprimne oddaní.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"33", "Pane a Bože náš, <br>" +
                    "pomáhaj nám, aby sme ťa radostne a oddane uctievali, <font color='#B71C1C'>*</font><br>" +
                    "lebo trvalé a dokonalé šťastie dosiahneme iba vtedy, <font color='#B71C1C'>—</font><br>" +
                    "keď budeme vždy slúžiť tebe, pôvodcovi všetkého dobra.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby nám obeta, <br>" +
                            "ktorú ti prinášame, pomáhala žiť pre teba <font color='#B71C1C'>—</font><br>" +
                            "a získala nám večnú blaženosť.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, prijali sme <br>" +
                            "sviatostný pokrm a pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby obeta, ktorú nám tvoj Syn <br>" +
                            "prikázal sláviť na svoju pamiatku, <font color='#B71C1C'>—</font><br>" +
                            "rozmnožila v nás lásku k tebe a k blížnemu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"34", "Prosíme ťa, Pane, <br>" +
                    "ustavične povzbudzuj našu vôľu, <font color='#B71C1C'>*</font><br>" +
                    "aby sme horlivo spolupracovali na Božom diele <font color='#B71C1C'>—</font><br>" +
                    "a v bohatej miere dosiahli dary tvojej lásky.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi posvätné dary, <br>" +
                            "ktoré prinášame na oltár z tvojho ustanovenia; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pomôž nám vždy <br>" +
                            "zachovávať tvoje prikázania, <font color='#B71C1C'>—</font><br>" +
                            "aby si aj v nás našiel zaľúbenie.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "keďže si nám daroval radosť <br>" +
                            "z účasti na božských tajomstvách, <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, nikdy nedopusť, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa od teba odlúčili.<br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] postModlitby = {
            {"03", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "dopraj nám týmto svätým pôstom <br>" +
                    "nastúpiť cestu duchovnej obnovy, <font color='#B71C1C'>—</font><br>" +
                    "aby nás pokánie posilňovalo <br>" +
                    "v boji proti nepriateľom spásy. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, na začiatku pôstneho obdobia <br>" +
                            "slávnostne prinášame túto obetu <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, nech nám pokánie <br>" +
                            "a skutky lásky pomáhajú krotiť zlé sklony, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa očistili od hriechov <br>" +
                            "a mohli sme nábožne sláviť <br>" +
                            "tajomstvo umučenia tvojho Syna.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech nám prijatá sviatosť pomáha, <font color='#B71C1C'>*</font><br>" +
                            "aby ti bolo milé naše pôstne sebazapieranie <font color='#B71C1C'>—</font><br>" +
                            "a nám slúžilo na vnútorné uzdravenie. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"04", "Pane, predchádzaj naše konanie <br>" +
                    "svojím vnuknutím a sprevádzaj ho svojou pomocou, <font color='#B71C1C'>*</font><br>" +
                    "aby sme všetky podujatia s tebou začínali <font color='#B71C1C'>—</font><br>" +
                    "a s tvojou pomocou i dokončili. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, milostivo zhliadni na obetné dary, <br>" +
                            "ktoré kladieme na tvoj oltár, <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby nám získali odpustenie hriechov <font color='#B71C1C'>—</font><br>" +
                            "a tvojmu menu slúžili na slávu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, pokorne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby nebeské dary, ktoré sme prijali, <font color='#B71C1C'>—</font><br>" +
                            "boli pre nás prameňom odpustenia a spásy. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"05", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "sprevádzaj svojou pomocou <br>" +
                    "naše prvé kroky na ceste pokánia, <font color='#B71C1C'>—</font><br>" +
                    "aby vonkajšie úkony kajúcnosti <br>" +
                    "vychádzali z úprimného srdca. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, obeta, ktorú slávime v tejto pôstnej dobe, <font color='#B71C1C'>*</font><br>" +
                            "nech zmení naše zmýšľanie, aby sme sa ti páčili, <font color='#B71C1C'>—</font><br>" +
                            "a nech nám dá silu, aby sme sa ochotnejšie premáhali. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                            "nech nás účasť na tomto tajomstve <br>" +
                            "očistí od všetkých previnení, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli prijať tvoju uzdravujúcu milosť.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"06", "Všemohúci a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "milosrdne zhliadni na našu krehkosť <font color='#B71C1C'>—</font><br>" +
                    "a vystri nad nás svoju mocnú pravicu, aby nás chránila. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi túto obetu zmierenia a chvály <font color='#B71C1C'>*</font><br>" +
                            "a daj, nech nás očistí, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ti mohli slúžiť s úprimným srdcom. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, posilnení nebeskými darmi ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby nám sviatosť, ktorá je pre nás v tomto živote tajomstvom, <font color='#B71C1C'>—</font><br>" +
                            "pomohla dosiahnuť večný život. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "Všemohúci Bože, udeľ nám milosť, <font color='#B71C1C'>*</font><br>" +
                    "aby sme prežívaním štyridsaťdňového <br>" +
                    "pôstneho obdobia hlbšie vnikali do Kristovho tajomstva <font color='#B71C1C'>—</font><br>" +
                    "a s jeho pomocou napredovali <br>" +
                    "čnostným životom na ceste k spáse. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "pomôž nám, aby sme sa celým srdcom <br>" +
                            "zapojili do tejto obety, <font color='#B71C1C'>—</font><br>" +
                            "ktorou začíname prípravu <br>" +
                            "na slávenie veľkonočného tajomstva.<br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, posilnil si nás nebeským chlebom, <br>" +
                            "ktorý v nás rozmnožuje vieru, <br>" +
                            "posilňuje nádej a rozohňuje lásku; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sme túžili <br>" +
                            "po živom a pravom chlebe, ktorým je Kristus, <font color='#B71C1C'>—</font><br>" +
                            "a živili sa každým slovom vychádzajúcim z tvojich úst. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "Bože, náš záchranca, obráť k sebe naše srdcia <font color='#B71C1C'>*</font><br>" +
                    "a pouč naše mysle nebeskou náukou, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa pôstnym pokáním <br>" +
                    "zdokonalili v kresťanskom živote. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi túto obetu ako prejav našej oddanosti <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby nás tvojou mocou posvätila <font color='#B71C1C'>—</font><br>" +
                            "a získala nám milosť odpustenia. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech je nám sviatosť, ktorú sme prijali, <br>" +
                            "duchovnou i telesnou posilou, <font color='#B71C1C'>*</font><br>" +
                            "aby sme dosiahli spásu <font color='#B71C1C'>—</font><br>" +
                            "a mohli sa tešiť z plnosti nebeskej odmeny. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"12", "Pane, zhliadni na svoju rodinu <font color='#B71C1C'>*</font><br>" +
                    "a pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby naše srdcia účinkom telesného pokánia <br>" +
                    "zahoreli vrúcnou túžbou po tebe. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Všemohúci Bože a náš Stvoriteľ, <font color='#B71C1C'>*</font><br>" +
                            "prijmi dary, ktoré ti prinášame z toho, <br>" +
                            "čo si nám veľkodušne uštedril, <font color='#B71C1C'>—</font><br>" +
                            "a premeň tento časný pokrm na zdroj večného života. <br>" +
                            "Skrze Krista, nášho Pána",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nám slávenie týchto tajomstiev <br>" +
                            "dá silu mierniť pozemské žiadosti, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa oduševnili za veci nebeské. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"13", "Pane, láskavo zhliadni na oddanosť svojho ľudu <font color='#B71C1C'>*</font><br>" +
                    "a pomáhaj nám, aby sme <br>" +
                    "zdržanlivosťou ovládali svoje telo <font color='#B71C1C'>—</font><br>" +
                    "a dobrými skutkami sa vzmáhali na duchu. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, predkladáme ti dary, <br>" +
                            "ktoré si nám dal, aby sme ich mohli <br>" +
                            "zasvätiť tvojmu menu; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, premeň ich na sviatosť, <font color='#B71C1C'>—</font><br>" +
                            "ktorú prijmeme ako záruku večného života. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, neprestajne nás živíš svojimi sviatosťami; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby nás ich prijímanie priviedlo do večného života. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"14", "Prosíme ťa, Pane, <br>" +
                    "vnukaj nám vždy správne myšlienky a predsavzatia <br>" +
                    "a daj nám ochotu podľa nich aj konať; <font color='#B71C1C'>*</font><br>" +
                    "a pretože nemôžeme jestvovať bez teba, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám žiť podľa tvojej vôle. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, vypočuj našu pokornú prosbu: <font color='#B71C1C'>*</font><br>" +
                            "prijmi obetné dary a modlitby, ktoré ti prednášame, <font color='#B71C1C'>—</font><br>" +
                            "a obráť naše srdcia k sebe. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, nech nám presväté tajomstvá, <br>" +
                            "ktoré si nám dal ako posilu v obnove nášho života, <font color='#B71C1C'>—</font><br>" +
                            "slúžia ako duchovný liek teraz i v budúcnosti. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"15", "Prosíme ťa, Pane, <br>" +
                    "pomáhaj nám náležite sa pripraviť na veľkonočné sviatky, <font color='#B71C1C'>*</font><br>" +
                    "aby telesné odriekanie, na ktoré sme sa podujali, <font color='#B71C1C'>—</font><br>" +
                    "všetkým slúžilo na duchovné posvätenie. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, láskavo prijmi túto obetu <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby nás uzmierila s tebou <font color='#B71C1C'>—</font><br>" +
                            "a obnovila v nás dielo spásy. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech nás nábožné prijatie <br>" +
                            "tvojej sviatosti vnútorne obnoví, <font color='#B71C1C'>*</font><br>" +
                            "očistí od škvŕn minulosti <font color='#B71C1C'>—</font><br>" +
                            "a privedie do spásonosného spoločenstva s tebou. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"16", "Večný Otče, obráť k sebe naše srdcia, <font color='#B71C1C'>*</font><br>" +
                    "aby sme vždy hľadali to jedine potrebné, <font color='#B71C1C'>—</font><br>" +
                    "konali skutky lásky, a tak sa zasvätili tvojej službe. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nás duchovne obnovia tieto sväté tajomstvá, <font color='#B71C1C'>—</font><br>" +
                            "aby sme boli hodní večnej odmeny. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás <br>" +
                            "božským tajomstvom a nebeskou náukou; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, ustavične nás sprevádzaj svojou priazňou <font color='#B71C1C'>—</font><br>" +
                            "a povzbudzuj nás nádejou na spásu. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "Bože, ty si nám prikázal <br>" +
                    "počúvať tvojho milovaného Syna; <font color='#B71C1C'>*</font><br>" +
                    "živ našu vieru svojím slovom <br>" +
                    "a očisťuj náš duchovný zrak, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa mohli tešiť z pohľadu na tvoju velebu. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech táto obeta zotrie naše viny <font color='#B71C1C'>*</font><br>" +
                            "a posvätí nás na tele i na duši, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli dôstojne sláviť veľkonočné sviatky. <br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, prijmi naše vďaky za to, <font color='#B71C1C'>*</font><br>" +
                            "že sme mohli prijať sväté tajomstvá <font color='#B71C1C'>—</font><br>" +
                            "a že nám už v pozemskom živote <br>" +
                            "dávaš účasť na nebeskej hostine. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "Pane, prikazuješ nám <br>" +
                    "telesné umŕtvovanie ako duchovný liek; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám chrániť sa každého hriechu <font color='#B71C1C'>—</font><br>" +
                    "a verne zachovávať tvoje prikázania. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, milostivo vypočuj naše prosby <font color='#B71C1C'>*</font><br>" +
                            "a vysloboď nás z osídel hriechu, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli dôstojne sláviť tieto nebeské tajomstvá. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "prijatie eucharistického pokrmu <br>" +
                            "nech nás očistí od hriechu <font color='#B71C1C'>—</font><br>" +
                            "a nech nám dá účasť na nebeskej radosti. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "Prosíme ťa, Pane, <br>" +
                    "ustavične ochraňuj svoju Cirkev, <font color='#B71C1C'>*</font><br>" +
                    "a pretože my smrteľní ľudia <br>" +
                    "bez tvojej pomoci klesáme, <font color='#B71C1C'>—</font><br>" +
                    "pomáhaj nám svojou milosťou <br>" +
                    "vyhýbať sa nebezpečenstvám <br>" +
                    "a sprevádzaj nás na ceste spásy. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, nech nás tieto sväté tajomstvá <br>" +
                            "posvätia tvojou milosťou, <font color='#B71C1C'>*</font><br>" +
                            "očistia od pozemských previnení <font color='#B71C1C'>—</font><br>" +
                            "a privedú k odmene v nebi. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech účasť na sviatostnej hostine <br>" +
                            "zveľaďuje náš duchovný život <font color='#B71C1C'>—</font><br>" +
                            "a poskytuje nám ustavičnú pomoc. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "Pane, pomáhaj svojej rodine <br>" +
                    "ochotne konať dobré skutky <font color='#B71C1C'>*</font><br>" +
                    "a potešuj nás svojou ochranou na pozemskej púti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme šťastlivo prišli do nebeskej vlasti. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "láskavo zhliadni na obetné dary, ktoré ti predkladáme, <font color='#B71C1C'>—</font><br>" +
                            "aby táto svätá výmena rozviazala putá našich hriechov. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, vrúcne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby nás eucharistický pokrm, <br>" +
                            "ktorý si nám dal ako záloh nesmrteľnosti, <font color='#B71C1C'>—</font><br>" +
                            "priviedol k večnej spáse. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"24", "Bože, ty miluješ nevinnosť <br>" +
                    "a navraciaš ju kajúcim hriešnikom; <font color='#B71C1C'>*</font><br>" +
                    "preto ťa prosíme, zapáľ v nás oheň Ducha Svätého <br>" +
                    "a obráť naše srdcia k tebe, <font color='#B71C1C'>—</font><br>" +
                    "aby sme boli pevní vo viere <br>" +
                    "a dosvedčovali ju svojím životom. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "posväť naše pokánie touto obetou, <font color='#B71C1C'>*</font><br>" +
                            "aby nás vonkajšie úkony kajúcnosti, <br>" +
                            "na ktoré sme sa podujali v tejto pôstnej dobe, <font color='#B71C1C'>—</font><br>" +
                            "vnútorne obnovili a posilnili. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                            "nech v nás neprestajne pôsobí <br>" +
                            "eucharistická obeta, ktorú sme slávili, <font color='#B71C1C'>—</font><br>" +
                            "a nech nás upevňuje vo vzájomnej láske. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"25", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme sa očistili úprimným pokáním, <font color='#B71C1C'>—</font><br>" +
                    "a tak mohli s obnoveným srdcom <br>" +
                    "sláviť veľkonočné tajomstvo. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, predchádzaj nás svojou milosťou <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj nám žiť podľa tvojej vôle, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli dôstojne sláviť túto svätú obetu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech nám záloh večného života, ktorý sme prijali, <font color='#B71C1C'>*</font><br>" +
                            "pomáha duchovne stále napredovať, <font color='#B71C1C'>—</font><br>" +
                            "aby sme raz dosiahli večnú spásu. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"26", "Bože, ty liečiš naše slabosti svojou milosťou <br>" +
                    "a už teraz nám dávaš účasť na nebeských veciach; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, riaď naše kroky na pozemskej púti <font color='#B71C1C'>—</font><br>" +
                    "a priveď nás do svetla, v ktorom večne prebývaš. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "touto sviatosťou rozmnož v nás účinky vykúpenia, <font color='#B71C1C'>*</font><br>" +
                            "aby nás chránili od hriešnej nezriadenosti <font color='#B71C1C'>—</font><br>" +
                            "a priviedli k večnej spáse. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, božská sviatosť, ktorú sme prijali, <font color='#B71C1C'>*</font><br>" +
                            "nech prenikne naše srdcia, <font color='#B71C1C'>—</font><br>" +
                            "aby sme vždy horlivejšie žili pre teba. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "Bože, prameň nekonečného milosrdenstva <br>" +
                    "a nesmiernej dobroty, ty nás učíš, <br>" +
                    "že pôst, modlitba a skutky kresťanskej lásky <br>" +
                    "sú liekom proti hriechu; <font color='#B71C1C'>*</font><br>" +
                    "láskavo zhliadni na vyznanie našej slabosti, <font color='#B71C1C'>—</font><br>" +
                    "a keď klesáme pod ťarchou previnení, <br>" +
                    "pozdvihni nás svojou milosrdnou rukou. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, očisti nás touto obetou od našich hriechov <font color='#B71C1C'>*</font><br>" +
                            "a daj nám silu, <font color='#B71C1C'>—</font><br>" +
                            "aby sme aj my ochotne odpúšťali svojim bratom. <br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Pane, už v pozemskom živote <br>" +
                            "nás živíš nebeským chlebom <br>" +
                            "a dávaš nám záloh nebeskej blaženosti; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "daj, aby sa účinky tejto sviatosti prejavovali aj v našich skutkoch. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "Pane, milostivo očisťuj a ochraňuj svoju Cirkev, <font color='#B71C1C'>*</font><br>" +
                    "a pretože sa nemôžeme zaobísť bez tvojej pomoci, <font color='#B71C1C'>—</font><br>" +
                    "neprestajne nás sprevádzaj svojou milosťou. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "prijmi obetu, ktorú ti predkladáme <br>" +
                            "na znak úprimnej oddanosti, <font color='#B71C1C'>—</font><br>" +
                            "a premeň ju na sviatosť našej spásy. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby nás prijatie sviatostného pokrmu <br>" +
                            "očistilo od každej viny <font color='#B71C1C'>—</font><br>" +
                            "a zjednotilo v pokoji a láske. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"32", "Prosíme ťa, Pane, <br>" +
                    "ustavične nás sprevádzaj svojou milosťou <font color='#B71C1C'>*</font><br>" +
                    "a poskytuj nám svoju pomoc, <font color='#B71C1C'>—</font><br>" +
                    "aby sme oddane zotrvali v tvojej svätej službe. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech spásonosná obeta, ktorú slávime, <font color='#B71C1C'>—</font><br>" +
                            "zotrie naše viny a uzmieri nás s tebou. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nás posilňujú sväté tajomstvá, <br>" +
                            "na ktorých sme mali účasť, <font color='#B71C1C'>—</font><br>" +
                            "a nech nám udelia odpustenie a ochranu. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"33", "Pane, v tomto štyridsaťdennom pôstnom období <br>" +
                    "nás živíš svojím slovom <br>" +
                    "a vedieš nás k duchovnej obnove; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomôž nám, <br>" +
                    "aby sme sa kajúcimi skutkami celkom oddali tebe <font color='#B71C1C'>—</font><br>" +
                    "a v bratskej láske ťa spoločne vzývali. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi prosby a obetné dary svojho ľudu <font color='#B71C1C'>*</font><br>" +
                            "a ochraňuj pred každým nebezpečenstvom nás všetkých, <font color='#B71C1C'>—</font><br>" +
                            "čo slávime tvoje sväté tajomstvá. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech nás posvätí <br>" +
                            "sviatostný pokrm, ktorým si nás nasýtil, <font color='#B71C1C'>*</font><br>" +
                            "nech nás očistí od všetkých previnení <font color='#B71C1C'>—</font><br>" +
                            "a pripraví pre večný život, ktorý si nám prisľúbil. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"34", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme sa tým nábožnejšie <br>" +
                    "pripravovali na slávenie veľkonočného tajomstva, <font color='#B71C1C'>—</font><br>" +
                    "čím viac sa blížia sviatky nášho vykúpenia. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi naše dary a očisti nás od hriechov, <font color='#B71C1C'>*</font><br>" +
                            "aby sme sa nedali zlákať klamnými radosťami, <font color='#B71C1C'>—</font><br>" +
                            "veď si nám prisľúbil pravú odmenu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, s láskou nás nasycuješ sviatostným pokrmom, <font color='#B71C1C'>*</font><br>" +
                            "posilňuj nás svojou pomocou, <font color='#B71C1C'>—</font><br>" +
                            "aby sa spásna milosť tejto sviatosti <br>" +
                            "prejavovala aj v našom živote. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"35", "Prosíme ťa, Pane, <br>" +
                    "naplň naše srdcia svojou milosťou, <font color='#B71C1C'>*</font><br>" +
                    "aby sme sa chránili ľudských nezriadeností <font color='#B71C1C'>—</font><br>" +
                    "a s tvojou pomocou sa pridržiavali nebeských vnuknutí. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "milostivo zhliadni na dary, ktoré ti predkladáme; <font color='#B71C1C'>*</font><br>" +
                            "tebe nech sú milé <font color='#B71C1C'>—</font><br>" +
                            "a nám nech sa stanú prameňom spásy. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "svojou milosťou nás posilňuj na tele i na duši, <font color='#B71C1C'>*</font><br>" +
                            "aby sme raz v plnej miere dosiahli spásu, <font color='#B71C1C'>—</font><br>" +
                            "na ktorej nám dávaš účasť sviatostným pokrmom. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"36", "Pane, s duchovnou radosťou <br>" +
                    "konáme pokánie v tejto pôstnej dobe <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, pomáhaj nám <br>" +
                    "vždy hlbšie prežívať veľkonočné tajomstvo, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v plnej miere dosiahli jeho spásonosné účinky. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, tebe vďačíme, že môžeme pristupovať <br>" +
                            "k tvojim svätým tajomstvám s očisteným srdcom; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ti slávením ich ustanovenia vzdávali dôstojnú chválu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Milosrdný Bože, <br>" +
                            "ty nás ustavične posväcuješ touto vznešenou sviatosťou; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme Telo a Krv tvojho Syna <br>" +
                            "prijímali vždy s veľkou úctou a s oddaným srdcom. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"40", "Bože, prostredníctvom svojho Syna <br>" +
                    "obdivuhodne zmieruješ so sebou ľudské pokolenie; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby kresťanský ľud kráčal <br>" +
                    "v ústrety veľkonočným sviatkom <br>" +
                    "s vrúcnou nábožnosťou a so živou vierou. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, s radosťou ti prinášame dary, <br>" +
                            "ktoré sú zárukou večného života; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <br>" +
                            "pomáhaj nám s hlbokou vierou sláviť obetu, <font color='#B71C1C'>—</font><br>" +
                            "ktorá prináša spásu celému svetu. <br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Bože, ty osvecuješ každého človeka <br>" +
                            "prichádzajúceho na tento svet; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, osvieť naše srdcia žiarou svojej milosti, <font color='#B71C1C'>—</font><br>" +
                            "aby sme vždy mali na mysli to, <br>" +
                            "čo sa zhoduje s tvojou vôľou, <br>" +
                            "a milovali ťa s úprimným srdcom. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"41", "Bože, svojimi vznešenými sviatosťami obnovuješ svet; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sa Cirkev vzmáhala <br>" +
                    "podľa tvojho večného zámeru <font color='#B71C1C'>—</font><br>" +
                    "a nikdy nezostala bez tvojej otcovskej pomoci. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "daj, nech v sebe pocítime <br>" +
                            "účinky tejto obety, ktorú ti predkladáme, <font color='#B71C1C'>*</font><br>" +
                            "aby nás očistila od hriechu <font color='#B71C1C'>—</font><br>" +
                            "a priviedla k večnému životu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nás obnovujúca sila tejto sviatosti <br>" +
                            "ustavične oživuje a posväcuje, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa stali hodnými večného života. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"42", "Pane, modlitby a kajúce skutky <br>" +
                    "v tejto pôstnej dobe nech pripravia naše srdcia, <font color='#B71C1C'>*</font><br>" +
                    "aby sme ochotne prijali veľkonočnú milosť <font color='#B71C1C'>—</font><br>" +
                    "a ohlasovali svetu radostnú zvesť o vykúpení. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prinášame ti dary, <br>" +
                            "ktoré si nám dal na zachovanie pozemského života, <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, dopraj, <font color='#B71C1C'>—</font><br>" +
                            "aby sa nám stali prameňom nesmrteľnosti. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, láskavo očisti naše srdcia <font color='#B71C1C'>*</font><br>" +
                            "a obnov ich nebeskou sviatosťou, <font color='#B71C1C'>—</font><br>" +
                            "aby sme z nej čerpali posilu teraz i v budúcnosti. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"43", "Bože, ty odmeňuješ spravodlivých za ich zásluhy <br>" +
                    "a hriešnikom odpúšťaš pre ich pokánie; <font color='#B71C1C'>*</font><br>" +
                    "vrúcne ťa prosíme, zmiluj sa nad nami <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme pokorne vyznali svoje hriechy, <br>" +
                    "a tak dosiahli tvoje odpustenie. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech táto svätá obeta zotrie naše hriechy, <font color='#B71C1C'>—</font><br>" +
                            "zveľadí v nás nový život a zaistí nám spásu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme nebeské dary <font color='#B71C1C'>*</font><br>" +
                            "a prosíme ťa, nedopusť, <br>" +
                            "aby nám bola na odsúdenie sviatosť, <font color='#B71C1C'>—</font><br>" +
                            "ktorú si nám dal na spásu. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"44", "Pane, v tejto pôstnej dobe <br>" +
                    "nám ponúkaš milosť napraviť sa pokáním <br>" +
                    "a posvätiť sa dobrými skutkami; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, pomáhaj nám <br>" +
                    "verne zachovávať tvoje prikázania, <font color='#B71C1C'>—</font><br>" +
                    "aby sme mohli s úprimným srdcom <br>" +
                    "sláviť veľkonočné sviatky. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Všemohúci Bože, prosíme ťa, dopraj, <font color='#B71C1C'>*</font><br>" +
                            "aby nás táto obeta očistila od každého zla <font color='#B71C1C'>—</font><br>" +
                            "a upevnila v čnostnom živote. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech nás očistí sviatosť, ktorú sme prijali, <font color='#B71C1C'>*</font><br>" +
                            "aby sme boli oslobodení od každej viny, <font color='#B71C1C'>—</font><br>" +
                            "a keď nás sužujú výčitky svedomia, <br>" +
                            "poteš nás nádejou na večnú spásu. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"45", "Bože, ty si nám, krehkým ľuďom, <br>" +
                    "pripravil potrebnú posilu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, dopraj, aby sme s radosťou <br>" +
                    "prijímali ovocie vykúpenia <font color='#B71C1C'>—</font><br>" +
                    "a nábožným životom dávali najavo <br>" +
                    "svoju duchovnú obnovu. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                            "pre zásluhy tejto obety zotri naše viny <font color='#B71C1C'>—</font><br>" +
                            "a priveď nás čistých k jej pôvodcovi, Ježišovi Kristovi.<br>" +
                            "Lebo on žije a kraľuje na veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme tak ako prechádzame od starého k novému, <br>" +
                            "dokázali zanechať starý spôsob života <font color='#B71C1C'>—</font><br>" +
                            "a obnoviť sa vo vnútornej svätosti. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"46", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "svojou milosrdnou láskou pritiahni k sebe naše srdcia, <font color='#B71C1C'>—</font><br>" +
                    "lebo bez tvojej milosti v nás nemôžeš mať zaľúbenie. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "prijmi tieto obetné dary <font color='#B71C1C'>—</font><br>" +
                            "a láskavo si podmaň aj našu vzdorovitú vôľu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nás táto sviatosť očistí a zdokonalí, <font color='#B71C1C'>—</font><br>" +
                            "aby sme sa ti páčili celým životom. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"50", "Prosíme ťa, Pane a Bože náš, <br>" +
                    "pomôž nám nadšene žiť v tej láske, <font color='#B71C1C'>*</font><br>" +
                    "ktorou tvoj Syn Ježiš Kristus svet miloval <font color='#B71C1C'>—</font><br>" +
                    "a na kríži sa zaň obetoval. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Všemohúci Bože, <br>" +
                            "priviedol si nás k poznaniu kresťanskej viery, <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, vypočuj nás <font color='#B71C1C'>—</font><br>" +
                            "a touto obetou nás očisti od všetkých hriechov. <br>" +
                            "Skrze Krista, nášho Pána. ",
                    "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme vždy patrili <br>" +
                            "do tajomného tela Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                            "ktorého Telo a Krv prijímame. <br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"51", "Bože, vo svojej nevýslovnej láske <br>" +
                    "nás zahrňuješ hojným požehnaním; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám prejsť <br>" +
                    "od starých spôsobov k novému životu, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa pripravili na slávu nebeského kráľovstva. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "dopraj, aby sme ti pri slávení svätých tajomstiev <br>" +
                            "ochotne obetovali aj svoje srdcia <font color='#B71C1C'>—</font><br>" +
                            "očistené telesným pokáním. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, nech nás milosť prijatej sviatosti <br>" +
                            "ustavične očisťuje od hriešnych náklonností, <font color='#B71C1C'>*</font><br>" +
                            "aby sme ochotne nasledovali Krista, <font color='#B71C1C'>—</font><br>" +
                            "a tak napredovali na ceste k tebe. <br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"52", "Prosíme ťa, Pane, pomáhaj nám <br>" +
                    "vytrvalo plniť tvoju vôľu a ochotne ti slúžiť, <font color='#B71C1C'>*</font><br>" +
                    "aby tvoj ľud aj v dnešných časoch rástol počtom <font color='#B71C1C'>—</font><br>" +
                    "a obohacoval sa dobrými skutkami. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, predkladáme ti zmiernu obetu, <font color='#B71C1C'>*</font><br>" +
                            "aby si nám láskavo odpustil viny <font color='#B71C1C'>—</font><br>" +
                            "a usmerňoval k sebe naše nestále srdcia. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                            "daj, nech vždy hľadáme, čo je Božie, <font color='#B71C1C'>—</font><br>" +
                            "aby sme boli čoraz hodnejší nebeských darov. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"53", "Milosrdný Bože, <br>" +
                    "osvieť naše srdcia posvätené pokáním, <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám oddane ti slúžiť <font color='#B71C1C'>—</font><br>" +
                    "a láskavo nás vypočuj, keď ťa vzývame. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, od teba sme dostali dary, <br>" +
                            "ktoré prinášame na česť tvojho mena; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sa nám stali posilou pre večný život. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nech v nás prijatá sviatosť <br>" +
                            "pôsobí ako nebeský liek, <font color='#B71C1C'>*</font><br>" +
                            "aby nám očistila srdcia od previnení <font color='#B71C1C'>—</font><br>" +
                            "a chránila nás pred každým nebezpečenstvom. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"54", "Pane, vypočuj naše prosby a zhliadni na nás, <br>" +
                    "veď všetku nádej skladáme <br>" +
                    "iba do tvojho milosrdenstva; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme boli očistení od hriechov, <br>" +
                    "vytrvali v čnostnom živote <font color='#B71C1C'>—</font><br>" +
                    "a stali sa dedičmi tvojich prisľúbení. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo zhliadni na túto obetu, <font color='#B71C1C'>*</font><br>" +
                            "aby nám slúžila na obrátenie <font color='#B71C1C'>—</font><br>" +
                            "a celému svetu na spásu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás spásonosnými darmi; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby nám táto sviatosť, ktorou nás živíš na pozemskej púti, <br>" +
                            "zaistila účasť na večnom živote. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"55", "Prosíme ťa, Pane, odpusť nám naše viny <font color='#B71C1C'>*</font><br>" +
                    "a pre svoju dobrotu vysloboď nás z osídel hriechu, <font color='#B71C1C'>—</font><br>" +
                    "do ktorých sme upadli pre svoju krehkosť. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, ty v tomto čase dávaš Cirkvi milosť <br>" +
                    "nábožne nasledovať preblahoslavenú Pannu Máriu <br>" +
                    "v rozjímaní o Kristovom utrpení; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, aby sme na jej príhovor v týchto dňoch <br>" +
                    "pevnejšie priľnuli k tvojmu jednorodenému Synovi <font color='#B71C1C'>—</font><br>" +
                    "a získali plnosť jeho milosti. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby sme mohli <br>" +
                            "vždy dôstojne slúžiť pri tvojom oltári <font color='#B71C1C'>—</font><br>" +
                            "a vytrvalou účasťou na obete tvojho Syna <br>" +
                            "dosiahli večnú spásu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, daj, aby nám obeta, z ktorej sme prijímali, <font color='#B71C1C'>*</font><br>" +
                            "poskytovala ustavičnú ochranu <font color='#B71C1C'>—</font><br>" +
                            "a odvrátila od nás všetko škodlivé. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"56", "Bože, ty zo všetkých, ktorí sa znovuzrodili v Kristovi, <br>" +
                    "utváraš vyvolený rod a kráľovské kňazstvo; <font color='#B71C1C'>*</font><br>" +
                    "daj, nech si žiadame a konáme, čo prikazuješ, <font color='#B71C1C'>—</font><br>" +
                    "aby tvoj ľud, povolaný k večnosti, <br>" +
                    "bol zjednotený vo viere a láske. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech sú ti milé naše pôstne dary, <font color='#B71C1C'>*</font><br>" +
                            "nech nás očistia, obnovia v nás tvoju milosť <font color='#B71C1C'>—</font><br>" +
                            "a privedú nás do večného života. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, ty nás živíš <br>" +
                            "presvätým Telom a Krvou svojho Syna; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "daj nám aj účasť na svojom božskom živote. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"60", "Všemohúci a večný Bože, <br>" +
                    "ty si dal ľudstvu vzor poníženosti v našom Spasiteľovi, <br>" +
                    "keď sa z tvojej vôle stal človekom a zomrel na kríži; <font color='#B71C1C'>*</font><br>" +
                    "Láskavo nám pomáhaj, <br>" +
                    "aby sme nasledovali jeho príklad v utrpení, <font color='#B71C1C'>—</font><br>" +
                    "a tak mali účasť na jeho zmŕtvychvstaní.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, pre umučenie tvojho jednorodeného Syna <br>" +
                            "preukáž nám svoje zľutovanie, <br>" +
                            "ktoré si nezasluhujeme svojimi skutkami, <font color='#B71C1C'>*</font><br>" +
                            "ale očakávame ho od tvojho milosrdenstva <font color='#B71C1C'>—</font><br>" +
                            "ako ovocie tejto vznešenej obety.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás svätými darmi <br>" +
                            "a smrťou svojho Syna si nás upevnil <br>" +
                            "vo viere a nádeji; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby sme skrze jeho zmŕtvychvstanie <br>" +
                            "dosiahli to, po čom túžime.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"61", "Všemohúci Bože, pretože sme slabí a klesáme, <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "nech nás posilňuje umučenie <br>" +
                    "tvojho jednorodeného Syna.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo zhliadni na sväté tajomstvá, ktoré slávime, <font color='#B71C1C'>*</font><br>" +
                            "aby obeta, ktorou si milostivo <br>" +
                            "zrušil nad nami rozsudok, <font color='#B71C1C'>—</font><br>" +
                            "nám zaistila večný život.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "navštív svoj ľud a zhliadni na naše srdcia, <br>" +
                            "ktoré sa ti zasväcujú týmito svätými tajomstvami, <font color='#B71C1C'>*</font><br>" +
                            "aby sme si s tvojou pomocou <br>" +
                            "zachovali účinky sviatosti, <font color='#B71C1C'>—</font><br>" +
                            "ktorú sme prijali ako tvoj vzácny dar. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"62", "Všemohúci a večný Bože, <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám tak sláviť <br>" +
                    "tajomstvo Pánovho utrpenia a smrti, <font color='#B71C1C'>—</font><br>" +
                    "aby sme dosiahli odpustenie hriechov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo zhliadni na obetu svojho ľudu, <font color='#B71C1C'>*</font><br>" +
                            "a keďže nám už teraz dávaš účasť na svätých daroch, <font color='#B71C1C'>—</font><br>" +
                            "dopraj, aby sme ich dosiahli v plnej miere vo večnosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás spásonosnými darmi; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby nám táto sviatosť, ktorou nás živíš na pozemskej púti, <br>" +
                            "zaistila účasť na večnom živote.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"63", "Bože, ty si poslal svojho Syna, <br>" +
                    "aby za nás zomrel na kríži <br>" +
                    "a vyslobodil nás z moci odvekého nepriateľa; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ako tvoji služobníci, <br>" +
                    "získali milosť zmŕtvychvstania.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby nám tajomstvo <br>" +
                            "umučenia tvojho Syna, ktoré nábožne slávime, <font color='#B71C1C'>—</font><br>" +
                            "prinieslo ovocie nábožnosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "prosíme ťa, posilňuj nás vo viere, <font color='#B71C1C'>*</font><br>" +
                            "že pre časnú smrť tvojho Syna, <br>" +
                            "o ktorej svedčia vznešené tajomstvá, <font color='#B71C1C'>—</font><br>" +
                            "dal si nám večný život.<br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] velkanocModlitby = {
            {"10", "Bože, ty si skrze svojho jednorodeného Syna <br>" +
                    "dnešného dňa zvíťazil nad smrťou <br>" +
                    "a otvoril si nám bránu do večnosti; <font color='#B71C1C'>*</font><br>" +
                    "preto s radosťou slávime <br>" +
                    "jeho zmŕtvychvstanie a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "obnov nás Duchom Svätým, <br>" +
                    "aby sme povstali k novému životu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Milostivý Bože, <font color='#B71C1C'>*</font><br>" +
                            "s veľkonočnou radosťou <br>" +
                            "ti prinášame dary na obetu, <font color='#B71C1C'>—</font><br>" +
                            "ktorou sa tvoja Cirkev<br>" +
                            "podivuhodne obrodzuje a zveľaďuje.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "ustavične ochraňuj svoju Cirkev <br>" +
                            "s otcovskou priazňou, <font color='#B71C1C'>*</font><br>" +
                            "aby obnovená veľkonočnými sviatosťami <font color='#B71C1C'>—</font><br>" +
                            "dosiahla slávu zmŕtvychvstania.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "Bože, ty zveľaďuješ svoju Cirkev <br>" +
                    "stále novým potomstvom; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sa tvoji služobníci <br>" +
                    "v živote pridŕžali sviatosti, <br>" +
                    "ktorú s vierou prijali.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "láskavo prijmi dary svojho ľudu <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme vyznávaním tvojho mena<br>" +
                            "a znovuzrodením v krste <br>" +
                            "dosiahli večnú blaženosť.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech naše duše prekypujú <br>" +
                            "milosťou veľkonočných sviatostí, <font color='#B71C1C'>*</font><br>" +
                            "a keďže si nás priviedol <br>" +
                            "na cestu večnej spásy, <font color='#B71C1C'>—</font><br>" +
                            "urob nás hodnými tvojich darov.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"12", "Bože, ty si nás vnútorne obnovil <br>" +
                    "veľkonočnými tajomstvami; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, sprevádzaj nás svojou milosťou <br>" +
                    "a veď nás k dokonalej slobode, <font color='#B71C1C'>—</font><br>" +
                    "aby naša terajšia radosť <br>" +
                    "z Kristovho zmŕtvychvstania <br>" +
                    "vyvrcholila v nebeskej blaženosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj nám, aby sme si uchovali <br>" +
                            "veľkonočné milosti <font color='#B71C1C'>—</font><br>" +
                            "a dosiahli večnú radosť.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "ty si nám udelil vzácnu milosť krstu; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, ustavične pretváraj naše srdcia, <font color='#B71C1C'>—</font><br>" +
                            "aby sme si zaslúžili večnú blaženosť.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"13", "Bože, ty nás každoročne potešuješ <br>" +
                    "výročnou oslavou Pánovho zmŕtvychvstania; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby nás slávenie pominuteľných sviatkov <br>" +
                    "priviedlo do večnej radosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "prijmi dary na slávenie <br>" +
                            "obety nášho vykúpenia <font color='#B71C1C'>—</font><br>" +
                            "a láskavo nám daruj <br>" +
                            "zdravie duše i tela.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, očistil si nás <br>" +
                            "od všetkých chýb minulosti; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby nás dôstojné prijatie sviatosti tvojho Syna <br>" +
                            "pretvorilo na nových ľudí.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14", "Bože, ty si zjednotil rozmanité národy <br>" +
                    "vo vyznávaní tvojho mena; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby všetkých, <br>" +
                    "čo sa znovuzrodili v krstnom prameni, <font color='#B71C1C'>—</font><br>" +
                    "spájala živá viera a činorodá láska.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo prijmi naše obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "ktoré ti prinášame s vďakou za novopokrstených <font color='#B71C1C'>—</font><br>" +
                            "a s nádejou na trvalú nebeskú odmenu.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, vypočuj naše prosby, <font color='#B71C1C'>*</font><br>" +
                            "aby nás účasť na svätých tajomstvách <br>" +
                            "nášho vykúpenia posilňovala v tomto živote <font color='#B71C1C'>—</font><br>" +
                            "a priviedla do večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"15", "Všemohúci a večný Bože, veľkonočným tajomstvom <br>" +
                    "si uzavrel s ľudstvom zmluvu zmierenia; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme svojím životom dosvedčovali vieru, <font color='#B71C1C'>—</font><br>" +
                    "ktorú vyznávame slávením veľkonočných sviatkov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, premeň tieto obetné dary <br>" +
                            "na veľkonočnú sviatosť a pretvor aj naše srdcia, <font color='#B71C1C'>*</font><br>" +
                            "aby sme sa odpútali od pozemských náklonností <font color='#B71C1C'>—</font><br>" +
                            "a zahoreli túžbou po veciach nebeských.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "ustavičnou láskou ochraňuj svoj ľud, <br>" +
                            "ktorý si vykúpil smrťou svojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme sa tešili z jeho zmŕtvychvstania.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"16", "Bože, ty svojou bohatou milosťou <br>" +
                    "rozmnožuješ počet veriacich v teba; <font color='#B71C1C'>*</font><br>" +
                    "láskavo ochraňuj svojich vyvolených, <br>" +
                    "ktorých si znovuzrodil vo sviatosti krstu, <font color='#B71C1C'>—</font><br>" +
                    "a raz ich zaodej rúchom blaženej nesmrteľnosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane,<br>" +
                            "nech nás ustavične sprevádza radosť <br>" +
                            "z týchto veľkonočných tajomstiev, <font color='#B71C1C'>*</font><br>" +
                            "ktorými sa neprestajne uskutočňuje naša spása, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sa nám stali prameňom večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo zhliadni na svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "ktorý si duchovne obnovil nebeskou sviatosťou, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme došli k slávnemu vzkrieseniu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "Nekonečne milosrdný Bože, <br>" +
                    "každoročnou slávnosťou Veľkej noci <br>" +
                    "oživuješ vieru svojho ľudu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, zveľaďuj v nás svoju milosť, <br>" +
                    "aby sme stále hlbšie chápali, <font color='#B71C1C'>—</font><br>" +
                    "akým kúpeľom sme boli očistení, <br>" +
                    "akým Duchom sme boli znovuzrodení <br>" +
                    "a akou krvou sme boli vykúpení.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "láskavo prijmi dary svojho ľudu <font color='#B71C1C'>—</font><br>" +
                            "<font color='#B71C1C'>(</font>i tých, čo sa krstom zrodili k novému životu<font color='#B71C1C'>)</font> <br>" +
                            "a daj, aby sme vyznávaním tvojho mena <br>" +
                            "a znovuzrodením v krste dosiahli večnú blaženosť.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby veľkonočná sviatosť, <br>" +
                            "ktorú sme prijali, <font color='#B71C1C'>—</font><br>" +
                            "neprestajne pôsobila v našich srdciach.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "Všemohúci Bože, <br>" +
                    "obnovil si nás veľkonočným tajomstvom; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme prekonali našu pripútanosť <br>" +
                    "k pozemským veciam <font color='#B71C1C'>—</font><br>" +
                    "a boli sme pretvorení na obraz <br>" +
                    "nášho nebeského Stvoriteľa.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "prijmi dary plesajúcej Cirkvi, <br>" +
                            "ktorej si pripravil svätú veľkonočnú radosť, <font color='#B71C1C'>—</font><br>" +
                            "a priveď ju do večnej blaženosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo zhliadni na svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "ktorý si duchovne obnovil nebeskou sviatosťou, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme došli k slávnemu vzkrieseniu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "pomáhaj nám ohlasovať víťazstvo <br>" +
                    "zmŕtvychvstalého Pána <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme si zaslúžili <br>" +
                    "dosiahnuť dary, ktoré nám prisľúbil.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech nás ustavične sprevádza radosť <br>" +
                            "z týchto veľkonočných tajomstiev, <font color='#B71C1C'>*</font><br>" +
                            "ktorými sa neprestajne uskutočňuje naša spása, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sa nám stali prameňom večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, vypočuj naše prosby, <font color='#B71C1C'>*</font><br>" +
                            "aby nás účasť na svätých tajomstvách <br>" +
                            "nášho vykúpenia posilňovala v tomto živote <font color='#B71C1C'>—</font><br>" +
                            "a priviedla do večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "Pane, každoročne slávime tajomstvá, <br>" +
                    "ktorými si obnovil pôvodnú dôstojnosť človeka, <br>" +
                    "a dal si nám nádej na vzkriesenie; <font color='#B71C1C'>*</font><br>" +
                    "pokorne ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme činorodou láskou <br>" +
                    "dosvedčovali to, čo s vierou slávime.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, pri slávení tejto <br>" +
                            "vznešenej obety nám dávaš účasť <br>" +
                            "na jedinom a najvyššom božstve; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                            "pomáhaj nám dôsledne žiť <br>" +
                            "podľa tvojej pravdy, ktorú sme spoznali.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "dobrotivo ochraňuj svoj ľud, <br>" +
                            "ktorý si nasýtil nebeským pokrmom, <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj mu, aby sa odvrátil od hriechu <font color='#B71C1C'>—</font><br>" +
                            "a prešiel k novému životu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"24", "Bože, ty si spasil svet veľkonočnou obetou; <font color='#B71C1C'>*</font><br>" +
                    "na príhovor nášho veľkňaza <br>" +
                    "Ježiša Krista ťa prosíme, <br>" +
                    "aby si nás pre jeho ľudskú <br>" +
                    "prirodzenosť zmieril so sebou <font color='#B71C1C'>—</font><br>" +
                    "a pre jeho božstvo očistil od hriechov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi naše modlitby, <br>" +
                            "ktorými sprevádzame tieto obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "a láskavo nás očisti, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli dôstojne sláviť <br>" +
                            "sviatosť tvojej lásky.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci a večný Bože, <br>" +
                            "Kristovým zmŕtvychvstaním si nám otvoril <br>" +
                            "cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                            "zveľaďuj v nás účinky veľkonočného tajomstva <font color='#B71C1C'>—</font><br>" +
                            "a naplň naše srdcia silou <br>" +
                            "spásonosného pokrmu, ktorý sme prijali.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"25", "Bože, nádej a svetlo pokorných v duchu; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby sme ti zbožne <br>" +
                    "prednášali svoje modlitby <font color='#B71C1C'>—</font><br>" +
                    "a vždy ťa zvelebovali obetou chvály.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "milostivo prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj nám, aby sme si uchovali <br>" +
                            "veľkonočné milosti <font color='#B71C1C'>—</font><br>" +
                            "a došli do večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "ustavičnou láskou ochraňuj svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "ktorý si vykúpil smrťou svojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme sa tešili <br>" +
                            "z jeho zmŕtvychvstania.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"26", "Prosíme ťa, Pane, <br>" +
                    "osloboď nás spod zákona hriechu, <font color='#B71C1C'>*</font><br>" +
                    "ktorý si v nás zrušil <br>" +
                    "veľkonočným tajomstvom <font color='#B71C1C'>—</font><br>" +
                    "skrze zmŕtvychvstanie svojho Syna Ježiša Krista.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Bože, ty si nám chcel veľkonočným tajomstvom <br>" +
                    "otvoriť bránu milosrdenstva; <font color='#B71C1C'>*</font><br>" +
                    "zhliadni na nás a zmiluj sa nad nami, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy kráčali podľa tvojej vôle <br>" +
                    "a nikdy nezišli z cesty života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo posväť tieto dary, <font color='#B71C1C'>*</font><br>" +
                            "ktoré predstavujú našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                            "a urob aj z nás večný dar pre teba.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme sviatostný pokrm <br>" +
                            "a pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby obeta, ktorú nám tvoj Syn <br>" +
                            "prikázal sláviť na svoju pamiatku, <font color='#B71C1C'>—</font><br>" +
                            "rozmnožila v nás lásku k tebe a k blížnemu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "Bože, nech sa tvoj ľud, <br>" +
                    "duchovne obnovený, stále raduje <font color='#B71C1C'>*</font><br>" +
                    "a nech s pevnou nádejou očakáva <br>" +
                    "túžený deň svojho vzkriesenia, <font color='#B71C1C'>—</font><br>" +
                    "ako sa teraz teší z prijatia do Božej rodiny.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi dary plesajúcej Cirkvi, <font color='#B71C1C'>*</font><br>" +
                            "ktorej si pripravil svätú veľkonočnú radosť, <font color='#B71C1C'>—</font><br>" +
                            "a priveď ju do večnej blaženosti.<br>" +
                            "Skrze Krista, nášho Pána",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo zhliadni na svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "ktorý si duchovne obnovil nebeskou sviatosťou, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme došli k slávnemu vzkrieseniu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "Všemohúci Bože, prosíme ťa, dopraj, <br>" +
                    "aby sme zanechali starý spôsob života <font color='#B71C1C'>*</font><br>" +
                    "a žili podľa príkladu Krista, <font color='#B71C1C'>—</font><br>" +
                    "ktorému sme sa pripodobnili <br>" +
                    "veľkonočnými sviatosťami. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov. ",
                    "Pane, prijmi naše modlitby, <br>" +
                            "ktorými sprevádzame tieto obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "a láskavo nás očisti, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli dôstojne <br>" +
                            "sláviť sviatosť tvojej lásky.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci a večný Bože, <br>" +
                            "Kristovým zmŕtvychvstaním <br>" +
                            "si nám otvoril cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                            "zveľaďuj v nás účinky veľkonočného tajomstva <font color='#B71C1C'>—</font><br>" +
                            "a naplň naše srdcia silou <br>" +
                            "spásonosného pokrmu, ktorý sme prijali.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"32", "Bože, ty otváraš bránu nebeského kráľovstva <br>" +
                    "všetkým, čo sa znovuzrodili <br>" +
                    "z vody a z Ducha Svätého; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, rozmnož v nás svoju milosť, <br>" +
                    "aby sme boli očistení od všetkých hriechov <font color='#B71C1C'>—</font><br>" +
                    "a dosiahli nebeskú blaženosť, <br>" +
                    "ktorú si nám prisľúbil.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi dary plesajúcej Cirkvi, <font color='#B71C1C'>*</font><br>" +
                            "ktorej si pripravil svätú veľkonočnú radosť, <font color='#B71C1C'>—</font><br>" +
                            "a priveď ju do večnej blaženosti.<br>" +
                            "Skrze Krista, nášho Pána",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo zhliadni na svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "ktorý si duchovne obnovil nebeskou sviatosťou, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme došli k slávnemu vzkrieseniu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"33", "Prosíme ťa, Pane, <br>" +
                    "stoj pri svojom ľude, <br>" +
                    "ktorý si obdaril milosťou viery, <font color='#B71C1C'>*</font><br>" +
                    "a dopraj nám vo večnosti účasť <font color='#B71C1C'>—</font><br>" +
                    "na zmŕtvychvstaní tvojho jednorodeného Syna.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech nás ustavične sprevádza <br>" +
                            "radosť z týchto veľkonočných tajomstiev, <font color='#B71C1C'>*</font><br>" +
                            "ktorými sa neprestajne uskutočňuje naša spása, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sa nám stali prameňom večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, vypočuj naše prosby, <font color='#B71C1C'>*</font><br>" +
                            "aby nás účasť na svätých tajomstvách <br>" +
                            "nášho vykúpenia posilňovala v tomto živote <font color='#B71C1C'>—</font><br>" +
                            "a priviedla do večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"34", "Všemohúci a večný Bože, <br>" +
                    "v týchto dňoch vrúcnejšie prežívame <br>" +
                    "a lepšie poznávame tvoju dobrotu, <br>" +
                    "lebo si nás vyslobodil z temnoty bludov; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pomáhaj nám, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa vždy verne pridržiavali tvojej pravdy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, pri slávení tejto <br>" +
                            "vznešenej obety nám dávaš <br>" +
                            "účasť na jedinom a najvyššom božstve; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                            "pomáhaj nám dôsledne žiť <br>" +
                            "podľa tvojej pravdy, ktorú sme spoznali.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "dobrotivo ochraňuj svoj ľud, <br>" +
                            "ktorý si nasýtil nebeským pokrmom, <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj mu, aby sa odvrátil od hriechu <font color='#B71C1C'>—</font><br>" +
                            "a prešiel k novému životu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"35", "Všemohúci Bože, <br>" +
                    "spoznali sme milosť Pánovho zmŕtvychvstania; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme skrze lásku Ducha Svätého <br>" +
                    "povstali k novému životu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "láskavo posväť tieto dary, <br>" +
                            "ktoré predstavujú našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                            "a urob aj z nás večný dar pre teba.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme sviatostný pokrm <br>" +
                            "a pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby obeta, ktorú nám tvoj Syn <br>" +
                            "prikázal sláviť na svoju pamiatku, <font color='#B71C1C'>—</font><br>" +
                            "rozmnožila v nás lásku k tebe a k blížnemu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"36", "Bože, v krstnom prameni <br>" +
                    "dávaš nový život tým, čo veria v teba; <font color='#B71C1C'>*</font><br>" +
                    "ochraňuj všetkých znovuzrodených v Kristovi, <font color='#B71C1C'>—</font><br>" +
                    "aby odolávali útokom bludu <br>" +
                    "a zachovali si dar tvojej milosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "milostivo prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj nám, aby sme si uchovali <br>" +
                            "veľkonočné milosti <font color='#B71C1C'>—</font><br>" +
                            "a došli do večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "ustavičnou láskou ochraňuj svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "ktorý si vykúpil smrťou svojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme sa tešili z jeho zmŕtvychvstania.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"40", "Všemohúci a večný Bože, <br>" +
                    "veď nás stále k nebeskej radosti, <font color='#B71C1C'>*</font><br>" +
                    "aby tvoje pokorné stádo došlo tam, <font color='#B71C1C'>—</font><br>" +
                    "kam nás predišiel náš vznešený <br>" +
                    "pastier Ježiš Kristus.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech nás ustavične sprevádza <br>" +
                            "radosť z týchto veľkonočných tajomstiev, <font color='#B71C1C'>*</font><br>" +
                            "ktorými sa neprestajne uskutočňuje naša spása, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sa nám stali prameňom večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "ako Dobrý pastier láskavo <br>" +
                            "zhliadni na rodinu svojich veriacich <font color='#B71C1C'>*</font><br>" +
                            "a priveď na večné pastviny ovečky <font color='#B71C1C'>—</font><br>" +
                            "vykúpené drahocennou krvou <br>" +
                            "tvojho Syna Ježiša Krista. <br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"41", "Bože, dokonalé svetlo blažených, <br>" +
                    "ty si nám umožnil už tu na zemi <br>" +
                    "sláviť veľkonočné tajomstvá; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa vo večnosti <br>" +
                    "radovali z plnosti tvojej milosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi dary plesajúcej Cirkvi, <font color='#B71C1C'>*</font><br>" +
                            "ktorej si pripravil svätú veľkonočnú radosť, <font color='#B71C1C'>—</font><br>" +
                            "a priveď ju do večnej blaženosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo zhliadni na svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "ktorý si duchovne obnovil nebeskou sviatosťou, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme došli k slávnemu vzkrieseniu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"42", "Všemohúci Bože, <br>" +
                    "oslavujeme tajomstvo Pánovho zmŕtvychvstania <font color='#B71C1C'>*</font><br>" +
                    "a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme plne prežívali radosť z našej spásy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech nás ustavične sprevádza radosť <br>" +
                            "z týchto veľkonočných tajomstiev, <font color='#B71C1C'>*</font><br>" +
                            "ktorými sa neprestajne uskutočňuje naša spása, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sa nám stali prameňom večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, vypočuj naše prosby, <font color='#B71C1C'>*</font><br>" +
                            "aby nás účasť na svätých <br>" +
                            "tajomstvách nášho vykúpenia<br>" +
                            "posilňovala v tomto živote <font color='#B71C1C'>—</font><br>" +
                            "a priviedla do večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"43", "Bože, ty si život veriacich, <br>" +
                    "sláva ponížených a blaženosť spravodlivých; <font color='#B71C1C'>*</font><br>" +
                    "láskavo vypočuj naše pokorné prosby <font color='#B71C1C'>—</font><br>" +
                    "a vyplň našu vrúcnu túžbu po tvojich daroch, <br>" +
                    "ktoré si nám vo svojej štedrosti prisľúbil.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, pri slávení tejto vznešenej obety <br>" +
                            "nám dávaš účasť na jedinom a najvyššom božstve; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                            "pomáhaj nám dôsledne žiť <br>" +
                            "podľa tvojej pravdy, ktorú sme spoznali.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "dobrotivo ochraňuj svoj ľud, <br>" +
                            "ktorý si nasýtil nebeským pokrmom, <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj mu, aby sa odvrátil od hriechu <font color='#B71C1C'>—</font><br>" +
                            "a prešiel k novému životu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"44", "Bože, ty obnovuješ človeka a dávaš <br>" +
                    "mu vyššiu dôstojnosť, ako mal pri stvorení; <font color='#B71C1C'>*</font><br>" +
                    "pre toto nevýslovné <br>" +
                    "tajomstvo tvojej lásky ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "zachovaj vo svojej milosti všetkých, <br>" +
                    "ktorých si znovuzrodil sviatosťou krstu, <br>" +
                    "a sprevádzaj ich svojím požehnaním.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi naše modlitby, <br>" +
                            "ktorými sprevádzame tieto obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "a láskavo nás očisti, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli dôstojne sláviť <br>" +
                            "sviatosť tvojej lásky.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci a večný Bože, <br>" +
                            "Kristovým zmŕtvychvstaním si nám <br>" +
                            "otvoril cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                            "zveľaďuj v nás účinky veľkonočného tajomstva <font color='#B71C1C'>—</font><br>" +
                            "a naplň naše srdcia silou <br>" +
                            "spásonosného pokrmu, ktorý sme prijali.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"45", "Bože, pôvodca našej slobody a spásy, <br>" +
                    "ty si nás vykúpil predrahou krvou svojho Syna; <font color='#B71C1C'>*</font><br>" +
                    "vypočuj naše pokorné prosby <br>" +
                    "a buď zdrojom nášho života, <font color='#B71C1C'>—</font><br>" +
                    "aby sme v tebe vždy nachádzali <br>" +
                    "trvalú radosť a istotu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "milostivo prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj nám, aby sme si uchovali <br>" +
                            "veľkonočné milosti <font color='#B71C1C'>—</font><br>" +
                            "a došli do večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "ustavičnou láskou ochraňuj svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "ktorý si vykúpil smrťou svojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme sa tešili z jeho zmŕtvychvstania.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"46", "Bože, veľkonočnou slávnosťou <br>" +
                    "milostivo dávaš svetu nebeský liek; <font color='#B71C1C'>*</font><br>" +
                    "buď milostivý voči svojej Cirkvi <br>" +
                    "a daj, aby sme prinášali <br>" +
                    "ovocie dobrých skutkov, <font color='#B71C1C'>—</font><br>" +
                    "a tak dosiahli večný život.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo posväť tieto dary, <font color='#B71C1C'>*</font><br>" +
                            "ktoré predstavujú našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                            "a urob aj z nás večný dar pre teba.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme sviatostný pokrm <br>" +
                            "a pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby obeta, ktorú nám tvoj Syn <br>" +
                            "prikázal sláviť na svoju pamiatku, <font color='#B71C1C'>—</font><br>" +
                            "rozmnožila v nás lásku k tebe a k blížnemu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"50", "Všemohúci a večný Bože, <br>" +
                    "neprestajne v nás uskutočňuj veľkonočné tajomstvo, <font color='#B71C1C'>*</font><br>" +
                    "a keďže si nás obnovil svätým krstom, <font color='#B71C1C'>—</font><br>" +
                    "daj, aby sme pod tvojou ochranou <br>" +
                    "prinášali hojné ovocie dobrých skutkov <br>" +
                    "a dosiahli radosť večného života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, pri slávení tejto vznešenej obety <br>" +
                            "nám dávaš účasť na jedinom <br>" +
                            "a najvyššom božstve; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                            "pomáhaj nám dôsledne žiť podľa <br>" +
                            "tvojej pravdy, ktorú sme spoznali.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "dobrotivo ochraňuj svoj ľud, <br>" +
                            "ktorý si nasýtil nebeským pokrmom, <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj mu, aby sa odvrátil od hriechu <font color='#B71C1C'>—</font><br>" +
                            "a prešiel k novému životu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"51", "Prosíme ťa, Pane, <br>" +
                    "neustále nás ochraňuj svojou pravicou, <font color='#B71C1C'>*</font><br>" +
                    "aby nás zmŕtvychvstanie tvojho jednorodeného Syna <br>" +
                    "chránilo od každého zla <font color='#B71C1C'>—</font><br>" +
                    "a posilňovalo nebeskými darmi.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi naše modlitby, <br>" +
                            "ktorými sprevádzame tieto obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "a láskavo nás očisti, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli dôstojne sláviť <br>" +
                            "sviatosť tvojej lásky.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci a večný Bože, <br>" +
                            "Kristovým zmŕtvychvstaním si nám <br>" +
                            "otvoril cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                            "zveľaďuj v nás účinky veľkonočného tajomstva <font color='#B71C1C'>—</font><br>" +
                            "a naplň naše srdcia silou <br>" +
                            "spásonosného pokrmu, ktorý sme prijali.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"52", "Bože, zmŕtvychvstaním svojho Syna <br>" +
                    "znova si nám otvoril cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, daj nám pevnú vieru a nádej, <font color='#B71C1C'>—</font><br>" +
                    "aby sme nikdy nepochybovali, <br>" +
                    "že sa splnia tvoje prisľúbenia.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi dary plesajúcej Cirkvi, <font color='#B71C1C'>*</font><br>" +
                            "ktorej si pripravil svätú veľkonočnú radosť, <font color='#B71C1C'>—</font><br>" +
                            "a priveď ju do večnej blaženosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo zhliadni na svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "ktorý si duchovne obnovil nebeskou sviatosťou, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme došli k slávnemu vzkrieseniu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"53", "Bože, ty miluješ nevinnosť <br>" +
                    "a navraciaš ju kajúcim hriešnikom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, pripútaj k sebe naše srdcia, <br>" +
                    "aby sme sa nikdy neodvrátili <br>" +
                    "od svetla tvojej pravdy, <font color='#B71C1C'>—</font><br>" +
                    "ku ktorej si nás priviedol z temnôt nevery.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech nás ustavične sprevádza radosť <br>" +
                            "z týchto veľkonočných tajomstiev, <font color='#B71C1C'>*</font><br>" +
                            "ktorými sa neprestajne uskutočňuje naša spása, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sa nám stali prameňom večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, vypočuj naše prosby, <font color='#B71C1C'>*</font><br>" +
                            "aby nás účasť na svätých tajomstvách <br>" +
                            "nášho vykúpenia posilňovala v tomto živote <font color='#B71C1C'>—</font><br>" +
                            "a priviedla do večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"54", "Bože, tvoja láska nás prenáša <br>" +
                    "z hriechu do milosti a z biedy do blaženosti; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, upevni v nás dielo tvojej lásky, <font color='#B71C1C'>—</font><br>" +
                    "aby sme všetci, ktorých si ospravedlnil vierou, <br>" +
                    "vytrvali v dobrom až do konca.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, pri slávení tejto vznešenej obety <br>" +
                            "nám dávaš účasť na jedinom a najvyššom božstve; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                            "pomáhaj nám dôsledne žiť <br>" +
                            "podľa tvojej pravdy, ktorú sme spoznali.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "dobrotivo ochraňuj svoj ľud, <br>" +
                            "ktorý si nasýtil nebeským pokrmom, <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj mu, aby sa odvrátil od hriechu <font color='#B71C1C'>—</font><br>" +
                            "a prešiel k novému životu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"55", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "pomôž nám stvárňovať náš život <br>" +
                    "podľa veľkonočného tajomstva,<br>" +
                    "ktoré s radosťou slávime, <font color='#B71C1C'>—</font><br>" +
                    "aby nás sila Kristovho zmŕtvychvstania <br>" +
                    "ochraňovala a viedla k spáse.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo posväť tieto dary, <font color='#B71C1C'>*</font><br>" +
                            "ktoré predstavujú našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                            "a urob aj z nás večný dar pre teba.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme <br>" +
                            "sviatostný pokrm a pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby obeta, ktorú nám tvoj Syn <br>" +
                            "prikázal sláviť na svoju pamiatku, <font color='#B71C1C'>—</font><br>" +
                            "rozmnožila v nás lásku k tebe a k blížnemu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"56", "Všemohúci a večný Bože, <br>" +
                    "vo sviatosti krstu si nám dal účasť <br>" +
                    "na nebeskom živote a ospravedlnením si nás uschopnil <br>" +
                    "pre blaženú nesmrteľnosť; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s tvojou pomocou <br>" +
                    "dosiahli plnosť života v tvojej sláve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "milostivo prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj nám, aby sme si uchovali <br>" +
                            "veľkonočné milosti <font color='#B71C1C'>—</font><br>" +
                            "a došli do večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "ustavičnou láskou ochraňuj svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "ktorý si vykúpil smrťou svojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme sa tešili z jeho zmŕtvychvstania.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"60", "Všemohúci Bože, <br>" +
                    "dopraj nám sláviť s úprimnou horlivosťou <br>" +
                    "tieto radostné dni na oslavu vzkrieseného Pána, <font color='#B71C1C'>*</font><br>" +
                    "aby sa jeho zmŕtvychvstanie, <br>" +
                    "ktoré opätovne slávime, <font color='#B71C1C'>—</font><br>" +
                    "ustavične prejavovalo v našich skutkoch.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi naše modlitby, <br>" +
                            "ktorými sprevádzame tieto obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "a láskavo nás očisti, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli dôstojne sláviť <br>" +
                            "sviatosť tvojej lásky.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci a večný Bože, <br>" +
                            "Kristovým zmŕtvychvstaním <br>" +
                            "si nám otvoril cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                            "zveľaďuj v nás účinky veľkonočného tajomstva <font color='#B71C1C'>—</font><br>" +
                            "a naplň naše srdcia silou <br>" +
                            "spásonosného pokrmu, ktorý sme prijali.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"61", "Milosrdný Bože, <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sa v našom živote <br>" +
                    "vždy prejavovali milosti, <font color='#B71C1C'>—</font><br>" +
                    "ktoré si nám udelil pri slávení <br>" +
                    "veľkonočných sviatkov.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi dary plesajúcej Cirkvi, <font color='#B71C1C'>*</font><br>" +
                            "ktorej si pripravil svätú veľkonočnú radosť, <font color='#B71C1C'>—</font><br>" +
                            "a priveď ju do večnej blaženosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo zhliadni na svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "ktorý si duchovne obnovil nebeskou sviatosťou, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme došli k slávnemu vzkrieseniu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"62", "Všemohúci a večný Bože, <br>" +
                    "prosíme ťa, dopraj, <font color='#B71C1C'>*</font><br>" +
                    "aby sme mali opravdivú účasť <font color='#B71C1C'>—</font><br>" +
                    "na zmŕtvychvstaní tvojho Syna Ježiša Krista.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech nás ustavične sprevádza radosť <br>" +
                            "z týchto veľkonočných tajomstiev, <font color='#B71C1C'>*</font><br>" +
                            "ktorými sa neprestajne uskutočňuje naša spása, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sa nám stali prameňom večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, vypočuj naše prosby, <font color='#B71C1C'>*</font><br>" +
                            "aby nás účasť na svätých <br>" +
                            "tajomstvách nášho vykúpenia<br>" +
                            "posilňovala v tomto živote <font color='#B71C1C'>—</font><br>" +
                            "a priviedla do večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"63", "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                    "daj, nech tak slávime tajomstvo <br>" +
                    "zmŕtvychvstania tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                    "aby sme si zaslúžili radovať sa <br>" +
                    "so všetkými svätými, keď príde v sláve.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, pri slávení tejto vznešenej obety <br>" +
                            "nám dávaš účasť na jedinom a najvyššom božstve; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                            "pomáhaj nám dôsledne žiť <br>" +
                            "podľa tvojej pravdy, ktorú sme spoznali.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "dobrotivo ochraňuj svoj ľud, <br>" +
                            "ktorý si nasýtil nebeským pokrmom, <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj mu, aby sa odvrátil od hriechu <font color='#B71C1C'>—</font><br>" +
                            "a prešiel k novému životu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"64", "Bože, ty dávaš <br>" +
                    "svojmu ľudu účasť na vykúpení; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, dopraj, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa vždy tešili <br>" +
                    "zo slávneho zmŕtvychvstania <br>" +
                    "nášho Pána Ježiša Krista.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, prijmi naše modlitby, <br>" +
                            "ktorými sprevádzame tieto obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "a láskavo nás očisti, <font color='#B71C1C'>—</font><br>" +
                            "aby sme mohli dôstojne sláviť <br>" +
                            "sviatosť tvojej lásky.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci a večný Bože, <br>" +
                            "Kristovým zmŕtvychvstaním <br>" +
                            "si nám otvoril cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                            "zveľaďuj v nás účinky veľkonočného tajomstva <font color='#B71C1C'>—</font><br>" +
                            "a naplň naše srdcia silou <br>" +
                            "spásonosného pokrmu, ktorý sme prijali.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"65", "Bože, Kristovým zmŕtvychvstaním <br>" +
                    "si nám otvoril cestu do večného života; <font color='#B71C1C'>*</font><br>" +
                    "povznes naše srdcia k Pôvodcovi našej spásy, <br>" +
                    "ktorý sedí po tvojej pravici, <font color='#B71C1C'>—</font><br>" +
                    "a keď náš Spasiteľ príde vo svojej sláve, <br>" +
                    "zaodej rúchom blaženej nesmrteľnosti <br>" +
                    "všetkých, ktorých si znovuzrodil svätým krstom.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "milostivo prijmi naše obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj nám, aby sme si uchovali <br>" +
                            "veľkonočné milosti <font color='#B71C1C'>—</font><br>" +
                            "a došli do večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "ustavičnou láskou ochraňuj svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "ktorý si vykúpil smrťou svojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby sme sa tešili <br>" +
                            "z jeho zmŕtvychvstania.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"66", "Bože, tvoj Syn <br>" +
                    "pred svojím nanebovstúpením <br>" +
                    "prisľúbil apoštolom Ducha Svätého; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, udeľ aj nám dary svojho Ducha, <font color='#B71C1C'>—</font><br>" +
                    "ako oni dostali rozmanité dary nebeskej múdrosti.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo posväť tieto dary, <font color='#B71C1C'>*</font><br>" +
                            "ktoré predstavujú našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                            "a urob aj z nás večný dar pre teba.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme <br>" +
                            "sviatostný pokrm a pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby obeta, ktorú nám tvoj Syn <br>" +
                            "prikázal sláviť na svoju pamiatku, <font color='#B71C1C'>—</font><br>" +
                            "rozmnožila v nás lásku k tebe a k blížnemu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"70", "Pane, veríme, že Spasiteľ ľudského <br>" +
                    "pokolenia prebýva s tebou v sláve; <font color='#B71C1C'>*</font><br>" +
                    "láskavo vypočuj naše prosby <font color='#B71C1C'>—</font><br>" +
                    "a daj, aby sme pociťovali, že je s nami <br>" +
                    "po všetky dni až do skončenia sveta,<br>" +
                    "ako nám to prisľúbil.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Pane, prijmi naše modlitby a obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby nás posvätná služba, <br>" +
                            "ktorú nábožne konáme, <font color='#B71C1C'>—</font><br>" +
                            "priviedla do nebeskej blaženosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Vypočuj nás, Bože, <br>" +
                            "pôvodca našej spásy, a upevni nás v nádeji, <font color='#B71C1C'>*</font><br>" +
                            "že pôsobením týchto svätých tajomstiev <br>" +
                            "osláviš celé telo Cirkvi, <font color='#B71C1C'>—</font><br>" +
                            "ako si oslávil jej Hlavu, Ježiša Krista.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"71", "Prosíme ťa, Pane, <br>" +
                    "nech zostúpi na nás sila Ducha Svätého, <font color='#B71C1C'>*</font><br>" +
                    "aby sme sa vždy podriadili tvojej vôli <font color='#B71C1C'>—</font><br>" +
                    "a plnili ju so synovskou oddanosťou.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nás táto nepoškvrnená obeta očistí <font color='#B71C1C'>—</font><br>" +
                            "a vleje nám do sŕdc silu nebeskej milosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <br>" +
                            "dobrotivo ochraňuj svoj ľud, <br>" +
                            "ktorý si nasýtil nebeským pokrmom, <font color='#B71C1C'>*</font><br>" +
                            "a pomáhaj mu, aby sa odvrátil od hriechu <font color='#B71C1C'>—</font><br>" +
                            "a prešiel k novému životu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"72", "Všemohúci a milosrdný Bože, <br>" +
                    "prosíme ťa, zošli nám Ducha Svätého, <font color='#B71C1C'>*</font><br>" +
                    "aby v nás prebýval svojou milosťou <font color='#B71C1C'>—</font><br>" +
                    "a urobil nás chrámom svojej slávy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi naše modlitby a obetné dary <font color='#B71C1C'>*</font><br>" +
                            "a daj, aby nás posvätná <br>" +
                            "služba, ktorú nábožne konáme, <font color='#B71C1C'>—</font><br>" +
                            "priviedla do nebeskej blaženosti.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, prijali sme <br>" +
                            "sviatostný pokrm a pokorne prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby obeta, ktorú nám tvoj Syn <br>" +
                            "prikázal sláviť na svoju pamiatku, <font color='#B71C1C'>—</font><br>" +
                            "rozmnožila v nás lásku k tebe a k blížnemu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"73", "Milosrdný Bože, <br>" +
                    "pomáhaj svojej Cirkvi, ktorú zhromaždil Duch Svätý, <font color='#B71C1C'>*</font><br>" +
                    "aby ti bola oddaná celým srdcom <font color='#B71C1C'>—</font><br>" +
                    "a zachovala svornosť a jednotu.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi obetu, ktorú ti prinášame <br>" +
                            "podľa tvojho ustanovenia, <font color='#B71C1C'>*</font><br>" +
                            "a týmto svätým tajomstvom, <br>" +
                            "ktoré slávime ako prejav našej povinnej oddanosti, <font color='#B71C1C'>—</font><br>" +
                            "posväcuj svoj vykúpený ľud.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "Najsvätejšou sviatosťou, ktorú prijímame, <br>" +
                            "zveľaďuj v nás svoju milosť <font color='#B71C1C'>—</font><br>" +
                            "a jej očisťujúcou silou pripravuj nás <br>" +
                            "na ďalšie prijatie tohto veľkého daru.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"74", "Prosíme ťa, Pane, <br>" +
                    "nech nás Duch Svätý naplní svojimi darmi, <font color='#B71C1C'>*</font><br>" +
                    "aby sme vždy zmýšľali tak, ako sa páči tebe, <font color='#B71C1C'>—</font><br>" +
                    "a konali podľa tvojej vôle.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "láskavo posväť tieto dary, <font color='#B71C1C'>*</font><br>" +
                            "ktoré predstavujú našu duchovnú obetu, <font color='#B71C1C'>—</font><br>" +
                            "a urob aj z nás večný dar pre teba.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech nás vnútorne posilnia <br>" +
                            "a obnovia sväté tajomstvá, ktoré sme prijali, <font color='#B71C1C'>—</font><br>" +
                            "aby sme si zaslúžili prijať dary tvojho Ducha.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"75", "Bože, oslávením Ježiša Krista <br>" +
                    "a zoslaním Ducha Svätého <br>" +
                    "otvoril si nám bránu večného života; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, aby nám prijatie <br>" +
                    "tohto veľkého daru pomáhalo rásť vo viere <font color='#B71C1C'>—</font><br>" +
                    "a prehlbovalo našu nábožnosť.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "zhliadni na obetné dary svojho ľudu <font color='#B71C1C'>*</font><br>" +
                            "a očisti naše srdcia príchodom Ducha Svätého, <font color='#B71C1C'>—</font><br>" +
                            "aby sa ti páčila naša obeta.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, tvoja sviatosť nás očisťuje <br>" +
                            "od previnení a je nám duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                            "aby nás jej milostivé prijímanie <br>" +
                            "priviedlo do večného života.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"76", "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "nech veľkonočné tajomstvo, <br>" +
                    "ktoré sme slávili, prenikne naše zmýšľanie <font color='#B71C1C'>—</font><br>" +
                    "a prejavuje sa v našom živote.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech príde Duch Svätý <br>" +
                            "a pripraví naše srdcia na eucharistickú obetu, <font color='#B71C1C'>—</font><br>" +
                            "lebo v ňom máme odpustenie všetkých hriechov.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, ty si viedol svoj ľud <br>" +
                            "od starozákonných obradov <br>" +
                            "k novozákonným sviatostiam; <font color='#B71C1C'>*</font><br>" +
                            "vrúcne ťa prosíme, <br>" +
                            "pomáhaj nám odložiť starý spôsob života <font color='#B71C1C'>—</font><br>" +
                            "a vnútorným posvätením si obnoviť srdcia. <br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] adventModlitby = {
            {"10", "Prosíme ťa, všemohúci Bože, <br>" +
                    "daj nám ochotu konať dobré skutky <br>" +
                    "a pomáhaj nám kráčať v ústrety Kristovi tak, <font color='#B71C1C'>*</font><br>" +
                    "aby nás pri svojom druhom príchode postavil po svojej pravici <font color='#B71C1C'>—</font><br>" +
                    "a voviedol do nebeského kráľovstva. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi obetné dary, ktoré ti prinášame z toho, <br>" +
                            "čo nám udelila tvoja dobrota; <font color='#B71C1C'>*</font><br>" +
                            "a čo ti teraz so synovskou oddanosťou obetujeme, <font color='#B71C1C'>—</font><br>" +
                            "nech nám prinesie večnú spásu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, nech je nám na osoh <br>" +
                            "účasť na tejto sviatostnej hostine, <font color='#B71C1C'>*</font><br>" +
                            "pri ktorej nás už v tomto pominuteľnom svete <br>" +
                            "učíš milovať veci nebeské <font color='#B71C1C'>—</font><br>" +
                            "a hľadať hodnoty trváce. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "Pane a Bože náš, pomôž nám bedlivo očakávať <br>" +
                    "príchod tvojho Syna Ježiša Krista; <font color='#B71C1C'>*</font><br>" +
                    "a keď príde a zaklope, nech nás nájde bdieť v modlitbách <font color='#B71C1C'>—</font><br>" +
                    "a jasať na jeho slávu. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, prijmi obetné dary, <br>" +
                            "ktoré ti prinášame z toho, čo nám udelila tvoja dobrota; <font color='#B71C1C'>*</font><br>" +
                            "a čo ti teraz so synovskou oddanosťou obetujeme, <font color='#B71C1C'>—</font><br>" +
                            "nech nám prinesie večnú spásu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, nech je nám na osoh <br>" +
                            "účasť na tejto sviatostnej hostine, <font color='#B71C1C'>*</font> <br>" +
                            "pri ktorej nás už v tomto pominuteľnom svete <br>" +
                            "učíš milovať veci nebeské <font color='#B71C1C'>—</font><br>" +
                            "a hľadať hodnoty trváce. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"12", "Pane a Bože náš, <br>" +
                    "dobrotivo vypočuj naše pokorné prosby <br>" +
                    "a láskavo nám pomáhaj v našich slabostiach, <font color='#B71C1C'>*</font><br>" +
                    "aby nás povzbudila prítomnosť tvojho prichádzajúceho Syna, <font color='#B71C1C'>—</font><br>" +
                    "a tak sme sa chránili pred nebezpečenstvami hriechu. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov. ",
                    "Prosíme ťa, Pane, <br>" +
                            "nech ťa uzmieria naše pokorné modlitby a obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "a pretože sa nemôžeme spoliehať na vlastné zásluhy, <font color='#B71C1C'>—</font><br>" +
                            "pomáhaj nám svojou milosrdnou láskou. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <br>" +
                            "daj, aby sme sa účasťou na tejto sviatosti <br>" +
                            "naučili správne hodnotiť pozemské veci <font color='#B71C1C'>—</font><br>" +
                            "a milovať hodnoty nebeské. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"13", "Prosíme ťa, Pane a Bože náš, <br>" +
                    "svojou božskou mocou priprav naše srdcia, <font color='#B71C1C'>*</font><br>" +
                    "aby nás tvoj Syn Ježiš Kristus pri svojom druhom príchode <br>" +
                    "uznal za hodných nebeskej hostiny <font color='#B71C1C'>—</font><br>" +
                    "a mohli sme prijať nebeský pokrm, ktorý on sám podáva. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "dopraj nám neustále ti prinášať našu obetu, <font color='#B71C1C'>*</font><br>" +
                            "aby zavŕšila to, čo sa začalo vo svätých tajomstvách, <font color='#B71C1C'>—</font><br>" +
                            "a uskutočňovala v nás dielo spásy.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, láskavo dopraj, <font color='#B71C1C'>*</font><br>" +
                            "aby nás tento nebeský pokrm očistil od hriechov, <font color='#B71C1C'>—</font><br>" +
                            "a tak nás pripravil na blížiace sa sviatky. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"14", "Prosíme ťa, Pane, <br>" +
                    "ukáž svoju moc a pomáhaj nám svojou božskou silou, <font color='#B71C1C'>*</font><br>" +
                    "aby tvoja milosrdná láska urýchlila to, <font color='#B71C1C'>—</font><br>" +
                    "čomu bránia naše hriechy.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi obetné dary, ktoré ti prinášame z toho, <br>" +
                            "čo nám udelila tvoja dobrota; <font color='#B71C1C'>*</font><br>" +
                            "a čo ti teraz so synovskou oddanosťou obetujeme, <font color='#B71C1C'>—</font><br>" +
                            "nech nám prinesie večnú spásu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, nech je nám na osoh <br>" +
                            "účasť na tejto sviatostnej hostine, <font color='#B71C1C'>*</font><br>" +
                            "pri ktorej nás už v tomto pominuteľnom svete <br>" +
                            "učíš milovať veci nebeské <font color='#B71C1C'>—</font><br>" +
                            "a hľadať hodnoty trváce. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"15", "Prejav, Pane, svoju moc a príď, <font color='#B71C1C'>*</font><br>" +
                    "aby nás tvoja prítomnosť vyslobodila z nebezpečenstiev hriechu <font color='#B71C1C'>—</font><br>" +
                    "a tvoja milosrdná láska priviedla k spáse. <br>" +
                    "Lebo ty si Boh a žiješ a kraľuješ s Bohom Otcom <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech ťa uzmieria naše pokorné modlitby a obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "a pretože sa nemôžeme spoliehať na vlastné zásluhy, <font color='#B71C1C'>—</font><br>" +
                            "pomáhaj nám svojou milosrdnou láskou. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <br>" +
                            "daj, aby sme sa účasťou na tejto sviatosti <br>" +
                            "naučili správne hodnotiť pozemské veci <font color='#B71C1C'>—</font><br>" +
                            "a milovať hodnoty nebeské.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"16", "Bože, ty si poslal na svet svojho jednorodeného Syna, <br>" +
                    "aby vyslobodil ľudské pokolenie z otroctva hriechu; <font color='#B71C1C'>*</font><br>" +
                    "túžobne očakávame jeho príchod a prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                    "zahrň nás svojou nebeskou milosťou, <br>" +
                    "aby sme získali dar pravej slobody. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, dopraj nám <br>" +
                            "neustále ti prinášať našu obetu, <font color='#B71C1C'>*</font><br>" +
                            "aby zavŕšila to, čo sa začalo vo svätých tajomstvách, <font color='#B71C1C'>—</font><br>" +
                            "a uskutočňovala v nás dielo spásy.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, láskavo dopraj, <font color='#B71C1C'>*</font><br>" +
                            "aby nás tento nebeský pokrm očistil od hriechov, <font color='#B71C1C'>—</font><br>" +
                            "a tak nás pripravil na blížiace sa sviatky. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "Všemohúci a milosrdný Bože, <br>" +
                    "nedopusť, aby nám starosti o pozemské veci <br>" +
                    "prekážali ísť v ústrety tvojmu Synovi, <font color='#B71C1C'>*</font><br>" +
                    "ale nech nás dar nebeskej múdrosti <font color='#B71C1C'>—</font><br>" +
                    "privedie do spoločenstva s ním. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech ťa uzmieria naše pokorné modlitby a obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "a pretože sa nemôžeme spoliehať na vlastné zásluhy, <font color='#B71C1C'>—</font><br>" +
                            "pomáhaj nám svojou milosrdnou láskou. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <br>" +
                            "daj, aby sme sa účasťou na tejto sviatosti <br>" +
                            "naučili správne hodnotiť pozemské veci <font color='#B71C1C'>—</font><br>" +
                            "a milovať hodnoty nebeské. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "Prosíme ťa, Pane, <br>" +
                    "nech k tebe vystúpi naša pokorná modlitba, <font color='#B71C1C'>*</font><br>" +
                    "aby sme v oddanej službe a s čistou dušou <font color='#B71C1C'>—</font><br>" +
                    "mohli sláviť veľké tajomstvo vtelenia <br>" +
                    "tvojho jednorodeného Syna.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, prijmi obetné dary, <br>" +
                            "ktoré ti prinášame z toho, čo nám udelila tvoja dobrota; <font color='#B71C1C'>*</font><br>" +
                            "a čo ti teraz so synovskou oddanosťou obetujeme, <font color='#B71C1C'>—</font><br>" +
                            "nech nám prinesie večnú spásu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, nech je nám na osoh <br>" +
                            "účasť na tejto sviatostnej hostine, <font color='#B71C1C'>*</font><br>" +
                            "pri ktorej nás už v tomto pominuteľnom svete <br>" +
                            "učíš milovať veci nebeské <font color='#B71C1C'>—</font><br>" +
                            "a hľadať hodnoty trváce. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "Bože, ty si všetkým končinám zeme prisľúbil svoju spásu; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s radosťou očakávali slávnosť Kristovho narodenia.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, nech ťa uzmieria <br>" +
                            "naše pokorné modlitby a obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "a pretože sa nemôžeme spoliehať na vlastné zásluhy, <font color='#B71C1C'>—</font><br>" +
                            "pomáhaj nám svojou milosrdnou láskou. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <br>" +
                            "daj, aby sme sa účasťou na tejto sviatosti <br>" +
                            "naučili správne hodnotiť pozemské veci <font color='#B71C1C'>—</font><br>" +
                            "a milovať hodnoty nebeské. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "Všemohúci Bože, ty nám kážeš pripravovať cestu Pánovi; <font color='#B71C1C'>*</font><br>" +
                    "láskavo nás posilňuj, aby nás nepremohla ľudská slabosť, <font color='#B71C1C'>—</font><br>" +
                    "keď s dôverou očakávame potešujúci príchod <br>" +
                    "nebeského lekára Ježiša Krista.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "dopraj nám neustále ti prinášať našu obetu, <font color='#B71C1C'>*</font><br>" +
                            "aby zavŕšila to, čo sa začalo vo svätých tajomstvách, <font color='#B71C1C'>—</font><br>" +
                            "a uskutočňovala v nás dielo spásy.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, láskavo dopraj, <font color='#B71C1C'>*</font><br>" +
                            "aby nás tento nebeský pokrm očistil od hriechov, <font color='#B71C1C'>—</font><br>" +
                            "a tak nás pripravil na blížiace sa sviatky. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"24", "Pane, povzbuď naše srdcia, <br>" +
                    "aby sme pripravili cestu tvojmu jednorodenému Synovi; <font color='#B71C1C'>*</font><br>" +
                    "jeho príchod nech nás očistí <font color='#B71C1C'>—</font><br>" +
                    "a urobí nás hodnými slúžiť tebe.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, prijmi obetné dary, <br>" +
                            "ktoré ti prinášame z toho, čo nám udelila tvoja dobrota; <font color='#B71C1C'>*</font><br>" +
                            "a čo ti teraz so synovskou oddanosťou obetujeme, <font color='#B71C1C'>—</font><br>" +
                            "nech nám prinesie večnú spásu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, nech je nám na osoh <br>" +
                            "účasť na tejto sviatostnej hostine, <font color='#B71C1C'>*</font><br>" +
                            "pri ktorej nás už v tomto pominuteľnom svete <br>" +
                            "učíš milovať veci nebeské <font color='#B71C1C'>—</font><br>" +
                            "a hľadať hodnoty trváce. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"25", "Všemohúci Bože, <br>" +
                    "daj, aby sme v ustavičnej bdelosti <br>" +
                    "očakávali príchod tvojho jednorodeného Syna <font color='#B71C1C'>*</font><br>" +
                    "a podľa výzvy evanjelia ponáhľali sa s horiacimi lampami <font color='#B71C1C'>—</font><br>" +
                    "v ústrety pôvodcovi našej spásy Ježišovi Kristovi.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech ťa uzmieria naše pokorné modlitby a obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "a pretože sa nemôžeme spoliehať na vlastné zásluhy, <font color='#B71C1C'>—</font><br>" +
                            "pomáhaj nám svojou milosrdnou láskou. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <br>" +
                            "daj, aby sme sa účasťou na tejto sviatosti <br>" +
                            "naučili správne hodnotiť pozemské veci <font color='#B71C1C'>—</font><br>" +
                            "a milovať hodnoty nebeské. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"26", "Všemohúci Bože, <br>" +
                    "nech v našich srdciach zažiari odblesk tvojej slávy <br>" +
                    "a nech zaženie všetku temnotu noci, <font color='#B71C1C'>*</font><br>" +
                    "aby príchod tvojho jednorodeného Syna ukázal, <font color='#B71C1C'>—</font><br>" +
                    "že sme synovia svetla.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "dopraj nám neustále ti prinášať našu obetu, <font color='#B71C1C'>*</font><br>" +
                            "aby zavŕšila to, čo sa začalo vo svätých tajomstvách, <font color='#B71C1C'>—</font><br>" +
                            "a uskutočňovala v nás dielo spásy.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, láskavo dopraj, <font color='#B71C1C'>*</font><br>" +
                            "aby nás tento nebeský pokrm očistil od hriechov, <font color='#B71C1C'>—</font><br>" +
                            "a tak nás pripravil na blížiace sa sviatky. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "Bože, ty hľadíš na svoj ľud, <br>" +
                    "ktorý túžobne očakáva slávnosť narodenia Pána; <font color='#B71C1C'>*</font><br>" +
                    "dopraj, prosíme, <br>" +
                    "aby sme sa mohli tešiť z tohto veľkého daru spásy <font color='#B71C1C'>—</font><br>" +
                    "a s radosťou ho oslavovať.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "dopraj nám neustále ti prinášať našu obetu, <font color='#B71C1C'>*</font><br>" +
                            "aby zavŕšila to, čo sa začalo vo svätých tajomstvách, <font color='#B71C1C'>—</font><br>" +
                            "a uskutočňovala v nás dielo spásy.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, láskavo dopraj, <font color='#B71C1C'>*</font><br>" +
                            "aby nás tento nebeský pokrm očistil od hriechov, <font color='#B71C1C'>—</font><br>" +
                            "a tak nás pripravil na blížiace sa sviatky. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "Prosíme ťa, Pane, <br>" +
                    "láskavo vypočuj naše volanie <font color='#B71C1C'>*</font><br>" +
                    "a milosťou svojho prichádzajúceho Syna <font color='#B71C1C'>—</font><br>" +
                    "odstráň temnoty z nášho srdca. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi obetné dary, ktoré ti prinášame z toho, <br>" +
                            "čo nám udelila tvoja dobrota; <font color='#B71C1C'>*</font><br>" +
                            "a čo ti teraz so synovskou oddanosťou obetujeme, <font color='#B71C1C'>—</font><br>" +
                            "nech nám prinesie večnú spásu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, nech je nám na osoh <br>" +
                            "účasť na tejto sviatostnej hostine, <font color='#B71C1C'>*</font><br>" +
                            "pri ktorej nás už v tomto pominuteľnom svete <br>" +
                            "učíš milovať veci nebeské <font color='#B71C1C'>—</font><br>" +
                            "a hľadať hodnoty trváce. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"32", "Bože, skrze svojho jednorodeného Syna <br>" +
                    "si z nás utvoril nové stvorenie; <font color='#B71C1C'>*</font><br>" +
                    "zhliadni na dielo svojej milosrdnej lásky <font color='#B71C1C'>—</font><br>" +
                    "a príchodom svojho Syna nás očisti od škvrny hriechu. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech ťa uzmieria naše pokorné modlitby a obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "a pretože sa nemôžeme spoliehať na vlastné zásluhy, <font color='#B71C1C'>—</font><br>" +
                            "pomáhaj nám svojou milosrdnou láskou. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme,<br>" +
                            "daj, aby sme sa účasťou na tejto sviatosti <br>" +
                            "naučili správne hodnotiť pozemské veci <font color='#B71C1C'>—</font><br>" +
                            "a milovať hodnoty nebeské. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"33", "Prosíme ťa, všemohúci Bože,<font color='#B71C1C'>*</font><br>" +
                    "nech nám nadchádzajúca slávnosť <br>" +
                    "narodenia tvojho Syna poskytne pomoc v tomto živote <font color='#B71C1C'>—</font><br>" +
                    "a prinesie nám odmenu vo večnosti. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "dopraj nám neustále ti prinášať našu obetu, <font color='#B71C1C'>*</font><br>" +
                            "aby zavŕšila to, čo sa začalo vo svätých tajomstvách, <font color='#B71C1C'>—</font><br>" +
                            "a uskutočňovala v nás dielo spásy.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, láskavo dopraj, <font color='#B71C1C'>*</font><br>" +
                            "aby nás tento nebeský pokrm očistil od hriechov, <font color='#B71C1C'>—</font><br>" +
                            "a tak nás pripravil na blížiace sa sviatky. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"34", "Pane, sme tvoji nehodní služobníci <br>" +
                    "a zarmucujú nás naše viny, <font color='#B71C1C'>*</font><br>" +
                    "preto ťa prosíme, <font color='#B71C1C'>—</font><br>" +
                    "poteš nás spasiteľným príchodom <br>" +
                    "svojho jednorodeného Syna Ježiša Krista. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "prijmi obetné dary, ktoré ti prinášame z toho, <br>" +
                            "čo nám udelila tvoja dobrota; <font color='#B71C1C'>*</font><br>" +
                            "a čo ti teraz so synovskou oddanosťou obetujeme, <font color='#B71C1C'>—</font><br>" +
                            "nech nám prinesie večnú spásu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, Pane, nech je nám na osoh <br>" +
                            "účasť na tejto sviatostnej hostine, <font color='#B71C1C'>*</font><br>" +
                            "pri ktorej nás už v tomto pominuteľnom svete <br>" +
                            "učíš milovať veci nebeské <font color='#B71C1C'>—</font><br>" +
                            "a hľadať hodnoty trváce. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"35", "Všemohúci Bože, <br>" +
                    "ustavične nás predchádzaj <br>" +
                    "a sprevádzaj svojou milosťou, <font color='#B71C1C'>*</font><br>" +
                    "aby nám príchod tvojho Syna, <br>" +
                    "po ktorom celým srdcom túžime, <font color='#B71C1C'>—</font><br>" +
                    "priniesol pomoc pre časný i večný život.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "nech ťa uzmieria naše pokorné modlitby a obetné dary, <font color='#B71C1C'>*</font><br>" +
                            "a pretože sa nemôžeme spoliehať na vlastné zásluhy, <font color='#B71C1C'>—</font><br>" +
                            "pomáhaj nám svojou milosrdnou láskou. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, nasýtil si nás duchovným pokrmom; <font color='#B71C1C'>*</font><br>" +
                            "pokorne ťa prosíme, <br>" +
                            "daj, aby sme sa účasťou na tejto sviatosti <br>" +
                            "naučili správne hodnotiť pozemské veci <font color='#B71C1C'>—</font><br>" +
                            "a milovať hodnoty nebeské. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"40", "Pane, z anjelovho zvestovania vieme, <br>" +
                    "že tvoj Syn Ježiš Kristus sa stal človekom; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, vlej nám do duše svoju milosť, <font color='#B71C1C'>—</font><br>" +
                    "aby nás jeho umučenie a kríž <br>" +
                    "priviedli k slávnemu vzkrieseniu. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Prosíme ťa, Pane, <font color='#B71C1C'>*</font><br>" +
                            "nech Duch Svätý, ktorý svojou mocou <br>" +
                            "zatônil lono preblahoslavenej Panny Márie, <font color='#B71C1C'>—</font><br>" +
                            "posvätí obetné dary, pripravené na tvojom oltári.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Všemohúci Bože, <br>" +
                            "v Eucharistii sme prijali záloh večnej spásy; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, pomáhaj nám, <br>" +
                            "aby sme sa tým nábožnejšie pripravovali <br>" +
                            "na dôstojnú oslavu tajomstva narodenia tvojho Syna, <font color='#B71C1C'>—</font><br>" +
                            "čím viac sa blíži deň tejto spásonosnej slávnosti. <br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
    };

    //dni po Zjavení majú formu: 1+ dvt
    String[][] vianoceModlitby = {
            //DRUHÁ NEDEĽA PO NARODENÍ PÁNA
            {"0", "Všemohúci a večný Bože, ty svetlo veriaceho ľudu, <font color='#B71C1C'>*</font><br>" +
                    "milostivo naplň celý svet svojou slávou <font color='#B71C1C'>—</font><br>" +
                    "a jasom svojho svetla sa daj poznať všetkým ľuďom. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, posväť naše dary narodením <br>" +
                            "tvojho jednorodeného Syna, <font color='#B71C1C'>*</font><br>" +
                            "ktorý nám ukazuje cestu pravdy <font color='#B71C1C'>—</font><br>" +
                            "a sľubuje život v nebeskom kráľovstve. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane a Bože náš, pokorne ťa prosíme, <font color='#B71C1C'>*</font><br>" +
                            "aby nás pôsobenie tejto sviatosti <br>" +
                            "oslobodilo od zlých návykov <font color='#B71C1C'>—</font><br>" +
                            "a priviedlo k spáse, po ktorej túžime.<br>" +
                            "Skrze Krista, nášho Pána."},
            //VŠEDNÉ DNI VIANOCNÉHO OBDOBIA
            {"1", "Pane, vyznávame, že tvoj jednorodený Syn, <br>" +
                    "s tebou večný v sláve, sa stal človekom <br>" +
                    "a narodil sa z panenskej Matky; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, posilňuj nás v tejto viere, <font color='#B71C1C'>—</font><br>" +
                    "aby sme prekonali terajšie protivenstvá <br>" +
                    "a dosiahli nehynúcu radosť. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi naše dary, <br>" +
                            "ktorými sa uskutočňuje vznešená výmena, <font color='#B71C1C'>*</font><br>" +
                            "a keď ti obetujeme z toho, čo si nám uštedril, <font color='#B71C1C'>—</font><br>" +
                            "nech si zaslúžime prijať teba samého.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby nám sväté tajomstvá, ktoré sme prijali, <font color='#B71C1C'>—</font><br>" +
                            "boli neustálou posilou v našom živote. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"2", "Bože, tvoj milovaný Syn, narodený z Panny Márie, <br>" +
                    "stal sa nám podobným vo všetkom okrem hriechu; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, uzdrav nás z následkov prvotnej viny, <font color='#B71C1C'>—</font><br>" +
                    "aby sme ako nové stvorenie žili novým životom. <br>" +
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
            {"3", "Všemohúci Bože, <br>" +
                    "ty si poslal svojho Syna Ježiša Krista, <br>" +
                    "aby priniesol svetlo spásy celému svetu; <font color='#B71C1C'>*</font><br>" +
                    "daj, nech ožiari aj naše srdcia <font color='#B71C1C'>—</font><br>" +
                    "a ustavične ich obnovuje. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Bože, pôvodca úprimnej nábožnosti a pokoja, <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sme ťa dôstojne uctili týmito darmi <font color='#B71C1C'>—</font><br>" +
                            "a účasťou na svätých tajomstvách <br>" +
                            "upevnili vzájomnú jednotu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, ty mnohorakým spôsobom <br>" +
                            "vedieš a posilňuješ svoj ľud; <font color='#B71C1C'>*</font><br>" +
                            "otcovsky nás ochraňuj teraz i v budúcnosti <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby nás radosť z pozemských dobier <br>" +
                            "pobádala väčšmi sa usilovať o hodnoty večné. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"4", "Bože, narodením tvojho jednorodeného Syna <br>" +
                    "obdivuhodne si začal dielo nášho vykúpenia; <font color='#B71C1C'>*</font><br>" +
                    "prosíme ťa, posilňuj našu vieru, <font color='#B71C1C'>—</font><br>" +
                    "aby sme s jeho pomocou dosiahli prisľúbenú odmenu slávy. <br>" +
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
            {"5", "Prosíme ťa, Pane, <br>" +
                    "láskavo osvieť svojich veriacich <font color='#B71C1C'>*</font><br>" +
                    "a neustále rozžiaruj naše srdcia svetlom svojej slávy, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vždy lepšie poznávali nášho Spasiteľa <br>" +
                    "a opravdivo sa ho pridŕžali.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "dobrotivo prijmi obetné dary svojho ľudu, <font color='#B71C1C'>*</font><br>" +
                            "aby sme touto nebeskou sviatosťou dosiahli dobrá, <font color='#B71C1C'>—</font><br>" +
                            "po ktorých túžime s vierou a nábožnosťou. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, láskavo sa stretávaš s nami v Najsvätejšej sviatosti; <font color='#B71C1C'>*</font><br>" +
                            "daj, nech jej sila neprestajne účinkuje v našich srdciach, <font color='#B71C1C'>—</font><br>" +
                            "aby nás tak pripravila na prijatie ďalších milostí.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"6", "Všemohúci a večný Bože, <br>" +
                    "príchodom tvojho jednorodeného Syna <br>" +
                    "zjavil si sa nám v novom svetle; <font color='#B71C1C'>*</font><br>" +
                    "a keďže on vzal na seba <br>" +
                    "našu ľudskú prirodzenosť narodením z Panny Márie, <font color='#B71C1C'>—</font><br>" +
                    "daj nám účasť na kráľovstve jeho milosti. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov. ",
                    "Bože, pôvodca úprimnej nábožnosti a pokoja, <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sme ťa dôstojne uctili týmito darmi <font color='#B71C1C'>—</font><br>" +
                            "a účasťou na svätých tajomstvách <br>" +
                            "upevnili vzájomnú jednotu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, ty mnohorakým spôsobom <br>" +
                            "vedieš a posilňuješ svoj ľud; <font color='#B71C1C'>*</font><br>" +
                            "otcovsky nás ochraňuj teraz i v budúcnosti <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby nás radosť z pozemských dobier <br>" +
                            "pobádala väčšmi sa usilovať o hodnoty večné. <br>" +
                            "Skrze Krista, nášho Pána."},
            //Po slávnosti Zjavenia Pána
            {"11", "Bože, tvoje večné Slovo, Ježiš Kristus, <br>" +
                    "ktorý je ozdobou nebies, <br>" +
                    "z Panny Márie prijal našu ľudskú prirodzenosť <br>" +
                    "a zjavil sa medzi nami ako svetlo pravdy; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby v plnosti svojej moci zavŕšil vykúpenie sveta.<br>" +
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
            {"12", "Bože, tvoj jednorodený Syn <br>" +
                    "sa zjavil v našej ľudskej prirodzenosti <br>" +
                    "a bol nám navonok podobný; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme sa s pomocou jeho milosti <br>" +
                    "vnútorne stali podobnými jemu. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "dobrotivo prijmi obetné dary svojho ľudu, <font color='#B71C1C'>*</font><br>" +
                            "aby sme touto nebeskou sviatosťou dosiahli dobrá, <font color='#B71C1C'>—</font><br>" +
                            "po ktorých túžime s vierou a nábožnosťou. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, láskavo sa stretávaš s nami v Najsvätejšej sviatosti; <font color='#B71C1C'>*</font><br>" +
                            "daj, nech jej sila neprestajne účinkuje v našich srdciach, <font color='#B71C1C'>—</font><br>" +
                            "aby nás tak pripravila na prijatie ďalších milostí.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"13", "Bože, svetlo všetkých národov, <br>" +
                    "dožič svojmu ľudu trvalý pokoj <font color='#B71C1C'>*</font><br>" +
                    "a do našich sŕdc vlej žiarivé svetlo, <font color='#B71C1C'>—</font><br>" +
                    "ktorým si osvecoval mysle našich otcov vo viere. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Bože, pôvodca úprimnej nábožnosti a pokoja, <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sme ťa dôstojne uctili týmito darmi <font color='#B71C1C'>—</font><br>" +
                            "a účasťou na svätých tajomstvách <br>" +
                            "upevnili vzájomnú jednotu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, ty mnohorakým spôsobom <br>" +
                            "vedieš a posilňuješ svoj ľud; <font color='#B71C1C'>*</font><br>" +
                            "otcovsky nás ochraňuj teraz i v budúcnosti <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby nás radosť z pozemských dobier <br>" +
                            "pobádala väčšmi sa usilovať o hodnoty večné. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"14", "Bože, skrze tvojho Syna <br>" +
                    "zažiarilo všetkým národom svetlo tvojej večnosti; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme stále lepšie poznávali nášho Vykupiteľa <font color='#B71C1C'>—</font><br>" +
                    "a s jeho pomocou vošli do svetla večnej slávy. <br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh <br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého <br>" +
                    "po všetky veky vekov.",
                    "Pane, prijmi naše dary, <br>" +
                            "ktorými sa uskutočňuje vznešená výmena, <font color='#B71C1C'>*</font><br>" +
                            "a keď ti obetujeme z toho, čo si nám uštedril, <font color='#B71C1C'>—</font><br>" +
                            "nech si zaslúžime prijať teba samého.<br>" +
                            "Skrze Krista, nášho Pána.",
                    "Prosíme ťa, všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                            "daj, aby nám sväté tajomstvá, ktoré sme prijali, <font color='#B71C1C'>—</font><br>" +
                            "boli neustálou posilou v našom živote. <br>" +
                            "Skrze Krista, nášho Pána."},
            {"15", "Všemohúci Bože, <br>" +
                    "svetlom hviezdy si zjavil narodenie Spasiteľa sveta; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme vo svojich srdciach vždy viac poznávali <br>" +
                    "tajomstvo jeho narodenia.<br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Prosíme ťa, Pane, <br>" +
                            "dobrotivo prijmi obetné dary svojho ľudu, <font color='#B71C1C'>*</font><br>" +
                            "aby sme touto nebeskou sviatosťou dosiahli dobrá, <font color='#B71C1C'>—</font><br>" +
                            "po ktorých túžime s vierou a nábožnosťou. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Bože, láskavo sa stretávaš s nami v Najsvätejšej sviatosti; <font color='#B71C1C'>*</font><br>" +
                            "daj, nech jej sila neprestajne účinkuje v našich srdciach, <font color='#B71C1C'>—</font><br>" +
                            "aby nás tak pripravila na prijatie ďalších milostí.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"16", "Všemohúci a večný Bože, <br>" +
                    "skrze svojho jednorodeného Syna <br>" +
                    "urobil si nás novým stvorením; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby sme sa pôsobením tvojej milosti <br>" +
                    "čoraz dokonalejšie premieňali v Ježiša Krista, <font color='#B71C1C'>—</font><br>" +
                    "v ktorom je naša ľudská prirodzenosť <br>" +
                    "spojená s tvojím božstvom. <br>" +
                    "Lebo on je Boh a s tebou žije a kraľuje <br>" +
                    "v jednote Ducha Svätého po všetky veky vekov.",
                    "Bože, pôvodca úprimnej nábožnosti a pokoja, <font color='#B71C1C'>*</font><br>" +
                            "daj, prosíme, aby sme ťa dôstojne uctili týmito darmi <font color='#B71C1C'>—</font><br>" +
                            "a účasťou na svätých tajomstvách <br>" +
                            "upevnili vzájomnú jednotu. <br>" +
                            "Skrze Krista, nášho Pána.",
                    "Pane, ty mnohorakým spôsobom <br>" +
                            "vedieš a posilňuješ svoj ľud; <font color='#B71C1C'>*</font><br>" +
                            "otcovsky nás ochraňuj teraz i v budúcnosti <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby nás radosť z pozemských dobier <br>" +
                            "pobádala väčšmi sa usilovať o hodnoty večné. <br>" +
                            "Skrze Krista, nášho Pána."},
    };
}
