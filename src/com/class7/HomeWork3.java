package com.class7;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean yes=true;
		System.out.println("Please enter amount");
		int price=scan.nextInt();
		while(yes) {
			if(price<5) {
				yes=false;
				System.out.println("Enter amount again");
			}else {
				System.out.println("Enjoy your iced coffe");
			}
		price++;
		}

	}

}
