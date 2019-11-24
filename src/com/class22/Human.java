package com.class22;

public class Human {
	// instance variable inside the class outside the method
	String name; 
	String lastName;
	// static variables
	static int eyes=2;
	static int nose=1;
	static boolean brain=true;

	public static void main(String[] args) {

		Human human1 = new Human();
		human1.name = "John";
		human1.lastName = "Smith";
		System.out.println("Printing static var.");
		System.out.println(Human.eyes);
        System.out.println(human1.nose);
        System.out.println(brain); // inside the  same class we can accsess static var.just with its name 
        
		Human human2 = new Human();
		human2.lastName = "JImmy";
		human2.lastName = "Miller";
		human2.lastName="Doe";
		System.out.println(human2.lastName);

	}

}
