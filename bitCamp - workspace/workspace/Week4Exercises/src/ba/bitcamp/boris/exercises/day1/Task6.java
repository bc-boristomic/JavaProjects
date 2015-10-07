package ba.bitcamp.boris.exercises.day1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Task6 {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		
		g.setColor(Color.BLACK);
		System.out.println("Color set to black.");
		
		g.drawRect(220, 40, 80, 30);
		System.out.println("Draw first top middle rectangle.");
		
		g.drawLine(260, 70, 260, 90);
		System.out.println("Draw vertical line from top middle rectangle down.");
		
		g.drawLine(90, 90, 415, 90);
		System.out.println("Draw horizontal line from bottom middle vertical line.");
		
		int x = 90;
		for (int i = 0; i < 6; i++) {
			g.drawLine(x, 90, x, 110);
			x += 65;
		}
		System.out.println("For every x value add 65 and draw 6 lines.");
		
		int x1 = 60;
		for (int i = 0; i < 6; i++) {
			g.drawRect(x1, 110, 60, 20);
			x1 += 65;
		}
		System.out.println("Draw six rectangles, move x axes by 65 pxl.");
		
		g.setFont(new Font("Arial", Font.BOLD, 10));
		g.drawString("API Packages", 225, 60);
		
		String[] arr = new String[] {"lang", "util", "io", "swt", "net", "applet"};
		
		int x3 = 75;
		for (int i = 0; i < 6; i++) {
			g.drawString(arr[i], x3, 123);
			x3 += 65;
		}
		System.out.println("Draw strings at every index and move by 65 pxl on x axis.");
		
	
			

		// *******************
		w.setImage(img);
	}

}
