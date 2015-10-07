package ba.bitcamp.boris.day1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//String s = input.nextLine();
		String n = input.nextLine();
		//String m = input.nextLine();
		//int a = s.length();
		//String ime = "";
				
//		for (int i = 14; i < a; i++) {
//			char site = s.charAt(i);
//			//System.out.println(site);
//
//			if (s.charAt(i) == '/'){
//				break;
//			} else {
//				ime += site;
//			}
//		}
//		System.out.println(ime);
//		
		
		
		int b = n.length();
		String nazad = "";
		
		for (int i = b-1; i > 0; i--) {
			char site = n.charAt(i);
			if (n.charAt(i) == '/') {
				break;
			} else {
				nazad = site + nazad;
			}
		}
		System.out.println(nazad);
		
	}

}
