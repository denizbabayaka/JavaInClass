package com.class30;


public class ChromeDriver extends Browser implements WebDriver {

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

	@Override
	public void refresh() {
		System.out.println("refresh Chrome Browser");
		
	}

	@Override
	public void takesScreen() {
		System.out.println("Take screenshot in Chrome Browser");
		
	}

}
