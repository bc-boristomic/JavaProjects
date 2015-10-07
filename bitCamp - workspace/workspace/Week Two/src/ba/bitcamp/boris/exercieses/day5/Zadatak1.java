package ba.bitcamp.boris.exercieses.day5;

public class Zadatak1 {
	/**
	 * Napisati funkciju koja za tri prirodna broja vraća sumu svih pozitivnih
	 * brojeva manjih od ta tri broja
	 * 
	 * (uključujući te brojeve). Ukoliko su a = 7, b = 6 i c = 3, suma je:
	 * 
	 * (7 + 6 + 5 + 4 + 3 + 2 + 1) + (6 + 5 + 4 + 3 + 2 + 1) + (3 + 2 + 1) = 28
	 * + 21 + 6 = 55
	 * 
	 * Funkcija: int getSum(int a, int b, int c)
	 * 
	 * Primjeri:
	 * 
	 * getSum(1, 2, 3) = 10
	 * 
	 * getSum(5, 5, 5) = 45
	 * 
	 * getSum(11, 11, 3) = 138
	 */
	
	public static int getSum (int a, int b, int c){
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 1; i <= a; i++) {
			sum3 += i;
		}
		for (int j = 1; j <= b; j++) {
			sum2 += j;
		}
		for (int j2 = 1; j2 <= c; j2++) {
			sum1 += j2;	
		}
		sum = sum1 + sum2 + sum3;
		return sum;
	}
	public static void main (String []args){
		
		System.out.println(getSum(7, 6, 3));
		System.out.println(getSum(1, 2, 3));
	}
	
}
