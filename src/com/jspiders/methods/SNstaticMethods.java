package com.jspiders.methods;

public class SNstaticMethods {
	
static void n()
{
//m();//we can't	invoke instance methods r instance data members in static methods
	System.out.println("running static n  method");
}

void m()
{
	n();
	System.out.println("running non-static method");
}

public static void main(String[] args) {
	SNstaticMethods s1=new SNstaticMethods();
	s1.m();
}
}
