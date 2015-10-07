package ba.bitcamp.boris.exercises.day4;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {

		// System.out.println(Arrays.toString(getNames("names.in")));

		// System.out.println(Arrays.toString(getNames("courses.in")));

		int[][] matrix = new int[21][11];

		courses2DArray(matrix);

		printCourses(getNames("courses.in"), getNames("names.in"),
				getRow(matrix, 0), getAverage(getRow(matrix, 0)));
	}

	// public static int, int get2DArrayLength(String filename) {
	// TextIO.readFile(filename);
	// }
	//

	/**
	 * Length of array read from file.
	 * 
	 * @param filename Input is filename
	 * @return <code>int</code> type length of array
	 */
	public static int getArrayLength(String filename) {
		TextIO.readFile(filename);
		int counter = 0;
		String s;
		while (!TextIO.eof()) {
			try {
				s = TextIO.getlnString();
			} catch (IllegalArgumentException ex) {
				System.out.println("msg");
			}
			counter++;
		}
		return counter;
	}

	/**
	 * Reads all the lines from a file and puts every line in <code>String</code> type array
	 * 
	 * @param filename Input is filename
	 * @return <code>String</code> type array
	 */
	public static String[] getNames(String filename) {
		String[] names = new String[getArrayLength(filename)];
		TextIO.readFile(filename);
		int index = 0;
		while (!TextIO.eof()) {
			names[index] = TextIO.getlnString();
			index++;
		}
		return names;
	}
	
	
	public static int[][] courses2DArray(int[][] array) {
		TextIO.readFile("grades.in");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = TextIO.getInt();
			}

		}
		return array;

	}

	public static void print2DArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%3d", array[i][j]);
			}
			System.out.println();
		}
	}

	public static String writeNameToFile(String [] getNames){
		String s = "";
		String s1 = "";

		for(int i = 0; i < getNames.length; i++){
			s = getNames[i];
			s =  s.replace(" ", "");
			s = s.toLowerCase();
			s1 = "list/" + s + "grd"; // Saving to list folder in project, filename to lower case with grd extension
			System.out.println(s1);
			TextIO.writeFile(s1);

		}
		return s1;
	}
	
	
	
	public static void printCourses(String[] courses, String[] names,
			int[] row, double average) {

		//writeNameToFile(getNames("names.in"));
		for (int i = 0; i < names.length; i++) {
			TextIO.putln("Ucenik: " + names[i]);

			for (int j = 0; j < courses.length; j++) {

				TextIO.putln("(" + row[j] + ") " + courses[j]);

			}
			TextIO.putln(average);
			TextIO.writeFile(writeNameToFile(getNames("names.in")));
			
		}
		
	}

	public static int[] getRow(int[][] array, int i) {
		int arr[] = new int[11];
		for (int j = 0; j < array[i].length; j++) {
			arr[j] = array[i][j];

		}
		return arr;
	}

	public static double getAverage(int[] array) {
		int sum = 0;
		double average = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return average = (double) (sum / 11);
	}

	//
	// public static String[] writeFileNames (String[] names) {
	// String[] namesToWrite = new String [names.length];
	// String s = "";
	// for (int i = 0; i < namesToWrite.length; i++) {
	// namesToWrite[i] = names[i].toLowerCase().indexOf(ch, fromIndex);
	// }
	//
	//
	// }

}
