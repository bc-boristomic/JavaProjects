package ba.bitcamp.classes.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(55, 12, 64, 3, 7, 6, 1, -15, 3, -2));
		
		System.out.println("Unsorted list\t " + list);
		Collections.sort(list);
		System.out.println("Sorted list\t " + list);
		
		Integer[] array = { 55, 12, 64, 3, 7, 6, 1, -15, 3, -2 };
		

		System.out.println("Unsorted array\t " + Arrays.toString(array));
		
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
		//}
		
		//for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					isSorted = false;
				}
			}
		}
				
		//Arrays.sort(array);
		System.out.println("Sorted array\t " + Arrays.toString(array));

		
	}

}
