package ba.bitcamp.twoservers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class NormalServer {
	
	protected static Set<String> ips = new TreeSet<String>();
	
	
	public static void main(String[] args) {
		
//		
//		try {
//			Socket m = new Socket("10.0.82.25", 5432);
//			
//			InputStream in = m.getInputStream();
//			
//			File file = new File("file4.txt");
//			FileOutputStream fileWrite = new FileOutputStream(file);
//			
//			byte[] buffer = new byte[1024];
//			int readBytes = 0;
//				
//			while ((readBytes = in.read(buffer, 0, buffer.length)) > 0) {
//				fileWrite.write(buffer, 0, readBytes);
//			}
//			
//			fileWrite.flush();
//			fileWrite.close();
//		} catch (IOException e1) {
//			System.out.println("FileWrite error....");
//			return;
//		}
		
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("Started server");
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();

			while (true) {
				Socket client = server.accept();
				String clientIP = client.getInetAddress().getHostAddress();
				
				FileInputStream is = new FileInputStream(new File("somefile.out"));
				OutputStream writer = client.getOutputStream();
				
				byte[] buffer = new byte[1024];
				int read;
				while ((read = is.read(buffer, 0, buffer.length)) > 0) {
					writer.write(buffer, 0, read);
					writer.flush();
				}
				
				ips.add(clientIP);
				BufferedWriter fileWrite = new BufferedWriter(new FileWriter("downloaded.txt"));
				for (String string : ips) {
					fileWrite.write("IP: " + string + " download file at: "
							+ dateFormat.format(date));
					fileWrite.newLine();
					fileWrite.flush();
				}
				fileWrite.close();
				client.close();
			}
			
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
