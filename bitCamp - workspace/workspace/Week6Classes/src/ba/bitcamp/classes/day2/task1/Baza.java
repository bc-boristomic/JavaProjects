package ba.bitcamp.classes.day2.task1;

public class Baza extends KompleksnoTijelo {
	
	private double duzina;
	private double visina;
	private double velicinaTocka;

	public Baza(double duzina, double visina, double velicinaTocka){
		dodajDio(new Krug(velicinaTocka));
		dodajDio(new Krug(velicinaTocka));
		dodajDio(new Pravougaonik(duzina, visina));
		this.duzina = duzina;
		this.visina = visina;
		this.velicinaTocka = velicinaTocka;
		
	}
	
	@Override
	public String toString() {
		return String.format("Duzina baze: %f, visina baze: %f, velicina tocka: %f", duzina, visina, velicinaTocka);
	}

}
