package ba.bitcamp.exercises.day3;

import java.util.Arrays;

public class FillArray {

	private static int[] fillArray(int length, int value, int startIndex, int endIndex) {
		int[] array = new int[length];
		Arrays.fill(array, -1);
		Arrays.fill(array, startIndex, endIndex, value);
		return array;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(fillArray(10, 3, 2, 6)));

	}

}
