package day4;

import java.math.BigInteger;

public class RSA {
	
	public static void main(String[] args) {
		
		BigInteger sum = new BigInteger("31176236472038964811");
		
		for (BigInteger i = new BigInteger("0"); i.compareTo(sum) < 0; i = i.add(new BigInteger("1"))) {
			System.out.println(i);
		}
		
		
		
	}
	
	public static boolean isPrimeEfficient(int num) {
		if (num == 0 || num == 1) {
			return false;
		}

		if (num == 2) {
			return true;
		}

		if (num % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
