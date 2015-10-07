package ba.bitcamp.exercises.day3;

import java.util.ArrayList;
import java.util.Arrays;

public class IntegerToDay {

	private static String intToDay(int n) {
		try {
			ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wendsday", "Thursday", "Friday", "Saturday", "Sunday"));
			String s = "";
			s = list2.get(n-1);
			return s;
		} catch (IndexOutOfBoundsException ex) {
			return "Error";
		}
	}
	
	
	public static void main(String[] args) {
				
		System.out.println(intToDay(0));
		
	}

}
