package ba.bitcamp.boris.classes.day3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); // For input we will be using console.
		
		System.out.println("Enter length of 2D array."); // Telling user that he/she will be entering length of array.
		try {											// For better understanding array will be represented as rows and columns.
		System.out.println("Enter number of rows."); // Telling user to enter number of rows.
		int row = input.nextInt(); // Using scanner for input.
		if (row < 0) { // If number of rows is below zero, print message (with exception) that array can't have negative size.
			throw new NegativeArraySizeException ("Sorry Java starts from index 0.");
		}
		System.out.println("Enter number of columns."); // Telling user to enter number of columns.
		int column = input.nextInt(); // Using scanner for input.
		if (column < 0) { // If number of columns is below zero, print message (with exception) that array can't have negative size.
			throw new NegativeArraySizeException ("Sorry Java starts from index 0.");
		}
		
		int arr[][] = new int[row][column]; // Adding length to array (user inputed values).
		
		int value; // Declaring variable that will add value to each index in array.
		
		for (int i = 0; i < arr.length; i++) { // First loop goes to length of array (rows).
			for (int j = 0; j < arr[i].length; j++) { // Second loops goes to length of columns.
				System.out.println("Enter value for row " + (i+1) + " and column " + (j+1)); // Telling user where the value will be added.
				arr[i][j] = value = input.nextInt(); // Adding value to index row and column using scanner.
			}
			System.out.println("Your inputed row is " + Arrays.toString(arr[i])); // After completing each row print every element that user inputed for that row.
		}
		System.out.println("Your 2D array is"); // Telling user what entire array looks like.
		print2DArray(arr); // For printing array method below will be called.
		} catch (InputMismatchException ex) { // If array length is over value of int, exception will catch it and message will be printed.
			System.out.println("That array is way too long.");
			ex.printStackTrace(); // Prints error number to standard output.
		} 
		
		input.close(); // Closing scanner.
		
	}

	/**
	 * Prints two dimensional array to standard output.
	 * 
	 * @param array Input is two dimensional array.
	 */
	public static void print2DArray (int[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
