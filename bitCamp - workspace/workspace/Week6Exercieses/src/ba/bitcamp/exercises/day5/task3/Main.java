package ba.bitcamp.exercises.day5.task3;

import java.util.InputMismatchException;

public class Main {
	
	public static int getSum(int num){
		if (num < 0){
			throw new InputMismatchException("Wrong input, number must be over 0");
		}
		if (num == 0){
			return 0;
		}
		return num + getSum(num - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(getSum(100));
	}

}
