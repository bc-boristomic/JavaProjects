package ba.bitcamp.homework25.task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Utility class ReadFromResources have one static that can be called from any
 * class without instancing object. Only function is to read text files and
 * return string, string is read as single line.
 * 
 * @author boris
 *
 */
public class ReadFromResources {

	/**
	 * Returns <code>String</code> type value of text from text file. Used to
	 * read html and css files and to send read text to website.
	 * 
	 * @param filename
	 *            <code>String</code> type value of requested filename
	 * @return <code>String</code> type value of text from file
	 */
	public static String readFile(String filename) {
		String fileLocation = "resources" + filename;
		String fileAsString = "";
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(fileLocation));
			while (reader.ready()) {
				fileAsString += reader.readLine() + "\n";
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found at given location "
					+ fileLocation);
			System.err.println("Error message: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Could not read from file.");
			System.err.println("Error message: " + e.getMessage());
		}
		try {
			reader.close();
		} catch (IOException e) {
			System.out.println("Reader cound not close propertly");
			System.err.println("Error message: " + e.getMessage());
		}
		return fileAsString;
	}

}
