package com.abstaract;

public abstract class Example {
abstract void n();
abstract void x();
abstract void m();

}
class Example1 extends Example{

	@Override
	public void n() {
		System.out.println("method 1");
	}
	@Override
	void x() {
		System.out.println("method 2");
		}
	@Override
	void m() {
		System.out.println("method 3");
		
	}
	void test(){
		System.out.println("test mathod");
	}

	public static void main(String[] args) {
		Example ex1=new Example1();//upasting
		
		ex1.m();
			ex1.x();
			ex1.n();
	}	
	
}

