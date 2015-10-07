package day3;

import java.util.Random;

public class Task2 {

	public static void main(String[] args) {

		Random rand = new Random();

		int[][] array = new int[15_000][15_000];
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(100) + 1;
			}
		}
		System.out.println("Time to fill array: "
				+ (System.currentTimeMillis() - t1));

		int c = 0;
		int n = rand.nextInt(100) + 1;
		long t2 = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (n == array[i][j]) {
					c++;
				}
			}
		}
		System.out.println("Time to search array: "
				+ (System.currentTimeMillis() - t2));
		System.out.println("Number " + n + " found times " + c + " in array");

	}

}
