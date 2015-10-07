package ba.bitcamp.day3;

import java.util.StringTokenizer;

public class Hand {
	
	private Integer cardOneSuit;
	private Integer cardOneRank;
	private Integer cardTwoSuit;
	private Integer cardTwoRank;
	private Integer cardThreeSuit;
	private Integer cardThreeRank;
	private Integer cardFourSuit;
	private Integer cardFourRank;
	private Integer cardFiveSuit;
	private Integer cardFiveRank;
	private Integer hand;
	
	public Hand(StringTokenizer st) {
		super();
		this.cardOneSuit = Integer.parseInt(st.nextToken());
		this.cardOneRank = Integer.parseInt(st.nextToken());
		this.cardTwoSuit = Integer.parseInt(st.nextToken());
		this.cardTwoRank = Integer.parseInt(st.nextToken());
		this.cardThreeSuit = Integer.parseInt(st.nextToken());
		this.cardThreeRank = Integer.parseInt(st.nextToken());
		this.cardFourSuit = Integer.parseInt(st.nextToken());
		this.cardFourRank = Integer.parseInt(st.nextToken());
		this.cardFiveSuit = Integer.parseInt(st.nextToken());
		this.cardFiveRank = Integer.parseInt(st.nextToken());
		this.hand = Integer.parseInt(st.nextToken());
	}

	public Integer getHand() {
		return hand;
	}
	
	@Override
	public String toString() {
		return "Hand [cardOneSuit=" + cardOneSuit + ", cardOneRank="
				+ cardOneRank + ", cardTwoSuit=" + cardTwoSuit
				+ ", cardTwoRank=" + cardTwoRank + ", cardThreeSuit="
				+ cardThreeSuit + ", cardThreeRank=" + cardThreeRank
				+ ", cardFourSuit=" + cardFourSuit + ", cardFourRank="
				+ cardFourRank + ", cardFiveSuit=" + cardFiveSuit
				+ ", cardFiveRank=" + cardFiveRank + ", hand=" + hand + "]\n";
	}
	
	
	
	

}
