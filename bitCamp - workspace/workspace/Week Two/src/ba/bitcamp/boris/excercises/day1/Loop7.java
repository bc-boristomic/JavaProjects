package ba.bitcamp.boris.excercises.day1;

public class Loop7 {

	public static void main(String[] args) {
		/*Program koji ispisuje na ekran da li je dati pozitivni cijeli broj n palindrom. 
Palindrom je broj koji ima istu vrijednost gledajući ga sa desne i sa lijeve 
strane, npr. 1221, 959, 111 i 10501.
		 		 */

		int n = 2954;
		int b = 0;
		int c = 0;
		
		
		do {
			b = n % 10;
			n = n / 10;
			System.out.println(b);
		} while (n > 0);
			n++;
			
				
			
		}
		
		
	}


