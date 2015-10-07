package ba.bitcamp.exercises.day5.task5;

import java.util.Arrays;

public class Main {
	
	private static void fillArray(int[] arr) {
		if (arr.length == 0){
			return;
		}
		fillArray(arr, 0);
	}

	private static void fillArray(int[] arr, int i) {
		if(arr.length == i){
			return;
		}
		arr[i] = i+1;
		fillArray(arr, i+1);
		
	}

	public static void main(String[] args) {

		int[] arr = new int[6];

		fillArray(arr);

		System.out.println(Arrays.toString(arr));
	}
}
