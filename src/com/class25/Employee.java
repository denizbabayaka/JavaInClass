package com.class25;

public class Employee {  // singlke base class
	
	
	int salary;
	 static String companyName;
	
	void work() {
		System.out.println("I work in "+companyName+" company");
	}
     void getPaid() {
    	 System.out.println("I get paid "+salary);
     }
}
