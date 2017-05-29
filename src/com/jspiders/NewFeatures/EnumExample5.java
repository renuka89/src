package com.jspiders.NewFeatures;
//applying enum on switch statement
public class EnumExample5{ 
	
	enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY} 
	
	public static void main(String args[])
	{  
	Day day=Day.WEDNESDAY;  
	  
	switch(day){  
	
	case SUNDAY:   
	 System.out.println("sunday");  
	 break;  
	case MONDAY:   
	 System.out.println("monday");  
	 break;  
	default:  
	System.out.println("other day");  
	}  
	}}  