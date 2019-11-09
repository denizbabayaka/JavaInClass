package com.class7;

public class Loopstask {

	public static void main(String[] args) {
		
		boolean workDay=true;
		int day=1;
		
		
			
		    while(workDay) {
		
		if(day==6) {
			System.out.println("I do not need a day of anymore");
	          workDay=false;  // when this contidition is true workDay become false and whole condition terminated
		}else {
			System.out.println("I need a day off");
		}
		
		
		
		day++; 
		
		    }
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
