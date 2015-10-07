package ba.bitcamp.classes.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionUtils {

	private static void printStrings(Collection<String> strings) {
		Iterator<String> strIter = strings.iterator();
		while (strIter.hasNext()) {
			System.out.println(strIter.next());
		}
	}
	
	private static void printCollection(Collection<?> collection) {
		Iterator<?> strIter = collection.iterator();
		while (strIter.hasNext()) {
			System.out.println(strIter.next());
		}
	}
	
	public static String maxString(Collection<String> strings) {
		Iterator<String> strIter = strings.iterator();
		String max = null;
		while (strIter.hasNext()) {
			String current = strIter.next();
			if (max == null || max.compareTo(current) < 0) {
				max = current;
			}
		}
		return max;
	}
	
	public static <T extends Comparable<T>> T maxCollection(Collection<T> collection) {
		Iterator<T> iter = collection.iterator();
		T max = null;
		while (iter.hasNext()) {
			T current = iter.next();
			if (max == null || max.compareTo(current) < 0) {
				max = current;
			}
		}
		return max;
	}
	
	public static <T extends Comparable<T>> Collection<T> clearAllNulls(Collection<T> collection) throws UnsupportedOperationException {
		int counter = collection.size();
		if (counter > 0) {
			while (counter > 0) {
				collection.remove(null);
				counter--;
			}
			return collection;
		}
		throw new UnsupportedOperationException("Collection is empty");
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<>(Arrays.asList( "abc", "bcd", "nas", "err", "sd2" ));
		ArrayList<Double> doubles = new ArrayList<Double>(Arrays.asList(2.2, 3.2, 5.5));
		
		printStrings(strings);
		printCollection(doubles);
		
		System.out.println(maxString(strings));
		System.out.println(maxCollection(doubles));

		System.out.println();
		
		ArrayList<Double> doubles2 = new ArrayList<Double>(Arrays.asList(2.2, 3.2, 5.5, null, 5.2, null, 9.1));

		System.out.println(clearAllNulls(doubles2));
		
	}
	
}
