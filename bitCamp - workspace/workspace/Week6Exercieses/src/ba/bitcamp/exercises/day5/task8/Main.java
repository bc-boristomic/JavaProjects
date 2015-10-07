package ba.bitcamp.exercises.day5.task8;

import java.util.Arrays;

public class Main {

	private static void fillArray2(int[] arr, int i) {
		arr[i] = i;
		fillArray2(arr, i - 1, i - 1, true);
		fillArray2(arr, i + 1, i - 1, false);
	}

	
	private static void fillArray2(int[] arr, int i, int j, boolean b) {
		int c = 0;
		if(arr.length > c) {
			return;
		}
		if (true) {
			c++;
			if (arr.length == j) {
				return;
			}
			arr[i] = j;
			fillArray2(arr, i-1, j-1, b);
		} else { 
			c--;
			if (arr.length == j){
				return;
			}
			arr[i]=j;
			fillArray2(arr, i-1, j-1, b);
			}
		
		
		
		
	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		fillArray2(arr, 3);
		System.out.println(Arrays.toString(arr));
	}
	
	
	

}
