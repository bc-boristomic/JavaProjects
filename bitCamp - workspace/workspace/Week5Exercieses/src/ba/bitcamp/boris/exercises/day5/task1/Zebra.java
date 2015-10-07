package ba.bitcamp.boris.exercises.day5.task1;

public class Zebra extends Animal {
	
	/*
	 * Napisati klasu koja opisuje zebru. Zebra nasljeđuje sve atribute životinje. Pored toga, zebre imaju i dodatne

atribute, starost (u mjesecima) i stanje.

o Tri stanja postoje, zdravo, bolesno i smrtonosno bolesno.
	 */
	
	

	protected static final short HEALTHY = 0;
	protected static final short SICK = 1;
	protected static final short DEADLY_SICK = 2;
	
	private Integer monthsOld;
	private Short condition;
	
	
	public Zebra(Integer weight, Integer monthsOld, Short condition) {
		super(true, weight, TYPE_OF_FOOD_PLANTS);
		this.monthsOld = monthsOld;
		this.condition = condition;
	}
	
	@Override
	public String toString() {
		if (super.toString().equals("No LifeForm")) {
			return super.toString();
		} else {
			String s = super.toString() + String.format("How old it is? %d months.\n", monthsOld);
			switch (condition) {
			case HEALTHY:
				s += "Zebra is healthy.";
				return s;
			case SICK:
				s += "Zebra is sick.";
				return s;
			case DEADLY_SICK:
				s+= "Zebra is deadly sick.";
				return s;
			}
		}
		return super.toString(); 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((condition == null) ? 0 : condition.hashCode());
		result = prime * result
				+ ((monthsOld == null) ? 0 : monthsOld.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zebra other = (Zebra) obj;
		if (condition == null) {
			if (other.condition != null)
				return false;
		} else if (!condition.equals(other.condition))
			return false;
		if (monthsOld == null) {
			if (other.monthsOld != null)
				return false;
		} else if (!monthsOld.equals(other.monthsOld))
			return false;
		return true;
	}

	public Integer getMonthsOld() {
		return monthsOld;
	}

	public void setMonthsOld(Integer monthsOld) {
		this.monthsOld = monthsOld;
	}

	public Short getCondition() {
		return condition;
	}

	public void setCondition(Short condition) {
		this.condition = condition;
	}

	public static short getHealthy() {
		return HEALTHY;
	}

	public static short getSick() {
		return SICK;
	}

	public static short getDeadlySick() {
		return DEADLY_SICK;
	}
	
	
//	public void eat(LifeForm lifeform) {
//		if (lifeform instanceof Plant) {
//			Plant p = (Plant) lifeform;
//			if (getCondition() ==  && p.on() == z.HEALTHY) {
//				System.out.println("Tiger is eating zebra.");
//				setCondition(EATING);
//			} else if (getCondition() == HUNTING && z.getCondition() == z.SICK || z.getCondition() == z.DEADLY_SICK) {
//				System.out.println("Lion wont eat sick animal.");
//				setCondition(HUNTING);
//			}
//		} else {
//			throw new UnsupportedOperationException("Tiger can't eat another tiger.");
//			
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	

}
