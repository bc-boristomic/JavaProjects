package ba.bitcamp.boris.exercises.day1;

public class Task3 {

	public static void main(String[] args) {
		
		if (args.length < 2) {
			System.out.println("You need more then one argument.");
		} else if (args.length > 2 && args.length == 0) {
			throw new ArrayIndexOutOfBoundsException("Cant acces value at that index.");
		}
		try {
			double num1 = Double.parseDouble(args[0]);
			double num2 = Double.parseDouble(args[1]);
			System.out.println("Quotient of numbers is " + num1/num2);
		} catch (IllegalArgumentException ex) {
			System.out.println("Enter number, not string.");
		} catch (ArithmeticException ex) {
			System.out.println("Cant' divide by zero!");
		}

	}

}
