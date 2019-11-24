package com.class20;

public class USA {
	
	private String capitalCity="Washington DC";
	public String mainState="New York";
	protected String scholl="Syntax Technologies";
	
	public static void main(String[] args) {
		USA us=new USA();
		
		System.out.println("Access from inside USA class");
		System.out.println(us.mainState);
		System.out.println(us.scholl);
		System.out.println(us.capitalCity);// protected can only be seen in same class(USA)
	}

}
