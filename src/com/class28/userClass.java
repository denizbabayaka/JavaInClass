package com.class28;

public class userClass {
	
	String name;
	int phoneNumber;
	
	public userClass(String name,int phoneNumber) {
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
      public void display() {
    	  System.out.println("My name is "+name+" and my phone number is "+phoneNumber+" and my adress is ");
      }
}
