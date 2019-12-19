package com.class34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CardTest {

	public static void main(String[] args) {
		
		List<Card>obj=new ArrayList<Card>();
		obj.add(new MasterCard("mastercard"));
		obj.add(new Visa("Visa"));
		obj.add(new Amex("amex"));
		System.out.println("____FOR LOOP_____");
		
		for(int i=0;i<obj.size();i++) {
			obj.get(i).addBalance(300);
			obj.get(i).commission();
		}
           System.out.println("_____FOR EACH____");
           
           for(Card obj1:obj) {
        	   obj1.addBalance(300);
        	   obj1.commission();
           }
           
           Iterator<Card>obj3=obj.iterator();
           while(obj3.hasNext()) {
        	   Card obj4=obj3.next();
       		   obj4.addBalance(300);
        	   obj4.commission();    
           }
           
	}

}
