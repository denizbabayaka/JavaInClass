package com.class33;
import java.util.*;
public class HashSetDemo2 {

	public static void main(String[] args) {
		
		// create a collection that will store Sweets type of objects and
		// i do not care about the order as lon as I do nat have duplicate objects
		
		Set<Sweets> sweetSet = new HashSet<>();//HashSet it does not allow duplicates
		Sweets sweet=new Sweets("Cake");
		sweetSet.add(sweet);
		sweetSet.add(new Sweets("cookies"));
		sweetSet.add(new Sweets("IceCream"));
		sweetSet.add(new Sweets("Baklava"));
		sweetSet.add(new Sweets("Macaroons"));
		sweetSet.add(new Sweets("Chocalate"));
		sweetSet.add(sweet);
		
		System.out.println(sweetSet.size());// 6 sweet duplicate 
		System.out.println("________1 Way");
		for(Sweets element:sweetSet) {
			System.out.println(element.name);
		}
		System.out.println("___2 Way_____");
		
		Iterator<Sweets>it=sweetSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().name);
			
			
					
		}

	}

}
