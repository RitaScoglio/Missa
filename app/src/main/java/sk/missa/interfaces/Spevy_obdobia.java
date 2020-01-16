package sk.missa.interfaces;

/*
 * Spevy v cezročnom období - cezrokSpev; v pôstnom období - postSpev; vo veľkonočnom období - velkanocSpev; v adventnom období - adventSpev
 * cezročné obdobie: {týždeň v cezročnom období, úvodný spev - text, úvodný spev - súradnice, spev po prijímaní - text, spev po prijímaní - súradnice},
 * pôstne obdobie: {týždeň v pôstnom období+deň (napr. 2 týždeň v pondelok - 21), úvodný spev - text, úvodný spev - súradnice, spev po prijímaní - text, spev po prijímaní - súradnice},
 * veľkonočné obdobie: {týždeň vo veľkonočnom období+deň (napr. 2 týždeň v pondelok - 21), úvodný spev - text, úvodný spev - súradnice, spev po prijímaní - text, spev po prijímaní - súradnice},
 * adventné obdobie: {týždeň v adventnom období+deň (napr. 2 týždeň v pondelok - 21), úvodný spev - text, úvodný spev - súradnice, spev po prijímaní - text, spev po prijímaní - súradnice},
 *
 * Keďže sú spevy v adventnom a vianočnom období viazané na deň, nachádzajú sa v Spevy_svatci uložené v mesiaci, ktorému prislúchajú a s dňom ako ID
 * */

