package com.class31;

public class Circle implements Shape  {
	final double  pi=3.14;
	double radius;
	
	
	public Circle(double radius) {
		
		this.radius=radius;
	}


	public double calculateArea() {
		return pi*radius*radius;
		
	}

	@Override
	public double  calculatePeremiter() {
		return 2*pi*radius;
		
	}
	

}
 class Square implements Shape {
	 
	 double side;
	 
	 public Square(double side) {
		 this.side=side;
	 }

	@Override
	public double calculateArea() {
		return side*side;
		
	}

	@Override
	public double  calculatePeremiter() {
		return 4*side;
		
	}
	
}