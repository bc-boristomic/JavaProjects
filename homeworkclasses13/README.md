##Vjezbanje polimorfizma


Napraviti klasni model za racunanje povrsine i obima jednostavnih i kompleksnih geometrijskih tijela.

Osnovna geometrijska tijela koja bi se trebala podrzati su krug, pravougaonik i kvadrat.

Kompleksno tijelo treba imati mogucnost da se dodaje proizvoljan broj drugih geometrijskih tijela, i treba imati mogucnost ispisa i liste dijelova i njihovih povrsina. Implementacija treba da drzi dijelove u nizu, ali tako da niz ne ogranicava maksimalni broj dijelova.

Svaka od klasa bi trebala overridati i toString metodu, npr. "Krug{r=10}".

Napraviti i glavni program koji koristi ovaj model. Program bi trebao da napravi kompleksno tijelo "vozic" koje se sastoji od kompleksnih tijela lokomotiva, teretni vagon i putnicki vagon (vidi sliku).

Implementacija treba minimizirati dupliranje koda.

Primjer kako bi kod za kreriranje vagona i voza mogao izgledati:

// kod za kreiranje lokomotive i putnickog vagona

....

// kod za kreiranje vagona

KompleksnoTijelo vagon = new KompleksnoTijelo()

vagon.dodajDio(new Krug(10));

vagon.dodajDio(new Krug(10));

vagon.dodajDio(new Pravougaonik(100, 60))


Kompleksno tijelo voz = new KompleksnoTijelo();

voz.dodajDio(lokomotiva);

voz.dodaDio(putnickiVagon);

voz.dodajDio(vagon);


System.out.println("Povrsina voza je " + voz.povrsina())

System.out.println(voz);


Dodatno:

Napraviti i geometrijsko tijelo sa rupama.

Napraviti klase za lokomotivu, vagon, teretni vagon, putnicki vagon (prozori su rupe)

Kompleksno tijelo treba imati i metode sa var args, npr. voz.dodajDijelove(lokomotiva, putnickiVagon, vagon)