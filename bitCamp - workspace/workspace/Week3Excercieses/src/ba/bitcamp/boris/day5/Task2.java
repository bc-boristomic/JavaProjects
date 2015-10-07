package ba.bitcamp.boris.day5;

public class Task2 {

	public static String getFirst(String s1, String s2, String s3) {
		int num1 = s1.compareToIgnoreCase(s2);
		int num2 = s1.compareToIgnoreCase(s3);
		int num3 = s2.compareToIgnoreCase(s3);

		if (num1 < 0 && num2 < 0) {
			return s1;
		} else if (num1 > 0 && num3 < 0) {
			return s2;
		} else if (num1 > 0 && num3 > 0) {
		}
		return s3;
	}

	public static void main(String[] args) {

		System.out.println(getFirst("Camp", "b", "ba"));
	}

}
