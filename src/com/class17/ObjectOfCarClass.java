package com.class17;

public class ObjectOfCarClass {

	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.make="Tesla";
		car1.model="S3";
		car1.color="Black";
		car1.year=2020;
		car1.wheels=4;
		car1.windows=5;
		car1.speed=200;
		// accessing behavior for second object 
		car1.drive();  // those are methods we defined in class 
		car1.accelerate();// calling method inside the class
		car1.start();
		System.out.println("I have "+car1.color+" "+car1.make);
		
		
		
		System.out.println("===================");
		Car car2=new Car();
		car2.make="BMW";
		car2.model="I8";
		car2.color="Purple";
		car2.year=2019;
		car2.wheels=4;
		car2.windows=6;
		car2.speed=300;
		
		car2.drive();
		car2.start();
		car2.accelerate();
		
		// print features of the car
		
		
         // I drive bmw 2019
		System.out.println("I drive "+car2.make+" "+car2.model);
	}

}
