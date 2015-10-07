Pravite program za muzej.

1) Muzej ima eksponate. Svaki eksponat sadrži atribute id, ime i opis.

2) Pored standardnih eksponata, muzej čuva i umjetnička djela koja osim standardnih atributa 

koje ima svaki eksponat, sadrže i ime autra kao i period kome slika pripada. Period kome slika 

pripada je pobrojani (enum) tip koji sadrži vrijednosti Renesansa, Neoklasika, Moderna, 

Savremena umjetnost, ...

3) Muzej takođe posebnu brigu vodi o historijskim artefaktima koji pored standardnih atribura 

imaju i informaciju o porijeklu i periodu iz kog potiču. Period je također enum tip (klasika, 

srednji vijek, moderno doba, ...)

4) Za sve klase obavezno implementirati equals i toString metode.

5) Treba omogućiti da se eksponati sortiraju po imenu, za ovo nije dozvoljeno koristiti OrderBy 

nego treba da implementirate već postojeći interface comparable i koristiti .sort()

6) Muzej treba da ima uposlenike, možete uzeti da postoji samo jedna vrsta uposlenika.

7) Definišite interface searchable sa metodom fiitsSearch(string s). Ova metoda treba da vrati 

true ako neki od atributa tog objekta zadovoljavaju uslov pretrage (jednak je traženom stringu). 

Treba da pretražuju kroz sve atribute.

8) Koristeći gore navedeni interface omogućite da se eksponati i uposlenici muzeja pretražuju.

9) Napraviti mali testni program koji prikazuje šta ste implementirali.