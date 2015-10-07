package homework.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		/**
		 * Napisati program u kojem korisnik unosi vrijednosti u dva niza
		 * veličine pet i tipa int. Ispisati na ekran da li su data dva niza
		 * identična, tj. imaju iste elemente na istim indeksima. Zabranjeno
		 * koristiti Arrays klasu. 
		 * Niz 1: Niz 1:
		 * Niz 2: Niz 2:
		 * Izlaz: Arrays are not identical Izlaz: Arrays are identical
		 * 1 -5 2 0 12 2 1 12 8 -7
		 * -5 1 12 0 2 2 1 12 8 -7
		 */

		Scanner input = new Scanner(System.in);
		
		int[] arr1 = new int [5];
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("Enter values for %d", i);
			arr1[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		
		
		int[] arr2 = new int [5];
		
		
		input.close();
	}

}
