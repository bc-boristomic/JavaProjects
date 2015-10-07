package ba.bitcamp.boris.excercises.day2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// input numbers until even number
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj");
		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			if (n % 2 == 0) {
				System.out.println("Upisali ste paran broj, dalje nema!");
				break;
			}
				System.out.println("Unesi broj 2");
				int n2 = in.nextInt();
				if (n2 % 2 == 0) {
					System.out.println("Upisali ste paran broj, dalje nema!");
					break;
				
		}
				
		}
		
		in.close();

	}

}
