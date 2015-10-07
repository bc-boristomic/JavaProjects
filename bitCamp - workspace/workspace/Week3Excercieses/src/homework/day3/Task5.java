package homework.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		// Enter String array length using scanner.
		System.out.println("enter length of String array");
		int length = input.nextInt();
		
		String[] s = new String [length];
		
		// Enter value for each String array index.
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter value at index " + i);
			s[i] = input.next();
		}
		
		// Take number to check (number is string)	
		System.out.println("Input number to check if it's in array");
		String num = input.next();
		
		// Check how many times that number appeared (compare strings)
		int c = 0;
		char[] arr2 = new char [s.length];
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				s[i] = Integer.toBinaryString(j);				
				if (num == s[j]) {
					c++;
			}
			}
		}
		System.out.printf("Number %s appeared times %d.\n", num, c);
		System.out.println("Your array is " + Arrays.toString(s));
		input.close();


	}

}
