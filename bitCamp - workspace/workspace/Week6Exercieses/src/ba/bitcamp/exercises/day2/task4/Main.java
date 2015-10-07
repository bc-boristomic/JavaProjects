package ba.bitcamp.exercises.day2.task4;

import ba.bitcamp.exercises.day2.task3.Server;

public class Main {
	
	public static void main(String[] args) {
		
		char[] c = new char[]{'1','2',':','3','4',':','5','6',':','1','2',':','3','4',':','5','6',};
		
		Client cl = new Client("Client", c);
		
		System.out.println(cl);
		
		Server s = new Server("Server", c, 5);
		
		System.out.println(s);
		
		
		System.out.println(cl.getConnectComputer());
		System.out.println(cl.getConnectNetwork());
		
		
		cl.connect(s);
		//cl.connect(s);
		
		cl.disconnect();
		cl.connect(s);
		
	}

}
