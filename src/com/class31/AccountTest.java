package com.class31;

public class AccountTest {
	public static void main(String[] args) {
		
		Account acc=new Account();
		acc.setAccountNumber(123456678);
		long accountNumber=acc.getAccountNumber();
		System.out.println(accountNumber);
		
		acc.setBalance(-200);
		double myBalance=acc.getBalance();
		System.out.println(myBalance);
		
		int num=123;
		String.valueOf(num);// converts given value  to the string 
	}

}
