package ba.bitcamp.boris.excercises.day3;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// 
		
						Scanner in = new Scanner(System.in);

				System.out.println("Unesi broj");
				int num;
				double sum = 1;
				double avg = 0;
				int counter = 0;
				int max = 0;
				int min = 0;

				do {
					num = in.nextInt();
					int helper = num;
					sum += num;
					counter++;
					System.out.println("Unesite broj ponovo");
					if (num > max && num != -1) {
						max = num;
					} else if (min > helper && helper < max && helper != -1) {
						min = helper;
					}
					
				} while (num != -1);
				counter--;
				
				avg = sum / counter;
				System.out.println("Prosjek je " + avg + " max " + min + " min " + max);

				
				
				
				
				
				in.close();
			}
	}