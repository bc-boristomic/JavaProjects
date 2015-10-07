package ba.bitcamp.boris.day2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Enter number string.");
			String a = input.nextLine();
			int b = Integer.parseInt(a);
			System.out.println(b);
		} catch (NumberFormatException ex) {
			System.out.println("Can't convert math signs to int value!");
			System.out.println("Your error is");
			ex.printStackTrace();
		}
		
		
		
		try {
			System.out.println("Enter number to divide");
			int a = input.nextInt();
			int c = a / 0;
			System.out.println(c);
		} catch (ArithmeticException ex) {
			System.out.println("Cant't divide by zero!");
			System.out.println("Your error is");
			ex.printStackTrace();
		}
	
		
		
		try {
			System.out.println("Read from file");
			TextIO.readFile("text.txt.");
		} catch (IllegalArgumentException ex) {
			System.out.println("No file to read from.");
			System.out.println("Your error is");
			ex.printStackTrace();
		}
		
		try {
			String.copyValueOf(null, 0, 0);
		} catch (NullPointerException ex) {
			System.out.println("Seems like there is no values.");
			System.out.println("Your error is");
			ex.printStackTrace();
		}
		
		input.close();
		
		

	}

}
