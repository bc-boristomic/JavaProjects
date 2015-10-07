package ba.bitcamp.boris.ecercises.day1;

public class Player {
	
	private String name;
	private String club;
	private String nationality;
	private int golasScored;
	
	
	public Player(String name, String club, String nationality) {
		super();
		this.name = name;
		this.club = club;
		this.nationality = nationality;
		golasScored = 0;
	}
	
	public String toString() {
		String s = "";
		s += name + ", ";
		s += club + ", ";
		s += nationality + " ";
				
		return s;
	}
	
	public void addGoals (int golas) {
		golasScored += golas;
	}
	
	public int getGolas() {
		
		return golasScored;
	}

}
