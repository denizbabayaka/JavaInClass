package com.class30;

public class DrivableTest {
public static void main(String[] args) {
	Drivable obj=new Toyota();
	obj.drive();
	//obj.DRIVE_FAST=false;CE:since it is static can not be reassigned
	Toyota toyota=new Toyota();
	toyota.drive();
	toyota.stop();// inherit frm car class 
}
}