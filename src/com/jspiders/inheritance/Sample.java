package com.jspiders.inheritance;

public class Sample {
int a=8;
void inherit(){
	System.out.println("hii...");
}
}
class Sample1 extends Sample{
	void test(){
		System.out.println("helo....!!!");
	}
}
class Sample2 extends Sample1{
	void check(){
		System.out.println("bye....!!!");
	}
}
class Main{
	public static void main(String[] args) {
		Sample2 s2=new Sample2();
		System.out.println(s2.a);
		s2.inherit();
		s2.test();
		s2.check();
	}
}