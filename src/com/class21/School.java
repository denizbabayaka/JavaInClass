package com.class21;

public class School {
	public static void main(String[] args) {
		Student.school="Morning school";
		Student student0=new Student();
		student0.displayInfo();
		
		
	   Student student1=new Student();
	   
	   // assigning instance variables
	   student1.studentName="Eric";
	   student1.GPA=3.95;
	   Student.school="Syntax Technologies";// even we assign diffrent vcalues to the school it gets the last one
	   student1.displayInfo();
	   
	   Student student2=new Student();
	   student2.studentName="jaime";
	   student2.GPA=3.90;
	   Student.school="Deniz School"; // only diffrence between 2 method is the  new value of the school which is static
	   student2.displayInfo();
	   
	
	   
	   System.out.println("new value of school");
	   student1.displayInfo();// also student1 school value change accordingly with student2
	   
	   student1.study(3);// this method wants a value from us to assign to the method 
	   
	}
	

}
