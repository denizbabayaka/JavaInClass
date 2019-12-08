package com.class25_1;

public class ConstructorOverLoading {
	//different amount of parameters
	
      public ConstructorOverLoading() {
		System.out.println("I am non-argument constructor");
	}
      ConstructorOverLoading(String str){
    	  System.out.println("I am String -argument constructor");
      }
      
      // having different type of parameters
       ConstructorOverLoading(int num){
    	   System.out.println("I am constructor with 1 int param ");
       }
       public static void main(String[] args) {
		ConstructorOverLoading obj=new ConstructorOverLoading();
		ConstructorOverLoading obj1=new ConstructorOverLoading("Deniz");
		ConstructorOverLoading obj2=new ConstructorOverLoading(5);
		
	}
}
