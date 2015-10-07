package ba.bitcamp.boris.homework.week4.day2;

public class ZadaacaIzParametara {

	public static void main(String[] args) {

		
		System.out.println("f(10) = " + pomnozi(10)); // Calling and printing first method 
		System.out.println("f(10.0) = " + pomnozi(10.0)); // Calling and printing second method
		System.out.println("f(10, 15) = " + pomnozi(10, 15)); // Calling and printing third method
		System.out.println("f(10.0, 15) = " + pomnozi(10.0, 15)); // Calling and fourth method

	}

	/**
	 * Calculates square number <code>int</code> type.
	 * 
	 * @param number Input is <code>int</code> type number.
	 * @return Square of inputed number <code>int</code> type.
	 */
	public static int pomnozi(int number) {
		return number * number;
	}

	/**
	 * Calculates square number <code>double</code> type.
	 * 
	 * @param number Input is <code>double</code> type number.
	 * @return Square of inputed number <code>double</code> type.
	 */
	public static double pomnozi(double number) {
		return number * number;
	}

	/**
	 * Calculates product of two numbers.
	 * 
	 * @param num1 Inputed <code>int</code> type first number.
	 * @param num2 Inputed <code>int</code> type second number.
	 * @return Product of two inputed numbers in <code>int</code> type.
	 */
	public static int pomnozi(int num1, int num2) {
		return num1 * num2;
	}

	
	/**
	 * Calculates product of two numbers.
	 * 
	 * @param num1 Inputed <code>double</code> type first number.
	 * @param num2 Inputed <code>double</code> type second number.
	 * @return Product of two inputed numbers in <code>double</code> type.
	 */
	public static double pomnozi(double num1, double num2) {
		return num1 * num2;
	}

}
