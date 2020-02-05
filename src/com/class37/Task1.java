package com.class37;

import java.util.*;
import java.util.Map.Entry;

public class Task1 {
	public static void main(String[] args) {
		
		Map<String,Integer> map=new LinkedHashMap<>();
		map.put("John", 30000);
		map.put("Khan", 40000);
		map.put("Ashley", 35000);
		map.put("Yasmin", 60000);
		map.put("John Smith", 100000);
		Set<String>empSet=map.keySet();
		String MaxEmp_Name="";
		String Emp_Name;
		double Max_Salary=0;
		double salary=0;
		Iterator<String>it=empSet.iterator();
		while(it.hasNext()) {
			Emp_Name=it.next();
			salary=map.get(Emp_Name);
			if(salary>Max_Salary) {
				Max_Salary=salary;
				MaxEmp_Name=Emp_Name;
			}
		}
		System.out.println(MaxEmp_Name+"+"+Max_Salary);
		
		String [] city= {"Istanbul","Irvine","Venice","Tokyo","Niamey","Luxemburg"};
		Map<String,Integer>cityMap=new TreeMap<>();
		for(String s1:city) {
			cityMap.put(s1, s1.length());
		}
		System.out.println(cityMap);
		
		Set<Entry<String,Integer>> cities=cityMap.entrySet(); // .entrySet();retturns keys and values
		Iterator<Entry<String,Integer>> itr=cities.iterator();
		while(itr.hasNext()) {
			Entry<String,Integer> e=itr.next();
			Integer length=e.getValue();
			String name=e.getKey();
			if(length>7) {
				itr.remove();
			}
			
		}
		System.out.println(cityMap);
		
		
		
		
		
		
		
	}

}
