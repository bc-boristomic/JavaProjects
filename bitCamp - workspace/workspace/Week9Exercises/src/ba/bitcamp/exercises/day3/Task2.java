package ba.bitcamp.exercises.day3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int length = 100000;
		
		LinkedList<Integer> list = new LinkedList<>();
		
		Random rand = new Random();
		
		for (int i = 0; i < length; i++) {
			list.add(rand.nextInt(100));
		}
		
		System.out.println("List size: " + list.size());
		
		System.out.println("Enter number");
		Integer dividor = in.nextInt();
				
		Iterator<Integer> it = list.iterator();
		long start = System.currentTimeMillis();
		while (it.hasNext()) {
			Integer num = it.next();
			if (num % dividor == 0) {
				it.remove();
			}
		}
		System.out.println("Iterator deletes after " + (System.currentTimeMillis() - start) + " ms");
		
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % dividor == 0) {
				list.remove(i);
			}
		}
		System.out.println("For loop deletes after " + (System.currentTimeMillis() - start2) + " ms");
		
		
		
		in.close();
	}

}
