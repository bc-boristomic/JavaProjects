package ba.bitcamp.boris.homework.week2day2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*Sum of all digits in a number.
		 */

		Scanner in = new Scanner(System.in);

		System.out.println("Input number");

		int num = in.nextInt();
		int sum = 0;
		int num2 = num;	// backup

		for (int i = 0; i < num; i--) {
			if (num != 0) {
				int digit = num % 10;	// give last number
				sum += digit;	//add last number to sum
				num /= 10;	// give numbers before last
			}
		}
		System.out.printf("Sum of digits in your number %d is %d", num2, sum);

		in.close();

	}

}
