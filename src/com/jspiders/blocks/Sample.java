package com.jspiders.blocks;

public class Sample {
	static int i=7;//global
	
	static{
		
		int i=8;//local
		System.out.println(i);
		System.out.println("hii..");
	}
	
	{
		int i=12;//local
		this.i=i;
		System.out.println(i);
		System.out.println("bye");//non-static
	}
	void m(){
		System.out.println("non static smethod..");
	}
	static void n(){
		System.out.println("static method..");
	}
	public static void main(String[] args)
	{
		Sample s1=new Sample();

		System.out.println("hey.. ");
		System.out.println("--------------");
		
		Sample.n();
		s1.m();
	}
	
}