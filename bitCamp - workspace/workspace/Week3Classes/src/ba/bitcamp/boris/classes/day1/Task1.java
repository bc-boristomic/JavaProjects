package ba.bitcamp.boris.classes.day1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		/**
		 * unos od korisnika string, neki izraz 1 + 2, ispisati rezultat
		 * izraza... metoda iz String i Integer klase..
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number, mathematic operation, and number");
		String s = input.nextLine();
		int l = s.length();

//		try {
//
//			int sum = 0;
//			int num1 = Integer.parseInt(s.substring(0, 1));
//			int num2 = Integer.parseInt(s.substring(2, 3));
//
//			if (s.charAt(1) == '+') {
//				sum = num1 + num2;
//				System.out.println("Sum of numbers is " + sum);
//			} else if (s.charAt(1) == '-') {
//				sum = num1 - num2;
//				System.out.println("Subtraction of numbers is " + sum);
//			}
//		} catch (NumberFormatException e) {
//			System.out.println("Your entry was wrong!");
//			e.printStackTrace();
//		}

		int sum = 0;
		int a = s.indexOf('+');
		int b = s.indexOf('-');
		char c = s.charAt(s.indexOf('+'));
		
		char d = s.charAt(s.indexOf('-'));
		System.out.println(d);
		
		int num1 = Integer.parseInt(s.substring(0, a));
		int num2 = Integer.parseInt(s.substring(a+1, l));
		
		if (c == '+') {
			sum = num1 + num2;
			System.out.println("Sum of multiple digits " + sum);
		} else if (d == '-'){
			sum = num1 - num2;
			System.out.println("Subtraction of multiple digits " + sum);
		}

		
		
		
		
		input.close();

	}

}
