package ba.bitcamp.exercises.day1;

public class LinkedListSong {
	
	private Song start;
	
	public LinkedListSong () {
		this.start = null;
	}

	public LinkedListSong (Song[] songs) {
		//this.start = ;
	}
	
	
	@Override
	public String toString() {
		if (start == null) {
			return "List is empty";
		}
		return start.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedListSong other = (LinkedListSong) obj;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}
	
	
	
	

}
