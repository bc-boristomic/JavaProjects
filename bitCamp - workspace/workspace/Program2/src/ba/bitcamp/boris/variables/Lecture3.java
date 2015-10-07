package ba.bitcamp.boris.variables;

public class Lecture3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9;
		int num2 = 2;
		int multiplication = 3 * 9;
		int multiplication2 = num * num2;
		double division = num / num2;
		String message = "Broj " + "je ";
		char character = 65 + 1;
		int copyOfNum = num;

		System.out.println(message + num * num2);
		System.out.println(character);
		System.out.println(num / num2);
		System.out.println(division);
		System.out.println(copyOfNum);
		double division2 = (double) num / num2;
		System.out.println(division2);

		int num3 = 1;
		int num4 = 1;
		System.out.println(num++);
		System.out.println(num3);

		System.out.println(++num);

		boolean s = 2 == 3;
		System.out.println(s);
		
		int crazyNumber = 3;
		System.out.println ("Crazy Number je " + crazyNumber);
	}

}
