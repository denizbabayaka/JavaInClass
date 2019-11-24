package com.class20_other;

import com.class20.MySonMath;

public class Andrei {
	
	public static void main(String[] args) {
		
		MySonMath elionSon=new MySonMath();
		
		

		//public String name;
		// Those are not visible to new package
		//String phone;
		//private String SSN;
		//protected String birthday;
		
		elionSon.name="Ali";
		//elionSon.phone="";
		//elionSon.SSN="";
		//elionSon.birthday="";
		
		elionSon.add1();
		//all of thesee methods are not visible by Andrei
		//elionSon.add2(2,3);
		//int result=elionSon>add3();
		//int result4=elionSon.add4(5,7);
		
		
	}

}
