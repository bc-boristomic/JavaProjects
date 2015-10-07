package ba.bitcamp.boris.exercises.day1;

public class Task1 {

	public static void main(String[] args) {

		System.out.println("Area of square is " + getAreaOfSquare(-10));

	}

	
	/**
	 * Returns area of a square.
	 * 
	 * @param a - Inputed number value, must be positive to avoid Exception.
	 * @return Area of circle.
	 * @throws IllegalArgumentException if a <= 0
	 */
	public static double getAreaOfSquare(double a) {

		if (a <= 0) {
			throw new IllegalArgumentException("Illegal input, try positive number!");
		}
		return a * a;

	}
}
