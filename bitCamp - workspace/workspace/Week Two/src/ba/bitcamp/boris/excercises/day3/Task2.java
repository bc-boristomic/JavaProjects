package ba.bitcamp.boris.excercises.day3;

public class Task2 {

	public static void main(String[] args) {
		// Zadatak II – Dvocifreni Neparni Brojevi Napisati program koji će ispisati 
		//sve dvocifrene brojeve koji su neparni, počevši od 11.

		
		for (int i = 11; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		
	}

}
