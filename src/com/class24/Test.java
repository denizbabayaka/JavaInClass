package com.class24;

public class Test {
	public static void main(String[] args) {
		
		Child1 obj=new Child1();
		System.out.println(obj.race);
		System.out.println(obj.hairColor);
		System.out.println(obj.eyeColor);
		obj.sing();
		obj.code();
		obj.paint();
		Child1 obj1=new Child1();
		System.out.println(obj1.race);
		System.out.println(obj1.hairColor);
		System.out.println(obj1.eyeColor);
		obj1.sing();
		obj1.code();
		obj1.paint();
		
		
			
		
		Parent parent =new Parent();
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		System.out.println(Parent.race);
		parent.sing();
		
		Parent parent1=new Parent();
		System.out.println(parent1.hairColor);
		System.out.println(parent1.eyeColor);
		System.out.println(Parent.race);
		
		
		
	}
}
