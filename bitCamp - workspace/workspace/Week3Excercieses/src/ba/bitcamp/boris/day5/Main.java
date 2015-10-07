package ba.bitcamp.boris.day5;



import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
		
	}

	public static void drawRectangles(int n, int m, Graphics g) {
	
		int x = 60;
		int y = 90;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				g.setColor(Color.BLACK);
				g.drawRect(x, y, 60, 60);
				x+=60;
				
			}
			y+=60;
			x=60;
		}
	}
	
	
	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
		drawRectangles(4, 6, g);
//		g.setColor(Color.ORANGE);
//		g.drawOval(100, 100, 400, 100);
//		
//		g.setColor(Color.RED);
//		g.setFont(new Font("Cambria", Font.BOLD, 18));
//		g.drawString("BitCamp <3", 250, 150);
//		
//		g.setColor(Color.BLUE);
//		g.drawLine(100, 200, 500, 200);
		
		// *******************
		w.setImage(img);
	}
}
