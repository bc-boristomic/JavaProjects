package ba.bitcamp.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchFiles {

	public static void main(String[] args) {
		
		do {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(
						"file.txt"));
				String line = "";
				String searchTerm = "";
				Scanner input = new Scanner(System.in);
				searchTerm = input.nextLine();
				long start = System.currentTimeMillis();
				int counter = 0;
				while (reader.ready()) {
					line = reader.readLine();
					counter++;
					if (line.toLowerCase().contains(searchTerm)) {
						System.out.println("On line " + counter + " found word " + searchTerm + " " + line);
						System.out.println("time took to find word " + (System.currentTimeMillis() - start) + " ms");
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println("File not found!");
			} catch (IOException e) {
				System.out.println("Wrong IO");
			}
		} while (true);


		
	}
}