package ba.bitcamp.homeworkweekend5.task1;

/**
 *Describes an element in a story.
 */
public abstract class StoryElement {

	private String name;

	public StoryElement(String name){
	this.name = name;
	}

	public StoryElement() {
	this.name = "STElement";
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}