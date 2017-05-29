package com.UsingInterface;

public interface Sample {
	int a=34;
void m();
}
class A extends Sample1 implements Sample,B,C{
	public void m() {
System.out.println("m method....");		
	}

	@Override
	public void check() {
		System.out.println("check method...");
	}
	@Override
	public void n() {
System.out.println("n method..");		
	}
	public static void main(String[] args) {
		Sample s=new A();//upcasting 
		s.m();
		System.out.println("--------------------");
		B b=new A();
		b.check();
		System.out.println("--------------------");

		
		C c1=new A();
		c1.n();
		System.out.println("--------------------");

		A a=new A();
		a.display();
	}
}