package sk.missa.interfaces;

/*
 * Responzóziové žalmy na sviatky svätých uložené v dvojrozmerných poliach za každý mesiac: zalm1, zalm2...
 * {ID sviatku (podľa mesiacov v interface Svatci), "", "", súradnice, text},
 * Responzóriové žalmy pre pohyblivé sviatky: zalmPohyb
 * {ID sviatku (podľa interface Svatci), liturgický rok (A, B, C), "", súradnice, text},
 *
 * Alelujové žalmy na sviatky svätých uložené v dvojrozmerných poliach za každý mesiac: aleluja1, aleluja2...
 * {ID sviatku (podľa mesiacov v interface Svatci), "", "", súradnice, text},
 * Alelujové žalmy pre pohyblivé sviatky: alelujaPohyb
 * {ID sviatku (podľa interface Svatci), liturgický rok (A, B, C), "", súradnice, text},
 *
 * Keďže sú žalmy a alelujové verše v adventnom a vianočnom období viazané na deň, nachádzajú sa uložené v mesiaci, ktorému prislúchajú a s dňom ako ID
 */

public interface Zalmy_svatci {
    String[][] zalmPohyb = {
            {"0gkp", "", "", "Ž 89, 2-3. 4-5. 27+29",
                    "<font color='#B71C1C'>R.:</font> Jeho rod bude trvať naveky.<br><br>" +
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
            {"1gkp", "", "", "Ž 40, 7-8a. 8b-9. 10. 11",
                    "<font color='#B71C1C'>R.:</font> Hľa, prichádzam, Pane, chcem plniť tvoju vôľu.<br><br>" +
                            "Obety a dary si nepraješ, <font color='#B71C1C'>*</font><br>" +
                            "lež uši si mi otvoril.<br>" +
                            "Nežiadaš žertvu ani obetu zmierenia, <font color='#B71C1C'>*</font><br>" +
                            "preto som povedal: \"Hľa prichádzam. <font color='#B71C1C'>– R.</font><br>" +
                            "Vo zvitku knihy je napísané o mne, <font color='#B71C1C'>*</font><br>" +
                            "že mám plniť tvoju vôľu.<br>" +
                            "A to chcem, Bože môj, <font color='#B71C1C'>*</font><br>" +
                            "hlboko v srdci mám tvoj zákon.\" <font color='#B71C1C'>– R.</font><br>" +
                            "Ohlasujem tvoju spravodlivosť<br>" +
                            "vo veľkom zhromaždení; <font color='#B71C1C'>*</font><br>" +
                            "svojim perám hovoriť nebránim, Pane, ty to vieš. <font color='#B71C1C'>– R.</font><br>" +
                            "Tvoju spravodlivosť si v srdci neskrývam, <font color='#B71C1C'>*</font><br>" +
                            "rozprávam o tvojej vernosti a o tvojej spáse.<br>" +
                            "Neskrývam tvoju milosť a pravdu <font color='#B71C1C'>*</font><br>" +
                            "pred veľkým zhromaždením. <font color='#B71C1C'>– R.</font>"},
            {"1op", "", "", "Ž 117, 1. 2",
                    "<font color='#B71C1C'>R.:</font> Budete mi svedkami až po samý kraj zeme.<br><br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľte Pána, všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "oslavujte ho, všetci ľudia; <font color='#B71C1C'>– R.</font><br>" +
                            "lebo je veľké jeho milosrdenstvo voči nám <font color='#B71C1C'>*</font><br>" +
                            "a pravda Pánova trvá naveky. <font color='#B71C1C'>– R.</font>"},
            {"2p", "", "", "Ž 87, 1-2. 3 a 5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Slávne veci sa hovoria o tebe, mesto Božie.<br><br>" +
                            "Základy má na posvätných vrchoch; +<br>" +
                            "brány Siona miluje Pán <font color='#B71C1C'>*</font><br>" +
                            "nad všetky stany Jakuba. <font color='#B71C1C'>– R.</font><br>" +
                            "Slávne veci sa hovoria o tebe, <font color='#B71C1C'>*</font><br>" +
                            "mesto Božie.<br>" +
                            "A o Sione sa bude hovoriť: \"Ten i tamten sa na ňom narodil <font color='#B71C1C'>*</font><br>" +
                            "a sám Najvyšší mu dal pevné základy.\" <font color='#B71C1C'>– R.</font><br>" +
                            "Pán zaznačí do knihy národov: <font color='#B71C1C'>*</font><br>" +
                            "\"Títo sa tam zrodili.\"<br>" +
                            "A spievajú ako pri tanci: <font color='#B71C1C'>*</font><br>" +
                            "\"V tebe sú všetky moje pramene.\" <font color='#B71C1C'>– R.</font>"},

            //Nášho Pána Ježiša Krista, najvyššieho a večného kňaza
            {"3gp", "A", "", "Ž 40, 7-8a. 8b-9. 10-11ab. 17",
                    "<font color='#B71C1C'>R.:</font> Hľa, prichádzam, Pane, chcem plniť tvoju vôľu.<br><br>" +
                            "Obety a dary si nepraješ,<br>" +
                            "lež uši si mi otvoril.<br>" +
                            "Nežiadaš žertvu ani obetu zmierenia,<br>" +
                            "preto som povedal: \"Hľa prichádzam. <font color='#B71C1C'>– R.</font><br>" +
                            "Vo zvitku knihy je napísané o mne,<br>" +
                            "že mám plniť tvoju vôľu.<br>" +
                            "A to chcem, Bože môj,<br>" +
                            "hlboko v srdci mám tvoj zákon.\" <font color='#B71C1C'>– R.</font><br>" +
                            "Ohlasujem tvoju spravodlivosť vo veľkom zhromaždení;<br>" +
                            "svojim perám hovoriť nebránim, Pane, ty to vieš.<br>" +
                            "Tvoju spravodlivosť si v srdci neskrývam,<br>" +
                            "rozprávam o tvojej vernosti a o tvojej spáse. <font color='#B71C1C'>– R.</font><br>" +
                            "No nech jasajú a nech sa v tebe tešia všetci,<br>" +
                            "čo ťa hľadajú.<br>" +
                            "A tí, čo túžia po tvojej pomoci, nech stále hovoria:<br>" +
                            "\"Nech je zvelebený Pán!\" <font color='#B71C1C'>– R.</font>"},
            {"", "B", "", "Ž 110, 1b-e. 2. 3",
                    "<font color='#B71C1C'>R.:</font> Ty si kňaz naveky podľa radu Melchizedechovho.<br><br>" +
                            "Pán povedal môjmu Pánovi:<br>" +
                            "\"Seď po mojej pravici,<br>" +
                            "kým nepoložím tvojich nepriateľov<br>" +
                            "za podnožku tvojim nohám.\" <font color='#B71C1C'>– R.</font><br>" +
                            "Moc tvojho žezla rozšíri Pán zo Siona:<br>" +
                            "panuj uprostred svojich nepriateľov. <font color='#B71C1C'>– R.</font><br>" +
                            "Odo dňa tvojho narodenia patrí ti vláda<br>" +
                            "v posvätnej nádhere.<br>" +
                            "Splodil som ťa ako rosu pred východom zornice. <font color='#B71C1C'>– R.</font>"},
            {"", "C", "", "Ž 23, 2-3. 5. 6",
                    "<font color='#B71C1C'>R.:</font> Pán je môj pastier, nič mi nechýba.<br><br>" +
                            "Pasie ma na zelených pašienkach.<br>" +
                            "Vodí ma k tichým vodám,<br>" +
                            "dušu mi osviežuje. <font color='#B71C1C'>– R.</font><br>" +
                            "Prestieraš mi stôl<br>" +
                            "pred očami mojich protivníkov.<br>" +
                            "Leješ mi olej na hlavu<br>" +
                            "a kalich mi napĺňaš až po okraj. <font color='#B71C1C'>– R.</font><br>" +
                            "Dobrota a milosť budú ma sprevádzať<br>" +
                            "po všetky dni môjho života.<br>" +
                            "A budem bývať v dome Pánovom<br>" +
                            "mnoho a mnoho dní. <font color='#B71C1C'>– R.</font>"},
            {"6gkp", "", "", "Ž 47, 2-3. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pán vystupuje do neba za hlaholu poľnice.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Tlieskajte rukami, všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "jasajte Bohu hlasom radostným.<br>" +
                            "Lebo Pán je Najvyšší a hrozný, <font color='#B71C1C'>*</font><br>" +
                            "nad celou zemou veľký kráľ. <font color='#B71C1C'>– R.</font><br>" +
                            "Za jasotu vystupuje Boh, <font color='#B71C1C'>*</font><br>" +
                            "Pán vystupuje za hlaholu poľnice.<br>" +
                            "Spievajte Bohu, spievajte, <font color='#B71C1C'>*</font><br>" +
                            "spievajte nášmu kráľovi, spievajte. <font color='#B71C1C'>– R.</font><br>" +
                            "Pretože Boh je kráľom celej zeme; <font color='#B71C1C'>*</font><br>" +
                            "spievajte mu chválospev.<br>" +
                            "Boh kraľuje nad národmi, <font color='#B71C1C'>*</font><br>" +
                            "Boh sedí na svojom svätom tróne. <font color='#B71C1C'>– R.</font>"},

            //Najsvätejšej Trojice
            {"7gkp", "A", "", "Porov. Dan 3, 52. 53. 54. 55. 56",
                    "<font color='#B71C1C'>R.:</font> Chvála ti a sláva naveky.<br><br>" +
                            "Slávny si, Pane, Bože našich otcov. <font color='#B71C1C'>*</font><br>" +
                            "Slávne je, Pane, tvoje meno, nesmierne veľké a sväté. <font color='#B71C1C'>– R.</font><br>" +
                            "Slávny si, Pane, <font color='#B71C1C'>*</font><br>" +
                            "vo svojom chráme veľkom a svätom. <font color='#B71C1C'>– R.</font><br>" +
                            "Slávny si, Pane, <font color='#B71C1C'>*</font><br>" +
                            "na svojom kráľovskom tróne. <font color='#B71C1C'>– R.</font><br>" +
                            "Slávny si, Pane, <font color='#B71C1C'>*</font><br>" +
                            "čo prenikáš pohľadom priepasti<br>" +
                            "a tróniš nad cherubmi. <font color='#B71C1C'>– R.</font><br>" +
                            "Slávny si, Pane, <font color='#B71C1C'>*</font><br>" +
                            "na klenbe nebies. <font color='#B71C1C'>– R.</font>"},
            {"", "B", "", "Ž 33, 4-5. 6+9. 18-19. 20+22",
                    "<font color='#B71C1C'>R.:</font> Blažený ľud, ktorý patrí Pánovi.<br><br>" +
                            "Pánovo slovo je pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a verné všetko jeho konanie.<br>" +
                            "Miluje spravodlivosť a právo; <font color='#B71C1C'>*</font><br>" +
                            "milosti Pánovej plná je zem. <font color='#B71C1C'>– R.</font><br>" +
                            "Pánovým slovom povstali nebesia <font color='#B71C1C'>*</font><br>" +
                            "a dychom jeho úst všetky ich voje.<br>" +
                            "Lebo on riekol a stalo sa, <font color='#B71C1C'>*</font><br>" +
                            "on rozkázal a všetko bolo stvorené. <font color='#B71C1C'>– R.</font><br>" +
                            "Hľa, oko Pánovo bdie nad tými, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "nad tými, čo v jeho milosrdenstvo dúfajú,<br>" +
                            "aby ich zachránil pred smrťou <font color='#B71C1C'>*</font><br>" +
                            "a v čase hladu nakŕmil. <font color='#B71C1C'>– R.</font><br>" +
                            "Naša duša očakáva Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je naša pomoc a ochrana.<br>" +
                            "Tvoje milosrdenstvo, Pane, nech je nad nami, <font color='#B71C1C'>*</font><br>" +
                            "ako dúfame v teba. <font color='#B71C1C'>– R.</font>"},
            {"", "C", "", "Ž 8, 4-5. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pane, náš Vládca, aké vznešené je tvoje meno na celej zemi.<br><br>" +
                            "Keď hľadím na nebesia, dielo tvojich rúk, <font color='#B71C1C'>*</font><br>" +
                            "na mesiac a na hviezdy, ktoré si ty stvoril:<br>" +
                            "čože je človek, že naň pamätáš, <font color='#B71C1C'>*</font><br>" +
                            "a syn človeka, že sa ho ujímaš? <font color='#B71C1C'>– R.</font><br>" +
                            "Stvoril si ho len o niečo menšieho od anjelov, <font color='#B71C1C'>*</font><br>" +
                            "slávou a cťou si ho ovenčil<br>" +
                            "a ustanovil si ho za vládcu nad dielami tvojich rúk. <font color='#B71C1C'>*</font><br>" +
                            "Všetko si mu položil pod nohy: <font color='#B71C1C'>– R.</font><br>" +
                            "ovce a všetok domáci statok <font color='#B71C1C'>*</font><br>" +
                            "aj všetku poľnú zver,<br>" +
                            "vtáctvo pod oblohou a ryby v mori <font color='#B71C1C'>*</font><br>" +
                            "i všetko, čo sa hýbe po dne morskom. <font color='#B71C1C'>– R.</font>"},

            //PRIKÁZANÝ SVIATOK – Najsvätejšieho Kristovho Tela a Krvi
            {"4gkp", "A", "", "Ž 147, 12-13. 14-15. 19-20",
                    "<font color='#B71C1C'>R.:</font> Chváľ, Jeruzalem, Pána, oslavuj, Sion, svojho Boha. <br><br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľ, Jeruzalem, Pána, <font color='#B71C1C'>*</font><br>" +
                            "oslavuj, Sion, svojho Boha.<br>" +
                            "Lebo upevnil závory tvojich brán <font color='#B71C1C'>*</font><br>" +
                            "a požehnal tvojich synov v tebe. <font color='#B71C1C'>– R.</font><br>" +
                            "Zaisťuje pokoj tvojim hraniciam, <font color='#B71C1C'>*</font><br>" +
                            "sýti ťa najlepšou pšenicou.<br>" +
                            "Svoj rozkaz na zem zosiela; <font color='#B71C1C'>*</font><br>" +
                            "rýchlo sa šíri jeho slovo. <font color='#B71C1C'>– R.</font><br>" +
                            "On svoje slovo zvestuje Jakubovi, <font color='#B71C1C'>*</font><br>" +
                            "svoje zákony a prikázania Izraelovi.<br>" +
                            "Neurobil tak iným národom, <font color='#B71C1C'>*</font><br>" +
                            "nezjavil im svoje zámery. <font color='#B71C1C'>– R.</font>"},
            {"", "B", "", "Ž 116, 12-13. 15+16bc. 17-18",
                    "<font color='#B71C1C'>R.:</font> Vezmem kalich spásy a budem vzývať meno Pánovo. <br><br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Čím sa odvďačím Pánovi <font color='#B71C1C'>*</font><br>" +
                            "za všetko, čo mi dal?<br>" +
                            "Vezmem kalich spásy <font color='#B71C1C'>*</font><br>" +
                            "a budem vzývať meno Pánovo. <font color='#B71C1C'>– R.</font><br>" +
                            "V Pánových očiach má veľkú cenu <font color='#B71C1C'>*</font><br>" +
                            "smrť jeho svätých.<br>" +
                            "Pane, som tvoj sluha a syn tvojej služobnice. <font color='#B71C1C'>*</font><br>" +
                            "Ty si mi putá rozviazal: <font color='#B71C1C'>– R.</font><br>" +
                            "obetu chvály ti prinesiem <font color='#B71C1C'>*</font><br>" +
                            "a budem vzývať meno Pánovo.<br>" +
                            "Splním svoje sľuby Pánovi <font color='#B71C1C'>*</font><br>" +
                            "pred všetkým jeho ľudom. <font color='#B71C1C'>– R.</font>"},
            {"", "C", "", "Ž 110, 1. 2. 3. 4",
                    "<font color='#B71C1C'>R.:</font> Kriste, ty si kňaz naveky podľa radu Melchizedechovho.<br><br>" +
                            "Pán povedal môjmu Pánovi: <font color='#B71C1C'>*</font><br>" +
                            "\"Seď po mojej pravici,<br>" +
                            "kým nepoložím tvojich nepriateľov <font color='#B71C1C'>*</font><br>" +
                            "za podnožku tvojim nohám.\" <font color='#B71C1C'>– R.</font><br>" +
                            "Moc tvojho žezla rozšíri Pán zo Siona: <font color='#B71C1C'>*</font><br>" +
                            "panuj uprostred svojich nepriateľov. <font color='#B71C1C'>– R.</font><br>" +
                            "Odo dňa tvojho narodenia patrí ti vláda <font color='#B71C1C'>†</font><br>" +
                            "v posvätnej nádhere. <font color='#B71C1C'>*</font><br>" +
                            "Splodil som ťa ako rosu pred východom zornice. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán prisahal a nebude ľutovať: <font color='#B71C1C'>*</font><br>" +
                            "\"Ty si kňaz naveky podľa radu Melchizedechovho.\" <font color='#B71C1C'>– R.</font>"},

            //Najsvätejšieho Srdca Ježišovho
            {"5gkp", "A", "", "Ž 103, 1-2. 3-4. 6-7. 8+10",
                    "<font color='#B71C1C'>R.:</font> Milosrdenstvo Pánovo je od večnosti voči tým, čo sa ho boja.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia. <font color='#B71C1C'>– R.</font><br>" +
                            "Veď on ti odpúšťa všetky neprávosti, <font color='#B71C1C'>*</font><br>" +
                            "on lieči všetky tvoje neduhy;<br>" +
                            "on vykupuje tvoj život zo záhuby, <font color='#B71C1C'>*</font><br>" +
                            "on ťa venčí milosrdenstvom a milosťou. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán koná spravodlivo <font color='#B71C1C'>*</font><br>" +
                            "a prisudzuje právo všetkým utláčaným<br>" +
                            "Mojžišovi zjavil svoje cesty <font color='#B71C1C'>*</font><br>" +
                            "a synom Izraela svoje skutky. <font color='#B71C1C'>– R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a dobrotivý nesmierne.<br>" +
                            "Nezaobchodí s nami podľa našich hriechov, <font color='#B71C1C'>*</font><br>" +
                            "ani nám neodpláca podľa našich neprávostí. <font color='#B71C1C'>– R.</font>"},
            {"", "B", "", "Iz 12, 2-3. 4b-d. 5-6",
                    "<font color='#B71C1C'>R.:</font> Čerpajme vodu s radosťou z prameňov spásy.<br><br>" +
                            "\"Hľa, Boh je moja spása; <font color='#B71C1C'>*</font><br>" +
                            "dúfam a nebojím sa,<br>" +
                            "lebo moja sila a chvála je Pán, <font color='#B71C1C'>*</font><br>" +
                            "on sa mi stal záchrancom.\"<br>" +
                            "Budete čerpať vodu s radosťou <font color='#B71C1C'>*</font><br>" +
                            "z prameňov spásy. <font color='#B71C1C'>– R.</font><br>" +
                            "\"Oslavujte Pána a vzývajte jeho meno, <font color='#B71C1C'>†</font><br>" +
                            "ohlasujte medzi národmi jeho zázraky, <font color='#B71C1C'>*</font><br>" +
                            "pamätajte, že jeho meno je vznešené. <font color='#B71C1C'>– R.</font><br>" +
                            "Spievajte Pánovi, lebo urobil veľké veci; <font color='#B71C1C'>*</font><br>" +
                            "nech je to známe po celej zemi.<br>" +
                            "Plesaj a jasaj, obyvateľka Siona, <font color='#B71C1C'>*</font><br>" +
                            "lebo veľký uprostred teba je Svätý Izraela.\" <font color='#B71C1C'>– R.</font>"},
            {"", "C", "", "Ž 23, 1-3a. 3b-4. 5. 6",
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
            {"4p", "", "", "1 Sam 2, 1b-e. 4-5. 6-7. 8a-d",
                    "<font color='#B71C1C'>R.:</font> Srdce mi plesá v mojom Bohu.<br><br>" +
                            "Srdce mi plesá v Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "v mojom Bohu rastie moja sila.<br>" +
                            "Otvorím si ústa proti mojim nepriateľom, <font color='#B71C1C'>*</font><br>" +
                            "lebo sa radujem z tvojej pomoci. <font color='#B71C1C'>– R.</font><br>" +
                            "Luk silákov sa zlomil, <font color='#B71C1C'>*</font><br>" +
                            "slabí sa opásali silou.<br>" +
                            "Tí, čo boli sýti, dávajú sa prenajímať za chlieb, <font color='#B71C1C'>*</font><br>" +
                            "no tí, čo hladovali, už nepoznajú núdzu.<br>" +
                            "Neplodná rodí mnoho ráz <font color='#B71C1C'>*</font><br>" +
                            "a tá, čo má veľa detí, vädne. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán dáva smrť i život, <font color='#B71C1C'>*</font><br>" +
                            "uvádza do ríše smrti a vyvádza naspäť.<br>" +
                            "Pán dáva schudobnieť, ale aj zbohatnúť, <font color='#B71C1C'>*</font><br>" +
                            "ponižuje aj vyvyšuje. <font color='#B71C1C'>– R.</font><br>" +
                            "Dvíha z prachu bedára <font color='#B71C1C'>*</font><br>" +
                            "a zo smetiska povyšuje chudobného.<br>" +
                            "Usádza ho medzi kniežatá <font color='#B71C1C'>*</font><br>" +
                            "a dáva mu trón slávy. <font color='#B71C1C'>– R.</font>"},
            {"2gkp", "", "", "Ž 104, 1-2a. 24+35c. 27-28. 29b-30",
                    "<font color='#B71C1C'>R.:</font> Pane, zošli svojho Ducha a obnov tvárnosť zeme.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Dobroreč, duša moja, Pánovi; <font color='#B71C1C'>*</font><br>" +
                            "Pane, Bože môj, ty si nesmierne veľký.<br>" +
                            "Odel si sa do slávy a veleby, <font color='#B71C1C'>*</font><br>" +
                            "do svetla si sa zahalil ako do rúcha. <font color='#B71C1C'>– R.</font><br>" +
                            "Aké mnohoraké sú tvoje diela, Pane! <font color='#B71C1C'>*</font><br>" +
                            "Všetko si múdro urobil.<br>" +
                            "Zem je plná tvojho stvorenstva. <font color='#B71C1C'>*</font><br>" +
                            "Dobroreč, duša moja, Pánovi. <font color='#B71C1C'>– R.</font><br>" +
                            "Všetko to čaká na teba, <font color='#B71C1C'>*</font><br>" +
                            "že im dáš pokrm v pravý čas.<br>" +
                            "Ty im ho dávaš a ony ho zbierajú; <font color='#B71C1C'>*</font><br>" +
                            "otváraš svoju ruku, sýtia sa dobrotami. <font color='#B71C1C'>– R.</font><br>" +
                            "Odnímaš im dych a hneď hynú <font color='#B71C1C'>*</font><br>" +
                            "a vracajú sa do prachu.<br>" +
                            "Keď zošleš svojho ducha, sú stvorené <font color='#B71C1C'>*</font><br>" +
                            "a obnovuješ tvárnosť zeme. <font color='#B71C1C'>– R.</font>"},
            {"3gkp", "", "", "Ž 104, 1ab+24ac. 29b-30. 31+34",
                    "<font color='#B71C1C'>R.:</font> Pane, zošli svojho Ducha a obnov tvárnosť zeme.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Dobroreč, duša moja, Pánovi; <font color='#B71C1C'>*</font><br>" +
                            "Pane, Bože môj, ty si nesmierne veľký.<br>" +
                            "Aké mnohoraké sú tvoje diela, Pane! <font color='#B71C1C'>*</font><br>" +
                            "Zem je plná tvojho stvorenstva. <font color='#B71C1C'>– R.</font><br>" +
                            "Odnímaš im dych a hneď hynú <font color='#B71C1C'>*</font><br>" +
                            "a vracajú sa do prachu.<br>" +
                            "Keď zošleš svojho ducha, sú stvorené <font color='#B71C1C'>*</font><br>" +
                            "a obnovuješ tvárnosť zeme. <font color='#B71C1C'>– R.</font><br>" +
                            "Pánova chvála nech trvá naveky; <font color='#B71C1C'>*</font><br>" +
                            "zo svojich diel nech sa teší Pán.<br>" +
                            "Kiež sa mu moja pieseň zapáči; <font color='#B71C1C'>*</font><br>" +
                            "a ja sa budem tešiť v Pánovi. <font color='#B71C1C'>– R.</font>"},
            {"8gkp", "A", "", "Ž 23, 1-2a. 2b-3. 5. 6",
                    "<font color='#B71C1C'>R.:</font> Pán je môj pastier, nič mi nechýba.<br><br>" +
                            "Pán je môj pastier, nič mi nechýba: <font color='#B71C1C'>*</font><br>" +
                            "pasie ma na zelených pašienkach.<font color='#B71C1C'> – R.</font><br>" +
                            "Vodí ma k tichým vodám, <font color='#B71C1C'>*</font><br>" +
                            "dušu mi osviežuje.<br>" +
                            "Vodí ma po správnych chodníkoch, <font color='#B71C1C'>*</font><br>" +
                            "verný svojmu menu.<font color='#B71C1C'> – R.</font><br>" +
                            "Prestieraš mi stôl <font color='#B71C1C'>*</font><br>" +
                            "pred očami mojich protivníkov.<br>" +
                            "Leješ mi olej na hlavu <font color='#B71C1C'>*</font><br>" +
                            "a kalich mi napĺňaš až po okraj.<font color='#B71C1C'> – R.</font><br>" +
                            "Dobrota a milosť budú ma sprevádzať <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni môjho života.<br>" +
                            "A budem bývať v dome Pánovom <font color='#B71C1C'>*</font><br>" +
                            "mnoho a mnoho dní.<font color='#B71C1C'> – R.</font>"},
            {"", "B", "", "Ž 93, 1ab. 1c-2. 5",
                    "<font color='#B71C1C'>R.:</font> Pán kraľuje, oslavujme ho.<br><br>" +
                            "Pán kraľuje, velebou sa zaodel; <font color='#B71C1C'>*</font><br>" +
                            "zaodel sa Pán, udatnosťou sa prepásal.<font color='#B71C1C'> – R.</font><br>" +
                            "Tak upevnil zemekruh, že sa nezachveje. <font color='#B71C1C'>*</font><br>" +
                            "Pevný je tvoj trón oddávna, ty si od vekov.<font color='#B71C1C'> – R.</font><br>" +
                            "Veľmi vierohodné sú tvoje svedectvá; <font color='#B71C1C'>*</font><br>" +
                            "tvojmu domu, Pane,<br>" +
                            "patrí posvätná úcta po všetky časy.<font color='#B71C1C'> – R.</font>"},
            {"", "C", "", "Ž 122, 1-2. 4-5",
                    "<font color='#B71C1C'>R.:</font> S radosťou pôjdeme do domu Pánovho.<br><br>" +
                            "Zaradoval som sa, keď mi povedali: <font color='#B71C1C'>*</font><br>" +
                            "\"Pôjdeme do domu Pánovho.\"<br>" +
                            "Naše nohy už stoja <font color='#B71C1C'>*</font><br>" +
                            "v tvojich bránach, Jeruzalem.<font color='#B71C1C'> – R.</font><br>" +
                            "Tam prichádzajú kmene, kmene Pánove, <font color='#B71C1C'>*</font><br>" +
                            "aby podľa obyčaje Izraela velebili meno Pánovo.<br>" +
                            "Lebo sú tam súdne stolice, <font color='#B71C1C'>*</font><br>" +
                            "stolice domu Dávidovho.<font color='#B71C1C'> – R.</font>"},
            //8. decembra - Nepoškvrnené počatie Panny Márie
            {"9gkp", "", "", "Ž 98, 1. 2-3b. 3c-4",
                    "<font color='#B71C1C'>R.:</font> Spievajte Pánovi pieseň novú, lebo vykonal veci zázračné.<br><br>" +
                            "Spievajte Pánovi pieseň novú, <font color='#B71C1C'>*</font><br>" +
                            "lebo vykonal veci zázračné.<br>" +
                            "Víťazstvo je dielom jeho pravice <font color='#B71C1C'>*</font><br>" +
                            "a jeho svätého ramena. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Pán oznámil svoju spásu, <font color='#B71C1C'>*</font><br>" +
                            "pred očami pohanov vyjavil svoju spravodlivosť.<br>" +
                            "Rozpamätal sa na svoju dobrotu <font color='#B71C1C'>*</font><br>" +
                            "a na svoju vernosť voči Izraelovmu domu. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Uzreli všetky končiny zeme <font color='#B71C1C'>*</font><br>" +
                            "spásu nášho Boha.<br>" +
                            "Na chválu Božiu jasaj, celá zem; <font color='#B71C1C'>*</font><br>" +
                            "plesajte, radujte sa a hrajte. <font color=‘#B71C1C’>– R.</font>"},
            // Svätej rodiny
            {"10gkp", "A", "", "Ž 128, 1-2. 3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Blažení sú všetci, čo sa boja Pána a kráčajú po jeho cestách.<br><br>" +
                    "Blažený každý, čo sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                    "a kráča po jeho cestách.<br>" +
                    "Budeš jesť z práce svojich rúk; <font color='#B71C1C'>*</font><br>" +
                    "budeš šťastný a budeš sa mať dobre. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Tvoja manželka je ako plodonosný vinič <font color='#B71C1C'>*</font><br>" +
                    "vnútri tvojho domu.<br>" +
                    "Tvoji synovia sú ako mládniky olivy <font color='#B71C1C'>*</font><br>" +
                    "okolo tvojho stola. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Veru, tak bude požehnaný muž, <font color='#B71C1C'>*</font><br>" +
                    "ktorý sa bojí Pána.<br>" +
                    "Nech ťa žehná Pán zo Siona, †<br>" +
                    "aby si videl šťastie Jeruzalema <font color='#B71C1C'>*</font><br>" +
                    "po všetky dni svojho života. <font color=‘#B71C1C’>– R.</font>"},
            {"", "B", "", "Ž 128, 1-2. 3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Blažení sú všetci, čo sa boja Pána a kráčajú po jeho cestách.<br><br>" +
                    "Blažený každý, čo sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                    "a kráča po jeho cestách.<br>" +
                    "Budeš jesť z práce svojich rúk; <font color='#B71C1C'>*</font><br>" +
                    "budeš šťastný a budeš sa mať dobre. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Tvoja manželka je ako plodonosný vinič <font color='#B71C1C'>*</font><br>" +
                    "vnútri tvojho domu.<br>" +
                    "Tvoji synovia sú ako mládniky olivy <font color='#B71C1C'>*</font><br>" +
                    "okolo tvojho stola. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Veru, tak bude požehnaný muž, <font color='#B71C1C'>*</font><br>" +
                    "ktorý sa bojí Pána.<br>" +
                    "Nech ťa žehná Pán zo Siona, †<br>" +
                    "aby si videl šťastie Jeruzalema <font color='#B71C1C'>*</font><br>" +
                    "po všetky dni svojho života. <font color=‘#B71C1C’>– R.</font>",
                    "Alebo:",
                    "Ž 105, 1b-2. 3-4. 5-6. 8-9",
                    "<font color='#B71C1C'>R.:</font> On je náš Pán a Boh, večne pamätá na svoju zmluvu.<br><br>" +
                    "Oslavujte Pána a vzývajte jeho meno, <font color='#B71C1C'>*</font><br>" +
                    "rozhlasujte jeho skutky medzi národmi.<br>" +
                    "Spievajte mu a hrajte, <font color='#B71C1C'>*</font><br>" +
                    "rozprávajte o jeho obdivuhodných skutkoch. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Jeho svätým menom sa honoste; <font color='#B71C1C'>*</font><br>" +
                    "nech sa radujú srdcia tých, čo hľadajú Pána.<br>" +
                    "Hľadajte Pána a jeho moc, <font color='#B71C1C'>*</font><br>" +
                    "hľadajte vždy jeho tvár. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Pamätajte na divy, čo učinil, <font color='#B71C1C'>*</font><br>" +
                    "na jeho znamenia a na výroky jeho úst,<br>" +
                    "vy, potomci Abraháma, Pánovho služobníka, <font color='#B71C1C'>*</font><br>" +
                    "synovia Jakuba, vyvoleného Pánovho. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Večne pamätá na svoju zmluvu, <font color='#B71C1C'>*</font><br>" +
                    "na sľub, ktorý dal pokoleniam tisícim,<br>" +
                    "na zmluvu, čo s Abrahámom uzavrel, <font color='#B71C1C'>*</font><br>" +
                    "na prísahu, ktorou sa Izákovi zaviazal. <font color=‘#B71C1C’>– R.</font>"},
            {"", "C", "", "Ž 128, 1-2. 3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Blažení sú všetci, čo sa boja Pána a kráčajú po jeho cestách.<br><br>" +
                            "Blažený každý, čo sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a kráča po jeho cestách.<br>" +
                            "Budeš jesť z práce svojich rúk; <font color='#B71C1C'>*</font><br>" +
                            "budeš šťastný a budeš sa mať dobre. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Tvoja manželka je ako plodonosný vinič <font color='#B71C1C'>*</font><br>" +
                            "vnútri tvojho domu.<br>" +
                            "Tvoji synovia sú ako mládniky olivy <font color='#B71C1C'>*</font><br>" +
                            "okolo tvojho stola. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Veru, tak bude požehnaný muž, <font color='#B71C1C'>*</font><br>" +
                            "ktorý sa bojí Pána.<br>" +
                            "Nech ťa žehná Pán zo Siona, †<br>" +
                            "aby si videl šťastie Jeruzalema <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni svojho života. <font color=‘#B71C1C’>– R.</font>",
                    "Alebo:",
                    "Ž 84, 2-3. 5-6. 9-10",
                    "<font color='#B71C1C'>R.:</font> Blažení tí, čo bývajú v tvojom dome, Pane.<br><br>" +
                    "Aké milé sú tvoje príbytky, Pane zástupov; <font color='#B71C1C'>*</font><br>" +
                    "túži a zmiera moja duša po nádvoriach Pánových.<br>" +
                    "Moje srdce i moje telo <font color='#B71C1C'>*</font><br>" +
                    "vznášajú sa k Bohu živému. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Blažení tí, čo bývajú v tvojom dome <font color='#B71C1C'>*</font><br>" +
                    "a bez prestania ťa velebia.<br>" +
                    "Blažený človek, ktorému ty pomáhaš, <font color='#B71C1C'>*</font><br>" +
                    "keď sa chystá na svätú púť. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Pane, Bože zástupov, čuj moju modlitbu, <font color='#B71C1C'>*</font><br>" +
                    "vypočuj ma, Bože Jakubov.<br>" +
                    "Bože, náš ochranca, pohliadni <font color='#B71C1C'>*</font><br>" +
                    "a pozri na tvár svojho pomazaného. <font color=‘#B71C1C’>– R.</font>"},
            //Krst Krista Pána
            {"11gkp", "A", "", "Ž 29, 1a+2. 3ac-4. 3b+9c-10",
                    "<font color='#B71C1C'>R.:</font> Pán požehná svoj ľud pokojom.<br><br>" +
                    "Vzdávajte Pánovi, synovia Boží, †<br>" +
                    "vzdávajte Pánovi slávu hodnu jeho mena, <font color='#B71C1C'>*</font><br>" +
                    "v posvätnom rúchu klaňajte sa pánovi. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Hlas Pánov nad vodami; <font color='#B71C1C'>*</font><br>" +
                    "Pán nad veľkými vodami!<br>" +
                    "Hlas Pánov taký mohutný! <font color='#B71C1C'>*</font><br>" +
                    "Hlas pánov taký veľkolepý! <font color=‘#B71C1C’>– R.</font><br>" +
                    "Zahrmel Boh veleby <font color='#B71C1C'>*</font><br>" +
                    "a v jeho chráme všetci volajú: Sláva!<br>" +
                    "Pán tróni nad záplavami vôd, <font color='#B71C1C'>*</font><br>" +
                    "Pán bude tróniť ako večný kráľ. <font color=‘#B71C1C’>– R.</font>"},
            {"", "B", "", "Ž 29, 1a+2. 3ac-4. 3b+9c-10",
                    "<font color='#B71C1C'>R.:</font> Pán požehná svoj ľud pokojom.<br><br>" +
                            "Vzdávajte Pánovi, synovia Boží, †<br>" +
                            "vzdávajte Pánovi slávu hodnu jeho mena, <font color='#B71C1C'>*</font><br>" +
                            "v posvätnom rúchu klaňajte sa pánovi. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Hlas Pánov nad vodami; <font color='#B71C1C'>*</font><br>" +
                            "Pán nad veľkými vodami!<br>" +
                            "Hlas Pánov taký mohutný! <font color='#B71C1C'>*</font><br>" +
                            "Hlas pánov taký veľkolepý! <font color=‘#B71C1C’>– R.</font><br>" +
                            "Zahrmel Boh veleby <font color='#B71C1C'>*</font><br>" +
                            "a v jeho chráme všetci volajú: Sláva!<br>" +
                            "Pán tróni nad záplavami vôd, <font color='#B71C1C'>*</font><br>" +
                            "Pán bude tróniť ako večný kráľ. <font color=‘#B71C1C’>– R.</font>",
                    "Alebo:",
                    "Iz 12, 2-3. 4b-d. 5-6",
                    "<font color='#B71C1C'>R.:</font> Čerpajme vodu s radosťou z prameňov spásy.<br><br>" +
                    "\"Hľa, Boh je moja spása; <font color='#B71C1C'>*</font><br>" +
                    "dúfam a nebojím sa,<br>" +
                    "lebo moja sila a chvála je Pán, <font color='#B71C1C'>*</font><br>" +
                    "on sa mi stal záchrancom.\"<br>" +
                    "Budete čerpať vodu s radosťou <font color='#B71C1C'>*</font><br>" +
                    "z prameňov spásy. <font color=‘#B71C1C’>– R.</font><br>" +
                    "\"Oslavujte Pána a vzývajte jeho meno, †<br>" +
                    "ohlasujte medzi národmi jeho zázraky, <font color='#B71C1C'>*</font><br>" +
                    "pamätajte, že jeho meno je vznešené. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Spievajte Pánovi, lebo urobil veľké veci; <font color='#B71C1C'>*</font><br>" +
                    "nech je to známe po celej zemi.<br>" +
                    "Plesaj a jasaj, obyvateľka Siona, <font color='#B71C1C'>*</font><br>" +
                    "lebo veľký uprostred teba je Svätý Izraela.\" <font color=‘#B71C1C’>– R.</font>"},
            {"", "C", "", "Ž 29, 1a+2. 3ac-4. 3b+9c-10",
                    "<font color='#B71C1C'>R.:</font> Pán požehná svoj ľud pokojom.<br><br>" +
                            "Vzdávajte Pánovi, synovia Boží, †<br>" +
                            "vzdávajte Pánovi slávu hodnu jeho mena, <font color='#B71C1C'>*</font><br>" +
                            "v posvätnom rúchu klaňajte sa pánovi. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Hlas Pánov nad vodami; <font color='#B71C1C'>*</font><br>" +
                            "Pán nad veľkými vodami!<br>" +
                            "Hlas Pánov taký mohutný! <font color='#B71C1C'>*</font><br>" +
                            "Hlas pánov taký veľkolepý! <font color=‘#B71C1C’>– R.</font><br>" +
                            "Zahrmel Boh veleby <font color='#B71C1C'>*</font><br>" +
                            "a v jeho chráme všetci volajú: Sláva!<br>" +
                            "Pán tróni nad záplavami vôd, <font color='#B71C1C'>*</font><br>" +
                            "Pán bude tróniť ako večný kráľ. <font color=‘#B71C1C’>– R.</font>",
                    "Alebo:",
                    "Ž 104, 1b-2. 3-4. 24-25. 27-28. 29-30",
                    "<font color='#B71C1C'>R.:</font> Dobroreč, duša moja, Pánovi; on je nesmierne veľký.<br><br>" +
                    "Pane, Bože môj, ty si nesmierne veľký. <font color='#B71C1C'>*</font><br>" +
                    "Odel si sa do slávy a veleby,<br>" +
                    "do svetla si sa zahalil ako do rúcha. <font color='#B71C1C'>*</font><br>" +
                    "Nebesia rozpínaš ako stan, <font color=‘#B71C1C’>– R.</font><br>" +
                    "nad vodami si buduješ komnaty. †<br>" +
                    "Po oblakoch vystupuješ ako po schodoch, <font color='#B71C1C'>*</font><br>" +
                    "na krídlach vánku sa prechádzaš.<br>" +
                    "Vetry sú tvojimi poslami, <font color='#B71C1C'>*</font><br>" +
                    "ohnivé plamene tvojimi služobníkmi. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Aké mnohoraké sú tvoje diela, Pane! †<br>" +
                    "Všetko si múdro urobil. <font color='#B71C1C'>*</font><br>" +
                    "Zem je plná tvojho stvorenstva.<br>" +
                    "Tu more veľké, dlhé a široké, †<br>" +
                    "v ňom sa hemžia plazy bez počtu, <font color='#B71C1C'>*</font><br>" +
                    "živočíchy drobné i obrovské. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Všetko to čaká na teba, <font color='#B71C1C'>*</font><br>" +
                    "že im dáš pokrm v pravý čas.<br>" +
                    "Ty im ho dávaš a ony ho zbierajú; <font color='#B71C1C'>*</font><br>" +
                    "otváraš svoju ruku, sýtia sa dobrotami. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Len čo odvrátiš svoju tvár, už sa trasú; †<br>" +
                    "odnímaš im dych a hneď hynú <font color='#B71C1C'>*</font><br>" +
                    "a vracajú sa do prachu.<br>" +
                    "Keď zošleš svojho ducha, sú stvorené <font color='#B71C1C'>*</font><br>" +
                    "a obnovuješ tvárnosť zeme. <font color=‘#B71C1C’>– R.</font>"},
    };

    String[][] zalm1 = {
            //2. nedeľa po NP
            {"", "", "", "Ž 147, 12-13. 14-15. 19-20",
                    "<font color='#B71C1C'>R.:</font> Slovo sa telom stalo a prebývalo medzi nami.<br>" +
                    "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                    "Chváľ, Jeruzalem, Pána, <font color='#B71C1C'>*</font><br>" +
                    "oslavuj, Sion, svojho Boha.<br>" +
                    "Lebo upevnil závory tvojich brán <font color='#B71C1C'>*</font><br>" +
                    "a požehnal tvojich synov v tebe. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Zaisťuje pokoj tvojim hraniciam, <font color='#B71C1C'>*</font><br>" +
                    "sýti ťa najlepšou pšenicou.<br>" +
                    "Svoj rozkaz na zem zosiela; <font color='#B71C1C'>*</font><br>" +
                    "rýchlo sa šíri jeho slovo. <font color=‘#B71C1C’>– R.</font><br>" +
                    "On svoje slovo zvestuje Jakubovi, <font color='#B71C1C'>*</font><br>" +
                    "svoje zákony a prikázania Izraelovi.<br>" +
                    "Neurobil tak iným národom, <font color='#B71C1C'>*</font><br>" +
                    "nezjavil im svoje zámery. <font color=‘#B71C1C’>– R.</font>"},

            {"01gk", "", "", "Ž 67, 2-3. 5. 6+8",
                    "<font color='#B71C1C'>R.:</font> Bože, buď nám milostivý a žehnaj nás.<br><br>" +
                    "Bože, buď nám milostivý a žehnaj nás; <font color='#B71C1C'>*</font><br>" +
                    "a tvoja tvár nech žiari nad nami,<br>" +
                    "aby sa tvoja cesta stala známou na zemi <font color='#B71C1C'>*</font><br>" +
                    "a tvoja spása medzi všetkými národmi. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Nech sa tešia a jasajú národy, †<br>" +
                    "že spravodlivo súdiš ľudí <font color='#B71C1C'>*</font><br>" +
                    "a spravuješ národy na zemi. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Bože, nech ťa velebia národy, <font color='#B71C1C'>*</font><br>" +
                    "nech ťa velebia všetky národy.<br>" +
                    "Nech nás Boh požehná <font color='#B71C1C'>*</font><br>" +
                    "a nech si ho ctia všetky končiny zeme. <font color=‘#B71C1C’>– R.</font>"},
            {"2", "", "", "Ž 98, 1. 2-3b. 3c-4",
                    "<font color='#B71C1C'>R.:</font> Uzreli všetky končiny zeme spásu nášho Boha.<br><br>" +
                    "Spievajte Pánovi pieseň novú, <font color='#B71C1C'>*</font><br>" +
                    "lebo vykonal veci zázračné.<br>" +
                    "Víťazstvo je dielom jeho pravice <font color='#B71C1C'>*</font><br>" +
                    "a jeho svätého ramena. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Pán oznámil svoju spásu, <font color='#B71C1C'>*</font><br>" +
                    "pred očami pohanov vyjavil svoju spravodlivosť.<br>" +
                    "Rozpamätal sa na svoju dobrotu <font color='#B71C1C'>*</font><br>" +
                    "a na svoju vernosť voči Izraelovmu domu. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Uzreli všetky končiny zeme <font color='#B71C1C'>*</font><br>" +
                    "spásu nášho Boha.<br>" +
                    "Na chválu Božiu jasaj, celá zem; <font color='#B71C1C'>*</font><br>" +
                    "plesajte, radujte sa a hrajte. <font color=‘#B71C1C’>– R.</font>"},
            {"3", "", "", "Ž 98, 1. 3c-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Uzreli všetky končiny zeme spásu nášho Boha.<br><br>" +
                    "Spievajte Pánovi pieseň novú, <font color='#B71C1C'>*</font><br>" +
                    "lebo vykonal veci zázračné.<br>" +
                    "Víťazstvo je dielom jeho pravice <font color='#B71C1C'>*</font><br>" +
                    "a jeho svätého ramena. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Uzreli všetky končiny zeme <font color='#B71C1C'>*</font><br>" +
                    "spásu nášho Boha.<br>" +
                    "Na chválu Božiu jasaj, celá zem; <font color='#B71C1C'>*</font><br>" +
                    "plesajte, radujte sa a hrajte. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Hrajte Pánovi na citare, <font color='#B71C1C'>*</font><br>" +
                    "na citare a na harfe zunivej.<br>" +
                    "Za hlaholu trúb a poľníc <font color='#B71C1C'>*</font><br>" +
                    "jasajte pred tvárou Kráľa a Pána. <font color=‘#B71C1C’>– R.</font>"},
            {"03a", "", "", "Ž 8, 4-5. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pane, náš Vládca, aké vznešené je tvoje meno na celej zemi!<br><br>" +
                            "Keď hľadím na nebesia, dielo tvojich rúk, <font color='#B71C1C'>*</font><br>" +
                            "na mesiac a na hviezdy, ktoré si ty stvoril:<br>" +
                            "čože je človek, že naň pamätáš, <font color='#B71C1C'>*</font><br>" +
                            "a syn človeka, že sa ho ujímaš? <font color=‘#B71C1C’>– R.</font><br>" +
                            "Stvoril si ho len o niečo menšieho od anjelov, <font color='#B71C1C'>*</font><br>" +
                            "slávou a cťou si ho ovenčil<br>" +
                            "a ustanovil si ho za vládcu nad dielami tvojich rúk. <font color='#B71C1C'>*</font><br>" +
                            "Všetko si mu položil pod nohy: <font color=‘#B71C1C’>– R.</font><br>" +
                            "ovce a všetok domáci statok <font color='#B71C1C'>*</font><br>" +
                            "aj všetku poľnú zver,<br>" +
                            "vtáctvo pod oblohou a ryby v mori <font color='#B71C1C'>*</font><br>" +
                            "i všetko, čo sa hýbe po dne morskom. <font color=‘#B71C1C’>– R.</font>"},
            {"4", "", "", "Ž 98, 1. 7-8. 9",
                    "<font color='#B71C1C'>R.:</font> Uzreli všetky končiny zeme spásu nášho Boha.<br><br>" +
                    "Spievajte Pánovi pieseň novú, <font color='#B71C1C'>*</font><br>" +
                    "lebo vykonal veci zázračné.<br>" +
                    "Víťazstvo je dielom jeho pravice <font color='#B71C1C'>*</font><br>" +
                    "a jeho svätého ramena. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Zahuč, more a všetko, čo ho napĺňa, <font color='#B71C1C'>*</font><br>" +
                    "zemekruh a všetci, čo na ňom bývajú.<br>" +
                    "Tlieskajte, rieky, rukami, <font color='#B71C1C'>*</font><br>" +
                    "jasajte s nimi, vrchy, <font color=‘#B71C1C’>– R.</font><br>" +
                    "pred tvárou Pánovou, lebo prichádza súdiť zem. †<br>" +
                    "Spravodlivo bude súdiť zemekruh <font color='#B71C1C'>*</font><br>" +
                    "a podľa práva národy. <font color=‘#B71C1C’>– R.</font>"},
            {"5", "", "", "Ž 100, 2. 3. 4. 5",
                    "<font color='#B71C1C'>R.:</font> Sme jeho ľud a ovce z jeho stáda.<br><br>" +
                    "Jasaj na chválu Pánovi, celá zem, †<br>" +
                    "s radosťou slúžte Pánovi. <font color='#B71C1C'>*</font><br>" +
                    "S plesaním vstupujte pred jeho tvár. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Vedzte, že náš Pán je Boh; †<br>" +
                    "on je náš stvoriteľ a jemu patríme, <font color='#B71C1C'>*</font><br>" +
                    "sme jeho ľud a ovce z jeho stáda. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Vstupujte do jeho brán s piesňou chvály †<br>" +
                    "a do jeho nádvorí s piesňami oslavnými; <font color='#B71C1C'>*</font><br>" +
                    "chváľte ho a velebte jeho meno. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Lebo Pán je dobrý; †<br>" +
                    "jeho milosrdenstvo trvá naveky <font color='#B71C1C'>*</font><br>" +
                    "a jeho vernosť z pokolenia na pokolenie. <font color=‘#B71C1C’>– R.</font>"},
            {"06gk", "", "", "Ž 72, 1-2. 7-8. 10-11. 12-13",
                    "<font color='#B71C1C'>R.:</font> Budú sa ti klaňať, Pane, všetky národy sveta.<br><br>" +
                    "Bože, zver svoju právomoc kráľovi, <font color='#B71C1C'>*</font><br>" +
                    "kráľovmu synovi svoju spravodlivosť,<br>" +
                    "aby spravodlivo vládol nad tvojím ľudom <font color='#B71C1C'>*</font><br>" +
                    "a podľa práva nad tvojimi chudobnými. <font color=‘#B71C1C’>– R.</font><br>" +
                    "V jeho dňoch bude prekvitať spravodlivosť<br>" +
                    "a plnosť pokoja, <font color='#B71C1C'>*</font><br>" +
                    "kým mesiac nezhasne.<br>" +
                    "A bude panovať od mora až k moru <font color='#B71C1C'>*</font><br>" +
                    "a od Rieky až na kraj zeme. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Králi Taršišu a ostrovov prinesú mu dary, <font color='#B71C1C'>*</font><br>" +
                    "oddajú mu dane králi Arabov aj zo Sáby.<br>" +
                    "Budú sa mu klaňať všetci králi, <font color='#B71C1C'>*</font><br>" +
                    "slúžiť mu budú všetky národy. <font color=‘#B71C1C’>– R.</font><br>" +
                    "On vyslobodí bedára, čo volá k nemu, <font color='#B71C1C'>*</font><br>" +
                    "i chudobného, ktorému nik nepomáha.<br>" +
                    "Zmiluje sa nad chudobným a bedárom, <font color='#B71C1C'>*</font><br>" +
                    "zachráni život úbožiakom. <font color=‘#B71C1C’>– R.</font>"},
            {"7", "", "", "Ž 2, 7-8. 10-11",
                    "<font color='#B71C1C'>R.:</font> Otec dal Synovi kráľovstvo všetkých národov.<br><br>" +
                    "Zvestujem Pánovo rozhodnutie: †<br>" +
                    "Pán mi povedal: \"Ty si môj syn. <font color='#B71C1C'>*</font><br>" +
                    "Ja som ťa dnes splodil.<br>" +
                    "Žiadaj si odo mňa a dám ti do dedičstva národy <font color='#B71C1C'>*</font><br>" +
                    "a do vlastníctva celú zem.\" <font color=‘#B71C1C’>– R.</font><br>" +
                    "A teraz, králi, pochopte; <font color='#B71C1C'>*</font><br>" +
                    "dajte si povedať, pozemskí vladári.<br>" +
                    "V bázni slúžte Pánovi <font color='#B71C1C'>*</font><br>" +
                    "a s chvením sa mu klaňajte. <font color=‘#B71C1C’>– R.</font>"},
            {"8", "", "", "Ž 72, 1-2. 3-4b. 7-8",
                    "<font color='#B71C1C'>R.:</font> Budú sa ti klaňať, Pane, všetky národy sveta.<br><br>" +
                    "Bože, zver svoju právomoc kráľovi, <font color='#B71C1C'>*</font><br>" +
                    "kráľovmu synovi svoju spravodlivosť,<br>" +
                    "aby spravodlivo vládol nad tvojím ľudom <font color='#B71C1C'>*</font><br>" +
                    "a podľa práva nad tvojimi chudobnými. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Vrchy nech ľudu prinesú pokoj <font color='#B71C1C'>*</font><br>" +
                    "a pahorky spravodlivosť.<br>" +
                    "Prisúdi právo ľuďom úbohým, <font color='#B71C1C'>*</font><br>" +
                    "poskytne pomoc deťom bedára. <font color=‘#B71C1C’>– R.</font><br>" +
                    "V jeho dňoch bude prekvitať spravodlivosť<br>" +
                    "a plnosť pokoja, <font color='#B71C1C'>*</font><br>" +
                    "kým mesiac nezhasne.<br>" +
                    "A bude panovať od mora až k moru <font color='#B71C1C'>*</font><br>" +
                    "a od Rieky až na kraj zeme. <font color=‘#B71C1C’>– R.</font>"},
            {"9", "", "", "Ž 72, 1-2. 10-11. 12-13",
                    "<font color='#B71C1C'>R.:</font> Budú sa ti klaňať, Pane, všetky národy sveta.<br><br>" +
                    "Bože, zver svoju právomoc kráľovi, <font color='#B71C1C'>*</font><br>" +
                    "kráľovmu synovi svoju spravodlivosť,<br>" +
                    "aby spravodlivo vládol nad tvojím ľudom <font color='#B71C1C'>*</font><br>" +
                    "a podľa práva nad tvojimi chudobnými. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Králi Taršišu a ostrovov prinesú mu dary, <font color='#B71C1C'>*</font><br>" +
                    "oddajú mu dane králi Arabov aj zo Sáby.<br>" +
                    "Budú sa mu klaňať všetci králi, <font color='#B71C1C'>*</font><br>" +
                    "slúžiť mu budú všetky národy. <font color=‘#B71C1C’>– R.</font><br>" +
                    "On vyslobodí bedára, čo volá k nemu, <font color='#B71C1C'>*</font><br>" +
                    "i chudobného, ktorému nik nepomáha.<br>" +
                    "Zmiluje sa nad chudobným a bedárom, <font color='#B71C1C'>*</font><br>" +
                    "zachráni život úbožiakom. <font color=‘#B71C1C’>– R.</font>"},
            {"10", "", "", "Ž 72, 1-2. 14+15bc. 17",
                    "<font color='#B71C1C'>R.:</font> Budú sa ti klaňať, Pane, všetky národy sveta.<br><br>" +
                    "Bože, zver svoju právomoc kráľovi, <font color='#B71C1C'>*</font><br>" +
                    "kráľovmu synovi svoju spravodlivosť,<br>" +
                    "aby spravodlivo vládol nad tvojím ľudom <font color='#B71C1C'>*</font><br>" +
                    "a podľa práva nad tvojimi chudobnými. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Vyslobodí ich z útlaku a násilia, <font color='#B71C1C'>*</font><br>" +
                    "lebo v jeho očiach je vzácna ich krv.<br>" +
                    "Stále sa budú modliť za neho <font color='#B71C1C'>*</font><br>" +
                    "a dobrorečiť mu každý deň. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Jeho meno nech je velebené naveky; <font color='#B71C1C'>*</font><br>" +
                    "kým bude svietiť slnko, jeho meno potrvá.<br>" +
                    "V ňom budú požehnané všetky kmene zeme, <font color='#B71C1C'>*</font><br>" +
                    "zvelebovať ho budú všetky národy. <font color=‘#B71C1C’>– R.</font>"},
            {"11", "", "", "Ž 147, 12-13. 14-15. 19-20",
                    "<font color='#B71C1C'>R.:</font> Chváľ, Jeruzalem, Pána, oslavuj, Sion, svojho Boha. <br>" +
                    "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                    "Chváľ, Jeruzalem, Pána, <font color='#B71C1C'>*</font><br>" +
                    "oslavuj, Sion, svojho Boha.<br>" +
                    "Lebo upevnil závory tvojich brán <font color='#B71C1C'>*</font><br>" +
                    "a požehnal tvojich synov v tebe. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Zaisťuje pokoj tvojim hraniciam, <font color='#B71C1C'>*</font><br>" +
                    "sýti ťa najlepšou pšenicou.<br>" +
                    "Svoj rozkaz na zem zosiela; <font color='#B71C1C'>*</font><br>" +
                    "rýchlo sa šíri jeho slovo. <font color=‘#B71C1C’>– R.</font><br>" +
                    "On svoje slovo zvestuje Jakubovi, <font color='#B71C1C'>*</font><br>" +
                    "svoje zákony a prikázania Izraelovi.<br>" +
                    "Neurobil tak iným národom, <font color='#B71C1C'>*</font><br>" +
                    "nezjavil im svoje zámery. <font color=‘#B71C1C’>– R.</font>"},
            {"12", "", "", "Ž 149, 1-2. 3-4. 5-6a+9b",
                    "<font color='#B71C1C'>R.:</font> Pán, Boh, miluje svoj ľud.<br>" +
                    "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                    "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>*</font><br>" +
                    "jeho chvála nech znie v zhromaždení svätých. <br>" +
                    "Nech sa teší Izrael zo svojho Stvoriteľa, <font color='#B71C1C'>*</font><br>" +
                    "synovia Siona nech jasajú nad svojím kráľom. <font color=‘#B71C1C’>– R.</font> <br>" +
                    "Nech oslavujú jeho meno tancom, <font color='#B71C1C'>*</font><br>" +
                    "nech mu hrajú na bubne a na citare. <br>" +
                    "Lebo Pán miluje svoj ľud <font color='#B71C1C'>*</font><br>" +
                    "a tichých venčí víťazstvom. <font color=‘#B71C1C’>– R.</font> <br>" +
                    "Nech svätí jasajú v sláve, <font color='#B71C1C'>*</font><br>" +
                    "nech sa veselia na svojich lôžkach. <br>" +
                    "Oslavu Boha nech majú na perách; <font color='#B71C1C'>*</font><br>" +
                    "všetkým jeho svätým to bude na slávu. <font color=‘#B71C1C’>– R.</font>"},
            {"20g+", "", "", "Ž 31, 3c-4. 6+8ab. 16b-17",
                    "<font color='#B71C1C'>R.:</font> Do tvojich rúk, Pane, porúčam svojho ducha.<br><br>" +
                            "Buď mi skalou útočišťa, <font color='#B71C1C'>*</font><br>" +
                            "opevneným hradom mojej spásy.<br>" +
                            "Veď ty si moja sila a moje útočište, <font color='#B71C1C'>*</font><br>" +
                            "pre svoje meno budeš ma viesť a opatrovať.<font color='#B71C1C'> – R.</font><br>" +
                            "Do tvojich rúk porúčam svojho ducha; <font color='#B71C1C'>*</font><br>" +
                            "ty si ma vykúpil, Pane, Bože verný.<br>" +
                            "Plesám a teším sa, že si milosrdný, <font color='#B71C1C'>*</font><br>" +
                            "lebo si zhliadol na moju poníženosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Vytrhni ma z rúk mojich nepriateľov <font color='#B71C1C'>*</font><br>" +
                            "a prenasledovateľov.<br>" +
                            "Rozjasni svoju tvar nad svojim sluhom <font color='#B71C1C'>*</font><br>" +
                            "a zachráň ma vo svojom milosrdenstve.<font color='#B71C1C'> – R.</font>"},
            {"25g", "", "", "Ž 117, 1. 2",
                    "<font color='#B71C1C'>R.:</font> Choďte do celého sveta a hlásajte evanjelium.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľte Pána, všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "oslavujte ho, všetci ľudia; <font color='#B71C1C'>− R.</font><br>" +
                            "lebo je veľké jeho milosrdenstvo voči nám <font color='#B71C1C'>*</font><br>" +
                            "a pravda Pánova trvá naveky. <font color='#B71C1C'>− R.</font>"},
            {"26", "", "", "Ž 96, 1-2a. 2b-3. 7-8a. 10",
                    "<font color='#B71C1C'>R.:</font> Zvestujte všetkým národom zázraky Pánove.<br><br>" +
                            "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>†</font><br>" +
                            "spievaj Pánovi celá zem! <font color='#B71C1C'>*</font><br>" +
                            "Spievajte Pánovi, velebte jeho meno.<font color='#B71C1C'> – R.</font><br>" +
                            "Zvestujte jeho spásu deň čo deň. <font color='#B71C1C'>†</font><br>" +
                            "Zvestujte jeho slávu pohanom <font color='#B71C1C'>*</font><br>" +
                            "a jeho zázraky všetkým národom.<font color='#B71C1C'> – R.</font><br>" +
                            "Vzdávajte Pánovi, rodiny národov, <font color='#B71C1C'>†</font><br>" +
                            "vzdávajte Pánovi slávu a česť, <font color='#B71C1C'>*</font><br>" +
                            "vzdávajte Pánovi slávu hodnu jeho mena.<font color='#B71C1C'> – R.</font><br>" +
                            "Hlásajte medzi pohanmi: \"Pán kraľuje!\" <font color='#B71C1C'>†</font><br>" +
                            "Upevnil zemekruh, nepohne sa; <font color='#B71C1C'>*</font><br>" +
                            "a spravodlivo súdi národy.<font color='#B71C1C'> – R.</font><br>"},
    };

    String[][] zalm2 = {
            {"02g", "", "", "Ž 24, 7. 8. 9. 10",
                    "<font color='#B71C1C'>R.:</font> Príď, Pane, do svojho svätého chrámu.<br><br>" +
                            "Zdvihnite, brány, svoje hlavice <font color='#B71C1C'>†</font><br>" +
                            "a vyvýšte sa, brány prastaré, <font color='#B71C1C'>*</font><br>" +
                            "lebo má vstúpiť kráľ slávy. <font color='#B71C1C'>– R.</font><br>" +
                            "Kto je ten kráľ slávy? <font color='#B71C1C'>†</font><br>" +
                            "Pán silný a mocný, <font color='#B71C1C'>*</font><br>" +
                            "Pán mocný v boji. <font color='#B71C1C'>– R.</font><br>" +
                            "Zdvihnite, brány, svoje hlavice <font color='#B71C1C'>†</font><br>" +
                            "a vyvýšte sa, brány prastaré, <font color='#B71C1C'>*</font><br>" +
                            "lebo má vstúpiť kráľ slávy. <font color='#B71C1C'>– R.</font><br>" +
                            "Kto je ten kráľ slávy? <font color='#B71C1C'>†</font><br>" +
                            "Pán zástupov, <font color='#B71C1C'>*</font><br>" +
                            "to je ten kráľ slávy. <font color='#B71C1C'>– R.</font>"},
            /*{"11", "", "", "Jdt 13, 18b-e. 19",
                    "<font color='#B71C1C'>R.:</font> Požehnaná si, Panna Mária, nad všetky ženy na svete.<br><br>" +
                            "Požehnaná si, dcéra, od Boha najvyššieho <font color='#B71C1C'>*</font><br>" +
                            "nad všetky ženy na svete.<br>" +
                            "A zvelebený je Pán, Boh náš, <font color='#B71C1C'>*</font><br>" +
                            "ktorý stvoril nebo i zem. <font color='#B71C1C'>– R.</font><br>" +
                            "Preto nevymizne tvoja chvála zo sŕdc ľudí, <font color='#B71C1C'>†</font><br>" +
                            "ktorí si budú naveky pripomínať <font color='#B71C1C'>*</font><br>" +
                            "Pánovu silu. <font color='#B71C1C'>– R.</font>"},*/
            {"14o", "", "", "Ž 96, 1-2a. 2b-3. 7-8a. 10",
                    "<font color='#B71C1C'>R.:</font> Zvestujte všetkým národom zázraky Pánove.<br><br>" +
                            "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>†</font><br>" +
                            "spievaj Pánovi celá zem! <font color='#B71C1C'>*</font><br>" +
                            "Spievajte Pánovi, velebte jeho meno. <font color='#B71C1C'>– R.</font><br>" +
                            "Zvestujte jeho spásu deň čo deň. <font color='#B71C1C'>†</font><br>" +
                            "Zvestujte jeho slávu pohanom <font color='#B71C1C'>*</font><br>" +
                            "a jeho zázraky všetkým národom. <font color='#B71C1C'>– R.</font><br>" +
                            "Vzdávajte Pánovi, rodiny národov, <font color='#B71C1C'>†</font><br>" +
                            "vzdávajte Pánovi slávu a česť, <font color='#B71C1C'>*</font><br>" +
                            "vzdávajte Pánovi slávu hodnu jeho mena. <font color='#B71C1C'>– R.</font><br>" +
                            "Hlásajte medzi pohanmi: \"Pán kraľuje!\" <font color='#B71C1C'>†</font><br>" +
                            "Upevnil zemekruh, nepohne sa; <font color='#B71C1C'>*</font><br>" +
                            "a spravodlivo súdi národy. <font color='#B71C1C'>– R.</font>"},
            {"14g+", "", "", "Ž 96, 1-2a. 2b-3. 7-8a. 10",
                    "<font color='#B71C1C'>R.:</font> Zvestujte všetkým národom zázraky Pánove.<br><br>" +
                            "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>†</font><br>" +
                            "spievaj Pánovi celá zem! <font color='#B71C1C'>*</font><br>" +
                            "Spievajte Pánovi, velebte jeho meno. <font color='#B71C1C'>– R.</font><br>" +
                            "Zvestujte jeho spásu deň čo deň. <font color='#B71C1C'>†</font><br>" +
                            "Zvestujte jeho slávu pohanom <font color='#B71C1C'>*</font><br>" +
                            "a jeho zázraky všetkým národom. <font color='#B71C1C'>– R.</font><br>" +
                            "Vzdávajte Pánovi, rodiny národov, <font color='#B71C1C'>†</font><br>" +
                            "vzdávajte Pánovi slávu a česť, <font color='#B71C1C'>*</font><br>" +
                            "vzdávajte Pánovi slávu hodnu jeho mena. <font color='#B71C1C'>– R.</font><br>" +
                            "Hlásajte medzi pohanmi: \"Pán kraľuje!\" <font color='#B71C1C'>†</font><br>" +
                            "Upevnil zemekruh, nepohne sa; <font color='#B71C1C'>*</font><br>" +
                            "a spravodlivo súdi národy. <font color='#B71C1C'>– R.</font>"},
            {"22g", "", "", "Ž 23, 1-3. 4. 5. 6",
                    "<font color='#B71C1C'>R.:</font> Pán je môj pastier, nič mi nechýba.<br><br>" +
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
    };

    String[][] zalm3 = {};

    String[][] zalm4 = {
            {"25g", "", "", "Ž 89, 2-3. 6-7. 16-17",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, ospevovať budem naveky.<br><br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Pánovo milosrdenstvo chcem ospevovať naveky; <font color='#B71C1C'>*</font><br>" +
                            "po všetky pokolenia hlásať svojimi ústami tvoju vernosť.<br>" +
                            "Veď ty si povedal:<br>" +
                            "\"Moje milosrdenstvo je ustanovené naveky.\" <font color='#B71C1C'>*</font><br>" +
                            "Tvoja vernosť je upevnená v nebesiach. <font color='#B71C1C'>– R.</font><br>" +
                            "Tvoje zázraky, Pane, oslavujú nebesia <font color='#B71C1C'>*</font><br>" +
                            "a tvoju vernosť spoločenstvo svätých.<br>" +
                            "Lebo kto nad oblakmi je roveň Pánovi? <font color='#B71C1C'>*</font><br>" +
                            "Kto sa z Božích synov podobá Pánovi? <font color='#B71C1C'>– R.</font><br>" +
                            "Blažený ľud, ktorý vie jasať! <font color='#B71C1C'>*</font><br>" +
                            "Kráča vo svetle tvojej tváre, Pane;<br>" +
                            "deň čo deň sa raduje z tvojho mena <font color='#B71C1C'>*</font><br>" +
                            "a honosí sa tvojou spravodlivosťou. <font color='#B71C1C'>– R.</font>"},
            {"29g", "", "", "Ž 103, 1-2. 3-4. 8-9. 13-14. 17-18a",
                    "<font color='#B71C1C'>R.:</font> Duša moja, dobroreč svojmu Bohu. <br><br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
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
                            "Nevyčíta nám ustavične naše chyby, <font color='#B71C1C'>*</font><br>" +
                            "ani sa nehnevá naveky. <font color='#B71C1C'>– R.</font><br>" +
                            "Ako sa otec zmilúva nad deťmi, <font color='#B71C1C'>*</font><br>" +
                            "tak sa Pán zmilúva nad tými, čo sa ho boja.<br>" +
                            "Veď on dobre vie, z čoho sme stvorení; <font color='#B71C1C'>*</font><br>" +
                            "pamätá, že sme iba prach. <font color='#B71C1C'>– R.</font><br>" +
                            "No milosrdenstvo Pánovo je od večnosti až na večnosť <font color='#B71C1C'>*</font><br>" +
                            "voči tým, čo sa ho boja,<br>" +
                            "a jeho spravodlivosť chráni ich detné deti, <font color='#B71C1C'>*</font><br>" +
                            "tie, čo zachovávajú jeho zmluvu. <font color='#B71C1C'>– R.</font>"},
    };

    String[][] zalm5 = {
            {"01", "", "", "Ž 90, 2. 3-4. 12-13. 14+16",
                    "<font color='#B71C1C'>R.:</font> Požehnaj, Pane, námahu našich rúk.<br><br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Prv než sa vrchy zrodili <font color='#B71C1C'>†</font><br>" +
                            "a povstali zem i svet, <font color='#B71C1C'>*</font><br>" +
                            "ty, Bože, si od vekov až naveky. <font color='#B71C1C'>– R.</font><br>" +
                            "Človeka vraciaš do prachu <font color='#B71C1C'>*</font><br>" +
                            "a hovoríš: \"Vráťte sa, synovia človeka!\"<br>" +
                            "Veď tisíc rokov je u teba<br>" +
                            "ako deň včerajší, čo sa pominul, <font color='#B71C1C'>*</font><br>" +
                            "a ako jedna nočná stráž. <font color='#B71C1C'>– R.</font><br>" +
                            "A tak nás nauč rátať naše dni, <font color='#B71C1C'>*</font><br>" +
                            "aby sme našli múdrosť srdca.<br>" +
                            "Obráť sa k nám, Pane; dokedy budeš meškať? <font color='#B71C1C'>*</font><br>" +
                            "Zľutuj sa nad svojimi služobníkmi. <font color='#B71C1C'>– R.</font><br>" +
                            "Hneď zrána nás naplň svojou milosťou <font color='#B71C1C'>*</font><br>" +
                            "a budeme jasať a radovať sa po všetky dni života.<br>" +
                            "Nech sa tvoje dielo zjaví tvojim služobníkom <font color='#B71C1C'>*</font><br>" +
                            "a ich deťom tvoja nádhera. <font color='#B71C1C'>– R.</font>"},
            {"03g", "", "", "Ž 19, 2-3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Po celej zemi rozlieha sa ich hlas.<br><br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Nebesia rozprávajú o sláve Boha <font color='#B71C1C'>*</font><br>" +
                            "a obloha hlása dielo jeho rúk.<br>" +
                            "Deň dňu o tom podáva správu <font color='#B71C1C'>*</font><br>" +
                            "a noc noci to dáva na známosť. <font color='#B71C1C'>– R.</font><br>" +
                            "Nie sú to slová, nie je to reč, <font color='#B71C1C'>*</font><br>" +
                            "ktorá by sa nedala počuť.<br>" +
                            "Po celej zemi rozlieha sa ich hlas <font color='#B71C1C'>*</font><br>" +
                            "a ich slová až po končiny sveta. <font color='#B71C1C'>– R.</font>"},
            {"14g", "", "", "Ž 113, 1-2. 3-4. 5-6. 7-8",
                    "<font color='#B71C1C'>R.:</font> Pán si ma vybral spomedzi chudobných.<br><br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľte, služobníci Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "chváľte meno Pánovo.<br>" +
                            "Nech je velebené meno Pánovo <font color='#B71C1C'>*</font><br>" +
                            "odteraz až naveky. <font color='#B71C1C'>– R.</font><br>" +
                            "Od východu slnka až po západ <font color='#B71C1C'>*</font><br>" +
                            "nech je oslávené meno Pánovo.<br>" +
                            "Vyvýšený je Pán nad všetky národy <font color='#B71C1C'>*</font><br>" +
                            "a jeho sláva nad nebesia. <font color='#B71C1C'>– R.</font><br>" +
                            "Kto je ako Pán, náš Boh, <font color='#B71C1C'>*</font><br>" +
                            "čo tróni na výsostiach,<br>" +
                            "a predsa dbá o všetko nepatrné <font color='#B71C1C'>*</font><br>" +
                            "na nebi i na zemi? <font color='#B71C1C'>– R.</font><br>" +
                            "Z prachu dvíha chudobného <font color='#B71C1C'>*</font><br>" +
                            "a zo smetiska povyšuje bedára<br>" +
                            "a dáva mu sedieť vedľa kniežat, <font color='#B71C1C'>*</font><br>" +
                            "vedľa kniežat svojho ľudu. <font color='#B71C1C'>– R.</font>"},
            {"16", "", "", "Ž 69, 5a-c. 8+10. 14ab+15bc",
                    "<font color='#B71C1C'>R.:</font> Vo svojej veľkej láske vyslyš ma, Pane.<br><br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Viac než mám vlasov na hlave, <font color='#B71C1C'>*</font><br>" +
                            "je tých, čo ma bez príčiny nenávidia.<br>" +
                            "Mocnejší sú tí, <font color='#B71C1C'>*</font><br>" +
                            "čo ma prenasledujú. – R<br>" +
                            "Pre teba znášam potupu <font color='#B71C1C'>*</font><br>" +
                            "a hanba mi pokrýva tvá<font color='#B71C1C'>– R.</font><br>" +
                            "Stravuje ma horlivosť za tvoj dom, <font color='#B71C1C'>*</font><br>" +
                            "padajú na mňa urážky tých, čo ťa urážajú. – R<br>" +
                            "Ale ja, Pane, obraciam sa modlitbou k tebe <font color='#B71C1C'>*</font><br>" +
                            "v tomto čase milosti.<br>" +
                            "A budem vytrhnutý z moci svojich nenávistníkov <font color='#B71C1C'>*</font><br>" +
                            "i z hlbokých vôd. <font color='#B71C1C'>– R.</font>"},
            {"16g", "", "", "Ž 69, 5a-c. 8+10. 14ab+15bc",
                    "<font color='#B71C1C'>R.:</font> Vo svojej veľkej láske vyslyš ma, Pane.<br><br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Viac než mám vlasov na hlave, <font color='#B71C1C'>*</font><br>" +
                            "je tých, čo ma bez príčiny nenávidia.<br>" +
                            "Mocnejší sú tí, <font color='#B71C1C'>*</font><br>" +
                            "čo ma prenasledujú. – R<br>" +
                            "Pre teba znášam potupu <font color='#B71C1C'>*</font><br>" +
                            "a hanba mi pokrýva tvá<font color='#B71C1C'>– R.</font><br>" +
                            "Stravuje ma horlivosť za tvoj dom, <font color='#B71C1C'>*</font><br>" +
                            "padajú na mňa urážky tých, čo ťa urážajú. – R<br>" +
                            "Ale ja, Pane, obraciam sa modlitbou k tebe <font color='#B71C1C'>*</font><br>" +
                            "v tomto čase milosti.<br>" +
                            "A budem vytrhnutý z moci svojich nenávistníkov <font color='#B71C1C'>*</font><br>" +
                            "i z hlbokých vôd. <font color='#B71C1C'>– R.</font>"},
    };

    String[][] zalm6 = {
            {"11", "", "", "Ž 98, 1. 2-3b. 3c-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Pred očami pohanov vyjavil Pán svoju spásu.<br><br>" +
                            "Spievajte Pánovi pieseň novú, <font color='#B71C1C'>*</font><br>" +
                            "lebo vykonal veci zázračné.<br>" +
                            "Víťazstvo je dielom jeho pravice <font color='#B71C1C'>*</font><br>" +
                            "a jeho svätého ramena.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán oznámil svoju spásu, <font color='#B71C1C'>*</font><br>" +
                            "pred očami pohanov vyjavil svoju spravodlivosť.<br>" +
                            "Rozpamätal sa na svoju dobrotu <font color='#B71C1C'>*</font><br>" +
                            "a na svoju vernosť voči Izraelovmu domu.<font color='#B71C1C'> – R.</font><br>" +
                            "Uzreli všetky končiny zeme <font color='#B71C1C'>*</font><br>" +
                            "spásu nášho Boha.<br>" +
                            "Na chválu Božiu jasaj, celá zem; <font color='#B71C1C'>*</font><br>" +
                            "plesajte, radujte sa a hrajte.<font color='#B71C1C'> – R.</font><br>" +
                            "Hrajte Pánovi na citare, <font color='#B71C1C'>*</font><br>" +
                            "na citare a na harfe zunivej.<br>" +
                            "Za hlaholu trúb a poľníc <font color='#B71C1C'>*</font><br>" +
                            "jasajte pred tvárou Kráľa a Pána.<font color='#B71C1C'> – R.</font>"},
            {"23gk", "", "", "Ž 71, 1-2. 3-4a. 5-6b. 15ab+17",
                    "<font color='#B71C1C'>R.:</font> Od života matky si mojím ochrancom.<br><br>" +
                            "V teba, Pane, som dúfal; <font color='#B71C1C'>*</font><br>" +
                            "nebudem zahanbený naveky.<br>" +
                            "Vo svojej spravodlivosti ma vysloboď a zachráň, <font color='#B71C1C'>*</font><br>" +
                            "nakloň ku mne svoj sluch a pomôž mi.<font color='#B71C1C'> – R.</font><br>" +
                            "Buď mi ochrannou skalou a opevneným hradom <font color='#B71C1C'>*</font><br>" +
                            "na moju záchranu;<br>" +
                            "veď ty si moja opora a moje útočište. <font color='#B71C1C'>*</font><br>" +
                            "Bože môj, vytrhni ma z ruky hriešnika.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo ja, Pane, túžim za tebou, <font color='#B71C1C'>*</font><br>" +
                            "ty, Pane, si moja nádej od mojej mladosti.<br>" +
                            "Od matkinho lona mám v tebe oporu, <font color='#B71C1C'>*</font><br>" +
                            "od života matky si mojím ochrancom.<font color='#B71C1C'> – R.</font><br>" +
                            "Moje ústa budú hlásať tvoju spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a tvoju spásu deň čo deň.<br>" +
                            "Bože, ty si ma poúčal od mojej mladosti <font color='#B71C1C'>*</font><br>" +
                            "a ja až doteraz ohlasujem tvoje diela zázračné.<font color='#B71C1C'> – R.</font>"},
            {"24gk", "", "", "Ž 139, 1-3. 13-14. 15",
                    "<font color='#B71C1C'>R.:</font> Chválim ťa, Pane, že som vznikol tak zázračne.<br><br>" +
                            "Pane, ty ma skúmaš a vieš o mne všetko; <font color='#B71C1C'>*</font><br>" +
                            "ty vieš, či sedím a či stojím.<br>" +
                            "Už zďaleka vnímaš moje myšlienky: <font color='#B71C1C'>†</font><br>" +
                            "či kráčam a či odpočívam, ty ma sleduješ. <font color='#B71C1C'>*</font><br>" +
                            "A všetky moje cesty sú ti známe.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď ty si stvoril moje útroby, <font color='#B71C1C'>*</font><br>" +
                            "utkal si ma v živote mojej matky.<br>" +
                            "Chválim ťa, že si ma utvoril tak zázračne; <font color='#B71C1C'>†</font><br>" +
                            "všetky tvoje diela sú hodny obdivu <font color='#B71C1C'>*</font><br>" +
                            "a ja to veľmi dobre viem.<font color='#B71C1C'> – R.</font><br>" +
                            "Moje údy neboli utajené pred tebou, <font color='#B71C1C'>†</font><br>" +
                            "keď som vznikal v skrytosti, <font color='#B71C1C'>*</font><br>" +
                            "utkávaný v hlbinách zeme.<font color='#B71C1C'> – R.</font>"},
            {"28gk", "", "", "Ž 19, 2-3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Po celej zemi rozlieha sa ich hlas.<br><br>" +
                            "Nebesia rozprávajú o sláve Boha <font color='#B71C1C'>*</font><br>" +
                            "a obloha hlása dielo jeho rúk.<br>" +
                            "Deň dňu o tom podáva správu <font color='#B71C1C'>*</font><br>" +
                            "a noc noci to dáva na známosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Nie sú to slová, nie je to reč, <font color='#B71C1C'>*</font><br>" +
                            "ktorá by sa nedala počuť.<br>" +
                            "Po celej zemi rozlieha sa ich hlas <font color='#B71C1C'>*</font><br>" +
                            "a ich slová až po končiny sveta.<font color='#B71C1C'> – R.</font>"},
            {"29gk", "", "", "Ž 34, 2-3. 4-5. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pán ma vyslobodil zo všetkej hrôzy.<br><br>" +
                            "Pána chcem velebiť v každom čase, <font color='#B71C1C'>*</font><br>" +
                            "moje ústa budú ho vždy chváliť.<br>" +
                            "V Pánovi sa bude chváliť moja duša; <font color='#B71C1C'>*</font><br>" +
                            "nechže to počujú pokorní a nech sa tešia.<font color='#B71C1C'> – R.</font><br>" +
                            "Velebte so mnou Pána <font color='#B71C1C'>*</font><br>" +
                            "a oslavujme jeho meno spoločne.<br>" +
                            "Hľadal som Pána a on ma vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vytrhol ma zo všetkej hrôzy.<font color='#B71C1C'> – R.</font><br>" +
                            "Na neho hľaďte a budete žiariť <font color='#B71C1C'>*</font><br>" +
                            "a tvár vám nesčervenie hanbou.<br>" +
                            "Úbožiak zavolal a Pán ho vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ho zo všetkých tiesní.<font color='#B71C1C'> – R.</font><br>" +
                            "Ako strážca sa utáborí anjel Pánov okolo bohabojných <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodí ich.<br>" +
                            "Skúste a presvedčte sa, aký dobrý je Pán; <font color='#B71C1C'>*</font><br>" +
                            "šťastný človek, čo sa utieka k nemu.<font color='#B71C1C'> – R.</font>"},};
    String[][] zalm7 = {
            {"02g", "", "", "Iz 12, 2-3. 4b-d. 5-6",
                    "<font color='#B71C1C'>R.:</font> Plesajme a jasajme, lebo uprostred nás je Svätý, Boh.<br><br>" +
                            "\"Hľa, Boh je moja spása; <font color='#B71C1C'>*</font><br>" +
                            "dúfam a nebojím sa,<br>" +
                            "lebo moja sila a chvála je Pán, <font color='#B71C1C'>*</font><br>" +
                            "on sa mi stal záchrancom.\"<br>" +
                            "Budete čerpať vodu s radosťou <font color='#B71C1C'>*</font><br>" +
                            "z prameňov spásy.<font color='#B71C1C'> – R.</font><br>" +
                            "\"Oslavujte Pána a vzývajte jeho meno, <font color='#B71C1C'>†</font><br>" +
                            "ohlasujte medzi národmi jeho zázraky, <font color='#B71C1C'>*</font><br>" +
                            "pamätajte, že jeho meno je vznešené.<font color='#B71C1C'> – R.</font><br>" +
                            "Spievajte Pánovi, lebo urobil veľké veci; <font color='#B71C1C'>*</font><br>" +
                            "nech je to známe po celej zemi.<br>" +
                            "Plesaj a jasaj, obyvateľka Siona, <font color='#B71C1C'>*</font><br>" +
                            "lebo veľký uprostred teba je Svätý Izraela.\"<font color='#B71C1C'> – R.</font>"},
            {"03g", "", "", "Ž 117, 1. 2",
                    "<font color='#B71C1C'>R.:</font> Choďte do celého sveta a hlásajte evanjelium.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľte Pána, všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "oslavujte ho, všetci ľudia;<font color='#B71C1C'> – R.</font><br>" +
                            "lebo je veľké jeho milosrdenstvo voči nám <font color='#B71C1C'>*</font><br>" +
                            "a pravda Pánova trvá naveky.<font color='#B71C1C'> – R.</font>"},
            {"05gk", "", "", "Ž 117, 1. 2",
                    "<font color='#B71C1C'>R.:</font> Choďte do celého sveta a hlásajte evanjelium.<br><br>" +
                            "Chváľte Pána, všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "oslavujte ho, všetci ľudia;<font color='#B71C1C'> – R.</font><br>" +
                            "lebo je veľké jeho milosrdenstvo voči nám <font color='#B71C1C'>*</font><br>" +
                            "a pravda Pánova trvá naveky.<font color='#B71C1C'> – R.</font>"},
            {"11g", "", "", "Ž 34, 2-3. 4-5. 6-7. 8-9. 10-11",
                    "<font color='#B71C1C'>R.:</font> Pána chcem velebiť v každom čase.<br><br>" +
                            "Pána chcem velebiť v každom čase, <font color='#B71C1C'>*</font><br>" +
                            "moje ústa budú ho vždy chváliť.<br>" +
                            "V Pánovi sa bude chváliť moja duša; <font color='#B71C1C'>*</font><br>" +
                            "nechže to počujú pokorní a nech sa tešia.<font color='#B71C1C'> – R.</font><br>" +
                            "Velebte so mnou Pána <font color='#B71C1C'>*</font><br>" +
                            "a oslavujme jeho meno spoločne.<br>" +
                            "Hľadal som Pána a on ma vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vytrhol ma zo všetkej hrôzy.<font color='#B71C1C'> – R.</font><br>" +
                            "Na neho hľaďte a budete žiariť <font color='#B71C1C'>*</font><br>" +
                            "a tvár vám nesčervenie hanbou.<br>" +
                            "Úbožiak zavolal a Pán ho vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ho zo všetkých tiesní.<font color='#B71C1C'> – R.</font><br>" +
                            "Ako strážca sa utáborí anjel Pánov okolo bohabojných <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodí ich.<br>" +
                            "Skúste a presvedčte sa, aký dobrý je Pán; <font color='#B71C1C'>*</font><br>" +
                            "šťastný človek, čo sa utieka k nemu.<font color='#B71C1C'> – R.</font><br>" +
                            "Vy, jeho svätí, bojte sa Pána, <font color='#B71C1C'>*</font><br>" +
                            "veď bohabojní núdzu nemajú.<br>" +
                            "Boháči sa nabiedia a nahladujú, <font color='#B71C1C'>*</font><br>" +
                            "ale tým, čo hľadajú Pána,<br>" +
                            "nijaké dobro chýbať nebude.<font color='#B71C1C'> – R.</font>"},
            /*{"16", "", "", "Lk 1, 46-47. 48-49. 50-51. 52-53. 54-55",
                    "<font color='#B71C1C'>R.:</font> Blahoslavená si, Panna Mária, lebo si nosila Syna večného Otca.<br><br>" +
                            "Velebí moja duša Pána <font color='#B71C1C'>*</font><br>" +
                            "a môj duch jasá v Bohu, mojom Spasiteľovi,<font color='#B71C1C'> – R.</font><br>" +
                            "lebo zhliadol na poníženosť svojej služobnice. <font color='#B71C1C'>*</font><br>" +
                            "Hľa, od tejto chvíle<br>" +
                            "blahoslaviť ma budú všetky pokolenia,<br>" +
                            "lebo veľké veci mi urobil ten, ktorý je mocný, <font color='#B71C1C'>*</font><br>" +
                            "a sväté je jeho meno<font color='#B71C1C'> – R.</font><br>" +
                            "a jeho milosrdenstvo z pokolenia na pokolenie <font color='#B71C1C'>*</font><br>" +
                            "s tými, čo sa ho boja.<br>" +
                            "Ukázal silu svojho ramena, <font color='#B71C1C'>*</font><br>" +
                            "rozptýlil tých, čo v srdci pyšne zmýšľajú.<font color='#B71C1C'> – R.</font><br>" +
                            "Mocnárov zosadil z trónov <font color='#B71C1C'>*</font><br>" +
                            "a povýšil ponížených.<br>" +
                            "Hladných nakŕmil dobrotami <font color='#B71C1C'>*</font><br>" +
                            "a bohatých prepustil naprázdno.<font color='#B71C1C'> – R.</font><br>" +
                            "Ujal sa Izraela, svojho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "lebo pamätá na svoje milosrdenstvo,<br>" +
                            "ako sľúbil našim otcom, <font color='#B71C1C'>*</font><br>" +
                            "Abrahámovi a jeho potomstvu naveky.<font color='#B71C1C'> – R.</font>"},*/
            {"17gk", "", "", "Ž 16, 1-2a+5. 7-8. 11",
                    "<font color='#B71C1C'>R.:</font> Ty, Pane, si moje jediné dobro.<br><br>" +
                            "Ochráň ma, Bože, k tebe sa utiekam. <font color='#B71C1C'>*</font><br>" +
                            "Hovorím Pánovi: \"Ty si môj Pán.\"<br>" +
                            "Ty, Pane, si môj podiel na dedičstve a na kalichu, <font color='#B71C1C'>*</font><br>" +
                            "v tvojich rukách je môj osud.<font color='#B71C1C'> – R.</font><br>" +
                            "Velebím Pána, čo ma múdrosťou obdaril; <font color='#B71C1C'>*</font><br>" +
                            "v noci ma k tomu moje srdce vyzýva.<br>" +
                            "Pána mám vždy pred očami; <font color='#B71C1C'>*</font><br>" +
                            "a pretože je po mojej pravici, nezakolíšem sa.<font color='#B71C1C'> – R.</font><br>" +
                            "Ukážeš mi cestu života. <font color='#B71C1C'>†</font><br>" +
                            "U teba je plnosť radosti, <font color='#B71C1C'>*</font><br>" +
                            "po tvojej pravici večná slasť.<font color='#B71C1C'> – R.</font>"},
            {"17g", "", "", "Ž 16, 1-2a+5. 7-8. 11",
                    "<font color='#B71C1C'>R.:</font> Ty, Pane, si moje jediné dobro.<br><br>" +
                            "Ochráň ma, Bože, k tebe sa utiekam. <font color='#B71C1C'>*</font><br>" +
                            "Hovorím Pánovi: \"Ty si môj Pán.\"<br>" +
                            "Ty, Pane, si môj podiel na dedičstve a na kalichu, <font color='#B71C1C'>*</font><br>" +
                            "v tvojich rukách je môj osud.<font color='#B71C1C'> – R.</font><br>" +
                            "Velebím Pána, čo ma múdrosťou obdaril; <font color='#B71C1C'>*</font><br>" +
                            "v noci ma k tomu moje srdce vyzýva.<br>" +
                            "Pána mám vždy pred očami; <font color='#B71C1C'>*</font><br>" +
                            "a pretože je po mojej pravici, nezakolíšem sa.<font color='#B71C1C'> – R.</font><br>" +
                            "Ukážeš mi cestu života. <font color='#B71C1C'>†</font><br>" +
                            "U teba je plnosť radosti, <font color='#B71C1C'>*</font><br>" +
                            "po tvojej pravici večná slasť.<font color='#B71C1C'> – R.</font>"},
            {"22g", "", "", "Ž 63, 2. 3-4. 5-6. 8-9",
                    "<font color='#B71C1C'>R.:</font> Za tebou prahne moja duša, Pane, Bože môj.<br><br>" +
                            "Bože, ty si môj Boh, <font color='#B71C1C'>*</font><br>" +
                            "už od úsvitu sa viniem k tebe.<br>" +
                            "Za tebou prahne moja duša, <font color='#B71C1C'>*</font><br>" +
                            "za tebou túži moje telo;<br>" +
                            "ako vyschnutá, pustá zem bez vody,<font color='#B71C1C'> – R.</font><br>" +
                            "tak ťa túžim uzrieť vo svätyni <font color='#B71C1C'>*</font><br>" +
                            "a vidieť tvoju moc a slávu.<br>" +
                            "Veď tvoja milosť je lepšia než život; <font color='#B71C1C'>*</font><br>" +
                            "moje pery budú ťa oslavovať.<font color='#B71C1C'> – R.</font><br>" +
                            "Celý život ťa chcem velebiť <font color='#B71C1C'>*</font><br>" +
                            "a v tvojom mene dvíhať svoje ruky k modlitbe.<br>" +
                            "Sťa na bohatej hostine sa nasýti moja duša <font color='#B71C1C'>*</font><br>" +
                            "a moje ústa ťa budú chváliť jasavými perami.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo ty si mi pomáhal <font color='#B71C1C'>*</font><br>" +
                            "a pod ochranou tvojich krídel budem plesať.<br>" +
                            "Moja duša sa vinie k tebe, <font color='#B71C1C'>*</font><br>" +
                            "ujímaš sa ma svojou pravicou.<font color='#B71C1C'> – R.</font>"},
            {"23g", "", "", "Ž 34, 2-3. 4-5. 6-7. 8-9. 10-11",
                    "<font color='#B71C1C'>R.:</font> Velebiť budem Pána v každom čase.<br>" +
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
                            "a vyslobodil ho zo všetkých tiesní. <font color='#B71C1C'>– R.</font><br>" +
                            "Ako strážca sa utáborí anjel Pánov okolo bohabojných <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodí ich.<br>" +
                            "Skúste a presvedčte sa, aký dobrý je Pán; <font color='#B71C1C'>*</font><br>" +
                            "šťastný človek, čo sa utieka k nemu. <font color='#B71C1C'>– R.</font><br>" +
                            "Vy, jeho svätí, bojte sa Pána, <font color='#B71C1C'>*</font><br>" +
                            "veď bohabojní núdzu nemajú.<br>" +
                            "Boháči sa nabiedia a nahladujú, <font color='#B71C1C'>*</font><br>" +
                            "ale tým, čo hľadajú Pána,<br>" +
                            "nijaké dobro chýbať nebude. <font color='#B71C1C'>– R.</font>"},

            {"25g", "", "", "Ž 126, 1-2b. 2c-3. 4-5. 6",
                    "<font color='#B71C1C'>R.:</font> Pane, tí, čo sejú v slzách, s jasotom budú žať.<br><br>" +
                            "Keď Pán privádzal späť sionských zajatcov, <font color='#B71C1C'>*</font><br>" +
                            "boli sme ako vo snách.<br>" +
                            "Ústa sme mali plné radosti <font color='#B71C1C'>*</font><br>" +
                            "a jazyk plný plesania.<font color='#B71C1C'> – R.</font><br>" +
                            "Vtedy sa hovorilo medzi pohanmi: <font color='#B71C1C'>*</font><br>" +
                            "\"Veľké veci urobil s nimi Pán.\"<br>" +
                            "Veľké veci urobil s nami Pán <font color='#B71C1C'>*</font><br>" +
                            "a máme z toho radosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Zmeň, Pane, naše zajatie <font color='#B71C1C'>*</font><br>" +
                            "ako potoky na juhu krajiny.<br>" +
                            "Tí, čo sejú v slzách, <font color='#B71C1C'>*</font><br>" +
                            "s jasotom budú žať.<font color='#B71C1C'> – R.</font><br>" +
                            "Keď odchádzali, idúcky plakali <font color='#B71C1C'>*</font><br>" +
                            "a osivo niesli na siatie.<br>" +
                            "No keď sa vrátia, vrátia sa s jasotom <font color='#B71C1C'>*</font><br>" +
                            "a svoje snopy prinesú.<font color='#B71C1C'> – R.</font>"},
            {"29", "", "", "Ž 34, 2-3. 4-5. 6-7. 8-9. 10-11",
                    "<font color='#B71C1C'>R.:</font> Skúste a presvedčte sa, aký dobrý je Pán.<br><br>" +
                            "Pána chcem velebiť v každom čase, <font color='#B71C1C'>*</font><br>" +
                            "moje ústa budú ho vždy chváliť.<br>" +
                            "V Pánovi sa bude chváliť moja duša; <font color='#B71C1C'>*</font><br>" +
                            "nechže to počujú pokorní a nech sa tešia.<font color='#B71C1C'> – R.</font><br>" +
                            "Velebte so mnou Pána <font color='#B71C1C'>*</font><br>" +
                            "a oslavujme jeho meno spoločne.<br>" +
                            "Hľadal som Pána a on ma vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vytrhol ma zo všetkej hrôzy.<font color='#B71C1C'> – R.</font><br>" +
                            "Na neho hľaďte a budete žiariť <font color='#B71C1C'>*</font><br>" +
                            "a tvár vám nesčervenie hanbou.<br>" +
                            "Úbožiak zavolal a Pán ho vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ho zo všetkých tiesní.<font color='#B71C1C'> – R.</font><br>" +
                            "Ako strážca sa utáborí anjel Pánov okolo bohabojných <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodí ich.<br>" +
                            "Skúste a presvedčte sa, aký dobrý je Pán; <font color='#B71C1C'>*</font><br>" +
                            "šťastný človek, čo sa utieka k nemu.<font color='#B71C1C'> – R.</font><br>" +
                            "Vy, jeho svätí, bojte sa Pána, <font color='#B71C1C'>*</font><br>" +
                            "veď bohabojní núdzu nemajú.<br>" +
                            "Boháči sa nabiedia a nahladujú, <font color='#B71C1C'>*</font><br>" +
                            "ale tým, čo hľadajú Pána,<br>" +
                            "nijaké dobro chýbať nebude.<font color='#B71C1C'> – R.</font>"},};
    String[][] zalm8 = {
            {"06gn", "", "", "Ž 97, 1-2. 5-6. 9",
                    "<font color='#B71C1C'>R.:</font> Pán kraľuje; Najvyšší na celej zemi.<br><br>" +
                            "Pán kraľuje, jasaj, zem; <font color='#B71C1C'>*</font><br>" +
                            "radujte sa, všetky ostrovy.<br>" +
                            "Vôkol neho oblaky a mrákavy, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a právo sú základom jeho trónu.<font color='#B71C1C'> – R.</font><br>" +
                            "Ako vosk sa topia vrchy pred tvárou Pánovou, <font color='#B71C1C'>*</font><br>" +
                            "pred Pánom celej zeme.<br>" +
                            "Jeho spravodlivosť ohlasujú nebesia <font color='#B71C1C'>*</font><br>" +
                            "a jeho slávu vidia všetky národy.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo ty, Pane, si Najvyšší na celej zemi, <font color='#B71C1C'>*</font><br>" +
                            "nesmierne prevyšuješ všetky božstvá.<font color='#B71C1C'> – R.</font>"},
            {"09g", "", "", "Ž 45, 11-12. 14-15. 16-17",
                    "<font color='#B71C1C'>R.:</font> Čuj, dcéra, a pozoruj a nakloň svoj sluch.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Ženích prichádza, vyjdite v ústrety Kristu Pánovi!<br><br>" +
                            "Čuj, dcéra, a pozoruj, nakloň svoj sluch, <font color='#B71C1C'>*</font><br>" +
                            "zabudni na svoj ľud a na dom svojho otca.<br>" +
                            "Sám kráľ zatúžil za tvojou krásou; <font color='#B71C1C'>*</font><br>" +
                            "on je tvoj Pán, vzdaj mu poklonu.<font color='#B71C1C'> – R.</font><br>" +
                            "Veľmi vznešená je dcéra kráľovská vnútri, <font color='#B71C1C'>*</font><br>" +
                            "jej odevom sú zlaté tkanivá.<br>" +
                            "V pestrom rúchu ju vedú ku kráľovi; <font color='#B71C1C'>*</font><br>" +
                            "za ňou ti privádzajú panny, jej družice.<font color='#B71C1C'> – R.</font><br>" +
                            "Sprevádza ich jasot radostný, <font color='#B71C1C'>*</font><br>" +
                            "tak vstupujú do kráľovského paláca.<br>" +
                            "Miesto tvojich otcov zaujmú tvoji synovia; <font color='#B71C1C'>*</font><br>" +
                            "urobíš ich kniežatami nad celou zemou.<font color='#B71C1C'> – R.</font>"},
            {"10g", "", "", "Ž 112, 1-2. 5-6. 7-8. 9",
                    "<font color='#B71C1C'>R.:</font> V obľube je človek, čo sa zľutúva a rád pomáha.<br><br>" +
                            "Blažený muž, ktorý sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a má veľkú záľubu v jeho príkazoch.<br>" +
                            "Jeho potomstvo bude mocné na zemi; <font color='#B71C1C'>*</font><br>" +
                            "pokolenie spravodlivých bude požehnané.<font color='#B71C1C'> – R.</font><br>" +
                            "V obľube je človek, čo sa zľutúva a rád pomáha, <font color='#B71C1C'>*</font><br>" +
                            "čo svoj majetok čestne spravuje;<br>" +
                            "nikdy nezakolíše. <font color='#B71C1C'>*</font><br>" +
                            "Vo večnej pamäti bude spravodlivý.<font color='#B71C1C'> – R.</font><br>" +
                            "Nebude sa báť zlej zvesti. <font color='#B71C1C'>*</font><br>" +
                            "Jeho srdce je pevné, dôveruje v Pána,<br>" +
                            "bezpečné je jeho srdce, nebojí sa, <font color='#B71C1C'>*</font><br>" +
                            "kým nepokorí svojich nepriateľov.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozdeľuje a dáva chudobným; <font color='#B71C1C'>†</font><br>" +
                            "jeho dobročinnosť potrvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho moc a sláva budú stále rásť.<font color='#B71C1C'> – R.</font>"},
            {"14gk", "", "", "Ž 132, 6-7. 9-10. 13-14",
                    "<font color='#B71C1C'>R.:</font> Vstaň, Pane, zaujmi svoje miesto, ty a tvoja vznešená archa.<br><br>" +
                            "Počuli sme, že archa je v Efrate, <font color='#B71C1C'>*</font><br>" +
                            "a našli sme ju na jaarských nivách.<br>" +
                            "Vstúpme teda do Pánovho príbytku <font color='#B71C1C'>*</font><br>" +
                            "a padnime k podnožke jeho nôh.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoji kňazi nech sa odejú do spravodlivosti <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech plesajú.<br>" +
                            "Pre svojho služobníka Dávida <font color='#B71C1C'>*</font><br>" +
                            "neodmietaj tvár svojho pomazaného.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán si vyvolil Sion, <font color='#B71C1C'>*</font><br>" +
                            "želal si mať ho za svoj príbytok:<br>" +
                            "\"To je miesto môjho odpočinku naveky; <font color='#B71C1C'>*</font><br>" +
                            "tu budem bývať, lebo som túžil za ním.\"<font color='#B71C1C'> – R.</font>"},
            {"15gk", "", "", "Ž 45, 10. 11-12. 15-16",
                    "<font color='#B71C1C'>R.:</font> Po tvojej pravici, Pane, stojí kráľovná ozdobená zlatom.<br><br>" +
                            "Dcéry kráľovské sú medzi tvojimi vyvolenými; <font color='#B71C1C'>*</font><br>" +
                            "po tvojej pravici stojí kráľovná<br>" +
                            "ozdobená zlatom z Ofíru.<font color='#B71C1C'> – R.</font><br>" +
                            "Čuj, dcéra, a pozoruj, nakloň svoj sluch, <font color='#B71C1C'>*</font><br>" +
                            "zabudni na svoj ľud a na dom svojho otca.<br>" +
                            "Sám kráľ zatúžil za tvojou krásou; <font color='#B71C1C'>*</font><br>" +
                            "on je tvoj pán, vzdaj mu poklonu.<font color='#B71C1C'> – R.</font><br>" +
                            "V pestrom rúchu ju vedú ku kráľovi; <font color='#B71C1C'>*</font><br>" +
                            "za ňou ti privádzajú panny, jej družice.<br>" +
                            "Sprevádza ich jasot radostný, <font color='#B71C1C'>*</font><br>" +
                            "tak vstupujú do kráľovského paláca.<font color='#B71C1C'> – R.</font>"},
            {"24g", "", "", "Ž 145, 10-11. 12-13b. 17-18",
                    "<font color='#B71C1C'>R.:</font> Tvoji svätí, Pane, oznamujú slávu tvojho kráľovstva.<br><br>" +
                            "Nech ťa oslavujú, Pane, všetky tvoje diela <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech ťa velebia.<br>" +
                            "Nech rozprávajú o sláve tvojho kráľovstva <font color='#B71C1C'>*</font><br>" +
                            "a o tvojej moci nech hovoria;<font color='#B71C1C'> – R.</font><br>" +
                            "nech ľuďom oznamujú tvoje zázraky <font color='#B71C1C'>*</font><br>" +
                            "i slávu a velebu tvojho kráľovstva.<br>" +
                            "Tvoje kráľovstvo je kráľovstvo pre všetky veky <font color='#B71C1C'>*</font><br>" +
                            "a tvoja vláda sa rozprestiera na všetky pokolenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Spravodlivý je Pán na všetkých svojich cestách <font color='#B71C1C'>*</font><br>" +
                            "a svätý vo všetkých svojich skutkoch.<br>" +
                            "Blízky je Pán všetkým, čo ho vzývajú, <font color='#B71C1C'>*</font><br>" +
                            "všetkým, čo ho vzývajú úprimne.<font color='#B71C1C'> – R.</font>"},
            {"29", "", "", "Ž 71, 1-2. 3-4a. 5-6b. 15ab+17",
                    "<font color='#B71C1C'>R.:</font> Moje ústa, Pane, budú hlásať tvoju spásu.<br><br>" +
                            "V teba, Pane, som dúfal; <font color='#B71C1C'>*</font><br>" +
                            "nebudem zahanbený naveky.<br>" +
                            "Vo svojej spravodlivosti ma vysloboď a zachráň, <font color='#B71C1C'>*</font><br>" +
                            "nakloň ku mne svoj sluch a pomôž mi.<font color='#B71C1C'> – R.</font><br>" +
                            "Buď mi ochrannou skalou a opevneným hradom <font color='#B71C1C'>*</font><br>" +
                            "na moju záchranu;<br>" +
                            "veď ty si moja opora a moje útočište. <font color='#B71C1C'>*</font><br>" +
                            "Bože môj, vytrhni ma z ruky hriešnika.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo ja, Pane, túžim za tebou, <font color='#B71C1C'>*</font><br>" +
                            "ty, Pane, si moja nádej od mojej mladosti.<br>" +
                            "Od matkinho lona mám v tebe oporu, <font color='#B71C1C'>*</font><br>" +
                            "od života matky si mojím ochrancom.<font color='#B71C1C'> – R.</font><br>" +
                            "Moje ústa budú hlásať tvoju spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a tvoju spásu deň čo deň.<br>" +
                            "Bože, ty si ma poúčal od mojej mladosti <font color='#B71C1C'>*</font><br>" +
                            "a ja až doteraz ohlasujem tvoje diela zázračné.<font color='#B71C1C'> – R.</font>"},};
    String[][] zalm9 = {
            {"08g", "", "", "Ž 13, 6ab. 6cd",
                    "<font color='#B71C1C'>R.:</font> Duša mi jasá v mojom Bohu.<br><br>" +
                            "Ja dúfam v tvoje milosrdenstvo, <font color='#B71C1C'>*</font><br>" +
                            "moje srdce sa teší z tvojej pomoci.<font color='#B71C1C'> – R.</font><br>" +
                            "Budem spievať Pánovi, že ma zahŕňa dobrodeniami, <font color='#B71C1C'>*</font><br>" +
                            "oslavovať budem meno najvyššieho Pána.<font color='#B71C1C'> – R.</font>"},
            {"14gn", "", "", "Ž 78, 1-2. 34-35. 36-37. 38",
                    "<font color='#B71C1C'>R.:</font> Pane, ty buď našou spásou.<br><br>" +
                            "Počúvaj, ľud môj, moju náuku, <font color='#B71C1C'>*</font><br>" +
                            "nakloň sluch k slovám mojich úst.<br>" +
                            "Otvorím svoje ústa v podobenstvách, <font color='#B71C1C'>*</font><br>" +
                            "vyrozprávam starodávne tajomstvá.<font color='#B71C1C'> – R.</font><br>" +
                            "Keď na nich smrť zoslal, vtedy ho hľadali, <font color='#B71C1C'>*</font><br>" +
                            "obrátili sa a na úsvite prichádzali k nemu.<br>" +
                            "Rozpamätali sa, že Boh je ich pomoc, <font color='#B71C1C'>*</font><br>" +
                            "že Najvyšší, Boh, je ich záchranca.<font color='#B71C1C'> – R.</font><br>" +
                            "No podvádzali ho svojimi ústami, <font color='#B71C1C'>*</font><br>" +
                            "svojím jazykom ho klamali.<br>" +
                            "Ich srdcia neboli k nemu úprimné, <font color='#B71C1C'>*</font><br>" +
                            "ani jeho zmluve neboli verní.<font color='#B71C1C'> – R.</font><br>" +
                            "On sa predsa zľutoval a odpustil im vinu <font color='#B71C1C'>*</font><br>" +
                            "a nezničil ich.<br>" +
                            "Často svoj hnev potlačil <font color='#B71C1C'>*</font><br>" +
                            "a nedal celkom vzplanúť svojmu rozhorčeniu.<font color='#B71C1C'> – R.</font>"},
            {"15gk", "", "", "Lk 1, 46-47. 48-49. 50-51. 52-53. 54-55",
                    "<font color='#B71C1C'>R.:</font> Ty si sláva nášho národa, ty si radosť nášho ľudu.<br><br>" +
                            "Velebí moja duša Pána <font color='#B71C1C'>*</font><br>" +
                            "a môj duch jasá v Bohu, mojom Spasiteľovi,<font color='#B71C1C'> – R.</font><br>" +
                            "lebo zhliadol na poníženosť svojej služobnice. <font color='#B71C1C'>*</font><br>" +
                            "Hľa, od tejto chvíle<br>" +
                            "blahoslaviť ma budú všetky pokolenia,<br>" +
                            "lebo veľké veci mi urobil ten, ktorý je mocný, <font color='#B71C1C'>*</font><br>" +
                            "a sväté je jeho meno<font color='#B71C1C'> – R.</font><br>" +
                            "a jeho milosrdenstvo z pokolenia na pokolenie <font color='#B71C1C'>*</font><br>" +
                            "s tými, čo sa ho boja.<br>" +
                            "Ukázal silu svojho ramena, <font color='#B71C1C'>*</font><br>" +
                            "rozptýlil tých, čo v srdci pyšne zmýšľajú.<font color='#B71C1C'> – R.</font><br>" +
                            "Mocnárov zosadil z trónov <font color='#B71C1C'>*</font><br>" +
                            "a povýšil ponížených.<br>" +
                            "Hladných nakŕmil dobrotami <font color='#B71C1C'>*</font><br>" +
                            "a bohatých prepustil naprázdno.<font color='#B71C1C'> – R.</font><br>" +
                            "Ujal sa Izraela, svojho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "lebo pamätá na svoje milosrdenstvo,<br>" +
                            "ako sľúbil našim otcom, <font color='#B71C1C'>*</font><br>" +
                            "Abrahámovi a jeho potomstvu naveky.<font color='#B71C1C'> – R.</font>"},
            {"21g", "", "", "Ž 19, 2-3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Po celej zemi rozlieha sa ich hlas.<br><br>" +
                            "Nebesia rozprávajú o sláve Boha <font color='#B71C1C'>*</font><br>" +
                            "a obloha hlása dielo jeho rúk.<br>" +
                            "Deň dňu o tom podáva správu <font color='#B71C1C'>*</font><br>" +
                            "a noc noci to dáva na známosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Nie sú to slová, nie je to reč, <font color='#B71C1C'>*</font><br>" +
                            "ktorá by sa nedala počuť.<br>" +
                            "Po celej zemi rozlieha sa ich hlas <font color='#B71C1C'>*</font><br>" +
                            "a ich slová až po končiny sveta.<font color='#B71C1C'> – R.</font>"},
            {"29g", "", "", "Ž 138, 1-2a. 2b-3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Pred tvárou anjelov budem hrať a spievať tebe, Pane.<br><br>" +
                            "Chcem ťa, Pane, oslavovať celým srdcom, <font color='#B71C1C'>*</font><br>" +
                            "že si vypočul slová mojich úst.<br>" +
                            "Budem ti hrať pred tvárou anjelov, <font color='#B71C1C'>*</font><br>" +
                            "vrhnem sa na tvár pred tvojím svätým chrámom.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoje meno budem oslavovať, <font color='#B71C1C'>†</font><br>" +
                            "pretože si milosrdný a verný <font color='#B71C1C'>*</font><br>" +
                            "a nadovšetko si zvelebil svoje meno<br>" +
                            "a svoje prisľúbenia.<br>" +
                            "Vždy si ma vyslyšal, keď som ťa vzýval, <font color='#B71C1C'>*</font><br>" +
                            "a rozmnožil si vo mne odvahu.<font color='#B71C1C'> – R.</font><br>" +
                            "Oslavovať ťa budú, Pane, všetci králi zeme, <font color='#B71C1C'>*</font><br>" +
                            "lebo počuli slová tvojich úst.<br>" +
                            "Budú ospevovať Pánove cesty, <font color='#B71C1C'>*</font><br>" +
                            "lebo veľká je Pánova sláva.<font color='#B71C1C'> – R.</font>"},
    };

    String[][] zalm10 = {
            {"02", "", "", "Ž 91, 1-2. 3-4. 5-6. 10-11",
                    "<font color='#B71C1C'>R.:</font> Svojim anjelom dá príkaz o tebe, aby ťa strážili na tvojich cestách.<br><br>" +
                            "Kto pod ochranou Najvyššieho prebýva <font color='#B71C1C'>*</font><br>" +
                            "a v tôni Všemohúceho sa zdržiava,<br>" +
                            "povie Pánovi: \"Ty si moje útočište a pevnosť moja; <font color='#B71C1C'>*</font><br>" +
                            "v tebe mám dôveru, Bože môj.\" <font color='#B71C1C'>– R.</font><br>" +
                            "Veď on sám ťa vyslobodí z osídel lovcov <font color='#B71C1C'>*</font><br>" +
                            "a zo zhubného moru.<br>" +
                            "Svojimi krídlami ťa zacloní <font color='#B71C1C'>*</font><br>" +
                            "a uchýliš sa pod jeho perute. <font color='#B71C1C'>– R.</font><br>" +
                            "Jeho pravda je štítom a pancierom, <font color='#B71C1C'>*</font><br>" +
                            "nebudeš sa báť nočnej hrôzy, ani šípu letiaceho vo dne, <font color='#B71C1C'>†</font><br>" +
                            "ani moru, čo sa tmou zakráda, <font color='#B71C1C'>*</font><br>" +
                            "ani nákazy, čo pustoší na poludnie. <font color='#B71C1C'>– R.</font><br>" +
                            "Nestihne ťa nijaké nešťastie <font color='#B71C1C'>*</font><br>" +
                            "a k tvojmu stanu sa nepriblíži pohroma,<br>" +
                            "lebo svojim anjelom dá príkaz o tebe, <font color='#B71C1C'>*</font><br>" +
                            "aby ťa strážili na všetkých tvojich cestách. <font color='#B71C1C'>– R.</font>"},
            /*{"07", "", "", "Lk 1, 46-47. 48-49. 50-51. 52-53. 54-55",
                    "<font color='#B71C1C'>R.:</font> Blahoslavená si, Panna Mária, lebo si nosila Syna večného Otca.<br><br>" +
                            "Velebí moja duša Pána <font color='#B71C1C'>*</font><br>" +
                            "a môj duch jasá v Bohu, mojom Spasiteľovi, <font color='#B71C1C'>– R.</font><br>" +
                            "lebo zhliadol na poníženosť svojej služobnice. <font color='#B71C1C'>*</font><br>" +
                            "Hľa, od tejto chvíle<br>" +
                            "blahoslaviť ma budú všetky pokolenia,<br>" +
                            "lebo veľké veci mi urobil ten, ktorý je mocný, <font color='#B71C1C'>*</font><br>" +
                            "a sväté je jeho meno <font color='#B71C1C'>– R.</font><br>" +
                            "a jeho milosrdenstvo z pokolenia na pokolenie <font color='#B71C1C'>*</font><br>" +
                            "s tými, čo sa ho boja.<br>" +
                            "Ukázal silu svojho ramena, <font color='#B71C1C'>*</font><br>" +
                            "rozptýlil tých, čo v srdci pyšne zmýšľajú. <font color='#B71C1C'>– R.</font><br>" +
                            "Mocnárov zosadil z trónov <font color='#B71C1C'>*</font><br>" +
                            "a povýšil ponížených.<br>" +
                            "Hladných nakŕmil dobrotami <font color='#B71C1C'>*</font><br>" +
                            "a bohatých prepustil naprázdno. <font color='#B71C1C'>– R.</font><br>" +
                            "Ujal sa Izraela, svojho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "lebo pamätá na svoje milosrdenstvo,<br>" +
                            "ako sľúbil našim otcom, <font color='#B71C1C'>*</font><br>" +
                            "Abrahámovi a jeho potomstvu naveky. <font color='#B71C1C'>– R.</font>"},*/
            {"07", "", "", "Ž 117, 1. 2",
                    "<font color='#B71C1C'>R.:</font> Choďte do celého sveta a hlásajte evanjelium.<br><br>" +
                            "Chváľte Pána, všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "oslavujte ho, všetci ľudia;<font color='#B71C1C'> – R.</font><br>" +
                            "lebo je veľké jeho milosrdenstvo voči nám <font color='#B71C1C'>*</font><br>" +
                            "a pravda Pánova trvá naveky.<font color='#B71C1C'> – R.</font>"},
            {"18g", "", "", "Ž 145, 10-11. 12-13b. 17-18",
                    "<font color='#B71C1C'>R.:</font> Tvoji svätí, Pane, oznamujú slávu tvojho kráľovstva.<br><br>" +
                            "Nech ťa oslavujú, Pane, všetky tvoje diela <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech ťa velebia.<br>" +
                            "Nech rozprávajú o sláve tvojho kráľovstva <font color='#B71C1C'>*</font><br>" +
                            "a o tvojej moci nech hovoria; <font color='#B71C1C'>– R.</font><br>" +
                            "nech ľuďom oznamujú tvoje zázraky <font color='#B71C1C'>*</font><br>" +
                            "i slávu a velebu tvojho kráľovstva.<br>" +
                            "Tvoje kráľovstvo je kráľovstvo pre všetky veky <font color='#B71C1C'>*</font><br>" +
                            "a tvoja vláda sa rozprestiera na všetky pokolenia. <font color='#B71C1C'>– R.</font><br>" +
                            "Spravodlivý je Pán na všetkých svojich cestách <font color='#B71C1C'>*</font><br>" +
                            "a svätý vo všetkých svojich skutkoch.<br>" +
                            "Blízky je Pán všetkým, čo ho vzývajú, <font color='#B71C1C'>*</font><br>" +
                            "všetkým, čo ho vzývajú úprimne. <font color='#B71C1C'>– R.</font>"},
            {"26gk+", "", "", "Ž 84, 3. 4. 5+10. 11",
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
                            "ako prebývať v stanoch hriešnikov.<font color='#B71C1C'> – R.</font>"},
            {"28g", "", "", "Ž 19, 2-3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Po celej zemi rozlieha sa ich hlas.<br><br>" +
                            "Nebesia rozprávajú o sláve Boha <font color='#B71C1C'>*</font><br>" +
                            "a obloha hlása dielo jeho rúk.<br>" +
                            "Deň dňu o tom podáva správu <font color='#B71C1C'>*</font><br>" +
                            "a noc noci to dáva na známosť. <font color='#B71C1C'>– R.</font><br>" +
                            "Nie sú to slová, nie je to reč, <font color='#B71C1C'>*</font><br>" +
                            "ktorá by sa nedala počuť.<br>" +
                            "Po celej zemi rozlieha sa ich hlas <font color='#B71C1C'>*</font><br>" +
                            "a ich slová až po končiny sveta. <font color='#B71C1C'>– R.</font>"},
            {"31gk", "", "", "Ž 24, 1-2. 3-4b. 5-6",
                    "<font color='#B71C1C'>R.:</font> Blahoslavení čistého srdca, lebo oni uvidia Boha.<br><br>" +
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
    };

    String[][] zalm11 = {
            {"01gk", "", "", "Ž 24, 1-2. 3-4b. 5-6",
                    "<font color='#B71C1C'>R.:</font> Blahoslavení čistého srdca, lebo oni uvidia Boha.<br><br>" +
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
            {"02an", "", "", "Ž 27, 1. 4. 7+8b+9a. 13-14",
                    "<font color='#B71C1C'>R.:</font> Pán je moje svetlo a moja spása.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Verím, že uvidím dobrodenia Pánove v krajine žijúcich.<br><br>" +
                            "Pán je moje svetlo a moja spása, <font color='#B71C1C'>*</font><br>" +
                            "koho sa mám báť?<br>" +
                            "Pán je ochranca môjho života, <font color='#B71C1C'>*</font><br>" +
                            "pred kým sa mám strachovať? <font color='#B71C1C'>– R.</font><br>" +
                            "O jedno prosím Pána a za tým túžim, <font color='#B71C1C'>*</font><br>" +
                            "aby som mohol bývať v dome Pánovom<br>" +
                            "po všetky dni svojho života,<br>" +
                            "aby som pociťoval nehu Pánovu <font color='#B71C1C'>*</font><br>" +
                            "a obdivoval jeho chrám. <font color='#B71C1C'>– R.</font><br>" +
                            "Čuj, Pane, hlas môjho volania, <font color='#B71C1C'>*</font><br>" +
                            "zľutuj sa nado mnou a vyslyš ma.<br>" +
                            "Pane, ja hľadám tvoju tvár. <font color='#B71C1C'>*</font><br>" +
                            "Neodvracaj svoju tvár odo mňa. <font color='#B71C1C'>– R.</font><br>" +
                            "Verím, že uvidím dobrodenia Pánove <font color='#B71C1C'>*</font><br>" +
                            "v krajine žijúcich.<br>" +
                            "Očakávaj Pána a buď statočný; <font color='#B71C1C'>*</font><br>" +
                            "srdce maj silné a drž sa Pána. <font color='#B71C1C'>– R.</font>"},
            {"02bn", "", "", "Ž 116, 5-6. 10-11. 15-16ac",
                    "<font color='#B71C1C'>R.:</font> Pred tvárou Pána budem kráčať v krajine žijúcich.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Milostivý a spravodlivý je Pán, <font color='#B71C1C'>*</font><br>" +
                            "náš Boh sa zľutúva.<br>" +
                            "Pán ochraňuje maličkých; <font color='#B71C1C'>*</font><br>" +
                            "pomohol mi, keď som bol v biede. <font color='#B71C1C'>– R.</font><br>" +
                            "Dôveroval som, aj keď som povedal: <font color='#B71C1C'>*</font><br>" +
                            "\"Som veľmi pokorený.\"<br>" +
                            "V rozrušení som vyriekol: <font color='#B71C1C'>*</font><br>" +
                            "\"Všetci ľudia klamú.\" <font color='#B71C1C'>– R.</font><br>" +
                            "V Pánových očiach má veľkú cenu <font color='#B71C1C'>*</font><br>" +
                            "smrť jeho svätých.<br>" +
                            "Pane, som tvoj sluha, <font color='#B71C1C'>*</font><br>" +
                            "ty si mi putá rozviazal. <font color='#B71C1C'>– R.</font>"},
            {"02cn", "", "", "Ž 42, 2. 3. 5b-d; 43, 3. 4. 5",
                    "<font color='#B71C1C'>R.:</font> Po Bohu žízni moja duša, po Bohu živom.<br><br>" +
                            "Ako jeleň dychtí za vodou z prameňa, <font color='#B71C1C'>*</font><br>" +
                            "tak moja duša, Bože, túži za tebou. <font color='#B71C1C'>– R.</font><br>" +
                            "Po Bohu žízni moja duša, po Bohu živom; <font color='#B71C1C'>*</font><br>" +
                            "kedyže už prídem k nemu a uzriem Božiu tvár? <font color='#B71C1C'>– R.</font><br>" +
                            "Veď som putoval ku vznešenému stánku<br>" +
                            "a vstupoval do domu Božieho <font color='#B71C1C'>*</font><br>" +
                            "s radostným plesaním a s piesňou ďakovnou. <font color='#B71C1C'>– R.</font><br>" +
                            "Zošli svoje svetlo a svoju pravdu; <font color='#B71C1C'>†</font><br>" +
                            "ony nech ma sprevádzajú <font color='#B71C1C'>*</font><br>" +
                            "a privedú na tvoj svätý vrch a do tvojich stánkov. <font color='#B71C1C'>– R.</font><br>" +
                            "I pristúpim k Božiemu oltáru, <font color='#B71C1C'>†</font><br>" +
                            "k Bohu, ktorý ma napĺňa radosťou i plesaním, <font color='#B71C1C'>*</font><br>" +
                            "a citarou ťa, Bože, môj Bože, zvelebím. <font color='#B71C1C'>– R.</font><br>" +
                            "Prečo si smutná, duša moja? <font color='#B71C1C'>†</font><br>" +
                            "A prečo sa chveješ? <font color='#B71C1C'>*</font><br>" +
                            "Dúfaj v Pána, lebo ho ešte budem velebiť,<br>" +
                            "spásu mojej tváre a môjho Boha. <font color='#B71C1C'>– R.</font>"},
            {"09g", "", "", "Ž 46, 2-3. 5-6. 8-9b",
                    "<font color='#B71C1C'>R.:</font> Riečne ramená obveseľujú Božie mesto, posvätný stánok Najvyššieho.<br><br>" +
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
            {"11g", "", "", "Ž 89, 2-3. 4-5. 21-22. 25+27",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, ospevovať budem naveky.<br><br>" +
                            "Pánovo milosrdenstvo chcem ospevovať naveky; <font color='#B71C1C'>*</font><br>" +
                            "po všetky pokolenia hlásať svojimi ústami tvoju vernosť.<br>" +
                            "Veď ty si povedal: \"Moje milosrdenstvo je ustanovené naveky.\" <font color='#B71C1C'>*</font><br>" +
                            "Tvoja vernosť je upevnená v nebesiach. <font color='#B71C1C'>– R.</font><br>" +
                            "\"Zmluvu som uzavrel so svojím vyvoleným, <font color='#B71C1C'>*</font><br>" +
                            "svojmu služobníkovi Dávidovi som prisahal:<br>" +
                            "Naveky zaistím tvoj rod <font color='#B71C1C'>*</font><br>" +
                            "a postavím tvoj trón, čo pretrvá všetky pokolenia. <font color='#B71C1C'>– R.</font><br>" +
                            "Našiel som svojho služobníka Dávida, <font color='#B71C1C'>*</font><br>" +
                            "pomazal som ho svojím svätým olejom.<br>" +
                            "Pevne ho bude držať moja ruka <font color='#B71C1C'>*</font><br>" +
                            "a posilňovať moje rameno. <font color='#B71C1C'>– R.</font><br>" +
                            "S ním bude moja vernosť a milosť <font color='#B71C1C'>*</font><br>" +
                            "a v mojom mene povznesie sa jeho moc.<br>" +
                            "On bude volať ku mne: ‚Ty si môj otec, <font color='#B71C1C'>*</font><br>" +
                            "môj Boh a útočište mojej spásy.'\" <font color='#B71C1C'>– R.</font>"},
            {"17gk", "", "", "Ž 16, 1-2a+5. 7-8. 11",
                    "<font color='#B71C1C'>R.:</font> Ty, Pane, si moje jedine dobro.<br><br>" +
                            "Ochráň ma, Bože, k tebe sa utiekam. <font color='#B71C1C'>*</font><br>" +
                            "Hovorím Pánovi: \"Ty si môj Pán.\" <font color='#B71C1C'>– R.</font><br>" +
                            "Ty, Pane, si môj podiel na dedičstve a na kalichu, <font color='#B71C1C'>*</font><br>" +
                            "v tvojich rukách je môj osud. <font color='#B71C1C'>– R.</font><br>" +
                            "Velebím Pána, čo ma múdrosťou obdaril; <font color='#B71C1C'>*</font><br>" +
                            "v noci ma k tomu moje srdce vyzýva.<br>" +
                            "Pána mam vždy pred očami; <font color='#B71C1C'>*</font><br>" +
                            "a pretože je po mojej pravici, nezakolíšem sa. <font color='#B71C1C'>– R.</font><br>" +
                            "Ukážeš mi cestu života.<br>" +
                            "U teba je plnosť radosti, <font color='#B71C1C'>*</font><br>" +
                            "po tvojej pravici večná slasť. <font color='#B71C1C'>– R.</font>"},
            {"18", "", "", "Ž 98, 1. 2-3b. 3c-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Pred očami pohanov vyjavil Pán svoju spásu.<br><br>" +
                            "Spievajte Pánovi pieseň novú, <font color='#B71C1C'>*</font><br>" +
                            "lebo vykonal veci zázračné.<br>" +
                            "Víťazstvo je dielom jeho pravice <font color='#B71C1C'>*</font><br>" +
                            "a jeho svätého ramena. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán oznámil svoju spásu, <font color='#B71C1C'>*</font><br>" +
                            "pred očami pohanov vyjavil svoju spravodlivosť.<br>" +
                            "Rozpamätal sa na svoju dobrotu <font color='#B71C1C'>*</font><br>" +
                            "a na svoju vernosť voči Izraelovmu domu. <font color='#B71C1C'>– R.</font><br>" +
                            "Uzreli všetky končiny zeme <font color='#B71C1C'>*</font><br>" +
                            "spásu nášho Boha.<br>" +
                            "Na chválu Božiu jasaj, celá zem; <font color='#B71C1C'>*</font><br>" +
                            "plesajte, radujte sa a hrajte. <font color='#B71C1C'>– R.</font><br>" +
                            "Hrajte Pánovi na citare, <font color='#B71C1C'>*</font><br>" +
                            "na citare a na harfe zunivej.<br>" +
                            "Za hlaholu trúb a poľníc <font color='#B71C1C'>*</font><br>" +
                            "jasajte pred tvárou Kráľa a Pána. <font color='#B71C1C'>– R.</font>"},
           /* {"21", "", "", "Lk 1, 46-47. 48-49. 50-51. 52-53. 54-55",
                    "<font color='#B71C1C'>R.:</font> Blahoslavená si, Panna Mária, lebo si nosila Syna večného Otca.<br><br>" +
                            "Velebí moja duša Pána <font color='#B71C1C'>*</font><br>" +
                            "a môj duch jasá v Bohu, mojom Spasiteľovi, <font color='#B71C1C'>– R.</font><br>" +
                            "lebo zhliadol na poníženosť svojej služobnice. <font color='#B71C1C'>*</font><br>" +
                            "Hľa, od tejto chvíle<br>" +
                            "blahoslaviť ma budú všetky pokolenia,<br>" +
                            "lebo veľké veci mi urobil ten, ktorý je mocný, <font color='#B71C1C'>*</font><br>" +
                            "a sväté je jeho meno <font color='#B71C1C'>– R.</font><br>" +
                            "a jeho milosrdenstvo z pokolenia na pokolenie <font color='#B71C1C'>*</font><br>" +
                            "s tými, čo sa ho boja.<br>" +
                            "Ukázal silu svojho ramena, <font color='#B71C1C'>*</font><br>" +
                            "rozptýlil tých, čo v srdci pyšne zmýšľajú. <font color='#B71C1C'>– R.</font><br>" +
                            "Mocnárov zosadil z trónov <font color='#B71C1C'>*</font><br>" +
                            "a povýšil ponížených.<br>" +
                            "Hladných nakŕmil dobrotami <font color='#B71C1C'>*</font><br>" +
                            "a bohatých prepustil naprázdno. <font color='#B71C1C'>– R.</font><br>" +
                            "Ujal sa Izraela, svojho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "lebo pamätá na svoje milosrdenstvo,<br>" +
                            "ako sľúbil našim otcom, <font color='#B71C1C'>*</font><br>" +
                            "Abrahámovi a jeho potomstvu naveky. <font color='#B71C1C'>– R.</font>"},*/
            {"30g", "", "", "Ž 19, 2-3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Po celej zemi rozlieha sa ich hlas.<br><br>" +
                            "Nebesia rozprávajú o sláve Boha <font color='#B71C1C'>*</font><br>" +
                            "a obloha hlása dielo jeho rúk.<br>" +
                            "Deň dňu o tom podáva správu <font color='#B71C1C'>*</font><br>" +
                            "a noc noci to dáva na známosť. <font color='#B71C1C'>– R.</font><br>" +
                            "Nie sú to slová, nie je to reč, <font color='#B71C1C'>*</font><br>" +
                            "ktorá by sa nedala počuť.<br>" +
                            "Po celej zemi rozlieha sa ich hlas <font color='#B71C1C'>*</font><br>" +
                            "a ich slová až po končiny sveta. <font color='#B71C1C'>– R.</font>"},
    };

    String[][] zalm12 = {
            {"03g", "", "", "Ž 117, 1. 2",
                    "<font color='#B71C1C'>R.:</font> Choďte do celého sveta a hlásajte evanjelium.<br>" +
                    "<font color='#B71C1C'>Alebo:</font> Aleluja. <br><br>" +
                    "Chváľte Pána, všetky národy, <font color='#B71C1C'>*</font><br>" +
                    "oslavujte ho, všetci ľudia; <font color=‘#B71C1C’>– R.</font><br>" +
                    "lebo je veľké jeho milosrdenstvo voči nám <font color='#B71C1C'>*</font><br>" +
                    "a pravda Pánova trvá naveky. <font color=‘#B71C1C’>– R.</font>"},
            {"17", "", "", "Ž 72, 1-2. 3-4b. 7-8. 17",
                    "<font color='#B71C1C'>R.:</font> V jeho dňoch bude prekvitať spravodlivosť a plnosť pokoja naveky.<br><br>" +
                            "Bože, zver svoju právomoc kráľovi, <font color='#B71C1C'>*</font><br>" +
                            "kráľovmu synovi svoju spravodlivosť,<br>" +
                            "aby spravodlivo vládol nad tvojím ľudom <font color='#B71C1C'>*</font><br>" +
                            "a podľa práva nad tvojimi chudobnými. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Vrchy nech ľudu prinesú pokoj <font color='#B71C1C'>*</font><br>" +
                            "a pahorky spravodlivosť.<br>" +
                            "Prisúdi právo ľuďom úbohým, <font color='#B71C1C'>*</font><br>" +
                            "poskytne pomoc deťom bedára. <font color=‘#B71C1C’>– R.</font><br>" +
                            "V jeho dňoch bude prekvitať spravodlivosť<br>" +
                            "a plnosť pokoja, <font color='#B71C1C'>*</font><br>" +
                            "kým mesiac nezhasne.<br>" +
                            "A bude panovať od mora až k moru <font color='#B71C1C'>*</font><br>" +
                            "a od Rieky až na kraj zeme. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Jeho meno nech je velebené naveky; <font color='#B71C1C'>*</font><br>" +
                            "kým bude svietiť slnko, jeho meno potrvá.<br>" +
                            "V ňom budú požehnané všetky kmene zeme, <font color='#B71C1C'>*</font><br>" +
                            "zvelebovať ho budú všetky národy. <font color=‘#B71C1C’>– R.</font>"},
            {"18", "", "", "Ž 72, 1-2. 12-13. 18-19",
                    "<font color='#B71C1C'>R.:</font> V jeho dňoch bude prekvitať spravodlivosť a plnosť pokoja naveky.<br><br>" +
                            "Bože, zver svoju právomoc kráľovi, <font color='#B71C1C'>*</font><br>" +
                            "kráľovmu synovi svoju spravodlivosť,<br>" +
                            "aby spravodlivo vládol nad tvojím ľudom <font color='#B71C1C'>*</font><br>" +
                            "a podľa práva nad tvojimi chudobnými. <font color=‘#B71C1C’>– R.</font><br>" +
                            "On vyslobodí bedára, čo volá k nemu, <font color='#B71C1C'>*</font><br>" +
                            "i chudobného, ktorému nik nepomáha.<br>" +
                            "Zmiluje sa nad chudobným a bedárom, <font color='#B71C1C'>*</font><br>" +
                            "zachráni život úbožiakom. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Nech je zvelebený Pán, Boh Izraela, <font color='#B71C1C'>*</font><br>" +
                            "čo jediný koná zázraky.<br>" +
                            "Jeho vznešené meno nech je velebené naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho velebou nech sa naplní celá zem. <font color=‘#B71C1C’>– R.</font>"},
            {"19", "", "", "Ž 71, 3-4a. 5-6b. 16-17",
                    "<font color='#B71C1C'>R.:</font> Nech sa mi ústa naplnia chválou a budem spievať o tvojej sláve.<br><br>" +
                            "Buď mi ochrannou skalou a opevneným hradom <font color='#B71C1C'>*</font><br>" +
                            "na moju záchranu;<br>" +
                            "veď ty si moja opora a moje útočište. <font color='#B71C1C'>*</font><br>" +
                            "Bože môj, vytrhni ma z ruky hriešnika. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Lebo ja, Pane, túžim za tebou, <font color='#B71C1C'>*</font><br>" +
                            "ty, Pane, si moja nádej od mojej mladosti.<br>" +
                            "Od matkinho lona mám v tebe oporu, <font color='#B71C1C'>*</font><br>" +
                            "od života matky si mojím ochrancom. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Budem hovoriť o veľkých činoch Pánových; <font color='#B71C1C'>*</font><br>" +
                            "Pane, budem spomínať len tvoju spravodlivosť.<br>" +
                            "Bože, ty si ma poúčal od mojej mladosti <font color='#B71C1C'>*</font><br>" +
                            "a ja až doteraz ohlasujem tvoje diela zázračné. <font color=‘#B71C1C’>– R.</font>"},
            {"20", "", "", "Ž 24, 1-2. 3-4b. 5-6",
                    "<font color='#B71C1C'>R.:</font> Hľa, prichádza Pán, on je Kráľ slávy.<br><br>" +
                            "Pánova je zem i všetko, čo ju napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "okruh zeme aj tí, čo bývajú na ňom.<br>" +
                            "Veď on sám položil jeho základy na moriach <font color='#B71C1C'>*</font><br>" +
                            "a upevnil ho na vodách. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Kto smie vystúpiť na vrch Pánov, <font color='#B71C1C'>*</font><br>" +
                            "kto smie stáť na jeho mieste posvätnom?<br>" +
                            "Ten, čo má ruky nevinné a srdce čisté, <font color='#B71C1C'>*</font><br>" +
                            "čo nedvíha svoju dušu k márnosti. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Taký dostane požehnanie od Pána <font color='#B71C1C'>*</font><br>" +
                            "a odmenu od Boha, svojho spasiteľa.<br>" +
                            "To je pokolenie tých, čo ho hľadajú, <font color='#B71C1C'>*</font><br>" +
                            "čo hľadajú tvár Boha Jakubovho. <font color=‘#B71C1C’>– R.</font>"},
            {"21", "", "", "Ž 33, 2-3. 11-12. 20-21",
                    "<font color='#B71C1C'>R.:</font> Plesajte, spravodliví, v Pánovi, spievajte mu novú pieseň. <br><br>" +
                            "Oslavujte Pána citarou, <font color='#B71C1C'>*</font><br>" +
                            "hrajte mu na desaťstrunovej lutne.<br>" +
                            "Spievajte mu novú pieseň, <font color='#B71C1C'>*</font><br>" +
                            "nadšene mu hrajte a volajte na slávu. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Pánov úmysel trvá naveky, <font color='#B71C1C'>*</font><br>" +
                            "myšlienky jeho srdca z pokolenia na pokolenie.<br>" +
                            "Blažený národ, ktorého Bohom je Pán, <font color='#B71C1C'>*</font><br>" +
                            "blažený ľud, ktorý si on vyvolil za dedičstvo. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Naša duša očakáva Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je naša pomoc a ochrana.<br>" +
                            "V ňom sa naše srdce raduje <font color='#B71C1C'>*</font><br>" +
                            "a v jeho sväté meno máme dôveru. <font color=‘#B71C1C’>– R.</font>"},
            {"22", "", "", "1 Sam 2, 1b-e. 4-5. 6-7. 8a-d",
                    "<font color='#B71C1C'>R.:</font> Srdce mi plesá v mojom Bohu.<br><br>" +
                            "Srdce mi plesá v Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "v mojom Bohu rastie moja sila.<br>" +
                            "Otvorím si ústa proti mojim nepriateľom, <font color='#B71C1C'>*</font><br>" +
                            "lebo sa radujem z tvojej pomoci. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Luk silákov sa zlomil, <font color='#B71C1C'>*</font><br>" +
                            "slabí sa opásali silou.<br>" +
                            "Tí, čo boli sýti, dávajú sa prenajímať za chlieb, <font color='#B71C1C'>*</font><br>" +
                            "no tí, čo hladovali, už nepoznajú núdzu.<br>" +
                            "Neplodná rodí mnoho ráz <font color='#B71C1C'>*</font><br>" +
                            "a tá, čo má veľa detí, vädne. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Pán dáva smrť i život, <font color='#B71C1C'>*</font><br>" +
                            "uvádza do ríše smrti a vyvádza naspäť.<br>" +
                            "Pán dáva schudobnieť, ale aj zbohatnúť, <font color='#B71C1C'>*</font><br>" +
                            "ponižuje aj vyvyšuje. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Dvíha z prachu bedára <font color='#B71C1C'>*</font><br>" +
                            "a zo smetiska povyšuje chudobného.<br>" +
                            "Usádza ho medzi kniežatá <font color='#B71C1C'>*</font><br>" +
                            "a dáva mu trón slávy. <font color=‘#B71C1C’>– R.</font>"},
            {"23", "", "", "Ž 25, 4-5b. 8-9. 10+14",
                    "<font color='#B71C1C'>R.:</font> Zodvihnite hlavu, lebo sa blíži vaše vykúpenie.<br><br>" +
                            "Ukáž mi, Pane, svoje cesty <font color='#B71C1C'>*</font><br>" +
                            "a pouč ma o svojich chodníkoch.<br>" +
                            "Veď ma vo svojej pravde a uč ma, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si Boh, moja spása. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Pán je dobrý a spravodlivý: <font color='#B71C1C'>*</font><br>" +
                            "ukazuje cestu hriešnikom.<br>" +
                            "Pokorných vedie k správnemu konaniu <font color='#B71C1C'>*</font><br>" +
                            "a tichých poúča o svojich cestách. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Všetky cesty Pánove sú milosrdenstvo a vernosť <font color='#B71C1C'>*</font><br>" +
                            "pre tých, čo zachovávajú jeho zmluvu a jeho príkazy.<br>" +
                            "Pán bude dôverným priateľom tým, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "a zjaví im svoju zmluvu. <font color=‘#B71C1C’>– R.</font>"},
            {"24", "", "", "Ž 89, 2-3. 4-5. 27+29",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, ospevovať budem naveky.<br><br>" +
                            "Pánovo milosrdenstvo chcem ospevovať naveky; <font color='#B71C1C'>*</font><br>" +
                            "po všetky pokolenia hlásať svojimi ústami tvoju vernosť.<br>" +
                            "Veď ty si povedal:<br>" +
                            "\"Moje milosrdenstvo je ustanovené naveky.\" <font color='#B71C1C'>*</font><br>" +
                            "Tvoja vernosť je upevnená v nebesiach. <font color=‘#B71C1C’>– R.</font><br>" +
                            "\"Zmluvu som uzavrel so svojím vyvoleným, <font color='#B71C1C'>*</font><br>" +
                            "svojmu služobníkovi Dávidovi som prisahal:<br>" +
                            "Naveky zaistím tvoj rod <font color='#B71C1C'>*</font><br>" +
                            "a postavím tvoj trón, čo pretrvá všetky pokolenia.\" <font color=‘#B71C1C’>– R.</font><br>" +
                            "On bude volať ku mne: \"Ty si môj otec, <font color='#B71C1C'>*</font><br>" +
                            "môj Boh a útočište mojej spásy.\"<br>" +
                            "Naveky mu svoju milosť zachovám <font color='#B71C1C'>*</font><br>" +
                            "a pevná bude moja zmluva s ním. <font color=‘#B71C1C’>– R.</font>"},
            {"24gkn", "", "", "Ž 89, 4-5. 16-17. 27+29",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, ospevovať budem naveky.<br><br>" +
                    "\"Zmluvu som uzavrel so svojím vyvoleným, <font color='#B71C1C'>*</font><br>" +
                    "svojmu služobníkovi Dávidovi som prisahal:<br>" +
                    "Naveky zaistím tvoj rod <font color='#B71C1C'>*</font><br>" +
                    "a postavím tvoj trón, čo pretrvá všetky pokolenia.\" <font color=‘#B71C1C’>– R.</font><br>" +
                    "Blažený ľud, ktorý vie jasať! <font color='#B71C1C'>*</font><br>" +
                    "Kráča vo svetle tvojej tváre, Pane;<br>" +
                    "deň čo deň sa raduje z tvojho mena <font color='#B71C1C'>*</font><br>" +
                    "a honosí sa tvojou spravodlivosťou. <font color=‘#B71C1C’>– R.</font><br>" +
                    "\"On bude volať ku mne: ‚Ty si môj otec, <font color='#B71C1C'>*</font><br>" +
                    "môj Boh a útočište mojej spásy.'<br>" +
                    "Naveky mu svoju milosť zachovám <font color='#B71C1C'>*</font><br>" +
                    "a pevná bude moja zmluva s ním.\" <font color=‘#B71C1C’>– R.</font>"},
            {"25agkn", "", "", "Ž 96, 1-2a. 2b-3. 11-12a. 12b-13",
                    "<font color='#B71C1C'>R.:</font> Dnes sa nám narodil Spasiteľ, Kristus Pán.<br><br>" +
                    "Spievajte Pánovi pieseň novú; †<br>" +
                    "spievaj Pánovi, celá zem! <font color='#B71C1C'>*</font><br>" +
                    "Spievajte Pánovi, velebte jeho meno. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Zvestujte jeho spásu deň čo deň. †<br>" +
                    "Zvestujte jeho slávu pohanom <font color='#B71C1C'>*</font><br>" +
                    "a jeho zázraky všetkým národom. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Tešte sa, nebesia, plesaj, zem; †<br>" +
                    "nech more zahučí a čo ho napĺňa, <font color='#B71C1C'>*</font><br>" +
                    "nech plesá pole a všetko, čo je na ňom. <font color=‘#B71C1C’>– R.</font><br>" +
                    "I zajasajú všetky stromy lesa †<br>" +
                    "pred tvárou Pána, že prichádza, <font color='#B71C1C'>*</font><br>" +
                    "že prichádza súdiť zem.<br>" +
                    "Spravodlivo bude súdiť zemekruh <font color='#B71C1C'>*</font><br>" +
                    "a národy podľa svojej pravdy. <font color=‘#B71C1C’>– R.</font>"},
            {"25bgkn", "", "", "Ž 97, 1+6. 11-12",
                    "<font color='#B71C1C'>R.:</font> Dnes zažiari nad nami svetlo, lebo sa nám narodil Pán.<br><br>" +
                    "Pán kraľuje, jasaj, zem; <font color='#B71C1C'>*</font><br>" +
                    "radujte sa, všetky ostrovy.<br>" +
                    "Jeho spravodlivosť ohlasujú nebesia <font color='#B71C1C'>*</font><br>" +
                    "a jeho slávu vidia všetky národy. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Vychádza svetlo spravodlivému <font color='#B71C1C'>*</font><br>" +
                    "a radosť tým, čo majú srdcia úprimné.<br>" +
                    "Radujte sa, spravodliví, v Pánovi <font color='#B71C1C'>*</font><br>" +
                    "a oslavujte jeho sväté meno. <font color=‘#B71C1C’>– R.</font>"},
            {"25cgkn", "", "", "Ž 98, 1. 2-3b. 3c-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Uzreli všetky končiny zeme spásu nášho Boha.<br><br>" +
                    "Spievajte Pánovi pieseň novú, <font color='#B71C1C'>*</font><br>" +
                    "lebo vykonal veci zázračné.<br>" +
                    "Víťazstvo je dielom jeho pravice <font color='#B71C1C'>*</font><br>" +
                    "a jeho svätého ramena. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Pán oznámil svoju spásu, <font color='#B71C1C'>*</font><br>" +
                    "pred očami pohanov vyjavil svoju spravodlivosť.<br>" +
                    "Rozpamätal sa na svoju dobrotu <font color='#B71C1C'>*</font><br>" +
                    "a na svoju vernosť voči Izraelovmu domu. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Uzreli všetky končiny zeme <font color='#B71C1C'>*</font><br>" +
                    "spásu nášho Boha.<br>" +
                    "Na chválu Božiu jasaj, celá zem; <font color='#B71C1C'>*</font><br>" +
                    "plesajte, radujte sa a hrajte. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Hrajte Pánovi na citare, <font color='#B71C1C'>*</font><br>" +
                    "na citare a na harfe zunivej.<br>" +
                    "Za hlaholu trúb a poľníc <font color='#B71C1C'>*</font><br>" +
                    "jasajte pred tvárou Kráľa a Pána. <font color=‘#B71C1C’>– R.</font>"},
            {"26g", "", "", "Ž 31, 3c-4. 6+8ab. 16b-17",
                    "<font color='#B71C1C'>R.:</font> Do tvojich rúk, Pane, porúčam svojho ducha.<br><br>" +
                            "Buď mi skalou útočišťa, <font color='#B71C1C'>*</font><br>" +
                            "opevneným hradom mojej spásy.<br>" +
                            "Veď ty si moja sila a moje útočište, <font color='#B71C1C'>*</font><br>" +
                            "pre svoje meno budeš ma viesť a opatrovať. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Do tvojich rúk porúčam svojho ducha; <font color='#B71C1C'>*</font><br>" +
                            "ty si ma vykúpil, Pane, Bože verný.<br>" +
                            "Plesám a teším sa, že si milosrdný, <font color='#B71C1C'>*</font><br>" +
                            "lebo si zhliadol na moju poníženosť. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Vytrhni ma z rúk mojich nepriateľov <font color='#B71C1C'>*</font><br>" +
                            "a prenasledovateľov.<br>" +
                            "Rozjasni svoju tvár nad svojím sluhom <font color='#B71C1C'>*</font><br>" +
                            "a zachráň ma vo svojom milosrdenstve. <font color=‘#B71C1C’>– R.</font>"},
            {"27g", "", "", "Ž 97, 1-2. 5-6. 11-12",
                    "<font color='#B71C1C'>R.:</font> Radujte sa, spravodliví, tešte sa v Pánovi.<br><br>" +
                            "Pán kraľuje, jasaj, zem; <font color='#B71C1C'>*</font><br>" +
                            "radujte sa, všetky ostrovy.<br>" +
                            "Vôkol neho oblaky a mrákavy, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a právo sú základom jeho trónu. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Ako vosk sa topia vrchy pred tvárou Pánovou, <font color='#B71C1C'>*</font><br>" +
                            "pred Pánom celej zeme.<br>" +
                            "Jeho spravodlivosť ohlasujú nebesia <font color='#B71C1C'>*</font><br>" +
                            "a jeho slávu vidia všetky národy. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Vychádza svetlo spravodlivému <font color='#B71C1C'>*</font><br>" +
                            "a radosť tým, čo majú srdcia úprimné.<br>" +
                            "Radujte sa, spravodliví, v Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a oslavujte jeho sväté meno. <font color=‘#B71C1C’>– R.</font>"},
            {"28g", "", "", "Ž 124, 2-3. 4-5. 7c-8",
                    "<font color='#B71C1C'>R.:</font> Naša duša unikla ako vtáča zo siete poľovníkov.<br><br>" +
                            "Keby sa nás Pán nebol ujal, <font color='#B71C1C'>*</font><br>" +
                            "keď ľudia povstali proti nám,<br>" +
                            "vari by nás živých boli prehltli, <font color='#B71C1C'>*</font><br>" +
                            "keď proti nám blčala ich zúrivosť. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Vari by nás bola voda zaliala <font color='#B71C1C'>*</font><br>" +
                            "a riava sa prevalila cez nás.<br>" +
                            "Vari by sa boli prevalili cez nás <font color='#B71C1C'>*</font><br>" +
                            "rozbúrené vody. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Slučka sa roztrhla <font color='#B71C1C'>*</font><br>" +
                            "a my sme na slobode.<br>" +
                            "Naša pomoc v mene Pánovom, <font color='#B71C1C'>*</font><br>" +
                            "ktorý stvoril nebo i zem. <font color=‘#B71C1C’>– R.</font>"},
            {"29", "", "", "Ž 96, 1-2a. 2b-3. 5b-6",
                    "<font color='#B71C1C'>R.:</font> Tešte sa, nebesia, a plesaj, zem.<br><br>" +
                    "Spievajte Pánovi pieseň novú; †<br>" +
                    "spievaj Pánovi, celá zem! <font color='#B71C1C'>*</font><br>" +
                    "Spievajte Pánovi, velebte jeho meno. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Zvestujte jeho spásu deň čo deň. †<br>" +
                    "Zvestujte jeho slávu pohanom <font color='#B71C1C'>*</font><br>" +
                    "a jeho zázraky všetkým národom. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Pán stvoril nebesia. †<br>" +
                    "Vznešenosť a krása pred jeho tvárou, <font color='#B71C1C'>*</font><br>" +
                    "moc a veleba v jeho svätyni. <font color=‘#B71C1C’>– R.</font>"},
            {"30", "", "", "Ž 96, 7-8a. 8b-9. 10",
                    "<font color='#B71C1C'>R.:</font> Tešte sa, nebesia, a plesaj, zem.<br><br>" +
                    "Vzdávajte Pánovi, rodiny národov, †<br>" +
                    "vzdávajte Pánovi slávu a česť, <font color='#B71C1C'>*</font><br>" +
                    "vzdávajte Pánovi slávu hodnu jeho mena. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Prineste obetné dary a vstúpte do jeho nádvorí, †<br>" +
                    "klaňajte sa Pánovi v posvätnom rúchu. <font color='#B71C1C'>*</font><br>" +
                    "Chvej sa pred ním, celá zem, <font color=‘#B71C1C’>– R.</font><br>" +
                    "hlásajte medzi pohanmi: \"Pán kraľuje!\" †<br>" +
                    "Upevnil zemekruh, nepohne sa; <font color='#B71C1C'>*</font><br>" +
                    "a spravodlivo súdi národy. <font color=‘#B71C1C’>– R.</font>"},
            {"31", "", "", "Ž 96, 1-2. 11-12. 13",
                    "<font color='#B71C1C'>R.:</font> Tešte sa, nebesia, a plesaj, zem.<br><br>" +
                    "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>*</font><br>" +
                    "spievaj Pánovi, celá zem!<br>" +
                    "Spievajte Pánovi, velebte jeho meno. <font color='#B71C1C'>*</font><br>" +
                    "Zvestujte jeho spásu deň čo deň. <font color=‘#B71C1C’>– R.</font><br>" +
                    "Tešte sa, nebesia, plesaj, zem; <font color='#B71C1C'>*</font><br>" +
                    "nech more zahučí a čo ho napĺňa,<br>" +
                    "nech plesá pole a všetko, čo je na ňom. <font color='#B71C1C'>*</font><br>" +
                    "I zajasajú všetky stromy lesa <font color=‘#B71C1C’>– R.</font><br>" +
                    "pred tvárou Pána, že prichádza, <font color='#B71C1C'>*</font><br>" +
                    "že prichádza súdiť zem.<br>" +
                    "Spravodlivo bude súdiť zemekruh <font color='#B71C1C'>*</font><br>" +
                    "a národy podľa svojej pravdy. <font color=‘#B71C1C’>– R.</font>"},
            {"31gk", "", "", "Ž 67, 2-3. 5. 6+8",
                    "<font color='#B71C1C'>R.:</font> Bože, buď nám milostivý a žehnaj nás.<br><br>" +
                            "Bože, buď nám milostivý a žehnaj nás; <font color='#B71C1C'>*</font><br>" +
                            "a tvoja tvár nech žiari nad nami,<br>" +
                            "aby sa tvoja cesta stala známou na zemi <font color='#B71C1C'>*</font><br>" +
                            "a tvoja spása medzi všetkými národmi. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Nech sa tešia a jasajú národy, †<br>" +
                            "že spravodlivo súdiš ľudí <font color='#B71C1C'>*</font><br>" +
                            "a spravuješ národy na zemi. <font color=‘#B71C1C’>– R.</font><br>" +
                            "Bože, nech ťa velebia národy, <font color='#B71C1C'>*</font><br>" +
                            "nech ťa velebia všetky národy.<br>" +
                            "Nech nás Boh požehná <font color='#B71C1C'>*</font><br>" +
                            "a nech si ho ctia všetky končiny zeme. <font color=‘#B71C1C’>– R.</font>"},
    };

    String[][] alelujaPohyb = {
            {"0gkp", "", "", "Ž 84, 5", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "Blažení tí, čo bývajú v tvojom dome, Pane, a bez prestania ťa velebia.<br>" +
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy."},
            {"1gkp", "", "", "Jn 1, 14ab", "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo.<br>" +
                    "<font color='#B71C1C'>Alebo vo Veľkonočnom období:</font> Aleluja.<br>" +
                    "Slovo sa telom stalo a prebývalo medzi nami; a my sme uvideli jeho slávu.", "<font color='#B71C1C'>R.</font> Sláva ti, Kriste, ty Božie Slovo.<br>" +
                    "<font color='#B71C1C'>Alebo vo Veľkonočnom období:</font> Aleluja."},
            {"1op", "", "", "Jn 15, 26b-27a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Duch pravdy vydá o mne svedectvo, hovorí Pán; aj vy vydávate svedectvo. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"2p", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ó šťastná Panna, ty si porodila Pána; ó preblahoslavená Matka Cirkvi, ty v nás rozohňuješ Ducha svojho Syna, Ježiša Krista! <font color='#B71C1C'>– R.</font> Aleluja."},
            //Nášho Pána Ježiša Krista, najvyššieho a večného kňaza
            {"3gp", "A", "", "Flp 2, 8-9", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kristus sa stal pre nás poslušným až na smrť, až na smrť na kríži. Preto ho Boh nad všetko povýšil a dal mu meno, ktoré je nad každé iné meno. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"", "B", "", "Hebr 5, 8-9", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Hoci bol Synom, z toho, čo vytrpel, naučil sa poslušnosti; a keď dosiahol dokonalosť, stal sa pôvodcom večnej spásy pre všetkých, ktorí ho poslúchajú. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"", "C", "", "Ez 36, 25a. 26a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vylejem na vás čistú vodu, dám vám nové srdce a vložím do vás nového ducha. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"6gkp", "", "", "Mt 28, 19a. 20b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Choďte a učte všetky národy, hovorí Pán; ja som s vami po všetky dni až do skončenia sveta. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"7gkp", "", "", "Porov. Zjv 1, 8", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Sláva Otcu i Synu i Duchu Svätému, Bohu, ktorý je, ktorý bol a ktorý príde. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"4gkp", "", "", "Mt 11, 29ab", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som živý chlieb, ktorý zostúpil z neba, hovorí Pán; kto bude jesť z tohoto chleba, bude žiť naveky. <font color='#B71C1C'>– R.</font> Aleluja."},
            //Najsvätejšieho Srdca Ježišovho
            {"5gkp", "A", "", "Mt 11, 29ab", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vezmite na seba moje jarmo, hovorí Pán; a učte sa odo mňa, lebo som tichý a pokorný srdcom. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"", "B", "", "Mt 11, 29ab", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vezmite na seba moje jarmo, hovorí Pán; a učte sa odo mňa, lebo som tichý a pokorný srdcom. <font color='#B71C1C'>– R.</font><br>" +
                    "<font color='#B71C1C'>Alebo: Jn 10, 14</font><br>" +
                    "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Boh nás miloval a poslal svojho Syna ako zmiernu obetu za naše hriechy. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"", "C", "", "Mt 11, 29ab", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vezmite na seba moje jarmo, hovorí Pán; a učte sa odo mňa, lebo som tichý a pokorný srdcom. <font color='#B71C1C'>– R.</font> Aleluja.",
                    "<font color='#B71C1C'>Alebo: Jn 10, 14</font><br>" +
                            "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som dobrý pastier, hovorí Pán; Poznám svoje ovce a moje poznajú mňa. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"2gkp", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Príď, Duchu Svätý, naplň srdcia svojich veriacich a zapáľ v nás oheň svojej lásky. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"3gkp", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Príď, Duchu Svätý, naplň srdcia svojich veriacich a zapáľ v nás oheň svojej lásky. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"4p", "", "", "Porov. Lk 2, 19", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavená Panna Mária zachovávala Božie slovo vo svojom srdci a premýšľala o ňom. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"8gkp", "", "", "Mk 11, 9b. 10a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Požehnaný, ktorý prichádza v mene Pánovom! Požehnané kráľovstvo nášho otca Dávida, ktoré prichádza! <font color='#B71C1C'>– R.</font> Aleluja."},
            //8. decembra - Nepoškvrnené počatie Panny Márie
            {"9gkp", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zdravas', Mária, milosti plná, Pán s tebou; požehnaná si medzi ženami. <font color='#B71C1C'>– R.</font> Aleluja."},
            //Svätej rodiny
            {"10gkp", "A", "", "Kol 3, 15a. 16a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vo vašich srdciach nech vládne Kristov pokoj, Kristovo slovo nech vo vás bohato prebýva. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"", "B", "", "Hebr 1, 1-2", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Mnoho ráz hovoril kedysi Boh otcom skrze prorokov. V týchto posledných dňoch prehovoril k nám v Synovi. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"", "C", "", "Porov. Sk 16, 14b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pane, otvor naše srdce, aby sme porozumeli slovám tvojho Syna. <font color='#B71C1C'>– R.</font> Aleluja."},
            //Krst Krista Pána
            {"11gkp", "A", "", "Porov. Mk 9, 7", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Otvorilo sa nebo a zaznel Otcov hlas: Toto je môj milovaný Syn, počúvajte ho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"", "B", "", "Porov. Jn 1, 29", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Keď Ján videl, ako k nemu prichádza Ježiš, zvolal: Hľa, Boží Baránok, ktorý sníma hriech sveta. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"", "C", "", "Porov. Lk 3,16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Prichádza mocnejší, ako som ja, hovorí Ján; on vás bude krstiť Duchom Svätým a ohňom. <font color='#B71C1C'>– R.</font> Aleluja."},
    };

    String[][] aleluja1 = {
            // 2. nedeľa po NP
            {"", "", "", "Porov. 1 Tim 3, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Sláva ti Kriste, teba zvestovali národom; sláva ti Kriste, v teba uverili na svete. <font color='#B71C1C'>– R.</font> Aleluja."},

            {"01gk", "", "", "Hebr 1, 1-2", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Mnoho ráz hovoril kedysi Boh otcom skrze prorokov. V týchto posledných dňoch prehovoril k nám v Synovi. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"2", "", "", "Hebr 1, 1-2", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Mnoho ráz hovoril kedysi Boh otcom skrze prorokov. V týchto posledných dňoch prehovoril k nám v Synovi. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"3", "", "", "Jn 1, 14a. 12a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Slovo sa telom stalo a prebývalo medzi nami. Tým, ktorí ho prijali, dalo moc stať sa Božími deťmi. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"03a", "", "", "Mt 1, 21", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Dáš mu meno Ježiš; lebo on vyslobodí svoj ľud z hriechov. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"4", "", "", "Hebr 1, 1-2", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Mnoho ráz hovoril kedysi Boh otcom skrze prorokov. V týchto posledných dňoch prehovoril k nám v Synovi. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"5", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Posvätný deň nám zažiaril: poďte, národy, a klaňajte sa Pánovi. Dnes zostúpilo na zem veľké svetlo. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"06gk", "", "", "Mt 2, 2", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Videli sme jeho hviezdu na východe a prišli sme sa pokloniť Pánovi. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"7", "", "", "Mt 4, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježiš hlásal evanjelium o kráľovstve a uzdravoval každú chorobu medzi ľudom. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"8", "", "", "Porov. Lk 4, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pán ma poslal hlásať evanjelium chudobným, oznámiť zajatým, že budú prepustení. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"9", "", "", "Porov. 1 Tit. 3, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Sláva ti, Kriste, teba zvestovali národom; sláva ti, Kriste, v teba uverili na svete. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"10", "", "", "Porov. Lk 4, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pán ma poslal hlásať evanjelium chudobným, oznámiť zajatým, že budú prepustení. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"11", "", "", "Mt 4, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježiš hlásal evanjelium o kráľovstve a uzdravoval každú chorobu medzi ľudom. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"12", "", "", "Mt 4, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ľud bývajúci v temnotách uvidel veľké svetlo. Svetlo zažiarilo tým, čo sedeli v temnom kraji smrti. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"20g+", "", "", "Jak 1, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavený muž, ktorý vydrží skúšku, lebo keď sa osvedčí, dostane veniec života. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"25g", "", "", "Jak 15, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som si vás vyvolil, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"26", "", "", "Porov. Lk 4, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pán ma poslal hlásať evanjelium chudobným, oznámiť zajatým, že budú prepustení. <font color='#B71C1C'>– R.</font> Aleluja."},
    };

    String[][] aleluja2 = {
            {"02g", "", "", "Porov. Lk 2, 32", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pán je svetlo národov, Pán je sláva svojho ľudu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"11m", "", "", "Porov. Lk 1, 45", "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                    "<font color='#B71C1C'>Alebo v období cez rok:</font> Aleluja.<br>" +
                    "Blahoslavená si, Panna Mária, lebo si uverila, že sa splní, čo ti povedal Pán.<br>"+
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "<font color='#B71C1C'>Alebo v období cez rok:</font> Aleluja."},
            {"14o", "", "", "Porov. Lk 17, 21", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "<font color='#B71C1C'>Alebo v období cez rok:</font> Aleluja.<br>" +
                    "Choďte a učte všetky národy, hovorí Pán; ja som s vami po všetky dni až do skončenia sveta.<br>"+
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "<font color='#B71C1C'>Alebo v období cez rok:</font> Aleluja."},
            {"14g", "", "", "Porov. Lk 17, 21", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "<font color='#B71C1C'>Alebo v období cez rok:</font> Aleluja.<br>" +
                    "Choďte a učte všetky národy, hovorí Pán; ja som s vami po všetky dni až do skončenia sveta.<br>"+
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "<font color='#B71C1C'>Alebo v období cez rok:</font> Aleluja."},
            {"22g", "", "", "Mt 16, 18", "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "<font color='#B71C1C'>Alebo v období cez rok:</font> Aleluja.<br>" +
                    "Ty si Peter a na tejto skale postavím svoju Cirkev a pekelné brány ju nepremôžu.<br>"+
                    "<font color='#B71C1C'>R.</font> Chvála ti, Kriste, Kráľ večnej slávy.<br>" +
                    "<font color='#B71C1C'>Alebo v období cez rok:</font> Aleluja."},
    };

    String[][] aleluja3 = {};

    String[][] aleluja4 = {
            {"25g", "", "", "1 Kor 1, 23a. 24b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> My ohlasujeme ukrižovaného Krista – Božiu moc a Božiu múdrosť. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29g", "", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>– R.</font> Aleluja."},
    };

    String[][] aleluja5 = {
            {"01", "", "", "Ž 68, 20", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nech je velebený Pán deň čo deň; nesie nás Boh, naša spása. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"03g", "", "", "Jn 14, 6b. 9c", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som cesta, pravda a život, hovorí Pán; Filip, kto vidí mňa, vidí Otca. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"14g", "", "", "Porov. Jn 15, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som si vás vyvolil zo sveta, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"16", "", "", "Mt 5, 10", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení prenasledovaní pre spravodlivosť, lebo ich je nebeské kráľovstvo. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"16g", "", "", "Mt 5, 10", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení prenasledovaní pre spravodlivosť, lebo ich je nebeské kráľovstvo. <font color='#B71C1C'>– R.</font> Aleluja."},
    };

    String[][] aleluja6 = {
            {"11", "", "", "Mt 2, 19a. 20b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Choďte a učte všetky národy, hovorí Pán; ja som s vami po všetky dni až do skončenia sveta. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"23gk", "", "", "Porov. Jn 1, 7; Lk 1, 17", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ján prišiel ako svedok vydať svedectvo o svetle a pripraviť Pánovi dokonalý ľud. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"24gk", "", "", "Lk 1, 76", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ty, chlapček, budeš sa volať prorokom Najvyššieho: pôjdeš pred tvárou Pána a pripravíš mu cestu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"28gk", "", "", "Jn 21, 17d", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pane, ty vieš všetko, ty vieš, že ťa mám rád. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29gk", "", "", "Mt 16, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ty si Peter a na tejto skale postavím svoju Cirkev a pekelné brány ju nepremôžu. <font color='#B71C1C'>– R.</font> Aleluja."},
    };
    String[][] aleluja7 = {
            {"02g", "", "", "Porov. Lk 1, 45", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavená si Panna Mária, lebo si uverila, že sa splní, čo ti povedal Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"03g", "", "", "Jn 20, 29", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tomáš, uveril si, pretože si ma videl. Blahoslavení tí, čo nevideli, a uverili. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"05gk", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> To sú naši otcovia a praví pastieri, ktorí nás sediacich v temnotách priviedli k svetlu života. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"11g", "", "", "Mt 5, 3", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"16", "", "", "Lk 11, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení sú tí, čo počúvajú Božie slovo a zachovávajú ho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"17gk", "", "", "Lk 21, 36", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Bdejte celý čas a modlite sa, aby ste sa mohli postaviť pred Syna človeka. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"17g", "", "", "Lk 21, 36", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Bdejte celý čas a modlite sa, aby ste sa mohli postaviť pred Syna človeka. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"22g", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Povedzže nám, ó, Mária, čos' videla na ceste? Hrob som zrela oslávený, kameň nebol na mieste. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"23g", "", "", "Jn 15, 9b. 5b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ostaňte v mojej láske, hovorí Pán; kto ostáva vo mne a ja v ňom, prináša veľa ovocia. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"25g", "", "", "Porov. 15, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som si vás vyvolil zo sveta, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29", "", "", "Jn 8, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som svetlo sveta, hovorí Pán; kto mňa nasleduje, bude mať svetlo života. <font color='#B71C1C'>– R.</font> Aleluja."},
    };
    String[][] aleluja8 = {
            {"06gn", "", "", "Mt 17, 5c", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Toto je môj milovaný Syn, v ktorom mám zaľúbenie; počúvajte ho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"09g", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Toto je múdra panna, lebo ju Pán našiel bedliť; keď prišiel ženích, vošla s ním na svadobnú hostinu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"10g", "", "", "Jn 8, 12bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto mňa nasleduje, nebude chodiť v tmách, ale bude mať svetlo života, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"14gk", "", "", "Lk 11, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení sú tí, čo počúvajú Božie slovo a zachovávajú ho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"15gk", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Mária bola vzatá do neba; plesajú zástupy anjelov. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"24g", "", "", "Jn 1, 49b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Rabbi, ty si Boží Syn, ty si kráľ Izraela! <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29", "", "", "Mt 5, 10", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení prenasledovaní pre spravodlivosť, lebo ich je nebeské kráľovstvo. <font color='#B71C1C'>– R.</font> Aleluja."},
    };
    String[][] aleluja9 = {
            {"08g", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Šťastná si naozaj, svätá Panna Mária, a všetkej chvály najhodnejšia, lebo z teba vyšlo slnko spravodlivosti, Kristus, náš Boh. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"14gn", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Klaniame sa ti, Kriste, a dobrorečíme ti, lebo si svojim krížom vykúpil svet. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"15gk", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavená Panna Mária, Matka bolestná; ty Matka milosti, ty nádej sveta, ty patrónka naša, vyslyš svoje deti, ktoré volajú k tebe. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"21g", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Teba, Bože, chválime, teba, Pane, velebíme. Teba, Pane, oslavuje slávny zbor apoštolov. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29g", "", "", "Ž 103, 21", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Dobrorečte Pánovi, všetky jeho zástupy, jeho služobníci, čo jeho vôľu plníte. <font color='#B71C1C'>– R.</font> Aleluja."},
    };

    String[][] aleluja10 = {
            {"02", "", "", "Ž 103, 21", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Dobrorečte Pánovi, všetky jeho zástupy, jeho služobníci, čo jeho vôľu plníte. <font color='#B71C1C'>– R.</font> Aleluja."},
            //{"07", "", "", "Lk 1, 28b. 42b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zdravas', Mária, milosti plná, Pán s tebou; požehnaná si medzi ženami. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"07", "", "", "Rim 8,15", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Dostali ste Ducha adoptívneho synovstva, v ktorom voláme: Abba, Otče. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"18g", "", "", "Jn 15, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som si vás vyvolil zo sveta, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"26gk+", "", "", "2 Krn 7, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vyvolil som si toto miesto a posvätil som ho, hovorí Pán; aby tam bolo moje meno naveky. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"28g", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Teba, Bože, chválime, teba, Pane, velebíme. Teba, Pane, oslavuje slávny zbor apoštolov. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"31gk", "", "", "Mt 11, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Poďte ku mne všetci, ktorí sa namáhate a ste preťažení, a ja vás posilním. <font color='#B71C1C'>– R.</font> Aleluja."},
    };

    String[][] aleluja11 = {
            {"01gk", "", "", "Mt 11, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Poďte ku mne všetci, ktorí sa namáhate a ste preťažení, a ja vás posilním. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"02an", "", "", "Jn 6, 40", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vôľa môjho Otca je, aby každý, kto verí v Syna, mal večný život; a ja ho vzkriesim v posledný deň, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"02bn", "", "", "Jn 6, 51", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som živý chlieb, ktorý zostúpil z neba, hovorí Pán; kto bude jesť z tohoto chleba, bude žiť naveky. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"09g", "", "", "2 Krn 7, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vyvolil som si toto miesto a posvätil som ho, hovorí Pán; aby tam bolo moje meno naveky. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"11g", "", "", "Jn 13, 34", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nové prikázanie vám dávam, hovorí Pán; aby ste sa milovali navzájom, ako som ja miloval vás. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"17gk", "", "", "Jn 3, 14-18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nové prikázanie vám dávam, hovorí Pán; aby ste sa milovali navzájom, ako som ja miloval vás. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"18", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Teba, Bože, chválime, teba, Pane, velebíme. Teba, Pane, oslavuje slávny zbor apoštolov. <font color='#B71C1C'>– R.</font> Aleluja."},
           // {"21", "", "", "Lk 11, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení sú tí, čo počúvajú Božie slovo a zachovávajú ho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30g", "", "", "Mt 4, 19", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Poďte za mnou, hovorí Pán; a urobím z vás rybárov ľudí. <font color='#B71C1C'>– R.</font> Aleluja."},
    };

    String[][] aleluja12 = {
            {"03g", "", "", "Mt 28, 19a. 20b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Choďte a učte všetky národy, hovorí Pán; ja som s vami po všetky dni až do skončenia sveta. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"17", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Múdrosť Najvyššieho, ty mocne i jemne riadiš všetko; príď a nauč nás ceste múdrosti. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"18", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pane, vodca svojho ľudu, ty si dal Mojžišovi zákon na Sinaji; príď, vystri svoju ruku a vysloboď nás! <font color='#B71C1C'>– R.</font> Aleluja."},
            {"19", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Výhonok z koreňa Jesseho, ty stojíš ako znamenie pre národy; príď a vysloboď nás, nemeškaj. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"20", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kľúč Dávidov, ty otváraš brány večného Kráľovstva; príď a vyveď zo žalára spútaného, toho, čo sedí vo tme. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"21", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Emanuel, náš kráľ a zákonodarca; príď a zachráň nás, Pane, Bože náš. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"22", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kráľ národov a uholný kameň Cirkvi; príď a spas človeka, ktorého si utvoril zo zeme. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"23", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kráľ národov a uholný kameň Cirkvi; príď a spas človeka, ktorého si utvoril zo zeme. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"24", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Hviezda, čo vychádza, jas večného svetla a slnko spravodlivosti; príď a osvieť tých, čo sedia v temnotách a v tieni smrti. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"24gkn", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zajtra bude zahladená neprávosť zeme a začne nad nami kraľovať Spasiteľ sveta. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"25agkn", "", "", "Lk 2, 10-11", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvestujem vám veľkú radosť: Dnes sa nám narodil Spasiteľ, Kristus Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"25bgkn", "", "", "Tit 3,4-7", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Sláva Bohu na výsostiach a na zemi pokoj ľuďom dobrej vôle. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"25cgkn", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Posvätný deň nám zažiaril: poďte, národy, a klaňajte sa Pánovi. Dnes zostúpilo na zem veľké svetlo. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"26g", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Požehnaný, ktorý prichádza v mene Pánovom. Boh, Pán, je naším svetlom. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"27g", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Teba, Bože, chválime, teba, Pane, velebíme. Teba, Pane, oslavuje slávny zbor apoštolov. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"28g", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Teba, Bože, chválime, teba, Pane, velebíme. Teba, Pane, chváli vznešený zástup mučeníkov. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29", "", "", "Porov. Lk 2, 32", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pán je svetlo národov, Pán je sláva svojho ľudu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Posvätný deň nám zažiaril: poďte, národy, a klaňajte sa Pánovi. Dnes zostúpilo na zem veľké svetlo. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"31", "", "", "Jn 1, 14a. 12a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Slovo sa telom stalo a prebývalo medzi nami. Tým, ktorí ho prijali, dalo moc stať sa Božími deťmi. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"31gk", "", "", "Hebr 1, 1-2", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Mnoho ráz hovoril kedysi Boh otcom skrze prorokov. V týchto posledných dňoch prehovoril k nám v Synovi. <font color='#B71C1C'>– R.</font> Aleluja."},
    };
}

