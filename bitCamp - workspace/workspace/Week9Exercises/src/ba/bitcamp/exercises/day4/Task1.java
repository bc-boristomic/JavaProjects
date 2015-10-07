package ba.bitcamp.exercises.day4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {

		Random rand = new Random();
		LinkedList<Integer> list = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		LinkedList<Integer> list3 = new LinkedList<>();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		for (int i = 0; i < 20; i++) {
			list.add(rand.nextInt(50) + 50);
		}
		System.out.println("First list " + list);
		System.out.println("Second list " + list2);
		
		//list.addAll(list2);
		System.out.println("First extended list " + list);
		list3.addAll(list);
		ListIterator<Integer> i = list3.listIterator();
		
		while (i.hasNext()) {
			int num = list3.getLast();
			list.add(num);
			list3.removeLast();
		}
		System.out.println("First list extended backwards");
		System.out.println(list);
		
	}

}
