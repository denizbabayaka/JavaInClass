package com.class32;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {
		ArrayList<String>strList=new ArrayList<String>();
		strList.add("Sveta");
		strList.add("Sasha");
		strList.add("Mohammad");
		strList.add("Zeynep");
		if(!strList.isEmpty()) {
			int mySize=strList.size();
			for(int y=-0;y<mySize;y++) {
				System.out.println(strList.get(y));
				System.out.println("_____________");
			}
			  System.out.println(mySize);
		}
         
	}

}
