package com.class28;

public class CarTest {
	public static void main(String[] args) {
		Tesla tesla = new Tesla();
		Tesla tesla1= new Tesla("Tesla", "S5", true);
		tesla1.displayInfo();
		System.out.println("____2nd object____");
		Tesla tesla2= new Tesla("Tesla", "S5", false);
		tesla2.displayInfo();
		
	}

}
