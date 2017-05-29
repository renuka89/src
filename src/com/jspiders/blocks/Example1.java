package com.jspiders.blocks;

public class Example1 {
	
	static {
		System.out.println("static block 1");
	}
	
	
	{
		int a=9;
		System.out.println("non-static block 1");
			}
	
		public static void main(String[] ref) {
			Example1 c =new Example1();
			Example1 c1 =new Example1();
			//non-static block will execute based on number of object creation

		System.out.println("running main method");

	}
}
