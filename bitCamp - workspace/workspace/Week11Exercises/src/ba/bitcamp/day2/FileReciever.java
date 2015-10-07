package ba.bitcamp.day2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class FileReciever {
	
		public static void main(String[] args) {

			try {
				
				Socket socket = new Socket();
				socket.connect(new InetSocketAddress("10.0.82.98", 7777));

				InputStream in = socket.getInputStream();
				
				File file = new File("file.txt");
				FileOutputStream fileWrite = new FileOutputStream(file);
				
				byte[] buffer = new byte[1024];
				int readBytes = 0;
					
				while ((readBytes = in.read(buffer, 0, buffer.length)) > 0) {
					fileWrite.write(buffer, 0, readBytes);
				}
				
				fileWrite.flush();
				fileWrite.close();


			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			

	}

}
