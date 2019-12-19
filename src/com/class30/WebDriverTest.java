package com.class30;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver obj=new ChromeDriver();
		WebDriver obj1=new FirefoxDriver();
		WebDriver[] web= {obj,obj1};
		
		for(WebDriver display:web) {
			display.openBrowser();
			display.closeBrowser();
			display.maximizeWindow();
			display.findElement();
			display.takesScreen();
		}

	}

}
