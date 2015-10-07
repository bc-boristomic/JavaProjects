package ba.bitcamp.boris.day3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		/**
		 * Ponavljanje brojeva u nizu 
		 * Iskodirati program gdje se korisnik pita
		 * koliko će brojeva unijeti. Zatim unijeti sve te elemente, koji su
		 * tipa int, u niz. Na kraju će se korisnik pitati koji broj želi da se
		 * prebroji. Provjeriti koliko se taj broj pojavljuje u nizu i
		 * isprintati na ekran.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of array");
		int length = input.nextInt();

		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for each " + i);
			arr[i] = input.nextInt();
		}
		int c = 0;
		System.out.println("Which number you want to count?");
		int num = input.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				c++;
			}			
		}
		System.out.printf("Number %d appeared %d times\n", num, c);

		input.close();

	}

}
