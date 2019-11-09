package com.class11;

public class Class11Task2 {
public static void main(String[] args) {
	
	String [][] grades= {{"Jane","John","Raymond","Edward"},
			             {"A","C","B","B"}};
	
	
	
	for(int i=0;i<4;i++) {
		for(int j=0;j<grades.length-1;j++) {
			if((grades[j+1][i]).equals("A")||(grades[j+1][i]).equals("B")){
				System.out.print(grades[j][i]+" "+grades[j+1][i]);
				System.out.println();
			}
		}
	}
	
	
	int[][] array = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
	boolean flag = false;
	for (int i = 0; i < array.length; i++) {
		if (array.length == array[i].length){
			flag = true;
		}
		break;
	}
	System.out.println(flag);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
