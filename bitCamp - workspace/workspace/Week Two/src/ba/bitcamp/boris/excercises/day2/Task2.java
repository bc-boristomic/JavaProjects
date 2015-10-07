package ba.bitcamp.boris.excercises.day2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		// ispisati zbir cifri n broja

		Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj");
		int n = in.nextInt();
		int sum = 0;

		for (int i = 1; i < n; i--) {
			if (n != 0) {
				int digit = n % 10;
				sum += digit;
				n /= 10;
			}
		}
		if (n == 0) {
			System.out.println(sum);
		}
		in.close();
	}
}