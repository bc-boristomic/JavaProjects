package homework.day3;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {

		/**
		 * Napisati program koji popuni niz od 100 elemenata počevši od 0,
		 * uvećavajući za 1, a kada dođe do 9 ponovo se vratiti na 0, tj. 0, 1,
		 * 2, 3, ..., 9, 0, 1, ..., 8, 9, 0, ... . Isprintati taj niz na
		 * konzolu. 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 ...
		 * 
		 */
		
		int[] arr = new int [100];
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i < 10) {
					arr[i] = i;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
