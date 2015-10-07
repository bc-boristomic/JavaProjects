package ba.bitcamp.boris.classes.day1;

import java.util.InputMismatchException;

public class Switch4 {

	public static int divide(int a, int b) {

		if (b == 0) {
			throw new ArithmeticException("Can't divite with zero");
		}
		
		return a / b;
	}

	public static void main(String[] args) {

		try {
		System.out.println(divide(1, 0));
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Nije moguce");
		} catch (ArithmeticException e1) {
			System.out.println("Can't divide");
		} finally {
			System.out.println("Ovo je finally");
		}
		System.out.println("End program");
		
		}

}
