package ba.bitcamp.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;

public class Poker {
	
	public static void main(String[] args) {
		
		LinkedList<Hand> list = new LinkedList<>();
		JFileChooser choose = new JFileChooser(System.getProperty("usr.dir"));
		int option = choose.showOpenDialog(null);
		if (option == JFileChooser.APPROVE_OPTION) {
			File file = choose.getSelectedFile();
			Scanner in = null;
			try {
				in = new Scanner(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			String line = null;
			StringTokenizer st = null;
			long start = System.currentTimeMillis();
			while (in.hasNext()) {
				line = in.nextLine();
				st = new StringTokenizer(line, ",");
				Hand poker = new Hand(st);
				list.add(poker);
			}
			System.out.println("Time it took to read from file: " + (System.currentTimeMillis() - start) + " ms\n");
			System.out.println("Number of lines in file: " + list.size() + "\n");
			
			ListIterator<Hand> it = list.listIterator();

			int emptyHand = 0;
			long start2 = System.currentTimeMillis();
			while (it.hasNext()) {
				
				if (it.next().getHand().equals(0)) {
					emptyHand++;
				}
			}
			System.out.println("Time it took to check empty hands " + (System.currentTimeMillis() - start2) + " ms");
			System.out.println("Number of empty hands in poker " + emptyHand + "\n");
			
			
			ListIterator<Hand> it2 = list.listIterator();
			int numberOfThreeOfAKind = 0;
			long start3 = System.currentTimeMillis();
			while (it2.hasNext()) {
				
				if (it2.next().getHand().equals(3)) {
					numberOfThreeOfAKind++;
				}
			}
			System.out.println("Time it took to check three of a kind combinations " + (System.currentTimeMillis() - start3) + " ms");
			System.out.println("Number of three of a kind combinations " + numberOfThreeOfAKind);
			
		}
		
	}

}
