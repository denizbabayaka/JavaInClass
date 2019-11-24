package com.class21;

public class Forest {

	public static void main(String[] args) {
		
		wolf w1=new wolf();
		w1.color="grey";
		w1.age=5;
		w1.numberOfWolves++;
		wolf w2=new wolf();
		w2.color="Black";
		w2.age=4;
		w2.numberOfWolves++;
		wolf w3=new wolf();
		w3.color="White";
		w3.age=3;
		w3.numberOfWolves++;
		
		System.out.println("Number of Wolves in my jungle is "+w3.numberOfWolves);
		System.out.println("First wolf coloris "+w1.color+" and age is "+w1.age);
		System.out.println("First wolf coloris "+w2.color+" and age is "+w2.age);
		System.out.println("First wolf coloris "+w3.color+" and age is "+w3.age);
		
		Fox f1=new Fox();
		f1.color="Grey";
		f1.speed=25;
		f1.numberOfFox++;

		Fox f2=new Fox();
		f2.color="Black";
		f2.speed=20;
		f2.numberOfFox++;

		Fox f3=new Fox();
		f3.color="Grey";
		f3.speed=25;
		f3.numberOfFox++;
		

         
		
		System.out.println("Number of Fox in my jungle is "+f3.numberOfFox);
		System.out.println("First fox color is "+f1.color+" and speed is "+f1.speed);
		System.out.println("First fox color is "+f2.color+" and speed is "+f2.speed);
		System.out.println("First fox color is "+f3.color+" and speed is "+f3.speed);
		
		Bear b1=new Bear();
		b1.type="Polar";
		b1.weight=45;
		b1.numberofBears++;
		Bear b2=new Bear();
		b2.type="mountain";
		b2.weight=35;
		b2.numberofBears++;
		Bear b3=new Bear();
		b3.type="Zoo";
		b3.weight=55;
		b3.numberofBears++;
		System.out.println("Number of Bears in my jungle is "+b3.numberofBears);
		System.out.println("First Bear type is "+b1.type+" and weight is "+b1.weight);
		System.out.println("First Bear type is "+b2.type+" and weight is "+b2.weight);
		System.out.println("First Bear type is "+b3.type+" and weight is "+b3.weight);
		
		
		
		

	}

}
