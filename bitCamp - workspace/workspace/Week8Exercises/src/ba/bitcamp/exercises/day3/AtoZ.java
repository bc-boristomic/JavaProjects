package ba.bitcamp.exercises.day3;

import java.util.Arrays;

public class AtoZ {

	private static String[] sortStringAlphabeticly(String... s) {
		Arrays.sort(s);
		return s;
	}
	
	public static void main(String[] args) {
		
		String s1 = "y";
		String s2 = "fk"; 
		String s3 = "pfa"; 
		String s4 = "vx"; 
		String s5 = "ati"; 
		
		System.out.println(Arrays.toString(sortStringAlphabeticly(s1, s2, s3, s4, s5)));

	}
	
	

}
