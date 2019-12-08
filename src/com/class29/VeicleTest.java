package com.class29;

public class VeicleTest {
	public static void main(String[] args) {

		BMW bmw = new BMW("767jbh676", "Sedan", "BMW", "X5");
		bmw.displayTotal();
		// come from vehicle class
		bmw.drive();
		bmw.stop();
		bmw.speed();
		bmw.start();
		// come from car class
		bmw.breaking();
		// come from bmw class
		bmw.display();

		Car car = new BMW("767jbh676", "Sedan", "BMW", "X5");
		// come from vehicle class
		car.drive();
		car.stop();
		car.speed();
		car.start();
		// come from car class
		car.breaking();
		// come from bmw class
		// car.display(); can not accsess because belong to bmw class

		Vehicle vehicle = new BMW("767jbh676", "Sedan", "BMW", "X5");
		// come from vehicle class
		vehicle.drive(); // only accses its own methods
		vehicle.stop();
		vehicle.speed();
		vehicle.start();
		// come from car class
		// vehicle.breaking();
		// come from bmw class
		// vehicle.display();

	}

}
