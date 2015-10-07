package ba.bitcamp.classes.day2.task1;

public class Voz extends KompleksnoTijelo {
	
	public Voz(double duzinaBaze, double visinaBaze, int brojVagona){
		dodajDio(new Lokomotiva(duzinaBaze, visinaBaze, 10, duzinaBaze/2, 0.3, 2));
		for (int i = 0; i < brojVagona; i++) {
			dodajDio(new Baza(duzinaBaze, visinaBaze, 10));
		}
	}

	
//	@Override
//	public String toString() {
//		return super.toString().replace("Kompleksno tijelo (%s)", );
//	}
}
