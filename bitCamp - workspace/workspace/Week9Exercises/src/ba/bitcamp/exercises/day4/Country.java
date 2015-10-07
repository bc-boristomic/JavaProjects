package ba.bitcamp.exercises.day4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.LinkedList;

enum SortBy {
	NAME, POPULATION, AREA
}

public class Country {

	private String name;
	private Integer population;
	private Double area;

	public Country(String name, Integer population, Double area) {
		this.name = name;
		this.population = population;
		this.area = area;
	}

	public static void compare(LinkedList<Country> list, EnumSet<SortBy> set) {
		
		list.sort(new Comparator<Country>() {

			@Override
			public int compare(Country o1, Country o2) {
					if (set.contains(SortBy.NAME)) {
						return o1.name.compareTo(o2.name);
					} 
					if (set.contains(SortBy.POPULATION)) {
						return o1.population.compareTo(o2.population);
					}
					if (set.contains(SortBy.AREA)) {
						return o1.area.compareTo(o2.area);
					}
				
				return 0;
			}
		});
	}

	@Override
	public String toString() {
		return name + "-" + population + "-" + area;
	}

	public static void main(String[] args) {

		Country c1 = new Country("A", 50, 5.0);
		Country c2 = new Country("A", 41, 7.9);
		Country c3 = new Country("A", 50, 6.1);

		LinkedList<Country> list = new LinkedList<>(Arrays.asList(c1, c2, c3));
		
		EnumSet<SortBy> set = EnumSet.of(SortBy.NAME, SortBy.POPULATION, SortBy.POPULATION);
		
		Country.compare(list, set);
		System.out.println(list);

		

	}

}
