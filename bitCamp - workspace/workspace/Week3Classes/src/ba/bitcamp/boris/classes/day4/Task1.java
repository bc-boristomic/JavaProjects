package ba.bitcamp.boris.classes.day4;

public class Task1 {

	public static void main(String[] args) {
		

		/*
		 *  Cars shuffle game
		 */
		
		// New deck
		byte[] karte = new byte [52];
		// Start from 0 include 52 cards
		for (int i = 0; i < karte.length; i++) {
			karte[i] = (byte)(i + 1);
		}
		// Print new deck, from 1 to 52
		for (int i = 0; i < karte.length; i++) {
			System.out.print(karte[i] + " ");
		}
		System.out.println();
		// 10 times shuffle
		for (int brojMijesanja = 0; brojMijesanja < 10; brojMijesanja++) {
			// 15 times
			for (int brojZamjena = 0; brojZamjena < 15; brojZamjena++) {
				// Switch 2 random cards
				// Take random card
				int indexPrveKarte = (int)(Math.random() * 52);
				// Take another random card
				int indexDrugeKarte = (int)(Math.random() * 52);
				// Switch their places
				byte tmp = karte[indexPrveKarte];
				karte[indexPrveKarte] = karte[indexDrugeKarte];
				karte[indexDrugeKarte] = karte[tmp];
			}
			// Look at cards
			for (int i = 0; i < karte.length; i++) {
				System.out.print(karte[i] + " ");
			}
			System.out.println();
		}
		// Print first four cards
		for (int i = 0; i < 4; i++) {
			System.out.print(karte[i]);
		}
		// Kick deal cards from deck
		byte[] reducirani = new byte [52 - 4];
		for (int i = 4; i < reducirani.length; i++) {
			reducirani[i] = karte[i + 4];
		}
		karte = reducirani;
	}

}
