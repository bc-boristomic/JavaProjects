package ba.bitcamp.homeworkweekend8.task2;

public class UniqueStackInt {

	private Node start;

	public UniqueStackInt() {
		start = null;
	}

	/**
	 * Adds element to front position in stack. Checks if there is same element
	 * in list, if there is same element, it doesn't add it to list.
	 * 
	 * @param value
	 *            - <code>Integer</code> type value
	 */
	public void push(Integer value) {
		if (start == null) {
			start = new Node(value);
		} else {
			Node temp = start;
			while (temp != null) {
				if (temp.getValue().equals(value)) {
					System.out.println("You can't have same elements");
					System.exit(0);
				}
				temp = temp.getNext();
			}
			temp = new Node(value);
			temp.setNext(start);
			start = temp;
		}
	}

	/**
	 * Removes first element from stack.
	 */
	public void pop() {
		start = start.getNext();
	}

	/**
	 * Checks if all elements are positioned so that their value is increasing.
	 * If yes returns true, otherwise false.
	 * 
	 * @return <code>boolean</code> type value, true if value of elements is
	 *         increasing, otherwise false
	 */
	public boolean isIncreasing() {
		boolean b = false;
		for (Node temp = start; temp.getNext() != null; temp = temp.getNext()) {
			if (temp.getValue() < temp.getNext().getValue()) {
				b = true;
			} else {
				return false;
			}
		}
		return b;
	}

	public String toString() {
		if (start == null) {
			return "Empty list";
		}
		return start.toString();
	}

	/**
	 * Inner class Node used to link all the elements and set their value.
	 * 
	 * @author boris
	 *
	 */
	private class Node {

		private Node next;
		private Integer value;

		public Node(Integer value) {
			this.value = value;
			next = null;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Integer getValue() {
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
