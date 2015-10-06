package ba.bitcamp.homework20.part2;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Simulates Stack using Double array.
 * 
 * @author boris.tomic
 *
 */
public class QueueOfDoubles {

	private Double[] array;

	/**
	 * Constructor of StackOfDoubles class
	 */
	public QueueOfDoubles() {
		array = new Double[0];
	}

	/**
	 * Checks if arrays is empty. Retruns <code>boolean</code> type value,
	 * <code>true</code> if it is empty, <code>false</code> if not
	 * 
	 * @return - <code>boolean</code> type value, <code>true</code> if empty,
	 *         <code>false</code> if not
	 */
	public boolean empty() {
		return array.length == 0;
	}

	/**
	 * Adds a <code>String</code> type value at last position in array.
	 * 
	 * @param value
	 *            - <code>Double</code> type value to be added
	 * @return <code>Double</code> type value that is being added
	 */
	public boolean add(Double value) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = value;
		return true;
	}

	/**
	 * Removes first element from an array of <code>Double</code>
	 * 
	 * @return <code>Double</code> type value of element being removed
	 */
	public Double poll() {
		if (array.length > 0) {
			Double temp = array[0];
			array = Arrays.copyOfRange(array, 1, array.length);
			return temp;
		}
		return null;

	}

	/**
	 * Looks at first element in array.
	 * 
	 * @return <code>Double</code> type value of first element in array
	 */
	public Double peek() {
		return array[0];
	}

	/**
	 * Looks at first element in array, if it doesn't exits throws exception.
	 * 
	 * @return <code>Double</code> type value of first element
	 * @throws NoSuchElementException
	 */
	public Double element() throws NoSuchElementException {
		if (array.length > 0) {
			return array[0];
		} else {
			throw new NoSuchElementException();
		}
	}

	/**
	 * Removes first element in queue. If queue is empty throws exception.
	 * 
	 * @return <code>Double</code> type value of removed element
	 * @throws NoSuchElementException
	 */
	public Double remove() throws NoSuchElementException {
		if (array.length > 0) {
			Double temp = array[0];
			array = Arrays.copyOfRange(array, 1, array.length);
			return temp;
		} else {
			throw new NoSuchElementException();
		}

	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}

}