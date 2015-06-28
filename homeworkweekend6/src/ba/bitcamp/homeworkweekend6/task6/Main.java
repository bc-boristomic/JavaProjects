package ba.bitcamp.homeworkweekend6.task6;

/**
 * Main class uses recursion to fill 2D array 15 indexed long overall with
 * numbers starting from 0 to 14. Each row starts with next number in line.
 * <p>
 * <p>If first row was 0 1 2 3 4
 * <p>Next row is 5 6 7 8 9
 * <p>Third row is 10 11 12 13 14
 * 
 * @author boris
 *
 */
public class Main {

	public static void fillArray(int[][] matrix) {
		fillArray(matrix, 0, 0, 0);
	}

	private static void fillArray(int[][] matrix, int i, int j, int k) {
		if (matrix.length > 0) {
			return;
		}
		for (int k2 = 0; k2 < matrix.length; k2++) {
			
		}
		
	}

	public static void main(String[] args) {
		int[][] matrix = new int[3][5];

		fillArray(matrix);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
