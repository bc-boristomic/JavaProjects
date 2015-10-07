package ba.bitcamp.boris.excercises.day3;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Unesi broj");
		int num;// = in.nextInt();
		double sum = 1;
		double avg = 0;
		int counter = 0;

		do {
			num = in.nextInt();
			//if (num != -1) {
				sum += num;
				counter++;
			//}
			System.out.println("Unesite broj ponovo");
		} while (num != -1);
		counter--;
		
		avg = sum / counter;
		System.out.println("Prosjek je " + avg);

		in.close();

	}

}
