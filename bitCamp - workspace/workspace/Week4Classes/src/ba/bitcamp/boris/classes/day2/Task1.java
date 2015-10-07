package ba.bitcamp.boris.classes.day2;

import java.util.Arrays;

public class Task1 {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(converter(1, 3, readFile("Currency.txt")));
		
	}
	
	
	/**
	 * Reads from file using TextIO
	 * 
	 * @param file - Input file name and location.
	 * @return Everything to the end of file.
	 */
	public static String[] readFile (String file) {
		int numberOfCurrencies = 9;
		TextIO.readFile(file);
		String line = "";
		String[] array = new String[numberOfCurrencies];
		String[] curr = new String[numberOfCurrencies];
		String[] value = new String [numberOfCurrencies];
		int c = -1;
		while (!TextIO.eof()) {
			line = TextIO.getln();
			c++;
			array = new String[] {line};
			array = line.split(" ");
			curr[c] = array[0];
			value[c] = array[1];
		}
		System.out.println("Choose from one of these currencies.");
		System.out.println(Arrays.toString(curr));
		System.out.println("Choose from 1 to 9");
		return value;
	}
	
	

	public static Double converter(int num, double value, String Array[]) {

		switch (num) {
		case 1:
			return value * Double.parseDouble(Array[0]);
		case 2:
			return value * Double.parseDouble(Array[1]);
		case 3:
			return value * Double.parseDouble(Array[2]);
		case 4:
			return value * Double.parseDouble(Array[3]);
		case 5:
			return value * Double.parseDouble(Array[4]);
		case 6:
			return value * Double.parseDouble(Array[5]);
		case 7:
			return value * Double.parseDouble(Array[6]);
		case 8:
			return value * Double.parseDouble(Array[7]);
		case 9:
			return value * Double.parseDouble(Array[8]);
		default:

			return (double) 0;

		}

	}

	
	
	
//	public static String userInput (String args) {
//		String[] curr = args.split(" ");
//		
//	}
////	
////	
//	public static double converter (String[] curr, String[] value, String[] userCurr, String[] userValue) {
//		
//		switch (curr[0]) {
//		case 0:
//			
//		}
//		
//		
//		return 0;
//	}


}
