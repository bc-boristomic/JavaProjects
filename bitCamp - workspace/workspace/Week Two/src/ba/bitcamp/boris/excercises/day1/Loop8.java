package ba.bitcamp.boris.excercises.day1;

public class Loop8 {

	public static void main(String[] args) {
		/*Program koji sadrži pozitivni cijeli broj n. Ispisati na konzolu da li je taj broj
prost, tj. može se samo dijeliti sa 1 i sa samim sobom.
		 */

		int n = 3;
		int a = 0;
		
		while ((n / n == 1) && (n % 2 != 0) && (n % 3 != 0)) {
			
			n++;
			System.out.println("prost");
		} 
			System.out.println("nije");
		
	}

}
