package com.class29;

// Abstraction--> is a process of hiding implementation details and showing only functionality

public abstract class Phone {
	
	//implemented methods
	public void makeCall() {
		System.out.println("Make call");
	}
	
	public void sendText() {
		System.out.println("Send text");
	}
	
	// unimplemented methods
	public abstract void takePictures();
	
	public abstract void playGames();
		

}
// concrete class
class iPhone extends Phone{

	@Override
	public void takePictures() {
		System.out.println("iphone takes pictures");
		
	}

	@Override
	public void playGames() {
		System.out.println("Play games on iPhone");
		
	}
	
}
class Samsung extends Phone{

	@Override
	public void takePictures() {
	System.out.println("Samsung takes picture");
		
	}

	@Override
	public void playGames() {
		System.out.println("play games on Samsung ");
		
	}
	
}