package ba.bitcamp.boris.classes.day1;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();

		switch (a+b) {

		case 1:
			System.out.println("One");
			System.out.println("a je jedan");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Default");

		}

		input.close();

	}
}
