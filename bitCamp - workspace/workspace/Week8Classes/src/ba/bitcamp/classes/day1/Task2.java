package ba.bitcamp.classes.day1;

public class Task2 {
	
	private static boolean areDiffChars(String s) {
		boolean b = true;
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length() - 1; j > 0; j--) {
				if (s.charAt(i) == s.charAt(j)) {
					b = true;
				} else {
					b = false;
				}
			}
		}
		return b;
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(areDiffChars("aaagaa"));
		
	}

}
