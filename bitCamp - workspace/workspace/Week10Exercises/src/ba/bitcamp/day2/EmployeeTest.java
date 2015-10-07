package ba.bitcamp.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;

public class EmployeeTest {

	public static void main(String[] args) throws FileNotFoundException {

		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("employees.txt"));

			for (int i = 0; i < 10; i++) {
				
				LinkedList<Employee> temp = (LinkedList<Employee>) ois.readObject();
				System.out.println(temp);
			}

		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

	}

}
