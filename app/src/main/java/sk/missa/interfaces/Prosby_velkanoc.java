package sk.missa.interfaces;

/*
 * Prosby vo veľkonočnom období uložené v dvojrozmernom poli - velkanocProsby
 * nedeľa: {týždeň vo veľkonočnom období+deň (napr. 2 týždeň v pondelok - 21), liturgický rok (A/B/C), názov spoločnej časti, úvodná výzva, odpoveď ľudu, úmysly, záverečná modlitba},
 * deň v týždni: {týždeň vo veľkonočnom období+deň, deň v týždni (1-pondelok, 2-utorok..., 6-sobota), názov spoločnej časti, úvodná výzva, odpoveď ľudu, úmysly, záverečná modlitba},
 */

public interface Prosby_velkanoc {
    String[][] velkanocProsby = {
            {"10", "A", "Bratia a sestry, v tento najväčší sviatok, keď slávime víťazstvo nášho Pána nad smrťou a pripomíname si svoje znovuzrodenie v krste, s dôverou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pre veľkonočnú obetu svojho Syna vyslyš nás, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Modlime sa za nášho pápeža <font color='#B71C1C'>M.</font>, za nášho biskupa <font color='#B71C1C'>M.</font> a za všetkých kňazov: Otče, naplň ich silou Ducha Svätého, aby s radosťou ohlasovali zmŕtvychvstanie tvojho Syna.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Modlime sa za všetkých pokrstených: Bože, zveľaďuj v nich nadprirodzený život, ktorý si im daroval v krste.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Modlime sa za všetky národy a ich predstavených: Pane, daj, nech všetci ľudia spoznajú, že ich Kristus svojou veľkonočnou obetou zmieril s Otcom.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Modlime sa za všetkých trpiacich a chorých: Otče, pomôž im z biedy a premeň ich utrpenie na radosť, ktorú im nikto nevezme.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Modlime sa za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: Bože, upevňuj našu vieru v zmŕtvychvstanie a prenikni nás duchom bratskej lásky.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Modlime sa za našich zosnulých <font color='#B71C1C'>(M.)</font>: Pane, daj, aby Kristovo víťazstvo nad smrťou bolo pre nich zárukou spásy.",
                    "Všemohúci večný Bože,<br>" +
                            "pre veľkonočnú obetu svojho Syna<br>" +
                            "vyslyš naše prosby a pomáhaj nám vnášať<br>" +
                            "veľkonočnú radosť do sŕdc všetkých ľudí.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "B", "Bratia a sestry, v radostnom svetle zmŕtvychvstania mysľou i srdcom predstúpme pred nášho nebeského Otca a prednesme mu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Modlime sa za Cirkev na celom svete, aby sa Kristovo víťazstvo nad hriechom a smrťou stalo jej silou v boji so zlom.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Modlime sa za našu vlasť, aby jej Vykupiteľovo zmŕtvychvstanie prinieslo plnosť pokoja.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Modlime sa za pokrstených počas týchto veľkonočných sviatkov, aby verne nasledovali Krista, v ktorého uverili.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Modlime sa za nás tu prítomných, aby viera v zmŕtvychvstalého Krista bola našou silou a nádejou.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Modlime sa za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby im Kristus dal účasť na veľkonočnom víťazstve.",
                    "Bože Otče,<br>" +
                            "oslavujeme zmŕtvychvstanie tvojho Syna;<br>" +
                            "prosíme ťa,<br>" +
                            "aby si vyslyšal naše dnešné prosby<br>" +
                            "a obnovil v nás milosť,<br>" +
                            "ktorú sme získali vo sviatosti krstu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"10", "C", "Bratia a sestry, zhromaždili sme sa vo sviatok Pánovho vzkriesenia, aby sme ako učeníci z Emauz dosvedčili prítomnosť Zmŕtvychvstalého a zúčastnili sa na lámaní chleba. S pokorou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosme za Svätého Otca <font color='#B71C1C'>M.</font>, za nášho biskupa <font color='#B71C1C'>M.</font>, za všetkých pastierov Cirkvi a za celý vykúpený ľud, aby posilnení Duchom Svätým zvestovali svetu veľkonočnú radosť z Kristovho víťazstva nad smrťou.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosme za tých, ktorí v týchto dňoch prijímajú sviatosť krstu, birmovania a Eucharistie, aby sa stali vernými učeníkmi Ježiša Krista.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosme o pokoj, ktorý dáva zmŕtvychvstalý Ježiš, aby neboli vo svete vojny, prenasledovanie a nenávisť a aby ľudia žili navzájom zmierení v pravde a láske.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosme za tých, ktorí sú na sklonku života, aby zjednocovali svoje utrpenie s ukrižovaným Ježišom a mali neochvejnú vieru v moc kríža.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosme za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby mali účasť na novom živote, ktorý nám Kristus vydobyl svojou smrťou a zmŕtvychvstaním.",
                    "Buď zvelebený, Pán neba i zeme,<br>" +
                            "za veľkonočné dielo svojho Syna,<br>" +
                            "skrze ktoré vraciaš ľuďom život;<br>" +
                            "zahrň svojou milosťou nás a všetkých,<br>" +
                            "ktorých ti zverujeme v tejto našej modlitbe.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"11", "1", "Bratia a sestry, skrze Ježiša Krista, nepoškvrneného Baránka, ktorý za nás zomrel a vstal z mŕtvych, pokorne prednesme svoje prosby nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Nebeský Otče, daj, aby Cirkev po celom svete slobodne a bez prekážok svedčila o zmŕtvychvstaní svojho Pána.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Všemohúci Bože, daj, aby sa všetky národy sveta tešili z pokoja, spravodlivosti a blahobytu.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Nevýslovný Bože, prosíme ťa za ľudí, ktorí ešte nepoznajú evanjelium, aby spoznali tvoju pravdu a lásku.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Láskavý Otče, daj, aby ľudia, ktorí stratili zmysel života, dokázali otvoriť svoje srdcia pre tvoje životodarné Slovo.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Dobrý Bože, daj, aby ženy a dievčatá <font color='#B71C1C'>(</font>našej farnosti<font color='#B71C1C'>)</font> mali v srdci horlivosť za Pána a pomáhali šíriť a zveľaďovať Kristovo kráľovstvo.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Milosrdný Bože, prosíme ťa, aby sme celým svojím životom vydávali svedectvo o zmŕtvychvstalom Ježišovi Kristovi.",
                    "Bože, všemohúci Otče, ty vypočuješ prosby tých,<br>" +
                            "ktorí sa s dôverou obracajú k tebe;<br>" +
                            "prosíme ťa, prijmi naše modlitby<br>" +
                            "a udeľ nám Ducha pravdy,<br>" +
                            "aby sme svedčili o zmŕtvychvstaní tvojho Syna,<br>" +
                            "ktorý s tebou žije a kraľuje na veky vekov."},
            {"12", "2", "Bratia a sestry, Kristus, poslušný vôli nebeského Otca, trpel a zomrel za naše hriechy, aby nám zaslúžil spásu a ukázal cestu do slávy. Preto s dôverou a pokorou prosme o potrebné milosti.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;S dôverou prosme za svätú Cirkev, aby posilnená Kristovým zmŕtvychvstaním odvážne ohlasovala víťazstvo života nad smrťou.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosme za spoločenstvá kresťanských cirkví, aby ich prežívanie veľkonočného tajomstva viedlo k vzájomnej úcte a jednote vo viere.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosme za tých, ktorí sa hriechom vzdialili od viery, aby Kristus vzbudil v ich srdciach nádej a túžbu po kresťanskom živote.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosme za nás tu prítomných, aby sme neustále žili v nádeji na stretnutie s Kristom v nebeskej sláve.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosme aj za tých, ktorí s nádejou na zmŕtvychvstanie prešli prahom večnosti, aby dosiahli odpustenie hriechov a večnú radosť spasených.",
                    "Bože, osvieť naše srdcia svetlom svojej pravdy,<br>" +
                            "prijmi naše prosby a daj,<br>" +
                            "aby náš život bol svedectvom pre tých,<br>" +
                            "ktorí ťa hľadajú.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"13", "3", "Bratia a sestry, aj my sme niekedy smutní a bezradní ako učeníci na ceste do Emauz. Obráťme sa so svojimi prosbami na Ježiša, ktorý nás sprevádza a posilňuje, a spoločne volajme:",
                    "<font color='#B71C1C'>(</font>Pane, zostaň s nami a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Modlime sa za Cirkev, ktorá ohlasuje radostnú zvesť evanjelia, aby sa nepoddala strachu z násilia páchaného vo svete.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Modlime sa za Svätého Otca <font color='#B71C1C'>M.</font>, aby ho Pán posilňoval v jeho službe pre dobro Cirkvi a sveta.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Modlime sa za mladých ľudí, aby im Pán odhalil krásu života v zhode s morálnymi zásadami a čistým svedomím.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Modlime sa za prenasledovaných pre Kristovo meno, aby nepodľahli mocným tohto sveta, ale statočne vytrvali až do konca.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Modlime sa za veriacich <font color='#B71C1C'>(</font>našej farnosti<font color='#B71C1C'>)</font>, aby čím viacerí pravidelne pristupovali k eucharistickému stolu.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Modlime sa za naše eucharistické zhromaždenie, aby vedelo rozpoznať Krista, ktorý je prítomný uprostred svojho ľudu.",
                    "Pane Ježišu,<br>" +
                            "veríme, že si s nami na našej pozemskej púti;<br>" +
                            "zostaň s nami a daj nám v čase pochybností a slabostí<br>" +
                            "pocítiť tvoju prítomnosť, ktorá nás posilní.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"14", "4", "Bratia a sestry, kedykoľvek slávime pamiatku Pánovej Poslednej večere, je s nami on sám, Zmŕtvychvstalý, ktorý sa za nás obetuje a prihovára u Otca. Preto mu s dôverou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, daruj nám svoj pokoj.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosme Pána za slobodu a pokoj pre Božiu Cirkev.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosme Pána za posilnenie viery neistých, pochybujúcich a ustráchaných.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosme Pána za oslobodenie nespravodlivo väznených a za potešenie zarmútených.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosme Pána za ohlasovateľov obrátenia, pokánia a odpustenia hriechov.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosme Pána za obete zemetrasení, povodní, požiarov a iných živelných pohrôm.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosme Pána za všetkých členov nášho <font color='#B71C1C'>(</font>farského<font color='#B71C1C'>)</font> spoločenstva.<br>" +
                            "<font color='#B71C1C'>7.</font>&nbsp;Prosme Pána za našich zosnulých príbuzných, priateľov a dobrodincov.",
                    "Pane Ježišu Kriste,<br>" +
                            "prijmi naše prosby,<br>" +
                            "nech je pre nás tvoje zmŕtvychvstanie nádejou<br>" +
                            "vo všednosti a v sklamaniach každodenného života,<br>" +
                            "aby sme ti zostali verní naveky.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"15", "5", "Bratia a sestry, pri každom stretnutí so zmŕtvychvstalým Kristom môžeme vnímať, že sa naďalej stará o chlieb a istotu pre svojich učeníkov a aj nás chce posilňovať v ťažkostiach každodenného života. Prosme ho teda s dôverou.",
                    "<font color='#B71C1C'>(</font>Volajme: Syn živého Boha, požehnaj svoj ľud.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosíme ťa, Kriste, za duchovných pastierov tvojej Cirkvi, nech lámu bratom a sestrám chlieb života a nech sa ním aj sami živia a posilňujú.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosíme ťa za všetok kresťanský ľud, aby žil dôstojne podľa svojho povolania a zachovával jednotu ducha vo zväzku pokoja.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosíme ťa za tých, ktorí nás spravujú, nech plnia svoje úlohy spravodlivo a zodpovedne, aby medzi národmi zavládla svornosť a pokoj.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosíme ťa za všetkých, ktorí boli pokrstení počas tejto Veľkej noci, aby rástli v láske a horlivo vyznávali vieru.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosíme ťa za nás všetkých, aby sme si vážili svoje znovuzrodenie z vody a z Ducha Svätého, pamätali na svoj krst a žili z neho.",
                    "Zmŕtvychvstalý Ježišu, základný kameň Cirkvi,<br>" +
                            "ukáž svoju moc a slávu na ľuďoch,<br>" +
                            "za ktorých si obetoval seba samého<br>" +
                            "ako Baránok bez poškvrny;<br>" +
                            "vyslyš naše prosby a daj,<br>" +
                            "aby každý pocítil silu tvojej lásky<br>" +
                            "a mal účasť na ovocí Veľkej noci.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"16", "6", "Bratia a sestry, spojení s naším zmŕtvychvstalým Pánom, ktorý chce obdariť svojím pokojom všetkých veriacich, prednesme Bohu svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Osláv nás, Otče, Kristovou slávou.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosme, aby Cirkev mocou Kristovej pravdy a lásky priviedla ľudí na cestu spásy.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosme, aby Kristove slová, ktoré ohlasujú misionári a kazatelia, boli pre veriacich svetlom života.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosme, aby Pán otvoril srdcia všetkých ľudí pre nadprirodzené hodnoty zjavenia.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosme za všetkých, ktorí pristupujú k Pánovmu stolu, aby s odvahou ohlasovali Kristovu pravdu a lásku.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosme, aby sme posilnení účasťou na tejto svätej omši obetovali Bohu svoje utrpenia za spásu sveta.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosme za tých, ktorých sme odprevadili do večnosti, aby ich Pán obdaril večným životom v jeho sláve.",
                    "Otče, vypočuj naše prosby<br>" +
                            "a vlej do našich sŕdc veľkonočnú radosť,<br>" +
                            "aby sme boli schopní potešovať utrápených.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "A", "Bratia a sestry, Pán Ježiš nám priniesol vzácny veľkonočný dar – sviatosť zmierenia. Ako Božie deti znovuzrodené v krste s dôverou prosme nebeského Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Pre veľkonočnú obetu svojho Syna vyslyš nás, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosíme ťa, Otče, za všetok kresťanský ľud, ktorý slávi pamiatku Ježišovej smrti a zmŕtvychvstania, aby s radosťou svedčil o vzkriesenom Kristovi.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosíme ťa, Otče, za všetky národy, aby spoznali Kristov pokoj, ktorý nám získal svojou obetou na kríži.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosíme ťa, Otče, za kresťanov, ktorí pochybujú, a za neveriacich, ktorí by chceli veriť, aby boli otvorení pre veľkonočný dar viery a nádeje.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosíme ťa, Otče, za všetkých, ktorí vytrvalo hľadajú pravdu, aby osvietení veľkonočnou milosťou poznali, že iba v Kristovi možno získať spásu.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosíme ťa, Otče, za nás tu prítomných, aby sme boli spoločenstvom živej viery a bratskej lásky.",
                    "Bože, nebeský Otče,<br>" +
                            "v krste si nás prijal za svoje deti;<br>" +
                            "preto s dôverou voláme:<br>" +
                            "vyslyš naše prosby<br>" +
                            "a zachovaj nás v pevnej viere a oddanej láske.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "B", "Bratia a sestry, je Pánovým veľkonočným darom, že sme sa krstom stali Božími deťmi. Prednesme s dôverou svoje prosby Bohu, nášmu Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Nebeský Otče, zmiluj sa nad nami.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Daj svojej Cirkvi prežívať plnú radosť z Kristovho zmŕtvychvstania.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Daj, aby vo svete nerozhodovali záujmy ekonomiky, ale životné potreby každého človeka.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Všetkým, ktorí k tebe prichádzajú s ľútosťou, daruj odpustenie a naplň ich svojím pokojom.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Tým, ktorí ťa ešte nepoznajú, zjav svetlo svojej pravdy.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Daj, aby naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo bolo jedno srdce a jedna duša.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Daj umierajúcim svoju milosť, aby odišli z tohto sveta zaopatrení sviatosťami.",
                    "Bože Otče,<br>" +
                            "hoci sme hriešni, predsa nás napĺňa radosť zo spásy;<br>" +
                            "vrúcne ťa prosíme:<br>" +
                            "vyslyš naše prosby,<br>" +
                            "keď s dôverou vzývame tvoje milosrdenstvo.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"20", "C", "Bratia a sestry, keď sa v liturgii stretávame so vzkrieseným Kristom, aj my môžeme so svätým Tomášom vyznať: Pán môj a Boh môj! Nech sú preto aj tieto prosby vyjadrením našej viery v zmŕtvychvstalého Pána.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane Ježišu, daj, aby tvoja Cirkev prinášala tomuto svetu nádej.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Pane Ježišu, daj svetu, zranenému vojnami a rozbrojmi, zakúsiť tvoje milosrdenstvo a pokoj.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Pane Ježišu, daj svoju múdrosť všetkým, ktorí vyučujú na teologických fakultách.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Pane Ježišu, daj, aby si všetci ľudia uvedomili, že odpúšťaním uzdravujú svoje srdcia.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Pane Ježišu, daj všetkým pochybujúcim istotu, že stojíš pri nich, a neopúšťaš ich v ťažkostiach.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Pane Ježišu, daj všetkým, ktorí vzývajú tvoje milosrdenstvo, svoju milosť, aby odišli z tohto sveta zaopatrení sviatosťami.",
                    "Milosrdný Ježišu,<br>" +
                            "ty nás chrániš od každého nebezpečenstva;<br>" +
                            "velebíme ťa a prosíme,<br>" +
                            "aby si vyslyšal naše prosby.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"21", "1", "Bratia a sestry, Pán Ježiš nás poučil, že ak chceme uzrieť Božie kráľovstvo, musíme sa znova narodiť. Prednesme mu pokorne svoje modlitby a prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zošli na nás svojho Ducha.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane, ty si preslávil svoju Cirkev prostredníctvom zástupu svätých a obdivuhodných učiteľov viery; daj, aby boli kresťania hrdí na svätosť ich života a sami sa ju usilovali dosiahnuť.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Pane, ty si odpustil hriechy ľudu, keď sa svätí pastieri modlili k tebe ako Mojžiš; na ich príhovor neustále očisťuj a posväcuj svoju Cirkev.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Pane, ty si ustráchaným apoštolom poslal Ducha Tešiteľa; posilni prenasledovaných kresťanov tým istým Duchom a daj im možnosť čerpať silu z účasti na Eucharistii.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Pane, ty si sa po svojom zmŕtvychvstaní ukázal najprv apoštolom; daj, aby sme boli tvojimi svedkami až po samý kraj zeme.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Pane, ty si potešil Martu, keď oplakávala svojho brata Lazára; naplň nádejou vo večný život tých, ktorí smútia nad smrťou svojich blízkych.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a upevni naše spojenie s tebou,<br>" +
                            "aby si nám nebol sudcom, ale Spasiteľom.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"22", "2", "Bratia a sestry, Boh nám dal mnohé dobrodenia, predovšetkým dar viery. Prosme ho, aby nás urobil schopnými vydávať svojím životom svedectvo o tomto neoceniteľnom dare.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosme za všetkých veriacich v Krista, aby podľa vzoru prvých kresťanov boli jedno srdce a jedna duša.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosme za novopokrstených, aby plní Ducha Svätého ustavične pracovali na svojom duchovnom rozvoji.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosme za kresťanské rodiny, aby boli naplnené vzájomnou úctou a Kristovým pokojom.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosme za nás tu zhromaždených, aby sme z uvažovania nad dnešným Božím slovom načerpali svetlo a silu na premenu nášho života.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosme za zosnulých <font color='#B71C1C'>(M.)</font>, aby dosiahli večné šťastie a mali účasť na víťazstve zmŕtvychvstalého Krista.",
                    "Veríme v teba, Bože, a prosíme ťa,<br>" +
                            "vyslyš naše prosby,<br>" +
                            "preukáž nám svoje milosrdenstvo<br>" +
                            "a obdaruj nás večným životom.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"23", "3", "Bratia a sestry, veríme v meno jednorodeného Božieho Syna, preto v tomto mene prosme nášho nebeského Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosme za Cirkev, aby bola svedkom lásky, ktorou Boh miluje svet.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosme za tých, ktorí spravujú národy, aby mali ducha spravodlivosti a lásky a vedeli premáhať lož pravdou.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosme, aby Božia láska zvíťazila nad nenávisťou a dobro nad každým zlom.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosme, aby všetci ľudia uverili, že Ježiš je ich jediným Záchrancom a Spasiteľom.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosme za tých, ktorí neveria v Krista, aby žili podľa prirodzeného zákona vpísaného do ich sŕdc.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosme za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby uzreli Boha z tváre do tváre.",
                    "Všemohúci Bože,<br>" +
                            "tvoj Syn nás vyslobodil z temnoty hriechu;<br>" +
                            "prosíme ťa,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj nám milosť žiť v jeho svetle.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"24", "4", "Bratia a sestry, vďaka veľkonočnej viere v Ježiša Krista máme prístup k nebeskému Otcovi, ktorý vždy vypočuje prosby svojich detí. S dôverou v túto pravdu mu prednesme svoje prosby:",
                    "<font color='#B71C1C'>(</font>Volajme: Pre Kristovo zmŕtvychvstanie vyslyš nás, Bože.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Otče, prosíme ťa za svätú Cirkev, aby v slobode ohlasovala svetu radostnú zvesť o Kristovom zmŕtvychvstaní.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Otče, prosíme ťa za ľudí uzavretých pred tvojím slovom, aby pochopili, že iba v tvojom evanjeliu nájdu pravdu života.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Otče, prosíme ťa za chudobných, chorých a trpiacich, aby nikdy neupadali na duchu, ale našli oporu vo viere v teba.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Otče, prosíme ťa za nás zhromaždených pri tvojom oltári, aby veľkonočná viera v zmŕtvychvstalého Krista dávala zmysel nášmu pozemskému životu a upevňovala v nás nádej na večný život.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Otče, prosíme ťa za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby dosiahli slávu vzkriesenia.",
                    "Prosíme ťa, Bože,<br>" +
                            "prijmi našu modlitbu<br>" +
                            "a upevňuj v nás veľkonočnú vieru v Ježiša Krista,<br>" +
                            "aby sme v ňom všetci dosiahli<br>" +
                            "odpustenie a milosrdenstvo.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"25", "5", "Bratia a sestry, vďaka Kristovej obete sa môžeme sýtiť jeho najsvätejším telom, ktoré je životodarnejšie ako každodenný chlieb. Prosme nášho Vykupiteľa.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, daj nám chlieb z neba.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane Ježišu, posilňuj vieru Cirkvi v tvoju eucharistickú prítomnosť medzi nami.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Pane Ježišu, vzbudzuj v srdciach veriacich neustály hlad po eucharistickom chlebe.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Pane Ježišu, prelom pochybnosti alebo strach, ktorý mnohých odrádza od pristupovania k svätému prijímaniu.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Pane Ježišu, daruj nám úprimnú radosť z toho, že ťa môžeme prijímať v Oltárnej sviatosti.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Pane Ježišu, priveď zosnulých <font color='#B71C1C'>(M.)</font>, ktorí prijímali tvoje telo, záloh večnej spásy, do slávy nebeského kráľovstva.",
                    "Pane Ježišu, živý chlieb,<br>" +
                            "nehľaď na naše hriechy,<br>" +
                            "ale na vieru svojej Cirkvi<br>" +
                            "a nasýť nás svojím telom,<br>" +
                            "aby sme raz mohli s radosťou prísť k Otcovi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"26", "6", "Bratia a sestry, spoločne s Pannou Máriou obráťme svoje srdcia i mysle k nášmu nebeskému Otcovi, ktorý poslal svojho Syna, aby každého z nás viedol po ceste spásy. S dôverou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Milosrdný Otče, daruj Cirkvi dostatok duchovných povolaní.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Požehnaj všetkých, ktorí slúžia v charitnom diele Cirkvi.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Ochraňuj všetky krajiny od vojen a krviprelievania.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Pomôž opovrhnutým a trestaným ľuďom nájsť silu vrátiť sa k tebe.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Daj, aby nám svätá omša bola vždy najposvätnejšou chvíľou dňa.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Daj, aby nás nikdy nepremohol strach, ale aby nás posilňovalo vedomie tvojej blízkosti.",
                    "Všemohúci Otče,<br>" +
                            "tebe nič nie je nemožné;<br>" +
                            "upevňuj nás vo vernosti tebe,<br>" +
                            "aby sme po celý život poznávali,<br>" +
                            "aký si veľký a svätý.<br>" +
                            "O to ťa prosíme skrze Krista, nášho Pána."},
            {"30", "A", "Bratia a sestry, sme vykúpení drahou krvou nepoškvrneného Baránka Ježiša Krista. S dôverou prosme nášho Spasiteľa.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zostaň s nami a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosíme ťa, Pane, za biskupov, kňazov a diakonov, aby horlivo konali svoju službu a pripravovali ti ľud ochotný vykonať každé dobré dielo.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Udeľ štátnikom ducha spravodlivosti a pokoja, aby sme mohli svorne žiť v ľudskej rodine.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Preukáž svoje milosrdenstvo chorým, unaveným a umierajúcim, posilňuj a upevňuj ich svojou láskou.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosíme ťa za mládež, ktorá prežíva rozličné krízy, strach, nepokoje a ťažkosti, aby v tvojom zmŕtvychvstaní hľadala pomoc a nádej na ich vyriešenie.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosíme ťa za nás tu prítomných, aby sme ťa čoraz lepšie poznávali v tvojom slove a pri lámaní chleba.",
                    "Pane, zostaň s nami<br>" +
                            "a vyslyš naše prosby;<br>" +
                            "nech nám vždy horí srdce,<br>" +
                            "keď počúvame tvoje slovo.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"30", "B", "Bratia a sestry, Kristus je zmiernou obetou nielen za naše hriechy, ale aj za hriechy celého sveta. Preto sa modlime za spásu všetkých ľudí.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zostaň s nami a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosíme ťa, Kriste, za duchovných pastierov tvojej Cirkvi, nech lámu bratom a sestrám chlieb života a nech sa ním aj sami živia a posilňujú.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosíme ťa za tých, ktorí nás spravujú, nech plnia svoje úlohy spravodlivo a zodpovedne, aby medzi národmi zavládla svornosť a istota.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosíme ťa za tých, ktorí žijú v neistote a úzkostiach, nech v tebe nájdu cestu, pravdu, pravý život a pokoj.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosíme ťa za chorých, trpiacich a prenasledovaných, aby sa počas týchto sviatkov posilnili novou nádejou.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosíme ťa za nás tu prítomných, nech nám horí srdce radosťou, keď počúvame tvoje slovo, a nech sme jedno srdce a jedna duša.",
                    "Pane, zostaň s nami<br>" +
                            "a vyslyš naše prosby;<br>" +
                            "daj nám odvahu s radosťou svedčiť<br>" +
                            "o tvojom zmŕtvychvstaní.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"30", "C", "Bratia a sestry, Pán Ježiš sa tretí raz zjavil svojim učeníkom a ponúkol im chlieb a rybu. Aj medzi nami je náš vzkriesený a oslávený Pán, preto s dôverou volajme:",
                    "<font color='#B71C1C'>(</font>Pane, zostaň s nami a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane, pomáhaj biskupom a kňazom svojej Cirkvi, ktorým si dal účasť na svojej úlohe hlavy a pastiera, aby skrze teba priviedli všetkých k Otcovi.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Usmerňuj podľa svojej vôle zmýšľanie národov i tých, ktorí ich spravujú, aby sa úprimne usilovali o spoločné dobro pre všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Osvecuj vedcov a umelcov, aby svojimi dielami svedčili o kráse a vznešenosti tvojho kráľovstva.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Pohni srdcia všetkých, ktorí sa pre hriech a pohoršenia vzdialili od teba, aby sa vrátili k tebe a navždy zostali v tvojej láske.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Pane Ježišu, daj, aby sme sa ti, prítomnému v Oltárnej sviatosti, klaňali so živou vierou a s veľkou láskou.",
                    "Pane, zostaň s nami<br>" +
                            "a vyslyš naše prosby;<br>" +
                            "pomáhaj nám, aby sme ako apoštoli<br>" +
                            "vždy viac poslúchali Boha ako ľudí,<br>" +
                            "a tak svedčili o tvojom zmŕtvychvstaní.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"31", "1", "Bratia a sestry, pokorne prosme Boha, ktorý posilňoval svätého diakona Štefana vo vydávaní svedectva o Kristovi, a spoločne sa modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, posilni nás svojím Svätým Duchom.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Daj, nech biskupi, kňazi a diakoni povzbudzujú k spáse všetkých, ktorí sú im zverení.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Posilni kresťanov prenasledovaných pre vieru vo vydávaní svedectva a v znášaní utrpenia.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Obdaruj všetky národy pokojom a osloboď ich od nenávisti a hnevu, aby bolo vo svete čo najmenej utrpenia.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Daj, aby sme posilnení sviatosťou krstu zachovávali vernosť prikázaniam a oslavovali ťa svojím životom.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Priveď našich zosnulých <font color='#B71C1C'>(M.)</font> do nebeského kráľovstva, aby sa naveky tešili s Božím Baránkom.",
                    "Pane, ty otváraš svoju žehnajúcu ruku všetkým,<br>" +
                            "ktorí ťa prosia o milosť;<br>" +
                            "vypočuj naše prosby a pomôž nám,<br>" +
                            "aby sme si zachovali vieru až do smrti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"32", "2", "Bratia a sestry, prednesme svoje prosby Bohu, nášmu Otcovi, s radosťou, že Kristus zvíťazil nad smrťou.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Za svätú Cirkev: aby zostala verná učeniu apoštolov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Za celý svet: aby sa pokoj zmŕtvychvstalého Krista rozšíril po celej zemi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Za tých, ktorí žijú v strachu: aby ich viera vo vzkrieseného Krista oslobodila od každej úzkosti, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Za všetkých, ktorí žijú v závislostiach: aby sa od nich s Božou pomocou oslobodili, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Za našu diecézu: aby sa dokázala deliť o všetky dobrá v duchu kresťanskej štedrosti a láskavosti, prosme Pána.",
                    "Všemohúci Otče,<br>" +
                            "tvoj milovaný Syn vstal z mŕtvych, ako sľúbil;<br>" +
                            "skrze neho ti s radosťou a dôverou<br>" +
                            "predkladáme svoje prosby<br>" +
                            "a veríme, že ich vyslyšíš.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"33", "3", "Bratia a sestry, Pán Ježiš prikázal svojim učeníkom, aby ohlasovali evanjelium až po samý kraj zeme. Preto ho s dôverou prosme za celý svet.",
                    "<font color='#B71C1C'>(</font>Volajme: Víťazný Kráľ, žehnaj nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Modlime sa za všetkých ľudí, aby ich osvietilo nehasnúce svetlo, ktorým je Ježiš Kristus, Boží Syn a Spasiteľ.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Modlime sa za všetkých kresťanov, aby v nich rástla úcta a láska k Eucharistii.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Modlime sa za tých, ktorí spravujú národné hospodárstvo, aby hmotné dobrá štátu využívali na rozvoj celej spoločnosti.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Modlime sa za chorých, trpiacich a opustených, aby s Božou pomocou dokázali znášať svoje utrpenie.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Modlime sa za seba samých, aby sme boli svedkami evanjelia medzi svojimi príbuznými, priateľmi a známymi.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Modlime sa za našich zosnulých <font color='#B71C1C'>(M.)</font>, aby im Pán doprial uvidieť jas svojej slávy a dal im účasť na radosti spasených.",
                    "Pane Ježišu, ty si naša nádej;<br>" +
                            "predkladáme ti svoje prosby<br>" +
                            "a prosíme ťa,<br>" +
                            "dovoľ nám tešiť sa<br>" +
                            "z prisľúbeného stretnutia s tebou v nebi.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"34", "4", "Bratia a sestry, na Kristovej veľkonočnej ceste od poníženia na kríži až po slávu vzkriesenia nám Boh Otec dáva milosť dotknúť sa jeho nekonečnej lásky. Naplnení radosťou a novou nádejou v Kristovi prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Za Božiu Cirkev: aby verne hlásala Božie kráľovstvo celému svetu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Za Svätého Otca <font color='#B71C1C'>M.</font>, biskupov, kňazov a diakonov: aby nám objasňovali Písmo a učili nás rozumieť mu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Za všetkých, ktorí hľadajú pravdu: aby na svojej ceste stretli ľudí, ktorí im ju pomôžu nájsť, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Za ľudí, ktorí vkladajú svoju nádej v Ježiša Krista: aby si po celý život zachovali vieru v jeho zmŕtvychvstanie, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Za nás tu prítomných: aby sme radostne vyznávali vieru v trojjediného Boha a ochotne plnili jeho svätú vôľu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Za zosnulých <font color='#B71C1C'>(M.)</font>: aby ich Kristus voviedol do nebeskej slávy a dal im miesto na nebeskej hostine, prosme Pána.",
                    "Bože, Otec nášho Pána Ježiša Krista,<br>" +
                            "ty si naším Bohom a Pánom;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a udeľ nám potrebné dary a milosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"35", "5", "Bratia a sestry, prednesme svoje prosby Bohu, ktorý vzkriesil z mŕtvych svojho Syna Ježiša Krista.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Za Cirkev: aby oživovaná vierou v zmŕtvychvstanie niesla nádej života celému svetu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Za nášho pápeža <font color='#B71C1C'>M.</font> a nášho biskupa <font color='#B71C1C'>M.</font>: aby nás ustavične povzbudzovali vo viere, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Za všetkých, ktorých smrť blízkych naplnila bôľom a smútkom: aby našli útechu vo veľkonočnom tajomstve zmŕtvychvstania, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: aby sme sa podľa príkladu svätého Pavla tešili z daru krstu a svedčili o Ježišovi, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Za nás všetkých, ktorí sme sa tu zhromaždili: aby sme z Eucharistie čerpali silu na plnenie každodenných povinností, prosme Pána.",
                    "Všemohúci a večný Bože,<br>" +
                            "prijmi naše prosby<br>" +
                            "a daj, aby sme rástli<br>" +
                            "vo veľkonočnej milosti.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"36", "6", "Bratia a sestry, Kristus, chlieb života, v posledný deň vzkriesi tých, ktorí sa ním živia pri stole jeho slova a tela. S radosťou ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zostaň s nami a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane, rozmnožuj vieru Cirkvi putujúcej na zemi, aby svetu horlivejšie vydávala svedectvo o tvojom zmŕtvychvstaní.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Pane, dopraj všetkým národom, aby poznali tvoj pokoj, ktorý si nám získal svojou obetou na kríži.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Pane, povzbudzuj lekárov a ošetrovateľov, aby boli ochrancami ľudského života.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Pane, daj všetkým ženám a matkám miernosť a lásku tvojej matky Márie.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Pane, obráť bolesti a smútok zarmútených na jasavú radosť.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Pane, daj nám silu úprimne pristupovať k sviatosti zmierenia a pravidelne sa zúčastňovať na eucharistickej hostine.",
                    "Pane, povzbudení vyznaním viery Šimona Petra<br>" +
                            "ťa prosíme,<br>" +
                            "aby si nás zachoval vo svojej láske,<br>" +
                            "veď okrem teba nemáme nikoho,<br>" +
                            "kto by mal slová večného života.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"40", "A", "Bratia a sestry, Pán Ježiš, Dobrý pastier, dal život za našu spásu. Pokorne ho prosme, aby nám daroval kňazov podľa svojho srdca.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, Dobrý pastier, vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane Ježišu, daj, aby všetci ľudia v pastieroch Cirkvi čoraz lepšie spoznávali teba, Dobrého pastiera.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Ukáž svetu, že jeho šťastná budúcnosť môže byť postavená iba na základoch tvojho učenia.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Udeľ predstaveným národov a štátov milosť, aby sa starali o tých, ktorí sú im zverení, a aby ich viedli po ceste pravdy, spravodlivosti a lásky.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Daruj svojej Cirkvi kňazov, ktorí by aj život položili za svojich veriacich.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Vnukni kresťanským rodinám túžbu vychovať zo svojich synov služobníkov tvojho oltára.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Vlož do našich sŕdc lásku ku kňazskému a rehoľnému stavu a úctu voči našim duchovným pastierom.",
                    "Dobrý pastier, Ježišu Kriste,<br>" +
                            "vyslyš naše prosby:<br>" +
                            "daj nám svätých kňazov<br>" +
                            "a zachovaj ich vo svojej láske;<br>" +
                            "veď ty, ktorý si raz obetoval seba samého na kríži,<br>" +
                            "obetuješ sa teraz prostredníctvom kňazov<br>" +
                            "a žiješ i kraľuješ na veky vekov."},
            {"40", "B", "Bratia a sestry, Kristus, náš veľkonočný Baránok, neváhal za nás obetovať svoj život. Ako Dobrý pastier nám nielen ukazuje cestu života, ale zbavuje nás hriechov. Vrúcne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, Dobrý pastier, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane, daj, aby duchovní pastieri tvojej Cirkvi mali vždy v tebe svoj vzor.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Pane, daj, nech všetci predstavitelia štátov podporujú rodinu ako základ zdravej spoločnosti.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Pane, daj, aby sa tí, ktorých voláš ku kňazstvu, veľkodušne rozhodli nasledovať ťa vo všetkom.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Pane, daj mladým ľuďom túžbu zasvätiť sa ti v duchovnom povolaní.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Pane, daj Cirkvi zdravé rodiny, v ktorých vyrastú aj duchovné povolania.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Pane, požehnávaj nášho duchovného otca <font color='#B71C1C'>(</font>našich duchovných otcov<font color='#B71C1C'>)</font>, aby sa ti stále viac pripodobňoval<font color='#B71C1C'>(</font>i<font color='#B71C1C'>)</font> svätosťou života.",
                    "Pane Ježišu, pastier svojho ľudu,<br>" +
                            "prijmi prosby svojich detí,<br>" +
                            "ktoré volajú k tebe s dôverou;<br>" +
                            "pre svoju veľkú lásku nás vyslyš<br>" +
                            "a daj nám dobrých kňazov.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"40", "C", "Bratia a sestry, Pán Ježiš pozýva k sebe každého z nás. On, Dobrý pastier, nás pozná a chce, aby sme ho nasledovali. Spoločne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, Dobrý pastier, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane, daruj všetkým duchovným pastierom svoju múdrosť.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Daj ochotu odpovedať na tvoj hlas všetkým, ktorých voláš.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Pomáhaj prenasledovaným kňazom, aby s odvahou hlásali evanjelium aj v krajinách, v ktorých sú kresťania potupovaní pre vieru.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Ochraňuj a požehnávaj bohoslovcov a daj im múdrych predstavených.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Daruj našim farnostiam dobré rodiny a chráň ich od každého zla.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Posilňuj lekárov, kňazov i každého z nás, aby sme vždy mali pochopenie pre chorých, trpiacich a pochybujúcich.<br>" +
                            "<font color='#B71C1C'>7.</font>&nbsp;Pane, naplň svojím pokojom všetkých hriešnikov, ktorí prijmú sviatosť zmierenia.",
                    "Ježišu, Dobrý pastier,<br>" +
                            "vypočuj naše prosby,<br>" +
                            "nenechávaj nás bez pomoci<br>" +
                            "a bez duchovných pastierov,<br>" +
                            "ktorí nás sprevádzajú na ceste k svätosti.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"41", "1", "Bratia a sestry, zhromaždení okolo Krista, Dobrého pastiera, vrúcne prosme, aby naplnil naše srdcia veľkou túžbou po zjednotení s ním.",
                    "<font color='#B71C1C'>(</font>Volajme: Ježišu, Dobrý pastier, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosme za svätú Cirkev, aby bola vždy verná svojmu Pastierovi a zjednocovala sa s ním v modlitbe a obetavej láske.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosme za Svätého Otca <font color='#B71C1C'>M.</font> a za nášho biskupa <font color='#B71C1C'>M.</font>, aby povzbudení príkladom apoštolov boli ochotní položiť za veriacich aj život.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosme za nové duchovné povolania, aby v Kristovej Cirkvi nechýbali dobrí duchovní pastieri a Bohu zasvätené osoby.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosme za tých, ktorí ešte nepoznajú Krista, aby sa Božie slovo aj cez nás dostalo k všetkým, ktorí hľadajú Boha.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosme za ľudí oklamaných sektami, aby na svojej životnej ceste stretli skutočných svedkov evanjelia.",
                    "Pane Ježišu, Dobrý pastier,<br>" +
                            "vypočuj naše prosby;<br>" +
                            "daj, aby sme verní náuke Cirkvi<br>" +
                            "neustále svedčili o tvojej láske,<br>" +
                            "a tak posväcovali svet.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"42", "2", "Bratia a sestry, Boh je naším Stvoriteľom. On nás obdaroval pozemským životom a pripravil pre nás aj večný život v nebi. S dôverou ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Modlime sa, aby výzvy Svätého Otca, ktoré adresuje mladým, priniesli ovocie a aby sa mnohí odhodlali pre prácu v Pánovej vinici.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Modlime sa za všetkých, ktorí sa nachádzajú v temnote hriechu, aby sa zblížili so vzkrieseným Kristom.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Modlime sa za národy celého sveta, aby Kristova radostná zvesť priniesla všetkým sociálnu spravodlivosť.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Modlime sa za naše spoločenstvo, aby každý z nás rozdával veľkonočnú radosť.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Modlime sa za zosnulých <font color='#B71C1C'>(M.)</font>, aby v nebi zvelebovali Boha naveky.",
                    "Bože Otče,<br>" +
                            "ty si zmŕtvychvstaním svojho Syna<br>" +
                            "priniesol ľuďom pokoj a odpustenie;<br>" +
                            "prosíme ťa,<br>" +
                            "vyslyš svoj ľud,<br>" +
                            "ktorý ti prednáša tieto prosby.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"43", "3", "Bratia a sestry, veríme, že Boh Otec poslal na svet svojho Syna, aby bol naším svetlom, Pastierom a Vykupiteľom. Obráťme sa s vďačnosťou a dôverou na nášho nebeského Otca a prosme ho.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Modlime sa za svätú Cirkev, aby jej nikdy nechýbali svätí a horliví biskupi a kňazi.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Modlime sa za ľudí, ktorí konajú zlo a spôsobujú krivdu, aby sa spamätali a našli záchranu v Kristovi.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Modlime sa za misijné krajiny, aby ich obyvatelia našli cestu k Ježišovi Kristovi.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Modlime sa za tých, ktorí trpia v temnote zúfalstva, aby prijali Sväté písmo ako svetlo a pravdu.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Modlime sa za seba samých, aby sme mali úctu ku Kristovmu slovu a usilovali sa podľa neho žiť.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Modlime sa za zosnulých <font color='#B71C1C'>(M.)</font>, aby večne žili v radosti z Kristovej prítomnosti.",
                    "Bože, naše srdce horí,<br>" +
                            "keď počúvame tvojho jednorodeného Syna;<br>" +
                            "prijmi modlitby nás všetkých,<br>" +
                            "ktorí ho chceme úprimne nasledovať.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"44", "4", "Bratia a sestry, Kristus nás učí pokore, preto so skrúšeným srdcom prednesme svoje prosby nebeskému Otcovi.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosme za svätú Cirkev, aby zostala verná svojmu poslaniu a ustavične pozývala všetkých veriacich na oslavu zmŕtvychvstalého Krista.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosme za nášho pápeža <font color='#B71C1C'>M.</font>, aby jeho život bol povzbudením pre všetkých ľudí.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosme za tých, ktorí neprijímajú Krista, aby pochopili jeho slová: Kto prijíma mňa, prijíma toho, ktorý ma poslal.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosme za pochybujúcich vo viere, aby sa vo svojom živote stretli s dobrým príkladom veriacich kresťanov.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosme za seba samých, aby sme dokázali naplno žiť svoju vieru.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosme za zosnulých <font color='#B71C1C'>(M.)</font>, aby vyslobodení z očistca získali účasť na nebeskej radosti.",
                    "Všemohúci a večný Bože,<br>" +
                            "tebe sú milé aj najmenšie prejavy viery a lásky;<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "aby sme boli vždy<br>" +
                            "vernými nasledovníkmi Ježiša Krista,<br>" +
                            "ktorý s tebou žije a kraľuje na veky vekov."},
            {"45", "5", "Bratia a sestry, skrze Krista, ktorý je cesta, pravda a život, prednesme svoje prosby všemohúcemu Bohu.",
                    "<font color='#B71C1C'>(</font>Volajme: Bože, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosme za dar múdrosti a svetla Ducha Svätého pre biskupov, kňazov a diakonov.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosme za nové povolania na zasvätený život pre celú Cirkev.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosme za múdrosť a pokoru pre všetkých učiteľov a ohlasovateľov Kristovej radostnej zvesti.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosme za predstaviteľov štátov a ich ochotu konať spravodlivo a čestne.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosme za dar viery pre tých, ktorí hľadajú pravdu v Pánovi a túžia ho spoznať.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosme za upevnenie povolania pre tých, ktorí sa pripravujú na prijatie sviatosti kňazstva.<br>" +
                            "<font color='#B71C1C'>7.</font>&nbsp;Prosme za večnú spásu pre zosnulých kňazov, ktorí slúžili v našej diecéze.",
                    "Bože, večný Otče,<br>" +
                            "prosíme ťa,<br>" +
                            "splň túžby modliacej sa Cirkvi<br>" +
                            "zhromaždenej okolo tvojho oltára.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"46", "6", "Bratia a sestry, Pán Ježiš povedal: Urobím všetko, o čo budete prosiť v mojom mene. Preto mu s dôverou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosme za Cirkev, aby v nej žiarila láska, svornosť a jednota.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosme za všetkých kresťanov, aby svojím morálnym postojom zjavovali svetu dobrotivú Božiu tvár.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosme za trpiacich a bezradných, aby našli oporu a istotu vo viere.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosme za mládež, aby prijala Kristovo svedectvo, a tak našla cestu svojho povolania.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosme za seba samých, aby sme s horlivosťou svedčili o zmŕtvychvstalom Kristovi.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosme za zosnulých <font color='#B71C1C'>(M.)</font>, aby dosiahli večné kráľovstvo, ktoré Ježiš sľúbil svojim verným.",
                    "Ježišu, ty nás napĺňaš radosťou<br>" +
                            "zo svojho zmŕtvychvstania;<br>" +
                            "vypočuj naše modlitby a daj,<br>" +
                            "aby sa všetci ľudia tešili<br>" +
                            "z ovocia tvojej vykupiteľskej smrti.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"50", "A", "Bratia a sestry, Pán Ježiš nás uisťuje, že svoj život naplní pokojom a radosťou len ten, kto zotrvá v spojení s ním. Vyprosujme túto milosť sebe i všetkým ľuďom.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zostaň s nami a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosíme ťa, Kriste, za tvoju Cirkev, aby sa všetkým javila ako svätý národ a Boží ľud.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosíme ťa za tých, ktorí nás spravujú, aby svoj úrad vykonávali spravodlivo a s láskou.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosíme ťa za všetkých diakonov, aby boli mužmi plnými viery a Ducha Svätého.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosíme ťa za všetkých, ktorých trápia úzkosti a pochybnosti, aby v tebe našli pravdu a istotu.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosíme ťa za seba samých, aby sme si lepšie uvedomovali úlohy vyplývajúce z nášho všeobecného kňazstva.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosíme ťa za zosnulých <font color='#B71C1C'>(M.)</font>, aby mali svoj domov v nebeskom príbytku.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše prosby<br>" +
                            "a daj, aby sme všade ohlasovali tvoje veľké skutky,<br>" +
                            "že si nás z tmy povolal do svojho svetla.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"50", "B", "Bratia a sestry, Pán Ježiš je pravý vinič a my sme jeho ratolesti. Prosme ho, aby sme natrvalo ostali v jeho láske.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zostaň s nami a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosíme ťa, Kriste, za tvoju Cirkev, aby žila v pokoji a rástla v sile Ducha Svätého.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosíme ťa za tých, ktorí nás spravujú, aby svoj úrad vykonávali múdro, spravodlivo a milosrdne.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosíme ťa za misionárov, aby neohrozene ohlasovali tvoje evanjelium.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosíme ťa za suché ratolesti na strome Cirkvi, aby sa nechali oživiť tvojím Duchom a prinášali ovocie.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosíme ťa za naše rodiny, aby sme v nich sami boli živými ratolesťami prinášajúcimi bohaté duchovné ovocie.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosíme ťa za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, aby sme dôsledne zachovávali tvoj príkaz o láske k bratom a sestrám.<br>" +
                            "<font color='#B71C1C'>7.</font>&nbsp;Prosíme ťa, Pane, za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby dosiahli nebeskú blaženosť na večnej hostine v spoločenstve tvojich svätých.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme ostávali v tebe<br>" +
                            "a prinášali veľa ovocia.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"50", "C", "Bratia a sestry, Ježišova láska je pre nás príkladom, ako máme milovať Boha a blížnych. Aby sme to dokázali, spoločne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zostaň s nami a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosíme ťa, Kriste, za tvoju nevestu Cirkev, nech všetkým žiari ako spoločenstvo lásky.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosíme ťa za tých, ktorí nás spravujú, nech svoj úrad vykonávajú múdro, spravodlivo a zodpovedne.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosíme ťa za všetkých misionárov, nech je ich námaha pri šírení viery korunovaná radosťou z nových domorodých kňazov.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosíme ťa za zomierajúcich, prijmi ich do nebeského kráľovstva, kde už niet smrti ani zármutku.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosíme ťa za naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo, nech žijeme v tvojom pokoji a bratskej láske.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosíme ťa, Pane, za našich zomrelých <font color='#B71C1C'>(M.)</font>, nech ich večne preniká jas tvojho zmŕtvychvstania.",
                    "Pane, zostaň s nami<br>" +
                            "a vyslyš naše prosby;<br>" +
                            "pomáhaj nám vzmáhať sa v bratskej láske,<br>" +
                            "aby tak všetci videli,<br>" +
                            "že sme tvoji učeníci.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"51", "1", "Bratia a sestry, spoločne velebme Boha za dar Ducha Svätého a prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Za svätú katolícku Cirkev: aby bola živým a svätým príbytkom trojjediného Boha, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Za služobníkov oltára: aby nadovšetko milovali Krista veľkňaza, ktorý ich povolal, a verne slúžili svojim bratom a sestrám, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Za všetkých pokrstených: aby ich život bol odpoveďou na Božiu lásku, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Za ľudí v sektách a za tápajúcich v tmách: aby poznali pravého Boha, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Za všetkých, ktorí sa starajú o naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo: aby získali Božie požehnanie, prosme Pána.",
                    "Všemohúci Bože,<br>" +
                            "ty sa zjavuješ tým, ktorí majú čisté srdce;<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj nám silu žiť podľa tvojich prikázaní.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"52", "2", "Bratia a sestry, náš vzkriesený Pán nám daroval pokoj, ktorý svet nemôže dať ani vziať. Buďme vďační za tento dar a vrúcne ho prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane Ježišu, ty si obdaroval apoštolov pokojom; daj, nech je Cirkev znamením pokoja pre všetky národy.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Dobrý pastier, ty si nám prejavil svoju lásku; daj, nech ťa milujeme s veľkou dôverou a neochvejnou nádejou.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Pokorný Ježišu, ty si bol poslušný svojmu Otcovi; udeľ nám milosť, aby sme boli verní vnuknutiam tvojho Ducha.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Milosrdný Spasiteľ, tvoje Srdce je bohaté pre tých, ktorí ťa vzývajú; zhliadni na všetky siroty a deti, ktoré nepoznali lásku, a zjav im dobrotu Otca.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Boží Syn, ty si prišiel na našu zem a opäť si sa vrátil k svojmu Otcovi; otvor brány neba dušiam trpiacim v očistci.",
                    "Pane Ježišu,<br>" +
                            "vyslyš naše prosby<br>" +
                            "a daj, aby sme ťa milovali nadovšetko<br>" +
                            "a svojich blížnych ako seba samých.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"53", "3", "Bratia a sestry, zostaňme v Kristovej láske. Len tak budeme môcť prosiť o čokoľvek a dostaneme to. S touto vierou sa vrúcne modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane Ježišu, ty si pravý vinič; daj, aby boli všetci členovia Cirkvi živými ratolesťami a prinášali hojnú úrodu.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Ježišu, bez teba nemôžeme urobiť nič; daj, nech zostávame v tebe a ty v nás, aby sme žili podľa tvojej vôle.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Kriste, ty si pravý lekár; poteš chorých a opustených, aby v tebe nachádzali silu pri nesení kríža.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Ježišu, ty si pravé svetlo; naplň kresťanov poznaním tvojich tajomstiev, aby sa nedali oklamať nástrahami diabla.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Ježišu, ty si chlieb života; roznecuj lásku v našom farskom spoločenstve, ktoré sa zjednocuje pri slávení Eucharistie.",
                    "Ježišu Kriste,<br>" +
                            "ty si pravý vinič a tvoj Otec je vinohradník;<br>" +
                            "daj, nech sa s láskou odovzdávame do rúk Otca,<br>" +
                            "aby nás formoval podľa svojej vôle.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"54", "4", "Bratia a sestry, ďakujme nášmu Bohu za jeho veľké dobrodenia a s úprimným srdcom ho prosme za Cirkev a celý svet.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Aby biskupi, kňazi a diakoni čerpali silu a múdrosť z Božieho slova, a tak posväcovali seba i tých, ktorí sú im zverení, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Aby misionári prinášali posolstvo o Božej láske do všetkých končín zeme, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Aby sa snúbenci v čistote pripravovali na prijatie sviatosti manželstva, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Aby všetci veriaci chápali, že pravá láska je neodlučiteľne spojená s obetou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Aby sme zostávali v Kristovej láske a prežívali plnosť radosti, ktorú nám dáva iba on, prosme Pána.",
                    "Všemohúci Bože, prameň lásky,<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "aby sme s ochotou a radosťou<br>" +
                            "plnili tvoje prikázania.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"55", "5", "Bratia a sestry, vrúcne milujme svojho Boha a s pevnou vierou prosme Ježiša.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane, ty si verným obrazom lásky Otca; pripodobni sebe nášho biskupa <font color='#B71C1C'>M.</font><br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Pane, ty si nám zveril príkaz lásky; nauč nás milovať tak, ako si nás miloval ty.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Pane, ty si nazval svojimi priateľmi tých, ktorí plnia tvoje slovo; daj, aby sme ho aj my verne uskutočňovali.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Pane, ty si nám oznámil všetko, čo si počul od svojho Otca; daj, aby sme si plne uvedomovali veľkosť tohto daru.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Pane, ty si nás vyvolil, aby sme prinášali bohaté ovocie; udeľ nám milosť vytrvať v dobrom až do konca.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Pane, ty si za nás trpel, zomrel na kríži a víťazne vstal z mŕtvych; uveď našich zomrelých <font color='#B71C1C'>(M.)</font> do slávy vzkriesenia.",
                    "Pane Ježišu,<br>" +
                            "ty si nám na kríži zjavil nekonečnú lásku Otca;<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "nech nám dary Ducha Svätého<br>" +
                            "pomáhajú uskutočňovať tvoj príkaz lásky.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"56", "6", "Bratia a sestry, v tomto Veľkonočnom období, keď náš Pán Ježiš Kristus zlomil moc diabla, prednesme mu, víťazovi nad hriechom a smrťou, svoje pokorné prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosme za nášho biskupa <font color='#B71C1C'>M.</font>, aby bol starostlivým otcom svojich kňazov a veriacich.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosme za všetkých veriacich, aby si plne uvedomovali, že nepatria svetu, ale Bohu.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosme za všetky národy, aby im Kristovo zmŕtvychvstanie prinieslo novú nádej a život v jeho láske.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosme za prenasledovaných kresťanov, aby trpezlivo nasledovali Krista na ceste kríža.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosme za nás všetkých, aby sme uprostred utrpení upierali zrak na vzkrieseného Spasiteľa.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosme za zosnulých <font color='#B71C1C'>(M.)</font>, aby dosiahli večné šťastie v dome nebeského Otca.",
                    "Ježišu Kriste, náš Vykupiteľ,<br>" +
                            "nech sa tvoja sila prejavuje v našej slabosti,<br>" +
                            "aby sme neohrozene vydávali<br>" +
                            "svedectvo o pravde evanjelia.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"60", "A", "Bratia a sestry, Kristus pri svojej rozlúčke s apoštolmi najviac zdôrazňoval lásku. V tejto spoločnej modlitbe ho prosme, aby všade vo svete zavládla pravá láska.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zostaň s nami a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosíme ťa, Kriste, za tvoju Cirkev, aby ju tvoj Duch zjednocoval v láske.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosíme ťa za všetkých ľudí, aby sa mali radi ako bratia a sestry.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosíme ťa za všetky siroty na svete, aby našli teplo rodinnej lásky v srdciach veriacich.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosíme ťa za deti, ktoré sa pripravujú na prvé sväté prijímanie, aby ťa čoraz lepšie poznali a vrúcne milovali.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosíme ťa za naše rodiny, aby v nich pravá láska nachádzala svoje prvoradé miesto.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosíme ťa aj za nás tu zhromaždených, aby sme si s radosťou uvedomovali, že v nás prebýva Duch Svätý.",
                    "Pane Ježišu,<br>" +
                            "zostaň s nami a vyslyš naše prosby;<br>" +
                            "daj, nech Duch Svätý,<br>" +
                            "ktorý pri birmovaní rozhojnil naše krstné zasvätenie,<br>" +
                            "urobí z nás neohrozených svedkov tvojho evanjelia.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"60", "B", "Bratia a sestry, Ježiš Kristus nás nazval svojimi priateľmi. Preto sa k nemu obráťme s dôverou.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zostaň s nami a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosíme ťa, Kriste, za Cirkev po celej zemi, aby vzrastala počtom svojich detí.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosíme ťa za všetky národy, aby boli voči sebe priateľské a ohľaduplné.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosíme ťa za všetkých ľudí, aby sa mali radi ako bratia a sestry.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosíme ťa za všetkých novopokrstených, aby sa s radosťou a láskou prehlbovali vo viere.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosíme ťa za deti, ktoré sa pripravujú na prvé sväté prijímanie, aby sa ti natrvalo zasvätili.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosíme ťa za seba samých, aby sme boli vďační za milosť svätého krstu.<br>" +
                            "<font color='#B71C1C'>7.</font>&nbsp;Prosíme ťa, Pane, za našich zomrelých <font color='#B71C1C'>(M.)</font>, aby mali účasť na večnom víťazstve tvojej lásky.",
                    "Pane Ježišu,<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "aby sme zachovávaním tvojich prikázaní<br>" +
                            "dokazovali svoju lásku k tebe.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"60", "C", "Bratia a sestry, dôverujme Kristovi, ktorý nás povzbudzuje, aby sme sa nebáli, ale očakávali Ducha Svätého. Preto sa spoločne modlime.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zostaň s nami a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosíme ťa, Kriste, za tvoju Cirkev, aby bola svetlom národov.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosíme ťa za predstaviteľov štátov, aby svoj ľud viedli k svornosti a pokoju.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosíme ťa za učiteľov teológie, aby v Duchu Svätom predkladali pravú náuku.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosíme ťa za mladých ľudí, ktorí sa pripravujú na prijatie birmovania, aby vrúcne túžili po daroch Ducha Svätého.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosíme ťa za deti, ktoré sa pripravujú na prvé sväté prijímanie, aby sa ti natrvalo zasvätili.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosíme ťa za seba samých, aby sme poslušne prijímali rozhodnutia učiteľského úradu Cirkvi.",
                    "Pane Ježišu, vyslyš naše prosby<br>" +
                            "a zachovaj nás vo svojej milosti,<br>" +
                            "aby v nás prebýval tvoj Duch<br>" +
                            "ako vo svojom chráme.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"61", "1", "Bratia a sestry, modlime sa k Bohu Otcovi, ktorý dáva dobré dary tým, ktorí ho prosia.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Láskavý Otče, daj, nech Duch Svätý vedie veriacich k jednomyseľnej a vytrvalej modlitbe.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Nech Duch Svätý riadi a vychováva národy k vzájomnej pomoci a spolupráci.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Pomáhaj všetkým prenasledovaným pre vieru znášať ťažkosti v nádeji na večnú odmenu.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Daj, nech tvoje slovo, zasievané do nášho srdca, prinesie ovocie dobrého života.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Požehnaj všetkých, ktorí sa starajú o novú úrodu a obrábajú naše polia a sady.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Udeľ našim zosnulým <font color='#B71C1C'>(M.)</font>, ktorých si živil chlebom z neba, radosť večného života.",
                    "Večný Otče, zverili sme ti svoje prosby;<br>" +
                            "daj, nech pre umučenie a zmŕtvychvstanie<br>" +
                            "tvojho Syna, nášho Pána Ježiša Krista,<br>" +
                            "dosiahneme tvoje milosrdenstvo.<br>" +
                            "Lebo on žije a kraľuje na veky vekov."},
            {"62", "2", "Bratia a sestry, Duch Svätý nás učí, ako sa máme modliť. Preto prednesme Bohu Otcovi svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Otče, posilňuj nášho Svätého Otca <font color='#B71C1C'>M.</font> a všetkých biskupov Cirkvi, aby v každom čase vyznávali a bránili pravdy evanjelia.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Utvrdzuj všetkých kresťanov vo viere, že Kristus je skutočne prítomný v Najsvätejšej oltárnej sviatosti.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Roznecuj srdcia kňazov a zasvätených osôb svätou horlivosťou, aby neúnavne pracovali na spáse nesmrteľných duší.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Daj, nech v Cirkvi nikdy nechýbajú ľudia, ktorí sa s láskou ujmú tých, ktorí sa ocitli v sociálnej a mravnej biede.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Daruj nám priaznivé počasie, aby zem priniesla hojnú úrodu.",
                    "Milosrdný Otče,<br>" +
                            "pre lásku, ktorou nás miluješ,<br>" +
                            "vyslyš naše prosby,<br>" +
                            "ktoré sme ti predniesli.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"63", "3", "Bratia a sestry, Boh dáva svojmu ľudu večný život. Modlime sa k nášmu Otcovi s vedomím, že nás nič nemôže odlúčiť od jeho lásky.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Nebeský Otče, daj, aby bol život kresťanov pre všetkých ľudí svedectvom viery a nádeje v teba.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Daj, nech si vážime svoje znovuzrodenie v krste a s pomocou tvojej milosti sa chránime každého hriechu.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Nedovoľ, aby nás spútali svetské túžby, ale nech celí patríme tebe.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Otváraj srdcia ľudí, aby ťa spoznali cez krásu stvorenstva.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Daj, aby sme si uvedomovali svoju zodpovednosť za prírodu a chránili ju ako tvoj vzácny dar.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Od teba pochádza všetko dobro, požehnaj nám tohtoročnú úrodu, aby sme pocítili tvoju starostlivosť o nás.",
                    "Dobrý Otče, spoznali sme,<br>" +
                            "že všetko riadi tvoja otcovská dobrota;<br>" +
                            "preto ti zverujeme svoj život<br>" +
                            "a s dôverou očakávame,<br>" +
                            "že vyslyšíš naše prosby.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"65", "5", "Bratia a sestry, s veľkou dôverou prosme Ježiša, aby vylial na nás Ducha lásky.",
                    "<font color='#B71C1C'>(</font>Volajme: Zapáľ naše srdcia ohňom svojej lásky.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Ježišu, daruj svojej Cirkvi Ducha jednoty, aby sme pod vedením svojich duchovných pastierov vždy hľadali to, čo nás spája.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Ježišu, daruj nám Ducha sily a odvahy, aby sme veľkodušne spolupracovali na spáse našich bratov a sestier.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Ježišu, obdaruj Duchom múdrosti predstaviteľov štátov, aby sa vytrvalo zasadzovali za pravé hodnoty.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Ježišu, nech tvoj Svätý Duch povzbudzuje všetkých kresťanov, aby s odvahou svedčili o hodnote pravej lásky a skutočného priateľstva.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Ježišu, nech nás tvoj Svätý Duch učí prežívať všetky udalosti života v spojení s tebou.",
                    "Ježišu, s dôverou sme ti predniesli svoje prosby;<br>" +
                            "zapáľ naše srdcia ohňom lásky,<br>" +
                            "aby sme milovali teba i našich bratov a sestry tak,<br>" +
                            "ako nás ty miluješ.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"66", "6", "Bratia a sestry, otvorme srdcia Božej láske a s dôverou prosme nášho Spasiteľa, ktorý sa za nás s láskou obetoval, a tak nám otvoril nebo a priniesol spásu.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Ježišu, svetlo sveta, ustavične obnovuj svoju Cirkev Duchom Svätým, aby bola tvojou vernou nevestou.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Ježišu, večný veľkňaz, naplň Duchom múdrosti Svätého Otca <font color='#B71C1C'>M.</font>, celý zbor biskupov, kňazov a diakonov.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Ježišu, prameň Otcovho milosrdenstva, posväcuj všetkých zasvätených tvojej službe, aby sa ti klaňali v Duchu a pravde.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Ježišu, obraz Otcovej lásky, daj, aby sme nikdy neochabli v dôvere v teba.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Ježišu, naša nádej a radosť, daj, aby sa naši zosnulí <font color='#B71C1C'>(M.)</font> tešili z pohľadu na tvoju tvár v nebeskom kráľovstve.",
                    "Pane Ježišu, ty chceš, aby naša radosť bola úplná;<br>" +
                            "vypočuj naše prosby,<br>" +
                            "ktoré ti predkladáme v Duchu Svätom na slávu Boha Otca,<br>" +
                            "a daj, aby sme vždy plnili Božiu vôľu.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"70", "A", "Bratia a sestry, dnes sme počuli, ako sa Pán Ježiš za nás modlí. Pozdvihnime aj my svoj zrak k nebu a modlime sa.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zošli svojho Ducha a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane, naplň duchom sily a múdrosti všetkých biskupov a kňazov.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Zviaž putom lásky a jednoty všetkých svojich veriacich.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Osvieť svetlom svojho Ducha všetkých, ktorí sa usilujú o dobro a pozdvihnutie človeka.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Naplň útechou Ducha Svätého všetky siroty a opustených.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Vyzbroj silou svojho Ducha všetkých, ktorí musia prinášať obete pre lásku k tebe.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Pane, spravuj naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo a obdaruj nás duchom pravej nábožnosti.",
                    "Otče, zošli svojho Ducha<br>" +
                            "a vyslyš naše prosby;<br>" +
                            "daj, nech spoločná viera a vzájomná láska spája tých,<br>" +
                            "ktorých posvätil jeden krst.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"70", "B", "Bratia a sestry, veľkonočná zvesť o Kristovom vykúpení je nám veľkou nádejou. Ježiš vystúpil na nebesia, ale stále zostáva s nami. Preto mu s dôverou prednesme svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Pane, daj Cirkvi vytrvalosť v modlitbe.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Pane, daj všetkým veriacim svojho Ducha, aby ich utvrdzoval vo viere a vernosti evanjeliu.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Pane, daj všetkým prenasledovaným silu a útechu v súženiach.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Pane, daj, nech sa celým životom usilujeme o dokonalosť, na ktorú nás vyzývaš príkladom svojho života.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Pane, daj všetkým, ktorí majú <font color='#B71C1C'>(</font>v tomto roku<font color='#B71C1C'>)</font> prijať sviatosť birmovania, stále väčšiu túžbu po tebe.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Pane, daj našim zosnulým <font color='#B71C1C'>(M.)</font> vstúpiť do príbytku, ktorý si pre nich pripravil od večnosti.",
                    "Pane, zošli svojho Ducha<br>" +
                            "a vyslyš naše prosby;<br>" +
                            "daj, nech všetkých, ktorých spojil jeden krst,<br>" +
                            "spája aj jedna viera a láska.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"70", "C", "Bratia a sestry, Ježiš aj po svojom odchode zostáva s nami až do konca sveta, ako nám prisľúbil. Preto ho s dôverou prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Ježišu, napĺňaj Cirkev túžbou po jednote a veď ju k svätosti a k poznaniu pravdy.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Ježišu, napĺňaj služobníkov Cirkvi radosťou z tvojho zmŕtvychvstania.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Ježišu, napĺňaj všetkých zákonodarcov a sudcov silou brániť spravodlivosť.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Ježišu, napĺňaj náš národ túžbou po pravde tvojho evanjelia.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Ježišu, napĺňaj trpiacich, chorých a osamelých svojou silou a útechou.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Ježišu, napĺňaj našich príbuzných, priateľov a známych vzácnymi darmi Ducha Svätého.",
                    "Pane Ježišu, pozývaš nás do svojej slávy;<br>" +
                            "chceme ísť za tebou, a preto prosíme:<br>" +
                            "vyslyš naše prosby,<br>" +
                            "pomáhaj nám a požehnaj všetkých ľudí,<br>" +
                            "aby sa nestratil nikto z tých, ktorých ti dal Otec.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"71", "1", "Bratia a sestry, v tejto spoločnej modlitbe sa obráťme ku Kristovi, ktorý má slová večného života. Prosme v jeho mene nášho nebeského Otca.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Nebeský Otče, prosíme ťa za biskupov, kňazov a diakonov, aby svoje povolanie prežívali v láske k eucharistickému Kristovi.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosíme ťa za osoby zasväteného života, aby bol Kristus pre nich jedinou cestou.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosíme ťa za kňazov, ktorí zanechali kňazskú službu, aby nestratili vieru a lásku k Cirkvi.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosíme ťa za našich nepriateľov, aby ich Kristus premohol svojou dobrotou a milosrdenstvom.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosíme ťa za chorých, trpiacich a opustených, aby v kresťanoch našli Kristovu lásku a pomoc.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosíme ťa za ľudí v pokročilom veku, aby ich blízkosť stretnutia s Kristom napĺňala nádejou a pokojom.",
                    "Bože, tvoj Syn a náš Pán Ježiš Kristus<br>" +
                            "odovzdal z lásky k nám svoj život;<br>" +
                            "preto vypočuj naše modlitby a daj,<br>" +
                            "aby sme všetci obetavo ohlasovali<br>" +
                            "ľuďom tvoju spásu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"72", "2", "Bratia a sestry, prednesme svoje prosby Otcovi, ktorý zahrnul slávou svojho Syna Ježiša Krista.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, zošli svojho Ducha a vyslyš naše prosby.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Prosme za Svätého Otca <font color='#B71C1C'>M.</font>, aby podporovaný modlitbami veriacich vykonával svoj úrad múdro a s láskou.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Prosme za členov Božieho ľudu, aby vo všetkých udalostiach svojho života vedeli rozpoznať vôľu nebeského Otca.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Prosme za všetkých trpiacich, aby čerpali odvahu a silu z tajomstva Kristovho kríža.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Prosme za všetkých ľudí, aby uznávali právo na život a slobodu.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Prosme za naše farské spoločenstvo, aby sme odvážne vyznávali svoju vieru.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Prosme za tých, ktorých Pán povolal z tohto sveta, aby získali prisľúbenú odmenu v nebi.",
                    "Všemohúci a večný Bože,<br>" +
                            "pokorne ťa prosíme:<br>" +
                            "vypočuj naše prosby,<br>" +
                            "zošli Tešiteľa, Ducha pravdy,<br>" +
                            "aby obnovil tvoju Cirkev<br>" +
                            "a upevnil medzi všetkými ľuďmi<br>" +
                            "puto pokoja a lásky.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"73", "3", "Bratia a sestry, povzbudení Božím slovom prednášajme svoje prosby mocnému Bohu s dôverou, že ich láskavo vyslyší.",
                    "<font color='#B71C1C'>(</font>Volajme: Prosíme ťa, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Bože, zhliadni na svoju Cirkev, ktorú si posvätil mocou svojho Ducha, aby prinášala spásu všetkým ľuďom.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Bože, dodaj odvahu všetkým duchovným pastierom, aby svojím životom odvážne vydávali svedectvo o tebe.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Bože, veď cestou evanjelia všetkých, ktorí sa pripravujú na sviatosť kňazstva, aby ich svetlo Ducha Svätého sprevádzalo na ceste povolania.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Bože, bdej nad tými, ktorí spravujú štáty a národy, aby sa vo svojej službe dali viesť Duchom múdrosti.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Bože, chráň birmovancov od neúprimného prijatia sviatosti birmovania.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Bože, voveď zosnulých <font color='#B71C1C'>(M.)</font> do spoločenstva s tebou, aby sa mohli tešiť z pohľadu na tvoju tvár.",
                    "Svätý Otče,<br>" +
                            "ty nás zhromažďuješ v spoločenstve Cirkvi;<br>" +
                            "prijmi prosby svojho ľudu<br>" +
                            "a urob nás svedkami tvojej prítomnosti vo svete.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"74", "4", "Bratia a sestry, prosme milosrdného Boha, aby každý človek v Duchu Svätom poznal Ježiša Krista, nášho Pána.",
                    "<font color='#B71C1C'>(</font>Volajme: Nech sme jedno srdce a jedna duša na tvoju slávu, Pane.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Modlime sa za svätú Cirkev, aby bola znakom jednoty a putom lásky.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Modlime sa za biskupov, kňazov a diakonov, aby naplnení Božou mocou oddane slúžili tým, ku ktorým boli poslaní.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Modlime sa za tých, ktorí nás spravujú, aby im bol Kristus žiarivým príkladom milosrdenstva a bratskej lásky.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Modlime sa za manželov, aby spoločne žili podľa príkladu lásky, akou obdaroval Kristus svoju nevestu Cirkev.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Modlime sa aj za nás samých, aby náš život viery bol príkladom pre našich blízkych.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Modlime sa za zosnulých <font color='#B71C1C'>(M.)</font>, aby sa im otvorila brána nebeského kráľovstva.",
                    "Bože, náš Otec,<br>" +
                            "ty obnovuješ svet milosťou svojho Ducha;<br>" +
                            "daj, nech dokážeme vyznávať svoju vieru<br>" +
                            "a nasledovať ťa tam, kam nás vedieš.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"75", "5", "Bratia a sestry, veríme, že Duch Svätý nám dáva nové srdce a vytvára z nás jednu Cirkev. V tejto viere vrúcne prosme.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Aby pastierska služba nášho pápeža <font color='#B71C1C'>M.</font> bola istotou viery pre všetkých veriacich, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Aby predstavitelia nášho štátu pamätali na to, že všetka ich moc pochádza od Boha, a starali sa o dobro všetkých ľudí, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Aby matky prijali každé počaté dieťa s vierou a láskou, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Aby kresťania verili v moc Boha, ktorému nič nie je nemožné, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Aby všetky kresťanské vyznania túžili po jednote, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Aby naši zosnulí <font color='#B71C1C'>(M.)</font> boli prijatí do domu nebeského Otca, prosme Pána.",
                    "Bože, ty si zveril apoštolovi Petrovi starosť o Cirkev;<br>" +
                            "prosíme ťa, vypočuj naše prosby<br>" +
                            "a daj nám silu,<br>" +
                            "aby sme ju verne milovali<br>" +
                            "a pričinili sa o jej plnú slobodu.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"76", "6", "Bratia a sestry, podľa vzoru spoločenstva apoštolov, zhromaždených vo večeradle s Máriou, žijeme v očakávaní daru Ducha Svätého pre Cirkev a pre celý svet. Prednesme Bohu jednomyseľne svoje prosby.",
                    "<font color='#B71C1C'>(</font>Volajme: Pane, vyslyš nás.<font color='#B71C1C'>)</font>",
                    "<font color='#B71C1C'>1.</font>&nbsp;Aby kresťania, posilnení darmi Ducha Svätého, boli jedno podľa vzoru trojjediného Boha, prosme Pána.<br>" +
                            "<font color='#B71C1C'>2.</font>&nbsp;Aby sa birmovanci dobre pripravili na prijatie darov Ducha Svätého, prosme Pána.<br>" +
                            "<font color='#B71C1C'>3.</font>&nbsp;Aby robotníci našli primeranú prácu, hladujúci chlieb a utrápení útechu, prosme Pána.<br>" +
                            "<font color='#B71C1C'>4.</font>&nbsp;Aby rodičia vedeli pomôcť svojim deťom pri hľadaní ich životného povolania, prosme Pána.<br>" +
                            "<font color='#B71C1C'>5.</font>&nbsp;Aby deti z detských domovov našli starostlivých opatrovateľov, prosme Pána.<br>" +
                            "<font color='#B71C1C'>6.</font>&nbsp;Aby naše <font color='#B71C1C'>(</font>farské<font color='#B71C1C'>)</font> spoločenstvo bolo poslušné vnuknutiam Ducha Svätého, prosme Pána.<br>" +
                            "<font color='#B71C1C'>7.</font>&nbsp;Aby zosnulí <font color='#B71C1C'>(M.)</font> dosiahli Božie milosrdenstvo a videli Boha z tváre do tváre, prosme Pána.",
                    "Bože, ty si apoštolom,<br>" +
                            "zhromaždeným s Pannou Máriou,<br>" +
                            "udelil Ducha Svätého;<br>" +
                            "prosíme ťa,<br>" +
                            "vypočuj naše prosby a daj,<br>" +
                            "aby sme sa zasvätili službe evanjelia<br>" +
                            "a všetkým ohlasovali veľké činy tvojej lásky.<br>" +
                            "Skrze Krista, nášho Pána."},
};
}
