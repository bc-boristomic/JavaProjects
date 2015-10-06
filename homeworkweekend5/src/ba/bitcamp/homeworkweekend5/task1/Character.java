package ba.bitcamp.homeworkweekend5.task1;

import java.util.Arrays;

/**
 * Inherits StoryElement class and describes 
 * a character in a story.
 */
public class Character extends StoryElement {

	private String sex;
	private Boolean isAlive; // Default is true
	private Boolean isCapable;
	

	public Character(String name, String sex, Boolean isCapable) {
	super.setName(name);
	this.sex = sex;
	this.isAlive = true;
	this.isCapable = isCapable;	
	}
	
	/**
	 * Kills character by setting value to false.
	 */
	public void killCharacter() {
	this.isAlive = false;
	}

	/**
	 * Turns character to capable by setting value to true.
	 */
	public void beCapable() {
	this.isCapable = true;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Boolean getIsAlive() {
		return isAlive;
	}
	
	public Boolean getIsCapable() {
		return isCapable;
	}
	
	public String getStringIsCapable() {
		if (isCapable == true) {
			return "capable";
		} else {
			return "not capable";
		}
	}
	
	public String toString(){
		return super.getName();
	}
	
	
	

}