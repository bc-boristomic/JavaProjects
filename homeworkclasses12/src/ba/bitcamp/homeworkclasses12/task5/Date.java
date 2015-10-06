package ba.bitcamp.homeworkclasses12.task5;

public class Date {
	
	private Integer day;
	private Integer month;
	private Integer year;
	
	public Date(Integer day) {
		this.day = day;
		this.month = 1;
		this.year = 1;
	}
	
	public Date(Integer day, Integer month) {
		this.day = day;
		this.month = month;
		this.year = 1;
	}
	
	public Date(Integer day, Integer month, Integer year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	/**
	 * Return string with date formated to ex. 01.02.2013.
	 */
	public String toString() {
		return String.format("%02d.%02d.%d", day, month, year);
	}
	
	/**
	 * Sets a day, can't be below 1 or over 31.
	 * For second month can't be over 28.
	 * 
	 * @param day
	 */
	public void setDate(Integer day) {
		if (day < 1 || day > 28 && month == 2) {
			throw new UnsupportedOperationException("Invalid input");
		} else if (day < 1 || day > 31 && month == 2 && month == 4 && month == 6 && month == 9 && month == 11) {
			throw new UnsupportedOperationException("Invalid input");
		} else {
			this.day = day;
		}
	}
	
	/**
	 * Sets month, can't be below 1 or over 12.  
	 * 
	 * @param month <code>Integer</code> type
	 */
	public void setMonth(Integer month) {
		if (month < 1 || month > 12) {
			throw new UnsupportedOperationException("Invalid input");
		} else {
			this.month = month;
		}
	}
	
	/**
	 * Sets year
	 * 
	 * @param year <code>Integer</code> type
	 */
	public void setYear(Integer year) {
		this.year = year;
	}
	
	/**
	 * Adds only one day at a time.
	 * Add a month if day is 31, and year at end of year.
	 */
	public void dayPassed() {
		if (month == 2 && day >= 28) {
			day = 1;
			month++;
		} else if (day == 31 || month > 12) {
			day = 1;
			month = 1;
			year++;
		} else if (day == 31) {
			day = 1;
			month++;
		} else {
			day++;
		}
	}
	
	/**
	 * Adds only only month at a time.
	 * If month is over 12 adds a year.
	 */
	public void monthPassed() {
		if (month >= 12) {
			month = 1;
			year++;
		} else {
			month++;
		}
	}

	
	
}
