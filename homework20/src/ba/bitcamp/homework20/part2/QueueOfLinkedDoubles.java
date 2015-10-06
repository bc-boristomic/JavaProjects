package ba.bitcamp.homework20.part2;

public class QueueOfLinkedDoubles {

	private Node start;
	private Node finish;

	public QueueOfLinkedDoubles() {
		start = null;
		finish = null;
	}

	/**
	 * Adds element to queue, depending on how full is the queue.
	 * 
	 * @param value
	 *            - <code>Double</code> type value to be added
	 * @return <code>boolean</code> true when an element is added
	 */
	public boolean add(Double value) {
		Node temp = new Node(value);
		if (start == null) {
			start = temp;
			finish = temp;
		} else if (start == finish) {
			temp.setPrevious(start);
			finish = temp;
			start.setNext(finish);
		} else {
			finish.setNext(temp);
			temp.setPrevious(finish);
			finish = temp;
		}
		return true;
	}

	/**
	 * Looks at first element in queue,
	 * 
	 * @return <code>Double</code> type value of first element, null if queue is
	 *         empty
	 */
	public Double peek() {
		if (start == null) {
			return null;
		} else {
			return start.getValue();
		}
	}

	/**
	 * Removes first element from the queue, in this case first element is in
	 * first position.
	 * 
	 * @return <code>Double</code> type value that is removed
	 */
	public Double poll() {
		Double temp = 0.0;
		if (peek() != null) {
			temp = start.getValue();
			start = start.getNext();
			return temp;
		}
		return null;
	}

	public String toString() {
		if (start == null) {
			return "The List is empty";
		}
		return start.toString();
	}

	/**
	 * Inner class Node used to link all the Doubles and set's their value
	 * 
	 * @author boris
	 *
	 */
	private class Node {
		private Double value;
		private Node next;
		private Node previous;

		public Node(Double value) {
			this.value = value;
		}

		public String toString() {
			if (next == null) {
				return value.toString();
			}
			return value.toString() + ", " + next.toString();
		}

		public Double getValue() {
			return value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public void setPrevious(Node previous) {
			this.previous = previous;
		}

	}

}
