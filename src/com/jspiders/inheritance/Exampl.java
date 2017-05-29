package com.jspiders.inheritance;

public class Exampl {
	int a=23;
	String st="xyz";
void m(){
	System.out.println("class 1");
}
}
class Exampl1 {
	void n(){
		System.out.println("class 2");
	}
}

class Exampl2 extends Exampl1{
	void zx(){
		System.out.println("class 3");
	}
	
	public static void main(String[] args) {
		Exampl2 ex3=new Exampl2();
		
		ex3.zx();
		ex3.n();
	}
}