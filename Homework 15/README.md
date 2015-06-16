# HOMEWORK #15

###TASK 1
Napisati klasu koja opisuje jednu kasu. Kasa sadrži:
Atribut (private) koji opisuje ime, npr. “Moja kasa”, “Za more”, “Crni fond”, itd.
Atribut (private) koji opisuje trenutnu sumu novca u kasi
Konstruktor koji inicijalizira ime objekta (ne i trenutnu sumu novca)
Metoda koja dodaje novac u kasu, npr. dodaj 20 u kasu bi bilo addMoney(20)
Metoda koja vadi sav novac iz kase, npr. ako je bilo 20 onda će postati 0
Metoda koja ispisuje koliko novca ima u kasi na sljedeći način:
o Ako nema nikako onda ispisuje “It is empty...”
o Ako ima između 1 i 20 ispisuje “There’s some, but not much.”
o Ako ima između 21 i 100 ispisuje “There’s some.”
o Ako ima 101 ili više onda ispisuje “There’s a lot.”

PRIMJER
Safe s = new Safe(„Crni fond“);
s.printInformation(); // Isprinta „It is empty...“
s.addMoney(30); // Doda 30 KM u kasu
s.printInformation(); // Isprinta „There's some.“
s.addMoney(100);
s.printInformation(); // Isprinta „There's a lot.“
s.clear(); // Isprazni sef/kasu
s.printInformation(); // Isprinta „It is empty...“

###TASK 2
Napisati klasu koja opisuje jednu životinju. Životinju opisuju sljedeći atributi:

Atribut (private) koji opisuje ime životinje
Atribut (private) koji opisuje da li je životinja aktivna danju ili noću
o Vrijednost 1 znači da je životinja aktivna danju
o Vrijednost 2 znači da je životinja aktivna noću
Atribut (private) koji opisuje koliko je životinji potrebno vode
o Vrijednost 1 znači da je životinji potrebno malo vode
o Vrijednost 2 znači da je životinji potrebno više vode
o Vrijednost 3 znači da je životinji potrebno mnogo vode
Napraviti konstruktor koji inicijalizira ta tri atributa
Pored toga, sve te životinje dijele isto stanište. Stanište je potrebno predstaviti u istoj klasi kao i životinje,
tj. bez korištenja dodatnih klasa. To stanište je opisano sa dvije varijable:
Da li je noć ili dan (private) koje je po default-u 1
o Vrijednost 1 znači da je dan
o Vrijednost 2 znači da je noć
Koliko vode ima stanište (private) koje je po default-u 1
o Vrijednost 0 znači da stanište nema vode
o Vrijednost 1 znači da stanište posjeduje malo vode
o Vrijednost 2 znači da stanište posjeduje više vode
o Vrijednost 3 znači da stanište posjeduje mnogo vode

Životinje imaju samo jednu metodu:
Isprintati kakvo je trenutno stanje životinje
o Ukoliko doba dana odgovara životinji i ona ima dovoljno vode za sebe
Isprintati “It’s fine. The animal is active and has water.”
o Ukoliko doba dana odgovara, ali nema dovoljno vode
 Isprintati “The animal is active, but does not have enough water.”
o Ukoliko doba dana ne odgovara, ali ima dovoljno vode
 Isprintati “The animal is not active, but has enough water.”
o Ukoliko doba dana ne odgovara, niti ima dovoljno vode
 Isprintati “The animal is not active and it does not have enough water.”
Postoji još jedna metoda koja utiče na stanište:
Promijeni doba dana
o Ako je bila noć onda postaje dan (nakon poziva metode)
o Ako je bio dan onda postaje noć (nakon poziva metode)

Promijeni koliko vode trenutno ima (static set metoda)
PRIMJER

Animal a1 = new Animal(„Animal 1“, 1, 1);
Animal a2 = new Animal(„Animal 2“, 2, 3);

a1.printStatus(); // „It’s fine. The animal is active and has water.”
a2.printStatus(); // “The animal is not active and it does not have enough water.”

Animal.cycleDayNight(); // Dan prelazi u noć
Animal.setAmountOfWater(3); // Sada vrijednost vode prelazi na 3

a1.printStatus(); // “The animal is not active, but has enough water.”
a2.printStatus(); // “It’s fine. The animal is active and has water.”
