package sk.missa.interfaces;

/*
 * Prosby na sviatky svätých uložené v dvojrozmerných poliach za každý mesiac: prosby1, prosby2, prosby3...
 * {ID sviatku (podľa mesiacov v interface Svatci), názov spoločnej časti, úvodná výzva, odpoveď ľudu, úmysly, záverečná modlitba},
 * Čítania pre pohyblivé sviatky: prosbyPohyb
 * {ID sviatku (podľa interface Svatci), cirkevný rok (A/B/C), názov spoločnej časti, úvodná výzva, odpoveď ľudu, úmysly, záverečná modlitba},
 */


public interface Prosby_svatci {

    String[][] prosbyPohyb = {
            {"0gkp", "", "Bratia a sestry, modlime sa k Bohu Otcovi, ktorý zjavil svätému Jozefovi Kristovo tajomstvo, skryté od vekov, a prosme ho, aby ľudia lepšie spoznali Ježiša Krista.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, Otče, na príhovor svätého Jozefa ochraňuj svoju Cirkev pred všetkými vnútornými i vonkajšími nebezpečenstvami.<br>" +
                            "<font color='#B71C1C'>2.</font> Priveď všetkých ľudí k poznaniu, že tvoj Syn Ježiš Kristus je Spasiteľ sveta.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, aby si všetci pracujúci vzali svätého Jozefa za vzor statočnej práce a čnostného života.<br>" +
                            "<font color='#B71C1C'>4.</font> Požehnaj našich otcov a daj, aby so svojimi manželkami boli svojim deťom prvými svedkami viery.<br>" +
                            "<font color='#B71C1C'>5.</font> Pomáhaj nám v našom <font color='#B71C1C'>(</font>farskom<font color='#B71C1C'>)</font> spoločenstve podporovať spravodlivosť, verejnú mravnosť a svornosť.",
                    "Bože, Otče, svätému Jozefovi si odhalil<br>" +
                            "tajomstvo Kristovho vtelenia<br>" +
                            "a ustanovil si ho za strážcu Svätej rodiny;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby nám ženích Panny Márie<br>" +
                            "bol ochrancom teraz i v hodine smrti.<br>" +
                            "O to ťa prosíme skrze Krista, nášho Pána."},
            {"1gkp", "", "Bratia a sestry, nebeský Otec prostredníctvom archanjela Gabriela oznámil radostnú zvesť, že v čistom tele Panny Márie sa večné Slovo mocou Ducha Svätého stane človekom. Preto sa nábožne modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, ty si vyvolil Pannu Máriu za matku svojho Syna; požehnaj svoj ľud, ktorý sa teší z tohto tajomstva.<br>" +
                            "<font color='#B71C1C'>2.</font> Ty si zvestoval Panne Márii, že jej Syn bude večným Kráľom; uštedri celému svetu radosť zo spásy a pravý pokoj.<br>" +
                            "<font color='#B71C1C'>3.</font> Ty sa zmilúvaš nad pokornými; pomáhaj sužovaným a nasýť tých, ktorí trpia hladom a biedou.<br>" +
                            "<font color='#B71C1C'>4.</font> Ty si darca nášho života a pôvodca našej dôstojnosti; daj, aby sa všetky počaté deti mohli narodiť do milujúcich a starostlivých rodín.<br>" +
                            "<font color='#B71C1C'>5.</font> Tvoj Syn začal bývať pod srdcom Panny ako Bohočlovek; priprav nám srdcia na prijatie nášho Spasiteľa v Eucharistii.",
                    "Svätý Otče, ďakujeme ti,<br>" +
                            "že si nám daroval svojho Syna, aby nás vykúpil;<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, nech nás pod ochranou Panny Márie<br>" +
                            "nič neodlúči od nášho Spasiteľa,<br>" +
                            "ktorý s tebou žije a kraľuje na veky vekov."},

            //NANEBOVSTÚPENIE PÁNA
            {"6gkp", "A", "Bratia a sestry, pozdvihnime svoj duchovný zrak k Ježišovi, ktorý vystúpil do neba a sedí po pravici Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, Kráľ slávy, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, posilni svojím Duchom všetkých veriacich, aby slovom i životom svedčili o tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, žehnaj všetkých biskupov a kňazov, ktorí ohlasujú tvoje evanjelium a krstia tých, ktorí uverili.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, osvieť všetky národy, aby spoznali tvoju lásku a tvoj pokoj.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, naplň útechou a silou Ducha Svätého všetkých, ktorí trpia na tele alebo na duši.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, udeľ našim prvoprijímajúcim deťom milosť trvalej lásky a vernosti.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane Ježišu, dovoľ nám všetkým uzrieť po smrti slávu neba, do ktorej si ty slávne vystúpil.",
                    "Ježišu, Kráľ slávy,<br>" +
                            "ty sedíš po pravici Otca<br>" +
                            "a zároveň zostávaš s nami až do skončenia sveta;<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "aby nás nič neodlúčilo od teba.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"", "B", "Bratia a sestry, keď Ježiš pred zrakom ľudí vystúpil do neba, dostali prísľub, že sa v sláve opäť vráti. Nenecháva nás však opustených, preto ho môžeme s dôverou prosiť.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, požehnaj Svätého Otca, biskupov a kňazov, keď slávia pamiatku tvojej veľkonočnej obety.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, požehnaj všetkých, ktorí svojou miernosťou a trpezlivosťou vydávajú dobré svedectvo viery.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, požehnaj všetkých, ktorí svoju politickú moc používajú pre blaho spoločnosti.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, požehnaj všetkých, ktorí praktickou láskou k blížnym zvestujú tvoje zmŕtvychvstanie.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, požehnaj všetkých uväznených, ktorí chcú konať pokánie a zmeniť svoj život.<br>" +
                            "<font color='#B71C1C'>6.</font> Ježišu, požehnaj naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme verne plnili tvoj príkaz lásky.",
                    "Ježišu, Kráľ slávy,<br>" +
                            "ty sedíš po pravici Otca<br>" +
                            "a zároveň zostávaš s nami do konca sveta;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj nám silu ohlasovať veľkonočnú radosť.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"", "C", "Bratia a sestry, dnes s úžasom prežívame Kristovo vystúpenie do slávy večného Otca. Obráťme svoj zrak k nebu, kde sedí po Božej pravici, a volajme k nemu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, posilňuj biskupov a kňazov, aby boli skutočnými pastiermi Božieho ľudu, schopnými privádzať ľudské srdcia k tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, daj, nech vo viere a modlitbe, ako apoštoli a tvoja matka Mária, aj my očakávame sľúbené dary Ducha Svätého.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, daj sa spoznať všetkým pochybujúcim a bezradným ako bezpečný ochranca a sprievodca životom.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, ukáž všetkým, ktorí sú naviazaní na hmotné veci, pominuteľnosť sveta a jeho bohatstva.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, upevňuj v nás vedomie, že aj naše premenené telo bude mať raz podiel na tvojej sláve.<br>" +
                            "<font color='#B71C1C'>6.</font> Ježišu, prijmi k sebe našich zosnulých <font color='#B71C1C'>(M.)</font>.",
                    "Ježišu Kriste, Kráľ slávy,<br>" +
                            "ty sedíš po pravici Otca<br>" +
                            "a zároveň zostávaš s nami do konca sveta;<br>" +
                            "prijmi naše prosby a daj,<br>" +
                            "nech sme tvojimi vernými svedkami.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},

            //ZOSLANIE DUCHA SVÄTÉHO – VIGÍLIA I.
            {"2gkp", "A", "Bratia a sestry, prosme Pána, aby zoslal svojho Ducha a zapálil v nás oheň svojej lásky.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby Cirkev v sile Ducha Svätého prekonávala všetky prekážky a nebezpečenstvá a s láskou privádzala ľudí k spáse, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby všetci, ktorí majú úlohy v občianskom a politickom svete, konali v duchu spravodlivosti, pravdy, dobra a lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby naše kresťanské rodiny boli živými domácimi cirkvami a vnášali aj do ostatných rodín svetlo, pokoj a lásku Ducha Svätého, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby naši žiaci, študenti, učitelia a profesori pod vplyvom Ducha múdrosti a rozumu šírili vo svete pravú kultúru a civilizáciu lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sa chorí a utrápení otvorili pôsobeniu Ducha Svätého, ktorý je darcom sily, útechy a prebýva v srdciach spravodlivých ako vo svojom chráme, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Aby sa mladí úprimne tešili, že sa v krste stali Božími deťmi a že vo sviatosti birmovania Duch Svätý upevňuje ich kresťanské zasvätenie, prosme Pána.",
                    "Pane, všemohúci Bože, sme zhromaždení<br>" +
                            "ako apoštoli s Ježišovou matkou Máriou;<br>" +
                            "prosíme ťa, zošli aj na nás,<br>" +
                            "ktorí v predvečer Turíc prežívame tieto sväté chvíle,<br>" +
                            "hojnosť darov Ducha Svätého.<br>" +
                            "Skrze Krista, nášho Pána."},

            //ZOSLANIE DUCHA SVÄTÉHO – VIGÍLIA II.
            {"", "B", "Bratia a sestry, s dôverou prosme o dary prisľúbeného Ducha Posvätiteľa a spoločne volajme:<br>" +
                    "<font color='#B71C1C'>(</font>Príď, Duchu Svätý, a zapáľ v nás oheň svojej lásky.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Duch múdrosti, obdaruj svoju Cirkev schopnosťou rozpoznávať znamenia čias; nech je pre súčasného človeka oporou na ceste vedúcej k výšinám svätosti a dokonalosti v Bohu.<br>" +
                            "<font color='#B71C1C'>2.</font> Duch rozumu, napĺňaj hojnosťou svojich darov nášho pápeža <font color='#B71C1C'>M.</font>; nech je jeho služba požehnaním pre každého človeka, ktorý sa vo svojom živote stretne s posolstvom Petra našich čias.<br>" +
                            "<font color='#B71C1C'>3.</font> Duch rady, zostúp do sŕdc našich bratov, ktorí sa pripravujú na prijatie sviatosti kňazstva; nech veriaci, ku ktorým raz budú poslaní, vidia v ich pastierskej službe dielo Božej moci.<br>" +
                            "<font color='#B71C1C'>4.</font> Duch sily, neopúšťaj pochybujúcich a stratených; nech v spoločenstve veriacich pocítia tvoju lásku a milosrdenstvo.<br>" +
                            "<font color='#B71C1C'>5.</font> Duch poznania, udeľ svoje bohatstvo všetkým ľuďom kultúry a umenia; nech talenty, ktoré si im zveril, rozvíjajú pre službu človeku a napomáhajú rast Božieho kráľovstva v srdciach ľudí.<br>" +
                            "<font color='#B71C1C'>6.</font> Duch nábožnosti, voveď našich zosnulých do kráľovstva večného šťastia; nech je svedectvo ich života predpokladom videnia tváre milosrdného Otca.<br>" +
                            "<font color='#B71C1C'>7.</font> Duch bázne pred Bohom, zošli na nás tu zhromaždených dar lásky, radosti a pokoja; nech ony vyliečia naše srdcia zranené egoizmom a nepokojom.",
                    "Spravodlivý Otče,<br>" +
                            "ďakujeme ti za lásku,<br>" +
                            "ktorú v našich srdciach rozlieva Duch Svätý;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a upevňuj naše spoločenstvo s tebou.<br>" +
                            "Skrze Krista, nášho Pána."},
            //ZOSLANIE DUCHA SVÄTÉHO – VIGÍLIA I.
            {"", "C", "Bratia a sestry, prosme Pána, aby zoslal svojho Ducha a zapálil v nás oheň svojej lásky.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby Cirkev v sile Ducha Svätého prekonávala všetky prekážky a nebezpečenstvá a s láskou privádzala ľudí k spáse, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby všetci, ktorí majú úlohy v občianskom a politickom svete, konali v duchu spravodlivosti, pravdy, dobra a lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby naše kresťanské rodiny boli živými domácimi cirkvami a vnášali aj do ostatných rodín svetlo, pokoj a lásku Ducha Svätého, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby naši žiaci, študenti, učitelia a profesori pod vplyvom Ducha múdrosti a rozumu šírili vo svete pravú kultúru a civilizáciu lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sa chorí a utrápení otvorili pôsobeniu Ducha Svätého, ktorý je darcom sily, útechy a prebýva v srdciach spravodlivých ako vo svojom chráme, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Aby sa mladí úprimne tešili, že sa v krste stali Božími deťmi a že vo sviatosti birmovania Duch Svätý upevňuje ich kresťanské zasvätenie, prosme Pána.",
                    "Pane, všemohúci Bože, sme zhromaždení<br>" +
                            "ako apoštoli s Ježišovou matkou Máriou;<br>" +
                            "prosíme ťa, zošli aj na nás,<br>" +
                            "ktorí v predvečer Turíc prežívame tieto sväté chvíle,<br>" +
                            "hojnosť darov Ducha Svätého.<br>" +
                            "Skrze Krista, nášho Pána."},

            //ZOSLANIE DUCHA SVÄTÉHO
            {"3gkp", "A", "Bratia a sestry, Pánov Duch, ktorého sme očakávali a vzývali, zostupuje dnes na Cirkev, aby aj v našich časoch urobil veľké divy Turíc. Prosme Pána, aby uštedril Cirkvi i celému svetu dary svojho Ducha.",
                    "<font color='#B71C1C'>(</font>Volajme: Obnov nás, Pane, a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, daruj Cirkvi misionárskeho ducha, ktorý posilňoval prvých kresťanov niesť evanjelium až do končín zeme.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, zjednoť svojím Duchom všetkých pokrstených a daj, aby všetci veriaci boli jedno srdce a jedna duša.<br>" +
                            "<font color='#B71C1C'>3.</font> Svetlom svojho Ducha osvieť všetkých ľudí, aby sa nenávisť zmenila na lásku, bolesť na radosť a vojny na vytúžený mier.<br>" +
                            "<font color='#B71C1C'>4.</font> Svojím Duchom posilňuj všetkých, ktorí milujú pravdu, trpia pre spravodlivosť a bojujú za slobodu a pokoj.<br>" +
                            "<font color='#B71C1C'>5.</font> Zošli na nás svojho Ducha, aby sme svojím kresťanským životom všade vydávali svedectvo o Kristovi.",
                    "Bože, ty si zoslal Ducha Svätého na odpustenie hriechov<br>" +
                            "a na udržanie a vzrast tvojho života v nás;<br>" +
                            "naplň naše srdcia darmi svojho Ducha<br>" +
                            "a zapáľ v nás oheň svojej lásky.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"", "B", "Bratia a sestry, dobrorečme Otcovi, ktorý vylial na všetky národy milosť Ducha Svätého, a pokorne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, daj, aby Cirkev v sile Ducha Svätého vždy verne hlásala Božie kráľovstvo celému svetu.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, udeľ svoje požehnanie a vytrvalosť v povolaní bohoslovcom a diakonom, ktorí sa pripravujú na kňazstvo.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, daj, aby všetci veriaci boli otvorení pravde a darom, ktoré udeľuje Duch Svätý.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, zošli svojho Ducha, svetlo sŕdc, aby upevnil kolísavých vo viere.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, splň nádej zosnulých <font color='#B71C1C'>(M.)</font>, aby pri druhom Kristovom príchode dosiahli slávu vzkriesenia.",
                    "Nekonečný Bože,<br>" +
                            "oslávením Ježiša Krista a zoslaním Ducha Svätého<br>" +
                            "otvoril si nám bránu večného života;<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "aby nám prijatie tohto veľkého daru<br>" +
                            "pomáhalo rásť vo viere a oddane ti slúžiť.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"", "C", "Bratia a sestry, dnes, keď sa završuje päťdesiatdňové Veľkonočné obdobie, nechajme sa viesť Božím Duchom a s dôverou prosme Pána.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, večná láska, prosíme ťa za pápeža <font color='#B71C1C'>M.</font> a zbor biskupov, odmeň ich vernosť apoštolskému učeniu.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, večná láska, prosíme ťa za všetkých pokrstených, daruj im pevnú vieru, nádej a lásku.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, večná láska, prosíme ťa za všetkých pobirmovaných, pomáhaj im svedčiť o zmŕtvychvstalom Kristovi.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, večná láska, prosíme ťa za celý svet, obnovuj a napĺňaj ho Duchom Svätým.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, večná láska, prosíme ťa za všetkých hľadajúcich, dávaj im odvahu nachádzať pravdu.<br>" +
                            "<font color='#B71C1C'>6.</font> Bože, večná láska, prosíme ťa za našu farskú rodinu, posilňuj nás vo vernosti evanjeliu.<br>" +
                            "<font color='#B71C1C'>7.</font> Bože, večná láska, prosíme ťa za našich zosnulých <font color='#B71C1C'>(M.)</font>, daruj im radosť vo svojom kráľovstve.",
                    "Bože, prameň všetkého dobra,<br>" +
                            "prenikni milosťou Ducha Svätého každé ľudské srdce<br>" +
                            "a obnov celú zem,<br>" +
                            "aby všetko tvorstvo chválilo teba, nášho Stvoriteľa.<br>" +
                            "Skrze Krista, nášho Pána."},

            //NA VOTÍVNU OMŠU O BOŽOM MILOSRDENSTVE
            {"", "", "Bratia a sestry, náš Pán Ježiš Kristus je tvárou Otcovho milosrdenstva. V jeho mene teraz prednesme Bohu, ktorý je milosrdný a milostivý, svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby Cirkev, Kristova nevesta, vždy uprednostňovala liek milosrdenstva pred postojom prísnosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby predstavitelia národov považovali obranu dôstojnosti každého človeka za prioritu všetkých svojich záujmov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby všetci, ktorí sú ranení hriechom a vlastnou slabosťou, pocítili silu Božej lásky a túžili po Otcovom odpustení, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby spovedníci svojou službou ukázali kajúcnikom, že Božia všemohúcnosť a láska sa najviac prejavujú v milosrdenstve, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme všetci svedčili o tom, že posolstvom, ktoré Boh prostredníctvom Cirkvi zjavuje svetu, je nádej a láska, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "ty si zjavil tomuto svetu, že Boh je náš Otec,<br>" +
                            "ktorý nás nesmierne miluje;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomáhaj všetkým nám, ktorí patríme do tvojej Cirkvi,<br>" +
                            "aby sme boli milosrdní, ako je milosrdný náš Otec.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            //NEPOŠKVRNENÉHO SRDCA PANNY MÁRIE
            {"4p", "", "Bratia a sestry, Panna Mária hlboko v srdci zachovávala Ježišove slová a premýšľala o nich. V tejto spoločnej modlitbe prosme Boha Otca, aby pre lásku k nepoškvrnenému Máriinmu srdcu zhliadol na naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pozri na Matku svojho Syna a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, pre lásku, ktorou ťa miluje Mária, Matka Cirkvi, ochráň svoju Cirkev pred všetkými nebezpečenstvami.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby nepoškvrnené srdce Panny Márie bolo všetkým národom znamením lásky a pokoja.<br>" +
                            "<font color='#B71C1C'>3.</font> Pre bolesť Máriinho srdca zachráň hriešnikov, ktorí odmietajú tvoju lásku.<br>" +
                            "<font color='#B71C1C'>4.</font> Priveď k úcte nepoškvrneného Máriinho srdca mladých ľudí, aby si zachovali čistotu a nevinnosť srdca.<br>" +
                            "<font color='#B71C1C'>5.</font> Pomôž nám žiť v posväcujúcej milosti, aby sme mohli byť synmi a dcérami našej nebeskej Matky.",
                    "Milosrdný Bože,<br>" +
                            "ty si nám dal v nepoškvrnenom srdci Panny Márie,<br>" +
                            "matky svojho Syna,<br>" +
                            "vzor lásky a nábožnosti;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby nás pravá úcta k Bohorodičke<br>" +
                            "chránila od hriechu a viedla k tebe.<br>" +
                            "Skrze Krista, nášho Pána."},
            //PANNY MÁRIE, MATKY CIRKVI
            {"2p", "", "Bratia a sestry, Pannu Máriu uctievame ako Matku Božieho Syna, milovanú dcéru Otca a svätyňu Ducha Svätého. Veríme, že sa s materinskou láskou stará o Cirkev a sprevádza nás všetkých, kým sa vo večnosti nestretneme ako jedna rodina Božích detí. Preto na jej príhovor prednesme nebeskému Otcovi svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Nebeský Otče, prosíme ťa za kresťanov na celom svete, aby na príhovor Panny Márie, Matky Cirkvi, zvíťazili nad hriechom a rástli vo svätosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za politikov a zákonodarcov, aby na príhovor Panny Márie, novej Evy, chránili posvätnosť rodiny a dôstojnosť každého ľudského života.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za mladých manželov, aby na príhovor Panny Márie Pomocnice vždy úprimne prijali a vychovávali deti, ktorými ozdobuješ ich vzájomnú lásku.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za našich trpiacich bratov a sestry, aby na príhovor Márie, bolestnej Panny, v nádeji niesli svoj kríž a spojili sa s Kristovou obetou za vykúpenie sveta.<br>" +
                            "<font color='#B71C1C'>5.</font> Nebeský Otče, prosíme ťa aj za nás samých, aby sme na príhovor Panny Márie, našej nebeskej Matky, nasledovali jej lásku a verne plnili tvoju vôľu.",
                    "Bože Otče, kresťania sa od najstarších čias<br>" +
                            "vo všetkých nebezpečenstvách a potrebách<br>" +
                            "utiekali v modlitbe pod ochranu Panny Márie;<br>" +
                            "aj my ti dnes predkladáme svoje modlitby<br>" +
                            "vo viere, že ich na jej príhovor vyslyšíš,<br>" +
                            "veď je Matkou nás i tvojho Syna Ježiša Krista,<br>" +
                            "ktorý s tebou žije a kraľuje na veky vekov."},
            //NÁŠHO PÁNA JEŽIŠA KRISTA, NAJVYŠŠIEHO A VEČNÉHO KŇAZA
            {"3gp", "A", "Bratia a sestry, Pán Ježiš sa v rozhodujúcich chvíľach svojho života utiahol do samoty na modlitbu. Povzbudení jeho príkladom a slovami: \"Bdejte a modlite sa!\", prednesme svoje prosby nebeskému Otcovi a volajme:",
                    "<font color='#B71C1C'>(</font>Buď vôľa tvoja, Otče.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za kňazov: aby boli horlivými mužmi modlitby, vždy ochotnými obetovať sa za spásu ľudí.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za našu vlasť: aby na nej spočinulo Božie požehnanie plynúce z obety najvyššieho kňaza Ježiša Krista.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za všetkých povolaných do duchovnej služby: aby s pohľadom upretým na svojho Majstra rozvíjali v sebe dary prijaté v sviatostiach.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za tých, ktorí trpia pokušeniami proti viere: aby bol pre nich trpiaci Kristus útočiskom a útechou.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za nás samých: aby účasť na slávení svätej omše posväcovala náš každodenný život.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme za zomrelých kňazov: aby im Kristus, večný kňaz, dal účasť na nebeskej liturgii.",
                    "Nebeský Otče,<br>" +
                            "tvoj Syn Ježiš Kristus, najvyšší a večný kňaz,<br>" +
                            "uzavrel s nami novú zmluvu;<br>" +
                            "vypočuj naše prosby a obdaruj nás milosťami,<br>" +
                            "ktoré nám on sám daroval pre našu spásu.<br>" +
                            "On s tebou žije a kraľuje na veky vekov."},
            {"", "B", "Bratia a sestry, veľkňaz Ježiš Kristus poslal apoštolov do celého sveta, aby hlásali radostnú zvesť evanjelia. Dnes túto úlohu konajú biskupi a kňazi a cez krstné kňazstvo všetci kresťania. Modlime sa za Cirkev i svet, do ktorého sme poslaní.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Posilňuj, Pane, všetkých kňazov, aby osobný príklad ich viery a horlivosti mnohých priviedol k tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Povolávaj aj dnes tých, ktorí sa rozhodnú nasledovať tvoj hlas a zasvätiť svoj život službe bratom v Cirkvi.<br>" +
                            "<font color='#B71C1C'>3.</font> Prebúdzaj v národoch sveta túžbu po mieri a pokoji.<br>" +
                            "<font color='#B71C1C'>4.</font> Nedovoľ, Pane, aby vlažnosť kresťanov vzďaľovala od teba tých, ktorí ťa ešte len hľadajú.<br>" +
                            "<font color='#B71C1C'>5.</font> Povzbudzuj nás všetkých, aby sme boli pravdivými a odvážnymi zástancami slabých a utláčaných.<br>" +
                            "<font color='#B71C1C'>6.</font> Priveď zomrelých kňazov a biskupov do svojho kráľovstva.",
                    "Ježišu, veľkňaz a pastier našich duší,<br>" +
                            "ty poznáš naše túžby a vieš,<br>" +
                            "čo najviac potrebujeme;<br>" +
                            "prijmi naše prosby<br>" +
                            "a daj nám silu budovať už tu na zemi<br>" +
                            "kráľovstvo lásky a pokoja.<br>" +
                            "Ty žiješ a kraľuješ na veky vekov."},
            {"", "C", "Bratia a sestry, náš Pán Ježiš Kristus je najvyšším a večným kňazom, ktorý sedí po Otcovej pravici a prihovára sa za svoj ľud. V jeho mene teraz prednesme svoje prosby Bohu.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, večný kňaz, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Svätého Otca <font color='#B71C1C'>M.</font>, nášho biskupa <font color='#B71C1C'>M.</font> a všetkých pastierov Cirkvi: aby prostredníctvom ich pokornej a láskavej kňazskej služby vzrastala kresťanská viera medzi národmi.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za nové kňazské a rehoľné povolania: aby svetu nikdy nechýbali horliví ohlasovatelia evanjelia a vysluhovatelia sviatostí.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za jednotu kresťanov: aby všetkých, ktorí veria v Krista, spájal nielen jeden krst, ale aj jedna viera, Eucharistia a úprimná láska.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za nás samých: aby sme posilnení slávením i prijímaním Eucharistie ochotne preukazovali službu lásky tým, ktorí potrebujú našu pomoc.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za všetkých zomrelých kňazov: aby boli prijatí do spoločenstva svätých a mali podiel na nebeskej liturgii.",
                    "Buď zvelebený, Otče, za tvoju lásku,<br>" +
                            "ktorú si nám zjavil vo svojom jednorodenom Synovi;<br>" +
                            "pridruž k jeho obeti naše modlitby,<br>" +
                            "ktoré ti s pokorou prednášame.<br>" +
                            "Skrze Krista, nášho Pána."},
            //NAJSVÄTEJŠEJ TROJICE
            {"7gkp", "A", "Bratia a sestry, dnes, na slávnosť Najsvätejšej Trojice, oslavujeme a vyznávame hlboké tajomstvá viery. Zhromaždení v Duchu Svätom pokorne prosme nášho Otca prostredníctvom jeho Syna Ježiša Krista.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za svätú Cirkev: aby sa celé ľudstvo stalo Božím ľudom, ktorý vo svojej láske zvoláva Otec skrze Krista v spoločenstve Ducha Svätého, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetky národy a za ich predstaviteľov: aby osvietení svetlom Ducha spoznali Ježiša Krista, ktorého poslal Otec, a aby v každom blížnom videli svojho brata, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za tých, ktorí sa zmietajú v neistote a pochybnostiach a ktorí trpia na tele alebo na duši: aby pocítili lásku nebeského Otca a utešujúcu prítomnosť Kristovho Ducha, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás tu prítomných: aby milosť krstu, ktorú sme dostali v mene Otca i Syna i Ducha Svätého, v nás rástla a prinášala čoraz bohatšie ovocie, prosme Pána.",
                    "Bože Otče,<br>" +
                            "sme tvoje deti vykúpené krvou tvojho Syna<br>" +
                            "a posvätené milosťou tvojho Ducha;<br>" +
                            "prijmi za to našu vďaku<br>" +
                            "a vyslyš naše prosby.<br>" +
                            "O to ťa prosíme v Duchu Svätom<br>" +
                            "skrze Krista, nášho Pána."},
            {"", "B", "Bratia a sestry, Pán Ježiš je s nami až do skončenia sveta. V jednote s Duchom Svätým, vedení otcovskou rukou láskavého Boha, skloňme sa pred tajomstvom Trojice a pokorne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, pomáhaj celej Cirkvi zachovávať jednotu podľa vzoru Najsvätejšej Trojice.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, daruj predstaveným národov ducha múdrosti, aby riešili nedorozumenia a konflikty s rozvahou a miernosťou.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, ochraňuj všetkých pokrstených, aby sa na nich preukazovala tvoja štedrosť, pomoc Boha Otca a sila Ducha Svätého.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, osvecuj nás Duchom poznania, aby sme vo svojich bratoch a sestrách videli teba a ochotne im pomáhali.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, priveď našich zomrelých <font color='#B71C1C'>(M.)</font> k plnému poznaniu Trojice a k blaženosti v nebeskom kráľovstve.",
                    "Pane Ježišu,<br>" +
                            "tebe sa spolu s Otcom a Duchom Svätým<br>" +
                            "vzdáva nekonečná sláva;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daruj nám radosť z toho,<br>" +
                            "že sme milované Božie deti.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"", "C", "Bratia a sestry, k Bohu Otcovi prichádzame prostredníctvom jeho Syna Ježiša Krista v láske, ktorú v našich srdciach rozlieva Duch Svätý. Preto sa s nadšením modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, naplň naše srdcia svojou láskou.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, tebe patrí večná sláva; daj, aby sa všetci kňazi a rehoľníci tvojej Cirkvi vrúcne modlili a svojím životom velebili Najsvätejšiu Trojicu.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, tebe patrí večná chvála; daj, aby národy žili v bratskom spoločenstve a vzájomne si pomáhali.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, tebe patrí večná veleba; daj, aby rástlo puto vzájomnej dôvery a lásky medzi ošetrujúcimi a chorými, medzi vyučujúcimi a žiakmi i medzi rodičmi a deťmi.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, tebe patrí naša vďaka; daj, aby sme nedorozumenia a hádky v rodinách vedeli riešiť s tvojou pomocou a modlili sa za obnovenie pokoja v kruhu najbližších.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, tebe patrí naša pokorná modlitba; obdaruj večnou odmenou našich zomrelých <font color='#B71C1C'>(M.)</font> a zjednoť ich vo svojej láske spolu so Synom i s Duchom Svätým.",
                    "Bože, vierou v Krista<br>" +
                            "máme prístup k tvojej milosti;<br>" +
                            "vypočuj naše prosby a osvecuj naše poznanie,<br>" +
                            "aby sme raz mohli v plnosti<br>" +
                            "pochopiť jednotu Trojice a dosiahnuť večný život.<br>" +
                            "Skrze Krista, nášho Pána."},
            //NAJSVÄTEJŠIEHO KRISTOVHO TELA A KRVI
            {"4gkp", "A", "Bratia a sestry, sviatosť Kristovho tela a krvi je prameňom a vrcholom celého života Cirkvi. Prosme Pána, aby toto veľké tajomstvo viery bolo našou spásou a požehnaním pre celý svet.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za svätú Cirkev: aby posilňovaná chlebom života slovom i skutkami ohlasovala evanjelium spásy, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za kňazov, služobníkov oltára: aby sa čoraz dokonalejšie pripodobňovali tajomstvu, ktoré slávia na Božiu chválu a na spásu ľudí, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za deti, ktoré v tomto roku prvýkrát prijmú Oltárnu sviatosť: aby rástli v Božej milosti a láske a aby v rodine a Cirkvi šírili posolstvo veľkonočnej radosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za chorých: aby im nebeský chlieb bol posilou a útechou v bolestiach a aby v sile tohto pokrmu kráčali k večnej blaženosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu prítomných: aby sme s radosťou požívali nebeský pokrm a vedeli sa s bratmi a sestrami podeliť o pozemský chlieb, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "v Eucharistii ostávaš prítomný medzi nami až do konca sveta;<br>" +
                            "vyslyš naše prosby a prebývaj v nás, aby sme mali večný život.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"", "B", "Bratia a sestry, Pán Ježiš je živým chlebom, ktorý zostúpil z neba. Prijmime ho do svojich sŕdc a úprimne mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Kriste, prijímanie tvojho tela a krvi nám zaručuje spásu; ochraňuj nášho biskupa <font color='#B71C1C'>M.</font> a daruj mu silu povzbudzovať svojich veriacich k prijímaniu Eucharistie.<br>" +
                            "<font color='#B71C1C'>2.</font> Kriste, prijímanie tvojho tela a krvi nám poskytuje zmierenie; priveď všetky krajiny k mierovému spolužitiu a k vzájomnému rešpektu.<br>" +
                            "<font color='#B71C1C'>3.</font> Kriste, prijímanie tvojho tela a krvi nám prináša odpustenie; daj, aby všetci utláčaní a nespravodlivo obviňovaní odpúšťali tým, ktorí im ubližujú.<br>" +
                            "<font color='#B71C1C'>4.</font> Kriste, prijímaním tvojho tela a krvi spoznávame pravú obetu; vlej do nás úprimnú ochotu pomáhať chorým, opusteným a biednym.<br>" +
                            "<font color='#B71C1C'>5.</font> Kriste, prijímanie tvojho tela a krvi nám otvára brány večnosti; voveď našich zomrelých <font color='#B71C1C'>(M.)</font> do spoločenstva svojich svätých.",
                    "Pane Ježišu Kriste,<br>" +
                            "ty nám svojou obetou na kríži otváraš svoje kráľovstvo;<br>" +
                            "prosíme ťa, vypočuj naše prosby a daj,<br>" +
                            "aby sme prijímaním tvojho tela a krvi<br>" +
                            "dosiahli večnú spásu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"", "C", "Bratia a sestry, keď jeme eucharistický chlieb a pijeme z kalicha Kristovej krvi, zvestujeme jeho smrť, kým nepríde v sláve. V radostnom očakávaní sa spoločne modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, anjelská radosť, požehnávaj všetkých kňazov, ktorí denne na oltári premieňajú chlieb a víno na tvoje sväté telo a krv.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu najmocnejší, stoj pri tých, ktorí majú politickú moc vo svete, a pomáhaj im prijímať svoje postavenie s pokorou a s úmyslom konať dobro.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, radosť cherubínov, zjavuj sa nespravodlivo väzneným a pomáhaj im pochopiť, že ty si dokonalá sloboda a večná pravda.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, vládca serafínov, daj, aby sme rešpektovali svojich nadriadených a mali úctu k všetkým bratom a sestrám.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, nebeský Baránok, ukáž slávu svojho kráľovstva našim zomrelým <font color='#B71C1C'>(M.)</font>, ktorí už prekročili brány večnosti.",
                    "Pane Ježišu,<br>" +
                            "ty si zázračne rozmnožil chleby a nasýtil zástupy;<br>" +
                            "prosíme ťa, vypočuj naše modlitby<br>" +
                            "a naplň nás vďačnosťou za to,<br>" +
                            "že nás sýtiš chlebom z neba, ktorý nám z lásky dávaš.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            //NAJSVÄTEJŠIEHO SRDCA JEŽIŠOVHO
            {"5gkp", "A", "Bratia a sestry, z Ježišovho otvoreného boku vyšla krv a voda, z neho pramenia aj sviatosti Cirkvi. Prosme ho, aby nám jeho Najsvätejšie Srdce bolo prameňom požehnania a milostí.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby svätá Cirkev, zrodená z boku Krista, nového Adama spiaceho na kríži, zvestovala svetu veľkosť jeho lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby sa národy a ich predstavitelia v úsilí o kultúrnu a sociálnu obnovu opierali o Kristov príkaz lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby rozdelení kresťania hľadali cestu jednoty vytrvalou modlitbou, obnovou sŕdc a skutkami spravodlivosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby učitelia Božieho zákona čerpali pravú múdrosť z tajomstva Kristovho kríža, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme v hladných, pocestných a trpiacich bratoch videli samého Krista a pomáhali im skutkami milosrdenstva, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "na kríži si nám otvoril prameň spásy;<br>" +
                            "vysloboď nás z otroctva hriechu,<br>" +
                            "aby sme sa mohli primknúť k tebe, svojmu Vykupiteľovi,<br>" +
                            "a každý deň niesli príjemné jarmo tvojich prikázaní.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"", "B", "Bratia a sestry, Kristova láska k nám presahuje každé poznanie, pretože nás nekonečne miluje. Otvorme svoje srdcia na poznanie tejto nesmiernej lásky a oddane prednesme Bohu svoje modlitby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme Pána, aby láskavo pomáhal veriacim s radosťou vstupovať do chrámu ako do Božieho domu.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme Pána, aby povzbudzoval štátnikov chápať svoje postavenie ako službu ľuďom na celom svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme Pána, aby zapálil srdcia mladých ľudí pre porozumenie radostnej zvesti evanjelia.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme Pána, aby dal všetkým ľuďom poznanie, že konzumný spôsob života vedie k záhube lásky a nádeje.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme Pána, aby stál pri nás v hodine našej smrti a bol nám nádejou na večnosť.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme Pána, aby sa našim zomrelým <font color='#B71C1C'>(M.)</font> zjavil ako pôvodca večnej blaženosti.",
                    "Bože Otče,<br>" +
                            "prosíme ťa,<br>" +
                            "prijmi a vypočuj naše modlitby<br>" +
                            "a sprevádzaj nás,<br>" +
                            "aby bol Kristus pre nás prameňom života a svätosti<br>" +
                            "i kráľom a strediskom našich sŕdc.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"", "C", "Bratia a sestry, Pán Ježiš povedal, že nik nemá väčšiu lásku ako ten, kto položí život za svojho priateľa. On sám zomrel za nás na dreve kríža a tým zjavil nekonečnú lásku svojho srdca k nám. Prosme ho, aby sme dokázali žiť v tejto jeho láske.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, prosíme ťa, aby tvoje potupením nasýtené srdce bolo posilou pre všetkých kresťanov, ktorí sú prenasledovaní pre svoju vieru.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, prosíme ťa, aby tvoje kopijou prerazené srdce bolo útechou pre všetky krajiny, ktoré boli zasiahnuté prírodnými a ekologickými katastrofami.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, prosíme ťa, aby tvoje chvály najhodnejšie srdce bolo vzorom pre všetkých, ktorí podľahli nástrahám siekt a mylných učení.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, prosíme ťa, aby tvoje srdce bohaté pre všetkých, ktorí ťa vzývajú, bolo prameňom našej túžby stretať sa s tebou v Eucharistii.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, prosíme ťa, aby tvoje srdce, nádej všetkých umierajúcich, obdarilo svojím svetlom našich zomrelých <font color='#B71C1C'>(M.)</font> a ukázalo im krásu raja.",
                    "Pane Ježišu Kriste, ty osviežuješ naše duše<br>" +
                            "a vedieš nás po správnych chodníkoch ako dobrý pastier;<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj naše prosby,<br>" +
                            "buď našim srdciam živou nádejou<br>" +
                            "a napĺňaj nás nehasnúcou útechou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            //KRISTA KRÁĽA
            {"8gkp", "A", "Bratia a sestry, Ježiš Kristus, náš kráľ a milujúci Boh, nás oslobodil od hriechu. Našou úlohou je priblížiť sa mu svojím dobrým životom. Preto sa spoločne modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, náš kráľ, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, náš kráľ a dobrý pastier, zhromaždi všetkých kresťanov vo svojej Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, knieža pokoja, vlož do sŕdc ľudí túžbu po mieri a pravom pokoji.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, kráľ a stredisko všetkých sŕdc, nauč nás vidieť v trpiacich teba, aby sme ti s láskou slúžili.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, náš sudca a spasiteľ, postav nás po svojej pravici, keď odovzdáš svoje kráľovstvo Otcovi.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, náš život a vzkriesenie, uveď našich zosnulých <font color='#B71C1C'>(M.)</font> do svojho nebeského kráľovstva.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby,<br>" +
                            "upevňuj v nás svoje kráľovstvo<br>" +
                            "a zachovaj nás vo svojej Cirkvi,<br>" +
                            "aby sme konali skutky milosrdenstva<br>" +
                            "a dosiahli večný život v nebi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"", "B", "Bratia a sestry, pri krste sme dostali účasť na Kristovej kráľovskej moci. Preto prosme nášho Pána, aby duchovná krása jeho kráľovstva zažiarila pred očami všetkých ľudí a národov.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, kráľ lásky, zmiluj sa nad nami.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, ty si kráľ milosti; žehnaj svoju Cirkev, aby sa všetkým javila ako kráľovstvo svätosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, ty si kráľ pokoja; vnukni všetkým ľuďom, že srdcom pokoja je pokoj v srdciach.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, ty si kráľ pravdy; priveď všetkých blúdiacich k svetlu pravej viery.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, ty si kráľ lásky; upevňuj v našich srdciach svoje kráľovstvo, aby sme ti zostali verní navždy.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, ty si kráľ života; udeľ našim zosnulým <font color='#B71C1C'>(M.)</font> večný život v nebeskom kráľovstve.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a kraľuj v našich srdciach,<br>" +
                            "aby sa tvoje nebeské kráľovstvo<br>" +
                            "stalo raz naším večným domovom.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"", "C", "Bratia a sestry, Pán Ježiš zjavil svetu svoju kráľovskú moc, keď umieral na kríži. Pokorne ho prosme, aby on bol kráľom našich sŕdc.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, kráľ našich sŕdc, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, nech hlas tvojej krvi na kríži i na našich oltároch združí všetkých kresťanov do pevnej jednoty.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, daj, nech všetci nositelia moci pochopia, že vládnuť znamená slúžiť.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, stoj pri umierajúcich, aby mohli vojsť do nebeského kráľovstva.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, zastaň sa svojich verných, ktorí pre teba znášajú súženia.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, zachovaj v nás účasť na tvojej kráľovskej moci, ktorú si nám dal pri svätom krste.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane Ježišu, spomeň si na všetkých zosnulých, ktorí kajúcne umreli, a vezmi ich do svojho nebeského kráľovstva.",
                    "Pane Ježišu,<br>" +
                            "kráľ Božieho ľudu a hlava Cirkvi,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pamätaj na nás vo svojom nebeskom kráľovstve.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            //8. DECEMBRA - NEPOŠKVRNENÉ POČATIE PANNY MÁRIE
            {"9gkp", "", "Bratia a sestry, v nepoškvrnenej Panne a Matke, uchránenej od dedičného hriechu, nám Boh dáva obraz nového ľudstva, ktoré má účasť na Kristovom víťazstve. V dôvere, že sa za nás prihovára Panna Mária, prosme nebeského Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby Cirkev, ktorá dosahuje v Panne Márii dokonalú svätosť, nasledovala Pannu a Matku ako svätá a nepoškvrnená nevesta, ktorá ide v ústrety prichádzajúcemu Kristovi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby ľudstvo našlo v nepoškvrnenej Panne Márii Matku a Kráľovnú a skrze ňu získalo pokoj a spásu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby sa hriešnici utiekali k Nepoškvrnenej a očistili sa vo sviatosti zmierenia od všetkých hriechov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby si ľudia vážili nový život počatý v lone matky a chránili ho ako živú ľudskú bytosť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby nám Eucharistia, ktorú slávime, bola žriedlom čistoty a svätosti a obnovila nás na tele i na duši, prosme Pána.",
                    "Dobrotivý Bože, vypočuj naše prosby a daj,<br>" +
                            "aby sme pod ochranou Nepoškvrnenej<br>" +
                            "víťazili nad nepriateľom našej spásy<br>" +
                            "a vytrvali v Božej milosti až do konca.<br>" +
                            "Skrze Krista, nášho Pána."},
            //SVÄTEJ RODINY JEŽIŠA, MÁRIE A JOZEFA
            {"10gkp", "A", "Bratia a sestry, Ježiš Kristus, Syn živého Boha, bol dieťaťom ľudskej rodiny. Prosme ho aj dnes, keď mnohé rodiny na celom svete prežívajú krízu, aby on bol ich záchranou a posvätením.",
                    "<font color='#B71C1C'>(</font>Volajme: Syn Boží, posväť a obnov naše rodiny.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, ustanovil si Cirkev ako veľkú Božiu rodinu; žehnaj ju a posilňuj v láske.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, ty si bol poslušný Márii a Jozefovi; nauč nás žiť v úcte a v poslušnosti voči rodičom a predstaveným.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, ty si miloval svojich rodičov a oni milovali teba; upevni všetky rodiny vo vzájomnej láske a pokoji.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, zachráň srdcia všetkých, ktorí sa sklamali v láske svojej rodiny, aby nezúfali, ale našli plnosť lásky v tebe.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, tvoji rodičia ťa hľadali a po troch dňoch našli v dome Otca; pomôž aj nám nachádzať ťa pri slávení liturgie.<br>" +
                            "<font color='#B71C1C'>6.</font> Ježišu, daj zomrelým <font color='#B71C1C'>(M.)</font>, ktorí nás predišli do večnosti so znakom viery, večný odpočinok v spoločenstve Svätej rodiny.",
                    "Syn Boží, s dôverou sme volali k tebe<br>" +
                            "o posvätenie a obnovu našich rodín;<br>" +
                            "daj, aby sme sa stali nositeľmi<br>" +
                            "tvojej blahozvesti vo svete,<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"", "B", "Bratia a sestry, zhromaždili sme sa ako jedna rodina, spojená tou istou vierou v Otca, ktorému predkladáme svoje modlitby a dúfame, že ich vyslyší. S dôverou sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev: aby vedela vo svete ukazovať pravú tvár rodiny, v ktorej sa všetci majú radi a každý je v nej ctený a vážený, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za kresťanov rôznych vyznaní: aby vytvárali medzi sebou mosty porozumenia a vzájomného prijatia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za utečencov a bezdomovcov: aby od kresťanov pocítili pomoc a lásku a zakúsili zmysel hlbokého všeobecného bratstva, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za deti a mládež: aby videli vo svojich rodičoch horlivých a úprimných vychovávateľov, ktorí im pomôžu objaviť vieru a pravý zmysel života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za manželov, ktorí sa nachádzajú v ťažkostiach: aby sa usilovali vybudovať svoj vzťah otvorením sa Božej láske, prosme Pána.",
                    "Bože, náš Otec,<br>" +
                            "ty si už od počiatku posvätil manželský a rodinný život;<br>" +
                            "prosíme ťa, požehnaj všetky rodiny,<br>" +
                            "aby boli znamením tvojej lásky.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"", "C", "Bratia a sestry, keď v duchu počujeme spev anjelov a hľadíme na Dieťa uložené v jasliach, zvelebujme Boha a prosme ho za naše rodiny i za spásu sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za svätú Cirkev: aby sa, obohatená radosťou z narodenia Spasiteľa, utvrdila v jednote a bola horlivá v apoštoláte, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za predstaviteľov štátov: aby rozumnými zákonmi chránili práva rodín, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za deti na celom svete: aby mali dostatok chleba, dobrú výchovu a učili sa milovať priateľa detí Ježiša Krista, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za manželstvá, ktoré nemajú dar detí: aby sa ich vzájomná láska otvorila tým, ktorí vo svete čakajú náklonnosť a prijatie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za tých, ktorí nemajú rodinu alebo od nej utekajú pre zlé vzťahy: aby mohli počítať s pomocou láskavých ľudí, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Za nás a naše rodiny: aby bol Spasiteľ stálym hosťom v našich srdciach a v našich domoch, prosme Pána.",
                    "Bože, náš Otec, ty si chcel,<br>" +
                            "aby sa tvoj Syn narodil v ľudskej rodine;<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "aby každé narodené dieťa malo milujúcich rodičov<br>" +
                            "a aby Cirkev vždy hľadala iba tvoju vôľu.<br>" +
                            "Skrze Krista, nášho Pána."},
            //KRST KRISTA PÁNA
            {"11gkp", "A", "Bratia a sestry, vzývajme nášho Vykupiteľa, ktorý pokorne prijal krst od Jána v Jordáne, a s dôverou volajme:",
                    "<font color='#B71C1C'>(</font>Pre svoj krst v Jordáne vyslyš nás, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, aby oplývala hojnosťou darov Ducha Svätého a bola matkou a učiteľkou všetkých.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za tých, ktorí spravujú národy, aby viedli ľud v súlade s Božími príkazmi k väčšiemu spoločnému dobru.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za všetkých pokrstených <font color='#B71C1C'>(</font>v tomto chráme<font color='#B71C1C'>)</font>, aby v sebe rozvíjali dary, ktoré dostali vo sviatosti krstu.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za katechumenov, ktorí sa pripravujú na krst, aby rástli v poznaní evanjelia a túžili po novom živote v Duchu Svätom.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nepokrstených, aby našli cestu viery a obmytím vo sviatosti krstu sa pridružili k Cirkvi.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za seba samých, aby sme si uvedomovali veľkú dôstojnosť, ktorú sme dostali v krste, a chránili sa hriechu.",
                    "Pane Ježišu,<br>" +
                            "nech sú ti milé naše modlitby<br>" +
                            "a nech dosiahneme všetko,<br>" +
                            "o čo s dôverou prosíme.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"", "B", "Bratia a sestry, krstom sme sa znovuzrodili, stali sme sa Božími deťmi a členmi Kristovej Cirkvi. Dnes, na sviatok Pánovho krstu, uvedomme si svoju dôstojnosť a prosme Pána za seba, za všetkých kresťanov i za celý svet.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za svätú Cirkev: aby stále čerpala z pokladu milostí a rozdávala veriacim tieto dary, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetky národy: aby vo svetle viery poznali, že len v Kristovi dosiahnu plný život, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za tých, ktorí trpia: aby ich Pán posilňoval v ťažkostiach a nám pomáhal zahŕňať ich starostlivosťou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás tu prítomných: aby sme mali silu premáhať svoje zlé sklony a hľadať užšie spojenie s Bohom a blížnymi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby ich Kristus, naša nádej, prijal do svojho kráľovstva, prosme Pána.",
                    "Pane Ježišu, milovaný Syn Otca,<br>" +
                            "v krste si nám dal účasť<br>" +
                            "na svojom kňazskom, prorockom a kráľovskom úrade;<br>" +
                            "prosíme ťa, posilňuj v nás krstné povedomie<br>" +
                            "a zachovaj nás v milosti Božieho synovstva.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"", "C", "Bratia a sestry, Boh nás vo sviatosti krstu prijal za svoje milované deti. Preto vrúcne volajme k nemu ako k svojmu nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože Otče, prosíme ťa za svätú Cirkev, aby s láskou a ochotou počúvala tvojho milovaného Syna.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože Otče, všetkým pokrsteným si daroval hodnosť Božích detí; daj, aby si cenili tento veľký dar milosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože Otče, tvoje večné Slovo, Ježiš Kristus, prišiel spasiť všetkých ľudí; osvecuj a ochraňuj všetkých katechumenov Cirkvi.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože Otče, rodičom prinášajúcim svoje dieťa k sviatosti krstu pomáhaj, aby cítili zodpovednosť za ďalší rozvoj viery v živote dieťaťa.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože Otče, tvoj Syn sa pokoril a prijal krst od svojho služobníka; udeľ nám ducha pokornej služby bratom a sestrám.<br>" +
                            "<font color='#B71C1C'>6.</font> Bože Otče, vysloboď duše z očistca, aby ťa mohli oslavovať v nebeskom kráľovstve.",
                    "Bože, Otče milosrdenstva,<br>" +
                            "prijmi naše prosby<br>" +
                            "a posilňuj nás duchom pravdy,<br>" +
                            "aby sme vždy boli tvojimi milovanými deťmi.<br>" +
                            "O to ťa prosíme skrze Krista, nášho Pána."},
    };

    String[][] prosby1 = {
            // DRUHÁ NEDEĽA PO NARODENÍ PÁNA
            {"A", "Bratia a sestry, skrze Ježiša Krista máme otvorený prístup k Otcovi. Preto sa k nemu modlime a volajme:",
                    "<font color='#B71C1C'>(</font>Zmiluj sa, Pane, a vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za pastierov Cirkvi, aby verne strážili poklad Božieho zjavenia, ktorý bol zverený do ich starostlivosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za všetkých, ktorí spravujú národy, aby podporovali slobodné vyznávanie viery.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za chorých a duševne trpiacich, aby im Boh dal silu a pokoj srdca.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za kresťanské rodiny v našej krajine, aby boli opravdivou školou evanjelia.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás tu zhromaždených: aby sme radi čítali Sväté písmo a rozjímali o jeho pravdách.",
                    "Bože, ty si poslal na svet svojho Syna,<br>" +
                            "Slovo a odvekú Múdrosť,<br>" +
                            "aby nás spasil svojím narodením, životom,<br>" +
                            "smrťou i oslávením;<br>" +
                            "vypočuj prosby,<br>" +
                            "ktoré ti v jeho mene prednášame,<br>" +
                            "lebo on žije a kraľuje na veky vekov."},
            {"B", "Bratia a sestry, vo Vianočnom období osobitne cítime otcovskú lásku Boha. Posilnení jeho slovom, prednesme mu svoje pokorné prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Otče, vyslyš prosby svojich detí.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za svätú Cirkev, aby žila v múdrosti evanjelia a neustále kráčala v Pánovom svetle.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za novopokrstených, aby vytrvali vo viere a otvárali sa pôsobeniu Ducha Svätého.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za mladých, ktorí hľadajú zmysel svojho života, aby vytrvali v spoločenstve s Bohom i Cirkvou.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za chorých a trpiacich, aby narodenie Krista bolo pre nich posilou vo chvíľach slabostí a pochybností.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby láska božského Dieťaťa pretvárala naše srdcia.",
                    "Buď zvelebený Bože, Otec všetkých ľudí,<br>" +
                            "za to, že v Ježišovi Kristovi spoznávame tvoju tvár;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a obdaruj nás svojimi milosťami.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"C", "Bratia a sestry, v Ježišovi Kristovi Boh Otec povolal všetkých ľudí k spáse. Modlime sa, aby všetci spoznali pravú múdrosť a našli cestu k nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Kristovu Cirkev: aby žila podľa Božích prikázaní, a tak bola vzorom tomuto svetu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za tých, ktorí žijú v temnotách hriechu: aby v narodenom Mesiášovi našli zmysel svojho života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za tých, ktorí sú prenasledovaní pre lásku ku Kristovi: aby vytrvali vo viere a nádeji, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za všetkých ľudí: aby boli svätí a nepoškvrnení pred tvárou Boha, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás samých: aby sme z rúk Krista prijímali dar viery a horlivo ho odovzdávali svojim bratom a sestrám, prosme Pána.",
                    "Bože, Otče, vypočuj naše prosby<br>" +
                            "a priveď všetkých ľudí<br>" +
                            "k účasti na svetle tvojej slávy.<br>" +
                            "Skrze Krista, nášho Pána."},

            {"01gk", "Bratia a sestry, Ježiš, Syn Panny Márie, je náš pokoj. Preto ho dnes s dôverou prosme za Boží ľud a za pokoj vo svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, Syn Márie Panny, zmiluj sa nad nami.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, Syn Márie Panny, žehnaj nášho Svätého Otca <font color='#B71C1C'>M.</font>, nášho biskupa <font color='#B71C1C'>M.</font> a všetkých biskupov a kňazov, aby v neporušenej viere viedli tvoj ľud po ceste spásy.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, Boh pokoja, daj, nech sa vo svete upevňuje pokoj, založený na spravodlivosti, slobode a láske.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, Spasiteľ sveta, priveď na cestu spásy všetkých, ktorí ťa hľadajú s úprimným srdcom.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, náš Pán a Ochranca, posilňuj všetkých, ktorí prežili ťažký rok, a daj, aby ten začínajúci bol pre nich pokojný a obohacujúci.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, náš život, žehnaj a ochraňuj všetkých členov nášho <font color='#B71C1C'>(</font>farského<font color='#B71C1C'>)</font> spoločenstva, aby sme celý rok žili v tvojej milosti.",
                    "Pane Ježišu, Syn Márie Panny,<br>" +
                            "zmiluj sa nad nami a vyslyš naše prosby;<br>" +
                            "daj, aby sme pod ochranou Panny Márie, Matky Cirkvi,<br>" +
                            "premáhali pokušenia,<br>" +
                            "vzmáhali sa v čnostiach<br>" +
                            "a všade šírili tvoju lásku a pokoj.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"2", "Bratia a sestry, modlime sa k Bohu Otcovi, ktorý nás tak miluje, že nám poslal svojho jednorodeného Syna za Spasiteľa, a pokorne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, posilňuj všetkých biskupov, kňazov a diakonov, aby s radosťou ohlasovali zvesť o tvojom príchode na svet.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, daj nám v tomto vianočnom čase viac pocítiť blízkosť tvojej lásky.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, nech všetci hriešnici spoznajú, že len v tebe nájdu odpustenie hriechov a novú nádej do života.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, priveď obyvateľov našej krajiny k poznaniu, že len národ otvorený životu má budúcnosť a prežije.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, nedopusť, aby nás zaslepila temnota hriechu a nenávisti voči blížnym.<br>" +
                            "<font color='#B71C1C'>6.</font> Bože, zmiluj sa nad všetkými zomrelými, ktorí vinou iných ľudí prišli o život.",
                    "Milosrdný Bože,<br>" +
                            "kto pozná tvoju lásku,<br>" +
                            "musí ťa milovať ako najvyššie dobro;<br>" +
                            "vypočuj naše pokorné prosby<br>" +
                            "a prijmi našu vďaku za tvojho Syna Ježiša Krista,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"02a", "Bratia a sestry, pri spomienke na svätých biskupov Bazila a Gregora prednesme svoje pokorné prosby Ježišovi Kristovi, nášmu Spasiteľovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Obnov nás, Pane, a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za svätú Cirkev, aby ohlasovala vo svete takú lásku, akú chce Boh preukázať všetkým ľuďom.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za biskupov, aby ich v námahách pastierskej služby posilňoval Duch Svätý.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za všetkých verejných predstaviteľov, aby ochotne pomáhali pri budovaní pokoja.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za ľudí, ktorí opustili Boha, aby sa dotknutí jeho milosťou vrátili na cestu viery.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za naše spoločenstvo, aby sme vytrvalo hľadali Pána a vždy dokázali spoznať znamenie jeho prítomnosti.",
                    "Pane Ježišu,<br>" +
                            "podporení príhovorom svätých biskupov Bazila a Gregora<br>" +
                            "plne dôverujeme, že si vyslyšal prosby,<br>" +
                            "ktoré sme ti predniesli.<br>" +
                            "Veď nás stále po ceste spásy.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"3", "Bratia a sestry, Ježiš Kristus prišiel v mene svojho Otca, a tak naplnil jeho odveký prísľub, že pošle Vykupiteľa. S radostným a vďačným srdcom ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Nech tvoje narodenie, Pane, poteší celý svet.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, ty si prišiel na svet a stal si sa hlavou Cirkvi; daj, nech vzrastá ako tvoje tajomné telo a nech sa buduje v láske.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, ty si prišiel, aby si spasil všetkých ľudí; daj, aby sa všade na svete vzývalo tvoje slávne meno.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, ty si ochranca slabých a tešiteľ zarmútených; posilni pokúšaných, zdvihni padnutých a poteš zúfalých.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, ty si prišiel, aby si sa nám pripodobnil vo všetkom okrem hriechu; osvieť hriešnikov, ktorí nerobia pokánie, aby sa vrátili na správnu cestu.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, ty si prišiel, aby si nám sprostredkoval vôľu nášho Otca; daj nám silu žiť podľa tvojich prikázaní.<br>" +
                            "<font color='#B71C1C'>6.</font> Ježišu, ty si prišiel, aby si rozlámal okovy smrti; priveď našich zosnulých <font color='#B71C1C'>(M.)</font> do večného života.",
                    "Pane Ježišu,<br>" +
                            "tvoj príchod potešil celý svet;<br>" +
                            "zostávaj stále s nami<br>" +
                            "a posilňuj nás vo svätosti života.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"03a", "Bratia a sestry, vzývanie Ježišovho svätého mena je najjednoduchším spôsobom ustavičnej modlitby. V pokore prosme Pána a volajme:",
                    "<font color='#B71C1C'>(</font>Ježišu, Syn Otca, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, na tebe spočinul Duch Pána; daj, aby Duch Svätý viedol tvoju Cirkev k obnove a svätosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, Dobrý pastier, pomáhaj pastierom Cirkvi, aby svojím postojom a príkladom viedli veriacich do Božieho kráľovstva.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, Boh pokoja, daruj všetkým národom svoj pokoj, aby žili v bezpečí a bratskom porozumení.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, naša cesta a náš život, ukáž mladým cestu, ktorú si každému z nich určil, a pomôž im, aby šli po nej a boli šťastní.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, obraz Otca, daj, aby sme mali bázeň pred tvojím svätým menom a zároveň ho milovali.<br>" +
                            "<font color='#B71C1C'>6.</font> Ježišu, žiara večného svetla, prijmi na svadobnú hostinu zosnulých, na ktorých si nik osobitne nespomína.",
                    "Pane Ježišu, prijmi naše prosby<br>" +
                            "a príď k nám s hojnou milosťou,<br>" +
                            "aby sme skrze teba mohli prísť k Otcovi.<br>" +
                            "Ty žiješ a kraľuješ na veky vekov."},
            {"4", "Bratia a sestry, Ježiš Kristus prišiel na túto zem, aby nás posvätil a spasil. Obráťme sa teraz s dôverou k nemu a prosme za seba i za všetkých veriacich.",
                    "<font color='#B71C1C'>(</font>Volajme: Baránok Boží, zmiluj sa nad nami.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, ty si ustanovil apoštola Petra za hlavu Cirkvi; pomáhaj nášmu pápežovi <font color='#B71C1C'>M.</font> pri jej spravovaní.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, ty si prišiel na svet ako pravý pokoj; stoj pri všetkých predstaviteľoch štátov, ktorí vedú mierové rokovania.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, ty si učiteľ večnej pravdy; upevňuj vo viere v teba všetkých hľadajúcich a nerozhodných.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, ty si priniesol na svet lásku; daj nám silu milovať aj svojich nepriateľov.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, ty si prijal našu ľudskú prirodzenosť; ustavične v nás vzbudzuj odpor voči hriechu.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane Ježišu, ty nám dávaš večný život; otvor brány večnej blaženosti našim zosnulým <font color='#B71C1C'>(M.)</font>, aby ich narodenie pre nebo a stretnutie s tebou<br>" +
                            "bolo naplnením večného šťastia v nebeskej radosti.",
                    "Ježišu, nekonečná láska,<br>" +
                            "bez teba by náš život nemal zmysel;<br>" +
                            "vypočuj nás a zmiluj sa nad nami,<br>" +
                            "aby sme sa po skončení pozemského života<br>" +
                            "mohli spolu s tebou radovať v nebi,<br>" +
                            "kde žiješ a kraľuješ na veky vekov."},
            {"5", "Bratia a sestry, nebeský Otec nám poslal svojho Syna, aby sme mali život a aby sme sa podľa jeho príkladu naučili milovať iných. Obráťme sa na neho s dôverou a prosme ho, aby nám dal silu nasledovať ho.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, posilni našu vieru.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daruj zdravie a silu nášmu Svätému Otcovi <font color='#B71C1C'>M.</font> i nášmu biskupovi <font color='#B71C1C'>M.</font><br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, udeľ všetkým verejným činiteľom čnosť jednoduchosti a pokory.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, posilňuj nás v skutkoch lásky k našim blížnym, ktorí sú v núdzi a potrebujú našu pomoc.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, daj odvahu mladým mužom, ktorí ťa chcú nasledovať a slúžiť tvojej Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, požehnávaj naše rodiny, aby sa v nich každý deň rodila obetavosť, tolerancia, vzájomný dialóg a odpustenie.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane Ježišu, nauč nás modliť sa a dôverovať tvojim slovám.",
                    "Pane Ježišu,<br>" +
                            "pozri na naše pokorné prosby<br>" +
                            "a vypočuj ich,<br>" +
                            "aby sme rástli v láske k tebe<br>" +
                            "a k našim blížnym.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            // 6. januára - ZJAVENIE PÁNA - A
            {"06gk", "Bratia a sestry, pokloňme sa nášmu Kráľovi uloženému v jasliach a nábožne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pre svoje zjavenie vyslyš nás, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Cirkev: nebeský Ženích, posväcuj svoju nevestu Cirkev a urob ju znamením lásky pre všetky národy.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za celý svet: Kráľ slávy, zažiar ako svetlo národom a priveď ich do svojho kráľovstva.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za tých, ktorí hľadajú Pána: Spasiteľ sveta, priveď k sebe všetkých, ktorí ťa hľadajú s úprimným srdcom.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za pochybujúcich vo viere: Ježišu, prameň svätosti, daruj im pevnú vieru, aby láskou k tebe a k ľuďom odpovedali na tvoje zjavenie.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme aj za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: Kráľ všetkých sŕdc, pritiahni nás k sebe a daj, aby sme ťa často navštevovali a klaňali sa ti v Oltárnej sviatosti.",
                    "Ježišu, Kráľ slávy,<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "aby sme ako synovia svetla kráčali v ústrety tebe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"B", "Bratia a sestry, Ježiš Kristus, svetlo sveta, sa dáva spoznať všetkým národom. Vrúcne ho prosme, aby všetci ľudia v ňom našli spásu.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Svätého Otca: aby jeho výzvy k pokoju a bratstvu našli ozvenu v srdciach ľudí, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za pokrstených: aby Ježiš Kristus, pravé svetlo, priviedol všetkých k jednote viery a lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých ľudí: aby ich Ježiš Kristus, na príhovor Panny Márie, zahrnul hojnosťou svojich darov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za vedeckých pracovníkov: aby svojou prácou podporovali rozvoj ľudskej spoločnosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby ich Ježiš Kristus, sudca živých i mŕtvych, pridružil k zástupom blažených, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "tvoje svetlo priviedlo mudrcov<br>" +
                            "k poznaniu pravdy o tvojom narodení;<br>" +
                            "nedovoľ, aby sme sa ponorili do tmy hriechu,<br>" +
                            "ale daj, aby sme stále kráčali vo svetle tvojej milosti.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"C", "Bratia a sestry, Ježiš je Syn Boží a syn Panny Márie; jeho narodenie a zjavenie prežívame v hlbokej radosti. Prosme ho teda s dôverou.",
                    "<font color='#B71C1C'>(</font>Volajme: Pre svoje zjavenie vyslyš nás, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Cirkev, ktorá je ohlasovateľkou Ježišových slov, aby zvestovala evanjelium celému svetu.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za národy Blízkeho východu, aby sa spravodlivým riešením sporných otázok nastolil vo Svätej zemi pravý a trvalý pokoj.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za neveriacich a hľadajúcich ľudí, aby vďaka životu horlivých kresťanov spoznali Ježiša Krista ako Boha a Pána celého sveta.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za duše v očistci, aby sa mohli spolu so všetkými svätými radovať v nebeskom kráľovstve.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za nás tu zhromaždených, aby nás dnešná slávnosť posilnila vo viere a v odhodlaní slúžiť Bohu.",
                    "Pane Ježišu, stal si sa človekom,<br>" +
                            "aby sme sa my mohli stať Božími deťmi;<br>" +
                            "ďakujeme ti za to a prosíme ťa,<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "aby sme vždy zostali<br>" +
                            "tvojimi vernými bratmi a sestrami.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"7", "Bratia a sestry, so všetkými bratmi a sestrami, spojenými s nami v modlitbe, velebme Boha a prosme ho.",
                    "<font color='#B71C1C'>(</font>Volajme: Ukáž nám, Otče, svoje milosrdenstvo.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, posväcuj svojím Duchom všetkých služobníkov Cirkvi, aby boli svetlom pre všetky národy.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, udeľ milosť tým, ktorí spravujú náš národ, aby videli jeho skutočné problémy a chceli ich riešiť v tvojom svetle.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, požehnávaj všetkých, ktorí ťa nasledujú v chudobe, čistote a poslušnosti.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, sprevádzaj všetkých cestujúcich prostredníctvom svojich anjelov a chráň ich od každého zla a od náhlej a nekajúcej smrti.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, daj, aby sme slovom aj skutkami vždy dokázali vyznávať, že patríme tebe a tvojej Cirkvi.",
                    "Všemohúci Bože,<br>" +
                            "prenikni svojím Duchom naše životy,<br>" +
                            "aby sme vedeli kráčať po pravej ceste,<br>" +
                            "ktorú nám zjavil tvoj Syn Ježiš Kristus.<br>" +
                            "Lebo on s tebou žije a kraľuje na veky vekov."},
            {"8", "Bratia a sestry, pokorne prosme nebeského Otca za spásu sveta, veď on poslal svojho Syna ako svetlo národov.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, požehnávaj všetkých, ktorí v Cirkvi ohlasujú tvoje evanjelium.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, prosíme za vládnych predstaviteľov, aby hľadali nové riešenia a východiská pre nezamestnaných.<br>" +
                            "<font color='#B71C1C'>3.</font> Sprevádzaj svojím požehnaním deti, ktoré si musia ťažkou prácou zarábať na živobytie.<br>" +
                            "<font color='#B71C1C'>4.</font> Napĺňaj nás svojím Duchom, aby sme vedeli pochopiť pravý zmysel posvätnej liturgie.<br>" +
                            "<font color='#B71C1C'>5.</font> Stoj pri všetkých veriacich, aby boli dostatočne citliví pre potreby druhých.<br>" +
                            "<font color='#B71C1C'>6.</font> Otče, priveď našich zomrelých <font color='#B71C1C'>(M.)</font> do nebeského kráľovstva, aby naveky hľadeli na tvoju velebu.",
                    "Bože Otče,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a prenikni ľudí svetlom svojej milosti,<br>" +
                            "aby všetci poznali tvojho Syna<br>" +
                            "a získali večnú spásu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"9", "Bratia a sestry, obráťme sa na Ježiša, ktorého poslúchajú aj živly sveta, a s dôverou v jeho lásku sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, veď svoju Cirkev cez búrky dnešnej doby a daj, aby bola svetlom spásy pre všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>2.</font> Ochraňuj cestujúcich i pracovníkov dopravy, aby vždy bezpečne dosiahli cieľ svojej cesty.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, daj, aby sa zvesť o tvojom narodení rozniesla aj medzi tie národy, ktoré doposiaľ nepoznali posolstvo lásky a vykúpenia.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, daj nám silu svojho Ducha, aby sme dokázali obstáť v skúškach a krízach nášho života.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás vyhýbať sa zlu a konať dobro nie zo strachu pred trestom, ale z lásky k tebe.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane Ježišu, radosť anjelov, daj, aby ťa naši zosnulí <font color='#B71C1C'>(M.)</font> naveky chválili s anjelmi v nebi.",
                    "Pane Ježišu,<br>" +
                            "ty môžeš všetko,<br>" +
                            "veď si Pánom celého sveta;<br>" +
                            "udeľ svoje milosti tým,<br>" +
                            "ktorí ťa o ne prosia.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"10", "Bratia a sestry, prosme Krista, učiteľa lásky, aby nás naučil správne milovať Boha i ľudí, a s dôverou mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pre svoje zjavenie vyslyš nás, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, veď a sprevádzaj svojím Duchom nášho pápeža <font color='#B71C1C'>M.</font>, aby bol pre všetkých ľudí neohrozeným hlásateľom a svedkom evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, daj, aby sa evanjelium šírilo do všetkých národov a aby ťa ľudia spoznali ako svojho Záchrancu a Spasiteľa.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, nauč nás plniť tvoje prikázania, a tak vydávať svedectvo, že sme Božími deťmi.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, požehnaj našich rodičov i starých rodičov, priateľov i všetkých našich dobrodincov.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, pošli robotníkov do svojej vinice, aby sa všade ohlasovala tvoja blahozvesť.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane Ježišu, posilňuj nás, aby sme ochotne brali do rúk Sväté písmo a v praktickom živote uskutočňovali jeho posolstvo.",
                    "Ježišu Kriste,<br>" +
                            "milostivo vypočuj naše prosby a daj,<br>" +
                            "aby sme po celý život<br>" +
                            "ostali verní evanjeliu lásky.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"11", "Bratia a sestry, náš Boh, ktorý je milostivý a milosrdný, láskavo zhliada na tých, ktorí sa k nemu s dôverou obracajú. Preto ho úprimne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, rozšír svoju Cirkev po celom svete, aby sa všade zjavila sláva tvojho Syna.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, naplň darom múdrosti tých, ktorí nás spravujú, aby citlivo riešili sociálne otázky spoločnosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, povzbudzuj ľudí žijúcich v krajinách ohrozených vojnou, že si s nimi a že ich nikdy neopustíš.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, ty si rozhodol, aby sa nový ľudský život zrodil z lásky muža a ženy; daj, aby každé dieťa mohlo poznať svojho otca i matku.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, ty si priviedol k svojmu Synovi pohanských mudrcov; pomôž hľadajúcim nájsť pravú vieru.<br>" +
                            "<font color='#B71C1C'>6.</font> Otče, tvoj Syn prišiel na zem, aby vzal na seba naše slabosti a bolesti; otvor nám srdce pre súcit s každým trpiacim človekom.",
                    "Nebeský Otče,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomáhaj nám rásť v láske,<br>" +
                            "aby sme nerobili medzi sebou rozdiely,<br>" +
                            "ale s láskou sa obracali ku každému,<br>" +
                            "kto potrebuje našu pomocnú ruku.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"12", "Bratia a sestry, od Jána Krstiteľa prijalo krst veľa ľudí, ktorí pokáním zmenili svoj život. Krstom tvoríme jeden Boží ľud, preto sa s radostným srdcom obráťme na Otca všetkých národov a spoločne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože Otče, v jednote s naším pápežom <font color='#B71C1C'>M.</font> a s naším biskupom <font color='#B71C1C'>M.</font> ťa prosíme za tvoju Cirkev, aby ako jasná hviezda viedla tvoj ľud k tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože Otče, ty si dal zem do vlastníctva človeku; prosíme ťa za predstaviteľov štátov, aby múdro spravovali im zverené krajiny.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože Otče, v Jánovi Krstiteľovi si nám dal vzor kresťanskej pokory; daj, nech v nás ubúda pýcha a rastie tvoja láska.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože Otče, ty nám dávaš chlieb z neba; prosíme ťa, prijímaním Oltárnej sviatosti nás pretváraj na svoju podobu.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože Otče, tvoj Syn Ježiš Kristus svojím narodením vstúpil do ľudskej rodiny a posvätil ju; prosíme ťa, stoj pri tých, ktorí vo svojich rodinách nenachádzajú pokoj a oporu.",
                    "Otče, my sme tiež prijali krst,<br>" +
                            "aby sme boli očistení od hriechov<br>" +
                            "a začali žiť novým životom;<br>" +
                            "prosíme ťa, vypočuj naše prosby,<br>" +
                            "ktoré ti dnes prednášame.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"13", "Bratia a sestry, svätý biskup Hilár s obetavosťou bránil pravú kresťanskú vieru a vynikal obdivuhodnou znalosťou Svätého písma. Na jeho orodovanie prosme o upevnenie svojej viery.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daruj Cirkvi svedomitých biskupov, kňazov a diakonov, ktorí budú hlásať tvoje slovo s oddanosťou a láskou.<br>" +
                            "<font color='#B71C1C'>2.</font> Upevňuj národy v úsilí o svornosť a pokoj, aby vo svete víťazila jednota a porozumenie.<br>" +
                            "<font color='#B71C1C'>3.</font> Ochraňuj prenasledovaných pre vieru a pomáhaj im čerpať silu z prameňa Božieho slova.<br>" +
                            "<font color='#B71C1C'>4.</font> Stoj pri nás v situáciách, v ktorých by sme sa mali zastať svojej viery a vydať svedectvo o kresťanskom živote.<br>" +
                            "<font color='#B71C1C'>5.</font> Priveď našich zomrelých <font color='#B71C1C'>(M.)</font> k poznaniu večnej blaženosti a radosti v spoločenstve svätých.",
                    "Ježišu, náš Kráľ a Vykupiteľ,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a na príhovor svätého biskupa Hilára<br>" +
                            "nám pomôž uskutočňovať skutkami to,<br>" +
                            "čo vyznávame vierou v teba.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"17", "Bratia a sestry, pri spomienke na svätého opáta Antona prednesme svoje prosby Bohu a prosme o duchovnú silu a vytrvalosť vo viere.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože Otče, požehnávaj Svätého Otca <font color='#B71C1C'>M.</font>, aby posilnený modlitbou viedol veriacich k poznaniu milujúceho Krista.<br>" +
                            "<font color='#B71C1C'>2.</font> Obdaruj predstaviteľov štátov jasnou mysľou a čistým svedomím, aby vládli spravodlivo a múdro.<br>" +
                            "<font color='#B71C1C'>3.</font> Ujmi sa chudobných i biednych a ukáž im bohatstvo duchovnej sily prameniacej z Kristovho kríža.<br>" +
                            "<font color='#B71C1C'>4.</font> Nauč nás zodpovedne sa starať o svoje rodiny a venovať svoj čas rovnako práci i modlitbe.<br>" +
                            "<font color='#B71C1C'>5.</font> Priveď našich zomrelých <font color='#B71C1C'>(M.)</font> k nehasnúcemu svetlu blaženosti a k prameňu nekonečného milosrdenstva.",
                    "Najláskavejší Otče,<br>" +
                            "vo svätom opátovi Antonovi si nám ukázal,<br>" +
                            "ako zápasiť s pokušeniami<br>" +
                            "a rásť v duchovnom živote;<br>" +
                            "prijmi naše modlitby a otvor nám srdcia,<br>" +
                            "aby sme stále viac poznávali tvoju pravdu<br>" +
                            "a milovali tvoju dobrotu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20b", "Bratia a sestry, pozdvihnime svoj zrak ku Kristovi a prosme ho, aby na príhovor svätého mučeníka Šebastiána, patróna vojakov, ochraňoval všetkých ľudí na svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetok kresťanský ľud: aby každý videl v blížnom svojho brata a aby si všetci navzájom pomáhali, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za ozbrojené sily a ozbrojené zbory: aby vždy chránili mier a bezpečnosť všetkých obyvateľov krajín, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za chorých a trpiacich: aby sa posilňovali vo viere a v zápase o spásu svojich duší, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás tu prítomných: aby sme nosili v sebe živú nádej na víťazstvo dobra a spravodlivosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zomrelých <font color='#B71C1C'>(M.)</font>: aby dosiahli večnú odmenu v kráľovstve nekonečného svetla a milosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6. V Ordinariáte OS a OZ SR:</font> Za príslušníkov ozbrojených zložiek na Slovensku: aby ochotne nasledovali čnosti svätého Šebastiána, prosme Pána.",
                    "Ježišu Kriste, náš ochranca, vypočuj naše modlitby,<br>" +
                            "zachovaj nás v pevnosti viery<br>" +
                            "a pretváraj naše mysle, aby sme sa úplne odovzdali tebe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"20g+", "Bratia a sestry, pozdvihnime svoj zrak ku Kristovi a prosme ho, aby na príhovor svätého mučeníka Šebastiána, patróna vojakov, ochraňoval všetkých ľudí na svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za všetok kresťanský ľud: aby každý videl v blížnom svojho brata a aby si všetci navzájom pomáhali, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za ozbrojené sily a ozbrojené zbory: aby vždy chránili mier a bezpečnosť všetkých obyvateľov krajín, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za chorých a trpiacich: aby sa posilňovali vo viere a v zápase o spásu svojich duší, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás tu prítomných: aby sme nosili v sebe živú nádej na víťazstvo dobra a spravodlivosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zomrelých <font color='#B71C1C'>(M.)</font>: aby dosiahli večnú odmenu v kráľovstve nekonečného svetla a milosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6. V Ordinariáte OS a OZ SR:</font> Za príslušníkov ozbrojených zložiek na Slovensku: aby ochotne nasledovali čnosti svätého Šebastiána, prosme Pána.",
                    "Ježišu Kriste, náš ochranca, vypočuj naše modlitby,<br>" +
                            "zachovaj nás v pevnosti viery<br>" +
                            "a pretváraj naše mysle, aby sme sa úplne odovzdali tebe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"21", "Bratia a sestry, pri spomienke na svätú Agnesu, pannu a mučenicu, prosme Pána o posilu pri obrane viery a zachovaní čistoty pre nás i pre celý svet.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daruj svojej Cirkvi horlivých a svätých duchovných pastierov.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilňuj všetkých arcibiskupov metropolitov, aby múdro zastávali úrad, ktorý im je zverený.<br>" +
                            "<font color='#B71C1C'>3.</font> Na orodovanie svätej Agnesy vnukni mladým ľuďom odvahu nasledovať ťa v panenskej čistote.<br>" +
                            "<font color='#B71C1C'>4.</font> Udeľ našim časom svoj pokoj a upevňuj priateľstvo medzi národmi.<br>" +
                            "<font color='#B71C1C'>5.</font> Podporuj tých, ktorí slovom i písmom upevňujú a bránia čistotu mladej generácie.<br>" +
                            "<font color='#B71C1C'>6.</font> Pre mučenícku krv svätej Agnesy udeľ našim chlapcom a dievčatám silu pri obrane čistoty.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a daj, aby sme na príhovor svätej panny Agnesy<br>" +
                            "premáhali pokušenia tela, sveta i zlého ducha<br>" +
                            "a slúžili ti s čistým srdcom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"24", "Bratia a sestry, vo svete je veľa nelásky a nervozity. Dnes pri spomienke na svätého Františka Saleského prosme Pána za trpezlivosť a lásku i za pokoj vo svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, pošli svojej Cirkvi horlivých a láskavých biskupov a kňazov.<br>" +
                            "<font color='#B71C1C'>2.</font> Priveď všetkých blúdiacich k pravej viere a čnostnému životu.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, aby si všetci uvedomili dôstojnosť človeka stvoreného na Boží obraz.<br>" +
                            "<font color='#B71C1C'>4.</font> Osvieť svetlom Ducha Svätého všetkých, ktorí šíria Kristovu náuku.<br>" +
                            "<font color='#B71C1C'>5.</font> Vzbuď pocit zodpovednosti za mravnosť u tých, ktorí sa písaným slovom prihovárajú čitateľom.<br>" +
                            "<font color='#B71C1C'>6.</font> Daj nám silu, aby sme sa dokázali vyhýbať knihám, ktoré svojím obsahom odporujú tvojmu učeniu vo veciach viery a mravov.",
                    "Dobrotivý Bože,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme láskavosťou a trpezlivosťou<br>" +
                            "získavali pre teba svojich blížnych<br>" +
                            "a stále kráčali po ceste pravdy.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"25g", "Bratia a sestry, všemohúci Pán obrátil Šavla, ktorý sa z prenasledovateľa stal horlivým kresťanom, a ustanovil ho za apoštola národov. Prosme Pána, aby jeho milosť v nás premáhala hriech a nepriateľstvá medzi národmi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, posielaj svojej Cirkvi neohrozených hlásateľov Kristovej pravdy a lásky.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomôž národom sveta poznať posolstvo apoštola Pavla.<br>" +
                            "<font color='#B71C1C'>3.</font> Priveď všetkých, ktorí hľadajú pravdu a múdrosť života, do náručia svojej Cirkvi.<br>" +
                            "<font color='#B71C1C'>4.</font> Povzbudzuj všetkých, ktorí prijali ten istý krst, aby boli jednotní a vyznávali tú istú vieru.<br>" +
                            "<font color='#B71C1C'>5.</font> Požehnávaj úsilie tých, ktorí nepoukazujú na to, čo rozdeľuje, ale hľadajú, čo spája.<br>" +
                            "<font color='#B71C1C'>6.</font> Obdaruj nás všetkých tu prítomných horlivosťou za vieru.",
                    "Bože Otče,<br>" +
                            "ty si ukázal na svätom apoštolovi Pavlovi,<br>" +
                            "že tvoje milosrdenstvo je nekonečné;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme na svete nič tak nepoznali<br>" +
                            "ako ukrižovaného Ježiša,<br>" +
                            "ktorý s tebou žije a kraľuje na veky vekov."},
            {"26", "Bratia a sestry, svätí Timotej a Títus odhodlane a nebojácne hlásali Božie slovo medzi kresťanmi v prvotnej Cirkvi. Modlime sa za šírenie Božieho slova v dnešnom svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, ty zjednocuješ Cirkev v slovách evanjelia; zachovávaj svojich služobníkov v jednote ducha a v spoločenstve pokoja.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, ty si prišiel spasiť celé ľudstvo; zjavuj svoje vykupiteľské víťazstvo národom, ktoré ťa ešte nepoznajú.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, ty si večne prítomný pod spôsobom chleba a vína v Eucharistii; buď posilou všetkých hriešnikov, ktorí sa chcú kajúcne vrátiť k tebe.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, ty si vyvolil apoštolov, aby národom ohlásili Boží plán spásy; urob aj z nás nadšených svedkov radostnej zvesti.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, ty si nám ukázal Božie kráľovstvo; priveď našich zomrelých <font color='#B71C1C'>(M.)</font> k plnej účasti na Božej sláve.",
                    "Pane Ježišu Kriste,<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a pomáhaj nám, aby sme nasledovali tvoj príklad<br>" +
                            "a žili život plný obety, lásky a služby blížnym.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"28", "Bratia a sestry, Boh je prameň všetkej pravdy. Dnes pri spomienke na svätého Tomáša, anjelského učiteľa, prosme Pána o pravú múdrosť a vrúcnu nábožnosť.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, posielaj svojej Cirkvi múdrych a nábožných učiteľov kresťanskej náuky.<br>" +
                            "<font color='#B71C1C'>2.</font> Vnukni všetkým ľuďom, aby cez stvorené veci spoznali svojho Stvoriteľa a Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Osvieť kňazov a katechétov svetlom svojho Ducha, aby poúčali svojich poslucháčov slovom i príkladom.<br>" +
                            "<font color='#B71C1C'>4.</font> Upevni vyučujúcich na teologických fakultách v pravej viere a náuke, v čistote i nábožnosti a vlej do ich sŕdc nadšenie za Kristovo evanjelium.<br>" +
                            "<font color='#B71C1C'>5.</font> Pouč našich rodičov, že oni sú pre svoje deti prvými učiteľmi viery.",
                    "Otče, vyslyš naše prosby<br>" +
                            "a na príhovor anjelského učiteľa<br>" +
                            "udeľ dary svojho Ducha našim bohoslovcom,<br>" +
                            "aby sa z nich stali svätí kňazi,<br>" +
                            "a osvieť všetkých ľudí,<br>" +
                            "aby ich nádherný súlad vo vesmíre<br>" +
                            "priviedol k pôvodcovi dobra a krásy.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "Bratia a sestry, v tejto spoločnej modlitbe prosme nášho nebeského Otca, aby naša mládež na orodovanie svätého Jána Bosca rástla v milosti.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Daj všetkým kňazom a diakonom schopnosť slúžiť Bohu i ľuďom celým srdcom.<br>" +
                            "<font color='#B71C1C'>2.</font> Udeľ všetkým predstaveným úsmev a múdrosť Ducha Svätého.<br>" +
                            "<font color='#B71C1C'>3.</font> Veď učiteľov a vychovávateľov k tomu, aby svojich zverencov vzdelávali odborne i mravne.<br>" +
                            "<font color='#B71C1C'>4.</font> Vštep do sŕdc mladých ľudí poslušnosť voči rodičom a predstaveným.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás milovať našu nebeskú Matku, Pannu Máriu, Pomocnicu kresťanov.<br>" +
                            "<font color='#B71C1C'>6.</font> Udeľ večnú spásu tým, ktorí sa na smrť s vierou pripravovali.",
                    "Dobrotivý Bože,<br>" +
                            "ty si urobil svätého Jána Bosca<br>" +
                            "otcom chudobných a opustených;<br>" +
                            "vyslyš naše prosby,<br>" +
                            "zhliadni na našu mládež,<br>" +
                            "upevňuj ju v milosti svätého krstu a ozdobuj čnosťami,<br>" +
                            "aby ti mohla slúžiť s radostným srdcom.<br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] prosby2 = {
            {"02g", "Bratia a sestry, v dnešný deň, keď si pripomíname, že Panna Mária obetovala svojho syna v chráme, aj my obetujme Pánovi vrúcnu lásku svojho srdca.",
                    "<font color='#B71C1C'>(</font>Volajme: Pre svoje obetovanie vyslyš nás, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, sláva svojho ľudu; daj všetkým zasväteným osobám radosť z toho, že ťa môžu nasledovať celým srdcom.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, svetlo na osvietenie pohanov, ukáž cestu spásy všetkým národom.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, syn bolestnej Matky, posilňuj všetkých, ktorí pre tvoje meno znášajú súženia.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, syn Márie Panny, žehnaj matky našej farnosti a buď im odmenou za ich materskú starostlivosť a námahu.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, útecha tých, ktorí sú ti verní, stoj pri svojich veriacich, ktorí dnes končia svoju pozemskú púť.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane Ježišu, náš život a naša radosť, požehnaj otcov a matky, ktorí obetovali svoje dieťa tvojej Cirkvi.",
                    "Pane, ty si nám už toľko ráz<br>" +
                            "preukázal svoje milosrdenstvo;<br>" +
                            "s dôverou ťa prosíme,<br>" +
                            "aby si láskavo vyslyšal naše prosby<br>" +
                            "a vzbudil v nás odvahu obetovať sa ti celým srdcom.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"03a", "Bratia a sestry, pri spomienke na svätého Blažeja, biskupa a mučeníka, prednesme Pánovi svoje prosby a prosme za naše zdravie i za zdravie našich blížnych.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj, aby bolesti a utrpenia kresťanov slúžili na duchovný rozvoj Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilňuj nášho biskupa <font color='#B71C1C'>M.</font>, aby podľa vzoru svätého Blažeja bránil kresťanskú vieru až po vyliatie krvi.<br>" +
                            "<font color='#B71C1C'>3.</font> Chráň všetkých ľudí od chorôb, hladu i vojny a posilni ich v ťažkostiach života.<br>" +
                            "<font color='#B71C1C'>4.</font> Žehnaj lekárov a celý zdravotnícky personál v ich službe pri chorých a odmeň ich obetavosť.<br>" +
                            "<font color='#B71C1C'>5.</font> Na orodovanie svätého Blažeja ochráň nás od chorôb hrdla a od každého iného zla.",
                    "Milosrdný Bože,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a chráň nám telo i dušu od každého zla,<br>" +
                            "aby sme získali večnú spásu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"05", "Bratia a sestry, povzbudení hrdinským životom svätej Agáty, panny a mučenice, prosme nebeského Otca o vytrvalosť vo viere a v jej vyznávaní pred ľuďmi tohto sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, prosíme ťa za celú Cirkev, aby vždy mala verných nasledovateľov Kristovho evanjelia a oddaných služobníkov oltára.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, prosíme ťa za celý svet, aby sa v ňom rozmáhal oheň tvojej nekonečnej lásky.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, prosíme ťa za krajiny zasiahnuté prírodnými katastrofami, aby si ochránil ich obyvateľov a vlial im do sŕdc novú nádej.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, prosíme ťa za naše rodiny, aby sa v nich rozvíjal duch obetavosti a vzájomnej starostlivosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, prosíme ťa za tých, ktorí prekročili prah pozemského života, aby si ich prijal medzi svojich svätých v nekonečnej sláve.",
                    "Nebeský Otče,<br>" +
                            "svätá Agáta nás učí vytrvať v dobrom<br>" +
                            "a celou dušou sa oddať tebe;<br>" +
                            "vyslyš tieto naše prosby<br>" +
                            "a pomáhaj nám v úsilí získať večný život,<br>" +
                            "aby sme sa stali hodnými prisľúbení tvojho Syna.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"06", "Bratia a sestry, svätý Pavol Miki a jeho spoločníci svojím mučeníctvom dokázali, že umrieť za Krista je veľké víťazstvo. Prosme Pána, aby nám udelil silu zvíťaziť nad nepriateľom našej spásy.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, pomáhaj všetkým kňazom žiť v poslušnosti, oddanosti a láske k tvojej Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, zjednocuj národy rôznych kultúr vo viere v teba a vo svätú Cirkev.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, ujmi sa prenasledovaných, trpiacich a sužovaných a daruj im poznanie bohatstva svojej náuky.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, chráň našu krajinu pred nepriateľmi, ktorí ničia jej historické, kultúrne a duchovné hodnoty.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, pripočítaj našich zosnulých <font color='#B71C1C'>(M.)</font> k zástupom blažených v tvojom kráľovstve.",
                    "Pane Ježišu,<br>" +
                            "prijmi tieto naše prosby,<br>" +
                            "odmeň tých, ktorí trpia pre tvoje meno,<br>" +
                            "povzbuď nás vo viere<br>" +
                            "a priprav naše srdcia na stretnutie s tebou vo večnosti.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"08b", "Bratia a sestry, veríme, že Boh stvoril človeka na svoj obraz, a tým ho povýšil nad každé stvorenie. Pri spomienke na svätú Jozefínu prednesme mu svoje pokorné prosby vo viere, že sa skláňa k nám a zahŕňa nás svojou láskou.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, prosíme ťa za Cirkev na celom svete: aby bojovala za práva na dôstojný život všetkých ľudí a bola útočiskom pre tých, ktorí sú ponižovaní a vykorisťovaní.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, prosíme ťa za predstaviteľov nadnárodných organizácií: aby sa bez ohľadu na farbu pleti, reč a náboženstvo zastávali práv najslabších.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, prosíme ťa za tých, ktorí podporujú obchodovanie s ľuďmi: aby sa spamätali, prestali konať zlo a nepovyšovali obchod a zisk nad dôstojnosť človeka.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, prosíme ťa za všetkých, ktorí boli unesení alebo zotročení: aby našli ľudí, ktorí im pomôžu, a mohli sa vrátiť na slobodu a k svojim drahým.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, prosíme ťa za nás samých, aby sme na príhovor svätej Jozefíny svedčili o tvojej láske, ktorá zahŕňa všetkých bez rozdielu.",
                    "Nebeský Otče,<br>" +
                            "s dôverou sme ti predniesli svoje prosby<br>" +
                            "a prosíme ťa, aby si nás vyslyšal;<br>" +
                            "nech tvoja láska zavládne na celom svete<br>" +
                            "a zvíťazí nad každým ľudským zlom a hriechom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "Bratia a sestry, svätá panna Školastika v nebi oroduje za nás a prosí o odpustenie našich hriechov. S vďakou a radosťou prednesme Bohu svoje modlitby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby všetci biskupi, kňazi a diakoni nachádzali živý zdroj duchovnej posily v čítaní Svätého písma, duchovnej literatúry a v duchovných rozhovoroch, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby sa predstavitelia krajín trpezlivo starali o dobro a dôstojný život obyvateľov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby väznení a odsúdení pocítili milujúcu a odpúšťajúcu lásku Boha i nádej večnej slobody, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme na príhovor svätej Školastiky boli obdarení priaznivým dažďom a uchránení od ničivých bleskov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zosnulí <font color='#B71C1C'>(M.)</font> naveky odpočívali medzi oslávenými bratmi a sestrami v nebeskom kráľovstve, prosme Pána.",
                    "Bože Otče, sme tvoje deti;<br>" +
                            "vyslyš naše prosby,<br>" +
                            "objím nás svojou dobrotou,<br>" +
                            "dovoľ nám stretnúť sa raz s tebou v nebi<br>" +
                            "a vidieť tvoju svätú tvár.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11m", "Bratia a sestry, Panna Mária sa v Lurdoch zjavila ako Nepoškvrnené počatie. Modlime sa k Bohu, prameňu všetkej svätosti a pôvodcovi každej milosti, aby nás na jej príhovor obdaroval svojím požehnaním.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, roznecuj vo svojich služobníkoch úctu k Panne Márii a k tajomstvám jej života a daj im odhodlanie o nich svedčiť.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomáhaj predstaviteľom národov žiť podľa čistého svedomia a vyhýbať sa hriechu a verejnému pohoršeniu.<br>" +
                            "<font color='#B71C1C'>3.</font> Chráň počaté deti v lone matky, dopraj im narodiť sa a prežiť čnostný a dôstojný život.<br>" +
                            "<font color='#B71C1C'>4.</font> Sprevádzaj pútnikov do Lúrd svojou milosťou, aby načerpali duchovnú silu a povzbudili sa v konaní skutkov milosrdenstva.<br>" +
                            "<font color='#B71C1C'>5.</font> Posilňuj chorých, ktorí si na príhovor Panny Márie Lurdskej vyprosujú zdravie tela i duše.<br>" +
                            "<font color='#B71C1C'>6.</font> Udeľ našim zosnulým <font color='#B71C1C'>(M.)</font> večné odpočinutie v tvojej nekonečnej sláve v nebi.",
                    "Otče lásky a pôvodca nebeských darov,<br>" +
                            "Pannu Máriu si uchránil od dedičného hriechu<br>" +
                            "a celým životom si ju sprevádzal;<br>" +
                            "vypočuj naše prosby a posilňuj nás v premáhaní zla<br>" +
                            "a v každodennom úsilí o čistotu a pokoj duše.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14o", "Bratia a sestry, odkaz svätých Cyrila a Metoda sa odovzdáva z pokolenia na pokolenie. S vďakou za dar viery modlime sa k všemohúcemu Bohu Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Dedičstvo otcov zachovaj nám, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, tvoje milosrdenstvo trvá naveky; ochraňuj Cirkev a sprevádzaj ju pri hlásaní tvojho slova.<br>" +
                            "<font color='#B71C1C'>2.</font> Tvoja spravodlivosť je nesmierna a krása nekonečná; zjednocuj európske spoločenstvo v láske k evanjeliu.<br>" +
                            "<font color='#B71C1C'>3.</font> Ty si zoslal svetlo a pravdu, aby nás priviedli na tvoj svätý vrch; prenikni srdcia neveriacich a priveď ich k sebe.<br>" +
                            "<font color='#B71C1C'>4.</font> Ty sám si láskavým učiteľom svojho ľudu; urob kňazov múdrymi vychovávateľmi veriacich.<br>" +
                            "<font color='#B71C1C'>5.</font> Svojmu novému ľudu si ukázal cestu svojho zákona; zachovaj nás vo vernosti tebe a nedovoľ nám vzdialiť sa od teba.<br>" +
                            "<font color='#B71C1C'>6. V Žilinskej diecéze:</font> Ty otcovsky opatruješ a ochraňuješ svoj ľud; požehnávaj našu diecézu, aby vydávala príkladné svedectvo kresťanského života.",
                            "Všemohúci Bože,<br>" +
                            "prijmi naše pokorné prosby<br>" +
                            "a pomáhaj nám zvestovať svetlo Kristovho slova,<br>" +
                            "aby sme raz boli pripojení k spoločenstvu tých,<br>" +
                            "ktorí nám zjavili jednotu pravej kresťanskej viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14g+", "Bratia a sestry, odkaz svätých Cyrila a Metoda sa odovzdáva z pokolenia na pokolenie. S vďakou za dar viery modlime sa k všemohúcemu Bohu Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Dedičstvo otcov zachovaj nám, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, tvoje milosrdenstvo trvá naveky; ochraňuj Cirkev a sprevádzaj ju pri hlásaní tvojho slova.<br>" +
                            "<font color='#B71C1C'>2.</font> Tvoja spravodlivosť je nesmierna a krása nekonečná; zjednocuj európske spoločenstvo v láske k evanjeliu.<br>" +
                            "<font color='#B71C1C'>3.</font> Ty si zoslal svetlo a pravdu, aby nás priviedli na tvoj svätý vrch; prenikni srdcia neveriacich a priveď ich k sebe.<br>" +
                            "<font color='#B71C1C'>4.</font> Ty sám si láskavým učiteľom svojho ľudu; urob kňazov múdrymi vychovávateľmi veriacich.<br>" +
                            "<font color='#B71C1C'>5.</font> Svojmu novému ľudu si ukázal cestu svojho zákona; zachovaj nás vo vernosti tebe a nedovoľ nám vzdialiť sa od teba.<br>" +
                            "<font color='#B71C1C'>6. V Žilinskej diecéze:</font> Ty otcovsky opatruješ a ochraňuješ svoj ľud; požehnávaj našu diecézu, aby vydávala príkladné svedectvo kresťanského života.",
                            "Všemohúci Bože,<br>" +
                            "prijmi naše pokorné prosby<br>" +
                            "a pomáhaj nám zvestovať svetlo Kristovho slova,<br>" +
                            "aby sme raz boli pripojení k spoločenstvu tých,<br>" +
                            "ktorí nám zjavili jednotu pravej kresťanskej viery.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22g", "Bratia a sestry, Pán Ježiš postavil svoju Cirkev na Petrovi ako na skale a dal mu kľúče od nebeského kráľovstva. Ďakujme Pánovi, že patríme do jeho Cirkvi, a pokorne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, žehnaj a ochraňuj nášho pápeža <font color='#B71C1C'>M.</font>, Petrovho nástupcu, i všetkých biskupov, nástupcov apoštolov.<br>" +
                            "<font color='#B71C1C'>2.</font> Upevňuj nás vo vernosti a oddanosti viditeľnej hlave Cirkvi.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, aby všetky národy videli v tvojej Cirkvi duchovnú oporu a spoločenstvo lásky a pokoja.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj, aby všetci trpiaci a blúdiaci spoznali v tvojej Cirkvi láskavú matku a učiteľku.<br>" +
                            "<font color='#B71C1C'>5.</font> Urob naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo miestom živej viery a bratskej lásky.",
                    "Pane Ježišu, ty nás ubezpečuješ,<br>" +
                            "že Cirkev postavenú na Petrovi<br>" +
                            "pekelné mocnosti nepremôžu;<br>" +
                            "vyslyš naše prosby a pomáhaj nám,<br>" +
                            "aby sme vždy a všade vyznávali,<br>" +
                            "že ty si Kristus, Boží Syn,<br>" +
                            "a žiješ i kraľuješ na veky vekov."},
            {"23", "Bratia a sestry, svätý Polykarp nás učí trpezlivosti a obetavej láske ku Kristovi. Pozdvihnime svoje srdcia a na jeho príhovor sa modlime k Bohu Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Svätého Otca <font color='#B71C1C'>M.</font> a za všetkých biskupov: aby viedli kresťanský ľud k pravej zbožnosti a čistej viere, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za celý svet: aby sa všetci ľudia zjednotili v úsilí o spoločné dobro a budovali pozemský príbytok v očakávaní nebeského domova, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za trpiacich pre Kristovo meno: aby oddane nasledovali svojho Učiteľa a neváhali za evanjelium položiť aj život, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za naše rodiny: aby v nich rástol duch trpezlivosti a bratskej lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby naveky mohli hľadieť na Krista osláveného v nebesiach, prosme Pána.",
                    "Pane a Bože náš,<br>" +
                            "ďakujeme ti za príklad svätých žiakov apoštolov;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby náš život smeroval k nebeskej vlasti,<br>" +
                            "kde nás prijmeš v otcovskom objatí.<br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] prosby3 = {
            {"04", "Bratia a sestry, duchovný život, askéza, nábožnosť a modlitba napĺňali život svätého Kazimíra. Učme sa z jeho príkladu a pokorne prosme Pána.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, Kráľ kráľov, upevňuj svojich služobníkov v oddanosti tebe a v budovaní Božieho kráľovstva na zemi.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, žiara večného svetla, zjavuj svoju slávu národom a posilňuj pokoj vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, príklad čností, na príhovor svätého Kazimíra ochraňuj mladých ľudí od nástrah svetských pokušení.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, naša cesta, pravda a život, privádzaj nás bližšie k sebe a nauč nás konať skutky úprimnej lásky.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, radosť anjelov, pripoj našich zosnulých <font color='#B71C1C'>(M.)</font> k zástupom anjelov v nebeskej vlasti.",
                    "Ježišu Kriste, poklad verných duší,<br>" +
                            "svätý Kazimír zomrel mladý,<br>" +
                            "ale jeho život bol naplnený čnosťami;<br>" +
                            "prosíme ťa, pomáhaj nám,<br>" +
                            "aby sme svoj život naplnili tvojím Duchom<br>" +
                            "a rozdávali lásku a radosť svojim blížnym.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"07", "Bratia a sestry, dnes si s úctou spomíname na hrdinské mučeníctvo svätých žien Perpetuy a Felicity. Posilnení nádejou vo večné víťazstvo Božej pravdy prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, posilňuj všetkých kresťanov v odvahe vyznávať vieru medzi tými, ktorí ešte nepoznajú radosť z Kristovho zmŕtvychvstania.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomáhaj predstaviteľom krajín v úsilí o rešpektovanie náboženskej slobody.<br>" +
                            "<font color='#B71C1C'>3.</font> Udeľ týraným ženám dar trpezlivosti, odvahy a viery v tvoje nekonečné milosrdenstvo.<br>" +
                            "<font color='#B71C1C'>4.</font> Obdaruj nás milosťou dobrej a pokojnej smrti, aby sme sa mohli s tebou vo večnosti naveky radovať.<br>" +
                            "<font color='#B71C1C'>5.</font> Prijmi k sebe našich zosnulých <font color='#B71C1C'>(M.)</font> a otvor im brány neba.",
                    "Bože, sväté mučenice Perpetua a Felicita<br>" +
                            "statočne niesli svoj kríž;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a daruj nám silu nasledovať Krista,<br>" +
                            "ktorý je prameňom večného života.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
    };

    String[][] prosby4 = {
            {"07", "Bratia a sestry, príklad svätého Jána Krstiteľa de la Salle nás povzbudzuje ku konaniu skutkov lásky. Vrúcne sa modlime a s vďakou volajme:<br>" +
                    "<font color='#B71C1C'>(</font>Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby bol v Cirkvi dostatok duchovných povolaní ku kňazstvu a k zasvätenému životu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby bohaté krajiny hmotne podporovali územia postihnuté chorobami, hladom, vojnami a hmotnou núdzou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby učitelia viedli svojich žiakov k zodpovednému získavaniu vedomostí a boli príkladom nábožného života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme mali súcit s chudobnými a vedeli sa deliť so svojím majetkom, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zosnulí <font color='#B71C1C'>(M.)</font> večne hľadeli na Božiu velebu, prosme Pána.",
                    "Ježišu, náš nebeský Učiteľ,<br>" +
                            "sme tvojimi žiakmi<br>" +
                            "a chceme ťa neustále nasledovať;<br>" +
                            "pomáhaj nám prichádzať k tebe<br>" +
                            "a predkladať ti s dôverou svoje prosby.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"11", "Bratia a sestry, posilnime sa vzorom príkladného duchovného a mravného života svätého Stanislava. Volajme k najláskavejšiemu Bohu Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, ty múdro riadiš Cirkev; zachovávaj v oddanosti a úcte k tebe nášho biskupa <font color='#B71C1C'>M.</font> a všetkých biskupov a kňazov.<br>" +
                            "<font color='#B71C1C'>2.</font> Ty sa dávaš poznať národom po celom svete; pomáhaj vedúcim predstaviteľom štátov ochraňovať a rešpektovať tvoju Cirkev.<br>" +
                            "<font color='#B71C1C'>3.</font> Ty napĺňaš srdcia láskou; zjav sa neveriacim a pomôž im nájsť cestu k tebe.<br>" +
                            "<font color='#B71C1C'>4.</font> Ty bdieš nad našou prácou; posilňuj nás vo vydávaní svedectva o tebe na miestach, kde pracujeme.<br>" +
                            "<font color='#B71C1C'>5.</font> Ty si darca večného života; odmeň vieru našich zosnulých <font color='#B71C1C'>(M.)</font> večnou blaženosťou.",
                    "Milosrdný Bože,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a na príhovor svätého Stanislava<br>" +
                            "nám pomáhaj zostať vernými kresťanmi po celý život.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "Bratia a sestry, Boh nám poslal mnohých významných učencov a vzdelancov, ktorí svojimi vedomosťami a svätosťou ovplyvnili život Cirkvi. Ďakujme za svätého biskupa Anzelma a na jeho príhovor prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, vlievaj svoju lásku do sŕdc všetkých biskupov, kňazov a rehoľníkov, aby naplnení tvojím Duchom viedli ľudí k príkladnému kresťanskému životu.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomáhaj národom viesť dialóg o náboženskej slobode, aby všetci ľudia mohli prežívať živú radosť zo stretnutia s tebou.<br>" +
                            "<font color='#B71C1C'>3.</font> Zastaň sa prenasledovaných pre vieru, aby sa nebáli vydávať svedectvo o Kristovi a nasledovať jeho príklad.<br>" +
                            "<font color='#B71C1C'>4.</font> Pomáhaj nám prekonávať nezhody v našich rodinách, aby v rodinnom kruhu vždy víťazila dobrota a láska.<br>" +
                            "<font color='#B71C1C'>5.</font> Prijmi našich zosnulých <font color='#B71C1C'>(M.)</font> do spoločenstva oslávenej Cirkvi, aby mali plnú účasť na Kristovom vzkriesení.",
                    "Bože, svätý Anzelm sa svojím dielom<br>" +
                            "zaradil medzi významných učiteľov svojej doby;<br>" +
                            "na jeho príhovor vypočuj naše prosby<br>" +
                            "a pomáhaj nám byť dobrými učiteľmi<br>" +
                            "našim bratom a sestrám,<br>" +
                            "aby sme príkladom života privádzali ostatných<br>" +
                            "k poznaniu večnej Pravdy, tvojho Syna Ježiša Krista,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"23", "Bratia a sestry, Pán ozdobil svätého Vojtecha mučeníckou korunou. V tejto spoločnej modlitbe prosme Pána, aby sme si na jeho orodovanie zachovali a zveľadili kresťanskú vieru.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daruj svojej Cirkvi duchovných pastierov, ktorí by aj život položili za svojich veriacich.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby z ľudskej spoločnosti vymizli pomsta, násilie a vraždy.<br>" +
                            "<font color='#B71C1C'>3.</font> Žehnaj všetkých, ktorí písaným slovom zveľaďujú a šíria vieru, vedu a kultúru.<br>" +
                            "<font color='#B71C1C'>4.</font> Odmeň tých, ktorí vydávaním kvalitnej literatúry napomáhajú duchovný rast čitateľov.<br>" +
                            "<font color='#B71C1C'>5.</font> Naplň nás vďačnosťou a úctou k našim duchovným otcom.<br>" +
                            "<font color='#B71C1C'>6.</font> Poteš večnou slávou našich zosnulých <font color='#B71C1C'>(M.)</font>.",
                    "Všemohúci Bože,<br>" +
                            "milostivo zhliadni na nás<br>" +
                            "a vypočuj naše prosby;<br>" +
                            "zachovaj a zveľaďuj v nás vieru,<br>" +
                            "ktorú v našich krajinách šírili tvoji svätí,<br>" +
                            "aby sme spolu s nimi dosiahli<br>" +
                            "večnú slávu v nebeskom kráľovstve.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"24a", "Bratia a sestry, starokresťanský mučeník svätý Juraj vyznal Kristovu náuku a neváhal položiť život za vieru. Čerpajme z odvahy, ktorú preukázal, a nadšene prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, posilňuj celú Cirkev v úsilí o neprestajné šírenie tvojho evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Preukazuj ľudstvu svoje dobrodenia a odvráť od mylnej cesty tých, ktorí vedú vojny a ozbrojené konflikty.<br>" +
                            "<font color='#B71C1C'>3.</font> Ochraňuj všetkých skautov a na príhovor svätého Juraja ich posmeľuj v každodennom živote viery a v prijímaní Eucharistie.<br>" +
                            "<font color='#B71C1C'>4.</font> Zjednocuj naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo pri tvojom oltári a pozývaj nás nasledovať tvoje Srdce bohaté pre všetkých, ktorí ťa vzývajú.<br>" +
                            "<font color='#B71C1C'>5.</font> Pomáhaj našim zosnulým <font color='#B71C1C'>(M.)</font> prejsť bránami večnosti a stretnúť sa s tebou.",
                    "Ježišu, náš život a naše vzkriesenie,<br>" +
                            "daj nám silu kráčať za tebou,<br>" +
                            "prijmi naše modlitby<br>" +
                            "a urob nás vernými svedkami<br>" +
                            "tvojej slávy a spravodlivosti.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"25g", "Bratia a sestry, svätý Marek, žiak apoštola Petra, svojím spisom aj dnes ohlasuje Kristovo evanjelium. Prosme Pána, aby sa Božie slovo šírilo po celom svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, priveď kresťanov čítaním evanjelia k hlbšiemu poznaniu Ježiša Krista.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby sa radostná zvesť tvojho Syna ohlasovala po celom svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Žehnaj námahu a prácu tých, ktorí ohlasujú tvoje slovo, aby s radosťou videli ovocie svojej námahy.<br>" +
                            "<font color='#B71C1C'>4.</font> Odmeň všetkých veriacich, ktorí sú oporou a pomocníkmi kňazov v ich náročnej službe.<br>" +
                            "<font color='#B71C1C'>5.</font> Pomôž nám chápať, že Kristus je prítomný aj vo svojom slove, lebo on sám hovorí, keď sa v Cirkvi číta Sväté písmo.",
                    "Milostivý Bože,<br>" +
                            "ty si vybral svätého Marka,<br>" +
                            "aby ohlasoval tvoje evanjelium slovom aj písmom;<br>" +
                            "prosíme ťa, prijmi naše prosby<br>" +
                            "a daj nám lásku a úctu k tvojmu slovu,<br>" +
                            "aby nám bolo ustavičným pokrmom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"29g", "Bratia a sestry, na sviatok svätej panny Kataríny, ktorú Pán obdaril charizmou múdrosti a nevšednou láskou k Cirkvi, modlime sa s dôverou:",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, pre lásku k Cirkvi a pápežovi, ktorou horela tvoja verná služobníčka Katarína, chráň Svätého Otca <font color='#B71C1C'>M.</font> a všetok kresťanský ľud a posilňuj nás vo viere a láske.<br>" +
                            "<font color='#B71C1C'>2.</font> Pre horlivosť a pokojamilovnosť, ktorou sa svätá Katarína usilovala zmieriť rozhnevané mestá a rodiny, udeľ našim časom pokoj a mier.<br>" +
                            "<font color='#B71C1C'>3.</font> Pre starostlivosť o chorých, chudobných a väzňov, ktorou sa vyznačovala táto svätá panna, daj, nech máme otvorené srdce pre každého, kto potrebuje našu pomoc.<br>" +
                            "<font color='#B71C1C'>4.</font> Pre múdrosť, ktorou vynikala svätá Katarína, daj, aby sme boli tvojimi vernými žiakmi v škole evanjelia.<br>" +
                            "<font color='#B71C1C'>5.</font> Pre vrúcnu vieru a lásku, ktorú mala Katarína k Eucharistii, daj nám čerpať z tohto božského prameňa svetlo a silu pre náš každodenný život a pre našu spásu.",
                    "Bože, ty si vo svätej Kataríne obdivuhodne spojil<br>" +
                            "život modlitby so službou bratom a sestrám;<br>" +
                            "na jej príhovor vypočuj naše prosby<br>" +
                            "a daj, nech v nás rastie láska k tebe a našim bratom,<br>" +
                            "aby sme vrúcne milovali tvoju Cirkev<br>" +
                            "a všade šírili tvoj pokoj.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "Bratia a sestry, v deň spomienky na svätého pápeža Pia Piateho, obnoviteľa posvätnej liturgie, modlime sa k nebeskému Otcovi a posilnime sa v jednote ducha a lásky.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za nášho Svätého Otca <font color='#B71C1C'>M.</font>: aby verne a oddane stál na čele Cirkvi a usiloval sa budovať vo veriacich úctu k pravde a spravodlivosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za predstaviteľov štátov: aby dohliadali na čestné a mravné konanie štátnych úradníkov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za tvorcov a prekladateľov duchovnej literatúry a cirkevných dokumentov: aby boli vďační za dar múdrosti a pokorne odovzdali svoje dielo budúcim generáciám, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za naše spoločenstvo: aby sme mali v úcte svojho biskupa a duchovného otca a tešili sa z toho, že patríme do jednej kresťanskej rodiny, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby prebývali v nebeskom príbytku, prosme Pána.",
                    "Bože, na príhovor svätého pápeža Pia Piateho<br>" +
                            "vypočuj naše prosby<br>" +
                            "a nauč nás milovať Cirkev a posvätnú liturgiu,<br>" +
                            "aby sme raz dosiahli účasť<br>" +
                            "na večnej oslave tvojej veleby.<br>" +
                            "Skrze Krista, nášho Pána."},};

    String[][] prosby5 = {
            {"01", "Bratia a sestry, slávime spomienku na patróna robotníkov svätého Jozefa, ktorý chráni všetkých, ktorí svojou prácou prinášajú úžitok ostatným a zarábajú si na živobytie. Ďakujme za jeho orodovanie v nebi a nadšene sa modlime k Bohu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, pre zásluhy svätého Jozefa, ochrancu Cirkvi, oživuj Katolícku cirkev svojou nádejou.<br>" +
                            "<font color='#B71C1C'>2.</font> Pre zásluhy svätého Jozefa, útechy ubiedených, posilňuj ochotu bohatých národov pomáhať trpiacim a hladujúcim.<br>" +
                            "<font color='#B71C1C'>3.</font> Pre zásluhy svätého Jozefa, vzoru robotníkov, nauč nás usilovne si plniť svoje pracovné povinnosti.<br>" +
                            "<font color='#B71C1C'>4.</font> Pre zásluhy svätého Jozefa, ozdoby domáceho života, posilni nás v úsilí budovať vzorné rodinné spoločenstvo.<br>" +
                            "<font color='#B71C1C'>5.</font> Pre zásluhy svätého Jozefa, starostlivého Kristovho ochrancu, voveď našich zosnulých <font color='#B71C1C'>(M.)</font> do večnej slávy v nebesiach.",
                    "Bože, človek stvorený na tvoj obraz<br>" +
                            "dostal príkaz podrobiť si zem,<br>" +
                            "spravovať svet<br>" +
                            "a zamerať svoj život na teba, Stvoriteľa,<br>" +
                            "aby sa tak velebilo tvoje meno;<br>" +
                            "vypočuj naše modlitby,<br>" +
                            "pomáhaj nám uskutočňovať tvoj plán<br>" +
                            "a raz nás prijmi k svojim vyvoleným v nebeskej sláve.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"02", "Bratia a sestry, Boh dal Cirkvi mnohých významných obrancov viery, ku ktorým patril aj svätý biskup Atanáz. Prosme Pána v modlitbách o posilnenie našej viery.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, dokonalá obeta, pomáhaj všetkým biskupom a kňazom bojovať proti bludným náukám a nástrahám viery.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, vyzdvihnutý na kríži, zachovaj národy v mieri a povzbudzuj ich k vzájomnej tolerancii.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, prenasledovaný pre spravodlivosť, ochráň ľudí bez prístrešia a daruj im pocit bezpečia vo svojom preláskavom Srdci.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, posila tých, ktorí v teba dúfajú, rozmnožuj v nás obetavosť v službe blížnym a trpiacim.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, svetlo veľkonočného rána, ožiar svojou slávou našich zosnulých <font color='#B71C1C'>(M.)</font>, ktorí prekročili prah pozemského života.",
                    "Pane Ježišu,<br>" +
                            "keď svätý Atanáz trpel vo vyhnanstve pre tvoje meno,<br>" +
                            "posilňoval si ho svojím Duchom,<br>" +
                            "aby ho nezlomila zloba sveta;<br>" +
                            "prosíme ťa, vypočuj naše prosby,<br>" +
                            "aby sme boli verní pravému kresťanskému učeniu<br>" +
                            "a stále rástli v dôvere v teba.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"03g", "Bratia a sestry, svätý apoštol Filip bol prítomný pri zázračnom rozmnožení chleba, svätý apoštol Jakub vynikal horlivosťou v hlásaní Kristovho učenia. Obaja Krista hlboko milovali a usilovali sa žiť podľa jeho prikázaní. Nasledujme ich príklad a v modlitbách volajme k nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, daj, aby všetci služobníci tvojho oltára zachovávali apoštolskú tradíciu Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby sa v celom svete rozrastal počet tvojich veriacich, ktorí ťa budú nasledovať s nerozdeleným srdcom.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, aby sa život učiteľov náboženstva zhodoval s vierou Cirkvi.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj, aby sme si vážili dar modlitby a vedeli ti v modlitbe ďakovať, chváliť ťa a prosiť.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj, aby naši zosnulí <font color='#B71C1C'>(M.)</font> uvideli v nebi oslávenú Cirkev v celej jej nádhere.",
                    "Milostivý Otče,<br>" +
                            "tvoja láska preniká srdcia veriacich;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pomáhaj nám prijímať tvoju lásku,<br>" +
                            "žiť v tvojej milosti<br>" +
                            "a nasledovať ťa ako apoštoli,<br>" +
                            "aby sme sa raz s nimi mohli stretnúť v nebeskom domove.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"04", "Bratia a sestry, medzi starokresťanských svätcov, ktorí sú dodnes uctievaní v našej krajine ako pomocníci v núdzi, patrí aj svätý Florián. Vzýva sa predovšetkým ako ochranca pred prírodnými pohromami <font color='#B71C1C'>(</font>a ako patrón hasičov<font color='#B71C1C'>)</font>. Na jeho príhovor prednesme Pánovi svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosíme ťa, Pane, za Cirkev, ktorá sa po celom svete ujíma biednych a utláčaných, aby si jej dal silu a vernosť v službe tým, čo potrebujú pomoc.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za predstaviteľov krajín Európskej únie, aby pamätali na naše kresťanské korene.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za trpiacich pre živelné pohromy, aby prostredníctvom obetavých ľudí dostali primeranú pomoc, na ktorú sú často odkázaní.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za všetkých, ktorých zamestnaním je služba iným, najmä záchrana života a majetku, aby boli spoločnosťou primerane odmenení.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa, Pane, za nás samých, aby sme dokázali brániť vieru aj vtedy, keby sme pre ňu museli prinášať veľké obety.",
                    "Pane Ježišu, ďakujeme ti za svätých,<br>" +
                            "ktorí nás chránia svojím príhovorom;<br>" +
                            "vypočuj nás,<br>" +
                            "keď ti pri spomienke na nich predkladáme svoje prosby.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"13m", "Bratia a sestry, Panna Mária nás pri svojom zjavení vo Fatime vyzvala na modlitbu a obrátenie. Preto pozdvihnime svoje srdcia k Bohu a spoločne volajme:",
                    "<font color='#B71C1C'>(</font>Pozri na Matku svojho Syna a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože Otče, Panne Márii zasvätili viacerí pápeži celý svet; daj, aby všetci veriaci pocítili mocný príhovor Panny Márie, Matky Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože Otče, Panna Mária vo Fatime ukázala deťom hrôzy pekla; ochraňuj ľudstvo od mravnej skazy a obráť ho na cestu svätosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože Otče, Panna Mária sa zjavila spolu s anjelom Portugalska; pošli svojich anjelov priviesť k pravej viere hriešnikov, ktorí znesväcujú Oltárnu sviatosť.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože Otče, Panna Mária si želala, aby sme sa modlili ruženec; daj nám silu k vytrvalej a vrúcnej modlitbe.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože Otče, Panna Mária povedala deťom, že prídu do neba; prijmi našich zosnulých <font color='#B71C1C'>(M.)</font> k sebe do večnosti, aby sa tam naveky radovali s ňou i so všetkými svätými.",
                    "Pane a Bože náš,<br>" +
                            "Panna Mária nás povzbudzuje k modlitbe,<br>" +
                            "ktorá je cestou k spáse;<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "aby sme pamätali na toto posolstvo<br>" +
                            "a usilovali sa podľa neho žiť.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14g", "Bratia a sestry, zbor apoštolov z Božieho vnuknutia zvolil učeníka Mateja za apoštola, aby bol svedkom Pánovho vzkriesenia. Prosme Pána za spásu celého sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, apoštoli sa stali svedkami tvojho vzkriesenia; daj, aby všetci kresťania svojím životom svedčili o tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, ty si svojou krvou zmieril svet s Otcom; daj, aby sa všetky národy usilovali o pravý pokoj.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, ty si namiesto zradcu Judáša povolal za apoštola učeníka Mateja; prosíme ťa, vzbuď v našom národe nové duchovné povolania.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, apoštol Matej krvou potvrdil vernosť tebe; daj, aby sme ti aj my zostali verní až do konca.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, ty si apoštolov posilňoval v hlásaní evanjelia; pomáhaj misionárom, aby aj v núdzi a v súžení verne ohlasovali tvoju radostnú zvesť o spáse.",
                    "Pane Ježišu,<br>" +
                            "ďakujeme ti za milosť povolania do tvojej Cirkvi<br>" +
                            "a prosíme ťa:<br>" +
                            "prijmi naše dnešné prosby,<br>" +
                            "upevňuj v nás lásku k tebe<br>" +
                            "a úctu k nástupcom apoštolov, našim biskupom.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"16", "Bratia a sestry, svätý Ján Nepomucký oslávil Krista svojou vernosťou Cirkvi a zachovaním spovedného tajomstva. Prosme Pána za vernosť Kristovi a za pokoj vo svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby predstavení Cirkvi vždy hľadali duchovné dobro veriacich, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby sa nositelia svetskej moci usilovali o všeobecné dobro, spravodlivosť a lásku, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby sa ohovárači a osočovatelia zbavili svojho hriešneho zvyku, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme mali v posvätnej úcte spovedné tajomstvo, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sa deti s pomocou rodičov a duchovných pastierov dobre pripravili na prvú svätú spoveď, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6. V Rožňavskej diecéze:</font> Aby sa veriaci našej diecézy na príhovor svojho patróna svätého Jána Nepomuckého vzmáhali v čnostiach a v poznávaní tajomstiev viery, prosme Pána.",
                    "Dobrotivý Bože, ty nám vo svätom Jánovi<br>" +
                            "dávaš vzor neochvejnej vernosti tebe;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme dodržiavali tvoje sväté zákony<br>" +
                            "a ustavične ťa chválili.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"16g", "Bratia a sestry, svätý Ján Nepomucký oslávil Krista svojou vernosťou Cirkvi a zachovaním spovedného tajomstva. Prosme Pána za vernosť Kristovi a za pokoj vo svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby predstavení Cirkvi vždy hľadali duchovné dobro veriacich, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby sa nositelia svetskej moci usilovali o všeobecné dobro, spravodlivosť a lásku, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby sa ohovárači a osočovatelia zbavili svojho hriešneho zvyku, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme mali v posvätnej úcte spovedné tajomstvo, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sa deti s pomocou rodičov a duchovných pastierov dobre pripravili na prvú svätú spoveď, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6. V Rožňavskej diecéze:</font> Aby sa veriaci našej diecézy na príhovor svojho patróna svätého Jána Nepomuckého vzmáhali v čnostiach a v poznávaní tajomstiev viery, prosme Pána.",
                    "Dobrotivý Bože, ty nám vo svätom Jánovi<br>" +
                            "dávaš vzor neochvejnej vernosti tebe;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme dodržiavali tvoje sväté zákony<br>" +
                            "a ustavične ťa chválili.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "Bratia a sestry, Ježiš prisľúbil, že kto prosí, dostane. V tomto duchu sa modlime k nášmu Pánovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby predstavitelia Cirkvi a štátu podľa príkladu svätej Rity roznecovali medzi ľuďmi ducha pokoja a zmierenia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby manželia, ktorí sa nachádzajú v rôznych ťažkostiach, žili vo vzájomnej dôvere a svornosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby chorí a tí, ktorí prežívajú smútok zo smrti svojich drahých, nikdy nepociťovali samotu a beznádej, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sa mladí, ktorí sú otrokmi drog a iných závislostí, dokázali oslobodiť od týchto nerestí, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme podľa príkladu svätej Rity vedeli odpustiť tým, ktorí nás urážajú, krivdia nám a ubližujú, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Aby sa rehoľné sestry stále užšie spájali so svojím ženíchom Kristom a obetovali mu celý svoj život, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby,<br>" +
                            "zhliadni na našu rodinu,<br>" +
                            "ktorá sa teší z oslavy tvojich svätých,<br>" +
                            "a daj nám ducha svätosti,<br>" +
                            "aby sme mohli pretvárať tento svet<br>" +
                            "na miesto spravodlivosti a pokoja.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"25b", "Bratia a sestry, svätý pápež Gregor Siedmy sa zaslúžil o mravnosť Cirkvi, chránil jej práva a usiloval sa o zodpovednú voľbu cirkevných predstavených. Ďakujme za jeho veľké dielo a vrúcne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za nášho Svätého Otca <font color='#B71C1C'>M.</font>: aby s pomocou Ducha Svätého prijímal do služby Cirkvi oddaných a obetavých bratov a sestry, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za svetských predstaviteľov: aby s úctou spolupracovali s predstavenými Cirkvi pre dobro všetkých ľudí, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za mladých chlapcov a dievčatá, ktorí cítia povolanie na duchovný život: aby ich túžba bola úprimná a cesta k zasväteniu svedomitá a vytrvalá, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás samých: aby sme sa s bázňou zúčastňovali na svätej omši a radostne vydávali svedectvo o Kristovi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za zosnulých kňazov: aby ich Pán prijal medzi svojich vyvolených a obdaril ich večným šťastím, prosme Pána.",
                    "Bože, náš Otec, svätý pápež Gregor Siedmy<br>" +
                            "miloval spravodlivosť a odmietal každú neprávosť;<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a posilni nás v nasledovaní tohto svätca,<br>" +
                            "aby sme si zaslúžili večný život<br>" +
                            "v nebeskej radosti a Kristovej sláve.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"26", "Bratia a sestry, vrúcna modlitba a ochotná pomoc blížnym boli náplňou života svätého Filipa Neriho. V deň spomienky na tohto obdivuhodného kňaza prosme Ježiša Krista, Božieho Syna.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa za všetkých kresťanov, aby s radosťou a pokorou pristupovali k sviatosti zmierenia a očisťovali si srdce.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, prosíme ťa za všetky národy, aby sa poznávaním Svätého písma usilovali o duchovnú jednotu.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, prosíme ťa za tých, ktorí sa starajú o chorých; odmeň ich námahu a posilňuj ich v obetavej práci.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, prosíme ťa za seba samých, aby sme pri čítaní životopisov svätých rástli vo viere.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prosíme ťa za zosnulých <font color='#B71C1C'>(M.)</font>, ktorých si povolal k sebe do večnosti, aby spočinuli v tvojom náručí a vo večnom svetle.",
                    "Pane Ježišu Kriste,<br>" +
                            "na orodovanie svätého Filipa Neriho<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daruj nám veselé a radostné srdce,<br>" +
                            "aby sme iných povzbudzovali na ceste do večnosti.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"27", "Bratia a sestry, Cirkev uctieva dnešného svätca, svätého biskupa Augustína, ako vierozvestcu a apoštola Anglicka. Za jeho horlivosť v rozširovaní viery vo svete ďakujme dobrému Bohu a prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Bože, požehnávaj nášho biskupa <font color='#B71C1C'>M.</font> a pomôž mu kráčať po ceste svätosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Rozširuj bohatstvo svojho slova v nekresťanských krajinách prostredníctvom pôsobenia nadšených a múdrych misionárov.<br>" +
                            "<font color='#B71C1C'>3.</font> Na príhovor svätého biskupa Augustína priveď neveriacich k hľadaniu pravého svetla a pravého pokoja.<br>" +
                            "<font color='#B71C1C'>4.</font> Pomáhaj nám vytrvalo sa modliť za misionárske povolania a za šírenie evanjelia vo svete.<br>" +
                            "<font color='#B71C1C'>5.</font> Obdaruj našich zosnulých <font color='#B71C1C'>(M.)</font> jasom svojej slávy a odmenou večnej radosti.",
                    "Otče nesmiernej velebnosti,<br>" +
                            "rozosievaš svoje slovo do duší tých,<br>" +
                            "ktorí majú otvorené srdce;<br>" +
                            "prosíme ťa, vypočuj naše modlitby,<br>" +
                            "zachovaj nás vo svojej milosti<br>" +
                            "a obohacuj nás poznávaním svojej nekonečnej dobroty.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"29", "Bratia a sestry, svätý pápež Pavol Šiesty si prial, aby sa Cirkev stala matkou lásky a liturgia výsostnou cestou jeho duchovného života. Ďakujme Bohu za mnohé dary, ktoré nám venoval cez tohto vzácneho pápeža, a vrúcne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby Cirkev, ktorá patrí Pánovi, aj v tejto náročnej dobe odvážne ohlasovala evanjelium a svedčila o tom, že Boh je láska, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby všetci ľudia pochopili, že nie je možné poznať Boha bez toho, aby najprv spoznali človeka, ktorý je stvorený na Boží obraz, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby predstavitelia všetkých národov sveta, bez ohľadu na ich bohatstvo, reč, rasu či náboženstvo, chránili ľudský život, mier a skutočný pokrok, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby všetci, ktorí slúžia chudobným, opusteným a poníženým, vytvárali civilizáciu lásky, ktorú Duch Svätý začal na Turíce, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby bol úprimný vzťah ku Kristovi zdrojom pravej pokory pre nás všetkých, prosme Pána.",
                    "Nebeský Otče,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby Cirkev znovu objavovala svoju pravú identitu,<br>" +
                            "prekonala rozdelenia minulosti,<br>" +
                            "stále vernejšie hlásala evanjelium ľuďom dnešnej doby<br>" +
                            "a oslavovala ťa vznešenou liturgiou.<br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] prosby6 = {
            {"01", "Bratia a sestry, mučeníci svojou krvou vyliatou za Krista dokázali bezhraničnú lásku k Bohu. Svätý mučeník Justín sa zaslúžil najmä o vstup kresťanstva do sveta starovekej kultúry. Modlime sa k Bohu, aby sme aj my boli vždy ochotní zastať sa svojej viery.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za celú Cirkev: aby svedectvom života veriacich dávala svetu živý dôkaz pravdy o svete, jeho stvorení i zavŕšení, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetky národy: aby poznali Krista, ktorý za ľudstvo položil svoj život na dreve kríža, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za tých, ktorí majú nepriateľský postoj ku kresťanom: aby spoznali ich učenie a prijali do svojho srdca živý prameň nádeje a lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás samých: aby sme svojím životom svedčili o tom, čo veríme, a aby Kristus stále zostával v nás, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za našich zosnulých <font color='#B71C1C'>(M.)</font>: aby ich Boží Syn prijal za svojich bratov a sestry a oslávil vo večnosti, prosme Pána.",
                    "Otče, svätý Justín bol mučený<br>" +
                            "pre svoj neochvejný postoj<br>" +
                            "pri obrane kresťanskej náuky;<br>" +
                            "na jeho príhovor vypočuj naše prosby<br>" +
                            "a vlej nám do duše silu stávať sa príkladnými kresťanmi.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"02", "Bratia a sestry, v deň spomienky na svätých mučeníkov Marcelína a Petra prednesme Pánovi svoje prosby a prehĺbme sa v dôvernej modlitbe.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby biskupi, kňazi a diakoni mali odvahu svedčiť o evanjeliu a obetovať za Krista aj svoj život, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby sa naši občianski predstavitelia usilovali o dobro, spravodlivosť a pokoj medzi národmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby sa chorí upevňovali vo viere a obetovali svoje utrpenie za spásu duší, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme sa nebáli brániť kresťanské hodnoty pred neveriacimi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zosnulí <font color='#B71C1C'>(M.)</font> naveky prebývali vo večnom domove v nebi, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "Cirkev už od najstarších čias<br>" +
                            "vzdávala úctu svätým Marcelínovi a Petrovi;<br>" +
                            "pomáhaj nám nasledovať ich príklad,<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a neopúšťaj nás v túžbe nasledovať ťa<br>" +
                            "s nerozdeleným srdcom.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"03", "Bratia a sestry, Cirkev sa šíri do celého sveta prostredníctvom odvážnych mužov a žien, ktorí neváhajú zomrieť za pravdu a za večný život. Svätí Karol Lwanga a jeho spoločníci ukázali vzor nadšeného zápasu o víťazstvo Božieho Syna nad útlakom tohto sveta. S vďakou sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, povzbudzuj cirkevných predstavených v krajinách, kde kresťanstvo musí zápasiť o svoje uznanie, aby neochabovali vo viere a pevne sa pridŕžali Krista.<br>" +
                            "<font color='#B71C1C'>2.</font> Otvor srdcia všetkých nepriateľov Cirkvi, aby tvoje milosrdenstvo zvíťazilo nad ich nepriateľským postojom.<br>" +
                            "<font color='#B71C1C'>3.</font> Na príhovor svätých Karola Lwangu a jeho spoločníkov ochraňuj mládež v Afrike a roznecuj v nej nadšenie konať skutky lásky.<br>" +
                            "<font color='#B71C1C'>4.</font> Urob z nás misionárov radostnej zvesti v každodennom živote, v práci, na cestách, v rodine i medzi priateľmi.<br>" +
                            "<font color='#B71C1C'>5.</font> Pripočítaj našich zosnulých <font color='#B71C1C'>(M.)</font> medzi zástupy blažených v nebeskom kráľovstve.",
                    "Bože, náš Otec,<br>" +
                            "tvoje Slovo je pevným základom,<br>" +
                            "na ktorom stojí naša cesta životom a naša nádej;<br>" +
                            "sprevádzaj nás každý deň, prijmi naše modlitby<br>" +
                            "a nauč nás vďačnosti za to, že sme ťa mohli spoznať.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"05", "Bratia a sestry, dnes si spomíname na svätého biskupa a mučeníka Bonifáca, apoštola Germánov a Nemecka. V modlitbe sa spojme s Bohom a spoločne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, prosíme ťa za Cirkev: aby všetci veriaci mali hlbokú úctu k Svätému Otcovi <font color='#B71C1C'>M.</font> a modlili sa na jeho úmysly.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za všetky krajiny: aby boli uchránené od fanatických vojnových útokov a ničenia prírodného i kultúrneho bohatstva.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za vydavateľov kníh: aby vydávali knižné tituly, ktoré budú obohatením duchovnej kultúry národa.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za seba samých: aby sme sa obnovovali na duchu účasťou na svätej omši a očisťovali si srdcia vo sviatosti zmierenia.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa za zosnulých <font color='#B71C1C'>(M.)</font>, ktorí nás predišli do večnosti: aby prežívali radosť zo stretnutia so Spasiteľom.",
                    "Bože, najláskavejší Otče,<br>" +
                            "svätý Bonifác z tvojej milosti položil pevné základy<br>" +
                            "na organizáciu Cirkvi v germánskych krajinách<br>" +
                            "a vynikal horlivosťou v misionárskej práci;<br>" +
                            "vypočuj naše prosby,<br>" +
                            "buď základom našej životnej púte<br>" +
                            "a urob z nás poslov svojej radostnej zvesti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"09", "Bratia a sestry, v dejinách Cirkvi na Východe vyniká pôsobenie a život svätého Efréma, diakona a učiteľa Cirkvi. Povzbuďme sa jeho príkladom a s radosťou sa obráťme na Krista, nášho Spasiteľa.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, zjednocuj celú Cirkev, aby v nej aj pri rôznosti názorov vládla jednota ducha.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, ochraňuj chudobné krajiny pred hladom a chorobami a bohatým krajinám udeľ dar dobročinnosti a nezištnej pomoci slabším a utláčaným.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, zachovávaj matky rodín v posväcujúcej milosti, aby svoje deti vychovávali v úcte k Cirkvi a k tebe.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, daj nám milosť dobrej smrti, aby sme ťa mohli uzrieť z tváre do tváre.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prijmi k sebe našich zosnulých <font color='#B71C1C'>(M.)</font>, odpusť im hriechy a naplň ich večným pokojom.",
                    "Pane Ježišu,<br>" +
                            "svätý Efrém Sýrsky nám zanechal<br>" +
                            "množstvo hymnov a duchovných spisov;<br>" +
                            "prijmi naše prosby<br>" +
                            "a otváraj nám srdcia<br>" +
                            "pre bohatstvo skryté v duchu a pravde.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"11", "Bratia a sestry, apoštoli a ich žiaci vykonali v prvotnej Cirkvi nezastupiteľnú úlohu pri upevňovaní viery a vzniku tradície. Dovoľme Kristovi vstúpiť i do našich sŕdc a obráťme sa naňho modlitbou.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, ty si spása sveta; ochraňuj svoju Cirkev postavenú na pevných základoch a veď ju k trvalému pokoju.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, ty si ochranca chudobných; vzbudzuj v ľuďoch skromnosť a veľkodušnosť podeliť sa o svoje hmotné dobrá.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, ty si milosrdný k hriešnikom; odpusť tým, ktorí o tebe šíria klamstvá, a otvor ich vnútro pre poznanie tvojej pravej tváre.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, ty si najlepší priateľ apoštolov; pomôž nám podľa vzoru svätého Barnabáša byť ľuďmi plnými Ducha Svätého a viery.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, ty si žiara večnosti; otvor brány blaženosti našim zosnulým <font color='#B71C1C'>(M.)</font> a buď ich nekonečným pokojom.",
                    "Ježišu, dokonalá obeta,<br>" +
                            "vypočuj naše prosby,<br>" +
                            "urob aj z nás apoštolov tvojho slova,<br>" +
                            "aby sme sa stali hodnými nazývať sa tvojimi priateľmi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"13", "Bratia a sestry, prosme všemohúceho Boha, aby nás na príhovor svätého Antona Paduánskeho sprevádzal svojou pomocou v časných i duchovných potrebách.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, povzbudzuj biskupov a kňazov, aby horlivo hlásali tvoje evanjelium.<br>" +
                            "<font color='#B71C1C'>2.</font> Veď všetky národy k zmiereniu a vzájomnej pomoci.<br>" +
                            "<font color='#B71C1C'>3.</font> Na príhovor svätého Antona obráť hriešnikov, ktorí počúvajú tvoje slovo.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj misionárom i katechétom a všetkým, ktorí ohlasujú tvoje slovo, na príhovor veľkého kazateľa svätého Antona potrebnú milosť.<br>" +
                            "<font color='#B71C1C'>5.</font> Odvráť od nás prílišnú starosť o majetok, bohatstvo a svetskú slávu.",
                    "Všemohúci Bože,<br>" +
                            "ty si náš Otec a vieš, čo potrebujeme;<br>" +
                            "prosíme ťa, daj,<br>" +
                            "aby sme hľadali najprv tvoje kráľovstvo,<br>" +
                            "a tak pociťovali tvoju lásku a pomoc.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "Bratia a sestry, pri spomienke na svätého Alojza prosme Pána, aby nám dal čisté srdce a aby bolo vo svete čím viac čnostných ľudí.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, ozdobuj svoju Cirkev čistotou a nevinnosťou mladých kresťanov.<br>" +
                            "<font color='#B71C1C'>2.</font> Vzbuď vo verejnom živote obrancov a vzory mravnej čistoty.<br>" +
                            "<font color='#B71C1C'>3.</font> Priveď mládež, ktorá hľadá životné ideály, k čítaniu Svätého písma, aby v ňom našla prameň slobody a nádeje.<br>" +
                            "<font color='#B71C1C'>4.</font> Ochraňuj anjelským chlebom všetkých, ktorí musia zápasiť o svoju čistotu.<br>" +
                            "<font color='#B71C1C'>5.</font> Na príhovor svätého Alojza zachovaj v nás bdelosť a uchráň nás od roztržitej modlitby.<br>" +
                            "<font color='#B71C1C'>6.</font> Stoj pri umierajúcich v mladom veku, aby neprepadli zúfalstvu, ale svoju nádej nachádzali v Kristovi.",
                    "Bože Otče,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme ľútosťou a pokáním znova získali,<br>" +
                            "čo sme stratili svojimi slabosťami.<br>" +
                            "O to ťa prosíme skrze Krista, nášho Pána."},
            {"23gk", "Bratia a sestry, svätý Ján Krstiteľ bol poslaný, aby vydával svedectvo o svetle a pripravil Pánovi ľud ochotný prijať pravdu. Prosme ho, aby sme aj my nasledovali jeho príklad.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, vyslyš svoj ľud.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Cirkev, aby s vernosťou svätého Jána Krstiteľa plnila svoje poslanie.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za hlásateľov evanjelia, aby svojim poslucháčom pomáhali lepšie poznávať a nasledovať Krista.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za svet, aby uznal potrebu duchovných hodnôt.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za všetky počaté deti, aby vždy mali možnosť prísť na svet a nájsť vo svojich rodinách lásku a pokoj.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za nás samých, aby nám vždy záležalo na prehlbovaní náboženského života.<br>" +
                            "<font color='#B71C1C'>6. V Trnavskej arcidiecéze:</font> Prosme za našu arcidiecézu, aby ju Pán požehnával a chránil od každého zla a nešťastia.",
                    "Všemohúci Bože,<br>" +
                            "svätý Ján Krstiteľ ťa oslávil tým,<br>" +
                            "že splnil všetko, čo si mu prikázal;<br>" +
                            "prijmi naše modlitby<br>" +
                            "ako prejav našej ochoty plniť tvoju vôľu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"24gk", "Bratia a sestry, na slávnosť Narodenia svätého Jána Krstiteľa prosme Pána, aby bolo čím viac tých, ktorí svedčia o Božom Baránkovi a ukazujú cestu k nemu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, žehnaj apoštolskú činnosť nášho pápeža <font color='#B71C1C'>M.</font>, nášho biskupa <font color='#B71C1C'>M.</font> a všetkých našich kňazov.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, osvieť svetlom evanjelia všetky národy a priveď ich na cestu spásy.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, otvor srdce toho ľudu, ku ktorému si prehovoril ako k prvému, aby poznal a miloval tvojho Syna Ježiša Krista.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, daj, aby naši kresťanskí rodičia s radosťou prijímali deti ako tvoj dar a vychovávali ich podľa Kristovho evanjelia.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, daj, aby sme si uvedomovali svoje znovuzrodenie v krste a zachovali si krstnú milosť.<br>" +
                            "<font color='#B71C1C'>6. V Trnavskej arcidiecéze:</font> Pane, zachovaj vo svojej milosti našu arcidiecézu, aby tvoja láska prenikla srdcia všetkých kňazov i veriacich a viedla ich k porozumeniu a vzájomnej pomoci.",
                    "Všemohúci Bože, vyslyš naše prosby<br>" +
                            "a pomáhaj nám neohrozene vyznávať kresťanskú vieru,<br>" +
                            "a tak pripravovať v srdciach ľudí cestu Pánovi,<br>" +
                            "ktorý s tebou žije a kraľuje na veky vekov. "},
            {"27b", "Bratia a sestry, svätý biskup Cyril Alexandrijský vykonal vzácne dielo pri obrane kresťanskej náuky, z ktorého čerpáme dodnes. S vďakou sa modlime a prosme o prehĺbenie svojho náboženského poznania.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby biskupi a kňazi s trpezlivosťou vysvetľovali veriacim pravé Kristovo učenie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby štátnici a politici rešpektovali náboženské prejavy veriacich a sami čestne žili, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby šíritelia bludných myšlienok a náuk našli cestu späť do pravej Kristovej Cirkvi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sa naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo usilovalo o dôstojnú oslavu Kristovej smrti a zmŕtvychvstania v liturgii svätej omše, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zomrelí <font color='#B71C1C'>(M.)</font> dosiahli radosť v nehynúcej Božej láske, prosme Pána.",
                    "Pane Ježišu, zjednocuješ nás vo svojom učení,<br>" +
                            "hoci máme rozličné názory a povahy;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a pomáhaj nám byť vernými kresťanmi<br>" +
                            "i strážcami duchovných hodnôt.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"28", "Bratia a sestry, v deň spomienky na svätého Ireneja, biskupa a mučeníka, si obzvlášť pripomíname, aké významné bolo šírenie pravej viery v prvotných časoch poapoštolskej Cirkvi. Buďme šíriteľmi Kristovho učenia a s dôverou sa k nemu modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, žehnaj nášho biskupa <font color='#B71C1C'>M.</font> a všetkých biskupov, aby ako starostliví otcovia bdeli nad rodinou svojich veriacich a privádzali ich bližšie k tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, ochraňuj národy na celom svete, aby mier víťazil nad vojnami a ozbrojenými konfliktmi.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, stoj pri tých, ktorí pochybujú vo viere, aby zostali verní tebe a tvojmu Otcovi vo Svätom Duchu.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, nauč nás pozorne čítať Sväté písmo a povzbudzuj nás v úsilí prehlbovať svoj duchovný život štúdiom náboženskej literatúry.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, priveď našich zomrelých <font color='#B71C1C'>(M.)</font> do raja, kde budú naveky prebývať so všetkými svätými.",
                    "Pane Ježišu, dávaš sa nám poznať v slove Písma;<br>" +
                            "nauč nás počúvať tvoje slovo,<br>" +
                            "prijmi naše modlitby<br>" +
                            "a sprevádzaj nás,<br>" +
                            "aby sme raz dosiahli plnosť poznania<br>" +
                            "v nebeskom kráľovstve.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"28gk", "Bratia a sestry, v predvečer slávnosti apoštolských kniežat svätých Petra a Pavla, na ktorých mučeníckej krvi Kristus postavil svoju Cirkev, prednesme Pánovi svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za pápeža <font color='#B71C1C'>M.</font>, pastiera na katedre svätého Petra, aby jeho láska ku Kristovi bola prameňom starostlivosti o celú Cirkev a posilou v znášaní protivenstiev.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za dar jednoty pre kresťanov, aby sme zbúrali múry rozdelení a vytvorili jedno spoločenstvo zhromaždené okolo jedného pastiera.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za kňazské a misijné povolania, aby veľa mladých ľudí osvietilo svetlo evanjelia, a tak obetovali za jeho ohlasovanie celé svoje telo, myseľ i srdce.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za všetkých chorých a núdznych, aby sa im dostalo materiálnej i duchovnej pomoci zo strany charity a boli zahrnutí starostlivosťou dobrých ľudí.",
                    "Pane Ježišu, ty poznáš ťažkosti nášho života;<br>" +
                            "prijmi naše prosby<br>" +
                            "a daj každému, za koho sme sa modlili, všetko, čo potrebuje,<br>" +
                            "aby sme ťa všetci verne nasledovali<br>" +
                            "ako svätí apoštoli Peter a Pavol.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"29gk", "Bratia a sestry, dnes s apoštolom Petrom radostne vyznávame, že Kristus je Boží Syn, a s apoštolom Pavlom ďakujeme za milosť povolania do Kristovej Cirkvi. Spoločne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev: aby pevne verila, že ju pekelné mocnosti nepremôžu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za Svätého Otca <font color='#B71C1C'>M.</font>, všetkých biskupov a kňazov: aby žiarili svätosťou života a slúžili Božiemu ľudu horlivo a s láskou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za vedúcich predstaviteľov štátov: aby spravovali svoj ľud múdro a spravodlivo, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za tých, čo trpia pre Kristovo meno: aby neklesali na duchu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: aby bolesti Cirkvi boli aj našimi bolesťami a jej radosti našimi radosťami, prosme Pána.",
                    "Pane Ježišu, tvoji apoštoli Peter a Pavol<br>" +
                            "ťa oslávili mučeníckou smrťou;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme ťa my všetci oslavovali živou vierou a láskou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"30", "Bratia a sestry, prví rímski mučeníci svojou krvou vyznali Krista, a tak dokázali vrcholnú lásku k nemu. V tejto spoločnej modlitbe prosme za statočnosť i vytrvalosť vo viere a za spásu sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa za Petra našich čias, pápeža <font color='#B71C1C'>M.</font>, aby si ho zachoval čo najdlhšie v službe Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, na príhovor prvých rímskych mučeníkov upevňuj všetkých kresťanov v hrdinskom vyznávaní viery.<br>" +
                            "<font color='#B71C1C'>3.</font> Pre krv mučeníkov odstráň z ľudskej spoločnosti pomstu, násilie a vraždy.<br>" +
                            "<font color='#B71C1C'>4.</font> Pre kríž, ktorý nosili prví rímski mučeníci, posilňuj všetkých, ktorí trpia na tele i na duši.<br>" +
                            "<font color='#B71C1C'>5.</font> Pre krv nášho Pána Ježiša Krista, kráľa mučeníkov, zachovaj v nás vernosť k Cirkvi a k tebe.",
                    "Bože Otče,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj nám odvahu vyznávať tvojho Syna pred ľuďmi,<br>" +
                            "aby nás aj on raz mohol vyznať pred tebou.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
    };

    String[][] prosby7 = {
            {"02gm", "Bratia a sestry, Božia Matka s radosťou kráčala cez hory a vrúcne spievala Bohu chválospev počas návštevy Alžbety. Aj táto naša spoločná modlitba nech je spevom nášho srdca a oslavou Boha.",
                    "<font color='#B71C1C'>(</font>Volajme: Pozri na Matku svojho Syna a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, daj, aby putujúcemu Božiemu ľudu bola Panna Mária znamením bezpečnej nádeje a útechy.<br>" +
                            "<font color='#B71C1C'>2.</font> Požehnávaj všetkých, ktorí pre pokoj medzi národmi nešetria ani námahu, ani cesty.<br>" +
                            "<font color='#B71C1C'>3.</font> Svojimi anjelmi sprevádzaj všetkých cestujúcich na zemi, na mori a vo vzduchu.<br>" +
                            "<font color='#B71C1C'>4.</font> Vštep do sŕdc všetkých ľudí úctu k matkám v požehnanom stave.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj, aby sme ako Panna Mária vedeli s láskou slúžiť a pomáhať našim bratom a sestrám.",
                    "Dobrotivý Bože,<br>" +
                            "Panna Mária nosila pod srdcom tvojho Syna;<br>" +
                            "daj, aby sme si na jej orodovanie<br>" +
                            "zachovali posväcujúcu milosť<br>" +
                            "a ustavične ťa nosili vo svojich srdciach.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"03g", "Bratia a sestry, na príhovor svätého apoštola Tomáša pokorne sa modlime k Pánovi Ježišovi, ktorý je našou cestou, pravdou i životom.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, posilni našu vieru.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, na príhovor svätého Tomáša daj Cirkvi silu odvážne hlásať svetu zmŕtvychvstalého Krista.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby biskupi a kňazi svojou službou svedčili o tom, že sa stretli s tebou a spoznali v tebe svojho Boha a Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Pomáhaj poslancom vyšších územných celkov v ich práci a námahe za dobro i blaho ľudu.<br>" +
                            "<font color='#B71C1C'>4.</font> Veď všetkých neveriacich a pochybujúcich, aby prekonali prekážky, ktoré im bránia uveriť v teba.<br>" +
                            "<font color='#B71C1C'>5.</font> Upevňuj v našom <font color='#B71C1C'>(</font>farskom<font color='#B71C1C'>)</font> spoločenstve ducha bratského spoločenstva a jednoty.",
                    "Pane Ježišu,<br>" +
                            "ty si vyhlásil za blahoslavených tých,<br>" +
                            "ktorí veria v teba, aj keď ťa nevidia;<br>" +
                            "daj, aby sme ťa čoraz lepšie poznávali vo svetle viery<br>" +
                            "a v nebi ťa videli vo svetle slávy,<br>" +
                            "v ktorej ty žiješ a kraľuješ na veky vekov."},
            {"05gk", "Bratia a sestry, oslavujeme našich vierozvestov a našich otcov svätých Cyrila a Metoda. V tejto spoločnej modlitbe prosme Pána, aby sme ostali verní ich odkazu.",
                    "<font color='#B71C1C'>(</font>Volajme: Dedičstvo otcov zachovaj nám, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, naši vierozvestovia mali osobitnú úctu k Petrovmu stolcu; vštep do sŕdc všetkých veriacich lásku k tvojmu námestníkovi, nášmu pápežovi <font color='#B71C1C'>M.</font><br>" +
                            "<font color='#B71C1C'>2.</font> Pane, svätí Cyril a Metod boli učiteľmi nášho ľudu; pomáhaj správcom verejných vecí, aby viedli ľud cestou pravdy a pokoja.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, vo svätom Metodovi si nám dal horlivého biskupa; daruj nám dobrých otcov biskupov a posilňuj ich darmi svojho Ducha.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, svätý Cyril sa so slzami v očiach modlil za našu jednotu vo viere; zachovaj nás vo vernosti tvojej svätej Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, svätí solúnski bratia boli apoštolmi Slovanov; na ich príhovor pomáhaj všetkým slovanským krajinám prispievať v európskom spoločenstve k zachovaniu kresťanských koreňov.",
                    "Pane Ježišu, vyslyš naše prosby<br>" +
                            "a naplň nás vďačnosťou za dar pravej viery;<br>" +
                            "pomáhaj nám žiť nábožne a spravodlivo,<br>" +
                            "aby sme si zachovali dedičstvo našich otcov.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"06", "Bratia a sestry, príklad života svätej panny a mučenice Márie Goretti je pre súčasnú dobu výzvou žiť čisto a mravne. Preto spoločne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj, nech tvoji kňazi svojím životom a slovom povzbudzujú mládež na čistý a mravný život.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby masmédiá svojím programom prispievali k vytváraniu mravného charakteru nášho národa.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, aby mladá generácia v čase svojho dospievania našla dobrých vychovávateľov.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj, aby znásilnené ženy a zneužívané deti našli silu vyrovnať sa s vnútorným zranením a dokázali odpustiť násilníkom.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj, aby naši chlapci i dievčatá objavili krásu čistého a mravného života.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane, daj, aby sme všetci spojili svoje sily v boji proti každému násiliu a hriechu.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a daj, aby sme na príhovor svätej panny Márie Goretti<br>" +
                            "premáhali pokušenia tela, sveta i zlého ducha<br>" +
                            "a slúžili ti s čistým srdcom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11g", "Bratia a sestry, postoj svätého Benedikta, ktorý obdivuhodne spájal modlitbu s prácou, nás vedie k správnemu životu. V tejto spoločnej modlitbe prosme Pána, aby sme modlitbou a prácou oslavovali Boha a boli osožní blížnym.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj, aby na orodovanie svätého Benedikta bol tvoj ľud modliacou sa Cirkvou.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomôž svetu pochopiť, aká prospešná je modlitba a obeta rehoľníkov pre život celého ľudského spoločenstva.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, aby sa národy Európy na orodovanie svätého Benedikta novou evanjelizáciou obnovili v Kristovi.<br>" +
                            "<font color='#B71C1C'>4.</font> Žehnaj všetkých, ktorí iných učia čítať a písať a vštepujú im lásku k pracovitému životu.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás vďačnosti za všetky dobrodenia, ktoré nám Cirkev dáva.",
                    "Bože Otče,<br>" +
                            "svätý Benedikt zažiaril mnohým národom<br>" +
                            "ako učiteľ modlitby a práce;<br>" +
                            "posilňuj a zachovaj nás vo svojej svätej službe<br>" +
                            "a milostivo vyslyš naše prosby.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"15", "Bratia a sestry, nábožnosť a múdrosť sú vlastnosti, ktorými vynikal svätý biskup Bonaventúra. Pokorne prosme všemohúceho Boha a nábožne prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, rozmnožuj v Cirkvi počet rozvážnych a obetavých rehoľných predstavených, aby viedli svojich bratov a sestry k pravej múdrosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, obdaruj všetkých ľudí darmi Ducha Svätého, aby sa všade rozmáhala tvoja láska.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, povzbudzuj teológov k tvorbe vedeckých diel, ktoré by priniesli nové a obohacujúce poznanie tvojho zjavenia.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, na príhovor svätého biskupa Bonaventúru nám daruj múdrosť a rozvážnosť pri konaní v našich rodinách a na pracoviskách.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, odmeň slávou večnej blaženosti našich zomrelých <font color='#B71C1C'>(M.)</font>, aby naveky velebili tvoju dobrotu.",
                    "Nekonečne láskavý Otče,<br>" +
                            "svätý Bonaventúra prenikol hlboko do tvojho učenia<br>" +
                            "a zanechal nám skvostné teologické dielo;<br>" +
                            "vypočuj naše prosby a pomáhaj nám<br>" +
                            "pochopiť zmysel života<br>" +
                            "a nasmerovať svoje kroky k blaženej večnosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"16m", "Bratia a sestry, naša nebeská Matka Mária, hviezda z hory Karmel, nás povzbudzuje v úsilí o spásu. Prosme Pána, aby vypočul jej príhovor a dával nám potrebnú milosť na spásu.",
                    "<font color='#B71C1C'>(</font>Volajme: Na príhovor svojej Matky vyslyš nás, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, na príhovor svojej matky, kráľovnej posvätného škapuliara, daruj Cirkvi dostatok kňazských, rehoľných a misijných povolaní.<br>" +
                            "<font color='#B71C1C'>2.</font> Ježišu, na príhovor svojej matky, nevyčerpateľnej studnice milosrdenstva, daj svetlo Ducha Svätého všetkým našim predstaveným.<br>" +
                            "<font color='#B71C1C'>3.</font> Ježišu, na príhovor svojej matky, posily vo všetkých trápeniach, vlievaj svoju lásku a vzájomné porozumenie rodinám, ktoré trpia a rozpadajú sa.<br>" +
                            "<font color='#B71C1C'>4.</font> Ježišu, na príhovor svojej matky, ochrankyne tých, ktorí nosia posvätný škapuliar, buď našou útechou a nádejou v pokušeniach.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, na príhovor svojej matky, útechy v hodine smrti, pomáhaj našim zomrelým <font color='#B71C1C'>(M.)</font> dosiahnuť večnú radosť u nebeského Otca.",
                    "Najláskavejší Ježišu,<br>" +
                            "v tvojej matke Márii máme posilu v nebezpečenstvách<br>" +
                            "a vieme, že sme milovanými Božími deťmi;<br>" +
                            "prosíme ťa, vypočuj naše volanie k tebe<br>" +
                            "a posilňuj nás vo vytrvalej službe Bohu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"17", "Bratia a sestry, naši svätí pustovníci Andrej Svorad a Benedikt nás povzbudzujú, aby sme si vedeli nájsť tiché chvíle na rozhovor s Bohom. Prosme Pána, aby sme nezabúdali na modlitbu a sebazapieranie.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, prameň svätosti, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, očisťuj a posväcuj Cirkev modlitbou a pokáním všetkých kresťanov.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilni našich predstavených, aby slovom i príkladom viedli ľud k pracovitému životu.<br>" +
                            "<font color='#B71C1C'>3.</font> Povzbuď všetkých, ktorí sú na dovolenkách a prázdninách, aby si našli čas na modlitbu a svätú omšu.<br>" +
                            "<font color='#B71C1C'>4.</font> Priveď všetkých násilníkov a vrahov k zmene života a úprimnému pokániu.<br>" +
                            "<font color='#B71C1C'>5.</font> Upevňuj v našich rodinách život podľa viery a povzbudzuj ich na spoločnú modlitbu.<br>" +
                            "<font color='#B71C1C'>6. V Nitrianskej diecéze:</font> Daj, aby veriaci našej diecézy na príhovor svätých Andreja Svorada a Benedikta boli živými svedkami Božej milosti a radosti.",
                    "Pane Ježišu, ty bohato odmeňuješ všetkých,<br>" +
                            "ktorí ťa nasledujú celým srdcom;<br>" +
                            "pomáhaj nám prepásať si bedrá sebazapieraním<br>" +
                            "a držať v rukách horiace sviece dobrých skutkov,<br>" +
                            "aby sme dosiahli spásu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"17g", "Bratia a sestry, naši svätí pustovníci Andrej Svorad a Benedikt nás povzbudzujú, aby sme si vedeli nájsť tiché chvíle na rozhovor s Bohom. Prosme Pána, aby sme nezabúdali na modlitbu a sebazapieranie.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, prameň svätosti, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, očisťuj a posväcuj Cirkev modlitbou a pokáním všetkých kresťanov.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilni našich predstavených, aby slovom i príkladom viedli ľud k pracovitému životu.<br>" +
                            "<font color='#B71C1C'>3.</font> Povzbuď všetkých, ktorí sú na dovolenkách a prázdninách, aby si našli čas na modlitbu a svätú omšu.<br>" +
                            "<font color='#B71C1C'>4.</font> Priveď všetkých násilníkov a vrahov k zmene života a úprimnému pokániu.<br>" +
                            "<font color='#B71C1C'>5.</font> Upevňuj v našich rodinách život podľa viery a povzbudzuj ich na spoločnú modlitbu.<br>" +
                            "<font color='#B71C1C'>6. V Nitrianskej diecéze:</font> Daj, aby veriaci našej diecézy na príhovor svätých Andreja Svorada a Benedikta boli živými svedkami Božej milosti a radosti.",
                    "Pane Ježišu, ty bohato odmeňuješ všetkých,<br>" +
                            "ktorí ťa nasledujú celým srdcom;<br>" +
                            "pomáhaj nám prepásať si bedrá sebazapieraním<br>" +
                            "a držať v rukách horiace sviece dobrých skutkov,<br>" +
                            "aby sme dosiahli spásu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"17gk", "Bratia a sestry, naši svätí pustovníci Andrej Svorad a Benedikt nás povzbudzujú, aby sme si vedeli nájsť tiché chvíle na rozhovor s Bohom. Prosme Pána, aby sme nezabúdali na modlitbu a sebazapieranie.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, prameň svätosti, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, očisťuj a posväcuj Cirkev modlitbou a pokáním všetkých kresťanov.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilni našich predstavených, aby slovom i príkladom viedli ľud k pracovitému životu.<br>" +
                            "<font color='#B71C1C'>3.</font> Povzbuď všetkých, ktorí sú na dovolenkách a prázdninách, aby si našli čas na modlitbu a svätú omšu.<br>" +
                            "<font color='#B71C1C'>4.</font> Priveď všetkých násilníkov a vrahov k zmene života a úprimnému pokániu.<br>" +
                            "<font color='#B71C1C'>5.</font> Upevňuj v našich rodinách život podľa viery a povzbudzuj ich na spoločnú modlitbu.<br>" +
                            "<font color='#B71C1C'>6. V Nitrianskej diecéze:</font> Daj, aby veriaci našej diecézy na príhovor svätých Andreja Svorada a Benedikta boli živými svedkami Božej milosti a radosti.",
                    "Pane Ježišu, ty bohato odmeňuješ všetkých,<br>" +
                            "ktorí ťa nasledujú celým srdcom;<br>" +
                            "pomáhaj nám prepásať si bedrá sebazapieraním<br>" +
                            "a držať v rukách horiace sviece dobrých skutkov,<br>" +
                            "aby sme dosiahli spásu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"21", "Bratia a sestry, povzbudení životom svätého kňaza Vavrinca z Brindisi, učiteľa Cirkvi, modlime sa k nebeskému Otcovi a zjednoťme sa v duchu pravdy.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, vypočuj nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za celú Cirkev, aby kráčala cestou evanjelia a ďakovala za Kristovu vykupiteľskú obetu.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za všetky národy, aby mali úctu k ľudskému životu a nasmerovali svoje kroky k večnému nebeskému kráľovstvu.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za spisovateľov, aby slovami vyjadrovali pravdy života a zachovávali mravné i duchovné hodnoty.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za chorých, aby čítaním duchovnej literatúry našli posilu vo svojom utrpení.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby malo v úcte svojho duchovného pastiera a podporovalo ho modlitbami.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa na našich zomrelých <font color='#B71C1C'>(M.)</font>, aby boli pripočítaní k zástupom blažených vo večnom nebeskom príbytku.",
                    "Pane a Bože náš, ty si najvyššia pravda a nekonečné dobro;<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a prebývaj medzi nami,<br>" +
                            "aby sme ťa stále viac mohli spoznávať a hlbšie milovať.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22g", "Bratia a sestry, Mária Magdaléna, Pánova učeníčka, bola prvá, ktorá oznámila apoštolom radostnú veľkonočnú zvesť. Prosme Pána, aby sme aj my boli jeho vernými učeníkmi a ohlasovali veľké skutky diela spásy.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby kresťanské ženy, dievčatá i manželky statočne spĺňali svoje úlohy v Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby citlivé ženské srdcia ozdravovali a udržiavali mravnosť v ľudskej spoločnosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Žehnaj všetky zasvätené panny, ktoré ti slúžia s nerozdeleným srdcom, a urob plodnou ich prácu na posväcovaní duší.<br>" +
                            "<font color='#B71C1C'>4.</font> Zachovaj v čistote mladých kresťanov našej farnosti a roznieť v nich lásku k svätým veciam.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj, aby matky a otcovia našej farnosti boli prvými svedkami viery svojim deťom.",
                    "Pane Ježišu,<br>" +
                            "ty si urobil Máriu Magdalénu<br>" +
                            "apoštolkou apoštolov<br>" +
                            "a svedkyňou svojho umučenia a zmŕtvychvstania,<br>" +
                            "pretože ťa veľmi milovala;<br>" +
                            "daj, aby sme sa aj my vinuli k tebe celým srdcom<br>" +
                            "a neohrozene ohlasovali tvoje veľkonočné tajomstvo.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"23g", "Bratia a sestry, Ježiša nasledovali mnohé ženy a pomáhali mu. Dnes, na sviatok svätej Brigity, prosme Pána, aby na jej orodovanie dal Cirkvi i svetu šľachetné ženy a matky.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, na príhovor svätej Brigity, ktorá ti bola verná aj v protivenstvách, udeľ Cirkvi silu v pokušeniach a súženiach.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, na orodovanie svätej Brigity, ktorá dosiahla svätosť v manželstve, posväcuj naše rodiny.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, na príhovor svätej Brigity, ktorá sa ako vdova posväcovala modlitbou a milosrdnou láskou, žehnaj všetkých, ktorí sa venujú skutkom milosrdenstva.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, na orodovanie svätej Brigity, ktorá vychovala deti pre Božie kráľovstvo a pre dobro ľudskej spoločnosti, daruj rodičom múdrosť pri výchove detí.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, na príhovor svätej Brigity pomáhaj dievčatám a ženám v ich úsilí o svätosť života.",
                    "Pane Ježišu,<br>" +
                            "na orodovanie svätej Brigity<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby každá naša rodina<br>" +
                            "bola zdravou bunkou tvojej Cirkvi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"25g", "Bratia a sestry, apoštoli sú prvými ohlasovateľmi Kristovho evanjelia a stĺpmi Cirkvi. Dnes, na sviatok svätého apoštola Jakuba staršieho, prosme Pána za spásu celého sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Na príhovor svätého Jakuba vyslyš nás, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, prosíme ťa za Cirkev, ktorú si získal krížom svojho Syna a vybudoval na svedectve apoštolov, aby vydávala svetu jediné bohatstvo, ktoré má – ukrižovaného a vzkrieseného Krista.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, prosíme ťa za celé ľudstvo, ktoré tak často prežíva neistotu, boje a nesvornosť, aby počulo hlas šíriteľov evanjelia a našlo pravé ľudské hodnoty v Kristovej blahozvesti.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, prosíme ťa za tých, ktorí trpia pre Ježišovo meno a pre spravodlivosť, ktorá sa usiluje o pokoj vo svete, aby ich obeť bola semenom nových kresťanov.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, prosíme ťa za seba samých, ktorí sme sa zhromaždili na sviatok apoštola Jakuba, aby sme sa vytrvalo zúčastňovali na učení apoštolov, s radosťou a s úprimným srdcom požívali nebeský chlieb a privádzali nových bratov a sestry do Cirkvi.",
                    "Bože Otče,<br>" +
                            "ty si svojou mocou posilňoval apoštolov<br>" +
                            "v ich pokornom a radostnom svedectve;<br>" +
                            "daj, aby sme aj my svojím životom ohlasovali evanjelium<br>" +
                            "v sile a múdrosti tvojho Ducha.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"26", "Bratia a sestry, pri spomienke na rodičov Panny Márie nábožne sa modlime za posvätenie našich rodín.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, daj, aby Cirkev zjednocovala veriacich do jednej rodiny a viedla ich k zodpovednému rodičovstvu.<br>" +
                            "<font color='#B71C1C'>2.</font> Žehnaj všetkých verejných činiteľov, ktorí pracujú pre hmotné i duchovné dobro rodín.<br>" +
                            "<font color='#B71C1C'>3.</font> Pomôž nájsť sirotám a opusteným deťom teplo domova v kresťanských rodinách.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj, aby manželia našej farnosti boli spolu so svojimi manželkami prvými svedkami viery svojim deťom.<br>" +
                            "<font color='#B71C1C'>5.</font> Dopraj našim starým rodičom požehnanú starobu, radosť z vnúčat, trpezlivosť v chorobe a nádej na stretnutie s Kristom, naším spasiteľom.",
                    "Bože Otče,<br>" +
                            "ty si nábožných manželov Joachima a Annu<br>" +
                            "obdaroval kvetom nevinnosti –<br>" +
                            "nepoškvrnenou Pannou Máriou;<br>" +
                            "na ich orodovanie daj,<br>" +
                            "aby naši rodičia s láskou prijímali deti ako Boží dar<br>" +
                            "a viedli ich k tebe.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"27", "Bratia a sestry, spomíname si na učeníkov našich vierozvestov Cyrila a Metoda: na svätých Gorazda, Klementa, Nauma, Angelára a Sávu. Prosme Pána, aby sa na ich príhovor zveľaďovala kresťanská viera.",
                    "<font color='#B71C1C'>(</font>Volajme: Dedičstvo otcov zachovaj nám, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby sa posvätná liturgia konala všade dôstojne a podľa predpisov Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, daruj slovenskému národu dobrých biskupov a posilňuj ich darmi svojho Ducha.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, pomáhaj správcom verejných vecí, aby viedli ľud cestou pravdy a pokoja.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, svojou útechou a silou naplň všetkých, ktorí trpia pre tvoje meno.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, zachovaj nás vo vernosti a v láske k tvojej svätej Cirkvi.",
                    "Pane Ježišu Kriste,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a na príhovor svätých Gorazda,<br>" +
                            "Klementa, Nauma, Angelára a Sávu<br>" +
                            "upevňuj nás vo viere,<br>" +
                            "ktorú oni ako žiaci svätých solúnskych bratov<br>" +
                            "šírili v našej krajine.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"29", "Bratia a sestry, svätá Marta, sestra Márie a Lazára, s radosťou prijala Ježiša ako hosťa a starostlivo mu posluhovala. Prosme ho za všetkých, ktorí svojim blížnym starostlivo slúžia a pomáhajú.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby všetci, ktorí vykonávajú v Cirkvi rozličné služby, mali pevnú vieru a boli horliví.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby zasvätené osoby svojím životom poukazovali na nebeské dobrá a vydávali svedectvo o novom a večnom živote.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, aby chorí a opustení našli v ošetrovateľoch pomoc, prijatie a pochopenie.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj, aby naše rodiny prenikol duch pravej kresťanskej štedrosti a pohostinnosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj, aby sme ako Mária ochotne počúvali tvoje slová a ako Marta starostlivo slúžili svojim blížnym.<br>" +
                            "<font color='#B71C1C'>6.</font> Daj, aby naši zomrelí rodičia a príbuzní našli plnosť života v tvojom vzkriesení.",
                    "Pane Ježišu,<br>" +
                            "ty si nazval bratom, sestrou a matkou<br>" +
                            "všetkých, ktorí plnia tvoju vôľu;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby si v našich slovách i skutkoch našiel zaľúbenie.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"30", "Bratia a sestry, svätý biskup Peter Chryzológ viedol nábožný a vzorný život. Usilujme sa i my stať svätými a s dôverou prednesme Bohu svoje modlitby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby kňazi boli blízkymi spolupracovníkmi svojho biskupa a usilovali sa o poslušnosť a duchovnú jednotu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby predstavitelia národov boli mravnou oporou svojmu ľudu a strážcami kultúrnych hodnôt, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby neveriaci spoznali Kristovu blahozvesť a túžili stať sa vzornými kresťanmi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme pozorne počúvali Božie slovo a podľa neho aj žili, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zomrelí <font color='#B71C1C'>(M.)</font> boli zjednotení s večným Slovom, prosme Pána.",
                    "Pane a Bože, náš stvoriteľ a ochranca,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomáhaj nám<br>" +
                            "stále viac sa pripodobňovať tvojmu Synovi,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"30b", "Bratia a sestry, Boh v živote svätých korunuje dielo svojej milosti. Za hrdinské čnosti bola na oltár povýšená aj dcéra nášho národa, blahoslavená sestra Zdenka. Ďakujme Bohu za dar jej príkladného života a spoločne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože Otče, pokorne ťa prosíme za Cirkev na Slovensku, aby na príhovor blahoslavenej Zdenky bola v dnešných časoch presvedčivá v hlásaní evanjelia a ochotná prinášať obety za pravdy viery.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, prosíme ťa za predstaviteľov našej vlasti, aby rešpektovali slobodu náboženského vyznania a chápali, že naša spoločnosť vyrástla a obstojí len na kresťanských základoch.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, prosíme ťa za zasvätené osoby, aby čistotou srdca a radosťou, s akou obetujú svoj život tebe, poukazovali na duchovný život a večné hodnoty.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, prosíme ťa za tých, ktorí akýmkoľvek spôsobom pomáhajú tvojim kňazom, aby podľa príkladu blahoslavenej Zdenky pamätali na to, že v kňazoch slúžia tebe samému.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, prosíme ťa za nás samých, aby sme podporovaní príhovorom tvojich svätých túžili po kresťanskej dokonalosti a spáse.",
                    "Bože a Otče náš,<br>" +
                            "s vďakou za hrdinské svedectvo viery a lásky,<br>" +
                            "ktoré nám z tvojej milosti dosvedčila blahoslavená Zdenka,<br>" +
                            "pokorne ťa prosíme, aby si vypočul naše prosby<br>" +
                            "a pomáhal nám na ceste svätosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "Bratia a sestry, Boh poslal na svet svojho Syna, aby roznietil oheň lásky v ľudských srdciach. Prosme Pána, aby sa oheň, ktorý horel v srdci svätého Ignáca, šíril po celom svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daruj všetkým kňazom ducha poslušnosti a úcty k námestníkovi Ježiša Krista, pápežovi <font color='#B71C1C'>M.</font><br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby všetky národy videli v tvojej Cirkvi duchovnú oporu a spoločenstvo lásky a pokoja.<br>" +
                            "<font color='#B71C1C'>3.</font> Pomáhaj všetkým misionárom, aby svetlo evanjelia zažiarilo po celom svete.<br>" +
                            "<font color='#B71C1C'>4.</font> Sprevádzaj všetkých, ktorí sa zúčastňujú duchovných cvičení, aby tento čas milosti využili na obnovu svojho duchovného života.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, nauč nás modliť sa i rozjímať a roznieť v našich srdciach lásku k tebe.",
                    "Pane Ježišu, ty posielaš svojej Cirkvi<br>" +
                            "vynikajúcich mužov v pravom čase;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme všetko robili<br>" +
                            "na väčšiu Božiu slávu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
    };

    String[][] prosby8 = {
            {"01", "Bratia a sestry, biskupi sú nástupcovia apoštolov. Dnes si spomíname na svätého biskupa Alfonza. Preto v tejto spoločnej modlitbe prosme za všetkých biskupov a za spásu celého sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, na príhovor svätého biskupa Alfonza naplň darmi Ducha Svätého nášho biskupa <font color='#B71C1C'>M.</font> i všetkých biskupov tvojej Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Vnukni všetkým verejným činiteľom, aby ochotne pomáhali pri budovaní pokoja.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, aby právnici vždy rozhodovali svedomito v duchu práva a spravodlivosti.<br>" +
                            "<font color='#B71C1C'>4.</font> Sprevádzaj spovedníkov pastoračnou múdrosťou, aby prispievali k morálnej obrode Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Privádzaj nás neustálym náboženským vzdelávaním od povrchnosti a povier k hlbokej a pravej viere.",
                    "Bože, na orodovanie svätého biskupa Alfonza<br>" +
                            "vyslyš naše prosby<br>" +
                            "a upevňuj nás vo vernosti tvojej Cirkvi,<br>" +
                            "aby sme spolu so svojimi duchovnými pastiermi<br>" +
                            "dosiahli nebeské kráľovstvo.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"04", "Bratia a sestry, Pán sa zjavuje svojim služobníkom, ktorí ho milujú. Prosme, aby aj v našich srdciach horela láska, akú mal svätý Ján Mária Vianney.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj Cirkvi kňazov, ktorých jedinou múdrosťou a najväčšou láskou je ukrižovaný a chudobný Kristus.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, nech si kňazi v pastorácii uvedomujú, že ich život je školou pre nové kňazské povolania.<br>" +
                            "<font color='#B71C1C'>3.</font> Vyhas v srdciach ľudí nenávisť a všetku zlú vôľu.<br>" +
                            "<font color='#B71C1C'>4.</font> Zbav ľudí neresti alkoholizmu a iných závislostí a zažeň od nich ducha nemravnosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Priveď kajúcich hriešnikov k prameňu milosrdenstva, ktorým je sviatosť zmierenia.<br>" +
                            "<font color='#B71C1C'>6.</font> Nauč nás vážiť si dar krstného znovuzrodenia a daj nám odvahu vyznávať svoju vieru.",
                    "Pane Ježišu,<br>" +
                            "ty si ustanovil katolícke kňazstvo,<br>" +
                            "aby si ustavične bol s nami;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a na orodovanie svätého Jána,<br>" +
                            "patróna duchovných pastierov,<br>" +
                            "daj nám kňazov podľa svojho srdca.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"05", "Bratia a sestry, vždy sa radujeme z oslavy Panny Márie, Matky Božieho Syna a jeho Cirkvi. Preto sa s dôverou modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pozri na Matku svojho Syna a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, naplň všetkých kresťanov radosťou nad bohatstvom milostí, ktoré si vložil do srdca Panny Márie.<br>" +
                            "<font color='#B71C1C'>2.</font> Ukáž všetkým nositeľom moci krásu a vznešenosť Božieho života v človekovi.<br>" +
                            "<font color='#B71C1C'>3.</font> Daruj svetu šľachetné a obetavé matky, ktoré budú schopné vychovať šťastné pokolenie.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj nám vo všetkých ťažkostiach pocítiť mocný príhovor našej nebeskej Matky.<br>" +
                            "<font color='#B71C1C'>5.</font> Upevni v našom <font color='#B71C1C'>(</font>farskom<font color='#B71C1C'>)</font> spoločenstve náboženský život pomocou horlivých dievčat a nábožných matiek.",
                    "Dobrotivý Bože,<br>" +
                            "ty si zhliadol na poníženosť svojej služobnice<br>" +
                            "a vyvolil si ju za matku svojho Syna;<br>" +
                            "daj, aby sme ti pod jej materskou ochranou<br>" +
                            "verne slúžili a ustavične ťa chválili.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"06gn", "Bratia a sestry, sme pri Ježišovi tak blízko, ako boli jeho učeníci na vrchu Tábor. Preto s dôverou prosme nášho Pána, aby svetlo jeho milosti ožiarilo Cirkev i celý svet.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, naplň srdcia všetkých kňazov radosťou, že môžu pri tvojom oltári sláviť sväté tajomstvá.<br>" +
                            "<font color='#B71C1C'>2.</font> Osvieť všetkých ľudí, aby v tebe spoznali Božieho Syna, v ktorom má Otec zaľúbenie.<br>" +
                            "<font color='#B71C1C'>3.</font> Vnukni všetkým, ktorí majú dary ducha, aby svojím umením dvíhali ľudí k tebe.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj duchovne pookriať tým, ktorí sú vyčerpaní prácou a starosťami.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás prežívať svätú omšu s nadšením apoštolov, ktorí sa zúčastnili na tvojom premenení.",
                    "Pane Ježišu,<br>" +
                            "dobre je nám tu <font color='#B71C1C'>(</font>v tvojom chráme<font color='#B71C1C'>)</font>;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pomáhaj nám verne vytrvať pri tebe<br>" +
                            "aj vo chvíľach skúšok,<br>" +
                            "aby sme raz mohli vidieť tvoju oslávenú tvár.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"07a", "Bratia a sestry, Cirkev si obzvlášť ctí múdrych a obetavých mužov, medzi ktorých patrili aj svätý pápež Sixtus Druhý a jeho spoločníci. S vďakou za ich život pozdvihnime svoje srdcia k modlitbe.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, preukazuj svoje milosrdenstvo nášmu Svätému Otcovi <font color='#B71C1C'>M.</font>, aby v dobrote a pokoji viedol celú Cirkev.<br>" +
                            "<font color='#B71C1C'>2.</font> Usmerňuj myšlienky a skutky predstaviteľov národov, aby ich skutky boli odrazom úprimného záujmu o dobro ľudu.<br>" +
                            "<font color='#B71C1C'>3.</font> Osobitnou ochranou sprevádzaj tých, ktorí sa obrátili na pravú vieru, aby zotrvali v radosti z prijatia do Božej rodiny.<br>" +
                            "<font color='#B71C1C'>4.</font> Povzbudzuj nás v hlásaní Božieho slova v našich rodinách a na pracoviskách, aby sme sa nebáli svedčiť o tebe.<br>" +
                            "<font color='#B71C1C'>5.</font> Obdaruj našich zomrelých <font color='#B71C1C'>(M.)</font> vencom nebeskej slávy, aby ťa naveky velebili.",
                    "Pane Ježišu, náš priateľ a osloboditeľ,<br>" +
                            "svätý pápež Sixtus a jeho spoločníci<br>" +
                            "už dostali odmenu za svoje mučeníctvo;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a dovoľ aj nám raz spočinúť v tvojej blízkosti.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"08", "Bratia a sestry, kňazi sú Boží služobníci, ktorí nás sviatosťami posväcujú a Božím slovom i svojím životom vedú k svätosti. Dnes si spomíname na svätého kňaza Dominika. V tejto spoločnej modlitbe prosme Pána, aby sme si vždy lepšie uvedomovali, že sme povolaní na svätosť, a prosme aj za spásu sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, na príhovor svätého kňaza Dominika naplň darmi svojho Ducha všetkých kňazov Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Odmeň všetkých, ktorí sa vo svete usilujú o spravodlivosť a pokoj.<br>" +
                            "<font color='#B71C1C'>3.</font> Vlož do sŕdc učiteľov teológie obraz ukrižovaného Krista, aby sa zachovala čistota katolíckej náuky.<br>" +
                            "<font color='#B71C1C'>4.</font> Posilňuj všetkých, ktorí sú biedami tohto sveta ohrození na tele alebo na duši.<br>" +
                            "<font color='#B71C1C'>5.</font> Žehnaj nášho duchovného otca <font color='#B71C1C'>(</font>kňazov našej farnosti<font color='#B71C1C'>)</font> a ostatných kňazov, aby boli vernými služobníkmi oltára a starostlivými duchovnými pastiermi.<br>" +
                            "<font color='#B71C1C'>6.</font> Udeľ veniec nebeskej slávy našim zosnulým kňazom.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a na orodovanie svätého kňaza Dominika<br>" +
                            "daj nám dobrých kňazov,<br>" +
                            "aby nás viedli k výšinám svätosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"09g", "Bratia a sestry, Pán odmeňuje svätosťou tých, ktorí obetujú život jeho láske. Na sviatok svätej Terézie Benedikty z Kríža, patrónky Európy, prosme všemohúceho Boha, aby sme pochopili múdrosť kríža.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, pomáhaj všetkým služobníkom Cirkvi nasledovať vzory svätých, aby žiarili svetlom oddanosti tebe.<br>" +
                            "<font color='#B71C1C'>2.</font> Zachovaj národy Európy v bratskej láske a v slobode náboženského vyznania.<br>" +
                            "<font color='#B71C1C'>3.</font> Požehnávaj národ Starého zákona, aby bol verný tvojmu slovu a v predpovediach prorokov našiel Ježiša z Nazareta.<br>" +
                            "<font color='#B71C1C'>4.</font> Ochraňuj nás od sebeckosti a zištných záujmov a vlej do našich duší radosť z pomoci blížnym.<br>" +
                            "<font color='#B71C1C'>5.</font> Prijmi našich zomrelých <font color='#B71C1C'>(M.)</font> do spoločenstva svätých v kráľovstve večnej dobroty a milosti.",
                    "Pane a Bože náš,<br>" +
                            "ty sa dávaš poznať tým,<br>" +
                            "ktorí vytrvalo hľadajú pravdu;<br>" +
                            "prosíme ťa, prijmi naše modlitby<br>" +
                            "a na orodovanie svätej Terézie Benedikty<br>" +
                            "priveď všetkých ľudí k spáse.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10g", "Bratia a sestry, svätý Vavrinec je svojou oddanou službou a statočnou mučeníckou smrťou povzbudením pre všetkých kresťanov. Vyprosujme si aj my od Pána veľkodušnosť a silu viery.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, stoj pri svojej Cirkvi, keď prežíva rozličné skúšky a súženia.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby sa diakoni podľa príkladu svätého Vavrinca privinuli k tvojmu srdcu a svojím životom prejavovali jeho lásku všetkým ľuďom.<br>" +
                            "<font color='#B71C1C'>3.</font> Požehnávaj našu vlasť, aby v nej nikdy nechýbali ľudia citliví na potreby blížnych.<br>" +
                            "<font color='#B71C1C'>4.</font> Žehnaj všetky charitatívne diela, ktoré sa usilujú zmierniť hlad vo svete.<br>" +
                            "<font color='#B71C1C'>5.</font> Daruj nám milosť, aby nás účasť na tejto eucharistickej obete pripravovala na večnú hostinu v nebeskom kráľovstve.",
                    "Pane Ježišu,<br>" +
                            "ty si neprišiel, aby ťa obsluhovali,<br>" +
                            "ale aby si sám slúžil;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a na príhovor svätého Vavrinca<br>" +
                            "nám daj silu vytrvať v službe blížnym.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"11", "Bratia a sestry, Boha najviac oslavujú tí, ktorí sa z lásky k nemu zriekajú všetkého. Tak ho oslávila aj svätá Klára, ktorá podľa príkladu svätého Františka z Assisi nasledovala Krista chudobného a pokorného. Vyprosujme Cirkvi a sebe silu zachovať vernosť evanjeliu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, žehnaj všetkých, ktorí sa ti zasvätili sľubmi, aby kráčali za tebou s nerozdeleným srdcom a netúžili po kariére.<br>" +
                            "<font color='#B71C1C'>2.</font> Posväcuj svet modlitbou a pokáním tých, ktorí sa ti úplne zasvätili.<br>" +
                            "<font color='#B71C1C'>3.</font> Naplň svojou milosťou dievčatá, aby objavili hodnotu panenstva.<br>" +
                            "<font color='#B71C1C'>4.</font> Vzbudzuj v mladých ľuďoch zmysel pre poriadok, ktorý je podmienkou duchovného a telesného rozvoja.<br>" +
                            "<font color='#B71C1C'>5.</font> Na orodovanie svätej Kláry zachovaj nás v posväcujúcej milosti.",
                    "Bože, ty nám v osobe svätej Kláry ukazuješ,<br>" +
                            "že najväčším šťastím človeka je zjednotenie s tebou;<br>" +
                            "prijmi naše prosby<br>" +
                            "a daj, aby sme dosiahli radosť zo spoločenstva s tebou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14", "Bratia a sestry, svätý Maximilián Mária Kolbe prežil život plný hlbokej viery, oddanosti Kristovi a lásky k Panne Márii. Spoločne sa modlime, aby sme verne nasledovali nášho Pána a Spasiteľa.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, posilňuj Cirkev obetami svätých mučeníkov, aby účinne oživovala vieru a podporovala obetavosť veriacich v dnešnom svete.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, povzbuď svetských predstaviteľov, aby chránili pred prenasledovaním tých, ktorí veria v teba.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, zastaň sa tých, čo trpia na tele alebo na duši, aby na príhovor tvojej matky našli útechu v Božom slove.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, požehnávaj prácu kresťanských vydavateľstiev, aby šírili vo svete slovo, ktoré upevňuje ľudí v pravých duchovných hodnotách.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, vlej do našich sŕdc ducha obety, aby sme vedeli pomáhať svojim blížnym, ktorí sú slabí, chorí alebo chudobní.",
                    "Ježišu Kriste,<br>" +
                            "ochranca utláčaných a potešiteľ trpiacich,<br>" +
                            "na príhovor svätého Maximiliána Máriu Kolbeho<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a daj sa nám spoznať<br>" +
                            "v plnosti svojho utrpenia<br>" +
                            "i večného víťazstva na kríži.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"14gkm", "Bratia a sestry, zhromaždení v predvečer slávnosti Nanebovzatia Panny Márie, prosme Pána o pomoc zhora.",
                    "<font color='#B71C1C'>(</font>Volajme: Nech sa za nás prihovára tvoja Matka, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za Cirkev, ktorá je znakom prítomnosti Boha medzi ľuďmi, aby všetky jej deti našli v Márii vzor dokonalého života.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za všetkých pútnikov v mariánskych svätyniach, nech Kráľovná anjelov prijme ich modlitbu, posilní ich vo viere a u Syna vyprosí potrebné milosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za všetkých, ktorí nám svojou prácou zabezpečujú potrebný chlieb, aby nezabúdali ani na duchovný pokrm.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za nás, putujúcich do nebeskej vlasti, nech nás nanebovzatá Panna Mária posilňuje na ceste k svätosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za tých, ktorí nás predišli do večnosti, aby mali účasť na Kristovom víťazstve a boli vzkriesení pre nesmrteľnosť.",
                    "Pane Ježišu,<br>" +
                            "ty nám nanebovzatím Panny Márie<br>" +
                            "ukazuješ cieľ nášho života;<br>" +
                            "prijmi naše modlitby<br>" +
                            "a príď nám všetkým na pomoc,<br>" +
                            "aby sme dosiahli účasť na sláve blažených.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"15gkm", "Bratia a sestry, dnes sa celá Cirkev raduje zo vznešenej oslavy Božej Matky. Aj my s radosťou vyznávame, že Bohorodička Panna Mária bola vzatá do neba.",
                    "<font color='#B71C1C'>(</font>Volajme: Pozri na Matku svojho Syna a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Nebeský Otče, prosíme ťa za putujúcu Cirkev, aby s vierou očakávala stretnutie s oslávenou Bohorodičkou.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za všetkých ľudí, aby v Márii spoznali svoju duchovnú Matku a Kráľovnú.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za všetkých kresťanov, aby sa pomocou úcty k Bohorodičke zjednotili v Kristovej Cirkvi.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za všetkých, čo sa starajú o zdravie človeka, aby s úctou ošetrovali telá, ktoré sú určené na vzkriesenie a oslávenie.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa aj za seba samých, aby sme často prijímali chlieb z neba, posvätný záloh nášho vzkriesenia.",
                    "Bože, vyslyš naše prosby,<br>" +
                            "ktoré ti dnes predkladáme s ešte väčšou dôverou,<br>" +
                            "lebo sa radujeme,<br>" +
                            "že si pri nanebovzatí Panny Márie<br>" +
                            "povýšil aj našu ľudskú prirodzenosť do nebeskej slávy.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"16", "Bratia a sestry, svätého Štefana Uhorského si uctievame ako múdreho a nábožného panovníka, ktorý viedol svoj ľud k pravej viere a kultúrnym hodnotám. V deň jeho spomienky prednesme Bohu svoje prosby:",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, veď Cirkev k plodnému dialógu s predstaviteľmi spoločenského života, aby im dokázala ponúknuť ideály kresťanského života.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilňuj všetkých, ktorí stoja v čele národov, aby viedli svoj ľud k pravému rozvoju a všemožne chránili mier na celom svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Priveď národy Európy k vzájomnej spolupráci a pochopeniu toho, že ich blahobyt, kultúra a veda stoja na kresťanských koreňoch.<br>" +
                            "<font color='#B71C1C'>4.</font> Požehnávaj tých, čo svoj život zasvätili službe chudobným, chorým a najslabším.<br>" +
                            "<font color='#B71C1C'>5.</font> Daruj každému, kto sa usiluje o kresťanskú výchovu svojich detí, múdrosť Ducha Svätého a silu pre svedectvo života.<br>" +
                            "<font color='#B71C1C'>6.</font> Odmeň večnou blaženosťou našich predkov, ktorí nám odovzdali poklad kresťanskej viery.",
                    "Všemohúci Bože,<br>" +
                            "vypočuj našu spoločnú modlitbu<br>" +
                            "a na príhovor svätého Štefana, kráľa,<br>" +
                            "nám daruj horlivých a obetavých predstaviteľov národa.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"18", "Bratia a sestry, kresťanská tradícia spája svätú Helenu s nájdením a úctou kríža Pána Ježiša. Aj my ho máme vo veľkej úcte ako znak našej spásy. Vďační za dar vykúpenia, vrúcne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev: aby vždy bránila svojich synov a dcéry, ktorí sú prenasledovaní pre svoju vieru, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za kresťanských politikov: aby bránili symboly viery, ktoré nám aj na verejných miestach pripomínajú korene našej kultúry, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých, ktorí sa starajú o kalvárie a kríže v našej krajine: aby v nich videli nielen historické dedičstvo, ale aj verejné vyznanie viery a miesta modlitby, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za všetkých chorých: aby nezabúdali, že kríž je nielen symbolom utrpenia, ale aj požehnania, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás samých: aby nás pohľad na kríž posilňoval vo viere a povzbudzoval k väčšej láske k Bohu, prosme Pána.",
                    "Bože Otče,<br>" +
                            "krížom svojho Syna<br>" +
                            "si zjavil svoju nekonečnú lásku k nám;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a urob nás vnímavými na všetky znamenia,<br>" +
                            "ktorými nás uisťuješ o tom, že si nás stvoril pre večnosť.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "Bratia a sestry, medzi predstavenými rehoľného spoločenstva v dejinách Cirkvi vyniká svätý opát Bernard. Povzbudení jeho príkladom lásky k Bohu vyjadrime svoju nádej v týchto spoločných prosbách.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Cirkev, aby sa stále viac mladých rozhodlo nasledovať Krista v rehoľnom povolaní a zasvätiť sa mu v chudobe, čistote a poslušnosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za nášho pápeža <font color='#B71C1C'>M.</font>, aby sa jeho náuka stretla vždy s prijatím a poslušnosťou veriacich.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za celé ľudstvo, aby reformy zákonov a spoločenského poriadku prinášali väčšiu jednotu a vzájomné pochopenie.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za členov nášho <font color='#B71C1C'>(</font>farského<font color='#B71C1C'>)</font> spoločenstva, aby sme sa zaujímali o život vo farnosti a vzájomne sa posilňovali v duchovnom živote.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby dosiahli plnosť poznania a večnú radosť.",
                    "Bože, náš ochranca,<br>" +
                            "svätý Bernard sa s odhodlaním postavil na obranu viery<br>" +
                            "a hájil pápežskú autoritu;<br>" +
                            "na jeho príhovor vypočuj naše prosby<br>" +
                            "a daj, aby sme si Krista vyvolili<br>" +
                            "za svojho najmúdrejšieho radcu a pomocníka.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"21", "Bratia a sestry, slávime spomienku svätca, ktorý začínal ako chudobný dedinský farár a nakoniec sa stal viditeľnou hlavou Cirkvi. Svojím životom ukazuje, čo dokáže Božia milosť v tichom a pokornom srdci. Prosme, aby Boh neustále pôsobil v Cirkvi a vo svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, pošli svojej Cirkvi svätých biskupov a kňazov, aby cez nich tvoj Duch všetko obnovil v Kristovi.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby z národov vymizla nenávisť a všetka zlá vôľa.<br>" +
                            "<font color='#B71C1C'>3.</font> Zmiluj sa nad hladujúcimi zástupmi a daruj im hmotný i duchovný pokrm.<br>" +
                            "<font color='#B71C1C'>4.</font> Privádzaj svoj ľud k častej účasti na svätej omši a posilňuj ho nebeským chlebom.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj, aby naši rodičia boli svojim deťom prvými svedkami viery a včas ich privádzali k prvému svätému prijímaniu.",
                    "Dobrotivý Bože,<br>" +
                            "ty si nám dal svätého pápeža Pia Desiateho,<br>" +
                            "ktorý jasne poukázal na Eucharistiu, prameň šťastia a sily;<br>" +
                            "prosíme ťa, podporuj nás v úsilí<br>" +
                            "všetko obnoviť v Kristovi,<br>" +
                            "aby tvár tvojej Cirkvi žiarila stále jasnejším svetlom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22m", "Bratia a sestry, Panna Mária je najbližšie Kristovi, Kráľovi neba i zeme. Svojou dôstojnosťou a svätosťou prevyšuje všetkých ľudí. Preto ju právom nazývame Kráľovnou. Zvlášť dnes sa s ňou spojme v modlitbe, aby jej Syn dal svetu, čo je potrebné na jeho záchranu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Na príhovor Kráľovnej anjelov daj, nech je tvoja Cirkev aj v jednotlivých veriacich čistá a svätá.<br>" +
                            "<font color='#B71C1C'>2.</font> Na príhovor Kráľovnej pokoja daj, nech sa ľudské pokolenie zjednotí v bratskej láske.<br>" +
                            "<font color='#B71C1C'>3.</font> Na príhovor Kráľovnej apoštolov daj, nech majú vlády vo svojich programoch na zreteli blaho celého ľudstva.<br>" +
                            "<font color='#B71C1C'>4.</font> Na príhovor Kráľovnej mučeníkov daj, nech nespravodlivo prenasledovaní zostanú verní svojmu svedomiu a presvedčeniu.<br>" +
                            "<font color='#B71C1C'>5.</font> Na príhovor Kráľovnej vyznávačov daj, nech sa vlažní kresťania prebudia k horlivosti vydávať svedectvo o tebe.",
                    "Pane, tvoja Matka je nebeskou Kráľovnou;<br>" +
                            "spoliehame sa na jej pomoc,<br>" +
                            "keď teba, nášho Pána,<br>" +
                            "prosíme o časné i večné dobrá.<br>" +
                            "Vypočuj naše dnešné prosby,<br>" +
                            "lebo ty žiješ a kraľuješ na veky vekov."},
            {"24g", "Bratia a sestry, svätý apoštol Bartolomej bol svedkom mnohých významných udalostí v živote Ježiša Krista. Prosme Pána, aby nám na príhovor tohto apoštola pomáhal stať sa svedkami pravej kresťanskej viery.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby všetci ľudia krstom prijatí do rodiny svätej Cirkvi túžili po svetle života, ktoré nám dávaš.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, veď mysle i srdcia predstavených štátov, aby boli neochvejní v konaní dobra a obhajobe spravodlivosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, zastaň sa tých, ktorí sú prenasledovaní pre svoju vieru, aby vytrvali a neodlúčili sa od teba.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, stoj pri nás v hodine smrti, aby sme uvideli jas a radosť tvojho kráľovstva.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, v láske svojho srdca priveď našich zomrelých <font color='#B71C1C'>(M.)</font> do neba, aby sa stretli s tebou.",
                    "Milostivý a láskavý Ježišu,<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj naše modlitby,<br>" +
                            "buď naším učiteľom<br>" +
                            "a pomáhaj nám už tu na zemi sprítomňovať<br>" +
                            "tvoje nebeské kráľovstvo.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"25b", "Bratia a sestry, svätý Jozef Kalazanský patrí medzi najvýznamnejších vychovávateľov, ktorí prácou medzi najmladšou generáciou významne prispeli k vnútornej obnove Cirkvi a spoločnosti. Prosme o potrebné milosti pre vychovávateľov a učiteľov našich čias.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa, aby svätá Cirkev vždy bránila najmenších a pripomínala, že čo sme urobili im, urobili sme Kristovi.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa, aby zákonodarcovia zrovnoprávnili cirkevné školstvo so štátnym a rovnako podporovali všetky výchovné inštitúcie.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa, aby učitelia a vychovávatelia plnili svoje poslanie s veľkou múdrosťou, láskou a trpezlivosťou.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa, aby žiaci a študenti cirkevných škôl v duchu kresťanských zásad vyrastali na horlivých kresťanov a dobrých občanov.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa, aby zomrelí učitelia a vychovávatelia dosiahli večnú odmenu za svoju namáhavú pedagogickú prácu.",
                    "Bože Otče,<br>" +
                            "prijmi naše prosby<br>" +
                            "a daj nám takú lásku a trpezlivosť,<br>" +
                            "akou si obdaroval svätého Jozefa Kalazanského.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"27", "Bratia a sestry, svätá Monika sa slzami a neustálou modlitbou pričinila o obrátenie svojho syna Augustína. V tejto našej spoločnej modlitbe prosme Pána, aby dal svetu dobré a sväté matky.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, vychovávaj v Cirkvi matky svätého zmýšľania i srdca.<br>" +
                            "<font color='#B71C1C'>2.</font> Pre úzkosť matiek nad životmi svojich synov ochráň svet od vojny a krviprelievania.<br>" +
                            "<font color='#B71C1C'>3.</font> Vzbuď vo všetkých ľuďoch úctu k dôstojnosti materstva.<br>" +
                            "<font color='#B71C1C'>4.</font> Odvráť matky od hriešnych myšlienok neprijať nenarodené dieťa.<br>" +
                            "<font color='#B71C1C'>5.</font> Obráť hriešnikov pre slzy a modlitby ich matiek.<br>" +
                            "<font color='#B71C1C'>6.</font> Odmeň starostlivosť našich zomrelých matiek účasťou na tvojej sláve vo večnosti.",
                    "Bože Otče,<br>" +
                            "ty vkladáš do sŕdc žien nábožnosť,<br>" +
                            "aby mohli viesť ľudské pokolenie k tebe;<br>" +
                            "prosíme ťa,<br>" +
                            "zachráň ženy pred úpadkom,<br>" +
                            "vzbuď v nich povedomie veľkej zodpovednosti<br>" +
                            "za výchovu detí<br>" +
                            "a za ozdravenie mravného života v ľudskej spoločnosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"28", "Bratia a sestry, modlime sa k Bohu, ktorý osvecuje náš rozum svetlom svojej pravdy a jediný vie uspokojiť naše srdce.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj našim biskupom a kňazom ducha múdrosti a svätosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Daruj národom svedomitých a pokojamilovných predstaviteľov.<br>" +
                            "<font color='#B71C1C'>3.</font> Podaj pomocnú ruku všetkým, ktorí žijú v neistote a v hriechu.<br>" +
                            "<font color='#B71C1C'>4.</font> Ukáž svetlo svojej pravdy tým, ktorí ťa hľadajú s úprimným srdcom.<br>" +
                            "<font color='#B71C1C'>5.</font> Sprevádzaj nás svojou milosťou, aby sme nikdy neupadli do ťažkého hriechu.",
                    "Bože, tvoje milosrdenstvo je nesmierne<br>" +
                            "a tvoja dobrota nekonečná;<br>" +
                            "na príhovor svätého Augustína<br>" +
                            "chráň nás od poblúdenia rozumu<br>" +
                            "i od zlých náklonností srdca,<br>" +
                            "aby sme len v tebe hľadali pokoj a šťastie.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"29", "Bratia a sestry, svätý Ján Krstiteľ je svetlom, ktoré horí a svieti. Svojou krvou vydal svedectvo pravde. V tejto spoločnej modlitbe prosme Pána, aby bolo čím viac charakterných ľudí.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, žehnaj a podporuj biskupov a kňazov, ktorí neohrozene zastávajú posvätnosť a nerozlučiteľnosť manželského zväzku.<br>" +
                            "<font color='#B71C1C'>2.</font> Chráň všetkých ľudí pred násilím a veď ich cestou spravodlivosti a pravdy.<br>" +
                            "<font color='#B71C1C'>3.</font> Posilňuj teológov a katolíckych publicistov, aby nekompromisne hovorili ľuďom pravdu a všetkým pomáhali nachádzať cestu spásy.<br>" +
                            "<font color='#B71C1C'>4.</font> Naplň strachom pred večným trestom tých, ktorí sa prehrešujú manželskou neverou.<br>" +
                            "<font color='#B71C1C'>5.</font> Vlej do nás odvahu vyznávať a skutkami dosvedčovať svoju vieru i znášať ťažkosti pre tvoje meno.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a daj, aby sme na orodovanie svätého Jána Krstiteľa<br>" +
                            "vážne brali svoje náboženské presvedčenie<br>" +
                            "a vytrvali v pravej viere až do konca.<br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] prosby9 = {
            {"03", "Bratia a sestry, pápeži sú nástupcami apoštola Petra, ktorému Pán zveril najvyšší úrad v Cirkvi. Dnes si spomíname na svätého pápeža Gregora Veľkého. Preto sa modlime za Kristovho námestníka i za spásu celého sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, na príhovor svätého Gregora udeľ nášmu pápežovi <font color='#B71C1C'>M.</font> a celému kolégiu biskupov odvahu a vytrvalosť pri hlásaní právd evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, nech sa v európskych národoch, ktoré kedysi svätý Gregor priviedol do Cirkvi, zachová úcta ku kresťanským koreňom.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, nech sú publicisti a náboženskí spisovatelia verní pravde a nech v spoločenskom živote napomáhajú vzrast dobra.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj, nech trpiacim a znechuteným nechýba pomoc blížnych, aby opäť nadobudli chuť do života a práce.<br>" +
                            "<font color='#B71C1C'>5.</font> Otvor našim zomrelým <font color='#B71C1C'>(M.)</font> nebo, aby ťa s chórmi anjelov chválili na nebeskej liturgii.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a na orodovanie svätého pápeža Gregora Veľkého<br>" +
                            "upevňuj nás vo vernosti a oddanosti rímskemu biskupovi<br>" +
                            "a urob z nás verných synov a dcéry tvojej Cirkvi.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"07", "Bratia a sestry, nábožne sa modlime, aby krv svätých košických mučeníkov bola semenom živej viery našich kresťanov.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za svätú Cirkev, aby sa vždy mohla tešiť z ľudí živej viery.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za všetky národy, aby sa oslobodili od nenávisti a vzájomného prenasledovania.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za našu vlasť, aby sme mohli žiť vo svornosti a jednote.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za katolícke rodiny na Slovensku, aby v nich vyrastala generácia kultúrnych a veriacich ľudí.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás samých, aby sme z Kristovej obety čerpali silu na neustálu nápravu života.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a na orodovanie svätých košických mučeníkov<br>" +
                            "udeľ nám živú a vytrvalú vieru,<br>" +
                            "aby sme spolu s nimi získali večnú slávu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"08gm", "Bratia a sestry, narodenie Panny Márie prinieslo radosť celému svetu. Preto v tejto spoločnej modlitbe s radosťou a dôverou volajme k nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Pozri na Matku svojho Syna a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Nebeský Otče, pomáhaj všetkým veriacim, aby podľa príkladu Panny Márie ustavične žili v posväcujúcej milosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, daj spravodlivý pokoj národom na celom svete a na príhovor Kráľovnej pokoja im udeľ bezpečnú budúcnosť.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, daj potrebnú milosť všetkým pútnikom, ktorí prichádzajú do mariánskych svätýň, a vypočuj prosby, ktoré ti tam prednášajú.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, daj, aby rodičia prijímali deti s láskou ako Boží dar a nábožne ich vychovávali.<br>" +
                            "<font color='#B71C1C'>5.</font> Nebeský Otče, na orodovanie Panny Márie upevňuj nás vo viere a v láske k tebe, aby sme zostali tvojimi vernými synmi a dcérami.",
                    "Všemohúci Bože,<br>" +
                            "pre úprimnú lásku,<br>" +
                            "akou milujeme matku tvojho Syna,<br>" +
                            "prijmi naše modlitby<br>" +
                            "a na jej príhovor nám daruj všetko,<br>" +
                            "čo potrebujeme pre spásu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"12m", "Bratia a sestry, dnes pri spomienke na preblahoslavenú Pannu Máriu vrúcne uctievame jej meno. Zjednoťme svoje srdcia i mysle v nábožnej radosti a vrúcne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daj, aby kňazi a rehoľníci boli veriacim príkladom úcty k Panne Márii.<br>" +
                            "<font color='#B71C1C'>2.</font> Na príhovor preblahoslavenej Panny Márie ochraňuj pútnikov na pútnických miestach po celom svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Zjednoť rozdelených kresťanov Východu i Západu, ktorí rovnako vzývajú sväté meno Mária, pri spoločnom slávení Eucharistie.<br>" +
                            "<font color='#B71C1C'>4.</font> Sprevádzaj nás pri plnení náboženských povinností a buď nám oporou v úsilí o čistotu života podľa príkladu Panny Márie, svätyne Ducha Svätého.<br>" +
                            "<font color='#B71C1C'>5.</font> Požehnávaj všetkých synov a dcéry Cirkvi, ktorí vzývajú slávne meno Mária.<br>" +
                            "<font color='#B71C1C'>6.</font> Prijmi našich zomrelých <font color='#B71C1C'>(M.)</font> do spoločenstva večnej lásky a blaženosti.",
                    "Pane Ježišu, tvoja matka sa v nebi prihovára za nás;<br>" +
                            "prosíme ťa,<br>" +
                            "na jej orodovanie vypočuj naše prosby<br>" +
                            "a obdaruj nás všetkými dobrami,<br>" +
                            "ktoré potrebujeme na ceste do domu Otca.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"13", "Bratia a sestry, sme vďační Pánovi, že posiela svojej Cirkvi horlivých hlásateľov Božieho slova. V tejto spoločnej modlitbe prosme, aby svet vždy lepšie poznával bohatstvá Kristovej náuky.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, daruj svojej Cirkvi múdrych a svätých biskupov a kňazov.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomáhaj predstaveným kráčať cestou pravdy a spravodlivosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Pomôž všetkým vyhnancom a emigrantom nájsť nový domov a láskavé prijatie milosrdných ľudí.<br>" +
                            "<font color='#B71C1C'>4.</font> Priveď učiteľov a umelcov k prameňu pravej múdrosti a večnej krásy.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj žiakom katolíckych škôl dobrých katechétov, ktorí ich privedú k hlbšiemu pochopeniu tvojho slova.<br>" +
                            "<font color='#B71C1C'>6.</font> Zjednocuj nás všetkých, ktorí prijímame z toho istého eucharistického chleba, aby sme budovali bratské spoločenstvo, v ktorom má každý svoje miesto.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a na orodovanie svätého Jána Zlatoústeho<br>" +
                            "udeľ našim kazateľom<br>" +
                            "vernosť v hlásaní tvojho slova,<br>" +
                            "pokoru v zmýšľaní a lásku k dušiam.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14gn", "Bratia a sestry, vrúcne sa modlime za všetkých ľudí, aby našli spásu v kríži nášho Pána Ježiša Krista.",
                    "<font color='#B71C1C'>(</font>Volajme: Kriste, Kráľ na kríži, zmiluj sa nad nami.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, veď svoju svätú Cirkev, aby pod znakom tvojho kríža priniesla ľuďom spásu.<br>" +
                            "<font color='#B71C1C'>2.</font> Spasiteľ sveta, vyzdvihnutý od zeme na kríž, pritiahni k sebe všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>3.</font> Víťazný Kráľ, daj nám úctu k tvojmu krížu, aby svätý znak našej viery bol všade tam, kde žije, učí sa a pracuje kresťanské spoločenstvo.<br>" +
                            "<font color='#B71C1C'>4.</font> Kriste, nádej trpiacich, uzdrav a poteš všetkých, ktorí v chorobe a v duševnej tiesni s dôverou hľadia na tvoj kríž.<br>" +
                            "<font color='#B71C1C'>5.</font> Náš Vykupiteľ, posilni nás, poznačených pri krste znamením kríža, v boji proti pokušeniam.",
                    "Pane Ježišu, Kráľ na kríži,<br>" +
                            "ty si nás vykúpil svojou smrťou a zmŕtvychvstaním;<br>" +
                            "vypočuj naše prosby,<br>" +
                            "zachráň nás pred večnou smrťou<br>" +
                            "a daj nám svoju spásu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"15gkm", "Bratia a sestry, v tejto spoločnej modlitbe s veľkou dôverou prosme Pána, aby na orodovanie Sedembolestnej Panny Márie, našej nebeskej patrónky, vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pozri na bolestnú Matku Máriu a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, pre pokoru tvojej služobnice a Matky Cirkvi Márie upevňuj v nás lásku, poslušnosť a úctu k nášmu pápežovi <font color='#B71C1C'>M.</font> a všetkým našim biskupom.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, na orodovanie bolestnej Panny Márie, našej nebeskej Matky a patrónky, udeľ nášmu ľudu pokoj a daruj mu spásu.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, pre bolesti Ježišovej matky, stojacej pod krížom, pozdvihni myseľ trpiacich a posilni ich srdcia nádejou.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, pod ochranou Sedembolestnej zachovaj v slovenskom národe dedičstvo otcov Cyrila a Metoda.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, na príhovor bolestnej Matky zachovaj našu farnosť <font color='#B71C1C'>(</font>naše spoločenstvo<font color='#B71C1C'>)</font> vo viere a láske.",
                    "Bože Otče,<br>" +
                            "ty si viedol náš ľud k osobitnej úcte voči bolestnej Panne;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme vytrvali na ceste života,<br>" +
                            "ktorá vedie cez kríž do slávy.<br>" +
                            "O to ťa prosíme skrze Krista, nášho Pána."},
            {"16", "Bratia a sestry, svätá Cirkev často musela čeliť mnohým prekážkam. Na príklade života svätých pápeža Kornélia a biskupa Cypriána vidíme, že všetky nástrahy a ťažkosti sa vo viere v Krista dajú prekonať. Prosme Pána o víťazstvo dobra aj pre nás samých.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, daruj svojej Cirkvi otvorenú náruč pre tých, ktorí robia pokánie a chcú sa vrátiť do jej spoločenstva.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomáhaj správcom národov dbať na mravnú čistotu a pomoc chudobným.<br>" +
                            "<font color='#B71C1C'>3.</font> Vlievaj nádej a ducha obety do sŕdc všetkým, ktorí poskytujú hmotnú a duchovnú pomoc sužovaným a biednym.<br>" +
                            "<font color='#B71C1C'>4.</font> Nauč nás vážiť si svojich duchovných pastierov a modliť sa za naplnenie ich duchovného poslania.<br>" +
                            "<font color='#B71C1C'>5.</font> Pripočítaj našich zomrelých <font color='#B71C1C'>(M.)</font> k zástupu nebeského spoločenstva nehynúcej lásky a svetla.",
                    "Pane Ježišu,<br>" +
                            "tvoje víťazstvo nad hriechom a smrťou<br>" +
                            "je dokonalé a večné;<br>" +
                            "prosíme ťa, vypočuj naše prosby a pomáhaj nám,<br>" +
                            "aby sme prekonávali ťažkosti života,<br>" +
                            "a tak si raz zaslúžili naveky prebývať s tebou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"17a", "Bratia a sestry, svätý biskup Róbert Bellarmín vynikal múdrosťou života a zaslúžil sa o duchovnú obnovu Cirkvi. Prosme všemohúceho Otca, aby na jeho príhovor vypočul naše modlitby.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože Otče, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, zachovaj svoju Cirkev v pravom učení a ochraňuj ju pred útokmi bludných náuk.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, obráť srdcia svetských predstaviteľov, ktorí útočia na Cirkev a znevažujú jej hodnoty.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, udeľ ducha štedrosti ľuďom s nadmerným bohatstvom, aby ochotne pomáhali chudobným.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, naplň svojím Duchom všetkých žiakov a študentov, aby sa nadchli pre štúdium katechizmu a náuky Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, posilňuj nás v našom duchovnom živote a prebuď v nás záujem o čítanie Svätého písma.",
                    "Pane a Bože náš,<br>" +
                            "ponúkaš nám nesmierne bohatstvo svojich milostí;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme povzbudení náukou<br>" +
                            "svätého Róberta Bellarmína<br>" +
                            "nezabúdali na pravé duchovné dary<br>" +
                            "a úprimne prežívali svoju vieru.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "Bratia a sestry, Cirkev v dejinách pretrpela mnohé súženia a veľa kresťanov bolo prenasledovaných pre svoju vieru. Majme odvahu prekonávať prekážky života a povzbudení príkladom svedectva svätých kórejských mučeníkov sa s nadšením modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby veriaci s odvahou prekonávali súženia a budovali jednotu duchovného chrámu, ktorým je Cirkev, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby sa evanjelium úspešne šírilo na všetkých kontinentoch sveta, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby ľudia s nenávisťou v srdci zmenili svoje zmýšľanie a prijali Božie prikázanie lásky, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme sa vo svojom živote a trápení pripodobňovali trpiacemu Kristovi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zomrelí <font color='#B71C1C'>(M.)</font> prebývali vo večnom šťastí, prosme Pána.",
                    "Ježišu Kriste,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a sprevádzaj nás na našej pozemskej púti,<br>" +
                            "aby sme bezpečne prišli do vlasti v nebeskom domove.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"21g", "Bratia a sestry, svätý Matúš, bývalý mýtnik, nasledoval Krista a stal sa jeho učeníkom. Ako apoštol ohlasoval Kristovu radostnú zvesť slovom i písmom. Prosme Pána, aby sa Božie slovo šírilo po celom svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, pomocou evanjelia priveď kresťanský ľud k hlbšiemu poznaniu Ježiša Krista.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby sa radostná zvesť tvojho Syna ohlasovala všetkým národom.<br>" +
                            "<font color='#B71C1C'>3.</font> Priveď všetkých, ktorí čítajú Matúšovo evanjelium, k svojmu Synovi a k jeho svätej Cirkvi.<br>" +
                            "<font color='#B71C1C'>4.</font> Sprevádzaj mladých ľudí, aby boli pri voľbe životného povolania slobodní a riadili sa tvojou vôľou.<br>" +
                            "<font color='#B71C1C'>5.</font> Daruj židovskému národu, ktorému si svoje slovo adresoval cez apoštola Matúša, poznanie, že Ježiš Kristus je Mesiáš a Vykupiteľ.<br>" +
                            "<font color='#B71C1C'>6.</font> Pomôž nám chápať, že k nám hovorí sám Kristus, keď sa v Cirkvi číta Sväté písmo.",
                    "Milosrdný Bože,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj nám živú lásku a úctu k tvojmu slovu,<br>" +
                            "aby nám bolo ustavičným pokrmom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22+", "Bratia a sestry, svätý Emerám vrúcne miloval Krista, vynikal zbožnosťou a neúnavnou misijnou prácou. V deň jeho spomienky prednesme Bohu svoje prosby a vrúcne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby Cirkev mohla v pokoji ohlasovať radostné posolstvo evanjelia, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby predstavitelia národov Európy chránili a zveľaďovali bohatstvo kresťanského dedičstva, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby misionári svedčili o Božej láske a odpustení aj vtedy, keď sú vystavení útokom a násiliu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby všetci, ktorí sa s dôverou utiekajú k svätému Emerámovi, na jeho príhovor dosiahli Božie požehnanie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme horlivým kresťanským životom napĺňali odkaz našich svätcov a patrónov, prosme Pána.",
                    "Bože Otče, vyslyš naše pokorné prosby<br>" +
                            "a daj, aby sme na orodovanie svätého Emeráma,<br>" +
                            "biskupa a mučeníka,<br>" +
                            "mali dostatok síl vyznávať vieru v teba<br>" +
                            "a ohlasovať tvoju blahozvesť všetkým ľuďom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "Bratia a sestry, v jednoduchosti a v skromnosti vyniká krása života svätého Pia z Pietrelciny. Usilujme sa napodobňovať jeho zanietenie pre modlitbu a prednesme Bohu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, prosíme ťa za Cirkev, aby mala dostatok nábožných kňazov, ktorí budú vždy ochotne vysluhovať sviatosť zmierenia.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za celý svet, aby si národy navzájom pomáhali a zmierňovali veľké rozdiely medzi chudobnými a bohatými.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za tých, ktorí trpia telesnými alebo duševnými chorobami, aby nebeský lekár, Kristus, liečil ich rany.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za staviteľov nemocníc a ústavov pre chorých, aby pamätali na to, že ľudské zdravie je darom z nebies.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosíme ťa za seba samých, aby sme nachádzali stále väčšiu radosť v modlitbe v kresťanskom spoločenstve.",
                    "Pane Bože, svätý Páter Pio prežíval mnohé telesné bolesti<br>" +
                            "a mal účasť na Kristovom utrpení;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a na jeho príhovor nám pomôž<br>" +
                            "cez utrpenie a modlitbu prísť k tebe<br>" +
                            "a stretnúť sa s tvojím Synom,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"26", "Bratia a sestry, svätí bratia Kozma a Damián dokázali obdivuhodne spojiť vykonávanie svojho povolania so svätosťou života. Prosme dnes Pána, aby sme aj my horlivo plnili svoje povinnosti a vzrastali vo svätosti života.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, uzdrav naše srdcia.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, prosíme ťa za Cirkev, aby svojím pôsobením a ohlasovaním evanjelia uzdravovala svet od každého zla a neprávosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, prosíme ťa za svetských predstaviteľov, aby vždy podporovali ochranu ľudského zdravia a primeranú lekársku starostlivosť pre všetkých.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, prosíme ťa za lekárov, aby poctivo vykonávali svoje povolanie a ochotne pomáhali mierniť utrpenie a bolesť ľudí.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, prosíme ťa za všetkých chorých, aby nachádzali posilu pre svoj kríž vo sviatostiach a v Božom slove.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, prosíme ťa aj za nás samých, aby sme si vážili dar zdravia a vedeli ďakovať za všetky dobré dary.",
                    "Pane Ježišu, nebeský lekár,<br>" +
                            "vypočuj naše dnešné prosby<br>" +
                            "a pomáhaj nám,<br>" +
                            "aby sme horlivo konali svoje povinnosti,<br>" +
                            "a pritom neustále vzrastali vo viere<br>" +
                            "a svätosti života.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"27", "Bratia a sestry, svätý Vincent tak verne nasledoval Krista, že svätopisci ho nazývajú \"velikánom kresťanskej lásky\". Ovocie jeho života ľudstvo zbiera dodnes. Vyprosujme Cirkvi a svetu takéto osobnosti a spoločne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, daj, nech je tvoja Cirkev matkou chudobných, opustených a sirôt.<br>" +
                            "<font color='#B71C1C'>2.</font> Požehnaj úsilie tých, ktorí vo svete zmierňujú hlad a biedu.<br>" +
                            "<font color='#B71C1C'>3.</font> Pomáhaj chorým a opusteným, aby svoje utrpenie vedeli spojiť s Kristovým utrpením.<br>" +
                            "<font color='#B71C1C'>4.</font> Podporuj všetkých, ktorí sa podľa vzoru svätého Vincenta ujímajú opustených a sirôt vo svojich charitatívnych dielach.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj, aby sa v našom <font color='#B71C1C'>(</font>farskom<font color='#B71C1C'>)</font> spoločenstve nik necítil opustený a bez bratskej pomoci.",
                    "Milosrdný Bože,<br>" +
                            "ty si svätého Vincenta<br>" +
                            "urobil apoštolom lásky k trpiacim;<br>" +
                            "pomôž aj nám vzmáhať sa v tejto láske,<br>" +
                            "aby sme ochotne slúžili našim bratom a sestrám.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"29g", "Bratia a sestry, sme šťastní, že pri svätej omši môžeme spolu s anjelmi aj archanjelmi zvelebovať Pána. Preto v tejto spoločnej modlitbe prosme Pána, aby sme s pomocou ochrany anjelov verne slúžili Pánu Bohu.",
                    "<font color='#B71C1C'>(</font>Volajme: Na príhovor anjelov vyslyš nás, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, nech tvoj archanjel Michal pomáha putujúcej Cirkvi a nech ju bráni proti úkladom zlých duchov.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, nech sa na príhovor archanjela Gabriela zvestuje radostné posolstvo celému svetu.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, pod ochranou archanjela Rafaela sprevádzaj všetkých, ktorí sú na cestách a mimo domova.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, na príhovor svätých archanjelov ochraňuj všetkých, ktorí zápasia s hriechom a pokušením zlého ducha.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, posilňuj nás, aby sme si na príhovor svätých archanjelov chránili vieru, upevňovali ju a odovzdávali druhým.",
                    "Všemohúci Bože,<br>" +
                            "ty nám posielaš na pomoc anjelov;<br>" +
                            "daj, aby sme pod ich ochranou víťazili nad hriechom<br>" +
                            "a spolu s nimi ťa oslavovali tu i vo večnosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"30", "Bratia a sestry, svätý Hieronym povedal, že kto nepozná Sväté písmo, nepozná Krista. V tejto spoločnej modlitbe prosme Pána, aby sme všetci pokladali Sväté písmo za najvzácnejšiu knihu na svete.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, vzbuď vo všetkých kresťanoch živý záujem o tvoje slovo.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, sprevádzaj svetlom Ducha Svätého tých, ktorí vykladajú texty Svätého písma, aby ich podľa náuky Cirkvi správne vysvetľovali.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, daj, aby všetci ľudia pocítili, aké živé a účinné je Božie slovo.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, vnukni všetkým zúfalým a blúdiacim, aby vzali do rúk Sväté písmo a v ňom hľadali silu a svetlo.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, daj, aby nám Božie slovo bolo posilou vo viere, pokrmom pre dušu a čistým prameňom duchovného života.",
                    "Pane Ježišu, ty si prítomný vo svojom slove,<br>" +
                            "a keď sa v Cirkvi číta Sväté písmo,<br>" +
                            "ty sám hovoríš a ohlasuješ svoju blahozvesť;<br>" +
                            "na príhovor svätého Hieronyma<br>" +
                            "daj nám lásku k svojmu slovu,<br>" +
                            "aby nám slúžilo na spásu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
    };

    String[][] prosby10 = {
            {"01", "Bratia a sestry, pri spomienke na svätú pannu Teréziu, patrónku katolíckych misií, prosme Pána, aby sme na jej orodovanie získali milosti, ktoré ona pripodobňovala dažďu ruží padajúcich z neba.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, na príhovor svätej panny Terézie zjednoť všetkých kresťanov vo svojej Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Udeľ všetkým predstaveným obetavosť a lásku k tým, ktorí sú zverení ich starostlivosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Na orodovanie svätej Terézie pomáhaj všetkým misionárom pri šírení evanjelia.<br>" +
                            "<font color='#B71C1C'>4.</font> Nech sa veriaci ujímajú sirôt a opustených detí, aby pocítili teplo kresťanských rodín.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj, aby sme ti na oltári svojho srdca prinášali obety nábožnosti a dobrých skutkov.<br>" +
                            "<font color='#B71C1C'>6.</font> Zbav umierajúcich strachu zo smrti a posilni ich vo vedomí, že ty sám im prichádzaš v ústrety.",
                    "Pane Ježišu,<br>" +
                            "svätá panna Terézia<br>" +
                            "bola naplnená láskou k tebe;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a zapáľ aj naše srdcia tým istým ohňom lásky.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"02", "Bratia a sestry, dobrý Pán Boh nám dal nebeských priateľov – anjelov strážcov. Buďme šťastní a vďační, že máme takých mocných ochrancov.",
                    "<font color='#B71C1C'>(</font>Volajme: Na príhovor anjelov vyslyš nás, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, nech tvoji anjeli pomáhajú putujúcej Cirkvi a nech ju bránia proti úkladom zlých duchov.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, nech anjeli pokoja chránia krajiny od vrážd a vojen.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, pod ochranou anjelov strážcov sprevádzaj všetkých, ktorí sú na cestách a mimo domova.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, prostredníctvom svojich anjelov chráň našu mládež pred vplyvom zlých ľudí.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, na príhovor anjelov vlej do sŕdc našich chorých posilu a poteš ich svojou prítomnosťou.<br>" +
                            "<font color='#B71C1C'>6.</font> Bože, daj, nech naši zomrelí <font color='#B71C1C'>(M.)</font> spolu s anjelmi stojacimi pred tvojím trónom spievajú pieseň víťazstva.",
                    "Bože Otče,<br>" +
                            "ďakujeme ti za prítomnosť anjelov v našom živote;<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme na orodovanie Panny Márie,<br>" +
                            "Kráľovnej anjelov,<br>" +
                            "počúvali vnuknutia anjela strážcu.<br>" +
                            "O to ťa prosíme skrze Krista, nášho Pána."},
            {"04", "Bratia a sestry, podľa svätého Františka máme byť jednoduchí, pokorní a čistí. Prosme nebeského Otca, aby sme pochopili, čo znamená, že chudobným patrí nebeské kráľovstvo.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, daj, aby sa všetci kresťania zdokonaľovali nasledovaním Kristovej chudoby a pokory.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, daj, nech si všetci ľudia uvedomia, že sú navzájom bratmi a sestrami, lebo majú jedného Otca, ktorý je na nebesiach.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, povzbuď solventných ľudí, aby sa bratsky starali o chudobných a pomáhali zmierňovať ich biedu.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, zjednocuj ľudí v starostlivosti o prírodu, aby ju chránili pred devastáciou a zničením.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, na príhovor svätého Františka prehlbuj našu lásku k ukrižovanému Ježišovi Kristovi.",
                    "Dobrotivý Otče,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a nauč nás vidieť aj v stvorených veciach<br>" +
                            "prejavy tvojej lásky k nám,<br>" +
                            "aby sme ťa mohli viac milovať.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"05", "Bratia a sestry, dnes si spomíname na svätú Faustínu Kowalskú, apoštolku Božieho milosrdenstva. Ďakujme Pánovi Ježišovi, že nám v jej živote a učení zjavil milosrdnú tvár Otca, a spoločne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za biskupov, kňazov a diakonov, aby v službe Cirkvi, ale aj v osobnom živote pamätali na Ježišovu lásku, v ktorej ich povolal nasledovať ho.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za všetkých, ktorí sa dovolávajú Božieho milosrdenstva, aby si uvedomovali, že láske predchádza pokora a odpusteniu úprimné pokánie.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za ľudí vo verejnej správe, aby podobne ako svätá Faustína vnímali svoj život ako obetu a službu druhým.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za ľudí, ktorých trápia výčitky svedomia a pocit viny, aby uverili sile Božej lásky, ktorá premáha hriech i ľudskú slabosť.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za zomierajúcich v stave hriechu, aby pre naše modlitby a Pánovo milosrdenstvo úprimnou ľútosťou dosiahli odpustenie.",
                    "Pane Ježišu,<br>" +
                            "ty si pokoru, vieru a lásku svätej Faustíny<br>" +
                            "odmenil videním tvojej tváre;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pomôž nám žiť s čistým srdcom,<br>" +
                            "aby sme ťa raz aj my videli z tváre do tváre.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"07m", "Bratia a sestry, vytrvalá modlitba je prejavom dôvery a lásky a prináša nám duchovné dary. V tejto spoločnej modlitbe prosme Pána, aby nám modlitba posvätného ruženca bola duchovnou silou a svetu záchranou.",
                    "<font color='#B71C1C'>(</font>Volajme: Pozri na Matku svojho Syna a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, daj, aby všetci biskupi a kňazi rozjímaním o tajomstvách spásy v modlitbe ruženca nachádzali silu plniť svoje poslanie.<br>" +
                            "<font color='#B71C1C'>2.</font> Povzbuď všetkých veriacich, aby sa radi a často modlili ruženec.<br>" +
                            "<font color='#B71C1C'>3.</font> Pre modlitbu posvätného ruženca zachráň svet od nešťastia a udeľ ľudskej spoločnosti pokoj i svornosť.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj, aby chorí a trpiaci našli silu i svetlo v pravidelnej a vytrvalej modlitbe.<br>" +
                            "<font color='#B71C1C'>5.</font> Posilňuj všetkých, ktorí tvoria ružencové bratstvo nášho <font color='#B71C1C'>(</font>farského<font color='#B71C1C'>)</font> spoločenstva, aby boli horliví v modlitbe a konaní skutkov lásky.<br>" +
                            "<font color='#B71C1C'>6.</font> Daruj našim zomrelým <font color='#B71C1C'>(M.)</font> večný odpočinok, aby sa v nebi radovali s Kráľovnou posvätného ruženca.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a daj, aby sme na príhovor Kráľovnej posvätného ruženca<br>" +
                            "čoraz lepšie chápali tajomstvá nášho vykúpenia.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "Bratia a sestry, Boh Otec obdaroval Cirkev v ťažkých časoch dvadsiateho storočia svätými pápežmi, medzi ktorých patrí aj svätý Ján Dvadsiaty tretí. S vďakou za jeho službu a odvahu prednesme spoločne teraz svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za pápeža <font color='#B71C1C'>M.</font>, biskupov a kňazov: aby v Cirkvi chránili poklad viery a primeraným spôsobom ho dokázali ponúknuť ľuďom dneška, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za politikov a štátnikov: aby vedeli podporiť dielo Cirkvi vo svete a chápali, že jej ide o pravé dobro všetkých ľudí, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za kresťanov rôznych vyznaní: aby hľadali cesty spolupráce v ohlasovaní evanjelia a tým prispievali k jednote Cirkvi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za tých, ktorí sa starajú o liturgiu: aby popri zachovávaní vzácnych tradícií a zvykov vždy podporovali jej rozvoj a obnovu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás samých: aby sme príkladom života a zodpovednými postojmi ukazovali tomuto svetu, že Kristus je jedinou cestou k šťastiu a pravej radosti, prosme Pána.",
                    "Bože Otče, ty v každom čase posielaš Cirkvi<br>" +
                            "pastierov s prorockým hlasom,<br>" +
                            "aby pravdivo ukázali, čo treba zachovať a čo obnoviť;<br>" +
                            "ďakujeme ti za vzácneho pápeža Jána Dvadsiateho tretieho<br>" +
                            "a prosíme ťa, aby si na jeho príhovor vypočul naše prosby<br>" +
                            "a neustále požehnával dielo koncilovej obnovy.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"15", "Bratia a sestry, všetci sme povolaní k dokonalosti kresťanského života. Prosme Boha Otca, žriedlo svätosti, aby nás pre zásluhy a na príhovor svätej Terézie z Avily viedol cestou kresťanského života.",
                    "<font color='#B71C1C'>(</font>Volajme: Otče, prameň všetkej svätosti, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, prosíme ťa za Cirkev, ktorá je svätá svojím učením a sviatosťami viery, aby sa jej svätosť prejavovala v živote veriacich a duchovných pastierov.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosíme ťa za predstaviteľov národov, aby vynikali prirodzenými čnosťami a šľachetným životom.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosíme ťa za tých, ktorí dvíhajú ľudí z duchovnej i hmotnej biedy, opatrujú chorých, pomáhajú sirotám a utláčaným, aby v sile Ducha Svätého dosiahli hrdinský stupeň lásky.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosíme ťa za pracovníkov kultúry a učiteľov, aby podporovaní celou spoločnosťou nešetrili obetavosťou pri výchove detí a mládeže.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, prosíme ťa za seba samých, aby sme boli verní záväzkom krstu, ktorým sme boli včlenení do svätého Božieho ľudu.",
                    "Svätý Otče,<br>" +
                            "na príhovor svätej Terézie vyslyš naše prosby<br>" +
                            "a nauč nás stále kráčať cestou, ktorou je Kristus,<br>" +
                            "aby sme žili v posväcujúcej milosti<br>" +
                            "a získali nebeské kráľovstvo.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"16b", "Bratia a sestry, spomíname si na svätú Margitu, ktorej Pán Ježiš zjavil bohatstvá lásky svojho srdca. Modlime sa s dôverou:",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za biskupov, kňazov a diakonov, aby všetkým ľuďom zjavovali lásku Ježišovho srdca.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za celý svet, aby objavil žriedlo lásky a pokoja, ktorým je Ježišovo srdce.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za ľudí, ktorí dlho nepristúpili k sviatostiam, aby našli cestu k Ježišovmu srdcu a zverili sa Božiemu milosrdenstvu.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za mladých ľudí, aby dokázali odpovedať na Božie volanie na kňazstvo a zasvätený život.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za kresťanov, ktorí si konajú pobožnosť prvých piatkov, aby úprimným pokáním a prijímaním Eucharistie rástli v milosti.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za seba samých, aby sa na nás bohato naplnili prisľúbenia Ježišovho srdca zjavené svätej Margite.",
                    "Milosrdný Bože,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby nás úcta Najsvätejšieho Srdca Ježišovho<br>" +
                            "duchovne obohacovala a zaistila nám večný život.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"16c", "Bratia a sestry, mnohí kresťania nasledovali Pána Ježiša v horlivom ohlasovaní evanjelia a celkom mu zasvätili svoj život v tichu, modlitbe a rozjímaní. Medzi nich patrí aj dnešný svätec, svätý pustovník Gál. Na jeho príhovor prednesme Pánovi svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Ježišu, upevňuj svoju Cirkev v misijnej činnosti po celom svete a v radostnom svedectve života podľa tvojich prikázaní.<br>" +
                            "<font color='#B71C1C'>2.</font> Veď všetkých tebe zasvätených k príkladnému kresťanskému životu, aby boli duchovnou oporou a posilou pre tých, ktorí žijú vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Usmerňuj predstaviteľov národov pri vykonávaní politickej moci a v rozhodovaní o životných podmienkach pre chudobných, chorých a opovrhovaných.<br>" +
                            "<font color='#B71C1C'>4.</font> Požehnávaj všetkých, ktorí opustili svoj domov len preto, aby pomáhali iným v ich namáhavej práci, službe a obete.<br>" +
                            "<font color='#B71C1C'>5.</font> Ježišu, posilňuj nás vo viere a v plnení tvojej vôle, aby sme boli soľou zeme a svetlom sveta.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše pokorné prosby,<br>" +
                            "ktoré sme ti predniesli pri spomienke na svätého Gála,<br>" +
                            "a aj spomedzi nás povolávaj svätcov,<br>" +
                            "ktorí dokážu v dnešnom svete svedčiť o tebe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"17", "Bratia a sestry, dnes si spomíname na svätého biskupa Ignáca Antiochijského, ktorý nasledoval Krista až po mučenícku smrť. Aj my odovzdajme svoje životy Ježišovi a s dôverou sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, ochraňuj nášho biskupa <font color='#B71C1C'>M.</font> a daruj mu spoľahlivých spolupracovníkov pri vedení miestnej cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Posilňuj všetky národy vo viere v teba a v rešpektovaní ľudského stvorenia na Boží obraz.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, aby sa kresťania, ktorí umierajú pre vieru, stali Kristovou pšenicou, mučeníctvom rozomletou na čistý chlieb, dávajúci silu a odvahu celej Cirkvi.<br>" +
                            "<font color='#B71C1C'>4.</font> Sprevádzaj misionárov na ich cestách, aby s pevnou vierou zdolávali všetky prekážky.<br>" +
                            "<font color='#B71C1C'>5.</font> Posilňuj nás svojou milosťou, aby sme obetou svojho života dokázali premáhať zlo.<br>" +
                            "<font color='#B71C1C'>6.</font> Pripočítaj našich zomrelých <font color='#B71C1C'>(M.)</font> medzi svojich vyvolených a daruj im večný život.",
                    "Pane Ježišu, najvyššia a najcennejšia obeta,<br>" +
                            "mučeníci ťa vyznali svojou krvou;<br>" +
                            "pomáhaj nám obetovať svoj život pre teba<br>" +
                            "a vypočuj naše prosby,<br>" +
                            "ktorými k tebe voláme.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"18g", "Bratia a sestry, svätý Lukáš, žiak a sprievodca svätého apoštola Pavla, napísal evanjelium, v ktorom zobrazuje Kristovo milosrdenstvo voči hriešnikom a približuje nám Božiu Matku. Modlime sa s dôverou:",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, priveď kresťanský ľud čítaním evanjelia k hlbšiemu poznaniu Ježiša Krista.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby sa radostná zvesť tvojho Syna ohlasovala všetkým ľuďom.<br>" +
                            "<font color='#B71C1C'>3.</font> Žehnaj námahu a obetavosť lekárov a odmeň ich večnou radosťou.<br>" +
                            "<font color='#B71C1C'>4.</font> Na orodovanie svätého Lukáša naplň kajúcich hriešnikov dôverou, že Boh ich otcovsky prijme.<br>" +
                            "<font color='#B71C1C'>5.</font> Pomôž nám chápať, že sám Kristus hovorí, keď sa v Cirkvi číta Sväté písmo.<br>" +
                            "<font color='#B71C1C'>6.</font> Veď nás k synovskej úcte a láske k Panne Márii, matke tvojho Syna.",
                    "Milosrdný Bože,<br>" +
                            "vyvolil si svätého Lukáša,<br>" +
                            "aby ohlasoval evanjelium pohanom a hriešnikom;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj nám lásku a úctu k tvojmu slovu,<br>" +
                            "aby nám bolo ustavičným pokrmom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "Bratia a sestry, svätý pápež Ján Pavol Druhý nám svojím životom a službou Cirkvi ukázal, že sa pre všetkých stal všetkým. Spojme svoje prosby a vo viere ich prednesme nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Otče, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Svätý Ján Pavol slúžil so slúžiacimi; prosme za Svätého Otca <font color='#B71C1C'>M.</font>, biskupov, kňazov, rehoľníkov a všetkých, ktorí pracujú v Cirkvi, aby svoju službu vykonávali horlivo a s láskou.<br>" +
                            "<font color='#B71C1C'>2.</font> Svätý Ján Pavol volal s volajúcimi; prosme za všetkých, ktorí sa vo svete domáhajú slobody, uznania, svojich práv a mieru, aby ich hlas zasiahol tých, ktorí vedú národy.<br>" +
                            "<font color='#B71C1C'>3.</font> Svätý Ján Pavol bol mladý s mladými; prosme za mládež a deti celého sveta, aby vždy boli prijaté s láskou ako nádej daná ľudstvu.<br>" +
                            "<font color='#B71C1C'>4.</font> Svätý Ján Pavol trpel s trpiacimi; prosme za chorých, starých a opustených, aby im Pán bol potechou a posilou a vedeli, že aj v trápení prispievajú k posväteniu sveta.<br>" +
                            "<font color='#B71C1C'>5.</font> Svätý Ján Pavol putoval s putujúcimi; prosme za nás všetkých, aby sme nikdy nezabudli na cieľ nášho života, ku ktorému nás má privádzať všetko, čo robíme.",
                    "Večný Bože, skrze veľkňaza a pastiera našich duší Ježiša Krista,<br>" +
                            "vyznávame tvoju slávu a velebu<br>" +
                            "a na príhovor svätého pápeža Jána Pavla Druhého<br>" +
                            "ťa prosíme o vypočutie našich prosieb.<br>" +
                            "Tebe patrí chvála a sláva naveky."},
            {"25", "Bratia a sestry, pri spomienke na svätého Maura, autora najstaršieho literárneho diela, ktoré sa viaže na slovenské prostredie, pokorne prosme nášho Pána.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby aj Cirkev na Slovensku bola obohatením a prínosom pre celosvetové spoločenstvo kresťanov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby verejní predstavitelia našej krajiny bránili náš národ pred stratou kultúrnych a kresťanských hodnôt, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby sa historici, výskumníci a vedci vždy usilovali o objektívne a nezaujaté poznanie a prispievali k zdravému rozvoju spoločnosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby nás životy svätcov, ktorí sú spojení s územím Slovenska, povzbudzovali k horlivému kresťanskému životu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby všetci naši predkovia, ktorí modlitbou, obetou a príkladom života prispievali k prehlbovaniu viery v našej krajine, boli pripočítaní k zástupom svätých, prosme Pána.",
                    "Nebeský Otče, životy svätých sú dielom tvojej milosti;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a na príhovor našich svätých<br>" +
                            "veď aj nás k ideálom kresťanského života.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"26gk+", "Bratia a sestry, zhromaždili sme sa v Božom chráme, v dome modlitby. Aj v nás ako v chráme býva Duch Svätý. Preto vrúcne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za nášho Svätého Otca <font color='#B71C1C'>M.</font>, za všetkých biskupov a kňazov, aby boli žiarivým príkladom oslavy Boha pri slávení posvätnej liturgie.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za tých, ktorí spravujú štáty, aby stavbu ľudskej spoločnosti budovali na základoch Božej spravodlivosti a pokoja.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za všetkých, ktorí sa starajú o zveľaďovanie a poriadok v chráme, aby svojou službou pomáhali vzbudzovať vo veriacich vnútorný pokoj a duchovné povzbudenie.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme vždy s radosťou navštevovali tento chrám a ďakovali Bohu za to, že prebýva medzi nami.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za zosnulých, ktorí prechádzali bránou tohto chrámu, aby mohli mať vo večnom príbytku v nebi podiel na živote so všetkými svätými.",
                    "Všemohúci Bože,<br>" +
                            "otcovsky vyslyš naše prosby,<br>" +
                            "ktoré ti v tomto chráme prednášame; <br>" +
                            "nauč nás milovať krásu tvojho domu<br>" +
                            "a v sebe budovať tvoj svätý príbytok.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"28g", "Bratia a sestry, na sviatok svätých apoštolov Šimona a Júdu povzbuďme sa vo svojom apoštolskom poslaní šíriť Božie slovo. Volajme spoločne k nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože Otče, daruj všetkým členom svojej Cirkvi odvahu pri hlásaní evanjelia a radosť zo spoločenstva s Kristom.<br>" +
                            "<font color='#B71C1C'>2.</font> Ochraňuj národy, aby žili v mieri, a zabráň vojnovým konfliktom, ktoré ničia ľudské životy a materiálne hodnoty.<br>" +
                            "<font color='#B71C1C'>3.</font> Na príhovor svätého apoštola Júdu pomáhaj všetkým, ktorí upadajú do beznádeje, aby našli pravý zmysel života.<br>" +
                            "<font color='#B71C1C'>4.</font> Na orodovanie svätého apoštola Šimona nás posilňuj, aby sme žili horlivým duchovným životom.<br>" +
                            "<font color='#B71C1C'>5.</font> Otvor brány raja našim zomrelým <font color='#B71C1C'>(M.)</font>, aby sa naveky tešili v spoločenstve svätých apoštolov v nebi.",
                    "Milosrdný Otče,<br>" +
                            "prisľúbil si nám svoju lásku<br>" +
                            "a pomoc Ducha Svätého,<br>" +
                            "ak budeme zachovávať slová tvojho Syna;<br>" +
                            "prosíme ťa, vypočuj naše modlitby<br>" +
                            "a daj, aby sme evanjelium prijali celým srdcom<br>" +
                            "a podľa neho aj žili.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31gk", "Bratia a sestry, s radosťou oslavujeme našich bratov a sestry, ktorí v nebeskej Cirkvi kraľujú s Ježišom Kristom, korunou všetkých svätých. S dôverou volajme:",
                    "<font color='#B71C1C'>(</font>Na príhovor všetkých svätých vyslyš nás, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, nech spoločenstvo putujúcej Cirkvi so svätými v nebi posilňuje naše spojenie s Kristom.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, nech vo svete nevládne pýcha, ktorá ľudí rozdeľuje, ale láska, ktorá všetkých spája.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, nech je príklad svätých mučeníkov silou pre všetkých, ktorí musia znášať ťažkosti a súženia.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, nech mravná čistota svätých priťahuje mladých ľudí k šľachetnému a svätému životu.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, nech naše farské spoločenstvo čoraz lepšie chápe Ježišove blahoslavenstvá, základný zákon Cirkvi.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a pomáhaj nám žiť podľa viery,<br>" +
                            "aby sme mohli byť pripočítaní<br>" +
                            "k veľkému zástupu tvojich svätých v nebi.<br>" +
                            "Skrze Krista, nášho Pána."},
    };

    String[][] prosby11 = {
            {"01gk", "Bratia a sestry, s radosťou oslavujeme našich bratov a sestry, ktorí v nebeskej Cirkvi kraľujú s Ježišom Kristom, korunou všetkých svätých. S dôverou volajme:",
                    "<font color='#B71C1C'>(</font>Na príhovor všetkých svätých vyslyš nás, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, nech spoločenstvo putujúcej Cirkvi so svätými v nebi posilňuje naše spojenie s Kristom.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, nech vo svete nevládne pýcha, ktorá ľudí rozdeľuje, ale láska, ktorá všetkých spája.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, nech je príklad svätých mučeníkov silou pre všetkých, ktorí musia znášať ťažkosti a súženia.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, nech mravná čistota svätých priťahuje mladých ľudí k šľachetnému a svätému životu.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, nech naše farské spoločenstvo čoraz lepšie chápe Ježišove blahoslavenstvá, základný zákon Cirkvi.",
                    "Bože, vyslyš naše prosby<br>" +
                            "a pomáhaj nám žiť podľa viery,<br>" +
                            "aby sme mohli byť pripočítaní<br>" +
                            "k veľkému zástupu tvojich svätých v nebi.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"02an", "Bratia a sestry, prísľub večného života nás povzbudzuje k spomienke a prosbe za zomrelých, ktorí potrebujú očistenie, skôr ako dosiahnu večnú slávu. Prednesme za nich svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Milosrdný Bože, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za všetkých kresťanov, aby svojím životom boli svedkami viery vo vzkriesenie mŕtvych.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za Cirkev v očistci, aby pre naše modlitby a obety mohli naši zosnulí čím skôr uvidieť Pánovu tvár v nebi.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých zosnulých, ktorí pre naše chyby musia byť v očistci, aby im aj nám bol Pán milostivý.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za našich zomrelých príbuzných, priateľov a známych, aby im Ježiš, ktorý zomrel za všetkých, daroval večnú radosť.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za tých, ktorí oplakávajú svojich zosnulých, aby čerpali útechu a silu z viery vo večný život.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa aj za seba, aby sme boli pripravení, keď Pán príde, zaklope a povolá nás do večnosti.",
                    "Bože Otče, vyslyš naše prosby,<br>" +
                            "zmiluj sa nad našimi zosnulými,<br>" +
                            "ktorí túžia vidieť tvoju božskú tvár,<br>" +
                            "a nás posväcuj chlebom z neba,<br>" +
                            "aby sme dosiahli večný život a slávne vzkriesenie.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"02bn", "Bratia a sestry, prísľub večného života nás povzbudzuje k spomienke a prosbe za zomrelých, ktorí potrebujú očistenie, skôr ako dosiahnu večnú slávu. Prednesme za nich svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Milosrdný Bože, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za všetkých kresťanov, aby svojím životom boli svedkami viery vo vzkriesenie mŕtvych.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za Cirkev v očistci, aby pre naše modlitby a obety mohli naši zosnulí čím skôr uvidieť Pánovu tvár v nebi.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých zosnulých, ktorí pre naše chyby musia byť v očistci, aby im aj nám bol Pán milostivý.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za našich zomrelých príbuzných, priateľov a známych, aby im Ježiš, ktorý zomrel za všetkých, daroval večnú radosť.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za tých, ktorí oplakávajú svojich zosnulých, aby čerpali útechu a silu z viery vo večný život.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa aj za seba, aby sme boli pripravení, keď Pán príde, zaklope a povolá nás do večnosti.",
                    "Bože Otče, vyslyš naše prosby,<br>" +
                            "zmiluj sa nad našimi zosnulými,<br>" +
                            "ktorí túžia vidieť tvoju božskú tvár,<br>" +
                            "a nás posväcuj chlebom z neba,<br>" +
                            "aby sme dosiahli večný život a slávne vzkriesenie.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"02cn", "Bratia a sestry, prísľub večného života nás povzbudzuje k spomienke a prosbe za zomrelých, ktorí potrebujú očistenie, skôr ako dosiahnu večnú slávu. Prednesme za nich svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Milosrdný Bože, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za všetkých kresťanov, aby svojím životom boli svedkami viery vo vzkriesenie mŕtvych.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za Cirkev v očistci, aby pre naše modlitby a obety mohli naši zosnulí čím skôr uvidieť Pánovu tvár v nebi.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých zosnulých, ktorí pre naše chyby musia byť v očistci, aby im aj nám bol Pán milostivý.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za našich zomrelých príbuzných, priateľov a známych, aby im Ježiš, ktorý zomrel za všetkých, daroval večnú radosť.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za tých, ktorí oplakávajú svojich zosnulých, aby čerpali útechu a silu z viery vo večný život.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa aj za seba, aby sme boli pripravení, keď Pán príde, zaklope a povolá nás do večnosti.",
                    "Bože Otče, vyslyš naše prosby,<br>" +
                            "zmiluj sa nad našimi zosnulými,<br>" +
                            "ktorí túžia vidieť tvoju božskú tvár,<br>" +
                            "a nás posväcuj chlebom z neba,<br>" +
                            "aby sme dosiahli večný život a slávne vzkriesenie.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"04", "Bratia a sestry, svätý Karol Boromejský patrí medzi významné osobnosti novovekých cirkevných dejín. Jeho zásluhy siahajú do mnohých oblastí cirkevného života. Spoločne prosme Pána, aby aj dnes posielal Cirkvi horlivých pastierov.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby Cirkev mala dostatok vzorných duchovných pastierov, ktorí všetky duševné a telesné sily dajú do služieb svojim veriacim, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby svetskí predstavitelia používali svoju zákonodarnú moc v súlade s morálnymi zásadami, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby pozostalí, ktorí stratili svojich príbuzných pri nehodách a nešťastiach, nestratili nádej na stretnutie s nimi vo večnom domove, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sa v novozaložených farnostiach Cirkvi budovali pevné spoločenstvá veriacich, ktorí si budú navzájom pomáhať a posilňovať sa vo viere, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme sa aktívne zúčastňovali života vo svojom <font color='#B71C1C'>(</font>farskom<font color='#B71C1C'>)</font> spoločenstve a tešili sa z účasti na svätej omši, prosme Pána.",
                    "Pane Ježišu, ty si pomoc trpiacich a tešiteľ chudobných;<br>" +
                            "vypočuj naše modlitby<br>" +
                            "a daj, aby sme videli vzor kresťanského života<br>" +
                            "vo svätom Karolovi Boromejskom<br>" +
                            "a raz si zaslúžili večnú odmenu v spoločenstve tvojich svätých.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"09g", "Bratia a sestry, Lateránska bazilika v Ríme je matkou a hlavou kresťanských chrámov celého sveta. Zjednoťme sa v modlitbe a prosme o budovanie duchovného chrámu vo svojom srdci.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože Otče, buduj svoju Cirkev ako chrám postavený na základoch evanjelia, aby ho nepremohli pekelné mocnosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, daj, aby pápež <font color='#B71C1C'>M.</font> bol svojou službou mocnou oporou viery pre všetkých.<br>" +
                            "<font color='#B71C1C'>3.</font> Zabráň nepriateľom Cirkvi v ničení a rúcaní kresťanských chrámov.<br>" +
                            "<font color='#B71C1C'>4.</font> Zachráň rozpadávajúce sa manželstvá, aby manželia opäť vystavali jednotný chrám rodiny a vzájomnej úcty a lásky.<br>" +
                            "<font color='#B71C1C'>5.</font> Pomáhaj nám byť živými kameňmi pri stavbe diela ohlasovania evanjelia.<br>" +
                            "<font color='#B71C1C'>6.</font> Ukáž našim zomrelým <font color='#B71C1C'>(M.)</font> večnú krásu nebeského chrámu, kde naveky prebývaš so svojím Synom.",
                    "Pane a Bože náš,<br>" +
                            "každý z nás je oslavou tvojho stvoriteľského diela;<br>" +
                            "prosíme ťa,<br>" +
                            "prijmi naše modlitby, vypočuj ich,<br>" +
                            "a ako najdokonalejší staviteľ<br>" +
                            "nás sprevádzaj na ceste k tvojmu večnému kráľovstvu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "Bratia a sestry, svätý pápež Lev Veľký bol ozdobou rímskej cirkvi a Božej služby. V deň spomienky na tohto najvýznamnejšieho pápeža kresťanského staroveku v jednote s celou Cirkvou pozdvihnime v modlitbe svoj hlas k nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, darca múdrosti, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, zjednocuj svoju Cirkev pod vedením Svätého Otca <font color='#B71C1C'>M.</font>, aby rástla vo viere a šírila tvoj pokoj.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, ochraňuj národy pred mravnou a hmotnou skazou, aby bol mier vo svete pre všetkých cieľom.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, osobitnou milosťou sprevádzaj tých, ktorí sa venujú histórii a píšu cirkevné dejiny, aby úprimne hľadali pravdu a čo najvernejšie hodnotili dejinné udalosti.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, buduj v nás úctu k cirkevným predstaviteľom, aby sme v nich videli tvojich služobníkov.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, osvecuj našu myseľ i poznanie, aby sme vedeli rozoznať pravé Kristovo učenie od nepravého.",
                    "Láskavý Otče, svätý pápež Lev Veľký<br>" +
                            "sa naplnením svojho poslania zapísal<br>" +
                            "do dejín svätej Cirkvi;<br>" +
                            "na jeho príhovor vypočuj naše prosby<br>" +
                            "a pomáhaj nám,<br>" +
                            "aby sme sa stali rodinou milujúcich bratov a sestier<br>" +
                            "spojených v mene tvojho Syna Ježiša Krista,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"11", "Bratia a sestry, svätý Martin je vzorom lásky k chudobným a príkladom neúnavnej práce i služby pre svoj ľud. Prosme Pána za dobrých duchovných pastierov a za spásu sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, roznieť v služobníkoch Cirkvi lásku k tebe a horlivosť za spásu duší.<br>" +
                            "<font color='#B71C1C'>2.</font> Žehnaj všetkých, ktorí zmierňujú hlad a biedu vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Daruj všetkým katechumenom horlivosť v príprave na prijatie krstu.<br>" +
                            "<font color='#B71C1C'>4.</font> Priveď všetkých obyvateľov našej krajiny k tomu, aby milovali svoju vlasť a bránili vieru otcov.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás podeliť si chlieb i rúcho s chudobnými a hladujúcimi.<br>" +
                            "<font color='#B71C1C'>6.</font> Daj umierajúcim odvahu, aby v hodine smrti prosili teba i svoje okolie o odpustenie.<br>" +
                            "<font color='#B71C1C'>7. V Bratislavskej arcidiecéze a Spišskej diecéze:</font> Požehnávaj ľud našej <font color='#B71C1C'>(</font>arci<font color='#B71C1C'<font color='#B71C1C'>)</font>diecézy, aby s horlivosťou budoval spoločenstvo lásky a vzájomnej pomoci.",
                    "Dobrotivý Bože,<br>" +
                            "ty chceš skôr milosrdenstvo ako obetu;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme sa skutkami milosrdnej lásky k blížnemu<br>" +
                            "upevňovali v láske k tebe.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11g", "Bratia a sestry, svätý Martin je vzorom lásky k chudobným a príkladom neúnavnej práce i služby pre svoj ľud. Prosme Pána za dobrých duchovných pastierov a za spásu sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, roznieť v služobníkoch Cirkvi lásku k tebe a horlivosť za spásu duší.<br>" +
                            "<font color='#B71C1C'>2.</font> Žehnaj všetkých, ktorí zmierňujú hlad a biedu vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Daruj všetkým katechumenom horlivosť v príprave na prijatie krstu.<br>" +
                            "<font color='#B71C1C'>4.</font> Priveď všetkých obyvateľov našej krajiny k tomu, aby milovali svoju vlasť a bránili vieru otcov.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás podeliť si chlieb i rúcho s chudobnými a hladujúcimi.<br>" +
                            "<font color='#B71C1C'>6.</font> Daj umierajúcim odvahu, aby v hodine smrti prosili teba i svoje okolie o odpustenie.<br>" +
                            "<font color='#B71C1C'>7. V Bratislavskej arcidiecéze a Spišskej diecéze:</font> Požehnávaj ľud našej <font color='#B71C1C'>(</font>arci<font color='#B71C1C'<font color='#B71C1C'>)</font>diecézy, aby s horlivosťou budoval spoločenstvo lásky a vzájomnej pomoci.",
                    "Dobrotivý Bože,<br>" +
                            "ty chceš skôr milosrdenstvo ako obetu;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme sa skutkami milosrdnej lásky k blížnemu<br>" +
                            "upevňovali v láske k tebe.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"12", "Bratia a sestry, Boh volá všetkých ľudí k jednote vo viere v Kristovej Cirkvi. Prosme Pána, aby na orodovanie svätého Jozafáta v Cirkvi opäť zavládla jednota.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, zjednoť všetkých veriacich.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, zošli všetkým národom svetlo viery a zjednoť ich vo svojej Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, nech všetci ľudia spoznajú Krista ako svojho dobrého pastiera, ktorý za nich položil život.<br>" +
                            "<font color='#B71C1C'>3.</font> Odpusť rozdeleným kresťanom ich viny a priveď ich k plnej jednote v Kristovej Cirkvi.<br>" +
                            "<font color='#B71C1C'>4.</font> Vyhas v ľudských srdciach rasovú i všetku inú nenávisť a každé násilie.<br>" +
                            "<font color='#B71C1C'>5.</font> Nauč nás modliť sa za jednotu Cirkvi a svojím životom svedčiť o pravej viere.",
                    "Bože Otče, ty zachraňuješ, čo sa stratilo,<br>" +
                            "a dávaš nádej tým, ktorí ju už nemajú;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a pre krv svätého mučeníka Jozafáta<br>" +
                            "zjednoť vo svojej Cirkvi všetkých pokrstených.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"15", "Bratia a sestry, Boh je prameň všetkej pravdy. Dnes pri spomienke na svätého Alberta Veľkého prosme Pána o pravú múdrosť.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, posielaj Cirkvi múdrych učiteľov kresťanskej náuky.<br>" +
                            "<font color='#B71C1C'>2.</font> Vnukni všetkým ľuďom, aby cez stvorené veci spoznali svojho Stvoriteľa a Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Vlož do sŕdc verejných činiteľov úctu k pravde.<br>" +
                            "<font color='#B71C1C'>4.</font> Osvieť profesorov a učiteľov náboženstva svetlom svojho Ducha, aby poúčali svojich poslucháčov slovom i príkladom.<br>" +
                            "<font color='#B71C1C'>5.</font> Pouč našich rodičov, že oni sú pre svoje deti prvými učiteľmi a svedkami viery.<br>" +
                            "<font color='#B71C1C'>6.</font> Daruj nám všetkým svoju milosť, aby sme poznávaním stvoreného sveta rástli vo viere v teba.",
                    "Pane, vyslyš naše prosby<br>" +
                            "a na príhovor svätého Alberta<br>" +
                            "pomáhaj nám vzmáhať sa v múdrosti svätých,<br>" +
                            "aby sme čo najlepšie poznali tvojho Syna,<br>" +
                            "ukrižovaného Ježiša Krista,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"17", "Bratia a sestry, Božia dobrota a krása jeho lásky vyžaruje zo svätých. V tejto spoločnej modlitbe prosme Pána, aby na orodovanie svätej Alžbety čoraz lepšie žiarila táto dobrota a krása lásky vo všetkých kresťanoch.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, naša sila, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby deti Cirkvi povolané k nasledovaniu Kristovej lásky nikdy nezatvárali svoje srdcia pred potrebami bratov.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby zákonodarcovia pamätali na viacdetné, chudobné i neúplné rodiny a zabezpečili im právnu starostlivosť i materiálnu pomoc.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, aby chorí a opustení mali v sebe lásku, ktorá všetko znesie a všetko pretrpí a utrpenie premení na kajúci skutok.<br>" +
                            "<font color='#B71C1C'>4.</font> Žehnaj všetky charitatívne diela, ktoré zmierňujú telesnú i duchovnú biedu.<br>" +
                            "<font color='#B71C1C'>5.</font> Chráň matky našej vlasti od hriešnych zámerov zničiť nenarodené deti.<br>" +
                            "<font color='#B71C1C'>6.</font> Vnukni synom a dcéram našej farnosti, aby s láskou a trpezlivo opatrovali svojich starých a nevládnych rodičov.",
                    "Dobrotivý Bože,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme v chudobných a trpiacich<br>" +
                            "milovali teba samého.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"17gk", "Bratia a sestry, Božia dobrota a krása jeho lásky vyžaruje zo svätých. V tejto spoločnej modlitbe prosme Pána, aby na orodovanie svätej Alžbety čoraz lepšie žiarila táto dobrota a krása lásky vo všetkých kresťanoch.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, naša sila, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby deti Cirkvi povolané k nasledovaniu Kristovej lásky nikdy nezatvárali svoje srdcia pred potrebami bratov.<br>" +
                            "<font color='#B71C1C'>2.</font> Daj, aby zákonodarcovia pamätali na viacdetné, chudobné i neúplné rodiny a zabezpečili im právnu starostlivosť i materiálnu pomoc.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, aby chorí a opustení mali v sebe lásku, ktorá všetko znesie a všetko pretrpí a utrpenie premení na kajúci skutok.<br>" +
                            "<font color='#B71C1C'>4.</font> Žehnaj všetky charitatívne diela, ktoré zmierňujú telesnú i duchovnú biedu.<br>" +
                            "<font color='#B71C1C'>5.</font> Chráň matky našej vlasti od hriešnych zámerov zničiť nenarodené deti.<br>" +
                            "<font color='#B71C1C'>6.</font> Vnukni synom a dcéram našej farnosti, aby s láskou a trpezlivo opatrovali svojich starých a nevládnych rodičov.",
                    "Dobrotivý Bože,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme v chudobných a trpiacich<br>" +
                            "milovali teba samého.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"18", "Bratia a sestry, medzi chrámami svätej Cirkvi majú osobitné miesto pápežské baziliky svätého Petra a svätého Pavla v Ríme. Modlime sa, aby aj v tomto chráme <font color='#B71C1C'>(</font>na tomto mieste<font color='#B71C1C'>)</font> Ježiš vstúpil do našich sŕdc a zostal tam navždy prítomný.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby sa všetci biskupi a kňazi usilovali sprítomňovať Kristovu obetu dôstojným liturgickým slávením, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby sa národy usilovali o vzájomné porozumenie a pochopenie Božieho zákona, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby tí, ktorí pracujú ďaleko od domova, mysleli na svoje rodiny a nezabúdali na manželskú vernosť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby sme v sebe nerúcali chrám ľudskej dôstojnosti, čistoty a mravnosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby naši zomrelí <font color='#B71C1C'>(M.)</font> víťazne prešli bránou večného chrámu a stretli sa s nekonečnou Božou dobrotou, prosme Pána.",
                    "Pane Ježišu,<br>" +
                            "prosíme ťa, vypočuj naše modlitby<br>" +
                            "a veď nás stále bližšie k sebe,<br>" +
                            "aby sme boli živými kameňmi tvojej Cirkvi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"20", "Bratia a sestry, Boh si vyvolil slabých, aby zahanbil silných. Blahoslavená Anna potvrdila tieto slová, pretože v nej nám všetkým Boh ukázal, že čisté srdce je mocnejšie ako chladná zbraň a akékoľvek násilie. S dôverou mu prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, prosíme ťa za kresťanov na Slovensku, aby svojou vierou a oddanosťou tebe boli nádejou pre Cirkev v celej Európe.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, prosíme ťa za predstaviteľov národov, aby podporovali mierové rokovania a dohody, a tak zabránili prelievaniu krvi nevinných.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, prosíme ťa za trpiacich a prenasledovaných, aby našli pravý domov, v ktorom budú žiť v pokoji a bezpečí.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, prosíme ťa za mladých ľudí, aby mali odvahu a silu brániť svoju čistotu aj za cenu veľkých obetí.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, prosíme ťa za všetky obete vojen a násilia, aby navždy prebývali s tebou v nebeskom domove, kde niet strachu ani násilia, ale iba pokoj a pravá radosť.<br>" +
                            "<font color='#B71C1C'>6.</font> Otče, prosíme ťa aj za nás samých, aby sme sa na príhovor blahoslavenej Anny Kolesárovej chránili každého hriechu, ktorý by nás odlúčil od teba.",
                    "Nebeský Otče, ďakujeme ti,<br>" +
                            "že si blahoslavenú Annu posilňoval v boji proti hriechu;<br>" +
                            "prosíme ťa, aby si na jej príhovor vypočul naše prosby<br>" +
                            "a aj nás viedol po ceste čistoty a svätosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21m", "Bratia a sestry, keď sa dnes celá Cirkev raduje zo vznešenej oslavy Božej Matky Márie, aj my sa s úprimnou radosťou modlime k všemohúcemu Bohu Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za putujúcu Cirkev: aby s vierou očakávala stretnutie s oslávenou Pannou Máriou v nebi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za tých, ktorí sa starajú o zdravie ľudí: aby s láskou a úctou ošetrovali ľudské telo, ktoré je tiež určené na vzkriesenie a oslávenie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za všetkých pracujúcich: aby poctivo zveľaďovali pozemskú vlasť a nezabúdali ani na vlasť nebeskú, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za nás všetkých: aby nás nádej na slávne vzkriesenie udržovala v horlivom kresťanskom živote, prosme Pána.",
                    "Dobrotivý Bože,<br>" +
                            "ty si pred vekmi vyvolil nepoškvrnenú Pannu<br>" +
                            "za premožiteľku nepriateľa našej spásy;<br>" +
                            "pomôž nám, aby sme pod jej ochranou<br>" +
                            "vždy zvíťazili nad hriechom<br>" +
                            "a vytrvali v milosti až do konca.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "Bratia a sestry, svätá Cecília je uctievaná ako statočná mučenica pre vieru. Oddávna ju uctievame ako patrónku cirkevného spevu a hudby. Vyprosujme si dar vyznávať vieru a chváliť Boha.",
                    "<font color='#B71C1C'>(</font>Volajme: Pôvodca sily a krásy, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, daj, aby sa v Cirkvi vo všetkých dobách podporovalo duchovné umenie.<br>" +
                            "<font color='#B71C1C'>2.</font> Vzbudzuj v kňazoch i vo veriacich zmysel pre krásu liturgického spevu.<br>" +
                            "<font color='#B71C1C'>3.</font> Daruj svetu pokoj a mier, aby najkrajšou piesňou ľudstva bola chvála Stvoriteľa.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj, aby mladí ľudia, povolaní ku kráse života, mali múdru a láskavú starostlivosť dospelých a nepodľahli vplyvu zla i nemorálnosti.<br>" +
                            "<font color='#B71C1C'>5.</font> Odmeň večnou slávou tých bratov a sestry, ktorým sa podarilo priviesť nepokrstených ľudí ku kresťanskej viere.<br>" +
                            "<font color='#B71C1C'>6.</font> Dopraj našim zomrelým <font color='#B71C1C'>(M.)</font> spievať vo večnosti Bohu chvály.",
                    "Pane Ježišu,<br>" +
                            "zosielaš nám dar umenia,<br>" +
                            "aby sme dokázali oslavovať Božiu velebnosť;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby náš život na zemi bol neprestajnou Božou chválou.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"23a", "Bratia a sestry, pri spomienke na svätého pápeža Klementa modlime sa k Pánu Ježišovi Kristovi, ktorý poveril apoštola Petra, aby posilňoval bratov vo viere, a vrúcne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, v úsilí o jednotu Cirkvi žehnaj a napĺňaj múdrosťou Ducha Svätého nášho Svätého Otca <font color='#B71C1C'>M.</font>, všetkých biskupov, kňazov a diakonov.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, veď predstaviteľov štátov v ich zodpovednom poslaní a daj, nech medzi ľudom šíria vzájomnú úctu a porozumenie.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, ujmi sa tých, ktorí sú rozhádaní, a ukáž im cestu k zmiereniu.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, povzbudzuj všetkých, ktorí sa ti osobitne zasvätili, aby modlitbami a obetami svojho života podporovali obnovu Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane Ježišu, daj, aby sme vždy hľadali to, čo je milé a prijemné Bohu a čo zodpovedá jeho svätej vôli, a pomôž nám, aby sme v súlade s tým aj žili.",
                    "Pane Ježišu,<br>" +
                            "svätý pápež Klement vydal o tebe svedectvo aj svojou krvou<br>" +
                            "a evanjelium, ktoré hlásal slovom, potvrdzoval skutkami;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a zachovaj v nás trvalú vernosť Cirkvi a jej hlave,<br>" +
                            "lebo ty si jej najvyšší a večný veľkňaz<br>" +
                            "a tebe patrí česť a sláva na veky vekov."},
            {"24", "Bratia a sestry, Cirkev vo svete neraz musela horlivo zápasiť o zakorenenie slova evanjelia. Príklad života svätého Ondreja a ďalších sto šestnástich vietnamských mučeníkov, ktorí položili život za vieru, nám ukazuje konečné Kristovo víťazstvo. Modlime sa za upevnenie svojej viery.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, pomáhaj kresťanom prenasledovaným za vieru, aby sa nebáli utrpenia ani tých, ktorí zabíjajú telo, ale radovali sa z účasti na obete nepoškvrneného Baránka.<br>" +
                            "<font color='#B71C1C'>2.</font> Zmierňuj sociálne nerovnosti medzi krajinami a daj, aby bohatšie oblasti pomáhali chudobnejším.<br>" +
                            "<font color='#B71C1C'>3.</font> Pretvor mysle diktátorov, aby mali porozumenie pre náboženské otázky a dovolili veriacim vyznávať svoju vieru.<br>" +
                            "<font color='#B71C1C'>4.</font> Urob z nás svojich priateľov, aby naši blížni spoznali, že naše svedectvo o tebe je pravdivé.<br>" +
                            "<font color='#B71C1C'>5.</font> Otvor našim zomrelým <font color='#B71C1C'>(M.)</font> nebeskú bránu, aby mohli vstúpiť do večného raja.",
                    "Pane Ježišu, tvoja Cirkev stále rastie a víťazí<br>" +
                            "aj napriek mnohým úskaliam a prekážkam;<br>" +
                            "na príhovor svätých vietnamských mučeníkov<br>" +
                            "vypočuj naše prosby<br>" +
                            "a rozmnožuj v nás nádej<br>" +
                            "na stretnutie s tebou v nebi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"25", "Bratia a sestry, Ježiš osobitne chválil panenstvo pre Božie kráľovstvo. Dnes si spomíname na svätú pannu Katarínu. Vrúcne sa modlime, aby Pán na jej orodovanie vyslyšal naše prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, Cirkev je tvojou svätou a nepoškvrnenou nevestou; daj, aby si všetci kresťania zachovali čistú a neporušenú vieru.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, žehnaj všetkých, ktorí sa ti zasvätili podľa evanjeliových rád, a pripočítaj ich medzi múdre panny.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, pouč všetkých, ktorí vedú národy, o kráse a vznešenosti čistého a mravného života.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, stoj pri všetkých, ktorí musia zápasiť o svoju čistotu.<br>" +
                            "<font color='#B71C1C'>5.</font> Pre mučenícku krv svätej panny Kataríny daruj nám neohrozenosť vo viere.",
                    "Pane Ježišu, vyslyš naše prosby<br>" +
                            "a daj, aby sme ti na orodovanie tvojej matky Márie,<br>" +
                            "Kráľovnej panien,<br>" +
                            "slúžili s čistým srdcom<br>" +
                            "a spolu so svätými pannami bedlivo ťa očakávali.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"30g", "Bratia a sestry, dnes na sviatok apoštola Ondreja modlime sa za lásku k Cirkvi a k ukrižovanému Spasiteľovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, urob z nás kresťanov nadšených svedkov tvojho evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font> Upevňuj v duchovnom bratstve všetkých veriacich a daruj nám požehnaný a pokojný adventný čas.<br>" +
                            "<font color='#B71C1C'>3.</font> Na orodovanie svätého Ondreja zjednoť vo svojej Cirkvi všetkých pokrstených.<br>" +
                            "<font color='#B71C1C'>4.</font> Odstráň z mysle ľudí myšlienky násilia a nenávisti.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj, aby otec synovi, matka dcére, brat bratovi a dieťa dieťaťu boli vodcami ku Kristovi.<br>" +
                            "<font color='#B71C1C'>6. V Košickej arcidiecéze:</font> Na príhovor svätého Ondreja, nášho patróna, ochraňuj a požehnávaj našu arcidiecézu, aby mala vždy dostatok horlivých veriacich, kňazov a rehoľníkov.",
                    "Všemohúci Otče,<br>" +
                            "láskavo vypočuj naše prosby<br>" +
                            "a daj, aby sme na orodovanie svätého apoštola Ondreja<br>" +
                            "s hlbokou vierou a láskou prežívali tieto sväté chvíle<br>" +
                            "a aby sme smelo vyznávali ukrižovaného Ježiša Krista,<br>" +
                            "ktorý s tebou žije a kraľuje na veky vekov."},
    };

    String[][] prosby12 = {
            {"03", "Bratia a sestry, modlime sa k Bohu, ktorý dáva Cirkvi svätcov, ktorí neúnavne pracujú a pokračujú v diele apoštolov.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za pápeža, biskupov, kňazov a diakonov, aby svoje úsilie a životný elán venovali službe nesmrteľným dušiam.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za tých, ktorí zložili rehoľné sľuby, aby silou vôle a svojho zasvätenia ochotne slúžili svojim blížnym.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za národy, ktorým svätý František hlásal evanjelium, aby povzbudení jeho príkladom vytrvali v pravej viere.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za misionárske povolania, aby na príhovor svätého Františka Xaverského bolo čím viac odvážnych hlásateľov Božieho slova.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za rodičov našich farností, aby svoje deti vychovávali v pravej viere, ako to sľúbili pri ich krste.<br>" +
                            "<font color='#B71C1C'>6. V Banskobystrickej diecéze:</font> Prosme za našu diecézu, aby na príhovor svätého Františka Xaverského mala vždy dostatok horlivých veriacich, kňazov a rehoľníkov.",
                    "Bože, ty si povedal apoštolom, aby išli do celého sveta<br>" +
                            "a hlásali evanjelium všetkému stvoreniu;<br>" +
                            "prijmi naše prosby a daj nám radosť z viery,<br>" +
                            "statočnosť v jej vyznávaní a horlivosť v jej šírení.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"03g", "Bratia a sestry, modlime sa k Bohu, ktorý dáva Cirkvi svätcov, ktorí neúnavne pracujú a pokračujú v diele apoštolov.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za pápeža, biskupov, kňazov a diakonov, aby svoje úsilie a životný elán venovali službe nesmrteľným dušiam.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za tých, ktorí zložili rehoľné sľuby, aby silou vôle a svojho zasvätenia ochotne slúžili svojim blížnym.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za národy, ktorým svätý František hlásal evanjelium, aby povzbudení jeho príkladom vytrvali v pravej viere.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za misionárske povolania, aby na príhovor svätého Františka Xaverského bolo čím viac odvážnych hlásateľov Božieho slova.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za rodičov našich farností, aby svoje deti vychovávali v pravej viere, ako to sľúbili pri ich krste.<br>" +
                            "<font color='#B71C1C'>6. V Banskobystrickej diecéze:</font> Prosme za našu diecézu, aby na príhovor svätého Františka Xaverského mala vždy dostatok horlivých veriacich, kňazov a rehoľníkov.",
                    "Bože, ty si povedal apoštolom, aby išli do celého sveta<br>" +
                            "a hlásali evanjelium všetkému stvoreniu;<br>" +
                            "prijmi naše prosby a daj nám radosť z viery,<br>" +
                            "statočnosť v jej vyznávaní a horlivosť v jej šírení.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"04b", "Bratia a sestry, kresťania sa oddávna utiekali k svätým, aby ich prosili o príhovor. Kresťanská tradícia a úcta k svätým zaradila svätú Barboru medzi \"pomocníkov v núdzi\". Na jej príhovor prednesme Pánovi svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Aby boli kresťania vo svete uchránení od prenasledovania a nezmyselného krviprelievania, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Aby politici náležite pamätali na ľudí, ktorých práca pre spoločnosť je spojená s nasadením vlastného života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Aby boli ťažko pracujúci dostatočne ohodnotení, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Aby rodičia neodsudzovali svoje deti, ktoré sa rozhodli pre zasvätený život, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Aby sme mali odvahu nasledovať príklad svätcov, ktorí aj napriek odmietnutiu najbližších verne žili podľa viery, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "ty povolávaš k svätosti mužov i ženy v každom čase;<br>" +
                            "prosíme ťa, vyslyš naše prosby a daj nám svoju milosť,<br>" +
                            "aby sme aj my raz patrili do spoločenstva<br>" +
                            "našich oslávených bratov a sestier.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"06", "Bratia a sestry, dnešná spomienka na svätého biskupa Mikuláša nám dáva veľkú príležitosť, aby sme si vyprosovali pre svoj život čnosti, ktorých príkladom je aj dnešný svätec. Preto pokorne prosme nášho nebeského Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, na orodovanie svätého Mikuláša udeľ Cirkvi slobodu, aby mohla plniť svoje poslanie, ktoré má od Krista.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, žehnaj úsilie nášho Svätého Otca a biskupov o zmiernenie biedy a hladu vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, bohato odmeň všetkých, ktorí prispievajú k pokojnému životu v našej krajine.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, daj nám veľkodušné srdce, aby sme pomáhali chudobným a sirotám.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, ochraňuj všetky deti našich farností pred každým zlom a nešťastím.<br>" +
                            "<font color='#B71C1C'>6.</font> Bože, naplň nás horlivosťou, aby sme sa nehanbili za svoje kresťanské poslanie.",
                    "Všemohúci Bože, vypočuj naše prosby<br>" +
                            "a na orodovanie svätého Mikuláša<br>" +
                            "vštep do našich sŕdc<br>" +
                            "pravú lásku k tebe a k našim blížnym.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"07", "Bratia a sestry, Boh privádza ľudí do svojej služby tajomnými cestami; prosme Pána, aby sme počúvali hlas milosti.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Posilňuj nášho pápeža <font color='#B71C1C'>M.</font>, nášho biskupa <font color='#B71C1C'>M.</font> a všetkých biskupov, aby verejne bránili tvoju Cirkev.<br>" +
                            "<font color='#B71C1C'>2.</font> Daruj múdrosť všetkým verejným predstaviteľom, aby vo svete zavládol pokoj a poriadok.<br>" +
                            "<font color='#B71C1C'>3.</font> Daruj hlásateľom evanjelia moc premieňať ľudské srdcia podľa tvojho Srdca.<br>" +
                            "<font color='#B71C1C'>4.</font> Žehnaj tých, ktorí svojimi dielami upevňujú vo svete mravnosť, zjavujú krásu stvorenia a vedú ľudí k tebe.<br>" +
                            "<font color='#B71C1C'>5.</font> Daj nám odvahu premáhať strach, aby sme dokázali presadzovať Božie zákony aj v našej spoločnosti.",
                    "Všemohúci Bože,<br>" +
                            "ty ochraňuješ svoju Cirkev pred bludmi a skazou;<br>" +
                            "na orodovanie svätého Ambróza<br>" +
                            "vypočuj naše pokorné prosby<br>" +
                            "a daj, aby naši duchovní pastieri, biskupi a kňazi<br>" +
                            "boli soľou zeme a svetlom sveta.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10m", "", "Bratia a sestry, dnešná spomienka nás privádza k Panne Márii ako k vyvolenej dcére nebeského Otca i našej Matke a Orodovníčke. Na jej príhovor prednesme svoje prosby milujúcemu Bohu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Nebeský Otče, veď svoju nevestu Cirkev, aby sa vo viere pokore a čistote stále viac pripodobňovala Panne Márii, ktorú vzývame ako nepoškvrnenú Matku.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože Otče, usmerňuj rozhodnutia svetových politikov, aby sa starali o najslabších a biednych ako Mária, ktorá je Matkou nádeje.<br>" +
                            "<font color='#B71C1C'>3.</font> Večný Bože, posilňuj sužovaných akýmkoľvek trápením, aby nachádzali posilu v spoločenstve veriacich, ktorí vzývajú Máriu ako Pomocnicu kresťanov.<br>" +
                            "<font color='#B71C1C'>4.</font> Milosrdný Bože, vypočuj všetkých, čo sa na pútnických miestach vo viere utiekajú o pomoc Márie, ktorú uctievame ako Pannu mocnú a dobrotivú.<br>" +
                            "<font color='#B71C1C'>5.</font> Nebeský Otče, priveď k sebe do večnej radosti tých, ktorí vo vrúcnej modlitbe oslovovali Máriu ako Útočisko hriešnikov a Bránu do neba.",
                    "Všemohúci Bože,<br>" +
                            "ty si nám dal Máriu za vzor dokonalej učeníčky<br>" +
                            "Ježiša, tvojho milovaného Syna;<br>" +
                            "na jej príhovor vypočuj naše prosby<br>" +
                            "a pomôž nám stále viac sa jej podobať.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "Bratia a sestry, na príhovor svätého pápeža Damaza prednesme s dôverou Bohu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, na príhovor svätého Damaza daj silu nášmu pápežovi <font color='#B71C1C'>M.</font>, aby múdro viedol zverenú Cirkev.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, daj, nech predstavitelia štátov vedú ľudstvo k jednote a odstraňujú nenávisť zo spoločnosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, daj, nech si kňazi tvojej Cirkvi uvedomujú, že nie oni si vyvolili Ježiša, ale Ježiš si vyvolil ich, aby slúžili všetkým, ku ktorým sú poslaní.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, daj, aby sme prijímali opustených a trpiacich a spoznávali v nich teba.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože Otče, udeľ večnú spásu našim zosnulým <font color='#B71C1C'>(M.)</font>, ktorým si bol silou i útočiskom v ich pozemskom živote.",
                    "Prosíme ťa, Bože,<br>" +
                            "vypočuj modlitby svojho ľudu,<br>" +
                            "ktorý dúfa v pomoc spoločenstva svätých<br>" +
                            "a túži ťa spolu s nimi chváliť v nebi.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"12", "Bratia a sestry, Pán Ježiš nám dal Pannu Máriu za nebeskú Matku, aby bola našou ochrankyňou a sprostredkovateľkou jeho milostí. Na jej príhovor prednesme Pánovi svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Svätého Otca, biskupov a kňazov, aby podľa príkladu nebeskej Matky zostali verní svojmu povolaniu a poslaniu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za všetok Boží ľud, aby úprimne nasledoval príklad Panny Márie v ochotnom počúvaní a uskutočňovaní Božieho slova, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za národy Latinskej Ameriky, aby sa vo všetkých svojich ťažkostiach s dôverou utiekali pod ochranu Panny Márie Guadalupskej, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za ľudí, ktorí zatiaľ nespoznali svetlo evanjelia, aby s ochotným srdcom prijali radostnú zvesť o spáse a stali sa súčasťou tajomného Kristovho tela, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za nás tu zhromaždených, aby sme podľa vzoru Panny Márie, ktorá sa modlila vo večeradle spolu s apoštolmi, vytvárali pravé bratské spoločenstvo, prosme Pána.",
                    "Pane Ježišu, prosíme ťa, vypočuj naše pokorné prosby<br>" +
                            "a láskavo daj, aby rástla naša úcta k Panne Márii,<br>" +
                            "ktorá je Matkou tých, čo dúfajú v teba.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"13", "Bratia a sestry, v temnotách nášho pozemského života nám Boh dáva jasné vzory svätosti, aby nám boli svetlom na ceste k večnému cieľu. Prosme Pána, aby sme s čistým srdcom kráčali k svetlu, ktorým je Kristus.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, žehnaj apoštolskú činnosť nášho pápeža <font color='#B71C1C'>M.</font>, podnecuj a sprevádzaj ho na jeho životnej ceste, aby bol viditeľným svetlom nádeje.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, vzbuď v srdciach predstavených Cirkvi a štátu túžbu zamilovať si poníženosť, ktorá je podmienkou vstupu do nebeského kráľovstva.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, daj nám čisté srdce, aby sme sa stránili hriechu a usilovali sa o kresťanskú dokonalosť.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, tvoja služobnica Lucia bola múdrou pannou, a keď prišiel Ženích – Kristus, našiel ju bdieť; na jej príhovor nás zachovaj v posväcujúcej milosti, aby v nás stále prebýval Duch Svätý.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, udeľ večnú spásu našim zosnulým <font color='#B71C1C'>(M.)</font>, pre ktorých si bol v ich pozemskom živote silou i útočiskom.",
                    "Dobrotivý Bože, vyslyš naše prosby<br>" +
                            "a daj, aby sme si vieru a prítomnosť Ducha Svätého v nás<br>" +
                            "vážili viac ako všetko bohatstvo sveta.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"14", "Bratia a sestry, na príhovor svätého Jána od Kríža s dôverou prednesme svoje prosby milosrdnému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, na príhovor svätého kňaza Jána od Kríža naplň darmi svojho Ducha všetkých kňazov Cirkvi.<br>" +
                            "<font color='#B71C1C'>2.</font> Vnukni všetkým kresťanom, aby po ničom netúžili tak, ako poznať a milovať tajomstvo kríža.<br>" +
                            "<font color='#B71C1C'>3.</font> Priveď tých, ktorým radosti tohto sveta zaclonili tvoju tvár, k poznaniu, že iba ty si prameňom opravdivej radosti a uspokojením všetkých našich túžob.<br>" +
                            "<font color='#B71C1C'>4.</font> Dožič chorým a hladujúcim novú životnú silu a daj im všetko, čo potrebujú pre dôstojný život.<br>" +
                            "<font color='#B71C1C'>5.</font> Obnov nás, aby sme si živšie uvedomili svoje znovuzrodenie v krste.",
                    "Bože, ty nám ukazuješ život svätých<br>" +
                            "ako príklad nasledovania tvojho Syna na ceste k spáse;<br>" +
                            "láskavo prijmi naše prosby a dožič,<br>" +
                            "aby sme svoj život oddali tebe,<br>" +
                            "a tak došli k plnému zjednoteniu s tebou vo večnosti.<br>" +
                            "O to ťa prosíme skrze Krista, nášho Pána."},
            {"17", "Bratia a sestry, už je blízko ten, ktorého predpovedali proroci. On nás všetkých túži obdarovať svojím pokojom. Preto ho vrúcne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Príď, Pane, a daruj nám svoj pokoj.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za svätú Cirkev, aby na svojej púti dejinami plnila úlohu, ktorú jej zveril Kristus.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za všetkých veriacich, aby otvárali svoje srdcia pre Božie slovo a upevňovali sa v radostnej svätosti.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za tých, ktorí spravujú národy, aby viedli ľud k väčšiemu spoločnému dobru.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za naše rodiny, aby boli pripravené prijať Krista, ktorého príchod s vierou očakávame.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás tu zhromaždených, aby sme sa otvorili milosti, ktorú nám prináša prichádzajúci Kristus.",
                    "Pane Ježišu, povzbuď nás,<br>" +
                            "aby sme ťa skrytého pod spôsobom chleba a vína<br>" +
                            "nábožne prijímali tu na zemi,<br>" +
                            "a tak si zaslúžili radosť zo stretnutia s tebou v nebi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"18", "Bratia a sestry, večné Slovo nám svojím vtelením otvorilo novú, živú cestu do nebeskej svätyne. Preto ho vrúcne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Príď, Pane, a zachráň nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Prosme za Kristovu Cirkev, aby bola verná vnuknutiam Ducha Svätého.<br>" +
                            "<font color='#B71C1C'>2.</font> Prosme za nášho pápeža <font color='#B71C1C'>M.</font>, aby bol pre všetkých veriacich oporou vo viere, nádeji a láske.<br>" +
                            "<font color='#B71C1C'>3.</font> Prosme za tých, ktorí spravujú štát, aby vždy viedli ľud k spoločnému dobru.<br>" +
                            "<font color='#B71C1C'>4.</font> Prosme za všetkých ľudí, aby spoznali, že Boh im je blízky v Ježišovi Kristovi.<br>" +
                            "<font color='#B71C1C'>5.</font> Prosme za mládež, aby sa s radosťou venovala apoštolátu a službe blížnym.<br>" +
                            "<font color='#B71C1C'>6.</font> Prosme za nás všetkých, aby sme ochotne prijímali a plnili Božiu vôľu.<br>" +
                            "<font color='#B71C1C'>7.</font> Prosme za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby naveky prežívali plnú radosť v Pánovej prítomnosti.",
                    "Pane Ježišu, vodca svojho ľudu,<br>" +
                            "príď nás vyslobodiť z moci temnôt,<br>" +
                            "aby sme kráčali vo svetle tvojich prikázaní.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"19", "Bratia a sestry, Pán preniká naše srdcia a pozná aj naše najtajnejšie túžby. Prednesme mu prosby za potreby Cirkvi a sveta.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, nech ťa tvoja Cirkev oslavuje vo všetkých národoch.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, nech cirkevní predstavení s horlivosťou svätého Jána Krstiteľa slovom i príkladom pripravujú Boží ľud na tvoj príchod.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, povzbudzuj bezdetných manželov, aby svojou láskou obdarovali siroty.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, uštedri chorým zdravie, slabým silu, pochybujúcim svetlo a smutným útechu.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, daj, aby sme ťa prijali do svojho srdca s radosťou a s hlbokou vierou.<br>" +
                            "<font color='#B71C1C'>6.</font> Pane, prijmi našich zosnulých <font color='#B71C1C'>(M.)</font> do neba, aby uvideli tvoju oslávenú tvár.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a pomôž nám povstať z našich pádov,<br>" +
                            "aby sme sa stali vernými svedkami tvojej spásy.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"20", "Bratia a sestry, Bohu nič nie je nemožné. S dôverou mu prednesme spoločné prosby za seba i za svet.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, pomáhaj svätej Cirkvi, aby bola viditeľným znamením tvojej dobroty.<br>" +
                            "<font color='#B71C1C'>2.</font> Pomáhaj biskupom, aby boli pre svojich veriacich príkladom neochvejnej dôvery v tvoju prozreteľnosť.<br>" +
                            "<font color='#B71C1C'>3.</font> Na príhovor Kráľovnej pokoja osloboď všetky národy od nenávisti a krviprelievania.<br>" +
                            "<font color='#B71C1C'>4.</font> Vysloboď nespravodlivo väznených a poteš zarmútených.<br>" +
                            "<font color='#B71C1C'>5.</font> Udeľ našim rodinám dar vzájomnej lásky, porozumenia a žičlivosti.<br>" +
                            "<font color='#B71C1C'>6.</font> Povzbudzuj nás, aby sme sa od Panny Márie učili poslušne plniť tvoju vôľu.",
                    "Dobrotivý Bože,<br>" +
                            "ty si vyvolil Pannu Máriu,<br>" +
                            "aby nám ako Ranná hviezda<br>" +
                            "zvestovala príchod Slnka spravodlivosti;<br>" +
                            "na jej orodovanie nám pomôž,<br>" +
                            "aby sme si dôstojne pripravili srdcia<br>" +
                            "na prijatie vteleného Slova.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"21", "Bratia a sestry, Boh nám zjavuje svoju večnú lásku. Pokorne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, zmiluj sa nad nami a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za svätú Cirkev, Kristovu nevestu, aby rástla v jednote a láske.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za pokoj vo svete, aby sa nenávisť premenila na lásku a túžba po pomste na odpustenie.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za chorých a hladujúcich, aby im jediný Darca života dožičil novú životnú silu a všetko, čo potrebujú pre život.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za deti, aby mohli vyrastať v rodinách naplnených láskou a vzájomným porozumením.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za nás tu zhromaždených, aby nás tento čas očakávania Vianoc zblížil s Kristom.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za našich zosnulých bratov a sestry <font color='#B71C1C'>(M.)</font>, aby ich Pán milostivo prijal medzi zástupy blažených.",
                    "Všemohúci a večný Bože,<br>" +
                            "ty chceš, aby sme pripravovali cestu tvojmu Synovi;<br>" +
                            "pomôž nám premáhať naše zlé náklonnosti,<br>" +
                            "aby sme boli hodní tvojich prisľúbení.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"22", "Bratia a sestry, spolu s Pannou Máriou velebme Boha, ktorý nám urobil veľké veci, a prosme ho.",
                    "<font color='#B71C1C'>(</font>Volajme: Otče, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, pomáhaj svojej Cirkvi, aby rástla v milosti a svetu bola znamením nádeje.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, pomáhaj kresťanom vykoreniť zo svojich sŕdc pýchu a sebectvo, a tak pripraviť cestu Kristovi.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, daj, aby svedectvo zasvätených posilnilo mladých kresťanov vo viere a v odpovedi na tvoje volanie.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, dožič všetkým počatým deťom narodiť sa v milujúcich rodinách.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, štedro odmeň všetkých, ktorí budú počas blížiacich sa sviatkov v službe pre svojich chorých bratov a sestry.<br>" +
                            "<font color='#B71C1C'>6.</font> Bože, veď nás k vďačnosti za prijaté dobrodenia.<br>" +
                            "<font color='#B71C1C'>7.</font> Bože, priveď tých, ktorí sú už vyslobodení z pút tela, k večnému životu v spoločenstve s tebou.",
                    "Všemohúci a večný Bože,<br>" +
                            "nech ti naše prosby prednesie Panna Mária,<br>" +
                            "ktorej jedinej si udelil výsadu,<br>" +
                            "že sa stala matkou tvojho Syna,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},
            {"23", "Bratia a sestry, vrúcne prosme Boha Otca, ktorý poslal svojho Syna spasiť ľudí.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, daj nám svoju spásu.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože Otče, naplň darmi Ducha Svätého nášho pápeža <font color='#B71C1C'>M.</font>, nášho biskupa <font color='#B71C1C'>M.</font> i celý zbor biskupov.<br>" +
                            "<font color='#B71C1C'>2.</font> Svedectvom života kresťanov priveď všetkých ľudí k viere v teba.<br>" +
                            "<font color='#B71C1C'>3.</font> Daj, nech vo svete zavládne pravý pokoj a nech národ nedvíha zbraň proti národu.<br>" +
                            "<font color='#B71C1C'>4.</font> Daj všetkým, ktorí budú nadchádzajúce sviatky prežívať ďaleko od svojich najbližších, aby precítili vzájomnú blízkosť v Ježišovi Kristovi.<br>" +
                            "<font color='#B71C1C'>5.</font> Chráň nás, aby sme svojím životom a skutkami nikdy nezapreli Krista, ale ho ohlasovali so živou vierou.<br>" +
                            "<font color='#B71C1C'>6.</font> Pridruž našich zosnulých <font color='#B71C1C'>(M.)</font> k zástupom blažených.",
                    "Všemohúci a milosrdný Bože,<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "nech príde tvoje kráľovstvo<br>" +
                            "a nech všetci ľudia spoznajú tvoju slávu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"24", "Bratia a sestry, Boh je verný. On nám poslal Spasiteľa narodeného z Panny Márie. Pripravme sa na jeho príchod a v modlitbe otvorme svoje srdcia.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za svätú Cirkev, aby bdela nad zvereným Božím slovom a bola vnímavá na znamenia čias.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za všetky národy, aby zvelebovali Boha za jeho dobrotu a milosrdenstvo.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za predstaviteľov verejnej správy, aby sa usilovali o rozvoj spoločného dobra.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za rodiny, aby ich slávnosť Narodenia Pána navzájom zblížila.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za mladých mužov, aby sa nebáli odpovedať na pozvanie do kňazskej služby.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme s vernosťou Panny Márie pracovali na diele našej spásy.",
                    "Bože, vyslyš naše prosby,<br>" +
                            "ktoré ti dnes predkladáme;<br>" +
                            "daj, nech náš pozemský život<br>" +
                            "pokojne plynie pod tvojou ochranou.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"24gkn", "Bratia a sestry, v tento svätý večer sa všetci zhromažďujeme okolo štedrovečerného stola, aby sme sa navzájom obdarovali láskou. Prameňom tejto lásky je Boží Syn, ktorého narodenie slávime. Preto ho s radostným srdcom prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Obdaruj nás láskou a pokojom.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, prosíme ťa za Svätého Otca <font color='#B71C1C'>M.</font>, za našich biskupov, kňazov i všetkých pokrstených, aby si uvedomili svoju zodpovednosť za Cirkev a aby v nej budovali jednotu.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane Ježišu, ty si prišiel na zem ako najväčší dar pre všetkých ľudí; otvor naše srdcia i mysle, aby sme ťa prijali ako nášho záchrancu.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane Ježišu, ty si prišiel na zem, aby všetci boli jedno; daj, aby si veriaci pri štedrovečerných stoloch navzájom odpustili a žili v láske.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane Ježišu, obdaruj svojou láskou a pokojom všetkých našich príbuzných, priateľov, známych a dobrodincov, ktorí na nás pamätajú počas týchto sviatočných dní.",
                    "Ježišu Kriste, ty si na tejto zemi zaujal posledné miesto<br>" +
                            "a dal si nám vzor vzájomnej lásky;<br>" +
                            "prosíme ťa,<br>" +
                            "prebývaj v našom <font color='#B71C1C'>(</font>farskom<font color='#B71C1C'>)</font> spoločenstve<br>" +
                            "i v našich rodinách<br>" +
                            "a zachovaj nás vo svojej láske a pokoji.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"25agkn", "Bratia a sestry, v túto svätú noc sa v našom novonarodenom Pánovi Boh skláňa k človeku. Preto mu prednesme svoje prosby s ešte väčšou dôverou.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, buď naším svetlom a životom.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Modlime sa za ľudí dobrej vôle, aby sa zo všetkých síl usilovali o pokoj a spravodlivosť vo svete.<br>" +
                            "<font color='#B71C1C'>2.</font> Modlime sa za všetkých kresťanov, aby osvietení svetlom z neba vydávali svedectvo živej viery.<br>" +
                            "<font color='#B71C1C'>3.</font> Modlime sa za matky, aby si vážili každý počatý život.<br>" +
                            "<font color='#B71C1C'>4.</font> Modlime sa za otcov, aby cítili zodpovednosť za svoje rodiny.<br>" +
                            "<font color='#B71C1C'>5.</font> Modlime sa za chudobných ľudí vo svete, aby našli primeranú pomoc a útechu.<br>" +
                            "<font color='#B71C1C'>6.</font> Modlime sa za nás tu zhromaždených, aby sme si vedeli chrániť svetlo viery a priateľstvo s Bohom.<br>" +
                            "<font color='#B71C1C'>7.</font> Modlime sa za našich zosnulých príbuzných, priateľov a dobrodincov, aby sa mohli radovať v nebi.",
                    "Ježišu Kriste, tvoj Otec a náš Boh nás tak miluje,<br>" +
                            "že ťa nám poslal za Spasiteľa sveta;<br>" +
                            "prijmi naše vďaky a vyslyš naše prosby;<br>" +
                            "obdaruj nás všetkých dobrodeniami svojich milostí,<br>" +
                            "ktoré plynú z tvojho narodenia, smrti a zmŕtvychvstania.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"25bgkn", "Bratia a sestry, aj my sme ako pastieri prišli do tohto chrámu, v ktorom sa obnovuje tajomstvo skutočnej Kristovej prítomnosti. Vďační za to, že môžeme opäť stretnúť Pána života, obráťme svoje srdcia k nebeskému Otcovi a prednesme mu svoje úprimné modlitby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, tvoj Syn zažil nehu v ľudskej rodine; daj, aby naše rodiny boli navzájom zjednotené, pevné vo viere a obetavé v dobročinnosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, tvoj Syn miloval všetkých ľudí; daj, aby sme si vážili všetkých našich bratov a sestry, aj tých, ktorých si nevšímame.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, tvoj Syn nám zjavil, že tvoja štedrá láska nás sprevádza a chráni; posilňuj nás v súženiach a starostiach života.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, tvoj Syn sa stal človekom pre tvoju lásku k ľuďom; nadchni naše srdcia za pravdu, spravodlivosť a dobro.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, tvoj Syn bránil maličkých; daj, aby naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo bolo pozorné k najmenším, ktorí majú vyrastať v prostredí pravej viery.",
                    "Otče, dôverujeme v tvoju pomoc,<br>" +
                            "pretože náš život<br>" +
                            "má u teba svoj začiatok a v tebe aj svoje zavŕšenie;<br>" +
                            "preto ti s dôverou prednášame svoje modlitby<br>" +
                            "a pokorne ťa prosíme, aby si ich vyslyšal.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"25cgkn", "Bratia a sestry, s radosťou slávime vianočné sviatky, veď narodenie nášho Pána Ježiša Krista prinieslo radosť celému svetu; preto s dôverou prosme nebeského Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, chráň nášho Svätého Otca <font color='#B71C1C'>M.</font>, biskupov a všetkých kňazov, aby boli vernými správcami tvojich tajomstiev.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, zhliadni na všetkých biednych a trpiacich, pomôž im z trápenia a poteš ich tajomstvom narodenia tvojho Syna.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, tvoj Syn je svetlo zo svetla; osvieť všetkých poblúdených a priveď ich z cesty hriechu na cestu spásy.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, vyhas v ľudských srdciach nenávisť a vlej do nich svoj pokoj a lásku.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, naplň pravou vianočnou radosťou aj srdcia tých, ktorí sú dnes osamelí, opustení a vzdialení od svojich rodín.<br>" +
                            "<font color='#B71C1C'>6.</font> Otče, tvoj Syn sa stal človekom, aby vykúpil ľudstvo z moci hriechu a smrti; daruj našim zosnulým <font color='#B71C1C'>(M.)</font> večný život.",
                    "Bože a Otče,<br>" +
                            "Dieťa v jasliach nám zjavuje tvoju dobrotu a lásku;<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "aby sme nasledovali tvojho Syna,<br>" +
                            "ktorý prijal našu ľudskú prirodzenosť.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"26g", "Bratia a sestry, v tomto Vianočnom období oslavujeme prvého mučeníka svätého Štefana, ktorý dosvedčil aj svojou vôľou, aj svojou krvou vernosť Kristovi. Prosme Boha Otca, aby sme vždy zostali verní Ježišovi Kristovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, udeľ nám svoju pomoc.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Bože, základ Cirkvi, obdaruj všetkých kresťanov svojou pomocou, aby boli vo svete vernými svedkami tvojej pravdy.<br>" +
                            "<font color='#B71C1C'>2.</font> Bože, žriedlo pokoja, ktorý svet dať nemôže, daruj znepriateleným národom vôľu zmieriť sa.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, sila trpiacich, buď s tými, ktorí trpia a znášajú protivenstvá pre Ježišovo meno.<br>" +
                            "<font color='#B71C1C'>4.</font> Bože, prameň lásky, posilňuj všetkých diakonov, aby s nadšením a ochotou vykonávali svoju službu v Cirkvi.<br>" +
                            "<font color='#B71C1C'>5.</font> Bože, darca zmierenia, zošli na naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo svojho Ducha, aby si pri jasliach nášho Spasiteľa podali ruky všetci hnevníci.<br>" +
                            "<font color='#B71C1C'>6.</font> Bože, večná odmena vyznávačov, pomáhaj zomierajúcim, aby – ako diakon Štefan – mohli s dôverou odovzdať svojho ducha do tvojich rúk.",
                    "Všemohúci Bože,<br>" +
                            "na príhovor svätého Štefana vyslyš naše modlitby<br>" +
                            "a posilňuj nás, aby sme dobrom premáhali zlo<br>" +
                            "a odpúšťali svojim vinníkom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"27g", "Bratia a sestry, Pána Ježiša sprevádzal učeník, ktorý nám v evanjeliu hovorí o Slove života. Toto Slovo, ktoré sa stalo telom, žiada aj od nás, ako od svojich učeníkov, čistotu srdca a pravdivosť života. Preto ho s dôverou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, daj nám čisté srdcia.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, ty si apoštolovi Jánovi preukázal zvláštne milosti; na jeho príhovor nám pomôž, aby sme ti boli oddaní celým srdcom.<br>" +
                            "<font color='#B71C1C'>2.</font> Pane, tvoj učeník Ján neustále hovorí o láske; otvor nám srdcia pre tvoju lásku a naplň ňou celý svet.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, aj nás si povolal za svedkov svojho evanjelia; pomôž nám, aby sme ťa dokázali ohlasovať podľa vzoru svätého Jána.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, daj, aby sa posolstvo tvojej lásky dostalo všade tam, kde je krivda, nenávisť, nepokoj a všetky ostatné zlá tohto sveta.<br>" +
                            "<font color='#B71C1C'>5.</font> Pane, naplň nás tu zhromaždených svojím pokojom, aby sme svedčili o tebe v našich rodinách, školách i na pracoviskách.",
                    "Pane Ježišu, tvoje milosrdenstvo je nekonečné;<br>" +
                            "ďakujeme ti, že si aj napriek našim slabostiam a hriechom<br>" +
                            "vždy obnovoval svoju lásku v našich srdciach.<br>" +
                            "Prosíme ťa, neopúšťaj nás,<br>" +
                            "ale na príhovor svätého apoštola Jána<br>" +
                            "naplň celý svet svojou láskou a porozumením.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"28g", "Bratia a sestry, pri príchode Ježiša Krista na svet zažili Betlehem a okolie hrôzu zo zabíjania nevinných detí. Ľudská ukrutnosť aj dnes vraždí deti často ešte pod srdcom matiek. Prosme Pána za spásu všetkých, ktorí vo svete nevinne trpia.",
                    "<font color='#B71C1C'>(</font>Volajme: Odmeň, Pane, všetkých nevinne trpiacich.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Pane, celé dejiny ľudstva sú poznačené prelievaním krvi; prosíme ťa, prijmi k sebe všetkých nevinne trpiacich a buď milostivý k všetkým vrahom, ktorí konajú pokánie.<br>" +
                            "<font color='#B71C1C'>2.</font> Obmäkči srdcia všetkých ľudí, ktorí aj dnes spôsobujú utrpenie nevinným ľuďom, a daj im ducha pokánia.<br>" +
                            "<font color='#B71C1C'>3.</font> Pane, na príhovor svätých neviniatok poteš všetkých, ktorí trpia, a odmeň aj tých, ktorí sa starajú o trpiacich.<br>" +
                            "<font color='#B71C1C'>4.</font> Pane, uzdrav naše srdcia a daj nám dostatok lásky, aby sme si navzájom nespôsobovali utrpenie.<br>" +
                            "<font color='#B71C1C'>5.</font> Prebuď svedomie matiek, ktoré chcú zničiť plod svojho života, aby nezabíjali svoje nevinné dieťa.<br>" +
                            "<font color='#B71C1C'>6.</font> Poteš rodičov, ktorí oplakávajú svoje zosnulé pokrstené dieťa, že je už medzi anjelmi a oroduje za nich v nebi.",
                    "Bože, ty si toľkokrát v dejinách<br>" +
                            "dopustil utrpenie na svoj ľud.<br>" +
                            "Nebolo to z tvojho rozmaru, ale z najväčšej lásky,<br>" +
                            "aby si nás uzdravil z našich hriechov.<br>" +
                            "Vyslyš naše prosby, pomôž nám znášať každé utrpenie<br>" +
                            "a chrániť sa toho, aby sme krivdili iným.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"29", "Bratia a sestry, Boh nám poslal svojho Syna v malom dieťati. Tým ukázal, že chce, aby jeho Syn žil na tejto zemi ako človek a naučil nás žiť bez hriechu. Zvelebujme Boha, ďakujme mu a spoločne sa modlime:",
                    "<font color='#B71C1C'>(</font>Volajme: Otče, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, Cirkev, ktorej si zveril svoje slovo, ohlasuje dielo spásy; daj, aby ho neprestajne zvestovala po celom svete.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, vo svete sa veľa hovorí o pokoji, a pritom sa vedú vojny; daj, aby si zodpovední vo svete uvedomovali, že ak chcú udržať mier, musia sami žiť v tvojom svetle.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, Panna Mária sa od Simeona dozvedela, že jej dušu prenikne meč bolesti; daj, aby tí, ktorí znášajú utrpenie, odovzdali svoje ťažkosti jej materinskému príhovoru.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, apoštol Ján vo svojom liste naznačil, že kto zachováva slovo tvojho Syna, v tom je Božia láska dokonalá; pomôž nám vytrvalo poznávať evanjelium.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, Simeon z vnuknutia Ducha prišiel do chrámu, keď priniesli Mesiáša; daj, aby sme si uvedomovali, že Kristus je prítomný aj v našom chráme.",
                    "Otče, ďakujeme ti za tvojho Syna,<br>" +
                            "ktorého si poslal na tento svet,<br>" +
                            "aby nás učil hľadať tvoju vôľu;<br>" +
                            "daj, aby sme kráčali za ním.<br>" +
                            "Lebo on je náš Spasiteľ, ktorý žije a kraľuje na veky vekov."},
            {"30", "Bratia a sestry, Cirkev slávi dni Narodenia Pána a teší sa z tohto nesmierneho daru Božej lásky. Ďakujme za tento dar, modlime sa a povzbudzujme sa navzájom.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Za Cirkev, Kristovu nevestu: aby, zbavená hriechov, bola vždy čistá a svätá v očiach svojho Ženícha, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font> Za rodiny, ktoré sú posvätené Božou láskou: aby žili v svornosti a pokoji, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font> Za mládež, ktorá je nádejou ľudstva: aby nasledovala Krista, plná múdrosti a milosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font> Za starých ľudí: aby s jasnosťou ukazovali mladším veľké hodnoty života, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font> Za tých, ktorí s vytrvalosťou prichádzajú do chrámu: aby sa ich skutky zhodovali s tým, čo veria, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font> Za vdovy a vdovcov: aby sa necítili osamelí a beznádejní, ale aby ich naplnila Kristova láska, prosme Pána.",
                    "Milosrdný Otče,<br>" +
                            "z lásky k nám si poslal na svet svojho Syna;<br>" +
                            "prosíme ťa, prijmi naše modlitby,<br>" +
                            "ochraňuj nás vo svojom otcovskom náručí<br>" +
                            "a urob aj z nás poslov radostnej zvesti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"31", "Bratia a sestry, prežívame dni Narodenia Pána a zároveň koniec občianskeho roka. Ďakujme Bohu za všetky dobrodenia a milosti, ktoré sme dostali v tomto roku a v týchto dňoch vianočných sviatkov.",
                    "<font color='#B71C1C'>(</font>Volajme: Nebeský Otče, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font> Otče, daj, aby sme pod vedením pápeža a biskupov odhodlane kráčali cestou svätosti.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, daj, nech sa národom sveta, ktoré nepoznajú Krista, čím skôr ohlasuje radostná zvesť evanjelia.<br>" +
                            "<font color='#B71C1C'>3.</font> Otče, daj, nech Kristovo svetlo, ktoré prišlo na svet, zažiari v srdciach všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, daj, nech sú všetky deti, ktoré v týchto dňoch prichádzajú na svet, zahŕňané vrúcnou rodičovskou láskou.<br>" +
                            "<font color='#B71C1C'>5.</font> Otče, daj, nech sa Slovo, ktoré sa stalo telom a prebývalo medzi nami, udomácni v srdci každého z nás.<br>" +
                            "<font color='#B71C1C'>6.</font> Otče, daj, nech všetci, ktorí majú záľubu v hriechu, spoznajú, že pravé šťastie a pokoj nájdu iba v tebe.<br>" +
                            "<font color='#B71C1C'>7.</font> Otče, daj, aby naši bratia a sestry, ktorí v tomto roku skončili svoju pozemskú púť, dosiahli večnú radosť v nebi.",
                    "Bože, Pán času a večnosti,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj nám silu vyznávať evanjelium<br>" +
                            "tvojho Syna Ježiša Krista,<br>" +
                            "ktorý žije a kraľuje na veky vekov."},

            //NA KONCI STARÉHO ROKA(v omši na poďakovanie na konci občianskeho roka)
            {"31gk", "Bratia a sestry, tento rok sa chýli ku koncu. Ďakujme Bohu, nesmrteľnému Pánovi vekov, za jeho dobrodenia a prosme ho, aby každá chvíľa nášho života patrila jemu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "Ježišu, Syn Márie Panny, žehnaj nášho Svätého Otca <font color='#B71C1C'>M.</font>, nášho biskupa <font color='#B71C1C'>M.</font> a všetkých biskupov a kňazov, aby v neporušenej viere viedli tvoj ľud po ceste spásy.<br>" +
                            "<font color='#B71C1C'>1.</font> Nebeský Otče, žehnaj a chráň svoj ľud, ktorý putuje do tvojho večného kráľovstva.<br>" +
                            "<font color='#B71C1C'>2.</font> Otče, osvecuj ľudí pracujúcich v politike a ekonomike, aby nepotláčali posolstvo evanjelia, ale napomáhali šírenie pokoja a radosti vo svete.<br>" +
                            "<font color='#B71C1C'>3.</font> Bože, pomáhaj prekonávať vo svete rozdiely medzi ľuďmi, aby už neboli rozdelenia, ktoré vyvolávajú rôzne nespravodlivosti a vojny.<br>" +
                            "<font color='#B71C1C'>4.</font> Otče, udeľ svoje požehnanie všetkým, ktorí v tomto roku prijali <font color='#B71C1C'>(</font>v našej farnosti<font color='#B71C1C'>)</font> sviatosti krstu, birmovania, Eucharistie a manželstva.<br>" +
                            "<font color='#B71C1C'>5.</font> Dobrotivý Otče, prijmi naše vďaky za všetky milosti, ktoré si nám udelil v tomto roku.<br>" +
                            "<font color='#B71C1C'>6.</font> Všemohúci Bože, zmiluj sa nad nami a odpusť nám previnenia spáchané v uplynulom roku.<br>" +
                            "<font color='#B71C1C'>7.</font> Večný Bože, prijmi do nebeského kráľovstva všetkých, ktorí v tomto roku zomreli v tvojej milosti.",
                    "Bože, ďakujeme ti za dary,<br>" +
                            "ktoré sme dostali v tomto roku;<br>" +
                            "prijmi naše prosby a pomáhaj nám,<br>" +
                            "aby sme už nestratili ani jediný deň,<br>" +
                            "ale aby sme ti stále vernejšie slúžili<br>" +
                            "a vinuli sa k tebe s čoraz väčšou láskou.<br>" +
                            "Skrze Krista, nášho Pána."},

            };
}
