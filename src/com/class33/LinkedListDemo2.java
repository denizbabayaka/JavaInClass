package com.class33;

import java.util.*;

class Sweets{
	String name;
	
	Sweets(String name){
		this.name=name;
	}
	public void iLove() {
		System.out.println("I love "+name);
	}
	
	
	
}




public class LinkedListDemo2 {
	public static void main(String[] args) {
		// create a list of Sweets objects
		
		LinkedList<Sweets> sweetList=new LinkedList<Sweets>();
		sweetList.add(new Sweets("Chocolate"));
		sweetList.add(new Sweets("Cake"));
		sweetList.add(new Sweets("Cookies"));
		sweetList.add(new Sweets("Macaroons"));
		// lets display name of each object
		
		for(Sweets element:sweetList) {
			System.out.println(element.name);
			element.iLove();
		}
		// retrieving 1 element and accessing method (2 steps)
		Sweets mySweet=sweetList.get(2);
		mySweet.iLove();
		// retrieving 1 element and accessing method (1 steps)
		sweetList.get(2).iLove();
		String nameOftheSweet=sweetList.get(2).name;
		System.out.println(nameOftheSweet);
		String str="Hello 123";
		str.replace("123", "456").trim();
		System.out.println(str);
		Integer num=100;
		//100-->"100"--->"200"--->3
		String newNumber=num.toString().replace("100", "200");
		int newNumber1=num.toString().replace("100", "200").length();
		System.out.println(newNumber);
		System.out.println(newNumber1);
		
	}

}
