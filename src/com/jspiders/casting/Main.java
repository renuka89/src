package com.jspiders.casting;

public class Main {
public static void main(String[] args) {
	
	Casting ref3=new Casting1();//upcasting
	
	ref3.samp();
	
	
	Casting ref=(Casting) new Casting1();//upcasting
ref.samp();

Casting1 ref1=(Casting1) ref;//downcasting
ref1.samp();
ref1.samp1();
}

}
