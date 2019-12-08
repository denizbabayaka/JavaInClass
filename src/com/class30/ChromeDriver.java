package com.class30;


public class ChromeDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("You can open Chrome Driver");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("You can close Chrome Driver");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("You can maximize of  FireFox Driver");
		
	}

	@Override
	public void findElement() {
		System.out.println("You can find element at FireFox Driver");
		
	}

}
