package com.jspiders.inheritance;

public class Exmp {
protected void test1(){
	System.out.println("test 1..");
}
}

class Exmp1 extends Exmp{
	void test2(){
		System.out.println("test2..");
	}
	
	public static void main(String[] args) {
		Exmp1 e1=new Exmp1();
		e1.test1();
		e1.test2();
	}
	}
class Exmp2 extends Exmp{
	void test3(){
		System.out.println("test3..");
	}
	public static void main(String[] args) {
		Exmp2 ex2=new Exmp2();
		ex2.test1();
		ex2.test3();
		
		
	}
}