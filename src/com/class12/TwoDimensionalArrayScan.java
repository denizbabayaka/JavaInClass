package com.class12;

import java.util.Scanner;

public class TwoDimensionalArrayScan {

	public static void main(String[] args) {
		
	int[] arr=new int[3];
	Scanner scan=new Scanner(System.in);
	
	for(int  i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
		//System.out.print(arr[i]);
	}
for(int y=0;y<arr.length;y++) {
	System.out.println(arr[y]);
}
	}

}
