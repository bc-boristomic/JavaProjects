package ba.bitcamp.boris.exercieses.day5;

public class Zadatak2 {

	/**
	 * Zadatak II – Rupe u Ciframa
	 * 
	 * Ajdinu je uvijek bilo dosadno na časovima matematike, jer je njemu
	 * matematika izgledala jako
	 * 
	 * jednostavno. Profesorica Amra je to primijetila i odlučila da smisli neku
	 * posebnu igru za Ajdina da ga
	 * 
	 * može zabaviti. Sljedeći dan profesorica daje Ajdinu sljedeći zadatak:
	 * „Ako 1234 daje 1, 3508 daje 3,
	 * 
	 * 9768 daje 4, a 8094 daje 5, koliko onda daje broj 12894?“
	 * 
	 * Ni nakon par sati pokušavanja Ajdin nije mogao pronaći rješenje. Po
	 * prirodi Ajdin nije osoba koja zna
	 * 
	 * priznati poraz, pa je odlučio varati. Na internetu je pronašao rješenje,
	 * 12894 daje broj 4. To se dobije
	 * 
	 * tako što se saberu sve „rupe“ u ciframa tog broja. Cifre 1 i 2 nemaju
	 * „rupa“, 9 i 4 imaju jednu, dok cifra
	 * 
	 * 8 ima dvije, što ukupno daje broj 4 (0 + 0 + 2 + 1 + 1 = 4). Pomozite
	 * Ajdinu da napiše funkciju da
	 * 
	 * odredi rješenje.
	 * 
	 * Funkcija: int getNumberOfHoles(int num)
	 * 
	 * Primjeri:
	 * 
	 * getNumberOfHoles(2014) = 2
	 * 
	 * getNumberOfHoles(14983) = 4
	 * 
	 * getNumberOfHoles(91996) = 4
	 * 
	 * @
	 */

	public static int getNumberOfHoles(String num) {
		int sum = 0;
		int digit = 0;
	
	int b=num.length();
		for (int i=0;i<b;i++){
		   char c=num.charAt(i);
			  if (c == '4' || c == '6'|| c== '9' || c=='0') 
				sum += 1;
			 else if(c=='8')
				sum += 2;
			}
			
		
		return sum;

	}

	public static void main(String[] args)
	{
		System.out.println(getNumberOfHoles("14983"));

		
	
		
	}

}
