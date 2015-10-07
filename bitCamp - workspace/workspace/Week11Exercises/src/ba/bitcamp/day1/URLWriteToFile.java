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

public class URLWriteToFile {

	public static void main(String[] args) {
		URL url1 = null;
		try {
			url1 = new URL(
					"/Users/adnan.lapendic/Documents/workspace/ba.bitcamp.week11/output.jpg");
		} catch (MalformedURLException e) {
			System.out.println("Bad URL!");
			e.printStackTrace();
			System.exit(1); // 1 means exited with error
		}
		
		try {
			BufferedImage image = ImageIO.read(url1);
			
			URLConnection con = url1.openConnection();
			System.out.println(con.getContentLength());
			
			InputStream in = con.getInputStream();
			File file = new File("output2.jpg");
			FileOutputStream fileWrite = new FileOutputStream(file);
			
			long start = System.currentTimeMillis();
			byte[] buffer = new byte[1024];
			int readBytes = 0;
			
			while ((readBytes = in.read(buffer, 0, buffer.length)) > 0) {
				fileWrite.write(buffer, 0, readBytes);
			}
//			byte[] buf = new byte[con.getContentLength()];
//			for (int i = 0; i < buf.length; i++) {
//				buf[i] = (byte)in.read();
//			}
//			fileWrite.write(buf);
//			fileWrite.close();
			System.out.println("ended in " + (System.currentTimeMillis() - start) + " ms");
		
			
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
			System.exit(1);
		}
		

	}

}
