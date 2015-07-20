package ba.bitcamp.homeworkweekend8.task1;

import java.util.NoSuchElementException;

public class LinkedListBoolean {

	private Node start;

	public LinkedListBoolean() {
		start = null;
	}

	/**
	 * Adds element to first position.
	 * 
	 * @param b
	 *            - <code>boolean</code> type value
	 */
	public void add(Boolean b) {
		if (start == null) {
			start = new Node(b);
		} else {
			Node temp = new Node(b);
			temp.setNext(start);
			start = temp;
		}
	}

	/**
	 * Removes first element with inputed value in LinkedList.
	 * 
	 * @param b
	 *            - <code>boolean</code> type value
	 */
	public void remove(Boolean b) {
		if (b.equals(start.getValue())) {
			start = start.getNext();
		} else {
			Node temp = start;
			while (!b.equals(temp.getValue())) {
				temp = temp.getNext();
			}
			Node prev = getPrevious(temp);
			prev.setNext(temp.getNext());
		}
	}

	/**
	 * Removes element with specified value after specified index.
	 * 
	 * @param index
	 *            - <code>int</code> type value of position in List
	 * @param b
	 *            - <code>boolean</code> type value of element to remove
	 * @throws NullPointerException
	 * @throws NoSuchElementException
	 */
	public void remove(int index, Boolean b) throws NoSuchElementException {
		if (index == 0) {
			start = start.getNext();
		} else {
			Node temp = getNode(index + 1);
			try {
				while (!b.equals(temp.getValue())) {
					temp = temp.getNext();
				}
				Node prev = getPrevious(temp);
				prev.setNext(temp.getNext());
			} catch (NullPointerException ex) {
				throw new NoSuchElementException(
						"No such element after inputed index");
			}
		}
	}

	/**
	 * Checks if list contains specified element, if it does returns true,
	 * otherwise false.
	 * 
	 * @param b
	 *            - <code>boolean</code> type value to check if it exists in
	 *            list
	 * @return <code>boolean</code> type value true if element exist, false if
	 *         it doesn't
	 */
	public boolean contains(Boolean b) {
		Node temp = start;
		while (temp != null) {
			if (b.equals(temp.getValue())) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	/**
	 * Checks if neighboring elements are same, if they are returns false,
	 * otherwise they are all different so returns true.
	 * 
	 * @return <code>boolean</code> type value true if neighbouring elements are
	 *         different, otherwise returns false
	 */
	public boolean isAlternating() {
		Node temp = start;
		while (temp.getNext() != null) {
			if (temp.getValue() == temp.getNext().getValue()) {
				return false;
			}
			temp = temp.getNext();
		}
		return true;
	}

	/**
	 * Returns previous node to inputed one.
	 * 
	 * @param n
	 * @return
	 */
	public Node getPrevious(Node n) {
		Node temp = start;
		while (temp.getNext() != n) {
			temp = temp.getNext();
		}
		return temp;
	}

	/**
	 * Returns last node
	 * 
	 * @param index
	 * @return
	 */
	public Node getNode(int index) {
		Node temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp;
	}

	@Override
	public String toString() {
		if (start == null) {
			return "Empty list";
		}
		return start.toString();
	}

	private class Node {

		private Node next;
		private Boolean value;

		public Node(Boolean value) {
			this.value = value;
			next = null;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public boolean getValue() {
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
