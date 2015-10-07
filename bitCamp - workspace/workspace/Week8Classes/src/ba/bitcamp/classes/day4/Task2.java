package ba.bitcamp.classes.day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

	private static int findElement(int[] array, int element) {
		for (int i = 0; i < array.length; i++) {
			if(element == array[i]) {
				return i;
			}
		}
		return -1;
	}
	
	private static int binarySearch(int[] array, int value) {
		int min = 0;
		int max = array.length - 1;
		
		while (min <= max) {
			int mid = (min + max) / 2;
		
			if (array[mid] == value) {
				return mid;
			} else if (array[mid] > value) { // check if value is on the left
				max = mid - 1;
			} else { // value is on the right
				min = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int length = 100000000;
		int[] array = new int[length];
		
		for (int i = 0; i < length; i++) {
			array[i] = i;  //rand.nextInt(length * 2);
		}
		
		//System.out.println("Unsorted array\t " + Arrays.toString(array));
		Arrays.sort(array);
		//System.out.println("Sorted array\t " + Arrays.toString(array));

		long start = System.currentTimeMillis();
		System.out.println(findElement(array, 23690000));
		System.out.println(System.currentTimeMillis() - start);
		
		long s = System.currentTimeMillis();
		System.out.println(binarySearch(array, 23690000));
		System.out.println(System.currentTimeMillis() - s);
		
	}

}
