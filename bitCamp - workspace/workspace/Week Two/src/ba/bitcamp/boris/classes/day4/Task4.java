package ba.bitcamp.boris.classes.day4;

public class Task4 {

	public static void main(String[] args) {

		/*
		 * If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs
		 * left over. (This is essentially the definition of the / and %
		 * operators for integers.) Write a program that asks the user how many
		 * eggs she has and then tells the user how many dozen eggs she has and
		 * how many extra eggs are left over.
		 * 
		 * A gross of eggs is equal to 144 eggs. Extend your program so that it
		 * will tell the user how many gross, how many dozen, and how many left
		 * over eggs she has. For example, if the user says that she has 1342
		 * eggs, then your program would respond with
		 * 
		 * Your number of eggs is 9 gross, 3 dozen, and 10 since 1342 is equal
		 * to 9*144 + 3*12 + 10.
		 */

		int eggs;
		System.out.println("How many eggs do you have?");
		eggs = TextIO.getlnInt();
		int dozens;
		dozens = eggs / 12;
		int left = eggs % 12;

		System.out.printf("You have %d or %d dozens and %d whole of eggs.", eggs, dozens, left);

	}

}