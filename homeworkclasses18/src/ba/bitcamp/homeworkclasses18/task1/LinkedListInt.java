package ba.bitcamp.homeworkclasses18.task1;

public class LinkedListInt {

	private Node start;

	/**
	 * Constructor of LinkedListInt class
	 */
	public LinkedListInt() {
		start = null;
	}

	/**
	 * Adds value at appropriate position
	 * 
	 * @param n
	 *            - <code>int</code> type value
	 */
	public void add(int n) {
		Node temp = new Node(n);
		if (start == null) {
			start = new Node(n);
		} else if (start.getValue() > temp.getValue()) {
			temp.setNext(start);
			start = temp;
		} else if (temp.getValue().compareTo(start.getValue()) > 0
				&& temp.getValue().compareTo(getLastNode().getValue()) < 0) {
			Node previous = start;
			Node current = start.getNext();
			while (temp.getValue().compareTo(previous.getValue()) < 0) {
				previous = current;
				current = current.getNext();
			}
			previous.setNext(temp);
			temp.setNext(current);
		}
		if (getLastNode().getValue() <= temp.getValue()) {
			getLastNode().setNext(temp);
			temp = getLastNode();
		}

	}

	/**
	 * Returns last Node
	 * 
	 * @return <code>Node</code> type object
	 */
	public Node getLastNode() {
		if (start == null) {
			return null;
		}
		Node temp = start;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		return temp;
	}

	/**
	 * Returns the length of list
	 * 
	 * @return <code>int</code> type value
	 */
	public int getLength() {
		return getLength(start);
	}

	/**
	 * Used to calculate length of list
	 * 
	 * @param node
	 *            - <code>Node</code> type object
	 * @return <code>int</code> type value
	 */
	public int getLength(Node node) {
		if (node == null) {
			return 0;
		}
		return getLength(node.getNext()) + 1;
	}

	/**
	 * Makes LinkedListInt into an <code>int</code> type array.
	 * 
	 * @return <code>int</code> type array
	 */
	public int[] toArray() {
		int[] array = new int[getLength()];
		for (int i = 0; i < array.length; i++) {
			array[i] = getNodeValue(i);
		}
		return array;
	}

	/**
	 * Returns value from <code>Node</code> object at specified index.
	 * 
	 * @param index
	 *            - <code>int</code> type value of index
	 * @return <code>int</code> type value of <code>Node</code> from specified
	 *         index
	 */
	public int getNodeValue(int index) {
		Node temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp.getValue();
	}

	@Override
	public String toString() {
		if (start == null) {
			return "List is empty";
		}
		return start.toString();
	}

	/**
	 * Private inner class used to link all the elements in list and add them a
	 * value.
	 * 
	 * @author boris
	 *
	 */
	private class Node {

		private Integer value;
		private Node next;

		public Node(Integer n) {
			this.value = n;
			next = null;
		}

		public Node getNext() {
			return next;
		}

		public Integer getValue() {
			return value;
		}

		public void setNext(Node next) {
			this.next = next;
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
