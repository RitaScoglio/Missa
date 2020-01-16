package sk.missa.interfaces;

/*
 * Responzóziové žalmy vo veľkonočnom období uložené v dvojrozmernom poli: velkanocZalm
 * nedeľa: {týždeň vo veľkonočnom období+deň (napr. 2 týždeň v pondelok - 21), liturgický rok (A/B/C), "", súradnice, text},
 * deň v týždni: {týždeň vo veľkonočnom období+deň, deň v týždni (1-pondelok, 2-utorok..., 6-sobota), "", súradnice, text},
 *
 * Alelujové verše vo veľkonočnom období uložené v dvojrozmernom poli: velkanocAleluja
 * nedeľa: {týždeň vo veľkonočnom období+deň (napr. 2 týždeň v pondelok - 21), liturgický rok (A/B/C), "", súradnice, text},
 * deň v týždni: {týždeň vo veľkonočnom období+deň, deň v týždni (1-pondelok, 2-utorok..., 6-sobota), "", súradnice, text},
 * */

public interface Zalmy_velkanoc {
    String[][] velkanocZalm = {
            {"10", "A", "", "Ž 118, 1-2. 16ab+17. 22-23",
                    "<font color='#B71C1C'>R.:</font> Toto je deň Krista Pána, radujme sa, aleluja.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "Teraz nech hovorí Izrael, že Pán je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "že jeho milosrdenstvo trvá naveky.  <font color='#B71C1C'>– R.</font><br>" +
                            "\"Pánova pravica mocne zasiahla, <font color='#B71C1C'>*</font><br>" +
                            "Pánova pravica ma zdvihla.\"<br>" +
                            "Ja nezomriem, budem žiť <font color='#B71C1C'>*</font><br>" +
                            "a vyrozprávam skutky Pánove. <font color='#B71C1C'>– R.</font><br>" +
                            "Kameň, čo stavitelia zavrhli, <font color='#B71C1C'>*</font><br>" +
                            "stal sa kameňom uholným.<br>" +
                            "To sa stalo na pokyn Pána; <font color='#B71C1C'>*</font><br>" +
                            "vec v našich očiach obdivuhodná. <font color='#B71C1C'>– R.</font>"},
            {"10", "B", "", "Ž 118, 1-2. 16ab+17. 22-23",
                    "<font color='#B71C1C'>R.:</font> Toto je deň Krista Pána, radujme sa, aleluja.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "Teraz nech hovorí Izrael, že Pán je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "že jeho milosrdenstvo trvá naveky. <font color='#B71C1C'>– R.</font><br>" +
                            "\"Pánova pravica mocne zasiahla, <font color='#B71C1C'>*</font><br>" +
                            "Pánova pravica ma zdvihla.\"<br>" +
                            "Ja nezomriem, budem žiť <font color='#B71C1C'>*</font><br>" +
                            "a vyrozprávam skutky Pánove. <font color='#B71C1C'>– R.</font><br>" +
                            "Kameň, čo stavitelia zavrhli, <font color='#B71C1C'>*</font><br>" +
                            "stal sa kameňom uholným.<br>" +
                            "To sa stalo na pokyn Pána; <font color='#B71C1C'>*</font><br>" +
                            "vec v našich očiach obdivuhodná. <font color='#B71C1C'>– R.</font>"},
            {"10", "C", "", "Ž 118, 1-2. 16ab+17. 22-23",
                    "<font color='#B71C1C'>R.:</font> Toto je deň Krista Pána, radujme sa, aleluja.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "Teraz nech hovorí Izrael, že Pán je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "že jeho milosrdenstvo trvá naveky. <font color='#B71C1C'>– R.</font><br>" +
                            "\"Pánova pravica mocne zasiahla, <font color='#B71C1C'>*</font><br>" +
                            "Pánova pravica ma zdvihla.\"<br>" +
                            "Ja nezomriem, budem žiť <font color='#B71C1C'>*</font><br>" +
                            "a vyrozprávam skutky Pánove. <font color='#B71C1C'>– R.</font><br>" +
                            "Kameň, čo stavitelia zavrhli, <font color='#B71C1C'>*</font><br>" +
                            "stal sa kameňom uholným.<br>" +
                            "To sa stalo na pokyn Pána; <font color='#B71C1C'>*</font><br>" +
                            "vec v našich očiach obdivuhodná. <font color='#B71C1C'>– R.</font>"},
            {"11", "1", "", "Ž 16, 1-2a+5. 7-8. 9-10. 11",
                    "<font color='#B71C1C'>R.:</font> Ochráň ma, Bože, k tebe sa utiekam.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Ochráň ma, Bože, k tebe sa utiekam. <font color='#B71C1C'>*</font><br>" +
                            "Hovorím Pánovi: \"Ty si môj Pán.\"<br>" +
                            "Ty, Pane, si môj podiel na dedičstve a na kalichu, <font color='#B71C1C'>*</font><br>" +
                            "v tvojich rukách je môj osud. <font color='#B71C1C'>– R.</font><br>" +
                            "Velebím Pána, čo ma múdrosťou obdaril; <font color='#B71C1C'>*</font><br>" +
                            "v noci ma k tomu moje srdce vyzýva.<br>" +
                            "Pána mám vždy pred očami; <font color='#B71C1C'>*</font><br>" +
                            "a pretože je po mojej pravici, nezakolíšem sa. <font color='#B71C1C'>– R.</font><br>" +
                            "Preto sa raduje moje srdce <font color='#B71C1C'>†</font><br>" +
                            "a moja duša plesá <font color='#B71C1C'>*</font><br>" +
                            "aj moje telo odpočíva v nádeji.<br>" +
                            "Lebo nenecháš moju dušu v podsvetí <font color='#B71C1C'>*</font><br>" +
                            "a nedovolíš, aby tvoj svätý videl porušenie. <font color='#B71C1C'>– R.</font><br>" +
                            "Ukážeš mi cestu života. <font color='#B71C1C'>†</font><br>" +
                            "U teba je plnosť radosti, <font color='#B71C1C'>*</font><br>" +
                            "po tvojej pravici večná slasť. <font color='#B71C1C'>– R.</font>"},
            {"12", "2", "", "Ž 33, 4-5. 18-19. 20+22",
                    "<font color='#B71C1C'>R.:</font> Milosti Pánovej plná je zem.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
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
            {"13", "3", "", "Ž 105, 1-2. 3-4. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Nech sa radujú srdcia tých, čo hľadajú Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána a vzývajte jeho meno, <font color='#B71C1C'>*</font><br>" +
                            "rozhlasujte jeho skutky medzi národmi.<br>" +
                            "Spievajte mu a hrajte, <font color='#B71C1C'>*</font><br>" +
                            "rozprávajte o jeho obdivuhodných skutkoch. <font color='#B71C1C'>– R.</font><br>" +
                            "Jeho svätým menom sa honoste; <font color='#B71C1C'>*</font><br>" +
                            "nech sa radujú srdcia tých, čo hľadajú Pána.<br>" +
                            "Hľadajte Pána a jeho moc, <font color='#B71C1C'>*</font><br>" +
                            "hľadajte vždy jeho tvár, <font color='#B71C1C'>– R.</font><br>" +
                            "vy, potomci Abraháma, Pánovho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "synovia Jakuba, vyvoleného Pánovho.<br>" +
                            "On, Pán, je náš Boh; <font color='#B71C1C'>*</font><br>" +
                            "jeho rozhodnutia platia po celej zemi. <font color='#B71C1C'>– R.</font><br>" +
                            "Večne pamätá na svoju zmluvu, <font color='#B71C1C'>*</font><br>" +
                            "na sľub, ktorý dal pokoleniam tisícim,<br>" +
                            "na zmluvu, čo s Abrahámom uzavrel, <font color='#B71C1C'>*</font><br>" +
                            "na prísahu, ktorou sa Izákovi zaviazal. <font color='#B71C1C'>– R.</font>"},
            {"14", "4", "", "Ž 8, 2ab+5. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pane, náš Vládca, aké vznešené je tvoje meno na celej zemi!<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Pane, náš Vládca, <font color='#B71C1C'>*</font><br>" +
                            "aké vznešené je tvoje meno na celej zemi!<br>" +
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
            {"15", "5", "", "Ž 118, 1-2+4. 22-24. 25-27a",
                    "<font color='#B71C1C'>R.:</font> Kameň, čo stavitelia zavrhli, stal sa kameňom uholným.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "Teraz nech hovorí Izrael, že Pán je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "že jeho milosrdenstvo trvá naveky.<br>" +
                            "Teraz nech hovoria všetci bohabojní: <font color='#B71C1C'>*</font><br>" +
                            "jeho milosrdenstvo trvá naveky. <font color='#B71C1C'>– R.</font><br>" +
                            "Kameň, čo stavitelia zavrhli, <font color='#B71C1C'>*</font><br>" +
                            "stal sa kameňom uholným.<br>" +
                            "To sa stalo na pokyn Pána; <font color='#B71C1C'>*</font><br>" +
                            "vec v našich očiach obdivuhodná.<br>" +
                            "Toto je deň, ktorý učinil Pán, <font color='#B71C1C'>*</font><br>" +
                            "plesajme a radujme sa z neho. <font color='#B71C1C'>– R.</font><br>" +
                            "Pane, spas ma; <font color='#B71C1C'>*</font><br>" +
                            "Pane, daj mi úspech.<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom. <font color='#B71C1C'>†</font><br>" +
                            "Požehnávame vás z domu Pánovho. <font color='#B71C1C'>*</font><br>" +
                            "Boh, Pán, je naším svetlom. <font color='#B71C1C'>– R.</font>"},
            {"16", "6", "", "Ž 118, 1+14-15b. 15c-16a+18. 19-21",
                    "<font color='#B71C1C'>R.:</font> Vzdávame ti vďaky, Pane, Bože milosrdný.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "Moja sila a chvála je Pán, <font color='#B71C1C'>*</font><br>" +
                            "on sa mi stal záchrancom.<br>" +
                            "Hlas plesania nad záchranou <font color='#B71C1C'>*</font><br>" +
                            "znie v stánkoch spravodlivých: <font color='#B71C1C'>– R.</font><br>" +
                            "\"Pánova pravica mocne zasiahla, <font color='#B71C1C'>*</font><br>" +
                            "Pánova pravica ma zdvihla.\"<br>" +
                            "Prísne ma Pán potrestal, <font color='#B71C1C'>*</font><br>" +
                            "no nevydal ma smrti napospas. <font color='#B71C1C'>– R.</font><br>" +
                            "Otvorte mi brány spravodlivosti, <font color='#B71C1C'>*</font><br>" +
                            "vojdem nimi a poďakujem sa Pánovi.<br>" +
                            "Toto je brána Pánova; <font color='#B71C1C'>*</font><br>" +
                            "len spravodliví ňou vchádzajú.<br>" +
                            "Ďakujem ti, že si ma vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a že si ma zachránil. <font color='#B71C1C'>– R.</font>"},
            {"20", "A", "", "Ž 118, 2-4. 13-15. 22-24",
                    "<font color='#B71C1C'>R.:</font> Oslavujme Pána, lebo je dobrý, lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Teraz nech hovorí Izrael, že Pán je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "že jeho milosrdenstvo trvá naveky.<br>" +
                            "Teraz nech hovorí dom Áronov: <font color='#B71C1C'>*</font><br>" +
                            "jeho milosrdenstvo trvá naveky.<br>" +
                            "Teraz nech hovoria všetci bohabojní: <font color='#B71C1C'>*</font><br>" +
                            "jeho milosrdenstvo trvá naveky. <font color='#B71C1C'>– R.</font><br>" +
                            "Prudko dorážali na mňa, aby som sa zrútil, <font color='#B71C1C'>*</font><br>" +
                            "no Pán mi pomohol.<br>" +
                            "Moja sila a chvála je Pán, <font color='#B71C1C'>*</font><br>" +
                            "on sa mi stal záchrancom.<br>" +
                            "Hlas plesania nad záchranou <font color='#B71C1C'>*</font><br>" +
                            "znie v stánkoch spravodlivých. <font color='#B71C1C'>– R.</font><br>" +
                            "Kameň, čo stavitelia zavrhli, <font color='#B71C1C'>*</font><br>" +
                            "stal sa kameňom uholným.<br>" +
                            "To sa stalo na pokyn Pána; <font color='#B71C1C'>*</font><br>" +
                            "vec v našich očiach obdivuhodná.<br>" +
                            "Toto je deň, ktorý učinil Pán, <font color='#B71C1C'>*</font><br>" +
                            "plesajme a radujme sa z neho. <font color='#B71C1C'>– R.</font>"},
            {"20", "B", "", "Ž 118, 2-4. 16ab +17-18. 22-24",
                    "<font color='#B71C1C'>R.:</font> Oslavujme Pána, lebo je dobrý, lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Teraz nech hovorí Izrael, že Pán je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "že jeho milosrdenstvo trvá naveky.<br>" +
                            "Teraz nech hovorí dom Áronov: <font color='#B71C1C'>*</font><br>" +
                            "jeho milosrdenstvo trvá naveky.<br>" +
                            "Teraz nech hovoria všetci bohabojní: <font color='#B71C1C'>*</font><br>" +
                            "jeho milosrdenstvo trvá naveky. <font color='#B71C1C'>– R.</font><br>" +
                            "\"Pánova pravica mocne zasiahla, <font color='#B71C1C'>*</font><br>" +
                            "Pánova pravica ma zdvihla.\"<br>" +
                            "Ja nezomriem, budem žiť <font color='#B71C1C'>*</font><br>" +
                            "a vyrozprávam skutky Pánove.<br>" +
                            "Prísne ma Pán potrestal, <font color='#B71C1C'>*</font><br>" +
                            "no nevydal ma smrti napospas. <font color='#B71C1C'>– R.</font><br>" +
                            "Kameň, čo stavitelia zavrhli, <font color='#B71C1C'>*</font><br>" +
                            "stal sa kameňom uholným.<br>" +
                            "To sa stalo na pokyn Pána; <font color='#B71C1C'>*</font><br>" +
                            "vec v našich očiach obdivuhodná.<br>" +
                            "Toto je deň, ktorý učinil Pán, <font color='#B71C1C'>*</font><br>" +
                            "plesajme a radujme sa z neho. <font color='#B71C1C'>– R.</font>"},
            {"20", "C", "", "Ž 118, 2-4. 22-24. 25-27a",
                    "<font color='#B71C1C'>R.:</font> Oslavujme Pána, lebo je dobrý, lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Teraz nech hovorí Izrael, že Pán je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "že jeho milosrdenstvo trvá naveky.<br>" +
                            "Teraz nech hovorí dom Áronov: <font color='#B71C1C'>*</font><br>" +
                            "jeho milosrdenstvo trvá naveky.<br>" +
                            "Teraz nech hovoria všetci bohabojní: <font color='#B71C1C'>*</font><br>" +
                            "jeho milosrdenstvo trvá naveky. <font color='#B71C1C'>– R.</font><br>" +
                            "Kameň, čo stavitelia zavrhli, <font color='#B71C1C'>*</font><br>" +
                            "stal sa kameňom uholným.<br>" +
                            "To sa stalo na pokyn Pána; <font color='#B71C1C'>*</font><br>" +
                            "vec v našich očiach obdivuhodná.<br>" +
                            "Toto je deň, ktorý učinil Pán, <font color='#B71C1C'>*</font><br>" +
                            "plesajme a radujme sa z neho. <font color='#B71C1C'>– R.</font><br>" +
                            "Pane, spas ma; <font color='#B71C1C'>*</font><br>" +
                            "Pane, daj mi úspech.<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom. <font color='#B71C1C'>†</font><br>" +
                            "Požehnávame vás z domu Pánovho. <font color='#B71C1C'>*</font><br>" +
                            "Boh, Pán, je naším svetlom. <font color='#B71C1C'>– R.</font>"},
            {"21", "1", "", "Ž 2, 1-3. 4-6. 7-9",
                    "<font color='#B71C1C'>R.:</font> Šťastní sú všetci, čo sa spoliehajú na Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Prečo sa búria pohania? <font color='#B71C1C'>*</font><br>" +
                            "Prečo národy snujú plány daromné?<br>" +
                            "Povstávajú pozemskí králi <font color='#B71C1C'>†</font><br>" +
                            "a vladári sa spolčujú <font color='#B71C1C'>*</font><br>" +
                            "proti Pánovi a proti jeho pomazanému:<br>" +
                            "\"Rozbime ich okovy <font color='#B71C1C'>*</font><br>" +
                            "a ich, jarmo zhoďme zo seba!\" <font color='#B71C1C'>– R.</font><br>" +
                            "Ten, čo na nebesiach prebýva, sa im vysmieva; <font color='#B71C1C'>*</font><br>" +
                            "Pán ich privedie na posmech.<br>" +
                            "Raz na nich rozhorčene zavolá <font color='#B71C1C'>*</font><br>" +
                            "a svojím hnevom ich vydesí:<br>" +
                            "\"Veď ja som ustanovil svojho kráľa <font color='#B71C1C'>*</font><br>" +
                            "na svojom svätom vrchu Sione!\" <font color='#B71C1C'>– R.</font><br>" +
                            "Zvestujem Pánovo rozhodnutie: <font color='#B71C1C'>†</font><br>" +
                            "Pán mi povedal: \"Ty si môj syn. <font color='#B71C1C'>*</font><br>" +
                            "Ja som ťa dnes splodil.<br>" +
                            "Žiadaj si odo mňa a dám ti do dedičstva národy <font color='#B71C1C'>*</font><br>" +
                            "a do vlastníctva celú zem.<br>" +
                            "Budeš nad nimi panovať žezlom železným <font color='#B71C1C'>*</font><br>" +
                            "a rozbiješ ich jak hrnce hlinené.\" <font color='#B71C1C'>– R.</font>"},
            {"22", "2", "", "Ž 93, 1ab. 1c-2. 5",
                    "<font color='#B71C1C'>R.:</font> Pán kraľuje, velebou sa zaodel.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Pán kraľuje, velebou sa zaodel; <font color='#B71C1C'>*</font><br>" +
                            "zaodel sa Pán, udatnosťou sa prepásal. <font color='#B71C1C'>– R.</font><br>" +
                            "Tak upevnil zemekruh, že sa nezachveje. <font color='#B71C1C'>*</font><br>" +
                            "Pevný je tvoj trón oddávna, ty si od vekov. <font color='#B71C1C'>– R.</font><br>" +
                            "Veľmi vierohodné sú tvoje svedectvá; <font color='#B71C1C'>*</font><br>" +
                            "tvojmu domu, Pane,<br>" +
                            "patrí posvätná úcta po všetky časy. <font color='#B71C1C'>– R.</font>"},
            {"23", "3", "", "Ž 34, 2-3. 4-5. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Úbožiak zavolal a Pán ho vyslyšal.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
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
                            "šťastný človek, čo sa utieka k nemu. <font color='#B71C1C'>– R.</font>"},
            {"24", "4", "", "Ž 34, 2+9. 17-18. 19-20",
                    "<font color='#B71C1C'>R.:</font> Úbožiak zavolal a Pán ho vyslyšal.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Pána chcem velebiť v každom čase, <font color='#B71C1C'>*</font><br>" +
                            "moje ústa budú ho vždy chváliť.<br>" +
                            "Skúste a presvedčte sa, aký dobrý je Pán; <font color='#B71C1C'>*</font><br>" +
                            "šťastný človek, čo sa utieka k nemu. <font color='#B71C1C'>– R.</font><br>" +
                            "Tvár Pánova sa odvracia od tých, čo robia zlo, <font color='#B71C1C'>*</font><br>" +
                            "a vyhladzuje ich pamiatku zo zeme.<br>" +
                            "Spravodliví volali a Pán ich vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ich zo všetkých tiesní. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán je pri tých, čo majú srdce skrúšené, <font color='#B71C1C'>*</font><br>" +
                            "a zachraňuje zlomených na duchu.<br>" +
                            "Spravodliví majú utrpení veľa, <font color='#B71C1C'>*</font><br>" +
                            "ale Pán ich vyslobodí zo všetkých. <font color='#B71C1C'>– R.</font>"},
            {"25", "5", "", "Ž 27, 1. 4. 13-14",
                    "<font color='#B71C1C'>R.:</font> Pán je moje svetlo a moja spása.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
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
            {"26", "6", "", "Ž 33, 1-2. 4-5. 18-19",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, nech je nad nami, ako dúfame v teba.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Plesajte, spravodliví, v Pánovi; <font color='#B71C1C'>*</font><br>" +
                            "statočným sluší spievať pieseň chvály.<br>" +
                            "Oslavujte Pána citarou, <font color='#B71C1C'>*</font><br>" +
                            "hrajte mu na desaťstrunovej lutne. <font color='#B71C1C'>– R.</font><br>" +
                            "Lebo Pánovo slovo je pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a verné všetko jeho konanie.<br>" +
                            "Miluje spravodlivosť a právo; <font color='#B71C1C'>*</font><br>" +
                            "milosti Pánovej plná je zem. <font color='#B71C1C'>– R.</font><br>" +
                            "Hľa, oko Pánovo bdie nad tými, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "nad tými, čo v jeho milosrdenstvo dúfajú,<br>" +
                            "aby ich zachránil pred smrťou <font color='#B71C1C'>*</font><br>" +
                            "a v čase hladu nakŕmil. <font color='#B71C1C'>– R.</font>"},
            {"30", "A", "", "Ž 16, 1-2a+5. 7-8. 9-10. 11",
                    "<font color='#B71C1C'>R.:</font> Ukáž mi, Pane, cestu života.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Ochráň ma, Bože, k tebe sa utiekam. <font color='#B71C1C'>*</font><br>" +
                            "Hovorím Pánovi: \"Ty si môj Pán.\"<br>" +
                            "Ty, Pane, si môj podiel na dedičstve a na kalichu, <font color='#B71C1C'>*</font><br>" +
                            "v tvojich rukách je môj osud. <font color='#B71C1C'>– R.</font><br>" +
                            "Velebím Pána, čo ma múdrosťou obdaril; <font color='#B71C1C'>*</font><br>" +
                            "v noci ma k tomu moje srdce vyzýva.<br>" +
                            "Pána mám vždy pred očami; <font color='#B71C1C'>*</font><br>" +
                            "a pretože je po mojej pravici, nezakolíšem sa. <font color='#B71C1C'>– R.</font><br>" +
                            "Preto sa raduje moje srdce <font color='#B71C1C'>†</font><br>" +
                            "a moja duša plesá <font color='#B71C1C'>*</font><br>" +
                            "aj moje telo odpočíva v nádeji.<br>" +
                            "Lebo nenecháš moju dušu v podsvetí <font color='#B71C1C'>*</font><br>" +
                            "a nedovolíš, aby tvoj svätý videl porušenie. <font color='#B71C1C'>– R.</font><br>" +
                            "Ukážeš mi cestu života. <font color='#B71C1C'>†</font><br>" +
                            "U teba je plnosť radosti, <font color='#B71C1C'>*</font><br>" +
                            "po tvojej pravici večná slasť. <font color='#B71C1C'>– R.</font>"},
            {"30", "B", "", "Ž 4, 2. 4. 7. 9",
                    "<font color='#B71C1C'>R.:</font> Pane, ukáž nám svetlo svojej tváre ako znamenie.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Bože, ty spravodlivosť moja,<br>" +
                            "vyslyš ma, keď volám o pomoc. <font color='#B71C1C'>*</font><br>" +
                            "V súžení si mi uľavil.<br>" +
                            "Zmiluj sa nado mnou <font color='#B71C1C'>*</font><br>" +
                            "a vyslyš moju modlitbu. <font color='#B71C1C'>– R.</font><br>" +
                            "Vedzte, že Pán zázračne chráni svojho svätého; <font color='#B71C1C'>*</font><br>" +
                            "Pán ma vyslyší, keď k nemu zavolám. <font color='#B71C1C'>– R.</font><br>" +
                            "Mnohí hovoria: \"Kto nám ukáže šťastie?\" <font color='#B71C1C'>*</font><br>" +
                            "Pane, ukáž nám svetlo svojej tváre ako znamenie. <font color='#B71C1C'>– R.</font><br>" +
                            "V pokoji sa ukladám a usínam, <font color='#B71C1C'>*</font><br>" +
                            "lebo len ty, Pane, ma necháš odpočívať v bezpečí. <font color='#B71C1C'>– R.</font>"},
            {"30", "C", "", "Ž 30, 2+4. 5-6. 11-12a+13b",
                    "<font color='#B71C1C'>R.:</font> Budem ťa, Pane, oslavovať, že si ma vyslobodil.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
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
            {"31", "1", "", "Ž 119, 23-24. 26-27. 29-30",
                    "<font color='#B71C1C'>R.:</font> Blažení tí, čo kráčajú podľa zákona Pánovho.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Hoci mocnári zasadajú a radia sa proti mne, <font color='#B71C1C'>*</font><br>" +
                            "tvoj sluha rozjíma o tvojich predpisoch.<br>" +
                            "Veď tvoje ustanovenia sú mi rozkošou <font color='#B71C1C'>*</font><br>" +
                            "a tvoje príkazy sú mojimi radcami. <font color='#B71C1C'>– R.</font><br>" +
                            "Tebe som vyjavil svoje cesty a ty si ma vypočul; <font color='#B71C1C'>*</font><br>" +
                            "pouč ma o svojich prikázaniach.<br>" +
                            "Daj, aby som pochopil cestu tvojich príkazov, <font color='#B71C1C'>*</font><br>" +
                            "a budem rozjímať o tvojich<br>" +
                            "obdivuhodných skutkoch. <font color='#B71C1C'>– R.</font><br>" +
                            "Odvráť ma od cesty lži <font color='#B71C1C'>*</font><br>" +
                            "a milostivo mi daj svoj zákon.<br>" +
                            "Cestu pravdy som si vyvolil, <font color='#B71C1C'>*</font><br>" +
                            "tvoje slová mám stále pred sebou. <font color='#B71C1C'>– R.</font>"},
            {"32", "2", "", "Ž 31, 3c-4. 6+7b-8a. 17+21ab",
                    "<font color='#B71C1C'>R.:</font> Do tvojich rúk, Pane, porúčam svojho ducha.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Buď mi skalou útočišťa, <font color='#B71C1C'>*</font><br>" +
                            "opevneným hradom mojej spásy.<br>" +
                            "Veď ty si moja sila a moje útočište, <font color='#B71C1C'>*</font><br>" +
                            "pre svoje meno budeš ma viesť a opatrovať. <font color='#B71C1C'>– R.</font><br>" +
                            "Do tvojich rúk porúčam svojho ducha; <font color='#B71C1C'>*</font><br>" +
                            "ty si ma vykúpil, Pane, Bože verný.<br>" +
                            "Ale ja dúfam v Pána. <font color='#B71C1C'>*</font><br>" +
                            "Plesám a teším sa, že si milosrdný. <font color='#B71C1C'>– R.</font><br>" +
                            "Rozjasni svoju tvár nad svojím sluhom <font color='#B71C1C'>*</font><br>" +
                            "a zachráň ma vo svojom milosrdenstve.<br>" +
                            "Záclonou svojej tváre ich kryješ <font color='#B71C1C'>*</font><br>" +
                            "pred zúrivosťou ľudu. <font color='#B71C1C'>– R.</font>"},
            {"33", "3", "", "Ž 66, 1-3a. 4-5. 6-7a",
                    "<font color='#B71C1C'>R.:</font> Jasaj Bohu, celá zem.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Jasaj Bohu, celá zem; <font color='#B71C1C'>*</font><br>" +
                            "hrajte a spievajte na slávu jeho mena,<br>" +
                            "vzdávajte mu chválu. <font color='#B71C1C'>*</font><br>" +
                            "Hovorte Bohu: \"Aké úžasné sú tvoje diela. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech sa ti klania celá zem a nech ti spieva, <font color='#B71C1C'>*</font><br>" +
                            "nech ospevuje tvoje meno.\"<br>" +
                            "Poďte a pozrite na Božie diela; <font color='#B71C1C'>*</font><br>" +
                            "úžas budia skutky, ktoré koná ľuďom. <font color='#B71C1C'>– R.</font><br>" +
                            "More premieňa na suchú zem, <font color='#B71C1C'>*</font><br>" +
                            "rieku možno prejsť suchou nohou;<br>" +
                            "preto sa tešíme z neho. <font color='#B71C1C'>*</font><br>" +
                            "Svojou mocou panuje naveky. <font color='#B71C1C'>– R.</font>"},
            {"34", "4", "", "Ž 66, 8-9. 16-17. 20",
                    "<font color='#B71C1C'>R.:</font> Jasaj Bohu, celá zem.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Velebte, národy, nášho Boha <font color='#B71C1C'>*</font><br>" +
                            "a rozhlasujte jeho chválu;<br>" +
                            "on dal život našej duši <font color='#B71C1C'>*</font><br>" +
                            "a chráni naše nohy pred pádom. <font color='#B71C1C'>– R.</font><br>" +
                            "Poďte sem a počúvajte, všetci ctitelia Boží, <font color='#B71C1C'>*</font><br>" +
                            "vyrozprávam vám, aké veľké veci mi urobil.<br>" +
                            "Moje ústa ho vzývali <font color='#B71C1C'>*</font><br>" +
                            "a môj jazyk velebil. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech je zvelebený Boh, <font color='#B71C1C'>†</font><br>" +
                            "lebo neodmietol moju modlitbu <font color='#B71C1C'>*</font><br>" +
                            "a neodňal mi svoje milosrdenstvo. <font color='#B71C1C'>– R.</font>"},
            {"35", "5", "", "Ž 117, 1. 2",
                    "<font color='#B71C1C'>R.:</font> Choďte do celého sveta a hlásajte evanjelium.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľte Pána, všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "oslavujte ho, všetci ľudia; <font color='#B71C1C'>– R.</font><br>" +
                            "lebo je veľké jeho milosrdenstvo voči nám <font color='#B71C1C'>*</font><br>" +
                            "a pravda Pánova trvá naveky. <font color='#B71C1C'>– R.</font>"},
            {"36", "6", "", "Ž 116, 12-13. 14-15. 16-17",
                    "<font color='#B71C1C'>R.:</font> Čím sa odvďačím Pánovi za všetko, čo mi dal?<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Čím sa odvďačím Pánovi <font color='#B71C1C'>*</font><br>" +
                            "za všetko, čo mi dal?<br>" +
                            "Vezmem kalich spásy <font color='#B71C1C'>*</font><br>" +
                            "a budem vzývať meno Pánovo. <font color='#B71C1C'>– R.</font><br>" +
                            "Pánovi splním svoje sľuby <font color='#B71C1C'>*</font><br>" +
                            "pred všetkým jeho ľudom.<br>" +
                            "V Pánových očiach má veľkú cenu <font color='#B71C1C'>*</font><br>" +
                            "smrť jeho svätých. <font color='#B71C1C'>– R.</font><br>" +
                            "Pane, som tvoj sluha, <font color='#B71C1C'>*</font><br>" +
                            "som tvoj sluha a syn tvojej služobnice.<br>" +
                            "Ty si mi putá rozviazal: <font color='#B71C1C'>†</font><br>" +
                            "obetu chvály ti prinesiem <font color='#B71C1C'>*</font><br>" +
                            "a budem vzývať meno Pánovo. <font color='#B71C1C'>– R.</font>"},
            {"40", "A", "", "Ž 23, 1-3a. 3b-4. 5. 6",
                    "<font color='#B71C1C'>R.:</font> Pán je môj pastier, nič mi nechýba.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
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
            {"40", "B", "", "Ž 118, 1+8-9. 21-23. 26+28-29",
                    "<font color='#B71C1C'>R.:</font> Kameň, čo stavitelia zavrhli, stal sa kameňom uholným.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "Lepšie je utiekať sa k Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "ako sa spoliehať na človeka.<br>" +
                            "Lepšie je utiekať sa k Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "ako sa spoliehať na mocnárov. <font color='#B71C1C'>– R.</font><br>" +
                            "Ďakujem ti, že si ma vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a že si ma zachránil.<br>" +
                            "Kameň, čo stavitelia zavrhli, <font color='#B71C1C'>*</font><br>" +
                            "stal sa kameňom uholným.<br>" +
                            "To sa stalo na pokyn Pána; <font color='#B71C1C'>*</font><br>" +
                            "vec v našich očiach obdivuhodná. <font color='#B71C1C'>– R.</font><br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom. <font color='#B71C1C'>*</font><br>" +
                            "Požehnávame vás z domu Pánovho.<br>" +
                            "Ty si môj Boh, vďaky ti vzdávam; <font color='#B71C1C'>*</font><br>" +
                            "ty si môj Boh, velebím ťa.<br>" +
                            "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "lebo jeho milosrdenstvo trvá naveky. <font color='#B71C1C'>– R.</font>"},
            {"40", "C", "", "Ž 100, 2. 3. 5",
                    "<font color='#B71C1C'>R.:</font> Sme jeho ľud a ovce z jeho stáda.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Jasaj na chválu Pánovi, celá zem, <font color='#B71C1C'>†</font><br>" +
                            "s radosťou slúžte Pánovi. <font color='#B71C1C'>*</font><br>" +
                            "S plesaním vstupujte pred jeho tvár. <font color='#B71C1C'>– R.</font><br>" +
                            "Vedzte, že náš Pán je Boh; <font color='#B71C1C'>†</font><br>" +
                            "on je náš stvoriteľ a jemu patríme, <font color='#B71C1C'>*</font><br>" +
                            "sme jeho ľud a ovce z jeho stáda. <font color='#B71C1C'>– R.</font><br>" +
                            "Lebo Pán je dobrý; <font color='#B71C1C'>†</font><br>" +
                            "jeho milosrdenstvo trvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho vernosť z pokolenia na pokolenie. <font color='#B71C1C'>– R.</font>"},
            {"41", "1", "", "Ž 42, 2-3; 43, 3. 4",
                    "<font color='#B71C1C'>R.:</font> Po Bohu žízni moja duša, po Bohu živom.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Ako jeleň dychtí za vodou z prameňa, <font color='#B71C1C'>*</font><br>" +
                            "tak moja duša, Bože, túži za tebou.<br>" +
                            "Po Bohu žízni moja duša, po Bohu živom; <font color='#B71C1C'>*</font><br>" +
                            "kedyže už prídem k nemu a uzriem Božiu tvár? <font color='#B71C1C'>– R.</font><br>" +
                            "Zošli svoje svetlo a svoju pravdu; <font color='#B71C1C'>†</font><br>" +
                            "ony nech ma sprevádzajú <font color='#B71C1C'>*</font><br>" +
                            "a privedú na tvoj svätý vrch a do tvojich stánkov. <font color='#B71C1C'>– R.</font><br>" +
                            "I pristúpim k Božiemu oltáru, <font color='#B71C1C'>†</font><br>" +
                            "k Bohu, ktorý ma napĺňa radosťou i plesaním, <font color='#B71C1C'>*</font><br>" +
                            "a citarou ťa, Bože, môj Bože, zvelebím. <font color='#B71C1C'>– R.</font>"},
            {"42", "2", "", "Ž 87, 1-3. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Chváľte Pána, všetky národy.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Základy má na posvätných vrchoch; <font color='#B71C1C'>†</font><br>" +
                            "brány Siona miluje Pán <font color='#B71C1C'>*</font><br>" +
                            "nad všetky stany Jakuba.<br>" +
                            "Slávne veci sa hovoria o tebe, <font color='#B71C1C'>*</font><br>" +
                            "mesto Božie. <font color='#B71C1C'>– R.</font><br>" +
                            "Rahab a Babylon pripočítam k tým, čo ma poznajú; <font color='#B71C1C'>†</font><br>" +
                            "Filištínci, Týrčania a Etiópčania: <font color='#B71C1C'>*</font><br>" +
                            "tí všetci sa tam zrodili.<br>" +
                            "A o Sione sa bude hovoriť: \"Ten i tamten sa na ňom narodil <font color='#B71C1C'>*</font><br>" +
                            "a sám Najvyšší mu dal pevné základy.\" <font color='#B71C1C'>– R.</font><br>" +
                            "Pán zaznačí do knihy národov: <font color='#B71C1C'>*</font><br>" +
                            "\"Títo sa tam zrodili.\"<br>" +
                            "A spievajú ako pri tanci: <font color='#B71C1C'>*</font><br>" +
                            "\"V tebe sú všetky moje pramene.\" <font color='#B71C1C'>– R.</font>"},
            {"43", "3", "", "Ž 67, 2-3. 5. 6+8",
                    "<font color='#B71C1C'>R.:</font> Velebte Pána, všetky národy.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Bože, buď nám milostivý a žehnaj nás; <font color='#B71C1C'>*</font><br>" +
                            "a tvoja tvár nech žiari nad nami,<br>" +
                            "aby sa tvoja cesta stala známou na zemi <font color='#B71C1C'>*</font><br>" +
                            "a tvoja spása medzi všetkými národmi. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech sa tešia a jasajú národy, <font color='#B71C1C'>†</font><br>" +
                            "že spravodlivo súdiš ľudí <font color='#B71C1C'>*</font><br>" +
                            "a spravuješ národy na zemi. <font color='#B71C1C'>– R.</font><br>" +
                            "Bože, nech ťa velebia národy, <font color='#B71C1C'>*</font><br>" +
                            "nech ťa velebia všetky národy.<br>" +
                            "Nech nás Boh požehná <font color='#B71C1C'>*</font><br>" +
                            "a nech si ho ctia všetky končiny zeme. <font color='#B71C1C'>– R.</font>"},
            {"44", "4", "", "Ž 89, 2-3. 21-22. 25+27",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, ospevovať budem naveky.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Pánovo milosrdenstvo chcem ospevovať naveky; <font color='#B71C1C'>*</font><br>" +
                            "po všetky pokolenia hlásať svojimi ústami tvoju vernosť.<br>" +
                            "Veď ty si povedal:<br>" +
                            "\"Moje milosrdenstvo je ustanovené naveky.\" <font color='#B71C1C'>*</font><br>" +
                            "Tvoja vernosť je upevnená v nebesiach. <font color='#B71C1C'>– R.</font><br>" +
                            "\"Našiel som svojho služobníka Dávida, <font color='#B71C1C'>*</font><br>" +
                            "pomazal som ho svojím svätým olejom.<br>" +
                            "Pevne ho bude držať moja ruka <font color='#B71C1C'>*</font><br>" +
                            "a posilňovať moje rameno. <font color='#B71C1C'>– R.</font><br>" +
                            "S ním bude moja vernosť a milosť <font color='#B71C1C'>*</font><br>" +
                            "a v mojom mene povznesie sa jeho moc.<br>" +
                            "On bude volať ku mne: ‚Ty si môj otec, <font color='#B71C1C'>*</font><br>" +
                            "môj Boh a útočište mojej spásy.'\" <font color='#B71C1C'>– R.</font>"},
            {"45", "5", "", "Ž 2, 6-7. 8-9. 10-11",
                    "<font color='#B71C1C'>R.:</font> Oslávil si, Otče, svojho Syna.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "\"Ja som ustanovil svojho kráľa <font color='#B71C1C'>*</font><br>" +
                            "na svojom svätom vrchu Sione!\"<br>" +
                            "Zvestujem Pánovo rozhodnutie: <font color='#B71C1C'>†</font><br>" +
                            "Pán mi povedal: \"Ty si môj syn. <font color='#B71C1C'>*</font><br>" +
                            "Ja som ťa dnes splodil. <font color='#B71C1C'>– R.</font><br>" +
                            "Žiadaj si odo mňa a dám ti do dedičstva národy <font color='#B71C1C'>*</font><br>" +
                            "a do vlastníctva celú zem.<br>" +
                            "Budeš nad nimi panovať žezlom železným <font color='#B71C1C'>*</font><br>" +
                            "a rozbiješ ich jak hrnce hlinené.\" <font color='#B71C1C'>– R.</font><br>" +
                            "A teraz, králi, pochopte; <font color='#B71C1C'>*</font><br>" +
                            "dajte si povedať, pozemskí vladári.<br>" +
                            "V bázni slúžte Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a s chvením sa mu klaňajte. <font color='#B71C1C'>– R.</font>"},
            {"46", "6", "", "Ž 98, 1. 2-3b. 3c-4",
                    "<font color='#B71C1C'>R.:</font> Uzreli všetky končiny zeme spásu nášho Boha.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
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
                            "plesajte, radujte sa a hrajte. <font color='#B71C1C'>– R.</font>"},
            {"50", "A", "", "Ž 33, 1-2. 4-5. 18-19",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, nech je nad nami, ako dúfame v teba.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Plesajte, spravodliví, v Pánovi; <font color='#B71C1C'>*</font><br>" +
                            "statočným sluší spievať pieseň chvály.<br>" +
                            "Oslavujte Pána citarou, <font color='#B71C1C'>*</font><br>" +
                            "hrajte mu na desaťstrunovej lutne. <font color='#B71C1C'>– R.</font><br>" +
                            "Lebo Pánovo slovo je pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a verné všetko jeho konanie.<br>" +
                            "Miluje spravodlivosť a právo; <font color='#B71C1C'>*</font><br>" +
                            "milosti Pánovej plná je zem. <font color='#B71C1C'>– R.</font><br>" +
                            "Hľa, oko Pánovo bdie nad tými, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "nad tými, čo v jeho milosrdenstvo dúfajú,<br>" +
                            "aby ich zachránil pred smrťou <font color='#B71C1C'>*</font><br>" +
                            "a v čase hladu nakŕmil. <font color='#B71C1C'>– R.</font>"},
            {"50", "B", "", "Ž 22, 26b-27. 28+30. 31-32",
                    "<font color='#B71C1C'>R.:</font> Tebe, Pane, patrí moja chvála vo veľkom zhromaždení.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Svoje sľuby splním pred tvárou tých, čo sa boja Pána. <font color='#B71C1C'>*</font><br>" +
                            "Chudobní sa najedia a budú nasýtení<br>" +
                            "a Pána budú chváliť tí, čo ho hľadajú: <font color='#B71C1C'>*</font><br>" +
                            "\"Naveky nech žijú ich srdcia!\" <font color='#B71C1C'>– R.</font><br>" +
                            "Pána budú spomínať a k nemu sa obrátia<br>" +
                            "všetky zemské končiny <font color='#B71C1C'>*</font><br>" +
                            "jemu sa budú klaňať všetky rodiny národov.<br>" +
                            "Jemu jedinému sa budú klaňať všetci,<br>" +
                            "čo spia pod zemou; <font color='#B71C1C'>*</font><br>" +
                            "pred jeho tvárou padnú na zem všetci,<br>" +
                            "čo zostupujú do prachu. <font color='#B71C1C'>– R.</font><br>" +
                            "Aj moja duša bude preňho žiť <font color='#B71C1C'>*</font><br>" +
                            "a jemu bude slúžiť moje potomstvo.<br>" +
                            "Budúcim pokoleniam sa bude rozprávať o Pánovi <font color='#B71C1C'>†</font><br>" +
                            "a jeho spravodlivosť budú ohlasovať ľudu,<br>" +
                            "ktorý sa narodí: <font color='#B71C1C'>*</font><br>" +
                            "\"Toto urobil Pán.\" <font color='#B71C1C'>– R.</font>"},
            {"50", "C", "", "Ž 145, 8-9. 10-11. 12-13b",
                    "<font color='#B71C1C'>R.:</font> Oslavovať ťa chcem naveky, Bože, môj kráľ.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a veľmi láskavý.<br>" +
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
            {"51", "1", "", "Ž 115, 1-2. 3-4. 15-16",
                    "<font color='#B71C1C'>R.:</font> Nie nás, Pane, ale svoje meno osláv.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Nie nás, Pane, nie nás, <font color='#B71C1C'>†</font><br>" +
                            "ale svoje meno osláv <font color='#B71C1C'>*</font><br>" +
                            "pre svoje milosrdenstvo a pre svoju vernosť.<br>" +
                            "Prečo majú hovoriť pohania: <font color='#B71C1C'>*</font><br>" +
                            "\"Kdeže je ten ich Boh?\" <font color='#B71C1C'>– R.</font><br>" +
                            "Veď náš Boh je v nebi <font color='#B71C1C'>*</font><br>" +
                            "a stvoril všetko, čo chcel.<br>" +
                            "Pohanské modly, hoc sú zo striebra a zo zlata, <font color='#B71C1C'>*</font><br>" +
                            "sú dielom ľudských rúk. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech vás požehnáva Pán, <font color='#B71C1C'>*</font><br>" +
                            "ktorý stvoril nebo i zem.<br>" +
                            "Nebesia si Pán vyhradil pre seba, <font color='#B71C1C'>*</font><br>" +
                            "ale zem dal synom človeka. <font color='#B71C1C'>– R.</font>"},
            {"52", "2", "", "Ž 145, 10-11. 12-13b. 21",
                    "<font color='#B71C1C'>R.:</font> Tvoji svätí, Pane, oznamujú slávu tvojho kráľovstva.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Nech ťa oslavujú, Pane, všetky tvoje diela <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech ťa velebia.<br>" +
                            "Nech rozprávajú o sláve tvojho kráľovstva <font color='#B71C1C'>*</font><br>" +
                            "a o tvojej moci nech hovoria; <font color='#B71C1C'>– R.</font><br>" +
                            "nech ľuďom oznamujú tvoje zázraky <font color='#B71C1C'>*</font><br>" +
                            "i slávu a velebu tvojho kráľovstva.<br>" +
                            "Tvoje kráľovstvo je kráľovstvo pre všetky veky <font color='#B71C1C'>*</font><br>" +
                            "a tvoja vláda sa rozprestiera na všetky pokolenia. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech moje ústa hlásajú slávu Pánovu <font color='#B71C1C'>†</font><br>" +
                            "a všetko živé nech jeho sväté meno velebí <font color='#B71C1C'>*</font><br>" +
                            "navždy a naveky. <font color='#B71C1C'>– R.</font>"},
            {"53", "3", "", "Ž 122, 1-2. 3-4a. 4b-5",
                    "<font color='#B71C1C'>R.:</font> S radosťou pôjdeme do domu Pánovho.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Zaradoval som sa, keď mi povedali: <font color='#B71C1C'>*</font><br>" +
                            "\"Pôjdeme do domu Pánovho.\"<br>" +
                            "Naše nohy už stoja <font color='#B71C1C'>*</font><br>" +
                            "v tvojich bránach, Jeruzalem. <font color='#B71C1C'>– R.</font><br>" +
                            "Jeruzalem je vystavaný ako mesto <font color='#B71C1C'>*</font><br>" +
                            "spojené v jeden celok.<br>" +
                            "Tam prichádzajú kmene, <font color='#B71C1C'>*</font><br>" +
                            "kmene Pánove, <font color='#B71C1C'>– R.</font><br>" +
                            "aby podľa obyčaje Izraela <font color='#B71C1C'>*</font><br>" +
                            "velebili meno Pánovo.<br>" +
                            "Lebo sú tam súdne stolice, <font color='#B71C1C'>*</font><br>" +
                            "stolice domu Dávidovho. <font color='#B71C1C'>– R.</font>"},
            {"54", "4", "", "Ž 96, 1-2a. 2b-3. 10",
                    "<font color='#B71C1C'>R.:</font> Zvestujte všetkým národom zázraky Pánove.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>†</font><br>" +
                            "spievaj Pánovi, celá zem! <font color='#B71C1C'>*</font><br>" +
                            "Spievajte Pánovi, velebte jeho meno. <font color='#B71C1C'>– R.</font><br>" +
                            "Zvestujte jeho spásu deň čo deň. <font color='#B71C1C'>†</font><br>" +
                            "Zvestujte jeho slávu pohanom <font color='#B71C1C'>*</font><br>" +
                            "a jeho zázraky všetkým národom. <font color='#B71C1C'>– R.</font><br>" +
                            "Hlásajte medzi pohanmi: \"Pán kraľuje!\" <font color='#B71C1C'>†</font><br>" +
                            "Upevnil zemekruh, nepohne sa; <font color='#B71C1C'>*</font><br>" +
                            "a spravodlivo súdi národy. <font color='#B71C1C'>– R.</font>"},
            {"55", "5", "", "Ž 57, 8-9. 10-12",
                    "<font color='#B71C1C'>R.:</font> Budem ťa, Pane, velebiť medzi národmi.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Ochotné je moje srdce, Bože, <font color='#B71C1C'>†</font><br>" +
                            "ochotné je moje srdce; <font color='#B71C1C'>*</font><br>" +
                            "budem ti spievať a hrať.<br>" +
                            "Prebuď sa, duša moja, <font color='#B71C1C'>†</font><br>" +
                            "prebuď sa, harfa a citara, <font color='#B71C1C'>*</font><br>" +
                            "chcem zobudiť zornicu. <font color='#B71C1C'>– R.</font><br>" +
                            "Budem ťa, Pane, velebiť medzi pohanmi <font color='#B71C1C'>*</font><br>" +
                            "a zaspievam ti žalmy medzi národmi.<br>" +
                            "Lebo až po nebesia siaha tvoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a tvoja vernosť až po oblaky.<br>" +
                            "Bože, vznes sa nad nebesia <font color='#B71C1C'>*</font><br>" +
                            "a tvoja sláva nech je nad celou zemou. <font color='#B71C1C'>– R.</font>"},
            {"56", "6", "", "Ž 100, 2. 3. 5",
                    "<font color='#B71C1C'>R.:</font> Boh je náš Pán a my sme jeho ľud.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Jasaj na chválu Pánovi, celá zem, <font color='#B71C1C'>†</font><br>" +
                            "s radosťou slúžte Pánovi. <font color='#B71C1C'>*</font><br>" +
                            "S plesaním vstupujte pred jeho tvár. <font color='#B71C1C'>– R.</font><br>" +
                            "Vedzte, že náš Pán je Boh; <font color='#B71C1C'>†</font><br>" +
                            "on je náš stvoriteľ a jemu patríme, <font color='#B71C1C'>*</font><br>" +
                            "sme jeho ľud a ovce z jeho stáda. <font color='#B71C1C'>– R.</font><br>" +
                            "Lebo Pán je dobrý; <font color='#B71C1C'>†</font><br>" +
                            "jeho milosrdenstvo trvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho vernosť z pokolenia na pokolenie. <font color='#B71C1C'>– R.</font>"},
            {"60", "A", "", "Ž 66, 1-3a. 4-5. 6-7a. 16+20",
                    "<font color='#B71C1C'>R.:</font> Jasaj Bohu, celá zem.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Jasaj Bohu, celá zem; <font color='#B71C1C'>*</font><br>" +
                            "hrajte a spievajte na slávu jeho mena,<br>" +
                            "vzdávajte mu chválu. <font color='#B71C1C'>*</font><br>" +
                            "Hovorte Bohu: \"Aké úžasné sú tvoje diela. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech sa ti klania celá zem a nech ti spieva, <font color='#B71C1C'>*</font><br>" +
                            "nech ospevuje tvoje meno.\"<br>" +
                            "Poďte a pozrite na Božie diela; <font color='#B71C1C'>*</font><br>" +
                            "úžas budia skutky, ktoré koná ľuďom. <font color='#B71C1C'>– R.</font><br>" +
                            "More premieňa na suchú zem, <font color='#B71C1C'>*</font><br>" +
                            "rieku možno prejsť suchou nohou;<br>" +
                            "preto sa tešíme z neho. <font color='#B71C1C'>*</font><br>" +
                            "Svojou mocou panuje naveky. <font color='#B71C1C'>– R.</font><br>" +
                            "Poďte sem a počúvajte, všetci ctitelia Boží, <font color='#B71C1C'>*</font><br>" +
                            "vyrozprávam vám, aké veľké veci mi urobil.<br>" +
                            "Nech je zvelebený Boh, lebo neodmietol moju modlitbu <font color='#B71C1C'>*</font><br>" +
                            "a neodňal mi svoje milosrdenstvo. <font color='#B71C1C'>– R.</font>"},
            {"60", "B", "", "Ž 98, 1. 2-3b. 3c-4",
                    "<font color='#B71C1C'>R.:</font> Pred očami pohanov vyjavil Pán svoju spásu.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
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
                            "plesajte, radujte sa a hrajte. <font color='#B71C1C'>– R.</font>"},
            {"60", "C", "", "Ž 67, 2-3. 5. 6+8",
                    "<font color='#B71C1C'>R.:</font> Velebte Pána, všetky národy.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Bože, buď nám milostivý a žehnaj nás; <font color='#B71C1C'>*</font><br>" +
                            "a tvoja tvár nech žiari nad nami,<br>" +
                            "aby sa tvoja cesta stala známou na zemi <font color='#B71C1C'>*</font><br>" +
                            "a tvoja spása medzi všetkými národmi. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech sa tešia a jasajú národy, <font color='#B71C1C'>†</font><br>" +
                            "že spravodlivo súdiš ľudí <font color='#B71C1C'>*</font><br>" +
                            "a spravuješ národy na zemi. <font color='#B71C1C'>– R.</font><br>" +
                            "Bože, nech ťa velebia národy, <font color='#B71C1C'>*</font><br>" +
                            "nech ťa velebia všetky národy.<br>" +
                            "Nech nás Boh požehná <font color='#B71C1C'>*</font><br>" +
                            "a nech si ho ctia všetky končiny zeme. <font color='#B71C1C'>– R.</font>"},
            {"61", "1", "", "Ž 149, 1-2. 3-4. 5-6a+9b",
                    "<font color='#B71C1C'>R.:</font> Pán, Boh, miluje svoj ľud.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Spievajte Pánovi pieseň novú; * <br>" +
                            "jeho chvála nech znie v zhromaždení svätých. <br>" +
                            "Nech sa teší Izrael zo svojho Stvoriteľa, * <br>" +
                            "synovia Siona nech jasajú nad svojím kráľom. – R. <br>" +
                            "Nech oslavujú jeho meno tancom, * <br>" +
                            "nech mu hrajú na bubne a na citare. <br>" +
                            "Lebo Pán miluje svoj ľud * <br>" +
                            "a tichých venčí víťazstvom. – R. <br>" +
                            "Nech svätí jasajú v sláve, * <br>" +
                            "nech sa veselia na svojich lôžkach. <br>" +
                            "Oslavu Boha nech majú na perách; * <br>" +
                            "všetkým jeho svätým to bude na slávu. <font color='#B71C1C'>– R.</font>"},
            {"62", "2", "", "Ž 138, 1-2a. 2bc+3. 7c-8",
                    "<font color='#B71C1C'>R.:</font> Chráni ma tvoja pravica, Pane, Bože môj.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
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
            {"63", "3", "", "Ž 148, 1-2. 11-12. 13. 14",
                    "<font color='#B71C1C'>R.:</font> Plné sú nebo i zem tvojej slávy.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľte Pána z nebies, <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho na výsostiach.<br>" +
                            "Chváľte ho, všetci jeho anjeli; <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho, všetky nebeské mocnosti. <font color='#B71C1C'>– R.</font><br>" +
                            "Králi zeme a všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "kniežatá a všetci zemskí sudcovia,<br>" +
                            "mládenci a panny, <font color='#B71C1C'>*</font><br>" +
                            "starci a junáci <font color='#B71C1C'>– R.</font><br>" +
                            "nech chvália meno Pánovo, <font color='#B71C1C'>†</font><br>" +
                            "lebo iba jeho meno je vznešené. <font color='#B71C1C'>*</font><br>" +
                            "Jeho veleba prevyšuje zem i nebesia <font color='#B71C1C'>– R.</font><br>" +
                            "a svojmu ľudu dáva veľkú moc. <font color='#B71C1C'>†</font><br>" +
                            "Je chválou všetkým svojim svätým, <font color='#B71C1C'>*</font><br>" +
                            "synom Izraela, ľudu, ktorý je mu blízky. <font color='#B71C1C'>– R.</font>"},
            {"64", "4", "", "Ž 98, 1. 2-3b. 3c-4 ",
                    "<font color='#B71C1C'>R.:</font> Pred očami pohanov vyjavil Pán svoju spásu. <br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Spievajte Pánovi pieseň novú, * <br>" +
                            "lebo vykonal veci zázračné. <br>" +
                            "Víťazstvo je dielom jeho pravice * <br>" +
                            "a jeho svätého ramena. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán oznámil svoju spásu, * <br>" +
                            "pred očami pohanov vyjavil svoju spravodlivosť. <br>" +
                            "Rozpamätal sa na svoju dobrotu * <br>" +
                            "a na svoju vernosť voči Izraelovmu domu. <font color='#B71C1C'>– R.</font><br>" +
                            "Uzreli všetky končiny zeme * <br>" +
                            "spásu nášho Boha. <br>" +
                            "Na chválu Božiu jasaj, celá zem; * <br>" +
                            "plesajte, radujte sa a hrajte. <font color='#B71C1C'>– R.</font>"},
            {"65", "5", "", "Ž 47, 2-3. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Boh je kráľom celej zeme, spievajme mu chválospev.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Tlieskajte rukami, všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "jasajte Bohu hlasom radostným.<br>" +
                            "Lebo Pán je Najvyšší a hrozný, <font color='#B71C1C'>*</font><br>" +
                            "nad celou zemou veľký kráľ. <font color='#B71C1C'>– R.</font><br>" +
                            "Podmaňuje nám národy <font color='#B71C1C'>*</font><br>" +
                            "a pohanov nám kladie pod nohy.<br>" +
                            "On pre nás vybral dedičstvo, <font color='#B71C1C'>*</font><br>" +
                            "slávu Jakuba, ktorého má rád. <font color='#B71C1C'>– R.</font><br>" +
                            "Za jasotu vystupuje Boh, <font color='#B71C1C'>*</font><br>" +
                            "Pán vystupuje za hlaholu poľnice.<br>" +
                            "Spievajte Bohu, spievajte, <font color='#B71C1C'>*</font><br>" +
                            "spievajte nášmu kráľovi, spievajte. <font color='#B71C1C'>– R.</font>"},
            {"66", "6", "", "Ž 47, 2-3. 8-9. 10",
                    "<font color='#B71C1C'>R.:</font> Boh je kráľom celej zeme, spievajme mu chválospev.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Tlieskajte rukami, všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "jasajte Bohu hlasom radostným.<br>" +
                            "Lebo Pán je Najvyšší a hrozný, <font color='#B71C1C'>*</font><br>" +
                            "nad celou zemou veľký kráľ. <font color='#B71C1C'>– R.</font><br>" +
                            "Pretože Boh je kráľom celej zeme; <font color='#B71C1C'>*</font><br>" +
                            "spievajte mu chválospev.<br>" +
                            "Boh kraľuje nad národmi, <font color='#B71C1C'>*</font><br>" +
                            "Boh sedí na svojom svätom tróne. <font color='#B71C1C'>– R.</font><br>" +
                            "Kniežatá národov sa spolčujú <font color='#B71C1C'>*</font><br>" +
                            "s národom Boha Abrahámovho.<br>" +
                            "Veď Bohu patria mocní zeme, <font color='#B71C1C'>*</font><br>" +
                            "tak veľmi je vyvýšený. <font color='#B71C1C'>– R.</font>"},
            {"70", "A", "", "Ž 27, 1. 4. 7-8a",
                    "<font color='#B71C1C'>R.:</font> Verím, že uvidím dobrodenia Pánove v krajine žijúcich.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Pán je moje svetlo a moja spása, <font color='#B71C1C'>*</font><br>" +
                            "koho sa mám báť?<br>" +
                            "Pán je ochranca môjho života, <font color='#B71C1C'>*</font><br>" +
                            "pred kým sa mám strachovať? <font color='#B71C1C'>– R.</font><br>" +
                            "O jedno prosím Pána a za tým túžim, <font color='#B71C1C'>†</font><br>" +
                            "aby som mohol bývať v dome Pánovom <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni svojho života,<br>" +
                            "aby som pociťoval nehu Pánovu <font color='#B71C1C'>*</font><br>" +
                            "a obdivoval jeho chrám. <font color='#B71C1C'>– R.</font><br>" +
                            "Čuj, Pane, hlas môjho volania, <font color='#B71C1C'>*</font><br>" +
                            "zľutuj sa nado mnou a vyslyš ma.<br>" +
                            "V srdci mi znejú tvoje slová: <font color='#B71C1C'>*</font><br>" +
                            "\"Hľadajte moju tvár!\" <font color='#B71C1C'>– R.</font>"},
            {"70", "B", "", "Ž 103, 1-2. 11-12. 19-20",
                    "<font color='#B71C1C'>R.:</font> Dobrorečte Pánovi, čo má trón v nebesiach.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia. <font color='#B71C1C'>– R.</font><br>" +
                            "Lebo ako vysoko je nebo od zeme, <font color='#B71C1C'>*</font><br>" +
                            "také veľké je jeho zľutovanie voči tým, čo sa ho boja.<br>" +
                            "Ako je vzdialený východ od západu, <font color='#B71C1C'>*</font><br>" +
                            "tak vzďaľuje od nás našu neprávosť. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán si pripravil trón v nebesiach; <font color='#B71C1C'>*</font><br>" +
                            "kraľuje a panuje nad všetkými.<br>" +
                            "Dobrorečte Pánovi, všetci jeho anjeli, <font color='#B71C1C'>*</font><br>" +
                            "udatní hrdinovia, čo plníte jeho príkazy. <font color='#B71C1C'>– R.</font>"},
            {"70", "C", "", "Ž 97, 1+2b. 6+7c. 9",
                    "<font color='#B71C1C'>R.:</font> Pán kraľuje, Najvyšší na celej zemi.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Pán kraľuje, jasaj, zem; <font color='#B71C1C'>†</font><br>" +
                            "radujte sa, všetky ostrovy. <font color='#B71C1C'>*</font><br>" +
                            "Spravodlivosť a právo sú základom jeho trónu. <font color='#B71C1C'>– R.</font><br>" +
                            "Jeho spravodlivosť ohlasujú nebesia <font color='#B71C1C'>†</font><br>" +
                            "a jeho slávu vidia všetky národy. <font color='#B71C1C'>*</font><br>" +
                            "Klaňajte sa mu, všetci jeho anjeli. <font color='#B71C1C'>– R.</font><br>" +
                            "Lebo ty, Pane, si Najvyšší na celej zemi, <font color='#B71C1C'>*</font><br>" +
                            "nesmierne prevyšuješ všetky božstvá. <font color='#B71C1C'>– R.</font>"},
            {"71", "1", "", "Ž 68, 2-3. 4-5ac. 6-7b",
                    "<font color='#B71C1C'>R.:</font> Spievajme nášmu Pánovi hlasom radostným.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Boh vstáva a jeho nepriatelia sa tratia, <font color='#B71C1C'>*</font><br>" +
                            "spred jeho tváre utekajú tí, čo ho nenávidia.<br>" +
                            "Ako sa rozplýva dym, tak ich rozháňa; <font color='#B71C1C'>†</font><br>" +
                            "ako sa vosk roztápa ohňom, <font color='#B71C1C'>*</font><br>" +
                            "tak spred Božej tváre miznú hriešnici. <font color='#B71C1C'>– R.</font><br>" +
                            "Ale spravodliví sa môžu tešiť a jasať pred Božou tvárou <font color='#B71C1C'>*</font><br>" +
                            "a v radosti sa veseliť.<br>" +
                            "Spievajte Bohu a jeho meno žalmom velebte: <font color='#B71C1C'>*</font><br>" +
                            "jeho meno je Pán. <font color='#B71C1C'>– R.</font><br>" +
                            "On je otec sirôt a záchranca vdov, <font color='#B71C1C'>*</font><br>" +
                            "on je Boh vo svojom svätom príbytku.<br>" +
                            "On je Boh, čo opusteným dáva prebývať v domoch, <font color='#B71C1C'>*</font><br>" +
                            "väzňov privádza k šťastiu. <font color='#B71C1C'>– R.</font>"},
            {"72", "2", "", "Ž 68, 10-11. 20-21",
                    "<font color='#B71C1C'>R.:</font> Spievajme nášmu Pánovi hlasom radostným.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Zoslal si, Bože, zúrodňujúci dážď <font color='#B71C1C'>*</font><br>" +
                            "a vzpružil si svoju ochabnutú krajinu.<br>" +
                            "Prebývajú v nej tvoje tvory, <font color='#B71C1C'>*</font><br>" +
                            "pre chudobného si ju pripravil vo svojej dobrote, Bože. <font color='#B71C1C'>– R.</font><br>" +
                            "Nech je velebený Pán deň čo deň; <font color='#B71C1C'>*</font><br>" +
                            "nesie nás Boh, naša spása.<br>" +
                            "Náš Boh je Boh spásy, <font color='#B71C1C'>*</font><br>" +
                            "on je Pán, čo zo smrti dáva uniknúť. <font color='#B71C1C'>– R.</font>"},
            {"73", "3", "", "Ž 68, 29-30. 33-35a. 35bc+36c",
                    "<font color='#B71C1C'>R.:</font> Spievajme nášmu Pánovi hlasom radostným.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Prejav, Bože, svoju moc, <font color='#B71C1C'>*</font><br>" +
                            "upevni, Bože, čo si v nás vykonal.<br>" +
                            "Nech pre tvoj chrám v Jeruzaleme <font color='#B71C1C'>*</font><br>" +
                            "králi prinášajú dary. <font color='#B71C1C'>– R.</font><br>" +
                            "Spievajte Bohu, zemské kráľovstvá, <font color='#B71C1C'>†</font><br>" +
                            "na harfách hrajte Pánovi, hrajteže Bohu, <font color='#B71C1C'>*</font><br>" +
                            "čo sa nesie na odvekých nebesiach k východu;<br>" +
                            "hľa, dvíha svoj hlas, svoj mocný hlas. <font color='#B71C1C'>*</font><br>" +
                            "Uznajte Božiu moc. <font color='#B71C1C'>– R.</font><br>" +
                            "Nad Izraelom jeho veleba <font color='#B71C1C'>†</font><br>" +
                            "a jeho moc až nad oblaky. <font color='#B71C1C'>*</font><br>" +
                            "Zvelebený buď, Bože. <font color='#B71C1C'>– R.</font>"},
            {"74", "4", "", "Ž 16, 1-2a+5. 7-8. 9-10. 11",
                    "<font color='#B71C1C'>R.:</font> Ochráň ma, Bože, k tebe sa utiekam.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Ochráň ma, Bože, k tebe sa utiekam. <font color='#B71C1C'>*</font><br>" +
                            "Hovorím Pánovi: \"Ty si môj Pán.\"<br>" +
                            "Ty, Pane, si môj podiel na dedičstve a na kalichu, <font color='#B71C1C'>*</font><br>" +
                            "v tvojich rukách je môj osud. <font color='#B71C1C'>– R.</font><br>" +
                            "Velebím Pána, čo ma múdrosťou obdaril; <font color='#B71C1C'>*</font><br>" +
                            "v noci ma k tomu moje srdce vyzýva.<br>" +
                            "Pána mám vždy pred očami; <font color='#B71C1C'>*</font><br>" +
                            "a pretože je po mojej pravici, nezakolíšem sa. <font color='#B71C1C'>– R.</font><br>" +
                            "Preto sa raduje moje srdce <font color='#B71C1C'>†</font><br>" +
                            "a moja duša plesá <font color='#B71C1C'>*</font><br>" +
                            "aj moje telo odpočíva v nádeji.<br>" +
                            "Lebo nenecháš moju dušu v podsvetí <font color='#B71C1C'>*</font><br>" +
                            "a nedovolíš, aby tvoj svätý videl porušenie. <font color='#B71C1C'>– R.</font><br>" +
                            "Ukážeš mi cestu života. <font color='#B71C1C'>†</font><br>" +
                            "U teba je plnosť radosti, <font color='#B71C1C'>*</font><br>" +
                            "po tvojej pravici večná slasť. <font color='#B71C1C'>– R.</font>"},
            {"75", "5", "", "Ž 103, 1-2. 11-12. 19-20",
                    "<font color='#B71C1C'>R.:</font> Dobrorečte Pánovi, čo má trón v nebesiach.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia. <font color='#B71C1C'>– R.</font><br>" +
                            "Lebo ako vysoko je nebo od zeme, <font color='#B71C1C'>*</font><br>" +
                            "také veľké je jeho zľutovanie voči tým, čo sa ho boja.<br>" +
                            "Ako je vzdialený východ od západu, <font color='#B71C1C'>*</font><br>" +
                            "tak vzďaľuje od nás našu neprávosť. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán si pripravil trón v nebesiach; <font color='#B71C1C'>*</font><br>" +
                            "kraľuje a panuje nad všetkými.<br>" +
                            "Dobrorečte Pánovi, všetci jeho anjeli, <font color='#B71C1C'>*</font><br>" +
                            "udatní hrdinovia, čo plníte jeho príkazy. <font color='#B71C1C'>– R.</font>"},
            {"76", "6", "", "Ž 11, 4. 5+7",
                    "<font color='#B71C1C'>R.:</font> Pán tróni na nebesiach; statoční uvidia jeho tvá<font color='#B71C1C'>– R.</font><br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Pán prebýva vo svojom svätom chráme, <font color='#B71C1C'>*</font><br>" +
                            "Pán tróni na nebesiach.<br>" +
                            "Jeho oči hľadia na úbožiaka, <font color='#B71C1C'>*</font><br>" +
                            "jeho zrak skúma každého človeka. <font color='#B71C1C'>– R.</font><br>" +
                            "Pán skúma spravodlivého i hriešnika <font color='#B71C1C'>*</font><br>" +
                            "a nenávidí toho, čo miluje neprávosť.<br>" +
                            "Lebo Pán je spravodlivý a miluje spravodlivosť; <font color='#B71C1C'>*</font><br>" +
                            "statoční uvidia jeho tvár. <font color='#B71C1C'>– R.</font>"},
    };

    String[][] velkanocAleluja = {
            {"10", "A", "", "Porov. 1 Kor 5, 7b-8a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kristus, náš veľkonočný Baránok, bol obetovaný. Preto slávme sviatky v Pánovi. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"10", "B", "", "Porov. 1 Kor 5, 7b-8a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kristus, náš veľkonočný Baránok, bol obetovaný. Preto slávme sviatky v Pánovi. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"10", "C", "", "Porov. 1 Kor 5, 7b-8a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kristus, náš veľkonočný Baránok, bol obetovaný. Preto slávme sviatky v Pánovi. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"11", "1", "", "Ž118, 24", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Toto je deň, ktorý učinil Pán, plesajme a radujme sa z neho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"12", "2", "", "Ž118, 24", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Toto je deň, ktorý učinil Pán, plesajme a radujme sa z neho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"13", "3", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Toto je deň, ktorý učinil Pán, plesajme a radujme sa z neho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"14", "4", "", "Ž118, 24", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Toto je deň, ktorý učinil Pán, plesajme a radujme sa z neho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"15", "5", "", "Ž 118, 24 ", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Toto je deň, ktorý učinil Pán, plesajme a radujme sa z neho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"16", "6", "", "Ž118, 24", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Toto je deň, ktorý učinil Pán, plesajme a radujme sa z neho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"20", "A", "", "Jn 20, 29", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tomáš, uveril si, pretože si ma videl, hovorí Pán; blahoslavení tí, čo nevideli, a uverili. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"20", "B", "", "Jn 20, 29", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tomáš, uveril si, pretože si ma videl, hovorí Pán; blahoslavení tí, čo nevideli, a uverili. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"20", "C", "", "Jn 20, 29", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tomáš, uveril si, pretože si ma videl, hovorí Pán; blahoslavení tí, čo nevideli, a uverili. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"21", "2", "", "Kol 3, 1", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ak ste s Kristom vstali z mŕtvych, hľadajte, čo je hore, kde Kristus sedí po pravici Boha! <font color='#B71C1C'>– R.</font> Aleluja."},
            {"22", "3", "", "Jn 3, 14b-15", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Syn človeka musí byť vyzdvihnutý, aby každý, kto verí, mal v ňom večný život. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"23", "3", "", "Porov. Jn 3, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Boh tak miloval svet, že dal svojho jednorodeného Syna; každý, kto v neho verí, má večný život. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"24", "4", "", "Jn 20, 29", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tomáš, uveril si, pretože si ma videl, hovorí Pán; blahoslavení tí, čo nevideli, a uverili. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"25", "5", "", "Mt 4, 4b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nielen z chleba žije človek, ale z každého slova, ktoré vychádza z Božích úst. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"26", "6", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vstal z mŕtvych Kristus, tvorca všetkého, a zmiloval sa nad ľudským pokolením. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "A", "", "Porov. Lk 24, 32", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pane Ježišu, otvor nám Písma; daj, nech naše srdce horí, keď k nám hovoríš. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "B", "", "Porov. Lk 24, 32", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pane Ježišu, otvor nám Písma; daj, nech naše srdce horí, keď k nám hovoríš. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "C", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vstal z mŕtvych Kristus, tvorca všetkého, a zmiloval sa nad ľudským pokolením. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"31", "1", "", "Mt 4, 4b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nielen z chleba žije človek, ale z každého slova, ktoré vychádza z Božích úst. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"32", "2", "", "Jn 6, 35ab", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som chlieb života, hovorí Pán; kto prichádza ku mne, nikdy nebude hladovať. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"33", "3", "", "Porov. Jn 6, 40", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Každý, kto verí vo mňa, má večný život a ja ho vzkriesim v posledný deň, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"34", "4", "", "Jn 6, 51 ab", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som živý chlieb, ktorý zostúpil z neba, hovorí Pán; kto bude jesť z tohoto chleba, bude žiť naveky. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"35", "5", "", "Jn 6, 56", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto je moje telo a pije moju krv, ostáva vo mne a ja v ňom, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"36", "6", "", " Porov. Jn 6, 63. 68", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje slová, Pane, sú Duch a život. Ty máš slová večného života. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"40", "A", "", "Jn 10, 14", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som dobrý pastier, hovorí Pán; poznám svoje ovce a moje poznajú mňa. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"40", "B", "", "Jn 10, 14", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som dobrý pastier, hovorí Pán; Poznám svoje ovce a moje poznajú mňa. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"40", "C", "", "Jn 10, 14", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som dobrý pastier, hovorí Pán; Poznám svoje ovce a moje poznajú mňa. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"41", "1", "", "Jn 10, 14", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som dobrý pastier, hovorí Pán; Poznám svoje ovce a moje poznajú mňa. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"42", "2", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"43", "3", "", "Jn 8, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som svetlo sveta, hovorí Pán; kto mňa nasleduje, bude mať svetlo života. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"44", "4", "", "Porov. Zjv 1, 5", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježišu Kriste, ty si verný svedok, prvorodený z mŕtvych; ty nás miluješ a svojou krvou si nás oslobodil od hriechov. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"45", "5", "", "Jn 14, 6", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som cesta, pravda a život, hovorí Pán; nik nepríde k Otcovi, iba cezo mňa. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"46", "6", "", "Jn 8, 31b-32b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ak ostanete v mojom slove, budete naozaj mojimi učeníkmi a poznáte pravdu, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"50", "A", "", "Jn 14, 6", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som cesta, pravda a život, hovorí Pán; nik nepríde k Otcovi, iba cezo mňa. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"50", "B", "", "Jn 15, 4a. 5b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ostaňte vo mne a ja vo vás, hovorí Pán; kto ostáva vo mne, prináša veľa ovocia. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"50", "C", "", "Jn 13, 34", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nové prikázanie vám dávam, hovorí Pán; aby ste sa milovali navzájom, ako som ja miloval vás. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"51", "1", "", "Jn 14, 26", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Duch Svätý vás naučí všetko a pripomenie vám všetko, čo som vám povedal. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"52", "2", "", "Porov. Lk 24, 26", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Mesiáš musel trpieť a vstať z mŕtvych, a tak vojsť do svojej slávy. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"53", "3", "", "Jn 15, 4a. 5b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ostaňte vo mne a ja vo vás, hovorí Pán; kto ostáva vo mne, prináša veľa ovocia. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"54", "4", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"55", "5", "", "Jn 15, 15b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nazval som vás priateľmi, hovorí Pán; pretože som vám oznámil všetko, čo som počul od svojho Otca. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"56", "6", "", "Kol 3, 1", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ak ste s Kristom vstali z mŕtvych, hľadajte, čo je hore, kde Kristus sedí po pravici Boha! <font color='#B71C1C'>– R.</font> Aleluja."},
            {"60", "A", "", "Jn 14, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto ma miluje, bude zachovávať moje slovo, hovorí Pán; a môj Otec ho bude milovať a prídeme k nemu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"60", "B", "", "Jn 14, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto ma miluje, bude zachovávať moje slovo, hovorí Pán; a môj Otec ho bude milovať a prídeme k nemu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"60", "C", "", "Jn 14, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto ma miluje, bude zachovávať moje slovo, hovorí Pán; a môj Otec ho bude milovať a prídeme k nemu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"61", "1", "", "Jn 15, 26b-27a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Duch pravdy vydá o mne svedectvo, hovorí Pán; aj vy vydávate svedectvo. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"62", "2", "", "Porov. Jn 16, 7. 13", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pošlem vám Ducha pravdy, hovorí Pán; on vás uvedie do plnej pravdy. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"63", "3", "", "Jn 14, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Poprosím Otca a on vám dá iného Tešiteľa, aby zostal s vami naveky. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"64", "4", "", "Porov. Jn 14, 18; 16, 22", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nenechám vás ako siroty, hovorí Pán; odchádzam, ale prídem k vám a vaše srdce sa bude radovať. – R. Aleluja"},
            {"65", "5", "", "Porov. Lk 24, 26", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Mesiáš musel trpieť a vstať z mŕtvych, a tak vojsť do svojej slávy. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"66", "6", "", "Ž 47, 2-3. 8-9. 10", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vyšiel som od Otca a prišiel som na svet; a zasa opúšťam svet a idem k Otcovi. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"70", "A", "", "Porov. Jn 14, 18; 16, 22", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nenechám vás ako siroty, hovorí Pán; odchádzam, ale prídem k vám a vaše srdce sa bude radovať. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"70", "B", "", "Porov. Jn 14, 18; 16, 22", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nenechám vás ako siroty, hovorí Pán; odchádzam, ale prídem k vám a vaše srdce sa bude radovať. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"70", "C", "", "Porov. Jn 14, 18; 16, 22", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nenechám vás ako siroty, hovorí Pán; odchádzam, ale prídem k vám a vaše srdce sa bude radovať. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"71", "1", "", "Kol 3, 1", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ak ste s Kristom vstali z mŕtvych, hľadajte, čo je hore, kde Kristus sedí po pravici Boha! <font color='#B71C1C'>– R.</font> Aleluja."},
            {"72", "2", "", "Jn 14, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Poprosím Otca a on vám dá iného Tešiteľa, aby zostal s vami naveky. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"73", "3", "", "Porov. Jn 17, 17", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje slovo, Pane, je pravda; posväť nás pravdou. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"74", "4", "", "Jn 17, 21", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Aby všetci boli jedno, ako ty, Otče, vo mne a ja v tebe, aby svet uveril, že si ma ty poslal, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"75", "5", "", "Jn 14, 26", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Duch Svätý vás naučí všetko a pripomenie vám všetko, čo som vám povedal. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"76", "6", "", "Porov. Jn 16, 7. 13", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pošlem vám Ducha pravdy, hovorí Pán; on vás uvedie do plnej pravdy. <font color='#B71C1C'>– R.</font> Aleluja."},
    };
}
