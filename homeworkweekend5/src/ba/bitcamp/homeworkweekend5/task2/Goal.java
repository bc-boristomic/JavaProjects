package ba.bitcamp.homeworkweekend5.task2;

import ba.bitcamp.homeworkweekend5.task1.StoryElement;
import ba.bitcamp.homeworkweekend5.task1.Character;

/**
 * Describes a goal of a character in a story.
 */
public class Goal extends StoryElement {

	public static final int EASY = 0;
	public static final int HARD = 1;
	public static final int IMPOSSIBLE = 2;
	
	private Integer level;
	private String goal;
	private Integer event;
	private Character character;
	
	/**
	 * Constructor of Goal class.
	 * 
	 * @param event Takes event from Event class constants and makes it String
	 * @param character Character that is connected to protagonist and story.
	 * @param level Level of game.
	 */
	public Goal (Integer event, Character character, Integer level) {
		if (event < 0 || event > 4) {
			throw new UnsupportedOperationException("Event must be in range 0 - 4. Input Event. and choose apropriate event");
		} else if (event == Event.DEFEAT) {
			this.goal = "Defeat";
		} else if (event == Event.FRIENDSHIP) {
			this.goal = "Friendship";
		} else if (event == Event.LOVE) {
			this.goal = "Love";
		} else if (event == Event.REVENGE) {
			this.goal ="Revenge";
		} else if (event == Event.MANIPULATE) {
			this.goal = "Manipulate";
		}
		this.character = character;
		this.level = level;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}
	
	public Integer getLevel() {
		return level;
	}
	
	public Character getCharacter() {
		return character;
	}
	
	public String toString(){
		return getGoal() + " his " + getCharacter();
	}

}