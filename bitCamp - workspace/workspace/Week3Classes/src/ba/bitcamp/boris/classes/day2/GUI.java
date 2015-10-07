package ba.bitcamp.boris.classes.day2;

import java.awt.Graphics;

public class GUI {
   
   private static void main (String[]args) {
	   // Draw 10 lines with space between them. Line must be 200pxl long.
	   
	   Graphics g = null;
	   for (int i = 1; i < 10; i++) {
		   g.drawLine(100, 50, 300, 50);
		   int y= 50;
		
	}
	   int with = 100;
	   int hight = 100;
	   int cx = (int)(with * Math.random());
	   int cy = (int)(hight * Math.random());
	   
//	   for (int i = 1; i < 50; i++) {
//		   switch ((int)(3 * Math.random())) {
//		   case 0:
//			   g.setColor(Color RED);
//			   break;
//		   case 1:
//			   g.setColor (Color GREEN);
//			   break;
//		   case 2:
//			   g.setColor (Color BLUE);
//			   break;
//		   }
//		   g.fillOval(cx-50, cy-50, 100, 100);
//	}
	   
	
   }
   
}