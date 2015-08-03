package ba.bitcamp.homeworkclasses22.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MyHashMap<K, V> extends HashMap<K, Collection<V>> {
	private static final long serialVersionUID = 7192599220703964082L;

	/**
	 * Method that adds a single value to certain key. If key doesn't contain
	 * any value an ArrayList of value V is created and single value is added.
	 * Otherwise a value is added to collection at given key.
	 * 
	 * @param key
	 *            K type value of key
	 * @param value
	 *            V type value of value
	 */
	public void addMulti(K key, V value) {
		if (get(key) != null) {
			Collection<V> col = get(key);
			col.add(value);
			put(key, col);
		} else {
			Collection<V> col = new ArrayList<>();
			col.add(value);
			put(key, col);
		}
	}

	/**
	 * Checks if given value is contained at given key.
	 * 
	 * @param key
	 *            K type value of key
	 * @param value
	 *            V type value of value
	 * @return <code>boolean</code> type value true if collection have given
	 *         value at given key, false if doesn't
	 */
	private boolean containsMulti(K key, V value) {
		Collection<V> coll = get(key);
		if (coll == null) {
			return false;
		}
		Iterator<V> it = (Iterator<V>) coll.iterator();
		while (it.hasNext()) {
			if (it.next().equals(value)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns iterator at given key.
	 * 
	 * @param key
	 *            K type value
	 * @return Iterator<V> on collection if collection exist, if doesn't returns
	 *         empty iterrator
	 */
	@SuppressWarnings("unchecked")
	private Iterator<V> iterateMulti(K key) {
		Collection<V> coll = get(key);
		if (coll == null) {
			return (Iterator<V>) Collections.emptyIterator();

		} else {
			return (Iterator<V>) coll.iterator();
		}
	}

	/**
	 * main method that runs program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		MyHashMap<Integer, Integer> map = new MyHashMap<>();

		map.addMulti(5, 6);
		map.addMulti(5, 7);
		map.addMulti(2, 9);
		map.addMulti(6, 12);

		System.out.println(map.containsMulti(2, 1)); // false, doesn't contain
		System.out.println(map.containsMulti(5, 7)); // true, does contain

		System.out.println(map.iterateMulti(6));

		System.out.println(map);

	}

}
