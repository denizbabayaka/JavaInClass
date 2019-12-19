package com.class35;
import java.util.*;
public class RetrieveAll {

	public static void main(String[] args) {
		//create a map of a person (name,lastName,adress,city,state)
		
		Map<String,String> personMap=new LinkedHashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Adress", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "Tx");
		System.out.println(personMap);
		// how to retrieve a specific value?
		String value=personMap.get("State");
		System.out.println(value);
		
		// how to retrieve all keys and all values
		System.out.println("_____Printing all keys_____");
		
		Set<String>keys=personMap.keySet();
		for(String key:keys) {
			System.out.println(key+":"+personMap.get(key));
		}
		
		Iterator<String>keysiterator=keys.iterator();
		while(keysiterator.hasNext()) {
	       // System.out.println(keysiterator.next()+":"+personMap.get(keysiterator.next()));
	        
	        String mapKey=keysiterator.next();
	        String mapValue=personMap.get(mapKey);
	        System.out.println(mapKey+"_"+mapValue);
		}
		
		
		System.out.println("_____Printing all Values_________");
		Collection<String>values=personMap.values();// if any duplicate value than we must use collection
		for(String val:values) {
			System.out.println(val);
		}
		Iterator<String>valuesIterator=values.iterator();
		while(valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());
			
	
		}
		
		
	}
	}
