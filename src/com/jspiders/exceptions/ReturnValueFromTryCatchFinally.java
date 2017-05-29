package com.jspiders.exceptions;
import java.lang.*;

public class ReturnValueFromTryCatchFinally {
	
	static int m(){
		try{
		System.exit(0);
		return 2/0;
		
		}catch(ArithmeticException ex){
			
System.out.println("with in catch block");
	
			//System.exit(0);
			ex.printStackTrace();
		return 2;
		}finally{
			System.out.println("finally block..");
		return 62;
		}
	}
	public static void main(String[] args) {
		
		System.out.println("with in main method");
		System.out.println(m());
		System.out.println("main ends..");
	}
}