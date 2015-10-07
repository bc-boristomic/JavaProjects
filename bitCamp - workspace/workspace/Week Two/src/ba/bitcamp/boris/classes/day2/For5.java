package ba.bitcamp.boris.classes.day2;

import java.util.Scanner;

public class For5 {

	public static void main(String[] args) {
		// 1 broj, da li je prost, prost je ako se dijeli sa 1 i sa samim sobom, npr 5,7,13

		Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj");
		int num = in.nextInt();
		
		boolean isPrime = true;
		
		for (int i = 2; i < num; i++){
			if (num % i == 0){
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println("Prost");
		} else {
			System.out.println("Nije");
		}
		in.close();
	}
}
