package com.class27;

public  class FinalKeyword { //public  final class FinalKeyword { if you make your class final it can
	//not be inherited by a child classes 
	
	public  final String str="Hello"; // can use accsess modifier inside the class
	public static void main(String[] args) {

		String str="I am awesome";
		str="I am cool";
		System.out.println(str);
		
		final String finalString="Java is easy";// final makes String  variable nonmodifiable (constant)
	//	finalString="Java is hard";//CE
		final int age=120;
		//age=100; CE
		FinalKeyword obj=new FinalKeyword();
		System.out.println(obj.str);
	}
    
      public final void hello() {
    	  System.out.println("I am a final method in Parent class");
      }
      public final void hello(int num) {// can overload a final method 
    	  System.out.println("I am a final method in Parent class");
      }
}
class FinaKeywordChild extends FinalKeyword{
//	public final void hello() { CE:  final methods can not be overridden 
//		System.out.println();
//	}
	
	
}
