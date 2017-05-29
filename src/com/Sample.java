package com;

public class Sample {
	static int a=35;

	static void m()
	{
	System.out.println("running static method");	
	}

	public static void main(String[] args) {
		System.out.println(Sample.a);
		
		Sample.m();
		
	}
	}
