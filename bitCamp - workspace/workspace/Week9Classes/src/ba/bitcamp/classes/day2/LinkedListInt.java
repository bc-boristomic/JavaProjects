package ba.bitcamp.classes.day2;

public class LinkedListInt {

	private Node start;

	/**
	 * Constructor of LinkedListInt class
	 */
	public LinkedListInt() {
		this.start = null;
	}

	/**
	 * Adds <code>int</code> type value to last position in LinkedListInt.
	 * 
	 * @param value
	 *            - <code>int</code> type number to be added
	 */
	public void addLast(int value) {
		if (start == null) {
			start = new Node(value);
		} else {
			Node temp = getLastNode();
			temp.setNext(new Node(value));
		}
	}

	/**
	 * Adds <code>int</code> type value to first position in LinkedListInt.
	 * 
	 * @param value
	 *            - <code>int</code> type number to be added
	 */
	public void addFront(int value) {
		Node temp = new Node(value);
		temp.setNext(start);
		start = temp;
	}

	/**
	 * Removes only first element from LinkedListInt.
	 */
	public void removeFirst() {
		if (start == null) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			// int value = start.getValue(); // ako hocemo da vrati vrijednost koja je izbrisana treba je sacuvati
			start = start.getNext();
		}
	}

	/**
	 * Checks list is empty, returns <code>boolean</code> type representation.
	 * True means list is empty, false not empty.
	 * 
	 * @return - <code>boolean</code> type representation, <code>true</code>
	 *         list is empty, <code>false</code> not empty
	 */
	public boolean isEmpty() {
		if (start == null) {
			return true;
		} else {
			return false;
		}
	}

	
	public Node getLastNode() {
		if (start == null) {
			return null;
		} else {
			Node temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			return temp;
		}
	}

	@Override
	public String toString() {
		if (start == null) {
			return "List is empty";
		}
		return start.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedListInt other = (LinkedListInt) obj;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}

	private class Node {

		private Node next;
		private int value;

		/**
		 * Constructor of Node class
		 * 
		 * @param value
		 *            - <code>int</code> type value that will be used in list
		 */
		public Node(int value) {
			this.value = value;
			this.next = null;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		@Override
		public String toString() {
			if (next == null) {
				return value + "";
			}
			return value + ", " + next.toString();
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (next == null) {
				if (other.next != null)
					return false;
			} else if (!next.equals(other.next))
				return false;
			if (value != other.value)
				return false;
			return true;
		}

		private LinkedListInt getOuterType() {
			return LinkedListInt.this;
		}

	}

}
