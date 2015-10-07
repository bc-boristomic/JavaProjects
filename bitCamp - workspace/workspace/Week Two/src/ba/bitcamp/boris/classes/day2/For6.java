package ba.bitcamp.boris.classes.day2;

import java.util.Scanner;

public class For6 {

	public static void main(String[] args) {
		
		// pravougaonik
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi prvi broj");
		int n = in.nextInt();
		System.out.println("Unesi drugi broj");
		int m = in.nextInt();
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		in.close();
	}

}
