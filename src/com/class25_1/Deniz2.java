package com.class25_1;

 class Deniz2 {
	
	private static void display() {
		System.out.println("This method with no parameters");
	}
	
	private static void display(int num) {
		System.out.println("This method with 1 int parameter");
	}
	private static void display(String str) {
		System.out.println("This method with 1 String parameter");
	}
	public static void main(String[] args) {
		
		Deniz2 obj=new Deniz2();
		display();
		display(5);
		display("Deniz");
		
	}

}
