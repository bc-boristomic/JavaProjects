package ba.bitcamp.boris.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		/**
		 * Program koji, za dati mjesec, odredi, tj. ispiše na ekran, koje je
		 * godišnje doba. Ukoliko neki mjesec ima više godišnje doba uzeti ono
		 * koje ima više dana u tom mjesecu. Uraditi preko if i preko switch
		 * komandi!  
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi mjesec");
		
//		if (month == 1 && month == 2) {
//			System.out.println("It's winter.");
//		} else if (month == 3) {
//			System.out.println("Winter is passing. Here comes spring!");
//		} else if (month == 4 && month == 5) {
//			System.out.println("Spring time!");
//		} else if (month == 6) {
//			System.out.println("Spring is passing, Summer is coming");
//		} else if (month == 7 && month == 8) {
//			System.out.println("Summer time");
//		} else if (month == 9) {
//			System.out.println("Autumn is coming soon, summer is passing");
//		} else if (month == 10 && month == 11) {
//			System.out.println("Rainy days");
//		} else if (month == 12) {
//			System.out.println("Winter is coming!!");
//		} else {
//			System.out.println("Seems like you didn't enter month");
//		}
//		
		
		try {
			int month = input.nextInt();
		
		switch (month) {
		case 1: 
			System.out.println("It's winter - January");
		case 2: 
			System.out.println("It's winter - February");
		case 3:
			System.out.println("Winter is passing - March");
			System.out.println("Spring is coming - March");
			break;
		case 4:
			System.out.println("Spring time - April");
			
		case 5: 
			System.out.println("Spring time - May");
			
		case 6:
			System.out.println("Spring is passing - June");
			System.out.println("Summer is coming - June");
			break;
		case 7: 
			System.out.println("Summer time - Junly");
		case 8:
			System.out.println("Summer time - August");
			
		case 9: 
			System.out.println("Summer is passing - September");
			System.out.println("Autumn is coming - September");
			break;
		case 10:
			System.out.println("Autumn time - October");
			
		case 11:
			System.out.println("Autumn time - November");
		case 12:
			System.out.println("Autumn is passing - December");
			System.out.println("Winter is coming!! - December");
			break;
			default:
				System.out.println("You didn't enter month!");
		}
		} catch (InputMismatchException ex) {
			System.out.println("Please enter number, integer value!");
			System.out.println("Your error is");
			ex.printStackTrace();
		} 
		
		input.close();
	}

}
 