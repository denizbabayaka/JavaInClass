package com.class36;
import java.util.*;
import java.util.Map.Entry;
public class HW {

	public static void main(String[] args) {
		
		Map<Integer,String>map=new TreeMap<>();// will store the values in the ascending order
		map.put(3456,"Mac Laptop");
		map.put(6746,"HP Printer");
		map.put(3468,"Dell Screen");
		map.put(8753,"Samsung TV");
		map.put(1765,"Sony Camera");
		
		Set<Entry<Integer,String>> set=map.entrySet();
		for(Entry<Integer,String>entry:set) {
//			int ent=entry.getKey();
//			String val=entry.getValue();
//			System.out.println(ent+"-->"+val);
			String element=entry.getKey()+entry.getValue();
			System.out.println(element);
		}
		
		System.out.println("--Retrieving key and value using iterator--");
		
		Iterator<Entry<Integer,String>>entryIterator=map.entrySet().iterator();
		while(entryIterator.hasNext()) {
			Entry<Integer,String>singleEntry=entryIterator.next();
			//System.out.println(singleEntry.getKey()+"==="+singleEntry.getValue());
			int key=singleEntry.getKey();
			String value=singleEntry.getValue();
			System.out.println(key+"____"+value);
			
		}
		
		

	}

}
