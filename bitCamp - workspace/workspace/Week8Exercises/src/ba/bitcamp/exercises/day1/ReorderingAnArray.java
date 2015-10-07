package ba.bitcamp.exercises.day1;

import java.util.Arrays;

public class ReorderingAnArray {
	/*
	 * Napraviti metodu koja prima jedan niz brojeva. Promijeniti redoslijed
	 * elemenata u nizu tako da u
	 * 
	 * novonastalom nizu se prvo nalaze brojevi sa parnih indeksa, a poslije
	 * njih i brojevi sa neparnih
	 * 
	 * indeksa, npr. ako je dati niz {1, 1, 9, 9, 1, 5, 2, 4} onda novonastali
	 * niz je {1, 9, 1, 2, 1, 9, 5, 4}. Iako u ovom
	 * 
	 * zadatku nema toliko smisla, potrebno je koristiti for-each petlju!
	 */
	
	
	private static void reorderArray(int... arr) {
		int index = 0;
		int counter = 0;
		int a[] = new int[arr.length];
			
		for (int i : arr) {
			if(index % 2 == 0) {
				a[counter] = arr[index];
			} else if (index % 2 == 1) {
				//a[counter] = i;
			}
			index++;
			counter++;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int[] array = {1, 1, 9, 9, 1, 5, 2, 4};
		
		reorderArray(array);

	}

}