public interface Spevy_obdobia {
    String[][] cezrokSpev = {
            {"1", "Na vznešenom tróne videl som Pána,<br>" +
                    "ktorému sa klaňajú anjeli a spoločne mu spievajú:<br>" +
                    "\"Hľa, to je ten, ktorý kraľuje naveky.\"", "",
                    "Pane, u teba je zdroj života<br>" +
                            "a v tvojom svetle uvidíme svetlo.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Jn 10,10)</font><br>" +
                            "Pán Ježiš hovorí:<br>" +
                            "Ja som prišiel, aby ľudia mali život<br>" +
                            "a aby ho mali v hojnosti.", "(Ž 35, 10)"},
            {"2", "Nech sa ti klania, Bože, celá zem a nech ti spieva;<br>" +
                    "nech ospevuje tvoje meno, Najvyšší.", "(Ž 65,4)",
                    "Pripravil si mi hostinu, Pane,<br>" +
                            "a môj kalich ma napĺňa radosťou.<br>" +
                            "<font color='#B71C1C'>Alebo: (1 Jn 4, 16)</font><br>" +
                            "My sme poznali lásku, akú má Boh k nám,<br>" +
                            "a uverili sme v ňu.", "(Porov. Ž 22, 5)"},
            {"3", "Spievajte Pánovi pieseň novú,<br>" +
                    "spievaj Pánovi celá zem;<br>" +
                    "Vznešenosť a krása ho obklopujú,<br>" +
                    "moc a veleba napĺňajú jeho svätyňu .", "(Ž 95, 1. 6)",
                    "Pristúpte k Pánovi a budete žiariť,<br>" +
                            "a tvár vám nesčervenie hanbou .<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 8, 12)</font><br>" +
                            "Ja som svetlo sveta - hovorí Pán.<br>" +
                            "Kto mňa nasleduje, nebude chodiť v temnote,<br>" +
                            "ale bude mať svetlo života.", "(Porov. Ž 33, 6)"},
            {"4", "Zachráň nás, Pane, Bože náš,<br>" +
                    "a zhromaždi nás z krajín pohanských,<br>" +
                    "aby sme mohli velebiť tvoje sväté meno<br>" +
                    "a boli hrdí na to, že ťa môžeme oslavovať.", "(Porov. Ž 105, 47)",
                    "Rozjasni svoju tvár nad svojím sluhom<br>" +
                            "a zachráň ma vo svojom milosrdenstve.<br>" +
                            "Pane, nech nie som zahanbený, veď teba vzývam.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 5, 3-4)</font><br>" +
                            "Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo.<br>" +
                            "Blahoslavení tichí, lebo im bude patriť zem.", "(Ž 30, 17-18)"},
            {"5", "Poďte, klaňajme sa a na zem padnime pred Pánom,<br>" +
                    "ktorý nás stvoril, lebo on je náš Boh.", "(Ž 94, 6-7)",
                    "Oslavujme Pána za jeho milosrdenstvo<br>" +
                            "a za obdivuhodné skutky v prospech ľudí,<br>" +
                            "lebo smädného napojil<br>" +
                            "a hladného nasýtil dobrými vecami.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 5, 5-6)</font><br>" +
                            "Blahoslavení plačúci, lebo oni budú potešení.<br>" +
                            "Blahoslavení lační a smädní po spravodlivosti,<br>" +
                            "lebo oni budú nasýtení.", "(Ž 106, 8-9)"},
            {"6", "Bože, buď mi skalou útočišťa,<br>" +
                    "opevneným hradom mojej spásy.<br>" +
                    "Veď ty si moja sila a moje útočište,<br>" +
                    "pre svoje meno budeš ma viesť a opatrovať.", "(Ž 30, 3-4)",
                    "Pán Boh splnil túžbu svojho ľudu:<br>" +
                            "prijali pokrm a nasýtili sa,<br>" +
                            "ich očakávanie sa splnilo.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 3, 16)</font><br>" +
                            "Boh tak miloval svet,<br>" +
                            "že dal svojho jednorodeného Syna,<br>" +
                            "aby nezahynul nik, čo v neho verí,<br>" +
                            "ale aby mal večný život.", "(Porov. Ž 77, 29-30)"},
            {"7", "Pane, ja dúfam v tvoje milosrdenstvo,<br>" +
                    "moje srdce sa teší z tvojej pomoci.<br>" +
                    "Spievať budem Pánovi, že ma zahŕňa dobrodeniami.", "(Ž 12, 6)",
                    "Pane, vyrozprávam všetky tvoje diela zázračné,<br>" +
                            "v tebe sa budem radovať a tešiť,<br>" +
                            "ospevovať budem tvoje meno, Najvyšší.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Jn 11, 27)</font><br>" +
                            "Pane, verím, že ty si Kristus, Boží Syn,<br>" +
                            "ktorý prišiel na tento svet.", "(Ž 9, 2-3)"},
            {"8", "Pán mi bol oporou,<br>" +
                    "vyviedol ma na miesto priestranné,<br>" +
                    "zachránil ma, lebo si ma obľúbil.", "(Porov. Ž 17, 19-20)",
                    "Budem spievať Pánovi, že ma zahŕňa dobrodeniami,<br>" +
                            "oslavovať budem meno Najvyššieho.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 28, 20)</font><br>" +
                            "Hľa, ja som s vami po všetky dni,<br>" +
                            "až do skončenia sveta – hovorí Pán.", "(Ž 12, 6)"},
            {"9", "Pane, pozriže na mňa a zmiluj sa nado mnou,<br>" +
                    "lebo som sám a úbohý.<br>" +
                    "Pozri na moju biedu a na moje trápenie<br>" +
                    "a odpusť mi všetky priestupky.", "(Ž 24, 16. 18)",
                    "K tebe, Bože, volám, lebo ty ma vyslyšíš.<br>" +
                            "Nakloň ku mne sluch a vypočuj moje slová.", "(Ž 16, 6)"},
            {"10", "Pán je moje svetlo a moja spása, koho sa mám báť?<br>" +
                    "Pán je ochranca môjho života, pred kým sa mám strachovať?<br>" +
                    "Moji utláčatelia a nepriatelia strácajú silu a padajú.", "(Porov. Ž 26, 1-2)",
                    "Pane, opora moja, útočište moje, osloboditeľ môj,<br>" +
                            "Bože môj, moja pomoc, tebe dôverujem.", "(Ž 17, 3)"},
            {"11", "Čuj, Pane, hlas môjho volania,<br>" +
                    "ty si moja pomoc, neodvrhuj ma,<br>" +
                    "ani ma neopúšťaj, Bože, moja spása.", "(Ž 26, 7. 9)",
                    "O jedno prosím Pána a za tým túžim,<br>" +
                            "aby som mohol bývať v dome Pánovom po všetky dni svojho života.", "(Ž 26, 4)"},
            {"12", "Pán je sila svojho ľudu<br>" +
                    "a útočište spásy pre svojho Pomazaného.<br>" +
                    "Spas svoj ľud a požehnaj svojich dedičov,<br>" +
                    "spravuj ich a veď ich až naveky.", "(Ž 27, 8-9)",
                    "Oči všetkých sa s dôverou upierajú na teba, Pane,<br>" +
                            "a ty im dávaš pokrm v pravý čas.", "(Ž 144, 15)"},
            {"13", "Tlieskajte rukami, všetky národy,<br>" +
                    "jasajte Bohu hlasom radostným.", "(Ž 46, 2)",
                    "Dobroreč, duša moja, Pánovi<br>" +
                            "a celé moje vnútro jeho menu svätému.", "(Ž 102, 1)"},
            {"14", "Pripomíname si, Bože, tvoje milosrdenstvo<br>" +
                    "uprostred tvojho chrámu.<br>" +
                    "Ako tvoje meno, Bože, tak aj tvoja sláva<br>" +
                    "šíri sa až do končín zeme;<br>" +
                    "tvoja pravica je plná spravodlivosti.", "(Porov. Ž 47, 10-11)",
                    "Skúste a presvedčte sa, aký dobrý je Pán;<br>" +
                            "šťastný človek, čo sa utieka k nemu.", "(Porov. Ž 33, 9)"},
            {"15", "Ja však, ako je spravodlivé, uzriem tvoju tvár<br>" +
                    "a až raz vstanem zo sna, nasýtim sa pohľadom na teba.", "(Ž 16, 15)",
                    "Vrabec si nájde príbytok<br>" +
                            "a lastovička hniezdo, kde vkladá svoje mláďatá:<br>" +
                            "tvoje oltáre, Pane zástupov, môj Kráľ a môj Boh.", "(Ž 83, 4-5)"},
            {"16", "Mne Boh pomáha a môj život udržiava Pán.<br>" +
                    "S radosťou ti prinesiem obetu;<br>" +
                    "meno tvoje, Pane, budem velebiť, lebo si dobrý.", "(Ž 53, 6. 8)",
                    "Boh ustanovil, aby sa pamätalo na jeho obdivuhodné diela;<br>" +
                            "Pán je milosrdný a milostivý.<br>" +
                            "Pokrm dal tým, čo sa ho boja.", "(Ž 110, 4-5)"},
            {"17", "Boh býva vo svojom svätom príbytku;<br>" +
                    "on zhromažďuje svoj ľud vo svojom dome<br>" +
                    "a dáva mu odvahu a silu.", "(Porov. Ž 67, 6-7. 36)",
                    "Dobroreč, duša moja, Pánovi<br>" +
                            "a nezabúdaj na jeho dobrodenia.", "(Ž 102, 2)"},
            {"18", "Bože, príď ma zachrániť,<br>" +
                    "Pane, ponáhľaj sa mi pomôcť.<br>" +
                    "Ty si môj pomocník a osloboditeľ,<br>" +
                    "Pane, nemeškaj.", "(Ž 69, 2. 6)",
                    "Bože, dal si nám chlieb z neba,<br>" +
                            "chlieb, ktorý poskytuje pravý pôžitok<br>" +
                            "a spĺňa každú túžbu.", "(Porov. Múd 16, 20)"},
            {"19", "Pane, pamätaj na svoju zmluvu<br>" +
                    "a nezabúdaj nikdy na svojich úbožiakov.<br>" +
                    "Vstaň, Bože, a ujmi sa svojej veci,<br>" +
                    "nezabúdaj na volanie tých, čo ťa hľadajú.", "(Porov. Ž 73, 20. 19. 22. 23)",
                    "Chváľ, Jeruzalem, Pána, lebo ťa sýti najlepšou pšenicou.", "(Ž 147, 12. 14)"},
            {"20", "Bože, náš ochranca, pohliadni<br>" +
                    "a pozri na tvár svojho Pomazaného.<br>" +
                    "Jeden deň v tvojich nádvoriach je lepší než iných tisíce.", "(Ž 83, 10-11)",
                    "U Pána je milosrdenstvo a hojné vykúpenie.", "(Ž 129, 7)"},
            {"21", "Nakloň, Pane, svoj sluch a vyslyš ma;<br>" +
                    "zachráň, Bože, svojho sluhu, čo dúfa v teba.<br>" +
                    "Zmiluj sa, Pane, nado mnou,<br>" +
                    "veď k tebe volám celý deň.", "(Ž 85, 1-3)",
                    "Pane, ty nasycuješ celý svet hojnosťou svojich darov.<br>" +
                            "Z tvojej vôle zem dáva chlieb a víno, ktoré obveseľujú srdce človeka.", "(Porov. Ž 103, 13-15)"},
            {"22", "Zmiluj sa, Pane, nado mnou, veď k tebe volám celý deň.<br>" +
                    "Ty, Pane, si dobrý a láskavý<br>" +
                    "a veľmi milostivý voči všetkým, čo ťa vzývajú.", "(Ž 85, 3. 5)",
                    "Pane, tvoja dobrota je nesmierna<br>" +
                            "a vyhradil si ju bohabojným.", "(Ž 30, 20)"},
            {"23", "Pane, ty si spravodlivý a tvoje rozhodnutia sú správne;<br>" +
                    "nalož so svojím služobníkom podľa svojho milosrdenstva.", "(Ž 118, 137. 124)",
                    "Ako jeleň dychtí za vodou z prameňa,<br>" +
                            "tak moja duša, Bože, túži za tebou.<br>" +
                            "Po Bohu žízni moja duša, po Bohu živom.", "(Ž 41, 2-3)"},
            {"24", "Pane, daruj pokoj tým, čo dúfajú v teba,<br>" +
                    "aby sa ukázalo, že tvoji proroci sú vierohodní;<br>" +
                    "vyslyš prosby svojho služobníka a svojho ľudu.", "(Porov. Ekl 36, 18)",
                    "Bože, aké vzácne je tvoje milosrdenstvo.<br>" +
                            "Ľudia sa utiekajú do tône tvojich krídel.", "(Ž 35, 8)"},
            {"25", "Ja som spása ľudu - hovorí Pán.<br>" +
                    "V akomkoľvek súžení ma budú vzývať, vyslyším ich,<br>" +
                    "a budem ich Pánom naveky.", "",
                    "Pane, ty si dal príkazy, aby sa verne plnili.<br>" +
                            "Kiežby ma moje cesty viedli tak,<br>" +
                            "žeby som zachovával tvoje ustanovenia.", "(Ž 118, 4-5)"},
            {"26", "Všetko, čo si nám urobil, Pane, spravodlivo si urobil,<br>" +
                    "lebo sme zhrešili proti tebe<br>" +
                    "a nezachovávali sme tvoje prikázania.<br>" +
                    "Ale osláv svoje meno<br>" +
                    "a zaobchádzaj s nami podľa svojho nesmierneho milosrdenstva.", "(Dan 3, 31. 29. 30. 43. 42)",
                    "Pane, pamätaj na slovo, čo si dal svojmu služobníkovi;<br>" +
                            "lebo ním si mi dal nádej.<br>" +
                            "Ono ma utešuje v ponížení.", "(Ž 118, 49-50)"},
            {"27", "Pane, všetko je v tvojej moci<br>" +
                    "a nik nemôže odporovať tvojej vôli.<br>" +
                    "Ty si stvoril nebo i zem a všetko, čo je pod nebom;<br>" +
                    "ty si Pán celého vesmíru.", "(Est 13, 9. 10-11)",
                    "Dobrotivý je Pán voči tým, čo v neho dúfajú,<br>" +
                            "voči každému, kto ho hľadá.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. 1 Kor 10, 17)</font><br>" +
                            "Pretože je to jeden chlieb,<br>" +
                            "aj my - hoci je nás mnoho - sme jedno telo.<br>" +
                            "Lebo všetci máme účasť na jednom chlebe a na jednom kalichu.", "(Nár 3, 25)"},
            {"28", "Ak si budeš, Pane, v pamäti uchovávať neprávosť,<br>" +
                    "Pane, kto obstoji?<br>" +
                    "Ale ty si milostivý<br>" +
                    "a my ti chceme v bázni slúžiť.", "(Ž 129, 3-4)",
                    "Boháči sa nabiedia a nahladujú,<br>" +
                            "ale tým, čo hľadajú Pána, nijaké dobro chýbať nebude.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. 1 Jn 3, 2)</font><br>" +
                            "Keď sa Pán zjaví, budeme mu podobní,<br>" +
                            "lebo ho budeme vidieť takého, aký je.", "(Ž 33, 11)"},
            {"29", "K tebe, Bože, volám, lebo ty ma vyslyšíš.<br>" +
                    "Nakloň ku mne svoj sluch a vypočuj moje slová.<br>" +
                    "Chráň ma ako zrenicu oka,<br>" +
                    "skry ma v tôni svojich perutí.", "(Ž 16, 6. 8)",
                    "Oko Pánovo bdie nad tými, čo sa ho boja,<br>" +
                            "nad tými, čo v jeho milosrdenstvo dúfajú,<br>" +
                            "aby ich zachránil pred smrťou<br>" +
                            "a v čase hladu nakŕmil.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mk 10, 45)</font><br>" +
                            "Syn človeka prišiel, aby dal svoj život<br>" +
                            "ako výkupné za mnohých.", "(Ž 32, 18-19)"},
            {"30", "Nech sa radujú srdcia tých, čo Pána hľadajú.<br>" +
                    "Hľadajte Pána a jeho moc,<br>" +
                    "hľadajte vždy jeho tvár.", "(Ž 104, 3-4)",
                    "Radujme sa, že nás Boh spasil,<br>" +
                            "a zvelebujme jeho sväté meno!<br>" +
                            "<font color='#B71C1C'>Alebo: (Ef 5, 2)</font><br>" +
                            "Kristus nás miloval a seba samého vydal za nás<br>" +
                            "ako dar a obetu Bohu veľmi príjemnú.", "(Porov. Ž 19, 6)"},
            {"31", "Neopúšťaj ma, Pane, Bože môj, nevzďaľuj sa odo mňa.<br>" +
                    "Ponáhľaj sa mi na pomoc, Pane, spása moja.", "(Ž 37, 22-23)",
                    "Ukážeš mi cestu života,<br>" +
                            "u teba je plnosť radosti, Pane.<br>" +
                            "Alebo : (Jn 6, 58)<br>" +
                            "Pán Ježiš hovorí:<br>" +
                            "Ako mňa poslal živý Otec a ja žijem z Otca,<br>" +
                            "aj ten, čo mňa je, bude žiť zo mňa.", "(Porov. Ž 15, 11)"},
            {"32", "Kiež prenikne k tebe, Pane, moja modlitba,<br>" +
                    "nakloň svoj sluch k mojej prosbe.", "(Ž 87, 3)",
                    "Pán je môj pastier, nič mi nechýba,<br>" +
                            "pasie ma na zelených pašienkach.<br>" +
                            "Vodí ma k tichým vodám,<br>" +
                            "dušu mi osviežuje.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Lk 24, 35)</font><br>" +
                            "Učeníci spoznali Pána Ježiša pri lámaní chleba.", "(Ž 22, 1-2)"},
            {"33", "Pán hovorí:<br>" +
                    "Mojím úmyslom je priniesť vám pokoj, a nie trápenie;<br>" +
                    "budete ma vzývať a ja vás vyslyším<br>" +
                    "a vyslobodím vás zo všetkých miest vášho zajatia.", "(Jer 29, 11. 12. 14)",
                    "Pre mňa je slasťou byť v Božej blízkosti<br>" +
                            "a v Pánu Bohu svoju nádej mať.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mk 11, 23. 24)</font><br>" +
                            "Pán Ježiš povedal:<br>" +
                            "Veru, hovorím vám, verte, že všetko, o čo v modlitbe prosíte, dostanete,<br>" +
                            "a budete to mať.", "(Ž 72, 28)"},
            {"34", "Pán ohlási pokoj svojmu ľudu a svojim svätým<br>" +
                    "i tým, čo sa k nemu obracajú úprimne.", "(Ž 84,9)",
                    "Chváľte Pána, všetky národy,<br>" +
                            "lebo je veľké jeho milosrdenstvo voči nám.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 28, 20)</font><br>" +
                            "Pán Ježiš hovorí:<br>" +
                            "Ja som s vami po všetky dni<br>" +
                            "až do skončenia sveta.", "(Ž 116, 1-2)"},
    };

