package ba.bitcamp.boris.exercises.day1;

import java.awt.Font;

public class Task2 {

	public static void main(String[] args) {
		Font f = new Font("Arial", Font.ITALIC, 18);
		printFontDetails(f);

	}

	/**
	 * Prints to console font size, name and Italic angle.
	 * 
	 * @param f Used to get font size, name and Italic angle.
	 * @throws NullPointerException if f is null
	 */
	public static void printFontDetails(Font f) {
		if (f == null) {
			throw new NullPointerException("Enter some value!");
		}
		System.out.println("Font size is " + f.getSize());
		System.out.println("Font name is " + f.getFontName());
		System.out.println("Italic angle is " + f.getItalicAngle());

	}
}
