package ba.bitcamp.classes.day1;

public class Node {
	
	private int value;
	private Node next;
	
	public Node (int value) {
		this.value = value;
	}
	
	public Node getNext() {
		return next;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	

}
