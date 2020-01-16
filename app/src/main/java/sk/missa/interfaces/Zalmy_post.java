package sk.missa.interfaces;

/*
 * Responzóziové žalmy v pôstnom období uložené v dvojrozmernom poli: postZalm
 * nedeľa: {týždeň v pôstnom období+deň (napr. 2 týždeň v pondelok - 21), liturgický rok (A/B/C), "", súradnice, text},
 * deň v týždni: {týždeň v pôstnom období+deň, deň v týždni (1-pondelok, 2-utorok..., 6-sobota), "", súradnice, text},
 *
 * Alelujové verše v pôstnom období uložené v dvojrozmernom poli: postAleluja
 * nedeľa: {týždeň v pôstnom období+deň (napr. 2 týždeň v pondelok - 21), liturgický rok (A/B/C), "", súradnice, text},
 * deň v týždni: {týždeň v pôstnom období+deň, deň v týždni (1-pondelok, 2-utorok..., 6-sobota), "", súradnice, text},
 * */

public interface Zalmy_post {
    String[][] postZalm = {
            {"03", "3", "", "Ž 51, 3-4. 5-6a. 12-13. 14+17",
                    "<font color='#B71C1C'>R.:</font> Zmiluj sa, Pane, lebo sme zhrešili.<br><br>" +
                            "Zmiluj sa, Bože, nado mnou pre svoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje veľké zľutovanie znič moju neprávosť.<br>" +
                            "Úplne zmy zo mňa moju vinu <font color='#B71C1C'>*</font><br>" +
                            "a očisť ma od hriechu. <font color='#B71C1C'>– R.</font><br>" +
                            "Vedomý som si svojej neprávosti <font color='#B71C1C'>*</font><br>" +
                            "a svoj hriech mám stále pred sebou.<br>" +
                            "Proti tebe, proti tebe samému som sa prehrešil <font color='#B71C1C'>*</font><br>" +
                            "a urobil som, čo je v tvojich očiach zlé. <font color='#B71C1C'>– R.</font><br>" +
                            "Bože, stvor vo mne srdce čisté <font color='#B71C1C'>*</font><br>" +
                            "a v mojom vnútri obnov ducha pevného.<br>" +
                            "Neodvrhuj ma spred svojej tváre <font color='#B71C1C'>*</font><br>" +
                            "a neodnímaj mi svojho ducha svätého. <font color='#B71C1C'>– R.</font><br>" +
                            "Navráť mi radosť z tvojej spásy <font color='#B71C1C'>*</font><br>" +
                            "a posilni ma duchom veľkej ochoty.<br>" +
                            "Pane, otvor moje pery <font color='#B71C1C'>*</font><br>" +
                            "a moje ústa budú ohlasovať tvoju slávu. <font color='#B71C1C'>– R.</font>"},
            {"04", "4", "", "Ž 1, 1-2. 3. 4+6",
                    "<font color='#B71C1C'>R.:</font> Blažený človek, čo v Pána skladá dôveru.<br><br>" +
                            "Blažený človek, čo nekráča podľa rady bezbožných <font color='#B71C1C'>†</font><br>" +
                            "a nechodí cestou hriešnikov, <font color='#B71C1C'>*</font><br>" +
                            "ani nevysedáva v kruhu rúhačov,<br>" +
                            "ale v zákone Pánovom má záľubu <font color='#B71C1C'>*</font><br>" +
                            "a o jeho zákone rozjíma dňom i nocou. <font color='#B71C1C'>– R.</font><br>" +
                            "Je ako strom zasadený pri vode, <font color='#B71C1C'>*</font><br>" +
                            "čo prináša ovocie v pravý čas,<br>" +
                            "a jeho lístie nikdy nevädne; <font color='#B71C1C'>*</font><br>" +
                            "darí sa mu všetko, čo podniká. <font color='#B71C1C'>– R.</font><br>" +
                            "No nie tak bezbožní, veru nie; <font color='#B71C1C'>*</font><br>" +
                            "tí sú ako plevy, čo vietor ženie pred sebou.<br>" +
                            "Nad cestou spravodlivých bedlí Pán, <font color='#B71C1C'>*</font><br>" +
                            "ale cesta bezbožných vedie do záhuby. <font color='#B71C1C'>– R.</font>"},
            {"05", "5", "", "Ž 51, 3-4. 5-6a. 18-19",
                    "<font color='#B71C1C'>R.:</font> Bože, ty nepohŕdaš srdcom skrúšeným a poníženým.<br><br>" +
                            "Zmiluj sa, Bože, nado mnou pre svoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje veľké zľutovanie znič moju neprávosť.<br>" +
                            "Úplne zmy zo mňa moju vinu <font color='#B71C1C'>*</font><br>" +
                            "a očisť ma od hriechu. <font color='#B71C1C'>– R.</font><br>" +
                            "Vedomý som si svojej neprávosti <font color='#B71C1C'>*</font><br>" +
                            "a svoj hriech mám stále pred sebou.<br>" +
                            "Proti tebe, proti tebe samému som sa prehrešil <font color='#B71C1C'>*</font><br>" +
                            "a urobil som, čo je v tvojich očiach zlé. <font color='#B71C1C'>– R.</font><br>" +
                            "Veď ty nemáš záľubu v obete, <font color='#B71C1C'>*</font><br>" +
                            "ani žertvu neprijmeš odo mňa.<br>" +
                            "Obetou Bohu milou je duch skrúšený; <font color='#B71C1C'>*</font><br>" +
                            "Bože, ty nepohŕdaš srdcom skrúšeným a poníženým. <font color='#B71C1C'>– R.</font>"},
            {"06", "6", "", "Ž 86, 1-2. 3-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Ukáž mi, Pane, svoju cestu a budem kráčať v tvojej pravde.<br><br>" +
                            "Nakloň, Pane, svoj sluch a vyslyš ma, <font color='#B71C1C'>*</font><br>" +
                            "lebo som biedny a chudobný.<br>" +
                            "Ochraňuj ma, lebo som ti oddaný; <font color='#B71C1C'>*</font><br>" +
                            "zachráň, Bože, svojho sluhu, ktorý dúfa v teba. <font color='#B71C1C'>– R.</font><br>" +
                            "Zmiluj sa, Pane, nado mnou, <font color='#B71C1C'>*</font><br>" +
                            "veď k tebe volám deň čo deň.<br>" +
                            "Obveseľ, Pane, svojho sluhu, <font color='#B71C1C'>*</font><br>" +
                            "veď k tebe dvíham svoju dušu. <font color='#B71C1C'>– R.</font><br>" +
                            "Lebo ty, Pane, si dobrý a láskavý <font color='#B71C1C'>*</font><br>" +
                            "a veľmi milostivý voči všetkým, čo ťa vzývajú.<br>" +
                            "Pane, počuj moju modlitbu, <font color='#B71C1C'>*</font><br>" +
                            "všimni si hlas mojej úpenlivej prosby. <font color='#B71C1C'>– R.</font>"},
            {"10", "A", "", "Ž 51, 3-4. 5-6a. 12-13. 14+17",
                    "<font color='#B71C1C'>R.:</font> Zmiluj sa, Pane, lebo sme zhrešili.<br><br>" +
                            "Zmiluj sa, Bože, nado mnou pre svoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje veľké zľutovanie znič moju neprávosť.<br>" +
                            "Úplne zmy zo mňa moju vinu <font color='#B71C1C'>*</font><br>" +
                            "a očisť ma od hriechu. <font color='#B71C1C'>– R.</font><br>" +
                            "Vedomý som si svojej neprávosti <font color='#B71C1C'>*</font><br>" +
                            "a svoj hriech mám stále pred sebou.<br>" +
                            "Proti tebe, proti tebe samému som sa prehrešil <font color='#B71C1C'>*</font><br>" +
                            "a urobil som, čo je v tvojich očiach zlé. <font color='#B71C1C'>– R.</font><br>" +
                            "Bože, stvor vo mne srdce čisté <font color='#B71C1C'>*</font><br>" +
                            "a v mojom vnútri obnov ducha pevného.<br>" +
                            "Neodvrhuj ma spred svojej tváre <font color='#B71C1C'>*</font><br>" +
                            "a neodnímaj mi svojho ducha svätého. <font color='#B71C1C'>– R.</font><br>" +
                            "Navráť mi radosť z tvojej spásy <font color='#B71C1C'>*</font><br>" +
                            "a posilni ma duchom veľkej ochoty.<br>" +
                            "Pane, otvor moje pery <font color='#B71C1C'>*</font><br>" +
                            "a moje ústa budú ohlasovať tvoju slávu. <font color='#B71C1C'>– R.</font>"},
            {"10", "B", "", "Ž 25, 4-5b. 6+7bc. 8-9",
                    "<font color='#B71C1C'>R.:</font> Cesty Pánove sú milosrdenstvo a vernosť.<br><br>" +
                            "Ukáž mi, Pane, svoje cesty <font color='#B71C1C'>*</font><br>" +
                            "a pouč ma o svojich chodníkoch.<br>" +
                            "Veď ma vo svojej pravde a uč ma, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si Boh, moja spása. <font color='#B71C1C'>– R.</font><br>" +
                            "Rozpomeň sa, Pane, na svoje zľutovanie <font color='#B71C1C'>*</font><br>" +
                            "a na svoje milosrdenstvo, ktoré trvá od vekov.<br>" +
                            "Pamätaj na mňa vo svojom milosrdenstve <font color='#B71C1C'>*</font><br>" +
                            "veď si, Pane, dobrotivý. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán je dobrý a spravodlivý: <font color='#B71C1C'>*</font><br>" +
                            "ukazuje cestu hriešnikom.<br>" +
                            "Pokorných vedie k správnemu konaniu <font color='#B71C1C'>*</font><br>" +
                            "a tichých poúča o svojich cestách. <font color='#B71C1C'>– R.</font>"},
            {"10", "C", "", "Ž 91, 1-2. 10-11. 12-13. 14-15",
                    "<font color='#B71C1C'>R.:</font> Pane, buď so mnou v mojich skúškach.<br><br>" +
                            "Kto pod ochranou Najvyššieho prebýva <font color='#B71C1C'>*</font><br>" +
                            "a v tôni Všemohúceho sa zdržiava,<br>" +
                            "povie Pánovi: \"Ty si moje útočište <font color='#B71C1C'>*</font><br>" +
                            "a pevnosť moja; v tebe mám dôveru, Bože môj.\" <font color='#B71C1C'>– R.</font><br>" +
                            "Nestihne ťa nijaké nešťastie <font color='#B71C1C'>*</font><br>" +
                            "a k tvojmu stanu sa nepriblíži pohroma,<br>" +
                            "lebo svojim anjelom dá príkaz o tebe, <font color='#B71C1C'>*</font><br>" +
                            "aby ťa strážili na všetkých tvojich cestách. <font color='#B71C1C'>– R.</font><br>" +
                            "Na rukách ťa budú nosiť, <font color='#B71C1C'>*</font><br>" +
                            "aby si si neuderil nohu o kameň.<br>" +
                            "Budeš si kráčať po vretenici a po zmiji, <font color='#B71C1C'>*</font><br>" +
                            "leva i draka rozšliapeš. <font color='#B71C1C'>– R.</font><br>" +
                            "Pretože sa ku mne pritúlil, vyslobodím ho, <font color='#B71C1C'>*</font><br>" +
                            "ujmem sa ho, lebo pozná moje meno.<br>" +
                            "Keď ku mne zavolá, ja ho vyslyším <font color='#B71C1C'>†</font><br>" +
                            "a budem pri ňom v súžení, <font color='#B71C1C'>*</font><br>" +
                            "zachránim ho i oslávim. <font color='#B71C1C'>– R.</font>"},
            {"11", "1", "", "Ž 19, 8. 9. 10. 15",
                    "<font color='#B71C1C'>R.:</font> Tvoje slová, Pane, sú Duch a život.<br><br>" +
                            "Zákon Pánov je dokonalý, <font color='#B71C1C'>*</font><br>" +
                            "osviežuje dušu.<br>" +
                            "Svedectvo Pánovo je hodnoverné, <font color='#B71C1C'>*</font><br>" +
                            "dáva múdrosť maličkým. <font color='#B71C1C'>– R.</font><br>" +
                            "Rozhodnutia Pánove sú správne, <font color='#B71C1C'>*</font><br>" +
                            "potešujú srdce.<br>" +
                            "Prikázania Pánove sú jasné, <font color='#B71C1C'>*</font><br>" +
                            "osvecujú oči. <font color='#B71C1C'>– R.</font><br>" +
                            "Bázeň pred Pánom je úprimná, <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky.<br>" +
                            "Výroky Pánove sú pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a všetky spravodlivé. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech sa ti páčia slová mojich úst <font color='#B71C1C'>†</font><br>" +
                            "i rozjímanie môjho srdca pred tvojou tvárou. <font color='#B71C1C'>*</font><br>" +
                            "Pane, ty si moja pomoc a môj vykupiteľ. <font color='#B71C1C'>– R.</font>"},
            {"12", "2", "", "Ž 34, 4-5. 6-7. 16-17. 18-19",
                    "<font color='#B71C1C'>R.:</font> Pán vyslobodí spravodlivých zo všetkých tiesní.<br><br>" +
                            "Velebte so mnou Pána <font color='#B71C1C'>*</font><br>" +
                            "a oslavujme jeho meno spoločne.<br>" +
                            "Hľadal som Pána a on ma vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vytrhol ma zo všetkej hrôzy. <font color='#B71C1C'>– R.</font><br>" +
                            "Na neho hľaďte a budete žiariť <font color='#B71C1C'>*</font><br>" +
                            "a tvár vám nesčervenie hanbou.<br>" +
                            "Úbožiak zavolal a Pán ho vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ho zo všetkých tiesní. <font color='#B71C1C'>– R.</font><br>" +
                            "Pánove oči hľadia na spravodlivých <font color='#B71C1C'>*</font><br>" +
                            "a k ich volaniu sa nakláňa jeho sluch.<br>" +
                            "Tvár Pánova sa odvracia od tých, čo robia zlo, <font color='#B71C1C'>*</font><br>" +
                            "a vyhladzuje ich pamiatku zo zeme. <font color='#B71C1C'>– R.</font><br>" +
                            "Spravodliví volali a Pán ich vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ich zo všetkých tiesní.<br>" +
                            "Pán je pri tých, čo majú srdce skrúšené, <font color='#B71C1C'>*</font><br>" +
                            "a zachraňuje zlomených na duchu. <font color='#B71C1C'>– R.</font>"},
            {"13", "3", "", "Ž 51, 3-4. 12-13. 18-19",
                    "<font color='#B71C1C'>R.:</font> Bože, ty nepohŕdaš srdcom skrúšeným a poníženým.<br><br>" +
                            "Zmiluj sa, Bože, nado mnou pre svoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje veľké zľutovanie znič moju neprávosť.<br>" +
                            "Úplne zmy zo mňa moju vinu <font color='#B71C1C'>*</font><br>" +
                            "a očisť ma od hriechu. <font color='#B71C1C'>– R.</font><br>" +
                            "Bože, stvor vo mne srdce čisté <font color='#B71C1C'>*</font><br>" +
                            "a v mojom vnútri obnov ducha pevného.<br>" +
                            "Neodvrhuj ma spred svojej tváre <font color='#B71C1C'>*</font><br>" +
                            "a neodnímaj mi svojho ducha svätého. <font color='#B71C1C'>– R.</font><br>" +
                            "Veď ty nemáš záľubu v obete, <font color='#B71C1C'>*</font><br>" +
                            "ani žertvu neprijmeš odo mňa.<br>" +
                            "Obetou Bohu milou je duch skrúšený; <font color='#B71C1C'>*</font><br>" +
                            "Bože, ty nepohŕdaš<br>" +
                            "srdcom skrúšeným a poníženým. <font color='#B71C1C'>– R.</font>"},
            {"14", "4", "", "Ž 138, 1-2a. 2bc+3. 7c-8",
                    "<font color='#B71C1C'>R.:</font> Vyslyš ma, Pane, keď ťa budem vzývať.<br><br>" +
                            "Chcem ťa, Pane, oslavovať celým srdcom, <font color='#B71C1C'>*</font><br>" +
                            "že si vypočul slová mojich úst.<br>" +
                            "Budem ti hrať pred tvárou anjelov, <font color='#B71C1C'>*</font><br>" +
                            "vrhnem sa na tvár pred tvojím svätým chrámom. <font color='#B71C1C'>– R.</font><br>" +
                            "Tvoje meno budem oslavovať, <font color='#B71C1C'>*</font><br>" +
                            "pretože si milosrdný a verný.<br>" +
                            "Vždy si ma vyslyšal, keď som ťa vzýval, <font color='#B71C1C'>*</font><br>" +
                            "a rozmnožil si vo mne odvahu. <font color='#B71C1C'>– R.</font><br>" +
                            "Zachráni ma tvoja pravica. <font color='#B71C1C'>*</font><br>" +
                            "Pán za mňa dielo dokončí.<br>" +
                            "Pane, tvoje milosrdenstvo je večné; <font color='#B71C1C'>*</font><br>" +
                            "neopusť dielo svojich rúk. <font color='#B71C1C'>– R.</font>"},
            {"15", "5", "", "Ž 130, 1-2. 3-4. 5-6b. 6c-8",
                    "<font color='#B71C1C'>R.:</font> Pane, ty si milostivý a my ti chceme v bázni slúžiť.<br><br>" +
                            "Z hlbín volám k tebe, Pane; <font color='#B71C1C'>*</font><br>" +
                            "Pane, počuj môj hlas.<br>" +
                            "Nakloň svoj sluch <font color='#B71C1C'>*</font><br>" +
                            "k mojej úpenlivej prosbe. <font color='#B71C1C'>– R.</font><br>" +
                            "Ak si budeš, Pane, v pamäti uchovávať neprávosť, <font color='#B71C1C'>*</font><br>" +
                            "Pane, kto obstojí?<br>" +
                            "Ale ty si milostivý <font color='#B71C1C'>*</font><br>" +
                            "a my ti chceme v bázni slúžiť. <font color='#B71C1C'>– R.</font><br>" +
                            "Spolieham sa na teba, Pane, <font color='#B71C1C'>*</font><br>" +
                            "moja duša sa spolieha na tvoje slovo;<br>" +
                            "moja duša očakáva Pána <font color='#B71C1C'>*</font><br>" +
                            "väčšmi ako strážcovia dennicu. <font color='#B71C1C'>– R.</font><br>" +
                            "Väčšmi ako strážcovia dennicu <font color='#B71C1C'>*</font><br>" +
                            "nech očakáva Izrael Pána.<br>" +
                            "Lebo u Pána je milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a hojné vykúpenie.<br>" +
                            "On sám vykúpi Izraela <font color='#B71C1C'>*</font><br>" +
                            "zo všetkých jeho neprávostí. <font color='#B71C1C'>– R.</font>"},
            {"16", "6", "", "Ž 119, 1-2. 4-5. 7-8",
                    "<font color='#B71C1C'>R.:</font> Blažení tí, čo kráčajú podľa zákona Pánovho.<br><br>" +
                            "Blažení tí, čo idú cestou života bez poškvrny, <font color='#B71C1C'>*</font><br>" +
                            "čo kráčajú podľa zákona Pánovho.<br>" +
                            "Blažení tí, čo zachovávajú jeho príkazy <font color='#B71C1C'>*</font><br>" +
                            "a celým srdcom ho vyhľadávajú. <font color='#B71C1C'>– R.</font><br>" +
                            "Ty si dal príkazy, <font color='#B71C1C'>*</font><br>" +
                            "aby sa verne plnili.<br>" +
                            "Kiež by ma moje cesty viedli tak, <font color='#B71C1C'>*</font><br>" +
                            "žeby som zachovával tvoje ustanovenia. <font color='#B71C1C'>– R.</font><br>" +
                            "S úprimným srdcom ti chcem ďakovať, <font color='#B71C1C'>*</font><br>" +
                            "že som poznal tvoje spravodlivé výroky.<br>" +
                            "Tvoje ustanovenia chcem zachovať, <font color='#B71C1C'>*</font><br>" +
                            "len ty ma nikdy neopusť. <font color='#B71C1C'>– R.</font>"},
            {"20", "A", "", "Ž 33, 4-5. 18-19. 20+22",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, nech je nad nami, ako dúfame v teba.<br><br>" +
                            "Pánovo slovo je pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a verné všetko jeho konanie.<br>" +
                            "Miluje spravodlivosť a právo; <font color='#B71C1C'>*</font><br>" +
                            "milosti Pánovej plná je zem. <font color='#B71C1C'>– R.</font><br>" +
                            "Hľa, oko Pánovo bdie nad tými, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "nad tými, čo v jeho milosrdenstvo dúfajú,<br>" +
                            "aby ich zachránil pred smrťou <font color='#B71C1C'>*</font><br>" +
                            "a v čase hladu nakŕmil. <font color='#B71C1C'>– R.</font><br>" +
                            "Naša duša očakáva Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je naša pomoc a ochrana.<br>" +
                            "Tvoje milosrdenstvo, Pane, nech je nad nami, <font color='#B71C1C'>*</font><br>" +
                            "ako dúfame v teba. <font color='#B71C1C'>– R.</font>"},
            {"20", "B", "", "Ž 116, 10+15. 16-17. 18-19",
                    "<font color='#B71C1C'>R.:</font> Pred tvárou Pána budem kráčať v krajine žijúcich.<br><br>" +
                            "Dôveroval som, aj keď som povedal: <font color='#B71C1C'>*</font><br>" +
                            "\"Som veľmi pokorený.\"<br>" +
                            "V Pánových očiach má veľkú cenu <font color='#B71C1C'>*</font><br>" +
                            "smrť jeho svätých. <font color='#B71C1C'>– R.</font><br>" +
                            "Pane, som tvoj sluha, <font color='#B71C1C'>*</font><br>" +
                            "som tvoj sluha a syn tvojej služobnice.<br>" +
                            "Ty si mi putá rozviazal: <font color='#B71C1C'>†</font><br>" +
                            "obetu chvály ti prinesiem <font color='#B71C1C'>*</font><br>" +
                            "a budem vzývať meno Pánovo. <font color='#B71C1C'>– R.</font><br>" +
                            "Splním svoje sľuby Pánovi <font color='#B71C1C'>*</font><br>" +
                            "pred všetkým jeho ľudom<br>" +
                            "v nádvoriach domu Pánovho, <font color='#B71C1C'>*</font><br>" +
                            "uprostred teba, Jeruzalem. <font color='#B71C1C'>– R.</font>"},
            {"20", "C", "", "Ž 27, 1. 7-8. 9a-c. 13-14",
                    "<font color='#B71C1C'>R.:</font> Pán je moje svetlo a moja spása.<br><br>" +
                            "Pán je moje svetlo a moja spása,<font color='#B71C1C'>*</font><br>" +
                            "koho sa mám báť?<br>" +
                            "Pán je ochranca môjho života, <font color='#B71C1C'>*</font><br>" +
                            "pred kým sa mám strachovať? <font color='#B71C1C'>– R.</font><br>" +
                            "Čuj, Pane, hlas môjho volania, <font color='#B71C1C'>*</font><br>" +
                            "zľutuj sa nado mnou a vyslyš ma.<br>" +
                            "V srdci mi znejú tvoje slová: <font color='#B71C1C'>†</font><br>" +
                            "\"Hľadajte moju tvár!\" <font color='#B71C1C'>*</font><br>" +
                            "Pane, ja hľadám tvoju tvár. <font color='#B71C1C'>– R.</font><br>" +
                            "Neodvracaj svoju tvár odo mňa, <font color='#B71C1C'>†</font><br>" +
                            "neodkláňaj sa v hneve od svojho služobníka. <font color='#B71C1C'>*</font><br>" +
                            "Ty si moja pomoc, neodvrhuj ma. <font color='#B71C1C'>– R.</font><br>" +
                            "Verím, že uvidím dobrodenia Pánove <font color='#B71C1C'>*</font><br>" +
                            "v krajine žijúcich.<br>" +
                            "Očakávaj Pána a buď statočný; <font color='#B71C1C'>*</font><br>" +
                            "srdce maj silné a drž sa Pána. <font color='#B71C1C'>– R.</font>"},
            {"21", "1", "", "Ž 79, 8. 9. 11. 13",
                    "<font color='#B71C1C'>R.:</font> Pane, nezaobchádzaj s nami podľa našich hriechov.<br><br>" +
                            "Zabudni na hriechy našich otcov; <font color='#B71C1C'>†</font><br>" +
                            "príď nám čím skôr v ústrety so svojím milosrdenstvom, <font color='#B71C1C'>*</font><br>" +
                            "lebo sme veľmi úbohí. <font color='#B71C1C'>– R.</font><br>" +
                            "Pre slávu svojho mena nám pomôž, Bože, naša spása, <font color='#B71C1C'>†</font><br>" +
                            "a vysloboď nás; <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje meno odpusť nám hriechy. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech dôjde k tebe nárek zajatých; <font color='#B71C1C'>†</font><br>" +
                            "silou svojho ramena <font color='#B71C1C'>*</font><br>" +
                            "zachovaj synov smrti nažive. <font color='#B71C1C'>– R.</font><br>" +
                            "Ale my, tvoj ľud a ovce tvojej pastviny, <font color='#B71C1C'>*</font><br>" +
                            "chceme ťa zvelebovať naveky<br>" +
                            "a z pokolenia na pokolenie <font color='#B71C1C'>*</font><br>" +
                            "hlásať tvoju slávu. <font color='#B71C1C'>– R.</font>"},
            {"22", "2", "", "Ž 50, 8-9. 16b-17. 21ab+23",
                    "<font color='#B71C1C'>R.:</font> Kto kráča bez úhony, tomu ukážem Božiu spásu.<br><br>" +
                            "Neobviňujem ťa pre tvoje obety, <font color='#B71C1C'>*</font><br>" +
                            "veď tvoje žertvy stále sú predo mnou.<br>" +
                            "Viac z tvojho domu býčky neprijmem <font color='#B71C1C'>*</font><br>" +
                            "ani capov z tvojich čried. <font color='#B71C1C'>– R.</font><br>" +
                            "\"Prečo odriekaš moje príkazy <font color='#B71C1C'>*</font><br>" +
                            "a moju zmluvu v ústach omieľaš?<br>" +
                            "Veď ty nenávidíš poriadok <font color='#B71C1C'>*</font><br>" +
                            "a moje slovo odmietaš. <font color='#B71C1C'>– R.</font><br>" +
                            "Toto páchaš, a ja by som mal mlčať? <font color='#B71C1C'>*</font><br>" +
                            "Myslíš si, že ja som ako ty?<br>" +
                            "Kto prináša obetu chvály, ten ma ctí; <font color='#B71C1C'>*</font><br>" +
                            "a kto kráča bez úhony, tomu ukážem Božiu spásu.\" <font color='#B71C1C'>– R.</font>"},
            {"23", "3", "", "Ž 31, 5-6. 14. 15-16",
                    "<font color='#B71C1C'>R.:</font> Zachráň ma, Pane, vo svojom milosrdenstve.<br><br>" +
                            "Vyvedieš ma z osídla, čo mi nastrojili, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si moja sila.<br>" +
                            "Do tvojich rúk porúčam svojho ducha; <font color='#B71C1C'>*</font><br>" +
                            "ty si ma vykúpil, Pane, Bože verný. <font color='#B71C1C'>– R.</font><br>" +
                            "Veru čujem, ako ma mnohí hania: <font color='#B71C1C'>*</font><br>" +
                            "hrôza zo všetkých strán.<br>" +
                            "Spolčujú sa proti mne a radia sa o tom, <font color='#B71C1C'>*</font><br>" +
                            "ako ma zabiť. <font color='#B71C1C'>– R.</font><br>" +
                            "Ja sa však spolieham na teba, Pane, <font color='#B71C1C'>†</font><br>" +
                            "a hovorím: \"Ty si môj Boh, <font color='#B71C1C'>*</font><br>" +
                            "v tvojich rukách je môj osud.\"<br>" +
                            "Vytrhni ma z rúk mojich nepriateľov <font color='#B71C1C'>*</font><br>" +
                            "a prenasledovateľov. <font color='#B71C1C'>– R.</font>"},
            {"24", "4", "", "Ž 1, 1-2. 3. 4+6",
                    "<font color='#B71C1C'>R.:</font> Blažený človek, čo v Pána skladá dôveru.<br><br>" +
                            "Blažený človek, čo nekráča podľa rady bezbožných <font color='#B71C1C'>†</font><br>" +
                            "a nechodí cestou hriešnikov, <font color='#B71C1C'>*</font><br>" +
                            "ani nevysedáva v kruhu rúhačov,<br>" +
                            "ale v zákone Pánovom má záľubu <font color='#B71C1C'>*</font><br>" +
                            "a o jeho zákone rozjíma dňom i nocou. <font color='#B71C1C'>– R.</font><br>" +
                            "Je ako strom zasadený pri vode, <font color='#B71C1C'>*</font><br>" +
                            "čo prináša ovocie v pravý čas,<br>" +
                            "a jeho lístie nikdy nevädne; <font color='#B71C1C'>*</font><br>" +
                            "darí sa mu všetko, čo podniká. <font color='#B71C1C'>– R.</font><br>" +
                            "No nie tak bezbožní, veru nie; <font color='#B71C1C'>*</font><br>" +
                            "tí sú ako plevy, čo vietor ženie pred sebou.<br>" +
                            "Nad cestou spravodlivých bedlí Pán, <font color='#B71C1C'>*</font><br>" +
                            "ale cesta bezbožných vedie do záhuby. <font color='#B71C1C'>– R.</font>"},
            {"25", "5", "", "Ž 105, 16-17. 18-19. 20-21",
                    "<font color='#B71C1C'>R.:</font> Pamätáme, Pane, na divy, čo si učinil.<br><br>" +
                            "Hlad privolal na krajinu <font color='#B71C1C'>*</font><br>" +
                            "a poničil všetku zásobu chleba.<br>" +
                            "Pred nimi poslal muža, <font color='#B71C1C'>*</font><br>" +
                            "Jozefa, ktorého predali za otroka. <font color='#B71C1C'>– R.</font><br>" +
                            "Putami jeho nohy zovreli <font color='#B71C1C'>*</font><br>" +
                            "a jeho šiju železom;<br>" +
                            "no potom došlo na jeho slová, <font color='#B71C1C'>*</font><br>" +
                            "Pán dokázal jeho nevinnosť. <font color='#B71C1C'>– R.</font><br>" +
                            "Vyslobodil ho posol kráľovský, <font color='#B71C1C'>*</font><br>" +
                            "prepustil ho vládca národov;<br>" +
                            "ustanovil ho za Pána svojho domu <font color='#B71C1C'>*</font><br>" +
                            "a za správcu všetkého svojho majetku. <font color='#B71C1C'>– R.</font>"},
            {"26", "6", "", "Ž 103, 1-2. 3-4. 9-10. 11-12",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia. <font color='#B71C1C'>– R.</font><br>" +
                            "Veď on ti odpúšťa všetky neprávosti, <font color='#B71C1C'>*</font><br>" +
                            "on lieči všetky tvoje neduhy;<br>" +
                            "on vykupuje tvoj život zo záhuby, <font color='#B71C1C'>*</font><br>" +
                            "on ťa venčí milosrdenstvom a milosťou. <font color='#B71C1C'>– R.</font><br>" +
                            "Nevyčíta nám ustavične naše chyby, <font color='#B71C1C'>*</font><br>" +
                            "ani sa nehnevá naveky.<br>" +
                            "Nezaobchodí s nami podľa našich hriechov, <font color='#B71C1C'>*</font><br>" +
                            "ani nám neodpláca podľa našich neprávostí. <font color='#B71C1C'>– R.</font><br>" +
                            "Lebo ako vysoko je nebo od zeme, <font color='#B71C1C'>*</font><br>" +
                            "také veľké je jeho zľutovanie voči tým, čo sa ho boja.<br>" +
                            "Ako je vzdialený východ od západu, <font color='#B71C1C'>*</font><br>" +
                            "tak vzďaľuje od nás našu neprávosť. <font color='#B71C1C'>– R.</font>"},
            {"30", "A", "", "Ž 95, 1-2. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pane, daj, aby sme počúvali tvoj hlas a nezatvrdzovali si srdcia.<br><br>" +
                            "Poďte, plesajme v Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "oslavujme Boha, našu spásu.<br>" +
                            "Predstúpme s chválospevmi pred jeho tvár <font color='#B71C1C'>*</font><br>" +
                            "a oslavujme ho žalmami. <font color='#B71C1C'>– R.</font><br>" +
                            "Poďte, klaňajme sa a na zem padnime, <font color='#B71C1C'>*</font><br>" +
                            "kľaknime na kolená pred Pánom, ktorý nás stvoril.<br>" +
                            "Lebo on je náš Boh <font color='#B71C1C'>†</font><br>" +
                            "a my sme ľud jeho pastviny <font color='#B71C1C'>*</font><br>" +
                            "a ovce, ktoré vedie svojou rukou. <font color='#B71C1C'>– R.</font><br>" +
                            "Čujte dnes jeho hlas: <font color='#B71C1C'>*</font><br>" +
                            "\"Nezatvrdzujte svoje srdcia<br>" +
                            "ako v Meríbe, ako v dňoch Massy na púšti, <font color='#B71C1C'>†</font><br>" +
                            "kde ma pokúšali vaši otcovia; <font color='#B71C1C'>*</font><br>" +
                            "skúšali ma, hoci moje skutky videli.\" <font color='#B71C1C'>– R.</font>"},
            {"30", "B", "", "Ž 19, 8. 9. 10. 11",
                    "<font color='#B71C1C'>R.:</font> Pane, ty máš slová večného života.<br><br>" +
                            "Zákon Pánov je dokonalý, <font color='#B71C1C'>*</font><br>" +
                            "osviežuje dušu.<br>" +
                            "Svedectvo Pánovo je hodnoverné, <font color='#B71C1C'>*</font><br>" +
                            "dáva múdrosť maličkým. <font color='#B71C1C'>– R.</font><br>" +
                            "Rozhodnutia Pánove sú správne, <font color='#B71C1C'>*</font><br>" +
                            "potešujú srdce.<br>" +
                            "Prikázania Pánove sú jasné, <font color='#B71C1C'>*</font><br>" +
                            "osvecujú oči. <font color='#B71C1C'>– R.</font><br>" +
                            "Bázeň pred Pánom je úprimná, <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky.<br>" +
                            "Výroky Pánove sú pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a všetky spravodlivé. <font color='#B71C1C'>– R.</font><br>" +
                            "Vzácnejšie sú než zlato, <font color='#B71C1C'>*</font><br>" +
                            "než veľký drahokam,<br>" +
                            "sladšie sú než med, <font color='#B71C1C'>*</font><br>" +
                            "než medové kvapky z plástu. <font color='#B71C1C'>– R.</font>"},
            {"30", "C", "", "Ž 103, 1-2. 3-4. 6-7. 8+11",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia. <font color='#B71C1C'>– R.</font><br>" +
                            "Veď on ti odpúšťa všetky neprávosti, <font color='#B71C1C'>*</font><br>" +
                            "on lieči všetky tvoje neduhy;<br>" +
                            "on vykupuje tvoj život zo záhuby, <font color='#B71C1C'>*</font><br>" +
                            "on ťa venčí milosrdenstvom a milosťou. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán koná spravodlivo <font color='#B71C1C'>*</font><br>" +
                            "a prisudzuje právo všetkým utláčaným.<br>" +
                            "Mojžišovi zjavil svoje cesty <font color='#B71C1C'>*</font><br>" +
                            "a synom Izraela svoje skutky. <font color='#B71C1C'>– R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a dobrotivý nesmierne.<br>" +
                            "Lebo ako vysoko je nebo od zeme, <font color='#B71C1C'>*</font><br>" +
                            "také veľké je jeho zľutovanie voči tým, čo sa ho boja. <font color='#B71C1C'>– R.</font>"},
            {"31", "1", "", "Ž 42, 2. 3; 43, 3. 4",
                    "<font color='#B71C1C'>R.:</font> Po Bohu žízni moja duša, po Bohu živom.<br><br>" +
                            "Ako jeleň dychtí za vodou z prameňa, <font color='#B71C1C'>*</font><br>" +
                            "tak moja duša, Bože, túži za tebou. <font color='#B71C1C'>– R.</font><br>" +
                            "Po Bohu žízni moja duša, po Bohu živom; <font color='#B71C1C'>*</font><br>" +
                            "kedyže už prídem k nemu a uzriem Božiu tvár? <font color='#B71C1C'>– R.</font><br>" +
                            "Zošli svoje svetlo a svoju pravdu; <font color='#B71C1C'>†</font><br>" +
                            "ony nech ma sprevádzajú <font color='#B71C1C'>*</font><br>" +
                            "a privedú na tvoj svätý vrch a do tvojich stánkov. <font color='#B71C1C'>– R.</font><br>" +
                            "I pristúpim k Božiemu oltáru, <font color='#B71C1C'>†</font><br>" +
                            "k Bohu, ktorý ma napĺňa radosťou i plesaním, <font color='#B71C1C'>*</font><br>" +
                            "a citarou ťa, Bože, môj Bože, zvelebím. <font color='#B71C1C'>– R.</font>"},
            {"32", "2", "", "Ž 25, 4-5b. 6+7bc. 8-9",
                    "<font color='#B71C1C'>R.:</font> Rozpomeň sa, Pane, na svoje zľutovanie.<br><br>" +
                            "Ukáž mi, Pane, svoje cesty <font color='#B71C1C'>*</font><br>" +
                            "a pouč ma o svojich chodníkoch.<br>" +
                            "Veď ma vo svojej pravde a uč ma, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si Boh, moja spása. <font color='#B71C1C'>– R.</font><br>" +
                            "Rozpomeň sa, Pane, na svoje zľutovanie <font color='#B71C1C'>*</font><br>" +
                            "a na svoje milosrdenstvo, ktoré trvá od vekov.<br>" +
                            "Pamätaj na mňa vo svojom milosrdenstve <font color='#B71C1C'>*</font><br>" +
                            "veď si, Pane, dobrotivý. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán je dobrý a spravodlivý: <font color='#B71C1C'>*</font><br>" +
                            "ukazuje cestu hriešnikom.<br>" +
                            "Pokorných vedie k správnemu konaniu <font color='#B71C1C'>*</font><br>" +
                            "a tichých poúča o svojich cestách. <font color='#B71C1C'>– R.</font>"},
            {"33", "3", "", "Ž 147, 12-13. 15-16. 19-20",
                    "<font color='#B71C1C'>R.:</font> Chváľ, Jeruzalem, Pána, oslavuj, Sion, svojho Boha.<br><br>" +
                            "Chváľ, Jeruzalem, Pána, <font color='#B71C1C'>*</font><br>" +
                            "oslavuj, Sion, svojho Boha.<br>" +
                            "Lebo upevnil závory tvojich brán <font color='#B71C1C'>*</font><br>" +
                            "a požehnal tvojich synov v tebe. <font color='#B71C1C'>– R.</font><br>" +
                            "Svoj rozkaz na zem zosiela, <font color='#B71C1C'>*</font><br>" +
                            "rýchlo sa šíri jeho slovo.<br>" +
                            "Sneh dáva ako vlnu, <font color='#B71C1C'>*</font><br>" +
                            "rozsýpa srieň ako popol. <font color='#B71C1C'>– R.</font><br>" +
                            "On svoje slovo zvestuje Jakubovi, <font color='#B71C1C'>*</font><br>" +
                            "svoje zákony a prikázania Izraelovi.<br>" +
                            "Neurobil tak iným národom, <font color='#B71C1C'>*</font><br>" +
                            "nezjavil im svoje zámery. <font color='#B71C1C'>– R.</font>"},
            {"34", "4", "", "Ž 95, 1-2. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pane, daj, aby sme počúvali tvoj hlas a nezatvrdzovali si srdcia.<br><br>" +
                            "Poďte, plesajme v Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "oslavujme Boha, našu spásu.<br>" +
                            "Predstúpme s chválospevmi pred jeho tvár <font color='#B71C1C'>*</font><br>" +
                            "a oslavujme ho žalmami. <font color='#B71C1C'>– R.</font><br>" +
                            "Poďte, klaňajme sa a na zem padnime, <font color='#B71C1C'>*</font><br>" +
                            "kľaknime na kolená pred Pánom, ktorý nás stvoril.<br>" +
                            "Lebo on je náš Boh <font color='#B71C1C'>†</font><br>" +
                            "a my sme ľud jeho pastviny <font color='#B71C1C'>*</font><br>" +
                            "a ovce, ktoré vedie svojou rukou. <font color='#B71C1C'>– R.</font><br>" +
                            "Čujte dnes jeho hlas: <font color='#B71C1C'>*</font><br>" +
                            "\"Nezatvrdzujte svoje srdcia<br>" +
                            "ako v Meríbe, ako v dňoch Massy na púšti, <font color='#B71C1C'>†</font><br>" +
                            "kde ma pokúšali vaši otcovia; <font color='#B71C1C'>*</font><br>" +
                            "skúšali ma, hoci moje skutky videli.\" <font color='#B71C1C'>– R.</font>"},
            {"35", "5", "", "Ž 81, 6c-8a. 8b-9. 10-11b. 14+17",
                    "<font color='#B71C1C'>R.:</font> Pane, ty máš slová večného života.<br><br>" +
                            "Počul som reč mne neznámu: <font color='#B71C1C'>*</font><br>" +
                            "\"Z jeho pliec som sňal bremeno<br>" +
                            "a z jeho rúk ťažký kôš. <font color='#B71C1C'>*</font><br>" +
                            "V súžení si ma vzýval a vyslobodil som ťa, <font color='#B71C1C'>– R.</font><br>" +
                            "za clonou búrky som ťa vypočul, <font color='#B71C1C'>*</font><br>" +
                            "vyskúšal som ťa pri vodách meríbskych.<br>" +
                            "Počúvaj, ľud môj, svedčím proti tebe, <font color='#B71C1C'>*</font><br>" +
                            "kiež by si ma poslúchol, Izrael. <font color='#B71C1C'>– R.</font><br>" +
                            "Nebudeš mať iného boha, <font color='#B71C1C'>*</font><br>" +
                            "ani sa nebudeš klaňať bohu cudziemu.<br>" +
                            "Veď ja som Pán, tvoj Boh, <font color='#B71C1C'>*</font><br>" +
                            "ja som ťa vyviedol z egyptskej krajiny. <font color='#B71C1C'>– R.</font><br>" +
                            "Keby ma môj ľud bol poslúchol, <font color='#B71C1C'>*</font><br>" +
                            "keby bol Izrael kráčal mojimi cestami,<br>" +
                            "kŕmil by som ho jadrom pšeničným <font color='#B71C1C'>*</font><br>" +
                            "a sýtil medom zo skaly.\" <font color='#B71C1C'>– R.</font>"},
            {"36", "6", "", "Ž 51, 3-4. 18-19. 20-21a",
                    "<font color='#B71C1C'>R.:</font> Bože, ty máš záľubu v srdci úprimnom.<br><br>" +
                            "Zmiluj sa, Bože, nado mnou pre svoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje veľké zľutovanie znič moju neprávosť.<br>" +
                            "Úplne zmy zo mňa moju vinu <font color='#B71C1C'>*</font><br>" +
                            "a očisť ma od hriechu. <font color='#B71C1C'>– R.</font><br>" +
                            "Veď ty nemáš záľubu v obete, <font color='#B71C1C'>*</font><br>" +
                            "ani žertvu neprijmeš odo mňa.<br>" +
                            "Obetou Bohu milou je duch skrúšený; <font color='#B71C1C'>*</font><br>" +
                            "Bože, ty nepohŕdaš srdcom skrúšeným a poníženým. <font color='#B71C1C'>– R.</font><br>" +
                            "Buď dobrotivý, Pane, a milosrdný voči Sionu, <font color='#B71C1C'>*</font><br>" +
                            "vybuduj múry Jeruzalema.<br>" +
                            "Potom prijmeš náležité obety, <font color='#B71C1C'>*</font><br>" +
                            "obetné dary a žertvy. <font color='#B71C1C'>– R.</font>"},
            {"40", "A", "", "Ž 23, 1-3a. 3b-4. 5. 6",
                    "<font color='#B71C1C'>R.:</font> Pán je môj pastier, nič mi nechýba.<br><br>" +
                            "Pán je môj pastier, nič mi nechýba: <font color='#B71C1C'>*</font><br>" +
                            "pasie ma na zelených pašienkach.<br>" +
                            "Vodí ma k tichým vodám, <font color='#B71C1C'>*</font><br>" +
                            "dušu mi osviežuje. <font color='#B71C1C'>– R.</font><br>" +
                            "Vodí ma po správnych chodníkoch, <font color='#B71C1C'>*</font><br>" +
                            "verný svojmu menu.<br>" +
                            "I keby som mal ísť tmavou dolinou, <font color='#B71C1C'>†</font><br>" +
                            "nebudem sa báť zlého, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si so mnou.<br>" +
                            "Tvoj prút a tvoja palica, <font color='#B71C1C'>*</font><br>" +
                            "tie sú mi útechou. <font color='#B71C1C'>– R.</font><br>" +
                            "Prestieraš mi stôl <font color='#B71C1C'>*</font><br>" +
                            "pred očami mojich protivníkov.<br>" +
                            "Leješ mi olej na hlavu <font color='#B71C1C'>*</font><br>" +
                            "a kalich mi napĺňaš až po okraj. <font color='#B71C1C'>– R.</font><br>" +
                            "Dobrota a milosť budú ma sprevádzať <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni môjho života.<br>" +
                            "A budem bývať v dome Pánovom <font color='#B71C1C'>*</font><br>" +
                            "mnoho a mnoho dní. <font color='#B71C1C'>– R.</font>"},
            {"40", "B", "", "Ž 137, 1-2. 3. 4-5. 6",
                    "<font color='#B71C1C'>R.:</font> Pane, chcem stále pamätať na teba.<br><br>" +
                            "Na brehu babylonských riek, tam sme sedávali a plakali, <font color='#B71C1C'>*</font><br>" +
                            "keď sme si spomínali na Sion.<br>" +
                            "Na vŕby tejto krajiny <font color='#B71C1C'>*</font><br>" +
                            "vešali sme svoje citary. <font color='#B71C1C'>– R.</font><br>" +
                            "Lebo tí, čo nás zajali, <font color='#B71C1C'>*</font><br>" +
                            "žiadali od nás spevy<br>" +
                            "a tí, čo nás trápili, žiadali veselosť: <font color='#B71C1C'>*</font><br>" +
                            "\"Zaspievajte nám nejaké piesne sionské!\" <font color='#B71C1C'>– R.</font><br>" +
                            "Akože môžeme spievať pieseň Pánovu <font color='#B71C1C'>*</font><br>" +
                            "v cudzej krajine?<br>" +
                            "Keby som, Jeruzalem, zabudol na teba, <font color='#B71C1C'>*</font><br>" +
                            "nech mi odumrie pravica. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech sa mi prilepí jazyk na podnebie, <font color='#B71C1C'>*</font><br>" +
                            "keby som nepamätal na teba,<br>" +
                            "keby som Jeruzalem nepovýšil <font color='#B71C1C'>*</font><br>" +
                            "za vrchol svojej radosti. <font color='#B71C1C'>– R.</font>"},
            {"40", "C", "", "Ž 34, 2-3. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Skúste a presvedčte sa, aký dobrý je Pán.<br><br>" +
                            "Pána chcem velebiť v každom čase, <font color='#B71C1C'>*</font><br>" +
                            "moje ústa budú ho vždy chváliť.<br>" +
                            "V Pánovi sa bude chváliť moja duša; <font color='#B71C1C'>*</font><br>" +
                            "nechže to počujú pokorní a nech sa tešia. <font color='#B71C1C'>– R.</font><br>" +
                            "Velebte so mnou Pána <font color='#B71C1C'>*</font><br>" +
                            "a oslavujme jeho meno spoločne.<br>" +
                            "Hľadal som Pána a on ma vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vytrhol ma zo všetkej hrôzy. <font color='#B71C1C'>– R.</font><br>" +
                            "Na neho hľaďte a budete žiariť <font color='#B71C1C'>*</font><br>" +
                            "a tvár vám nesčervenie hanbou.<br>" +
                            "Úbožiak zavolal a Pán ho vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ho zo všetkých tiesní. <font color='#B71C1C'>– R.</font>"},
            {"41", "1", "", "Ž 30, 2+4. 5-6. 11-12a+13b",
                    "<font color='#B71C1C'>R.:</font> Budem ťa, Pane, oslavovať, že si ma vyslobodil.<br><br>" +
                            "Budem ťa, Pane, oslavovať, že si ma vyslobodil <font color='#B71C1C'>*</font><br>" +
                            "a že si nedovolil, aby sa moji nepriatelia radovali nado mnou.<br>" +
                            "Pane, vyviedol si ma z ríše zosnulých, <font color='#B71C1C'>*</font><br>" +
                            "navrátil si mi život, aby som nezostúpil do hrobu. <font color='#B71C1C'>– R.</font><br>" +
                            "Na harfe hrajte Pánovi, jeho svätí, <font color='#B71C1C'>*</font><br>" +
                            "vzdávajte vďaky jeho menu svätému.<br>" +
                            "Lebo len chvíľku trvá jeho hnev, <font color='#B71C1C'>*</font><br>" +
                            "ale celý život jeho láskavosť.<br>" +
                            "Podvečer je nám hosťom plač <font color='#B71C1C'>*</font><br>" +
                            "a radosť nad ránom. <font color='#B71C1C'>– R.</font><br>" +
                            "Čuj, Pane a zmiluj sa nado mnou; <font color='#B71C1C'>*</font><br>" +
                            "Pane, buď mi na pomoci.<br>" +
                            "Môj nárek si obrátil na tanec; <font color='#B71C1C'>*</font><br>" +
                            "Pane, Bože môj, naveky ťa chcem velebiť. <font color='#B71C1C'>– R.</font>"},
            {"42", "2", "", "Ž 46, 2-3. 5-6. 8-9b",
                    "<font color='#B71C1C'>R.:</font> S nami je Pán zástupov, našim útočišťom je Pán, náš Boh.<br><br>" +
                            "Boh je naše útočište a sila <font color='#B71C1C'>*</font><br>" +
                            "aj najistejšia pomoc v súžení.<br>" +
                            "Preto sa nebojíme, hoci by sa chvela zem <font color='#B71C1C'>*</font><br>" +
                            "a vrchy na dno morské padali. <font color='#B71C1C'>– R.</font><br>" +
                            "Riečne ramená obveseľujú Božie mesto, <font color='#B71C1C'>*</font><br>" +
                            "posvätný stánok Najvyššieho.<br>" +
                            "Nezachveje sa, veď Boh je v jeho strede; <font color='#B71C1C'>*</font><br>" +
                            "už od úsvitu mu Boh pomáha. <font color='#B71C1C'>– R.</font><br>" +
                            "S nami je Pán zástupov, <font color='#B71C1C'>*</font><br>" +
                            "naším útočišťom je Boh Jakubov.<br>" +
                            "Poďte a pozrite na diela Pánove, <font color='#B71C1C'>*</font><br>" +
                            "aké úžasné veci vykonal na zemi. <font color='#B71C1C'>– R.</font>"},
            {"43", "3", "", "Ž 145, 8-9. 13c-14. 17-18",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a veľmi láskavý.<br>" +
                            "Dobrý je Pán ku každému <font color='#B71C1C'>*</font><br>" +
                            "a milostivý ku všetkým svojim stvoreniam. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán je vo všetkých svojich slovách pravdivý <font color='#B71C1C'>*</font><br>" +
                            "a svätý vo všetkých svojich skutkoch.<br>" +
                            "Pán podopiera všetkých, čo klesajú, <font color='#B71C1C'>*</font><br>" +
                            "a dvíha všetkých skľúčených. <font color='#B71C1C'>– R.</font><br>" +
                            "Spravodlivý je Pán na všetkých svojich cestách <font color='#B71C1C'>*</font><br>" +
                            "a svätý vo všetkých svojich skutkoch.<br>" +
                            "Blízky je Pán všetkým, čo ho vzývajú, <font color='#B71C1C'>*</font><br>" +
                            "všetkým, čo ho vzývajú úprimne. <font color='#B71C1C'>– R.</font>"},
            {"44", "4", "", "Ž 106, 19-20. 21-22. 23",
                    "<font color='#B71C1C'>R.:</font> Pamätaj na nás, Pane, z lásky k svojmu ľudu.<br><br>" +
                            "Urobili si teľa na Horebe <font color='#B71C1C'>*</font><br>" +
                            "a klaňali sa soche uliatej;<br>" +
                            "i zamenili svoju slávu <font color='#B71C1C'>*</font><br>" +
                            "za podobu býka, ktorý trávu požiera. <font color='#B71C1C'>– R.</font><br>" +
                            "Zabudli na Boha, svojho záchrancu, <font color='#B71C1C'>*</font><br>" +
                            "ktorý vykonal veľké divy v Egypte,<br>" +
                            "zázraky v Chámovej krajine, <font color='#B71C1C'>*</font><br>" +
                            "v Červenom mori skutky úžasné. <font color='#B71C1C'>– R.</font><br>" +
                            "Už povedal, že ich vyhubí, <font color='#B71C1C'>*</font><br>" +
                            "keby nebolo Mojžiša, jeho vyvoleného.<br>" +
                            "On si stal v prielome pred neho, <font color='#B71C1C'>*</font><br>" +
                            "aby odvrátil jeho hnev; aby ich nezničil. <font color='#B71C1C'>– R.</font>"},
            {"45", "5", "", "Ž 34, 17-18. 19-20. 21+23",
                    "<font color='#B71C1C'>R.:</font> Pane, buď pri tých, čo majú srdce skrúšené.<br><br>" +
                            "Tvár Pánova sa odvracia od tých, čo robia zlo, <font color='#B71C1C'>*</font><br>" +
                            "a vyhladzuje ich pamiatku zo zeme.<br>" +
                            "Spravodliví volali a Pán ich vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ich zo všetkých tiesní. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán je pri tých, čo majú srdce skrúšené, <font color='#B71C1C'>*</font><br>" +
                            "a zachraňuje zlomených na duchu.<br>" +
                            "Spravodliví majú utrpení veľa, <font color='#B71C1C'>*</font><br>" +
                            "ale Pán ich vyslobodí zo všetkých. <font color='#B71C1C'>– R.</font><br>" +
                            "Všetky kosti im ochraňuje, <font color='#B71C1C'>*</font><br>" +
                            "ani jedna sa im nezlomí.<br>" +
                            "Pán vykúpi duše svojich služobníkov, <font color='#B71C1C'>*</font><br>" +
                            "nebudú potrestaní tí, čo v neho dúfajú. <font color='#B71C1C'>– R.</font>"},
            {"46", "6", "", "Ž 7, 2-3. 9b-10. 11-12",
                    "<font color='#B71C1C'>R.:</font> Pane, Bože môj, k tebe sa utiekam.<br><br>" +
                            "Pane, Bože môj, k tebe sa utiekam, <font color='#B71C1C'>*</font><br>" +
                            "zachráň ma pred všetkými, čo ma prenasledujú,<br>" +
                            "a vysloboď ma,<br>" +
                            "aby ma niekto neschvátil a neroztrhal ako lev, <font color='#B71C1C'>*</font><br>" +
                            "a nemal by som záchrancu. <font color='#B71C1C'>– R.</font><br>" +
                            "Súď ma, Pane, podľa mojej spravodlivosti <font color='#B71C1C'>*</font><br>" +
                            "a podľa mojej nevinnosti.<br>" +
                            "Nech je už koniec zlobe hriešnikov. <font color='#B71C1C'>†</font><br>" +
                            "Posilni spravodlivého, <font color='#B71C1C'>*</font><br>" +
                            "ty, spravodlivý Bože, čo skúmaš myseľ a srdce. <font color='#B71C1C'>– R.</font><br>" +
                            "Boh je moja obrana; <font color='#B71C1C'>*</font><br>" +
                            "on zachraňuje tých, čo majú srdce úprimné.<br>" +
                            "Boh je sudca spravodlivý; <font color='#B71C1C'>*</font><br>" +
                            "dáva výstrahy každý deň. <font color='#B71C1C'>– R.</font>"},
            {"50", "A", "", "Ž 130, 1-2. 3-4. 5-7a. 7b-8",
                    "<font color='#B71C1C'>R.:</font> U Pána je milosrdenstvo a hojné vykúpenie.<br><br>" +
                            "Z hlbín volám k tebe, Pane; <font color='#B71C1C'>*</font><br>" +
                            "Pane, počuj môj hlas.<br>" +
                            "Nakloň svoj sluch <font color='#B71C1C'>*</font><br>" +
                            "k mojej úpenlivej prosbe. <font color='#B71C1C'>– R.</font><br>" +
                            "Ak si budeš, Pane, v pamäti uchovávať neprávosť, <font color='#B71C1C'>*</font><br>" +
                            "Pane, kto obstojí?<br>" +
                            "Ale ty si milostivý <font color='#B71C1C'>*</font><br>" +
                            "a my ti chceme v bázni slúžiť. <font color='#B71C1C'>– R.</font><br>" +
                            "Spolieham sa na teba, Pane, <font color='#B71C1C'>*</font><br>" +
                            "moja duša sa spolieha na tvoje slovo;<br>" +
                            "moja duša očakáva Pána <font color='#B71C1C'>*</font><br>" +
                            "väčšmi ako strážcovia dennicu.<br>" +
                            "Väčšmi ako strážcovia dennicu <font color='#B71C1C'>*</font><br>" +
                            "nech očakáva Izrael Pána. <font color='#B71C1C'>– R.</font><br>" +
                            "Lebo u Pána je milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a hojné vykúpenie.<br>" +
                            "On sám vykúpi Izraela <font color='#B71C1C'>*</font><br>" +
                            "zo všetkých jeho neprávostí. <font color='#B71C1C'>– R.</font>"},
            {"50", "B", "", "Ž 51, 3-4. 12-13. 14-15",
                    "<font color='#B71C1C'>R.:</font> Bože, stvor vo mne srdce čisté.<br><br>" +
                            "Zmiluj sa, Bože, nado mnou pre svoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje veľké zľutovanie znič moju neprávosť.<br>" +
                            "Úplne zmy zo mňa moju vinu <font color='#B71C1C'>*</font><br>" +
                            "a očisť ma od hriechu. <font color='#B71C1C'>– R.</font><br>" +
                            "Bože, stvor vo mne srdce čisté <font color='#B71C1C'>*</font><br>" +
                            "a v mojom vnútri obnov ducha pevného.<br>" +
                            "Neodvrhuj ma spred svojej tváre <font color='#B71C1C'>*</font><br>" +
                            "a neodnímaj mi svojho ducha svätého. <font color='#B71C1C'>– R.</font><br>" +
                            "Navráť mi radosť z tvojej spásy <font color='#B71C1C'>*</font><br>" +
                            "a posilni ma duchom veľkej ochoty.<br>" +
                            "Poučím blúdiacich o tvojich cestách <font color='#B71C1C'>*</font><br>" +
                            "a hriešnici sa k tebe obrátia. <font color='#B71C1C'>– R.</font>"},
            {"50", "C", "", "Ž 126, 1-2b. 2c-3. 4-5. 6",
                    "<font color='#B71C1C'>R.:</font> Veľké veci urobil s nami Pán a máme z toho radosť.<br><br>" +
                            "Keď Pán privádzal späť sionských zajatcov, <font color='#B71C1C'>*</font><br>" +
                            "boli sme ako vo snách.<br>" +
                            "Ústa sme mali plné radosti <font color='#B71C1C'>*</font><br>" +
                            "a jazyk plný plesania. <font color='#B71C1C'>– R.</font><br>" +
                            "Vtedy sa hovorilo medzi pohanmi: <font color='#B71C1C'>*</font><br>" +
                            "\"Veľké veci urobil s nimi Pán.\"<br>" +
                            "Veľké veci urobil s nami Pán <font color='#B71C1C'>*</font><br>" +
                            "a máme z toho radosť. <font color='#B71C1C'>– R.</font><br>" +
                            "Zmeň, Pane, naše zajatie <font color='#B71C1C'>*</font><br>" +
                            "ako potoky na juhu krajiny.<br>" +
                            "Tí, čo sejú v slzách, <font color='#B71C1C'>*</font><br>" +
                            "s jasotom budú žať. <font color='#B71C1C'>– R.</font><br>" +
                            "Keď odchádzali, idúcky plakali <font color='#B71C1C'>*</font><br>" +
                            "a osivo niesli na siatie.<br>" +
                            "No keď sa vrátia, vrátia sa s jasotom <font color='#B71C1C'>*</font><br>" +
                            "a svoje snopy prinesú. <font color='#B71C1C'>– R.</font>"},
            {"51", "1", "", "Ž 23, 1-3. 4. 5. 6",
                    "<font color='#B71C1C'>R.:</font> Pane, nebudem sa báť zlého, lebo ty si so mnou.<br><br>" +
                            "Pán je môj pastier, nič mi nechýba: <font color='#B71C1C'>*</font><br>" +
                            "pasie ma na zelených pašienkach.<br>" +
                            "Vodí ma k tichým vodám, <font color='#B71C1C'>*</font><br>" +
                            "dušu mi osviežuje.<br>" +
                            "Vodí ma po správnych chodníkoch, <font color='#B71C1C'>*</font><br>" +
                            "verný svojmu menu. <font color='#B71C1C'>– R.</font><br>" +
                            "I keby som mal ísť tmavou dolinou, <font color='#B71C1C'>†</font><br>" +
                            "nebudem sa báť zlého, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si so mnou.<br>" +
                            "Tvoj prút a tvoja palica, <font color='#B71C1C'>*</font><br>" +
                            "tie sú mi útechou. <font color='#B71C1C'>– R.</font><br>" +
                            "Prestieraš mi stôl <font color='#B71C1C'>*</font><br>" +
                            "pred očami mojich protivníkov.<br>" +
                            "Leješ mi olej na hlavu <font color='#B71C1C'>*</font><br>" +
                            "a kalich mi napĺňaš až po okraj. <font color='#B71C1C'>– R.</font><br>" +
                            "Dobrota a milosť budú ma sprevádzať <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni môjho života.<br>" +
                            "A budem bývať v dome Pánovom <font color='#B71C1C'>*</font><br>" +
                            "mnoho a mnoho dní. <font color='#B71C1C'>– R.</font>"},
            {"52", "2", "", "Ž 102, 2-3. 16-18. 19-21",
                    "<font color='#B71C1C'>R.:</font> Pane, vyslyš moju modlitbu a moje volanie nech dôjde ku tebe.<br><br>" +
                            "Pane, vyslyš moju modlitbu <font color='#B71C1C'>*</font><br>" +
                            "a moje volanie nech dôjde ku tebe.<br>" +
                            "Neskrývaj svoju tvár predo mnou; <font color='#B71C1C'>†</font><br>" +
                            "v deň môjho súženia <font color='#B71C1C'>*</font><br>" +
                            "nakloň ku mne svoj sluch.<br>" +
                            "Kedykoľvek ťa budem vzývať, <font color='#B71C1C'>*</font><br>" +
                            "čím skôr ma vypočuj. <font color='#B71C1C'>– R.</font><br>" +
                            "Tvojho mena, Pane, budú sa báť pohania <font color='#B71C1C'>*</font><br>" +
                            "a tvojej slávy všetci zemskí králi;<br>" +
                            "lebo Pán vystaví Sion <font color='#B71C1C'>*</font><br>" +
                            "a zjaví sa vo svojej sláve.<br>" +
                            "Zhliadne na modlitbu núdznych <font color='#B71C1C'>*</font><br>" +
                            "a nepohrdne ich prosbami. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech sa to zaznačí pre pokolenie budúce <font color='#B71C1C'>*</font><br>" +
                            "a obnovený ľud oslávi Pána.<br>" +
                            "Veď Pán hľadí zo svojej vznešenej svätyne <font color='#B71C1C'>*</font><br>" +
                            "a z nebies pozerá na zem;<br>" +
                            "čuje nárek zajatých <font color='#B71C1C'>*</font><br>" +
                            "a odsúdeným na smrť vracia slobodu. <font color='#B71C1C'>– R.</font>"},
            {"53", "3", "", "Dan 3, 52a. 52c. 53. 54. 55. 56",
                    "<font color='#B71C1C'>R.:</font> Chvála ti a sláva naveky.<br><br>" +
                            "Zvelebený si, Pane, Bože našich otcov, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a vyvýšený naveky. <font color='#B71C1C'>– R.</font><br>" +
                            "Zvelebené je, tvoje meno, slávne a sväté, <font color='#B71C1C'>*</font><br>" +
                            "hodno chvály a vyvýšené nad všetky veky. <font color='#B71C1C'>– R.</font><br>" +
                            "Zvelebený si v chráme tvojej svätej slávy, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a slávy nad všetky veky. <font color='#B71C1C'>– R.</font><br>" +
                            "Zvelebený si na tróne svojho kráľovstva, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a vyvýšený nad všetky veky. <font color='#B71C1C'>– R.</font><br>" +
                            "Zvelebený si, čo prenikáš pohľadom priepasti <font color='#B71C1C'>†</font><br>" +
                            "a tróniš nad cherubmi, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a vyvýšený naveky. <font color='#B71C1C'>– R.</font><br>" +
                            "Zvelebený si na nebeskej oblohe, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a slávy naveky. <font color='#B71C1C'>– R.</font>"},
            {"54", "4", "", "Ž 105, 4-5. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pán večne pamätá na svoju zmluvu.<br><br>" +
                            "Hľadajte Pána a jeho moc, <font color='#B71C1C'>*</font><br>" +
                            "hľadajte vždy jeho tvá<font color='#B71C1C'>– R.</font><br>" +
                            "Pamätajte na divy, čo učinil, <font color='#B71C1C'>*</font><br>" +
                            "na jeho znamenia a na výroky jeho úst, <font color='#B71C1C'>– R.</font><br>" +
                            "vy, potomci Abraháma, Pánovho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "synovia Jakuba, vyvoleného Pánovho.<br>" +
                            "On, Pán, je náš Boh; <font color='#B71C1C'>*</font><br>" +
                            "jeho rozhodnutia platia po celej zemi. <font color='#B71C1C'>– R.</font><br>" +
                            "Večne pamätá na svoju zmluvu, <font color='#B71C1C'>*</font><br>" +
                            "na sľub, ktorý dal pokoleniam tisícim,<br>" +
                            "na zmluvu, čo s Abrahámom uzavrel, <font color='#B71C1C'>*</font><br>" +
                            "na prísahu, ktorou sa Izákovi zaviazal. <font color='#B71C1C'>– R.</font>"},
            {"55", "5", "", "Ž 18, 2b-3a. 3b-4. 5-6. 7",
                    "<font color='#B71C1C'>R.:</font> V úzkosti som vzýval Pána a on ma vypočul.<br><br>" +
                            "Milujem ťa, Pane, moja sila; <font color='#B71C1C'>*</font><br>" +
                            "Pane, opora moja, útočište moje, osloboditeľ môj. <font color='#B71C1C'>– R.</font><br>" +
                            "Bože môj, moja pomoc, tebe dôverujem; <font color='#B71C1C'>*</font><br>" +
                            "ty si môj štít, sila mojej spásy a môj ochranca.<br>" +
                            "Vzývať budem Pána, lebo jemu patrí chvála, <font color='#B71C1C'>*</font><br>" +
                            "a budem zachránený pred nepriateľmi. <font color='#B71C1C'>– R.</font><br>" +
                            "Obkľúčilo ma smrtiace vlnobitie <font color='#B71C1C'>*</font><br>" +
                            "a vydesili zlostné prívaly.<br>" +
                            "Ovinuli ma povrazy záhrobia, <font color='#B71C1C'>*</font><br>" +
                            "zovreli ma osídla smrti. <font color='#B71C1C'>– R.</font><br>" +
                            "V úzkosti som vzýval Pána <font color='#B71C1C'>*</font><br>" +
                            "a volal som ku svojmu Bohu.<br>" +
                            "Zo svojho chrámu počul môj hlas <font color='#B71C1C'>*</font><br>" +
                            "a moje volanie pred jeho tvárou<br>" +
                            "preniklo k jeho sluchu. <font color='#B71C1C'>– R.</font>"},
            {"56", "6", "", "Jer 31, 10. 11-12b. 13",
                    "<font color='#B71C1C'>R.:</font> Pán nás bude strážiť ako pastier svoje stádo.<br><br>" +
                            "Čujte, národy, slovo Pánovo, <font color='#B71C1C'>*</font><br>" +
                            "ohlasujte ho na ostrovoch v diaľavách a hovorte:<br>" +
                            "\"Zhromaždí Izraela ten, čo ho rozptýlil, <font color='#B71C1C'>*</font><br>" +
                            "bude ho strážiť ako pastier svoje stádo.\" <font color='#B71C1C'>– R.</font><br>" +
                            "Lebo Pán vykúpil Jakuba <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ho z ruky mocnejšieho.<br>" +
                            "Prídu a budú jasať na vrchu Sion, <font color='#B71C1C'>*</font><br>" +
                            "budú sa hrnúť k darom Pánovým. <font color='#B71C1C'>– R.</font><br>" +
                            "Vtedy sa panna radosťou roztančí, <font color='#B71C1C'>*</font><br>" +
                            "mládenci i starci zároveň.<br>" +
                            "\"Ich smútok zmením na radosť, <font color='#B71C1C'>*</font><br>" +
                            "poteším ich a rozveselím po žiali.\" <font color='#B71C1C'>– R.</font>"},
            {"60", "A", "", "Ž 22, 8-9. 17-18a. 19-20. 23-24",
                    "<font color='#B71C1C'>R.:</font> Bože môj, Bože môj, prečo si ma opustil?<br><br>" +
                            "Vysmievajú sa mi všetci, čo ma vidia, <font color='#B71C1C'>*</font><br>" +
                            "vykrúcajú ústa a potriasajú hlavou.<br>" +
                            "\"Úfal v Pána, nech ho vyslobodí, <font color='#B71C1C'>*</font><br>" +
                            "nech ho zachráni, ako ho má rád.\" <font color='#B71C1C'>– R.</font><br>" +
                            "Obkľučuje ma svorka psov, <font color='#B71C1C'>*</font><br>" +
                            "obstupuje ma tlupa zlosynov.<br>" +
                            "Prebodli mi ruky a nohy, <font color='#B71C1C'>*</font><br>" +
                            "môžem si spočítať všetky svoje kosti. <font color='#B71C1C'>– R.</font><br>" +
                            "Delia si moje šaty <font color='#B71C1C'>*</font><br>" +
                            "a o môj odev hádžu lós.<br>" +
                            "Ale ty, Pane, nevzďaľuj sa odo mňa, <font color='#B71C1C'>*</font><br>" +
                            "ty, moja sila, ponáhľaj sa mi na pomoc. <font color='#B71C1C'>– R.</font><br>" +
                            "Tvoje meno chcem zvestovať svojim bratom <font color='#B71C1C'>*</font><br>" +
                            "a uprostred zhromaždenia chcem ťa velebiť.<br>" +
                            "Chváľte Pána, vy, ktorí sa ho bojíte, <font color='#B71C1C'>†</font><br>" +
                            "oslavujte ho, všetci Jakubovi potomci. <font color='#B71C1C'>*</font><br>" +
                            "Nech majú pred ním bázeň<br>" +
                            "všetky pokolenia Izraelove. <font color='#B71C1C'>– R.</font>"},
            {"60", "B", "", "Ž 22, 8-9. 17-18a. 19-20. 23-24",
                    "<font color='#B71C1C'>R.:</font> Bože môj, Bože môj, prečo si ma opustil?<br><br>" +
                            "Vysmievajú sa mi všetci, čo ma vidia, <font color='#B71C1C'>*</font><br>" +
                            "vykrúcajú ústa a potriasajú hlavou.<br>" +
                            "\"Úfal v Pána, nech ho vyslobodí, <font color='#B71C1C'>*</font><br>" +
                            "nech ho zachráni, ako ho má rád.\" <font color='#B71C1C'>– R.</font><br>" +
                            "Obkľučuje ma svorka psov, <font color='#B71C1C'>*</font><br>" +
                            "obstupuje ma tlupa zlosynov.<br>" +
                            "Prebodli mi ruky a nohy, <font color='#B71C1C'>*</font><br>" +
                            "môžem si spočítať všetky svoje kosti. <font color='#B71C1C'>– R.</font><br>" +
                            "Delia si moje šaty <font color='#B71C1C'>*</font><br>" +
                            "a o môj odev hádžu lós.<br>" +
                            "Ale ty, Pane, nevzďaľuj sa odo mňa, <font color='#B71C1C'>*</font><br>" +
                            "ty, moja sila, ponáhľaj sa mi na pomoc. <font color='#B71C1C'>– R.</font><br>" +
                            "Tvoje meno chcem zvestovať svojim bratom <font color='#B71C1C'>*</font><br>" +
                            "a uprostred zhromaždenia chcem ťa velebiť.<br>" +
                            "Chváľte Pána, vy, ktorí sa ho bojíte, <font color='#B71C1C'>†</font><br>" +
                            "oslavujte ho, všetci Jakubovi potomci. <font color='#B71C1C'>*</font><br>" +
                            "Nech majú pred ním bázeň<br>" +
                            "všetky pokolenia Izraelove. <font color='#B71C1C'>– R.</font>"},
            {"60", "C", "", "Ž 22, 8-9. 17-18a. 19-20. 23-24",
                    "<font color='#B71C1C'>R.:</font> Bože môj, Bože môj, prečo si ma opustil?<br><br>" +
                            "Vysmievajú sa mi všetci, čo ma vidia, <font color='#B71C1C'>*</font><br>" +
                            "vykrúcajú ústa a potriasajú hlavou.<br>" +
                            "\"Úfal v Pána, nech ho vyslobodí, <font color='#B71C1C'>*</font><br>" +
                            "nech ho zachráni, ako ho má rád.\" <font color='#B71C1C'>– R.</font><br>" +
                            "Obkľučuje ma svorka psov, <font color='#B71C1C'>*</font><br>" +
                            "obstupuje ma tlupa zlosynov.<br>" +
                            "Prebodli mi ruky a nohy, <font color='#B71C1C'>*</font><br>" +
                            "môžem si spočítať všetky svoje kosti. <font color='#B71C1C'>– R.</font><br>" +
                            "Delia si moje šaty <font color='#B71C1C'>*</font><br>" +
                            "a o môj odev hádžu lós.<br>" +
                            "Ale ty, Pane, nevzďaľuj sa odo mňa, <font color='#B71C1C'>*</font><br>" +
                            "ty, moja sila, ponáhľaj sa mi na pomoc. <font color='#B71C1C'>– R.</font><br>" +
                            "Tvoje meno chcem zvestovať svojim bratom <font color='#B71C1C'>*</font><br>" +
                            "a uprostred zhromaždenia chcem ťa velebiť.<br>" +
                            "Chváľte Pána, vy, ktorí sa ho bojíte, <font color='#B71C1C'>†</font><br>" +
                            "oslavujte ho, všetci Jakubovi potomci. <font color='#B71C1C'>*</font><br>" +
                            "Nech majú pred ním bázeň<br>" +
                            "všetky pokolenia Izraelove. <font color='#B71C1C'>– R.</font>"},
            {"61", "1", "", "Ž 27, 1. 2. 3. 13-14",
                    "<font color='#B71C1C'>R.:</font> Pán je moje svetlo a moja spása.<br><br>" +
                            "Pán je moje svetlo a moja spása, <font color='#B71C1C'>*</font><br>" +
                            "koho sa mám báť?<br>" +
                            "Pán je ochranca môjho života, <font color='#B71C1C'>*</font><br>" +
                            "pred kým sa mám strachovať? <font color='#B71C1C'>– R.</font><br>" +
                            "Keď sa približujú ku mne zločinci <font color='#B71C1C'>*</font><br>" +
                            "a chcú mi zničiť telo,<br>" +
                            "vtedy moji utláčatelia a nepriatelia <font color='#B71C1C'>*</font><br>" +
                            "strácajú silu a padajú. <font color='#B71C1C'>– R.</font><br>" +
                            "Aj keby sa proti mne postavili šíky, <font color='#B71C1C'>*</font><br>" +
                            "moje srdce sa nezľakne.<br>" +
                            "Aj keby proti mne vzbĺkol boj, <font color='#B71C1C'>*</font><br>" +
                            "zotrvám v dôvere. <font color='#B71C1C'>– R.</font><br>" +
                            "Verím, že uvidím dobrodenia Pánove <font color='#B71C1C'>*</font><br>" +
                            "v krajine žijúcich.<br>" +
                            "Očakávaj Pána a buď statočný; <font color='#B71C1C'>*</font><br>" +
                            "srdce maj silné a drž sa Pána. <font color='#B71C1C'>– R.</font>"},
            {"62", "3", "", "Ž 71, 1-2. 3-4a. 5-6b. 15+17",
                    "<font color='#B71C1C'>R.:</font> Moje ústa, Pane, budú hlásať tvoju spásu.<br><br>" +
                            "V teba, Pane, som dúfal; <font color='#B71C1C'>*</font><br>" +
                            "nebudem zahanbený naveky.<br>" +
                            "Vo svojej spravodlivosti ma vysloboď a zachráň, <font color='#B71C1C'>*</font><br>" +
                            "nakloň ku mne svoj sluch a pomôž mi. <font color='#B71C1C'>– R.</font><br>" +
                            "Buď mi ochrannou skalou a opevneným hradom <font color='#B71C1C'>*</font><br>" +
                            "na moju záchranu;<br>" +
                            "veď ty si moja opora a moje útočište. <font color='#B71C1C'>*</font><br>" +
                            "Bože môj, vytrhni ma z ruky hriešnika. <font color='#B71C1C'>– R.</font><br>" +
                            "Lebo ja, Pane, túžim za tebou, <font color='#B71C1C'>*</font><br>" +
                            "ty, Pane, si moja nádej od mojej mladosti.<br>" +
                            "Od matkinho lona mám v tebe oporu, <font color='#B71C1C'>*</font><br>" +
                            "od života matky si mojím ochrancom. <font color='#B71C1C'>– R.</font><br>" +
                            "Moje ústa budú hlásať tvoju spravodlivosť <font color='#B71C1C'>†</font><br>" +
                            "a tvoju spásu deň čo deň, <font color='#B71C1C'>*</font><br>" +
                            "hoci ju ani neviem vyjadriť.<br>" +
                            "Bože, ty si ma poúčal od mojej mladosti <font color='#B71C1C'>*</font><br>" +
                            "a ja až doteraz ohlasujem tvoje diela zázračné. <font color='#B71C1C'>– R.</font>"},
            {"63", "3", "", "Ž 69, 8-10. 21-22. 31+33-34",
                    "<font color='#B71C1C'>R.:</font> Vo svojej veľkej láske vyslyš ma, Pane.<br><br>" +
                            "Pre teba znášam potupu <font color='#B71C1C'>*</font><br>" +
                            "a hanba mi pokrýva tvár. <font color='#B71C1C'>– R.</font><br>" +
                            "Svojim bratom som sa stal cudzincom <font color='#B71C1C'>*</font><br>" +
                            "a synom svojej matky neznámym.<br>" +
                            "Stravuje ma horlivosť za tvoj dom, <font color='#B71C1C'>*</font><br>" +
                            "padajú na mňa urážky tých, čo ťa urážajú. <font color='#B71C1C'>– R.</font><br>" +
                            "Potupa mi zlomila srdce a ochabol som. <font color='#B71C1C'>*</font><br>" +
                            "Čakal som, že dakto bude mať so mnou súcit,<br>" +
                            "no takého som nestretol;<br>" +
                            "čakal som, že dakto ma poteší, <font color='#B71C1C'>*</font><br>" +
                            "ale taký sa nenašiel.<br>" +
                            "Do jedla mi dali žlče, <font color='#B71C1C'>*</font><br>" +
                            "a keď som bol smädný, napojili ma octom. <font color='#B71C1C'>– R.</font><br>" +
                            "Piesňou chcem Božie meno osláviť <font color='#B71C1C'>*</font><br>" +
                            "a velebiť ho chválospevmi.<br>" +
                            "Nech zvedia o tom ponížení a nech sa potešia; <font color='#B71C1C'>*</font><br>" +
                            "hľadajte Boha a srdce vám oživne.<br>" +
                            "Lebo Pán vypočuje chudobných <font color='#B71C1C'>*</font><br>" +
                            "a nepohŕda svojimi, keď sú v zajatí. <font color='#B71C1C'>– R.</font>"},


            /*Fakultatívne čítania na 3. pôstny týždeň<br>" +
            "
            {"", "", "", "Ž 95, 1-2. 6-7. 8-9",
            "<font color='#B71C1C'>R.:</font> Pane, daj aby sme počúvali tvoj hlas a nezatvrdzovali si srdcia.<br><br>" +
            "Poďte, plesajme v Pánovi, <font color='#B71C1C'>*</font><br>" +
            "oslavujme Boha, našu spásu.<br>" +
            "Predstúpme s chválospevmi pred jeho tvár <font color='#B71C1C'>*</font><br>" +
            "a oslavujme ho žalmami. <font color='#B71C1C'>– R.</font><br>" +
            "Poďte, klaňajme sa a na zem padnime, <font color='#B71C1C'>*</font><br>" +
            "kľaknime na kolená pred Pánom, ktorý nás stvoril.<br>" +
            "Lebo on je náš Boh <font color='#B71C1C'>†</font><br>" +
            "a my sme ľud jeho pastviny <font color='#B71C1C'>*</font><br>" +
            "a ovce, ktoré vedie svojou rukou. <font color='#B71C1C'>– R.</font><br>" +
            "Čujte dnes jeho hlas: <font color='#B71C1C'>*</font><br>" +
            ""Nezatvrdzujte svoje srdcia<br>" +
            "ako v Meríbe, ako v dňoch Massy na púšti, <font color='#B71C1C'>†</font><br>" +
            "kde ma pokúšali vaši otcovia; <font color='#B71C1C'>*</font><br>" +
            "skúšali ma, hoci moje skutky videli." <font color='#B71C1C'>– R.</font>"},

            Fakultatívne čítania na 4. pôstny týždeň
            {"", "", "", "Ž 27, 1. 7-8a. 8b-9c. 13-14",
            "<font color='#B71C1C'>R.:</font> Pán je moje svetlo a moja spása.<br><br>" +
            "Pán je moje svetlo a moja spása, <font color='#B71C1C'>*</font><br>" +
            "koho sa mám báť?<br>" +
            "Pán je ochranca môjho života, <font color='#B71C1C'>*</font><br>" +
            "pred kým sa mám strachovať? <font color='#B71C1C'>– R.</font><br>" +
            "Čuj, Pane, hlas môjho volania, <font color='#B71C1C'>*</font><br>" +
            "zľutuj sa nado mnou a vyslyš ma.<br>" +
            "V srdci mi znejú tvoje slová: <font color='#B71C1C'>*</font><br>" +
            ""Hľadajte moju tvár!" <font color='#B71C1C'>– R.</font><br>" +
            "Pane, ja hľadám tvoju tvár. <font color='#B71C1C'>*</font><br>" +
            "Neodvracaj svoju tvár odo mňa,<br>" +
            "neodkláňaj sa v hneve od svojho služobníka. <font color='#B71C1C'>*</font><br>" +
            "Ty si moja pomoc, neodvrhuj ma. <font color='#B71C1C'>– R.</font><br>" +
            "Verím, že uvidím dobrodenia Pánove <font color='#B71C1C'>*</font><br>" +
            "v krajine žijúcich.<br>" +
            "Očakávaj Pána a buď statočný; <font color='#B71C1C'>*</font><br>" +
            "srdce maj silné a drž sa Pána. <font color='#B71C1C'>– R.</font>"},

            Fakultatívne čítania na 5. pôstny týždeň
            {"", "", "", "Ž 17, 1. 6-7. 8b+15",
            "<font color='#B71C1C'>R.:</font> Až raz vstanem zo sna, uzriem tvoju tvár, Pane.<br><br>" +
            "Vypočuj, Pane, moju spravodlivú žiadosť, <font color='#B71C1C'>*</font><br>" +
            "všimni si moju prosbu pokornú.<br>" +
            "Nakloň sluch k mojej modlitbe, <font color='#B71C1C'>*</font><br>" +
            "čo plynie z perí úprimných. <font color='#B71C1C'>– R.</font><br>" +
            "K tebe, Bože, volám, lebo ty ma vyslyšíš. <font color='#B71C1C'>*</font><br>" +
            "Nakloň ku mne sluch a vypočuj moje slová.<br>" +
            "Ukáž svoje predivné milosrdenstvo, <font color='#B71C1C'>*</font><br>" +
            "ty, čo pred protivníkmi pravicou zachraňuješ<br>" +
            "dôverujúcich v teba. <font color='#B71C1C'>– R.</font><br>" +
            "Skry ma v tôni svojich perutí. <font color='#B71C1C'>†</font><br>" +
            "Ja však v spravodlivosti uzriem tvoju tvár <font color='#B71C1C'>*</font><br>" +
            "a až raz vstanem zo sna, nasýtim sa pohľadom na teba. <font color='#B71C1C'>– R.</font>"},
    */
    };

