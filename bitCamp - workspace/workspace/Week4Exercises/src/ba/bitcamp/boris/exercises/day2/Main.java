package ba.bitcamp.boris.exercises.day2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Arrays;

public class Main {

	public static boolean drawLine(String[] Arr, Graphics g) {

		try {
			g.drawLine(Integer.parseInt(Arr[1]), Integer.parseInt(Arr[2]),
					Integer.parseInt(Arr[3]), Integer.parseInt(Arr[4]));
			return true;
		} catch (Exception e1) {
			return false;
		}
	}

	public static boolean drawString(String[] Arr, Graphics g) {
		try {
			g.drawString(Arr[1], Integer.parseInt(Arr[2]),
					Integer.parseInt(Arr[3]));
			return true;
		} catch (Exception e2) {
			return false;
		}
	}

	public static boolean drawRect(String Arr[], Graphics g) {

		try {
			g.drawRect(Integer.parseInt(Arr[1]), Integer.parseInt(Arr[2]),
					Integer.parseInt(Arr[3]), Integer.parseInt(Arr[4]));
			return true;
		} catch (Exception e) {
			return false;

		}

	}

	/**
	 * 
	 * @param Arr
	 *            - array with values of parameters
	 * @param g
	 *            - Graphics g
	 * @return true
	 */

	public static boolean fillRect(String Arr[], Graphics g) {
		try {
			g.fillRect(Integer.parseInt(Arr[1]), Integer.parseInt(Arr[2]),
					Integer.parseInt(Arr[3]), Integer.parseInt(Arr[4]));
			return true;
		} catch (Exception e) {
			return false;

		}

	}

	/**
	 * 
	 * Sets color using <code>String</code> array value
	 * 
	 * 
	 * 
	 * @param array
	 *            - array that contains file info
	 * 
	 * @param g
	 *            - graphics parametar
	 * 
	 * @return boolean value
	 */

	public static boolean setColor(String[] Arr, Graphics2D g) {

		try {
			String c = Arr[1];
			if (c.equals("RED")) {
				g.setColor(Color.RED);
			}
			if (c.equals("BLUE")) {
				g.setColor(Color.BLUE);
			}
			if (c.equals("WHITE")) {
				g.setColor(Color.WHITE);
			}
			return true;

		} catch (Exception ex) {

			return false;

		}

	}

	/**
	 * Method which draw a Oval
	 * 
	 * @param Arr
	 *            - values of coordi
	 * @param g
	 * @return
	 */
	public static Boolean drawOval(String Arr[], Graphics2D g) {
		try {

			g.drawOval(Integer.parseInt(Arr[1]), Integer.parseInt(Arr[2]),
					Integer.parseInt(Arr[3]), Integer.parseInt(Arr[4]));
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public static Boolean fillOval(String Arr[], Graphics2D g) {

		try {
			g.fillOval(Integer.parseInt(Arr[1]), Integer.parseInt(Arr[2]),
					Integer.parseInt(Arr[3]), Integer.parseInt(Arr[4]));
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	/**
	 * Draws triangle from inputed 12 coordinates. Combines them into three lines.
	 * 
	 * @param Arr - Array contains letter with instructions what to draw and coordinates at different index. 
	 * @param g
	 * @return True if no exceptions.
	 */
	public static boolean drawTriangle(String Arr[], Graphics2D g) {
		try {
			g.drawLine(Integer.parseInt(Arr[1]), Integer.parseInt(Arr[2]), Integer.parseInt(Arr[3]), Integer.parseInt(Arr[4]));
			g.drawLine(Integer.parseInt(Arr[5]), Integer.parseInt(Arr[6]), Integer.parseInt(Arr[7]), Integer.parseInt(Arr[8]));
			g.drawLine(Integer.parseInt(Arr[9]), Integer.parseInt(Arr[10]), Integer.parseInt(Arr[11]), Integer.parseInt(Arr[12]));
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public static void main(String[] args) {
		GUI w = new GUI();
		draw(w);

	}

	public static void draw(GUI w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = (Graphics2D) img.getGraphics();
		// **** Draw here ****
		String[] Arr = new String[13];
		TextIO.readFile("text.txt");
		while (!TextIO.eof()) {

			String line = TextIO.getln();
			Arr = line.split(" ");
			String s = Arr[0];
			switch (s) {
			case "DO":
				drawOval(Arr, g);
				break;
			case "FO":
				fillOval(Arr, g);
				break;
			case "DR":
				drawRect(Arr, g);
				break;
			case "C":
				setColor(Arr, g);
				break;
			case "FR":
				fillRect(Arr, g);
				break;
			case "L":
				drawLine(Arr, g);
				break;
			case "S":
				drawString(Arr, g);
				break;
			case "T":
				drawTriangle(Arr, g);
				break;
				
			}
		}

		System.out.println(Arrays.toString(Arr));

		w.setImage(img);

		// g.setColor(Color.WHITE);

		/*
		 * g.setColor(Color.RED); g.drawLine(100+i, 0, 100+i, 90);
		 * g.drawLine(100+i, 0, 30+i, 40); g.setColor(Color.WHITE);
		 * g.drawOval(130+i, 0, 100, 100); i+40 g.setColor(Color.WHITE);
		 * g.drawLine(150+i, 0, 100+i, 100); g.drawLine(150+i, 0, 30+i, 40);
		 */

		// *******************

	}

}
