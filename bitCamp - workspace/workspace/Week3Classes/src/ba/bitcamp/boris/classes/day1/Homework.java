package ba.bitcamp.boris.classes.day1;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/**
		 * Napisite program koji od korisnika primi unos u vidu stringa. Taj bi
		 * izraz(string) trebao biti formata “integer operator integer” , gdje
		 * integer predstavlja neki cijeli broj, operator jedan od operatora +,
		 * ­-, /, *. Vas program treba da uradi evaluaciju tog izraza i ispise
		 * rezultat. Npr za unos 1+3 vas program treba da ispise 4, a za unos
		 * 4*5 program treba da ispise 20.
		 */
		
		/*
		 * Input variable type String using Scanner.
		 * Enter some math expression ex. 1+2 or 17* 4.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter simple math expression.");
		System.out.println("integer operator integer");
		String mathExpression = input.nextLine();
		
		/*
		 * Set math operators.
		 */
		int sum = mathExpression.indexOf('+');
		int subtract = mathExpression.indexOf('-');
		int multiply = mathExpression.indexOf('*');
		int divide = mathExpression.indexOf('/');
		
		int firstNumbers = Integer.parseInt(mathExpression.substring(0, sum));
		mathExpression.replace('+', '-');
		mathExpression.replace('*', '/');
		
		int lastNumbers = Integer.parseInt(mathExpression.trim());
		
		// indexOf(parametar), substring(start, end), replace() i mozda trim()
		
		System.out.println(firstNumbers);
		System.out.println(lastNumbers);
		System.out.println(mathExpression);
		input.close();
		
	}

}
