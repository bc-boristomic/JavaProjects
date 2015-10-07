package ba.bitcamp.exercises.day5.task4;

public class Main {
	
	public static int getFibonnaciNumber(int number){
		if(number == 0){
			return 0;
		}
		if (number == 1){
			return 1;
		}
		return getFibonnaciNumber(number - 1) + getFibonnaciNumber(number - 2);
	}

	public static void main(String[] args) {
		System.out.println(getFibonnaciNumber(9));
	}
}
