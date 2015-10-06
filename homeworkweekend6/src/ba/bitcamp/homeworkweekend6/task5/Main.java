package ba.bitcamp.homeworkweekend6.task5;

/**
 * Main class uses recursion to calculate exponent. Number can be positive or
 * negative, if number is positive subtraction is used to reach 0, else number
 * is added to reach zero. Since result is zero return must be 1, only one
 * exponent, one overall recursion.
 * <p>
 * If exponent number is negative whole equation is divided by one.
 * 
 * @author boris
 *
 */
public class Main {

	private static double getPower(double i, double j) {
		if (j == 0) {
			return 1;
		}
		if (j > 0) {
			return i * getPower(i, j - 1);
		} else {
			return 1 / i * getPower(i, j + 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(getPower(2, 5));
		System.out.println(getPower(-2, 4));
		System.out.println(getPower(-2, -2));
	}

}
