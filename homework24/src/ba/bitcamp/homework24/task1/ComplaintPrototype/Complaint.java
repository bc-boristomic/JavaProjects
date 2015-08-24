package ba.bitcamp.homework24.task1.ComplaintPrototype;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Prototype of Complaint, integer for primary key, strings for complaint
 * message and date. Date is setup in HH:MM:SS [DD.MM.YYY] format so full
 * current date of complaint will be logged.
 * 
 * @author boris
 *
 */
public class Complaint {

	private Long id;
	private String complaint;
	private String date;

	/**
	 * Default constructor of Complaint class, initializes id to null, and sets
	 * current date.
	 */
	public Complaint() {
		this.id = null;
		setDate();
	}

	/**
	 * Constructor of Complaint class, initializes it to null, sets current date
	 * and lets user input own complaint message.
	 * 
	 * @param complaint
	 *            <code>String</code> type value of complaint
	 */
	public Complaint(String complaint) {
		this.id = null;
		this.complaint = complaint;
		setDate();
	}

	/**
	 * Constructor of Complaint class, used to create object when complaint is
	 * read from database.
	 * 
	 * @param id
	 *            <code>Long</code> type value of primary key
	 * @param complaint
	 *            <code>String</code> type value of complaint message
	 * @param date
	 *            <code>String</code> type value of date when complaint was
	 *            logged
	 */
	public Complaint(Long id, String complaint, String date) {
		this.id = id;
		this.complaint = complaint;
		this.date = date;
	}

	/**
	 * Private setter for date, formated to show all information,
	 */
	private void setDate() {
		String formattedDate = new SimpleDateFormat("HH:mm:ss [dd.MM.yyyy.]")
				.format(new Date());
		this.date = formattedDate;
	}

	/**
	 * Default getter for id
	 * 
	 * @return <code>Long</code> type value of id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Default getter for complaint
	 * 
	 * @return <code>String</code> type value of complaint
	 */
	public String getComplaint() {
		return complaint;
	}

	/**
	 * Default getter for date
	 * 
	 * @return <code>String</code> type value of date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * toString method returns complaint formated to show id number of
	 * complaint, then message followed by date it was logged.
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Complaint number #");
		sb.append(id);
		sb.append(" , Message: ");
		sb.append(complaint);
		sb.append(". Logged at: ");
		sb.append(date);

		return sb.toString();
	}

	/**
	 * Generated hasCode method
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((complaint == null) ? 0 : complaint.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * Generated equals method used to ensure that two same complaints wont be
	 * printed management GUI interface.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complaint other = (Complaint) obj;
		if (complaint == null) {
			if (other.complaint != null)
				return false;
		} else if (!complaint.equals(other.complaint))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
