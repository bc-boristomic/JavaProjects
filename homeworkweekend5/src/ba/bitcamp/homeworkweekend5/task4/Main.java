package ba.bitcamp.homeworkweekend5.task4;

import ba.bitcamp.homeworkweekend5.task1.Character;
import ba.bitcamp.homeworkweekend5.task2.Event;
import ba.bitcamp.homeworkweekend5.task2.Goal;
import ba.bitcamp.homeworkweekend5.task3.Protagonist;

public class Main {
	
	public static void main(String[] args) {
		
		
		Character nemessis = new Character("Joker", "M", true);
		Character friend1 = new Character("Alfred Pennyworth", "M", false);
		Character friend2 = new Character("James Gordon", "M", true); // Set false to lose battle
		Character friend3 = new Character("Rachel Dawes", "F", false);
		Character friend4 = new Character("Lucius Fox", "M", false);
		Character parents = new Character("parents", "M&F", false);
		
		Goal ftw = new Goal(Event.REVENGE, parents, Goal.HARD);
		
		Protagonist hero = new Protagonist("Batman", "M", true, ftw);
		
		hero.setNemessis(nemessis);
		
		hero.addHelpers(friend1);
		hero.addHelpers(friend2);
		hero.addHelpers(friend3);
		//hero.addHelpers(friend4); // San't add fourth friend (uncomment to check)

		// Status of helpers before battle
		System.out.println("Friends capable before: " + friend1.getIsCapable() + " " + friend2.getIsCapable()+ " " + friend3.getIsCapable());
		System.out.println("Friends alive before: " + friend1.getIsAlive() + " " + friend2.getIsAlive() + " " + friend3.getIsAlive());
		System.out.println();
		
		hero.attainGoal(); // Calling the story
		
		System.out.println();
		// Status of helpers after battle
		System.out.println("Friends capable after: " + friend1.getIsCapable() +" "+ friend2.getIsCapable()+ " " + friend3.getIsCapable());
		System.out.println("Friends alive after: " + friend1.getIsAlive() + " " + friend2.getIsAlive() + " " + friend3.getIsAlive());

		
	}

}
