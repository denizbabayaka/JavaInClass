package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System. in);
		System.out.println("Enter your class day: ");
		String day=scan.nextLine();
		
		if(day.trim().toLowerCase().equals("saturday")) {
			System.out.println("Saturday is your Java Class ");
		}else if(day.equalsIgnoreCase("sunday")) {
			System.out.println("Sunday is your Git Class");
		}else if(day.trim().toUpperCase().equals("TUESDAY")) {
			System.out.println("Tuesday is your SDLC calass");
		}else if(day.trim().toLowerCase().equals("Thursday")) {
			System.out.println("Thursday is your Manual Testing Class");
		}else {
			System.err.println("Invalid day");
		}
				
			scan.close();
	
				
		
		
		
		

	}

}
