package ba.bitcamp.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 4174007622067117868L;
	
	private String name;
	private Integer age;
	
	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", name, age);
	}
	
	public static void main(String[] args) {
		
		User u1 = new User("John", 26);
		System.out.println("Instanced user: " + u1);
		
		OutputStream os;
		try {
			os = new FileOutputStream("user.dat", true);
			InputStream is = new FileInputStream("user.dat");
			ObjectOutputStream osw = new ObjectOutputStream(os);
			osw.writeObject(u1);
			
			ObjectInputStream ois = new ObjectInputStream(is);
			User fromFile = (User)ois.readObject();
			System.out.println("User from file: " + fromFile);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
