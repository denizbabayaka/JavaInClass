package com.class13;

public class Stringsplit {
	public static void main(String[] args) {

		String str = "Welcome Syntax Students Batch 4";
		// String [] array=str.split("s");// cuts from the first S
		String[] array = str.split(" ");// split after space
		System.out.println("The length of the array is " + array.length);
		for (String substring : array) {
			System.out.println(substring);// cuts from s and print in 3 forms
		}

		String subject = "I love java and I want to learn more";
		// Using space as a delimeter
		// Split returns an array of Strings
		String[] splittedSub = subject.split(" ");
		System.out.println(splittedSub.length);
		for (int i = 0; i < splittedSub.length; i++) {
			System.out.print(splittedSub[i]);
		}

	}
}
