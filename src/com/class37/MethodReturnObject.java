package com.class37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MethodReturnObject {

	public static void main(String[] args) {
		//create a method that will return an Object
		
		List<String>list=returnList("Hello", "Bye");
		System.out.println(list);
		Map<String,String>map=returnMap("Deniz", "Babayaka", "Ebru", "Arbak");
		System.out.println(map);

	}
     // create a method that will return an object of Scanner Class
	
	public static Scanner returnScanner() {
		Scanner scan=new Scanner(System.in);
		return scan;
	}
	// create a method that will return an Object of ArrayList Class
	
	public static List<String> returnList(String str,String str1) {
		List<String>list=new ArrayList<>();
		list.add(str);
		list.add(str1);
		return list;
	}
	// create a method that will return an Object of MapClass
	public static Map<String,String> returnMap(String key,String value,String key1,String value1) {
		Map<String,String>map=new HashMap<>();
		map.put(key, value);
		map.put(key1, value1);
		return map;
	}
	
	
}
