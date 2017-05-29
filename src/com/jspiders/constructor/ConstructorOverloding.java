package com.jspiders.constructor;

public class ConstructorOverloding {
	
	ConstructorOverloding()
	{
		System.out.println("zero argument");
	}
	ConstructorOverloding(int a)
	{
		System.out.println("signle int argument constructor");
		System.out.println("a value :"+a);
	}
	ConstructorOverloding(double b)
	{
		System.out.println("signle double argument constructor");
		System.out.println(" b value :"+b);
	}
ConstructorOverloding(int e,double c)
{
	System.out.println("two argument constructor");
	System.out.println("e value :"+e);	
	System.out.println("c value :"+c);	
}
public static void main(String[] args) {
	
ConstructorOverloding ref=new ConstructorOverloding();
//ConstructorOverloding ref1=new ConstructorOverloding(2.2);
//ConstructorOverloding ref2=new ConstructorOverloding(2,6.6);
}
}