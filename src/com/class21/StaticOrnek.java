package com.class21;

public class StaticOrnek {
	 public static  String ss="Welcome To Syntax Solutions";
	  
	  public static void main(String[] args) {
	   // StaticOrnek.ss="Deniz";// since the variable static when we change the value all of them change
	    
	    StaticOrnek obj=new StaticOrnek();
	    
	    System.out.println(obj.ss);
	    System.out.println(StaticOrnek.ss);
	    System.out.println(ss);
	   
	  }
	  class Main {
		  static int age;
		  static String name;
		  
		  static void display(){
		    age=40;
		    name="John";
		    System.out.println(age);
		    System.out.println(name);
		  }
		  
		  public static void main(String[] args) {
		    display();
		  }
		}
//	  class Main {
//		  static int count=0;
//		   public void increment(){
//		       count++;
//		   }
//		  public static void main(String[] args) {
//		      Main obj1=new Main();
//		      Main obj2=new Main();
//		      Main obj3=new Main();
//		      obj1.increment();
//		      obj2.increment();
//		      obj3.increment();
//		       
//		      System.out.println(obj1.count);
//		      System.out.println(obj2.count);
//		      System.out.println(obj3.count);
//		  }
//		}
//	  class Main {
//		  static int count=0;
//		  
//
//		  public static void main(String[] args) {
//		  Main obj=new Main();
//		  Main.count++;
//		  Main.count++;
//		  Main.count++;
//		  System.out.println(count);
//		  System.out.println(count);
//		  System.out.println(count);
//		  
//		  
//		  }
//		}
}
