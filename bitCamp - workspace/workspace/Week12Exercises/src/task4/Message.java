package task4;

import java.util.Random;

public class Message {
	
	private String message;
	private int option;
	
	public Message() {
		
	}
	
	public void generateRandMessage () {
		Random rand = new Random();
		this.option = rand.nextInt(4) + 1;
		if (option == 1) {
			// temp
			this.message = rand.nextInt(50) + "";
		} else if (option == 2) {
			// pressure
			this.message = rand.nextInt(1800) + 1000 + "";
		} else if (option == 3) {
			// movement
			this.message = "ERROR";
		} else {
			this.message = rand.nextBoolean() + "";
		}
	}
	
	public int getOption() {
		return option;
	}
	
	
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Message [message=");
		builder.append(message);
		builder.append(", option=");
		builder.append(option);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
