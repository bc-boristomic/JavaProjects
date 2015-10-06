package ba.bitcamp.homeworkclasses15.task1;


public class LineArray {
	
	private Line[] lines;
	private int length;
	private Line[] copy = new Line[10];
	
	public LineArray(){
		this.lines = new Line[10];
		this.length = 0;
		
		for (int i = 0; i < copy.length; i++) {
			copy[i] = lines[i];
		}
	}

	/**
	 * Adds a line to line array.
	 * 
	 * @param line Object
	 */
	public void addPoint(Line line){
		if (length == lines.length) {
			resize();
		}
		this.lines[length++] = line;
	}
	
	/**
	 * Returns how many Lines we added.
	 * Length of Line array.
	 * 
	 * @return
	 */
	public int getLength(){
		return length;
	}
	
	/**
	 * Returns Line at certain index.
	 * 
	 * @param index
	 * @return
	 */
	public Line elementAt(int index){
		return lines[index];
	}
	
	/**
	 * Resizes a Line array by double.
	 */
	public void resize(){
		Line[] temp = new Line[lines.length * 2];
		for (int i = 0; i < lines.length; i++) {
			temp[i] = lines[i];
		}
		lines = temp;
	}
	
	/**
	 * Deletes entire array and clear the screen.
	 */
	public void clearArray() {
		length = 0;
	}
	
	/**
	 * Deletes last line in array.
	 */
	public void undo() {
		length -= 1; 
	}
	
	
	public void redo() {
		lines = copy;
	}
}