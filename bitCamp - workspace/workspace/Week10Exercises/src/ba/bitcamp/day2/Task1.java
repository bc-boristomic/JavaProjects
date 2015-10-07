package ba.bitcamp.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task1 {

	public static void main(String[] args) {

		PrintWriter pwf = null;
		try {
			pwf = new PrintWriter(new File("file.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(System.out);

		/*
		 * Koristeći klasu PrintWriter ispisati na konzolu brojeve od 1 do 100,
		 * a između svaka dva broja jedan
		 * 
		 * String. Ispisati to isto, ali u File.
		 */
		for (int i = 1; i <= 100; i++) {
			pwf.println(i+"");
			pwf.println("-");
			pw.println(i+"");
			pw.println("-");
		}

		pw.flush();
		pwf.flush();
	}

}
