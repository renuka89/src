package com;

public class Sample2 {

	int a=35;

 void m()
	{
	System.out.println("running instance  method");	
	}

	public static void main(String[] args) {
		
		Sample2 s2=new Sample2();
		System.out.println(s2.a);
		
		s2.m();
		
	}
	}
