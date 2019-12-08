package com.class30;

public class BankTest {
	public static void main(String[] args) {
		CapitalOneChild obj=new CapitalOneChild();
		obj.haveChecking();
		obj.haveSavings();
		obj.Trust();
		obj.financing();
		
		CapitalOne co=new CapitalOne();obj.haveChecking();
		co.haveChecking();
		co.haveSavings();
		co.Trust();
		co.financing();
		
		
		
		
		
	}

}
