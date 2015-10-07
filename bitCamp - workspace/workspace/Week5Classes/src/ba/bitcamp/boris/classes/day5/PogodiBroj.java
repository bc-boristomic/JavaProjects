package ba.bitcamp.boris.classes.day5;

import java.util.Scanner;

public class PogodiBroj {

	private int maxBroj;
	private int maxBrojPokusaja;
	private int randomBroj;
	private static int counter = 0;

	public PogodiBroj(int maxBroj, int maxBrojPokusaja) {
		super();
		this.maxBroj = maxBroj;
		this.maxBrojPokusaja = maxBrojPokusaja;
		//this.randomBroj = generateRandomNumber();
	}

	public PogodiBroj(int maxBroj) {
		this.maxBroj = maxBroj;
		this.maxBrojPokusaja = maxBroj / 100 + 1;
	}

	public PogodiBroj() {
		this(1000, 10);
	}


	public int generateRandomNumber() {
		return (int) (Math.random() * maxBroj - 2) + 1;
	}

	public void playGame() {
		System.out.println(counter);
		Scanner in = new Scanner(System.in);
		int random = (int) (Math.random() * maxBroj - 2) + 1;
		System.out.println(random);
		while (counter < maxBrojPokusaja) {
			System.out.println("Unesi broj");
			int broj = in.nextInt();
			if (broj == random) {
				System.out.println("Pogodili ste!");
				break;
			} 
			counter++;
			
		}
	}

}
