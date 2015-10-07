package ba.bitcamp.day4;

public class Message {

	String sender;
	String message;

	public Message(String sender, String message) {
		this.sender = sender;
		this.message = message;
	}
	
	public String getMessage() {
		StringBuilder sb = new StringBuilder();
		sb.append(sender).append(" : ").append(message);
		return sb.toString();
	}

}
