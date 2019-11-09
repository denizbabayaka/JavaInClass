package com.class7;

public class WhileLoops {

	public static void main(String[] args) {


              // Loops repeating same block of code  by incrementing a++; or a--;

              // while,do while,for,advandced for loop/enhanced loop/for each loop 
		

               int time=8;  // first initialize a variable (should be outside of the loop
               
               if(time<12) { // condition is true 
            	   System.out.println("Good morning");// code executes
               }
               
               while (time<12) { // condition is true 
            	   System.out.println("Good morning");// code executes infinitely---->infinite loop
               time++; // 4 times code executes 8-12=4 by incrementing or decrementing
               
               }

                int i=1;
                while(i<=6) {
                
                	System.out.println("hello");
                	i++;
                }
                


                int num = 1;
                while (num <= 10){
                if ((num != 5) && (num != 7)&&(num!=8)&&(num!=9)){
                System.out.println(num);
                }
                num++;
                }














}
}
