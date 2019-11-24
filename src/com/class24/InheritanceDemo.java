package com.class24;

class Calculator{ //SuperClass
	public int add(int i,int j ) {
		return i+j;
	}
	
}
class CalcAdv extends Calculator{  // subClass
	public int sub(int i,int j ) {
		return i-j;
	}
}
class CalcVeryAdv extends CalcAdv{
	public int mult(int i,int j ) {
		return i*j;
	}
}
 class InheritanceDemo {
	 
	 
	 
	 
	 
	 
	 public static void main(String[] args) {
		CalcVeryAdv c1=new CalcVeryAdv();
		int result=c1.add(5, 4);
		System.out.println(result);
		System.out.println("============");
		int result1=c1.sub(7, 4);
		System.out.println(result1);
		System.out.println("=============");
		int result2=c1.mult(2, 3);
		System.out.println(result2);
 
	 }

}