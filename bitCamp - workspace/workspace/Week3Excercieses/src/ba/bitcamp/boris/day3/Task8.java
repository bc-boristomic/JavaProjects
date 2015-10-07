package ba.bitcamp.boris.day3;

import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {

		/**
		 * Sabrati dva broja 
		 * Iskodirati program gdje vi, a ne korisnik,
		 * napravite dva niza tipa int, proizvoljne veličine, sa unesenim
		 * vrijednostima od 0 do 9, tj. samo cifre. Napraviti treći niz, sabrati
		 * dva niza i staviti ga u treći niz. Primjer: niz1 = {9, 5, 2, 3}, dok
		 * je niz2 = {4, 8, 7}. Kada se saberu dobit će se treći niz koji će
		 * imati elemente 1, 0, 0, 1, 0.
		 */
		
		int[] arr1 = {9, 5, 2, 3};
		int[] arr2 = {4, 8, 7};
		int[] arr3 = new int[arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i] + arr2[i]; 
		}
		
		for (int i = 3; i < arr2.length; i++) {
			arr3[i] = arr2[i];
		}
		System.out.println("First + Second array in third \n" + Arrays.toString(arr3));
		 
		 

	}

}
