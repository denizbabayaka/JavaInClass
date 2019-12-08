package com.class28;

public class userInfo extends userClass {
	String adress;
	
	
	
	public userInfo(String name,int phoneNumber,String adress) {
		super(name,phoneNumber);
		this.adress=adress;
	}
	   public void display() {
	    	  System.out.println("My name is "+name+" and my phone number is "+phoneNumber+" and my adress is "+adress);
	      }
	public static void main(String[] args) {
		userInfo obj= new userInfo("Deniz", 732829235, "123 main st");
		obj.display();
	}

}
