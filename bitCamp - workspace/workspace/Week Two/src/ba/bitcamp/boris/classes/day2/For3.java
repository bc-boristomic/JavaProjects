package ba.bitcamp.boris.classes.day2;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		
		// calculate n!
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj");
		int num = in.nextInt();
		int product = 1;
		for (int i = 1; num >= i; i++){
			product = i * product;
		}
		System.out.println(product);
		
		
		
		in.close();
	}

}