    String[][] postAleluja = {
            //Pôstne obdobie nemá alelujový verš, ale VERŠ PRED EVANJELIOM

            {"03", "3", "", "Porov. Ž 95, 8", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Nezatvrdzujte dnes svoje srdcia, ale počúvajte Pánov hlas.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"04", "4", "", "Mt 4, 17", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Robte pokánie, hovorí Pán; priblížilo sa nebeské kráľovstvo.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"05", "5", "", "Porov. Am 5, 14", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Hľadajte dobro, a nie zlo; budete žiť a Pán bude s vami.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"06", "6", "", "Ez 33, 11b", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Nechcem smrť bezbožného, hovorí Pán; ale aby sa odvrátil od svojej cesty a žil.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"10", "A", "", "Mt 4, 4", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Nielen z chleba žije človek, ale z každého slova, ktoré vychádza z Božích úst.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"10", "B", "", "Mt 4, 4", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Nielen z chleba žije človek, ale z každého slova, ktoré vychádza z Božích úst.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"10", "C", "", "Mt 4, 4", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Nielen z chleba žije človek, ale z každého slova, ktoré vychádza z Božích úst.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"11", "1", "", "2 Kor 6, 2c", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Hľa, teraz je milostivý čas, teraz je deň spásy!<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"12", "2", "", "Mt 4, 4b", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Nielen z chleba žije človek, ale z každého slova, ktoré vychádza z Božích úst.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"13", "3", "", "Porov. Joel 2, 12-13", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Obráťte sa ku mne celým svojim srdcom, hovorí Pán; veď som dobrotivý a milosrdný.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"14", "4", "", "Ž 51, 12a. 14a", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Bože, stvor vo mne srdce čisté; navráť mi radosť z tvojej spásy.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"15", "5", "", "Ez 18, 31", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Odvrhnite od seba všetky svoje hriechy, hovorí Pán; a obnovte si srdce i ducha.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"16", "6", "", "", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Hľa, teraz je milostivý čas, teraz je deň spásy!<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"20", "A", "", "", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "V žiarivom oblaku bolo počuť Otcov hlas: Toto je môj milovaný Syn, počúvajte ho!<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"20", "B", "", "", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "V žiarivom oblaku bolo počuť Otcov hlas: Toto je môj milovaný Syn, počúvajte ho!<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"20", "C", "", "", "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo.<br>" +
                    "V žiarivom oblaku bolo počuť Otcov hlas: Toto je môj milovaný Syn, počúvajte ho!<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo."},
            {"21", "1", "", "Porov. Jn 6, 63. 68", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Tvoje slová, Pane, sú Duch a život. Ty máš slová večného života.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"22", "2", "", "Ez 18, 31", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Odvrhnite od seba všetky svoje hriechy, hovorí Pán; a obnovte si srdce i ducha.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"23", "3", "", "Jn 8, 12", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Ja som svetlo sveta, hovorí Pán; kto mňa nasleduje, bude mať svetlo života.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"24", "4", "", "Porov. Lk 8, 15", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Blahoslavení sú tí, čo zachovávajú Božie slovo v dobrom a šľachetnom srdci a s vytrvalosťou prinášajú úrodu.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"25", "5", "", "Porov. Jn 3, 16", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Boh tak miloval svet, že dal svojho jednorodeného Syna; každý, kto v neho verí, má večný život.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"26", "6", "", "Lk 15, 18", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Vstanem, pôjdem k svojmu otcovi a poviem mu: Otče zhrešil som proti nebu i voči tebe.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"30", "A", "", "Porov. Jn 4, 42. 15", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Pane, ty si naozaj Spasiteľ sveta; daj mi živú vodu, aby som už nebola smädná.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"30", "B", "", "Porov. Jn 3, 16", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Boh tak miloval svet, že dal svojho jednorodeného Syna; každý, kto v neho verí, má večný život.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"30", "C", "", "Mt 4, 17", "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo.<br>" +
                    "Robte pokánie, hovorí Pán; priblížilo sa nebeské kráľovstvo.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo."},
            {"31", "1", "", "Porov. Jn 4, 42. 15", "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo.<br>" +
                    "Spolieham sa na Pána, spolieham sa na jeho slovo; lebo u Pána je milosrdenstvo a hojné vykúpenie.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo."},
            {"32", "2", "", "Porov. Ž 130, 5. 7", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Obráťte sa ku mne celým svojim srdcom, hovorí Pán; veď som dobrotivý a milosrdný.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"33", "3", "", "Porov. Jn 6, 63. 68", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Tvoje slová, Pane, sú Duch a život. Ty máš slová večného života.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"34", "4", "", "Porov. Joel 2, 12-13", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Obráťte sa ku mne celým svojim srdcom, hovorí Pán; veď som dobrotivý a milosrdný.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"35", "5", "", "Mt 4, 17", "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo.<br>" +
                    "Robte pokánie, hovorí Pán; priblížilo sa nebeské kráľovstvo.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo."},
            {"36", "6", "", "Porov. Ž 95, 8", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Nezatvrdzujte dnes svoje srdcia, ale počúvajte Pánov hlas.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"40", "A", "", "Jn 8, 12", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Ja som svetlo sveta, hovorí Pán; kto mňa nasleduje, bude mať svetlo života.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"40", "B", "", "Porov. Jn 3, 16", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Boh tak miloval svet, že dal svojho jednorodeného Syna; každý, kto v neho verí, má večný život.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"40", "C", "", "Lk 15, 18", "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo.<br>" +
                    "Vstanem, pôjdem k svojmu otcovi a poviem mu: Otče, zhrešil som proti nebu i voči tebe.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo."},
            {"41", "1", "", "Porov. Am 5, 14", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Hľadajte dobro, a nie zlo; budete žiť a Pán bude s vami.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"42", "2", "", "Ž 51, 12a. 14a", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Bože, stvor vo mne srdce čisté; navráť mi radosť z tvojej spásy.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"43", "3", "", "Jn 11, 25a. 26", "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo.<br>" +
                    "Ja som vzkriesenie a život, hovorí Pán; kto verí vo mňa neumrie naveky.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo."},
            {"44", "4", "", "Porov. Jn 3, 16", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Boh tak miloval svet, že dal svojho jednorodeného Syna; každý, kto v neho verí, má večný život.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"45", "5", "", "Mt 4, 4b", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Nielen z chleba žije človek, ale z každého slova, ktoré vychádza z Božích úst.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"46", "6", "", "Porov. Lk 8, 15", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Blahoslavení sú tí, čo zachovávajú Božie slovo v dobrom a šľachetnom srdci a s vytrvalosťou prinášajú úrodu.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"50", "A", "", "Jn 11, 25a. 26", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Ja som vzkriesenie a život, hovorí Pán; kto verí vo mňa, neumrie naveky.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"50", "B", "", "Jn 12, 26", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Ak mi niekto slúži, nech ma nasleduje, hovorí Pán; a kde som ja, tam bude aj môj služobník.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"50", "C", "", "Porov. Joel 2, 12-13", "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo.<br>" +
                    "Obráťte sa ku mne celým svojim srdcom, hovorí Pán; veď som dobrotivý a milosrdný.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo."},
            {"51", "1", "", "Ez 33, 11b", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Nechcem smrť bezbožného, hovorí Pán; ale aby sa odvrátil od svojej cesty a žil.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"52", "2", "", "", "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo.<br>" +
                    "Semeno je Božie slovo, rozsievač je Kristus. Každý, kto ho nájde, bude žiť naveky.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo."},
            {"53", "3", "", "Porov. Lk 8, 15", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Blahoslavení sú tí, čo zachovávajú Božie slovo v dobrom a šľachetnom srdci a s vytrvalosťou prinášajú úrodu.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"54", "4", "", "Porov. Ž 95, 8", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Nezatvrdzujte dnes svoje srdcia, ale počúvajte Pánov hlas.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"55", "5", "", "Porov. Jn 6, 63. 68", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Tvoje slová, Pane, sú Duch a život. Ty máš slová večného života.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"56", "6", "", "Ez 18, 31", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Odvrhnite od seba všetky svoje hriechy, hovorí Pán; a obnovte si srdce i ducha.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"60", "A", "", "Flp 2, 8-9", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Kristus sa stal pre nás poslušným až na smrť, až na smrť na kríži. Preto ho Boh nad všetko povýšil a dal mu meno, ktoré je nad každé iné meno.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"60", "B", "", "Flp 2, 8-9", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Kristus sa stal pre nás poslušným až na smrť, až na smrť na kríži. Preto ho Boh nad všetko povýšil a dal mu meno, ktoré je nad každé iné meno.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"60", "C", "", "Flp 2, 8-9", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Kristus sa stal pre nás poslušným až na smrť, až na smrť na kríži. Preto ho Boh nad všetko povýšil a dal mu meno, ktoré je nad každé iné meno.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"61", "1", "", "", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Buď pozdravený, náš Kráľ; ty jediný si sa zmiloval nad nami, hriešnikmi.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"62", "2", "", "", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Buď pozdravený, náš Kráľ, poslušný Otcovi; vedený na kríž ako tichý baránok na zabitie.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},
            {"63", "3", "", "", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "Buď pozdravený, náš Kráľ, poslušný Otcovi; vedený na kríž ako tichý baránok na zabitie.<br>" +
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste."},

/*
            Fakultatívne čítania na 3. pôstny týždeň
            {"", "", "", "", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Pane, ty si naozaj Spasiteľ sveta; daj mi živú vodu, aby som už nebola smädná.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},

            Fakultatívne čítania na 4. pôstny týždeň
            {"", "", "", "", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Ja som svetlo sveta, hovorí Pán; kto mňa nasleduje, bude mať svetlo života.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},

            Fakultatívne čítania na 5. pôstny týždeň
            {"", "", "", "", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Ja som vzkriesenie a život, hovorí Pán; kto verí vo mňa, neumrie naveky.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},*/

    };
}
