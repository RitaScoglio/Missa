package sk.missa.interfaces;

/*
 * Spevy v cezročnom období - cezrokSpev; v pôstnom období - postSpev; vo veľkonočnom období - velkanocSpev; v adventnom období - adventSpev
 * cezročné obdobie: {týždeň v cezročnom období, úvodný spev - text, úvodný spev - súradnice, spev po prijímaní - text, spev po prijímaní - súradnice},
 * pôstne obdobie: {týždeň v pôstnom období+deň (napr. 2 týždeň v pondelok - 21), úvodný spev - text, úvodný spev - súradnice, spev po prijímaní - text, spev po prijímaní - súradnice},
 * veľkonočné obdobie: {týždeň vo veľkonočnom období+deň (napr. 2 týždeň v pondelok - 21), úvodný spev - text, úvodný spev - súradnice, spev po prijímaní - text, spev po prijímaní - súradnice},
 * adventné obdobie: {týždeň v adventnom období+deň (napr. 2 týždeň v pondelok - 21), úvodný spev - text, úvodný spev - súradnice, spev po prijímaní - text, spev po prijímaní - súradnice},
 *
 * Keďže sú spevy v adventnom a vianočnom období viazané na deň, nachádzajú sa v Spevy_svatci uložené v mesiaci, ktorému prislúchajú a s dňom ako ID
 */

