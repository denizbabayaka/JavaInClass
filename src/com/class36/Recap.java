package com.class36;

import java.util.*;
import java.util.Map.Entry;
public class Recap {

	public static void main(String[] args) {
		
		//Create a Map of groceries that will store products and it's quantities and
		//we want maintain the insertion order for keys

		//Map<K,V> variableName=new MapChildObject<>();

		Map<String, Integer> groceryMap=new LinkedHashMap<>();  // Maintains the insertion order
		groceryMap.put("Milk", 2);
		groceryMap.put("Tea",3);
		groceryMap.put("Onion", 5);
		groceryMap.put("Apple",10);

		//retrieve single value
		groceryMap.get("Apple");


		//verify if specific key or value is in the map
		groceryMap.containsKey("Milk");
		groceryMap.containsValue(2);

		//how to retrieve all values?

		Collection<Integer> values=groceryMap.values();
		for (Integer val:values){
			System.out.println(val);
		}

		Iterator<Integer> valIt=values.iterator();

		while(valIt.hasNext()){
		System.out.println(valIt.next());
		}
            // get all keys and map them to values(milk-->2)
		
		//Set<String>keys=groceryMap.keySet();
		for(String k:groceryMap.keySet()) {  //2 nd way
			System.out.println(k.toUpperCase()+"-->"+groceryMap.get(k));
		}
		
		Iterator<String>keyIterator=groceryMap.keySet().iterator();
		while(keyIterator.hasNext()) {
		//	System.out.println(keyIterator.next()+"-->"+groceryMap.get(keyIterator.next()));
			String itKey=keyIterator.next();
			Integer val=groceryMap.get(itKey);
			System.out.println(itKey.toLowerCase()+"--->"+val);
			
			
		}
		   // get all keys and map them to values(milk-->2) using entrySet();
		Set<Entry<String,Integer>> entr=groceryMap.entrySet();
		for(Entry<String,Integer>e:entr) {
			System.out.println(e.getKey()+"--->"+e.getValue());
		}
		
	}

}
