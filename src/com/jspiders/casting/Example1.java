package com.jspiders.casting;

public class Example1 {
void test1(){
	System.out.println("running test 1 method ");
}
void method1(){
	System.out.println("running method1");
}
}

class Example2 extends Example1{
	void test1(){
		System.out.println("running test 2 method ");

	}
	void method2(){
		System.out.println("running method1");
	}
}

class MainClss{
	public static void main(String[] args) {
		/*Example1 ex=new Example2(); //implicit upcasting
				ex.test1();*/
				
				Example2 e=new Example2();
				
				Example1 ex1=(Example1)e;	//upcasting
				
				ex1.test1();
				ex1.method1();
				
				Example2 e1=(Example2)ex1;   //downcasting
				
				e1.test1();
				
	}
}