package com.class29;

public abstract class Vehicle { // we do not need constructor for abstract class but we can create one no issue
	String vinNumber;
	static int totalVehicles;
	Vehicle(String vinNumber){
		this.vinNumber=vinNumber;
		totalVehicles++;
	}
	
	
	
	public void drive() {
		System.out.println("Vehicle can drive");// defined methods in abstract class
	}
    public void stop() {
    	System.out.println("Vehicle can stop");
    }
    public static void displayTotal() {
    	System.out.println("Total vehicles we build= "+totalVehicles);
    }
    public abstract void start();// undefined methods in abstract class
     abstract void speed();
    
}
abstract class Car extends Vehicle{
	
	String carType;
	
	Car(String vinNumber,String carType){
		super(vinNumber);// super has to be the first line calling immediate parent constructor
		this.carType=carType;
	}
	
	public void speed() { 
		System.out.println("Max car speed up to 400");
	}
	public abstract void breaking();
	
	
	
}

class BMW extends Car{
	
	String make,model;
	
	BMW(String  vinNumber,String carType,String make,String model){
		super( vinNumber, carType);
		this.make=make;
		this.model=model;
	}

	@Override
	public void start() {
		System.out.println("BMW starts remote");
		
	}

	@Override
	public void breaking() {
		System.out.println("BMW can break");
		
	}
	public void display() {
		System.out.println("We build "+make+" "+model+" with vin# "+vinNumber);
	}
	
}
