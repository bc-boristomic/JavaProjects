package ba.bitcamp.boris.exercises.day1;

public class Task4 {

	public static void main(String[] args) {

		sumOfNumbers(args);

	}

	/**
	 * Calculates sum of all numbers in an array.
	 * 
	 * @param array - enter array to calculate sum
	 * @exception IllegalArgumentException if array contains letters
	 */
	public static void sumOfNumbers(String[] array) {

		if (array.length < 2) {
			System.out.println("Enter more then one number to give summ.");
		} else {
		try {
			double sum = 0;
			for (String number : array) {
				double num = Double.parseDouble(number);
				sum += num;
			}
			System.out.println("Summ of number is " + sum);
		} catch (IllegalArgumentException ex) {
			System.out.println("Can't sum letters, only digits.");
		}
		}
	}

}
