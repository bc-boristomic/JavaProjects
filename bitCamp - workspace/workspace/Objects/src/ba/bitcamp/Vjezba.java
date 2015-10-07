package ba.bitcamp;

public class Vjezba {
	public static void main(String[] args) {

		Planet pl = new Planet(1000, 600, "Lopta", "Pluton");
		pl.dodajMasu(80);
		pl.dodajMasu(64);
		System.out.println("PL masa: " + pl.vrijednostMase());
		System.out.println("PL tezina: " + pl.racunajTezinu());

		Planet bl = new Planet(435, 444, "Kocka", "Kockasia");
		if (bl != null) { // provjera da li je uopste unesena vrijednost
			bl.dodajMasu(-500);
			System.out.println("BL masa: " + bl.vrijednostMase());
		}
		System.out.println("BL tezina: " + bl.racunajTezinu());

		pl.dodajMasu(-500);
		System.out.println("PL masa: " + pl.vrijednostMase());
		System.out.println("PL tezina: " + pl.racunajTezinu());

	}

}