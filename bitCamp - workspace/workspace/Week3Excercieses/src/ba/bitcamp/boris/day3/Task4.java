package ba.bitcamp.boris.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		/**
		 * String kao niz karaktera 
		 * Konstruisati program gdje se korisnik pita
		 * da unese jedan String. Napraviti niz karaktera jednak dužini tog niza
		 * i svaki karakter staviti na jedno mjesto u nizu. Zatim je potrebno
		 * obrnuti taj niz i isprintati ga (ne prihvaćam da ga odmah isprintate
		 * obrnuto, nego da prvo obrnete pa onda isprintate).
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter string value");
		String s = input.nextLine();
		int num = s.length();
		
		char[] arr = new char [num];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.charAt(i);
		}
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}

		input.close();

	}

}
