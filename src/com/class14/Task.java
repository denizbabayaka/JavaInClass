package com.class14;

public class Task {

	public static void main(String[] args) {
		
		String name=" Welcome to the United States of America";
		
	System.out.println(name.replaceAll("\\s", ""));

		String name2="Hello123$%&";
		String name3=name2.replaceAll("[^a-zA-Z]","" );
		System.out.println(name2.length());
		
		String name4="Is it saturday?Is it raining ? do we have a java class today?";
		
		String [] name5=name4.split("\\?");
		System.out.println(name5.length);
			
		
		
		
		
	}

}
