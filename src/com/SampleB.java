package com;

public class SampleB {
String a= "Renuka";
SampleB(){
	System.out.println("user defined zero argument constructor");
}

public static void main(String[] args) {
	SampleB b=new SampleB();
		System.out.println(b.a);
		System.out.println("-----------------------");
		SampleB b1=new SampleB();
		b1.a="xyz";
		System.out.println(b1.a);
}
}
