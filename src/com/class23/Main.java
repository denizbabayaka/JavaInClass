package com.class23;

public class Main {
 
	String label;
	double price;
	String category;
	boolean exp;
	int stock;
	
	Main(String label,double price,String category,boolean exp,int stock){
		this.label=label;
		this.price=price;
		this.category=category;
		this.exp=exp;
		this.stock=stock;
	}
	Main(String label,double price,int stock){
		this.label=label;
		this.price=price;
		this.category="misc";
		this.exp=false;
		this.stock=stock;
	
	}
	Main(String label,double price){
		this.label=label;
		this.price=price;
		this.category=null;
		this.exp=false;
		this.stock=0;
	}
	public void display() {
		System.out.println(label+" "+price+" "+category+" "+exp+" "+stock);
	
	}
	public static void main(String[] args) {
		Main obj1=new Main("Eggs",3.0,"Produce",true,10);
		Main obj2=new Main("Paper Towels",2.0,24);
		Main obj3=new Main("Paper Towels",2.0);
		
		obj1.display();
		obj2.display();
		obj3.display();
	}
}
