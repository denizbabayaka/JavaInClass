package com.class31;

public class Account {
	
	/*Encapsulation in java is a mechanism for wrapping data (variables)and code acting on the data
	 * (methods) together as a single unit 
	 */
	
	private long accountNumber;
	private double balance;
	// getters-give read only access
	public long getAccountNumber() {
		return accountNumber;
		
	}
   public double getBalance() {
	   return balance;
   }
   //setter-give write access
   public void setBalance(int amount) {
	   if(amount>0) {
		   balance=balance+amount;
	   }
   }
   public void setAccountNumber(long accountNumber) {
	   if(String.valueOf(accountNumber).length()==9){
		   this.accountNumber=accountNumber;
	   }
   }
}
