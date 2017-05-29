package com.jspiders.methods;

public class StaticMethod {
	int a=8;//global variables
static	float f=34;

static void m(double d){
	
	int q=3;//local variable
	System.out.println(f);
	System.out.println(q);
		System.out.println("hii");
}
void n()
{
	int i=17;//local variable
	this.a=i;
	System.out.println(i);
	System.out.println(a);
}
public static void main(String[] args) {
	
	StaticMethod.m(9.9);
	System.out.println("----------------------");
	StaticMethod s1=new StaticMethod();//object creation
	System.out.println(s1.a);
	System.out.println("----------");
	s1.n();
}
}
