package ba.bitcamp.boris.day3;

import java.util.Arrays;

public class Task7 {

	public static void main(String[] args) {
		/**
		 * Dva niza u jedan niz Napraviti program gdje vi, a ne korisnik,
		 * napravite dva niza, proizvoljne dužine, i odmah unesete vrijednosti
		 * (npr. int[] array1 = {1, 5, 2, 3}). Napravite treći niz sa dovoljnom
		 * veličinom da može prihvatiti i prvi i drugi niz. Stavite prvi, zatim
		 * i drugi niz, u taj novi niz i isprintati taj treći niz na konzolu.
		 */
		
		int[] arr1 = {1, 5, 2, 3};
		int[] arr2 = {2, 8, 5, 0, 3};
		
		int[] arr3 = new int[arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		System.out.printf("First in third \n" + Arrays.toString(arr3) + "\n");

		for (int i = 0; i < arr2.length; i++) {
			arr3[4 + i] = arr2[i];
		}
		System.out.printf("First and second in third \n" + Arrays.toString(arr3));
	}

}
