package com.class10;

import java.util.Scanner;

public class InterestRate {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.println("Enter annual interes rate");
    double annualInterestRate= input.nextDouble();
    double monthlyInterestRate=annualInterestRate/1200;
    
    System.out.println("Enter number of years");
    int numberOfYears=input.nextInt();
    
    System.out.println("Enter loan amount");
    double loanAmount=input.nextDouble();
    
    double monthlyPayment=loanAmount*monthlyInterestRate/(1-1/Math.pow(1
            +monthlyInterestRate,numberOfYears*12));
    double totalPayment=monthlyPayment*numberOfYears*12;
    
    System.out.println("The monthly payment is $ "+(int) (monthlyPayment*100/100.0));
    
    System.out.println("Total payment is $ "+(int) (totalPayment*100)/100.0);
    
}
}