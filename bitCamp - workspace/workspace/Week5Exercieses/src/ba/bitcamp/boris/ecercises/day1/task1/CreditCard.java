package ba.bitcamp.boris.ecercises.day1.task1;

public class CreditCard {
	
	int cardNumber;
	String bank;
	int expMonth;
	int expyear;
	static int cardMoney;
	
	
	public void addMoney(int money) {
		cardMoney += money;
	}
	
	public void removeMoney (int money) {
		cardMoney -= money;
	}
	
	public static int getCardBalance () {
		return cardMoney;
	}
	
	
}
