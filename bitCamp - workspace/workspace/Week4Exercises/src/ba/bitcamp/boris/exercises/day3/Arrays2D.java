package ba.bitcamp.boris.exercises.day3;

import java.util.Scanner;

public class Arrays2D {

		
	/**
	 * Input 2D <code>int</code> type array using Scanner
	 * 
	 * @return 2D <code>int</code> type array
	 * @throws NegativeArraySizeException
	 */
	public static int[][] input2DArray() {

		Scanner input = new Scanner(System.in); // Using Scanner for input.
		
		System.out.println("Enter length of array"); // Message to user that he/she will be inputing length of array.
		
		System.out.println("Enter number of rows"); // First user will input number of rows.
		int rows = input.nextInt(); // Using scanner for inputing number of rows.
		
		System.out.println("Enter number of columns"); // Then user will input number of columns.
		int columns = input.nextInt(); // Using scanner for inputing number of columns.

		if (rows < 0 || columns < 0) { // If array length if lower then zero throw NegativeArraySizeException.
			throw new NegativeArraySizeException ("In Java arrays start from index 0!"); // Print message with exception.
		}
		int[][] arr = new int[rows][columns]; // Assign length value to 2D array.

		for (int i = 0; i < arr.length; i++) { // Goes thru length of rows.
			for (int j = 0; j < arr[i].length; j++) { // Goes thru length of columns.
				System.out.printf("Enter value for row %d and column %d", i + 1, j + 1); // Telling user exactly where he/she is making the input.
				arr[i][j] = input.nextInt(); // Using Scanner to make input.
			}
		}
		return arr; // Returns 2D array of size and values inputed by user.
		

	}
	
	
	

	/**
	 * Prints 2D array.
	 * 
	 * @param array Input is 2D <code>int</code> type array
	 */
	public static void print2DArray(int[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");

			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	/**
	 * Sums every element in <code>int</code> type 2D array
	 * 
	 * @param array Input is 2D <code>int</code> type array
	 * @return Sum <code>int</code> type
	 */
	public static int getSumOf2DArray (int[][] array) {
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		return sum;
	}

	
	
	/**
	 * Reads from file that contains length of 2D array and all the elements.
	 * 
	 * @param filename Input is filename
	 * @return 2D array
	 * @throws NegativeArraySizeException
	 * @Exception IllegalArgumentException
	 */
	public static int[][] readMatrixFromFile (String filename) {
		
		TextIO.readFile(filename);
		int rows = TextIO.getInt();
		int columns = TextIO.getInt();
		if (rows < 0 || columns < 0) {
			throw new NegativeArraySizeException("Check your file, you can't have negative index");
		}
		
		int[][] array = new int [rows][columns];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				try {
					array[i][j] = TextIO.getInt();
				} catch (IllegalArgumentException ex) {
					System.out.println("Your file is missing some values, check your file!");
					System.out.println("Your 2D array might be incorrect.");
					ex.printStackTrace();
				}
			}
		}
		return array;
	}
	
	
	/**
	 * For 2D array fixed at <code>int</code>[3][3] returns if singular or not.
	 * 
	 * @param a Input is 2D array
	 * @return True or false
	 */
	public static boolean isSingular (int[][] a) {
		
		int num = a[0][0]*a[1][1]*a[2][2] + a[0][1]*a[1][2]*a[2][0] + a[0][2]*a[1][0]*a[2][1] - a[2][0]*a[1][1]*a[0][2] - a[2][1]*a[1][2]*a[0][0] - a[2][2]*a[1][0]*a[0][1];
		if (num == 0) {
			return true;
		}
		return false;
		 
	}
	
	
	
	
	
	public static int[][] completeMinesweeper (int[][] array) {
				
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == -1) {
					try {
						if (array[i-1][j-1] != -1)
							array[i-1][j-1] ++;
					} catch (ArrayIndexOutOfBoundsException ex) {
						
					}
					try {
						if (array[i-1][j] != -1) {
							array[i-1][j] ++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {
						
					}
					try {
						if (array[i-1][j+1] != -1) {
							array[i-1][j+1] ++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {
						
					}
					try {
						if (array[i][j-1] != -1) {
							array[i][j-1] ++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {
						
					}
					try {
						if (array[i][j+1] != -1) {
							array[i][j+1] ++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {
						
					}
					try {
						if (array[i+1][j-1] != -1) {
							array[i+1][j-1] ++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {
						
					}
					try {
						if (array[i+1][j] != -1) {
							array[i+1][j] ++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {
						
					}
					try {
						if (array[i+1][j+1] != -1) {
							array[i+1][j+1] ++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {
						
					}
				}
			}
		}
		
		return array;
		}
	
}
