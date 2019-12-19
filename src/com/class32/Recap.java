package com.class32;

public class Recap {
	public static void main(String[] args) {
		
	
	
	// to store single value
	
	int y=10;
	
	// to store multiple values 
	int [] array= {10,20,30};
	
	int [] arr = new int [3];
	arr[0]=100;
	arr[1]=200;
	arr[2]=300;
	
	// to retrieve all values 1 by 1
	// using enhanced loop
	for(int num:arr) {
		System.out.println(num);
	}
	// using for loop
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	// we can store non primitive types:Objects
	
	Fruit f = new Apple();
	Fruit f1=new Banana();
	Fruit f2=new Orange();
	Object monkey=new Monkey();
	
	Object [] mixarray= {f,f1,f2,monkey,"Hello"};// we can store diffrent type of value
	for(Object fr:mixarray) {
		
	}
	
	
		
	}
}
class Monkey extends Object{
	
}
class Fruit extends Object{
	
}
class Apple extends Fruit{
	
}
class Orange extends Fruit{
	
}
class Banana extends Fruit{
	
}


