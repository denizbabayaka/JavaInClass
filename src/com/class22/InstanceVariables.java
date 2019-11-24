package com.class22;

public class InstanceVariables {
	
	String name="Samir"; // instance variables
	
	public static void main(String[] args) {
		
		String name="Burcu"; // Local variable 
		System.out.println(name);
		
		InstanceVariables obj=new InstanceVariables();
		
		System.out.println(obj.name);
		// changing value of instance variable
		obj.name="Deniz";
		System.out.println(obj.name);
		// creating a new instance of Class InstanceVariables
		InstanceVariables obj1=new InstanceVariables();
		// value will be samir 
		System.out.println(obj1.name);
	}
	

}
