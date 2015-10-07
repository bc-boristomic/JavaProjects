package ba.bitcamp.boris.excercises.day3;

public class Task3 {

	public static void main(String[] args) {
		// Zadatak III – Trocifreni Prosti Brojevi
		// Napisati program koji će ispisati sve trocifrene brojeve koji su
		// prosti, počevši od 101. Prost broj je
		// broj koji je djeljiv samo sa brojem jedan i sa samim sobom, npr. 5,
		// 13 i 17.

		for (int i = 101; i < 1000; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				System.out.println("Prosti brojevi veci od 101 su " + i);
			
			
			}
		}

	}

}
