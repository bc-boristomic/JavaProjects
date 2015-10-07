public class Task4 {

	public static void main(String[] args) {

		TextIO.readFile("encodedFile.in");
		int n = TextIO.getlnInt(); // Read first line, only number.

		for (int i = 1; i <= n; i++) {
			String pasus = TextIO.getln();
			int l = pasus.length();
			for (int j = 0; j < l; j++) {
				char c = pasus.charAt(j);
				int broj = c - 1;
				c = (char) broj;
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
