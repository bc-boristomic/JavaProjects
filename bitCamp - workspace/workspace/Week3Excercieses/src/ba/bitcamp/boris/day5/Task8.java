package ba.bitcamp.boris.day5;

public class Task8 {

	/**
	 * Napisati metodu koja prima jedan String, koji predstavlja ime file-a.
	 * Učitati iz tog file-a niz, koristeći TextIO i eof, i vratiti taj niz iz
	 * spomenute metode, pri tome obraćajući pažnju na mogući exception koji se
	 * može desiti ako traženo file ne postoji. Dobro obratiti pažnju na dužinu
	 * niza, jer dužina niza nije precizirana prije unosa elemanata niza. Moguće
	 * je napraviti jedan niz, određene dužine, i onda povećati ga ukoliko bude
	 * potrebno.
	 * 
	 * Metoda: int[] getArray3(String filename)
	 */
	
	public static int[] getArray3 (String filename) {
		int a[] = new int [90];
		try {
			TextIO.readFile(filename);
		} catch (IllegalArgumentException ex) {
			System.out.println("No file with that name.");
		}
		String s = "";
		while (!TextIO.eof()) {
			s = TextIO.getln();
		}
		System.out.println(s);
		return a;
		
	}

	
	public static void main(String[] args) {
		getArray3("src/file.txt");
	}
}
