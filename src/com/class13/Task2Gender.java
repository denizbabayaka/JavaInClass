package com.class13;

import java.util.Scanner;

public class Task2Gender {
public static void main(String[] args) {
	
	  //Write a program that reads two people's first names and
    //if they expecting boy or girl? Based on the input suggests a name for a baby
    //Example Output:
    //Mom’s first name?
    //Mary
    //Dad’s first name?
    //Daniel
    //Boy or Girl?
    //boy
    //Suggested baby name: DANRY

    Scanner scan=new Scanner(System.in);
    System.out.println("Enter moms name");
     String momsname=scan.nextLine();
     System.out.println("Enter dads name");
     String dadsname=scan.nextLine();
     System.out.println("enter baby gender");
     String gender=scan.nextLine();
    
     int m=momsname.length()/2;
     int d=dadsname.length()/2;
     int mEnd=momsname.length();
     int dEnd=dadsname.length();
     if(gender.equalsIgnoreCase("Boy")) {
        System.out.println(dadsname.substring(0,d)+momsname.substring(m,mEnd));
     }else {
         System.out.println(momsname.substring(0,m)+dadsname.substring(d,dEnd));
     }

}
}
