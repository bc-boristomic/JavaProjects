package ba.bitcamp.homeworkclasses20.task4;

import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.JOptionPane;

import ba.bitcamp.homeworkclasses20.task1.TextIO;

public class Task4 {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();
		String filename = JOptionPane.showInputDialog(
				"Enter filename and location\nex. README.md", null);

		try {
			TextIO.readFile(filename);
		} catch (IllegalArgumentException e) {
			System.out.println("Enter legal filename");
			System.exit(0);
		}
		String text = readNextWord();
		while (text != null) {
			text = text.toLowerCase();
			if (!set.contains(text)) {
				set.add(text);
			}
			text = readNextWord();
		}

		TreeSet<String> sorted = sort(set);

		TextIO.writeUserSelectedFile();
		for (String string : sorted) {
			TextIO.putln(string);
		}
		System.out.println("Operation completed");

	}

	private static TreeSet<String> sort(HashSet<String> set) {
		TreeSet<String> sorted = new TreeSet<>();
		for (String string : set) {
			sorted.add(string);
		}
		return sorted;
	}

	private static String readNextWord() {
		char ch = TextIO.peek(); // Look at next character in input.
		while (ch != TextIO.EOF && !Character.isLetter(ch)) {
			// Skip past non-letters.
			TextIO.getAnyChar(); // Read the character.
			ch = TextIO.peek(); // Look at the next character.
		}
		if (ch == TextIO.EOF) // Encountered end-of-file
			return null;
		// At this point, we know that the next character, so read a word.
		String word = ""; // This will be the word that is read.
		while (true) {
			word += TextIO.getAnyChar(); // Append the letter onto word.
			ch = TextIO.peek(); // Look at next character.
			if (ch == '\'') {
				// The next character is an apostrophe. Read it, and
				// if the following character is a letter, add both the
				// apostrophe and the letter onto the word and continue
				// reading the word. If the character after the apostrophe
				// is not a letter, the word is done, so break out of the loop.
				TextIO.getAnyChar(); // Read the apostrophe.
				ch = TextIO.peek(); // Look at char that follows apostrophe.
				if (Character.isLetter(ch)) {
					word += "\'" + TextIO.getAnyChar();
					ch = TextIO.peek(); // Look at next char.
				} else
					break;
			}
			if (!Character.isLetter(ch)) {
				// If the next character is not a letter, the word is
				// finished, so break out of the loop.
				break;
			}
			// If we haven't broken out of the loop, next char is a letter.
		}
		return word; // Return the word that has been read.
	}

}
