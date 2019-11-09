package com.class12;

public class StringManipulationDemo {

	public static void main(String[] args) { // String is a class which sequence of character

		// There are two ways of to create string objects.
		// 1 method
		// String Literal

		String name = "John";
		System.out.println(name);

		System.out.println(name.length());

		// 2 method
		// Create an object new key word
		String name1 = new String("John1");

		/*
		 * this method returns the length of this string. The length is equal to the
		 * number of 16-bit unicode characters in the string.
		 */

		int name1Len = name.length();
		System.out.println("The length of name1Len is= " + name1Len);

		String str1 = "Hello woRld";
		System.out.println("Before :"+str1);
		str1 = str1.toLowerCase(); // lowecase method
		System.out.println("After :" + str1); // chenge to capitol letters to small letters
		
		//.equals()
		String str2="HElLo WrLd";
		 boolean isEqual=str2.equals(str2);
		 System.out.println(isEqual);
		 //.equalsIgnoreCase();
		 
		 System.out.println(str2.equalsIgnoreCase(str2));
		 
		 String str4="Mohammad";
		 System.out.println("Before:"+str4);
		 str4=str4.toUpperCase();
		 System.out.println("After :"+str4);

	}

}
