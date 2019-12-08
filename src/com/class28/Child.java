package com.class28;

public class Child extends Parent{
	
	String name="James";
	
	public static void main(String[] args) {
		Child obj =new Child();
		obj.callName();
		System.out.println("_________________________");
		obj.callingMethod();
		
	}
	
	public void callName() {
		System.out.println(name);
		System.out.println(super.name); // accessing parent class variable
		super.display();// accessing parent class method
		System.out.println(lastName);// parent class instance variable
	}
      public void callingMethod() {
          callName(); // by default this.callName() added
    	  super.callName();
      }
}
