package com.class26;

public class WebDriverTest {

	public static void main(String[] args) {
		ChromeDriver chrome=new ChromeDriver();
		chrome.refresh();
		chrome.open();
		
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.refresh();
		firefox.open();
		System.out.println("_________________________");
		// creating an object of child class and given reference to the parent class
		WebDriver driver=new ChromeDriver();
		driver.refresh();
		driver.open();
		System.out.println("_____________________");
		WebDriver driver1=new FirefoxDriver();
		driver1.refresh();
		driver1.open();

	}

}
