package com.class33;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class HomeWork {
	/*Create an arrayList of cars and retrieve all the values 
	 * using 3 different ways
	 */

	public static void main(String[] args) {
		List<String>car=new ArrayList<String>();
		car.add("Toyota");
		car.add("Mazda");
		car.add("Lexus");
		car.add("BMW");
		System.out.println("____First way________ ");
		
		for(int i=0;i<car.size();i++) {
			System.out.println(car.get(i));
		}
		System.out.println("____Second way________ ");
		for(String car1:car) {
			System.out.println(car1);
		}
		System.out.println("____Third way________ ");
		Iterator<String> it=car.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
