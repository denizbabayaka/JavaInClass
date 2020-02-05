package com.class38;

public class Recap {

	public static void main(String[] args) throws InterruptedException {
		
		//int num="1"; // this is syntax error not an exception 
		
		// runtime - unchecked exception type=.ArrayIndexOutOfBoundsException
		
		int [] nums= {12,13};
		
		
		try {		
		System.out.println(nums[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Trying to access element outside of the bound");
			
		}
				
		// copmpile time -checked
		
		Thread.sleep(2000);
		System.out.println("End of the code");
		

	}

}
