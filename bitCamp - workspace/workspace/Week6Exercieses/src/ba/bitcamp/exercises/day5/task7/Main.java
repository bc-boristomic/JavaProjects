package ba.bitcamp.exercises.day5.task7;

public class Main {
	
	
	private static boolean areTheSame(int[] arr1, int[] arr2) {
		return areTheSame(arr1, arr2, 0);
	}
	
	private static boolean areTheSame(int[] arr1, int[] arr2, int i) {
		if (arr1.length == i){
			return true;
		}
		if (arr1[i] != arr2[i]){
			return false;
		}
		return areTheSame(arr1, arr2, i+1);
	}


	public static void main(String[] args) {
		int[] arr1 = {1, 4, 3, 2, 9};
		int[] arr2 = {1, 4, 3, 2, 5};
		System.out.println(areTheSame(arr1, arr2));
	}

	

}
