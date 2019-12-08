package com.class29;

public class Test {
public static void main(String[] args) {
	
	File obj=new PDFFile();
	obj.open();
	obj.edit();
	obj.eat();
	obj.close();
	File obj1=new JavaFile();
	obj1.open();
	File obj2=new WordFile();
	obj2.open();
	
}
}
