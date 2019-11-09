package com.class11;

public class RecapArray1 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 7 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("&&&&&&&&&");

		for (int ar : arr) { // extract  values from an array advanced/enhanced/each loop short way of writing
								// code inside for loop
			System.out.println(ar);
		}

		String [] cars = { "Mazda", "Toyota", "Honda", "Mercedes", "Lexus" };

		for (int i = 0; i < cars.length; i++) {
			System.out.println(i+":"+cars[i]);   //  cars[i] i means print the value of the array based on the i condition

		}
		System.out.println("&&&&&&&&&&&&&&&");
		for (String car : cars) {
			System.out.println(car);
	}

		int [ ]num= {2,4,5,7};
		int sum=0;
		for( int y=0;y<num.length;y++) {
			sum=sum+num[y];
			
		}
		System.out.println(sum);
		
		String [] cnt= {"Turkey","India","Holland","USA"};
				
		
		for (int i = 0; i < cnt.length; i++) {
			switch (cnt[i]) {
			
			case "Turkey":
				System.out.println("Istanbul");
				break;
				
			case "India":
				System.out.println("Delhi");
				break;
			case "Holland":
				System.out.println("Amsterdam");
				break;
			case "USA":
				System.out.println("Washington D.C");
				break;
				default:
					System.out.println("Unknown");
			}
		}
		
		for (String cnts:cnt) {
			switch (cnts) {
			
			case "Turkey":
				System.out.println("Istanbul");
				break;
				
			case "India":
				System.out.println("Delhi");
				break;
			case "Holland":
				System.out.println("Amsterdam");
				break;
			case "USA":
				System.out.println("Washington D.C");
				break;
				default:
					break;
			}
		}
		
	}

}
