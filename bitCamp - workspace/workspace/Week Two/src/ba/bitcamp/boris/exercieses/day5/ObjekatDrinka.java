package ba.bitcamp.boris.exercieses.day5;

public class ObjekatDrinka {

	public static void main(String[] args) {
		
		
		Drink d1 = new Drink();
		d1.name = "Pepsi";
		d1.isSoda = true;
		d1.expirationYear = 2015;
		d1.color = "Black";
		
		System.out.println(d1.name);
		System.out.println(d1.isSoda);
		System.out.println(d1.expirationYear);
		System.out.println(d1.color);
		
		System.out.println(d1);

		Drink d2 = new Drink ();
		d2.name = "Bijela voda";
		d2.isSoda = false;
		d2.expirationYear = 2015;
		d2.color = "";
		
		System.out.println(d2);
		
		

	}

}
