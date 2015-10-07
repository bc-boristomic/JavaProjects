package ba.bitcamp.boris.excercises.day1;

public class Loop2 {

	public static void main(String[] args) {
		/*Program koji sadrži datum jednog rođendana (dan, mjesec, godina). Ispisati

sve rođendane koje je ta osoba imala do danas.
*/
		int bDay = 12;
		int bMonth = 5;
		int bYear = 2000;
				
		while (bYear < 2015) {
			System.out.println(bDay + "." + bMonth + "." + bYear);
			bYear++;
		}
		
		
	}

}
