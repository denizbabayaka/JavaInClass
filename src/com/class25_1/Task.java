package com.class25_1;

public class Task {
	
	public void display(int lenght,int height) {
		System.out.println("Area of rectangle is "+(lenght*height));
	}
    
	public void display(int num) {
		System.out.println("Area of square is "+(num*num));
	}
	public void display (int num,int num1,int num2 ) {
		System.out.println("Volume  of box is "+(num*num1*num2));
	}
	
	public static void main(String[] args) {
		Task obj=new Task();
		
		obj.display(7, 5);
		obj.display(4);
		obj.display(5, 7, 9);
	}
}
