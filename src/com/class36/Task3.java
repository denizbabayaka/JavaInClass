package com.class36;

import java.util.Map;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

//Create a Person class with following private fields: name, lastName, age, salary. 
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//In Test Class create a Map that will store key in ascending order. In that map store personId and a Person
//. Print each object details.


class Person{
	
private	String name;
private	int age;
private	int salary;
	
	Person(String name,int salary,int age){
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	
	public void display() {
		System.out.println(name+" "+age+" "+salary);
	}
	
}
public class Task3 {
	public static void main(String[] args) {
		Map<Integer,Person>obj=new TreeMap<Integer, Person>();
		
		obj.put(1, new Person("Deniz Babayaka", 100000, 43));
		obj.put(2, new Person("Abdil Abi", 120000, 42));
		obj.put(3, new Person("Asim Abi", 150000, 45));
		Set<Integer>obj2=obj.keySet();
		//Set<Entry<String, Integer>> entrySet = classRoom.entrySet();
		for(Integer obj3:obj2) {
			System.out.print("Person id :"+obj3+" ");
			obj.get(obj3).display();
	}
	}
}
