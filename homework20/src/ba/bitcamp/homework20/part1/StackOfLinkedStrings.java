package ba.bitcamp.homework20.part1;

import java.util.EmptyStackException;

/**
 * Simulates Stack of Strings in LinkedList.
 * 
 * @author boris.tomic
 *
 */
public class StackOfLinkedStrings {

	private Node start;

	/**
	 * Constructor of StackOfLinkedString class, sets start <code>Node</code> as
	 * null.
	 */
	public StackOfLinkedStrings() {
		start = null;
	}

	/**
	 * Checks if there is any element in Stack, returns <code>boolean</code>
	 * type representation, <code>true</code> if empty, <code>false</code> in
	 * not
	 * 
	 * @return - returns <code>boolean</code> type representation,
	 *         <code>true</code> if empty, <code>false</code> in not
	 */
	public boolean empty() {
		return start == null;
	}

	/**
	 * Adds a <code>String</code> value at first position in
	 * StackOfLinkedStrings.
	 * 
	 * @param value
	 *            - <code>String</code> type value that will be pushed
	 * @return <code>String</code> type value that is pushed
	 */
	public String push(String value) {
		if (start == null) {
			start = new Node(value);
		} else {
			Node temp = new Node(value);
			temp.setNext(start);
			start = temp;
		}
		return value;
	}

	/**
	 * Removes first node.
	 * 
	 * @return - <code>String</code> type value
	 * @throws EmptyStackException
	 */
	public String pop() throws EmptyStackException {
		if (start == null) {
			throw new EmptyStackException();
		} else {
			String temp = start.getValue();
			start = start.getNext();
			return temp;
		}
	}

	/**
	 * Looks at last element value and returns <code>String</code>
	 * representation of that value.
	 * 
	 * @return <code>String</code> type value
	 */
	public String peek() {
		return start.getValue();
	}

	@Override
	public String toString() throws EmptyStackException {
		if (start == null) {
			throw new EmptyStackException();
		}
		return start.toString();
	}

	/**
	 * Searches for <code>String</code> type value and returns index position
	 * with that value.
	 * 
	 * @param s
	 *            - <code>String</code> type value
	 * @return <code>int</code> type position, -1 if element doesn't exist
	 */
	public int search(String s) {
		if (start == null) {
			return -1;
		} else {
			int index = 0;
			Node temp = start;
			while (!temp.getValue().equals(s)) {
				temp = temp.getNext();
				index++;
			}
			return index;
		}
	}

	/**
	 * Private inner class Node used to link all the elements.
	 * 
	 * @author boris.tomic
	 *
	 */
	private class Node {

		private Node next;
		private String value;

		/**
		 * Constructor of Node class, sets next <code>Node</code> as
		 * <code>null</code>, and value is inputed by param value.
		 * 
		 * @param value
		 *            - <code>String</code> type value
		 */
		public Node(String value) {
			this.value = value;
			next = null;
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

		@Override
		public String toString() {
			if (next == null) {
				return value;
			}
			return value + ", " + next.toString();
		}

	}

}
