package com.class34;

public  abstract class Insurance {
	
	String insuranceName;
	int qoute;
	public Insurance(String insuranceName,int qoute) {
		this.insuranceName=insuranceName;
		this.qoute=qoute;
	}
	
	public abstract void getQoute();
	public abstract void cancelInsurance();
	
}
class Car extends Insurance{
	
	String carModel;
	Car(String insuranceName,int qoute,String carModel ){
	super(insuranceName,qoute);
	this.carModel =carModel;
	
	}
	@Override
	public void getQoute() {
		System.out.println("Qoute for car model "+carModel+" is: "+qoute+"$");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancelling car Insurance for "+carModel);
		
	}
	
}
class Pet extends Insurance{
	String petType;
	
	Pet(String insuranceName,int qoute,String petType){
		super(insuranceName,qoute);
		this.petType=petType;
		
	}

	@Override
	public void getQoute() {
		System.out.println("Qoute for "+petType+" is : "+qoute+"$");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancelling pet Insurance for "+petType);
		
	}
	
}
class Health extends Insurance{
	Health(String insuranceName,int qoute){
		super(insuranceName,qoute);
	}

	@Override
	public void getQoute() {
		System.out.println("Qoute for Health Insurance is: "+qoute+"$");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancelling Health Insurance");
		
	}
	
	
	
	
}