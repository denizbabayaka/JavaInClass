package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		int i = 0;

		while (i <= 20) {
			System.out.println(i);
			i++;
		}

		//i want to print numbers from 10 to 30 all in 1 line 
		
		int y=10;
		
		while(y<=30) {
			System.out.print(y);  // prints in line 
			y++;
		}
		
		// how to print values 10 to 1;
		 int a=10;
		 
		 while (a<=1) {
			 System.out.println(a);
			 a--;
		 }
		
		int b=50;
			
			while(b>=20) {
				System.out.println(b);
				b--;
			}
		
			// 
			int z=2;
			
			while(z<=20) {
				System.out.println(z);
				z+=2;
			}
			int q=1;
			
			while(q<=20) {
				System.out.println("..");
				if(q%2==0) {
					System.out.println(q);
				
				}
				q++;  // has to be inside the if condition for incrementing the number 
			}
			
			int num=50;
			
			while(num<=100) {
				
			if(num%2==0) {
				System.out.println(num);
			}
			num++;
			}
			
			
		
			
	}

}
