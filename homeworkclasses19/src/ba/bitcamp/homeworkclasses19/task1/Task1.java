package ba.bitcamp.homeworkclasses19.task1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Task1 implements Iterable<Object> {

	private LinkedList<Object> list;

	/**
	 * Calls initiated list, declares and initiates iterator over that list and
	 * uses iterator to print out all the elements.
	 * 
	 * @return <tt>Iterator</tt> type object
	 */
	@Override
	public Iterator<Object> iterator() {
		initList();
		Iterator<Object> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		return it;
	}

	/**
	 * Initiates list with strings alphabet.
	 */
	public void initList() {
		list = new LinkedList<Object>(Arrays.asList("A", "B", "C", "D", "E",
				"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
				"R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
	}

	public static void main(String[] args) {

		Task1 t = new Task1();

		t.iterator(); // Calls implemented iterator method from Iterable interface

	}

}