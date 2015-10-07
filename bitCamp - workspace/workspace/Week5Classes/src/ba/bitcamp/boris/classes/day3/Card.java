package ba.bitcamp.boris.classes.day3;

/**
 * This class represent a Card from standard deck.
 * <p>
 * Values go from 1 - 13
 * 11 - Jack
 * 12 - Queen
 * 13 - King
 * <p>
 * Suits go from 0 - 4
 * 0 - Heart
 * 1 - Diamonds
 * 2 - Clubs
 * 3 - Spades
 * 4 - Jocker
 * @author boris.tomic
 *
 */
public class Card {

	public static final int MIN_VALUE = 1;
	public static final int MAX_VALUE = 13;
	public static final int MIN_SUIT = 0;
	public static final int MAX_SUIT = 4;
	
	public static final int HEART = 0;
	public static final int DIAMOND = 1;
	public static final int CLUB = 2;
	public static final int SPADE = 3;
	public static final int JOCKER = 4;
	
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	
	private int value;
	private int suit;
	private boolean isJocker = false;

	public Card() {
		this.suit = JOCKER;
		this.value = 0;
		isJocker = true;
	}
	
	public Card(int value, int suit) throws IllegalArgumentException {
		if (value < MIN_VALUE || value > MAX_VALUE) {
			throw new IllegalArgumentException("Value must be in range 1 to 13!");
		}
		if (suit < MIN_SUIT || suit > MAX_SUIT) {
			throw new IllegalArgumentException("Suit must be in range 0 to 4!");
		}
		
		this.value = value;
		this.suit = suit;
		if (suit == 4) {
			this.isJocker = true;
		}
	}

	public int getValue() {
		return value;
	}
	
	public int getSuit() {
		return suit;
	}
	
	public void setValue(int value) {
		if(isJocker == false) {
			throw new UnsupportedOperationException("Can't change value of a non Jocker");
		}
		if (value < MIN_VALUE || value > MAX_VALUE) {
			throw new IllegalArgumentException("Value must be in range 1 to 13!");
		}
		this.value = value;
	}
	
	public void setSuit(int suit) {
		if(isJocker == false) {
			throw new UnsupportedOperationException("Can't change value of a non Jocker");
		}
		if (suit < MIN_SUIT || suit > MAX_SUIT) {
			throw new IllegalArgumentException("Suit must be in range 0 to 4!");
		}
		this.suit = suit;
	}
	
	public String getCardValue() {
		// because cards between 1 and 10 are just numbers
		if (value == 1 || value > 10) {
			switch (value) {
			case ACE:
				return "Ace";
			case JACK:
				return "Jack";
			case QUEEN:
				return "Queen";
			case KING:
				return "King";
				default:
					return "";
			}
		} else {
			return Integer.toString(value);
		}
	}
	
	
	public String getCardSuit() {
		if (suit >= 0 || suit <5) {
			switch(suit) {
			case HEART:
				return "Heart";
			case DIAMOND:
				return "Diamond";
			case CLUB:
				return "Club";
			case SPADE:
				return "Spade";
				default:
					return "Jocker";
			}
		} else {
			return Integer.toBinaryString(suit);
		}
	}
	
	
	public String getCard() {
		return getCardValue() + " " + getCardSuit();
	}
	
	public String toString() {
		return getCard();
	}
	
	
}