    String[][] postSpev = {
            {"03", "Pane, zmilúvaš sa nad všetkými<br>" +
                    "a nepohŕdaš ničím, čo si stvoril;<br>" +
                    "zatváraš oči nad hriechmi ľudí, aby sa kajali,<br>" +
                    "a si k nim láskavý, lebo si Boh a náš Pán.", "(Múd 11, 24-25; 27)",
                    "Kto o zákone Pánovom rozjíma dňom i nocou,<br>" +
                            "prináša ovocie v pravý čas.", "(Ž 1, 2-3)"},
            {"04", "Volal som k Pánovi, a on ma vyslyšal.<br>" +
                    "Ochránil ma od tých, čo na mňa útočia.<br>" +
                    "Zlož svoju starosť na Pána, a on ťa zachová.", "(Porov. Ž 54, 17-20. 30)",
                    "Bože, stvor vo mne srdce čisté<br>" +
                            "a v mojom vnútri obnov ducha pevného.", "(Ž 50, 12)"},
            {"05", "Čuj, Pane, a zmiluj sa nado mnou;<br>" +
                    "Pane, buď mi na pomoci.", "(Ž 29, 11)",
                    "Ukáž nám, Pane, svoje cesty<br>" +
                            "a pouč nás o svojich chodníkoch.", "(Porov. Ž 24, 4)"},
            {"06", "Vyslyš nás, Pane,<br>" +
                    "veď si dobrotivý a láskavý,<br>" +
                    "pre svoje veľké milosrdenstvo pohliadni na nás.", "(Porov. Ž 68, 17)",
                    "Pán Ježiš hovorí: Milosrdenstvo chcem, a nie obetu;<br>" +
                            "neprišiel som volať spravodlivých, ale hriešnikov.", "(Mt 9, 13)"},
            {"10", "Keď ku mne zavolá, ja ho vyslyším,<br>" +
                    "zachránim ho, oslávim a obdarím dlhým životom.", "(Porov. Ž 90, 15-16)",
                    "Nielen z chleba žije človek,<br>" +
                            "ale z každého slova, ktoré vychádza z Božích úst.<br>" +
                            "<font color='#B71C1C'>Alebo: (Ž 90, 4)</font><br>" +
                            "Pán ťa zacloní svojimi krídlami<br>" +
                            "a uchýliš sa pod jeho perute.", "(Mt 4, 4)"},
            {"11", "Ako oči sluhov hľadia na ruky svojich pánov,<br>" +
                    "tak hľadia naše oči na Pána, nášho Boha,<br>" +
                    "kým sa nezmiluje nad nami.<br>" +
                    "Zmiluj sa, Pane, nad nami, zmiluj sa nad nami.", "(Ž 122, 2-3)",
                    "Veru, hovorím vám,<br>" +
                            "čo ste urobili jednému z týchto mojich najmenších bratov,<br>" +
                            "mne ste urobili.<br>" +
                            "Poďte, požehnaní môjho Otca, zaujmite kráľovstvo,<br>" +
                            "ktoré je pre vás pripravené od stvorenia sveta.", "(Mt 25, 40. 34)"},
            {"12", "Pane, stal si sa nám útočišťom z pokolenia na pokolenie;<br>" +
                    "ty, Bože, si od vekov až na veky.", "(Ž 89, 1-2)",
                    "Bože, spravodlivosť moja, ty si ma vyslyšal,<br>" +
                            "keď som volal o pomoc;<br>" +
                            "v súžení si mi uľavil.<br>" +
                            "Zmiluj sa nado mnou a vyslyš moju modlitbu.", "(Porov. Ž 4, 2)"},
            {"13", "Rozpomeň sa, Pane, na svoje milosrdenstvo,<br>" +
                    "ktoré trvá od vekov.<br>" +
                    "Nech naši nepriatelia nezvíťazia nad nami.<br>" +
                    "Bože, vysloboď svoj ľud zo všetkých súžení.", "(Ž 24, 6.2.22)",
                    "Pane, nech sa tešia všetci, čo majú v teba dôveru,<br>" +
                            "a naveky nech jasajú, lebo ty si s nimi.", "(Ž 5, 12)"},
            {"14", "Pane, počuj moje slová,<br>" +
                    "povšimni si moje vzlykanie,<br>" +
                    "vypočuj moju hlasitú prosbu, môj Král a môj Boh.", "(Ž 5, 2-3)",
                    "Každý, kto prosí, dostane, kto hľadá, nájde<br>" +
                            "a kto klope, tomu otvoria.", "(Mt 7, 8)"},
            {"15", "Vytrhni ma, Pane, z mojich tiesní.<br>" +
                    "Pozri na moju pokoru a na moje trápenie a odpusť mi všetky priestupky.", "(Ž 24, 17-18)",
                    "Pán hovorí:<br>" +
                            "Ako je pravda, že žijem, nechcem smrť hriešnika,<br>" +
                            "ale aby sa obrátil a žil.", "(Ez 33, 11)"},
            {"16", "Zákon Pánov je dokonalý, osviežuje dušu;<br>" +
                    "svedectvo Pánovo je hodnoverné, dáva múdrosť maličkým.", "(Ž 18, 8)",
                    "Pán Ježiš hovorí:<br>" +
                            "Buďte dokonalí, ako je dokonalý váš nebeský Otec.", "(Mt 5, 48)"},
            {"20", "V srdci mi znejú tvoje slová:<br>" +
                    "\"Hľadajte moju tvár. \"<br>" +
                    "Pane, ja hľadám tvoju tvár,<br>" +
                    "neodvracaj svoju tvár odo mňa.<br>" +
                    "<font color='#B71C1C'>Alebo: (Ž 24, 6. 3. 22)</font><br>" +
                    "Rozpomeň sa, Pane, na svoje zľutovanie;<br>" +
                    "a na svoje milosrdenstvo, ktoré trvá od vekov.<br>" +
                    "Nech naši nepriatelia nezvíťazia nad nami.<br>" +
                    "Bože, vysloboď svoj ľud zo všetkých jeho súžení.", "(Ž 26, 8-9)",
                    "Toto je môj milovaný Syn,<br>" +
                            "v ktorom mám zaľúbenie, počúvajte ho.", "(Mt 17, 5)"},
            {"21", "Zachráň ma, Pane, a buď mi milostivý.<br>" +
                    "Moja noha stojí na rovnej ceste;<br>" +
                    "v zhromaždeniach chcem velebiť Pána.", "(Ž 25, 11-12)",
                    "Pán Ježiš hovorí:<br>" +
                            "Buďte milosrdní, ako je milosrdný váš Otec.", "(Lk 6, 36)"},
            {"22", "Pane, daj svetlo mojim očiam, aby som v smrti nezaspal,<br>" +
                    "aby nemohol povedať môj nepriateľ: Premohol som ho.", "(Ž 12, 4-5)",
                    "Vyrozprávam všetky tvoje diela zázračné,<br>" +
                            "v tebe sa budem radovať a tešiť,<br>" +
                            "ospevovať budem tvoje meno, Najvyšší.", "(Ž 9, 2-3)"},
            {"23", "Neopúšťaj ma, Pane;<br>" +
                    "Bože môj, nevzďaľuj sa odo mňa.<br>" +
                    "Ponáhľaj sa mi na pomoc, Pane, spása moja.", "(Ž 37, 22-23)",
                    "Syn človeka neprišiel dať sa obsluhovať,<br>" +
                            "ale slúžiť<br>" +
                            "a položiť svoj život ako výkupné za mnohých.", "(Mt 20, 28)"},
            {"24", "Skúmaj ma, Bože, a poznaj moje srdce;<br>" +
                    "pozri, či nejdem bludnou cestou<br>" +
                    "a veď ma po ceste k večnosti.", "(Ž 138, 23-24)",
                    "Blažení tí, čo idú cestou života bez poškvrny,<br>" +
                            "čo kráčajú podľa zákona Pánovho.", "(Ž 188, 1)"},
            {"25", "Pane, v teba dúfam,<br>" +
                    "nech nie som zahanbený naveky,<br>" +
                    "vyvedieš ma z osídla, čo mi nastrojili,<br>" +
                    "lebo ty si moja sila.", "(Ž 30, 2. 5)",
                    "Boh nás miloval<br>" +
                            "a poslal svojho Syna<br>" +
                            "ako zmiernu obetu za naše hriechy.", "(1 Jn 4, 40)"},
            {"26", "Milostivý a milosrdný je Pán,<br>" +
                    "zhovievavý a veľmi láskavý.<br>" +
                    "Dobrý je Pán ku každému<br>" +
                    "a milostivý ku všetkým svojim stvoreniam.", "(Ž 144, 8-9)",
                    "Syn môj, treba sa radovať,<br>" +
                            "lebo tvoj brat bol mŕtvy, a ožil,<br>" +
                            "bol stratený, a našiel sa.", "(Lk 15, 32)"},
            {"30", "Stále upieram oči k Bohu o pomoc<br>" +
                    "a on ma vyslobodí z osídla.<br>" +
                    "Bože, zhliadni na mňa a zľutuj sa nado mnou,<br>" +
                    "lebo som opustený a biedny.<br>" +
                    "<font color='#B71C1C'>Alebo: (Ez 36, 23-26)</font><br>" +
                    "Pán hovorí: Na vás ukážem, že som svätý;<br>" +
                    "zhromaždím vás zo všetkých krajín,<br>" +
                    "vylejem na vás vodu čistú,<br>" +
                    "a budete očistení od všetkej špiny;<br>" +
                    "a vložím do vás nového ducha.", "(Ž 24, 15-16)",
                    "<font color='#B71C1C'>- Ak sa číta evanjelium o Samaritánke: (Jn 4, 13-14)</font><br>" +
                            "Pán Ježiš povedal:<br>" +
                            "Kto bude piť z vody, ktorú mu ja dám,<br>" +
                            "stane sa v ňom prameňom vody prúdiacej do večného života.<br>" +
                            "<font color='#B71C1C'>- Ak sa číta iné evanjelium: (Ž 83, 4-5)</font><br>" +
                            "Vrabec si nájde príbytok<br>" +
                            "a lastovička hniezdo, kde vkladá svoje mláďatá:<br>" +
                            "tvoje oltáre, Pane zástupov,<br>" +
                            "môj Kráľ a môj Boh.<br>" +
                            "Blažení tí, čo bývajú v tvojom dome a bez prestania ťa velebia.", ""},
            {"31", "Túži a zmiera moja duša po nádvoriach Pánových.<br>" +
                    "Moje srdce i moje telo<br>" +
                    "vznášajú sa k Bohu živému.", "(Ž 83, 3)",
                    "Chváľte Pána, všetky národy,<br>" +
                            "lebo je veľké jeho milosrdenstvo voči nám.", "(Ž 116, 1-2)"},
            {"32", "K tebe, Bože, volám, lebo ty ma vyslyšíš;<br>" +
                    "nakloň ku mne svoj sluch a vypočuj moje slová.<br>" +
                    "Chráň ma ako zrenicu oka, skry ma v tôni svojich perutí.", "(Ž 16, 6-8)",
                    "Pane, kto smie bývať v tvojom svätom stánku?<br>" +
                            "Kto môže nájsť odpočinok na tvojom svätom vrchu?<br>" +
                            "Ten, čo kráča bez poškvrny a koná spravodlivo.", "(Ž 14, 1-2)"},
            {"33", "Riaď moje kroky podľa svojho výroku;<br>" +
                    "nech ma neovláda nijaká neprávosť.", "(Ž 118, 133)",
                    "Ukážeš mi, Pane, cestu života;<br>" +
                            "u teba je plnosť radosti.", "(Ž 15, 11)"},
            {"34", "Pán hovorí: Ja som spása ľudu;<br>" +
                    "v akomkoľvek súžení ma budú vzývať,<br>" +
                    "vyslyším ich a budem ich Pánom naveky.", "",
                    "Ty si dal príkazy, aby sa verne plnili;<br>" +
                            "kiežby ma moje cesty viedli tak,<br>" +
                            "žeby som zachovával tvoje ustanovenia.", "(Ž 118, 4-5)"},
            {"35", "Okrem teba nieto Boha, Pane,<br>" +
                    "lebo si veľký a robíš zázraky;<br>" +
                    "iba ty si Boh.", "(Ž 85, 8. 10)",
                    "Milovať Boha celým srdcom<br>" +
                            "a blížneho ako seba samého<br>" +
                            "je viac ako všetky obety.", "(Porov. Mk 12, 33)"},
            {"36", "Dobroreč, duša moja, Pánovi<br>" +
                    "a nezabúdaj na jeho dobrodenia;<br>" +
                    "veď on ti odpúšťa všetky neprávosti.", "(Ž 102, 2-3)",
                    "Mýtnik stál celkom vzadu, bil sa do pŕs a hovoril:<br>" +
                            "Bože, buď milostivý mne hriešnemu.", "(Lk 18, 13)"},
            {"40", "Raduj sa, Jeruzalem,<br>" +
                    "zhromaždite sa všetci, čo ste si ho obľúbili;<br>" +
                    "jasajte, čo ste boli zarmútení,<br>" +
                    "plesajte a čerpajte z bohatých zdrojov útechy.", "(Porov. Iz 66, 10-11)",
                    "<font color='#B71C1C'>- Ak sa číta evanjelium o slepom od narodenia: (Porov. Jn 9, 11)</font><br>" +
                            "Ježiš mi potrel oči,<br>" +
                            "išiel som, umyl som sa, otvorili sa mi oči,<br>" +
                            "a uveril som v Boha.<br>" +
                            "<font color='#B71C1C'>- Ak sa číta evanjelium o márnotratnom synovi: (Lk 15, 32)</font><br>" +
                            "Syn môj, treba sa radovať,<br>" +
                            "lebo tvoj brat bol mŕtvy, a ožil,<br>" +
                            "bol stratený, a našiel sa.<br>" +
                            "<font color='#B71C1C'>- Ak sa číta iné evanjelium: (Ž 121, 3-4)</font><br>" +
                            "Jeruzalem je vystavaný ako mesto<br>" +
                            "spojené v jeden celok.<br>" +
                            "Tam prichádzajú kmene, kmene Pánove,<br>" +
                            "aby velebili meno Pánovo.", ""},
            {"41", "Ja dúfam v Pána;<br>" +
                    "plesám a teším sa, že si milosrdný,<br>" +
                    "lebo si zhliadol na moju poníženosť.", "(Ž 30, 7-8)",
                    "Pán hovorí:<br>" +
                            "Vložím do vás svojho ducha a spôsobím,<br>" +
                            "že budete kráčať podľa mojich príkazov,<br>" +
                            "že budete zachovávať a plniť moje výroky.", "(Ez 36, 37)"},
            {"42", "Poďte k vodám všetci, čo ste smädní - hovorí Pán;<br>" +
                    "nech príde aj ten, čo nemá peniaze.<br>" +
                    "Poďte a pite s radosťou.", "(Porov. Iz 55, 1)",
                    "Pán je môj pastier, nič mi nechýba:<br>" +
                            "pasie ma na zelených pašienkach.<br>" +
                            "Vodí ma k tichým vodám, dušu mi osviežuje.", "(Ž 22, 1-2)"},
            {"43", "Pane, modlím sa k tebe;<br>" +
                    "v čase milosti sa obraciam na teba, Bože.<br>" +
                    "Vypočuj ma, ty najmilostivejší a verný v pomoci.", "(Porov. Ž 68, 14)",
                    "Boh neposlal Syna na svet, aby svet odsúdil,<br>" +
                            "ale aby sa skrze neho svet zachránil.", "(Jn 3, 17)"},
            {"44", "Nech sa radujú srdcia tých, čo hľadajú Pána.<br>" +
                    "Hľadajte Pána a jeho moc, hľadajte vždy jeho tvár.", "(Ž 104, 3-4)",
                    "Pán hovorí: Svoj zákon vložím do ich vnútra<br>" +
                            "a vpíšem ho do ich srdca.<br>" +
                            "Budem im Bohom<br>" +
                            "a oni budú mojím ľudom.", "(Jer 31, 33)"},
            {"45", "Pane, zachráň ma pre svoje meno<br>" +
                    "a svojou mocou obráň moje právo.<br>" +
                    "Bože, vyslyš moju modlitbu a vypočuj slová mojich úst.", "(Ž 53, 3-4)",
                    "V Kristovi máme vykúpenie, skrze jeho krv,<br>" +
                            "odpustenie hriechov podľa bohatstva jeho milosti.", "(Ef 1, 7)"},
            {"46", "Obkľúčilo ma smrtiace vlnobitie,<br>" +
                    "ovinuli ma povrazy záhrobia.<br>" +
                    "V úzkosti som vzýval Pána,<br>" +
                    "zo svojho chrámu počul môj hlas.", "(Ž 17, 5-7)",
                    "Vykúpení sme drahou krvou Krista,<br>" +
                            "nevinného a nepoškvrneného Baránka.", "(1 Pt 1, 19)"},
            {"50", "Bože, vymôž mi právo,<br>" +
                    "a ujmi sa môjho sporu s bezbožným ľudom;<br>" +
                    "zachráň ma pred zločincom a úskočným človekom.<br>" +
                    "Veď ty, Bože, si moje útočište.", "(Ž 42, 1-2)",
                    "<font color='#B71C1C'>- Ak sa číta evanjelium o Lazárovi: (Jn 11, 26)</font><br>" +
                            "Pán Ježiš povedal:<br>" +
                            "Kto verí vo mňa, bude žiť, aj keď umrie.<br>" +
                            "A nik, kto žije a verí vo mňa, nezomrie naveky.<br>" +
                            "<font color='#B71C1C'>- Ak sa číta evanjelium o cudzoložnej žene: (Jn 8, 10-11)</font><br>" +
                            "Žena, nik ťa neodsúdil?<br>" +
                            "Nikto, Pane.<br>" +
                            "Ani ja ťa neodsudzujem. Choď a odteraz už nehreš!<br>" +
                            "<font color='#B71C1C'>- Ak sa číta iné evanjelium: (Jn 12, 24-25)</font><br>" +
                            "Veru, veru, hovorím vám,<br>" +
                            "ak pšeničné zrno nepadne do zeme a neodumrie,<br>" +
                            "ostane samo;<br>" +
                            "ale ak odumrie, prinesie veľkú úrodu.", ""},
            {"51", "Zmiluj sa nado mnou, Bože,<br>" +
                    "lebo ľudia ma prenasledujú,<br>" +
                    "deň čo deň ma napádajú a utláčajú.", "(Ž 55, 2)",
                    "<font color='#B71C1C'>- Ak sa číta evanjelium o cudzoložnej žene: (Jn 8, 10-11)</font><br>" +
                            "Žena, nik ťa neodsúdil?<br>" +
                            "Nikto, Pane.<br>" +
                            "Ani ja ťa neodsudzujem. Choď a odteraz už nehreš.<br>" +
                            "<font color='#B71C1C'>- Ak sa číta iné evanjelium: (Jn 8, 12)</font><br>" +
                            "Pán Ježiš hovorí: Ja som svetlo sveta;<br>" +
                            "kto mňa nasleduje, nebude chodiť vo tme,<br>" +
                            "ale bude mať svetlo života.", ""},
            {"52", "Očakávaj Pána a buď statočný;<br>" +
                    "srdce maj silné a drž sa Pána.", "(Ž 26, 14)",
                    "Pán Ježiš hovorí: Až budem vyzdvihnutý od zeme,<br>" +
                            "všetkých pritiahnem k sebe.", "(Jn 12, 32)"},
            {"53", "Pane, ty si ma oslobodil od zlostných nepriateľov,<br>" +
                    "povýšil si ma nad mojich odporcov<br>" +
                    "a vytrhol si ma z rúk násilníka.", "(Ž 17, 48-49)",
                    "Boh nás preniesol do kráľovstva svojho milovaného Syna,<br>" +
                            "v ktorom máme vykúpenie a odpustenie hriechov.", "(Kol 1, 13-14)"},
            {"54", "Kristus je prostredníkom novej zmluvy;<br>" +
                    "skrze jeho smrť všetci, čo sú povolaní,<br>" +
                    "dostali prisľúbené dedičstvo.", "(Porov. Hebr 9, 15)",
                    "Boh vlastného Syna neušetril,<br>" +
                            "ale vydal ho za nás všetkých;<br>" +
                            "a s ním nám daroval aj všetko ostatné.", "(Porov. Rim 8, 32)"},
            {"55", "Zmiluj sa, Bože, nado mnou, lebo som v súžení,<br>" +
                    "vytrhni ma z rúk mojich nepriateľov a prenasledovateľov.<br>" +
                    "Pane, nech nie som zahanbený, veď teba vzývam.", "(Ž 30, 10. 16. 18)",
                    "Ježiš vzal naše hriechy vo svojom tele na kríž,<br>" +
                            "aby sme odumreli hriechu a žili spravodlivo;<br>" +
                            "jeho krvavé rany nás uzdravili.", "(Porov. 1 Pt 2, 24)"},
            {"56", "Pane, nevzďaľuj sa odo mňa;<br>" +
                    "ty, moja sila, ponáhľaj sa mi na pomoc.<br>" +
                    "Ja som červ, a nie človek,<br>" +
                    "ľuďom som na posmech a davu na opovrhnutie.", "(Ž 21, 20. 7)",
                    "Kristus zomrel,<br>" +
                            "aby zhromaždil roztratené Božie deti.", "(Porov. Jn 11, 52)"},
            {"60", "Šesť dní pred Veľkou nocou,<br>" +
                    "keď Ježiš prichádzal do Jeruzalema,<br>" +
                    "išli mu v ústrety deti<br>" +
                    "s palmovými ratolesťami v rukách<br>" +
                    "a nadšene volali: Hosanna na výsostiach!<br>" +
                    "Požehnaný, ktorý prináša milosrdenstvo a spásu.<br>" +
                    "<font color='#B71C1C'>Alebo: Ž 23, 9-10</font><br>" +
                    "Zdvihnite, brány, svoje hlavice<br>" +
                    "a vyvýšte sa, brány prastaré,<br>" +
                    "lebo má vstúpiť kráľ slávy.<br>" +
                    "Kto je ten kráľ slávy?<br>" +
                    "Pán zástupov, to je ten kráľ slávy.<br>" +
                    "Hosanna na výsostiach!<br>" +
                    "Sláva ti, ktorý prinášaš milosrdenstvo a spásu.", "",
                    "Pán Ježiš sa modlil:<br>" +
                            "Otče môj, ak ma nemôže minúť tento kalich<br>" +
                            "bez toho, že by som z neho pil,<br>" +
                            "nech sa stane tvoja vôľa.", "(Mt 26, 42)"},
            {"61", "Pane, odsúď tých, čo ma odsudzujú,<br>" +
                    "napadni tých, čo mňa napádajú.<br>" +
                    "Vezmi zbroj a štít a vstaň mi na pomoc,<br>" +
                    "Pane, moja sila a záštita.", "(Ž 34, 1-2; Ž 139, 8)",
                    "Bože, neskrývaj svoju tvár predo mnou.<br>" +
                            "V deň môjho súženia skloň sa ku mne<br>" +
                            "a ochotne ma vyslyš, keď ťa budem vzývať.", "(Porov. Ž 101, 3)"},
            {"62", "Pane, nevydávaj ma zvoli utláčateľov,<br>" +
                    "veď povstali proti mne kriví svedkovia,<br>" +
                    "dychtiví po násilí.", "(Ž 26, 12)",
                    "Boh vlastného Syna neušetril,<br>" +
                            "ale vydal ho za nás všetkých.", "(Rim 8, 32)"},
            {"63", "Nech sa na meno Ježiš skloní každé koleno<br>" +
                    "v nebi, na zemi i v podsvetí,<br>" +
                    "lebo Pán sa stal poslušným až na smrť, až na smrť na kríži.<br>" +
                    "Preto Pán Ježiš Kristus je v sláve Boha Otca.", "(Porov. Flp 2, 10. 9. 11)",
                    "Syn človeka neprišiel dať sa obsluhovať,<br>" +
                            "ale slúžiť a položiť svoj život ako výkupné za mnohých.", "(Mt 20, 28)"},
    };

