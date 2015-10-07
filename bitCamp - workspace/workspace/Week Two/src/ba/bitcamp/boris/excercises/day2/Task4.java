package ba.bitcamp.boris.excercises.day2;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		// calculate even and odd numbers before entering 0
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj");
		int n;
		int c1 = 0, c2 = 0;

		do {
			n = in.nextInt();
			if (n % 2 == 0 && n != 0) {
				System.out.println("Probajte ponovo");
				c1++;
			}
			if (n % 2 != 0) {
				System.out.println("Probajte ponovo");
				c2++;
			}

		} while (n != 0);
		System.out.printf("Upisali ste nulu! Bravo! \nPrije toga ste upisali %d parnih i %d neparnih brojeva",	c1, c2);

	}

}
