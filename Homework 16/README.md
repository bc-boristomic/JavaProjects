
#HOMEWORK #16
###TASK 1
Uraditi sve zadatke sa vježbi!

###TASK 2
Napisati klasu koja opisuje jednu firmu. Firmu opisuju sljedeći atributi:
1. Ime firme
2. Direktor firme (koristiti Employee klasu)
3. Niz zaposlenih radnika (koristiti Employee klasu)
Bitno je naglasiti da se i direktor smatra zaposlenikom u firmi, ali se ne nalazi u nizu zaposlenih radnika.
Svaki radnik (Employee) je objekat opisan sljedećim atributima:
4. Ime osobe
5. Spol
6. Mjesečna plata
Svaki atribut je private i svaki ima get metodu. Samo atribut koji opisuje mjesečnu platu ima set
metodu. Pored toga, klasa Employee treba sadržavati i konstruktor koji inicijalizira sve atribute.
Metode koje se nalaze u klasi koja opisuje firmu su:
7. Metoda koja vraća koliko je zaposlenih u firmi
8. Metoda koja vraća koliko ukupno se daje novca za zaposlene, tj. njihove plate
9. Metoda koja određuje koliko ima zaposlenih žena u firmi
10. Metoda koja povećaje svim zaposlenim platu za datu sumu novca
11. toString metoda koja stavlja ime firme, ime direktora i broj radnika u String


#Zadaci za vježbe
##Programming with Objects
###Zadatak 1

Napisati klasu koja opisuje temperaturu napolju. Temperatura je spremljena u jedan atribut, u °C.
 Napisati konstruktor koji inicijalizira vrijednost temperature
 Napisati metodu getTemperatureInC() koja vraća temperaturu u Celzijusima
 Napisati metodu getTemperatureInK() koja vraća temperaturu u Kelvinima
 Napisati metodu getTemperatureInF() koja vraća temperaturu u Farenhajtim
 Napisati metodu setTemperature(int) koja postavlja vrijednost temperature
 Napisati javadoc za sve metode

###Zadatak 2
Napisati klasu koja opisuje čašu. Čaša prima samo jednu vrstu tečnosti. Dati objekat opisuju tri atributa, vrsta
tečnosti, količinu tečnosti i maksimalnu količinu tečnosti.
 Napisati konstruktor koji inicijalizira količinu na 0, vrstu na null i max. količinu na datu vrijednost
 Napisati metodu getTypeOfLiquid() koja vraća tip tečnosti koji se nalazi u čaši
 Napisati metodu getMaxCapacity() koja vraća maksimalni kapacitet čaše
 Napisati metodu getCurrentCapacity() koja vraća trenutni kapacitet čaše
 Napisati metodu addLiquid(String, int) koja dodaje neku količinu nekog tipa tečnosti u čašu
o Ukoliko čaša sadrži tečnost koja nije kao data onda ništa ne raditi
o Ukoliko čaša sadrži tečnost koja je i data onda povećati za datu količinu

Svaki višak tečnosti se „prelije“ i trenutni kapacitet bude isti kao i maksimalni
 Napisati metodu emptyGlass() koja „prospe“ svu tečnost iz čaše
 Napisati javadoc za sve metode

###Zadatak 3
Napisati klasu koja opisuje jedan printer. Printer ima sljedeće atribute:
 Ime printera
 Količina papira u printeru
 Količina tinte u printeru
 Ukupno isprintano stranica
Printer ima sljedeće konstruktore:
 Prazni konstruktor koji inicijalizira ime na „DefaultPrinter“, a količinu papira i tinte na 0
 Konstruktor koji inicijalizira ime na dati parametar, a količinu papira i tinte na 0
o Oba konstruktora inicijaliziraju ukupno isprintano stranica na 0
Printer ima sljedeće metode:
 Metoda koja vraća da li ima tinte (true/false)
 Metoda koja vraća da li ima papira (true/false)
 Metoda koja vraća koliko je ukupno isprintano stranica od tog printera
 Metoda koja dodaje papira u printer (void metoda)
o Uzeti u obzir da se ne može imati više od 100 papira u printeru

Metoda koja napuni tintu na max. (void metoda)
o Maksimalno tinte je 100

Metoda koja „printa“ stranice papira (void metoda)
o Metoda prima int parametar koji predstavlja koliko stranica isprintati
o Za svaku isprintanu stranicu oduzeti jedan papir iz printera
o Za svaku isprintanu stranicu oduzeti tri iz atributa tinta
o Ukoliko nema papira ili ako nema tinte onda ne treba printati
Pored toga Printer klasa sadrži sljedeće:
toString metodu koja printa ime printera i trenutno stanje
o Stanje može biti „Ready“, „No ink“, „No paper“, „No ink nor paper“
static varijablu koja bilježi koliko ukupno stranica je isprintano
o Napisati i metodu koja vraća vrijednost te varijable
Napisati malu demonstraciju rada vaše klase u main metodi.
