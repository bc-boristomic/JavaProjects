package ba.bitcamp.boris.exercises.day4;

import ba.bitcamp.boris.exercises.day3.Arrays2D;

public class Task1 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		Arrays2D.print2DArray(getMatrix(5, 3)); // Calling method that created 2D array with desired length and fills it randomly
		
		reversedMatrix(false, arr); // Prints array correctly
		reversedMatrix(true, arr); // Print array reversed
		
	}

	/**
	 * Creates 2D <code>int</code> type array for given input in number of rows
	 * and columns. Fills that array with random numbers from 5 to 10 (including
	 * 5 and 10).
	 * 
	 * @param n Input for rows <code>int</code> type
	 * @param m Input for columns <code>int</code> type
	 * @return 2D <code>int</code> type randomly filed array with numbers from 5 to 10
	 * @throws NegativeArraySizeException
	 */
	public static int[][] getMatrix(int n, int m) {
		if (n < 0 || m  < 0) {
			throw new NegativeArraySizeException("In Java arrays start from 0!");
		}
		int[][] matrix = new int[n][m]; // Declaring 2D array with inputed length values.
		for (int i = 0; i < matrix.length; i++) { // Goes thru rows
			for (int j = 0; j < matrix[i].length; j++) { // Goes thru columns
				matrix[i][j] = (int) (Math.random() * 6 + 5); // Gives random value for every index from 5 to 10
			}
		}
		return matrix; // Returns 2D array
	}
	
	/**
	 * Depending on <code>boolean</code> value prints 2D array normally or reversed.
	 * 
	 * @param b Input <code>boolean</code> for true print 2D array reversed.
	 * @param array Input 2D array
	 */
	public static void reversedMatrix (boolean b, int[][] array) {
		if (b == false) { // If boolean is false print 2D array normally
			for (int i = 0; i < array.length; i++) { // Goes thru rows
				for (int j = 0; j < array[i].length; j++) { // Goes thru columns
					System.out.print(array[i][j] + " "); // Print rows
				}
				System.out.println(); // Create new row
			}
		} else { // Else boolean was false
			for (int i = array.length - 1; i >= 0; i--) { // Goes thru rows backwards
				for (int j = array[i].length - 1; j >= 0; j--) { // Goes thru columns backwards
					System.out.print(array[i][j] + " "); // Print rows
				}
				System.out.println(); // Create new row
			}
		}
		
	}

}
