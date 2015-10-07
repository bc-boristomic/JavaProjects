package ba.bitcamp.boris.homework.week4.day2;

public class Task2 {

	public static void main(String[] args) {

		int min = 0;
		for (String number : args) {
			try {
				int num = Integer.parseInt(number);
				if (min > num) {
					min = num;
				}
			} catch (NumberFormatException ex) {
				System.out.println("Please enter only numbers.");
			}
			
		}
		System.out.println(min);
		
		
	}


	
}
