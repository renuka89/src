package com.jspiders.exceptions;

import java.sql.SQLException;

public class MethodOverriding {
void m()throws SQLException{
	System.out.println("m method...");
}
void n() throws RuntimeException{
	System.out.println("n method...");
}
}

class Example2 extends MethodOverriding{
	
	void m() throws NumberFormatException{
		
	}
	void n() throws ArrayIndexOutOfBoundsException{
		
	}
}