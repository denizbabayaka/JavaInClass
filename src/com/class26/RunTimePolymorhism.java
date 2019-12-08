package com.class26;

public class RunTimePolymorhism {

	public static void main(String[] args) {
		
		Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		System.out.println("____________________");
		
		Cat cat=new Cat();
		cat.sleep();
		cat.eat();
		cat.meow();
		System.out.println("___________________________");
		
		
		double d=90;// widening
		int i=	(int)1.99;//narrowing
		
		// non primitive type casting 
		// widening--> creating object of the child 
		//class giving reference to parent class
		Animal obj=new Cat();// runtime polymorphism
		// narrowing 
		// Cat obj2=new Animal();--> Cannot convert from animal to CAT
		obj.eat();// coming from parent 
		obj.sleep();// this method will come from child class Runtime execution
		// obj.meow();compiler error-->method won't available
		
		
		
		
		

}
}