public interface Spevy_obdobia {
    String[][] cezrokSpev = {
            {"1", "Na vznešenom tróne videl som sedieť muža, ktorému sa klaňajú zástupy anjelov a spoločne mu spievajú: Hľa, to je ten, ktorého kráľovstvo je večné.", "",
                    "Pane, u teba je zdroj života a v tvojom svetle uvidíme svetlo. <br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Jn 10, 10)</font><br>" +
                            "Ja som prišiel, aby mali život a aby ho mali hojnejšie, hovorí Pán.", "(Ž 36, 10)"},
            {"2", "Nech sa ti, Bože, klania celá zem a nech ti spieva; nech ospevuje tvoje meno, Najvyšší.", "(Ž 66, 4)",
                    "Prestieraš mi stôl a kalich mi napĺňaš až po okraj.<br>" +
                            "<font color='#B71C1C'>Alebo: (1 Jn 4, 16)</font><br>" +
                            "My sme uverili a spoznali lásku, akú má Boh k nám.", "(Porov. Ž 23, 5)"},
            {"3", "Spievajte Pánovi pieseň novú, spievaj Pánovi, celá zem! Vznešenosť a krása pred jeho tvárou, moc a veleba v jeho svätyni.", "(Porov. Ž 96, 1. 6)",
                    "Pristúpte k Pánovi a budete žiariť a tvár vám nesčervenie hanbou.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 8, 12)</font><br>" +
                            "Ja som svetlo sveta, hovorí Pán. Kto mňa nasleduje, nebude chodiť vo tmách, ale bude mať svetlo života.", "(Porov. Ž 34, 6)"},
            {"4", "Zachráň nás, Pane, Bože náš, a zhromaždi nás z krajín pohanských, aby sme mohli tvoje sväté meno velebiť a tvojou slávou sa honosiť.", "(Ž 106, 47)",
                    "Rozjasni svoju tvár nad svojím sluhom a zachráň ma vo svojom milosrdenstve. Pane, nech nie som zahanbený, veď vzývam teba.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 5, 3 – 4)</font><br>" +
                            "Blahoslavení chudobní v duchu, lebo ich je nebeské kráľovstvo. Blahoslavení tichí, lebo oni budú dedičmi zeme.", "(Porov. Ž 31, 17 – 18)"},
            {"5", "Poďte, klaňajme sa Bohu, kľaknime na kolená pred Pánom, ktorý nás stvoril, lebo on je náš Pán a Boh.", "(Ž 95, 6 – 7)",
                    "Nech oslavujú Pána za jeho milosrdenstvo a za zázraky v prospech ľudí, lebo smädného napojil a hladného nakŕmil dobrotami.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 5, 5 – 6)</font><br>" +
                            "Blahoslavení plačúci, lebo oni budú potešení. Blahoslavení lační a smädní po spravodlivosti, lebo oni budú nasýtení.", "(Porov. Ž 107, 8 – 9)"},
            {"6", "Bože, buď mi skalou útočišťa, opevneným hradom mojej spásy. Veď ty si moja sila a moje útočište, pre svoje meno budeš ma viesť a opatrovať.", "(Porov. Ž 31, 3 – 4)",
                    "Jedli a nasýtili sa nadmieru, Pán im splnil, čo si žiadali. Ich očakávanie sa splnilo.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 3, 16)</font><br>" +
                            "Boh tak miloval svet, že dal svojho jednorodeného Syna, aby nezahynul nik, kto v neho verí, ale aby mal večný život.", "(Porov. Ž 78, 29 – 30)"},
            {"7", "Pane, ja dúfam v tvoje milosrdenstvo, moje srdce sa teší z tvojej pomoci. Budem spievať Pánovi, že ma zahŕňa dobrodeniami.", "(Ž 13, 6)",
                    "Vyrozprávam všetky tvoje diela zázračné. V tebe sa budem tešiť a radovať, ospevovať budem tvoje meno, Najvyšší.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 11, 27)</font><br>" +
                            "Pane, ja som uverila, že ty si Mesiáš, Boží Syn, ktorý mal prísť na svet.", "(Ž 9, 2 – 3)"},
            {"8", "Pán mi bol podperou, vyviedol ma na miesto priestranné, zachránil ma, lebo si ma obľúbil.", "(Porov. Ž 18, 19 – 20)",
                    "Budem spievať Pánovi, že ma zahŕňa dobrodeniami, oslavovať budem meno Najvyššieho.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 28, 20)</font><br>" +
                            "Hľa, ja som s vami po všetky dni až do skončenia sveta, hovorí Pán.", "(Porov. Ž 13, 6)"},
            {"9", "Pozriže na mňa a zmiluj sa nado mnou, Pane, lebo som sám a úbohý. Pozri na moju biedu a na moje trápenie a odpusť mi všetky priestupky.", "(Porov. Ž 25, 16. 18)",
                    "K tebe, Bože, volám, lebo ty ma vyslyšíš. Nakloň ku mne sluch a vypočuj moje slová. <br>" +
                            "<font color='#B71C1C'>Alebo: (Mk 11, 23. 24)</font><br>" +
                            "Veru, hovorím vám: Verte, že všetko, o čo v modlitbe prosíte, ste už dostali a budete to mať, hovorí Pán.", "(Porov. Ž 17, 6)"},
            {"10", "Pán je moje svetlo a moja spása, koho sa mám báť? Pán je ochranca môjho života, pred kým sa mám strachovať? Moji utláčatelia a nepriatelia strácajú silu a padajú.", "(Porov. Ž 27, 1 – 2)",
                    "Pane, opora moja, útočište moje, osloboditeľ môj, Bože môj, moja pomoc, tebe dôverujem.<br>" +
                            "<font color='#B71C1C'>Alebo: (1 Jn 4, 16)</font><br>" +
                            "Boh je láska; a kto ostáva v láske, ostáva v Bohu a Boh ostáva v ňom.", "(Ž 18, 3)"},
            {"11", "Čuj, Pane, hlas môjho volania. Ty si moja pomoc, neodvrhuj ma, ani ma neopúšťaj, Bože, moja spása.", "(Porov. Ž 27, 7. 9)",
                    "O jedno prosím Pána a za tým túžim, aby som mohol bývať v dome Pánovom po všetky dni svojho života. <br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 17, 11)</font><br>" +
                            "Svätý Otče, zachovaj vo svojom mene tých, ktorých si mi dal, aby boli jedno ako my, hovorí Pán.", "(Ž 27, 4)"},
            {"12", "Pán je sila svojho ľudu a útočište spásy pre svojho Pomazaného. Spas svoj ľud a požehnaj svojich dedičov a spravuj ich a dvíhaj ich až naveky.", "(Porov. Ž 28, 8 – 9)",
                    "Oči všetkých sa s dôverou upierajú na teba, Pane, a ty im dávaš pokrm v pravý čas.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 10, 11. 15)</font><br>" +
                            "Ja som dobrý pastier; aj svoj život položím za ovce, hovorí Pán.", "(Ž 145, 15)"},
            {"13", "Tlieskajte rukami, všetky národy, jasajte Bohu hlasom radostným.", "(Ž 47, 2)",
                    "Dobroreč, duša moja, Pánovi a celé moje vnútro jeho menu svätému. <br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 17, 20 – 21)</font><br>" +
                            "Otče, prosím za nich, aby aj oni boli v nás jedno, aby svet uveril, že si ma ty poslal, hovorí Pán.", "(Porov. Ž 103, 1)"},
            {"14", "Spomíname, Bože, na tvoje milosrdenstvo uprostred tvojho chrámu. Ako tvoje meno, Bože, tak aj tvoja sláva šíri sa až do končín zeme; tvoja pravica je plná spravodlivosti.", "(Porov. Ž 48, 10 – 11)",
                    "Skúste a presvedčte sa, aký dobrý je Pán; šťastný človek, čo sa utieka k nemu. <br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 11, 28)</font><br>" +
                            "Poďte ku mne všetci, ktorí sa namáhate a ste preťažení, a ja vás posilním, hovorí Pán.", "(Ž 34, 9)"},
            {"15", "Ja však v spravodlivosti uzriem tvoju tvár a až raz vstanem zo sna, nasýtim sa pohľadom na teba.", "(Porov. Ž 17, 15)",
                    "Aj vrabec si nájde príbytok a lastovička hniezdo, kde vkladá svoje mláďatá: tvoje oltáre, Pane zástupov, môj Kráľ a môj Boh. Blažení tí, čo bývajú v tvojom dome a bez prestania ťa velebia.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 6, 57)</font><br>" +
                            "Kto je moje telo a pije moju krv, ostáva vo mne a ja v ňom, hovorí Pán.", "(Porov. Ž 84, 4 – 5)"},
            {"16", "Mne Boh pomáha a môj život udržiava Pán. S radosťou ti prinesiem obetu; meno tvoje, Pane, budem velebiť, lebo si dobrý.", "(Ž 54, 6. 8)",
                    "Ustanovil pamiatku na svoje obdivuhodné skutky; Pán je milosrdný a milostivý. Pokrm dal tým, čo sa ho boja.<br>" +
                            "<font color='#B71C1C'>Alebo: (Zjv 3, 20)</font><br>" +
                            "Hľa, stojím pri dverách a klopem, hovorí Pán. Kto počúvne môj hlas a otvorí dvere, k tomu vojdem a budem s ním večerať a on so mnou.", "(Ž 111, 4 – 5)"},
            {"17", "Boh prebýva vo svojom svätom príbytku; Boh, čo opusteným dáva prebývať v domoch, on sám dáva silu i statočnosť svojmu ľudu.", "(Porov. Ž 68, 6 – 7. 36)",
                    "Dobroreč, duša moja, Pánovi a nezabúdaj na jeho dobrodenia. <br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 5, 7 – 8)</font><br>" +
                            "Blahoslavení milosrdní, lebo oni dosiahnu milosrdenstvo. Blahoslavení čistého srdca, lebo oni uvidia Boha.", "(Ž 103, 2)"},
            {"18", "Bože, príď mi na pomoc, Pane, ponáhľaj sa mi pomáhať. Ty si moja pomoc a môj osloboditeľ, Pane, nemeškaj.", "(Ž 70, 2. 6)",
                    "Dal si nám chlieb z neba, Pane, ktorý má v sebe všetku slasť a uspokojí každú chuť.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 6, 35)</font><br>" +
                            "Ja som chlieb života, hovorí Pán. Kto prichádza ku mne, nikdy nebude hladovať, a kto verí vo mňa, nikdy nebude žízniť.", "(Múd 16, 20)"},
            {"19", "Zhliadni, Pane, na svoju zmluvu a nezabúdaj nikdy na svojich úbožiakov. Vstaň, Bože, a ujmi sa svojej veci, nezabúdaj na volanie tých, čo ťa hľadajú.", "(Porov. Ž 74, 20. 19. 22. 23)",
                    "Chváľ, Jeruzalem, Pána, lebo ťa sýti najlepšou pšenicou. <br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. Jn 6, 51)</font><br>" +
                            "Chlieb, ktorý ja dám, je moje telo za život sveta, hovorí Pán.", "(Ž 148, 12. 14)"},
            {"20", "Bože, náš ochranca, pohliadni a pozri na tvár svojho Pomazaného. Jeden deň v tvojich nádvoriach je lepší než iných tisíce.", "(Ž 84, 10 – 11)",
                    "U Pána je milosrdenstvo a hojné vykúpenie. <br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 6, 51 – 52)</font><br>" +
                            "Ja som živý chlieb, ktorý zostúpil z neba, hovorí Pán; kto bude jesť z tohto chleba, bude žiť naveky.", "(Ž 130, 7)"},
            {"21", "Nakloň, Pane, svoj sluch a vyslyš ma; zachráň, Bože, svojho sluhu, ktorý dúfa v teba. Zmiluj sa, Pane, nado mnou, veď k tebe volám deň čo deň.", "(Porov. Ž 86, 1 – 3)",
                    "Plodmi svojich diel sýtiš zem, Pane; zo zeme vyvádzaš chlieb i víno, čo obveseľuje srdce človeka.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 6, 54)</font><br>" +
                            "Kto je moje telo a pije moju krv, má večný život, hovorí Pán, a ja ho vzkriesim v posledný deň.", "(Porov. Ž 104, 13 – 15)"},
            {"22", "Zmiluj sa Pane, nado mnou, veď k tebe volám deň čo deň; lebo ty, Pane, si dobrý a láskavý a veľmi milostivý voči všetkým, čo ťa vzývajú.", "(Porov. Ž 86, 3. 5)",
                    "Pane, tvoja dobrota je taká nesmierna a vyhradil si ju bohabojným.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 5, 9 – 10)</font><br>" +
                            "Blahoslavení tí, čo šíria pokoj, lebo ich budú volať Božími synmi. Blahoslavení prenasledovaní pre spravodlivosť, lebo ich je nebeské kráľovstvo.", "(Ž 40, 20)"},
            {"23", "Pane, ty si spravodlivý a správne sú tvoje rozsudky; nalož so svojím služobníkom podľa svojho milosrdenstva.", "(Ž 119, 137. 124)",
                    "Ako jeleň dychtí za vodou z prameňa, tak moja duša, Bože, túži za tebou. Po Bohu žízni moja duša, po Bohu živom.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 8, 12)</font><br>" +
                            "Ja som svetlo sveta, hovorí Pán. Kto mňa nasleduje, nebude chodiť vo tmách, ale bude mať svetlo života.", "(Porov. Ž 42, 2 – 3)"},
            {"24", "Daruj, Pane, pokoj tým, čo sa spoliehajú na teba, aby sa ukázalo, že tvoji proroci sú hodnoverní; vypočuj prosby svojho služobníka a svojho ľudu, Izraela.", "(Porov. Sir 36, 18)",
                    "Bože, aké vzácne je tvoje milosrdenstvo! Ľudia sa utiekajú do tône tvojich krídel. <br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. 1 Kor 10, 16)</font><br>" +
                            "Kalich dobrorečenia, nad ktorým dobrorečíme, je účasťou na Kristovej krvi; a chlieb, ktorý lámeme, je účasťou na Kristovom tele.", "(Porov. Ž 36, 8)"},
            {"25", "Ja som spása ľudu, hovorí Pán. V akomkoľvek súžení ma budú vzývať, vyslyším ich a budem ich Pánom naveky.", "",
                    "Ty si dal príkazy, aby sa verne plnili. Kiež by ma moje cesty viedli tak, žeby som zachovával tvoje ustanovenia.<br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 10, 14)</font><br>" +
                            "Ja som dobrý pastier, hovorí Pán, poznám svoje a moje poznajú mňa.", "(Ž 119, 4 – 5)"},
            {"26", "Všetko, čo si nám urobil, Pane, spravodlivo si urobil, lebo sme zhrešili proti tebe a nezachovávali sme tvoje prikázania. Ale osláv svoje meno a zaobchádzaj s nami podľa svojho nesmierneho milosrdenstva.", "(Dan 3, 31. 29. 30. 43. 42)",
                    "Pamätaj na slovo, čo si dal svojmu služobníkovi, Pane, lebo ním si mi dal nádej. To ma utešuje v ponížení.<br>" +
                            "<font color='#B71C1C'>Alebo: (1 Jn 3, 16)</font><br>" +
                            "Čo je Božia láska, poznali sme z toho, že on položil za nás svoj život; aj my sme povinní dávať život za bratov.", "(Porov. Ž 119, 49 – 50)"},
            {"27", "Pane, všetko je v tvojej moci a nik nemôže odporovať tvojej vôli. Veď ty si stvoril všetko, nebo i zem, aj všetko, čo je pod nebom; ty si Pán všetkého.", "(Porov. Est 4, 17)",
                    "Pán je dobrý k tým, čo v neho dúfajú, k človeku, ktorý ho hľadá.<br>" +
                            "<font color='#B71C1C'>Alebo: (Porov. 1 Kor 10, 17)</font><br>" +
                            "Sme jedným chlebom a jedným telom, hoci je nás mnoho, lebo všetci máme účasť na jednom chlebe a na jednom kalichu.", "(Nár 3, 25)"},
            {"28", "Ak si budeš, Pane, v pamäti uchovávať neprávosť, Pane, kto obstojí? Ale ty si milostivý, Bože Izraela.", "(Ž 130, 3 – 4)",
                    "Boháči sa nabiedia a nahladujú, ale tým, čo hľadajú Pána, nijaké dobro chýbať nebude. <br>" +
                            "<font color='#B71C1C'>Alebo: (1 Jn 3, 2)</font><br>" +
                            "Keď sa zjaví Pán, budeme mu podobní, lebo ho budeme vidieť takého, aký je.", "(Porov. Ž 34, 11)"},
            {"29", "K tebe, Bože, volám, lebo ty ma vyslyšíš. Nakloň ku mne sluch a vypočuj moje slová. Chráň ma, Pane, ako zrenicu oka, skry ma v tôni svojich perutí.", "(Porov. Ž 17, 6. 8)",
                    "Hľa, oko Pánovo bdie nad tými, čo sa ho boja, nad tými, čo v jeho milosrdenstvo dúfajú; aby ich zachránil pred smrťou a v čase hladu nakŕmil.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mk 10, 45)</font><br>" +
                            "Syn človeka prišiel, aby položil svoj život ako výkupné za mnohých.", "(Porov. Ž 33, 18 – 19)"},
            {"30", "Nech sa radujú srdcia tých, čo hľadajú Pána. Hľadajte Pána a jeho moc, hľadajte vždy jeho tvár.", "(Porov. Ž 105, 3 – 4)",
                    "Budeme sa tešiť z tvojho víťazstva a v mene nášho Boha dvíhať zástavy. <br>" +
                            "<font color='#B71C1C'>Alebo: (Ef 5, 2)</font><br>" +
                            "Kristus nás miluje a vydal seba samého Bohu za nás ako dar a obetu ľúbeznej vône.", "(Porov. Ž 20, 6)"},
            {"31", "Neopúšťaj ma, Pane, Bože môj, a nevzďaľuj sa odo mňa. Ponáhľaj sa mi na pomoc, Pane, moja spása.", "(Porov. Ž 38, 22 – 23)",
                    "Ukážeš mi cestu života, Pane, u teba je plnosť radosti. <br>" +
                            "<font color='#B71C1C'>Alebo: (Jn 6, 58)</font><br>" +
                            "Ako mňa poslal živý Otec a ja žijem z Otca, aj ten, čo mňa je, bude žiť zo mňa, hovorí Pán.", "(Porov. Ž 16, 11)"},
            {"32", "Kiež prenikne k tebe moja modlitba, nakloň svoj sluch k mojej prosbe, Pane.", "(Porov. Ž 88, 3)",
                    "Pán je môj pastier, nič mi nechýba; pasie ma na zelených pašienkach. Vodí ma k tichým vodám.<br>" +
                            "<font color='#B71C1C'>Alebo: (Lk 24, 35)</font><br>" +
                            "Učeníci spoznali Pána Ježiša pri lámaní chleba.", "(Porov. Ž 23, 1 – 2)"},
            {"33", "Pán hovorí: Môj zámer s vami sú myšlienky pokoja a nie súženia; budete ma vzývať a ja vás vyslyším a privediem vás naspäť zo všetkých miest vášho zajatia.", "(Jer 29, 11. 12. 14)",
                    "Pre mňa je slasťou byť v Božej blízkosti a v Pánu Bohu svoju nádej mať.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mk 11, 23 – 24)</font><br>" +
                            "Veru, hovorím vám: Verte, že všetko, o čo v modlitbe prosíte, ste už dostali, a budete to mať, hovorí Pán.", "(Ž 73, 28)"},
            {"34", "Pán ohlási pokoj svojmu ľudu a svojim svätým i tým, čo sa k nemu obracajú úprimne.", "(Porov. Ž 85, 9)",
                    "Chváľte Pána, všetky národy, lebo je veľké jeho milosrdenstvo voči nám.<br>" +
                            "<font color='#B71C1C'>Alebo: (Mt 28, 20)</font><br>" +
                            "Hľa, ja som s vami po všetky dni až do skončenia sveta, hovorí Pán.", "(Ž 117, 1 – 2)"},
    };

