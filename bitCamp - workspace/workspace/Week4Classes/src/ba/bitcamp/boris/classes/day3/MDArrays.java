package ba.bitcamp.boris.classes.day3;

import java.util.Arrays;

public class MDArrays {
	
	public static void main(String[] args) {
		
		int[][] matrix = new int[4][3];
		
		int[][] newArray = new int [4][5];
		newArray[0][0] = 1; 
		newArray[0][1] = 2;
		newArray[0][2] = 3;
		newArray[0][3] = 4;
		newArray[0][4] = 5;
		newArray[1][0] = 6;
		newArray[1][1] = 7;
		newArray[1][2] = 8;
		newArray[1][3] = 9;
		newArray[1][4] = 10;
		newArray[2][0] = 11;
		newArray[2][1] = 12;
		newArray[2][2] = 13;
		newArray[2][3] = 14;
		newArray[2][4] = 15;
		newArray[3][0] = 16;
		newArray[3][1] = 17;
		newArray[3][2] = 18;
		newArray[3][3] = 19;
		newArray[3][4] = 20;
		
		
		int c = 1;
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[i].length; j++) {
				newArray[i][j] = c++;
			}
			//System.out.println(Arrays.toString(newArray[i]));
		}		
		
		//print2DArray(newArray);
		
		
		int[] regular = new int [6];
		
		//printArray(regular);
		
		System.out.println(Arrays.toString(getColumn(newArray, 2)));
		
		
		
		int[][] funny = new int[3][];
		for (int i = 0; i < funny.length; i++) {
			funny[i] = new int [(int)(Math.random()*5 + 1)];
		}
		print2DArray(funny);
		
		
	}
	
	
	
	
	public static void print2DArray (int[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void printArray (int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	/**
	 * Converts column of 2D array into new one dimensional array.
	 * 
	 * @param array 2D array
	 * @param column that we want to get from 2D array
	 * @return specified column from 2D array
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public static int[] getColumn (int[][] array, int column) { // Returns one dimensional array.
		if (column > array.length || column < 0) {  // If column doesn't exit because it's over the length of array or below zero.
			throw new ArrayIndexOutOfBoundsException ("No that index"); // Throw exception with message that required index doesn't exist.
		}
		int[] arr = new int [array.length]; // Declaring array with length of inputed array.
		
		for (int i = 0; i < array.length; i++) { // Goes thru the length of 2D array
			arr[i] = array[i][column]; // At every index writes the value of 2D array columns.
		}
		return arr; // Returns new array.
	}

}
