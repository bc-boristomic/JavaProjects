package ba.bitcamp.boris.ecercises.day1.task1;

import java.io.ObjectInputStream.GetField;

public class Main {
	
	public static void main(String[] args) {
		
		Bag b = new Bag(40);
		
		System.out.println(b.getMaxCapacity());
		
		b.add(20);
		//b.add(30);
		
		System.out.println(b.getFreeSpace());
		
		b.add(20);
		
		System.out.println(b.getCurrentCapacity());
		
		//b.add(20);
		System.out.println(b.getCurrentCapacity());
		System.out.println(b.getFreeSpace());
		b.remove(4);
		System.out.println(b.getCurrentCapacity());
		System.out.println(b.getFreeSpace());


		System.out.println();
		System.out.println("Money");
		
		Wallet w = new Wallet(2);
		System.out.println(w.getWalletBalance());
		
		CreditCard c1 = new CreditCard();
		c1.addMoney(7900);
		System.out.println(c1.getCardBalance());
		
		w.addCard(c1);
		
		CreditCard c2 = new CreditCard();
		c2.addMoney(5000);

		w.addCard(c2);

		CreditCard c3 = new CreditCard();
		CreditCard c4 = new CreditCard();
		CreditCard c5 = new CreditCard();
		w.addCard(c3);
		c3.addMoney(1);
		w.addCard(c4);
		c4.addMoney(10);
		w.addCard(c5);
		c5.addMoney(20);
		c5.addMoney(20);
		
		System.out.println(w.addMoneyToWallet(18));
		
		System.out.println(w.subtractMoneyToWallet(1));
		
		
		System.out.println(w.getNumberOfCards());
		
		
//		for (int i = 0; i < w.getNumberOfCards(); i++) {
//
//			System.out.println(w.getCard(i).getCardBalance());
//
//			}
		
	}

}
