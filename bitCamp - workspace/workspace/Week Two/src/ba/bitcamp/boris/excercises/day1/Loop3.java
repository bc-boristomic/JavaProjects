package ba.bitcamp.boris.excercises.day1;

public class Loop3 {

	public static void main(String[] args) {
		/*
		 * / Program koji sadrži pozitivni cijeli broj n. Sabrati sve brojeve od
		 * 1 do n i ispisati na konzolu rješenje.
		 */
		int n = 3;
		int sum = 0;
				
		while (n > 0) {
			sum = sum + n;
			n--;
		}
		System.out.println(sum);
		

	}

}
