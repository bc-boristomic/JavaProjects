package ba.bitcamp.boris.excercises.day3;

public class Task4 {

	public static void main(String[] args) {
		// Zadatak IV – Četverocifreni Palindromi
		// Napisati program koji će ispisati sve četverocifrene brojeve koji su
		// palindromi, počevši od 1001.
		// Palindromski brojevi su brojevi koji imaju istu vrijednost gledajući
		// broj sa lijeva ili desna, npr. 202.

		for (int i = 1000; i < 10000; i++) {

			int d1 = i % 10;
			int d2 = i / 10 % 10;
			int d3 = i / 100 % 10;
			int d4 = i / 1000 % 10;

			int reverse = d1 * 1000 + d2 * 100 + d3 * 10 + d4;

			if (i == reverse) {
				System.out.println(i);
			}
		}

			
		
		
		
		
		
	}

}
