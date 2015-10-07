package ba.bitcamp.boris.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		/**
		 * Broj ponavljanja svakog broja 
		 * Konstruisati program u kojem korisnik
		 * unese dužinu niza, a i elemente toga niza. Svi elementi su tipa int i
		 * moraju biti u opsegu 0 – 9. Ukoliko nisu, ispisati grešku i tražiti
		 * od korisnika da ponovo unese broj za taj isti indeks. Nakon toga,
		 * ispisati na ekran koliko se koja cifra ponavlja u tom nizu, npr.
		 * „Cifra 0 se pojavila 2 puta, 1 se pojavila 0 puta, ...“.
		 */
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter length of array");
		int length = input.nextInt();
		
		int[] arr = new int[length];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value at index " + i);
			int value = input.nextInt();
			if (value > -1 && value < 10){
				arr[i] = value;
			} else {
				System.out.println("That didn't pass, try again.");
				input.next();
			}
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
		System.out.println("Your array is " + Arrays.toString(arr));
		
		
		
		
		input.close();

	}

}
