package sk.missa.interfaces;

/*
 * Responzóziové žalmy v cezročnom období uložené v dvojrozmernom poli: cezrokZalm
 * nedeľa: {týždeň v cezročnom období, liturgický rok (A/B/C), "", súradnice, text},
 * deň v týždni: {týždeň v cezročnom období, deň v týždni (1-pondelok, 2-utorok..., 6-sobota), cyklus (1/2), súradnice, text},
 * žalm, ktorý obsahuje alebo: {týždeň v cezročnom období, deň v týždni (1-pondelok, 2-utorok..., 6-sobota, cyklus (1/2), súradnice, text, "Alebo:", súradnice, text...},
 *
 * Alelujové verše v cezročnom období uložené v dvojrozmernom poli: cezrokAleluja
 * nedeľa: {týždeň v cezročnom období, liturgický rok (A/B/C), "", súradnice, text},
 * deň v týždni: {týždeň v cezročnom období, deň v týždni (1-pondelok, 2-utorok..., 6-sobota), "", súradnice, text},
 * */


public interface Zalmy_cezrok {
    String[][] cezrokZalm = {
            {"1", "A", "", "", ""},
            {"1", "B", "", "", ""},
            {"1", "C", "", "", ""},
            {"1", "1", "1", "Ž 97, 1+2b. 6+7c. 9",
                    "<font color='#B71C1C'>R.:</font> Klaňajme sa Bohu spolu s jeho anjelmi.<br><br>" +
                            "Pán kraľuje, jasaj, zem; <font color='#B71C1C'>†</font><br>" +
                            "radujte sa, všetky ostrovy. <font color='#B71C1C'>*</font><br>" +
                            "Spravodlivosť a právo sú základom jeho trónu.<font color='#B71C1C'> – R.</font><br>" +
                            "Jeho spravodlivosť ohlasujú nebesia <font color='#B71C1C'>†</font><br>" +
                            "a jeho slávu vidia všetky národy. <font color='#B71C1C'>*</font><br>" +
                            "Klaňajte sa mu, všetci jeho anjeli.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo ty, Pane, si Najvyšší na celej zemi, <font color='#B71C1C'>*</font><br>" +
                            "nesmierne prevyšuješ všetky božstvá.<font color='#B71C1C'> – R.</font>"},
            {"1", "1", "2", "Ž 116, 12-13. 14+17. 18-19",
                    "<font color='#B71C1C'>R.:</font> Obetu chvály ti, Pane, prinesiem.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Čím sa odvďačím Pánovi <font color='#B71C1C'>*</font><br>" +
                            "za všetko, čo mi dal?<br>" +
                            "Vezmem kalich spásy <font color='#B71C1C'>*</font><br>" +
                            "a budem vzývať meno Pánovo.<font color='#B71C1C'> – R.</font><br>" +
                            "Pánovi splním svoje sľuby <font color='#B71C1C'>*</font><br>" +
                            "pred všetkým jeho ľudom.<br>" +
                            "Obetu chvály ti prinesiem <font color='#B71C1C'>*</font><br>" +
                            "a budem vzývať meno Pánovo.<font color='#B71C1C'> – R.</font><br>" +
                            "Splním svoje sľuby Pánovi <font color='#B71C1C'>*</font><br>" +
                            "pred všetkým jeho ľudom<br>" +
                            "v nádvoriach domu Pánovho <font color='#B71C1C'>*</font><br>" +
                            "uprostred teba, Jeruzalem.<font color='#B71C1C'> – R.</font>"},
            {"1", "2", "1", "Ž 8, 2a+5. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Svojho Syna si ustanovil za vládcu nad dielami svojich rúk.<br><br>" +
                            "Pane, náš Vládca, <font color='#B71C1C'>*</font><br>" +
                            "aké vznešené je tvoje meno na celej zemi!<br>" +
                            "Čože je človek, že naň pamätáš, <font color='#B71C1C'>*</font><br>" +
                            "a syn človeka, že sa ho ujímaš?<font color='#B71C1C'> – R.</font><br>" +
                            "Stvoril si ho len o niečo menšieho od anjelov, <font color='#B71C1C'>*</font><br>" +
                            "slávou a cťou si ho ovenčil.<br>" +
                            "a ustanovil si ho za vládcu nad dielami tvojich rúk. <font color='#B71C1C'>*</font><br>" +
                            "všetko si mu položil pod nohy:<font color='#B71C1C'> – R.</font><br>" +
                            "ovce a všetok domáci statok <font color='#B71C1C'>*</font><br>" +
                            "aj všetku poľnú zver,<br>" +
                            "vtáctvo pod oblohou a ryby v mori <font color='#B71C1C'>*</font><br>" +
                            "i všetko, čo sa hýbe po dne morskom.<font color='#B71C1C'> – R.</font>"},
            {"1", "2", "2", "1 Sam 2, 1b-e. 4-5. 6-7. 8a-d",
                    "<font color='#B71C1C'>R.:</font> Srdce mi plesá v mojom Bohu.<br><br>" +
                            "Srdce mi plesá v Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "v mojom Bohu rastie moja sila.<br>" +
                            "Otvorím si ústa proti mojim nepriateľom, <font color='#B71C1C'>*</font><br>" +
                            "lebo sa radujem z tvojej pomoci.<font color='#B71C1C'> – R.</font><br>" +
                            "Luk silákov sa zlomil, <font color='#B71C1C'>*</font><br>" +
                            "slabí sa opásali silou.<br>" +
                            "Tí, čo boli sýti, dávajú sa prenajímať za chlieb, <font color='#B71C1C'>*</font><br>" +
                            "no tí, čo hladovali, už nepoznajú núdzu.<br>" +
                            "Neplodná rodí mnoho ráz <font color='#B71C1C'>*</font><br>" +
                            "a tá, čo má veľa detí, vädne.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán dáva smrť i život, <font color='#B71C1C'>*</font><br>" +
                            "uvádza do ríše smrti a vyvádza naspäť.<br>" +
                            "Pán dáva schudobnieť, ale aj zbohatnúť, <font color='#B71C1C'>*</font><br>" +
                            "ponižuje aj vyvyšuje.<font color='#B71C1C'> – R.</font><br>" +
                            "Dvíha z prachu bedára <font color='#B71C1C'>*</font><br>" +
                            "a zo smetiska povyšuje chudobného.<br>" +
                            "Usádza ho medzi kniežatá <font color='#B71C1C'>*</font><br>" +
                            "a dáva mu trón slávy.<font color='#B71C1C'> – R.</font>"},
            {"1", "3", "1", "Ž 105, 1-2. 3-4. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pán večne pamätá na svoju zmluvu.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána a vzývajte jeho meno, <font color='#B71C1C'>*</font><br>" +
                            "rozhlasujte jeho skutky medzi národmi.<br>" +
                            "Spievajte mu a hrajte, <font color='#B71C1C'>*</font><br>" +
                            "rozprávajte o jeho obdivuhodných skutkoch.<font color='#B71C1C'> – R.</font><br>" +
                            "Jeho svätým menom sa honoste; <font color='#B71C1C'>*</font><br>" +
                            "nech sa radujú srdcia tých, čo hľadajú Pána.<br>" +
                            "Hľadajte Pána a jeho moc, <font color='#B71C1C'>*</font><br>" +
                            "hľadajte vždy jeho tvár,<font color='#B71C1C'> – R.</font><br>" +
                            "vy, potomci Abraháma, Pánovho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "synovia Jakuba, vyvoleného Pánovho.<br>" +
                            "On, Pán, je náš Boh; <font color='#B71C1C'>*</font><br>" +
                            "jeho rozhodnutia platia po celej zemi.<font color='#B71C1C'> – R.</font><br>" +
                            "Večne pamätá na svoju zmluvu, <font color='#B71C1C'>*</font><br>" +
                            "na sľub, ktorý dal pokoleniam tisícim,<br>" +
                            "na zmluvu, čo s Abrahámom uzavrel, <font color='#B71C1C'>*</font><br>" +
                            "na prísahu, ktorou sa Izákovi zaviazal.<font color='#B71C1C'> – R.</font>"},
            {"1", "3", "2", "Ž 40, 2+5. 7-8a. 8b-9. 10",
                    "<font color='#B71C1C'>R.:</font> Hľa, prichádzam, Pane, chcem plniť tvoju vôľu.<br><br>" +
                            "Čakal som, čakal na Pána <font color='#B71C1C'>*</font><br>" +
                            "a on sa ku mne sklonil.<br>" +
                            "Blažený človek, čo v Pána skladá dôveru <font color='#B71C1C'>*</font><br>" +
                            "a nevšíma si pyšných ani náchylných klamať.<font color='#B71C1C'> – R.</font><br>" +
                            "Obety a dary si nepraješ, <font color='#B71C1C'>*</font><br>" +
                            "lež uši si mi otvoril.<br>" +
                            "Nežiadaš žertvu ani obetu zmierenia, <font color='#B71C1C'>*</font><br>" +
                            "preto som povedal: \"Hľa, prichádzam.<font color='#B71C1C'> – R.</font><br>" +
                            "Vo zvitku knihy je napísané o mne, <font color='#B71C1C'>*</font><br>" +
                            "že mám plniť tvoju vôľu.<br>" +
                            "A to chcem, Bože môj, <font color='#B71C1C'>*</font><br>" +
                            "hlboko v srdci mám tvoj zákon.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Ohlasujem tvoju spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "vo veľkom zhromaždení;<br>" +
                            "svojim perám hovoriť nebránim, <font color='#B71C1C'>*</font><br>" +
                            "Pane, ty to vieš.<font color='#B71C1C'> – R.</font>"},
            {"1", "4", "1", "Ž 95, 6-7. 8-9. 10-11",
                    "<font color='#B71C1C'>R.:</font> Pane, daj, aby sme počúvali tvoj hlas a nezatvrdzovali si srdcia.<br><br>" +
                            "Poďte, klaňajme sa a na zem padnime, <font color='#B71C1C'>*</font><br>" +
                            "kľaknime na kolená pred Pánom, ktorý nás stvoril.<br>" +
                            "Lebo on je náš Boh <font color='#B71C1C'>†</font><br>" +
                            "a my sme ľud jeho pastviny <font color='#B71C1C'>*</font><br>" +
                            "a ovce, ktoré vedie svojou rukou.<font color='#B71C1C'> – R.</font><br>" +
                            "Čujte dnes jeho hlas: <font color='#B71C1C'>†</font><br>" +
                            "\"Nezatvrdzujte svoje srdcia <font color='#B71C1C'>*</font><br>" +
                            "ako v Meríbe, ako v dňoch Massy na púšti,<br>" +
                            "kde ma pokúšali vaši otcovia; <font color='#B71C1C'>*</font><br>" +
                            "skúšali ma, hoci moje skutky videli.<font color='#B71C1C'> – R.</font><br>" +
                            "Štyridsať rokov sa mi priečilo toto pokolenie <font color='#B71C1C'>*</font><br>" +
                            "i povedal som: Je to ľud s blúdiacim srdcom;<br>" +
                            "tí veru moje cesty neznajú. <font color='#B71C1C'>†</font><br>" +
                            "Preto som v svojom hneve prisahal: <font color='#B71C1C'>*</font><br>" +
                            "Nevojdú do môjho pokoja.\"<font color='#B71C1C'> – R.</font>"},
            {"1", "4", "2", "Ž 44, 10-11. 14-15. 24-25",
                    "<font color='#B71C1C'>R.:</font> Vykúp nás, Pane, veď si milosrdný.<br><br>" +
                            "Teraz si nás zavrhol a zahanbil, <font color='#B71C1C'>*</font><br>" +
                            "už netiahneš, Bože, s našimi vojmi.<br>" +
                            "Zahnal si nás na útek pred našimi nepriateľmi <font color='#B71C1C'>*</font><br>" +
                            "a sme korisťou tých, čo nás nenávidia.<font color='#B71C1C'> – R.</font><br>" +
                            "Vystavil si nás na potupu susedom <font color='#B71C1C'>*</font><br>" +
                            "a na posmech i pohanu nášmu okoliu.<br>" +
                            "Urobil si z nás príslovie pre pohanov <font color='#B71C1C'>*</font><br>" +
                            "a národy krútia hlavou nad nami.<font color='#B71C1C'> – R.</font><br>" +
                            "Prebuď sa, Pane, prečo spíš? <font color='#B71C1C'>*</font><br>" +
                            "Vstaň a nezavrhni nás navždy.<br>" +
                            "Prečo odvraciaš svoju tvár? <font color='#B71C1C'>*</font><br>" +
                            "Vari môžeš zabudnúť na našu biedu a naše súženie?<font color='#B71C1C'> – R.</font>"},
            {"1", "5", "1", "Ž 78, 3+4bc. 6c-7. 8",
                    "<font color='#B71C1C'>R.:</font> Nezabúdajme na Božie diela.<br><br>" +
                            "Čo sme počuli a poznali <font color='#B71C1C'>*</font><br>" +
                            "a čo nám rozprávali naši otcovia,<br>" +
                            "ďalším pokoleniam vyrozprávame <font color='#B71C1C'>*</font><br>" +
                            "slávne a mocné skutky Pánove<br>" +
                            "a zázraky, ktoré urobil.<font color='#B71C1C'> – R.</font><br>" +
                            "Oni prídu a vyrozprávajú svojim deťom, <font color='#B71C1C'>*</font><br>" +
                            "aby svoju dôveru vkladali v Boha,<br>" +
                            "aby nezabúdali na Božie diela <font color='#B71C1C'>*</font><br>" +
                            "a zachovávali jeho príkazy;<font color='#B71C1C'> – R.</font><br>" +
                            "aby neboli ako ich otcovia, <font color='#B71C1C'>*</font><br>" +
                            "vzdorné a zatvrdlivé pokolenie,<br>" +
                            "pokolenie nestáleho srdca, <font color='#B71C1C'>*</font><br>" +
                            "ktorého duch nebol verný Bohu.<font color='#B71C1C'> – R.</font>"},
            {"1", "5", "2", "Ž 89, 16-17. 18-19",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, ospevovať budem naveky.<br><br>" +
                            "Blažený ľud, ktorý vie jasať! <font color='#B71C1C'>*</font><br>" +
                            "Kráča vo svetle tvojej tváre, Pane;<br>" +
                            "deň čo deň sa raduje z tvojho mena <font color='#B71C1C'>*</font><br>" +
                            "a honosí sa tvojou spravodlivosťou.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo ty si jeho sila a nádhera <font color='#B71C1C'>*</font><br>" +
                            "a tvojou priazňou sa dvíha naša moc.<br>" +
                            "Veď náš vladár patrí Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a náš kráľ Izraelovmu Svätému.<font color='#B71C1C'> – R.</font>"},
            {"1", "6", "1", "Ž 19, 8. 9. 10. 15",
                    "<font color='#B71C1C'>R.:</font> Tvoje slová, Pane, sú Duch a život.<br><br>" +
                            "Zákon Pánov je dokonalý, <font color='#B71C1C'>*</font><br>" +
                            "osviežuje dušu.<br>" +
                            "Svedectvo Pánovo je hodnoverné, <font color='#B71C1C'>*</font><br>" +
                            "dáva múdrosť maličkým.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozhodnutia Pánove sú správne, <font color='#B71C1C'>*</font><br>" +
                            "potešujú srdce.<br>" +
                            "Prikázania Pánove sú jasné, <font color='#B71C1C'>*</font><br>" +
                            "osvecujú oči.<font color='#B71C1C'> – R.</font><br>" +
                            "Bázeň pred Pánom je úprimná, <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky.<br>" +
                            "Výroky Pánove sú pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a všetky spravodlivé.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa ti páčia slová mojich úst <font color='#B71C1C'>†</font><br>" +
                            "i rozjímanie môjho srdca pred tvojou tvárou. <font color='#B71C1C'>*</font><br>" +
                            "Pane, ty si moja pomoc a môj vykupiteľ.<font color='#B71C1C'> – R.</font>"},
            {"1", "6", "2", "Ž 21, 2-3. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Pane, z tvojej sily sa kráľ raduje.<br><br>" +
                            "Pane, z tvojej sily sa kráľ raduje <font color='#B71C1C'>*</font><br>" +
                            "a veľmi sa teší z tvojej spásy.<br>" +
                            "Vyplnil si túžbu jeho srdca <font color='#B71C1C'>*</font><br>" +
                            "a prosbu jeho perí si neodmietol.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyšiel si mu v ústrety s požehnaním, <font color='#B71C1C'>*</font><br>" +
                            "na jeho hlavu si vložil korunu z rýdzeho zlata.<br>" +
                            "Prosil si od teba život a ty si mu ho daroval, <font color='#B71C1C'>*</font><br>" +
                            "život dlhý, navždy, naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Veľká je jeho sláva, lebo mu pomáhaš, <font color='#B71C1C'>*</font><br>" +
                            "ozdobuješ ho velebou a nádherou.<br>" +
                            "Robíš z neho požehnanie pre všetky veky, <font color='#B71C1C'>*</font><br>" +
                            "blažíš ho radosťou pred svojou tvárou.<font color='#B71C1C'> – R.</font>"},
            {"2", "A", "", "Ž 40, 2+4ab. 7-8a. 8b-9. 10",
                    "<font color='#B71C1C'>R.:</font> Hľa, prichádzam, Pane, chcem plniť tvoju vôľu.<br><br>" +
                            "Čakal som, čakal na Pána <font color='#B71C1C'>*</font><br>" +
                            "a on sa ku mne sklonil.<br>" +
                            "Do úst mi vložil pieseň novú, <font color='#B71C1C'>*</font><br>" +
                            "chválospev nášmu Bohu.<font color='#B71C1C'> – R.</font><br>" +
                            "Obety a dary si nepraješ, <font color='#B71C1C'>*</font><br>" +
                            "lež uši si mi otvoril.<br>" +
                            "Nežiadaš žertvu ani obetu zmierenia, <font color='#B71C1C'>*</font><br>" +
                            "preto som povedal: \"Hľa prichádzam.<font color='#B71C1C'> – R.</font><br>" +
                            "Vo zvitku knihy je napísané o mne, <font color='#B71C1C'>*</font><br>" +
                            "že mám plniť tvoju vôľu.<br>" +
                            "A to chcem, Bože môj, <font color='#B71C1C'>*</font><br>" +
                            "hlboko v srdci mám tvoj zákon.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Ohlasujem tvoju spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "vo veľkom zhromaždení;<br>" +
                            "svojim perám hovoriť nebránim, <font color='#B71C1C'>*</font><br>" +
                            "Pane, ty to vieš.<font color='#B71C1C'> – R.</font>"},
            {"2", "B", "", "Ž 40, 2+4ab. 7-8a. 8b-9. 10",
                    "<font color='#B71C1C'>R.:</font> Hľa, prichádzam, Pane, chcem plniť tvoju vôľu.<br><br>" +
                            "Čakal som, čakal na Pána <font color='#B71C1C'>*</font><br>" +
                            "a on sa ku mne sklonil.<br>" +
                            "Do úst mi vložil pieseň novú, <font color='#B71C1C'>*</font><br>" +
                            "chválospev nášmu Bohu.<font color='#B71C1C'> – R.</font><br>" +
                            "Obety a dary si nepraješ, <font color='#B71C1C'>*</font><br>" +
                            "lež uši si mi otvoril.<br>" +
                            "Nežiadaš žertvu ani obetu zmierenia, <font color='#B71C1C'>*</font><br>" +
                            "preto som povedal: \"Hľa prichádzam.<font color='#B71C1C'> – R.</font><br>" +
                            "Vo zvitku knihy je napísané o mne, <font color='#B71C1C'>*</font><br>" +
                            "že mám plniť tvoju vôľu.<br>" +
                            "A to chcem, Bože môj, <font color='#B71C1C'>*</font><br>" +
                            "hlboko v srdci mám tvoj zákon.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Ohlasujem tvoju spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "vo veľkom zhromaždení;<br>" +
                            "svojim perám hovoriť nebránim, <font color='#B71C1C'>*</font><br>" +
                            "Pane, ty to vieš.<font color='#B71C1C'> – R.</font>"},
            {"2", "C", "", "Ž 96, 1-2a. 2b-3. 7-8a. 9-10ac",
                    "<font color='#B71C1C'>R.:</font> Zvestujte všetkým národom zázraky Pánove.<br><br>" +
                            "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>†</font><br>" +
                            "spievaj Pánovi, celá zem! <font color='#B71C1C'>*</font><br>" +
                            "Spievajte Pánovi, velebte jeho meno.<font color='#B71C1C'> – R.</font><br>" +
                            "Zvestujte jeho spásu deň čo deň. <font color='#B71C1C'>†</font><br>" +
                            "Zvestujte jeho slávu pohanom <font color='#B71C1C'>*</font><br>" +
                            "a jeho zázraky všetkým národom.<font color='#B71C1C'> – R.</font><br>" +
                            "Vzdávajte Pánovi, rodiny národov, <font color='#B71C1C'>†</font><br>" +
                            "vzdávajte Pánovi slávu a česť, <font color='#B71C1C'>*</font><br>" +
                            "vzdávajte Pánovi slávu hodnu jeho mena.<font color='#B71C1C'> – R.</font><br>" +
                            "Klaňajte sa Pánovi v posvätnom rúchu. <font color='#B71C1C'>*</font><br>" +
                            "Chvej sa pred ním, celá zem,<br>" +
                            "hlásajte medzi pohanmi: \"Pán kraľuje!\" <font color='#B71C1C'>*</font><br>" +
                            "a spravodlivo súdi národy.<font color='#B71C1C'> – R.</font>"},
            {"2", "1", "1", "Ž 110, 1. 2. 3. 4",
                    "<font color='#B71C1C'>R.:</font> Kriste, ty si kňaz naveky podľa radu Melchizedechovho.<br><br>" +
                            "Pán povedal môjmu Pánovi: <font color='#B71C1C'>*</font><br>" +
                            "\"Seď po mojej pravici,<br>" +
                            "kým nepoložím tvojich nepriateľov <font color='#B71C1C'>*</font><br>" +
                            "za podnožku tvojim nohám.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Moc tvojho žezla rozšíri Pán zo Siona: <font color='#B71C1C'>*</font><br>" +
                            "panuj uprostred svojich nepriateľov.<font color='#B71C1C'> – R.</font><br>" +
                            "Odo dňa tvojho narodenia patrí ti vláda <font color='#B71C1C'>†</font><br>" +
                            "v posvätnej nádhere. <font color='#B71C1C'>*</font><br>" +
                            "Splodil som ťa ako rosu pred východom zornice.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán prisahal a nebude ľutovať: <font color='#B71C1C'>*</font><br>" +
                            "\"Ty si kňaz naveky podľa radu Melchizedechovho.\"<font color='#B71C1C'> – R.</font>"},
            {"2", "1", "2", "Ž 50, 8-9. 16b-17. 21ab+23",
                    "<font color='#B71C1C'>R.:</font> Ukáž nám, Pane, cestu spásy.<br><br>" +
                            "Neobviňujem ťa pre tvoje obety, <font color='#B71C1C'>*</font><br>" +
                            "veď tvoje žertvy stále sú predo mnou.<br>" +
                            "Viac z tvojho domu býčky neprijmem <font color='#B71C1C'>*</font><br>" +
                            "ani capov z tvojich čried.<font color='#B71C1C'> – R.</font><br>" +
                            "\"Prečo odriekaš moje príkazy <font color='#B71C1C'>*</font><br>" +
                            "a moju zmluvu v ústach omieľaš?<br>" +
                            "Veď ty nenávidíš poriadok <font color='#B71C1C'>*</font><br>" +
                            "a moje slovo odmietaš.<font color='#B71C1C'> – R.</font><br>" +
                            "Toto páchaš, a ja by som mal mlčať? <font color='#B71C1C'>*</font><br>" +
                            "Myslíš si, že ja som ako ty?<br>" +
                            "Kto prináša obetu chvály, ten ma ctí; <font color='#B71C1C'>*</font><br>" +
                            "a kto kráča bez úhony, tomu ukážem Božiu spásu.\"<font color='#B71C1C'> – R.</font>"},
            {"2", "2", "1", "Ž 111, 1-2. 4-5. 9+10c",
                    "<font color='#B71C1C'>R.:</font> Pán má svoju zmluvu stále na mysli.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Z celého srdca chcem oslavovať Pána <font color='#B71C1C'>*</font><br>" +
                            "v zbore spravodlivých i v zhromaždení.<br>" +
                            "Veľké sú diela Pánove; <font color='#B71C1C'>*</font><br>" +
                            "nech ich skúmajú všetci, čo majú v nich záľubu.<font color='#B71C1C'> – R.</font><br>" +
                            "Ustanovil pamiatku na svoje obdivuhodné skutky; <font color='#B71C1C'>*</font><br>" +
                            "Pán je milosrdný a milostivý.<br>" +
                            "Pokrm dal tým, čo sa ho boja; <font color='#B71C1C'>*</font><br>" +
                            "svoju zmluvu má stále na mysli.<font color='#B71C1C'> – R.</font><br>" +
                            "Vykúpenie poslal svojmu ľudu, <font color='#B71C1C'>*</font><br>" +
                            "zmluvu uzavrel naveky.<br>" +
                            "Jeho meno je sväté a vzbudzuje hrôzu; <font color='#B71C1C'>*</font><br>" +
                            "jeho chvála ostáva naveky.<font color='#B71C1C'> – R.</font>"},
            {"2", "2", "2", "Ž 89, 20. 21-22. 27-28",
                    "<font color='#B71C1C'>R.:</font> Našiel si, Pane, svojho služobníka Dávida.<br><br>" +
                            "Raz si vo videní prehovoril k svojim svätým<br>" +
                            "a povedal si: <font color='#B71C1C'>†</font><br>" +
                            "\"Bohatierovi som pomoc poskytol <font color='#B71C1C'>*</font><br>" +
                            "a vyvoleného z ľudu som povýšil.<font color='#B71C1C'> – R.</font><br>" +
                            "Našiel som svojho služobníka Dávida, <font color='#B71C1C'>*</font><br>" +
                            "pomazal som ho svojím svätým olejom.<br>" +
                            "Pevne ho bude držať moja ruka <font color='#B71C1C'>*</font><br>" +
                            "a posilňovať moje rameno.<font color='#B71C1C'> – R.</font><br>" +
                            "On bude volať ku mne: ‚Ty si môj Otec, <font color='#B71C1C'>*</font><br>" +
                            "môj Boh a útočište mojej spásy.'<br>" +
                            "A ja ho ustanovím za prvorodeného, <font color='#B71C1C'>*</font><br>" +
                            "za najvyššieho medzi kráľmi zeme.\"<font color='#B71C1C'> – R.</font>"},
            {"2", "3", "1", "Ž 110, 1. 2. 3. 4",
                    "<font color='#B71C1C'>R.:</font> Kriste, ty si kňaz naveky podľa radu Melchizedechovho.<br><br>" +
                            "Pán povedal môjmu Pánovi: <font color='#B71C1C'>*</font><br>" +
                            "\"Seď po mojej pravici,<br>" +
                            "kým nepoložím tvojich nepriateľov <font color='#B71C1C'>*</font><br>" +
                            "za podnožku tvojim nohám.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Moc tvojho žezla rozšíri Pán zo Siona: <font color='#B71C1C'>*</font><br>" +
                            "panuj uprostred svojich nepriateľov.<font color='#B71C1C'> – R.</font><br>" +
                            "Odo dňa tvojho narodenia patrí ti vláda <font color='#B71C1C'>†</font><br>" +
                            "v posvätnej nádhere. <font color='#B71C1C'>*</font><br>" +
                            "Splodil som ťa ako rosu pred východom zornice.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán prisahal a nebude ľutovať: <font color='#B71C1C'>*</font><br>" +
                            "\"Ty si kňaz naveky podľa radu Melchizedechovho.\"<font color='#B71C1C'> – R.</font>"},
            {"2", "3", "2", "Ž 144, 1. 2. 9-10",
                    "<font color='#B71C1C'>R.:</font> Nech je zvelebený Pán, môj ochranca.<br><br>" +
                            "Nech je zvelebený Pán, môj ochranca, <font color='#B71C1C'>†</font><br>" +
                            "čo učí moje ruky zápasiť <font color='#B71C1C'>*</font><br>" +
                            "a moje prsty bojovať.<font color='#B71C1C'> – R.</font><br>" +
                            "On je ku mne milosrdný a dodáva mi odvahy, <font color='#B71C1C'>*</font><br>" +
                            "on je moje útočište a môj osloboditeľ;<br>" +
                            "on je moja záštita, na ktorú sa spolieham; <font color='#B71C1C'>*</font><br>" +
                            "on mi podrobuje môj ľud.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože, novú pieseň ti zaspievam; <font color='#B71C1C'>*</font><br>" +
                            "zahrám ti na desaťstrunovej citare.<br>" +
                            "Ty pomáhaš kráľom, <font color='#B71C1C'>*</font><br>" +
                            "ty zachraňuješ svojho sluhu Dávida<br>" +
                            "pred mečom záhuby.<font color='#B71C1C'> – R.</font>"},
            {"2", "4", "1", "Ž 40, 7-8a. 8b-9. 10. 17",
                    "<font color='#B71C1C'>R.:</font> Hľa, prichádzam, Pane, chcem plniť tvoju vôľu.<br><br>" +
                            "Obety a dary si nepraješ, <font color='#B71C1C'>*</font><br>" +
                            "lež uši si mi otvoril.<br>" +
                            "Nežiadaš žertvu ani obetu zmierenia, <font color='#B71C1C'>*</font><br>" +
                            "preto som povedal: \"Hľa, prichádzam.<font color='#B71C1C'> – R.</font><br>" +
                            "Vo zvitku knihy je napísané o mne, <font color='#B71C1C'>*</font><br>" +
                            "že mám plniť tvoju vôľu.<br>" +
                            "A to chcem, Bože môj, <font color='#B71C1C'>*</font><br>" +
                            "hlboko v srdci mám tvoj zákon.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Ohlasujem tvoju spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "vo veľkom zhromaždení;<br>" +
                            "svojim perám hovoriť nebránim, <font color='#B71C1C'>*</font><br>" +
                            "Pane, ty to vieš.<font color='#B71C1C'> – R.</font><br>" +
                            "No nech jasajú a nech sa v tebe tešia všetci, <font color='#B71C1C'>*</font><br>" +
                            "čo ťa hľadajú.<br>" +
                            "A tí, čo túžia po tvojej pomoci, nech stále hovoria: <font color='#B71C1C'>*</font><br>" +
                            "\"Nech je zvelebený Pán!\"<font color='#B71C1C'> – R.</font>"},
            {"2", "4", "2", "Ž 56, 2-3. 9-10b. 10c-11. 12-13",
                    "<font color='#B71C1C'>R.:</font> Na Boha sa ja spolieham a nebojím sa.<br><br>" +
                            "Zmiluj sa nado mnou, Bože,<br>" +
                            "lebo ma prenasleduje človek, <font color='#B71C1C'>*</font><br>" +
                            "každodenne ma napáda a utláča.<br>" +
                            "Moji nepriatelia ma prenasledujú deň čo deň <font color='#B71C1C'>*</font><br>" +
                            "a veľa je tých, čo bojujú proti mne, Najvyšší.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty vieš, koľko ráz som musel utekať: <font color='#B71C1C'>†</font><br>" +
                            "pozbieraj moje slzy do svojich nádob; <font color='#B71C1C'>*</font><br>" +
                            "či nie sú zapísané v tvojich účtoch?<br>" +
                            "Vtedy moji nepriatelia ustúpia, <font color='#B71C1C'>*</font><br>" +
                            "ešte v ten deň, keď budem volať:<font color='#B71C1C'> – R.</font><br>" +
                            "áno, viem, že ty si môj Boh. <font color='#B71C1C'>†</font><br>" +
                            "Na Boha, ktorého slovo velebím, <font color='#B71C1C'>*</font><br>" +
                            "na Pána, ktorého slovo velebím,<font color='#B71C1C'> – R.</font><br>" +
                            "na Boha sa ja spolieham <font color='#B71C1C'>*</font><br>" +
                            "a nebojím sa: veď čože mi môže urobiť človek?<br>" +
                            "Bože, ešte mám splniť sľuby, čo som tebe urobil; <font color='#B71C1C'>*</font><br>" +
                            "obety chvály ti prinesiem.<font color='#B71C1C'> – R.</font>"},
            {"2", "5", "1", "Ž 85, 8+10. 11-12. 13-14",
                    "<font color='#B71C1C'>R.:</font> Milosrdenstvo a vernosť sa stretnú navzájom.<br><br>" +
                            "Ukáž nám, Pane, svoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a daj nám svoju spásu.<br>" +
                            "Naozaj: blízko je spása tým, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "a jeho sláva bude prebývať v našej krajine.<font color='#B71C1C'> – R.</font><br>" +
                            "Milosrdenstvo a vernosť sa stretnú navzájom, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a pokoj sa pobozkajú.<br>" +
                            "Vernosť vyrastie zo zeme, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť zhliadne z neba.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď Pán dá požehnanie <font color='#B71C1C'>*</font><br>" +
                            "a svoje plody vydá naša zem.<br>" +
                            "Pred ním bude kráčať spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a po stopách jeho krokov spása.<font color='#B71C1C'> – R.</font>"},
            {"2", "5", "2", "Ž 57, 2. 3-4. 6+11",
                    "<font color='#B71C1C'>R.:</font> Zmiluj sa Bože, nado mnou, zmiluj sa nado mnou.<br><br>" +
                            "Zmiluj sa, Bože, nado mnou, zmiluj sa nado mnou, <font color='#B71C1C'>*</font><br>" +
                            "lebo sa k tebe utiekam;<br>" +
                            "v tieni tvojich krídel nachodím útočište, <font color='#B71C1C'>*</font><br>" +
                            "kým sa nepominú nástrahy.<font color='#B71C1C'> – R.</font><br>" +
                            "Volám k Bohu, k Najvyššiemu, <font color='#B71C1C'>*</font><br>" +
                            "k Bohu, ktorý mi preukazuje dobro.<br>" +
                            "On zošle pomoc z neba a zachráni ma; <font color='#B71C1C'>†</font><br>" +
                            "zahanbí tých, čo ma týrajú. <font color='#B71C1C'>*</font><br>" +
                            "Boh zošle svoju milosť a pravdu.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože, vznes sa nad nebesia <font color='#B71C1C'>*</font><br>" +
                            "a tvoja sláva nech je nad celou zemou.<br>" +
                            "Lebo až po nebesia siaha tvoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a tvoja vernosť až po oblaky.<font color='#B71C1C'> – R.</font>"},
            {"2", "6", "1", "Ž 47, 2-3. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pán vystupuje do neba za hlaholu poľnice.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Tlieskajte rukami, všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "jasajte Bohu hlasom radostným.<br>" +
                            "Lebo Pán je Najvyšší a hrozný, <font color='#B71C1C'>*</font><br>" +
                            "nad celou zemou veľký kráľ.<font color='#B71C1C'> – R.</font><br>" +
                            "Za jasotu vystupuje Boh, <font color='#B71C1C'>*</font><br>" +
                            "Pán vystupuje za hlaholu poľnice.<br>" +
                            "Spievajte Bohu, spievajte, <font color='#B71C1C'>*</font><br>" +
                            "spievajte nášmu kráľovi, spievajte.<font color='#B71C1C'> – R.</font><br>" +
                            "Pretože Boh je kráľom celej zeme; <font color='#B71C1C'>*</font><br>" +
                            "spievajte mu chválospev.<br>" +
                            "Boh kraľuje nad národmi, <font color='#B71C1C'>*</font><br>" +
                            "Boh sedí na svojom svätom tróne.<font color='#B71C1C'> – R.</font>"},
            {"2", "6", "2", "Ž 80, 2-3. 5-7",
                    "<font color='#B71C1C'>R.:</font> Rozjasni, Pane, svoju tvár a budeme spasení.<br><br>" +
                            "Pastier Izraela, <font color='#B71C1C'>*</font><br>" +
                            "čo ako ovcu vedieš Jozefa, počúvaj!<br>" +
                            "Ty, čo tróniš nad cherubmi, zaskvej sa <font color='#B71C1C'>*</font><br>" +
                            "pred Efraimom, Benjamínom a Manassesom.<br>" +
                            "Vzbuď svoju moc <font color='#B71C1C'>*</font><br>" +
                            "a príď nás zachrániť.<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, Bože zástupov, <font color='#B71C1C'>*</font><br>" +
                            "dokedy sa budeš hnevať na modlitby svojho ľudu?<br>" +
                            "Kŕmil si nás ako chlebom slzami <font color='#B71C1C'>*</font><br>" +
                            "a slzami si nás napájal v hojnosti.<br>" +
                            "Dopustil si, že sa pre nás svária naši susedia <font color='#B71C1C'>*</font><br>" +
                            "a naši nepriatelia si z nás robia posmech.<font color='#B71C1C'> – R.</font>"},
            {"3", "A", "", "Ž 27, 1. 4. 13-14",
                    "<font color='#B71C1C'>R.:</font> Pán je moje svetlo a moja spása.<br><br>" +
                            "Pán je moje svetlo a moja spása, <font color='#B71C1C'>*</font><br>" +
                            "koho sa mám báť?<br>" +
                            "Pán je ochranca môjho života, <font color='#B71C1C'>*</font><br>" +
                            "pred kým sa mám strachovať?<font color='#B71C1C'> – R.</font><br>" +
                            "O jedno prosím Pána a za tým túžim, <font color='#B71C1C'>*</font><br>" +
                            "aby som mohol bývať v dome Pánovom<br>" +
                            "po všetky dni svojho života,<br>" +
                            "aby som pociťoval nehu Pánovu <font color='#B71C1C'>*</font><br>" +
                            "a obdivoval jeho chrám.<font color='#B71C1C'> – R.</font><br>" +
                            "Verím, že uvidím dobrodenia Pánove <font color='#B71C1C'>*</font><br>" +
                            "v krajine žijúcich.<br>" +
                            "Očakávaj Pána a buď statočný; <font color='#B71C1C'>*</font><br>" +
                            "srdce maj silné a drž sa Pána.<font color='#B71C1C'> – R.</font>"},
            {"3", "B", "", "Ž 25, 4-5b. 6+7bc. 8-9",
                    "<font color='#B71C1C'>R.:</font> Ukáž mi, Pane, svoje cesty.<br><br>" +
                            "Ukáž mi, Pane, svoje cesty <font color='#B71C1C'>*</font><br>" +
                            "a pouč ma o svojich chodníkoch.<br>" +
                            "Veď ma vo svojej pravde a uč ma, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si Boh, moja spása.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozpomeň sa, Pane, na svoje zľutovanie <font color='#B71C1C'>*</font><br>" +
                            "a na svoje milosrdenstvo, ktoré trvá od vekov.<br>" +
                            "Pamätaj na mňa vo svojom milosrdenstve <font color='#B71C1C'>*</font><br>" +
                            "veď si, Pane, dobrotivý.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán je dobrý a spravodlivý: <font color='#B71C1C'>*</font><br>" +
                            "ukazuje cestu hriešnikom.<br>" +
                            "Pokorných vedie k správnemu konaniu <font color='#B71C1C'>*</font><br>" +
                            "a tichých poúča o svojich cestách.<font color='#B71C1C'> – R.</font>"},
            {"3", "C", "", "Ž 19, 8. 9. 10. 15",
                    "<font color='#B71C1C'>R.:</font> Tvoje slová, Pane, sú Duch a život.<br><br>" +
                            "Zákon Pánov je dokonalý, <font color='#B71C1C'>*</font><br>" +
                            "osviežuje dušu.<br>" +
                            "Svedectvo Pánovo je hodnoverné, <font color='#B71C1C'>*</font><br>" +
                            "dáva múdrosť maličkým.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozhodnutia Pánove sú správne, <font color='#B71C1C'>*</font><br>" +
                            "potešujú srdce.<br>" +
                            "Prikázania Pánove sú jasné, <font color='#B71C1C'>*</font><br>" +
                            "osvecujú oči.<font color='#B71C1C'> – R.</font><br>" +
                            "Bázeň pred Pánom je úprimná, <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky.<br>" +
                            "Výroky Pánove sú pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a všetky spravodlivé.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa ti páčia slová mojich úst <font color='#B71C1C'>†</font><br>" +
                            "i rozjímanie môjho srdca pred tvojou tvárou. <font color='#B71C1C'>*</font><br>" +
                            "Pane, ty si moja pomoc a môj vykupiteľ.<font color='#B71C1C'> – R.</font>"},
            {"3", "1", "1", "Ž 98, 1. 2-3b. 3c-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Spievajme Pánovi pieseň novú, lebo vykonal veci zázračné.<br><br>" +
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
            {"3", "1", "2", "Ž 89, 20. 21-22. 25-26",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, ospevovať budem naveky.<br><br>" +
                            "Raz si vo videní prehovoril k svojim svätým a povedal si: <font color='#B71C1C'>†</font><br>" +
                            "\"Bohatierovi som pomoc poskytol <font color='#B71C1C'>*</font><br>" +
                            "a vyvoleného z ľudu som povýšil.<font color='#B71C1C'> – R.</font><br>" +
                            "Našiel som svojho služobníka Dávida, <font color='#B71C1C'>*</font><br>" +
                            "pomazal som ho svojím svätým olejom.<br>" +
                            "Pevne ho bude držať moja ruka <font color='#B71C1C'>*</font><br>" +
                            "a posilňovať moje rameno.<font color='#B71C1C'> – R.</font><br>" +
                            "S ním bude moja vernosť a milosť <font color='#B71C1C'>*</font><br>" +
                            "a v mojom mene povznesie sa jeho moc.<br>" +
                            "Položím jeho ruku na more <font color='#B71C1C'>*</font><br>" +
                            "a na rieky jeho pravicu.\"<font color='#B71C1C'> – R.</font>"},
            {"3", "2", "1", "Ž 40, 2+4ab. 7-8a. 10. 11",
                    "<font color='#B71C1C'>R.:</font> Hľa, prichádzam, Pane, chcem plniť tvoju vôľu.<br><br>" +
                            "Čakal som, čakal na Pána <font color='#B71C1C'>*</font><br>" +
                            "a on sa ku mne sklonil.<br>" +
                            "Do úst mi vložil pieseň novú, <font color='#B71C1C'>*</font><br>" +
                            "chválospev nášmu Bohu.<font color='#B71C1C'> – R.</font><br>" +
                            "Obety a dary si nepraješ, <font color='#B71C1C'>*</font><br>" +
                            "lež uši si mi otvoril.<br>" +
                            "Nežiadaš žertvu ani obetu zmierenia, <font color='#B71C1C'>*</font><br>" +
                            "preto som povedal: \"Hľa, prichádzam.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Ohlasujem tvoju spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "vo veľkom zhromaždení;<br>" +
                            "svojim perám hovoriť nebránim, <font color='#B71C1C'>*</font><br>" +
                            "Pane, ty to vieš.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoju spravodlivosť si v srdci neskrývam, <font color='#B71C1C'>*</font><br>" +
                            "rozprávam o tvojej vernosti a o tvojej spáse.<br>" +
                            "Neskrývam tvoju milosť a pravdu <font color='#B71C1C'>*</font><br>" +
                            "pred veľkým zhromaždením.<font color='#B71C1C'> – R.</font>"},
            {"3", "2", "2", "Ž 24, 7. 8. 9. 10",
                    "<font color='#B71C1C'>R.:</font> Hľa, prichádza Pán, on je Kráľ slávy.<br><br>" +
                            "Zdvihnite, brány, svoje hlavice <font color='#B71C1C'>†</font><br>" +
                            "a vyvýšte sa, brány prastaré, <font color='#B71C1C'>*</font><br>" +
                            "lebo má vstúpiť kráľ slávy.<font color='#B71C1C'> – R.</font><br>" +
                            "Kto je ten kráľ slávy? <font color='#B71C1C'>†</font><br>" +
                            "Pán silný a mocný, <font color='#B71C1C'>*</font><br>" +
                            "Pán mocný v boji.<font color='#B71C1C'> – R.</font><br>" +
                            "Zdvihnite, brány, svoje hlavice <font color='#B71C1C'>†</font><br>" +
                            "a vyvýšte sa, brány prastaré, <font color='#B71C1C'>*</font><br>" +
                            "lebo má vstúpiť kráľ slávy.<font color='#B71C1C'> – R.</font><br>" +
                            "Kto je ten kráľ slávy? <font color='#B71C1C'>†</font><br>" +
                            "Pán zástupov, <font color='#B71C1C'>*</font><br>" +
                            "to je ten kráľ slávy.<font color='#B71C1C'> – R.</font>"},
            {"3", "3", "1", "Ž 110, 1. 2. 3. 4",
                    "<font color='#B71C1C'>R.:</font> Kriste, ty si kňaz naveky podľa radu Melchizedechovho.<br><br>" +
                            "Pán povedal môjmu Pánovi: <font color='#B71C1C'>*</font><br>" +
                            "\"Seď po mojej pravici,<br>" +
                            "kým nepoložím tvojich nepriateľov <font color='#B71C1C'>*</font><br>" +
                            "za podnožku tvojim nohám.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Moc tvojho žezla rozšíri Pán zo Siona: <font color='#B71C1C'>*</font><br>" +
                            "panuj uprostred svojich nepriateľov.<font color='#B71C1C'> – R.</font><br>" +
                            "Odo dňa tvojho narodenia patrí ti vláda <font color='#B71C1C'>†</font><br>" +
                            "v posvätnej nádhere. <font color='#B71C1C'>*</font><br>" +
                            "Splodil som ťa ako rosu pred východom zornice.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán prisahal a nebude ľutovať: <font color='#B71C1C'>*</font><br>" +
                            "\"Ty si kňaz naveky podľa radu Melchizedechovho.\"<font color='#B71C1C'> – R.</font>"},
            {"3", "3", "2", "Ž 89, 4-5. 27-28. 29-30",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, ospevovať budem naveky.<br><br>" +
                            "\"Zmluvu som uzavrel so svojím vyvoleným, <font color='#B71C1C'>*</font><br>" +
                            "svojmu služobníkovi Dávidovi som prisahal:<br>" +
                            "Naveky zaistím tvoj rod <font color='#B71C1C'>*</font><br>" +
                            "a postavím tvoj trón, čo pretrvá všetky pokolenia.<font color='#B71C1C'> – R.</font><br>" +
                            "On bude volať ku mne: ‚Ty si môj Otec, <font color='#B71C1C'>*</font><br>" +
                            "môj Boh a útočište mojej spásy.'<br>" +
                            "A ja ho ustanovím za prvorodeného, <font color='#B71C1C'>*</font><br>" +
                            "za najvyššieho medzi kráľmi zeme.<font color='#B71C1C'> – R.</font><br>" +
                            "Naveky mu svoju milosť zachovám <font color='#B71C1C'>*</font><br>" +
                            "a pevná bude moja zmluva s ním.<br>" +
                            "Jeho rod udržím naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho trón bude ako dni nebies.\"<font color='#B71C1C'> – R.</font>"},
            {"3", "4", "1", "Ž 24, 1-2. 3-4b. 5-6",
                    "<font color='#B71C1C'>R.:</font> S úprimným srdcom hľadáme tvoju tvár, Pane.<br><br>" +
                            "Pánova je zem i všetko, čo ju napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "okruh zeme aj tí, čo bývajú na ňom.<br>" +
                            "Veď on sám položil jeho základy na moriach <font color='#B71C1C'>*</font><br>" +
                            "a upevnil ho na vodách.<font color='#B71C1C'> – R.</font><br>" +
                            "Kto smie vystúpiť na vrch Pánov, <font color='#B71C1C'>*</font><br>" +
                            "kto smie stáť na jeho mieste posvätnom?<br>" +
                            "Ten, čo má ruky nevinné a srdce čisté, <font color='#B71C1C'>*</font><br>" +
                            "čo nedvíha svoju dušu k márnosti.<font color='#B71C1C'> – R.</font><br>" +
                            "Taký dostane požehnanie od Pána <font color='#B71C1C'>*</font><br>" +
                            "a odmenu od Boha, svojho spasiteľa.<br>" +
                            "To je pokolenie tých, čo ho hľadajú, <font color='#B71C1C'>*</font><br>" +
                            "čo hľadajú tvár Boha Jakubovho.<font color='#B71C1C'> – R.</font>"},
            {"3", "4", "2", "Ž 132, 1-2. 3-5. 11. 12. 13-14",
                    "<font color='#B71C1C'>R.:</font> Pán, Boh, mu dal trón jeho otca Dávida.<br><br>" +
                            "Pane, pamätaj na Dávida <font color='#B71C1C'>*</font><br>" +
                            "a na jeho veľkú ochotu,<br>" +
                            "že prisahal Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a mocnému Bohu Jakubovmu zložil sľub:<font color='#B71C1C'> – R.</font><br>" +
                            "\"Do príbytku svojho domu nevkročím, <font color='#B71C1C'>*</font><br>" +
                            "ani sa neuložím na svoje lôžko;<br>" +
                            "svojim očiam nedoprajem spánku <font color='#B71C1C'>*</font><br>" +
                            "ani svojim viečkam zdriemnutia,<br>" +
                            "kým nenájdem miesto pre Pána, <font color='#B71C1C'>*</font><br>" +
                            "príbytok pre mocného Jakubovho Boha.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Dávidovi sa Pán zaviazal prísahou; <font color='#B71C1C'>*</font><br>" +
                            "je pravdivá, nikdy ju neodvolá:<br>" +
                            "\"Potomka z tvojho rodu <font color='#B71C1C'>*</font><br>" +
                            "posadím na tvoj trón.<font color='#B71C1C'> – R.</font><br>" +
                            "Ak tvoji synovia dodržia moju zmluvu <font color='#B71C1C'>*</font><br>" +
                            "a moje príkazy, ktoré ich naučím,<br>" +
                            "aj ich synovia <font color='#B71C1C'>*</font><br>" +
                            "budú sedieť na tvojom tróne naveky.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán si vyvolil Sion, <font color='#B71C1C'>*</font><br>" +
                            "želal si mať ho za svoj príbytok:<br>" +
                            "\"To je miesto môjho odpočinku naveky; <font color='#B71C1C'>*</font><br>" +
                            "tu budem bývať, lebo som túžil za ním.\"<font color='#B71C1C'> – R.</font>"},
            {"3", "5", "1", "Ž 37, 3-4. 5-6. 23-24. 39-40",
                    "<font color='#B71C1C'>R.:</font> Pane, spas ma; ochraňuj ma v čase súženia.<br><br>" +
                            "Spoľahni sa na Pána a dobre rob <font color='#B71C1C'>*</font><br>" +
                            "a budeš bývať v svojej krajine a tešiť sa z bezpečia.<br>" +
                            "Hľadaj radosť v Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a dá ti, za čím túži tvoje srdce.<font color='#B71C1C'> – R.</font><br>" +
                            "Pánovi zver svoje cesty a jemu dôveruj, <font color='#B71C1C'>*</font><br>" +
                            "on sa už postará.<br>" +
                            "Tvoju spravodlivosť vyvedie na povrch ako svetlo <font color='#B71C1C'>*</font><br>" +
                            "a tvoje právo ako poludňajší jas.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán upevňuje kroky človeka <font color='#B71C1C'>*</font><br>" +
                            "a sprevádza ho na ceste.<br>" +
                            "Ak padne, neostane ležať, <font color='#B71C1C'>*</font><br>" +
                            "veď Pán ho drží za ruku.<font color='#B71C1C'> – R.</font><br>" +
                            "Spása spravodlivých prichádza od Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je ich ochrancom v čase súženia.<br>" +
                            "Pán im pomôže a oslobodí ich, <font color='#B71C1C'>†</font><br>" +
                            "vytrhne ich z rúk hriešnikov a zachráni ich, <font color='#B71C1C'>*</font><br>" +
                            "lebo sa spoliehajú na neho.<font color='#B71C1C'> – R.</font>"},
            {"3", "5", "2", "Ž 51, 3-4. 5-6a. 6b-7. 10-11",
                    "<font color='#B71C1C'>R.:</font> Zmiluj sa, Pane, lebo sme zhrešili.<br><br>" +
                            "Zmiluj sa, Bože, nado mnou pre svoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje veľké zľutovanie znič moju neprávosť.<br>" +
                            "Úplne zmy zo mňa moju vinu <font color='#B71C1C'>*</font><br>" +
                            "a očisť ma od hriechu.<font color='#B71C1C'> – R.</font><br>" +
                            "Vedomý som si svojej neprávosti <font color='#B71C1C'>*</font><br>" +
                            "a svoj hriech mám stále pred sebou.<br>" +
                            "Proti tebe, proti tebe samému som sa prehrešil <font color='#B71C1C'>*</font><br>" +
                            "a urobil som, čo je v tvojich očiach zlé,<font color='#B71C1C'> – R.</font><br>" +
                            "aby si sa ukázal spravodlivý vo svojom výroku <font color='#B71C1C'>*</font><br>" +
                            "a nestranný vo svojom súde.<br>" +
                            "Naozaj som sa v neprávosti narodil <font color='#B71C1C'>*</font><br>" +
                            "a hriešneho ma počala moja mať.<font color='#B71C1C'> – R.</font><br>" +
                            "Daj, aby som počul radosť a veselosť, <font color='#B71C1C'>*</font><br>" +
                            "a zaplesajú kosti, ktoré si rozdrvil.<br>" +
                            "Odvráť, svoju tvár od mojich hriechov <font color='#B71C1C'>*</font><br>" +
                            "a zotri všetky moje viny.<font color='#B71C1C'> – R.</font>"},
            {"3", "6", "1", "Lk 1, 69-70. 71-72. 73-75",
                    "<font color='#B71C1C'>R.:</font> Nech je zvelebený Pán, Boh Izraela, lebo navštívil svoj ľud.<br><br>" +
                            "A vzbudil nám mocného Spasiteľa <font color='#B71C1C'>*</font><br>" +
                            "z rodu Dávida, svojho služobníka,<br>" +
                            "ako odpradávna hovoril <font color='#B71C1C'>*</font><br>" +
                            "ústami svojich svätých prorokov,<font color='#B71C1C'> – R.</font><br>" +
                            "že nás oslobodí od našich nepriateľov <font color='#B71C1C'>*</font><br>" +
                            "a z rúk všetkých, čo nás nenávidia.<br>" +
                            "Preukázal milosrdenstvo našim otcom <font color='#B71C1C'>*</font><br>" +
                            "a pamätá na svoju svätú zmluvu,<font color='#B71C1C'> – R.</font><br>" +
                            "na prísahu,<br>" +
                            "ktorou sa zaviazal nášmu otcovi Abrahámovi, <font color='#B71C1C'>*</font><br>" +
                            "že nás vyslobodí z rúk nepriateľov,<br>" +
                            "aby sme mu bez strachu slúžili <font color='#B71C1C'>*</font><br>" +
                            "vo svätosti a spravodlivosti pred jeho tvárou<br>" +
                            "po všetky dni nášho života.<font color='#B71C1C'> – R.</font>"},
            {"3", "6", "2", "Ž 51, 12-13. 14-15. 16-17",
                    "<font color='#B71C1C'>R.:</font> Bože, stvor vo mne srdce čisté.<br><br>" +
                            "Bože, stvor vo mne srdce čisté <font color='#B71C1C'>*</font><br>" +
                            "a v mojom vnútri obnov ducha pevného.<br>" +
                            "Neodvrhuj ma spred svojej tváre <font color='#B71C1C'>*</font><br>" +
                            "a neodnímaj mi svojho ducha svätého.<font color='#B71C1C'> – R.</font><br>" +
                            "Navráť mi radosť z tvojej spásy <font color='#B71C1C'>*</font><br>" +
                            "a posilni ma duchom veľkej ochoty.<br>" +
                            "Poučím blúdiacich o tvojich cestách <font color='#B71C1C'>*</font><br>" +
                            "a hriešnici sa k tebe obrátia.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože, Boh mojej spásy, zbav ma škvrny krvipreliatia <font color='#B71C1C'>*</font><br>" +
                            "a môj jazyk zajasá nad tvojou spravodlivosťou.<br>" +
                            "Pane, otvor moje pery <font color='#B71C1C'>*</font><br>" +
                            "a moje ústa budú ohlasovať tvoju slávu.<font color='#B71C1C'> – R.</font>"},
            {"4", "A", "", "Ž 146, 6c-7. 8-9a. 9b-10",
                    "<font color='#B71C1C'>R.:</font> Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Pán zachováva vernosť naveky, <font color='#B71C1C'>*</font><br>" +
                            "utláčaným prisudzuje právo,<br>" +
                            "hladujúcim dáva chlieb. <font color='#B71C1C'>*</font><br>" +
                            "Pán vyslobodzuje väzňov,<font color='#B71C1C'> – R.</font><br>" +
                            "Pán otvára oči slepým, <font color='#B71C1C'>*</font><br>" +
                            "Pán dvíha skľúčených,<br>" +
                            "Pán miluje spravodlivých. <font color='#B71C1C'>*</font><br>" +
                            "Pán ochraňuje cudzincov,<font color='#B71C1C'> – R.</font><br>" +
                            "ujíma sa siroty a vdovy, <font color='#B71C1C'>*</font><br>" +
                            "ale hatí cesty hriešnikov.<br>" +
                            "Pán bude kraľovať naveky; <font color='#B71C1C'>*</font><br>" +
                            "tvoj Boh, Sion, z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"4", "B", "", "Ž 95, 1-2. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pane, daj, aby sme počúvali tvoj hlas a nezatvrdzovali si srdcia.<br><br>" +
                            "Poďte, plesajme v Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "oslavujme Boha, našu spásu.<br>" +
                            "Predstúpme s chválospevmi pred jeho tvár <font color='#B71C1C'>*</font><br>" +
                            "a oslavujme ho žalmami.<font color='#B71C1C'> – R.</font><br>" +
                            "Poďte, klaňajme sa a na zem padnime, <font color='#B71C1C'>*</font><br>" +
                            "kľaknime na kolená pred Pánom, ktorý nás stvoril.<br>" +
                            "Lebo on je náš Boh <font color='#B71C1C'>†</font><br>" +
                            "a my sme ľud jeho pastviny <font color='#B71C1C'>*</font><br>" +
                            "a ovce, ktoré vedie svojou rukou.<font color='#B71C1C'> – R.</font><br>" +
                            "Čujte dnes jeho hlas: <font color='#B71C1C'>*</font><br>" +
                            "\"Nezatvrdzujte svoje srdcia<br>" +
                            "ako v Meríbe, ako v dňoch Massy na púšti, <font color='#B71C1C'>†</font><br>" +
                            "kde ma pokúšali vaši otcovia; <font color='#B71C1C'>*</font><br>" +
                            "skúšali ma, hoci moje skutky videli.\"<font color='#B71C1C'> – R.</font>"},
            {"4", "C", "", "Ž 71, 1-2. 3-4a. 5-6b. 15ab+17",
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
                            "a ja až doteraz ohlasujem tvoje diela zázračné.<font color='#B71C1C'> – R.</font>"},
            {"4", "1", "1", "Ž 31, 20. 21. 22. 23. 24",
                    "<font color='#B71C1C'>R.:</font> Majte srdce statočné, vy všetci, čo dúfate v Pána.<br><br>" +
                            "Pane, tvoja dobrota je taká nesmierna <font color='#B71C1C'>*</font><br>" +
                            "a vyhradil si ju bohabojným.<br>" +
                            "Preukazuješ ju tým, čo v teba dúfajú, <font color='#B71C1C'>*</font><br>" +
                            "pred zrakom ľudí.<font color='#B71C1C'> – R.</font><br>" +
                            "Záclonou svojej tváre ich kryješ <font color='#B71C1C'>*</font><br>" +
                            "pred zúrivosťou ľudu.<br>" +
                            "V stánku ich chrániš <font color='#B71C1C'>*</font><br>" +
                            "pred svárlivými jazykmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, buď zvelebený, <font color='#B71C1C'>*</font><br>" +
                            "že si mi preukázal milosrdenstvo<br>" +
                            "v opevnenom meste.<font color='#B71C1C'> – R.</font><br>" +
                            "Už som si v strachu hovoril: <font color='#B71C1C'>*</font><br>" +
                            "\"Odvrhnutý som spred tvojich očí.\"<br>" +
                            "No ty si vyslyšal moju hlasitú modlitbu, <font color='#B71C1C'>*</font><br>" +
                            "keď som volal k tebe.<font color='#B71C1C'> – R.</font><br>" +
                            "Milujte Pána, všetci jeho svätí. <font color='#B71C1C'>†</font><br>" +
                            "Pán verných chráni, <font color='#B71C1C'>*</font><br>" +
                            "ale plnou mierou odpláca tým,<br>" +
                            "čo si počínajú pyšne.<font color='#B71C1C'> – R.</font>"},
            {"4", "1", "2", "Ž 3, 2-3. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Povstaň, Pane; zachráň ma, Bože môj.<br><br>" +
                            "Pane, jak mnoho je tých, čo ma sužujú! <font color='#B71C1C'>*</font><br>" +
                            "Mnohí povstávajú proti mne.<br>" +
                            "Mnohí o mne hovoria: <font color='#B71C1C'>*</font><br>" +
                            "\"Boh mu nepomáha.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Ale ty, Pane, si môj ochranca, <font color='#B71C1C'>*</font><br>" +
                            "moja sláva, čo mi hlavu vztyčuje.<br>" +
                            "Hlasne som volal k Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a on mi odpovedal zo svojho svätého vrchu.<font color='#B71C1C'> – R.</font><br>" +
                            "A ja som sa uložil na odpočinok a usnul som, <font color='#B71C1C'>*</font><br>" +
                            "prebudil som sa, lebo Pán ma udržuje.<br>" +
                            "nebudem sa báť tisícov ľudí, čo ma obkľučujú. <font color='#B71C1C'>*</font><br>" +
                            "Povstaň, Pane; zachráň ma, Bože môj.<font color='#B71C1C'> – R.</font>"},
            {"4", "2", "1", "Ž 22, 26b-27. 28+30ab. 30c-32",
                    "<font color='#B71C1C'>R.:</font> Chváliť ťa budú všetci, čo ťa hľadajú, Pane.<br><br>" +
                            "Svoje sľuby splním pred tvárou tých, čo sa boja Pána. <font color='#B71C1C'>*</font><br>" +
                            "Chudobní sa najedia a budú nasýtení<br>" +
                            "a Pána budú chváliť tí, čo ho hľadajú: <font color='#B71C1C'>*</font><br>" +
                            "\"Naveky nech žijú ich srdcia!\"<font color='#B71C1C'> – R.</font><br>" +
                            "Pána budú spomínať<br>" +
                            "a k nemu sa obrátia všetky zemské končiny, <font color='#B71C1C'>*</font><br>" +
                            "jemu sa budú klaňať všetky rodiny národov.<br>" +
                            "Jemu jedinému sa budú klaňať všetci,<br>" +
                            "čo spia pod zemou; <font color='#B71C1C'>*</font><br>" +
                            "pred jeho tvárou padnú na zem všetci,<br>" +
                            "čo zostupujú do prachu.<font color='#B71C1C'> – R.</font><br>" +
                            "Aj moja duša bude preňho žiť <font color='#B71C1C'>*</font><br>" +
                            "a jemu bude slúžiť moje potomstvo.<br>" +
                            "Budúcim pokoleniam sa bude rozprávať o Pánovi <font color='#B71C1C'>†</font><br>" +
                            "a jeho spravodlivosť budú ohlasovať ľudu,<br>" +
                            "ktorý sa narodí: <font color='#B71C1C'>*</font><br>" +
                            "\"Toto urobil Pán.\"<font color='#B71C1C'> – R.</font>"},
            {"4", "2", "2", "Ž 86, 1-2. 3-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Skloň sa ku mne, Pane, a vyslyš ma.<br><br>" +
                            "Nakloň, Pane, svoj sluch a vyslyš ma, <font color='#B71C1C'>*</font><br>" +
                            "lebo som biedny a chudobný.<br>" +
                            "Ochraňuj ma, lebo som ti oddaný; <font color='#B71C1C'>*</font><br>" +
                            "zachráň, Bože, svojho sluhu, ktorý dúfa v teba.<font color='#B71C1C'> – R.</font><br>" +
                            "Zmiluj sa, Pane, nado mnou, <font color='#B71C1C'>*</font><br>" +
                            "veď k tebe volám deň čo deň.<br>" +
                            "Obveseľ, Pane, svojho sluhu, <font color='#B71C1C'>*</font><br>" +
                            "veď k tebe dvíham svoju dušu.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo ty, Pane, si dobrý a láskavý <font color='#B71C1C'>*</font><br>" +
                            "a veľmi milostivý voči všetkým, čo ťa vzývajú.<br>" +
                            "Pane, počuj moju modlitbu, <font color='#B71C1C'>*</font><br>" +
                            "všimni si hlas mojej úpenlivej prosby.<font color='#B71C1C'> – R.</font>"},
            {"4", "3", "1", "Ž 103, 1-2. 13-14. 17-18a",
                    "<font color='#B71C1C'>R.:</font> Milosrdenstvo Pánovo je od večnosti voči tým, čo sa ho boja.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Ako sa otec zmilúva nad deťmi, <font color='#B71C1C'>*</font><br>" +
                            "tak sa Pán zmilúva nad tými, čo sa ho boja.<br>" +
                            "Veď on dobre vie, z čoho sme stvorení; <font color='#B71C1C'>*</font><br>" +
                            "pamätá, že sme iba prach.<font color='#B71C1C'> – R.</font><br>" +
                            "No milosrdenstvo Pánovo je od večnosti až na večnosť <font color='#B71C1C'>*</font><br>" +
                            "voči tým, čo sa ho boja,<br>" +
                            "a jeho spravodlivosť chráni ich detné deti, <font color='#B71C1C'>*</font><br>" +
                            "tie, čo zachovávajú jeho zmluvu.<font color='#B71C1C'> – R.</font>"},
            {"4", "3", "2", "Ž 32, 1-2. 5. 6. 7",
                    "<font color='#B71C1C'>R.:</font> Odpusť mi, Pane, vinu môjho hriechu.<br><br>" +
                            "Blažený, komu sa odpustila neprávosť <font color='#B71C1C'>*</font><br>" +
                            "a je oslobodený od hriechu.<br>" +
                            "Blažený človek, ktorému Pán vinu nepripočíta <font color='#B71C1C'>*</font><br>" +
                            "a v ktorého mysli niet podvodu.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyznal som sa ti zo svojho hriechu <font color='#B71C1C'>*</font><br>" +
                            "a nezatajil som svoj priestupok.<br>" +
                            "Povedal som si: \"Vyznám Pánovi svoju neprávosť.\" <font color='#B71C1C'>*</font><br>" +
                            "A ty si mi odpustil zlobu môjho hriechu.<font color='#B71C1C'> – R.</font><br>" +
                            "Preto každý nábožný bude sa modliť k tebe <font color='#B71C1C'>*</font><br>" +
                            "v čase tiesne.<br>" +
                            "A záplavy veľkých vôd <font color='#B71C1C'>*</font><br>" +
                            "sa k nemu nepriblížia.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty si moje útočište, ochrániš ma pred súžením; <font color='#B71C1C'>*</font><br>" +
                            "zahrnieš ma radosťou zo spásy.<font color='#B71C1C'> – R.</font>"},
            {"4", "4", "1", "Ž 48, 2-3a. 3b-4. 9. 10-11",
                    "<font color='#B71C1C'>R.:</font> Spomíname, Bože, na tvoje milosrdenstvo uprostred tvojho chrámu.<br><br>" +
                            "Veľký je Pán a hoden každej chvály <font color='#B71C1C'>*</font><br>" +
                            "v meste nášho Boha.<br>" +
                            "Jeho svätý vrch, prekrásne návršie, <font color='#B71C1C'>*</font><br>" +
                            "je celej zemi na radosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Vrch Sion, tajomný príbytok, <font color='#B71C1C'>*</font><br>" +
                            "je mestom veľkého kráľa.<br>" +
                            "Boh sa preslávil v jeho palácoch <font color='#B71C1C'>*</font><br>" +
                            "ako istá ochrana.<font color='#B71C1C'> – R.</font><br>" +
                            "Čo sme počuli, to sme aj videli <font color='#B71C1C'>*</font><br>" +
                            "v meste Pána zástupov,<br>" +
                            "v meste nášho Boha: <font color='#B71C1C'>*</font><br>" +
                            "Boh ho založil naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Spomíname, Bože, na tvoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "uprostred tvojho chrámu.<br>" +
                            "Ako tvoje meno, Bože, <font color='#B71C1C'>†</font><br>" +
                            "tak aj tvoja sláva šíri sa až do končín zeme; <font color='#B71C1C'>*</font><br>" +
                            "tvoja pravica je plná spravodlivosti.<font color='#B71C1C'> – R.</font>"},
            {"4", "4", "2", "1 Krn 29, 10bc. 11. 12",
                    "<font color='#B71C1C'>R.:</font> Pane, ty panuješ nad všetkými; v tvojej ruke je moc a sila.<br><br>" +
                            "Zvelebený buď, Pane, Bože nášho otca Izraela, <font color='#B71C1C'>*</font><br>" +
                            "od vekov naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoja je, Pane, vznešenosť i moc, <font color='#B71C1C'>*</font><br>" +
                            "sláva, jas a veleba,<br>" +
                            "lebo tvoje je všetko na nebi i na zemi. <font color='#B71C1C'>†</font><br>" +
                            "Tvoje je, Pane, kráľovstvo, <font color='#B71C1C'>*</font><br>" +
                            "ty si vyvýšený ako hlava nad všetkým.<font color='#B71C1C'> – R.</font><br>" +
                            "Od teba pochádza bohatstvo i sláva; <font color='#B71C1C'>*</font><br>" +
                            "ty panuješ nad všetkými.<br>" +
                            "V tvojej ruke je moc a sila, <font color='#B71C1C'>*</font><br>" +
                            "tvoja ruka robí všetko veľkým a mocným.<font color='#B71C1C'> – R.</font>"},
            {"4", "5", "1", "Ž 27, 1. 3. 5. 8b-9c",
                    "<font color='#B71C1C'>R.:</font> Pán je moje svetlo a moja spása.<br><br>" +
                            "Pán je moje svetlo a moja spása, <font color='#B71C1C'>*</font><br>" +
                            "koho sa mám báť?<br>" +
                            "Pán je ochranca môjho života, <font color='#B71C1C'>*</font><br>" +
                            "pred kým sa mám strachovať?<font color='#B71C1C'> – R.</font><br>" +
                            "Aj keby sa proti mne postavili šíky, <font color='#B71C1C'>*</font><br>" +
                            "moje srdce sa nezľakne.<br>" +
                            "Aj keby proti mne vzbĺkol boj, <font color='#B71C1C'>*</font><br>" +
                            "zotrvám v dôvere.<font color='#B71C1C'> – R.</font><br>" +
                            "On ma vo svojom stane schová v deň nešťastia, <font color='#B71C1C'>†</font><br>" +
                            "ukryje ma v skrýši svojho príbytku <font color='#B71C1C'>*</font><br>" +
                            "a postaví ma vysoko na skalu.<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, ja hľadám tvoju tvár. <font color='#B71C1C'>*</font><br>" +
                            "Neodvracaj svoju tvár odo mňa,<br>" +
                            "neodkláňaj sa v hneve od svojho služobníka. <font color='#B71C1C'>*</font><br>" +
                            "ty si moja pomoc, neodvrhuj ma.<font color='#B71C1C'> – R.</font>"},
            {"4", "5", "2", "Ž 18, 31. 47+50. 51",
                    "<font color='#B71C1C'>R.:</font> Velebím ťa, Bože, ty moja spása.<br><br>" +
                            "Božia cesta je čistá, <font color='#B71C1C'>†</font><br>" +
                            "ohňom je vyskúšané slovo Pánovo. <font color='#B71C1C'>*</font><br>" +
                            "On je ochrancom všetkých, čo v neho dúfajú.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech žije Pán, nech je zvelebený môj Záchranca, <font color='#B71C1C'>*</font><br>" +
                            "nech je vyvýšený Boh, moja spása.<br>" +
                            "Preto ťa, Pane, budem velebiť medzi národmi <font color='#B71C1C'>*</font><br>" +
                            "a ospevovať tvoje meno žalmami.<font color='#B71C1C'> – R.</font><br>" +
                            "Svojmu kráľovi dávaš veľké víťazstvá, <font color='#B71C1C'>†</font><br>" +
                            "preukazuješ priazeň svojmu pomazanému, <font color='#B71C1C'>*</font><br>" +
                            "Dávidovi a jeho potomstvu až naveky.<font color='#B71C1C'> – R.</font>"},
            {"4", "6", "1", "Ž 23, 1-3. 4. 5. 6",
                    "<font color='#B71C1C'>R.:</font> Pán je môj pastier, nič mi nechýba.<br><br>" +
                            "Pán je môj pastier, nič mi nechýba: <font color='#B71C1C'>*</font><br>" +
                            "pasie ma na zelených pašienkach.<br>" +
                            "Vodí ma k tichým vodám, <font color='#B71C1C'>*</font><br>" +
                            "dušu mi osviežuje.<br>" +
                            "Vodí ma po správnych chodníkoch, <font color='#B71C1C'>*</font><br>" +
                            "verný svojmu menu.<font color='#B71C1C'> – R.</font><br>" +
                            "I keby som mal ísť tmavou dolinou, <font color='#B71C1C'>†</font><br>" +
                            "nebudem sa báť zlého, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si so mnou.<br>" +
                            "Tvoj prút a tvoja palica, <font color='#B71C1C'>*</font><br>" +
                            "tie sú mi útechou.<font color='#B71C1C'> – R.</font><br>" +
                            "Prestieraš mi stôl <font color='#B71C1C'>*</font><br>" +
                            "pred očami mojich protivníkov.<br>" +
                            "Leješ mi olej na hlavu <font color='#B71C1C'>*</font><br>" +
                            "a kalich mi napĺňaš až po okraj.<font color='#B71C1C'> – R.</font><br>" +
                            "Dobrota a milosť budú ma sprevádzať <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni môjho života.<br>" +
                            "A budem bývať v dome Pánovom <font color='#B71C1C'>*</font><br>" +
                            "mnoho a mnoho dní.<font color='#B71C1C'> – R.</font>"},
            {"4", "6", "2", "Ž 119, 9. 10. 11. 12. 13. 14",
                    "<font color='#B71C1C'>R.:</font> Nauč ma, Pane, svoje ustanovenia.<br><br>" +
                            "Ako sa mladík na svojej ceste udrží čistým? <font color='#B71C1C'>*</font><br>" +
                            "Tak, že bude zachovávať tvoje slová.<font color='#B71C1C'> – R.</font><br>" +
                            "Celým svojím srdcom ťa vyhľadávam; <font color='#B71C1C'>*</font><br>" +
                            "nedaj, aby som zablúdil od tvojich príkazov.<font color='#B71C1C'> – R.</font><br>" +
                            "V srdci si uchovávam tvoje výroky <font color='#B71C1C'>*</font><br>" +
                            "aby som proti tebe nezhrešil.<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, ty si velebený; <font color='#B71C1C'>*</font><br>" +
                            "nauč ma svoje ustanovenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Svojimi perami vypočítavam <font color='#B71C1C'>*</font><br>" +
                            "všetky výroky tvojich úst.<font color='#B71C1C'> – R.</font><br>" +
                            "Keď idem cestou tvojich zákonov, <font color='#B71C1C'>*</font><br>" +
                            "mám väčšiu radosť ako zo všetkého bohatstva.<font color='#B71C1C'> – R.</font>"},
            {"5", "A", "", "Ž 112, 4-5. 6-7. 8a+9",
                    "<font color='#B71C1C'>R.:</font> Spravodlivým žiari svetlo v temnotách.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Spravodlivým žiari svetlo v temnotách, <font color='#B71C1C'>*</font><br>" +
                            "milosrdný, milostivý a spravodlivý.<br>" +
                            "V obľube je človek, čo sa zľutúva a rád pomáha, <font color='#B71C1C'>*</font><br>" +
                            "čo svoj majetok čestne spravuje;<font color='#B71C1C'> – R.</font><br>" +
                            "nikdy nezakolíše. <font color='#B71C1C'>*</font><br>" +
                            "Vo večnej pamäti bude spravodlivý,<br>" +
                            "nebude sa báť zlej zvesti. <font color='#B71C1C'>*</font><br>" +
                            "Jeho srdce je pevné, dôveruje v Pána,<font color='#B71C1C'> – R.</font><br>" +
                            "bezpečné je jeho srdce, nebojí sa. <font color='#B71C1C'>*</font><br>" +
                            "Rozdeľuje a dáva chudobným;<br>" +
                            "jeho dobročinnosť potrvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho moc a sláva budú stále rásť.<font color='#B71C1C'> – R.</font>"},
            {"5", "B", "", "Ž 147, 1-2. 3-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Chváľme Pána, on uzdravuje skľúčených srdcom.<br><br>" +
                            "Chváľte Pána, lebo je dobré ospevovať nášho Boha, <font color='#B71C1C'>*</font><br>" +
                            "lebo je milé hlásať jeho slávu.<br>" +
                            "Pán stavia Jeruzalem <font color='#B71C1C'>*</font><br>" +
                            "a zhromažďuje roztratených Izraelitov.<font color='#B71C1C'> – R.</font><br>" +
                            "Uzdravuje skľúčených srdcom <font color='#B71C1C'>*</font><br>" +
                            "a obväzuje ich rany.<br>" +
                            "On pozná počet hviezd <font color='#B71C1C'>*</font><br>" +
                            "a každú volá po mene.<font color='#B71C1C'> – R.</font><br>" +
                            "Veľký je náš Pán a veľmi mocný, <font color='#B71C1C'>*</font><br>" +
                            "jeho múdrosť je nesmierna.<br>" +
                            "Tichých sa Pán ujíma, <font color='#B71C1C'>*</font><br>" +
                            "ale hriešnikov ponižuje až po zem.<font color='#B71C1C'> – R.</font>"},
            {"5", "C", "", "Ž 138, 1-2a. 2b-3. 4-5. 7c-8",
                    "<font color='#B71C1C'>R.:</font> Budem ti hrať pred tvárou anjelov.<br><br>" +
                            "Chcem ťa, Pane, oslavovať celým srdcom, <font color='#B71C1C'>*</font><br>" +
                            "že si vypočul slová mojich úst.<br>" +
                            "Budem ti hrať pred tvárou anjelov, <font color='#B71C1C'>*</font><br>" +
                            "vrhnem sa na tvár pred tvojím svätým chrámom.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoje meno budem oslavovať, <font color='#B71C1C'>†</font><br>" +
                            "pretože si milosrdný a verný <font color='#B71C1C'>*</font><br>" +
                            "a nadovšetko si zvelebil svoje meno a svoje prisľúbenia.<br>" +
                            "Vždy si ma vyslyšal, keď som ťa vzýval, <font color='#B71C1C'>*</font><br>" +
                            "a rozmnožil si vo mne odvahu.<font color='#B71C1C'> – R.</font><br>" +
                            "Oslavovať ťa budú, Pane, všetci králi zeme, <font color='#B71C1C'>*</font><br>" +
                            "lebo počuli slová tvojich úst.<br>" +
                            "Budú ospevovať Pánove cesty, <font color='#B71C1C'>*</font><br>" +
                            "lebo veľká je Pánova sláva.<font color='#B71C1C'> – R.</font><br>" +
                            "Zachráni ma tvoja pravica. <font color='#B71C1C'>*</font><br>" +
                            "Pán za mňa dielo dokončí.<br>" +
                            "Pane, tvoje milosrdenstvo je večné; <font color='#B71C1C'>*</font><br>" +
                            "neopusť dielo svojich rúk.<font color='#B71C1C'> – R.</font>"},
            {"5", "1", "1", "Ž 104, 1-2a. 5-6. 10+12. 24+35c",
                    "<font color='#B71C1C'>R.:</font> Zo svojich diel nech sa teší Pán.<br><br>" +
                            "Dobroreč, duša moja, Pánovi; <font color='#B71C1C'>*</font><br>" +
                            "Pane, Bože môj, ty si nesmierne veľký.<br>" +
                            "Odel si sa do slávy a veleby, <font color='#B71C1C'>*</font><br>" +
                            "do svetla si sa zahalil ako do rúcha.<font color='#B71C1C'> – R.</font><br>" +
                            "Zem si postavil na jej základoch, <font color='#B71C1C'>*</font><br>" +
                            "nevychýli sa nikdy-nikdy.<br>" +
                            "Oceán ju prikryl sťa odev, <font color='#B71C1C'>*</font><br>" +
                            "nad vrchmi vody zastali.<font color='#B71C1C'> – R.</font><br>" +
                            "Prameňom dávaš stekať do potokov, <font color='#B71C1C'>*</font><br>" +
                            "čo tečú pomedzi vrchy.<br>" +
                            "Popri nich hniezdi nebeské vtáctvo, <font color='#B71C1C'>*</font><br>" +
                            "spomedzi konárov zaznieva ich pieseň.<font color='#B71C1C'> – R.</font><br>" +
                            "Aké mnohoraké sú tvoje diela, Pane! <font color='#B71C1C'>*</font><br>" +
                            "Všetko si múdro urobil.<br>" +
                            "Zem je plná tvojho stvorenstva. <font color='#B71C1C'>*</font><br>" +
                            "Dobroreč, duša moja, Pánovi.<font color='#B71C1C'> – R.</font>"},
            {"5", "1", "2", "Ž 132, 6-7. 8-10",
                    "<font color='#B71C1C'>R.:</font> Vstaň, Pane, zaujmi svoje miesto, ty a tvoja vznešená archa.<br><br>" +
                            "Počuli sme, že archa je v Efrate, <font color='#B71C1C'>*</font><br>" +
                            "a našli sme ju na jaarských nivách.<br>" +
                            "Vstúpme teda do Pánovho príbytku <font color='#B71C1C'>*</font><br>" +
                            "a padnime k podnožke jeho nôh.<font color='#B71C1C'> – R.</font><br>" +
                            "Zaujmi, Pane, miesto svojho odpočinku, <font color='#B71C1C'>*</font><br>" +
                            "ty a archa tvojej všemoci.<br>" +
                            "Tvoji kňazi nech sa odejú do spravodlivosti <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech plesajú.<br>" +
                            "Pre svojho služobníka Dávida <font color='#B71C1C'>*</font><br>" +
                            "neodmietaj tvár svojho pomazaného.<font color='#B71C1C'> – R.</font>"},
            {"5", "2", "1", "Ž 8, 4-5. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pane, náš Vládca, aké vznešené je tvoje meno na celej zemi!<br><br>" +
                            "Keď hľadím na nebesia, dielo tvojich rúk, <font color='#B71C1C'>*</font><br>" +
                            "na mesiac a na hviezdy, ktoré si ty stvoril:<br>" +
                            "čože je človek, že naň pamätáš, <font color='#B71C1C'>*</font><br>" +
                            "a syn človeka, že sa ho ujímaš?<font color='#B71C1C'> – R.</font><br>" +
                            "Stvoril si ho len o niečo menšieho od anjelov, <font color='#B71C1C'>*</font><br>" +
                            "slávou a cťou si ho ovenčil<br>" +
                            "a ustanovil si ho za vládcu nad dielami tvojich rúk. <font color='#B71C1C'>*</font><br>" +
                            "Všetko si mu položil pod nohy:<font color='#B71C1C'> – R.</font><br>" +
                            "ovce a všetok domáci statok <font color='#B71C1C'>*</font><br>" +
                            "aj všetku poľnú zver,<br>" +
                            "vtáctvo pod oblohou a ryby v mori <font color='#B71C1C'>*</font><br>" +
                            "i všetko, čo sa hýbe po dne morskom.<font color='#B71C1C'> – R.</font>"},
            {"5", "2", "2", "Ž 84, 3. 4. 5+10. 11",
                    "<font color='#B71C1C'>R.:</font> Aké milé sú tvoje príbytky, Pane zástupov!<br><br>" +
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
                            "a pozri na tvár svojho pomazaného.<font color='#B71C1C'> – R.</font><br>" +
                            "Jeden deň v tvojich nádvoriach je lepší <font color='#B71C1C'>*</font><br>" +
                            "než iných tisíce.<br>" +
                            "Radšej chcem stáť na prahu domu svojho Boha <font color='#B71C1C'>*</font><br>" +
                            "ako prebývať v stanoch hriešnikov.<font color='#B71C1C'> – R.</font>"},
            {"5", "3", "1", "Ž 104, 1-2a. 27-28. 29b-30",
                    "<font color='#B71C1C'>R.:</font> Duša moja, veleb Pána; on je nesmierne veľký.<br><br>" +
                            "Dobroreč, duša moja, Pánovi; <font color='#B71C1C'>*</font><br>" +
                            "Pane, Bože môj, ty si nesmierne veľký.<br>" +
                            "Odel si sa do slávy a veleby, <font color='#B71C1C'>*</font><br>" +
                            "do svetla si sa zahalil ako do rúcha.<font color='#B71C1C'> – R.</font><br>" +
                            "Všetko to čaká na teba, <font color='#B71C1C'>*</font><br>" +
                            "že im dáš pokrm v pravý čas.<br>" +
                            "Ty im ho dávaš a ony ho zbierajú; <font color='#B71C1C'>*</font><br>" +
                            "otváraš svoju ruku, sýtia sa dobrotami.<font color='#B71C1C'> – R.</font><br>" +
                            "Odnímaš im dych a hneď hynú <font color='#B71C1C'>*</font><br>" +
                            "a vracajú sa do prachu.<br>" +
                            "Keď zošleš svojho ducha, sú stvorené <font color='#B71C1C'>*</font><br>" +
                            "a obnovuješ tvárnosť zeme.<font color='#B71C1C'> – R.</font>"},
            {"5", "4", "2", "Ž 37, 5-6. 30-31. 39-40",
                    "<font color='#B71C1C'>R.:</font> Z úst spravodlivého zaznieva múdrosť.<br><br>" +
                            "Pánovi zver svoje cesty a jemu dôveruj, <font color='#B71C1C'>*</font><br>" +
                            "on sa už postará.<br>" +
                            "Tvoju spravodlivosť vyvedie na povrch ako svetlo <font color='#B71C1C'>*</font><br>" +
                            "a tvoje právo ako poludňajší jas.<font color='#B71C1C'> – R.</font><br>" +
                            "Z úst spravodlivého zaznieva múdrosť <font color='#B71C1C'>*</font><br>" +
                            "a jeho jazyk hovorí, čo je správne.<br>" +
                            "V jeho srdci je zákon Boží <font color='#B71C1C'>*</font><br>" +
                            "a jeho kroky nezakolíšu.<font color='#B71C1C'> – R.</font><br>" +
                            "Spása spravodlivých prichádza od Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je ich ochrancom v čase súženia.<br>" +
                            "Pán im pomôže a oslobodí ich, <font color='#B71C1C'>†</font><br>" +
                            "vytrhne ich z rúk hriešnikov a zachráni ich, <font color='#B71C1C'>*</font><br>" +
                            "lebo sa spoliehajú na neho.<font color='#B71C1C'> – R.</font>"},
            {"5", "4", "1", "Ž 128, 1-2. 3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Blažení sú všetci, čo sa boja Pána.<br><br>" +
                            "Blažený každý, čo sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a kráča po jeho cestách.<br>" +
                            "Budeš jesť z práce svojich rúk; <font color='#B71C1C'>*</font><br>" +
                            "budeš šťastný a budeš sa mať dobre.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoja manželka je ako plodonosný vinič <font color='#B71C1C'>*</font><br>" +
                            "vnútri tvojho domu.<br>" +
                            "Tvoji synovia sú ako mládniky olivy <font color='#B71C1C'>*</font><br>" +
                            "okolo tvojho stola.<font color='#B71C1C'> – R.</font><br>" +
                            "Veru, tak bude požehnaný muž, <font color='#B71C1C'>*</font><br>" +
                            "ktorý sa bojí Pána.<br>" +
                            "Nech ťa žehná Pán zo Siona, <font color='#B71C1C'>†</font><br>" +
                            "aby si videl šťastie Jeruzalema <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni svojho života.<font color='#B71C1C'> – R.</font>"},
            {"5", "4", "2", "Ž 106, 3-4. 35-36. 37+40",
                    "<font color='#B71C1C'>R.:</font> Pamätaj na nás, Pane, z lásky k svojmu ľudu.<br><br>" +
                            "Blažení sú tí, čo zachovávajú právo <font color='#B71C1C'>*</font><br>" +
                            "a konajú spravodlivo v každý čas.<br>" +
                            "Pamätaj na nás, Pane, z lásky k svojmu ľudu, <font color='#B71C1C'>*</font><br>" +
                            "navštív nás svojou spásou.<font color='#B71C1C'> – R.</font><br>" +
                            "Zmiešali sa s pohanmi <font color='#B71C1C'>*</font><br>" +
                            "a osvojili si ich správanie.<br>" +
                            "Uctievali sošky ich bôžikov <font color='#B71C1C'>*</font><br>" +
                            "a tie sa im stali osídlom.<font color='#B71C1C'> – R.</font><br>" +
                            "Synov a dcéry <font color='#B71C1C'>*</font><br>" +
                            "obetovali zlým duchom.<br>" +
                            "Pán vzplanul hnevom proti svojmu ľudu, <font color='#B71C1C'>*</font><br>" +
                            "až sa mu sprotivilo jeho dedičstvo.<font color='#B71C1C'> – R.</font>"},
            {"5", "5", "1", "Ž 32, 1-2. 5. 6. 7",
                    "<font color='#B71C1C'>R.:</font> Odpusť mi, Pane, vinu môjho hriechu.<br><br>" +
                            "Blažený, komu sa odpustila neprávosť <font color='#B71C1C'>*</font><br>" +
                            "a je oslobodený od hriechu.<br>" +
                            "Blažený človek, ktorému Pán vinu nepripočíta <font color='#B71C1C'>*</font><br>" +
                            "a v ktorého mysli niet podvodu.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyznal som sa ti zo svojho hriechu <font color='#B71C1C'>*</font><br>" +
                            "a nezatajil som svoj priestupok.<br>" +
                            "Povedal som si: \"Vyznám Pánovi svoju neprávosť.\" <font color='#B71C1C'>*</font><br>" +
                            "A ty si mi odpustil zlobu môjho hriechu.<font color='#B71C1C'> – R.</font><br>" +
                            "Preto každý nábožný bude sa modliť k tebe <font color='#B71C1C'>*</font><br>" +
                            "v čase tiesne.<br>" +
                            "A záplavy veľkých vôd <font color='#B71C1C'>*</font><br>" +
                            "sa k nemu nepriblížia.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty si moje útočište, ochrániš ma pred súžením; <font color='#B71C1C'>*</font><br>" +
                            "zahrnieš ma radosťou zo spásy.<font color='#B71C1C'> – R.</font>"},
            {"5", "5", "2", "Ž 81, 10-11b. 12-13. 14-15",
                    "<font color='#B71C1C'>R.:</font> Pane, daj, aby sme počúvali tvoj hlas.<br><br>" +
                            "Nebudeš mať iného boha, <font color='#B71C1C'>*</font><br>" +
                            "ani sa nebudeš klaňať bohu cudziemu.<br>" +
                            "Veď ja som Pán, tvoj Boh, <font color='#B71C1C'>*</font><br>" +
                            "ja som ťa vyviedol z egyptskej krajiny.<font color='#B71C1C'> – R.</font><br>" +
                            "Ale môj ľud nepočúval na môj hlas <font color='#B71C1C'>*</font><br>" +
                            "a Izrael nedbal o mňa.<br>" +
                            "Preto som ich ponechal v tvrdosti ich srdca: <font color='#B71C1C'>*</font><br>" +
                            "nech si len idú za svojimi preludmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Keby ma môj ľud bol poslúchol, <font color='#B71C1C'>*</font><br>" +
                            "keby bol Izrael kráčal mojimi cestami,<br>" +
                            "ihneď by som bol jeho nepriateľov pokoril <font color='#B71C1C'>*</font><br>" +
                            "a jeho utláčateľov svojou rukou pritlačil.<font color='#B71C1C'> – R.</font>"},
            {"5", "6", "1", "Ž 90, 2. 3-4. 5-6. 12-13",
                    "<font color='#B71C1C'>R.:</font> Pane, stal si sa nám útočišťom z pokolenia na pokolenie.<br><br>" +
                            "Prv než sa vrchy zrodili <font color='#B71C1C'>†</font><br>" +
                            "a povstali zem i svet, <font color='#B71C1C'>*</font><br>" +
                            "ty, Bože, si od vekov až naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Človeka vraciaš do prachu <font color='#B71C1C'>*</font><br>" +
                            "a hovoríš: \"Vráťte sa, synovia človeka!\"<br>" +
                            "Veď tisíc rokov je u teba ako deň včerajší,<br>" +
                            "čo sa pominul, <font color='#B71C1C'>*</font><br>" +
                            "a ako jedna nočná stráž.<font color='#B71C1C'> – R.</font><br>" +
                            "Uchvacuješ ich: sú ako ranný sen; <font color='#B71C1C'>*</font><br>" +
                            "sú ako bylina v rozpuku:<br>" +
                            "ráno kvitne a rastie, <font color='#B71C1C'>*</font><br>" +
                            "večer vädne a usychá.<font color='#B71C1C'> – R.</font><br>" +
                            "A tak nás nauč rátať naše dni, <font color='#B71C1C'>*</font><br>" +
                            "aby sme našli múdrosť srdca.<br>" +
                            "Obráť sa k nám, Pane; dokedy budeš meškať? <font color='#B71C1C'>*</font><br>" +
                            "Zľutuj sa nad svojimi služobníkmi.<font color='#B71C1C'> – R.</font>"},
            {"5", "6", "2", "Ž 106, 6-7a. 19-20. 21-22",
                    "<font color='#B71C1C'>R.:</font> Pamätaj na nás, Pane, z lásky k svojmu ľudu.<br><br>" +
                            "Hrešili sme ako naši otcovia, <font color='#B71C1C'>†</font><br>" +
                            "konali sme bezbožne, páchali sme neprávosť. <font color='#B71C1C'>*</font><br>" +
                            "Naši otcovia v Egypte nechápali tvoje zázraky.<font color='#B71C1C'> – R.</font><br>" +
                            "Urobili si teľa na Horebe <font color='#B71C1C'>*</font><br>" +
                            "a klaňali sa soche uliatej;<br>" +
                            "i zamenili svoju slávu <font color='#B71C1C'>*</font><br>" +
                            "za podobu býka, ktorý trávu požiera.<font color='#B71C1C'> – R.</font><br>" +
                            "Zabudli na Boha, svojho záchrancu, <font color='#B71C1C'>*</font><br>" +
                            "ktorý vykonal veľké divy v Egypte,<br>" +
                            "zázraky v Chámovej krajine, <font color='#B71C1C'>*</font><br>" +
                            "v Červenom mori skutky úžasné.<font color='#B71C1C'> – R.</font>"},
            {"6", "A", "", "Ž 119, 1-2. 4-5. 17-18. 33-34",
                    "<font color='#B71C1C'>R.:</font> Blažení tí, čo kráčajú podľa zákona Pánovho.<br><br>" +
                            "Blažení tí, čo idú cestou života bez poškvrny, <font color='#B71C1C'>*</font><br>" +
                            "čo kráčajú podľa zákona Pánovho.<br>" +
                            "Blažení tí, čo zachovávajú jeho príkazy <font color='#B71C1C'>*</font><br>" +
                            "a celým srdcom ho vyhľadávajú.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty si dal príkazy, <font color='#B71C1C'>*</font><br>" +
                            "aby sa verne plnili.<br>" +
                            "Kiež by ma moje cesty viedli tak, <font color='#B71C1C'>*</font><br>" +
                            "žeby som zachovával tvoje ustanovenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Preukáž dobro svojmu služobníkovi a budem žiť <font color='#B71C1C'>*</font><br>" +
                            "a tvoje slová zachovám.<br>" +
                            "Otvor mi oči, <font color='#B71C1C'>*</font><br>" +
                            "aby som pozoroval divy tvojho zákona.<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, ukáž mi cestu svojich prikázaní <font color='#B71C1C'>*</font><br>" +
                            "a ja vždy pôjdem po nej.<br>" +
                            "Daj mi chápavosť a ja tvoj zákon zachovám <font color='#B71C1C'>*</font><br>" +
                            "a celým srdcom sa ho budem pridŕžať.<font color='#B71C1C'> – R.</font>"},
            {"6", "B", "", "Ž 32, 1-2. 5. 11",
                    "<font color='#B71C1C'>R.:</font> Ty, Pane, si moje útočište; zahŕňaš ma radosťou zo spásy.<br><br>" +
                            "Blažený, komu sa odpustila neprávosť <font color='#B71C1C'>*</font><br>" +
                            "a je oslobodený od hriechu.<br>" +
                            "Blažený človek, ktorému Pán vinu nepripočíta <font color='#B71C1C'>*</font><br>" +
                            "a v ktorého mysli niet podvodu.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyznal som sa ti zo svojho hriechu <font color='#B71C1C'>*</font><br>" +
                            "a nezatajil som svoj priestupok.<br>" +
                            "Povedal som si: \"Vyznám Pánovi svoju neprávosť.\" <font color='#B71C1C'>*</font><br>" +
                            "A ty si mi odpustil zlobu môjho hriechu.<font color='#B71C1C'> – R.</font><br>" +
                            "Radujte sa, spravodliví, v Pánovi a plesajte, <font color='#B71C1C'>*</font><br>" +
                            "jasajte všetci, čo máte srdce úprimné.<font color='#B71C1C'> – R.</font>"},
            {"6", "C", "", "Ž 1, 1-2. 3. 4+6",
                    "<font color='#B71C1C'>R.:</font> Blažený človek, čo v Pána skladá dôveru.<br><br>" +
                            "Blažený človek, čo nekráča podľa rady bezbožných <font color='#B71C1C'>†</font><br>" +
                            "a nechodí cestou hriešnikov, <font color='#B71C1C'>*</font><br>" +
                            "ani nevysedáva v kruhu rúhačov,<br>" +
                            "ale v zákone Pánovom má záľubu <font color='#B71C1C'>*</font><br>" +
                            "a o jeho zákone rozjíma dňom i nocou.<font color='#B71C1C'> – R.</font><br>" +
                            "Je ako strom zasadený pri vode, <font color='#B71C1C'>*</font><br>" +
                            "čo prináša ovocie v pravý čas,<br>" +
                            "a jeho lístie nikdy nevädne; <font color='#B71C1C'>*</font><br>" +
                            "darí sa mu všetko, čo podniká.<font color='#B71C1C'> – R.</font><br>" +
                            "No nie tak bezbožní, veru nie; <font color='#B71C1C'>*</font><br>" +
                            "tí sú ako plevy, čo vietor ženie pred sebou.<br>" +
                            "Nad cestou spravodlivých bedlí Pán, <font color='#B71C1C'>*</font><br>" +
                            "ale cesta bezbožných vedie do záhuby.<font color='#B71C1C'> – R.</font>"},
            {"6", "1", "1", "Ž 50, 1+8. 16b-17. 20-21",
                    "<font color='#B71C1C'>R.:</font> Prijmi od nás, Pane, obetu chvály.<br><br>" +
                            "Zvrchovaný Boh, Pán, prehovoril <font color='#B71C1C'>*</font><br>" +
                            "a vyzval zem od východu slnka až po jeho západ:<br>" +
                            "\"Neobviňujem ťa pre tvoje obety, <font color='#B71C1C'>*</font><br>" +
                            "veď tvoje žertvy stále sú predo mnou.<font color='#B71C1C'> – R.</font><br>" +
                            "Prečo odriekaš moje príkazy <font color='#B71C1C'>*</font><br>" +
                            "a moju zmluvu v ústach omieľaš?<br>" +
                            "Veď ty nenávidíš poriadok <font color='#B71C1C'>*</font><br>" +
                            "a moje slovo odmietaš.<font color='#B71C1C'> – R.</font><br>" +
                            "Vysedávaš si a ohováraš svojho brata, <font color='#B71C1C'>*</font><br>" +
                            "syna svojej matky potupuješ.<br>" +
                            "Toto páchaš, a ja by som mal mlčať? <font color='#B71C1C'>†</font><br>" +
                            "Myslíš si, že ja som ako ty: <font color='#B71C1C'>*</font><br>" +
                            "teraz ťa obviňujem a hovorím ti to do očí.\"<font color='#B71C1C'> – R.</font>"},
            {"6", "1", "2", "Ž 119, 67. 68. 71. 72. 75. 76",
                    "<font color='#B71C1C'>R.:</font> Nech zostúpi na mňa tvoje zľutovanie, Pane, a budem žiť.<br><br>" +
                            "Pred svojím pokorením som blúdil, <font color='#B71C1C'>*</font><br>" +
                            "no teraz už dbám na tvoje výroky.<font color='#B71C1C'> – R.</font><br>" +
                            "Dobrotivý si a preukazuješ dobrodenia, <font color='#B71C1C'>*</font><br>" +
                            "daj mi poznať tvoju spravodlivosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Že som bol pokorený, dobre mi,*<br>" +
                            "aspoň som si tvoju spravodlivosť osvojil.<font color='#B71C1C'> – R.</font><br>" +
                            "Lepší je pre mňa zákon tvojich úst <font color='#B71C1C'>*</font><br>" +
                            "ako tisícky v zlate a striebre.<font color='#B71C1C'> – R.</font><br>" +
                            "Viem, Pane, že spravodlivé sú tvoje rozsudky <font color='#B71C1C'>*</font><br>" +
                            "a že si ma právom pokoril.<font color='#B71C1C'> – R.</font><br>" +
                            "Buď ku mne milosrdný a poteš ma, <font color='#B71C1C'>*</font><br>" +
                            "ako si prisľúbil svojmu služobníkovi.<font color='#B71C1C'> – R.</font>"},
            {"6", "2", "1", "Ž 29, 1a+2. 3ac-4. 3b+9c-10",
                    "<font color='#B71C1C'>R.:</font> Pán požehná svoj ľud pokojom.<br><br>" +
                            "Vzdávajte Pánovi, synovia Boží, <font color='#B71C1C'>†</font><br>" +
                            "vzdávajte Pánovi slávu hodnu jeho mena, <font color='#B71C1C'>*</font><br>" +
                            "v posvätnom rúchu klaňajte sa pánovi.<font color='#B71C1C'> – R.</font><br>" +
                            "Hlas Pánov nad vodami; <font color='#B71C1C'>*</font><br>" +
                            "Pán nad veľkými vodami!<br>" +
                            "Hlas Pánov taký mohutný! <font color='#B71C1C'>*</font><br>" +
                            "Hlas Pánov taký veľkolepý!<font color='#B71C1C'> – R.</font><br>" +
                            "Zahrmel Boh veleby <font color='#B71C1C'>*</font><br>" +
                            "a v jeho chráme všetci volajú: Sláva!<br>" +
                            "Pán tróni nad záplavami vôd, <font color='#B71C1C'>*</font><br>" +
                            "Pán bude tróniť ako večný kráľ.<font color='#B71C1C'> – R.</font>"},
            {"6", "2", "1", "Ž 94, 12-13a. 14-15. 18-19",
                    "<font color='#B71C1C'>R.:</font> Blažený človek, ktorého ty, Pane, vzdelávaš.<br><br>" +
                            "Blažený človek, ktorého ty, Pane, vzdelávaš <font color='#B71C1C'>†</font><br>" +
                            "a poúčaš o svojom zákone, <font color='#B71C1C'>*</font><br>" +
                            "aby si mu uľavil v dňoch nešťastných.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán neodvrhne svoj ľud <font color='#B71C1C'>*</font><br>" +
                            "a neopustí svoje dedičstvo.<br>" +
                            "Súd sa zasa navráti k spravodlivosti <font color='#B71C1C'>*</font><br>" +
                            "a spravodlivosťou sa budú riadiť všetci statoční.<font color='#B71C1C'> – R.</font><br>" +
                            "Ledva poviem: \"Noha sa mi potkýna,\" <font color='#B71C1C'>*</font><br>" +
                            "hneď ma, Pane, podopiera tvoja dobrota.<br>" +
                            "A keď sa v mojom srdci kopia starosti, <font color='#B71C1C'>*</font><br>" +
                            "vzpružuje ma tvoja potecha.<font color='#B71C1C'> – R.</font>"},
            {"6", "3", "1", "Ž 116, 12-13. 14-15. 18-19",
                    "<font color='#B71C1C'>R.:</font> Prinesiem ti, Pane, obetu chvály.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Čím sa odvďačím Pánovi <font color='#B71C1C'>*</font><br>" +
                            "za všetko, čo mi dal?<br>" +
                            "Vezmem kalich spásy <font color='#B71C1C'>*</font><br>" +
                            "a budem vzývať meno Pánovo.<font color='#B71C1C'> – R.</font><br>" +
                            "Pánovi splním svoje sľuby <font color='#B71C1C'>*</font><br>" +
                            "pred všetkým jeho ľudom.<br>" +
                            "V Pánových očiach má veľkú cenu <font color='#B71C1C'>*</font><br>" +
                            "smrť jeho svätých.<font color='#B71C1C'> – R.</font><br>" +
                            "Splním svoje sľuby Pánovi <font color='#B71C1C'>*</font><br>" +
                            "pred všetkým jeho ľudom<br>" +
                            "v nádvoriach domu Pánovho <font color='#B71C1C'>*</font><br>" +
                            "uprostred teba, Jeruzalem.<font color='#B71C1C'> – R.</font>"},
            {"6", "3", "2", "Ž 15, 2-3a. 3b-4b. 5",
                    "<font color='#B71C1C'>R.:</font> Pane, kto môže nájsť odpočinok na tvojom svätom vrchu?<br><br>" +
                            "Ten, čo kráča bez poškvrny a koná spravodlivo, <font color='#B71C1C'>†</font><br>" +
                            "čo z úprimného srdca pravdu hovorí, <font color='#B71C1C'>*</font><br>" +
                            "čo nepodvádza svojím jazykom.<font color='#B71C1C'> – R.</font><br>" +
                            "Čo nekrivdí svojmu blížnemu, <font color='#B71C1C'>*</font><br>" +
                            "ani ho nepotupuje.<br>" +
                            "Čo ničomníka nemá za nič, <font color='#B71C1C'>*</font><br>" +
                            "ale ctí si ľudí bohabojných.<font color='#B71C1C'> – R.</font><br>" +
                            "Čo nepožičiava peniaze na úrok <font color='#B71C1C'>†</font><br>" +
                            "a proti nevinnému sa nedá podplácať. <font color='#B71C1C'>*</font><br>" +
                            "Kto si tak počína, ten sa nikdy neskláti.<font color='#B71C1C'> – R.</font>"},
            {"6", "4", "1", "Ž 102, 16-18. 19-21. 29+22-23",
                    "<font color='#B71C1C'>R.:</font> Pán z nebies pozerá na našu zem.<br><br>" +
                            "Tvojho mena, Pane, budú sa báť pohania <font color='#B71C1C'>*</font><br>" +
                            "a tvojej slávy všetci zemskí králi;<br>" +
                            "lebo Pán vystaví Sion <font color='#B71C1C'>*</font><br>" +
                            "a zjaví sa vo svojej sláve.<br>" +
                            "Zhliadne na modlitbu núdznych <font color='#B71C1C'>*</font><br>" +
                            "a nepohrdne ich prosbami.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa to zaznačí pre pokolenie budúce <font color='#B71C1C'>*</font><br>" +
                            "a obnovený ľud oslávi Pána.<br>" +
                            "Veď Pán hľadí zo svojej vznešenej svätyne <font color='#B71C1C'>*</font><br>" +
                            "a z nebies pozerá na zem;<br>" +
                            "čuje nárek zajatých <font color='#B71C1C'>*</font><br>" +
                            "a odsúdeným na smrť vracia slobodu.<font color='#B71C1C'> – R.</font><br>" +
                            "Deti tvojich služobníkov budú bývať v bezpečí <font color='#B71C1C'>*</font><br>" +
                            "a ich potomstvo bude pevné pred tebou,<br>" +
                            "aby na Sione hlásali meno Pánovo <font color='#B71C1C'>*</font><br>" +
                            "a v Jeruzaleme jeho slávu,<br>" +
                            "keď sa tam zídu vospolok národy <font color='#B71C1C'>*</font><br>" +
                            "a kráľovstvá, aby slúžili Pánovi.<font color='#B71C1C'> – R.</font>"},
            {"6", "4", "2", "Ž 34, 2-3. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Úbožiak zavolal a Pán ho vyslyšal.<br><br>" +
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
                            "a vyslobodil ho zo všetkých tiesní.<font color='#B71C1C'> – R.</font>"},
            {"6", "5", "1", "Ž 33, 10-11. 12-13. 14-15",
                    "<font color='#B71C1C'>R.:</font> Blažený ľud, ktorý patrí Pánovi.<br><br>" +
                            "Pán marí úmysly pohanov, <font color='#B71C1C'>*</font><br>" +
                            "navnivoč privádza myšlienky národov.<br>" +
                            "Ale Pánov úmysel trvá naveky, <font color='#B71C1C'>*</font><br>" +
                            "myšlienky jeho srdca z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font><br>" +
                            "Blažený národ, ktorého Bohom je Pán, <font color='#B71C1C'>*</font><br>" +
                            "blažený ľud, ktorý si on vyvolil za dedičstvo.<br>" +
                            "Pán hľadí z neba <font color='#B71C1C'>*</font><br>" +
                            "a vidí všetkých ľudí.<font color='#B71C1C'> – R.</font><br>" +
                            "Pozerá z miesta, kde prebýva, <font color='#B71C1C'>*</font><br>" +
                            "na všetkých obyvateľov zeme,<br>" +
                            "on, čo každému osve utvoril srdce <font color='#B71C1C'>*</font><br>" +
                            "a chápe všetky ich skutky.<font color='#B71C1C'> – R.</font>"},
            {"6", "5", "2", "Ž 112, 1-2. 3-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Blažený muž, ktorý sa bojí Pána.<br><br>" +
                            "Blažený muž, ktorý sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a má veľkú záľubu v jeho príkazoch.<br>" +
                            "Jeho potomstvo bude mocné na zemi; <font color='#B71C1C'>*</font><br>" +
                            "pokolenie spravodlivých bude požehnané.<font color='#B71C1C'> – R.</font><br>" +
                            "V jeho dome bude úspech a bohatstvo, <font color='#B71C1C'>*</font><br>" +
                            "jeho spravodlivosť ostane naveky.<br>" +
                            "Spravodlivým žiari svetlo v temnotách, <font color='#B71C1C'>*</font><br>" +
                            "milosrdný, milostivý a spravodlivý.<font color='#B71C1C'> – R.</font><br>" +
                            "V obľube je človek, čo sa zľutúva a rád pomáha, <font color='#B71C1C'>*</font><br>" +
                            "čo svoj majetok čestne spravuje;<br>" +
                            "nikdy nezakolíše. <font color='#B71C1C'>*</font><br>" +
                            "vo večnej pamäti bude spravodlivý.<font color='#B71C1C'> – R.</font>"},
            {"6", "6", "1", "Ž 145, 2-3. 4-5. 10-11",
                    "<font color='#B71C1C'>R.:</font> Oslavovať ťa chcem naveky, Bože, môj kráľ.<br><br>" +
                            "Budem ťa velebiť každý deň <font color='#B71C1C'>†</font><br>" +
                            "a tvoje meno chváliť <font color='#B71C1C'>*</font><br>" +
                            "navždy a naveky.<br>" +
                            "Veľký si, Pane, a veľkej chvály hoden, <font color='#B71C1C'>*</font><br>" +
                            "tvoju veľkosť nemožno preskúmať.<font color='#B71C1C'> – R.</font><br>" +
                            "Z pokolenia na pokolenie ide chvála tvojich skutkov <font color='#B71C1C'>*</font><br>" +
                            "a všetky pokolenia ohlasujú tvoju moc.<br>" +
                            "Hovoria o vznešenosti tvojej slávy a veleby <font color='#B71C1C'>*</font><br>" +
                            "a rozprávajú o tvojich zázrakoch.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech ťa oslavujú, Pane, všetky tvoje diela <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech ťa velebia.<br>" +
                            "Nech rozprávajú o sláve tvojho kráľovstva <font color='#B71C1C'>*</font><br>" +
                            "a o tvojej moci nech hovoria.<font color='#B71C1C'> – R.</font>"},
            {"6", "6", "2", "Ž 12, 2-3. 4-5. 7-8b",
                    "<font color='#B71C1C'>R.:</font> Pane, ty nás zachováš a ochrániš<br><br>" +
                            "Pomôž mi, Pane, lebo niet už svätých, <font color='#B71C1C'>*</font><br>" +
                            "stratila sa vernosť medzi ľuďmi.<br>" +
                            "Falošnými slovami sa klamú všetci navzájom, <font color='#B71C1C'>*</font><br>" +
                            "hovoria úlisnými perami a srdce majú dvojtvárne.<font color='#B71C1C'> – R.</font><br>" +
                            "Kiež Pán zničí všetky pery úlisné <font color='#B71C1C'>*</font><br>" +
                            "a vystatovačný jazyk;<br>" +
                            "lebo hovoria: \"Náš jazyk nás preslávi, <font color='#B71C1C'>†</font><br>" +
                            "ústa sú nám zbraňou; <font color='#B71C1C'>*</font><br>" +
                            "ktože je pánom nad nami?\"<font color='#B71C1C'> – R.</font><br>" +
                            "Pánove výroky sú rýdze <font color='#B71C1C'>*</font><br>" +
                            "jak striebro pretavené v ohni, bez hliny,<br>" +
                            "sedem ráz čistené.<br>" +
                            "Pane, ty nás zachováš a ochrániš <font color='#B71C1C'>*</font><br>" +
                            "pred týmto pokolením naveky.<font color='#B71C1C'> – R.</font>"},
            {"7", "A", "", "Ž 103, 1-2. 3-4. 8+10. 12-13",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď on ti odpúšťa všetky neprávosti, <font color='#B71C1C'>*</font><br>" +
                            "on lieči všetky tvoje neduhy;<br>" +
                            "on vykupuje tvoj život zo záhuby, <font color='#B71C1C'>*</font><br>" +
                            "on ťa venčí milosrdenstvom a milosťou.<font color='#B71C1C'> – R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a dobrotivý nesmierne.<br>" +
                            "Nezaobchodí s nami podľa našich hriechov, <font color='#B71C1C'>*</font><br>" +
                            "ani nám neodpláca podľa našich neprávostí.<font color='#B71C1C'> – R.</font><br>" +
                            "Ako je vzdialený východ od západu, <font color='#B71C1C'>*</font><br>" +
                            "tak vzďaľuje od nás našu neprávosť.<br>" +
                            "Ako sa otec zmilúva nad deťmi, <font color='#B71C1C'>*</font><br>" +
                            "tak sa Pán zmilúva nad tými, čo sa ho boja.<font color='#B71C1C'> – R.</font>"},
            {"7", "B", "", "Ž 41, 2-3. 4-5. 13-14",
                    "<font color='#B71C1C'>R.:</font> Uzdrav ma, Pane, zhrešil som proti tebe.<br><br>" +
                            "Blažený, kto pamätá na bedára; <font color='#B71C1C'>*</font><br>" +
                            "v deň nešťastia ho vyslobodí Pán.<br>" +
                            "Pán ho bude chrániť, zachová ho nažive, <font color='#B71C1C'>†</font><br>" +
                            "urobí ho šťastným na zemi <font color='#B71C1C'>*</font><br>" +
                            "a nevydá ho nepriateľom napospas.<font color='#B71C1C'> – R.</font><br>" +
                            "Na lôžku bolesti Pán mu pomoc poskytne, <font color='#B71C1C'>*</font><br>" +
                            "v chorobe sníme z neho všetku slabosť.<br>" +
                            "Volám: \"Pane, zmiluj sa nado mnou, <font color='#B71C1C'>*</font><br>" +
                            "uzdrav moju dušu, zhrešil som proti tebe.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Ty sa ma ujmeš, lebo som nevinný, <font color='#B71C1C'>*</font><br>" +
                            "a naveky ma postavíš pred svoju tvár.<br>" +
                            "Nech je zvelebený Pán, Boh Izraela, <font color='#B71C1C'>*</font><br>" +
                            "od vekov až naveky. Staň sa. Amen.<font color='#B71C1C'> – R.</font>"},
            {"7", "C", "", "Ž 103, 1-2. 3-4. 8+10. 12-13",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď on ti odpúšťa všetky neprávosti, <font color='#B71C1C'>*</font><br>" +
                            "on lieči všetky tvoje neduhy;<br>" +
                            "on vykupuje tvoj život zo záhuby, <font color='#B71C1C'>*</font><br>" +
                            "on ťa venčí milosrdenstvom a milosťou.<font color='#B71C1C'> – R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a dobrotivý nesmierne.<br>" +
                            "Nezaobchodí s nami podľa našich hriechov, <font color='#B71C1C'>*</font><br>" +
                            "ani nám neodpláca podľa našich neprávostí.<font color='#B71C1C'> – R.</font><br>" +
                            "Ako je vzdialený východ od západu, <font color='#B71C1C'>*</font><br>" +
                            "tak vzďaľuje od nás našu neprávosť.<br>" +
                            "Ako sa otec zmilúva nad deťmi, <font color='#B71C1C'>*</font><br>" +
                            "tak sa Pán zmilúva nad tými, čo sa ho boja.<font color='#B71C1C'> – R.</font>"},
            {"7", "1", "1", "Ž 93, 1ab. 1c-2. 5",
                    "<font color='#B71C1C'>R.:</font> Náš Pán kraľuje, oslavujme ho.<br><br>" +
                            "Pán kraľuje, velebou sa zaodel; <font color='#B71C1C'>*</font><br>" +
                            "zaodel sa Pán, udatnosťou sa prepásal.<font color='#B71C1C'> – R.</font><br>" +
                            "Tak upevnil zemekruh, že sa nezachveje. <font color='#B71C1C'>*</font><br>" +
                            "Pevný je tvoj trón oddávna, ty si od vekov.<font color='#B71C1C'> – R.</font><br>" +
                            "Veľmi vierohodné sú tvoje svedectvá; <font color='#B71C1C'>*</font><br>" +
                            "tvojmu domu, Pane,<br>" +
                            "patrí posvätná úcta po všetky časy.<font color='#B71C1C'> – R.</font>"},
            {"7", "1", "2", "Ž 19, 8. 9. 10. 15",
                    "<font color='#B71C1C'>R.:</font> Rozhodnutia Pánove sú správne, potešujú srdce.<br><br>" +
                            "Zákon Pánov je dokonalý, <font color='#B71C1C'>*</font><br>" +
                            "osviežuje dušu.<br>" +
                            "Svedectvo Pánovo je hodnoverné, <font color='#B71C1C'>*</font><br>" +
                            "dáva múdrosť maličkým.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozhodnutia Pánove sú správne, <font color='#B71C1C'>*</font><br>" +
                            "potešujú srdce.<br>" +
                            "Prikázania Pánove sú jasné, <font color='#B71C1C'>*</font><br>" +
                            "osvecujú oči.<font color='#B71C1C'> – R.</font><br>" +
                            "Bázeň pred Pánom je úprimná, <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky.<br>" +
                            "Výroky Pánove sú pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a všetky spravodlivé.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa ti páčia slová mojich úst <font color='#B71C1C'>†</font><br>" +
                            "i rozjímanie môjho srdca pred tvojou tvárou. <font color='#B71C1C'>*</font><br>" +
                            "Pane, ty si moja pomoc a môj vykupiteľ.<font color='#B71C1C'> – R.</font>"},
            {"7", "2", "1", "Ž 37, 3-4. 18-19. 27-28. 39-40",
                    "<font color='#B71C1C'>R.:</font> Pánovi zver svoje cesty, on sa už postará.<br><br>" +
                            "Spoľahni sa na Pána a dobre rob <font color='#B71C1C'>*</font><br>" +
                            "a budeš bývať v svojej krajine a tešiť sa z bezpečia.<br>" +
                            "Hľadaj radosť v Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a dá ti, za čím túži tvoje srdce.<font color='#B71C1C'> – R.</font><br>" +
                            "O život bezúhonných sa stará Pán <font color='#B71C1C'>*</font><br>" +
                            "a ich dedičstvo trvá naveky.<br>" +
                            "V nešťastí zahanbení nebudú <font color='#B71C1C'>*</font><br>" +
                            "a v čase hladu budú nasýtení.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyhýbaj zlu a dobre rob <font color='#B71C1C'>*</font><br>" +
                            "a budeš mať domov naveky.<br>" +
                            "Lebo Pán miluje spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a neopúšťa svojich svätých.<br>" +
                            "Nespravodlivci navždy vyhynú <font color='#B71C1C'>*</font><br>" +
                            "a pokolenie bezbožných bude zničené.<font color='#B71C1C'> – R.</font><br>" +
                            "Spása spravodlivých prichádza od Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je ich ochrancom v čase súženia.<br>" +
                            "Pán im pomôže a oslobodí ich, <font color='#B71C1C'>†</font><br>" +
                            "vytrhne ich z rúk hriešnikov a zachráni ich, <font color='#B71C1C'>*</font><br>" +
                            "lebo sa spoliehajú na neho.<font color='#B71C1C'> – R.</font>"},
            {"7", "2", "2", "Ž 55, 7-8. 9-10a. 10b-11. 23",
                    "<font color='#B71C1C'>R.:</font> Zlož svoju starosť na Pána a on ťa zachová.<br><br>" +
                            "Hovorím si: \"Ktože mi dá holubičie krídla, <font color='#B71C1C'>*</font><br>" +
                            "aby som mohol odletieť a odpočinúť si?<br>" +
                            "Aby som mohol utiecť do diaľav <font color='#B71C1C'>*</font><br>" +
                            "a pobudnúť v samote?\"<font color='#B71C1C'> – R.</font><br>" +
                            "Vyčkávam, kto by ma zachránil <font color='#B71C1C'>†</font><br>" +
                            "pred búrkou a víchricou. <font color='#B71C1C'>*</font><br>" +
                            "Pane, zmäť ich jazyky a rozdeľ;<font color='#B71C1C'> – R.</font><br>" +
                            "bo v meste vidím násilie a hádky. <font color='#B71C1C'>*</font><br>" +
                            "Na jeho hradbách dňom i nocou krúžia dokola.<font color='#B71C1C'> – R.</font><br>" +
                            "Zlož svoju starosť na Pána <font color='#B71C1C'>†</font><br>" +
                            "a on ťa zachová; <font color='#B71C1C'>*</font><br>" +
                            "a nikdy nedopustí, aby bol spravodlivý zmietaný.<font color='#B71C1C'> – R.</font>"},
            {"7", "3", "1", "Ž 119, 165. 168. 171. 172. 174. 175",
                    "<font color='#B71C1C'>R.:</font> Trvalý pokoj požívajú tí, čo milujú tvoj zákon, Pane.<br><br>" +
                            "Trvalý pokoj požívajú tí, čo milujú tvoj zákon; <font color='#B71C1C'>*</font><br>" +
                            "a nemajú sa na čom potknúť.<font color='#B71C1C'> – R.</font><br>" +
                            "Zachovávam tvoje prikázania a ustanovenia: <font color='#B71C1C'>*</font><br>" +
                            "lebo pred tebou sú všetky moje cesty.<font color='#B71C1C'> – R.</font><br>" +
                            "Z perí mi vytryskne chválospev, <font color='#B71C1C'>*</font><br>" +
                            "že si ma naučil svoje ustanovenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Môj jazyk nech spieva o tvojich výrokoch, <font color='#B71C1C'>*</font><br>" +
                            "lebo spravodlivé sú všetky tvoje príkazy.<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, túžim za tvojou pomocou <font color='#B71C1C'>*</font><br>" +
                            "a tvoj zákon je mi slasťou.<font color='#B71C1C'> – R.</font><br>" +
                            "Ja budem žiť a teba chváliť <font color='#B71C1C'>*</font><br>" +
                            "a tvoje rozhodnutia mi pomôžu.<font color='#B71C1C'> – R.</font>"},
            {"7", "3", "2", "Ž 49, 2-3. 6-7. 8-10. 11",
                    "<font color='#B71C1C'>R.:</font> Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo.<br><br>" +
                            "Čujte to, všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "počúvajte, všetci obyvatelia zeme;<br>" +
                            "vy všetci, prostí aj vznešení, <font color='#B71C1C'>*</font><br>" +
                            "všetci vospolok, bohatí aj chudobní.<font color='#B71C1C'> – R.</font><br>" +
                            "Prečo by som sa mal strachovať v dňoch nešťastných, <font color='#B71C1C'>*</font><br>" +
                            "keď ma obkľučuje zloba tých, čo mi chcú nohy podraziť?<br>" +
                            "Pred tými, čo sa spoliehajú na svoju silu <font color='#B71C1C'>*</font><br>" +
                            "a chvastajú sa nadmerným bohatstvom?<font color='#B71C1C'> – R.</font><br>" +
                            "Veď sám seba nevykúpi nik, <font color='#B71C1C'>*</font><br>" +
                            "ani nezaplatí Bohu výkupné za seba.<br>" +
                            "Cena za vykúpenie života je príliš vysoká; <font color='#B71C1C'>†</font><br>" +
                            "nikdy nebude stačiť, <font color='#B71C1C'>*</font><br>" +
                            "aby človek žil naveky a zánik neuzrel.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď vidí, že umierajú aj mudrci <font color='#B71C1C'>†</font><br>" +
                            "rovnako hynie blázon i hlupák <font color='#B71C1C'>*</font><br>" +
                            "a cudzím nechávajú svoje bohatstvo.<font color='#B71C1C'> – R.</font>"},
            {"7", "4", "1", "Ž 1, 1-2. 3. 4+6",
                    "<font color='#B71C1C'>R.:</font> Blažený človek, čo v Pána skladá dôveru.<br><br>" +
                            "Blažený človek, čo nekráča podľa rady bezbožných <font color='#B71C1C'>†</font><br>" +
                            "a nechodí cestou hriešnikov, <font color='#B71C1C'>*</font><br>" +
                            "ani nevysedáva v kruhu rúhačov,<br>" +
                            "ale v zákone Pánovom má záľubu <font color='#B71C1C'>*</font><br>" +
                            "a o jeho zákone rozjíma dňom i nocou.<font color='#B71C1C'> – R.</font><br>" +
                            "Je ako strom zasadený pri vode, <font color='#B71C1C'>*</font><br>" +
                            "čo prináša ovocie v pravý čas,<br>" +
                            "a jeho lístie nikdy nevädne; <font color='#B71C1C'>*</font><br>" +
                            "darí sa mu všetko, čo podniká.<font color='#B71C1C'> – R.</font><br>" +
                            "No nie tak bezbožní, veru nie; <font color='#B71C1C'>*</font><br>" +
                            "tí sú ako plevy, čo vietor ženie pred sebou.<br>" +
                            "Nad cestou spravodlivých bedlí Pán, <font color='#B71C1C'>*</font><br>" +
                            "ale cesta bezbožných vedie do záhuby.<font color='#B71C1C'> – R.</font>"},
            {"7", "4", "2", "Ž 49, 14-15b. 15cd+16. 17-18. 19-20",
                    "<font color='#B71C1C'>R.:</font> Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo.<br><br>" +
                            "Taký je osud tých, čo sa spoliehajú na seba, <font color='#B71C1C'>*</font><br>" +
                            "a koniec tých, čo sa vo vlastných slovách kochajú.<br>" +
                            "Ako ovce sa ženú do priepasti <font color='#B71C1C'>*</font><br>" +
                            "a smrť je ich pastierom.<font color='#B71C1C'> – R.</font><br>" +
                            "Padajú strmhlav do hrobu, <font color='#B71C1C'>*</font><br>" +
                            "ich zjav sa pominie.<br>" +
                            "No moju dušu Boh vykúpi, <font color='#B71C1C'>*</font><br>" +
                            "z moci podsvetia ma iste vezme k sebe.<font color='#B71C1C'> – R.</font><br>" +
                            "Netráp sa, ak niekto bohatne <font color='#B71C1C'>*</font><br>" +
                            "a ak sa poklad jeho domu zväčšuje.<br>" +
                            "Lebo keď zomrie, nič si nevezme so sebou, <font color='#B71C1C'>*</font><br>" +
                            "jeho poklad s ním nepôjde.<font color='#B71C1C'> – R.</font><br>" +
                            "Aj keď si blahoželal za živa: <font color='#B71C1C'>*</font><br>" +
                            "\"Budú ťa chváliť, že si si dobre počínal,\"<br>" +
                            "predsa k pokoleniu svojich otcov musí zostúpiť <font color='#B71C1C'>*</font><br>" +
                            "a tí už nikdy svetlo neuzrú.<font color='#B71C1C'> – R.</font>"},
            {"7", "5", "1", "Ž 119, 12. 16. 18. 27. 34. 35",
                    "<font color='#B71C1C'>R.:</font> Priveď ma, Pane, na chodník svojich príkazov.<br><br>" +
                            "Pane, ty si velebený; <font color='#B71C1C'>*</font><br>" +
                            "nauč ma svoje ustanovenia.<font color='#B71C1C'> – R.</font><br>" +
                            "V tvojich ustanoveniach mám záľubu, <font color='#B71C1C'>*</font><br>" +
                            "na tvoje slová nechcem zabúdať.<font color='#B71C1C'> – R.</font><br>" +
                            "Otvor mi oči, <font color='#B71C1C'>*</font><br>" +
                            "aby som pozoroval divy tvojho zákona.<font color='#B71C1C'> – R.</font><br>" +
                            "Daj, aby som pochopil cestu tvojich príkazov, <font color='#B71C1C'>*</font><br>" +
                            "a budem rozjímať o tvojich<br>" +
                            "obdivuhodných skutkoch.<font color='#B71C1C'> – R.</font><br>" +
                            "Daj mi chápavosť a ja tvoj zákon zachovám <font color='#B71C1C'>*</font><br>" +
                            "a celým srdcom sa ho budem pridŕžať.<font color='#B71C1C'> – R.</font><br>" +
                            "priveď ma na chodník svojich príkazov, <font color='#B71C1C'>*</font><br>" +
                            "lebo som si ho obľúbil.<font color='#B71C1C'> – R.</font>"},
            {"7", "5", "2", "Ž 103, 1-2. 3-4. 8-9. 11-12",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď on ti odpúšťa všetky neprávosti, <font color='#B71C1C'>*</font><br>" +
                            "on lieči všetky tvoje neduhy;<br>" +
                            "on vykupuje tvoj život zo záhuby, <font color='#B71C1C'>*</font><br>" +
                            "on ťa venčí milosrdenstvom a milosťou.<font color='#B71C1C'> – R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a dobrotivý nesmierne.<br>" +
                            "Nevyčíta nám ustavične naše chyby, <font color='#B71C1C'>*</font><br>" +
                            "ani sa nehnevá naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo ako vysoko je nebo od zeme, <font color='#B71C1C'>*</font><br>" +
                            "také veľké je jeho zľutovanie voči tým, čo sa ho boja.<br>" +
                            "Ako je vzdialený východ od západu, <font color='#B71C1C'>*</font><br>" +
                            "tak vzďaľuje od nás našu neprávosť.<font color='#B71C1C'> – R.</font>"},
            {"7", "6", "1", "Ž 103, 13-14. 15-16. 17-18a",
                    "<font color='#B71C1C'>R.:</font> Milosrdenstvo Pánovo je od večnosti voči tým, čo sa ho boja.<br><br>" +
                            "Ako sa otec zmilúva nad deťmi, <font color='#B71C1C'>*</font><br>" +
                            "tak sa Pán zmilúva nad tými, čo sa ho boja.<br>" +
                            "Veď on dobre vie, z čoho sme stvorení; <font color='#B71C1C'>*</font><br>" +
                            "pamätá, že sme iba prach.<font color='#B71C1C'> – R.</font><br>" +
                            "Ako tráva sú dni človeka, <font color='#B71C1C'>*</font><br>" +
                            "odkvitá sťa poľný kvet.<br>" +
                            "Ledva ho vietor oveje, už ho niet, <font color='#B71C1C'>*</font><br>" +
                            "nezostane po ňom ani stopa.<font color='#B71C1C'> – R.</font><br>" +
                            "No milosrdenstvo Pánovo je od večnosti až na večnosť <font color='#B71C1C'>*</font><br>" +
                            "voči tým, čo sa ho boja,<br>" +
                            "a jeho spravodlivosť chráni ich detné deti, <font color='#B71C1C'>*</font><br>" +
                            "tie, čo zachovávajú jeho zmluvu.<font color='#B71C1C'> – R.</font>"},
            {"7", "6", "2", "Ž 141, 1-2. 3+8",
                    "<font color='#B71C1C'>R.:</font> Moja modlitba nech sa vznáša k tebe ako kadidlo.<br><br>" +
                            "Pane, k tebe volám, ponáhľaj sa mi pomôcť, <font color='#B71C1C'>*</font><br>" +
                            "počuj môj hlas, keď volám ku tebe.<br>" +
                            "Moja modlitba nech sa vznáša k tebe ako kadidlo <font color='#B71C1C'>*</font><br>" +
                            "a pozdvihnutie mojich rúk ako večerná obeta.<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, k mojim ústam postav stráž <font color='#B71C1C'>*</font><br>" +
                            "a hliadku na okraj mojich perí.<br>" +
                            "Pane, k tebe, Pane, sa upierajú moje oči: <font color='#B71C1C'>*</font><br>" +
                            "k tebe sa utiekam, smrti ma nevydaj.<font color='#B71C1C'> – R.</font>"},
            {"8", "A", "", "Ž 62, 2-3. 6-7. 8-9b",
                    "<font color='#B71C1C'>R.:</font> Iba v Bohu spočiň, duša moja.<br><br>" +
                            "Iba v Bohu spočiň, duša moja, <font color='#B71C1C'>*</font><br>" +
                            "lebo od neho mi prichádza spása.<br>" +
                            "Iba on je moje útočište a moja spása, <font color='#B71C1C'>*</font><br>" +
                            "moja opora, nezakolíšem sa nikdy viac.<font color='#B71C1C'> – R.</font><br>" +
                            "Iba v Bohu spočiň, duša moja, <font color='#B71C1C'>*</font><br>" +
                            "lebo len on mi dáva nádej.<br>" +
                            "Iba on je moje útočište a moja spása, <font color='#B71C1C'>*</font><br>" +
                            "moja opora, nezakolíšem sa.<font color='#B71C1C'> – R.</font><br>" +
                            "V Bohu je moja spása i sláva; <font color='#B71C1C'>*</font><br>" +
                            "Boh je moja sila a v Bohu je moje útočište.<br>" +
                            "Dúfajte v neho, ľudia, v každom čase, <font color='#B71C1C'>*</font><br>" +
                            "pred ním si srdce otvorte.<font color='#B71C1C'> – R.</font>"},
            {"8", "B", "", "Ž 103, 1-2. 3-4. 8+10. 12-13",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď on ti odpúšťa všetky neprávosti, <font color='#B71C1C'>*</font><br>" +
                            "on lieči všetky tvoje neduhy;<br>" +
                            "on vykupuje tvoj život zo záhuby, <font color='#B71C1C'>*</font><br>" +
                            "on ťa venčí milosrdenstvom a milosťou.<font color='#B71C1C'> – R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a dobrotivý nesmierne.<br>" +
                            "Nezaobchodí s nami podľa našich hriechov, <font color='#B71C1C'>*</font><br>" +
                            "ani nám neodpláca podľa našich neprávostí.<font color='#B71C1C'> – R.</font><br>" +
                            "Ako je vzdialený východ od západu, <font color='#B71C1C'>*</font><br>" +
                            "tak vzďaľuje od nás našu neprávosť.<br>" +
                            "Ako sa otec zmilúva nad deťmi, <font color='#B71C1C'>*</font><br>" +
                            "tak sa Pán zmilúva nad tými, čo sa ho boja.<font color='#B71C1C'> – R.</font>"},
            {"8", "C", "", "Ž 92, 2-3. 13-14. 15-16",
                    "<font color='#B71C1C'>R.:</font> Ako je dobre oslavovať teba, Pane!<br><br>" +
                            "Dobre je oslavovať Pána <font color='#B71C1C'>*</font><br>" +
                            "a ospevovať meno tvoje, Najvyšší;<br>" +
                            "za rána zvestovať tvoju dobrotu <font color='#B71C1C'>*</font><br>" +
                            "a tvoju vernosť celú noc.<font color='#B71C1C'> – R.</font><br>" +
                            "Spravodlivý sťa palma zakvitne <font color='#B71C1C'>*</font><br>" +
                            "a vyrastie sťa céder z Libanonu.<br>" +
                            "Tí, čo vyrastajú v dome Pánovom, <font color='#B71C1C'>*</font><br>" +
                            "v nádvoriach nášho Boha budú prekvitať.<font color='#B71C1C'> – R.</font><br>" +
                            "Ešte aj v starobe budú prinášať ovocie, <font color='#B71C1C'>*</font><br>" +
                            "úrodní budú a plní sviežosti;<br>" +
                            "a tak zvestujú, že Pán, moje útočište, je spravodlivý <font color='#B71C1C'>*</font><br>" +
                            "a neprávosti v ňom niet.<font color='#B71C1C'> – R.</font>"},
            {"8", "1", "1", "Ž 32, 1-2. 5. 6. 7",
                    "<font color='#B71C1C'>R.:</font> Radujte sa, spravodliví, a plesajte v Pánovi.<br><br>" +
                            "Blažený, komu sa odpustila neprávosť <font color='#B71C1C'>*</font><br>" +
                            "a je oslobodený od hriechu.<br>" +
                            "Blažený človek, ktorému Pán vinu nepripočíta <font color='#B71C1C'>*</font><br>" +
                            "a v ktorého mysli niet podvodu.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyznal som sa ti zo svojho hriechu <font color='#B71C1C'>*</font><br>" +
                            "a nezatajil som svoj priestupok.<br>" +
                            "Povedal som si: \"Vyznám Pánovi svoju neprávosť.\" <font color='#B71C1C'>*</font><br>" +
                            "A ty si mi odpustil zlobu môjho hriechu.<font color='#B71C1C'> – R.</font><br>" +
                            "Preto každý nábožný bude sa modliť k tebe <font color='#B71C1C'>*</font><br>" +
                            "v čase tiesne.<br>" +
                            "A záplavy veľkých vôd <font color='#B71C1C'>*</font><br>" +
                            "sa k nemu nepriblížia.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty si moje útočište, ochrániš ma pred súžením; <font color='#B71C1C'>*</font><br>" +
                            "zahrnieš ma radosťou zo spásy.<font color='#B71C1C'> – R.</font>"},
            {"8", "1", "2", "Ž 111, 1-2. 5-6. 9ab+10c",
                    "<font color='#B71C1C'>R.:</font> Pán je milosrdný a milostivý, svoju zmluvu má stále na mysli.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Z celého srdca chcem oslavovať Pána <font color='#B71C1C'>*</font><br>" +
                            "v zbore spravodlivých i v zhromaždení.<br>" +
                            "Veľké sú diela Pánove; <font color='#B71C1C'>*</font><br>" +
                            "nech ich skúmajú všetci, čo majú v nich záľubu.<font color='#B71C1C'> – R.</font><br>" +
                            "Pokrm dal tým, čo sa ho boja; <font color='#B71C1C'>*</font><br>" +
                            "svoju zmluvu má stále na mysli.<br>" +
                            "Svoje mocné skutky oznámil svojmu ľudu <font color='#B71C1C'>*</font><br>" +
                            "a dal im dedičstvo pohanov.<font color='#B71C1C'> – R.</font><br>" +
                            "Vykúpenie poslal svojmu ľudu, <font color='#B71C1C'>†</font><br>" +
                            "zmluvu uzavrel naveky. <font color='#B71C1C'>*</font><br>" +
                            "Jeho chvála ostáva naveky.<font color='#B71C1C'> – R.</font>"},
            {"8", "2", "1", "Ž 50, 5-6. 7-8. 14+23",
                    "<font color='#B71C1C'>R.:</font> Obetuj Bohu obetu chvály.<br><br>" +
                            "\"Zhromaždite mi mojich svätých, <font color='#B71C1C'>*</font><br>" +
                            "čo zmluvu so mnou spečatili obetou.\"<br>" +
                            "A nebesia zvestujú jeho spravodlivosť, <font color='#B71C1C'>*</font><br>" +
                            "veď sudcom je sám Boh.<font color='#B71C1C'> – R.</font><br>" +
                            "\"Počuj, ľud môj, chcem hovoriť; <font color='#B71C1C'>†</font><br>" +
                            "teba, Izrael, idem usvedčiť <font color='#B71C1C'>*</font><br>" +
                            "ja, Boh, čo tvojím Bohom som.<br>" +
                            "Neobviňujem ťa pre tvoje obety <font color='#B71C1C'>*</font><br>" +
                            "veď tvoje žertvy stále sú predo mnou.<font color='#B71C1C'> – R.</font><br>" +
                            "Obetuj Bohu obetu chvály <font color='#B71C1C'>*</font><br>" +
                            "a Najvyššiemu svoje sľuby splň.<br>" +
                            "Kto prináša obetu chvály, ten ma ctí; <font color='#B71C1C'>*</font><br>" +
                            "a kto kráča bez úhony, tomu ukážem Božiu spásu.\"<font color='#B71C1C'> – R.</font>"},
            {"8", "2", "2", "Ž 98, 1. 2-3b. 3c-4",
                    "<font color='#B71C1C'>R.:</font> Uzreli všetky končiny zeme spásu nášho Boha.<br><br>" +
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
                            "plesajte, radujte sa a hrajte.<font color='#B71C1C'> – R.</font>"},
            {"8", "3", "1", "Ž 79, 8. 9. 11. 13",
                    "<font color='#B71C1C'>R.:</font> Ukáž nám, Pane, svetlo svojho milosrdenstva.<br><br>" +
                            "Zabudni na hriechy našich otcov; <font color='#B71C1C'>†</font><br>" +
                            "príď nám čím skôr v ústrety so svojím milosrdenstvom, <font color='#B71C1C'>*</font><br>" +
                            "lebo sme veľmi úbohí.<font color='#B71C1C'> – R.</font><br>" +
                            "Pre slávu svojho mena nám pomôž, Bože, naša spása, <font color='#B71C1C'>†</font><br>" +
                            "a vysloboď nás; <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje meno odpusť nám hriechy.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech dôjde k tebe nárek zajatých; <font color='#B71C1C'>†</font><br>" +
                            "silou svojho ramena <font color='#B71C1C'>*</font><br>" +
                            "zachovaj synov smrti nažive.<font color='#B71C1C'> – R.</font><br>" +
                            "Ale my, tvoj ľud a ovce tvojej pastviny, <font color='#B71C1C'>*</font><br>" +
                            "chceme ťa zvelebovať naveky<br>" +
                            "a z pokolenia na pokolenie <font color='#B71C1C'>*</font><br>" +
                            "hlásať tvoju slávu.<font color='#B71C1C'> – R.</font>"},
            {"8", "3", "2", "Ž 147, 12-13. 14-15. 19-20",
                    "<font color='#B71C1C'>R.:</font> Chváľ, Jeruzalem, Pána, oslavuj, Sion, svojho Boha.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľ, Jeruzalem, Pána, <font color='#B71C1C'>*</font><br>" +
                            "oslavuj, Sion, svojho Boha.<br>" +
                            "Lebo upevnil závory tvojich brán <font color='#B71C1C'>*</font><br>" +
                            "a požehnal tvojich synov v tebe.<font color='#B71C1C'> – R.</font><br>" +
                            "Zaisťuje pokoj tvojim hraniciam, <font color='#B71C1C'>*</font><br>" +
                            "sýti ťa najlepšou pšenicou.<br>" +
                            "Svoj rozkaz na zem zosiela; <font color='#B71C1C'>*</font><br>" +
                            "rýchlo sa šíri jeho slovo.<font color='#B71C1C'> – R.</font><br>" +
                            "On svoje slovo zvestuje Jakubovi, <font color='#B71C1C'>*</font><br>" +
                            "svoje zákony a prikázania Izraelovi.<br>" +
                            "Neurobil tak iným národom, <font color='#B71C1C'>*</font><br>" +
                            "nezjavil im svoje zámery.<font color='#B71C1C'> – R.</font>"},
            {"8", "4", "1", "Ž 33, 2-3. 4-5. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pánovým slovom povstali nebesia.<br><br>" +
                            "Oslavujte Pána citarou, <font color='#B71C1C'>*</font><br>" +
                            "hrajte mu na desaťstrunovej lutne.<br>" +
                            "Spievajte mu novu pieseň, <font color='#B71C1C'>*</font><br>" +
                            "nadšene mu hrajte a volajte na slávu.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pánovo slovo je pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a verne všetko jeho konanie.<br>" +
                            "Miluje spravodlivosť a pravo; <font color='#B71C1C'>*</font><br>" +
                            "milosti Pánovej plna je zem.<font color='#B71C1C'> – R.</font><br>" +
                            "Pánovým slovom povstali nebesia <font color='#B71C1C'>*</font><br>" +
                            "a dychom jeho úst všetky ich voje.<br>" +
                            "Ako do vreca hromadí morské vody, <font color='#B71C1C'>*</font><br>" +
                            "ako do nádrži zlieva oceány.<font color='#B71C1C'> – R.</font><br>" +
                            "Cela zem nech ma bazén pred Pánom, <font color='#B71C1C'>*</font><br>" +
                            "pred jeho tvarou nech sa chvejú všetci obyvatelia sveta.<br>" +
                            "Lebo on riekol a stalo sa, <font color='#B71C1C'>*</font><br>" +
                            "on rozkázal a všetko bolo stvorene.<font color='#B71C1C'> – R.</font>"},
            {"8", "4", "2", "Ž 100, 2. 3. 4. 5",
                    "<font color='#B71C1C'>R.:</font> Sme jeho ľud a ovce z jeho stáda.<br><br>" +
                            "Jasaj na chválu Pánovi, celá zem,<br>" +
                            "s radosťou slúžte Pánovi. <font color='#B71C1C'>*</font><br>" +
                            "S plesaním vstupujte pred jeho tvár.<font color='#B71C1C'> – R.</font><br>" +
                            "Vedzte, že náš Pán je Boh;<br>" +
                            "on je náš stvoriteľ a jemu patríme, <font color='#B71C1C'>*</font><br>" +
                            "sme jeho ľud a ovce z jeho stáda.<font color='#B71C1C'> – R.</font><br>" +
                            "Vstupujte do jeho brán s piesňou chvály<br>" +
                            "a do jeho nádvorí s piesňami oslavnými; <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho a velebte jeho meno.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán je dobrý;<br>" +
                            "jeho milosrdenstvo trvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho vernosť z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"8", "5", "1", "Ž 149, 1-2. 3-4. 5-6a+9b",
                    "<font color='#B71C1C'>R.:</font> Pán, Boh, miluje svoj ľud.<br><br>" +
                            "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>*</font> <br>" +
                            "jeho chvála nech znie v zhromaždení svätých. <br>" +
                            "Nech sa teší Izrael zo svojho Stvoriteľa, <font color='#B71C1C'>*</font> <br>" +
                            "synovia Siona nech jasajú nad svojím kráľom.<font color='#B71C1C'> – R.</font> <br>" +
                            "Nech oslavujú jeho meno tancom, <font color='#B71C1C'>*</font> <br>" +
                            "nech mu hrajú na bubne a na citare. <br>" +
                            "Lebo Pán miluje svoj ľud <font color='#B71C1C'>*</font> <br>" +
                            "a tichých venčí víťazstvom.<font color='#B71C1C'> – R.</font> <br>" +
                            "Nech svätí jasajú v sláve, <font color='#B71C1C'>*</font> <br>" +
                            "nech sa veselia na svojich lôžkach. <br>" +
                            "Oslavu Boha nech majú na perách; <font color='#B71C1C'>*</font> <br>" +
                            "všetkým jeho svätým to bude na slávu.<font color='#B71C1C'> – R.</font>"},
            {"8", "5", "2", "Ž 96, 10. 11-12a. 12b-13",
                    "<font color='#B71C1C'>R.:</font> Pán príde súdiť všetky národy.<br><br>" +
                            "Hlásajte medzi pohanmi: \"Pán kraľuje!\" <font color='#B71C1C'>†</font><br>" +
                            "Upevnil zemekruh, nepohne sa; <font color='#B71C1C'>*</font><br>" +
                            "a spravodlivo súdi národy.<font color='#B71C1C'> – R.</font><br>" +
                            "Tešte sa, nebesia, plesaj, zem; <font color='#B71C1C'>†</font><br>" +
                            "nech more zahučí a čo ho napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "nech plesá pole a všetko, čo je na ňom.<font color='#B71C1C'> – R.</font><br>" +
                            "I zajasajú všetky stromy lesa <font color='#B71C1C'>†</font><br>" +
                            "pred tvárou Pána, že prichádza, <font color='#B71C1C'>*</font><br>" +
                            "že prichádza súdiť zem.<br>" +
                            "Spravodlivo bude súdiť zemekruh <font color='#B71C1C'>*</font><br>" +
                            "a národy podľa svojej pravdy.<font color='#B71C1C'> – R.</font>"},
            {"8", "6", "1", "Ž 19, 8. 9. 10. 11",
                    "<font color='#B71C1C'>R.:</font> Rozhodnutia Pánove sú správne, potešujú srdce.<br><br>" +
                            "Zákon Pánov je dokonalý, <font color='#B71C1C'>*</font><br>" +
                            "osviežuje dušu.<br>" +
                            "Svedectvo Pánovo je hodnoverné, <font color='#B71C1C'>*</font><br>" +
                            "dáva múdrosť maličkým.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozhodnutia Pánove sú správne, <font color='#B71C1C'>*</font><br>" +
                            "potešujú srdce.<br>" +
                            "Prikázania Pánove sú jasné, <font color='#B71C1C'>*</font><br>" +
                            "osvecujú oči.<font color='#B71C1C'> – R.</font><br>" +
                            "Bázeň pred Pánom je úprimná, <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky.<br>" +
                            "Výroky Pánove sú pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a všetky spravodlivé.<font color='#B71C1C'> – R.</font><br>" +
                            "Vzácnejšie sú než zlato, <font color='#B71C1C'>*</font><br>" +
                            "než veľký drahokam,<br>" +
                            "sladšie sú než med, <font color='#B71C1C'>*</font><br>" +
                            "než medové kvapky z plástu.<font color='#B71C1C'> – R.</font>"},
            {"8", "6", "2", "Ž 63, 2. 3-4. 5-6",
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
                            "a moje ústa ťa budú chváliť jasavými perami.<font color='#B71C1C'> – R.</font>"},
            {"9", "A", "", "Ž 31, 2-3b. 3c-4. 17+25",
                    "<font color='#B71C1C'>R.:</font> Ty, Pane, buď mojím útočišťom.<br><br>" +
                            "Pane, v teba dúfam, nech nie som zahanbený naveky; <font color='#B71C1C'>*</font><br>" +
                            "vysloboď ma, veď si spravodlivý.<br>" +
                            "Nakloň ku mne svoj sluch, <font color='#B71C1C'>*</font><br>" +
                            "ponáhľaj sa a zachráň ma.<font color='#B71C1C'> – R.</font><br>" +
                            "Buď mi skalou útočišťa, <font color='#B71C1C'>*</font><br>" +
                            "opevneným hradom mojej spásy.<br>" +
                            "Veď ty si moja sila a moje útočište, <font color='#B71C1C'>*</font><br>" +
                            "pre svoje meno budeš ma viesť a opatrovať.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozjasni svoju tvár nad svojím sluhom <font color='#B71C1C'>*</font><br>" +
                            "a zachráň ma vo svojom milosrdenstve.<br>" +
                            "Vzmužte sa a majte srdce statočné, <font color='#B71C1C'>*</font><br>" +
                            "vy všetci, čo dúfate v Pána.<font color='#B71C1C'> – R.</font>"},
            {"9", "B", "", "Ž 81, 3-4. 5-6b. 6c-8a. 10-11b",
                    "<font color='#B71C1C'>R.:</font> Plesajte Bohu, ktorý nám pomáha.<br><br>" +
                            "Vezmite harfy, udrite na bubon, <font color='#B71C1C'>*</font><br>" +
                            "na ľúbu lýru a citaru.<br>" +
                            "Zatrúbte rohom pri nove mesiaca <font color='#B71C1C'>*</font><br>" +
                            "i pri jeho splne v deň našej slávnosti.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo také je nariadenie pre Izrael <font color='#B71C1C'>*</font><br>" +
                            "a zákon Boha Jakubovho.<br>" +
                            "Taký príkaz dal Jozefovi, <font color='#B71C1C'>*</font><br>" +
                            "keď vychádzal z krajiny egyptskej;<font color='#B71C1C'> – R.</font><br>" +
                            "počul som reč mne neznámu: <font color='#B71C1C'>*</font><br>" +
                            "\"Z jeho pliec som sňal bremeno<br>" +
                            "a z jeho rúk ťažký kôš. <font color='#B71C1C'>*</font><br>" +
                            "V súžení si ma vzýval a vyslobodil som ťa.<font color='#B71C1C'> – R.</font><br>" +
                            "Nebudeš mať iného boha, <font color='#B71C1C'>*</font><br>" +
                            "ani sa nebudeš klaňať bohu cudziemu.<br>" +
                            "Veď ja som Pán, tvoj Boh, <font color='#B71C1C'>*</font><br>" +
                            "ja som ťa vyviedol z egyptskej krajiny.\"<font color='#B71C1C'> – R.</font>"},
            {"9", "C", "", "Ž 117, 1. 2",
                    "<font color='#B71C1C'>R.:</font> Budú sa ti klaňať, Pane, všetky národy zeme.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľte Pána, všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "oslavujte ho, všetci ľudia;<font color='#B71C1C'> – R.</font><br>" +
                            "lebo je veľké jeho milosrdenstvo voči nám <font color='#B71C1C'>*</font><br>" +
                            "a pravda Pánova trvá naveky.<font color='#B71C1C'> – R.</font>"},
            {"9", "1", "1", "Ž 112, 1-2. 3-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Blažený muž, ktorý sa bojí Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Blažený muž, ktorý sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a má veľkú záľubu v jeho príkazoch.<br>" +
                            "Jeho potomstvo bude mocné na zemi; <font color='#B71C1C'>*</font><br>" +
                            "pokolenie spravodlivých bude požehnané.<font color='#B71C1C'> – R.</font><br>" +
                            "V jeho dome bude úspech a bohatstvo, <font color='#B71C1C'>*</font><br>" +
                            "jeho spravodlivosť ostane naveky.<br>" +
                            "Spravodlivým žiari svetlo v temnotách, <font color='#B71C1C'>*</font><br>" +
                            "milosrdný, milostivý a spravodlivý.<font color='#B71C1C'> – R.</font><br>" +
                            "V obľube je človek, čo sa zľutúva a rád pomáha, <font color='#B71C1C'>*</font><br>" +
                            "čo svoj majetok čestne spravuje;<br>" +
                            "nikdy nezakolíše. <font color='#B71C1C'>*</font><br>" +
                            "vo večnej pamäti bude spravodlivý.<font color='#B71C1C'> – R.</font>"},
            {"9", "1", "2", "Ž 91, 1-2. 14-15b. 15c-16",
                    "<font color='#B71C1C'>R.:</font> V tebe mám dôveru, Pane, Bože môj.<br><br>" +
                            "Kto pod ochranou Najvyššieho prebýva <font color='#B71C1C'>*</font><br>" +
                            "a v tôni Všemohúceho sa zdržiava,<br>" +
                            "povie Pánovi: \"Ty si moje útočište a pevnosť moja; <font color='#B71C1C'>*</font><br>" +
                            "v tebe mám dôveru, Bože môj.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Pretože sa ku mne pritúlil, vyslobodím ho, <font color='#B71C1C'>*</font><br>" +
                            "ujmem sa ho, lebo pozná moje meno.<br>" +
                            "Keď ku mne zavolá, ja ho vyslyším <font color='#B71C1C'>*</font><br>" +
                            "a budem pri ňom v súžení,<font color='#B71C1C'> – R.</font><br>" +
                            "zachránim ho i oslávim. <font color='#B71C1C'>†</font><br>" +
                            "Obdarím ho dlhým životom <font color='#B71C1C'>*</font><br>" +
                            "a ukážem mu svoju spásu.<font color='#B71C1C'> – R.</font>"},
            {"9", "2", "1", "Ž 112, 1-2. 7-8. 9",
                    "<font color='#B71C1C'>R.:</font> Srdce spravodlivého je pevné, dôveruje v Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Blažený muž, ktorý sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a má veľkú záľubu v jeho príkazoch.<br>" +
                            "Jeho potomstvo bude mocné na zemi; <font color='#B71C1C'>*</font><br>" +
                            "pokolenie spravodlivých bude požehnané.<font color='#B71C1C'> – R.</font><br>" +
                            "Nebude sa báť zlej zvesti. <font color='#B71C1C'>*</font><br>" +
                            "Jeho srdce je pevné, dôveruje v Pána,<br>" +
                            "bezpečné je jeho srdce, nebojí sa, <font color='#B71C1C'>*</font><br>" +
                            "kým nepokorí svojich nepriateľov.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozdeľuje a dáva chudobným; <font color='#B71C1C'>†</font><br>" +
                            "jeho dobročinnosť potrvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho moc a sláva budú stále rásť.<font color='#B71C1C'> – R.</font>"},
            {"9", "2", "2", "Ž 90, 2. 3-4. 10. 14+16",
                    "<font color='#B71C1C'>R.:</font> Pane, stal si sa nám útočišťom z pokolenia na pokolenie.<br><br>" +
                            "Prv než sa vrchy zrodili <font color='#B71C1C'>†</font><br>" +
                            "a povstali zem i svet, <font color='#B71C1C'>*</font><br>" +
                            "ty, Bože, si od vekov až naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Človeka vraciaš do prachu <font color='#B71C1C'>*</font><br>" +
                            "a hovoríš: \"Vráťte sa, synovia človeka!\"<br>" +
                            "Veď tisíc rokov je u teba ako deň včerajší,<br>" +
                            "čo sa pominul, <font color='#B71C1C'>*</font><br>" +
                            "a ako jedna nočná stráž.<font color='#B71C1C'> – R.</font><br>" +
                            "Vek nášho žitia je sedemdesiat rokov <font color='#B71C1C'>*</font><br>" +
                            "a ak sme pri sile, osemdesiat.<br>" +
                            "No zväčša sú len trápením a trýzňou, <font color='#B71C1C'>*</font><br>" +
                            "ubiehajú rýchlo a my odlietame.<font color='#B71C1C'> – R.</font><br>" +
                            "Hneď zrána nás naplň svojou milosťou <font color='#B71C1C'>*</font><br>" +
                            "a budeme jasať a radovať sa po všetky dni života.<br>" +
                            "Nech sa tvoje dielo zjaví tvojim služobníkom <font color='#B71C1C'>*</font><br>" +
                            "a ich deťom tvoja nádhera.<font color='#B71C1C'> – R.</font>"},
            {"9", "3", "1", "Ž 25, 2-3. 4-5b. 6+7bc. 8-9",
                    "<font color='#B71C1C'>R.:</font> K tebe, Pane, dvíham svoju dušu.<br><br>" +
                            "Tebe dôverujem, Bože môj: nech nie som zahanbený <font color='#B71C1C'>*</font><br>" +
                            "a nech moji nepriatelia nejasajú nado mnou.<br>" +
                            "Veď nik, čo dúfa v teba, nebude zahanbený. <font color='#B71C1C'>*</font><br>" +
                            "Ale nech sú zahanbení tí,<br>" +
                            "čo sa pre nič za nič dopúšťajú nevery.<font color='#B71C1C'> – R.</font><br>" +
                            "Ukáž mi, Pane, svoje cesty <font color='#B71C1C'>*</font><br>" +
                            "a pouč ma o svojich chodníkoch.<br>" +
                            "Veď ma vo svojej pravde a uč ma, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si Boh, moja spása.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozpomeň sa, Pane, na svoje zľutovanie <font color='#B71C1C'>*</font><br>" +
                            "a na svoje milosrdenstvo, ktoré trvá od vekov.<br>" +
                            "Pamätaj na mňa vo svojom milosrdenstve, <font color='#B71C1C'>*</font><br>" +
                            "veď si, Pane, dobrotivý.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán je dobrý a spravodlivý: <font color='#B71C1C'>*</font><br>" +
                            "ukazuje cestu hriešnikom.<br>" +
                            "Pokorných vedie k správnemu konaniu <font color='#B71C1C'>*</font><br>" +
                            "a tichých poúča o svojich cestách.<font color='#B71C1C'> – R.</font>"},
            {"9", "3", "2", "Ž 123, 1-2a. 2b-d",
                    "<font color='#B71C1C'>R.:</font> Oči dvíham k tebe, Pane, čo na nebesiach prebývaš.<br><br>" +
                            "Oči dvíham k tebe, <font color='#B71C1C'>*</font><br>" +
                            "čo na nebesiach prebývaš.<br>" +
                            "Ako oči sluhov hľadia <font color='#B71C1C'>*</font><br>" +
                            "na ruky svojich pánov,<font color='#B71C1C'> – R.</font><br>" +
                            "ako oči služobníc hľadia <font color='#B71C1C'>*</font><br>" +
                            "na ruky svojej panej,<br>" +
                            "tak hľadia naše oči na Pána, nášho Boha, <font color='#B71C1C'>*</font><br>" +
                            "kým sa nezmiluje nad nami.<font color='#B71C1C'> – R.</font>"},
            {"9", "4", "1", "Ž 128, 1-2. 3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Blažení sú všetci, čo sa boja Pána.<br><br>" +
                            "Blažený každý, čo sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a kráča po jeho cestách.<br>" +
                            "Budeš jesť z práce svojich rúk; <font color='#B71C1C'>*</font><br>" +
                            "budeš šťastný a budeš sa mať dobre.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoja manželka je ako plodonosný vinič <font color='#B71C1C'>*</font><br>" +
                            "vnútri tvojho domu.<br>" +
                            "Tvoji synovia sú ako mládniky olivy <font color='#B71C1C'>*</font><br>" +
                            "okolo tvojho stola.<font color='#B71C1C'> – R.</font><br>" +
                            "Veru, tak bude požehnaný muž, <font color='#B71C1C'>*</font><br>" +
                            "ktorý sa bojí Pána.<br>" +
                            "Nech ťa žehná Pán zo Siona, <font color='#B71C1C'>†</font><br>" +
                            "aby si videl šťastie Jeruzalema <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni svojho života.<font color='#B71C1C'> – R.</font>"},
            {"9", "4", "2", "Ž 25, 4-5b. 8-9. 10+14",
                    "<font color='#B71C1C'>R.:</font> Ukáž mi, Pane, svoje cesty.<br><br>" +
                            "Ukáž mi, Pane, svoje cesty <font color='#B71C1C'>*</font><br>" +
                            "a pouč ma o svojich chodníkoch.<br>" +
                            "Veď ma vo svojej pravde a uč ma, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si Boh, moja spása.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán je dobrý a spravodlivý: <font color='#B71C1C'>*</font><br>" +
                            "ukazuje cestu hriešnikom.<br>" +
                            "Pokorných vedie k správnemu konaniu <font color='#B71C1C'>*</font><br>" +
                            "a tichých poúča o svojich cestách.<font color='#B71C1C'> – R.</font><br>" +
                            "Všetky cesty Pánove sú milosrdenstvo a vernosť <font color='#B71C1C'>*</font><br>" +
                            "pre tých, čo zachovávajú jeho zmluvu a jeho príkazy.<br>" +
                            "Pán bude dôverným priateľom tým, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "a zjaví im svoju zmluvu.<font color='#B71C1C'> – R.</font>"},
            {"9", "5", "1", "Ž 146, 1-2. 6c-7. 8-9a. 9b-10",
                    "<font color='#B71C1C'>R.:</font> Chváľ, duša moja, Pána cez celý môj život.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľ, duša moja, Pána; <font color='#B71C1C'>†</font><br>" +
                            "celý život chcem chváliť Pána, <font color='#B71C1C'>*</font><br>" +
                            "svojmu Bohu spievať, kým len budem žiť.<font color='#B71C1C'> – R.</font><br>" +
                            "On zachováva vernosť naveky, <font color='#B71C1C'>*</font><br>" +
                            "utláčaným prisudzuje právo,<br>" +
                            "hladujúcim dáva chlieb. <font color='#B71C1C'>*</font><br>" +
                            "Pán vyslobodzuje väzňov.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán otvára oči slepým, <font color='#B71C1C'>*</font><br>" +
                            "Pán dvíha skľúčených,<br>" +
                            "Pán miluje spravodlivých. <font color='#B71C1C'>*</font><br>" +
                            "Pán ochraňuje cudzincov,<font color='#B71C1C'> – R.</font><br>" +
                            "ujíma sa siroty a vdovy, <font color='#B71C1C'>*</font><br>" +
                            "ale hatí cesty hriešnikov.<br>" +
                            "Pán bude kraľovať naveky; <font color='#B71C1C'>*</font><br>" +
                            "tvoj Boh, Sion, z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"9", "5", "2", "Ž 119, 157. 160. 161. 165. 166. 168",
                    "<font color='#B71C1C'>R.:</font> Trvalý pokoj, požívajú tí, čo milujú tvoj zákon, Pane.<br><br>" +
                            "Mnohí ma prenasledujú a sužujú, <font color='#B71C1C'>*</font><br>" +
                            "no ja sa neodkláňam od tvojich prikázaní.<font color='#B71C1C'> – R.</font><br>" +
                            "Pravda je podstatou tvojich slov <font color='#B71C1C'>*</font><br>" +
                            "a všetky rozsudky tvojej spravodlivosti sú večné.<font color='#B71C1C'> – R.</font><br>" +
                            "Hoci ma kniežatá prenasledujú pre nič za nič, <font color='#B71C1C'>*</font><br>" +
                            "moje srdce si tvoje slová ctí.<font color='#B71C1C'> – R.</font><br>" +
                            "Trvalý pokoj požívajú tí, čo milujú tvoj zákon; <font color='#B71C1C'>*</font><br>" +
                            "a nemajú sa na čom potknúť.<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, vyčkávam tvoju pomoc <font color='#B71C1C'>*</font><br>" +
                            "a plním tvoje predpisy.<font color='#B71C1C'> – R.</font><br>" +
                            "Zachovávam tvoje prikázania a ustanovenia: <font color='#B71C1C'>*</font><br>" +
                            "lebo pred tebou sú všetky moje cesty.<font color='#B71C1C'> – R.</font>"},
            {"9", "6", "1", "Tob 13, 2c-f. 6f-i. 6jk. 6lm",
                    "<font color='#B71C1C'>R.:</font> Nech je zvelebený Boh, ktorý žije naveky.<br><br>" +
                            "Pretože on trestá aj sa zmilúva, <font color='#B71C1C'>*</font><br>" +
                            "on zvrhne až na dno podsvetia<br>" +
                            "a svojou velebnosťou vyvádza zo záhuby; <font color='#B71C1C'>*</font><br>" +
                            "a niet nikoho, kto by jeho ruke unikol.<font color='#B71C1C'> – R.</font><br>" +
                            "A teraz pozrite, čo s vami urobil, <font color='#B71C1C'>*</font><br>" +
                            "a oslavujte ho celým svojím hlasom.<br>" +
                            "Velebte Pána spravodlivosti <font color='#B71C1C'>*</font><br>" +
                            "a chváľte kráľa vekov.<font color='#B71C1C'> – R.</font><br>" +
                            "Ja ho oslavujem v krajine môjho vyhnanstva <font color='#B71C1C'>*</font><br>" +
                            "a ohlasujem jeho silu a vznešenosť hriešnemu národu.<font color='#B71C1C'> – R.</font><br>" +
                            "Obráťte sa, hriešnici, <font color='#B71C1C'>†</font><br>" +
                            "a žite spravodlivo pred ním. <font color='#B71C1C'>*</font><br>" +
                            "Možno si vás obľúbi a preukáže vám milosrdenstvo.<font color='#B71C1C'> – R.</font>"},
            {"9", "6", "2", "Ž 71, 8-9. 14-15b. 16-17. 22",
                    "<font color='#B71C1C'>R.:</font> Moje ústa, Pane, budú hlásať tvoju spásu.<br><br>" +
                            "Nech sa mi ústa naplnia tvojou oslavou <font color='#B71C1C'>*</font><br>" +
                            "a nech ťa velebím deň čo deň.<br>" +
                            "Neodožeň ma v čase staroby, <font color='#B71C1C'>*</font><br>" +
                            "neopusť ma, keď mi sily ochabnú.<font color='#B71C1C'> – R.</font><br>" +
                            "Ja však budem úfať neprestajne <font color='#B71C1C'>*</font><br>" +
                            "a všade budem šíriť tvoju chválu.<br>" +
                            "Moje ústa budú hlásať tvoju spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a tvoju spásu deň čo deň.<font color='#B71C1C'> – R.</font><br>" +
                            "Budem hovoriť o veľkých činoch Pánových; <font color='#B71C1C'>*</font><br>" +
                            "Pane, budem spomínať len tvoju spravodlivosť.<br>" +
                            "Bože, ty si ma poúčal od mojej mladosti <font color='#B71C1C'>*</font><br>" +
                            "a ja až doteraz ohlasujem tvoje diela zázračné.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo i ja teba oslávim, <font color='#B71C1C'>†</font><br>" +
                            "tvoju vernosť budem chváliť na harfe, Bože môj, <font color='#B71C1C'>*</font><br>" +
                            "na citare ti zahrám, Svätý Izraela.<font color='#B71C1C'> – R.</font>"},
            {"10", "A", "", "Ž 50, 1+8. 12-13. 14-15",
                    "<font color='#B71C1C'>R.:</font> Kto kráča bez úhony, tomu ukážem Božiu spásu.<br><br>" +
                            "Zvrchovaný Boh, Pán, prehovoril <font color='#B71C1C'>*</font><br>" +
                            "a vyzval zem od východu slnka až po jeho západ.<br>" +
                            "\"Neobviňujem ťa pre tvoje obety, <font color='#B71C1C'>*</font><br>" +
                            "veď tvoje žertvy stále sú predo mnou.<font color='#B71C1C'> – R.</font><br>" +
                            "Aj keď budem hladný, nebudem pýtať od teba; <font color='#B71C1C'>*</font><br>" +
                            "veď moja je zem i s tým, čo ju napĺňa.<br>" +
                            "Vari ja hovädzie mäso jedávam <font color='#B71C1C'>*</font><br>" +
                            "alebo pijem krv kozľaciu?<font color='#B71C1C'> – R.</font><br>" +
                            "Obetuj Bohu obetu chvály <font color='#B71C1C'>*</font><br>" +
                            "a Najvyššiemu svoje sľuby splň.<br>" +
                            "A vzývaj ma v čase súženia: <font color='#B71C1C'>*</font><br>" +
                            "ja ťa zachránim a ty mi úctu vzdáš.\"<font color='#B71C1C'> – R.</font>"},
            {"10", "B", "", "Ž 130, 1-2. 3-4. 5-7a. 7b-8",
                    "<font color='#B71C1C'>R.:</font> U Pána je milosrdenstvo a hojné vykúpenie.<br><br>" +
                            "Z hlbín volám k tebe, Pane; <font color='#B71C1C'>*</font><br>" +
                            "Pane, počuj môj hlas.<br>" +
                            "Nakloň svoj sluch <font color='#B71C1C'>*</font><br>" +
                            "k mojej úpenlivej prosbe.<font color='#B71C1C'> – R.</font><br>" +
                            "Ak si budeš, Pane, v pamäti uchovávať neprávosť, <font color='#B71C1C'>*</font><br>" +
                            "Pane, kto obstojí?<br>" +
                            "Ale ty si milostivý <font color='#B71C1C'>*</font><br>" +
                            "a my ti chceme v bázni slúžiť.<font color='#B71C1C'> – R.</font><br>" +
                            "Spolieham sa na teba, Pane, <font color='#B71C1C'>*</font><br>" +
                            "moja duša sa spolieha na tvoje slovo;<br>" +
                            "moja duša očakáva Pána <font color='#B71C1C'>*</font><br>" +
                            "väčšmi ako strážcovia dennicu.<br>" +
                            "Väčšmi ako strážcovia dennicu <font color='#B71C1C'>*</font><br>" +
                            "nech očakáva Izrael Pána.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo u Pána je milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a hojné vykúpenie.<br>" +
                            "On sám vykúpi Izraela <font color='#B71C1C'>*</font><br>" +
                            "zo všetkých jeho neprávostí.<font color='#B71C1C'> – R.</font>"},
            {"10", "C", "", "Ž 30, 2+4. 5-6. 11-12a+13b",
                    "<font color='#B71C1C'>R.:</font> Budem ťa, Pane, oslavovať, že si ma vyslobodil.<br><br>" +
                            "Budem ťa, Pane, oslavovať, že si ma vyslobodil <font color='#B71C1C'>*</font><br>" +
                            "a že si nedovolil, aby sa moji nepriatelia radovali nado mnou.<br>" +
                            "Pane, vyviedol si ma z ríše zosnulých, <font color='#B71C1C'>*</font><br>" +
                            "navrátil si mi život, aby som nezostúpil do hrobu.<font color='#B71C1C'> – R.</font><br>" +
                            "Na harfe hrajte Pánovi, jeho svätí, <font color='#B71C1C'>*</font><br>" +
                            "vzdávajte vďaky jeho menu svätému.<br>" +
                            "Lebo len chvíľku trvá jeho hnev, <font color='#B71C1C'>*</font><br>" +
                            "ale celý život jeho láskavosť.<br>" +
                            "Podvečer je nám hosťom plač <font color='#B71C1C'>*</font><br>" +
                            "a radosť nad ránom.<font color='#B71C1C'> – R.</font><br>" +
                            "Čuj, Pane a zmiluj sa nado mnou; <font color='#B71C1C'>*</font><br>" +
                            "Pane, buď mi na pomoci.<br>" +
                            "Môj nárek si obrátil na tanec; <font color='#B71C1C'>*</font><br>" +
                            "Pane, Bože môj, naveky ťa chcem velebiť.<font color='#B71C1C'> – R.</font>"},
            {"10", "1", "1", "Ž 34, 2-3. 4-5. 6-7. 8-9",
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
                            "šťastný človek, čo sa utieka k nemu.<font color='#B71C1C'> – R.</font>"},
            {"10", "1", "2", "Ž 121, 1-2. 3-4. 5-6. 7-8",
                    "<font color='#B71C1C'>R.:</font> Pomoc nám príde od Pána, ktorý stvoril nebo i zem.<br><br>" +
                            "Svoj zrak upieram na vrchy: <font color='#B71C1C'>*</font><br>" +
                            "príde mi odtiaľ pomoc?<br>" +
                            "Pomoc mi príde od Pána, <font color='#B71C1C'>*</font><br>" +
                            "ktorý stvoril nebo i zem.<font color='#B71C1C'> – R.</font><br>" +
                            "Nedovolí, aby sa ti noha zachvela, <font color='#B71C1C'>*</font><br>" +
                            "nezdriemne ten, čo ťa stráži.<br>" +
                            "Nedrieme veru, ani nespí <font color='#B71C1C'>*</font><br>" +
                            "ten, čo stráži Izraela.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán ťa stráži, <font color='#B71C1C'>†</font><br>" +
                            "Pán je tvoja záštita <font color='#B71C1C'>*</font><br>" +
                            "po tvojej pravici.<br>" +
                            "Za dňa ťa slnko nezraní <font color='#B71C1C'>*</font><br>" +
                            "ani mesiac za noci.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán ťa bude chrániť od všetkého zlého; <font color='#B71C1C'>*</font><br>" +
                            "Pán ti bude chrániť život.<br>" +
                            "Pán bude chrániť tvoj odchod i príchod; <font color='#B71C1C'>*</font><br>" +
                            "odteraz až naveky.<font color='#B71C1C'> – R.</font>"},
            {"10", "2", "1", "Ž 119, 129. 130. 131. 132. 133. 135",
                    "<font color='#B71C1C'>R.:</font> Vyjasni tvár, Pane, nad svojím služobníkom.<br><br>" +
                            "Tvoje príkazy sú obdivuhodné, <font color='#B71C1C'>*</font><br>" +
                            "preto ich zachovávam.<font color='#B71C1C'> – R.</font><br>" +
                            "Výklad tvojich slov osvecuje, <font color='#B71C1C'>*</font><br>" +
                            "maličkým dáva chápavosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Otváram ústa a dych naberám, <font color='#B71C1C'>*</font><br>" +
                            "lebo túžim za tvojimi predpismi.<font color='#B71C1C'> – R.</font><br>" +
                            "Obráť sa ku mne a zmiluj sa nado mnou, <font color='#B71C1C'>*</font><br>" +
                            "ako robievaš tým, čo tvoje meno milujú.<font color='#B71C1C'> – R.</font><br>" +
                            "Riaď moje kroky podľa tvojho výroku; <font color='#B71C1C'>*</font><br>" +
                            "nech ma neovláda nijaká neprávosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyjasni tvár nad svojím služobníkom <font color='#B71C1C'>*</font><br>" +
                            "a nauč ma svojim ustanoveniam.<font color='#B71C1C'> – R.</font>"},
            {"10", "2", "2", "Ž 4, 2-3. 4-5. 7b-8",
                    "<font color='#B71C1C'>R.:</font> Pane, ukáž nám svetlo svojej tváre.<br><br>" +
                            "Bože, ty spravodlivosť moja,<br>" +
                            "vyslyš ma, keď volám o pomoc. <font color='#B71C1C'>†</font><br>" +
                            "V súžení si mi uľavil. <font color='#B71C1C'>*</font><br>" +
                            "Zmiluj sa nado mnou a vyslyš moju modlitbu.<br>" +
                            "Ľudia, dokedy ešte budete mať srdcia tvrdé? <font color='#B71C1C'>*</font><br>" +
                            "Prečo máte záľubu v márnosti a vyhľadávate klamstvá?<font color='#B71C1C'> – R.</font><br>" +
                            "Vedzte, že Pán zázračne chráni svojho svätého; <font color='#B71C1C'>*</font><br>" +
                            "Pán ma vyslyší, keď k nemu zavolám.<br>" +
                            "Hneváte sa, ale nehrešte; <font color='#B71C1C'>†</font><br>" +
                            "uvažujte vo svojom srdci, <font color='#B71C1C'>*</font><br>" +
                            "rozjímajte na svojich lôžkach a upokojte sa.<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, ukáž nám svetlo svojej tváre ako znamenie. <font color='#B71C1C'>†</font><br>" +
                            "Môjmu srdcu dal si väčšiu potechu, <font color='#B71C1C'>*</font><br>" +
                            "než majú tí, čo oplývajú vínom a obilím.<font color='#B71C1C'> – R.</font>"},
            {"10", "3", "1", "Ž 99, 5. 6. 7. 8. 9",
                    "<font color='#B71C1C'>R.:</font> Len ty si svätý, Pane, Bože náš.<br><br>" +
                            "Velebte Pána, nášho Boha, <font color='#B71C1C'>†</font><br>" +
                            "a padnite k jeho nohám, <font color='#B71C1C'>*</font><br>" +
                            "lebo je svätý.<font color='#B71C1C'> – R.</font><br>" +
                            "Mojžiš a Áron, jeho kňazi, <font color='#B71C1C'>†</font><br>" +
                            "a Samuel, ctiteľ jeho mena, <font color='#B71C1C'>*</font><br>" +
                            "vzývali Pána a on ich vypočul,<font color='#B71C1C'> – R.</font><br>" +
                            "z oblačného stĺpa k nim hovoril. <font color='#B71C1C'>†</font><br>" +
                            "A zachovávali jeho svedectvo <font color='#B71C1C'>*</font><br>" +
                            "a prikázania, ktoré im dal.<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, Bože náš, ty si ich vypočul, <font color='#B71C1C'>†</font><br>" +
                            "Bože, ty si bol k nim milostivý, <font color='#B71C1C'>*</font><br>" +
                            "no nenechal si bez trestu ich priestupky.<font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, nášho Boha, <font color='#B71C1C'>†</font><br>" +
                            "na jeho svätom vrchu sa mu klaňajte, <font color='#B71C1C'>*</font><br>" +
                            "lebo svätý je Pán, Boh náš.<font color='#B71C1C'> – R.</font>"},
            {"10", "3", "2", "Ž 16, 1-2a. 4ab. 5+8. 11",
                    "<font color='#B71C1C'>R.:</font> Ochráň ma, Bože, k tebe sa utiekam.<br><br>" +
                            "Ochráň ma, Bože, k tebe sa utiekam. <font color='#B71C1C'>*</font><br>" +
                            "Hovorím Pánovi: \"Ty si môj Pán.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Rozmnožujú sa útrapy tých, <font color='#B71C1C'>†</font><br>" +
                            "čo sa ženú za cudzími bôžikmi. <font color='#B71C1C'>*</font><br>" +
                            "Nebudem vylievať krv na ich obetu.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty, Pane, si môj podiel na dedičstve a na kalichu, <font color='#B71C1C'>*</font><br>" +
                            "v tvojich rukách je môj osud.<br>" +
                            "Pána mám vždy pred očami; <font color='#B71C1C'>*</font><br>" +
                            "a pretože je po mojej pravici, nezakolíšem sa.<font color='#B71C1C'> – R.</font><br>" +
                            "Ukážeš mi cestu života. <font color='#B71C1C'>†</font><br>" +
                            "U teba je plnosť radosti, <font color='#B71C1C'>*</font><br>" +
                            "po tvojej pravici večná slasť.<font color='#B71C1C'> – R.</font>"},
            {"10", "4", "1", "Ž 85, 9ab+10. 11-12. 13-14",
                    "<font color='#B71C1C'>R.:</font> Pánova sláva bude prebývať v našej krajine.<br><br>" +
                            "Budem počúvať, čo povie Pán, Boh; <font color='#B71C1C'>*</font><br>" +
                            "on ohlási pokoj svojmu ľudu a svojim svätým.<br>" +
                            "Naozaj: blízko je spása tým, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "a jeho sláva bude prebývať v našej krajine.<font color='#B71C1C'> – R.</font><br>" +
                            "Milosrdenstvo a vernosť sa stretnú navzájom, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a pokoj sa pobozkajú.<br>" +
                            "Vernosť vyrastie zo zeme, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť zhliadne z neba.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď Pán dá požehnanie <font color='#B71C1C'>*</font><br>" +
                            "a svoje plody vydá naša zem.<br>" +
                            "Pred ním bude kráčať spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a po stopách jeho krokov spása.<font color='#B71C1C'> – R.</font>"},
            {"10", "4", "2", "Ž 65, 10a-d. 10e-11. 12-13",
                    "<font color='#B71C1C'>R.:</font> Tebe, Pane Bože, patrí chválospev na Sione.<br><br>" +
                            "Navštevuješ zem a dávaš jej vlahu, <font color='#B71C1C'>*</font><br>" +
                            "zveľaďuješ jej bohatstvo.<br>" +
                            "Božia rieka je plná vody; <font color='#B71C1C'>*</font><br>" +
                            "ľuďom pripravuješ zrno.<font color='#B71C1C'> – R.</font><br>" +
                            "Takto sa staráš o zem: <font color='#B71C1C'>†</font><br>" +
                            "zvlažuješ jej brázdy a vyrovnávaš hrudy, <font color='#B71C1C'>*</font><br>" +
                            "skrypruješ ju dažďami a požehnávaš jej rastliny.<font color='#B71C1C'> – R.</font><br>" +
                            "Rok korunuješ svojou dobrotou, <font color='#B71C1C'>*</font><br>" +
                            "kade prejdeš, všade je hojnosť.<br>" +
                            "Pašienky púšte vlaha zarosí <font color='#B71C1C'>*</font><br>" +
                            "a pahorky sa opášu plesaním.<font color='#B71C1C'> – R.</font>"},
            {"10", "5", "1", "Ž 116, 10-11. 15-16. 17-18",
                    "<font color='#B71C1C'>R.:</font> Obetu chvály ti, Pane, prinesiem.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Dôveroval som, aj keď som povedal: <font color='#B71C1C'>*</font><br>" +
                            "\"Som veľmi pokorený.\"<br>" +
                            "V rozrušení som vyriekol: <font color='#B71C1C'>*</font><br>" +
                            "\"Všetci ľudia klamú.\"<font color='#B71C1C'> – R.</font><br>" +
                            "V Pánových očiach má veľkú cenu <font color='#B71C1C'>*</font><br>" +
                            "smrť jeho svätých.<br>" +
                            "Pane, som tvoj sluha, <font color='#B71C1C'>†</font><br>" +
                            "som tvoj sluha a syn tvojej služobnice. <font color='#B71C1C'>*</font><br>" +
                            "Ty si mi putá rozviazal.<font color='#B71C1C'> – R.</font><br>" +
                            "Obetu chvály ti prinesiem <font color='#B71C1C'>*</font><br>" +
                            "a budem vzývať meno Pánovo.<br>" +
                            "Splním svoje sľuby Pánovi <font color='#B71C1C'>*</font><br>" +
                            "pred všetkým jeho ľudom.<font color='#B71C1C'> – R.</font>"},
            {"10", "5", "2", "Ž 27, 7-8a. 8b-9c. 13-14",
                    "<font color='#B71C1C'>R.:</font> Pane, moja pomoc, hľadám tvoju tvár.<br><br>" +
                            "Čuj, Pane, hlas môjho volania, <font color='#B71C1C'>*</font><br>" +
                            "zľutuj sa nado mnou a vyslyš ma.<br>" +
                            "V srdci mi znejú tvoje slová: <font color='#B71C1C'>*</font><br>" +
                            "\"Hľadajte moju tvár!\"<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, ja hľadám tvoju tvár. <font color='#B71C1C'>*</font><br>" +
                            "Neodvracaj svoju tvár odo mňa,<br>" +
                            "neodkláňaj sa v hneve od svojho služobníka. <font color='#B71C1C'>*</font><br>" +
                            "ty si moja pomoc, neodvrhuj ma.<font color='#B71C1C'> – R.</font><br>" +
                            "Verím, že uvidím dobrodenia Pánove <font color='#B71C1C'>*</font><br>" +
                            "v krajine žijúcich.<br>" +
                            "Očakávaj Pána a buď statočný; <font color='#B71C1C'>*</font><br>" +
                            "srdce maj silné a drž sa Pána.<font color='#B71C1C'> – R.</font>"},
            {"10", "6", "1", "Ž 103, 1-2. 3-4. 8-9. 11-12",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď on ti odpúšťa všetky neprávosti, <font color='#B71C1C'>*</font><br>" +
                            "on lieči všetky tvoje neduhy;<br>" +
                            "on vykupuje tvoj život zo záhuby, <font color='#B71C1C'>*</font><br>" +
                            "on ťa venčí milosrdenstvom a milosťou.<font color='#B71C1C'> – R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a dobrotivý nesmierne.<br>" +
                            "Nevyčíta nám ustavične naše chyby, <font color='#B71C1C'>*</font><br>" +
                            "ani sa nehnevá naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo ako vysoko je nebo od zeme, <font color='#B71C1C'>*</font><br>" +
                            "také veľké je jeho zľutovanie voči tým, čo sa ho boja.<br>" +
                            "Ako je vzdialený východ od západu, <font color='#B71C1C'>*</font><br>" +
                            "tak vzďaľuje od nás našu neprávosť.<font color='#B71C1C'> – R.</font>"},
            {"10", "6", "2", "Ž 16, 1-2a+5. 7-8. 9-10",
                    "<font color='#B71C1C'>R.:</font> Ty, Pane, si moje jediné dobro.<br><br>" +
                            "Ochráň ma, Bože, k tebe sa utiekam. <font color='#B71C1C'>*</font><br>" +
                            "Hovorím Pánovi: \"Ty si môj Pán.\"<br>" +
                            "Ty, Pane, si môj podiel na dedičstve a na kalichu, <font color='#B71C1C'>*</font><br>" +
                            "v tvojich rukách je môj osud.<font color='#B71C1C'> – R.</font><br>" +
                            "Velebím Pána, čo ma múdrosťou obdaril; <font color='#B71C1C'>*</font><br>" +
                            "v noci ma k tomu moje srdce vyzýva.<br>" +
                            "Pána mám vždy pred očami; <font color='#B71C1C'>*</font><br>" +
                            "a pretože je po mojej pravici, nezakolíšem sa.<font color='#B71C1C'> – R.</font><br>" +
                            "Preto sa raduje moje srdce <font color='#B71C1C'>†</font><br>" +
                            "a moja duša plesá <font color='#B71C1C'>*</font><br>" +
                            "aj moje telo odpočíva v nádeji.<br>" +
                            "Lebo nenecháš moju dušu v podsvetí <font color='#B71C1C'>*</font><br>" +
                            "a nedovolíš, aby tvoj svätý videl porušenie.<font color='#B71C1C'> – R.</font>"},
            {"11", "A", "", "Ž 100, 2. 3. 5",
                    "<font color='#B71C1C'>R.:</font> Sme jeho ľud a ovce z jeho stáda.<br><br>" +
                            "Jasaj na chválu Pánovi, celá zem, <font color='#B71C1C'>†</font><br>" +
                            "s radosťou slúžte Pánovi. <font color='#B71C1C'>*</font><br>" +
                            "S plesaním vstupujte pred jeho tvár.<font color='#B71C1C'> – R.</font><br>" +
                            "Vedzte, že náš Pán je Boh; <font color='#B71C1C'>†</font><br>" +
                            "on je náš stvoriteľ a jemu patríme, <font color='#B71C1C'>*</font><br>" +
                            "sme jeho ľud a ovce z jeho stáda.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán je dobrý; <font color='#B71C1C'>†</font><br>" +
                            "jeho milosrdenstvo trvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho vernosť z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"11", "B", "", "Ž 92, 2-3. 13-14. 15-16",
                    "<font color='#B71C1C'>R.:</font> Ako je dobre oslavovať teba, Pane!<br><br>" +
                            "Dobre je oslavovať Pána <font color='#B71C1C'>*</font><br>" +
                            "a ospevovať meno tvoje, Najvyšší;<br>" +
                            "za rána zvestovať tvoju dobrotu <font color='#B71C1C'>*</font><br>" +
                            "a tvoju vernosť celú noc.<font color='#B71C1C'> – R.</font><br>" +
                            "Spravodlivý sťa palma zakvitne <font color='#B71C1C'>*</font><br>" +
                            "a vyrastie sťa céder z Libanonu.<br>" +
                            "Tí, čo vyrastajú v dome Pánovom, <font color='#B71C1C'>*</font><br>" +
                            "v nádvoriach nášho Boha budú prekvitať.<font color='#B71C1C'> – R.</font><br>" +
                            "Ešte aj v starobe budú prinášať ovocie, <font color='#B71C1C'>*</font><br>" +
                            "úrodní budú a plní sviežosti;<br>" +
                            "a tak zvestujú, že Pán, moje útočište, je spravodlivý <font color='#B71C1C'>*</font><br>" +
                            "a neprávosti v ňom niet.<font color='#B71C1C'> – R.</font>"},
            {"11", "C", "", "Ž 32, 1-2. 5. 7. 11",
                    "<font color='#B71C1C'>R.:</font> Odpusť mi, Pane, vinu môjho hriechu.<br><br>" +
                            "Blažený, komu sa odpustila neprávosť <font color='#B71C1C'>*</font><br>" +
                            "a je oslobodený od hriechu.<br>" +
                            "Blažený človek, ktorému Pán vinu nepripočíta <font color='#B71C1C'>*</font><br>" +
                            "a v ktorého mysli niet podvodu.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyznal som sa ti zo svojho hriechu <font color='#B71C1C'>*</font><br>" +
                            "a nezatajil som svoj priestupok.<br>" +
                            "Povedal som si: \"Vyznám Pánovi svoju neprávosť.\" <font color='#B71C1C'>*</font><br>" +
                            "A ty si mi odpustil zlobu môjho hriechu.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty si moje útočište, ochrániš ma pred súžením; <font color='#B71C1C'>*</font><br>" +
                            "zahrnieš ma radosťou zo spásy.<font color='#B71C1C'> – R.</font><br>" +
                            "Radujte sa, spravodliví, v Pánovi a plesajte, <font color='#B71C1C'>*</font><br>" +
                            "jasajte všetci, čo máte srdce úprimné.<font color='#B71C1C'> – R.</font>"},
            {"11", "1", "1", "Ž 98, 1. 2-3b. 3c-4",
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
                            "plesajte, radujte sa a hrajte.<font color='#B71C1C'> – R.</font>"},
            {"", "1", "2", "Ž 5, 2-3. 5-6. 7",
                    "<font color='#B71C1C'>R.:</font> Pane, všimni si moje vzdychanie.<br><br>" +
                            "Pane, počuj moje slová, <font color='#B71C1C'>*</font><br>" +
                            "všimni si moje vzdychanie.<br>" +
                            "Pozoruj moju hlasitú prosbu, <font color='#B71C1C'>*</font><br>" +
                            "môj kráľ a môj Boh.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty nie si Boh, ktorému by sa páčila neprávosť, <font color='#B71C1C'>†</font><br>" +
                            "zlý človek nepobudne pri tebe, <font color='#B71C1C'>*</font><br>" +
                            "ani nespravodliví neobstoja pred tvojím pohľadom.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty nenávidíš všetkých, čo páchajú neprávosť, <font color='#B71C1C'>†</font><br>" +
                            "ničíš všetkých, čo hovoria klamstvá. <font color='#B71C1C'>*</font><br>" +
                            "Od vraha a podvodníka sa odvracia Pán s odporom.<font color='#B71C1C'> – R.</font>"},
            {"11", "2", "1", "Ž 146, 1-2a. 5-6. 7. 8-9a",
                    "<font color='#B71C1C'>R.:</font> Chváľ, duša moja, Pána cez celý môj život.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľ, duša moja, pána; <font color='#B71C1C'>*</font><br>" +
                            "celý život chcem chváliť Pána.<font color='#B71C1C'> – R.</font><br>" +
                            "Blažený, komu pomáha Boh Jakubov, <font color='#B71C1C'>*</font><br>" +
                            "kto sa spolieha na Pána, svojho Boha.<br>" +
                            "On stvoril nebo i zem, <font color='#B71C1C'>†</font><br>" +
                            "more a všetko, čo je v ňom. <font color='#B71C1C'>*</font><br>" +
                            "On zachováva vernosť naveky,<font color='#B71C1C'> – R.</font><br>" +
                            "utláčaným prisudzuje právo, <font color='#B71C1C'>†</font><br>" +
                            "hladujúcim dáva chlieb. <font color='#B71C1C'>*</font><br>" +
                            "Pán vyslobodzuje väzňov,<font color='#B71C1C'> – R.</font><br>" +
                            "Pán otvára oči slepým, <font color='#B71C1C'>*</font><br>" +
                            "Pán dvíha skľúčených,<br>" +
                            "Pán miluje spravodlivých. <font color='#B71C1C'>*</font><br>" +
                            "Pán ochraňuje cudzincov.<font color='#B71C1C'> – R.</font>"},
            {"11", "2", "2", "Ž 51, 3-4. 5-6a. 11+16",
                    "<font color='#B71C1C'>R.:</font> Zmiluj sa, Pane, lebo sme zhrešili.<br><br>" +
                            "Zmiluj sa, Bože, nado mnou pre svoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje veľké zľutovanie znič moju neprávosť.<br>" +
                            "Úplne zmy zo mňa moju vinu <font color='#B71C1C'>*</font><br>" +
                            "a očisť ma od hriechu.<font color='#B71C1C'> – R.</font><br>" +
                            "Vedomý som si svojej neprávosti <font color='#B71C1C'>*</font><br>" +
                            "a svoj hriech mám stále pred sebou.<br>" +
                            "Proti tebe, proti tebe samému som sa prehrešil <font color='#B71C1C'>*</font><br>" +
                            "a urobil som, čo je v tvojich očiach zlé.<font color='#B71C1C'> – R.</font><br>" +
                            "Odvráť svoju tvár od mojich hriechov <font color='#B71C1C'>*</font><br>" +
                            "a zotri všetky moje viny.<br>" +
                            "Bože, Boh mojej spásy, zbav ma škvrny krvipreliatia <font color='#B71C1C'>*</font><br>" +
                            "a môj jazyk zajasá nad tvojou spravodlivosťou.<font color='#B71C1C'> – R.</font>"},
            {"11", "3", "1", "Ž 112, 1-2. 3-4. 9",
                    "<font color='#B71C1C'>R.:</font> Spravodlivý rozdeľuje a dáva.<br><br>" +
                            "Blažený muž, ktorý sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a má veľkú záľubu v jeho príkazoch.<br>" +
                            "Jeho potomstvo bude mocné na zemi; <font color='#B71C1C'>*</font><br>" +
                            "pokolenie spravodlivých bude požehnané.<font color='#B71C1C'> – R.</font><br>" +
                            "V jeho dome bude úspech a bohatstvo, <font color='#B71C1C'>*</font><br>" +
                            "jeho spravodlivosť ostane naveky.<br>" +
                            "Spravodlivým žiari svetlo v temnotách, <font color='#B71C1C'>*</font><br>" +
                            "milosrdný, milostivý a spravodlivý.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozdeľuje a dáva chudobným; <font color='#B71C1C'>†</font><br>" +
                            "jeho dobročinnosť potrvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho moc a sláva budú stále rásť.<font color='#B71C1C'> – R.</font>"},
            {"11", "3", "2", "Ž 31, 20. 21. 24",
                    "<font color='#B71C1C'>R.:</font> Majte srdce statočné, vy všetci, čo dúfate v Pána.<br><br>" +
                            "Pane, tvoja dobrota je taká nesmierna <font color='#B71C1C'>*</font><br>" +
                            "a vyhradil si ju bohabojným.<br>" +
                            "Preukazuješ ju tým, čo v teba dúfajú, <font color='#B71C1C'>*</font><br>" +
                            "pred zrakom ľudí.<font color='#B71C1C'> – R.</font><br>" +
                            "Záclonou svojej tváre ich kryješ <font color='#B71C1C'>*</font><br>" +
                            "pred zúrivosťou ľudu.<br>" +
                            "V stánku ich chrániš <font color='#B71C1C'>*</font><br>" +
                            "pred svárlivými jazykmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Milujte Pána, všetci jeho svätí. <font color='#B71C1C'>†</font><br>" +
                            "Pán verných chráni, <font color='#B71C1C'>*</font><br>" +
                            "ale plnou mierou odpláca tým, čo si počínajú pyšne.<font color='#B71C1C'> – R.</font>"},
            {"11", "4", "1", "Ž 111, 1-2. 3-4. 7-8",
                    "<font color='#B71C1C'>R.:</font> Pravdivé a spravodlivé sú diela tvojich rúk, Pane.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Z celého srdca chcem oslavovať Pána <font color='#B71C1C'>*</font><br>" +
                            "v zbore spravodlivých i v zhromaždení.<br>" +
                            "Veľké sú diela Pánove; <font color='#B71C1C'>*</font><br>" +
                            "nech ich skúmajú všetci, čo majú v nich záľubu.<font color='#B71C1C'> – R.</font><br>" +
                            "Nádherné a vznešené sú jeho diela, <font color='#B71C1C'>*</font><br>" +
                            "jeho spravodlivosť platí naveky.<br>" +
                            "Ustanovil pamiatku na svoje obdivuhodné skutky; <font color='#B71C1C'>*</font><br>" +
                            "Pán je milosrdný a milostivý.<font color='#B71C1C'> – R.</font><br>" +
                            "Pravdivé a spravodlivé sú diela jeho rúk. <font color='#B71C1C'>*</font><br>" +
                            "Nezrušiteľné sú všetky jeho príkazy,<br>" +
                            "upevnené naveky, <font color='#B71C1C'>*</font><br>" +
                            "založené na pravde a spravodlivosti.<font color='#B71C1C'> – R.</font>"},
            {"11", "4", "2", "Ž 97, 1-2. 3-4. 5-6. 7",
                    "<font color='#B71C1C'>R.:</font> Radujte sa, spravodliví, tešte sa v Pánovi.<br><br>" +
                            "Pán kraľuje, jasaj, zem; <font color='#B71C1C'>*</font><br>" +
                            "radujte sa, všetky ostrovy.<br>" +
                            "Vôkol neho oblaky a mrákavy, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a právo sú základom jeho trónu.<font color='#B71C1C'> – R.</font><br>" +
                            "Predchádza ho oheň, <font color='#B71C1C'>*</font><br>" +
                            "čo navôkol spaľuje jeho nepriateľov.<br>" +
                            "Jeho blesky ožarujú zemekruh: <font color='#B71C1C'>*</font><br>" +
                            "zem to vidí a chveje sa.<font color='#B71C1C'> – R.</font><br>" +
                            "Ako vosk sa topia vrchy pred tvárou Pánovou, <font color='#B71C1C'>*</font><br>" +
                            "pred Pánom celej zeme.<br>" +
                            "Jeho spravodlivosť ohlasujú nebesia <font color='#B71C1C'>*</font><br>" +
                            "a jeho slávu vidia všetky národy.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa hanbia všetci, čo uctievajú modly drevené <font color='#B71C1C'>†</font><br>" +
                            "a honosia sa svojimi sochami. <font color='#B71C1C'>*</font><br>" +
                            "Klaňajte sa mu, všetci jeho anjeli.<font color='#B71C1C'> – R.</font>"},
            {"11", "5", "1", "Ž 34, 2-3. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Pán vyslobodí spravodlivých zo všetkých tiesní.<br><br>" +
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
                            "a vyslobodil ho zo všetkých tiesní.<font color='#B71C1C'> – R.</font>"},
            {"11", "5", "2", "Ž 132, 11. 12. 13-14. 17-18",
                    "<font color='#B71C1C'>R.:</font> Pán si vyvolil Sion za svoj príbytok.<br><br>" +
                            "Dávidovi sa Pán zaviazal prísahou; <font color='#B71C1C'>*</font><br>" +
                            "je pravdivá, nikdy ju neodvolá:<br>" +
                            "\"Potomka z tvojho rodu <font color='#B71C1C'>*</font><br>" +
                            "posadím na tvoj trón.<font color='#B71C1C'> – R.</font><br>" +
                            "Ak tvoji synovia dodržia moju zmluvu <font color='#B71C1C'>*</font><br>" +
                            "a moje príkazy, ktoré ich naučím,<br>" +
                            "aj ich synovia <font color='#B71C1C'>*</font><br>" +
                            "budú sedieť na tvojom tróne naveky.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán si vyvolil Sion, <font color='#B71C1C'>*</font><br>" +
                            "želal si mať ho za svoj príbytok:<br>" +
                            "\"To je miesto môjho odpočinku naveky; <font color='#B71C1C'>*</font><br>" +
                            "tu budem bývať, lebo som túžil za ním.<font color='#B71C1C'> – R.</font><br>" +
                            "Tu Dávidovej moci dám vypučať, <font color='#B71C1C'>*</font><br>" +
                            "svojmu pomazanému pripravím svetlo.<br>" +
                            "Jeho nepriateľov hanbou zakryjem, <font color='#B71C1C'>*</font><br>" +
                            "no na jeho hlave zažiari diadém.\"<font color='#B71C1C'> – R.</font>"},
            {"11", "6", "1", "Ž 34, 8-9. 10-11. 12-13",
                    "<font color='#B71C1C'>R.:</font> Skúste a presvedčte sa, aký dobrý je Pán.<br><br>" +
                            "Ako strážca sa utáborí anjel Pánov okolo bohabojných <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodí ich.<br>" +
                            "Skúste a presvedčte sa, aký dobrý je Pán; <font color='#B71C1C'>*</font><br>" +
                            "šťastný človek, čo sa utieka k nemu.<font color='#B71C1C'> – R.</font><br>" +
                            "Vy, jeho svätí, bojte sa Pána, <font color='#B71C1C'>*</font><br>" +
                            "veď bohabojní núdzu nemajú.<br>" +
                            "Boháči sa nabiedia a nahladujú, <font color='#B71C1C'>*</font><br>" +
                            "ale tým, čo hľadajú Pána,<br>" +
                            "nijaké dobro chýbať nebude.<font color='#B71C1C'> – R.</font><br>" +
                            "Poďte, deti, čujte ma, <font color='#B71C1C'>*</font><br>" +
                            "naučím vás bázni Pánovej.<br>" +
                            "Miluje niekto život <font color='#B71C1C'>*</font><br>" +
                            "a chce požívať dobro v šťastných dňoch?<font color='#B71C1C'> – R.</font>"},
            {"11", "6", "2", "Ž 89, 4-5. 29-30. 31-33. 34",
                    "<font color='#B71C1C'>R.:</font> Pánovo milosrdenstvo trvá naveky.<br><br>" +
                            "\"Zmluvu som uzavrel so svojím vyvoleným, <font color='#B71C1C'>*</font><br>" +
                            "svojmu služobníkovi Dávidovi som prisahal:<br>" +
                            "Naveky zaistím tvoj rod <font color='#B71C1C'>*</font><br>" +
                            "a postavím tvoj trón, čo pretrvá všetky pokolenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Naveky mu svoju milost' zachovám <font color='#B71C1C'>*</font><br>" +
                            "a pevná bude moja zmluva s ním.<br>" +
                            "Jeho rod udržím naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho trón bude ako dni nebies.<font color='#B71C1C'> – R.</font><br>" +
                            "No keď raz jeho synovia môj zákon opustia <font color='#B71C1C'>*</font><br>" +
                            "a nebudú kráčat' podľa mojich príkazov,<br>" +
                            "keď moje ustanovenia znesvätia <font color='#B71C1C'>*</font><br>" +
                            "a nezachovajú moje predpisy,<br>" +
                            "potom ich priestupok trstenicou potrescem <font color='#B71C1C'>*</font><br>" +
                            "a ich neprávost' korbáčom.<font color='#B71C1C'> – R.</font><br>" +
                            "Ale priazeň mu neodopriem <font color='#B71C1C'>*</font><br>" +
                            "a neporuším svoju vernost'.\"<font color='#B71C1C'> – R.</font>"},
            {"12", "A", "", "Ž 69, 8-10. 14+17. 33-35",
                    "<font color='#B71C1C'>R.:</font> Vo svojej veľkej láske vyslyš ma, Pane.<br><br>" +
                            "Pre teba znášam potupu <font color='#B71C1C'>*</font><br>" +
                            "a hanba mi pokrýva tvár.<br>" +
                            "Svojim bratom som sa stal cudzincom, <font color='#B71C1C'>*</font><br>" +
                            "a synom svojej matky neznámym.<br>" +
                            "Stravuje ma horlivosť za tvoj dom, <font color='#B71C1C'>*</font><br>" +
                            "padajú na mňa urážky tých, čo ťa urážajú.<font color='#B71C1C'> – R.</font><br>" +
                            "Ale ja, Pane, obraciam sa modlitbou k tebe <font color='#B71C1C'>*</font><br>" +
                            "v tomto čase milosti.<br>" +
                            "Vypočuj ma, Bože, pre svoju veľkú dobrotu, <font color='#B71C1C'>*</font><br>" +
                            "pre svoju vernosť mi pomôž.<br>" +
                            "Vyslyš ma, Pane, veď si dobrotivý a láskavý; <font color='#B71C1C'>*</font><br>" +
                            "pre svoje veľké milosrdenstvo pohliadni na mňa.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech zvedia o tom ponížení a nech sa potešia; <font color='#B71C1C'>*</font><br>" +
                            "hľadajte Boha a srdce vám oživne.<br>" +
                            "Lebo Pán vypočuje chudobných <font color='#B71C1C'>*</font><br>" +
                            "a nepohŕda svojimi, keď sú v zajatí.<br>" +
                            "Nech ho chvália nebesia i zem, <font color='#B71C1C'>*</font><br>" +
                            "moria a všetko, čo sa hýbe v nich.<font color='#B71C1C'> – R.</font>"},
            {"12", "B", "", "Ž 107, 23-24. 25-26. 28-29. 30-31",
                    "<font color='#B71C1C'>R.:</font> Oslavujte Pána, lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Púšťali sa na lodiach po mori <font color='#B71C1C'>*</font><br>" +
                            "a na veľkých vodách robili obchody.<br>" +
                            "Tam videli diela Pánove <font color='#B71C1C'>*</font><br>" +
                            "a na hlbočinách jeho zázraky.<font color='#B71C1C'> – R.</font><br>" +
                            "Prehovoril a vyvolal búrku úžasnú, <font color='#B71C1C'>*</font><br>" +
                            "až sa morské vlny vzdúvali;<br>" +
                            "priam k nebu stúpali <font color='#B71C1C'>†</font><br>" +
                            "a vzápätí sa prepadali do hlbín; <font color='#B71C1C'>*</font><br>" +
                            "duša im hrôzou zmierala.<font color='#B71C1C'> – R.</font><br>" +
                            "V súžení volali k Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a on ich vyslobodil z úzkostí.<br>" +
                            "Búrku premenil na vánok <font color='#B71C1C'>*</font><br>" +
                            "a morské vlny umĺkli.<font color='#B71C1C'> – R.</font><br>" +
                            "Tešili sa, že vlny utíchli, <font color='#B71C1C'>*</font><br>" +
                            "a priviedol ich do prístavu, za ktorým túžili.<br>" +
                            "Nech oslavujú Pána za jeho milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a za zázraky v prospech ľudí.<font color='#B71C1C'> – R.</font>"},
            {"12", "C", "", "Ž 63, 2. 3-4. 5-6. 8-9",
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
            {"12", "1", "1", "Ž 33, 12-13. 18-19. 20+22",
                    "<font color='#B71C1C'>R.:</font> Blažený ľud, ktorý si Pán vyvolil za dedičstvo.<br><br>" +
                            "Blažený národ, ktorého Bohom je Pán, <font color='#B71C1C'>*</font><br>" +
                            "blažený ľud, ktorý si on vyvolil za dedičstvo.<br>" +
                            "Pán hľadí z neba <font color='#B71C1C'>*</font><br>" +
                            "a vidí všetkých ľudí.<font color='#B71C1C'> – R.</font><br>" +
                            "Hľa, oko Pánovo bdie nad tými, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "nad tými, čo v jeho milosrdenstvo dúfajú,<br>" +
                            "aby ich zachránil pred smrťou <font color='#B71C1C'>*</font><br>" +
                            "a v čase hladu nakŕmil.<font color='#B71C1C'> – R.</font><br>" +
                            "Naša duša očakáva Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je naša pomoc a ochrana.<br>" +
                            "Tvoje milosrdenstvo, Pane, nech je nad nami, <font color='#B71C1C'>*</font><br>" +
                            "ako dúfame v teba.<font color='#B71C1C'> – R.</font>"},
            {"12", "1", "2", "Ž 60, 3. 4-5. 12-13",
                    "<font color='#B71C1C'>R.:</font> Vyslyš nás, Pane, pomôž nám svojou pravicou.<br><br>" +
                            "Bože, ty si nás odvrhol, ty si nás rozohnal; <font color='#B71C1C'>*</font><br>" +
                            "rozhneval si sa, ale opäť sa k nám obrát'.<font color='#B71C1C'> – R.</font><br>" +
                            "Zatriasol si zemou, rozštiepil si ju, <font color='#B71C1C'>*</font><br>" +
                            "ale zahoj jej trhliny, lebo sa chveje.<br>" +
                            "Tvrdú skúšku si zoslal na svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "napojil si nás vínom závratu.<font color='#B71C1C'> – R.</font><br>" +
                            "Kto iný ako ty, Bože, čo si nás odvrhol? <font color='#B71C1C'>*</font><br>" +
                            "A prečo už, Bože, nekráčaš na čele našich vojsk?<br>" +
                            "Pomôž nám dostat' sa z útlaku, <font color='#B71C1C'>*</font><br>" +
                            "pretože ľudská pomoc nestačí.<br>" +
                            "S Bohom budeme udatní, <font color='#B71C1C'>*</font><br>" +
                            "on našich utláčateľov pošliape.<font color='#B71C1C'> – R.</font>"},
            {"12", "2", "1", "Ž 15, 2-3a. 3b-4b. 5",
                    "<font color='#B71C1C'>R.:</font> Pane, kto smie bývať v tvojom svätom stánku?<br><br>" +
                            "Ten, čo kráča bez poškvrny a koná spravodlivo, <font color='#B71C1C'>†</font> <br>" +
                            "čo z úprimného srdca pravdu hovorí, <font color='#B71C1C'>*</font> <br>" +
                            "čo nepodvádza svojím jazykom.<font color='#B71C1C'> – R.</font> <br>" +
                            "Čo nekrivdí svojmu blížnemu, <font color='#B71C1C'>*</font> <br>" +
                            "ani ho nepotupuje. <br>" +
                            "Čo ničomníka nemá za nič, <font color='#B71C1C'>*</font> <br>" +
                            "ale ctí si ľudí bohabojných.<font color='#B71C1C'> – R.</font> <br>" +
                            "Čo nepožičiava peniaze na úrok <font color='#B71C1C'>†</font> <br>" +
                            "a proti nevinnému sa nedá podplácať. <font color='#B71C1C'>*</font> <br>" +
                            "Kto si tak počína, ten sa nikdy neskláti.<font color='#B71C1C'> – R.</font>"},
            {"12", "2", "2", "Ž 48, 2-3a. 3b-4. 10-11",
                    "<font color='#B71C1C'>R.:</font> Boh založil svoje mesto naveky.<br><br>" +
                            "Veľký je Pán a hoden každej chvály <font color='#B71C1C'>*</font><br>" +
                            "v meste nášho Boha.<br>" +
                            "Jeho svätý vrch, prekrásne návršie, <font color='#B71C1C'>*</font><br>" +
                            "je celej zemi na radosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Vrch Sion, tajomný príbytok, <font color='#B71C1C'>*</font><br>" +
                            "je mestom veľkého kráľa.<br>" +
                            "Boh sa preslávil v jeho palácoch <font color='#B71C1C'>*</font><br>" +
                            "ako istá ochrana.<font color='#B71C1C'> – R.</font><br>" +
                            "Spomíname, Bože, na tvoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "uprostred tvojho chrámu.<br>" +
                            "Ako tvoje meno, Bože, <font color='#B71C1C'>†</font><br>" +
                            "tak aj tvoja sláva šíri sa až do končín zeme; <font color='#B71C1C'>*</font><br>" +
                            "tvoja pravica je plná spravodlivosti.<font color='#B71C1C'> – R.</font>"},
            {"12", "3", "1", "Ž 105, 1-2. 3-4. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pán večne pamätá na svoju zmluvu.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána a vzývajte jeho meno, <font color='#B71C1C'>*</font><br>" +
                            "rozhlasujte jeho skutky medzi národmi.<br>" +
                            "Spievajte mu a hrajte, <font color='#B71C1C'>*</font><br>" +
                            "rozprávajte o jeho obdivuhodných skutkoch.<font color='#B71C1C'> – R.</font><br>" +
                            "Jeho svätým menom sa honoste; <font color='#B71C1C'>*</font><br>" +
                            "nech sa radujú srdcia tých, čo hľadajú Pána.<br>" +
                            "Hľadajte Pána a jeho moc, <font color='#B71C1C'>*</font><br>" +
                            "hľadajte vždy jeho tvár,<font color='#B71C1C'> – R.</font><br>" +
                            "vy, potomci Abraháma, Pánovho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "synovia Jakuba, vyvoleného Pánovho.<br>" +
                            "On, Pán, je náš Boh; <font color='#B71C1C'>*</font><br>" +
                            "jeho rozhodnutia platia po celej zemi.<font color='#B71C1C'> – R.</font><br>" +
                            "Večne pamätá na svoju zmluvu, <font color='#B71C1C'>*</font><br>" +
                            "na sľub, ktorý dal pokoleniam tisícim,<br>" +
                            "na zmluvu, čo s Abrahámom uzavrel, <font color='#B71C1C'>*</font><br>" +
                            "na prísahu, ktorou sa Izákovi zaviazal.<font color='#B71C1C'> – R.</font>"},
            {"12", "3", "2", "Ž 119, 33. 34. 35. 36. 37. 40",
                    "<font color='#B71C1C'>R.:</font> Ukáž mi, Pane, cestu svojich prikázaní.<br><br>" +
                            "Pane, ukáž mi cestu svojich prikázaní <font color='#B71C1C'>*</font><br>" +
                            "a ja vždy pôjdem po nej.<font color='#B71C1C'> – R.</font><br>" +
                            "Daj mi chápavosť a ja tvoj zákon zachovám <font color='#B71C1C'>*</font><br>" +
                            "a celým srdcom sa ho budem pridŕžať.<font color='#B71C1C'> – R.</font><br>" +
                            "Priveď ma na chodník svojich príkazov, <font color='#B71C1C'>*</font><br>" +
                            "lebo som si ho obľúbil.<font color='#B71C1C'> – R.</font><br>" +
                            "Nakloň mi srdce k svojej náuke, <font color='#B71C1C'>*</font><br>" +
                            "a nie ku chamtivosti.<font color='#B71C1C'> – R.</font><br>" +
                            "Odvráť mi oči, nech nepozerajú na márnosť; <font color='#B71C1C'>*</font><br>" +
                            "na tvojej ceste dopraj mi života.<font color='#B71C1C'> – R.</font><br>" +
                            "Hľa, túžim za tvojimi príkazmi; <font color='#B71C1C'>*</font><br>" +
                            "nuž oživ ma v svojej spravodlivosti.<font color='#B71C1C'> – R.</font>"},
            {"12", "4", "1", "Ž 106, 1-2. 3-4a. 4b-5",
                    "<font color='#B71C1C'>R.:</font> Oslavujte Pána, lebo je dobrý.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "Kto vyrozpráva mocné skutky Pánove, <font color='#B71C1C'>*</font><br>" +
                            "kto všetku jeho chválu rozhlási?<font color='#B71C1C'> – R.</font><br>" +
                            "Blažení sú tí, čo zachovávajú právo <font color='#B71C1C'>†</font><br>" +
                            "a konajú spravodlivo v každý čas. <font color='#B71C1C'>*</font><br>" +
                            "Pamätaj na nás, Pane, z lásky k svojmu ľudu.<font color='#B71C1C'> – R.</font><br>" +
                            "Navštív nás svojou spásou, <font color='#B71C1C'>*</font><br>" +
                            "aby sme videli šťastie tvojich vyvolených,<br>" +
                            "aby sme sa radovali z radosti tvojho ľudu <font color='#B71C1C'>*</font><br>" +
                            "a boli hrdí na teba so všetkými tvojimi dedičmi.<font color='#B71C1C'> – R.</font>"},
            {"12", "4", "2", "Ž 79, 1-2. 3-5. 8. 9",
                    "<font color='#B71C1C'>R.:</font> Pre slávu svojho mena vysloboď nás, Pane.<br><br>" +
                            "Bože, pohania vtrhli do tvojho dedičstva, <font color='#B71C1C'>†</font><br>" +
                            "poškvrnili tvoj svätý chrám <font color='#B71C1C'>*</font><br>" +
                            "a Jeruzalem obrátili na rumy.<br>" +
                            "Mŕtvoly tvojich služobníkov<br>" +
                            "dali za pokrm vtákom lietavým <font color='#B71C1C'>*</font><br>" +
                            "a divej zveri dávali telá tvojich svätých.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozlievali ich krv ako vodu vôkol Jeruzalema <font color='#B71C1C'>*</font><br>" +
                            "a nemal ich kto pochovať.<br>" +
                            "Susedia nás začali potupovať <font color='#B71C1C'>*</font><br>" +
                            "a okolití ľudia haniť a vysmievať.<br>" +
                            "Dokedy ešte, Pane? Chceš sa hnevať naveky? <font color='#B71C1C'>*</font><br>" +
                            "Či tvoje rozhorčenie bude blčať sťa oheň?<font color='#B71C1C'> – R.</font><br>" +
                            "Zabudni na hriechy našich otcov; <font color='#B71C1C'>†</font><br>" +
                            "príď nám čím skôr v ústrety so svojím milosrdenstvom, <font color='#B71C1C'>*</font><br>" +
                            "lebo sme veľmi úbohí.<font color='#B71C1C'> – R.</font><br>" +
                            "Pre slávu svojho mena nám pomôž, Bože, naša spása, <font color='#B71C1C'>†</font><br>" +
                            "a vysloboď nás; <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje meno odpusť nám hriechy.<font color='#B71C1C'> – R.</font>"},
            {"12", "5", "1", "Ž 128, 1-2. 3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Požehnaný bude muž, ktorý sa bojí Pána.<br><br>" +
                            "Blažený každý, čo sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a kráča po jeho cestách.<br>" +
                            "Budeš jesť z práce svojich rúk; <font color='#B71C1C'>*</font><br>" +
                            "budeš šťastný a budeš sa mať dobre.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoja manželka je ako plodonosný vinič <font color='#B71C1C'>*</font><br>" +
                            "vnútri tvojho domu.<br>" +
                            "Tvoji synovia sú ako mládniky olivy <font color='#B71C1C'>*</font><br>" +
                            "okolo tvojho stola.<font color='#B71C1C'> – R.</font><br>" +
                            "Veru, tak bude požehnaný muž, <font color='#B71C1C'>*</font><br>" +
                            "ktorý sa bojí Pána.<br>" +
                            "Nech ťa žehná Pán zo Siona, <font color='#B71C1C'>†</font><br>" +
                            "aby si videl šťastie Jeruzalema <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni svojho života.<font color='#B71C1C'> – R.</font>"},
            {"12", "5", "2", "Ž 137, 1-2. 3. 4-5. 6",
                    "<font color='#B71C1C'>R.:</font> Pane, chcem stále pamätať na teba.<br><br>" +
                            "Na brehu babylonských riek, tam sme sedávali a plakali, <font color='#B71C1C'>*</font><br>" +
                            "keď sme si spomínali na Sion.<br>" +
                            "Na vŕby tejto krajiny <font color='#B71C1C'>*</font><br>" +
                            "vešali sme svoje citary.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo tí, čo nás zajali, <font color='#B71C1C'>*</font><br>" +
                            "žiadali od nás spevy<br>" +
                            "a tí, čo nás trápili, žiadali veselosť: <font color='#B71C1C'>*</font><br>" +
                            "\"Zaspievajte nám nejaké piesne sionské!\"<font color='#B71C1C'> – R.</font><br>" +
                            "Akože môžeme spievať pieseň Pánovu <font color='#B71C1C'>*</font><br>" +
                            "v cudzej krajine?<br>" +
                            "Keby som, Jeruzalem, zabudol na teba, <font color='#B71C1C'>*</font><br>" +
                            "nech mi odumrie pravica.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa mi prilepí jazyk na podnebie, <font color='#B71C1C'>*</font><br>" +
                            "keby som nepamätal na teba,<br>" +
                            "keby som Jeruzalem nepovýšil <font color='#B71C1C'>*</font><br>" +
                            "za vrchol svojej radosti.<font color='#B71C1C'> – R.</font>"},
            {"12", "6", "1", "Lk 1, 46-47. 48-49. 50+53. 54-55",
                    "<font color='#B71C1C'>R.:</font> Pán Boh pamätal na svoje milosrdenstvo.<br><br>" +
                            "Velebí moja duša Pána <font color='#B71C1C'>*</font><br>" +
                            "a môj duch jasá v Bohu, mojom spasiteľovi,<font color='#B71C1C'> – R.</font><br>" +
                            "lebo zhliadol na poníženosť svojej služobnice. <font color='#B71C1C'>*</font><br>" +
                            "hľa, od tejto chvíle blahoslaviť ma budú všetky pokolenia,<br>" +
                            "lebo veľké veci mi urobil ten, ktorý je mocný, <font color='#B71C1C'>*</font><br>" +
                            "a sväté je jeho meno<font color='#B71C1C'> – R.</font><br>" +
                            "a jeho milosrdenstvo z pokolenia na pokolenie <font color='#B71C1C'>*</font><br>" +
                            "s tými, čo sa ho boja.<br>" +
                            "Hladných nakŕmil dobrotami <font color='#B71C1C'>*</font><br>" +
                            "a bohatých prepustil naprázdno.<font color='#B71C1C'> – R.</font><br>" +
                            "Ujal sa Izraela, svojho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "lebo pamätá na svoje milosrdenstvo,<br>" +
                            "ako sľúbil našim otcom, <font color='#B71C1C'>*</font><br>" +
                            "Abrahámovi a jeho potomstvu naveky.<font color='#B71C1C'> – R.</font>"},
            {"12", "2", "", "Ž 74, 1-2. 3-4. 5-7. 20-21",
                    "<font color='#B71C1C'>R.:</font> Nezabúdaj, Pane, na svojich úbožiakov.<br><br>" +
                            "Prečo si nás, Bože, tak celkom zavrhol <font color='#B71C1C'>*</font><br>" +
                            "a prečo si hnevom zahorel proti ovciam tvojej pastviny?<br>" +
                            "Pamätaj na svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "ktorý je tvoj odprvoti.<br>" +
                            "Vykúpil si výhonok svojho dedičstva, <font color='#B71C1C'>*</font><br>" +
                            "vrch Sion, na ktorom prebývaš.<font color='#B71C1C'> – R.</font><br>" +
                            "Namier svoje kroky k večným zrúcaninám: <font color='#B71C1C'>*</font><br>" +
                            "nepriateľ spustošil celú svätyňu.<br>" +
                            "Tí, čo ťa nenávidia,<br>" +
                            "ryčia uprostred tvojho miesta svätého, <font color='#B71C1C'>*</font><br>" +
                            "vztyčujú svoje zástavy na znak víťazstva.<font color='#B71C1C'> – R.</font><br>" +
                            "Podobajú sa tým, čo sa veľmi rozháňajú sekerou <font color='#B71C1C'>*</font><br>" +
                            "v hustom lese.<br>" +
                            "Tak vylamujú brány chrámové <font color='#B71C1C'>*</font><br>" +
                            "a stŕhajú ich sekerou i hákom.<br>" +
                            "Podpálili tvoju svätyňu, <font color='#B71C1C'>*</font><br>" +
                            "príbytok tvojho mena až do základu zneuctili.<font color='#B71C1C'> – R.</font><br>" +
                            "Zhliadni na svoju zmluvu, <font color='#B71C1C'>*</font><br>" +
                            "veď násilníci si rozložili stany po celej krajine.<br>" +
                            "Pokorný nech sa s hanbou nevracia, <font color='#B71C1C'>*</font><br>" +
                            "chudák a bedár budú tvoje meno velebiť.<font color='#B71C1C'> – R.</font>"},
            {"13", "A", "", "Ž 89, 2-3. 16-17. 18-19",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, ospevovať budem naveky.<br><br>" +
                            "Pánovo milosrdenstvo chcem ospevovať naveky; <font color='#B71C1C'>*</font><br>" +
                            "po všetky pokolenia hlásať svojimi ústami tvoju vernosť.<br>" +
                            "Veď ty si povedal:<br>" +
                            "\"Moje milosrdenstvo je ustanovené naveky.\" <font color='#B71C1C'>*</font><br>" +
                            "Tvoja vernosť je upevnená v nebesiach.<font color='#B71C1C'> – R.</font><br>" +
                            "Blažený ľud, ktorý vie jasať! <font color='#B71C1C'>*</font><br>" +
                            "Kráča vo svetle tvojej tváre, Pane;<br>" +
                            "deň čo deň sa raduje z tvojho mena <font color='#B71C1C'>*</font><br>" +
                            "a honosí sa tvojou spravodlivosťou.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo ty si jeho sila a nádhera <font color='#B71C1C'>*</font><br>" +
                            "a tvojou priazňou sa dvíha naša moc.<br>" +
                            "Veď náš vladár patrí Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a náš kráľ Izraelovmu Svätému.<font color='#B71C1C'> – R.</font>"},
            {"13", "B", "", "Ž 30, 2+4. 5-6. 11-12a+13b",
                    "<font color='#B71C1C'>R.:</font> Budem ťa, Pane, oslavovať, že si ma vyslobodil.<br><br>" +
                            "Budem ťa, Pane, oslavovať, že si ma vyslobodil <font color='#B71C1C'>*</font><br>" +
                            "a že si nedovolil, aby sa moji nepriatelia radovali nado mnou.<br>" +
                            "Pane, vyviedol si ma z ríše zosnulých, <font color='#B71C1C'>*</font><br>" +
                            "navrátil si mi život, aby som nezostúpil do hrobu.<font color='#B71C1C'> – R.</font><br>" +
                            "Na harfe hrajte Pánovi, jeho svätí, <font color='#B71C1C'>*</font><br>" +
                            "vzdávajte vďaky jeho menu svätému.<br>" +
                            "Lebo len chvíľku trvá jeho hnev, <font color='#B71C1C'>*</font><br>" +
                            "ale celý život jeho láskavosť.<br>" +
                            "Podvečer je nám hosťom plač <font color='#B71C1C'>*</font><br>" +
                            "a radosť nad ránom.<font color='#B71C1C'> – R.</font><br>" +
                            "Čuj, Pane a zmiluj sa nado mnou; <font color='#B71C1C'>*</font><br>" +
                            "Pane, buď mi na pomoci.<br>" +
                            "Môj nárek si obrátil na tanec; <font color='#B71C1C'>*</font><br>" +
                            "Pane, Bože môj, naveky ťa chcem velebiť.<font color='#B71C1C'> – R.</font>"},
            {"13", "C", "", "Ž 16, 1-2a+5. 7-8. 9-10. 11",
                    "<font color='#B71C1C'>R.:</font> Ty, Pane, si moje jediné dobro.<br><br>" +
                            "Ochráň ma, Bože, k tebe sa utiekam. <font color='#B71C1C'>*</font><br>" +
                            "Hovorím Pánovi: \"Ty si môj Pán.\"<br>" +
                            "Ty, Pane, si môj podiel na dedičstve a na kalichu, <font color='#B71C1C'>*</font><br>" +
                            "v tvojich rukách je môj osud.<font color='#B71C1C'> – R.</font><br>" +
                            "Velebím Pána, čo ma múdrosťou obdaril; <font color='#B71C1C'>*</font><br>" +
                            "v noci ma k tomu moje srdce vyzýva.<br>" +
                            "Pána mám vždy pred očami; <font color='#B71C1C'>*</font><br>" +
                            "a pretože je po mojej pravici, nezakolíšem sa.<font color='#B71C1C'> – R.</font><br>" +
                            "Preto sa raduje moje srdce <font color='#B71C1C'>†</font><br>" +
                            "a moja duša plesá <font color='#B71C1C'>*</font><br>" +
                            "aj moje telo odpočíva v nádeji.<br>" +
                            "Lebo nenecháš moju dušu v podsvetí <font color='#B71C1C'>*</font><br>" +
                            "a nedovolíš, aby tvoj svätý videl porušenie.<font color='#B71C1C'> – R.</font><br>" +
                            "Ukážeš mi cestu života. <font color='#B71C1C'>†</font><br>" +
                            "U teba je plnosť radosti, <font color='#B71C1C'>*</font><br>" +
                            "po tvojej pravici večná slasť.<font color='#B71C1C'> – R.</font>"},
            {"13", "1", "1", "Ž 103, 1-2. 3-4. 8-9. 10-11",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď on ti odpúšťa všetky neprávosti, <font color='#B71C1C'>*</font><br>" +
                            "on lieči všetky tvoje neduhy;<br>" +
                            "on vykupuje tvoj život zo záhuby, <font color='#B71C1C'>*</font><br>" +
                            "on ťa venčí milosrdenstvom a milosťou.<font color='#B71C1C'> – R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a dobrotivý nesmierne.<br>" +
                            "nevyčíta nám ustavične naše chyby, <font color='#B71C1C'>*</font><br>" +
                            "ani sa nehnevá naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Nezaobchodí s nami podľa našich hriechov, <font color='#B71C1C'>*</font><br>" +
                            "ani nám neodpláca podľa našich neprávostí.<br>" +
                            "Lebo ako vysoko je nebo od zeme, <font color='#B71C1C'>*</font><br>" +
                            "také veľké je jeho zľutovanie voči tým, čo sa ho boja.<font color='#B71C1C'> – R.</font>"},
            {"13", "1", "2", "Ž 50, 16b-17. 18-19. 20-21. 22-23",
                    "<font color='#B71C1C'>R.:</font> Spamätajte sa a nezabúdajte na Boha.<br><br>" +
                            "Prečo odriekaš moje príkazy <font color='#B71C1C'>*</font><br>" +
                            "a moju zmluvu v ústach omieľaš?<br>" +
                            "Veď ty nenávidíš poriadok <font color='#B71C1C'>*</font><br>" +
                            "a moje slovo odmietaš.<font color='#B71C1C'> – R.</font><br>" +
                            "Keď vidíš zlodeja, pridávaš sa k nemu <font color='#B71C1C'>*</font><br>" +
                            "a s cudzoložníkmi sa spolčuješ.<br>" +
                            "Zo svojich úst vypúšťaš zlo <font color='#B71C1C'>*</font><br>" +
                            "a klamstvá snuje tvoj jazyk.<font color='#B71C1C'> – R.</font><br>" +
                            "Vysedávaš si a ohováraš svojho brata, <font color='#B71C1C'>*</font><br>" +
                            "syna svojej matky potupuješ.<br>" +
                            "Toto páchaš, a ja by som mal mlčať? <font color='#B71C1C'>†</font><br>" +
                            "Myslíš si, že ja som ako ty: <font color='#B71C1C'>*</font><br>" +
                            "teraz ťa obviňujem a hovorím ti to do očí.<font color='#B71C1C'> – R.</font><br>" +
                            "Pochopte to, vy, čo zabúdate na Boha; <font color='#B71C1C'>*</font><br>" +
                            "inak vás zahubím a nik vám nepomôže.<br>" +
                            "Kto prináša obetu chvály, ten ma ctí; <font color='#B71C1C'>†</font><br>" +
                            "a kto kráča bez úhony, <font color='#B71C1C'>*</font><br>" +
                            "tomu ukážem Božiu spásu.<font color='#B71C1C'> – R.</font>"},
            {"13", "2", "1", "Ž 26, 2-3. 9-10. 11-12",
                    "<font color='#B71C1C'>R.:</font> Mám pred očami, Pane, tvoju dobrotu.<br><br>" +
                            "Skúmaj ma, Pane, a skúšaj, <font color='#B71C1C'>*</font><br>" +
                            "ohňom mi prepáľ srdce aj myseľ.<br>" +
                            "Pred očami mám tvoju dobrotu <font color='#B71C1C'>*</font><br>" +
                            "a konám podľa tvojej pravdy.<font color='#B71C1C'> – R.</font><br>" +
                            "Nezatrať moju dušu s hriešnikmi <font color='#B71C1C'>*</font><br>" +
                            "a môj život s ľuďmi krvilačnými.<br>" +
                            "Ich ruky sú poškvrnené zločinmi, <font color='#B71C1C'>*</font><br>" +
                            "ich pravica je plná úplatkov.<font color='#B71C1C'> – R.</font><br>" +
                            "Ale ja kráčam v nevinnosti, <font color='#B71C1C'>*</font><br>" +
                            "vykúp ma a buď mi milostivý.<br>" +
                            "Moja noha stojí na rovnej ceste; <font color='#B71C1C'>*</font><br>" +
                            "v zhromaždeniach chcem velebiť Pána.<font color='#B71C1C'> – R.</font>"},
            {"13", "2", "2", "Ž 5, 5-6. 7. 8",
                    "<font color='#B71C1C'>R.:</font> Pane, veď ma vo svojej spravodlivosti.<br><br>" +
                            "Ty nie si Boh, ktorému by sa páčila neprávosť, <font color='#B71C1C'>†</font><br>" +
                            "zlý človek nepobudne pri tebe, <font color='#B71C1C'>*</font><br>" +
                            "ani nespravodliví neobstoja pred tvojím pohľadom.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty nenávidíš všetkých, čo páchajú neprávosť, <font color='#B71C1C'>†</font><br>" +
                            "ničíš všetkých, čo hovoria klamstvá. <font color='#B71C1C'>*</font><br>" +
                            "Od vraha a podvodníka sa odvracia Pán s odporom.<font color='#B71C1C'> – R.</font><br>" +
                            "No ja len z tvojej veľkej milosti, <font color='#B71C1C'>†</font><br>" +
                            "smiem vstúpiť do tvojho domu <font color='#B71C1C'>*</font><br>" +
                            "a s bázňou padnúť na tvár<br>" +
                            "pred tvojím svätým chrámom.<font color='#B71C1C'> – R.</font>"},
            {"13", "3", "1", "Ž 34, 7-8. 10-11. 12-13",
                    "<font color='#B71C1C'>R.:</font> Úbožiak zavolal a Pán ho vyslyšal.<br><br>" +
                            "Úbožiak zavolal a Pán ho vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ho zo všetkých tiesní.<br>" +
                            "Ako strážca sa utáborí anjel Pánov okolo bohabojných <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodí ich.<font color='#B71C1C'> – R.</font><br>" +
                            "Vy, jeho svätí, bojte sa Pána, <font color='#B71C1C'>*</font><br>" +
                            "veď bohabojní núdzu nemajú.<br>" +
                            "Boháči sa nabiedia a nahladujú, <font color='#B71C1C'>*</font><br>" +
                            "ale tým, čo hľadajú Pána,<br>" +
                            "nijaké dobro chýbať nebude.<font color='#B71C1C'> – R.</font><br>" +
                            "Poďte, deti, čujte ma, <font color='#B71C1C'>*</font><br>" +
                            "naučím vás bázni Pánovej.<br>" +
                            "Miluje niekto život <font color='#B71C1C'>*</font><br>" +
                            "a chce požívať dobro v šťastných dňoch?<font color='#B71C1C'> – R.</font>"},
            {"13", "3", "2", "Ž 50, 7. 8-9. 10-11. 12-13. 16b-17",
                    "<font color='#B71C1C'>R.:</font> Kto kráča bez úhony, tomu ukážem Božiu spásu.<br><br>" +
                            "Počuj, ľud môj, chcem hovoriť; <font color='#B71C1C'>†</font><br>" +
                            "teba, Izrael, idem usvedčiť <font color='#B71C1C'>*</font><br>" +
                            "ja, Boh, čo tvojím Bohom som.<font color='#B71C1C'> – R.</font><br>" +
                            "Neobviňujem ťa pre tvoje obety, <font color='#B71C1C'>*</font><br>" +
                            "veď tvoje žertvy stále sú predo mnou.<br>" +
                            "Viac z tvojho domu býčky neprijmem <font color='#B71C1C'>*</font><br>" +
                            "ani capov z tvojich čried.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo mne patrí všetka lesná zver, <font color='#B71C1C'>*</font><br>" +
                            "tisícky horskej zveriny.<br>" +
                            "Poznám všetko vtáctvo lietavé, <font color='#B71C1C'>*</font><br>" +
                            "moje je i to, čo sa hýbe na poli.<font color='#B71C1C'> – R.</font><br>" +
                            "Aj keď budem hladný, nebudem pýtať od teba; <font color='#B71C1C'>*</font><br>" +
                            "veď moja je zem i s tým, čo ju napĺňa.<br>" +
                            "Vari ja hovädzie mäso jedávam <font color='#B71C1C'>*</font><br>" +
                            "alebo pijem krv kozľaciu?<font color='#B71C1C'> – R.</font><br>" +
                            "Prečo odriekaš moje príkazy <font color='#B71C1C'>*</font><br>" +
                            "a moju zmluvu v ústach omieľaš?<br>" +
                            "Veď ty nenávidíš poriadok <font color='#B71C1C'>*</font><br>" +
                            "a moje slovo odmietaš.<font color='#B71C1C'> – R.</font>"},
            {"13", "4", "1", "Ž 116, 1-2. 3-4. 5-6. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pred tvárou Pána budem kráčať v krajine žijúcich.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Milujem Pána, lebo vypočul <font color='#B71C1C'>*</font><br>" +
                            "môj prosebný hlas,<br>" +
                            "lebo svoj sluch naklonil ku mne, <font color='#B71C1C'>*</font><br>" +
                            "kedykoľvek som ho vzýval.<font color='#B71C1C'> – R.</font><br>" +
                            "Keď ma omotali povrazy smrti <font color='#B71C1C'>*</font><br>" +
                            "a zmocnili sa ma úzkosti podsvetia,<br>" +
                            "keď som sa ocitol v súžení a trápení, <font color='#B71C1C'>†</font><br>" +
                            "vzýval som meno Pánovo: <font color='#B71C1C'>*</font><br>" +
                            "\"Pane, zachráň môj život!\"<font color='#B71C1C'> – R.</font><br>" +
                            "Milostivý a spravodlivý je Pán, <font color='#B71C1C'>*</font><br>" +
                            "náš Boh sa zľutúva.<br>" +
                            "Pán ochraňuje maličkých; <font color='#B71C1C'>*</font><br>" +
                            "pomohol mi, keď som bol v biede.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo môj život zachránil od smrti, <font color='#B71C1C'>†</font><br>" +
                            "moje oči od sĺz <font color='#B71C1C'>*</font><br>" +
                            "a moje nohy pred pádom.<br>" +
                            "Pred tvárou Pána budem kráčať <font color='#B71C1C'>*</font><br>" +
                            "v krajine žijúcich.<font color='#B71C1C'> – R.</font>"},
            {"13", "4", "2", "Ž 19, 8. 9. 10. 11",
                    "<font color='#B71C1C'>R.:</font> Výroky Pánove sú pravdivé a všetky spravodlivé.<br><br>" +
                            "Zákon Pánov je dokonalý, <font color='#B71C1C'>*</font><br>" +
                            "osviežuje dušu.<br>" +
                            "Svedectvo Pánovo je hodnoverné, <font color='#B71C1C'>*</font><br>" +
                            "dáva múdrosť maličkým.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozhodnutia Pánove sú správne, <font color='#B71C1C'>*</font><br>" +
                            "potešujú srdce.<br>" +
                            "Prikázania Pánove sú jasné, <font color='#B71C1C'>*</font><br>" +
                            "osvecujú oči.<font color='#B71C1C'> – R.</font><br>" +
                            "Bázeň pred Pánom je úprimná, <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky.<br>" +
                            "Výroky Pánove sú pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a všetky spravodlivé.<font color='#B71C1C'> – R.</font><br>" +
                            "Vzácnejšie sú než zlato, <font color='#B71C1C'>*</font><br>" +
                            "než veľký drahokam,<br>" +
                            "sladšie sú než med, <font color='#B71C1C'>*</font><br>" +
                            "než medové kvapky z plástu.<font color='#B71C1C'> – R.</font>"},
            {"13", "5", "1", "Ž 106, 1-2. 3-4a. 4b-5",
                    "<font color='#B71C1C'>R.:</font> Oslavujme Pána, lebo je dobrý.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "Kto vyrozpráva mocné skutky Pánove, <font color='#B71C1C'>*</font><br>" +
                            "kto všetku jeho chválu rozhlási?<font color='#B71C1C'> – R.</font><br>" +
                            "Blažení sú tí, čo zachovávajú právo <font color='#B71C1C'>†</font><br>" +
                            "a konajú spravodlivo v každý čas. <font color='#B71C1C'>*</font><br>" +
                            "Pamätaj na nás, Pane, z lásky k svojmu ľudu.<font color='#B71C1C'> – R.</font><br>" +
                            "Navštív nás svojou spásou, <font color='#B71C1C'>*</font><br>" +
                            "aby sme videli šťastie tvojich vyvolených,<br>" +
                            "aby sme sa radovali z radosti tvojho ľudu <font color='#B71C1C'>*</font><br>" +
                            "a boli hrdí na teba so všetkými tvojimi dedičmi.<font color='#B71C1C'> – R.</font>"},
            {"13", "5", "2", "Ž 119, 2. 10. 20. 30. 40. 131",
                    "<font color='#B71C1C'>R.:</font> Nielen z chleba žije človek, ale z každého slova, ktoré vychádza z Božích úst.<br><br>" +
                            "Blažení tí, čo zachovávajú jeho príkazy <font color='#B71C1C'>*</font><br>" +
                            "a celým srdcom ho vyhľadávajú.<font color='#B71C1C'> – R.</font><br>" +
                            "Celým svojím srdcom ťa vyhľadávam; <font color='#B71C1C'>*</font><br>" +
                            "nedaj, aby som zablúdil od tvojich príkazov.<font color='#B71C1C'> – R.</font><br>" +
                            "Túžbou za tvojimi výrokmi sa mi duša umára, <font color='#B71C1C'>*</font><br>" +
                            "umára jednostaj.<font color='#B71C1C'> – R.</font><br>" +
                            "Cestu pravdy som si vyvolil, <font color='#B71C1C'>*</font><br>" +
                            "tvoje slová mám stále pred sebou.<font color='#B71C1C'> – R.</font><br>" +
                            "Hľa, túžim za tvojimi príkazmi; <font color='#B71C1C'>*</font><br>" +
                            "nuž oživ ma v svojej spravodlivosti.<font color='#B71C1C'> – R.</font><br>" +
                            "Otváram ústa a dych naberám, <font color='#B71C1C'>*</font><br>" +
                            "lebo túžim za tvojimi predpismi.<font color='#B71C1C'> – R.</font>"},
            {"13", "6", "1", "Ž 135, 1-2. 3-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Chváľte Pána, lebo Pán je dobrý.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľte meno Pánovo, <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho, služobníci Pánovi,<br>" +
                            "ktorí ste v dome Pánovom <font color='#B71C1C'>*</font><br>" +
                            "a na nádvoriach domu nášho Boha.<font color='#B71C1C'> – R.</font><br>" +
                            "Chváľte pána, lebo Pán je dobrý; <font color='#B71C1C'>*</font><br>" +
                            "ospevujte jeho meno, lebo je ľúbezné;<br>" +
                            "veď si Pán vyvolil Jakuba, <font color='#B71C1C'>*</font><br>" +
                            "Izraela za svoje vlastníctvo.<font color='#B71C1C'> – R.</font><br>" +
                            "Ja viem, že Pán je veľký, <font color='#B71C1C'>*</font><br>" +
                            "že náš Boh je nad všetkými bohmi.<br>" +
                            "Čokoľvek Pán chce, <font color='#B71C1C'>†</font><br>" +
                            "urobí na nebi i na zemi, <font color='#B71C1C'>*</font><br>" +
                            "v mori a vo všetkých priepastiach.<font color='#B71C1C'> – R.</font>"},
            {"13", "6", "2", "Ž 85, 9. 11-12. 13-14",
                    "<font color='#B71C1C'>R.:</font> Pán, Boh, ohlási pokoj svojmu ľudu a svojim svätým.<br><br>" +
                            "Budem počúvať, čo povie Pán, Boh; <font color='#B71C1C'>†</font><br>" +
                            "on ohlási pokoj svojmu ľudu a svojim svätým <font color='#B71C1C'>*</font><br>" +
                            "a tým, čo sa k nemu obracajú úprimne.<font color='#B71C1C'> – R.</font><br>" +
                            "Milosrdenstvo a vernosť sa stretnú navzájom, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a pokoj sa pobozkajú.<br>" +
                            "Vernosť vyrastie zo zeme, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť zhliadne z neba.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď Pán dá požehnanie <font color='#B71C1C'>*</font><br>" +
                            "a svoje plody vydá naša zem.<br>" +
                            "Pred ním bude kráčať spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a po stopách jeho krokov spása.<font color='#B71C1C'> – R.</font>"},
            {"14", "A", "", "Ž 145, 1-2. 8-9. 10-11. 13c-14",
                    "<font color='#B71C1C'>R.:</font> Budem ťa velebiť, Pane, pokorný Kráľ slávy.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavovať ťa chcem, Bože, môj kráľ, <font color='#B71C1C'>*</font><br>" +
                            "a tvoje meno velebiť navždy a naveky.<br>" +
                            "Budem ťa velebiť každý deň <font color='#B71C1C'>*</font><br>" +
                            "a tvoje meno chváliť navždy a naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a veľmi láskavý.<br>" +
                            "Dobrý je Pán ku každému <font color='#B71C1C'>*</font><br>" +
                            "a milostivý ku všetkým svojim stvoreniam.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech ťa oslavujú, Pane, všetky tvoje diela <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech ťa velebia.<br>" +
                            "Nech rozprávajú o sláve tvojho kráľovstva <font color='#B71C1C'>*</font><br>" +
                            "a o tvojej moci nech hovoria;<font color='#B71C1C'> – R.</font><br>" +
                            "Pán je vo všetkých svojich slovách pravdivý <font color='#B71C1C'>*</font><br>" +
                            "a svätý vo všetkých svojich skutkoch.<br>" +
                            "Pán podopiera všetkých, čo klesajú, <font color='#B71C1C'>*</font><br>" +
                            "a dvíha všetkých skľúčených.<font color='#B71C1C'> – R.</font>"},
            {"14", "B", "", "Ž 123, 1-2a. 2b-d. 3-4",
                    "<font color='#B71C1C'>R.:</font> Naše oči hľadia na Pána, kým sa nezmiluje nad nami.<br><br>" +
                            "Oči dvíham k tebe, <font color='#B71C1C'>*</font><br>" +
                            "čo na nebesiach prebývaš.<br>" +
                            "Ako oči sluhov hľadia <font color='#B71C1C'>*</font><br>" +
                            "na ruky svojich pánov,<font color='#B71C1C'> – R.</font><br>" +
                            "ako oči služobníc hľadia <font color='#B71C1C'>*</font><br>" +
                            "na ruky svojej panej,<br>" +
                            "tak hľadia naše oči na Pána, nášho Boha, <font color='#B71C1C'>*</font><br>" +
                            "kým sa nezmiluje nad nami.<font color='#B71C1C'> – R.</font><br>" +
                            "Zmiluj sa, Pane, nad nami, zmiluj sa nad nami, <font color='#B71C1C'>*</font><br>" +
                            "lebo už máme dosť pohŕdania;<br>" +
                            "lebo naša duša má už dosť výsmechu boháčov <font color='#B71C1C'>*</font><br>" +
                            "a pohŕdania pyšných.<font color='#B71C1C'> – R.</font>"},
            {"14", "C", "", "Ž 66, 1-3a. 4-5. 6-7a. 16+20",
                    "<font color='#B71C1C'>R.:</font> Jasaj Bohu, celá zem.<br><br>" +
                            "Jasaj Bohu, celá zem; <font color='#B71C1C'>*</font><br>" +
                            "hrajte a spievajte na slávu jeho mena,<br>" +
                            "vzdávajte mu chválu. <font color='#B71C1C'>*</font><br>" +
                            "Hovorte Bohu: \"Aké úžasné sú tvoje diela.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa ti klania celá zem a nech ti spieva, <font color='#B71C1C'>*</font><br>" +
                            "nech ospevuje tvoje meno.\"<br>" +
                            "Poďte a pozrite na Božie diela; <font color='#B71C1C'>*</font><br>" +
                            "úžas budia skutky, ktoré koná ľuďom.<font color='#B71C1C'> – R.</font><br>" +
                            "More premieňa na suchú zem, <font color='#B71C1C'>*</font><br>" +
                            "rieku možno prejsť suchou nohou;<br>" +
                            "preto sa tešíme z neho. <font color='#B71C1C'>*</font><br>" +
                            "Svojou mocou panuje naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Poďte sem a počúvajte, všetci ctitelia Boží, <font color='#B71C1C'>*</font><br>" +
                            "vyrozprávam vám, aké veľké veci mi urobil.<br>" +
                            "Nech je zvelebený Boh, lebo neodmietol moju modlitbu <font color='#B71C1C'>*</font><br>" +
                            "a neodňal mi svoje milosrdenstvo.<font color='#B71C1C'> – R.</font>"},
            {"14", "1", "1", "Ž 91, 1-2. 3-4b. 14-15b",
                    "<font color='#B71C1C'>R.:</font> V tebe mám dôveru, Pane, Bože môj.<br><br>" +
                            "Kto pod ochranou Najvyššieho prebýva <font color='#B71C1C'>*</font><br>" +
                            "a v tôni Všemohúceho sa zdržiava,<br>" +
                            "povie Pánovi: \"Ty si moje útočište a pevnosť moja; <font color='#B71C1C'>*</font><br>" +
                            "v tebe mám dôveru, Bože môj.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Veď on sám ťa vyslobodí z osídel lovcov <font color='#B71C1C'>*</font><br>" +
                            "a zo zhubného moru.<br>" +
                            "Svojimi krídlami ťa zacloní <font color='#B71C1C'>*</font><br>" +
                            "a uchýliš sa pod jeho perute.<font color='#B71C1C'> – R.</font><br>" +
                            "Pretože sa ku mne pritúlil, vyslobodím ho, <font color='#B71C1C'>*</font><br>" +
                            "ujmem sa ho, lebo pozná moje meno.<br>" +
                            "Keď ku mne zavolá, ja ho vyslyším <font color='#B71C1C'>*</font><br>" +
                            "a budem pri ňom v súžení.<font color='#B71C1C'> – R.</font>"},
            {"14", "1", "2", "Ž 145, 2-3. 4-5. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Budem ťa velebiť každý deň <font color='#B71C1C'>*</font><br>" +
                            "a tvoje meno chváliť navždy a naveky.<br>" +
                            "Veľký si, Pane, a veľkej chvály hoden, <font color='#B71C1C'>*</font><br>" +
                            "tvoju veľkosť nemožno preskúmať.<font color='#B71C1C'> – R.</font><br>" +
                            "Z pokolenia na pokolenie ide chvála tvojich skutkov <font color='#B71C1C'>*</font><br>" +
                            "a všetky pokolenia ohlasujú tvoju moc.<br>" +
                            "Hovoria o vznešenosti tvojej slávy a veleby <font color='#B71C1C'>*</font><br>" +
                            "a rozprávajú o tvojich zázrakoch.<font color='#B71C1C'> – R.</font><br>" +
                            "Hovoria aj o sile tvojich skutkov úžasných <font color='#B71C1C'>*</font><br>" +
                            "a rozprávajú o tvojej veľkosti.<br>" +
                            "Rozhlasujú chválu tvojej veľkej láskavosti <font color='#B71C1C'>*</font><br>" +
                            "a plesajú nad tvojou spravodlivosťou.<font color='#B71C1C'> – R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a veľmi láskavý.<br>" +
                            "Dobrý je Pán ku každému <font color='#B71C1C'>*</font><br>" +
                            "a milostivý ku všetkým svojim stvoreniam.<font color='#B71C1C'> – R.</font>"},
            {"14", "2", "1", "Ž 17, 1. 2-3. 6-7. 8+15",
                    "<font color='#B71C1C'>R.:</font> Ja v spravodlivosti uzriem tvoju tvár, Pane.<br><br>" +
                            "Vypočuj, Pane, moju spravodlivú žiadosť, <font color='#B71C1C'>*</font><br>" +
                            "všimni si moju prosbu pokornú.<br>" +
                            "Nakloň sluch k mojej modlitbe, <font color='#B71C1C'>*</font><br>" +
                            "čo plynie z perí úprimných.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech z tvojej tváre vyjde rozsudok o mne; <font color='#B71C1C'>*</font><br>" +
                            "tvoje oči vidia, čo je správne.<br>" +
                            "Skúmaj moje srdce i v noci ma navštív, <font color='#B71C1C'>*</font><br>" +
                            "skúšaj ma ohňom a nenájdeš vo mne neprávosť.<font color='#B71C1C'> – R.</font><br>" +
                            "K tebe, Bože, volám, lebo ty ma vyslyšíš. <font color='#B71C1C'>*</font><br>" +
                            "Nakloň ku mne sluch a vypočuj moje slová.<br>" +
                            "Ukáž svoje predivné milosrdenstvo, <font color='#B71C1C'>*</font><br>" +
                            "ty, čo pred protivníkmi pravicou zachraňuješ<br>" +
                            "dôverujúcich v teba.<font color='#B71C1C'> – R.</font><br>" +
                            "Chráň ma ako zrenicu oka, <font color='#B71C1C'>*</font><br>" +
                            "skry ma v tôni svojich perutí.<br>" +
                            "Ja však v spravodlivosti uzriem tvoju tvár <font color='#B71C1C'>*</font><br>" +
                            "a až raz vstanem zo sna, nasýtim sa pohľadom na teba.<font color='#B71C1C'> – R.</font>"},
            {"14", "2", "2", "Ž 115, 3-4. 5-6. 7ab+8. 9-10",
                    "<font color='#B71C1C'>R.:</font> My dúfame v teba, Pane, Bože náš.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Veď náš Boh je v nebi <font color='#B71C1C'>*</font><br>" +
                            "a stvoril všetko, čo chcel.<br>" +
                            "Pohanské modly, hoc sú zo striebra a zo zlata, <font color='#B71C1C'>*</font><br>" +
                            "sú dielom ľudských rúk.<font color='#B71C1C'> – R.</font><br>" +
                            "Majú ústa, ale nehovoria, <font color='#B71C1C'>*</font><br>" +
                            "majú oči, a nevidia.<br>" +
                            "Majú uši, ale nepočujú, <font color='#B71C1C'>*</font><br>" +
                            "majú nozdry, a nečuchajú.<font color='#B71C1C'> – R.</font><br>" +
                            "Majú ruky, ale nehmatajú, <font color='#B71C1C'>*</font><br>" +
                            "majú nohy, a nechodia.<br>" +
                            "Im budú podobní ich tvorcovia <font color='#B71C1C'>*</font><br>" +
                            "a všetci, čo v ne veria.<font color='#B71C1C'> – R.</font><br>" +
                            "Dom Izraelov dúfa v Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je ich pomoc a záštita.<br>" +
                            "Dom Áronov dúfa v Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je ich pomoc a záštita.<font color='#B71C1C'> – R.</font>"},
            {"14", "3", "1", "Ž 33, 2-3. 10-11. 18-19",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, nech je nad nami, ako dúfame v teba.<br><br>" +
                            "Oslavujte Pána citarou, <font color='#B71C1C'>*</font><br>" +
                            "hrajte mu na desaťstrunovej lutne.<br>" +
                            "Spievajte mu novú pieseň, <font color='#B71C1C'>*</font><br>" +
                            "nadšene mu hrajte a volajte na slávu.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán marí úmysly pohanov, <font color='#B71C1C'>*</font><br>" +
                            "navnivoč privádza myšlienky národov.<br>" +
                            "Ale Pánov úmysel trvá naveky, <font color='#B71C1C'>*</font><br>" +
                            "myšlienky jeho srdca z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font><br>" +
                            "Hľa, oko Pánovo bdie nad tými, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "nad tými, čo v jeho milosrdenstvo dúfajú,<br>" +
                            "aby ich zachránil pred smrťou <font color='#B71C1C'>*</font><br>" +
                            "a v čase hladu nakŕmil.<font color='#B71C1C'> – R.</font>"},
            {"14", "3", "2", "Ž 105, 2-3. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Hľadajte Pána, hľadajte jeho tvár.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Spievajte mu a hrajte, <font color='#B71C1C'>*</font><br>" +
                            "rozprávajte o jeho obdivuhodných skutkoch.<br>" +
                            "Jeho svätým menom sa honoste; <font color='#B71C1C'>*</font><br>" +
                            "nech sa radujú srdcia tých, čo hľadajú Pána.<font color='#B71C1C'> – R.</font><br>" +
                            "Hľadajte Pána a jeho moc, <font color='#B71C1C'>*</font><br>" +
                            "hľadajte vždy jeho tvár.<br>" +
                            "Pamätajte na divy, čo učinil, <font color='#B71C1C'>*</font><br>" +
                            "na jeho znamenia a na výroky jeho úst,<font color='#B71C1C'> – R.</font><br>" +
                            "vy, potomci Abraháma, Pánovho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "synovia Jakuba, vyvoleného Pánovho.<br>" +
                            "On, Pán, je náš Boh; <font color='#B71C1C'>*</font><br>" +
                            "jeho rozhodnutia platia po celej zemi.<font color='#B71C1C'> – R.</font>"},
            {"14", "4", "1", "Ž 105, 16-17. 18-19. 20-21",
                    "<font color='#B71C1C'>R.:</font> Pamätáme, Pane, na divy, čo si učinil.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Hlad privolal na krajinu <font color='#B71C1C'>*</font><br>" +
                            "a poničil všetku zásobu chleba.<br>" +
                            "Pred nimi poslal muža, <font color='#B71C1C'>*</font><br>" +
                            "Jozefa, ktorého predali za otroka.<font color='#B71C1C'> – R.</font><br>" +
                            "Putami jeho nohy zovreli <font color='#B71C1C'>*</font><br>" +
                            "a jeho šiju železom;<br>" +
                            "no potom došlo na jeho slová, <font color='#B71C1C'>*</font><br>" +
                            "Pán dokázal jeho nevinnosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyslobodil ho posol kráľovský, <font color='#B71C1C'>*</font><br>" +
                            "prepustil ho vládca národov;<br>" +
                            "ustanovil ho za Pána svojho domu <font color='#B71C1C'>*</font><br>" +
                            "a za správcu všetkého svojho majetku.<font color='#B71C1C'> – R.</font>"},
            {"14", "4", "2", "Ž 80, 2ac+3bc. 15-16",
                    "<font color='#B71C1C'>R.:</font> Bože, obnov nás, rozjasni svoju tvár a budeme spasení.<br><br>" +
                            "Pastier Izraela, počúvaj! <font color='#B71C1C'>*</font><br>" +
                            "Ty, čo tróniš nad cherubmi, zaskvej sa!<br>" +
                            "Vzbuď svoju moc <font color='#B71C1C'>*</font><br>" +
                            "a príď nás zachrániť.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože zástupov, vráť sa, <font color='#B71C1C'>*</font><br>" +
                            "zhliadni z neba, podívaj sa a navštív túto vinicu.<br>" +
                            "A chráň ju, veď ju vysadila tvoja pravica, <font color='#B71C1C'>*</font><br>" +
                            "chráň i výhonok, ktorý si si vypestoval.<font color='#B71C1C'> – R.</font>"},
            {"14", "5", "1", "Ž 37, 3-4. 18-19. 27-28. 39-40",
                    "<font color='#B71C1C'>R.:</font> Spása spravodlivých prichádza od Pána.<br><br>" +
                            "Spoľahni sa na Pána a dobre rob <font color='#B71C1C'>*</font><br>" +
                            "a budeš bývať v svojej krajine a tešiť sa z bezpečia.<br>" +
                            "Hľadaj radosť v Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a dá ti, za čím túži tvoje srdce.<font color='#B71C1C'> – R.</font><br>" +
                            "O život bezúhonných sa stará Pán <font color='#B71C1C'>*</font><br>" +
                            "a ich dedičstvo trvá naveky.<br>" +
                            "V nešťastí zahanbení nebudú <font color='#B71C1C'>*</font><br>" +
                            "a v čase hladu budú nasýtení.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyhýbaj zlu a dobre rob <font color='#B71C1C'>*</font><br>" +
                            "a budeš mať domov naveky.<br>" +
                            "Lebo Pán miluje spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a neopúšťa svojich svätých.<br>" +
                            "Nespravodlivci navždy vyhynú <font color='#B71C1C'>*</font><br>" +
                            "a pokolenie bezbožných bude zničené.<font color='#B71C1C'> – R.</font><br>" +
                            "Spása spravodlivých prichádza od Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je ich ochrancom v čase súženia.<br>" +
                            "Pán im pomôže a oslobodí ich, <font color='#B71C1C'>†</font><br>" +
                            "vytrhne ich z rúk hriešnikov a zachráni ich, <font color='#B71C1C'>*</font><br>" +
                            "lebo sa spoliehajú na neho.<font color='#B71C1C'> – R.</font>"},
            {"14", "5", "2", "Ž 51, 3-4. 8-9. 12-13. 14+17",
                    "<font color='#B71C1C'>R.:</font> Moje ústa, Pane, budú ohlasovať tvoju slávu.<br><br>" +
                            "Zmiluj sa, Bože, nado mnou pre svoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje veľké zľutovanie znič moju neprávosť.<br>" +
                            "Úplne zmy zo mňa moju vinu <font color='#B71C1C'>*</font><br>" +
                            "a očisť ma od hriechu.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty naozaj máš záľubu v srdci úprimnom <font color='#B71C1C'>*</font><br>" +
                            "a v samote mi múdrosť zjavuješ.<br>" +
                            "Pokrop ma yzopom a zasa budem čistý; <font color='#B71C1C'>*</font><br>" +
                            "umy ma a budem belší ako sneh.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože, stvor vo mne srdce čisté <font color='#B71C1C'>*</font><br>" +
                            "a v mojom vnútri obnov ducha pevného.<br>" +
                            "Neodvrhuj ma spred svojej tváre <font color='#B71C1C'>*</font><br>" +
                            "a neodnímaj mi svojho ducha svätého.<font color='#B71C1C'> – R.</font><br>" +
                            "Navráť mi radosť z tvojej spásy <font color='#B71C1C'>*</font><br>" +
                            "a posilni ma duchom veľkej ochoty.<br>" +
                            "Pane, otvor moje pery <font color='#B71C1C'>*</font><br>" +
                            "a moje ústa budú ohlasovať tvoju slávu.<font color='#B71C1C'> – R.</font>"},
            {"14", "6", "1", "Ž 105, 1-2. 3-4. 6-7",
                    "<font color='#B71C1C'>R.:</font> Hľadajte, pokorní, Pána a srdce vám oživne.<br><br>" +
                            "Oslavujte Pána a vzývajte jeho meno, <font color='#B71C1C'>*</font><br>" +
                            "rozhlasujte jeho skutky medzi národmi.<br>" +
                            "Spievajte mu a hrajte, <font color='#B71C1C'>*</font><br>" +
                            "rozprávajte o jeho obdivuhodných skutkoch.<font color='#B71C1C'> – R.</font><br>" +
                            "Jeho svätým menom sa honoste; <font color='#B71C1C'>*</font><br>" +
                            "nech sa radujú srdcia tých, čo hľadajú Pána.<br>" +
                            "Hľadajte Pána a jeho moc, <font color='#B71C1C'>*</font><br>" +
                            "hľadajte vždy jeho tvár,<font color='#B71C1C'> – R.</font><br>" +
                            "vy, potomci Abraháma, Pánovho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "synovia Jakuba, vyvoleného Pánovho.<br>" +
                            "On, Pán, je náš Boh; <font color='#B71C1C'>*</font><br>" +
                            "jeho rozhodnutia platia po celej zemi.<font color='#B71C1C'> – R.</font>"},
            {"14", "6", "2", "Ž 93, 1ab. 1c-2. 5",
                    "<font color='#B71C1C'>R.:</font> Pán kraľuje, velebou sa zaodel.<br><br>" +
                            "Pán kraľuje, velebou sa zaodel; <font color='#B71C1C'>*</font><br>" +
                            "zaodel sa Pán, udatnosťou sa prepásal.<font color='#B71C1C'> – R.</font><br>" +
                            "Tak upevnil zemekruh, že sa nezachveje. <font color='#B71C1C'>*</font><br>" +
                            "Pevný je tvoj trón oddávna, ty si od vekov.<font color='#B71C1C'> – R.</font><br>" +
                            "Veľmi vierohodné sú tvoje svedectvá; <font color='#B71C1C'>*</font><br>" +
                            "tvojmu domu, Pane,<br>" +
                            "patrí posvätná úcta po všetky časy.<font color='#B71C1C'> – R.</font>"},
            {"15", "A", "", "Ž 65, 10a-d. 10e-11. 12-13. 14",
                    "<font color='#B71C1C'>R.:</font> Pane, navštív našu zem a požehnaj jej rastliny.<br><br>" +
                            "Navštevuješ zem a dávaš jej vlahu, <font color='#B71C1C'>*</font><br>" +
                            "zveľaďuješ jej bohatstvo.<br>" +
                            "Božia rieka je plná vody; <font color='#B71C1C'>*</font><br>" +
                            "ľuďom pripravuješ zrno.<font color='#B71C1C'> – R.</font><br>" +
                            "Takto sa staráš o zem: <font color='#B71C1C'>†</font><br>" +
                            "zvlažuješ jej brázdy a vyrovnávaš hrudy, <font color='#B71C1C'>*</font><br>" +
                            "skrypruješ ju dažďami a požehnávaš jej rastliny.<font color='#B71C1C'> – R.</font><br>" +
                            "Rok korunuješ svojou dobrotou, <font color='#B71C1C'>*</font><br>" +
                            "kade prejdeš, všade je hojnosť.<br>" +
                            "Pašienky púšte vlaha zarosí <font color='#B71C1C'>*</font><br>" +
                            "a pahorky sa opášu plesaním.<font color='#B71C1C'> – R.</font><br>" +
                            "Čriedami oviec sa lúky pokryjú <font color='#B71C1C'>†</font><br>" +
                            "a zrnom budú oplývať doliny; <font color='#B71C1C'>*</font><br>" +
                            "ozývať sa budú jasotom a spevom.<font color='#B71C1C'> – R.</font>"},
            {"15", "B", "", "Ž 85, 9ab+10. 11-12. 13-14",
                    "<font color='#B71C1C'>R.:</font> Ukáž nám, Pane, svoje milosrdenstvo a daj nám svoju spásu.<br><br>" +
                            "Budem počúvať, čo povie Pán, Boh; <font color='#B71C1C'>*</font><br>" +
                            "on ohlási pokoj svojmu ľudu a svojim svätým.<br>" +
                            "Naozaj: blízko je spása tým, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "a jeho sláva bude prebývať v našej krajine.<font color='#B71C1C'> – R.</font><br>" +
                            "Milosrdenstvo a vernosť sa stretnú navzájom, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a pokoj sa pobozkajú.<br>" +
                            "Vernosť vyrastie zo zeme, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť zhliadne z neba.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď Pán dá požehnanie <font color='#B71C1C'>*</font><br>" +
                            "a svoje plody vydá naša zem.<br>" +
                            "Pred ním bude kráčať spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a po stopách jeho krokov spása.<font color='#B71C1C'> – R.</font>"},
            {"15", "C", "", "Ž 69, 14+17. 30-31. 33-34. 36ab+37",
                    "<font color='#B71C1C'>R.:</font> Hľadajte, pokorní, Pána a srdce vám oživne.<br><br>" +
                            "Pane, obraciam sa modlitbou k tebe <font color='#B71C1C'>*</font><br>" +
                            "v tomto čase milosti.<br>" +
                            "Vypočuj ma, Bože, pre svoju veľkú dobrotu, <font color='#B71C1C'>*</font><br>" +
                            "pre svoju vernosť mi pomôž.<br>" +
                            "Vyslyš ma, Pane, veď si dobrotivý a láskavý; <font color='#B71C1C'>*</font><br>" +
                            "pre svoje veľké milosrdenstvo pohliadni na mňa.<font color='#B71C1C'> – R.</font><br>" +
                            "Som úbožiak, plný bolesti; <font color='#B71C1C'>*</font><br>" +
                            "tvoja pomoc, Bože, ma pozdvihne.<br>" +
                            "Piesňou chcem Božie meno osláviť <font color='#B71C1C'>*</font><br>" +
                            "a velebiť ho chválospevmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech zvedia o tom ponížení a nech sa potešia; <font color='#B71C1C'>*</font><br>" +
                            "hľadajte Boha a srdce vám oživne.<br>" +
                            "Lebo Pán vypočuje chudobných <font color='#B71C1C'>*</font><br>" +
                            "a nepohŕda svojimi, keď sú v zajatí.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Boh zachráni Sion <font color='#B71C1C'>*</font><br>" +
                            "a vybuduje mestá Júdove.<br>" +
                            "A zdedia ho potomci jeho služobníkov <font color='#B71C1C'>*</font><br>" +
                            "a tí, čo milujú jeho meno, budú v ňom prebývať.<font color='#B71C1C'> – R.</font>",
                            "Alebo:",
                    "Ž 19, 8. 9. 10. 11",
                            "<font color='#B71C1C'>R.:</font> Rozhodnutia Pánove sú správne, potešujú srdce.<br><br>" +
                            "Zákon Pánov je dokonalý, <font color='#B71C1C'>*</font><br>" +
                            "osviežuje dušu.<br>" +
                            "Svedectvo Pánovo je hodnoverné, <font color='#B71C1C'>*</font><br>" +
                            "dáva múdrosť maličkým.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozhodnutia Pánove sú správne, <font color='#B71C1C'>*</font><br>" +
                            "potešujú srdce.<br>" +
                            "Prikázania Pánove sú jasné, <font color='#B71C1C'>*</font><br>" +
                            "osvecujú oči.<font color='#B71C1C'> – R.</font><br>" +
                            "Bázeň pred Pánom je úprimná, <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky.<br>" +
                            "Výroky Pánove sú pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a všetky spravodlivé.<font color='#B71C1C'> – R.</font><br>" +
                            "Vzácnejšie sú než zlato, <font color='#B71C1C'>*</font><br>" +
                            "než veľký drahokam,<br>" +
                            "sladšie sú než med, <font color='#B71C1C'>*</font><br>" +
                            "než medové kvapky z plástu.<font color='#B71C1C'> – R.</font>"},
            {"15", "1", "1", "Ž 124, 1-3. 4-6. 7-8",
                    "<font color='#B71C1C'>R.:</font> Naša pomoc v mene Pánovom, ktorý stvoril nebo i zem.<br><br>" +
                            "Keby sa nás Pán nebol ujal, <font color='#B71C1C'>*</font><br>" +
                            "nech to povie Izrael,<br>" +
                            "keby sa nás Pán nebol ujal, <font color='#B71C1C'>*</font><br>" +
                            "keď ľudia povstali proti nám,<br>" +
                            "vari by nás živých boli prehltli, <font color='#B71C1C'>*</font><br>" +
                            "keď proti nám blčala ich zúrivosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Vari by nás bola voda zaliala <font color='#B71C1C'>*</font><br>" +
                            "a riava sa prevalila cez nás.<br>" +
                            "Vari by sa boli prevalili cez nás <font color='#B71C1C'>*</font><br>" +
                            "rozbúrené vody.<br>" +
                            "Nech je velebený Pán, <font color='#B71C1C'>*</font><br>" +
                            "že nás nevydal ich zubom za korisť.<font color='#B71C1C'> – R.</font><br>" +
                            "Naša duša unikla ako vtáča <font color='#B71C1C'>*</font><br>" +
                            "zo siete poľovníkov.<br>" +
                            "Slučka sa roztrhla <font color='#B71C1C'>*</font><br>" +
                            "a my sme na slobode.<br>" +
                            "Naša pomoc v mene Pánovom, <font color='#B71C1C'>*</font><br>" +
                            "ktorý stvoril nebo i zem.<font color='#B71C1C'> – R.</font>"},
            {"15", "1", "2", "Ž 50, 8-9. 16b-17. 21+23",
                    "<font color='#B71C1C'>R.:</font> Ukáž nám, Pane, cestu spásy.<br><br>" +
                            "Neobviňujem ťa pre tvoje obety, <font color='#B71C1C'>*</font><br>" +
                            "veď tvoje žertvy stále sú predo mnou.<br>" +
                            "Viac z tvojho domu býčky neprijmem <font color='#B71C1C'>*</font><br>" +
                            "ani capov z tvojich čried.<font color='#B71C1C'> – R.</font><br>" +
                            "Prečo odriekaš moje príkazy <font color='#B71C1C'>*</font><br>" +
                            "a moju zmluvu v ústach omieľaš?<br>" +
                            "Veď ty nenávidíš poriadok <font color='#B71C1C'>*</font><br>" +
                            "a moje slovo odmietaš.<font color='#B71C1C'> – R.</font><br>" +
                            "Toto páchaš, a ja by som mal mlčať? <font color='#B71C1C'>†</font><br>" +
                            "Myslíš si, že ja som ako ty: <font color='#B71C1C'>*</font><br>" +
                            "teraz ťa obviňujem a hovorím ti to do očí.<br>" +
                            "Kto prináša obetu chvály, ten ma ctí; <font color='#B71C1C'>*</font><br>" +
                            "a kto kráča bez úhony, tomu ukážem Božiu spásu.<font color='#B71C1C'> – R.</font>"},
            {"15", "2", "1", "Ž 69, 3. 14. 30-31. 33-34",
                    "<font color='#B71C1C'>R.:</font> Hľadajte, pokorní, Pána a srdce vám oživne.<br><br>" +
                            "V bezodnom bahne viaznem<br>" +
                            "a nemám pevnej pôdy pod nohami, <font color='#B71C1C'>*</font><br>" +
                            "dostal som sa do hlbín vôd a zalieva ma príval.<font color='#B71C1C'> – R.</font><br>" +
                            "Ale ja, Pane, obraciam sa modlitbou k tebe <font color='#B71C1C'>*</font><br>" +
                            "v tomto čase milosti.<br>" +
                            "Vypočuj ma, Bože, pre svoju veľkú dobrotu, <font color='#B71C1C'>*</font><br>" +
                            "pre svoju vernosť mi pomôž.<font color='#B71C1C'> – R.</font><br>" +
                            "Som úbožiak, plný bolesti; <font color='#B71C1C'>*</font><br>" +
                            "tvoja pomoc, Bože, ma pozdvihne.<br>" +
                            "Piesňou chcem Božie meno osláviť <font color='#B71C1C'>*</font><br>" +
                            "a velebiť ho chválospevmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech zvedia o tom ponížení a nech sa potešia; <font color='#B71C1C'>*</font><br>" +
                            "hľadajte Boha a srdce vám oživne.<br>" +
                            "Lebo Pán vypočuje chudobných <font color='#B71C1C'>*</font><br>" +
                            "a nepohŕda svojimi, keď sú v zajatí.<font color='#B71C1C'> – R.</font>"},
            {"15", "2", "2", "Ž 48, 2-3a. 3b-4. 5-6. 7-8",
                    "<font color='#B71C1C'>R.:</font> Boh založil svoje mesto naveky.<br><br>" +
                            "Veľký je Pán a hoden každej chvály <font color='#B71C1C'>*</font><br>" +
                            "v meste nášho Boha.<br>" +
                            "Jeho svätý vrch, prekrásne návršie, <font color='#B71C1C'>*</font><br>" +
                            "je celej zemi na radosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Vrch Sion, tajomný príbytok, <font color='#B71C1C'>*</font><br>" +
                            "je mestom veľkého kráľa.<br>" +
                            "Boh sa preslávil v jeho palácoch <font color='#B71C1C'>*</font><br>" +
                            "ako istá ochrana.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo hľa, králi sa spolčili <font color='#B71C1C'>*</font><br>" +
                            "a utvorili jeden šík.<br>" +
                            "No sotva sa pozreli, stŕpli úžasom, <font color='#B71C1C'>*</font><br>" +
                            "zmiatli sa a dali sa na útek;<font color='#B71C1C'> – R.</font><br>" +
                            "hrôza ich tam schvátila, <font color='#B71C1C'>*</font><br>" +
                            "bolesti ako rodičku,<br>" +
                            "ako keď východný víchor <font color='#B71C1C'>*</font><br>" +
                            "rozbíja lode taršišské.<font color='#B71C1C'> – R.</font>"},
            {"15", "3", "1", "Ž 103, 1-2. 3-4. 6-7",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď on ti odpúšťa všetky neprávosti, <font color='#B71C1C'>*</font><br>" +
                            "on lieči všetky tvoje neduhy;<br>" +
                            "on vykupuje tvoj život zo záhuby, <font color='#B71C1C'>*</font><br>" +
                            "on ťa venčí milosrdenstvom a milosťou.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán koná spravodlivo <font color='#B71C1C'>*</font><br>" +
                            "a prisudzuje právo všetkým utláčaným.<br>" +
                            "Mojžišovi zjavil svoje cesty <font color='#B71C1C'>*</font><br>" +
                            "a synom Izraela svoje skutky.<font color='#B71C1C'> – R.</font>"},
            {"15", "3", "2", "Ž 94, 5-6. 7-8. 9-10. 14-15",
                    "<font color='#B71C1C'>R.:</font> Pán neodvrhne a neopustí svoj ľud.<br><br>" +
                            "Pane, šliapu po tvojom ľude <font color='#B71C1C'>*</font><br>" +
                            "a tvoje dedičstvo týrajú.<br>" +
                            "Vraždia vdovy a cudzincov <font color='#B71C1C'>*</font><br>" +
                            "a zabíjajú siroty.<font color='#B71C1C'> – R.</font><br>" +
                            "A hovoria si: \"Pán to nevidí, <font color='#B71C1C'>*</font><br>" +
                            "nevie o tom Boh Jakubov.\"<br>" +
                            "Pochopte to, vy, nerozumní v národe; <font color='#B71C1C'>*</font><br>" +
                            "kedy to porozumiete, hlupáci?<font color='#B71C1C'> – R.</font><br>" +
                            "Že by ten, čo vsadil ucho, nepočul, <font color='#B71C1C'>*</font><br>" +
                            "alebo ten, čo oko stvoril, že by nevidel?<br>" +
                            "Že by netrestal ten, čo vychováva národy, <font color='#B71C1C'>*</font><br>" +
                            "čo učí ľud múdrosti?<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán neodvrhne svoj ľud <font color='#B71C1C'>*</font><br>" +
                            "a neopustí svoje dedičstvo.<br>" +
                            "Súd sa zasa navráti k spravodlivosti <font color='#B71C1C'>*</font><br>" +
                            "a spravodlivosťou sa budú riadiť všetci statoční.<font color='#B71C1C'> – R.</font>"},
            {"15", "4", "1", "Ž 105, 1+5. 8-9. 24-25. 26-27",
                    "<font color='#B71C1C'>R.:</font> Pán večne pamätá na svoju zmluvu.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána a vzývajte jeho meno, <font color='#B71C1C'>*</font><br>" +
                            "rozhlasujte jeho skutky medzi národmi.<br>" +
                            "Pamätajte na divy, čo učinil, <font color='#B71C1C'>*</font><br>" +
                            "na jeho znamenia a na výroky jeho úst.<font color='#B71C1C'> – R.</font><br>" +
                            "večne pamätá na svoju zmluvu, <font color='#B71C1C'>*</font><br>" +
                            "na sľub, ktorý dal pokoleniam tisícim,<br>" +
                            "na zmluvu, čo s Abrahámom uzavrel, <font color='#B71C1C'>*</font><br>" +
                            "na prísahu, ktorou sa Izákovi zaviazal.<font color='#B71C1C'> – R.</font><br>" +
                            "Boh tam svoj národ rýchlo rozmnožil <font color='#B71C1C'>*</font><br>" +
                            "a zdatnejším ho urobil od jeho nepriateľov.<br>" +
                            "Prevrátil im srdcia, že znenávideli jeho ľud <font color='#B71C1C'>*</font><br>" +
                            "a ľstivo zaobchodili s jeho sluhami.<font color='#B71C1C'> – R.</font><br>" +
                            "Poslal svojho sluhu Mojžiša <font color='#B71C1C'>*</font><br>" +
                            "a Árona, ktorého si vyvolil.<br>" +
                            "A oni medzi nimi ohlasovali jeho znamenia <font color='#B71C1C'>*</font><br>" +
                            "a zázraky v Chámovej krajine.<font color='#B71C1C'> – R.</font>"},
            {"15", "4", "2", "Ž 102, 13-14b+15. 16-18. 19-21",
                    "<font color='#B71C1C'>R.:</font> Pán z nebies pozerá na našu zem.<br><br>" +
                            "Ty, Pane, trváš večne <font color='#B71C1C'>*</font><br>" +
                            "a spomienka na teba z pokolenia na pokolenie.<br>" +
                            "Vstaň a zľutuj sa nad Sionom, <font color='#B71C1C'>*</font><br>" +
                            "lebo už je čas, aby si sa nad ním zľutoval.<br>" +
                            "veď tvoji služobníci milujú jeho kamene <font color='#B71C1C'>*</font><br>" +
                            "a ľútostia nad jeho troskami.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvojho mena, Pane, budú sa báť pohania <font color='#B71C1C'>*</font><br>" +
                            "a tvojej slávy všetci zemskí králi;<br>" +
                            "lebo Pán vystaví Sion <font color='#B71C1C'>*</font><br>" +
                            "a zjaví sa vo svojej sláve.<br>" +
                            "zhliadne na modlitbu núdznych <font color='#B71C1C'>*</font><br>" +
                            "a nepohrdne ich prosbami.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa to zaznačí pre pokolenie budúce <font color='#B71C1C'>*</font><br>" +
                            "a obnovený ľud oslávi Pána.<br>" +
                            "Veď Pán hľadí zo svojej vznešenej svätyne <font color='#B71C1C'>*</font><br>" +
                            "a z nebies pozerá na zem;<br>" +
                            "čuje nárek zajatých <font color='#B71C1C'>*</font><br>" +
                            "a odsúdeným na smrť vracia slobodu.<font color='#B71C1C'> – R.</font>"},
            {"15", "5", "1", "Ž 116, 12-13. 15+16bc. 17-18",
                    "<font color='#B71C1C'>R.:</font> Vezmem kalich spásy a budem vzývať meno Pánovo.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Čím sa odvďačím Pánovi <font color='#B71C1C'>*</font><br>" +
                            "za všetko, čo mi dal?<br>" +
                            "Vezmem kalich spásy <font color='#B71C1C'>*</font><br>" +
                            "a budem vzývať meno Pánovo.<font color='#B71C1C'> – R.</font><br>" +
                            "V Pánových očiach má veľkú cenu <font color='#B71C1C'>*</font><br>" +
                            "smrť jeho svätých.<br>" +
                            "Pane, som tvoj sluha a syn tvojej služobnice. <font color='#B71C1C'>*</font><br>" +
                            "Ty si mi putá rozviazal:<font color='#B71C1C'> – R.</font><br>" +
                            "obetu chvály ti prinesiem <font color='#B71C1C'>*</font><br>" +
                            "a budem vzývať meno Pánovo.<br>" +
                            "Splním svoje sľuby Pánovi <font color='#B71C1C'>*</font><br>" +
                            "pred všetkým jeho ľudom.<font color='#B71C1C'> – R.</font>"},
            {"15", "5", "2", "Iz 38, 10. 11. 12. 16",
                    "<font color='#B71C1C'>R.:</font> Pane, ty si vyrval môj život z priepasti záhuby.<br><br>" +
                            "I povedal som: V polovici svojho života <font color='#B71C1C'>†</font><br>" +
                            "musím odísť k bránam podsvetia; <font color='#B71C1C'>*</font><br>" +
                            "ukrátený som o zvyšok mojich rokov.<font color='#B71C1C'> – R.</font><br>" +
                            "Povedal som:<br>" +
                            "Nebudem vidieť Pána, Boha, v krajine žijúcich, <font color='#B71C1C'>†</font><br>" +
                            "už neuzriem človeka <font color='#B71C1C'>*</font><br>" +
                            "uprostred obyvateľov zeme.<font color='#B71C1C'> – R.</font><br>" +
                            "Strhli môj telesný príbytok a odniesli ďaleko odo mňa <font color='#B71C1C'>*</font><br>" +
                            "ako pastiersky stan;<br>" +
                            "ako tkáč si dopriadol môj život, <font color='#B71C1C'>*</font><br>" +
                            "odstrihuješ ma z osnovy.<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, v teba dúfa moje srdce, <font color='#B71C1C'>†</font><br>" +
                            "oživ môjho ducha. <font color='#B71C1C'>*</font><br>" +
                            "Uzdrav ma a navráť mi život.<font color='#B71C1C'> – R.</font>"},
            {"15", "6", "1", "Ž 136, 1. 23. 24. 10. 11. 12. 13. 14. 15",
                    "<font color='#B71C1C'>R.:</font> Lebo jeho milosrdenstvo je večné.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "On pamätal na nás v našom ponížení, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "A oslobodil nás od našich nepriateľov, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "On pobil egyptských prvorodencov, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "On vyviedol Izraela spomedzi nich, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "mocnou rukou a vystretým ramenom, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "On rozdelil Červené more na dve časti, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "A Izraela previedol jeho stredom, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "V Červenom mori zatopil faraóna i jeho vojsko, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font>"},
            {"15", "6", "2", "Ž 10, 1-2. 3-4. 7-8. 14",
                    "<font color='#B71C1C'>R.:</font> Pane, nezabúdaj na úbohých.<br><br>" +
                            "Pane, prečo si tak ďaleko? <font color='#B71C1C'>*</font><br>" +
                            "Prečo sa skrývaš v časoch súženia?<br>" +
                            "Bezbožný vo svojej pýche sužuje bedára; <font color='#B71C1C'>*</font><br>" +
                            "nech sa chytí do nástrah, čo sám zosnoval.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď hriešnik sa chvastá svojou náruživosťou <font color='#B71C1C'>*</font><br>" +
                            "a lakomec sa vychvaľuje.<br>" +
                            "Hriešnik pohŕda Pánom a namyslene hovorí: <font color='#B71C1C'>*</font><br>" +
                            "\"Boh nezasahuje; Boha niet.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Jeho ústa sú plné luhania, klamu a podvodu; <font color='#B71C1C'>*</font><br>" +
                            "pod jeho jazykom zločin a násilie.<br>" +
                            "Sedí na postriežke blízko osád, <font color='#B71C1C'>*</font><br>" +
                            "nevinného zákerne zabíja.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty vidíš, veď ty hľadíš na útrapy a žiaľ <font color='#B71C1C'>*</font><br>" +
                            "a berieš ich do svojich rúk.<br>" +
                            "Na teba sa chudák spolieha <font color='#B71C1C'>*</font><br>" +
                            "a sirote pomáhaš.<font color='#B71C1C'> – R.</font>"},
            {"16", "A", "", "Ž 86, 5-6. 9-10. 15-16a",
                    "<font color='#B71C1C'>R.:</font> Ty, Pane, si dobrý, veľmi láskavý.<br><br>" +
                            "Ty, Pane, si dobrý a láskavý <font color='#B71C1C'>*</font><br>" +
                            "a veľmi milostivý voči všetkým, čo ťa vzývajú.<br>" +
                            "Pane, počuj moju modlitbu, <font color='#B71C1C'>*</font><br>" +
                            "všimni si hlas mojej úpenlivej prosby.<font color='#B71C1C'> – R.</font><br>" +
                            "Všetky národy, ktoré si stvoril, prídu k tebe <font color='#B71C1C'>†</font><br>" +
                            "a budú sa ti klaňať, Pane, <font color='#B71C1C'>*</font><br>" +
                            "a tvoje meno oslavovať.<br>" +
                            "Lebo si veľký a robíš zázraky, <font color='#B71C1C'>*</font><br>" +
                            "iba ty si Boh.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty, Pane, si Boh milosrdný a láskavý, <font color='#B71C1C'>†</font><br>" +
                            "zhovievavý, veľmi milostivý a verný. <font color='#B71C1C'>*</font><br>" +
                            "Pohliadni na mňa a zľutuj sa nado mnou.<font color='#B71C1C'> – R.</font>"},
            {"16", "B", "", "Ž 23, 1-3. 4. 5. 6",
                    "<font color='#B71C1C'>R.:</font> Pán je môj pastier, nič mi nechýba.<br><br>" +
                            "Pán je môj pastier, nič mi nechýba: <font color='#B71C1C'>*</font><br>" +
                            "pasie ma na zelených pašienkach.<br>" +
                            "Vodí ma k tichým vodám, <font color='#B71C1C'>*</font><br>" +
                            "dušu mi osviežuje.<br>" +
                            "Vodí ma po správnych chodníkoch, <font color='#B71C1C'>*</font><br>" +
                            "verný svojmu menu.<font color='#B71C1C'> – R.</font><br>" +
                            "I keby som mal ísť tmavou dolinou, <font color='#B71C1C'>†</font><br>" +
                            "nebudem sa báť zlého, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si so mnou.<br>" +
                            "Tvoj prút a tvoja palica, <font color='#B71C1C'>*</font><br>" +
                            "tie sú mi útechou.<font color='#B71C1C'> – R.</font><br>" +
                            "Prestieraš mi stôl <font color='#B71C1C'>*</font><br>" +
                            "pred očami mojich protivníkov.<br>" +
                            "Leješ mi olej na hlavu <font color='#B71C1C'>*</font><br>" +
                            "a kalich mi napĺňaš až po okraj.<font color='#B71C1C'> – R.</font><br>" +
                            "Dobrota a milosť budú ma sprevádzať <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni môjho života.<br>" +
                            "A budem bývať v dome Pánovom <font color='#B71C1C'>*</font><br>" +
                            "mnoho a mnoho dní.<font color='#B71C1C'> – R.</font>"},
            {"16", "C", "", "Ž 15, 2-3a. 3b-4b. 5",
                    "<font color='#B71C1C'>R.:</font> Pane, kto smie bývať v tvojom svätom stánku?<br><br>" +
                            "Ten, čo kráča bez poškvrny a koná spravodlivo, <font color='#B71C1C'>†</font> <br>" +
                            "čo z úprimného srdca pravdu hovorí, <font color='#B71C1C'>*</font> <br>" +
                            "čo nepodvádza svojím jazykom.<font color='#B71C1C'> – R.</font> <br>" +
                            "Čo nekrivdí svojmu blížnemu, <font color='#B71C1C'>*</font> <br>" +
                            "ani ho nepotupuje. <br>" +
                            "Čo ničomníka nemá za nič, <font color='#B71C1C'>*</font> <br>" +
                            "ale ctí si ľudí bohabojných.<font color='#B71C1C'> – R.</font> <br>" +
                            "Čo nepožičiava peniaze na úrok <font color='#B71C1C'>†</font> <br>" +
                            "a proti nevinnému sa nedá podplácať. <font color='#B71C1C'>*</font> <br>" +
                            "Kto si tak počína, ten sa nikdy neskláti.<font color='#B71C1C'> – R.</font>"},
            {"16", "1", "1", "Ex 15, 1-2. 3-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Spievajme Pánovi, lebo sa preslávil.<br><br>" +
                            "Spievajme Pánovi, lebo sa preslávil: <font color='#B71C1C'>*</font><br>" +
                            "koňa i jazdca zmietol do mora.<br>" +
                            "Pán je moja sila a moja udatnosť, <font color='#B71C1C'>*</font><br>" +
                            "on ma zachránil.<br>" +
                            "On je môj Boh, chcem ho velebiť; <font color='#B71C1C'>*</font><br>" +
                            "Boh môjho otca, budem ho chváliť.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán je ako bojovník; <font color='#B71C1C'>*</font><br>" +
                            "Jahve je jeho meno.<br>" +
                            "Faraónove vozy a jeho vojsko zmietol do mora; <font color='#B71C1C'>*</font><br>" +
                            "jeho najlepší bojovníci utonuli v Červenom mori.<font color='#B71C1C'> – R.</font><br>" +
                            "Vlny ich pokryli; <font color='#B71C1C'>*</font><br>" +
                            "sťa kameň klesli do hlbín.<br>" +
                            "Tvoja pravica, Pane, vyniká mocou, <font color='#B71C1C'>*</font><br>" +
                            "tvoja pravica, Pane, zasiahla nepriateľa.<font color='#B71C1C'> – R.</font>"},
            {"16", "1", "2", "Ž 50, 5-6. 8-9. 16b-17. 21+23",
                    "<font color='#B71C1C'>R.:</font> Ukáž nám, Pane, cestu spásy.<br><br>" +
                            "\"Zhromaždite mi mojich svätých, <font color='#B71C1C'>*</font><br>" +
                            "čo zmluvu so mnou spečatili obetou.\"<br>" +
                            "A nebesia zvestujú jeho spravodlivosť, <font color='#B71C1C'>*</font><br>" +
                            "veď sudcom je sám Boh.<font color='#B71C1C'> – R.</font><br>" +
                            "\"Neobviňujem ťa pre tvoje obety, <font color='#B71C1C'>*</font><br>" +
                            "veď tvoje žertvy stále sú predo mnou.<br>" +
                            "Viac z tvojho domu býčky neprijmem <font color='#B71C1C'>*</font><br>" +
                            "ani capov z tvojich čried.<font color='#B71C1C'> – R.</font><br>" +
                            "Prečo odriekaš moje príkazy <font color='#B71C1C'>*</font><br>" +
                            "a moju zmluvu v ústach omieľaš?<br>" +
                            "Veď ty nenávidíš poriadok <font color='#B71C1C'>*</font><br>" +
                            "a moje slovo odmietaš.<font color='#B71C1C'> – R.</font><br>" +
                            "Toto páchaš, a ja by som mal mlčať? <font color='#B71C1C'>†</font><br>" +
                            "Myslíš si, že ja som ako ty: <font color='#B71C1C'>*</font><br>" +
                            "teraz ťa obviňujem a hovorím ti to do očí.\"<br>" +
                            "Kto prináša obetu chvály, ten ma ctí; <font color='#B71C1C'>*</font><br>" +
                            "a kto kráča bez úhony, tomu ukážem Božiu spásu.<font color='#B71C1C'> – R.</font>"},
            {"16", "2", "1", "Ex 15, 8-9. 10+12. 17",
                    "<font color='#B71C1C'>R.:</font> Spievajme Pánovi, lebo sa preslávil.<br><br>" +
                            "Pod dychom tvojho rozhorčenia sa nahromadili vody; <font color='#B71C1C'>†</font><br>" +
                            "pohyblivé vlny ako hrádza postáli, <font color='#B71C1C'>*</font><br>" +
                            "hlbiny stuhli uprostred mora.<br>" +
                            "Nepriateľ si povedal: \"Budem ich prenasledovať, chytím ich; <font color='#B71C1C'>†</font><br>" +
                            "rozdelím korisť a moja duša sa nasýti. <font color='#B71C1C'>*</font><br>" +
                            "Vytasím svoj meč, moja ruka ich pozabíja!\"<font color='#B71C1C'> – R.</font><br>" +
                            "Zavial tvoj vietor a prikrylo ich more; <font color='#B71C1C'>†</font><br>" +
                            "utonuli sťa olovo v mohutných vodách. <font color='#B71C1C'>*</font><br>" +
                            "Vystrel si svoju ruku a pohltila ich zem.<font color='#B71C1C'> – R.</font><br>" +
                            "Vovedieš ich a zasadíš na vrchu svojho dedičstva, <font color='#B71C1C'>†</font><br>" +
                            "v svojom bezpečnom príbytku, ktorý si ty, Pane, urobil; <font color='#B71C1C'>*</font><br>" +
                            "vo svätyni, ktorej základy kládli tvoje ruky, Pane.<font color='#B71C1C'> – R.</font>"},
            {"16", "2", "2", "Ž 85, 2-4. 5-6. 7-8",
                    "<font color='#B71C1C'>R.:</font> Ukáž nám, Pane, svoje milosrdenstvo a daj nám svoju spásu.<br><br>" +
                            "Pane, svojej krajine si preukázal milosť, <font color='#B71C1C'>*</font><br>" +
                            "Jakuba si zbavil poroby.<br>" +
                            "Svojmu ľudu si odpustil vinu <font color='#B71C1C'>*</font><br>" +
                            "a zakryl si všetky jeho hriechy.<br>" +
                            "Všetok hnev si v sebe potlačil <font color='#B71C1C'>*</font><br>" +
                            "a zmiernil svoje rozhorčenie.<font color='#B71C1C'> – R.</font><br>" +
                            "Obnov nás, Bože, naša spása, <font color='#B71C1C'>*</font><br>" +
                            "a odvráť od nás svoj hnev.<br>" +
                            "Vari sa chceš hnevať na nás naveky <font color='#B71C1C'>*</font><br>" +
                            "a z pokolenia na pokolenie svoj hnev prenášať?<font color='#B71C1C'> – R.</font><br>" +
                            "Či sa k nám nevrátiš a neoživíš nás, <font color='#B71C1C'>*</font><br>" +
                            "aby sa tvoj ľud mohol v tebe radovať?<br>" +
                            "Ukáž nám, Pane, svoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a daj nám svoju spásu.<font color='#B71C1C'> – R.</font>"},
            {"16", "3", "1", "Ž 78, 18-19. 23-24. 25-26. 27-28",
                    "<font color='#B71C1C'>R.:</font> Pane, daj nám chlieb z neba.<br><br>" +
                            "Pokúšali Boha vo svojom srdci, <font color='#B71C1C'>*</font><br>" +
                            "dychtivo sa dožadovali pokrmu.<br>" +
                            "proti Bohu reptali a vraveli: <font color='#B71C1C'>*</font><br>" +
                            "\"Či Boh môže pripraviť stôl aj na púšti?\"<font color='#B71C1C'> – R.</font><br>" +
                            "Rozkázal teda horným oblakom <font color='#B71C1C'>*</font><br>" +
                            "a otvoril brány nebies;<br>" +
                            "a pršala im manna za pokrm <font color='#B71C1C'>*</font><br>" +
                            "a dal im chlieb z neba.<font color='#B71C1C'> – R.</font><br>" +
                            "Človek jedol chlieb anjelský; <font color='#B71C1C'>*</font><br>" +
                            "pokrmu im dal dosýta.<br>" +
                            "Z oblohy vyburcoval vietor východný, <font color='#B71C1C'>*</font><br>" +
                            "svojou mocou priviedol vietor od juhu<font color='#B71C1C'> – R.</font><br>" +
                            "a spustil sa na nich dážď mäsa ako prach, <font color='#B71C1C'>*</font><br>" +
                            "okrídlené vtáky ako morský piesok.<br>" +
                            "Padali doprostred ich tábora, <font color='#B71C1C'>*</font><br>" +
                            "okolo stanov.<font color='#B71C1C'> – R.</font>"},
            {"16", "3", "2", "Ž 71, 1-2. 3-4a. 5-6b. 15ab+17",
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
                            "a ja až doteraz ohlasujem tvoje diela zázračné.<font color='#B71C1C'> – R.</font>"},
            {"16", "4", "1", "Dan 3, 52a. 52c. 53. 54. 55. 56",
                    "<font color='#B71C1C'>R.:</font> Chvála ti a sláva naveky.<br><br>" +
                            "Zvelebený si, Pane, Bože našich otcov, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a vyvýšený naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Zvelebené je, tvoje meno, slávne a sväté, <font color='#B71C1C'>*</font><br>" +
                            "hodno chvály a vyvýšené nad všetky veky.<font color='#B71C1C'> – R.</font><br>" +
                            "Zvelebený si v chráme tvojej svätej slávy, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a slávy nad všetky veky.<font color='#B71C1C'> – R.</font><br>" +
                            "Zvelebený si na tróne svojho kráľovstva, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a vyvýšený nad všetky veky.<font color='#B71C1C'> – R.</font><br>" +
                            "Zvelebený si, čo prenikáš pohľadom priepasti <font color='#B71C1C'>†</font><br>" +
                            "a tróniš nad cherubmi, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a vyvýšený naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Zvelebený si na nebeskej oblohe, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a slávy naveky.<font color='#B71C1C'> – R.</font>"},
            {"16", "4", "2", "Ž 36, 6-7b. 8-9. 10-11",
                    "<font color='#B71C1C'>R.:</font> Pane, u teba je zdroj života.<br><br>" +
                            "Pane, tvoje milosrdenstvo siaha po nebesia <font color='#B71C1C'>*</font><br>" +
                            "a tvoja vernosť až k oblakom.<br>" +
                            "Tvoja spravodlivosť je ako Božie výšiny, <font color='#B71C1C'>*</font><br>" +
                            "tvoje súdy ako morská hlbina.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože, aké vzácne je tvoje milosrdenstvo! <font color='#B71C1C'>*</font><br>" +
                            "Ľudia sa utiekajú do tône tvojich krídel.<br>" +
                            "Opájajú sa blahobytom tvojho domu <font color='#B71C1C'>*</font><br>" +
                            "a pijú z potoka tvojich rozkoší.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď u teba je zdroj života <font color='#B71C1C'>*</font><br>" +
                            "a v tvojom svetle uvidíme svetlo.<br>" +
                            "Svoju milosť daj tým, čo ťa poznajú, <font color='#B71C1C'>*</font><br>" +
                            "a spravodlivosť tým, čo majú srdce úprimné.<font color='#B71C1C'> – R.</font>"},
            {"16", "5", "1", "Ž 19, 8. 9. 10. 11",
                    "<font color='#B71C1C'>R.:</font> Pane, ty máš slová večného života.<br><br>" +
                            "Zákon Pánov je dokonalý, <font color='#B71C1C'>*</font><br>" +
                            "osviežuje dušu.<br>" +
                            "Svedectvo Pánovo je hodnoverné, <font color='#B71C1C'>*</font><br>" +
                            "dáva múdrosť maličkým.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozhodnutia Pánove sú správne, <font color='#B71C1C'>*</font><br>" +
                            "potešujú srdce.<br>" +
                            "Prikázania Pánove sú jasné, <font color='#B71C1C'>*</font><br>" +
                            "osvecujú oči.<font color='#B71C1C'> – R.</font><br>" +
                            "Bázeň pred Pánom je úprimná, <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky.<br>" +
                            "Výroky Pánove sú pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a všetky spravodlivé.<font color='#B71C1C'> – R.</font><br>" +
                            "Vzácnejšie sú než zlato, <font color='#B71C1C'>*</font><br>" +
                            "než veľký drahokam,<br>" +
                            "sladšie sú než med, <font color='#B71C1C'>*</font><br>" +
                            "než medové kvapky z plástu.<font color='#B71C1C'> – R.</font>"},
            {"16", "5", "2", "Jer 31, 10. 11-12b. 13",
                    "<font color='#B71C1C'>R.:</font> Pán nás bude strážiť ako pastier svoje stádo.<br><br>" +
                            "Čujte, národy, slovo Pánovo, <font color='#B71C1C'>*</font><br>" +
                            "ohlasujte ho na ostrovoch v diaľavách a hovorte:<br>" +
                            "\"Zhromaždí Izraela ten, čo ho rozptýlil, <font color='#B71C1C'>*</font><br>" +
                            "bude ho strážiť ako pastier svoje stádo.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán vykúpil Jakuba <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ho z ruky mocnejšieho.<br>" +
                            "Prídu a budú jasať na vrchu Sion, <font color='#B71C1C'>*</font><br>" +
                            "budú sa hrnúť k darom Pánovým.<font color='#B71C1C'> – R.</font><br>" +
                            "Vtedy sa panna radosťou roztančí, <font color='#B71C1C'>*</font><br>" +
                            "mládenci i starci zároveň.<br>" +
                            "\"Ich smútok zmením na radosť, <font color='#B71C1C'>*</font><br>" +
                            "poteším ich a rozveselím po žiali.\"<font color='#B71C1C'> – R.</font>"},
            {"16", "6", "1", "Ž 50, 1-2. 5-6. 14-15",
                    "<font color='#B71C1C'>R.:</font> Prijmi od nás, Pane, obetu chvály.<br><br>" +
                            "Zvrchovaný Boh, Pán, prehovoril <font color='#B71C1C'>†</font><br>" +
                            "a vyzval zem od východu slnka až po jeho západ. <font color='#B71C1C'>*</font><br>" +
                            "Zo Siona plného nádhery zažiaril Boh:<font color='#B71C1C'> – R.</font><br>" +
                            "\"Zhromaždite mi mojich svätých, <font color='#B71C1C'>*</font><br>" +
                            "čo zmluvu so mnou spečatili obetou.\"<br>" +
                            "A nebesia zvestujú jeho spravodlivosť, <font color='#B71C1C'>*</font><br>" +
                            "veď sudcom je sám Boh.<font color='#B71C1C'> – R.</font><br>" +
                            "\"Obetuj Bohu obetu chvály <font color='#B71C1C'>*</font><br>" +
                            "a Najvyššiemu svoje sľuby splň.<br>" +
                            "A vzývaj ma v čase súženia: <font color='#B71C1C'>*</font><br>" +
                            "ja ťa zachránim a ty mi úctu vzdáš.\"<font color='#B71C1C'> – R.</font>"},
            {"16", "6", "2", "Ž 84, 3. 4. 5-6a+8a. 11",
                    "<font color='#B71C1C'>R.:</font> Aké milé sú tvoje príbytky, Pane zástupov.<br><br>" +
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
                            "Blažený človek, ktorému ty pomáhaš. <font color='#B71C1C'>*</font><br>" +
                            "Stúpajú a síl im stále pribúda.<font color='#B71C1C'> – R.</font><br>" +
                            "Jeden deň v tvojich nádvoriach je lepší <font color='#B71C1C'>*</font><br>" +
                            "než iných tisíce.<br>" +
                            "Radšej chcem stáť na prahu domu svojho Boha <font color='#B71C1C'>*</font><br>" +
                            "ako prebývať v stanoch hriešnikov.<font color='#B71C1C'> – R.</font>"},
            {"17", "A", "", "Ž 119, 57+72. 76-77. 127-128. 129-130",
                    "<font color='#B71C1C'>R.:</font> Pane, tvoj zákon veľmi milujem.<br><br>" +
                            "Pane, ty si moje všetko; <font color='#B71C1C'>*</font><br>" +
                            "povedal som: Budem zachovávať tvoje slová.<br>" +
                            "Lepší je pre mňa zákon tvojich úst <font color='#B71C1C'>*</font><br>" +
                            "ako tisícky v zlate a striebre.<font color='#B71C1C'> – R.</font><br>" +
                            "Buď ku mne milosrdný a poteš ma, <font color='#B71C1C'>*</font><br>" +
                            "ako si prisľúbil svojmu služobníkovi.<br>" +
                            "Nech zostúpi na mňa tvoje zľutovanie a budem žiť, <font color='#B71C1C'>*</font><br>" +
                            "lebo tvoj zákon je mojím potešením.<font color='#B71C1C'> – R.</font><br>" +
                            "Milujem tvoje predpisy <font color='#B71C1C'>*</font><br>" +
                            "viac ako zlato, viac ako najrýdzejšie zlato.<br>" +
                            "Preto sa správam tvojimi príkazmi <font color='#B71C1C'>*</font><br>" +
                            "a nenávidím cestu klamstva.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoje príkazy sú obdivuhodné, <font color='#B71C1C'>*</font><br>" +
                            "preto ich zachovávam.<br>" +
                            "Výklad tvojich slov osvecuje, <font color='#B71C1C'>*</font><br>" +
                            "maličkým dáva chápavosť.<font color='#B71C1C'> – R.</font>"},
            {"17", "B", "", "Ž 145, 10-11. 15-16. 17-18",
                    "<font color='#B71C1C'>R.:</font> Otvor svoju ruku, Pane, a nasýť nás.<br><br>" +
                            "Nech ťa oslavujú, Pane, všetky tvoje diela <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech ťa velebia.<br>" +
                            "Nech rozprávajú o sláve tvojho kráľovstva <font color='#B71C1C'>*</font><br>" +
                            "a o tvojej moci nech hovoria.<font color='#B71C1C'> – R.</font><br>" +
                            "Oči všetkých sa s dôverou upierajú na teba <font color='#B71C1C'>*</font><br>" +
                            "a ty im dávaš pokrm v pravý čas.<br>" +
                            "Otváraš svoju ruku <font color='#B71C1C'>*</font><br>" +
                            "a dobrotivo nasycuješ všetko živé.<font color='#B71C1C'> – R.</font><br>" +
                            "Spravodlivý je Pán na všetkých svojich cestách <font color='#B71C1C'>*</font><br>" +
                            "a svätý vo všetkých svojich skutkoch.<br>" +
                            "Blízky je Pán všetkým, čo ho vzývajú, <font color='#B71C1C'>*</font><br>" +
                            "všetkým, čo ho vzývajú úprimne.<font color='#B71C1C'> – R.</font>"},
            {"17", "C", "", "Ž 138, 1-2a. 2bc+3. 6-7b. 7c-8",
                    "<font color='#B71C1C'>R.:</font> Vyslyš ma, Pane, keď ťa budem vzývať.<br><br>" +
                            "Chcem ťa, Pane, oslavovať celým srdcom, <font color='#B71C1C'>*</font><br>" +
                            "že si vypočul slová mojich úst.<br>" +
                            "Budem ti hrať pred tvárou anjelov, <font color='#B71C1C'>*</font><br>" +
                            "vrhnem sa na tvár pred tvojím svätým chrámom.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoje meno budem oslavovať, <font color='#B71C1C'>*</font><br>" +
                            "pretože si milosrdný a verný.<br>" +
                            "Vždy si ma vyslyšal, keď som ťa vzýval, <font color='#B71C1C'>*</font><br>" +
                            "a rozmnožil si vo mne odvahu.<font color='#B71C1C'> – R.</font><br>" +
                            "Vznešený je Pán, a predsa zhliada na pokorného, <font color='#B71C1C'>*</font><br>" +
                            "pyšného však zďaleka pozná.<br>" +
                            "Aj keby som mal prejsť súžením,<br>" +
                            "ty ma pri živote zachováš <font color='#B71C1C'>*</font><br>" +
                            "a svoju ruku vystrieš<br>" +
                            "proti hnevu mojich nepriateľov;<font color='#B71C1C'> – R.</font><br>" +
                            "zachráni ma tvoja pravica. <font color='#B71C1C'>*</font><br>" +
                            "Pán za mňa dielo dokončí.<br>" +
                            "Pane, tvoje milosrdenstvo je večné; <font color='#B71C1C'>*</font><br>" +
                            "neopusť dielo svojich rúk.<font color='#B71C1C'> – R.</font>"},
            {"17", "1", "1", "Ž 106, 19-20. 21-22. 23",
                    "<font color='#B71C1C'>R.:</font> Oslavujte Pána, lebo je dobrý.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Urobili si teľa na Horebe <font color='#B71C1C'>*</font><br>" +
                            "a klaňali sa soche uliatej;<br>" +
                            "i zamenili svoju slávu <font color='#B71C1C'>*</font><br>" +
                            "za podobu býka, ktorý trávu požiera.<font color='#B71C1C'> – R.</font><br>" +
                            "Zabudli na Boha, svojho záchrancu, <font color='#B71C1C'>*</font><br>" +
                            "ktorý vykonal veľké divy v Egypte,<br>" +
                            "zázraky v Chámovej krajine, <font color='#B71C1C'>*</font><br>" +
                            "v Červenom mori skutky úžasné.<font color='#B71C1C'> – R.</font><br>" +
                            "Už povedal, že ich vyhubí, <font color='#B71C1C'>*</font><br>" +
                            "keby nebolo Mojžiša, jeho vyvoleného.<br>" +
                            "On si stal v prielome pred neho, <font color='#B71C1C'>*</font><br>" +
                            "aby odvrátil jeho hnev; aby ich nezničil.<font color='#B71C1C'> – R.</font>"},
            {"17", "1", "2", "Dt 32, 18-19. 20. 21",
                    "<font color='#B71C1C'>R.:</font> Opustil si Boha, svojho stvoriteľa.<br><br>" +
                            "Skalu si zanedbal, čo ťa zrodila, <font color='#B71C1C'>*</font><br>" +
                            "zabudol si na Pána, svojho stvoriteľa.<br>" +
                            "Pán to videl a zavrhol ich, <font color='#B71C1C'>*</font><br>" +
                            "lebo ho hnevali jeho synovia a dcéry.<font color='#B71C1C'> – R.</font><br>" +
                            "Povedal: \"Skryjem pred nimi svoju tvár <font color='#B71C1C'>*</font><br>" +
                            "a uvidím, ako sa to s nimi skončí.<br>" +
                            "Lebo je to zvrhlé pokolenie, <font color='#B71C1C'>*</font><br>" +
                            "neverní synovia.<font color='#B71C1C'> – R.</font><br>" +
                            "Provokovali ma tým, čo nie je Boh, <font color='#B71C1C'>*</font><br>" +
                            "hnevali ma svojimi márnosťami.<br>" +
                            "Ja ich budem provokovať tým, čo nie je ľud, <font color='#B71C1C'>*</font><br>" +
                            "pochabým národom ich nahnevám.\"<font color='#B71C1C'> – R.</font>"},
            {"17", "2", "1", "Ž 103, 6-7. 8-9. 10-11. 12-13",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Pán koná spravodlivo <font color='#B71C1C'>*</font><br>" +
                            "a prisudzuje právo všetkým utláčaným.<br>" +
                            "Mojžišovi zjavil svoje cesty <font color='#B71C1C'>*</font><br>" +
                            "a synom Izraela svoje skutky.<font color='#B71C1C'> – R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a dobrotivý nesmierne.<br>" +
                            "Nevyčíta nám ustavične naše chyby, <font color='#B71C1C'>*</font><br>" +
                            "ani sa nehnevá naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Nezaobchodí s nami podľa našich hriechov, <font color='#B71C1C'>*</font><br>" +
                            "ani nám neodpláca podľa našich neprávostí.<br>" +
                            "Lebo ako vysoko je nebo od zeme, <font color='#B71C1C'>*</font><br>" +
                            "také veľké je jeho zľutovanie voči tým, čo sa ho boja.<font color='#B71C1C'> – R.</font><br>" +
                            "Ako je vzdialený východ od západu, <font color='#B71C1C'>*</font><br>" +
                            "tak vzďaľuje od nás našu neprávosť.<br>" +
                            "Ako sa otec zmilúva nad deťmi, <font color='#B71C1C'>*</font><br>" +
                            "tak sa Pán zmilúva nad tými, čo sa ho boja.<font color='#B71C1C'> – R.</font>"},
            {"17", "2", "2", "Ž 79, 8. 9. 11. 13",
                    "<font color='#B71C1C'>R.:</font> Pre slávu svojho mena pomôž nám, Bože.<br><br>" +
                            "Zabudni na hriechy našich otcov; <font color='#B71C1C'>†</font><br>" +
                            "príď nám čím skôr v ústrety so svojím milosrdenstvom, <font color='#B71C1C'>*</font><br>" +
                            "lebo sme veľmi úbohí.<font color='#B71C1C'> – R.</font><br>" +
                            "Pre slávu svojho mena nám pomôž, Bože, naša spása, <font color='#B71C1C'>†</font><br>" +
                            "a vysloboď nás; <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje meno odpusť nám hriechy.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech dôjde k tebe nárek zajatých; <font color='#B71C1C'>†</font><br>" +
                            "silou svojho ramena <font color='#B71C1C'>*</font><br>" +
                            "zachovaj synov smrti nažive.<font color='#B71C1C'> – R.</font><br>" +
                            "Ale my, tvoj ľud a ovce tvojej pastviny, <font color='#B71C1C'>*</font><br>" +
                            "chceme ťa zvelebovať naveky<br>" +
                            "a z pokolenia na pokolenie <font color='#B71C1C'>*</font><br>" +
                            "hlásať tvoju slávu.<font color='#B71C1C'> – R.</font>"},
            {"17", "3", "1", "Ž 99, 5. 6. 7. 9",
                    "<font color='#B71C1C'>R.:</font> Len ty si svätý, Pane, Bože náš.<br><br>" +
                            "Velebte Pána, nášho Boha, <font color='#B71C1C'>†</font><br>" +
                            "a padnite k jeho nohám, <font color='#B71C1C'>*</font><br>" +
                            "lebo je svätý.<font color='#B71C1C'> – R.</font><br>" +
                            "Mojžiš a Áron, jeho kňazi, <font color='#B71C1C'>†</font><br>" +
                            "a Samuel, ctiteľ jeho mena, <font color='#B71C1C'>*</font><br>" +
                            "vzývali Pána a on ich vypočul,<font color='#B71C1C'> – R.</font><br>" +
                            "z oblačného stĺpa k nim hovoril. <font color='#B71C1C'>†</font><br>" +
                            "A zachovávali jeho svedectvo <font color='#B71C1C'>*</font><br>" +
                            "a prikázania, ktoré im dal.<font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, nášho Boha, <font color='#B71C1C'>†</font><br>" +
                            "na jeho svätom vrchu sa mu klaňajte, <font color='#B71C1C'>*</font><br>" +
                            "lebo svätý je Pán, Boh náš.<font color='#B71C1C'> – R.</font>"},
            {"17", "3", "2", "Ž 59, 2-3. 4-5a. 10-11. 17. 18",
                    "<font color='#B71C1C'>R.:</font> Bože, ty si mi útočišťom v deň súženia.<br><br>" +
                            "Vytrhni ma, Bože, z moci mojich nepriateľov, <font color='#B71C1C'>*</font><br>" +
                            "chráň ma pred tými, čo povstávajú proti mne.<br>" +
                            "Vytrhni ma z rúk zločincov <font color='#B71C1C'>*</font><br>" +
                            "a zachráň pred krvilačníkmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Pozri, úklady robia na môj život <font color='#B71C1C'>†</font><br>" +
                            "a surovo sa vrhajú na mňa. <font color='#B71C1C'>*</font><br>" +
                            "Pane, neťaží ma ani priestupok ani hriech.<font color='#B71C1C'> – R.</font><br>" +
                            "Záštita moja, čakám na teba; <font color='#B71C1C'>*</font><br>" +
                            "lebo ty, Bože, si moja ochrana.<br>" +
                            "So mnou je Boh, jeho láska ma predchádza. <font color='#B71C1C'>*</font><br>" +
                            "Boh dá, že svojimi nepriateľmi budem môcť pohrdnúť.<font color='#B71C1C'> – R.</font><br>" +
                            "Ja však budem oslavovať tvoju moc <font color='#B71C1C'>*</font><br>" +
                            "a z tvojho milosrdenstva sa tešiť od rána,<br>" +
                            "lebo ty si sa mi stal oporou <font color='#B71C1C'>*</font><br>" +
                            "a útočišťom v deň môjho súženia.<font color='#B71C1C'> – R.</font><br>" +
                            "Tebe, záštita moja, chcem spievať, <font color='#B71C1C'>†</font><br>" +
                            "lebo ty, Bože, si môj ochranca, <font color='#B71C1C'>*</font><br>" +
                            "môj Boh, moje milosrdenstvo.<font color='#B71C1C'> – R.</font>"},
            {"17", "4", "1", "Ž 84, 3. 4. 5-6a+8a. 11",
                    "<font color='#B71C1C'>R.:</font> Aké milé sú tvoje príbytky, Pane zástupov!<br><br>" +
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
                            "Blažený človek, ktorému ty pomáhaš. <font color='#B71C1C'>*</font><br>" +
                            "Stúpajú a síl im stále pribúda.<font color='#B71C1C'> – R.</font><br>" +
                            "Jeden deň v tvojich nádvoriach je lepší <font color='#B71C1C'>*</font><br>" +
                            "než iných tisíce.<br>" +
                            "Radšej chcem stáť na prahu domu svojho Boha <font color='#B71C1C'>*</font><br>" +
                            "ako prebývať v stanoch hriešnikov.<font color='#B71C1C'> – R.</font>"},
            {"17", "4", "2", "Ž 146, 1-2. 3-4. 5-6b",
                    "<font color='#B71C1C'>R.:</font> Blažený človek, ktorý sa spolieha na Pána, svojho Boha.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľ, duša moja, Pána; <font color='#B71C1C'>†</font><br>" +
                            "celý život chcem chváliť Pána, <font color='#B71C1C'>*</font><br>" +
                            "svojmu Bohu spievať, kým len budem žiť.<font color='#B71C1C'> – R.</font><br>" +
                            "Nespoliehajte sa na kniežatá <font color='#B71C1C'>*</font><br>" +
                            "ani na ľudí vôbec; oni pomôcť nemôžu.<br>" +
                            "Vyjde z nich duch a vrátia sa do svojej zeme; <font color='#B71C1C'>*</font><br>" +
                            "v ten deň padnú ich plány.<font color='#B71C1C'> – R.</font><br>" +
                            "Blažený, komu pomáha Boh Jakubov, <font color='#B71C1C'>*</font><br>" +
                            "kto sa spolieha na Pána, svojho Boha.<br>" +
                            "On stvoril nebo i zem, <font color='#B71C1C'>*</font><br>" +
                            "more a všetko, čo je v ňom.<font color='#B71C1C'> – R.</font>"},
            {"17", "5", "1", "Ž 81, 3-4. 5-6b. 10-11b",
                    "<font color='#B71C1C'>R.:</font> Plesajte Bohu, ktorý nám pomáha.<br><br>" +
                            "Vezmite harfy, udrite na bubon, <font color='#B71C1C'>*</font><br>" +
                            "na ľúbu lýru a citaru.<br>" +
                            "Zatrúbte rohom pri nove mesiaca <font color='#B71C1C'>*</font><br>" +
                            "i pri jeho splne v deň našej slávnosti.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo také je nariadenie pre Izrael <font color='#B71C1C'>*</font><br>" +
                            "a zákon Boha Jakubovho.<br>" +
                            "Taký príkaz dal Jozefovi, <font color='#B71C1C'>*</font><br>" +
                            "keď vychádzal z krajiny egyptskej.<font color='#B71C1C'> – R.</font><br>" +
                            "\"Nebudeš mať iného boha, <font color='#B71C1C'>*</font><br>" +
                            "ani sa nebudeš klaňať bohu cudziemu.<br>" +
                            "Veď ja som Pán, tvoj Boh, <font color='#B71C1C'>*</font><br>" +
                            "ja som ťa vyviedol z egyptskej krajiny.\"<font color='#B71C1C'> – R.</font>"},
            {"17", "5", "2", "Ž 69, 5. 8-10. 14",
                    "<font color='#B71C1C'>R.:</font> Vo svojej veľkej láske vyslyš ma, Pane.<br><br>" +
                            "Viac než mám vlasov na hlave, <font color='#B71C1C'>*</font><br>" +
                            "je tých, čo ma bez príčiny nenávidia.<br>" +
                            "Mocnejší sú tí, čo ma prenasledujú, <font color='#B71C1C'>†</font><br>" +
                            "sú to nepriatelia klamárski; <font color='#B71C1C'>*</font><br>" +
                            "musel som vrátiť, čo som neulúpil.<font color='#B71C1C'> – R.</font><br>" +
                            "Pre teba znášam potupu <font color='#B71C1C'>*</font><br>" +
                            "a hanba mi pokrýva tvár.<br>" +
                            "Svojim bratom som sa stal cudzincom, <font color='#B71C1C'>*</font><br>" +
                            "a synom svojej matky neznámym.<br>" +
                            "Stravuje ma horlivosť za tvoj dom, <font color='#B71C1C'>*</font><br>" +
                            "padajú na mňa urážky tých, čo ťa urážajú.<font color='#B71C1C'> – R.</font><br>" +
                            "Ale ja, Pane, obraciam sa modlitbou k tebe <font color='#B71C1C'>*</font><br>" +
                            "v tomto čase milosti.<br>" +
                            "Vypočuj ma, Bože, pre svoju veľkú dobrotu, <font color='#B71C1C'>*</font><br>" +
                            "pre svoju vernosť mi pomôž.<font color='#B71C1C'> – R.</font>"},
            {"17", "6", "1", "Ž 67, 2-3. 5. 7-8",
                    "<font color='#B71C1C'>R.:</font> Velebte Pána, všetky národy.<br><br>" +
                            "Bože, buď nám milostivý a žehnaj nás; <font color='#B71C1C'>*</font><br>" +
                            "a tvoja tvár nech žiari nad nami,<br>" +
                            "aby sa tvoja cesta stala známou na zemi <font color='#B71C1C'>*</font><br>" +
                            "a tvoja spása medzi všetkými národmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa tešia a jasajú národy, <font color='#B71C1C'>†</font><br>" +
                            "že spravodlivo súdiš ľudí <font color='#B71C1C'>*</font><br>" +
                            "a spravuješ národy na zemi.<font color='#B71C1C'> – R.</font><br>" +
                            "Zem vydala svoj plod; <font color='#B71C1C'>*</font><br>" +
                            "nech nás požehná Boh, náš Boh;<br>" +
                            "nech nás Boh požehná <font color='#B71C1C'>*</font><br>" +
                            "a nech si ho ctia všetky končiny zeme.<font color='#B71C1C'> – R.</font>"},
            {"17", "6", "2", "Ž 69, 15-16. 30-31. 33-34",
                    "<font color='#B71C1C'>R.:</font> V tomto čase milosti vyslyš ma, Pane.<br><br>" +
                            "Vytrhni ma z bahna, aby som sa nepohrúžil doň, <font color='#B71C1C'>†</font><br>" +
                            "a budem vytrhnutý z moci svojich nenávistníkov <font color='#B71C1C'>*</font><br>" +
                            "i z hlbokých vôd.<br>" +
                            "Nech ma nezatopí príval vôd, <font color='#B71C1C'>†</font><br>" +
                            "nech ma nepohltí hlbina <font color='#B71C1C'>*</font><br>" +
                            "a priepasť nezavrie nado mnou pažerák.<font color='#B71C1C'> – R.</font><br>" +
                            "Som úbožiak, plný bolesti; <font color='#B71C1C'>*</font><br>" +
                            "tvoja pomoc, Bože, ma pozdvihne.<br>" +
                            "Piesňou chcem Božie meno osláviť <font color='#B71C1C'>*</font><br>" +
                            "a velebiť ho chválospevmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech zvedia o tom ponížení a nech sa potešia; <font color='#B71C1C'>*</font><br>" +
                            "hľadajte Boha a srdce vám oživne.<br>" +
                            "Lebo Pán vypočuje chudobných <font color='#B71C1C'>*</font><br>" +
                            "a nepohŕda svojimi, keď sú v zajatí.<font color='#B71C1C'> – R.</font>"},
            {"18", "A", "", "Ž 145, 8-9. 15-16. 17-18",
                    "<font color='#B71C1C'>R.:</font> Otvor svoju ruku, Pane, a nasýť nás.<br><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a veľmi láskavý.<br>" +
                            "Dobrý je Pán ku každému <font color='#B71C1C'>*</font><br>" +
                            "a milostivý ku všetkým svojim stvoreniam.<font color='#B71C1C'> – R.</font><br>" +
                            "Oči všetkých sa s dôverou upierajú na teba <font color='#B71C1C'>*</font><br>" +
                            "a ty im dávaš pokrm v pravý čas.<br>" +
                            "Otváraš svoju ruku <font color='#B71C1C'>*</font><br>" +
                            "a dobrotivo nasycuješ všetko živé.<font color='#B71C1C'> – R.</font><br>" +
                            "Spravodlivý je Pán na všetkých svojich cestách <font color='#B71C1C'>*</font><br>" +
                            "a svätý vo všetkých svojich skutkoch.<br>" +
                            "Blízky je Pán všetkým, čo ho vzývajú, <font color='#B71C1C'>*</font><br>" +
                            "všetkým, čo ho vzývajú úprimne.<font color='#B71C1C'> – R.</font>"},
            {"18", "B", "", "Ž 78, 3+4b-d. 23-24. 25+54",
                    "<font color='#B71C1C'>R.:</font> Pane, daj nám chlieb z neba!<br><br>" +
                            "Čo sme počuli a poznali <font color='#B71C1C'>*</font><br>" +
                            "a čo nám rozprávali naši otcovia,<br>" +
                            "ďalším pokoleniam vyrozprávame <font color='#B71C1C'>*</font><br>" +
                            "slávne a mocné skutky Pánove<br>" +
                            "a zázraky, ktoré urobil.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozkázal horným oblakom <font color='#B71C1C'>*</font><br>" +
                            "a otvoril brány nebies;<br>" +
                            "a pršala im manna za pokrm <font color='#B71C1C'>*</font><br>" +
                            "a dal im chlieb z neba.<font color='#B71C1C'> – R.</font><br>" +
                            "Človek jedol chlieb anjelský; <font color='#B71C1C'>*</font><br>" +
                            "pokrmu im dal dosýta.<br>" +
                            "A priviedol ich do svojej svätej zeme, <font color='#B71C1C'>*</font><br>" +
                            "na vrch, čo získala jeho pravica.<font color='#B71C1C'> – R.</font>"},
            {"18", "C", "", "Ž 90, 3-4. 12-13. 14+17",
                    "<font color='#B71C1C'>R.:</font> Pane, stal si sa nám útočišťom z pokolenia na pokolenie.<br><br>" +
                            "Človeka vraciaš do prachu <font color='#B71C1C'>*</font><br>" +
                            "a hovoríš: \"Vráťte sa, synovia človeka!\"<br>" +
                            "Veď tisíc rokov je u teba ako deň včerajší, čo sa pominul, <font color='#B71C1C'>*</font><br>" +
                            "a ako jedna nočná stráž.<font color='#B71C1C'> – R.</font><br>" +
                            "Nauč nás rátať naše dni, <font color='#B71C1C'>*</font><br>" +
                            "aby sme našli múdrosť srdca.<br>" +
                            "Obráť sa k nám, Pane; dokedy budeš meškať? <font color='#B71C1C'>*</font><br>" +
                            "Zľutuj sa nad svojimi služobníkmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Hneď zrána nás naplň svojou milosťou <font color='#B71C1C'>*</font><br>" +
                            "a budeme jasať a radovať sa po všetky dni života.<br>" +
                            "Nech je nad nami dobrotivosť Pána, nášho Boha; <font color='#B71C1C'>†</font><br>" +
                            "upevňuj dielo našich rúk, <font color='#B71C1C'>*</font><br>" +
                            "dielo našich rúk upevňuj!<font color='#B71C1C'> – R.</font>"},
            {"18", "1", "1", "Ž 81, 12-13. 14-15. 16-17",
                    "<font color='#B71C1C'>R.:</font> Plesajte Bohu, ktorý nám pomáha.<br><br>" +
                            "Môj ľud nepočúval na môj hlas <font color='#B71C1C'>*</font><br>" +
                            "a Izrael nedbal o mňa.<br>" +
                            "Preto som ich ponechal v tvrdosti ich srdca: <font color='#B71C1C'>*</font><br>" +
                            "nech si len idú za svojimi preludmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Keby ma môj ľud bol poslúchol, <font color='#B71C1C'>*</font><br>" +
                            "keby bol Izrael kráčal mojimi cestami,<br>" +
                            "ihneď by som bol jeho nepriateľov pokoril <font color='#B71C1C'>*</font><br>" +
                            "a jeho utláčateľov svojou rukou pritlačil.<font color='#B71C1C'> – R.</font><br>" +
                            "Zaliečali by sa mu nepriatelia Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a ich osud by trval naveky.<br>" +
                            "Kŕmil by som ho jadrom pšeničným <font color='#B71C1C'>*</font><br>" +
                            "a sýtil medom zo skaly.<font color='#B71C1C'> – R.</font>"},
            {"18", "1", "2", "Ž 119, 29. 43. 79. 80. 95. 102",
                    "<font color='#B71C1C'>R.:</font> Daj mi poznať, Pane, tvoju spravodlivosť.<br><br>" +
                            "Odvráť ma od cesty lži <font color='#B71C1C'>*</font><br>" +
                            "a milostivo mi daj svoj zákon.<font color='#B71C1C'> – R.</font><br>" +
                            "Nikdy neodním slovo pravdy z mojich úst, <font color='#B71C1C'>*</font><br>" +
                            "veľmi dôverujem tvojim výrokom.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa pridajú ku mne tí, čo sa ťa boja <font color='#B71C1C'>*</font><br>" +
                            "a čo poznajú tvoju náuku.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa mi srdce nepoškvrní priestupkom<br>" +
                            "proti tvojim príkazom, <font color='#B71C1C'>*</font><br>" +
                            "aby som sa hanbiť nemusel.<font color='#B71C1C'> – R.</font><br>" +
                            "Hriešnici striehnu na mňa a chcú ma zahubiť, <font color='#B71C1C'>*</font><br>" +
                            "ale ja rozjímam o tvojich príkazoch.<font color='#B71C1C'> – R.</font><br>" +
                            "Neodkláňam sa od tvojich predpisov, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si mi zákon stanovil.<font color='#B71C1C'> – R.</font>"},
            {"18", "2", "1", "Ž 51, 3-4. 5-6a. 6b-7. 12-13",
                    "<font color='#B71C1C'>R.:</font> Zmiluj sa, Pane, lebo sme zhrešili.<br><br>" +
                            "Zmiluj sa, Bože, nado mnou pre svoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje veľké zľutovanie znič moju neprávosť.<br>" +
                            "Úplne zmy zo mňa moju vinu <font color='#B71C1C'>*</font><br>" +
                            "a očisť ma od hriechu.<font color='#B71C1C'> – R.</font><br>" +
                            "Vedomý som si svojej neprávosti <font color='#B71C1C'>*</font><br>" +
                            "a svoj hriech mám stále pred sebou.<br>" +
                            "Proti tebe, proti tebe samému som sa prehrešil <font color='#B71C1C'>*</font><br>" +
                            "a urobil som, čo je v tvojich očiach zlé,<font color='#B71C1C'> – R.</font><br>" +
                            "aby si sa ukázal spravodlivý vo svojom výroku <font color='#B71C1C'>*</font><br>" +
                            "a nestranný vo svojom súde.<br>" +
                            "Naozaj som sa v neprávosti narodil <font color='#B71C1C'>*</font><br>" +
                            "a hriešneho ma počala moja mať.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože, stvor vo mne srdce čisté <font color='#B71C1C'>*</font><br>" +
                            "a v mojom vnútri obnov ducha pevného.<br>" +
                            "Neodvrhuj ma spred svojej tváre <font color='#B71C1C'>*</font><br>" +
                            "a neodnímaj mi svojho ducha svätého.<font color='#B71C1C'> – R.</font>"},
            {"18", "2", "2", "Ž 102, 16-18. 19-21. 29+22-23",
                    "<font color='#B71C1C'>R.:</font> Pán vystavil Sion a zjavil sa vo svojej sláve.<br><br>" +
                            "Tvojho mena, Pane, budú sa báť pohania <font color='#B71C1C'>*</font><br>" +
                            "a tvojej slávy všetci zemskí králi;<br>" +
                            "lebo Pán vystaví Sion <font color='#B71C1C'>*</font><br>" +
                            "a zjaví sa vo svojej sláve.<br>" +
                            "Zhliadne na modlitbu núdznych <font color='#B71C1C'>*</font><br>" +
                            "a nepohrdne ich prosbami.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa to zaznačí pre pokolenie budúce <font color='#B71C1C'>*</font><br>" +
                            "a obnovený ľud oslávi Pána.<br>" +
                            "Veď Pán hľadí zo svojej vznešenej svätyne <font color='#B71C1C'>*</font><br>" +
                            "a z nebies pozerá na zem;<br>" +
                            "čuje nárek zajatých <font color='#B71C1C'>*</font><br>" +
                            "a odsúdeným na smrť vracia slobodu.<font color='#B71C1C'> – R.</font><br>" +
                            "Deti tvojich služobníkov budú bývať v bezpečí <font color='#B71C1C'>*</font><br>" +
                            "a ich potomstvo bude pevné pred tebou,<br>" +
                            "aby na Sione hlásali meno Pánovo <font color='#B71C1C'>*</font><br>" +
                            "a v Jeruzaleme jeho slávu,<br>" +
                            "keď sa tam zídu vospolok národy <font color='#B71C1C'>*</font><br>" +
                            "a kráľovstvá, aby slúžili Pánovi.<font color='#B71C1C'> – R.</font>"},
            {"18", "3", "1", "Ž 106, 6-7a. 13-14. 21-22. 23",
                    "<font color='#B71C1C'>R.:</font> Pamätaj na nás, Pane, z lásky k svojmu ľudu.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Hrešili sme ako naši otcovia, <font color='#B71C1C'>†</font><br>" +
                            "konali sme bezbožne, páchali sme neprávosť. <font color='#B71C1C'>*</font><br>" +
                            "Naši otcovia v Egypte nechápali tvoje zázraky.<font color='#B71C1C'> – R.</font><br>" +
                            "Onedlho na jeho skutky zabudli <font color='#B71C1C'>*</font><br>" +
                            "a jeho rozhodnutiu sa vzopreli.<br>" +
                            "Na púšti sa oddali žiadostivosti <font color='#B71C1C'>*</font><br>" +
                            "a v bezvodnej krajine pokúšali Boha.<font color='#B71C1C'> – R.</font><br>" +
                            "Zabudli na Boha, svojho záchrancu, <font color='#B71C1C'>*</font><br>" +
                            "ktorý vykonal veľké divy v Egypte,<br>" +
                            "zázraky v Chámovej krajine, <font color='#B71C1C'>*</font><br>" +
                            "v Červenom mori skutky úžasné.<font color='#B71C1C'> – R.</font><br>" +
                            "Už povedal, že ich vyhubí, <font color='#B71C1C'>*</font><br>" +
                            "keby nebolo Mojžiša, jeho vyvoleného.<br>" +
                            "On si stal v prielome pred neho, <font color='#B71C1C'>*</font><br>" +
                            "aby odvrátil jeho hnev; aby ich nezničil.<font color='#B71C1C'> – R.</font>"},
            {"18", "3", "2", "Jer 31, 10. 11-12b. 13",
                    "<font color='#B71C1C'>R.:</font> Pán nás bude strážiť ako pastier svoje stádo.<br><br>" +
                            "Čujte, národy, slovo Pánovo, <font color='#B71C1C'>*</font><br>" +
                            "ohlasujte ho na ostrovoch v diaľavách a hovorte:<br>" +
                            "\"Zhromaždí Izraela ten, čo ho rozptýlil, <font color='#B71C1C'>*</font><br>" +
                            "bude ho strážiť ako pastier svoje stádo.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán vykúpil Jakuba <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ho z ruky mocnejšieho.<br>" +
                            "Prídu a budú jasať na vrchu Sion, <font color='#B71C1C'>*</font><br>" +
                            "budú sa hrnúť k darom Pánovým.<font color='#B71C1C'> – R.</font><br>" +
                            "Vtedy sa panna radosťou roztančí, <font color='#B71C1C'>*</font><br>" +
                            "mládenci i starci zároveň.<br>" +
                            "\"Ich smútok zmením na radosť, <font color='#B71C1C'>*</font><br>" +
                            "poteším ich a rozveselím po žiali.\"<font color='#B71C1C'> – R.</font>"},
            {"18", "4", "1", "Ž 95, 1-2. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pane, daj, aby sme počúvali tvoj hlas a nezatvrdzovali si srdcia.<br><br>" +
                            "Poďte, plesajme v Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "oslavujme Boha, našu spásu.<br>" +
                            "Predstúpme s chválospevmi pred jeho tvár <font color='#B71C1C'>*</font><br>" +
                            "a oslavujme ho žalmami.<font color='#B71C1C'> – R.</font><br>" +
                            "Poďte, klaňajme sa a na zem padnime, <font color='#B71C1C'>*</font><br>" +
                            "kľaknime na kolená pred Pánom, ktorý nás stvoril.<br>" +
                            "Lebo on je náš Boh <font color='#B71C1C'>†</font><br>" +
                            "a my sme ľud jeho pastviny <font color='#B71C1C'>*</font><br>" +
                            "a ovce, ktoré vedie svojou rukou.<font color='#B71C1C'> – R.</font><br>" +
                            "Čujte dnes jeho hlas: <font color='#B71C1C'>*</font><br>" +
                            "\"Nezatvrdzujte svoje srdcia<br>" +
                            "ako v Meríbe, ako v dňoch Massy na púšti, <font color='#B71C1C'>†</font><br>" +
                            "kde ma pokúšali vaši otcovia; <font color='#B71C1C'>*</font><br>" +
                            "skúšali ma, hoci moje skutky videli.\"<font color='#B71C1C'> – R.</font>"},
            {"18", "4", "2", "Ž 51, 12-13. 14-15. 18-19",
                    "<font color='#B71C1C'>R.:</font> Bože, stvor vo mne srdce čisté.<br><br>" +
                            "Bože, stvor vo mne srdce čisté <font color='#B71C1C'>*</font><br>" +
                            "a v mojom vnútri obnov ducha pevného.<br>" +
                            "Neodvrhuj ma spred svojej tváre <font color='#B71C1C'>*</font><br>" +
                            "a neodnímaj mi svojho ducha svätého.<font color='#B71C1C'> – R.</font><br>" +
                            "Navráť mi radosť z tvojej spásy <font color='#B71C1C'>*</font><br>" +
                            "a posilni ma duchom veľkej ochoty.<br>" +
                            "Poučím blúdiacich o tvojich cestách <font color='#B71C1C'>*</font><br>" +
                            "a hriešnici sa k tebe obrátia.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď ty nemáš záľubu v obete, <font color='#B71C1C'>*</font><br>" +
                            "ani žertvu neprijmeš odo mňa.<br>" +
                            "Obetou Bohu milou je duch skrúšený; <font color='#B71C1C'>*</font><br>" +
                            "Bože, ty nepohŕdaš srdcom skrúšeným a poníženým.<font color='#B71C1C'> – R.</font>"},
            {"18", "5", "1", "Ž 77, 12-13. 14-15. 16+21",
                    "<font color='#B71C1C'>R.:</font> Pamätám, Pane, na tvoje skutky.<br><br>" +
                            "Pamätám, Pane, na tvoje skutky, <font color='#B71C1C'>*</font><br>" +
                            "pamätám na dávne zázraky.<br>" +
                            "O všetkých tvojich dielach rozmýšľam <font color='#B71C1C'>*</font><br>" +
                            "a uvažujem o tvojich činoch.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože, tvoja cesta je svätá. <font color='#B71C1C'>*</font><br>" +
                            "Ktorý boh je taký veľký, ako je náš Boh?<br>" +
                            "Ty si Boh, ty konáš zázraky, <font color='#B71C1C'>*</font><br>" +
                            "národom si dal poznať svoju moc.<font color='#B71C1C'> – R.</font><br>" +
                            "Svojím ramenom si vyslobodil svoj ľud, <font color='#B71C1C'>*</font><br>" +
                            "synov Jakubových a Jozefových.<br>" +
                            "Ako ovce si viedol svoj ľud <font color='#B71C1C'>*</font><br>" +
                            "rukou Mojžiša a Árona.<font color='#B71C1C'> – R.</font>"},
            {"18", "5", "2", "Dt 32, 35c-36b. 39a-d. 41",
                    "<font color='#B71C1C'>R.:</font> Pane, zľutuj sa nad svojimi služobníkmi.<br><br>" +
                            "Blízko je deň ich záhuby, <font color='#B71C1C'>*</font><br>" +
                            "ich osud sa urýchľuje.<br>" +
                            "Lebo Pán sa ujme práva svojho ľudu <font color='#B71C1C'>*</font><br>" +
                            "a zľutuje sa nad svojimi služobníkmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Pozrite teraz, že ja jediný som <font color='#B71C1C'>*</font><br>" +
                            "a niet Boha okrem mňa;<br>" +
                            "ja usmrcujem a ja oživujem, <font color='#B71C1C'>*</font><br>" +
                            "zraňujem i uzdravujem.<font color='#B71C1C'> – R.</font><br>" +
                            "Keď nabrúsim svoj blýskavý meč <font color='#B71C1C'>*</font><br>" +
                            "a moja ruka chopí sa práva,<br>" +
                            "pomstím sa svojim nepriateľom, <font color='#B71C1C'>*</font><br>" +
                            "a odplatím tým, čo ma nenávidia.<font color='#B71C1C'> – R.</font>"},
            {"18", "6", "1", "Ž 18, 2-3a. 3b-4. 47+51ab",
                    "<font color='#B71C1C'>R.:</font> Milujem ťa, Pane, ty moja sila.<br><br>" +
                            "Milujem ťa, Pane, moja sila; <font color='#B71C1C'>*</font><br>" +
                            "Pane, opora moja, útočište moje, osloboditeľ môj.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože môj, moja pomoc, tebe dôverujem; <font color='#B71C1C'>*</font><br>" +
                            "ty si môj štít, sila mojej spásy a môj ochranca.<br>" +
                            "Vzývať budem Pána, lebo jemu patrí chvála, <font color='#B71C1C'>*</font><br>" +
                            "a budem zachránený pred nepriateľmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech žije Pán, nech je zvelebený môj Záchranca, <font color='#B71C1C'>*</font><br>" +
                            "nech je vyvýšený Boh, moja spása.<br>" +
                            "Svojmu kráľovi dávaš veľké víťazstvá, <font color='#B71C1C'>*</font><br>" +
                            "preukazuješ priazeň svojmu pomazanému.<font color='#B71C1C'> – R.</font>"},
            {"18", "6", "2", "Ž 9, 8-9. 10-11. 12-13",
                    "<font color='#B71C1C'>R.:</font> Pane, ty neopúšťaš tých, čo ťa hľadajú.<br><br>" +
                            "Pán tróni naveky, <font color='#B71C1C'>*</font><br>" +
                            "už si pripravil stolec sudcovský.<br>" +
                            "A spravodlivo bude súdiť svet, <font color='#B71C1C'>*</font><br>" +
                            "podľa práva bude súdiť národy.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán bude utláčanému útočišťom, <font color='#B71C1C'>*</font><br>" +
                            "príhodným útočišťom v časoch súženia.<br>" +
                            "Na teba sa spoľahnú tí, čo tvoje meno poznajú, <font color='#B71C1C'>*</font><br>" +
                            "veď ty, Pane, neopúšťaš tých, čo ťa hľadajú.<font color='#B71C1C'> – R.</font><br>" +
                            "Spievajte a hrajte Pánovi, čo na Sione prebýva, <font color='#B71C1C'>*</font><br>" +
                            "ohlasujte jeho skutky medzi národmi.<br>" +
                            "Lebo on, čo pomstí krv, na nich pamätá, <font color='#B71C1C'>*</font><br>" +
                            "nezabúda na nárek bedárov.<font color='#B71C1C'> – R.</font>"},
            {"19", "A", "", "Ž 85, 9ab+10. 11-12. 13-14",
                    "<font color='#B71C1C'>R.:</font> Ukáž nám, Pane, svoje milosrdenstvo a daj nám svoju spásu.<br><br>" +
                            "Budem počúvať, čo povie Pán, Boh; <font color='#B71C1C'>*</font><br>" +
                            "on ohlási pokoj svojmu ľudu a svojim svätým.<br>" +
                            "Naozaj: blízko je spása tým, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "a jeho sláva bude prebývať v našej krajine.<font color='#B71C1C'> – R.</font><br>" +
                            "Milosrdenstvo a vernosť sa stretnú navzájom, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a pokoj sa pobozkajú.<br>" +
                            "Vernosť vyrastie zo zeme, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť zhliadne z neba.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď Pán dá požehnanie <font color='#B71C1C'>*</font><br>" +
                            "a svoje plody vydá naša zem.<br>" +
                            "Pred ním bude kráčať spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a po stopách jeho krokov spása.<font color='#B71C1C'> – R.</font>"},
            {"19", "B", "", "Ž 34, 2-3. 4-5. 6-7. 8-9",
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
                            "šťastný človek, čo sa utieka k nemu.<font color='#B71C1C'> – R.</font>"},
            {"19", "C", "", "Ž 33, 1+12. 18-19. 20+22",
                    "<font color='#B71C1C'>R.:</font> Blažený ľud, ktorý si Pán vyvolil za dedičstvo.<br><br>" +
                            "Plesajte, spravodliví, v Pánovi; <font color='#B71C1C'>*</font><br>" +
                            "statočným sluší spievať pieseň chvály.<br>" +
                            "Blažený národ, ktorého Bohom je Pán, <font color='#B71C1C'>*</font><br>" +
                            "blažený ľud, ktorý si on vyvolil za dedičstvo.<font color='#B71C1C'> – R.</font><br>" +
                            "Hľa, oko Pánovo bdie nad tými, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "nad tými, čo v jeho milosrdenstvo dúfajú,<br>" +
                            "aby ich zachránil pred smrťou <font color='#B71C1C'>*</font><br>" +
                            "a v čase hladu nakŕmil.<font color='#B71C1C'> – R.</font><br>" +
                            "Naša duša očakáva Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je naša pomoc a ochrana.<br>" +
                            "Tvoje milosrdenstvo, Pane, nech je nad nami, <font color='#B71C1C'>*</font><br>" +
                            "ako dúfame v teba.<font color='#B71C1C'> – R.</font>"},
            {"19", "1", "1", "Ž 147, 12-13. 14-15. 19-20",
                    "<font color='#B71C1C'>R.:</font> Chváľ, Jeruzalem, Pána, oslavuj, Sion, svojho Boha.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľ, Jeruzalem, Pána, <font color='#B71C1C'>*</font><br>" +
                            "oslavuj, Sion, svojho Boha.<br>" +
                            "Lebo upevnil závory tvojich brán <font color='#B71C1C'>*</font><br>" +
                            "a požehnal tvojich synov v tebe.<font color='#B71C1C'> – R.</font><br>" +
                            "Zaisťuje pokoj tvojim hraniciam, <font color='#B71C1C'>*</font><br>" +
                            "sýti ťa najlepšou pšenicou.<br>" +
                            "Svoj rozkaz na zem zosiela; <font color='#B71C1C'>*</font><br>" +
                            "rýchlo sa šíri jeho slovo.<font color='#B71C1C'> – R.</font><br>" +
                            "On svoje slovo zvestuje Jakubovi, <font color='#B71C1C'>*</font><br>" +
                            "svoje zákony a prikázania Izraelovi.<br>" +
                            "Neurobil tak iným národom, <font color='#B71C1C'>*</font><br>" +
                            "nezjavil im svoje zámery.<font color='#B71C1C'> – R.</font>"},
            {"19", "1", "2", "Ž 148, 1-2. 11-13a. 13b-14",
                    "<font color='#B71C1C'>R.:</font> Plné sú nebo i zem tvojej slávy.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľte Pána z nebies, <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho na výsostiach.<br>" +
                            "Chváľte ho, všetci jeho anjeli; <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho, všetky nebeské mocnosti.<font color='#B71C1C'> – R.</font><br>" +
                            "Králi zeme a všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "kniežatá a všetci zemskí sudcovia,<br>" +
                            "mládenci a panny, <font color='#B71C1C'>†</font><br>" +
                            "starci a junáci <font color='#B71C1C'>*</font><br>" +
                            "nech chvália meno Pánovo.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo iba jeho meno je vznešené. <font color='#B71C1C'>*</font><br>" +
                            "Jeho veleba prevyšuje zem i nebesia<br>" +
                            "a svojmu ľudu dáva veľkú moc. <font color='#B71C1C'>†</font><br>" +
                            "Je chválou všetkým svojim svätým, <font color='#B71C1C'>*</font><br>" +
                            "synom Izraela, ľudu, ktorý je mu blízky.<font color='#B71C1C'> – R.</font>"},
            {"19", "2", "1", "Dt 32, 3-4b. 7. 8. 9+12",
                    "<font color='#B71C1C'>R.:</font> Pán je vodcom svojho verného ľudu.<br><br>" +
                            "Vzývať budem meno Pánovo: <font color='#B71C1C'>*</font><br>" +
                            "vzdajte česť nášmu Bohu.<br>" +
                            "On je skala, jeho diela sú dokonalé, <font color='#B71C1C'>*</font><br>" +
                            "lebo sú spravodlivé všetky jeho cesty.<font color='#B71C1C'> – R.</font><br>" +
                            "Spomeň si na dávne dni, <font color='#B71C1C'>*</font><br>" +
                            "rozmýšľaj o všetkých pokoleniach;<br>" +
                            "opýtaj sa svojho otca a on ti dosvedčí <font color='#B71C1C'>*</font><br>" +
                            "i tvojich starcov a povedia ti.<font color='#B71C1C'> – R.</font><br>" +
                            "Keď Najvyšší vymedzoval národy, <font color='#B71C1C'>*</font><br>" +
                            "keď oddeľoval Adamových synov,<br>" +
                            "národom určil hranice <font color='#B71C1C'>*</font><br>" +
                            "podľa počtu synov Izraela;<font color='#B71C1C'> – R.</font><br>" +
                            "Pánovým podielom je totiž jeho ľud, <font color='#B71C1C'>*</font><br>" +
                            "Jakub jeho dedičným údelom.<br>" +
                            "Pán sám bol jeho vodcom <font color='#B71C1C'>*</font><br>" +
                            "a nepomáhal mu nijaký cudzí boh.<font color='#B71C1C'> – R.</font>"},
            {"19", "2", "2", "Ž 119, 14. 24. 72. 103. 111. 131",
                    "<font color='#B71C1C'>R.:</font> Tvoje výroky, Pane, mojim ústam sú sladšie ako med.<br><br>" +
                            "Keď idem cestou tvojich zákonov, <font color='#B71C1C'>*</font><br>" +
                            "mám väčšiu radosť ako zo všetkého bohatstva.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď tvoje ustanovenia sú mi rozkošou <font color='#B71C1C'>*</font><br>" +
                            "a tvoje príkazy sú mojimi radcami.<font color='#B71C1C'> – R.</font><br>" +
                            "Lepší je pre mňa zákon tvojich úst <font color='#B71C1C'>*</font><br>" +
                            "ako tisícky v zlate a striebre.<font color='#B71C1C'> – R.</font><br>" +
                            "Aké sladké sú tvoje výroky môjmu podnebiu, <font color='#B71C1C'>*</font><br>" +
                            "mojim ústam sú sladšie ako med.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoja náuka je mojím večným dedičstvom, <font color='#B71C1C'>*</font><br>" +
                            "lebo je slasťou môjmu srdcu.<font color='#B71C1C'> – R.</font><br>" +
                            "Otváram ústa a dych naberám, <font color='#B71C1C'>*</font><br>" +
                            "lebo túžim za tvojimi predpismi.<font color='#B71C1C'> – R.</font>"},
            {"19", "3", "1", "Ž 66, 1-3a. 5+16-17",
                    "<font color='#B71C1C'>R.:</font> Nech je zvelebený Boh; on dal život mojej duši.<br><br>" +
                            "Jasaj Bohu, celá zem; <font color='#B71C1C'>*</font><br>" +
                            "hrajte a spievajte na slávu jeho mena,<br>" +
                            "vzdávajte mu chválu. <font color='#B71C1C'>*</font><br>" +
                            "Hovorte Bohu: \"Aké úžasné sú tvoje diela.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Poďte a pozrite na Božie diela; <font color='#B71C1C'>*</font><br>" +
                            "úžas budia skutky, ktoré koná ľuďom.<br>" +
                            "Poďte sem a počúvajte, všetci ctitelia Boží, <font color='#B71C1C'>*</font><br>" +
                            "vyrozprávam vám, aké veľké veci mi urobil.<br>" +
                            "Moje ústa ho vzývali <font color='#B71C1C'>*</font><br>" +
                            "a môj jazyk velebil.<font color='#B71C1C'> – R.</font>"},
            {"19", "3", "2", "Ž 113, 1-2. 3-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Pánova sláva prevyšuje nebesia.<br><br>" +
                            "Chváľte, služobníci Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "chváľte meno Pánovo.<br>" +
                            "Nech je velebené meno Pánovo <font color='#B71C1C'>*</font><br>" +
                            "odteraz až naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Od východu slnka až po západ <font color='#B71C1C'>*</font><br>" +
                            "nech je oslávené meno Pánovo.<br>" +
                            "Vyvýšený je Pán nad všetky národy <font color='#B71C1C'>*</font><br>" +
                            "a jeho sláva nad nebesia.<font color='#B71C1C'> – R.</font><br>" +
                            "Kto je ako Pán, náš Boh, <font color='#B71C1C'>*</font><br>" +
                            "čo tróni na výsostiach,<br>" +
                            "a predsa dbá o všetko nepatrné <font color='#B71C1C'>*</font><br>" +
                            "na nebi i na zemi?<font color='#B71C1C'> – R.</font>"},
            {"19", "4", "1", "Ž 114, 1-2. 3-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Aleluja, aleluja, aleluja.<br><br>" +
                            "Keď Izrael vyšiel z Egypta, <font color='#B71C1C'>*</font><br>" +
                            "dom Jakubov spomedzi ľudu cudzieho,<br>" +
                            "Judea sa stala jeho svätyňou, <font color='#B71C1C'>*</font><br>" +
                            "Izrael jeho kráľovstvom.<font color='#B71C1C'> – R.</font><br>" +
                            "More to videlo a zutekalo, <font color='#B71C1C'>*</font><br>" +
                            "Jordán sa naspäť obrátil;<br>" +
                            "vrchy poskakovali ako barance, <font color='#B71C1C'>*</font><br>" +
                            "pahorky ako jahňatá.<font color='#B71C1C'> – R.</font><br>" +
                            "Čo ti je, more, že utekáš, <font color='#B71C1C'>*</font><br>" +
                            "a tebe, Jordán, že sa naspäť obraciaš?<br>" +
                            "Vrchy, prečo poskakujete ako barance <font color='#B71C1C'>*</font><br>" +
                            "a vy, pahorky, ako jahňatá?<font color='#B71C1C'> – R.</font>"},
            {"19", "4", "2", "Ž 78, 56-57. 58-59. 61-62",
                    "<font color='#B71C1C'>R.:</font> Nezabúdajme na Pánove diela.<br><br>" +
                            "Pokúšali a popudzovali Najvyššieho, Boha, <font color='#B71C1C'>*</font><br>" +
                            "a nezachovávali jeho príkazy.<br>" +
                            "Odpadávali a boli neverní <font color='#B71C1C'>†</font><br>" +
                            "ako ich otcovia, <font color='#B71C1C'>*</font><br>" +
                            "sklamali ako pokazený luk.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozhnevali ho obradmi na výšinách <font color='#B71C1C'>*</font><br>" +
                            "a svojimi modlami vzbudili jeho žiarlivosť.<br>" +
                            "Počul to Boh a rozhneval sa <font color='#B71C1C'>*</font><br>" +
                            "a na Izraela veľmi zanevrel.<font color='#B71C1C'> – R.</font><br>" +
                            "Vydal svoju silu do zajatia, <font color='#B71C1C'>*</font><br>" +
                            "do rúk nepriateľa svoju nádheru.<br>" +
                            "Svoj ľud vydal meču napospas <font color='#B71C1C'>*</font><br>" +
                            "a hnevom zahorel proti svojmu dedičstvu.<font color='#B71C1C'> – R.</font>"},
            {"19", "5", "1", "Ž 136, 1. 2. 3. 16. 17. 18. 21. 22. 24",
                    "<font color='#B71C1C'>R.:</font> Lebo jeho milosrdenstvo je večné.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Oslavujte Boha nad bohmi, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Oslavujte Pána nad pánmi, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "On previedol svoj ľud cez púšť, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "On pobil význačných kráľov, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "A pozabíjal mocných kráľov, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "a ich krajinu dal za dedičstvo, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "za dedičstvo Izraelovi, svojmu služobníkovi, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "A oslobodil nás od našich nepriateľov, <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font>"},
            {"19", "5", "2", "Iz 12, 2-3. 4b-d. 5-6",
                    "<font color='#B71C1C'>R.:</font> Tvoj hnev sa utíšil a potešil si ma.<br><br>" +
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
            {"19", "6", "1", "Ž 16, 1-2a+5. 7-8. 11",
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
            {"19", "6", "2", "Ž 51, 12-13. 14-15. 18-19",
                    "<font color='#B71C1C'>R.:</font> Bože, stvor vo mne srdce čisté.<br><br>" +
                            "Bože, stvor vo mne srdce čisté <font color='#B71C1C'>*</font><br>" +
                            "a v mojom vnútri obnov ducha pevného.<br>" +
                            "Neodvrhuj ma spred svojej tváre <font color='#B71C1C'>*</font><br>" +
                            "a neodnímaj mi svojho ducha svätého.<font color='#B71C1C'> – R.</font><br>" +
                            "Navráť mi radosť z tvojej spásy <font color='#B71C1C'>*</font><br>" +
                            "a posilni ma duchom veľkej ochoty.<br>" +
                            "Poučím blúdiacich o tvojich cestách <font color='#B71C1C'>*</font><br>" +
                            "a hriešnici sa k tebe obrátia.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď ty nemáš záľubu v obete, <font color='#B71C1C'>*</font><br>" +
                            "ani žertvu neprijmeš odo mňa.<br>" +
                            "Obetou Bohu milou je duch skrúšený; <font color='#B71C1C'>*</font><br>" +
                            "Bože, ty nepohŕdaš srdcom skrúšeným a poníženým.<font color='#B71C1C'> – R.</font>"},
            {"20", "A", "", "Ž 67, 2-3. 5. 6+8",
                    "<font color='#B71C1C'>R.:</font> Velebte Pána, všetky národy.<br><br>" +
                            "Bože, buď nám milostivý a žehnaj nás; <font color='#B71C1C'>*</font><br>" +
                            "a tvoja tvár nech žiari nad nami,<br>" +
                            "aby sa tvoja cesta stala známou na zemi <font color='#B71C1C'>*</font><br>" +
                            "a tvoja spása medzi všetkými národmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa tešia a jasajú národy, <font color='#B71C1C'>†</font><br>" +
                            "že spravodlivo súdiš ľudí <font color='#B71C1C'>*</font><br>" +
                            "a spravuješ národy na zemi.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože, nech ťa velebia národy, <font color='#B71C1C'>*</font><br>" +
                            "nech ťa velebia všetky národy.<br>" +
                            "Nech nás Boh požehná <font color='#B71C1C'>*</font><br>" +
                            "a nech si ho ctia všetky končiny zeme.<font color='#B71C1C'> – R.</font>"},
            {"20", "B", "", "Ž 34, 2-3. 10-11. 12-13. 14-15",
                    "<font color='#B71C1C'>R.:</font> Skúste a presvedčte sa, aký dobrý je Pán.<br><br>" +
                            "Pána chcem velebiť v každom čase, <font color='#B71C1C'>*</font><br>" +
                            "moje ústa budú ho vždy chváliť.<br>" +
                            "V Pánovi sa bude chváliť moja duša; <font color='#B71C1C'>*</font><br>" +
                            "nechže to počujú pokorní a nech sa tešia.<font color='#B71C1C'> – R.</font><br>" +
                            "Vy, jeho svätí, bojte sa Pána, <font color='#B71C1C'>*</font><br>" +
                            "veď bohabojní núdzu nemajú.<br>" +
                            "Boháči sa nabiedia a nahladujú, <font color='#B71C1C'>*</font><br>" +
                            "ale tým, čo hľadajú Pána,<br>" +
                            "nijaké dobro chýbať nebude.<font color='#B71C1C'> – R.</font><br>" +
                            "Poďte, deti, čujte ma, <font color='#B71C1C'>*</font><br>" +
                            "naučím vás bázni Pánovej.<br>" +
                            "Miluje niekto život <font color='#B71C1C'>*</font><br>" +
                            "a chce požívať dobro v šťastných dňoch?<font color='#B71C1C'> – R.</font><br>" +
                            "Zdržuj svoj jazyk od zlého <font color='#B71C1C'>*</font><br>" +
                            "a svoje pery od reči úlisnej.<br>" +
                            "Unikaj pred zlom a dobre rob, <font color='#B71C1C'>*</font><br>" +
                            "hľadaj pokoj a usiluj sa oň.<font color='#B71C1C'> – R.</font>"},
            {"20", "C", "", "Ž 40, 2-3a. 3b-d. 4. 18",
                    "<font color='#B71C1C'>R.:</font> Pane, príď mi čím skôr na pomoc.<br><br>" +
                            "Čakal som, čakal na Pána <font color='#B71C1C'>†</font><br>" +
                            "a on sa ku mne sklonil <font color='#B71C1C'>*</font><br>" +
                            "a vyslyšal môj nárek.<font color='#B71C1C'> – R.</font><br>" +
                            "Vytiahol ma z jamy hrôzy, z bahnitého kalu. <font color='#B71C1C'>†</font><br>" +
                            "Nohy mi postavil na skalu <font color='#B71C1C'>*</font><br>" +
                            "a kroky mi upevnil.<font color='#B71C1C'> – R.</font><br>" +
                            "Do úst mi vložil pieseň novú, <font color='#B71C1C'>*</font><br>" +
                            "chválospev nášmu Bohu.<br>" +
                            "Mnohí to uvidia a bázeň ich naplní <font color='#B71C1C'>*</font><br>" +
                            "a budú dúfať v Pána.<font color='#B71C1C'> – R.</font><br>" +
                            "Ja som síce biedny a úbohý, <font color='#B71C1C'>*</font><br>" +
                            "no Pán sa stará o mňa.<br>" +
                            "Ty si moja pomoc a môj osloboditeľ, <font color='#B71C1C'>*</font><br>" +
                            "Bože môj, nemeškaj.<font color='#B71C1C'> – R.</font>"},
            {"20", "1", "1", "Ž 106, 34-35. 36-37. 39-40. 43ab+44",
                    "<font color='#B71C1C'>R.:</font> Pamätaj na nás, Pane, z lásky k svojmu ľudu.<br><br>" +
                            "Nevyhubili národy, <font color='#B71C1C'>*</font><br>" +
                            "ako im Pán bol rozkázal.<br>" +
                            "Ale zmiešali sa s pohanmi <font color='#B71C1C'>*</font><br>" +
                            "a osvojili si ich správanie.<font color='#B71C1C'> – R.</font><br>" +
                            "Uctievali sošky ich bôžikov <font color='#B71C1C'>*</font><br>" +
                            "a tie sa im stali osídlom.<br>" +
                            "Synov a dcéry <font color='#B71C1C'>*</font><br>" +
                            "obetovali zlým duchom.<font color='#B71C1C'> – R.</font><br>" +
                            "Znečistili sa svojimi skutkami <font color='#B71C1C'>*</font><br>" +
                            "a porušovali vernosť svojimi zločinmi.<br>" +
                            "Pán vzplanul hnevom proti svojmu ľudu, <font color='#B71C1C'>*</font><br>" +
                            "až sa mu sprotivilo jeho dedičstvo.<font color='#B71C1C'> – R.</font><br>" +
                            "Častejšie ich vyslobodil; <font color='#B71C1C'>*</font><br>" +
                            "no oni ho vždy rozčúlili nejakým výmyslom.<br>" +
                            "Ale on zhliadol na ich súženie, <font color='#B71C1C'>*</font><br>" +
                            "keď počul ich náreky.<font color='#B71C1C'> – R.</font>"},
            {"20", "1", "2", "Dt 32, 18-19. 20. 21",
                    "<font color='#B71C1C'>R.:</font> Opustil si Boha, svojho stvoriteľa.<br><br>" +
                            "Skalu si zanedbal, čo ťa zrodila, <font color='#B71C1C'>*</font><br>" +
                            "zabudol si na Pána, svojho stvoriteľa.<br>" +
                            "Pán to videl a zavrhol ich, <font color='#B71C1C'>*</font><br>" +
                            "lebo ho hnevali jeho synovia a dcéry.<font color='#B71C1C'> – R.</font><br>" +
                            "Povedal: \"Skryjem pred nimi svoju tvár <font color='#B71C1C'>*</font><br>" +
                            "a uvidím, ako sa to s nimi skončí.<br>" +
                            "Lebo je to zvrhlé pokolenie, <font color='#B71C1C'>*</font><br>" +
                            "neverní synovia.<font color='#B71C1C'> – R.</font><br>" +
                            "Provokovali ma tým, čo nie je Boh, <font color='#B71C1C'>*</font><br>" +
                            "hnevali ma svojimi márnosťami.<br>" +
                            "Ja ich budem provokovať tým, čo nie je ľud, <font color='#B71C1C'>*</font><br>" +
                            "pochabým národom ich nahnevám.\"<font color='#B71C1C'> – R.</font>"},
            {"20", "2", "1", "Ž 85, 9. 11-12. 13-14",
                    "<font color='#B71C1C'>R.:</font> Pán, Boh, ohlási pokoj svojmu ľudu a svojim svätým.<br><br>" +
                            "Budem počúvať, čo povie Pán, Boh; <font color='#B71C1C'>†</font><br>" +
                            "on ohlási pokoj svojmu ľudu a svojim svätým <font color='#B71C1C'>*</font><br>" +
                            "a tým, čo sa k nemu obracajú úprimne.<font color='#B71C1C'> – R.</font><br>" +
                            "Milosrdenstvo a vernosť sa stretnú navzájom, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a pokoj sa pobozkajú.<br>" +
                            "Vernosť vyrastie zo zeme, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť zhliadne z neba.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď Pán dá požehnanie <font color='#B71C1C'>*</font><br>" +
                            "a svoje plody vydá naša zem.<br>" +
                            "Pred ním bude kráčať spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a po stopách jeho krokov spása.<font color='#B71C1C'> – R.</font>"},
            {"20", "2", "2", "Dt 32, 26-27b. 27c-28. 30. 35c-36b",
                    "<font color='#B71C1C'>R.:</font> Zľutuj sa, Pane, nad svojimi služobníkmi.<br><br>" +
                            "\"Povedal by som: Rozptýlim ich <font color='#B71C1C'>*</font><br>" +
                            "a vyhladím ich pamiatku z ľudstva!,<br>" +
                            "keby som sa nebál spupnosti nepriateľov, <font color='#B71C1C'>*</font><br>" +
                            "že sa budú pýšiť ich protivníci.<font color='#B71C1C'> – R.</font><br>" +
                            "A povedia: ‚Naša ruka je vynikajúca, <font color='#B71C1C'>*</font><br>" +
                            "nie Pán urobil toto všetko!'<br>" +
                            "Lebo je to ľud bezradný <font color='#B71C1C'>*</font><br>" +
                            "a nechápavý.<font color='#B71C1C'> – R.</font><br>" +
                            "Ako by jeden mohol prenasledovať tisíc ľudí <font color='#B71C1C'>*</font><br>" +
                            "a dvaja zahnať na útek desaťtisíc?<br>" +
                            "Iba ak by ich predala ich Skala <font color='#B71C1C'>*</font><br>" +
                            "a Pán by ich vydal napospas.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Blízko je deň ich záhuby, <font color='#B71C1C'>*</font><br>" +
                            "ich osud sa urýchľuje.<br>" +
                            "Lebo Pán sa ujme práva svojho ľudu <font color='#B71C1C'>*</font><br>" +
                            "a zľutuje sa nad svojimi služobníkmi.<font color='#B71C1C'> – R.</font>"},
            {"20", "3", "1", "Ž 21, 2-3. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Pane, z tvojej sily sa kráľ raduje.<br><br>" +
                            "Pane, z tvojej sily sa kráľ raduje <font color='#B71C1C'>*</font><br>" +
                            "a veľmi sa teší z tvojej spásy.<br>" +
                            "Vyplnil si túžbu jeho srdca <font color='#B71C1C'>*</font><br>" +
                            "a prosbu jeho perí si neodmietol.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyšiel si mu v ústrety s požehnaním, <font color='#B71C1C'>*</font><br>" +
                            "na jeho hlavu si vložil korunu z rýdzeho zlata.<br>" +
                            "Prosil si od teba život a ty si mu ho daroval, <font color='#B71C1C'>*</font><br>" +
                            "život dlhý, navždy, naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Veľká je jeho sláva, lebo mu pomáhaš, <font color='#B71C1C'>*</font><br>" +
                            "ozdobuješ ho velebou a nádherou.<br>" +
                            "Robíš z neho požehnanie pre všetky veky, <font color='#B71C1C'>*</font><br>" +
                            "blažíš ho radosťou pred svojou tvárou.<font color='#B71C1C'> – R.</font>"},
            {"20", "3", "2", "Ž 23, 1-3. 4. 5. 6",
                    "<font color='#B71C1C'>R.:</font> Pán je môj pastier, nič mi nechýba.<br><br>" +
                            "Pán je môj pastier, nič mi nechýba: <font color='#B71C1C'>*</font><br>" +
                            "pasie ma na zelených pašienkach.<br>" +
                            "Vodí ma k tichým vodám, <font color='#B71C1C'>*</font><br>" +
                            "dušu mi osviežuje.<br>" +
                            "Vodí ma po správnych chodníkoch, <font color='#B71C1C'>*</font><br>" +
                            "verný svojmu menu.<font color='#B71C1C'> – R.</font><br>" +
                            "I keby som mal ísť tmavou dolinou, <font color='#B71C1C'>†</font><br>" +
                            "nebudem sa báť zlého, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si so mnou.<br>" +
                            "Tvoj prút a tvoja palica, <font color='#B71C1C'>*</font><br>" +
                            "tie sú mi útechou.<font color='#B71C1C'> – R.</font><br>" +
                            "Prestieraš mi stôl <font color='#B71C1C'>*</font><br>" +
                            "pred očami mojich protivníkov.<br>" +
                            "Leješ mi olej na hlavu <font color='#B71C1C'>*</font><br>" +
                            "a kalich mi napĺňaš až po okraj.<font color='#B71C1C'> – R.</font><br>" +
                            "Dobrota a milosť budú ma sprevádzať <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni môjho života.<br>" +
                            "A budem bývať v dome Pánovom <font color='#B71C1C'>*</font><br>" +
                            "mnoho a mnoho dní.<font color='#B71C1C'> – R.</font>"},
            {"20", "4", "1", "Ž 40, 5. 7-8a. 8b-9. 10",
                    "<font color='#B71C1C'>R.:</font> Hľa, prichádzam, Pane, chcem plniť tvoju vôľu.<br><br>" +
                            "Blažený človek, čo v Pána skladá dôveru <font color='#B71C1C'>*</font><br>" +
                            "a nevšíma si pyšných ani náchylných klamať.<font color='#B71C1C'> – R.</font><br>" +
                            "Obety a dary si nepraješ, <font color='#B71C1C'>*</font><br>" +
                            "lež uši si mi otvoril.<br>" +
                            "Nežiadaš žertvu ani obetu zmierenia, <font color='#B71C1C'>*</font><br>" +
                            "preto som povedal: \"Hľa, prichádzam.<font color='#B71C1C'> – R.</font><br>" +
                            "Vo zvitku knihy je napísané o mne, <font color='#B71C1C'>*</font><br>" +
                            "že mám plniť tvoju vôľu.<br>" +
                            "A to chcem, Bože môj, <font color='#B71C1C'>*</font><br>" +
                            "hlboko v srdci mám tvoj zákon.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Ohlasujem tvoju spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "vo veľkom zhromaždení;<br>" +
                            "svojim perám hovoriť nebránim, <font color='#B71C1C'>*</font><br>" +
                            "Pane, ty to vieš.<font color='#B71C1C'> – R.</font>"},
            {"20", "4", "2", "Ž 51, 12-13. 14-15. 18-19",
                    "<font color='#B71C1C'>R.:</font> Vylejem na vás čistú vodu a budete očistení.<br><br>" +
                            "Bože, stvor vo mne srdce čisté <font color='#B71C1C'>*</font><br>" +
                            "a v mojom vnútri obnov ducha pevného.<br>" +
                            "Neodvrhuj ma spred svojej tváre <font color='#B71C1C'>*</font><br>" +
                            "a neodnímaj mi svojho ducha svätého.<font color='#B71C1C'> – R.</font><br>" +
                            "Navráť mi radosť z tvojej spásy <font color='#B71C1C'>*</font><br>" +
                            "a posilni ma duchom veľkej ochoty.<br>" +
                            "Poučím blúdiacich o tvojich cestách <font color='#B71C1C'>*</font><br>" +
                            "a hriešnici sa k tebe obrátia.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď ty nemáš záľubu v obete, <font color='#B71C1C'>*</font><br>" +
                            "ani žertvu neprijmeš odo mňa.<br>" +
                            "Obetou Bohu milou je duch skrúšený; <font color='#B71C1C'>*</font><br>" +
                            "Bože, ty nepohŕdaš srdcom skrúšeným a poníženým.<font color='#B71C1C'> – R.</font>"},
            {"20", "5", "1", "Ž 146, 5-6. 7. 8-9a. 9b-10",
                    "<font color='#B71C1C'>R.:</font> Chváľ, duša moja, Pána cez celý môj život.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Blažený, komu pomáha Boh Jakubov, <font color='#B71C1C'>*</font><br>" +
                            "kto sa spolieha na Pána, svojho Boha.<br>" +
                            "On stvoril nebo i zem, <font color='#B71C1C'>†</font><br>" +
                            "more a všetko, čo je v ňom. <font color='#B71C1C'>*</font><br>" +
                            "On zachováva vernosť naveky,<font color='#B71C1C'> – R.</font><br>" +
                            "utláčaným prisudzuje právo, <font color='#B71C1C'>†</font><br>" +
                            "hladujúcim dáva chlieb. <font color='#B71C1C'>*</font><br>" +
                            "Pán vyslobodzuje väzňov,<font color='#B71C1C'> – R.</font><br>" +
                            "Pán otvára oči slepým, <font color='#B71C1C'>*</font><br>" +
                            "Pán dvíha skľúčených,<br>" +
                            "Pán miluje spravodlivých. <font color='#B71C1C'>*</font><br>" +
                            "Pán ochraňuje cudzincov,<font color='#B71C1C'> – R.</font><br>" +
                            "ujíma sa siroty a vdovy, <font color='#B71C1C'>*</font><br>" +
                            "ale hatí cesty hriešnikov.<br>" +
                            "Pán bude kraľovať naveky; <font color='#B71C1C'>*</font><br>" +
                            "tvoj Boh, Sion, z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"20", "5", "2", "Ž 107, 2-3. 4-5. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Oslavujte Pána, lebo jeho milosrdenstvo trvá naveky.<br><br>" +
                            "Tak nech hovoria tí, ktorých Pán vykúpil, <font color='#B71C1C'>*</font><br>" +
                            "ktorých vykúpil z rúk protivníkových<br>" +
                            "a zhromaždil z rozličných krajín, <font color='#B71C1C'>†</font><br>" +
                            "od východu i západu, <font color='#B71C1C'>*</font><br>" +
                            "od severu i od mora.<font color='#B71C1C'> – R.</font><br>" +
                            "Blúdili pustatinou a po vyprahnutej stepi, <font color='#B71C1C'>*</font><br>" +
                            "nenachádzali cestu k trvalému bydlisku.<br>" +
                            "Mali hlad a smäd, <font color='#B71C1C'>*</font><br>" +
                            "ubúdalo v nich života.<font color='#B71C1C'> – R.</font><br>" +
                            "V súžení volali k Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a on ich vyslobodil z úzkostí.<br>" +
                            "Na správnu cestu ich priviedol, <font color='#B71C1C'>*</font><br>" +
                            "aby šli po nej k trvalému bydlisku.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech oslavujú Pána za jeho milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a za zázraky v prospech ľudí,<br>" +
                            "lebo smädného napojil <font color='#B71C1C'>*</font><br>" +
                            "a hladného nakŕmil dobrotami.<font color='#B71C1C'> – R.</font>"},
            {"20", "6", "1", "Ž 128, 1-2. 3. 4. 5",
                    "<font color='#B71C1C'>R.:</font> Tak bude požehnaný muž, ktorý sa bojí Pána.<br><br>" +
                            "Blažený každý, čo sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a kráča po jeho cestách.<br>" +
                            "Budeš jesť z práce svojich rúk; <font color='#B71C1C'>*</font><br>" +
                            "budeš šťastný a budeš sa mať dobre.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoja manželka je ako plodonosný vinič <font color='#B71C1C'>*</font><br>" +
                            "vnútri tvojho domu.<br>" +
                            "Tvoji synovia sú ako mládniky olivy <font color='#B71C1C'>*</font><br>" +
                            "okolo tvojho stola.<font color='#B71C1C'> – R.</font><br>" +
                            "Veru, tak bude požehnaný muž, <font color='#B71C1C'>*</font><br>" +
                            "ktorý sa bojí Pána.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech ťa žehná Pán zo Siona, <font color='#B71C1C'>†</font><br>" +
                            "aby si videl šťastie Jeruzalema <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni svojho života.<font color='#B71C1C'> – R.</font>"},
            {"20", "6", "2", "Ž 85, 9ab+10. 11-12. 13-14",
                    "<font color='#B71C1C'>R.:</font> Pánova sláva bude prebývať v našej krajine.<br><br>" +
                            "Budem počúvať, čo povie Pán, Boh; <font color='#B71C1C'>*</font><br>" +
                            "on ohlási pokoj svojmu ľudu a svojim svätým.<br>" +
                            "Naozaj: blízko je spása tým, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "a jeho sláva bude prebývať v našej krajine.<font color='#B71C1C'> – R.</font><br>" +
                            "Milosrdenstvo a vernosť sa stretnú navzájom, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a pokoj sa pobozkajú.<br>" +
                            "Vernosť vyrastie zo zeme, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť zhliadne z neba.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď Pán dá požehnanie <font color='#B71C1C'>*</font><br>" +
                            "a svoje plody vydá naša zem.<br>" +
                            "Pred ním bude kráčať spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a po stopách jeho krokov spása.<font color='#B71C1C'> – R.</font>"},
            {"21", "A", "", "Ž 138, 1-2a. 2bc+3. 6+8bc",
                    "<font color='#B71C1C'>R.:</font> Pre svoje večné milosrdenstvo neopusť nás, Pane.<br><br>" +
                            "Chcem ťa, Pane, oslavovať celým srdcom, <font color='#B71C1C'>*</font><br>" +
                            "že si vypočul slová mojich úst.<br>" +
                            "Budem ti hrať pred tvárou anjelov, <font color='#B71C1C'>*</font><br>" +
                            "vrhnem sa na tvár pred tvojím svätým chrámom.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoje meno budem oslavovať, <font color='#B71C1C'>*</font><br>" +
                            "pretože si milosrdný a verný.<br>" +
                            "Vždy si ma vyslyšal, keď som ťa vzýval, <font color='#B71C1C'>*</font><br>" +
                            "a rozmnožil si vo mne odvahu.<font color='#B71C1C'> – R.</font><br>" +
                            "Vznešený je Pán, a predsa zhliada na pokorného, <font color='#B71C1C'>*</font><br>" +
                            "pyšného však zďaleka pozná.<br>" +
                            "Pane, tvoje milosrdenstvo je večné; <font color='#B71C1C'>*</font><br>" +
                            "neopusť dielo svojich rúk.<font color='#B71C1C'> – R.</font>"},
            {"21", "B", "", "Ž 34, 2-3. 16-17. 18-19. 20-21. 22-23",
                    "<font color='#B71C1C'>R.:</font> Skúste a presvedčte sa, aký dobrý je Pán.<br><br>" +
                            "Pána chcem velebiť v každom čase, <font color='#B71C1C'>*</font><br>" +
                            "moje ústa budú ho vždy chváliť.<br>" +
                            "V Pánovi sa bude chváliť moja duša; <font color='#B71C1C'>*</font><br>" +
                            "nechže to počujú pokorní a nech sa tešia.<font color='#B71C1C'> – R.</font><br>" +
                            "Pánove oči hľadia na spravodlivých <font color='#B71C1C'>*</font><br>" +
                            "a k ich volaniu sa nakláňa jeho sluch.<br>" +
                            "Tvár Pánova sa odvracia od tých, čo robia zlo, <font color='#B71C1C'>*</font><br>" +
                            "a vyhladzuje ich pamiatku zo zeme.<font color='#B71C1C'> – R.</font><br>" +
                            "Spravodliví volali a Pán ich vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ich zo všetkých tiesní.<br>" +
                            "Pán je pri tých, čo majú srdce skrúšené, <font color='#B71C1C'>*</font><br>" +
                            "a zachraňuje zlomených na duchu.<font color='#B71C1C'> – R.</font><br>" +
                            "Spravodliví majú utrpení veľa, <font color='#B71C1C'>*</font><br>" +
                            "ale Pán ich vyslobodí zo všetkých.<br>" +
                            "Všetky kosti im ochraňuje, <font color='#B71C1C'>*</font><br>" +
                            "ani jedna sa im nezlomí.<font color='#B71C1C'> – R.</font><br>" +
                            "Hriešnika zloba zahubí <font color='#B71C1C'>*</font><br>" +
                            "a tých, čo nenávidia spravodlivého, stihne trest.<br>" +
                            "Pán vykúpi duše svojich služobníkov, <font color='#B71C1C'>*</font><br>" +
                            "nebudú potrestaní tí, čo v neho dúfajú.<font color='#B71C1C'> – R.</font>"},
            {"21", "C", "", "Ž 117, 1. 2",
                    "<font color='#B71C1C'>R.:</font> Choďte do celého sveta a hlásajte evanjelium.<br><br>" +
                            "Chváľte Pána, všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "oslavujte ho, všetci ľudia;<font color='#B71C1C'> – R.</font><br>" +
                            "lebo je veľké jeho milosrdenstvo voči nám <font color='#B71C1C'>*</font><br>" +
                            "a pravda Pánova trvá naveky.<font color='#B71C1C'> – R.</font>"},
            {"21", "1", "1", "Ž 149, 1-2. 3-4. 5-6a+9b",
                    "<font color='#B71C1C'>R.:</font> Pán, Boh, miluje svoj ľud.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>*</font><br>" +
                            "jeho chvála nech znie v zhromaždení svätých.<br>" +
                            "Nech sa teší Izrael zo svojho Stvoriteľa, <font color='#B71C1C'>*</font><br>" +
                            "synovia Siona nech jasajú nad svojím kráľom.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech oslavujú jeho meno tancom, <font color='#B71C1C'>*</font><br>" +
                            "nech mu hrajú na bubne a na citare.<br>" +
                            "Lebo Pán miluje svoj ľud <font color='#B71C1C'>*</font><br>" +
                            "a tichých venčí víťazstvom.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech svätí jasajú v sláve, <font color='#B71C1C'>*</font><br>" +
                            "nech sa veselia na svojich lôžkach.<br>" +
                            "Oslavu Boha nech majú na perách; <font color='#B71C1C'>*</font><br>" +
                            "všetkým jeho svätým to bude na slávu.<font color='#B71C1C'> – R.</font>"},
            {"21", "1", "2", "Ž 96, 1-2a. 2b-3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Zvestujte všetkým národom zázraky Pánove.<br><br>" +
                            "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>†</font><br>" +
                            "spievaj Pánovi, celá zem! <font color='#B71C1C'>*</font><br>" +
                            "Spievajte Pánovi, velebte jeho meno.<font color='#B71C1C'> – R.</font><br>" +
                            "Zvestujte jeho spásu deň čo deň. <font color='#B71C1C'>†</font><br>" +
                            "Zvestujte jeho slávu pohanom <font color='#B71C1C'>*</font><br>" +
                            "a jeho zázraky všetkým národom.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo veľký je Pán a veľkej chvály hoden, <font color='#B71C1C'>*</font><br>" +
                            "viac ako všetkých bohov treba sa ho báť.<br>" +
                            "Lebo ničoty sú všetci bohovia pohanov, <font color='#B71C1C'>*</font><br>" +
                            "ale Pán stvoril nebesia.<font color='#B71C1C'> – R.</font>"},
            {"21", "2", "1", "Ž 139, 1-3. 4-6",
                    "<font color='#B71C1C'>R.:</font> Pane, ty ma skúmaš a vieš o mne všetko.<br><br>" +
                            "Pane, ty ma skúmaš a vieš o mne všetko; <font color='#B71C1C'>*</font><br>" +
                            "ty vieš, či sedím a či stojím.<br>" +
                            "Už zďaleka vnímaš moje myšlienky: <font color='#B71C1C'>†</font><br>" +
                            "či kráčam a či odpočívam, ty ma sleduješ. <font color='#B71C1C'>*</font><br>" +
                            "A všetky moje cesty sú ti známe.<font color='#B71C1C'> – R.</font><br>" +
                            "Hoci ešte slovo nemám ani na jazyku, <font color='#B71C1C'>*</font><br>" +
                            "ty, Pane, už vieš, čo chcem povedať.<br>" +
                            "obklopuješ ma spredu i zozadu <font color='#B71C1C'>*</font><br>" +
                            "a kladieš na mňa svoju ruku.<br>" +
                            "Obdivuhodná pre mňa je tvoja múdrosť; <font color='#B71C1C'>*</font><br>" +
                            "je taká veľká, že ju nemôžem pochopiť.<font color='#B71C1C'> – R.</font>"},
            {"21", "2", "2", "Ž 96, 10. 11-12a. 12b-13",
                    "<font color='#B71C1C'>R.:</font> Pán príde súdiť všetky národy.<br><br>" +
                            "Hlásajte medzi pohanmi: \"Pán kraľuje!\" <font color='#B71C1C'>†</font><br>" +
                            "Upevnil zemekruh, nepohne sa; <font color='#B71C1C'>*</font><br>" +
                            "a spravodlivo súdi národy.<font color='#B71C1C'> – R.</font><br>" +
                            "Tešte sa, nebesia, plesaj, zem; <font color='#B71C1C'>†</font><br>" +
                            "nech more zahučí a čo ho napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "nech plesá pole a všetko, čo je na ňom.<font color='#B71C1C'> – R.</font><br>" +
                            "I zajasajú všetky stromy lesa <font color='#B71C1C'>†</font><br>" +
                            "pred tvárou Pána, že prichádza, <font color='#B71C1C'>*</font><br>" +
                            "že prichádza súdiť zem.<br>" +
                            "Spravodlivo bude súdiť zemekruh <font color='#B71C1C'>*</font><br>" +
                            "a národy podľa svojej pravdy.<font color='#B71C1C'> – R.</font>"},
            {"21", "3", "1", "Ž 139, 7-8. 9-10. 11-12b",
                    "<font color='#B71C1C'>R.:</font> Pane, ty ma skúmaš a vieš o mne všetko.<br><br>" +
                            "Kam môžem ujsť pred tvojím duchom <font color='#B71C1C'>*</font><br>" +
                            "a kam utiecť pred tvojou tvárou?<br>" +
                            "Ak vystúpim na nebesia, ty si tam; <font color='#B71C1C'>*</font><br>" +
                            "ak zostúpim do podsvetia, aj tam si.<font color='#B71C1C'> – R.</font><br>" +
                            "I keby som si pripäl krídla zorničky <font color='#B71C1C'>*</font><br>" +
                            "a ocitol sa na najvzdialenejšom mori,<br>" +
                            "ešte aj tam ma tvoja ruka povedie <font color='#B71C1C'>*</font><br>" +
                            "a podchytí ma tvoja pravica.<font color='#B71C1C'> – R.</font><br>" +
                            "Keby som si povedal: \"Azda ma tma ukryje <font color='#B71C1C'>*</font><br>" +
                            "a namiesto svetla ma zahalí noc,\"<br>" +
                            "pre teba ani tmy tmavé nebudú <font color='#B71C1C'>*</font><br>" +
                            "a noc sa rozjasní ako deň.<font color='#B71C1C'> – R.</font>"},
            {"21", "3", "2", "Ž 128, 1-2. 4-5",
                    "<font color='#B71C1C'>R.:</font> Blažení sú všetci, čo sa boja Pána.<br><br>" +
                            "Blažený každý, čo sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a kráča po jeho cestách.<br>" +
                            "Budeš jesť z práce svojich rúk; <font color='#B71C1C'>*</font><br>" +
                            "budeš šťastný a budeš sa mať dobre.<font color='#B71C1C'> – R.</font><br>" +
                            "Veru, tak bude požehnaný muž, <font color='#B71C1C'>*</font><br>" +
                            "ktorý sa bojí Pána.<br>" +
                            "Nech ťa žehná Pán zo Siona, <font color='#B71C1C'>†</font><br>" +
                            "aby si videl šťastie Jeruzalema <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni svojho života.<font color='#B71C1C'> – R.</font>"},
            {"21", "4", "1", "Ž 90, 3-4. 12-13. 14+17",
                    "<font color='#B71C1C'>R.:</font> Naplň nás, Pane, svojou milosťou a budeme jasať.<br><br>" +
                            "Človeka vraciaš do prachu <font color='#B71C1C'>*</font><br>" +
                            "a hovoríš: \"Vráťte sa, synovia človeka!\"<br>" +
                            "Veď tisíc rokov je u teba ako deň včerajší, čo sa pominul, <font color='#B71C1C'>*</font><br>" +
                            "a ako jedna nočná stráž.<font color='#B71C1C'> – R.</font><br>" +
                            "Nauč nás rátať naše dni, <font color='#B71C1C'>*</font><br>" +
                            "aby sme našli múdrosť srdca.<br>" +
                            "Obráť sa k nám, Pane; dokedy budeš meškať? <font color='#B71C1C'>*</font><br>" +
                            "Zľutuj sa nad svojimi služobníkmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Hneď zrána nás naplň svojou milosťou <font color='#B71C1C'>*</font><br>" +
                            "a budeme jasať a radovať sa po všetky dni života.<br>" +
                            "Nech je nad nami dobrotivosť Pána, nášho Boha; <font color='#B71C1C'>†</font><br>" +
                            "upevňuj dielo našich rúk, <font color='#B71C1C'>*</font><br>" +
                            "dielo našich rúk upevňuj!<font color='#B71C1C'> – R.</font>"},
            {"21", "4", "2", "Ž 145, 2-3. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Oslavovať ťa chcem naveky, Bože, môj kráľ.<br><br>" +
                            "Budem ťa velebiť každý deň <font color='#B71C1C'>†</font><br>" +
                            "a tvoje meno chváliť <font color='#B71C1C'>*</font><br>" +
                            "navždy a naveky.<br>" +
                            "Veľký si, Pane, a veľkej chvály hoden, <font color='#B71C1C'>*</font><br>" +
                            "tvoju veľkosť nemožno preskúmať.<font color='#B71C1C'> – R.</font><br>" +
                            "Z pokolenia na pokolenie ide chvála tvojich skutkov <font color='#B71C1C'>*</font><br>" +
                            "a všetky pokolenia ohlasujú tvoju moc.<br>" +
                            "Hovoria o vznešenosti tvojej slávy a veleby <font color='#B71C1C'>*</font><br>" +
                            "a rozprávajú o tvojich zázrakoch.<font color='#B71C1C'> – R.</font><br>" +
                            "Hovoria aj o sile tvojich skutkov úžasných <font color='#B71C1C'>*</font><br>" +
                            "a rozprávajú o tvojej veľkosti.<br>" +
                            "Rozhlasujú chválu tvojej veľkej láskavosti <font color='#B71C1C'>*</font><br>" +
                            "a plesajú nad tvojou spravodlivosťou.<font color='#B71C1C'> – R.</font>"},
            {"21", "5", "1", "Ž 97, 1+2b. 5-6. 10. 11-12",
                    "<font color='#B71C1C'>R.:</font> Radujte sa, spravodliví, tešte sa v Pánovi.<br><br>" +
                            "Pán kraľuje, jasaj, zem; <font color='#B71C1C'>†</font><br>" +
                            "radujte sa, všetky ostrovy. <font color='#B71C1C'>*</font><br>" +
                            "Spravodlivosť a právo sú základom jeho trónu.<font color='#B71C1C'> – R.</font><br>" +
                            "Ako vosk sa topia vrchy pred tvárou Pánovou, <font color='#B71C1C'>*</font><br>" +
                            "pred Pánom celej zeme.<br>" +
                            "Jeho spravodlivosť ohlasujú nebesia <font color='#B71C1C'>*</font><br>" +
                            "a jeho slávu vidia všetky národy.<font color='#B71C1C'> – R.</font><br>" +
                            "Vy, čo milujete Pána, majte zlo v nenávisti, <font color='#B71C1C'>†</font><br>" +
                            "veď on ochraňuje svojich svätých <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodzuje ich z rúk hriešnika.<font color='#B71C1C'> – R.</font><br>" +
                            "Vychádza svetlo spravodlivému <font color='#B71C1C'>*</font><br>" +
                            "a radosť tým, čo majú srdcia úprimné.<br>" +
                            "Radujte sa, spravodliví, v Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a oslavujte jeho sväté meno.<font color='#B71C1C'> – R.</font>"},
            {"21", "5", "2", "Ž 33, 1-2. 4-5. 10-11",
                    "<font color='#B71C1C'>R.:</font> Milosti Pánovej plná je zem.<br><br>" +
                            "Plesajte, spravodliví, v Pánovi; <font color='#B71C1C'>*</font><br>" +
                            "statočným sluší spievať pieseň chvály.<br>" +
                            "Oslavujte Pána citarou, <font color='#B71C1C'>*</font><br>" +
                            "hrajte mu na desaťstrunovej lutne.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pánovo slovo je pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a verné všetko jeho konanie.<br>" +
                            "Miluje spravodlivosť a právo;<br>" +
                            "milosti Pánovej plná je zem.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán marí úmysly pohanov, <font color='#B71C1C'>*</font><br>" +
                            "navnivoč privádza myšlienky národov.<br>" +
                            "Ale Pánov úmysel trvá naveky, <font color='#B71C1C'>*</font><br>" +
                            "myšlienky jeho srdca z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"21", "6", "1", "Ž 98, 1. 7-9a. 9bc",
                    "<font color='#B71C1C'>R.:</font> Pán príde súdiť živých i mŕtvych.<br><br>" +
                            "Spievajte Pánovi pieseň novú, <font color='#B71C1C'>*</font><br>" +
                            "lebo vykonal veci zázračné.<br>" +
                            "Víťazstvo je dielom jeho pravice <font color='#B71C1C'>*</font><br>" +
                            "a jeho svätého ramena.<font color='#B71C1C'> – R.</font><br>" +
                            "Zahuč, more a všetko, čo ho napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "zemekruh a všetci, čo na ňom bývajú.<br>" +
                            "Tlieskajte, rieky, rukami, <font color='#B71C1C'>†</font><br>" +
                            "jasajte s nimi, vrchy, pred tvárou Pánovou, <font color='#B71C1C'>*</font><br>" +
                            "lebo prichádza súdiť zem.<font color='#B71C1C'> – R.</font><br>" +
                            "Spravodlivo bude súdiť zemekruh <font color='#B71C1C'>*</font><br>" +
                            "a podľa práva národy.<font color='#B71C1C'> – R.</font>"},
            {"21", "6", "2", "Ž 33, 12-13. 18-19. 20-21",
                    "<font color='#B71C1C'>R.:</font> Blažený ľud, ktorý si Pán vyvolil za dedičstvo.<br><br>" +
                            "Blažený národ, ktorého Bohom je Pán, <font color='#B71C1C'>*</font><br>" +
                            "blažený ľud, ktorý si on vyvolil za dedičstvo.<br>" +
                            "Pán hľadí z neba <font color='#B71C1C'>*</font><br>" +
                            "a vidí všetkých ľudí.<font color='#B71C1C'> – R.</font><br>" +
                            "Hľa, oko Pánovo bdie nad tými, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "nad tými, čo v jeho milosrdenstvo dúfajú,<br>" +
                            "aby ich zachránil pred smrťou <font color='#B71C1C'>*</font><br>" +
                            "a v čase hladu nakŕmil.<font color='#B71C1C'> – R.</font><br>" +
                            "Naša duša očakáva Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je naša pomoc a ochrana.<br>" +
                            "V ňom sa naše srdce raduje <font color='#B71C1C'>*</font><br>" +
                            "a v jeho sväté meno máme dôveru.<font color='#B71C1C'> – R.</font>"},
            {"22", "A", "", "Ž 63, 2. 3-4. 5-6. 8-9",
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
            {"22", "B", "", "Ž 15, 2-3a. 3b-4b. 5",
                    "<font color='#B71C1C'>R.:</font> Pane, kto smie bývať v tvojom svätom stánku?<br><br>" +
                            "Ten, čo kráča bez poškvrny a koná spravodlivo, <font color='#B71C1C'>†</font> <br>" +
                            "čo z úprimného srdca pravdu hovorí, <font color='#B71C1C'>*</font> <br>" +
                            "čo nepodvádza svojím jazykom.<font color='#B71C1C'> – R.</font> <br>" +
                            "Čo nekrivdí svojmu blížnemu, <font color='#B71C1C'>*</font> <br>" +
                            "ani ho nepotupuje. <br>" +
                            "Čo ničomníka nemá za nič, <font color='#B71C1C'>*</font> <br>" +
                            "ale ctí si ľudí bohabojných.<font color='#B71C1C'> – R.</font> <br>" +
                            "Čo nepožičiava peniaze na úrok <font color='#B71C1C'>†</font> <br>" +
                            "a proti nevinnému sa nedá podplácať. <font color='#B71C1C'>*</font> <br>" +
                            "Kto si tak počína, ten sa nikdy neskláti.<font color='#B71C1C'> – R.</font>"},
            {"22", "C", "", "Ž 68, 4-5ac. 6-7b. 10-11",
                    "<font color='#B71C1C'>R.:</font> Vo svojej dobrote, Bože, pripravil si dom chudobnému.<br><br>" +
                            "Spravodliví sa môžu tešiť a jasať pred Božou tvárou <font color='#B71C1C'>*</font><br>" +
                            "a v radosti sa veseliť.<br>" +
                            "Spievajte Bohu a jeho meno žalmom velebte: <font color='#B71C1C'>*</font><br>" +
                            "jeho meno je Pán.<font color='#B71C1C'> – R.</font><br>" +
                            "On je otec sirôt a záchranca vdov, <font color='#B71C1C'>*</font><br>" +
                            "on je Boh vo svojom svätom príbytku.<br>" +
                            "On je Boh, čo opusteným dáva prebývať v domoch, <font color='#B71C1C'>*</font><br>" +
                            "väzňov privádza k šťastiu.<font color='#B71C1C'> – R.</font><br>" +
                            "Zoslal si, Bože, zúrodňujúci dážď <font color='#B71C1C'>*</font><br>" +
                            "a vzpružil si svoju ochabnutú krajinu.<br>" +
                            "Prebývajú v nej tvoje tvory, <font color='#B71C1C'>*</font><br>" +
                            "pre chudobného si ju pripravil<br>" +
                            "vo svojej dobrote, Bože.<font color='#B71C1C'> – R.</font>"},
            {"22", "1", "1", "Ž 96, 1+3. 4-5. 11-12a. 12b-13",
                    "<font color='#B71C1C'>R.:</font> Pán príde súdiť všetky národy.<br><br>" +
                            "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>*</font><br>" +
                            "spievaj Pánovi, celá zem!<br>" +
                            "Zvestujte jeho slávu pohanom <font color='#B71C1C'>*</font><br>" +
                            "a jeho zázraky všetkým národom.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo veľký je Pán a veľkej chvály hoden, <font color='#B71C1C'>*</font><br>" +
                            "viac ako všetkých bohov treba sa ho báť.<br>" +
                            "Lebo ničoty sú všetci bohovia pohanov, <font color='#B71C1C'>*</font><br>" +
                            "ale Pán stvoril nebesia.<font color='#B71C1C'> – R.</font><br>" +
                            "Tešte sa, nebesia, plesaj, zem; <font color='#B71C1C'>†</font><br>" +
                            "nech more zahučí a čo ho napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "nech plesá pole a všetko, čo je na ňom.<font color='#B71C1C'> – R.</font><br>" +
                            "I zajasajú všetky stromy lesa <font color='#B71C1C'>†</font><br>" +
                            "pred tvárou Pána, že prichádza, <font color='#B71C1C'>*</font><br>" +
                            "že prichádza súdiť zem.<br>" +
                            "Spravodlivo bude súdiť zemekruh <font color='#B71C1C'>*</font><br>" +
                            "a národy podľa svojej pravdy.<font color='#B71C1C'> – R.</font>"},
            {"22", "1", "2", "Ž 119, 97. 98. 99. 100. 101. 102",
                    "<font color='#B71C1C'>R.:</font> Pane, tvoj zákon veľmi milujem.<br><br>" +
                            "Pane, tvoj zákon veľmi milujem, <font color='#B71C1C'>*</font><br>" +
                            "rozjímam o ňom celý deň.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoja náuka robí ma rozumnejším<br>" +
                            "nad mojich nepriateľov, <font color='#B71C1C'>*</font><br>" +
                            "ustavične sa jej pridŕžam.<font color='#B71C1C'> – R.</font><br>" +
                            "Múdrejší som nad všetkých mojich učiteľov, <font color='#B71C1C'>*</font><br>" +
                            "lebo o tvojich prikázaniach rozjímam.<font color='#B71C1C'> – R.</font><br>" +
                            "Chápavejší som nad starcov, <font color='#B71C1C'>*</font><br>" +
                            "lebo zachovávam tvoje príkazy.<font color='#B71C1C'> – R.</font><br>" +
                            "Svojim nohám nedovolím vykročiť na zlé cesty, <font color='#B71C1C'>*</font><br>" +
                            "chcem dodržiavať tvoje slová.<font color='#B71C1C'> – R.</font><br>" +
                            "Neodkláňam sa od tvojich predpisov, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si mi zákon stanovil.<font color='#B71C1C'> – R.</font>"},
            {"22", "2", "1", "Ž 27, 1. 4. 13-14",
                    "<font color='#B71C1C'>R.:</font> Verím, že uvidím dobrodenia Pánove v krajine žijúcich.<br><br>" +
                            "Pán je moje svetlo a moja spása, <font color='#B71C1C'>*</font><br>" +
                            "koho sa mám báť?<br>" +
                            "Pán je ochranca môjho života, <font color='#B71C1C'>*</font><br>" +
                            "pred kým sa mám strachovať?<font color='#B71C1C'> – R.</font><br>" +
                            "O jedno prosím Pána a za tým túžim, <font color='#B71C1C'>*</font><br>" +
                            "aby som mohol bývať v dome Pánovom<br>" +
                            "po všetky dni svojho života,<br>" +
                            "aby som pociťoval nehu Pánovu <font color='#B71C1C'>*</font><br>" +
                            "a obdivoval jeho chrám.<font color='#B71C1C'> – R.</font><br>" +
                            "Verím, že uvidím dobrodenia Pánove <font color='#B71C1C'>*</font><br>" +
                            "v krajine žijúcich.<br>" +
                            "Očakávaj Pána a buď statočný; <font color='#B71C1C'>*</font><br>" +
                            "srdce maj silné a drž sa Pána.<font color='#B71C1C'> – R.</font>"},
            {"22", "2", "2", "Ž 145, 8-9. 10-11. 12-13b. 13c-14",
                    "<font color='#B71C1C'>R.:</font> Spravodlivý je Pán na všetkých svojich cestách.<br><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a veľmi láskavý.<br>" +
                            "Dobrý je Pán ku každému <font color='#B71C1C'>*</font><br>" +
                            "a milostivý ku všetkým svojim stvoreniam.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech ťa oslavujú, Pane, všetky tvoje diela <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech ťa velebia.<br>" +
                            "Nech rozprávajú o sláve tvojho kráľovstva <font color='#B71C1C'>*</font><br>" +
                            "a o tvojej moci nech hovoria;<font color='#B71C1C'> – R.</font><br>" +
                            "nech ľuďom oznamujú tvoje zázraky <font color='#B71C1C'>*</font><br>" +
                            "i slávu a velebu tvojho kráľovstva.<br>" +
                            "Tvoje kráľovstvo je kráľovstvo pre všetky veky <font color='#B71C1C'>*</font><br>" +
                            "a tvoja vláda sa rozprestiera na všetky pokolenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán je vo všetkých svojich slovách pravdivý <font color='#B71C1C'>*</font><br>" +
                            "a svätý vo všetkých svojich skutkoch.<br>" +
                            "Pán podopiera všetkých, čo klesajú, <font color='#B71C1C'>*</font><br>" +
                            "a dvíha všetkých skľúčených.<font color='#B71C1C'> – R.</font>"},
            {"22", "3", "1", "Ž 52, 10. 11",
                    "<font color='#B71C1C'>R.:</font> V tvoje milosrdenstvo, Pane, úfam naveky.<br><br>" +
                            "Ja som ako zelená oliva v Božom dome. <font color='#B71C1C'>†</font><br>" +
                            "Úfam v Božie milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "navždy a naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Ustavične ťa chcem velebiť za to, čo si urobil, <font color='#B71C1C'>†</font><br>" +
                            "a s tvojimi svätými sa chcem spoliehať <font color='#B71C1C'>*</font><br>" +
                            "na tvoje meno, lebo je dobré.<font color='#B71C1C'> – R.</font>"},
            {"22", "3", "2", "Ž 33, 12-13. 14-15. 20-21",
                    "<font color='#B71C1C'>R.:</font> Blažený ľud, ktorý si Pán vyvolil za dedičstvo.<br><br>" +
                            "Blažený národ, ktorého Bohom je Pán, <font color='#B71C1C'>*</font><br>" +
                            "blažený ľud, ktorý si on vyvolil za dedičstvo.<br>" +
                            "Pán hľadí z neba <font color='#B71C1C'>*</font><br>" +
                            "a vidí všetkých ľudí.<font color='#B71C1C'> – R.</font><br>" +
                            "Pozerá z miesta, kde prebýva, <font color='#B71C1C'>*</font><br>" +
                            "na všetkých obyvateľov zeme,<br>" +
                            "on, čo každému osve utvoril srdce <font color='#B71C1C'>*</font><br>" +
                            "a chápe všetky ich skutky.<font color='#B71C1C'> – R.</font><br>" +
                            "Naša duša očakáva Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je naša pomoc a ochrana.<br>" +
                            "V ňom sa naše srdce raduje <font color='#B71C1C'>*</font><br>" +
                            "a v jeho sväté meno máme dôveru.<font color='#B71C1C'> – R.</font>"},
            {"22", "4", "1", "Ž 98, 2-3b. 3c-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Uzreli všetky končiny zeme spásu nášho Boha.<br><br>" +
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
            {"22", "4", "2", "Ž 24, 1-2. 3-4b. 5-6",
                    "<font color='#B71C1C'>R.:</font> Pánova je zem i všetko, čo ju napĺňa.<br><br>" +
                            "Pánova je zem i všetko, čo ju napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "okruh zeme aj tí, čo bývajú na ňom.<br>" +
                            "Veď on sám položil jeho základy na moriach <font color='#B71C1C'>*</font><br>" +
                            "a upevnil ho na vodách.<font color='#B71C1C'> – R.</font><br>" +
                            "Kto smie vystúpiť na vrch Pánov, <font color='#B71C1C'>*</font><br>" +
                            "kto smie stáť na jeho mieste posvätnom?<br>" +
                            "Ten, čo má ruky nevinné a srdce čisté, <font color='#B71C1C'>*</font><br>" +
                            "čo nedvíha svoju dušu k márnosti.<font color='#B71C1C'> – R.</font><br>" +
                            "Taký dostane požehnanie od Pána <font color='#B71C1C'>*</font><br>" +
                            "a odmenu od Boha, svojho spasiteľa.<br>" +
                            "To je pokolenie tých, čo ho hľadajú, <font color='#B71C1C'>*</font><br>" +
                            "čo hľadajú tvár Boha Jakubovho.<font color='#B71C1C'> – R.</font>"},
            {"22", "5", "1", "Ž 100, 2. 3. 4. 5",
                    "<font color='#B71C1C'>R.:</font> S plesaním vstupujte pred tvár nášho Pána.<br><br>" +
                            "Jasaj na chválu Pánovi, celá zem, <font color='#B71C1C'>†</font><br>" +
                            "s radosťou slúžte Pánovi. <font color='#B71C1C'>*</font><br>" +
                            "S plesaním vstupujte pred jeho tvár.<font color='#B71C1C'> – R.</font><br>" +
                            "Vedzte, že náš Pán je Boh; <font color='#B71C1C'>†</font><br>" +
                            "on je náš stvoriteľ a jemu patríme, <font color='#B71C1C'>*</font><br>" +
                            "sme jeho ľud a ovce z jeho stáda.<font color='#B71C1C'> – R.</font><br>" +
                            "Vstupujte do jeho brán s piesňou chvály <font color='#B71C1C'>†</font><br>" +
                            "a do jeho nádvorí s piesňami oslavnými; <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho a velebte jeho meno.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán je dobrý; <font color='#B71C1C'>†</font><br>" +
                            "jeho milosrdenstvo trvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho vernosť z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"22", "5", "2", "Ž 37, 3-4. 5-6. 27-28b. 39-40",
                    "<font color='#B71C1C'>R.:</font> Spása spravodlivých prichádza od Pána.<br><br>" +
                            "Spoľahni sa na Pána a dobre rob <font color='#B71C1C'>*</font><br>" +
                            "a budeš bývať v svojej krajine a tešiť sa z bezpečia.<br>" +
                            "Hľadaj radosť v Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a dá ti, za čím túži tvoje srdce.<font color='#B71C1C'> – R.</font><br>" +
                            "Pánovi zver svoje cesty a jemu dôveruj, <font color='#B71C1C'>*</font><br>" +
                            "on sa už postará.<br>" +
                            "Tvoju spravodlivosť vyvedie na povrch ako svetlo <font color='#B71C1C'>*</font><br>" +
                            "a tvoje právo ako poludňajší jas.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyhýbaj zlu a dobre rob <font color='#B71C1C'>*</font><br>" +
                            "a budeš mať domov naveky.<br>" +
                            "Lebo Pán miluje spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a neopúšťa svojich svätých.<font color='#B71C1C'> – R.</font><br>" +
                            "Spása spravodlivých prichádza od Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je ich ochrancom v čase súženia.<br>" +
                            "Pán im pomôže a oslobodí ich, <font color='#B71C1C'>†</font><br>" +
                            "vytrhne ich z rúk hriešnikov a zachráni ich, <font color='#B71C1C'>*</font><br>" +
                            "lebo sa spoliehajú na neho.<font color='#B71C1C'> – R.</font>"},
            {"22", "6", "1", "Ž 54, 3-4. 6+8",
                    "<font color='#B71C1C'>R.:</font> Pán mi pomáha a udržiava môj život.<br><br>" +
                            "Pane, zachráň ma pre svoje meno <font color='#B71C1C'>*</font><br>" +
                            "a svojou mocou obráň moje právo.<br>" +
                            "Bože, vyslyš moju modlitbu <font color='#B71C1C'>*</font><br>" +
                            "a vypočuj slová mojich úst.<font color='#B71C1C'> – R.</font><br>" +
                            "Mne Boh pomáha <font color='#B71C1C'>*</font><br>" +
                            "a môj život udržiava Pán.<br>" +
                            "S radosťou ti prinesiem obetu; <font color='#B71C1C'>*</font><br>" +
                            "meno tvoje, Pane, budem velebiť, lebo si dobrý.<font color='#B71C1C'> – R.</font>"},
            {"22", "6", "2", "Ž 145, 17-18. 19-20. 21",
                    "<font color='#B71C1C'>R.:</font> Blízky je Pán všetkým, čo ho vzývajú.<br><br>" +
                            "Spravodlivý je Pán na všetkých svojich cestách <font color='#B71C1C'>*</font><br>" +
                            "a svätý vo všetkých svojich skutkoch.<br>" +
                            "Blízky je Pán všetkým, čo ho vzývajú, <font color='#B71C1C'>*</font><br>" +
                            "všetkým, čo ho vzývajú úprimne.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyplní želanie bohabojných, <font color='#B71C1C'>*</font><br>" +
                            "vyslyší ich modlitbu a zachráni ich.<br>" +
                            "Pán ochraňuje všetkých, čo ho milujú, <font color='#B71C1C'>*</font><br>" +
                            "a ničí všetkých hriešnikov.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech moje ústa hlásajú slávu Pánovu <font color='#B71C1C'>†</font><br>" +
                            "a všetko živé nech jeho sväté meno velebí <font color='#B71C1C'>*</font><br>" +
                            "navždy a naveky.<font color='#B71C1C'> – R.</font>"},
            {"23", "A", "", "Ž 95, 1-2. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pane, daj, aby sme počúvali tvoj hlas a nezatvrdzovali si srdcia.<br><br>" +
                            "Poďte, plesajme v Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "oslavujme Boha, našu spásu.<br>" +
                            "Predstúpme s chválospevmi pred jeho tvár <font color='#B71C1C'>*</font><br>" +
                            "a oslavujme ho žalmami.<font color='#B71C1C'> – R.</font><br>" +
                            "Poďte, klaňajme sa a na zem padnime, <font color='#B71C1C'>*</font><br>" +
                            "kľaknime na kolená pred Pánom, ktorý nás stvoril.<br>" +
                            "Lebo on je náš Boh <font color='#B71C1C'>†</font><br>" +
                            "a my sme ľud jeho pastviny <font color='#B71C1C'>*</font><br>" +
                            "a ovce, ktoré vedie svojou rukou.<font color='#B71C1C'> – R.</font><br>" +
                            "Čujte dnes jeho hlas: <font color='#B71C1C'>*</font><br>" +
                            "\"Nezatvrdzujte svoje srdcia<br>" +
                            "ako v Meríbe, ako v dňoch Massy na púšti, <font color='#B71C1C'>†</font><br>" +
                            "kde ma pokúšali vaši otcovia; <font color='#B71C1C'>*</font><br>" +
                            "skúšali ma, hoci moje skutky videli.\"<font color='#B71C1C'> – R.</font>"},
            {"23", "B", "", "Ž 146, 6c-7. 8-9a. 9b-10",
                    "<font color='#B71C1C'>R.:</font> Chváľ, duša moja, Pána cez celý môj život.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Pán zachováva vernosť naveky, <font color='#B71C1C'>*</font> <br>" +
                            "utláčaným prisudzuje právo, <br>" +
                            "hladujúcim dáva chlieb. <font color='#B71C1C'>*</font> <br>" +
                            "Pán vyslobodzuje väzňov,<font color='#B71C1C'> – R.</font> <br>" +
                            "Pán otvára oči slepým, <font color='#B71C1C'>*</font> <br>" +
                            "Pán dvíha skľúčených, <br>" +
                            "Pán miluje spravodlivých. <font color='#B71C1C'>*</font> <br>" +
                            "Pán ochraňuje cudzincov,<font color='#B71C1C'> – R.</font> <br>" +
                            "ujíma sa siroty a vdovy, <font color='#B71C1C'>*</font> <br>" +
                            "ale hatí cesty hriešnikov. <br>" +
                            "Pán bude kraľovať naveky; <font color='#B71C1C'>*</font> <br>" +
                            "tvoj Boh, Sion, z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"23", "C", "", "Ž 90, 3-4. 5-6. 12-13. 14+17",
                    "<font color='#B71C1C'>R.:</font> Pane, stal si sa nám útočišťom z pokolenia na pokolenie.<br><br>" +
                            "Človeka vraciaš do prachu <font color='#B71C1C'>*</font><br>" +
                            "a hovoríš: \"Vráťte sa, synovia človeka!\"<br>" +
                            "Veď tisíc rokov je u teba ako deň včerajší, čo sa pominul, <font color='#B71C1C'>*</font><br>" +
                            "a ako jedna nočná stráž.<font color='#B71C1C'> – R.</font><br>" +
                            "Uchvacuješ ich: sú ako ranný sen; <font color='#B71C1C'>*</font><br>" +
                            "sú ako bylina v rozpuku:<br>" +
                            "ráno kvitne a rastie, <font color='#B71C1C'>*</font><br>" +
                            "večer vädne a usychá.<font color='#B71C1C'> – R.</font><br>" +
                            "Nauč nás rátať naše dni, <font color='#B71C1C'>*</font><br>" +
                            "aby sme našli múdrosť srdca.<br>" +
                            "Obráť sa k nám, Pane; dokedy budeš meškať? <font color='#B71C1C'>*</font><br>" +
                            "Zľutuj sa nad svojimi služobníkmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Hneď zrána nás naplň svojou milosťou <font color='#B71C1C'>*</font><br>" +
                            "a budeme jasať a radovať sa po všetky dni života.<br>" +
                            "Nech je nad nami dobrotivosť Pána, nášho Boha; <font color='#B71C1C'>†</font><br>" +
                            "upevňuj dielo našich rúk, <font color='#B71C1C'>*</font><br>" +
                            "dielo našich rúk upevňuj!<font color='#B71C1C'> – R.</font>"},
            {"23", "1", "1", "Ž 62, 6-7. 9",
                    "<font color='#B71C1C'>R.:</font> V Bohu je moja spása i moja sláva.<br><br>" +
                            "Iba v Bohu spočiň, duša moja, <font color='#B71C1C'>*</font><br>" +
                            "lebo len on mi dáva nádej.<br>" +
                            "Iba on je moje útočište a moja spása, <font color='#B71C1C'>*</font><br>" +
                            "moja opora, nezakolíšem sa.<font color='#B71C1C'> – R.</font><br>" +
                            "Dúfajte v neho, ľudia, v každom čase, <font color='#B71C1C'>†</font><br>" +
                            "pred ním si srdce otvorte; <font color='#B71C1C'>*</font><br>" +
                            "Boh je naše útočište.<font color='#B71C1C'> – R.</font>"},
            {"23", "1", "2", "Ž 5, 5-6. 7. 12",
                    "<font color='#B71C1C'>R.:</font> Pane, veď ma vo svojej spravodlivosti.<br><br>" +
                            "Ty nie si Boh, ktorému by sa páčila neprávosť, <font color='#B71C1C'>†</font><br>" +
                            "zlý človek nepobudne pri tebe, <font color='#B71C1C'>*</font><br>" +
                            "ani nespravodliví neobstoja pred tvojím pohľadom.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty nenávidíš všetkých, čo páchajú neprávosť, <font color='#B71C1C'>†</font><br>" +
                            "ničíš všetkých, čo hovoria klamstvá. <font color='#B71C1C'>*</font><br>" +
                            "Od vraha a podvodníka sa odvracia Pán s odporom.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa tešia všetci, čo majú v teba dôveru, <font color='#B71C1C'>*</font><br>" +
                            "a naveky nech jasajú.<br>" +
                            "Chráň ich a nech sa radujú v tebe, <font color='#B71C1C'>*</font><br>" +
                            "čo tvoje meno milujú.<font color='#B71C1C'> – R.</font>"},
            {"23", "2", "1", "Ž 145, 1-2. 8-9. 10-11",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Oslavovať ťa chcem, Bože, môj kráľ, <font color='#B71C1C'>*</font><br>" +
                            "a tvoje meno velebiť navždy a naveky.<br>" +
                            "Budem ťa velebiť každý deň <font color='#B71C1C'>*</font><br>" +
                            "a tvoje meno chváliť navždy a naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a veľmi láskavý.<br>" +
                            "Dobrý je Pán ku každému <font color='#B71C1C'>*</font><br>" +
                            "a milostivý ku všetkým svojim stvoreniam.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech ťa oslavujú, Pane, všetky tvoje diela <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech ťa velebia.<br>" +
                            "Nech rozprávajú o sláve tvojho kráľovstva <font color='#B71C1C'>*</font><br>" +
                            "a o tvojej moci nech hovoria.<font color='#B71C1C'> – R.</font>"},
            {"23", "2", "2", "Ž 149, 1-2. 3-4. 5-6a+9b",
                    "<font color='#B71C1C'>R.:</font> Pán, Boh, miluje svoj ľud.<br><br>" +
                            "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>*</font> <br>" +
                            "jeho chvála nech znie v zhromaždení svätých.<br>" +
                            "Nech sa teší Izrael zo svojho Stvoriteľa, <font color='#B71C1C'>*</font><br>" +
                            "synovia Siona nech jasajú nad svojím kráľom.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech oslavujú jeho meno tancom, <font color='#B71C1C'>*</font><br>" +
                            "nech mu hrajú na bubne a na citare.<br>" +
                            "Lebo Pán miluje svoj ľud <font color='#B71C1C'>*</font><br>" +
                            "a tichých venčí víťazstvom.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech svätí jasajú v sláve, <font color='#B71C1C'>*</font><br>" +
                            "nech sa veselia na svojich lôžkach.<br>" +
                            "Oslavu Boha nech majú na perách; <font color='#B71C1C'>*</font><br>" +
                            "všetkým jeho svätým to bude na slávu.<font color='#B71C1C'> – R.</font>"},
            {"23", "3", "1", "Ž 145, 2-3. 10-11. 12-13b",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Budem ťa velebiť každý deň <font color='#B71C1C'>*</font><br>" +
                            "a tvoje meno chváliť navždy a naveky.<br>" +
                            "Veľký si, Pane, a veľkej chvály hoden, <font color='#B71C1C'>*</font><br>" +
                            "tvoju veľkosť nemožno preskúmať.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech ťa oslavujú, Pane, všetky tvoje diela <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech ťa velebia.<br>" +
                            "Nech rozprávajú o sláve tvojho kráľovstva <font color='#B71C1C'>*</font><br>" +
                            "a o tvojej moci nech hovoria;<font color='#B71C1C'> – R.</font><br>" +
                            "nech ľuďom oznamujú tvoje zázraky <font color='#B71C1C'>*</font><br>" +
                            "i slávu a velebu tvojho kráľovstva.<br>" +
                            "Tvoje kráľovstvo je kráľovstvo pre všetky veky <font color='#B71C1C'>*</font><br>" +
                            "a tvoja vláda sa rozprestiera na všetky pokolenia.<font color='#B71C1C'> – R.</font>"},
            {"23", "3", "2", "Ž 45, 11-12. 14-15. 16-17",
                    "<font color='#B71C1C'>R.:</font> Čuj, dcéra, a pozoruj a nakloň svoj sluch.<br><br>" +
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
            {"23", "4", "1", "Ž 150, 1-2. 3-4. 5",
                    "<font color='#B71C1C'>R.:</font> Všetko, čo dýcha, nech chváli Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľte Pána v jeho svätyni, <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho na jeho vznešenej oblohe.<br>" +
                            "Chváľte ho za jeho činy mohutné, <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho za jeho nesmiernu velebnosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Chváľte ho zvukom poľnice, <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho harfou a citarou.<br>" +
                            "Chváľte ho bubnom a tancom, <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho lýrou a flautou.<font color='#B71C1C'> – R.</font><br>" +
                            "Chváľte ho ľubozvučnými cimbalmi, <font color='#B71C1C'>†</font><br>" +
                            "chváľte ho jasavými cimbalmi; <font color='#B71C1C'>*</font><br>" +
                            "všetko, čo dýcha, nech chváli Pána.<font color='#B71C1C'> – R.</font>"},
            {"23", "4", "2", "Ž 139, 1-3. 13-14b. 23-24",
                    "<font color='#B71C1C'>R.:</font> Veď ma, Pane, po ceste k večnosti.<br><br>" +
                            "Pane, ty ma skúmaš a vieš o mne všetko; <font color='#B71C1C'>*</font><br>" +
                            "ty vieš, či sedím a či stojím.<br>" +
                            "Už zďaleka vnímaš moje myšlienky: <font color='#B71C1C'>†</font><br>" +
                            "či kráčam a či odpočívam, ty ma sleduješ. <font color='#B71C1C'>*</font><br>" +
                            "A všetky moje cesty sú ti známe.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď ty si stvoril moje útroby, <font color='#B71C1C'>*</font><br>" +
                            "utkal si ma v živote mojej matky.<br>" +
                            "Chválim ťa, že si ma utvoril tak zázračne; <font color='#B71C1C'>*</font><br>" +
                            "všetky tvoje diela sú hodny obdivu.<font color='#B71C1C'> – R.</font><br>" +
                            "Skúmaj ma, Bože, a poznaj moje srdce; <font color='#B71C1C'>*</font><br>" +
                            "skúmaj ma a všímaj si moje cesty.<br>" +
                            "Pozri, či nejdem bludnou cestou, <font color='#B71C1C'>*</font><br>" +
                            "a veď ma po ceste k večnosti.<font color='#B71C1C'> – R.</font>"},
            {"23", "5", "1", "Ž 16, 1-2a+5. 7-8. 11",
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
            {"23", "5", "2", "Ž 84, 3. 4. 5-6. 12",
                    "<font color='#B71C1C'>R.:</font> Aké milé sú tvoje chrámy. Pane.<br><br>" +
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
                            "Blažený človek, ktorému ty pomáhaš, <font color='#B71C1C'>*</font><br>" +
                            "keď sa chystá na svätú púť.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán, Boh, je slnko a štít, <font color='#B71C1C'>*</font><br>" +
                            "milosť a slávu udeľuje Pán;<br>" +
                            "neodoprie dobro tým, <font color='#B71C1C'>*</font><br>" +
                            "čo kráčajú v nevinnosti.<font color='#B71C1C'> – R.</font>"},
            {"23", "6", "1", "Ž 113, 1-2. 3-4. 5a+6-7",
                    "<font color='#B71C1C'>R.:</font> Nech je zvelebené meno Pánovo odteraz až naveky.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľte, služobníci Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "chváľte meno Pánovo.<br>" +
                            "Nech je velebené meno Pánovo <font color='#B71C1C'>*</font><br>" +
                            "odteraz až naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Od východu slnka až po západ <font color='#B71C1C'>*</font><br>" +
                            "nech je oslávené meno Pánovo.<br>" +
                            "Vyvýšený je Pán nad všetky národy <font color='#B71C1C'>*</font><br>" +
                            "a jeho sláva nad nebesia.<font color='#B71C1C'> – R.</font><br>" +
                            "Kto je ako Pán, náš Boh, <font color='#B71C1C'>†</font><br>" +
                            "čo dbá o všetko nepatrné <font color='#B71C1C'>*</font><br>" +
                            "na nebi i na zemi?<br>" +
                            "Z prachu dvíha chudobného <font color='#B71C1C'>*</font><br>" +
                            "a zo smetiska povyšuje bedára.<font color='#B71C1C'> – R.</font>"},
            {"23", "6", "2", "Ž 116, 12-13. 17-18",
                    "<font color='#B71C1C'>R.:</font> Obetu chvály ti, Pane, prinesiem.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Čím sa odvďačím Pánovi <font color='#B71C1C'>*</font><br>" +
                            "za všetko, čo mi dal?<br>" +
                            "Vezmem kalich spásy <font color='#B71C1C'>*</font><br>" +
                            "a budem vzývať meno Pánovo.<font color='#B71C1C'> – R.</font><br>" +
                            "Obetu chvály ti prinesiem <font color='#B71C1C'>*</font><br>" +
                            "a budem vzývať meno Pánovo.<br>" +
                            "Splním svoje sľuby Pánovi <font color='#B71C1C'>*</font><br>" +
                            "pred všetkým jeho ľudom.<font color='#B71C1C'> – R.</font>"},
            {"24", "A", "", "Ž 103, 1-2. 3-4. 9-10. 11-12",
                    "<font color='#B71C1C'>R.:</font> Milostivý a milosrdný je Pán.<br><br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a celé moje vnútro jeho menu svätému.<br>" +
                            "Dobroreč, duša moja, Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a nezabúdaj na jeho dobrodenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď on ti odpúšťa všetky neprávosti, <font color='#B71C1C'>*</font><br>" +
                            "on lieči všetky tvoje neduhy;<br>" +
                            "on vykupuje tvoj život zo záhuby, <font color='#B71C1C'>*</font><br>" +
                            "on ťa venčí milosrdenstvom a milosťou.<font color='#B71C1C'> – R.</font><br>" +
                            "Nevyčíta nám ustavične naše chyby, <font color='#B71C1C'>*</font><br>" +
                            "ani sa nehnevá naveky.<br>" +
                            "Nezaobchodí s nami podľa našich hriechov, <font color='#B71C1C'>*</font><br>" +
                            "ani nám neodpláca podľa našich neprávostí.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo ako vysoko je nebo od zeme, <font color='#B71C1C'>*</font><br>" +
                            "také veľké je jeho zľutovanie voči tým, čo sa ho boja.<br>" +
                            "Ako je vzdialený východ od západu, <font color='#B71C1C'>*</font><br>" +
                            "tak vzďaľuje od nás našu neprávosť.<font color='#B71C1C'> – R.</font>"},
            {"24", "B", "", "Ž 116, 1-2. 3-4. 5-6. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pred tvárou Pána budem kráčať v krajine žijúcich.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Milujem Pána, lebo vypočul <font color='#B71C1C'>*</font><br>" +
                            "môj prosebný hlas,<br>" +
                            "lebo svoj sluch naklonil ku mne, <font color='#B71C1C'>*</font><br>" +
                            "kedykoľvek som ho vzýval.<font color='#B71C1C'> – R.</font><br>" +
                            "Keď ma omotali povrazy smrti <font color='#B71C1C'>*</font><br>" +
                            "a zmocnili sa ma úzkosti podsvetia,<br>" +
                            "keď som sa ocitol v súžení a trápení, <font color='#B71C1C'>†</font><br>" +
                            "vzýval som meno Pánovo: <font color='#B71C1C'>*</font><br>" +
                            "\"Pane, zachráň môj život!\"<font color='#B71C1C'> – R.</font><br>" +
                            "Milostivý a spravodlivý je Pán, <font color='#B71C1C'>*</font><br>" +
                            "náš Boh sa zľutúva.<br>" +
                            "Pán ochraňuje maličkých; <font color='#B71C1C'>*</font><br>" +
                            "pomohol mi, keď som bol v biede.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo môj život zachránil od smrti, <font color='#B71C1C'>†</font><br>" +
                            "moje oči od sĺz <font color='#B71C1C'>*</font><br>" +
                            "a moje nohy pred pádom.<br>" +
                            "Pred tvárou Pána budem kráčať <font color='#B71C1C'>*</font><br>" +
                            "v krajine žijúcich.<font color='#B71C1C'> – R.</font>"},
            {"24", "C", "", "Ž 51, 3-4. 12-13. 17+19",
                    "<font color='#B71C1C'>R.:</font> Vstanem a pôjdem k svojmu Otcovi.<br><br>" +
                            "Zmiluj sa, Bože, nado mnou pre svoje milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje veľké zľutovanie znič moju neprávosť.<br>" +
                            "Úplne zmy zo mňa moju vinu <font color='#B71C1C'>*</font><br>" +
                            "a očisť ma od hriechu.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože, stvor vo mne srdce čisté <font color='#B71C1C'>*</font><br>" +
                            "a v mojom vnútri obnov ducha pevného.<br>" +
                            "Neodvrhuj ma spred svojej tváre <font color='#B71C1C'>*</font><br>" +
                            "a neodnímaj mi svojho ducha svätého.<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, otvor moje pery <font color='#B71C1C'>*</font><br>" +
                            "a moje ústa budú ohlasovať tvoju slávu.<br>" +
                            "Obetou Bohu milou je duch skrúšený; <font color='#B71C1C'>*</font><br>" +
                            "Bože, ty nepohŕdaš srdcom skrúšeným a poníženým.<font color='#B71C1C'> – R.</font>"},
            {"24", "1", "1", "Ž 28, 2. 7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Nech je velebený Pán, že vyslyšal moju prosbu.<br><br>" +
                            "Čuj moju úpenlivú prosbu, keď volám k tebe <font color='#B71C1C'>*</font><br>" +
                            "a spínam ruky k tvojmu svätému chrámu.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán je moja pomoc a môj ochranca. <font color='#B71C1C'>*</font><br>" +
                            "V neho dúfalo moje srdce a prišla mi pomoc;<br>" +
                            "zaplesalo moje srdce <font color='#B71C1C'>*</font><br>" +
                            "a za to mu spevom ďakujem.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán je sila svojho ľudu <font color='#B71C1C'>*</font><br>" +
                            "a útočište spásy pre svojho pomazaného.<br>" +
                            "Spas svoj ľud a požehnaj svojich dedičov <font color='#B71C1C'>*</font><br>" +
                            "a spravuj ich a dvíhaj ich až naveky.<font color='#B71C1C'> – R.</font>"},
            {"24", "1", "2", "Ž 40, 7-8a. 8b-9. 10. 17",
                    "<font color='#B71C1C'>R.:</font> Zvelebujeme Pánovu smrť, kým nepríde k sláve.<br><br>" +
                            "Obety a dary si nepraješ, <font color='#B71C1C'>*</font><br>" +
                            "lež uši si mi otvoril.<br>" +
                            "Nežiadaš žertvu ani obetu zmierenia, <font color='#B71C1C'>*</font><br>" +
                            "preto som povedal: \"Hľa, prichádzam.<font color='#B71C1C'> – R.</font><br>" +
                            "Vo zvitku knihy je napísané o mne, <font color='#B71C1C'>*</font><br>" +
                            "že mám plniť tvoju vôľu.<br>" +
                            "A to chcem, Bože môj, <font color='#B71C1C'>*</font><br>" +
                            "hlboko v srdci mám tvoj zákon.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Ohlasujem tvoju spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "vo veľkom zhromaždení;<br>" +
                            "svojim perám hovoriť nebránim, <font color='#B71C1C'>*</font><br>" +
                            "Pane, ty to vieš.<font color='#B71C1C'> – R.</font><br>" +
                            "No nech jasajú a nech sa v tebe tešia všetci, <font color='#B71C1C'>*</font><br>" +
                            "čo ťa hľadajú.<br>" +
                            "A tí, čo túžia po tvojej pomoci, nech stále hovoria: <font color='#B71C1C'>*</font><br>" +
                            "\"Nech je zvelebený Pán!\"<font color='#B71C1C'> – R.</font>"},
            {"24", "2", "1", "Ž 101, 1-2b. 2c-3b. 5. 6",
                    "<font color='#B71C1C'>R.:</font> Ja chcem kráčať v nevinnosti srdca.<br><br>" +
                            "Milosrdenstvo a spravodlivosť chcem ospievať, <font color='#B71C1C'>*</font><br>" +
                            "zahrať ti, Pane, na harfe.<br>" +
                            "Múdro a bez úhony chcem kráčať cestou života; <font color='#B71C1C'>*</font><br>" +
                            "kedyže prídeš ku mne?<font color='#B71C1C'> – R.</font><br>" +
                            "Chcem kráčať v nevinnosti srdca <font color='#B71C1C'>*</font><br>" +
                            "uprostred svojej čeľade.<br>" +
                            "Nesprávne predsavzatia si nerobím, <font color='#B71C1C'>*</font><br>" +
                            "podvodníka mám v nenávisti.<font color='#B71C1C'> – R.</font><br>" +
                            "Kto tajnostkársky ohovára blížneho, <font color='#B71C1C'>*</font><br>" +
                            "toho umlčím.<br>" +
                            "Kto má oko pyšné a srdce naduté, <font color='#B71C1C'>*</font><br>" +
                            "toho neznesiem.<font color='#B71C1C'> – R.</font><br>" +
                            "Moje oči hľadajú verných v krajine, <font color='#B71C1C'>*</font><br>" +
                            "aby prebývali so mnou.<br>" +
                            "Kto kráča cestou poctivou, <font color='#B71C1C'>*</font><br>" +
                            "ten mi smie slúžiť.<font color='#B71C1C'> – R.</font>"},
            {"24", "2", "2", "Ž 100, 2. 3. 4. 5",
                    "<font color='#B71C1C'>R.:</font> Sme jeho ľud a ovce z jeho stáda.<br><br>" +
                            "Jasaj na chválu Pánovi, celá zem, <font color='#B71C1C'>†</font><br>" +
                            "s radosťou slúžte Pánovi. <font color='#B71C1C'>*</font><br>" +
                            "S plesaním vstupujte pred jeho tvár.<font color='#B71C1C'> – R.</font><br>" +
                            "Vedzte, že náš Pán je Boh; <font color='#B71C1C'>†</font><br>" +
                            "on je náš stvoriteľ a jemu patríme, <font color='#B71C1C'>*</font><br>" +
                            "sme jeho ľud a ovce z jeho stáda.<font color='#B71C1C'> – R.</font><br>" +
                            "Vstupujte do jeho brán s piesňou chvály <font color='#B71C1C'>†</font><br>" +
                            "a do jeho nádvorí s piesňami oslavnými; <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho a velebte jeho meno.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán je dobrý; <font color='#B71C1C'>†</font><br>" +
                            "jeho milosrdenstvo trvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho vernosť z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"24", "3", "1", "Ž 111, 1-2. 3-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Veľké je tajomstvo tvojej lásky, Pane.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Z celého srdca chcem oslavovať Pána <font color='#B71C1C'>*</font><br>" +
                            "v zbore spravodlivých i v zhromaždení.<br>" +
                            "Veľké sú diela Pánove; <font color='#B71C1C'>*</font><br>" +
                            "nech ich skúmajú všetci, čo majú v nich záľubu.<font color='#B71C1C'> – R.</font><br>" +
                            "Nádherné a vznešené sú jeho diela, <font color='#B71C1C'>*</font><br>" +
                            "jeho spravodlivosť platí naveky.<br>" +
                            "Ustanovil pamiatku na svoje obdivuhodné skutky; <font color='#B71C1C'>*</font><br>" +
                            "Pán je milosrdný a milostivý.<font color='#B71C1C'> – R.</font><br>" +
                            "Pokrm dal tým, čo sa ho boja; <font color='#B71C1C'>*</font><br>" +
                            "svoju zmluvu má stále na mysli.<br>" +
                            "Svoje mocné skutky oznámil svojmu ľudu <font color='#B71C1C'>*</font><br>" +
                            "a dal im dedičstvo pohanov.<font color='#B71C1C'> – R.</font>"},
            {"24", "3", "2", "Ž 33, 2-3. 4-5. 12+22",
                    "<font color='#B71C1C'>R.:</font> Blažený ľud, ktorý si Pán vyvolil za dedičstvo.<br><br>" +
                            "Oslavujte Pána citarou, <font color='#B71C1C'>*</font><br>" +
                            "hrajte mu na desaťstrunovej lutne.<br>" +
                            "Spievajte mu novú pieseň, <font color='#B71C1C'>*</font><br>" +
                            "nadšene mu hrajte a volajte na slávu.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pánovo slovo je pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a verné všetko jeho konanie.<br>" +
                            "Miluje spravodlivosť a právo; <font color='#B71C1C'>*</font><br>" +
                            "milosti Pánovej plná je zem.<font color='#B71C1C'> – R.</font><br>" +
                            "Blažený národ, ktorého Bohom je Pán, <font color='#B71C1C'>*</font><br>" +
                            "blažený ľud, ktorý si on vyvolil za dedičstvo.<br>" +
                            "Tvoje milosrdenstvo, Pane, nech je nad nami, <font color='#B71C1C'>*</font><br>" +
                            "ako dúfame v teba.<font color='#B71C1C'> – R.</font>"},
            {"24", "4", "1", "Ž 111, 7-8. 9. 10",
                    "<font color='#B71C1C'>R.:</font> Veľké je tajomstvo tvojej lásky, Pane.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Pravdivé a spravodlivé sú diela jeho rúk. <font color='#B71C1C'>*</font><br>" +
                            "Nezrušiteľné sú všetky jeho príkazy,<br>" +
                            "upevnené naveky, <font color='#B71C1C'>*</font><br>" +
                            "založené na pravde a spravodlivosti.<font color='#B71C1C'> – R.</font><br>" +
                            "Vykúpenie poslal svojmu ľudu, <font color='#B71C1C'>†</font><br>" +
                            "zmluvu uzavrel naveky. <font color='#B71C1C'>*</font><br>" +
                            "Jeho meno je sväté a vzbudzuje hrôzu;<font color='#B71C1C'> – R.</font><br>" +
                            "bohabojnosť je počiatok múdrosti <font color='#B71C1C'>†</font><br>" +
                            "a múdro robia všetci, čo ju pestujú; <font color='#B71C1C'>*</font><br>" +
                            "jeho chvála ostáva naveky.<font color='#B71C1C'> – R.</font>"},
            {"24", "4", "2", "Ž 118, 1-2. 16ab+17. 28",
                    "<font color='#B71C1C'>R.:</font> Oslavujme Pána, lebo je dobrý, lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "Teraz nech hovorí Izrael, že Pán je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "že jeho milosrdenstvo trvá naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "\"Pánova pravica mocne zasiahla, <font color='#B71C1C'>*</font><br>" +
                            "Pánova pravica ma zdvihla.\"<br>" +
                            "Ja nezomriem, budem žiť <font color='#B71C1C'>*</font><br>" +
                            "a vyrozprávam skutky Pánove.<font color='#B71C1C'> – R.</font><br>" +
                            "Ty si môj Boh, vďaky ti vzdávam; <font color='#B71C1C'>*</font><br>" +
                            "ty si môj Boh, velebím ťa.<font color='#B71C1C'> – R.</font>"},
            {"24", "5", "1", "Ž 49, 6-7. 8-10. 17-18. 19-20",
                    "<font color='#B71C1C'>R.:</font> Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo.<br><br>" +
                            "Prečo by som sa mal strachovať v dňoch nešťastných, <font color='#B71C1C'>*</font><br>" +
                            "keď ma obkľučuje zloba tých, čo mi chcú nohy podraziť?<br>" +
                            "Pred tými, čo sa spoliehajú na svoju silu <font color='#B71C1C'>*</font><br>" +
                            "a chvastajú sa nadmerným bohatstvom?<font color='#B71C1C'> – R.</font><br>" +
                            "Veď sám seba nevykúpi nik, <font color='#B71C1C'>*</font><br>" +
                            "ani nezaplatí Bohu výkupné za seba.<br>" +
                            "Cena za vykúpenie života je príliš vysoká; <font color='#B71C1C'>†</font><br>" +
                            "nikdy nebude stačiť, <font color='#B71C1C'>*</font><br>" +
                            "aby človek žil naveky a zánik neuzrel.<font color='#B71C1C'> – R.</font><br>" +
                            "Netráp sa, ak niekto bohatne <font color='#B71C1C'>*</font><br>" +
                            "a ak sa poklad jeho domu zväčšuje.<br>" +
                            "Lebo keď zomrie, nič si nevezme so sebou, <font color='#B71C1C'>*</font><br>" +
                            "jeho poklad s ním nepôjde.<font color='#B71C1C'> – R.</font><br>" +
                            "Aj keď si blahoželal za živa: <font color='#B71C1C'>*</font><br>" +
                            "\"Budú ťa chváliť, že si si dobre počínal,\"<br>" +
                            "predsa k pokoleniu svojich otcov musí zostúpiť <font color='#B71C1C'>*</font><br>" +
                            "a tí už nikdy svetlo neuzrú.<font color='#B71C1C'> – R.</font>"},
            {"24", "5", "2", "Ž 17, 1. 6-7. 8+15",
                    "<font color='#B71C1C'>R.:</font> Až raz vstanem zo sna, uzriem tvoju tvár, Pane.<br><br>" +
                            "Vypočuj, Pane, moju spravodlivú žiadosť, <font color='#B71C1C'>*</font><br>" +
                            "všimni si moju prosbu pokornú.<br>" +
                            "Nakloň sluch k mojej modlitbe, <font color='#B71C1C'>*</font><br>" +
                            "čo plynie z perí úprimných.<font color='#B71C1C'> – R.</font><br>" +
                            "K tebe, Bože, volám, lebo ty ma vyslyšíš. <font color='#B71C1C'>*</font><br>" +
                            "Nakloň ku mne sluch a vypočuj moje slová.<br>" +
                            "Ukáž svoje predivné milosrdenstvo, <font color='#B71C1C'>*</font><br>" +
                            "ty, čo pred protivníkmi pravicou zachraňuješ<br>" +
                            "dôverujúcich v teba.<font color='#B71C1C'> – R.</font><br>" +
                            "Chráň ma ako zrenicu oka, <font color='#B71C1C'>*</font><br>" +
                            "skry ma v tôni svojich perutí.<br>" +
                            "Ja však v spravodlivosti uzriem tvoju tvár <font color='#B71C1C'>*</font><br>" +
                            "a až raz vstanem zo sna,<br>" +
                            "nasýtim sa pohľadom na teba.<font color='#B71C1C'> – R.</font>"},
            {"24", "6", "1", "Ž 100, 2. 3. 4. 5",
                    "<font color='#B71C1C'>R.:</font> S plesaním vstupujte pred tvár nášho Pána.<br><br>" +
                            "Jasaj na chválu Pánovi, celá zem, <font color='#B71C1C'>†</font><br>" +
                            "s radosťou slúžte Pánovi. <font color='#B71C1C'>*</font><br>" +
                            "S plesaním vstupujte pred jeho tvár.<font color='#B71C1C'> – R.</font><br>" +
                            "Vedzte, že náš Pán je Boh; <font color='#B71C1C'>†</font><br>" +
                            "on je náš stvoriteľ a jemu patríme, <font color='#B71C1C'>*</font><br>" +
                            "sme jeho ľud a ovce z jeho stáda.<font color='#B71C1C'> – R.</font><br>" +
                            "Vstupujte do jeho brán s piesňou chvály <font color='#B71C1C'>†</font><br>" +
                            "a do jeho nádvorí s piesňami oslavnými; <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho a velebte jeho meno.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán je dobrý; <font color='#B71C1C'>†</font><br>" +
                            "jeho milosrdenstvo trvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho vernosť z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"24", "6", "2", "Ž 56, 10. 11-12. 13-14",
                    "<font color='#B71C1C'>R.:</font> Budem kráčať pred Bohom vo svetle žijúcich.<br><br>" +
                            "Vtedy moji nepriatelia ustúpia, <font color='#B71C1C'>†</font><br>" +
                            "ešte v ten deň, keď budem volať: <font color='#B71C1C'>*</font><br>" +
                            "áno, viem, že ty si môj Boh.<font color='#B71C1C'> – R.</font><br>" +
                            "Na Boha, ktorého slovo velebím, <font color='#B71C1C'>*</font><br>" +
                            "na Pána, ktorého slovo velebím,<br>" +
                            "na Boha sa ja spolieham <font color='#B71C1C'>*</font><br>" +
                            "a nebojím sa; veď čože mi môže urobiť človek?<font color='#B71C1C'> – R.</font><br>" +
                            "Bože, ešte mám splniť sľuby, čo som tebe urobil; <font color='#B71C1C'>*</font><br>" +
                            "obety chvály ti prinesiem,<br>" +
                            "lebo ty si mi život zachránil pred smrťou <font color='#B71C1C'>†</font><br>" +
                            "a nohy pred pádom, <font color='#B71C1C'>*</font><br>" +
                            "aby som kráčal pred Bohom vo svetle žijúcich.<font color='#B71C1C'> – R.</font>"},
            {"25", "A", "", "Ž 145, 2-3. 8-9. 17-18",
                    "<font color='#B71C1C'>R.:</font> Blízky je Pán všetkým, čo ho vzývajú.<br><br>" +
                            "Budem ťa velebiť každý deň <font color='#B71C1C'>*</font><br>" +
                            "a tvoje meno chváliť navždy a naveky.<br>" +
                            "Veľký si, Pane, a veľkej chvály hoden, <font color='#B71C1C'>*</font><br>" +
                            "tvoju veľkosť nemožno preskúmať.<font color='#B71C1C'> – R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a veľmi láskavý.<br>" +
                            "Dobrý je Pán ku každému <font color='#B71C1C'>*</font><br>" +
                            "a milostivý ku všetkým svojim stvoreniam.<font color='#B71C1C'> – R.</font><br>" +
                            "Spravodlivý je Pán na všetkých svojich cestách <font color='#B71C1C'>*</font><br>" +
                            "a svätý vo všetkých svojich skutkoch.<br>" +
                            "Blízky je Pán všetkým, čo ho vzývajú, <font color='#B71C1C'>*</font><br>" +
                            "všetkým, čo ho vzývajú úprimne.<font color='#B71C1C'> – R.</font>"},
            {"25", "B", "", "Ž 54, 3-4. 5. 6+8",
                    "<font color='#B71C1C'>R.:</font> Pán udržiava môj život.<br><br>" +
                            "Pane, zachráň ma pre svoje meno <font color='#B71C1C'>*</font><br>" +
                            "a svojou mocou obráň moje právo.<br>" +
                            "Bože, vyslyš moju modlitbu <font color='#B71C1C'>*</font><br>" +
                            "a vypočuj slová mojich úst.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo pyšní povstávajú proti mne <font color='#B71C1C'>†</font><br>" +
                            "a násilníci mi striehnu na život, <font color='#B71C1C'>*</font><br>" +
                            "nechcú mať Boha na očiach.<font color='#B71C1C'> – R.</font><br>" +
                            "Ale mne Boh pomáha <font color='#B71C1C'>*</font><br>" +
                            "a môj život udržiava Pán.<br>" +
                            "S radosťou ti prinesiem obetu; <font color='#B71C1C'>*</font><br>" +
                            "meno tvoje, Pane, budem velebiť, lebo si dobrý.<font color='#B71C1C'> – R.</font>"},
            {"25", "C", "", "Ž 113, 1-2. 4-6. 7-8",
                    "<font color='#B71C1C'>R.:</font> Chváľte Pána, lebo dvíha chudobných.<br><br>" +
                            "Chváľte, služobníci Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "chváľte meno Pánovo.<br>" +
                            "Nech je velebené meno Pánovo <font color='#B71C1C'>*</font><br>" +
                            "odteraz až naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyvýšený je Pán nad všetky národy <font color='#B71C1C'>*</font><br>" +
                            "a jeho sláva nad nebesia.<br>" +
                            "Kto je ako Pán, náš Boh, čo tróni na výsostiach, <font color='#B71C1C'>*</font><br>" +
                            "a predsa dbá o všetko nepatrné na nebi i na zemi?<font color='#B71C1C'> – R.</font><br>" +
                            "Z prachu dvíha chudobného <font color='#B71C1C'>*</font><br>" +
                            "a zo smetiska povyšuje bedára<br>" +
                            "a dáva mu sedieť vedľa kniežat, <font color='#B71C1C'>*</font><br>" +
                            "vedľa kniežat svojho ľudu.<font color='#B71C1C'> – R.</font>"},
            {"25", "1", "1", "Ž 126, 1-2b. 2c-3. 4-5. 6",
                    "<font color='#B71C1C'>R.:</font> Veľké veci urobil s nami Pán a máme z toho radosť.<br><br>" +
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
            {"25", "1", "2", "Ž 15, 2-3a. 3b-4b. 5",
                    "<font color='#B71C1C'>R.:</font> Spravodlivý nájde odpočinok na tvojom svätom vrchu, Pane.<br><br>" +
                            "Ten, čo kráča bez poškvrny a koná spravodlivo, <font color='#B71C1C'>†</font><br>" +
                            "čo z úprimného srdca pravdu hovorí, <font color='#B71C1C'>*</font><br>" +
                            "čo nepodvádza svojím jazykom.<font color='#B71C1C'> – R.</font><br>" +
                            "Čo nekrivdí svojmu blížnemu, <font color='#B71C1C'>*</font><br>" +
                            "ani ho nepotupuje.<br>" +
                            "Čo ničomníka nemá za nič, <font color='#B71C1C'>*</font><br>" +
                            "ale ctí si ľudí bohabojných.<font color='#B71C1C'> – R.</font><br>" +
                            "Čo nepožičiava peniaze na úrok <font color='#B71C1C'>†</font><br>" +
                            "a proti nevinnému sa nedá podplácať. <font color='#B71C1C'>*</font><br>" +
                            "Kto si tak počína, ten sa nikdy neskláti.<font color='#B71C1C'> – R.</font>"},
            {"25", "2", "1", "Ž 122, 1-2. 3-4a. 4b-5",
                    "<font color='#B71C1C'>R.:</font> S radosťou pôjdeme do domu Pánovho.<br><br>" +
                            "Zaradoval som sa, keď mi povedali: <font color='#B71C1C'>*</font><br>" +
                            "\"Pôjdeme do domu Pánovho.\"<br>" +
                            "Naše nohy už stoja <font color='#B71C1C'>*</font><br>" +
                            "v tvojich bránach, Jeruzalem.<font color='#B71C1C'> – R.</font><br>" +
                            "Jeruzalem je vystavaný ako mesto <font color='#B71C1C'>*</font><br>" +
                            "spojené v jeden celok.<br>" +
                            "Tam prichádzajú kmene, <font color='#B71C1C'>*</font><br>" +
                            "kmene Pánove,<font color='#B71C1C'> – R.</font><br>" +
                            "aby podľa obyčaje Izraela <font color='#B71C1C'>*</font><br>" +
                            "velebili meno Pánovo.<br>" +
                            "Lebo sú tam súdne stolice, <font color='#B71C1C'>*</font><br>" +
                            "stolice domu Dávidovho.<font color='#B71C1C'> – R.</font>"},
            {"25", "2", "2", "Ž 119, 1. 27. 30. 34. 35. 44",
                    "<font color='#B71C1C'>R.:</font> Priveď ma, Pane, na chodník svojich príkazov.<br><br>" +
                            "Blažení tí, čo idú cestou života bez poškvrny, <font color='#B71C1C'>*</font><br>" +
                            "čo kráčajú podľa zákona Pánovho.<font color='#B71C1C'> – R.</font><br>" +
                            "Daj, aby som pochopil cestu tvojich príkazov, <font color='#B71C1C'>*</font><br>" +
                            "a budem rozjímať o tvojich obdivuhodných skutkoch.<font color='#B71C1C'> – R.</font><br>" +
                            "Cestu pravdy som si vyvolil, <font color='#B71C1C'>*</font><br>" +
                            "tvoje slová mám stále pred sebou.<font color='#B71C1C'> – R.</font><br>" +
                            "Daj mi chápavosť a ja tvoj zákon zachovám <font color='#B71C1C'>*</font><br>" +
                            "a celým srdcom sa ho budem pridŕžať.<font color='#B71C1C'> – R.</font><br>" +
                            "Priveď ma na chodník svojich príkazov, <font color='#B71C1C'>*</font><br>" +
                            "lebo som si ho obľúbil.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvojho zákona sa chcem stále pridŕžať, <font color='#B71C1C'>*</font><br>" +
                            "na večné veky.<font color='#B71C1C'> – R.</font>"},
            {"25", "3", "1", "Tob 13, 2c-f. 3-4. 6f-i. 6jk. 6lm",
                    "<font color='#B71C1C'>R.:</font> Nech je zvelebený Boh, ktorý žije naveky.<br><br>" +
                            "Pretože on trestá aj sa zmilúva, <font color='#B71C1C'>*</font><br>" +
                            "on zvrhne až na dno podsvetia<br>" +
                            "a svojou velebnosťou vyvádza zo záhuby; <font color='#B71C1C'>*</font><br>" +
                            "a niet nikoho, kto by jeho ruke unikol.<font color='#B71C1C'> – R.</font><br>" +
                            "Oslavujte ho, synovia Izraela, pred očami národov, <font color='#B71C1C'>†</font><br>" +
                            "lebo on vás roztrúsil medzi ne <font color='#B71C1C'>*</font><br>" +
                            "a tam ukázal svoju slávu.<br>" +
                            "Velebte ho pred všetkým, čo žije, <font color='#B71C1C'>†</font><br>" +
                            "lebo náš Pán je aj naším otcom, <font color='#B71C1C'>*</font><br>" +
                            "on je naším Bohom po všetky veky.<font color='#B71C1C'> – R.</font><br>" +
                            "A teraz pozrite, čo s vami urobil, <font color='#B71C1C'>*</font><br>" +
                            "a oslavujte ho celým svojím hlasom.<br>" +
                            "Velebte Pána spravodlivosti <font color='#B71C1C'>*</font><br>" +
                            "a chváľte Kráľa vekov.<font color='#B71C1C'> – R.</font><br>" +
                            "Ja ho oslavujem v krajine môjho vyhnanstva <font color='#B71C1C'>*</font><br>" +
                            "a ohlasujem jeho silu a vznešenosť<br>" +
                            "hriešnemu národu.<font color='#B71C1C'> – R.</font><br>" +
                            "Obráťte sa, hriešnici, <font color='#B71C1C'>†</font><br>" +
                            "a žite spravodlivo pred ním. <font color='#B71C1C'>*</font><br>" +
                            "Možno si vás obľúbi a preukáže vám milosrdenstvo.<font color='#B71C1C'> – R.</font>"},
            {"25", "3", "2", "Ž 119, 29. 72. 89. 101. 104. 163",
                    "<font color='#B71C1C'>R.:</font> Pane, tvoje slovo je svetlo pre moje nohy.<br><br>" +
                            "Odvráť ma od cesty lži <font color='#B71C1C'>*</font><br>" +
                            "a milostivo mi daj svoj zákon.<font color='#B71C1C'> – R.</font><br>" +
                            "Lepší je pre mňa zákon tvojich úst <font color='#B71C1C'>*</font><br>" +
                            "ako tisícky v zlate a striebre.<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, tvoje slovo <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky ako nebesia.<font color='#B71C1C'> – R.</font><br>" +
                            "Svojim nohám nedovolím vykročiť na zlé cesty, <font color='#B71C1C'>*</font><br>" +
                            "chcem dodržiavať tvoje slová.<font color='#B71C1C'> – R.</font><br>" +
                            "Zmúdrel som z tvojich príkazov, <font color='#B71C1C'>*</font><br>" +
                            "preto nenávidím cesty klamstva.<font color='#B71C1C'> – R.</font><br>" +
                            "Nenávidím klamstvo, protiví sa mi; <font color='#B71C1C'>*</font><br>" +
                            "ale tvoj zákon milujem.<font color='#B71C1C'> – R.</font>"},
            {"25", "4", "1", "Ž 149, 1-2. 3-4. 5-6a+9b",
                    "<font color='#B71C1C'>R.:</font> Pán Boh miluje svoj ľud.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>*</font> <br>" +
                            "jeho chvála nech znie v zhromaždení svätých. <br>" +
                            "Nech sa teší Izrael zo svojho Stvoriteľa, <font color='#B71C1C'>*</font> <br>" +
                            "synovia Siona nech jasajú nad svojím kráľom.<font color='#B71C1C'> – R.</font> <br>" +
                            "Nech oslavujú jeho meno tancom, <font color='#B71C1C'>*</font> <br>" +
                            "nech mu hrajú na bubne a na citare. <br>" +
                            "Lebo Pán miluje svoj ľud <font color='#B71C1C'>*</font> <br>" +
                            "a tichých venčí víťazstvom.<font color='#B71C1C'> – R.</font> <br>" +
                            "Nech svätí jasajú v sláve, <font color='#B71C1C'>*</font> <br>" +
                            "nech sa veselia na svojich lôžkach. <br>" +
                            "Oslavu Boha nech majú na perách; <font color='#B71C1C'>*</font> <br>" +
                            "všetkým jeho svätým to bude na slávu.<font color='#B71C1C'> – R.</font>"},
            {"25", "4", "2", "Ž 90, 3-4. 5-6. 12-13. 14+17",
                    "<font color='#B71C1C'>R.:</font> Pane, stal si sa nám útočišťom z pokolenia na pokolenie.<br><br>" +
                            "Človeka vraciaš do prachu <font color='#B71C1C'>*</font><br>" +
                            "a hovoríš: \"Vráťte sa, synovia človeka!\"<br>" +
                            "Veď tisíc rokov je u teba ako deň včerajší, čo sa pominul, <font color='#B71C1C'>*</font><br>" +
                            "a ako jedna nočná stráž.<font color='#B71C1C'> – R.</font><br>" +
                            "Uchvacuješ ich: sú ako ranný sen; <font color='#B71C1C'>*</font><br>" +
                            "sú ako bylina v rozpuku:<br>" +
                            "ráno kvitne a rastie, <font color='#B71C1C'>*</font><br>" +
                            "večer vädne a usychá.<font color='#B71C1C'> – R.</font><br>" +
                            "Nauč nás rátať naše dni, <font color='#B71C1C'>*</font><br>" +
                            "aby sme našli múdrosť srdca.<br>" +
                            "Obráť sa k nám, Pane; dokedy budeš meškať? <font color='#B71C1C'>*</font><br>" +
                            "Zľutuj sa nad svojimi služobníkmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Hneď zrána nás naplň svojou milosťou <font color='#B71C1C'>*</font><br>" +
                            "a budeme jasať a radovať sa po všetky dni života.<br>" +
                            "Nech je nad nami dobrotivosť Pána, nášho Boha; <font color='#B71C1C'>†</font><br>" +
                            "upevňuj dielo našich rúk, <font color='#B71C1C'>*</font><br>" +
                            "dielo našich rúk upevňuj!<font color='#B71C1C'> – R.</font>"},
            {"25", "5", "1", "Ž 43, 1. 2. 3. 4",
                    "<font color='#B71C1C'>R.:</font> Dúfam v Pána, môjho Boha, v spásu mojej tváre.<br><br>" +
                            "Súď ma, Bože, <font color='#B71C1C'>†</font> a rozhodni môj spor s neverným ľudom; <font color='#B71C1C'>*</font><br>" +
                            "zachráň ma pred zločincom a úskočným človekom.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď ty, Bože, si moje útočište. <font color='#B71C1C'>†</font><br>" +
                            "Prečo si ma odohnal <font color='#B71C1C'>*</font><br>" +
                            "a prečo mám chodiť smutný, keď ma sužuje nepriateľ?<font color='#B71C1C'> – R.</font><br>" +
                            "Zošli svoje svetlo a svoju pravdu; <font color='#B71C1C'>†</font><br>" +
                            "ony nech ma sprevádzajú <font color='#B71C1C'>*</font><br>" +
                            "a privedú na tvoj svätý vrch a do tvojich stánkov.<font color='#B71C1C'> – R.</font><br>" +
                            "I pristúpim k Božiemu oltáru, <font color='#B71C1C'>†</font><br>" +
                            "k Bohu, ktorý ma napĺňa radosťou i plesaním, <font color='#B71C1C'>*</font><br>" +
                            "a citarou ťa, Bože, môj Bože, zvelebím.<font color='#B71C1C'> – R.</font>"},
            {"25", "5", "2", "Ž 144, 1a+2a-c. 3-4",
                    "<font color='#B71C1C'>R.:</font> Nech je zvelebený Pán, môj ochranca.<br><br>" +
                            "Nech je zvelebený Pán, môj ochranca. <font color='#B71C1C'>*</font><br>" +
                            "On je ku mne milosrdný a dodáva mi odvahy,<br>" +
                            "on je moje útočište a môj osloboditeľ; <font color='#B71C1C'>*</font><br>" +
                            "on je moja záštita, na ktorú sa spolieham.<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, čože je človek, že sa k nemu priznávaš, <font color='#B71C1C'>*</font><br>" +
                            "a syn človeka, že myslíš na neho?<br>" +
                            "Preludu sa človek podobá, <font color='#B71C1C'>*</font><br>" +
                            "jeho dni sú ako letiaci tieň.<font color='#B71C1C'> – R.</font>"},
            {"25", "6", "1", "Jer 31, 10. 11-12b. 13",
                    "<font color='#B71C1C'>R.:</font> Pán nás bude strážiť ako pastier svoje stádo.<br><br>" +
                            "Čujte, národy, slovo Pánovo, <font color='#B71C1C'>*</font><br>" +
                            "ohlasujte ho na ostrovoch v diaľavách a hovorte:<br>" +
                            "\"Zhromaždí Izraela ten, čo ho rozptýlil, <font color='#B71C1C'>*</font><br>" +
                            "bude ho strážiť ako pastier svoje stádo.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán vykúpil Jakuba <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ho z ruky mocnejšieho.<br>" +
                            "Prídu a budú jasať na vrchu Sion, <font color='#B71C1C'>*</font><br>" +
                            "budú sa hrnúť k darom Pánovým.<font color='#B71C1C'> – R.</font><br>" +
                            "Vtedy sa panna radosťou roztančí, <font color='#B71C1C'>*</font><br>" +
                            "mládenci i starci zároveň.<br>" +
                            "\"Ich smútok zmením na radosť, <font color='#B71C1C'>*</font><br>" +
                            "poteším ich a rozveselím po žiali.\"<font color='#B71C1C'> – R.</font>"},
            {"25", "6", "2", "Ž 90, 3-4. 5-6. 12-13. 14+17",
                    "<font color='#B71C1C'>R.:</font> Pane, stal si sa nám útočišťom z pokolenia na pokolenie.<br><br>" +
                            "Človeka vraciaš do prachu <font color='#B71C1C'>*</font><br>" +
                            "a hovoríš: \"Vráťte sa, synovia človeka!\"<br>" +
                            "Veď tisíc rokov je u teba ako deň včerajší, čo sa pominul, <font color='#B71C1C'>*</font><br>" +
                            "a ako jedna nočná stráž.<font color='#B71C1C'> – R.</font><br>" +
                            "Uchvacuješ ich: sú ako ranný sen; <font color='#B71C1C'>*</font><br>" +
                            "sú ako bylina v rozpuku:<br>" +
                            "ráno kvitne a rastie, <font color='#B71C1C'>*</font><br>" +
                            "večer vädne a usychá.<font color='#B71C1C'> – R.</font><br>" +
                            "Nauč nás rátať naše dni, <font color='#B71C1C'>*</font><br>" +
                            "aby sme našli múdrosť srdca.<br>" +
                            "Obráť sa k nám, Pane; dokedy budeš meškať? <font color='#B71C1C'>*</font><br>" +
                            "Zľutuj sa nad svojimi služobníkmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Hneď zrána nás naplň svojou milosťou <font color='#B71C1C'>*</font><br>" +
                            "a budeme jasať a radovať sa po všetky dni života.<br>" +
                            "Nech je nad nami dobrotivosť Pána, nášho Boha; <font color='#B71C1C'>†</font><br>" +
                            "upevňuj dielo našich rúk, <font color='#B71C1C'>*</font><br>" +
                            "dielo našich rúk upevňuj!<font color='#B71C1C'> – R.</font>"},
            {"26", "A", "", "Ž 25, 4-5. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Rozpomeň sa, Pane, na svoje zľutovanie.<br><br>" +
                            "Ukáž mi, Pane, svoje cesty <font color='#B71C1C'>*</font><br>" +
                            "a pouč ma o svojich chodníkoch.<br>" +
                            "Veď ma vo svojej pravde a uč ma, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si Boh, moja spása, a v teba dúfam celý deň.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozpomeň sa, Pane, na svoje zľutovanie <font color='#B71C1C'>*</font><br>" +
                            "a na svoje milosrdenstvo, ktoré trvá od vekov.<br>" +
                            "Nespomínaj si na hriechy mojej mladosti<br>" +
                            "a na moje priestupky, <font color='#B71C1C'>*</font><br>" +
                            "ale pamätaj na mňa vo svojom milosrdenstve,<br>" +
                            "veď si, Pane, dobrotivý.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán je dobrý a spravodlivý: <font color='#B71C1C'>*</font><br>" +
                            "ukazuje cestu hriešnikom.<br>" +
                            "Pokorných vedie k správnemu konaniu <font color='#B71C1C'>*</font><br>" +
                            "a tichých poúča o svojich cestách.<font color='#B71C1C'> – R.</font>"},
            {"26", "B", "", "Ž 19, 8. 10. 12-13. 14",
                    "<font color='#B71C1C'>R.:</font> Rozhodnutia Pánove sú správne, potešujú srdce.<br><br>" +
                            "Zákon Pánov je dokonalý, <font color='#B71C1C'>*</font><br>" +
                            "osviežuje dušu.<br>" +
                            "Svedectvo Pánovo je hodnoverné, <font color='#B71C1C'>*</font><br>" +
                            "dáva múdrosť maličkým.<font color='#B71C1C'> – R.</font><br>" +
                            "Bázeň pred Pánom je úprimná, <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky.<br>" +
                            "Výroky Pánove sú pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a všetky spravodlivé.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoj služobník sa v nich vzdeláva; <font color='#B71C1C'>*</font><br>" +
                            "veď kto ich zachováva, dostane hojnú odmenu.<br>" +
                            "Kto však vie o všetkých svojich poblúdeniach? <font color='#B71C1C'>*</font><br>" +
                            "Očisť ma od chýb, ktoré si neuvedomujem,<font color='#B71C1C'> – R.</font><br>" +
                            "a svojho služobníka zachráň od pýchy, <font color='#B71C1C'>*</font><br>" +
                            "aby ma neovládala.<br>" +
                            "Tak budem bez škvrny <font color='#B71C1C'>*</font><br>" +
                            "a čistý od veľkého hriechu.<font color='#B71C1C'> – R.</font>"},
            {"26", "C", "", "Ž 146, 6c-7. 8-9a. 9b-10",
                    "<font color='#B71C1C'>R.:</font> Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo.<br><br>" +
                            "Pán zachováva vernosť naveky, <font color='#B71C1C'>*</font> <br>" +
                            "utláčaným prisudzuje právo, <br>" +
                            "hladujúcim dáva chlieb. <font color='#B71C1C'>*</font> <br>" +
                            "Pán vyslobodzuje väzňov,<font color='#B71C1C'> – R.</font> <br>" +
                            "Pán otvára oči slepým, <font color='#B71C1C'>*</font> <br>" +
                            "Pán dvíha skľúčených, <br>" +
                            "Pán miluje spravodlivých. <font color='#B71C1C'>*</font> <br>" +
                            "Pán ochraňuje cudzincov,<font color='#B71C1C'> – R.</font> <br>" +
                            "ujíma sa siroty a vdovy, <font color='#B71C1C'>*</font> <br>" +
                            "ale hatí cesty hriešnikov. <br>" +
                            "Pán bude kraľovať naveky; <font color='#B71C1C'>*</font> <br>" +
                            "tvoj Boh, Sion, z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"26", "1", "1", "Ž 102, 16-18. 19-21. 29+22-23",
                    "<font color='#B71C1C'>R.:</font> Pán vystavil Sion a zjavil sa vo svojej sláve.<br><br>" +
                            "Tvojho mena, Pane, budú sa báť pohania <font color='#B71C1C'>*</font><br>" +
                            "a tvojej slávy všetci zemskí králi;<br>" +
                            "lebo Pán vystaví Sion <font color='#B71C1C'>*</font><br>" +
                            "a zjaví sa vo svojej sláve.<br>" +
                            "Zhliadne na modlitbu núdznych <font color='#B71C1C'>*</font><br>" +
                            "a nepohrdne ich prosbami.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa to zaznačí pre pokolenie budúce <font color='#B71C1C'>*</font><br>" +
                            "a obnovený ľud oslávi Pána.<br>" +
                            "Veď Pán hľadí zo svojej vznešenej svätyne <font color='#B71C1C'>*</font><br>" +
                            "a z nebies pozerá na zem;<br>" +
                            "čuje nárek zajatých <font color='#B71C1C'>*</font><br>" +
                            "a odsúdeným na smrť vracia slobodu.<font color='#B71C1C'> – R.</font><br>" +
                            "Deti tvojich služobníkov budú bývať v bezpečí <font color='#B71C1C'>*</font><br>" +
                            "a ich potomstvo bude pevné pred tebou,<br>" +
                            "aby na Sione hlásali meno Pánovo <font color='#B71C1C'>*</font><br>" +
                            "a v Jeruzaleme jeho slávu,<br>" +
                            "keď sa tam zídu vospolok národy <font color='#B71C1C'>*</font><br>" +
                            "a kráľovstvá, aby slúžili Pánovi.<font color='#B71C1C'> – R.</font>"},
            {"26", "1", "1", "Ž 17, 1. 2-3. 6-7",
                    "<font color='#B71C1C'>R.:</font> Nakloň ku mne svoj sluch a vypočuj moje slová.<br><br>" +
                            "Vypočuj, Pane, moju spravodlivú žiadosť, <font color='#B71C1C'>*</font><br>" +
                            "všimni si moju prosbu pokornú.<br>" +
                            "Nakloň sluch k mojej modlitbe, <font color='#B71C1C'>*</font><br>" +
                            "čo plynie z perí úprimných.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech z tvojej tváre vyjde rozsudok o mne; <font color='#B71C1C'>*</font><br>" +
                            "tvoje oči vidia, čo je správne.<br>" +
                            "Skúmaj moje srdce i v noci ma navštív, <font color='#B71C1C'>*</font><br>" +
                            "skúšaj ma ohňom a nenájdeš vo mne neprávosť.<font color='#B71C1C'> – R.</font><br>" +
                            "K tebe, Bože, volám, lebo ty ma vyslyšíš. <font color='#B71C1C'>*</font><br>" +
                            "Nakloň ku mne sluch a vypočuj moje slová.<br>" +
                            "Ukáž svoje predivné milosrdenstvo, <font color='#B71C1C'>*</font><br>" +
                            "ty, čo pred protivníkmi pravicou zachraňuješ<br>" +
                            "dôverujúcich v teba.<font color='#B71C1C'> – R.</font>"},
            {"26", "2", "1", "Ž 87, 1-3. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> S nami Boh, Pán, Boh náš.<br><br>" +
                            "Základy má na posvätných vrchoch; <font color='#B71C1C'>†</font><br>" +
                            "brány Siona miluje Pán <font color='#B71C1C'>*</font><br>" +
                            "nad všetky stany Jakuba.<br>" +
                            "Slávne veci sa hovoria o tebe, <font color='#B71C1C'>*</font><br>" +
                            "mesto Božie.<font color='#B71C1C'> – R.</font><br>" +
                            "Rahab a Babylon pripočítam k tým, čo ma poznajú; <font color='#B71C1C'>†</font><br>" +
                            "Filištínci, Týrčania a Etiópčania: <font color='#B71C1C'>*</font><br>" +
                            "tí všetci sa tam zrodili.<br>" +
                            "A o Sione sa bude hovoriť:<br>" +
                            "\"Ten i tamten sa na ňom narodil <font color='#B71C1C'>*</font><br>" +
                            "a sám Najvyšší mu dal pevné základy.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Pán zaznačí do knihy národov: <font color='#B71C1C'>*</font><br>" +
                            "\"Títo sa tam zrodili.\"<br>" +
                            "A spievajú ako pri tanci: <font color='#B71C1C'>*</font><br>" +
                            "\"V tebe sú všetky moje pramene.\"<font color='#B71C1C'> – R.</font>"},
            {"26", "2", "2", "Ž 88, 2-3. 4-5. 6. 7-8",
                    "<font color='#B71C1C'>R.:</font> Kiež prenikne k tebe, Pane, moja modlitba.<br><br>" +
                            "Pane, ty Boh mojej spásy, <font color='#B71C1C'>*</font><br>" +
                            "dňom i nocou volám k tebe.<br>" +
                            "Kiež prenikne k tebe moja modlitba, <font color='#B71C1C'>*</font><br>" +
                            "nakloň svoj sluch k mojej prosbe.<font color='#B71C1C'> – R.</font><br>" +
                            "Moja duša je plná utrpenia <font color='#B71C1C'>*</font><br>" +
                            "a môj život sa priblížil k ríši smrti.<br>" +
                            "Už ma počítajú k tým, čo zostupujú do hrobu, <font color='#B71C1C'>*</font><br>" +
                            "majú ma za človeka, ktorému niet pomoci.<font color='#B71C1C'> – R.</font><br>" +
                            "Moje lôžko je medzi mŕtvymi, <font color='#B71C1C'>*</font><br>" +
                            "som ako tí, čo padli a odpočívajú v hroboch,<br>" +
                            "na ktorých už nepamätáš <font color='#B71C1C'>*</font><br>" +
                            "lebo sa vymanili z tvojej náruče.<font color='#B71C1C'> – R.</font><br>" +
                            "Hádžeš ma do hlbokej priepasti, <font color='#B71C1C'>*</font><br>" +
                            "do temravy a tône smrti.<br>" +
                            "Doľahlo na mňa tvoje rozhorčenie <font color='#B71C1C'>*</font><br>" +
                            "svojimi prívalmi si ma zaplavil.<font color='#B71C1C'> – R.</font>"},
            {"26", "3", "1", "Ž 137, 1-2. 3. 4-5. 6",
                    "<font color='#B71C1C'>R.:</font> Pane, chcem stále pamätať na teba.<br><br>" +
                            "Na brehu babylonských riek, tam sme sedávali a plakali, <font color='#B71C1C'>*</font><br>" +
                            "keď sme si spomínali na Sion.<br>" +
                            "Na vŕby tejto krajiny <font color='#B71C1C'>*</font><br>" +
                            "vešali sme svoje citary.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo tí, čo nás zajali, <font color='#B71C1C'>*</font><br>" +
                            "žiadali od nás spevy<br>" +
                            "a tí, čo nás trápili, žiadali veselosť: <font color='#B71C1C'>*</font><br>" +
                            "\"Zaspievajte nám nejaké piesne sionské!\"<font color='#B71C1C'> – R.</font><br>" +
                            "Akože môžeme spievať pieseň Pánovu <font color='#B71C1C'>*</font><br>" +
                            "v cudzej krajine?<br>" +
                            "Keby som, Jeruzalem, zabudol na teba, <font color='#B71C1C'>*</font><br>" +
                            "nech mi odumrie pravica.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa mi prilepí jazyk na podnebie, <font color='#B71C1C'>*</font><br>" +
                            "keby som nepamätal na teba,<br>" +
                            "keby som Jeruzalem nepovýšil <font color='#B71C1C'>*</font><br>" +
                            "za vrchol svojej radosti.<font color='#B71C1C'> – R.</font>"},
            {"26", "3", "2", "Ž 88, 10b-11. 12-13. 14-15",
                    "<font color='#B71C1C'>R.:</font> Kiež prenikne k tebe, Pane, moja modlitba.<br><br>" +
                            "K tebe, Pane, volám deň čo deň <font color='#B71C1C'>*</font><br>" +
                            "a k tebe ruky vystieram.<br>" +
                            "Či mŕtvym budeš robiť zázraky? <font color='#B71C1C'>*</font><br>" +
                            "A vari ľudské tône vstanú ťa chváliť?<font color='#B71C1C'> – R.</font><br>" +
                            "Či v hrobe bude dakto rozprávať o tvojej dobrote <font color='#B71C1C'>*</font><br>" +
                            "a na mieste zániku o tvojej vernosti?<br>" +
                            "Či sa v ríši tmy bude hovoriť o tvojich zázrakoch <font color='#B71C1C'>*</font><br>" +
                            "a v krajine zabudnutia o tvojej spravodlivosti?<font color='#B71C1C'> – R.</font><br>" +
                            "Ale ja, Pane, volám k tebe, <font color='#B71C1C'>*</font><br>" +
                            "včasráno prichádza k tebe moja modlitba.<br>" +
                            "Prečo ma, Pane, odháňaš? <font color='#B71C1C'>*</font><br>" +
                            "Prečo predo mnou skrývaš svoju tvár?<font color='#B71C1C'> – R.</font>"},
            {"26", "4", "1", "Ž 19, 8. 9. 10. 11",
                    "<font color='#B71C1C'>R.:</font> Rozhodnutia Pánove sú správne, potešujú srdce.<br><br>" +
                            "Zákon Pánov je dokonalý, <font color='#B71C1C'>*</font><br>" +
                            "osviežuje dušu.<br>" +
                            "Svedectvo Pánovo je hodnoverné, <font color='#B71C1C'>*</font><br>" +
                            "dáva múdrosť maličkým.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozhodnutia Pánove sú správne, <font color='#B71C1C'>*</font><br>" +
                            "potešujú srdce.<br>" +
                            "Prikázania Pánove sú jasné, <font color='#B71C1C'>*</font><br>" +
                            "osvecujú oči.<font color='#B71C1C'> – R.</font><br>" +
                            "Bázeň pred Pánom je úprimná, <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky.<br>" +
                            "Výroky Pánove sú pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a všetky spravodlivé.<font color='#B71C1C'> – R.</font><br>" +
                            "Vzácnejšie sú než zlato, <font color='#B71C1C'>*</font><br>" +
                            "než veľký drahokam,<br>" +
                            "sladšie sú než med, <font color='#B71C1C'>*</font><br>" +
                            "než medové kvapky z plástu.<font color='#B71C1C'> – R.</font>"},
            {"26", "4", "2", "Ž 27, 7-8a. 8b-9c. 13-14",
                    "<font color='#B71C1C'>R.:</font> Verím, že uvidím dobrodenia Pánove v krajine žijúcich.<br><br>" +
                            "Čuj, Pane, hlas môjho volania, <font color='#B71C1C'>*</font><br>" +
                            "zľutuj sa nado mnou a vyslyš ma.<br>" +
                            "V srdci mi znejú tvoje slová: <font color='#B71C1C'>*</font><br>" +
                            "\"Hľadajte moju tvár!\"<font color='#B71C1C'> – R.</font><br>" +
                            "Pane, ja hľadám tvoju tvár. <font color='#B71C1C'>*</font><br>" +
                            "Neodvracaj svoju tvár odo mňa,<br>" +
                            "neodkláňaj sa v hneve od svojho služobníka. <font color='#B71C1C'>*</font><br>" +
                            "ty si moja pomoc, neodvrhuj ma.<font color='#B71C1C'> – R.</font><br>" +
                            "Verím, že uvidím dobrodenia Pánove <font color='#B71C1C'>*</font><br>" +
                            "v krajine žijúcich.<br>" +
                            "Očakávaj Pána a buď statočný; <font color='#B71C1C'>*</font><br>" +
                            "srdce maj silné a drž sa Pána.<font color='#B71C1C'> – R.</font>"},
            {"26", "5", "1", "Ž 79, 1-2. 3-5. 8. 9",
                    "<font color='#B71C1C'>R.:</font> Pre slávu svojho mena vysloboď nás, Pane.<br><br>" +
                            "Bože, pohania vtrhli do tvojho dedičstva, <font color='#B71C1C'>†</font><br>" +
                            "poškvrnili tvoj svätý chrám <font color='#B71C1C'>*</font><br>" +
                            "a Jeruzalem obrátili na rumy.<br>" +
                            "Mŕtvoly tvojich služobníkov<br>" +
                            "dali za pokrm vtákom lietavým <font color='#B71C1C'>*</font><br>" +
                            "a divej zveri dávali telá tvojich svätých.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozlievali ich krv ako vodu vôkol Jeruzalema <font color='#B71C1C'>*</font><br>" +
                            "a nemal ich kto pochovať.<br>" +
                            "Susedia nás začali potupovať <font color='#B71C1C'>*</font><br>" +
                            "a okolití ľudia haniť a vysmievať.<br>" +
                            "Dokedy ešte, Pane? Chceš sa hnevať naveky? <font color='#B71C1C'>*</font><br>" +
                            "Či tvoje rozhorčenie bude blčať sťa oheň?<font color='#B71C1C'> – R.</font><br>" +
                            "Zabudni na hriechy našich otcov; <font color='#B71C1C'>†</font><br>" +
                            "príď nám čím skôr v ústrety so svojím milosrdenstvom, <font color='#B71C1C'>*</font><br>" +
                            "lebo sme veľmi úbohí.<font color='#B71C1C'> – R.</font><br>" +
                            "Pre slávu svojho mena nám pomôž, Bože, naša spása, <font color='#B71C1C'>†</font><br>" +
                            "a vysloboď nás; <font color='#B71C1C'>*</font><br>" +
                            "a pre svoje meno odpusť nám hriechy.<font color='#B71C1C'> – R.</font>"},
            {"26", "5", "2", "Ž 139, 1-3. 7-8. 9-10. 13-14b",
                    "<font color='#B71C1C'>R.:</font> Veď ma, Pane, po ceste k večnosti.<br><br>" +
                            "Pane, ty ma skúmaš a vieš o mne všetko; <font color='#B71C1C'>*</font><br>" +
                            "ty vieš, či sedím a či stojím.<br>" +
                            "Už zďaleka vnímaš moje myšlienky: <font color='#B71C1C'>†</font><br>" +
                            "či kráčam a či odpočívam, ty ma sleduješ. <font color='#B71C1C'>*</font><br>" +
                            "A všetky moje cesty sú ti známe.<font color='#B71C1C'> – R.</font><br>" +
                            "Kam môžem ujsť pred tvojím duchom <font color='#B71C1C'>*</font><br>" +
                            "a kam utiecť pred tvojou tvárou?<br>" +
                            "Ak vystúpim na nebesia, ty si tam; <font color='#B71C1C'>*</font><br>" +
                            "ak zostúpim do podsvetia, aj tam si.<font color='#B71C1C'> – R.</font><br>" +
                            "I keby som si pripäl krídla zorničky <font color='#B71C1C'>*</font><br>" +
                            "a ocitol sa na najvzdialenejšom mori,<br>" +
                            "ešte aj tam ma tvoja ruka povedie <font color='#B71C1C'>*</font><br>" +
                            "a podchytí ma tvoja pravica.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď ty si stvoril moje útroby, <font color='#B71C1C'>*</font><br>" +
                            "utkal si ma v živote mojej matky.<br>" +
                            "Chválim ťa, že si ma utvoril tak zázračne; <font color='#B71C1C'>*</font><br>" +
                            "všetky tvoje diela sú hodny obdivu.<font color='#B71C1C'> – R.</font>"},
            {"26", "6", "1", "Ž 69, 33-35. 36-37",
                    "<font color='#B71C1C'>R.:</font> Vo svojej veľkej láske vyslyš ma, Pane.<br><br>" +
                            "Nech zvedia o tom ponížení a nech sa potešia; <font color='#B71C1C'>*</font><br>" +
                            "hľadajte Boha a srdce vám oživne.<br>" +
                            "Lebo Pán vypočuje chudobných <font color='#B71C1C'>*</font><br>" +
                            "a nepohŕda svojimi, keď sú v zajatí.<br>" +
                            "Nech ho chvália nebesia i zem, <font color='#B71C1C'>*</font><br>" +
                            "moria a všetko, čo sa hýbe v nich.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Boh zachráni Sion <font color='#B71C1C'>†</font><br>" +
                            "a vybuduje mestá Júdove; <font color='#B71C1C'>*</font><br>" +
                            "usadia sa tam a budú ich majetkom.<br>" +
                            "A zdedia ho potomci jeho služobníkov <font color='#B71C1C'>*</font><br>" +
                            "a tí, čo milujú jeho meno, budú v ňom prebývať.<font color='#B71C1C'> – R.</font>"},
            {"26", "6", "2", "Ž 119, 66. 71. 75. 91. 125. 130",
                    "<font color='#B71C1C'>R.:</font> Vyjasni tvár, Pane, nad svojím služobníkom.<br><br>" +
                            "Nauč ma dobrotivosti múdrosti a poznaniu, <font color='#B71C1C'>*</font><br>" +
                            "veď verím tvojej náuke.<font color='#B71C1C'> – R.</font><br>" +
                            "Že som bol pokorený, dobre mi, <font color='#B71C1C'>*</font><br>" +
                            "aspoň som si tvoju spravodlivosť osvojil.<font color='#B71C1C'> – R.</font><br>" +
                            "Viem, Pane, že spravodlivé sú tvoje rozsudky <font color='#B71C1C'>*</font><br>" +
                            "a že si ma právom pokoril.<font color='#B71C1C'> – R.</font><br>" +
                            "Podľa tvojho rozhodnutia všetko trvá podnes, <font color='#B71C1C'>*</font><br>" +
                            "lebo všetko slúži tebe.<font color='#B71C1C'> – R.</font><br>" +
                            "Som tvojím služobníkom; <font color='#B71C1C'>*</font><br>" +
                            "daj mi chápavosť, aby som poznal tvoje prikázania.<font color='#B71C1C'> – R.</font><br>" +
                            "Výklad tvojich slov osvecuje, <font color='#B71C1C'>*</font><br>" +
                            "maličkým dáva chápavosť.<font color='#B71C1C'> – R.</font>"},
            {"27", "A", "", "Ž 80, 9+12. 13-14. 15-16. 19-20",
                    "<font color='#B71C1C'>R.:</font> Vinicou Pánovou je jeho ľud.<br><br>" +
                            "Z Egypta si preniesol vinicu, <font color='#B71C1C'>*</font><br>" +
                            "pohanov si vyhnal a vysadil si ju.<br>" +
                            "Svoje výhonky vystrela až k moru, <font color='#B71C1C'>*</font><br>" +
                            "až po rieku Eufrat svoje letorasty.<font color='#B71C1C'> – R.</font><br>" +
                            "Prečo si zbúral jej ohradu <font color='#B71C1C'>*</font><br>" +
                            "a oberajú z nej všetci, čo idú okolo?<br>" +
                            "Diviak lesný ju rozrýva <font color='#B71C1C'>*</font><br>" +
                            "a pasie sa na nej poľná zver.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože zástupov, vráť sa, <font color='#B71C1C'>*</font><br>" +
                            "zhliadni z neba, podívaj sa a navštív túto vinicu.<br>" +
                            "A chráň ju, veď ju vysadila tvoja pravica, <font color='#B71C1C'>*</font><br>" +
                            "chráň i výhonok, ktorý si si vypestoval.<font color='#B71C1C'> – R.</font><br>" +
                            "Už neodstúpime od teba, a ty nás zachováš pri živote <font color='#B71C1C'>*</font><br>" +
                            "a budeme vzývať tvoje meno.<br>" +
                            "Pane, Bože, zástupov, obnov nás, <font color='#B71C1C'>*</font><br>" +
                            "rozjasni svoju tvár a budeme spasení.<font color='#B71C1C'> – R.</font>"},
            {"27", "B", "", "Ž 128, 1-2. 3. 4-5. 6",
                    "<font color='#B71C1C'>R.:</font> Nech nás žehná Pán po všetky dni nášho života.<br><br>" +
                            "Blažený každý, čo sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a kráča po jeho cestách.<br>" +
                            "Budeš jesť z práce svojich rúk; <font color='#B71C1C'>*</font><br>" +
                            "budeš šťastný a budeš sa mať dobre.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoja manželka je ako plodonosný vinič <font color='#B71C1C'>*</font><br>" +
                            "vnútri tvojho domu.<br>" +
                            "Tvoji synovia sú ako mládniky olivy <font color='#B71C1C'>*</font><br>" +
                            "okolo tvojho stola.<font color='#B71C1C'> – R.</font><br>" +
                            "Veru, tak bude požehnaný muž, <font color='#B71C1C'>*</font><br>" +
                            "ktorý sa bojí Pána.<br>" +
                            "Nech ťa žehná Pán zo Siona, <font color='#B71C1C'>†</font><br>" +
                            "aby si videl šťastie Jeruzalema <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni svojho života,<font color='#B71C1C'> – R.</font><br>" +
                            "aby si videl synov svojich synov. <font color='#B71C1C'>*</font><br>" +
                            "Pokoj nad Izraelom!<font color='#B71C1C'> – R.</font>"},
            {"27", "C", "", "Ž 95, 1-2. 6-7. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pane, daj, aby sme počúvali tvoj hlas a nezatvrdzovali si srdcia.<br><br>" +
                            "Poďte, plesajme v Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "oslavujme Boha, našu spásu.<br>" +
                            "Predstúpme s chválospevmi pred jeho tvár <font color='#B71C1C'>*</font><br>" +
                            "a oslavujme ho žalmami.<font color='#B71C1C'> – R.</font><br>" +
                            "Poďte, klaňajme sa a na zem padnime, <font color='#B71C1C'>*</font><br>" +
                            "kľaknime na kolená pred Pánom, ktorý nás stvoril.<br>" +
                            "Lebo on je náš Boh <font color='#B71C1C'>†</font><br>" +
                            "a my sme ľud jeho pastviny <font color='#B71C1C'>*</font><br>" +
                            "a ovce, ktoré vedie svojou rukou.<font color='#B71C1C'> – R.</font><br>" +
                            "Čujte dnes jeho hlas: <font color='#B71C1C'>*</font><br>" +
                            "\"Nezatvrdzujte svoje srdcia<br>" +
                            "ako v Meríbe, ako v dňoch Massy na púšti, <font color='#B71C1C'>†</font><br>" +
                            "kde ma pokúšali vaši otcovia; <font color='#B71C1C'>*</font><br>" +
                            "skúšali ma, hoci moje skutky videli.\"<font color='#B71C1C'> – R.</font>"},
            {"27", "1", "1", "Jon 2, 3. 4. 5. 8",
                    "<font color='#B71C1C'>R.:</font> Vytrhol si ma zo struhy, Pane, Bože môj.<br><br>" +
                            "Vo svojom súžení som volal k Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a on mi odpovedal;<br>" +
                            "z útrob podsvetia som kričal <font color='#B71C1C'>*</font><br>" +
                            "a vyslyšal si môj hlas.<font color='#B71C1C'> – R.</font><br>" +
                            "Vrhol si ma do hlbiny uprostred mora <font color='#B71C1C'>†</font><br>" +
                            "a obkľúčili ma prúdy, <font color='#B71C1C'>*</font><br>" +
                            "prevalili sa cezo mňa všetky tvoje prívaly a vlny.<font color='#B71C1C'> – R.</font><br>" +
                            "A ja som povedal: <font color='#B71C1C'>†</font><br>" +
                            "\"Odvrhnutý som spred tvojich očí; <font color='#B71C1C'>*</font><br>" +
                            "no znova uvidím tvoj svätý chrám.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Keď sa úzkosťou chvela vo mne moja duša, <font color='#B71C1C'>*</font><br>" +
                            "spomenul som si na Pána.<br>" +
                            "K tebe došla moja modlitba, <font color='#B71C1C'>*</font><br>" +
                            "do tvojho svätého chrámu.<font color='#B71C1C'> – R.</font>"},
            {"27", "1", "2", "Ž 111, 1-2. 7-8. 9+10c",
                    "<font color='#B71C1C'>R.:</font> Pán má svoju zmluvu stále na mysli.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Z celého srdca chcem oslavovať Pána <font color='#B71C1C'>*</font><br>" +
                            "v zbore spravodlivých i v zhromaždení.<br>" +
                            "Veľké sú diela Pánove; <font color='#B71C1C'>*</font><br>" +
                            "nech ich skúmajú všetci, čo majú v nich záľubu.<font color='#B71C1C'> – R.</font><br>" +
                            "Pravdivé a spravodlivé sú diela jeho rúk. <font color='#B71C1C'>*</font><br>" +
                            "Nezrušiteľné sú všetky jeho príkazy,<br>" +
                            "upevnené naveky, <font color='#B71C1C'>*</font><br>" +
                            "založené na pravde a spravodlivosti.<font color='#B71C1C'> – R.</font><br>" +
                            "Vykúpenie poslal svojmu ľudu, <font color='#B71C1C'>*</font><br>" +
                            "zmluvu uzavrel naveky.<br>" +
                            "Jeho meno je sväté a vzbudzuje hrôzu; <font color='#B71C1C'>*</font><br>" +
                            "jeho chvála ostáva naveky.<font color='#B71C1C'> – R.</font>"},
            {"27", "2", "1", "Ž 130, 1-2. 3-4. 7b-8",
                    "<font color='#B71C1C'>R.:</font> U Pána je milosrdenstvo a hojné vykúpenie.<br><br>" +
                            "Z hlbín volám k tebe, Pane; <font color='#B71C1C'>*</font><br>" +
                            "Pane, počuj môj hlas.<br>" +
                            "Nakloň svoj sluch <font color='#B71C1C'>*</font><br>" +
                            "k mojej úpenlivej prosbe.<font color='#B71C1C'> – R.</font><br>" +
                            "Ak si budeš, Pane, v pamäti uchovávať neprávosť, <font color='#B71C1C'>*</font><br>" +
                            "Pane, kto obstojí?<br>" +
                            "Ale ty si milostivý <font color='#B71C1C'>*</font><br>" +
                            "a my ti chceme v bázni slúžiť.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo u Pána je milosrdenstvo <font color='#B71C1C'>*</font><br>" +
                            "a hojné vykúpenie.<br>" +
                            "On sám vykúpi Izraela <font color='#B71C1C'>*</font><br>" +
                            "zo všetkých jeho neprávostí.<font color='#B71C1C'> – R.</font>"},
            {"27", "2", "2", "Ž 139, 1-2. 13-14b. 14c-15",
                    "<font color='#B71C1C'>R.:</font> Veď ma, Pane, po ceste k večnosti.<br><br>" +
                            "Pane, ty ma skúmaš a vieš o mne všetko; <font color='#B71C1C'>*</font><br>" +
                            "ty vieš, či sedím a či stojím.<br>" +
                            "Už zďaleka vnímaš moje myšlienky: <font color='#B71C1C'>†</font><br>" +
                            "či kráčam a či odpočívam, ty ma sleduješ. <font color='#B71C1C'>*</font><br>" +
                            "A všetky moje cesty sú ti známe.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď ty si stvoril moje útroby, <font color='#B71C1C'>*</font><br>" +
                            "utkal si ma v živote mojej matky.<br>" +
                            "Chválim ťa, že si ma utvoril tak zázračne; <font color='#B71C1C'>*</font><br>" +
                            "všetky tvoje diela sú hodny obdivu<font color='#B71C1C'> – R.</font><br>" +
                            "a ja to veľmi dobre viem. <font color='#B71C1C'>*</font><br>" +
                            "Moje údy neboli utajené pred tebou,<br>" +
                            "keď som vznikal v skrytosti, <font color='#B71C1C'>*</font><br>" +
                            "utkávaný v hlbinách zeme.<font color='#B71C1C'> – R.</font>"},
            {"27", "3", "1", "Ž 86, 3-4. 5-6. 9-10",
                    "<font color='#B71C1C'>R.:</font> Ty, Pane, si zhovievavý a veľmi milosrdný.<br><br>" +
                            "Zmiluj sa, Pane, nado mnou, <font color='#B71C1C'>*</font><br>" +
                            "veď k tebe volám deň čo deň.<br>" +
                            "Obveseľ, Pane, svojho sluhu, <font color='#B71C1C'>*</font><br>" +
                            "veď k tebe dvíham svoju dušu.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo ty, Pane, si dobrý a láskavý <font color='#B71C1C'>*</font><br>" +
                            "a veľmi milostivý voči všetkým, čo ťa vzývajú.<br>" +
                            "Pane, počuj moju modlitbu, <font color='#B71C1C'>*</font><br>" +
                            "všimni si hlas mojej úpenlivej prosby.<font color='#B71C1C'> – R.</font><br>" +
                            "Všetky národy, ktoré si stvoril, prídu k tebe <font color='#B71C1C'>†</font><br>" +
                            "a budú sa ti klaňať, Pane, <font color='#B71C1C'>*</font><br>" +
                            "a tvoje meno oslavovať.<br>" +
                            "Lebo si veľký a robíš zázraky, <font color='#B71C1C'>*</font><br>" +
                            "iba ty si Boh.<font color='#B71C1C'> – R.</font>"},
            {"27", "3", "2", "Ž 117, 1. 2",
                    "<font color='#B71C1C'>R.:</font> Choďte do celého sveta a hlásajte evanjelium.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľte Pána, všetky národy, <font color='#B71C1C'>*</font><br>" +
                            "oslavujte ho, všetci ľudia;<font color='#B71C1C'> – R.</font><br>" +
                            "lebo je veľké jeho milosrdenstvo voči nám <font color='#B71C1C'>*</font><br>" +
                            "a pravda Pánova trvá naveky.<font color='#B71C1C'> – R.</font>"},
            {"27", "4", "1", "Ž 1, 1-2. 3. 4+6",
                    "<font color='#B71C1C'>R.:</font> Blažený človek, čo v Pána skladá dôveru.<br><br>" +
                            "Blažený človek, čo nekráča podľa rady bezbožných <font color='#B71C1C'>†</font><br>" +
                            "a nechodí cestou hriešnikov, <font color='#B71C1C'>*</font><br>" +
                            "ani nevysedáva v kruhu rúhačov,<br>" +
                            "ale v zákone Pánovom má záľubu <font color='#B71C1C'>*</font><br>" +
                            "a o jeho zákone rozjíma dňom i nocou.<font color='#B71C1C'> – R.</font><br>" +
                            "Je ako strom zasadený pri vode, <font color='#B71C1C'>*</font><br>" +
                            "čo prináša ovocie v pravý čas,<br>" +
                            "a jeho lístie nikdy nevädne; <font color='#B71C1C'>*</font><br>" +
                            "darí sa mu všetko, čo podniká.<font color='#B71C1C'> – R.</font><br>" +
                            "No nie tak bezbožní, veru nie; <font color='#B71C1C'>*</font><br>" +
                            "tí sú ako plevy, čo vietor ženie pred sebou.<br>" +
                            "Nad cestou spravodlivých bedlí Pán, <font color='#B71C1C'>*</font><br>" +
                            "ale cesta bezbožných vedie do záhuby.<font color='#B71C1C'> – R.</font>"},
            {"27", "4", "2", "Lk 1, 69-70. 71-72. 73-75",
                    "<font color='#B71C1C'>R.:</font> Nech je zvelebený Pán, Boh Izraela, lebo navštívil svoj ľud.<br><br>" +
                            "A vzbudil nám mocného Spasiteľa <font color='#B71C1C'>*</font><br>" +
                            "z rodu Dávida, svojho služobníka,<br>" +
                            "ako odpradávna hovoril <font color='#B71C1C'>*</font><br>" +
                            "ústami svojich svätých prorokov,<font color='#B71C1C'> – R.</font><br>" +
                            "že nás oslobodí od našich nepriateľov <font color='#B71C1C'>*</font><br>" +
                            "a z rúk všetkých, čo nás nenávidia.<br>" +
                            "Preukázal milosrdenstvo našim otcom <font color='#B71C1C'>*</font><br>" +
                            "a pamätá na svoju svätú zmluvu,<font color='#B71C1C'> – R.</font><br>" +
                            "na prísahu,<br>" +
                            "ktorou sa zaviazal nášmu otcovi Abrahámovi, <font color='#B71C1C'>*</font><br>" +
                            "že nás vyslobodí z rúk nepriateľov,<br>" +
                            "aby sme mu bez strachu slúžili <font color='#B71C1C'>*</font><br>" +
                            "vo svätosti a spravodlivosti pred jeho tvárou<br>" +
                            "po všetky dni nášho života.<font color='#B71C1C'> – R.</font>"},
            {"27", "5", "1", "Ž 9, 2-3. 6+16. 8-9",
                    "<font color='#B71C1C'>R.:</font> Pán bude spravodlivo súdiť celý svet.<br><br>" +
                            "Oslavovať ťa budem, Pane, celým svojím srdcom <font color='#B71C1C'>*</font><br>" +
                            "a vyrozprávam všetky tvoje diela zázračné.<br>" +
                            "V tebe sa budem tešiť a radovať, <font color='#B71C1C'>*</font><br>" +
                            "ospevovať budem tvoje meno, Najvyšší.<font color='#B71C1C'> – R.</font><br>" +
                            "Zahriakol si pohanov a vyničil si rod bezbožný, <font color='#B71C1C'>*</font><br>" +
                            "ich meno si vyhladil navždy, naveky.<br>" +
                            "Pohania padli do jamy, ktorú kopali, <font color='#B71C1C'>†</font><br>" +
                            "a v tom osídle, čo nastrojili, <font color='#B71C1C'>*</font><br>" +
                            "chytila sa im vlastná noha.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán tróni naveky, <font color='#B71C1C'>*</font><br>" +
                            "už si pripravil stolec sudcovský.<br>" +
                            "A spravodlivo bude súdiť svet, <font color='#B71C1C'>*</font><br>" +
                            "podľa práva bude súdiť národy.<font color='#B71C1C'> – R.</font>"},
            {"27", "5", "2", "Ž 111, 1-2. 3-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Pán má svoju zmluvu stále na mysli.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Z celého srdca chcem oslavovať Pána <font color='#B71C1C'>*</font><br>" +
                            "v zbore spravodlivých i v zhromaždení.<br>" +
                            "Veľké sú diela Pánove; <font color='#B71C1C'>*</font><br>" +
                            "nech ich skúmajú všetci, čo majú v nich záľubu.<font color='#B71C1C'> – R.</font><br>" +
                            "Nádherné a vznešené sú jeho diela, <font color='#B71C1C'>*</font><br>" +
                            "jeho spravodlivosť platí naveky.<br>" +
                            "Ustanovil pamiatku na svoje obdivuhodné skutky; <font color='#B71C1C'>*</font><br>" +
                            "Pán je milosrdný a milostivý.<font color='#B71C1C'> – R.</font><br>" +
                            "Pokrm dal tým, čo sa ho boja; <font color='#B71C1C'>*</font><br>" +
                            "svoju zmluvu má stále na mysli.<br>" +
                            "Svoje mocné skutky oznámil svojmu ľudu <font color='#B71C1C'>*</font><br>" +
                            "a dal im dedičstvo pohanov.<font color='#B71C1C'> – R.</font>"},
            {"27", "6", "1", "Ž 97, 1-2. 5-6. 11-12",
                    "<font color='#B71C1C'>R.:</font> Radujte sa, spravodliví, tešte sa v Pánovi.<br><br>" +
                            "Pán kraľuje, jasaj, zem; <font color='#B71C1C'>*</font><br>" +
                            "radujte sa, všetky ostrovy.<br>" +
                            "Vôkol neho oblaky a mrákavy, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a právo sú základom jeho trónu.<font color='#B71C1C'> – R.</font><br>" +
                            "Ako vosk sa topia vrchy pred tvárou Pánovou, <font color='#B71C1C'>*</font><br>" +
                            "pred Pánom celej zeme.<br>" +
                            "Jeho spravodlivosť ohlasujú nebesia <font color='#B71C1C'>*</font><br>" +
                            "a jeho slávu vidia všetky národy.<font color='#B71C1C'> – R.</font><br>" +
                            "Vychádza svetlo spravodlivému <font color='#B71C1C'>*</font><br>" +
                            "a radosť tým, čo majú srdcia úprimné.<br>" +
                            "Radujte sa, spravodliví, v Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a oslavujte jeho sväté meno.<font color='#B71C1C'> – R.</font>"},
            {"27", "6", "2", "Ž 105, 2-3. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Pán večne pamätá na svoju zmluvu.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Spievajte mu a hrajte, <font color='#B71C1C'>*</font><br>" +
                            "rozprávajte o jeho obdivuhodných skutkoch.<br>" +
                            "Jeho svätým menom sa honoste; <font color='#B71C1C'>*</font><br>" +
                            "nech sa radujú srdcia tých, čo hľadajú Pána.<font color='#B71C1C'> – R.</font><br>" +
                            "Hľadajte Pána a jeho moc, <font color='#B71C1C'>*</font><br>" +
                            "hľadajte vždy jeho tvár.<br>" +
                            "Pamätajte na divy, čo učinil, <font color='#B71C1C'>*</font><br>" +
                            "na jeho znamenia a na výroky jeho úst,<font color='#B71C1C'> – R.</font><br>" +
                            "vy, potomci Abraháma, Pánovho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "synovia Jakuba, vyvoleného Pánovho.<br>" +
                            "On, Pán, je náš Boh; <font color='#B71C1C'>*</font><br>" +
                            "jeho rozhodnutia platia po celej zemi.<font color='#B71C1C'> – R.</font>"},
            {"28", "A", "", "Ž 23, 1-3. 4. 5. 6",
                    "<font color='#B71C1C'>R.:</font> Budem bývať v dome Pánovom mnoho a mnoho dní.<br><br>" +
                            "Pán je môj pastier, nič mi nechýba: <font color='#B71C1C'>*</font><br>" +
                            "pasie ma na zelených pašienkach.<br>" +
                            "Vodí ma k tichým vodám, <font color='#B71C1C'>*</font><br>" +
                            "dušu mi osviežuje.<br>" +
                            "Vodí ma po správnych chodníkoch, <font color='#B71C1C'>*</font><br>" +
                            "verný svojmu menu.<font color='#B71C1C'> – R.</font><br>" +
                            "I keby som mal ísť tmavou dolinou, <font color='#B71C1C'>†</font><br>" +
                            "nebudem sa báť zlého, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si so mnou.<br>" +
                            "Tvoj prút a tvoja palica, <font color='#B71C1C'>*</font><br>" +
                            "tie sú mi útechou.<font color='#B71C1C'> – R.</font><br>" +
                            "Prestieraš mi stôl <font color='#B71C1C'>*</font><br>" +
                            "pred očami mojich protivníkov.<br>" +
                            "Leješ mi olej na hlavu <font color='#B71C1C'>*</font><br>" +
                            "a kalich mi napĺňaš až po okraj.<font color='#B71C1C'> – R.</font><br>" +
                            "Dobrota a milosť budú ma sprevádzať <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni môjho života.<br>" +
                            "A budem bývať v dome Pánovom <font color='#B71C1C'>*</font><br>" +
                            "mnoho a mnoho dní.<font color='#B71C1C'> – R.</font>"},
            {"28", "B", "", "Ž 90, 12-13. 14-15. 16-17",
                    "<font color='#B71C1C'>R.:</font> Obdaruj nás, Pane, múdrosťou srdca.<br><br>" +
                            "Nauč nás rátať naše dni, <font color='#B71C1C'>*</font><br>" +
                            "aby sme našli múdrosť srdca.<br>" +
                            "Obráť sa k nám, Pane; dokedy budeš meškať? <font color='#B71C1C'>*</font><br>" +
                            "Zľutuj sa nad svojimi služobníkmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Hneď zrána nás naplň svojou milosťou <font color='#B71C1C'>*</font><br>" +
                            "a budeme jasať a radovať sa po všetky dni života.<br>" +
                            "Rozveseľ nás za dni, keď si nás ponížil, <font color='#B71C1C'>*</font><br>" +
                            "za roky, keď sme okusovali nešťastie.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech sa tvoje dielo zjaví tvojim služobníkom <font color='#B71C1C'>*</font><br>" +
                            "a ich deťom tvoja nádhera.<br>" +
                            "Nech je nad nami dobrotivosť Pána, nášho Boha; <font color='#B71C1C'>†</font><br>" +
                            "upevňuj dielo našich rúk, <font color='#B71C1C'>*</font><br>" +
                            "dielo našich rúk upevňuj!<font color='#B71C1C'> – R.</font>"},
            {"28", "C", "", "Ž 98, 1. 2-3b. 3c-4",
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
                            "plesajte, radujte sa a hrajte.<font color='#B71C1C'> – R.</font>"},
            {"28", "1", "1", "Ž 98, 1. 2-3b. 3c-4",
                    "<font color='#B71C1C'>R.:</font> Pán oznámil svoju spásu.<br><br>" +
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
                            "plesajte, radujte sa a hrajte.<font color='#B71C1C'> – R.</font>"},
            {"28", "1", "2", "Ž 113, 1-2. 3-4. 5a+6-7",
                    "<font color='#B71C1C'>R.:</font> Nech je velebené meno Pánovo odteraz až naveky.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Chváľte, služobníci Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "chváľte meno Pánovo.<br>" +
                            "Nech je velebené meno Pánovo <font color='#B71C1C'>*</font><br>" +
                            "odteraz až naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Od východu slnka až po západ <font color='#B71C1C'>*</font><br>" +
                            "nech je oslávené meno Pánovo.<br>" +
                            "Vyvýšený je Pán nad všetky národy <font color='#B71C1C'>*</font><br>" +
                            "a jeho sláva nad nebesia.<font color='#B71C1C'> – R.</font><br>" +
                            "Kto je ako Pán, náš Boh, <font color='#B71C1C'>†</font><br>" +
                            "čo dbá o všetko nepatrné <font color='#B71C1C'>*</font><br>" +
                            "na nebi i na zemi?<br>" +
                            "Z prachu dvíha chudobného <font color='#B71C1C'>*</font><br>" +
                            "a zo smetiska povyšuje bedára.<font color='#B71C1C'> – R.</font>"},
            {"28", "2", "1", "Ž 19, 2-3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Nebesia rozprávajú o sláve Boha.<br><br>" +
                            "Nebesia rozprávajú o sláve Boha <font color='#B71C1C'>*</font><br>" +
                            "a obloha hlása dielo jeho rúk.<br>" +
                            "Deň dňu o tom podáva správu <font color='#B71C1C'>*</font><br>" +
                            "a noc noci to dáva na známosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Nie sú to slová, nie je to reč, <font color='#B71C1C'>*</font><br>" +
                            "ktorá by sa nedala počuť.<br>" +
                            "Po celej zemi rozlieha sa ich hlas <font color='#B71C1C'>*</font><br>" +
                            "a ich slová až po končiny sveta.<font color='#B71C1C'> – R.</font>"},
            {"28", "2", "2", "Ž 119, 41. 43. 44. 45. 47. 48",
                    "<font color='#B71C1C'>R.:</font> Pane, nech zostúpi na mňa tvoje zmilovanie.<br><br>" +
                            "Pane, nech zostúpi na mňa tvoje zmilovanie, <font color='#B71C1C'>*</font><br>" +
                            "tvoja pomoc, ktorú si mi prisľúbil.<font color='#B71C1C'> – R.</font><br>" +
                            "Nikdy neodním slovo pravdy z mojich úst, <font color='#B71C1C'>*</font><br>" +
                            "veľmi dôverujem tvojim výrokom.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvojho zákona sa chcem stále pridŕžať, <font color='#B71C1C'>*</font><br>" +
                            "na večné veky.<font color='#B71C1C'> – R.</font><br>" +
                            "Tak budem kráčať bezpečnou cestou, <font color='#B71C1C'>*</font><br>" +
                            "lebo dbám na tvoje príkazy.<font color='#B71C1C'> – R.</font><br>" +
                            "Budem sa tešiť z tvojich predpisov, <font color='#B71C1C'>*</font><br>" +
                            "lebo som si ich obľúbil.<font color='#B71C1C'> – R.</font><br>" +
                            "Svoje ruky budem dvíhať k tvojim predpisom,<br>" +
                            "ktoré som si obľúbil <font color='#B71C1C'>*</font><br>" +
                            "a cvičiť sa budem v tvojich príkazoch.<font color='#B71C1C'> – R.</font>"},
            {"28", "3", "1", "Ž 62, 2-3. 6-7. 9",
                    "<font color='#B71C1C'>R.:</font> Ty, Pane, každému odplácaš podľa jeho skutkov.<br><br>" +
                            "Iba v Bohu spočiň, duša moja, <font color='#B71C1C'>*</font><br>" +
                            "lebo od neho mi prichádza spása.<br>" +
                            "Iba on je moje útočište a moja spása, <font color='#B71C1C'>*</font><br>" +
                            "moja opora, nezakolíšem sa nikdy viac.<font color='#B71C1C'> – R.</font><br>" +
                            "Iba v Bohu spočiň, duša moja, <font color='#B71C1C'>*</font><br>" +
                            "lebo len on mi dáva nádej.<br>" +
                            "Iba on je moje útočište a moja spása, <font color='#B71C1C'>*</font><br>" +
                            "moja opora, nezakolíšem sa.<font color='#B71C1C'> – R.</font><br>" +
                            "Dúfajte v neho, ľudia, v každom čase, <font color='#B71C1C'>†</font><br>" +
                            "pred ním si srdce otvorte; <font color='#B71C1C'>*</font><br>" +
                            "Boh je naše útočište.<font color='#B71C1C'> – R.</font>"},
            {"28", "3", "2", "Ž 1, 1-2. 3. 4+6",
                    "<font color='#B71C1C'>R.:</font> Pane, kto nasleduje teba, bude mať svetlo života.<br><br>" +
                            "Blažený človek, čo nekráča podľa rady bezbožných <font color='#B71C1C'>†</font><br>" +
                            "a nechodí cestou hriešnikov, <font color='#B71C1C'>*</font><br>" +
                            "ani nevysedáva v kruhu rúhačov,<br>" +
                            "ale v zákone Pánovom má záľubu <font color='#B71C1C'>*</font><br>" +
                            "a o jeho zákone rozjíma dňom i nocou.<font color='#B71C1C'> – R.</font><br>" +
                            "Je ako strom zasadený pri vode, <font color='#B71C1C'>*</font><br>" +
                            "čo prináša ovocie v pravý čas,<br>" +
                            "a jeho lístie nikdy nevädne; <font color='#B71C1C'>*</font><br>" +
                            "darí sa mu všetko, čo podniká.<font color='#B71C1C'> – R.</font><br>" +
                            "No nie tak bezbožní, veru nie; <font color='#B71C1C'>*</font><br>" +
                            "tí sú ako plevy, čo vietor ženie pred sebou.<br>" +
                            "Nad cestou spravodlivých bedlí Pán, <font color='#B71C1C'>*</font><br>" +
                            "ale cesta bezbožných vedie do záhuby.<font color='#B71C1C'> – R.</font>"},
            {"28", "4", "1", "Ž 130, 1-2. 3-4. 5-6a",
                    "<font color='#B71C1C'>R.:</font> U Pána je milosrdenstvo a hojné vykúpenie.<br><br>" +
                            "Z hlbín volám k tebe, Pane; <font color='#B71C1C'>*</font><br>" +
                            "Pane, počuj môj hlas.<br>" +
                            "Nakloň svoj sluch <font color='#B71C1C'>*</font><br>" +
                            "k mojej úpenlivej prosbe.<font color='#B71C1C'> – R.</font><br>" +
                            "Ak si budeš, Pane, v pamäti uchovávať neprávosť, <font color='#B71C1C'>*</font><br>" +
                            "Pane, kto obstojí?<br>" +
                            "Ale ty si milostivý <font color='#B71C1C'>*</font><br>" +
                            "a my ti chceme v bázni slúžiť.<font color='#B71C1C'> – R.</font><br>" +
                            "Spolieham sa na teba, Pane, <font color='#B71C1C'>†</font><br>" +
                            "moja duša sa spolieha na tvoje slovo; <font color='#B71C1C'>*</font><br>" +
                            "moja duša očakáva Pána.<font color='#B71C1C'> – R.</font>"},
            {"28", "4", "2", "Ž 98, 1. 2-3b. 3c-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Tvoja spása, Pane, objíma celý svet.<br><br>" +
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
            {"28", "5", "1", "Ž 32, 1-2. 5. 11",
                    "<font color='#B71C1C'>R.:</font> Ty, Pane, si moje útočište; zahŕňaš ma radosťou zo spásy.<br><br>" +
                            "Blažený, komu sa odpustila neprávosť <font color='#B71C1C'>*</font><br>" +
                            "a je oslobodený od hriechu.<br>" +
                            "Blažený človek, ktorému Pán vinu nepripočíta <font color='#B71C1C'>*</font><br>" +
                            "a v ktorého mysli niet podvodu.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyznal som sa ti zo svojho hriechu <font color='#B71C1C'>*</font><br>" +
                            "a nezatajil som svoj priestupok.<br>" +
                            "Povedal som si: \"Vyznám Pánovi svoju neprávosť.\" <font color='#B71C1C'>*</font><br>" +
                            "A ty si mi odpustil zlobu môjho hriechu.<font color='#B71C1C'> – R.</font><br>" +
                            "Radujte sa, spravodliví, v Pánovi a plesajte, <font color='#B71C1C'>*</font><br>" +
                            "jasajte všetci, čo máte srdce úprimné.<font color='#B71C1C'> – R.</font>"},
            {"28", "5", "2", "Ž 33, 1-2. 4-5. 12-13",
                    "<font color='#B71C1C'>R.:</font> Blažený ľud, ktorý si Pán vyvolil za dedičstvo.<br><br>" +
                            "Plesajte, spravodliví, v Pánovi; <font color='#B71C1C'>*</font><br>" +
                            "statočným sluší spievať pieseň chvály.<br>" +
                            "Oslavujte Pána citarou, <font color='#B71C1C'>*</font><br>" +
                            "hrajte mu na desaťstrunovej lutne.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pánovo slovo je pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a verné všetko jeho konanie.<br>" +
                            "Miluje spravodlivosť a právo; <font color='#B71C1C'>*</font><br>" +
                            "milosti Pánovej plná je zem.<font color='#B71C1C'> – R.</font><br>" +
                            "Blažený národ, ktorého Bohom je Pán, <font color='#B71C1C'>*</font><br>" +
                            "blažený ľud, ktorý si on vyvolil za dedičstvo.<br>" +
                            "Pán hľadí z neba <font color='#B71C1C'>*</font><br>" +
                            "a vidí všetkých ľudí.<font color='#B71C1C'> – R.</font>"},
            {"28", "6", "1", "Ž 105, 6-7. 8-9. 42-43",
                    "<font color='#B71C1C'>R.:</font> Pán večne pamätá na svoju zmluvu.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Vy, potomci Abraháma, Pánovho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "synovia Jakuba, vyvoleného Pánovho.<br>" +
                            "On, Pán, je náš Boh; <font color='#B71C1C'>*</font><br>" +
                            "jeho rozhodnutia platia po celej zemi.<font color='#B71C1C'> – R.</font><br>" +
                            "Večne pamätá na svoju zmluvu, <font color='#B71C1C'>*</font><br>" +
                            "na sľub, ktorý dal pokoleniam tisícim,<br>" +
                            "na zmluvu, čo s Abrahámom uzavrel, <font color='#B71C1C'>*</font><br>" +
                            "na prísahu, ktorou sa Izákovi zaviazal.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo pamätal na slová svojho záväzku, <font color='#B71C1C'>*</font><br>" +
                            "ktoré dal Abrahámovi, svojmu služobníkovi.<br>" +
                            "Vyviedol teda svoj ľud v radosti, <font color='#B71C1C'>*</font><br>" +
                            "vyvolených svojich s plesaním.<font color='#B71C1C'> – R.</font>"},
            {"28", "6", "2", "Ž 8, 2-3a. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Svojho Syna si ustanovil za vládcu nad dielami svojich rúk.<br><br>" +
                            "Pane, náš Vládca, <font color='#B71C1C'>*</font><br>" +
                            "aké vznešené je tvoje meno na celej zemi!<br>" +
                            "Tvoja veleba sa vznáša nad nebesia. <font color='#B71C1C'>*</font><br>" +
                            "Z úst nemluvniat a dojčeniec pripravil si si chválu.<font color='#B71C1C'> – R.</font><br>" +
                            "Keď hľadím na nebesia, dielo tvojich rúk, <font color='#B71C1C'>*</font><br>" +
                            "na mesiac a na hviezdy, ktoré si ty stvoril:<br>" +
                            "čože je človek, že naň pamätáš, <font color='#B71C1C'>*</font><br>" +
                            "a syn človeka, že sa ho ujímaš?<font color='#B71C1C'> – R.</font><br>" +
                            "Stvoril si ho len o niečo menšieho od anjelov, <font color='#B71C1C'>*</font><br>" +
                            "slávou a cťou si ho ovenčil<br>" +
                            "a ustanovil si ho za vládcu nad dielami tvojich rúk. <font color='#B71C1C'>*</font><br>" +
                            "všetko si mu položil pod nohy.<font color='#B71C1C'> – R.</font>"},
            {"29", "A", "", "Ž 96, 1+3. 4-5. 7-8. 9-10ac",
                    "<font color='#B71C1C'>R.:</font> Vzdávajme Pánovi slávu a česť.<br><br>" +
                            "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>*</font><br>" +
                            "spievaj Pánovi, celá zem!<br>" +
                            "Zvestujte jeho slávu pohanom <font color='#B71C1C'>*</font><br>" +
                            "a jeho zázraky všetkým národom.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo veľký je Pán a veľkej chvály hoden, <font color='#B71C1C'>*</font><br>" +
                            "viac ako všetkých bohov treba sa ho báť.<br>" +
                            "Lebo ničoty sú všetci bohovia pohanov, <font color='#B71C1C'>*</font><br>" +
                            "ale Pán stvoril nebesia.<font color='#B71C1C'> – R.</font><br>" +
                            "Vzdávajte Pánovi, rodiny národov, <font color='#B71C1C'>*</font><br>" +
                            "vzdávajte Pánovi slávu a česť,<br>" +
                            "vzdávajte Pánovi slávu hodnu jeho mena. <font color='#B71C1C'>*</font><br>" +
                            "Prineste obetné dary a vstúpte do jeho nádvorí,<font color='#B71C1C'> – R.</font><br>" +
                            "klaňajte sa Pánovi v posvätnom rúchu. <font color='#B71C1C'>*</font><br>" +
                            "Chvej sa pred ním, celá zem.<br>" +
                            "Hlásajte medzi pohanmi: \"Pán kraľuje!\" <font color='#B71C1C'>*</font><br>" +
                            "a spravodlivo súdi národy.<font color='#B71C1C'> – R.</font>"},
            {"29", "B", "", "Ž 33, 4-5. 18-19. 20+22",
                    "<font color='#B71C1C'>R.:</font> Tvoje milosrdenstvo, Pane, nech je nad nami, ako dúfame v teba.<br><br>" +
                            "Pánovo slovo je pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a verné všetko jeho konanie.<br>" +
                            "Miluje spravodlivosť a právo; <font color='#B71C1C'>*</font><br>" +
                            "milosti Pánovej plná je zem.<font color='#B71C1C'> – R.</font><br>" +
                            "Hľa, oko Pánovo bdie nad tými, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "nad tými, čo v jeho milosrdenstvo dúfajú,<br>" +
                            "aby ich zachránil pred smrťou <font color='#B71C1C'>*</font><br>" +
                            "a v čase hladu nakŕmil.<font color='#B71C1C'> – R.</font><br>" +
                            "Naša duša očakáva Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je naša pomoc a ochrana.<br>" +
                            "Tvoje milosrdenstvo, Pane, nech je nad nami, <font color='#B71C1C'>*</font><br>" +
                            "ako dúfame v teba.<font color='#B71C1C'> – R.</font>"},
            {"29", "C", "", "Ž 121, 1-2. 3-4. 5-6. 7-8",
                    "<font color='#B71C1C'>R.:</font> Pomoc nám príde od Pána, ktorý stvoril nebo i zem.<br><br>" +
                            "Svoj zrak upieram na vrchy: <font color='#B71C1C'>*</font><br>" +
                            "príde mi odtiaľ pomoc?<br>" +
                            "Pomoc mi príde od Pána, <font color='#B71C1C'>*</font><br>" +
                            "ktorý stvoril nebo i zem.<font color='#B71C1C'> – R.</font><br>" +
                            "Nedovolí, aby sa ti noha zachvela, <font color='#B71C1C'>*</font><br>" +
                            "nezdriemne ten, čo ťa stráži.<br>" +
                            "Nedrieme veru, ani nespí <font color='#B71C1C'>*</font><br>" +
                            "ten, čo stráži Izraela.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán ťa stráži, <font color='#B71C1C'>†</font><br>" +
                            "Pán je tvoja záštita <font color='#B71C1C'>*</font><br>" +
                            "po tvojej pravici.<br>" +
                            "Za dňa ťa slnko nezraní <font color='#B71C1C'>*</font><br>" +
                            "ani mesiac za noci.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán ťa bude chrániť od všetkého zlého; <font color='#B71C1C'>*</font><br>" +
                            "Pán ti bude chrániť život.<br>" +
                            "Pán bude chrániť tvoj odchod i príchod; <font color='#B71C1C'>*</font><br>" +
                            "odteraz až naveky.<font color='#B71C1C'> – R.</font>"},
            {"29", "1", "1", "Lk 1, 69-70. 71-72. 73-75",
                    "<font color='#B71C1C'>R.:</font> Nech je zvelebený Pán, Boh Izraela, lebo navštívil svoj ľud.<br><br>" +
                            "A vzbudil nám mocného Spasiteľa <font color='#B71C1C'>*</font><br>" +
                            "z rodu Dávida, svojho služobníka,<br>" +
                            "ako odpradávna hovoril <font color='#B71C1C'>*</font><br>" +
                            "ústami svojich svätých prorokov,<font color='#B71C1C'> – R.</font><br>" +
                            "že nás oslobodí od našich nepriateľov <font color='#B71C1C'>*</font><br>" +
                            "a z rúk všetkých, čo nás nenávidia.<br>" +
                            "Preukázal milosrdenstvo našim otcom <font color='#B71C1C'>*</font><br>" +
                            "a pamätá na svoju svätú zmluvu,<font color='#B71C1C'> – R.</font><br>" +
                            "na prísahu,<br>" +
                            "ktorou sa zaviazal nášmu otcovi Abrahámovi, <font color='#B71C1C'>*</font><br>" +
                            "že nás vyslobodí z rúk nepriateľov,<br>" +
                            "aby sme mu bez strachu slúžili <font color='#B71C1C'>*</font><br>" +
                            "vo svätosti a spravodlivosti pred jeho tvárou<br>" +
                            "po všetky dni nášho života.<font color='#B71C1C'> – R.</font>"},
            {"29", "1", "2", "Ž 100, 2. 3. 4. 5",
                    "<font color='#B71C1C'>R.:</font> Pán je náš stvoriteľ a jemu patríme.<br><br>" +
                            "Jasaj na chválu Pánovi, celá zem, <font color='#B71C1C'>†</font><br>" +
                            "s radosťou slúžte Pánovi. <font color='#B71C1C'>*</font><br>" +
                            "S plesaním vstupujte pred jeho tvár.<font color='#B71C1C'> – R.</font><br>" +
                            "Vedzte, že náš Pán je Boh; <font color='#B71C1C'>†</font><br>" +
                            "on je náš stvoriteľ a jemu patríme, <font color='#B71C1C'>*</font><br>" +
                            "sme jeho ľud a ovce z jeho stáda.<font color='#B71C1C'> – R.</font><br>" +
                            "Vstupujte do jeho brán s piesňou chvály <font color='#B71C1C'>†</font><br>" +
                            "a do jeho nádvorí s piesňami oslavnými; <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho a velebte jeho meno.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán je dobrý; <font color='#B71C1C'>†</font><br>" +
                            "jeho milosrdenstvo trvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho vernosť z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"29", "2", "1", "Ž 40, 7-8a. 8b-9. 10. 17",
                    "<font color='#B71C1C'>R.:</font> Hľa, prichádzam, Pane, chcem plniť tvoju vôľu.<br><br>" +
                            "Obety a dary si nepraješ, <font color='#B71C1C'>*</font><br>" +
                            "lež uši si mi otvoril.<br>" +
                            "Nežiadaš žertvu ani obetu zmierenia, <font color='#B71C1C'>*</font><br>" +
                            "preto som povedal: \"Hľa, prichádzam.<font color='#B71C1C'> – R.</font><br>" +
                            "Vo zvitku knihy je napísané o mne, <font color='#B71C1C'>*</font><br>" +
                            "že mám plniť tvoju vôľu.<br>" +
                            "A to chcem, Bože môj, <font color='#B71C1C'>*</font><br>" +
                            "hlboko v srdci mám tvoj zákon.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Ohlasujem tvoju spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "vo veľkom zhromaždení;<br>" +
                            "svojim perám hovoriť nebránim, <font color='#B71C1C'>*</font><br>" +
                            "Pane, ty to vieš.<font color='#B71C1C'> – R.</font><br>" +
                            "No nech jasajú a nech sa v tebe tešia všetci, <font color='#B71C1C'>*</font><br>" +
                            "čo ťa hľadajú.<br>" +
                            "A tí, čo túžia po tvojej pomoci, nech stále hovoria: <font color='#B71C1C'>*</font><br>" +
                            "\"Nech je zvelebený Pán!\"<font color='#B71C1C'> – R.</font>"},
            {"29", "2", "2", "Ž 85, 9ab+10. 11-12. 13-14",
                    "<font color='#B71C1C'>R.:</font> Pán, Boh, ohlási pokoj svojmu ľudu a svojim svätým.<br><br>" +
                            "Budem počúvať, čo povie Pán, Boh; <font color='#B71C1C'>*</font><br>" +
                            "on ohlási pokoj svojmu ľudu a svojim svätým.<br>" +
                            "Naozaj: blízko je spása tým, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "a jeho sláva bude prebývať v našej krajine.<font color='#B71C1C'> – R.</font><br>" +
                            "Milosrdenstvo a vernosť sa stretnú navzájom, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť a pokoj sa pobozkajú.<br>" +
                            "Vernosť vyrastie zo zeme, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť zhliadne z neba.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď Pán dá požehnanie <font color='#B71C1C'>*</font><br>" +
                            "a svoje plody vydá naša zem.<br>" +
                            "Pred ním bude kráčať spravodlivosť <font color='#B71C1C'>*</font><br>" +
                            "a po stopách jeho krokov spása.<font color='#B71C1C'> – R.</font>"},
            {"29", "3", "1", "Ž 124, 1-3. 4-6. 7-8",
                    "<font color='#B71C1C'>R.:</font> Naša pomoc v mene Pánovom, ktorý stvoril nebo i zem.<br><br>" +
                            "Keby sa nás Pán nebol ujal, <font color='#B71C1C'>*</font><br>" +
                            "nech to povie Izrael,<br>" +
                            "keby sa nás Pán nebol ujal, <font color='#B71C1C'>*</font><br>" +
                            "keď ľudia povstali proti nám,<br>" +
                            "vari by nás živých boli prehltli, <font color='#B71C1C'>*</font><br>" +
                            "keď proti nám blčala ich zúrivosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Vari by nás bola voda zaliala <font color='#B71C1C'>*</font><br>" +
                            "a riava sa prevalila cez nás.<br>" +
                            "Vari by sa boli prevalili cez nás <font color='#B71C1C'>*</font><br>" +
                            "rozbúrené vody.<br>" +
                            "Nech je velebený Pán, <font color='#B71C1C'>*</font><br>" +
                            "že nás nevydal ich zubom za korisť.<font color='#B71C1C'> – R.</font><br>" +
                            "Naša duša unikla ako vtáča <font color='#B71C1C'>*</font><br>" +
                            "zo siete poľovníkov.<br>" +
                            "Slučka sa roztrhla <font color='#B71C1C'>*</font><br>" +
                            "a my sme na slobode.<br>" +
                            "Naša pomoc v mene Pánovom, <font color='#B71C1C'>*</font><br>" +
                            "ktorý stvoril nebo i zem.<font color='#B71C1C'> – R.</font>"},
            {"29", "3", "2", "Iz 12, 2-3. 4b-d. 5-6",
                    "<font color='#B71C1C'>R.:</font> Čerpajte vodu s radosťou z prameňov spásy.<br><br>" +
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
            {"29", "4", "1", "Ž 1, 1-2. 3. 4+6",
                    "<font color='#B71C1C'>R.:</font> Blažený človek, čo v Pána skladá dôveru.<br><br>" +
                            "Blažený človek, čo nekráča podľa rady bezbožných <font color='#B71C1C'>†</font><br>" +
                            "a nechodí cestou hriešnikov, <font color='#B71C1C'>*</font><br>" +
                            "ani nevysedáva v kruhu rúhačov,<br>" +
                            "ale v zákone Pánovom má záľubu <font color='#B71C1C'>*</font><br>" +
                            "a o jeho zákone rozjíma dňom i nocou.<font color='#B71C1C'> – R.</font><br>" +
                            "Je ako strom zasadený pri vode, <font color='#B71C1C'>*</font><br>" +
                            "čo prináša ovocie v pravý čas,<br>" +
                            "a jeho lístie nikdy nevädne; <font color='#B71C1C'>*</font><br>" +
                            "darí sa mu všetko, čo podniká.<font color='#B71C1C'> – R.</font><br>" +
                            "No nie tak bezbožní, veru nie; <font color='#B71C1C'>*</font><br>" +
                            "tí sú ako plevy, čo vietor ženie pred sebou.<br>" +
                            "Nad cestou spravodlivých bedlí Pán, <font color='#B71C1C'>*</font><br>" +
                            "ale cesta bezbožných vedie do záhuby.<font color='#B71C1C'> – R.</font>"},
            {"29", "4", "2", "Ž 33, 1-2. 4-5. 11-12. 18-19",
                    "<font color='#B71C1C'>R.:</font> Milosti Pánovej plná je zem.<br><br>" +
                            "Plesajte, spravodliví, v Pánovi; <font color='#B71C1C'>*</font><br>" +
                            "statočným sluší spievať pieseň chvály.<br>" +
                            "Oslavujte Pána citarou, <font color='#B71C1C'>*</font><br>" +
                            "hrajte mu na desaťstrunovej lutne.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pánovo slovo je pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a verné všetko jeho konanie.<br>" +
                            "Miluje spravodlivosť a právo; <font color='#B71C1C'>*</font><br>" +
                            "milosti Pánovej plná je zem.<font color='#B71C1C'> – R.</font><br>" +
                            "Pánov úmysel trvá naveky, <font color='#B71C1C'>*</font><br>" +
                            "myšlienky jeho srdca z pokolenia na pokolenie.<br>" +
                            "Blažený národ, ktorého Bohom je Pán, <font color='#B71C1C'>*</font><br>" +
                            "blažený ľud, ktorý si on vyvolil za dedičstvo.<font color='#B71C1C'> – R.</font><br>" +
                            "Hľa, oko Pánovo bdie nad tými, čo sa ho boja, <font color='#B71C1C'>*</font><br>" +
                            "nad tými, čo v jeho milosrdenstvo dúfajú,<br>" +
                            "aby ich zachránil pred smrťou <font color='#B71C1C'>*</font><br>" +
                            "a v čase hladu nakŕmil.<font color='#B71C1C'> – R.</font>"},
            {"29", "5", "1", "Ž 119, 66. 68. 76. 77. 93. 94",
                    "<font color='#B71C1C'>R.:</font> Daj mi poznať, Pane, tvoju spravodlivosť.<br><br>" +
                            "Nauč ma dobrotivosti, múdrosti a poznaniu, <font color='#B71C1C'>*</font><br>" +
                            "veď verím tvojej náuke.<font color='#B71C1C'> – R.</font><br>" +
                            "Dobrotivý si a preukazuješ dobrodenia, <font color='#B71C1C'>*</font><br>" +
                            "daj mi poznať tvoju spravodlivosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Buď ku mne milosrdný a poteš ma, <font color='#B71C1C'>*</font><br>" +
                            "ako si prisľúbil svojmu služobníkovi.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech zostúpi na mňa tvoje zľutovanie a budem žiť, <font color='#B71C1C'>*</font><br>" +
                            "lebo tvoj zákon je mojím potešením.<font color='#B71C1C'> – R.</font><br>" +
                            "Nikdy nezabudnem na tvoje príkazy, <font color='#B71C1C'>*</font><br>" +
                            "lebo nimi ma oživuješ.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoj som: zachráň ma, <font color='#B71C1C'>*</font><br>" +
                            "veď dbám na tvoje príkazy.<font color='#B71C1C'> – R.</font>"},
            {"29", "5", "2", "Ž 24, 1-2. 3-4b. 5-6",
                    "<font color='#B71C1C'>R.:</font> S úprimným srdcom hľadáme tvoju tvár, Pane.<br><br>" +
                            "Pánova je zem i všetko, čo ju napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "okruh zeme aj tí, čo bývajú na ňom.<br>" +
                            "Veď on sám položil jeho základy na moriach <font color='#B71C1C'>*</font><br>" +
                            "a upevnil ho na vodách.<font color='#B71C1C'> – R.</font><br>" +
                            "Kto smie vystúpiť na vrch Pánov, <font color='#B71C1C'>*</font><br>" +
                            "kto smie stáť na jeho mieste posvätnom?<br>" +
                            "Ten, čo má ruky nevinné a srdce čisté, <font color='#B71C1C'>*</font><br>" +
                            "čo nedvíha svoju dušu k márnosti.<font color='#B71C1C'> – R.</font><br>" +
                            "Taký dostane požehnanie od Pána <font color='#B71C1C'>*</font><br>" +
                            "a odmenu od Boha, svojho spasiteľa.<br>" +
                            "To je pokolenie tých, čo ho hľadajú, <font color='#B71C1C'>*</font><br>" +
                            "čo hľadajú tvár Boha Jakubovho.<font color='#B71C1C'> – R.</font>"},
            {"29", "6", "1", "Ž 24, 1-2. 3-4b. 5-6",
                    "<font color='#B71C1C'>R.:</font> S úprimným srdcom hľadáme tvoju tvár, Pane.<br><br>" +
                            "Pánova je zem i všetko, čo ju napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "okruh zeme aj tí, čo bývajú na ňom.<br>" +
                            "Veď on sám položil jeho základy na moriach <font color='#B71C1C'>*</font><br>" +
                            "a upevnil ho na vodách.<font color='#B71C1C'> – R.</font><br>" +
                            "Kto smie vystúpiť na vrch Pánov, <font color='#B71C1C'>*</font><br>" +
                            "kto smie stáť na jeho mieste posvätnom?<br>" +
                            "Ten, čo má ruky nevinné a srdce čisté, <font color='#B71C1C'>*</font><br>" +
                            "čo nedvíha svoju dušu k márnosti.<font color='#B71C1C'> – R.</font><br>" +
                            "Taký dostane požehnanie od Pána <font color='#B71C1C'>*</font><br>" +
                            "a odmenu od Boha, svojho spasiteľa.<br>" +
                            "To je pokolenie tých, čo ho hľadajú, <font color='#B71C1C'>*</font><br>" +
                            "čo hľadajú tvár Boha Jakubovho.<font color='#B71C1C'> – R.</font>"},
            {"29", "6", "2", "Ž 122, 1-2. 3-4a. 4b-5",
                    "<font color='#B71C1C'>R.:</font> S radosťou pôjdeme do domu Pánovho.<br><br>" +
                            "Zaradoval som sa, keď mi povedali: <font color='#B71C1C'>*</font><br>" +
                            "\"Pôjdeme do domu Pánovho.\"<br>" +
                            "Naše nohy už stoja <font color='#B71C1C'>*</font><br>" +
                            "v tvojich bránach, Jeruzalem.<font color='#B71C1C'> – R.</font><br>" +
                            "Jeruzalem je vystavaný ako mesto <font color='#B71C1C'>*</font><br>" +
                            "spojené v jeden celok.<br>" +
                            "Tam prichádzajú kmene, <font color='#B71C1C'>*</font><br>" +
                            "kmene Pánove,<font color='#B71C1C'> – R.</font><br>" +
                            "aby podľa obyčaje Izraela <font color='#B71C1C'>*</font><br>" +
                            "velebili meno Pánovo.<br>" +
                            "Lebo sú tam súdne stolice, <font color='#B71C1C'>*</font><br>" +
                            "stolice domu Dávidovho.<font color='#B71C1C'> – R.</font>"},
            {"30", "A", "", "Ž 18, 2-3a. 3b-4. 47+51ab",
                    "<font color='#B71C1C'>R.:</font> Milujem ťa, Pane, ty moja sila.<br><br>" +
                            "Milujem ťa, Pane, moja sila; <font color='#B71C1C'>*</font><br>" +
                            "Pane, opora moja, útočište moje, osloboditeľ môj.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože môj, moja pomoc, tebe dôverujem; <font color='#B71C1C'>*</font><br>" +
                            "ty si môj štít, sila mojej spásy a môj ochranca.<br>" +
                            "Vzývať budem Pána, lebo jemu patrí chvála, <font color='#B71C1C'>*</font><br>" +
                            "a budem zachránený pred nepriateľmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech žije Pán, nech je zvelebený môj Záchranca, <font color='#B71C1C'>*</font><br>" +
                            "nech je vyvýšený Boh, moja spása.<br>" +
                            "Svojmu kráľovi dávaš veľké víťazstvá, <font color='#B71C1C'>*</font><br>" +
                            "preukazuješ priazeň svojmu pomazanému.<font color='#B71C1C'> – R.</font>"},
            {"30", "B", "", "Ž 126, 1-2b. 2c-3. 4-5. 6",
                    "<font color='#B71C1C'>R.:</font> Veľké veci urobil s nami Pán a máme z toho radosť.<br><br>" +
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
            {"30", "C", "", "Ž 34, 2-3. 17-18. 19+23",
                    "<font color='#B71C1C'>R.:</font> Úbožiak zavolal a Pán ho vyslyšal.<br><br>" +
                            "Pána chcem velebiť v každom čase, <font color='#B71C1C'>*</font><br>" +
                            "moje ústa budú ho vždy chváliť.<br>" +
                            "V Pánovi sa bude chváliť moja duša; <font color='#B71C1C'>*</font><br>" +
                            "nechže to počujú pokorní a nech sa tešia.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvár Pánova sa odvracia od tých, čo robia zlo, <font color='#B71C1C'>*</font><br>" +
                            "a vyhladzuje ich pamiatku zo zeme.<br>" +
                            "Spravodliví volali a Pán ich vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ich zo všetkých tiesní.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán je pri tých, čo majú srdce skrúšené, <font color='#B71C1C'>*</font><br>" +
                            "a zachraňuje zlomených na duchu.<br>" +
                            "Pán vykúpi duše svojich služobníkov, <font color='#B71C1C'>*</font><br>" +
                            "nebudú potrestaní tí, čo v neho dúfajú.<font color='#B71C1C'> – R.</font>"},
            {"30", "1", "1", "Ž 68, 2+4. 6-7b. 20-21",
                    "<font color='#B71C1C'>R.:</font> Náš Boh je Boh spásy, on je náš Pán.<br><br>" +
                            "Boh vstáva a jeho nepriatelia sa tratia, <font color='#B71C1C'>*</font><br>" +
                            "spred jeho tváre utekajú tí, čo ho nenávidia.<br>" +
                            "Ale spravodliví sa môžu tešiť a jasať pred Božou tvárou <font color='#B71C1C'>*</font><br>" +
                            "a v radosti sa veseliť.<font color='#B71C1C'> – R.</font><br>" +
                            "On je otec sirôt a záchranca vdov, <font color='#B71C1C'>*</font><br>" +
                            "on je Boh vo svojom svätom príbytku.<br>" +
                            "On je Boh, čo opusteným dáva prebývať v domoch, <font color='#B71C1C'>*</font><br>" +
                            "väzňov privádza k šťastiu.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech je velebený Pán deň čo deň; <font color='#B71C1C'>*</font><br>" +
                            "nesie nás Boh, naša spása.<br>" +
                            "Náš Boh je Boh spásy, <font color='#B71C1C'>*</font><br>" +
                            "on je Pán, čo zo smrti dáva uniknúť.<font color='#B71C1C'> – R.</font>"},
            {"30", "1", "2", "Ž 1, 1-2. 3. 4+6",
                    "<font color='#B71C1C'>R.:</font> Napodobňujme Boha ako jeho milované deti.<br><br>" +
                            "Blažený človek, čo nekráča podľa rady bezbožných <font color='#B71C1C'>†</font><br>" +
                            "a nechodí cestou hriešnikov, <font color='#B71C1C'>*</font><br>" +
                            "ani nevysedáva v kruhu rúhačov,<br>" +
                            "ale v zákone Pánovom má záľubu <font color='#B71C1C'>*</font><br>" +
                            "a o jeho zákone rozjíma dňom i nocou.<font color='#B71C1C'> – R.</font><br>" +
                            "Je ako strom zasadený pri vode, <font color='#B71C1C'>*</font><br>" +
                            "čo prináša ovocie v pravý čas,<br>" +
                            "a jeho lístie nikdy nevädne; <font color='#B71C1C'>*</font><br>" +
                            "darí sa mu všetko, čo podniká.<font color='#B71C1C'> – R.</font><br>" +
                            "No nie tak bezbožní, veru nie; <font color='#B71C1C'>*</font><br>" +
                            "tí sú ako plevy, čo vietor ženie pred sebou.<br>" +
                            "Nad cestou spravodlivých bedlí Pán, <font color='#B71C1C'>*</font><br>" +
                            "ale cesta bezbožných vedie do záhuby.<font color='#B71C1C'> – R.</font>"},
            {"30", "2", "1", "Ž 126, 1-2b. 2c-3. 4-5. 6",
                    "<font color='#B71C1C'>R.:</font> Veľké veci urobil s nami Pán a máme z toho radosť.<br><br>" +
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
            {"30", "2", "1", "Ž 128, 1-2. 3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Blažení sú všetci, čo sa boja Pána.<br><br>" +
                            "Blažený každý, čo sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a kráča po jeho cestách.<br>" +
                            "Budeš jesť z práce svojich rúk; <font color='#B71C1C'>*</font><br>" +
                            "budeš šťastný a budeš sa mať dobre.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoja manželka je ako plodonosný vinič <font color='#B71C1C'>*</font><br>" +
                            "vnútri tvojho domu.<br>" +
                            "Tvoji synovia sú ako mládniky olivy <font color='#B71C1C'>*</font><br>" +
                            "okolo tvojho stola.<font color='#B71C1C'> – R.</font><br>" +
                            "Veru, tak bude požehnaný muž, <font color='#B71C1C'>*</font><br>" +
                            "ktorý sa bojí Pána.<br>" +
                            "Nech ťa žehná Pán zo Siona, <font color='#B71C1C'>†</font><br>" +
                            "aby si videl šťastie Jeruzalema <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni svojho života.<font color='#B71C1C'> – R.</font>"},
            {"30", "3", "1", "Ž 13, 4-5. 6",
                    "<font color='#B71C1C'>R.:</font> Pane, ja dúfam v tvoje milosrdenstvo.<br><br>" +
                            "Zhliadni na mňa a vyslyš ma, Pane, Bože môj, <font color='#B71C1C'>*</font><br>" +
                            "daj svetlo mojim očiam, aby som v smrti nezaspal,<br>" +
                            "aby nemohol povedať môj nepriateľ:<br>" +
                            "\"Premohol som ho;\" <font color='#B71C1C'>*</font><br>" +
                            "aby tí, čo ma sužujú, nezajasali, že som upadol.<font color='#B71C1C'> – R.</font><br>" +
                            "Lenže ja dúfam v tvoje milosrdenstvo, <font color='#B71C1C'>†</font><br>" +
                            "moje srdce sa teší z tvojej pomoci. <font color='#B71C1C'>*</font><br>" +
                            "Budem spievať Pánovi, že ma zahŕňa dobrodeniami.<font color='#B71C1C'> – R.</font>"},
            {"30", "3", "2", "Ž 145, 10-11. 12-13b. 13c-14",
                    "<font color='#B71C1C'>R.:</font> Pán je pravdivý vo všetkých svojich slovách<br><br>" +
                            "Nech ťa oslavujú, Pane, všetky tvoje diela <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech ťa velebia.<br>" +
                            "Nech rozprávajú o sláve tvojho kráľovstva <font color='#B71C1C'>*</font><br>" +
                            "a o tvojej moci nech hovoria;<font color='#B71C1C'> – R.</font><br>" +
                            "nech ľuďom oznamujú tvoje zázraky <font color='#B71C1C'>*</font><br>" +
                            "i slávu a velebu tvojho kráľovstva.<br>" +
                            "Tvoje kráľovstvo je kráľovstvo pre všetky veky <font color='#B71C1C'>*</font><br>" +
                            "a tvoja vláda sa rozprestiera na všetky pokolenia.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán je vo všetkých svojich slovách pravdivý, <font color='#B71C1C'>*</font><br>" +
                            "a svätý vo všetkých svojich skutkoch.<br>" +
                            "Pán podopiera všetkých, čo klesajú, <font color='#B71C1C'>*</font><br>" +
                            "a dvíha všetkých skľúčených.<font color='#B71C1C'> – R.</font>"},
            {"30", "4", "1", "Ž 109, 21-22. 26-27. 30-31",
                    "<font color='#B71C1C'>R.:</font> Zachráň ma, Pane, podľa svojho milosrdenstva.<br><br>" +
                            "Ty, Pane, Pane, pre svoje meno sa ma zastaň, <font color='#B71C1C'>*</font><br>" +
                            "veď tvoje milosrdenstvo je láskavé;<br>" +
                            "zachráň ma, lebo ja som úbohý a chudobný <font color='#B71C1C'>*</font><br>" +
                            "a moje srdce je vo mne ranené.<font color='#B71C1C'> – R.</font><br>" +
                            "Pomôž mi, Pane, Bože môj, <font color='#B71C1C'>*</font><br>" +
                            "zachráň ma podľa svojho milosrdenstva.<br>" +
                            "Nech poznajú, že to tvoja ruka, <font color='#B71C1C'>*</font><br>" +
                            "že si to ty, Pane, urobil.<font color='#B71C1C'> – R.</font><br>" +
                            "Veľmi budem oslavovať Pána svojimi ústami, <font color='#B71C1C'>*</font><br>" +
                            "budem ho chváliť uprostred zástupov,<br>" +
                            "lebo on stojí po pravom boku chudáka, <font color='#B71C1C'>*</font><br>" +
                            "aby ho zachránil pred jeho sudcami.<font color='#B71C1C'> – R.</font>"},
            {"30", "4", "2", "Ž 144, 1. 2. 9-10",
                    "<font color='#B71C1C'>R.:</font> Nech je zvelebený Pán, môj ochranca.<br><br>" +
                            "Nech je zvelebený Pán, môj ochranca, <font color='#B71C1C'>†</font><br>" +
                            "čo učí moje ruky zápasiť <font color='#B71C1C'>*</font><br>" +
                            "a moje prsty bojovať.<font color='#B71C1C'> – R.</font><br>" +
                            "On je ku mne milosrdný a dodáva mi odvahy, <font color='#B71C1C'>*</font><br>" +
                            "on je moje útočište a môj osloboditeľ;<br>" +
                            "on je moja záštita, na ktorú sa spolieham; <font color='#B71C1C'>*</font><br>" +
                            "on mi podrobuje môj ľud.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože, novú pieseň ti zaspievam; <font color='#B71C1C'>*</font><br>" +
                            "zahrám ti na desaťstrunovej citare.<br>" +
                            "Ty pomáhaš kráľom, <font color='#B71C1C'>*</font><br>" +
                            "ty zachraňuješ svojho sluhu Dávida<br>" +
                            "pred mečom záhuby.<font color='#B71C1C'> – R.</font>"},
            {"30", "5", "1", "Ž 147, 12-13. 14-15. 19-20",
                    "<font color='#B71C1C'>R.:</font> Chváľ, Jeruzalem, Pána, oslavuj, Sion, svojho Boha.<br><br>" +
                            "Chváľ, Jeruzalem, Pána, <font color='#B71C1C'>*</font><br>" +
                            "oslavuj, Sion, svojho Boha.<br>" +
                            "Lebo upevnil závory tvojich brán <font color='#B71C1C'>*</font><br>" +
                            "a požehnal tvojich synov v tebe.<font color='#B71C1C'> – R.</font><br>" +
                            "Zaisťuje pokoj tvojim hraniciam, <font color='#B71C1C'>*</font><br>" +
                            "sýti ťa najlepšou pšenicou.<br>" +
                            "Svoj rozkaz na zem zosiela; <font color='#B71C1C'>*</font><br>" +
                            "rýchlo sa šíri jeho slovo.<font color='#B71C1C'> – R.</font><br>" +
                            "On svoje slovo zvestuje Jakubovi, <font color='#B71C1C'>*</font><br>" +
                            "svoje zákony a prikázania Izraelovi.<br>" +
                            "Neurobil tak iným národom, <font color='#B71C1C'>*</font><br>" +
                            "nezjavil im svoje zámery.<font color='#B71C1C'> – R.</font>"},
            {"30", "5", "2", "Ž 111, 1-2. 3-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Nádherné a vznešené sú tvoje diela, Pane.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Z celého srdca chcem oslavovať Pána <font color='#B71C1C'>*</font><br>" +
                            "v zbore spravodlivých i v zhromaždení.<br>" +
                            "Veľké sú diela Pánove; <font color='#B71C1C'>*</font><br>" +
                            "nech ich skúmajú všetci, čo majú v nich záľubu.<font color='#B71C1C'> – R.</font><br>" +
                            "Nádherné a vznešené sú jeho diela, <font color='#B71C1C'>*</font><br>" +
                            "jeho spravodlivosť platí naveky.<br>" +
                            "Ustanovil pamiatku na svoje obdivuhodné skutky; <font color='#B71C1C'>*</font><br>" +
                            "Pán je milosrdný a milostivý.<font color='#B71C1C'> – R.</font><br>" +
                            "Pokrm dal tým, čo sa ho boja; <font color='#B71C1C'>*</font><br>" +
                            "svoju zmluvu má stále na mysli.<br>" +
                            "Svoje mocné skutky oznámil svojmu ľudu <font color='#B71C1C'>*</font><br>" +
                            "a dal im dedičstvo pohanov.<font color='#B71C1C'> – R.</font>"},
            {"30", "6", "1", "Ž 94, 12-13a. 14-15. 17-18",
                    "<font color='#B71C1C'>R.:</font> Pán neodvrhne a neopustí svoj ľud.<br><br>" +
                            "Blažený človek, ktorého ty, Pane, vzdelávaš <font color='#B71C1C'>†</font><br>" +
                            "a poúčaš o svojom zákone, <font color='#B71C1C'>*</font><br>" +
                            "aby si mu uľavil v dňoch nešťastných.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán neodvrhne svoj ľud <font color='#B71C1C'>*</font><br>" +
                            "a neopustí svoje dedičstvo.<br>" +
                            "Súd sa zasa navráti k spravodlivosti <font color='#B71C1C'>*</font><br>" +
                            "a spravodlivosťou sa budú riadiť všetci statoční.<font color='#B71C1C'> – R.</font><br>" +
                            "Keby mi Pán nebol pomohol, <font color='#B71C1C'>*</font><br>" +
                            "už by som bol býval v ríši mlčania.<br>" +
                            "Ledva poviem: \"Noha sa mi potkýna,\" <font color='#B71C1C'>*</font><br>" +
                            "hneď ma, Pane, podopiera tvoja dobrota.<font color='#B71C1C'> – R.</font>"},
            {"30", "6", "2", "Ž 42, 2. 3. 5b-e",
                    "<font color='#B71C1C'>R.:</font> Po Bohu žízni moja duša, po Bohu živom.<br><br>" +
                            "Ako jeleň dychtí za vodou z prameňa, <font color='#B71C1C'>*</font><br>" +
                            "tak moja duša, Bože, túži za tebou.<font color='#B71C1C'> – R.</font><br>" +
                            "Po Bohu žízni moja duša, po Bohu živom; <font color='#B71C1C'>*</font><br>" +
                            "kedyže už prídem k nemu a uzriem Božiu tvár?<font color='#B71C1C'> – R.</font><br>" +
                            "Veď som putoval ku vznešenému stánku <font color='#B71C1C'>*</font><br>" +
                            "a vstupoval do domu Božieho<br>" +
                            "s radostným plesaním a s piesňou ďakovnou <font color='#B71C1C'>*</font><br>" +
                            "uprostred zástupov sláviacich sviatky.<font color='#B71C1C'> – R.</font>"},
            {"31", "A", "", "Ž 131, 1. 2. 3",
                    "<font color='#B71C1C'>R.:</font> Pane, zachovaj moju dušu v tvojom pokoji.<br><br>" +
                            "Pane, moje srdce sa nevystatuje, <font color='#B71C1C'>*</font><br>" +
                            "moje oči nehľadia povýšene.<br>" +
                            "Neženiem sa za veľkými vecami <font color='#B71C1C'>*</font><br>" +
                            "ani za divmi pre mňa nedosiahnuteľnými.<font color='#B71C1C'> – R.</font><br>" +
                            "Ale ja som svoju dušu <font color='#B71C1C'>*</font><br>" +
                            "upokojil a utíšil.<br>" +
                            "Ako nasýtené dieťa v matkinom náručí, <font color='#B71C1C'>*</font><br>" +
                            "ako nasýtené dieťa, tak je moja duša vo mne.<font color='#B71C1C'> – R.</font><br>" +
                            "Dúfaj, Izrael, v Pána <font color='#B71C1C'>*</font><br>" +
                            "odteraz až naveky.<font color='#B71C1C'> – R.</font>"},
            {"31", "B", "", "Ž 18, 2-3a. 3b-4. 47+51ab",
                    "<font color='#B71C1C'>R.:</font> Milujem ťa, Pane, ty moja sila.<br><br>" +
                            "Milujem ťa, Pane, moja sila; <font color='#B71C1C'>*</font><br>" +
                            "Pane, opora moja, útočište moje, osloboditeľ môj.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože môj, moja pomoc, tebe dôverujem; <font color='#B71C1C'>*</font><br>" +
                            "ty si môj štít, sila mojej spásy a môj ochranca.<br>" +
                            "Vzývať budem Pána, lebo jemu patrí chvála, <font color='#B71C1C'>*</font><br>" +
                            "a budem zachránený pred nepriateľmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech žije Pán, nech je zvelebený môj Záchranca, <font color='#B71C1C'>*</font><br>" +
                            "nech je vyvýšený Boh, moja spása.<br>" +
                            "Svojmu kráľovi dávaš veľké víťazstvá, <font color='#B71C1C'>*</font><br>" +
                            "preukazuješ priazeň svojmu pomazanému.<font color='#B71C1C'> – R.</font>"},
            {"31", "C", "", "Ž 145, 1-2. 8-9. 10-11. 13c-14",
                    "<font color='#B71C1C'>R.:</font> Oslavovať ťa chcem naveky, Bože, môj kráľ.<br><br>" +
                            "Oslavovať ťa chcem, Bože, môj kráľ, <font color='#B71C1C'>*</font><br>" +
                            "a tvoje meno velebiť navždy a naveky.<br>" +
                            "Budem ťa velebiť každý deň <font color='#B71C1C'>*</font><br>" +
                            "a tvoje meno chváliť navždy a naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Milostivý a milosrdný je Pán, <font color='#B71C1C'>*</font><br>" +
                            "zhovievavý a veľmi láskavý.<br>" +
                            "Dobrý je Pán ku každému <font color='#B71C1C'>*</font><br>" +
                            "a milostivý ku všetkým svojim stvoreniam.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech ťa oslavujú, Pane, všetky tvoje diela <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech ťa velebia.<br>" +
                            "Nech rozprávajú o sláve tvojho kráľovstva <font color='#B71C1C'>*</font><br>" +
                            "a o tvojej moci nech hovoria;<font color='#B71C1C'> – R.</font><br>" +
                            "Pán je vo všetkých svojich slovách pravdivý <font color='#B71C1C'>*</font><br>" +
                            "a svätý vo všetkých svojich skutkoch.<br>" +
                            "Pán podopiera všetkých, čo klesajú, <font color='#B71C1C'>*</font><br>" +
                            "a dvíha všetkých skľúčených.<font color='#B71C1C'> – R.</font>"},
            {"31", "1", "1", "Ž 69, 30-31. 33-34. 36-37",
                    "<font color='#B71C1C'>R.:</font> Vo svojej veľkej láske vyslyš ma, Pane.<br><br>" +
                            "Som úbožiak, plný bolesti; <font color='#B71C1C'>*</font><br>" +
                            "tvoja pomoc, Bože, ma pozdvihne.<br>" +
                            "Piesňou chcem Božie meno osláviť <font color='#B71C1C'>*</font><br>" +
                            "a velebiť ho chválospevmi.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech zvedia o tom ponížení a nech sa potešia; <font color='#B71C1C'>*</font><br>" +
                            "hľadajte Boha a srdce vám oživne.<br>" +
                            "Lebo Pán vypočuje chudobných <font color='#B71C1C'>*</font><br>" +
                            "a nepohŕda svojimi, keď sú v zajatí.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Boh zachráni Sion <font color='#B71C1C'>†</font><br>" +
                            "a vybuduje mestá Júdove; <font color='#B71C1C'>*</font><br>" +
                            "usadia sa tam a budú ich majetkom.<br>" +
                            "A zdedia ho potomci jeho služobníkov <font color='#B71C1C'>*</font><br>" +
                            "a tí, čo milujú jeho meno, budú v ňom prebývať.<font color='#B71C1C'> – R.</font>"},
            {"31", "1", "1", "Ž 131, 1. 2. 3",
                    "<font color='#B71C1C'>R.:</font> Pane, zachovaj moju dušu v tvojom pokoji.<br><br>" +
                            "Pane, moje srdce sa nevystatuje, <font color='#B71C1C'>*</font><br>" +
                            "moje oči nehľadia povýšene.<br>" +
                            "Neženiem sa za veľkými vecami <font color='#B71C1C'>*</font><br>" +
                            "ani za divmi pre mňa nedosiahnuteľnými.<font color='#B71C1C'> – R.</font><br>" +
                            "Ale ja som svoju dušu <font color='#B71C1C'>*</font><br>" +
                            "upokojil a utíšil.<br>" +
                            "Ako nasýtené dieťa v matkinom náručí, <font color='#B71C1C'>*</font><br>" +
                            "ako nasýtené dieťa, tak je moja duša vo mne.<font color='#B71C1C'> – R.</font><br>" +
                            "Dúfaj, Izrael, v Pána <font color='#B71C1C'>*</font><br>" +
                            "odteraz až naveky.<font color='#B71C1C'> – R.</font>"},
            {"31", "2", "1", "Ž 131, 1. 2. 3",
                    "<font color='#B71C1C'>R.:</font> Pane, zachovaj moju dušu v tvojom pokoji.<br><br>" +
                            "Pane, moje srdce sa nevystatuje, <font color='#B71C1C'>*</font><br>" +
                            "moje oči nehľadia povýšene.<br>" +
                            "Neženiem sa za veľkými vecami <font color='#B71C1C'>*</font><br>" +
                            "ani za divmi pre mňa nedosiahnuteľnými.<font color='#B71C1C'> – R.</font><br>" +
                            "Ale ja som svoju dušu <font color='#B71C1C'>*</font><br>" +
                            "upokojil a utíšil.<br>" +
                            "Ako nasýtené dieťa v matkinom náručí, <font color='#B71C1C'>*</font><br>" +
                            "ako nasýtené dieťa, tak je moja duša vo mne.<font color='#B71C1C'> – R.</font><br>" +
                            "Dúfaj, Izrael, v Pána <font color='#B71C1C'>*</font><br>" +
                            "odteraz až naveky.<font color='#B71C1C'> – R.</font>"},
            {"31", "2", "2", "Ž 22, 26b-27. 28-30a. 31-32",
                    "<font color='#B71C1C'>R.:</font> Tebe, Pane, patrí moja chvála vo veľkom zhromaždení.<br><br>" +
                            "Svoje sľuby splním pred tvárou tých, čo sa boja Pána. <font color='#B71C1C'>*</font><br>" +
                            "Chudobní sa najedia a budú nasýtení<br>" +
                            "a Pána budú chváliť tí, čo ho hľadajú: <font color='#B71C1C'>*</font><br>" +
                            "\"Naveky nech žijú ich srdcia!\"<font color='#B71C1C'> – R.</font><br>" +
                            "Pána budú spomínať<br>" +
                            "a k nemu sa obrátia všetky zemské končiny, <font color='#B71C1C'>*</font><br>" +
                            "jemu sa budú klaňať všetky rodiny národov.<br>" +
                            "Veď Pánovo je kráľovstvo, <font color='#B71C1C'>†</font><br>" +
                            "on panuje nad národmi. <font color='#B71C1C'>*</font><br>" +
                            "Jemu jedinému sa budú klaňať<br>" +
                            "všetci, čo spia pod zemou.<font color='#B71C1C'> – R.</font><br>" +
                            "Jemu bude slúžiť moje potomstvo. <font color='#B71C1C'>*</font><br>" +
                            "Budúcim pokoleniam sa bude rozprávať o Pánovi<br>" +
                            "a jeho spravodlivosť budú ohlasovať ľudu,<br>" +
                            "ktorý sa narodí: <font color='#B71C1C'>*</font><br>" +
                            "\" Toto urobil Pán.\"<font color='#B71C1C'> – R.</font>"},
            {"31", "3", "1", "Ž 112, 1-2. 4-5. 9",
                    "<font color='#B71C1C'>R.:</font> V obľube je človek, čo sa zľutúva a rád pomáha.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Blažený muž, ktorý sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a má veľkú záľubu v jeho príkazoch.<br>" +
                            "Jeho potomstvo bude mocné na zemi; <font color='#B71C1C'>*</font><br>" +
                            "pokolenie spravodlivých bude požehnané.<font color='#B71C1C'> – R.</font><br>" +
                            "Spravodlivým žiari svetlo v temnotách, <font color='#B71C1C'>*</font><br>" +
                            "milosrdný, milostivý a spravodlivý.<br>" +
                            "V obľube je človek, čo sa zľutúva a rád pomáha, <font color='#B71C1C'>*</font><br>" +
                            "čo svoj majetok čestne spravuje.<font color='#B71C1C'> – R.</font><br>" +
                            "Rozdeľuje a dáva chudobným; <font color='#B71C1C'>†</font><br>" +
                            "jeho dobročinnosť potrvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho moc a sláva budú stále rásť.<font color='#B71C1C'> – R.</font>"},
            {"31", "3", "2", "Ž 27, 1. 4. 13-14",
                    "<font color='#B71C1C'>R.:</font> Pán je moje svetlo a moja spása.<br><br>" +
                            "Pán je moje svetlo a moja spása, <font color='#B71C1C'>*</font><br>" +
                            "koho sa mám báť?<br>" +
                            "Pán je ochranca môjho života, <font color='#B71C1C'>*</font><br>" +
                            "pred kým sa mám strachovať?<font color='#B71C1C'> – R.</font><br>" +
                            "O jedno prosím Pána a za tým túžim, <font color='#B71C1C'>*</font><br>" +
                            "aby som mohol bývať v dome Pánovom<br>" +
                            "po všetky dni svojho života,<br>" +
                            "aby som pociťoval nehu Pánovu <font color='#B71C1C'>*</font><br>" +
                            "a obdivoval jeho chrám.<font color='#B71C1C'> – R.</font><br>" +
                            "Verím, že uvidím dobrodenia Pánove <font color='#B71C1C'>*</font><br>" +
                            "v krajine žijúcich.<br>" +
                            "Očakávaj Pána a buď statočný; <font color='#B71C1C'>*</font><br>" +
                            "srdce maj silné a drž sa Pána.<font color='#B71C1C'> – R.</font>"},
            {"31", "4", "1", "Ž 27, 1. 4. 13-14",
                    "<font color='#B71C1C'>R.:</font> Verím, že uvidím dobrodenia Pánove v krajine žijúcich.<br><br>" +
                            "Pán je moje svetlo a moja spása, <font color='#B71C1C'>*</font><br>" +
                            "koho sa mám báť?<br>" +
                            "Pán je ochranca môjho života, <font color='#B71C1C'>*</font><br>" +
                            "pred kým sa mám strachovať?<font color='#B71C1C'> – R.</font><br>" +
                            "O jedno prosím Pána a za tým túžim, <font color='#B71C1C'>*</font><br>" +
                            "aby som mohol bývať v dome Pánovom<br>" +
                            "po všetky dni svojho života,<br>" +
                            "aby som pociťoval nehu Pánovu <font color='#B71C1C'>*</font><br>" +
                            "a obdivoval jeho chrám.<font color='#B71C1C'> – R.</font><br>" +
                            "Verím, že uvidím dobrodenia Pánove <font color='#B71C1C'>*</font><br>" +
                            "v krajine žijúcich.<br>" +
                            "Očakávaj Pána a buď statočný; <font color='#B71C1C'>*</font><br>" +
                            "srdce maj silné a drž sa Pána.<font color='#B71C1C'> – R.</font>"},
            {"31", "4", "2", "Ž 105, 2-3. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Nech sa radujú srdcia tých, čo hľadajú Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Spievajte mu a hrajte, <font color='#B71C1C'>*</font><br>" +
                            "rozprávajte o jeho obdivuhodných skutkoch.<br>" +
                            "Jeho svätým menom sa honoste; <font color='#B71C1C'>*</font><br>" +
                            "nech sa radujú srdcia tých, čo hľadajú Pána.<font color='#B71C1C'> – R.</font><br>" +
                            "Hľadajte Pána a jeho moc, <font color='#B71C1C'>*</font><br>" +
                            "hľadajte vždy jeho tvár.<br>" +
                            "Pamätajte na divy, čo učinil, <font color='#B71C1C'>*</font><br>" +
                            "na jeho znamenia a na výroky jeho úst,<font color='#B71C1C'> – R.</font><br>" +
                            "vy, potomci Abraháma, Pánovho služobníka, <font color='#B71C1C'>*</font><br>" +
                            "synovia Jakuba, vyvoleného Pánovho.<br>" +
                            "On, Pán, je náš Boh; <font color='#B71C1C'>*</font><br>" +
                            "jeho rozhodnutia platia po celej zemi.<font color='#B71C1C'> – R.</font>"},
            {"31", "5", "1", "Ž 98, 1. 2-3b. 3c-4",
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
                            "plesajte, radujte sa a hrajte.<font color='#B71C1C'> – R.</font>"},
            {"31", "5", "2", "Ž 122, 1-2. 4b-5",
                    "<font color='#B71C1C'>R.:</font> S radosťou pôjdeme do domu Pánovho.<br><br>" +
                            "Zaradoval som sa, keď mi povedali: <font color='#B71C1C'>*</font><br>" +
                            "\"Pôjdeme do domu Pánovho.\"<br>" +
                            "Naše nohy už stoja <font color='#B71C1C'>*</font><br>" +
                            "v tvojich bránach, Jeruzalem.<font color='#B71C1C'> – R.</font><br>" +
                            "Aby podľa obyčaje Izraela <font color='#B71C1C'>*</font><br>" +
                            "velebili meno Pánovo.<br>" +
                            "Lebo sú tam súdne stolice, <font color='#B71C1C'>*</font><br>" +
                            "stolice domu Dávidovho.<font color='#B71C1C'> – R.</font>"},
            {"31", "6", "1", "Ž 145, 2-3. 4-5. 10-11",
                    "<font color='#B71C1C'>R.:</font> Oslavovať ťa chcem naveky, Bože, môj kráľ.<br><br>" +
                            "Budem ťa velebiť každý deň <font color='#B71C1C'>†</font><br>" +
                            "a tvoje meno chváliť <font color='#B71C1C'>*</font><br>" +
                            "navždy a naveky.<br>" +
                            "Veľký si, Pane, a veľkej chvály hoden, <font color='#B71C1C'>*</font><br>" +
                            "tvoju veľkosť nemožno preskúmať.<font color='#B71C1C'> – R.</font><br>" +
                            "Z pokolenia na pokolenie ide chvála tvojich skutkov <font color='#B71C1C'>*</font><br>" +
                            "a všetky pokolenia ohlasujú tvoju moc.<br>" +
                            "Hovoria o vznešenosti tvojej slávy a veleby <font color='#B71C1C'>*</font><br>" +
                            "a rozprávajú o tvojich zázrakoch.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech ťa oslavujú, Pane, všetky tvoje diela <font color='#B71C1C'>*</font><br>" +
                            "a tvoji svätí nech ťa velebia.<br>" +
                            "Nech rozprávajú o sláve tvojho kráľovstva <font color='#B71C1C'>*</font><br>" +
                            "a o tvojej moci nech hovoria.<font color='#B71C1C'> – R.</font>"},
            {"31", "6", "2", "Ž 112, 1-2. 5-6. 8a+9",
                    "<font color='#B71C1C'>R.:</font> Blažený muž, ktorý sa bojí Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Blažený muž, ktorý sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a má veľkú záľubu v jeho príkazoch.<br>" +
                            "Jeho potomstvo bude mocné na zemi; <font color='#B71C1C'>*</font><br>" +
                            "pokolenie spravodlivých bude požehnané.<font color='#B71C1C'> – R.</font><br>" +
                            "V obľube je človek, čo sa zľutúva a rád pomáha, <font color='#B71C1C'>*</font><br>" +
                            "čo svoj majetok čestne spravuje;<br>" +
                            "nikdy nezakolíše. <font color='#B71C1C'>*</font><br>" +
                            "Vo večnej pamäti bude spravodlivý.<font color='#B71C1C'> – R.</font><br>" +
                            "Bezpečné je jeho srdce, nebojí sa; <font color='#B71C1C'>*</font><br>" +
                            "rozdeľuje a dáva chudobným.<br>" +
                            "Jeho dobročinnosť potrvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho moc a sláva budú stále rásť.<font color='#B71C1C'> – R.</font>"},
            {"32", "A", "", "Ž 63, 2. 3-4. 5-6. 7-8",
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
                            "Na svojom lôžku myslím na teba, <font color='#B71C1C'>*</font><br>" +
                            "o tebe rozjímam hneď za rána.<br>" +
                            "Lebo ty si mi pomáhal <font color='#B71C1C'>*</font><br>" +
                            "a pod ochranou tvojich krídel budem plesať.<font color='#B71C1C'> – R.</font>"},
            {"32", "B", "", "Ž 146, 6c-7. 8-9a. 9b-10",
                    "<font color='#B71C1C'>R.:</font> Chváľ, duša moja, Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Pán zachováva vernosť naveky, <font color='#B71C1C'>*</font><br>" +
                            "utláčaným prisudzuje právo,<br>" +
                            "hladujúcim dáva chlieb. <font color='#B71C1C'>*</font><br>" +
                            "Pán vyslobodzuje väzňov,<font color='#B71C1C'> – R.</font><br>" +
                            "Pán otvára oči slepým, <font color='#B71C1C'>*</font><br>" +
                            "Pán dvíha skľúčených,<br>" +
                            "Pán miluje spravodlivých. <font color='#B71C1C'>*</font><br>" +
                            "Pán ochraňuje cudzincov,<font color='#B71C1C'> – R.</font><br>" +
                            "ujíma sa siroty a vdovy, <font color='#B71C1C'>*</font><br>" +
                            "ale hatí cesty hriešnikov.<br>" +
                            "Pán bude kraľovať naveky; <font color='#B71C1C'>*</font><br>" +
                            "tvoj Boh, Sion, z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"32", "C", "", "Ž 17, 1. 5-6. 8+15",
                    "<font color='#B71C1C'>R.:</font> Až raz vstanem zo sna, uzriem tvoju tvár, Pane.<br><br>" +
                            "Vypočuj, Pane, moju spravodlivú žiadosť, <font color='#B71C1C'>*</font><br>" +
                            "všimni si moju prosbu pokornú.<br>" +
                            "Nakloň sluch k mojej modlitbe, <font color='#B71C1C'>*</font><br>" +
                            "čo plynie z perí úprimných.<font color='#B71C1C'> – R.</font><br>" +
                            "Pevne drž moje kroky na svojich chodníkoch, <font color='#B71C1C'>*</font><br>" +
                            "aby moje nohy nezakolísali.<br>" +
                            "K tebe, Bože, volám, lebo ty ma vyslyšíš. <font color='#B71C1C'>*</font><br>" +
                            "Nakloň ku mne sluch a vypočuj moje slová.<font color='#B71C1C'> – R.</font><br>" +
                            "Chráň ma ako zrenicu oka, <font color='#B71C1C'>*</font><br>" +
                            "skry ma v tôni svojich perutí.<br>" +
                            "Ja však v spravodlivosti uzriem tvoju tvár <font color='#B71C1C'>*</font><br>" +
                            "a až raz vstanem zo sna,<br>" +
                            "nasýtim sa pohľadom na teba.<font color='#B71C1C'> – R.</font>"},
            {"32", "1", "1", "Ž 139, 1-3. 4-6. 7-8. 9-10",
                    "<font color='#B71C1C'>R.:</font> Veď ma, Pane, po ceste k večnosti.<br><br>" +
                            "Pane, ty ma skúmaš a vieš o mne všetko; <font color='#B71C1C'>*</font><br>" +
                            "ty vieš, či sedím a či stojím.<br>" +
                            "Už zďaleka vnímaš moje myšlienky: <font color='#B71C1C'>†</font><br>" +
                            "či kráčam a či odpočívam, ty ma sleduješ. <font color='#B71C1C'>*</font><br>" +
                            "A všetky moje cesty sú ti známe.<font color='#B71C1C'> – R.</font><br>" +
                            "Hoci ešte slovo nemám ani na jazyku, <font color='#B71C1C'>*</font><br>" +
                            "ty, Pane, už vieš, čo chcem povedať.<br>" +
                            "Obklopuješ ma spredu i zozadu <font color='#B71C1C'>*</font><br>" +
                            "a kladieš na mňa svoju ruku.<br>" +
                            "Obdivuhodná pre mňa je tvoja múdrosť; <font color='#B71C1C'>*</font><br>" +
                            "je taká veľká, že ju nemôžem pochopiť.<font color='#B71C1C'> – R.</font><br>" +
                            "Kam môžem ujsť pred tvojím duchom <font color='#B71C1C'>*</font><br>" +
                            "a kam utiecť pred tvojou tvárou?<br>" +
                            "Ak vystúpim na nebesia, ty si tam; <font color='#B71C1C'>*</font><br>" +
                            "ak zostúpim do podsvetia, aj tam si.<font color='#B71C1C'> – R.</font><br>" +
                            "I keby som si pripäl krídla zorničky <font color='#B71C1C'>*</font><br>" +
                            "a ocitol sa na najvzdialenejšom mori,<br>" +
                            "ešte aj tam ma tvoja ruka povedie <font color='#B71C1C'>*</font><br>" +
                            "a podchytí ma tvoja pravica.<font color='#B71C1C'> – R.</font>"},
            {"32", "1", "2", "Ž 24, 1-2. 3-4b. 5-6",
                    "<font color='#B71C1C'>R.:</font> S úprimným srdcom hľadáme tvoju tvár, Pane.<br><br>" +
                            "Pánova je zem i všetko, čo ju napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "okruh zeme aj tí, čo bývajú na ňom.<br>" +
                            "Veď on sám položil jeho základy na moriach <font color='#B71C1C'>*</font><br>" +
                            "a upevnil ho na vodách.<font color='#B71C1C'> – R.</font><br>" +
                            "Kto smie vystúpiť na vrch Pánov, <font color='#B71C1C'>*</font><br>" +
                            "kto smie stáť na jeho mieste posvätnom?<br>" +
                            "Ten, čo má ruky nevinné a srdce čisté, <font color='#B71C1C'>*</font><br>" +
                            "čo nedvíha svoju dušu k márnosti.<font color='#B71C1C'> – R.</font><br>" +
                            "Taký dostane požehnanie od Pána <font color='#B71C1C'>*</font><br>" +
                            "a odmenu od Boha, svojho spasiteľa.<br>" +
                            "To je pokolenie tých, čo ho hľadajú, <font color='#B71C1C'>*</font><br>" +
                            "čo hľadajú tvár Boha Jakubovho.<font color='#B71C1C'> – R.</font>"},
            {"32", "2", "1", "Ž 34, 2-3. 16-17. 18-19",
                    "<font color='#B71C1C'>R.:</font> Velebiť budem Pána v každom čase.<br><br>" +
                            "Pána chcem velebiť v každom čase, <font color='#B71C1C'>*</font><br>" +
                            "moje ústa budú ho vždy chváliť.<br>" +
                            "V Pánovi sa bude chváliť moja duša; <font color='#B71C1C'>*</font><br>" +
                            "nechže to počujú pokorní a nech sa tešia.<font color='#B71C1C'> – R.</font><br>" +
                            "Pánove oči hľadia na spravodlivých <font color='#B71C1C'>*</font><br>" +
                            "a k ich volaniu sa nakláňa jeho sluch.<br>" +
                            "Tvár Pánova sa odvracia od tých, čo robia zlo, <font color='#B71C1C'>*</font><br>" +
                            "a vyhladzuje ich pamiatku zo zeme.<font color='#B71C1C'> – R.</font><br>" +
                            "Spravodliví volali a Pán ich vyslyšal <font color='#B71C1C'>*</font><br>" +
                            "a vyslobodil ich zo všetkých tiesní.<br>" +
                            "Pán je pri tých, čo majú srdce skrúšené, <font color='#B71C1C'>*</font><br>" +
                            "a zachraňuje zlomených na duchu.<font color='#B71C1C'> – R.</font>"},
            {"32", "2", "2", "Ž 37, 3-4. 18+23. 27+29",
                    "<font color='#B71C1C'>R.:</font> Spása spravodlivých prichádza od Pána.<br><br>" +
                            "Spoľahni sa na Pána a dobre rob <font color='#B71C1C'>*</font><br>" +
                            "a budeš bývať v svojej krajine a tešiť sa z bezpečia.<br>" +
                            "Hľadaj radosť v Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a dá ti, za čím túži tvoje srdce.<font color='#B71C1C'> – R.</font><br>" +
                            "O život bezúhonných sa stará Pán <font color='#B71C1C'>*</font><br>" +
                            "a ich dedičstvo trvá naveky.<br>" +
                            "Pán upevňuje kroky človeka <font color='#B71C1C'>*</font><br>" +
                            "a sprevádza ho na ceste.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyhýbaj zlu a dobre rob <font color='#B71C1C'>*</font><br>" +
                            "a budeš mať domov naveky.<br>" +
                            "Spravodliví zdedia zem, <font color='#B71C1C'>*</font><br>" +
                            "budú ju obývať na veky vekov.<font color='#B71C1C'> – R.</font>"},
            {"32", "3", "1", "Ž 82, 3-4. 6-7",
                    "<font color='#B71C1C'>R.:</font> Boh bude súdiť malých i mocných.<br><br>" +
                            "\"Prisúďte právo bedárom a sirotám, <font color='#B71C1C'>*</font><br>" +
                            "spravodlivosť vymáhajte poníženým a chudobným.<br>" +
                            "Ratujte chudobného <font color='#B71C1C'>*</font><br>" +
                            "a núdzneho vysloboďte z rúk hriešnika.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Povedal som: \"Ste bohmi, <font color='#B71C1C'>*</font><br>" +
                            "všetci ste synmi Najvyššieho.\"<br>" +
                            "Ale aj vy, ako každý človek, umriete, <font color='#B71C1C'>*</font><br>" +
                            "padnete ako každý velikáš.<font color='#B71C1C'> – R.</font>"},
            {"32", "3", "2", "Ž 23, 1-3. 4. 5. 6",
                    "<font color='#B71C1C'>R.:</font> Pán je môj pastier, nič mi nechýba.<br><br>" +
                            "Pán je môj pastier, nič mi nechýba: <font color='#B71C1C'>*</font><br>" +
                            "pasie ma na zelených pašienkach.<br>" +
                            "Vodí ma k tichým vodám, <font color='#B71C1C'>*</font><br>" +
                            "dušu mi osviežuje.<br>" +
                            "Vodí ma po správnych chodníkoch, <font color='#B71C1C'>*</font><br>" +
                            "verný svojmu menu.<font color='#B71C1C'> – R.</font><br>" +
                            "I keby som mal ísť tmavou dolinou, <font color='#B71C1C'>†</font><br>" +
                            "nebudem sa báť zlého, <font color='#B71C1C'>*</font><br>" +
                            "lebo ty si so mnou.<br>" +
                            "Tvoj prút a tvoja palica, <font color='#B71C1C'>*</font><br>" +
                            "tie sú mi útechou.<font color='#B71C1C'> – R.</font><br>" +
                            "Prestieraš mi stôl <font color='#B71C1C'>*</font><br>" +
                            "pred očami mojich protivníkov.<br>" +
                            "Leješ mi olej na hlavu <font color='#B71C1C'>*</font><br>" +
                            "a kalich mi napĺňaš až po okraj.<font color='#B71C1C'> – R.</font><br>" +
                            "Dobrota a milosť budú ma sprevádzať <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni môjho života.<br>" +
                            "A budem bývať v dome Pánovom <font color='#B71C1C'>*</font><br>" +
                            "mnoho a mnoho dní.<font color='#B71C1C'> – R.</font>"},
            {"32", "4", "1", "Ž 119, 89. 90. 91. 130. 135. 175",
                    "<font color='#B71C1C'>R.:</font> Pane, tvoje slovo trvá naveky.<br><br>" +
                            "Pane, tvoje slovo <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky ako nebesia.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoja vernosť z pokolenia na pokolenie; <font color='#B71C1C'>*</font><br>" +
                            "upevnil si zem a ona trvá.<font color='#B71C1C'> – R.</font><br>" +
                            "Podľa tvojho rozhodnutia všetko trvá podnes, <font color='#B71C1C'>*</font><br>" +
                            "lebo všetko slúži tebe.<font color='#B71C1C'> – R.</font><br>" +
                            "Výklad tvojich slov osvecuje, <font color='#B71C1C'>*</font><br>" +
                            "maličkým dáva chápavosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Vyjasni tvár nad svojím služobníkom <font color='#B71C1C'>*</font><br>" +
                            "a nauč ma svojim ustanoveniam.<font color='#B71C1C'> – R.</font><br>" +
                            "Ja budem žiť a teba chváliť <font color='#B71C1C'>*</font><br>" +
                            "a tvoje rozhodnutia mi pomôžu.<font color='#B71C1C'> – R.</font>"},
            {"32", "4", "2", "Ž 146, 6c-7. 8-9a. 9b-10",
                    "<font color='#B71C1C'>R.:</font> Blažený človek, ktorý sa spolieha na Pána, svojho Boha.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Pán zachováva vernosť naveky, <font color='#B71C1C'>*</font><br>" +
                            "utláčaným prisudzuje právo,<br>" +
                            "hladujúcim dáva chlieb. <font color='#B71C1C'>*</font><br>" +
                            "Pán vyslobodzuje väzňov,<font color='#B71C1C'> – R.</font><br>" +
                            "Pán otvára oči slepým, <font color='#B71C1C'>*</font><br>" +
                            "Pán dvíha skľúčených,<br>" +
                            "Pán miluje spravodlivých. <font color='#B71C1C'>*</font><br>" +
                            "Pán ochraňuje cudzincov,<font color='#B71C1C'> – R.</font><br>" +
                            "ujíma sa siroty a vdovy, <font color='#B71C1C'>*</font><br>" +
                            "ale hatí cesty hriešnikov.<br>" +
                            "Pán bude kraľovať naveky; <font color='#B71C1C'>*</font><br>" +
                            "tvoj Boh, Sion, z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"32", "5", "1", "Ž 19, 2-3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Nebesia rozprávajú o sláve Boha.<br><br>" +
                            "Nebesia rozprávajú o sláve Boha <font color='#B71C1C'>*</font><br>" +
                            "a obloha hlása dielo jeho rúk.<br>" +
                            "Deň dňu o tom podáva správu <font color='#B71C1C'>*</font><br>" +
                            "a noc noci to dáva na známosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Nie sú to slová, nie je to reč, <font color='#B71C1C'>*</font><br>" +
                            "ktorá by sa nedala počuť.<br>" +
                            "Po celej zemi rozlieha sa ich hlas <font color='#B71C1C'>*</font><br>" +
                            "a ich slová až po končiny sveta.<font color='#B71C1C'> – R.</font>"},
            {"32", "5", "2", "Ž 119, 1. 2. 10. 11. 17. 18",
                    "<font color='#B71C1C'>R.:</font> Blažení tí, čo kráčajú podľa zákona Pánovho.<br><br>" +
                            "Blažení tí, čo idú cestou života bez poškvrny, <font color='#B71C1C'>*</font><br>" +
                            "čo kráčajú podľa zákona Pánovho.<font color='#B71C1C'> – R.</font><br>" +
                            "Blažení tí, čo zachovávajú jeho príkazy <font color='#B71C1C'>*</font><br>" +
                            "a celým srdcom ho vyhľadávajú.<font color='#B71C1C'> – R.</font><br>" +
                            "Celým svojím srdcom ťa vyhľadávam; <font color='#B71C1C'>*</font><br>" +
                            "nedaj, aby som zablúdil od tvojich príkazov.<font color='#B71C1C'> – R.</font><br>" +
                            "V srdci si uchovávam tvoje výroky, <font color='#B71C1C'>*</font><br>" +
                            "aby som proti tebe nezhrešil.<font color='#B71C1C'> – R.</font><br>" +
                            "Preukáž dobro svojmu služobníkovi a budem žiť <font color='#B71C1C'>*</font><br>" +
                            "a tvoje slová zachovám.<font color='#B71C1C'> – R.</font><br>" +
                            "Otvor mi oči, aby som pozoroval <font color='#B71C1C'>*</font><br>" +
                            "divy tvojho zákona.<font color='#B71C1C'> – R.</font>"},
            {"32", "6", "1", "Ž 105, 2-3. 36-37. 42-43",
                    "<font color='#B71C1C'>R.:</font> Pamätáme, Pane, na divy, čo si učinil.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Spievajte mu a hrajte, <font color='#B71C1C'>*</font><br>" +
                            "rozprávajte o jeho obdivuhodných skutkoch.<br>" +
                            "Jeho svätým menom sa honoste; <font color='#B71C1C'>*</font><br>" +
                            "nech sa radujú srdcia tých, čo hľadajú Pána.<font color='#B71C1C'> – R.</font><br>" +
                            "Pobil všetko prvorodené v Egypte, <font color='#B71C1C'>*</font><br>" +
                            "prvotiny všetkej ich mužnej sily.<br>" +
                            "Potom ich vyviedol so striebrom a zlatom <font color='#B71C1C'>*</font><br>" +
                            "a v ich kmeňoch nebol nik nevládny.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo pamätal na slová svojho záväzku, <font color='#B71C1C'>*</font><br>" +
                            "ktoré dal Abrahámovi, svojmu služobníkovi.<br>" +
                            "Vyviedol teda svoj ľud v radosti, <font color='#B71C1C'>*</font><br>" +
                            "vyvolených svojich s plesaním.<font color='#B71C1C'> – R.</font>"},
            {"32", "6", "2", "Ž 112, 1-2. 3-4. 5-6",
                    "<font color='#B71C1C'>R.:</font> Blažený muž, ktorý sa bojí Pána.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Blažený muž, ktorý sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a má veľkú záľubu v jeho príkazoch.<br>" +
                            "Jeho potomstvo bude mocné na zemi; <font color='#B71C1C'>*</font><br>" +
                            "pokolenie spravodlivých bude požehnané.<font color='#B71C1C'> – R.</font><br>" +
                            "V jeho dome bude úspech a bohatstvo, <font color='#B71C1C'>*</font><br>" +
                            "jeho spravodlivosť ostane naveky.<br>" +
                            "Spravodlivým žiari svetlo v temnotách, <font color='#B71C1C'>*</font><br>" +
                            "milosrdný, milostivý a spravodlivý.<font color='#B71C1C'> – R.</font><br>" +
                            "V obľube je človek, čo sa zľutúva a rád pomáha, <font color='#B71C1C'>*</font><br>" +
                            "čo svoj majetok čestne spravuje;<br>" +
                            "nikdy nezakolíše. <font color='#B71C1C'>*</font><br>" +
                            "vo večnej pamäti bude spravodlivý.<font color='#B71C1C'> – R.</font>"},
            {"33", "A", "", "Ž 128, 1-2. 3. 4-5",
                    "<font color='#B71C1C'>R.:</font> Blažení sú všetci, čo sa boja Pána.<br><br>" +
                            "Blažený každý, čo sa bojí Pána <font color='#B71C1C'>*</font><br>" +
                            "a kráča po jeho cestách.<br>" +
                            "Budeš jesť z práce svojich rúk; <font color='#B71C1C'>*</font><br>" +
                            "budeš šťastný a budeš sa mať dobre.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoja manželka je ako plodonosný vinič <font color='#B71C1C'>*</font><br>" +
                            "vnútri tvojho domu.<br>" +
                            "Tvoji synovia sú ako mládniky olivy <font color='#B71C1C'>*</font><br>" +
                            "okolo tvojho stola.<font color='#B71C1C'> – R.</font><br>" +
                            "Veru, tak bude požehnaný muž, <font color='#B71C1C'>*</font><br>" +
                            "ktorý sa bojí Pána.<br>" +
                            "Nech ťa žehná Pán zo Siona, <font color='#B71C1C'>†</font><br>" +
                            "aby si videl šťastie Jeruzalema <font color='#B71C1C'>*</font><br>" +
                            "po všetky dni svojho života.<font color='#B71C1C'> – R.</font>"},
            {"33", "B", "", "Ž 16, 5+8. 9-10. 11",
                    "<font color='#B71C1C'>R.:</font> Ochráň ma, Bože, k tebe sa utiekam.<br><br>" +
                            "Ty, Pane, si môj podiel na dedičstve a na kalichu, <font color='#B71C1C'>*</font><br>" +
                            "v tvojich rukách je môj osud.<br>" +
                            "Pána mám vždy pred očami; <font color='#B71C1C'>*</font><br>" +
                            "a pretože je po mojej pravici, nezakolíšem sa.<font color='#B71C1C'> – R.</font><br>" +
                            "Preto sa raduje moje srdce <font color='#B71C1C'>†</font><br>" +
                            "a moja duša plesá <font color='#B71C1C'>*</font><br>" +
                            "aj moje telo odpočíva v nádeji.<br>" +
                            "Lebo nenecháš moju dušu v podsvetí <font color='#B71C1C'>*</font><br>" +
                            "a nedovolíš, aby tvoj svätý videl porušenie.<font color='#B71C1C'> – R.</font><br>" +
                            "Ukážeš mi cestu života. <font color='#B71C1C'>†</font><br>" +
                            "U teba je plnosť radosti, <font color='#B71C1C'>*</font><br>" +
                            "po tvojej pravici večná slasť.<font color='#B71C1C'> – R.</font>"},
            {"33", "C", "", "Ž 98, 5-6. 7-9a. 9bc",
                    "<font color='#B71C1C'>R.:</font> Pán príde súdiť živých i mŕtvych.<br><br>" +
                            "Hrajte Pánovi na citare, <font color='#B71C1C'>*</font><br>" +
                            "na citare a na harfe zunivej.<br>" +
                            "Za hlaholu trúb a poľníc <font color='#B71C1C'>*</font><br>" +
                            "jasajte pred tvárou Kráľa a Pána.<font color='#B71C1C'> – R.</font><br>" +
                            "Zahuč, more a všetko, čo ho napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "zemekruh a všetci, čo na ňom bývajú.<br>" +
                            "Tlieskajte, rieky, rukami, <font color='#B71C1C'>†</font><br>" +
                            "jasajte s nimi, vrchy, <font color='#B71C1C'>*</font><br>" +
                            "pred tvárou Pánovou, lebo prichádza súdiť zem.<font color='#B71C1C'> – R.</font><br>" +
                            "Spravodlivo bude súdiť zemekruh <font color='#B71C1C'>*</font><br>" +
                            "a podľa práva národy.<font color='#B71C1C'> – R.</font>"},
            {"33", "1", "1", "Ž 119, 53. 61. 134. 150. 155. 158",
                    "<font color='#B71C1C'>R.:</font> Pane, dožič mi života a budem sa pridŕžať tvojej náuky.<br><br>" +
                            "Ovláda ma rozhorčenie <font color='#B71C1C'>*</font><br>" +
                            "voči hriešnikom, čo zrádzajú tvoj zákon.<font color='#B71C1C'> – R.</font><br>" +
                            "Dostal som sa do osídel hriešnikov, <font color='#B71C1C'>*</font><br>" +
                            "no predsa som nezabudol na tvoj zákon.<font color='#B71C1C'> – R.</font><br>" +
                            "Chráň ma pred ohováračmi <font color='#B71C1C'>*</font><br>" +
                            "a budem zachovávať tvoje príkazy.<font color='#B71C1C'> – R.</font><br>" +
                            "Blížia sa tí, čo ma zlostne prenasledujú, <font color='#B71C1C'>*</font><br>" +
                            "tí, čo sa vzdialili od tvojho zákona.<font color='#B71C1C'> – R.</font><br>" +
                            "Spása je ďaleko od hriešnikov, <font color='#B71C1C'>*</font><br>" +
                            "lebo tí na tvoje ustanovenia nedbajú.<font color='#B71C1C'> – R.</font><br>" +
                            "S odporom pozerám na odpadlíkov, <font color='#B71C1C'>*</font><br>" +
                            "lebo nedbajú na tvoje výroky.<font color='#B71C1C'> – R.</font>"},
            {"33", "1", "2", "Ž 1, 1-2. 3. 4+6",
                    "<font color='#B71C1C'>R.:</font> Tomu, kto zvíťazí, dám jesť zo stromu života.<br><br>" +
                            "Blažený človek, čo nekráča podľa rady bezbožných <font color='#B71C1C'>†</font><br>" +
                            "a nechodí cestou hriešnikov, <font color='#B71C1C'>*</font><br>" +
                            "ani nevysedáva v kruhu rúhačov,<br>" +
                            "ale v zákone Pánovom má záľubu <font color='#B71C1C'>*</font><br>" +
                            "a o jeho zákone rozjíma dňom i nocou.<font color='#B71C1C'> – R.</font><br>" +
                            "Je ako strom zasadený pri vode, <font color='#B71C1C'>*</font><br>" +
                            "čo prináša ovocie v pravý čas,<br>" +
                            "a jeho lístie nikdy nevädne; <font color='#B71C1C'>*</font><br>" +
                            "darí sa mu všetko, čo podniká.<font color='#B71C1C'> – R.</font><br>" +
                            "No nie tak bezbožní, veru nie; <font color='#B71C1C'>*</font><br>" +
                            "tí sú ako plevy, čo vietor ženie pred sebou.<br>" +
                            "Nad cestou spravodlivých bedlí Pán, <font color='#B71C1C'>*</font><br>" +
                            "ale cesta bezbožných vedie do záhuby.<font color='#B71C1C'> – R.</font>"},
            {"33", "2", "1", "Ž 3, 2-3. 4-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Pán je môj ochranca, on ma udržuje.<br><br>" +
                            "Pane, jak mnoho je tých, čo ma sužujú! <font color='#B71C1C'>*</font><br>" +
                            "Mnohí povstávajú proti mne.<br>" +
                            "Mnohí o mne hovoria: <font color='#B71C1C'>*</font><br>" +
                            "\"Boh mu nepomáha.\"<font color='#B71C1C'> – R.</font><br>" +
                            "Ale ty, Pane, si môj ochranca, <font color='#B71C1C'>*</font><br>" +
                            "moja sláva, čo mi hlavu vztyčuje.<br>" +
                            "Hlasne som volal k Pánovi <font color='#B71C1C'>*</font><br>" +
                            "a on mi odpovedal zo svojho svätého vrchu.<font color='#B71C1C'> – R.</font><br>" +
                            "A ja som sa uložil na odpočinok a usnul som, <font color='#B71C1C'>*</font><br>" +
                            "prebudil som sa, lebo Pán ma udržuje.<br>" +
                            "nebudem sa báť tisícov ľudí, čo ma obkľučujú. <font color='#B71C1C'>*</font><br>" +
                            "Povstaň, Pane; zachráň ma, Bože môj.<font color='#B71C1C'> – R.</font>"},
            {"33", "2", "2", "Ž 15, 2-3a. 3b-4b. 5",
                    "<font color='#B71C1C'>R.:</font> Toho, kto zvíťazí, posadím vedľa seba na mojom tróne.<br><br>" +
                            "Ten, čo kráča bez poškvrny a koná spravodlivo, <font color='#B71C1C'>†</font><br>" +
                            "čo z úprimného srdca pravdu hovorí, <font color='#B71C1C'>*</font><br>" +
                            "čo nepodvádza svojím jazykom.<font color='#B71C1C'> – R.</font><br>" +
                            "Čo nekrivdí svojmu blížnemu, <font color='#B71C1C'>*</font><br>" +
                            "ani ho nepotupuje.<br>" +
                            "Čo ničomníka nemá za nič, <font color='#B71C1C'>*</font><br>" +
                            "ale ctí si ľudí bohabojných.<font color='#B71C1C'> – R.</font><br>" +
                            "Čo nepožičiava peniaze na úrok <font color='#B71C1C'>†</font><br>" +
                            "a proti nevinnému sa nedá podplácať. <font color='#B71C1C'>*</font><br>" +
                            "Kto si tak počína, ten sa nikdy neskláti.<font color='#B71C1C'> – R.</font>"},
            {"33", "3", "1", "Ž 17, 1. 5-6. 8+15",
                    "<font color='#B71C1C'>R.:</font> Až raz vstanem zo sna, uzriem tvoju tvár, Pane.<br><br>" +
                            "Vypočuj, Pane, moju spravodlivú žiadosť, <font color='#B71C1C'>*</font><br>" +
                            "všimni si moju prosbu pokornú.<br>" +
                            "Nakloň sluch k mojej modlitbe, <font color='#B71C1C'>*</font><br>" +
                            "čo plynie z perí úprimných.<font color='#B71C1C'> – R.</font><br>" +
                            "Pevne drž moje kroky na svojich chodníkoch, <font color='#B71C1C'>*</font><br>" +
                            "aby moje nohy nezakolísali.<br>" +
                            "K tebe, Bože, volám, lebo ty ma vyslyšíš. <font color='#B71C1C'>*</font><br>" +
                            "Nakloň ku mne sluch a vypočuj moje slová.<font color='#B71C1C'> – R.</font><br>" +
                            "Chráň ma ako zrenicu oka, <font color='#B71C1C'>*</font><br>" +
                            "skry ma v tôni svojich perutí.<br>" +
                            "Ja však v spravodlivosti uzriem tvoju tvár <font color='#B71C1C'>*</font><br>" +
                            "a až raz vstanem zo sna,<br>" +
                            "nasýtim sa pohľadom na teba.<font color='#B71C1C'> – R.</font>"},
            {"33", "3", "2", "Ž 150, 1-2. 3-4. 5",
                    "<font color='#B71C1C'>R.:</font> Svätý, svätý, svätý je Boh, Pán Boh všemohúci.<br><br>" +
                            "Chváľte Pána v jeho svätyni, <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho na jeho vznešenej oblohe.<br>" +
                            "Chváľte ho za jeho činy mohutné, <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho za jeho nesmiernu velebnosť.<font color='#B71C1C'> – R.</font><br>" +
                            "Chváľte ho zvukom poľnice, <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho harfou a citarou.<br>" +
                            "Chváľte ho bubnom a tancom, <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho lýrou a flautou.<font color='#B71C1C'> – R.</font><br>" +
                            "Chváľte ho ľubozvučnými cimbalmi, <font color='#B71C1C'>†</font><br>" +
                            "chváľte ho jasavými cimbalmi; <font color='#B71C1C'>*</font><br>" +
                            "všetko, čo dýcha, nech chváli Pána.<font color='#B71C1C'> – R.</font>"},
            {"33", "4", "1", "Ž 50, 1-2. 5-6. 14-15",
                    "<font color='#B71C1C'>R.:</font> Kto kráča bez úhony, tomu ukážem Božiu spásu.<br><br>" +
                            "Zvrchovaný Boh, Pán, prehovoril <font color='#B71C1C'>†</font><br>" +
                            "a vyzval zem od východu slnka až po jeho západ. <font color='#B71C1C'>*</font><br>" +
                            "Zo Siona plného nádhery zažiaril Boh:<font color='#B71C1C'> – R.</font><br>" +
                            "\"Zhromaždite mi mojich svätých, <font color='#B71C1C'>*</font><br>" +
                            "čo zmluvu so mnou spečatili obetou.\"<br>" +
                            "A nebesia zvestujú jeho spravodlivosť, <font color='#B71C1C'>*</font><br>" +
                            "veď sudcom je sám Boh.<font color='#B71C1C'> – R.</font><br>" +
                            "\"Obetuj Bohu obetu chvály <font color='#B71C1C'>*</font><br>" +
                            "a Najvyššiemu svoje sľuby splň.<br>" +
                            "A vzývaj ma v čase súženia: <font color='#B71C1C'>*</font><br>" +
                            "ja ťa zachránim a ty mi úctu vzdáš.\"<font color='#B71C1C'> – R.</font>"},
            {"33", "4", "2", "Ž 149, 1-2. 3-4. 5-6a+9b",
                    "<font color='#B71C1C'>R.:</font> Urobil si nás kráľovstvom a kňazmi nášmu Bohu.<br>" +
                            "<font color='#B71C1C'>Alebo:</font> Aleluja.<br><br>" +
                            "Spievajte Pánovi pieseň novú; <font color='#B71C1C'>*</font><br>" +
                            "jeho chvála nech znie v zhromaždení svätých.<br>" +
                            "Nech sa teší Izrael zo svojho Stvoriteľa, <font color='#B71C1C'>*</font><br>" +
                            "synovia Siona nech jasajú nad svojím kráľom.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech oslavujú jeho meno tancom, <font color='#B71C1C'>*</font><br>" +
                            "nech mu hrajú na bubne a na citare.<br>" +
                            "Lebo Pán miluje svoj ľud <font color='#B71C1C'>*</font><br>" +
                            "a tichých venčí víťazstvom.<font color='#B71C1C'> – R.</font><br>" +
                            "Nech svätí jasajú v sláve, <font color='#B71C1C'>*</font><br>" +
                            "nech sa veselia na svojich lôžkach.<br>" +
                            "Oslavu Boha nech majú na perách; <font color='#B71C1C'>*</font><br>" +
                            "všetkým jeho svätým to bude na slávu.<font color='#B71C1C'> – R.</font>"},
            {"33", "5", "1", "1 Krn 29, 10bc. 11a-c. 11d-12a. 12b-d",
                    "<font color='#B71C1C'>R.:</font> Velebíme slávu tvojho mena, Pane, Bože náš.<br><br>" +
                            "Zvelebený buď, Pane, Bože nášho otca Izraela, <font color='#B71C1C'>*</font><br>" +
                            "od vekov naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoja je, Pane, vznešenosť i moc, <font color='#B71C1C'>†</font><br>" +
                            "sláva, jas a veleba, <font color='#B71C1C'>*</font><br>" +
                            "lebo tvoje je všetko na nebi i na zemi.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoje je, Pane, kráľovstvo, <font color='#B71C1C'>†</font><br>" +
                            "ty si vyvýšený ako hlava nad všetkým. <font color='#B71C1C'>*</font><br>" +
                            "Od teba pochádza bohatstvo i sláva.<font color='#B71C1C'> – R.</font><br>" +
                            "ty panuješ nad všetkými. <font color='#B71C1C'>†</font><br>" +
                            "V tvojej ruke je moc a sila, <font color='#B71C1C'>*</font><br>" +
                            "tvoja ruka robí všetko veľkým a mocným.<font color='#B71C1C'> – R.</font>"},
            {"33", "5", "2", "Ž 119, 14. 24. 72. 103. 111. 131",
                    "<font color='#B71C1C'>R.:</font> Tvoje výroky, Pane, mojim ústam sú sladšie ako med.<br><br>" +
                            "Keď idem cestou tvojich zákonov, <font color='#B71C1C'>*</font><br>" +
                            "mám väčšiu radosť ako zo všetkého bohatstva.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď tvoje ustanovenia sú mi rozkošou <font color='#B71C1C'>*</font><br>" +
                            "a tvoje príkazy sú mojimi radcami.<font color='#B71C1C'> – R.</font><br>" +
                            "Lepší je pre mňa zákon tvojich úst <font color='#B71C1C'>*</font><br>" +
                            "ako tisícky v zlate a striebre.<font color='#B71C1C'> – R.</font><br>" +
                            "Aké sladké sú tvoje výroky môjmu podnebiu, <font color='#B71C1C'>*</font><br>" +
                            "mojim ústam sú sladšie ako med.<font color='#B71C1C'> – R.</font><br>" +
                            "Tvoja náuka je mojím večným dedičstvom, <font color='#B71C1C'>*</font><br>" +
                            "lebo je slasťou môjmu srdcu.<font color='#B71C1C'> – R.</font><br>" +
                            "Otváram ústa a dych naberám, <font color='#B71C1C'>*</font><br>" +
                            "lebo túžim za tvojimi predpismi.<font color='#B71C1C'> – R.</font>"},
            {"33", "6", "1", "Ž 9, 2-3. 4+6. 16+19",
                    "<font color='#B71C1C'>R.:</font> Pán, Boh, súdi spravodlivo národy.<br><br>" +
                            "Oslavovať ťa budem, Pane, celým svojím srdcom <font color='#B71C1C'>*</font><br>" +
                            "a vyrozprávam všetky tvoje diela zázračné.<br>" +
                            "V tebe sa budem tešiť a radovať, <font color='#B71C1C'>*</font><br>" +
                            "ospevovať budem tvoje meno, Najvyšší.<font color='#B71C1C'> – R.</font><br>" +
                            "Veď moji nepriatelia dávajú sa na útek, <font color='#B71C1C'>*</font><br>" +
                            "pred tvojou tvárou slabnú a hynú.<br>" +
                            "Zahriakol si pohanov a vyničil si rod bezbožný, <font color='#B71C1C'>*</font><br>" +
                            "ich meno si vyhladil navždy, naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Pohania padli do jamy, ktorú kopali, <font color='#B71C1C'>†</font><br>" +
                            "a v tom osídle, čo nastrojili, <font color='#B71C1C'>*</font><br>" +
                            "chytila sa im vlastná noha.<br>" +
                            "Lež na úbožiaka on nezabudne naveky, <font color='#B71C1C'>*</font><br>" +
                            "ani nádej úbožiakov navždy márna nebude.<font color='#B71C1C'> – R.</font>"},
            {"33", "6", "2", "Ž 144, 1. 2. 9-10",
                    "<font color='#B71C1C'>R.:</font> Nech je zvelebený Pán, môj ochranca.<br><br>" +
                            "Nech je zvelebený Pán, môj ochranca, <font color='#B71C1C'>†</font><br>" +
                            "čo učí moje ruky zápasiť <font color='#B71C1C'>*</font><br>" +
                            "a moje prsty bojovať.<font color='#B71C1C'> – R.</font><br>" +
                            "On je ku mne milosrdný a dodáva mi odvahy, <font color='#B71C1C'>*</font><br>" +
                            "on je moje útočište a môj osloboditeľ;<br>" +
                            "on je moja záštita, na ktorú sa spolieham; <font color='#B71C1C'>*</font><br>" +
                            "on mi podrobuje môj ľud.<font color='#B71C1C'> – R.</font><br>" +
                            "Bože, novú pieseň ti zaspievam; <font color='#B71C1C'>*</font><br>" +
                            "zahrám ti na desaťstrunovej citare.<br>" +
                            "Ty pomáhaš kráľom, <font color='#B71C1C'>*</font><br>" +
                            "ty zachraňuješ svojho sluhu Dávida<br>" +
                            "pred mečom záhuby.<font color='#B71C1C'> – R.</font>"},
            {"34", "A", "", "", ""},
            {"34", "B", "", "", ""},
            {"34", "C", "", "", ""},
            {"34", "1", "1", "Dan 3, 52a. 52c. 53. 54. 55. 56",
                    "<font color='#B71C1C'>R.:</font> Hoden chvály a vyvýšený naveky.<br><br>" +
                            "Zvelebený si, Pane, Bože našich otcov, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a vyvýšený naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Zvelebené je, tvoje meno, slávne a sväté, <font color='#B71C1C'>*</font><br>" +
                            "hodno chvály a vyvýšené nad všetky veky.<font color='#B71C1C'> – R.</font><br>" +
                            "Zvelebený si v chráme tvojej svätej slávy, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a slávy nad všetky veky.<font color='#B71C1C'> – R.</font><br>" +
                            "Zvelebený si na tróne svojho kráľovstva, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a vyvýšený nad všetky veky.<font color='#B71C1C'> – R.</font><br>" +
                            "Zvelebený si, čo prenikáš pohľadom priepasti <font color='#B71C1C'>†</font><br>" +
                            "a tróniš nad cherubmi, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a vyvýšený naveky.<font color='#B71C1C'> – R.</font><br>" +
                            "Zvelebený si na nebeskej oblohe, <font color='#B71C1C'>*</font><br>" +
                            "hoden chvály a slávy naveky.<font color='#B71C1C'> – R.</font>"},
            {"34", "1", "2", "Ž 24, 1-2. 3-4b. 5-6",
                    "<font color='#B71C1C'>R.:</font> S úprimným srdcom hľadáme tvoju tvár, Pane.<br><br>" +
                            "Pánova je zem i všetko, čo ju napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "okruh zeme aj tí, čo bývajú na ňom.<br>" +
                            "Veď on sám položil jeho základy na moriach <font color='#B71C1C'>*</font><br>" +
                            "a upevnil ho na vodách.<font color='#B71C1C'> – R.</font><br>" +
                            "Kto smie vystúpiť na vrch Pánov, <font color='#B71C1C'>*</font><br>" +
                            "kto smie stáť na jeho mieste posvätnom?<br>" +
                            "Ten, čo má ruky nevinné a srdce čisté, <font color='#B71C1C'>*</font><br>" +
                            "čo nedvíha svoju dušu k márnosti.<font color='#B71C1C'> – R.</font><br>" +
                            "Taký dostane požehnanie od Pána <font color='#B71C1C'>*</font><br>" +
                            "a odmenu od Boha, svojho spasiteľa.<br>" +
                            "To je pokolenie tých, čo ho hľadajú, <font color='#B71C1C'>*</font><br>" +
                            "čo hľadajú tvár Boha Jakubovho.<font color='#B71C1C'> – R.</font>"},
            {"34", "2", "1", "Dan 3, 57. 58. 59. 60. 61",
                    "<font color='#B71C1C'>R.:</font> Chváľte a vyvyšujte ho naveky.<br><br>" +
                            "Velebte Pána, všetky jeho diela; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, nebesia; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, jeho anjeli; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, všetky vody nad nebesami; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Nech Pána velebia všetky jeho mocnosti; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font>"},
            {"34", "2", "2", "Ž 96, 10. 11-12a. 12b-13",
                    "<font color='#B71C1C'>R.:</font> Pán príde súdiť všetky národy.<br><br>" +
                            "Hlásajte medzi pohanmi: \"Pán kraľuje!\" <font color='#B71C1C'>†</font><br>" +
                            "Upevnil zemekruh, nepohne sa; <font color='#B71C1C'>*</font><br>" +
                            "a spravodlivo súdi národy.<font color='#B71C1C'> – R.</font><br>" +
                            "Tešte sa, nebesia, plesaj, zem; <font color='#B71C1C'>†</font><br>" +
                            "nech more zahučí a čo ho napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "nech plesá pole a všetko, čo je na ňom.<font color='#B71C1C'> – R.</font><br>" +
                            "I zajasajú všetky stromy lesa <font color='#B71C1C'>†</font><br>" +
                            "pred tvárou Pána, že prichádza, <font color='#B71C1C'>*</font><br>" +
                            "že prichádza súdiť zem.<br>" +
                            "Spravodlivo bude súdiť zemekruh <font color='#B71C1C'>*</font><br>" +
                            "a národy podľa svojej pravdy.<font color='#B71C1C'> – R.</font>"},
            {"34", "3", "1", "Dan 3, 62. 63. 64. 65. 66. 67",
                    "<font color='#B71C1C'>R.:</font> Chváľte a vyvyšujte ho naveky.<br><br>" +
                            "Velebte Pána, slnko a mesiac; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, hviezdy na nebi; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, dážď i rosa; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Veleb Pána, každý vietor; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, oheň a páľava; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, chlad a horúčosť; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font>"},
            {"34", "3", "2", "Ž 98, 1. 2-3b. 7-8. 9",
                    "<font color='#B71C1C'>R.:</font> Veľké a obdivuhodné sú tvoje skutky, Pane, Bože všemohúci.<br><br>" +
                            "Spievajte Pánovi pieseň novú, <font color='#B71C1C'>*</font><br>" +
                            "lebo vykonal veci zázračné.<br>" +
                            "Víťazstvo je dielom jeho pravice <font color='#B71C1C'>*</font><br>" +
                            "a jeho svätého ramena.<font color='#B71C1C'> – R.</font><br>" +
                            "Pán oznámil svoju spásu, <font color='#B71C1C'>*</font><br>" +
                            "pred očami pohanov vyjavil svoju spravodlivosť.<br>" +
                            "Rozpamätal sa na svoju dobrotu <font color='#B71C1C'>*</font><br>" +
                            "a na svoju vernosť voči Izraelovmu domu.<font color='#B71C1C'> – R.</font><br>" +
                            "Zahuč, more a všetko, čo ho napĺňa, <font color='#B71C1C'>*</font><br>" +
                            "zemekruh a všetci, čo na ňom bývajú.<br>" +
                            "Tlieskajte, rieky, rukami, <font color='#B71C1C'>*</font><br>" +
                            "jasajte s nimi, vrchy,<font color='#B71C1C'> – R.</font><br>" +
                            "pred tvárou Pánovou, lebo prichádza súdiť zem. <font color='#B71C1C'>†</font><br>" +
                            "Spravodlivo bude súdiť zemekruh <font color='#B71C1C'>*</font><br>" +
                            "a podľa práva národy.<font color='#B71C1C'> – R.</font>"},
            {"34", "4", "1", "Dan 3, 68. 69. 70. 71. 72. 73. 74",
                    "<font color='#B71C1C'>R.:</font> Chváľte a vyvyšujte ho naveky.<br><br>" +
                            "Velebte Pána, rosa a srieň; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, mráz a zima; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, ľad a sneh; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, noci a dni; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, svetlo a tma; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, blesky a oblaky; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Nech Pána velebí zem; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font>"},
            {"34", "4", "2", "Ž 100, 2. 3. 4. 5",
                    "<font color='#B71C1C'>R.:</font> Blahoslavení tí, čo sú pozvaní na Baránkovu svadobnú hostinu.<br><br>" +
                            "Jasaj na chválu Pánovi, celá zem, <font color='#B71C1C'>†</font><br>" +
                            "s radosťou slúžte Pánovi. <font color='#B71C1C'>*</font><br>" +
                            "S plesaním vstupujte pred jeho tvár.<font color='#B71C1C'> – R.</font><br>" +
                            "Vedzte, že náš Pán je Boh; <font color='#B71C1C'>†</font><br>" +
                            "on je náš stvoriteľ a jemu patríme, <font color='#B71C1C'>*</font><br>" +
                            "sme jeho ľud a ovce z jeho stáda.<font color='#B71C1C'> – R.</font><br>" +
                            "Vstupujte do jeho brán s piesňou chvály <font color='#B71C1C'>†</font><br>" +
                            "a do jeho nádvorí s piesňami oslavnými; <font color='#B71C1C'>*</font><br>" +
                            "chváľte ho a velebte jeho meno.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán je dobrý; <font color='#B71C1C'>†</font><br>" +
                            "jeho milosrdenstvo trvá naveky <font color='#B71C1C'>*</font><br>" +
                            "a jeho vernosť z pokolenia na pokolenie.<font color='#B71C1C'> – R.</font>"},
            {"34", "5", "1", "Dan 3, 75. 76. 77. 78. 79. 80. 81",
                    "<font color='#B71C1C'>R.:</font> Chváľte a vyvyšujte ho naveky.<br><br>" +
                            "Velebte Pána, vrchy a kopce; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, všetky rastliny na zemi; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, moria a rieky; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, pramene; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, veľryby a všetko, čo sa hýbe vo vodách; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, všetky nebeské vtáky; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, všetka zver a dobytok; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font>"},
            {"34", "5", "2", "Ž 84, 3. 4. 5-6a+8a",
                    "<font color='#B71C1C'>R.:</font> Hľa, Boží stánok je medzi ľuďmi.<br><br>" +
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
                            "Blažený človek, ktorému ty pomáhaš. <font color='#B71C1C'>*</font><br>" +
                            "Stúpajú a síl im stále pribúda.<font color='#B71C1C'> – R.</font>"},
            {"34", "6", "1", "Dan 3, 82. 83. 84. 85. 86. 87",
                    "<font color='#B71C1C'>R.:</font> Chváľte a vyvyšujte ho naveky.<br><br>" +
                            "Velebte Pána, synovia človeka; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Veleb Pána, Izrael; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, vy, jeho kňazi; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, jeho služobníci; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, duchovia a duše spravodlivých; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font><br>" +
                            "Velebte Pána, svätí a pokorní srdcom; <font color='#B71C1C'>*</font><font color='#B71C1C'> – R.</font>"},
            {"34", "6", "2", "Ž 95, 1-2. 3-5. 6-7",
                    "<font color='#B71C1C'>R.:</font> Príď, Pane Ježišu!<br><br>" +
                            "Poďte, plesajme v Pánovi, <font color='#B71C1C'>*</font><br>" +
                            "oslavujme Boha, našu spásu.<br>" +
                            "Predstúpme s chválospevmi pred jeho tvár <font color='#B71C1C'>*</font><br>" +
                            "a oslavujme ho žalmami.<font color='#B71C1C'> – R.</font><br>" +
                            "Lebo Pán je veľký Boh <font color='#B71C1C'>*</font><br>" +
                            "a nad všetkými bohmi veľký kráľ.<br>" +
                            "V jeho moci sú zemské hlbiny <font color='#B71C1C'>*</font><br>" +
                            "a jemu patria aj nebotyčné šíty.<br>" +
                            "Jeho je more, veď on ho stvoril, <font color='#B71C1C'>*</font><br>" +
                            "i pevnina, ktorú stvárnili jeho ruky.<font color='#B71C1C'> – R.</font><br>" +
                            "Poďte, klaňajme sa a na zem padnime, <font color='#B71C1C'>*</font><br>" +
                            "kľaknime na kolená pred Pánom, ktorý nás stvoril.<br>" +
                            "Lebo on je náš Boh <font color='#B71C1C'>†</font><br>" +
                            "a my sme ľud jeho pastviny <font color='#B71C1C'>*</font><br>" +
                            "a ovce, ktoré vedie svojou rukou.<font color='#B71C1C'> – R.</font>"},
    };

    String[][] cezrokAleluja = {
            {"1", "A", "", "", ""},
            {"1", "B", "", "", ""},
            {"1", "C", "", "", ""},
            {"1", "1", "", "Mk 1, 15", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Priblížilo sa Božie kráľovstvo, hovorí Pán; kajajte sa a verte evanjeliu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"1", "2", "", "Porov. 1 Sol 2, 13", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Prijmite Božie slovo, nie ako ľudské slovo, ale – aké naozaj je – ako slovo Božie. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"1", "3", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"1", "4", "", "Mt 4,23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježiš hlásal evanjelium o kráľovstve a uzdravoval každú chorobu medzi ľudom. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"1", "5", "", "Lk 7, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Veľký prorok povstal medzi nami a Boh navštívil svoj ľud. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"1", "6", "", "Porov. Lk 4, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pán ma poslal hlásať evanjelium chudobným, oznámiť zajatým, že budú prepustení. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"2", "A", "", "Jn 1, 14a. 12a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Slovo sa telom stalo a prebývalo medzi nami. Tým, ktorí ho prijali, dalo moc stať sa Božími deťmi. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"2", "B", "", "Jn 1, 41b. 17b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Našli sme Mesiáša, Krista. Milosť a pravda prišli skrze neho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"2", "C", "", "2 Sol 2, 14", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Boh nás povolal skrze evanjelium, aby ste získali slávu nášho Pána Ježiša Krista. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"2", "1", "", "Hebr 4, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Živé a účinné je Božie slovo; rozsudzuje myšlienky a úmysly srdca. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"2", "2", "", "Porov. Ef 1, 17-18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Otec nášho Pána Ježiša Krista nech osvieti oči nášho srdca, aby sme vedeli, aká je nádej z nášho povolania. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"2", "3", "", "Mt 4, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježiš hlásal evanjelium o kráľovstve a uzdravoval každú chorobu medzi ľudom. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"2", "4", "", "Porov. 2 Tim 1, 10b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Náš Spasiteľ Ježiš Kristus zničil smrť a evanjeliom zjavil život. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"2", "5", "", "2 Kor 5, 19", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> V Kristovi Boh zmieril svet so sebou a nám odovzdal slovo zmierenia. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"2", "6", "", "Porov. Sk 16, 14b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pane, otvor naše srdce, aby sme porozumeli slovám tvojho Syna. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"3", "A", "", "Mt 4, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježiš hlásal evanjelium o kráľovstve a uzdravoval každú chorobu medzi ľudom. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"3", "B", "", "Mk 1, 15bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Priblížilo sa Božie kráľovstvo. Kajajte sa a verte evanjeliu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"3", "C", "", "porov. Lk 4, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pán ma poslal hlásať evanjelium chudobným, oznámiť zajatým, že budú prepustení. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"3", "1", "", "Porov. 2 Tim 1, 10b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Náš Spasiteľ Ježiš Kristus zničil smrť a evanjeliom zjavil život. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"3", "2", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"3", "3", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Semeno je Božie slovo, rozsievač je Kristus. Každý, kto ho nájde, bude žiť naveky. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"3", "4", "", "Ž 119, 105", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje slovo je svetlo pre moje nohy a pochodeň na mojich chodníkoch. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"3", "5", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"3", "6", "", "Jn 3, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Boh tak miloval svet, že dal svojho jednorodeného Syna; každý, kto v neho verí, má večný život. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"4", "A", "", "Mt 5, 12a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Radujte sa a jasajte, lebo máme hojnú odmenu v nebi. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"4", "B", "", "Mk 4, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ľud bývajúci v temnotách uvidel veľké svetlo. Svetlo zažiarilo tým, čo sedeli v temnom kraji smrti. <font color='#B71C1C'>– R.</font> Aleluja."}, {"4", "C", "", "Porov. Lk 4, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pán ma poslal hlásať evanjelium chudobným, oznámiť zajatým, že budú prepustení. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"4", "1", "", "Lk 7, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Veľký prorok povstal medzi nami a Boh navštívil svoj ľud. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"4", "2", "", "Mt 8, 17", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> On vzal na seba naše slabosti a niesol naše choroby. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"4", "3", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"4", "4", "", "Mk 1, 15", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Priblížilo sa Božie kráľovstvo. Kajajte sa a verte evanjeliu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"4", "5", "", "porov. Lk 8, 15", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení sú tí, čo zachovávajú Božie slovo v dobrom a šľachetnom srdci a s vytrvalosťou prinášajú úrodu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"4", "6", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"5", "A", "", "Jn 8, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som svetlo sveta, hovorí Pán; kto mňa nasleduje, bude mať svetlo života. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"5", "B", "", "Mt, 8, 17bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> On vzal na seba naše slabosti a niesol naše choroby. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"5", "C", "", "Mt 4, 19", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Poďte za mnou, hovorí Pán; a urobím z vás rybárov ľudí. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"5", "1", "", "Mt 4, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježiš hlásal evanjelium o kráľovstve a uzdravoval každú chorobu medzi ľudom. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"5", "2", "", "Ž 119, 36a. 29b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Bože, nakloň mi srdce k svojej náuke a milostivo mi daj svoj zákon. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"5", "3", "", "Porov. Jn 17, 17b.a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje slovo, Pane, je pravda; posväť nás pravdou. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"5", "4", "", "Jak 1, 21bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> V tichosti prijmime zasiate slovo, ktoré má moc spasiť vaše duše. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"5", "5", "", "Porov. Sk 16, 14b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pane, otvor naše srdce, aby sme porozumeli slovám tvojho Syna. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"5", "6", "", "Mt 4, 4b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nielen z chleba žije človek, ale z každého slova, ktoré vychádza z Božích úst. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"6", "A", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"6", "B", "", "Lk 7, 16bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Veľký prorok povstal medzi nami a Boh navštívil svoj ľud. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"6", "C", "", "Lk 6, 23ab", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Radujte sa a jasajte, lebo máme hojnú odmenu v nebi! <font color='#B71C1C'>– R.</font> Aleluja."},
            {"6", "1", "", "Jn 14, 6", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som cesta, pravda a život, hovorí Pán; nik nepríde k Otcovi, iba cezo mňa. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"6", "2", "", "Jn 14, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto ma miluje, bude zachovávať moje slovo, hovorí Pán; a môj Otec ho bude milovať a prídeme k nemu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"6", "3", "", "Porov. Ef 1, 17-18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Otec nášho Pána Ježiša Krista nech osvieti oči nášho srdca, aby sme vedeli, aká je nádej z nášho povolania. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"6", "4", "", "Porov. Jn 6, 63c. 68c", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje slová, Pane, sú Duch a život. Ty máš slová večného života. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"6", "5", "", "Jn 15, 15b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nazval som vás priateľmi, hovorí Pán; pretože som vám oznámil všetko, čo som počul od svojho otca. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"6", "6", "", "Porov. Mk 9, 7", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Otvorilo sa nebo a zaznel Otcov hlas: \"Toto je môj milovaný Syn, počúvajte ho.\" <font color='#B71C1C'>– R.</font> Aleluja."},
            {"7", "A", "", "1 Jn 2, 5a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto zachováva Kristovo slovo, v tom je Božia láska naozaj dokonalá. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"7", "B", "", "Porov. Lk 4, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pán ma poslal hlásať evanjelium chudobným, oznámiť zajatým, že budú prepustení. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"7", "C", "", "Jn 13, 34", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nové prikázanie vám dávam, hovorí Pán; aby ste sa milovali navzájom, ako som ja miloval vás. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"7", "1", "", "Porov. 2 Tim 1, 10b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Náš Spasiteľ Ježiš Kristus zničil smrť a evanjeliom zjavil život. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"7", "2", "", "Gal 6, 14", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja sa nechcem chváliť ničím iným, iba krížom nášho Pána Ježiša Krista, cez ktorý je svet ukrižovaný pre mňa a ja pre svet. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"7", "3", "", "Jn 14, 6", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som cesta, pravda a život, hovorí Pán; nik nepríde k Otcovi, iba cezo mňa. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"7", "4", "", "Porov. 1 Sol 2, 13", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Prijmite Božie slovo, nie ako ľudské slovo, ale – aké naozaj je – ako slovo Božie. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"7", "5", "", "Jn 17, 17b.a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje slovo, Pane, je pravda; posväť nás pravdou. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"7", "6", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"8", "A", "", "Hebr 4, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Živé je Božie slovo, a účinné, rozsudzuje myšlienky a úmysly srdca. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"8", "B", "", "Jak 1, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Otec nás zo svojej vôle zrodil slovom pravdy, aby sme boli ako prvotiny jeho stvorenia. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"8", "C", "", "Porov. 2 Flp 2, 15d-16a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Svieťte ako svetlá na svete a držte sa pevne slova života. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"8", "1", "", "2 Kor 8, 9", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježiš Kristus, hoci bol bohatý, stal sa chudobným, aby ste sa vy jeho chudobou obohatili. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"8", "2", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"8", "3", "", "Mk 10, 45", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Syn človeka prišiel, aby slúžil a položil svoj život ako výkupné za mnohých. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"8", "4", "", "Jn 8, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som svetlo sveta, hovorí Pán; kto mňa nasleduje, bude mať svetlo života. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"8", "5", "", "Porov. Jn 15, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som si vás vyvolil, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo, hovorí Pán. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"8", "6", "", "Porov. Kol 3, 16a. 17c", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Slovo Kristovo nech vo vás bohato prebýva; skrze Krista vzdávajte vďaky Bohu Otcovi. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"9", "A", "", "Ž 85, 8", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som vinič, vy ste ratolesti, hovorí Pán; kto ostáva vo mne a ja v ňom, prináša veľa ovocia. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"9", "B", "", "Porov. Jn 17, 17b.a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje slovo, Pane, je pravda; posväť nás pravdou. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"9", "C", "", "Porov. 1n 3, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Boh tak miloval svet, že dal svojho jednorodeného Syna; každý, kto v neho verí, má večný život. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"9", "1", "", "Porov. Zjv 1, 5ab", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježišu Kriste, verný svedok, prvorodený z mŕtvych, ty nás miluješ a svojou krvou si nás oslobodil od hriechov. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"9", "2", "", "Porov. Ef 1, 17-18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Otec nášho Pána Ježiša Krista nech osvieti oči nášho srdca, aby sme vedeli, aká je nádej z nášho povolania. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"9", "3", "", "Jan 11, 25a.26", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som vzkriesenie a život, hovorí Pán; kto verí vo mňa neumrie naveky. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"9", "4", "", "Porov. 2 Tim 1, 10b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Náš Spasiteľ Ježiš Kristus zničil smrť a evanjeliom zjavil život. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"9", "5", "", "Jn 14, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto ma miluje, bude zachovávať moje slovo, hovorí Pán; a môj Otec ho bude milovať a prídeme k nemu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"9", "6", "", "Mt 12, 35-37", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"10", "A", "", "Porov. Lk 4, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pán ma poslal hlásať evanjelium chudobným, oznámiť zajatým, že budú prepustení. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"10", "B", "", "Jn 12, 31b-32", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Teraz bude knieža tohto sveta vyhodené von, hovorí Pán; a ja, až budem vyzdvihnutý od zeme, všetkých pritiahnem k sebe. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"10", "C", "", "Lk 7, 16bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Veľký prorok povstal medzi nami a Boh navštívil svoj ľud. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"10", "1", "", "Mt 5, 12a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Radujte sa a jasajte, lebo máme hojnú odmenu v nebi! <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"10", "2", "", "Mt 5, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nech tak svieti vaše svetlo pred ľuďmi, aby videli vaše dobré skutky a oslavovali vášho Otca. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"10", "3", "", "Ž 25, 4b. 5a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pouč ma, Pane, o svojich chodníkoch, veď ma vo svojej pravde. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"10", "4", "", "Jn 13, 34", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nové prikázanie vám dávam, hovorí Pán; aby ste sa milovali navzájom, ako som ja miloval vás. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"10", "5", "", "Porov. Flp 2, 15d. 16a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Svieťte ako svetlá na svete a držte sa pevne slova života<font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"10", "6", "", "Ž 119, 36a. 29b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Bože, nakloň mi srdce k svojej náuke a milostivo mi daj svoj zákon. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"11", "A", "", "Mk 1, 15", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Priblížilo sa Božie kráľovstvo. Kajajte sa a verte evanjeliu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"11", "B", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Semeno je Božie slovo, rozsievač je Kristus. Každý, kto ho nájde, bude žiť naveky. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"11", "C", "", "1 Jn 4, 10b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Boh nás miloval a poslal svojho Syna ako zmiernu obetu za naše hriechy. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"11", "1", "", "Ž 119, 105", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje slovo je svetlo pre moje nohy a pochodeň na mojich chodníkoch. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"11", "2", "", "Jn 13, 34", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nové prikázanie vám dávam, hovorí Pán; aby ste sa milovali navzájom, ako som ja miloval vás. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"11", "3", "", "Jn 14, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto ma miluje, bude zachovávať moje slovo, hovorí Pán; a môj Otec ho bude milovať a prídeme k nemu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"11", "4", "", "Rim 8, 15bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Dostali ste Ducha adoptívneho synovstva, v ktorom voláme: Abba, Otče. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"11", "5", "", "Mt 5, 3", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"11", "6", "", "2 Kor 8, 9", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježiš Kristus, hoci bol bohatý, stal sa chudobným, aby ste sa vy jeho chudobou obohatili. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"12", "A", "", "Jn 15, 26b. 27a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Duch pravdy vydá o mne svedectvo, hovorí Pán; aj vy vydávate svedectvo. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"12", "B", "", "Lk 7, 16bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Veľký prorok povstal medzi nami a Boh navštívil svoj ľud. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"12", "C", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"12", "1", "", "Hebr 4, 12a. d", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Živé je Božie slovo a účinné, rozsudzuje myšlienky a úmysly srdca. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"12", "2", "", "Jn 8, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som svetlo sveta, hovorí Pán; kto mňa nasleduje, bude mať svetlo života. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"12", "3", "", "Jn 15, 4a. 5b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ostaňte vo mne a ja vo vás, hovorí Pán; kto ostáva vo mne, prináša veľa ovocia. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"12", "4", "", "Jn 14, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto ma miluje, bude zachovávať moje slovo, hovorí Pán; a môj Otec ho bude milovať a prídeme k nemu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"12", "5", "", "Mt 8, 17bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kristus vzal na seba naše slabosti a niesol naše choroby. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"12", "6", "", "Mt 8, 17bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kristus vzal na seba naše slabosti a niesol naše choroby. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"13", "A", "", "1 Pt 2,9", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vy ste vyvolený rod, kráľovské kňazstvo, svätý národ; aby ste zvestovali slávne skutky toho, ktorý vás z tmy povolal do svojho obdivuhodného svetla. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"13", "B", "", "Porov. 2 Tim 1, 10b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Náš Spasiteľ Ježiš Kristus zničil smrť a evanjeliom zjavil život. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"13", "C", "", "1 Sam 9, 9; Jn 6, 68c", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Hovor, Pane, tvoj sluha počúva; ty máš slová večného života. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"13", "1", "", "Porov. Ž 95, 8", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nezatvrdzujte dnes svoje srdcia, ale počúvajte Pánov hlas. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"13", "2", "", "Porov. Ž 130, 5", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Spolieham sa na Pána, moja duša sa spolieha na jeho slovo. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"13", "3", "", "Jak 1, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Otec nás zo svojej vôle zrodil slovom pravdy, aby sme boli ako prvotiny jeho stvorenia. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"13", "4", "", "2 Kor 5, 19", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> V Kristovi Boh zmieril svet so sebou. A nám odovzdal slovo zmierenia. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"13", "5", "", "Mt 11, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Poďte ku mne všetci, ktorí sa namáhate a ste preťažení a ja vás posilním. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"13", "6", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"14", "A", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"14", "B", "", "Porov. Lk 4, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Duch Pána je nado mnou; poslal ma hlásať evanjelium chudobným. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"14", "C", "", "Kol 3, 15a. 16a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vo vašich srdciach nech vládne Kristov pokoj. Kristovo slovo nech vo vás bohato prebýva. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"14", "1", "", "Porov. 2 Tim 1, 10b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Náš Spasiteľ Ježiš Kristus zničil smrť a evanjeliom zjavil život. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"14", "2", "", "Jn 10, 14", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som dobrý pastier, hovorí Pán; Poznám svoje ovce a moje poznajú mňa. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"14", "3", "", "Mk 1, 15bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Priblížilo sa Božie kráľovstvo. Kajajte sa a verte evanjeliu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"14", "4", "", "Mk 1, 15bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Priblížilo sa Božie kráľovstvo. Kajajte sa a verte evanjeliu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"14", "5", "", "Jn 16, 13a; 14, 26b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Keď príde Duch pravdy, uvedie vás do plnej pravdy a pripomenie vám všetko, čo som vám povedal. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"14", "6", "", "1 Pt 4, 14", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Keď vás hanobia pre Kristovo meno, ste blahoslavení, lebo Duch Boží na vás spočíva. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"15", "A", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Semeno je Božie slovo, rozsievač je Kristus. Každý, kto ho nájde, bude žiť naveky. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"15", "B", "", "Porov. Ef 1, 17-18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Otec nášho Pána Ježiša Krista nech osvieti oči nášho srdca, aby sme vedeli, aká je nádej z nášho povolania. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"15", "C", "", "Porov. Jn 6, 63c. 68c", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje slová, Pane, sú Duch a život. Ty máš slová večného života. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"15", "1", "", "Mt 5, 10", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení prenasledovaní pre spravodlivosť, lebo ich je nebeské kráľovstvo. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"15", "2", "", "Porov. Ž 95, 8", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nezatvrdzujte dnes svoje srdcia, ale počúvajte Pánov hlas. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"15", "3", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"15", "4", "", "Mt 11, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Poďte ku mne všetci, ktorí sa namáhate a ste preťažení a ja vás posilním, hovorí Pán. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"15", "5", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"15", "6", "", "2 Kor 5, 19", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> V Kristovi Boh zmieril svet so sebou. A nám odovzdal slovo zmierenia. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"16", "A", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"16", "B", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"16", "C", "", "Porov. Lk 8, 15", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení sú tí, čo zachovávajú Božie slovo v dobrom a šľachetnom srdci a s vytrvalosťou prinášajú úrodu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"16", "1", "", "Porov. Ž 95, 8", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nezatvrdzujte dnes svoje srdcia, ale počúvajte Pánov hlas. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"16", "2", "", "Jn 14, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto ma miluje, bude zachovávať moje slovo, hovorí Pán; a môj Otec ho bude milovať a prídeme k nemu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"16", "3", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Semeno je Božie slovo, rozsievač je Kristus. Každý, kto ho nájde, bude žiť naveky. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"16", "4", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"16", "5", "", "Porov. Lk 8, 15", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení sú tí, čo zachovávajú Božie slovo v dobrom a šľachetnom srdci a s vytrvalosťou prinášajú úrodu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"16", "6", "", "Jak 1, 21bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> V tichosti prijmite zasiate slovo, ktoré má moc spasiť vaše duše. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"17", "A", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"17", "B", "", "Lk 7, 16bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Veľký prorok povstal medzi nami a Boh navštívil svoj ľud. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"17", "C", "", "Rim 8, 15bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Dostali ste Ducha adoptívneho synovstva, v ktorom voláme: Abba, Otče. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"17", "1", "", "Jak 1, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Otec nás zo svojej vôle zrodil slovom pravdy, aby sme boli ako prvotiny jeho stvorenia. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"17", "2", "", "", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Semeno je Božie slovo, rozsievač je Kristus. Každý, kto ho nájde, bude žiť naveky. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"17", "3", "", "Jn 15, 15b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nazval som vás priateľmi, hovorí Pán; pretože som vám oznámil všetko, čo som počul od svojho Otca. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"17", "4", "", "Porov. Sk 16, 14b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pane, otvor naše srdce, aby sme porozumeli slovám tvojho Syna. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"17", "5", "", "1 Pt 1, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pánovo slovo trvá naveky. A to je slovo, ktoré sa nám zvestovalo. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"17", "6", "", "Mt 5, 10", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení prenasledovaní pre spravodlivosť, lebo ich je nebeské kráľovstvo. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"18", "A", "", "Mt 4, 4b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nielen z chleba žije človek, ale z každého slova, ktoré vychádza z Božích úst. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"18", "B", "", "Mt 4, 4b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nielen z chleba žije človek, ale z každého slova, ktoré vychádza z Božích úst. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"18", "C", "", "Mt 5, 3", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"18", "1", "", "Mt 4, 4b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nielen z chleba žije človek, ale z každého slova, ktoré vychádza z Božích úst. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"18", "2", "", "Jn 1, 49b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Rabbi, ty si Boží Syn, ty si kráľ Izraela! <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"18", "3", "", "Lk 7, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Veľký prorok povstal medzi nami a Boh navštívil svoj ľud. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"18", "4", "", "Mt 16, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ty si Peter a na tejto skale postavím svoju Cirkev a pekelné brány ju nepremôžu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"18", "5", "", "Mt 5, 10", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení prenasledovaní pre spravodlivosť, lebo ich je nebeské kráľovstvo. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"18", "6", "", "Porov. 2 Tim 1, 10b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Náš Spasiteľ Ježiš Kristus zničil smrť a evanjeliom zjavil život. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"19", "A", "", "Porov. Ž 130, 5", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Spolieham sa na Pána, moja duša sa spolieha na jeho slovo. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"19", "B", "", "Jn 6, 51ab", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som živý chlieb, ktorý zostúpil z neba, hovorí Pán; kto bude jesť z tohoto chleba, bude žiť naveky. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"19", "C", "", "Mt 24, 42a. 44", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Bdejte a buďte pripravení, lebo Syn človeka príde v hodinu, o ktorej neviete. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"19", "1", "", "Porov. 2 Sol 2, 14", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Boh nás povolal skrze evanjelium, aby sme získali slávu nášho Pána Ježiša Krista. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"19", "2", "", "Mt 11, 29ab", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vezmite na seba moje jarmo, hovorí Pán; a učte sa odo mňa, lebo som tichý a pokorný srdcom. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"19", "3", "", "2 Kor 5, 19", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> V Kristovi Boh zmieril svet so sebou a nám odovzdal slovo zmierenia. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"19", "4", "", "Ž 119, 135", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pane, vyjasni tvár nad svojím služobníkom a nauč ma svojim ustanoveniam. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"19", "5", "", "Porov. 1 Sol 2, 13", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Prijmite Božie slovo, nie ako ľudské slovo, ale <font color='#B71C1C'>–</font> aké naozaj je <font color='#B71C1C'>–</font> ako slovo Božie. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"19", "6", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"20", "A", "", "Mt 4, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježiš hlásal evanjelium o kráľovstve a uzdravoval každú chorobu medzi ľudom. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"20", "B", "", "Jn 6, 56", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto je moje telo a pije moju krv, ostáva vo mne a ja v ňom, hovorí Pán. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"20", "C", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"20", "1", "", "Mt 5, 3", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"20", "2", "", "2 Kor 8, 9", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježiš Kristus, hoci bol bohatý, stal sa chudobným, aby ste sa vy jeho chudobou obohatili. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"20", "3", "", "Hebr 4, 12a.d", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Živé a účinné je Božie slovo; rozsudzuje myšlienky a úmysly srdca. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"20", "4", "", "Porov. Ž 95, 8", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nezatvrdzujte dnes svoje srdcia, ale počúvajte Pánov hlas. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"20", "5", "", "Ž 25, 4b. 5a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pouč ma, Pane, o svojich chodníkoch, veď ma vo svojej pravde. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"20", "6", "", "Mt 23, 9b. 10b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Len jeden je váš Otec, ten nebeský. Len jediný je váš Učiteľ, Kristus. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"21", "A", "", "Mt 16, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ty si Peter a na tejto skale postavím svoju Cirkev a pekelné brány ju nepremôžu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"21", "B", "", "Porov. Jn 6, 63c. 68c", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje slová, Pane, sú Duch a život. Ty máš slová večného života. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"21", "C", "", "Jn 14, 6", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som cesta, pravda a život, hovorí Pán; nik nepríde k Otcovi, iba cezo mňa. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"21", "1", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"21", "2", "", "Hebr 4, 12a.d", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Živé je Božie slovo a účinné, rozsudzuje myšlienky a úmysly srdca. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"21", "3", "", "1 Jn 2, 5a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto zachováva Kristovo slovo, v tom je Božia láska naozaj dokonalá. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"21", "4", "", "Mt 24, 42a. 44", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Bdejte a buďte pripravení, lebo Syn človeka príde v hodinu, o ktorej neviete. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"21", "5", "", "Lk 21, 36", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Bdejte celý čas a modlite sa, aby ste sa mohli postaviť pred Syna človeka. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"21", "6", "", "Jn 13, 34", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nové prikázanie vám dávam, hovorí Pán; aby ste sa milovali navzájom, ako som ja miloval vás. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"22", "A", "", "Porov. Ef 1, 17-18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Otec nášho Pána Ježiša Krista nech osvieti oči nášho srdca, aby sme vedeli, aká je nádej z nášho povolania. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"22", "B", "", "Jak 1, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Otec nás zo svojej vôle zrodil slovom pravdy, aby sme boli ako prvotiny jeho stvorenia. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"22", "C", "", "Mt 11, 29ab", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vezmite na seba moje jarmo a učte sa odo mňa, lebo som tichý a pokorný srdcom. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"22", "1", "", "Porov. Lk 4, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Duch Pána je nado mnou; poslal ma hlásať evanjelium chudobným. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"22", "2", "", "Lk 7, 16bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Veľký prorok povstal medzi nami a Boh navštívil svoj ľud. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"22", "3", "", "Porov. Lk 4, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pán ma poslal hlásať evanjelium chudobným, oznámiť zajatým, že budú prepustení. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"22", "4", "", "Mt 4, 19", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Poďte za mnou, hovorí Pán; a urobím z vás rybárov ľudí. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"22", "5", "", "Jn 8, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som svetlo sveta, hovorí Pán; kto mňa nasleduje, bude mať svetlo života. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"22", "6", "", "Jn 14, 6", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som cesta, pravda a život, hovorí Pán; nik nepríde k Otcovi, iba cezo mňa. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"23", "A", "", "2 Kor 5, 19", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> V Kristovi Boh zmieril svet so sebou. A nám odovzdal slovo zmierenia. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"23", "B", "", "Mt 4, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Dobre robí všetko: aj hluchým dáva sluch aj nemým reč. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"23", "C", "", "Ž 119, 135", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pane, vyjasni tvár nad svojím služobníkom a nauč ma svojim ustanoveniam. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"23", "1", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"23", "2", "", "Porov. Jn 15, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som si vás vyvolil zo sveta, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo, hovorí Pán. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"23", "3", "", "Lk 6, 23ab", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Radujte sa a jasajte, lebo máte veľkú odmenu v nebi! <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"23", "4", "", "1 Jn 4, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Keď sa milujeme navzájom, Boh ostáva v nás a jeho láska v nás je dokonalá. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"23", "5", "", "Porov. Jn 17, 17b.a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje slovo, Pane, je pravda; posväť nás pravdou. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"23", "6", "", "Jn 14, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto ma miluje, bude zachovávať moje slovo, hovorí Pán; a môj Otec ho bude milovať a prídeme k nemu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"24", "A", "", "Rim 14, 7-9", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nové prikázanie vám dávam, hovorí Pán; aby ste sa milovali navzájom, ako som ja miloval vás. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"24", "B", "", "Gal 6, 14", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja sa nechcem chváliť ničím iným, iba krížom nášho Pána Ježiša Krista, cez ktorý je svet ukrižovaný pre mňa a ja pre svet. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"24", "C", "", "2 Kor 5, 19", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> V Kristovi Boh zmieril svet so sebou. A nám odovzdal slovo zmierenia. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"24", "1", "", "Jn 3, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Boh tak miloval svet, že dal svojho jednorodeného Syna; každý, kto v neho verí, má večný život. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"24", "2", "", "Lk 7, 16bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Veľký prorok povstal medzi nami a Boh navštívil svoj ľud. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"24", "3", "", "Porov. Jn 6, 63c. 68c", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje slová, Pane, sú Duch a život. Ty máš slová večného života. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"24", "4", "", "Mt 11, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Poďte ku mne všetci, ktorí sa namáhate a ste preťažení, a ja vás posilním, hovorí Pán. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"24", "5", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"24", "6", "", "Porov. Lk 8, 15", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení sú tí, čo zachovávajú Božie slovo v dobrom a šľachetnom srdci a s vytrvalosťou prinášajú úrodu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"25", "A", "", "Porov. Sk 16, 14b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pane, otvor naše srdce, aby sme porozumeli slovám tvojho Syna. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"25", "B", "", "Porov. 2 Sol 2, 14", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Boh nás povolal skrze evanjelium, aby sme získali slávu nášho Pána Ježiša Krista. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"25", "C", "", "2 Kor 8, 9", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježiš Kristus, hoci bol bohatý, stal sa chudobným, aby ste sa vy jeho chudobou obohatili. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"25", "1", "", "Mt 5, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nech tak svieti vaše svetlo pred ľuďmi, aby videli vaše dobré skutky a oslavovali vášho Otca. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"25", "2", "", "Lk 11, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení sú tí, čo počúvajú Božie slovo a zachovávajú ho. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"25", "3", "", "Mk 1, 15bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Priblížilo sa Božie kráľovstvo; kajajte sa a verte evanjeliu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"25", "4", "", "Jn 14, 6", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som cesta, pravda a život, hovorí Pán; nik nepríde k Otcovi, iba cezo mňa. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"25", "5", "", "Mk 10, 45", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Syn človeka prišiel, aby slúžil a položil svoj život ako výkupné za mnohých. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"25", "6", "", "Porov. 2 Tim 1, 10b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Náš Spasiteľ Ježiš Kristus zničil smrť a evanjeliom zjavil život. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"26", "A", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"26", "B", "", "Porov. Jn 17, 17b.a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje slovo, Pane, je pravda; posväť nás pravdou. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"26", "C", "", "2 Kor 8, 9", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježiš Kristus, hoci bol bohatý, stal sa chudobným, aby ste sa vy jeho chudobou obohatili. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"26", "1", "", "Mk 10, 45", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Syn človeka prišiel, aby slúžil a položil svoj život ako výkupné za mnohých. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"26", "2", "", "Mk 10, 45", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Syn človeka prišiel, aby slúžil a položil svoj život ako výkupné za mnohých. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"26", "3", "", "Porov Flp 3, 8-9", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Všetko pokladám za stratu a za odpadky, aby som získal Krista a našiel sa v ňom. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"26", "4", "", "Mk 1, 15bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Priblížilo sa Božie kráľovstvo. Kajajte sa a verte evanjeliu. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"26", "5", "", "Porov. Ž 95, 8", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nezatvrdzujte dnes svoje srdcia, ale počúvajte Pánov hlas. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"26", "6", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>–</font> <font color='#B71C1C'>R.</font> Aleluja."},
            {"27", "A", "", "Jn 15, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som si vás vyvolil zo sveta, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"27", "B", "", "Jn 4, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Keď sa milujeme navzájom, Boh ostáva v nás, a jeho láska v nás je dokonalá. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"27", "C", "", "1 Pt 1, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pánovo slovo trvá naveky. A to je slovo, ktoré sa nám zvestovalo. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"27", "1", "", "Jn 13, 34", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nové prikázanie vám dávam, hovorí Pán; aby ste sa milovali navzájom, ako som ja miloval vás. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"27", "2", "", "Lk 11, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení sú tí, čo počúvajú Božie slovo a zachovávajú ho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"27", "3", "", "Rim 8, 15bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Dostali ste Ducha adoptívneho synovstva, v ktorom voláme: Abba, Otče. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"27", "4", "", "Porov. Sk 16, 14b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pane, otvor naše srdce, aby sme porozumeli slovám tvojho Syna. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"27", "5", "", "Jn 12, 31b-32", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Teraz bude knieža tohto sveta vyhodené von, hovorí Pán; a ja, až budem vyzdvihnutý od zeme, všetkých pritiahnem k sebe. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"27", "6", "", "Lk 11, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení sú tí, čo počúvajú Božie slovo a zachovávajú ho. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"28", "A", "", "Porov. Ef 1, 17-18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Otec nášho Pána Ježiša Krista nech osvieti oči nášho srdca, aby sme vedeli, aká je nádej z nášho povolania. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"28", "B", "", "Mt 5, 3", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"28", "C", "", "1Sol 5, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pri všetkom vzdávajte vďaky, lebo to je Božia vôľa v Kristovi Ježišovi pre vás! <font color='#B71C1C'>– R.</font> Aleluja."},
            {"28", "1", "", "Porov. Ž 95, 8", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nezatvrdzujte dnes svoje srdcia, ale počúvajte Pánov hlas. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"28", "2", "", "Hebr 4, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Živé je Božie slovo a účinné; rozsudzuje myšlienky a úmysly srdca. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"28", "3", "", "Jn 10 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"28", "4", "", "Jn 14, 6", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som cesta, pravda a život, hovorí Pán; nik nepríde k Otcovi, iba cezo mňa. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"28", "5", "", "Lk 12, 1-7", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje milosrdenstvo, Pane, nech je nad nami, ako dúfame v teba. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"28", "6", "", "Jn 15, 26b. 27a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Duch pravdy vydá o mne svedectvo, hovorí Pán; aj vy vydávate svedectvo. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29", "A", "", "Porov. Flp 2, 15d-16a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Svieťte ako svetlá na svete a držte sa pevne slova života. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29", "B", "", "Mk 10, 45", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Syn človeka prišiel, aby slúžil a položil svoj život ako výkupné za mnohých. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29", "C", "", "Hebr 4, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Živé je Božie slovo a účinné, rozsudzuje myšlienky a úmysly srdca. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29", "1", "", "Mt 5, 3", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29", "2", "", "Lk 21, 36", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Bdejte celý čas a modlite sa, aby ste sa mohli postaviť pred Syna človeka. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29", "3", "", "Mt 24, 42a. 44", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Bdejte a buďte pripravení, lebo Syn človeka príde v hodinu, o ktorej neviete. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29", "4", "", "Porov. Flp 3, 8-9", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Všetko pokladám za stratu a za odpadky, aby som získal Krista a našiel sa v ňom. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29", "5", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"29", "6", "", "Ez 33, 11", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nechcem smrť bezbožného, hovorí Pán; ale aby sa odvrátil od svojej cesty a žil. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "A", "", "Jn 14, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto ma miluje, bude zachovávať moje slovo, hovorí Pán; a môj Otec ho bude milovať a prídeme k nemu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "B", "", "Jn 8, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som svetlo sveta, hovorí Pán; kto mňa nasleduje, bude mať svetlo života. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "C", "", "2 Kor 5, 19", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> V Kristovi Boh zmieril svet so sebou. A nám odovzdal slovo zmierenia. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "1", "", "Porov. Jn 17, 17b.a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Tvoje slovo, Pane, je pravda; posväť nás pravdou. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "2", "", "Porov. Mt 11, 25", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Zvelebujem ťa, Otče, Pán neba i zeme, že si zjavil maličkým tajomstvá Božieho kráľovstva. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "3", "", "Porov. 2 Sol 2, 14", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Boh nás povolal skrze evanjelium, aby sme získali slávu nášho Pána Ježiša Krista. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "4", "", "Lk 19, 38", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Požehnaný kráľ, ktorý prichádza v mene Pánovom! Pokoj na nebi a sláva na výsostiach! <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "6", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"30", "6", "", "Mt 11, 29ab", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vezmite na seba moje jarmo, hovorí Pán; a učte sa odo mňa, lebo som tichý a pokorný srdcom. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"31", "A", "", "Mt 23, 9b. 10b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Len jeden je váš Otec, ten nebeský. Len jediný je váš Učiteľ, Kristus. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"31", "B", "", "Jn 14, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto ma miluje, bude zachovávať moje slovo, hovorí Pán; a môj Otec ho bude milovať a prídeme k nemu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"31", "C", "", "Porov. Jn 3, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Boh tak miloval svet, že dal svojho jednorodeného Syna; každý, kto v neho verí, má večný život. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"31", "1", "", "Jn 8, 31b-32a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ak ostanete v mojom slove, budete naozaj mojimi učeníkmi a poznáte pravdu, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"31", "2", "", "Mt 11, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Poďte ku mne všetci, ktorí sa namáhate a ste preťažení a ja vás posilním, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"31", "3", "", "1 Pt 4, 14", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Keď vás hanobia pre Kristovo meno, ste blahoslavení, lebo Duch Boží na vás spočíva. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"31", "4", "", "Mt 11, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Poďte ku mne všetci, ktorí sa namáhate a ste preťažení a ja vás posilním, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"31", "5", "", "1 Jn 2, 5", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto zachováva Kristovo slovo, v tom je Božia láska naozaj dokonalá. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"31", "6", "", "2 Kor 8, 9", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježiš Kristus, hoci bol bohatý, stal sa chudobným, aby ste sa vy jeho chudobou obohatili. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"32", "A", "", "Mt 24, 42a. 44", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Bdejte a buďte pripravení, lebo Syn človeka príde v hodinu, o ktorej neviete. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"32", "B", "", "Mt 5, 3", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"32", "C", "", "Porov. Zjv 1, 5a. 6b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ježiš Kristus je prvorodený z mŕtvych; jemu sláva a vláda na veky vekov. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"32", "1", "", "Porov. Flp 2, 15d-16a", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Svieťte ako svetlá na svete a držte sa pevne slova života. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"32", "2", "", "Jn 14, 23", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Kto ma miluje, bude zachovávať moje slovo, hovorí Pán; a môj Otec ho bude milovať a prídeme k nemu. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"32", "3", "", "1 Sol 5, 18", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Pri všetkom vzdávajte vďaky, lebo to je Božia vôľa v Kristovi Ježišovi pre vás! <font color='#B71C1C'>– R.</font> Aleluja."},
            {"32", "4", "", "Jn 15, 5", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som vinič, vy ste ratolesti, hovorí Pán; kto ostáva vo mne a ja v ňom, prináša veľa ovocia. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"32", "5", "", "Lk 21, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vzpriamte sa, zodvihnite hlavu, lebo sa blíži vaše vykúpenie. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"32", "6", "", "Porov. 2 Sol 2, 14", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Boh nás povolal skrze evanjelium, aby sme získali slávu nášho Pána Ježiša Krista. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"33", "A", "", "Mt 24, 42a. 44", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Bdejte a buďte pripravení, lebo Syn človeka príde v hodinu, o ktorej neviete. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"33", "B", "", "Lk 21, 36", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Bdejte celý čas a modlite sa, aby ste sa mohli postaviť pred Syna človeka. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"33", "C", "", "Lk 21, 28bc", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vzpriamte sa, zodvihnite hlavu, lebo sa blíži vaše vykúpenie. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"33", "1", "", "Jn 8, 12", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som svetlo sveta, hovorí Pán; kto mňa nasleduje, bude mať svetlo života. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"33", "2", "", "1 Jn 4, 10b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Boh nás miloval a poslal svojho Syna ako zmiernu obetu za naše hriechy. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"33", "3", "", "Jn 15, 16", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Ja som si vás vyvolil zo sveta, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo, hovorí Pán. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"33", "4", "", "Porov Ž 95, 8", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Nezatvrdzujte dnes svoje srdcia, ale počúvajte Pánov hlas. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"33", "5", "", "Jn 10, 27", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Moje ovce počúvajú môj hlas, hovorí Pán; ja ich poznám a ony idú za mnou. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"33", "6", "", "Porov. 2 Tim 1, 10b", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Náš Spasiteľ Ježiš Kristus zničil smrť a evanjeliom zjavil život. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"34", "A", "", "", ""},
            {"34", "B", "", "", ""},
            {"34", "C", "", "", ""},
            {"34", "1", "", "Mt 24, 42a. 44", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Bdejte a buďte pripravení, lebo Syn človeka príde v hodinu, o ktorej neviete. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"34", "2", "", "Zjv 2, 10c", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Buď verný až do smrti, hovorí Pán; a dám ti veniec života. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"34", "3", "", "Zjv 2, 10c", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Buď verný až do smrti, hovorí Pán; a dám ti veniec života. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"34", "4", "", "Lk 21, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vzpriamte sa, zodvihnite hlavu, lebo sa blíži vaše vykúpenie. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"34", "5", "", "Lk 21, 28", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Vzpriamte sa, zodvihnite hlavu, lebo sa blíži vaše vykúpenie. <font color='#B71C1C'>– R.</font> Aleluja."},
            {"34", "6", "", "Lk 21, 36", "<font color='#B71C1C'>R.</font> Aleluja. <font color='#B71C1C'>–</font> Bdejte celý čas a modlite sa, aby ste sa mohli postaviť pred Syna človeka. <font color='#B71C1C'>– R.</font> Aleluja."},
    };
}

