package ba.bitcamp.day1;

import java.util.LinkedList;

public class StringQueueComposition {
	
	private LinkedList<String> values;
	
	public StringQueueComposition() {
		values = new LinkedList<String>();
	}
	
	public int size() {
		return values.size();
	}
	
	public void enqueue(String value) {
		values.add(0, value);
	}
	
	public String dequeue() {
		return values.remove(size() - 1);
	}

}
