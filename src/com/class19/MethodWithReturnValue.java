package com.class19;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		/*declare a string and 
		 * if string has more than 10 characters -->String is large 
		 * otherwise -->String is small
		 */
          
		String str="Welcome Home";
		int numOfChars=str.length();// this method returns us something
		if(numOfChars>10) {
			System.out.println("String is large");
		}else {
			System.out.println("String is small");
		}
		char character=str.charAt(4);
		System.out.println(character);
		//create an object of the class where method is defined
		
		Recap obj1=new Recap();
		obj1.sum(10, 30);
		//int num=obj1.sum(10, 30); compile error say change return type
		MethodWithReturnValue obj2=new MethodWithReturnValue();
		int sum1=obj2.sum(20, 10);
		System.out.println("This is the number that I return from my sum method with class name  "
				+ " name MethodWithReturnValue "+   sum1);
		System.out.println("========================");
		int rlargest=obj2.findLargest(5, 7);
		System.out.println("findLargest method returns this number "+rlargest);
		
	}
	// return type,method name(list of paraneters)
	int sum(int num1,int num2) { // since this method return us something we have to change VOID to return type(INT)
		int c=num1+num2;
		return c;
	}
       // method to find largest number
	int findLargest(int num1,int num2) {
		int largest;
		if(num1>num2) {
			largest=num1;
		}else {
			largest=num2;
		}
		return largest; // return statement is key for assignig any value to your object int rlargest=obj2.findLargest(5, 7);
	}
}
