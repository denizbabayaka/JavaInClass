package com.class30;

public interface Bank {
	void haveChecking();// only unimplemented methods in interface 
	void haveSavings();

}
 interface Trustable{
	 void Trust();
 }
 
 class Finance{
	 public void financing(){
	System.out.println("Financial transactions must happen");
	
	 }
 }
class BOA extends Finance implements Bank,Trustable{

	@Override
	public void haveChecking() {
		System.out.println("BOA has a checking account");
		
		
	}

	@Override
	public void haveSavings() {
		System.out.println("BOA has a saving account");
     
		
	}

	@Override
	public void Trust() {
		System.out.println("You can trust BOA with your money");
		
	}
	
	
}
class CapitalOne extends Finance implements   Bank,Trustable{// with comma you can accsess multiplie interface 

	@Override
	public void haveChecking() {
		System.out.println("CapitalOne has a saving account");
		
	}

	@Override
	public void haveSavings() {
		System.out.println("CapitalOne  has a saving account");
		
	}

	@Override
	public void Trust() {
		System.out.println("You can trust CapitalOne with your money");
		
	}
	
}
class CapitalOneChild extends CapitalOne{
	
}