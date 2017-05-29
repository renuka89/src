package com.jspiders.methods;

public class Check {
	
	int a=45;
	static int i=20;
	
	void m(){
		System.out.println("non static m method..");
		System.out.println(a);
		System.out.println(i);
		System.out.println("-----------------------");
		n();
	}
	
	static void n(){
		System.out.println("static n method..");
		System.out.println(i);
		//System.out.println(a); we can't invoke non-static data 
		//member in static methods
//m();we can't invoke non-static methods in static methods
	}
	public static void main(String[] args) {
		
		Check c=new Check();
		c.m();
	}
}
