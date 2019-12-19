package com.class33;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// create linked list of String object
		LinkedList<String>llist=new LinkedList<String>();
		// adding elements
		llist.add("Hello");
		llist.add("Bye1");
		llist.add("Hello");
		llist.add("Bye");
		llist.add(2,"How are you");
		System.out.println(llist);
		// replace 1 element
		llist.set(1, "Good bye");
		System.out.println(llist);
		//retrieve
		String element=llist.get(2);
		System.out.println(element);
		//update
		llist.set(2, "Hi");
		System.out.println(llist);
		// how to retrieve all values from linked list
		System.out.println("______FOR________");
		
		for(int i=0;i<llist.size();i++) {
			System.out.println(llist.get(i));
		}
		System.out.println("_____Each_____");
		for(String obj:llist) {
			System.out.println(obj);
		}
		
		System.out.println("_____Iterator_____");
		Iterator<String>obj2=llist.iterator();
		
		while(obj2.hasNext()) {
			String obj3=obj2.next();
			System.out.println(obj3);
		}
	

	}

}
