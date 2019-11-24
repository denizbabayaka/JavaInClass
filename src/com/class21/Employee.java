package com.class21;

public class Employee {
	
	  int eid;
	  int salary;
	static  String ceo;  // belong to the class and assigned all the objects without assigning new value 
	  
	 
	 void String() {
		 System.out.println("Employyee eid is "+eid+" salary is " +salary+ " and his boss is "+ceo);
	 }
public static void main(String[] args) {
	Employee.ceo="Sumair"; // ceo belongs to the class
	
	Employee emp=new Employee();
	emp.eid=123456;
	emp.salary=100000;
	
	emp.String();
	
	Employee emp1=new Employee();
	emp1.eid=122556;
	emp1.salary=150000;
	//emp1.ceo="Deniz";
	emp1.String();
}
}
