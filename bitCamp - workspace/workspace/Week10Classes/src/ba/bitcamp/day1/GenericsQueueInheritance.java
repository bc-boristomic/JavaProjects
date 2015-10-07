package ba.bitcamp.day1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class GenericsQueueInheritance<E> extends LinkedList<E> {
	private static final long serialVersionUID = 8186312735585608922L;

	public GenericsQueueInheritance() {
		new LinkedList<E>();
	}

	// no need for size method since it's inherited

	public void enqueue(E value) {
		add(0, value);
	}

	public E dequeue() {
		return remove(size() - 1);
	}

	/**
	 * Works for any type of collection
	 * 
	 * @param elements
	 */
	public void enqueueAllSameType(Collection<E> elements) {
		Iterator<E> it = elements.iterator();
		while (it.hasNext()) {
			enqueue(it.next());
		}
	}

	public void dequeueTo(GenericsQueueInheritance<E> target) {
		int size = size();
		for (int i = 0; i < size; i++) {
			target.enqueue(dequeue());
		}
		// // ili
		// while (size() > 0) {
		// target.enqueue(dequeue());
		// }
	}

	/**
	 * Generic method, can accept any type of collection.
	 * 
	 * @param elements
	 *            - Any type of collection
	 */
	public void enueueAll(Collection<? extends E> elements) {
		Iterator<? extends E> it = elements.iterator();
		while (it.hasNext()) {
			enqueue(it.next());
		}
	}

}
