package ba.bitcamp.museum;

/**
 * Interface Searchable contains one method that checks if inputed string exist
 * in Object.
 * 
 * @author boris.tomic
 *
 */
public interface Searchable {

	/**
	 * Checks if inputed <code>String</code> type value exist in Object. Returns
	 * <code>boolean</code> type value true if it does and false if doesn't.
	 * 
	 * @param s
	 *            - <code>String</code> type value to search in Object
	 * @return <code>boolean</code> type true if <code>String</code> exist,
	 *         false if it doesn't exist
	 */
	boolean fitsSearch(String s);

}