    String[][] postSpev = {
            {"03", "Pane, zmilúvaš sa nad všetkými a nepohŕdaš ničím, čo si stvoril; zatváraš oči nad hriechmi ľudí, aby sa kajali, a si k nim láskavý, lebo si Boh a náš Pán.", "(Porov. Múd 11, 24. 25. 27)",
                    "Kto o zákone Pánovom rozjíma dňom i nocou, prináša ovocie v pravý čas.", "(Porov. Ž 1, 2 – 3)"},
            {"04", "Volal som k Pánovi, a vypočul môj hlas. Vyslobodil ma z moci tých, čo na mňa útočia. Zlož svoju starosť na Pána a on ťa zachová.", "(Porov. Ž 55, 17 – 20. 23)",
                    "Bože, stvor vo mne srdce čisté a v mojom vnútri obnov ducha pevného.", "(Porov. Ž 51, 12)"},
            {"05", "Čuj, Pane, a zmiluj sa nado mnou; Pane, buď mi na pomoci.", "(Ž 30, 11)",
                    "Ukáž nám, Pane, svoje cesty a pouč nás o svojich chodníkoch.", "(Ž 25, 4)"},
            {"06", "Vyslyš nás, Pane, veď si dobrotivý a láskavý; pre svoje veľké milosrdenstvo pohliadni na nás.", "(Porov. Ž 69, 17)",
                    "Milosrdenstvo chcem, a nie obetu, hovorí Pán. Neprišiel som volať spravodlivých, ale hriešnikov.", "(Mt 9, 13)"},
            {"10", "Keď ku mne zavolá, ja ho vyslyším, zachránim ho i oslávim. Obdarím ho dlhým životom.", "(Porov. Ž 91, 15 – 16)",
                    "Nielen z chleba žije človek, ale z každého slova, ktoré vychádza z Božích úst.<br>" +
                            "<font color='#B71C1C'>Alebo:(Porov. Ž 91, 4)</font><br>" +
                            "Pán ťa zacloní svojimi krídlami a uchýliš sa pod jeho perute.", "(Mt 4, 4)"},
            {"11", "Ako oči sluhov hľadia na ruky svojich pánov, tak hľadia naše oči na Pána, nášho Boha, kým sa nezmiluje nad nami. Zmiluj sa, Pane, nad nami, zmiluj sa nad nami.", "(Porov. Ž 123, 2 – 3)",
                    "Veru, hovorím vám, čokoľvek ste urobili jednému z mojich najmenších, mne ste urobili, hovorí Pán. Poďte, požehnaní môjho Otca, zaujmite kráľovstvo, ktoré je pre vás pripravené od stvorenia sveta.", "(Mt 25, 40. 34)"},
            {"12", "Pane, stal si sa nám útočišťom z pokolenia na pokolenie; ty si od vekov až na veky.", "(Porov. Ž 90, 1 – 2)",
                    "Bože, spravodlivosť moja, ty si ma vyslyšal, keď som volal o pomoc; v súžení si mi uľavil. Zmiluj sa nado mnou, Pane, a vyslyš moju modlitbu.", "(Porov. Ž 4, 2)"},
            {"13", "Rozpomeň sa, Pane, na svoje zľutovanie a na svoje milosrdenstvo, ktoré trvá od vekov. Nech naši nepriatelia nezvíťazia nad nami. Vysloboď nás, Bože Izraela, zo všetkých našich úzkostí.", "(Porov. Ž 25, 6. 2. 22)",
                    "Nech sa tešia všetci, čo majú dôveru v teba, Pane, a naveky nech jasajú, lebo si s nimi.", "(Porov. Ž 5, 12)"},
            {"14", "Pane, počuj moje slová, všimni si moje vzdychanie. Pozoruj moju hlasitú prosbu, môj Kráľ a môj Boh.", "(Porov. Ž 5, 2 – 3)",
                    "Každý, kto prosí, dostane, a kto hľadá, nájde, a kto klope, tomu otvoria.", "(Mt 7, 8)"},
            {"15", "Vytrhni ma, Pane, z mojich tiesní. Pozri na moju pokoru a na moje trápenie a odpusť mi všetky priestupky.", "(Porov. Ž 25, 17 – 18)",
                    "Ako žijem, hovorí Pán, nechcem smrť hriešnika, ale aby sa obrátil a žil.", "(Ez 33, 11)"},
            {"16", "Zákon Pánov je dokonalý, osviežuje dušu; svedectvo Pánovo je hodnoverné, dáva múdrosť maličkým.", "(Porov. Ž 19, 8)",
                    "Buďte dokonalí, ako je dokonalý váš nebeský Otec, hovorí Pán.", "(Mt 5, 48)"},
            {"20", "V srdci mi znejú tvoje slová: Hľadajte moju tvár. Pane, ja hľadám tvoju tvár, neodvracaj svoju tvár odo mňa.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Ž 25, 6. 2. 22)</font><br>" +
                    "Rozpomeň sa, Pane, na svoje zľutovanie a na svoje milosrdenstvo, ktoré trvá od vekov. Nech naši nepriatelia nezvíťazia nad nami. Vysloboď nás, Bože Izraela, zo všetkých našich úzkostí.", "(Porov. Ž 27, 8 – 9)",
                    "Toto je môj milovaný Syn, v ktorom mám zaľúbenie, počúvajte ho.", "(Mt 17, 5) "},
            {"21", "Vykúp ma, Pane, a buď mi milostivý. Moja noha stojí na rovnej ceste; v zhromaždeniach chcem velebiť Pána.", "(Porov. Ž 26, 11 – 12)",
                    "Buďte milosrdní, ako je milosrdný váš Otec, hovorí Pán.", "(Lk 6, 36)"},
            {"22", "Daj svetlo mojim očiam, aby som v smrti nezaspal, aby nemohol povedať môj nepriateľ: Premohol som ho.", "(Porov. Ž 13, 4 – 5)",
                    "Vyrozprávam všetky tvoje diela zázračné, v tebe sa budem tešiť a radovať, ospevovať budem tvoje meno, Najvyšší.", "(Ž 9, 2 – 3)"},
            {"23", "Neopúšťaj ma, Pane, Bože môj, a nevzďaľuj sa odo mňa. Ponáhľaj sa mi na pomoc, Pane, moja spása.", "(Porov. Ž 38, 22 – 23)",
                    "Syn človeka neprišiel dať sa obsluhovať, ale slúžiť a položiť svoj život ako výkupné za mnohých.", "(Mt 20, 28)"},
            {"24", "Skúmaj ma, Bože, a všímaj si moje cesty; pozri, či nejdem bludnou cestou, a veď ma po ceste k večnosti.", "(Porov. Ž 139, 23 – 24)",
                    "Blažení tí, čo idú cestou života bez poškvrny, čo kráčajú podľa zákona Pánovho.", "(Ž 119, 1)"},
            {"25", "Pane, v teba dúfam, nech nie som zahanbený naveky, vyvedieš ma z osídla, čo mi nastrojili, lebo ty si moja sila.", "(Porov. Ž 31, 2. 5)",
                    "Boh nás miloval a poslal svojho Syna ako zmiernu obetu za naše hriechy.", "(1 Jn 4, 10)"},
            {"26", "Milostivý a milosrdný je Pán, zhovievavý a veľmi láskavý. Dobrý je Pán ku každému a milostivý k všetkým svojim stvoreniam.", "(Ž 145, 8 – 9)",
                    "Syn môj, patrí sa ti radovať, lebo tvoj brat bol mŕtvy, a ožil, bol stratený, a našiel sa.", "(Lk 15, 32)"},
            {"30", "Moje oči sa stále upierajú na Pána, veď on mi vyslobodzuje nohy z osídel. Pozriže na mňa a zmiluj sa nado mnou, lebo som sám a úbohý.<br>" +
                    "<font color='#B71C1C'>Alebo: (Porov. Ez 36, 23 – 26)</font><br>" +
                    "Keď na vás ukážem, že som svätý, zhromaždím vás zo všetkých krajín; potom na vás vylejem čistú vodu a budete očistení od všetkej špiny. A vložím do vás nového ducha.", "(Ž 25, 15 – 16)",
                    "Ak sa číta evanjelium o Samaritánke:<br>" +
                            "Kto sa napije z vody, ktorú mu ja dám, hovorí Pán, stane sa v ňom žriedlom vody prúdiacej do večného života. <br>" +
                            "Ak sa číta iné evanjelium:<br>" +
                            "(Porov. Ž 84, 4 – 5)<br>" +
                            "Vrabec si nájde príbytok a lastovička hniezdo, kde vkladá svoje mláďatá: tvoje oltáre, Pane zástupov, môj Kráľ a môj Boh. Blažení tí, čo bývajú v tvojom dome a bez prestania ťa velebia.", "(Jn 4, 13 – 14)"},
            {"31", "Túži a zmiera moja duša po nádvoriach Pánových. Moje srdce i moje telo vznášajú sa k Bohu živému.", "(Ž 84, 3)",
                    "Chváľte Pána, všetky národy, lebo je veľké jeho milosrdenstvo voči nám.", "(Ž 117, 1 – 2)"},
            {"32", "K tebe, Bože, volám, lebo ty ma vyslyšíš; nakloň ku mne sluch a vypočuj moje slová. Chráň ma, Pane, ako zrenicu oka, skry ma v tôni svojich perutí.", "(Porov. Ž 17, 6. 8)",
                    "Pane, kto smie bývať v tvojom stánku? Kto môže nájsť odpočinok na tvojom svätom vrchu? Ten, čo kráča bez poškvrny a koná spravodlivo.", "(Porov. Ž 15, 1 – 2)"},
            {"33", "Riaď moje kroky podľa svojho výroku, nech ma neovláda nijaká neprávosť.", "(Porov. Ž 119, 133)",
                    "Ukážeš mi, Pane, cestu života; u teba je plnosť radosti.", "(Porov. Ž 16, 11)"},
            {"34", "Ja som spása ľudu, hovorí Pán. V akomkoľvek súžení ma budú vzývať, vyslyším ich a budem ich Pánom naveky.", "",
                    "Ty si dal príkazy, aby sa verne plnili; kiež by ma moje cesty viedli tak, žeby som zachovával tvoje ustanovenia.", "(Ž 119, 4 – 5)"},
            {"35", "Niet podobného tebe medzi bohmi, Pane, lebo si veľký a robíš zázraky; iba ty si Boh.", "(Ž 86, 8. 10)",
                    "Milovať Boha z celého srdca a blížneho ako seba samého je viac ako všetky obety.", "(Porov. Mk 12, 33)"},
            {"36", "Dobroreč, duša moja, Pánovi a nezabúdaj na jeho dobrodenia; veď on ti odpúšťa všetky neprávosti.", "(Ž 103, 2 – 3)",
                    "Mýtnik stál celkom vzadu, bil sa do pŕs a hovoril: Bože, buď milostivý mne hriešnemu.", "(Lk 18, 13)"},
            {"40", "Raduj sa, Jeruzalem, zhromaždite sa všetci, čo ho milujete; radujte sa a jasajte, čo ste trúchlili, plesajte a čerpajte z bohatých zdrojov útechy.", "(Porov. Iz 66, 10 – 11)",
                    "Ak sa číta evanjelium o slepom od narodenia:<br>" +
                            "Pán mi potrel oči, šiel som, umyl som sa a vidím, a uveril som v Boha. Ak sa číta evanjelium o márnotratnom synovi: " +
                            "(Lk 15, 32)<br>" +
                            "Syn môj, patrí sa ti radovať, lebo tvoj brat bol mŕtvy, a ožil, bol stratený, a našiel sa.<br>" +
                            "Ak sa číta iné evanjelium: " +
                            "(Porov. Ž 122, 3 – 4)<br>" +
                            "Jeruzalem je vystavaný ako mesto spojené v jeden celok. Tam prichádzajú kmene, kmene Pánove, aby velebili meno Pánovo.", "(Porov. Jn 9, 11. 38) "},
            {"41", "Ja dúfam v Pána; plesám a teším sa, že si milosrdný, lebo si zhliadol na moju poníženosť.", "(Porov. Ž 31, 7 – 8)",
                    "Vložím do vás svojho ducha a spôsobím, že budete kráčať podľa mojich príkazov, že budete zachovávať a plniť moje výroky, hovorí Pán.", "(Ez 36, 27)"},
            {"42", "Poďte k vodám všetci, čo ste smädní, hovorí Pán; nech príde aj ten, čo nemá peniaze. Poďte a pite s radosťou.", "(Porov. Iz 55, 1)",
                    "Pán je môj pastier, nič mi nechýba: pasie ma na zelených pašienkach. Vodí ma k tichým vodám, dušu mi osviežuje.", "(Porov. Ž 23, 1 – 2)"},
            {"43", "Ale ja, Pane, obraciam sa modlitbou k tebe v tomto čase milosti. Vypočuj ma, Bože, pre svoju veľkú dobrotu, pre svoju vernosť mi pomôž.", "(Ž 69, 14)",
                    "Boh neposlal Syna na svet, aby svet odsúdil, ale aby sa skrze neho svet spasil.", "(Jn 3, 17)"},
            {"44", "Nech sa radujú srdcia tých, čo hľadajú Pána. Hľadajte Pána a jeho moc, hľadajte vždy jeho tvár.", "(Porov. Ž 105, 3 – 4)",
                    "Svoj zákon vložím do ich vnútra a vpíšem ho do ich srdca; ja budem ich Bohom a oni budú mojím ľudom, hovorí Pán.", "(Jer 31, 33)"},
            {"45", "Pane, zachráň ma pre svoje meno a svojou mocou obráň moje právo. Bože, vyslyš moju modlitbu a vypočuj slová mojich úst.", "(Porov. Ž 54, 3 – 4)",
                    "V Kristovi máme vykúpenie, skrze jeho krv, odpustenie hriechov, podľa bohatstva jeho milosti.", "(Ef 1, 7)"},
            {"46", "Obkľúčilo ma smrtiace vlnobitie, ovinuli ma povrazy záhrobia. V úzkosti som vzýval Pána, zo svojho chrámu počul môj hlas.", "(Porov. Ž 18, 5 – 7)",
                    "Vykúpení sme drahou krvou Krista, bezúhonného a nepoškvrneného Baránka.", "(Porov. 1 Pt 1, 18 – 19)"},
            {"50", "Súď ma, Bože, a rozhodni môj spor s neverným ľudom; zachráň ma pred zločincom a úskočným človekom. Veď ty, Bože, si moje útočisko.", "(Porov. Ž 43, 1 – 2)",
                    "Ak sa číta evanjelium o Lazárovi: <br>" +
                            "Nik, kto žije a verí vo mňa, neumrie naveky, hovorí Pán.<br>" +
                            "Ak sa číta evanjelium o cudzoložnej žene: <br>" +
                            "(Jn 8, 10 – 11)<br>" +
                            "Žena, nik ťa neodsúdil? Nik, Pane. Ani ja ťa neodsudzujem. Choď a už nehreš! <br>" +
                            "Ak sa číta iné evanjelium: <br>" +
                            "(Jn 12, 24 – 25)<br>" +
                            "Veru, veru, hovorím vám: ak pšeničné zrno nepadne do zeme a neodumrie, ostane samo; ale ak odumrie, prinesie veľkú úrodu.", "(Jn 11, 36)"},
            {"51", "Zmiluj sa nado mnou, Pane, lebo ma prenasleduje človek, každodenne ma napáda a utláča.", "(Porov. Ž 56, 2)",
                    "Ak sa číta evanjelium o cudzoložnej žene: <br>" +
                            "Žena, nik ťa neodsúdil? Nik, Pane. Ani ja ťa neodsudzujem. Choď a už nehreš!<br>" +
                            "Ak sa číta iné evanjelium: <br>" +
                            "(Jn 8, 12)<br>" +
                            "Ja som svetlo sveta, hovorí Pán; kto mňa nasleduje, nebude chodiť vo tmách, ale bude mať svetlo života.", "(Jn 8, 10 – 11)"},
            {"52", "Očakávaj Pána a buď statočný; srdce maj silné a drž sa Pána.", "(Ž 27, 14)",
                    "Až budem vyzdvihnutý od zeme, všetkých pritiahnem k sebe, hovorí Pán.", "(Jn 12, 32)"},
            {"53", "Pane, ty si ma oslobodil od zlostných nepriateľov. Povýšil si ma nad mojich odporcov a vytrhol si ma z rúk násilníka.", "(Porov. Ž 18, 48 – 49)",
                    "Boh nás preniesol do kráľovstva svojho milovaného Syna, v ktorom máme vykúpenie, odpustenie hriechov.", "(Kol 1, 13 – 14)"},
            {"54", "Kristus je prostredníkom novej zmluvy, aby skrze smrť dostali všetci povolaní prisľúbenie večného dedičstva.", "(Porov. Hebr 9, 15)",
                    "Boh vlastného Syna neušetril, ale vydal ho za nás všetkých; a s ním nám daroval aj všetko ostatné.", "(Rim 8, 32)"},
            {"55", "Zmiluj sa, Bože, nado mnou, lebo som v súžení, vytrhni ma z rúk mojich nepriateľov a prenasledovateľov. Pane, nech nie som zahanbený, veď teba vzývam.", "(Ž 31, 10. 16. 18)",
                    "Ježiš vyniesol naše hriechy na svojom tele na drevo, aby sme zomreli hriechu a žili pre spravodlivosť; jeho rany nás uzdravili.", "(1 Pt 2, 24)"},
            {"56", "Pane, nevzďaľuj sa odo mňa; ty, moja sila, ponáhľaj sa mi na pomoc. Veď ja som červ, a nie človek, ľuďom som na posmech a davu na opovrhnutie.", "(Porov. Ž 22, 20. 7)",
                    "Kristus bol vydaný, aby zhromaždil vedno rozptýlené Božie deti.", "(Porov. Jn 11, 52)"},
            {"60", "Šesť dní pred Veľkou nocou,<br>" +
                    "keď Ježiš prichádzal do Jeruzalema,<br>" +
                    "išli mu v ústrety deti s palmovými ratolesťami v rukách<br>" +
                    "a nadšene volali: <br>" +
                    "<font color='#B71C1C'>*</font> Hosanna na výsostiach!<br>" +
                    "Požehnaný, ktorý prináša milosrdenstvo a spásu.<br>" +
                    "Zdvihnite, brány, svoje hlavice<br>" +
                    "a vyvýšte sa, brány prastaré,<br>" +
                    "lebo má vstúpiť kráľ slávy.<br>" +
                    "Kto je ten kráľ slávy?<br>" +
                    "Pán zástupov, to je ten kráľ slávy.<br>" +
                    "<font color='#B71C1C'>*</font> Hosanna na výsostiach!<br>" +
                    "Požehnaný, ktorý prináša milosrdenstvo a spásu.", "(Porov. Jn 12, 1. 12 – 13; Ž 24, 9 – 10)",
                    "Otče môj, ak ma tento kalich nemôže minúť <br>" +
                            "a musím ho piť, nech sa stane tvoja vôľa.", "(Mt 26, 42)"},
            {"61", "Pane, odsúď tých, čo mňa odsudzujú, napadni tých, čo mňa napádajú. Vezmi zbroj a štít a vstaň mi na pomoc, Pane, moja sila a záštita.", "(Porov. Ž 35, 1 – 2; Ž 140, 8)",
                    "Neskrývaj svoju tvár predo mnou; v deň môjho súženia nakloň ku mne svoj sluch; kedykoľvek ťa budem vzývať, čím skôr ma vypočuj.", "(Porov. Ž 102, 3)"},
            {"62", "Pane, nevydávaj ma zvoli utláčateľov, veď povstali proti mne kriví svedkovia, dychtiví po násilí.", "(Porov. Ž 27, 12)",
                    "Boh vlastného Syna neušetril, ale vydal ho za nás všetkých.", "(Rim 8, 32)"},
            {"63", "Nech sa na meno Ježiš zohne každé koleno v nebi, na zemi i v podsvetí, lebo Pán sa stal poslušným až na smrť, až na smrť na kríži. Preto je Pán Ježiš Kristus v sláve Boha Otca.", "(Porov. Flp 2, 10. 8. 11)",
                    "Syn človeka neprišiel dať sa obsluhovať, ale slúžiť a položiť svoj život ako výkupné za mnohých.", "(Mt 20, 28)"},

    };

