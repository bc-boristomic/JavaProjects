package ba.bitcamp.exercises.day1.task4;

import java.util.Arrays;

public class StringBuilderCamp {
	
	private char[] chars = new char [0];
	
	
	public StringBuilderCamp(char[] chars) {
		this.chars = chars;
	}
	
	
	public void append(Object o) {
		String s = o.toString();
		char[] temp = new char [chars.length + s.length()];
		for (int i = 0; i < chars.length; i++) {
			temp[i] = chars[i];
		}
		for (int i = 0; i < s.length(); i++) {
			temp[chars.length + i] = s.charAt(i);
		}
		chars = temp;
	}
	
	public void prepend(Object o) {
		String s = o.toString();
		char[] temp = new char [chars.length + s.length()];
		for (int i = 0; i < chars.length; i++) {
			temp[s.length() + i] = chars[i];
		}
		for (int i = 0; i < s.length(); i++) {
			temp[i] = s.charAt(i);
		}
		chars = temp;
	}
	
	public String toString(){
		return Arrays.toString(chars);
	}

	

	static class Inner {
		
				
		static char[] getLarger(int num, char[] chars) {
			return chars = new char [chars.length + num];
			
		}
		
		
		static void getStringInCharArray(String s, int index, char[] array) {
			char[] temp = new char [array.length + s.length()];
			for (int i = 0; i < index; i++) {
				temp[i] = array[i];				
			}
			for (int i = 0; i < temp.length; i++) {
				temp[index + i] = s.charAt(i);
			}
			for (int i = 0; i < temp.length; i++) {
				temp[s.length() + i] = array[i];
			}
		}
		
	}
	

}
