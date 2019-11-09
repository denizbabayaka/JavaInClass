package com.class8;

public class LoopBreak {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 6) {
				break; // when reaches 7 break and goes outside of the loop break reaks the loop
			}

			System.out.println(i);
		}

		System.out.println("I am outside of the loop"); // comes here

		// continue;
		
		for(int i=1;i<=5;i++) {
			if(i==2||i==4) {
				continue;  // as soon as reaches num 2 skip the number 2 and continue 
			}
			System.out.println(i);
		}
		System.out.println("I am outside of the loop");
		
		for(int i=1;i<=20;i++) {
		if(i>=5&&i<=7) {	//if(i==5||i==6||i==7) {  //  we use || because at least one condition has to be true  in && all of them has to be true 
			break;	//continue;
			}
		
			System.out.println(i);
		
	}
		
		
		
		
		
		

	}

}
