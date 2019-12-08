package com.class29;

  
abstract class File {
	
	public void close() {
		System.out.println("Open the file");
	}
    public void edit() {
    	System.out.println("Edit the file");
    }
    public abstract void open();
    public abstract void eat();
}

class WordFile extends File{

	@Override
	public void open() {
		System.out.println("To open java file we need microsoft ");
		
	}
	
	
}
class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("To open java file we need notepad");
		
	}
	
}
class PDFFile extends File{

	@Override
	public void open() {
	System.out.println("To open java file we need sublime text");
		
	}
	public void eat() {
		
	}
	
}
