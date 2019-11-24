package com.class17;

public class Car {  // class is a blueprint /template to build objects
// define attributes/features belong to
	// the class car
	// Class is logical entitiy whereas Object is physical entity (something you can touch and feel)
	
	String make, model, color;
	int year, wheels, windows, speed;

	// adding behavior /action-->methods();

	void drive() { // defined in void methods
         System.out.println("I am drive method");
		System.out.println("Car "+make+" can drive");
	}

	void start() {
		System.out.println("I am start method");
		System.out.println("Car "+make+" can start");
	}

	void accelerate() {
		System.out.println("I am accelarate method");
		System.out.println("Car "+make+" can accelerate");
	}

}
