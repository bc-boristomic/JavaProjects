package ba.bitcamp.exercises.day4;

import java.util.HashSet;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		HashSet<Character> set = new HashSet<>();

		System.out.println("Enter some leters, enter end to exit");
		String word = "";
		while (!word.equals("end")) {
			word = in.nextLine();
			if (!word.equals("end")) {
				for (int i = 0; i < word.length(); i++) {
					set.add(word.charAt(i));
				}
			}
		}
		System.out.println("You entered " + set.size() + " different letters.");

		in.close();
	}

}
