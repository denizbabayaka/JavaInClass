package com.class5;

public class LogicolOR {

	public static void main(String[] args) {

		int day =6;
		
		if(day==2 || day==4) {                              // as long as 1 of them true condition is true
			System.out.println("Sdlc Class");
		}else if(day==6||day==7) {
			System.out.println("java class");
		}else if(day==1|| day==5) {
			System.out.println("no Class");
		}else if(day==3) {System.out.println("review Class");
		}else {
			System.out.println("not a valid day");
		}
		
		
		
	String day1 ="Thursday";
		
		if(day1.equals("Tuesday") || day1.equals("Thursday")) {                  // as long as 1 of them true condition is true            
			System.out.println("Sdlc Class");
		}else if(day1.equals("saturday")||day1.equals("sunday")) {
			System.out.println("java class");
		}else if(day1.equals("monday")||day1.equals("friday")) {
			System.out.println("no Class");
		}else if(day1.equals("wednesday")) {System.out.println("review Class");
		}else {
			System.out.println("not a valid day");
		}
		
		
		
		
		

	}

}
