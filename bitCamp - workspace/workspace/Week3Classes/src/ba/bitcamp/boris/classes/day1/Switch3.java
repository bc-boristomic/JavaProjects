package ba.bitcamp.boris.classes.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch3 {
	
	public static int getInput () {
		Scanner in = new Scanner(System.in);
		int number = 0;
		while (true) {
			try {
				System.out.println("Enter number");
				number = in.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("You entered letter, not number.");
				in.nextLine();
			}
		}
		return number;
		
	} 




	public static void main (String[]args){
	Scanner input = new Scanner(System.in);
	
	int num;
	int num2;
	
	
	while (true) {
		try { 
			System.out.println("Enter number.");
			num = input.nextInt();
			num2 = input.nextInt();
			break;	// We got the number, end loop.
		} catch (InputMismatchException e) {
			System.out.println("You entered letter, not number.");
			input.nextLine();
			
			
		}
			
	}

	System.out.println("End program");
	
	
	input.close();
	}
	
	
	
}
