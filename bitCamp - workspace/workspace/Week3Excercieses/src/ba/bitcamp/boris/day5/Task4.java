package ba.bitcamp.boris.day5;

public class Task4 {

	public static void main(String[] args) {
		
		// Napisati metodu koja prima dva String-a. Jedan String označava ime
		// file-a dok drugi predstavlja poruku koja se
		//
		// treba ispisati u spomenuti file.
		//
		// Metoda: void writeToFile(String filename, String msg)
		//
		// Primjeri
		//
		// writeToFile(„text.txt“, „BitCamp <3“)
	
		
		writeToFile("src/file.txt", "poruka");
	}

	public static void writeToFile (String filename, String msg) {
		TextIO.writeFile(filename);
		TextIO.put(msg);
		
	}
	
	
}
