package com.class35;

import java.util.*;

public class Recap {

	public static void main(String[] args) {
		
		List<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		Set<String> set = new HashSet<>(aList);
		set.addAll(aList);
		System.out.println(set);
		set.clear();
		System.out.println(aList);
		aList.addAll(set);
		System.out.println(aList);
		////////////////////////////////////
		// How can I access/update just 1 values from the Set Collection
		Set<String> lset = new LinkedHashSet<>();// keeps the order
		lset.add("Morning");
		lset.add("Noon");
		lset.add("Evenining");
		lset.add("Night");
		// Converts to the ArrayList
		List<String> myList = new ArrayList<>();
		myList.addAll(lset);
		String element = myList.get(2);
		System.out.println(element);
		//Another way to create an object of ArrayListby passing values to the constructor
		List<String>myList1= new ArrayList<>(lset);
		
		
		
		
		Set<Double> set1 = new LinkedHashSet<>();
		set1.add(99.99);
		set1.add(90.99);
		set1.add(9.99);
		Iterator<Double> iterator = set1.iterator();
		while (iterator.hasNext()) {
			double d = iterator.next();
			if (d < 50) {
				iterator.remove();
			}
		}
		for (Double d1 : set1)
			System.out.println(d1);
	}

}
