package ba.bitcamp.boris.classes.day2;

import java.util.Scanner;

public class For7 {

	public static void main(String[] args) {
		// na konzolu ispisuje tablicu mnozenja
		
		Scanner in = new Scanner (System.in); 
		System.out.println("Unesi prvi broj");
		int n = in.nextInt();
		System.out.println("Unesi drugi broj");
		int m = in.nextInt();
		
		for (int i = 1; i < n; i++){
			for (int j = 1; i < m; j++){
				System.out.printf("%2d", i*j);
			}
			System.out.println();
		}
		

		in.close ();
	}

}
