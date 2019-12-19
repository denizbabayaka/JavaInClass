package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	
	String name;
	int studentId;
	
	public Student(String name,int studentId) {
		this.name=name;
		this.studentId=studentId;
	}
	
	public void display() {
		System.out.println("My name is "+name+" and my students id is "+studentId);
	}
}

public class StudentTest {
	public static void main(String[] args) {
		
		//create an array list that will store student type of objects
		
		List<Student>students=new ArrayList<>();
		// creating Student type of Objects
		Student stu=new Student("John", 101);
		Student stu1=new Student("Jane",102);
		Student stu2=new Student("Jack",103);
		
		students.add(stu);
		students.add(stu1);
		students.add(stu2);
		
		// display info of each student
		stu.display();
		stu1.display();
		
		System.out.println("_____Enhanced Loop display_______");
		// for each loop
		for(Student student:students) {
			student.display();
			
		}
		// adding more object of a Student Type
		students.add(new Student("Michael", 104));
		students.add(new Student("David", 105));
		students.add(new Student("Esra", 106));
		
		// display info of each student
		System.out.println("_____While Loop_______");
		Iterator<Student> it=students.iterator();
		
		while(it.hasNext()) {
			it.next().display();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
