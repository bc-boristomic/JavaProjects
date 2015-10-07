package ba.bitcamp.boris.exercieses.day4;

public class Task4 {

	public static void main(String[] args) {

		TextIO.readFile("src/file.txt");

		int a = TextIO.getInt();
		int b = TextIO.getInt();

		System.out.println(a + b);
	}

}
