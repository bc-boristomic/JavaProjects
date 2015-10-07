package ba.bitcamp.day1;

public class StringQueue {
	
	private Node start;
	
	public StringQueue() {
		start = null;
	}
	
	public void enqueue(String value) {
		Node temp = new Node(value);
		if (start == null) {
			start = temp;
		} else {
			temp.setNext(start);
			start = temp;
		}
	}
	
	public int size() {
		if (start == null) {
			return 0;
		} else {
			int counter = 0;
			Node temp = start;
			while (temp != null) {
				temp = temp.getNext();
				counter++;
			}
			return counter;
		}
	}
	
	public String dequeue() {
		String s = start.getValue();
		start = start.getNext();
		return s;
	}
	
	
	
	@Override
	public String toString() {
		if (start == null) {
			return "Empty list";
		}
		return start.toString();
	}
	
	/**
	 * Inner class Node
	 * @author boris.tomic
	 *
	 */
	private class Node {
		
		private Node next;
		private String value;
		
		public Node(String value) {
			this.value = value;
			next = null;
		}
		
		@Override
		public String toString() {
			if (next == null) {
				return value;
			}
			return value + ", " + next.toString();
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
		
		public String getValue() {
			return value;
		}
	}

}
