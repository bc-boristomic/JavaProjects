import java.util.Scanner;

public class TaskMujo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesi n");
		int n = input.nextInt();
		System.out.println("Unesi k");
		int k = input.nextInt();

		int c = 0;
		int reducedN = n;

		while (reducedN > k) {
			reducedN = n;
			while (reducedN % 2 == 0) {
				reducedN /= 2;
			}
		}

		if (reducedN > k) {
			n++;
			c++;
		}

		
		
		input.close();
	}

}
