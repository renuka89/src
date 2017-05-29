package com.jspiders.exceptions;
//how to write exception in inheritance
public class Class2 {//extends UsingThrows{

	static void xyx() {

		System.out.println("method 1");
		try{

		int a=3/0;
}catch(ArithmeticException e){
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		//try{
		xyx();
		/*}catch(ArithmeticException e){
			
			e.printStackTrace();
		}*/
		
		System.out.println("main ends");
	}
	
	
}