    String[][] velkanocSpev = {
            {"10", "Pán naozaj vstal z mŕtvych, aleluja.<br>" +
                    "Jemu patrí sláva a moc na večné veky!<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Ž 138, 18. 5-6)</font><br>" +
                    "Vstal som z mŕtvych a znova som s tebou,<br>" +
                    "viedol si ma svojou rukou.<br>" +
                    "Aká obdivuhodná je pre mňa tvoja múdrosť! Aleluja.", "(Porov Lk 24, 34; Zjv 1, 6)",
                    "Náš veľkonočný baránok Kristus bol obetovaný;<br>" +
                            "preto slávme túto veľkonočnú hostinu s úprimnou radosťou.", "(Porov. 1 Kor 5, 7-8)"},
            {"11", "Pán vás priviedol do krajiny, ktorá oplýva mliekom a medom,<br>" +
                    "preto majte stále v srdci jeho zákon. Aleluja.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Pán vstal z mŕtvych, ako predpovedal;<br>" +
                    "radujme sa všetci a plesajme, lebo on večne vládne. Aleluja.", "(Ex 13, 5. 9)",
                    "Kristus vzkriesený z mŕtvych už viac neumiera;<br>" +
                            "smrť nad ním už nepanuje. Aleluja.", "(Rim 6, 9)"},
            {"12", "Pán vás napájal z prameňa múdrosti;<br>" +
                    "jeho milosť vás posilní a nezakolíšete sa;<br>" +
                    "a povýši vás naveky. Aleluja.", "(Porov. Ekl 15, 3-4)",
                    "S Kristom ste vstali z mŕtvych, preto hľadajte, čo je hore,<br>" +
                            "kde Kristus sedí po pravici Boha;<br>" +
                            "myslite na to, čo je hore. Aleluja.", "(Kol 3, 1-2)"},
            {"13", "Poďte, požehnaní môjho Otca,<br>" +
                    "zaujmite kráľovstvo,<br>" +
                    "ktoré je pre vás pripravené od stvorenia sveta. Aleluja.", "(Mt 25, 34)",
                    "Učeníci spoznali Pána Ježiša pri lámaní chleba. Aleluja.", "(Porov. Lk 24, 35)"},
            {"14", "Pane, všetci si pochvaľujú tvoju mocnú ruku,<br>" +
                    "lebo múdrosť otvorila ústa nemým<br>" +
                    "a rozviazala jazyk maličkých. Aleluja.", "(Múd 10, 20-21)",
                    "Vykúpený ľud, ohlasuj slávne skutky Pána,<br>" +
                            "ktorý ťa z temnôt povolal<br>" +
                            "do svojho obdivuhodného svetla. Aleluja.", "(Porov. 1 Pt 2, 9)"},
            {"15", "Pán vyviedol svoj ľud bezpečne<br>" +
                    "a posilnil ho v nádeji,<br>" +
                    "jeho nepriateľov však pokrylo more. Aleluja.", "(Ž 77, 53)",
                    "Pán Ježiš povedal svojim učeníkom: Poďte a jedzte!<br>" +
                            "Vzal chlieb a dával im. Aleluja.", "(Porov. Jn 21, 12-13)"},
            {"16", "Pán vyviedol svoj ľud a naplnil ho radosťou<br>" +
                    "a svojich vyvolených plesaním. Aleluja.", "(Ž 104, 43)",
                    "Všetci, ktorí ste pokrstení v Kristovi,<br>" +
                            "Krista ste si obliekli. Aleluja.", "(Gal 3, 27)"},
            {"20", "Ako novonarodeniatka túžia po mlieku,<br>" +
                    "tak aj vy si žiadajte zdravý pokrm Božieho slova,<br>" +
                    "aby ste rástli a dosiahli spasenie. Aleluja.<br>" +
                    "<font color='#B71C1C'>Alebo: (4 Ezdr 2, 36-37)</font><br>" +
                    "Radujte sa a ďakujte Bohu, že vás povolal k sebe;<br>" +
                    "veď ste Božie deti a dedičia jeho slávy. Aleluja.", "(Porov. 1 Pt 2, 2)",
                    "Pán Ježiš povedal Tomášovi:<br>" +
                            "Dotkni sa rán po klincoch<br>" +
                            "a nebuď neveriaci, ale veriaci. Aleluja.", "(Porov. Jn 20, 27)"},
            {"21", "Kristus vzkriesený z mŕtvych už viac neumiera,<br>" +
                    "smrť nad ním už nepanuje. Aleluja.", "(Rim 6, 9)",
                    "Ježiš si stal do stredu a povedal učeníkom:<br>" +
                            "Pokoj vám. Aleluja.", "(Jn 20, 19)"},
            {"22", "Radujme sa, veseľme sa a oslavujme Boha,<br>" +
                    "lebo náš Pán, Boh všemohúci,<br>" +
                    "sa ujal kráľovstva. Aleluja.", "(Zjv 19, 7. 6)",
                    "Kristus musel trpieť a na tretí deň vstať z mŕtvych,<br>" +
                            "a tak vojsť do svojej slávy. Aleluja.", "(Porov. Lk 24, 46. 26)"},
            {"23", "Pane, budem ťa velebiť medzi národmi;<br>" +
                    "tvoje meno chcem zvestovať svojim bratom. Aleluja.", "(Ž 17, 50; 21, 23)",
                    "Pán Ježiš hovorí: Ja som si vás vyvolil zo sveta<br>" +
                            "a ustanovil som vás, aby ste išli a prinášali ovocie<br>" +
                            "a aby vaše ovocie zostalo. Aleluja.", "(Porov. Jn 15, 16. 19)"},
            {"24", "Bože, keď si kráčal na čele svojho ľudu,<br>" +
                    "kliesnil si mu cestu a býval si s ním;<br>" +
                    "zem sa chvela a nebesia rosili. Aleluja.", "(Porov. Ž 67, 8-9. 20)",
                    "Hla, ja som s vami po všetky dni<br>" +
                            "až do skončenia sveta. Aleluja.", "(Mt 28, 30)"},
            {"25", "Vykúpil si nás svojou krvou, Pane,<br>" +
                    "z každého kmeňa, jazyka, ľudu a národa<br>" +
                    "a urobil si nás nášmu Bohu kráľovským kňazstvom. Aleluja.", "(Zjv 5, 9-10)",
                    "Kristus, náš Pán, bol vydaný na smrť pre naše hriechy<br>" +
                            "a vstal z mŕtvych pre naše ospravedlnenie. Aleluja.", "(Porov. Rim 4, 25)"},
            {"26", "Vykúpený ľud, ohlasuj slávne skutky Pána,<br>" +
                    "ktorý ťa z tmy povolal do svojho obdivuhodného svetla. Aleluja.", "(Porov. 1 Pt 2, 9)",
                    "Otče, chcem, aby aj tí, ktorých si mi dal,<br>" +
                            "boli so mnou tam, kde som ja, <br>" +
                            "aby uzreli moju slávu, ktorú si mi dal. Aleluja.", "(Jn 17, 24)"},
            {"30", "Jasaj v Bohu, celá zem,<br>" +
                    "hrajte a spievajte na slávu jeho mena,<br>" +
                    "vzdávajte mu chválu. Aleluja.", "(Ž 65, 1-2)",
                    "<font color='#B71C1C'>-Rok A (Porov. Lk 24, 35)</font><br>" +
                            "Učeníci poznali Pána Ježiša pri lámaní chleba. Aleluja.<br>" +
                            "<font color='#B71C1C'>-Rok B (Porov. Lk 24, 46-47)</font><br>" +
                            "Kristovi bolo treba trpieť a na tretí deň vstať z mŕtvych;<br>" +
                            "v jeho mene sa bude všetkým národom<br>" +
                            "ohlasovať pokánie na odpustenie hriechov. Aleluja.<br>" +
                            "<font color='#B71C1C'>-Rok C (Porov. Jn 21, 12-13)</font><br>" +
                            "Pán Ježiš povedal svojim učeníkom:<br>" +
                            "Poďte a jedzte.<br>" +
                            "Potom vzal chlieb a dával im. Aleluja.", ""},
            {"31", "Vstal z mŕtvych dobrý Pastier.<br>" +
                    "On dal život za svoje ovce,<br>" +
                    "ochotne umrel za svoje stádo. Aleluja.", "",
                    "Pokoj vám zanechávam, svoj pokoj vám dávam;<br>" +
                            "nie taký pokoj vám dávam, aký dáva svet, hovorí Pán. Aleluja.", "(Jn 14, 27)"},
            {"32", "Vzdajte chválu nášmu Bohu všetci,<br>" +
                    "čo sa ho bojíte, malí i veľkí,<br>" +
                    "lebo prišla spása, moc a vláda jeho Pomazaného. Aleluja.", "(Zjv 19, 5; 12. 10)",
                    "Veríme, že keď sme zomreli s Kristom,<br>" +
                            "spolu s nim budeme aj žiť. Aleluja.", "(Rim 6, 8)"},
            {"33", "Nech sú moje ústa plné tvojej chvály<br>" +
                    "a nech ťa velebím deň čo deň;<br>" +
                    "jasať budú moje pery, keď ti zaspievam. Aleluja.", "(Ž 70, 8. 23)",
                    "Pán vstal z mŕtvych a stal sa naším svetlom,<br>" +
                            "vykúpil nás svojou krvou. Aleluja.", ""},
            {"34", "Spievajme Pánovi,<br>" +
                    "lebo sa preslávil.<br>" +
                    "Pán je moja sila a moja udatnosť,<br>" +
                    "on ma zachránil. Aleluja.", "(Ex 15, 1-2)",
                    "Kristus zomrel za všetkých,<br>" +
                            "aby tí, čo žijú, už nežili pre seba,<br>" +
                            "ale pre toho, ktorý za nich zomrel<br>" +
                            "a vstal z mŕtvych. Aleluja.", "(2 Kor 5, 15)"},
            {"35", "Hoden je Baránok, ktorý bol zabitý,<br>" +
                    "prijať moc a bohatstvo,<br>" +
                    "múdrosť a silu,<br>" +
                    "česť, slávu a chválu. Aleluja.", "(Zjv 5, 12)",
                    "Pán Ježiš bol pre nás ukrižovaný,<br>" +
                            "vstal z mŕtvych,<br>" +
                            "a tak nás vykúpil. Aleluja.", ""},
            {"36", "S Kristom ste boli v krste pochovaní<br>" +
                    "a s ním aj vzkriesení,<br>" +
                    "pretože ste uverili v moc Boha,<br>" +
                    "ktorý ho vzkriesil z mŕtvych. Aleluja.", "(Kol 2, 12)",
                    "Pán Ježiš sa modlil:<br>" +
                            "Otče, prosím ťa za tých, ktorí uveria vo mňa,<br>" +
                            "aby aj oni v nás boli jedno,<br>" +
                            "aby svet poznal, že si ma ty poslal. Aleluja.", "(Porov. Jn 17, 20-21)"},
            {"40", "Milosti Pánovej plná je zem;<br>" +
                    "Pánovým slovom povstali nebesia. Aleluja.", "(Ž 32, 5-6)",
                    "Dobrý Pastier,<br>" +
                            "ktorý dal život za svoje ovečky<br>" +
                            "a neváhal za ne podstúpiť smrť na kríži,<br>" +
                            "vstal z mŕtvych. Aleluja.", ""},
            {"41", "Kristus vzkriesený z mŕtvych už viac neumiera,<br>" +
                    "smrť nad ním už nepanuje. Aleluja.", "(Rim 6, 9)",
                    "Ježiš si stal do stredu a povedal učeníkom:<br>" +
                            "Pokoj vám. Aleluja.", "(Jn 20, 19)"},
            {"42", "Radujme sa, veseľme sa a oslavujme Boha,<br>" +
                    "lebo náš Pán, Boh všemohúci,<br>" +
                    "ujal sa kráľovstva. Aleluja.", "(Zjv 19, 7. 6)",
                    "Kristus musel trpieť a na tretí deň vstať z mŕtvych,<br>" +
                            "a tak vojsť do svojej slávy. Aleluja.", "(Porov. Lk 24, 46. 26)"},
            {"43", "Pane, budem ťa velebiť medzi národmi;<br>" +
                    "tvoje meno chcem zvestovať svojim bratom. Aleluja.", "(Ž 17, 50; 21, 23)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ja som si vás vyvolil zo sveta<br>" +
                            "a ustanovil som vás,<br>" +
                            "aby ste išli a prinášali ovocie<br>" +
                            "a aby vaše ovocie zostalo. Aleluja.", "(Porov. Jn 15, 16. 19)"},
            {"44", "Bože, keď si kráčal na čele svojho ľudu,<br>" +
                    "kliesnil si mu cestu a býval si s ním;<br>" +
                    "zem sa chvela a nebesia rosili. Aleluja.", "(Porov. Ž 67, 8-9. 20)",
                    "Hla, ja som s vami po všetky dni<br>" +
                            "až do skončenia sveta. Aleluja.", "(Mt 28, 30)"},
            {"45", "Vykúpil si nás svojou krvou, Pane,<br>" +
                    "z každého kmeňa, jazyka, ľudu a národa<br>" +
                    "a urobil si nás nášmu Bohu<br>" +
                    "kráľovským kňazstvom. Aleluja.", "(Zjv 5, 9-10)",
                    "Kristus, náš Pán,<br>" +
                            "bol vydaný na smrť pre naše hriechy<br>" +
                            "a vstal z mŕtvych pre naše ospravedlnenie. Aleluja.", "(Porov. Rim 4, 25)"},
            {"46", "Vykúpený ľud, ohlasuj slávne skutky Pána,<br>" +
                    "ktorý ťa z tmy povolal<br>" +
                    "do svojho obdivuhodného svetla. Aleluja.", "(Porov. 1 Pt 2, 9)",
                    "Otče, chcem, aby aj tí, ktorých si mi dal,<br>" +
                            "boli so mnou tam, kde som ja,<br>" +
                            "aby uzreli moju slávu, ktorú si mi dal. Aleluja.", "(Jn 17, 24)"},
            {"50", "Spievajte Pánovi novú pieseň,<br>" +
                    "lebo vykonal skutky zázračné;<br>" +
                    "pred očami pohanov vyjavil svoju spravodlivosť. Aleluja.", "(Ž 97, 1-2)",
                    "Pán Ježiš povedal: Ja som vinič, vy ste ratolesti.<br>" +
                            "Kto ostáva vo mne a ja v ňom,<br>" +
                            "prináša veľa ovocia. Aleluja.", "(Jn 15, 1. 5)"},
            {"51", "Vstal z mŕtvych dobrý Pastier.<br>" +
                    "On dal život za svoje ovce,<br>" +
                    "ochotne umrel za svoje stádo. Aleluja.", "",
                    "Pokoj vám zanechávam, svoj pokoj vám dávam;<br>" +
                            "nie taký pokoj vám dávam, aký dáva svet, hovorí Pán. Aleluja.", "(Jn 14, 27)"},
            {"52", "Vzdajte chválu nášmu Bohu všetci, čo sa ho bojíte,<br>" +
                    "malí i veľkí,<br>" +
                    "lebo prišla spása, moc a vláda jeho Pomazaného. Aleluja.", "(Zjv 19, 5; 12. 10)",
                    "Veríme, že keď sme zomreli s Kristom,<br>" +
                            "spolu s ním budeme aj žiť. Aleluja.", "(Rim 6, 8)"},
            {"53", "Nech sú moje ústa plné tvojej chvály<br>" +
                    "a nech ťa velebím deň čo deň;<br>" +
                    "jasať budú moje pery, keď ti zaspievam. Aleluja.", "(Ž 70, 8. 23)",
                    "Pán vstal z mŕtvych a stal sa naším svetlom,<br>" +
                            "vykúpil nás svojou krvou. Aleluja.", ""},
            {"54", "Spievajme Pánovi, lebo sa preslávil.<br>" +
                    "Pán je moja sila a moja chvála; on ma zachránil. Aleluja.", "(Ex 15, 1-2)",
                    "Kristus zomrel za všetkých,<br>" +
                            "aby tí, čo žijú, už nežili pre seba,<br>" +
                            "ale pre toho, ktorý za nich zomrel<br>" +
                            "a vstal z mŕtvych. Aleluja.", "(2 Kor 5, 15)"},
            {"55", "Hoden je Baránok, ktorý bol zabitý,<br>" +
                    "prijať moc a bohatstvo, múdrosť a silu,<br>" +
                    "česť, slávu a chválu. Aleluja.", "(Zjv 5, 12)",
                    "Pán Ježiš bol pre nás ukrižovaný,<br>" +
                            "vstal z mŕtvych,<br>" +
                            "a tak nás vykúpil. Aleluja.", ""},
            {"56", "S Kristom ste boli v krste pochovaní<br>" +
                    "a s nim aj vzkriesení,<br>" +
                    "pretože ste uverili v moc Boha,<br>" +
                    "ktorý ho vzkriesil z mŕtvych. Aleluja.", "(Kol 2, 12)",
                    "Pán Ježiš sa modlil:<br>" +
                            "Otče, prosím ťa za tých, ktorí uveria vo mňa,<br>" +
                            "aby aj oni v nás boli jedno,<br>" +
                            "aby svet poznal, že si ma ty poslal. Aleluja.", "(Porov. Jn I7, 20-21)"},
            {"60", "Nadšene ohlasujte veľkú zvesť,<br>" +
                    "zaneste ju do všetkých končín zeme,<br>" +
                    "nech sa všetci dozvedia, že Boh oslobodil svoj ľud. Aleluja.", "(Porov. Iz 48, 20)",
                    "Pán Ježiš hovorí: Ak ma milujete,<br>" +
                            "budete zachovávať moje prikázania.<br>" +
                            "A ja budem prosiť Otca a dá vám iného Zástancu,<br>" +
                            "aby zostal s vami naveky. Aleluja.", "(Jn 14, 15-16)"},
            {"61", "Kristus vzkriesený z mŕtvych už viac neumiera,<br>" +
                    "smrť nad ním už nepanuje. Aleluja.", "(Rim 6, 9)",
                    "Ježiš si stal do stredu a povedal učeníkom:<br>" +
                            "Pokoj vám. Aleluja.", "(Jn 20, 19)"},
            {"62", "Radujme sa, veseľme sa a oslavujme Boha,<br>" +
                    "lebo náš Pán, Boh všemohúci,<br>" +
                    "sa ujal kráľovstva. Aleluja.", "(Zjv 19, 7. 6)",
                    "Kristus musel trpieť a na tretí deň vstať z mŕtvych,<br>" +
                            "a tak vojsť do svojej slávy. Aleluja.", "(Porov. Lk 24, 46. 26)"},
            {"63", "Pane, budem ťa velebiť medzi národmi;<br>" +
                    "tvoje meno chcem zvestovať svojim bratom. Aleluja.", "(Ž 17, 50; 21, 23)",
                    "Pán Ježiš hovorí:<br>" +
                            "Ja som si vás vyvolil zo sveta<br>" +
                            "a ustanovil som vás,<br>" +
                            "aby ste išli a prinášali ovocie<br>" +
                            "a aby vaše ovocie zostalo. Aleluja.", "(Porov. Jn 15, 16. 19)"},
            {"64", "Bože, keď si kráčal na čele svojho ľudu,<br>" +
                    "kliesnil si mu cestu a býval si s ním;<br>" +
                    "zem sa chvela a nebesia rosili. Aleluja.", "(Porov. Ž 67, 8-9. 20)",
                    "Hľa, ja som s vami po všetky dni,<br>" +
                            "až do skončenia sveta. Aleluja.", "(Mt 28, 20)"},
            {"65", "Vykúpil si nás svojou krvou, Pane,<br>" +
                    "z každého kmeňa, jazyka, ľudu a národa<br>" +
                    "a urobil si nás nášmu Bohu<br>" +
                    "kráľovským kňazstvom. Aleluja.", "(Zjv 5, 9-10)",
                    "Kristus, náš Pán,<br>" +
                            "bol vydaný na smrť pre naše hriechy<br>" +
                            "a vstal z mŕtvych pre naše oslobodenie. Aleluja.", "(Porov. Rim 4, 25)"},
            {"66", "Vykúpený ľud, ohlasuj slávne skutky Pána,<br>" +
                    "ktorý ťa z tmy povolal<br>" +
                    "do svojho obdivuhodného svetla. Aleluja.", "(Porov. 1 Pt 2, 9)",
                    "Otče, chcem, aby aj tí, ktorých si mi dal,<br>" +
                            "boli so mnou tam, kde som ja,<br>" +
                            "aby uzreli moju slávu, ktorú si mi dal. Aleluja.", "(Jn 17, 24)"},
            {"70", "Čuj, Pane, hlas môjho volania,<br>" +
                    "zľutuj sa nado mnou a vyslyš ma.<br>" +
                    "V srdci mi znejú tvoje slová: \"Hľadajte moju tvár.\"<br>" +
                    "Pane, ja hľadám tvoju tvár;<br>" +
                    "neodvracaj svoju tvár odo mňa. Aleluja.", "(Ž 26, 7-9)",
                    "Pán Ježiš sa modlil:<br>" +
                            "Prosím ťa, Otče, nech sú aj oni jedno,<br>" +
                            "ako sme my jedno. Aleluja.", "(Porov. Jn 17, 22)"},
            {"71", "Dostanete silu Ducha Svätého,<br>" +
                    "ktorý na vás zostúpi;<br>" +
                    "a budete mi svedkami až po kraj sveta. Aleluja.", "(Sk 1, 8)",
                    "Pán Ježiš hovorí: Nenechám vás ako siroty;<br>" +
                            "prídem k vám, a srdce sa vám zaraduje. Aleluja.", "(Jn 14, 18; 16, 22)"},
            {"72", "Ja som Prvý a Posledný a Žijúci.<br>" +
                    "Bol som mŕtvy, a hľa, žijem na veky vekov. Aleluja.", "(Zjv 1, 17-18)",
                    "Pán Ježiš hovorí:<br>" +
                            "Duch Svätý, ktorého pošle Otec v mojom mene,<br>" +
                            "naučí vás všetko a pripomenie vám všetko,<br>" +
                            "čo som vám povedal. Aleluja.", "(Jn 14, 26)"},
            {"73", "Tlieskajte rukami, všetky národy,<br>" +
                    "jasajte Bohu hlasom radostným. Aleluja.", "(Ž 46, 2)",
                    "Pán Ježiš hovorí: Keď príde Zástanca, ktorého vám pošlem,<br>" +
                            "Duch pravdy, ktorý vychádza od Otca,<br>" +
                            "on bude svedčiť o mne<br>" +
                            "a aj vy budete svedčiť. Aleluja.", "(Jn 15, 26-27)"},
            {"74", "Predstupujme s dôverou pred trón milosti,<br>" +
                    "aby sme dosiahli milosrdenstvo a našli milosť -<br>" +
                    "pomoc v pravom čase. Aleluja.", "(Hebr 4, 16)",
                    "Ja vám vravím pravdu, hovorí Pán;<br>" +
                            "bude pre vás osožné, ak odídem;<br>" +
                            "lebo ak neodídem, nepríde k vám Zástanca. Aleluja.", "(Jn 16, 7)"},
            {"75", "Kristus nás miluje a svojou krvou nás oslobodil od hriechov.<br>" +
                    "Urobil z nás Kráľovstvo kňazov pre svojho Boha a Otca. Aleluja.", "(Zjv 1, 5-6)",
                    "Pán Ježiš hovorí: Keď príde on, Duch pravdy,<br>" +
                            "bude vás viesť k plnej pravde. Aleluja.", "(Jn 16, 13)"},
            {"76", "Učeníci jednomyseľne zotrvávali na modlitbách<br>" +
                    "spolu so ženami a s Ježišovou matkou Máriou<br>" +
                    "a jeho bratmi. Aleluja.", "(Sk 1, 14)",
                    "Pán Ježiš hovorí: Duch Svätý ma oslávi,<br>" +
                            "lebo vezme z môjho a zvestuje vám to. Aleluja.", "(Jn 16, 14)"},
    };

