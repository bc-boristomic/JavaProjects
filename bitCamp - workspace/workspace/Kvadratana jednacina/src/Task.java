import java.util.Scanner;


public class Task {
	
	private static void checkEquasion(Double a, Double b, Double c){
		Double d = (b * b) - (4 * a * c);
		if (d == 0) {
			System.out.println("Equasion has one solution.");
		} else if (d > 0) {
			System.out.println("Equasion have two real solutions.");
		} else if (d < 0) {
			System.err.println("No real solution found.");
		}
		System.out.println(d);
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter double value for number a");
		Double a = in.nextDouble();
		
		System.out.println("Enter double value for number b");
		Double b = in.nextDouble();
		
		System.out.println("Enter double value for number c");
		Double c = in.nextDouble();
				
	
		in.close();
		
		checkEquasion(a, b, c);
		
		
	}

}
