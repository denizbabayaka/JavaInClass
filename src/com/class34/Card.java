package com.class34;

public abstract class Card {
	
	String ccType;
	static double totalBalance;
	
	Card(String ccType){
		this.ccType=ccType;
	}
	
	public void addBalance(double amount) {
		totalBalance+=amount;
		System.out.println("Total balance is "+totalBalance);
	}
	public static void Pay() {
		totalBalance=0;
	}
public abstract void commission();
}
class MasterCard extends Card{
	
	MasterCard(String ccType){
		super(ccType);
	}

	@Override
	public void commission() {
		System.out.println("Commission charge for MasterCard is 1.5%");
		
	}
	
}
class Visa extends Card{
	
	Visa(String ccType){
		super(ccType);
	}

	@Override
	public void commission() {
		System.out.println("Commission charge for Visa is 1.7%");
		
	}
	
}
class Amex extends Card{
	
	Amex(String ccType){
		super(ccType);
	}

	@Override
	public void commission() {
		System.out.println("Commission charge for Amex is 1.3%");
		
	}
	
}