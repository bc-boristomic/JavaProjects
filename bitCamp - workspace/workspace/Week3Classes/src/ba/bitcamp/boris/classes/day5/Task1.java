package ba.bitcamp.boris.classes.day5;

public class Task1 {

	public static void main(String[] args) {

		System.out.println(threeNPlusOne(13));
	}
	
	public static String threeNPlusOne (int n) {
		
		String s = n + "";
				
		while (n > 1) {
			if (n % 2 == 1) {
				n = 3 * n + 1; 
				s += ", " + n;
			} else {
				n = n / 2;
				s += ", " + n;
			}
		}
		return s;

	}
}
