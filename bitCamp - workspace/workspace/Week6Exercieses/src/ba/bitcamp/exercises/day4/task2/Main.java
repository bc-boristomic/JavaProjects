package ba.bitcamp.exercises.day4.task2;

import java.util.InputMismatchException;

public class Main {
	
	public static void printEverySecondNumber(int number){
		if (number == 1){
			throw new InputMismatchException("Wrong input, number must be larger then 1.");
		}
		if (number < 2) {
			return;
		}
		System.out.println(number);
		printEverySecondNumber(number - 2);
	}

	public static void main(String[] args) {
		printEverySecondNumber(30);
	}
	
}
