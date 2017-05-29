package com.jspiders.exceptions;

public class Sample1 {
	public static void main(String[] args) {
		System.out.println("with in main method...");
		try{
		int a=23/0;
		System.out.println(a);
		
		}catch(ArithmeticException e){
			
			System.out.println("exception is handled...");
	e.printStackTrace();
/*System.out.println(" it will print wich exception is occured and for what it occured :"+
	e);*/
System.out.println("getmessage will print only the reason to occur exception:  "+
	e.getMessage());
			
		}
		System.out.println("main ends...");
}
}