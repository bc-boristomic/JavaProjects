package ba.bitcamp.boris.ecercises.day1.task1;

public class Wallet {
	
	int money;
	CreditCard[] cards;
		
	public Wallet(int maxCards) {
		this.cards = new CreditCard[maxCards];
	}
	
	
	public int getWalletBalance() {
		return money;
	}


	public int addMoneyToWallet(int addMoney) {
		for (int i = 0; i < cards.length; i++) {
			money = cards[i].cardMoney + addMoney;
		}
		return money;
	}
	
	
	public int subtractMoneyToWallet(int spendMoney) {
		for (int i = 0; i < cards.length; i++) {
			money = cards[i].getCardBalance() - spendMoney;
		}
		return money;
	}
	
	
	public void addCard(CreditCard card) {
		for (int i = 0; i < cards.length; i++) {
			if (cards[i] == null) {
				cards[i] = card;
			}
		}
	}
	

	public int getNumberOfCards(){
		int counter = 0;
		for (int i = 0; i < cards.length; i++) {
			counter = cards.length;
		}
		return counter;
	}


	
	
}
