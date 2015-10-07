package ba.bitcamp.classes.day1;

public class Task3 {
	
	private static boolean arePermutation (String a, String s) {
		boolean b = true;
		int[] signs = new int [255];
		
		for (int i = 0; i < a.length(); i++) {
			signs[a.charAt(i)]++;
		}
		
		for (int j = 0; j < s.length(); j++) {
			signs[s.charAt(j)]--;
		}
		
		for (int i = 0; i < signs.length; i++) {
			if (signs[i] != 0)
				b = false;
		}
			
		return b;
	}
	
	
	public static void main(String[] args) {
		System.out.println(arePermutation("abc", "cba"));
	}

}
