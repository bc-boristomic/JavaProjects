package ba.bitcamp.boris.exercises.day3;

public class Warmup {
	
	public static void main(String[] args) {
		
		int[][] a = { { 2, 1, 1 }, { -1, -1, 0 }, { 1, 0, 1 } };
		
		// Task Warmup
		//System.out.println(Arrays2D.getSumOf2DArray(Arrays2D.input2DArray()));
		
		// Task 1 Checks if 3x3 array is singular
		//System.out.println(Arrays2D.isSingular(a));
		
		// Task 2 Read from file and print 2D array
		//Arrays2D.print2DArray(Arrays2D.readMatrixFromFile("Matrix.txt"));
		
		// Task 3 Mines
		Arrays2D.print2DArray(Arrays2D.completeMinesweeper(Arrays2D.input2DArray()));

		
		

		
		
	}

}
