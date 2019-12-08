package com.class27;

public class Examples {
	
	public String helloName(String str) { // overloading in the same class overridden in different class 
		return str;
		
	}
     public String helloName(String str,String str2) {
    	 return str+" "+str2;
     }
   
}

class smallExample extends Examples{
	 
	public String helloName(String str) {// overriding in child class 
		return "Hello "+ str;
	}
	
}