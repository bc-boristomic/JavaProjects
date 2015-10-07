package ba.bitcamp.day1;

import java.util.HashSet;

public class GenericsQueueCompositionTest {

	public static void main(String[] args) {

		System.out.println("Integer");
		GenericsQueueComposition<Integer> gqc = new GenericsQueueComposition<>();

		gqc.enqueue(4);
		gqc.enqueue(9);
		gqc.enqueue(12);

		for (int i = 0; i < 3; i++) {
			System.out.println("Removed " + gqc.dequeue());
			System.out.println("Size " + gqc.size());
		}
		
		System.out.println();
		//***************************************************************************
		
		System.out.println("Double");
		GenericsQueueComposition<Double> dbl = new GenericsQueueComposition<>();

		dbl.enqueue(4.0);
		dbl.enqueue(9.0);
		dbl.enqueue(12.0);

		for (int i = 0; i < 3; i++) {
			System.out.println("Removed " + dbl.dequeue());
			System.out.println("Size " + dbl.size());
		}
		
		
		HashSet<Integer> ints = new HashSet<>();
		ints.add(2);
		ints.add(8);
		ints.add(6);

	}

}
