package com.class23;


public class Student {
	
//	Write a java program of Class Students that takes students name and 3 subject grades. Inside your class also 
//   a method to Calculate Average Grade. Test Student class for 5 different students with different marks. 
//   your program should print an average mark of each students name.
//	NOTE: please use different names for instance and local variables.
	
	String name;
	int math;
	int bio;
	int comp;
	int avarage;
	Student(String sName,int a,int b,int c){
		name=sName;
		math=a;
		bio=b;
		comp=c;
		display();// constructor will execute the display() method
	}
	public int avarage() {
		avarage=(math+bio+comp)/3;
		return avarage;
	}
	public void display() {
		avarage();// display() method gets the value from avarage method
		System.out.println(name+" 's avarage grade is "+avarage);
	}
	
public static void main(String[] args) {
	
	Student obj=new Student("deniz", 65, 56, 45);
	Student obj1=new Student("Ali", 65, 85, 45);
	Student obj2=new Student("Veli", 52, 65, 45);
}
}
