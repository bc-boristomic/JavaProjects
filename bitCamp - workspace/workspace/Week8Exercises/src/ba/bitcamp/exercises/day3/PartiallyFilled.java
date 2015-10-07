package ba.bitcamp.exercises.day3;

import java.util.Arrays;

public class PartiallyFilled {
	
	private static String[] fillArray(String... s) {
		
		int counter = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null){
				counter++;
			} 
		}
		int length = s.length - counter;
				
		String[] temp = new String[length];
		int j = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null){
				temp[i] = s[i];
			} 
		}
		return temp;
	}
		
	public static void main(String[] args) {
		
		String[] arr = {"ABC", null, "OAK123", null, "Java"};
		
		System.out.println(Arrays.toString(fillArray(arr)));
	}
}
