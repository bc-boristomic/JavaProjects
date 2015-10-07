package ba.bitcamp.museum;

public class HistoricArtifects extends ExhibitDetails {

	// Declaring variable of enum type used to set time period
	private TimePeriod timePeriod;

	/**
	 * Default constructor of HistoricArtefects class
	 * 
	 * @param exhibit
	 *            - <code>Exhibit</code> type value of exhibit
	 * @param author
	 *            - <code>String</code> type value of author name
	 * @param period
	 *            - <code>Enum</code> type value of ArtPeriod
	 * @param timePeriod
	 *            - <code>Enum</code> type value of TimePeriod
	 */
	public HistoricArtifects(Exhibit exhibit, String author, ArtPeriod period,
			TimePeriod timePeriod) {
		super(exhibit, author, period);
		this.timePeriod = timePeriod;
	}

	/**
	 * Enums used to represent specific TimePeriod Exhibit comes from.
	 * 
	 * @author boris.tomic
	 *
	 */
	enum TimePeriod {
		CLASSIC, MIDDLE_AGE, MODERN_AGE
	}

	/**
	 * toString method returns superclass toString method and adds specific time
	 * period of Exhibit in new line.
	 */
	public String toString() {
		String s = null;
		if (timePeriod == TimePeriod.CLASSIC) {
			s = "Classic";
		} else if (timePeriod == TimePeriod.MIDDLE_AGE) {
			s = "Middle Age";
		} else {
			s = "Modern Time";
		}
		return super.toString() + "\nfrom: " + s;
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
		HistoricArtifects other = (HistoricArtifects) obj;
		if (timePeriod != other.timePeriod)
			return false;
		return true;
	}

}
