package com.jspiders.wrapperClass;

public class PrimitiveToWaper {

	public static void main(String args[])
	{  
		//Converting int into Integer 
		
	int a=20; 
	//boxing
		Integer i1=new Integer(a);//converting int into Integer
		
		Integer i=Integer.valueOf(a);//converting int into Integer  
		
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(a+" "+i+" "+j);
			
		
		Integer i3=new Integer( (int) 45.5);
		System.out.println(i3);
						
		double d=22.3;
		
		Double d1=new Double(d);//converting double  into Double
		
		Double d2=Double.valueOf(d);//converting double  into Double
		
		System.out.println(d1+"    "+d2);
		}
	}  
