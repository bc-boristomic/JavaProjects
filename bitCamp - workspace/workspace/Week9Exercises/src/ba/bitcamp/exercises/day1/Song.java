package ba.bitcamp.exercises.day1;

public class Song {
	
	private String songName;
	private String authorName;
	private Integer year;
	private String genre;
	
	public Song (String song, String author, Integer year, String genre) {
		this.songName = song;
		this.authorName = author;
		this.year = year;
		this.genre = genre;
	}

	
	@Override
	public String toString() {
		return String.format("Song name: %s, year released: %d, genre: %s, by author: %s", songName, year, genre, authorName); 
	}
	
}
