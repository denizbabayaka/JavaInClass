package com.class34;

import java.util.*;

public class iteratorUsage {
	public static void main(String[] args) {

		List<String> stringList = new ArrayList<String>();

		stringList.add("Esra");
		stringList.add("Hasan");
		stringList.add("Ak");
		stringList.add("Salim");
		stringList.add("Ak");
		stringList.add("Salim");
		stringList.add("Deniz");
		stringList.add("Mel");

		// removes names that are shorter than 4 character
		stringList.remove(2);
		System.out.println(stringList);
		for(int i=0;i<stringList.size();i++) {
			if(stringList.get(i).length()<=4) {
				stringList.remove(i);
			
			}
			
		}
		System.out.println(stringList);
		// best way to remove an element from a collection --->Iterator
		
		List<String> stringList1 = new ArrayList<String>();

		stringList1.add("Esra");
		stringList1.add("Hasan");
		stringList1.add("Ak");
		stringList1.add("Salim");
		stringList1.add("Ak");
		stringList1.add("Salim");
		stringList1.add("Deniz");
		stringList1.add("Mel");
		
		Iterator<String>it=stringList1.iterator();
		
		while(it.hasNext()) {
			if(it.next().length()<=4) {
				it.remove();
			}
		}
		System.out.println(stringList1);
	}
}
