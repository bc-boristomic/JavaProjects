public class Movie {

	/**
	 * Movie class.
	 */
	
	String title;
	int year;
	String genre;
	String director;
	double scoreIMDB;
	boolean oscar;

	
	/**
	 * Constructor of Movie class.
	 */
	public Movie(String title, int year, String genre, String director,
			double scoreIMDB, boolean oscar) {
		super();
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.director = director;
		this.scoreIMDB = scoreIMDB;
		this.oscar = oscar;

	}
/**
 *  toString method. Will be used to print out all values in this order.
 */
	public String toString() {

		String s = "";
		s = s + "Title\t\t" + title + "\n";
		s = s + "Year\t\t" + year + "\n";
		s = s + "Genre\t\t" + genre + "\n";
		s = s + "Director\t" + director + "\n";
		s = s + "IMDB Score\t" + scoreIMDB + "\n";
		s = s + "Won Oscar?\t" + oscar + "\n";

		return s;

	}

}
