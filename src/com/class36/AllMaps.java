package com.class36;
import java.util.*;
public class AllMaps {

	public static void main(String[] args) {
		
		Map<Integer,String>hashmap=new HashMap<>();
		hashmap.put(1,"Monday");
		hashmap.put(2,"Tuesday");
		hashmap.put(3,"Wednesday");
		hashmap.put(4,"Thursday");
		hashmap.put(5,"Friday");
		hashmap.put(8,"Friday");
		hashmap.put(null,"Saturday");
		hashmap.put(9,"null");
		hashmap.put(10,null);
		System.out.println(hashmap);
		
		Map<Integer,String>linkedhashmap=new LinkedHashMap<>();
		linkedhashmap.put(1,"Monday");
		linkedhashmap.put(2,"Tuesday");
		linkedhashmap.put(3,"Wednesday");
		linkedhashmap.put(4,"Thursday");
		linkedhashmap.put(5,"Friday");
		linkedhashmap.put(8,"Friday");
		linkedhashmap.put(null,"Saturday");
		linkedhashmap.put(9,"null");
		linkedhashmap.put(10,null);
		System.out.println(linkedhashmap);

		
		
		Map<Integer,String>treemap=new TreeMap<>();
		treemap.put(1,"Monday");
		treemap.put(8,"Friday");
		treemap.put(2,"Tuesday");
		treemap.put(3,"Wednesday");
		treemap.put(4,"Thursday");
		treemap.put(5,"Friday");
		//treemap.put(null,"Saturday");
		treemap.put(9,"null");
		treemap.put(10,null);
		System.out.println(treemap);
	}

}
