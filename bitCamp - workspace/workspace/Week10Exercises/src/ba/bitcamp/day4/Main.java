package ba.bitcamp.day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		BufferedReader read = null;;
		try {
			read = new BufferedReader (new FileReader(new File("Dislodge.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			String line = null;
			try {
				while (read.ready()) {
					line = read.readLine();
					StringTokenizer st = new StringTokenizer(line, " ");
					String token = st.nextToken();
				System.out.println(token);
					list.add(token);
					
				}
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(line);
		
	}
}
