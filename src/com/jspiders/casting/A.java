package com.jspiders.casting;

public abstract class A {
abstract void m();
abstract void n();
void text(){
	System.out.println("hii..");
}
void text1(){
	System.out.println("helo..");
}
}

  class B extends  A{
	@Override
	public void m() {
System.out.println("vipian..");		
	}

	@Override
	void n() {
		System.out.println("soumyadip..");
	}
	void test(){
		System.out.println("test..");
	}
}

  class Main2{
	  public static void main(String[] args) {
		A a=new B();
		a.m();
	}
  }