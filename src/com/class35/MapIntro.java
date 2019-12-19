package com.class35;
import java.util.*;

public class MapIntro {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		// to store key+value pair into map
		map.put(101, "John");
		map.put(102, "Jack");
		map.put(103, "Jane");
		map.put(104, "Jenny");
		System.out.println(map);
		// How to verify if there any elements inside map
		boolean flag = map.isEmpty();
		if (!flag) {
			int size = map.size();
			System.out.println(size);
		}
		// I want to Add more Entry Objects
		// map.put("105" ,"John");---CE : key and value type must be matched
		// adding duplicate values Ok
		map.put(105, "John");
		System.out.println(map);
		// Adding duplicate keys___ Override, we cannot have duplicate keys
		map.put(102, "Hasan");
		System.out.println(map);
		// how to access a value
		String mapElement = map.get(105);
		System.out.println(mapElement);
		// to replace or update the value
		map.replace(103, "Zeynep");
		System.out.println(map);
		// How to remove an Object from a map
		map.remove(101);
		System.out.println(map);
		// how to verify if certain key is exist/exist
		
		boolean flag1=map.containsKey(103);
		
		if(flag1) {
			map.replace (103,"Seval");
			
		}else {
			map.put(103, "Seval");
		}
		//how to verify if certain value is exist
		boolean contains=map.containsValue("Seval");
		System.out.println(contains);

	}
}
