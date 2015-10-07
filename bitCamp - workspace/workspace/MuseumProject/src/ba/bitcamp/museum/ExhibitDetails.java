package ba.bitcamp.museum;

public class ExhibitDetails {

	// Declaring variables used to describe each ExhibitDetails
	private Exhibit exhibit;
	private String author;
	private ArtPeriod artPeriod;

	/**
	 * Default constructor of ExhibitDetails class.
	 * 
	 * @param exhibit
	 *            - <code>Exhibit</code> type value of exhibit
	 * @param author
	 *            - <code>String</code> type value of author name
	 * @param period
	 *            - <code>Enum</code> type value of ArtPeriod
	 */
	public ExhibitDetails(Exhibit exhibit, String author, ArtPeriod period) {
		this.exhibit = exhibit;
		this.author = author;
		this.artPeriod = period;
	}

	/**
	 * Enums used to represent specific ArtPeriod Exhibit comes from.
	 * 
	 * @author boris.tomic
	 *
	 */
	enum ArtPeriod {
		RENAISSANCE, NEOCLASSIC, MODERN_ART, CONTEMP_ART
	}

	/**
	 * toString method returns exhibit toString method and adds in new line
	 * author details with art period details.
	 */
	public String toString() {
		String s = null;
		if (artPeriod == ArtPeriod.RENAISSANCE) {
			s = "renaissance";
		} else if (artPeriod == ArtPeriod.NEOCLASSIC) {
			s = "neo classic";
		} else if (artPeriod == ArtPeriod.MODERN_ART) {
			s = "modern art";
		} else {
			s = "contemporary art";
		}
		return exhibit.toString()
				+ String.format("\nAuthor: %s, art period: %s", author, s);
	}

	/**
	 * Generated equals method
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExhibitDetails other = (ExhibitDetails) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (artPeriod != other.artPeriod)
			return false;
		return true;
	}

}
