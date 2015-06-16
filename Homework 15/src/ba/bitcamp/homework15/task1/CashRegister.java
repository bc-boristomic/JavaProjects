package ba.bitcamp.homework15.task1;

public class CashRegister {
	
	private String savingFond;
	private int currentBalance;
	
	public CashRegister(String name) {
		this.savingFond = name;
		this.currentBalance = 0;
	}
	
	
	/**
	 * Adds specific amount of money to CashRegister.
	 * <p>
	 * @param amount - Money you want to add to CashRegister
	 */
	public void addMoney(int amount) {
		currentBalance += amount;
	}
	
	/**
	 * Spends all money from CashRegister
	 */
	public void spendAllMoney() {
		currentBalance = 0;
	}
	
	/**
	 * Prints information about current balance in CashRegister.
	 */
	public void printInformation() {
		if (currentBalance == 0) {
			System.out.println("It is empty...");
		} else if (currentBalance > 0 && currentBalance < 21) {
			System.out.println("There’s some, but not much.");
		} else if (currentBalance > 20 && currentBalance < 101) {
			System.out.println("There’s some.");
		} else if (currentBalance > 100) {
			System.out.println("There’s a lot.");
		}
	}
	
	

}