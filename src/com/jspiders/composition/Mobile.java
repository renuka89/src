package com.jspiders.composition;


public class Mobile {
String compName;
String os;
double currency;
double dataPack;

Battery b=new Battery("lithium", "android");


Mobile(String compName,String os){//constructor
	this.compName=compName;
	this.os=os;
	
}
void rechargeCurrency(double amt){
	currency=amt;
	System.out.println(currency+" :is recharge");
}
void dataPack(double amt){
	dataPack=amt;
}
void voicecall(){
	if(currency>0){
		System.out.println("making voice cal....");
	}else{
		System.out.println("no currency to make class");
	}
}
void sms(){
	if(currency>0){
		System.out.println("texting......");
		b.disCharging();
	}else{
		System.out.println(" no currency to send sms");
	}
}

void browsing(){
	if(dataPack>0){
		System.out.println("browsing...........");
	}else{
		System.out.println("no datapack...");
	}
}
void batterstatus(){
	System.out.println("batterystatus : "+b.powerStatus);
}
 void playingGames() {
	
	 System.out.println("playing candy crush sags...");	
}
}
