public class Task5 {

	/**
	 * getNextOddNumber If number you entered is not divisible by 2 add two to
	 * get next odd. 3 + 2 = 5. If not add one. 4 + 1 = 5. 5 is next odd after
	 * 3, and 4.
	 */
	public static int getNextOddNumber(int num) {
		if (num % 2 != 0) {
			num += 2;
		} else {
			num += 1;
		}
		return num;
	}

	/**
	 * getAreaOfCircle First divide diameter by 2 to get r. Area = r * r * PI
	 */
	public static double getAreaOfCircle(int diameter) {
		int r = diameter / 2;
		double area = r * r * Math.PI;
		return area;
	}

	/**
	 * getIsInRange Third number needs to be between first two to be in range.
	 * Boolean shows true or false depending if the range is true or false.
	 */

	public static boolean getIsInRange(int start, int finish, int n) {
		boolean b;
		if (start < n && n < finish) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

	public static void main(String[] args) {
		System.out.println(getNextOddNumber(10)); // Enter number to get next odd one.
		System.out.println(getAreaOfCircle(200)); // Enter number to get area of circle.
		System.out.println(getIsInRange(1, 5, 5)); // Enter start number, finish number and number you
													// want to check if it's in range.
	}

}
