package com.class9;

public class Pattern {
	public static void main(String[] args) {

		for (int k = 1; k <= 5; k++) {
			for (int l = 1; l <= 5; l++) {
				System.out.print('*');
			}
		}

		for (int i = 0; i <= 4; i++) { // rows  sira 

			for (int j = 0; j <= 7; j++) { // columns sutun   buraya geldiginde siraya 7 kere yildiz basiyor bu isi 4 kere yapiyor 
				System.out.print(j);
			}
			System.out.println(); // with empty statement creates a new line
		}

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");

		for (int i = 0; i < 5; i++) {
			for (int y = 0; y <= 9; y++) {
				System.out.print(y);

			}
			System.out.println();    // blank statement inside the loop 
		}

		
		 for (int i = 1; i <= 3; i++) {
	         for (int j = 1; j <= 2; j++) {
	         System.out.println("syntax");
	         }
	    }
		
		 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
		 
		  for(int i=0;i<6;i++){
		       System.out.print("syntax");
		       for(int y=0;y<i;y++){
		         
		       }
		       System.out.println();
		     
		    }
		 
		
		
		
		
		
	}
}
