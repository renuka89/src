package com.Interface;

public class Demo1  extends Demo implements Sample,Sample1{

	@Override
	public void m() {
		System.out.println("m method...");
	}

	@Override
	public void n() {
		System.out.println("n method...");
	}
	@Override
	public void test() {
		
System.out.println("test method....");	
}
	public static void main(String[] args) {
		
		//Demo1 d=new Demo1();
		// Sample d=new Demo1();//upcasting
		 
		Demo d=new Demo1();//upcasting
		
				d.display();
				
				//d.m();
				//d.n();
				//d.test();
	}

	

}
