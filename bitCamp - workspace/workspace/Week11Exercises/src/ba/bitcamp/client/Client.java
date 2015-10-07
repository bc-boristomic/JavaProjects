package ba.bitcamp.client;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class Client {
	public static void main(String[] args) {

		try {
			// Socket socket = new Socket("10.0.82.33", 1985); // Adnan
			// Socket socket = new Socket("10.0.82.63", 6699); // Edin
			// Socket socket = new Socket("127.0.0.1", 2905); // localhost

			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("10.0.82.33", 5598));

//			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//			
//			Scanner input = new Scanner(System.in);

			//BufferedImage image = ImageIO.read(socket);
			
			InputStream in = socket.getInputStream();
			
			File file = new File("output2.jpg");
			FileOutputStream fileWrite = new FileOutputStream(file);
			
			byte[] buffer = new byte[1024];
			int readBytes = 0;
				
			while ((readBytes = in.read(buffer, 0, buffer.length)) > 0) {
				fileWrite.write(buffer, 0, readBytes);
			}
			
//			boolean end = false;
//			while (!end) {
//				System.out.println("Adnan: " + reader.readLine());
//
//				System.out.print("Msg: ");
//				writer.write(input.nextLine());
//				writer.newLine();
//				writer.flush();
//			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		try {
			FileInputStream readFile = new FileInputStream("Output.jpg");
			
			
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		
		
		
		
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
			File file = new File("output.jpg");
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
