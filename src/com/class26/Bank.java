package com.class26;

public class Bank {
	double money;
	public double chargeFee() {
		double fee=0;
		if (money<10000) {
			fee=money*0.1;
		}else {
			fee=0;
		}
		return fee; // return type has to be same with override
	}
}
class PNC extends Bank{
	@Override
 // optional to verify that  you are actually overrriding  
	public double chargeFee() {
		double fee;
		if(money<1000) {
			fee=money*0.05;
		}else {
			fee=0;
		}
		return fee;
	}

}
