package ba.bitcamp.boris.exercieses.day5;

public class NovaKlasa {

	public static void sayHello(String name) {
		System.out.println("Hello " + name);

	}

	public static boolean isPositive(int num) {
		return (num >= 0) ? true : false;
	}

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0 && i != num) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		boolean b = isPositive(-5);

		System.out.println(isPrime(3));
		System.out.println();
		sayHello("World" + b);
		System.out.println(isPositive(9));
		System.out.println(isEven(7));

	}

}
