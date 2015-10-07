package ba.bitcamp.boris.exercieses.day4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int broj = 0;
		int a = 0, b = 0, c = 0, d = 0, e = 0;

		do {
			
		for (int i = 0; i < 1000; i++) {
			broj = (int) (Math.random() * 5 + 1);
			System.out.println(broj);
		
		if (broj == 5) {
			a++;
		} else if (broj == 4) {
			b++;
		} else if (broj == 3) {
			c++;
		} else if (broj == 2) {
			d++;
		} else {
			e++;
		}
			
		}
		
		} while (a != b || b != c || c != d || d != e);
		System.out.println(broj);
		System.out.println("Number 5 repeats " + a);
		System.out.println("Number 4 repeats " + b);
		System.out.println("Number 3 repeats " + c);
		System.out.println("Number 2 repeats " + d);
		System.out.println("Number 1 repeats " + e);
}
}

