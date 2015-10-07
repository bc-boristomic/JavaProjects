package ba.bitcamp.boris.day1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesi broj");
		int n = input.nextInt();
		int factoriel = 1;

		for (int i = 1; i <= n; i++) {
			factoriel = factoriel * i;
			if (factoriel % 10 == 0) {		// If last digit is zero,
				factoriel = factoriel / 10; // Divide by 10 to get rest of digits.
			}

		}
		System.out.println(factoriel % 100); // Get last two digits without, 
											//zeros and without first numbers.

		input.close();

	}

}
