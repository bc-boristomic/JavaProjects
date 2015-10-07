package ba.bitcamp.classes.day5;

public class Task1 {
	
	public static void main(String[] args) {
		
		int[][] array = { { 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2 }, { 3, 3, 3, 3, 3 }, { 4, 4, 4, 4, 4 } };
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j > 0 && j < array.length) {
					System.out.print(" - " + array[i][j]);
				} else {
					System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}
		
	}
}
