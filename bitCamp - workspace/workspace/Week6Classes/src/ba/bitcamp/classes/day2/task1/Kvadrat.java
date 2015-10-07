package ba.bitcamp.classes.day2.task1;

public class Kvadrat extends Pravougaonik {
	
	
	
	public Kvadrat(double a){
		super(a, a);
	}

	@Override
	public String toString() {
		return String.format("Kvadrat(a = %f)", a);
	}
}
