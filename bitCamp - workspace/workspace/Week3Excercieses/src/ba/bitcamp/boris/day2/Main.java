package ba.bitcamp.boris.day2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		// g.setColor(Color.BLUE);
		// g.drawOval(110, 0, 100, 300);
		//
		// g.fillOval(150, 20, 30, 30);
		// g.setFont(new Font("Calibri", Font.ITALIC, 15));
		// g.drawString("Point 1", 140, 70);
		// g.setColor(Color.BLACK);
		// g.drawOval(180, 0, 100, 300);
		//
		// g.setColor(Color.RED);
		// g.drawOval(180, 0, 100, 300);
		//
		// g.setColor(Color.BLACK);
		// g.fillOval(200, 20, 28, 25);
		// g.setFont(new Font("Calibri", Font.ITALIC, 15));
		// g.drawString("Point 2", 215, 70);

		// g.setColor(Color.BLACK);
		// // First column.
		// g.fillRect(0, 0, 20, 20);
		// g.fillRect(0, 40, 20, 20);
		// g.fillRect(0, 80, 20, 20);
		// g.fillRect(0, 120, 20, 20);
		// // Second column.
		// g.fillRect(20, 20, 20, 20);
		// g.fillRect(20, 60, 20, 20);
		// g.fillRect(20, 100, 20, 20);
		// g.fillRect(20, 140, 20, 20);
		// // Third Column.
		// g.fillRect(40, 0, 20, 20);
		// g.fillRect(40, 40, 20, 20);
		// g.fillRect(40, 80, 20, 20);
		// g.fillRect(40, 120, 20, 20);
		// // Fourth column.
		// g.fillRect(60, 20, 20, 20);
		// g.fillRect(60, 60, 20, 20);
		// g.fillRect(60, 100, 20, 20);
		// g.fillRect(60, 140, 20, 20);
		// // Fifth column.
		// g.fillRect(80, 0, 20, 20);
		// g.fillRect(80, 40, 20, 20);
		// g.fillRect(80, 80, 20, 20);
		// g.fillRect(80, 120, 20, 20);
		// // Sixth column.
		// g.fillRect(100, 20, 20, 20);
		// g.fillRect(100, 60, 20, 20);
		// g.fillRect(100, 100, 20, 20);
		// g.fillRect(100, 140, 20, 20);
		// // Seventh column.
		// g.fillRect(120, 0, 20, 20);
		// g.fillRect(120, 40, 20, 20);
		// g.fillRect(120, 80, 20, 20);
		// g.fillRect(120, 120, 20, 20);
		// // Eight column.
		// g.fillRect(140, 20, 20, 20);
		// g.fillRect(140, 60, 20, 20);
		// g.fillRect(140, 100, 20, 20);
		// g.fillRect(140, 140, 20, 20);
		//
		// g.setColor(Color.WHITE);
		// // First column.
		// g.fillRect(0, 20, 20, 20);
		// g.fillRect(0, 60, 20, 20);
		// g.fillRect(0, 100, 20, 20);
		// g.fillRect(0, 140, 20, 20);
		// // Second column.
		// g.fillRect(20, 0, 20, 20);
		// g.fillRect(20, 40, 20, 20);
		// g.fillRect(20, 80, 20, 20);
		// g.fillRect(20, 120, 20, 20);
		// // Third column.
		// g.fillRect(40, 20, 20, 20);
		// g.fillRect(40, 60, 20, 20);
		// g.fillRect(40, 100, 20, 20);
		// g.fillRect(40, 140, 20, 20);
		// // Fourth column.
		// g.fillRect(60, 0, 20, 20);
		// g.fillRect(60, 40, 20, 20);
		// g.fillRect(60, 80, 20, 20);
		// g.fillRect(60, 120, 20, 20);
		// // Fifth column.
		// g.fillRect(80, 20, 20, 20);
		// g.fillRect(80, 60, 20, 20);
		// g.fillRect(80, 100, 20, 20);
		// g.fillRect(80, 140, 20, 20);
		// // Sixth column.
		// g.fillRect(100, 0, 20, 20);
		// g.fillRect(100, 40, 20, 20);
		// g.fillRect(100, 80, 20, 20);
		// g.fillRect(100, 120, 20, 20);
		// // Seventh column.
		// g.fillRect(120, 20, 20, 20);
		// g.fillRect(120, 60, 20, 20);
		// g.fillRect(120, 100, 20, 20);
		// g.fillRect(120, 140, 20, 20);
		// // Eight column.
		// g.fillRect(140, 0, 20, 20);
		// g.fillRect(140, 40, 20, 20);
		// g.fillRect(140, 80, 20, 20);
		// g.fillRect(140, 120, 20, 20);
		// g.setColor(Color.BLACK);
		// g.setFont(new Font("Calibri", Font.ITALIC, 15));
		// g.drawString("Chess Board", 160, 140);

//		int x = 0;
//		int y = 0;
//		int x1 = 20;
//		int y1 = 0;
//		for (int i = 0; i < 8; i++) {
//		for (int j = 0; j < 8; j++) {
//			
//		}
//			if (i % 2 == 0) {
//				g.setColor(Color.BLACK);
//				g.fillRect(x, y, 20, 20);
//				x*=20;
//				y*=20;
//							} else {
//				g.setColor(Color.WHITE);
//				g.fillRect(x1, y1, 20, 20);
//				x1+=20;
//				y1+=20;
//			}
//			
//			
//		}
		g.setColor(Color.BLUE);
		g.setFont(new Font("Cambria", Font.BOLD, 15));
		g.drawString("Random color - random shape", 50, 15);
		switch ((int)(5 * Math.random())) {
		case 0:
			g.setColor(Color.BLACK);
			break;
		case 1:
			g.setColor(Color.GREEN);
			break;
		case 2:
			g.setColor(Color.MAGENTA);
			break;
		case 3:
			g.setColor(Color.ORANGE);
			break;
		case 4:
			g.setColor(Color.LIGHT_GRAY);
		
		}
		
		switch ((int)(3 * Math.random())) {
		case 0:
			g.fillRect(40, 50, 300, 320);
			break;
		case 1:
			g.fillArc(60, 60, 200, 200, 13, 60);
			break;
		case 2:
			g.fillOval(50, 50, 280, 220);
		}
		
		

		// g.fillRect(0, 0, 20, 20);

		// g.setColor(Color.RED);
		// g.setFont(new Font("Cambria", Font.BOLD, 18));
		// g.drawString("BitCamp <3", 250, 150);

		// g.setColor(Color.BLUE);
		// g.drawLine(100, 0, 100, 100);
		//
		
		

		// *******************
		w.setImage(img);
	}
}
