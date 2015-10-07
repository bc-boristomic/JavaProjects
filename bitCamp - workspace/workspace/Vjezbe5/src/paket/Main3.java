package paket;

public class Main3 {

	public static void main (String[]args){
		
		// 1. Program koji određuje da li je broj pozitivan ili negativan.
		
		int a = -3;
		
		if (a > 0) {									// Check if number is less then zero.
			System.out.println("Broj je pozitivan.");
		} else {
			System.out.println("Broj je negativan");
		}
		
		// 2. Program koji određuje da li je broj paran ili neparan.
		
		int b = 8;
		int c = b%2;
		
		if (b != c) {
			System.out.println("Broj je neparan.");
		} else {
			System.out.println("Broj je paran.");
		}
		
		
		
		// 3. Program koji odredi koji je najveći broj od data tri broja.
		
		int num1 = 2;
		int num2 = 4;
		int num3 = 6;
		
		if (num1 >= num2 && num1 >= num3) {				// Check if num1 is greater than two others.
			System.out.println("Broj 1 je najveci.");
		} else if (num2 >= num1 && num2 >= num3) {		// Check if num2 is greater than two others.
			System.out.println("Broj 2 je najveci");
		} else {										// Check if num 3 is greather than two others.
			System.out.println("Broj 3 je najveci");
		}
			
	
		// 4. Program koji odredi da li se dati broj nalazi u između 0 i 25, između 25-50 ili je van tih opsega.
		
		int num4 = 51;
		
		if (num4 >= 0 && num4 <= 25) {								// Number between 0 and 25
			System.out.println("Broj se nalazi izmedju 0 i 25.");
		} else if (num4 > 25 && num4 <= 50) {
			System.out.println("Broj se nalazi izmedju 25 i 50.");
		} else {
			System.out.println("Broj nije unutar vrijednosti.");
		}
		
		
		// 5. Program koji za dati rođendan, unesen u vidu dana i mjeseca, određuje da li je taj rođendan bio ili treba da bude ove godine.
		
		double bD = 21;
		double bM = 5;
		double bY = 1986;
		double bB = (bD + bM) / 100;
		
		double dT = 22;
		double mT = 5;
		double zT = 2015;
		double tT = (dT + mT) /100;
		
		if (bB > tT) {
			System.out.println("Rodjendan jos nije prosao.");
		} else if (bB < tT) {
			System.out.println("Rodjendan je prosao");
		} else {
			System.out.println("Sretan rodjendan");
		}
		
		
		
	}
}
