package ba.bitcamp.boris.classes.day2;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		
		// najmanji zajednicki djelioc, djeljiv je ako je ostatak djeljenju 0
		// provjeravaj od 2, svi su djeljivi sa 1
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesi prvi broj");
		int num1 = in.nextInt();
		
		System.out.println("Unesi drugi broj");
		int num2 = in.nextInt();
		
		int min = num1;
		if (min > num2){
			min = num2;
		}
		
		for (int i = 2; i <= min; i++){
			if (num1 % 1 == 0 && num2 % i == 0){
				System.out.println(i);
				break;
			}
		}
		

		
		in.close();
	}

}
