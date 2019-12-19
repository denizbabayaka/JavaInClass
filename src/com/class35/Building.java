package com.class35;

import java.util.*;

public class Building {

	public static void main(String[] args) {
		
		HashMap<Integer, String>obj=new HashMap<Integer, String>();
		
		obj.put(1, "Google");
		obj.put(2, "Syntax");
		obj.put(3, "Amazon");
		obj.put(4, "Apple");
		obj.put(5, "Visa");
		obj.put(6, "Amex");
		obj.put(7, "ATT");
		
		System.out.println(obj);
		boolean flag = obj.isEmpty();
		if (!flag) {
			int size = obj.size();
			System.out.println(size);
		}
		obj.replace(4, "Yahoo");
		System.out.println(obj);
		obj.remove(7);
		System.out.println(obj);
		 

	}

}
