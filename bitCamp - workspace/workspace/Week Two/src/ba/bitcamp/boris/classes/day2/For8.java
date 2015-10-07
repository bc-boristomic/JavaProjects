package ba.bitcamp.boris.classes.day2;

import java.util.Scanner;

public class For8 {

	public static void main(String[] args) {
		// svi prosti manji od tog broja

		Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj");
		int num = in.nextInt();

		

		for (int j = 1; j < num; j++) {
			int num2 = 400;
			
			boolean isPrime = true;
			
			for (int i = 2; i < num2; i++) {
			
				if (num2 % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				System.out.println(num);
			}
		}
		in.close();
	}

}