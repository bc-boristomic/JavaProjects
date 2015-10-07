

	public class Task1 {

		public static void main(String[] args) {
		
			String bin = "1110";	// Binary string.
			int n = 4;
			
			String first = "";
			int base10 = 0;
			String secondComplement = "";
			
			if (!(bin.charAt(0) == '1' && bin.length() == 1)) {
				System.out.println(bin);
				System.exit(0);
			}
			
			for (int i = 0; i < bin.length(); i++) {
				if (bin.charAt(i) == '1') {
					first += '0';
				} else {
					first += '1';
				}
			}
			
			for (int i = 0; i < first.length(); i++) {
				if (first.charAt(i) == '1') {
					base10 += (int)Math.pow(2, first.length() - 1 - i);
				}
			}
			base10++;
			
			while (base10 != 0) {
				if (base10 %2 == 0) {
					secondComplement = "0" + secondComplement;
				} else {
					secondComplement = "1" + secondComplement;
				}
				base10 /= 2;
			}

			System.out.println(secondComplement);
			System.out.println(base10);
			System.out.println(first);
			System.out.println(bin);
			
		}

	}

	
	

