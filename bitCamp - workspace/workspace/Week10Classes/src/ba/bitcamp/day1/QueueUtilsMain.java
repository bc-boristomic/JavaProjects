package ba.bitcamp.day1;

import java.util.Arrays;
import java.util.LinkedList;

public class QueueUtilsMain {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		QueueUtils.enqueue(list, "A");
		QueueUtils.enqueue(list, "B");
		QueueUtils.enqueue(list, "C");

		System.out.println(list);

		while (list.size() > 0) {
			System.out.println("Removed " + QueueUtils.dequeue(list));
		}

		System.out.println(list);
		
		LinkedList<Integer> ints = new LinkedList<>(Arrays.asList(1, 5, 9));
		System.out.println(ints);
		QueueUtils.dequeue(ints);
		System.out.println(ints);
		
		
	}

}
