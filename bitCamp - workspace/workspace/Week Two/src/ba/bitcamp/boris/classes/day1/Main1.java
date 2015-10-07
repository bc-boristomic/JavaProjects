package ba.bitcamp.boris.classes.day1;

public class Main1 {

	public static void main(String[] args) {
		int mainint = 10;
		if (mainint > 0) {
			mainint -= 2;
			int ifInt = 7;
			System.out.println("ifint from if " + ifInt);
			System.out.println("main int from if " + mainint);
		} else {
			
		}
		System.out.println("mainint from main " + mainint);
		int ifInt = 5;
		System.out.println("ifint from if " + ifInt);
		
		
		int brojac = 100;
		int broj = 1;
				
		while  (broj < brojac) {
			if (broj % 3 == 0 && broj % 5 == 0) {
				System.out.println("Fizz" + broj);
			} else if (broj % 3 == 0 && broj % 5 != 0) {
				System.out.println("Buzz" + broj);
			} else if (broj % 3 != 0 && broj % 5 == 0) {
				System.out.println("FizzBuzz" + broj);
			} else {
				System.out.println(broj);
			}
			broj++;
	}
		
		
	}

}
