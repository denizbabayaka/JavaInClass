package com.class23;

public class Task {
	//Write a program that will have a constructor: one with parameters and second without any parameters.
    //a separate Test class where you will execute both of the constructors.
	
	String name;
	String school;
	int num;
	
	Task(){
		System.out.println("Without any parameters");
	}

	
	 Task(String name,String school,int num){
		
		name=name;
		school=school;
		num=num;
		System.out.println("My name is "+name+" my school is "+school+" and my number is "+num );
	}
   
     
     public static void main(String[] args) {
    	 Task obj1=new Task("Deniz", "Syntax", 125);
    	 
    	 Task obj=new Task();
    	
    	 
	}
}
