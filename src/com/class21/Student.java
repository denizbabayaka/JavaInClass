package com.class21;

public class Student {
	
	public String studentName;
	public double GPA;
	public static String school;// with static this variable belongs to the class not to the object 
	
	public void displayInfo() {
		System.out.println(studentName+" attending "+school+" has a GPA of "+GPA);
	}
	
	protected void study(int hours) {
		System.out.println(studentName+" Studying for "+hours+" hours.");
	}

}
