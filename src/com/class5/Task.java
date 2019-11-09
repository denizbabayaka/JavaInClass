package com.class5;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("what is the day?");
		int day=scan.nextInt();
		if(day>=1&&day<=5) {
			System.out.println("day is weekday ");
		}else if(day>=6&&day<=7){
			System.out.println("day is weekend");
		}else {
			System.out.println("invalid");
		}

		
		System.out.println("what is your height ?");
		int height=scan.nextInt();
		
		if(height>=1&& height<=5) {                //= variabledan once 
			System.out.println("short");
		}else if(height>=5||height<=6) {
			System.out.println("medium");
		}else if(height>6) {
			System.out.println("tall");
		}
		
		
		

				
		
		
		
		
		
		
	}

}
