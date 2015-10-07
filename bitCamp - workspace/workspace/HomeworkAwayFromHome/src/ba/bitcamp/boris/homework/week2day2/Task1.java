package ba.bitcamp.boris.homework.week2day2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		// okreni broj i izbaci nule 5.

		Scanner in = new Scanner(System.in);

		System.out.println("Input number with zeroes and I will exclude them for you.");
		int number = in.nextInt();

		int reverseNumber = 0;
		int reReverseNumber = 0;

		while (number != 0) {
			int digit = number % 10;
			if (digit != 0) {										// If next number is zero exclude it and go on.
				reverseNumber = reverseNumber * 10 + digit;
			}
			number = number / 10;
		}
		while (reverseNumber != 0) {								// Reverse reversed number (now without zeroes).
			reReverseNumber = reReverseNumber * 10 + (reverseNumber % 10);
			reverseNumber = reverseNumber / 10;
		}
		System.out.printf("Broj bez nula je %d", reReverseNumber);

		
		in.close();
	}
}
