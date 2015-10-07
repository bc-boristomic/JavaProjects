package ba.bitcamp.boris.exercises.day5.task1;

public class Tiger extends Animal {

	protected static final short SLEEPING = 0;
	protected static final short HUNTING = 1;
	protected static final short EATING = 2;

	private Integer speed;
	private Short condition;

	public Tiger(Integer weight, Integer speed,
			 Short condition) {
		super(true, weight, TYPE_OF_FOOD_ANIMALS);
		this.speed = speed;
		this.condition = condition;
	}

	@Override
	public String toString() {
		if (super.toString().equals("No LifeForm")) {
			return super.toString();
		} else {
			String s = super.toString()
					+ String.format("How fast it is? %d kmph.\n", speed);
			switch (condition) {
			case SLEEPING:
				s += "Tiger is sleeping right now.";
				return s;
			case HUNTING:
				s += "Tiger is hunting zebra right now.";
				return s;
			case EATING:
				s += "Tiger is eating zebra right now";
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
		result = prime * result + ((speed == null) ? 0 : speed.hashCode());
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
		Tiger other = (Tiger) obj;
		if (condition == null) {
			if (other.condition != null)
				return false;
		} else if (!condition.equals(other.condition))
			return false;
		if (speed == null) {
			if (other.speed != null)
				return false;
		} else if (!speed.equals(other.speed))
			return false;
		return true;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Short getCondition() {
		return condition;
	}

	public void setCondition(Short condition) {
		this.condition = condition;
	}

	public static short getSleeping() {
		return SLEEPING;
	}

	public static short getHunting() {
		return HUNTING;
	}

	public static short getEating() {
		return EATING;
	}

	
	
	
	public void eat(LifeForm lifeform) {
		if (lifeform instanceof Zebra) {
			Zebra z = (Zebra) lifeform;
			if (getCondition() == HUNTING && z.getCondition() == z.HEALTHY) {
				System.out.println("Tiger is eating zebra.");
				setCondition(EATING);
			} else if (getCondition() == HUNTING && z.getCondition() == z.SICK || z.getCondition() == z.DEADLY_SICK) {
				System.out.println("Lion wont eat sick animal.");
				setCondition(HUNTING);
			}
		} else {
			throw new UnsupportedOperationException("Tiger can't eat another tiger.");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
