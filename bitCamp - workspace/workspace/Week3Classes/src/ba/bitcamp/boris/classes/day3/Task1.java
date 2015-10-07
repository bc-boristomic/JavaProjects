package ba.bitcamp.boris.classes.day3;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj");
		int num1 = input.nextInt();
		
		System.out.println("Unesite drugi broj");
		int num2 = input.nextInt();
		
		System.out.println("Unesite treci broj");
		int num3 = input.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Prvi uneseni broj je najveci");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Drugi uneseni broj je najveci");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("Treci uneseni broj je najveci");
		}
		
		
		input.close();

	}

}
