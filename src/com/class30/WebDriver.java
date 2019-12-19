package com.class30;

interface TakesScreenshot{
	// Public static final compiler adds
	 String 	FILE_EXTENSION=".png";
	void takesScreen();
	// we can add defined methods since jdk1.8 to interface
	  static void takeSelfie() {
		   System.out.println("I am defined static method of TakesScreenshot interface");
	   }
}
 

 public interface  WebDriver extends TakesScreenshot {
	 
	 void openBrowser();// unimplemented methods
	 void closeBrowser();
	 void maximizeWindow();
	 void findElement();

}
 abstract class Browser{
	 public abstract void refresh();
 }
