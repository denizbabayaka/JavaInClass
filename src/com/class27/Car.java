package com.class27;

public class Car {
	String make,model; // instance variable of the class which can ba acccessible through object 
	int year;
	
	Car(){
		System.out.println("I am non argument constructor of parent class");
		}
	
	
	
	public void display() {
		System.out.println("We build "+year+" "+make+" "+model);
		
	}
	public static void main(String[] args) {
		
		Car car=new Car();// constructor call happens by the object automatically 
		car.display();//We build 0 null null
		//int num; --> local variables must be initialized
	    //System.out.println(num);
		System.out.println("Object of child class");
		Tesla tesla = new Tesla(); 
		
		
	}

}
class Tesla extends Car{
	boolean autoPilot;
	Tesla(){
		super();// keyword for calling imediate parent  class constructor
		System.out.println("Non argument constructor of the child class");
	}
}