    String[][] velkanocSpev = {
            {"10", "Vstal som z mŕtvych a stále som pri tebe, aleluja;<br>" +
                    "kladieš na mňa svoju ruku, aleluja;<br>" +
                    "obdivuhodná pre mňa je tvoja múdrosť, aleluja, aleluja.<br>" +
                    "<font color='#B71C1C'>Alebo: (Lk 24, 34; porov. Zjv 1, 6)</font><br>" +
                    "Pán naozaj vstal z mŕtvych, aleluja.<br>" +
                    "Jemu sláva a vláda po všetky veky vekov, aleluja, aleluja.", "(Porov. Ž 139, 18. 5 – 6)",
                    "Bol obetovaný náš veľkonočný Baránok, Kristus;<br>" +
                            "preto slávme sviatky s nekvaseným chlebom čistoty a pravdy, aleluja.", "(1 Kor 5, 7 – 8)"},
            {"11", "Pán vás priviedol do krajiny, ktorá oplýva mliekom a medom,<br>" +
                    "aby bol Pánov zákon stále vo vašich ústach, aleluja.<br>" +
                    "<font color='#B71C1C'>Alebo:</font><br>" +
                    "Pán vstal z mŕtvych, ako povedal;<br>" +
                    "radujme sa všetci a plesajme, lebo on naveky kraľuje, aleluja.", "(Ex 13, 5. 9)",
                    "Kristus vzkriesený z mŕtvych už neumiera, smrť nad ním už nepanuje, aleluja.", "(Rim 6, 9)"},
            {"12", "Vodou múdrosti ich napojil; spevnie v ňom, takže sa nezohne, a povýši ich naveky, aleluja.", "(Porov. Sir 15, 3 – 4)",
                    "Ak ste s Kristom vstali z mŕtvych, hľadajte, čo je hore, kde Kristus sedí po pravici Boha; myslite na to, čo je hore, aleluja.", "(Kol 3, 1 – 2)"},
            {"13", "Poďte, požehnaní môjho Otca, zaujmite kráľovstvo, ktoré je pre vás pripravené od stvorenia sveta, aleluja.", "(Porov. Mt 25, 34)",
                    "Učeníci spoznali Pána Ježiša pri lámaní chleba, aleluja.", "(Porov. Lk 24, 35)"},
            {"14", "Svorne velebili tvoju víťaznú ruku, Pane, lebo múdrosť otvorila ústa nemým a rozviazala jazyk maličkým, aleluja.", "(Múd 10, 20 – 21)",
                    "Ľud určený na vlastníctvo, zvestuj slávne skutky toho, ktorý vás z tmy povolal do svojho obdivuhodného svetla, aleluja.", "(Porov. 1 Pt 2, 9)"},
            {"15", "Pán viedol svoj ľud bezpečne, ich nepriateľov však more pokrylo, aleluja.", "(Porov. Ž 78, 53)",
                    "Ježiš povedal svojim učeníkom: Poďte jesť! Vzal chlieb a dával im, aleluja.", "(Porov. Jn 21, 12 – 13)"},
            {"16", "Pán viedol svoj ľud v radosti vyvolených svojich s plesaním, aleluja.", "(Ž 105, 43)",
                    "Všetci, čo ste pokrstení v Kristovi, Krista ste si obliekli, aleluja.", "(Gal 3, 27)"},
            {"20", "Ako novonarodené deti túžte po nefalšovanom duchovnom mlieku, aby ste od neho rástli na spásu, aleluja.<br>" +
                    "<font color='#B71C1C'>Alebo: (4 Ezd 2, 36 – 37)</font><br>" +
                    "Radujte sa zo svojej slávy a vzdávajte vďaky Bohu, že vás povolal do nebeského kráľovstva, aleluja.", "(1 Pt 2, 2)",
                    "Vystri ruku a dotkni sa rán po klincoch a nebuď neveriaci, ale veriaci, aleluja.", "(Porov. Jn 20, 27)"},
            {"21", "Kristus vzkriesený z mŕtvych už neumiera, smrť nad ním už nepanuje, aleluja.", "(Rim 6, 9)",
                    "Ježiš si stal doprostred svojich učeníkov a povedal im: Pokoj vám, aleluja.", "(Jn 20, 19)"},
            {"22", "Radujme sa a plesajme, vzdávajme Bohu slávu, lebo začal kraľovať Pán, náš všemohúci Boh, aleluja.", "(Zjv 19, 7. 6)",
                    "Mesiáš musel trpieť a vstať z mŕtvych, a tak vojsť do svojej slávy, aleluja.", "(Porov. Lk 24, 46. 26)"},
            {"23", "Budem ťa, Pane, velebiť medzi národmi; tvoje meno chcem zvestovať svojim bratom, aleluja.", "(Porov. Ž 18, 50; 22, 23)",
                    "Pán hovorí: Ja som si vás vyvolil zo sveta a ustanovil som vás, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo, aleluja.", "(Porov. Jn 15, 16. 19)"},
            {"24", "Bože, keď si kráčal na čele svojho ľudu, kliesnil si mu cestu a býval si s ním; zem sa zatriasla a rozpršala sa obloha, aleluja.", "(Porov. Ž 68, 8 – 9. 20)",
                    "Hľa, ja som s vami po všetky dni až do skončenia sveta, aleluja.", "(Mt 28, 20)"},
            {"25", "Vykúpil si nás svojou krvou, Pane, ľudí z každého kmeňa, jazyka, ľudu a národa a urobil si nás kráľovstvom a kňazmi nášmu Bohu, aleluja.", "(Zjv 5, 9 – 10)",
                    "Kristus, náš Pán, bol vydaný za naše hriechy a vzkriesený pre naše ospravedlnenie, aleluja.", "(Rim 4, 25)"},
            {"26", "Ľud určený na vlastníctvo, zvestuj slávne skutky toho, ktorý ťa z tmy povolal do svojho obdivuhodného svetla, aleluja.", "(Porov. 1 Pt 2, 9)",
                    "Otče, chcem, aby aj tí, ktorých si mi dal, boli so mnou tam, kde som ja, aby videli moju slávu, ktorú si mi dal, aleluja.", "(Jn 17, 24)"},
            {"30", "Jasaj Bohu, celá zem, hrajte a spievajte na slávu jeho mena, vzdávajte mu chválu, aleluja.", "(Porov. Ž 66, 1 – 2)",
                    "Rok A<br>" +
                            "Učeníci spoznali Pána Ježiša pri lámaní chleba, aleluja.<br>" +
                            "Rok B<br>" +
                            "(Lk 24, 46 – 47)<br>" +
                            "Mesiáš musel trpieť a tretieho dňa vstať z mŕtvych;<br>" +
                            "v jeho mene sa bude všetkým národom<br>" +
                            "hlásať pokánie na odpustenie hriechov, aleluja.<br>" +
                            "Rok C<br>" +
                            "(Porov. Jn 21, 12 – 13)<br>" +
                            "Ježiš povedal svojim učeníkom: Poďte jesť. Potom vzal chlieb a dával im, aleluja.", "(Lk 24, 35) "},
            {"31", "Vstal z mŕtvych Dobrý pastier, ktorý dal svoj život za svoje ovce a ochotne umrel za svoje stádo, aleluja.", "",
                    "Pokoj vám zanechávam, svoj pokoj vám dávam; ale ja vám nedávam, ako svet dáva, hovorí Pán, aleluja.", "(Jn 14, 27)"},
            {"32", "Chváľte nášho Boha všetci, čo sa ho bojíte, malí i veľkí, lebo nastala spása, moc a vláda jeho Pomazaného, aleluja.", "(Zjv 19, 5; 12, 10)",
                    "Ak sme zomreli s Kristom, veríme, že s ním budeme aj žiť, aleluja.", "(Rim 6, 8)"},
            {"33", "Nech sa mi ústa naplnia tvojou oslavou a nech ťa velebím deň čo deň; jasať budú moje pery, keď ti zaspievam, aleluja.", "(Porov. Ž 71, 8. 23)",
                    "Pán vstal z mŕtvych a zažiaril nám, vykúpil nás svojou krvou, aleluja.", ""},
            {"34", "Spievajme Pánovi, lebo sa preslávil. Pán je moja sila a moja udatnosť, on ma zachránil, aleluja.", "(Porov. Ex 15, 1 – 2)",
                    "Kristus zomrel za všetkých, aby aj tí, čo žijú, už nežili pre seba, ale pre toho, ktorý za nich zomrel a vstal z mŕtvych, aleluja.", "(2 Kor 5, 15)"},
            {"35", "Hoden je Baránok, ktorý bol zabitý, prijať moc, bohatstvo a múdrosť, silu a česť, aleluja.", "(Zjv 5, 12)",
                    "Ukrižovaný vstal z mŕtvych a vykúpil nás, aleluja.", ""},
            {"36", "S Kristom ste boli pochovaní v krste a v ňom ste boli s ním aj vzkriesení vierou v moc Boha, ktorý ho vzkriesil z mŕtvych, aleluja.", "(Kol 2, 12)",
                    "Otče, prosím za nich, aby aj oni boli v nás jedno, aby svet uveril, že si ma ty poslal, hovorí Pán, aleluja.", "(Jn 17, 20 – 21)"},
            {"40", "Milosti Pánovej plná je zem; Pánovým slovom povstali nebesia, aleluja.", "(Porov. Ž 33, 5. 6)",
                    "Dobrý pastier, ktorý dal život za svoje ovečky a neváhal za ne podstúpiť smrť na kríži,<br>" +
                            "vstal z mŕtvych, aleluja.", ""},
            {"41", "Kristus vzkriesený z mŕtvych už neumiera, smrť nad ním už nepanuje, aleluja.", "(Rim 6, 9)",
                    "Ježiš si stal doprostred svojich učeníkov a povedal im: Pokoj vám, aleluja.", "(Jn 20, 19)"},
            {"42", "Radujme sa a plesajme, vzdávajme Bohu slávu, lebo začal kraľovať Pán, náš všemohúci Boh, aleluja.", "(Zjv 19, 7. 6)",
                    "Mesiáš musel trpieť a vstať z mŕtvych, a tak vojsť do svojej slávy, aleluja.", "(Porov. Lk 24, 46. 26)"},
            {"43", "Budem ťa, Pane, velebiť medzi národmi; tvoje meno chcem zvestovať svojim bratom, aleluja.", "(Porov. Ž 18, 50; 22, 23)",
                    "Pán hovorí: Ja som si vás vyvolil zo sveta a ustanovil som vás, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo, aleluja.", "(Porov. Jn 15, 16. 19)"},
            {"44", "Bože, keď si kráčal na čele svojho ľudu, kliesnil si mu cestu a býval si s ním; zem sa zatriasla a rozpršala sa obloha, aleluja.", "(Porov. Ž 68, 8 – 9. 20)",
                    "Hľa, ja som s vami po všetky dni až do skončenia sveta, aleluja.", "(Mt 28, 30)"},
            {"45", "Vykúpil si nás svojou krvou, Pane, ľudí z každého kmeňa, jazyka, ľudu a národa a urobil si nás kráľovstvom a kňazmi nášmu Bohu, aleluja.", "(Zjv 5, 9 – 10)",
                    "Kristus, náš Pán, bol vydaný za naše hriechy a vzkriesený pre naše ospravedlnenie, aleluja.", "(Rim 4, 25)"},
            {"46", "Ľud určený na vlastníctvo, zvestujte slávne skutky toho, ktorý vás z tmy povolal do svojho obdivuhodného svetla, aleluja.", "(Porov. 1 Pt 2, 9)",
                    "Otče, chcem, aby aj tí, ktorých si mi dal, boli so mnou tam, kde som ja, aby videli moju slávu, ktorú si mi dal, aleluja.", "(Jn 17, 24)"},
            {"50", "Spievajte Pánovi pieseň novú, lebo vykonal veci zázračné; pred očami pohanov vyjavil svoju spravodlivosť, aleluja.", "(Porov. Ž 98, 1 – 2)",
                    "Ja som pravý vinič, vy ste ratolesti, hovorí Pán; kto ostáva vo mne a ja v ňom, prináša veľa ovocia, aleluja.", "(Jn 15, 1. 5)"},
            {"51", "Vstal z mŕtvych Dobrý pastier, ktorý dal život za svoje ovce, a ochotne umrel za svoje stádo, aleluja.", "",
                    "Pokoj vám zanechávam, svoj pokoj vám dávam; ale ja vám nedávam, ako svet dáva, hovorí Pán, aleluja.", "(Jn 14, 27)"},
            {"52", "Chváľte nášho Boha všetci, čo sa ho bojíte, malí i veľkí, lebo nastala spása, moc a vláda jeho Pomazaného, aleluja.", "(Zjv 19, 5; 12, 10)",
                    "Ak sme zomreli s Kristom, veríme, že s ním budeme aj žiť, aleluja.", "(Rim 6, 8)"},
            {"53", "Nech sa mi ústa naplnia tvojou oslavou a nech ťa velebím deň čo deň; jasať budú moje pery, keď ti zaspievam, aleluja.", "(Porov. Ž 71, 8. 23)",
                    "Pán vstal z mŕtvych a zažiaril nám, vykúpil nás svojou krvou, aleluja.", ""},
            {"54", "Spievajme Pánovi, lebo sa preslávil. Pán je moja sila a moja udatnosť, on ma zachránil, aleluja.", "(Porov. Ex 15, 1 – 2)",
                    "Kristus zomrel za všetkých, aby aj tí, čo žijú, už nežili pre seba, ale pre toho, ktorý za nich zomrel a vstal z mŕtvych, aleluja.", "(2 Kor 5, 15)"},
            {"55", "Hoden je Baránok, ktorý bol zabitý, prijať moc, bohatstvo a múdrosť, silu a česť, aleluja.", "(Zjv 5, 12)",
                    "Ukrižovaný vstal z mŕtvych a vykúpil nás, aleluja.", ""},
            {"56", "S Kristom ste boli pochovaní v krste a v ňom ste boli s ním aj vzkriesení vierou v moc Boha, ktorý ho vzkriesil z mŕtvych, aleluja.", "(Kol 2, 12)",
                    "Otče, prosím za nich, aby aj oni boli v nás jedno, aby svet uveril, že si ma ty poslal, hovorí Pán, aleluja.", "(Jn 17, 20 – 21)"},
            {"60", "Nadšene ohlasujte, aby to bolo počuť, zvestujte to až po kraj zeme; Pán vyslobodil svoj ľud, aleluja.", "(Porov. Iz 48, 20)",
                    "Ak ma milujete, budete zachovávať moje prikázania, hovorí Pán. A ja poprosím Otca a on vám dá iného Tešiteľa, aby zostal s vami naveky, aleluja.", "(Jn 14, 15 – 16)"},
            {"61", "Kristus vzkriesený z mŕtvych už neumiera, smrť nad ním už nepanuje, aleluja.", "(Rim 6, 9)",
                    "Ježiš si stal doprostred svojich učeníkov a povedal im: Pokoj vám, aleluja.", "(Jn 20, 19)"},
            {"62", "Radujme sa a plesajme, vzdávajme Bohu slávu, lebo začal kraľovať Pán, náš všemohúci Boh, aleluja.", "(Zjv 19, 7. 6)",
                    "Mesiáš musel trpieť a vstať z mŕtvych, a tak vojsť do svojej slávy, aleluja.", "(Porov. Lk 24, 46. 26)"},
            {"63", "Budem ťa, Pane, velebiť medzi národmi; tvoje meno chcem zvestovať svojim bratom, aleluja.", "(Porov. Ž 18, 50; 22, 23)",
                    "Pán hovorí: Ja som si vás vyvolil zo sveta a ustanovil som vás, aby ste išli a prinášali ovocie a aby vaše ovocie zostalo, aleluja.", "(Porov. Jn 15, 16. 19)"},
            {"64", "Bože, keď si kráčal na čele svojho ľudu, kliesnil si im cestu a býval si s nimi; zem sa zatriasla a rozpršala sa aj obloha, aleluja.", "(Porov. Ž 68, 8 – 9. 20)",
                    "Hľa, ja som s vami po všetky dni až do skončenia sveta, aleluja.", "(Mt 28, 20)"},
            {"65", "Vykúpil si nás svojou krvou, Pane, ľudí z každého kmeňa, jazyka, ľudu a národa a urobil si nás kráľovstvom a kňazmi nášmu Bohu, aleluja.", "(Zjv 5, 9 – 10)",
                    "Kristus, náš Pán, bol vydaný za naše hriechy a vzkriesený pre naše ospravedlnenie, aleluja.", "(Rim 4, 25)"},
            {"66", "Ľud určený na vlastníctvo, zvestuj slávne skutky toho, ktorý ťa z tmy povolal do svojho obdivuhodného svetla, aleluja.", "(Porov. 1 Pt 2, 9)",
                    "Otče, chcem, aby aj tí, ktorých si mi dal, boli so mnou tam, kde som ja, aby videli moju slávu, ktorú si mi dal, aleluja.", "(Jn 17, 24)"},
            {"70", "Čuj, Pane, hlas môjho volania. V srdci mi znejú tvoje slová: Hľadajte moju tvár. Pane, ja hľadám tvoju tvár; neodvracaj svoju tvár odo mňa, aleluja.", "(Porov. Ž 27, 7 – 9)",
                    "Otče, prosím ťa, aby boli jedno, ako sme my jedno, aleluja.", "(Jn 17, 22)"},
            {"71", "Dostanete silu Ducha Svätého, ktorý na vás zostúpi; a budete mi svedkami až po samý kraj zeme, aleluja.", "(Sk 1, 8)",
                    "Nenechám vás ako siroty, hovorí Pán: zasa k vám prídem, a vaše srdce sa bude radovať, aleluja.", "(Jn 14, 18; 16, 22)"},
            {"72", "Ja som Prvý a Posledný a Živý. Bol som mŕtvy, a hľa, žijem na veky vekov, aleluja.", "(Zjv 1, 17 – 18)",
                    "Duch Svätý, ktorého pošle Otec v mojom mene, naučí vás všetko a pripomenie vám všetko, čo som vám povedal, hovorí Pán, aleluja.", "(Jn 14, 26)"},
            {"73", "Tlieskajte rukami, všetky národy, jasajte Bohu hlasom radostným, aleluja.", "(Ž 47, 2)",
                    "Keď príde Tešiteľ, ktorého vám ja pošlem, Duch pravdy, ktorý vychádza od Otca, on o mne vydá svedectvo. Aj vy vydávate svedectvo, hovorí Pán, aleluja.", "(Jn 15, 26 – 27)"},
            {"74", "Pristupujme s dôverou k trónu milosti, aby sme dosiahli milosrdenstvo a našli milosť  a pomoc v pravom čase, aleluja.", "(Hebr 4, 16)",
                    "Hovorím vám pravdu: Je pre vás osožnejšie, aby som odišiel; lebo ak neodídem, Tešiteľ k vám nepríde, hovorí Pán, aleluja.", "(Jn 16, 7)"},
            {"75", "Kristus nás miluje a svojou krvou nás oslobodil od hriechov a urobil nás kráľovstvom, kňazmi Bohu a svojmu Otcovi, aleluja.", "(Zjv 1, 5 – 6)",
                    "Keď príde Duch pravdy, uvedie vás do plnej pravdy, hovorí Pán, aleluja.", "(Jn 16, 13)"},
            {"76", "Učeníci jednomyseľne zotrvávali na modlitbách spolu so ženami, s Ježišovou matkou Máriou a jeho bratmi, aleluja.", "(Sk 1, 14)",
                    "Duch Svätý ma oslávi, lebo z môjho vezme a zvestuje vám, hovorí Pán, aleluja.", "(Jn l6, 14)"},
    };

