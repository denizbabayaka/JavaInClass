package com.class24;

public class ThisKeyword {
	
	int a,b;
	
	public ThisKeyword(int a,int b) {
		this.a=a;  // this.variable --> we are reffering to the instance variables
		this.b=b;  // to differentiate between local var. and instance var. with same name 
	}
	public ThisKeyword() {
		System.out.println("I am non argument constructor");
	}
        public void sum(int a,int b) {
        	System.out.println("The sum of local parameters is "+(a+b));// a and b refers to local variables
        	System.out.println("The sum of instance variable is "+(this.a+this.b));
        }
        
        public void sayA() {
        	System.out.println(a);
        }
        public void sayB() {
        	System.out.println(b);
        }
        public void sayAandB() {  // calling method inside the method
        	this.sayA();
        	sayB(); // compiler adds this automatically --> this.sayB();
        	
        		
        }
        
        public static void main(String[] args) {
			ThisKeyword obj=new ThisKeyword(5, 10);
			obj.sum(10, 20);
			ThisKeyword obj1=new ThisKeyword();			
			obj1.sum(100, 200);
			obj.sayA();
			obj.sayB();
			System.out.println("_____________________");
			obj.sayAandB();
		}
}
