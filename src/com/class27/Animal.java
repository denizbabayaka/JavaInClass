package com.class27;

public class Animal {
	Animal(){
		System.out.println("Animal constructor"); // when we create the object constructors automatically
	}                                             // executed
	public static void whoAmI() {
		System.out.println("I am an  animal");
	}

}
class Monkey extends Animal{
	
	Monkey(){
		System.out.println("I am a child class constructor");
	}
	
	//public void whoAmI() { can not override static methods with instance methods
	//	
	//}
	
	public static void whoAmI() { // we can not override static methods when both the same in parent and child class
		// method hiding 
		System.out.println("I am a monkey");
	}
	
}