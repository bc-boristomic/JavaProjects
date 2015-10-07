package ba.bitcamp.boris.exercieses.day5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesi ime");
		String name = input.nextLine();

		name.charAt(2);
		System.out.println("Drugi karakter je " + name.charAt(2));

		System.out.println("Duzina imena " + name.length());

		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}

		input.close();

	}

}