package ba.bitcamp.boris.exercises.day4;

import java.util.Arrays;


public class Task2 {

	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(getArrayFromFile("array.txt"))); // Print array filled with value read from file.

	}

	
	/**
	 * Reads from file get's length of array and then fills the array with value from file.
	 * 
	 * @param filename Input is filename location
	 * @return <code>int</code> type array filled with numbers from file
	 * @throws IllegalArgumentException
	 */
	public static int[] getArrayFromFile (String filename) {
		
		TextIO.readFile(filename); // Reads from file
		int counter = -1; // Counter for calculating length of array
		int num; // Variable to read numbers from file
		while (!TextIO.eof()) { // Read until end of file
			try { 
				num = TextIO.getInt(); // Read numbers from file
			} catch (IllegalArgumentException ex) {
				
			}
			counter++; // Get length of array
		}
		TextIO.readFile(filename); // Reads from file, now we will fill the array with value
		int index = 0; // Index of array
		int[] array = new int [counter]; // Array with defined length
		while (!TextIO.eof()) { // Read until end of file
			try {
				array[index] = TextIO.getInt(); // Fill array with value from file
			} catch (IllegalArgumentException ex) {
				
			}
			index++; // Go to the next index of array
		}
		return array; // Return completed array with values from fileS
		
	}

}
