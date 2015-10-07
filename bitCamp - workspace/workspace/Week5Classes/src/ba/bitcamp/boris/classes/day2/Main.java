package ba.bitcamp.boris.classes.day2;

public class Main {
	
	public static void main(String[] args) {
		
//		System.out.println("User count " + User.userCount);
//		
//		User u1 = new User("John", "Doe");
//		System.out.println("User count " + User.userCount);
//		User u2 = new User("Joe", "Bloggs", 22);
//		System.out.println("User count " + User.userCount);
//		
//		User u3 = new User(u1);
//		
//		System.out.println(u1.getName() + " " + u1.getId());
//		System.out.println(u2.getName() + " " + u2.getId());
//		
//		u1.setAge(10);
//		u1.setAge(50);
//		u1.setAge(30);
//		
//		System.out.println(u1);
//		System.out.println(u2);
//		System.out.println(u3);
//		
//		System.out.println(u1.equals(u2));
//		
		
		
		Point p1 = new Point(6, 65);
		//Point p2 = new Point(3, 5);
		Point p3 = new Point(3, 14);
		
		//p1.setX(5);
		//p2.setY(7);
		
//		System.out.println("Distance from " + p1 + " to " + p2 + " is " + p1.distance(p2));
//		
//		System.out.println("Is " + p1 + " equal to " + p2 + " " + p1.equals(p2));
//
//		System.out.println("Distance from " + p1 + " to " + p3 + " is " + p1.distance(p3));

		
		Circle c1 = new Circle(25, p1);
		Circle c2 = new Circle(26 , p3);
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.areConnected(c2);
		
		System.out.println(c1.equals(c2));
	}

}
