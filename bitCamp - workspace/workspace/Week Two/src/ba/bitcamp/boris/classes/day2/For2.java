package ba.bitcamp.boris.classes.day2;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		// All even numbers before inputed number
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesi broj");
		int num = in.nextInt();
				
		for (int i = 1; num > i; i++){
			if (i % 2 == 0)
				
				System.out.println("Svi parni brojevi prije unesenog su: " + i);
		}
		
		
		in.close();
	}

}
