package com.class23;

public class CarTest {

	public static void main(String[] args) {
		
		Car.make="Toyota";            // Car=ClassName
		Car car1=new Car();//-->      // car1= object refrence variable 
		car1.model="Camry";           // = assigning operator
		car1.color="Pink";            // new=keyword used to create an object
		car1.getDetails();            // Car()= constructor  special method or block of code that is being executed
		                              // ;=end of statement  when we create an Object /an instance 
		Car car2=new Car();
		car2.model="Pirius";
		car2.color="White";
		car2.getDetails();

	}

}
