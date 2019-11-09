package com.class6;

import java.util.Scanner;

public class Task {
public static void main(String[] args) {
	String month;
	Scanner scan;
	
	scan=new Scanner(System.in);
	
	System.out.println("Which month you were born?");
	month=scan.next();
	String season;
	if(month=="January"||month=="February"||month=="March") {  //(month.equals("February")
		season="Winter";
	}else if (month=="April"||month=="May"||month=="June") {
		season="Spring";
	}else if(month=="July"||month=="August"||month=="September") {
		season="Summer";
		
	}else if(month=="October"||month=="November"||month=="December") {
		season="Spring";
	}else {
		season="Unknown";
	}
	
	System.out.println("You were  born in "+month);
	
	System.out.println(season);
	
	
	
	
	
	
	
}
}
