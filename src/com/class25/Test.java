package com.class25;

public class Test {
	public static void main(String[] args) {
		
	System.out.println("Create an object of employee class");
	
	Employee emp=new Employee();
	emp.salary=70000;
	Employee.companyName="Syntax";
	emp.work();
	emp.getPaid();
	System.out.println("*********************");
	System.out.println("Create an object of scrumTeam class");
	ScrumTeam sm=new ScrumTeam();
	sm.salary=90000;
	sm.work();
	sm.getPaid();
	sm.artifacts="Product Backlog,Sprint Backlog,BurnDownChart";
	sm.ceremonies="Sprint Demo,Plannig,Retro,Daily Standup";
	sm.attendScrumMeetings();
	System.out.println("********************");
	System.out.println("Create an object of Developer class");
	Developer dev=new Developer();
	dev.salary=130000;
	dev.work();
	dev.getPaid();
	dev.artifacts="Sprint Backlog";
	dev.ceremonies="Product Backlog,Sprint Backlog,BurnDownChart";
	dev.code();
	dev.attendScrumMeetings();
	System.out.println("************************");
	System.out.println("Create an object of ProductOwner class");
	
	
	ProductOwner pr=new ProductOwner();
	
	pr.work();pr.salary=150000;	
	pr.getPaid();	
	pr.artifacts="Sprint Backlog";
	pr.ceremonies="Product Backlog,Sprint Backlog,BurnDownChart";
	pr.attendScrumMeetings();
	pr.employeeId=101;
	
	
	

	
	}

}
