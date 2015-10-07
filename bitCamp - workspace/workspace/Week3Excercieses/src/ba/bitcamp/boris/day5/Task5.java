package ba.bitcamp.boris.day5;

import java.util.Arrays;

/**
 * Napisati metodu koja prima jedan cijeli broj N i M. Iz metode vratiti niz
 * dužine 10, i ispunjen brojevima M od
 * 
 * indeksa N. Pored toga, metoda mora throw-ati exception ako indeks ne valja.
 * 
 * Metoda: int[] getArray(int n, int m)
 * 
 * Primjeri
 * 
 * getArray(2, 1)
 * 
 * getArray(0, 5)
 * 
 * getArray(10, 2) IndexOutOfBoundsException
 * 
 * getArray(-1, 3) IndexOutOfBoundsException
 * 
 * 0 0 1 1 1 1 1 1 1 1
 * 
 * 5 5 5 5 5 5 5 5 5 5
 *
 */
public class Task5 {

	public static int[] getArray(int n, int m) {
		int[] arr = new int[10];
		try {
			if (n < 0) {
				throw new IndexOutOfBoundsException();
			} else if (n >= arr.length) {
				throw new IndexOutOfBoundsException();
			}

			for (int i = n; i < arr.length; i++) {
				arr[i] = m;
			}
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("No index");
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray(11, 5)));
	}

}
