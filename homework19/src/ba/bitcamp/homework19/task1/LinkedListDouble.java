package ba.bitcamp.homework19.task1;

import java.util.EmptyStackException;

/**
 * Class LinkedListDouble simulates LinkedList of Doubles. Various methods are
 * implemented.
 * 
 * @author boris
 *
 */
public class LinkedListDouble {

	private Node start;

	/**
	 * Constructor that sets start as null.
	 */
	public LinkedListDouble() {
		this.start = null;
	}

	/**
	 * Constructor that takes <code>LinkedListDouble</code> type object and adds
	 * value from each element to this simulated LinkedList.
	 * 
	 * @param object
	 *            - <code>LinkedListDouble</code> object
	 */
	public LinkedListDouble(LinkedListDouble object) {
		for (int i = 0; i < object.size(); i++) {
			add(object.getNodeValue(i));
		}
	}

	/**
	 * Adds a <code>Double</code> type value to the last place.
	 * 
	 * @param number
	 *            - <code>Double</code> type value
	 */
	public void add(Double number) {
		if (start == null) {
			start = new Node(number);
		} else {
			Node last = getLastNode();
			last.setNext(new Node(number));
		}
	}

	/**
	 * Returns last <code>Node</code> from the LinkedListDouble simulated list.
	 * If list is empty returns null.
	 * 
	 * @return <code>Node</code> type value if there are elements in list, or
	 *         null if empty
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
	 * Returns value from <code>Node</code> object at specified index.
	 * 
	 * @param index
	 *            - <code>int</code> type value of index
	 * @return <code>Double</code> type value of <code>Node</code> from
	 *         specified index
	 */
	public Double getNodeValue(int index) {
		Node temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp.getNumber();
	}

	/**
	 * Removes <code>Node</code> at specified index.
	 * 
	 * @param index
	 *            - <code>int</code> type value of index
	 * @throws EmptyStackException
	 */
	public void remove(int index) throws EmptyStackException {
		if (start == null) {
			throw new EmptyStackException();
		} else {
			Node previous = getPreviousNode(getNode(index));
			previous.setNext(getNode(index).getNext());
		}
	}

	/**
	 * Returns <code>Node</code> at specified index.
	 * 
	 * @param index
	 *            - <code>int</code> type value of index
	 * @return <code>Node</code> type value at specified index
	 */
	public Node getNode(int index) {
		Node temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp;
	}

	/**
	 * Returns <code>Node</code> that is previous in simulated LinkedList from
	 * inputed <code>Node</code> value.
	 * 
	 * @param n
	 *            - <code>Node</code> type value
	 * @return <code>Node</code> previous to inputed one
	 */
	private Node getPreviousNode(Node n) {
		if (n == start) {
			return null;
		}
		Node temp = start;
		while (temp.getNext() != n) {
			temp = temp.getNext();
		}
		return temp;
	}

	/**
	 * Calculates the size of LinkedListDouble simulated list. Sums all
	 * connections.
	 * 
	 * @return <code>int</code> type value of size
	 */
	public int size() {
		int size = 0;
		Node temp = start;
		while (temp.getNext() != null) {
			size++;
			temp = temp.getNext();
		}
		return size;
	}

	/**
	 * Returns the value from middle element in LinkedListDouble simulated list.
	 * Since size method is used as index if there is even number of elements,
	 * the one left from middle will be returned.
	 * 
	 * @return <code>Double</code> type value
	 */
	public Double getMiddle() {
		return getNodeValue(size() / 2);
	}

	/**
	 * Returns value of first element in simulated list. If there isn't any
	 * element exception will be thrown.
	 * 
	 * @return <code>Double</code> type value of first element
	 * @throws EmptyStackException
	 */
	public Double getFirst() throws EmptyStackException {
		if (start == null) {
			throw new EmptyStackException();
		}
		return start.getNumber();
	}

	/**
	 * Returns value from last element.
	 * 
	 * @return <code>Double</code> type value of last element
	 * @throws EmptyStackException
	 */
	public Double getLast() throws EmptyStackException {
		if (start == null) {
			throw new EmptyStackException();
		}
		return getLastNode().getNumber();
	}

	/**
	 * Deletes first <code>Node</code>, points first node at next one.
	 * 
	 * @return <code>Double</code> type value of deleted <code>Node</code>
	 * @throws EmptyStackException
	 */
	public Double deleteFirst() throws EmptyStackException {
		if (start == null) {
			throw new EmptyStackException();
		} else {
			Double value = start.getNumber();
			start = start.getNext();
			return value;
		}
	}

	/**
	 * Deleted last <code>Node</code> from simulated list, Uses remove and size
	 * methods to remove link pointing at last element.
	 * 
	 * @return <code>Double</code> type value of deleted <code>Node</code>
	 * @throws EmptyStackException
	 */
	public Double deleteLast() throws EmptyStackException {
		if (start == null) {
			throw new EmptyStackException();
		} else {
			Double value = getLastNode().getNumber();
			remove(size());
			return value;
		}
	}

	/**
	 * Adds new element at specific index with specified value. getNode method
	 * is used to get node previous to one that will be inputed.
	 * 
	 * @param value
	 *            - <code>Double</code> type value of element
	 * @param index
	 *            - <code>int</code> type value of index that will hold new
	 *            element
	 */
	public void add(Double value, int index) {
		Node temp = new Node(value);
		Node beforeTemp = getNode(index - 1);
		temp.setNext(beforeTemp.getNext());
		beforeTemp.setNext(temp);
	}

	@Override
	public String toString() {
		if (start == null) {
			return "List is empty";
		}
		return start.toString();
	}

	/**
	 * Private inner class Node used to link all the elements, get and set their
	 * value.
	 * 
	 * @author boris
	 *
	 */
	private class Node {

		private Node next;
		private Double number;

		public Node(Double number) {
			this.number = number;
			this.next = null;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Double getNumber() {
			return number;
		}

		@Override
		public String toString() {
			if (next == null) {
				return number.toString();
			}
			return number.toString() + ", " + next.toString();
		}

	}

}
