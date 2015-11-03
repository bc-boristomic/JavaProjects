
public class Stick {
	
	private int stickNumber;
	private boolean free;
	
	public Stick(int stickNumber) {
		this.stickNumber = stickNumber;
		free = true;
	}
	
	public int getStickNumber() {
		return stickNumber;
	}
	
	public synchronized boolean getIfFree() {
		if (free) {
			free = false;
			return true;
		}
		return false;
	}
	
	public void setStickFree() {
		free = true;
	}

}
