package ba.bitcamp.classes.day2.task1;

public class Lokomotiva extends Baza {

	private int brojDimnjaka;

	public Lokomotiva(double duzina, double visina, double velicinaTocka, double velicinaKabine, final double procenatProzoraNaKabini, int brojDimnjaka) {
		super(duzina, visina, velicinaTocka);
		// kabina anonimna klasa bazirana na kvadratu
		dodajDio(new Kvadrat(velicinaKabine){
			@Override
			public double povrsina(){
				return super.povrsina() * (1-procenatProzoraNaKabini);
			}
		});
		
		// dodaj dimnjake, dimnjak je inner klasa
		for (int i = 0; i < brojDimnjaka; i++) {
			dodajDio(new Dimnjak(velicinaKabine));
		}
		
		// dodaj prednje svijelo
		ITijelo svjetlo = new ITijelo(){

			@Override
			public double povrsina() {
				return (visina / 2) * (visina/2) * Math.PI /2;
			}

			@Override
			public double obim() {
				return visina + visina * Math.PI;
				
			}
			
			};
			dodajDio(svjetlo);
			this.brojDimnjaka = brojDimnjaka;
	}
	
	
	@Override
	public String toString() {
		return String.format("Lokomotiva dimnjaka = %d", brojDimnjaka);
	}
	
	private class Dimnjak extends KompleksnoTijelo {
		public Dimnjak(double visina) {
			dodajDio(new Pravougaonik(visina/3, visina));
			dodajDio(new Pravougaonik(visina/3+10, 10));
		}
	}

}
