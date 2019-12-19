package com.class34;

import java.util.*;

public class HashSetDemo {
public static void main(String[] args) {
	
	// lets create a collection of veegetables where  I do not want to have duplicates
	// hset order of the elements is not preserved
	
	HashSet<String>hset=new HashSet<>();// does not allow override
	// storing values into hashset
	hset.add("cucumber");
	hset.add("onion");
	hset.add("pepper");
	hset.add("zuccini");
	hset.add("carrot");
	hset.add("zuccini");
	System.out.println(hset.size());
	System.out.println(hset);
	
	// they do not have any methods to retrieve elements from the collection
	//.get();,set(); does not have 
	// how can we retrieve all elements
	Iterator<String>it=hset.iterator();
	while(it.hasNext()) {
		String str=it.next();
		System.out.println(str);
	}
	System.out.println("________________");
	for(String element:hset) {
		System.out.println(element);
	}
	
	
	
}
}
