package ba.bitcamp.exercises.day4.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void print(String name, int number){
		if (number < 0) {
			throw new InputMismatchException("Number must be positive");
		}
		if (number == 0) {
			return;
		}
		System.out.println(name);
		
		print(name, number - 1);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string, then enter number");
		System.out.println("of times string will be printed");
		
		print(in.nextLine(), in.nextInt());
		
		
	}
	
	

}
