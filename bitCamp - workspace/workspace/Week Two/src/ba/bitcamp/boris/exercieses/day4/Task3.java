package ba.bitcamp.boris.exercieses.day4;

import java.util.Scanner;

import ba.bitcamp.boris.classes.day4.TextIO;

public class Task3 {

	public static void main(String[] args) {
		//

		Scanner input = new Scanner(System.in);

		
		
		
		System.out.println("To enter Level 1 type in your name!");
		TextIO.put("What is your name?");
		String name = TextIO.getln();

		int a, b, c, d, e = 0, f = 0;
		int e1 = 0, f1 = 0;
		int e2 = 0, f2 = 0;

		for (int i = 0; i < 5; i++) {

			a = (int) (Math.random() * 9 + 1);
			b = (int) (Math.random() * 9 + 1);
			c = a * b;
			System.out.printf("How much is %d * %d ", a, b);
			d = input.nextInt();
			if (d == c) {
				System.out.println("Good now try again!");
				e++;
			} else {
				System.out.println("Try again!");
				f++;
			}
		}
		System.out.printf("You had %d good answers, and %d bad ones.", e, f);

		if (e < f) {
			System.out.println("Let's try something a bit easier. Level -1");
			for (int i = 0; i < 5; i++) {
				int a1 = (int) (Math.random() * 9 + 1);
				int b1 = (int) (Math.random() * 9 + 1);
				int c1 = a1 + b1;
				System.out.printf("How much is %d + %d ", a1, b1);
				int d1 = input.nextInt();
				if (c1 == d1) {
					System.out.println("You're good at elementry math.");
					e1++;
				} else {
					System.out.println("Seems like you're really bad.");
					f1++;
				}
			}
			System.out.printf("You had %d good answers, and %d bad ones.\n", e1, f1);
			System.out.println("No high score for you!");
			System.out.println("Consider practice and try again!");
		} else if (e > f) {
			System.out.println("You are pretty good. Go to next level 2!");
			for (int i = 0; i < 5; i++) {
				int a2 = (int) (Math.random() * 90 + 10);
				int b2 = (int) (Math.random() * 90 + 10);
				int c2 = a2 * b2;
				System.out.printf("How much is %d * %d", a2, b2);
				int d2 = input.nextInt();
				if (d2 == c2) {
					System.out.println("Excelent, try again!");
					e2++;
				} else {
					System.out.println("I tought you were good at math!");
					f2++;
				}
			}
			System.out.printf("You had %d good answers, and %d bad ones.", e2, f2);
		} else {
			System.out.println("You had same number of correct and incorrect answers.");
		}
		TextIO.writeFile("gamescores.txt");
		TextIO.putf("LEVEL 1 Highscore:\t%s - %d correct answers, and %d bad ones\n", name, e, f);
		TextIO.putf("LEVEL 2 Highscore:\t%s - %d correct answers, and %d bad ones\n", name, e2, f2);
		

	}

}
