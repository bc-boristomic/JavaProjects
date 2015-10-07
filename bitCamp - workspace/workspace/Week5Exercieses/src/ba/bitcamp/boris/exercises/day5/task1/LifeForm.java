package ba.bitcamp.boris.exercises.day5.task1;

/**
 * Abstract class that only determines if life form is alive thru constructor
 * 
 * @author boris.tomic
 *
 */
public abstract class LifeForm {
	
	private Boolean isAlive;
	
	/**
	 * Constructor for LifeForm class, added super for extended Object class.
	 * 
	 * @param isAlive <code>Boolean</code> type value
	 */
	public LifeForm(Boolean isAlive) {
		super();
		this.isAlive = isAlive;
	}
	
	
	public String toString() {
		if (isAlive == true) {
			return String.format("Is LifeForm alive? %b \n", isAlive);
		} else {
			return "No LifeForm";
		}
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isAlive == null) ? 0 : isAlive.hashCode());
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
		LifeForm other = (LifeForm) obj;
		if (isAlive == null) {
			if (other.isAlive != null)
				return false;
		} else if (!isAlive.equals(other.isAlive))
			return false;
		return true;
	}


	public Boolean getIsAlive() {
		return isAlive;
	}


	public void setIsAlive(Boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	
	

}
