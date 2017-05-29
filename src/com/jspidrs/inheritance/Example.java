package com.jspidrs.inheritance;

public class Example {
double dl=33.345;

void check(){
	System.out.println("check method...");
}
}


class Example1 extends Example implements Sample{

	@Override
	public void m() {
System.out.println("m method...");		
	}

	@Override
	public void n() {
System.out.println("n method...");		
	}
	public static void main(String[] args) {
		Example ex=new Example1(); //upcasting
		ex.check();
		
	}
}