    String[][] adventSpev = {
            {"10", "K tebe, Pane, dvíham svoju dušu.<br>" +
                    "Tebe dôverujem, Bože môj.<br>" +
                    "Nech nie som zahanbený<br>" +
                    "a nech moji nepriatelia nezvíťazia nado mnou.<br>" +
                    "Veď nikto, čo dúfa v teba, nebude zahanbený.", "(Ž 24, 1-3)",
                    "Pán dá požehnanie,<br>" +
                            "a naša zem vydá svoje plody.", "(Ž 84, 13)"},
            {"11", "Národy, čujte slovo Pánovo<br>" +
                    "a ohlasujte ho až do končín zeme:<br>" +
                    "náš Spasitei príde, nebojte sa.", "(Porov. Jer 31, 10; Iz 35, 4)",
                    "Príď, Pane, a navštív nás so svojim pokojom;<br>" +
                            "tvoja prítomnosť nás naplní veľkou radosťou.", "(Porov. Ž 105, 4-5; lz 38, 3)"},
            {"12", "Hľa, Pán príde a s nim všetci jeho svätí;<br>" +
                    "v ten deň zažiari veľké svetlo.", "(Porov. Zach 14, 5. 7)",
                    "Pán, spravodlivý sudca, dá veniec večnej slávy tým,<br>" +
                            "čo s láskou očakávajú jeho príchod.", "(Porov. 2. Tim 4, 8)"},
            {"13", "Pán príde, meškať nebude;<br>" +
                    "osvieti, čo je zahalené tmou,<br>" +
                    "a dá sa poznať všetkým národom.", "(Porov. Hab 2, 3; 1 Kor 4, 5)",
                    "Náš Pán príde s mocou<br>" +
                            "a otvorí oči svojich služobníkov.", "(Porov. Iz 40, 10; 34, 5)"},
            {"14", "Blízko si, Pane, a všetky tvoje príkazy sú správne.<br>" +
                    "Odprvoti viem z tvojich výrokov, že si večný.", "(Porov. Ž 118, 151-152)",
                    "Na tomto svete žime spravodlivo a zbožne<br>" +
                            "a očakávajme splnenie blaženej nádeje<br>" +
                            "a slávny príchod nášho veľkého Boha.", "(Porov. Tit 2, 12-13)"},
            {"15", "Pán príde v jase a navštívi nás,<br>" +
                    "prinesie nám pokoj a večný život.", "",
                    "Očakávame Spasiteľa, Pána Ježiša Krista;<br>" +
                            "on pretvorí naše úbohé telo,<br>" +
                            "aby sa stalo podobným jeho oslávenému telu.", "(Flp 3, 20-21)"},
            {"16", "Príď, Pane, čo tróniš nad cherubmi,<br>" +
                    "rozjasni svoju tvár, a budeme spasení.", "(Porov. Ž 79, 4. 2)",
                    "Pán hovorí: Hľa, prídem čoskoro a so mnou príde moja odplata;<br>" +
                            "odmením každého podľa jeho skutkov.", "(Zjv 22, 12)"},
            {"20", "Ľud Siona,<br>" +
                    "hla, Pán príde spasiť národy,<br>" +
                    "ozve sa svojím velebným hlasom,<br>" +
                    "a vaše srdcia sa zaradujú.", "(Porov. Iz 30, 19. 30)",
                    "Jeruzalem, postav sa na výšinu a hľaď,<br>" +
                            "aká radosť ti prichádza od tvojho Boha.", "(Bar 5, 5; 4, 36)"},
            {"21", "Národy, čujte slovo Pánovo<br>" +
                    "a ohlasujte ho až do končín zeme: náš Spasiteľ príde, nebojte sa.", "(Porov. Jer 31, 10; Iz 35, 4)",
                    "Príď, Pane, a navštív nás so svojím pokojom;<br>" +
                            "tvoja prítomnosť nás naplní veľkou radosťou.", "(Porov. Ž 105, 4-5; Iz 38, 3)"},
            {"22", "Hľa, Pán príde a s ním všetci jeho svätí;<br>" +
                    "v ten deň zažiari veľké svetlo.", "(Porov. Zach 14, 5. 7)",
                    "Pán, spravodlivý sudca, dá veniec večnej slávy tým,<br>" +
                            "čo s láskou očakávajú jeho príchod.", "(Porov. 2 Tim 4, 8)"},
            {"23", "Pán príde, meškať nebude;<br>" +
                    "osvieti, čo je zahalené tmou, a dá sa poznať všetkým národom.", "(Porov. Hab 2, 3; 1 Kor 4, 5)",
                    "Náš Pán príde s mocou<br>" +
                            "a otvorí oči svojich služobníkov.", "(Porov. Iz 40, 10; 34, 5)"},
            {"24", "Blízko si, Pane, a všetky tvoje príkazy sú správne.<br>" +
                    "Odprvoti viem z tvojich výrokov, že si večný.", "(Porov. Ž 118, 151-152)",
                    "Na tomto svete žime spravodlivo a zbožne<br>" +
                            "a očakávajme splnenie blaženej nádeje<br>" +
                            "a slávny príchod nášho veľkého Boha.", "(Porov. Tit 2, 12-13)"},
            {"25", "Pán príde v jase a navštívi nás,<br>" +
                    "prinesie nám pokoj a večný život.", "",
                    "Očakávame Spasiteľa, Pána Ježiša Krista;<br>" +
                            "on pretvorí naše úbohé telo,<br>" +
                            "aby sa stalo podobným jeho oslávenému telu.", "(Flp 3, 20-21)"},
            {"26", "Príď, Pane, čo tróniš nad cherubmi,<br>" +
                    "rozjasní svoju tvár, a budeme spasení.", "(Porov. Ž 79, 4. 2)",
                    "Pán hovorí: Hľa, prídem čoskoro a so mnou príde moja odplata;<br>" +
                            "odmením každého podľa jeho skutkov.", "(Zjv 22, 12)"},
            {"30", "Radujte sa neprestajne v Pánovi!<br>" +
                    "Opakujem: Radujte sa!<br>" +
                    "Pán je blízko.", "(Flp 4, 4, 5)",
                    "Povedzte skleslým na duchu :<br>" +
                            "Vzchopte sa, nebojte sa!<br>" +
                            "Hľa, náš Boh prichádza a prináša nám spásu.", "(Porov. Iz 35, 4)"},
            {"31", "Národy, čujte slovo Pánovo<br>" +
                    "a ohlasujte ho až do končín zeme: náš Spasiteľ príde, nebojte sa.", "(Porov. Jer 31, 10; Iz 35, 4)",
                    "Príď, Pane, a navštív nás so svojím pokojom;<br>" +
                            "tvoja prítomnosť nás naplní veľkou radosťou.", "(Porov. Ž 105, 4-5; Iz 38, 3)"},
            {"32", "Hľa, Pán príde a s ním všetci jeho svätí;<br>" +
                    "v ten deň zažiari veľké svetlo.", "(Porov. Zach 14, 5. 7)",
                    "Pán, spravodlivý sudca, dá veniec večnej slávy tým,<br>" +
                            "čo s láskou očakávajú jeho príchod.", "(Porov. 2 Tim 4, 8)"},
            {"33", "Pán príde, meškať nebude;<br>" +
                    "osvieti, čo je zahalené tmou, a dá sa poznať všetkým národom.", "(Porov. Hab 2, 3; 1 Kor 4, 5)",
                    "Náš Pán príde s mocou<br>" +
                            "a otvorí oči svojich služobníkov.", "(Porov. Iz 40, 10; 34,•5)"},
            {"34", "Blízko si, Pane, a všetky tvoje príkazy sú správne.<br>" +
                    "Odprvoti viem z tvojich výrokov, že si večný.", "(Porov. Ž 118, 151-152)",
                    "Na tomto svete žime spravodlivo a zbožne<br>" +
                            "a očakávajme splnenie blaženej nádeje<br>" +
                            "a slávny príchod nášho veľkého Boha.", "(Porov. Tit 2, 12-13)"},
            {"35", "Pán príde v jase a navštívi nás,<br>" +
                    "prinesie nám pokoj a večný život.", "",
                    "Očakávame Spasiteľa, Pána Ježiša Krista;<br>" +
                            "on pretvorí naše úbohé telo,<br>" +
                            "aby sa stalo podobným jeho oslávenému telu.", "(Flp 3, 20-21)"},
            {"40", "Nebesia, roste z výsosti<br>" +
                    "a z oblakov nech k nám zostúpi Spravodlivý.<br>" +
                    "Otvor sa, zem, a zroď Spasiteľa!", "(Porov. Iz 45, 8)",
                    "Hľa, Panna počne a porodí Syna,<br>" +
                            "a dá mu meno Emanuel, to značí Pán s nami.", "(Iz 7, 14)"},
    };

