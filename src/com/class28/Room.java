package com.class28;

public class Room extends Building {
	
	

	int roomNumber;
	
	public Room(String adress,int floor,int roomNumber) {
		super(adress,floor);
		this.roomNumber=roomNumber;
	}
	 
	public void print() {
		System.out.println(address+" "+floor+""+roomNumber);
	}
	public static void main(String[] args) {
		Room room=new Room("123 main st",4,101);
		//System.out.println(room.floor);
		room.print();
	}

}
