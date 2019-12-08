package com.class28;
/* super -- refers to imediate parent class instance
 * super keyword that is used 
 * super.with variables and methods
 * super() -->to call a parent class constructor
 */


public class Car {
	String make,model;
	
	Car(){
		System.out.println("I am a non argument parent  constructor");
	}
	
	Car(String make,String model){
		this.make=make;
		this.model=model;
		System.out.println("Car "+make+" "+model+" has an autopilot ");
	}

}
class Tesla extends Car{
	boolean autopilot;
	
	Tesla(){
		super();
		System.out.println("I am a child non argument constructor  ");
	}
	Tesla(String make,String model,boolean autopilot){
		super (make,model);// constructor call
		this.autopilot=autopilot;
	}
	public void displayInfo() {
		System.out.println("Car "+make+" "+model+" has an autopilot "+autopilot);
	}
}