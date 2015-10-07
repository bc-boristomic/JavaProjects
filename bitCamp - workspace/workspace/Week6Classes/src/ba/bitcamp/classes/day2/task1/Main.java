package ba.bitcamp.classes.day2.task1;

public class Main {
	
	public static void main(String[] args) {
		
		ITijelo[] testTijela = new ITijelo[] {new Krug(1), new Pravougaonik(5, 10), new Kvadrat(5)};
		
		for (ITijelo tijelo : testTijela) {
			System.out.println(tijelo.toString());
			System.out.println("Povrsina: " + tijelo.povrsina());
			System.out.println("Obim: " + tijelo.obim());
			System.out.println();
		}
		
		KompleksnoTijelo komp = new KompleksnoTijelo();
		komp.dodajDio(new Krug(2));
		komp.dodajDio(new Pravougaonik(5, 11));
		//komp.dodajDio(komp);
		System.out.println(komp);
		
		
		Voz voz = new Voz(10, 3, 4);
		
		System.out.println(voz);
		
	}

}
