package ba.bitcamp.day1;

import java.util.LinkedList;

public class GenericsQueueComposition<E> {
	
	private LinkedList<E> values;
	
	public GenericsQueueComposition() {
		values = new LinkedList<E>();
	}
	
	public int size() {
		return values.size();
	}
	
	public void enqueue(E value) {
		values.add(0, value);
	}
	
	public E dequeue() {
		return values.remove(size() - 1);
	}
	
	

}
