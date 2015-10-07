package ba.bitcamp.boris.classes.day2;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// unesi 1 broj, svi djelioci tog broja
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesi broj");
		int num = in.nextInt();
		
		for (int i = 1; num > i; i++) {
			if (num % i == 0)
			System.out.println(i);
		}

		
		in.close();
	}

}
