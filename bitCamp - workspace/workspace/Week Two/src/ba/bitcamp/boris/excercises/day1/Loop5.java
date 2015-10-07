package ba.bitcamp.boris.excercises.day1;

public class Loop5 {

	public static void main(String[] args) {
		/*
		 * Program koji sadrži pozitivni cijeli broj n. Ispisati sve brojeve od
		 * 1 do n koji su neparni i djeljivi sa tri, a nisu sa pet.
		 */

		int n = 30;
		int n1 = 100;

		while (n1 > n) {
			if ((n % 2 != 0) && (n % 3 == 0) && (n % 5 != 0)) {
				System.out.println(n);
			}
			n++;
		}

	}

}
