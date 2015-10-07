package ba.bitcamp.classes.day4;

import java.util.Random;

import javax.swing.JOptionPane;

public class Task3 {
	
	private static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int location = i - 1;
			
			while (location >= 0 && temp < array[location]) {
				array[location + 1] = array[location];
				location--;
			}
			array[location + 1] = temp;
		}
	}
	
	
	public static void main(String[] args) {
		
		int length = 1000000;
		int[] array = new int[length];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(20);
		}
		
		//System.out.println(Arrays.toString(array));
		long start = System.currentTimeMillis();
		insertionSort(array);
		JOptionPane.showMessageDialog(null, System.currentTimeMillis() - start);
		//System.out.println(Arrays.toString(array));

		
	}

}
