package ba.bitcamp.exercises.day1;


public class OneTwoThreeFour {
	
	private static void addArrays(int[] ar, String[]arr) {
		int counter = 0;
		int counter2 = 0;
		String[] s1 = new String[ar.length*2];
		for (int i : ar) {
			s1[counter] = i+"";
			counter+=2;
		}
		for (String string : arr) {
			s1[counter2+1] = string;
			counter2 += 2;
		
		}
		for (String string : s1) {
			System.out.print(string + " ");
		}	
	}
	
	
	public static void main(String[] args) {
		
		int[] a ={1, 5, 0, 4};
		String[] b = {"A", "P", "B","D"};
		
		addArrays(a, b);
		
		
	}
}
