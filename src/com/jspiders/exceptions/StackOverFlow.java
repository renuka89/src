package com.jspiders.exceptions;

public class StackOverFlow {//StackOverFlow occured at run time..
	 static void check()
	    {
		 System.out.println("hii...");
		 Check1();
	    }
	     
	    static void Check1()
	    {
	        check();
	    }
	     
	    public static void main(String[] args) 
	    {
	        check();
	    }
}
