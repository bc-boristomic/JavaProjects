package ba.bitcamp.boris.excercises.day1;

public class Loop4 {

	public static void main(String[] args) {
		//Program koji sadrži pozitivni cijeli broj n. Ispisati na konzolu n!.
				
		int n = 4;
		int sum = 1;
		while (n > 0) {
			sum = sum * n;
			n--;
		}
		System.out.println(sum);
	}

}
