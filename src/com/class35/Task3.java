package com.class35;
import java.util.*;
import java.util.Map.Entry;
public class Task3 {

	public static void main(String[] args) {
		
		Map<Integer,String>obj=new TreeMap<Integer, String>();
		obj.put(123456, "Printer");
		obj.put(568457, "Computer");
		obj.put(896457, "Mouse");
		obj.put(569778, "TV");
		
		Set<Entry<Integer,String>>obj1=obj.entrySet();
		//Set<Entry<String, Integer>> entrySet = classRoom.entrySet();
		for(Entry<Integer,String>obj3:obj1) {
			System.out.println(obj3.getKey()+":"+obj3.getValue());
		}
		
		Iterator<Entry<Integer,String>>obj4=obj1.iterator();
		while(obj4.hasNext()) {
			Entry<Integer,String> obj5=obj4.next();
			String entry=obj5.getKey()+"----"+obj5.getValue();
			System.out.println(entry);
		}
		

	}

}
