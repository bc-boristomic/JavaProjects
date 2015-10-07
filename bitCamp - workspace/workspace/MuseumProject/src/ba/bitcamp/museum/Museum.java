package ba.bitcamp.museum;

import java.util.LinkedList;

public class Museum implements Searchable {

	// LinkedLists of exibits, their details, artifacts and employees that
	// museum have
	private LinkedList<Exhibit> exhibits = new LinkedList<>();
	private LinkedList<ExhibitDetails> details = new LinkedList<>();
	private LinkedList<HistoricArtifects> artifects = new LinkedList<>();
	private LinkedList<Employee> employees = new LinkedList<>();

	/**
	 * Default empty constructor
	 */
	public Museum() {
		super();
	}

	/**
	 * Constructor that accepts all the lists
	 * 
	 * @param exhibits
	 *            - <code>LinkedList</code> of Exhibit
	 * @param details
	 *            - <code>LinkedList</code> of ExhibitDetails
	 * @param artefects
	 *            - <code>LinkedList</code> of HistoricArtifect
	 * @param employees
	 *            - <code>LinkedList</code> of Employee
	 */
	public Museum(LinkedList<Exhibit> exhibits,
			LinkedList<ExhibitDetails> details,
			LinkedList<HistoricArtifects> artefects,
			LinkedList<Employee> employees) {

		this.exhibits = exhibits;
		this.details = details;
		this.artifects = artefects;
		this.employees = employees;
	}

	public LinkedList<Exhibit> getExhibits() {
		return exhibits;
	}

	public LinkedList<ExhibitDetails> getDetails() {
		return details;
	}

	public LinkedList<HistoricArtifects> getArtifects() {
		return artifects;
	}

	public LinkedList<Employee> getEmployees() {
		return employees;
	}

	/**
	 * toString method returns all exhibits museum have, then in new line all
	 * exhibits with full details, in another line all HistoricArtefects with
	 * their full details. Then in another line all of the Employees working in
	 * museum
	 */
	public String toString() {
		return "Museum have these exhibits " + exhibits
				+ "\ntheir full details" + details + "\nand these artifects "
				+ artifects + "\n Employees working in museum" + employees
				+ "]";
	}

	/**
	 * Implemented method from Searchable interface.
	 */
	@Override
	public boolean fitsSearch(String s) {
		if (exhibits.indexOf(s) != -1 || details.indexOf(s) != -1
				|| artifects.indexOf(s) != -1 || employees.indexOf(s) != -1) {
			return true;
		}
		return false;
	}

	/**
	 * Generated equals method.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Museum other = (Museum) obj;
		if (artifects == null) {
			if (other.artifects != null)
				return false;
		} else if (!artifects.equals(other.artifects))
			return false;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		if (exhibits == null) {
			if (other.exhibits != null)
				return false;
		} else if (!exhibits.equals(other.exhibits))
			return false;
		return true;
	}

}
