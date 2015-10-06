package ba.bitcamp.homeworkclasses17.task2;

public class Main {

	public static void main(String[] args) {

		DynamicString ds = new DynamicString(8, "string");

		System.out.println(ds);

		ds.addElement("word");
		System.out.println(ds);

		String[] array = { "qwerty", "asdfgh", "zxcvbn" };
		ds.addElements(array);
		System.out.println(ds);

		ds.removeQuick(10);
		System.out.println(ds);

		ds.removeSlow(9);
		System.out.println(ds);

	}

}
