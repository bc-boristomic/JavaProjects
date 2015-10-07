package ba.bitcamp.boris.classes.day2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MovingRects extends JPanel implements ActionListener {

   
    public void drawFrame(Graphics g, int frameNumber, int width, int height) {
        
        int inset; // Gap between edges of drawing area and the outer rectangle.

        int rectWidth, rectHeight;   // The size of one of the rectangles.
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0,0,width,height);  // Fill drawing area with light gray.

        g.setColor(Color.BLACK);  // Draw the rectangles in black.

        inset = frameNumber % 20;

        rectWidth = width - 2*inset;
        rectHeight = height - 2*inset;

        while (rectWidth >= 0 && rectHeight >= 0) {
            g.drawRect(inset, inset, rectWidth, rectHeight);
            inset += 15;       // rectangles are 15 pixels apart
            rectWidth -= 30;
            rectHeight -= 30;
        }
    }
    
    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------
    
    
    public static void main(String[] args) {
        
        /* NOTE:  The string in the following statement goes in the title bar
         * of the window.
         */
        JFrame window = new JFrame("Infinite motion");

        /*
         * NOTE: If you change the name of this class, you must change
         * the name of the class in the next line to match!
         */
        MovingRects drawingArea = new MovingRects();
        drawingArea.setBackground(Color.WHITE);
        window.setContentPane(drawingArea);

        /* NOTE:  In the next line, the numbers 600 and 450 give the
         * initial width and height of the drawing array.  You can change
         * these numbers to get a different size.
         */
        drawingArea.setPreferredSize(new Dimension(600,450));

        window.pack();
        window.setLocation(100,50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        /*
         * Note:  In the following line, you can change true to
         * false.  This will prevent the user from resizing the window,
         * so you can be sure that the size of the drawing area will
         * not change.  It can be easier to draw the frames if you know
         * the size.
         */
        window.setResizable(true);
        
        /* NOTE:  In the next line, the number 20 gives the time between
         * calls to drawFrame().  The time is given in milliseconds, where
         * one second equals 1000 milliseconds.  You can increase this number
         * to get a slower animation.  You can decrease it somewhat to get a
         * faster animation, but the speed is limited by the time it takes
         * for the computer to draw each frame. 
         */
        Timer frameTimer = new Timer(50,drawingArea);

        window.setVisible(true);
        frameTimer.start();

    } // end main

    private int frameNum;
    
    public void actionPerformed(ActionEvent evt) {
        frameNum++;
        repaint();
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFrame(g, frameNum, getWidth(), getHeight());
    }

}
