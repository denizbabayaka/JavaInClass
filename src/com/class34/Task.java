package com.class34;
import java.util.*;
class Student{
	String name;
	int id;
	Student(String name,int id){
		this.name=name;
		this.id=id;
	}
	public void display() {
		System.out.println("Student name is "+name+" and Student id is: "+id);
	}
}


public class Task {
	
	

	public static void main(String[] args) {
		Set<String>obj=new TreeSet<String>();
		obj.add("Turkey");
		obj.add("Germany");
		obj.add("Holland");
		obj.add("France");
		obj.add("Finland");
		obj.add("Albania");
		
		for(String obj1:obj) {
			System.out.println(obj1);
		}
		System.out.println("__Task 1 second Way_____");
		Iterator<String>obj2=obj.iterator();
		while(obj2.hasNext()) {
			System.out.println(obj2.next());
		}
		Set<String>obj3=new HashSet<String>();
		obj3.add("Istanbul");
		obj3.add("Berlin");
		obj3.add("Amsterdam");
		obj3.add("WAshington");
		obj3.add("Istanbul");
		obj3.add("Istanbul");
		System.out.println("_____2ND Task_____");
		Iterator<String>obj4=obj3.iterator();
		while(obj4.hasNext()) {
			if(obj4.next().startsWith("A")) {
				obj4.remove();
			}
			
		}System.out.println(obj3);
		System.out.println("____3rd Task____");
		
		Set<Student>obj5=new HashSet<Student>();
		obj5.add(new Student("Deniz", 101));
		obj5.add(new Student("Abdil", 102));
		obj5.add(new Student("Mustafa", 103));
		obj5.add(new Student("Jaime", 104));
          Iterator<Student>obj6=obj5.iterator();
          while(obj6.hasNext()) {
        	  obj6.next().display();
          }
	}

}
