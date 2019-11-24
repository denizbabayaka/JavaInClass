package com.class22;

public class StaticVsNonStatic {
	
	// template for a students (school,name,grade)
	
	static String school="Syntax";
	String name;
	char grade;
	// instance method 
	void getInfo() {
		System.out.println("My name is "+name+" and I am going to "+school+" and my grade is "+grade);
		
	}
     // static method 
	static void getInfo1() {
		System.out.println("I am attending classes at "+school);
		//System.out.println("My name is "+name); //can not access non static var inside static method
	
	}
	public static void main(String[] args) {
		// can access static var. or method just by its name in the same class
		System.out.println(school);
		getInfo1();
	}
	
}
