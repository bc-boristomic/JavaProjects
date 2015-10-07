package ba.bitcamp.exercises.day3;

import java.util.Arrays;

public class ShiftingAnArray {

	private static char[] fastForward(char[] c) {
		char[] tmp = new char[c.length];
		for (int i = 1; i < c.length; i++) {
			tmp[0] = c[0];
			tmp[i] = c[i-1];
		}
		return tmp;
	}

	public static void main(String[] args) {

		char[] array = { 'A', 'B', 'C', 'D' };
		
		System.out.println(Arrays.toString(array));
		System.out.println(fastForward(array));
	
	}

}
