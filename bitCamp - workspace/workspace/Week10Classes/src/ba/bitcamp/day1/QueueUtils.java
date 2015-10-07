package ba.bitcamp.day1;

import java.util.LinkedList;

public class QueueUtils {
	
	public static <E> void enqueue(LinkedList<E> queue, E element) {
		queue.add(0, element);
	}
	
	public static <E> E dequeue(LinkedList<E> queue) {
		return queue.remove(queue.size() - 1);
	}
	
	

}
