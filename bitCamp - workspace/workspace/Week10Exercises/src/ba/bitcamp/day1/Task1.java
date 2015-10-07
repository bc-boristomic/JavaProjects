package ba.bitcamp.day1;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Task1 {

	/**
	 * Prints all elements from any type of collection
	 * 
	 * @param anyCollection
	 *            - <tt>Generics</tt> type
	 */
	private static <T> void printAll(Collection<T> anyCollection) {
		System.out.println(anyCollection);
	}

	
	private static <T> int countOccurences(Collection<T> anyCollection,
			T element) {
		int count = 0;
		for (T t : anyCollection) {
			if (t.equals(element)) {
				count++;
			}
		}
		return count;
	}

	private static <T> int countOverIterator(Collection<T> col, T el) {
		int count = 0;
		Iterator<T> it = col.iterator();
		while (it.hasNext()) {
			if (it.next().equals(el)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * 
	 * @param component
	 */
	private static <T extends Component> void printComponentInfo(T component) {
		System.out.println("width=" + component.getWidth() + ", height="
				+ component.getHeight() + ", x=" + component.getX() + ", y="
				+ component.getY());
	}

	private static <T> void printType(Collection<T> anyCollection) {
		// if (anyCollection instanceof Map) { // maps don't extends Collection
		// System.out.println("You are using maps");
		// }
		if (anyCollection instanceof List) {
			System.out.println("You are using lists");
		}
		if (anyCollection instanceof Set) {
			System.out.println("You are using sets");
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(9, 5, 12, -5,
				5, 5, 8));
		TreeSet<Double> doubs = new TreeSet<>(Arrays.asList(2.2, 19.1, 0.9));
		HashMap<String, Integer> strings = new HashMap<>();
		strings.put("A", 1);

		printAll(ints);
		printAll(doubs);
		System.out.println();

		System.out.println("Count over foreach loop "
				+ countOccurences(ints, 5));
		System.out.println("Count over iterator " + countOverIterator(ints, 5));

		System.out.println();
		JButton button = new JButton("Ok");
		button.setSize(40, 10);
		button.setLocation(10, 10);

		JLabel label = new JLabel("Text");
		label.setSize(80, 30);
		label.setLocation(80, 15);

		System.out.print("Button ");
		printComponentInfo(button);
		System.out.print("Label ");
		printComponentInfo(label);

		System.out.println();
		printType(ints);
		printType(doubs);
		// printType(strings);

	}

}
