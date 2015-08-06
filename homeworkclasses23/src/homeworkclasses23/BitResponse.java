package homeworkclasses23;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BitResponse {

	private String message;
	private Date timestamp;

	/**
	 * Default constructor of <tt>BitResponse</tt> class, sets values to
	 * default. There are no input params.
	 */
	public BitResponse() {
		this.message = "Default message";
		this.timestamp = new Date();
	}

	/**
	 * Constructor of <tt>BitResponse</tt> class that allows user to create
	 * <tt>BitResponse</tt> object directly using params bellow.
	 * 
	 * @param message
	 *            <code>String</code> type value of message
	 * @param timestamp
	 *            <code>Date</code> type value of current date in format
	 *            YYYY-MM-DD HH:MM:SS
	 */
	public BitResponse(String message, Date timestamp) {
		this.message = message;
		this.timestamp = timestamp;
	}

	/**
	 * Method will return message of <tt>BitResponse</tt> object
	 * 
	 * @return <code>String</code> type value of message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Method will return current <tt>Date</tt> of <tt>BitResponse</tt> object
	 * 
	 * @return <code>Date</code> type value of current date in format YYYY-MM-DD
	 *         HH:MM:SS
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * Method will set message of <tt>BitResponse</tt> object
	 * 
	 * @param message
	 *            <code>String</code> type value of message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Method will set current <tt>Date</tt> of <tt>BitResponse</tt> object
	 * 
	 * @param timestamp
	 *            <code>Date</code> type value of current date
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * toString method of <tt>BitResponse</tt> object returns
	 * <code>String</code> type value of message and date constructed using
	 * <tt>StringBuilder</tt>
	 */
	@Override
	public String toString() {
		String df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(getTimestamp());
		StringBuilder sb = new StringBuilder();
		sb.append("Message: ").append(message);
		sb.append("\nTimestamp: ").append(df);
		return sb.toString();
	}

}
