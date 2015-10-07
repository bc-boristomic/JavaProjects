package day3;

public class Task1_1 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		int result = getPrimes(1, 1_000_000);

		System.out.println("Took " + (System.currentTimeMillis() - start)
				+ " ms");
		System.out.println(result);

	}

	private static int getPrimes(int from, int to) {
		int counter = 0;
		for (int i = from; i < to; i++) {
			if (isPrime(i)) {
				counter++;
			}
		}
		return counter;
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i < number / 2 + 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
