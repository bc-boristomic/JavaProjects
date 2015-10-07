package ba.bitcamp.boris.exercises.day5.task1;

public class Plant extends LifeForm {
	
	/*
	 * Napisati klasu koja opisuje sve biljke. Biljka nasljeđuje atribute živog bića. Pored toga, biljka sadrži i atribut da li je

otrovna i atribut količine.

o Tri količine postoje, malo, srednje i mnogo (misleći koliko ima jestivih dijelova biljke).
	 */
	
	
	protected static final short LOW_QUANTITY = 0;
	protected static final short MEDIUM_QUANTITY = 1;
	protected static final short HIGH_QUANTITY = 2;
	
	private Boolean isPoison;
	private Short quantity;
	
	public Plant(Boolean isAlive,Boolean isPoison, Short quantity) {
		super(isAlive);
		this.isPoison = isPoison;
		this.quantity = quantity;
	}
	
	
	
	public String toString() {
		if (super.toString().equals("No LifeForm")) {
			return super.toString();
		} else {
			return super.toString() + String.format("Is plant poison? %b \nHow much of this plant is there? %d plants.", isPoison, quantity);
		}
	}

}
