package com.class27;

public class Student {
	
	public void student() {
		System.out.println("I am a student in Virginia");
	}
    public void  student1() {
    	System.out.println("I am studying my lessons");
    }
    public static void main(String[] args) {
		Student obj=new SyntaxStudent();
		obj.student();
		obj.student1();
		
		Student obj1=new CollegeStudent();
		obj1.student();
		obj1.student1();
		Student obj2=new SchoolStudent();
		obj2.student();
		obj2.student1();
		System.out.println("++++++++++++++");
		
		Student[] std= {obj,obj1,obj2};
		
		for(Student std1:std) {
			std1.student1();
			std1.student();
		}
		
		
	}
}
  class SyntaxStudent extends Student{
	public void student1() {
		System.out.println("I am studying  in Syntax ");
	}
	public void major() {
		System.out.println("I am studying JAVA");
	}
	public void taecher() {
		System.out.println("My java teacher is Asel");
	}
}
 class CollegeStudent extends Student{
	public  void student1() {
		System.out.println("I am stuydying in George Town");
	}
}
 class SchoolStudent extends Student{
	public void student1() {
		System.out.println("I studying in CLF");
	}
}
