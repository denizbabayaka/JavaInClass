package com.class5;

import java.util.Scanner;

public class HomeWorkTask {

	public static void main(String[] args) {
		Scanner scan;
		int guiz;  //int guiz,midterm,finalexam,avarage;   other way of declare a variable 
		int midterm;
		int finalexam;
		int avarage;
		char grade1;
		scan = new Scanner(System.in);

		System.out.println("Enter your   your guiz score");

		guiz = scan.nextInt();
		System.out.println("Enter your your midterm score");
		midterm = scan.nextInt();
		System.out.println("Enter your finalexam score");
		finalexam = scan.nextInt();
		avarage = (guiz + midterm + finalexam) / 3;  // should be in parantesis otherwise start from divide
		if (avarage >= 90) {
			System.out.println(grade1='A');
		} else if (avarage >= 70 && avarage < 90) {  // if we use "|| or" condition it will give logical error.
			System.out.println(grade1 = 'B');
		} else if (avarage >= 50 && avarage < 70) {
			System.out.println(grade1 = 'C');
		} else if (avarage < 50) {
			System.out.println(grade1 = 'F');
		} else {
			System.out.println("Fail");
		}

		System.out.println("Your avarage score is " + avarage+" and your grade is ");
	

		System.out.println("__________________________");
		
	/*	boolean rain = true;
		String classMode="online";
		String classMode1="inclass";
		if (!rain) {
			System.out.println(classMode);
		} else {
		 System.out.println(classMode1);
		}
*/
		
		boolean rain = true;
		String classMode;
		
		if (rain) {
			classMode="online";
		} else {
		 
		classMode="inclass";
		}
		
		System.out.println(classMode);
		
		
	}

}
