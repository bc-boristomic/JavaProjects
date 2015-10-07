package ba.bitcamp.boris.day2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("Enter first number");
				int a = input.nextInt();
				System.out.println("Enter second number");
				int b = input.nextInt();
				System.out.println("a/b is " + a/b);
				break;
			} catch (Exception ex) {
				System.out.println("Your entry was wrong");
				input.nextLine();
			}
		}
		
		
		
		input.close();

	}

}
