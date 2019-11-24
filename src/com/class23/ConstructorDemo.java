package com.class23;

public class ConstructorDemo {

	ConstructorDemo() { // exact name as your class name and no return type
		System.out.println("I am your constructor."); // first execute inside constructor
	}

	ConstructorDemo(String str) {
		System.out.println("I am constructor with 1 parameter " + str);
	}

	ConstructorDemo(int num) {
		System.out.println("I am constructor with 1 parameter " + num);
	}

	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo(); // we are calling the method inside the class
		System.out.println("Code after creating constructor.");
		obj.hello();
		ConstructorDemo obj1 = new ConstructorDemo("Deniz");
		ConstructorDemo obj2 = new ConstructorDemo(123);
	}

	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello Instructor");
	}
}
