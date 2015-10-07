package ba.bitcamp.boris.exercieses.day4;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		System.out.print("* |");
		for (int i = 1; i < 11; i++) {
			System.out.println("");
			System.out.printf("%2d", i);
			if (i == 0) {
				System.out.printf("-", i - 1);
			} else {
				System.out.printf("|");
			}
			for (int j = 1; j < 10; j++) {

				System.out.printf(" %2d ", (i + 1) * j);

			}

		}

	}
}