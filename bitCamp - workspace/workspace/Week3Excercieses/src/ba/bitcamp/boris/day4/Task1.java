package ba.bitcamp.boris.day4;

import java.util.Random;

public class Task1 {

	// Task1
	public static int getMax(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else if (num2 > num1) {
			return num2;
		}
		return num1;
	}

	// Task2
	public static String getExtension(String ext) {

		int length = ext.length();
		String tmp = "";
		for (int i = length - 1; i > 0; i--) {
			char c = ext.charAt(i);
			if (ext.charAt(i) == '.') {
				break;
			} else {
				tmp = c + tmp;
			}
		}
		System.out.print(".");

		return tmp;
	}

	// Task3
	public static int canBeBinary(int num) {

		try {
			String number = String.valueOf(num);
			int num2 = Integer.parseInt(number, 2);
		} catch (Exception ex) {
			System.out.println(false);
		}
		return num;
	}

	// Task4
	public static int getRandomNumber(int min, int max) {
		int number;
		if (min <= max) {
			number = (int) (Math.random() * (max - min + 1)) + (min);
			return number;
		} else {
			return -1;
		}
	}

	// Task5
	public static String getType(String expression) {

		try {
			Integer.parseInt(expression);
			return "int";
		} catch (NumberFormatException ex) {
			try {
				Double.parseDouble(expression);
				return "double";
			} catch (NumberFormatException ex2) {
				if (expression == "true" || expression == "false") {
					return "boolean";
				} else if (expression.length() == 1) {
					return "char";
				} else if (expression.length() > 1) {
					return "string";
				}
			}
		}
		return expression;
	}

	// Task6
	public static String fixSntence (String sentence) {
		char first = sentence.charAt(0);
		sentence.toUpperCase();
		return sentence;
	}

	public static void main(String[] args) {

		// Task1
		System.out.println(getMax(12, 12));
		// Task2
		System.out.println(getExtension("somemovie.avi")); // no bonus
		// Task3
		System.out.println(canBeBinary(1102)); // try/catch only
		// Task4
		System.out.println(getRandomNumber(2, 2));
		// Task5
		System.out.println(getType("33"));
		// Task6
		System.out.println(fixSntence("adad"));

	}
}
