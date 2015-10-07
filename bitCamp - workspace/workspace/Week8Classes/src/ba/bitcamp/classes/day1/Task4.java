package ba.bitcamp.classes.day1;

public class Task4 {

	private static boolean isOriginalSubstring(String s1, String s2) {
		s1 += s2;
		return s1.indexOf(s2) > -1;
	}

	public static void main(String[] args) {
		System.out.println(isOriginalSubstring("vozdra", ""));
	}

}
