package ba.bitcamp.exercises.day3;

import java.util.ArrayList;
import java.util.Comparator;

public class Planet implements Comparable<Planet> {
	
	protected static final double EARTH_MASS = 597219 * 10 ^ 24;
	
	private String name;
	private Double diameter;
	private Double mass;
	private Double distance;
	
	public Planet(String name, Double diameter, Double mass, Double distance) {
		this.name = name;
		this.diameter = diameter;
		this.mass = mass;
		this.distance = distance;
	}
	
	public Double getDiameter() {
		return diameter;
	}
	
	public void setDiameter(Double diameter) {
		this.diameter = diameter;
	}
	
	public Double getDistance() {
		return distance;
	}
	
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	
	public Double getMass() {
		return mass;
	}

	public void setMass(Double mass) {
		this.mass = mass;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s, (%.2f), [%.2f], {%.2f}", name, diameter, mass, distance);
	}

	@Override
	public int compareTo(Planet p) {
		return this.name.compareTo(p.name);
	}
	
	public static void sortByDiameter(ArrayList<Planet> list) {
		list.sort(new Comparator<Planet>() {

			@Override
			public int compare(Planet o1, Planet o2) {
				return o2.diameter.compareTo(o1.diameter);
			}
		});
	}
	
	public static void sortByMass(ArrayList<Planet> list) {
		list.sort(new Comparator<Planet>() {

			@Override
			public int compare(Planet o1, Planet o2) {
				return o2.mass.compareTo(o1.mass);
			}
		});
	}
	
	public static void sortByDistance(ArrayList<Planet> list) {
		list.sort(new Comparator<Planet>() {

			@Override
			public int compare(Planet o1, Planet o2) {
				return o2.distance.compareTo(o1.distance);
			}
		});
	}
	
	
}
