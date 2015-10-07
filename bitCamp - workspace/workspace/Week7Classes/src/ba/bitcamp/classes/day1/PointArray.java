package ba.bitcamp.classes.day1;

public class PointArray {
	
	private Point[] points;
	private int length;
	private Point[] copy;
	
	public PointArray(){
		this.points = new Point[10];
		this.length = 0;
		
		for (int i = 0; i < points.length; i++) {
			copy[i] = points[i];
		}
	}

	/**
	 * Adds a point to point array.
	 * 
	 * @param point Object
	 */
	public void addPoint(Point point){
		if (length == points.length) {
			resize();
		}
		this.points[length++] = point;
	}
	
	/**
	 * Returns how many Points we added.
	 * Length of Point array.
	 * 
	 * @return
	 */
	public int getLength(){
		return length;
	}
	
	/**
	 * Returns Point at certain index.
	 * 
	 * @param index
	 * @return
	 */
	public Point elementAt(int index){
		return points[index];
	}
	
	/**
	 * Resizes a Point array by double.
	 */
	public void resize(){
		Point[] temp = new Point[points.length * 2];
		for (int i = 0; i < points.length; i++) {
			temp[i] = points[i];
		}
		points = temp;
	}
	
	
	public void clearArray() {
		length = 0;
	}
	
	public void undo() {
		length -= 1; 
	}
	
		
	public void redo() {
		points = copy;
	}
}
