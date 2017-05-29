package com.jspiders.casting;

public class Sample2 {
public static void main(String[] args) {
	//narrowing
	double d=56.678;
	int i=(int) d;
	System.out.println(i);
	
	//widening
	int a=56;
	double d1=a;
	System.out.println(d1);
}
}
