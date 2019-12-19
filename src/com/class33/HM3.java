package com.class33;

import java.util.ArrayList;
import java.util.List;

public class HM3 {
public static void main(String[] args) {
	/*Create an arrayList of drinks.
	 * if any drink has letter "a" or "e" replace it with water.
	 */
	
	List<String>drink=new ArrayList<String>();
	drink.add("Cola");
	drink.add("Milk");
	drink.add("coffe");
	drink.add("tea");
	
	drink.set(0, "water");// replacing 0 element with water
	System.out.println(drink);
	

	    for(int i=0; i < drink.size(); i++) {
	      if(drink.get(i).contains("a")|| drink.get(i).contains("e") ) {
	      	drink.set(i, "water");
	       
	      }
	    } System.out.println(drink);
	}
}

