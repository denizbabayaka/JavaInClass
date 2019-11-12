package com.class17;

public class Phone {
	
	String name,brand,size;
	int gb,screen;
	
	void photo(){
		System.out.println("My "+name+" can take perfect photo ");
	}
	void water() {
		System.out.println("My "+name+" phone is water proof");
	}
	
	public static void main(String[] args) {
		
		Phone tel=new Phone();
		
		tel.name="Apple";
		tel.brand="X";
		tel.size="Big";
		tel.gb=128;
		tel.screen=14;
		System.out.println("I have an "+tel.name+" Phone with "+tel.size+" size.");
		tel.photo();
		tel.water();
		
		
		Phone tel1=new Phone();
		tel1.name="Android";
		tel1.brand="S";
		tel1.size="Small";
		tel1.gb=256;
		tel1.screen=16;
		System.out.println("I have an "+tel1.name+" Phone with "+tel1.size+" size.");
		tel1.photo();
		tel1.water();
		
		
		Phone tel2=new Phone();
		
		tel2.name="Nokia";
		tel2.brand="N2";
		tel2.size="Medium";
		tel2.gb=500;
		tel2.screen=12;
		System.out.println("I have an "+tel2.name+" Phone with "+tel2.size+" size.");
		tel2.photo();
		tel2.water();
		
		
		
		
		
		
		
	}

}
