package ba.bitcamp.exercises.day1.task3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * <p>An interface that provides:
 * <ul><li>Constants that indicate the clock format available
 * <li><code>addToFile(String, int)</code> method header
 * <li><code>writeToFile(String, String)</code> method with implementation
 * </ul>
 * @author Zaid
 *
 */
interface WriteableClock {
	/**
	 * Clock format with AM/PM, ex. 3:35:55 PM
	 */
	int AMPM_FORMAT = 0;
	
	/**
	 * Clock format with AM/PM, without seconds, ex. 3:55 PM
	 */
	int AMPM_FORMAT_NO_SECONDS = 1;
	
	/**
	 * Military format type of clock, ex. 13:35:55
	 */
	int MILITARY_FORMAT = 2;
	
	/**
	 * Military format type without seconds, ex. 13:35 
	 */
	int MILITARY_FORMAT_NO_SECONDS = 3;
	
	/**
	 * <p>Method that should convert the clock's attributes
	 * into the wanted format and then should call the
	 * <code>writeToFile(String, String)</code> method in order
	 * to write the clock into a file.
	 * <p>This method should be only called from the <code>main</code> method.
	 * @param filename Path to the file in which the clock will be written to
	 * @param format One of the type constants, ex. <code>MILITARY_TIME</code>
	 */
	void addToFile(String filename, int format);
	
	/**
	 * <b>Adds</b> the given time into a file.
	 * Ukoliko nemate JAVA 1.8, nego neku stariju verziju onda prekopirajte ovu
	 * metodu u svoju klasu i stavite da je private umjesto default.
	 * @param filename Path to the file
	 * @param time <code>String</code> which will be written
	 */
	default void writeToFile(String filename, String time) {
		BufferedWriter writer = null;
		BufferedReader reader = null;
		ArrayList<String> linesOfFile = new ArrayList<>();
		
		// First read the whole file
		try {
			reader = new BufferedReader(new FileReader(new File(filename)));
			
			while (reader.ready()) {
				String line = reader.readLine();
				linesOfFile.add(line);
			}
			
			reader.close();
		} catch (IOException e1) {
			// Continue if the file does not exist
		}
		
		// Write the old data before placing in the new
		try {
			writer = new BufferedWriter(new FileWriter(new File(filename)));
			
			for (int i = 0; i < linesOfFile.size(); i++) {
				writer.write(linesOfFile.get(i));
				writer.newLine();
			}
			
			writer.write(time); // Write the needed String
			
			writer.close();	
		} catch (IOException e) {
			throw new IllegalArgumentException("Could not write to file!");
		}
	}
}
