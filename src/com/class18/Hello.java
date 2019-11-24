package com.class18;

public class Hello {

	

		void sayHello(String name) {// getting the value from the obj and assign it to itself
			System.out.println("Hello " + name);
		}

		public static void main(String[] args) {

			Hello obj = new Hello();
			obj.sayHello("Asel");
			obj.sayHello("Weqas");
			obj.sayHello("Diego");
			obj.sayHelloDifferentLanguage("USA");
			obj.sayHelloDifferentLanguage("Russia");
			obj.sayHelloDifferentLanguage("Turkey");
			//obj.sayHelloDifferentLanguage(123); --> you will get compile time error because your data type is string  
			obj.sayNameAndAge("Deniz", 42);
			obj.sayNameAndAge("Nisa", 19);
			obj.isSnowing(true);
			obj.isSnowing(false);
		}
		/* create a method that will say hello in different language based on the value
		 * that will be passed when user calls a method */
		void sayHelloDifferentLanguage(String country) {

			switch (country.toLowerCase()) { // checking equality of a variable that is why we use switch

			case "usa":
				System.out.println("Hello");
				break;
			case "russia":
				System.out.println("Privet");
				break;
			case "paraguay":
				System.out.println("Hola");
				break;
			case "albania":
				System.out.println("Pershendetje");
				break;
			default:
				System.out.println("I do not know how to say hello in your language");
			}
		
		}
		// method to say name and age
		void sayNameAndAge(String name,int age) {
			System.out.println("My name is "+name+" and I am "+age+" years old");
		}
		
		void isSnowing(boolean Snowing) {// method header
		
			
			if(Snowing) {
				System.out.println("Stay Home");
			}else {
				System.out.println("Go for a walk");
			}
		}
	}


