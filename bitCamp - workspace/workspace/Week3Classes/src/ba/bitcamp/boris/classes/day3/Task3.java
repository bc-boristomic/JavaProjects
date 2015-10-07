package ba.bitcamp.boris.classes.day3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		System.out.println("Enter max five elements");
		int maxNumberElements = input.nextInt();
		int i = 0;
		int[] lastNumbers = new int [maxNumberElements];
		
		while (true) {
			int num = input.nextInt();
			if (num >= 0) {
				lastNumbers[i] = num;
				i++;
				if (i == lastNumbers.length) {
					i = 0;
				}
			} else {
				break;
			}
		}
		
		int max = -1;
		for (int j = 0; i < lastNumbers.length; j++) {
			int element = lastNumbers[j];
			if (lastNumbers[j] > max) {
				max = element;
			}
		}
		System.out.println("Max is " + max);
			
		
		input.close();
		
	}

}
