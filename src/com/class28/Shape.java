package com.class28;

public class Shape {
	double radius;
	public Shape(double radius) {
		this.radius=radius;
	}
	public static void main(String[] args) {
		
			circle obj=new circle(5.1);
			obj.area();
	
	}
}
class circle extends Shape{
	
	circle(double radius){
		super(radius);
	}
	public void area() {
		System.out.println("Area of the circle is "+3.14*radius*radius);
	}
	
	}
