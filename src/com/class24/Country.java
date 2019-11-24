package com.class24;

public class Country {
	
	public String capital,name; // instance variables inside the class outside the method
	public int population;
	/*Constructor special type of method /block of code that is being executed when we create an object
	 * we need constructor to initialize an object we can initialize instance variables
	 * must have class name
	 * no return type 
	 */
	public Country() {
		System.out.println("I am non argument constructor");//Country country3=new Country(); this one execute first
	}
	
	Country(String name,String capital,int population ){// parameterized constructor if you create compiler do not 
		this.name=name;                              // create a default constructor for you
		this.capital=capital;
		this.population=population;// this keyword in java refers to current object 
	}
	public void displayInfo() {
		System.out.println(name+" "+capital+" "+population);
	}
	
	public static void main(String[] args) {
		
//		Country country1=new Country();  
//		country1.name="USA";
//		country1.capital="washington dc";
//		
//		Country country2=new Country();
//		country1.name="Kazahhistan";
//		country1.capital="Astana";
		
		Country country1=new Country("USA", "Washington DC",350000);		
		Country country2=new Country("Kazakhistan", "Astana",250000);
		Country country3=new Country();
		country1.displayInfo();
		country2.displayInfo();
		country3.displayInfo();
		System.out.println(country1.name);
		
		
		
	}

}
