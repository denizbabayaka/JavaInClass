package com.class34;

import java.util.*;

public class SetFamilyMembers {

	public static void main(String[] args) {
		//It does not allow duplicates and orders its elements based on
		// the order in which they were inserted.
		Set<String> fruitSet = new LinkedHashSet<>();
		//Set<String> fruitSet = new TreeSet<>();// TreeSet sorts the element in the ascending order while HashSet does not
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Kiwi");
		fruitSet.add("Grape");
		fruitSet.add("Pinapple");
		fruitSet.add("Banana");
		System.out.println(fruitSet.size());
		System.out.println(fruitSet);
		//sorts the collection in the ascending order (0-9,A-Z)while HashSet does not
		//do not allow duplicates
		Set<Integer>tset=new TreeSet<>();
		tset.add(200);
		tset.add(2000);
		tset.add(20);
		tset.add(999);
		tset.add(0);
		tset.add(999);
		tset.add(0);
		System.out.println(tset.size());
		System.out.println(tset);
		// Adding collection into a collection
		List<String>list=new ArrayList<>();
		list.add("Java");
		list.add("Selenium");
		list.add("TestNg");
		
		
		
		
		Set<String>linkedSet=new TreeSet<String>();
		linkedSet.addAll(fruitSet);// adds all the collection
		linkedSet.addAll(list);
		System.out.println("_____Objects from both collections");
		
		System.out.println(linkedSet);
		
	

		
		
		
	}

}
