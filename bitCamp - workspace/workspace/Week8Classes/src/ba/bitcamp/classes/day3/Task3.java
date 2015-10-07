package ba.bitcamp.classes.day3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
	
	public static void main(String[] args) {
		
		int[] distributed = new int[13];
		
		int result;
		
		for (int i = 0; i < 3600; i++) {
			result = throwDice();
			distributed[result]++;
		}
		System.out.println(Arrays.toString(distributed));
		
	}

	static Random random = new Random();
	
	private static int throwDice() {
		int dice1 = random.nextInt(6) + 1;
		int dice2 = random.nextInt(6) + 1;
		return dice1 + dice2;
	}

}
