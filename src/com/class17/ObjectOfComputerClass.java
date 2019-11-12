package com.class17;

public class ObjectOfComputerClass {

	public static void main(String[] args) {
		
		Computer com1=new Computer();
		
		com1.brand="Apple";
		com1.name="MacPro Pro";
		com1.ram=128;
		com1.memory=250;
		com1.keyboard=true;
		com1.mouse=true;
		com1.screen=15.4;
System.out.println("I have "+com1.brand+" "+com1.name);
	}

}
