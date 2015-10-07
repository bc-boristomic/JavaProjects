package ba.bitcamp.exercises.day4;

public class Employee {

	private static Integer idCounter = 1001;
	
	private Integer iD;
	private String firstName;
	private String lastName;
	private String sex;
	private Integer pay;
	private Date date;
	
	/**
	 * Default constructor of Employee class
	 */
	public Employee() {
		
		this.iD = 0;
		this.firstName = "Unknown";
		this.lastName = "Unknown";
		this.sex = "Unknown";
		this.pay = 0;
		this.date = new Date(0, 0, 0);
	}
	
	/**
	 * Constructor of Employee class used to set user inputed values.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param sex
	 * @param pay
	 * @param day
	 * @param month
	 * @param year
	 */
	public Employee(String firstName, String lastName, String sex, Integer pay, Integer day, Integer month, Integer year) {
		
		this.iD = idCounter;
		idCounter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.pay = pay;
		this.date = new Date(day, month, year);

	}

		
	@Override
	public String toString() {
		return "Employee iD: " + iD + ", " + firstName + " " + lastName + ", [" + sex + "]" + ", (" + pay
				+ "$)" + ", {" + date + "}";
	}
	
	public Integer getiD() {
		return iD;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSex() {
		return sex;
	}
	
	public Integer getPay() {
		return pay;
	}
	
	public Double getDoubleDate() {
		return (double)((date.getDay() / 10) + (double)(date.getMonth() / 10) + (double)(date.getYear() / 1000));
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPay(Integer pay) {
		this.pay = pay;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((iD == null) ? 0 : iD.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((pay == null) ? 0 : pay.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (iD == null) {
			if (other.iD != null)
				return false;
		} else if (!iD.equals(other.iD))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (pay == null) {
			if (other.pay != null)
				return false;
		} else if (!pay.equals(other.pay))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}




	/**
	 * Inner class Date, used to set date of birth of Employee
	 * 
	 * @author boris.tomic
	 *
	 */
	protected class Date {
		
		private Integer day;
		private Integer month;
		private Integer year;
		
		/**
		 * Constructor of Date class, used to set day, month and year of Employee birth.
		 * 
		 * @param day
		 * @param month
		 * @param year
		 */
		public Date(Integer day, Integer month, Integer year) {
			this.day = day;
			this.month = month;
			this.year = year;
			
		}

		@Override
		public String toString() {
			return day + "." + month + "." + year;
		}
		
		public Integer getDay() {
			return day;
		}
		
		public Integer getMonth() {
			return month;
		}
		
		public Integer getYear() {
			return year;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			//result = prime * result + getOuterType().hashCode();
			result = prime * result + ((day == null) ? 0 : day.hashCode());
			result = prime * result + ((month == null) ? 0 : month.hashCode());
			result = prime * result + ((year == null) ? 0 : year.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Date other = (Date) obj;
			//if (!getOuterType().equals(other.getOuterType()))
			//	return false;
			if (day == null) {
				if (other.day != null)
					return false;
			} else if (!day.equals(other.day))
				return false;
			if (month == null) {
				if (other.month != null)
					return false;
			} else if (!month.equals(other.month))
				return false;
			if (year == null) {
				if (other.year != null)
					return false;
			} else if (!year.equals(other.year))
				return false;
			return true;
		}

//		private Employee getOuterType() {
//			return Employee.this;
//		}
		
		
		
	}
	
	
}
