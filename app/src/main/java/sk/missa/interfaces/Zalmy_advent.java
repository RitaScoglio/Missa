package sk.missa.interfaces;

/*
 * Responzóziové žalmy v adventnom období uložené v dvojrozmernom poli: adventZalm
 * nedeľa: {týždeň v adventnom období, liturgický rok (A/B/C), "", súradnice, text},
 * deň v týždni: {týždeň v adventnom období + deň v týždni (1-pondelok, 2-utorok..., 6-sobota), deň v týždni, "", súradnice, text},
 *
 * Alelujové verše v adventnom období uložené v dvojrozmernom poli: adventAleluja
 * nedeľa: {týždeň v adventnom období, liturgický rok (A/B/C), "", súradnice, text},
 * deň v týždni: {týždeň v adventnom období + deň v týždni (1-pondelok, 2-utorok..., 6-sobota), deň v týždni (1-pondelok, 2-utorok..., 6-sobota), "", súradnice, text},
 *
 * Keďže sú žalmy a alelujové verše v adventnom a vianočnom období viazané na deň, nachádzajú sa v Zalmy_svatci uložené v mesiaci, ktorému prislúchajú a s dňom ako ID
 */

public interface Zalmy_advent {

    String[][] adventZalm = {
            {"10", "A", "", "Ž 122, 1-2. 4-5. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> S radosťou pôjdeme do domu Pánovho.<br><br>" +
                            "Zaradoval som sa, keď mi povedali: <font color='#B71C1C'>*</font><br>" +
                            "\"Pôjdeme do domu Pánovho.\"<br>" +
                            "Naše nohy už stoja <font color='#B71C1C'>*</font><br>" +
                            "v tvojich bránach, Jeruzalem. <font color='#B71C1C'>– R.</font><br>" +
                            "Tam prichádzajú kmene, kmene Pánove, <font color='#B71C1C'>*</font><br>" +
                            "aby podľa obyčaje Izraela velebili meno Pánovo.<br>" +
                            "Lebo sú tam súdne stolice, <font color='#B71C1C'>*</font><br>" +
                            "stolice domu Dávidovho. <font color='#B71C1C'>– R.</font><br>" +
                            "Pre Jeruzalem proste o pokoj: <font color='#B71C1C'>*</font><br>" +
                            "\"Nech sú bezpeční, čo ťa milujú.<br>" +
                            "Nech pokoj vládne vnútri tvojich hradieb <font color='#B71C1C'>*</font><br>" +
                            "a istota v tvojich palácoch.\" <font color='#B71C1C'>– R.</font><br>" +
                            "Kvôli svojim bratom a priateľom <font color='#B71C1C'>*</font><br>" +
                            "budem hovoriť: \"Pokoj s tebou!\"<br>" +
                            "Kvôli domu Pána, nášho Boha, <font color='#B71C1C'>*</font><br>" +
                            "budem prosiť o šťastie pre teba. <font color='#B71C1C'>– R.</font>"},
            {"10", "B", "", "Ž 80, 2+3bc. 15-16. 18-19",
                    "<font color='#B71C1C'>R.:</font> Bože, obnov nás, rozjasni svoju tvár a budeme spasení.<br><br>" +
                            "Pastier Izraela, počúvaj! <font color='#B71C1C'>*</font><br>" +
                            "Ty, čo tróniš nad cherubmi, zaskvej sa!<br>" +
                            "Vzbuď svoju moc <font color='#B71C1C'>*</font><br>" +
                            "a príď nás zachrániť. <font color='#B71C1C'>– R.</font><br>" +
                            "Bože zástupov, vráť sa, <font color='#B71C1C'>*</font><br>" +
                            "zhliadni z neba, podívaj sa a navštív túto vinicu.<br>" +
                            "A chráň ju, veď ju vysadila tvoja pravica, <font color='#B71C1C'>*</font><br>" +
                            "chráň i výhonok, ktorý si si vypestoval. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech je tvoja ruka nad mužom po tvojej pravici, <font color='#B71C1C'>*</font><br>" +
                            "nad synom človeka, ktorého si si ty vyvolil.<br>" +
                            "Už neodstúpime od teba a ty nás zachováš pri živote <font color='#B71C1C'>*</font><br>" +
                            "a budeme vzývať tvoje meno. <font color='#B71C1C'>– R.</font>"},
            {"10", "C", "", "Ž 25, 4-5b. 8-9. 10+14",
                    "<font color='#B71C1C'>R.:</font> K tebe, Pane, dvíham svoju dušu.<br><br>" +
                            "Ukáž mi, Pane, svoje cesty <font color='#B71C1C'>*</font><br>" +
                            "a pouč ma o svojich chodníkoch.<br>" +
                            "Veď ma vo svojej pravde a uč ma, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si Boh, moja spása. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán je dobrý a spravodlivý: <font color='#B71C1C'>*</font><br>" +
                            "ukazuje cestu hriešnikom.<br>" +
                            "Pokorných vedie k správnemu konaniu <font color='#B71C1C'>*</font><br>" +
                            "a tichých poúča o svojich cestách. <font color='#B71C1C'>– R.</font><br>" +
                            "Všetky cesty Pánove sú milosrdenstvo a vernosť <font color='#B71C1C'>*</font><br>" +
                            "pre tých, čo zachovávajú jeho zmluvu a jeho príkazy.<br>" +
                            "Pán bude dôverným priateľom tým, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "a zjaví im svoju zmluvu. <font color='#B71C1C'>– R.</font>"},
            {"11", "1", "", "Ž 122, 1-2. 3-4a. (4b-5. 6-7.) 8-9",
                    "<font color='#B71C1C'>R.:</font> S radosťou pôjdeme do domu Pánovho.<br><br>" +
                            "Zaradoval som sa, keď mi povedali: <font color='#B71C1C'>*</font><br>" +
                            "\"Pôjdeme do domu Pánovho.\"<br>" +
                            "Naše nohy už stoja <font color='#B71C1C'>*</font><br>" +
                            "v tvojich bránach, Jeruzalem. <font color='#B71C1C'>– R.</font><br>" +
                            "Jeruzalem je vystavaný ako mesto <font color='#B71C1C'>*</font><br>" +
                            "spojené v jeden celok.<br>" +
                            "Tam prichádzajú kmene, <font color='#B71C1C'>*</font><br>" +
                            "kmene Pánove, <font color='#B71C1C'>– R.</font><br>" +
                            "(aby podľa obyčaje Izraela <font color='#B71C1C'>*</font><br>" +
                            "velebili meno Pánovo.<br>" +
                            "Lebo sú tam súdne stolice, <font color='#B71C1C'>*</font><br>" +
                            "stolice domu Dávidovho. <font color='#B71C1C'>– R.</font><br>" +
                            "Pre Jeruzalem proste o pokoj: <font color='#B71C1C'>*</font><br>" +
                            "\"Nech sú bezpeční, čo ťa milujú.<br>" +
                            "Nech pokoj vládne vnútri tvojich hradieb <font color='#B71C1C'>*</font><br>" +
                            "a istota v tvojich palácoch.\" <font color='#B71C1C'>– R.</font>)<br>" +
                            "Kvôli svojim bratom a priateľom <font color='#B71C1C'>*</font><br>" +
                            "budem hovoriť: \"Pokoj s tebou!\"<br>" +
                            "Kvôli domu Pána, nášho Boha, <font color='#B71C1C'>*</font><br>" +
                            "budem prosiť o šťastie pre teba. <font color='#B71C1C'>– R.</font>"},
            {"12", "2", "", "Ž 72, 1-2. 7-8. 12-13. 17",
                    "<font color='#B71C1C'>R.:</font> V jeho dňoch bude prekvitať spravodlivosť a plnosť pokoja naveky.<br><br>" +
                            "Bože, zver svoju právomoc kráľovi, <font color='#B71C1C'>*</font><br>" +
                            "kráľovmu synovi svoju spravodlivosť,<br>" +
                            "aby spravodlivo vládol nad tvojím ľudom <font color='#B71C1C'>*</font><br>" +
                            "a podľa práva nad tvojimi chudobnými. <font color='#B71C1C'>– R.</font><br>" +
                            "V jeho dňoch bude prekvitať spravodlivosť<br>" +
                            "a plnosť pokoja, <font color='#B71C1C'>*</font><br>" +
                            "kým mesiac nezhasne.<br>" +
                            "A bude panovať od mora až k moru <font color='#B71C1C'>*</font><br>" +
                            "a od Rieky až na kraj zeme. <font color='#B71C1C'>– R.</font><br>" +
                            "On vyslobodí bedára, čo volá k nemu, <font color='#B71C1C'>*</font><br>" +
                            "i chudobného, ktorému nik nepomáha.<br>" +
                            "Zmiluje sa nad chudobným a bedárom, <font color='#B71C1C'>*</font><br>" +
                            "zachráni život úbožiakom. <font color='#B71C1C'>– R.</font><br>" +
                            "Jeho meno nech je velebené naveky; <font color='#B71C1C'>*</font><br>" +
                            "kým bude svietiť slnko, jeho meno potrvá.<br>" +
                            "V ňom budú požehnané všetky kmene zeme, <font color='#B71C1C'>*</font><br>" +
                            "zvelebovať ho budú všetky národy. <font color='#B71C1C'>– R.</font>"},
            {"13", "3", "", "Ž 23, 1-3. 4. 5. 6",
                    "<font color='#B71C1C'>R.:</font> Budem bývať v dome Pánovom mnoho a mnoho dni.<br><br>" +
                            "Pán je môj pastier, nič mi nechýba: <font color='#B71C1C'>*</font><br>" +
                            "pasie ma na zelených pašienkach.<br>" +
                            "Vodí ma k tichým vodám, <font color='#B71C1C'>*</font><br>" +
                            "dušu mi osviežuje.<br>" +
                            "Vodí ma po správnych chodníkoch, <font color='#B71C1C'>*</font><br>" +
                            "verný svojmu menu. <font color='#B71C1C'>– R.</font><br>" +
                            "I keby som mal ísť tmavou dolinou, †<br>" +
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
            {"14", "4", "", "Ž 118, 1+8-9. 19-21. 25-27a",
                    "<font color='#B71C1C'>R.:</font> Požehnaný, ktorý prichádza v mene Pánovom.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "Lepšie je utiekať sa k Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "ako sa spoliehať na človeka.<br>" +
                            "Lepšie je utiekať sa k Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "ako sa spoliehať na mocnárov. <font color='#B71C1C'>– R.</font><br>" +
                            "Otvorte mi brány spravodlivosti, <font color='#B71C1C'>*</font><br>" +
                            "vojdem nimi a poďakujem sa Pánovi.<br>" +
                            "Toto je brána Pánova; <font color='#B71C1C'>*</font><br>" +
                            "len spravodliví ňou vchádzajú.<br>" +
                            "Ďakujem ti, že si ma vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a že si ma zachránil. <font color='#B71C1C'>– R.</font><br>" +
                            "Pane, spas ma; <font color='#B71C1C'>*</font><br>" +
                            "Pane, daj mi úspech.<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom. †<br>" +
                            "Požehnávame vás z domu Pánovho. <font color='#B71C1C'>*</font><br>" +
                            "Boh, Pán, je naším svetlom. <font color='#B71C1C'>– R.</font>"},
            {"15", "5", "", "Ž 27, 1. 4. 13-14",
                    "<font color='#B71C1C'>R.:</font> Pán je moje svetlo a moja spása.<br><br>" +
                            "Pán je moje svetlo a moja spása, <font color='#B71C1C'>*</font><br>" +
                            "koho sa mám báť?<br>" +
                            "Pán je ochranca môjho života, <font color='#B71C1C'>*</font><br>" +
                            "pred kým sa mám strachovať? <font color='#B71C1C'>– R.</font><br>" +
                            "O jedno prosím Pána a za tým túžim, <font color='#B71C1C'>*</font><br>" +
                            "aby som mohol bývať v dome Pánovom<br>" +
                            "po všetky dni svojho života,<br>" +
                            "aby som pociťoval nehu Pánovu <font color='#B71C1C'>*</font><br>" +
                            "a obdivoval jeho chrám. <font color='#B71C1C'>– R.</font><br>" +
                            "Verím, že uvidím dobrodenia Pánove <font color='#B71C1C'>*</font><br>" +
                            "v krajine žijúcich.<br>" +
                            "Očakávaj Pána a buď statočný; <font color='#B71C1C'>*</font><br>" +
                            "srdce maj silné a drž sa Pána. <font color='#B71C1C'>– R.</font>"},
            {"16", "6", "", "Ž 147, 1-2. 3-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Blahoslavení všetci, čo očakávajú Pána.<br><br>" +
                            "Chváľte Pána, lebo je dobré ospevovať nášho Boha, <font color='#B71C1C'>*</font><br>" +
                            "lebo je milé hlásať jeho slávu.<br>" +
                            "Pán stavia Jeruzalem <font color='#B71C1C'>*</font><br>" +
                            "a zhromažďuje roztratených Izraelitov. <font color='#B71C1C'>– R.</font><br>" +
                            "Uzdravuje skľúčených srdcom <font color='#B71C1C'>*</font><br>" +
                            "a obväzuje ich rany.<br>" +
                            "On pozná počet hviezd <font color='#B71C1C'>*</font><br>" +
                            "a každú volá po mene. <font color='#B71C1C'>– R.</font><br>" +
                            "Veľký je náš Pán a veľmi mocný, <font color='#B71C1C'>*</font><br>" +
                            "jeho múdrosť je nesmierna.<br>" +
                            "Tichých sa Pán ujíma, <font color='#B71C1C'>*</font><br>" +
                            "ale hriešnikov ponižuje až po zem. <font color='#B71C1C'>– R.</font>"},
            {"20", "A", "", "Ž 72, 1-2. 7-8. 12-13. 17",
                    "<font color='#B71C1C'>R.:</font> V jeho dňoch bude prekvitať spravodlivosť a plnosť pokoja naveky.<br><br>" +
                            "Bože, zver svoju právomoc kráľovi, <font color='#B71C1C'>*</font><br>" +
                            "kráľovmu synovi svoju spravodlivosť,<br>" +
                            "aby spravodlivo vládol nad tvojím ľudom <font color='#B71C1C'>*</font><br>" +
                            "a podľa práva nad tvojimi chudobnými. <font color='#B71C1C'>– R.</font><br>" +
                            "V jeho dňoch bude prekvitať spravodlivosť<br>" +
                            "a plnosť pokoja, <font color='#B71C1C'>*</font><br>" +
                            "kým mesiac nezhasne.<br>" +
                            "A bude panovať od mora až k moru <font color='#B71C1C'>*</font><br>" +
                            "a od Rieky až na kraj zeme. <font color='#B71C1C'>– R.</font><br>" +
                            "On vyslobodí bedára, čo volá k nemu, <font color='#B71C1C'>*</font><br>" +
                            "i chudobného, ktorému nik nepomáha.<br>" +
                            "Zmiluje sa nad chudobným a bedárom, <font color='#B71C1C'>*</font><br>" +
                            "zachráni život úbožiakom. <font color='#B71C1C'>– R.</font><br>" +
                            "Jeho meno nech je velebené naveky; <font color='#B71C1C'>*</font><br>" +
                            "kým bude svietiť slnko, jeho meno potrvá.<br>" +
                            "V ňom budú požehnané všetky kmene zeme, <font color='#B71C1C'>*</font><br>" +
                            "zvelebovať ho budú všetky národy. <font color='#B71C1C'>– R.</font>"},
            {"20", "B", "", "Ž 85, 9ab+10. 11-12. 13-14",
                    "<font color='#B71C1C'>R.:</font> Ukáž nám, Pane, svoje milosrdenstvo a daj nám svoju spásu.<br><br>" +
                            "Budem počúvať, čo povie Pán, Boh; <font color='#B71C1C'>*</font><br>" +
                            "on ohlási pokoj svojmu ľudu a svojim svätým.<br>" +
                            "Naozaj: blízko je spása tým, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "a jeho sláva bude prebývať v našej krajine. <font color='#B71C1C'>– R.</font><br>" +
                            "Milosrdenstvo a vernosť sa stretnú navzájom, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a pokoj sa pobozkajú.<br>" +
                            "Vernosť vyrastie zo zeme, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť zhliadne z neba. <font color='#B71C1C'>– R.</font><br>" +
                            "Veď Pán dá požehnanie <font color='#B71C1C'>*</font><br>" +
                            "a svoje plody vydá naša zem.<br>" +
                            "Pred ním bude kráčať spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a po stopách jeho krokov spása. <font color='#B71C1C'>– R.</font>"},
            {"20", "C", "", "Ž 126, 1-2b. 2c-3. 4-5. 6",
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
            {"21", "1", "", "Ž 85, 9ab+10. 11-12. 13-14",
                    "<font color='#B71C1C'>R.:</font> Hľa, náš Boh príde a spasí nás.<br><br>" +
                            "Budem počúvať, čo povie Pán, Boh; <font color='#B71C1C'>*</font><br>" +
                            "on ohlási pokoj svojmu ľudu a svojim svätým.<br>" +
                            "Naozaj: blízko je spása tým, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "a jeho sláva bude prebývať v našej krajine. <font color='#B71C1C'>– R.</font><br>" +
                            "Milosrdenstvo a vernosť sa stretnú navzájom, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a pokoj sa pobozkajú.<br>" +
                            "Vernosť vyrastie zo zeme, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť zhliadne z neba. <font color='#B71C1C'>– R.</font><br>" +
                            "Veď Pán dá požehnanie <font color='#B71C1C'>*</font><br>" +
                            "a svoje plody vydá naša zem.<br>" +
                            "Pred ním bude kráčať spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a po stopách jeho krokov spása. <font color='#B71C1C'>– R.</font>"},
            {"22", "2", "", "Ž 96, 1-2. 3+10ac. 11-12a. 12b-13",
                    "<font color='#B71C1C'>R.:</font> Hľa, Pán, Boh, prichádza so všetkou mocou.<br><br>" +
                            "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>*</font><br>" +
                            "spievaj Pánovi, celá zem!<br>" +
                            "Spievajte Pánovi, velebte jeho meno. <font color='#B71C1C'>*</font><br>" +
                            "Zvestujte jeho spásu deň čo deň. <font color='#B71C1C'>– R.</font><br>" +
                            "Zvestujte jeho slávu pohanom <font color='#B71C1C'>*</font><br>" +
                            "a jeho zázraky všetkým národom.<br>" +
                            "Hlásajte medzi pohanmi: \"Pán kraľuje!\" <font color='#B71C1C'>*</font><br>" +
                            "a spravodlivo súdi národy. <font color='#B71C1C'>– R.</font><br>" +
                            "Tešte sa, nebesia, plesaj, zem; †<br>" +
                            "nech more zahučí a čo ho napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "nech plesá pole a všetko, čo je na ňom. <font color='#B71C1C'>– R.</font><br>" +
                            "I zajasajú všetky stromy lesa †<br>" +
                            "pred tvárou Pána, že prichádza, <font color='#B71C1C'>*</font><br>" +
                            "že prichádza súdiť zem.<br>" +
                            "Spravodlivo bude súdiť zemekruh <font color='#B71C1C'>*</font><br>" +
                            "a národy podľa svojej pravdy. <font color='#B71C1C'>– R.</font>"},
            {"23", "3", "", "Ž 103, 1-2. 3-4. 8+10",
                    "<font color='#B71C1C'>R.:</font> Duša moja, dobroreč svojmu Bohu.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia. <font color='#B71C1C'>– R.</font><br>" +
                            "Veď on ti odpúšťa všetky neprávosti, <font color='#B71C1C'>*</font><br>" +
                            "on lieči všetky tvoje neduhy;<br>" +
                            "on vykupuje tvoj život zo záhuby, <font color='#B71C1C'>*</font><br>" +
                            "on ťa venčí milosrdenstvom a milosťou. <font color='#B71C1C'>– R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a dobrotivý nesmierne.<br>" +
                            "Nezaobchodí s nami podľa našich hriechov, <font color='#B71C1C'>*</font><br>" +
                            "ani nám neodpláca podľa našich neprávostí. <font color='#B71C1C'>– R.</font>"},
            {"24", "4", "", "Ž 145, 1+9. 10-11. 12-13b",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán, zhovievavý a veľmi láskavý.<br><br>" +
                            "Oslavovať ťa chcem, Bože, môj kráľ, <font color='#B71C1C'>*</font><br>" +
                            "a tvoje meno velebiť navždy a naveky.<br>" +
                            "Dobrý je Pán ku každému <font color='#B71C1C'>*</font><br>" +
                            "a milostivý ku všetkým svojim stvoreniam. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech ťa oslavujú, Pane, všetky tvoje diela <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech ťa velebia.<br>" +
                            "Nech rozprávajú o sláve tvojho kráľovstva <font color='#B71C1C'>*</font><br>" +
                            "a o tvojej moci nech hovoria; <font color='#B71C1C'>– R.</font><br>" +
                            "nech ľuďom oznamujú tvoje zázraky <font color='#B71C1C'>*</font><br>" +
                            "i slávu a velebu tvojho kráľovstva.<br>" +
                            "Tvoje kráľovstvo je kráľovstvo pre všetky veky <font color='#B71C1C'>*</font><br>" +
                            "a tvoja vláda sa rozprestiera na všetky pokolenia. <font color='#B71C1C'>– R.</font>"},
            {"25", "5", "", "Ž 1, 1-2. 3. 4+6",
                    "<font color='#B71C1C'>R.:</font> Pane, kto nasleduje teba, bude mať svetlo života.<br><br>" +
                            "Blažený človek, čo nekráča podľa rady bezbožných †<br>" +
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
            {"26", "6", "", "Ž 80, 2ac+3bc. 15-16. 18-19",
                    "<font color='#B71C1C'>R.:</font> Bože, obnov nás, rozjasni svoju tvár a budeme spasení.<br><br>" +
                            "Pastier Izraela, počúvaj! <font color='#B71C1C'>*</font><br>" +
                            "Ty, čo tróniš nad cherubmi, zaskvej sa! <br>" +
                            "Vzbuď svoju moc <font color='#B71C1C'>*</font><br>" +
                            "a príď nás zachrániť. <font color='#B71C1C'>– R.</font> <br>" +
                            "Bože zástupov, vráť sa, <font color='#B71C1C'>*</font><br>" +
                            "zhliadni z neba, podívaj sa a navštív túto vinicu. <br>" +
                            "A chráň ju, veď ju vysadila tvoja pravica, <font color='#B71C1C'>*</font><br>" +
                            "chráň i výhonok, ktorý si si vypestoval. <font color='#B71C1C'>– R.</font> <br>" +
                            "Nech je tvoja ruka nad mužom po tvojej pravici, <font color='#B71C1C'>*</font><br>" +
                            "nad synom človeka, ktorého si si ty vyvolil. <br>" +
                            "Už neodstúpime od teba a ty nás zachováš pri živote <font color='#B71C1C'>*</font><br>" +
                            "a budeme vzývať tvoje meno. <font color='#B71C1C'>– R.</font>"},
            {"30", "A", "", "Ž 146, 6c-7. 8-9a. 9b-10",
                    "<font color='#B71C1C'>R.:</font> Príď, Pane, príď a zachráň nás.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Pán zachováva vernosť naveky, <font color='#B71C1C'>*</font><br>" +
                            "utláčaným prisudzuje právo, <br>" +
                            "hladujúcim dáva chlieb. <font color='#B71C1C'>*</font><br>" +
                            "Pán vyslobodzuje väzňov, <font color='#B71C1C'>– R.</font> <br>" +
                            "Pán otvára oči slepým, <font color='#B71C1C'>*</font><br>" +
                            "Pán dvíha skľúčených, <br>" +
                            "Pán miluje spravodlivých. <font color='#B71C1C'>*</font><br>" +
                            "Pán ochraňuje cudzincov, <font color='#B71C1C'>– R.</font> <br>" +
                            "ujíma sa siroty a vdovy, <font color='#B71C1C'>*</font><br>" +
                            "ale hatí cesty hriešnikov. <br>" +
                            "Pán bude kraľovať naveky; <font color='#B71C1C'>*</font><br>" +
                            "tvoj Boh, Sion, z pokolenia na pokolenie. <font color='#B71C1C'>– R.</font>"},
            {"30", "B", "", "Lk 1, 46b-48. 49-50. 53-54",
                    "<font color='#B71C1C'>R.:</font> Duša mi plesá v mojom Bohu.<br><br>" +
                            "Velebí moja duša Pána <font color='#B71C1C'>*</font><br>" +
                            "a môj duch jasá v Bohu, mojom spasiteľovi,<br>" +
                            "lebo zhliadol na poníženosť svojej služobnice. <font color='#B71C1C'>*</font><br>" +
                            "Hľa, od tejto chvíle<br>" +
                            "blahoslaviť ma budú všetky pokolenia, <font color='#B71C1C'>– R.</font><br>" +
                            "lebo veľké veci mi urobil ten, ktorý je mocný, <font color='#B71C1C'>*</font><br>" +
                            "a sväté je jeho meno<br>" +
                            "a jeho milosrdenstvo z pokolenia na pokolenie <font color='#B71C1C'>*</font><br>" +
                            "s tými, čo sa ho boja. <font color='#B71C1C'>– R.</font><br>" +
                            "Hladných nakŕmil dobrotami <font color='#B71C1C'>*</font><br>" +
                            "a bohatých prepustil naprázdno.<br>" +
                            "Ujal sa Izraela, svojho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "lebo pamätá na svoje milosrdenstvo. <font color='#B71C1C'>– R.</font>"},
            {"30", "C", "", "Iz 12, 2-3. 4b-d. 5-6",
                    "<font color='#B71C1C'>R.:</font> Plesajme a jasajme, lebo uprostred nás je Svätý, Boh.<br><br>" +
                            "\"Hľa, Boh je moja spása; <font color='#B71C1C'>*</font><br>" +
                            "dúfam a nebojím sa,<br>" +
                            "lebo moja sila a chvála je Pán, <font color='#B71C1C'>*</font><br>" +
                            "on sa mi stal záchrancom.\"<br>" +
                            "Budete čerpať vodu s radosťou <font color='#B71C1C'>*</font><br>" +
                            "z prameňov spásy. <font color='#B71C1C'>– R.</font><br>" +
                            "\"Oslavujte Pána a vzývajte jeho meno, †<br>" +
                            "ohlasujte medzi národmi jeho zázraky, <font color='#B71C1C'>*</font><br>" +
                            "pamätajte, že jeho meno je vznešené. <font color='#B71C1C'>– R.</font><br>" +
                            "Spievajte Pánovi, lebo urobil veľké veci; <font color='#B71C1C'>*</font><br>" +
                            "nech je to známe po celej zemi.<br>" +
                            "Plesaj a jasaj, obyvateľka Siona, <font color='#B71C1C'>*</font><br>" +
                            "lebo veľký uprostred teba je Svätý Izraela.\" <font color='#B71C1C'>– R.</font>"},
            {"31", "1", "", "Ž 25, 4-5b. 6+7bc. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pouč ma, Pane, o svojich chodníkoch.<br><br>" +
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
            {"32", "2", "", "Ž 34, 2-3. 6-7. 17-18. 19+23",
                    "<font color='#B71C1C'>R.:</font> Úbožiak zavolal a Pán ho vyslyšal.<br><br>" +
                            "Pána chcem velebiť v každom čase, <font color='#B71C1C'>*</font><br>" +
                            "moje ústa budú ho vždy chváliť.<br>" +
                            "V Pánovi sa bude chváliť moja duša; <font color='#B71C1C'>*</font><br>" +
                            "nechže to počujú pokorní a nech sa tešia. <font color='#B71C1C'>– R.</font><br>" +
                            "Na neho hľaďte a budete žiariť <font color='#B71C1C'>*</font><br>" +
                            "a tvár vám nesčervenie hanbou.<br>" +
                            "Úbožiak zavolal a Pán ho vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ho zo všetkých tiesní. <font color='#B71C1C'>– R.</font><br>" +
                            "Tvár Pánova sa odvracia od tých, čo robia zlo, <font color='#B71C1C'>*</font><br>" +
                            "a vyhladzuje ich pamiatku zo zeme.<br>" +
                            "Spravodliví volali a Pán ich vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ich zo všetkých tiesní. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán je pri tých, čo majú srdce skrúšené, <font color='#B71C1C'>*</font><br>" +
                            "a zachraňuje zlomených na duchu.<br>" +
                            "Pán vykúpi duše svojich služobníkov, <font color='#B71C1C'>*</font><br>" +
                            "nebudú potrestaní tí, čo v neho dúfajú. <font color='#B71C1C'>– R.</font>"},
            {"33", "3", "", "Ž 85, 9ab+10. 11-12. 13-14",
                    "<font color='#B71C1C'>R.:</font> Roste, nebesia, z výsosti, z oblakov nech prší spravodlivosť.<br><br>" +
                            "Budem počúvať, čo povie Pán, Boh; <font color='#B71C1C'>*</font><br>" +
                            "on ohlási pokoj svojmu ľudu a svojim svätým.<br>" +
                            "Naozaj: blízko je spása tým, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "a jeho sláva bude prebývať v našej krajine. <font color='#B71C1C'>– R.</font><br>" +
                            "Milosrdenstvo a vernosť sa stretnú navzájom, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a pokoj sa pobozkajú.<br>" +
                            "Vernosť vyrastie zo zeme, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť zhliadne z neba. <font color='#B71C1C'>– R.</font><br>" +
                            "Veď Pán dá požehnanie <font color='#B71C1C'>*</font><br>" +
                            "a svoje plody vydá naša zem.<br>" +
                            "Pred ním bude kráčať spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a po stopách jeho krokov spása. <font color='#B71C1C'>– R.</font>"},
            {"34", "4", "", "Ž 30, 2+4. 5-6. 11-12a+13b",
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
            {"35", "5", "", "Ž 67, 2-3. 5. 7-8",
                    "<font color='#B71C1C'>R.:</font> Bože, nech ťa velebia národy, nech ťa velebia všetky národy.<br><br>" +
                            "Bože, buď nám milostivý a žehnaj nás; <font color='#B71C1C'>*</font><br>" +
                            "a tvoja tvár nech žiari nad nami,<br>" +
                            "aby sa tvoja cesta stala známou na zemi <font color='#B71C1C'>*</font><br>" +
                            "a tvoja spása medzi všetkými národmi. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech sa tešia a jasajú národy, †<br>" +
                            "že spravodlivo súdiš ľudí <font color='#B71C1C'>*</font><br>" +
                            "a spravuješ národy na zemi. <font color='#B71C1C'>– R.</font><br>" +
                            "Zem vydala svoj plod; <font color='#B71C1C'>*</font><br>" +
                            "nech nás požehná Boh, náš Boh;<br>" +
                            "nech nás Boh požehná <font color='#B71C1C'>*</font><br>" +
                            "a nech si ho ctia všetky končiny zeme. <font color='#B71C1C'>– R.</font>"},
            {"40", "A", "", "Ž 24, 1-2. 3-4b. 5-6",
                    "<font color='#B71C1C'>R.:</font> Hľa, prichádza Pán, on je Kráľ slávy.<br><br>" +
                            "Pánova je zem i všetko, čo ju napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "okruh zeme aj tí, čo bývajú na ňom.<br>" +
                            "Veď on sám položil jeho základy na moriach <font color='#B71C1C'>*</font><br>" +
                            "a upevnil ho na vodách. <font color='#B71C1C'>– R.</font><br>" +
                            "Kto smie vystúpiť na vrch Pánov, <font color='#B71C1C'>*</font><br>" +
                            "kto smie stáť na jeho mieste posvätnom?<br>" +
                            "Ten, čo má ruky nevinné a srdce čisté, <font color='#B71C1C'>*</font><br>" +
                            "čo nedvíha svoju dušu k márnosti. <font color='#B71C1C'>– R.</font><br>" +
                            "Taký dostane požehnanie od Pána <font color='#B71C1C'>*</font><br>" +
                            "a odmenu od Boha, svojho spasiteľa.<br>" +
                            "To je pokolenie tých, čo ho hľadajú, <font color='#B71C1C'>*</font><br>" +
                            "čo hľadajú tvár Boha Jakubovho. <font color='#B71C1C'>– R.</font>"},
            {"40", "B", "", "Ž 89, 2-3. 4-5. 27+29",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, ospevovať budem naveky.<br><br>" +
                            "Pánovo milosrdenstvo chcem ospevovať naveky; <font color='#B71C1C'>*</font><br>" +
                            "po všetky pokolenia hlásať svojimi ústami tvoju vernosť.<br>" +
                            "Veď ty si povedal:<br>" +
                            "\"Moje milosrdenstvo je ustanovené naveky.\" <font color='#B71C1C'>*</font><br>" +
                            "Tvoja vernosť je upevnená v nebesiach. <font color='#B71C1C'>– R.</font><br>" +
                            "\"Zmluvu som uzavrel so svojím vyvoleným, <font color='#B71C1C'>*</font><br>" +
                            "svojmu služobníkovi Dávidovi som prisahal:<br>" +
                            "Naveky zaistím tvoj rod <font color='#B71C1C'>*</font><br>" +
                            "a postavím tvoj trón, čo pretrvá všetky pokolenia.\" <font color='#B71C1C'>– R.</font><br>" +
                            "On bude volať ku mne: \"Ty si môj otec, <font color='#B71C1C'>*</font><br>" +
                            "môj Boh a útočište mojej spásy.\"<br>" +
                            "Naveky mu svoju milosť zachovám <font color='#B71C1C'>*</font><br>" +
                            "a pevná bude moja zmluva s ním. <font color='#B71C1C'>– R.</font>"},
            {"40", "C", "", "Ž 80, 2ac+3bc. 15-16. 18-19",
                    "<font color='#B71C1C'>R.:</font> Bože, obnov nás, rozjasni svoju tvár a budeme spasení.<br><br>" +
                            "Pastier Izraela, počúvaj! <font color='#B71C1C'>*</font><br>" +
                            "Ty, čo tróniš nad cherubmi, zaskvej sa! <br>" +
                            "Vzbuď svoju moc <font color='#B71C1C'>*</font><br>" +
                            "a príď nás zachrániť. <font color='#B71C1C'>– R.</font> <br>" +
                            "Bože zástupov, vráť sa, <font color='#B71C1C'>*</font><br>" +
                            "zhliadni z neba, podívaj sa a navštív túto vinicu. <br>" +
                            "A chráň ju, veď ju vysadila tvoja pravica, <font color='#B71C1C'>*</font><br>" +
                            "chráň i výhonok, ktorý si si vypestoval. <font color='#B71C1C'>– R.</font> <br>" +
                            "Nech je tvoja ruka nad mužom po tvojej pravici, <font color='#B71C1C'>*</font><br>" +
                            "nad synom človeka, ktorého si si ty vyvolil. <br>" +
                            "Už neodstúpime od teba a ty nás zachováš pri živote <font color='#B71C1C'>*</font><br>" +
                            "a budeme vzývať tvoje meno. <font color='#B71C1C'>– R.</font>"},
    };

    String[][] adventAleluja = {
            {"10", "A", "", "Ž 85, 8", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ukáž nám, Pane, svoje milosrdenstvo a daj nám svoju spásu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"10", "B", "", "Ž 85, 8", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ukáž nám, Pane, svoje milosrdenstvo a daj nám svoju spásu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"10", "C", "", "Ž 85, 8", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ukáž nám, Pane, svoje milosrdenstvo a daj nám svoju spásu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"11", "1", "", "Porov. Ž 80, 4", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Príď, Pane, Bože náš, a zachráň nás! Ukáž nám svoju tvár a budeme spasení. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"12", "2", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Hľa, náš Pán príde s veľkou mocou a osvieti zrak svojich služobníkov. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"13", "3", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Hľa, Pán príde a spasí svoj ľud; blahoslavení tí, čo sú pripravení uvítať ho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"14", "4", "", "Iz 55, 6", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Hľadajte Pána, kým ho možno nájsť; volajte ho, kým je na blízku. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"15", "5", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Hľa, náš Pán príde s veľkou mocou a osvieti zrak svojich služobníkov. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"16", "6", "", "Iz 33, 22", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pán je náš sudca, Pán je náš zákonodarca, Pán je náš kráľ; on nás spasí. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"20", "A", "", "Lk 3, 4cd. 6", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pripravte cestu Pánovi, vyrovnajte mu chodníky! A každé telo uvidí jeho spásu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"20", "B", "", "Lk 3, 4cd. 6", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pripravte cestu Pánovi, vyrovnajte mu chodníky! A každé telo uvidí Božiu spásu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"20", "C", "", "Lk 3, 4cd. 6", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pripravte cestu Pánovi, vyrovnajte mu chodníky! A každé telo uvidí jeho spásu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"21", "1", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Hľa, príde Kráľ, Pán zeme; on sám vezme z nás jarmo nášho zajatia. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"22", "2", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blízko je deň Pána; hľa, príde a spasí nás. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"23", "3", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Hľa, Pán príde a spasí svoj ľud; blahoslavení tí, čo sú pripravení uvítať ho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"24", "4", "", "Porov. Iz 45, 8", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Roste, nebesia, z výsosti, oblaky, dajte Spravodlivého; otvor sa, zem, a zroď Spasiteľa. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"25", "5", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pán príde, choďte mu v ústrety; on je to, knieža pokoja. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"26", "6", "", "Lk 3, 4cd. 6", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pripravte cestu Pánovi, vyrovnajte mu chodníky! A každé telo uvidí jeho spásu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "A", "", "Iz 61, 1 (u Lk 4, 18)", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Duch Pána je nado mnou; poslal ma hlásať radostnú zvesť chudobným. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "B", "", "Iz 61, 1 (u Lk 4, 18)", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Duch Pána je nado mnou; poslal ma hlásať radostnú zvesť chudobným. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "C", "", "Iz 61, 1 (u Lk 4, 18)", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Duch Pána je nado mnou; poslal ma hlásať radostnú zvesť chudobným. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"31", "1", "", "Ž 85, 8", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ukáž nám, Pane, svoje milosrdenstvo a daj nám svoju spásu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"32", "2", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Príď, Pane, nemeškaj! Zbav svoj ľud jeho zlých skutkov. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"33", "3", "", "Iz 40, 9cd. 10a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zodvihni mocne svoj hlas, ty, čo hlásaš radostnú zvesť; hľa, Pán, Boh, prichádza so všetkou mocou. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"34", "4", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pripravte cestu Pánovi, vyrovnajte mu chodníky! A každé telo uvidí Božiu spásu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"35", "5", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Príď, Pane, navštív nás v pokoji, aby sme sa radovali z celého srdca pred tebou. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"40", "A", "", "Mt 1, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Hľa, panna počne a porodí syna a dajú mu meno Emanuel, Boh s nami. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"40", "B", "", "Lk 1, 38", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Hľa, služobnica Pána, nech sa mi stane podľa tvojho slova. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"40", "C", "", "Lk 1, 38", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Hľa, služobnica Pána, nech sa mi stane podľa tvojho slova. <font color='#B71C1C'>– R.</font> Aleluja."},
    };
}
