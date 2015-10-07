package ba.bitcamp.day1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class URLExamples {

	public static void main(String[] args) {
		URL url1 = null;
		try {
			url1 = new URL(
					"http://www.dam7.com/Images/Puppy/images/myspace-puppy-images-0068.jpg");
		} catch (MalformedURLException e) {
			System.out.println("Bad URL!");
			e.printStackTrace();
			System.exit(1); // 1 means exited with error
		}

		ImageIcon ii = new ImageIcon(url1);
		JFrame frame = new JFrame();
		frame.add(new JLabel(ii));
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	
		
	}

}
