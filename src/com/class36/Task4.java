package com.class36;
import java.util.*;
import java.util.Map.Entry;
public class Task4 {

	public static void main(String[] args) {
		
//		Create a Map that will store Employee name and salary. Write a logic to retrieve
//		an employee who gets the highest salary. Output should be in the below format John Smith=$100000
		
		Map<String,Integer>obj=new TreeMap<String,Integer>();
		
		obj.put("John", 100000);
		obj.put("Abdil", 80000);
		obj.put("Mel", 70000);
		obj.put("Hasan", 85000);
		obj.put("Huseyin", 90000);
		
		int s=0;
		Collection<Integer>obj1=obj.values();
		for(Integer i:obj1) {
			if(i>s) {
				s=i;
			}
		}
         System.out.println(s);
         Set<Entry<String,Integer>>obj2=obj.entrySet();
         for(Entry<String,Integer>obj3:obj2) {
        	 if(obj3.getValue()==s) {
        		 System.out.println(obj3);
        	 }
         }

	}

}
