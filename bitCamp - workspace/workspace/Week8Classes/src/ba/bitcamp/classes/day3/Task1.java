package ba.bitcamp.classes.day3;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {

//	private static int getRandInt() {
//		return (int) (Math.random() * 10 + 1);
//	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		// or instance Random class and call next.Int(),
		// list.add(rand.nextInt());
		Random rand = new Random();

//		System.out.println("Size before adding any elements = " + list.size());

		for (int i = 0; i < 10; i++) {
			list.add(rand.nextInt(9));
		}

//		System.out.print("Added four random elements ");
//		System.out.println(list.toString());

//		
//		int temp = list.indexOf(2);
//		while (temp != -1) { // while there is 2 in array list
//			list.remove(temp); // remove 2 from array list
//			temp = list.indexOf(2);
//		}
//
//		
		System.out.println(list.toString());
		//long start = System.currentTimeMillis();
		
		//ArrayList<Integer> list2 =  new ArrayList<Integer>();
//		for (int i = list.size() - 1; i >= 0; i--) {
//			list2.add(list.get(i));
//		}
//		long stop = System.currentTimeMillis() - start;
		//System.out.println(stop);
		//System.out.println(list2.toString());
		
		for (int i = 0; i < list.size() - 1; i += 2) {
			int temp = list.get(i);
			list.set(i, list.get(i + 1));
			list.set(i+1, temp);
		}
		System.out.println(list.toString());

		
		
	}

}
