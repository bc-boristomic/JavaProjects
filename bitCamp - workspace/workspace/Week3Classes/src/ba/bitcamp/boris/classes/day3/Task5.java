package ba.bitcamp.boris.classes.day3;

public class Task5 {

	public static void main(String[] args) {
		
		// Random cards shuffle
		
		byte[] cards = new byte [52];
		int newCards;
		
		for (int i = 0; i < cards.length; i++) {
			newCards = (int)(Math.random()*52);
			System.out.println(newCards);
		}
		
		
	}

}
