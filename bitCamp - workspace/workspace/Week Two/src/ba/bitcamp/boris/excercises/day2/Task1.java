package ba.bitcamp.boris.excercises.day2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// find perfect number

		Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj");
		int n = in.nextInt();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		
		in.close();
	}

}