    String[][] adventSpev = {
            {"10", "K tebe, Pane, dvíham svoju dušu, tebe dôverujem, Bože môj. Nech nie som zahanbený a nech moji nepriatelia nejasajú nado mnou. Veď nik, čo dúfa v teba, nebude zahanbený.", "(Porov. Ž 25, 1 – 3)",
                    "Pán dá požehnanie a svoje plody vydá naša zem.", "(Ž 85, 13)"},
            {"11", "Čujte, národy, slovo Pánovo a ohlasujte ho až do končín zeme: náš Spasiteľ príde, nebojte sa!", "(Porov. Jer 31, 10; Iz 35, 4)",
                    "Príď, Pane, a navštív nás svojím pokojom, aby sme sa radovali pred tebou celým srdcom.", "(Porov. Ž 106, 4 – 5; Iz 38, 3)"},
            {"12", "Hľa, Pán príde a s ním všetci jeho svätí; a v ten deň zažiari veľké svetlo.", "(Porov. Zach 14, 5. 7)",
                    "Spravodlivý sudca dá veniec spravodlivosti tým, čo milujú jeho príchod.", "(Porov. 2 Tim 4, 8)"},
            {"13", "Pán príde, nebude meškať; osvetlí, čo je skryté v tme, a dá sa poznať všetkým národom.", "(Porov. Hab 2, 3; 1 Kor 4, 5)",
                    "Hľa, náš Pán prichádza so všetkou mocou a otvorí oči svojich služobníkov.", "(Porov. Iz 40, 10; 35, 5)"},
            {"14", "Blízko si, Pane, a všetky tvoje predpisy sú pravdivé. Odprvoti viem z tvojich prikázaní, že si večný.", "(Porov. Ž 119, 151 – 152)",
                    "Žime na tomto svete spravodlivo a nábožne a očakávajme blahoslavenú nádej a príchod slávy veľkého Boha.", "(Porov. Tít 2, 12 – 13)"},
            {"15", "Hľa, Pán príde v jase, navštívi svoj ľud v pokoji a dá mu večný život.", "",
                    "Očakávame Spasiteľa, Pána Ježiša Krista; on pretvorí naše úbohé telo, aby sa stalo podobným jeho oslávenému telu.", "(Porov. Flp 3, 20 – 21)"},
            {"16", "Príď, Pane, čo tróniš nad cherubmi, rozjasni svoju tvár a budeme spasení.", "(Porov. Ž 80, 4. 2)",
                    "Hľa, prídem čoskoro, hovorí Pán, a moja odplata so mnou; odmením každého podľa jeho skutkov.", "(Porov. Zjv 22, 12)"},
            {"20", "Ľud Siona, hľa, Pán príde spasiť národy, ozve sa svojím velebným hlasom a vaše srdcia sa zaradujú.", "(Porov. Iz 30, 19. 30)",
                    "Povstaň, Jeruzalem, a postav sa na výšinu; a hľaď, aká radosť ti prichádza od tvojho Boha.", "(Bar 5, 5; 4, 36)"},
            {"21", "Čujte, národy, slovo Pánovo a ohlasujte ho až do končín zeme: náš Spasiteľ príde, nebojte sa.", "(Porov. Jer 31, 10; Iz 35, 4)",
                    "Príď, Pane, a navštív nás svojím pokojom, aby sme sa radovali pred tebou celým srdcom.", "(Porov. Ž 106, 4 – 5; Iz 38, 3)"},
            {"22", "Hľa, Pán príde a s ním všetci jeho svätí; a v ten deň zažiari veľké svetlo.", "(Porov. Zach 14, 5. 7 )",
                    "Spravodlivý sudca dá veniec spravodlivosti tým, čo milujú jeho príchod.", "(Porov. 2 Tim 4, 8)"},
            {"23", "Pán príde, nebude meškať; osvetlí, čo je skryté v tme, a dá sa poznať všetkým národom.", "(Porov. Hab 2, 3; 1 Kor 4, 5)",
                    "Hľa, náš Pán prichádza so všetkou mocou a otvorí oči svojich služobníkov.", "(Porov. Iz 40, 10; 35, 5)"},
            {"24", "Blízko si, Pane, a všetky tvoje predpisy sú pravdivé. Odprvoti viem z tvojich prikázaní, že si večný.", "(Porov. Ž 119, 151 – 152)",
                    "Žime na tomto svete spravodlivo a nábožne a očakávajme blahoslavenú nádej a príchod slávy veľkého Boha.", "(Porov. Tít 2, 12 – 13)"},
            {"25", "Hľa, Pán príde v jase, navštívi svoj ľud v pokoji a dá mu večný život.", "",
                    "Očakávame Spasiteľa, Pána Ježiša Krista; on pretvorí naše úbohé telo, aby sa stalo podobným jeho oslávenému telu.", "(Porov. Flp 3, 20 – 21)"},
            {"26", "Príď, Pane, čo tróniš nad cherubmi, rozjasni svoju tvár, a budeme spasení.", "(Porov. Ž 80, 4. 2)",
                    "Hľa, prídem čoskoro, hovorí Pán, a moja odplata so mnou, odmením každého podľa jeho skutkov.", "(Porov. Zjv 22, 12)"},
            {"30", "Ustavične sa radujte v Pánovi! Opakujem: Radujte sa! Pán je blízko.", "(Flp 4, 4 – 5)",
                    "Povedzte: Malomyseľní, vzchopte sa, nebojte sa! Hľa, náš Boh príde a spasí nás.", "(Porov. Iz 35, 4)"},
            {"31", "Čujte, národy, slovo Pánovo a ohlasujte ho až do končín zeme: náš Spasiteľ príde, nebojte sa.", "(Porov. Jer 31, 10; Iz 35, 4)",
                    "Príď, Pane, a navštív nás svojím pokojom; aby sme sa radovali pred tebou celým srdcom.", "(Porov. Ž 106, 4 – 5; Iz 38, 3)"},
            {"32", "Hľa, Pán príde a s ním všetci jeho svätí; a v ten deň zažiari veľké svetlo.", "(Porov. Zach 14, 5. 7)",
                    "Spravodlivý sudca dá veniec spravodlivosti tým, čo milujú jeho príchod.", "(Porov. 2 Tim 4, 8)"},
            {"33", "Pán príde, nebude meškať; osvetlí, čo je skryté v tme, a dá sa poznať všetkým národom.", "(Porov. Hab 2, 3; 1 Kor 4, 5)",
                    "Hľa, náš Pán prichádza so všetkou mocou a otvorí oči svojich služobníkov.", "(Porov. Iz 40, 10; 35, 5)"},
            {"34", "Blízko si, Pane, a všetky tvoje predpisy sú pravdivé. Odprvoti viem z tvojich prikázaní, že si večný.", "(Porov. Ž 119, 151 – 152)",
                    "Žime na tomto svete spravodlivo a nábožne a očakávajme blahoslavenú nádej a príchod slávy veľkého Boha.", "(Porov. Tít 2, 12 – 13)"},
            {"35", "Hľa, Pán príde v jase, navštívi svoj ľud v pokoji a dá mu večný život.", "",
                    "Očakávame Spasiteľa, Pána Ježiša Krista; on pretvorí naše úbohé telo, aby sa stalo podobným jeho oslávenému telu.", "(Porov. Flp 3, 20 – 21)"},
            {"40", "Roste, nebesia, z výsosti, z oblakov nech prší spravodlivosť. Nech sa otvorí zem a zrodí Spasiteľa!", "(Porov. Iz 45, 8)",
                    "Hľa, Panna počne a porodí syna a dá mu meno Emanuel.", "(Iz 7, 14)"},
    };

