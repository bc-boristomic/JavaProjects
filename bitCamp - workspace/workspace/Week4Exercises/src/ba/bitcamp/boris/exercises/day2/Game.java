package ba.bitcamp.boris.exercises.day2;

import java.util.Arrays;

public class Game {
	
	public static void main(String[] args) {
		TextIO.readFile("game.txt");
		
		char[] array = new char [8];
		char[] temp = new char [8];
		while (!TextIO.eof()) {
			String s = TextIO.getln();
			
			System.out.println(s);
			for (int i = 0; i < array.length-1; i++) {
				array[i] = s.charAt(i);
			}
			if (s.charAt(0) == 's' && s.charAt(1) != '*') {
				temp[1] = array[0];
				temp[0] = '*';
				System.out.println(Arrays.toString(temp));
			} if (s.charAt(2) != '*') {
				array[2] = temp[1];
				
			}
			
		}
		
	}

}
