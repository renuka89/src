package com.jspiders.composition;

public class Battery {
String type;
String comp;
public int powerStatus=50;


  public Battery(String type, String comp) {
	this.type=type;
	this.comp=comp;
}

public void reCharging(){
	System.out.println("rechargingStarted");
	while(powerStatus<100){
		powerStatus=powerStatus+10;
	}
}
public void disCharging(){
	System.out.println("discharging started");
	if(powerStatus>0){
		powerStatus=powerStatus-10;
	}else{
		System.out.println("no charging in batery");
	}
}
}
