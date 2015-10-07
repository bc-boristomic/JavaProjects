package ba.bitcamp.exercises.day3;

import java.util.ArrayList;
import java.util.Arrays;

public class ShiftArrayListAndPartialyFill {

	private static void fillArray(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			list.remove(null);
		}
	}
	
	
	private static void shiftElements(ArrayList<Integer> list) {
		//list.replaceAll(list.get(0));
	}

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>(Arrays.asList("ABC", null, "OAK123", null, "Java"));
		
		fillArray(list1);
		System.out.println(list1);
		
		
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(9, 8, 3, 6));
		
		
		
	}

}
