package ba.bitcamp.classes.day1.task1;


public interface Compare {
	
	// variables are public static and have to be initialized
	//int var = 3;

	// abstract method, must be implemented in class that implements class Compare
	int compare(Object o); // must be Object because we don't know which Object will implement this
	
}
