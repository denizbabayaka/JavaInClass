package com.class36;

import java.util.*;
import java.util.Map.Entry;


public class Task2 {
//	Create a Map from array of cities that will sort keys in alphabetical order. As a key store the 
//	name of the city and as a value store the length of the city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//	If any city name is more than 7 characters remove that city ( use Iterator ). 

	public static void main(String[] args) {
		
		Map<String,Integer>obj=new TreeMap<String, Integer>();
		
		obj.put("Istanbul", 8);
		obj.put("Berlin",6);
		obj.put("Moscow",6);
		obj.put("Washington",10);
		obj.put("Amsterdam",9);
		obj.put("Sofia",5);
		Set<Entry<String,Integer>>obj1=obj.entrySet();
		Iterator<Entry<String,Integer>>obj2=obj1.iterator();
		while(obj2.hasNext()) {
			Entry<String,Integer>obj3=obj2.next();
			String city=obj3.getKey();
			int number=obj3.getValue();
			if(city.length()>7) {
				obj2.remove();
				System.out.println(city+" "+number);
			}
			
		}
			

	
		 }
	}

