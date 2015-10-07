package ba.bitcamp.exercises.day3;

import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;

public class LinkedListString implements Collection<LinkedListString> {

	private Node start;

	public LinkedListString() {
		this.start = null;
	}

	/**
	 * Returns size of LinkedListString.
	 */
	@Override
	public int size() {
		int size = 0;
		if (start == null) {
			return 0;
		} else {
			Node temp = start;
			while (temp != null) {
				size++;
				temp = temp.getNext();
			}
			return size;
		}
	}

	/**
	 * Checks if LinkedListString is empty.
	 */
	@Override
	public boolean isEmpty() {
		return start == null;
	}

	/**
	 * Checks if LinkedListString contains inputed object in it.
	 */
	@Override
	public boolean contains(Object o) {
		if (o instanceof String) {
			LinkedListString list = new LinkedListString();
			for (Object value : list) {
				if (value.equals(o)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		LinkedListString list = new LinkedListString();
		Object[] array = new Object[list.size()];
		for (int i = 0; i < list.size(); i++) {
			// array[i] = list.
		}
		return array;
	}

	@Override
	public boolean add(LinkedListString e) {
		for (int i = 0; i < e.size(); i++) {
			//e.add(g);
		}
		return false;
	}

	public void add(String value) {
		if (start == null) {
			start = new Node(value);
		} else {
			Node last = getLastNode();
			last.setNext(new Node(value));
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
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		start = null;
	}

	@Override
	public Iterator<LinkedListString> iterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection<? extends LinkedListString> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		if (start == null) {
			throw new EmptyStackException();
		}
		return start.toString();
	}

	private class Node {

		private Node next;
		private String value;

		public Node(String value) {
			this.value = value;
			this.next = null;
		}

		public Node getNext() {
			return next;
		}

		public String getValue() {
			return value;
		}

		public void setNext(Node next) {
			this.next = next;
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
