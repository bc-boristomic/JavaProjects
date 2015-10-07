package ba.bitcamp.boris.exercises.day1;

public class Task7 {

	public static void main(String[] args) {
		
	/*
	 * Napisati program koji ispiše sve neparne brojeve od 1 do 1000 na konzolu,
	 * svaki broj u zasebnu liniju.
	 * 
	 * Zapakovati predhodni program u jar i pokrenuti ga preko command line-a.
	 * Pokrenuti ga na taj način da ispiše i
	 * 
	 * u file šta ispiše na konzolu.
	 * 
	 * Napisati program koji učitaje args parametar, koji će zapravo imati u
	 * sebi te neparne brojeve, i ispisati na konzolu
	 * 
	 * iste te brojeve, ali one koji su djeljivi i sa 5. Zapakovati program u
	 * jar file i pokrenuti ga preko command line-a,
	 * 
	 * ali ga pokrenuti na taj način da args bude učitan iz file-a, tj. onog
	 * kojeg se napravili sa predhodnim podzadatkom.
	 */
	
	
	for (String odd : args) {
		int num = Integer.parseInt(odd);
		if (num % 5 == 0) {
		}
		System.out.println(num);
	}
	
	


	}
}
