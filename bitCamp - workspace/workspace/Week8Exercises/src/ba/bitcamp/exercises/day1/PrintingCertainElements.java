package ba.bitcamp.exercises.day1;

public class PrintingCertainElements {

	public static void main(String[] args) {

		char[] c = { 'A', 'g', 'm', 'I', 'c', 'R' };

		for (char d : c) {
			if (d >= 65 && d <= 90) {
				System.out.println(d);
			}
		}

	}

}
