package com.class30;

public class FirefoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("You can open FireFox Driver");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("You can close FireFox Driver");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("You can maximize window of FireFox Driver");
		
	}

	@Override
	public void findElement() {
		System.out.println("You can find elemnts at FireFox Driver");
		
	}

}
