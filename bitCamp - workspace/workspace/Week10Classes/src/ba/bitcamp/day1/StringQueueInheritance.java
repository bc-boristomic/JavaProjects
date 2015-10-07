package ba.bitcamp.day1;

import java.util.LinkedList;

public class StringQueueInheritance extends LinkedList<String> {
	private static final long serialVersionUID = 8186312735585608922L;
	
	public StringQueueInheritance() {
		new LinkedList<String>();
	}
	
	// no need for size method since it's inherited
	
	public void enqueue(String value) {
		add(0, value);
	}
	
	public String dequeue() {
		return remove(size() - 1);
	}

}
