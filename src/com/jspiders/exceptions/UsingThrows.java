package com.jspiders.exceptions;

import java.sql.SQLException;

public class UsingThrows {
	
	
	void xyx()throws SQLException,ArithmeticException{
		
		int a=12/0;
		System.out.println("method 1");
	}
	
	void n()throws Exception{
		System.out.println("n method...");
		
	}


void m() throws ArithmeticException, SQLException{
	xyx();
}

public static void main(String[] args) {   //throws ArithmeticException, SQLException {
	
	System.out.println("main method");
	UsingThrows c1=new UsingThrows();
			
	try {
		c1.m();
	} catch (ArithmeticException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}//caller method
	
	
	System.out.println("main ends");
	
	
}


}
