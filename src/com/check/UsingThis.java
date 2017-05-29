package com.check;

public class UsingThis {
	
	double a=7;
	
	
	UsingThis(double d ){
		this("hii");//this statement

		this.a=d;//this keyword
		
		System.out.println("print double value :"+a);
	}
	
	UsingThis(int a){
		
		System.out.println("print a value :"+a);
	}
	UsingThis(String a){
		System.out.println("print a value :"+a);
	}
	/*public static void main(String[] args) {
		
		UsingThis this1=new UsingThis(5.5);
		
	}*/
	
}
