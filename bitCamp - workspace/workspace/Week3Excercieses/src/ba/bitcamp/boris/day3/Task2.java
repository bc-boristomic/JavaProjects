package ba.bitcamp.boris.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		/**
		 * Niz sa unešenom dužinom 
		 * Napraviti program u kojem se korisnik preko
		 * konzole pita koliko će dug niz biti. Zatim napraviti taj niz i pitati
		 * korisnika da unese sve te vrijednosti. Isprintati taj niz na ekran.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of array");
		int length = input.nextInt();
		
		int[] arr = new int [length];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter values for " + i);
			arr[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		
		input.close();

	}

}