    String[][] vianoceSpev = {
            //DRUHÁ NEDEĽA PO NARODENÍ PÁNA
            {"0", "Keď sa všetko pohrúžilo do hlbokého mlčania<br>" +
                    "a noc došla do polovice svojej cesty,<br>" +
                    "tvoje všemohúce slovo, Pane,<br>" +
                    "zostúpilo z neba, z kráľovského trónu.", "(Múd 18, 14-15)",
                    "Tým, ktorí ho prijali,<br>" +
                            "dal moc stať sa Božími deťmi.", "(Jn 1, 12)"},
            //VŠEDNÉ DNI VIANOCNÉHO OBDOBIA
            {"1", "Posvätný deň nám zažiaril;<br>" +
                    "poďte, národy, a klaňajte sa Pánovi,<br>" +
                    "lebo veľké Svetlo zostúpilo na zem.","",
                    "Uvideli sme jeho slávu,<br>" +
                            "slávu, akú má od Otca jednorodený Syn, plný milosti a pravdy.","(Jn 1, 14)"},
            {"2", "Požehnaný, ktorý prichádza v mene Pánovom.<br>" +
                    "Boh, Pán, je našim svetlom.","(Ž 117, 26-27)",
                    "Zvrchovane milosrdný Boh si nás vo svojej veľkej láske zamiloval<br>" +
                            "a poslal svojho Syna v tele, podobnom nášmu hriešnemu telu.","(Porov. Ef 2, 4; Rim 8, 3)"},
            {"3", "Ľud, čo kráčal v tmách, uzrel veľké svetlo;<br>" +
                    "nad tými, čo bývajú v krajine temnôt,<br>" +
                    "zažiarilo Slnko života.","(Porov. Iz 9, 2)",
                    "Život, ktorý bol u Otca,<br>" +
                            "sa nám zjavil.","(1 Jn 1, 2)"},
            {"4", "Na počiatku a pred vekmi bolo Slovo,<br>" +
                    "a to Slovo bolo Boh;<br>" +
                    "v plnosti času sa nám narodil<br>" +
                    "ako Spasiteľ sveta.","(Porov. Jn 1, 1)",
                    "Boh tak miloval svet,<br>" +
                            "že dal svojho jednorodeného Syna,<br>" +
                            "aby nezahynul nik, čo v neho verí,<br>" +
                            "ale aby mal večný život.","(Jn 3, 16)"},
            {"5", "Spravodlivým žiari svetlo v temnotách:<br>" +
                    "milosrdný, milostivý a spravodlivý Pán.","(Ž 111, 4)",
                    "Božia láska k nám sa prejavila v tom,<br>" +
                            "že Boh poslal na svet svojho jednorodeného Syna,<br>" +
                            "aby sme skrze neho mali život.","(1 Jn 4, 9)"},
            {"6", "Boh poslal svojho Syna,<br>" +
                    "narodeného zo ženy,<br>" +
                    "aby sme mohli dostať právo synovstva.","(Gal 4, 4-5)",
                    "Z Kristovej plnosti sme prijali všetci<br>" +
                            "milosť za milosťou.","(Jn 1, 16)"},

    };
}
