package ba.bitcamp.homework23.task2;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = 4055507998239993887L;

	private BufferedImage image;

	/**
	 * Default constructor of MyPanel class. Initializes image.
	 * 
	 */
	public MyPanel() {
		try {
			image = ImageIO.read(new File("src/image.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Overrided paintComponents method used to draw image and to repaint in
	 * negative colors.
	 */
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
		repaint();
	}

	/**
	 * Getter for inputed image
	 * 
	 * @return <code>BufferedImage</code> type of image
	 */
	public BufferedImage getImage() {
		return image;
	}

}
