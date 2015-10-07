package ba.bitcamp.boris.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		/**
		 * Povećati niz 
		 * Napisati program gdje vi, a ne korisnik, napravite jedan
		 * niz proizvoljne veličine i popunite ga sa proizvoljnim int
		 * vrijednostima. Napravite drugi, duplo veći, niz i popunite prvih pola
		 * indeksa sa vrijednostima prvoga niza. Ostatak niza će biti ispunjen
		 * nulama. Tako ste, zapravo, uradili „povećanje“ niza.
		 */
		
		Scanner input = new Scanner(System.in);
		int[] arr = new int [5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter values for " + i);
			arr[i] = input.nextInt();
		}
		System.out.println("First array " + Arrays.toString(arr));
		
		int[] arr2 = new int [10];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		System.out.println("First array copyed in second " + Arrays.toString(arr2));

	}

}
