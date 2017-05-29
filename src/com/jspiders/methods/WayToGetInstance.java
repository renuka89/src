package com.jspiders.methods;

public class WayToGetInstance {
	
	static void n1(){
		System.out.println("helo");
	}
	void m1(){
		System.out.println("hiuii..");
	}
public static void main(String[] args) {
	try {
		WayToGetInstance.n1();
		WayToGetInstance t=(WayToGetInstance)Class.forName("WayToGetInstance").
				newInstance();
		t.m1();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

}

