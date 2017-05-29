package com;

public class Sample3 {

	int a=35;

 void m()
	{
	 n();
	System.out.println("running instance  method");	
	}
static void n(){

	System.out.println("running static method");
}
	public static void main(String[] args) {
		
		Sample3 s2=new Sample3();
		s2.m();
		
	}
	}