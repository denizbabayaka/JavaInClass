package com.class21;




public class TaskStudent {
	
	String studentName;
	int studentId;
	static int numberof;
	
	void print() {
		
	}
public static void main(String[] args) {
	
	TaskStudent std=new TaskStudent();
	std.studentName="Deniz";
	std.studentId=125555;
	TaskStudent.numberof++;
	std.print();
	
	TaskStudent std1=new TaskStudent();
	std1.studentName="Abdil";
	std1.studentId=198555;
	TaskStudent.numberof++;
	std1.print();
	System.out.println("Student name is  number of student is "+TaskStudent.numberof);
}
}
