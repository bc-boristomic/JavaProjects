package ba.bitcamp.boris.classes.day1;

import java.util.Scanner;

public class RandomGuess {

	public static void main(String[] args) {
		
		int max = 100;
		int rand = (int)(Math.random()*max);
		System.out.println("Zamislio sam broj od 0 do " + max);
		
		
		int pokusaj, brojPokusaja = 0;
		Scanner ulaz = new Scanner(System.in);
		
		do {
			brojPokusaja ++;
			System.out.println("Unesi broj");
			pokusaj = ulaz.nextInt();
			if (pokusaj > rand) {
				System.out.print("Unesi manji broj ");
			} else if (pokusaj < rand){
				System.out.print("Unesi veci broj ");
			} 
		} while (pokusaj != rand);
		System.out.println("\nPogodjen broj " + rand + " u broj pokusaja " + brojPokusaja);
					

	}

}