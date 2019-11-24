package com.class24;

public class Task {
	
	private Task() {
		
		
		System.out.println("This is private constructor");
	}
	public Task(String str) {
		
		
		System.out.println("This is public constructor");
	}
	 Task(int num) {
		
		
		System.out.println("This is default constructor");
	}
	protected Task(int num,int num1) {
		
		
		System.out.println("This is protected constructor");
	}
	
	//static Task() {  we can not use static for constructor 
		
	//}
	
	
   public static void main(String[] args) {
	
	   Task obj=new Task();
	   Task obj1=new Task(5);
	   Task obj2=new Task("Deniz");
	   Task obj3=new Task(5, 4);
	   
}
}
