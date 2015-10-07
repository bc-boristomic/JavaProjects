package ba.bitcamp.boris.day5;

import java.util.Arrays;

public class Task7 {
	/**
	 * Napisati metodu koja prima jedan cijeli broj N i K. Iz metode vratiti niz
	 * dužine N, i ispunjen brojevima od 1 do K. * Pretpostavite da brojevi N i
	 * K će uvijek biti veći od 0.
	 * 
	 * Metoda: int[] getArray2(int n, int k)
	 * 
	 * Primjeri * getArray2(9, 5) * getArray2(11, 3) * getArray2(5, 1) *
	 * getArray2(7, 100) * 1 2 3 4 5 1 2 3 4 * 1 2 3 1 2 3 1 2 3 1 2 * 1 1 1 1 1
	 * * 1 2 3 4 5 6 7
	 */

	public static int[] getArray2(int n, int k) {
		int[] arr = new int[n];
		int counter = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = counter;
			counter++;
			if (counter == k + 1) {
				counter = 1;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray2(30, 6)));
	}

}
