package com.class12;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
		int [] array2= {2,4,5,7,2};
		
		for (int i = 0; i < array2.length; i++) {
		//	System.out.println(array2[i]);
			for(int j=i+1;j<array2.length;j++) {  // trick is +1 every time change place 
				if(array2[i]==array2[j]) {
					System.out.println(array2[j]);
				}
			}
			
		}

	}

}
