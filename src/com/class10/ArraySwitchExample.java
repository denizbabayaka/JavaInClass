package com.class10;

public class ArraySwitchExample {
public static void main(String[] args) {
	
	
	String [] country1 = { "Turkey", "USA", "India", "Holland", "Germany" };
	
	for(int i=0; i<country1.length; i++) {
        switch (country1[i]) {
        case "Turkey":
            System.out.println("Istanbul");
            
            break;
        case "USA":
            System.out.println("WAshington");
            
            break;
        case "India":
            System.out.println("Delhi");
            break;
        case "Holland":
        	System.out.println("Amsterdam");
        break;
        case "Germany":
        	System.out.println("Berlin");
            break;
           
        }
        }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
