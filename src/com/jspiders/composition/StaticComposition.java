package com.jspiders.composition;

public class StaticComposition {
 int a=8;
 void test1(){
	System.out.println("running test1 method");
}
}
//-----------------
class Demo{
	int s=6;
	void disp(){
		System.out.println("running disp method");
		}
	
	static  StaticComposition ref=new StaticComposition();

}
class Main1{
	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d.s);
		d.disp();
		Demo.ref.test1();
		System.out.println(Demo.ref.a);
	}
}