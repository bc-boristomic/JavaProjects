package ba.bitcamp.boris.classes.day3;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		/**
		 *  Find maximum number in array of five numbers.
		 *  First loop is to go thru numbers and enter them.
		 *  Second loop is to compare numbers and finds the largest.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter max five numbers");
				
		int[] firstFive = new int [5];
		
		for (int i = 0; i < firstFive.length; i++) {
			int num = input.nextInt();
			if (num > 0) {
				firstFive[i] = num;
			} else {
				break;
			}
		}

		int max = -1;
		for (int i = 0; i < firstFive.length; i++) {
			int element = firstFive[i];
			if (firstFive[i] > max) {
				max = element;
			}
		}
		System.out.println("Max is " + max);
		
		input.close();
	}

}
