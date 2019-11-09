package com.class11;

public class Class11Task1 {
public static void main(String[] args) {
	
	String [][] titles= {{"Mrs","Mr","Ms","Miss"},{"Smith","Obama","Jackson","Jordan"}};
	
	for(int i=0;i<4;i++) {                                
		for(int y=0;y<2;y++) {                           
			System.out.println("titles["+ y +"]["+ i +"]: " + titles[y][i]);          
		}
	System.out.println();
	}
	
	int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
int sum=0;

	for(int i=2;i<a.length;i=+2){
	  for(int y=2;y<a[i].length;y=+2){
	    sum=sum+a[i][y];
	  }

	}
	System.out.println(sum);
	
		
}
}
