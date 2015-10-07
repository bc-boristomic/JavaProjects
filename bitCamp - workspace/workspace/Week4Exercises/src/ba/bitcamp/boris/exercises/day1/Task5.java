package ba.bitcamp.boris.exercises.day1;

import java.util.Arrays;
import java.util.Collections;

public class Task5 {

	public static void main(String[] args) {

		/*
		 * Napisati tri metode koje se zovu getMax. Prva metoda prima dva
		 * parametra tipa double i određuje koji dati parametar je veći.
		 * 
		 * Druga metoda prima niz tipa int i određuje koji je element najveći.
		 * 
		 * Treća metoda prima niz tipa double i određuje koji je najveći. Sve
		 * tri metode se moraju zvati getMax (princip overloading metoda).
		 * 
		 * Sve exception-e sanirati!
		 * 
		 * Drugi dio zadatka traži od vas da koristite args parametre koji će
		 * biti ulaz za treću getMax metodu i ispisuje na
		 * 
		 * konzolu koji je najveći dati broj.
		 * 
		 * Napisati javadoc za ove metode! Potreban je opis i doc tag-ovi za
		 * parametre, return i exception-e.
		 * 
		 * Zapakovati program u jar file i pokrenuti ga preko command line-a.
		 */

		int[] arr = new int[] { 1, 9, 3, 7, 5, 2 };
		double[]arr2 = new double[args.length];
		try {
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = Double.parseDouble(args[i]);
			}
		} catch (NumberFormatException ex) {
			System.out.println("Can't convert string to double.");
		}
		
		// Get max of two numbers
		System.out.println(getMax(5, 5));

		// Get max number in array (int)
		System.out.println(getMax(arr));

		// Get max number in array (double)
		System.out.println(getMax(arr2));
	}

	/**
	 * Gives higher number in decimal.
	 * 
	 * @param a - first number in comparation, can be <code>double</code> input
	 * @param b - second number in comparation, can be <code>double</code> input
	 * @return Higher of two numbers
	 */
	static double getMax(double a, double b) {
		return (a > b) ? a : b;
	}

	/**
	 * Gives highest number in <code>int</code> array.
	 * 
	 * @param array - array is <code>int</code> type
	 * @return Highest number in array
	 * @throws IndexOutOfBoundsException
	 */
	static int getMax(int[] array) {

		if (array.length > 6 && array.length < 0) {
			throw new IndexOutOfBoundsException("There is no that index in this array.");
		}
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;

	}

	/**
	 * Gives highest number in <code>double</code> array.
	 * 
	 * @param array - array is <code>double</code> type, but <code>int</code> can be used
	 * @return Highest number in array
	 * @throws IndexOutOfBoundsException
	 * @exception NumberFormatException
	 */
	static double getMax(double[] array) {
		if (array.length < 0) {
			throw new IndexOutOfBoundsException("Arrays start from index 0");
		}
		double max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

}
