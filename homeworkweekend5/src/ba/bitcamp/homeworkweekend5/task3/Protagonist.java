package ba.bitcamp.homeworkweekend5.task3;

import ba.bitcamp.homeworkweekend5.task1.Character;
import ba.bitcamp.homeworkweekend5.task2.Goal;

/**
 * Describes main positive character in a story.
 */
public class Protagonist extends Character {
	
	private Character[] helpers = {null, null, null};
	private Character nemessis; // can be null
	private Goal goal;
	
	public Protagonist(String name, String sex, Boolean isCapable, Goal goal){
		super(name, sex, isCapable);
		this.goal = goal;
	}
	
	/**
	 * Returns the goal.
	 * 
	 * @return Goal that is set
	 */
	public Goal getGoal() {
		return goal;
	}

	/**
	 * Sets a character as main nemessis to protagonist.
	 */
	public void setNemessis(Character nemessis) {
	this.nemessis = nemessis;
	}
	
	/**
	 * Returns nemessis.
	 * 
	 * @return Character who is nemessis
	 */
	public Character getNemessis() {
		return nemessis;
	}
	
	/**
	 * Returns names of helpers.
	 * 
	 * @return Names of helpers
	 */
	public String getHelpers() {
		String s = "";
		for (int i = 0; i < helpers.length; i++) {
			s += helpers[i].getName() + ", ";
		}
		return s;
	}
	
	/**
	 * Calculates how many capable helpers is there.
	 * 
	 * @return number of capable helpers
	 */
	public int getCapableHelpers() {
		int capable = 0;
		for (int i = 0; i < helpers.length; i++) {
			if (helpers[i].getIsCapable() == true) {
				capable++;
			}
		}
		return capable;
	}
	

	/**
	 * Fills an array of helpers with friendly characters.
	 * 
	 * @param Character that is suppose to help
	 */
	public void addHelpers(Character helper) {
		for (int i = 0; i < helpers.length; i++) {
			if (helpers[i] == null) {
				helpers[i] = helper;
				break;
			} else if (helpers[helpers.length-1] != null) {
				throw new ArrayIndexOutOfBoundsException("You can only add three friends");
			}
		}
	}
	
	
	/**
	 * Calculates all the rules of game and prints the results 
	 * using format so that characters and text are not fixed.
	 */
	public void attainGoal(){
		int percentage = 0;
		if (super.getIsAlive() == false) {
			throw new UnsupportedOperationException("Seems like your character is not amoung us!");
		} else {
			if (super.getIsCapable() == true) {
				percentage += 40;
			}
			for (int i = 0; i < helpers.length; i++) {
				if (helpers[i].getIsCapable() == true) {
					percentage += 20;
				}
			}
			if (getNemessis().getIsCapable() == true) {
				percentage -= 30;
			}
			if (goal.getLevel() == Goal.HARD) {
				percentage -= 20;
			} else if (goal.getLevel() == Goal.IMPOSSIBLE) {
				percentage -= 100;
			}
			if (percentage < 0) {
				percentage = 0;
			} else if (percentage > 100) {
				percentage = 100;
			}
			
		}
		int rand = (int)(Math.random() * 3);
		if (percentage > 0) {
			System.out.printf("%s wants to %s. His main nemessis is %s, who is %s.\n"
					+ "Luckly for him you called his friends %sof whom %d is (are) capable to help %s.\n"
					+ "After some serius calculation %s now knows his chanses are %d percents.\n"
					+ "So %s won the battle, defeated %s and %s.\n",
					getName(), getGoal(), getNemessis(), getNemessis().getStringIsCapable(), getHelpers(), getCapableHelpers(), getName(), getName(), percentage, getName(), getNemessis(), getGoal());
			helpers[rand].beCapable(); // Makes someone from helpers randomly capable.
		} else if (percentage == 0) {
			System.out.printf("%s wants to %s. His main nemessis is %s, who is %s.\n"
					+ "Luckly for him you called his friends %sof whom %d is (are) capable to help %s.\n"
					+ "After some serius calculation %s now knows his chanses are %d percents.\n"
					+ "So %s lost the battle, and failed to %s.\n", 
					getName(), getGoal(), getNemessis(), getNemessis().getStringIsCapable(), getHelpers(), getCapableHelpers(), getName(), getName(), percentage, getName(), getGoal());
			helpers[rand].beCapable(); // Makes someone from helpers randomly capable.
			helpers[rand].killCharacter(); // Randomly kills someone from helpers.
		}
	}
	
	
	
}