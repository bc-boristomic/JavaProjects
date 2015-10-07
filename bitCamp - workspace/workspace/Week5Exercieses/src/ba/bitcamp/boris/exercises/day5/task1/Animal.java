package ba.bitcamp.boris.exercises.day5.task1;

public abstract class Animal extends LifeForm {
	
	
	protected static final short TYPE_OF_FOOD_ANIMALS = 0;
	protected static final short TYPE_OF_FOOD_PLANTS = 1;
	
	private Integer weight;
	private Short typeOfFood;
	
	public Animal(Boolean isAlive, Integer weight, Short typeOfFood) {
		super(isAlive);
		this.weight = weight;
		this.typeOfFood = typeOfFood;
			
	}
	
	@Override
	public String toString() {
		if (super.toString().equals("No LifeForm")) {
			return super.toString();
		} else if (typeOfFood == TYPE_OF_FOOD_ANIMALS) {
			return super.toString() + String.format("How much does it weight? %d kg.\nFood preference is animals.\n", weight);
		} else if (typeOfFood == TYPE_OF_FOOD_PLANTS) {
			return super.toString() + String.format("How much does it weight? %d kg.\nFood preference is plants.\n", weight);
		} else {
			return "";
		}
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((typeOfFood == null) ? 0 : typeOfFood.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
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
		Animal other = (Animal) obj;
		if (typeOfFood == null) {
			if (other.typeOfFood != null)
				return false;
		} else if (!typeOfFood.equals(other.typeOfFood))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Short getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(Short typeOfFood) {
		this.typeOfFood = typeOfFood;
	}

	public static Short getTypeOfFoodAnimals() {
		return TYPE_OF_FOOD_ANIMALS;
	}

	public static Short getTypeOfFoodPlants() {
		return TYPE_OF_FOOD_PLANTS;
	}
	
	
	
	
	
	
	
	
	
	

}
