package com.jspiders.exceptions;

public class ClasscastExp {
	/*In the above example, we are trying to cast an object of type ClasscastExp 
	to type Test. But, it doesn’t satisfy “IS-A” relationship. 
	i.e ClasscastExp is not of type Test. This will throw java.lang.ClassCastException.*/
	
	
	void method(){
		System.out.println("hey..");
	}
}

class Test extends ClasscastExp{
	void method1(){
		System.out.println("hii...");
	}
}

class main{
public static void main(String[] args) {
	//ClasscastExp ref=new Test();//upcasting
	
	Test t1=(Test)new ClasscastExp();//downcasting//throws class cast exception 
t1.method();
t1.method1();
	}
}