    String[][] vianoceSpev = {
            //DRUHÁ NEDEĽA PO NARODENÍ PÁNA
            {"0", "Keď všade vládlo hlboké ticho a noc v svojom behu prešla polovicu cesty, tvoje všemohúce slovo, Pane, zostúpilo z neba, z kráľovského trónu.", "(Múd 18, 14 – 15)",
                    "Tým, ktorí ho prijali, dal moc stať sa Božími deťmi.", "(Porov. Jn 1, 12)"},
            //VŠEDNÉ DNI VIANOCNÉHO OBDOBIA
            {"1", "Posvätný deň nám zažiaril; poďte, národy, a klaňajte sa Pánovi, lebo na zem zostúpilo veľké svetlo.", "",
                    "Uvideli sme jeho slávu, slávu, akú má od Otca jednorodený Syn, plný milosti a pravdy.", "(Jn 1, 14)"},
            {"2", "Požehnaný, ktorý prichádza v mene Pánovom. Boh, Pán, je naším svetlom.", "(Ž 118, 26 – 27)",
                    "Boh pre svoju nesmiernu lásku, ktorou nás miluje, poslal svojho Syna v tele podobnom hriešnemu.", "(Porov. Ef 2, 4; Rim 8, 3)"},
            {"3", "Ľud, čo kráčal v tmách, uzrel veľké svetlo; nad tými, čo bývajú v krajine temnôt, zažiarilo svetlo.", "(Porov. Iz 9, 1)",
                    "Život, ktorý bol u Otca, zjavil sa nám.", "(1 Jn 1, 2)"},
            {"4", "Na počiatku a pred vekmi bol Boh Slovom a láskavo sa narodil ako Spasiteľ sveta.", "(Porov. Jn 1, 1)",
                    "Boh tak miloval svet, že dal svojho jednorodeného Syna, aby nezahynul nik, kto v neho verí, ale aby mal večný život.", "(Jn 3, 16)"},
            {"5", "Spravodlivým žiari svetlo v temnotách: Milosrdný, milostivý a spravodlivý Pán.", "(Ž 112, 4)",
                    "Božia láska k nám sa prejavila v tom, že Boh poslal svojho jednorodeného Syna na svet, aby sme skrze neho mali život.", "(1 Jn 4, 9)"},
            {"6", "Boh poslal svojho Syna, narodeného zo ženy, aby sme dostali adoptívne synovstvo.", "(Gal 4, 4 – 5)",
                    "Z jeho plnosti sme my všetci dostali milosť za milosťou.", "(Jn 1, 16)"},
    };
}
