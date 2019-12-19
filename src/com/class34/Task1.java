package com.class34;
import java.util.*;
public class Task1 {

	public static void main(String[] args) {
		List<String>aList=new ArrayList<>();
		
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jane");
		System.out.println(aList);
		
		System.out.println("___First Way___");
		Set<String>hset=new TreeSet<String>();
		hset.addAll(aList);
		System.out.println(hset);
		System.out.println("___Second Way___");
		
		Iterator<String> itr=aList.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			int count=0;
			for(int i=0;i<aList.size();i++) {
				if(s.equals(aList.get(i))) {
					count++;
				}
			}
			if(count>1) {
				itr.remove();
			}
		}
	
       System.out.println(aList);
	}

}
