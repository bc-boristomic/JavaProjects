package ba.bitcamp.boris.day3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		/**
		 * Exception Handling Napraviti program koji od korisnika traži da unese
		 * dužinu niza N. Zatim će korisnik unijeti broj unosa K. U sljedećih K
		 * linija korisnik će unositi po dva broja. Prvi broj označava indeks a
		 * drugi broj označava vrijednost koja će se staviti na taj indeks.
		 * Napravite svoj program maksimalno siguran tako što svaki mogući
		 * Exception sanirate, npr. korisnik unese String umjesto broja ili ako
		 * unese loš indeks.
		 */

		while (true) {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("Enter length of array");
				int length = input.nextInt();
				int[] arr = new int[length];

				System.out.println("Enter number of entrys");
				int k = input.nextInt();

				int index = 0;

				for (int i = 0; i < length; i++) {
					if (arr[index] < k) {
						System.out.println("Enter index");
						index = input.nextInt();
						System.out.println("Enter value at index " + index);
						arr[index] = input.nextInt();
					}
				}
				System.out.println(Arrays.toString(arr));
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Seems like you entered string.");
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Your array in not that long.");
			} catch (NegativeArraySizeException ex) {
				System.out.println("Java starts from zero");
			}
		}

	}

}
