package ba.bitcamp.day2;

import java.io.PrintWriter;
import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {

		char[] array = new char[26];

		PrintWriter pw = new PrintWriter(System.out);
		int c = 65;
		for (int i = 0; i < array.length; i++) {
			array[i] = (char) c++;
		}
		System.out.println(Arrays.toString(array));

		int length = 10;
		for (int i = 0; i < array.length; i += 10) {
			if (i == 20) {
				pw.write(array, i, length - 4);
			} else {
				pw.write(array, i, length);
			}
		}

		pw.close();

	}
}
