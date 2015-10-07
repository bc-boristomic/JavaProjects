package ba.bitcamp.boris.classes.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch2 {

	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number");
		try {
		int a = input.nextInt();
		System.out.println(a);
		} catch (InputMismatchException e){
			System.out.println("You entered letter, not number.");
			e.printStackTrace();
			
		}
		
		System.out.println("End program.");
		
		
		input.close();
		
		
			
		
		
	}
	
}
