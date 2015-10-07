package ba.bitcamp.exercises.day3;

import java.util.Arrays;

public class FindTheOne {

	private static boolean isCharInString(String string, char c) {
		char[] temp = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			temp[i] = string.charAt(i);
		}
		Arrays.sort(temp);
		if (Arrays.binarySearch(temp, c) > 0) {
			return true;
		}
		return false;
		
	}
	
	
	public static void main(String[] args) {
		String s = "some string";
		char c = 'g';
		
		System.out.println(isCharInString(s, c));
	}
	
	

}
