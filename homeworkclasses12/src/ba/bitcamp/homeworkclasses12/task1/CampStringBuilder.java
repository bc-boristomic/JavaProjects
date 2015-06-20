package ba.bitcamp.homeworkclasses12.task1;

public class CampStringBuilder {
	
	private char[] characters;
	
	public CampStringBuilder(char[] characters) {
		this.characters = characters;
	}
	
	public void append(Object o){
		
	}
	
	public void prepend(Object o){
		
	}
	
	public String toString(){
		return String.copyValueOf(characters);
	}

}
