public class Task2 {

	public static void main(String[] args) {

		
		// Kako napisati manje i za sve eksponente 2?
		int n = 4;	// Kontejneri
		int k = 1;	// Kapacitet
		int prvi = n / k; // Provjera da li se svi mogu sloziti jedan u drugi (djeljivost sa 2)
		int exponent; // Jedini brojevi djeljivi sa 2 do kraja (slaganja kontejnera)
		int dodatni; // Koliko treba dodatnih
		for (int i = 1; i > 0;) { // Racunaj eksponent 2 do kraja int vrijednosti...
			i = i * 2;
			exponent = i;
			if (prvi == exponent) {
				System.out.println("Ne treba");
				break;
			} else if (prvi != exponent) { // Ako se ne mogu sloziti do kraja, uzmi slijedeci veci eksponent od broj kontejnera i daj ostatak djeljenja, to su dodatne kutije.
				if (2 < n && n < 4) {
					dodatni = 4 % n;
					System.out.printf("Mujo treba %d dodatnih kontejnera",
							dodatni);
				} else if (prvi != exponent && 4 < n && n < 8) {
					dodatni = 8 % n;
					System.out.printf("Mujo treba %d dodatnih kontejnera",
							dodatni);
				} else if (prvi != exponent && 8 < n && n < 16) {
					dodatni = 16 % n;
					System.out.printf("Mujo treba %d dodatnih kontejnera",
							dodatni);
				} else if (prvi != exponent && 16 < n && n < 32) {
					dodatni = 32 % n;
					System.out.printf("Mujo treba %d dodatnih kontejnera",
							dodatni);
					break;
				} else if (prvi != exponent && 32 < n && n < 64) {
					dodatni = 64 % n;
					System.out.printf("Mujo treba %d dodatnih kontejnera",
							dodatni);
				} else if (prvi != exponent && 64 < n && n < 128) {
					dodatni = 128 % n;
					System.out.printf("Mujo treba %d dodatnih kontejnera",
							dodatni);
				} else if (prvi != exponent && 128 < n && n < 256) {
					dodatni = 256 % n;
					System.out.printf("Mujo treba %d dodatnih kontejnera",
							dodatni);
				} else if (prvi != exponent && 256 < n && n < 512) {
					dodatni = 512 % n;
					System.out.printf("Mujo treba %d dodatnih kontejnera",
							dodatni);
				} else { // U suprotno, djeljenje kontejnera i kapaciteta je jednako eksponentu 2 i ne treba doadatnih.
					System.out.println("Ne treba dodatnih kontejnera.");
				}
			}

		}
	}
}
