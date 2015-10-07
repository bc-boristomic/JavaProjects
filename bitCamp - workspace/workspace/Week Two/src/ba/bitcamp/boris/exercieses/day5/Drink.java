package ba.bitcamp.boris.exercieses.day5;

class Drink {

	String name;
	boolean isSoda;
	int expirationYear;
	String color;

	
	/**
	 * Ovo je metoda toString
	 */
	public String toString () {
		String s = "";
		s = s + "Name; " + name + "\n";
		s = s + "Is soda: " + isSoda + "\n";
		s = s + "Expiration year: " + expirationYear + "\n";
		s = s + "Color: " + color + "\n";
		
		return s;

	}
}
