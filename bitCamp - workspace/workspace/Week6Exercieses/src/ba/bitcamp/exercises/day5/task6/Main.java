package ba.bitcamp.exercises.day5.task6;

public class Main {
	
	public static boolean isInArray(int[] array, int num){
		if (array.length == 0) {
			return false;
		}
		return isInArray(array, num, 0);
	}

	
	private static boolean isInArray(int[] array, int num, int i) {
		if (array.length == i) {
			return false;
		}
		if (array[i] == num) {
			return true;
		}
		return isInArray(array, num, i + 1);
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[] array = {1, 4, 3, 2, 5};
		int num = 7;
		
		System.out.println(isInArray(array, num));
		
	}
	

}
