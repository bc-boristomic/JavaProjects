package ba.bitcamp.boris.exercieses.day5;

class Monitor {

	
	private String manufacturer;
	private String type;
	private String color;
	private int size;
	private double weight;
	
	public Monitor (String a, String b, String c, int d, double e) {
		manufacturer = a;
		type = b;
		color = c;
		size = d;
		weight = e;
	}
	
	
	public String toString () {
		String s = "";
		s = s + "Manufacturer:\t " + manufacturer + "\n";
		s = s + "Type:\t\t " + type + "\n";
		s = s + "Color:\t\t " + color + "\n";
		s = s + "Size:\t\t " + size + "\n";
		s = s + "Weight:\t\t " + weight + "\n";
		return s;
	}

	
}
