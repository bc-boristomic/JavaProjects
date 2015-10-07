package ba.bitcamp.boris.day5;

public class Task1 {

	public static void main(String[] args) {

		/**
		 * Zadatak 1
		 * 
		 * Napisati metodu koja spaja dva data String-a na sljedeći način: Prvi
		 * String staviti u sredinu drugog String- a. Koristiti concat i
		 * substring metode!
		 * 
		 * Metoda: String merge(String s1, String s2)
		 * 		 * Primjeri
		 * 		 * merge(„Java“, „Srce“) = „SrJavace“
		 * 		 * merge(„int“, „int“) = „iintnt“
		 * 		 * merge(„pamet“, „“) = „pamet“
		 * 		 * merge(„“, „mozak“) = „glava“
		 */

		System.out.println(merge("Java", "Srce"));
	}
	
	public static String merge (String s1, String s2) {
		int a = s2.length() / 2; 
		return  s2.substring(0, a) + s1.concat(s2.substring(a));		
	}

}
