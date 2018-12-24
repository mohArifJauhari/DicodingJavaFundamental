package com.jabejo.string;

public class Main {

	public static void main(String[] args) {
		char[] jabejoChar = { 'j', 'a', 'b', 'e', 'j', 'o' };
		String jabejoString = new String(jabejoChar);
		System.out.println(jabejoString);

		String jabejo = "jabejo";
		int length = jabejo.length();
		System.out.println(length);
		char charResult = jabejo.charAt(1);
		System.out.println(charResult);
	}

}
