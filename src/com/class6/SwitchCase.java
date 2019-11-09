package com.class6;

public class SwitchCase { //
	public static void main(String[] args) {
		int day = 6;
		String weekDay;

		if (day == 1) {
			weekDay = "Monday";
		} else if (day == 2) {
			weekDay = "Tuesday";
		} else if (day == 3) {
			weekDay = "Wednesday";
		} else if (day == 4) {
			weekDay = "Thursday";
		} else if (day == 5) {
			weekDay = "Friday";
		} else if (day == 6) {
			weekDay = "Saturday";
		} else if (day == 7) {
			weekDay = "Sunday";
		} else {
			weekDay = "Invaid";
		}
		System.out.println(weekDay);

		int day1 = 5;
		String weekday1;

		switch (day1) {          // switch case faster than if 
		case 1:
			weekday1 = "Monday";
			break;    //         if we do not put break code continues
		case 2:
			weekday1 = "Tuesday";
			break;
		case 3:
			weekday1 = "Wednesday";
			break;
		case 4:
			weekday1 = "Thursday";
			break;
		case 5:
			weekday1 = "Friday";
			break;
		case 6:
			weekday1 = "Saturday";
			break;
		case 7:
			weekday1 = "Sunday";
			break;
			
		default:
			weekday1="Invalid";
		}

		
		
		System.out.println(weekday1);
		
		
		
		
	}
}