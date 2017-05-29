package com.abstaract;

public abstract class SimpleEx {
	int f=45;

	abstract void m();
	abstract void display();
	}

abstract class SimpleEx1 extends SimpleEx {

	@Override
	void m() {
System.out.println("method m()");		
	}
}

class SimpleEx2 extends SimpleEx1 {

	@Override
	void display() {
		System.out.println("method display()");		
	}

	
public static void main(String[] args) {
	
	SimpleEx ex1=new SimpleEx2();
	ex1.display();
	ex1.m();
}

}