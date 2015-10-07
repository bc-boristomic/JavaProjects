package ba.bitcamp.boris.day3;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {

		/**
		 * Napisati program koji će napraviti niz od deset brojeva. Popuniti taj
		 * niz sa random brojevima od 1 do 10. Isprintati taj niz na ekran preko
		 * foreach petlje.
		 */
		
		int[] tenNumbers = new int [10];
		
		for (int i : tenNumbers) {
			i = (int)(Math.random() * 10 + 1);
				System.out.println(i);
			}
		
		
		

	}

}
