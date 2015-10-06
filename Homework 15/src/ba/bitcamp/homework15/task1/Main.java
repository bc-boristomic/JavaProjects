package ba.bitcamp.homework15.task1;

public class Main {

	public static void main(String[] args) {

		CashRegister c1 = new CashRegister("Black fond");

		c1.printInformation();

		c1.addMoney(30);

		c1.printInformation();

		c1.addMoney(100);

		c1.printInformation();

		c1.spendAllMoney();

		c1.printInformation();

	}

}