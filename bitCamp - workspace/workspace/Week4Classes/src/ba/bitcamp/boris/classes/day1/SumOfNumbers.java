package ba.bitcamp.boris.classes.day1;

public class SumOfNumbers {

	public static void main(String[] args) {

		int sum = 0;

		for (String number : args) {
			int num = Integer.parseInt(number);
			sum += num;
		}
		System.out.println(sum);

	}


}
