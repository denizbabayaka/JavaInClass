package com.class20;

public class Canada {
public static void main(String[] args) {
	
	USA us1=new USA();
	System.out.println("Access from Canada classs");
	System.out.println(us1.mainState);
	System.out.println(us1.scholl);
	//System.out.println(us1.capitalCiyt); this variable is private in USA class
}
}
