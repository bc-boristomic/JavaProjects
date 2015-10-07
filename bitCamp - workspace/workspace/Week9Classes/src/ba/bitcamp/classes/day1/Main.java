package ba.bitcamp.classes.day1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// String from =
		// JOptionPane.showInputDialog("Where are you traveling from?");
		// Place p1 = new Place(from);
		//
		// String to =
		// JOptionPane.showInputDialog("Where are you traveling to?");
		// Place p2 = new Place(to);
		//
		// Trip t1 = new Trip(p1, p2);
		//
		// JOptionPane.showMessageDialog(null, t1);

		Scanner in = new Scanner(System.in);
		
		
		Trip t = new Trip();

		System.out.println("Enter some place you want to go");
		
		while (true) {
			String s = in.nextLine();
			if (!s.equals("")) {
				t.addPlace(new Place(s));
			} else {
				break;
			}
		}

		System.out.println("You will go");
		System.out.println(t);
		
		in.close();

	}

}
