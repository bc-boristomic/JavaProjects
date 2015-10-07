package day1;

public class Message {
	
	private String name;
	private String timestamp;
	private String message;
	
	
	
	public Message() {
		super();
	}

	public Message(String name, String timestamp, String message) {
		super();
		this.name = name;
		this.timestamp = timestamp;
		this.message = message;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Message [name=");
		builder.append(name);
		builder.append(", timestamp=");
		builder.append(timestamp);
		builder.append(", message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}
	
	

}
