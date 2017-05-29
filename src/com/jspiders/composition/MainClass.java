package com.jspiders.composition;

public class MainClass {
public static void main(String[] args) {
	
		Mobile mb=new Mobile("samsung", "android");
	
	System.out.println("______________________");
	
	mb.rechargeCurrency(250);
	mb.dataPack(200.0);
	mb.batterstatus();
	mb.voicecall();
	mb.sms();
	mb.playingGames();
	mb.browsing();
	mb.batterstatus();
	mb.b.reCharging();
}
}
