package com.class17;

public class Dog {

	String brand,loyal;
	
	void bark() {
		System.out.println("My "+brand+" can bark.");
	
	
	}
	
	void tail() {
		System.out.println("My "+brand+" can swing tail.");
	}
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.brand="Husky";
		dog1.loyal="Yes";
		System.out.println("I love my "+dog1.brand);
		dog1.bark();
		dog1.tail();
		
		Dog dog2=new Dog();
		dog2.brand="Bulldog";
		dog2.loyal="Yes";
		System.out.println("I love my "+dog2.brand);
		dog2.bark();
		dog2.tail();
		
		Dog dog3=new Dog();
		dog3.brand="Labrador";
		dog3.loyal="Yes";
		System.out.println("I love my "+dog3.brand);
		dog3.bark();
		dog3.tail();
		
		
	}
	
	
	
	
	
}
