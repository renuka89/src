package com.jspiders.exceptions;

import java.lang.reflect.Method;

public class UsingClassDotForname {
		    public static void main(String[] args) //throws ClassNotFoundException 
	    {
	     try{  	    
	Class cl= Class.forName("com.jspiders.exceptions.UsingThrows");
	
String  classname=cl.getName();
	
	System.out.println("it will print fullyqualified class name :  "+classname);
	
	String classname1=cl.getSimpleName();
	System.out.println("it will print only class name:  "+classname1);
	
	Method[] m= cl.getMethods();
	
	System.out.println("number of methods present in Usingthrows classs : "+m.length);
	System.out.println("printing methods in UsingThrows class :");
	System.out.println("------------------------------------------");
	for (int i = 0; i < m.length; i++) {
		System.out.println(m[i]);
	}
	/*System.out.println(m[0]);
	System.out.println(m[1]);
	System.out.println(m[2]);
	
	     */
	    }catch(ClassNotFoundException e){
	    	e.printStackTrace();
	    }
		  
	    }
	    }

