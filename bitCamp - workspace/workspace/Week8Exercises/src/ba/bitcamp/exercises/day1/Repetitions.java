package ba.bitcamp.exercises.day1;

public class Repetitions {

	
	private static int howManytimes(int num, int... a){
		int counter = 0;
		for (int i : a) {
			if (num == i) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
			
		System.out.println(howManytimes(1,1,2,3,4,5,1,1, 1, 12,6,7));

	}

}
