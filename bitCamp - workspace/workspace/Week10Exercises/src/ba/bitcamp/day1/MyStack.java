package ba.bitcamp.day1;

import java.util.ListIterator;
import java.util.NoSuchElementException;


public class MyStack<T> {

	private Node start;

	public MyStack() {
		start = null;
	}

	/**
	 * Adds any element to any type of LinkedList
	 * 
	 * @param element
	 *            - <code>Object</code> type value
	 */
	public void push(T element) {
		Node temp = new Node(element);
		if (start == null) {
			start = temp;
		} else {
			Node last = getLastNode();
			last.setNext(temp);
			last = temp;
		}
	}

	/**
	 * Returns value of first element
	 * 
	 * @return <code>Object</code> type value
	 */
	public T getFirst() {
		if (start == null) {
			throw new NoSuchElementException();
		}
		return start.getValue();
	}

	/**
	 * Returns value of last element
	 * 
	 * @return <code>Object</code> type value
	 */
	public T getLast() {
		if (start == null) {
			throw new NoSuchElementException();
		}
		return getLastNode().getValue();
	}

	/**
	 * Returns index position of any type element from LinkedList
	 * 
	 * @param value
	 *            - <code>Object</code> type value
	 * @return <code>int</code> type value
	 */
	public int indexOf(T value) {
		if (start == null) {
			throw new NullPointerException();
		} else if (start.getValue().equals(value)) {
			return 0;
		} else {
			int index = 0;
			Node temp = start;
			while (temp.getNext() != null) {
				if (temp.getValue().equals(value)) {
				}
				temp = temp.getNext();
				index++;
			}
			return index;
		}
	}

	/**
	 * Checks if any type element exist in LinkedList
	 * 
	 * @param element
	 *            - <code>Object</code> type element
	 * @return <tt>true</tt> if element exist in List, <tt>false</tt> if doesn't
	 */
	public boolean contains(T element) {
		if (start == null) {
			return false;
		} else {
			Node temp = start;
			while (temp.getNext() != null) {
				if (temp.getValue().equals(element)) {
					return true;
				}
				temp = temp.getNext();
			}
		}
		return false;
	}

	public Node getLastNode() {
		Node temp = start;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		return temp;
	}
	
	/**
	 * Removes last element from LinkedList. Stack order LIFO
	 */
	public void pop() {
		Node last = getLastNode();
		Node prev = getPrevious(getLastNode());
		prev.setNext(null);
		last = prev;
	}
	
	public void addAll(MyStack<T> col) {

		//ListIterator<T> it = col.listiterator();
	}
	
	
	public Node getPrevious(Node n) {
		Node temp = start;
		while (temp.getNext() != n) {
			temp = temp.getNext();
		}
		return temp;
	}
	
	@Override
	public String toString() {
		if (start == null) {
			throw new NullPointerException("Empty List");
		}
		return start.toString();
	}

	private class Node {

		private Node next;
		private T value;

		public Node(T value) {
			this.value = value;
			next = null;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public T getValue() {
			return value;
		}

		@Override
		public String toString() {
			if (next == null) {
				return value.toString();
			}
			return value.toString() + ", " + next.toString();
		}

	}

}
