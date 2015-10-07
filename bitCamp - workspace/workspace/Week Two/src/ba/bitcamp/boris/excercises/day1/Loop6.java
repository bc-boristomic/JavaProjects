package ba.bitcamp.boris.excercises.day1;

public class Loop6 {

	public static void main(String[] args) {

		int a = 128;
		int b = 0;
		while (a > 0) {
			a = a / 10;
			b++;
		}
		System.out.println("Broj ima " + b + " cifre.");
	}
}
