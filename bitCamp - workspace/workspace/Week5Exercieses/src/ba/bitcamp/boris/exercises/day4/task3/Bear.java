package ba.bitcamp.boris.exercises.day4.task3;

public class Bear extends WildAnimal {
	
	private Boolean hasAttackedHumans;
	
	public Boolean getHasAttackedHumans() {
		return hasAttackedHumans;
	}
	
	public void setHasAttackedHumans(Boolean hasAttackedHumans) {
		this.hasAttackedHumans = hasAttackedHumans;
	}

	
	@Override
	public String toString() {
		String s = "Bear lives at " + getHabitat() + ", and is ";
		if(getIsBeingFed() == false) {
			s += "hungry so did he attacked any humans? " + getHasAttackedHumans() ;
		} else {
			s += "full.";
		}
		return s;
	}
}
